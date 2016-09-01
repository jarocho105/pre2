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

import com.bydan.erp.facturacion.util.FacturacionConstantesFunciones;
import com.bydan.erp.facturacion.util.FacturacionParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.FacturacionParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.FacturacionBean;
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


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
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




@SuppressWarnings("unused")
public class FacturacionBeanSwingJInternalFrame extends FacturacionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(FacturacionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Facturacion> facturacionValidator = new ClassValidator<Facturacion>(Facturacion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Facturacion facturacion;	
	public Facturacion facturacionAux;
	public Facturacion facturacionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Facturacion facturacionTotales;
	public Long idFacturacionActual;
	public Long iIdNuevoFacturacion=0L;
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
	
	public Boolean isPermisoTodoFacturacion;
	public Boolean isPermisoNuevoFacturacion;
	public Boolean isPermisoActualizarFacturacion;
	public Boolean isPermisoActualizarOriginalFacturacion;
	public Boolean isPermisoEliminarFacturacion;
	public Boolean isPermisoGuardarCambiosFacturacion;
	public Boolean isPermisoConsultaFacturacion;
	public Boolean isPermisoBusquedaFacturacion;
	public Boolean isPermisoReporteFacturacion;
	public Boolean isPermisoPaginacionMedioFacturacion;
	public Boolean isPermisoPaginacionAltoFacturacion;
	public Boolean isPermisoPaginacionTodoFacturacion;
	public Boolean isPermisoCopiarFacturacion;
	public Boolean isPermisoVerFormFacturacion;
	public Boolean isPermisoDuplicarFacturacion;
	public Boolean isPermisoOrdenFacturacion;
	
	
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
	
	public FacturacionParameterReturnGeneral facturacionReturnGeneral;
	public FacturacionParameterReturnGeneral facturacionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoFacturacion=false;
	public Boolean esParaAccionDesdeFormularioFacturacion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected FacturacionSessionBeanAdditional facturacionSessionBeanAdditional=null;
	
	public FacturacionSessionBeanAdditional getFacturacionSessionBeanAdditional() {
		return this.facturacionSessionBeanAdditional;
	}
	
	public void setFacturacionSessionBeanAdditional(FacturacionSessionBeanAdditional facturacionSessionBeanAdditional) {
		try {
			this.facturacionSessionBeanAdditional=facturacionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected FacturacionBeanSwingJInternalFrameAdditional facturacionBeanSwingJInternalFrameAdditional=null;
	//public class FacturacionBeanSwingJInternalFrame
	
	public FacturacionBeanSwingJInternalFrameAdditional getFacturacionBeanSwingJInternalFrameAdditional() {
		return this.facturacionBeanSwingJInternalFrameAdditional;
	}
	
	public void setFacturacionBeanSwingJInternalFrameAdditional(FacturacionBeanSwingJInternalFrameAdditional facturacionBeanSwingJInternalFrameAdditional) {
		try {
			this.facturacionBeanSwingJInternalFrameAdditional=facturacionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public FacturacionLogic facturacionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Facturacion facturacionBean;
	public FacturacionConstantesFunciones facturacionConstantesFunciones;
	//public FacturacionParameterReturnGeneral facturacionReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<Facturacion> facturacions;	
	//public List<Facturacion> facturacionsEliminados;
	//public List<Facturacion> facturacionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoFacturacion=false;
	public Boolean isVisibilidadCeldaDuplicarFacturacion=true;
	public Boolean isVisibilidadCeldaCopiarFacturacion=true;
	public Boolean isVisibilidadCeldaVerFormFacturacion=true;
	public Boolean isVisibilidadCeldaOrdenFacturacion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesFacturacion=false;
	public Boolean isVisibilidadCeldaModificarFacturacion=false;
	public Boolean isVisibilidadCeldaActualizarFacturacion=false;
	public Boolean isVisibilidadCeldaEliminarFacturacion=false;
	public Boolean isVisibilidadCeldaCancelarFacturacion=false;
	public Boolean isVisibilidadCeldaGuardarFacturacion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosFacturacion=false;	
	
	
	
	public Long getiIdNuevoFacturacion() {
		return this.iIdNuevoFacturacion;
	}

	public void setiIdNuevoFacturacion(Long iIdNuevoFacturacion) {
		this.iIdNuevoFacturacion = iIdNuevoFacturacion;
	}
	
	public Long getidFacturacionActual() {
		return this.idFacturacionActual;
	}

	public void setidFacturacionActual(Long idFacturacionActual) {
		this.idFacturacionActual = idFacturacionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Facturacion getfacturacion() {
		return this.facturacion;
	}

	public void setfacturacion(Facturacion facturacion) {
		this.facturacion = facturacion;
	}
	
	public Facturacion getfacturacionAux() {
		return this.facturacionAux;
	}

	public void setfacturacionAux(Facturacion facturacionAux) {
		this.facturacionAux = facturacionAux;
	}				
	
	public Facturacion getfacturacionAnterior() {
		return this.facturacionAnterior;
	}

	public void setfacturacionAnterior(Facturacion facturacionAnterior) {
		this.facturacionAnterior = facturacionAnterior;
	}	
	
	public Facturacion getfacturacionTotales() {
		return this.facturacionTotales;
	}

	public void setfacturacionTotales(Facturacion facturacionTotales) {
		this.facturacionTotales = facturacionTotales;
	}	
	
	public Facturacion getfacturacionBean() {
		return this.facturacionBean;
	}

	public void setfacturacionBean(Facturacion facturacionBean) {
		this.facturacionBean = facturacionBean;
	}	
	
	public FacturacionParameterReturnGeneral getfacturacionReturnGeneral() {
		return this.facturacionReturnGeneral;
	}

	public void setfacturacionReturnGeneral(FacturacionParameterReturnGeneral facturacionReturnGeneral) {
		this.facturacionReturnGeneral = facturacionReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public FacturacionLogic getFacturacionLogic()	{		
		return facturacionLogic;
	}

	public void setFacturacionLogic(FacturacionLogic facturacionLogic) {
		this.facturacionLogic = facturacionLogic;
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
	
	public Boolean getIsEsNuevoFacturacion() {
		return isEsNuevoFacturacion;
	}

	public void setIsEsNuevoFacturacion(Boolean isEsNuevoFacturacion) {
		this.isEsNuevoFacturacion = isEsNuevoFacturacion;
	}

	public Boolean getEsParaAccionDesdeFormularioFacturacion() {
		return esParaAccionDesdeFormularioFacturacion;
	}
	
	public void setEsParaAccionDesdeFormularioFacturacion(Boolean esParaAccionDesdeFormularioFacturacion) {
		this.esParaAccionDesdeFormularioFacturacion = esParaAccionDesdeFormularioFacturacion;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesFacturacion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			FacturacionConstantesFunciones.refrescarForeignKeysDescripcionesFacturacion(this.facturacionLogic.getFacturacions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			FacturacionConstantesFunciones.refrescarForeignKeysDescripcionesFacturacion(this.facturacions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//facturacionLogic.setFacturacions(this.facturacions);
			facturacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public FacturacionParameterReturnGeneral getFacturacionParameterGeneral() {
		return this.facturacionParameterGeneral;
	}
	
	public void setFacturacionParameterGeneral(FacturacionParameterReturnGeneral facturacionParameterGeneral) {
		this.facturacionParameterGeneral = facturacionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoFacturacion() {
		return isPermisoTodoFacturacion;
	}

	public void setIsPermisoTodoFacturacion(Boolean isPermisoTodoFacturacion) {
		this.isPermisoTodoFacturacion = isPermisoTodoFacturacion;
	}

	public Boolean getIsPermisoNuevoFacturacion() {
		return isPermisoNuevoFacturacion;
	}

	public void setIsPermisoNuevoFacturacion(Boolean isPermisoNuevoFacturacion) {
		this.isPermisoNuevoFacturacion = isPermisoNuevoFacturacion;
	}

	public Boolean getIsPermisoActualizarFacturacion() {
		return isPermisoActualizarFacturacion;
	}

	public void setIsPermisoActualizarFacturacion(Boolean isPermisoActualizarFacturacion) {
		this.isPermisoActualizarFacturacion = isPermisoActualizarFacturacion;
	}

	public Boolean getIsPermisoEliminarFacturacion() {
		return isPermisoEliminarFacturacion;
	}

	public void setIsPermisoEliminarFacturacion(Boolean isPermisoEliminarFacturacion) {
		this.isPermisoEliminarFacturacion = isPermisoEliminarFacturacion;
	}

	public Boolean getIsPermisoGuardarCambiosFacturacion() {
		return isPermisoGuardarCambiosFacturacion;
	}

	public void setIsPermisoGuardarCambiosFacturacion(Boolean isPermisoGuardarCambiosFacturacion) {
		this.isPermisoGuardarCambiosFacturacion = isPermisoGuardarCambiosFacturacion;
	}
	
	public Boolean getIsPermisoConsultaFacturacion() {
		return isPermisoConsultaFacturacion;
	}

	public void setIsPermisoConsultaFacturacion(Boolean isPermisoConsultaFacturacion) {
		this.isPermisoConsultaFacturacion = isPermisoConsultaFacturacion;
	}

	public Boolean getIsPermisoBusquedaFacturacion() {
		return isPermisoBusquedaFacturacion;
	}

	public void setIsPermisoBusquedaFacturacion(Boolean isPermisoBusquedaFacturacion) {
		this.isPermisoBusquedaFacturacion = isPermisoBusquedaFacturacion;
	}

	public Boolean getIsPermisoReporteFacturacion() {
		return isPermisoReporteFacturacion;
	}

	public void setIsPermisoReporteFacturacion(Boolean isPermisoReporteFacturacion) {
		this.isPermisoReporteFacturacion = isPermisoReporteFacturacion;
	}
	
	public Boolean getIsPermisoPaginacionMedioFacturacion() {
		return isPermisoPaginacionMedioFacturacion;
	}

	public void setIsPermisoPaginacionMedioFacturacion(Boolean isPermisoPaginacionMedioFacturacion) {
		this.isPermisoPaginacionMedioFacturacion = isPermisoPaginacionMedioFacturacion;
	}
	
	public Boolean getIsPermisoPaginacionTodoFacturacion() {
		return isPermisoPaginacionTodoFacturacion;
	}

	public void setIsPermisoPaginacionTodoFacturacion(Boolean isPermisoPaginacionTodoFacturacion) {
		this.isPermisoPaginacionTodoFacturacion = isPermisoPaginacionTodoFacturacion;
	}
	
	public Boolean getIsPermisoPaginacionAltoFacturacion() {
		return isPermisoPaginacionAltoFacturacion;
	}

	public void setIsPermisoPaginacionAltoFacturacion(Boolean isPermisoPaginacionAltoFacturacion) {
		this.isPermisoPaginacionAltoFacturacion = isPermisoPaginacionAltoFacturacion;
	}
	
	public Boolean getIsPermisoCopiarFacturacion() {
		return isPermisoCopiarFacturacion;
	}

	public void setIsPermisoCopiarFacturacion(Boolean isPermisoCopiarFacturacion) {
		this.isPermisoCopiarFacturacion = isPermisoCopiarFacturacion;
	}
	
	public Boolean getIsPermisoVerFormFacturacion() {
		return isPermisoVerFormFacturacion;
	}

	public void setIsPermisoVerFormFacturacion(Boolean isPermisoVerFormFacturacion) {
		this.isPermisoVerFormFacturacion = isPermisoVerFormFacturacion;
	}
	
	public Boolean getIsPermisoDuplicarFacturacion() {
		return isPermisoDuplicarFacturacion;
	}

	public void setIsPermisoDuplicarFacturacion(Boolean isPermisoDuplicarFacturacion) {
		this.isPermisoDuplicarFacturacion = isPermisoDuplicarFacturacion;
	}
	
	public Boolean getIsPermisoOrdenFacturacion() {
		return isPermisoOrdenFacturacion;
	}

	public void setIsPermisoOrdenFacturacion(Boolean isPermisoOrdenFacturacion) {
		this.isPermisoOrdenFacturacion = isPermisoOrdenFacturacion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoFacturacion() {
		return isVisibilidadCeldaNuevoFacturacion;
	}

	public void setIsVisibilidadCeldaNuevoFacturacion(Boolean isVisibilidadCeldaNuevoFacturacion) {
		this.isVisibilidadCeldaNuevoFacturacion = isVisibilidadCeldaNuevoFacturacion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarFacturacion() {
		return isVisibilidadCeldaDuplicarFacturacion;
	}

	public void setIsVisibilidadCeldaDuplicarFacturacion(Boolean isVisibilidadCeldaDuplicarFacturacion) {
		this.isVisibilidadCeldaDuplicarFacturacion = isVisibilidadCeldaDuplicarFacturacion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarFacturacion() {
		return isVisibilidadCeldaCopiarFacturacion;
	}

	public void setIsVisibilidadCeldaCopiarFacturacion(Boolean isVisibilidadCeldaCopiarFacturacion) {
		this.isVisibilidadCeldaCopiarFacturacion = isVisibilidadCeldaCopiarFacturacion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormFacturacion() {
		return isVisibilidadCeldaVerFormFacturacion;
	}

	public void setIsVisibilidadCeldaVerFormFacturacion(Boolean isVisibilidadCeldaVerFormFacturacion) {
		this.isVisibilidadCeldaVerFormFacturacion = isVisibilidadCeldaVerFormFacturacion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenFacturacion() {
		return isVisibilidadCeldaOrdenFacturacion;
	}

	public void setIsVisibilidadCeldaOrdenFacturacion(Boolean isVisibilidadCeldaOrdenFacturacion) {
		this.isVisibilidadCeldaOrdenFacturacion = isVisibilidadCeldaOrdenFacturacion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesFacturacion() {
		return isVisibilidadCeldaNuevoRelacionesFacturacion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesFacturacion(Boolean isVisibilidadCeldaNuevoRelacionesFacturacion) {
		this.isVisibilidadCeldaNuevoRelacionesFacturacion = isVisibilidadCeldaNuevoRelacionesFacturacion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarFacturacion() {
		return isVisibilidadCeldaModificarFacturacion;
	}

	public void setIsVisibilidadCeldaModificarFacturacion(Boolean isVisibilidadCeldaModificarFacturacion) {
		this.isVisibilidadCeldaModificarFacturacion = isVisibilidadCeldaModificarFacturacion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarFacturacion() {
		return isVisibilidadCeldaActualizarFacturacion;
	}

	public void setIsVisibilidadCeldaActualizarFacturacion(Boolean isVisibilidadCeldaActualizarFacturacion) {
		this.isVisibilidadCeldaActualizarFacturacion = isVisibilidadCeldaActualizarFacturacion;
	}

	public Boolean getIsVisibilidadCeldaEliminarFacturacion() {
		return isVisibilidadCeldaEliminarFacturacion;
	}

	public void setIsVisibilidadCeldaEliminarFacturacion(Boolean isVisibilidadCeldaEliminarFacturacion) {
		this.isVisibilidadCeldaEliminarFacturacion = isVisibilidadCeldaEliminarFacturacion;
	}

	public Boolean getIsVisibilidadCeldaCancelarFacturacion() {
		return isVisibilidadCeldaCancelarFacturacion;
	}

	public void setIsVisibilidadCeldaCancelarFacturacion(Boolean isVisibilidadCeldaCancelarFacturacion) {
		this.isVisibilidadCeldaCancelarFacturacion = isVisibilidadCeldaCancelarFacturacion;
	}

	public Boolean getIsVisibilidadCeldaGuardarFacturacion() {
		return isVisibilidadCeldaGuardarFacturacion;
	}

	public void setIsVisibilidadCeldaGuardarFacturacion(Boolean isVisibilidadCeldaGuardarFacturacion) {
		this.isVisibilidadCeldaGuardarFacturacion = isVisibilidadCeldaGuardarFacturacion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosFacturacion() {
		return isVisibilidadCeldaGuardarCambiosFacturacion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosFacturacion(Boolean isVisibilidadCeldaGuardarCambiosFacturacion) {
		this.isVisibilidadCeldaGuardarCambiosFacturacion = isVisibilidadCeldaGuardarCambiosFacturacion;
	}
		
	public FacturacionSessionBean getfacturacionSessionBean() {
		return this.facturacionSessionBean;
	}
	
	public void setfacturacionSessionBean(FacturacionSessionBean facturacionSessionBean) {
		this.facturacionSessionBean=facturacionSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysFacturacion(Facturacion facturacion)throws Exception {
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
	
	public void bugActualizarReferenciaActual(Facturacion facturacion,Facturacion facturacionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalFacturacion(facturacion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		facturacionAux.setId(facturacion.getId());
		facturacionAux.setVersionRow(facturacion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessFacturacion();
		
			int intSelectedRow = this.jTableDatosFacturacion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacion =(Facturacion) this.facturacionLogic.getFacturacions().toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.facturacion =(Facturacion) this.facturacions.toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(FacturacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualFacturacion(this.facturacion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysFacturacion(this.facturacion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = facturacionValidator.getInvalidValues(this.facturacion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			facturacionLogic.setDatosCliente(datosCliente);
			facturacionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				facturacionAux=new  Facturacion();
				
				facturacionAux.setIsNew(true);
				facturacionAux.setIsChanged(true);
				
				facturacionAux.setFacturacionOriginal(this.facturacion);
				
				facturacionAux.setId(this.facturacion.getId());	
				facturacionAux.setVersionRow(this.facturacion.getVersionRow());	
				facturacionAux.setcodigo(this.facturacion.getcodigo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.facturacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.facturacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(facturacionAux,facturacionLogic.getFacturacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(facturacionAux,facturacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.facturacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.facturacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturacionLogic.saveFacturacions();//WithConnection
						//facturacionLogic.getSetVersionRowFacturacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.facturacion,facturacionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.facturacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.facturacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								facturacionLogic.saveFacturacionRelaciones(facturacionAux);//WithConnection
								//facturacionLogic.getSetVersionRowFacturacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.facturacion,facturacionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.facturacionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.facturacionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(facturacionAux,facturacionLogic.getFacturacions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(facturacionAux,facturacions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.facturacion,facturacionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				facturacionAux=new  Facturacion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.facturacionSessionBean.getEsGuardarRelacionado() 
					|| (this.facturacionSessionBean.getEsGuardarRelacionado() && this.facturacion.getId()>=0)) {
						
					facturacionAux.setIsNew(false);
				}
				
				facturacionAux.setIsDeleted(false);
			
				facturacionAux.setId(this.facturacion.getId());	
				facturacionAux.setVersionRow(this.facturacion.getVersionRow());	
				facturacionAux.setcodigo(this.facturacion.getcodigo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(facturacionAux,facturacionLogic.getFacturacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(facturacionAux,facturacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.facturacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.facturacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturacionLogic.saveFacturacions();//WithConnection
						//facturacionLogic.getSetVersionRowFacturacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.facturacion,facturacionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.facturacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.facturacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								facturacionLogic.saveFacturacionRelaciones(facturacionAux);//WithConnection
								//facturacionLogic.getSetVersionRowFacturacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.facturacion,facturacionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.facturacionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.facturacionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(facturacionAux,facturacionLogic.getFacturacions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(facturacionAux,facturacions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.facturacion,facturacionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				facturacionAux=new  Facturacion();
				
				facturacionAux.setIsNew(false);
				facturacionAux.setIsChanged(false);
				
				facturacionAux.setIsDeleted(true);
				
				facturacionAux.setId(this.facturacion.getId());	
				facturacionAux.setVersionRow(this.facturacion.getVersionRow());	
				facturacionAux.setcodigo(this.facturacion.getcodigo());	
				
				if(this.facturacionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.facturacionAux.getId()>=0) {	
						this.facturacionsEliminados.add(facturacionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(facturacionAux,facturacionLogic.getFacturacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(facturacionAux,facturacions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.facturacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.facturacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturacionLogic.saveFacturacions();//WithConnection
						//facturacionLogic.getSetVersionRowFacturacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.facturacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.facturacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								facturacionLogic.saveFacturacionRelaciones(facturacionAux);//WithConnection
								//facturacionLogic.getSetVersionRowFacturacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.facturacionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.facturacionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(facturacionAux,facturacionLogic.getFacturacions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(facturacionAux,facturacions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionLogic.getFacturacions().addAll(this.facturacionsEliminados);
					
					facturacionLogic.saveFacturacions();//WithConnection
					//facturacionLogic.getSetVersionRowFacturacions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.facturacionsEliminados= new ArrayList<Facturacion>();		
			}
			
			if(this.facturacionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Facturacion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Facturacion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.facturacion=facturacionAux;
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
      		//this.finishProcessFacturacion();
      	}
		
	}	
	
	public void actualizarRelaciones(Facturacion facturacionLocal) throws Exception {
		
		if(this.facturacionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Facturacion facturacionLocal) throws Exception {	
		if(this.facturacionSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarFacturacionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosFacturacion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.facturacion =(Facturacion) this.facturacionLogic.getFacturacions().toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.facturacion =(Facturacion) this.facturacions.toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = facturacionValidator.getInvalidValues(this.facturacion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Facturacion facturacion,List<Facturacion> facturacions) throws Exception {
		try	{		
			FacturacionConstantesFunciones.actualizarLista(facturacion,facturacions,this.facturacionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Facturacion facturacion,List<Facturacion> facturacions) throws Exception {
		try	{			
			FacturacionConstantesFunciones.actualizarSelectedLista(facturacion,facturacions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Facturacion> facturacionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				facturacionsLocal=this.facturacionLogic.getFacturacions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				facturacionsLocal=this.facturacions;
			}
			//ARCHITECTURE
		
			for(Facturacion facturacionLocal:facturacionsLocal) {
				if(this.permiteMantenimiento(facturacionLocal) && facturacionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+FacturacionConstantesFunciones.getFacturacionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(FacturacionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturacion.jLabelcodigoFacturacion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormFacturacion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturacion.jLabelcodigoFacturacion,"");
		
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
		this.iIdNuevoFacturacion--;	
		
		
		this.facturacionAux=new Facturacion();
		
		this.facturacionAux.setId(this.iIdNuevoFacturacion);
		this.facturacionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.facturacionLogic.getFacturacions().add(this.facturacionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.facturacions.add(this.facturacionAux);
		}
		//ARCHITECTURE
		
		this.facturacion=this.facturacionAux;
		
		if(FacturacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioFacturacion(this.facturacion);
			this.setVariablesObjetoActualToFormularioForeignKeyFacturacion(this.facturacion);
		}
				
		//this.setDefaultControlesFacturacion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyFacturacion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyFacturacion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyFacturacion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFacturacion(this.facturacionBean,this.facturacion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysFacturacion(this.facturacion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanFacturacion(this.facturacionReturnGeneral,this.facturacionBean,false);
		
		if(this.facturacionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyFacturacion(this.facturacionReturnGeneral.getFacturacion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioFacturacion(this.facturacionReturnGeneral.getFacturacion());
		}
		
		if(this.facturacionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioFacturacion(this.facturacionReturnGeneral.getFacturacion(),classes);//this.facturacionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualFacturacion(this.facturacion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyFacturacion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyFacturacion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FacturacionBeanSwingJInternalFrameAdditional.RecargarFormFacturacion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingFacturacion(false);
						
			if(facturacionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(FacturacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturacion();
			}
			
			this.actualizarVisualTableDatosFacturacion();
			
			this.jTableDatosFacturacion.setRowSelectionInterval(this.getIndiceNuevoFacturacion(), this.getIndiceNuevoFacturacion());
			
			this.seleccionarFilaTablaFacturacionActual();
						
			this.actualizarEstadoCeldasBotonesFacturacion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesFacturacion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormFacturacion.jTextFieldcodigoFacturacion.setEnabled(isHabilitar && this.facturacionConstantesFunciones.activarcodigoFacturacion);	
		
	};
	
	public void setDefaultControlesFacturacion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoFacturacion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.facturacionSessionBean.setConGuardarRelaciones(true);			
			this.facturacionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormFacturacion.jTabbedPaneRelacionesFacturacion.setVisible(true);
			
					
		} else {
			//this.facturacionSessionBean.setConGuardarRelaciones(false);			
			this.facturacionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormFacturacion.jTabbedPaneRelacionesFacturacion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoFacturacion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Facturacion facturacionAux:this.facturacionLogic.getFacturacions()) {
				if(facturacionAux.getId().equals(this.iIdNuevoFacturacion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Facturacion facturacionAux:this.facturacions) {
				if(facturacionAux.getId().equals(this.iIdNuevoFacturacion)) {
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
	
	public int getIndiceActualFacturacion(Facturacion facturacion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Facturacion facturacionAux:this.facturacionLogic.getFacturacions()) {
				if(facturacionAux.getId().equals(facturacion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Facturacion facturacionAux:this.facturacions) {
				if(facturacionAux.getId().equals(facturacion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalFacturacion(Facturacion facturacionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Facturacion facturacionAux:this.facturacionLogic.getFacturacions()) {
				if(facturacionAux.getFacturacionOriginal().getId().equals(facturacionOriginal.getId())) {
					existe=true;
					facturacionOriginal.setId(facturacionAux.getId());
					facturacionOriginal.setVersionRow(facturacionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Facturacion facturacionAux:this.facturacions) {
				if(facturacionAux.getFacturacionOriginal().getId().equals(facturacionOriginal.getId())) {
					existe=true;
					facturacionOriginal.setId(facturacionAux.getId());
					facturacionOriginal.setVersionRow(facturacionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosFacturacion(Boolean esParaCancelar) throws Exception {
		facturacionsAux=new ArrayList<Facturacion>();
		facturacionAux=new Facturacion();
		
		if(!this.facturacionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Facturacion facturacionAux:this.facturacionLogic.getFacturacions()) {
					if(facturacionAux.getId()<0) {
						facturacionsAux.add(facturacionAux);
					}		
				}
				this.iIdNuevoFacturacion=0L;
				this.facturacionLogic.getFacturacions().removeAll(facturacionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Facturacion facturacionAux:this.facturacions) {
					if(facturacionAux.getId()<0) {
						facturacionsAux.add(facturacionAux);
					}		
				}
				this.iIdNuevoFacturacion=0L;
				this.facturacions.removeAll(facturacionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoFacturacion 
					&& this.facturacionLogic.getFacturacions().size()>0
					) {
					facturacionAux=this.facturacionLogic.getFacturacions().get(this.facturacionLogic.getFacturacions().size() - 1);
				
					if(facturacionAux.getId()<0) {
						this.facturacionLogic.getFacturacions().remove(facturacionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoFacturacion && this.facturacions.size()>0) {
					facturacionAux=this.facturacions.get(this.facturacions.size() - 1);
				
					if(facturacionAux.getId()<0) {
						this.facturacions.remove(facturacionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoFacturacion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(facturacion.getId()<0) {
				this.facturacionLogic.getFacturacions().remove(this.facturacion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(facturacion.getId()<0) {
				this.facturacions.remove(this.facturacion);
			}
		}			
	}
	
	public void setEstadosInicialesFacturacion(List<Facturacion> facturacionsAux) throws Exception {
		FacturacionConstantesFunciones.setEstadosInicialesFacturacion(facturacionsAux);
	}
	
	public void setEstadosInicialesFacturacion(Facturacion facturacionAux) throws Exception {
		FacturacionConstantesFunciones.setEstadosInicialesFacturacion(facturacionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarFacturacionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesFacturacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarFacturacionActual()) {
				if(!this.isEsNuevoFacturacion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesFacturacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoFacturacion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarFacturacionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Facturacion ?", "MANTENIMIENTO DE Facturacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesFacturacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Facturacion facturacion) throws Exception {
		FacturacionConstantesFunciones.seleccionarAsignar(this.facturacion,facturacion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarFacturacion=this.isPermisoActualizarOriginalFacturacion;
			
			
			this.seleccionarAsignar(facturacion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FacturacionConstantesFunciones.quitarEspaciosFacturacion(this.facturacion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesFacturacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.facturacionSessionBean.setsFuncionBusquedaRapida(this.facturacionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoFacturacion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosFacturacion(esParaCancelar);				
				this.cancelarNuevoFacturacion(esParaCancelar);								
			}
			
			this.facturacion=new Facturacion();
			
			this.inicializarFacturacion();
			
			this.actualizarEstadoCeldasBotonesFacturacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarFacturacion() throws Exception {
		try {
			FacturacionConstantesFunciones.inicializarFacturacion(this.facturacion);
			
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
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.facturacionLogic.getFacturacions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteFacturacions(String sAccionBusqueda,List<Facturacion> facturacionsParaReportes) throws Exception {
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
					sPathReporteFinal="Facturacion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="FacturacionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("FacturacionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Facturacion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Facturaciones");		
		parameters.put("busquedapor", FacturacionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceFacturacion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			FacturacionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			FacturacionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceFacturacion=new JRBeanArrayDataSource(FacturacionJInternalFrame.TraerFacturacionBeans(facturacionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceFacturacion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+FacturacionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+FacturacionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(FacturacionBean.TraerFacturacionBeans(facturacionsParaReportes).toArray()));
							
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
				this.generarExcelReporteFacturacions(sAccionBusqueda,sTipoArchivoReporte,facturacionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalFacturacions(sAccionBusqueda,sTipoArchivoReporte,facturacionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoFacturacionActionPerformed(null);
					//this.generarExcelReporteFacturacions(sAccionBusqueda,sTipoArchivoReporte,facturacionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalFacturacions(sAccionBusqueda,sTipoArchivoReporte,facturacionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesFacturacions(sAccionBusqueda,sTipoArchivoReporte,facturacionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesFacturacions(sAccionBusqueda,sTipoArchivoReporte,facturacionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteFacturacions(String sAccionBusqueda,String sTipoArchivoReporte,List<Facturacion> facturacionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Facturacions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFacturacion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Facturacion facturacion : facturacionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			FacturacionConstantesFunciones.generarExcelReporteDataFacturacion("NORMAL",row,workbook,facturacion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderFacturacion(String sTipo,Row row,Workbook workbook) {
		
		FacturacionConstantesFunciones.generarExcelReporteHeaderFacturacion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalFacturacions(String sAccionBusqueda,String sTipoArchivoReporte,List<Facturacion> facturacionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturacion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Facturacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Facturacion facturacion : facturacionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(FacturacionConstantesFunciones.getFacturacionDescripcion(facturacion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturacionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturacionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturacion.getcodigo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesFacturacions(String sAccionBusqueda,String sTipoArchivoReporte,List<Facturacion> facturacionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Facturacion> facturacionsRespaldo=null;
		
		classes=FacturacionConstantesFunciones.getClassesRelationshipsOfFacturacion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.facturacionLogic.setDatosCliente(this.datosCliente);
		this.facturacionLogic.setDatosDeep(this.datosDeep);
		this.facturacionLogic.setIsConDeep(true);
		
		facturacionsRespaldo=this.facturacionLogic.getFacturacions();
		
		this.facturacionLogic.setFacturacions(facturacionsParaReportes);	
		this.facturacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		facturacionsParaReportes=this.facturacionLogic.getFacturacions();
		this.facturacionLogic.setFacturacions(facturacionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturacion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Facturacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFacturacion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Facturacion facturacion : facturacionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderFacturacion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			FacturacionConstantesFunciones.generarExcelReporteDataFacturacion("NORMAL",row,workbook,facturacion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(FacturacionConstantesFunciones.getFacturacionDescripcion(facturacion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoFacturacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoFacturacion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturacion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessFacturacion() throws Exception {		
		this.startProcessFacturacion(true);
	}
	
	public void startProcessFacturacion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesFacturacion, this.jScrollPanelDatosFacturacion,this.jPanelPaginacionFacturacion, this.jScrollPanelDatosEdicionFacturacion, this.jPanelAccionesFacturacion,this.jPanelAccionesFormularioFacturacion,this.jmenuBarFacturacion,this.jmenuBarDetalleFacturacion,this.jTtoolBarFacturacion,this.jTtoolBarDetalleFacturacion);		
		
		final JTabbedPane jTabbedPaneBusquedasFacturacion=null; 
		
		final JPanel jPanelParametrosReportesFacturacion=this.jPanelParametrosReportesFacturacion;
		//final JScrollPane jScrollPanelDatosFacturacion=this.jScrollPanelDatosFacturacion;
		final JTable jTableDatosFacturacion=this.jTableDatosFacturacion;		
		final JPanel jPanelPaginacionFacturacion=this.jPanelPaginacionFacturacion;
		//final JScrollPane jScrollPanelDatosEdicionFacturacion=this.jScrollPanelDatosEdicionFacturacion;
		final JPanel jPanelAccionesFacturacion=this.jPanelAccionesFacturacion;
		
		JPanel jPanelCamposAuxiliarFacturacion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarFacturacion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormFacturacion!=null) {
			jPanelCamposAuxiliarFacturacion=this.jInternalFrameDetalleFormFacturacion.jPanelCamposFacturacion;
			jPanelAccionesFormularioAuxiliarFacturacion=this.jInternalFrameDetalleFormFacturacion.jPanelAccionesFormularioFacturacion;
		}
		
		final JPanel jPanelCamposFacturacion=jPanelCamposAuxiliarFacturacion;
		final JPanel jPanelAccionesFormularioFacturacion=jPanelAccionesFormularioAuxiliarFacturacion;
		
		
		final JMenuBar jmenuBarFacturacion=this.jmenuBarFacturacion;
		final JToolBar jTtoolBarFacturacion=this.jTtoolBarFacturacion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarFacturacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFacturacion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormFacturacion!=null) {
			jmenuBarDetalleAuxiliarFacturacion=this.jInternalFrameDetalleFormFacturacion.jmenuBarDetalleFacturacion;
			jTtoolBarDetalleAuxiliarFacturacion=this.jInternalFrameDetalleFormFacturacion.jTtoolBarDetalleFacturacion;
		}
		
		final JMenuBar jmenuBarDetalleFacturacion=jmenuBarDetalleAuxiliarFacturacion;
		final JToolBar jTtoolBarDetalleFacturacion=jTtoolBarDetalleAuxiliarFacturacion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFacturacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFacturacion;
			processRunnable.jTableDatos=jTableDatosFacturacion;
			processRunnable.jPanelCampos=jPanelCamposFacturacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionFacturacion;
			processRunnable.jPanelAcciones=jPanelAccionesFacturacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFacturacion;
			
			
			processRunnable.jmenuBar=jmenuBarFacturacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFacturacion;
			processRunnable.jTtoolBar=jTtoolBarFacturacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFacturacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFacturacion ,jPanelParametrosReportesFacturacion,jTableDatosFacturacion, /*jScrollPanelDatosFacturacion,*/jPanelCamposFacturacion,jPanelPaginacionFacturacion, /*jScrollPanelDatosEdicionFacturacion,*/ jPanelAccionesFacturacion,jPanelAccionesFormularioFacturacion,jmenuBarFacturacion,jmenuBarDetalleFacturacion,jTtoolBarFacturacion,jTtoolBarDetalleFacturacion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesFacturacion, jScrollPanelDatosFacturacion,jPanelPaginacionFacturacion, jScrollPanelDatosEdicionFacturacion, jPanelAccionesFacturacion,jPanelAccionesFormularioFacturacion,jmenuBarFacturacion,jmenuBarDetalleFacturacion,jTtoolBarFacturacion,jTtoolBarDetalleFacturacion);
						
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
	
	public void finishProcessFacturacion() {// throws Exception 
		this.finishProcessFacturacion(true);
	}
	
	public void finishProcessFacturacion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesFacturacion, this.jScrollPanelDatosFacturacion,this.jPanelPaginacionFacturacion, this.jScrollPanelDatosEdicionFacturacion, this.jPanelAccionesFacturacion,this.jPanelAccionesFormularioFacturacion,this.jmenuBarFacturacion,this.jmenuBarDetalleFacturacion,this.jTtoolBarFacturacion,this.jTtoolBarDetalleFacturacion);		
		
		final JTabbedPane jTabbedPaneBusquedasFacturacion=null; 
		
		final JPanel jPanelParametrosReportesFacturacion=this.jPanelParametrosReportesFacturacion;
		//final JScrollPane jScrollPanelDatosFacturacion=this.jScrollPanelDatosFacturacion;
		final JTable jTableDatosFacturacion=this.jTableDatosFacturacion;		
		final JPanel jPanelPaginacionFacturacion=this.jPanelPaginacionFacturacion;
		//final JScrollPane jScrollPanelDatosEdicionFacturacion=this.jScrollPanelDatosEdicionFacturacion;
		final JPanel jPanelAccionesFacturacion=this.jPanelAccionesFacturacion;
		
		JPanel jPanelCamposAuxiliarFacturacion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarFacturacion=new JPanel();
		
		if(this.jInternalFrameDetalleFormFacturacion!=null) {
			jPanelCamposAuxiliarFacturacion=this.jInternalFrameDetalleFormFacturacion.jPanelCamposFacturacion;
			jPanelAccionesFormularioAuxiliarFacturacion=this.jInternalFrameDetalleFormFacturacion.jPanelAccionesFormularioFacturacion;
		}
		
		final JPanel jPanelCamposFacturacion=jPanelCamposAuxiliarFacturacion;
		final JPanel jPanelAccionesFormularioFacturacion=jPanelAccionesFormularioAuxiliarFacturacion;
		
		
		final JMenuBar jmenuBarFacturacion=this.jmenuBarFacturacion;		
		final JToolBar jTtoolBarFacturacion=this.jTtoolBarFacturacion;
				
		JMenuBar jmenuBarDetalleAuxiliarFacturacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFacturacion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormFacturacion!=null) {
			jmenuBarDetalleAuxiliarFacturacion=this.jInternalFrameDetalleFormFacturacion.jmenuBarDetalleFacturacion;
			jTtoolBarDetalleAuxiliarFacturacion=this.jInternalFrameDetalleFormFacturacion.jTtoolBarDetalleFacturacion;		
		}
		
		final JMenuBar jmenuBarDetalleFacturacion=jmenuBarDetalleAuxiliarFacturacion;
		final JToolBar jTtoolBarDetalleFacturacion=jTtoolBarDetalleAuxiliarFacturacion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFacturacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFacturacion;
			processRunnable.jTableDatos=jTableDatosFacturacion;
			processRunnable.jPanelCampos=jPanelCamposFacturacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionFacturacion;
			processRunnable.jPanelAcciones=jPanelAccionesFacturacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFacturacion;
			
			
			processRunnable.jmenuBar=jmenuBarFacturacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFacturacion;
			processRunnable.jTtoolBar=jTtoolBarFacturacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFacturacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasFacturacion ,jPanelParametrosReportesFacturacion, jTableDatosFacturacion,/*jScrollPanelDatosFacturacion,*/jPanelCamposFacturacion,jPanelPaginacionFacturacion, /*jScrollPanelDatosEdicionFacturacion,*/ jPanelAccionesFacturacion,jPanelAccionesFormularioFacturacion,jmenuBarFacturacion,jmenuBarDetalleFacturacion,jTtoolBarFacturacion,jTtoolBarDetalleFacturacion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesFacturacion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarFacturacion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuFacturacion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarFacturacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarFacturacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFacturacion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuFacturacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarFacturacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFacturacion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.facturacionConstantesFunciones.getsFinalQueryFacturacion();
		String  finalQueryPaginacionTodos=this.facturacionConstantesFunciones.getsFinalQueryFacturacion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=FacturacionConstantesFunciones.getArrayColumnasGlobalesNoFacturacion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=FacturacionConstantesFunciones.getArrayColumnasGlobalesFacturacion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,FacturacionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.facturacionsEliminados= new ArrayList<Facturacion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessFacturacion();
		
				///*FacturacionSessionBean*/this.facturacionSessionBean=new FacturacionSessionBean();
			
			if(this.facturacionSessionBean==null) {
				this.facturacionSessionBean=new FacturacionSessionBean();
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
					this.iNumeroPaginacion=FacturacionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=FacturacionConstantesFunciones.getClassesForeignKeysOfFacturacion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/facturacion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			facturacionsAux= new ArrayList<Facturacion>();
			
				
			facturacionLogic.setDatosCliente(this.datosCliente);
			facturacionLogic.setDatosDeep(this.datosDeep);
			facturacionLogic.setIsConDeep(true);
			
			
			facturacionLogic.getFacturacionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					facturacionLogic.getTodosFacturacions(finalQueryGlobal,pagination);
					
					//facturacionLogic.getTodosFacturacionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(facturacionLogic.getFacturacions()==null|| facturacionLogic.getFacturacions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							facturacionsAux= new ArrayList<Facturacion>();
							facturacionsAux.addAll(facturacionLogic.getFacturacions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturacionsAux= new ArrayList<Facturacion>();
							facturacionsAux.addAll(facturacions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							facturacionLogic.getTodosFacturacions(finalQueryGlobal+"",this.pagination);												
							
							//facturacionLogic.getTodosFacturacionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteFacturacions("Todos",facturacionLogic.getFacturacions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							facturacionLogic.setFacturacions(new ArrayList<Facturacion>());					
							facturacionLogic.getFacturacions().addAll(facturacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturacions=new ArrayList<Facturacion>();
							facturacions.addAll(facturacionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idFacturacion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idFacturacion=this.idActual;
				
				} else if(this.idFacturacionActual!=null && this.idFacturacionActual!=0L) {
					idFacturacion=idFacturacionActual;
				}
				
					
				this.sDetalleReporte=FacturacionConstantesFunciones.getDetalleIndicePorId(idFacturacion);
				
				this.facturacions=new ArrayList<Facturacion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					facturacionLogic.getEntity(idFacturacion);
					
					//facturacionLogic.getEntityWithConnection(idFacturacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturacionLogic.setFacturacions(new ArrayList<Facturacion>());
					facturacionLogic.getFacturacions().add(facturacionLogic.getFacturacion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturacions=new ArrayList<Facturacion>();
					this.facturacions.add(facturacion);
				}
				
				if(facturacionLogic.getFacturacion()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesFacturacion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessFacturacion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=facturacionLogic.getFacturacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturacions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=facturacionLogic.getFacturacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturacions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Facturacion facturacion) {
		Boolean permite=true;
		
		if(this.facturacion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=FacturacionConstantesFunciones.getOrderByListaFacturacion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=FacturacionConstantesFunciones.getOrderByListaFacturacion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Facturacion facturacion:facturacionLogic.getFacturacions()) {
				if(facturacion.getsType().equals(Constantes2.S_TOTALES)) {
					facturacionTotales=facturacion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Facturacion facturacion:this.facturacions) {
				if(facturacion.getsType().equals(Constantes2.S_TOTALES)) {
					facturacionTotales=facturacion;
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
			this.facturacionAux=new Facturacion();
			this.facturacionAux.setsType(Constantes2.S_TOTALES);
			this.facturacionAux.setIsNew(false);
			this.facturacionAux.setIsChanged(false);
			this.facturacionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				FacturacionConstantesFunciones.TotalizarValoresFilaFacturacion(this.facturacionLogic.getFacturacions(),this.facturacionAux);
				
				this.facturacionLogic.getFacturacions().add(this.facturacionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				FacturacionConstantesFunciones.TotalizarValoresFilaFacturacion(this.facturacions,this.facturacionAux);
				
				this.facturacions.add(this.facturacionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		facturacionTotales=new Facturacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.facturacionLogic.getFacturacions().remove(facturacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.facturacions.remove(facturacionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		facturacionTotales=new Facturacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Facturacion facturacion:facturacionLogic.getFacturacions()) {
				if(facturacion.getsType().equals(Constantes2.S_TOTALES)) {
					facturacionTotales=facturacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FacturacionConstantesFunciones.TotalizarValoresFilaFacturacion(this.facturacionLogic.getFacturacions(),facturacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Facturacion facturacion:this.facturacions) {
				if(facturacion.getsType().equals(Constantes2.S_TOTALES)) {
					facturacionTotales=facturacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FacturacionConstantesFunciones.TotalizarValoresFilaFacturacion(this.facturacions,facturacionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosFacturacion() {
		this.isPermisoTodoFacturacion=false;
		this.isPermisoNuevoFacturacion=false;
		this.isPermisoActualizarFacturacion=false;
		this.isPermisoActualizarOriginalFacturacion=false;
		this.isPermisoEliminarFacturacion=false;
		this.isPermisoGuardarCambiosFacturacion=false;
		this.isPermisoConsultaFacturacion=false;
		this.isPermisoBusquedaFacturacion=false;
		this.isPermisoReporteFacturacion=false;		
		this.isPermisoOrdenFacturacion=false;		
		this.isPermisoPaginacionMedioFacturacion=false;		
		this.isPermisoPaginacionAltoFacturacion=false;
		this.isPermisoPaginacionTodoFacturacion=false;
		this.isPermisoCopiarFacturacion=false;		
		this.isPermisoVerFormFacturacion=false;		
		this.isPermisoDuplicarFacturacion=false;		
		this.isPermisoOrdenFacturacion=false;		
	}
	
	public void setPermisosUsuarioFacturacion(Boolean isPermiso) {
		this.isPermisoTodoFacturacion=isPermiso;
		this.isPermisoNuevoFacturacion=isPermiso;
		this.isPermisoActualizarFacturacion=isPermiso;
		this.isPermisoActualizarOriginalFacturacion=isPermiso;
		this.isPermisoEliminarFacturacion=isPermiso;
		this.isPermisoGuardarCambiosFacturacion=isPermiso;
		this.isPermisoConsultaFacturacion=isPermiso;
		this.isPermisoBusquedaFacturacion=isPermiso;
		this.isPermisoReporteFacturacion=isPermiso;
		this.isPermisoOrdenFacturacion=isPermiso;		
		this.isPermisoPaginacionMedioFacturacion=isPermiso;		
		this.isPermisoPaginacionAltoFacturacion=isPermiso;		
		this.isPermisoPaginacionTodoFacturacion=isPermiso;		
		this.isPermisoCopiarFacturacion=isPermiso;		
		this.isPermisoVerFormFacturacion=isPermiso;		
		this.isPermisoDuplicarFacturacion=isPermiso;
		this.isPermisoOrdenFacturacion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioFacturacion(Boolean isPermiso) {
		//this.isPermisoTodoFacturacion=isPermiso;
		this.isPermisoNuevoFacturacion=isPermiso;
		this.isPermisoActualizarFacturacion=isPermiso;
		this.isPermisoActualizarOriginalFacturacion=isPermiso;
		this.isPermisoEliminarFacturacion=isPermiso;
		this.isPermisoGuardarCambiosFacturacion=isPermiso;
		//this.isPermisoConsultaFacturacion=isPermiso;
		//this.isPermisoBusquedaFacturacion=isPermiso;
		//this.isPermisoReporteFacturacion=isPermiso;
		//this.isPermisoOrdenFacturacion=isPermiso;		
		//this.isPermisoPaginacionMedioFacturacion=isPermiso;		
		//this.isPermisoPaginacionAltoFacturacion=isPermiso;		
		//this.isPermisoPaginacionTodoFacturacion=isPermiso;		
		//this.isPermisoCopiarFacturacion=isPermiso;		
		//this.isPermisoDuplicarFacturacion=isPermiso;
		//this.isPermisoOrdenFacturacion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioFacturacionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(FacturacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebFacturacion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioFacturacionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioFacturacionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionFacturacionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioFacturacionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioFacturacion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(FacturacionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.facturacionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, FacturacionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoFacturacion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarFacturacion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalFacturacion=this.isPermisoActualizarFacturacion;
			this.isPermisoEliminarFacturacion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosFacturacion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaFacturacion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaFacturacion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoFacturacion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteFacturacion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFacturacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioFacturacion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoFacturacion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoFacturacion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarFacturacion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormFacturacion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarFacturacion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFacturacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.facturacionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosFacturacion.setToolTipText(this.jTableDatosFacturacion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioFacturacion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioFacturacion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(FacturacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(FacturacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioFacturacion() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyFacturacionListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyFacturacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(FacturacionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyFacturacionListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyFacturacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyFacturacion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyFacturacion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyFacturacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyFacturacion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyFacturacion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyFacturacion(Facturacion facturacion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyFacturacion(Facturacion facturacion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyFacturacion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyFacturacion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyFacturacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyFacturacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroFacturacion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyFacturacion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyFacturacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyFacturacion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public FacturacionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public FacturacionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public FacturacionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.facturacionSessionBean=new FacturacionSessionBean(); 
		this.facturacionConstantesFunciones=new FacturacionConstantesFunciones(); 
		this.facturacionBean=new Facturacion();//(this.facturacionConstantesFunciones); 		
		this.facturacionReturnGeneral=new FacturacionParameterReturnGeneral(); 
		
		this.facturacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public FacturacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public FacturacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public FacturacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessFacturacion(true);
			
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
			
			this.facturacionConstantesFunciones=new FacturacionConstantesFunciones(); 
			this.facturacionBean=new Facturacion();//this.facturacionConstantesFunciones); 			
			this.facturacionReturnGeneral=new FacturacionParameterReturnGeneral(); 
		
			FacturacionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Facturacion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.facturacion=new Facturacion();
			this.facturacions = new ArrayList<Facturacion>();
			this.facturacionsAux = new ArrayList<Facturacion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic=new FacturacionLogic();
				this.facturacionLogic.getNewConnexionToDeep("");
			}
			
			//this.facturacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.facturacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormFacturacion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoFacturacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFacturacion);	
					}
					
					if(this.jInternalFrameImportacionFacturacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFacturacion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByFacturacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByFacturacion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormFacturacion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormFacturacion);
				this.jInternalFrameDetalleFormFacturacion.setVisible(false);
				this.jInternalFrameDetalleFormFacturacion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoFacturacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFacturacion);
					this.jInternalFrameReporteDinamicoFacturacion.setVisible(false);
					this.jInternalFrameReporteDinamicoFacturacion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionFacturacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionFacturacion);
					this.jInternalFrameImportacionFacturacion.setVisible(false);
					this.jInternalFrameImportacionFacturacion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByFacturacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByFacturacion);
					this.jInternalFrameOrderByFacturacion.setVisible(false);
					this.jInternalFrameOrderByFacturacion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idFacturacionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=FacturacionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.facturacionReturnGeneral=new FacturacionParameterReturnGeneral();
			
			this.facturacionParameterGeneral=new FacturacionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.facturacionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.facturacionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(FacturacionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.facturacionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FacturacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.facturacionSessionBean.getEsGuardarRelacionado(),this.facturacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FacturacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.facturacionSessionBean.getEsGuardarRelacionado(),this.facturacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoFacturacion=false;
			this.isVisibilidadCeldaDuplicarFacturacion=true;
			this.isVisibilidadCeldaCopiarFacturacion=true;
			this.isVisibilidadCeldaVerFormFacturacion=true;
			this.isVisibilidadCeldaOrdenFacturacion=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturacion=false;
			this.isVisibilidadCeldaModificarFacturacion=false;
			this.isVisibilidadCeldaActualizarFacturacion=false;
			this.isVisibilidadCeldaEliminarFacturacion=false;
			this.isVisibilidadCeldaCancelarFacturacion=false;
			this.isVisibilidadCeldaGuardarFacturacion=false;
			this.isVisibilidadCeldaGuardarCambiosFacturacion=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesFacturacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosFacturacion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioFacturacion(false);
			
			this.setPermisosUsuarioFacturacion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturacionSessionBean.getEsGuardarRelacionado() 
				|| (this.facturacionSessionBean.getEsGuardarRelacionado() && this.facturacionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioFacturacionClasesRelacionadas();
			}
			
			if(this.facturacionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioFacturacionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!FacturacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosFacturacion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualFacturacion();
			}
			
			if(!this.isPermisoBusquedaFacturacion) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturacionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioFacturacion,this.isPermisoPaginacionMedioFacturacion,this.isPermisoPaginacionTodoFacturacion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(FacturacionConstantesFunciones.getTiposSeleccionarFacturacion());
				
				this.tiposColumnasSelect=FacturacionConstantesFunciones.getTiposSeleccionarFacturacion(true);
				
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
			//if(!this.facturacionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioFacturacion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioFacturacion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioFacturacion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturacion() ;
			
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
				facturacionImplementable= (FacturacionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FacturacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				facturacionImplementableHome= (FacturacionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FacturacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.facturacions= new ArrayList<Facturacion>();
			this.facturacionsEliminados= new ArrayList<Facturacion>();
						
			this.isEsNuevoFacturacion=false;
			this.esParaAccionDesdeFormularioFacturacion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyFacturacion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroFacturacion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturacionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			FacturacionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=FacturacionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesFacturacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingFacturacion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormFacturacion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioFacturacion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioFacturacion();
			}
			
			FacturacionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessFacturacion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Facturacion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectFacturacion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesFacturacion")) {
				iIndex=this.jInternalFrameDetalleFormFacturacion.jTabbedPaneRelacionesFacturacion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormFacturacion.jTabbedPaneRelacionesFacturacion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosFacturacion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessFacturacion();	
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
	
	public void cargarCombosForeignKeyFacturacion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyFacturacion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyFacturacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyFacturacionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyFacturacion();
		
		this.cargarCombosFrameForeignKeyFacturacion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyFacturacion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyFacturacion();
		}
	}
	
	
	
	public void jButtonNuevoFacturacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.facturacionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormFacturacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
			
			
			if(jTableDatosFacturacion.getRowCount()>=1) {
				jTableDatosFacturacion.removeRowSelectionInterval(0, jTableDatosFacturacion.getRowCount()-1);						
			}
			
			this.isEsNuevoFacturacion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoFacturacion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesFacturacion(true);			
			//this.facturacion=new Facturacion();
			//this.facturacion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturacion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturacion() ;
			
			if(FacturacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturacion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.facturacion);	
			this.actualizarInformacion("INFO_PADRE",false,this.facturacion);				
			
			FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
			
			if(this.facturacionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Facturacion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarFacturacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Facturacion> facturacionsSeleccionados=new ArrayList<Facturacion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosFacturacion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosFacturacion.getSelectedRows().length;			
			}
			
			facturacionsSeleccionados=this.getFacturacionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoFacturacion--;			
				//Facturacion facturacionAux= new Facturacion();			
				//facturacionAux.setId(this.iIdNuevoFacturacion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Facturacion facturacionOrigen=new Facturacion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Facturacion facturacionOrigen : facturacionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosFacturacion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							facturacionOrigen =(Facturacion) this.facturacionLogic.getFacturacions().toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturacionOrigen =(Facturacion) this.facturacions.toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaFacturacion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.facturacion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosFacturacion(facturacionOrigen,this.facturacion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacion(this.facturacion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.facturacionLogic.getFacturacions().add(this.facturacionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.facturacions.add(this.facturacionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaFacturacion(false);
				
				this.jTableDatosFacturacion.setRowSelectionInterval(this.getIndiceNuevoFacturacion(), this.getIndiceNuevoFacturacion());
				
				int iLastRow =  this.jTableDatosFacturacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFacturacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFacturacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturacion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarFacturacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Facturacion> facturacionsSeleccionados=new ArrayList<Facturacion>();									
		
			Facturacion facturacionOrigen=new Facturacion();
			Facturacion facturacionDestino=new Facturacion();
				
			facturacionsSeleccionados=this.getFacturacionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosFacturacion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || facturacionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosFacturacion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturacionOrigen =(Facturacion) this.facturacionLogic.getFacturacions().toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						facturacionOrigen =(Facturacion) this.facturacions.toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturacionDestino =(Facturacion) this.facturacionLogic.getFacturacions().toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						facturacionDestino =(Facturacion) this.facturacions.toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				facturacionOrigen =facturacionsSeleccionados.get(0);
				facturacionDestino =facturacionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosFacturacion(facturacionOrigen,facturacionDestino,true,false);
				
				facturacionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(facturacionDestino,facturacionLogic.getFacturacions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(facturacionDestino,facturacions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaFacturacion(false);
				
				//this.jTableDatosFacturacion.setRowSelectionInterval(this.getIndiceNuevoFacturacion(), this.getIndiceNuevoFacturacion());
				
				int iLastRow =  this.jTableDatosFacturacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFacturacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFacturacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturacion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormFacturacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFacturacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormFacturacion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarFacturacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesFacturacion.isVisible();
			
			
			this.jPanelParametrosReportesFacturacion.setVisible(!isVisible);
			this.jPanelPaginacionFacturacion.setVisible(!isVisible);
			this.jPanelAccionesFacturacion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarFacturacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameFacturacion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoFacturacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoFacturacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionFacturacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionFacturacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByFacturacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByFacturacion();
			
			this.abrirFrameOrderByFacturacion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByFacturacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByFacturacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleFacturacion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormFacturacion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormFacturacion.isMaximum()) {
					this.jInternalFrameDetalleFormFacturacion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormFacturacion.setSize(this.jInternalFrameDetalleFormFacturacion.iWidthFormulario,this.jInternalFrameDetalleFormFacturacion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormFacturacion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormFacturacion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormFacturacion.isMaximum()) {
						this.jInternalFrameDetalleFormFacturacion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormFacturacion.jContentPaneDetalleFacturacion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormFacturacion.jTabbedPaneRelacionesFacturacion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormFacturacion.jContentPaneDetalleFacturacion.getWidth(),FacturacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFacturacion.jTabbedPaneRelacionesFacturacion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormFacturacion.jContentPaneDetalleFacturacion.getWidth(),FacturacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFacturacion.jTabbedPaneRelacionesFacturacion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormFacturacion.jContentPaneDetalleFacturacion.getWidth(),FacturacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormFacturacion.setVisible(true);
	        this.jInternalFrameDetalleFormFacturacion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByFacturacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByFacturacion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByFacturacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturacion,false,this);
				} else {
					this.jInternalFrameOrderByFacturacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturacion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByFacturacion);
				this.jInternalFrameOrderByFacturacion.setVisible(false);
				this.jInternalFrameOrderByFacturacion.setSelected(false);
				
				this.jInternalFrameOrderByFacturacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFacturacion"));
				
				this.inicializarActualizarBindingTablaOrderByFacturacion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionFacturacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionFacturacion==null) {
				
				this.jInternalFrameImportacionFacturacion=new ImportacionJInternalFrame(FacturacionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFacturacion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionFacturacion);
				this.jInternalFrameImportacionFacturacion.setVisible(false);
				this.jInternalFrameImportacionFacturacion.setSelected(false);


				this.jInternalFrameImportacionFacturacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFacturacion"));
				this.jInternalFrameImportacionFacturacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFacturacion"));
				this.jInternalFrameImportacionFacturacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFacturacion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoFacturacion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoFacturacion==null) {
				this.jInternalFrameReporteDinamicoFacturacion=new ReporteDinamicoJInternalFrame(FacturacionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFacturacion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFacturacion);
				this.jInternalFrameReporteDinamicoFacturacion.setVisible(false);
				this.jInternalFrameReporteDinamicoFacturacion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoFacturacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturacion"));
				this.jInternalFrameReporteDinamicoFacturacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturacion"));
				this.jInternalFrameReporteDinamicoFacturacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturacion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturacion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleFacturacion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormFacturacion);
			
	       	this.jInternalFrameDetalleFormFacturacion.setVisible(false);
	        this.jInternalFrameDetalleFormFacturacion.setSelected(false);
			
			//this.jInternalFrameDetalleFormFacturacion.dispose();
			//this.jInternalFrameDetalleFormFacturacion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoFacturacion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoFacturacion.setVisible(true);
	        this.jInternalFrameReporteDinamicoFacturacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionFacturacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionFacturacion.setVisible(true);
	        this.jInternalFrameImportacionFacturacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByFacturacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByFacturacion.setVisible(true);
	        this.jInternalFrameOrderByFacturacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByFacturacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByFacturacion.setVisible(false);
	        this.jInternalFrameOrderByFacturacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoFacturacion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoFacturacion.setVisible(false);
	        this.jInternalFrameReporteDinamicoFacturacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionFacturacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionFacturacion.setVisible(false);
	        this.jInternalFrameImportacionFacturacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarFacturacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarFacturacion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarFacturacion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFacturacion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesFacturacion(true);
			//this.isEsNuevoFacturacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacion =(Facturacion) this.facturacionLogic.getFacturacions().toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturacion =(Facturacion) this.facturacions.toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesFacturacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturacion(false) ;
			
			if(facturacionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(FacturacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturacion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaFacturacionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosFacturacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacion =(Facturacion) this.facturacionLogic.getFacturacions().toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturacion =(Facturacion) this.facturacions.toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarFacturacion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFacturacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFacturacion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesFacturacion(true);
			//this.isEsNuevoFacturacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacion =(Facturacion) this.facturacionLogic.getFacturacions().toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturacion =(Facturacion) this.facturacions.toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.facturacion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesFacturacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesFacturacion(false) ;
			
			if(FacturacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturacion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarFacturacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesFacturacion(false);
			
			//if(!this.isEsNuevoFacturacion) {								
				int intSelectedRow = this.jTableDatosFacturacion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacion =(Facturacion) this.facturacionLogic.getFacturacions().toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturacion =(Facturacion) this.facturacions.toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(FacturacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualFacturacion(this.facturacion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturacion(this.facturacion);
				
			}
			
			if(this.permiteMantenimiento(this.facturacion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.facturacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoFacturacion=true;
					this.inicializarActualizarBindingTablaFacturacion(false);
					this.isEsNuevoFacturacion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoFacturacion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoFacturacion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFacturacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturacion(false);
				
				this.habilitarDeshabilitarControlesFacturacion(false);
			
												
				
				if(FacturacionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleFacturacion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoFacturacionActionPerformed(evt,facturacionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualFacturacion(this.facturacion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosFacturacion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,facturacionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.facturacion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Facturacion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Facturacion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarFacturacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosFacturacion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacion =(Facturacion) this.facturacionLogic.getFacturacions().toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
				this.facturacion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturacion =(Facturacion) this.facturacions.toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
				this.facturacion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.facturacion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.facturacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((FacturacionModel) this.jTableDatosFacturacion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoFacturacion=true;
				this.inicializarActualizarBindingTablaFacturacion(false);
				this.isEsNuevoFacturacion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFacturacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturacion(false);
				
				this.habilitarDeshabilitarControlesFacturacion(false);
				
				
				
				if(FacturacionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleFacturacion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarFacturacionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosFacturacion.getRowCount()>=1) {
				jTableDatosFacturacion.removeRowSelectionInterval(0, jTableDatosFacturacion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesFacturacion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaFacturacion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturacion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturacion(false) ;
			
			this.isEsNuevoFacturacion=false;
			
			if(FacturacionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleFacturacion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosFacturacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingFacturacion(false);
				
				//SI ES MANUAL
				if(FacturacionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualFacturacion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosFacturacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoFacturacion--;			
			//Facturacion facturacionAux= new Facturacion();			
			//facturacionAux.setId(this.iIdNuevoFacturacion);
			
			if(this.jInternalFrameDetalleFormFacturacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaFacturacion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysFacturacion(this.facturacion);
			
			this.facturacion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.facturacionLogic.getFacturacions().add(this.facturacionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.facturacions.add(this.facturacionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaFacturacion(false);
			
			this.jTableDatosFacturacion.setRowSelectionInterval(this.getIndiceNuevoFacturacion(), this.getIndiceNuevoFacturacion());
			
			int iLastRow =  this.jTableDatosFacturacion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosFacturacion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosFacturacion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaFacturacion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionFacturacionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingFacturacion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturacion(false);
			
			//SI ES MANUAL
			if(FacturacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturacion();
			}
			
			//this.abrirFrameTreeFacturacion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionFacturacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE FacturacionES ?", "MANTENIMIENTO DE Facturacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionFacturacion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralFacturacion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.facturacionReturnGeneral=facturacionLogic.procesarImportacionFacturacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.facturacionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarFacturacionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionFacturacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionFacturacion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionFacturacion.setFileImportacion(this.jInternalFrameImportacionFacturacion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionFacturacion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionFacturacion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionFacturacion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionFacturacion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoFacturacionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Facturacion> facturacionsSeleccionados=new ArrayList<Facturacion>();		

		facturacionsSeleccionados=this.getFacturacionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("FacturacionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"FacturacionBaseDesign.jrxml";
			
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
			
			this.generarReporteFacturacions("Todos",facturacionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturacion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoFacturacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FacturacionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoFacturacion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoFacturacion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoFacturacion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case FacturacionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoFacturacion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case FacturacionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoFacturacion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturacion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FacturacionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
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
	
	public void jButtonGenerarExcelReporteDinamicoFacturacionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Facturacion> facturacionsSeleccionados=new ArrayList<Facturacion>();		
		
		facturacionsSeleccionados=this.getFacturacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturacion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Facturacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoFacturacion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case FacturacionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturacionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Facturacion facturacion:facturacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturacion.getcodigo());
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
			//	this.getFilaCabeceraExportarExcelFacturacion(row);				
			//	iRow++;
			//}				
			
			//for(Facturacion facturacionAux:facturacionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelFacturacion(facturacionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturacion",JOptionPane.INFORMATION_MESSAGE);
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
				this.facturacionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturacion(false);
			
			//SI ES MANUAL
			if(FacturacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturacion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresFacturacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturacion(false);
			
			//SI ES MANUAL
			if(FacturacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFacturacion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesFacturacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturacion(false);
			
			//SI ES MANUAL
			if(FacturacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFacturacion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaFacturacion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosFacturacion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosFacturacion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosFacturacion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosFacturacion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosFacturacion.setMinimumSize(dimensionMinimum);
		this.jTableDatosFacturacion.setMaximumSize(dimensionMaximum);
		this.jTableDatosFacturacion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingFacturacion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingFacturacion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingFacturacion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaFacturacion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesFacturacion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.facturacionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasFacturacion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturacion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesFacturacion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !FacturacionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!FacturacionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualFacturacion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaFacturacion();
		
		this.inicializarActualizarBindingBotonesManualFacturacion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.facturacionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualFacturacion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturacion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualFacturacion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualFacturacion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosFacturacion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosFacturacion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteFacturacion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormFacturacion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormFacturacion.jCheckBoxPostAccionNuevoFacturacion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormFacturacion.jCheckBoxPostAccionSinCerrarFacturacion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormFacturacion.jCheckBoxPostAccionSinMensajeFacturacion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosFacturacion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosFacturacion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteFacturacion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormFacturacion!=null) {
				this.jInternalFrameDetalleFormFacturacion.jCheckBoxPostAccionNuevoFacturacion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormFacturacion.jCheckBoxPostAccionSinCerrarFacturacion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormFacturacion.jCheckBoxPostAccionSinMensajeFacturacion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionFacturacion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionFacturacion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormFacturacion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormFacturacion.jComboBoxTiposAccionesFormularioFacturacion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesFacturacion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoFacturacion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesFacturacion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesFacturacion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarFacturacion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesFacturacion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoFacturacion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesFacturacion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralFacturacion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesFacturacion(Boolean esInicializar) throws Exception {
		try	{	
			if(FacturacionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualFacturacion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesFacturacion() throws Exception {
		try	{
			if(FacturacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFacturacion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFacturacion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormFacturacion.jComboBoxTiposAccionesFormularioFacturacion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormFacturacion.jComboBoxTiposAccionesFormularioFacturacion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFacturacion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesFacturacion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesFacturacion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesFacturacion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesFacturacion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesFacturacion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesFacturacion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionFacturacion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionFacturacion.addItem(reporte);
			}
			
			
			if(!this.facturacionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionFacturacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionFacturacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesFacturacion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesFacturacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesFacturacion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesFacturacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormFacturacion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormFacturacion.jComboBoxTiposAccionesFormularioFacturacion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormFacturacion.jComboBoxTiposAccionesFormularioFacturacion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarFacturacion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarFacturacion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarFacturacion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturacion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturacion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFacturacion!=null) {
				this.jInternalFrameReporteDinamicoFacturacion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoFacturacion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFacturacion!=null) {
				this.jInternalFrameReporteDinamicoFacturacion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoFacturacion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoFacturacion!=null) {
				
				if(this.jInternalFrameReporteDinamicoFacturacion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFacturacion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturacion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoFacturacion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFacturacion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturacion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualFacturacion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasFacturacion(Boolean esInicializar) throws Exception {				
		if(FacturacionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualFacturacion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaFacturacion() throws Exception {
		this.inicializarActualizarBindingTablaFacturacion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByFacturacion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByFacturacion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByFacturacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturacion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new FacturacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByFacturacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturacion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new FacturacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosFacturacionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturacionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new FacturacionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByFacturacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturacion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new FacturacionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByFacturacion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaFacturacion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=facturacionLogic.getFacturacions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=facturacions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(FacturacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosFacturacion.setModel(new FacturacionModel(this.facturacionLogic.getFacturacions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosFacturacion.setModel(new FacturacionModel(this.facturacions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByFacturacion!=null && this.jInternalFrameOrderByFacturacion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByFacturacion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosFacturacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturacion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new FacturacionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+FacturacionConstantesFunciones.SCLASSWEBTITULO,facturacionConstantesFunciones.resaltarSeleccionarFacturacion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+FacturacionConstantesFunciones.SCLASSWEBTITULO,facturacionConstantesFunciones.resaltarSeleccionarFacturacion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosFacturacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturacion,FacturacionConstantesFunciones.LABEL_ID));

		if(this.facturacionConstantesFunciones.mostraridFacturacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturacionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturacionConstantesFunciones.resaltaridFacturacion,this.facturacionConstantesFunciones.activaridFacturacion,this,true,"idFacturacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturacionConstantesFunciones.resaltaridFacturacion,this.facturacionConstantesFunciones.activaridFacturacion,this,true,"idFacturacion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturacion,FacturacionConstantesFunciones.LABEL_CODIGO));

		if(this.facturacionConstantesFunciones.mostrarcodigoFacturacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturacionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.facturacionConstantesFunciones.resaltarcodigoFacturacion,this.facturacionConstantesFunciones.activarcodigoFacturacion,this,true,"codigoFacturacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturacionConstantesFunciones.resaltarcodigoFacturacion,this.facturacionConstantesFunciones.activarcodigoFacturacion,this,true,"codigoFacturacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.facturacionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.facturacionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.facturacionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFacturacion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.facturacionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.facturacionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFacturacion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarFacturacion && this.isPermisoGuardarCambiosFacturacion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.facturacionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.facturacionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosFacturacion.addColumn(tableColumn);
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
			
			this.jTableDatosFacturacion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFacturacion && this.isPermisoGuardarCambiosFacturacion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFacturacion && this.isPermisoGuardarCambiosFacturacion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosFacturacion.moveColumn(this.jTableDatosFacturacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosFacturacion.moveColumn(this.jTableDatosFacturacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosFacturacion.moveColumn(this.jTableDatosFacturacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosFacturacion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosFacturacion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosFacturacion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!FacturacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosFacturacion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosFacturacion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!FacturacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!FacturacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosFacturacion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosFacturacion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosFacturacion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=facturacionLogic.getFacturacions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=facturacions.size()-1;
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
		//this.jTableDatosFacturacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosFacturacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosFacturacion();
			
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
				
				//this.isEsNuevoFacturacion=false;
					
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
			
				if(this.facturacionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormFacturacion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFacturacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFacturacion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacion =(Facturacion) this.facturacionLogic.getFacturacions().toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturacion =(Facturacion) this.facturacions.toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.facturacion.getsType().equals("DUPLICADO")
				   || this.facturacion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoFacturacion=true;
				
				} else {
					this.isEsNuevoFacturacion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.facturacionSessionBean.getEsGuardarRelacionado()) {
					if(this.facturacion.getId()>=0 && !this.facturacion.getIsNew()) {						
						this.isEsNuevoFacturacion=false;
						
					} else {
						this.isEsNuevoFacturacion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoFacturacion(esRelaciones);						
				
				this.seleccionarFacturacion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.facturacion.getId()<0) {
					this.isEsNuevoFacturacion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarFacturacion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarFacturacion(evt,rowIndex);
				}	
				
				if(this.facturacionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Facturacion: " + this.dDif); 
					}
				}								
				
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarFacturacion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.facturacion)) {
					if(this.facturacion.getId()>0) {
						this.facturacion.setIsDeleted(true);
						
						this.facturacionsEliminados.add(this.facturacion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.facturacionLogic.getFacturacions().remove(this.facturacion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.facturacions.remove(this.facturacion);				
					}
					
					
					((FacturacionModel) this.jTableDatosFacturacion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturacion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarFacturacion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoFacturacion) {
			
			if(this.jInternalFrameDetalleFormFacturacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFacturacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFacturacion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacion =(Facturacion) this.facturacionLogic.getFacturacions().toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturacion =(Facturacion) this.facturacions.toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(FacturacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioFacturacion(this.facturacion);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesFacturacion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesFacturacion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturacion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoFacturacion(Facturacion facturacion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoFacturacion(facturacion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoFacturacion(Facturacion facturacion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioFacturacion(facturacion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyFacturacion(facturacion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyFacturacion(facturacion);
	}
	
	public void setVariablesObjetoActualToFormularioFacturacion(Facturacion facturacion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormFacturacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormFacturacion.jLabelidFacturacion.setText(facturacion.getId().toString());
			this.jInternalFrameDetalleFormFacturacion.jTextFieldcodigoFacturacion.setText(facturacion.getcodigo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Facturacion facturacionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,facturacionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Facturacion facturacionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				facturacionLocal=this.facturacion;
			} else {
				facturacionLocal=this.facturacionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(facturacionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoFacturacion(facturacionLocal,true);
					
					if(facturacionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(facturacionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.facturacionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(facturacionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoFacturacion(Facturacion facturacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFacturacion(facturacion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysFacturacion(facturacion);
	}
	
	public void setVariablesFormularioToObjetoActualFacturacion(Facturacion facturacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFacturacion(facturacion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualFacturacion(Facturacion facturacion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormFacturacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormFacturacion.jLabelidFacturacion.getText()==null || this.jInternalFrameDetalleFormFacturacion.jLabelidFacturacion.getText()=="" || this.jInternalFrameDetalleFormFacturacion.jLabelidFacturacion.getText()=="Id") {
				this.jInternalFrameDetalleFormFacturacion.jLabelidFacturacion.setText("0");
			}

			if(conColumnasBase) {facturacion.setId(Long.parseLong(this.jInternalFrameDetalleFormFacturacion.jLabelidFacturacion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturacionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturacion.jLabelIdFacturacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturacion.setcodigo(this.jInternalFrameDetalleFormFacturacion.jTextFieldcodigoFacturacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturacionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturacion.jLabelcodigoFacturacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFacturacion(Facturacion facturacionBean,Facturacion facturacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosFacturacion(Facturacion facturacionOrigen,Facturacion facturacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && facturacionOrigen.getId()!=null && !facturacionOrigen.getId().equals(0L))) {facturacion.setId(facturacionOrigen.getId());}}
			if(conDefault || (!conDefault && facturacionOrigen.getcodigo()!=null && !facturacionOrigen.getcodigo().equals(""))) {facturacion.setcodigo(facturacionOrigen.getcodigo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFacturacion(Facturacion facturacion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFacturacion.jLabelidFacturacion.setText(facturacion.getId().toString());
			this.jInternalFrameDetalleFormFacturacion.jTextFieldcodigoFacturacion.setText(facturacion.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFacturacion(FacturacionBean facturacionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFacturacion.jLabelidFacturacion.setText(facturacionBean.getId().toString());
			this.jInternalFrameDetalleFormFacturacion.jTextFieldcodigoFacturacion.setText(facturacionBean.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanFacturacion(FacturacionParameterReturnGeneral facturacionReturnGeneral,FacturacionBean facturacionBean,Boolean conDefault) throws Exception { 
		try {
			Facturacion facturacionLocal=new Facturacion();
			
			facturacionLocal=facturacionReturnGeneral.getFacturacion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && facturacionLocal.getId()!=null && !facturacionLocal.getId().equals(0L))) {facturacionBean.setId(facturacionLocal.getId());}}
			if(conDefault || (!conDefault && facturacionLocal.getcodigo()!=null && !facturacionLocal.getcodigo().equals(""))) {facturacionBean.setcodigo(facturacionLocal.getcodigo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxFacturacionGenerico(Long idFacturacionSeleccionado,JComboBox jComboBoxFacturacion,List<Facturacion> facturacionsLocal)throws Exception {
		try {
			Facturacion  facturacionTemp=null;

			for(Facturacion facturacionAux:facturacionsLocal) {
				if(facturacionAux.getId()!=null && facturacionAux.getId().equals(idFacturacionSeleccionado)) {
					facturacionTemp=facturacionAux;
					break;
				}
			}

			jComboBoxFacturacion.setSelectedItem(facturacionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxFacturacionGenerico(JComboBox jComboBoxFacturacion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxFacturacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFacturacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxFacturacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFacturacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFacturacion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxFacturacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFacturacion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxFacturacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxFacturacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxFacturacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturacion=(Facturacion) facturacionLogic.getFacturacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			facturacion =(Facturacion) facturacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Facturacion facturacionRow=new Facturacion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturacionRow=(Facturacion) facturacionLogic.getFacturacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			facturacionRow=(Facturacion) facturacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualFacturacion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoFacturacion.setVisible((this.isVisibilidadCeldaNuevoFacturacion && this.isPermisoNuevoFacturacion));			
			this.jButtonDuplicarFacturacion.setVisible((this.isVisibilidadCeldaDuplicarFacturacion && this.isPermisoDuplicarFacturacion));			
			this.jButtonCopiarFacturacion.setVisible((this.isVisibilidadCeldaCopiarFacturacion && this.isPermisoCopiarFacturacion));
			this.jButtonVerFormFacturacion.setVisible((this.isVisibilidadCeldaVerFormFacturacion && this.isPermisoVerFormFacturacion));
			
			this.jButtonAbrirOrderByFacturacion.setVisible((this.isVisibilidadCeldaOrdenFacturacion && this.isPermisoOrdenFacturacion));			
			
			this.jButtonNuevoRelacionesFacturacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturacion && this.isPermisoNuevoFacturacion));			
			this.jButtonNuevoGuardarCambiosFacturacion.setVisible((this.isVisibilidadCeldaNuevoFacturacion && this.isPermisoNuevoFacturacion && this.isPermisoGuardarCambiosFacturacion));
			
			if(this.jInternalFrameDetalleFormFacturacion!=null) {
			this.jInternalFrameDetalleFormFacturacion.jButtonModificarFacturacion.setVisible((this.isVisibilidadCeldaModificarFacturacion && this.isPermisoActualizarFacturacion));	
			this.jInternalFrameDetalleFormFacturacion.jButtonActualizarFacturacion.setVisible((this.isVisibilidadCeldaActualizarFacturacion && this.isPermisoActualizarFacturacion));	
			this.jInternalFrameDetalleFormFacturacion.jButtonEliminarFacturacion.setVisible((this.isVisibilidadCeldaEliminarFacturacion && this.isPermisoEliminarFacturacion));
			this.jInternalFrameDetalleFormFacturacion.jButtonCancelarFacturacion.setVisible(this.isVisibilidadCeldaCancelarFacturacion);							
			this.jInternalFrameDetalleFormFacturacion.jButtonGuardarCambiosFacturacion.setVisible((this.isVisibilidadCeldaGuardarFacturacion && this.isPermisoGuardarCambiosFacturacion));			
			
			}
						
			this.jButtonGuardarCambiosTablaFacturacion.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturacion && this.isPermisoGuardarCambiosFacturacion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarFacturacion.setVisible((this.isVisibilidadCeldaNuevoFacturacion && this.isPermisoNuevoFacturacion));						
			this.jButtonDuplicarToolBarFacturacion.setVisible((this.isVisibilidadCeldaDuplicarFacturacion && this.isPermisoDuplicarFacturacion));						
			this.jButtonCopiarToolBarFacturacion.setVisible((this.isVisibilidadCeldaCopiarFacturacion && this.isPermisoCopiarFacturacion));			
			this.jButtonVerFormToolBarFacturacion.setVisible((this.isVisibilidadCeldaVerFormFacturacion && this.isPermisoVerFormFacturacion));			
			this.jButtonAbrirOrderByToolBarFacturacion.setVisible((this.isVisibilidadCeldaOrdenFacturacion && this.isPermisoOrdenFacturacion));
			this.jButtonNuevoRelacionesToolBarFacturacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturacion && this.isPermisoNuevoFacturacion));			
			this.jButtonNuevoGuardarCambiosToolBarFacturacion.setVisible((this.isVisibilidadCeldaNuevoFacturacion && this.isPermisoNuevoFacturacion && this.isPermisoGuardarCambiosFacturacion));			
			
			if(this.jInternalFrameDetalleFormFacturacion!=null) {
			this.jInternalFrameDetalleFormFacturacion.jButtonModificarToolBarFacturacion.setVisible((this.isVisibilidadCeldaModificarFacturacion && this.isPermisoActualizarFacturacion));	
			this.jInternalFrameDetalleFormFacturacion.jButtonActualizarToolBarFacturacion.setVisible((this.isVisibilidadCeldaActualizarFacturacion  && this.isPermisoActualizarFacturacion));	
			this.jInternalFrameDetalleFormFacturacion.jButtonEliminarToolBarFacturacion.setVisible((this.isVisibilidadCeldaEliminarFacturacion && this.isPermisoEliminarFacturacion));
			this.jInternalFrameDetalleFormFacturacion.jButtonCancelarToolBarFacturacion.setVisible(this.isVisibilidadCeldaCancelarFacturacion);				
			this.jInternalFrameDetalleFormFacturacion.jButtonGuardarCambiosToolBarFacturacion.setVisible((this.isVisibilidadCeldaGuardarFacturacion && this.isPermisoGuardarCambiosFacturacion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarFacturacion.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturacion && this.isPermisoGuardarCambiosFacturacion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoFacturacion.setVisible((this.isVisibilidadCeldaNuevoFacturacion && this.isPermisoNuevoFacturacion));			
			this.jMenuItemDuplicarFacturacion.setVisible((this.isVisibilidadCeldaDuplicarFacturacion && this.isPermisoDuplicarFacturacion));			
			this.jMenuItemCopiarFacturacion.setVisible((this.isVisibilidadCeldaCopiarFacturacion && this.isPermisoCopiarFacturacion));			
			this.jMenuItemVerFormFacturacion.setVisible((this.isVisibilidadCeldaVerFormFacturacion && this.isPermisoVerFormFacturacion));			
			this.jMenuItemAbrirOrderByFacturacion.setVisible((this.isVisibilidadCeldaOrdenFacturacion && this.isPermisoOrdenFacturacion));			
			//this.jMenuItemMostrarOcultarFacturacion.setVisible((this.isVisibilidadCeldaOrdenFacturacion && this.isPermisoOrdenFacturacion));
			this.jMenuItemDetalleAbrirOrderByFacturacion.setVisible((this.isVisibilidadCeldaOrdenFacturacion && this.isPermisoOrdenFacturacion));			
			//this.jMenuItemDetalleMostrarOcultarFacturacion.setVisible((this.isVisibilidadCeldaOrdenFacturacion && this.isPermisoOrdenFacturacion));			
			this.jMenuItemNuevoRelacionesFacturacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturacion && this.isPermisoNuevoFacturacion));			
			this.jMenuItemNuevoGuardarCambiosFacturacion.setVisible((this.isVisibilidadCeldaNuevoFacturacion && this.isPermisoNuevoFacturacion && this.isPermisoGuardarCambiosFacturacion));									
			
			if(this.jInternalFrameDetalleFormFacturacion!=null) {
			this.jInternalFrameDetalleFormFacturacion.jMenuItemModificarFacturacion.setVisible((this.isVisibilidadCeldaModificarFacturacion && this.isPermisoActualizarFacturacion));	
			this.jInternalFrameDetalleFormFacturacion.jMenuItemActualizarFacturacion.setVisible((this.isVisibilidadCeldaActualizarFacturacion && this.isPermisoActualizarFacturacion));	
			this.jInternalFrameDetalleFormFacturacion.jMenuItemEliminarFacturacion.setVisible((this.isVisibilidadCeldaEliminarFacturacion && this.isPermisoEliminarFacturacion));
			this.jInternalFrameDetalleFormFacturacion.jMenuItemCancelarFacturacion.setVisible(this.isVisibilidadCeldaCancelarFacturacion);				
			}
			
			this.jMenuItemGuardarCambiosFacturacion.setVisible((this.isVisibilidadCeldaGuardarFacturacion && this.isPermisoGuardarCambiosFacturacion));						
			this.jMenuItemGuardarCambiosTablaFacturacion.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturacion && this.isPermisoGuardarCambiosFacturacion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoFacturacion=this.jButtonNuevoFacturacion.isVisible();
			this.isVisibilidadCeldaDuplicarFacturacion=this.jButtonDuplicarFacturacion.isVisible();
			this.isVisibilidadCeldaCopiarFacturacion=this.jButtonCopiarFacturacion.isVisible();
			this.isVisibilidadCeldaVerFormFacturacion=this.jButtonVerFormFacturacion.isVisible();
			
			this.isVisibilidadCeldaOrdenFacturacion=this.jButtonAbrirOrderByFacturacion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesFacturacion=this.jButtonNuevoRelacionesFacturacion.isVisible();
			this.isVisibilidadCeldaModificarFacturacion=this.jButtonModificarFacturacion.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturacion!=null) {
			this.isVisibilidadCeldaActualizarFacturacion=this.jInternalFrameDetalleFormFacturacion.jButtonActualizarFacturacion.isVisible();
			this.isVisibilidadCeldaEliminarFacturacion=this.jInternalFrameDetalleFormFacturacion.jButtonEliminarFacturacion.isVisible();
			this.isVisibilidadCeldaCancelarFacturacion=this.jInternalFrameDetalleFormFacturacion.jButtonCancelarFacturacion.isVisible();
			this.isVisibilidadCeldaGuardarFacturacion=this.jInternalFrameDetalleFormFacturacion.jButtonGuardarCambiosFacturacion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosFacturacion=this.jButtonGuardarCambiosTablaFacturacion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoFacturacion=this.jButtonNuevoToolBarFacturacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFacturacion=this.jButtonNuevoRelacionesToolBarFacturacion.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturacion!=null) {
			this.isVisibilidadCeldaModificarFacturacion=this.jInternalFrameDetalleFormFacturacion.jButtonModificarToolBarFacturacion.isVisible();
			this.isVisibilidadCeldaActualizarFacturacion=this.jInternalFrameDetalleFormFacturacion.jButtonActualizarToolBarFacturacion.isVisible();
			this.isVisibilidadCeldaEliminarFacturacion=this.jInternalFrameDetalleFormFacturacion.jButtonEliminarToolBarFacturacion.isVisible();
			this.isVisibilidadCeldaCancelarFacturacion=this.jInternalFrameDetalleFormFacturacion.jButtonCancelarToolBarFacturacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFacturacion=this.jButtonGuardarCambiosToolBarFacturacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFacturacion=this.jButtonGuardarCambiosTablaToolBarFacturacion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoFacturacion=this.jMenuItemNuevoFacturacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFacturacion=this.jMenuItemNuevoRelacionesFacturacion.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturacion!=null) {
			this.isVisibilidadCeldaModificarFacturacion=this.jInternalFrameDetalleFormFacturacion.jMenuItemModificarFacturacion.isVisible();
			this.isVisibilidadCeldaActualizarFacturacion=this.jInternalFrameDetalleFormFacturacion.jMenuItemActualizarFacturacion.isVisible();
			this.isVisibilidadCeldaEliminarFacturacion=this.jInternalFrameDetalleFormFacturacion.jMenuItemEliminarFacturacion.isVisible();
			this.isVisibilidadCeldaCancelarFacturacion=this.jInternalFrameDetalleFormFacturacion.jMenuItemCancelarFacturacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFacturacion=this.jMenuItemGuardarCambiosFacturacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFacturacion=this.jMenuItemGuardarCambiosTablaFacturacion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesFacturacion(Boolean esInicializar) {
		if(FacturacionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.facturacionSessionBean.getConGuardarRelaciones()) {
				//if(this.facturacionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesFacturacion();
			}
			
			this.inicializarActualizarBindingBotonesManualFacturacion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualFacturacion() {
		this.jButtonNuevoFacturacion.setVisible(this.isPermisoNuevoFacturacion);			
		this.jButtonDuplicarFacturacion.setVisible(this.isPermisoDuplicarFacturacion);			
		this.jButtonCopiarFacturacion.setVisible(this.isPermisoCopiarFacturacion);			
		this.jButtonVerFormFacturacion.setVisible(this.isPermisoVerFormFacturacion);			
		
		this.jButtonAbrirOrderByFacturacion.setVisible(this.isPermisoOrdenFacturacion);					
		
		this.jButtonNuevoRelacionesFacturacion.setVisible(this.isPermisoNuevoFacturacion);			
		
		if(this.jInternalFrameDetalleFormFacturacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacion.jButtonModificarFacturacion.setVisible(this.isPermisoActualizarFacturacion);	
			this.jInternalFrameDetalleFormFacturacion.jButtonActualizarFacturacion.setVisible(this.isPermisoActualizarFacturacion);	
			this.jInternalFrameDetalleFormFacturacion.jButtonEliminarFacturacion.setVisible(this.isPermisoEliminarFacturacion);
			this.jInternalFrameDetalleFormFacturacion.jButtonCancelarFacturacion.setVisible(this.isVisibilidadCeldaCancelarFacturacion);						
			this.jInternalFrameDetalleFormFacturacion.jButtonGuardarCambiosFacturacion.setVisible(this.isPermisoGuardarCambiosFacturacion);							
		}
		
		this.jButtonGuardarCambiosTablaFacturacion.setVisible(this.isPermisoActualizarFacturacion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleFacturacion() {
		this.jInternalFrameDetalleFormFacturacion.jButtonModificarFacturacion.setVisible(this.isPermisoActualizarFacturacion);	
		this.jInternalFrameDetalleFormFacturacion.jButtonActualizarFacturacion.setVisible(this.isPermisoActualizarFacturacion);	
		this.jInternalFrameDetalleFormFacturacion.jButtonEliminarFacturacion.setVisible(this.isPermisoEliminarFacturacion);
		this.jInternalFrameDetalleFormFacturacion.jButtonCancelarFacturacion.setVisible(this.isVisibilidadCeldaCancelarFacturacion);							
		this.jInternalFrameDetalleFormFacturacion.jButtonGuardarCambiosFacturacion.setVisible((this.isVisibilidadCeldaGuardarFacturacion && this.isPermisoGuardarCambiosFacturacion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosFacturacion() {
		if(FacturacionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualFacturacion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesFacturacion() {
	}
	
	public void jTableDatosFacturacionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarFacturacion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidFacturacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturacion(this.getfacturacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacion(this.facturacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturacion =(Facturacion) this.facturacionLogic.getFacturacions().toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturacion =(Facturacion) this.facturacions.toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturacion==null) {
						this.facturacion = new Facturacion();
					}

					this.setVariablesFormularioToObjetoActualFacturacion(this.facturacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacion(this.facturacion);
				}

				if(this.facturacion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.facturacion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoFacturacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturacion(this.getfacturacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacion(this.facturacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturacion =(Facturacion) this.facturacionLogic.getFacturacions().toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturacion =(Facturacion) this.facturacions.toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturacion==null) {
						this.facturacion = new Facturacion();
					}

					this.setVariablesFormularioToObjetoActualFacturacion(this.facturacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacion(this.facturacion);
				}

				if(this.facturacion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.facturacion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameFacturacion() {
		if(this.jInternalFrameDetalleFormFacturacion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormFacturacion!=null) {
			this.jInternalFrameDetalleFormFacturacion.setVisible(false);	    			
			this.jInternalFrameDetalleFormFacturacion.dispose();
			this.jInternalFrameDetalleFormFacturacion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoFacturacion!=null) {
			this.jInternalFrameReporteDinamicoFacturacion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoFacturacion.dispose();
			this.jInternalFrameReporteDinamicoFacturacion=null;
		}
		
		if(this.jInternalFrameImportacionFacturacion!=null) {
			this.jInternalFrameImportacionFacturacion.setVisible(false);	    			
			this.jInternalFrameImportacionFacturacion.dispose();
			this.jInternalFrameImportacionFacturacion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessFacturacion();
			
			FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
			
			
			if(sTipo.equals("NuevoFacturacion")) {
				jButtonNuevoFacturacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarFacturacion")) {
				jButtonDuplicarFacturacionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarFacturacion")) {
				jButtonCopiarFacturacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormFacturacion")) {
				jButtonVerFormFacturacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarFacturacion")) {
				jButtonNuevoFacturacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarFacturacion")) {
				jButtonDuplicarFacturacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoFacturacion")) {
				jButtonNuevoFacturacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarFacturacion")) {
				jButtonDuplicarFacturacionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesFacturacion")) {
				jButtonNuevoFacturacionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarFacturacion")) {
				jButtonNuevoFacturacionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesFacturacion")) {
				jButtonNuevoFacturacionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarFacturacion")) {
				jButtonModificarFacturacionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarFacturacion")) {
				jButtonModificarFacturacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarFacturacion")) {
				jButtonModificarFacturacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarFacturacion")) {
				jButtonActualizarFacturacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarFacturacion")) {
				jButtonActualizarFacturacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarFacturacion")) {
				jButtonActualizarFacturacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarFacturacion")) {
				jButtonEliminarFacturacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarFacturacion")) {
				jButtonEliminarFacturacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarFacturacion")) {
				jButtonEliminarFacturacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarFacturacion")) {
				jButtonCancelarFacturacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarFacturacion")) {
				jButtonCancelarFacturacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarFacturacion")) {
				jButtonCancelarFacturacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarFacturacion")) {
				jButtonCerrarFacturacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarFacturacion")) {
				jButtonCerrarFacturacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarFacturacion")) {
				jButtonCerrarFacturacionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarFacturacion")) {
				jButtonMostrarOcultarFacturacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarFacturacion")) {
				jButtonCancelarFacturacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosFacturacion")) {
				jButtonGuardarCambiosFacturacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarFacturacion")) {
				jButtonGuardarCambiosFacturacionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarFacturacion")) {
				jButtonCopiarFacturacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarFacturacion")) {
				jButtonVerFormFacturacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosFacturacion")) {
				jButtonGuardarCambiosFacturacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarFacturacion")) {
				jButtonCopiarFacturacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormFacturacion")) {
				jButtonVerFormFacturacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaFacturacion")) {
				jButtonGuardarCambiosFacturacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarFacturacion")) {
				jButtonGuardarCambiosFacturacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaFacturacion")) {
				jButtonGuardarCambiosFacturacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionFacturacion")) {
				jButtonRecargarInformacionFacturacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarFacturacion")) {
				jButtonRecargarInformacionFacturacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionFacturacion")) {
				jButtonRecargarInformacionFacturacionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresFacturacion")) {
				jButtonAnterioresFacturacionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarFacturacion")) {
				jButtonAnterioresFacturacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreFacturacion")) {
				jButtonAnterioresFacturacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesFacturacion")) {
				jButtonSiguientesFacturacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarFacturacion")) {
				jButtonSiguientesFacturacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesFacturacion")) {
				jButtonSiguientesFacturacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByFacturacion") || sTipo.equals("MenuItemDetalleAbrirOrderByFacturacion")) {
				jButtonAbrirOrderByFacturacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarFacturacion") || sTipo.equals("MenuItemDetalleMostrarOcultarFacturacion")) {
				jButtonMostrarOcultarFacturacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosFacturacion")) {
				jButtonNuevoGuardarCambiosFacturacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarFacturacion")) {
				jButtonNuevoGuardarCambiosFacturacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosFacturacion")) {
				jButtonNuevoGuardarCambiosFacturacionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoFacturacion")) {
				jButtonCerrarReporteDinamicoFacturacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoFacturacion")) {
				jButtonGenerarReporteDinamicoFacturacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoFacturacion")) {
				
				jButtonGenerarExcelReporteDinamicoFacturacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionFacturacion")) {
				jButtonCerrarImportacionFacturacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionFacturacion")) {
				
				jButtonGenerarImportacionFacturacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionFacturacion")) {
				
				jButtonAbrirImportacionFacturacionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesFacturacion")) {
				jComboBoxTiposAccionesFacturacionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesFacturacion")) {
				jComboBoxTiposRelacionesFacturacionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioFacturacion")) {
				jComboBoxTiposAccionesFacturacionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarFacturacion")) {
				
				jComboBoxTiposSeleccionarFacturacionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralFacturacion")) {
				jTextFieldValorCampoGeneralFacturacionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByFacturacion")) {
				jButtonAbrirOrderByFacturacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarFacturacion")) {
				jButtonAbrirOrderByFacturacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByFacturacion")) {
				jButtonCerrarOrderByFacturacionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFacturacionBusqueda")) {
				this.jButtonidFacturacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoFacturacionBusqueda")) {
				this.jButtoncodigoFacturacionBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessFacturacion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturacion);
				
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
				
				


				
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Facturacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Facturacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Facturacion facturacionLocal=null;
			
			if(!this.getEsControlTabla()) {
				facturacionLocal=this.facturacion;
			} else {
				facturacionLocal=this.facturacionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturacion);
				
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
							
				
				


				
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Facturacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Facturacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionAnterior =(Facturacion) this.facturacionLogic.getFacturacions().toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturacionAnterior =(Facturacion) this.facturacions.toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
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
			
			FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
			
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
			
			


			
			FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturacion);
				
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
								
						
				


				
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Facturacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Facturacion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturacion);
				
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
								
				
				


				
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Facturacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Facturacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionAnterior =(Facturacion) this.facturacionLogic.getFacturacions().toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturacionAnterior =(Facturacion) this.facturacions.toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturacion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionAnterior =(Facturacion) this.facturacionLogic.getFacturacions().toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturacionAnterior =(Facturacion) this.facturacions.toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturacion);
				
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
							
				
				


				
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Facturacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Facturacion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFacturacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturacionAnterior =(Facturacion) this.facturacionLogic.getFacturacions().toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.facturacionAnterior =(Facturacion) this.facturacions.toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
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
			
			FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
			
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
			
			


			
			FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturacionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturacion);
				
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
								
				
				


				
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Facturacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Facturacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionAnterior =(Facturacion) this.facturacionLogic.getFacturacions().toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturacionAnterior =(Facturacion) this.facturacions.toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturacion);
				
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosFacturacion")) {
					jCheckBoxSeleccionarTodosFacturacionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosFacturacion")) {
					jCheckBoxSeleccionadosFacturacionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarFacturacion")) {
					
				}
				
				


				
				
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Facturacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Facturacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.facturacion);
				
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
												
				
				


				
				
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Facturacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Facturacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFacturacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturacionAnterior =(Facturacion) this.facturacionLogic.getFacturacions().toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.facturacionAnterior =(Facturacion) this.facturacions.toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturacionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturacion);
				
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
				
				
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
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
			
			FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
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
			
			


			
			FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturacion);
				
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Facturacion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Facturacion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturacion);
				
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
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
				
				


				
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Facturacion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Facturacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturacionAnterior =(Facturacion) this.facturacionLogic.getFacturacions().toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturacionAnterior =(Facturacion) this.facturacions.toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarFacturacion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosFacturacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosFacturacion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.facturacion =(Facturacion) this.facturacionLogic.getFacturacions().toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.facturacion =(Facturacion) this.facturacions.toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.facturacion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarFacturacion")) {
				
				}
				
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarFacturacion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosFacturacion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarFacturacion")) {
			
			}
			
			FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessFacturacion();
			
			FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
			
			if(sTipo.equals("NuevoFacturacion")) {
				jButtonNuevoFacturacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarFacturacion")) {
				jButtonDuplicarFacturacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarFacturacion")) {
				jButtonCopiarFacturacionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormFacturacion")) {
				jButtonVerFormFacturacionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesFacturacion")) {
				jButtonNuevoFacturacionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarFacturacion")) {
				jButtonModificarFacturacionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarFacturacion")) {
				jButtonActualizarFacturacionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarFacturacion")) {
				jButtonEliminarFacturacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaFacturacion")) {
				jButtonGuardarCambiosFacturacionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarFacturacion")) {
				jButtonCancelarFacturacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarFacturacion")) {
				jButtonCerrarFacturacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosFacturacion")) {
				jButtonGuardarCambiosFacturacionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosFacturacion")) {
				jButtonNuevoGuardarCambiosFacturacionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByFacturacion")) {
				jButtonAbrirOrderByFacturacionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionFacturacion")) {
				jButtonRecargarInformacionFacturacionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresFacturacion")) {
				jButtonAnterioresFacturacionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesFacturacion")) {
				jButtonSiguientesFacturacionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFacturacionBusqueda")) {
				this.jButtonidFacturacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoFacturacionBusqueda")) {
				this.jButtoncodigoFacturacionBusquedaActionPerformed(evt);
			}
			
			FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessFacturacion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameFacturacion")) {
				closingInternalFrameFacturacion();
				
			} else if(sTipo.equals("jButtonCancelarFacturacion")) {
				JInternalFrameBase jInternalFrameDetalleFormFacturacion = (JInternalFrameBase)evt.getSource();
	            	
	            FacturacionBeanSwingJInternalFrame jInternalFrameParent=(FacturacionBeanSwingJInternalFrame)jInternalFrameDetalleFormFacturacion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarFacturacionActionPerformed(null);
			}
			
			FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.facturacion,new Object(),this.facturacionParameterGeneral,this.facturacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormFacturacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormFacturacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormFacturacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.facturacion)) {
			if(!esControlTabla) {
				if(FacturacionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualFacturacion(this.facturacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacion(this.facturacion);			
				}
				
				if(this.facturacionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualFacturacion(this.facturacion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanFacturacion(this.facturacionReturnGeneral,this.facturacionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.facturacionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanFacturacion(classes,this.facturacionReturnGeneral,this.facturacionBean,false);
					}
						
					if(this.facturacionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyFacturacion(this.facturacionReturnGeneral.getFacturacion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioFacturacion(this.facturacionReturnGeneral.getFacturacion());	
					}
						
					if(this.facturacionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioFacturacion(this.facturacionReturnGeneral.getFacturacion(),classes);//this.facturacionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioFacturacion(this.facturacion,classes);//this.facturacionBean);									
				}
			
				if(FacturacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualFacturacion(this.facturacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturacion(this.facturacion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.facturacionAnterior!=null) {
						this.facturacion=this.facturacionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.facturacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.facturacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.facturacionReturnGeneral.getFacturacion(),facturacionLogic.getFacturacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.facturacionReturnGeneral.getFacturacion(),this.facturacions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosFacturacion.repaint();
				
				//((AbstractTableModel) this.jTableDatosFacturacion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosFacturacion();
			}
		}
	}
	
	public void actualizarVisualTableDatosFacturacion() throws Exception {
		
		FacturacionModel facturacionModel=(FacturacionModel)this.jTableDatosFacturacion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturacionModel.facturacions=this.facturacionLogic.getFacturacions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			facturacionModel.facturacions=this.facturacions;
		}
		
		
		((FacturacionModel) this.jTableDatosFacturacion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaFacturacion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getfacturacionAnterior(),this.facturacionLogic.getFacturacions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getfacturacionAnterior(),this.facturacions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosFacturacion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioFacturacion(Facturacion facturacion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
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
										
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.facturacion,new Object(),generalEntityParameterGeneral,this.facturacionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.facturacionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=FacturacionConstantesFunciones.getClassesRelationshipsOfFacturacion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=FacturacionConstantesFunciones.getClassesRelationshipsFromStringsOfFacturacion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormFacturacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				FacturacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.facturacion,new Object(),generalEntityParameterGeneral,this.facturacionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioFacturacion(FacturacionBean facturacionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanFacturacion(ArrayList<Classe> classes,FacturacionReturnGeneral facturacionReturnGeneral,FacturacionBean facturacionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualFacturacion(Facturacion facturacion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.facturacion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormFacturacion = new FacturacionDetalleFormJInternalFrame(jDesktopPane,this.facturacionSessionBean.getConGuardarRelaciones(),this.facturacionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormFacturacion);
		this.jInternalFrameDetalleFormFacturacion.setVisible(false);
		this.jInternalFrameDetalleFormFacturacion.setSelected(false);						
		
		this.jInternalFrameDetalleFormFacturacion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormFacturacion.facturacionLogic=this.facturacionLogic;
		
		this.cargarCombosFrameForeignKeyFacturacion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleFacturacion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFacturacion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyFacturacion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyFacturacion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormFacturacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFacturacion"));
		
		this.jInternalFrameDetalleFormFacturacion.jButtonModificarFacturacion.addActionListener(new ButtonActionListener(this,"ModificarFacturacion"));

		
		this.jInternalFrameDetalleFormFacturacion.jButtonModificarToolBarFacturacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarFacturacion"));
					
		this.jInternalFrameDetalleFormFacturacion.jMenuItemModificarFacturacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarFacturacion"));		
		
		
		
		this.jInternalFrameDetalleFormFacturacion.jButtonActualizarFacturacion.addActionListener (new ButtonActionListener(this,"ActualizarFacturacion"));
		
		
		this.jInternalFrameDetalleFormFacturacion.jButtonActualizarToolBarFacturacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFacturacion"));
						
		this.jInternalFrameDetalleFormFacturacion.jMenuItemActualizarFacturacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFacturacion"));		
		
		
		
		this.jInternalFrameDetalleFormFacturacion.jButtonEliminarFacturacion.addActionListener (new ButtonActionListener(this,"EliminarFacturacion"));
		
		
		this.jInternalFrameDetalleFormFacturacion.jButtonEliminarToolBarFacturacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarFacturacion"));
								
		this.jInternalFrameDetalleFormFacturacion.jMenuItemEliminarFacturacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFacturacion"));		
		
		
		
		this.jInternalFrameDetalleFormFacturacion.jButtonCancelarFacturacion.addActionListener (new ButtonActionListener(this,"CancelarFacturacion"));
		
		
		this.jInternalFrameDetalleFormFacturacion.jButtonCancelarToolBarFacturacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarFacturacion"));
					
		this.jInternalFrameDetalleFormFacturacion.jMenuItemCancelarFacturacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFacturacion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormFacturacion.jMenuItemDetalleCerrarFacturacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFacturacion"));		
		
		
		
		this.jInternalFrameDetalleFormFacturacion.jButtonGuardarCambiosToolBarFacturacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturacion"));
		
		
		
		this.jInternalFrameDetalleFormFacturacion.jButtonGuardarCambiosToolBarFacturacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturacion"));
		
		
		
		this.jInternalFrameDetalleFormFacturacion.jComboBoxTiposAccionesFormularioFacturacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFacturacion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacion.jButtonidFacturacionBusqueda.addActionListener(new ButtonActionListener(this,"idFacturacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacion.jButtoncodigoFacturacionBusqueda.addActionListener(new ButtonActionListener(this,"codigoFacturacionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormFacturacion.jTabbedPaneRelacionesFacturacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFacturacion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameFacturacion"));
		
		if(this.jInternalFrameDetalleFormFacturacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFacturacion"));
		}
		
		this.jTableDatosFacturacion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarFacturacion"));
		
		this.jTableDatosFacturacion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarFacturacion"));
		
		this.jButtonNuevoFacturacion.addActionListener(new ButtonActionListener(this,"NuevoFacturacion"));
		
		this.jButtonDuplicarFacturacion.addActionListener(new ButtonActionListener(this,"DuplicarFacturacion"));
		
		this.jButtonCopiarFacturacion.addActionListener(new ButtonActionListener(this,"CopiarFacturacion"));
		
		this.jButtonVerFormFacturacion.addActionListener(new ButtonActionListener(this,"VerFormFacturacion"));
		
		
		this.jButtonNuevoToolBarFacturacion.addActionListener(new ButtonActionListener(this,"NuevoToolBarFacturacion"));
			
		this.jButtonDuplicarToolBarFacturacion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarFacturacion"));
			
		this.jMenuItemNuevoFacturacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoFacturacion"));
			
		this.jMenuItemDuplicarFacturacion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarFacturacion"));		
		
		
		this.jButtonNuevoRelacionesFacturacion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesFacturacion"));
		
		
		this.jButtonNuevoRelacionesToolBarFacturacion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarFacturacion"));
			
		this.jMenuItemNuevoRelacionesFacturacion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesFacturacion"));		
		
		
		if(this.jInternalFrameDetalleFormFacturacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacion.jButtonModificarFacturacion.addActionListener(new ButtonActionListener(this,"ModificarFacturacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacion.jButtonModificarToolBarFacturacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarFacturacion"));
			
			this.jInternalFrameDetalleFormFacturacion.jMenuItemModificarFacturacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarFacturacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturacion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormFacturacion.jButtonActualizarFacturacion.addActionListener (new ButtonActionListener(this,"ActualizarFacturacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacion.jButtonActualizarToolBarFacturacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFacturacion"));
				
			this.jInternalFrameDetalleFormFacturacion.jMenuItemActualizarFacturacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFacturacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacion.jButtonEliminarFacturacion.addActionListener (new ButtonActionListener(this,"EliminarFacturacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacion.jButtonEliminarToolBarFacturacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarFacturacion"));
						
			this.jInternalFrameDetalleFormFacturacion.jMenuItemEliminarFacturacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFacturacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacion.jButtonCancelarFacturacion.addActionListener (new ButtonActionListener(this,"CancelarFacturacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacion.jButtonCancelarToolBarFacturacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarFacturacion"));
			
			this.jInternalFrameDetalleFormFacturacion.jMenuItemCancelarFacturacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFacturacion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarFacturacion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarFacturacion"));		
		
		
		this.jButtonCerrarFacturacion.addActionListener (new ButtonActionListener(this,"CerrarFacturacion"));
		
		
		this.jButtonCerrarToolBarFacturacion.addActionListener (new ButtonActionListener(this,"CerrarToolBarFacturacion"));
			
		this.jMenuItemCerrarFacturacion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarFacturacion"));
			
		if(this.jInternalFrameDetalleFormFacturacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacion.jMenuItemDetalleCerrarFacturacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFacturacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacion.jButtonGuardarCambiosFacturacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosFacturacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacion.jButtonGuardarCambiosToolBarFacturacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturacion"));
		}
		
		this.jButtonCopiarToolBarFacturacion.addActionListener (new ButtonActionListener(this,"CopiarToolBarFacturacion"));
			
		this.jButtonVerFormToolBarFacturacion.addActionListener (new ButtonActionListener(this,"VerFormToolBarFacturacion"));
		
		this.jMenuItemGuardarCambiosFacturacion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosFacturacion"));
			
		this.jMenuItemCopiarFacturacion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarFacturacion"));		
		
		this.jMenuItemVerFormFacturacion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormFacturacion"));		
		
		
		this.jButtonGuardarCambiosTablaFacturacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFacturacion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarFacturacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarFacturacion"));
			
		this.jMenuItemGuardarCambiosTablaFacturacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFacturacion"));		
		
		
		
		this.jButtonRecargarInformacionFacturacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionFacturacion"));
					
		this.jButtonRecargarInformacionToolBarFacturacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarFacturacion"));
		
		this.jMenuItemRecargarInformacionFacturacion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionFacturacion"));		
		
		
		
		this.jButtonAnterioresFacturacion.addActionListener (new ButtonActionListener(this,"AnterioresFacturacion"));
		
		
		this.jButtonAnterioresToolBarFacturacion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarFacturacion"));
		
		this.jMenuItemAnterioresFacturacion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresFacturacion"));		
		
		
		this.jButtonSiguientesFacturacion.addActionListener (new ButtonActionListener(this,"SiguientesFacturacion"));
		
		
		this.jButtonSiguientesToolBarFacturacion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarFacturacion"));
			
		this.jMenuItemSiguientesFacturacion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesFacturacion"));
			
		this.jMenuItemAbrirOrderByFacturacion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByFacturacion"));
			
		this.jMenuItemMostrarOcultarFacturacion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarFacturacion"));
			
		this.jMenuItemDetalleAbrirOrderByFacturacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByFacturacion"));
			
		this.jMenuItemDetalleMostarOcultarFacturacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarFacturacion"));		
		
		
		this.jButtonNuevoGuardarCambiosFacturacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosFacturacion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarFacturacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarFacturacion"));
			
		this.jMenuItemNuevoGuardarCambiosFacturacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosFacturacion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosFacturacion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosFacturacion"));

		this.jCheckBoxSeleccionadosFacturacion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosFacturacion"));
		
		if(this.jInternalFrameDetalleFormFacturacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacion.jComboBoxTiposAccionesFormularioFacturacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFacturacion"));
		}
		
		
		this.jComboBoxTiposRelacionesFacturacion.addActionListener (new ButtonActionListener(this,"TiposRelacionesFacturacion"));
			
		this.jComboBoxTiposAccionesFacturacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFacturacion"));
					
		this.jComboBoxTiposSeleccionarFacturacion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarFacturacion"));
			
		this.jTextFieldValorCampoGeneralFacturacion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralFacturacion"));		
		
		
		if(this.jInternalFrameDetalleFormFacturacion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacion.jButtonidFacturacionBusqueda.addActionListener(new ButtonActionListener(this,"idFacturacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacion.jButtoncodigoFacturacionBusqueda.addActionListener(new ButtonActionListener(this,"codigoFacturacionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoFacturacion!=null) {
				this.jInternalFrameReporteDinamicoFacturacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturacion"));
				this.jInternalFrameReporteDinamicoFacturacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturacion"));
				this.jInternalFrameReporteDinamicoFacturacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturacion"));
			}
			
			//this.jButtonCerrarReporteDinamicoFacturacion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturacion"));				
			//this.jButtonGenerarReporteDinamicoFacturacion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturacion"));
			//this.jButtonGenerarExcelReporteDinamicoFacturacion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturacion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionFacturacion!=null) {
				this.jInternalFrameImportacionFacturacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFacturacion"));
				this.jInternalFrameImportacionFacturacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFacturacion"));
				this.jInternalFrameImportacionFacturacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFacturacion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByFacturacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByFacturacion"));
			
			this.jButtonAbrirOrderByToolBarFacturacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarFacturacion"));			
			
			if(this.jInternalFrameOrderByFacturacion!=null) {
				this.jInternalFrameOrderByFacturacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFacturacion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormFacturacion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormFacturacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturacion.jTabbedPaneRelacionesFacturacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFacturacion"));
		
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
            		closingInternalFrameFacturacion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormFacturacion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormFacturacion = (JInternalFrameBase)event.getSource();
	            	
	            FacturacionBeanSwingJInternalFrame jInternalFrameParent=(FacturacionBeanSwingJInternalFrame)jInternalFrameDetalleFormFacturacion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarFacturacionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosFacturacion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosFacturacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosFacturacion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosFacturacion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoFacturacion";
		inputMap = this.jButtonNuevoFacturacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoFacturacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFacturacionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesFacturacion";
		inputMap = this.jButtonNuevoRelacionesFacturacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesFacturacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFacturacionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarFacturacion";
		inputMap = this.jButtonModificarFacturacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarFacturacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarFacturacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarFacturacion";
		inputMap = this.jButtonActualizarFacturacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarFacturacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarFacturacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarFacturacion";
		inputMap = this.jButtonEliminarFacturacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarFacturacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarFacturacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarFacturacion";
		inputMap = this.jButtonCancelarFacturacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarFacturacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarFacturacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarFacturacion";
		inputMap = this.jButtonCerrarFacturacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarFacturacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarFacturacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormFacturacion.jButtonGuardarCambiosFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosFacturacion";
		inputMap = this.jInternalFrameDetalleFormFacturacion.jButtonGuardarCambiosFacturacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormFacturacion.jButtonGuardarCambiosFacturacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosFacturacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosFacturacion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosFacturacionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesFacturacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesFacturacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarFacturacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarFacturacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralFacturacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralFacturacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacion.jButtonidFacturacionBusqueda.addActionListener(new ButtonActionListener(this,"idFacturacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturacion.jButtoncodigoFacturacionBusqueda.addActionListener(new ButtonActionListener(this,"codigoFacturacionBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionFacturacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionFacturacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarFacturacionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarFacturacion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosFacturacion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Facturacion facturacionAux:this.facturacionLogic.getFacturacions()) {
					facturacionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Facturacion facturacionAux:facturacions) {
					facturacionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosFacturacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFacturacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Facturacion facturacionAux:this.facturacionLogic.getFacturacions()) {
						facturacionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Facturacion facturacionAux:facturacions) {
						facturacionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Facturacion facturacionAux:this.facturacionLogic.getFacturacions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Facturacion facturacionAux:facturacions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaFacturacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFacturacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFacturacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFacturacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosFacturacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFacturacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosFacturacion.getSelectedRows();
			
			Facturacion facturacionLocal=new Facturacion();
			
			//this.seleccionarTodosFacturacion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturacionLocal =(Facturacion) this.facturacionLogic.getFacturacions().toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					facturacionLocal =(Facturacion) this.facturacions.toArray()[this.jTableDatosFacturacion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				facturacionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Facturacion facturacionAux:this.facturacionLogic.getFacturacions()) {
						facturacionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Facturacion facturacionAux:facturacions) {
						facturacionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaFacturacion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFacturacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFacturacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFacturacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualFacturacionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarFacturacionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralFacturacionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingFacturacion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralFacturacion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Facturacion facturacionAux:this.facturacionLogic.getFacturacions()) {
				
						if(sTipoSeleccionar.equals(FacturacionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							facturacionAux.setcodigo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Facturacion facturacionAux:facturacions) {
					
						if(sTipoSeleccionar.equals(FacturacionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							facturacionAux.setcodigo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaFacturacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesFacturacionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingFacturacion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioFacturacion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesFacturacion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormFacturacion.jComboBoxTiposAccionesFormularioFacturacion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteFacturacion) {				
					conSplash=true;//false;										
					
					//this.startProcessFacturacion(conSplash);
				
					this.generarReporteFacturacionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturacion.jComboBoxTiposAccionesFormularioFacturacion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoFacturacionsSeleccionados();
				//this.jComboBoxTiposAccionesFacturacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFacturacionsSeleccionados(false);
				//this.jComboBoxTiposAccionesFacturacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFacturacionsSeleccionados(true);
				//this.jComboBoxTiposAccionesFacturacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFacturacion();
				
				this.exportarFacturacionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturacion.jComboBoxTiposAccionesFormularioFacturacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionFacturacions();
				//this.importarFacturacions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturacion.jComboBoxTiposAccionesFormularioFacturacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFacturacion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelFacturacionsSeleccionados();
				//this.jComboBoxTiposAccionesFacturacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Facturacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessFacturacion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoFacturacion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyFacturacion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Facturacion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturacion.jComboBoxTiposAccionesFormularioFacturacion.setSelectedIndex(0);					
				}	
			} 			
			else if(FacturacionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteFacturacion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessFacturacion(conSplash);
					
						//this.actualizarParametrosGeneralFacturacion();
						
						this.generarReporteProcesoAccionFacturacionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesFacturacion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormFacturacion.jComboBoxTiposAccionesFormularioFacturacion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(FacturacionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO FacturacionES SELECCIONADOS?", "MANTENIMIENTO DE Facturacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessFacturacion();
				
						this.actualizarParametrosGeneralFacturacion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.facturacionReturnGeneral=facturacionLogic.procesarAccionFacturacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.facturacionLogic.getFacturacions(),this.facturacionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarFacturacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFacturacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFacturacion.jComboBoxTiposAccionesFormularioFacturacion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralFacturacion();
					
					FacturacionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarFacturacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFacturacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFacturacion.jComboBoxTiposAccionesFormularioFacturacion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessFacturacion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesFacturacionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessFacturacion();
			
			if(this.jInternalFrameDetalleFormFacturacion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Facturacion> facturacionsSeleccionados=new ArrayList<Facturacion>();		
			Facturacion facturacion=new Facturacion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingFacturacion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesFacturacion.getSelectedItem();
			
			
			
			
			facturacionsSeleccionados=this.getFacturacionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(facturacionsSeleccionados.size()==1) {
				for(Facturacion facturacionAux:facturacionsSeleccionados) {
					facturacion=facturacionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessFacturacion();
			
      		//this.finishProcessFacturacion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarFacturacionReturnGeneral() throws Exception {
		if(this.facturacionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.facturacionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.facturacionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.facturacionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.facturacionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.facturacionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingFacturacion(false);
		}
		
		if(this.facturacionReturnGeneral.getConRetornoLista() || this.facturacionReturnGeneral.getConRetornoObjeto()) {
			if(this.facturacionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.facturacionLogic.setFacturacions(this.facturacionReturnGeneral.getFacturacions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.facturacionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.facturacionLogic.setFacturacion(this.facturacionReturnGeneral.getFacturacion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingFacturacion(false);
		}
	}
	
	public void actualizarParametrosGeneralFacturacion() throws Exception {
		
		
	}
	
	public ArrayList<Facturacion> getFacturacionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Facturacion> facturacionsSeleccionados=new ArrayList<Facturacion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioFacturacion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Facturacion facturacionAux:facturacionLogic.getFacturacions()) {
					if(facturacionAux.getIsSelected()) {
						facturacionsSeleccionados.add(facturacionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Facturacion facturacionAux:this.facturacions) {
					if(facturacionAux.getIsSelected()) {
						facturacionsSeleccionados.add(facturacionAux);				
					}
				}
			}
			
			if(facturacionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						facturacionsSeleccionados.addAll(this.facturacionLogic.getFacturacions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						facturacionsSeleccionados.addAll(this.facturacions);				
					}
				}
			}
		} else {
			facturacionsSeleccionados.add(this.facturacion);
		}
		
		return facturacionsSeleccionados;
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
	
	public void generarReporteFacturacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalFacturacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoFacturacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFacturacionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFacturacionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Facturacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesFacturacionsSeleccionados() throws Exception {
		ArrayList<Facturacion> facturacionsSeleccionados=new ArrayList<Facturacion>();		
		
		facturacionsSeleccionados=this.getFacturacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteFacturacions("Todos",facturacionsSeleccionados);
		
	}	
	
	public void generarReporteNormalFacturacionsSeleccionados() throws Exception {
		ArrayList<Facturacion> facturacionsSeleccionados=new ArrayList<Facturacion>();		
		
		facturacionsSeleccionados=this.getFacturacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteFacturacions("Todos",facturacionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionFacturacionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Facturacion> facturacionsSeleccionados=new ArrayList<Facturacion>();
		
		facturacionsSeleccionados=this.getFacturacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteFacturacions("Todos",facturacionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoFacturacionsSeleccionados() throws Exception {
		ArrayList<Facturacion> facturacionsSeleccionados=new ArrayList<Facturacion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoFacturacion();
		
		
		facturacionsSeleccionados=this.getFacturacionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoFacturacion();
		
		
		//this.generarReporteFacturacions("Todos",facturacionsSeleccionados ,facturacionImplementable,facturacionImplementableHome);
	}
	
	public void mostrarImportacionFacturacions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionFacturacion();
		
		this.abrirFrameImportacionFacturacion();		
		
			
		//this.generarReporteFacturacions("Todos",facturacionsSeleccionados ,facturacionImplementable,facturacionImplementableHome);
	}
	
	public void importarFacturacions() throws Exception {		
	
	}
	
	public void exportarFacturacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelFacturacionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoFacturacionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlFacturacionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Facturacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoFacturacionsSeleccionados() throws Exception {
		ArrayList<Facturacion> facturacionsSeleccionados=new ArrayList<Facturacion>();		
		
		facturacionsSeleccionados=this.getFacturacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturacion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarFacturacion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Facturacion facturacionAux:facturacionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarFacturacion(facturacionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//facturacionAux.setsDetalleGeneralEntityReporte(facturacionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarFacturacion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=FacturacionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturacionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturacionConstantesFunciones.LABEL_CODIGO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarFacturacion(Facturacion facturacion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=facturacion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=facturacion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturacion.getcodigo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelFacturacionsSeleccionados() throws Exception {
		ArrayList<Facturacion> facturacionsSeleccionados=new ArrayList<Facturacion>();		
		
		facturacionsSeleccionados=this.getFacturacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturacion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Facturacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelFacturacion(row);				
				iRow++;
			}				
			
			for(Facturacion facturacionAux:facturacionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelFacturacion(facturacionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlFacturacionsSeleccionados() throws Exception {
		ArrayList<Facturacion> facturacionsSeleccionados=new ArrayList<Facturacion>();		
		
		facturacionsSeleccionados=this.getFacturacionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturacion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("facturacions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("facturacion");
			//elementRoot.appendChild(element);
		
			for(Facturacion facturacionAux:facturacionsSeleccionados) {
				element = document.createElement("facturacion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlFacturacion(facturacionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelFacturacion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(FacturacionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(FacturacionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(FacturacionConstantesFunciones.LABEL_CODIGO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelFacturacion(Facturacion facturacion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(facturacion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(facturacion.getcodigo());				
	}
	
	public void setFilaDatosExportarXmlFacturacion(Facturacion facturacion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(FacturacionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(facturacion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(FacturacionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(facturacion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(FacturacionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(facturacion.getcodigo().trim()));
		element.appendChild(elementcodigo);
	}
	
	public void generarReporteGroupGenericoFacturacionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Facturacion> facturacionsSeleccionados=new ArrayList<Facturacion>();
		
		facturacionsSeleccionados=this.getFacturacionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoFacturacion(facturacionsSeleccionados);
		
		this.generarReporteFacturacions("Todos",facturacionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoFacturacion(ArrayList<Facturacion> facturacionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Facturacion facturacionAux:facturacionsSeleccionados) {
				facturacionAux.setsDetalleGeneralEntityReporte(facturacionAux.toString());
			
				if(sTipoSeleccionar.equals(FacturacionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					facturacionAux.setsDescripcionGeneralEntityReporte1(facturacionAux.getcodigo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesFacturacion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoFacturacion=true;
				this.isVisibilidadCeldaNuevoRelacionesFacturacion=true;
				this.isVisibilidadCeldaGuardarCambiosFacturacion=true;
			}
			
			this.isVisibilidadCeldaModificarFacturacion=false;
			this.isVisibilidadCeldaActualizarFacturacion=false;
			this.isVisibilidadCeldaEliminarFacturacion=false;
			this.isVisibilidadCeldaCancelarFacturacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturacion=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturacion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoFacturacion=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturacion=false;
			this.isVisibilidadCeldaGuardarCambiosFacturacion=false;
			this.isVisibilidadCeldaModificarFacturacion=false;
			this.isVisibilidadCeldaActualizarFacturacion=true;
			this.isVisibilidadCeldaEliminarFacturacion=false;
			this.isVisibilidadCeldaCancelarFacturacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturacion=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturacion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoFacturacion=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturacion=false;
			this.isVisibilidadCeldaGuardarCambiosFacturacion=false;
			this.isVisibilidadCeldaModificarFacturacion=false;
			this.isVisibilidadCeldaActualizarFacturacion=true;
			this.isVisibilidadCeldaEliminarFacturacion=true;
			this.isVisibilidadCeldaCancelarFacturacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturacion=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturacion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoFacturacion=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturacion=false;
			this.isVisibilidadCeldaGuardarCambiosFacturacion=false;
			this.isVisibilidadCeldaModificarFacturacion=false;
			this.isVisibilidadCeldaActualizarFacturacion=true;
			this.isVisibilidadCeldaEliminarFacturacion=false;
			this.isVisibilidadCeldaCancelarFacturacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturacion=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturacion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoFacturacion=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturacion=true;
			this.isVisibilidadCeldaGuardarCambiosFacturacion=true;
			this.isVisibilidadCeldaModificarFacturacion=false;
			this.isVisibilidadCeldaActualizarFacturacion=false;
			this.isVisibilidadCeldaEliminarFacturacion=false;
			this.isVisibilidadCeldaCancelarFacturacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturacion=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturacion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoFacturacion=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturacion=false;
			this.isVisibilidadCeldaGuardarCambiosFacturacion=false;
			this.isVisibilidadCeldaActualizarFacturacion=false;
			this.isVisibilidadCeldaEliminarFacturacion=false;
			this.isVisibilidadCeldaCancelarFacturacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturacion=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturacion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoFacturacion=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturacion=false;
			this.isVisibilidadCeldaGuardarCambiosFacturacion=false;
			this.isVisibilidadCeldaModificarFacturacion=true;
			this.isVisibilidadCeldaActualizarFacturacion=false;
			this.isVisibilidadCeldaEliminarFacturacion=false;
			this.isVisibilidadCeldaCancelarFacturacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturacion=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturacion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(FacturacionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoFacturacion=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturacion=true;
			this.isVisibilidadCeldaGuardarCambiosFacturacion=true;
		} else {
			this.actualizarEstadoPanelsFacturacion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarFacturacion=false;
			//this.isVisibilidadCeldaVerFormFacturacion=false;
			this.isVisibilidadCeldaDuplicarFacturacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!facturacionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesFacturacion=false;
		} else {
			this.isVisibilidadCeldaNuevoFacturacion=false;
			this.isVisibilidadCeldaGuardarCambiosFacturacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(facturacionSessionBean.getEsGuardarRelacionado()) {
			if(!facturacionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesFacturacion=false;												
			}
			
			this.jButtonCerrarFacturacion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesFacturacion=false;
		}
		
		if(!this.permiteMantenimiento(this.facturacion)) {
			this.isVisibilidadCeldaActualizarFacturacion=false;
			this.isVisibilidadCeldaEliminarFacturacion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesFacturacion() {
	}
	
	public void actualizarEstadoPanelsFacturacion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionFacturacion!=null) {
				this.jScrollPanelDatosEdicionFacturacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFacturacion!=null) {
				this.jScrollPanelDatosFacturacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturacion!=null) {
				this.jPanelPaginacionFacturacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturacion!=null) {
				this.jPanelParametrosReportesFacturacion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionFacturacion!=null) {
				this.jScrollPanelDatosEdicionFacturacion.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosFacturacion!=null) {
				this.jScrollPanelDatosFacturacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturacion!=null) {
				this.jPanelPaginacionFacturacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturacion!=null) {
				this.jPanelParametrosReportesFacturacion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionFacturacion!=null) {
				this.jScrollPanelDatosEdicionFacturacion.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosFacturacion!=null) {
				this.jScrollPanelDatosFacturacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturacion!=null) {
				this.jPanelPaginacionFacturacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturacion!=null) {
				this.jPanelParametrosReportesFacturacion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionFacturacion!=null) {
				this.jScrollPanelDatosEdicionFacturacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturacion!=null) {
				this.jScrollPanelDatosFacturacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturacion!=null) {
				this.jPanelPaginacionFacturacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturacion!=null) {
				this.jPanelParametrosReportesFacturacion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionFacturacion!=null) {
				this.jScrollPanelDatosEdicionFacturacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFacturacion!=null) {
				this.jScrollPanelDatosFacturacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturacion!=null) {
				this.jPanelPaginacionFacturacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturacion!=null) {
				this.jPanelParametrosReportesFacturacion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionFacturacion!=null) {
				this.jScrollPanelDatosEdicionFacturacion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosFacturacion!=null) {
				this.jScrollPanelDatosFacturacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturacion!=null) {
				this.jPanelPaginacionFacturacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturacion!=null) {
				this.jPanelParametrosReportesFacturacion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionFacturacion!=null) {
				this.jScrollPanelDatosEdicionFacturacion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosFacturacion!=null) {
				this.jScrollPanelDatosFacturacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturacion!=null) {
				this.jPanelPaginacionFacturacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturacion!=null) {
				this.jPanelParametrosReportesFacturacion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.facturacionSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.facturacionSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//FacturacionSessionBean facturacionSessionBean=new FacturacionSessionBean();
		
		if(this.facturacionSessionBean==null) {
			this.facturacionSessionBean=new FacturacionSessionBean();
		}
		
		this.facturacionSessionBean.setsUltimaBusquedaFacturacion(this.getsAccionBusqueda());
		this.facturacionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.facturacionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//FacturacionSessionBean facturacionSessionBean=new FacturacionSessionBean();
		
		if(this.facturacionSessionBean==null) {
			this.facturacionSessionBean=new FacturacionSessionBean();
		}
		
		if(this.facturacionSessionBean.getsUltimaBusquedaFacturacion()!=null&&!this.facturacionSessionBean.getsUltimaBusquedaFacturacion().equals("")) {
			this.setsAccionBusqueda(facturacionSessionBean.getsUltimaBusquedaFacturacion());
			this.setiNumeroPaginacion(facturacionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(facturacionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.facturacionSessionBean.setsUltimaBusquedaFacturacion("");
		this.facturacionSessionBean.setiNumeroPaginacion(FacturacionConstantesFunciones.INUMEROPAGINACION);
		this.facturacionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaFacturacion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioFacturacion() {
		this.updateBorderResaltarBusquedasFormularioFacturacion();
		this.updateVisibilidadBusquedasFormularioFacturacion();
		this.updateHabilitarBusquedasFormularioFacturacion();
	}
	
	public void updateBorderResaltarBusquedasFormularioFacturacion() {					
	}
	
	public void updateVisibilidadBusquedasFormularioFacturacion() {
	}
	
	public void updateHabilitarBusquedasFormularioFacturacion() {
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
	
	public void updateControlesFormularioFacturacion() throws Exception {

		if(this.jInternalFrameDetalleFormFacturacion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioFacturacion();
		this.updateVisibilidadResaltarControlesFormularioFacturacion();
		this.updateHabilitarResaltarControlesFormularioFacturacion();
		
	}
	
	public void updateBorderResaltarControlesFormularioFacturacion() throws Exception {
		if(this.jInternalFrameDetalleFormFacturacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.facturacionConstantesFunciones.resaltaridFacturacion!=null && this.jInternalFrameDetalleFormFacturacion!=null) {this.jInternalFrameDetalleFormFacturacion.jLabelidFacturacion.setBorder(this.facturacionConstantesFunciones.resaltaridFacturacion);}
		if(this.facturacionConstantesFunciones.resaltarcodigoFacturacion!=null && this.jInternalFrameDetalleFormFacturacion!=null) {this.jInternalFrameDetalleFormFacturacion.jTextFieldcodigoFacturacion.setBorder(this.facturacionConstantesFunciones.resaltarcodigoFacturacion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioFacturacion() throws Exception {		
		if(this.jInternalFrameDetalleFormFacturacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFacturacion!=null) {
	
		//this.jInternalFrameDetalleFormFacturacion.jLabelidFacturacion.setVisible(this.facturacionConstantesFunciones.mostraridFacturacion);
		this.jInternalFrameDetalleFormFacturacion.jPanelidFacturacion.setVisible(this.facturacionConstantesFunciones.mostraridFacturacion);
		//this.jInternalFrameDetalleFormFacturacion.jTextFieldcodigoFacturacion.setVisible(this.facturacionConstantesFunciones.mostrarcodigoFacturacion);
		this.jInternalFrameDetalleFormFacturacion.jPanelcodigoFacturacion.setVisible(this.facturacionConstantesFunciones.mostrarcodigoFacturacion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioFacturacion() throws Exception {
		if(this.jInternalFrameDetalleFormFacturacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFacturacion!=null) {
	
		this.jInternalFrameDetalleFormFacturacion.jLabelidFacturacion.setEnabled(this.facturacionConstantesFunciones.activaridFacturacion);
		this.jInternalFrameDetalleFormFacturacion.jTextFieldcodigoFacturacion.setEnabled(this.facturacionConstantesFunciones.activarcodigoFacturacion);
		}
	}
	
		
}