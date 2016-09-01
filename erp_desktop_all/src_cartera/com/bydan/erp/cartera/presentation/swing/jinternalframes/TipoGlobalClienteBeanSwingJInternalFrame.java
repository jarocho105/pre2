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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.TipoGlobalClienteConstantesFunciones;
import com.bydan.erp.cartera.util.TipoGlobalClienteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoGlobalClienteParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoGlobalClienteBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoGlobalClienteBeanSwingJInternalFrame extends TipoGlobalClienteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoGlobalClienteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoGlobalCliente> tipoglobalclienteValidator = new ClassValidator<TipoGlobalCliente>(TipoGlobalCliente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoGlobalCliente tipoglobalcliente;	
	public TipoGlobalCliente tipoglobalclienteAux;
	public TipoGlobalCliente tipoglobalclienteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoGlobalCliente tipoglobalclienteTotales;
	public Long idTipoGlobalClienteActual;
	public Long iIdNuevoTipoGlobalCliente=0L;
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
	
	public Boolean isPermisoTodoTipoGlobalCliente;
	public Boolean isPermisoNuevoTipoGlobalCliente;
	public Boolean isPermisoActualizarTipoGlobalCliente;
	public Boolean isPermisoActualizarOriginalTipoGlobalCliente;
	public Boolean isPermisoEliminarTipoGlobalCliente;
	public Boolean isPermisoGuardarCambiosTipoGlobalCliente;
	public Boolean isPermisoConsultaTipoGlobalCliente;
	public Boolean isPermisoBusquedaTipoGlobalCliente;
	public Boolean isPermisoReporteTipoGlobalCliente;
	public Boolean isPermisoPaginacionMedioTipoGlobalCliente;
	public Boolean isPermisoPaginacionAltoTipoGlobalCliente;
	public Boolean isPermisoPaginacionTodoTipoGlobalCliente;
	public Boolean isPermisoCopiarTipoGlobalCliente;
	public Boolean isPermisoVerFormTipoGlobalCliente;
	public Boolean isPermisoDuplicarTipoGlobalCliente;
	public Boolean isPermisoOrdenTipoGlobalCliente;
	
	
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
	
	public TipoGlobalClienteParameterReturnGeneral tipoglobalclienteReturnGeneral;
	public TipoGlobalClienteParameterReturnGeneral tipoglobalclienteParameterGeneral;
	
	

	public DefinicionLogic definicionLogic=null;

	public DefinicionLogic getDefinicionLogic() {
		return definicionLogic;
	}

	public void setDefinicionLogic(DefinicionLogic definicionLogic) {
		this.definicionLogic = definicionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoGlobalCliente=false;
	public Boolean esParaAccionDesdeFormularioTipoGlobalCliente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoGlobalClienteLogic tipoglobalclienteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoGlobalCliente tipoglobalclienteBean;
	public TipoGlobalClienteConstantesFunciones tipoglobalclienteConstantesFunciones;
	//public TipoGlobalClienteParameterReturnGeneral tipoglobalclienteReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoGlobalCliente> tipoglobalclientes;	
	//public List<TipoGlobalCliente> tipoglobalclientesEliminados;
	//public List<TipoGlobalCliente> tipoglobalclientesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoGlobalCliente=false;
	public Boolean isVisibilidadCeldaDuplicarTipoGlobalCliente=true;
	public Boolean isVisibilidadCeldaCopiarTipoGlobalCliente=true;
	public Boolean isVisibilidadCeldaVerFormTipoGlobalCliente=true;
	public Boolean isVisibilidadCeldaOrdenTipoGlobalCliente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoGlobalCliente=false;
	public Boolean isVisibilidadCeldaModificarTipoGlobalCliente=false;
	public Boolean isVisibilidadCeldaActualizarTipoGlobalCliente=false;
	public Boolean isVisibilidadCeldaEliminarTipoGlobalCliente=false;
	public Boolean isVisibilidadCeldaCancelarTipoGlobalCliente=false;
	public Boolean isVisibilidadCeldaGuardarTipoGlobalCliente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoGlobalCliente=false;	
	
	
	
	public Long getiIdNuevoTipoGlobalCliente() {
		return this.iIdNuevoTipoGlobalCliente;
	}

	public void setiIdNuevoTipoGlobalCliente(Long iIdNuevoTipoGlobalCliente) {
		this.iIdNuevoTipoGlobalCliente = iIdNuevoTipoGlobalCliente;
	}
	
	public Long getidTipoGlobalClienteActual() {
		return this.idTipoGlobalClienteActual;
	}

	public void setidTipoGlobalClienteActual(Long idTipoGlobalClienteActual) {
		this.idTipoGlobalClienteActual = idTipoGlobalClienteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoGlobalCliente gettipoglobalcliente() {
		return this.tipoglobalcliente;
	}

	public void settipoglobalcliente(TipoGlobalCliente tipoglobalcliente) {
		this.tipoglobalcliente = tipoglobalcliente;
	}
	
	public TipoGlobalCliente gettipoglobalclienteAux() {
		return this.tipoglobalclienteAux;
	}

	public void settipoglobalclienteAux(TipoGlobalCliente tipoglobalclienteAux) {
		this.tipoglobalclienteAux = tipoglobalclienteAux;
	}				
	
	public TipoGlobalCliente gettipoglobalclienteAnterior() {
		return this.tipoglobalclienteAnterior;
	}

	public void settipoglobalclienteAnterior(TipoGlobalCliente tipoglobalclienteAnterior) {
		this.tipoglobalclienteAnterior = tipoglobalclienteAnterior;
	}	
	
	public TipoGlobalCliente gettipoglobalclienteTotales() {
		return this.tipoglobalclienteTotales;
	}

	public void settipoglobalclienteTotales(TipoGlobalCliente tipoglobalclienteTotales) {
		this.tipoglobalclienteTotales = tipoglobalclienteTotales;
	}	
	
	public TipoGlobalCliente gettipoglobalclienteBean() {
		return this.tipoglobalclienteBean;
	}

	public void settipoglobalclienteBean(TipoGlobalCliente tipoglobalclienteBean) {
		this.tipoglobalclienteBean = tipoglobalclienteBean;
	}	
	
	public TipoGlobalClienteParameterReturnGeneral gettipoglobalclienteReturnGeneral() {
		return this.tipoglobalclienteReturnGeneral;
	}

	public void settipoglobalclienteReturnGeneral(TipoGlobalClienteParameterReturnGeneral tipoglobalclienteReturnGeneral) {
		this.tipoglobalclienteReturnGeneral = tipoglobalclienteReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoGlobalClienteLogic getTipoGlobalClienteLogic()	{		
		return tipoglobalclienteLogic;
	}

	public void setTipoGlobalClienteLogic(TipoGlobalClienteLogic tipoglobalclienteLogic) {
		this.tipoglobalclienteLogic = tipoglobalclienteLogic;
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
	
	public Boolean getIsEsNuevoTipoGlobalCliente() {
		return isEsNuevoTipoGlobalCliente;
	}

	public void setIsEsNuevoTipoGlobalCliente(Boolean isEsNuevoTipoGlobalCliente) {
		this.isEsNuevoTipoGlobalCliente = isEsNuevoTipoGlobalCliente;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoGlobalCliente() {
		return esParaAccionDesdeFormularioTipoGlobalCliente;
	}
	
	public void setEsParaAccionDesdeFormularioTipoGlobalCliente(Boolean esParaAccionDesdeFormularioTipoGlobalCliente) {
		this.esParaAccionDesdeFormularioTipoGlobalCliente = esParaAccionDesdeFormularioTipoGlobalCliente;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoGlobalCliente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoGlobalClienteConstantesFunciones.refrescarForeignKeysDescripcionesTipoGlobalCliente(this.tipoglobalclienteLogic.getTipoGlobalClientes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoGlobalClienteConstantesFunciones.refrescarForeignKeysDescripcionesTipoGlobalCliente(this.tipoglobalclientes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoglobalclienteLogic.setTipoGlobalClientes(this.tipoglobalclientes);
			tipoglobalclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoGlobalClienteParameterReturnGeneral getTipoGlobalClienteParameterGeneral() {
		return this.tipoglobalclienteParameterGeneral;
	}
	
	public void setTipoGlobalClienteParameterGeneral(TipoGlobalClienteParameterReturnGeneral tipoglobalclienteParameterGeneral) {
		this.tipoglobalclienteParameterGeneral = tipoglobalclienteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoGlobalCliente() {
		return isPermisoTodoTipoGlobalCliente;
	}

	public void setIsPermisoTodoTipoGlobalCliente(Boolean isPermisoTodoTipoGlobalCliente) {
		this.isPermisoTodoTipoGlobalCliente = isPermisoTodoTipoGlobalCliente;
	}

	public Boolean getIsPermisoNuevoTipoGlobalCliente() {
		return isPermisoNuevoTipoGlobalCliente;
	}

	public void setIsPermisoNuevoTipoGlobalCliente(Boolean isPermisoNuevoTipoGlobalCliente) {
		this.isPermisoNuevoTipoGlobalCliente = isPermisoNuevoTipoGlobalCliente;
	}

	public Boolean getIsPermisoActualizarTipoGlobalCliente() {
		return isPermisoActualizarTipoGlobalCliente;
	}

	public void setIsPermisoActualizarTipoGlobalCliente(Boolean isPermisoActualizarTipoGlobalCliente) {
		this.isPermisoActualizarTipoGlobalCliente = isPermisoActualizarTipoGlobalCliente;
	}

	public Boolean getIsPermisoEliminarTipoGlobalCliente() {
		return isPermisoEliminarTipoGlobalCliente;
	}

	public void setIsPermisoEliminarTipoGlobalCliente(Boolean isPermisoEliminarTipoGlobalCliente) {
		this.isPermisoEliminarTipoGlobalCliente = isPermisoEliminarTipoGlobalCliente;
	}

	public Boolean getIsPermisoGuardarCambiosTipoGlobalCliente() {
		return isPermisoGuardarCambiosTipoGlobalCliente;
	}

	public void setIsPermisoGuardarCambiosTipoGlobalCliente(Boolean isPermisoGuardarCambiosTipoGlobalCliente) {
		this.isPermisoGuardarCambiosTipoGlobalCliente = isPermisoGuardarCambiosTipoGlobalCliente;
	}
	
	public Boolean getIsPermisoConsultaTipoGlobalCliente() {
		return isPermisoConsultaTipoGlobalCliente;
	}

	public void setIsPermisoConsultaTipoGlobalCliente(Boolean isPermisoConsultaTipoGlobalCliente) {
		this.isPermisoConsultaTipoGlobalCliente = isPermisoConsultaTipoGlobalCliente;
	}

	public Boolean getIsPermisoBusquedaTipoGlobalCliente() {
		return isPermisoBusquedaTipoGlobalCliente;
	}

	public void setIsPermisoBusquedaTipoGlobalCliente(Boolean isPermisoBusquedaTipoGlobalCliente) {
		this.isPermisoBusquedaTipoGlobalCliente = isPermisoBusquedaTipoGlobalCliente;
	}

	public Boolean getIsPermisoReporteTipoGlobalCliente() {
		return isPermisoReporteTipoGlobalCliente;
	}

	public void setIsPermisoReporteTipoGlobalCliente(Boolean isPermisoReporteTipoGlobalCliente) {
		this.isPermisoReporteTipoGlobalCliente = isPermisoReporteTipoGlobalCliente;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoGlobalCliente() {
		return isPermisoPaginacionMedioTipoGlobalCliente;
	}

	public void setIsPermisoPaginacionMedioTipoGlobalCliente(Boolean isPermisoPaginacionMedioTipoGlobalCliente) {
		this.isPermisoPaginacionMedioTipoGlobalCliente = isPermisoPaginacionMedioTipoGlobalCliente;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoGlobalCliente() {
		return isPermisoPaginacionTodoTipoGlobalCliente;
	}

	public void setIsPermisoPaginacionTodoTipoGlobalCliente(Boolean isPermisoPaginacionTodoTipoGlobalCliente) {
		this.isPermisoPaginacionTodoTipoGlobalCliente = isPermisoPaginacionTodoTipoGlobalCliente;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoGlobalCliente() {
		return isPermisoPaginacionAltoTipoGlobalCliente;
	}

	public void setIsPermisoPaginacionAltoTipoGlobalCliente(Boolean isPermisoPaginacionAltoTipoGlobalCliente) {
		this.isPermisoPaginacionAltoTipoGlobalCliente = isPermisoPaginacionAltoTipoGlobalCliente;
	}
	
	public Boolean getIsPermisoCopiarTipoGlobalCliente() {
		return isPermisoCopiarTipoGlobalCliente;
	}

	public void setIsPermisoCopiarTipoGlobalCliente(Boolean isPermisoCopiarTipoGlobalCliente) {
		this.isPermisoCopiarTipoGlobalCliente = isPermisoCopiarTipoGlobalCliente;
	}
	
	public Boolean getIsPermisoVerFormTipoGlobalCliente() {
		return isPermisoVerFormTipoGlobalCliente;
	}

	public void setIsPermisoVerFormTipoGlobalCliente(Boolean isPermisoVerFormTipoGlobalCliente) {
		this.isPermisoVerFormTipoGlobalCliente = isPermisoVerFormTipoGlobalCliente;
	}
	
	public Boolean getIsPermisoDuplicarTipoGlobalCliente() {
		return isPermisoDuplicarTipoGlobalCliente;
	}

	public void setIsPermisoDuplicarTipoGlobalCliente(Boolean isPermisoDuplicarTipoGlobalCliente) {
		this.isPermisoDuplicarTipoGlobalCliente = isPermisoDuplicarTipoGlobalCliente;
	}
	
	public Boolean getIsPermisoOrdenTipoGlobalCliente() {
		return isPermisoOrdenTipoGlobalCliente;
	}

	public void setIsPermisoOrdenTipoGlobalCliente(Boolean isPermisoOrdenTipoGlobalCliente) {
		this.isPermisoOrdenTipoGlobalCliente = isPermisoOrdenTipoGlobalCliente;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoGlobalCliente() {
		return isVisibilidadCeldaNuevoTipoGlobalCliente;
	}

	public void setIsVisibilidadCeldaNuevoTipoGlobalCliente(Boolean isVisibilidadCeldaNuevoTipoGlobalCliente) {
		this.isVisibilidadCeldaNuevoTipoGlobalCliente = isVisibilidadCeldaNuevoTipoGlobalCliente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoGlobalCliente() {
		return isVisibilidadCeldaDuplicarTipoGlobalCliente;
	}

	public void setIsVisibilidadCeldaDuplicarTipoGlobalCliente(Boolean isVisibilidadCeldaDuplicarTipoGlobalCliente) {
		this.isVisibilidadCeldaDuplicarTipoGlobalCliente = isVisibilidadCeldaDuplicarTipoGlobalCliente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoGlobalCliente() {
		return isVisibilidadCeldaCopiarTipoGlobalCliente;
	}

	public void setIsVisibilidadCeldaCopiarTipoGlobalCliente(Boolean isVisibilidadCeldaCopiarTipoGlobalCliente) {
		this.isVisibilidadCeldaCopiarTipoGlobalCliente = isVisibilidadCeldaCopiarTipoGlobalCliente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoGlobalCliente() {
		return isVisibilidadCeldaVerFormTipoGlobalCliente;
	}

	public void setIsVisibilidadCeldaVerFormTipoGlobalCliente(Boolean isVisibilidadCeldaVerFormTipoGlobalCliente) {
		this.isVisibilidadCeldaVerFormTipoGlobalCliente = isVisibilidadCeldaVerFormTipoGlobalCliente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoGlobalCliente() {
		return isVisibilidadCeldaOrdenTipoGlobalCliente;
	}

	public void setIsVisibilidadCeldaOrdenTipoGlobalCliente(Boolean isVisibilidadCeldaOrdenTipoGlobalCliente) {
		this.isVisibilidadCeldaOrdenTipoGlobalCliente = isVisibilidadCeldaOrdenTipoGlobalCliente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoGlobalCliente() {
		return isVisibilidadCeldaNuevoRelacionesTipoGlobalCliente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoGlobalCliente(Boolean isVisibilidadCeldaNuevoRelacionesTipoGlobalCliente) {
		this.isVisibilidadCeldaNuevoRelacionesTipoGlobalCliente = isVisibilidadCeldaNuevoRelacionesTipoGlobalCliente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoGlobalCliente() {
		return isVisibilidadCeldaModificarTipoGlobalCliente;
	}

	public void setIsVisibilidadCeldaModificarTipoGlobalCliente(Boolean isVisibilidadCeldaModificarTipoGlobalCliente) {
		this.isVisibilidadCeldaModificarTipoGlobalCliente = isVisibilidadCeldaModificarTipoGlobalCliente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoGlobalCliente() {
		return isVisibilidadCeldaActualizarTipoGlobalCliente;
	}

	public void setIsVisibilidadCeldaActualizarTipoGlobalCliente(Boolean isVisibilidadCeldaActualizarTipoGlobalCliente) {
		this.isVisibilidadCeldaActualizarTipoGlobalCliente = isVisibilidadCeldaActualizarTipoGlobalCliente;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoGlobalCliente() {
		return isVisibilidadCeldaEliminarTipoGlobalCliente;
	}

	public void setIsVisibilidadCeldaEliminarTipoGlobalCliente(Boolean isVisibilidadCeldaEliminarTipoGlobalCliente) {
		this.isVisibilidadCeldaEliminarTipoGlobalCliente = isVisibilidadCeldaEliminarTipoGlobalCliente;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoGlobalCliente() {
		return isVisibilidadCeldaCancelarTipoGlobalCliente;
	}

	public void setIsVisibilidadCeldaCancelarTipoGlobalCliente(Boolean isVisibilidadCeldaCancelarTipoGlobalCliente) {
		this.isVisibilidadCeldaCancelarTipoGlobalCliente = isVisibilidadCeldaCancelarTipoGlobalCliente;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoGlobalCliente() {
		return isVisibilidadCeldaGuardarTipoGlobalCliente;
	}

	public void setIsVisibilidadCeldaGuardarTipoGlobalCliente(Boolean isVisibilidadCeldaGuardarTipoGlobalCliente) {
		this.isVisibilidadCeldaGuardarTipoGlobalCliente = isVisibilidadCeldaGuardarTipoGlobalCliente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoGlobalCliente() {
		return isVisibilidadCeldaGuardarCambiosTipoGlobalCliente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoGlobalCliente(Boolean isVisibilidadCeldaGuardarCambiosTipoGlobalCliente) {
		this.isVisibilidadCeldaGuardarCambiosTipoGlobalCliente = isVisibilidadCeldaGuardarCambiosTipoGlobalCliente;
	}
		
	public TipoGlobalClienteSessionBean gettipoglobalclienteSessionBean() {
		return this.tipoglobalclienteSessionBean;
	}
	
	public void settipoglobalclienteSessionBean(TipoGlobalClienteSessionBean tipoglobalclienteSessionBean) {
		this.tipoglobalclienteSessionBean=tipoglobalclienteSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoGlobalCliente(TipoGlobalCliente tipoglobalcliente)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoGlobalCliente tipoglobalcliente,TipoGlobalCliente tipoglobalclienteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoGlobalCliente(tipoglobalcliente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoglobalclienteAux.setId(tipoglobalcliente.getId());
		tipoglobalclienteAux.setVersionRow(tipoglobalcliente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoGlobalCliente();
		
			int intSelectedRow = this.jTableDatosTipoGlobalCliente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoGlobalClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoGlobalCliente(this.tipoglobalcliente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGlobalCliente(this.tipoglobalcliente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoglobalclienteValidator.getInvalidValues(this.tipoglobalcliente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoglobalclienteLogic.setDatosCliente(datosCliente);
			tipoglobalclienteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoglobalclienteAux=new  TipoGlobalCliente();
				
				tipoglobalclienteAux.setIsNew(true);
				tipoglobalclienteAux.setIsChanged(true);
				
				tipoglobalclienteAux.setTipoGlobalClienteOriginal(this.tipoglobalcliente);
				
				tipoglobalclienteAux.setId(this.tipoglobalcliente.getId());	
				tipoglobalclienteAux.setVersionRow(this.tipoglobalcliente.getVersionRow());	
				tipoglobalclienteAux.setcodigo(this.tipoglobalcliente.getcodigo());	
				tipoglobalclienteAux.setnombre(this.tipoglobalcliente.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoglobalclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoglobalclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoglobalclienteAux,tipoglobalclienteLogic.getTipoGlobalClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoglobalclienteAux,tipoglobalclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoglobalclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoglobalclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoglobalclienteLogic.saveTipoGlobalClientes();//WithConnection
						//tipoglobalclienteLogic.getSetVersionRowTipoGlobalClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoglobalcliente,tipoglobalclienteAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoglobalclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoglobalclienteAux=new  TipoGlobalCliente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoglobalclienteSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoglobalclienteSessionBean.getEsGuardarRelacionado() && this.tipoglobalcliente.getId()>=0)) {
						
					tipoglobalclienteAux.setIsNew(false);
				}
				
				tipoglobalclienteAux.setIsDeleted(false);
			
				tipoglobalclienteAux.setId(this.tipoglobalcliente.getId());	
				tipoglobalclienteAux.setVersionRow(this.tipoglobalcliente.getVersionRow());	
				tipoglobalclienteAux.setcodigo(this.tipoglobalcliente.getcodigo());	
				tipoglobalclienteAux.setnombre(this.tipoglobalcliente.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoglobalclienteAux,tipoglobalclienteLogic.getTipoGlobalClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoglobalclienteAux,tipoglobalclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoglobalclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoglobalclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoglobalclienteLogic.saveTipoGlobalClientes();//WithConnection
						//tipoglobalclienteLogic.getSetVersionRowTipoGlobalClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoglobalcliente,tipoglobalclienteAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoglobalclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoglobalclienteAux=new  TipoGlobalCliente();
				
				tipoglobalclienteAux.setIsNew(false);
				tipoglobalclienteAux.setIsChanged(false);
				
				tipoglobalclienteAux.setIsDeleted(true);
				
				tipoglobalclienteAux.setId(this.tipoglobalcliente.getId());	
				tipoglobalclienteAux.setVersionRow(this.tipoglobalcliente.getVersionRow());	
				tipoglobalclienteAux.setcodigo(this.tipoglobalcliente.getcodigo());	
				tipoglobalclienteAux.setnombre(this.tipoglobalcliente.getnombre());	
				
				if(this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoglobalclienteAux.getId()>=0) {	
						this.tipoglobalclientesEliminados.add(tipoglobalclienteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoglobalclienteAux,tipoglobalclienteLogic.getTipoGlobalClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoglobalclienteAux,tipoglobalclientes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoglobalclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoglobalclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoglobalclienteLogic.saveTipoGlobalClientes();//WithConnection
						//tipoglobalclienteLogic.getSetVersionRowTipoGlobalClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoglobalclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoglobalclienteAux.setDefinicions(this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoglobalclienteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoglobalclienteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoglobalclienteAux,tipoglobalclienteLogic.getTipoGlobalClientes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoglobalclienteAux,tipoglobalclientes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalclienteLogic.getTipoGlobalClientes().addAll(this.tipoglobalclientesEliminados);
					
					tipoglobalclienteLogic.saveTipoGlobalClientes();//WithConnection
					//tipoglobalclienteLogic.getSetVersionRowTipoGlobalClientes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoglobalclientesEliminados= new ArrayList<TipoGlobalCliente>();		
			}
			
			if(this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Global Cliente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Global Cliente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoglobalcliente=tipoglobalclienteAux;
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
      		//this.finishProcessTipoGlobalCliente();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoGlobalCliente tipoglobalclienteLocal) throws Exception {
		
		if(this.tipoglobalclienteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoglobalclienteLocal.setDefinicions(this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
			
			} else {
			
				tipoglobalclienteLocal.setDefinicions(this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame.definicions);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoGlobalCliente tipoglobalclienteLocal) throws Exception {	
		if(this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoGlobalClienteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoGlobalCliente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoglobalclienteValidator.getInvalidValues(this.tipoglobalcliente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoGlobalCliente tipoglobalcliente,List<TipoGlobalCliente> tipoglobalclientes) throws Exception {
		try	{		
			TipoGlobalClienteConstantesFunciones.actualizarLista(tipoglobalcliente,tipoglobalclientes,this.tipoglobalclienteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoGlobalCliente tipoglobalcliente,List<TipoGlobalCliente> tipoglobalclientes) throws Exception {
		try	{			
			TipoGlobalClienteConstantesFunciones.actualizarSelectedLista(tipoglobalcliente,tipoglobalclientes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoGlobalCliente> tipoglobalclientesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoglobalclientesLocal=this.tipoglobalclienteLogic.getTipoGlobalClientes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoglobalclientesLocal=this.tipoglobalclientes;
			}
			//ARCHITECTURE
		
			for(TipoGlobalCliente tipoglobalclienteLocal:tipoglobalclientesLocal) {
				if(this.permiteMantenimiento(tipoglobalclienteLocal) && tipoglobalclienteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoGlobalClienteConstantesFunciones.getTipoGlobalClienteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoGlobalClienteConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGlobalCliente.jLabelcodigoTipoGlobalCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoGlobalClienteConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGlobalCliente.jLabelnombreTipoGlobalCliente,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGlobalCliente.jLabelcodigoTipoGlobalCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGlobalCliente.jLabelnombreTipoGlobalCliente,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Definicion")) {
			if(this.tipoglobalcliente==null) {
				this.tipoglobalcliente= new TipoGlobalCliente();
			}

			if(this.tipoglobalclienteSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoGlobalCliente
				this.setVariablesFormularioToObjetoActualTipoGlobalCliente(this.tipoglobalcliente,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGlobalCliente(this.tipoglobalcliente);

				this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame.getdefinicion().setTipoGlobalCliente(this.tipoglobalcliente);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoGlobalCliente--;	
		
		
		this.tipoglobalclienteAux=new TipoGlobalCliente();
		
		this.tipoglobalclienteAux.setId(this.iIdNuevoTipoGlobalCliente);
		this.tipoglobalclienteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoglobalclienteLogic.getTipoGlobalClientes().add(this.tipoglobalclienteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoglobalclientes.add(this.tipoglobalclienteAux);
		}
		//ARCHITECTURE
		
		this.tipoglobalcliente=this.tipoglobalclienteAux;
		
		if(TipoGlobalClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoGlobalCliente(this.tipoglobalcliente);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoGlobalCliente(this.tipoglobalcliente);
		}
				
		//this.setDefaultControlesTipoGlobalCliente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoGlobalCliente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoGlobalCliente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGlobalCliente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoGlobalCliente(this.tipoglobalclienteBean,this.tipoglobalcliente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoGlobalCliente(this.tipoglobalcliente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoglobalclienteSessionBean.getConGuardarRelaciones()) {
			classes=TipoGlobalClienteConstantesFunciones.getClassesRelationshipsOfTipoGlobalCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoglobalclienteReturnGeneral=tipoglobalclienteLogic.procesarEventosTipoGlobalClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoglobalclienteLogic.getTipoGlobalClientes(),this.tipoglobalcliente,this.tipoglobalclienteParameterGeneral,this.isEsNuevoTipoGlobalCliente,classes);//this.tipoglobalclienteLogic.getTipoGlobalCliente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoGlobalCliente(this.tipoglobalclienteReturnGeneral,this.tipoglobalclienteBean,false);
		
		if(this.tipoglobalclienteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoGlobalCliente(this.tipoglobalclienteReturnGeneral.getTipoGlobalCliente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoGlobalCliente(this.tipoglobalclienteReturnGeneral.getTipoGlobalCliente());
		}
		
		if(this.tipoglobalclienteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoGlobalCliente(this.tipoglobalclienteReturnGeneral.getTipoGlobalCliente(),classes);//this.tipoglobalclienteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoGlobalCliente(this.tipoglobalcliente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoGlobalCliente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoGlobalCliente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoGlobalCliente(false);
						
			if(tipoglobalclienteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame.definicionSessionBean.getEsGuardarRelacionado() && DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDefinicionActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoGlobalClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGlobalCliente();
			}
			
			this.actualizarVisualTableDatosTipoGlobalCliente();
			
			this.jTableDatosTipoGlobalCliente.setRowSelectionInterval(this.getIndiceNuevoTipoGlobalCliente(), this.getIndiceNuevoTipoGlobalCliente());
			
			this.seleccionarFilaTablaTipoGlobalClienteActual();
						
			this.actualizarEstadoCeldasBotonesTipoGlobalCliente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoGlobalCliente(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldcodigoTipoGlobalCliente.setEnabled(isHabilitar && this.tipoglobalclienteConstantesFunciones.activarcodigoTipoGlobalCliente);
		this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldnombreTipoGlobalCliente.setEnabled(isHabilitar && this.tipoglobalclienteConstantesFunciones.activarnombreTipoGlobalCliente);	
		
	};
	
	public void setDefaultControlesTipoGlobalCliente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoGlobalCliente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoglobalclienteSessionBean.setConGuardarRelaciones(true);			
			this.tipoglobalclienteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoGlobalCliente.jTabbedPaneRelacionesTipoGlobalCliente.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame.definicionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoglobalclienteSessionBean.setConGuardarRelaciones(false);			
			this.tipoglobalclienteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoGlobalCliente.jTabbedPaneRelacionesTipoGlobalCliente.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame.definicionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoGlobalCliente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGlobalCliente tipoglobalclienteAux:this.tipoglobalclienteLogic.getTipoGlobalClientes()) {
				if(tipoglobalclienteAux.getId().equals(this.iIdNuevoTipoGlobalCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGlobalCliente tipoglobalclienteAux:this.tipoglobalclientes) {
				if(tipoglobalclienteAux.getId().equals(this.iIdNuevoTipoGlobalCliente)) {
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
	
	public int getIndiceActualTipoGlobalCliente(TipoGlobalCliente tipoglobalcliente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGlobalCliente tipoglobalclienteAux:this.tipoglobalclienteLogic.getTipoGlobalClientes()) {
				if(tipoglobalclienteAux.getId().equals(tipoglobalcliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGlobalCliente tipoglobalclienteAux:this.tipoglobalclientes) {
				if(tipoglobalclienteAux.getId().equals(tipoglobalcliente.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoGlobalCliente(TipoGlobalCliente tipoglobalclienteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGlobalCliente tipoglobalclienteAux:this.tipoglobalclienteLogic.getTipoGlobalClientes()) {
				if(tipoglobalclienteAux.getTipoGlobalClienteOriginal().getId().equals(tipoglobalclienteOriginal.getId())) {
					existe=true;
					tipoglobalclienteOriginal.setId(tipoglobalclienteAux.getId());
					tipoglobalclienteOriginal.setVersionRow(tipoglobalclienteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGlobalCliente tipoglobalclienteAux:this.tipoglobalclientes) {
				if(tipoglobalclienteAux.getTipoGlobalClienteOriginal().getId().equals(tipoglobalclienteOriginal.getId())) {
					existe=true;
					tipoglobalclienteOriginal.setId(tipoglobalclienteAux.getId());
					tipoglobalclienteOriginal.setVersionRow(tipoglobalclienteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoGlobalCliente(Boolean esParaCancelar) throws Exception {
		tipoglobalclientesAux=new ArrayList<TipoGlobalCliente>();
		tipoglobalclienteAux=new TipoGlobalCliente();
		
		if(!this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoGlobalCliente tipoglobalclienteAux:this.tipoglobalclienteLogic.getTipoGlobalClientes()) {
					if(tipoglobalclienteAux.getId()<0) {
						tipoglobalclientesAux.add(tipoglobalclienteAux);
					}		
				}
				this.iIdNuevoTipoGlobalCliente=0L;
				this.tipoglobalclienteLogic.getTipoGlobalClientes().removeAll(tipoglobalclientesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGlobalCliente tipoglobalclienteAux:this.tipoglobalclientes) {
					if(tipoglobalclienteAux.getId()<0) {
						tipoglobalclientesAux.add(tipoglobalclienteAux);
					}		
				}
				this.iIdNuevoTipoGlobalCliente=0L;
				this.tipoglobalclientes.removeAll(tipoglobalclientesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoGlobalCliente 
					&& this.tipoglobalclienteLogic.getTipoGlobalClientes().size()>0
					) {
					tipoglobalclienteAux=this.tipoglobalclienteLogic.getTipoGlobalClientes().get(this.tipoglobalclienteLogic.getTipoGlobalClientes().size() - 1);
				
					if(tipoglobalclienteAux.getId()<0) {
						this.tipoglobalclienteLogic.getTipoGlobalClientes().remove(tipoglobalclienteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoGlobalCliente && this.tipoglobalclientes.size()>0) {
					tipoglobalclienteAux=this.tipoglobalclientes.get(this.tipoglobalclientes.size() - 1);
				
					if(tipoglobalclienteAux.getId()<0) {
						this.tipoglobalclientes.remove(tipoglobalclienteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoGlobalCliente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoglobalcliente.getId()<0) {
				this.tipoglobalclienteLogic.getTipoGlobalClientes().remove(this.tipoglobalcliente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoglobalcliente.getId()<0) {
				this.tipoglobalclientes.remove(this.tipoglobalcliente);
			}
		}			
	}
	
	public void setEstadosInicialesTipoGlobalCliente(List<TipoGlobalCliente> tipoglobalclientesAux) throws Exception {
		TipoGlobalClienteConstantesFunciones.setEstadosInicialesTipoGlobalCliente(tipoglobalclientesAux);
	}
	
	public void setEstadosInicialesTipoGlobalCliente(TipoGlobalCliente tipoglobalclienteAux) throws Exception {
		TipoGlobalClienteConstantesFunciones.setEstadosInicialesTipoGlobalCliente(tipoglobalclienteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoGlobalClienteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoGlobalCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoGlobalClienteActual()) {
				if(!this.isEsNuevoTipoGlobalCliente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoGlobalCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoGlobalCliente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoGlobalClienteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Global Cliente ?", "MANTENIMIENTO DE Tipo Global Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoGlobalCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoGlobalCliente tipoglobalcliente) throws Exception {
		TipoGlobalClienteConstantesFunciones.seleccionarAsignar(this.tipoglobalcliente,tipoglobalcliente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoGlobalCliente=this.isPermisoActualizarOriginalTipoGlobalCliente;
			
			
			this.seleccionarAsignar(tipoglobalcliente);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoGlobalClienteConstantesFunciones.quitarEspaciosTipoGlobalCliente(this.tipoglobalcliente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoGlobalCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoglobalclienteSessionBean.setsFuncionBusquedaRapida(this.tipoglobalclienteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoGlobalCliente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoGlobalCliente(esParaCancelar);				
				this.cancelarNuevoTipoGlobalCliente(esParaCancelar);								
			}
			
			this.tipoglobalcliente=new TipoGlobalCliente();
			
			this.inicializarTipoGlobalCliente();
			
			this.actualizarEstadoCeldasBotonesTipoGlobalCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoGlobalCliente() throws Exception {
		try {
			TipoGlobalClienteConstantesFunciones.inicializarTipoGlobalCliente(this.tipoglobalcliente);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoglobalclienteLogic.getTipoGlobalClientes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoGlobalClientes(String sAccionBusqueda,List<TipoGlobalCliente> tipoglobalclientesParaReportes) throws Exception {
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
					sPathReporteFinal="TipoGlobalCliente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoGlobalClienteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoGlobalClienteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoGlobalCliente"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Global Clientees");		
		parameters.put("busquedapor", TipoGlobalClienteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
					
					TipoGlobalClienteLogic tipoglobalclienteLogicAuxiliar=new TipoGlobalClienteLogic();
					tipoglobalclienteLogicAuxiliar.setDatosCliente(tipoglobalclienteLogic.getDatosCliente());				
					tipoglobalclienteLogicAuxiliar.setTipoGlobalClientes(tipoglobalclientesParaReportes);
					
					tipoglobalclienteLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoGlobalClienteWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoglobalclientesParaReportes=tipoglobalclienteLogicAuxiliar.getTipoGlobalClientes();
					
					//tipoglobalclienteLogic.getNewConnexionToDeep();
					
					//for (TipoGlobalCliente tipoglobalcliente:tipoglobalclientesParaReportes) {
					//	tipoglobalclienteLogic.deepLoad(tipoglobalcliente, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoglobalclienteLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoglobalclienteLogic.closeNewConnexionToDeep();
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoGlobalCliente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoGlobalClienteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoGlobalClienteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoGlobalCliente=new JRBeanArrayDataSource(TipoGlobalClienteJInternalFrame.TraerTipoGlobalClienteBeans(tipoglobalclientesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoGlobalCliente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoGlobalClienteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoGlobalClienteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoGlobalClienteBean.TraerTipoGlobalClienteBeans(tipoglobalclientesParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoGlobalClientes(sAccionBusqueda,sTipoArchivoReporte,tipoglobalclientesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoGlobalClientes(sAccionBusqueda,sTipoArchivoReporte,tipoglobalclientesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoGlobalClienteActionPerformed(null);
					//this.generarExcelReporteTipoGlobalClientes(sAccionBusqueda,sTipoArchivoReporte,tipoglobalclientesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoGlobalClientes(sAccionBusqueda,sTipoArchivoReporte,tipoglobalclientesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoGlobalClientes(sAccionBusqueda,sTipoArchivoReporte,tipoglobalclientesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoGlobalClientes(sAccionBusqueda,sTipoArchivoReporte,tipoglobalclientesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoGlobalClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGlobalCliente> tipoglobalclientesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoglobalcliente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGlobalClientes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoGlobalCliente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoGlobalCliente tipoglobalcliente : tipoglobalclientesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoGlobalClienteConstantesFunciones.generarExcelReporteDataTipoGlobalCliente("NORMAL",row,workbook,tipoglobalcliente,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Global Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoGlobalCliente(String sTipo,Row row,Workbook workbook) {
		
		TipoGlobalClienteConstantesFunciones.generarExcelReporteHeaderTipoGlobalCliente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoGlobalClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGlobalCliente> tipoglobalclientesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoglobalcliente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGlobalClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoGlobalCliente tipoglobalcliente : tipoglobalclientesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoGlobalClienteConstantesFunciones.getTipoGlobalClienteDescripcion(tipoglobalcliente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGlobalClienteConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGlobalClienteConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoglobalcliente.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGlobalClienteConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGlobalClienteConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoglobalcliente.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Global Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoGlobalClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGlobalCliente> tipoglobalclientesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoGlobalCliente> tipoglobalclientesRespaldo=null;
		
		classes=TipoGlobalClienteConstantesFunciones.getClassesRelationshipsOfTipoGlobalCliente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoglobalclienteLogic.setDatosCliente(this.datosCliente);
		this.tipoglobalclienteLogic.setDatosDeep(this.datosDeep);
		this.tipoglobalclienteLogic.setIsConDeep(true);
		
		tipoglobalclientesRespaldo=this.tipoglobalclienteLogic.getTipoGlobalClientes();
		
		this.tipoglobalclienteLogic.setTipoGlobalClientes(tipoglobalclientesParaReportes);	
		this.tipoglobalclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoglobalclientesParaReportes=this.tipoglobalclienteLogic.getTipoGlobalClientes();
		this.tipoglobalclienteLogic.setTipoGlobalClientes(tipoglobalclientesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoglobalcliente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGlobalClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoGlobalCliente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoGlobalCliente tipoglobalcliente : tipoglobalclientesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoGlobalCliente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoGlobalClienteConstantesFunciones.generarExcelReporteDataTipoGlobalCliente("NORMAL",row,workbook,tipoglobalcliente,cellStyleDataAux);
		
			
			


				//Definicion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DefinicionConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoglobalcliente.getDefinicions()!=null && tipoglobalcliente.getDefinicions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DefinicionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DefinicionConstantesFunciones.generarExcelReporteHeaderDefinicion("RELACIONADO",row,workbook);
				}

				if(tipoglobalcliente.getDefinicions()!=null) {
					i2=0;
					for(Definicion definicion : tipoglobalcliente.getDefinicions()) {
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
		cell.setCellValue(TipoGlobalClienteConstantesFunciones.getTipoGlobalClienteDescripcion(tipoglobalcliente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Global Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoGlobalCliente() throws Exception {		
		this.startProcessTipoGlobalCliente(true);
	}
	
	public void startProcessTipoGlobalCliente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoGlobalCliente, this.jScrollPanelDatosTipoGlobalCliente,this.jPanelPaginacionTipoGlobalCliente, this.jScrollPanelDatosEdicionTipoGlobalCliente, this.jPanelAccionesTipoGlobalCliente,this.jPanelAccionesFormularioTipoGlobalCliente,this.jmenuBarTipoGlobalCliente,this.jmenuBarDetalleTipoGlobalCliente,this.jTtoolBarTipoGlobalCliente,this.jTtoolBarDetalleTipoGlobalCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoGlobalCliente=null; 
		
		final JPanel jPanelParametrosReportesTipoGlobalCliente=this.jPanelParametrosReportesTipoGlobalCliente;
		//final JScrollPane jScrollPanelDatosTipoGlobalCliente=this.jScrollPanelDatosTipoGlobalCliente;
		final JTable jTableDatosTipoGlobalCliente=this.jTableDatosTipoGlobalCliente;		
		final JPanel jPanelPaginacionTipoGlobalCliente=this.jPanelPaginacionTipoGlobalCliente;
		//final JScrollPane jScrollPanelDatosEdicionTipoGlobalCliente=this.jScrollPanelDatosEdicionTipoGlobalCliente;
		final JPanel jPanelAccionesTipoGlobalCliente=this.jPanelAccionesTipoGlobalCliente;
		
		JPanel jPanelCamposAuxiliarTipoGlobalCliente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoGlobalCliente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) {
			jPanelCamposAuxiliarTipoGlobalCliente=this.jInternalFrameDetalleFormTipoGlobalCliente.jPanelCamposTipoGlobalCliente;
			jPanelAccionesFormularioAuxiliarTipoGlobalCliente=this.jInternalFrameDetalleFormTipoGlobalCliente.jPanelAccionesFormularioTipoGlobalCliente;
		}
		
		final JPanel jPanelCamposTipoGlobalCliente=jPanelCamposAuxiliarTipoGlobalCliente;
		final JPanel jPanelAccionesFormularioTipoGlobalCliente=jPanelAccionesFormularioAuxiliarTipoGlobalCliente;
		
		
		final JMenuBar jmenuBarTipoGlobalCliente=this.jmenuBarTipoGlobalCliente;
		final JToolBar jTtoolBarTipoGlobalCliente=this.jTtoolBarTipoGlobalCliente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoGlobalCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoGlobalCliente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) {
			jmenuBarDetalleAuxiliarTipoGlobalCliente=this.jInternalFrameDetalleFormTipoGlobalCliente.jmenuBarDetalleTipoGlobalCliente;
			jTtoolBarDetalleAuxiliarTipoGlobalCliente=this.jInternalFrameDetalleFormTipoGlobalCliente.jTtoolBarDetalleTipoGlobalCliente;
		}
		
		final JMenuBar jmenuBarDetalleTipoGlobalCliente=jmenuBarDetalleAuxiliarTipoGlobalCliente;
		final JToolBar jTtoolBarDetalleTipoGlobalCliente=jTtoolBarDetalleAuxiliarTipoGlobalCliente;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoGlobalCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoGlobalCliente;
			processRunnable.jTableDatos=jTableDatosTipoGlobalCliente;
			processRunnable.jPanelCampos=jPanelCamposTipoGlobalCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoGlobalCliente;
			processRunnable.jPanelAcciones=jPanelAccionesTipoGlobalCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoGlobalCliente;
			
			
			processRunnable.jmenuBar=jmenuBarTipoGlobalCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoGlobalCliente;
			processRunnable.jTtoolBar=jTtoolBarTipoGlobalCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoGlobalCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoGlobalCliente ,jPanelParametrosReportesTipoGlobalCliente,jTableDatosTipoGlobalCliente, /*jScrollPanelDatosTipoGlobalCliente,*/jPanelCamposTipoGlobalCliente,jPanelPaginacionTipoGlobalCliente, /*jScrollPanelDatosEdicionTipoGlobalCliente,*/ jPanelAccionesTipoGlobalCliente,jPanelAccionesFormularioTipoGlobalCliente,jmenuBarTipoGlobalCliente,jmenuBarDetalleTipoGlobalCliente,jTtoolBarTipoGlobalCliente,jTtoolBarDetalleTipoGlobalCliente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoGlobalCliente, jScrollPanelDatosTipoGlobalCliente,jPanelPaginacionTipoGlobalCliente, jScrollPanelDatosEdicionTipoGlobalCliente, jPanelAccionesTipoGlobalCliente,jPanelAccionesFormularioTipoGlobalCliente,jmenuBarTipoGlobalCliente,jmenuBarDetalleTipoGlobalCliente,jTtoolBarTipoGlobalCliente,jTtoolBarDetalleTipoGlobalCliente);
						
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
	
	public void finishProcessTipoGlobalCliente() {// throws Exception 
		this.finishProcessTipoGlobalCliente(true);
	}
	
	public void finishProcessTipoGlobalCliente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoGlobalCliente, this.jScrollPanelDatosTipoGlobalCliente,this.jPanelPaginacionTipoGlobalCliente, this.jScrollPanelDatosEdicionTipoGlobalCliente, this.jPanelAccionesTipoGlobalCliente,this.jPanelAccionesFormularioTipoGlobalCliente,this.jmenuBarTipoGlobalCliente,this.jmenuBarDetalleTipoGlobalCliente,this.jTtoolBarTipoGlobalCliente,this.jTtoolBarDetalleTipoGlobalCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoGlobalCliente=null; 
		
		final JPanel jPanelParametrosReportesTipoGlobalCliente=this.jPanelParametrosReportesTipoGlobalCliente;
		//final JScrollPane jScrollPanelDatosTipoGlobalCliente=this.jScrollPanelDatosTipoGlobalCliente;
		final JTable jTableDatosTipoGlobalCliente=this.jTableDatosTipoGlobalCliente;		
		final JPanel jPanelPaginacionTipoGlobalCliente=this.jPanelPaginacionTipoGlobalCliente;
		//final JScrollPane jScrollPanelDatosEdicionTipoGlobalCliente=this.jScrollPanelDatosEdicionTipoGlobalCliente;
		final JPanel jPanelAccionesTipoGlobalCliente=this.jPanelAccionesTipoGlobalCliente;
		
		JPanel jPanelCamposAuxiliarTipoGlobalCliente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoGlobalCliente=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) {
			jPanelCamposAuxiliarTipoGlobalCliente=this.jInternalFrameDetalleFormTipoGlobalCliente.jPanelCamposTipoGlobalCliente;
			jPanelAccionesFormularioAuxiliarTipoGlobalCliente=this.jInternalFrameDetalleFormTipoGlobalCliente.jPanelAccionesFormularioTipoGlobalCliente;
		}
		
		final JPanel jPanelCamposTipoGlobalCliente=jPanelCamposAuxiliarTipoGlobalCliente;
		final JPanel jPanelAccionesFormularioTipoGlobalCliente=jPanelAccionesFormularioAuxiliarTipoGlobalCliente;
		
		
		final JMenuBar jmenuBarTipoGlobalCliente=this.jmenuBarTipoGlobalCliente;		
		final JToolBar jTtoolBarTipoGlobalCliente=this.jTtoolBarTipoGlobalCliente;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoGlobalCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoGlobalCliente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) {
			jmenuBarDetalleAuxiliarTipoGlobalCliente=this.jInternalFrameDetalleFormTipoGlobalCliente.jmenuBarDetalleTipoGlobalCliente;
			jTtoolBarDetalleAuxiliarTipoGlobalCliente=this.jInternalFrameDetalleFormTipoGlobalCliente.jTtoolBarDetalleTipoGlobalCliente;		
		}
		
		final JMenuBar jmenuBarDetalleTipoGlobalCliente=jmenuBarDetalleAuxiliarTipoGlobalCliente;
		final JToolBar jTtoolBarDetalleTipoGlobalCliente=jTtoolBarDetalleAuxiliarTipoGlobalCliente;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoGlobalCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoGlobalCliente;
			processRunnable.jTableDatos=jTableDatosTipoGlobalCliente;
			processRunnable.jPanelCampos=jPanelCamposTipoGlobalCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoGlobalCliente;
			processRunnable.jPanelAcciones=jPanelAccionesTipoGlobalCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoGlobalCliente;
			
			
			processRunnable.jmenuBar=jmenuBarTipoGlobalCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoGlobalCliente;
			processRunnable.jTtoolBar=jTtoolBarTipoGlobalCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoGlobalCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoGlobalCliente ,jPanelParametrosReportesTipoGlobalCliente, jTableDatosTipoGlobalCliente,/*jScrollPanelDatosTipoGlobalCliente,*/jPanelCamposTipoGlobalCliente,jPanelPaginacionTipoGlobalCliente, /*jScrollPanelDatosEdicionTipoGlobalCliente,*/ jPanelAccionesTipoGlobalCliente,jPanelAccionesFormularioTipoGlobalCliente,jmenuBarTipoGlobalCliente,jmenuBarDetalleTipoGlobalCliente,jTtoolBarTipoGlobalCliente,jTtoolBarDetalleTipoGlobalCliente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoGlobalCliente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoGlobalCliente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoGlobalCliente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoGlobalCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoGlobalCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoGlobalCliente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoGlobalCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoGlobalCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoGlobalCliente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoglobalclienteConstantesFunciones.getsFinalQueryTipoGlobalCliente();
		String  finalQueryPaginacionTodos=this.tipoglobalclienteConstantesFunciones.getsFinalQueryTipoGlobalCliente();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoGlobalClienteConstantesFunciones.getArrayColumnasGlobalesNoTipoGlobalCliente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoGlobalClienteConstantesFunciones.getArrayColumnasGlobalesTipoGlobalCliente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoGlobalClienteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoglobalclientesEliminados= new ArrayList<TipoGlobalCliente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoGlobalCliente();
		
				///*TipoGlobalClienteSessionBean*/this.tipoglobalclienteSessionBean=new TipoGlobalClienteSessionBean();
			
			if(this.tipoglobalclienteSessionBean==null) {
				this.tipoglobalclienteSessionBean=new TipoGlobalClienteSessionBean();
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
					this.iNumeroPaginacion=TipoGlobalClienteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoGlobalClienteConstantesFunciones.getClassesForeignKeysOfTipoGlobalCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoglobalcliente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoglobalclientesAux= new ArrayList<TipoGlobalCliente>();
			
				
			tipoglobalclienteLogic.setDatosCliente(this.datosCliente);
			tipoglobalclienteLogic.setDatosDeep(this.datosDeep);
			tipoglobalclienteLogic.setIsConDeep(true);
			
			
			tipoglobalclienteLogic.getTipoGlobalClienteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoglobalclienteLogic.getTodosTipoGlobalClientes(finalQueryGlobal,pagination);
					
					//tipoglobalclienteLogic.getTodosTipoGlobalClientesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoglobalclienteLogic.getTipoGlobalClientes()==null|| tipoglobalclienteLogic.getTipoGlobalClientes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoglobalclientesAux= new ArrayList<TipoGlobalCliente>();
							tipoglobalclientesAux.addAll(tipoglobalclienteLogic.getTipoGlobalClientes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoglobalclientesAux= new ArrayList<TipoGlobalCliente>();
							tipoglobalclientesAux.addAll(tipoglobalclientes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoglobalclienteLogic.getTodosTipoGlobalClientes(finalQueryGlobal+"",this.pagination);												
							
							//tipoglobalclienteLogic.getTodosTipoGlobalClientesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoGlobalClientes("Todos",tipoglobalclienteLogic.getTipoGlobalClientes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoglobalclienteLogic.setTipoGlobalClientes(new ArrayList<TipoGlobalCliente>());					
							tipoglobalclienteLogic.getTipoGlobalClientes().addAll(tipoglobalclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoglobalclientes=new ArrayList<TipoGlobalCliente>();
							tipoglobalclientes.addAll(tipoglobalclientesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoGlobalCliente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoGlobalCliente=this.idActual;
				
				} else if(this.idTipoGlobalClienteActual!=null && this.idTipoGlobalClienteActual!=0L) {
					idTipoGlobalCliente=idTipoGlobalClienteActual;
				}
				
					
				this.sDetalleReporte=TipoGlobalClienteConstantesFunciones.getDetalleIndicePorId(idTipoGlobalCliente);
				
				this.tipoglobalclientes=new ArrayList<TipoGlobalCliente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoglobalclienteLogic.getEntity(idTipoGlobalCliente);
					
					//tipoglobalclienteLogic.getEntityWithConnection(idTipoGlobalCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoglobalclienteLogic.setTipoGlobalClientes(new ArrayList<TipoGlobalCliente>());
					tipoglobalclienteLogic.getTipoGlobalClientes().add(tipoglobalclienteLogic.getTipoGlobalCliente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoglobalclientes=new ArrayList<TipoGlobalCliente>();
					this.tipoglobalclientes.add(tipoglobalcliente);
				}
				
				if(tipoglobalclienteLogic.getTipoGlobalCliente()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoGlobalCliente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoGlobalCliente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoglobalclienteLogic.getTipoGlobalClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoglobalclientes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoglobalclienteLogic.getTipoGlobalClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoglobalclientes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoGlobalCliente tipoglobalcliente) {
		Boolean permite=true;
		
		if(this.tipoglobalcliente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoGlobalClienteConstantesFunciones.getOrderByListaTipoGlobalCliente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoGlobalClienteConstantesFunciones.getOrderByListaTipoGlobalCliente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGlobalCliente tipoglobalcliente:tipoglobalclienteLogic.getTipoGlobalClientes()) {
				if(tipoglobalcliente.getsType().equals(Constantes2.S_TOTALES)) {
					tipoglobalclienteTotales=tipoglobalcliente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGlobalCliente tipoglobalcliente:this.tipoglobalclientes) {
				if(tipoglobalcliente.getsType().equals(Constantes2.S_TOTALES)) {
					tipoglobalclienteTotales=tipoglobalcliente;
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
			this.tipoglobalclienteAux=new TipoGlobalCliente();
			this.tipoglobalclienteAux.setsType(Constantes2.S_TOTALES);
			this.tipoglobalclienteAux.setIsNew(false);
			this.tipoglobalclienteAux.setIsChanged(false);
			this.tipoglobalclienteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoGlobalClienteConstantesFunciones.TotalizarValoresFilaTipoGlobalCliente(this.tipoglobalclienteLogic.getTipoGlobalClientes(),this.tipoglobalclienteAux);
				
				this.tipoglobalclienteLogic.getTipoGlobalClientes().add(this.tipoglobalclienteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoGlobalClienteConstantesFunciones.TotalizarValoresFilaTipoGlobalCliente(this.tipoglobalclientes,this.tipoglobalclienteAux);
				
				this.tipoglobalclientes.add(this.tipoglobalclienteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoglobalclienteTotales=new TipoGlobalCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoglobalclienteLogic.getTipoGlobalClientes().remove(tipoglobalclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoglobalclientes.remove(tipoglobalclienteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoglobalclienteTotales=new TipoGlobalCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGlobalCliente tipoglobalcliente:tipoglobalclienteLogic.getTipoGlobalClientes()) {
				if(tipoglobalcliente.getsType().equals(Constantes2.S_TOTALES)) {
					tipoglobalclienteTotales=tipoglobalcliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoGlobalClienteConstantesFunciones.TotalizarValoresFilaTipoGlobalCliente(this.tipoglobalclienteLogic.getTipoGlobalClientes(),tipoglobalclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGlobalCliente tipoglobalcliente:this.tipoglobalclientes) {
				if(tipoglobalcliente.getsType().equals(Constantes2.S_TOTALES)) {
					tipoglobalclienteTotales=tipoglobalcliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoGlobalClienteConstantesFunciones.TotalizarValoresFilaTipoGlobalCliente(this.tipoglobalclientes,tipoglobalclienteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoGlobalCliente() {
		this.isPermisoTodoTipoGlobalCliente=false;
		this.isPermisoNuevoTipoGlobalCliente=false;
		this.isPermisoActualizarTipoGlobalCliente=false;
		this.isPermisoActualizarOriginalTipoGlobalCliente=false;
		this.isPermisoEliminarTipoGlobalCliente=false;
		this.isPermisoGuardarCambiosTipoGlobalCliente=false;
		this.isPermisoConsultaTipoGlobalCliente=false;
		this.isPermisoBusquedaTipoGlobalCliente=false;
		this.isPermisoReporteTipoGlobalCliente=false;		
		this.isPermisoOrdenTipoGlobalCliente=false;		
		this.isPermisoPaginacionMedioTipoGlobalCliente=false;		
		this.isPermisoPaginacionAltoTipoGlobalCliente=false;
		this.isPermisoPaginacionTodoTipoGlobalCliente=false;
		this.isPermisoCopiarTipoGlobalCliente=false;		
		this.isPermisoVerFormTipoGlobalCliente=false;		
		this.isPermisoDuplicarTipoGlobalCliente=false;		
		this.isPermisoOrdenTipoGlobalCliente=false;		
	}
	
	public void setPermisosUsuarioTipoGlobalCliente(Boolean isPermiso) {
		this.isPermisoTodoTipoGlobalCliente=isPermiso;
		this.isPermisoNuevoTipoGlobalCliente=isPermiso;
		this.isPermisoActualizarTipoGlobalCliente=isPermiso;
		this.isPermisoActualizarOriginalTipoGlobalCliente=isPermiso;
		this.isPermisoEliminarTipoGlobalCliente=isPermiso;
		this.isPermisoGuardarCambiosTipoGlobalCliente=isPermiso;
		this.isPermisoConsultaTipoGlobalCliente=isPermiso;
		this.isPermisoBusquedaTipoGlobalCliente=isPermiso;
		this.isPermisoReporteTipoGlobalCliente=isPermiso;
		this.isPermisoOrdenTipoGlobalCliente=isPermiso;		
		this.isPermisoPaginacionMedioTipoGlobalCliente=isPermiso;		
		this.isPermisoPaginacionAltoTipoGlobalCliente=isPermiso;		
		this.isPermisoPaginacionTodoTipoGlobalCliente=isPermiso;		
		this.isPermisoCopiarTipoGlobalCliente=isPermiso;		
		this.isPermisoVerFormTipoGlobalCliente=isPermiso;		
		this.isPermisoDuplicarTipoGlobalCliente=isPermiso;
		this.isPermisoOrdenTipoGlobalCliente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoGlobalCliente(Boolean isPermiso) {
		//this.isPermisoTodoTipoGlobalCliente=isPermiso;
		this.isPermisoNuevoTipoGlobalCliente=isPermiso;
		this.isPermisoActualizarTipoGlobalCliente=isPermiso;
		this.isPermisoActualizarOriginalTipoGlobalCliente=isPermiso;
		this.isPermisoEliminarTipoGlobalCliente=isPermiso;
		this.isPermisoGuardarCambiosTipoGlobalCliente=isPermiso;
		//this.isPermisoConsultaTipoGlobalCliente=isPermiso;
		//this.isPermisoBusquedaTipoGlobalCliente=isPermiso;
		//this.isPermisoReporteTipoGlobalCliente=isPermiso;
		//this.isPermisoOrdenTipoGlobalCliente=isPermiso;		
		//this.isPermisoPaginacionMedioTipoGlobalCliente=isPermiso;		
		//this.isPermisoPaginacionAltoTipoGlobalCliente=isPermiso;		
		//this.isPermisoPaginacionTodoTipoGlobalCliente=isPermiso;		
		//this.isPermisoCopiarTipoGlobalCliente=isPermiso;		
		//this.isPermisoDuplicarTipoGlobalCliente=isPermiso;
		//this.isPermisoOrdenTipoGlobalCliente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoGlobalClienteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DefinicionConstantesFunciones.SNOMBREOPCION);
		
		if(TipoGlobalClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosDefinicion=this.verificarGetPermisosUsuarioOpcionTipoGlobalClienteClaseRelacionada(this.opcionsRelacionadas,DefinicionConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoGlobalCliente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoGlobalClienteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDefinicion=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoGlobalClienteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoGlobalClienteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoGlobalClienteClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDefinicion && this.jInternalFrameDetalleFormTipoGlobalCliente!=null && this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGlobalCliente.jTabbedPaneRelacionesTipoGlobalCliente.remove(this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoGlobalCliente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoGlobalClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoGlobalClienteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoGlobalCliente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoGlobalCliente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoGlobalCliente=this.isPermisoActualizarTipoGlobalCliente;
			this.isPermisoEliminarTipoGlobalCliente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoGlobalCliente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoGlobalCliente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoGlobalCliente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoGlobalCliente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoGlobalCliente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoGlobalCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoGlobalCliente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoGlobalCliente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoGlobalCliente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoGlobalCliente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoGlobalCliente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoGlobalCliente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoGlobalCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoGlobalCliente.setToolTipText(this.jTableDatosTipoGlobalCliente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoGlobalCliente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoGlobalCliente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoGlobalClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoGlobalClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoGlobalCliente() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDefinicion && this.tipoglobalclienteConstantesFunciones.mostrarDefinicionTipoGlobalCliente && !TipoGlobalClienteConstantesFunciones.ISGUARDARREL) {

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
	
		
	public void inicializarCombosForeignKeyTipoGlobalClienteListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoGlobalClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoGlobalClienteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoGlobalClienteListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoGlobalClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoGlobalCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoGlobalCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoGlobalCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoGlobalCliente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGlobalCliente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoGlobalCliente(TipoGlobalCliente tipoglobalcliente)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoGlobalCliente(TipoGlobalCliente tipoglobalcliente,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoGlobalCliente()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGlobalCliente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoGlobalCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoGlobalCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoGlobalCliente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoGlobalCliente()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoGlobalCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoGlobalCliente()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoGlobalClienteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoGlobalClienteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoGlobalClienteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoglobalclienteSessionBean=new TipoGlobalClienteSessionBean(); 
		this.tipoglobalclienteConstantesFunciones=new TipoGlobalClienteConstantesFunciones(); 
		this.tipoglobalclienteBean=new TipoGlobalCliente();//(this.tipoglobalclienteConstantesFunciones); 		
		this.tipoglobalclienteReturnGeneral=new TipoGlobalClienteParameterReturnGeneral(); 
		
		this.tipoglobalclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoglobalclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoGlobalClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoGlobalClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoGlobalClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoGlobalCliente(true);
			
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
			
			this.tipoglobalclienteConstantesFunciones=new TipoGlobalClienteConstantesFunciones(); 
			this.tipoglobalclienteBean=new TipoGlobalCliente();//this.tipoglobalclienteConstantesFunciones); 			
			this.tipoglobalclienteReturnGeneral=new TipoGlobalClienteParameterReturnGeneral(); 
		
			TipoGlobalClienteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Global Cliente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoglobalcliente=new TipoGlobalCliente();
			this.tipoglobalclientes = new ArrayList<TipoGlobalCliente>();
			this.tipoglobalclientesAux = new ArrayList<TipoGlobalCliente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic=new TipoGlobalClienteLogic();
				this.tipoglobalclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoglobalclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoglobalclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoGlobalCliente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoGlobalCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoGlobalCliente);	
					}
					
					if(this.jInternalFrameImportacionTipoGlobalCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoGlobalCliente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoGlobalCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoGlobalCliente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoGlobalCliente);
				this.jInternalFrameDetalleFormTipoGlobalCliente.setVisible(false);
				this.jInternalFrameDetalleFormTipoGlobalCliente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoGlobalCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoGlobalCliente);
					this.jInternalFrameReporteDinamicoTipoGlobalCliente.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoGlobalCliente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoGlobalCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoGlobalCliente);
					this.jInternalFrameImportacionTipoGlobalCliente.setVisible(false);
					this.jInternalFrameImportacionTipoGlobalCliente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoGlobalCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoGlobalCliente);
					this.jInternalFrameOrderByTipoGlobalCliente.setVisible(false);
					this.jInternalFrameOrderByTipoGlobalCliente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoGlobalClienteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoGlobalClienteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoglobalclienteReturnGeneral=new TipoGlobalClienteParameterReturnGeneral();
			
			this.tipoglobalclienteParameterGeneral=new TipoGlobalClienteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoglobalclienteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoGlobalClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DefinicionConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoGlobalClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoglobalclienteSessionBean.getEsGuardarRelacionado(),this.tipoglobalclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoGlobalClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoglobalclienteSessionBean.getEsGuardarRelacionado(),this.tipoglobalclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoGlobalCliente=false;
			this.isVisibilidadCeldaDuplicarTipoGlobalCliente=true;
			this.isVisibilidadCeldaCopiarTipoGlobalCliente=true;
			this.isVisibilidadCeldaVerFormTipoGlobalCliente=true;
			this.isVisibilidadCeldaOrdenTipoGlobalCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGlobalCliente=false;
			this.isVisibilidadCeldaModificarTipoGlobalCliente=false;
			this.isVisibilidadCeldaActualizarTipoGlobalCliente=false;
			this.isVisibilidadCeldaEliminarTipoGlobalCliente=false;
			this.isVisibilidadCeldaCancelarTipoGlobalCliente=false;
			this.isVisibilidadCeldaGuardarTipoGlobalCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGlobalCliente=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoGlobalCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoGlobalCliente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoGlobalCliente(false);
			
			this.setPermisosUsuarioTipoGlobalCliente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoglobalclienteSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoglobalclienteSessionBean.getEsGuardarRelacionado() && this.tipoglobalclienteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoGlobalClienteClasesRelacionadas();
			}
			
			if(this.tipoglobalclienteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoGlobalClienteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoGlobalClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoGlobalCliente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoGlobalCliente();
			}
			
			if(!this.isPermisoBusquedaTipoGlobalCliente) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoGlobalCliente,this.isPermisoPaginacionMedioTipoGlobalCliente,this.isPermisoPaginacionTodoTipoGlobalCliente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoGlobalClienteConstantesFunciones.getTiposSeleccionarTipoGlobalCliente());
				
				this.tiposColumnasSelect=TipoGlobalClienteConstantesFunciones.getTiposSeleccionarTipoGlobalCliente(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoGlobalCliente();				
				//this.tiposRelacionesSelect=TipoGlobalClienteConstantesFunciones.getTiposRelacionesTipoGlobalCliente(true);
				
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
			//if(!this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoGlobalCliente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoGlobalCliente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoGlobalCliente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGlobalCliente() ;
			
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
				tipoglobalclienteImplementable= (TipoGlobalClienteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoGlobalClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoglobalclienteImplementableHome= (TipoGlobalClienteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoGlobalClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoglobalclientes= new ArrayList<TipoGlobalCliente>();
			this.tipoglobalclientesEliminados= new ArrayList<TipoGlobalCliente>();
						
			this.isEsNuevoTipoGlobalCliente=false;
			this.esParaAccionDesdeFormularioTipoGlobalCliente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoGlobalCliente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoGlobalCliente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoGlobalClienteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoGlobalCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoGlobalCliente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoGlobalCliente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoGlobalCliente();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoGlobalCliente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoGlobalCliente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoGlobalCliente() {
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
			if(sTipo.equals("RelacionesTipoGlobalCliente")) {
				iIndex=this.jInternalFrameDetalleFormTipoGlobalCliente.jTabbedPaneRelacionesTipoGlobalCliente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoGlobalCliente.jTabbedPaneRelacionesTipoGlobalCliente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoGlobalCliente.getSelectedRow();	
				
				

				if(sTitle.equals("Definiciones")) {
					if(!DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoGlobalCliente();

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
				this.finishProcessTipoGlobalCliente();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDefinicion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoGlobalCliente.cargarSessionConBeanSwingJInternalFrameDefinicion(false,true,iIndex);
		this.jButtonDefinicionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDefinicion();

		//this.jTabbedPaneRelacionesTipoGlobalCliente.updateUI();
		//this.jTabbedPaneRelacionesTipoGlobalCliente.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoGlobalCliente.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Definicion")) {
				int row=this.jTableDatosTipoGlobalCliente.getSelectedRow();
				jButtonDefinicionActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Definicion")) {

					if(this.isTienePermisosDefinicion && this.tipoglobalclienteConstantesFunciones.mostrarDefinicionTipoGlobalCliente && !TipoGlobalClienteConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Definiciones"+"("+DefinicionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Definiciones");

						if(tipoglobalclienteConstantesFunciones.resaltarDefinicionTipoGlobalCliente!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoglobalclienteConstantesFunciones.resaltarDefinicionTipoGlobalCliente);
						}

						jmenuItem.setEnabled(this.tipoglobalclienteConstantesFunciones.activarDefinicionTipoGlobalCliente);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Definicion"));

						

						this.jInternalFrameDetalleFormTipoGlobalCliente.jmenuDetalleTipoGlobalCliente.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoGlobalCliente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoGlobalCliente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoGlobalCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoGlobalClienteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoGlobalCliente();
		
		this.cargarCombosFrameForeignKeyTipoGlobalCliente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoGlobalCliente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoGlobalCliente();
		}
	}
	
	
	
	public void jButtonNuevoTipoGlobalClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoglobalclienteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoGlobalCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
			
			
			if(jTableDatosTipoGlobalCliente.getRowCount()>=1) {
				jTableDatosTipoGlobalCliente.removeRowSelectionInterval(0, jTableDatosTipoGlobalCliente.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoGlobalCliente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoGlobalCliente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoGlobalCliente(true);			
			//this.tipoglobalcliente=new TipoGlobalCliente();
			//this.tipoglobalcliente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGlobalCliente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGlobalCliente() ;
			
			if(TipoGlobalClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGlobalCliente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoglobalcliente);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoglobalcliente);				
			
			TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
			
			if(this.tipoglobalclienteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoGlobalCliente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoGlobalClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoGlobalCliente> tipoglobalclientesSeleccionados=new ArrayList<TipoGlobalCliente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoGlobalCliente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoGlobalCliente.getSelectedRows().length;			
			}
			
			tipoglobalclientesSeleccionados=this.getTipoGlobalClientesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoGlobalCliente--;			
				//TipoGlobalCliente tipoglobalclienteAux= new TipoGlobalCliente();			
				//tipoglobalclienteAux.setId(this.iIdNuevoTipoGlobalCliente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoGlobalCliente tipoglobalclienteOrigen=new TipoGlobalCliente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoGlobalCliente tipoglobalclienteOrigen : tipoglobalclientesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoGlobalCliente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoglobalclienteOrigen =(TipoGlobalCliente) this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoglobalclienteOrigen =(TipoGlobalCliente) this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoGlobalCliente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoglobalcliente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoGlobalCliente(tipoglobalclienteOrigen,this.tipoglobalcliente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGlobalCliente(this.tipoglobalcliente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoglobalclienteLogic.getTipoGlobalClientes().add(this.tipoglobalclienteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoglobalclientes.add(this.tipoglobalclienteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoGlobalCliente(false);
				
				this.jTableDatosTipoGlobalCliente.setRowSelectionInterval(this.getIndiceNuevoTipoGlobalCliente(), this.getIndiceNuevoTipoGlobalCliente());
				
				int iLastRow =  this.jTableDatosTipoGlobalCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoGlobalCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoGlobalCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGlobalCliente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoGlobalClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoGlobalCliente> tipoglobalclientesSeleccionados=new ArrayList<TipoGlobalCliente>();									
		
			TipoGlobalCliente tipoglobalclienteOrigen=new TipoGlobalCliente();
			TipoGlobalCliente tipoglobalclienteDestino=new TipoGlobalCliente();
				
			tipoglobalclientesSeleccionados=this.getTipoGlobalClientesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoGlobalCliente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoglobalclientesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoGlobalCliente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoglobalclienteOrigen =(TipoGlobalCliente) this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoglobalclienteOrigen =(TipoGlobalCliente) this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoglobalclienteDestino =(TipoGlobalCliente) this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoglobalclienteDestino =(TipoGlobalCliente) this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoglobalclienteOrigen =tipoglobalclientesSeleccionados.get(0);
				tipoglobalclienteDestino =tipoglobalclientesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoGlobalCliente(tipoglobalclienteOrigen,tipoglobalclienteDestino,true,false);
				
				tipoglobalclienteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoglobalclienteDestino,tipoglobalclienteLogic.getTipoGlobalClientes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoglobalclienteDestino,tipoglobalclientes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoGlobalCliente(false);
				
				//this.jTableDatosTipoGlobalCliente.setRowSelectionInterval(this.getIndiceNuevoTipoGlobalCliente(), this.getIndiceNuevoTipoGlobalCliente());
				
				int iLastRow =  this.jTableDatosTipoGlobalCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoGlobalCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoGlobalCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGlobalCliente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoGlobalClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoGlobalCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoGlobalCliente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoGlobalClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoGlobalCliente.isVisible();
			
			
			this.jPanelParametrosReportesTipoGlobalCliente.setVisible(!isVisible);
			this.jPanelPaginacionTipoGlobalCliente.setVisible(!isVisible);
			this.jPanelAccionesTipoGlobalCliente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoGlobalClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoGlobalCliente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoGlobalClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoGlobalCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoGlobalClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoGlobalCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoGlobalClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoGlobalCliente();
			
			this.abrirFrameOrderByTipoGlobalCliente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoGlobalClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoGlobalCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoGlobalCliente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoGlobalCliente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoGlobalCliente.isMaximum()) {
					this.jInternalFrameDetalleFormTipoGlobalCliente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoGlobalCliente.setSize(this.jInternalFrameDetalleFormTipoGlobalCliente.iWidthFormulario,this.jInternalFrameDetalleFormTipoGlobalCliente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoGlobalCliente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoGlobalCliente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoGlobalCliente.isMaximum()) {
						this.jInternalFrameDetalleFormTipoGlobalCliente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoGlobalCliente.jContentPaneDetalleTipoGlobalCliente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoGlobalCliente.jTabbedPaneRelacionesTipoGlobalCliente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoGlobalCliente.jContentPaneDetalleTipoGlobalCliente.getWidth(),TipoGlobalClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoGlobalCliente.jTabbedPaneRelacionesTipoGlobalCliente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoGlobalCliente.jContentPaneDetalleTipoGlobalCliente.getWidth(),TipoGlobalClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoGlobalCliente.jTabbedPaneRelacionesTipoGlobalCliente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoGlobalCliente.jContentPaneDetalleTipoGlobalCliente.getWidth(),TipoGlobalClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDefinicion();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoGlobalCliente.setVisible(true);
	        this.jInternalFrameDetalleFormTipoGlobalCliente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoGlobalCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoGlobalCliente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoGlobalCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGlobalCliente,false,this);
				} else {
					this.jInternalFrameOrderByTipoGlobalCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGlobalCliente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoGlobalCliente);
				this.jInternalFrameOrderByTipoGlobalCliente.setVisible(false);
				this.jInternalFrameOrderByTipoGlobalCliente.setSelected(false);
				
				this.jInternalFrameOrderByTipoGlobalCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoGlobalCliente"));
				
				this.inicializarActualizarBindingTablaOrderByTipoGlobalCliente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoGlobalCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoGlobalCliente==null) {
				
				this.jInternalFrameImportacionTipoGlobalCliente=new ImportacionJInternalFrame(TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoGlobalCliente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoGlobalCliente);
				this.jInternalFrameImportacionTipoGlobalCliente.setVisible(false);
				this.jInternalFrameImportacionTipoGlobalCliente.setSelected(false);


				this.jInternalFrameImportacionTipoGlobalCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoGlobalCliente"));
				this.jInternalFrameImportacionTipoGlobalCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoGlobalCliente"));
				this.jInternalFrameImportacionTipoGlobalCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoGlobalCliente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoGlobalCliente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoGlobalCliente==null) {
				this.jInternalFrameReporteDinamicoTipoGlobalCliente=new ReporteDinamicoJInternalFrame(TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoGlobalCliente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoGlobalCliente);
				this.jInternalFrameReporteDinamicoTipoGlobalCliente.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoGlobalCliente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGlobalCliente"));
				this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGlobalCliente"));
				this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGlobalCliente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGlobalCliente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDefinicion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoGlobalCliente.jContentPaneDetalleTipoGlobalCliente.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoGlobalCliente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoGlobalCliente);
			
	       	this.jInternalFrameDetalleFormTipoGlobalCliente.setVisible(false);
	        this.jInternalFrameDetalleFormTipoGlobalCliente.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoGlobalCliente.dispose();
			//this.jInternalFrameDetalleFormTipoGlobalCliente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoGlobalCliente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoGlobalCliente.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoGlobalCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoGlobalCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoGlobalCliente.setVisible(true);
	        this.jInternalFrameImportacionTipoGlobalCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoGlobalCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoGlobalCliente.setVisible(true);
	        this.jInternalFrameOrderByTipoGlobalCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoGlobalCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoGlobalCliente.setVisible(false);
	        this.jInternalFrameOrderByTipoGlobalCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoGlobalCliente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoGlobalCliente.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoGlobalCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoGlobalCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoGlobalCliente.setVisible(false);
	        this.jInternalFrameImportacionTipoGlobalCliente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoGlobalClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoGlobalCliente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoGlobalCliente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoGlobalCliente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoGlobalCliente(true);
			//this.isEsNuevoTipoGlobalCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoGlobalCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGlobalCliente(false) ;
			
			if(tipoglobalclienteSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame.definicionSessionBean.getEsGuardarRelacionado() && DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDefinicionActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoGlobalClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGlobalCliente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGlobalCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoGlobalClienteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoGlobalCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoGlobalCliente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoGlobalCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoGlobalCliente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoGlobalCliente(true);
			//this.isEsNuevoTipoGlobalCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoglobalcliente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoGlobalCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoGlobalCliente(false) ;
			
			if(TipoGlobalClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGlobalCliente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGlobalCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoGlobalClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoGlobalCliente(false);
			
			//if(!this.isEsNuevoTipoGlobalCliente) {								
				int intSelectedRow = this.jTableDatosTipoGlobalCliente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoGlobalClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoGlobalCliente(this.tipoglobalcliente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGlobalCliente(this.tipoglobalcliente);
				
			}
			
			if(this.permiteMantenimiento(this.tipoglobalcliente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoGlobalCliente=true;
					this.inicializarActualizarBindingTablaTipoGlobalCliente(false);
					this.isEsNuevoTipoGlobalCliente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoGlobalCliente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoGlobalCliente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoGlobalCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGlobalCliente(false);
				
				this.habilitarDeshabilitarControlesTipoGlobalCliente(false);
			
												
				
				if(TipoGlobalClienteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoGlobalCliente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoGlobalClienteActionPerformed(evt,tipoglobalclienteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoGlobalCliente(this.tipoglobalcliente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoGlobalCliente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoglobalclienteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoglobalcliente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoGlobalCliente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGlobalCliente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoGlobalClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoGlobalCliente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
				this.tipoglobalcliente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
				this.tipoglobalcliente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoglobalcliente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoGlobalClienteModel) this.jTableDatosTipoGlobalCliente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoGlobalCliente=true;
				this.inicializarActualizarBindingTablaTipoGlobalCliente(false);
				this.isEsNuevoTipoGlobalCliente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoGlobalCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGlobalCliente(false);
				
				this.habilitarDeshabilitarControlesTipoGlobalCliente(false);
				
				
				
				if(TipoGlobalClienteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoGlobalCliente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoGlobalClienteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoGlobalCliente.getRowCount()>=1) {
				jTableDatosTipoGlobalCliente.removeRowSelectionInterval(0, jTableDatosTipoGlobalCliente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoGlobalCliente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoGlobalCliente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGlobalCliente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGlobalCliente(false) ;
			
			this.isEsNuevoTipoGlobalCliente=false;
			
			if(TipoGlobalClienteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoGlobalCliente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoGlobalClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoGlobalCliente(false);
				
				//SI ES MANUAL
				if(TipoGlobalClienteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoGlobalCliente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoGlobalClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoGlobalCliente--;			
			//TipoGlobalCliente tipoglobalclienteAux= new TipoGlobalCliente();			
			//tipoglobalclienteAux.setId(this.iIdNuevoTipoGlobalCliente);
			
			if(this.jInternalFrameDetalleFormTipoGlobalCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoGlobalCliente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoGlobalCliente(this.tipoglobalcliente);
			
			this.tipoglobalcliente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoglobalclienteLogic.getTipoGlobalClientes().add(this.tipoglobalclienteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoglobalclientes.add(this.tipoglobalclienteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoGlobalCliente(false);
			
			this.jTableDatosTipoGlobalCliente.setRowSelectionInterval(this.getIndiceNuevoTipoGlobalCliente(), this.getIndiceNuevoTipoGlobalCliente());
			
			int iLastRow =  this.jTableDatosTipoGlobalCliente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoGlobalCliente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoGlobalCliente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoGlobalCliente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoGlobalClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoGlobalCliente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGlobalCliente(false);
			
			//SI ES MANUAL
			if(TipoGlobalClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGlobalCliente();
			}
			
			//this.abrirFrameTreeTipoGlobalCliente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoGlobalClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Global ClienteES ?", "MANTENIMIENTO DE Tipo Global Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoGlobalCliente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoGlobalCliente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoglobalclienteReturnGeneral=tipoglobalclienteLogic.procesarImportacionTipoGlobalClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoglobalclienteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoGlobalClienteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoGlobalClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoGlobalCliente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoGlobalCliente.setFileImportacion(this.jInternalFrameImportacionTipoGlobalCliente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoGlobalCliente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoGlobalCliente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoGlobalCliente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoGlobalCliente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoGlobalClienteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoGlobalCliente> tipoglobalclientesSeleccionados=new ArrayList<TipoGlobalCliente>();		

		tipoglobalclientesSeleccionados=this.getTipoGlobalClientesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoGlobalClienteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoGlobalClienteBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoGlobalClientes("Todos",tipoglobalclientesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Global Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoGlobalClienteConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoGlobalClienteConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoGlobalClienteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoGlobalClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoGlobalClienteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoGlobalClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoGlobalClienteConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoGlobalClienteConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoGlobalClienteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoGlobalCliente> tipoglobalclientesSeleccionados=new ArrayList<TipoGlobalCliente>();		
		
		tipoglobalclientesSeleccionados=this.getTipoGlobalClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoglobalcliente";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoGlobalClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoGlobalClienteConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGlobalClienteConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoGlobalCliente tipoglobalcliente:tipoglobalclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoglobalcliente.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoGlobalClienteConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGlobalClienteConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoGlobalCliente tipoglobalcliente:tipoglobalclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoglobalcliente.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoGlobalCliente(row);				
			//	iRow++;
			//}				
			
			//for(TipoGlobalCliente tipoglobalclienteAux:tipoglobalclientesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoGlobalCliente(tipoglobalclienteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Global Cliente",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoglobalclienteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGlobalCliente(false);
			
			//SI ES MANUAL
			if(TipoGlobalClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGlobalCliente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoGlobalClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGlobalCliente(false);
			
			//SI ES MANUAL
			if(TipoGlobalClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoGlobalCliente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoGlobalClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGlobalCliente(false);
			
			//SI ES MANUAL
			if(TipoGlobalClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoGlobalCliente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoglobalclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoGlobalCliente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoGlobalCliente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoGlobalCliente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoGlobalCliente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoGlobalCliente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoGlobalCliente.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoGlobalCliente.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoGlobalCliente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoGlobalCliente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoGlobalCliente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoGlobalCliente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoGlobalCliente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoGlobalCliente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoGlobalCliente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGlobalCliente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoGlobalCliente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoGlobalClienteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoGlobalClienteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoGlobalCliente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoGlobalCliente();
		
		this.inicializarActualizarBindingBotonesManualTipoGlobalCliente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoGlobalCliente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGlobalCliente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGlobalCliente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGlobalCliente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoGlobalCliente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoGlobalCliente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoGlobalCliente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoGlobalCliente.jCheckBoxPostAccionNuevoTipoGlobalCliente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoGlobalCliente.jCheckBoxPostAccionSinCerrarTipoGlobalCliente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoGlobalCliente.jCheckBoxPostAccionSinMensajeTipoGlobalCliente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoGlobalCliente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoGlobalCliente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoGlobalCliente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) {
				this.jInternalFrameDetalleFormTipoGlobalCliente.jCheckBoxPostAccionNuevoTipoGlobalCliente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoGlobalCliente.jCheckBoxPostAccionSinCerrarTipoGlobalCliente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoGlobalCliente.jCheckBoxPostAccionSinMensajeTipoGlobalCliente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoGlobalCliente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoGlobalCliente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoGlobalCliente.jComboBoxTiposAccionesFormularioTipoGlobalCliente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoGlobalCliente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoGlobalCliente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoGlobalCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoGlobalCliente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoGlobalCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoGlobalCliente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoGlobalCliente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoGlobalCliente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoGlobalCliente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoGlobalCliente(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoGlobalClienteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGlobalCliente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoGlobalCliente() throws Exception {
		try	{
			if(TipoGlobalClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoGlobalCliente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoGlobalCliente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoGlobalCliente.jComboBoxTiposAccionesFormularioTipoGlobalCliente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoGlobalCliente.jComboBoxTiposAccionesFormularioTipoGlobalCliente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoGlobalCliente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoGlobalCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoGlobalCliente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoGlobalCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoGlobalCliente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoGlobalCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoGlobalCliente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoGlobalCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoGlobalCliente.addItem(reporte);
			}
			
			
			if(!this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoGlobalCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoGlobalCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoGlobalCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoGlobalCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoGlobalCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoGlobalCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoGlobalCliente.jComboBoxTiposAccionesFormularioTipoGlobalCliente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoGlobalCliente.jComboBoxTiposAccionesFormularioTipoGlobalCliente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoGlobalCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoGlobalCliente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoGlobalCliente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGlobalCliente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGlobalCliente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoGlobalCliente!=null) {
				this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoGlobalCliente!=null) {
				this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoGlobalCliente!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoGlobalCliente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoGlobalCliente(Boolean esInicializar) throws Exception {				
		if(TipoGlobalClienteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoGlobalCliente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoGlobalCliente() throws Exception {
		this.inicializarActualizarBindingTablaTipoGlobalCliente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoGlobalCliente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoGlobalCliente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoGlobalCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGlobalCliente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoGlobalClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoGlobalCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGlobalCliente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoGlobalClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoGlobalClienteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGlobalClienteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoGlobalClientePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoGlobalCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGlobalCliente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoGlobalClientePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoGlobalCliente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoGlobalCliente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoglobalclienteLogic.getTipoGlobalClientes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoglobalclientes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoGlobalClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoGlobalCliente.setModel(new TipoGlobalClienteModel(this.tipoglobalclienteLogic.getTipoGlobalClientes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoGlobalCliente.setModel(new TipoGlobalClienteModel(this.tipoglobalclientes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoGlobalCliente!=null && this.jInternalFrameOrderByTipoGlobalCliente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoGlobalCliente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoGlobalCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGlobalCliente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoGlobalClientePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO,tipoglobalclienteConstantesFunciones.resaltarSeleccionarTipoGlobalCliente,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO,tipoglobalclienteConstantesFunciones.resaltarSeleccionarTipoGlobalCliente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoGlobalCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGlobalCliente,TipoGlobalClienteConstantesFunciones.LABEL_ID));

		if(this.tipoglobalclienteConstantesFunciones.mostraridTipoGlobalCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGlobalClienteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoglobalclienteConstantesFunciones.resaltaridTipoGlobalCliente,this.tipoglobalclienteConstantesFunciones.activaridTipoGlobalCliente,this,true,"idTipoGlobalCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoglobalclienteConstantesFunciones.resaltaridTipoGlobalCliente,this.tipoglobalclienteConstantesFunciones.activaridTipoGlobalCliente,this,true,"idTipoGlobalCliente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGlobalCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGlobalCliente,TipoGlobalClienteConstantesFunciones.LABEL_CODIGO));

		if(this.tipoglobalclienteConstantesFunciones.mostrarcodigoTipoGlobalCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGlobalClienteConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoglobalclienteConstantesFunciones.resaltarcodigoTipoGlobalCliente,this.tipoglobalclienteConstantesFunciones.activarcodigoTipoGlobalCliente,this,true,"codigoTipoGlobalCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoglobalclienteConstantesFunciones.resaltarcodigoTipoGlobalCliente,this.tipoglobalclienteConstantesFunciones.activarcodigoTipoGlobalCliente,this,true,"codigoTipoGlobalCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoGlobalClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGlobalCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGlobalCliente,TipoGlobalClienteConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoglobalclienteConstantesFunciones.mostrarnombreTipoGlobalCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGlobalClienteConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoglobalclienteConstantesFunciones.resaltarnombreTipoGlobalCliente,this.tipoglobalclienteConstantesFunciones.activarnombreTipoGlobalCliente,this,true,"nombreTipoGlobalCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoglobalclienteConstantesFunciones.resaltarnombreTipoGlobalCliente,this.tipoglobalclienteConstantesFunciones.activarnombreTipoGlobalCliente,this,true,"nombreTipoGlobalCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoGlobalClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDefinicion && this.tipoglobalclienteConstantesFunciones.mostrarDefinicionTipoGlobalCliente && !TipoGlobalClienteConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Definiciones");
				tableColumn.setHeaderValue("Definiciones");
				tableColumn.setCellRenderer(new DefinicionTableCell(tipoglobalclienteConstantesFunciones.resaltarDefinicionTipoGlobalCliente,this,this.tipoglobalclienteConstantesFunciones.activarDefinicionTipoGlobalCliente));
				tableColumn.setCellEditor(new DefinicionTableCell(tipoglobalclienteConstantesFunciones.resaltarDefinicionTipoGlobalCliente,this,this.tipoglobalclienteConstantesFunciones.activarDefinicionTipoGlobalCliente));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoGlobalCliente.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoGlobalCliente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoGlobalCliente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoGlobalCliente && this.isPermisoGuardarCambiosTipoGlobalCliente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoGlobalCliente.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoglobalclienteSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoGlobalCliente.addColumn(tableColumn);
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
			
			this.jTableDatosTipoGlobalCliente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoGlobalCliente && this.isPermisoGuardarCambiosTipoGlobalCliente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoglobalclienteSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoGlobalCliente && this.isPermisoGuardarCambiosTipoGlobalCliente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoGlobalCliente.moveColumn(this.jTableDatosTipoGlobalCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoGlobalCliente.moveColumn(this.jTableDatosTipoGlobalCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoglobalclienteSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoGlobalCliente.moveColumn(this.jTableDatosTipoGlobalCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoGlobalCliente.moveColumn(this.jTableDatosTipoGlobalCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoGlobalCliente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoGlobalCliente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoGlobalCliente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoGlobalClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoGlobalCliente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoGlobalCliente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoGlobalClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoGlobalClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoGlobalCliente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoGlobalCliente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoGlobalCliente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoglobalclienteLogic.getTipoGlobalClientes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoglobalclientes.size()-1;
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
		//this.jTableDatosTipoGlobalCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoGlobalCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoGlobalCliente();
			
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
				
				//this.isEsNuevoTipoGlobalCliente=false;
					
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
			
				if(this.tipoglobalclienteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoGlobalCliente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoGlobalCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoGlobalCliente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoglobalcliente.getsType().equals("DUPLICADO")
				   || this.tipoglobalcliente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoGlobalCliente=true;
				
				} else {
					this.isEsNuevoTipoGlobalCliente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoglobalcliente.getId()>=0 && !this.tipoglobalcliente.getIsNew()) {						
						this.isEsNuevoTipoGlobalCliente=false;
						
					} else {
						this.isEsNuevoTipoGlobalCliente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoGlobalCliente(esRelaciones);						
				
				this.seleccionarTipoGlobalCliente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoglobalcliente.getId()<0) {
					this.isEsNuevoTipoGlobalCliente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoGlobalCliente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoGlobalCliente(evt,rowIndex);
				}	
				
				if(this.tipoglobalclienteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoGlobalCliente: " + this.dDif); 
					}
				}								
				
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoGlobalCliente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoglobalcliente)) {
					if(this.tipoglobalcliente.getId()>0) {
						this.tipoglobalcliente.setIsDeleted(true);
						
						this.tipoglobalclientesEliminados.add(this.tipoglobalcliente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoglobalclienteLogic.getTipoGlobalClientes().remove(this.tipoglobalcliente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoglobalclientes.remove(this.tipoglobalcliente);				
					}
					
					
					((TipoGlobalClienteModel) this.jTableDatosTipoGlobalCliente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGlobalCliente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoGlobalCliente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoGlobalCliente) {
			
			if(this.jInternalFrameDetalleFormTipoGlobalCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoGlobalCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoGlobalCliente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoGlobalClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoGlobalCliente(this.tipoglobalcliente);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoGlobalCliente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoGlobalCliente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGlobalCliente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoGlobalCliente(TipoGlobalCliente tipoglobalcliente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoGlobalCliente(tipoglobalcliente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoGlobalCliente(TipoGlobalCliente tipoglobalcliente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoGlobalCliente(tipoglobalcliente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoGlobalCliente(tipoglobalcliente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoGlobalCliente(tipoglobalcliente);
	}
	
	public void setVariablesObjetoActualToFormularioTipoGlobalCliente(TipoGlobalCliente tipoglobalcliente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoGlobalCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldidTipoGlobalCliente.setText(tipoglobalcliente.getId().toString());
			this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldcodigoTipoGlobalCliente.setText(tipoglobalcliente.getcodigo());
			this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldnombreTipoGlobalCliente.setText(tipoglobalcliente.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoGlobalCliente tipoglobalclienteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoglobalclienteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoGlobalCliente tipoglobalclienteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoglobalclienteLocal=this.tipoglobalcliente;
			} else {
				tipoglobalclienteLocal=this.tipoglobalclienteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoglobalclienteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoGlobalCliente(tipoglobalclienteLocal,true);
					
					if(tipoglobalclienteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoglobalclienteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoglobalclienteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoGlobalCliente(TipoGlobalCliente tipoglobalcliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoGlobalCliente(tipoglobalcliente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoGlobalCliente(tipoglobalcliente);
	}
	
	public void setVariablesFormularioToObjetoActualTipoGlobalCliente(TipoGlobalCliente tipoglobalcliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoGlobalCliente(tipoglobalcliente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoGlobalCliente(TipoGlobalCliente tipoglobalcliente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoGlobalCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldidTipoGlobalCliente.getText()==null || this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldidTipoGlobalCliente.getText()=="" || this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldidTipoGlobalCliente.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldidTipoGlobalCliente.setText("0");
			}

			if(conColumnasBase) {tipoglobalcliente.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldidTipoGlobalCliente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGlobalClienteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGlobalCliente.jLabelIdTipoGlobalCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoglobalcliente.setcodigo(this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldcodigoTipoGlobalCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGlobalClienteConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGlobalCliente.jLabelcodigoTipoGlobalCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoglobalcliente.setnombre(this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldnombreTipoGlobalCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGlobalClienteConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGlobalCliente.jLabelnombreTipoGlobalCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoGlobalCliente(TipoGlobalCliente tipoglobalclienteBean,TipoGlobalCliente tipoglobalcliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoGlobalCliente(TipoGlobalCliente tipoglobalclienteOrigen,TipoGlobalCliente tipoglobalcliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoglobalclienteOrigen.getId()!=null && !tipoglobalclienteOrigen.getId().equals(0L))) {tipoglobalcliente.setId(tipoglobalclienteOrigen.getId());}}
			if(conDefault || (!conDefault && tipoglobalclienteOrigen.getcodigo()!=null && !tipoglobalclienteOrigen.getcodigo().equals(""))) {tipoglobalcliente.setcodigo(tipoglobalclienteOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoglobalclienteOrigen.getnombre()!=null && !tipoglobalclienteOrigen.getnombre().equals(""))) {tipoglobalcliente.setnombre(tipoglobalclienteOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoGlobalCliente(TipoGlobalCliente tipoglobalcliente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldidTipoGlobalCliente.setText(tipoglobalcliente.getId().toString());
			this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldcodigoTipoGlobalCliente.setText(tipoglobalcliente.getcodigo());
			this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldnombreTipoGlobalCliente.setText(tipoglobalcliente.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoGlobalCliente(TipoGlobalClienteBean tipoglobalclienteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldidTipoGlobalCliente.setText(tipoglobalclienteBean.getId().toString());
			this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldcodigoTipoGlobalCliente.setText(tipoglobalclienteBean.getcodigo());
			this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldnombreTipoGlobalCliente.setText(tipoglobalclienteBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoGlobalCliente(TipoGlobalClienteParameterReturnGeneral tipoglobalclienteReturnGeneral,TipoGlobalClienteBean tipoglobalclienteBean,Boolean conDefault) throws Exception { 
		try {
			TipoGlobalCliente tipoglobalclienteLocal=new TipoGlobalCliente();
			
			tipoglobalclienteLocal=tipoglobalclienteReturnGeneral.getTipoGlobalCliente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoglobalclienteLocal.getId()!=null && !tipoglobalclienteLocal.getId().equals(0L))) {tipoglobalclienteBean.setId(tipoglobalclienteLocal.getId());}}
			if(conDefault || (!conDefault && tipoglobalclienteLocal.getcodigo()!=null && !tipoglobalclienteLocal.getcodigo().equals(""))) {tipoglobalclienteBean.setcodigo(tipoglobalclienteLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoglobalclienteLocal.getnombre()!=null && !tipoglobalclienteLocal.getnombre().equals(""))) {tipoglobalclienteBean.setnombre(tipoglobalclienteLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoGlobalClienteGenerico(Long idTipoGlobalClienteSeleccionado,JComboBox jComboBoxTipoGlobalCliente,List<TipoGlobalCliente> tipoglobalclientesLocal)throws Exception {
		try {
			TipoGlobalCliente  tipoglobalclienteTemp=null;

			for(TipoGlobalCliente tipoglobalclienteAux:tipoglobalclientesLocal) {
				if(tipoglobalclienteAux.getId()!=null && tipoglobalclienteAux.getId().equals(idTipoGlobalClienteSeleccionado)) {
					tipoglobalclienteTemp=tipoglobalclienteAux;
					break;
				}
			}

			jComboBoxTipoGlobalCliente.setSelectedItem(tipoglobalclienteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoGlobalClienteGenerico(JComboBox jComboBoxTipoGlobalCliente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoGlobalCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoGlobalCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoGlobalCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoGlobalCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoGlobalCliente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoGlobalCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoGlobalCliente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoGlobalCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoGlobalCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoGlobalCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoglobalcliente=(TipoGlobalCliente) tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoglobalcliente =(TipoGlobalCliente) tipoglobalclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoGlobalCliente tipoglobalclienteRow=new TipoGlobalCliente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoglobalclienteRow=(TipoGlobalCliente) tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoglobalclienteRow=(TipoGlobalCliente) tipoglobalclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDefinicionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoGlobalCliente tipoglobalcliente) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoGlobalCliente==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalclienteLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoglobalcliente = (TipoGlobalCliente)this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoglobalcliente = (TipoGlobalCliente)this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoglobalcliente!=null) {
						this.tipoglobalcliente = tipoglobalcliente;
					} else {
						this.tipoglobalcliente = new TipoGlobalCliente();
					}
				}

				if(this.isTienePermisosDefinicion && this.permiteMantenimiento(this.tipoglobalcliente)) {
					DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFramePopup=new DefinicionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						definicionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFramePopup;
					} else {
						definicionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame;
					}

					List<TipoGlobalCliente> tipoglobalclientes=new ArrayList<TipoGlobalCliente>();
					tipoglobalclientes.add(this.tipoglobalcliente);
					if(!esRelacionado) {
						//definicionBeanSwingJInternalFrame.definicionSessionBean.setConGuardarRelaciones(false);
						//definicionBeanSwingJInternalFrame.definicionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					definicionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoGlobalCliente.cargarDefinicionBeanSwingJInternalFrame(tipoglobalclientes,this.tipoglobalcliente,definicionBeanSwingJInternalFrame,/*conInicializar,*/definicionBeanSwingJInternalFrame.definicionSessionBean.getConGuardarRelaciones(),definicionBeanSwingJInternalFrame.definicionSessionBean.getEsGuardarRelacionado());
					definicionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						definicionBeanSwingJInternalFrame.actualizarEstadoPanelsDefinicion("no_relacionado");

						definicionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DefinicionConstantesFunciones.ITAMANIOFILATABLA + (DefinicionConstantesFunciones.ITAMANIOFILATABLA/2));

						definicionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoGlobalCliente=(TitledBorder)this.jScrollPanelDatosTipoGlobalCliente.getBorder();
						TitledBorder titledBorderDefinicion=(TitledBorder)definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.getBorder();

						titledBorderDefinicion.setTitle(titledBorderTipoGlobalCliente.getTitle() + " -> Definicion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,definicionBeanSwingJInternalFrame);
						}

						definicionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(definicionBeanSwingJInternalFrame);

						definicionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoglobalclienteSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Definicion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalclienteLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalclienteLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoGlobalCliente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoGlobalCliente.setVisible((this.isVisibilidadCeldaNuevoTipoGlobalCliente && this.isPermisoNuevoTipoGlobalCliente));			
			this.jButtonDuplicarTipoGlobalCliente.setVisible((this.isVisibilidadCeldaDuplicarTipoGlobalCliente && this.isPermisoDuplicarTipoGlobalCliente));			
			this.jButtonCopiarTipoGlobalCliente.setVisible((this.isVisibilidadCeldaCopiarTipoGlobalCliente && this.isPermisoCopiarTipoGlobalCliente));
			this.jButtonVerFormTipoGlobalCliente.setVisible((this.isVisibilidadCeldaVerFormTipoGlobalCliente && this.isPermisoVerFormTipoGlobalCliente));
			
			this.jButtonAbrirOrderByTipoGlobalCliente.setVisible((this.isVisibilidadCeldaOrdenTipoGlobalCliente && this.isPermisoOrdenTipoGlobalCliente));			
			
			this.jButtonNuevoRelacionesTipoGlobalCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGlobalCliente && this.isPermisoNuevoTipoGlobalCliente));			
			this.jButtonNuevoGuardarCambiosTipoGlobalCliente.setVisible((this.isVisibilidadCeldaNuevoTipoGlobalCliente && this.isPermisoNuevoTipoGlobalCliente && this.isPermisoGuardarCambiosTipoGlobalCliente));
			
			if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) {
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonModificarTipoGlobalCliente.setVisible((this.isVisibilidadCeldaModificarTipoGlobalCliente && this.isPermisoActualizarTipoGlobalCliente));	
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonActualizarTipoGlobalCliente.setVisible((this.isVisibilidadCeldaActualizarTipoGlobalCliente && this.isPermisoActualizarTipoGlobalCliente));	
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonEliminarTipoGlobalCliente.setVisible((this.isVisibilidadCeldaEliminarTipoGlobalCliente && this.isPermisoEliminarTipoGlobalCliente));
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonCancelarTipoGlobalCliente.setVisible(this.isVisibilidadCeldaCancelarTipoGlobalCliente);							
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonGuardarCambiosTipoGlobalCliente.setVisible((this.isVisibilidadCeldaGuardarTipoGlobalCliente && this.isPermisoGuardarCambiosTipoGlobalCliente));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoGlobalCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGlobalCliente && this.isPermisoGuardarCambiosTipoGlobalCliente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoGlobalCliente.setVisible((this.isVisibilidadCeldaNuevoTipoGlobalCliente && this.isPermisoNuevoTipoGlobalCliente));						
			this.jButtonDuplicarToolBarTipoGlobalCliente.setVisible((this.isVisibilidadCeldaDuplicarTipoGlobalCliente && this.isPermisoDuplicarTipoGlobalCliente));						
			this.jButtonCopiarToolBarTipoGlobalCliente.setVisible((this.isVisibilidadCeldaCopiarTipoGlobalCliente && this.isPermisoCopiarTipoGlobalCliente));			
			this.jButtonVerFormToolBarTipoGlobalCliente.setVisible((this.isVisibilidadCeldaVerFormTipoGlobalCliente && this.isPermisoVerFormTipoGlobalCliente));			
			this.jButtonAbrirOrderByToolBarTipoGlobalCliente.setVisible((this.isVisibilidadCeldaOrdenTipoGlobalCliente && this.isPermisoOrdenTipoGlobalCliente));
			this.jButtonNuevoRelacionesToolBarTipoGlobalCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGlobalCliente && this.isPermisoNuevoTipoGlobalCliente));			
			this.jButtonNuevoGuardarCambiosToolBarTipoGlobalCliente.setVisible((this.isVisibilidadCeldaNuevoTipoGlobalCliente && this.isPermisoNuevoTipoGlobalCliente && this.isPermisoGuardarCambiosTipoGlobalCliente));			
			
			if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) {
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonModificarToolBarTipoGlobalCliente.setVisible((this.isVisibilidadCeldaModificarTipoGlobalCliente && this.isPermisoActualizarTipoGlobalCliente));	
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonActualizarToolBarTipoGlobalCliente.setVisible((this.isVisibilidadCeldaActualizarTipoGlobalCliente  && this.isPermisoActualizarTipoGlobalCliente));	
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonEliminarToolBarTipoGlobalCliente.setVisible((this.isVisibilidadCeldaEliminarTipoGlobalCliente && this.isPermisoEliminarTipoGlobalCliente));
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonCancelarToolBarTipoGlobalCliente.setVisible(this.isVisibilidadCeldaCancelarTipoGlobalCliente);				
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonGuardarCambiosToolBarTipoGlobalCliente.setVisible((this.isVisibilidadCeldaGuardarTipoGlobalCliente && this.isPermisoGuardarCambiosTipoGlobalCliente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoGlobalCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGlobalCliente && this.isPermisoGuardarCambiosTipoGlobalCliente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoGlobalCliente.setVisible((this.isVisibilidadCeldaNuevoTipoGlobalCliente && this.isPermisoNuevoTipoGlobalCliente));			
			this.jMenuItemDuplicarTipoGlobalCliente.setVisible((this.isVisibilidadCeldaDuplicarTipoGlobalCliente && this.isPermisoDuplicarTipoGlobalCliente));			
			this.jMenuItemCopiarTipoGlobalCliente.setVisible((this.isVisibilidadCeldaCopiarTipoGlobalCliente && this.isPermisoCopiarTipoGlobalCliente));			
			this.jMenuItemVerFormTipoGlobalCliente.setVisible((this.isVisibilidadCeldaVerFormTipoGlobalCliente && this.isPermisoVerFormTipoGlobalCliente));			
			this.jMenuItemAbrirOrderByTipoGlobalCliente.setVisible((this.isVisibilidadCeldaOrdenTipoGlobalCliente && this.isPermisoOrdenTipoGlobalCliente));			
			//this.jMenuItemMostrarOcultarTipoGlobalCliente.setVisible((this.isVisibilidadCeldaOrdenTipoGlobalCliente && this.isPermisoOrdenTipoGlobalCliente));
			this.jMenuItemDetalleAbrirOrderByTipoGlobalCliente.setVisible((this.isVisibilidadCeldaOrdenTipoGlobalCliente && this.isPermisoOrdenTipoGlobalCliente));			
			//this.jMenuItemDetalleMostrarOcultarTipoGlobalCliente.setVisible((this.isVisibilidadCeldaOrdenTipoGlobalCliente && this.isPermisoOrdenTipoGlobalCliente));			
			this.jMenuItemNuevoRelacionesTipoGlobalCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGlobalCliente && this.isPermisoNuevoTipoGlobalCliente));			
			this.jMenuItemNuevoGuardarCambiosTipoGlobalCliente.setVisible((this.isVisibilidadCeldaNuevoTipoGlobalCliente && this.isPermisoNuevoTipoGlobalCliente && this.isPermisoGuardarCambiosTipoGlobalCliente));									
			
			if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) {
			this.jInternalFrameDetalleFormTipoGlobalCliente.jMenuItemModificarTipoGlobalCliente.setVisible((this.isVisibilidadCeldaModificarTipoGlobalCliente && this.isPermisoActualizarTipoGlobalCliente));	
			this.jInternalFrameDetalleFormTipoGlobalCliente.jMenuItemActualizarTipoGlobalCliente.setVisible((this.isVisibilidadCeldaActualizarTipoGlobalCliente && this.isPermisoActualizarTipoGlobalCliente));	
			this.jInternalFrameDetalleFormTipoGlobalCliente.jMenuItemEliminarTipoGlobalCliente.setVisible((this.isVisibilidadCeldaEliminarTipoGlobalCliente && this.isPermisoEliminarTipoGlobalCliente));
			this.jInternalFrameDetalleFormTipoGlobalCliente.jMenuItemCancelarTipoGlobalCliente.setVisible(this.isVisibilidadCeldaCancelarTipoGlobalCliente);				
			}
			
			this.jMenuItemGuardarCambiosTipoGlobalCliente.setVisible((this.isVisibilidadCeldaGuardarTipoGlobalCliente && this.isPermisoGuardarCambiosTipoGlobalCliente));						
			this.jMenuItemGuardarCambiosTablaTipoGlobalCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGlobalCliente && this.isPermisoGuardarCambiosTipoGlobalCliente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoGlobalCliente=this.jButtonNuevoTipoGlobalCliente.isVisible();
			this.isVisibilidadCeldaDuplicarTipoGlobalCliente=this.jButtonDuplicarTipoGlobalCliente.isVisible();
			this.isVisibilidadCeldaCopiarTipoGlobalCliente=this.jButtonCopiarTipoGlobalCliente.isVisible();
			this.isVisibilidadCeldaVerFormTipoGlobalCliente=this.jButtonVerFormTipoGlobalCliente.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoGlobalCliente=this.jButtonAbrirOrderByTipoGlobalCliente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoGlobalCliente=this.jButtonNuevoRelacionesTipoGlobalCliente.isVisible();
			this.isVisibilidadCeldaModificarTipoGlobalCliente=this.jButtonModificarTipoGlobalCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) {
			this.isVisibilidadCeldaActualizarTipoGlobalCliente=this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonActualizarTipoGlobalCliente.isVisible();
			this.isVisibilidadCeldaEliminarTipoGlobalCliente=this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonEliminarTipoGlobalCliente.isVisible();
			this.isVisibilidadCeldaCancelarTipoGlobalCliente=this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonCancelarTipoGlobalCliente.isVisible();
			this.isVisibilidadCeldaGuardarTipoGlobalCliente=this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonGuardarCambiosTipoGlobalCliente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoGlobalCliente=this.jButtonGuardarCambiosTablaTipoGlobalCliente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoGlobalCliente=this.jButtonNuevoToolBarTipoGlobalCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoGlobalCliente=this.jButtonNuevoRelacionesToolBarTipoGlobalCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) {
			this.isVisibilidadCeldaModificarTipoGlobalCliente=this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonModificarToolBarTipoGlobalCliente.isVisible();
			this.isVisibilidadCeldaActualizarTipoGlobalCliente=this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonActualizarToolBarTipoGlobalCliente.isVisible();
			this.isVisibilidadCeldaEliminarTipoGlobalCliente=this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonEliminarToolBarTipoGlobalCliente.isVisible();
			this.isVisibilidadCeldaCancelarTipoGlobalCliente=this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonCancelarToolBarTipoGlobalCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoGlobalCliente=this.jButtonGuardarCambiosToolBarTipoGlobalCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoGlobalCliente=this.jButtonGuardarCambiosTablaToolBarTipoGlobalCliente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoGlobalCliente=this.jMenuItemNuevoTipoGlobalCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoGlobalCliente=this.jMenuItemNuevoRelacionesTipoGlobalCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) {
			this.isVisibilidadCeldaModificarTipoGlobalCliente=this.jInternalFrameDetalleFormTipoGlobalCliente.jMenuItemModificarTipoGlobalCliente.isVisible();
			this.isVisibilidadCeldaActualizarTipoGlobalCliente=this.jInternalFrameDetalleFormTipoGlobalCliente.jMenuItemActualizarTipoGlobalCliente.isVisible();
			this.isVisibilidadCeldaEliminarTipoGlobalCliente=this.jInternalFrameDetalleFormTipoGlobalCliente.jMenuItemEliminarTipoGlobalCliente.isVisible();
			this.isVisibilidadCeldaCancelarTipoGlobalCliente=this.jInternalFrameDetalleFormTipoGlobalCliente.jMenuItemCancelarTipoGlobalCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoGlobalCliente=this.jMenuItemGuardarCambiosTipoGlobalCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoGlobalCliente=this.jMenuItemGuardarCambiosTablaTipoGlobalCliente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoGlobalCliente(Boolean esInicializar) {
		if(TipoGlobalClienteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoglobalclienteSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoGlobalCliente();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoGlobalCliente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoGlobalCliente() {
		this.jButtonNuevoTipoGlobalCliente.setVisible(this.isPermisoNuevoTipoGlobalCliente);			
		this.jButtonDuplicarTipoGlobalCliente.setVisible(this.isPermisoDuplicarTipoGlobalCliente);			
		this.jButtonCopiarTipoGlobalCliente.setVisible(this.isPermisoCopiarTipoGlobalCliente);			
		this.jButtonVerFormTipoGlobalCliente.setVisible(this.isPermisoVerFormTipoGlobalCliente);			
		
		this.jButtonAbrirOrderByTipoGlobalCliente.setVisible(this.isPermisoOrdenTipoGlobalCliente);					
		
		this.jButtonNuevoRelacionesTipoGlobalCliente.setVisible(this.isPermisoNuevoTipoGlobalCliente);			
		
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonModificarTipoGlobalCliente.setVisible(this.isPermisoActualizarTipoGlobalCliente);	
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonActualizarTipoGlobalCliente.setVisible(this.isPermisoActualizarTipoGlobalCliente);	
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonEliminarTipoGlobalCliente.setVisible(this.isPermisoEliminarTipoGlobalCliente);
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonCancelarTipoGlobalCliente.setVisible(this.isVisibilidadCeldaCancelarTipoGlobalCliente);						
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonGuardarCambiosTipoGlobalCliente.setVisible(this.isPermisoGuardarCambiosTipoGlobalCliente);							
		}
		
		this.jButtonGuardarCambiosTablaTipoGlobalCliente.setVisible(this.isPermisoActualizarTipoGlobalCliente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoGlobalCliente() {
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonModificarTipoGlobalCliente.setVisible(this.isPermisoActualizarTipoGlobalCliente);	
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonActualizarTipoGlobalCliente.setVisible(this.isPermisoActualizarTipoGlobalCliente);	
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonEliminarTipoGlobalCliente.setVisible(this.isPermisoEliminarTipoGlobalCliente);
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonCancelarTipoGlobalCliente.setVisible(this.isVisibilidadCeldaCancelarTipoGlobalCliente);							
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonGuardarCambiosTipoGlobalCliente.setVisible((this.isVisibilidadCeldaGuardarTipoGlobalCliente && this.isPermisoGuardarCambiosTipoGlobalCliente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoGlobalCliente() {
		if(TipoGlobalClienteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoGlobalCliente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoGlobalCliente() {
	}
	
	public void jTableDatosTipoGlobalClienteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoGlobalCliente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoGlobalClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGlobalCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGlobalCliente(this.gettipoglobalcliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGlobalCliente(this.tipoglobalcliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoglobalcliente==null) {
						this.tipoglobalcliente = new TipoGlobalCliente();
					}

					this.setVariablesFormularioToObjetoActualTipoGlobalCliente(this.tipoglobalcliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGlobalCliente(this.tipoglobalcliente);
				}

				if(this.tipoglobalcliente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoglobalcliente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGlobalCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoGlobalClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGlobalCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGlobalCliente(this.gettipoglobalcliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGlobalCliente(this.tipoglobalcliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoglobalcliente==null) {
						this.tipoglobalcliente = new TipoGlobalCliente();
					}

					this.setVariablesFormularioToObjetoActualTipoGlobalCliente(this.tipoglobalcliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGlobalCliente(this.tipoglobalcliente);
				}

				if(this.tipoglobalcliente.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoglobalcliente.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGlobalCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoGlobalClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGlobalCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGlobalCliente(this.gettipoglobalcliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGlobalCliente(this.tipoglobalcliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoglobalcliente==null) {
						this.tipoglobalcliente = new TipoGlobalCliente();
					}

					this.setVariablesFormularioToObjetoActualTipoGlobalCliente(this.tipoglobalcliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGlobalCliente(this.tipoglobalcliente);
				}

				if(this.tipoglobalcliente.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoglobalcliente.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGlobalCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoGlobalCliente() {
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) {
		

		if(this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) {
			this.jInternalFrameDetalleFormTipoGlobalCliente.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoGlobalCliente.dispose();
			this.jInternalFrameDetalleFormTipoGlobalCliente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoGlobalCliente!=null) {
			this.jInternalFrameReporteDinamicoTipoGlobalCliente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoGlobalCliente.dispose();
			this.jInternalFrameReporteDinamicoTipoGlobalCliente=null;
		}
		
		if(this.jInternalFrameImportacionTipoGlobalCliente!=null) {
			this.jInternalFrameImportacionTipoGlobalCliente.setVisible(false);	    			
			this.jInternalFrameImportacionTipoGlobalCliente.dispose();
			this.jInternalFrameImportacionTipoGlobalCliente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoGlobalCliente();
			
			TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoGlobalCliente")) {
				jButtonNuevoTipoGlobalClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoGlobalCliente")) {
				jButtonDuplicarTipoGlobalClienteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoGlobalCliente")) {
				jButtonCopiarTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoGlobalCliente")) {
				jButtonVerFormTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoGlobalCliente")) {
				jButtonNuevoTipoGlobalClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoGlobalCliente")) {
				jButtonDuplicarTipoGlobalClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoGlobalCliente")) {
				jButtonNuevoTipoGlobalClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoGlobalCliente")) {
				jButtonDuplicarTipoGlobalClienteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoGlobalCliente")) {
				jButtonNuevoTipoGlobalClienteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoGlobalCliente")) {
				jButtonNuevoTipoGlobalClienteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoGlobalCliente")) {
				jButtonNuevoTipoGlobalClienteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoGlobalCliente")) {
				jButtonModificarTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoGlobalCliente")) {
				jButtonModificarTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoGlobalCliente")) {
				jButtonModificarTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoGlobalCliente")) {
				jButtonActualizarTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoGlobalCliente")) {
				jButtonActualizarTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoGlobalCliente")) {
				jButtonActualizarTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoGlobalCliente")) {
				jButtonEliminarTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoGlobalCliente")) {
				jButtonEliminarTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoGlobalCliente")) {
				jButtonEliminarTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoGlobalCliente")) {
				jButtonCancelarTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoGlobalCliente")) {
				jButtonCancelarTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoGlobalCliente")) {
				jButtonCancelarTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoGlobalCliente")) {
				jButtonCerrarTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoGlobalCliente")) {
				jButtonCerrarTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoGlobalCliente")) {
				jButtonCerrarTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoGlobalCliente")) {
				jButtonMostrarOcultarTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoGlobalCliente")) {
				jButtonCancelarTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoGlobalCliente")) {
				jButtonGuardarCambiosTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoGlobalCliente")) {
				jButtonGuardarCambiosTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoGlobalCliente")) {
				jButtonCopiarTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoGlobalCliente")) {
				jButtonVerFormTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoGlobalCliente")) {
				jButtonGuardarCambiosTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoGlobalCliente")) {
				jButtonCopiarTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoGlobalCliente")) {
				jButtonVerFormTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoGlobalCliente")) {
				jButtonGuardarCambiosTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoGlobalCliente")) {
				jButtonGuardarCambiosTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoGlobalCliente")) {
				jButtonGuardarCambiosTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoGlobalCliente")) {
				jButtonRecargarInformacionTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoGlobalCliente")) {
				jButtonRecargarInformacionTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoGlobalCliente")) {
				jButtonRecargarInformacionTipoGlobalClienteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoGlobalCliente")) {
				jButtonAnterioresTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoGlobalCliente")) {
				jButtonAnterioresTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoGlobalCliente")) {
				jButtonAnterioresTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoGlobalCliente")) {
				jButtonSiguientesTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoGlobalCliente")) {
				jButtonSiguientesTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoGlobalCliente")) {
				jButtonSiguientesTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoGlobalCliente") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoGlobalCliente")) {
				jButtonAbrirOrderByTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoGlobalCliente") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoGlobalCliente")) {
				jButtonMostrarOcultarTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoGlobalCliente")) {
				jButtonNuevoGuardarCambiosTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoGlobalCliente")) {
				jButtonNuevoGuardarCambiosTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoGlobalCliente")) {
				jButtonNuevoGuardarCambiosTipoGlobalClienteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoGlobalCliente")) {
				jButtonCerrarReporteDinamicoTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoGlobalCliente")) {
				jButtonGenerarReporteDinamicoTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoGlobalCliente")) {
				
				jButtonGenerarExcelReporteDinamicoTipoGlobalClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoGlobalCliente")) {
				jButtonCerrarImportacionTipoGlobalClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoGlobalCliente")) {
				
				jButtonGenerarImportacionTipoGlobalClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoGlobalCliente")) {
				
				jButtonAbrirImportacionTipoGlobalClienteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoGlobalCliente")) {
				jComboBoxTiposAccionesTipoGlobalClienteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoGlobalCliente")) {
				jComboBoxTiposRelacionesTipoGlobalClienteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoGlobalCliente")) {
				jComboBoxTiposAccionesTipoGlobalClienteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoGlobalCliente")) {
				
				jComboBoxTiposSeleccionarTipoGlobalClienteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoGlobalCliente")) {
				jTextFieldValorCampoGeneralTipoGlobalClienteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoGlobalCliente")) {
				jButtonAbrirOrderByTipoGlobalClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoGlobalCliente")) {
				jButtonAbrirOrderByTipoGlobalClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoGlobalCliente")) {
				jButtonCerrarOrderByTipoGlobalClienteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoGlobalClienteBusqueda")) {
				this.jButtonidTipoGlobalClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoGlobalClienteBusqueda")) {
				this.jButtoncodigoTipoGlobalClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoGlobalClienteBusqueda")) {
				this.jButtonnombreTipoGlobalClienteBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoGlobalCliente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGlobalClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoglobalcliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoglobalcliente);
				
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
				
				


				
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGlobalCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGlobalCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoGlobalCliente tipoglobalclienteLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoglobalclienteLocal=this.tipoglobalcliente;
			} else {
				tipoglobalclienteLocal=this.tipoglobalclienteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoglobalcliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoglobalcliente);
				
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
							
				
				


				
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGlobalCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGlobalCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGlobalClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGlobalCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalclienteAnterior =(TipoGlobalCliente) this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoglobalclienteAnterior =(TipoGlobalCliente) this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
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
			
			TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
			
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
			
			


			
			TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGlobalClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoglobalcliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoglobalcliente);
				
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
								
						
				


				
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGlobalCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGlobalCliente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoglobalcliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoglobalcliente);
				
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
								
				
				


				
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGlobalCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGlobalCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGlobalClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGlobalCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalclienteAnterior =(TipoGlobalCliente) this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoglobalclienteAnterior =(TipoGlobalCliente) this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoglobalcliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoglobalcliente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGlobalClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGlobalCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalclienteAnterior =(TipoGlobalCliente) this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoglobalclienteAnterior =(TipoGlobalCliente) this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGlobalClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoglobalcliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoglobalcliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoglobalcliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoglobalcliente);
				
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
							
				
				


				
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGlobalCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGlobalCliente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGlobalClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoGlobalCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoglobalclienteAnterior =(TipoGlobalCliente) this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoglobalclienteAnterior =(TipoGlobalCliente) this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
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
			
			TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
			
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
			
			


			
			TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGlobalClienteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoglobalcliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoglobalcliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoglobalcliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoglobalcliente);
				
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
								
				
				


				
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGlobalCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGlobalCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGlobalClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGlobalCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalclienteAnterior =(TipoGlobalCliente) this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoglobalclienteAnterior =(TipoGlobalCliente) this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGlobalClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoglobalcliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoglobalcliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGlobalClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoglobalcliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoglobalcliente);
				
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoGlobalCliente")) {
					jCheckBoxSeleccionarTodosTipoGlobalClienteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoGlobalCliente")) {
					jCheckBoxSeleccionadosTipoGlobalClienteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoGlobalCliente")) {
					
				}
				
				


				
				
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGlobalCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGlobalCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoglobalcliente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoglobalcliente);
				
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
												
				
				


				
				
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGlobalCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGlobalCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGlobalClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoGlobalCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoglobalclienteAnterior =(TipoGlobalCliente) this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoglobalclienteAnterior =(TipoGlobalCliente) this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGlobalClienteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoglobalcliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoglobalcliente);
				
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
				
				
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
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
			
			TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
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
			
			


			
			TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGlobalClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoglobalcliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoglobalcliente);
				
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGlobalCliente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGlobalCliente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoglobalcliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoglobalcliente);
				
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
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
				
				


				
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGlobalCliente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGlobalCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGlobalClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGlobalCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoglobalclienteAnterior =(TipoGlobalCliente) this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoglobalclienteAnterior =(TipoGlobalCliente) this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoGlobalCliente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoGlobalClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoGlobalCliente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoglobalcliente =(TipoGlobalCliente) this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoglobalcliente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoGlobalCliente")) {
				
				}
				
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoGlobalCliente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoGlobalCliente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoGlobalCliente")) {
			
			}
			
			TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoGlobalCliente();
			
			TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
			
			if(sTipo.equals("NuevoTipoGlobalCliente")) {
				jButtonNuevoTipoGlobalClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoGlobalCliente")) {
				jButtonDuplicarTipoGlobalClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoGlobalCliente")) {
				jButtonCopiarTipoGlobalClienteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoGlobalCliente")) {
				jButtonVerFormTipoGlobalClienteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoGlobalCliente")) {
				jButtonNuevoTipoGlobalClienteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoGlobalCliente")) {
				jButtonModificarTipoGlobalClienteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoGlobalCliente")) {
				jButtonActualizarTipoGlobalClienteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoGlobalCliente")) {
				jButtonEliminarTipoGlobalClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoGlobalCliente")) {
				jButtonGuardarCambiosTipoGlobalClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoGlobalCliente")) {
				jButtonCancelarTipoGlobalClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoGlobalCliente")) {
				jButtonCerrarTipoGlobalClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoGlobalCliente")) {
				jButtonGuardarCambiosTipoGlobalClienteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoGlobalCliente")) {
				jButtonNuevoGuardarCambiosTipoGlobalClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoGlobalCliente")) {
				jButtonAbrirOrderByTipoGlobalClienteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoGlobalCliente")) {
				jButtonRecargarInformacionTipoGlobalClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoGlobalCliente")) {
				jButtonAnterioresTipoGlobalClienteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoGlobalCliente")) {
				jButtonSiguientesTipoGlobalClienteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoGlobalClienteBusqueda")) {
				this.jButtonidTipoGlobalClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoGlobalClienteBusqueda")) {
				this.jButtoncodigoTipoGlobalClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoGlobalClienteBusqueda")) {
				this.jButtonnombreTipoGlobalClienteBusquedaActionPerformed(evt);
			}
			
			TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoGlobalCliente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoGlobalCliente")) {
				closingInternalFrameTipoGlobalCliente();
				
			} else if(sTipo.equals("jButtonCancelarTipoGlobalCliente")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoGlobalCliente = (JInternalFrameBase)evt.getSource();
	            	
	            TipoGlobalClienteBeanSwingJInternalFrame jInternalFrameParent=(TipoGlobalClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoGlobalCliente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoGlobalClienteActionPerformed(null);
			}
			
			TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoglobalcliente,new Object(),this.tipoglobalclienteParameterGeneral,this.tipoglobalclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoGlobalCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoGlobalCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoGlobalCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoglobalcliente)) {
			if(!esControlTabla) {
				if(TipoGlobalClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoGlobalCliente(this.tipoglobalcliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGlobalCliente(this.tipoglobalcliente);			
				}
				
				if(this.tipoglobalclienteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoGlobalCliente(this.tipoglobalcliente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoglobalclienteReturnGeneral=tipoglobalclienteLogic.procesarEventosTipoGlobalClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoglobalclienteLogic.getTipoGlobalClientes(),this.tipoglobalcliente,this.tipoglobalclienteParameterGeneral,this.isEsNuevoTipoGlobalCliente,classes);//this.tipoglobalclienteLogic.getTipoGlobalCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoGlobalCliente(this.tipoglobalclienteReturnGeneral,this.tipoglobalclienteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoglobalclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoGlobalCliente(classes,this.tipoglobalclienteReturnGeneral,this.tipoglobalclienteBean,false);
					}
						
					if(this.tipoglobalclienteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoGlobalCliente(this.tipoglobalclienteReturnGeneral.getTipoGlobalCliente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoGlobalCliente(this.tipoglobalclienteReturnGeneral.getTipoGlobalCliente());	
					}
						
					if(this.tipoglobalclienteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoGlobalCliente(this.tipoglobalclienteReturnGeneral.getTipoGlobalCliente(),classes);//this.tipoglobalclienteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoGlobalCliente(this.tipoglobalcliente,classes);//this.tipoglobalclienteBean);									
				}
			
				if(TipoGlobalClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoGlobalCliente(this.tipoglobalcliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGlobalCliente(this.tipoglobalcliente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoglobalclienteAnterior!=null) {
						this.tipoglobalcliente=this.tipoglobalclienteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoglobalclienteReturnGeneral=tipoglobalclienteLogic.procesarEventosTipoGlobalClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoglobalclienteLogic.getTipoGlobalClientes(),this.tipoglobalcliente,this.tipoglobalclienteParameterGeneral,this.isEsNuevoTipoGlobalCliente,classes);//this.tipoglobalclienteLogic.getTipoGlobalCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoglobalclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoglobalclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoglobalclienteReturnGeneral.getTipoGlobalCliente(),tipoglobalclienteLogic.getTipoGlobalClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoglobalclienteReturnGeneral.getTipoGlobalCliente(),this.tipoglobalclientes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoGlobalCliente.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoGlobalCliente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoGlobalCliente();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoGlobalCliente() throws Exception {
		
		TipoGlobalClienteModel tipoglobalclienteModel=(TipoGlobalClienteModel)this.jTableDatosTipoGlobalCliente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoglobalclienteModel.tipoglobalclientes=this.tipoglobalclienteLogic.getTipoGlobalClientes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoglobalclienteModel.tipoglobalclientes=this.tipoglobalclientes;
		}
		
		
		((TipoGlobalClienteModel) this.jTableDatosTipoGlobalCliente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoGlobalCliente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoglobalclienteAnterior(),this.tipoglobalclienteLogic.getTipoGlobalClientes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoglobalclienteAnterior(),this.tipoglobalclientes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoGlobalCliente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoGlobalCliente(TipoGlobalCliente tipoglobalcliente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Definicion.class)) {
					this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame.definicionLogic.setDefinicions(tipoglobalcliente.getDefinicions());
					this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDefinicion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
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
										
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoglobalcliente,new Object(),generalEntityParameterGeneral,this.tipoglobalclienteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoglobalclienteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoGlobalClienteConstantesFunciones.getClassesRelationshipsOfTipoGlobalCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoGlobalClienteConstantesFunciones.getClassesRelationshipsFromStringsOfTipoGlobalCliente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoGlobalCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoGlobalClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoglobalcliente,new Object(),generalEntityParameterGeneral,this.tipoglobalclienteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoGlobalCliente(TipoGlobalClienteBean tipoglobalclienteBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Definicion.class)) {
					this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame.definicionLogic.setDefinicions(tipoglobalcliente.getDefinicions());
					this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDefinicion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoGlobalCliente(ArrayList<Classe> classes,TipoGlobalClienteReturnGeneral tipoglobalclienteReturnGeneral,TipoGlobalClienteBean tipoglobalclienteBean,Boolean conDefault) throws Exception {
		
			this.tipoglobalclienteBean.setDefinicions(tipoglobalclienteReturnGeneral.getTipoGlobalCliente().getDefinicions());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoGlobalCliente(TipoGlobalCliente tipoglobalcliente,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Definicion.class)) {
					tipoglobalcliente.setDefinicions(this.jInternalFrameDetalleFormTipoGlobalCliente.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoglobalcliente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoGlobalCliente = new TipoGlobalClienteDetalleFormJInternalFrame(jDesktopPane,this.tipoglobalclienteSessionBean.getConGuardarRelaciones(),this.tipoglobalclienteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoGlobalCliente);
		this.jInternalFrameDetalleFormTipoGlobalCliente.setVisible(false);
		this.jInternalFrameDetalleFormTipoGlobalCliente.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoGlobalCliente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoGlobalCliente.tipoglobalclienteLogic=this.tipoglobalclienteLogic;
		
		this.cargarCombosFrameForeignKeyTipoGlobalCliente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoGlobalCliente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoGlobalCliente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoGlobalCliente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoGlobalCliente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoGlobalCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoGlobalCliente"));
		
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonModificarTipoGlobalCliente.addActionListener(new ButtonActionListener(this,"ModificarTipoGlobalCliente"));

		
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonModificarToolBarTipoGlobalCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoGlobalCliente"));
					
		this.jInternalFrameDetalleFormTipoGlobalCliente.jMenuItemModificarTipoGlobalCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoGlobalCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonActualizarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"ActualizarTipoGlobalCliente"));
		
		
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonActualizarToolBarTipoGlobalCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoGlobalCliente"));
						
		this.jInternalFrameDetalleFormTipoGlobalCliente.jMenuItemActualizarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoGlobalCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonEliminarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"EliminarTipoGlobalCliente"));
		
		
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonEliminarToolBarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoGlobalCliente"));
								
		this.jInternalFrameDetalleFormTipoGlobalCliente.jMenuItemEliminarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoGlobalCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonCancelarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"CancelarTipoGlobalCliente"));
		
		
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonCancelarToolBarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoGlobalCliente"));
					
		this.jInternalFrameDetalleFormTipoGlobalCliente.jMenuItemCancelarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoGlobalCliente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoGlobalCliente.jMenuItemDetalleCerrarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoGlobalCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonGuardarCambiosToolBarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGlobalCliente"));
		
		
		
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonGuardarCambiosToolBarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGlobalCliente"));
		
		
		
		this.jInternalFrameDetalleFormTipoGlobalCliente.jComboBoxTiposAccionesFormularioTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoGlobalCliente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonidTipoGlobalClienteBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGlobalClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtoncodigoTipoGlobalClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoGlobalClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonnombreTipoGlobalClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGlobalClienteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoGlobalCliente.jTabbedPaneRelacionesTipoGlobalCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoGlobalCliente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoGlobalCliente"));
		
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGlobalCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoGlobalCliente"));
		}
		
		this.jTableDatosTipoGlobalCliente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoGlobalCliente"));
		
		this.jTableDatosTipoGlobalCliente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoGlobalCliente"));
		
		this.jButtonNuevoTipoGlobalCliente.addActionListener(new ButtonActionListener(this,"NuevoTipoGlobalCliente"));
		
		this.jButtonDuplicarTipoGlobalCliente.addActionListener(new ButtonActionListener(this,"DuplicarTipoGlobalCliente"));
		
		this.jButtonCopiarTipoGlobalCliente.addActionListener(new ButtonActionListener(this,"CopiarTipoGlobalCliente"));
		
		this.jButtonVerFormTipoGlobalCliente.addActionListener(new ButtonActionListener(this,"VerFormTipoGlobalCliente"));
		
		
		this.jButtonNuevoToolBarTipoGlobalCliente.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoGlobalCliente"));
			
		this.jButtonDuplicarToolBarTipoGlobalCliente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoGlobalCliente"));
			
		this.jMenuItemNuevoTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoGlobalCliente"));
			
		this.jMenuItemDuplicarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoGlobalCliente"));		
		
		
		this.jButtonNuevoRelacionesTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoGlobalCliente"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoGlobalCliente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoGlobalCliente"));
			
		this.jMenuItemNuevoRelacionesTipoGlobalCliente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoGlobalCliente"));		
		
		
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonModificarTipoGlobalCliente.addActionListener(new ButtonActionListener(this,"ModificarTipoGlobalCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonModificarToolBarTipoGlobalCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoGlobalCliente"));
			
			this.jInternalFrameDetalleFormTipoGlobalCliente.jMenuItemModificarTipoGlobalCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoGlobalCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonActualizarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"ActualizarTipoGlobalCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonActualizarToolBarTipoGlobalCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoGlobalCliente"));
				
			this.jInternalFrameDetalleFormTipoGlobalCliente.jMenuItemActualizarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoGlobalCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonEliminarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"EliminarTipoGlobalCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonEliminarToolBarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoGlobalCliente"));
						
			this.jInternalFrameDetalleFormTipoGlobalCliente.jMenuItemEliminarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoGlobalCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonCancelarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"CancelarTipoGlobalCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonCancelarToolBarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoGlobalCliente"));
			
			this.jInternalFrameDetalleFormTipoGlobalCliente.jMenuItemCancelarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoGlobalCliente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoGlobalCliente"));		
		
		
		this.jButtonCerrarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"CerrarTipoGlobalCliente"));
		
		
		this.jButtonCerrarToolBarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoGlobalCliente"));
			
		this.jMenuItemCerrarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoGlobalCliente"));
			
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGlobalCliente.jMenuItemDetalleCerrarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoGlobalCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonGuardarCambiosTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoGlobalCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonGuardarCambiosToolBarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGlobalCliente"));
		}
		
		this.jButtonCopiarToolBarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoGlobalCliente"));
			
		this.jButtonVerFormToolBarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoGlobalCliente"));
		
		this.jMenuItemGuardarCambiosTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoGlobalCliente"));
			
		this.jMenuItemCopiarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoGlobalCliente"));		
		
		this.jMenuItemVerFormTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoGlobalCliente"));		
		
		
		this.jButtonGuardarCambiosTablaTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoGlobalCliente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoGlobalCliente"));
			
		this.jMenuItemGuardarCambiosTablaTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoGlobalCliente"));		
		
		
		
		this.jButtonRecargarInformacionTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoGlobalCliente"));
					
		this.jButtonRecargarInformacionToolBarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoGlobalCliente"));
		
		this.jMenuItemRecargarInformacionTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoGlobalCliente"));		
		
		
		
		this.jButtonAnterioresTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"AnterioresTipoGlobalCliente"));
		
		
		this.jButtonAnterioresToolBarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoGlobalCliente"));
		
		this.jMenuItemAnterioresTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoGlobalCliente"));		
		
		
		this.jButtonSiguientesTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"SiguientesTipoGlobalCliente"));
		
		
		this.jButtonSiguientesToolBarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoGlobalCliente"));
			
		this.jMenuItemSiguientesTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoGlobalCliente"));
			
		this.jMenuItemAbrirOrderByTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoGlobalCliente"));
			
		this.jMenuItemMostrarOcultarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoGlobalCliente"));
			
		this.jMenuItemDetalleAbrirOrderByTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoGlobalCliente"));
			
		this.jMenuItemDetalleMostarOcultarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoGlobalCliente"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoGlobalCliente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoGlobalCliente"));
			
		this.jMenuItemNuevoGuardarCambiosTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoGlobalCliente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoGlobalCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoGlobalCliente"));

		this.jCheckBoxSeleccionadosTipoGlobalCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoGlobalCliente"));
		
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGlobalCliente.jComboBoxTiposAccionesFormularioTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoGlobalCliente"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoGlobalCliente"));
			
		this.jComboBoxTiposAccionesTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoGlobalCliente"));
					
		this.jComboBoxTiposSeleccionarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoGlobalCliente"));
			
		this.jTextFieldValorCampoGeneralTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoGlobalCliente"));		
		
		
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonidTipoGlobalClienteBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGlobalClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtoncodigoTipoGlobalClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoGlobalClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonnombreTipoGlobalClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGlobalClienteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoGlobalCliente!=null) {
				this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGlobalCliente"));
				this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGlobalCliente"));
				this.jInternalFrameReporteDinamicoTipoGlobalCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGlobalCliente"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGlobalCliente"));				
			//this.jButtonGenerarReporteDinamicoTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGlobalCliente"));
			//this.jButtonGenerarExcelReporteDinamicoTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGlobalCliente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoGlobalCliente!=null) {
				this.jInternalFrameImportacionTipoGlobalCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoGlobalCliente"));
				this.jInternalFrameImportacionTipoGlobalCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoGlobalCliente"));
				this.jInternalFrameImportacionTipoGlobalCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoGlobalCliente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoGlobalCliente"));
			
			this.jButtonAbrirOrderByToolBarTipoGlobalCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoGlobalCliente"));			
			
			if(this.jInternalFrameOrderByTipoGlobalCliente!=null) {
				this.jInternalFrameOrderByTipoGlobalCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoGlobalCliente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGlobalCliente.jTabbedPaneRelacionesTipoGlobalCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoGlobalCliente"));
		
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
            		closingInternalFrameTipoGlobalCliente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoGlobalCliente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoGlobalCliente = (JInternalFrameBase)event.getSource();
	            	
	            TipoGlobalClienteBeanSwingJInternalFrame jInternalFrameParent=(TipoGlobalClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoGlobalCliente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoGlobalClienteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoGlobalCliente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoGlobalClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoGlobalCliente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoGlobalCliente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGlobalClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGlobalClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGlobalClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoGlobalCliente";
		inputMap = this.jButtonNuevoTipoGlobalCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoGlobalCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoGlobalClienteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGlobalClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGlobalClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGlobalClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoGlobalCliente";
		inputMap = this.jButtonNuevoRelacionesTipoGlobalCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoGlobalCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoGlobalClienteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoGlobalCliente";
		inputMap = this.jButtonModificarTipoGlobalCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoGlobalCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoGlobalClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoGlobalCliente";
		inputMap = this.jButtonActualizarTipoGlobalCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoGlobalCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoGlobalClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoGlobalCliente";
		inputMap = this.jButtonEliminarTipoGlobalCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoGlobalCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoGlobalClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoGlobalCliente";
		inputMap = this.jButtonCancelarTipoGlobalCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoGlobalCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoGlobalClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoGlobalCliente";
		inputMap = this.jButtonCerrarTipoGlobalCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoGlobalCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoGlobalClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonGuardarCambiosTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoGlobalCliente";
		inputMap = this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonGuardarCambiosTipoGlobalCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonGuardarCambiosTipoGlobalCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoGlobalClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoGlobalCliente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoGlobalClienteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoGlobalCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoGlobalClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoGlobalCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoGlobalClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoGlobalCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoGlobalClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonidTipoGlobalClienteBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGlobalClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtoncodigoTipoGlobalClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoGlobalClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGlobalCliente.jButtonnombreTipoGlobalClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGlobalClienteBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoGlobalCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoGlobalClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoGlobalClienteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoGlobalCliente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoGlobalCliente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoGlobalCliente tipoglobalclienteAux:this.tipoglobalclienteLogic.getTipoGlobalClientes()) {
					tipoglobalclienteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGlobalCliente tipoglobalclienteAux:tipoglobalclientes) {
					tipoglobalclienteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoGlobalClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoGlobalCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoGlobalCliente tipoglobalclienteAux:this.tipoglobalclienteLogic.getTipoGlobalClientes()) {
						tipoglobalclienteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGlobalCliente tipoglobalclienteAux:tipoglobalclientes) {
						tipoglobalclienteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoGlobalCliente tipoglobalclienteAux:this.tipoglobalclienteLogic.getTipoGlobalClientes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGlobalCliente tipoglobalclienteAux:tipoglobalclientes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoGlobalCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoGlobalCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoGlobalCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoGlobalCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoGlobalClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoGlobalCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoGlobalCliente.getSelectedRows();
			
			TipoGlobalCliente tipoglobalclienteLocal=new TipoGlobalCliente();
			
			//this.seleccionarTodosTipoGlobalCliente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoglobalclienteLocal =(TipoGlobalCliente) this.tipoglobalclienteLogic.getTipoGlobalClientes().toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoglobalclienteLocal =(TipoGlobalCliente) this.tipoglobalclientes.toArray()[this.jTableDatosTipoGlobalCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoglobalclienteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoGlobalCliente tipoglobalclienteAux:this.tipoglobalclienteLogic.getTipoGlobalClientes()) {
						tipoglobalclienteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGlobalCliente tipoglobalclienteAux:tipoglobalclientes) {
						tipoglobalclienteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoGlobalCliente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoGlobalCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoGlobalCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoGlobalCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoGlobalClienteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoGlobalClienteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoGlobalClienteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoGlobalCliente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoGlobalCliente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoGlobalCliente tipoglobalclienteAux:this.tipoglobalclienteLogic.getTipoGlobalClientes()) {
				
						if(sTipoSeleccionar.equals(TipoGlobalClienteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoglobalclienteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoGlobalClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoglobalclienteAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGlobalCliente tipoglobalclienteAux:tipoglobalclientes) {
					
						if(sTipoSeleccionar.equals(TipoGlobalClienteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoglobalclienteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoGlobalClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoglobalclienteAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoGlobalCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoGlobalClienteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoGlobalCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoGlobalCliente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoGlobalCliente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoGlobalCliente.jComboBoxTiposAccionesFormularioTipoGlobalCliente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoGlobalCliente) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoGlobalCliente(conSplash);
				
					this.generarReporteTipoGlobalClientesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGlobalCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGlobalCliente.jComboBoxTiposAccionesFormularioTipoGlobalCliente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoGlobalClientesSeleccionados();
				//this.jComboBoxTiposAccionesTipoGlobalCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoGlobalClientesSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoGlobalCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoGlobalClientesSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoGlobalCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoGlobalCliente();
				
				this.exportarTipoGlobalClientesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGlobalCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGlobalCliente.jComboBoxTiposAccionesFormularioTipoGlobalCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoGlobalClientes();
				//this.importarTipoGlobalClientes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGlobalCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGlobalCliente.jComboBoxTiposAccionesFormularioTipoGlobalCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoGlobalCliente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoGlobalClientesSeleccionados();
				//this.jComboBoxTiposAccionesTipoGlobalCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Global Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoGlobalCliente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoGlobalCliente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoGlobalCliente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Global Cliente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGlobalCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGlobalCliente.jComboBoxTiposAccionesFormularioTipoGlobalCliente.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoGlobalCliente();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoGlobalCliente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoGlobalClienteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoGlobalCliente();
			
			if(this.jInternalFrameDetalleFormTipoGlobalCliente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoGlobalCliente> tipoglobalclientesSeleccionados=new ArrayList<TipoGlobalCliente>();		
			TipoGlobalCliente tipoglobalcliente=new TipoGlobalCliente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoGlobalCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoGlobalCliente.getSelectedItem();
			
			
			
			
			tipoglobalclientesSeleccionados=this.getTipoGlobalClientesSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoglobalclientesSeleccionados.size()==1) {
				for(TipoGlobalCliente tipoglobalclienteAux:tipoglobalclientesSeleccionados) {
					tipoglobalcliente=tipoglobalclienteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Definicion")) {
					jButtonDefinicionActionPerformed(null,rowIndex,true,false,tipoglobalcliente);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoGlobalCliente();
			
      		//this.finishProcessTipoGlobalCliente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoGlobalClienteReturnGeneral() throws Exception {
		if(this.tipoglobalclienteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoglobalclienteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoglobalclienteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoglobalclienteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoglobalclienteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoglobalclienteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoGlobalCliente(false);
		}
		
		if(this.tipoglobalclienteReturnGeneral.getConRetornoLista() || this.tipoglobalclienteReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoglobalclienteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoglobalclienteLogic.setTipoGlobalClientes(this.tipoglobalclienteReturnGeneral.getTipoGlobalClientes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoglobalclienteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoglobalclienteLogic.setTipoGlobalCliente(this.tipoglobalclienteReturnGeneral.getTipoGlobalCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoGlobalCliente(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoGlobalCliente() throws Exception {
		
		
	}
	
	public ArrayList<TipoGlobalCliente> getTipoGlobalClientesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoGlobalCliente> tipoglobalclientesSeleccionados=new ArrayList<TipoGlobalCliente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoGlobalCliente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoGlobalCliente tipoglobalclienteAux:tipoglobalclienteLogic.getTipoGlobalClientes()) {
					if(tipoglobalclienteAux.getIsSelected()) {
						tipoglobalclientesSeleccionados.add(tipoglobalclienteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGlobalCliente tipoglobalclienteAux:this.tipoglobalclientes) {
					if(tipoglobalclienteAux.getIsSelected()) {
						tipoglobalclientesSeleccionados.add(tipoglobalclienteAux);				
					}
				}
			}
			
			if(tipoglobalclientesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoglobalclientesSeleccionados.addAll(this.tipoglobalclienteLogic.getTipoGlobalClientes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoglobalclientesSeleccionados.addAll(this.tipoglobalclientes);				
					}
				}
			}
		} else {
			tipoglobalclientesSeleccionados.add(this.tipoglobalcliente);
		}
		
		return tipoglobalclientesSeleccionados;
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
	
	public void generarReporteTipoGlobalClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoGlobalClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoGlobalClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoGlobalClientesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoGlobalClientesSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoGlobalClientesSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Global Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoGlobalClientesSeleccionados() throws Exception {
		ArrayList<TipoGlobalCliente> tipoglobalclientesSeleccionados=new ArrayList<TipoGlobalCliente>();		
		
		tipoglobalclientesSeleccionados=this.getTipoGlobalClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoGlobalClientes("Todos",tipoglobalclientesSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoGlobalClientesSeleccionados() throws Exception {
		ArrayList<TipoGlobalCliente> tipoglobalclientesSeleccionados=new ArrayList<TipoGlobalCliente>();		
		
		tipoglobalclientesSeleccionados=this.getTipoGlobalClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoGlobalClientes("Todos",tipoglobalclientesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoGlobalClientesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoGlobalCliente> tipoglobalclientesSeleccionados=new ArrayList<TipoGlobalCliente>();
		
		tipoglobalclientesSeleccionados=this.getTipoGlobalClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoGlobalClientes("Todos",tipoglobalclientesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoGlobalClientesSeleccionados() throws Exception {
		ArrayList<TipoGlobalCliente> tipoglobalclientesSeleccionados=new ArrayList<TipoGlobalCliente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoGlobalCliente();
		
		
		tipoglobalclientesSeleccionados=this.getTipoGlobalClientesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoGlobalCliente();
		
		
		//this.generarReporteTipoGlobalClientes("Todos",tipoglobalclientesSeleccionados ,tipoglobalclienteImplementable,tipoglobalclienteImplementableHome);
	}
	
	public void mostrarImportacionTipoGlobalClientes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoGlobalCliente();
		
		this.abrirFrameImportacionTipoGlobalCliente();		
		
			
		//this.generarReporteTipoGlobalClientes("Todos",tipoglobalclientesSeleccionados ,tipoglobalclienteImplementable,tipoglobalclienteImplementableHome);
	}
	
	public void importarTipoGlobalClientes() throws Exception {		
	
	}
	
	public void exportarTipoGlobalClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoGlobalClientesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoGlobalClientesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoGlobalClientesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Global Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoGlobalClientesSeleccionados() throws Exception {
		ArrayList<TipoGlobalCliente> tipoglobalclientesSeleccionados=new ArrayList<TipoGlobalCliente>();		
		
		tipoglobalclientesSeleccionados=this.getTipoGlobalClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoglobalcliente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoGlobalCliente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoGlobalCliente tipoglobalclienteAux:tipoglobalclientesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoGlobalCliente(tipoglobalclienteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoglobalclienteAux.setsDetalleGeneralEntityReporte(tipoglobalclienteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Global Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoGlobalCliente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoGlobalClienteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGlobalClienteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGlobalClienteConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGlobalClienteConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoGlobalCliente(TipoGlobalCliente tipoglobalcliente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoglobalcliente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoglobalcliente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoglobalcliente.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoglobalcliente.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoGlobalClientesSeleccionados() throws Exception {
		ArrayList<TipoGlobalCliente> tipoglobalclientesSeleccionados=new ArrayList<TipoGlobalCliente>();		
		
		tipoglobalclientesSeleccionados=this.getTipoGlobalClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoglobalcliente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoGlobalClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoGlobalCliente(row);				
				iRow++;
			}				
			
			for(TipoGlobalCliente tipoglobalclienteAux:tipoglobalclientesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoGlobalCliente(tipoglobalclienteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Global Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoGlobalClientesSeleccionados() throws Exception {
		ArrayList<TipoGlobalCliente> tipoglobalclientesSeleccionados=new ArrayList<TipoGlobalCliente>();		
		
		tipoglobalclientesSeleccionados=this.getTipoGlobalClientesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoglobalcliente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoglobalclientes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoglobalcliente");
			//elementRoot.appendChild(element);
		
			for(TipoGlobalCliente tipoglobalclienteAux:tipoglobalclientesSeleccionados) {
				element = document.createElement("tipoglobalcliente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoGlobalCliente(tipoglobalclienteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Global Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoGlobalCliente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGlobalClienteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGlobalClienteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoGlobalClienteConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGlobalClienteConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoGlobalCliente(TipoGlobalCliente tipoglobalcliente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoglobalcliente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoglobalcliente.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoglobalcliente.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoGlobalCliente(TipoGlobalCliente tipoglobalcliente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoGlobalClienteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoglobalcliente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoGlobalClienteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoglobalcliente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoGlobalClienteConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoglobalcliente.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoGlobalClienteConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoglobalcliente.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoGlobalClientesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoGlobalCliente> tipoglobalclientesSeleccionados=new ArrayList<TipoGlobalCliente>();
		
		tipoglobalclientesSeleccionados=this.getTipoGlobalClientesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoGlobalCliente(tipoglobalclientesSeleccionados);
		
		this.generarReporteTipoGlobalClientes("Todos",tipoglobalclientesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoGlobalCliente(ArrayList<TipoGlobalCliente> tipoglobalclientesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoGlobalCliente tipoglobalclienteAux:tipoglobalclientesSeleccionados) {
				tipoglobalclienteAux.setsDetalleGeneralEntityReporte(tipoglobalclienteAux.toString());
			
				if(sTipoSeleccionar.equals(TipoGlobalClienteConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoglobalclienteAux.setsDescripcionGeneralEntityReporte1(tipoglobalclienteAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoGlobalClienteConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoglobalclienteAux.setsDescripcionGeneralEntityReporte1(tipoglobalclienteAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGlobalClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoGlobalCliente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoGlobalCliente=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoGlobalCliente=true;
				this.isVisibilidadCeldaGuardarCambiosTipoGlobalCliente=true;
			}
			
			this.isVisibilidadCeldaModificarTipoGlobalCliente=false;
			this.isVisibilidadCeldaActualizarTipoGlobalCliente=false;
			this.isVisibilidadCeldaEliminarTipoGlobalCliente=false;
			this.isVisibilidadCeldaCancelarTipoGlobalCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGlobalCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGlobalCliente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoGlobalCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGlobalCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGlobalCliente=false;
			this.isVisibilidadCeldaModificarTipoGlobalCliente=false;
			this.isVisibilidadCeldaActualizarTipoGlobalCliente=true;
			this.isVisibilidadCeldaEliminarTipoGlobalCliente=false;
			this.isVisibilidadCeldaCancelarTipoGlobalCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGlobalCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGlobalCliente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoGlobalCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGlobalCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGlobalCliente=false;
			this.isVisibilidadCeldaModificarTipoGlobalCliente=false;
			this.isVisibilidadCeldaActualizarTipoGlobalCliente=true;
			this.isVisibilidadCeldaEliminarTipoGlobalCliente=true;
			this.isVisibilidadCeldaCancelarTipoGlobalCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGlobalCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGlobalCliente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoGlobalCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGlobalCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGlobalCliente=false;
			this.isVisibilidadCeldaModificarTipoGlobalCliente=false;
			this.isVisibilidadCeldaActualizarTipoGlobalCliente=true;
			this.isVisibilidadCeldaEliminarTipoGlobalCliente=false;
			this.isVisibilidadCeldaCancelarTipoGlobalCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGlobalCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGlobalCliente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoGlobalCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGlobalCliente=true;
			this.isVisibilidadCeldaGuardarCambiosTipoGlobalCliente=true;
			this.isVisibilidadCeldaModificarTipoGlobalCliente=false;
			this.isVisibilidadCeldaActualizarTipoGlobalCliente=false;
			this.isVisibilidadCeldaEliminarTipoGlobalCliente=false;
			this.isVisibilidadCeldaCancelarTipoGlobalCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGlobalCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGlobalCliente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoGlobalCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGlobalCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGlobalCliente=false;
			this.isVisibilidadCeldaActualizarTipoGlobalCliente=false;
			this.isVisibilidadCeldaEliminarTipoGlobalCliente=false;
			this.isVisibilidadCeldaCancelarTipoGlobalCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGlobalCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGlobalCliente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoGlobalCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGlobalCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGlobalCliente=false;
			this.isVisibilidadCeldaModificarTipoGlobalCliente=true;
			this.isVisibilidadCeldaActualizarTipoGlobalCliente=false;
			this.isVisibilidadCeldaEliminarTipoGlobalCliente=false;
			this.isVisibilidadCeldaCancelarTipoGlobalCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGlobalCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGlobalCliente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoGlobalClienteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoGlobalCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGlobalCliente=true;
			this.isVisibilidadCeldaGuardarCambiosTipoGlobalCliente=true;
		} else {
			this.actualizarEstadoPanelsTipoGlobalCliente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoGlobalCliente=false;
			//this.isVisibilidadCeldaVerFormTipoGlobalCliente=false;
			this.isVisibilidadCeldaDuplicarTipoGlobalCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoglobalclienteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoGlobalCliente=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoGlobalCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGlobalCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
			if(!tipoglobalclienteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoGlobalCliente=false;												
			}
			
			this.jButtonCerrarTipoGlobalCliente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoGlobalCliente=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoglobalcliente)) {
			this.isVisibilidadCeldaActualizarTipoGlobalCliente=false;
			this.isVisibilidadCeldaEliminarTipoGlobalCliente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoGlobalCliente() {
		this.isVisibilidadCeldaNuevoTipoGlobalCliente=false;
		this.isVisibilidadCeldaGuardarCambiosTipoGlobalCliente=false;
	}
	
	public void actualizarEstadoPanelsTipoGlobalCliente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoGlobalCliente!=null) {
				this.jScrollPanelDatosEdicionTipoGlobalCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoGlobalCliente!=null) {
				this.jScrollPanelDatosTipoGlobalCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGlobalCliente!=null) {
				this.jPanelPaginacionTipoGlobalCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGlobalCliente!=null) {
				this.jPanelParametrosReportesTipoGlobalCliente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoGlobalCliente!=null) {
				this.jScrollPanelDatosEdicionTipoGlobalCliente.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoGlobalCliente!=null) {
				this.jScrollPanelDatosTipoGlobalCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGlobalCliente!=null) {
				this.jPanelPaginacionTipoGlobalCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGlobalCliente!=null) {
				this.jPanelParametrosReportesTipoGlobalCliente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoGlobalCliente!=null) {
				this.jScrollPanelDatosEdicionTipoGlobalCliente.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoGlobalCliente!=null) {
				this.jScrollPanelDatosTipoGlobalCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGlobalCliente!=null) {
				this.jPanelPaginacionTipoGlobalCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGlobalCliente!=null) {
				this.jPanelParametrosReportesTipoGlobalCliente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoGlobalCliente!=null) {
				this.jScrollPanelDatosEdicionTipoGlobalCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGlobalCliente!=null) {
				this.jScrollPanelDatosTipoGlobalCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGlobalCliente!=null) {
				this.jPanelPaginacionTipoGlobalCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGlobalCliente!=null) {
				this.jPanelParametrosReportesTipoGlobalCliente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoGlobalCliente!=null) {
				this.jScrollPanelDatosEdicionTipoGlobalCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoGlobalCliente!=null) {
				this.jScrollPanelDatosTipoGlobalCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGlobalCliente!=null) {
				this.jPanelPaginacionTipoGlobalCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGlobalCliente!=null) {
				this.jPanelParametrosReportesTipoGlobalCliente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoGlobalCliente!=null) {
				this.jScrollPanelDatosEdicionTipoGlobalCliente.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoGlobalCliente!=null) {
				this.jScrollPanelDatosTipoGlobalCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGlobalCliente!=null) {
				this.jPanelPaginacionTipoGlobalCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGlobalCliente!=null) {
				this.jPanelParametrosReportesTipoGlobalCliente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoGlobalCliente!=null) {
				this.jScrollPanelDatosEdicionTipoGlobalCliente.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoGlobalCliente!=null) {
				this.jScrollPanelDatosTipoGlobalCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGlobalCliente!=null) {
				this.jPanelPaginacionTipoGlobalCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGlobalCliente!=null) {
				this.jPanelParametrosReportesTipoGlobalCliente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoGlobalClienteParaDefiniciones() throws Exception {
		Boolean isPaginaPopupDefinicion=false;

		try {

			if(this.tipoglobalclienteSessionBean==null) {
				this.tipoglobalclienteSessionBean=new TipoGlobalClienteSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoGlobalCliente.definicionSessionBean==null) {
				this.jInternalFrameDetalleFormTipoGlobalCliente.definicionSessionBean=new DefinicionSessionBean();
			}

			this.jInternalFrameDetalleFormTipoGlobalCliente.definicionSessionBean.setsPathNavegacionActual(tipoglobalclienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DefinicionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoGlobalCliente.definicionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDefinicion=this.jInternalFrameDetalleFormTipoGlobalCliente.definicionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoGlobalCliente.definicionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDefinicion(true);
			this.jInternalFrameDetalleFormTipoGlobalCliente.definicionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDefinicion(TipoGlobalClienteConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoGlobalCliente.definicionSessionBean.setisBusquedaDesdeForeignKeySesionTipoGlobalCliente(true);
			this.jInternalFrameDetalleFormTipoGlobalCliente.definicionSessionBean.setlidTipoGlobalClienteActual(this.idTipoGlobalClienteActual);

			tipoglobalclienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoGlobalCliente(true);
			tipoglobalclienteSessionBean.setlIdTipoGlobalClienteActualForeignKey(this.idTipoGlobalClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoGlobalClienteSessionBean tipoglobalclienteSessionBean=new TipoGlobalClienteSessionBean();
		
		if(this.tipoglobalclienteSessionBean==null) {
			this.tipoglobalclienteSessionBean=new TipoGlobalClienteSessionBean();
		}
		
		this.tipoglobalclienteSessionBean.setsUltimaBusquedaTipoGlobalCliente(this.getsAccionBusqueda());
		this.tipoglobalclienteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoglobalclienteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoGlobalClienteSessionBean tipoglobalclienteSessionBean=new TipoGlobalClienteSessionBean();
		
		if(this.tipoglobalclienteSessionBean==null) {
			this.tipoglobalclienteSessionBean=new TipoGlobalClienteSessionBean();
		}
		
		if(this.tipoglobalclienteSessionBean.getsUltimaBusquedaTipoGlobalCliente()!=null&&!this.tipoglobalclienteSessionBean.getsUltimaBusquedaTipoGlobalCliente().equals("")) {
			this.setsAccionBusqueda(tipoglobalclienteSessionBean.getsUltimaBusquedaTipoGlobalCliente());
			this.setiNumeroPaginacion(tipoglobalclienteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoglobalclienteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipoglobalclienteSessionBean.setsUltimaBusquedaTipoGlobalCliente("");
		this.tipoglobalclienteSessionBean.setiNumeroPaginacion(TipoGlobalClienteConstantesFunciones.INUMEROPAGINACION);
		this.tipoglobalclienteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoGlobalCliente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoGlobalCliente() {
		this.updateBorderResaltarBusquedasFormularioTipoGlobalCliente();
		this.updateVisibilidadBusquedasFormularioTipoGlobalCliente();
		this.updateHabilitarBusquedasFormularioTipoGlobalCliente();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoGlobalCliente() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoGlobalCliente() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoGlobalCliente() {
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
	
	public void updateControlesFormularioTipoGlobalCliente() throws Exception {

		if(this.jInternalFrameDetalleFormTipoGlobalCliente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoGlobalCliente();
		this.updateVisibilidadResaltarControlesFormularioTipoGlobalCliente();
		this.updateHabilitarResaltarControlesFormularioTipoGlobalCliente();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoGlobalCliente() throws Exception {
		if(this.jInternalFrameDetalleFormTipoGlobalCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoglobalclienteConstantesFunciones.resaltaridTipoGlobalCliente!=null && this.jInternalFrameDetalleFormTipoGlobalCliente!=null) {this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldidTipoGlobalCliente.setBorder(this.tipoglobalclienteConstantesFunciones.resaltaridTipoGlobalCliente);}
		if(this.tipoglobalclienteConstantesFunciones.resaltarcodigoTipoGlobalCliente!=null && this.jInternalFrameDetalleFormTipoGlobalCliente!=null) {this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldcodigoTipoGlobalCliente.setBorder(this.tipoglobalclienteConstantesFunciones.resaltarcodigoTipoGlobalCliente);}
		if(this.tipoglobalclienteConstantesFunciones.resaltarnombreTipoGlobalCliente!=null && this.jInternalFrameDetalleFormTipoGlobalCliente!=null) {this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldnombreTipoGlobalCliente.setBorder(this.tipoglobalclienteConstantesFunciones.resaltarnombreTipoGlobalCliente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoGlobalCliente() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoGlobalCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) {
	
		//this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldidTipoGlobalCliente.setVisible(this.tipoglobalclienteConstantesFunciones.mostraridTipoGlobalCliente);
		this.jInternalFrameDetalleFormTipoGlobalCliente.jPanelidTipoGlobalCliente.setVisible(this.tipoglobalclienteConstantesFunciones.mostraridTipoGlobalCliente);
		//this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldcodigoTipoGlobalCliente.setVisible(this.tipoglobalclienteConstantesFunciones.mostrarcodigoTipoGlobalCliente);
		this.jInternalFrameDetalleFormTipoGlobalCliente.jPanelcodigoTipoGlobalCliente.setVisible(this.tipoglobalclienteConstantesFunciones.mostrarcodigoTipoGlobalCliente);
		//this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldnombreTipoGlobalCliente.setVisible(this.tipoglobalclienteConstantesFunciones.mostrarnombreTipoGlobalCliente);
		this.jInternalFrameDetalleFormTipoGlobalCliente.jPanelnombreTipoGlobalCliente.setVisible(this.tipoglobalclienteConstantesFunciones.mostrarnombreTipoGlobalCliente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoGlobalCliente() throws Exception {
		if(this.jInternalFrameDetalleFormTipoGlobalCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoGlobalCliente!=null) {
	
		this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldidTipoGlobalCliente.setEnabled(this.tipoglobalclienteConstantesFunciones.activaridTipoGlobalCliente);
		this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldcodigoTipoGlobalCliente.setEnabled(this.tipoglobalclienteConstantesFunciones.activarcodigoTipoGlobalCliente);
		this.jInternalFrameDetalleFormTipoGlobalCliente.jTextFieldnombreTipoGlobalCliente.setEnabled(this.tipoglobalclienteConstantesFunciones.activarnombreTipoGlobalCliente);
		}
	}
	
		
}