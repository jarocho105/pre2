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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.EstadoRetencionConstantesFunciones;
import com.bydan.erp.facturacion.util.EstadoRetencionParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.EstadoRetencionParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.EstadoRetencionBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
public class EstadoRetencionBeanSwingJInternalFrame extends EstadoRetencionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoRetencionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoRetencion> estadoretencionValidator = new ClassValidator<EstadoRetencion>(EstadoRetencion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoRetencion estadoretencion;	
	public EstadoRetencion estadoretencionAux;
	public EstadoRetencion estadoretencionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoRetencion estadoretencionTotales;
	public Long idEstadoRetencionActual;
	public Long iIdNuevoEstadoRetencion=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosClienteRetencion=false;

	public Boolean getIsTienePermisosClienteRetencion() {
		return isTienePermisosClienteRetencion;
	}

	public void setIsTienePermisosClienteRetencion(Boolean isTienePermisosClienteRetencion) {
		this.isTienePermisosClienteRetencion= isTienePermisosClienteRetencion;
	}


	public Boolean isTienePermisosRetencion=false;

	public Boolean getIsTienePermisosRetencion() {
		return isTienePermisosRetencion;
	}

	public void setIsTienePermisosRetencion(Boolean isTienePermisosRetencion) {
		this.isTienePermisosRetencion= isTienePermisosRetencion;
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
	
	public Boolean isPermisoTodoEstadoRetencion;
	public Boolean isPermisoNuevoEstadoRetencion;
	public Boolean isPermisoActualizarEstadoRetencion;
	public Boolean isPermisoActualizarOriginalEstadoRetencion;
	public Boolean isPermisoEliminarEstadoRetencion;
	public Boolean isPermisoGuardarCambiosEstadoRetencion;
	public Boolean isPermisoConsultaEstadoRetencion;
	public Boolean isPermisoBusquedaEstadoRetencion;
	public Boolean isPermisoReporteEstadoRetencion;
	public Boolean isPermisoPaginacionMedioEstadoRetencion;
	public Boolean isPermisoPaginacionAltoEstadoRetencion;
	public Boolean isPermisoPaginacionTodoEstadoRetencion;
	public Boolean isPermisoCopiarEstadoRetencion;
	public Boolean isPermisoVerFormEstadoRetencion;
	public Boolean isPermisoDuplicarEstadoRetencion;
	public Boolean isPermisoOrdenEstadoRetencion;
	
	
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
	
	public EstadoRetencionParameterReturnGeneral estadoretencionReturnGeneral;
	public EstadoRetencionParameterReturnGeneral estadoretencionParameterGeneral;
	
	

	public ClienteRetencionLogic clienteretencionLogic=null;

	public ClienteRetencionLogic getClienteRetencionLogic() {
		return clienteretencionLogic;
	}

	public void setClienteRetencionLogic(ClienteRetencionLogic clienteretencionLogic) {
		this.clienteretencionLogic = clienteretencionLogic;
	}


	public RetencionLogic retencionLogic=null;

	public RetencionLogic getRetencionLogic() {
		return retencionLogic;
	}

	public void setRetencionLogic(RetencionLogic retencionLogic) {
		this.retencionLogic = retencionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoRetencion=false;
	public Boolean esParaAccionDesdeFormularioEstadoRetencion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoRetencionLogic estadoretencionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoRetencion estadoretencionBean;
	public EstadoRetencionConstantesFunciones estadoretencionConstantesFunciones;
	//public EstadoRetencionParameterReturnGeneral estadoretencionReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoRetencion> estadoretencions;	
	//public List<EstadoRetencion> estadoretencionsEliminados;
	//public List<EstadoRetencion> estadoretencionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoRetencion=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoRetencion=true;
	public Boolean isVisibilidadCeldaCopiarEstadoRetencion=true;
	public Boolean isVisibilidadCeldaVerFormEstadoRetencion=true;
	public Boolean isVisibilidadCeldaOrdenEstadoRetencion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoRetencion=false;
	public Boolean isVisibilidadCeldaModificarEstadoRetencion=false;
	public Boolean isVisibilidadCeldaActualizarEstadoRetencion=false;
	public Boolean isVisibilidadCeldaEliminarEstadoRetencion=false;
	public Boolean isVisibilidadCeldaCancelarEstadoRetencion=false;
	public Boolean isVisibilidadCeldaGuardarEstadoRetencion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoRetencion=false;	
	
	
	
	public Long getiIdNuevoEstadoRetencion() {
		return this.iIdNuevoEstadoRetencion;
	}

	public void setiIdNuevoEstadoRetencion(Long iIdNuevoEstadoRetencion) {
		this.iIdNuevoEstadoRetencion = iIdNuevoEstadoRetencion;
	}
	
	public Long getidEstadoRetencionActual() {
		return this.idEstadoRetencionActual;
	}

	public void setidEstadoRetencionActual(Long idEstadoRetencionActual) {
		this.idEstadoRetencionActual = idEstadoRetencionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoRetencion getestadoretencion() {
		return this.estadoretencion;
	}

	public void setestadoretencion(EstadoRetencion estadoretencion) {
		this.estadoretencion = estadoretencion;
	}
	
	public EstadoRetencion getestadoretencionAux() {
		return this.estadoretencionAux;
	}

	public void setestadoretencionAux(EstadoRetencion estadoretencionAux) {
		this.estadoretencionAux = estadoretencionAux;
	}				
	
	public EstadoRetencion getestadoretencionAnterior() {
		return this.estadoretencionAnterior;
	}

	public void setestadoretencionAnterior(EstadoRetencion estadoretencionAnterior) {
		this.estadoretencionAnterior = estadoretencionAnterior;
	}	
	
	public EstadoRetencion getestadoretencionTotales() {
		return this.estadoretencionTotales;
	}

	public void setestadoretencionTotales(EstadoRetencion estadoretencionTotales) {
		this.estadoretencionTotales = estadoretencionTotales;
	}	
	
	public EstadoRetencion getestadoretencionBean() {
		return this.estadoretencionBean;
	}

	public void setestadoretencionBean(EstadoRetencion estadoretencionBean) {
		this.estadoretencionBean = estadoretencionBean;
	}	
	
	public EstadoRetencionParameterReturnGeneral getestadoretencionReturnGeneral() {
		return this.estadoretencionReturnGeneral;
	}

	public void setestadoretencionReturnGeneral(EstadoRetencionParameterReturnGeneral estadoretencionReturnGeneral) {
		this.estadoretencionReturnGeneral = estadoretencionReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoRetencionLogic getEstadoRetencionLogic()	{		
		return estadoretencionLogic;
	}

	public void setEstadoRetencionLogic(EstadoRetencionLogic estadoretencionLogic) {
		this.estadoretencionLogic = estadoretencionLogic;
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
	
	public Boolean getIsEsNuevoEstadoRetencion() {
		return isEsNuevoEstadoRetencion;
	}

	public void setIsEsNuevoEstadoRetencion(Boolean isEsNuevoEstadoRetencion) {
		this.isEsNuevoEstadoRetencion = isEsNuevoEstadoRetencion;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoRetencion() {
		return esParaAccionDesdeFormularioEstadoRetencion;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoRetencion(Boolean esParaAccionDesdeFormularioEstadoRetencion) {
		this.esParaAccionDesdeFormularioEstadoRetencion = esParaAccionDesdeFormularioEstadoRetencion;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoRetencion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoRetencionConstantesFunciones.refrescarForeignKeysDescripcionesEstadoRetencion(this.estadoretencionLogic.getEstadoRetencions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoRetencionConstantesFunciones.refrescarForeignKeysDescripcionesEstadoRetencion(this.estadoretencions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadoretencionLogic.setEstadoRetencions(this.estadoretencions);
			estadoretencionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoRetencionParameterReturnGeneral getEstadoRetencionParameterGeneral() {
		return this.estadoretencionParameterGeneral;
	}
	
	public void setEstadoRetencionParameterGeneral(EstadoRetencionParameterReturnGeneral estadoretencionParameterGeneral) {
		this.estadoretencionParameterGeneral = estadoretencionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoRetencion() {
		return isPermisoTodoEstadoRetencion;
	}

	public void setIsPermisoTodoEstadoRetencion(Boolean isPermisoTodoEstadoRetencion) {
		this.isPermisoTodoEstadoRetencion = isPermisoTodoEstadoRetencion;
	}

	public Boolean getIsPermisoNuevoEstadoRetencion() {
		return isPermisoNuevoEstadoRetencion;
	}

	public void setIsPermisoNuevoEstadoRetencion(Boolean isPermisoNuevoEstadoRetencion) {
		this.isPermisoNuevoEstadoRetencion = isPermisoNuevoEstadoRetencion;
	}

	public Boolean getIsPermisoActualizarEstadoRetencion() {
		return isPermisoActualizarEstadoRetencion;
	}

	public void setIsPermisoActualizarEstadoRetencion(Boolean isPermisoActualizarEstadoRetencion) {
		this.isPermisoActualizarEstadoRetencion = isPermisoActualizarEstadoRetencion;
	}

	public Boolean getIsPermisoEliminarEstadoRetencion() {
		return isPermisoEliminarEstadoRetencion;
	}

	public void setIsPermisoEliminarEstadoRetencion(Boolean isPermisoEliminarEstadoRetencion) {
		this.isPermisoEliminarEstadoRetencion = isPermisoEliminarEstadoRetencion;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoRetencion() {
		return isPermisoGuardarCambiosEstadoRetencion;
	}

	public void setIsPermisoGuardarCambiosEstadoRetencion(Boolean isPermisoGuardarCambiosEstadoRetencion) {
		this.isPermisoGuardarCambiosEstadoRetencion = isPermisoGuardarCambiosEstadoRetencion;
	}
	
	public Boolean getIsPermisoConsultaEstadoRetencion() {
		return isPermisoConsultaEstadoRetencion;
	}

	public void setIsPermisoConsultaEstadoRetencion(Boolean isPermisoConsultaEstadoRetencion) {
		this.isPermisoConsultaEstadoRetencion = isPermisoConsultaEstadoRetencion;
	}

	public Boolean getIsPermisoBusquedaEstadoRetencion() {
		return isPermisoBusquedaEstadoRetencion;
	}

	public void setIsPermisoBusquedaEstadoRetencion(Boolean isPermisoBusquedaEstadoRetencion) {
		this.isPermisoBusquedaEstadoRetencion = isPermisoBusquedaEstadoRetencion;
	}

	public Boolean getIsPermisoReporteEstadoRetencion() {
		return isPermisoReporteEstadoRetencion;
	}

	public void setIsPermisoReporteEstadoRetencion(Boolean isPermisoReporteEstadoRetencion) {
		this.isPermisoReporteEstadoRetencion = isPermisoReporteEstadoRetencion;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoRetencion() {
		return isPermisoPaginacionMedioEstadoRetencion;
	}

	public void setIsPermisoPaginacionMedioEstadoRetencion(Boolean isPermisoPaginacionMedioEstadoRetencion) {
		this.isPermisoPaginacionMedioEstadoRetencion = isPermisoPaginacionMedioEstadoRetencion;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoRetencion() {
		return isPermisoPaginacionTodoEstadoRetencion;
	}

	public void setIsPermisoPaginacionTodoEstadoRetencion(Boolean isPermisoPaginacionTodoEstadoRetencion) {
		this.isPermisoPaginacionTodoEstadoRetencion = isPermisoPaginacionTodoEstadoRetencion;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoRetencion() {
		return isPermisoPaginacionAltoEstadoRetencion;
	}

	public void setIsPermisoPaginacionAltoEstadoRetencion(Boolean isPermisoPaginacionAltoEstadoRetencion) {
		this.isPermisoPaginacionAltoEstadoRetencion = isPermisoPaginacionAltoEstadoRetencion;
	}
	
	public Boolean getIsPermisoCopiarEstadoRetencion() {
		return isPermisoCopiarEstadoRetencion;
	}

	public void setIsPermisoCopiarEstadoRetencion(Boolean isPermisoCopiarEstadoRetencion) {
		this.isPermisoCopiarEstadoRetencion = isPermisoCopiarEstadoRetencion;
	}
	
	public Boolean getIsPermisoVerFormEstadoRetencion() {
		return isPermisoVerFormEstadoRetencion;
	}

	public void setIsPermisoVerFormEstadoRetencion(Boolean isPermisoVerFormEstadoRetencion) {
		this.isPermisoVerFormEstadoRetencion = isPermisoVerFormEstadoRetencion;
	}
	
	public Boolean getIsPermisoDuplicarEstadoRetencion() {
		return isPermisoDuplicarEstadoRetencion;
	}

	public void setIsPermisoDuplicarEstadoRetencion(Boolean isPermisoDuplicarEstadoRetencion) {
		this.isPermisoDuplicarEstadoRetencion = isPermisoDuplicarEstadoRetencion;
	}
	
	public Boolean getIsPermisoOrdenEstadoRetencion() {
		return isPermisoOrdenEstadoRetencion;
	}

	public void setIsPermisoOrdenEstadoRetencion(Boolean isPermisoOrdenEstadoRetencion) {
		this.isPermisoOrdenEstadoRetencion = isPermisoOrdenEstadoRetencion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoRetencion() {
		return isVisibilidadCeldaNuevoEstadoRetencion;
	}

	public void setIsVisibilidadCeldaNuevoEstadoRetencion(Boolean isVisibilidadCeldaNuevoEstadoRetencion) {
		this.isVisibilidadCeldaNuevoEstadoRetencion = isVisibilidadCeldaNuevoEstadoRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoRetencion() {
		return isVisibilidadCeldaDuplicarEstadoRetencion;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoRetencion(Boolean isVisibilidadCeldaDuplicarEstadoRetencion) {
		this.isVisibilidadCeldaDuplicarEstadoRetencion = isVisibilidadCeldaDuplicarEstadoRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoRetencion() {
		return isVisibilidadCeldaCopiarEstadoRetencion;
	}

	public void setIsVisibilidadCeldaCopiarEstadoRetencion(Boolean isVisibilidadCeldaCopiarEstadoRetencion) {
		this.isVisibilidadCeldaCopiarEstadoRetencion = isVisibilidadCeldaCopiarEstadoRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoRetencion() {
		return isVisibilidadCeldaVerFormEstadoRetencion;
	}

	public void setIsVisibilidadCeldaVerFormEstadoRetencion(Boolean isVisibilidadCeldaVerFormEstadoRetencion) {
		this.isVisibilidadCeldaVerFormEstadoRetencion = isVisibilidadCeldaVerFormEstadoRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoRetencion() {
		return isVisibilidadCeldaOrdenEstadoRetencion;
	}

	public void setIsVisibilidadCeldaOrdenEstadoRetencion(Boolean isVisibilidadCeldaOrdenEstadoRetencion) {
		this.isVisibilidadCeldaOrdenEstadoRetencion = isVisibilidadCeldaOrdenEstadoRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoRetencion() {
		return isVisibilidadCeldaNuevoRelacionesEstadoRetencion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoRetencion(Boolean isVisibilidadCeldaNuevoRelacionesEstadoRetencion) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoRetencion = isVisibilidadCeldaNuevoRelacionesEstadoRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoRetencion() {
		return isVisibilidadCeldaModificarEstadoRetencion;
	}

	public void setIsVisibilidadCeldaModificarEstadoRetencion(Boolean isVisibilidadCeldaModificarEstadoRetencion) {
		this.isVisibilidadCeldaModificarEstadoRetencion = isVisibilidadCeldaModificarEstadoRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoRetencion() {
		return isVisibilidadCeldaActualizarEstadoRetencion;
	}

	public void setIsVisibilidadCeldaActualizarEstadoRetencion(Boolean isVisibilidadCeldaActualizarEstadoRetencion) {
		this.isVisibilidadCeldaActualizarEstadoRetencion = isVisibilidadCeldaActualizarEstadoRetencion;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoRetencion() {
		return isVisibilidadCeldaEliminarEstadoRetencion;
	}

	public void setIsVisibilidadCeldaEliminarEstadoRetencion(Boolean isVisibilidadCeldaEliminarEstadoRetencion) {
		this.isVisibilidadCeldaEliminarEstadoRetencion = isVisibilidadCeldaEliminarEstadoRetencion;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoRetencion() {
		return isVisibilidadCeldaCancelarEstadoRetencion;
	}

	public void setIsVisibilidadCeldaCancelarEstadoRetencion(Boolean isVisibilidadCeldaCancelarEstadoRetencion) {
		this.isVisibilidadCeldaCancelarEstadoRetencion = isVisibilidadCeldaCancelarEstadoRetencion;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoRetencion() {
		return isVisibilidadCeldaGuardarEstadoRetencion;
	}

	public void setIsVisibilidadCeldaGuardarEstadoRetencion(Boolean isVisibilidadCeldaGuardarEstadoRetencion) {
		this.isVisibilidadCeldaGuardarEstadoRetencion = isVisibilidadCeldaGuardarEstadoRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoRetencion() {
		return isVisibilidadCeldaGuardarCambiosEstadoRetencion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoRetencion(Boolean isVisibilidadCeldaGuardarCambiosEstadoRetencion) {
		this.isVisibilidadCeldaGuardarCambiosEstadoRetencion = isVisibilidadCeldaGuardarCambiosEstadoRetencion;
	}
		
	public EstadoRetencionSessionBean getestadoretencionSessionBean() {
		return this.estadoretencionSessionBean;
	}
	
	public void setestadoretencionSessionBean(EstadoRetencionSessionBean estadoretencionSessionBean) {
		this.estadoretencionSessionBean=estadoretencionSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoRetencion(EstadoRetencion estadoretencion)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoRetencion estadoretencion,EstadoRetencion estadoretencionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoRetencion(estadoretencion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadoretencionAux.setId(estadoretencion.getId());
		estadoretencionAux.setVersionRow(estadoretencion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoRetencion();
		
			int intSelectedRow = this.jTableDatosEstadoRetencion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencion =(EstadoRetencion) this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadoretencion =(EstadoRetencion) this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoRetencion(this.estadoretencion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoRetencion(this.estadoretencion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadoretencionValidator.getInvalidValues(this.estadoretencion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadoretencionLogic.setDatosCliente(datosCliente);
			estadoretencionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadoretencionAux=new  EstadoRetencion();
				
				estadoretencionAux.setIsNew(true);
				estadoretencionAux.setIsChanged(true);
				
				estadoretencionAux.setEstadoRetencionOriginal(this.estadoretencion);
				
				estadoretencionAux.setId(this.estadoretencion.getId());	
				estadoretencionAux.setVersionRow(this.estadoretencion.getVersionRow());	
				estadoretencionAux.setcodigo(this.estadoretencion.getcodigo());	
				estadoretencionAux.setnombre(this.estadoretencion.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoretencionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoretencionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadoretencionAux,estadoretencionLogic.getEstadoRetencions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoretencionAux,estadoretencions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadoretencionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoretencionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoretencionLogic.saveEstadoRetencions();//WithConnection
						//estadoretencionLogic.getSetVersionRowEstadoRetencions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoretencion,estadoretencionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoretencionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadoretencionAux=new  EstadoRetencion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadoretencionSessionBean.getEsGuardarRelacionado() 
					|| (this.estadoretencionSessionBean.getEsGuardarRelacionado() && this.estadoretencion.getId()>=0)) {
						
					estadoretencionAux.setIsNew(false);
				}
				
				estadoretencionAux.setIsDeleted(false);
			
				estadoretencionAux.setId(this.estadoretencion.getId());	
				estadoretencionAux.setVersionRow(this.estadoretencion.getVersionRow());	
				estadoretencionAux.setcodigo(this.estadoretencion.getcodigo());	
				estadoretencionAux.setnombre(this.estadoretencion.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoretencionAux,estadoretencionLogic.getEstadoRetencions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoretencionAux,estadoretencions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadoretencionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoretencionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoretencionLogic.saveEstadoRetencions();//WithConnection
						//estadoretencionLogic.getSetVersionRowEstadoRetencions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoretencion,estadoretencionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoretencionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadoretencionAux=new  EstadoRetencion();
				
				estadoretencionAux.setIsNew(false);
				estadoretencionAux.setIsChanged(false);
				
				estadoretencionAux.setIsDeleted(true);
				
				estadoretencionAux.setId(this.estadoretencion.getId());	
				estadoretencionAux.setVersionRow(this.estadoretencion.getVersionRow());	
				estadoretencionAux.setcodigo(this.estadoretencion.getcodigo());	
				estadoretencionAux.setnombre(this.estadoretencion.getnombre());	
				
				if(this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadoretencionAux.getId()>=0) {	
						this.estadoretencionsEliminados.add(estadoretencionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadoretencionAux,estadoretencionLogic.getEstadoRetencions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoretencionAux,estadoretencions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadoretencionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoretencionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoretencionLogic.saveEstadoRetencions();//WithConnection
						//estadoretencionLogic.getSetVersionRowEstadoRetencions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoretencionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoretencionAux.setClienteRetencions(this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame.clienteretencionLogic.getClienteRetencions());

							if(this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoretencionAux.setRetencions(this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame.retencionLogic.getRetencions());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadoretencionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadoretencionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadoretencionAux,estadoretencionLogic.getEstadoRetencions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadoretencionAux,estadoretencions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionLogic.getEstadoRetencions().addAll(this.estadoretencionsEliminados);
					
					estadoretencionLogic.saveEstadoRetencions();//WithConnection
					//estadoretencionLogic.getSetVersionRowEstadoRetencions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadoretencionsEliminados= new ArrayList<EstadoRetencion>();		
			}
			
			if(this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Retencion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Retencion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadoretencion=estadoretencionAux;
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
      		//this.finishProcessEstadoRetencion();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoRetencion estadoretencionLocal) throws Exception {
		
		if(this.estadoretencionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadoretencionLocal.setClienteRetencions(this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame.clienteretencionLogic.getClienteRetencions());
				estadoretencionLocal.setRetencions(this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame.retencionLogic.getRetencions());
			
			} else {
			
				estadoretencionLocal.setClienteRetencions(this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame.clienteretencions);
				estadoretencionLocal.setRetencions(this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame.retencions);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoRetencion estadoretencionLocal) throws Exception {	
		if(this.estadoretencionSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoRetencionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoRetencion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoretencion =(EstadoRetencion) this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadoretencion =(EstadoRetencion) this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadoretencionValidator.getInvalidValues(this.estadoretencion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoRetencion estadoretencion,List<EstadoRetencion> estadoretencions) throws Exception {
		try	{		
			EstadoRetencionConstantesFunciones.actualizarLista(estadoretencion,estadoretencions,this.estadoretencionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoRetencion estadoretencion,List<EstadoRetencion> estadoretencions) throws Exception {
		try	{			
			EstadoRetencionConstantesFunciones.actualizarSelectedLista(estadoretencion,estadoretencions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoRetencion> estadoretencionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadoretencionsLocal=this.estadoretencionLogic.getEstadoRetencions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadoretencionsLocal=this.estadoretencions;
			}
			//ARCHITECTURE
		
			for(EstadoRetencion estadoretencionLocal:estadoretencionsLocal) {
				if(this.permiteMantenimiento(estadoretencionLocal) && estadoretencionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoRetencionConstantesFunciones.getEstadoRetencionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoRetencionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoRetencion.jLabelcodigoEstadoRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoRetencionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoRetencion.jLabelnombreEstadoRetencion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoRetencion.jLabelcodigoEstadoRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoRetencion.jLabelnombreEstadoRetencion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ClienteRetencion")) {
			if(this.estadoretencion==null) {
				this.estadoretencion= new EstadoRetencion();
			}

			if(this.estadoretencionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoRetencion
				this.setVariablesFormularioToObjetoActualEstadoRetencion(this.estadoretencion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoRetencion(this.estadoretencion);

				this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame.getclienteretencion().setEstadoRetencion(this.estadoretencion);
			}

			return;
		}
		 else  if(sTipo.equals("Retencion")) {
			if(this.estadoretencion==null) {
				this.estadoretencion= new EstadoRetencion();
			}

			if(this.estadoretencionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoRetencion
				this.setVariablesFormularioToObjetoActualEstadoRetencion(this.estadoretencion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoRetencion(this.estadoretencion);

				this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame.getretencion().setEstadoRetencion(this.estadoretencion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoRetencion--;	
		
		
		this.estadoretencionAux=new EstadoRetencion();
		
		this.estadoretencionAux.setId(this.iIdNuevoEstadoRetencion);
		this.estadoretencionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoretencionLogic.getEstadoRetencions().add(this.estadoretencionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadoretencions.add(this.estadoretencionAux);
		}
		//ARCHITECTURE
		
		this.estadoretencion=this.estadoretencionAux;
		
		if(EstadoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoRetencion(this.estadoretencion);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoRetencion(this.estadoretencion);
		}
				
		//this.setDefaultControlesEstadoRetencion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoRetencion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoRetencion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoRetencion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoRetencion(this.estadoretencionBean,this.estadoretencion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoRetencion(this.estadoretencion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoRetencionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadoretencionSessionBean.getConGuardarRelaciones()) {
			classes=EstadoRetencionConstantesFunciones.getClassesRelationshipsOfEstadoRetencion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadoretencionReturnGeneral=estadoretencionLogic.procesarEventosEstadoRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoretencionLogic.getEstadoRetencions(),this.estadoretencion,this.estadoretencionParameterGeneral,this.isEsNuevoEstadoRetencion,classes);//this.estadoretencionLogic.getEstadoRetencion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoRetencion(this.estadoretencionReturnGeneral,this.estadoretencionBean,false);
		
		if(this.estadoretencionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoRetencion(this.estadoretencionReturnGeneral.getEstadoRetencion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoRetencion(this.estadoretencionReturnGeneral.getEstadoRetencion());
		}
		
		if(this.estadoretencionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoRetencion(this.estadoretencionReturnGeneral.getEstadoRetencion(),classes);//this.estadoretencionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoRetencion(this.estadoretencion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoRetencion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoRetencion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoRetencion(false);
						
			if(estadoretencionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame.clienteretencionSessionBean.getEsGuardarRelacionado() && ClienteRetencionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteRetencionActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame.retencionSessionBean.getEsGuardarRelacionado() && RetencionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRetencionActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoRetencionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoRetencion();
			}
			
			this.actualizarVisualTableDatosEstadoRetencion();
			
			this.jTableDatosEstadoRetencion.setRowSelectionInterval(this.getIndiceNuevoEstadoRetencion(), this.getIndiceNuevoEstadoRetencion());
			
			this.seleccionarFilaTablaEstadoRetencionActual();
						
			this.actualizarEstadoCeldasBotonesEstadoRetencion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoRetencion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoRetencion.jTextFieldcodigoEstadoRetencion.setEnabled(isHabilitar && this.estadoretencionConstantesFunciones.activarcodigoEstadoRetencion);
		this.jInternalFrameDetalleFormEstadoRetencion.jTextAreanombreEstadoRetencion.setEnabled(isHabilitar && this.estadoretencionConstantesFunciones.activarnombreEstadoRetencion);	
		
	};
	
	public void setDefaultControlesEstadoRetencion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoRetencion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadoretencionSessionBean.setConGuardarRelaciones(true);			
			this.estadoretencionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoRetencion.jTabbedPaneRelacionesEstadoRetencion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame.clienteretencionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame.retencionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadoretencionSessionBean.setConGuardarRelaciones(false);			
			this.estadoretencionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoRetencion.jTabbedPaneRelacionesEstadoRetencion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame.clienteretencionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame.retencionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoRetencion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoRetencion estadoretencionAux:this.estadoretencionLogic.getEstadoRetencions()) {
				if(estadoretencionAux.getId().equals(this.iIdNuevoEstadoRetencion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoRetencion estadoretencionAux:this.estadoretencions) {
				if(estadoretencionAux.getId().equals(this.iIdNuevoEstadoRetencion)) {
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
	
	public int getIndiceActualEstadoRetencion(EstadoRetencion estadoretencion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoRetencion estadoretencionAux:this.estadoretencionLogic.getEstadoRetencions()) {
				if(estadoretencionAux.getId().equals(estadoretencion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoRetencion estadoretencionAux:this.estadoretencions) {
				if(estadoretencionAux.getId().equals(estadoretencion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoRetencion(EstadoRetencion estadoretencionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoRetencion estadoretencionAux:this.estadoretencionLogic.getEstadoRetencions()) {
				if(estadoretencionAux.getEstadoRetencionOriginal().getId().equals(estadoretencionOriginal.getId())) {
					existe=true;
					estadoretencionOriginal.setId(estadoretencionAux.getId());
					estadoretencionOriginal.setVersionRow(estadoretencionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoRetencion estadoretencionAux:this.estadoretencions) {
				if(estadoretencionAux.getEstadoRetencionOriginal().getId().equals(estadoretencionOriginal.getId())) {
					existe=true;
					estadoretencionOriginal.setId(estadoretencionAux.getId());
					estadoretencionOriginal.setVersionRow(estadoretencionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoRetencion(Boolean esParaCancelar) throws Exception {
		estadoretencionsAux=new ArrayList<EstadoRetencion>();
		estadoretencionAux=new EstadoRetencion();
		
		if(!this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoRetencion estadoretencionAux:this.estadoretencionLogic.getEstadoRetencions()) {
					if(estadoretencionAux.getId()<0) {
						estadoretencionsAux.add(estadoretencionAux);
					}		
				}
				this.iIdNuevoEstadoRetencion=0L;
				this.estadoretencionLogic.getEstadoRetencions().removeAll(estadoretencionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoRetencion estadoretencionAux:this.estadoretencions) {
					if(estadoretencionAux.getId()<0) {
						estadoretencionsAux.add(estadoretencionAux);
					}		
				}
				this.iIdNuevoEstadoRetencion=0L;
				this.estadoretencions.removeAll(estadoretencionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoRetencion 
					&& this.estadoretencionLogic.getEstadoRetencions().size()>0
					) {
					estadoretencionAux=this.estadoretencionLogic.getEstadoRetencions().get(this.estadoretencionLogic.getEstadoRetencions().size() - 1);
				
					if(estadoretencionAux.getId()<0) {
						this.estadoretencionLogic.getEstadoRetencions().remove(estadoretencionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoRetencion && this.estadoretencions.size()>0) {
					estadoretencionAux=this.estadoretencions.get(this.estadoretencions.size() - 1);
				
					if(estadoretencionAux.getId()<0) {
						this.estadoretencions.remove(estadoretencionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoRetencion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadoretencion.getId()<0) {
				this.estadoretencionLogic.getEstadoRetencions().remove(this.estadoretencion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadoretencion.getId()<0) {
				this.estadoretencions.remove(this.estadoretencion);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoRetencion(List<EstadoRetencion> estadoretencionsAux) throws Exception {
		EstadoRetencionConstantesFunciones.setEstadosInicialesEstadoRetencion(estadoretencionsAux);
	}
	
	public void setEstadosInicialesEstadoRetencion(EstadoRetencion estadoretencionAux) throws Exception {
		EstadoRetencionConstantesFunciones.setEstadosInicialesEstadoRetencion(estadoretencionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoRetencionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoRetencionActual()) {
				if(!this.isEsNuevoEstadoRetencion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoRetencion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoRetencionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Retencion ?", "MANTENIMIENTO DE Estado Retencion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoRetencion estadoretencion) throws Exception {
		EstadoRetencionConstantesFunciones.seleccionarAsignar(this.estadoretencion,estadoretencion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoRetencion=this.isPermisoActualizarOriginalEstadoRetencion;
			
			
			this.seleccionarAsignar(estadoretencion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoRetencionConstantesFunciones.quitarEspaciosEstadoRetencion(this.estadoretencion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoRetencion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadoretencionSessionBean.setsFuncionBusquedaRapida(this.estadoretencionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoRetencion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoRetencion(esParaCancelar);				
				this.cancelarNuevoEstadoRetencion(esParaCancelar);								
			}
			
			this.estadoretencion=new EstadoRetencion();
			
			this.inicializarEstadoRetencion();
			
			this.actualizarEstadoCeldasBotonesEstadoRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoRetencion() throws Exception {
		try {
			EstadoRetencionConstantesFunciones.inicializarEstadoRetencion(this.estadoretencion);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadoretencionLogic.getEstadoRetencions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoRetencions(String sAccionBusqueda,List<EstadoRetencion> estadoretencionsParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoRetencion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoRetencionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoRetencionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoRetencion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Retencions");		
		parameters.put("busquedapor", EstadoRetencionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ClienteRetencion.class));
			classes.add(new Classe(Retencion.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoRetencionLogic estadoretencionLogicAuxiliar=new EstadoRetencionLogic();
					estadoretencionLogicAuxiliar.setDatosCliente(estadoretencionLogic.getDatosCliente());				
					estadoretencionLogicAuxiliar.setEstadoRetencions(estadoretencionsParaReportes);
					
					estadoretencionLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoRetencionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadoretencionsParaReportes=estadoretencionLogicAuxiliar.getEstadoRetencions();
					
					//estadoretencionLogic.getNewConnexionToDeep();
					
					//for (EstadoRetencion estadoretencion:estadoretencionsParaReportes) {
					//	estadoretencionLogic.deepLoad(estadoretencion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadoretencionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadoretencionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileClienteRetencion = AuxiliarReportes.class.getResourceAsStream("ClienteRetencionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_clienteretencion", reportFileClienteRetencion);

			InputStream reportFileRetencion = AuxiliarReportes.class.getResourceAsStream("RetencionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_retencion", reportFileRetencion);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoRetencion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoRetencion=new JRBeanArrayDataSource(EstadoRetencionJInternalFrame.TraerEstadoRetencionBeans(estadoretencionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoRetencion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoRetencionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoRetencionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoRetencionBean.TraerEstadoRetencionBeans(estadoretencionsParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoRetencions(sAccionBusqueda,sTipoArchivoReporte,estadoretencionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoRetencions(sAccionBusqueda,sTipoArchivoReporte,estadoretencionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoRetencionActionPerformed(null);
					//this.generarExcelReporteEstadoRetencions(sAccionBusqueda,sTipoArchivoReporte,estadoretencionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoRetencions(sAccionBusqueda,sTipoArchivoReporte,estadoretencionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoRetencions(sAccionBusqueda,sTipoArchivoReporte,estadoretencionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoRetencions(sAccionBusqueda,sTipoArchivoReporte,estadoretencionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoRetencions(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoRetencion> estadoretencionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoretencion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoRetencions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoRetencion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoRetencion estadoretencion : estadoretencionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoRetencionConstantesFunciones.generarExcelReporteDataEstadoRetencion("NORMAL",row,workbook,estadoretencion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Retencion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoRetencion(String sTipo,Row row,Workbook workbook) {
		
		EstadoRetencionConstantesFunciones.generarExcelReporteHeaderEstadoRetencion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoRetencions(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoRetencion> estadoretencionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoretencion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoRetencions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoRetencion estadoretencion : estadoretencionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoRetencionConstantesFunciones.getEstadoRetencionDescripcion(estadoretencion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoRetencionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoRetencionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoretencion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoRetencionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoRetencionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoretencion.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Retencion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoRetencions(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoRetencion> estadoretencionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoRetencion> estadoretencionsRespaldo=null;
		
		classes=EstadoRetencionConstantesFunciones.getClassesRelationshipsOfEstadoRetencion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadoretencionLogic.setDatosCliente(this.datosCliente);
		this.estadoretencionLogic.setDatosDeep(this.datosDeep);
		this.estadoretencionLogic.setIsConDeep(true);
		
		estadoretencionsRespaldo=this.estadoretencionLogic.getEstadoRetencions();
		
		this.estadoretencionLogic.setEstadoRetencions(estadoretencionsParaReportes);	
		this.estadoretencionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadoretencionsParaReportes=this.estadoretencionLogic.getEstadoRetencions();
		this.estadoretencionLogic.setEstadoRetencions(estadoretencionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoretencion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoRetencions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoRetencion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoRetencion estadoretencion : estadoretencionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoRetencion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoRetencionConstantesFunciones.generarExcelReporteDataEstadoRetencion("NORMAL",row,workbook,estadoretencion,cellStyleDataAux);
		
			
			


				//ClienteRetencion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ClienteRetencionConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadoretencion.getClienteRetencions()!=null && estadoretencion.getClienteRetencions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ClienteRetencionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ClienteRetencionConstantesFunciones.generarExcelReporteHeaderClienteRetencion("RELACIONADO",row,workbook);
				}

				if(estadoretencion.getClienteRetencions()!=null) {
					i2=0;
					for(ClienteRetencion clienteretencion : estadoretencion.getClienteRetencions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ClienteRetencionConstantesFunciones.generarExcelReporteDataClienteRetencion("RELACIONADO",row,workbook,clienteretencion,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Retencion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(RetencionConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadoretencion.getRetencions()!=null && estadoretencion.getRetencions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(RetencionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					RetencionConstantesFunciones.generarExcelReporteHeaderRetencion("RELACIONADO",row,workbook);
				}

				if(estadoretencion.getRetencions()!=null) {
					i2=0;
					for(Retencion retencion : estadoretencion.getRetencions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						RetencionConstantesFunciones.generarExcelReporteDataRetencion("RELACIONADO",row,workbook,retencion,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoRetencionConstantesFunciones.getEstadoRetencionDescripcion(estadoretencion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Retencion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoRetencion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoRetencion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoRetencion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoRetencion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoRetencion() throws Exception {		
		this.startProcessEstadoRetencion(true);
	}
	
	public void startProcessEstadoRetencion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoRetencion, this.jScrollPanelDatosEstadoRetencion,this.jPanelPaginacionEstadoRetencion, this.jScrollPanelDatosEdicionEstadoRetencion, this.jPanelAccionesEstadoRetencion,this.jPanelAccionesFormularioEstadoRetencion,this.jmenuBarEstadoRetencion,this.jmenuBarDetalleEstadoRetencion,this.jTtoolBarEstadoRetencion,this.jTtoolBarDetalleEstadoRetencion);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoRetencion=null; 
		
		final JPanel jPanelParametrosReportesEstadoRetencion=this.jPanelParametrosReportesEstadoRetencion;
		//final JScrollPane jScrollPanelDatosEstadoRetencion=this.jScrollPanelDatosEstadoRetencion;
		final JTable jTableDatosEstadoRetencion=this.jTableDatosEstadoRetencion;		
		final JPanel jPanelPaginacionEstadoRetencion=this.jPanelPaginacionEstadoRetencion;
		//final JScrollPane jScrollPanelDatosEdicionEstadoRetencion=this.jScrollPanelDatosEdicionEstadoRetencion;
		final JPanel jPanelAccionesEstadoRetencion=this.jPanelAccionesEstadoRetencion;
		
		JPanel jPanelCamposAuxiliarEstadoRetencion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoRetencion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) {
			jPanelCamposAuxiliarEstadoRetencion=this.jInternalFrameDetalleFormEstadoRetencion.jPanelCamposEstadoRetencion;
			jPanelAccionesFormularioAuxiliarEstadoRetencion=this.jInternalFrameDetalleFormEstadoRetencion.jPanelAccionesFormularioEstadoRetencion;
		}
		
		final JPanel jPanelCamposEstadoRetencion=jPanelCamposAuxiliarEstadoRetencion;
		final JPanel jPanelAccionesFormularioEstadoRetencion=jPanelAccionesFormularioAuxiliarEstadoRetencion;
		
		
		final JMenuBar jmenuBarEstadoRetencion=this.jmenuBarEstadoRetencion;
		final JToolBar jTtoolBarEstadoRetencion=this.jTtoolBarEstadoRetencion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoRetencion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoRetencion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) {
			jmenuBarDetalleAuxiliarEstadoRetencion=this.jInternalFrameDetalleFormEstadoRetencion.jmenuBarDetalleEstadoRetencion;
			jTtoolBarDetalleAuxiliarEstadoRetencion=this.jInternalFrameDetalleFormEstadoRetencion.jTtoolBarDetalleEstadoRetencion;
		}
		
		final JMenuBar jmenuBarDetalleEstadoRetencion=jmenuBarDetalleAuxiliarEstadoRetencion;
		final JToolBar jTtoolBarDetalleEstadoRetencion=jTtoolBarDetalleAuxiliarEstadoRetencion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoRetencion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoRetencion;
			processRunnable.jTableDatos=jTableDatosEstadoRetencion;
			processRunnable.jPanelCampos=jPanelCamposEstadoRetencion;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoRetencion;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoRetencion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoRetencion;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoRetencion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoRetencion;
			processRunnable.jTtoolBar=jTtoolBarEstadoRetencion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoRetencion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoRetencion ,jPanelParametrosReportesEstadoRetencion,jTableDatosEstadoRetencion, /*jScrollPanelDatosEstadoRetencion,*/jPanelCamposEstadoRetencion,jPanelPaginacionEstadoRetencion, /*jScrollPanelDatosEdicionEstadoRetencion,*/ jPanelAccionesEstadoRetencion,jPanelAccionesFormularioEstadoRetencion,jmenuBarEstadoRetencion,jmenuBarDetalleEstadoRetencion,jTtoolBarEstadoRetencion,jTtoolBarDetalleEstadoRetencion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoRetencion, jScrollPanelDatosEstadoRetencion,jPanelPaginacionEstadoRetencion, jScrollPanelDatosEdicionEstadoRetencion, jPanelAccionesEstadoRetencion,jPanelAccionesFormularioEstadoRetencion,jmenuBarEstadoRetencion,jmenuBarDetalleEstadoRetencion,jTtoolBarEstadoRetencion,jTtoolBarDetalleEstadoRetencion);
						
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
	
	public void finishProcessEstadoRetencion() {// throws Exception 
		this.finishProcessEstadoRetencion(true);
	}
	
	public void finishProcessEstadoRetencion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoRetencion, this.jScrollPanelDatosEstadoRetencion,this.jPanelPaginacionEstadoRetencion, this.jScrollPanelDatosEdicionEstadoRetencion, this.jPanelAccionesEstadoRetencion,this.jPanelAccionesFormularioEstadoRetencion,this.jmenuBarEstadoRetencion,this.jmenuBarDetalleEstadoRetencion,this.jTtoolBarEstadoRetencion,this.jTtoolBarDetalleEstadoRetencion);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoRetencion=null; 
		
		final JPanel jPanelParametrosReportesEstadoRetencion=this.jPanelParametrosReportesEstadoRetencion;
		//final JScrollPane jScrollPanelDatosEstadoRetencion=this.jScrollPanelDatosEstadoRetencion;
		final JTable jTableDatosEstadoRetencion=this.jTableDatosEstadoRetencion;		
		final JPanel jPanelPaginacionEstadoRetencion=this.jPanelPaginacionEstadoRetencion;
		//final JScrollPane jScrollPanelDatosEdicionEstadoRetencion=this.jScrollPanelDatosEdicionEstadoRetencion;
		final JPanel jPanelAccionesEstadoRetencion=this.jPanelAccionesEstadoRetencion;
		
		JPanel jPanelCamposAuxiliarEstadoRetencion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoRetencion=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) {
			jPanelCamposAuxiliarEstadoRetencion=this.jInternalFrameDetalleFormEstadoRetencion.jPanelCamposEstadoRetencion;
			jPanelAccionesFormularioAuxiliarEstadoRetencion=this.jInternalFrameDetalleFormEstadoRetencion.jPanelAccionesFormularioEstadoRetencion;
		}
		
		final JPanel jPanelCamposEstadoRetencion=jPanelCamposAuxiliarEstadoRetencion;
		final JPanel jPanelAccionesFormularioEstadoRetencion=jPanelAccionesFormularioAuxiliarEstadoRetencion;
		
		
		final JMenuBar jmenuBarEstadoRetencion=this.jmenuBarEstadoRetencion;		
		final JToolBar jTtoolBarEstadoRetencion=this.jTtoolBarEstadoRetencion;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoRetencion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoRetencion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) {
			jmenuBarDetalleAuxiliarEstadoRetencion=this.jInternalFrameDetalleFormEstadoRetencion.jmenuBarDetalleEstadoRetencion;
			jTtoolBarDetalleAuxiliarEstadoRetencion=this.jInternalFrameDetalleFormEstadoRetencion.jTtoolBarDetalleEstadoRetencion;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoRetencion=jmenuBarDetalleAuxiliarEstadoRetencion;
		final JToolBar jTtoolBarDetalleEstadoRetencion=jTtoolBarDetalleAuxiliarEstadoRetencion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoRetencion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoRetencion;
			processRunnable.jTableDatos=jTableDatosEstadoRetencion;
			processRunnable.jPanelCampos=jPanelCamposEstadoRetencion;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoRetencion;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoRetencion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoRetencion;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoRetencion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoRetencion;
			processRunnable.jTtoolBar=jTtoolBarEstadoRetencion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoRetencion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoRetencion ,jPanelParametrosReportesEstadoRetencion, jTableDatosEstadoRetencion,/*jScrollPanelDatosEstadoRetencion,*/jPanelCamposEstadoRetencion,jPanelPaginacionEstadoRetencion, /*jScrollPanelDatosEdicionEstadoRetencion,*/ jPanelAccionesEstadoRetencion,jPanelAccionesFormularioEstadoRetencion,jmenuBarEstadoRetencion,jmenuBarDetalleEstadoRetencion,jTtoolBarEstadoRetencion,jTtoolBarDetalleEstadoRetencion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoRetencion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoRetencion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoRetencion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoRetencion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoRetencion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoRetencion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoRetencion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoRetencion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoRetencion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadoretencionConstantesFunciones.getsFinalQueryEstadoRetencion();
		String  finalQueryPaginacionTodos=this.estadoretencionConstantesFunciones.getsFinalQueryEstadoRetencion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoRetencionConstantesFunciones.getArrayColumnasGlobalesNoEstadoRetencion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoRetencionConstantesFunciones.getArrayColumnasGlobalesEstadoRetencion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoRetencionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadoretencionsEliminados= new ArrayList<EstadoRetencion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoRetencion();
		
				///*EstadoRetencionSessionBean*/this.estadoretencionSessionBean=new EstadoRetencionSessionBean();
			
			if(this.estadoretencionSessionBean==null) {
				this.estadoretencionSessionBean=new EstadoRetencionSessionBean();
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
					this.iNumeroPaginacion=EstadoRetencionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoRetencionConstantesFunciones.getClassesForeignKeysOfEstadoRetencion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadoretencion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadoretencionsAux= new ArrayList<EstadoRetencion>();
			
				
			estadoretencionLogic.setDatosCliente(this.datosCliente);
			estadoretencionLogic.setDatosDeep(this.datosDeep);
			estadoretencionLogic.setIsConDeep(true);
			
			
			estadoretencionLogic.getEstadoRetencionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadoretencionLogic.getTodosEstadoRetencions(finalQueryGlobal,pagination);
					
					//estadoretencionLogic.getTodosEstadoRetencionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadoretencionLogic.getEstadoRetencions()==null|| estadoretencionLogic.getEstadoRetencions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoretencionsAux= new ArrayList<EstadoRetencion>();
							estadoretencionsAux.addAll(estadoretencionLogic.getEstadoRetencions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoretencionsAux= new ArrayList<EstadoRetencion>();
							estadoretencionsAux.addAll(estadoretencions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoretencionLogic.getTodosEstadoRetencions(finalQueryGlobal+"",this.pagination);												
							
							//estadoretencionLogic.getTodosEstadoRetencionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoRetencions("Todos",estadoretencionLogic.getEstadoRetencions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoretencionLogic.setEstadoRetencions(new ArrayList<EstadoRetencion>());					
							estadoretencionLogic.getEstadoRetencions().addAll(estadoretencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoretencions=new ArrayList<EstadoRetencion>();
							estadoretencions.addAll(estadoretencionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoRetencion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoRetencion=this.idActual;
				
				} else if(this.idEstadoRetencionActual!=null && this.idEstadoRetencionActual!=0L) {
					idEstadoRetencion=idEstadoRetencionActual;
				}
				
					
				this.sDetalleReporte=EstadoRetencionConstantesFunciones.getDetalleIndicePorId(idEstadoRetencion);
				
				this.estadoretencions=new ArrayList<EstadoRetencion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadoretencionLogic.getEntity(idEstadoRetencion);
					
					//estadoretencionLogic.getEntityWithConnection(idEstadoRetencion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoretencionLogic.setEstadoRetencions(new ArrayList<EstadoRetencion>());
					estadoretencionLogic.getEstadoRetencions().add(estadoretencionLogic.getEstadoRetencion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoretencions=new ArrayList<EstadoRetencion>();
					this.estadoretencions.add(estadoretencion);
				}
				
				if(estadoretencionLogic.getEstadoRetencion()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoRetencion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoRetencion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoretencionLogic.getEstadoRetencions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoretencions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoretencionLogic.getEstadoRetencions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoretencions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoRetencion estadoretencion) {
		Boolean permite=true;
		
		if(this.estadoretencion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoRetencionConstantesFunciones.getOrderByListaEstadoRetencion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoRetencionConstantesFunciones.getOrderByListaEstadoRetencion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoRetencion estadoretencion:estadoretencionLogic.getEstadoRetencions()) {
				if(estadoretencion.getsType().equals(Constantes2.S_TOTALES)) {
					estadoretencionTotales=estadoretencion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoRetencion estadoretencion:this.estadoretencions) {
				if(estadoretencion.getsType().equals(Constantes2.S_TOTALES)) {
					estadoretencionTotales=estadoretencion;
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
			this.estadoretencionAux=new EstadoRetencion();
			this.estadoretencionAux.setsType(Constantes2.S_TOTALES);
			this.estadoretencionAux.setIsNew(false);
			this.estadoretencionAux.setIsChanged(false);
			this.estadoretencionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoRetencionConstantesFunciones.TotalizarValoresFilaEstadoRetencion(this.estadoretencionLogic.getEstadoRetencions(),this.estadoretencionAux);
				
				this.estadoretencionLogic.getEstadoRetencions().add(this.estadoretencionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoRetencionConstantesFunciones.TotalizarValoresFilaEstadoRetencion(this.estadoretencions,this.estadoretencionAux);
				
				this.estadoretencions.add(this.estadoretencionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadoretencionTotales=new EstadoRetencion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoretencionLogic.getEstadoRetencions().remove(estadoretencionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoretencions.remove(estadoretencionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadoretencionTotales=new EstadoRetencion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoRetencion estadoretencion:estadoretencionLogic.getEstadoRetencions()) {
				if(estadoretencion.getsType().equals(Constantes2.S_TOTALES)) {
					estadoretencionTotales=estadoretencion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoRetencionConstantesFunciones.TotalizarValoresFilaEstadoRetencion(this.estadoretencionLogic.getEstadoRetencions(),estadoretencionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoRetencion estadoretencion:this.estadoretencions) {
				if(estadoretencion.getsType().equals(Constantes2.S_TOTALES)) {
					estadoretencionTotales=estadoretencion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoRetencionConstantesFunciones.TotalizarValoresFilaEstadoRetencion(this.estadoretencions,estadoretencionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosEstadoRetencion() {
		this.isPermisoTodoEstadoRetencion=false;
		this.isPermisoNuevoEstadoRetencion=false;
		this.isPermisoActualizarEstadoRetencion=false;
		this.isPermisoActualizarOriginalEstadoRetencion=false;
		this.isPermisoEliminarEstadoRetencion=false;
		this.isPermisoGuardarCambiosEstadoRetencion=false;
		this.isPermisoConsultaEstadoRetencion=false;
		this.isPermisoBusquedaEstadoRetencion=false;
		this.isPermisoReporteEstadoRetencion=false;		
		this.isPermisoOrdenEstadoRetencion=false;		
		this.isPermisoPaginacionMedioEstadoRetencion=false;		
		this.isPermisoPaginacionAltoEstadoRetencion=false;
		this.isPermisoPaginacionTodoEstadoRetencion=false;
		this.isPermisoCopiarEstadoRetencion=false;		
		this.isPermisoVerFormEstadoRetencion=false;		
		this.isPermisoDuplicarEstadoRetencion=false;		
		this.isPermisoOrdenEstadoRetencion=false;		
	}
	
	public void setPermisosUsuarioEstadoRetencion(Boolean isPermiso) {
		this.isPermisoTodoEstadoRetencion=isPermiso;
		this.isPermisoNuevoEstadoRetencion=isPermiso;
		this.isPermisoActualizarEstadoRetencion=isPermiso;
		this.isPermisoActualizarOriginalEstadoRetencion=isPermiso;
		this.isPermisoEliminarEstadoRetencion=isPermiso;
		this.isPermisoGuardarCambiosEstadoRetencion=isPermiso;
		this.isPermisoConsultaEstadoRetencion=isPermiso;
		this.isPermisoBusquedaEstadoRetencion=isPermiso;
		this.isPermisoReporteEstadoRetencion=isPermiso;
		this.isPermisoOrdenEstadoRetencion=isPermiso;		
		this.isPermisoPaginacionMedioEstadoRetencion=isPermiso;		
		this.isPermisoPaginacionAltoEstadoRetencion=isPermiso;		
		this.isPermisoPaginacionTodoEstadoRetencion=isPermiso;		
		this.isPermisoCopiarEstadoRetencion=isPermiso;		
		this.isPermisoVerFormEstadoRetencion=isPermiso;		
		this.isPermisoDuplicarEstadoRetencion=isPermiso;
		this.isPermisoOrdenEstadoRetencion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoRetencion(Boolean isPermiso) {
		//this.isPermisoTodoEstadoRetencion=isPermiso;
		this.isPermisoNuevoEstadoRetencion=isPermiso;
		this.isPermisoActualizarEstadoRetencion=isPermiso;
		this.isPermisoActualizarOriginalEstadoRetencion=isPermiso;
		this.isPermisoEliminarEstadoRetencion=isPermiso;
		this.isPermisoGuardarCambiosEstadoRetencion=isPermiso;
		//this.isPermisoConsultaEstadoRetencion=isPermiso;
		//this.isPermisoBusquedaEstadoRetencion=isPermiso;
		//this.isPermisoReporteEstadoRetencion=isPermiso;
		//this.isPermisoOrdenEstadoRetencion=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoRetencion=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoRetencion=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoRetencion=isPermiso;		
		//this.isPermisoCopiarEstadoRetencion=isPermiso;		
		//this.isPermisoDuplicarEstadoRetencion=isPermiso;
		//this.isPermisoOrdenEstadoRetencion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoRetencionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ClienteRetencionConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(RetencionConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosClienteRetencion=false;
		this.isTienePermisosClienteRetencion=this.verificarGetPermisosUsuarioOpcionEstadoRetencionClaseRelacionada(this.opcionsRelacionadas,ClienteRetencionConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosRetencion=false;
		this.isTienePermisosRetencion=this.verificarGetPermisosUsuarioOpcionEstadoRetencionClaseRelacionada(this.opcionsRelacionadas,RetencionConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoRetencion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoRetencionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosClienteRetencion=conPermiso;
		this.isTienePermisosRetencion=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoRetencionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoRetencionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoRetencionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosClienteRetencion && this.jInternalFrameDetalleFormEstadoRetencion!=null && this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoRetencion.jTabbedPaneRelacionesEstadoRetencion.remove(this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosRetencion && this.jInternalFrameDetalleFormEstadoRetencion!=null && this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoRetencion.jTabbedPaneRelacionesEstadoRetencion.remove(this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoRetencion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoRetencionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoRetencion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoRetencion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoRetencion=this.isPermisoActualizarEstadoRetencion;
			this.isPermisoEliminarEstadoRetencion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoRetencion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoRetencion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoRetencion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoRetencion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoRetencion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoRetencion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoRetencion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoRetencion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoRetencion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoRetencion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoRetencion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoRetencion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoRetencion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoRetencion.setToolTipText(this.jTableDatosEstadoRetencion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoRetencion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoRetencion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoRetencion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosClienteRetencion && this.estadoretencionConstantesFunciones.mostrarClienteRetencionEstadoRetencion && !EstadoRetencionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Retencion");
			reporte.setsDescripcion("Retencion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosRetencion && this.estadoretencionConstantesFunciones.mostrarRetencionEstadoRetencion && !EstadoRetencionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Retencion");
			reporte.setsDescripcion("Retencion");
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
	
		
	public void inicializarCombosForeignKeyEstadoRetencionListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoRetencionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoRetencionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoRetencionListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoRetencionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoRetencion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoRetencion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoRetencion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoRetencion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoRetencion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoRetencion(EstadoRetencion estadoretencion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoRetencion(EstadoRetencion estadoretencion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoRetencion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoRetencion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoRetencion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoRetencion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoRetencion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoRetencion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoRetencion(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoRetencion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoRetencionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoRetencionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoRetencionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadoretencionSessionBean=new EstadoRetencionSessionBean(); 
		this.estadoretencionConstantesFunciones=new EstadoRetencionConstantesFunciones(); 
		this.estadoretencionBean=new EstadoRetencion();//(this.estadoretencionConstantesFunciones); 		
		this.estadoretencionReturnGeneral=new EstadoRetencionParameterReturnGeneral(); 
		
		this.estadoretencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoretencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoRetencionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoRetencionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoRetencionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoRetencion(true);
			
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
			
			this.estadoretencionConstantesFunciones=new EstadoRetencionConstantesFunciones(); 
			this.estadoretencionBean=new EstadoRetencion();//this.estadoretencionConstantesFunciones); 			
			this.estadoretencionReturnGeneral=new EstadoRetencionParameterReturnGeneral(); 
		
			EstadoRetencionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Retencion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadoretencion=new EstadoRetencion();
			this.estadoretencions = new ArrayList<EstadoRetencion>();
			this.estadoretencionsAux = new ArrayList<EstadoRetencion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic=new EstadoRetencionLogic();
				this.estadoretencionLogic.getNewConnexionToDeep("");
			}
			
			//this.estadoretencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadoretencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoRetencion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoRetencion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoRetencion);	
					}
					
					if(this.jInternalFrameImportacionEstadoRetencion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoRetencion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoRetencion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoRetencion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoRetencion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoRetencion);
				this.jInternalFrameDetalleFormEstadoRetencion.setVisible(false);
				this.jInternalFrameDetalleFormEstadoRetencion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoRetencion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoRetencion);
					this.jInternalFrameReporteDinamicoEstadoRetencion.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoRetencion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoRetencion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoRetencion);
					this.jInternalFrameImportacionEstadoRetencion.setVisible(false);
					this.jInternalFrameImportacionEstadoRetencion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoRetencion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoRetencion);
					this.jInternalFrameOrderByEstadoRetencion.setVisible(false);
					this.jInternalFrameOrderByEstadoRetencion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoRetencionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoRetencionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadoretencionReturnGeneral=new EstadoRetencionParameterReturnGeneral();
			
			this.estadoretencionParameterGeneral=new EstadoRetencionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadoretencionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ClienteRetencionConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(RetencionConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoRetencionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoretencionSessionBean.getEsGuardarRelacionado(),this.estadoretencionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoRetencionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoretencionSessionBean.getEsGuardarRelacionado(),this.estadoretencionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoRetencion=false;
			this.isVisibilidadCeldaDuplicarEstadoRetencion=true;
			this.isVisibilidadCeldaCopiarEstadoRetencion=true;
			this.isVisibilidadCeldaVerFormEstadoRetencion=true;
			this.isVisibilidadCeldaOrdenEstadoRetencion=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRetencion=false;
			this.isVisibilidadCeldaModificarEstadoRetencion=false;
			this.isVisibilidadCeldaActualizarEstadoRetencion=false;
			this.isVisibilidadCeldaEliminarEstadoRetencion=false;
			this.isVisibilidadCeldaCancelarEstadoRetencion=false;
			this.isVisibilidadCeldaGuardarEstadoRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRetencion=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoRetencion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoRetencion(false);
			
			this.setPermisosUsuarioEstadoRetencion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoretencionSessionBean.getEsGuardarRelacionado() 
				|| (this.estadoretencionSessionBean.getEsGuardarRelacionado() && this.estadoretencionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoRetencionClasesRelacionadas();
			}
			
			if(this.estadoretencionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoRetencionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoRetencionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoRetencion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoRetencion();
			}
			
			if(!this.isPermisoBusquedaEstadoRetencion) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoretencionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoRetencion,this.isPermisoPaginacionMedioEstadoRetencion,this.isPermisoPaginacionTodoEstadoRetencion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoRetencionConstantesFunciones.getTiposSeleccionarEstadoRetencion());
				
				this.tiposColumnasSelect=EstadoRetencionConstantesFunciones.getTiposSeleccionarEstadoRetencion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoRetencion();				
				//this.tiposRelacionesSelect=EstadoRetencionConstantesFunciones.getTiposRelacionesEstadoRetencion(true);
				
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
			//if(!this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoRetencion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoRetencion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoRetencion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoRetencion() ;
			
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
			
			
			this.clienteretencionLogic=new ClienteRetencionLogic();
			this.retencionLogic=new RetencionLogic(); 
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
				estadoretencionImplementable= (EstadoRetencionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoRetencionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadoretencionImplementableHome= (EstadoRetencionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoRetencionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadoretencions= new ArrayList<EstadoRetencion>();
			this.estadoretencionsEliminados= new ArrayList<EstadoRetencion>();
						
			this.isEsNuevoEstadoRetencion=false;
			this.esParaAccionDesdeFormularioEstadoRetencion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoRetencion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoRetencion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoRetencionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoRetencion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoRetencion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoRetencion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoRetencion();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoRetencion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoRetencion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoRetencion() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ClienteRetencionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ClienteRetencionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(RetencionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(RetencionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoRetencion")) {
				iIndex=this.jInternalFrameDetalleFormEstadoRetencion.jTabbedPaneRelacionesEstadoRetencion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoRetencion.jTabbedPaneRelacionesEstadoRetencion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoRetencion.getSelectedRow();	
				
				

				if(sTitle.equals("Retenciones")) {
					if(!ClienteRetencionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoRetencion();

						this.cargarParteTabPanelRelacionadaClienteRetencion(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Retenciones")) {
					if(!RetencionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoRetencion();

						this.cargarParteTabPanelRelacionadaRetencion(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoRetencion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaClienteRetencion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoRetencion.cargarSessionConBeanSwingJInternalFrameClienteRetencion(false,true,iIndex);
		this.jButtonClienteRetencionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaClienteRetencion();

		//this.jTabbedPaneRelacionesEstadoRetencion.updateUI();
		//this.jTabbedPaneRelacionesEstadoRetencion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoRetencion.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaRetencion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoRetencion.cargarSessionConBeanSwingJInternalFrameRetencion(false,true,iIndex);
		this.jButtonRetencionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaRetencion();

		//this.jTabbedPaneRelacionesEstadoRetencion.updateUI();
		//this.jTabbedPaneRelacionesEstadoRetencion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoRetencion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ClienteRetencion")) {
				int row=this.jTableDatosEstadoRetencion.getSelectedRow();
				jButtonClienteRetencionActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Retencion")) {
				int row=this.jTableDatosEstadoRetencion.getSelectedRow();
				jButtonRetencionActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Retencion")) {

					if(this.isTienePermisosClienteRetencion && this.estadoretencionConstantesFunciones.mostrarClienteRetencionEstadoRetencion && !EstadoRetencionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Retenciones"+"("+ClienteRetencionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Retenciones");

						if(estadoretencionConstantesFunciones.resaltarClienteRetencionEstadoRetencion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadoretencionConstantesFunciones.resaltarClienteRetencionEstadoRetencion);
						}

						jmenuItem.setEnabled(this.estadoretencionConstantesFunciones.activarClienteRetencionEstadoRetencion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ClienteRetencion"));

						

						this.jInternalFrameDetalleFormEstadoRetencion.jmenuDetalleEstadoRetencion.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Retencion")) {

					if(this.isTienePermisosRetencion && this.estadoretencionConstantesFunciones.mostrarRetencionEstadoRetencion && !EstadoRetencionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Retenciones"+"("+RetencionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Retenciones");

						if(estadoretencionConstantesFunciones.resaltarRetencionEstadoRetencion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadoretencionConstantesFunciones.resaltarRetencionEstadoRetencion);
						}

						jmenuItem.setEnabled(this.estadoretencionConstantesFunciones.activarRetencionEstadoRetencion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Retencion"));

						

						this.jInternalFrameDetalleFormEstadoRetencion.jmenuDetalleEstadoRetencion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoRetencion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoRetencion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoRetencion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoRetencionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoRetencion();
		
		this.cargarCombosFrameForeignKeyEstadoRetencion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoRetencion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoRetencion();
		}
	}
	
	
	
	public void jButtonNuevoEstadoRetencionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadoretencionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
			
			
			if(jTableDatosEstadoRetencion.getRowCount()>=1) {
				jTableDatosEstadoRetencion.removeRowSelectionInterval(0, jTableDatosEstadoRetencion.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoRetencion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoRetencion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoRetencion(true);			
			//this.estadoretencion=new EstadoRetencion();
			//this.estadoretencion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoRetencion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoRetencion() ;
			
			if(EstadoRetencionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoRetencion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadoretencion);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadoretencion);				
			
			EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
			
			if(this.estadoretencionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoRetencion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoRetencionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoRetencion> estadoretencionsSeleccionados=new ArrayList<EstadoRetencion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoRetencion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoRetencion.getSelectedRows().length;			
			}
			
			estadoretencionsSeleccionados=this.getEstadoRetencionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoRetencion--;			
				//EstadoRetencion estadoretencionAux= new EstadoRetencion();			
				//estadoretencionAux.setId(this.iIdNuevoEstadoRetencion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoRetencion estadoretencionOrigen=new EstadoRetencion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoRetencion estadoretencionOrigen : estadoretencionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoRetencion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadoretencionOrigen =(EstadoRetencion) this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoretencionOrigen =(EstadoRetencion) this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoRetencion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadoretencion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoRetencion(estadoretencionOrigen,this.estadoretencion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRetencion(this.estadoretencion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoretencionLogic.getEstadoRetencions().add(this.estadoretencionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoretencions.add(this.estadoretencionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoRetencion(false);
				
				this.jTableDatosEstadoRetencion.setRowSelectionInterval(this.getIndiceNuevoEstadoRetencion(), this.getIndiceNuevoEstadoRetencion());
				
				int iLastRow =  this.jTableDatosEstadoRetencion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoRetencion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoRetencion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoRetencion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoRetencion> estadoretencionsSeleccionados=new ArrayList<EstadoRetencion>();									
		
			EstadoRetencion estadoretencionOrigen=new EstadoRetencion();
			EstadoRetencion estadoretencionDestino=new EstadoRetencion();
				
			estadoretencionsSeleccionados=this.getEstadoRetencionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoRetencion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadoretencionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoRetencion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoretencionOrigen =(EstadoRetencion) this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoretencionOrigen =(EstadoRetencion) this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoretencionDestino =(EstadoRetencion) this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoretencionDestino =(EstadoRetencion) this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadoretencionOrigen =estadoretencionsSeleccionados.get(0);
				estadoretencionDestino =estadoretencionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoRetencion(estadoretencionOrigen,estadoretencionDestino,true,false);
				
				estadoretencionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoretencionDestino,estadoretencionLogic.getEstadoRetencions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoretencionDestino,estadoretencions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoRetencion(false);
				
				//this.jTableDatosEstadoRetencion.setRowSelectionInterval(this.getIndiceNuevoEstadoRetencion(), this.getIndiceNuevoEstadoRetencion());
				
				int iLastRow =  this.jTableDatosEstadoRetencion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoRetencion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoRetencion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoRetencion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoRetencion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoRetencion.isVisible();
			
			
			this.jPanelParametrosReportesEstadoRetencion.setVisible(!isVisible);
			this.jPanelPaginacionEstadoRetencion.setVisible(!isVisible);
			this.jPanelAccionesEstadoRetencion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoRetencion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoRetencion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoRetencion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoRetencion();
			
			this.abrirFrameOrderByEstadoRetencion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoRetencion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoRetencion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoRetencion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoRetencion.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoRetencion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoRetencion.setSize(this.jInternalFrameDetalleFormEstadoRetencion.iWidthFormulario,this.jInternalFrameDetalleFormEstadoRetencion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoRetencion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoRetencion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoRetencion.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoRetencion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoRetencion.jContentPaneDetalleEstadoRetencion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoRetencion.jTabbedPaneRelacionesEstadoRetencion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoRetencion.jContentPaneDetalleEstadoRetencion.getWidth(),EstadoRetencionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoRetencion.jTabbedPaneRelacionesEstadoRetencion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoRetencion.jContentPaneDetalleEstadoRetencion.getWidth(),EstadoRetencionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoRetencion.jTabbedPaneRelacionesEstadoRetencion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoRetencion.jContentPaneDetalleEstadoRetencion.getWidth(),EstadoRetencionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ClienteRetencionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaClienteRetencion();
					}

					if(RetencionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaRetencion();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoRetencion.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoRetencion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoRetencion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoRetencion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoRetencion,false,this);
				} else {
					this.jInternalFrameOrderByEstadoRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoRetencion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoRetencion);
				this.jInternalFrameOrderByEstadoRetencion.setVisible(false);
				this.jInternalFrameOrderByEstadoRetencion.setSelected(false);
				
				this.jInternalFrameOrderByEstadoRetencion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoRetencion"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoRetencion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoRetencion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoRetencion==null) {
				
				this.jInternalFrameImportacionEstadoRetencion=new ImportacionJInternalFrame(EstadoRetencionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoRetencion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoRetencion);
				this.jInternalFrameImportacionEstadoRetencion.setVisible(false);
				this.jInternalFrameImportacionEstadoRetencion.setSelected(false);


				this.jInternalFrameImportacionEstadoRetencion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoRetencion"));
				this.jInternalFrameImportacionEstadoRetencion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoRetencion"));
				this.jInternalFrameImportacionEstadoRetencion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoRetencion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoRetencion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoRetencion==null) {
				this.jInternalFrameReporteDinamicoEstadoRetencion=new ReporteDinamicoJInternalFrame(EstadoRetencionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoRetencion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoRetencion);
				this.jInternalFrameReporteDinamicoEstadoRetencion.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoRetencion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoRetencion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoRetencion"));
				this.jInternalFrameReporteDinamicoEstadoRetencion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoRetencion"));
				this.jInternalFrameReporteDinamicoEstadoRetencion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoRetencion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoRetencion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaClienteRetencion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame.jScrollPanelDatosClienteRetencion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoRetencion.jContentPaneDetalleEstadoRetencion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame.jScrollPanelDatosClienteRetencion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame.jScrollPanelDatosClienteRetencion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame.jScrollPanelDatosClienteRetencion.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaRetencion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame.jScrollPanelDatosRetencion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoRetencion.jContentPaneDetalleEstadoRetencion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame.jScrollPanelDatosRetencion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame.jScrollPanelDatosRetencion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame.jScrollPanelDatosRetencion.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoRetencion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoRetencion);
			
	       	this.jInternalFrameDetalleFormEstadoRetencion.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoRetencion.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoRetencion.dispose();
			//this.jInternalFrameDetalleFormEstadoRetencion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoRetencion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoRetencion.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoRetencion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoRetencion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoRetencion.setVisible(true);
	        this.jInternalFrameImportacionEstadoRetencion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoRetencion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoRetencion.setVisible(true);
	        this.jInternalFrameOrderByEstadoRetencion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoRetencion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoRetencion.setVisible(false);
	        this.jInternalFrameOrderByEstadoRetencion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoRetencion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoRetencion.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoRetencion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoRetencion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoRetencion.setVisible(false);
	        this.jInternalFrameImportacionEstadoRetencion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoRetencion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoRetencion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoRetencion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoRetencion(true);
			//this.isEsNuevoEstadoRetencion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencion =(EstadoRetencion) this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoretencion =(EstadoRetencion) this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoRetencion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoRetencion(false) ;
			
			if(estadoretencionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame.clienteretencionSessionBean.getEsGuardarRelacionado() && ClienteRetencionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteRetencionActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame.retencionSessionBean.getEsGuardarRelacionado() && RetencionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRetencionActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoRetencionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoRetencion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoRetencion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoRetencionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencion =(EstadoRetencion) this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoretencion =(EstadoRetencion) this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoRetencion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoRetencion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoRetencion(true);
			//this.isEsNuevoEstadoRetencion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencion =(EstadoRetencion) this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoretencion =(EstadoRetencion) this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadoretencion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoRetencion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoRetencion(false) ;
			
			if(EstadoRetencionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoRetencion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoRetencion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoRetencion(false);
			
			//if(!this.isEsNuevoEstadoRetencion) {								
				int intSelectedRow = this.jTableDatosEstadoRetencion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencion =(EstadoRetencion) this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoretencion =(EstadoRetencion) this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoRetencion(this.estadoretencion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoRetencion(this.estadoretencion);
				
			}
			
			if(this.permiteMantenimiento(this.estadoretencion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoRetencion=true;
					this.inicializarActualizarBindingTablaEstadoRetencion(false);
					this.isEsNuevoEstadoRetencion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoRetencion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoRetencion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoRetencion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoRetencion(false);
				
				this.habilitarDeshabilitarControlesEstadoRetencion(false);
			
												
				
				if(EstadoRetencionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoRetencion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoRetencionActionPerformed(evt,estadoretencionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoRetencion(this.estadoretencion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoRetencion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadoretencionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadoretencion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoRetencion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRetencion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoRetencion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencion =(EstadoRetencion) this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
				this.estadoretencion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoretencion =(EstadoRetencion) this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
				this.estadoretencion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadoretencion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoRetencionModel) this.jTableDatosEstadoRetencion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoRetencion=true;
				this.inicializarActualizarBindingTablaEstadoRetencion(false);
				this.isEsNuevoEstadoRetencion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoRetencion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoRetencion(false);
				
				this.habilitarDeshabilitarControlesEstadoRetencion(false);
				
				
				
				if(EstadoRetencionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoRetencion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoRetencionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoRetencion.getRowCount()>=1) {
				jTableDatosEstadoRetencion.removeRowSelectionInterval(0, jTableDatosEstadoRetencion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoRetencion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoRetencion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoRetencion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoRetencion(false) ;
			
			this.isEsNuevoEstadoRetencion=false;
			
			if(EstadoRetencionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoRetencion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoRetencion(false);
				
				//SI ES MANUAL
				if(EstadoRetencionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoRetencion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoRetencion--;			
			//EstadoRetencion estadoretencionAux= new EstadoRetencion();			
			//estadoretencionAux.setId(this.iIdNuevoEstadoRetencion);
			
			if(this.jInternalFrameDetalleFormEstadoRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoRetencion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoRetencion(this.estadoretencion);
			
			this.estadoretencion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadoretencionLogic.getEstadoRetencions().add(this.estadoretencionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadoretencions.add(this.estadoretencionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoRetencion(false);
			
			this.jTableDatosEstadoRetencion.setRowSelectionInterval(this.getIndiceNuevoEstadoRetencion(), this.getIndiceNuevoEstadoRetencion());
			
			int iLastRow =  this.jTableDatosEstadoRetencion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoRetencion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoRetencion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoRetencion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoRetencion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoRetencion(false);
			
			//SI ES MANUAL
			if(EstadoRetencionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoRetencion();
			}
			
			//this.abrirFrameTreeEstadoRetencion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoRetencionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado RetencionS ?", "MANTENIMIENTO DE Estado Retencion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoRetencion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoRetencion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadoretencionReturnGeneral=estadoretencionLogic.procesarImportacionEstadoRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadoretencionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoRetencionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoRetencionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoRetencion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoRetencion.setFileImportacion(this.jInternalFrameImportacionEstadoRetencion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoRetencion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoRetencion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoRetencion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoRetencion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoRetencion> estadoretencionsSeleccionados=new ArrayList<EstadoRetencion>();		

		estadoretencionsSeleccionados=this.getEstadoRetencionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoRetencion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoRetencion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoRetencionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoRetencionBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoRetencions("Todos",estadoretencionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Retencion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoRetencion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoRetencion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoRetencionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoRetencionConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoRetencion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoRetencion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoRetencion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoRetencionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoRetencionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoRetencion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoRetencionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoRetencionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoRetencion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoRetencion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoRetencionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoRetencionConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoRetencionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoRetencion> estadoretencionsSeleccionados=new ArrayList<EstadoRetencion>();		
		
		estadoretencionsSeleccionados=this.getEstadoRetencionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoretencion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoRetencions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoRetencion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoRetencion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoRetencionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoRetencionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoRetencion estadoretencion:estadoretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoretencion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoRetencionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoRetencionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoRetencion estadoretencion:estadoretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoretencion.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoRetencion(row);				
			//	iRow++;
			//}				
			
			//for(EstadoRetencion estadoretencionAux:estadoretencionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoRetencion(estadoretencionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Retencion",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadoretencionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoRetencion(false);
			
			//SI ES MANUAL
			if(EstadoRetencionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoRetencion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoRetencion(false);
			
			//SI ES MANUAL
			if(EstadoRetencionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoRetencion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoRetencion(false);
			
			//SI ES MANUAL
			if(EstadoRetencionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoRetencion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoretencionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoRetencion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoRetencion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoRetencion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoRetencion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoRetencion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoRetencion.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoRetencion.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoRetencion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoRetencion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoRetencion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoRetencion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoRetencion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoRetencion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoRetencion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoRetencion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoRetencion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoRetencionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoRetencion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoRetencion();
		
		this.inicializarActualizarBindingBotonesManualEstadoRetencion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoRetencion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoRetencion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoRetencion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoRetencion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoRetencion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoRetencion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoRetencion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoRetencion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoRetencion.jCheckBoxPostAccionNuevoEstadoRetencion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoRetencion.jCheckBoxPostAccionSinCerrarEstadoRetencion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoRetencion.jCheckBoxPostAccionSinMensajeEstadoRetencion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoRetencion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoRetencion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoRetencion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoRetencion!=null) {
				this.jInternalFrameDetalleFormEstadoRetencion.jCheckBoxPostAccionNuevoEstadoRetencion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoRetencion.jCheckBoxPostAccionSinCerrarEstadoRetencion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoRetencion.jCheckBoxPostAccionSinMensajeEstadoRetencion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoRetencion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoRetencion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoRetencion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoRetencion.jComboBoxTiposAccionesFormularioEstadoRetencion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoRetencion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoRetencion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoRetencion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoRetencion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoRetencion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoRetencion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoRetencion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoRetencion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoRetencion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoRetencion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoRetencion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoRetencion(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoRetencionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoRetencion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoRetencion() throws Exception {
		try	{
			if(EstadoRetencionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoRetencion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoRetencion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoRetencion.jComboBoxTiposAccionesFormularioEstadoRetencion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoRetencion.jComboBoxTiposAccionesFormularioEstadoRetencion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoRetencion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoRetencion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoRetencion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoRetencion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoRetencion.addItem(reporte);
			}
			
			
			if(!this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoRetencion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoRetencion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoRetencion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoRetencion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoRetencion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoRetencion.jComboBoxTiposAccionesFormularioEstadoRetencion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoRetencion.jComboBoxTiposAccionesFormularioEstadoRetencion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoRetencion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoRetencion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoRetencion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoRetencion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoRetencion!=null) {
				this.jInternalFrameReporteDinamicoEstadoRetencion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoRetencion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoRetencion!=null) {
				this.jInternalFrameReporteDinamicoEstadoRetencion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoRetencion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoRetencion!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoRetencion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoRetencion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoRetencion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoRetencion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoRetencion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoRetencion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoRetencion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoRetencion(Boolean esInicializar) throws Exception {				
		if(EstadoRetencionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoRetencion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoRetencion() throws Exception {
		this.inicializarActualizarBindingTablaEstadoRetencion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoRetencion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoRetencion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoRetencion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoRetencion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoRetencionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoRetencion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoRetencion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoRetencionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoRetencionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoRetencionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoRetencionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoRetencion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoRetencion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoRetencionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoRetencion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoRetencion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadoretencionLogic.getEstadoRetencions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadoretencions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoRetencion.setModel(new EstadoRetencionModel(this.estadoretencionLogic.getEstadoRetencions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoRetencion.setModel(new EstadoRetencionModel(this.estadoretencions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoRetencion!=null && this.jInternalFrameOrderByEstadoRetencion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoRetencion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoRetencion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoRetencionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO,estadoretencionConstantesFunciones.resaltarSeleccionarEstadoRetencion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO,estadoretencionConstantesFunciones.resaltarSeleccionarEstadoRetencion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoRetencion,EstadoRetencionConstantesFunciones.LABEL_ID));

		if(this.estadoretencionConstantesFunciones.mostraridEstadoRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoRetencionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadoretencionConstantesFunciones.resaltaridEstadoRetencion,this.estadoretencionConstantesFunciones.activaridEstadoRetencion,this,true,"idEstadoRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoretencionConstantesFunciones.resaltaridEstadoRetencion,this.estadoretencionConstantesFunciones.activaridEstadoRetencion,this,true,"idEstadoRetencion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoRetencion,EstadoRetencionConstantesFunciones.LABEL_CODIGO));

		if(this.estadoretencionConstantesFunciones.mostrarcodigoEstadoRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoRetencionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoretencionConstantesFunciones.resaltarcodigoEstadoRetencion,this.estadoretencionConstantesFunciones.activarcodigoEstadoRetencion,this,true,"codigoEstadoRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoretencionConstantesFunciones.resaltarcodigoEstadoRetencion,this.estadoretencionConstantesFunciones.activarcodigoEstadoRetencion,this,true,"codigoEstadoRetencion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoRetencion,EstadoRetencionConstantesFunciones.LABEL_NOMBRE));

		if(this.estadoretencionConstantesFunciones.mostrarnombreEstadoRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoRetencionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoretencionConstantesFunciones.resaltarnombreEstadoRetencion,this.estadoretencionConstantesFunciones.activarnombreEstadoRetencion,this,true,"nombreEstadoRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoretencionConstantesFunciones.resaltarnombreEstadoRetencion,this.estadoretencionConstantesFunciones.activarnombreEstadoRetencion,this,true,"nombreEstadoRetencion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadoretencionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosClienteRetencion && this.estadoretencionConstantesFunciones.mostrarClienteRetencionEstadoRetencion && !EstadoRetencionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Retenciones");
				tableColumn.setHeaderValue("Retenciones");
				tableColumn.setCellRenderer(new ClienteRetencionTableCell(estadoretencionConstantesFunciones.resaltarClienteRetencionEstadoRetencion,this,this.estadoretencionConstantesFunciones.activarClienteRetencionEstadoRetencion));
				tableColumn.setCellEditor(new ClienteRetencionTableCell(estadoretencionConstantesFunciones.resaltarClienteRetencionEstadoRetencion,this,this.estadoretencionConstantesFunciones.activarClienteRetencionEstadoRetencion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoRetencion.addColumn(tableColumn);
			}

			if(this.isTienePermisosRetencion && this.estadoretencionConstantesFunciones.mostrarRetencionEstadoRetencion && !EstadoRetencionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Retenciones");
				tableColumn.setHeaderValue("Retenciones");
				tableColumn.setCellRenderer(new RetencionTableCell(estadoretencionConstantesFunciones.resaltarRetencionEstadoRetencion,this,this.estadoretencionConstantesFunciones.activarRetencionEstadoRetencion));
				tableColumn.setCellEditor(new RetencionTableCell(estadoretencionConstantesFunciones.resaltarRetencionEstadoRetencion,this,this.estadoretencionConstantesFunciones.activarRetencionEstadoRetencion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoRetencion.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoretencionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoretencionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoRetencion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoretencionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoretencionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoRetencion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoRetencion && this.isPermisoGuardarCambiosEstadoRetencion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadoretencionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadoretencionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoRetencion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadoretencionSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoRetencion.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoRetencion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoRetencion && this.isPermisoGuardarCambiosEstadoRetencion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadoretencionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoRetencion && this.isPermisoGuardarCambiosEstadoRetencion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoRetencion.moveColumn(this.jTableDatosEstadoRetencion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoRetencion.moveColumn(this.jTableDatosEstadoRetencion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadoretencionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoRetencion.moveColumn(this.jTableDatosEstadoRetencion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoRetencion.moveColumn(this.jTableDatosEstadoRetencion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoRetencion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoRetencion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoRetencion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoRetencion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoRetencion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoRetencion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoRetencion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoRetencion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadoretencionLogic.getEstadoRetencions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadoretencions.size()-1;
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
		//this.jTableDatosEstadoRetencion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoRetencion();
			
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
				
				//this.isEsNuevoEstadoRetencion=false;
					
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
			
				if(this.estadoretencionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoRetencion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoRetencion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoRetencion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencion =(EstadoRetencion) this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoretencion =(EstadoRetencion) this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadoretencion.getsType().equals("DUPLICADO")
				   || this.estadoretencion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoRetencion=true;
				
				} else {
					this.isEsNuevoEstadoRetencion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
					if(this.estadoretencion.getId()>=0 && !this.estadoretencion.getIsNew()) {						
						this.isEsNuevoEstadoRetencion=false;
						
					} else {
						this.isEsNuevoEstadoRetencion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoRetencion(esRelaciones);						
				
				this.seleccionarEstadoRetencion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadoretencion.getId()<0) {
					this.isEsNuevoEstadoRetencion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoRetencion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoRetencion(evt,rowIndex);
				}	
				
				if(this.estadoretencionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoRetencion: " + this.dDif); 
					}
				}								
				
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoRetencion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadoretencion)) {
					if(this.estadoretencion.getId()>0) {
						this.estadoretencion.setIsDeleted(true);
						
						this.estadoretencionsEliminados.add(this.estadoretencion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoretencionLogic.getEstadoRetencions().remove(this.estadoretencion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoretencions.remove(this.estadoretencion);				
					}
					
					
					((EstadoRetencionModel) this.jTableDatosEstadoRetencion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoRetencion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoRetencion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoRetencion) {
			
			if(this.jInternalFrameDetalleFormEstadoRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoRetencion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoRetencion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencion =(EstadoRetencion) this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoretencion =(EstadoRetencion) this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoRetencion(this.estadoretencion);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoRetencion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoRetencion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoRetencion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoRetencion(EstadoRetencion estadoretencion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoRetencion(estadoretencion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoRetencion(EstadoRetencion estadoretencion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoRetencion(estadoretencion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoRetencion(estadoretencion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoRetencion(estadoretencion);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoRetencion(EstadoRetencion estadoretencion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoRetencion.jTextFieldidEstadoRetencion.setText(estadoretencion.getId().toString());
			this.jInternalFrameDetalleFormEstadoRetencion.jTextFieldcodigoEstadoRetencion.setText(estadoretencion.getcodigo());
			this.jInternalFrameDetalleFormEstadoRetencion.jTextAreanombreEstadoRetencion.setText(estadoretencion.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoRetencion estadoretencionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadoretencionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoRetencion estadoretencionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadoretencionLocal=this.estadoretencion;
			} else {
				estadoretencionLocal=this.estadoretencionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadoretencionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoRetencion(estadoretencionLocal,true);
					
					if(estadoretencionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadoretencionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadoretencionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoRetencion(EstadoRetencion estadoretencion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoRetencion(estadoretencion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoRetencion(estadoretencion);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoRetencion(EstadoRetencion estadoretencion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoRetencion(estadoretencion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoRetencion(EstadoRetencion estadoretencion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoRetencion.jTextFieldidEstadoRetencion.getText()==null || this.jInternalFrameDetalleFormEstadoRetencion.jTextFieldidEstadoRetencion.getText()=="" || this.jInternalFrameDetalleFormEstadoRetencion.jTextFieldidEstadoRetencion.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoRetencion.jTextFieldidEstadoRetencion.setText("0");
			}

			if(conColumnasBase) {estadoretencion.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoRetencion.jTextFieldidEstadoRetencion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoRetencionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoRetencion.jLabelIdEstadoRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoretencion.setcodigo(this.jInternalFrameDetalleFormEstadoRetencion.jTextFieldcodigoEstadoRetencion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoRetencionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoRetencion.jLabelcodigoEstadoRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoretencion.setnombre(this.jInternalFrameDetalleFormEstadoRetencion.jTextAreanombreEstadoRetencion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoRetencionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoRetencion.jLabelnombreEstadoRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoRetencion(EstadoRetencion estadoretencionBean,EstadoRetencion estadoretencion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoRetencion(EstadoRetencion estadoretencionOrigen,EstadoRetencion estadoretencion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoretencionOrigen.getId()!=null && !estadoretencionOrigen.getId().equals(0L))) {estadoretencion.setId(estadoretencionOrigen.getId());}}
			if(conDefault || (!conDefault && estadoretencionOrigen.getcodigo()!=null && !estadoretencionOrigen.getcodigo().equals(""))) {estadoretencion.setcodigo(estadoretencionOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadoretencionOrigen.getnombre()!=null && !estadoretencionOrigen.getnombre().equals(""))) {estadoretencion.setnombre(estadoretencionOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoRetencion(EstadoRetencion estadoretencion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoRetencion.jTextFieldidEstadoRetencion.setText(estadoretencion.getId().toString());
			this.jInternalFrameDetalleFormEstadoRetencion.jTextFieldcodigoEstadoRetencion.setText(estadoretencion.getcodigo());
			this.jInternalFrameDetalleFormEstadoRetencion.jTextAreanombreEstadoRetencion.setText(estadoretencion.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoRetencion(EstadoRetencionBean estadoretencionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoRetencion.jTextFieldidEstadoRetencion.setText(estadoretencionBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoRetencion.jTextFieldcodigoEstadoRetencion.setText(estadoretencionBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoRetencion.jTextAreanombreEstadoRetencion.setText(estadoretencionBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoRetencion(EstadoRetencionParameterReturnGeneral estadoretencionReturnGeneral,EstadoRetencionBean estadoretencionBean,Boolean conDefault) throws Exception { 
		try {
			EstadoRetencion estadoretencionLocal=new EstadoRetencion();
			
			estadoretencionLocal=estadoretencionReturnGeneral.getEstadoRetencion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoretencionLocal.getId()!=null && !estadoretencionLocal.getId().equals(0L))) {estadoretencionBean.setId(estadoretencionLocal.getId());}}
			if(conDefault || (!conDefault && estadoretencionLocal.getcodigo()!=null && !estadoretencionLocal.getcodigo().equals(""))) {estadoretencionBean.setcodigo(estadoretencionLocal.getcodigo());}
			if(conDefault || (!conDefault && estadoretencionLocal.getnombre()!=null && !estadoretencionLocal.getnombre().equals(""))) {estadoretencionBean.setnombre(estadoretencionLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoRetencionGenerico(Long idEstadoRetencionSeleccionado,JComboBox jComboBoxEstadoRetencion,List<EstadoRetencion> estadoretencionsLocal)throws Exception {
		try {
			EstadoRetencion  estadoretencionTemp=null;

			for(EstadoRetencion estadoretencionAux:estadoretencionsLocal) {
				if(estadoretencionAux.getId()!=null && estadoretencionAux.getId().equals(idEstadoRetencionSeleccionado)) {
					estadoretencionTemp=estadoretencionAux;
					break;
				}
			}

			jComboBoxEstadoRetencion.setSelectedItem(estadoretencionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoRetencionGenerico(JComboBox jComboBoxEstadoRetencion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoRetencion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoRetencion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoRetencion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoRetencion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ClienteRetencion")) {
			jButtonClienteRetencionActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Retencion")) {
			jButtonRetencionActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoretencion=(EstadoRetencion) estadoretencionLogic.getEstadoRetencions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoretencion =(EstadoRetencion) estadoretencions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoRetencion estadoretencionRow=new EstadoRetencion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoretencionRow=(EstadoRetencion) estadoretencionLogic.getEstadoRetencions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoretencionRow=(EstadoRetencion) estadoretencions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonClienteRetencionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoRetencion estadoretencion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoRetencion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoretencion = (EstadoRetencion)this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadoretencion = (EstadoRetencion)this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadoretencion!=null) {
						this.estadoretencion = estadoretencion;
					} else {
						this.estadoretencion = new EstadoRetencion();
					}
				}

				if(this.isTienePermisosClienteRetencion && this.permiteMantenimiento(this.estadoretencion)) {
					ClienteRetencionBeanSwingJInternalFrame clienteretencionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFramePopup=new ClienteRetencionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						clienteretencionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFramePopup;
					} else {
						clienteretencionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame;
					}

					List<EstadoRetencion> estadoretencions=new ArrayList<EstadoRetencion>();
					estadoretencions.add(this.estadoretencion);
					if(!esRelacionado) {
						//clienteretencionBeanSwingJInternalFrame.clienteretencionSessionBean.setConGuardarRelaciones(false);
						//clienteretencionBeanSwingJInternalFrame.clienteretencionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					clienteretencionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoRetencion.cargarClienteRetencionBeanSwingJInternalFrame(estadoretencions,this.estadoretencion,clienteretencionBeanSwingJInternalFrame,/*conInicializar,*/clienteretencionBeanSwingJInternalFrame.clienteretencionSessionBean.getConGuardarRelaciones(),clienteretencionBeanSwingJInternalFrame.clienteretencionSessionBean.getEsGuardarRelacionado());
					clienteretencionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						clienteretencionBeanSwingJInternalFrame.actualizarEstadoPanelsClienteRetencion("no_relacionado");

						clienteretencionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ClienteRetencionConstantesFunciones.ITAMANIOFILATABLA + (ClienteRetencionConstantesFunciones.ITAMANIOFILATABLA/2));

						clienteretencionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoRetencion=(TitledBorder)this.jScrollPanelDatosEstadoRetencion.getBorder();
						TitledBorder titledBorderClienteRetencion=(TitledBorder)clienteretencionBeanSwingJInternalFrame.jScrollPanelDatosClienteRetencion.getBorder();

						titledBorderClienteRetencion.setTitle(titledBorderEstadoRetencion.getTitle() + " -> Retencion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,clienteretencionBeanSwingJInternalFrame);
						}

						clienteretencionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(clienteretencionBeanSwingJInternalFrame);

						clienteretencionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadoretencionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Retencion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonRetencionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoRetencion estadoretencion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoRetencion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoretencion = (EstadoRetencion)this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadoretencion = (EstadoRetencion)this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadoretencion!=null) {
						this.estadoretencion = estadoretencion;
					} else {
						this.estadoretencion = new EstadoRetencion();
					}
				}

				if(this.isTienePermisosRetencion && this.permiteMantenimiento(this.estadoretencion)) {
					RetencionBeanSwingJInternalFrame retencionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFramePopup=new RetencionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						retencionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFramePopup;
					} else {
						retencionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame;
					}

					List<EstadoRetencion> estadoretencions=new ArrayList<EstadoRetencion>();
					estadoretencions.add(this.estadoretencion);
					if(!esRelacionado) {
						//retencionBeanSwingJInternalFrame.retencionSessionBean.setConGuardarRelaciones(false);
						//retencionBeanSwingJInternalFrame.retencionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					retencionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoRetencion.cargarRetencionBeanSwingJInternalFrame(estadoretencions,this.estadoretencion,retencionBeanSwingJInternalFrame,/*conInicializar,*/retencionBeanSwingJInternalFrame.retencionSessionBean.getConGuardarRelaciones(),retencionBeanSwingJInternalFrame.retencionSessionBean.getEsGuardarRelacionado());
					retencionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						retencionBeanSwingJInternalFrame.actualizarEstadoPanelsRetencion("no_relacionado");

						retencionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(RetencionConstantesFunciones.ITAMANIOFILATABLA + (RetencionConstantesFunciones.ITAMANIOFILATABLA/2));

						retencionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoRetencion=(TitledBorder)this.jScrollPanelDatosEstadoRetencion.getBorder();
						TitledBorder titledBorderRetencion=(TitledBorder)retencionBeanSwingJInternalFrame.jScrollPanelDatosRetencion.getBorder();

						titledBorderRetencion.setTitle(titledBorderEstadoRetencion.getTitle() + " -> Retencion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,retencionBeanSwingJInternalFrame);
						}

						retencionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(retencionBeanSwingJInternalFrame);

						retencionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadoretencionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Retencion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoRetencion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoRetencion.setVisible((this.isVisibilidadCeldaNuevoEstadoRetencion && this.isPermisoNuevoEstadoRetencion));			
			this.jButtonDuplicarEstadoRetencion.setVisible((this.isVisibilidadCeldaDuplicarEstadoRetencion && this.isPermisoDuplicarEstadoRetencion));			
			this.jButtonCopiarEstadoRetencion.setVisible((this.isVisibilidadCeldaCopiarEstadoRetencion && this.isPermisoCopiarEstadoRetencion));
			this.jButtonVerFormEstadoRetencion.setVisible((this.isVisibilidadCeldaVerFormEstadoRetencion && this.isPermisoVerFormEstadoRetencion));
			
			this.jButtonAbrirOrderByEstadoRetencion.setVisible((this.isVisibilidadCeldaOrdenEstadoRetencion && this.isPermisoOrdenEstadoRetencion));			
			
			this.jButtonNuevoRelacionesEstadoRetencion.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoRetencion && this.isPermisoNuevoEstadoRetencion));			
			this.jButtonNuevoGuardarCambiosEstadoRetencion.setVisible((this.isVisibilidadCeldaNuevoEstadoRetencion && this.isPermisoNuevoEstadoRetencion && this.isPermisoGuardarCambiosEstadoRetencion));
			
			if(this.jInternalFrameDetalleFormEstadoRetencion!=null) {
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonModificarEstadoRetencion.setVisible((this.isVisibilidadCeldaModificarEstadoRetencion && this.isPermisoActualizarEstadoRetencion));	
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonActualizarEstadoRetencion.setVisible((this.isVisibilidadCeldaActualizarEstadoRetencion && this.isPermisoActualizarEstadoRetencion));	
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonEliminarEstadoRetencion.setVisible((this.isVisibilidadCeldaEliminarEstadoRetencion && this.isPermisoEliminarEstadoRetencion));
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonCancelarEstadoRetencion.setVisible(this.isVisibilidadCeldaCancelarEstadoRetencion);							
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonGuardarCambiosEstadoRetencion.setVisible((this.isVisibilidadCeldaGuardarEstadoRetencion && this.isPermisoGuardarCambiosEstadoRetencion));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoRetencion.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoRetencion && this.isPermisoGuardarCambiosEstadoRetencion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoRetencion.setVisible((this.isVisibilidadCeldaNuevoEstadoRetencion && this.isPermisoNuevoEstadoRetencion));						
			this.jButtonDuplicarToolBarEstadoRetencion.setVisible((this.isVisibilidadCeldaDuplicarEstadoRetencion && this.isPermisoDuplicarEstadoRetencion));						
			this.jButtonCopiarToolBarEstadoRetencion.setVisible((this.isVisibilidadCeldaCopiarEstadoRetencion && this.isPermisoCopiarEstadoRetencion));			
			this.jButtonVerFormToolBarEstadoRetencion.setVisible((this.isVisibilidadCeldaVerFormEstadoRetencion && this.isPermisoVerFormEstadoRetencion));			
			this.jButtonAbrirOrderByToolBarEstadoRetencion.setVisible((this.isVisibilidadCeldaOrdenEstadoRetencion && this.isPermisoOrdenEstadoRetencion));
			this.jButtonNuevoRelacionesToolBarEstadoRetencion.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoRetencion && this.isPermisoNuevoEstadoRetencion));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoRetencion.setVisible((this.isVisibilidadCeldaNuevoEstadoRetencion && this.isPermisoNuevoEstadoRetencion && this.isPermisoGuardarCambiosEstadoRetencion));			
			
			if(this.jInternalFrameDetalleFormEstadoRetencion!=null) {
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonModificarToolBarEstadoRetencion.setVisible((this.isVisibilidadCeldaModificarEstadoRetencion && this.isPermisoActualizarEstadoRetencion));	
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonActualizarToolBarEstadoRetencion.setVisible((this.isVisibilidadCeldaActualizarEstadoRetencion  && this.isPermisoActualizarEstadoRetencion));	
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonEliminarToolBarEstadoRetencion.setVisible((this.isVisibilidadCeldaEliminarEstadoRetencion && this.isPermisoEliminarEstadoRetencion));
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonCancelarToolBarEstadoRetencion.setVisible(this.isVisibilidadCeldaCancelarEstadoRetencion);				
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonGuardarCambiosToolBarEstadoRetencion.setVisible((this.isVisibilidadCeldaGuardarEstadoRetencion && this.isPermisoGuardarCambiosEstadoRetencion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoRetencion.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoRetencion && this.isPermisoGuardarCambiosEstadoRetencion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoRetencion.setVisible((this.isVisibilidadCeldaNuevoEstadoRetencion && this.isPermisoNuevoEstadoRetencion));			
			this.jMenuItemDuplicarEstadoRetencion.setVisible((this.isVisibilidadCeldaDuplicarEstadoRetencion && this.isPermisoDuplicarEstadoRetencion));			
			this.jMenuItemCopiarEstadoRetencion.setVisible((this.isVisibilidadCeldaCopiarEstadoRetencion && this.isPermisoCopiarEstadoRetencion));			
			this.jMenuItemVerFormEstadoRetencion.setVisible((this.isVisibilidadCeldaVerFormEstadoRetencion && this.isPermisoVerFormEstadoRetencion));			
			this.jMenuItemAbrirOrderByEstadoRetencion.setVisible((this.isVisibilidadCeldaOrdenEstadoRetencion && this.isPermisoOrdenEstadoRetencion));			
			//this.jMenuItemMostrarOcultarEstadoRetencion.setVisible((this.isVisibilidadCeldaOrdenEstadoRetencion && this.isPermisoOrdenEstadoRetencion));
			this.jMenuItemDetalleAbrirOrderByEstadoRetencion.setVisible((this.isVisibilidadCeldaOrdenEstadoRetencion && this.isPermisoOrdenEstadoRetencion));			
			//this.jMenuItemDetalleMostrarOcultarEstadoRetencion.setVisible((this.isVisibilidadCeldaOrdenEstadoRetencion && this.isPermisoOrdenEstadoRetencion));			
			this.jMenuItemNuevoRelacionesEstadoRetencion.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoRetencion && this.isPermisoNuevoEstadoRetencion));			
			this.jMenuItemNuevoGuardarCambiosEstadoRetencion.setVisible((this.isVisibilidadCeldaNuevoEstadoRetencion && this.isPermisoNuevoEstadoRetencion && this.isPermisoGuardarCambiosEstadoRetencion));									
			
			if(this.jInternalFrameDetalleFormEstadoRetencion!=null) {
			this.jInternalFrameDetalleFormEstadoRetencion.jMenuItemModificarEstadoRetencion.setVisible((this.isVisibilidadCeldaModificarEstadoRetencion && this.isPermisoActualizarEstadoRetencion));	
			this.jInternalFrameDetalleFormEstadoRetencion.jMenuItemActualizarEstadoRetencion.setVisible((this.isVisibilidadCeldaActualizarEstadoRetencion && this.isPermisoActualizarEstadoRetencion));	
			this.jInternalFrameDetalleFormEstadoRetencion.jMenuItemEliminarEstadoRetencion.setVisible((this.isVisibilidadCeldaEliminarEstadoRetencion && this.isPermisoEliminarEstadoRetencion));
			this.jInternalFrameDetalleFormEstadoRetencion.jMenuItemCancelarEstadoRetencion.setVisible(this.isVisibilidadCeldaCancelarEstadoRetencion);				
			}
			
			this.jMenuItemGuardarCambiosEstadoRetencion.setVisible((this.isVisibilidadCeldaGuardarEstadoRetencion && this.isPermisoGuardarCambiosEstadoRetencion));						
			this.jMenuItemGuardarCambiosTablaEstadoRetencion.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoRetencion && this.isPermisoGuardarCambiosEstadoRetencion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoRetencion=this.jButtonNuevoEstadoRetencion.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoRetencion=this.jButtonDuplicarEstadoRetencion.isVisible();
			this.isVisibilidadCeldaCopiarEstadoRetencion=this.jButtonCopiarEstadoRetencion.isVisible();
			this.isVisibilidadCeldaVerFormEstadoRetencion=this.jButtonVerFormEstadoRetencion.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoRetencion=this.jButtonAbrirOrderByEstadoRetencion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoRetencion=this.jButtonNuevoRelacionesEstadoRetencion.isVisible();
			this.isVisibilidadCeldaModificarEstadoRetencion=this.jButtonModificarEstadoRetencion.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoRetencion!=null) {
			this.isVisibilidadCeldaActualizarEstadoRetencion=this.jInternalFrameDetalleFormEstadoRetencion.jButtonActualizarEstadoRetencion.isVisible();
			this.isVisibilidadCeldaEliminarEstadoRetencion=this.jInternalFrameDetalleFormEstadoRetencion.jButtonEliminarEstadoRetencion.isVisible();
			this.isVisibilidadCeldaCancelarEstadoRetencion=this.jInternalFrameDetalleFormEstadoRetencion.jButtonCancelarEstadoRetencion.isVisible();
			this.isVisibilidadCeldaGuardarEstadoRetencion=this.jInternalFrameDetalleFormEstadoRetencion.jButtonGuardarCambiosEstadoRetencion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoRetencion=this.jButtonGuardarCambiosTablaEstadoRetencion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoRetencion=this.jButtonNuevoToolBarEstadoRetencion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoRetencion=this.jButtonNuevoRelacionesToolBarEstadoRetencion.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoRetencion!=null) {
			this.isVisibilidadCeldaModificarEstadoRetencion=this.jInternalFrameDetalleFormEstadoRetencion.jButtonModificarToolBarEstadoRetencion.isVisible();
			this.isVisibilidadCeldaActualizarEstadoRetencion=this.jInternalFrameDetalleFormEstadoRetencion.jButtonActualizarToolBarEstadoRetencion.isVisible();
			this.isVisibilidadCeldaEliminarEstadoRetencion=this.jInternalFrameDetalleFormEstadoRetencion.jButtonEliminarToolBarEstadoRetencion.isVisible();
			this.isVisibilidadCeldaCancelarEstadoRetencion=this.jInternalFrameDetalleFormEstadoRetencion.jButtonCancelarToolBarEstadoRetencion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoRetencion=this.jButtonGuardarCambiosToolBarEstadoRetencion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoRetencion=this.jButtonGuardarCambiosTablaToolBarEstadoRetencion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoRetencion=this.jMenuItemNuevoEstadoRetencion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoRetencion=this.jMenuItemNuevoRelacionesEstadoRetencion.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoRetencion!=null) {
			this.isVisibilidadCeldaModificarEstadoRetencion=this.jInternalFrameDetalleFormEstadoRetencion.jMenuItemModificarEstadoRetencion.isVisible();
			this.isVisibilidadCeldaActualizarEstadoRetencion=this.jInternalFrameDetalleFormEstadoRetencion.jMenuItemActualizarEstadoRetencion.isVisible();
			this.isVisibilidadCeldaEliminarEstadoRetencion=this.jInternalFrameDetalleFormEstadoRetencion.jMenuItemEliminarEstadoRetencion.isVisible();
			this.isVisibilidadCeldaCancelarEstadoRetencion=this.jInternalFrameDetalleFormEstadoRetencion.jMenuItemCancelarEstadoRetencion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoRetencion=this.jMenuItemGuardarCambiosEstadoRetencion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoRetencion=this.jMenuItemGuardarCambiosTablaEstadoRetencion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoRetencion(Boolean esInicializar) {
		if(EstadoRetencionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadoretencionSessionBean.getConGuardarRelaciones()) {
				//if(this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoRetencion();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoRetencion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoRetencion() {
		this.jButtonNuevoEstadoRetencion.setVisible(this.isPermisoNuevoEstadoRetencion);			
		this.jButtonDuplicarEstadoRetencion.setVisible(this.isPermisoDuplicarEstadoRetencion);			
		this.jButtonCopiarEstadoRetencion.setVisible(this.isPermisoCopiarEstadoRetencion);			
		this.jButtonVerFormEstadoRetencion.setVisible(this.isPermisoVerFormEstadoRetencion);			
		
		this.jButtonAbrirOrderByEstadoRetencion.setVisible(this.isPermisoOrdenEstadoRetencion);					
		
		this.jButtonNuevoRelacionesEstadoRetencion.setVisible(this.isPermisoNuevoEstadoRetencion);			
		
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonModificarEstadoRetencion.setVisible(this.isPermisoActualizarEstadoRetencion);	
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonActualizarEstadoRetencion.setVisible(this.isPermisoActualizarEstadoRetencion);	
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonEliminarEstadoRetencion.setVisible(this.isPermisoEliminarEstadoRetencion);
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonCancelarEstadoRetencion.setVisible(this.isVisibilidadCeldaCancelarEstadoRetencion);						
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonGuardarCambiosEstadoRetencion.setVisible(this.isPermisoGuardarCambiosEstadoRetencion);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoRetencion.setVisible(this.isPermisoActualizarEstadoRetencion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoRetencion() {
		this.jInternalFrameDetalleFormEstadoRetencion.jButtonModificarEstadoRetencion.setVisible(this.isPermisoActualizarEstadoRetencion);	
		this.jInternalFrameDetalleFormEstadoRetencion.jButtonActualizarEstadoRetencion.setVisible(this.isPermisoActualizarEstadoRetencion);	
		this.jInternalFrameDetalleFormEstadoRetencion.jButtonEliminarEstadoRetencion.setVisible(this.isPermisoEliminarEstadoRetencion);
		this.jInternalFrameDetalleFormEstadoRetencion.jButtonCancelarEstadoRetencion.setVisible(this.isVisibilidadCeldaCancelarEstadoRetencion);							
		this.jInternalFrameDetalleFormEstadoRetencion.jButtonGuardarCambiosEstadoRetencion.setVisible((this.isVisibilidadCeldaGuardarEstadoRetencion && this.isPermisoGuardarCambiosEstadoRetencion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoRetencion() {
		if(EstadoRetencionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoRetencion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoRetencion() {
	}
	
	public void jTableDatosEstadoRetencionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoRetencion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoRetencion(this.getestadoretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRetencion(this.estadoretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoretencion =(EstadoRetencion) this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoretencion =(EstadoRetencion) this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoretencion==null) {
						this.estadoretencion = new EstadoRetencion();
					}

					this.setVariablesFormularioToObjetoActualEstadoRetencion(this.estadoretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRetencion(this.estadoretencion);
				}

				if(this.estadoretencion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadoretencion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoRetencion(this.getestadoretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRetencion(this.estadoretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoretencion =(EstadoRetencion) this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoretencion =(EstadoRetencion) this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoretencion==null) {
						this.estadoretencion = new EstadoRetencion();
					}

					this.setVariablesFormularioToObjetoActualEstadoRetencion(this.estadoretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRetencion(this.estadoretencion);
				}

				if(this.estadoretencion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadoretencion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoRetencion(this.getestadoretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRetencion(this.estadoretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoretencion =(EstadoRetencion) this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoretencion =(EstadoRetencion) this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoretencion==null) {
						this.estadoretencion = new EstadoRetencion();
					}

					this.setVariablesFormularioToObjetoActualEstadoRetencion(this.estadoretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRetencion(this.estadoretencion);
				}

				if(this.estadoretencion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadoretencion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoRetencion() {
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) {
			this.jInternalFrameDetalleFormEstadoRetencion.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoRetencion.dispose();
			this.jInternalFrameDetalleFormEstadoRetencion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoRetencion!=null) {
			this.jInternalFrameReporteDinamicoEstadoRetencion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoRetencion.dispose();
			this.jInternalFrameReporteDinamicoEstadoRetencion=null;
		}
		
		if(this.jInternalFrameImportacionEstadoRetencion!=null) {
			this.jInternalFrameImportacionEstadoRetencion.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoRetencion.dispose();
			this.jInternalFrameImportacionEstadoRetencion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoRetencion();
			
			EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoRetencion")) {
				jButtonNuevoEstadoRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoRetencion")) {
				jButtonDuplicarEstadoRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoRetencion")) {
				jButtonCopiarEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoRetencion")) {
				jButtonVerFormEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoRetencion")) {
				jButtonNuevoEstadoRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoRetencion")) {
				jButtonDuplicarEstadoRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoRetencion")) {
				jButtonNuevoEstadoRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoRetencion")) {
				jButtonDuplicarEstadoRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoRetencion")) {
				jButtonNuevoEstadoRetencionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoRetencion")) {
				jButtonNuevoEstadoRetencionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoRetencion")) {
				jButtonNuevoEstadoRetencionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoRetencion")) {
				jButtonModificarEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoRetencion")) {
				jButtonModificarEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoRetencion")) {
				jButtonModificarEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoRetencion")) {
				jButtonActualizarEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoRetencion")) {
				jButtonActualizarEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoRetencion")) {
				jButtonActualizarEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoRetencion")) {
				jButtonEliminarEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoRetencion")) {
				jButtonEliminarEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoRetencion")) {
				jButtonEliminarEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoRetencion")) {
				jButtonCancelarEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoRetencion")) {
				jButtonCancelarEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoRetencion")) {
				jButtonCancelarEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoRetencion")) {
				jButtonCerrarEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoRetencion")) {
				jButtonCerrarEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoRetencion")) {
				jButtonCerrarEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoRetencion")) {
				jButtonMostrarOcultarEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoRetencion")) {
				jButtonCancelarEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoRetencion")) {
				jButtonGuardarCambiosEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoRetencion")) {
				jButtonGuardarCambiosEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoRetencion")) {
				jButtonCopiarEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoRetencion")) {
				jButtonVerFormEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoRetencion")) {
				jButtonGuardarCambiosEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoRetencion")) {
				jButtonCopiarEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoRetencion")) {
				jButtonVerFormEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoRetencion")) {
				jButtonGuardarCambiosEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoRetencion")) {
				jButtonGuardarCambiosEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoRetencion")) {
				jButtonGuardarCambiosEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoRetencion")) {
				jButtonRecargarInformacionEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoRetencion")) {
				jButtonRecargarInformacionEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoRetencion")) {
				jButtonRecargarInformacionEstadoRetencionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoRetencion")) {
				jButtonAnterioresEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoRetencion")) {
				jButtonAnterioresEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoRetencion")) {
				jButtonAnterioresEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoRetencion")) {
				jButtonSiguientesEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoRetencion")) {
				jButtonSiguientesEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoRetencion")) {
				jButtonSiguientesEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoRetencion") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoRetencion")) {
				jButtonAbrirOrderByEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoRetencion") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoRetencion")) {
				jButtonMostrarOcultarEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoRetencion")) {
				jButtonNuevoGuardarCambiosEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoRetencion")) {
				jButtonNuevoGuardarCambiosEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoRetencion")) {
				jButtonNuevoGuardarCambiosEstadoRetencionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoRetencion")) {
				jButtonCerrarReporteDinamicoEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoRetencion")) {
				jButtonGenerarReporteDinamicoEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoRetencion")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoRetencion")) {
				jButtonCerrarImportacionEstadoRetencionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoRetencion")) {
				
				jButtonGenerarImportacionEstadoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoRetencion")) {
				
				jButtonAbrirImportacionEstadoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoRetencion")) {
				jComboBoxTiposAccionesEstadoRetencionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoRetencion")) {
				jComboBoxTiposRelacionesEstadoRetencionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoRetencion")) {
				jComboBoxTiposAccionesEstadoRetencionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoRetencion")) {
				
				jComboBoxTiposSeleccionarEstadoRetencionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoRetencion")) {
				jTextFieldValorCampoGeneralEstadoRetencionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoRetencion")) {
				jButtonAbrirOrderByEstadoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoRetencion")) {
				jButtonAbrirOrderByEstadoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoRetencion")) {
				jButtonCerrarOrderByEstadoRetencionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoRetencionBusqueda")) {
				this.jButtonidEstadoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoRetencionBusqueda")) {
				this.jButtoncodigoEstadoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoRetencionBusqueda")) {
				this.jButtonnombreEstadoRetencionBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoRetencion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRetencionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoretencion);
				
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
				
				


				
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoRetencion estadoretencionLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadoretencionLocal=this.estadoretencion;
			} else {
				estadoretencionLocal=this.estadoretencionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoretencion);
				
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
							
				
				


				
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionAnterior =(EstadoRetencion) this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoretencionAnterior =(EstadoRetencion) this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
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
			
			EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
			
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
			
			


			
			EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRetencionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoretencion);
				
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
								
						
				


				
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRetencion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoretencion);
				
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
								
				
				


				
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionAnterior =(EstadoRetencion) this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoretencionAnterior =(EstadoRetencion) this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoretencion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionAnterior =(EstadoRetencion) this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoretencionAnterior =(EstadoRetencion) this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRetencionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoretencion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoretencion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoretencion);
				
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
							
				
				


				
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRetencion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRetencionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoRetencion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoretencionAnterior =(EstadoRetencion) this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoretencionAnterior =(EstadoRetencion) this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
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
			
			EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
			
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
			
			


			
			EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRetencionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoretencion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoretencion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoretencion);
				
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
								
				
				


				
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionAnterior =(EstadoRetencion) this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoretencionAnterior =(EstadoRetencion) this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRetencionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoretencion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoretencion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRetencionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoretencion);
				
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoRetencion")) {
					jCheckBoxSeleccionarTodosEstadoRetencionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoRetencion")) {
					jCheckBoxSeleccionadosEstadoRetencionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoRetencion")) {
					
				}
				
				


				
				
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoretencion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadoretencion);
				
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
												
				
				


				
				
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRetencionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoRetencion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoretencionAnterior =(EstadoRetencion) this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoretencionAnterior =(EstadoRetencion) this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRetencionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoretencion);
				
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
				
				
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
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
			
			EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
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
			
			


			
			EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRetencionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoretencion);
				
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRetencion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRetencion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoretencion);
				
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
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
				
				


				
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRetencion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoretencionAnterior =(EstadoRetencion) this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoretencionAnterior =(EstadoRetencion) this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoRetencion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoRetencionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoRetencion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadoretencion =(EstadoRetencion) this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadoretencion =(EstadoRetencion) this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadoretencion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoRetencion")) {
				
				}
				
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoRetencion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoRetencion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoRetencion")) {
			
			}
			
			EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoRetencion();
			
			EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoRetencion")) {
				jButtonNuevoEstadoRetencionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoRetencion")) {
				jButtonDuplicarEstadoRetencionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoRetencion")) {
				jButtonCopiarEstadoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoRetencion")) {
				jButtonVerFormEstadoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoRetencion")) {
				jButtonNuevoEstadoRetencionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoRetencion")) {
				jButtonModificarEstadoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoRetencion")) {
				jButtonActualizarEstadoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoRetencion")) {
				jButtonEliminarEstadoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoRetencion")) {
				jButtonGuardarCambiosEstadoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoRetencion")) {
				jButtonCancelarEstadoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoRetencion")) {
				jButtonCerrarEstadoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoRetencion")) {
				jButtonGuardarCambiosEstadoRetencionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoRetencion")) {
				jButtonNuevoGuardarCambiosEstadoRetencionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoRetencion")) {
				jButtonAbrirOrderByEstadoRetencionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoRetencion")) {
				jButtonRecargarInformacionEstadoRetencionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoRetencion")) {
				jButtonAnterioresEstadoRetencionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoRetencion")) {
				jButtonSiguientesEstadoRetencionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoRetencionBusqueda")) {
				this.jButtonidEstadoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoRetencionBusqueda")) {
				this.jButtoncodigoEstadoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoRetencionBusqueda")) {
				this.jButtonnombreEstadoRetencionBusquedaActionPerformed(evt);
			}
			
			EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoRetencion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoRetencion")) {
				closingInternalFrameEstadoRetencion();
				
			} else if(sTipo.equals("jButtonCancelarEstadoRetencion")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoRetencion = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoRetencionBeanSwingJInternalFrame jInternalFrameParent=(EstadoRetencionBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoRetencion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoRetencionActionPerformed(null);
			}
			
			EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoretencion,new Object(),this.estadoretencionParameterGeneral,this.estadoretencionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoRetencion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoRetencion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoRetencion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadoretencion)) {
			if(!esControlTabla) {
				if(EstadoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoRetencion(this.estadoretencion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRetencion(this.estadoretencion);			
				}
				
				if(this.estadoretencionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoRetencion(this.estadoretencion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoretencionReturnGeneral=estadoretencionLogic.procesarEventosEstadoRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoretencionLogic.getEstadoRetencions(),this.estadoretencion,this.estadoretencionParameterGeneral,this.isEsNuevoEstadoRetencion,classes);//this.estadoretencionLogic.getEstadoRetencion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoRetencion(this.estadoretencionReturnGeneral,this.estadoretencionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadoretencionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoRetencion(classes,this.estadoretencionReturnGeneral,this.estadoretencionBean,false);
					}
						
					if(this.estadoretencionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoRetencion(this.estadoretencionReturnGeneral.getEstadoRetencion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoRetencion(this.estadoretencionReturnGeneral.getEstadoRetencion());	
					}
						
					if(this.estadoretencionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoRetencion(this.estadoretencionReturnGeneral.getEstadoRetencion(),classes);//this.estadoretencionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoRetencion(this.estadoretencion,classes);//this.estadoretencionBean);									
				}
			
				if(EstadoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoRetencion(this.estadoretencion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRetencion(this.estadoretencion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadoretencionAnterior!=null) {
						this.estadoretencion=this.estadoretencionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoretencionReturnGeneral=estadoretencionLogic.procesarEventosEstadoRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoretencionLogic.getEstadoRetencions(),this.estadoretencion,this.estadoretencionParameterGeneral,this.isEsNuevoEstadoRetencion,classes);//this.estadoretencionLogic.getEstadoRetencion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoretencionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoretencionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadoretencionReturnGeneral.getEstadoRetencion(),estadoretencionLogic.getEstadoRetencions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadoretencionReturnGeneral.getEstadoRetencion(),this.estadoretencions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoRetencion.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoRetencion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoRetencion();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoRetencion() throws Exception {
		
		EstadoRetencionModel estadoretencionModel=(EstadoRetencionModel)this.jTableDatosEstadoRetencion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoretencionModel.estadoretencions=this.estadoretencionLogic.getEstadoRetencions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadoretencionModel.estadoretencions=this.estadoretencions;
		}
		
		
		((EstadoRetencionModel) this.jTableDatosEstadoRetencion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoRetencion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadoretencionAnterior(),this.estadoretencionLogic.getEstadoRetencions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadoretencionAnterior(),this.estadoretencions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoRetencion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoRetencion(EstadoRetencion estadoretencion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ClienteRetencion.class)) {
					this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame.clienteretencionLogic.setClienteRetencions(estadoretencion.getClienteRetencions());
					this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame.inicializarActualizarBindingTablaClienteRetencion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Retencion.class)) {
					this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame.retencionLogic.setRetencions(estadoretencion.getRetencions());
					this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame.inicializarActualizarBindingTablaRetencion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
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
										
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoretencion,new Object(),generalEntityParameterGeneral,this.estadoretencionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadoretencionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoRetencionConstantesFunciones.getClassesRelationshipsOfEstadoRetencion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoRetencionConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoRetencion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoRetencion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoretencion,new Object(),generalEntityParameterGeneral,this.estadoretencionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoRetencion(EstadoRetencionBean estadoretencionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ClienteRetencion.class)) {
					this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame.clienteretencionLogic.setClienteRetencions(estadoretencion.getClienteRetencions());
					this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame.inicializarActualizarBindingTablaClienteRetencion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Retencion.class)) {
					this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame.retencionLogic.setRetencions(estadoretencion.getRetencions());
					this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame.inicializarActualizarBindingTablaRetencion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoRetencion(ArrayList<Classe> classes,EstadoRetencionReturnGeneral estadoretencionReturnGeneral,EstadoRetencionBean estadoretencionBean,Boolean conDefault) throws Exception {
		
			this.estadoretencionBean.setClienteRetencions(estadoretencionReturnGeneral.getEstadoRetencion().getClienteRetencions());
			this.estadoretencionBean.setRetencions(estadoretencionReturnGeneral.getEstadoRetencion().getRetencions());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoRetencion(EstadoRetencion estadoretencion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ClienteRetencion.class)) {
					estadoretencion.setClienteRetencions(this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionBeanSwingJInternalFrame.clienteretencionLogic.getClienteRetencions());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Retencion.class)) {
					estadoretencion.setRetencions(this.jInternalFrameDetalleFormEstadoRetencion.retencionBeanSwingJInternalFrame.retencionLogic.getRetencions());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadoretencion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoRetencion = new EstadoRetencionDetalleFormJInternalFrame(jDesktopPane,this.estadoretencionSessionBean.getConGuardarRelaciones(),this.estadoretencionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoRetencion);
		this.jInternalFrameDetalleFormEstadoRetencion.setVisible(false);
		this.jInternalFrameDetalleFormEstadoRetencion.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoRetencion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoRetencion.estadoretencionLogic=this.estadoretencionLogic;
		
		this.cargarCombosFrameForeignKeyEstadoRetencion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoRetencion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoRetencion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoRetencion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoRetencion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoRetencion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoRetencion"));
		
		this.jInternalFrameDetalleFormEstadoRetencion.jButtonModificarEstadoRetencion.addActionListener(new ButtonActionListener(this,"ModificarEstadoRetencion"));

		
		this.jInternalFrameDetalleFormEstadoRetencion.jButtonModificarToolBarEstadoRetencion.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoRetencion"));
					
		this.jInternalFrameDetalleFormEstadoRetencion.jMenuItemModificarEstadoRetencion.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoRetencion"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoRetencion.jButtonActualizarEstadoRetencion.addActionListener (new ButtonActionListener(this,"ActualizarEstadoRetencion"));
		
		
		this.jInternalFrameDetalleFormEstadoRetencion.jButtonActualizarToolBarEstadoRetencion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoRetencion"));
						
		this.jInternalFrameDetalleFormEstadoRetencion.jMenuItemActualizarEstadoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoRetencion"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoRetencion.jButtonEliminarEstadoRetencion.addActionListener (new ButtonActionListener(this,"EliminarEstadoRetencion"));
		
		
		this.jInternalFrameDetalleFormEstadoRetencion.jButtonEliminarToolBarEstadoRetencion.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoRetencion"));
								
		this.jInternalFrameDetalleFormEstadoRetencion.jMenuItemEliminarEstadoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoRetencion"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoRetencion.jButtonCancelarEstadoRetencion.addActionListener (new ButtonActionListener(this,"CancelarEstadoRetencion"));
		
		
		this.jInternalFrameDetalleFormEstadoRetencion.jButtonCancelarToolBarEstadoRetencion.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoRetencion"));
					
		this.jInternalFrameDetalleFormEstadoRetencion.jMenuItemCancelarEstadoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoRetencion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoRetencion.jMenuItemDetalleCerrarEstadoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoRetencion"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoRetencion.jButtonGuardarCambiosToolBarEstadoRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoRetencion"));
		
		
		
		this.jInternalFrameDetalleFormEstadoRetencion.jButtonGuardarCambiosToolBarEstadoRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoRetencion"));
		
		
		
		this.jInternalFrameDetalleFormEstadoRetencion.jComboBoxTiposAccionesFormularioEstadoRetencion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoRetencion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRetencion.jButtonidEstadoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRetencion.jButtoncodigoEstadoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRetencion.jButtonnombreEstadoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoRetencionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoRetencion.jTabbedPaneRelacionesEstadoRetencion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoRetencion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoRetencion"));
		
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRetencion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoRetencion"));
		}
		
		this.jTableDatosEstadoRetencion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoRetencion"));
		
		this.jTableDatosEstadoRetencion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoRetencion"));
		
		this.jButtonNuevoEstadoRetencion.addActionListener(new ButtonActionListener(this,"NuevoEstadoRetencion"));
		
		this.jButtonDuplicarEstadoRetencion.addActionListener(new ButtonActionListener(this,"DuplicarEstadoRetencion"));
		
		this.jButtonCopiarEstadoRetencion.addActionListener(new ButtonActionListener(this,"CopiarEstadoRetencion"));
		
		this.jButtonVerFormEstadoRetencion.addActionListener(new ButtonActionListener(this,"VerFormEstadoRetencion"));
		
		
		this.jButtonNuevoToolBarEstadoRetencion.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoRetencion"));
			
		this.jButtonDuplicarToolBarEstadoRetencion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoRetencion"));
			
		this.jMenuItemNuevoEstadoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoRetencion"));
			
		this.jMenuItemDuplicarEstadoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoRetencion"));		
		
		
		this.jButtonNuevoRelacionesEstadoRetencion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoRetencion"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoRetencion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoRetencion"));
			
		this.jMenuItemNuevoRelacionesEstadoRetencion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoRetencion"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonModificarEstadoRetencion.addActionListener(new ButtonActionListener(this,"ModificarEstadoRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonModificarToolBarEstadoRetencion.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoRetencion"));
			
			this.jInternalFrameDetalleFormEstadoRetencion.jMenuItemModificarEstadoRetencion.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoRetencion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonActualizarEstadoRetencion.addActionListener (new ButtonActionListener(this,"ActualizarEstadoRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonActualizarToolBarEstadoRetencion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoRetencion"));
				
			this.jInternalFrameDetalleFormEstadoRetencion.jMenuItemActualizarEstadoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoRetencion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonEliminarEstadoRetencion.addActionListener (new ButtonActionListener(this,"EliminarEstadoRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonEliminarToolBarEstadoRetencion.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoRetencion"));
						
			this.jInternalFrameDetalleFormEstadoRetencion.jMenuItemEliminarEstadoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoRetencion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonCancelarEstadoRetencion.addActionListener (new ButtonActionListener(this,"CancelarEstadoRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonCancelarToolBarEstadoRetencion.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoRetencion"));
			
			this.jInternalFrameDetalleFormEstadoRetencion.jMenuItemCancelarEstadoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoRetencion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoRetencion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoRetencion"));		
		
		
		this.jButtonCerrarEstadoRetencion.addActionListener (new ButtonActionListener(this,"CerrarEstadoRetencion"));
		
		
		this.jButtonCerrarToolBarEstadoRetencion.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoRetencion"));
			
		this.jMenuItemCerrarEstadoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoRetencion"));
			
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRetencion.jMenuItemDetalleCerrarEstadoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoRetencion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonGuardarCambiosEstadoRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRetencion.jButtonGuardarCambiosToolBarEstadoRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoRetencion"));
		}
		
		this.jButtonCopiarToolBarEstadoRetencion.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoRetencion"));
			
		this.jButtonVerFormToolBarEstadoRetencion.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoRetencion"));
		
		this.jMenuItemGuardarCambiosEstadoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoRetencion"));
			
		this.jMenuItemCopiarEstadoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoRetencion"));		
		
		this.jMenuItemVerFormEstadoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoRetencion"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoRetencion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoRetencion"));
			
		this.jMenuItemGuardarCambiosTablaEstadoRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoRetencion"));		
		
		
		
		this.jButtonRecargarInformacionEstadoRetencion.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoRetencion"));
					
		this.jButtonRecargarInformacionToolBarEstadoRetencion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoRetencion"));
		
		this.jMenuItemRecargarInformacionEstadoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoRetencion"));		
		
		
		
		this.jButtonAnterioresEstadoRetencion.addActionListener (new ButtonActionListener(this,"AnterioresEstadoRetencion"));
		
		
		this.jButtonAnterioresToolBarEstadoRetencion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoRetencion"));
		
		this.jMenuItemAnterioresEstadoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoRetencion"));		
		
		
		this.jButtonSiguientesEstadoRetencion.addActionListener (new ButtonActionListener(this,"SiguientesEstadoRetencion"));
		
		
		this.jButtonSiguientesToolBarEstadoRetencion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoRetencion"));
			
		this.jMenuItemSiguientesEstadoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoRetencion"));
			
		this.jMenuItemAbrirOrderByEstadoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoRetencion"));
			
		this.jMenuItemMostrarOcultarEstadoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoRetencion"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoRetencion"));
			
		this.jMenuItemDetalleMostarOcultarEstadoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoRetencion"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoRetencion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoRetencion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoRetencion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoRetencion"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoRetencion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoRetencion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoRetencion"));

		this.jCheckBoxSeleccionadosEstadoRetencion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoRetencion"));
		
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRetencion.jComboBoxTiposAccionesFormularioEstadoRetencion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoRetencion"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoRetencion.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoRetencion"));
			
		this.jComboBoxTiposAccionesEstadoRetencion.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoRetencion"));
					
		this.jComboBoxTiposSeleccionarEstadoRetencion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoRetencion"));
			
		this.jTextFieldValorCampoGeneralEstadoRetencion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoRetencion"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRetencion.jButtonidEstadoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRetencion.jButtoncodigoEstadoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRetencion.jButtonnombreEstadoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoRetencionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoRetencion!=null) {
				this.jInternalFrameReporteDinamicoEstadoRetencion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoRetencion"));
				this.jInternalFrameReporteDinamicoEstadoRetencion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoRetencion"));
				this.jInternalFrameReporteDinamicoEstadoRetencion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoRetencion"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoRetencion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoRetencion"));				
			//this.jButtonGenerarReporteDinamicoEstadoRetencion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoRetencion"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoRetencion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoRetencion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoRetencion!=null) {
				this.jInternalFrameImportacionEstadoRetencion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoRetencion"));
				this.jInternalFrameImportacionEstadoRetencion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoRetencion"));
				this.jInternalFrameImportacionEstadoRetencion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoRetencion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoRetencion.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoRetencion"));
			
			this.jButtonAbrirOrderByToolBarEstadoRetencion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoRetencion"));			
			
			if(this.jInternalFrameOrderByEstadoRetencion!=null) {
				this.jInternalFrameOrderByEstadoRetencion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoRetencion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoRetencion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRetencion.jTabbedPaneRelacionesEstadoRetencion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoRetencion"));
		
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
            		closingInternalFrameEstadoRetencion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoRetencion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoRetencion = (JInternalFrameBase)event.getSource();
	            	
	            EstadoRetencionBeanSwingJInternalFrame jInternalFrameParent=(EstadoRetencionBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoRetencion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoRetencionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoRetencion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoRetencionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoRetencion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoRetencion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoRetencionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoRetencionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoRetencionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoRetencion";
		inputMap = this.jButtonNuevoEstadoRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoRetencionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoRetencionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoRetencionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoRetencionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoRetencion";
		inputMap = this.jButtonNuevoRelacionesEstadoRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoRetencionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoRetencion";
		inputMap = this.jButtonModificarEstadoRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoRetencion";
		inputMap = this.jButtonActualizarEstadoRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoRetencion";
		inputMap = this.jButtonEliminarEstadoRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoRetencion";
		inputMap = this.jButtonCancelarEstadoRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoRetencion";
		inputMap = this.jButtonCerrarEstadoRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoRetencion.jButtonGuardarCambiosEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoRetencion";
		inputMap = this.jInternalFrameDetalleFormEstadoRetencion.jButtonGuardarCambiosEstadoRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoRetencion.jButtonGuardarCambiosEstadoRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoRetencion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoRetencionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoRetencion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoRetencionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoRetencion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoRetencionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoRetencion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoRetencionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRetencion.jButtonidEstadoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRetencion.jButtoncodigoEstadoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRetencion.jButtonnombreEstadoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoRetencionBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoRetencionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoRetencion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoRetencion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoRetencion estadoretencionAux:this.estadoretencionLogic.getEstadoRetencions()) {
					estadoretencionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoRetencion estadoretencionAux:estadoretencions) {
					estadoretencionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoRetencionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoRetencion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoRetencion estadoretencionAux:this.estadoretencionLogic.getEstadoRetencions()) {
						estadoretencionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoRetencion estadoretencionAux:estadoretencions) {
						estadoretencionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoRetencion estadoretencionAux:this.estadoretencionLogic.getEstadoRetencions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoRetencion estadoretencionAux:estadoretencions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoRetencion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoRetencion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoRetencion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoRetencion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoRetencionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoRetencion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoRetencion.getSelectedRows();
			
			EstadoRetencion estadoretencionLocal=new EstadoRetencion();
			
			//this.seleccionarTodosEstadoRetencion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoretencionLocal =(EstadoRetencion) this.estadoretencionLogic.getEstadoRetencions().toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadoretencionLocal =(EstadoRetencion) this.estadoretencions.toArray()[this.jTableDatosEstadoRetencion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadoretencionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoRetencion estadoretencionAux:this.estadoretencionLogic.getEstadoRetencions()) {
						estadoretencionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoRetencion estadoretencionAux:estadoretencions) {
						estadoretencionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoRetencion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoRetencion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoRetencion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoRetencion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoRetencionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoRetencionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoRetencionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoRetencion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoRetencion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoRetencion estadoretencionAux:this.estadoretencionLogic.getEstadoRetencions()) {
				
						if(sTipoSeleccionar.equals(EstadoRetencionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoretencionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoRetencionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoretencionAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoRetencion estadoretencionAux:estadoretencions) {
					
						if(sTipoSeleccionar.equals(EstadoRetencionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoretencionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoRetencionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoretencionAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoRetencion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoRetencionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoRetencion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoRetencion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoRetencion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoRetencion.jComboBoxTiposAccionesFormularioEstadoRetencion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoRetencion) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoRetencion(conSplash);
				
					this.generarReporteEstadoRetencionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoRetencion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoRetencion.jComboBoxTiposAccionesFormularioEstadoRetencion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoRetencionsSeleccionados();
				//this.jComboBoxTiposAccionesEstadoRetencion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoRetencionsSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoRetencion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoRetencionsSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoRetencion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoRetencion();
				
				this.exportarEstadoRetencionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoRetencion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoRetencion.jComboBoxTiposAccionesFormularioEstadoRetencion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoRetencions();
				//this.importarEstadoRetencions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoRetencion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoRetencion.jComboBoxTiposAccionesFormularioEstadoRetencion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoRetencion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoRetencionsSeleccionados();
				//this.jComboBoxTiposAccionesEstadoRetencion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Retencion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoRetencion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoRetencion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoRetencion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Retencion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoRetencion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoRetencion.jComboBoxTiposAccionesFormularioEstadoRetencion.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoRetencion();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoRetencion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoRetencionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoRetencion();
			
			if(this.jInternalFrameDetalleFormEstadoRetencion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoRetencion> estadoretencionsSeleccionados=new ArrayList<EstadoRetencion>();		
			EstadoRetencion estadoretencion=new EstadoRetencion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoRetencion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoRetencion.getSelectedItem();
			
			
			
			
			estadoretencionsSeleccionados=this.getEstadoRetencionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadoretencionsSeleccionados.size()==1) {
				for(EstadoRetencion estadoretencionAux:estadoretencionsSeleccionados) {
					estadoretencion=estadoretencionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Retencion")) {
					jButtonClienteRetencionActionPerformed(null,rowIndex,true,false,estadoretencion);
				}
				else if(this.sTipoRelacion.equals("Retencion")) {
					jButtonRetencionActionPerformed(null,rowIndex,true,false,estadoretencion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoRetencion();
			
      		//this.finishProcessEstadoRetencion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoRetencionReturnGeneral() throws Exception {
		if(this.estadoretencionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadoretencionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadoretencionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadoretencionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadoretencionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadoretencionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoRetencion(false);
		}
		
		if(this.estadoretencionReturnGeneral.getConRetornoLista() || this.estadoretencionReturnGeneral.getConRetornoObjeto()) {
			if(this.estadoretencionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoretencionLogic.setEstadoRetencions(this.estadoretencionReturnGeneral.getEstadoRetencions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadoretencionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoretencionLogic.setEstadoRetencion(this.estadoretencionReturnGeneral.getEstadoRetencion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoRetencion(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoRetencion() throws Exception {
		
		
	}
	
	public ArrayList<EstadoRetencion> getEstadoRetencionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoRetencion> estadoretencionsSeleccionados=new ArrayList<EstadoRetencion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoRetencion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoRetencion estadoretencionAux:estadoretencionLogic.getEstadoRetencions()) {
					if(estadoretencionAux.getIsSelected()) {
						estadoretencionsSeleccionados.add(estadoretencionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoRetencion estadoretencionAux:this.estadoretencions) {
					if(estadoretencionAux.getIsSelected()) {
						estadoretencionsSeleccionados.add(estadoretencionAux);				
					}
				}
			}
			
			if(estadoretencionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadoretencionsSeleccionados.addAll(this.estadoretencionLogic.getEstadoRetencions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadoretencionsSeleccionados.addAll(this.estadoretencions);				
					}
				}
			}
		} else {
			estadoretencionsSeleccionados.add(this.estadoretencion);
		}
		
		return estadoretencionsSeleccionados;
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
	
	public void generarReporteEstadoRetencionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoRetencionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoRetencionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoRetencionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoRetencionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoRetencionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Retencion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoRetencionsSeleccionados() throws Exception {
		ArrayList<EstadoRetencion> estadoretencionsSeleccionados=new ArrayList<EstadoRetencion>();		
		
		estadoretencionsSeleccionados=this.getEstadoRetencionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoRetencions("Todos",estadoretencionsSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoRetencionsSeleccionados() throws Exception {
		ArrayList<EstadoRetencion> estadoretencionsSeleccionados=new ArrayList<EstadoRetencion>();		
		
		estadoretencionsSeleccionados=this.getEstadoRetencionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoRetencions("Todos",estadoretencionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoRetencionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoRetencion> estadoretencionsSeleccionados=new ArrayList<EstadoRetencion>();
		
		estadoretencionsSeleccionados=this.getEstadoRetencionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoRetencions("Todos",estadoretencionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoRetencionsSeleccionados() throws Exception {
		ArrayList<EstadoRetencion> estadoretencionsSeleccionados=new ArrayList<EstadoRetencion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoRetencion();
		
		
		estadoretencionsSeleccionados=this.getEstadoRetencionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoRetencion();
		
		
		//this.generarReporteEstadoRetencions("Todos",estadoretencionsSeleccionados ,estadoretencionImplementable,estadoretencionImplementableHome);
	}
	
	public void mostrarImportacionEstadoRetencions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoRetencion();
		
		this.abrirFrameImportacionEstadoRetencion();		
		
			
		//this.generarReporteEstadoRetencions("Todos",estadoretencionsSeleccionados ,estadoretencionImplementable,estadoretencionImplementableHome);
	}
	
	public void importarEstadoRetencions() throws Exception {		
	
	}
	
	public void exportarEstadoRetencionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoRetencionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoRetencionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoRetencionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Retencion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoRetencionsSeleccionados() throws Exception {
		ArrayList<EstadoRetencion> estadoretencionsSeleccionados=new ArrayList<EstadoRetencion>();		
		
		estadoretencionsSeleccionados=this.getEstadoRetencionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoretencion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoRetencion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoRetencion estadoretencionAux:estadoretencionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoRetencion(estadoretencionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadoretencionAux.setsDetalleGeneralEntityReporte(estadoretencionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Retencion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoRetencion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoRetencionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoRetencionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoRetencionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoRetencionConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoRetencion(EstadoRetencion estadoretencion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadoretencion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoretencion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoretencion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoretencion.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoRetencionsSeleccionados() throws Exception {
		ArrayList<EstadoRetencion> estadoretencionsSeleccionados=new ArrayList<EstadoRetencion>();		
		
		estadoretencionsSeleccionados=this.getEstadoRetencionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoretencion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoRetencions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoRetencion(row);				
				iRow++;
			}				
			
			for(EstadoRetencion estadoretencionAux:estadoretencionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoRetencion(estadoretencionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Retencion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoRetencionsSeleccionados() throws Exception {
		ArrayList<EstadoRetencion> estadoretencionsSeleccionados=new ArrayList<EstadoRetencion>();		
		
		estadoretencionsSeleccionados=this.getEstadoRetencionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoretencion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadoretencions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadoretencion");
			//elementRoot.appendChild(element);
		
			for(EstadoRetencion estadoretencionAux:estadoretencionsSeleccionados) {
				element = document.createElement("estadoretencion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoRetencion(estadoretencionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Retencion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoRetencion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoRetencionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoRetencionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoRetencionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoRetencionConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoRetencion(EstadoRetencion estadoretencion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadoretencion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoretencion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoretencion.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoRetencion(EstadoRetencion estadoretencion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoRetencionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadoretencion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoRetencionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadoretencion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoRetencionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadoretencion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoRetencionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadoretencion.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoRetencionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoRetencion> estadoretencionsSeleccionados=new ArrayList<EstadoRetencion>();
		
		estadoretencionsSeleccionados=this.getEstadoRetencionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoRetencion(estadoretencionsSeleccionados);
		
		this.generarReporteEstadoRetencions("Todos",estadoretencionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoRetencion(ArrayList<EstadoRetencion> estadoretencionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoRetencion estadoretencionAux:estadoretencionsSeleccionados) {
				estadoretencionAux.setsDetalleGeneralEntityReporte(estadoretencionAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoRetencionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadoretencionAux.setsDescripcionGeneralEntityReporte1(estadoretencionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoRetencionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadoretencionAux.setsDescripcionGeneralEntityReporte1(estadoretencionAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoRetencion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoRetencion=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoRetencion=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoRetencion=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoRetencion=false;
			this.isVisibilidadCeldaActualizarEstadoRetencion=false;
			this.isVisibilidadCeldaEliminarEstadoRetencion=false;
			this.isVisibilidadCeldaCancelarEstadoRetencion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRetencion=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRetencion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRetencion=false;
			this.isVisibilidadCeldaModificarEstadoRetencion=false;
			this.isVisibilidadCeldaActualizarEstadoRetencion=true;
			this.isVisibilidadCeldaEliminarEstadoRetencion=false;
			this.isVisibilidadCeldaCancelarEstadoRetencion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRetencion=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRetencion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRetencion=false;
			this.isVisibilidadCeldaModificarEstadoRetencion=false;
			this.isVisibilidadCeldaActualizarEstadoRetencion=true;
			this.isVisibilidadCeldaEliminarEstadoRetencion=true;
			this.isVisibilidadCeldaCancelarEstadoRetencion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRetencion=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRetencion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRetencion=false;
			this.isVisibilidadCeldaModificarEstadoRetencion=false;
			this.isVisibilidadCeldaActualizarEstadoRetencion=true;
			this.isVisibilidadCeldaEliminarEstadoRetencion=false;
			this.isVisibilidadCeldaCancelarEstadoRetencion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRetencion=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRetencion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoRetencion=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRetencion=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoRetencion=true;
			this.isVisibilidadCeldaModificarEstadoRetencion=false;
			this.isVisibilidadCeldaActualizarEstadoRetencion=false;
			this.isVisibilidadCeldaEliminarEstadoRetencion=false;
			this.isVisibilidadCeldaCancelarEstadoRetencion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRetencion=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRetencion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRetencion=false;
			this.isVisibilidadCeldaActualizarEstadoRetencion=false;
			this.isVisibilidadCeldaEliminarEstadoRetencion=false;
			this.isVisibilidadCeldaCancelarEstadoRetencion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRetencion=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRetencion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRetencion=false;
			this.isVisibilidadCeldaModificarEstadoRetencion=true;
			this.isVisibilidadCeldaActualizarEstadoRetencion=false;
			this.isVisibilidadCeldaEliminarEstadoRetencion=false;
			this.isVisibilidadCeldaCancelarEstadoRetencion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRetencion=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRetencion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoRetencionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoRetencion=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRetencion=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoRetencion=true;
		} else {
			this.actualizarEstadoPanelsEstadoRetencion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoRetencion=false;
			//this.isVisibilidadCeldaVerFormEstadoRetencion=false;
			this.isVisibilidadCeldaDuplicarEstadoRetencion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadoretencionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoRetencion=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRetencion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadoretencionSessionBean.getEsGuardarRelacionado()) {
			if(!estadoretencionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoRetencion=false;												
			}
			
			this.jButtonCerrarEstadoRetencion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoRetencion=false;
		}
		
		if(!this.permiteMantenimiento(this.estadoretencion)) {
			this.isVisibilidadCeldaActualizarEstadoRetencion=false;
			this.isVisibilidadCeldaEliminarEstadoRetencion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoRetencion() {
		this.isVisibilidadCeldaNuevoEstadoRetencion=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoRetencion=false;
	}
	
	public void actualizarEstadoPanelsEstadoRetencion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoRetencion!=null) {
				this.jScrollPanelDatosEdicionEstadoRetencion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoRetencion!=null) {
				this.jScrollPanelDatosEstadoRetencion.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoRetencion!=null) {
				this.jPanelPaginacionEstadoRetencion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoRetencion!=null) {
				this.jPanelParametrosReportesEstadoRetencion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoRetencion!=null) {
				this.jScrollPanelDatosEdicionEstadoRetencion.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoRetencion!=null) {
				this.jScrollPanelDatosEstadoRetencion.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoRetencion!=null) {
				this.jPanelPaginacionEstadoRetencion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoRetencion!=null) {
				this.jPanelParametrosReportesEstadoRetencion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoRetencion!=null) {
				this.jScrollPanelDatosEdicionEstadoRetencion.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoRetencion!=null) {
				this.jScrollPanelDatosEstadoRetencion.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoRetencion!=null) {
				this.jPanelPaginacionEstadoRetencion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoRetencion!=null) {
				this.jPanelParametrosReportesEstadoRetencion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoRetencion!=null) {
				this.jScrollPanelDatosEdicionEstadoRetencion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoRetencion!=null) {
				this.jScrollPanelDatosEstadoRetencion.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoRetencion!=null) {
				this.jPanelPaginacionEstadoRetencion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoRetencion!=null) {
				this.jPanelParametrosReportesEstadoRetencion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoRetencion!=null) {
				this.jScrollPanelDatosEdicionEstadoRetencion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoRetencion!=null) {
				this.jScrollPanelDatosEstadoRetencion.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoRetencion!=null) {
				this.jPanelPaginacionEstadoRetencion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoRetencion!=null) {
				this.jPanelParametrosReportesEstadoRetencion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoRetencion!=null) {
				this.jScrollPanelDatosEdicionEstadoRetencion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoRetencion!=null) {
				this.jScrollPanelDatosEstadoRetencion.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoRetencion!=null) {
				this.jPanelPaginacionEstadoRetencion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoRetencion!=null) {
				this.jPanelParametrosReportesEstadoRetencion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoRetencion!=null) {
				this.jScrollPanelDatosEdicionEstadoRetencion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoRetencion!=null) {
				this.jScrollPanelDatosEstadoRetencion.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoRetencion!=null) {
				this.jPanelPaginacionEstadoRetencion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoRetencion!=null) {
				this.jPanelParametrosReportesEstadoRetencion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoRetencionParaClienteRetenciones() throws Exception {
		Boolean isPaginaPopupClienteRetencion=false;

		try {

			if(this.estadoretencionSessionBean==null) {
				this.estadoretencionSessionBean=new EstadoRetencionSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionSessionBean=new ClienteRetencionSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionSessionBean.setsPathNavegacionActual(estadoretencionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupClienteRetencion=this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeClienteRetencion(true);
			this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeClienteRetencion(EstadoRetencionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionSessionBean.setisBusquedaDesdeForeignKeySesionEstadoRetencion(true);
			this.jInternalFrameDetalleFormEstadoRetencion.clienteretencionSessionBean.setlidEstadoRetencionActual(this.idEstadoRetencionActual);

			estadoretencionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoRetencion(true);
			estadoretencionSessionBean.setlIdEstadoRetencionActualForeignKey(this.idEstadoRetencionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionEstadoRetencionParaRetenciones() throws Exception {
		Boolean isPaginaPopupRetencion=false;

		try {

			if(this.estadoretencionSessionBean==null) {
				this.estadoretencionSessionBean=new EstadoRetencionSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoRetencion.retencionSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoRetencion.retencionSessionBean=new RetencionSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoRetencion.retencionSessionBean.setsPathNavegacionActual(estadoretencionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+RetencionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoRetencion.retencionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupRetencion=this.jInternalFrameDetalleFormEstadoRetencion.retencionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoRetencion.retencionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeRetencion(true);
			this.jInternalFrameDetalleFormEstadoRetencion.retencionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeRetencion(EstadoRetencionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoRetencion.retencionSessionBean.setisBusquedaDesdeForeignKeySesionEstadoRetencion(true);
			this.jInternalFrameDetalleFormEstadoRetencion.retencionSessionBean.setlidEstadoRetencionActual(this.idEstadoRetencionActual);

			estadoretencionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoRetencion(true);
			estadoretencionSessionBean.setlIdEstadoRetencionActualForeignKey(this.idEstadoRetencionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoRetencionSessionBean estadoretencionSessionBean=new EstadoRetencionSessionBean();
		
		if(this.estadoretencionSessionBean==null) {
			this.estadoretencionSessionBean=new EstadoRetencionSessionBean();
		}
		
		this.estadoretencionSessionBean.setsUltimaBusquedaEstadoRetencion(this.getsAccionBusqueda());
		this.estadoretencionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadoretencionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoRetencionSessionBean estadoretencionSessionBean=new EstadoRetencionSessionBean();
		
		if(this.estadoretencionSessionBean==null) {
			this.estadoretencionSessionBean=new EstadoRetencionSessionBean();
		}
		
		if(this.estadoretencionSessionBean.getsUltimaBusquedaEstadoRetencion()!=null&&!this.estadoretencionSessionBean.getsUltimaBusquedaEstadoRetencion().equals("")) {
			this.setsAccionBusqueda(estadoretencionSessionBean.getsUltimaBusquedaEstadoRetencion());
			this.setiNumeroPaginacion(estadoretencionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadoretencionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadoretencionSessionBean.setsUltimaBusquedaEstadoRetencion("");
		this.estadoretencionSessionBean.setiNumeroPaginacion(EstadoRetencionConstantesFunciones.INUMEROPAGINACION);
		this.estadoretencionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoRetencion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoRetencion() {
		this.updateBorderResaltarBusquedasFormularioEstadoRetencion();
		this.updateVisibilidadBusquedasFormularioEstadoRetencion();
		this.updateHabilitarBusquedasFormularioEstadoRetencion();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoRetencion() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoRetencion() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoRetencion() {
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
	
	public void updateControlesFormularioEstadoRetencion() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoRetencion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoRetencion();
		this.updateVisibilidadResaltarControlesFormularioEstadoRetencion();
		this.updateHabilitarResaltarControlesFormularioEstadoRetencion();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoRetencion() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoRetencion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadoretencionConstantesFunciones.resaltaridEstadoRetencion!=null && this.jInternalFrameDetalleFormEstadoRetencion!=null) {this.jInternalFrameDetalleFormEstadoRetencion.jTextFieldidEstadoRetencion.setBorder(this.estadoretencionConstantesFunciones.resaltaridEstadoRetencion);}
		if(this.estadoretencionConstantesFunciones.resaltarcodigoEstadoRetencion!=null && this.jInternalFrameDetalleFormEstadoRetencion!=null) {this.jInternalFrameDetalleFormEstadoRetencion.jTextFieldcodigoEstadoRetencion.setBorder(this.estadoretencionConstantesFunciones.resaltarcodigoEstadoRetencion);}
		if(this.estadoretencionConstantesFunciones.resaltarnombreEstadoRetencion!=null && this.jInternalFrameDetalleFormEstadoRetencion!=null) {this.jInternalFrameDetalleFormEstadoRetencion.jTextAreanombreEstadoRetencion.setBorder(this.estadoretencionConstantesFunciones.resaltarnombreEstadoRetencion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoRetencion() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoRetencion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) {
	
		//this.jInternalFrameDetalleFormEstadoRetencion.jTextFieldidEstadoRetencion.setVisible(this.estadoretencionConstantesFunciones.mostraridEstadoRetencion);
		this.jInternalFrameDetalleFormEstadoRetencion.jPanelidEstadoRetencion.setVisible(this.estadoretencionConstantesFunciones.mostraridEstadoRetencion);
		//this.jInternalFrameDetalleFormEstadoRetencion.jTextFieldcodigoEstadoRetencion.setVisible(this.estadoretencionConstantesFunciones.mostrarcodigoEstadoRetencion);
		this.jInternalFrameDetalleFormEstadoRetencion.jPanelcodigoEstadoRetencion.setVisible(this.estadoretencionConstantesFunciones.mostrarcodigoEstadoRetencion);
		//this.jInternalFrameDetalleFormEstadoRetencion.jTextAreanombreEstadoRetencion.setVisible(this.estadoretencionConstantesFunciones.mostrarnombreEstadoRetencion);
		this.jInternalFrameDetalleFormEstadoRetencion.jPanelnombreEstadoRetencion.setVisible(this.estadoretencionConstantesFunciones.mostrarnombreEstadoRetencion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoRetencion() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoRetencion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoRetencion!=null) {
	
		this.jInternalFrameDetalleFormEstadoRetencion.jTextFieldidEstadoRetencion.setEnabled(this.estadoretencionConstantesFunciones.activaridEstadoRetencion);
		this.jInternalFrameDetalleFormEstadoRetencion.jTextFieldcodigoEstadoRetencion.setEnabled(this.estadoretencionConstantesFunciones.activarcodigoEstadoRetencion);
		this.jInternalFrameDetalleFormEstadoRetencion.jTextAreanombreEstadoRetencion.setEnabled(this.estadoretencionConstantesFunciones.activarnombreEstadoRetencion);
		}
	}
	
		
}