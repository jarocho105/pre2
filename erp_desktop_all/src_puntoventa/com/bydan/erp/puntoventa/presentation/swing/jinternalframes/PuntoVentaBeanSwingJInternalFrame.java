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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;




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

import com.bydan.erp.puntoventa.util.PuntoVentaConstantesFunciones;
import com.bydan.erp.puntoventa.util.PuntoVentaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.PuntoVentaParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.PuntoVentaBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.puntoventa.resources.reportes.AuxiliarReportes;


import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

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
public class PuntoVentaBeanSwingJInternalFrame extends PuntoVentaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PuntoVentaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PuntoVenta> puntoventaValidator = new ClassValidator<PuntoVenta>(PuntoVenta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PuntoVenta puntoventa;	
	public PuntoVenta puntoventaAux;
	public PuntoVenta puntoventaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PuntoVenta puntoventaTotales;
	public Long idPuntoVentaActual;
	public Long iIdNuevoPuntoVenta=0L;
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
	
	public Boolean isPermisoTodoPuntoVenta;
	public Boolean isPermisoNuevoPuntoVenta;
	public Boolean isPermisoActualizarPuntoVenta;
	public Boolean isPermisoActualizarOriginalPuntoVenta;
	public Boolean isPermisoEliminarPuntoVenta;
	public Boolean isPermisoGuardarCambiosPuntoVenta;
	public Boolean isPermisoConsultaPuntoVenta;
	public Boolean isPermisoBusquedaPuntoVenta;
	public Boolean isPermisoReportePuntoVenta;
	public Boolean isPermisoPaginacionMedioPuntoVenta;
	public Boolean isPermisoPaginacionAltoPuntoVenta;
	public Boolean isPermisoPaginacionTodoPuntoVenta;
	public Boolean isPermisoCopiarPuntoVenta;
	public Boolean isPermisoVerFormPuntoVenta;
	public Boolean isPermisoDuplicarPuntoVenta;
	public Boolean isPermisoOrdenPuntoVenta;
	
	
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
	
	public PuntoVentaParameterReturnGeneral puntoventaReturnGeneral;
	public PuntoVentaParameterReturnGeneral puntoventaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPuntoVenta=false;
	public Boolean esParaAccionDesdeFormularioPuntoVenta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PuntoVentaSessionBeanAdditional puntoventaSessionBeanAdditional=null;
	
	public PuntoVentaSessionBeanAdditional getPuntoVentaSessionBeanAdditional() {
		return this.puntoventaSessionBeanAdditional;
	}
	
	public void setPuntoVentaSessionBeanAdditional(PuntoVentaSessionBeanAdditional puntoventaSessionBeanAdditional) {
		try {
			this.puntoventaSessionBeanAdditional=puntoventaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PuntoVentaBeanSwingJInternalFrameAdditional puntoventaBeanSwingJInternalFrameAdditional=null;
	//public class PuntoVentaBeanSwingJInternalFrame
	
	public PuntoVentaBeanSwingJInternalFrameAdditional getPuntoVentaBeanSwingJInternalFrameAdditional() {
		return this.puntoventaBeanSwingJInternalFrameAdditional;
	}
	
	public void setPuntoVentaBeanSwingJInternalFrameAdditional(PuntoVentaBeanSwingJInternalFrameAdditional puntoventaBeanSwingJInternalFrameAdditional) {
		try {
			this.puntoventaBeanSwingJInternalFrameAdditional=puntoventaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PuntoVentaLogic puntoventaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PuntoVenta puntoventaBean;
	public PuntoVentaConstantesFunciones puntoventaConstantesFunciones;
	//public PuntoVentaParameterReturnGeneral puntoventaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<PuntoVenta> puntoventas;	
	//public List<PuntoVenta> puntoventasEliminados;
	//public List<PuntoVenta> puntoventasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPuntoVenta=false;
	public Boolean isVisibilidadCeldaDuplicarPuntoVenta=true;
	public Boolean isVisibilidadCeldaCopiarPuntoVenta=true;
	public Boolean isVisibilidadCeldaVerFormPuntoVenta=true;
	public Boolean isVisibilidadCeldaOrdenPuntoVenta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPuntoVenta=false;
	public Boolean isVisibilidadCeldaModificarPuntoVenta=false;
	public Boolean isVisibilidadCeldaActualizarPuntoVenta=false;
	public Boolean isVisibilidadCeldaEliminarPuntoVenta=false;
	public Boolean isVisibilidadCeldaCancelarPuntoVenta=false;
	public Boolean isVisibilidadCeldaGuardarPuntoVenta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPuntoVenta=false;	
	
	
	
	public Long getiIdNuevoPuntoVenta() {
		return this.iIdNuevoPuntoVenta;
	}

	public void setiIdNuevoPuntoVenta(Long iIdNuevoPuntoVenta) {
		this.iIdNuevoPuntoVenta = iIdNuevoPuntoVenta;
	}
	
	public Long getidPuntoVentaActual() {
		return this.idPuntoVentaActual;
	}

	public void setidPuntoVentaActual(Long idPuntoVentaActual) {
		this.idPuntoVentaActual = idPuntoVentaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PuntoVenta getpuntoventa() {
		return this.puntoventa;
	}

	public void setpuntoventa(PuntoVenta puntoventa) {
		this.puntoventa = puntoventa;
	}
	
	public PuntoVenta getpuntoventaAux() {
		return this.puntoventaAux;
	}

	public void setpuntoventaAux(PuntoVenta puntoventaAux) {
		this.puntoventaAux = puntoventaAux;
	}				
	
	public PuntoVenta getpuntoventaAnterior() {
		return this.puntoventaAnterior;
	}

	public void setpuntoventaAnterior(PuntoVenta puntoventaAnterior) {
		this.puntoventaAnterior = puntoventaAnterior;
	}	
	
	public PuntoVenta getpuntoventaTotales() {
		return this.puntoventaTotales;
	}

	public void setpuntoventaTotales(PuntoVenta puntoventaTotales) {
		this.puntoventaTotales = puntoventaTotales;
	}	
	
	public PuntoVenta getpuntoventaBean() {
		return this.puntoventaBean;
	}

	public void setpuntoventaBean(PuntoVenta puntoventaBean) {
		this.puntoventaBean = puntoventaBean;
	}	
	
	public PuntoVentaParameterReturnGeneral getpuntoventaReturnGeneral() {
		return this.puntoventaReturnGeneral;
	}

	public void setpuntoventaReturnGeneral(PuntoVentaParameterReturnGeneral puntoventaReturnGeneral) {
		this.puntoventaReturnGeneral = puntoventaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PuntoVentaLogic getPuntoVentaLogic()	{		
		return puntoventaLogic;
	}

	public void setPuntoVentaLogic(PuntoVentaLogic puntoventaLogic) {
		this.puntoventaLogic = puntoventaLogic;
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
	
	public Boolean getIsEsNuevoPuntoVenta() {
		return isEsNuevoPuntoVenta;
	}

	public void setIsEsNuevoPuntoVenta(Boolean isEsNuevoPuntoVenta) {
		this.isEsNuevoPuntoVenta = isEsNuevoPuntoVenta;
	}

	public Boolean getEsParaAccionDesdeFormularioPuntoVenta() {
		return esParaAccionDesdeFormularioPuntoVenta;
	}
	
	public void setEsParaAccionDesdeFormularioPuntoVenta(Boolean esParaAccionDesdeFormularioPuntoVenta) {
		this.esParaAccionDesdeFormularioPuntoVenta = esParaAccionDesdeFormularioPuntoVenta;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesPuntoVenta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PuntoVentaConstantesFunciones.refrescarForeignKeysDescripcionesPuntoVenta(this.puntoventaLogic.getPuntoVentas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PuntoVentaConstantesFunciones.refrescarForeignKeysDescripcionesPuntoVenta(this.puntoventas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//puntoventaLogic.setPuntoVentas(this.puntoventas);
			puntoventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PuntoVentaParameterReturnGeneral getPuntoVentaParameterGeneral() {
		return this.puntoventaParameterGeneral;
	}
	
	public void setPuntoVentaParameterGeneral(PuntoVentaParameterReturnGeneral puntoventaParameterGeneral) {
		this.puntoventaParameterGeneral = puntoventaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPuntoVenta() {
		return isPermisoTodoPuntoVenta;
	}

	public void setIsPermisoTodoPuntoVenta(Boolean isPermisoTodoPuntoVenta) {
		this.isPermisoTodoPuntoVenta = isPermisoTodoPuntoVenta;
	}

	public Boolean getIsPermisoNuevoPuntoVenta() {
		return isPermisoNuevoPuntoVenta;
	}

	public void setIsPermisoNuevoPuntoVenta(Boolean isPermisoNuevoPuntoVenta) {
		this.isPermisoNuevoPuntoVenta = isPermisoNuevoPuntoVenta;
	}

	public Boolean getIsPermisoActualizarPuntoVenta() {
		return isPermisoActualizarPuntoVenta;
	}

	public void setIsPermisoActualizarPuntoVenta(Boolean isPermisoActualizarPuntoVenta) {
		this.isPermisoActualizarPuntoVenta = isPermisoActualizarPuntoVenta;
	}

	public Boolean getIsPermisoEliminarPuntoVenta() {
		return isPermisoEliminarPuntoVenta;
	}

	public void setIsPermisoEliminarPuntoVenta(Boolean isPermisoEliminarPuntoVenta) {
		this.isPermisoEliminarPuntoVenta = isPermisoEliminarPuntoVenta;
	}

	public Boolean getIsPermisoGuardarCambiosPuntoVenta() {
		return isPermisoGuardarCambiosPuntoVenta;
	}

	public void setIsPermisoGuardarCambiosPuntoVenta(Boolean isPermisoGuardarCambiosPuntoVenta) {
		this.isPermisoGuardarCambiosPuntoVenta = isPermisoGuardarCambiosPuntoVenta;
	}
	
	public Boolean getIsPermisoConsultaPuntoVenta() {
		return isPermisoConsultaPuntoVenta;
	}

	public void setIsPermisoConsultaPuntoVenta(Boolean isPermisoConsultaPuntoVenta) {
		this.isPermisoConsultaPuntoVenta = isPermisoConsultaPuntoVenta;
	}

	public Boolean getIsPermisoBusquedaPuntoVenta() {
		return isPermisoBusquedaPuntoVenta;
	}

	public void setIsPermisoBusquedaPuntoVenta(Boolean isPermisoBusquedaPuntoVenta) {
		this.isPermisoBusquedaPuntoVenta = isPermisoBusquedaPuntoVenta;
	}

	public Boolean getIsPermisoReportePuntoVenta() {
		return isPermisoReportePuntoVenta;
	}

	public void setIsPermisoReportePuntoVenta(Boolean isPermisoReportePuntoVenta) {
		this.isPermisoReportePuntoVenta = isPermisoReportePuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionMedioPuntoVenta() {
		return isPermisoPaginacionMedioPuntoVenta;
	}

	public void setIsPermisoPaginacionMedioPuntoVenta(Boolean isPermisoPaginacionMedioPuntoVenta) {
		this.isPermisoPaginacionMedioPuntoVenta = isPermisoPaginacionMedioPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionTodoPuntoVenta() {
		return isPermisoPaginacionTodoPuntoVenta;
	}

	public void setIsPermisoPaginacionTodoPuntoVenta(Boolean isPermisoPaginacionTodoPuntoVenta) {
		this.isPermisoPaginacionTodoPuntoVenta = isPermisoPaginacionTodoPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionAltoPuntoVenta() {
		return isPermisoPaginacionAltoPuntoVenta;
	}

	public void setIsPermisoPaginacionAltoPuntoVenta(Boolean isPermisoPaginacionAltoPuntoVenta) {
		this.isPermisoPaginacionAltoPuntoVenta = isPermisoPaginacionAltoPuntoVenta;
	}
	
	public Boolean getIsPermisoCopiarPuntoVenta() {
		return isPermisoCopiarPuntoVenta;
	}

	public void setIsPermisoCopiarPuntoVenta(Boolean isPermisoCopiarPuntoVenta) {
		this.isPermisoCopiarPuntoVenta = isPermisoCopiarPuntoVenta;
	}
	
	public Boolean getIsPermisoVerFormPuntoVenta() {
		return isPermisoVerFormPuntoVenta;
	}

	public void setIsPermisoVerFormPuntoVenta(Boolean isPermisoVerFormPuntoVenta) {
		this.isPermisoVerFormPuntoVenta = isPermisoVerFormPuntoVenta;
	}
	
	public Boolean getIsPermisoDuplicarPuntoVenta() {
		return isPermisoDuplicarPuntoVenta;
	}

	public void setIsPermisoDuplicarPuntoVenta(Boolean isPermisoDuplicarPuntoVenta) {
		this.isPermisoDuplicarPuntoVenta = isPermisoDuplicarPuntoVenta;
	}
	
	public Boolean getIsPermisoOrdenPuntoVenta() {
		return isPermisoOrdenPuntoVenta;
	}

	public void setIsPermisoOrdenPuntoVenta(Boolean isPermisoOrdenPuntoVenta) {
		this.isPermisoOrdenPuntoVenta = isPermisoOrdenPuntoVenta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPuntoVenta() {
		return isVisibilidadCeldaNuevoPuntoVenta;
	}

	public void setIsVisibilidadCeldaNuevoPuntoVenta(Boolean isVisibilidadCeldaNuevoPuntoVenta) {
		this.isVisibilidadCeldaNuevoPuntoVenta = isVisibilidadCeldaNuevoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPuntoVenta() {
		return isVisibilidadCeldaDuplicarPuntoVenta;
	}

	public void setIsVisibilidadCeldaDuplicarPuntoVenta(Boolean isVisibilidadCeldaDuplicarPuntoVenta) {
		this.isVisibilidadCeldaDuplicarPuntoVenta = isVisibilidadCeldaDuplicarPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPuntoVenta() {
		return isVisibilidadCeldaCopiarPuntoVenta;
	}

	public void setIsVisibilidadCeldaCopiarPuntoVenta(Boolean isVisibilidadCeldaCopiarPuntoVenta) {
		this.isVisibilidadCeldaCopiarPuntoVenta = isVisibilidadCeldaCopiarPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPuntoVenta() {
		return isVisibilidadCeldaVerFormPuntoVenta;
	}

	public void setIsVisibilidadCeldaVerFormPuntoVenta(Boolean isVisibilidadCeldaVerFormPuntoVenta) {
		this.isVisibilidadCeldaVerFormPuntoVenta = isVisibilidadCeldaVerFormPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPuntoVenta() {
		return isVisibilidadCeldaOrdenPuntoVenta;
	}

	public void setIsVisibilidadCeldaOrdenPuntoVenta(Boolean isVisibilidadCeldaOrdenPuntoVenta) {
		this.isVisibilidadCeldaOrdenPuntoVenta = isVisibilidadCeldaOrdenPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPuntoVenta() {
		return isVisibilidadCeldaNuevoRelacionesPuntoVenta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPuntoVenta(Boolean isVisibilidadCeldaNuevoRelacionesPuntoVenta) {
		this.isVisibilidadCeldaNuevoRelacionesPuntoVenta = isVisibilidadCeldaNuevoRelacionesPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPuntoVenta() {
		return isVisibilidadCeldaModificarPuntoVenta;
	}

	public void setIsVisibilidadCeldaModificarPuntoVenta(Boolean isVisibilidadCeldaModificarPuntoVenta) {
		this.isVisibilidadCeldaModificarPuntoVenta = isVisibilidadCeldaModificarPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPuntoVenta() {
		return isVisibilidadCeldaActualizarPuntoVenta;
	}

	public void setIsVisibilidadCeldaActualizarPuntoVenta(Boolean isVisibilidadCeldaActualizarPuntoVenta) {
		this.isVisibilidadCeldaActualizarPuntoVenta = isVisibilidadCeldaActualizarPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaEliminarPuntoVenta() {
		return isVisibilidadCeldaEliminarPuntoVenta;
	}

	public void setIsVisibilidadCeldaEliminarPuntoVenta(Boolean isVisibilidadCeldaEliminarPuntoVenta) {
		this.isVisibilidadCeldaEliminarPuntoVenta = isVisibilidadCeldaEliminarPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaCancelarPuntoVenta() {
		return isVisibilidadCeldaCancelarPuntoVenta;
	}

	public void setIsVisibilidadCeldaCancelarPuntoVenta(Boolean isVisibilidadCeldaCancelarPuntoVenta) {
		this.isVisibilidadCeldaCancelarPuntoVenta = isVisibilidadCeldaCancelarPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaGuardarPuntoVenta() {
		return isVisibilidadCeldaGuardarPuntoVenta;
	}

	public void setIsVisibilidadCeldaGuardarPuntoVenta(Boolean isVisibilidadCeldaGuardarPuntoVenta) {
		this.isVisibilidadCeldaGuardarPuntoVenta = isVisibilidadCeldaGuardarPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPuntoVenta() {
		return isVisibilidadCeldaGuardarCambiosPuntoVenta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPuntoVenta(Boolean isVisibilidadCeldaGuardarCambiosPuntoVenta) {
		this.isVisibilidadCeldaGuardarCambiosPuntoVenta = isVisibilidadCeldaGuardarCambiosPuntoVenta;
	}
		
	public PuntoVentaSessionBean getpuntoventaSessionBean() {
		return this.puntoventaSessionBean;
	}
	
	public void setpuntoventaSessionBean(PuntoVentaSessionBean puntoventaSessionBean) {
		this.puntoventaSessionBean=puntoventaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPuntoVenta(PuntoVenta puntoventa)throws Exception {
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
	
	public void bugActualizarReferenciaActual(PuntoVenta puntoventa,PuntoVenta puntoventaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPuntoVenta(puntoventa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		puntoventaAux.setId(puntoventa.getId());
		puntoventaAux.setVersionRow(puntoventa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPuntoVenta();
		
			int intSelectedRow = this.jTableDatosPuntoVenta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntoventa =(PuntoVenta) this.puntoventaLogic.getPuntoVentas().toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.puntoventa =(PuntoVenta) this.puntoventas.toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPuntoVenta(this.puntoventa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPuntoVenta(this.puntoventa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = puntoventaValidator.getInvalidValues(this.puntoventa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			puntoventaLogic.setDatosCliente(datosCliente);
			puntoventaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				puntoventaAux=new  PuntoVenta();
				
				puntoventaAux.setIsNew(true);
				puntoventaAux.setIsChanged(true);
				
				puntoventaAux.setPuntoVentaOriginal(this.puntoventa);
				
				puntoventaAux.setId(this.puntoventa.getId());	
				puntoventaAux.setVersionRow(this.puntoventa.getVersionRow());	
				puntoventaAux.setcodigo(this.puntoventa.getcodigo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.puntoventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.puntoventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(puntoventaAux,puntoventaLogic.getPuntoVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(puntoventaAux,puntoventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.puntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.puntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						puntoventaLogic.savePuntoVentas();//WithConnection
						//puntoventaLogic.getSetVersionRowPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.puntoventa,puntoventaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.puntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.puntoventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								puntoventaLogic.savePuntoVentaRelaciones(puntoventaAux);//WithConnection
								//puntoventaLogic.getSetVersionRowPuntoVentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.puntoventa,puntoventaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.puntoventaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.puntoventaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(puntoventaAux,puntoventaLogic.getPuntoVentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(puntoventaAux,puntoventas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.puntoventa,puntoventaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				puntoventaAux=new  PuntoVenta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.puntoventaSessionBean.getEsGuardarRelacionado() 
					|| (this.puntoventaSessionBean.getEsGuardarRelacionado() && this.puntoventa.getId()>=0)) {
						
					puntoventaAux.setIsNew(false);
				}
				
				puntoventaAux.setIsDeleted(false);
			
				puntoventaAux.setId(this.puntoventa.getId());	
				puntoventaAux.setVersionRow(this.puntoventa.getVersionRow());	
				puntoventaAux.setcodigo(this.puntoventa.getcodigo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(puntoventaAux,puntoventaLogic.getPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(puntoventaAux,puntoventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.puntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.puntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						puntoventaLogic.savePuntoVentas();//WithConnection
						//puntoventaLogic.getSetVersionRowPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.puntoventa,puntoventaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.puntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.puntoventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								puntoventaLogic.savePuntoVentaRelaciones(puntoventaAux);//WithConnection
								//puntoventaLogic.getSetVersionRowPuntoVentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.puntoventa,puntoventaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.puntoventaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.puntoventaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(puntoventaAux,puntoventaLogic.getPuntoVentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(puntoventaAux,puntoventas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.puntoventa,puntoventaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				puntoventaAux=new  PuntoVenta();
				
				puntoventaAux.setIsNew(false);
				puntoventaAux.setIsChanged(false);
				
				puntoventaAux.setIsDeleted(true);
				
				puntoventaAux.setId(this.puntoventa.getId());	
				puntoventaAux.setVersionRow(this.puntoventa.getVersionRow());	
				puntoventaAux.setcodigo(this.puntoventa.getcodigo());	
				
				if(this.puntoventaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.puntoventaAux.getId()>=0) {	
						this.puntoventasEliminados.add(puntoventaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(puntoventaAux,puntoventaLogic.getPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(puntoventaAux,puntoventas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.puntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.puntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						puntoventaLogic.savePuntoVentas();//WithConnection
						//puntoventaLogic.getSetVersionRowPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.puntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.puntoventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								puntoventaLogic.savePuntoVentaRelaciones(puntoventaAux);//WithConnection
								//puntoventaLogic.getSetVersionRowPuntoVentas();//WithConnection
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
							if(this.puntoventaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.puntoventaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(puntoventaAux,puntoventaLogic.getPuntoVentas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(puntoventaAux,puntoventas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntoventaLogic.getPuntoVentas().addAll(this.puntoventasEliminados);
					
					puntoventaLogic.savePuntoVentas();//WithConnection
					//puntoventaLogic.getSetVersionRowPuntoVentas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.puntoventasEliminados= new ArrayList<PuntoVenta>();		
			}
			
			if(this.puntoventaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Punto Venta GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Punto Venta",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.puntoventa=puntoventaAux;
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
      		//this.finishProcessPuntoVenta();
      	}
		
	}	
	
	public void actualizarRelaciones(PuntoVenta puntoventaLocal) throws Exception {
		
		if(this.puntoventaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PuntoVenta puntoventaLocal) throws Exception {	
		if(this.puntoventaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarPuntoVentaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPuntoVenta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.puntoventa =(PuntoVenta) this.puntoventaLogic.getPuntoVentas().toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.puntoventa =(PuntoVenta) this.puntoventas.toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = puntoventaValidator.getInvalidValues(this.puntoventa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PuntoVenta puntoventa,List<PuntoVenta> puntoventas) throws Exception {
		try	{		
			PuntoVentaConstantesFunciones.actualizarLista(puntoventa,puntoventas,this.puntoventaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PuntoVenta puntoventa,List<PuntoVenta> puntoventas) throws Exception {
		try	{			
			PuntoVentaConstantesFunciones.actualizarSelectedLista(puntoventa,puntoventas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PuntoVenta> puntoventasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				puntoventasLocal=this.puntoventaLogic.getPuntoVentas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				puntoventasLocal=this.puntoventas;
			}
			//ARCHITECTURE
		
			for(PuntoVenta puntoventaLocal:puntoventasLocal) {
				if(this.permiteMantenimiento(puntoventaLocal) && puntoventaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PuntoVentaConstantesFunciones.getPuntoVentaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PuntoVentaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPuntoVenta.jLabelcodigoPuntoVenta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPuntoVenta.jLabelcodigoPuntoVenta,"");
		
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
		this.iIdNuevoPuntoVenta--;	
		
		
		this.puntoventaAux=new PuntoVenta();
		
		this.puntoventaAux.setId(this.iIdNuevoPuntoVenta);
		this.puntoventaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.puntoventaLogic.getPuntoVentas().add(this.puntoventaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.puntoventas.add(this.puntoventaAux);
		}
		//ARCHITECTURE
		
		this.puntoventa=this.puntoventaAux;
		
		if(PuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPuntoVenta(this.puntoventa);
			this.setVariablesObjetoActualToFormularioForeignKeyPuntoVenta(this.puntoventa);
		}
				
		//this.setDefaultControlesPuntoVenta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPuntoVenta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPuntoVenta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPuntoVenta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPuntoVenta(this.puntoventaBean,this.puntoventa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPuntoVenta(this.puntoventa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPuntoVenta(this.puntoventaReturnGeneral,this.puntoventaBean,false);
		
		if(this.puntoventaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPuntoVenta(this.puntoventaReturnGeneral.getPuntoVenta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPuntoVenta(this.puntoventaReturnGeneral.getPuntoVenta());
		}
		
		if(this.puntoventaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPuntoVenta(this.puntoventaReturnGeneral.getPuntoVenta(),classes);//this.puntoventaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPuntoVenta(this.puntoventa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPuntoVenta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPuntoVenta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PuntoVentaBeanSwingJInternalFrameAdditional.RecargarFormPuntoVenta(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPuntoVenta(false);
						
			if(puntoventaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPuntoVenta();
			}
			
			this.actualizarVisualTableDatosPuntoVenta();
			
			this.jTableDatosPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoPuntoVenta(), this.getIndiceNuevoPuntoVenta());
			
			this.seleccionarFilaTablaPuntoVentaActual();
						
			this.actualizarEstadoCeldasBotonesPuntoVenta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPuntoVenta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPuntoVenta.jTextFieldcodigoPuntoVenta.setEnabled(isHabilitar && this.puntoventaConstantesFunciones.activarcodigoPuntoVenta);	
		
	};
	
	public void setDefaultControlesPuntoVenta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPuntoVenta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.puntoventaSessionBean.setConGuardarRelaciones(true);			
			this.puntoventaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPuntoVenta.jTabbedPaneRelacionesPuntoVenta.setVisible(true);
			
					
		} else {
			//this.puntoventaSessionBean.setConGuardarRelaciones(false);			
			this.puntoventaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPuntoVenta.jTabbedPaneRelacionesPuntoVenta.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPuntoVenta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PuntoVenta puntoventaAux:this.puntoventaLogic.getPuntoVentas()) {
				if(puntoventaAux.getId().equals(this.iIdNuevoPuntoVenta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PuntoVenta puntoventaAux:this.puntoventas) {
				if(puntoventaAux.getId().equals(this.iIdNuevoPuntoVenta)) {
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
	
	public int getIndiceActualPuntoVenta(PuntoVenta puntoventa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PuntoVenta puntoventaAux:this.puntoventaLogic.getPuntoVentas()) {
				if(puntoventaAux.getId().equals(puntoventa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PuntoVenta puntoventaAux:this.puntoventas) {
				if(puntoventaAux.getId().equals(puntoventa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPuntoVenta(PuntoVenta puntoventaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PuntoVenta puntoventaAux:this.puntoventaLogic.getPuntoVentas()) {
				if(puntoventaAux.getPuntoVentaOriginal().getId().equals(puntoventaOriginal.getId())) {
					existe=true;
					puntoventaOriginal.setId(puntoventaAux.getId());
					puntoventaOriginal.setVersionRow(puntoventaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PuntoVenta puntoventaAux:this.puntoventas) {
				if(puntoventaAux.getPuntoVentaOriginal().getId().equals(puntoventaOriginal.getId())) {
					existe=true;
					puntoventaOriginal.setId(puntoventaAux.getId());
					puntoventaOriginal.setVersionRow(puntoventaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPuntoVenta(Boolean esParaCancelar) throws Exception {
		puntoventasAux=new ArrayList<PuntoVenta>();
		puntoventaAux=new PuntoVenta();
		
		if(!this.puntoventaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PuntoVenta puntoventaAux:this.puntoventaLogic.getPuntoVentas()) {
					if(puntoventaAux.getId()<0) {
						puntoventasAux.add(puntoventaAux);
					}		
				}
				this.iIdNuevoPuntoVenta=0L;
				this.puntoventaLogic.getPuntoVentas().removeAll(puntoventasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PuntoVenta puntoventaAux:this.puntoventas) {
					if(puntoventaAux.getId()<0) {
						puntoventasAux.add(puntoventaAux);
					}		
				}
				this.iIdNuevoPuntoVenta=0L;
				this.puntoventas.removeAll(puntoventasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPuntoVenta 
					&& this.puntoventaLogic.getPuntoVentas().size()>0
					) {
					puntoventaAux=this.puntoventaLogic.getPuntoVentas().get(this.puntoventaLogic.getPuntoVentas().size() - 1);
				
					if(puntoventaAux.getId()<0) {
						this.puntoventaLogic.getPuntoVentas().remove(puntoventaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPuntoVenta && this.puntoventas.size()>0) {
					puntoventaAux=this.puntoventas.get(this.puntoventas.size() - 1);
				
					if(puntoventaAux.getId()<0) {
						this.puntoventas.remove(puntoventaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPuntoVenta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(puntoventa.getId()<0) {
				this.puntoventaLogic.getPuntoVentas().remove(this.puntoventa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(puntoventa.getId()<0) {
				this.puntoventas.remove(this.puntoventa);
			}
		}			
	}
	
	public void setEstadosInicialesPuntoVenta(List<PuntoVenta> puntoventasAux) throws Exception {
		PuntoVentaConstantesFunciones.setEstadosInicialesPuntoVenta(puntoventasAux);
	}
	
	public void setEstadosInicialesPuntoVenta(PuntoVenta puntoventaAux) throws Exception {
		PuntoVentaConstantesFunciones.setEstadosInicialesPuntoVenta(puntoventaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPuntoVentaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPuntoVentaActual()) {
				if(!this.isEsNuevoPuntoVenta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPuntoVenta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPuntoVentaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Punto Venta ?", "MANTENIMIENTO DE Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PuntoVenta puntoventa) throws Exception {
		PuntoVentaConstantesFunciones.seleccionarAsignar(this.puntoventa,puntoventa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPuntoVenta=this.isPermisoActualizarOriginalPuntoVenta;
			
			
			this.seleccionarAsignar(puntoventa);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PuntoVentaConstantesFunciones.quitarEspaciosPuntoVenta(this.puntoventa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.puntoventaSessionBean.setsFuncionBusquedaRapida(this.puntoventaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPuntoVenta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPuntoVenta(esParaCancelar);				
				this.cancelarNuevoPuntoVenta(esParaCancelar);								
			}
			
			this.puntoventa=new PuntoVenta();
			
			this.inicializarPuntoVenta();
			
			this.actualizarEstadoCeldasBotonesPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPuntoVenta() throws Exception {
		try {
			PuntoVentaConstantesFunciones.inicializarPuntoVenta(this.puntoventa);
			
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
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.puntoventaLogic.getPuntoVentas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePuntoVentas(String sAccionBusqueda,List<PuntoVenta> puntoventasParaReportes) throws Exception {
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
					sPathReporteFinal="PuntoVenta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PuntoVentaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PuntoVentaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PuntoVenta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Punto Ventas");		
		parameters.put("busquedapor", PuntoVentaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePuntoVenta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePuntoVenta=new JRBeanArrayDataSource(PuntoVentaJInternalFrame.TraerPuntoVentaBeans(puntoventasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePuntoVenta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PuntoVentaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PuntoVentaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PuntoVentaBean.TraerPuntoVentaBeans(puntoventasParaReportes).toArray()));
							
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
				this.generarExcelReportePuntoVentas(sAccionBusqueda,sTipoArchivoReporte,puntoventasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,puntoventasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPuntoVentaActionPerformed(null);
					//this.generarExcelReportePuntoVentas(sAccionBusqueda,sTipoArchivoReporte,puntoventasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,puntoventasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,puntoventasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,puntoventasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<PuntoVenta> puntoventasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"puntoventa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PuntoVentas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPuntoVenta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PuntoVenta puntoventa : puntoventasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PuntoVentaConstantesFunciones.generarExcelReporteDataPuntoVenta("NORMAL",row,workbook,puntoventa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Punto Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPuntoVenta(String sTipo,Row row,Workbook workbook) {
		
		PuntoVentaConstantesFunciones.generarExcelReporteHeaderPuntoVenta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<PuntoVenta> puntoventasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"puntoventa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PuntoVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PuntoVenta puntoventa : puntoventasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PuntoVentaConstantesFunciones.getPuntoVentaDescripcion(puntoventa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PuntoVentaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PuntoVentaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(puntoventa.getcodigo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Punto Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<PuntoVenta> puntoventasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PuntoVenta> puntoventasRespaldo=null;
		
		classes=PuntoVentaConstantesFunciones.getClassesRelationshipsOfPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.puntoventaLogic.setDatosCliente(this.datosCliente);
		this.puntoventaLogic.setDatosDeep(this.datosDeep);
		this.puntoventaLogic.setIsConDeep(true);
		
		puntoventasRespaldo=this.puntoventaLogic.getPuntoVentas();
		
		this.puntoventaLogic.setPuntoVentas(puntoventasParaReportes);	
		this.puntoventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		puntoventasParaReportes=this.puntoventaLogic.getPuntoVentas();
		this.puntoventaLogic.setPuntoVentas(puntoventasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"puntoventa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PuntoVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPuntoVenta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PuntoVenta puntoventa : puntoventasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPuntoVenta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PuntoVentaConstantesFunciones.generarExcelReporteDataPuntoVenta("NORMAL",row,workbook,puntoventa,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PuntoVentaConstantesFunciones.getPuntoVentaDescripcion(puntoventa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Punto Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPuntoVenta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPuntoVenta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPuntoVenta() throws Exception {		
		this.startProcessPuntoVenta(true);
	}
	
	public void startProcessPuntoVenta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesPuntoVenta, this.jScrollPanelDatosPuntoVenta,this.jPanelPaginacionPuntoVenta, this.jScrollPanelDatosEdicionPuntoVenta, this.jPanelAccionesPuntoVenta,this.jPanelAccionesFormularioPuntoVenta,this.jmenuBarPuntoVenta,this.jmenuBarDetallePuntoVenta,this.jTtoolBarPuntoVenta,this.jTtoolBarDetallePuntoVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasPuntoVenta=null; 
		
		final JPanel jPanelParametrosReportesPuntoVenta=this.jPanelParametrosReportesPuntoVenta;
		//final JScrollPane jScrollPanelDatosPuntoVenta=this.jScrollPanelDatosPuntoVenta;
		final JTable jTableDatosPuntoVenta=this.jTableDatosPuntoVenta;		
		final JPanel jPanelPaginacionPuntoVenta=this.jPanelPaginacionPuntoVenta;
		//final JScrollPane jScrollPanelDatosEdicionPuntoVenta=this.jScrollPanelDatosEdicionPuntoVenta;
		final JPanel jPanelAccionesPuntoVenta=this.jPanelAccionesPuntoVenta;
		
		JPanel jPanelCamposAuxiliarPuntoVenta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPuntoVenta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) {
			jPanelCamposAuxiliarPuntoVenta=this.jInternalFrameDetalleFormPuntoVenta.jPanelCamposPuntoVenta;
			jPanelAccionesFormularioAuxiliarPuntoVenta=this.jInternalFrameDetalleFormPuntoVenta.jPanelAccionesFormularioPuntoVenta;
		}
		
		final JPanel jPanelCamposPuntoVenta=jPanelCamposAuxiliarPuntoVenta;
		final JPanel jPanelAccionesFormularioPuntoVenta=jPanelAccionesFormularioAuxiliarPuntoVenta;
		
		
		final JMenuBar jmenuBarPuntoVenta=this.jmenuBarPuntoVenta;
		final JToolBar jTtoolBarPuntoVenta=this.jTtoolBarPuntoVenta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPuntoVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPuntoVenta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) {
			jmenuBarDetalleAuxiliarPuntoVenta=this.jInternalFrameDetalleFormPuntoVenta.jmenuBarDetallePuntoVenta;
			jTtoolBarDetalleAuxiliarPuntoVenta=this.jInternalFrameDetalleFormPuntoVenta.jTtoolBarDetallePuntoVenta;
		}
		
		final JMenuBar jmenuBarDetallePuntoVenta=jmenuBarDetalleAuxiliarPuntoVenta;
		final JToolBar jTtoolBarDetallePuntoVenta=jTtoolBarDetalleAuxiliarPuntoVenta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPuntoVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPuntoVenta;
			processRunnable.jTableDatos=jTableDatosPuntoVenta;
			processRunnable.jPanelCampos=jPanelCamposPuntoVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionPuntoVenta;
			processRunnable.jPanelAcciones=jPanelAccionesPuntoVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPuntoVenta;
			
			
			processRunnable.jmenuBar=jmenuBarPuntoVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePuntoVenta;
			processRunnable.jTtoolBar=jTtoolBarPuntoVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePuntoVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPuntoVenta ,jPanelParametrosReportesPuntoVenta,jTableDatosPuntoVenta, /*jScrollPanelDatosPuntoVenta,*/jPanelCamposPuntoVenta,jPanelPaginacionPuntoVenta, /*jScrollPanelDatosEdicionPuntoVenta,*/ jPanelAccionesPuntoVenta,jPanelAccionesFormularioPuntoVenta,jmenuBarPuntoVenta,jmenuBarDetallePuntoVenta,jTtoolBarPuntoVenta,jTtoolBarDetallePuntoVenta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesPuntoVenta, jScrollPanelDatosPuntoVenta,jPanelPaginacionPuntoVenta, jScrollPanelDatosEdicionPuntoVenta, jPanelAccionesPuntoVenta,jPanelAccionesFormularioPuntoVenta,jmenuBarPuntoVenta,jmenuBarDetallePuntoVenta,jTtoolBarPuntoVenta,jTtoolBarDetallePuntoVenta);
						
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
	
	public void finishProcessPuntoVenta() {// throws Exception 
		this.finishProcessPuntoVenta(true);
	}
	
	public void finishProcessPuntoVenta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesPuntoVenta, this.jScrollPanelDatosPuntoVenta,this.jPanelPaginacionPuntoVenta, this.jScrollPanelDatosEdicionPuntoVenta, this.jPanelAccionesPuntoVenta,this.jPanelAccionesFormularioPuntoVenta,this.jmenuBarPuntoVenta,this.jmenuBarDetallePuntoVenta,this.jTtoolBarPuntoVenta,this.jTtoolBarDetallePuntoVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasPuntoVenta=null; 
		
		final JPanel jPanelParametrosReportesPuntoVenta=this.jPanelParametrosReportesPuntoVenta;
		//final JScrollPane jScrollPanelDatosPuntoVenta=this.jScrollPanelDatosPuntoVenta;
		final JTable jTableDatosPuntoVenta=this.jTableDatosPuntoVenta;		
		final JPanel jPanelPaginacionPuntoVenta=this.jPanelPaginacionPuntoVenta;
		//final JScrollPane jScrollPanelDatosEdicionPuntoVenta=this.jScrollPanelDatosEdicionPuntoVenta;
		final JPanel jPanelAccionesPuntoVenta=this.jPanelAccionesPuntoVenta;
		
		JPanel jPanelCamposAuxiliarPuntoVenta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPuntoVenta=new JPanel();
		
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) {
			jPanelCamposAuxiliarPuntoVenta=this.jInternalFrameDetalleFormPuntoVenta.jPanelCamposPuntoVenta;
			jPanelAccionesFormularioAuxiliarPuntoVenta=this.jInternalFrameDetalleFormPuntoVenta.jPanelAccionesFormularioPuntoVenta;
		}
		
		final JPanel jPanelCamposPuntoVenta=jPanelCamposAuxiliarPuntoVenta;
		final JPanel jPanelAccionesFormularioPuntoVenta=jPanelAccionesFormularioAuxiliarPuntoVenta;
		
		
		final JMenuBar jmenuBarPuntoVenta=this.jmenuBarPuntoVenta;		
		final JToolBar jTtoolBarPuntoVenta=this.jTtoolBarPuntoVenta;
				
		JMenuBar jmenuBarDetalleAuxiliarPuntoVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPuntoVenta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) {
			jmenuBarDetalleAuxiliarPuntoVenta=this.jInternalFrameDetalleFormPuntoVenta.jmenuBarDetallePuntoVenta;
			jTtoolBarDetalleAuxiliarPuntoVenta=this.jInternalFrameDetalleFormPuntoVenta.jTtoolBarDetallePuntoVenta;		
		}
		
		final JMenuBar jmenuBarDetallePuntoVenta=jmenuBarDetalleAuxiliarPuntoVenta;
		final JToolBar jTtoolBarDetallePuntoVenta=jTtoolBarDetalleAuxiliarPuntoVenta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPuntoVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPuntoVenta;
			processRunnable.jTableDatos=jTableDatosPuntoVenta;
			processRunnable.jPanelCampos=jPanelCamposPuntoVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionPuntoVenta;
			processRunnable.jPanelAcciones=jPanelAccionesPuntoVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPuntoVenta;
			
			
			processRunnable.jmenuBar=jmenuBarPuntoVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePuntoVenta;
			processRunnable.jTtoolBar=jTtoolBarPuntoVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePuntoVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPuntoVenta ,jPanelParametrosReportesPuntoVenta, jTableDatosPuntoVenta,/*jScrollPanelDatosPuntoVenta,*/jPanelCamposPuntoVenta,jPanelPaginacionPuntoVenta, /*jScrollPanelDatosEdicionPuntoVenta,*/ jPanelAccionesPuntoVenta,jPanelAccionesFormularioPuntoVenta,jmenuBarPuntoVenta,jmenuBarDetallePuntoVenta,jTtoolBarPuntoVenta,jTtoolBarDetallePuntoVenta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPuntoVenta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPuntoVenta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPuntoVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePuntoVenta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPuntoVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePuntoVenta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.puntoventaConstantesFunciones.getsFinalQueryPuntoVenta();
		String  finalQueryPaginacionTodos=this.puntoventaConstantesFunciones.getsFinalQueryPuntoVenta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PuntoVentaConstantesFunciones.getArrayColumnasGlobalesNoPuntoVenta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PuntoVentaConstantesFunciones.getArrayColumnasGlobalesPuntoVenta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PuntoVentaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.puntoventasEliminados= new ArrayList<PuntoVenta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPuntoVenta();
		
				///*PuntoVentaSessionBean*/this.puntoventaSessionBean=new PuntoVentaSessionBean();
			
			if(this.puntoventaSessionBean==null) {
				this.puntoventaSessionBean=new PuntoVentaSessionBean();
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
					this.iNumeroPaginacion=PuntoVentaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PuntoVentaConstantesFunciones.getClassesForeignKeysOfPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/puntoventa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			puntoventasAux= new ArrayList<PuntoVenta>();
			
				
			puntoventaLogic.setDatosCliente(this.datosCliente);
			puntoventaLogic.setDatosDeep(this.datosDeep);
			puntoventaLogic.setIsConDeep(true);
			
			
			puntoventaLogic.getPuntoVentaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					puntoventaLogic.getTodosPuntoVentas(finalQueryGlobal,pagination);
					
					//puntoventaLogic.getTodosPuntoVentasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(puntoventaLogic.getPuntoVentas()==null|| puntoventaLogic.getPuntoVentas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							puntoventasAux= new ArrayList<PuntoVenta>();
							puntoventasAux.addAll(puntoventaLogic.getPuntoVentas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							puntoventasAux= new ArrayList<PuntoVenta>();
							puntoventasAux.addAll(puntoventas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							puntoventaLogic.getTodosPuntoVentas(finalQueryGlobal+"",this.pagination);												
							
							//puntoventaLogic.getTodosPuntoVentasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePuntoVentas("Todos",puntoventaLogic.getPuntoVentas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							puntoventaLogic.setPuntoVentas(new ArrayList<PuntoVenta>());					
							puntoventaLogic.getPuntoVentas().addAll(puntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							puntoventas=new ArrayList<PuntoVenta>();
							puntoventas.addAll(puntoventasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPuntoVenta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPuntoVenta=this.idActual;
				
				} else if(this.idPuntoVentaActual!=null && this.idPuntoVentaActual!=0L) {
					idPuntoVenta=idPuntoVentaActual;
				}
				
					
				this.sDetalleReporte=PuntoVentaConstantesFunciones.getDetalleIndicePorId(idPuntoVenta);
				
				this.puntoventas=new ArrayList<PuntoVenta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					puntoventaLogic.getEntity(idPuntoVenta);
					
					//puntoventaLogic.getEntityWithConnection(idPuntoVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					puntoventaLogic.setPuntoVentas(new ArrayList<PuntoVenta>());
					puntoventaLogic.getPuntoVentas().add(puntoventaLogic.getPuntoVenta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.puntoventas=new ArrayList<PuntoVenta>();
					this.puntoventas.add(puntoventa);
				}
				
				if(puntoventaLogic.getPuntoVenta()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPuntoVenta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPuntoVenta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=puntoventaLogic.getPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=puntoventas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=puntoventaLogic.getPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=puntoventas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PuntoVenta puntoventa) {
		Boolean permite=true;
		
		if(this.puntoventa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PuntoVentaConstantesFunciones.getOrderByListaPuntoVenta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PuntoVentaConstantesFunciones.getOrderByListaPuntoVenta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PuntoVenta puntoventa:puntoventaLogic.getPuntoVentas()) {
				if(puntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					puntoventaTotales=puntoventa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PuntoVenta puntoventa:this.puntoventas) {
				if(puntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					puntoventaTotales=puntoventa;
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
			this.puntoventaAux=new PuntoVenta();
			this.puntoventaAux.setsType(Constantes2.S_TOTALES);
			this.puntoventaAux.setIsNew(false);
			this.puntoventaAux.setIsChanged(false);
			this.puntoventaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PuntoVentaConstantesFunciones.TotalizarValoresFilaPuntoVenta(this.puntoventaLogic.getPuntoVentas(),this.puntoventaAux);
				
				this.puntoventaLogic.getPuntoVentas().add(this.puntoventaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PuntoVentaConstantesFunciones.TotalizarValoresFilaPuntoVenta(this.puntoventas,this.puntoventaAux);
				
				this.puntoventas.add(this.puntoventaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		puntoventaTotales=new PuntoVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.puntoventaLogic.getPuntoVentas().remove(puntoventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.puntoventas.remove(puntoventaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		puntoventaTotales=new PuntoVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PuntoVenta puntoventa:puntoventaLogic.getPuntoVentas()) {
				if(puntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					puntoventaTotales=puntoventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PuntoVentaConstantesFunciones.TotalizarValoresFilaPuntoVenta(this.puntoventaLogic.getPuntoVentas(),puntoventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PuntoVenta puntoventa:this.puntoventas) {
				if(puntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					puntoventaTotales=puntoventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PuntoVentaConstantesFunciones.TotalizarValoresFilaPuntoVenta(this.puntoventas,puntoventaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosPuntoVenta() {
		this.isPermisoTodoPuntoVenta=false;
		this.isPermisoNuevoPuntoVenta=false;
		this.isPermisoActualizarPuntoVenta=false;
		this.isPermisoActualizarOriginalPuntoVenta=false;
		this.isPermisoEliminarPuntoVenta=false;
		this.isPermisoGuardarCambiosPuntoVenta=false;
		this.isPermisoConsultaPuntoVenta=false;
		this.isPermisoBusquedaPuntoVenta=false;
		this.isPermisoReportePuntoVenta=false;		
		this.isPermisoOrdenPuntoVenta=false;		
		this.isPermisoPaginacionMedioPuntoVenta=false;		
		this.isPermisoPaginacionAltoPuntoVenta=false;
		this.isPermisoPaginacionTodoPuntoVenta=false;
		this.isPermisoCopiarPuntoVenta=false;		
		this.isPermisoVerFormPuntoVenta=false;		
		this.isPermisoDuplicarPuntoVenta=false;		
		this.isPermisoOrdenPuntoVenta=false;		
	}
	
	public void setPermisosUsuarioPuntoVenta(Boolean isPermiso) {
		this.isPermisoTodoPuntoVenta=isPermiso;
		this.isPermisoNuevoPuntoVenta=isPermiso;
		this.isPermisoActualizarPuntoVenta=isPermiso;
		this.isPermisoActualizarOriginalPuntoVenta=isPermiso;
		this.isPermisoEliminarPuntoVenta=isPermiso;
		this.isPermisoGuardarCambiosPuntoVenta=isPermiso;
		this.isPermisoConsultaPuntoVenta=isPermiso;
		this.isPermisoBusquedaPuntoVenta=isPermiso;
		this.isPermisoReportePuntoVenta=isPermiso;
		this.isPermisoOrdenPuntoVenta=isPermiso;		
		this.isPermisoPaginacionMedioPuntoVenta=isPermiso;		
		this.isPermisoPaginacionAltoPuntoVenta=isPermiso;		
		this.isPermisoPaginacionTodoPuntoVenta=isPermiso;		
		this.isPermisoCopiarPuntoVenta=isPermiso;		
		this.isPermisoVerFormPuntoVenta=isPermiso;		
		this.isPermisoDuplicarPuntoVenta=isPermiso;
		this.isPermisoOrdenPuntoVenta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPuntoVenta(Boolean isPermiso) {
		//this.isPermisoTodoPuntoVenta=isPermiso;
		this.isPermisoNuevoPuntoVenta=isPermiso;
		this.isPermisoActualizarPuntoVenta=isPermiso;
		this.isPermisoActualizarOriginalPuntoVenta=isPermiso;
		this.isPermisoEliminarPuntoVenta=isPermiso;
		this.isPermisoGuardarCambiosPuntoVenta=isPermiso;
		//this.isPermisoConsultaPuntoVenta=isPermiso;
		//this.isPermisoBusquedaPuntoVenta=isPermiso;
		//this.isPermisoReportePuntoVenta=isPermiso;
		//this.isPermisoOrdenPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionMedioPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionAltoPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionTodoPuntoVenta=isPermiso;		
		//this.isPermisoCopiarPuntoVenta=isPermiso;		
		//this.isPermisoDuplicarPuntoVenta=isPermiso;
		//this.isPermisoOrdenPuntoVenta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPuntoVentaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPuntoVenta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPuntoVentaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPuntoVentaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPuntoVentaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPuntoVentaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPuntoVenta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.puntoventaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PuntoVentaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPuntoVenta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPuntoVenta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPuntoVenta=this.isPermisoActualizarPuntoVenta;
			this.isPermisoEliminarPuntoVenta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPuntoVenta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPuntoVenta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPuntoVenta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPuntoVenta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePuntoVenta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPuntoVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPuntoVenta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPuntoVenta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPuntoVenta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPuntoVenta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPuntoVenta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPuntoVenta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPuntoVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.puntoventaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPuntoVenta.setToolTipText(this.jTableDatosPuntoVenta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPuntoVenta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPuntoVenta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPuntoVenta() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyPuntoVentaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPuntoVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PuntoVentaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPuntoVentaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyPuntoVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPuntoVenta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyPuntoVenta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPuntoVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPuntoVenta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPuntoVenta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPuntoVenta(PuntoVenta puntoventa)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPuntoVenta(PuntoVenta puntoventa,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPuntoVenta()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPuntoVenta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPuntoVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPuntoVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPuntoVenta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPuntoVenta()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPuntoVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPuntoVenta()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public PuntoVentaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PuntoVentaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PuntoVentaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.puntoventaSessionBean=new PuntoVentaSessionBean(); 
		this.puntoventaConstantesFunciones=new PuntoVentaConstantesFunciones(); 
		this.puntoventaBean=new PuntoVenta();//(this.puntoventaConstantesFunciones); 		
		this.puntoventaReturnGeneral=new PuntoVentaParameterReturnGeneral(); 
		
		this.puntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.puntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPuntoVenta(true);
			
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
			
			this.puntoventaConstantesFunciones=new PuntoVentaConstantesFunciones(); 
			this.puntoventaBean=new PuntoVenta();//this.puntoventaConstantesFunciones); 			
			this.puntoventaReturnGeneral=new PuntoVentaParameterReturnGeneral(); 
		
			PuntoVentaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Punto Venta Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.puntoventa=new PuntoVenta();
			this.puntoventas = new ArrayList<PuntoVenta>();
			this.puntoventasAux = new ArrayList<PuntoVenta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic=new PuntoVentaLogic();
				this.puntoventaLogic.getNewConnexionToDeep("");
			}
			
			//this.puntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.puntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPuntoVenta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPuntoVenta);	
					}
					
					if(this.jInternalFrameImportacionPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPuntoVenta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPuntoVenta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPuntoVenta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPuntoVenta);
				this.jInternalFrameDetalleFormPuntoVenta.setVisible(false);
				this.jInternalFrameDetalleFormPuntoVenta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPuntoVenta);
					this.jInternalFrameReporteDinamicoPuntoVenta.setVisible(false);
					this.jInternalFrameReporteDinamicoPuntoVenta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPuntoVenta);
					this.jInternalFrameImportacionPuntoVenta.setVisible(false);
					this.jInternalFrameImportacionPuntoVenta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPuntoVenta);
					this.jInternalFrameOrderByPuntoVenta.setVisible(false);
					this.jInternalFrameOrderByPuntoVenta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPuntoVentaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PuntoVentaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.puntoventaReturnGeneral=new PuntoVentaParameterReturnGeneral();
			
			this.puntoventaParameterGeneral=new PuntoVentaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.puntoventaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.puntoventaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.puntoventaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PuntoVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.puntoventaSessionBean.getEsGuardarRelacionado(),this.puntoventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PuntoVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.puntoventaSessionBean.getEsGuardarRelacionado(),this.puntoventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPuntoVenta=false;
			this.isVisibilidadCeldaDuplicarPuntoVenta=true;
			this.isVisibilidadCeldaCopiarPuntoVenta=true;
			this.isVisibilidadCeldaVerFormPuntoVenta=true;
			this.isVisibilidadCeldaOrdenPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesPuntoVenta=false;
			this.isVisibilidadCeldaModificarPuntoVenta=false;
			this.isVisibilidadCeldaActualizarPuntoVenta=false;
			this.isVisibilidadCeldaEliminarPuntoVenta=false;
			this.isVisibilidadCeldaCancelarPuntoVenta=false;
			this.isVisibilidadCeldaGuardarPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosPuntoVenta=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPuntoVenta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPuntoVenta(false);
			
			this.setPermisosUsuarioPuntoVenta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.puntoventaSessionBean.getEsGuardarRelacionado() 
				|| (this.puntoventaSessionBean.getEsGuardarRelacionado() && this.puntoventaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPuntoVentaClasesRelacionadas();
			}
			
			if(this.puntoventaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPuntoVentaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPuntoVenta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPuntoVenta();
			}
			
			if(!this.isPermisoBusquedaPuntoVenta) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.puntoventaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPuntoVenta,this.isPermisoPaginacionMedioPuntoVenta,this.isPermisoPaginacionTodoPuntoVenta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PuntoVentaConstantesFunciones.getTiposSeleccionarPuntoVenta());
				
				this.tiposColumnasSelect=PuntoVentaConstantesFunciones.getTiposSeleccionarPuntoVenta(true);
				
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
			//if(!this.puntoventaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPuntoVenta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioPuntoVenta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioPuntoVenta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPuntoVenta() ;
			
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
				puntoventaImplementable= (PuntoVentaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PuntoVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				puntoventaImplementableHome= (PuntoVentaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PuntoVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.puntoventas= new ArrayList<PuntoVenta>();
			this.puntoventasEliminados= new ArrayList<PuntoVenta>();
						
			this.isEsNuevoPuntoVenta=false;
			this.esParaAccionDesdeFormularioPuntoVenta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPuntoVenta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPuntoVenta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.puntoventaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PuntoVentaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PuntoVentaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPuntoVenta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPuntoVenta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPuntoVenta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPuntoVenta();
			}
			
			PuntoVentaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPuntoVenta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PuntoVenta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPuntoVenta() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPuntoVenta")) {
				iIndex=this.jInternalFrameDetalleFormPuntoVenta.jTabbedPaneRelacionesPuntoVenta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPuntoVenta.jTabbedPaneRelacionesPuntoVenta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPuntoVenta.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPuntoVenta();	
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
	
	public void cargarCombosForeignKeyPuntoVenta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPuntoVenta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPuntoVenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPuntoVentaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPuntoVenta();
		
		this.cargarCombosFrameForeignKeyPuntoVenta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPuntoVenta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPuntoVenta();
		}
	}
	
	
	
	public void jButtonNuevoPuntoVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.puntoventaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
			
			
			if(jTableDatosPuntoVenta.getRowCount()>=1) {
				jTableDatosPuntoVenta.removeRowSelectionInterval(0, jTableDatosPuntoVenta.getRowCount()-1);						
			}
			
			this.isEsNuevoPuntoVenta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPuntoVenta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPuntoVenta(true);			
			//this.puntoventa=new PuntoVenta();
			//this.puntoventa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPuntoVenta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPuntoVenta() ;
			
			if(PuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePuntoVenta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.puntoventa);	
			this.actualizarInformacion("INFO_PADRE",false,this.puntoventa);				
			
			PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
			
			if(this.puntoventaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PuntoVenta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPuntoVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PuntoVenta> puntoventasSeleccionados=new ArrayList<PuntoVenta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPuntoVenta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPuntoVenta.getSelectedRows().length;			
			}
			
			puntoventasSeleccionados=this.getPuntoVentasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPuntoVenta--;			
				//PuntoVenta puntoventaAux= new PuntoVenta();			
				//puntoventaAux.setId(this.iIdNuevoPuntoVenta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PuntoVenta puntoventaOrigen=new PuntoVenta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PuntoVenta puntoventaOrigen : puntoventasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPuntoVenta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							puntoventaOrigen =(PuntoVenta) this.puntoventaLogic.getPuntoVentas().toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							puntoventaOrigen =(PuntoVenta) this.puntoventas.toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPuntoVenta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.puntoventa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPuntoVenta(puntoventaOrigen,this.puntoventa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPuntoVenta(this.puntoventa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.puntoventaLogic.getPuntoVentas().add(this.puntoventaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.puntoventas.add(this.puntoventaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPuntoVenta(false);
				
				this.jTableDatosPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoPuntoVenta(), this.getIndiceNuevoPuntoVenta());
				
				int iLastRow =  this.jTableDatosPuntoVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPuntoVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPuntoVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPuntoVenta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PuntoVenta> puntoventasSeleccionados=new ArrayList<PuntoVenta>();									
		
			PuntoVenta puntoventaOrigen=new PuntoVenta();
			PuntoVenta puntoventaDestino=new PuntoVenta();
				
			puntoventasSeleccionados=this.getPuntoVentasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPuntoVenta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || puntoventasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPuntoVenta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						puntoventaOrigen =(PuntoVenta) this.puntoventaLogic.getPuntoVentas().toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						puntoventaOrigen =(PuntoVenta) this.puntoventas.toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						puntoventaDestino =(PuntoVenta) this.puntoventaLogic.getPuntoVentas().toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						puntoventaDestino =(PuntoVenta) this.puntoventas.toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				puntoventaOrigen =puntoventasSeleccionados.get(0);
				puntoventaDestino =puntoventasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPuntoVenta(puntoventaOrigen,puntoventaDestino,true,false);
				
				puntoventaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(puntoventaDestino,puntoventaLogic.getPuntoVentas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(puntoventaDestino,puntoventas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPuntoVenta(false);
				
				//this.jTableDatosPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoPuntoVenta(), this.getIndiceNuevoPuntoVenta());
				
				int iLastRow =  this.jTableDatosPuntoVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPuntoVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPuntoVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPuntoVenta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPuntoVenta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPuntoVenta.isVisible();
			
			
			this.jPanelParametrosReportesPuntoVenta.setVisible(!isVisible);
			this.jPanelPaginacionPuntoVenta.setVisible(!isVisible);
			this.jPanelAccionesPuntoVenta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePuntoVenta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPuntoVenta();
			
			this.abrirFrameOrderByPuntoVenta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePuntoVenta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPuntoVenta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPuntoVenta.isMaximum()) {
					this.jInternalFrameDetalleFormPuntoVenta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPuntoVenta.setSize(this.jInternalFrameDetalleFormPuntoVenta.iWidthFormulario,this.jInternalFrameDetalleFormPuntoVenta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPuntoVenta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPuntoVenta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPuntoVenta.isMaximum()) {
						this.jInternalFrameDetalleFormPuntoVenta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPuntoVenta.jContentPaneDetallePuntoVenta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPuntoVenta.jTabbedPaneRelacionesPuntoVenta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPuntoVenta.jContentPaneDetallePuntoVenta.getWidth(),PuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPuntoVenta.jTabbedPaneRelacionesPuntoVenta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPuntoVenta.jContentPaneDetallePuntoVenta.getWidth(),PuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPuntoVenta.jTabbedPaneRelacionesPuntoVenta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPuntoVenta.jContentPaneDetallePuntoVenta.getWidth(),PuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPuntoVenta.setVisible(true);
	        this.jInternalFrameDetalleFormPuntoVenta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPuntoVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPuntoVenta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPuntoVenta,false,this);
				} else {
					this.jInternalFrameOrderByPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPuntoVenta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPuntoVenta);
				this.jInternalFrameOrderByPuntoVenta.setVisible(false);
				this.jInternalFrameOrderByPuntoVenta.setSelected(false);
				
				this.jInternalFrameOrderByPuntoVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPuntoVenta"));
				
				this.inicializarActualizarBindingTablaOrderByPuntoVenta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPuntoVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPuntoVenta==null) {
				
				this.jInternalFrameImportacionPuntoVenta=new ImportacionJInternalFrame(PuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPuntoVenta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPuntoVenta);
				this.jInternalFrameImportacionPuntoVenta.setVisible(false);
				this.jInternalFrameImportacionPuntoVenta.setSelected(false);


				this.jInternalFrameImportacionPuntoVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPuntoVenta"));
				this.jInternalFrameImportacionPuntoVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPuntoVenta"));
				this.jInternalFrameImportacionPuntoVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPuntoVenta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPuntoVenta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPuntoVenta==null) {
				this.jInternalFrameReporteDinamicoPuntoVenta=new ReporteDinamicoJInternalFrame(PuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPuntoVenta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPuntoVenta);
				this.jInternalFrameReporteDinamicoPuntoVenta.setVisible(false);
				this.jInternalFrameReporteDinamicoPuntoVenta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPuntoVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPuntoVenta"));
				this.jInternalFrameReporteDinamicoPuntoVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPuntoVenta"));
				this.jInternalFrameReporteDinamicoPuntoVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPuntoVenta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPuntoVenta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePuntoVenta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPuntoVenta);
			
	       	this.jInternalFrameDetalleFormPuntoVenta.setVisible(false);
	        this.jInternalFrameDetalleFormPuntoVenta.setSelected(false);
			
			//this.jInternalFrameDetalleFormPuntoVenta.dispose();
			//this.jInternalFrameDetalleFormPuntoVenta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPuntoVenta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPuntoVenta.setVisible(true);
	        this.jInternalFrameReporteDinamicoPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPuntoVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPuntoVenta.setVisible(true);
	        this.jInternalFrameImportacionPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPuntoVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPuntoVenta.setVisible(true);
	        this.jInternalFrameOrderByPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPuntoVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPuntoVenta.setVisible(false);
	        this.jInternalFrameOrderByPuntoVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPuntoVenta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPuntoVenta.setVisible(false);
	        this.jInternalFrameReporteDinamicoPuntoVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPuntoVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPuntoVenta.setVisible(false);
	        this.jInternalFrameImportacionPuntoVenta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPuntoVenta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPuntoVenta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPuntoVenta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPuntoVenta(true);
			//this.isEsNuevoPuntoVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventa =(PuntoVenta) this.puntoventaLogic.getPuntoVentas().toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.puntoventa =(PuntoVenta) this.puntoventas.toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPuntoVenta(false) ;
			
			if(puntoventaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePuntoVenta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPuntoVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPuntoVentaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntoventa =(PuntoVenta) this.puntoventaLogic.getPuntoVentas().toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.puntoventa =(PuntoVenta) this.puntoventas.toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPuntoVenta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPuntoVenta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPuntoVenta(true);
			//this.isEsNuevoPuntoVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventa =(PuntoVenta) this.puntoventaLogic.getPuntoVentas().toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.puntoventa =(PuntoVenta) this.puntoventas.toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.puntoventa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPuntoVenta(false) ;
			
			if(PuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePuntoVenta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPuntoVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPuntoVenta(false);
			
			//if(!this.isEsNuevoPuntoVenta) {								
				int intSelectedRow = this.jTableDatosPuntoVenta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntoventa =(PuntoVenta) this.puntoventaLogic.getPuntoVentas().toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.puntoventa =(PuntoVenta) this.puntoventas.toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPuntoVenta(this.puntoventa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPuntoVenta(this.puntoventa);
				
			}
			
			if(this.permiteMantenimiento(this.puntoventa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.puntoventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPuntoVenta=true;
					this.inicializarActualizarBindingTablaPuntoVenta(false);
					this.isEsNuevoPuntoVenta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPuntoVenta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPuntoVenta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPuntoVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPuntoVenta(false);
				
				this.habilitarDeshabilitarControlesPuntoVenta(false);
			
												
				
				if(PuntoVentaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePuntoVenta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPuntoVentaActionPerformed(evt,puntoventaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPuntoVenta(this.puntoventa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPuntoVenta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,puntoventaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.puntoventa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PuntoVenta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PuntoVenta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPuntoVenta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventa =(PuntoVenta) this.puntoventaLogic.getPuntoVentas().toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				this.puntoventa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.puntoventa =(PuntoVenta) this.puntoventas.toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				this.puntoventa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.puntoventa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.puntoventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PuntoVentaModel) this.jTableDatosPuntoVenta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPuntoVenta=true;
				this.inicializarActualizarBindingTablaPuntoVenta(false);
				this.isEsNuevoPuntoVenta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPuntoVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPuntoVenta(false);
				
				this.habilitarDeshabilitarControlesPuntoVenta(false);
				
				
				
				if(PuntoVentaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePuntoVenta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPuntoVentaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPuntoVenta.getRowCount()>=1) {
				jTableDatosPuntoVenta.removeRowSelectionInterval(0, jTableDatosPuntoVenta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPuntoVenta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPuntoVenta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPuntoVenta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPuntoVenta(false) ;
			
			this.isEsNuevoPuntoVenta=false;
			
			if(PuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePuntoVenta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPuntoVenta(false);
				
				//SI ES MANUAL
				if(PuntoVentaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPuntoVenta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPuntoVenta--;			
			//PuntoVenta puntoventaAux= new PuntoVenta();			
			//puntoventaAux.setId(this.iIdNuevoPuntoVenta);
			
			if(this.jInternalFrameDetalleFormPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPuntoVenta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPuntoVenta(this.puntoventa);
			
			this.puntoventa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.puntoventaLogic.getPuntoVentas().add(this.puntoventaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.puntoventas.add(this.puntoventaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPuntoVenta(false);
			
			this.jTableDatosPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoPuntoVenta(), this.getIndiceNuevoPuntoVenta());
			
			int iLastRow =  this.jTableDatosPuntoVenta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPuntoVenta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPuntoVenta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPuntoVenta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPuntoVenta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPuntoVenta(false);
			
			//SI ES MANUAL
			if(PuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPuntoVenta();
			}
			
			//this.abrirFrameTreePuntoVenta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Punto VentaS ?", "MANTENIMIENTO DE Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPuntoVenta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPuntoVenta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.puntoventaReturnGeneral=puntoventaLogic.procesarImportacionPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.puntoventaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPuntoVentaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPuntoVenta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPuntoVenta.setFileImportacion(this.jInternalFrameImportacionPuntoVenta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPuntoVenta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPuntoVenta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPuntoVenta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPuntoVenta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PuntoVenta> puntoventasSeleccionados=new ArrayList<PuntoVenta>();		

		puntoventasSeleccionados=this.getPuntoVentasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPuntoVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PuntoVentaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PuntoVentaBaseDesign.jrxml";
			
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
			
			this.generarReportePuntoVentas("Todos",puntoventasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PuntoVentaConstantesFunciones.LABEL_CODIGO:
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
		
		if(this.jInternalFrameReporteDinamicoPuntoVenta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPuntoVenta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPuntoVenta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PuntoVentaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPuntoVenta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PuntoVentaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPuntoVenta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPuntoVenta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PuntoVentaConstantesFunciones.LABEL_CODIGO:
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
	
	public void jButtonGenerarExcelReporteDinamicoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PuntoVenta> puntoventasSeleccionados=new ArrayList<PuntoVenta>();		
		
		puntoventasSeleccionados=this.getPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"puntoventa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PuntoVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PuntoVentaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PuntoVentaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(PuntoVenta puntoventa:puntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(puntoventa.getcodigo());
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
			//	this.getFilaCabeceraExportarExcelPuntoVenta(row);				
			//	iRow++;
			//}				
			
			//for(PuntoVenta puntoventaAux:puntoventasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPuntoVenta(puntoventaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Punto Venta",JOptionPane.INFORMATION_MESSAGE);
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
				this.puntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPuntoVenta(false);
			
			//SI ES MANUAL
			if(PuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPuntoVenta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPuntoVenta(false);
			
			//SI ES MANUAL
			if(PuntoVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPuntoVenta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPuntoVenta(false);
			
			//SI ES MANUAL
			if(PuntoVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPuntoVenta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPuntoVenta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPuntoVenta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPuntoVenta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPuntoVenta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPuntoVenta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPuntoVenta.setMinimumSize(dimensionMinimum);
		this.jTableDatosPuntoVenta.setMaximumSize(dimensionMaximum);
		this.jTableDatosPuntoVenta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPuntoVenta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPuntoVenta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPuntoVenta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPuntoVenta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPuntoVenta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.puntoventaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPuntoVenta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPuntoVenta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPuntoVenta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPuntoVenta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPuntoVenta();
		
		this.inicializarActualizarBindingBotonesManualPuntoVenta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.puntoventaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPuntoVenta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPuntoVenta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPuntoVenta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPuntoVenta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPuntoVenta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPuntoVenta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePuntoVenta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPuntoVenta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPuntoVenta.jCheckBoxPostAccionNuevoPuntoVenta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPuntoVenta.jCheckBoxPostAccionSinCerrarPuntoVenta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPuntoVenta.jCheckBoxPostAccionSinMensajePuntoVenta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPuntoVenta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPuntoVenta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePuntoVenta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPuntoVenta!=null) {
				this.jInternalFrameDetalleFormPuntoVenta.jCheckBoxPostAccionNuevoPuntoVenta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPuntoVenta.jCheckBoxPostAccionSinCerrarPuntoVenta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPuntoVenta.jCheckBoxPostAccionSinMensajePuntoVenta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPuntoVenta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPuntoVenta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPuntoVenta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPuntoVenta.jComboBoxTiposAccionesFormularioPuntoVenta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPuntoVenta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPuntoVenta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPuntoVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPuntoVenta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPuntoVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPuntoVenta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPuntoVenta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPuntoVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPuntoVenta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPuntoVenta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPuntoVenta(Boolean esInicializar) throws Exception {
		try	{	
			if(PuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPuntoVenta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPuntoVenta() throws Exception {
		try	{
			if(PuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPuntoVenta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePuntoVenta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPuntoVenta.jComboBoxTiposAccionesFormularioPuntoVenta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPuntoVenta.jComboBoxTiposAccionesFormularioPuntoVenta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPuntoVenta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPuntoVenta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPuntoVenta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPuntoVenta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPuntoVenta.addItem(reporte);
			}
			
			
			if(!this.puntoventaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPuntoVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPuntoVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPuntoVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPuntoVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPuntoVenta.jComboBoxTiposAccionesFormularioPuntoVenta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPuntoVenta.jComboBoxTiposAccionesFormularioPuntoVenta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPuntoVenta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPuntoVenta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPuntoVenta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPuntoVenta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoPuntoVenta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPuntoVenta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPuntoVenta!=null) {
				
				if(this.jInternalFrameReporteDinamicoPuntoVenta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPuntoVenta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPuntoVenta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPuntoVenta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPuntoVenta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPuntoVenta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPuntoVenta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPuntoVenta(Boolean esInicializar) throws Exception {				
		if(PuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPuntoVenta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPuntoVenta() throws Exception {
		this.inicializarActualizarBindingTablaPuntoVenta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPuntoVenta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPuntoVenta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPuntoVenta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PuntoVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPuntoVenta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PuntoVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPuntoVentaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPuntoVentaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PuntoVentaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPuntoVenta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PuntoVentaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPuntoVenta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPuntoVenta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=puntoventaLogic.getPuntoVentas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=puntoventas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPuntoVenta.setModel(new PuntoVentaModel(this.puntoventaLogic.getPuntoVentas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPuntoVenta.setModel(new PuntoVentaModel(this.puntoventas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPuntoVenta!=null && this.jInternalFrameOrderByPuntoVenta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPuntoVenta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPuntoVenta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PuntoVentaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO,puntoventaConstantesFunciones.resaltarSeleccionarPuntoVenta,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO,puntoventaConstantesFunciones.resaltarSeleccionarPuntoVenta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPuntoVenta,PuntoVentaConstantesFunciones.LABEL_ID));

		if(this.puntoventaConstantesFunciones.mostraridPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PuntoVentaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.puntoventaConstantesFunciones.resaltaridPuntoVenta,this.puntoventaConstantesFunciones.activaridPuntoVenta,this,true,"idPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.puntoventaConstantesFunciones.resaltaridPuntoVenta,this.puntoventaConstantesFunciones.activaridPuntoVenta,this,true,"idPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPuntoVenta,PuntoVentaConstantesFunciones.LABEL_CODIGO));

		if(this.puntoventaConstantesFunciones.mostrarcodigoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PuntoVentaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.puntoventaConstantesFunciones.resaltarcodigoPuntoVenta,this.puntoventaConstantesFunciones.activarcodigoPuntoVenta,this,true,"codigoPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.puntoventaConstantesFunciones.resaltarcodigoPuntoVenta,this.puntoventaConstantesFunciones.activarcodigoPuntoVenta,this,true,"codigoPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.puntoventaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.puntoventaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.puntoventaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPuntoVenta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.puntoventaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.puntoventaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPuntoVenta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPuntoVenta && this.isPermisoGuardarCambiosPuntoVenta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.puntoventaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.puntoventaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPuntoVenta.addColumn(tableColumn);
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
			
			this.jTableDatosPuntoVenta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPuntoVenta && this.isPermisoGuardarCambiosPuntoVenta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPuntoVenta && this.isPermisoGuardarCambiosPuntoVenta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPuntoVenta.moveColumn(this.jTableDatosPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPuntoVenta.moveColumn(this.jTableDatosPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPuntoVenta.moveColumn(this.jTableDatosPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPuntoVenta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPuntoVenta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPuntoVenta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPuntoVenta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPuntoVenta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPuntoVenta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPuntoVenta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=puntoventaLogic.getPuntoVentas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=puntoventas.size()-1;
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
		//this.jTableDatosPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPuntoVenta();
			
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
				
				//this.isEsNuevoPuntoVenta=false;
					
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
			
				if(this.puntoventaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPuntoVenta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPuntoVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPuntoVenta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntoventa =(PuntoVenta) this.puntoventaLogic.getPuntoVentas().toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.puntoventa =(PuntoVenta) this.puntoventas.toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.puntoventa.getsType().equals("DUPLICADO")
				   || this.puntoventa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPuntoVenta=true;
				
				} else {
					this.isEsNuevoPuntoVenta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.puntoventaSessionBean.getEsGuardarRelacionado()) {
					if(this.puntoventa.getId()>=0 && !this.puntoventa.getIsNew()) {						
						this.isEsNuevoPuntoVenta=false;
						
					} else {
						this.isEsNuevoPuntoVenta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPuntoVenta(esRelaciones);						
				
				this.seleccionarPuntoVenta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.puntoventa.getId()<0) {
					this.isEsNuevoPuntoVenta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPuntoVenta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPuntoVenta(evt,rowIndex);
				}	
				
				if(this.puntoventaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PuntoVenta: " + this.dDif); 
					}
				}								
				
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPuntoVenta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.puntoventa)) {
					if(this.puntoventa.getId()>0) {
						this.puntoventa.setIsDeleted(true);
						
						this.puntoventasEliminados.add(this.puntoventa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.puntoventaLogic.getPuntoVentas().remove(this.puntoventa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.puntoventas.remove(this.puntoventa);				
					}
					
					
					((PuntoVentaModel) this.jTableDatosPuntoVenta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPuntoVenta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPuntoVenta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPuntoVenta) {
			
			if(this.jInternalFrameDetalleFormPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPuntoVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPuntoVenta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntoventa =(PuntoVenta) this.puntoventaLogic.getPuntoVentas().toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.puntoventa =(PuntoVenta) this.puntoventas.toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPuntoVenta(this.puntoventa);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPuntoVenta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPuntoVenta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPuntoVenta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPuntoVenta(PuntoVenta puntoventa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPuntoVenta(puntoventa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPuntoVenta(PuntoVenta puntoventa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPuntoVenta(puntoventa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPuntoVenta(puntoventa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPuntoVenta(puntoventa);
	}
	
	public void setVariablesObjetoActualToFormularioPuntoVenta(PuntoVenta puntoventa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPuntoVenta.jLabelidPuntoVenta.setText(puntoventa.getId().toString());
			this.jInternalFrameDetalleFormPuntoVenta.jTextFieldcodigoPuntoVenta.setText(puntoventa.getcodigo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PuntoVenta puntoventaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,puntoventaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PuntoVenta puntoventaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				puntoventaLocal=this.puntoventa;
			} else {
				puntoventaLocal=this.puntoventaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(puntoventaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPuntoVenta(puntoventaLocal,true);
					
					if(puntoventaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(puntoventaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.puntoventaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(puntoventaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPuntoVenta(PuntoVenta puntoventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPuntoVenta(puntoventa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPuntoVenta(puntoventa);
	}
	
	public void setVariablesFormularioToObjetoActualPuntoVenta(PuntoVenta puntoventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPuntoVenta(puntoventa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPuntoVenta(PuntoVenta puntoventa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPuntoVenta.jLabelidPuntoVenta.getText()==null || this.jInternalFrameDetalleFormPuntoVenta.jLabelidPuntoVenta.getText()=="" || this.jInternalFrameDetalleFormPuntoVenta.jLabelidPuntoVenta.getText()=="Id") {
				this.jInternalFrameDetalleFormPuntoVenta.jLabelidPuntoVenta.setText("0");
			}

			if(conColumnasBase) {puntoventa.setId(Long.parseLong(this.jInternalFrameDetalleFormPuntoVenta.jLabelidPuntoVenta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PuntoVentaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPuntoVenta.jLabelIdPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			puntoventa.setcodigo(this.jInternalFrameDetalleFormPuntoVenta.jTextFieldcodigoPuntoVenta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PuntoVentaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPuntoVenta.jLabelcodigoPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPuntoVenta(PuntoVenta puntoventaBean,PuntoVenta puntoventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPuntoVenta(PuntoVenta puntoventaOrigen,PuntoVenta puntoventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && puntoventaOrigen.getId()!=null && !puntoventaOrigen.getId().equals(0L))) {puntoventa.setId(puntoventaOrigen.getId());}}
			if(conDefault || (!conDefault && puntoventaOrigen.getcodigo()!=null && !puntoventaOrigen.getcodigo().equals(""))) {puntoventa.setcodigo(puntoventaOrigen.getcodigo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPuntoVenta(PuntoVenta puntoventa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPuntoVenta.jLabelidPuntoVenta.setText(puntoventa.getId().toString());
			this.jInternalFrameDetalleFormPuntoVenta.jTextFieldcodigoPuntoVenta.setText(puntoventa.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPuntoVenta(PuntoVentaBean puntoventaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPuntoVenta.jLabelidPuntoVenta.setText(puntoventaBean.getId().toString());
			this.jInternalFrameDetalleFormPuntoVenta.jTextFieldcodigoPuntoVenta.setText(puntoventaBean.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPuntoVenta(PuntoVentaParameterReturnGeneral puntoventaReturnGeneral,PuntoVentaBean puntoventaBean,Boolean conDefault) throws Exception { 
		try {
			PuntoVenta puntoventaLocal=new PuntoVenta();
			
			puntoventaLocal=puntoventaReturnGeneral.getPuntoVenta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && puntoventaLocal.getId()!=null && !puntoventaLocal.getId().equals(0L))) {puntoventaBean.setId(puntoventaLocal.getId());}}
			if(conDefault || (!conDefault && puntoventaLocal.getcodigo()!=null && !puntoventaLocal.getcodigo().equals(""))) {puntoventaBean.setcodigo(puntoventaLocal.getcodigo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPuntoVentaGenerico(Long idPuntoVentaSeleccionado,JComboBox jComboBoxPuntoVenta,List<PuntoVenta> puntoventasLocal)throws Exception {
		try {
			PuntoVenta  puntoventaTemp=null;

			for(PuntoVenta puntoventaAux:puntoventasLocal) {
				if(puntoventaAux.getId()!=null && puntoventaAux.getId().equals(idPuntoVentaSeleccionado)) {
					puntoventaTemp=puntoventaAux;
					break;
				}
			}

			jComboBoxPuntoVenta.setSelectedItem(puntoventaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPuntoVentaGenerico(JComboBox jComboBoxPuntoVenta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPuntoVenta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPuntoVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPuntoVenta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPuntoVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			puntoventa=(PuntoVenta) puntoventaLogic.getPuntoVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			puntoventa =(PuntoVenta) puntoventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PuntoVenta puntoventaRow=new PuntoVenta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			puntoventaRow=(PuntoVenta) puntoventaLogic.getPuntoVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			puntoventaRow=(PuntoVenta) puntoventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPuntoVenta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoPuntoVenta && this.isPermisoNuevoPuntoVenta));			
			this.jButtonDuplicarPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarPuntoVenta && this.isPermisoDuplicarPuntoVenta));			
			this.jButtonCopiarPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarPuntoVenta && this.isPermisoCopiarPuntoVenta));
			this.jButtonVerFormPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormPuntoVenta && this.isPermisoVerFormPuntoVenta));
			
			this.jButtonAbrirOrderByPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenPuntoVenta && this.isPermisoOrdenPuntoVenta));			
			
			this.jButtonNuevoRelacionesPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesPuntoVenta && this.isPermisoNuevoPuntoVenta));			
			this.jButtonNuevoGuardarCambiosPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoPuntoVenta && this.isPermisoNuevoPuntoVenta && this.isPermisoGuardarCambiosPuntoVenta));
			
			if(this.jInternalFrameDetalleFormPuntoVenta!=null) {
			this.jInternalFrameDetalleFormPuntoVenta.jButtonModificarPuntoVenta.setVisible((this.isVisibilidadCeldaModificarPuntoVenta && this.isPermisoActualizarPuntoVenta));	
			this.jInternalFrameDetalleFormPuntoVenta.jButtonActualizarPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarPuntoVenta && this.isPermisoActualizarPuntoVenta));	
			this.jInternalFrameDetalleFormPuntoVenta.jButtonEliminarPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarPuntoVenta && this.isPermisoEliminarPuntoVenta));
			this.jInternalFrameDetalleFormPuntoVenta.jButtonCancelarPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarPuntoVenta);							
			this.jInternalFrameDetalleFormPuntoVenta.jButtonGuardarCambiosPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarPuntoVenta && this.isPermisoGuardarCambiosPuntoVenta));			
			
			}
						
			this.jButtonGuardarCambiosTablaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosPuntoVenta && this.isPermisoGuardarCambiosPuntoVenta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoPuntoVenta && this.isPermisoNuevoPuntoVenta));						
			this.jButtonDuplicarToolBarPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarPuntoVenta && this.isPermisoDuplicarPuntoVenta));						
			this.jButtonCopiarToolBarPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarPuntoVenta && this.isPermisoCopiarPuntoVenta));			
			this.jButtonVerFormToolBarPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormPuntoVenta && this.isPermisoVerFormPuntoVenta));			
			this.jButtonAbrirOrderByToolBarPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenPuntoVenta && this.isPermisoOrdenPuntoVenta));
			this.jButtonNuevoRelacionesToolBarPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesPuntoVenta && this.isPermisoNuevoPuntoVenta));			
			this.jButtonNuevoGuardarCambiosToolBarPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoPuntoVenta && this.isPermisoNuevoPuntoVenta && this.isPermisoGuardarCambiosPuntoVenta));			
			
			if(this.jInternalFrameDetalleFormPuntoVenta!=null) {
			this.jInternalFrameDetalleFormPuntoVenta.jButtonModificarToolBarPuntoVenta.setVisible((this.isVisibilidadCeldaModificarPuntoVenta && this.isPermisoActualizarPuntoVenta));	
			this.jInternalFrameDetalleFormPuntoVenta.jButtonActualizarToolBarPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarPuntoVenta  && this.isPermisoActualizarPuntoVenta));	
			this.jInternalFrameDetalleFormPuntoVenta.jButtonEliminarToolBarPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarPuntoVenta && this.isPermisoEliminarPuntoVenta));
			this.jInternalFrameDetalleFormPuntoVenta.jButtonCancelarToolBarPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarPuntoVenta);				
			this.jInternalFrameDetalleFormPuntoVenta.jButtonGuardarCambiosToolBarPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarPuntoVenta && this.isPermisoGuardarCambiosPuntoVenta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosPuntoVenta && this.isPermisoGuardarCambiosPuntoVenta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoPuntoVenta && this.isPermisoNuevoPuntoVenta));			
			this.jMenuItemDuplicarPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarPuntoVenta && this.isPermisoDuplicarPuntoVenta));			
			this.jMenuItemCopiarPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarPuntoVenta && this.isPermisoCopiarPuntoVenta));			
			this.jMenuItemVerFormPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormPuntoVenta && this.isPermisoVerFormPuntoVenta));			
			this.jMenuItemAbrirOrderByPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenPuntoVenta && this.isPermisoOrdenPuntoVenta));			
			//this.jMenuItemMostrarOcultarPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenPuntoVenta && this.isPermisoOrdenPuntoVenta));
			this.jMenuItemDetalleAbrirOrderByPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenPuntoVenta && this.isPermisoOrdenPuntoVenta));			
			//this.jMenuItemDetalleMostrarOcultarPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenPuntoVenta && this.isPermisoOrdenPuntoVenta));			
			this.jMenuItemNuevoRelacionesPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesPuntoVenta && this.isPermisoNuevoPuntoVenta));			
			this.jMenuItemNuevoGuardarCambiosPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoPuntoVenta && this.isPermisoNuevoPuntoVenta && this.isPermisoGuardarCambiosPuntoVenta));									
			
			if(this.jInternalFrameDetalleFormPuntoVenta!=null) {
			this.jInternalFrameDetalleFormPuntoVenta.jMenuItemModificarPuntoVenta.setVisible((this.isVisibilidadCeldaModificarPuntoVenta && this.isPermisoActualizarPuntoVenta));	
			this.jInternalFrameDetalleFormPuntoVenta.jMenuItemActualizarPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarPuntoVenta && this.isPermisoActualizarPuntoVenta));	
			this.jInternalFrameDetalleFormPuntoVenta.jMenuItemEliminarPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarPuntoVenta && this.isPermisoEliminarPuntoVenta));
			this.jInternalFrameDetalleFormPuntoVenta.jMenuItemCancelarPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarPuntoVenta);				
			}
			
			this.jMenuItemGuardarCambiosPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarPuntoVenta && this.isPermisoGuardarCambiosPuntoVenta));						
			this.jMenuItemGuardarCambiosTablaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosPuntoVenta && this.isPermisoGuardarCambiosPuntoVenta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPuntoVenta=this.jButtonNuevoPuntoVenta.isVisible();
			this.isVisibilidadCeldaDuplicarPuntoVenta=this.jButtonDuplicarPuntoVenta.isVisible();
			this.isVisibilidadCeldaCopiarPuntoVenta=this.jButtonCopiarPuntoVenta.isVisible();
			this.isVisibilidadCeldaVerFormPuntoVenta=this.jButtonVerFormPuntoVenta.isVisible();
			
			this.isVisibilidadCeldaOrdenPuntoVenta=this.jButtonAbrirOrderByPuntoVenta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPuntoVenta=this.jButtonNuevoRelacionesPuntoVenta.isVisible();
			this.isVisibilidadCeldaModificarPuntoVenta=this.jButtonModificarPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormPuntoVenta!=null) {
			this.isVisibilidadCeldaActualizarPuntoVenta=this.jInternalFrameDetalleFormPuntoVenta.jButtonActualizarPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarPuntoVenta=this.jInternalFrameDetalleFormPuntoVenta.jButtonEliminarPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarPuntoVenta=this.jInternalFrameDetalleFormPuntoVenta.jButtonCancelarPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarPuntoVenta=this.jInternalFrameDetalleFormPuntoVenta.jButtonGuardarCambiosPuntoVenta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPuntoVenta=this.jButtonGuardarCambiosTablaPuntoVenta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPuntoVenta=this.jButtonNuevoToolBarPuntoVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPuntoVenta=this.jButtonNuevoRelacionesToolBarPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormPuntoVenta!=null) {
			this.isVisibilidadCeldaModificarPuntoVenta=this.jInternalFrameDetalleFormPuntoVenta.jButtonModificarToolBarPuntoVenta.isVisible();
			this.isVisibilidadCeldaActualizarPuntoVenta=this.jInternalFrameDetalleFormPuntoVenta.jButtonActualizarToolBarPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarPuntoVenta=this.jInternalFrameDetalleFormPuntoVenta.jButtonEliminarToolBarPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarPuntoVenta=this.jInternalFrameDetalleFormPuntoVenta.jButtonCancelarToolBarPuntoVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPuntoVenta=this.jButtonGuardarCambiosToolBarPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPuntoVenta=this.jButtonGuardarCambiosTablaToolBarPuntoVenta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPuntoVenta=this.jMenuItemNuevoPuntoVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPuntoVenta=this.jMenuItemNuevoRelacionesPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormPuntoVenta!=null) {
			this.isVisibilidadCeldaModificarPuntoVenta=this.jInternalFrameDetalleFormPuntoVenta.jMenuItemModificarPuntoVenta.isVisible();
			this.isVisibilidadCeldaActualizarPuntoVenta=this.jInternalFrameDetalleFormPuntoVenta.jMenuItemActualizarPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarPuntoVenta=this.jInternalFrameDetalleFormPuntoVenta.jMenuItemEliminarPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarPuntoVenta=this.jInternalFrameDetalleFormPuntoVenta.jMenuItemCancelarPuntoVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPuntoVenta=this.jMenuItemGuardarCambiosPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPuntoVenta=this.jMenuItemGuardarCambiosTablaPuntoVenta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPuntoVenta(Boolean esInicializar) {
		if(PuntoVentaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.puntoventaSessionBean.getConGuardarRelaciones()) {
				//if(this.puntoventaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPuntoVenta();
			}
			
			this.inicializarActualizarBindingBotonesManualPuntoVenta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPuntoVenta() {
		this.jButtonNuevoPuntoVenta.setVisible(this.isPermisoNuevoPuntoVenta);			
		this.jButtonDuplicarPuntoVenta.setVisible(this.isPermisoDuplicarPuntoVenta);			
		this.jButtonCopiarPuntoVenta.setVisible(this.isPermisoCopiarPuntoVenta);			
		this.jButtonVerFormPuntoVenta.setVisible(this.isPermisoVerFormPuntoVenta);			
		
		this.jButtonAbrirOrderByPuntoVenta.setVisible(this.isPermisoOrdenPuntoVenta);					
		
		this.jButtonNuevoRelacionesPuntoVenta.setVisible(this.isPermisoNuevoPuntoVenta);			
		
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntoVenta.jButtonModificarPuntoVenta.setVisible(this.isPermisoActualizarPuntoVenta);	
			this.jInternalFrameDetalleFormPuntoVenta.jButtonActualizarPuntoVenta.setVisible(this.isPermisoActualizarPuntoVenta);	
			this.jInternalFrameDetalleFormPuntoVenta.jButtonEliminarPuntoVenta.setVisible(this.isPermisoEliminarPuntoVenta);
			this.jInternalFrameDetalleFormPuntoVenta.jButtonCancelarPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarPuntoVenta);						
			this.jInternalFrameDetalleFormPuntoVenta.jButtonGuardarCambiosPuntoVenta.setVisible(this.isPermisoGuardarCambiosPuntoVenta);							
		}
		
		this.jButtonGuardarCambiosTablaPuntoVenta.setVisible(this.isPermisoActualizarPuntoVenta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePuntoVenta() {
		this.jInternalFrameDetalleFormPuntoVenta.jButtonModificarPuntoVenta.setVisible(this.isPermisoActualizarPuntoVenta);	
		this.jInternalFrameDetalleFormPuntoVenta.jButtonActualizarPuntoVenta.setVisible(this.isPermisoActualizarPuntoVenta);	
		this.jInternalFrameDetalleFormPuntoVenta.jButtonEliminarPuntoVenta.setVisible(this.isPermisoEliminarPuntoVenta);
		this.jInternalFrameDetalleFormPuntoVenta.jButtonCancelarPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarPuntoVenta);							
		this.jInternalFrameDetalleFormPuntoVenta.jButtonGuardarCambiosPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarPuntoVenta && this.isPermisoGuardarCambiosPuntoVenta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPuntoVenta() {
		if(PuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPuntoVenta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPuntoVenta() {
	}
	
	public void jTableDatosPuntoVentaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPuntoVenta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPuntoVenta(this.getpuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPuntoVenta(this.puntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.puntoventa =(PuntoVenta) this.puntoventaLogic.getPuntoVentas().toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.puntoventa =(PuntoVenta) this.puntoventas.toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.puntoventa==null) {
						this.puntoventa = new PuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualPuntoVenta(this.puntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPuntoVenta(this.puntoventa);
				}

				if(this.puntoventa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.puntoventa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPuntoVenta(this.getpuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPuntoVenta(this.puntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.puntoventa =(PuntoVenta) this.puntoventaLogic.getPuntoVentas().toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.puntoventa =(PuntoVenta) this.puntoventas.toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.puntoventa==null) {
						this.puntoventa = new PuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualPuntoVenta(this.puntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPuntoVenta(this.puntoventa);
				}

				if(this.puntoventa.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.puntoventa.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFramePuntoVenta() {
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) {
			this.jInternalFrameDetalleFormPuntoVenta.setVisible(false);	    			
			this.jInternalFrameDetalleFormPuntoVenta.dispose();
			this.jInternalFrameDetalleFormPuntoVenta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPuntoVenta!=null) {
			this.jInternalFrameReporteDinamicoPuntoVenta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPuntoVenta.dispose();
			this.jInternalFrameReporteDinamicoPuntoVenta=null;
		}
		
		if(this.jInternalFrameImportacionPuntoVenta!=null) {
			this.jInternalFrameImportacionPuntoVenta.setVisible(false);	    			
			this.jInternalFrameImportacionPuntoVenta.dispose();
			this.jInternalFrameImportacionPuntoVenta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPuntoVenta();
			
			PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
			
			
			if(sTipo.equals("NuevoPuntoVenta")) {
				jButtonNuevoPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPuntoVenta")) {
				jButtonDuplicarPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPuntoVenta")) {
				jButtonCopiarPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormPuntoVenta")) {
				jButtonVerFormPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPuntoVenta")) {
				jButtonNuevoPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPuntoVenta")) {
				jButtonDuplicarPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPuntoVenta")) {
				jButtonNuevoPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPuntoVenta")) {
				jButtonDuplicarPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPuntoVenta")) {
				jButtonNuevoPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPuntoVenta")) {
				jButtonNuevoPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPuntoVenta")) {
				jButtonNuevoPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPuntoVenta")) {
				jButtonModificarPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPuntoVenta")) {
				jButtonModificarPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPuntoVenta")) {
				jButtonModificarPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPuntoVenta")) {
				jButtonActualizarPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPuntoVenta")) {
				jButtonActualizarPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPuntoVenta")) {
				jButtonActualizarPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarPuntoVenta")) {
				jButtonEliminarPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPuntoVenta")) {
				jButtonEliminarPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPuntoVenta")) {
				jButtonEliminarPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarPuntoVenta")) {
				jButtonCancelarPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPuntoVenta")) {
				jButtonCancelarPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPuntoVenta")) {
				jButtonCancelarPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarPuntoVenta")) {
				jButtonCerrarPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPuntoVenta")) {
				jButtonCerrarPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPuntoVenta")) {
				jButtonCerrarPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPuntoVenta")) {
				jButtonMostrarOcultarPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPuntoVenta")) {
				jButtonCancelarPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPuntoVenta")) {
				jButtonGuardarCambiosPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPuntoVenta")) {
				jButtonGuardarCambiosPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPuntoVenta")) {
				jButtonCopiarPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPuntoVenta")) {
				jButtonVerFormPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPuntoVenta")) {
				jButtonGuardarCambiosPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPuntoVenta")) {
				jButtonCopiarPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPuntoVenta")) {
				jButtonVerFormPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPuntoVenta")) {
				jButtonGuardarCambiosPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPuntoVenta")) {
				jButtonGuardarCambiosPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPuntoVenta")) {
				jButtonGuardarCambiosPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPuntoVenta")) {
				jButtonRecargarInformacionPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPuntoVenta")) {
				jButtonRecargarInformacionPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPuntoVenta")) {
				jButtonRecargarInformacionPuntoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPuntoVenta")) {
				jButtonAnterioresPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPuntoVenta")) {
				jButtonAnterioresPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePuntoVenta")) {
				jButtonAnterioresPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPuntoVenta")) {
				jButtonSiguientesPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPuntoVenta")) {
				jButtonSiguientesPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPuntoVenta")) {
				jButtonSiguientesPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPuntoVenta") || sTipo.equals("MenuItemDetalleAbrirOrderByPuntoVenta")) {
				jButtonAbrirOrderByPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPuntoVenta") || sTipo.equals("MenuItemDetalleMostrarOcultarPuntoVenta")) {
				jButtonMostrarOcultarPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPuntoVenta")) {
				jButtonNuevoGuardarCambiosPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPuntoVenta")) {
				jButtonNuevoGuardarCambiosPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPuntoVenta")) {
				jButtonNuevoGuardarCambiosPuntoVentaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPuntoVenta")) {
				jButtonCerrarReporteDinamicoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPuntoVenta")) {
				jButtonGenerarReporteDinamicoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPuntoVenta")) {
				
				jButtonGenerarExcelReporteDinamicoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPuntoVenta")) {
				jButtonCerrarImportacionPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPuntoVenta")) {
				
				jButtonGenerarImportacionPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPuntoVenta")) {
				
				jButtonAbrirImportacionPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPuntoVenta")) {
				jComboBoxTiposAccionesPuntoVentaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPuntoVenta")) {
				jComboBoxTiposRelacionesPuntoVentaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPuntoVenta")) {
				jComboBoxTiposAccionesPuntoVentaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPuntoVenta")) {
				
				jComboBoxTiposSeleccionarPuntoVentaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPuntoVenta")) {
				jTextFieldValorCampoGeneralPuntoVentaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPuntoVenta")) {
				jButtonAbrirOrderByPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPuntoVenta")) {
				jButtonAbrirOrderByPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPuntoVenta")) {
				jButtonCerrarOrderByPuntoVentaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPuntoVentaBusqueda")) {
				this.jButtonidPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPuntoVentaBusqueda")) {
				this.jButtoncodigoPuntoVentaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPuntoVenta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPuntoVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puntoventa);
				
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
				
				


				
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PuntoVenta puntoventaLocal=null;
			
			if(!this.getEsControlTabla()) {
				puntoventaLocal=this.puntoventa;
			} else {
				puntoventaLocal=this.puntoventaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puntoventa);
				
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
							
				
				


				
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntoventaAnterior =(PuntoVenta) this.puntoventaLogic.getPuntoVentas().toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.puntoventaAnterior =(PuntoVenta) this.puntoventas.toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
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
			
			PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
			
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
			
			


			
			PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPuntoVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puntoventa);
				
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
								
						
				


				
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PuntoVenta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puntoventa);
				
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
								
				
				


				
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntoventaAnterior =(PuntoVenta) this.puntoventaLogic.getPuntoVentas().toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.puntoventaAnterior =(PuntoVenta) this.puntoventas.toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puntoventa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntoventaAnterior =(PuntoVenta) this.puntoventaLogic.getPuntoVentas().toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.puntoventaAnterior =(PuntoVenta) this.puntoventas.toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPuntoVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.puntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.puntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puntoventa);
				
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
							
				
				


				
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PuntoVenta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPuntoVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPuntoVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.puntoventaAnterior =(PuntoVenta) this.puntoventaLogic.getPuntoVentas().toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.puntoventaAnterior =(PuntoVenta) this.puntoventas.toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
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
			
			PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
			
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
			
			


			
			PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPuntoVentaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.puntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.puntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puntoventa);
				
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
								
				
				


				
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntoventaAnterior =(PuntoVenta) this.puntoventaLogic.getPuntoVentas().toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.puntoventaAnterior =(PuntoVenta) this.puntoventas.toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPuntoVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.puntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.puntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPuntoVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puntoventa);
				
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPuntoVenta")) {
					jCheckBoxSeleccionarTodosPuntoVentaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPuntoVenta")) {
					jCheckBoxSeleccionadosPuntoVentaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPuntoVenta")) {
					
				}
				
				


				
				
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.puntoventa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.puntoventa);
				
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
												
				
				


				
				
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPuntoVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPuntoVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.puntoventaAnterior =(PuntoVenta) this.puntoventaLogic.getPuntoVentas().toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.puntoventaAnterior =(PuntoVenta) this.puntoventas.toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPuntoVentaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puntoventa);
				
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
				
				
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
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
			
			PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
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
			
			


			
			PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPuntoVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puntoventa);
				
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PuntoVenta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PuntoVenta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puntoventa);
				
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
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
				
				


				
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PuntoVenta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntoventaAnterior =(PuntoVenta) this.puntoventaLogic.getPuntoVentas().toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.puntoventaAnterior =(PuntoVenta) this.puntoventas.toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPuntoVenta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPuntoVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPuntoVenta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.puntoventa =(PuntoVenta) this.puntoventaLogic.getPuntoVentas().toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.puntoventa =(PuntoVenta) this.puntoventas.toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.puntoventa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPuntoVenta")) {
				
				}
				
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPuntoVenta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPuntoVenta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPuntoVenta")) {
			
			}
			
			PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPuntoVenta();
			
			PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
			
			if(sTipo.equals("NuevoPuntoVenta")) {
				jButtonNuevoPuntoVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPuntoVenta")) {
				jButtonDuplicarPuntoVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPuntoVenta")) {
				jButtonCopiarPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPuntoVenta")) {
				jButtonVerFormPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPuntoVenta")) {
				jButtonNuevoPuntoVentaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPuntoVenta")) {
				jButtonModificarPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPuntoVenta")) {
				jButtonActualizarPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPuntoVenta")) {
				jButtonEliminarPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPuntoVenta")) {
				jButtonGuardarCambiosPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPuntoVenta")) {
				jButtonCancelarPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPuntoVenta")) {
				jButtonCerrarPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPuntoVenta")) {
				jButtonGuardarCambiosPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPuntoVenta")) {
				jButtonNuevoGuardarCambiosPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPuntoVenta")) {
				jButtonAbrirOrderByPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPuntoVenta")) {
				jButtonRecargarInformacionPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPuntoVenta")) {
				jButtonAnterioresPuntoVentaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPuntoVenta")) {
				jButtonSiguientesPuntoVentaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPuntoVentaBusqueda")) {
				this.jButtonidPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPuntoVentaBusqueda")) {
				this.jButtoncodigoPuntoVentaBusquedaActionPerformed(evt);
			}
			
			PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPuntoVenta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePuntoVenta")) {
				closingInternalFramePuntoVenta();
				
			} else if(sTipo.equals("jButtonCancelarPuntoVenta")) {
				JInternalFrameBase jInternalFrameDetalleFormPuntoVenta = (JInternalFrameBase)evt.getSource();
	            	
	            PuntoVentaBeanSwingJInternalFrame jInternalFrameParent=(PuntoVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormPuntoVenta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPuntoVentaActionPerformed(null);
			}
			
			PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.puntoventa,new Object(),this.puntoventaParameterGeneral,this.puntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPuntoVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPuntoVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPuntoVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.puntoventa)) {
			if(!esControlTabla) {
				if(PuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPuntoVenta(this.puntoventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPuntoVenta(this.puntoventa);			
				}
				
				if(this.puntoventaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPuntoVenta(this.puntoventa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPuntoVenta(this.puntoventaReturnGeneral,this.puntoventaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.puntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPuntoVenta(classes,this.puntoventaReturnGeneral,this.puntoventaBean,false);
					}
						
					if(this.puntoventaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPuntoVenta(this.puntoventaReturnGeneral.getPuntoVenta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPuntoVenta(this.puntoventaReturnGeneral.getPuntoVenta());	
					}
						
					if(this.puntoventaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPuntoVenta(this.puntoventaReturnGeneral.getPuntoVenta(),classes);//this.puntoventaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPuntoVenta(this.puntoventa,classes);//this.puntoventaBean);									
				}
			
				if(PuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPuntoVenta(this.puntoventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPuntoVenta(this.puntoventa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.puntoventaAnterior!=null) {
						this.puntoventa=this.puntoventaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.puntoventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.puntoventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.puntoventaReturnGeneral.getPuntoVenta(),puntoventaLogic.getPuntoVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.puntoventaReturnGeneral.getPuntoVenta(),this.puntoventas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPuntoVenta.repaint();
				
				//((AbstractTableModel) this.jTableDatosPuntoVenta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPuntoVenta();
			}
		}
	}
	
	public void actualizarVisualTableDatosPuntoVenta() throws Exception {
		
		PuntoVentaModel puntoventaModel=(PuntoVentaModel)this.jTableDatosPuntoVenta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			puntoventaModel.puntoventas=this.puntoventaLogic.getPuntoVentas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			puntoventaModel.puntoventas=this.puntoventas;
		}
		
		
		((PuntoVentaModel) this.jTableDatosPuntoVenta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPuntoVenta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpuntoventaAnterior(),this.puntoventaLogic.getPuntoVentas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpuntoventaAnterior(),this.puntoventas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPuntoVenta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPuntoVenta(PuntoVenta puntoventa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
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
										
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.puntoventa,new Object(),generalEntityParameterGeneral,this.puntoventaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.puntoventaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PuntoVentaConstantesFunciones.getClassesRelationshipsOfPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PuntoVentaConstantesFunciones.getClassesRelationshipsFromStringsOfPuntoVenta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPuntoVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.puntoventa,new Object(),generalEntityParameterGeneral,this.puntoventaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPuntoVenta(PuntoVentaBean puntoventaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPuntoVenta(ArrayList<Classe> classes,PuntoVentaReturnGeneral puntoventaReturnGeneral,PuntoVentaBean puntoventaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPuntoVenta(PuntoVenta puntoventa,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.puntoventa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPuntoVenta = new PuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.puntoventaSessionBean.getConGuardarRelaciones(),this.puntoventaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPuntoVenta);
		this.jInternalFrameDetalleFormPuntoVenta.setVisible(false);
		this.jInternalFrameDetalleFormPuntoVenta.setSelected(false);						
		
		this.jInternalFrameDetalleFormPuntoVenta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPuntoVenta.puntoventaLogic=this.puntoventaLogic;
		
		this.cargarCombosFrameForeignKeyPuntoVenta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePuntoVenta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePuntoVenta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPuntoVenta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPuntoVenta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPuntoVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPuntoVenta"));
		
		this.jInternalFrameDetalleFormPuntoVenta.jButtonModificarPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarPuntoVenta"));

		
		this.jInternalFrameDetalleFormPuntoVenta.jButtonModificarToolBarPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarPuntoVenta"));
					
		this.jInternalFrameDetalleFormPuntoVenta.jMenuItemModificarPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormPuntoVenta.jButtonActualizarPuntoVenta.addActionListener (new ButtonActionListener(this,"ActualizarPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormPuntoVenta.jButtonActualizarToolBarPuntoVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPuntoVenta"));
						
		this.jInternalFrameDetalleFormPuntoVenta.jMenuItemActualizarPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormPuntoVenta.jButtonEliminarPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormPuntoVenta.jButtonEliminarToolBarPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarPuntoVenta"));
								
		this.jInternalFrameDetalleFormPuntoVenta.jMenuItemEliminarPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormPuntoVenta.jButtonCancelarPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormPuntoVenta.jButtonCancelarToolBarPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarPuntoVenta"));
					
		this.jInternalFrameDetalleFormPuntoVenta.jMenuItemCancelarPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPuntoVenta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPuntoVenta.jMenuItemDetalleCerrarPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormPuntoVenta.jButtonGuardarCambiosToolBarPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPuntoVenta"));
		
		
		
		this.jInternalFrameDetalleFormPuntoVenta.jButtonGuardarCambiosToolBarPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPuntoVenta"));
		
		
		
		this.jInternalFrameDetalleFormPuntoVenta.jComboBoxTiposAccionesFormularioPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPuntoVenta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuntoVenta.jButtonidPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuntoVenta.jButtoncodigoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"codigoPuntoVentaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPuntoVenta.jTabbedPaneRelacionesPuntoVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPuntoVenta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePuntoVenta"));
		
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntoVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPuntoVenta"));
		}
		
		this.jTableDatosPuntoVenta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPuntoVenta"));
		
		this.jTableDatosPuntoVenta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPuntoVenta"));
		
		this.jButtonNuevoPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoPuntoVenta"));
		
		this.jButtonDuplicarPuntoVenta.addActionListener(new ButtonActionListener(this,"DuplicarPuntoVenta"));
		
		this.jButtonCopiarPuntoVenta.addActionListener(new ButtonActionListener(this,"CopiarPuntoVenta"));
		
		this.jButtonVerFormPuntoVenta.addActionListener(new ButtonActionListener(this,"VerFormPuntoVenta"));
		
		
		this.jButtonNuevoToolBarPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoToolBarPuntoVenta"));
			
		this.jButtonDuplicarToolBarPuntoVenta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPuntoVenta"));
			
		this.jMenuItemNuevoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPuntoVenta"));
			
		this.jMenuItemDuplicarPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPuntoVenta"));		
		
		
		this.jButtonNuevoRelacionesPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPuntoVenta"));
		
		
		this.jButtonNuevoRelacionesToolBarPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPuntoVenta"));
			
		this.jMenuItemNuevoRelacionesPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPuntoVenta"));		
		
		
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntoVenta.jButtonModificarPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntoVenta.jButtonModificarToolBarPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarPuntoVenta"));
			
			this.jInternalFrameDetalleFormPuntoVenta.jMenuItemModificarPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPuntoVenta.jButtonActualizarPuntoVenta.addActionListener (new ButtonActionListener(this,"ActualizarPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntoVenta.jButtonActualizarToolBarPuntoVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPuntoVenta"));
				
			this.jInternalFrameDetalleFormPuntoVenta.jMenuItemActualizarPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntoVenta.jButtonEliminarPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntoVenta.jButtonEliminarToolBarPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarPuntoVenta"));
						
			this.jInternalFrameDetalleFormPuntoVenta.jMenuItemEliminarPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntoVenta.jButtonCancelarPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntoVenta.jButtonCancelarToolBarPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarPuntoVenta"));
			
			this.jInternalFrameDetalleFormPuntoVenta.jMenuItemCancelarPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPuntoVenta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPuntoVenta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPuntoVenta"));		
		
		
		this.jButtonCerrarPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarPuntoVenta"));
		
		
		this.jButtonCerrarToolBarPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarToolBarPuntoVenta"));
			
		this.jMenuItemCerrarPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPuntoVenta"));
			
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntoVenta.jMenuItemDetalleCerrarPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntoVenta.jButtonGuardarCambiosPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntoVenta.jButtonGuardarCambiosToolBarPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPuntoVenta"));
		}
		
		this.jButtonCopiarToolBarPuntoVenta.addActionListener (new ButtonActionListener(this,"CopiarToolBarPuntoVenta"));
			
		this.jButtonVerFormToolBarPuntoVenta.addActionListener (new ButtonActionListener(this,"VerFormToolBarPuntoVenta"));
		
		this.jMenuItemGuardarCambiosPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPuntoVenta"));
			
		this.jMenuItemCopiarPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPuntoVenta"));		
		
		this.jMenuItemVerFormPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPuntoVenta"));		
		
		
		this.jButtonGuardarCambiosTablaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPuntoVenta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPuntoVenta"));
			
		this.jMenuItemGuardarCambiosTablaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPuntoVenta"));		
		
		
		
		this.jButtonRecargarInformacionPuntoVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionPuntoVenta"));
					
		this.jButtonRecargarInformacionToolBarPuntoVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPuntoVenta"));
		
		this.jMenuItemRecargarInformacionPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPuntoVenta"));		
		
		
		
		this.jButtonAnterioresPuntoVenta.addActionListener (new ButtonActionListener(this,"AnterioresPuntoVenta"));
		
		
		this.jButtonAnterioresToolBarPuntoVenta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPuntoVenta"));
		
		this.jMenuItemAnterioresPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPuntoVenta"));		
		
		
		this.jButtonSiguientesPuntoVenta.addActionListener (new ButtonActionListener(this,"SiguientesPuntoVenta"));
		
		
		this.jButtonSiguientesToolBarPuntoVenta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPuntoVenta"));
			
		this.jMenuItemSiguientesPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPuntoVenta"));
			
		this.jMenuItemAbrirOrderByPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPuntoVenta"));
			
		this.jMenuItemMostrarOcultarPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPuntoVenta"));
			
		this.jMenuItemDetalleAbrirOrderByPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPuntoVenta"));
			
		this.jMenuItemDetalleMostarOcultarPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPuntoVenta"));		
		
		
		this.jButtonNuevoGuardarCambiosPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPuntoVenta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPuntoVenta"));
			
		this.jMenuItemNuevoGuardarCambiosPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPuntoVenta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPuntoVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPuntoVenta"));

		this.jCheckBoxSeleccionadosPuntoVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPuntoVenta"));
		
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntoVenta.jComboBoxTiposAccionesFormularioPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPuntoVenta"));
		}
		
		
		this.jComboBoxTiposRelacionesPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposRelacionesPuntoVenta"));
			
		this.jComboBoxTiposAccionesPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesPuntoVenta"));
					
		this.jComboBoxTiposSeleccionarPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPuntoVenta"));
			
		this.jTextFieldValorCampoGeneralPuntoVenta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPuntoVenta"));		
		
		
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuntoVenta.jButtonidPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuntoVenta.jButtoncodigoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"codigoPuntoVentaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoPuntoVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPuntoVenta"));
				this.jInternalFrameReporteDinamicoPuntoVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPuntoVenta"));
				this.jInternalFrameReporteDinamicoPuntoVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPuntoVenta"));
			}
			
			//this.jButtonCerrarReporteDinamicoPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPuntoVenta"));				
			//this.jButtonGenerarReporteDinamicoPuntoVenta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPuntoVenta"));
			//this.jButtonGenerarExcelReporteDinamicoPuntoVenta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPuntoVenta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPuntoVenta!=null) {
				this.jInternalFrameImportacionPuntoVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPuntoVenta"));
				this.jInternalFrameImportacionPuntoVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPuntoVenta"));
				this.jInternalFrameImportacionPuntoVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPuntoVenta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPuntoVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByPuntoVenta"));
			
			this.jButtonAbrirOrderByToolBarPuntoVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPuntoVenta"));			
			
			if(this.jInternalFrameOrderByPuntoVenta!=null) {
				this.jInternalFrameOrderByPuntoVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPuntoVenta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntoVenta.jTabbedPaneRelacionesPuntoVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPuntoVenta"));
		
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
            		closingInternalFramePuntoVenta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPuntoVenta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPuntoVenta = (JInternalFrameBase)event.getSource();
	            	
	            PuntoVentaBeanSwingJInternalFrame jInternalFrameParent=(PuntoVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormPuntoVenta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPuntoVentaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPuntoVenta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPuntoVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPuntoVenta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPuntoVenta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPuntoVenta";
		inputMap = this.jButtonNuevoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPuntoVentaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPuntoVentaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPuntoVenta";
		inputMap = this.jButtonModificarPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPuntoVenta";
		inputMap = this.jButtonActualizarPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPuntoVenta";
		inputMap = this.jButtonEliminarPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPuntoVenta";
		inputMap = this.jButtonCancelarPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPuntoVenta";
		inputMap = this.jButtonCerrarPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPuntoVenta.jButtonGuardarCambiosPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPuntoVenta";
		inputMap = this.jInternalFrameDetalleFormPuntoVenta.jButtonGuardarCambiosPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPuntoVenta.jButtonGuardarCambiosPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPuntoVenta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPuntoVentaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuntoVenta.jButtonidPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuntoVenta.jButtoncodigoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"codigoPuntoVentaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPuntoVentaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPuntoVenta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPuntoVenta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PuntoVenta puntoventaAux:this.puntoventaLogic.getPuntoVentas()) {
					puntoventaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PuntoVenta puntoventaAux:puntoventas) {
					puntoventaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPuntoVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPuntoVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PuntoVenta puntoventaAux:this.puntoventaLogic.getPuntoVentas()) {
						puntoventaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PuntoVenta puntoventaAux:puntoventas) {
						puntoventaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PuntoVenta puntoventaAux:this.puntoventaLogic.getPuntoVentas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PuntoVenta puntoventaAux:puntoventas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPuntoVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPuntoVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPuntoVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPuntoVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPuntoVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPuntoVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPuntoVenta.getSelectedRows();
			
			PuntoVenta puntoventaLocal=new PuntoVenta();
			
			//this.seleccionarTodosPuntoVenta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					puntoventaLocal =(PuntoVenta) this.puntoventaLogic.getPuntoVentas().toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					puntoventaLocal =(PuntoVenta) this.puntoventas.toArray()[this.jTableDatosPuntoVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				puntoventaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PuntoVenta puntoventaAux:this.puntoventaLogic.getPuntoVentas()) {
						puntoventaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PuntoVenta puntoventaAux:puntoventas) {
						puntoventaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPuntoVenta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPuntoVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPuntoVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPuntoVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPuntoVentaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPuntoVentaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPuntoVentaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPuntoVenta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPuntoVenta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PuntoVenta puntoventaAux:this.puntoventaLogic.getPuntoVentas()) {
				
						if(sTipoSeleccionar.equals(PuntoVentaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							puntoventaAux.setcodigo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PuntoVenta puntoventaAux:puntoventas) {
					
						if(sTipoSeleccionar.equals(PuntoVentaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							puntoventaAux.setcodigo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPuntoVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPuntoVentaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPuntoVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPuntoVenta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPuntoVenta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPuntoVenta.jComboBoxTiposAccionesFormularioPuntoVenta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePuntoVenta) {				
					conSplash=true;//false;										
					
					//this.startProcessPuntoVenta(conSplash);
				
					this.generarReportePuntoVentasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPuntoVenta.jComboBoxTiposAccionesFormularioPuntoVenta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPuntoVentasSeleccionados();
				//this.jComboBoxTiposAccionesPuntoVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPuntoVentasSeleccionados(false);
				//this.jComboBoxTiposAccionesPuntoVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPuntoVentasSeleccionados(true);
				//this.jComboBoxTiposAccionesPuntoVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPuntoVenta();
				
				this.exportarPuntoVentasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPuntoVenta.jComboBoxTiposAccionesFormularioPuntoVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPuntoVentas();
				//this.importarPuntoVentas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPuntoVenta.jComboBoxTiposAccionesFormularioPuntoVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPuntoVenta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPuntoVentasSeleccionados();
				//this.jComboBoxTiposAccionesPuntoVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPuntoVenta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPuntoVenta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPuntoVenta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Punto Venta",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPuntoVenta.jComboBoxTiposAccionesFormularioPuntoVenta.setSelectedIndex(0);					
				}	
			} 			
			else if(PuntoVentaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePuntoVenta) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPuntoVenta(conSplash);
					
						//this.actualizarParametrosGeneralPuntoVenta();
						
						this.generarReporteProcesoAccionPuntoVentasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPuntoVenta.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPuntoVenta.jComboBoxTiposAccionesFormularioPuntoVenta.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PuntoVentaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Punto VentaS SELECCIONADOS?", "MANTENIMIENTO DE Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPuntoVenta();
				
						this.actualizarParametrosGeneralPuntoVenta();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.puntoventaReturnGeneral=puntoventaLogic.procesarAccionPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.puntoventaLogic.getPuntoVentas(),this.puntoventaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPuntoVentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPuntoVenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPuntoVenta.jComboBoxTiposAccionesFormularioPuntoVenta.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPuntoVenta();
					
					PuntoVentaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPuntoVentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPuntoVenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPuntoVenta.jComboBoxTiposAccionesFormularioPuntoVenta.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPuntoVenta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPuntoVentaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPuntoVenta();
			
			if(this.jInternalFrameDetalleFormPuntoVenta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PuntoVenta> puntoventasSeleccionados=new ArrayList<PuntoVenta>();		
			PuntoVenta puntoventa=new PuntoVenta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPuntoVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPuntoVenta.getSelectedItem();
			
			
			
			
			puntoventasSeleccionados=this.getPuntoVentasSeleccionados(true);
			//this.sTipoAccion;
			
			if(puntoventasSeleccionados.size()==1) {
				for(PuntoVenta puntoventaAux:puntoventasSeleccionados) {
					puntoventa=puntoventaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPuntoVenta();
			
      		//this.finishProcessPuntoVenta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPuntoVentaReturnGeneral() throws Exception {
		if(this.puntoventaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.puntoventaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.puntoventaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.puntoventaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.puntoventaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.puntoventaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPuntoVenta(false);
		}
		
		if(this.puntoventaReturnGeneral.getConRetornoLista() || this.puntoventaReturnGeneral.getConRetornoObjeto()) {
			if(this.puntoventaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.puntoventaLogic.setPuntoVentas(this.puntoventaReturnGeneral.getPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.puntoventaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.puntoventaLogic.setPuntoVenta(this.puntoventaReturnGeneral.getPuntoVenta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPuntoVenta(false);
		}
	}
	
	public void actualizarParametrosGeneralPuntoVenta() throws Exception {
		
		
	}
	
	public ArrayList<PuntoVenta> getPuntoVentasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PuntoVenta> puntoventasSeleccionados=new ArrayList<PuntoVenta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPuntoVenta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PuntoVenta puntoventaAux:puntoventaLogic.getPuntoVentas()) {
					if(puntoventaAux.getIsSelected()) {
						puntoventasSeleccionados.add(puntoventaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PuntoVenta puntoventaAux:this.puntoventas) {
					if(puntoventaAux.getIsSelected()) {
						puntoventasSeleccionados.add(puntoventaAux);				
					}
				}
			}
			
			if(puntoventasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						puntoventasSeleccionados.addAll(this.puntoventaLogic.getPuntoVentas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						puntoventasSeleccionados.addAll(this.puntoventas);				
					}
				}
			}
		} else {
			puntoventasSeleccionados.add(this.puntoventa);
		}
		
		return puntoventasSeleccionados;
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
	
	public void generarReportePuntoVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPuntoVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPuntoVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPuntoVentasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPuntoVentasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Punto Venta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPuntoVentasSeleccionados() throws Exception {
		ArrayList<PuntoVenta> puntoventasSeleccionados=new ArrayList<PuntoVenta>();		
		
		puntoventasSeleccionados=this.getPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePuntoVentas("Todos",puntoventasSeleccionados);
		
	}	
	
	public void generarReporteNormalPuntoVentasSeleccionados() throws Exception {
		ArrayList<PuntoVenta> puntoventasSeleccionados=new ArrayList<PuntoVenta>();		
		
		puntoventasSeleccionados=this.getPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePuntoVentas("Todos",puntoventasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPuntoVentasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PuntoVenta> puntoventasSeleccionados=new ArrayList<PuntoVenta>();
		
		puntoventasSeleccionados=this.getPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePuntoVentas("Todos",puntoventasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPuntoVentasSeleccionados() throws Exception {
		ArrayList<PuntoVenta> puntoventasSeleccionados=new ArrayList<PuntoVenta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPuntoVenta();
		
		
		puntoventasSeleccionados=this.getPuntoVentasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPuntoVenta();
		
		
		//this.generarReportePuntoVentas("Todos",puntoventasSeleccionados ,puntoventaImplementable,puntoventaImplementableHome);
	}
	
	public void mostrarImportacionPuntoVentas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPuntoVenta();
		
		this.abrirFrameImportacionPuntoVenta();		
		
			
		//this.generarReportePuntoVentas("Todos",puntoventasSeleccionados ,puntoventaImplementable,puntoventaImplementableHome);
	}
	
	public void importarPuntoVentas() throws Exception {		
	
	}
	
	public void exportarPuntoVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPuntoVentasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPuntoVentasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPuntoVentasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Punto Venta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPuntoVentasSeleccionados() throws Exception {
		ArrayList<PuntoVenta> puntoventasSeleccionados=new ArrayList<PuntoVenta>();		
		
		puntoventasSeleccionados=this.getPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"puntoventa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPuntoVenta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PuntoVenta puntoventaAux:puntoventasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPuntoVenta(puntoventaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//puntoventaAux.setsDetalleGeneralEntityReporte(puntoventaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPuntoVenta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PuntoVentaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PuntoVentaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PuntoVentaConstantesFunciones.LABEL_CODIGO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPuntoVenta(PuntoVenta puntoventa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=puntoventa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=puntoventa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=puntoventa.getcodigo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPuntoVentasSeleccionados() throws Exception {
		ArrayList<PuntoVenta> puntoventasSeleccionados=new ArrayList<PuntoVenta>();		
		
		puntoventasSeleccionados=this.getPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"puntoventa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PuntoVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPuntoVenta(row);				
				iRow++;
			}				
			
			for(PuntoVenta puntoventaAux:puntoventasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPuntoVenta(puntoventaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPuntoVentasSeleccionados() throws Exception {
		ArrayList<PuntoVenta> puntoventasSeleccionados=new ArrayList<PuntoVenta>();		
		
		puntoventasSeleccionados=this.getPuntoVentasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"puntoventa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("puntoventas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("puntoventa");
			//elementRoot.appendChild(element);
		
			for(PuntoVenta puntoventaAux:puntoventasSeleccionados) {
				element = document.createElement("puntoventa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPuntoVenta(puntoventaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPuntoVenta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PuntoVentaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PuntoVentaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PuntoVentaConstantesFunciones.LABEL_CODIGO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPuntoVenta(PuntoVenta puntoventa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(puntoventa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(puntoventa.getcodigo());				
	}
	
	public void setFilaDatosExportarXmlPuntoVenta(PuntoVenta puntoventa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PuntoVentaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(puntoventa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PuntoVentaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(puntoventa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(PuntoVentaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(puntoventa.getcodigo().trim()));
		element.appendChild(elementcodigo);
	}
	
	public void generarReporteGroupGenericoPuntoVentasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PuntoVenta> puntoventasSeleccionados=new ArrayList<PuntoVenta>();
		
		puntoventasSeleccionados=this.getPuntoVentasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPuntoVenta(puntoventasSeleccionados);
		
		this.generarReportePuntoVentas("Todos",puntoventasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPuntoVenta(ArrayList<PuntoVenta> puntoventasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PuntoVenta puntoventaAux:puntoventasSeleccionados) {
				puntoventaAux.setsDetalleGeneralEntityReporte(puntoventaAux.toString());
			
				if(sTipoSeleccionar.equals(PuntoVentaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					puntoventaAux.setsDescripcionGeneralEntityReporte1(puntoventaAux.getcodigo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPuntoVenta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPuntoVenta=true;
				this.isVisibilidadCeldaNuevoRelacionesPuntoVenta=true;
				this.isVisibilidadCeldaGuardarCambiosPuntoVenta=true;
			}
			
			this.isVisibilidadCeldaModificarPuntoVenta=false;
			this.isVisibilidadCeldaActualizarPuntoVenta=false;
			this.isVisibilidadCeldaEliminarPuntoVenta=false;
			this.isVisibilidadCeldaCancelarPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarPuntoVenta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosPuntoVenta=false;
			this.isVisibilidadCeldaModificarPuntoVenta=false;
			this.isVisibilidadCeldaActualizarPuntoVenta=true;
			this.isVisibilidadCeldaEliminarPuntoVenta=false;
			this.isVisibilidadCeldaCancelarPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarPuntoVenta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosPuntoVenta=false;
			this.isVisibilidadCeldaModificarPuntoVenta=false;
			this.isVisibilidadCeldaActualizarPuntoVenta=true;
			this.isVisibilidadCeldaEliminarPuntoVenta=true;
			this.isVisibilidadCeldaCancelarPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarPuntoVenta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosPuntoVenta=false;
			this.isVisibilidadCeldaModificarPuntoVenta=false;
			this.isVisibilidadCeldaActualizarPuntoVenta=true;
			this.isVisibilidadCeldaEliminarPuntoVenta=false;
			this.isVisibilidadCeldaCancelarPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarPuntoVenta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesPuntoVenta=true;
			this.isVisibilidadCeldaGuardarCambiosPuntoVenta=true;
			this.isVisibilidadCeldaModificarPuntoVenta=false;
			this.isVisibilidadCeldaActualizarPuntoVenta=false;
			this.isVisibilidadCeldaEliminarPuntoVenta=false;
			this.isVisibilidadCeldaCancelarPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarPuntoVenta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosPuntoVenta=false;
			this.isVisibilidadCeldaActualizarPuntoVenta=false;
			this.isVisibilidadCeldaEliminarPuntoVenta=false;
			this.isVisibilidadCeldaCancelarPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarPuntoVenta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosPuntoVenta=false;
			this.isVisibilidadCeldaModificarPuntoVenta=true;
			this.isVisibilidadCeldaActualizarPuntoVenta=false;
			this.isVisibilidadCeldaEliminarPuntoVenta=false;
			this.isVisibilidadCeldaCancelarPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarPuntoVenta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PuntoVentaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesPuntoVenta=true;
			this.isVisibilidadCeldaGuardarCambiosPuntoVenta=true;
		} else {
			this.actualizarEstadoPanelsPuntoVenta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPuntoVenta=false;
			//this.isVisibilidadCeldaVerFormPuntoVenta=false;
			this.isVisibilidadCeldaDuplicarPuntoVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!puntoventaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPuntoVenta=false;
		} else {
			this.isVisibilidadCeldaNuevoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosPuntoVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(puntoventaSessionBean.getEsGuardarRelacionado()) {
			if(!puntoventaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPuntoVenta=false;												
			}
			
			this.jButtonCerrarPuntoVenta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPuntoVenta=false;
		}
		
		if(!this.permiteMantenimiento(this.puntoventa)) {
			this.isVisibilidadCeldaActualizarPuntoVenta=false;
			this.isVisibilidadCeldaEliminarPuntoVenta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPuntoVenta() {
	}
	
	public void actualizarEstadoPanelsPuntoVenta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionPuntoVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPuntoVenta!=null) {
				this.jScrollPanelDatosPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionPuntoVenta!=null) {
				this.jPanelPaginacionPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPuntoVenta!=null) {
				this.jPanelParametrosReportesPuntoVenta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionPuntoVenta.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosPuntoVenta!=null) {
				this.jScrollPanelDatosPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionPuntoVenta!=null) {
				this.jPanelPaginacionPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPuntoVenta!=null) {
				this.jPanelParametrosReportesPuntoVenta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionPuntoVenta.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosPuntoVenta!=null) {
				this.jScrollPanelDatosPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionPuntoVenta!=null) {
				this.jPanelPaginacionPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPuntoVenta!=null) {
				this.jPanelParametrosReportesPuntoVenta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPuntoVenta!=null) {
				this.jScrollPanelDatosPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionPuntoVenta!=null) {
				this.jPanelPaginacionPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPuntoVenta!=null) {
				this.jPanelParametrosReportesPuntoVenta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionPuntoVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPuntoVenta!=null) {
				this.jScrollPanelDatosPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionPuntoVenta!=null) {
				this.jPanelPaginacionPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPuntoVenta!=null) {
				this.jPanelParametrosReportesPuntoVenta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionPuntoVenta.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosPuntoVenta!=null) {
				this.jScrollPanelDatosPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionPuntoVenta!=null) {
				this.jPanelPaginacionPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPuntoVenta!=null) {
				this.jPanelParametrosReportesPuntoVenta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionPuntoVenta.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosPuntoVenta!=null) {
				this.jScrollPanelDatosPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionPuntoVenta!=null) {
				this.jPanelPaginacionPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPuntoVenta!=null) {
				this.jPanelParametrosReportesPuntoVenta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.puntoventaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.puntoventaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PuntoVentaSessionBean puntoventaSessionBean=new PuntoVentaSessionBean();
		
		if(this.puntoventaSessionBean==null) {
			this.puntoventaSessionBean=new PuntoVentaSessionBean();
		}
		
		this.puntoventaSessionBean.setsUltimaBusquedaPuntoVenta(this.getsAccionBusqueda());
		this.puntoventaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.puntoventaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PuntoVentaSessionBean puntoventaSessionBean=new PuntoVentaSessionBean();
		
		if(this.puntoventaSessionBean==null) {
			this.puntoventaSessionBean=new PuntoVentaSessionBean();
		}
		
		if(this.puntoventaSessionBean.getsUltimaBusquedaPuntoVenta()!=null&&!this.puntoventaSessionBean.getsUltimaBusquedaPuntoVenta().equals("")) {
			this.setsAccionBusqueda(puntoventaSessionBean.getsUltimaBusquedaPuntoVenta());
			this.setiNumeroPaginacion(puntoventaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(puntoventaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.puntoventaSessionBean.setsUltimaBusquedaPuntoVenta("");
		this.puntoventaSessionBean.setiNumeroPaginacion(PuntoVentaConstantesFunciones.INUMEROPAGINACION);
		this.puntoventaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPuntoVenta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPuntoVenta() {
		this.updateBorderResaltarBusquedasFormularioPuntoVenta();
		this.updateVisibilidadBusquedasFormularioPuntoVenta();
		this.updateHabilitarBusquedasFormularioPuntoVenta();
	}
	
	public void updateBorderResaltarBusquedasFormularioPuntoVenta() {					
	}
	
	public void updateVisibilidadBusquedasFormularioPuntoVenta() {
	}
	
	public void updateHabilitarBusquedasFormularioPuntoVenta() {
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
	
	public void updateControlesFormularioPuntoVenta() throws Exception {

		if(this.jInternalFrameDetalleFormPuntoVenta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPuntoVenta();
		this.updateVisibilidadResaltarControlesFormularioPuntoVenta();
		this.updateHabilitarResaltarControlesFormularioPuntoVenta();
		
	}
	
	public void updateBorderResaltarControlesFormularioPuntoVenta() throws Exception {
		if(this.jInternalFrameDetalleFormPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.puntoventaConstantesFunciones.resaltaridPuntoVenta!=null && this.jInternalFrameDetalleFormPuntoVenta!=null) {this.jInternalFrameDetalleFormPuntoVenta.jLabelidPuntoVenta.setBorder(this.puntoventaConstantesFunciones.resaltaridPuntoVenta);}
		if(this.puntoventaConstantesFunciones.resaltarcodigoPuntoVenta!=null && this.jInternalFrameDetalleFormPuntoVenta!=null) {this.jInternalFrameDetalleFormPuntoVenta.jTextFieldcodigoPuntoVenta.setBorder(this.puntoventaConstantesFunciones.resaltarcodigoPuntoVenta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPuntoVenta() throws Exception {		
		if(this.jInternalFrameDetalleFormPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) {
	
		//this.jInternalFrameDetalleFormPuntoVenta.jLabelidPuntoVenta.setVisible(this.puntoventaConstantesFunciones.mostraridPuntoVenta);
		this.jInternalFrameDetalleFormPuntoVenta.jPanelidPuntoVenta.setVisible(this.puntoventaConstantesFunciones.mostraridPuntoVenta);
		//this.jInternalFrameDetalleFormPuntoVenta.jTextFieldcodigoPuntoVenta.setVisible(this.puntoventaConstantesFunciones.mostrarcodigoPuntoVenta);
		this.jInternalFrameDetalleFormPuntoVenta.jPanelcodigoPuntoVenta.setVisible(this.puntoventaConstantesFunciones.mostrarcodigoPuntoVenta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPuntoVenta() throws Exception {
		if(this.jInternalFrameDetalleFormPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPuntoVenta!=null) {
	
		this.jInternalFrameDetalleFormPuntoVenta.jLabelidPuntoVenta.setEnabled(this.puntoventaConstantesFunciones.activaridPuntoVenta);
		this.jInternalFrameDetalleFormPuntoVenta.jTextFieldcodigoPuntoVenta.setEnabled(this.puntoventaConstantesFunciones.activarcodigoPuntoVenta);
		}
	}
	
		
}