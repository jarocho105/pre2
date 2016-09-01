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

import com.bydan.erp.inventario.util.EstadoPrecioConstantesFunciones;
import com.bydan.erp.inventario.util.EstadoPrecioParameterReturnGeneral;
//import com.bydan.erp.inventario.util.EstadoPrecioParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.EstadoPrecioBean;
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
public class EstadoPrecioBeanSwingJInternalFrame extends EstadoPrecioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoPrecioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoPrecio> estadoprecioValidator = new ClassValidator<EstadoPrecio>(EstadoPrecio.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoPrecio estadoprecio;	
	public EstadoPrecio estadoprecioAux;
	public EstadoPrecio estadoprecioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoPrecio estadoprecioTotales;
	public Long idEstadoPrecioActual;
	public Long iIdNuevoEstadoPrecio=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosPrecio=false;

	public Boolean getIsTienePermisosPrecio() {
		return isTienePermisosPrecio;
	}

	public void setIsTienePermisosPrecio(Boolean isTienePermisosPrecio) {
		this.isTienePermisosPrecio= isTienePermisosPrecio;
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
	
	public Boolean isPermisoTodoEstadoPrecio;
	public Boolean isPermisoNuevoEstadoPrecio;
	public Boolean isPermisoActualizarEstadoPrecio;
	public Boolean isPermisoActualizarOriginalEstadoPrecio;
	public Boolean isPermisoEliminarEstadoPrecio;
	public Boolean isPermisoGuardarCambiosEstadoPrecio;
	public Boolean isPermisoConsultaEstadoPrecio;
	public Boolean isPermisoBusquedaEstadoPrecio;
	public Boolean isPermisoReporteEstadoPrecio;
	public Boolean isPermisoPaginacionMedioEstadoPrecio;
	public Boolean isPermisoPaginacionAltoEstadoPrecio;
	public Boolean isPermisoPaginacionTodoEstadoPrecio;
	public Boolean isPermisoCopiarEstadoPrecio;
	public Boolean isPermisoVerFormEstadoPrecio;
	public Boolean isPermisoDuplicarEstadoPrecio;
	public Boolean isPermisoOrdenEstadoPrecio;
	
	
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
	
	public EstadoPrecioParameterReturnGeneral estadoprecioReturnGeneral;
	public EstadoPrecioParameterReturnGeneral estadoprecioParameterGeneral;
	
	

	public PrecioLogic precioLogic=null;

	public PrecioLogic getPrecioLogic() {
		return precioLogic;
	}

	public void setPrecioLogic(PrecioLogic precioLogic) {
		this.precioLogic = precioLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoPrecio=false;
	public Boolean esParaAccionDesdeFormularioEstadoPrecio=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoPrecioSessionBeanAdditional estadoprecioSessionBeanAdditional=null;
	
	public EstadoPrecioSessionBeanAdditional getEstadoPrecioSessionBeanAdditional() {
		return this.estadoprecioSessionBeanAdditional;
	}
	
	public void setEstadoPrecioSessionBeanAdditional(EstadoPrecioSessionBeanAdditional estadoprecioSessionBeanAdditional) {
		try {
			this.estadoprecioSessionBeanAdditional=estadoprecioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoPrecioBeanSwingJInternalFrameAdditional estadoprecioBeanSwingJInternalFrameAdditional=null;
	//public class EstadoPrecioBeanSwingJInternalFrame
	
	public EstadoPrecioBeanSwingJInternalFrameAdditional getEstadoPrecioBeanSwingJInternalFrameAdditional() {
		return this.estadoprecioBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoPrecioBeanSwingJInternalFrameAdditional(EstadoPrecioBeanSwingJInternalFrameAdditional estadoprecioBeanSwingJInternalFrameAdditional) {
		try {
			this.estadoprecioBeanSwingJInternalFrameAdditional=estadoprecioBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoPrecioLogic estadoprecioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoPrecio estadoprecioBean;
	public EstadoPrecioConstantesFunciones estadoprecioConstantesFunciones;
	//public EstadoPrecioParameterReturnGeneral estadoprecioReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoPrecio> estadoprecios;	
	//public List<EstadoPrecio> estadopreciosEliminados;
	//public List<EstadoPrecio> estadopreciosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoPrecio=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoPrecio=true;
	public Boolean isVisibilidadCeldaCopiarEstadoPrecio=true;
	public Boolean isVisibilidadCeldaVerFormEstadoPrecio=true;
	public Boolean isVisibilidadCeldaOrdenEstadoPrecio=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoPrecio=false;
	public Boolean isVisibilidadCeldaModificarEstadoPrecio=false;
	public Boolean isVisibilidadCeldaActualizarEstadoPrecio=false;
	public Boolean isVisibilidadCeldaEliminarEstadoPrecio=false;
	public Boolean isVisibilidadCeldaCancelarEstadoPrecio=false;
	public Boolean isVisibilidadCeldaGuardarEstadoPrecio=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoPrecio=false;	
	
	
	
	public Long getiIdNuevoEstadoPrecio() {
		return this.iIdNuevoEstadoPrecio;
	}

	public void setiIdNuevoEstadoPrecio(Long iIdNuevoEstadoPrecio) {
		this.iIdNuevoEstadoPrecio = iIdNuevoEstadoPrecio;
	}
	
	public Long getidEstadoPrecioActual() {
		return this.idEstadoPrecioActual;
	}

	public void setidEstadoPrecioActual(Long idEstadoPrecioActual) {
		this.idEstadoPrecioActual = idEstadoPrecioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoPrecio getestadoprecio() {
		return this.estadoprecio;
	}

	public void setestadoprecio(EstadoPrecio estadoprecio) {
		this.estadoprecio = estadoprecio;
	}
	
	public EstadoPrecio getestadoprecioAux() {
		return this.estadoprecioAux;
	}

	public void setestadoprecioAux(EstadoPrecio estadoprecioAux) {
		this.estadoprecioAux = estadoprecioAux;
	}				
	
	public EstadoPrecio getestadoprecioAnterior() {
		return this.estadoprecioAnterior;
	}

	public void setestadoprecioAnterior(EstadoPrecio estadoprecioAnterior) {
		this.estadoprecioAnterior = estadoprecioAnterior;
	}	
	
	public EstadoPrecio getestadoprecioTotales() {
		return this.estadoprecioTotales;
	}

	public void setestadoprecioTotales(EstadoPrecio estadoprecioTotales) {
		this.estadoprecioTotales = estadoprecioTotales;
	}	
	
	public EstadoPrecio getestadoprecioBean() {
		return this.estadoprecioBean;
	}

	public void setestadoprecioBean(EstadoPrecio estadoprecioBean) {
		this.estadoprecioBean = estadoprecioBean;
	}	
	
	public EstadoPrecioParameterReturnGeneral getestadoprecioReturnGeneral() {
		return this.estadoprecioReturnGeneral;
	}

	public void setestadoprecioReturnGeneral(EstadoPrecioParameterReturnGeneral estadoprecioReturnGeneral) {
		this.estadoprecioReturnGeneral = estadoprecioReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoPrecioLogic getEstadoPrecioLogic()	{		
		return estadoprecioLogic;
	}

	public void setEstadoPrecioLogic(EstadoPrecioLogic estadoprecioLogic) {
		this.estadoprecioLogic = estadoprecioLogic;
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
	
	public Boolean getIsEsNuevoEstadoPrecio() {
		return isEsNuevoEstadoPrecio;
	}

	public void setIsEsNuevoEstadoPrecio(Boolean isEsNuevoEstadoPrecio) {
		this.isEsNuevoEstadoPrecio = isEsNuevoEstadoPrecio;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoPrecio() {
		return esParaAccionDesdeFormularioEstadoPrecio;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoPrecio(Boolean esParaAccionDesdeFormularioEstadoPrecio) {
		this.esParaAccionDesdeFormularioEstadoPrecio = esParaAccionDesdeFormularioEstadoPrecio;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoPrecio() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoPrecioConstantesFunciones.refrescarForeignKeysDescripcionesEstadoPrecio(this.estadoprecioLogic.getEstadoPrecios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoPrecioConstantesFunciones.refrescarForeignKeysDescripcionesEstadoPrecio(this.estadoprecios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadoprecioLogic.setEstadoPrecios(this.estadoprecios);
			estadoprecioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoPrecioParameterReturnGeneral getEstadoPrecioParameterGeneral() {
		return this.estadoprecioParameterGeneral;
	}
	
	public void setEstadoPrecioParameterGeneral(EstadoPrecioParameterReturnGeneral estadoprecioParameterGeneral) {
		this.estadoprecioParameterGeneral = estadoprecioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoPrecio() {
		return isPermisoTodoEstadoPrecio;
	}

	public void setIsPermisoTodoEstadoPrecio(Boolean isPermisoTodoEstadoPrecio) {
		this.isPermisoTodoEstadoPrecio = isPermisoTodoEstadoPrecio;
	}

	public Boolean getIsPermisoNuevoEstadoPrecio() {
		return isPermisoNuevoEstadoPrecio;
	}

	public void setIsPermisoNuevoEstadoPrecio(Boolean isPermisoNuevoEstadoPrecio) {
		this.isPermisoNuevoEstadoPrecio = isPermisoNuevoEstadoPrecio;
	}

	public Boolean getIsPermisoActualizarEstadoPrecio() {
		return isPermisoActualizarEstadoPrecio;
	}

	public void setIsPermisoActualizarEstadoPrecio(Boolean isPermisoActualizarEstadoPrecio) {
		this.isPermisoActualizarEstadoPrecio = isPermisoActualizarEstadoPrecio;
	}

	public Boolean getIsPermisoEliminarEstadoPrecio() {
		return isPermisoEliminarEstadoPrecio;
	}

	public void setIsPermisoEliminarEstadoPrecio(Boolean isPermisoEliminarEstadoPrecio) {
		this.isPermisoEliminarEstadoPrecio = isPermisoEliminarEstadoPrecio;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoPrecio() {
		return isPermisoGuardarCambiosEstadoPrecio;
	}

	public void setIsPermisoGuardarCambiosEstadoPrecio(Boolean isPermisoGuardarCambiosEstadoPrecio) {
		this.isPermisoGuardarCambiosEstadoPrecio = isPermisoGuardarCambiosEstadoPrecio;
	}
	
	public Boolean getIsPermisoConsultaEstadoPrecio() {
		return isPermisoConsultaEstadoPrecio;
	}

	public void setIsPermisoConsultaEstadoPrecio(Boolean isPermisoConsultaEstadoPrecio) {
		this.isPermisoConsultaEstadoPrecio = isPermisoConsultaEstadoPrecio;
	}

	public Boolean getIsPermisoBusquedaEstadoPrecio() {
		return isPermisoBusquedaEstadoPrecio;
	}

	public void setIsPermisoBusquedaEstadoPrecio(Boolean isPermisoBusquedaEstadoPrecio) {
		this.isPermisoBusquedaEstadoPrecio = isPermisoBusquedaEstadoPrecio;
	}

	public Boolean getIsPermisoReporteEstadoPrecio() {
		return isPermisoReporteEstadoPrecio;
	}

	public void setIsPermisoReporteEstadoPrecio(Boolean isPermisoReporteEstadoPrecio) {
		this.isPermisoReporteEstadoPrecio = isPermisoReporteEstadoPrecio;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoPrecio() {
		return isPermisoPaginacionMedioEstadoPrecio;
	}

	public void setIsPermisoPaginacionMedioEstadoPrecio(Boolean isPermisoPaginacionMedioEstadoPrecio) {
		this.isPermisoPaginacionMedioEstadoPrecio = isPermisoPaginacionMedioEstadoPrecio;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoPrecio() {
		return isPermisoPaginacionTodoEstadoPrecio;
	}

	public void setIsPermisoPaginacionTodoEstadoPrecio(Boolean isPermisoPaginacionTodoEstadoPrecio) {
		this.isPermisoPaginacionTodoEstadoPrecio = isPermisoPaginacionTodoEstadoPrecio;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoPrecio() {
		return isPermisoPaginacionAltoEstadoPrecio;
	}

	public void setIsPermisoPaginacionAltoEstadoPrecio(Boolean isPermisoPaginacionAltoEstadoPrecio) {
		this.isPermisoPaginacionAltoEstadoPrecio = isPermisoPaginacionAltoEstadoPrecio;
	}
	
	public Boolean getIsPermisoCopiarEstadoPrecio() {
		return isPermisoCopiarEstadoPrecio;
	}

	public void setIsPermisoCopiarEstadoPrecio(Boolean isPermisoCopiarEstadoPrecio) {
		this.isPermisoCopiarEstadoPrecio = isPermisoCopiarEstadoPrecio;
	}
	
	public Boolean getIsPermisoVerFormEstadoPrecio() {
		return isPermisoVerFormEstadoPrecio;
	}

	public void setIsPermisoVerFormEstadoPrecio(Boolean isPermisoVerFormEstadoPrecio) {
		this.isPermisoVerFormEstadoPrecio = isPermisoVerFormEstadoPrecio;
	}
	
	public Boolean getIsPermisoDuplicarEstadoPrecio() {
		return isPermisoDuplicarEstadoPrecio;
	}

	public void setIsPermisoDuplicarEstadoPrecio(Boolean isPermisoDuplicarEstadoPrecio) {
		this.isPermisoDuplicarEstadoPrecio = isPermisoDuplicarEstadoPrecio;
	}
	
	public Boolean getIsPermisoOrdenEstadoPrecio() {
		return isPermisoOrdenEstadoPrecio;
	}

	public void setIsPermisoOrdenEstadoPrecio(Boolean isPermisoOrdenEstadoPrecio) {
		this.isPermisoOrdenEstadoPrecio = isPermisoOrdenEstadoPrecio;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoPrecio() {
		return isVisibilidadCeldaNuevoEstadoPrecio;
	}

	public void setIsVisibilidadCeldaNuevoEstadoPrecio(Boolean isVisibilidadCeldaNuevoEstadoPrecio) {
		this.isVisibilidadCeldaNuevoEstadoPrecio = isVisibilidadCeldaNuevoEstadoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoPrecio() {
		return isVisibilidadCeldaDuplicarEstadoPrecio;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoPrecio(Boolean isVisibilidadCeldaDuplicarEstadoPrecio) {
		this.isVisibilidadCeldaDuplicarEstadoPrecio = isVisibilidadCeldaDuplicarEstadoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoPrecio() {
		return isVisibilidadCeldaCopiarEstadoPrecio;
	}

	public void setIsVisibilidadCeldaCopiarEstadoPrecio(Boolean isVisibilidadCeldaCopiarEstadoPrecio) {
		this.isVisibilidadCeldaCopiarEstadoPrecio = isVisibilidadCeldaCopiarEstadoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoPrecio() {
		return isVisibilidadCeldaVerFormEstadoPrecio;
	}

	public void setIsVisibilidadCeldaVerFormEstadoPrecio(Boolean isVisibilidadCeldaVerFormEstadoPrecio) {
		this.isVisibilidadCeldaVerFormEstadoPrecio = isVisibilidadCeldaVerFormEstadoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoPrecio() {
		return isVisibilidadCeldaOrdenEstadoPrecio;
	}

	public void setIsVisibilidadCeldaOrdenEstadoPrecio(Boolean isVisibilidadCeldaOrdenEstadoPrecio) {
		this.isVisibilidadCeldaOrdenEstadoPrecio = isVisibilidadCeldaOrdenEstadoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoPrecio() {
		return isVisibilidadCeldaNuevoRelacionesEstadoPrecio;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoPrecio(Boolean isVisibilidadCeldaNuevoRelacionesEstadoPrecio) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoPrecio = isVisibilidadCeldaNuevoRelacionesEstadoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoPrecio() {
		return isVisibilidadCeldaModificarEstadoPrecio;
	}

	public void setIsVisibilidadCeldaModificarEstadoPrecio(Boolean isVisibilidadCeldaModificarEstadoPrecio) {
		this.isVisibilidadCeldaModificarEstadoPrecio = isVisibilidadCeldaModificarEstadoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoPrecio() {
		return isVisibilidadCeldaActualizarEstadoPrecio;
	}

	public void setIsVisibilidadCeldaActualizarEstadoPrecio(Boolean isVisibilidadCeldaActualizarEstadoPrecio) {
		this.isVisibilidadCeldaActualizarEstadoPrecio = isVisibilidadCeldaActualizarEstadoPrecio;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoPrecio() {
		return isVisibilidadCeldaEliminarEstadoPrecio;
	}

	public void setIsVisibilidadCeldaEliminarEstadoPrecio(Boolean isVisibilidadCeldaEliminarEstadoPrecio) {
		this.isVisibilidadCeldaEliminarEstadoPrecio = isVisibilidadCeldaEliminarEstadoPrecio;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoPrecio() {
		return isVisibilidadCeldaCancelarEstadoPrecio;
	}

	public void setIsVisibilidadCeldaCancelarEstadoPrecio(Boolean isVisibilidadCeldaCancelarEstadoPrecio) {
		this.isVisibilidadCeldaCancelarEstadoPrecio = isVisibilidadCeldaCancelarEstadoPrecio;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoPrecio() {
		return isVisibilidadCeldaGuardarEstadoPrecio;
	}

	public void setIsVisibilidadCeldaGuardarEstadoPrecio(Boolean isVisibilidadCeldaGuardarEstadoPrecio) {
		this.isVisibilidadCeldaGuardarEstadoPrecio = isVisibilidadCeldaGuardarEstadoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoPrecio() {
		return isVisibilidadCeldaGuardarCambiosEstadoPrecio;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoPrecio(Boolean isVisibilidadCeldaGuardarCambiosEstadoPrecio) {
		this.isVisibilidadCeldaGuardarCambiosEstadoPrecio = isVisibilidadCeldaGuardarCambiosEstadoPrecio;
	}
		
	public EstadoPrecioSessionBean getestadoprecioSessionBean() {
		return this.estadoprecioSessionBean;
	}
	
	public void setestadoprecioSessionBean(EstadoPrecioSessionBean estadoprecioSessionBean) {
		this.estadoprecioSessionBean=estadoprecioSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoPrecio(EstadoPrecio estadoprecio)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoPrecio estadoprecio,EstadoPrecio estadoprecioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoPrecio(estadoprecio);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadoprecioAux.setId(estadoprecio.getId());
		estadoprecioAux.setVersionRow(estadoprecio.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoPrecio();
		
			int intSelectedRow = this.jTableDatosEstadoPrecio.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecio =(EstadoPrecio) this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadoprecio =(EstadoPrecio) this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoPrecio(this.estadoprecio,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoPrecio(this.estadoprecio);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadoprecioValidator.getInvalidValues(this.estadoprecio);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadoprecioLogic.setDatosCliente(datosCliente);
			estadoprecioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadoprecioAux=new  EstadoPrecio();
				
				estadoprecioAux.setIsNew(true);
				estadoprecioAux.setIsChanged(true);
				
				estadoprecioAux.setEstadoPrecioOriginal(this.estadoprecio);
				
				estadoprecioAux.setId(this.estadoprecio.getId());	
				estadoprecioAux.setVersionRow(this.estadoprecio.getVersionRow());	
				estadoprecioAux.setcodigo(this.estadoprecio.getcodigo());	
				estadoprecioAux.setnombre(this.estadoprecio.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoprecioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoprecioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadoprecioAux,estadoprecioLogic.getEstadoPrecios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoprecioAux,estadoprecios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadoprecioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoprecioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoprecioLogic.saveEstadoPrecios();//WithConnection
						//estadoprecioLogic.getSetVersionRowEstadoPrecios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoprecio,estadoprecioAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoprecioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precioLogic.getPrecios().addAll(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.preciosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precios.addAll(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.preciosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadoprecioLogic.saveEstadoPrecioRelaciones(estadoprecioAux,this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precioLogic.getPrecios());//WithConnection
								//estadoprecioLogic.getSetVersionRowEstadoPrecios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadoprecio,estadoprecioAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precioLogic.setPrecios(new ArrayList<Precio>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precios= new ArrayList<Precio>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoprecioAux.setPrecios(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precioLogic.getPrecios());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadoprecioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadoprecioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadoprecioAux,estadoprecioLogic.getEstadoPrecios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadoprecioAux,estadoprecios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadoprecio,estadoprecioAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadoprecioAux=new  EstadoPrecio();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadoprecioSessionBean.getEsGuardarRelacionado() 
					|| (this.estadoprecioSessionBean.getEsGuardarRelacionado() && this.estadoprecio.getId()>=0)) {
						
					estadoprecioAux.setIsNew(false);
				}
				
				estadoprecioAux.setIsDeleted(false);
			
				estadoprecioAux.setId(this.estadoprecio.getId());	
				estadoprecioAux.setVersionRow(this.estadoprecio.getVersionRow());	
				estadoprecioAux.setcodigo(this.estadoprecio.getcodigo());	
				estadoprecioAux.setnombre(this.estadoprecio.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoprecioAux,estadoprecioLogic.getEstadoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoprecioAux,estadoprecios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadoprecioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoprecioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoprecioLogic.saveEstadoPrecios();//WithConnection
						//estadoprecioLogic.getSetVersionRowEstadoPrecios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoprecio,estadoprecioAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoprecioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precioLogic.getPrecios().addAll(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.preciosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precios.addAll(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.preciosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadoprecioLogic.saveEstadoPrecioRelaciones(estadoprecioAux,this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precioLogic.getPrecios());//WithConnection
								//estadoprecioLogic.getSetVersionRowEstadoPrecios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadoprecio,estadoprecioAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precioLogic.setPrecios(new ArrayList<Precio>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precios= new ArrayList<Precio>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoprecioAux.setPrecios(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precioLogic.getPrecios());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadoprecioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadoprecioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadoprecioAux,estadoprecioLogic.getEstadoPrecios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadoprecioAux,estadoprecios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadoprecio,estadoprecioAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadoprecioAux=new  EstadoPrecio();
				
				estadoprecioAux.setIsNew(false);
				estadoprecioAux.setIsChanged(false);
				
				estadoprecioAux.setIsDeleted(true);
				
				estadoprecioAux.setId(this.estadoprecio.getId());	
				estadoprecioAux.setVersionRow(this.estadoprecio.getVersionRow());	
				estadoprecioAux.setcodigo(this.estadoprecio.getcodigo());	
				estadoprecioAux.setnombre(this.estadoprecio.getnombre());	
				
				if(this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadoprecioAux.getId()>=0) {	
						this.estadopreciosEliminados.add(estadoprecioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadoprecioAux,estadoprecioLogic.getEstadoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoprecioAux,estadoprecios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadoprecioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoprecioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoprecioLogic.saveEstadoPrecios();//WithConnection
						//estadoprecioLogic.getSetVersionRowEstadoPrecios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoprecioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precioLogic.getPrecios().addAll(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.preciosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precios.addAll(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.preciosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadoprecioLogic.saveEstadoPrecioRelaciones(estadoprecioAux,this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precioLogic.getPrecios());//WithConnection
								//estadoprecioLogic.getSetVersionRowEstadoPrecios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precioLogic.setPrecios(new ArrayList<Precio>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precios= new ArrayList<Precio>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoprecioAux.setPrecios(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precioLogic.getPrecios());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadoprecioSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadoprecioSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadoprecioAux,estadoprecioLogic.getEstadoPrecios());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadoprecioAux,estadoprecios);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecioLogic.getEstadoPrecios().addAll(this.estadopreciosEliminados);
					
					estadoprecioLogic.saveEstadoPrecios();//WithConnection
					//estadoprecioLogic.getSetVersionRowEstadoPrecios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadopreciosEliminados= new ArrayList<EstadoPrecio>();		
			}
			
			if(this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Precio GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Precio",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadoprecio=estadoprecioAux;
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
      		//this.finishProcessEstadoPrecio();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoPrecio estadoprecioLocal) throws Exception {
		
		if(this.estadoprecioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadoprecioLocal.setPrecios(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precioLogic.getPrecios());
			
			} else {
			
				estadoprecioLocal.setPrecios(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precios);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoPrecio estadoprecioLocal) throws Exception {	
		if(this.estadoprecioSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoPrecioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoPrecio.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoprecio =(EstadoPrecio) this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadoprecio =(EstadoPrecio) this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadoprecioValidator.getInvalidValues(this.estadoprecio);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoPrecio estadoprecio,List<EstadoPrecio> estadoprecios) throws Exception {
		try	{		
			EstadoPrecioConstantesFunciones.actualizarLista(estadoprecio,estadoprecios,this.estadoprecioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoPrecio estadoprecio,List<EstadoPrecio> estadoprecios) throws Exception {
		try	{			
			EstadoPrecioConstantesFunciones.actualizarSelectedLista(estadoprecio,estadoprecios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoPrecio> estadopreciosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadopreciosLocal=this.estadoprecioLogic.getEstadoPrecios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadopreciosLocal=this.estadoprecios;
			}
			//ARCHITECTURE
		
			for(EstadoPrecio estadoprecioLocal:estadopreciosLocal) {
				if(this.permiteMantenimiento(estadoprecioLocal) && estadoprecioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoPrecioConstantesFunciones.getEstadoPrecioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoPrecioConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPrecio.jLabelcodigoEstadoPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoPrecioConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPrecio.jLabelnombreEstadoPrecio,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoPrecio.jLabelcodigoEstadoPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoPrecio.jLabelnombreEstadoPrecio,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Precio")) {
			if(this.estadoprecio==null) {
				this.estadoprecio= new EstadoPrecio();
			}

			if(this.estadoprecioSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoPrecio
				this.setVariablesFormularioToObjetoActualEstadoPrecio(this.estadoprecio,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoPrecio(this.estadoprecio);

				this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.getprecio().setEstadoPrecio(this.estadoprecio);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoPrecio--;	
		
		
		this.estadoprecioAux=new EstadoPrecio();
		
		this.estadoprecioAux.setId(this.iIdNuevoEstadoPrecio);
		this.estadoprecioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoprecioLogic.getEstadoPrecios().add(this.estadoprecioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadoprecios.add(this.estadoprecioAux);
		}
		//ARCHITECTURE
		
		this.estadoprecio=this.estadoprecioAux;
		
		if(EstadoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoPrecio(this.estadoprecio);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoPrecio(this.estadoprecio);
		}
				
		//this.setDefaultControlesEstadoPrecio();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoPrecio();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoPrecio();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoPrecio();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoPrecio(this.estadoprecioBean,this.estadoprecio,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoPrecio(this.estadoprecio);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoPrecioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadoprecioSessionBean.getConGuardarRelaciones()) {
			classes=EstadoPrecioConstantesFunciones.getClassesRelationshipsOfEstadoPrecio(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadoprecioReturnGeneral=estadoprecioLogic.procesarEventosEstadoPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoprecioLogic.getEstadoPrecios(),this.estadoprecio,this.estadoprecioParameterGeneral,this.isEsNuevoEstadoPrecio,classes);//this.estadoprecioLogic.getEstadoPrecio()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoPrecio(this.estadoprecioReturnGeneral,this.estadoprecioBean,false);
		
		if(this.estadoprecioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoPrecio(this.estadoprecioReturnGeneral.getEstadoPrecio());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoPrecio(this.estadoprecioReturnGeneral.getEstadoPrecio());
		}
		
		if(this.estadoprecioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoPrecio(this.estadoprecioReturnGeneral.getEstadoPrecio(),classes);//this.estadoprecioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoPrecio(this.estadoprecio,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoPrecio();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoPrecio();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoPrecioBeanSwingJInternalFrameAdditional.RecargarFormEstadoPrecio(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoPrecio(false);
						
			if(estadoprecioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precioSessionBean.getEsGuardarRelacionado() && PrecioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPrecioActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoPrecioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoPrecio();
			}
			
			this.actualizarVisualTableDatosEstadoPrecio();
			
			this.jTableDatosEstadoPrecio.setRowSelectionInterval(this.getIndiceNuevoEstadoPrecio(), this.getIndiceNuevoEstadoPrecio());
			
			this.seleccionarFilaTablaEstadoPrecioActual();
						
			this.actualizarEstadoCeldasBotonesEstadoPrecio("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoPrecio(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldcodigoEstadoPrecio.setEnabled(isHabilitar && this.estadoprecioConstantesFunciones.activarcodigoEstadoPrecio);
		this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldnombreEstadoPrecio.setEnabled(isHabilitar && this.estadoprecioConstantesFunciones.activarnombreEstadoPrecio);	
		
	};
	
	public void setDefaultControlesEstadoPrecio() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoPrecio(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadoprecioSessionBean.setConGuardarRelaciones(true);			
			this.estadoprecioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoPrecio.jTabbedPaneRelacionesEstadoPrecio.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precioSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadoprecioSessionBean.setConGuardarRelaciones(false);			
			this.estadoprecioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoPrecio.jTabbedPaneRelacionesEstadoPrecio.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precioSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoPrecio() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPrecio estadoprecioAux:this.estadoprecioLogic.getEstadoPrecios()) {
				if(estadoprecioAux.getId().equals(this.iIdNuevoEstadoPrecio)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPrecio estadoprecioAux:this.estadoprecios) {
				if(estadoprecioAux.getId().equals(this.iIdNuevoEstadoPrecio)) {
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
	
	public int getIndiceActualEstadoPrecio(EstadoPrecio estadoprecio,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPrecio estadoprecioAux:this.estadoprecioLogic.getEstadoPrecios()) {
				if(estadoprecioAux.getId().equals(estadoprecio.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPrecio estadoprecioAux:this.estadoprecios) {
				if(estadoprecioAux.getId().equals(estadoprecio.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoPrecio(EstadoPrecio estadoprecioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPrecio estadoprecioAux:this.estadoprecioLogic.getEstadoPrecios()) {
				if(estadoprecioAux.getEstadoPrecioOriginal().getId().equals(estadoprecioOriginal.getId())) {
					existe=true;
					estadoprecioOriginal.setId(estadoprecioAux.getId());
					estadoprecioOriginal.setVersionRow(estadoprecioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPrecio estadoprecioAux:this.estadoprecios) {
				if(estadoprecioAux.getEstadoPrecioOriginal().getId().equals(estadoprecioOriginal.getId())) {
					existe=true;
					estadoprecioOriginal.setId(estadoprecioAux.getId());
					estadoprecioOriginal.setVersionRow(estadoprecioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoPrecio(Boolean esParaCancelar) throws Exception {
		estadopreciosAux=new ArrayList<EstadoPrecio>();
		estadoprecioAux=new EstadoPrecio();
		
		if(!this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoPrecio estadoprecioAux:this.estadoprecioLogic.getEstadoPrecios()) {
					if(estadoprecioAux.getId()<0) {
						estadopreciosAux.add(estadoprecioAux);
					}		
				}
				this.iIdNuevoEstadoPrecio=0L;
				this.estadoprecioLogic.getEstadoPrecios().removeAll(estadopreciosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoPrecio estadoprecioAux:this.estadoprecios) {
					if(estadoprecioAux.getId()<0) {
						estadopreciosAux.add(estadoprecioAux);
					}		
				}
				this.iIdNuevoEstadoPrecio=0L;
				this.estadoprecios.removeAll(estadopreciosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoPrecio 
					&& this.estadoprecioLogic.getEstadoPrecios().size()>0
					) {
					estadoprecioAux=this.estadoprecioLogic.getEstadoPrecios().get(this.estadoprecioLogic.getEstadoPrecios().size() - 1);
				
					if(estadoprecioAux.getId()<0) {
						this.estadoprecioLogic.getEstadoPrecios().remove(estadoprecioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoPrecio && this.estadoprecios.size()>0) {
					estadoprecioAux=this.estadoprecios.get(this.estadoprecios.size() - 1);
				
					if(estadoprecioAux.getId()<0) {
						this.estadoprecios.remove(estadoprecioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoPrecio(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadoprecio.getId()<0) {
				this.estadoprecioLogic.getEstadoPrecios().remove(this.estadoprecio);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadoprecio.getId()<0) {
				this.estadoprecios.remove(this.estadoprecio);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoPrecio(List<EstadoPrecio> estadopreciosAux) throws Exception {
		EstadoPrecioConstantesFunciones.setEstadosInicialesEstadoPrecio(estadopreciosAux);
	}
	
	public void setEstadosInicialesEstadoPrecio(EstadoPrecio estadoprecioAux) throws Exception {
		EstadoPrecioConstantesFunciones.setEstadosInicialesEstadoPrecio(estadoprecioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoPrecioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoPrecioActual()) {
				if(!this.isEsNuevoEstadoPrecio) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoPrecio=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoPrecioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Precio ?", "MANTENIMIENTO DE Estado Precio", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoPrecio estadoprecio) throws Exception {
		EstadoPrecioConstantesFunciones.seleccionarAsignar(this.estadoprecio,estadoprecio);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoPrecio=this.isPermisoActualizarOriginalEstadoPrecio;
			
			
			this.seleccionarAsignar(estadoprecio);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoPrecioConstantesFunciones.quitarEspaciosEstadoPrecio(this.estadoprecio,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoPrecio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadoprecioSessionBean.setsFuncionBusquedaRapida(this.estadoprecioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoPrecio) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoPrecio(esParaCancelar);				
				this.cancelarNuevoEstadoPrecio(esParaCancelar);								
			}
			
			this.estadoprecio=new EstadoPrecio();
			
			this.inicializarEstadoPrecio();
			
			this.actualizarEstadoCeldasBotonesEstadoPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoPrecio() throws Exception {
		try {
			EstadoPrecioConstantesFunciones.inicializarEstadoPrecio(this.estadoprecio);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadoprecioLogic.getEstadoPrecios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoPrecios(String sAccionBusqueda,List<EstadoPrecio> estadopreciosParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoPrecio"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoPrecioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoPrecioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoPrecio"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Precioes");		
		parameters.put("busquedapor", EstadoPrecioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Precio.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoPrecioLogic estadoprecioLogicAuxiliar=new EstadoPrecioLogic();
					estadoprecioLogicAuxiliar.setDatosCliente(estadoprecioLogic.getDatosCliente());				
					estadoprecioLogicAuxiliar.setEstadoPrecios(estadopreciosParaReportes);
					
					estadoprecioLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoPrecioWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadopreciosParaReportes=estadoprecioLogicAuxiliar.getEstadoPrecios();
					
					//estadoprecioLogic.getNewConnexionToDeep();
					
					//for (EstadoPrecio estadoprecio:estadopreciosParaReportes) {
					//	estadoprecioLogic.deepLoad(estadoprecio, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadoprecioLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadoprecioLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFilePrecio = AuxiliarReportes.class.getResourceAsStream("PrecioDetalleRelacionesDesign.jasper");
			parameters.put("subreport_precio", reportFilePrecio);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoPrecio=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoPrecioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoPrecioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoPrecio=new JRBeanArrayDataSource(EstadoPrecioJInternalFrame.TraerEstadoPrecioBeans(estadopreciosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoPrecio);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoPrecioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoPrecioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoPrecioBean.TraerEstadoPrecioBeans(estadopreciosParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoPrecios(sAccionBusqueda,sTipoArchivoReporte,estadopreciosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoPrecios(sAccionBusqueda,sTipoArchivoReporte,estadopreciosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoPrecioActionPerformed(null);
					//this.generarExcelReporteEstadoPrecios(sAccionBusqueda,sTipoArchivoReporte,estadopreciosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoPrecios(sAccionBusqueda,sTipoArchivoReporte,estadopreciosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoPrecios(sAccionBusqueda,sTipoArchivoReporte,estadopreciosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoPrecios(sAccionBusqueda,sTipoArchivoReporte,estadopreciosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoPrecios(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoPrecio> estadopreciosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoprecio";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoPrecios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoPrecio("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoPrecio estadoprecio : estadopreciosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoPrecioConstantesFunciones.generarExcelReporteDataEstadoPrecio("NORMAL",row,workbook,estadoprecio,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Precio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoPrecio(String sTipo,Row row,Workbook workbook) {
		
		EstadoPrecioConstantesFunciones.generarExcelReporteHeaderEstadoPrecio(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoPrecios(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoPrecio> estadopreciosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoprecio_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoPrecios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoPrecio estadoprecio : estadopreciosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoPrecioConstantesFunciones.getEstadoPrecioDescripcion(estadoprecio));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoPrecioConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoPrecioConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoprecio.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoPrecioConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoPrecioConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoprecio.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Precio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoPrecios(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoPrecio> estadopreciosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoPrecio> estadopreciosRespaldo=null;
		
		classes=EstadoPrecioConstantesFunciones.getClassesRelationshipsOfEstadoPrecio(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadoprecioLogic.setDatosCliente(this.datosCliente);
		this.estadoprecioLogic.setDatosDeep(this.datosDeep);
		this.estadoprecioLogic.setIsConDeep(true);
		
		estadopreciosRespaldo=this.estadoprecioLogic.getEstadoPrecios();
		
		this.estadoprecioLogic.setEstadoPrecios(estadopreciosParaReportes);	
		this.estadoprecioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadopreciosParaReportes=this.estadoprecioLogic.getEstadoPrecios();
		this.estadoprecioLogic.setEstadoPrecios(estadopreciosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoprecio_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoPrecios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoPrecio("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoPrecio estadoprecio : estadopreciosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoPrecio("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoPrecioConstantesFunciones.generarExcelReporteDataEstadoPrecio("NORMAL",row,workbook,estadoprecio,cellStyleDataAux);
		
			
			


				//Precio
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PrecioConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadoprecio.getPrecios()!=null && estadoprecio.getPrecios().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PrecioConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PrecioConstantesFunciones.generarExcelReporteHeaderPrecio("RELACIONADO",row,workbook);
				}

				if(estadoprecio.getPrecios()!=null) {
					i2=0;
					for(Precio precio : estadoprecio.getPrecios()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PrecioConstantesFunciones.generarExcelReporteDataPrecio("RELACIONADO",row,workbook,precio,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoPrecioConstantesFunciones.getEstadoPrecioDescripcion(estadoprecio));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Precio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoPrecio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPrecio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoPrecio.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPrecio.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoPrecio() throws Exception {		
		this.startProcessEstadoPrecio(true);
	}
	
	public void startProcessEstadoPrecio(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoPrecio, this.jScrollPanelDatosEstadoPrecio,this.jPanelPaginacionEstadoPrecio, this.jScrollPanelDatosEdicionEstadoPrecio, this.jPanelAccionesEstadoPrecio,this.jPanelAccionesFormularioEstadoPrecio,this.jmenuBarEstadoPrecio,this.jmenuBarDetalleEstadoPrecio,this.jTtoolBarEstadoPrecio,this.jTtoolBarDetalleEstadoPrecio);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoPrecio=null; 
		
		final JPanel jPanelParametrosReportesEstadoPrecio=this.jPanelParametrosReportesEstadoPrecio;
		//final JScrollPane jScrollPanelDatosEstadoPrecio=this.jScrollPanelDatosEstadoPrecio;
		final JTable jTableDatosEstadoPrecio=this.jTableDatosEstadoPrecio;		
		final JPanel jPanelPaginacionEstadoPrecio=this.jPanelPaginacionEstadoPrecio;
		//final JScrollPane jScrollPanelDatosEdicionEstadoPrecio=this.jScrollPanelDatosEdicionEstadoPrecio;
		final JPanel jPanelAccionesEstadoPrecio=this.jPanelAccionesEstadoPrecio;
		
		JPanel jPanelCamposAuxiliarEstadoPrecio=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoPrecio=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) {
			jPanelCamposAuxiliarEstadoPrecio=this.jInternalFrameDetalleFormEstadoPrecio.jPanelCamposEstadoPrecio;
			jPanelAccionesFormularioAuxiliarEstadoPrecio=this.jInternalFrameDetalleFormEstadoPrecio.jPanelAccionesFormularioEstadoPrecio;
		}
		
		final JPanel jPanelCamposEstadoPrecio=jPanelCamposAuxiliarEstadoPrecio;
		final JPanel jPanelAccionesFormularioEstadoPrecio=jPanelAccionesFormularioAuxiliarEstadoPrecio;
		
		
		final JMenuBar jmenuBarEstadoPrecio=this.jmenuBarEstadoPrecio;
		final JToolBar jTtoolBarEstadoPrecio=this.jTtoolBarEstadoPrecio;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoPrecio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoPrecio=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) {
			jmenuBarDetalleAuxiliarEstadoPrecio=this.jInternalFrameDetalleFormEstadoPrecio.jmenuBarDetalleEstadoPrecio;
			jTtoolBarDetalleAuxiliarEstadoPrecio=this.jInternalFrameDetalleFormEstadoPrecio.jTtoolBarDetalleEstadoPrecio;
		}
		
		final JMenuBar jmenuBarDetalleEstadoPrecio=jmenuBarDetalleAuxiliarEstadoPrecio;
		final JToolBar jTtoolBarDetalleEstadoPrecio=jTtoolBarDetalleAuxiliarEstadoPrecio;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoPrecio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoPrecio;
			processRunnable.jTableDatos=jTableDatosEstadoPrecio;
			processRunnable.jPanelCampos=jPanelCamposEstadoPrecio;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoPrecio;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoPrecio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoPrecio;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoPrecio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoPrecio;
			processRunnable.jTtoolBar=jTtoolBarEstadoPrecio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoPrecio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoPrecio ,jPanelParametrosReportesEstadoPrecio,jTableDatosEstadoPrecio, /*jScrollPanelDatosEstadoPrecio,*/jPanelCamposEstadoPrecio,jPanelPaginacionEstadoPrecio, /*jScrollPanelDatosEdicionEstadoPrecio,*/ jPanelAccionesEstadoPrecio,jPanelAccionesFormularioEstadoPrecio,jmenuBarEstadoPrecio,jmenuBarDetalleEstadoPrecio,jTtoolBarEstadoPrecio,jTtoolBarDetalleEstadoPrecio);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoPrecio, jScrollPanelDatosEstadoPrecio,jPanelPaginacionEstadoPrecio, jScrollPanelDatosEdicionEstadoPrecio, jPanelAccionesEstadoPrecio,jPanelAccionesFormularioEstadoPrecio,jmenuBarEstadoPrecio,jmenuBarDetalleEstadoPrecio,jTtoolBarEstadoPrecio,jTtoolBarDetalleEstadoPrecio);
						
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
	
	public void finishProcessEstadoPrecio() {// throws Exception 
		this.finishProcessEstadoPrecio(true);
	}
	
	public void finishProcessEstadoPrecio(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoPrecio, this.jScrollPanelDatosEstadoPrecio,this.jPanelPaginacionEstadoPrecio, this.jScrollPanelDatosEdicionEstadoPrecio, this.jPanelAccionesEstadoPrecio,this.jPanelAccionesFormularioEstadoPrecio,this.jmenuBarEstadoPrecio,this.jmenuBarDetalleEstadoPrecio,this.jTtoolBarEstadoPrecio,this.jTtoolBarDetalleEstadoPrecio);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoPrecio=null; 
		
		final JPanel jPanelParametrosReportesEstadoPrecio=this.jPanelParametrosReportesEstadoPrecio;
		//final JScrollPane jScrollPanelDatosEstadoPrecio=this.jScrollPanelDatosEstadoPrecio;
		final JTable jTableDatosEstadoPrecio=this.jTableDatosEstadoPrecio;		
		final JPanel jPanelPaginacionEstadoPrecio=this.jPanelPaginacionEstadoPrecio;
		//final JScrollPane jScrollPanelDatosEdicionEstadoPrecio=this.jScrollPanelDatosEdicionEstadoPrecio;
		final JPanel jPanelAccionesEstadoPrecio=this.jPanelAccionesEstadoPrecio;
		
		JPanel jPanelCamposAuxiliarEstadoPrecio=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoPrecio=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) {
			jPanelCamposAuxiliarEstadoPrecio=this.jInternalFrameDetalleFormEstadoPrecio.jPanelCamposEstadoPrecio;
			jPanelAccionesFormularioAuxiliarEstadoPrecio=this.jInternalFrameDetalleFormEstadoPrecio.jPanelAccionesFormularioEstadoPrecio;
		}
		
		final JPanel jPanelCamposEstadoPrecio=jPanelCamposAuxiliarEstadoPrecio;
		final JPanel jPanelAccionesFormularioEstadoPrecio=jPanelAccionesFormularioAuxiliarEstadoPrecio;
		
		
		final JMenuBar jmenuBarEstadoPrecio=this.jmenuBarEstadoPrecio;		
		final JToolBar jTtoolBarEstadoPrecio=this.jTtoolBarEstadoPrecio;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoPrecio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoPrecio=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) {
			jmenuBarDetalleAuxiliarEstadoPrecio=this.jInternalFrameDetalleFormEstadoPrecio.jmenuBarDetalleEstadoPrecio;
			jTtoolBarDetalleAuxiliarEstadoPrecio=this.jInternalFrameDetalleFormEstadoPrecio.jTtoolBarDetalleEstadoPrecio;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoPrecio=jmenuBarDetalleAuxiliarEstadoPrecio;
		final JToolBar jTtoolBarDetalleEstadoPrecio=jTtoolBarDetalleAuxiliarEstadoPrecio;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoPrecio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoPrecio;
			processRunnable.jTableDatos=jTableDatosEstadoPrecio;
			processRunnable.jPanelCampos=jPanelCamposEstadoPrecio;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoPrecio;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoPrecio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoPrecio;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoPrecio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoPrecio;
			processRunnable.jTtoolBar=jTtoolBarEstadoPrecio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoPrecio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoPrecio ,jPanelParametrosReportesEstadoPrecio, jTableDatosEstadoPrecio,/*jScrollPanelDatosEstadoPrecio,*/jPanelCamposEstadoPrecio,jPanelPaginacionEstadoPrecio, /*jScrollPanelDatosEdicionEstadoPrecio,*/ jPanelAccionesEstadoPrecio,jPanelAccionesFormularioEstadoPrecio,jmenuBarEstadoPrecio,jmenuBarDetalleEstadoPrecio,jTtoolBarEstadoPrecio,jTtoolBarDetalleEstadoPrecio));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoPrecio(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoPrecio(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoPrecio(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoPrecio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoPrecio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoPrecio,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoPrecio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoPrecio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoPrecio,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadoprecioConstantesFunciones.getsFinalQueryEstadoPrecio();
		String  finalQueryPaginacionTodos=this.estadoprecioConstantesFunciones.getsFinalQueryEstadoPrecio();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoPrecioConstantesFunciones.getArrayColumnasGlobalesNoEstadoPrecio(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoPrecioConstantesFunciones.getArrayColumnasGlobalesEstadoPrecio(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoPrecioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadopreciosEliminados= new ArrayList<EstadoPrecio>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoPrecio();
		
				///*EstadoPrecioSessionBean*/this.estadoprecioSessionBean=new EstadoPrecioSessionBean();
			
			if(this.estadoprecioSessionBean==null) {
				this.estadoprecioSessionBean=new EstadoPrecioSessionBean();
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
					this.iNumeroPaginacion=EstadoPrecioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoPrecioConstantesFunciones.getClassesForeignKeysOfEstadoPrecio(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadoprecio."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadopreciosAux= new ArrayList<EstadoPrecio>();
			
				
			estadoprecioLogic.setDatosCliente(this.datosCliente);
			estadoprecioLogic.setDatosDeep(this.datosDeep);
			estadoprecioLogic.setIsConDeep(true);
			
			
			estadoprecioLogic.getEstadoPrecioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadoprecioLogic.getTodosEstadoPrecios(finalQueryGlobal,pagination);
					
					//estadoprecioLogic.getTodosEstadoPreciosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadoprecioLogic.getEstadoPrecios()==null|| estadoprecioLogic.getEstadoPrecios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadopreciosAux= new ArrayList<EstadoPrecio>();
							estadopreciosAux.addAll(estadoprecioLogic.getEstadoPrecios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadopreciosAux= new ArrayList<EstadoPrecio>();
							estadopreciosAux.addAll(estadoprecios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoprecioLogic.getTodosEstadoPrecios(finalQueryGlobal+"",this.pagination);												
							
							//estadoprecioLogic.getTodosEstadoPreciosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoPrecios("Todos",estadoprecioLogic.getEstadoPrecios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoprecioLogic.setEstadoPrecios(new ArrayList<EstadoPrecio>());					
							estadoprecioLogic.getEstadoPrecios().addAll(estadopreciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoprecios=new ArrayList<EstadoPrecio>();
							estadoprecios.addAll(estadopreciosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoPrecio=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoPrecio=this.idActual;
				
				} else if(this.idEstadoPrecioActual!=null && this.idEstadoPrecioActual!=0L) {
					idEstadoPrecio=idEstadoPrecioActual;
				}
				
					
				this.sDetalleReporte=EstadoPrecioConstantesFunciones.getDetalleIndicePorId(idEstadoPrecio);
				
				this.estadoprecios=new ArrayList<EstadoPrecio>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadoprecioLogic.getEntity(idEstadoPrecio);
					
					//estadoprecioLogic.getEntityWithConnection(idEstadoPrecio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoprecioLogic.setEstadoPrecios(new ArrayList<EstadoPrecio>());
					estadoprecioLogic.getEstadoPrecios().add(estadoprecioLogic.getEstadoPrecio());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoprecios=new ArrayList<EstadoPrecio>();
					this.estadoprecios.add(estadoprecio);
				}
				
				if(estadoprecioLogic.getEstadoPrecio()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoPrecio();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoPrecio();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoprecioLogic.getEstadoPrecios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoprecios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoprecioLogic.getEstadoPrecios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoprecios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoPrecio estadoprecio) {
		Boolean permite=true;
		
		if(this.estadoprecio.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoPrecioConstantesFunciones.getOrderByListaEstadoPrecio();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoPrecioConstantesFunciones.getOrderByListaEstadoPrecio();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPrecio estadoprecio:estadoprecioLogic.getEstadoPrecios()) {
				if(estadoprecio.getsType().equals(Constantes2.S_TOTALES)) {
					estadoprecioTotales=estadoprecio;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPrecio estadoprecio:this.estadoprecios) {
				if(estadoprecio.getsType().equals(Constantes2.S_TOTALES)) {
					estadoprecioTotales=estadoprecio;
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
			this.estadoprecioAux=new EstadoPrecio();
			this.estadoprecioAux.setsType(Constantes2.S_TOTALES);
			this.estadoprecioAux.setIsNew(false);
			this.estadoprecioAux.setIsChanged(false);
			this.estadoprecioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoPrecioConstantesFunciones.TotalizarValoresFilaEstadoPrecio(this.estadoprecioLogic.getEstadoPrecios(),this.estadoprecioAux);
				
				this.estadoprecioLogic.getEstadoPrecios().add(this.estadoprecioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoPrecioConstantesFunciones.TotalizarValoresFilaEstadoPrecio(this.estadoprecios,this.estadoprecioAux);
				
				this.estadoprecios.add(this.estadoprecioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadoprecioTotales=new EstadoPrecio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoprecioLogic.getEstadoPrecios().remove(estadoprecioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoprecios.remove(estadoprecioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadoprecioTotales=new EstadoPrecio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPrecio estadoprecio:estadoprecioLogic.getEstadoPrecios()) {
				if(estadoprecio.getsType().equals(Constantes2.S_TOTALES)) {
					estadoprecioTotales=estadoprecio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoPrecioConstantesFunciones.TotalizarValoresFilaEstadoPrecio(this.estadoprecioLogic.getEstadoPrecios(),estadoprecioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPrecio estadoprecio:this.estadoprecios) {
				if(estadoprecio.getsType().equals(Constantes2.S_TOTALES)) {
					estadoprecioTotales=estadoprecio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoPrecioConstantesFunciones.TotalizarValoresFilaEstadoPrecio(this.estadoprecios,estadoprecioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosEstadoPrecio() {
		this.isPermisoTodoEstadoPrecio=false;
		this.isPermisoNuevoEstadoPrecio=false;
		this.isPermisoActualizarEstadoPrecio=false;
		this.isPermisoActualizarOriginalEstadoPrecio=false;
		this.isPermisoEliminarEstadoPrecio=false;
		this.isPermisoGuardarCambiosEstadoPrecio=false;
		this.isPermisoConsultaEstadoPrecio=false;
		this.isPermisoBusquedaEstadoPrecio=false;
		this.isPermisoReporteEstadoPrecio=false;		
		this.isPermisoOrdenEstadoPrecio=false;		
		this.isPermisoPaginacionMedioEstadoPrecio=false;		
		this.isPermisoPaginacionAltoEstadoPrecio=false;
		this.isPermisoPaginacionTodoEstadoPrecio=false;
		this.isPermisoCopiarEstadoPrecio=false;		
		this.isPermisoVerFormEstadoPrecio=false;		
		this.isPermisoDuplicarEstadoPrecio=false;		
		this.isPermisoOrdenEstadoPrecio=false;		
	}
	
	public void setPermisosUsuarioEstadoPrecio(Boolean isPermiso) {
		this.isPermisoTodoEstadoPrecio=isPermiso;
		this.isPermisoNuevoEstadoPrecio=isPermiso;
		this.isPermisoActualizarEstadoPrecio=isPermiso;
		this.isPermisoActualizarOriginalEstadoPrecio=isPermiso;
		this.isPermisoEliminarEstadoPrecio=isPermiso;
		this.isPermisoGuardarCambiosEstadoPrecio=isPermiso;
		this.isPermisoConsultaEstadoPrecio=isPermiso;
		this.isPermisoBusquedaEstadoPrecio=isPermiso;
		this.isPermisoReporteEstadoPrecio=isPermiso;
		this.isPermisoOrdenEstadoPrecio=isPermiso;		
		this.isPermisoPaginacionMedioEstadoPrecio=isPermiso;		
		this.isPermisoPaginacionAltoEstadoPrecio=isPermiso;		
		this.isPermisoPaginacionTodoEstadoPrecio=isPermiso;		
		this.isPermisoCopiarEstadoPrecio=isPermiso;		
		this.isPermisoVerFormEstadoPrecio=isPermiso;		
		this.isPermisoDuplicarEstadoPrecio=isPermiso;
		this.isPermisoOrdenEstadoPrecio=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoPrecio(Boolean isPermiso) {
		//this.isPermisoTodoEstadoPrecio=isPermiso;
		this.isPermisoNuevoEstadoPrecio=isPermiso;
		this.isPermisoActualizarEstadoPrecio=isPermiso;
		this.isPermisoActualizarOriginalEstadoPrecio=isPermiso;
		this.isPermisoEliminarEstadoPrecio=isPermiso;
		this.isPermisoGuardarCambiosEstadoPrecio=isPermiso;
		//this.isPermisoConsultaEstadoPrecio=isPermiso;
		//this.isPermisoBusquedaEstadoPrecio=isPermiso;
		//this.isPermisoReporteEstadoPrecio=isPermiso;
		//this.isPermisoOrdenEstadoPrecio=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoPrecio=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoPrecio=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoPrecio=isPermiso;		
		//this.isPermisoCopiarEstadoPrecio=isPermiso;		
		//this.isPermisoDuplicarEstadoPrecio=isPermiso;
		//this.isPermisoOrdenEstadoPrecio=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoPrecioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(PrecioConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoPrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPrecio=false;
		this.isTienePermisosPrecio=this.verificarGetPermisosUsuarioOpcionEstadoPrecioClaseRelacionada(this.opcionsRelacionadas,PrecioConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoPrecio(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoPrecioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosPrecio=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoPrecioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoPrecioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoPrecioClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosPrecio && this.jInternalFrameDetalleFormEstadoPrecio!=null && this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoPrecio.jTabbedPaneRelacionesEstadoPrecio.remove(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoPrecio() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoPrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoPrecioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoPrecio=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoPrecio=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoPrecio=this.isPermisoActualizarEstadoPrecio;
			this.isPermisoEliminarEstadoPrecio=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoPrecio=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoPrecio=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoPrecio=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoPrecio=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoPrecio=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoPrecio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoPrecio=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoPrecio=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoPrecio=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoPrecio=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoPrecio=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoPrecio=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoPrecio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoPrecio.setToolTipText(this.jTableDatosEstadoPrecio.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoPrecio(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoPrecio(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoPrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoPrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoPrecio() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosPrecio && this.estadoprecioConstantesFunciones.mostrarPrecioEstadoPrecio && !EstadoPrecioConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Precio");
			reporte.setsDescripcion("Precio");
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
	
		
	public void inicializarCombosForeignKeyEstadoPrecioListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoPrecioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoPrecioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoPrecioListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoPrecioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoPrecio()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoPrecio()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoPrecio(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoPrecio()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoPrecio();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoPrecio(EstadoPrecio estadoprecio)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoPrecio(EstadoPrecio estadoprecio,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoPrecio()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoPrecio()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoPrecio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoPrecio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoPrecio()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoPrecio()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoPrecio(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoPrecio()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoPrecioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoPrecioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoPrecioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadoprecioSessionBean=new EstadoPrecioSessionBean(); 
		this.estadoprecioConstantesFunciones=new EstadoPrecioConstantesFunciones(); 
		this.estadoprecioBean=new EstadoPrecio();//(this.estadoprecioConstantesFunciones); 		
		this.estadoprecioReturnGeneral=new EstadoPrecioParameterReturnGeneral(); 
		
		this.estadoprecioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoprecioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoPrecioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoPrecioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoPrecioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoPrecio(true);
			
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
			
			this.estadoprecioConstantesFunciones=new EstadoPrecioConstantesFunciones(); 
			this.estadoprecioBean=new EstadoPrecio();//this.estadoprecioConstantesFunciones); 			
			this.estadoprecioReturnGeneral=new EstadoPrecioParameterReturnGeneral(); 
		
			EstadoPrecioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Precio Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadoprecio=new EstadoPrecio();
			this.estadoprecios = new ArrayList<EstadoPrecio>();
			this.estadopreciosAux = new ArrayList<EstadoPrecio>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic=new EstadoPrecioLogic();
				this.estadoprecioLogic.getNewConnexionToDeep("");
			}
			
			//this.estadoprecioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadoprecioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoPrecio);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoPrecio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoPrecio);	
					}
					
					if(this.jInternalFrameImportacionEstadoPrecio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoPrecio);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoPrecio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoPrecio);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoPrecio!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoPrecio);
				this.jInternalFrameDetalleFormEstadoPrecio.setVisible(false);
				this.jInternalFrameDetalleFormEstadoPrecio.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoPrecio!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoPrecio);
					this.jInternalFrameReporteDinamicoEstadoPrecio.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoPrecio.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoPrecio!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoPrecio);
					this.jInternalFrameImportacionEstadoPrecio.setVisible(false);
					this.jInternalFrameImportacionEstadoPrecio.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoPrecio!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoPrecio);
					this.jInternalFrameOrderByEstadoPrecio.setVisible(false);
					this.jInternalFrameOrderByEstadoPrecio.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoPrecioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoPrecioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadoprecioReturnGeneral=new EstadoPrecioParameterReturnGeneral();
			
			this.estadoprecioParameterGeneral=new EstadoPrecioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadoprecioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoPrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(PrecioConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoPrecioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoprecioSessionBean.getEsGuardarRelacionado(),this.estadoprecioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoPrecioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoprecioSessionBean.getEsGuardarRelacionado(),this.estadoprecioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoPrecio=false;
			this.isVisibilidadCeldaDuplicarEstadoPrecio=true;
			this.isVisibilidadCeldaCopiarEstadoPrecio=true;
			this.isVisibilidadCeldaVerFormEstadoPrecio=true;
			this.isVisibilidadCeldaOrdenEstadoPrecio=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPrecio=false;
			this.isVisibilidadCeldaModificarEstadoPrecio=false;
			this.isVisibilidadCeldaActualizarEstadoPrecio=false;
			this.isVisibilidadCeldaEliminarEstadoPrecio=false;
			this.isVisibilidadCeldaCancelarEstadoPrecio=false;
			this.isVisibilidadCeldaGuardarEstadoPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPrecio=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoPrecio();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoPrecio(false);
			
			this.setPermisosUsuarioEstadoPrecio();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoprecioSessionBean.getEsGuardarRelacionado() 
				|| (this.estadoprecioSessionBean.getEsGuardarRelacionado() && this.estadoprecioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoPrecioClasesRelacionadas();
			}
			
			if(this.estadoprecioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoPrecioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoPrecioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoPrecio();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoPrecio();
			}
			
			if(!this.isPermisoBusquedaEstadoPrecio) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoprecioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoPrecio,this.isPermisoPaginacionMedioEstadoPrecio,this.isPermisoPaginacionTodoEstadoPrecio);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoPrecioConstantesFunciones.getTiposSeleccionarEstadoPrecio());
				
				this.tiposColumnasSelect=EstadoPrecioConstantesFunciones.getTiposSeleccionarEstadoPrecio(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoPrecio();				
				//this.tiposRelacionesSelect=EstadoPrecioConstantesFunciones.getTiposRelacionesEstadoPrecio(true);
				
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
			//if(!this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoPrecio();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoPrecio(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoPrecio(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoPrecio() ;
			
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
			
			
			this.precioLogic=new PrecioLogic(); 
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
				estadoprecioImplementable= (EstadoPrecioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoPrecioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadoprecioImplementableHome= (EstadoPrecioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoPrecioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadoprecios= new ArrayList<EstadoPrecio>();
			this.estadopreciosEliminados= new ArrayList<EstadoPrecio>();
						
			this.isEsNuevoEstadoPrecio=false;
			this.esParaAccionDesdeFormularioEstadoPrecio=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoPrecio(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoPrecio();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoPrecioBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoPrecioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoPrecio(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoPrecio!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoPrecio();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoPrecio();
			}
			
			EstadoPrecioBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoPrecio(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoPrecio: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoPrecio() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(PrecioConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PrecioConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoPrecio")) {
				iIndex=this.jInternalFrameDetalleFormEstadoPrecio.jTabbedPaneRelacionesEstadoPrecio.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoPrecio.jTabbedPaneRelacionesEstadoPrecio.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoPrecio.getSelectedRow();	
				
				

				if(sTitle.equals("Precios")) {
					if(!PrecioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoPrecio();

						this.cargarParteTabPanelRelacionadaPrecio(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoPrecio();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaPrecio(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoPrecio.cargarSessionConBeanSwingJInternalFramePrecio(false,true,iIndex);
		this.jButtonPrecioActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPrecio();

		//this.jTabbedPaneRelacionesEstadoPrecio.updateUI();
		//this.jTabbedPaneRelacionesEstadoPrecio.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoPrecio.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Precio")) {
				int row=this.jTableDatosEstadoPrecio.getSelectedRow();
				jButtonPrecioActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Precio")) {

					if(this.isTienePermisosPrecio && this.estadoprecioConstantesFunciones.mostrarPrecioEstadoPrecio && !EstadoPrecioConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Precios"+"("+PrecioConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Precios");

						if(estadoprecioConstantesFunciones.resaltarPrecioEstadoPrecio!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadoprecioConstantesFunciones.resaltarPrecioEstadoPrecio);
						}

						jmenuItem.setEnabled(this.estadoprecioConstantesFunciones.activarPrecioEstadoPrecio);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Precio"));

						

						this.jInternalFrameDetalleFormEstadoPrecio.jmenuDetalleEstadoPrecio.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoPrecio(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoPrecio(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoPrecio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoPrecioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoPrecio();
		
		this.cargarCombosFrameForeignKeyEstadoPrecio();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoPrecio();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoPrecio();
		}
	}
	
	
	
	public void jButtonNuevoEstadoPrecioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadoprecioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
			
			
			if(jTableDatosEstadoPrecio.getRowCount()>=1) {
				jTableDatosEstadoPrecio.removeRowSelectionInterval(0, jTableDatosEstadoPrecio.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoPrecio=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoPrecio(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoPrecio(true);			
			//this.estadoprecio=new EstadoPrecio();
			//this.estadoprecio.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoPrecio(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoPrecio() ;
			
			if(EstadoPrecioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoPrecio(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadoprecio);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadoprecio);				
			
			EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
			
			if(this.estadoprecioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoPrecio: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoPrecioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoPrecio> estadopreciosSeleccionados=new ArrayList<EstadoPrecio>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoPrecio.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoPrecio.getSelectedRows().length;			
			}
			
			estadopreciosSeleccionados=this.getEstadoPreciosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoPrecio--;			
				//EstadoPrecio estadoprecioAux= new EstadoPrecio();			
				//estadoprecioAux.setId(this.iIdNuevoEstadoPrecio);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoPrecio estadoprecioOrigen=new EstadoPrecio();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoPrecio estadoprecioOrigen : estadopreciosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoPrecio.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadoprecioOrigen =(EstadoPrecio) this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoprecioOrigen =(EstadoPrecio) this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoPrecio();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadoprecio.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoPrecio(estadoprecioOrigen,this.estadoprecio,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPrecio(this.estadoprecio);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoprecioLogic.getEstadoPrecios().add(this.estadoprecioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoprecios.add(this.estadoprecioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoPrecio(false);
				
				this.jTableDatosEstadoPrecio.setRowSelectionInterval(this.getIndiceNuevoEstadoPrecio(), this.getIndiceNuevoEstadoPrecio());
				
				int iLastRow =  this.jTableDatosEstadoPrecio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoPrecio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoPrecio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoPrecio(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoPrecio> estadopreciosSeleccionados=new ArrayList<EstadoPrecio>();									
		
			EstadoPrecio estadoprecioOrigen=new EstadoPrecio();
			EstadoPrecio estadoprecioDestino=new EstadoPrecio();
				
			estadopreciosSeleccionados=this.getEstadoPreciosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoPrecio.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadopreciosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoPrecio.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoprecioOrigen =(EstadoPrecio) this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoprecioOrigen =(EstadoPrecio) this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoprecioDestino =(EstadoPrecio) this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoprecioDestino =(EstadoPrecio) this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadoprecioOrigen =estadopreciosSeleccionados.get(0);
				estadoprecioDestino =estadopreciosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoPrecio(estadoprecioOrigen,estadoprecioDestino,true,false);
				
				estadoprecioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoprecioDestino,estadoprecioLogic.getEstadoPrecios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoprecioDestino,estadoprecios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoPrecio(false);
				
				//this.jTableDatosEstadoPrecio.setRowSelectionInterval(this.getIndiceNuevoEstadoPrecio(), this.getIndiceNuevoEstadoPrecio());
				
				int iLastRow =  this.jTableDatosEstadoPrecio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoPrecio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoPrecio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoPrecio(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoPrecio.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoPrecio.isVisible();
			
			
			this.jPanelParametrosReportesEstadoPrecio.setVisible(!isVisible);
			this.jPanelPaginacionEstadoPrecio.setVisible(!isVisible);
			this.jPanelAccionesEstadoPrecio.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoPrecio();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoPrecio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoPrecio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoPrecio();
			
			this.abrirFrameOrderByEstadoPrecio();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoPrecio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoPrecio(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoPrecio);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoPrecio.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoPrecio.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoPrecio.setSize(this.jInternalFrameDetalleFormEstadoPrecio.iWidthFormulario,this.jInternalFrameDetalleFormEstadoPrecio.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoPrecio.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoPrecio.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoPrecio.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoPrecio.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoPrecio.jContentPaneDetalleEstadoPrecio.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoPrecio.jTabbedPaneRelacionesEstadoPrecio.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoPrecio.jContentPaneDetalleEstadoPrecio.getWidth(),EstadoPrecioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoPrecio.jTabbedPaneRelacionesEstadoPrecio.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoPrecio.jContentPaneDetalleEstadoPrecio.getWidth(),EstadoPrecioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoPrecio.jTabbedPaneRelacionesEstadoPrecio.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoPrecio.jContentPaneDetalleEstadoPrecio.getWidth(),EstadoPrecioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(PrecioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPrecio();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoPrecio.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoPrecio.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoPrecio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoPrecio==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoPrecio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPrecio,false,this);
				} else {
					this.jInternalFrameOrderByEstadoPrecio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPrecio,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoPrecio);
				this.jInternalFrameOrderByEstadoPrecio.setVisible(false);
				this.jInternalFrameOrderByEstadoPrecio.setSelected(false);
				
				this.jInternalFrameOrderByEstadoPrecio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoPrecio"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoPrecio();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoPrecio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoPrecio==null) {
				
				this.jInternalFrameImportacionEstadoPrecio=new ImportacionJInternalFrame(EstadoPrecioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoPrecio);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoPrecio);
				this.jInternalFrameImportacionEstadoPrecio.setVisible(false);
				this.jInternalFrameImportacionEstadoPrecio.setSelected(false);


				this.jInternalFrameImportacionEstadoPrecio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoPrecio"));
				this.jInternalFrameImportacionEstadoPrecio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoPrecio"));
				this.jInternalFrameImportacionEstadoPrecio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoPrecio"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoPrecio() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoPrecio==null) {
				this.jInternalFrameReporteDinamicoEstadoPrecio=new ReporteDinamicoJInternalFrame(EstadoPrecioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoPrecio);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoPrecio);
				this.jInternalFrameReporteDinamicoEstadoPrecio.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoPrecio.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoPrecio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoPrecio"));
				this.jInternalFrameReporteDinamicoEstadoPrecio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoPrecio"));
				this.jInternalFrameReporteDinamicoEstadoPrecio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoPrecio"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoPrecio();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaPrecio() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.jScrollPanelDatosPrecio.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoPrecio.jContentPaneDetalleEstadoPrecio.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.jScrollPanelDatosPrecio.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.jScrollPanelDatosPrecio.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.jScrollPanelDatosPrecio.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoPrecio() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoPrecio);
			
	       	this.jInternalFrameDetalleFormEstadoPrecio.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoPrecio.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoPrecio.dispose();
			//this.jInternalFrameDetalleFormEstadoPrecio=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoPrecio() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoPrecio.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoPrecio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoPrecio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoPrecio.setVisible(true);
	        this.jInternalFrameImportacionEstadoPrecio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoPrecio() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoPrecio.setVisible(true);
	        this.jInternalFrameOrderByEstadoPrecio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoPrecio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoPrecio.setVisible(false);
	        this.jInternalFrameOrderByEstadoPrecio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoPrecio() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoPrecio.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoPrecio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoPrecio() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoPrecio.setVisible(false);
	        this.jInternalFrameImportacionEstadoPrecio.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoPrecio(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoPrecio(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoPrecio.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoPrecio(true);
			//this.isEsNuevoEstadoPrecio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecio =(EstadoPrecio) this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoprecio =(EstadoPrecio) this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoPrecio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoPrecio(false) ;
			
			if(estadoprecioSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precioSessionBean.getEsGuardarRelacionado() && PrecioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPrecioActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoPrecioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoPrecio(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoPrecio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoPrecioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecio =(EstadoPrecio) this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoprecio =(EstadoPrecio) this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoPrecio(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoPrecio.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoPrecio(true);
			//this.isEsNuevoEstadoPrecio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecio =(EstadoPrecio) this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoprecio =(EstadoPrecio) this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadoprecio.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoPrecio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoPrecio(false) ;
			
			if(EstadoPrecioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoPrecio(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoPrecio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoPrecio(false);
			
			//if(!this.isEsNuevoEstadoPrecio) {								
				int intSelectedRow = this.jTableDatosEstadoPrecio.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecio =(EstadoPrecio) this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoprecio =(EstadoPrecio) this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoPrecio(this.estadoprecio,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoPrecio(this.estadoprecio);
				
			}
			
			if(this.permiteMantenimiento(this.estadoprecio)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoPrecio=true;
					this.inicializarActualizarBindingTablaEstadoPrecio(false);
					this.isEsNuevoEstadoPrecio=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoPrecio=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoPrecio=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoPrecio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoPrecio(false);
				
				this.habilitarDeshabilitarControlesEstadoPrecio(false);
			
												
				
				if(EstadoPrecioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoPrecio();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoPrecioActionPerformed(evt,estadoprecioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoPrecio(this.estadoprecio,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoPrecio.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadoprecioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadoprecio.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoPrecio.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPrecio.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoPrecio.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecio =(EstadoPrecio) this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
				this.estadoprecio.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoprecio =(EstadoPrecio) this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
				this.estadoprecio.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadoprecio)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoPrecioModel) this.jTableDatosEstadoPrecio.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoPrecio=true;
				this.inicializarActualizarBindingTablaEstadoPrecio(false);
				this.isEsNuevoEstadoPrecio=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoPrecio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoPrecio(false);
				
				this.habilitarDeshabilitarControlesEstadoPrecio(false);
				
				
				
				if(EstadoPrecioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoPrecio();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoPrecioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoPrecio.getRowCount()>=1) {
				jTableDatosEstadoPrecio.removeRowSelectionInterval(0, jTableDatosEstadoPrecio.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoPrecio(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoPrecio(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoPrecio(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoPrecio(false) ;
			
			this.isEsNuevoEstadoPrecio=false;
			
			if(EstadoPrecioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoPrecio();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoPrecio(false);
				
				//SI ES MANUAL
				if(EstadoPrecioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoPrecio();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoPrecio--;			
			//EstadoPrecio estadoprecioAux= new EstadoPrecio();			
			//estadoprecioAux.setId(this.iIdNuevoEstadoPrecio);
			
			if(this.jInternalFrameDetalleFormEstadoPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoPrecio();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoPrecio(this.estadoprecio);
			
			this.estadoprecio.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadoprecioLogic.getEstadoPrecios().add(this.estadoprecioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadoprecios.add(this.estadoprecioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoPrecio(false);
			
			this.jTableDatosEstadoPrecio.setRowSelectionInterval(this.getIndiceNuevoEstadoPrecio(), this.getIndiceNuevoEstadoPrecio());
			
			int iLastRow =  this.jTableDatosEstadoPrecio.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoPrecio.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoPrecio.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoPrecio(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoPrecio(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoPrecio(false);
			
			//SI ES MANUAL
			if(EstadoPrecioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoPrecio();
			}
			
			//this.abrirFrameTreeEstadoPrecio();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoPrecioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado PrecioES ?", "MANTENIMIENTO DE Estado Precio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoPrecio.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoPrecio();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadoprecioReturnGeneral=estadoprecioLogic.procesarImportacionEstadoPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadoprecioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoPrecioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoPrecioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoPrecio.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoPrecio.setFileImportacion(this.jInternalFrameImportacionEstadoPrecio.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoPrecio.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoPrecio.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoPrecio.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoPrecio.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoPrecio> estadopreciosSeleccionados=new ArrayList<EstadoPrecio>();		

		estadopreciosSeleccionados=this.getEstadoPreciosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoPrecio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoPrecio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoPrecioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoPrecioBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoPrecios("Todos",estadopreciosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Precio",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoPrecio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPrecio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoPrecioConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoPrecioConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoPrecio.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoPrecio.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoPrecio.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoPrecioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoPrecioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoPrecio.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoPrecioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoPrecioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoPrecio.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPrecio.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoPrecioConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoPrecioConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoPrecioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoPrecio> estadopreciosSeleccionados=new ArrayList<EstadoPrecio>();		
		
		estadopreciosSeleccionados=this.getEstadoPreciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoprecio";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoPrecios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoPrecio.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPrecio.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoPrecioConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoPrecioConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoPrecio estadoprecio:estadopreciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoprecio.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoPrecioConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoPrecioConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoPrecio estadoprecio:estadopreciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoprecio.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoPrecio(row);				
			//	iRow++;
			//}				
			
			//for(EstadoPrecio estadoprecioAux:estadopreciosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoPrecio(estadoprecioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Precio",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadoprecioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoPrecio(false);
			
			//SI ES MANUAL
			if(EstadoPrecioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoPrecio();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoPrecio(false);
			
			//SI ES MANUAL
			if(EstadoPrecioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoPrecio();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoPrecio(false);
			
			//SI ES MANUAL
			if(EstadoPrecioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoPrecio();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoprecioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoPrecio() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoPrecio.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoPrecio.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoPrecio.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoPrecio.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoPrecio.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoPrecio.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoPrecio.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoPrecio(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoPrecio(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoPrecio(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoPrecio(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoPrecio(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoPrecio(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoPrecio(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoPrecio(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoPrecioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoPrecio() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoPrecio();
		
		this.inicializarActualizarBindingBotonesManualEstadoPrecio(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoPrecio();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoPrecio() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoPrecio(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoPrecio(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoPrecio.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoPrecio.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoPrecio.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoPrecio!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoPrecio.jCheckBoxPostAccionNuevoEstadoPrecio.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoPrecio.jCheckBoxPostAccionSinCerrarEstadoPrecio.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoPrecio.jCheckBoxPostAccionSinMensajeEstadoPrecio.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoPrecio.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoPrecio.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoPrecio.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoPrecio!=null) {
				this.jInternalFrameDetalleFormEstadoPrecio.jCheckBoxPostAccionNuevoEstadoPrecio.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoPrecio.jCheckBoxPostAccionSinCerrarEstadoPrecio.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoPrecio.jCheckBoxPostAccionSinMensajeEstadoPrecio.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoPrecio.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoPrecio.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoPrecio!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoPrecio.jComboBoxTiposAccionesFormularioEstadoPrecio.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoPrecio.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoPrecio!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoPrecio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoPrecio.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoPrecio.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoPrecio.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoPrecio.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoPrecio!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoPrecio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoPrecio.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoPrecio.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoPrecio(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoPrecioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoPrecio(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoPrecio() throws Exception {
		try	{
			if(EstadoPrecioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoPrecio();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoPrecio() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoPrecio.jComboBoxTiposAccionesFormularioEstadoPrecio.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoPrecio.jComboBoxTiposAccionesFormularioEstadoPrecio.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoPrecio() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoPrecio.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoPrecio.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoPrecio.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoPrecio.addItem(reporte);
			}
			
			
			if(!this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoPrecio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoPrecio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoPrecio.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoPrecio.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoPrecio!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoPrecio.jComboBoxTiposAccionesFormularioEstadoPrecio.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoPrecio.jComboBoxTiposAccionesFormularioEstadoPrecio.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoPrecio.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoPrecio.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoPrecio();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoPrecio() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoPrecio!=null) {
				this.jInternalFrameReporteDinamicoEstadoPrecio.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoPrecio.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoPrecio!=null) {
				this.jInternalFrameReporteDinamicoEstadoPrecio.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoPrecio.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoPrecio!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoPrecio.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoPrecio.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoPrecio.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoPrecio.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoPrecio.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoPrecio.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoPrecio()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoPrecio(Boolean esInicializar) throws Exception {				
		if(EstadoPrecioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoPrecio();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoPrecio() throws Exception {
		this.inicializarActualizarBindingTablaEstadoPrecio(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoPrecio() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoPrecio.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoPrecio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoPrecio.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoPrecioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoPrecio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoPrecio.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoPrecioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoPrecioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPrecioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoPrecioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoPrecio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoPrecio.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoPrecioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoPrecio.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoPrecio(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadoprecioLogic.getEstadoPrecios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadoprecios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoPrecio.setModel(new EstadoPrecioModel(this.estadoprecioLogic.getEstadoPrecios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoPrecio.setModel(new EstadoPrecioModel(this.estadoprecios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoPrecio!=null && this.jInternalFrameOrderByEstadoPrecio.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoPrecio();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPrecio,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoPrecioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO,estadoprecioConstantesFunciones.resaltarSeleccionarEstadoPrecio,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoPrecioConstantesFunciones.SCLASSWEBTITULO,estadoprecioConstantesFunciones.resaltarSeleccionarEstadoPrecio,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPrecio,EstadoPrecioConstantesFunciones.LABEL_ID));

		if(this.estadoprecioConstantesFunciones.mostraridEstadoPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoPrecioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadoprecioConstantesFunciones.resaltaridEstadoPrecio,this.estadoprecioConstantesFunciones.activaridEstadoPrecio,this,true,"idEstadoPrecio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoprecioConstantesFunciones.resaltaridEstadoPrecio,this.estadoprecioConstantesFunciones.activaridEstadoPrecio,this,true,"idEstadoPrecio","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPrecio,EstadoPrecioConstantesFunciones.LABEL_CODIGO));

		if(this.estadoprecioConstantesFunciones.mostrarcodigoEstadoPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoPrecioConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoprecioConstantesFunciones.resaltarcodigoEstadoPrecio,this.estadoprecioConstantesFunciones.activarcodigoEstadoPrecio,this,true,"codigoEstadoPrecio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoprecioConstantesFunciones.resaltarcodigoEstadoPrecio,this.estadoprecioConstantesFunciones.activarcodigoEstadoPrecio,this,true,"codigoEstadoPrecio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoPrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPrecio,EstadoPrecioConstantesFunciones.LABEL_NOMBRE));

		if(this.estadoprecioConstantesFunciones.mostrarnombreEstadoPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoPrecioConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoprecioConstantesFunciones.resaltarnombreEstadoPrecio,this.estadoprecioConstantesFunciones.activarnombreEstadoPrecio,this,true,"nombreEstadoPrecio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoprecioConstantesFunciones.resaltarnombreEstadoPrecio,this.estadoprecioConstantesFunciones.activarnombreEstadoPrecio,this,true,"nombreEstadoPrecio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoPrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadoprecioSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosPrecio && this.estadoprecioConstantesFunciones.mostrarPrecioEstadoPrecio && !EstadoPrecioConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Precios");
				tableColumn.setHeaderValue("Precios");
				tableColumn.setCellRenderer(new PrecioTableCell(estadoprecioConstantesFunciones.resaltarPrecioEstadoPrecio,this,this.estadoprecioConstantesFunciones.activarPrecioEstadoPrecio));
				tableColumn.setCellEditor(new PrecioTableCell(estadoprecioConstantesFunciones.resaltarPrecioEstadoPrecio,this,this.estadoprecioConstantesFunciones.activarPrecioEstadoPrecio));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoPrecio.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoprecioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoprecioSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoPrecio.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoprecioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoprecioSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoPrecio.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoPrecio && this.isPermisoGuardarCambiosEstadoPrecio) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadoprecioSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadoprecioSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoPrecio.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadoprecioSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoPrecio.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoPrecio.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoPrecio && this.isPermisoGuardarCambiosEstadoPrecio) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadoprecioSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoPrecio && this.isPermisoGuardarCambiosEstadoPrecio) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoPrecio.moveColumn(this.jTableDatosEstadoPrecio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoPrecio.moveColumn(this.jTableDatosEstadoPrecio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadoprecioSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoPrecio.moveColumn(this.jTableDatosEstadoPrecio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoPrecio.moveColumn(this.jTableDatosEstadoPrecio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoPrecio.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoPrecio.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoPrecio,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoPrecio.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoPrecio.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoPrecio.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoPrecio.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoPrecio.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadoprecioLogic.getEstadoPrecios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadoprecios.size()-1;
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
		//this.jTableDatosEstadoPrecio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoPrecio();
			
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
				
				//this.isEsNuevoEstadoPrecio=false;
					
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
			
				if(this.estadoprecioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoPrecio==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoPrecio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoPrecio.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecio =(EstadoPrecio) this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoprecio =(EstadoPrecio) this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadoprecio.getsType().equals("DUPLICADO")
				   || this.estadoprecio.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoPrecio=true;
				
				} else {
					this.isEsNuevoEstadoPrecio=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
					if(this.estadoprecio.getId()>=0 && !this.estadoprecio.getIsNew()) {						
						this.isEsNuevoEstadoPrecio=false;
						
					} else {
						this.isEsNuevoEstadoPrecio=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoPrecio(esRelaciones);						
				
				this.seleccionarEstadoPrecio(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadoprecio.getId()<0) {
					this.isEsNuevoEstadoPrecio=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoPrecio(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoPrecio(evt,rowIndex);
				}	
				
				if(this.estadoprecioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoPrecio: " + this.dDif); 
					}
				}								
				
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoPrecio(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadoprecio)) {
					if(this.estadoprecio.getId()>0) {
						this.estadoprecio.setIsDeleted(true);
						
						this.estadopreciosEliminados.add(this.estadoprecio);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoprecioLogic.getEstadoPrecios().remove(this.estadoprecio);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoprecios.remove(this.estadoprecio);				
					}
					
					
					((EstadoPrecioModel) this.jTableDatosEstadoPrecio.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoPrecio(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoPrecio(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoPrecio) {
			
			if(this.jInternalFrameDetalleFormEstadoPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoPrecio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoPrecio.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecio =(EstadoPrecio) this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoprecio =(EstadoPrecio) this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoPrecio(this.estadoprecio);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoPrecio("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoPrecio(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoPrecio() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoPrecio(EstadoPrecio estadoprecio) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoPrecio(estadoprecio,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoPrecio(EstadoPrecio estadoprecio,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoPrecio(estadoprecio);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoPrecio(estadoprecio,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoPrecio(estadoprecio);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoPrecio(EstadoPrecio estadoprecio) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldidEstadoPrecio.setText(estadoprecio.getId().toString());
			this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldcodigoEstadoPrecio.setText(estadoprecio.getcodigo());
			this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldnombreEstadoPrecio.setText(estadoprecio.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoPrecio estadoprecioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadoprecioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoPrecio estadoprecioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadoprecioLocal=this.estadoprecio;
			} else {
				estadoprecioLocal=this.estadoprecioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadoprecioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoPrecio(estadoprecioLocal,true);
					
					if(estadoprecioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadoprecioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadoprecioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoPrecio(EstadoPrecio estadoprecio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoPrecio(estadoprecio,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoPrecio(estadoprecio);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoPrecio(EstadoPrecio estadoprecio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoPrecio(estadoprecio,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoPrecio(EstadoPrecio estadoprecio,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldidEstadoPrecio.getText()==null || this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldidEstadoPrecio.getText()=="" || this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldidEstadoPrecio.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldidEstadoPrecio.setText("0");
			}

			if(conColumnasBase) {estadoprecio.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldidEstadoPrecio.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoPrecioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPrecio.jLabelIdEstadoPrecio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoprecio.setcodigo(this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldcodigoEstadoPrecio.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoPrecioConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPrecio.jLabelcodigoEstadoPrecio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoprecio.setnombre(this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldnombreEstadoPrecio.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoPrecioConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPrecio.jLabelnombreEstadoPrecio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoPrecio(EstadoPrecio estadoprecioBean,EstadoPrecio estadoprecio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoPrecio(EstadoPrecio estadoprecioOrigen,EstadoPrecio estadoprecio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoprecioOrigen.getId()!=null && !estadoprecioOrigen.getId().equals(0L))) {estadoprecio.setId(estadoprecioOrigen.getId());}}
			if(conDefault || (!conDefault && estadoprecioOrigen.getcodigo()!=null && !estadoprecioOrigen.getcodigo().equals(""))) {estadoprecio.setcodigo(estadoprecioOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadoprecioOrigen.getnombre()!=null && !estadoprecioOrigen.getnombre().equals(""))) {estadoprecio.setnombre(estadoprecioOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoPrecio(EstadoPrecio estadoprecio) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldidEstadoPrecio.setText(estadoprecio.getId().toString());
			this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldcodigoEstadoPrecio.setText(estadoprecio.getcodigo());
			this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldnombreEstadoPrecio.setText(estadoprecio.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoPrecio(EstadoPrecioBean estadoprecioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldidEstadoPrecio.setText(estadoprecioBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldcodigoEstadoPrecio.setText(estadoprecioBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldnombreEstadoPrecio.setText(estadoprecioBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoPrecio(EstadoPrecioParameterReturnGeneral estadoprecioReturnGeneral,EstadoPrecioBean estadoprecioBean,Boolean conDefault) throws Exception { 
		try {
			EstadoPrecio estadoprecioLocal=new EstadoPrecio();
			
			estadoprecioLocal=estadoprecioReturnGeneral.getEstadoPrecio();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoprecioLocal.getId()!=null && !estadoprecioLocal.getId().equals(0L))) {estadoprecioBean.setId(estadoprecioLocal.getId());}}
			if(conDefault || (!conDefault && estadoprecioLocal.getcodigo()!=null && !estadoprecioLocal.getcodigo().equals(""))) {estadoprecioBean.setcodigo(estadoprecioLocal.getcodigo());}
			if(conDefault || (!conDefault && estadoprecioLocal.getnombre()!=null && !estadoprecioLocal.getnombre().equals(""))) {estadoprecioBean.setnombre(estadoprecioLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoPrecioGenerico(Long idEstadoPrecioSeleccionado,JComboBox jComboBoxEstadoPrecio,List<EstadoPrecio> estadopreciosLocal)throws Exception {
		try {
			EstadoPrecio  estadoprecioTemp=null;

			for(EstadoPrecio estadoprecioAux:estadopreciosLocal) {
				if(estadoprecioAux.getId()!=null && estadoprecioAux.getId().equals(idEstadoPrecioSeleccionado)) {
					estadoprecioTemp=estadoprecioAux;
					break;
				}
			}

			jComboBoxEstadoPrecio.setSelectedItem(estadoprecioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoPrecioGenerico(JComboBox jComboBoxEstadoPrecio,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoPrecio.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoPrecio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoPrecio.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoPrecio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Precio")) {
			jButtonPrecioActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoprecio=(EstadoPrecio) estadoprecioLogic.getEstadoPrecios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoprecio =(EstadoPrecio) estadoprecios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoPrecio estadoprecioRow=new EstadoPrecio();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoprecioRow=(EstadoPrecio) estadoprecioLogic.getEstadoPrecios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoprecioRow=(EstadoPrecio) estadoprecios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonPrecioActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoPrecio estadoprecio) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoPrecio==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoprecio = (EstadoPrecio)this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadoprecio = (EstadoPrecio)this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadoprecio!=null) {
						this.estadoprecio = estadoprecio;
					} else {
						this.estadoprecio = new EstadoPrecio();
					}
				}

				if(this.isTienePermisosPrecio && this.permiteMantenimiento(this.estadoprecio)) {
					PrecioBeanSwingJInternalFrame precioBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFramePopup=new PrecioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						precioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFramePopup;
					} else {
						precioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame;
					}

					List<EstadoPrecio> estadoprecios=new ArrayList<EstadoPrecio>();
					estadoprecios.add(this.estadoprecio);
					if(!esRelacionado) {
						//precioBeanSwingJInternalFrame.precioSessionBean.setConGuardarRelaciones(false);
						//precioBeanSwingJInternalFrame.precioSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					precioBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoPrecio.cargarPrecioBeanSwingJInternalFrame(estadoprecios,this.estadoprecio,precioBeanSwingJInternalFrame,/*conInicializar,*/precioBeanSwingJInternalFrame.precioSessionBean.getConGuardarRelaciones(),precioBeanSwingJInternalFrame.precioSessionBean.getEsGuardarRelacionado());
					precioBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						precioBeanSwingJInternalFrame.actualizarEstadoPanelsPrecio("no_relacionado");

						precioBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PrecioConstantesFunciones.ITAMANIOFILATABLA + (PrecioConstantesFunciones.ITAMANIOFILATABLA/2));

						precioBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoPrecio=(TitledBorder)this.jScrollPanelDatosEstadoPrecio.getBorder();
						TitledBorder titledBorderPrecio=(TitledBorder)precioBeanSwingJInternalFrame.jScrollPanelDatosPrecio.getBorder();

						titledBorderPrecio.setTitle(titledBorderEstadoPrecio.getTitle() + " -> Precio");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,precioBeanSwingJInternalFrame);
						}

						precioBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(precioBeanSwingJInternalFrame);

						precioBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadoprecioSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Precio",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoPrecio(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoPrecio.setVisible((this.isVisibilidadCeldaNuevoEstadoPrecio && this.isPermisoNuevoEstadoPrecio));			
			this.jButtonDuplicarEstadoPrecio.setVisible((this.isVisibilidadCeldaDuplicarEstadoPrecio && this.isPermisoDuplicarEstadoPrecio));			
			this.jButtonCopiarEstadoPrecio.setVisible((this.isVisibilidadCeldaCopiarEstadoPrecio && this.isPermisoCopiarEstadoPrecio));
			this.jButtonVerFormEstadoPrecio.setVisible((this.isVisibilidadCeldaVerFormEstadoPrecio && this.isPermisoVerFormEstadoPrecio));
			
			this.jButtonAbrirOrderByEstadoPrecio.setVisible((this.isVisibilidadCeldaOrdenEstadoPrecio && this.isPermisoOrdenEstadoPrecio));			
			
			this.jButtonNuevoRelacionesEstadoPrecio.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoPrecio && this.isPermisoNuevoEstadoPrecio));			
			this.jButtonNuevoGuardarCambiosEstadoPrecio.setVisible((this.isVisibilidadCeldaNuevoEstadoPrecio && this.isPermisoNuevoEstadoPrecio && this.isPermisoGuardarCambiosEstadoPrecio));
			
			if(this.jInternalFrameDetalleFormEstadoPrecio!=null) {
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonModificarEstadoPrecio.setVisible((this.isVisibilidadCeldaModificarEstadoPrecio && this.isPermisoActualizarEstadoPrecio));	
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonActualizarEstadoPrecio.setVisible((this.isVisibilidadCeldaActualizarEstadoPrecio && this.isPermisoActualizarEstadoPrecio));	
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonEliminarEstadoPrecio.setVisible((this.isVisibilidadCeldaEliminarEstadoPrecio && this.isPermisoEliminarEstadoPrecio));
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonCancelarEstadoPrecio.setVisible(this.isVisibilidadCeldaCancelarEstadoPrecio);							
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonGuardarCambiosEstadoPrecio.setVisible((this.isVisibilidadCeldaGuardarEstadoPrecio && this.isPermisoGuardarCambiosEstadoPrecio));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoPrecio.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoPrecio && this.isPermisoGuardarCambiosEstadoPrecio));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoPrecio.setVisible((this.isVisibilidadCeldaNuevoEstadoPrecio && this.isPermisoNuevoEstadoPrecio));						
			this.jButtonDuplicarToolBarEstadoPrecio.setVisible((this.isVisibilidadCeldaDuplicarEstadoPrecio && this.isPermisoDuplicarEstadoPrecio));						
			this.jButtonCopiarToolBarEstadoPrecio.setVisible((this.isVisibilidadCeldaCopiarEstadoPrecio && this.isPermisoCopiarEstadoPrecio));			
			this.jButtonVerFormToolBarEstadoPrecio.setVisible((this.isVisibilidadCeldaVerFormEstadoPrecio && this.isPermisoVerFormEstadoPrecio));			
			this.jButtonAbrirOrderByToolBarEstadoPrecio.setVisible((this.isVisibilidadCeldaOrdenEstadoPrecio && this.isPermisoOrdenEstadoPrecio));
			this.jButtonNuevoRelacionesToolBarEstadoPrecio.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoPrecio && this.isPermisoNuevoEstadoPrecio));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoPrecio.setVisible((this.isVisibilidadCeldaNuevoEstadoPrecio && this.isPermisoNuevoEstadoPrecio && this.isPermisoGuardarCambiosEstadoPrecio));			
			
			if(this.jInternalFrameDetalleFormEstadoPrecio!=null) {
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonModificarToolBarEstadoPrecio.setVisible((this.isVisibilidadCeldaModificarEstadoPrecio && this.isPermisoActualizarEstadoPrecio));	
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonActualizarToolBarEstadoPrecio.setVisible((this.isVisibilidadCeldaActualizarEstadoPrecio  && this.isPermisoActualizarEstadoPrecio));	
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonEliminarToolBarEstadoPrecio.setVisible((this.isVisibilidadCeldaEliminarEstadoPrecio && this.isPermisoEliminarEstadoPrecio));
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonCancelarToolBarEstadoPrecio.setVisible(this.isVisibilidadCeldaCancelarEstadoPrecio);				
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonGuardarCambiosToolBarEstadoPrecio.setVisible((this.isVisibilidadCeldaGuardarEstadoPrecio && this.isPermisoGuardarCambiosEstadoPrecio));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoPrecio.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoPrecio && this.isPermisoGuardarCambiosEstadoPrecio));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoPrecio.setVisible((this.isVisibilidadCeldaNuevoEstadoPrecio && this.isPermisoNuevoEstadoPrecio));			
			this.jMenuItemDuplicarEstadoPrecio.setVisible((this.isVisibilidadCeldaDuplicarEstadoPrecio && this.isPermisoDuplicarEstadoPrecio));			
			this.jMenuItemCopiarEstadoPrecio.setVisible((this.isVisibilidadCeldaCopiarEstadoPrecio && this.isPermisoCopiarEstadoPrecio));			
			this.jMenuItemVerFormEstadoPrecio.setVisible((this.isVisibilidadCeldaVerFormEstadoPrecio && this.isPermisoVerFormEstadoPrecio));			
			this.jMenuItemAbrirOrderByEstadoPrecio.setVisible((this.isVisibilidadCeldaOrdenEstadoPrecio && this.isPermisoOrdenEstadoPrecio));			
			//this.jMenuItemMostrarOcultarEstadoPrecio.setVisible((this.isVisibilidadCeldaOrdenEstadoPrecio && this.isPermisoOrdenEstadoPrecio));
			this.jMenuItemDetalleAbrirOrderByEstadoPrecio.setVisible((this.isVisibilidadCeldaOrdenEstadoPrecio && this.isPermisoOrdenEstadoPrecio));			
			//this.jMenuItemDetalleMostrarOcultarEstadoPrecio.setVisible((this.isVisibilidadCeldaOrdenEstadoPrecio && this.isPermisoOrdenEstadoPrecio));			
			this.jMenuItemNuevoRelacionesEstadoPrecio.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoPrecio && this.isPermisoNuevoEstadoPrecio));			
			this.jMenuItemNuevoGuardarCambiosEstadoPrecio.setVisible((this.isVisibilidadCeldaNuevoEstadoPrecio && this.isPermisoNuevoEstadoPrecio && this.isPermisoGuardarCambiosEstadoPrecio));									
			
			if(this.jInternalFrameDetalleFormEstadoPrecio!=null) {
			this.jInternalFrameDetalleFormEstadoPrecio.jMenuItemModificarEstadoPrecio.setVisible((this.isVisibilidadCeldaModificarEstadoPrecio && this.isPermisoActualizarEstadoPrecio));	
			this.jInternalFrameDetalleFormEstadoPrecio.jMenuItemActualizarEstadoPrecio.setVisible((this.isVisibilidadCeldaActualizarEstadoPrecio && this.isPermisoActualizarEstadoPrecio));	
			this.jInternalFrameDetalleFormEstadoPrecio.jMenuItemEliminarEstadoPrecio.setVisible((this.isVisibilidadCeldaEliminarEstadoPrecio && this.isPermisoEliminarEstadoPrecio));
			this.jInternalFrameDetalleFormEstadoPrecio.jMenuItemCancelarEstadoPrecio.setVisible(this.isVisibilidadCeldaCancelarEstadoPrecio);				
			}
			
			this.jMenuItemGuardarCambiosEstadoPrecio.setVisible((this.isVisibilidadCeldaGuardarEstadoPrecio && this.isPermisoGuardarCambiosEstadoPrecio));						
			this.jMenuItemGuardarCambiosTablaEstadoPrecio.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoPrecio && this.isPermisoGuardarCambiosEstadoPrecio));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoPrecio=this.jButtonNuevoEstadoPrecio.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoPrecio=this.jButtonDuplicarEstadoPrecio.isVisible();
			this.isVisibilidadCeldaCopiarEstadoPrecio=this.jButtonCopiarEstadoPrecio.isVisible();
			this.isVisibilidadCeldaVerFormEstadoPrecio=this.jButtonVerFormEstadoPrecio.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoPrecio=this.jButtonAbrirOrderByEstadoPrecio.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoPrecio=this.jButtonNuevoRelacionesEstadoPrecio.isVisible();
			this.isVisibilidadCeldaModificarEstadoPrecio=this.jButtonModificarEstadoPrecio.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoPrecio!=null) {
			this.isVisibilidadCeldaActualizarEstadoPrecio=this.jInternalFrameDetalleFormEstadoPrecio.jButtonActualizarEstadoPrecio.isVisible();
			this.isVisibilidadCeldaEliminarEstadoPrecio=this.jInternalFrameDetalleFormEstadoPrecio.jButtonEliminarEstadoPrecio.isVisible();
			this.isVisibilidadCeldaCancelarEstadoPrecio=this.jInternalFrameDetalleFormEstadoPrecio.jButtonCancelarEstadoPrecio.isVisible();
			this.isVisibilidadCeldaGuardarEstadoPrecio=this.jInternalFrameDetalleFormEstadoPrecio.jButtonGuardarCambiosEstadoPrecio.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoPrecio=this.jButtonGuardarCambiosTablaEstadoPrecio.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoPrecio=this.jButtonNuevoToolBarEstadoPrecio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoPrecio=this.jButtonNuevoRelacionesToolBarEstadoPrecio.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoPrecio!=null) {
			this.isVisibilidadCeldaModificarEstadoPrecio=this.jInternalFrameDetalleFormEstadoPrecio.jButtonModificarToolBarEstadoPrecio.isVisible();
			this.isVisibilidadCeldaActualizarEstadoPrecio=this.jInternalFrameDetalleFormEstadoPrecio.jButtonActualizarToolBarEstadoPrecio.isVisible();
			this.isVisibilidadCeldaEliminarEstadoPrecio=this.jInternalFrameDetalleFormEstadoPrecio.jButtonEliminarToolBarEstadoPrecio.isVisible();
			this.isVisibilidadCeldaCancelarEstadoPrecio=this.jInternalFrameDetalleFormEstadoPrecio.jButtonCancelarToolBarEstadoPrecio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoPrecio=this.jButtonGuardarCambiosToolBarEstadoPrecio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoPrecio=this.jButtonGuardarCambiosTablaToolBarEstadoPrecio.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoPrecio=this.jMenuItemNuevoEstadoPrecio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoPrecio=this.jMenuItemNuevoRelacionesEstadoPrecio.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoPrecio!=null) {
			this.isVisibilidadCeldaModificarEstadoPrecio=this.jInternalFrameDetalleFormEstadoPrecio.jMenuItemModificarEstadoPrecio.isVisible();
			this.isVisibilidadCeldaActualizarEstadoPrecio=this.jInternalFrameDetalleFormEstadoPrecio.jMenuItemActualizarEstadoPrecio.isVisible();
			this.isVisibilidadCeldaEliminarEstadoPrecio=this.jInternalFrameDetalleFormEstadoPrecio.jMenuItemEliminarEstadoPrecio.isVisible();
			this.isVisibilidadCeldaCancelarEstadoPrecio=this.jInternalFrameDetalleFormEstadoPrecio.jMenuItemCancelarEstadoPrecio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoPrecio=this.jMenuItemGuardarCambiosEstadoPrecio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoPrecio=this.jMenuItemGuardarCambiosTablaEstadoPrecio.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoPrecio(Boolean esInicializar) {
		if(EstadoPrecioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadoprecioSessionBean.getConGuardarRelaciones()) {
				//if(this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoPrecio();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoPrecio(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoPrecio() {
		this.jButtonNuevoEstadoPrecio.setVisible(this.isPermisoNuevoEstadoPrecio);			
		this.jButtonDuplicarEstadoPrecio.setVisible(this.isPermisoDuplicarEstadoPrecio);			
		this.jButtonCopiarEstadoPrecio.setVisible(this.isPermisoCopiarEstadoPrecio);			
		this.jButtonVerFormEstadoPrecio.setVisible(this.isPermisoVerFormEstadoPrecio);			
		
		this.jButtonAbrirOrderByEstadoPrecio.setVisible(this.isPermisoOrdenEstadoPrecio);					
		
		this.jButtonNuevoRelacionesEstadoPrecio.setVisible(this.isPermisoNuevoEstadoPrecio);			
		
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonModificarEstadoPrecio.setVisible(this.isPermisoActualizarEstadoPrecio);	
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonActualizarEstadoPrecio.setVisible(this.isPermisoActualizarEstadoPrecio);	
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonEliminarEstadoPrecio.setVisible(this.isPermisoEliminarEstadoPrecio);
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonCancelarEstadoPrecio.setVisible(this.isVisibilidadCeldaCancelarEstadoPrecio);						
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonGuardarCambiosEstadoPrecio.setVisible(this.isPermisoGuardarCambiosEstadoPrecio);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoPrecio.setVisible(this.isPermisoActualizarEstadoPrecio);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoPrecio() {
		this.jInternalFrameDetalleFormEstadoPrecio.jButtonModificarEstadoPrecio.setVisible(this.isPermisoActualizarEstadoPrecio);	
		this.jInternalFrameDetalleFormEstadoPrecio.jButtonActualizarEstadoPrecio.setVisible(this.isPermisoActualizarEstadoPrecio);	
		this.jInternalFrameDetalleFormEstadoPrecio.jButtonEliminarEstadoPrecio.setVisible(this.isPermisoEliminarEstadoPrecio);
		this.jInternalFrameDetalleFormEstadoPrecio.jButtonCancelarEstadoPrecio.setVisible(this.isVisibilidadCeldaCancelarEstadoPrecio);							
		this.jInternalFrameDetalleFormEstadoPrecio.jButtonGuardarCambiosEstadoPrecio.setVisible((this.isVisibilidadCeldaGuardarEstadoPrecio && this.isPermisoGuardarCambiosEstadoPrecio));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoPrecio() {
		if(EstadoPrecioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoPrecio();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoPrecio() {
	}
	
	public void jTableDatosEstadoPrecioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoPrecio(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoPrecio(this.getestadoprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPrecio(this.estadoprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoprecio =(EstadoPrecio) this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoprecio =(EstadoPrecio) this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoprecio==null) {
						this.estadoprecio = new EstadoPrecio();
					}

					this.setVariablesFormularioToObjetoActualEstadoPrecio(this.estadoprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPrecio(this.estadoprecio);
				}

				if(this.estadoprecio.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadoprecio.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoPrecio(this.getestadoprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPrecio(this.estadoprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoprecio =(EstadoPrecio) this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoprecio =(EstadoPrecio) this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoprecio==null) {
						this.estadoprecio = new EstadoPrecio();
					}

					this.setVariablesFormularioToObjetoActualEstadoPrecio(this.estadoprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPrecio(this.estadoprecio);
				}

				if(this.estadoprecio.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadoprecio.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoPrecio(this.getestadoprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPrecio(this.estadoprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoprecio =(EstadoPrecio) this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoprecio =(EstadoPrecio) this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoprecio==null) {
						this.estadoprecio = new EstadoPrecio();
					}

					this.setVariablesFormularioToObjetoActualEstadoPrecio(this.estadoprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPrecio(this.estadoprecio);
				}

				if(this.estadoprecio.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadoprecio.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoPrecio() {
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) {
			this.jInternalFrameDetalleFormEstadoPrecio.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoPrecio.dispose();
			this.jInternalFrameDetalleFormEstadoPrecio=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoPrecio!=null) {
			this.jInternalFrameReporteDinamicoEstadoPrecio.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoPrecio.dispose();
			this.jInternalFrameReporteDinamicoEstadoPrecio=null;
		}
		
		if(this.jInternalFrameImportacionEstadoPrecio!=null) {
			this.jInternalFrameImportacionEstadoPrecio.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoPrecio.dispose();
			this.jInternalFrameImportacionEstadoPrecio=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoPrecio();
			
			EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoPrecio")) {
				jButtonNuevoEstadoPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoPrecio")) {
				jButtonDuplicarEstadoPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoPrecio")) {
				jButtonCopiarEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoPrecio")) {
				jButtonVerFormEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoPrecio")) {
				jButtonNuevoEstadoPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoPrecio")) {
				jButtonDuplicarEstadoPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoPrecio")) {
				jButtonNuevoEstadoPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoPrecio")) {
				jButtonDuplicarEstadoPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoPrecio")) {
				jButtonNuevoEstadoPrecioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoPrecio")) {
				jButtonNuevoEstadoPrecioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoPrecio")) {
				jButtonNuevoEstadoPrecioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoPrecio")) {
				jButtonModificarEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoPrecio")) {
				jButtonModificarEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoPrecio")) {
				jButtonModificarEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoPrecio")) {
				jButtonActualizarEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoPrecio")) {
				jButtonActualizarEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoPrecio")) {
				jButtonActualizarEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoPrecio")) {
				jButtonEliminarEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoPrecio")) {
				jButtonEliminarEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoPrecio")) {
				jButtonEliminarEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoPrecio")) {
				jButtonCancelarEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoPrecio")) {
				jButtonCancelarEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoPrecio")) {
				jButtonCancelarEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoPrecio")) {
				jButtonCerrarEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoPrecio")) {
				jButtonCerrarEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoPrecio")) {
				jButtonCerrarEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoPrecio")) {
				jButtonMostrarOcultarEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoPrecio")) {
				jButtonCancelarEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoPrecio")) {
				jButtonGuardarCambiosEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoPrecio")) {
				jButtonGuardarCambiosEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoPrecio")) {
				jButtonCopiarEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoPrecio")) {
				jButtonVerFormEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoPrecio")) {
				jButtonGuardarCambiosEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoPrecio")) {
				jButtonCopiarEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoPrecio")) {
				jButtonVerFormEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoPrecio")) {
				jButtonGuardarCambiosEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoPrecio")) {
				jButtonGuardarCambiosEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoPrecio")) {
				jButtonGuardarCambiosEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoPrecio")) {
				jButtonRecargarInformacionEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoPrecio")) {
				jButtonRecargarInformacionEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoPrecio")) {
				jButtonRecargarInformacionEstadoPrecioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoPrecio")) {
				jButtonAnterioresEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoPrecio")) {
				jButtonAnterioresEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoPrecio")) {
				jButtonAnterioresEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoPrecio")) {
				jButtonSiguientesEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoPrecio")) {
				jButtonSiguientesEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoPrecio")) {
				jButtonSiguientesEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoPrecio") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoPrecio")) {
				jButtonAbrirOrderByEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoPrecio") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoPrecio")) {
				jButtonMostrarOcultarEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoPrecio")) {
				jButtonNuevoGuardarCambiosEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoPrecio")) {
				jButtonNuevoGuardarCambiosEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoPrecio")) {
				jButtonNuevoGuardarCambiosEstadoPrecioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoPrecio")) {
				jButtonCerrarReporteDinamicoEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoPrecio")) {
				jButtonGenerarReporteDinamicoEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoPrecio")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoPrecio")) {
				jButtonCerrarImportacionEstadoPrecioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoPrecio")) {
				
				jButtonGenerarImportacionEstadoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoPrecio")) {
				
				jButtonAbrirImportacionEstadoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoPrecio")) {
				jComboBoxTiposAccionesEstadoPrecioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoPrecio")) {
				jComboBoxTiposRelacionesEstadoPrecioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoPrecio")) {
				jComboBoxTiposAccionesEstadoPrecioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoPrecio")) {
				
				jComboBoxTiposSeleccionarEstadoPrecioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoPrecio")) {
				jTextFieldValorCampoGeneralEstadoPrecioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoPrecio")) {
				jButtonAbrirOrderByEstadoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoPrecio")) {
				jButtonAbrirOrderByEstadoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoPrecio")) {
				jButtonCerrarOrderByEstadoPrecioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoPrecioBusqueda")) {
				this.jButtonidEstadoPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoPrecioBusqueda")) {
				this.jButtoncodigoEstadoPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoPrecioBusqueda")) {
				this.jButtonnombreEstadoPrecioBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoPrecio();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPrecioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoprecio);
				
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
				
				


				
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoPrecio estadoprecioLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadoprecioLocal=this.estadoprecio;
			} else {
				estadoprecioLocal=this.estadoprecioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoprecio);
				
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
							
				
				


				
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecioAnterior =(EstadoPrecio) this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoprecioAnterior =(EstadoPrecio) this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
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
			
			EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
			
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
			
			


			
			EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPrecioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoprecio);
				
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
								
						
				


				
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPrecio.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoprecio);
				
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
								
				
				


				
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecioAnterior =(EstadoPrecio) this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoprecioAnterior =(EstadoPrecio) this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoprecio);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecioAnterior =(EstadoPrecio) this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoprecioAnterior =(EstadoPrecio) this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPrecioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoprecio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoprecio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoprecio);
				
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
							
				
				


				
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPrecio.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPrecioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoPrecio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoprecioAnterior =(EstadoPrecio) this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoprecioAnterior =(EstadoPrecio) this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
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
			
			EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
			
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
			
			


			
			EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPrecioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoprecio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoprecio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoprecio);
				
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
								
				
				


				
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecioAnterior =(EstadoPrecio) this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoprecioAnterior =(EstadoPrecio) this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPrecioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoprecio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoprecio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPrecioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoprecio);
				
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoPrecio")) {
					jCheckBoxSeleccionarTodosEstadoPrecioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoPrecio")) {
					jCheckBoxSeleccionadosEstadoPrecioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoPrecio")) {
					
				}
				
				


				
				
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoprecio);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadoprecio);
				
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
												
				
				


				
				
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPrecioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoPrecio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoprecioAnterior =(EstadoPrecio) this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoprecioAnterior =(EstadoPrecio) this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPrecioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoprecio);
				
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
				
				
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
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
			
			EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
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
			
			


			
			EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPrecioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoprecio);
				
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPrecio.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPrecio.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoprecio);
				
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
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
				
				


				
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPrecio.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoprecioAnterior =(EstadoPrecio) this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoprecioAnterior =(EstadoPrecio) this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoPrecio")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoPrecioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoPrecio.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadoprecio =(EstadoPrecio) this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadoprecio =(EstadoPrecio) this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadoprecio);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoPrecio")) {
				
				}
				
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoPrecio")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoPrecio.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoPrecio")) {
			
			}
			
			EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoPrecio();
			
			EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoPrecio")) {
				jButtonNuevoEstadoPrecioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoPrecio")) {
				jButtonDuplicarEstadoPrecioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoPrecio")) {
				jButtonCopiarEstadoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoPrecio")) {
				jButtonVerFormEstadoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoPrecio")) {
				jButtonNuevoEstadoPrecioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoPrecio")) {
				jButtonModificarEstadoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoPrecio")) {
				jButtonActualizarEstadoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoPrecio")) {
				jButtonEliminarEstadoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoPrecio")) {
				jButtonGuardarCambiosEstadoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoPrecio")) {
				jButtonCancelarEstadoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoPrecio")) {
				jButtonCerrarEstadoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoPrecio")) {
				jButtonGuardarCambiosEstadoPrecioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoPrecio")) {
				jButtonNuevoGuardarCambiosEstadoPrecioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoPrecio")) {
				jButtonAbrirOrderByEstadoPrecioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoPrecio")) {
				jButtonRecargarInformacionEstadoPrecioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoPrecio")) {
				jButtonAnterioresEstadoPrecioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoPrecio")) {
				jButtonSiguientesEstadoPrecioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoPrecioBusqueda")) {
				this.jButtonidEstadoPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoPrecioBusqueda")) {
				this.jButtoncodigoEstadoPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoPrecioBusqueda")) {
				this.jButtonnombreEstadoPrecioBusquedaActionPerformed(evt);
			}
			
			EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoPrecio();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoPrecio")) {
				closingInternalFrameEstadoPrecio();
				
			} else if(sTipo.equals("jButtonCancelarEstadoPrecio")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoPrecio = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoPrecioBeanSwingJInternalFrame jInternalFrameParent=(EstadoPrecioBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoPrecio.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoPrecioActionPerformed(null);
			}
			
			EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoprecio,new Object(),this.estadoprecioParameterGeneral,this.estadoprecioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoPrecio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoPrecio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoPrecio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadoprecio)) {
			if(!esControlTabla) {
				if(EstadoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoPrecio(this.estadoprecio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPrecio(this.estadoprecio);			
				}
				
				if(this.estadoprecioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoPrecio(this.estadoprecio,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoprecioReturnGeneral=estadoprecioLogic.procesarEventosEstadoPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoprecioLogic.getEstadoPrecios(),this.estadoprecio,this.estadoprecioParameterGeneral,this.isEsNuevoEstadoPrecio,classes);//this.estadoprecioLogic.getEstadoPrecio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoPrecio(this.estadoprecioReturnGeneral,this.estadoprecioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadoprecioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoPrecio(classes,this.estadoprecioReturnGeneral,this.estadoprecioBean,false);
					}
						
					if(this.estadoprecioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoPrecio(this.estadoprecioReturnGeneral.getEstadoPrecio());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoPrecio(this.estadoprecioReturnGeneral.getEstadoPrecio());	
					}
						
					if(this.estadoprecioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoPrecio(this.estadoprecioReturnGeneral.getEstadoPrecio(),classes);//this.estadoprecioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoPrecio(this.estadoprecio,classes);//this.estadoprecioBean);									
				}
			
				if(EstadoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoPrecio(this.estadoprecio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPrecio(this.estadoprecio);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadoprecioAnterior!=null) {
						this.estadoprecio=this.estadoprecioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoprecioReturnGeneral=estadoprecioLogic.procesarEventosEstadoPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoprecioLogic.getEstadoPrecios(),this.estadoprecio,this.estadoprecioParameterGeneral,this.isEsNuevoEstadoPrecio,classes);//this.estadoprecioLogic.getEstadoPrecio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoprecioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoprecioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadoprecioReturnGeneral.getEstadoPrecio(),estadoprecioLogic.getEstadoPrecios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadoprecioReturnGeneral.getEstadoPrecio(),this.estadoprecios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoPrecio.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoPrecio.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoPrecio();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoPrecio() throws Exception {
		
		EstadoPrecioModel estadoprecioModel=(EstadoPrecioModel)this.jTableDatosEstadoPrecio.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoprecioModel.estadoprecios=this.estadoprecioLogic.getEstadoPrecios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadoprecioModel.estadoprecios=this.estadoprecios;
		}
		
		
		((EstadoPrecioModel) this.jTableDatosEstadoPrecio.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoPrecio() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadoprecioAnterior(),this.estadoprecioLogic.getEstadoPrecios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadoprecioAnterior(),this.estadoprecios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoPrecio();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoPrecio(EstadoPrecio estadoprecio,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Precio.class)) {
					this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precioLogic.setPrecios(estadoprecio.getPrecios());
					this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.inicializarActualizarBindingTablaPrecio(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
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
										
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoprecio,new Object(),generalEntityParameterGeneral,this.estadoprecioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadoprecioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoPrecioConstantesFunciones.getClassesRelationshipsOfEstadoPrecio(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoPrecioConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoPrecio(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoPrecio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoprecio,new Object(),generalEntityParameterGeneral,this.estadoprecioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoPrecio(EstadoPrecioBean estadoprecioBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Precio.class)) {
					this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precioLogic.setPrecios(estadoprecio.getPrecios());
					this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.inicializarActualizarBindingTablaPrecio(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoPrecio(ArrayList<Classe> classes,EstadoPrecioReturnGeneral estadoprecioReturnGeneral,EstadoPrecioBean estadoprecioBean,Boolean conDefault) throws Exception {
		
			this.estadoprecioBean.setPrecios(estadoprecioReturnGeneral.getEstadoPrecio().getPrecios());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoPrecio(EstadoPrecio estadoprecio,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Precio.class)) {
					estadoprecio.setPrecios(this.jInternalFrameDetalleFormEstadoPrecio.precioBeanSwingJInternalFrame.precioLogic.getPrecios());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadoprecio)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoPrecio = new EstadoPrecioDetalleFormJInternalFrame(jDesktopPane,this.estadoprecioSessionBean.getConGuardarRelaciones(),this.estadoprecioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoPrecio);
		this.jInternalFrameDetalleFormEstadoPrecio.setVisible(false);
		this.jInternalFrameDetalleFormEstadoPrecio.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoPrecio.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoPrecio.estadoprecioLogic=this.estadoprecioLogic;
		
		this.cargarCombosFrameForeignKeyEstadoPrecio("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoPrecio();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoPrecio();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoPrecio("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoPrecio();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoPrecio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoPrecio"));
		
		this.jInternalFrameDetalleFormEstadoPrecio.jButtonModificarEstadoPrecio.addActionListener(new ButtonActionListener(this,"ModificarEstadoPrecio"));

		
		this.jInternalFrameDetalleFormEstadoPrecio.jButtonModificarToolBarEstadoPrecio.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoPrecio"));
					
		this.jInternalFrameDetalleFormEstadoPrecio.jMenuItemModificarEstadoPrecio.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoPrecio"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoPrecio.jButtonActualizarEstadoPrecio.addActionListener (new ButtonActionListener(this,"ActualizarEstadoPrecio"));
		
		
		this.jInternalFrameDetalleFormEstadoPrecio.jButtonActualizarToolBarEstadoPrecio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoPrecio"));
						
		this.jInternalFrameDetalleFormEstadoPrecio.jMenuItemActualizarEstadoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoPrecio"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoPrecio.jButtonEliminarEstadoPrecio.addActionListener (new ButtonActionListener(this,"EliminarEstadoPrecio"));
		
		
		this.jInternalFrameDetalleFormEstadoPrecio.jButtonEliminarToolBarEstadoPrecio.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoPrecio"));
								
		this.jInternalFrameDetalleFormEstadoPrecio.jMenuItemEliminarEstadoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoPrecio"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoPrecio.jButtonCancelarEstadoPrecio.addActionListener (new ButtonActionListener(this,"CancelarEstadoPrecio"));
		
		
		this.jInternalFrameDetalleFormEstadoPrecio.jButtonCancelarToolBarEstadoPrecio.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoPrecio"));
					
		this.jInternalFrameDetalleFormEstadoPrecio.jMenuItemCancelarEstadoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoPrecio"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoPrecio.jMenuItemDetalleCerrarEstadoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoPrecio"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoPrecio.jButtonGuardarCambiosToolBarEstadoPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoPrecio"));
		
		
		
		this.jInternalFrameDetalleFormEstadoPrecio.jButtonGuardarCambiosToolBarEstadoPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoPrecio"));
		
		
		
		this.jInternalFrameDetalleFormEstadoPrecio.jComboBoxTiposAccionesFormularioEstadoPrecio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoPrecio"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPrecio.jButtonidEstadoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPrecio.jButtoncodigoEstadoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPrecio.jButtonnombreEstadoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoPrecioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoPrecio.jTabbedPaneRelacionesEstadoPrecio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoPrecio"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoPrecio"));
		
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPrecio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoPrecio"));
		}
		
		this.jTableDatosEstadoPrecio.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoPrecio"));
		
		this.jTableDatosEstadoPrecio.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoPrecio"));
		
		this.jButtonNuevoEstadoPrecio.addActionListener(new ButtonActionListener(this,"NuevoEstadoPrecio"));
		
		this.jButtonDuplicarEstadoPrecio.addActionListener(new ButtonActionListener(this,"DuplicarEstadoPrecio"));
		
		this.jButtonCopiarEstadoPrecio.addActionListener(new ButtonActionListener(this,"CopiarEstadoPrecio"));
		
		this.jButtonVerFormEstadoPrecio.addActionListener(new ButtonActionListener(this,"VerFormEstadoPrecio"));
		
		
		this.jButtonNuevoToolBarEstadoPrecio.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoPrecio"));
			
		this.jButtonDuplicarToolBarEstadoPrecio.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoPrecio"));
			
		this.jMenuItemNuevoEstadoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoPrecio"));
			
		this.jMenuItemDuplicarEstadoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoPrecio"));		
		
		
		this.jButtonNuevoRelacionesEstadoPrecio.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoPrecio"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoPrecio.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoPrecio"));
			
		this.jMenuItemNuevoRelacionesEstadoPrecio.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoPrecio"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonModificarEstadoPrecio.addActionListener(new ButtonActionListener(this,"ModificarEstadoPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonModificarToolBarEstadoPrecio.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoPrecio"));
			
			this.jInternalFrameDetalleFormEstadoPrecio.jMenuItemModificarEstadoPrecio.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoPrecio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonActualizarEstadoPrecio.addActionListener (new ButtonActionListener(this,"ActualizarEstadoPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonActualizarToolBarEstadoPrecio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoPrecio"));
				
			this.jInternalFrameDetalleFormEstadoPrecio.jMenuItemActualizarEstadoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoPrecio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonEliminarEstadoPrecio.addActionListener (new ButtonActionListener(this,"EliminarEstadoPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonEliminarToolBarEstadoPrecio.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoPrecio"));
						
			this.jInternalFrameDetalleFormEstadoPrecio.jMenuItemEliminarEstadoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoPrecio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonCancelarEstadoPrecio.addActionListener (new ButtonActionListener(this,"CancelarEstadoPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonCancelarToolBarEstadoPrecio.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoPrecio"));
			
			this.jInternalFrameDetalleFormEstadoPrecio.jMenuItemCancelarEstadoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoPrecio"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoPrecio.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoPrecio"));		
		
		
		this.jButtonCerrarEstadoPrecio.addActionListener (new ButtonActionListener(this,"CerrarEstadoPrecio"));
		
		
		this.jButtonCerrarToolBarEstadoPrecio.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoPrecio"));
			
		this.jMenuItemCerrarEstadoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoPrecio"));
			
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPrecio.jMenuItemDetalleCerrarEstadoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoPrecio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonGuardarCambiosEstadoPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPrecio.jButtonGuardarCambiosToolBarEstadoPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoPrecio"));
		}
		
		this.jButtonCopiarToolBarEstadoPrecio.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoPrecio"));
			
		this.jButtonVerFormToolBarEstadoPrecio.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoPrecio"));
		
		this.jMenuItemGuardarCambiosEstadoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoPrecio"));
			
		this.jMenuItemCopiarEstadoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoPrecio"));		
		
		this.jMenuItemVerFormEstadoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoPrecio"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoPrecio"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoPrecio"));
			
		this.jMenuItemGuardarCambiosTablaEstadoPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoPrecio"));		
		
		
		
		this.jButtonRecargarInformacionEstadoPrecio.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoPrecio"));
					
		this.jButtonRecargarInformacionToolBarEstadoPrecio.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoPrecio"));
		
		this.jMenuItemRecargarInformacionEstadoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoPrecio"));		
		
		
		
		this.jButtonAnterioresEstadoPrecio.addActionListener (new ButtonActionListener(this,"AnterioresEstadoPrecio"));
		
		
		this.jButtonAnterioresToolBarEstadoPrecio.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoPrecio"));
		
		this.jMenuItemAnterioresEstadoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoPrecio"));		
		
		
		this.jButtonSiguientesEstadoPrecio.addActionListener (new ButtonActionListener(this,"SiguientesEstadoPrecio"));
		
		
		this.jButtonSiguientesToolBarEstadoPrecio.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoPrecio"));
			
		this.jMenuItemSiguientesEstadoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoPrecio"));
			
		this.jMenuItemAbrirOrderByEstadoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoPrecio"));
			
		this.jMenuItemMostrarOcultarEstadoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoPrecio"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoPrecio"));
			
		this.jMenuItemDetalleMostarOcultarEstadoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoPrecio"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoPrecio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoPrecio"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoPrecio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoPrecio"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoPrecio"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoPrecio.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoPrecio"));

		this.jCheckBoxSeleccionadosEstadoPrecio.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoPrecio"));
		
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPrecio.jComboBoxTiposAccionesFormularioEstadoPrecio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoPrecio"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoPrecio.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoPrecio"));
			
		this.jComboBoxTiposAccionesEstadoPrecio.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoPrecio"));
					
		this.jComboBoxTiposSeleccionarEstadoPrecio.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoPrecio"));
			
		this.jTextFieldValorCampoGeneralEstadoPrecio.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoPrecio"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPrecio.jButtonidEstadoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPrecio.jButtoncodigoEstadoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPrecio.jButtonnombreEstadoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoPrecioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoPrecio!=null) {
				this.jInternalFrameReporteDinamicoEstadoPrecio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoPrecio"));
				this.jInternalFrameReporteDinamicoEstadoPrecio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoPrecio"));
				this.jInternalFrameReporteDinamicoEstadoPrecio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoPrecio"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoPrecio.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoPrecio"));				
			//this.jButtonGenerarReporteDinamicoEstadoPrecio.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoPrecio"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoPrecio.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoPrecio"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoPrecio!=null) {
				this.jInternalFrameImportacionEstadoPrecio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoPrecio"));
				this.jInternalFrameImportacionEstadoPrecio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoPrecio"));
				this.jInternalFrameImportacionEstadoPrecio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoPrecio"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoPrecio.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoPrecio"));
			
			this.jButtonAbrirOrderByToolBarEstadoPrecio.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoPrecio"));			
			
			if(this.jInternalFrameOrderByEstadoPrecio!=null) {
				this.jInternalFrameOrderByEstadoPrecio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoPrecio"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoPrecio!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPrecio.jTabbedPaneRelacionesEstadoPrecio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoPrecio"));
		
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
            		closingInternalFrameEstadoPrecio();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoPrecio.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoPrecio = (JInternalFrameBase)event.getSource();
	            	
	            EstadoPrecioBeanSwingJInternalFrame jInternalFrameParent=(EstadoPrecioBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoPrecio.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoPrecioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoPrecio.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoPrecioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoPrecio.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoPrecio.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPrecioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPrecioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPrecioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoPrecio";
		inputMap = this.jButtonNuevoEstadoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoPrecioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPrecioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPrecioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPrecioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoPrecio";
		inputMap = this.jButtonNuevoRelacionesEstadoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoPrecioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoPrecio";
		inputMap = this.jButtonModificarEstadoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoPrecio";
		inputMap = this.jButtonActualizarEstadoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoPrecio";
		inputMap = this.jButtonEliminarEstadoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoPrecio";
		inputMap = this.jButtonCancelarEstadoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoPrecio";
		inputMap = this.jButtonCerrarEstadoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoPrecio.jButtonGuardarCambiosEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoPrecio";
		inputMap = this.jInternalFrameDetalleFormEstadoPrecio.jButtonGuardarCambiosEstadoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoPrecio.jButtonGuardarCambiosEstadoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoPrecio.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoPrecioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoPrecio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoPrecioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoPrecio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoPrecioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoPrecio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoPrecioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPrecio.jButtonidEstadoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPrecio.jButtoncodigoEstadoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPrecio.jButtonnombreEstadoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoPrecioBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoPrecioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoPrecio.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoPrecio(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoPrecio estadoprecioAux:this.estadoprecioLogic.getEstadoPrecios()) {
					estadoprecioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoPrecio estadoprecioAux:estadoprecios) {
					estadoprecioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoPrecioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoPrecio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoPrecio estadoprecioAux:this.estadoprecioLogic.getEstadoPrecios()) {
						estadoprecioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoPrecio estadoprecioAux:estadoprecios) {
						estadoprecioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoPrecio estadoprecioAux:this.estadoprecioLogic.getEstadoPrecios()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoPrecio estadoprecioAux:estadoprecios) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoPrecio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoPrecio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoPrecio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoPrecio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoPrecioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoPrecio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoPrecio.getSelectedRows();
			
			EstadoPrecio estadoprecioLocal=new EstadoPrecio();
			
			//this.seleccionarTodosEstadoPrecio(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoprecioLocal =(EstadoPrecio) this.estadoprecioLogic.getEstadoPrecios().toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadoprecioLocal =(EstadoPrecio) this.estadoprecios.toArray()[this.jTableDatosEstadoPrecio.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadoprecioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoPrecio estadoprecioAux:this.estadoprecioLogic.getEstadoPrecios()) {
						estadoprecioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoPrecio estadoprecioAux:estadoprecios) {
						estadoprecioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoPrecio(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoPrecio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoPrecio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoPrecio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoPrecioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoPrecioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoPrecioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoPrecio(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoPrecio.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoPrecio estadoprecioAux:this.estadoprecioLogic.getEstadoPrecios()) {
				
						if(sTipoSeleccionar.equals(EstadoPrecioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoprecioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoPrecioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoprecioAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoPrecio estadoprecioAux:estadoprecios) {
					
						if(sTipoSeleccionar.equals(EstadoPrecioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoprecioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoPrecioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoprecioAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoPrecio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoPrecioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoPrecio(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoPrecio=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoPrecio.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoPrecio.jComboBoxTiposAccionesFormularioEstadoPrecio.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoPrecio) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoPrecio(conSplash);
				
					this.generarReporteEstadoPreciosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoPrecio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoPrecio.jComboBoxTiposAccionesFormularioEstadoPrecio.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoPreciosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoPrecio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoPreciosSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoPrecio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoPreciosSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoPrecio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoPrecio();
				
				this.exportarEstadoPreciosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoPrecio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoPrecio.jComboBoxTiposAccionesFormularioEstadoPrecio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoPrecios();
				//this.importarEstadoPrecios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoPrecio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoPrecio.jComboBoxTiposAccionesFormularioEstadoPrecio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoPrecio();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoPreciosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoPrecio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Precio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoPrecio();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoPrecio)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoPrecio(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Precio",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoPrecio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoPrecio.jComboBoxTiposAccionesFormularioEstadoPrecio.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoPrecioBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoPrecio) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoPrecio(conSplash);
					
						//this.actualizarParametrosGeneralEstadoPrecio();
						
						this.generarReporteProcesoAccionEstadoPreciosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoPrecio.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoPrecio.jComboBoxTiposAccionesFormularioEstadoPrecio.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoPrecioBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado PrecioES SELECCIONADOS?", "MANTENIMIENTO DE Estado Precio", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoPrecio();
				
						this.actualizarParametrosGeneralEstadoPrecio();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadoprecioReturnGeneral=estadoprecioLogic.procesarAccionEstadoPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadoprecioLogic.getEstadoPrecios(),this.estadoprecioParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoPrecioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoPrecio.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoPrecio.jComboBoxTiposAccionesFormularioEstadoPrecio.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoPrecio();
					
					EstadoPrecioBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoPrecioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoPrecio.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoPrecio.jComboBoxTiposAccionesFormularioEstadoPrecio.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoPrecio(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoPrecioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoPrecio();
			
			if(this.jInternalFrameDetalleFormEstadoPrecio==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoPrecio> estadopreciosSeleccionados=new ArrayList<EstadoPrecio>();		
			EstadoPrecio estadoprecio=new EstadoPrecio();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoPrecio(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoPrecio.getSelectedItem();
			
			
			
			
			estadopreciosSeleccionados=this.getEstadoPreciosSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadopreciosSeleccionados.size()==1) {
				for(EstadoPrecio estadoprecioAux:estadopreciosSeleccionados) {
					estadoprecio=estadoprecioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Precio")) {
					jButtonPrecioActionPerformed(null,rowIndex,true,false,estadoprecio);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoPrecio();
			
      		//this.finishProcessEstadoPrecio(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoPrecioReturnGeneral() throws Exception {
		if(this.estadoprecioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadoprecioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadoprecioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadoprecioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadoprecioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadoprecioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoPrecio(false);
		}
		
		if(this.estadoprecioReturnGeneral.getConRetornoLista() || this.estadoprecioReturnGeneral.getConRetornoObjeto()) {
			if(this.estadoprecioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoprecioLogic.setEstadoPrecios(this.estadoprecioReturnGeneral.getEstadoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadoprecioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoprecioLogic.setEstadoPrecio(this.estadoprecioReturnGeneral.getEstadoPrecio());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoPrecio(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoPrecio() throws Exception {
		
		
	}
	
	public ArrayList<EstadoPrecio> getEstadoPreciosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoPrecio> estadopreciosSeleccionados=new ArrayList<EstadoPrecio>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoPrecio) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoPrecio estadoprecioAux:estadoprecioLogic.getEstadoPrecios()) {
					if(estadoprecioAux.getIsSelected()) {
						estadopreciosSeleccionados.add(estadoprecioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoPrecio estadoprecioAux:this.estadoprecios) {
					if(estadoprecioAux.getIsSelected()) {
						estadopreciosSeleccionados.add(estadoprecioAux);				
					}
				}
			}
			
			if(estadopreciosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadopreciosSeleccionados.addAll(this.estadoprecioLogic.getEstadoPrecios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadopreciosSeleccionados.addAll(this.estadoprecios);				
					}
				}
			}
		} else {
			estadopreciosSeleccionados.add(this.estadoprecio);
		}
		
		return estadopreciosSeleccionados;
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
	
	public void generarReporteEstadoPreciosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoPreciosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoPreciosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoPreciosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoPreciosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoPreciosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Precio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoPreciosSeleccionados() throws Exception {
		ArrayList<EstadoPrecio> estadopreciosSeleccionados=new ArrayList<EstadoPrecio>();		
		
		estadopreciosSeleccionados=this.getEstadoPreciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoPrecios("Todos",estadopreciosSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoPreciosSeleccionados() throws Exception {
		ArrayList<EstadoPrecio> estadopreciosSeleccionados=new ArrayList<EstadoPrecio>();		
		
		estadopreciosSeleccionados=this.getEstadoPreciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoPrecios("Todos",estadopreciosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoPreciosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoPrecio> estadopreciosSeleccionados=new ArrayList<EstadoPrecio>();
		
		estadopreciosSeleccionados=this.getEstadoPreciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoPrecios("Todos",estadopreciosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoPreciosSeleccionados() throws Exception {
		ArrayList<EstadoPrecio> estadopreciosSeleccionados=new ArrayList<EstadoPrecio>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoPrecio();
		
		
		estadopreciosSeleccionados=this.getEstadoPreciosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoPrecio();
		
		
		//this.generarReporteEstadoPrecios("Todos",estadopreciosSeleccionados ,estadoprecioImplementable,estadoprecioImplementableHome);
	}
	
	public void mostrarImportacionEstadoPrecios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoPrecio();
		
		this.abrirFrameImportacionEstadoPrecio();		
		
			
		//this.generarReporteEstadoPrecios("Todos",estadopreciosSeleccionados ,estadoprecioImplementable,estadoprecioImplementableHome);
	}
	
	public void importarEstadoPrecios() throws Exception {		
	
	}
	
	public void exportarEstadoPreciosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoPreciosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoPreciosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoPreciosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Precio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoPreciosSeleccionados() throws Exception {
		ArrayList<EstadoPrecio> estadopreciosSeleccionados=new ArrayList<EstadoPrecio>();		
		
		estadopreciosSeleccionados=this.getEstadoPreciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoprecio."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoPrecio(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoPrecio estadoprecioAux:estadopreciosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoPrecio(estadoprecioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadoprecioAux.setsDetalleGeneralEntityReporte(estadoprecioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Precio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoPrecio(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoPrecioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoPrecioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoPrecioConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoPrecioConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoPrecio(EstadoPrecio estadoprecio,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadoprecio.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoprecio.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoprecio.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoprecio.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoPreciosSeleccionados() throws Exception {
		ArrayList<EstadoPrecio> estadopreciosSeleccionados=new ArrayList<EstadoPrecio>();		
		
		estadopreciosSeleccionados=this.getEstadoPreciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoprecio.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoPrecios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoPrecio(row);				
				iRow++;
			}				
			
			for(EstadoPrecio estadoprecioAux:estadopreciosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoPrecio(estadoprecioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Precio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoPreciosSeleccionados() throws Exception {
		ArrayList<EstadoPrecio> estadopreciosSeleccionados=new ArrayList<EstadoPrecio>();		
		
		estadopreciosSeleccionados=this.getEstadoPreciosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoprecio.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadoprecios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadoprecio");
			//elementRoot.appendChild(element);
		
			for(EstadoPrecio estadoprecioAux:estadopreciosSeleccionados) {
				element = document.createElement("estadoprecio");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoPrecio(estadoprecioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Precio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoPrecio(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPrecioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPrecioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPrecioConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPrecioConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoPrecio(EstadoPrecio estadoprecio,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadoprecio.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoprecio.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoprecio.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoPrecio(EstadoPrecio estadoprecio,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoPrecioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadoprecio.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoPrecioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadoprecio.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoPrecioConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadoprecio.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoPrecioConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadoprecio.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoPreciosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoPrecio> estadopreciosSeleccionados=new ArrayList<EstadoPrecio>();
		
		estadopreciosSeleccionados=this.getEstadoPreciosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoPrecio(estadopreciosSeleccionados);
		
		this.generarReporteEstadoPrecios("Todos",estadopreciosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoPrecio(ArrayList<EstadoPrecio> estadopreciosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoPrecio estadoprecioAux:estadopreciosSeleccionados) {
				estadoprecioAux.setsDetalleGeneralEntityReporte(estadoprecioAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoPrecioConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadoprecioAux.setsDescripcionGeneralEntityReporte1(estadoprecioAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoPrecioConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadoprecioAux.setsDescripcionGeneralEntityReporte1(estadoprecioAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoPrecio(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoPrecio=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoPrecio=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoPrecio=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoPrecio=false;
			this.isVisibilidadCeldaActualizarEstadoPrecio=false;
			this.isVisibilidadCeldaEliminarEstadoPrecio=false;
			this.isVisibilidadCeldaCancelarEstadoPrecio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPrecio=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPrecio=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPrecio=false;
			this.isVisibilidadCeldaModificarEstadoPrecio=false;
			this.isVisibilidadCeldaActualizarEstadoPrecio=true;
			this.isVisibilidadCeldaEliminarEstadoPrecio=false;
			this.isVisibilidadCeldaCancelarEstadoPrecio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPrecio=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPrecio=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPrecio=false;
			this.isVisibilidadCeldaModificarEstadoPrecio=false;
			this.isVisibilidadCeldaActualizarEstadoPrecio=true;
			this.isVisibilidadCeldaEliminarEstadoPrecio=true;
			this.isVisibilidadCeldaCancelarEstadoPrecio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPrecio=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPrecio=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPrecio=false;
			this.isVisibilidadCeldaModificarEstadoPrecio=false;
			this.isVisibilidadCeldaActualizarEstadoPrecio=true;
			this.isVisibilidadCeldaEliminarEstadoPrecio=false;
			this.isVisibilidadCeldaCancelarEstadoPrecio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPrecio=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPrecio=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoPrecio=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPrecio=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoPrecio=true;
			this.isVisibilidadCeldaModificarEstadoPrecio=false;
			this.isVisibilidadCeldaActualizarEstadoPrecio=false;
			this.isVisibilidadCeldaEliminarEstadoPrecio=false;
			this.isVisibilidadCeldaCancelarEstadoPrecio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPrecio=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPrecio=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPrecio=false;
			this.isVisibilidadCeldaActualizarEstadoPrecio=false;
			this.isVisibilidadCeldaEliminarEstadoPrecio=false;
			this.isVisibilidadCeldaCancelarEstadoPrecio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPrecio=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPrecio=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPrecio=false;
			this.isVisibilidadCeldaModificarEstadoPrecio=true;
			this.isVisibilidadCeldaActualizarEstadoPrecio=false;
			this.isVisibilidadCeldaEliminarEstadoPrecio=false;
			this.isVisibilidadCeldaCancelarEstadoPrecio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPrecio=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPrecio=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoPrecioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoPrecio=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPrecio=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoPrecio=true;
		} else {
			this.actualizarEstadoPanelsEstadoPrecio(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoPrecio=false;
			//this.isVisibilidadCeldaVerFormEstadoPrecio=false;
			this.isVisibilidadCeldaDuplicarEstadoPrecio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadoprecioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoPrecio=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPrecio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadoprecioSessionBean.getEsGuardarRelacionado()) {
			if(!estadoprecioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoPrecio=false;												
			}
			
			this.jButtonCerrarEstadoPrecio.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoPrecio=false;
		}
		
		if(!this.permiteMantenimiento(this.estadoprecio)) {
			this.isVisibilidadCeldaActualizarEstadoPrecio=false;
			this.isVisibilidadCeldaEliminarEstadoPrecio=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoPrecio() {
		this.isVisibilidadCeldaNuevoEstadoPrecio=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoPrecio=false;
	}
	
	public void actualizarEstadoPanelsEstadoPrecio(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoPrecio!=null) {
				this.jScrollPanelDatosEdicionEstadoPrecio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoPrecio!=null) {
				this.jScrollPanelDatosEstadoPrecio.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoPrecio!=null) {
				this.jPanelPaginacionEstadoPrecio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoPrecio!=null) {
				this.jPanelParametrosReportesEstadoPrecio.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoPrecio!=null) {
				this.jScrollPanelDatosEdicionEstadoPrecio.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoPrecio!=null) {
				this.jScrollPanelDatosEstadoPrecio.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoPrecio!=null) {
				this.jPanelPaginacionEstadoPrecio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoPrecio!=null) {
				this.jPanelParametrosReportesEstadoPrecio.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoPrecio!=null) {
				this.jScrollPanelDatosEdicionEstadoPrecio.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoPrecio!=null) {
				this.jScrollPanelDatosEstadoPrecio.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoPrecio!=null) {
				this.jPanelPaginacionEstadoPrecio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoPrecio!=null) {
				this.jPanelParametrosReportesEstadoPrecio.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoPrecio!=null) {
				this.jScrollPanelDatosEdicionEstadoPrecio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoPrecio!=null) {
				this.jScrollPanelDatosEstadoPrecio.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoPrecio!=null) {
				this.jPanelPaginacionEstadoPrecio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoPrecio!=null) {
				this.jPanelParametrosReportesEstadoPrecio.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoPrecio!=null) {
				this.jScrollPanelDatosEdicionEstadoPrecio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoPrecio!=null) {
				this.jScrollPanelDatosEstadoPrecio.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoPrecio!=null) {
				this.jPanelPaginacionEstadoPrecio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoPrecio!=null) {
				this.jPanelParametrosReportesEstadoPrecio.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoPrecio!=null) {
				this.jScrollPanelDatosEdicionEstadoPrecio.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoPrecio!=null) {
				this.jScrollPanelDatosEstadoPrecio.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoPrecio!=null) {
				this.jPanelPaginacionEstadoPrecio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoPrecio!=null) {
				this.jPanelParametrosReportesEstadoPrecio.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoPrecio!=null) {
				this.jScrollPanelDatosEdicionEstadoPrecio.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoPrecio!=null) {
				this.jScrollPanelDatosEstadoPrecio.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoPrecio!=null) {
				this.jPanelPaginacionEstadoPrecio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoPrecio!=null) {
				this.jPanelParametrosReportesEstadoPrecio.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadoprecioSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoPrecioParaPrecios() throws Exception {
		Boolean isPaginaPopupPrecio=false;

		try {

			if(this.estadoprecioSessionBean==null) {
				this.estadoprecioSessionBean=new EstadoPrecioSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoPrecio.precioSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoPrecio.precioSessionBean=new PrecioSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoPrecio.precioSessionBean.setsPathNavegacionActual(estadoprecioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PrecioConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoPrecio.precioSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPrecio=this.jInternalFrameDetalleFormEstadoPrecio.precioSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoPrecio.precioSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePrecio(true);
			this.jInternalFrameDetalleFormEstadoPrecio.precioSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePrecio(EstadoPrecioConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoPrecio.precioSessionBean.setisBusquedaDesdeForeignKeySesionEstadoPrecio(true);
			this.jInternalFrameDetalleFormEstadoPrecio.precioSessionBean.setlidEstadoPrecioActual(this.idEstadoPrecioActual);

			estadoprecioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoPrecio(true);
			estadoprecioSessionBean.setlIdEstadoPrecioActualForeignKey(this.idEstadoPrecioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoPrecioSessionBean estadoprecioSessionBean=new EstadoPrecioSessionBean();
		
		if(this.estadoprecioSessionBean==null) {
			this.estadoprecioSessionBean=new EstadoPrecioSessionBean();
		}
		
		this.estadoprecioSessionBean.setsUltimaBusquedaEstadoPrecio(this.getsAccionBusqueda());
		this.estadoprecioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadoprecioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoPrecioSessionBean estadoprecioSessionBean=new EstadoPrecioSessionBean();
		
		if(this.estadoprecioSessionBean==null) {
			this.estadoprecioSessionBean=new EstadoPrecioSessionBean();
		}
		
		if(this.estadoprecioSessionBean.getsUltimaBusquedaEstadoPrecio()!=null&&!this.estadoprecioSessionBean.getsUltimaBusquedaEstadoPrecio().equals("")) {
			this.setsAccionBusqueda(estadoprecioSessionBean.getsUltimaBusquedaEstadoPrecio());
			this.setiNumeroPaginacion(estadoprecioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadoprecioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadoprecioSessionBean.setsUltimaBusquedaEstadoPrecio("");
		this.estadoprecioSessionBean.setiNumeroPaginacion(EstadoPrecioConstantesFunciones.INUMEROPAGINACION);
		this.estadoprecioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoPrecio(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoPrecio() {
		this.updateBorderResaltarBusquedasFormularioEstadoPrecio();
		this.updateVisibilidadBusquedasFormularioEstadoPrecio();
		this.updateHabilitarBusquedasFormularioEstadoPrecio();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoPrecio() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoPrecio() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoPrecio() {
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
	
	public void updateControlesFormularioEstadoPrecio() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoPrecio==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoPrecio();
		this.updateVisibilidadResaltarControlesFormularioEstadoPrecio();
		this.updateHabilitarResaltarControlesFormularioEstadoPrecio();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoPrecio() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoPrecio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadoprecioConstantesFunciones.resaltaridEstadoPrecio!=null && this.jInternalFrameDetalleFormEstadoPrecio!=null) {this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldidEstadoPrecio.setBorder(this.estadoprecioConstantesFunciones.resaltaridEstadoPrecio);}
		if(this.estadoprecioConstantesFunciones.resaltarcodigoEstadoPrecio!=null && this.jInternalFrameDetalleFormEstadoPrecio!=null) {this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldcodigoEstadoPrecio.setBorder(this.estadoprecioConstantesFunciones.resaltarcodigoEstadoPrecio);}
		if(this.estadoprecioConstantesFunciones.resaltarnombreEstadoPrecio!=null && this.jInternalFrameDetalleFormEstadoPrecio!=null) {this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldnombreEstadoPrecio.setBorder(this.estadoprecioConstantesFunciones.resaltarnombreEstadoPrecio);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoPrecio() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoPrecio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) {
	
		//this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldidEstadoPrecio.setVisible(this.estadoprecioConstantesFunciones.mostraridEstadoPrecio);
		this.jInternalFrameDetalleFormEstadoPrecio.jPanelidEstadoPrecio.setVisible(this.estadoprecioConstantesFunciones.mostraridEstadoPrecio);
		//this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldcodigoEstadoPrecio.setVisible(this.estadoprecioConstantesFunciones.mostrarcodigoEstadoPrecio);
		this.jInternalFrameDetalleFormEstadoPrecio.jPanelcodigoEstadoPrecio.setVisible(this.estadoprecioConstantesFunciones.mostrarcodigoEstadoPrecio);
		//this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldnombreEstadoPrecio.setVisible(this.estadoprecioConstantesFunciones.mostrarnombreEstadoPrecio);
		this.jInternalFrameDetalleFormEstadoPrecio.jPanelnombreEstadoPrecio.setVisible(this.estadoprecioConstantesFunciones.mostrarnombreEstadoPrecio);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoPrecio() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoPrecio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoPrecio!=null) {
	
		this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldidEstadoPrecio.setEnabled(this.estadoprecioConstantesFunciones.activaridEstadoPrecio);
		this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldcodigoEstadoPrecio.setEnabled(this.estadoprecioConstantesFunciones.activarcodigoEstadoPrecio);
		this.jInternalFrameDetalleFormEstadoPrecio.jTextFieldnombreEstadoPrecio.setEnabled(this.estadoprecioConstantesFunciones.activarnombreEstadoPrecio);
		}
	}
	
		
}