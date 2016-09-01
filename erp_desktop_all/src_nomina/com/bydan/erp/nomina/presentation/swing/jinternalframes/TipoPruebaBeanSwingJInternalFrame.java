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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




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

import com.bydan.erp.nomina.util.TipoPruebaConstantesFunciones;
import com.bydan.erp.nomina.util.TipoPruebaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoPruebaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoPruebaBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
public class TipoPruebaBeanSwingJInternalFrame extends TipoPruebaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoPruebaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoPrueba> tipopruebaValidator = new ClassValidator<TipoPrueba>(TipoPrueba.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoPrueba tipoprueba;	
	public TipoPrueba tipopruebaAux;
	public TipoPrueba tipopruebaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoPrueba tipopruebaTotales;
	public Long idTipoPruebaActual;
	public Long iIdNuevoTipoPrueba=0L;
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
	
	public Boolean isPermisoTodoTipoPrueba;
	public Boolean isPermisoNuevoTipoPrueba;
	public Boolean isPermisoActualizarTipoPrueba;
	public Boolean isPermisoActualizarOriginalTipoPrueba;
	public Boolean isPermisoEliminarTipoPrueba;
	public Boolean isPermisoGuardarCambiosTipoPrueba;
	public Boolean isPermisoConsultaTipoPrueba;
	public Boolean isPermisoBusquedaTipoPrueba;
	public Boolean isPermisoReporteTipoPrueba;
	public Boolean isPermisoPaginacionMedioTipoPrueba;
	public Boolean isPermisoPaginacionAltoTipoPrueba;
	public Boolean isPermisoPaginacionTodoTipoPrueba;
	public Boolean isPermisoCopiarTipoPrueba;
	public Boolean isPermisoVerFormTipoPrueba;
	public Boolean isPermisoDuplicarTipoPrueba;
	public Boolean isPermisoOrdenTipoPrueba;
	
	
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
	
	public TipoPruebaParameterReturnGeneral tipopruebaReturnGeneral;
	public TipoPruebaParameterReturnGeneral tipopruebaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoPrueba=false;
	public Boolean esParaAccionDesdeFormularioTipoPrueba=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoPruebaSessionBeanAdditional tipopruebaSessionBeanAdditional=null;
	
	public TipoPruebaSessionBeanAdditional getTipoPruebaSessionBeanAdditional() {
		return this.tipopruebaSessionBeanAdditional;
	}
	
	public void setTipoPruebaSessionBeanAdditional(TipoPruebaSessionBeanAdditional tipopruebaSessionBeanAdditional) {
		try {
			this.tipopruebaSessionBeanAdditional=tipopruebaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoPruebaBeanSwingJInternalFrameAdditional tipopruebaBeanSwingJInternalFrameAdditional=null;
	//public class TipoPruebaBeanSwingJInternalFrame
	
	public TipoPruebaBeanSwingJInternalFrameAdditional getTipoPruebaBeanSwingJInternalFrameAdditional() {
		return this.tipopruebaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoPruebaBeanSwingJInternalFrameAdditional(TipoPruebaBeanSwingJInternalFrameAdditional tipopruebaBeanSwingJInternalFrameAdditional) {
		try {
			this.tipopruebaBeanSwingJInternalFrameAdditional=tipopruebaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoPruebaLogic tipopruebaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoPrueba tipopruebaBean;
	public TipoPruebaConstantesFunciones tipopruebaConstantesFunciones;
	//public TipoPruebaParameterReturnGeneral tipopruebaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoPrueba> tipopruebas;	
	//public List<TipoPrueba> tipopruebasEliminados;
	//public List<TipoPrueba> tipopruebasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoPrueba=false;
	public Boolean isVisibilidadCeldaDuplicarTipoPrueba=true;
	public Boolean isVisibilidadCeldaCopiarTipoPrueba=true;
	public Boolean isVisibilidadCeldaVerFormTipoPrueba=true;
	public Boolean isVisibilidadCeldaOrdenTipoPrueba=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoPrueba=false;
	public Boolean isVisibilidadCeldaModificarTipoPrueba=false;
	public Boolean isVisibilidadCeldaActualizarTipoPrueba=false;
	public Boolean isVisibilidadCeldaEliminarTipoPrueba=false;
	public Boolean isVisibilidadCeldaCancelarTipoPrueba=false;
	public Boolean isVisibilidadCeldaGuardarTipoPrueba=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoPrueba=false;	
	
	
	
	public Long getiIdNuevoTipoPrueba() {
		return this.iIdNuevoTipoPrueba;
	}

	public void setiIdNuevoTipoPrueba(Long iIdNuevoTipoPrueba) {
		this.iIdNuevoTipoPrueba = iIdNuevoTipoPrueba;
	}
	
	public Long getidTipoPruebaActual() {
		return this.idTipoPruebaActual;
	}

	public void setidTipoPruebaActual(Long idTipoPruebaActual) {
		this.idTipoPruebaActual = idTipoPruebaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoPrueba gettipoprueba() {
		return this.tipoprueba;
	}

	public void settipoprueba(TipoPrueba tipoprueba) {
		this.tipoprueba = tipoprueba;
	}
	
	public TipoPrueba gettipopruebaAux() {
		return this.tipopruebaAux;
	}

	public void settipopruebaAux(TipoPrueba tipopruebaAux) {
		this.tipopruebaAux = tipopruebaAux;
	}				
	
	public TipoPrueba gettipopruebaAnterior() {
		return this.tipopruebaAnterior;
	}

	public void settipopruebaAnterior(TipoPrueba tipopruebaAnterior) {
		this.tipopruebaAnterior = tipopruebaAnterior;
	}	
	
	public TipoPrueba gettipopruebaTotales() {
		return this.tipopruebaTotales;
	}

	public void settipopruebaTotales(TipoPrueba tipopruebaTotales) {
		this.tipopruebaTotales = tipopruebaTotales;
	}	
	
	public TipoPrueba gettipopruebaBean() {
		return this.tipopruebaBean;
	}

	public void settipopruebaBean(TipoPrueba tipopruebaBean) {
		this.tipopruebaBean = tipopruebaBean;
	}	
	
	public TipoPruebaParameterReturnGeneral gettipopruebaReturnGeneral() {
		return this.tipopruebaReturnGeneral;
	}

	public void settipopruebaReturnGeneral(TipoPruebaParameterReturnGeneral tipopruebaReturnGeneral) {
		this.tipopruebaReturnGeneral = tipopruebaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoPruebaLogic getTipoPruebaLogic()	{		
		return tipopruebaLogic;
	}

	public void setTipoPruebaLogic(TipoPruebaLogic tipopruebaLogic) {
		this.tipopruebaLogic = tipopruebaLogic;
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
	
	public Boolean getIsEsNuevoTipoPrueba() {
		return isEsNuevoTipoPrueba;
	}

	public void setIsEsNuevoTipoPrueba(Boolean isEsNuevoTipoPrueba) {
		this.isEsNuevoTipoPrueba = isEsNuevoTipoPrueba;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoPrueba() {
		return esParaAccionDesdeFormularioTipoPrueba;
	}
	
	public void setEsParaAccionDesdeFormularioTipoPrueba(Boolean esParaAccionDesdeFormularioTipoPrueba) {
		this.esParaAccionDesdeFormularioTipoPrueba = esParaAccionDesdeFormularioTipoPrueba;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoPrueba() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoPruebaConstantesFunciones.refrescarForeignKeysDescripcionesTipoPrueba(this.tipopruebaLogic.getTipoPruebas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoPruebaConstantesFunciones.refrescarForeignKeysDescripcionesTipoPrueba(this.tipopruebas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipopruebaLogic.setTipoPruebas(this.tipopruebas);
			tipopruebaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoPruebaParameterReturnGeneral getTipoPruebaParameterGeneral() {
		return this.tipopruebaParameterGeneral;
	}
	
	public void setTipoPruebaParameterGeneral(TipoPruebaParameterReturnGeneral tipopruebaParameterGeneral) {
		this.tipopruebaParameterGeneral = tipopruebaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoPrueba() {
		return isPermisoTodoTipoPrueba;
	}

	public void setIsPermisoTodoTipoPrueba(Boolean isPermisoTodoTipoPrueba) {
		this.isPermisoTodoTipoPrueba = isPermisoTodoTipoPrueba;
	}

	public Boolean getIsPermisoNuevoTipoPrueba() {
		return isPermisoNuevoTipoPrueba;
	}

	public void setIsPermisoNuevoTipoPrueba(Boolean isPermisoNuevoTipoPrueba) {
		this.isPermisoNuevoTipoPrueba = isPermisoNuevoTipoPrueba;
	}

	public Boolean getIsPermisoActualizarTipoPrueba() {
		return isPermisoActualizarTipoPrueba;
	}

	public void setIsPermisoActualizarTipoPrueba(Boolean isPermisoActualizarTipoPrueba) {
		this.isPermisoActualizarTipoPrueba = isPermisoActualizarTipoPrueba;
	}

	public Boolean getIsPermisoEliminarTipoPrueba() {
		return isPermisoEliminarTipoPrueba;
	}

	public void setIsPermisoEliminarTipoPrueba(Boolean isPermisoEliminarTipoPrueba) {
		this.isPermisoEliminarTipoPrueba = isPermisoEliminarTipoPrueba;
	}

	public Boolean getIsPermisoGuardarCambiosTipoPrueba() {
		return isPermisoGuardarCambiosTipoPrueba;
	}

	public void setIsPermisoGuardarCambiosTipoPrueba(Boolean isPermisoGuardarCambiosTipoPrueba) {
		this.isPermisoGuardarCambiosTipoPrueba = isPermisoGuardarCambiosTipoPrueba;
	}
	
	public Boolean getIsPermisoConsultaTipoPrueba() {
		return isPermisoConsultaTipoPrueba;
	}

	public void setIsPermisoConsultaTipoPrueba(Boolean isPermisoConsultaTipoPrueba) {
		this.isPermisoConsultaTipoPrueba = isPermisoConsultaTipoPrueba;
	}

	public Boolean getIsPermisoBusquedaTipoPrueba() {
		return isPermisoBusquedaTipoPrueba;
	}

	public void setIsPermisoBusquedaTipoPrueba(Boolean isPermisoBusquedaTipoPrueba) {
		this.isPermisoBusquedaTipoPrueba = isPermisoBusquedaTipoPrueba;
	}

	public Boolean getIsPermisoReporteTipoPrueba() {
		return isPermisoReporteTipoPrueba;
	}

	public void setIsPermisoReporteTipoPrueba(Boolean isPermisoReporteTipoPrueba) {
		this.isPermisoReporteTipoPrueba = isPermisoReporteTipoPrueba;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoPrueba() {
		return isPermisoPaginacionMedioTipoPrueba;
	}

	public void setIsPermisoPaginacionMedioTipoPrueba(Boolean isPermisoPaginacionMedioTipoPrueba) {
		this.isPermisoPaginacionMedioTipoPrueba = isPermisoPaginacionMedioTipoPrueba;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoPrueba() {
		return isPermisoPaginacionTodoTipoPrueba;
	}

	public void setIsPermisoPaginacionTodoTipoPrueba(Boolean isPermisoPaginacionTodoTipoPrueba) {
		this.isPermisoPaginacionTodoTipoPrueba = isPermisoPaginacionTodoTipoPrueba;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoPrueba() {
		return isPermisoPaginacionAltoTipoPrueba;
	}

	public void setIsPermisoPaginacionAltoTipoPrueba(Boolean isPermisoPaginacionAltoTipoPrueba) {
		this.isPermisoPaginacionAltoTipoPrueba = isPermisoPaginacionAltoTipoPrueba;
	}
	
	public Boolean getIsPermisoCopiarTipoPrueba() {
		return isPermisoCopiarTipoPrueba;
	}

	public void setIsPermisoCopiarTipoPrueba(Boolean isPermisoCopiarTipoPrueba) {
		this.isPermisoCopiarTipoPrueba = isPermisoCopiarTipoPrueba;
	}
	
	public Boolean getIsPermisoVerFormTipoPrueba() {
		return isPermisoVerFormTipoPrueba;
	}

	public void setIsPermisoVerFormTipoPrueba(Boolean isPermisoVerFormTipoPrueba) {
		this.isPermisoVerFormTipoPrueba = isPermisoVerFormTipoPrueba;
	}
	
	public Boolean getIsPermisoDuplicarTipoPrueba() {
		return isPermisoDuplicarTipoPrueba;
	}

	public void setIsPermisoDuplicarTipoPrueba(Boolean isPermisoDuplicarTipoPrueba) {
		this.isPermisoDuplicarTipoPrueba = isPermisoDuplicarTipoPrueba;
	}
	
	public Boolean getIsPermisoOrdenTipoPrueba() {
		return isPermisoOrdenTipoPrueba;
	}

	public void setIsPermisoOrdenTipoPrueba(Boolean isPermisoOrdenTipoPrueba) {
		this.isPermisoOrdenTipoPrueba = isPermisoOrdenTipoPrueba;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoPrueba() {
		return isVisibilidadCeldaNuevoTipoPrueba;
	}

	public void setIsVisibilidadCeldaNuevoTipoPrueba(Boolean isVisibilidadCeldaNuevoTipoPrueba) {
		this.isVisibilidadCeldaNuevoTipoPrueba = isVisibilidadCeldaNuevoTipoPrueba;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoPrueba() {
		return isVisibilidadCeldaDuplicarTipoPrueba;
	}

	public void setIsVisibilidadCeldaDuplicarTipoPrueba(Boolean isVisibilidadCeldaDuplicarTipoPrueba) {
		this.isVisibilidadCeldaDuplicarTipoPrueba = isVisibilidadCeldaDuplicarTipoPrueba;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoPrueba() {
		return isVisibilidadCeldaCopiarTipoPrueba;
	}

	public void setIsVisibilidadCeldaCopiarTipoPrueba(Boolean isVisibilidadCeldaCopiarTipoPrueba) {
		this.isVisibilidadCeldaCopiarTipoPrueba = isVisibilidadCeldaCopiarTipoPrueba;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoPrueba() {
		return isVisibilidadCeldaVerFormTipoPrueba;
	}

	public void setIsVisibilidadCeldaVerFormTipoPrueba(Boolean isVisibilidadCeldaVerFormTipoPrueba) {
		this.isVisibilidadCeldaVerFormTipoPrueba = isVisibilidadCeldaVerFormTipoPrueba;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoPrueba() {
		return isVisibilidadCeldaOrdenTipoPrueba;
	}

	public void setIsVisibilidadCeldaOrdenTipoPrueba(Boolean isVisibilidadCeldaOrdenTipoPrueba) {
		this.isVisibilidadCeldaOrdenTipoPrueba = isVisibilidadCeldaOrdenTipoPrueba;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoPrueba() {
		return isVisibilidadCeldaNuevoRelacionesTipoPrueba;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoPrueba(Boolean isVisibilidadCeldaNuevoRelacionesTipoPrueba) {
		this.isVisibilidadCeldaNuevoRelacionesTipoPrueba = isVisibilidadCeldaNuevoRelacionesTipoPrueba;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoPrueba() {
		return isVisibilidadCeldaModificarTipoPrueba;
	}

	public void setIsVisibilidadCeldaModificarTipoPrueba(Boolean isVisibilidadCeldaModificarTipoPrueba) {
		this.isVisibilidadCeldaModificarTipoPrueba = isVisibilidadCeldaModificarTipoPrueba;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoPrueba() {
		return isVisibilidadCeldaActualizarTipoPrueba;
	}

	public void setIsVisibilidadCeldaActualizarTipoPrueba(Boolean isVisibilidadCeldaActualizarTipoPrueba) {
		this.isVisibilidadCeldaActualizarTipoPrueba = isVisibilidadCeldaActualizarTipoPrueba;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoPrueba() {
		return isVisibilidadCeldaEliminarTipoPrueba;
	}

	public void setIsVisibilidadCeldaEliminarTipoPrueba(Boolean isVisibilidadCeldaEliminarTipoPrueba) {
		this.isVisibilidadCeldaEliminarTipoPrueba = isVisibilidadCeldaEliminarTipoPrueba;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoPrueba() {
		return isVisibilidadCeldaCancelarTipoPrueba;
	}

	public void setIsVisibilidadCeldaCancelarTipoPrueba(Boolean isVisibilidadCeldaCancelarTipoPrueba) {
		this.isVisibilidadCeldaCancelarTipoPrueba = isVisibilidadCeldaCancelarTipoPrueba;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoPrueba() {
		return isVisibilidadCeldaGuardarTipoPrueba;
	}

	public void setIsVisibilidadCeldaGuardarTipoPrueba(Boolean isVisibilidadCeldaGuardarTipoPrueba) {
		this.isVisibilidadCeldaGuardarTipoPrueba = isVisibilidadCeldaGuardarTipoPrueba;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoPrueba() {
		return isVisibilidadCeldaGuardarCambiosTipoPrueba;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoPrueba(Boolean isVisibilidadCeldaGuardarCambiosTipoPrueba) {
		this.isVisibilidadCeldaGuardarCambiosTipoPrueba = isVisibilidadCeldaGuardarCambiosTipoPrueba;
	}
		
	public TipoPruebaSessionBean gettipopruebaSessionBean() {
		return this.tipopruebaSessionBean;
	}
	
	public void settipopruebaSessionBean(TipoPruebaSessionBean tipopruebaSessionBean) {
		this.tipopruebaSessionBean=tipopruebaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoPrueba(TipoPrueba tipoprueba)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoPrueba tipoprueba,TipoPrueba tipopruebaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoPrueba(tipoprueba);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipopruebaAux.setId(tipoprueba.getId());
		tipopruebaAux.setVersionRow(tipoprueba.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoPrueba();
		
			int intSelectedRow = this.jTableDatosTipoPrueba.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprueba =(TipoPrueba) this.tipopruebaLogic.getTipoPruebas().toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoprueba =(TipoPrueba) this.tipopruebas.toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoPruebaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoPrueba(this.tipoprueba,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPrueba(this.tipoprueba);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipopruebaValidator.getInvalidValues(this.tipoprueba);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipopruebaLogic.setDatosCliente(datosCliente);
			tipopruebaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipopruebaAux=new  TipoPrueba();
				
				tipopruebaAux.setIsNew(true);
				tipopruebaAux.setIsChanged(true);
				
				tipopruebaAux.setTipoPruebaOriginal(this.tipoprueba);
				
				tipopruebaAux.setId(this.tipoprueba.getId());	
				tipopruebaAux.setVersionRow(this.tipoprueba.getVersionRow());	
				tipopruebaAux.setcodigo(this.tipoprueba.getcodigo());	
				tipopruebaAux.setnombre(this.tipoprueba.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipopruebaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipopruebaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipopruebaAux,tipopruebaLogic.getTipoPruebas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipopruebaAux,tipopruebas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipopruebaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipopruebaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopruebaLogic.saveTipoPruebas();//WithConnection
						//tipopruebaLogic.getSetVersionRowTipoPruebas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoprueba,tipopruebaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipopruebaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipopruebaLogic.saveTipoPruebaRelaciones(tipopruebaAux);//WithConnection
								//tipopruebaLogic.getSetVersionRowTipoPruebas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoprueba,tipopruebaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipopruebaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipopruebaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipopruebaAux,tipopruebaLogic.getTipoPruebas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipopruebaAux,tipopruebas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoprueba,tipopruebaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipopruebaAux=new  TipoPrueba();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipopruebaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipopruebaSessionBean.getEsGuardarRelacionado() && this.tipoprueba.getId()>=0)) {
						
					tipopruebaAux.setIsNew(false);
				}
				
				tipopruebaAux.setIsDeleted(false);
			
				tipopruebaAux.setId(this.tipoprueba.getId());	
				tipopruebaAux.setVersionRow(this.tipoprueba.getVersionRow());	
				tipopruebaAux.setcodigo(this.tipoprueba.getcodigo());	
				tipopruebaAux.setnombre(this.tipoprueba.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipopruebaAux,tipopruebaLogic.getTipoPruebas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipopruebaAux,tipopruebas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipopruebaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipopruebaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopruebaLogic.saveTipoPruebas();//WithConnection
						//tipopruebaLogic.getSetVersionRowTipoPruebas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoprueba,tipopruebaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipopruebaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipopruebaLogic.saveTipoPruebaRelaciones(tipopruebaAux);//WithConnection
								//tipopruebaLogic.getSetVersionRowTipoPruebas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoprueba,tipopruebaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipopruebaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipopruebaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipopruebaAux,tipopruebaLogic.getTipoPruebas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipopruebaAux,tipopruebas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoprueba,tipopruebaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipopruebaAux=new  TipoPrueba();
				
				tipopruebaAux.setIsNew(false);
				tipopruebaAux.setIsChanged(false);
				
				tipopruebaAux.setIsDeleted(true);
				
				tipopruebaAux.setId(this.tipoprueba.getId());	
				tipopruebaAux.setVersionRow(this.tipoprueba.getVersionRow());	
				tipopruebaAux.setcodigo(this.tipoprueba.getcodigo());	
				tipopruebaAux.setnombre(this.tipoprueba.getnombre());	
				
				if(this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipopruebaAux.getId()>=0) {	
						this.tipopruebasEliminados.add(tipopruebaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipopruebaAux,tipopruebaLogic.getTipoPruebas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipopruebaAux,tipopruebas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipopruebaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipopruebaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopruebaLogic.saveTipoPruebas();//WithConnection
						//tipopruebaLogic.getSetVersionRowTipoPruebas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipopruebaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipopruebaLogic.saveTipoPruebaRelaciones(tipopruebaAux);//WithConnection
								//tipopruebaLogic.getSetVersionRowTipoPruebas();//WithConnection
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
							if(this.tipopruebaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipopruebaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipopruebaAux,tipopruebaLogic.getTipoPruebas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipopruebaAux,tipopruebas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopruebaLogic.getTipoPruebas().addAll(this.tipopruebasEliminados);
					
					tipopruebaLogic.saveTipoPruebas();//WithConnection
					//tipopruebaLogic.getSetVersionRowTipoPruebas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipopruebasEliminados= new ArrayList<TipoPrueba>();		
			}
			
			if(this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopruebaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Prueba GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Prueba",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoprueba=tipopruebaAux;
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
      		//this.finishProcessTipoPrueba();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoPrueba tipopruebaLocal) throws Exception {
		
		if(this.tipopruebaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoPrueba tipopruebaLocal) throws Exception {	
		if(this.tipopruebaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoPruebaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoPrueba.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoprueba =(TipoPrueba) this.tipopruebaLogic.getTipoPruebas().toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoprueba =(TipoPrueba) this.tipopruebas.toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipopruebaValidator.getInvalidValues(this.tipoprueba);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoPrueba tipoprueba,List<TipoPrueba> tipopruebas) throws Exception {
		try	{		
			TipoPruebaConstantesFunciones.actualizarLista(tipoprueba,tipopruebas,this.tipopruebaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoPrueba tipoprueba,List<TipoPrueba> tipopruebas) throws Exception {
		try	{			
			TipoPruebaConstantesFunciones.actualizarSelectedLista(tipoprueba,tipopruebas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoPrueba> tipopruebasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipopruebasLocal=this.tipopruebaLogic.getTipoPruebas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipopruebasLocal=this.tipopruebas;
			}
			//ARCHITECTURE
		
			for(TipoPrueba tipopruebaLocal:tipopruebasLocal) {
				if(this.permiteMantenimiento(tipopruebaLocal) && tipopruebaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoPruebaConstantesFunciones.getTipoPruebaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoPruebaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrueba.jLabelcodigoTipoPrueba,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoPruebaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrueba.jLabelnombreTipoPrueba,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPrueba.jLabelcodigoTipoPrueba,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPrueba.jLabelnombreTipoPrueba,"");
		
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
		this.iIdNuevoTipoPrueba--;	
		
		
		this.tipopruebaAux=new TipoPrueba();
		
		this.tipopruebaAux.setId(this.iIdNuevoTipoPrueba);
		this.tipopruebaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipopruebaLogic.getTipoPruebas().add(this.tipopruebaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipopruebas.add(this.tipopruebaAux);
		}
		//ARCHITECTURE
		
		this.tipoprueba=this.tipopruebaAux;
		
		if(TipoPruebaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoPrueba(this.tipoprueba);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoPrueba(this.tipoprueba);
		}
				
		//this.setDefaultControlesTipoPrueba();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoPrueba();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoPrueba();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPrueba();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoPrueba(this.tipopruebaBean,this.tipoprueba,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoPrueba(this.tipoprueba);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoPruebaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipopruebaSessionBean.getConGuardarRelaciones()) {
			classes=TipoPruebaConstantesFunciones.getClassesRelationshipsOfTipoPrueba(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipopruebaReturnGeneral=tipopruebaLogic.procesarEventosTipoPruebasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipopruebaLogic.getTipoPruebas(),this.tipoprueba,this.tipopruebaParameterGeneral,this.isEsNuevoTipoPrueba,classes);//this.tipopruebaLogic.getTipoPrueba()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoPrueba(this.tipopruebaReturnGeneral,this.tipopruebaBean,false);
		
		if(this.tipopruebaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoPrueba(this.tipopruebaReturnGeneral.getTipoPrueba());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoPrueba(this.tipopruebaReturnGeneral.getTipoPrueba());
		}
		
		if(this.tipopruebaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoPrueba(this.tipopruebaReturnGeneral.getTipoPrueba(),classes);//this.tipopruebaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoPrueba(this.tipoprueba,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoPrueba();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoPrueba();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoPruebaBeanSwingJInternalFrameAdditional.RecargarFormTipoPrueba(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoPrueba(false);
						
			if(tipopruebaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoPruebaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPrueba();
			}
			
			this.actualizarVisualTableDatosTipoPrueba();
			
			this.jTableDatosTipoPrueba.setRowSelectionInterval(this.getIndiceNuevoTipoPrueba(), this.getIndiceNuevoTipoPrueba());
			
			this.seleccionarFilaTablaTipoPruebaActual();
						
			this.actualizarEstadoCeldasBotonesTipoPrueba("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoPrueba(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoPrueba.jTextFieldcodigoTipoPrueba.setEnabled(isHabilitar && this.tipopruebaConstantesFunciones.activarcodigoTipoPrueba);
		this.jInternalFrameDetalleFormTipoPrueba.jTextAreanombreTipoPrueba.setEnabled(isHabilitar && this.tipopruebaConstantesFunciones.activarnombreTipoPrueba);	
		
	};
	
	public void setDefaultControlesTipoPrueba() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoPrueba(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipopruebaSessionBean.setConGuardarRelaciones(true);			
			this.tipopruebaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoPrueba.jTabbedPaneRelacionesTipoPrueba.setVisible(true);
			
					
		} else {
			//this.tipopruebaSessionBean.setConGuardarRelaciones(false);			
			this.tipopruebaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoPrueba.jTabbedPaneRelacionesTipoPrueba.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoPrueba() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPrueba tipopruebaAux:this.tipopruebaLogic.getTipoPruebas()) {
				if(tipopruebaAux.getId().equals(this.iIdNuevoTipoPrueba)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPrueba tipopruebaAux:this.tipopruebas) {
				if(tipopruebaAux.getId().equals(this.iIdNuevoTipoPrueba)) {
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
	
	public int getIndiceActualTipoPrueba(TipoPrueba tipoprueba,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPrueba tipopruebaAux:this.tipopruebaLogic.getTipoPruebas()) {
				if(tipopruebaAux.getId().equals(tipoprueba.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPrueba tipopruebaAux:this.tipopruebas) {
				if(tipopruebaAux.getId().equals(tipoprueba.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoPrueba(TipoPrueba tipopruebaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPrueba tipopruebaAux:this.tipopruebaLogic.getTipoPruebas()) {
				if(tipopruebaAux.getTipoPruebaOriginal().getId().equals(tipopruebaOriginal.getId())) {
					existe=true;
					tipopruebaOriginal.setId(tipopruebaAux.getId());
					tipopruebaOriginal.setVersionRow(tipopruebaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPrueba tipopruebaAux:this.tipopruebas) {
				if(tipopruebaAux.getTipoPruebaOriginal().getId().equals(tipopruebaOriginal.getId())) {
					existe=true;
					tipopruebaOriginal.setId(tipopruebaAux.getId());
					tipopruebaOriginal.setVersionRow(tipopruebaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoPrueba(Boolean esParaCancelar) throws Exception {
		tipopruebasAux=new ArrayList<TipoPrueba>();
		tipopruebaAux=new TipoPrueba();
		
		if(!this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoPrueba tipopruebaAux:this.tipopruebaLogic.getTipoPruebas()) {
					if(tipopruebaAux.getId()<0) {
						tipopruebasAux.add(tipopruebaAux);
					}		
				}
				this.iIdNuevoTipoPrueba=0L;
				this.tipopruebaLogic.getTipoPruebas().removeAll(tipopruebasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPrueba tipopruebaAux:this.tipopruebas) {
					if(tipopruebaAux.getId()<0) {
						tipopruebasAux.add(tipopruebaAux);
					}		
				}
				this.iIdNuevoTipoPrueba=0L;
				this.tipopruebas.removeAll(tipopruebasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoPrueba 
					&& this.tipopruebaLogic.getTipoPruebas().size()>0
					) {
					tipopruebaAux=this.tipopruebaLogic.getTipoPruebas().get(this.tipopruebaLogic.getTipoPruebas().size() - 1);
				
					if(tipopruebaAux.getId()<0) {
						this.tipopruebaLogic.getTipoPruebas().remove(tipopruebaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoPrueba && this.tipopruebas.size()>0) {
					tipopruebaAux=this.tipopruebas.get(this.tipopruebas.size() - 1);
				
					if(tipopruebaAux.getId()<0) {
						this.tipopruebas.remove(tipopruebaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoPrueba(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoprueba.getId()<0) {
				this.tipopruebaLogic.getTipoPruebas().remove(this.tipoprueba);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoprueba.getId()<0) {
				this.tipopruebas.remove(this.tipoprueba);
			}
		}			
	}
	
	public void setEstadosInicialesTipoPrueba(List<TipoPrueba> tipopruebasAux) throws Exception {
		TipoPruebaConstantesFunciones.setEstadosInicialesTipoPrueba(tipopruebasAux);
	}
	
	public void setEstadosInicialesTipoPrueba(TipoPrueba tipopruebaAux) throws Exception {
		TipoPruebaConstantesFunciones.setEstadosInicialesTipoPrueba(tipopruebaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoPruebaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoPrueba("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoPruebaActual()) {
				if(!this.isEsNuevoTipoPrueba) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoPrueba("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoPrueba=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoPruebaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Prueba ?", "MANTENIMIENTO DE Tipo Prueba", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoPrueba("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoPrueba tipoprueba) throws Exception {
		TipoPruebaConstantesFunciones.seleccionarAsignar(this.tipoprueba,tipoprueba);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoPrueba=this.isPermisoActualizarOriginalTipoPrueba;
			
			
			this.seleccionarAsignar(tipoprueba);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoPruebaConstantesFunciones.quitarEspaciosTipoPrueba(this.tipoprueba,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoPrueba("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipopruebaSessionBean.setsFuncionBusquedaRapida(this.tipopruebaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoPrueba) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoPrueba(esParaCancelar);				
				this.cancelarNuevoTipoPrueba(esParaCancelar);								
			}
			
			this.tipoprueba=new TipoPrueba();
			
			this.inicializarTipoPrueba();
			
			this.actualizarEstadoCeldasBotonesTipoPrueba("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoPrueba() throws Exception {
		try {
			TipoPruebaConstantesFunciones.inicializarTipoPrueba(this.tipoprueba);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipopruebaLogic.getTipoPruebas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoPruebas(String sAccionBusqueda,List<TipoPrueba> tipopruebasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoPrueba"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoPruebaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoPruebaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoPrueba"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Pruebas");		
		parameters.put("busquedapor", TipoPruebaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoPrueba=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoPruebaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoPruebaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoPrueba=new JRBeanArrayDataSource(TipoPruebaJInternalFrame.TraerTipoPruebaBeans(tipopruebasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoPrueba);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoPruebaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoPruebaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoPruebaBean.TraerTipoPruebaBeans(tipopruebasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoPruebas(sAccionBusqueda,sTipoArchivoReporte,tipopruebasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoPruebas(sAccionBusqueda,sTipoArchivoReporte,tipopruebasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoPruebaActionPerformed(null);
					//this.generarExcelReporteTipoPruebas(sAccionBusqueda,sTipoArchivoReporte,tipopruebasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoPruebas(sAccionBusqueda,sTipoArchivoReporte,tipopruebasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoPruebas(sAccionBusqueda,sTipoArchivoReporte,tipopruebasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoPruebas(sAccionBusqueda,sTipoArchivoReporte,tipopruebasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoPruebas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPrueba> tipopruebasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprueba";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPruebas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoPrueba("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoPrueba tipoprueba : tipopruebasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoPruebaConstantesFunciones.generarExcelReporteDataTipoPrueba("NORMAL",row,workbook,tipoprueba,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopruebaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prueba",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoPrueba(String sTipo,Row row,Workbook workbook) {
		
		TipoPruebaConstantesFunciones.generarExcelReporteHeaderTipoPrueba(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoPruebas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPrueba> tipopruebasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprueba_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPruebas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoPrueba tipoprueba : tipopruebasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoPruebaConstantesFunciones.getTipoPruebaDescripcion(tipoprueba));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPruebaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPruebaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprueba.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPruebaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPruebaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprueba.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopruebaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prueba",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoPruebas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPrueba> tipopruebasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoPrueba> tipopruebasRespaldo=null;
		
		classes=TipoPruebaConstantesFunciones.getClassesRelationshipsOfTipoPrueba(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipopruebaLogic.setDatosCliente(this.datosCliente);
		this.tipopruebaLogic.setDatosDeep(this.datosDeep);
		this.tipopruebaLogic.setIsConDeep(true);
		
		tipopruebasRespaldo=this.tipopruebaLogic.getTipoPruebas();
		
		this.tipopruebaLogic.setTipoPruebas(tipopruebasParaReportes);	
		this.tipopruebaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipopruebasParaReportes=this.tipopruebaLogic.getTipoPruebas();
		this.tipopruebaLogic.setTipoPruebas(tipopruebasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprueba_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPruebas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoPrueba("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoPrueba tipoprueba : tipopruebasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoPrueba("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoPruebaConstantesFunciones.generarExcelReporteDataTipoPrueba("NORMAL",row,workbook,tipoprueba,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoPruebaConstantesFunciones.getTipoPruebaDescripcion(tipoprueba));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopruebaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prueba",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPrueba.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPrueba.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPrueba.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPrueba.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoPrueba() throws Exception {		
		this.startProcessTipoPrueba(true);
	}
	
	public void startProcessTipoPrueba(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoPrueba, this.jScrollPanelDatosTipoPrueba,this.jPanelPaginacionTipoPrueba, this.jScrollPanelDatosEdicionTipoPrueba, this.jPanelAccionesTipoPrueba,this.jPanelAccionesFormularioTipoPrueba,this.jmenuBarTipoPrueba,this.jmenuBarDetalleTipoPrueba,this.jTtoolBarTipoPrueba,this.jTtoolBarDetalleTipoPrueba);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoPrueba=null; 
		
		final JPanel jPanelParametrosReportesTipoPrueba=this.jPanelParametrosReportesTipoPrueba;
		//final JScrollPane jScrollPanelDatosTipoPrueba=this.jScrollPanelDatosTipoPrueba;
		final JTable jTableDatosTipoPrueba=this.jTableDatosTipoPrueba;		
		final JPanel jPanelPaginacionTipoPrueba=this.jPanelPaginacionTipoPrueba;
		//final JScrollPane jScrollPanelDatosEdicionTipoPrueba=this.jScrollPanelDatosEdicionTipoPrueba;
		final JPanel jPanelAccionesTipoPrueba=this.jPanelAccionesTipoPrueba;
		
		JPanel jPanelCamposAuxiliarTipoPrueba=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoPrueba=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) {
			jPanelCamposAuxiliarTipoPrueba=this.jInternalFrameDetalleFormTipoPrueba.jPanelCamposTipoPrueba;
			jPanelAccionesFormularioAuxiliarTipoPrueba=this.jInternalFrameDetalleFormTipoPrueba.jPanelAccionesFormularioTipoPrueba;
		}
		
		final JPanel jPanelCamposTipoPrueba=jPanelCamposAuxiliarTipoPrueba;
		final JPanel jPanelAccionesFormularioTipoPrueba=jPanelAccionesFormularioAuxiliarTipoPrueba;
		
		
		final JMenuBar jmenuBarTipoPrueba=this.jmenuBarTipoPrueba;
		final JToolBar jTtoolBarTipoPrueba=this.jTtoolBarTipoPrueba;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoPrueba=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoPrueba=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) {
			jmenuBarDetalleAuxiliarTipoPrueba=this.jInternalFrameDetalleFormTipoPrueba.jmenuBarDetalleTipoPrueba;
			jTtoolBarDetalleAuxiliarTipoPrueba=this.jInternalFrameDetalleFormTipoPrueba.jTtoolBarDetalleTipoPrueba;
		}
		
		final JMenuBar jmenuBarDetalleTipoPrueba=jmenuBarDetalleAuxiliarTipoPrueba;
		final JToolBar jTtoolBarDetalleTipoPrueba=jTtoolBarDetalleAuxiliarTipoPrueba;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoPrueba;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoPrueba;
			processRunnable.jTableDatos=jTableDatosTipoPrueba;
			processRunnable.jPanelCampos=jPanelCamposTipoPrueba;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoPrueba;
			processRunnable.jPanelAcciones=jPanelAccionesTipoPrueba;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoPrueba;
			
			
			processRunnable.jmenuBar=jmenuBarTipoPrueba;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoPrueba;
			processRunnable.jTtoolBar=jTtoolBarTipoPrueba;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoPrueba;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoPrueba ,jPanelParametrosReportesTipoPrueba,jTableDatosTipoPrueba, /*jScrollPanelDatosTipoPrueba,*/jPanelCamposTipoPrueba,jPanelPaginacionTipoPrueba, /*jScrollPanelDatosEdicionTipoPrueba,*/ jPanelAccionesTipoPrueba,jPanelAccionesFormularioTipoPrueba,jmenuBarTipoPrueba,jmenuBarDetalleTipoPrueba,jTtoolBarTipoPrueba,jTtoolBarDetalleTipoPrueba);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoPrueba, jScrollPanelDatosTipoPrueba,jPanelPaginacionTipoPrueba, jScrollPanelDatosEdicionTipoPrueba, jPanelAccionesTipoPrueba,jPanelAccionesFormularioTipoPrueba,jmenuBarTipoPrueba,jmenuBarDetalleTipoPrueba,jTtoolBarTipoPrueba,jTtoolBarDetalleTipoPrueba);
						
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
	
	public void finishProcessTipoPrueba() {// throws Exception 
		this.finishProcessTipoPrueba(true);
	}
	
	public void finishProcessTipoPrueba(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoPrueba, this.jScrollPanelDatosTipoPrueba,this.jPanelPaginacionTipoPrueba, this.jScrollPanelDatosEdicionTipoPrueba, this.jPanelAccionesTipoPrueba,this.jPanelAccionesFormularioTipoPrueba,this.jmenuBarTipoPrueba,this.jmenuBarDetalleTipoPrueba,this.jTtoolBarTipoPrueba,this.jTtoolBarDetalleTipoPrueba);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoPrueba=null; 
		
		final JPanel jPanelParametrosReportesTipoPrueba=this.jPanelParametrosReportesTipoPrueba;
		//final JScrollPane jScrollPanelDatosTipoPrueba=this.jScrollPanelDatosTipoPrueba;
		final JTable jTableDatosTipoPrueba=this.jTableDatosTipoPrueba;		
		final JPanel jPanelPaginacionTipoPrueba=this.jPanelPaginacionTipoPrueba;
		//final JScrollPane jScrollPanelDatosEdicionTipoPrueba=this.jScrollPanelDatosEdicionTipoPrueba;
		final JPanel jPanelAccionesTipoPrueba=this.jPanelAccionesTipoPrueba;
		
		JPanel jPanelCamposAuxiliarTipoPrueba=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoPrueba=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) {
			jPanelCamposAuxiliarTipoPrueba=this.jInternalFrameDetalleFormTipoPrueba.jPanelCamposTipoPrueba;
			jPanelAccionesFormularioAuxiliarTipoPrueba=this.jInternalFrameDetalleFormTipoPrueba.jPanelAccionesFormularioTipoPrueba;
		}
		
		final JPanel jPanelCamposTipoPrueba=jPanelCamposAuxiliarTipoPrueba;
		final JPanel jPanelAccionesFormularioTipoPrueba=jPanelAccionesFormularioAuxiliarTipoPrueba;
		
		
		final JMenuBar jmenuBarTipoPrueba=this.jmenuBarTipoPrueba;		
		final JToolBar jTtoolBarTipoPrueba=this.jTtoolBarTipoPrueba;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoPrueba=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoPrueba=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) {
			jmenuBarDetalleAuxiliarTipoPrueba=this.jInternalFrameDetalleFormTipoPrueba.jmenuBarDetalleTipoPrueba;
			jTtoolBarDetalleAuxiliarTipoPrueba=this.jInternalFrameDetalleFormTipoPrueba.jTtoolBarDetalleTipoPrueba;		
		}
		
		final JMenuBar jmenuBarDetalleTipoPrueba=jmenuBarDetalleAuxiliarTipoPrueba;
		final JToolBar jTtoolBarDetalleTipoPrueba=jTtoolBarDetalleAuxiliarTipoPrueba;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoPrueba;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoPrueba;
			processRunnable.jTableDatos=jTableDatosTipoPrueba;
			processRunnable.jPanelCampos=jPanelCamposTipoPrueba;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoPrueba;
			processRunnable.jPanelAcciones=jPanelAccionesTipoPrueba;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoPrueba;
			
			
			processRunnable.jmenuBar=jmenuBarTipoPrueba;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoPrueba;
			processRunnable.jTtoolBar=jTtoolBarTipoPrueba;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoPrueba;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoPrueba ,jPanelParametrosReportesTipoPrueba, jTableDatosTipoPrueba,/*jScrollPanelDatosTipoPrueba,*/jPanelCamposTipoPrueba,jPanelPaginacionTipoPrueba, /*jScrollPanelDatosEdicionTipoPrueba,*/ jPanelAccionesTipoPrueba,jPanelAccionesFormularioTipoPrueba,jmenuBarTipoPrueba,jmenuBarDetalleTipoPrueba,jTtoolBarTipoPrueba,jTtoolBarDetalleTipoPrueba));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoPrueba(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoPrueba(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoPrueba(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoPrueba(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoPrueba,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoPrueba,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoPrueba(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoPrueba,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoPrueba,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipopruebaConstantesFunciones.getsFinalQueryTipoPrueba();
		String  finalQueryPaginacionTodos=this.tipopruebaConstantesFunciones.getsFinalQueryTipoPrueba();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoPruebaConstantesFunciones.getArrayColumnasGlobalesNoTipoPrueba(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoPruebaConstantesFunciones.getArrayColumnasGlobalesTipoPrueba(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoPruebaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipopruebasEliminados= new ArrayList<TipoPrueba>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoPrueba();
		
				///*TipoPruebaSessionBean*/this.tipopruebaSessionBean=new TipoPruebaSessionBean();
			
			if(this.tipopruebaSessionBean==null) {
				this.tipopruebaSessionBean=new TipoPruebaSessionBean();
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
					this.iNumeroPaginacion=TipoPruebaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoPruebaConstantesFunciones.getClassesForeignKeysOfTipoPrueba(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoprueba."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipopruebasAux= new ArrayList<TipoPrueba>();
			
				
			tipopruebaLogic.setDatosCliente(this.datosCliente);
			tipopruebaLogic.setDatosDeep(this.datosDeep);
			tipopruebaLogic.setIsConDeep(true);
			
			
			tipopruebaLogic.getTipoPruebaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipopruebaLogic.getTodosTipoPruebas(finalQueryGlobal,pagination);
					
					//tipopruebaLogic.getTodosTipoPruebasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipopruebaLogic.getTipoPruebas()==null|| tipopruebaLogic.getTipoPruebas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipopruebasAux= new ArrayList<TipoPrueba>();
							tipopruebasAux.addAll(tipopruebaLogic.getTipoPruebas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipopruebasAux= new ArrayList<TipoPrueba>();
							tipopruebasAux.addAll(tipopruebas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipopruebaLogic.getTodosTipoPruebas(finalQueryGlobal+"",this.pagination);												
							
							//tipopruebaLogic.getTodosTipoPruebasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoPruebas("Todos",tipopruebaLogic.getTipoPruebas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipopruebaLogic.setTipoPruebas(new ArrayList<TipoPrueba>());					
							tipopruebaLogic.getTipoPruebas().addAll(tipopruebasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipopruebas=new ArrayList<TipoPrueba>();
							tipopruebas.addAll(tipopruebasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoPrueba=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoPrueba=this.idActual;
				
				} else if(this.idTipoPruebaActual!=null && this.idTipoPruebaActual!=0L) {
					idTipoPrueba=idTipoPruebaActual;
				}
				
					
				this.sDetalleReporte=TipoPruebaConstantesFunciones.getDetalleIndicePorId(idTipoPrueba);
				
				this.tipopruebas=new ArrayList<TipoPrueba>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipopruebaLogic.getEntity(idTipoPrueba);
					
					//tipopruebaLogic.getEntityWithConnection(idTipoPrueba);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipopruebaLogic.setTipoPruebas(new ArrayList<TipoPrueba>());
					tipopruebaLogic.getTipoPruebas().add(tipopruebaLogic.getTipoPrueba());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipopruebas=new ArrayList<TipoPrueba>();
					this.tipopruebas.add(tipoprueba);
				}
				
				if(tipopruebaLogic.getTipoPrueba()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoPrueba();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoPrueba();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipopruebaLogic.getTipoPruebas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipopruebas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipopruebaLogic.getTipoPruebas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipopruebas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoPrueba tipoprueba) {
		Boolean permite=true;
		
		if(this.tipoprueba.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoPruebaConstantesFunciones.getOrderByListaTipoPrueba();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoPruebaConstantesFunciones.getOrderByListaTipoPrueba();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPrueba tipoprueba:tipopruebaLogic.getTipoPruebas()) {
				if(tipoprueba.getsType().equals(Constantes2.S_TOTALES)) {
					tipopruebaTotales=tipoprueba;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPrueba tipoprueba:this.tipopruebas) {
				if(tipoprueba.getsType().equals(Constantes2.S_TOTALES)) {
					tipopruebaTotales=tipoprueba;
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
			this.tipopruebaAux=new TipoPrueba();
			this.tipopruebaAux.setsType(Constantes2.S_TOTALES);
			this.tipopruebaAux.setIsNew(false);
			this.tipopruebaAux.setIsChanged(false);
			this.tipopruebaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoPruebaConstantesFunciones.TotalizarValoresFilaTipoPrueba(this.tipopruebaLogic.getTipoPruebas(),this.tipopruebaAux);
				
				this.tipopruebaLogic.getTipoPruebas().add(this.tipopruebaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoPruebaConstantesFunciones.TotalizarValoresFilaTipoPrueba(this.tipopruebas,this.tipopruebaAux);
				
				this.tipopruebas.add(this.tipopruebaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipopruebaTotales=new TipoPrueba();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipopruebaLogic.getTipoPruebas().remove(tipopruebaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipopruebas.remove(tipopruebaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipopruebaTotales=new TipoPrueba();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPrueba tipoprueba:tipopruebaLogic.getTipoPruebas()) {
				if(tipoprueba.getsType().equals(Constantes2.S_TOTALES)) {
					tipopruebaTotales=tipoprueba;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoPruebaConstantesFunciones.TotalizarValoresFilaTipoPrueba(this.tipopruebaLogic.getTipoPruebas(),tipopruebaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPrueba tipoprueba:this.tipopruebas) {
				if(tipoprueba.getsType().equals(Constantes2.S_TOTALES)) {
					tipopruebaTotales=tipoprueba;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoPruebaConstantesFunciones.TotalizarValoresFilaTipoPrueba(this.tipopruebas,tipopruebaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoPrueba() {
		this.isPermisoTodoTipoPrueba=false;
		this.isPermisoNuevoTipoPrueba=false;
		this.isPermisoActualizarTipoPrueba=false;
		this.isPermisoActualizarOriginalTipoPrueba=false;
		this.isPermisoEliminarTipoPrueba=false;
		this.isPermisoGuardarCambiosTipoPrueba=false;
		this.isPermisoConsultaTipoPrueba=false;
		this.isPermisoBusquedaTipoPrueba=false;
		this.isPermisoReporteTipoPrueba=false;		
		this.isPermisoOrdenTipoPrueba=false;		
		this.isPermisoPaginacionMedioTipoPrueba=false;		
		this.isPermisoPaginacionAltoTipoPrueba=false;
		this.isPermisoPaginacionTodoTipoPrueba=false;
		this.isPermisoCopiarTipoPrueba=false;		
		this.isPermisoVerFormTipoPrueba=false;		
		this.isPermisoDuplicarTipoPrueba=false;		
		this.isPermisoOrdenTipoPrueba=false;		
	}
	
	public void setPermisosUsuarioTipoPrueba(Boolean isPermiso) {
		this.isPermisoTodoTipoPrueba=isPermiso;
		this.isPermisoNuevoTipoPrueba=isPermiso;
		this.isPermisoActualizarTipoPrueba=isPermiso;
		this.isPermisoActualizarOriginalTipoPrueba=isPermiso;
		this.isPermisoEliminarTipoPrueba=isPermiso;
		this.isPermisoGuardarCambiosTipoPrueba=isPermiso;
		this.isPermisoConsultaTipoPrueba=isPermiso;
		this.isPermisoBusquedaTipoPrueba=isPermiso;
		this.isPermisoReporteTipoPrueba=isPermiso;
		this.isPermisoOrdenTipoPrueba=isPermiso;		
		this.isPermisoPaginacionMedioTipoPrueba=isPermiso;		
		this.isPermisoPaginacionAltoTipoPrueba=isPermiso;		
		this.isPermisoPaginacionTodoTipoPrueba=isPermiso;		
		this.isPermisoCopiarTipoPrueba=isPermiso;		
		this.isPermisoVerFormTipoPrueba=isPermiso;		
		this.isPermisoDuplicarTipoPrueba=isPermiso;
		this.isPermisoOrdenTipoPrueba=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoPrueba(Boolean isPermiso) {
		//this.isPermisoTodoTipoPrueba=isPermiso;
		this.isPermisoNuevoTipoPrueba=isPermiso;
		this.isPermisoActualizarTipoPrueba=isPermiso;
		this.isPermisoActualizarOriginalTipoPrueba=isPermiso;
		this.isPermisoEliminarTipoPrueba=isPermiso;
		this.isPermisoGuardarCambiosTipoPrueba=isPermiso;
		//this.isPermisoConsultaTipoPrueba=isPermiso;
		//this.isPermisoBusquedaTipoPrueba=isPermiso;
		//this.isPermisoReporteTipoPrueba=isPermiso;
		//this.isPermisoOrdenTipoPrueba=isPermiso;		
		//this.isPermisoPaginacionMedioTipoPrueba=isPermiso;		
		//this.isPermisoPaginacionAltoTipoPrueba=isPermiso;		
		//this.isPermisoPaginacionTodoTipoPrueba=isPermiso;		
		//this.isPermisoCopiarTipoPrueba=isPermiso;		
		//this.isPermisoDuplicarTipoPrueba=isPermiso;
		//this.isPermisoOrdenTipoPrueba=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoPruebaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoPruebaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoPrueba(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoPruebaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoPruebaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoPruebaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoPruebaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoPrueba() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoPruebaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoPruebaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoPrueba=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoPrueba=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoPrueba=this.isPermisoActualizarTipoPrueba;
			this.isPermisoEliminarTipoPrueba=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoPrueba=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoPrueba=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoPrueba=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoPrueba=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoPrueba=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoPrueba=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoPrueba=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoPrueba=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoPrueba=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoPrueba=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoPrueba=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoPrueba=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoPrueba=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoPrueba.setToolTipText(this.jTableDatosTipoPrueba.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoPrueba(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoPrueba(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoPruebaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoPruebaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoPrueba() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoPruebaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoPruebaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoPruebaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoPruebaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoPruebaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoPrueba()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoPrueba()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoPrueba(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoPrueba()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPrueba();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoPrueba(TipoPrueba tipoprueba)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoPrueba(TipoPrueba tipoprueba,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoPrueba()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPrueba()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoPrueba()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoPrueba()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoPrueba()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoPrueba()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoPrueba(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoPrueba()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoPruebaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoPruebaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoPruebaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipopruebaSessionBean=new TipoPruebaSessionBean(); 
		this.tipopruebaConstantesFunciones=new TipoPruebaConstantesFunciones(); 
		this.tipopruebaBean=new TipoPrueba();//(this.tipopruebaConstantesFunciones); 		
		this.tipopruebaReturnGeneral=new TipoPruebaParameterReturnGeneral(); 
		
		this.tipopruebaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipopruebaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoPruebaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoPruebaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoPruebaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoPrueba(true);
			
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
			
			this.tipopruebaConstantesFunciones=new TipoPruebaConstantesFunciones(); 
			this.tipopruebaBean=new TipoPrueba();//this.tipopruebaConstantesFunciones); 			
			this.tipopruebaReturnGeneral=new TipoPruebaParameterReturnGeneral(); 
		
			TipoPruebaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Prueba Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoprueba=new TipoPrueba();
			this.tipopruebas = new ArrayList<TipoPrueba>();
			this.tipopruebasAux = new ArrayList<TipoPrueba>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic=new TipoPruebaLogic();
				this.tipopruebaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipopruebaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipopruebaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoPrueba);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoPrueba!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoPrueba);	
					}
					
					if(this.jInternalFrameImportacionTipoPrueba!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoPrueba);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoPrueba!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoPrueba);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoPrueba!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoPrueba);
				this.jInternalFrameDetalleFormTipoPrueba.setVisible(false);
				this.jInternalFrameDetalleFormTipoPrueba.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoPrueba!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoPrueba);
					this.jInternalFrameReporteDinamicoTipoPrueba.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoPrueba.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoPrueba!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoPrueba);
					this.jInternalFrameImportacionTipoPrueba.setVisible(false);
					this.jInternalFrameImportacionTipoPrueba.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoPrueba!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoPrueba);
					this.jInternalFrameOrderByTipoPrueba.setVisible(false);
					this.jInternalFrameOrderByTipoPrueba.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoPruebaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoPruebaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipopruebaReturnGeneral=new TipoPruebaParameterReturnGeneral();
			
			this.tipopruebaParameterGeneral=new TipoPruebaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipopruebaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoPruebaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoPruebaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipopruebaSessionBean.getEsGuardarRelacionado(),this.tipopruebaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoPruebaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipopruebaSessionBean.getEsGuardarRelacionado(),this.tipopruebaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoPrueba=false;
			this.isVisibilidadCeldaDuplicarTipoPrueba=true;
			this.isVisibilidadCeldaCopiarTipoPrueba=true;
			this.isVisibilidadCeldaVerFormTipoPrueba=true;
			this.isVisibilidadCeldaOrdenTipoPrueba=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrueba=false;
			this.isVisibilidadCeldaModificarTipoPrueba=false;
			this.isVisibilidadCeldaActualizarTipoPrueba=false;
			this.isVisibilidadCeldaEliminarTipoPrueba=false;
			this.isVisibilidadCeldaCancelarTipoPrueba=false;
			this.isVisibilidadCeldaGuardarTipoPrueba=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrueba=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoPrueba("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoPrueba();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoPrueba(false);
			
			this.setPermisosUsuarioTipoPrueba();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipopruebaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipopruebaSessionBean.getEsGuardarRelacionado() && this.tipopruebaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoPruebaClasesRelacionadas();
			}
			
			if(this.tipopruebaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoPruebaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoPruebaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoPrueba();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoPrueba();
			}
			
			if(!this.isPermisoBusquedaTipoPrueba) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipopruebaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoPrueba,this.isPermisoPaginacionMedioTipoPrueba,this.isPermisoPaginacionTodoTipoPrueba);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoPruebaConstantesFunciones.getTiposSeleccionarTipoPrueba());
				
				this.tiposColumnasSelect=TipoPruebaConstantesFunciones.getTiposSeleccionarTipoPrueba(true);
				
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
			//if(!this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoPrueba();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoPrueba(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoPrueba(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPrueba() ;
			
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
				tipopruebaImplementable= (TipoPruebaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoPruebaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipopruebaImplementableHome= (TipoPruebaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoPruebaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipopruebas= new ArrayList<TipoPrueba>();
			this.tipopruebasEliminados= new ArrayList<TipoPrueba>();
						
			this.isEsNuevoTipoPrueba=false;
			this.esParaAccionDesdeFormularioTipoPrueba=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoPrueba(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoPrueba();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoPruebaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoPruebaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoPrueba("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoPrueba(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoPrueba!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoPrueba();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoPrueba();
			}
			
			TipoPruebaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoPrueba(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoPrueba: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoPrueba() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoPrueba")) {
				iIndex=this.jInternalFrameDetalleFormTipoPrueba.jTabbedPaneRelacionesTipoPrueba.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoPrueba.jTabbedPaneRelacionesTipoPrueba.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoPrueba.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoPrueba();	
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
	
	public void cargarCombosForeignKeyTipoPrueba(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoPrueba(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoPrueba(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoPruebaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoPrueba();
		
		this.cargarCombosFrameForeignKeyTipoPrueba();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoPrueba();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoPrueba();
		}
	}
	
	
	
	public void jButtonNuevoTipoPruebaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipopruebaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoPrueba==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
			
			
			if(jTableDatosTipoPrueba.getRowCount()>=1) {
				jTableDatosTipoPrueba.removeRowSelectionInterval(0, jTableDatosTipoPrueba.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoPrueba=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoPrueba(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoPrueba(true);			
			//this.tipoprueba=new TipoPrueba();
			//this.tipoprueba.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPrueba(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPrueba() ;
			
			if(TipoPruebaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPrueba(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoprueba);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprueba);				
			
			TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
			
			if(this.tipopruebaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoPrueba: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoPruebaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoPrueba> tipopruebasSeleccionados=new ArrayList<TipoPrueba>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoPrueba.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoPrueba.getSelectedRows().length;			
			}
			
			tipopruebasSeleccionados=this.getTipoPruebasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoPrueba--;			
				//TipoPrueba tipopruebaAux= new TipoPrueba();			
				//tipopruebaAux.setId(this.iIdNuevoTipoPrueba);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoPrueba tipopruebaOrigen=new TipoPrueba();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoPrueba tipopruebaOrigen : tipopruebasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoPrueba.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipopruebaOrigen =(TipoPrueba) this.tipopruebaLogic.getTipoPruebas().toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipopruebaOrigen =(TipoPrueba) this.tipopruebas.toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoPrueba();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoprueba.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoPrueba(tipopruebaOrigen,this.tipoprueba,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrueba(this.tipoprueba);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipopruebaLogic.getTipoPruebas().add(this.tipopruebaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipopruebas.add(this.tipopruebaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoPrueba(false);
				
				this.jTableDatosTipoPrueba.setRowSelectionInterval(this.getIndiceNuevoTipoPrueba(), this.getIndiceNuevoTipoPrueba());
				
				int iLastRow =  this.jTableDatosTipoPrueba.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoPrueba.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoPrueba.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPrueba(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoPruebaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoPrueba> tipopruebasSeleccionados=new ArrayList<TipoPrueba>();									
		
			TipoPrueba tipopruebaOrigen=new TipoPrueba();
			TipoPrueba tipopruebaDestino=new TipoPrueba();
				
			tipopruebasSeleccionados=this.getTipoPruebasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoPrueba.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipopruebasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoPrueba.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopruebaOrigen =(TipoPrueba) this.tipopruebaLogic.getTipoPruebas().toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipopruebaOrigen =(TipoPrueba) this.tipopruebas.toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopruebaDestino =(TipoPrueba) this.tipopruebaLogic.getTipoPruebas().toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipopruebaDestino =(TipoPrueba) this.tipopruebas.toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipopruebaOrigen =tipopruebasSeleccionados.get(0);
				tipopruebaDestino =tipopruebasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoPrueba(tipopruebaOrigen,tipopruebaDestino,true,false);
				
				tipopruebaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipopruebaDestino,tipopruebaLogic.getTipoPruebas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipopruebaDestino,tipopruebas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoPrueba(false);
				
				//this.jTableDatosTipoPrueba.setRowSelectionInterval(this.getIndiceNuevoTipoPrueba(), this.getIndiceNuevoTipoPrueba());
				
				int iLastRow =  this.jTableDatosTipoPrueba.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoPrueba.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoPrueba.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPrueba(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoPruebaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoPrueba==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoPrueba.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoPruebaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoPrueba.isVisible();
			
			
			this.jPanelParametrosReportesTipoPrueba.setVisible(!isVisible);
			this.jPanelPaginacionTipoPrueba.setVisible(!isVisible);
			this.jPanelAccionesTipoPrueba.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoPruebaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoPrueba();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoPruebaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoPrueba();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoPruebaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoPrueba();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoPruebaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoPrueba();
			
			this.abrirFrameOrderByTipoPrueba();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoPruebaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoPrueba();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoPrueba(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoPrueba);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoPrueba.isMaximum()) {
					this.jInternalFrameDetalleFormTipoPrueba.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoPrueba.setSize(this.jInternalFrameDetalleFormTipoPrueba.iWidthFormulario,this.jInternalFrameDetalleFormTipoPrueba.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoPrueba.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoPrueba.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoPrueba.isMaximum()) {
						this.jInternalFrameDetalleFormTipoPrueba.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoPrueba.jContentPaneDetalleTipoPrueba.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoPrueba.jTabbedPaneRelacionesTipoPrueba.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoPrueba.jContentPaneDetalleTipoPrueba.getWidth(),TipoPruebaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoPrueba.jTabbedPaneRelacionesTipoPrueba.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoPrueba.jContentPaneDetalleTipoPrueba.getWidth(),TipoPruebaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoPrueba.jTabbedPaneRelacionesTipoPrueba.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoPrueba.jContentPaneDetalleTipoPrueba.getWidth(),TipoPruebaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoPrueba.setVisible(true);
	        this.jInternalFrameDetalleFormTipoPrueba.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoPrueba() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoPrueba==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoPrueba=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPrueba,false,this);
				} else {
					this.jInternalFrameOrderByTipoPrueba=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPrueba,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoPrueba);
				this.jInternalFrameOrderByTipoPrueba.setVisible(false);
				this.jInternalFrameOrderByTipoPrueba.setSelected(false);
				
				this.jInternalFrameOrderByTipoPrueba.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoPrueba"));
				
				this.inicializarActualizarBindingTablaOrderByTipoPrueba();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoPrueba() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoPrueba==null) {
				
				this.jInternalFrameImportacionTipoPrueba=new ImportacionJInternalFrame(TipoPruebaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoPrueba);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoPrueba);
				this.jInternalFrameImportacionTipoPrueba.setVisible(false);
				this.jInternalFrameImportacionTipoPrueba.setSelected(false);


				this.jInternalFrameImportacionTipoPrueba.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoPrueba"));
				this.jInternalFrameImportacionTipoPrueba.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoPrueba"));
				this.jInternalFrameImportacionTipoPrueba.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoPrueba"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoPrueba() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoPrueba==null) {
				this.jInternalFrameReporteDinamicoTipoPrueba=new ReporteDinamicoJInternalFrame(TipoPruebaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoPrueba);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoPrueba);
				this.jInternalFrameReporteDinamicoTipoPrueba.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoPrueba.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoPrueba.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPrueba"));
				this.jInternalFrameReporteDinamicoTipoPrueba.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPrueba"));
				this.jInternalFrameReporteDinamicoTipoPrueba.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPrueba"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPrueba();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoPrueba() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoPrueba);
			
	       	this.jInternalFrameDetalleFormTipoPrueba.setVisible(false);
	        this.jInternalFrameDetalleFormTipoPrueba.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoPrueba.dispose();
			//this.jInternalFrameDetalleFormTipoPrueba=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoPrueba() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoPrueba.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoPrueba.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoPrueba() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoPrueba.setVisible(true);
	        this.jInternalFrameImportacionTipoPrueba.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoPrueba() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoPrueba.setVisible(true);
	        this.jInternalFrameOrderByTipoPrueba.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoPrueba() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoPrueba.setVisible(false);
	        this.jInternalFrameOrderByTipoPrueba.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoPrueba() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoPrueba.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoPrueba.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoPrueba() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoPrueba.setVisible(false);
	        this.jInternalFrameImportacionTipoPrueba.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoPruebaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoPrueba(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoPrueba(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoPrueba.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoPrueba(true);
			//this.isEsNuevoTipoPrueba=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprueba =(TipoPrueba) this.tipopruebaLogic.getTipoPruebas().toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprueba =(TipoPrueba) this.tipopruebas.toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoPrueba("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPrueba(false) ;
			
			if(tipopruebaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoPruebaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPrueba(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPrueba(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoPruebaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoPrueba.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprueba =(TipoPrueba) this.tipopruebaLogic.getTipoPruebas().toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprueba =(TipoPrueba) this.tipopruebas.toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoPrueba(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoPrueba==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoPrueba.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoPrueba(true);
			//this.isEsNuevoTipoPrueba=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprueba =(TipoPrueba) this.tipopruebaLogic.getTipoPruebas().toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprueba =(TipoPrueba) this.tipopruebas.toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoprueba.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoPrueba("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoPrueba(false) ;
			
			if(TipoPruebaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPrueba(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPrueba(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoPruebaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoPrueba(false);
			
			//if(!this.isEsNuevoTipoPrueba) {								
				int intSelectedRow = this.jTableDatosTipoPrueba.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprueba =(TipoPrueba) this.tipopruebaLogic.getTipoPruebas().toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprueba =(TipoPrueba) this.tipopruebas.toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoPruebaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoPrueba(this.tipoprueba,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPrueba(this.tipoprueba);
				
			}
			
			if(this.permiteMantenimiento(this.tipoprueba)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoPrueba=true;
					this.inicializarActualizarBindingTablaTipoPrueba(false);
					this.isEsNuevoTipoPrueba=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoPrueba=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoPrueba=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoPrueba(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPrueba(false);
				
				this.habilitarDeshabilitarControlesTipoPrueba(false);
			
												
				
				if(TipoPruebaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoPrueba();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoPruebaActionPerformed(evt,tipopruebaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoPrueba(this.tipoprueba,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoPrueba.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipopruebaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoprueba.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoPrueba.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrueba.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoPruebaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoPrueba.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprueba =(TipoPrueba) this.tipopruebaLogic.getTipoPruebas().toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
				this.tipoprueba.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprueba =(TipoPrueba) this.tipopruebas.toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
				this.tipoprueba.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoprueba)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoPruebaModel) this.jTableDatosTipoPrueba.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoPrueba=true;
				this.inicializarActualizarBindingTablaTipoPrueba(false);
				this.isEsNuevoTipoPrueba=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoPrueba(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPrueba(false);
				
				this.habilitarDeshabilitarControlesTipoPrueba(false);
				
				
				
				if(TipoPruebaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoPrueba();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoPruebaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoPrueba.getRowCount()>=1) {
				jTableDatosTipoPrueba.removeRowSelectionInterval(0, jTableDatosTipoPrueba.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoPrueba(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoPrueba(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPrueba(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPrueba(false) ;
			
			this.isEsNuevoTipoPrueba=false;
			
			if(TipoPruebaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoPrueba();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoPruebaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoPrueba(false);
				
				//SI ES MANUAL
				if(TipoPruebaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoPrueba();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoPruebaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoPrueba--;			
			//TipoPrueba tipopruebaAux= new TipoPrueba();			
			//tipopruebaAux.setId(this.iIdNuevoTipoPrueba);
			
			if(this.jInternalFrameDetalleFormTipoPrueba==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoPrueba();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoPrueba(this.tipoprueba);
			
			this.tipoprueba.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipopruebaLogic.getTipoPruebas().add(this.tipopruebaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipopruebas.add(this.tipopruebaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoPrueba(false);
			
			this.jTableDatosTipoPrueba.setRowSelectionInterval(this.getIndiceNuevoTipoPrueba(), this.getIndiceNuevoTipoPrueba());
			
			int iLastRow =  this.jTableDatosTipoPrueba.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoPrueba.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoPrueba.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoPrueba(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoPruebaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoPrueba(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPrueba(false);
			
			//SI ES MANUAL
			if(TipoPruebaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPrueba();
			}
			
			//this.abrirFrameTreeTipoPrueba();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoPruebaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo PruebaS ?", "MANTENIMIENTO DE Tipo Prueba", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoPrueba.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoPrueba();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipopruebaReturnGeneral=tipopruebaLogic.procesarImportacionTipoPruebasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipopruebaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoPruebaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoPruebaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoPrueba.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoPrueba.setFileImportacion(this.jInternalFrameImportacionTipoPrueba.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoPrueba.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoPrueba.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoPrueba.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoPrueba.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoPruebaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoPrueba> tipopruebasSeleccionados=new ArrayList<TipoPrueba>();		

		tipopruebasSeleccionados=this.getTipoPruebasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPrueba.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPrueba.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoPruebaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoPruebaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoPruebas("Todos",tipopruebasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopruebaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prueba",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPrueba.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPrueba.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoPruebaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoPruebaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoPrueba.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoPrueba.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoPrueba.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoPruebaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoPruebaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoPrueba.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoPruebaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoPruebaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoPrueba.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPrueba.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoPruebaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoPruebaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoPruebaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoPrueba> tipopruebasSeleccionados=new ArrayList<TipoPrueba>();		
		
		tipopruebasSeleccionados=this.getTipoPruebasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprueba";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoPruebas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoPrueba.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPrueba.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoPruebaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPruebaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoPrueba tipoprueba:tipopruebasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprueba.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoPruebaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPruebaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoPrueba tipoprueba:tipopruebasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprueba.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoPrueba(row);				
			//	iRow++;
			//}				
			
			//for(TipoPrueba tipopruebaAux:tipopruebasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoPrueba(tipopruebaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopruebaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prueba",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipopruebaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPrueba(false);
			
			//SI ES MANUAL
			if(TipoPruebaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPrueba();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoPruebaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPrueba(false);
			
			//SI ES MANUAL
			if(TipoPruebaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoPrueba();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoPruebaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPrueba(false);
			
			//SI ES MANUAL
			if(TipoPruebaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoPrueba();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopruebaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoPrueba() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoPrueba.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoPrueba.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoPrueba.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoPrueba.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoPrueba.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoPrueba.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoPrueba.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoPrueba(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoPrueba(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoPrueba(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoPrueba(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoPrueba(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoPrueba(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPrueba(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoPrueba(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoPruebaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoPruebaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoPrueba() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoPrueba();
		
		this.inicializarActualizarBindingBotonesManualTipoPrueba(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoPrueba();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPrueba() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPrueba(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPrueba(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoPrueba.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoPrueba.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoPrueba.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoPrueba!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoPrueba.jCheckBoxPostAccionNuevoTipoPrueba.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoPrueba.jCheckBoxPostAccionSinCerrarTipoPrueba.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoPrueba.jCheckBoxPostAccionSinMensajeTipoPrueba.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoPrueba.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoPrueba.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoPrueba.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoPrueba!=null) {
				this.jInternalFrameDetalleFormTipoPrueba.jCheckBoxPostAccionNuevoTipoPrueba.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoPrueba.jCheckBoxPostAccionSinCerrarTipoPrueba.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoPrueba.jCheckBoxPostAccionSinMensajeTipoPrueba.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoPrueba.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoPrueba.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoPrueba!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoPrueba.jComboBoxTiposAccionesFormularioTipoPrueba.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoPrueba.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoPrueba!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPrueba.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoPrueba.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoPrueba.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoPrueba.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoPrueba.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoPrueba!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPrueba.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoPrueba.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoPrueba.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoPrueba(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoPruebaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPrueba(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoPrueba() throws Exception {
		try	{
			if(TipoPruebaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoPrueba();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoPrueba() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoPrueba.jComboBoxTiposAccionesFormularioTipoPrueba.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoPrueba.jComboBoxTiposAccionesFormularioTipoPrueba.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoPrueba() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoPrueba.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoPrueba.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoPrueba.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoPrueba.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoPrueba.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoPrueba.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoPrueba.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoPrueba.addItem(reporte);
			}
			
			
			if(!this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoPrueba.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoPrueba.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoPrueba.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoPrueba.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoPrueba.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoPrueba.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoPrueba!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoPrueba.jComboBoxTiposAccionesFormularioTipoPrueba.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoPrueba.jComboBoxTiposAccionesFormularioTipoPrueba.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoPrueba.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoPrueba.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoPrueba.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPrueba();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPrueba() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoPrueba!=null) {
				this.jInternalFrameReporteDinamicoTipoPrueba.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoPrueba.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoPrueba!=null) {
				this.jInternalFrameReporteDinamicoTipoPrueba.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoPrueba.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoPrueba!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoPrueba.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoPrueba.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoPrueba.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoPrueba.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoPrueba.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoPrueba.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoPrueba()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoPrueba(Boolean esInicializar) throws Exception {				
		if(TipoPruebaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoPrueba();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoPrueba() throws Exception {
		this.inicializarActualizarBindingTablaTipoPrueba(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoPrueba() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoPrueba.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoPrueba.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPrueba.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoPruebaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoPrueba.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPrueba.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoPruebaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoPruebaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPruebaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoPruebaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoPrueba.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPrueba.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoPruebaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoPrueba.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoPrueba(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipopruebaLogic.getTipoPruebas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipopruebas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoPruebaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoPrueba.setModel(new TipoPruebaModel(this.tipopruebaLogic.getTipoPruebas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoPrueba.setModel(new TipoPruebaModel(this.tipopruebas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoPrueba!=null && this.jInternalFrameOrderByTipoPrueba.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoPrueba();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoPrueba.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrueba,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoPruebaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO,tipopruebaConstantesFunciones.resaltarSeleccionarTipoPrueba,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO,tipopruebaConstantesFunciones.resaltarSeleccionarTipoPrueba,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoPrueba.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrueba,TipoPruebaConstantesFunciones.LABEL_ID));

		if(this.tipopruebaConstantesFunciones.mostraridTipoPrueba && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPruebaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipopruebaConstantesFunciones.resaltaridTipoPrueba,this.tipopruebaConstantesFunciones.activaridTipoPrueba,this,true,"idTipoPrueba","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipopruebaConstantesFunciones.resaltaridTipoPrueba,this.tipopruebaConstantesFunciones.activaridTipoPrueba,this,true,"idTipoPrueba","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPrueba.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrueba,TipoPruebaConstantesFunciones.LABEL_CODIGO));

		if(this.tipopruebaConstantesFunciones.mostrarcodigoTipoPrueba && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPruebaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipopruebaConstantesFunciones.resaltarcodigoTipoPrueba,this.tipopruebaConstantesFunciones.activarcodigoTipoPrueba,this,true,"codigoTipoPrueba","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipopruebaConstantesFunciones.resaltarcodigoTipoPrueba,this.tipopruebaConstantesFunciones.activarcodigoTipoPrueba,this,true,"codigoTipoPrueba","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPruebaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPrueba.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrueba,TipoPruebaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipopruebaConstantesFunciones.mostrarnombreTipoPrueba && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPruebaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipopruebaConstantesFunciones.resaltarnombreTipoPrueba,this.tipopruebaConstantesFunciones.activarnombreTipoPrueba,this,true,"nombreTipoPrueba","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipopruebaConstantesFunciones.resaltarnombreTipoPrueba,this.tipopruebaConstantesFunciones.activarnombreTipoPrueba,this,true,"nombreTipoPrueba","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPruebaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipopruebaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipopruebaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipopruebaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoPrueba.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipopruebaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipopruebaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoPrueba.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoPrueba && this.isPermisoGuardarCambiosTipoPrueba) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipopruebaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipopruebaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoPrueba.addColumn(tableColumn);
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
			
			this.jTableDatosTipoPrueba.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoPrueba && this.isPermisoGuardarCambiosTipoPrueba) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoPrueba && this.isPermisoGuardarCambiosTipoPrueba) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoPrueba.moveColumn(this.jTableDatosTipoPrueba.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoPrueba.moveColumn(this.jTableDatosTipoPrueba.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoPrueba.moveColumn(this.jTableDatosTipoPrueba.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoPrueba.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoPrueba.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoPrueba,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoPruebaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoPrueba.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoPrueba.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoPruebaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoPruebaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoPrueba.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoPrueba.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoPrueba.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipopruebaLogic.getTipoPruebas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipopruebas.size()-1;
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
		//this.jTableDatosTipoPrueba.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoPrueba.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoPrueba();
			
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
				
				//this.isEsNuevoTipoPrueba=false;
					
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
			
				if(this.tipopruebaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoPrueba==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoPrueba.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoPrueba.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprueba =(TipoPrueba) this.tipopruebaLogic.getTipoPruebas().toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprueba =(TipoPrueba) this.tipopruebas.toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoprueba.getsType().equals("DUPLICADO")
				   || this.tipoprueba.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoPrueba=true;
				
				} else {
					this.isEsNuevoTipoPrueba=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoprueba.getId()>=0 && !this.tipoprueba.getIsNew()) {						
						this.isEsNuevoTipoPrueba=false;
						
					} else {
						this.isEsNuevoTipoPrueba=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoPrueba(esRelaciones);						
				
				this.seleccionarTipoPrueba(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoprueba.getId()<0) {
					this.isEsNuevoTipoPrueba=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoPrueba(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoPrueba(evt,rowIndex);
				}	
				
				if(this.tipopruebaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoPrueba: " + this.dDif); 
					}
				}								
				
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoPrueba(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoprueba)) {
					if(this.tipoprueba.getId()>0) {
						this.tipoprueba.setIsDeleted(true);
						
						this.tipopruebasEliminados.add(this.tipoprueba);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipopruebaLogic.getTipoPruebas().remove(this.tipoprueba);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipopruebas.remove(this.tipoprueba);				
					}
					
					
					((TipoPruebaModel) this.jTableDatosTipoPrueba.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPrueba(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoPrueba(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoPrueba) {
			
			if(this.jInternalFrameDetalleFormTipoPrueba==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoPrueba.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoPrueba.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprueba =(TipoPrueba) this.tipopruebaLogic.getTipoPruebas().toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprueba =(TipoPrueba) this.tipopruebas.toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoPruebaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoPrueba(this.tipoprueba);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoPrueba("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoPrueba(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPrueba() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoPrueba(TipoPrueba tipoprueba) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoPrueba(tipoprueba,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoPrueba(TipoPrueba tipoprueba,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoPrueba(tipoprueba);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoPrueba(tipoprueba,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoPrueba(tipoprueba);
	}
	
	public void setVariablesObjetoActualToFormularioTipoPrueba(TipoPrueba tipoprueba) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoPrueba==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoPrueba.jTextFieldidTipoPrueba.setText(tipoprueba.getId().toString());
			this.jInternalFrameDetalleFormTipoPrueba.jTextFieldcodigoTipoPrueba.setText(tipoprueba.getcodigo());
			this.jInternalFrameDetalleFormTipoPrueba.jTextAreanombreTipoPrueba.setText(tipoprueba.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoPrueba tipopruebaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipopruebaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoPrueba tipopruebaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipopruebaLocal=this.tipoprueba;
			} else {
				tipopruebaLocal=this.tipopruebaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipopruebaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoPrueba(tipopruebaLocal,true);
					
					if(tipopruebaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipopruebaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipopruebaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoPrueba(TipoPrueba tipoprueba,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoPrueba(tipoprueba,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoPrueba(tipoprueba);
	}
	
	public void setVariablesFormularioToObjetoActualTipoPrueba(TipoPrueba tipoprueba,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoPrueba(tipoprueba,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoPrueba(TipoPrueba tipoprueba,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoPrueba==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoPrueba.jTextFieldidTipoPrueba.getText()==null || this.jInternalFrameDetalleFormTipoPrueba.jTextFieldidTipoPrueba.getText()=="" || this.jInternalFrameDetalleFormTipoPrueba.jTextFieldidTipoPrueba.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoPrueba.jTextFieldidTipoPrueba.setText("0");
			}

			if(conColumnasBase) {tipoprueba.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoPrueba.jTextFieldidTipoPrueba.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPruebaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrueba.jLabelIdTipoPrueba,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoprueba.setcodigo(this.jInternalFrameDetalleFormTipoPrueba.jTextFieldcodigoTipoPrueba.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPruebaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrueba.jLabelcodigoTipoPrueba,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoprueba.setnombre(this.jInternalFrameDetalleFormTipoPrueba.jTextAreanombreTipoPrueba.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPruebaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrueba.jLabelnombreTipoPrueba,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoPrueba(TipoPrueba tipopruebaBean,TipoPrueba tipoprueba,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoPrueba(TipoPrueba tipopruebaOrigen,TipoPrueba tipoprueba,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipopruebaOrigen.getId()!=null && !tipopruebaOrigen.getId().equals(0L))) {tipoprueba.setId(tipopruebaOrigen.getId());}}
			if(conDefault || (!conDefault && tipopruebaOrigen.getcodigo()!=null && !tipopruebaOrigen.getcodigo().equals(""))) {tipoprueba.setcodigo(tipopruebaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipopruebaOrigen.getnombre()!=null && !tipopruebaOrigen.getnombre().equals(""))) {tipoprueba.setnombre(tipopruebaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoPrueba(TipoPrueba tipoprueba) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoPrueba.jTextFieldidTipoPrueba.setText(tipoprueba.getId().toString());
			this.jInternalFrameDetalleFormTipoPrueba.jTextFieldcodigoTipoPrueba.setText(tipoprueba.getcodigo());
			this.jInternalFrameDetalleFormTipoPrueba.jTextAreanombreTipoPrueba.setText(tipoprueba.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoPrueba(TipoPruebaBean tipopruebaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoPrueba.jTextFieldidTipoPrueba.setText(tipopruebaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoPrueba.jTextFieldcodigoTipoPrueba.setText(tipopruebaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoPrueba.jTextAreanombreTipoPrueba.setText(tipopruebaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoPrueba(TipoPruebaParameterReturnGeneral tipopruebaReturnGeneral,TipoPruebaBean tipopruebaBean,Boolean conDefault) throws Exception { 
		try {
			TipoPrueba tipopruebaLocal=new TipoPrueba();
			
			tipopruebaLocal=tipopruebaReturnGeneral.getTipoPrueba();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipopruebaLocal.getId()!=null && !tipopruebaLocal.getId().equals(0L))) {tipopruebaBean.setId(tipopruebaLocal.getId());}}
			if(conDefault || (!conDefault && tipopruebaLocal.getcodigo()!=null && !tipopruebaLocal.getcodigo().equals(""))) {tipopruebaBean.setcodigo(tipopruebaLocal.getcodigo());}
			if(conDefault || (!conDefault && tipopruebaLocal.getnombre()!=null && !tipopruebaLocal.getnombre().equals(""))) {tipopruebaBean.setnombre(tipopruebaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoPruebaGenerico(Long idTipoPruebaSeleccionado,JComboBox jComboBoxTipoPrueba,List<TipoPrueba> tipopruebasLocal)throws Exception {
		try {
			TipoPrueba  tipopruebaTemp=null;

			for(TipoPrueba tipopruebaAux:tipopruebasLocal) {
				if(tipopruebaAux.getId()!=null && tipopruebaAux.getId().equals(idTipoPruebaSeleccionado)) {
					tipopruebaTemp=tipopruebaAux;
					break;
				}
			}

			jComboBoxTipoPrueba.setSelectedItem(tipopruebaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoPruebaGenerico(JComboBox jComboBoxTipoPrueba,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoPrueba.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoPrueba.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoPrueba.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoPrueba.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoPrueba.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoPrueba.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoPrueba.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoPrueba.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoPrueba.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoPrueba.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprueba=(TipoPrueba) tipopruebaLogic.getTipoPruebas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoprueba =(TipoPrueba) tipopruebas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoPrueba tipopruebaRow=new TipoPrueba();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipopruebaRow=(TipoPrueba) tipopruebaLogic.getTipoPruebas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipopruebaRow=(TipoPrueba) tipopruebas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoPrueba(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoPrueba.setVisible((this.isVisibilidadCeldaNuevoTipoPrueba && this.isPermisoNuevoTipoPrueba));			
			this.jButtonDuplicarTipoPrueba.setVisible((this.isVisibilidadCeldaDuplicarTipoPrueba && this.isPermisoDuplicarTipoPrueba));			
			this.jButtonCopiarTipoPrueba.setVisible((this.isVisibilidadCeldaCopiarTipoPrueba && this.isPermisoCopiarTipoPrueba));
			this.jButtonVerFormTipoPrueba.setVisible((this.isVisibilidadCeldaVerFormTipoPrueba && this.isPermisoVerFormTipoPrueba));
			
			this.jButtonAbrirOrderByTipoPrueba.setVisible((this.isVisibilidadCeldaOrdenTipoPrueba && this.isPermisoOrdenTipoPrueba));			
			
			this.jButtonNuevoRelacionesTipoPrueba.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPrueba && this.isPermisoNuevoTipoPrueba));			
			this.jButtonNuevoGuardarCambiosTipoPrueba.setVisible((this.isVisibilidadCeldaNuevoTipoPrueba && this.isPermisoNuevoTipoPrueba && this.isPermisoGuardarCambiosTipoPrueba));
			
			if(this.jInternalFrameDetalleFormTipoPrueba!=null) {
			this.jInternalFrameDetalleFormTipoPrueba.jButtonModificarTipoPrueba.setVisible((this.isVisibilidadCeldaModificarTipoPrueba && this.isPermisoActualizarTipoPrueba));	
			this.jInternalFrameDetalleFormTipoPrueba.jButtonActualizarTipoPrueba.setVisible((this.isVisibilidadCeldaActualizarTipoPrueba && this.isPermisoActualizarTipoPrueba));	
			this.jInternalFrameDetalleFormTipoPrueba.jButtonEliminarTipoPrueba.setVisible((this.isVisibilidadCeldaEliminarTipoPrueba && this.isPermisoEliminarTipoPrueba));
			this.jInternalFrameDetalleFormTipoPrueba.jButtonCancelarTipoPrueba.setVisible(this.isVisibilidadCeldaCancelarTipoPrueba);							
			this.jInternalFrameDetalleFormTipoPrueba.jButtonGuardarCambiosTipoPrueba.setVisible((this.isVisibilidadCeldaGuardarTipoPrueba && this.isPermisoGuardarCambiosTipoPrueba));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoPrueba.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPrueba && this.isPermisoGuardarCambiosTipoPrueba));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoPrueba.setVisible((this.isVisibilidadCeldaNuevoTipoPrueba && this.isPermisoNuevoTipoPrueba));						
			this.jButtonDuplicarToolBarTipoPrueba.setVisible((this.isVisibilidadCeldaDuplicarTipoPrueba && this.isPermisoDuplicarTipoPrueba));						
			this.jButtonCopiarToolBarTipoPrueba.setVisible((this.isVisibilidadCeldaCopiarTipoPrueba && this.isPermisoCopiarTipoPrueba));			
			this.jButtonVerFormToolBarTipoPrueba.setVisible((this.isVisibilidadCeldaVerFormTipoPrueba && this.isPermisoVerFormTipoPrueba));			
			this.jButtonAbrirOrderByToolBarTipoPrueba.setVisible((this.isVisibilidadCeldaOrdenTipoPrueba && this.isPermisoOrdenTipoPrueba));
			this.jButtonNuevoRelacionesToolBarTipoPrueba.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPrueba && this.isPermisoNuevoTipoPrueba));			
			this.jButtonNuevoGuardarCambiosToolBarTipoPrueba.setVisible((this.isVisibilidadCeldaNuevoTipoPrueba && this.isPermisoNuevoTipoPrueba && this.isPermisoGuardarCambiosTipoPrueba));			
			
			if(this.jInternalFrameDetalleFormTipoPrueba!=null) {
			this.jInternalFrameDetalleFormTipoPrueba.jButtonModificarToolBarTipoPrueba.setVisible((this.isVisibilidadCeldaModificarTipoPrueba && this.isPermisoActualizarTipoPrueba));	
			this.jInternalFrameDetalleFormTipoPrueba.jButtonActualizarToolBarTipoPrueba.setVisible((this.isVisibilidadCeldaActualizarTipoPrueba  && this.isPermisoActualizarTipoPrueba));	
			this.jInternalFrameDetalleFormTipoPrueba.jButtonEliminarToolBarTipoPrueba.setVisible((this.isVisibilidadCeldaEliminarTipoPrueba && this.isPermisoEliminarTipoPrueba));
			this.jInternalFrameDetalleFormTipoPrueba.jButtonCancelarToolBarTipoPrueba.setVisible(this.isVisibilidadCeldaCancelarTipoPrueba);				
			this.jInternalFrameDetalleFormTipoPrueba.jButtonGuardarCambiosToolBarTipoPrueba.setVisible((this.isVisibilidadCeldaGuardarTipoPrueba && this.isPermisoGuardarCambiosTipoPrueba));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoPrueba.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPrueba && this.isPermisoGuardarCambiosTipoPrueba));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoPrueba.setVisible((this.isVisibilidadCeldaNuevoTipoPrueba && this.isPermisoNuevoTipoPrueba));			
			this.jMenuItemDuplicarTipoPrueba.setVisible((this.isVisibilidadCeldaDuplicarTipoPrueba && this.isPermisoDuplicarTipoPrueba));			
			this.jMenuItemCopiarTipoPrueba.setVisible((this.isVisibilidadCeldaCopiarTipoPrueba && this.isPermisoCopiarTipoPrueba));			
			this.jMenuItemVerFormTipoPrueba.setVisible((this.isVisibilidadCeldaVerFormTipoPrueba && this.isPermisoVerFormTipoPrueba));			
			this.jMenuItemAbrirOrderByTipoPrueba.setVisible((this.isVisibilidadCeldaOrdenTipoPrueba && this.isPermisoOrdenTipoPrueba));			
			//this.jMenuItemMostrarOcultarTipoPrueba.setVisible((this.isVisibilidadCeldaOrdenTipoPrueba && this.isPermisoOrdenTipoPrueba));
			this.jMenuItemDetalleAbrirOrderByTipoPrueba.setVisible((this.isVisibilidadCeldaOrdenTipoPrueba && this.isPermisoOrdenTipoPrueba));			
			//this.jMenuItemDetalleMostrarOcultarTipoPrueba.setVisible((this.isVisibilidadCeldaOrdenTipoPrueba && this.isPermisoOrdenTipoPrueba));			
			this.jMenuItemNuevoRelacionesTipoPrueba.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPrueba && this.isPermisoNuevoTipoPrueba));			
			this.jMenuItemNuevoGuardarCambiosTipoPrueba.setVisible((this.isVisibilidadCeldaNuevoTipoPrueba && this.isPermisoNuevoTipoPrueba && this.isPermisoGuardarCambiosTipoPrueba));									
			
			if(this.jInternalFrameDetalleFormTipoPrueba!=null) {
			this.jInternalFrameDetalleFormTipoPrueba.jMenuItemModificarTipoPrueba.setVisible((this.isVisibilidadCeldaModificarTipoPrueba && this.isPermisoActualizarTipoPrueba));	
			this.jInternalFrameDetalleFormTipoPrueba.jMenuItemActualizarTipoPrueba.setVisible((this.isVisibilidadCeldaActualizarTipoPrueba && this.isPermisoActualizarTipoPrueba));	
			this.jInternalFrameDetalleFormTipoPrueba.jMenuItemEliminarTipoPrueba.setVisible((this.isVisibilidadCeldaEliminarTipoPrueba && this.isPermisoEliminarTipoPrueba));
			this.jInternalFrameDetalleFormTipoPrueba.jMenuItemCancelarTipoPrueba.setVisible(this.isVisibilidadCeldaCancelarTipoPrueba);				
			}
			
			this.jMenuItemGuardarCambiosTipoPrueba.setVisible((this.isVisibilidadCeldaGuardarTipoPrueba && this.isPermisoGuardarCambiosTipoPrueba));						
			this.jMenuItemGuardarCambiosTablaTipoPrueba.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPrueba && this.isPermisoGuardarCambiosTipoPrueba));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoPrueba=this.jButtonNuevoTipoPrueba.isVisible();
			this.isVisibilidadCeldaDuplicarTipoPrueba=this.jButtonDuplicarTipoPrueba.isVisible();
			this.isVisibilidadCeldaCopiarTipoPrueba=this.jButtonCopiarTipoPrueba.isVisible();
			this.isVisibilidadCeldaVerFormTipoPrueba=this.jButtonVerFormTipoPrueba.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoPrueba=this.jButtonAbrirOrderByTipoPrueba.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoPrueba=this.jButtonNuevoRelacionesTipoPrueba.isVisible();
			this.isVisibilidadCeldaModificarTipoPrueba=this.jButtonModificarTipoPrueba.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPrueba!=null) {
			this.isVisibilidadCeldaActualizarTipoPrueba=this.jInternalFrameDetalleFormTipoPrueba.jButtonActualizarTipoPrueba.isVisible();
			this.isVisibilidadCeldaEliminarTipoPrueba=this.jInternalFrameDetalleFormTipoPrueba.jButtonEliminarTipoPrueba.isVisible();
			this.isVisibilidadCeldaCancelarTipoPrueba=this.jInternalFrameDetalleFormTipoPrueba.jButtonCancelarTipoPrueba.isVisible();
			this.isVisibilidadCeldaGuardarTipoPrueba=this.jInternalFrameDetalleFormTipoPrueba.jButtonGuardarCambiosTipoPrueba.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoPrueba=this.jButtonGuardarCambiosTablaTipoPrueba.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoPrueba=this.jButtonNuevoToolBarTipoPrueba.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoPrueba=this.jButtonNuevoRelacionesToolBarTipoPrueba.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPrueba!=null) {
			this.isVisibilidadCeldaModificarTipoPrueba=this.jInternalFrameDetalleFormTipoPrueba.jButtonModificarToolBarTipoPrueba.isVisible();
			this.isVisibilidadCeldaActualizarTipoPrueba=this.jInternalFrameDetalleFormTipoPrueba.jButtonActualizarToolBarTipoPrueba.isVisible();
			this.isVisibilidadCeldaEliminarTipoPrueba=this.jInternalFrameDetalleFormTipoPrueba.jButtonEliminarToolBarTipoPrueba.isVisible();
			this.isVisibilidadCeldaCancelarTipoPrueba=this.jInternalFrameDetalleFormTipoPrueba.jButtonCancelarToolBarTipoPrueba.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoPrueba=this.jButtonGuardarCambiosToolBarTipoPrueba.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoPrueba=this.jButtonGuardarCambiosTablaToolBarTipoPrueba.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoPrueba=this.jMenuItemNuevoTipoPrueba.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoPrueba=this.jMenuItemNuevoRelacionesTipoPrueba.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPrueba!=null) {
			this.isVisibilidadCeldaModificarTipoPrueba=this.jInternalFrameDetalleFormTipoPrueba.jMenuItemModificarTipoPrueba.isVisible();
			this.isVisibilidadCeldaActualizarTipoPrueba=this.jInternalFrameDetalleFormTipoPrueba.jMenuItemActualizarTipoPrueba.isVisible();
			this.isVisibilidadCeldaEliminarTipoPrueba=this.jInternalFrameDetalleFormTipoPrueba.jMenuItemEliminarTipoPrueba.isVisible();
			this.isVisibilidadCeldaCancelarTipoPrueba=this.jInternalFrameDetalleFormTipoPrueba.jMenuItemCancelarTipoPrueba.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoPrueba=this.jMenuItemGuardarCambiosTipoPrueba.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoPrueba=this.jMenuItemGuardarCambiosTablaTipoPrueba.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoPrueba(Boolean esInicializar) {
		if(TipoPruebaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipopruebaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoPrueba();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoPrueba(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoPrueba() {
		this.jButtonNuevoTipoPrueba.setVisible(this.isPermisoNuevoTipoPrueba);			
		this.jButtonDuplicarTipoPrueba.setVisible(this.isPermisoDuplicarTipoPrueba);			
		this.jButtonCopiarTipoPrueba.setVisible(this.isPermisoCopiarTipoPrueba);			
		this.jButtonVerFormTipoPrueba.setVisible(this.isPermisoVerFormTipoPrueba);			
		
		this.jButtonAbrirOrderByTipoPrueba.setVisible(this.isPermisoOrdenTipoPrueba);					
		
		this.jButtonNuevoRelacionesTipoPrueba.setVisible(this.isPermisoNuevoTipoPrueba);			
		
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrueba.jButtonModificarTipoPrueba.setVisible(this.isPermisoActualizarTipoPrueba);	
			this.jInternalFrameDetalleFormTipoPrueba.jButtonActualizarTipoPrueba.setVisible(this.isPermisoActualizarTipoPrueba);	
			this.jInternalFrameDetalleFormTipoPrueba.jButtonEliminarTipoPrueba.setVisible(this.isPermisoEliminarTipoPrueba);
			this.jInternalFrameDetalleFormTipoPrueba.jButtonCancelarTipoPrueba.setVisible(this.isVisibilidadCeldaCancelarTipoPrueba);						
			this.jInternalFrameDetalleFormTipoPrueba.jButtonGuardarCambiosTipoPrueba.setVisible(this.isPermisoGuardarCambiosTipoPrueba);							
		}
		
		this.jButtonGuardarCambiosTablaTipoPrueba.setVisible(this.isPermisoActualizarTipoPrueba);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoPrueba() {
		this.jInternalFrameDetalleFormTipoPrueba.jButtonModificarTipoPrueba.setVisible(this.isPermisoActualizarTipoPrueba);	
		this.jInternalFrameDetalleFormTipoPrueba.jButtonActualizarTipoPrueba.setVisible(this.isPermisoActualizarTipoPrueba);	
		this.jInternalFrameDetalleFormTipoPrueba.jButtonEliminarTipoPrueba.setVisible(this.isPermisoEliminarTipoPrueba);
		this.jInternalFrameDetalleFormTipoPrueba.jButtonCancelarTipoPrueba.setVisible(this.isVisibilidadCeldaCancelarTipoPrueba);							
		this.jInternalFrameDetalleFormTipoPrueba.jButtonGuardarCambiosTipoPrueba.setVisible((this.isVisibilidadCeldaGuardarTipoPrueba && this.isPermisoGuardarCambiosTipoPrueba));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoPrueba() {
		if(TipoPruebaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoPrueba();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoPrueba() {
	}
	
	public void jTableDatosTipoPruebaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoPrueba(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoPruebaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopruebaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPrueba.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPrueba(this.gettipoprueba(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrueba(this.tipoprueba);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprueba =(TipoPrueba) this.tipopruebaLogic.getTipoPruebas().toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprueba =(TipoPrueba) this.tipopruebas.toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprueba==null) {
						this.tipoprueba = new TipoPrueba();
					}

					this.setVariablesFormularioToObjetoActualTipoPrueba(this.tipoprueba,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrueba(this.tipoprueba);
				}

				if(this.tipoprueba.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoprueba.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPrueba(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopruebaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopruebaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopruebaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoPruebaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopruebaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPrueba.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPrueba(this.gettipoprueba(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrueba(this.tipoprueba);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprueba =(TipoPrueba) this.tipopruebaLogic.getTipoPruebas().toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprueba =(TipoPrueba) this.tipopruebas.toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprueba==null) {
						this.tipoprueba = new TipoPrueba();
					}

					this.setVariablesFormularioToObjetoActualTipoPrueba(this.tipoprueba,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrueba(this.tipoprueba);
				}

				if(this.tipoprueba.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoprueba.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPrueba(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopruebaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopruebaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopruebaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoPruebaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopruebaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPrueba.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPrueba(this.gettipoprueba(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrueba(this.tipoprueba);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprueba =(TipoPrueba) this.tipopruebaLogic.getTipoPruebas().toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprueba =(TipoPrueba) this.tipopruebas.toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprueba==null) {
						this.tipoprueba = new TipoPrueba();
					}

					this.setVariablesFormularioToObjetoActualTipoPrueba(this.tipoprueba,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrueba(this.tipoprueba);
				}

				if(this.tipoprueba.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoprueba.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPrueba(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopruebaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopruebaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopruebaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoPrueba() {
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) {
			this.jInternalFrameDetalleFormTipoPrueba.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoPrueba.dispose();
			this.jInternalFrameDetalleFormTipoPrueba=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoPrueba!=null) {
			this.jInternalFrameReporteDinamicoTipoPrueba.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoPrueba.dispose();
			this.jInternalFrameReporteDinamicoTipoPrueba=null;
		}
		
		if(this.jInternalFrameImportacionTipoPrueba!=null) {
			this.jInternalFrameImportacionTipoPrueba.setVisible(false);	    			
			this.jInternalFrameImportacionTipoPrueba.dispose();
			this.jInternalFrameImportacionTipoPrueba=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoPrueba();
			
			TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoPrueba")) {
				jButtonNuevoTipoPruebaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoPrueba")) {
				jButtonDuplicarTipoPruebaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoPrueba")) {
				jButtonCopiarTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoPrueba")) {
				jButtonVerFormTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoPrueba")) {
				jButtonNuevoTipoPruebaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoPrueba")) {
				jButtonDuplicarTipoPruebaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoPrueba")) {
				jButtonNuevoTipoPruebaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoPrueba")) {
				jButtonDuplicarTipoPruebaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoPrueba")) {
				jButtonNuevoTipoPruebaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoPrueba")) {
				jButtonNuevoTipoPruebaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoPrueba")) {
				jButtonNuevoTipoPruebaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoPrueba")) {
				jButtonModificarTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoPrueba")) {
				jButtonModificarTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoPrueba")) {
				jButtonModificarTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoPrueba")) {
				jButtonActualizarTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoPrueba")) {
				jButtonActualizarTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoPrueba")) {
				jButtonActualizarTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoPrueba")) {
				jButtonEliminarTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoPrueba")) {
				jButtonEliminarTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoPrueba")) {
				jButtonEliminarTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoPrueba")) {
				jButtonCancelarTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoPrueba")) {
				jButtonCancelarTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoPrueba")) {
				jButtonCancelarTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoPrueba")) {
				jButtonCerrarTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoPrueba")) {
				jButtonCerrarTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoPrueba")) {
				jButtonCerrarTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoPrueba")) {
				jButtonMostrarOcultarTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoPrueba")) {
				jButtonCancelarTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoPrueba")) {
				jButtonGuardarCambiosTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoPrueba")) {
				jButtonGuardarCambiosTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoPrueba")) {
				jButtonCopiarTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoPrueba")) {
				jButtonVerFormTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoPrueba")) {
				jButtonGuardarCambiosTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoPrueba")) {
				jButtonCopiarTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoPrueba")) {
				jButtonVerFormTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoPrueba")) {
				jButtonGuardarCambiosTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoPrueba")) {
				jButtonGuardarCambiosTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoPrueba")) {
				jButtonGuardarCambiosTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoPrueba")) {
				jButtonRecargarInformacionTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoPrueba")) {
				jButtonRecargarInformacionTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoPrueba")) {
				jButtonRecargarInformacionTipoPruebaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoPrueba")) {
				jButtonAnterioresTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoPrueba")) {
				jButtonAnterioresTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoPrueba")) {
				jButtonAnterioresTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoPrueba")) {
				jButtonSiguientesTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoPrueba")) {
				jButtonSiguientesTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoPrueba")) {
				jButtonSiguientesTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoPrueba") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoPrueba")) {
				jButtonAbrirOrderByTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoPrueba") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoPrueba")) {
				jButtonMostrarOcultarTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoPrueba")) {
				jButtonNuevoGuardarCambiosTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoPrueba")) {
				jButtonNuevoGuardarCambiosTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoPrueba")) {
				jButtonNuevoGuardarCambiosTipoPruebaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoPrueba")) {
				jButtonCerrarReporteDinamicoTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoPrueba")) {
				jButtonGenerarReporteDinamicoTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoPrueba")) {
				
				jButtonGenerarExcelReporteDinamicoTipoPruebaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoPrueba")) {
				jButtonCerrarImportacionTipoPruebaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoPrueba")) {
				
				jButtonGenerarImportacionTipoPruebaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoPrueba")) {
				
				jButtonAbrirImportacionTipoPruebaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoPrueba")) {
				jComboBoxTiposAccionesTipoPruebaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoPrueba")) {
				jComboBoxTiposRelacionesTipoPruebaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoPrueba")) {
				jComboBoxTiposAccionesTipoPruebaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoPrueba")) {
				
				jComboBoxTiposSeleccionarTipoPruebaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoPrueba")) {
				jTextFieldValorCampoGeneralTipoPruebaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoPrueba")) {
				jButtonAbrirOrderByTipoPruebaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoPrueba")) {
				jButtonAbrirOrderByTipoPruebaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoPrueba")) {
				jButtonCerrarOrderByTipoPruebaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoPruebaBusqueda")) {
				this.jButtonidTipoPruebaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoPruebaBusqueda")) {
				this.jButtoncodigoTipoPruebaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoPruebaBusqueda")) {
				this.jButtonnombreTipoPruebaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoPrueba();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPruebaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprueba);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprueba);
				
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
				
				


				
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrueba.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrueba.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoPrueba tipopruebaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipopruebaLocal=this.tipoprueba;
			} else {
				tipopruebaLocal=this.tipopruebaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprueba);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprueba);
				
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
							
				
				


				
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrueba.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrueba.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPruebaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPrueba.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopruebaAnterior =(TipoPrueba) this.tipopruebaLogic.getTipoPruebas().toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopruebaAnterior =(TipoPrueba) this.tipopruebas.toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
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
			
			TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
			
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
			
			


			
			TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPruebaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprueba);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprueba);
				
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
								
						
				


				
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrueba.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrueba.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprueba);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprueba);
				
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
								
				
				


				
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrueba.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrueba.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPruebaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPrueba.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopruebaAnterior =(TipoPrueba) this.tipopruebaLogic.getTipoPruebas().toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopruebaAnterior =(TipoPrueba) this.tipopruebas.toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprueba);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprueba);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPruebaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPrueba.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopruebaAnterior =(TipoPrueba) this.tipopruebaLogic.getTipoPruebas().toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopruebaAnterior =(TipoPrueba) this.tipopruebas.toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPruebaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprueba);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprueba);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprueba);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprueba);
				
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
							
				
				


				
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrueba.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrueba.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPruebaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoPrueba.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopruebaAnterior =(TipoPrueba) this.tipopruebaLogic.getTipoPruebas().toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipopruebaAnterior =(TipoPrueba) this.tipopruebas.toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
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
			
			TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
			
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
			
			


			
			TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPruebaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprueba);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprueba);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprueba);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprueba);
				
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
								
				
				


				
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrueba.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrueba.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPruebaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPrueba.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopruebaAnterior =(TipoPrueba) this.tipopruebaLogic.getTipoPruebas().toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopruebaAnterior =(TipoPrueba) this.tipopruebas.toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPruebaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprueba);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprueba);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPruebaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprueba);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprueba);
				
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoPrueba")) {
					jCheckBoxSeleccionarTodosTipoPruebaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoPrueba")) {
					jCheckBoxSeleccionadosTipoPruebaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoPrueba")) {
					
				}
				
				


				
				
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrueba.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrueba.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprueba);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoprueba);
				
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
												
				
				


				
				
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrueba.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrueba.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPruebaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoPrueba.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopruebaAnterior =(TipoPrueba) this.tipopruebaLogic.getTipoPruebas().toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipopruebaAnterior =(TipoPrueba) this.tipopruebas.toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPruebaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprueba);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprueba);
				
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
				
				
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
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
			
			TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
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
			
			


			
			TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPruebaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprueba);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprueba);
				
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrueba.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrueba.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprueba);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprueba);
				
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
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
				
				


				
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrueba.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrueba.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPruebaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPrueba.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopruebaAnterior =(TipoPrueba) this.tipopruebaLogic.getTipoPruebas().toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopruebaAnterior =(TipoPrueba) this.tipopruebas.toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoPrueba")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoPruebaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoPrueba.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoprueba =(TipoPrueba) this.tipopruebaLogic.getTipoPruebas().toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoprueba =(TipoPrueba) this.tipopruebas.toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoprueba);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoPrueba")) {
				
				}
				
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoPrueba")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoPrueba.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoPrueba")) {
			
			}
			
			TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoPrueba();
			
			TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoPrueba")) {
				jButtonNuevoTipoPruebaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoPrueba")) {
				jButtonDuplicarTipoPruebaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoPrueba")) {
				jButtonCopiarTipoPruebaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoPrueba")) {
				jButtonVerFormTipoPruebaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoPrueba")) {
				jButtonNuevoTipoPruebaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoPrueba")) {
				jButtonModificarTipoPruebaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoPrueba")) {
				jButtonActualizarTipoPruebaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoPrueba")) {
				jButtonEliminarTipoPruebaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoPrueba")) {
				jButtonGuardarCambiosTipoPruebaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoPrueba")) {
				jButtonCancelarTipoPruebaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoPrueba")) {
				jButtonCerrarTipoPruebaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoPrueba")) {
				jButtonGuardarCambiosTipoPruebaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoPrueba")) {
				jButtonNuevoGuardarCambiosTipoPruebaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoPrueba")) {
				jButtonAbrirOrderByTipoPruebaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoPrueba")) {
				jButtonRecargarInformacionTipoPruebaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoPrueba")) {
				jButtonAnterioresTipoPruebaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoPrueba")) {
				jButtonSiguientesTipoPruebaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoPruebaBusqueda")) {
				this.jButtonidTipoPruebaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoPruebaBusqueda")) {
				this.jButtoncodigoTipoPruebaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoPruebaBusqueda")) {
				this.jButtonnombreTipoPruebaBusquedaActionPerformed(evt);
			}
			
			TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoPrueba();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoPrueba")) {
				closingInternalFrameTipoPrueba();
				
			} else if(sTipo.equals("jButtonCancelarTipoPrueba")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoPrueba = (JInternalFrameBase)evt.getSource();
	            	
	            TipoPruebaBeanSwingJInternalFrame jInternalFrameParent=(TipoPruebaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoPrueba.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoPruebaActionPerformed(null);
			}
			
			TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoprueba,new Object(),this.tipopruebaParameterGeneral,this.tipopruebaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoPrueba(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoPrueba(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoPrueba(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoprueba)) {
			if(!esControlTabla) {
				if(TipoPruebaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoPrueba(this.tipoprueba,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrueba(this.tipoprueba);			
				}
				
				if(this.tipopruebaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoPrueba(this.tipoprueba,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipopruebaReturnGeneral=tipopruebaLogic.procesarEventosTipoPruebasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipopruebaLogic.getTipoPruebas(),this.tipoprueba,this.tipopruebaParameterGeneral,this.isEsNuevoTipoPrueba,classes);//this.tipopruebaLogic.getTipoPrueba()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoPrueba(this.tipopruebaReturnGeneral,this.tipopruebaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipopruebaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoPrueba(classes,this.tipopruebaReturnGeneral,this.tipopruebaBean,false);
					}
						
					if(this.tipopruebaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoPrueba(this.tipopruebaReturnGeneral.getTipoPrueba());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoPrueba(this.tipopruebaReturnGeneral.getTipoPrueba());	
					}
						
					if(this.tipopruebaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoPrueba(this.tipopruebaReturnGeneral.getTipoPrueba(),classes);//this.tipopruebaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoPrueba(this.tipoprueba,classes);//this.tipopruebaBean);									
				}
			
				if(TipoPruebaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoPrueba(this.tipoprueba,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrueba(this.tipoprueba);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipopruebaAnterior!=null) {
						this.tipoprueba=this.tipopruebaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipopruebaReturnGeneral=tipopruebaLogic.procesarEventosTipoPruebasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipopruebaLogic.getTipoPruebas(),this.tipoprueba,this.tipopruebaParameterGeneral,this.isEsNuevoTipoPrueba,classes);//this.tipopruebaLogic.getTipoPrueba()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipopruebaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipopruebaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipopruebaReturnGeneral.getTipoPrueba(),tipopruebaLogic.getTipoPruebas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipopruebaReturnGeneral.getTipoPrueba(),this.tipopruebas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoPrueba.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoPrueba.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoPrueba();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoPrueba() throws Exception {
		
		TipoPruebaModel tipopruebaModel=(TipoPruebaModel)this.jTableDatosTipoPrueba.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipopruebaModel.tipopruebas=this.tipopruebaLogic.getTipoPruebas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipopruebaModel.tipopruebas=this.tipopruebas;
		}
		
		
		((TipoPruebaModel) this.jTableDatosTipoPrueba.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoPrueba() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipopruebaAnterior(),this.tipopruebaLogic.getTipoPruebas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipopruebaAnterior(),this.tipopruebas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoPrueba();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoPrueba(TipoPrueba tipoprueba,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
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
										
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprueba,new Object(),generalEntityParameterGeneral,this.tipopruebaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipopruebaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoPruebaConstantesFunciones.getClassesRelationshipsOfTipoPrueba(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoPruebaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoPrueba(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoPrueba(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoPruebaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprueba,new Object(),generalEntityParameterGeneral,this.tipopruebaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoPrueba(TipoPruebaBean tipopruebaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoPrueba(ArrayList<Classe> classes,TipoPruebaReturnGeneral tipopruebaReturnGeneral,TipoPruebaBean tipopruebaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoPrueba(TipoPrueba tipoprueba,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoprueba)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoPrueba = new TipoPruebaDetalleFormJInternalFrame(jDesktopPane,this.tipopruebaSessionBean.getConGuardarRelaciones(),this.tipopruebaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoPrueba);
		this.jInternalFrameDetalleFormTipoPrueba.setVisible(false);
		this.jInternalFrameDetalleFormTipoPrueba.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoPrueba.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoPrueba.tipopruebaLogic=this.tipopruebaLogic;
		
		this.cargarCombosFrameForeignKeyTipoPrueba("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoPrueba();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoPrueba();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoPrueba("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoPrueba();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoPrueba.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoPrueba"));
		
		this.jInternalFrameDetalleFormTipoPrueba.jButtonModificarTipoPrueba.addActionListener(new ButtonActionListener(this,"ModificarTipoPrueba"));

		
		this.jInternalFrameDetalleFormTipoPrueba.jButtonModificarToolBarTipoPrueba.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoPrueba"));
					
		this.jInternalFrameDetalleFormTipoPrueba.jMenuItemModificarTipoPrueba.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoPrueba"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPrueba.jButtonActualizarTipoPrueba.addActionListener (new ButtonActionListener(this,"ActualizarTipoPrueba"));
		
		
		this.jInternalFrameDetalleFormTipoPrueba.jButtonActualizarToolBarTipoPrueba.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoPrueba"));
						
		this.jInternalFrameDetalleFormTipoPrueba.jMenuItemActualizarTipoPrueba.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoPrueba"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPrueba.jButtonEliminarTipoPrueba.addActionListener (new ButtonActionListener(this,"EliminarTipoPrueba"));
		
		
		this.jInternalFrameDetalleFormTipoPrueba.jButtonEliminarToolBarTipoPrueba.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoPrueba"));
								
		this.jInternalFrameDetalleFormTipoPrueba.jMenuItemEliminarTipoPrueba.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoPrueba"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPrueba.jButtonCancelarTipoPrueba.addActionListener (new ButtonActionListener(this,"CancelarTipoPrueba"));
		
		
		this.jInternalFrameDetalleFormTipoPrueba.jButtonCancelarToolBarTipoPrueba.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoPrueba"));
					
		this.jInternalFrameDetalleFormTipoPrueba.jMenuItemCancelarTipoPrueba.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoPrueba"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoPrueba.jMenuItemDetalleCerrarTipoPrueba.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoPrueba"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPrueba.jButtonGuardarCambiosToolBarTipoPrueba.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPrueba"));
		
		
		
		this.jInternalFrameDetalleFormTipoPrueba.jButtonGuardarCambiosToolBarTipoPrueba.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPrueba"));
		
		
		
		this.jInternalFrameDetalleFormTipoPrueba.jComboBoxTiposAccionesFormularioTipoPrueba.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoPrueba"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrueba.jButtonidTipoPruebaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPruebaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrueba.jButtoncodigoTipoPruebaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoPruebaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrueba.jButtonnombreTipoPruebaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPruebaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoPrueba.jTabbedPaneRelacionesTipoPrueba.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoPrueba"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoPrueba"));
		
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrueba.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoPrueba"));
		}
		
		this.jTableDatosTipoPrueba.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoPrueba"));
		
		this.jTableDatosTipoPrueba.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoPrueba"));
		
		this.jButtonNuevoTipoPrueba.addActionListener(new ButtonActionListener(this,"NuevoTipoPrueba"));
		
		this.jButtonDuplicarTipoPrueba.addActionListener(new ButtonActionListener(this,"DuplicarTipoPrueba"));
		
		this.jButtonCopiarTipoPrueba.addActionListener(new ButtonActionListener(this,"CopiarTipoPrueba"));
		
		this.jButtonVerFormTipoPrueba.addActionListener(new ButtonActionListener(this,"VerFormTipoPrueba"));
		
		
		this.jButtonNuevoToolBarTipoPrueba.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoPrueba"));
			
		this.jButtonDuplicarToolBarTipoPrueba.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoPrueba"));
			
		this.jMenuItemNuevoTipoPrueba.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoPrueba"));
			
		this.jMenuItemDuplicarTipoPrueba.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoPrueba"));		
		
		
		this.jButtonNuevoRelacionesTipoPrueba.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoPrueba"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoPrueba.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoPrueba"));
			
		this.jMenuItemNuevoRelacionesTipoPrueba.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoPrueba"));		
		
		
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrueba.jButtonModificarTipoPrueba.addActionListener(new ButtonActionListener(this,"ModificarTipoPrueba"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrueba.jButtonModificarToolBarTipoPrueba.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoPrueba"));
			
			this.jInternalFrameDetalleFormTipoPrueba.jMenuItemModificarTipoPrueba.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoPrueba"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoPrueba.jButtonActualizarTipoPrueba.addActionListener (new ButtonActionListener(this,"ActualizarTipoPrueba"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrueba.jButtonActualizarToolBarTipoPrueba.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoPrueba"));
				
			this.jInternalFrameDetalleFormTipoPrueba.jMenuItemActualizarTipoPrueba.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoPrueba"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrueba.jButtonEliminarTipoPrueba.addActionListener (new ButtonActionListener(this,"EliminarTipoPrueba"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrueba.jButtonEliminarToolBarTipoPrueba.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoPrueba"));
						
			this.jInternalFrameDetalleFormTipoPrueba.jMenuItemEliminarTipoPrueba.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoPrueba"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrueba.jButtonCancelarTipoPrueba.addActionListener (new ButtonActionListener(this,"CancelarTipoPrueba"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrueba.jButtonCancelarToolBarTipoPrueba.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoPrueba"));
			
			this.jInternalFrameDetalleFormTipoPrueba.jMenuItemCancelarTipoPrueba.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoPrueba"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoPrueba.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoPrueba"));		
		
		
		this.jButtonCerrarTipoPrueba.addActionListener (new ButtonActionListener(this,"CerrarTipoPrueba"));
		
		
		this.jButtonCerrarToolBarTipoPrueba.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoPrueba"));
			
		this.jMenuItemCerrarTipoPrueba.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoPrueba"));
			
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrueba.jMenuItemDetalleCerrarTipoPrueba.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoPrueba"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrueba.jButtonGuardarCambiosTipoPrueba.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoPrueba"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrueba.jButtonGuardarCambiosToolBarTipoPrueba.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPrueba"));
		}
		
		this.jButtonCopiarToolBarTipoPrueba.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoPrueba"));
			
		this.jButtonVerFormToolBarTipoPrueba.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoPrueba"));
		
		this.jMenuItemGuardarCambiosTipoPrueba.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoPrueba"));
			
		this.jMenuItemCopiarTipoPrueba.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoPrueba"));		
		
		this.jMenuItemVerFormTipoPrueba.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoPrueba"));		
		
		
		this.jButtonGuardarCambiosTablaTipoPrueba.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoPrueba"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoPrueba.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoPrueba"));
			
		this.jMenuItemGuardarCambiosTablaTipoPrueba.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoPrueba"));		
		
		
		
		this.jButtonRecargarInformacionTipoPrueba.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoPrueba"));
					
		this.jButtonRecargarInformacionToolBarTipoPrueba.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoPrueba"));
		
		this.jMenuItemRecargarInformacionTipoPrueba.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoPrueba"));		
		
		
		
		this.jButtonAnterioresTipoPrueba.addActionListener (new ButtonActionListener(this,"AnterioresTipoPrueba"));
		
		
		this.jButtonAnterioresToolBarTipoPrueba.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoPrueba"));
		
		this.jMenuItemAnterioresTipoPrueba.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoPrueba"));		
		
		
		this.jButtonSiguientesTipoPrueba.addActionListener (new ButtonActionListener(this,"SiguientesTipoPrueba"));
		
		
		this.jButtonSiguientesToolBarTipoPrueba.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoPrueba"));
			
		this.jMenuItemSiguientesTipoPrueba.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoPrueba"));
			
		this.jMenuItemAbrirOrderByTipoPrueba.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoPrueba"));
			
		this.jMenuItemMostrarOcultarTipoPrueba.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoPrueba"));
			
		this.jMenuItemDetalleAbrirOrderByTipoPrueba.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoPrueba"));
			
		this.jMenuItemDetalleMostarOcultarTipoPrueba.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoPrueba"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoPrueba.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoPrueba"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPrueba.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoPrueba"));
			
		this.jMenuItemNuevoGuardarCambiosTipoPrueba.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoPrueba"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoPrueba.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoPrueba"));

		this.jCheckBoxSeleccionadosTipoPrueba.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoPrueba"));
		
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrueba.jComboBoxTiposAccionesFormularioTipoPrueba.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoPrueba"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoPrueba.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoPrueba"));
			
		this.jComboBoxTiposAccionesTipoPrueba.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoPrueba"));
					
		this.jComboBoxTiposSeleccionarTipoPrueba.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoPrueba"));
			
		this.jTextFieldValorCampoGeneralTipoPrueba.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoPrueba"));		
		
		
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrueba.jButtonidTipoPruebaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPruebaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrueba.jButtoncodigoTipoPruebaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoPruebaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrueba.jButtonnombreTipoPruebaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPruebaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoPrueba!=null) {
				this.jInternalFrameReporteDinamicoTipoPrueba.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPrueba"));
				this.jInternalFrameReporteDinamicoTipoPrueba.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPrueba"));
				this.jInternalFrameReporteDinamicoTipoPrueba.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPrueba"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoPrueba.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPrueba"));				
			//this.jButtonGenerarReporteDinamicoTipoPrueba.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPrueba"));
			//this.jButtonGenerarExcelReporteDinamicoTipoPrueba.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPrueba"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoPrueba!=null) {
				this.jInternalFrameImportacionTipoPrueba.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoPrueba"));
				this.jInternalFrameImportacionTipoPrueba.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoPrueba"));
				this.jInternalFrameImportacionTipoPrueba.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoPrueba"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoPrueba.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoPrueba"));
			
			this.jButtonAbrirOrderByToolBarTipoPrueba.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoPrueba"));			
			
			if(this.jInternalFrameOrderByTipoPrueba!=null) {
				this.jInternalFrameOrderByTipoPrueba.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoPrueba"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoPrueba!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrueba.jTabbedPaneRelacionesTipoPrueba.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoPrueba"));
		
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
            		closingInternalFrameTipoPrueba();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoPrueba.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoPrueba = (JInternalFrameBase)event.getSource();
	            	
	            TipoPruebaBeanSwingJInternalFrame jInternalFrameParent=(TipoPruebaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoPrueba.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoPruebaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoPrueba.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoPruebaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoPrueba.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoPrueba.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPruebaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPruebaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPruebaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoPrueba";
		inputMap = this.jButtonNuevoTipoPrueba.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoPrueba.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoPruebaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPruebaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPruebaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPruebaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoPrueba";
		inputMap = this.jButtonNuevoRelacionesTipoPrueba.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoPrueba.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoPruebaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoPrueba";
		inputMap = this.jButtonModificarTipoPrueba.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoPrueba.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoPruebaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoPrueba";
		inputMap = this.jButtonActualizarTipoPrueba.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoPrueba.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoPruebaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoPrueba";
		inputMap = this.jButtonEliminarTipoPrueba.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoPrueba.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoPruebaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoPrueba";
		inputMap = this.jButtonCancelarTipoPrueba.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoPrueba.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoPruebaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoPrueba";
		inputMap = this.jButtonCerrarTipoPrueba.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoPrueba.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoPruebaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoPrueba.jButtonGuardarCambiosTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoPrueba";
		inputMap = this.jInternalFrameDetalleFormTipoPrueba.jButtonGuardarCambiosTipoPrueba.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoPrueba.jButtonGuardarCambiosTipoPrueba.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoPruebaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoPrueba.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoPruebaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoPrueba.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoPruebaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoPrueba.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoPruebaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoPrueba.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoPruebaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrueba.jButtonidTipoPruebaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPruebaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrueba.jButtoncodigoTipoPruebaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoPruebaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrueba.jButtonnombreTipoPruebaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPruebaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoPrueba.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoPruebaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoPruebaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoPrueba.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoPrueba(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoPrueba tipopruebaAux:this.tipopruebaLogic.getTipoPruebas()) {
					tipopruebaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPrueba tipopruebaAux:tipopruebas) {
					tipopruebaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoPruebaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoPrueba(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoPrueba tipopruebaAux:this.tipopruebaLogic.getTipoPruebas()) {
						tipopruebaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPrueba tipopruebaAux:tipopruebas) {
						tipopruebaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoPrueba tipopruebaAux:this.tipopruebaLogic.getTipoPruebas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPrueba tipopruebaAux:tipopruebas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoPrueba(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoPrueba.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoPrueba.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoPrueba,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoPruebaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoPrueba(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoPrueba.getSelectedRows();
			
			TipoPrueba tipopruebaLocal=new TipoPrueba();
			
			//this.seleccionarTodosTipoPrueba(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipopruebaLocal =(TipoPrueba) this.tipopruebaLogic.getTipoPruebas().toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipopruebaLocal =(TipoPrueba) this.tipopruebas.toArray()[this.jTableDatosTipoPrueba.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipopruebaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoPrueba tipopruebaAux:this.tipopruebaLogic.getTipoPruebas()) {
						tipopruebaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPrueba tipopruebaAux:tipopruebas) {
						tipopruebaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoPrueba(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoPrueba.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoPrueba.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoPrueba,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoPruebaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoPruebaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoPruebaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoPrueba(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoPrueba.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoPrueba tipopruebaAux:this.tipopruebaLogic.getTipoPruebas()) {
				
						if(sTipoSeleccionar.equals(TipoPruebaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipopruebaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoPruebaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipopruebaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPrueba tipopruebaAux:tipopruebas) {
					
						if(sTipoSeleccionar.equals(TipoPruebaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipopruebaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoPruebaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipopruebaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoPrueba(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoPruebaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoPrueba(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoPrueba=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoPrueba.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoPrueba.jComboBoxTiposAccionesFormularioTipoPrueba.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoPrueba) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoPrueba(conSplash);
				
					this.generarReporteTipoPruebasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPrueba.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPrueba.jComboBoxTiposAccionesFormularioTipoPrueba.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoPruebasSeleccionados();
				//this.jComboBoxTiposAccionesTipoPrueba.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoPruebasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoPrueba.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoPruebasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoPrueba.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoPrueba();
				
				this.exportarTipoPruebasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPrueba.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPrueba.jComboBoxTiposAccionesFormularioTipoPrueba.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoPruebas();
				//this.importarTipoPruebas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPrueba.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPrueba.jComboBoxTiposAccionesFormularioTipoPrueba.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoPrueba();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoPruebasSeleccionados();
				//this.jComboBoxTiposAccionesTipoPrueba.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Prueba", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoPrueba();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoPrueba)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoPrueba(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Prueba",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPrueba.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPrueba.jComboBoxTiposAccionesFormularioTipoPrueba.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoPruebaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoPrueba) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoPrueba(conSplash);
					
						//this.actualizarParametrosGeneralTipoPrueba();
						
						this.generarReporteProcesoAccionTipoPruebasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoPrueba.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoPrueba.jComboBoxTiposAccionesFormularioTipoPrueba.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoPruebaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo PruebaS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Prueba", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoPrueba();
				
						this.actualizarParametrosGeneralTipoPrueba();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipopruebaReturnGeneral=tipopruebaLogic.procesarAccionTipoPruebasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipopruebaLogic.getTipoPruebas(),this.tipopruebaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoPruebaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoPrueba.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoPrueba.jComboBoxTiposAccionesFormularioTipoPrueba.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoPrueba();
					
					TipoPruebaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoPruebaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoPrueba.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoPrueba.jComboBoxTiposAccionesFormularioTipoPrueba.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoPrueba(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoPruebaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoPrueba();
			
			if(this.jInternalFrameDetalleFormTipoPrueba==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoPrueba> tipopruebasSeleccionados=new ArrayList<TipoPrueba>();		
			TipoPrueba tipoprueba=new TipoPrueba();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoPrueba(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoPrueba.getSelectedItem();
			
			
			
			
			tipopruebasSeleccionados=this.getTipoPruebasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipopruebasSeleccionados.size()==1) {
				for(TipoPrueba tipopruebaAux:tipopruebasSeleccionados) {
					tipoprueba=tipopruebaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoPrueba();
			
      		//this.finishProcessTipoPrueba(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoPruebaReturnGeneral() throws Exception {
		if(this.tipopruebaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipopruebaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipopruebaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipopruebaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipopruebaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipopruebaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoPrueba(false);
		}
		
		if(this.tipopruebaReturnGeneral.getConRetornoLista() || this.tipopruebaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipopruebaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipopruebaLogic.setTipoPruebas(this.tipopruebaReturnGeneral.getTipoPruebas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipopruebaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipopruebaLogic.setTipoPrueba(this.tipopruebaReturnGeneral.getTipoPrueba());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoPrueba(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoPrueba() throws Exception {
		
		
	}
	
	public ArrayList<TipoPrueba> getTipoPruebasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoPrueba> tipopruebasSeleccionados=new ArrayList<TipoPrueba>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoPrueba) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoPrueba tipopruebaAux:tipopruebaLogic.getTipoPruebas()) {
					if(tipopruebaAux.getIsSelected()) {
						tipopruebasSeleccionados.add(tipopruebaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPrueba tipopruebaAux:this.tipopruebas) {
					if(tipopruebaAux.getIsSelected()) {
						tipopruebasSeleccionados.add(tipopruebaAux);				
					}
				}
			}
			
			if(tipopruebasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipopruebasSeleccionados.addAll(this.tipopruebaLogic.getTipoPruebas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipopruebasSeleccionados.addAll(this.tipopruebas);				
					}
				}
			}
		} else {
			tipopruebasSeleccionados.add(this.tipoprueba);
		}
		
		return tipopruebasSeleccionados;
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
	
	public void generarReporteTipoPruebasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoPruebasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoPruebasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoPruebasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoPruebasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Prueba",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoPruebasSeleccionados() throws Exception {
		ArrayList<TipoPrueba> tipopruebasSeleccionados=new ArrayList<TipoPrueba>();		
		
		tipopruebasSeleccionados=this.getTipoPruebasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoPruebas("Todos",tipopruebasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoPruebasSeleccionados() throws Exception {
		ArrayList<TipoPrueba> tipopruebasSeleccionados=new ArrayList<TipoPrueba>();		
		
		tipopruebasSeleccionados=this.getTipoPruebasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoPruebas("Todos",tipopruebasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoPruebasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoPrueba> tipopruebasSeleccionados=new ArrayList<TipoPrueba>();
		
		tipopruebasSeleccionados=this.getTipoPruebasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoPruebas("Todos",tipopruebasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoPruebasSeleccionados() throws Exception {
		ArrayList<TipoPrueba> tipopruebasSeleccionados=new ArrayList<TipoPrueba>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoPrueba();
		
		
		tipopruebasSeleccionados=this.getTipoPruebasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoPrueba();
		
		
		//this.generarReporteTipoPruebas("Todos",tipopruebasSeleccionados ,tipopruebaImplementable,tipopruebaImplementableHome);
	}
	
	public void mostrarImportacionTipoPruebas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoPrueba();
		
		this.abrirFrameImportacionTipoPrueba();		
		
			
		//this.generarReporteTipoPruebas("Todos",tipopruebasSeleccionados ,tipopruebaImplementable,tipopruebaImplementableHome);
	}
	
	public void importarTipoPruebas() throws Exception {		
	
	}
	
	public void exportarTipoPruebasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoPruebasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoPruebasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoPruebasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Prueba",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoPruebasSeleccionados() throws Exception {
		ArrayList<TipoPrueba> tipopruebasSeleccionados=new ArrayList<TipoPrueba>();		
		
		tipopruebasSeleccionados=this.getTipoPruebasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprueba."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoPrueba(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoPrueba tipopruebaAux:tipopruebasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoPrueba(tipopruebaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipopruebaAux.setsDetalleGeneralEntityReporte(tipopruebaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopruebaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prueba",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoPrueba(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoPruebaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPruebaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPruebaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPruebaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoPrueba(TipoPrueba tipoprueba,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoprueba.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprueba.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprueba.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprueba.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoPruebasSeleccionados() throws Exception {
		ArrayList<TipoPrueba> tipopruebasSeleccionados=new ArrayList<TipoPrueba>();		
		
		tipopruebasSeleccionados=this.getTipoPruebasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprueba.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoPruebas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoPrueba(row);				
				iRow++;
			}				
			
			for(TipoPrueba tipopruebaAux:tipopruebasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoPrueba(tipopruebaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopruebaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prueba",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoPruebasSeleccionados() throws Exception {
		ArrayList<TipoPrueba> tipopruebasSeleccionados=new ArrayList<TipoPrueba>();		
		
		tipopruebasSeleccionados=this.getTipoPruebasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprueba.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipopruebas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoprueba");
			//elementRoot.appendChild(element);
		
			for(TipoPrueba tipopruebaAux:tipopruebasSeleccionados) {
				element = document.createElement("tipoprueba");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoPrueba(tipopruebaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopruebaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prueba",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoPrueba(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPruebaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPruebaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoPruebaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPruebaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoPrueba(TipoPrueba tipoprueba,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprueba.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprueba.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprueba.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoPrueba(TipoPrueba tipoprueba,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoPruebaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoprueba.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoPruebaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoprueba.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoPruebaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoprueba.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoPruebaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoprueba.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoPruebasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoPrueba> tipopruebasSeleccionados=new ArrayList<TipoPrueba>();
		
		tipopruebasSeleccionados=this.getTipoPruebasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoPrueba(tipopruebasSeleccionados);
		
		this.generarReporteTipoPruebas("Todos",tipopruebasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoPrueba(ArrayList<TipoPrueba> tipopruebasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoPrueba tipopruebaAux:tipopruebasSeleccionados) {
				tipopruebaAux.setsDetalleGeneralEntityReporte(tipopruebaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoPruebaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipopruebaAux.setsDescripcionGeneralEntityReporte1(tipopruebaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoPruebaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipopruebaAux.setsDescripcionGeneralEntityReporte1(tipopruebaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPruebaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoPrueba(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoPrueba=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoPrueba=true;
				this.isVisibilidadCeldaGuardarCambiosTipoPrueba=true;
			}
			
			this.isVisibilidadCeldaModificarTipoPrueba=false;
			this.isVisibilidadCeldaActualizarTipoPrueba=false;
			this.isVisibilidadCeldaEliminarTipoPrueba=false;
			this.isVisibilidadCeldaCancelarTipoPrueba=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrueba=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrueba=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoPrueba=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrueba=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrueba=false;
			this.isVisibilidadCeldaModificarTipoPrueba=false;
			this.isVisibilidadCeldaActualizarTipoPrueba=true;
			this.isVisibilidadCeldaEliminarTipoPrueba=false;
			this.isVisibilidadCeldaCancelarTipoPrueba=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrueba=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrueba=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoPrueba=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrueba=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrueba=false;
			this.isVisibilidadCeldaModificarTipoPrueba=false;
			this.isVisibilidadCeldaActualizarTipoPrueba=true;
			this.isVisibilidadCeldaEliminarTipoPrueba=true;
			this.isVisibilidadCeldaCancelarTipoPrueba=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrueba=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrueba=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoPrueba=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrueba=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrueba=false;
			this.isVisibilidadCeldaModificarTipoPrueba=false;
			this.isVisibilidadCeldaActualizarTipoPrueba=true;
			this.isVisibilidadCeldaEliminarTipoPrueba=false;
			this.isVisibilidadCeldaCancelarTipoPrueba=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrueba=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrueba=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoPrueba=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrueba=true;
			this.isVisibilidadCeldaGuardarCambiosTipoPrueba=true;
			this.isVisibilidadCeldaModificarTipoPrueba=false;
			this.isVisibilidadCeldaActualizarTipoPrueba=false;
			this.isVisibilidadCeldaEliminarTipoPrueba=false;
			this.isVisibilidadCeldaCancelarTipoPrueba=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrueba=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrueba=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoPrueba=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrueba=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrueba=false;
			this.isVisibilidadCeldaActualizarTipoPrueba=false;
			this.isVisibilidadCeldaEliminarTipoPrueba=false;
			this.isVisibilidadCeldaCancelarTipoPrueba=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrueba=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrueba=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoPrueba=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrueba=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrueba=false;
			this.isVisibilidadCeldaModificarTipoPrueba=true;
			this.isVisibilidadCeldaActualizarTipoPrueba=false;
			this.isVisibilidadCeldaEliminarTipoPrueba=false;
			this.isVisibilidadCeldaCancelarTipoPrueba=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrueba=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrueba=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoPruebaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoPrueba=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrueba=true;
			this.isVisibilidadCeldaGuardarCambiosTipoPrueba=true;
		} else {
			this.actualizarEstadoPanelsTipoPrueba(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoPrueba=false;
			//this.isVisibilidadCeldaVerFormTipoPrueba=false;
			this.isVisibilidadCeldaDuplicarTipoPrueba=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipopruebaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoPrueba=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoPrueba=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrueba=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipopruebaSessionBean.getEsGuardarRelacionado()) {
			if(!tipopruebaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoPrueba=false;												
			}
			
			this.jButtonCerrarTipoPrueba.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoPrueba=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoprueba)) {
			this.isVisibilidadCeldaActualizarTipoPrueba=false;
			this.isVisibilidadCeldaEliminarTipoPrueba=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoPrueba() {
	}
	
	public void actualizarEstadoPanelsTipoPrueba(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoPrueba!=null) {
				this.jScrollPanelDatosEdicionTipoPrueba.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoPrueba!=null) {
				this.jScrollPanelDatosTipoPrueba.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPrueba!=null) {
				this.jPanelPaginacionTipoPrueba.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPrueba!=null) {
				this.jPanelParametrosReportesTipoPrueba.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoPrueba!=null) {
				this.jScrollPanelDatosEdicionTipoPrueba.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoPrueba!=null) {
				this.jScrollPanelDatosTipoPrueba.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPrueba!=null) {
				this.jPanelPaginacionTipoPrueba.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPrueba!=null) {
				this.jPanelParametrosReportesTipoPrueba.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoPrueba!=null) {
				this.jScrollPanelDatosEdicionTipoPrueba.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoPrueba!=null) {
				this.jScrollPanelDatosTipoPrueba.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPrueba!=null) {
				this.jPanelPaginacionTipoPrueba.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPrueba!=null) {
				this.jPanelParametrosReportesTipoPrueba.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoPrueba!=null) {
				this.jScrollPanelDatosEdicionTipoPrueba.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPrueba!=null) {
				this.jScrollPanelDatosTipoPrueba.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPrueba!=null) {
				this.jPanelPaginacionTipoPrueba.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPrueba!=null) {
				this.jPanelParametrosReportesTipoPrueba.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoPrueba!=null) {
				this.jScrollPanelDatosEdicionTipoPrueba.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoPrueba!=null) {
				this.jScrollPanelDatosTipoPrueba.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPrueba!=null) {
				this.jPanelPaginacionTipoPrueba.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPrueba!=null) {
				this.jPanelParametrosReportesTipoPrueba.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoPrueba!=null) {
				this.jScrollPanelDatosEdicionTipoPrueba.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoPrueba!=null) {
				this.jScrollPanelDatosTipoPrueba.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPrueba!=null) {
				this.jPanelPaginacionTipoPrueba.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPrueba!=null) {
				this.jPanelParametrosReportesTipoPrueba.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoPrueba!=null) {
				this.jScrollPanelDatosEdicionTipoPrueba.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoPrueba!=null) {
				this.jScrollPanelDatosTipoPrueba.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPrueba!=null) {
				this.jPanelPaginacionTipoPrueba.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPrueba!=null) {
				this.jPanelParametrosReportesTipoPrueba.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoPruebaSessionBean tipopruebaSessionBean=new TipoPruebaSessionBean();
		
		if(this.tipopruebaSessionBean==null) {
			this.tipopruebaSessionBean=new TipoPruebaSessionBean();
		}
		
		this.tipopruebaSessionBean.setsUltimaBusquedaTipoPrueba(this.getsAccionBusqueda());
		this.tipopruebaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipopruebaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoPruebaSessionBean tipopruebaSessionBean=new TipoPruebaSessionBean();
		
		if(this.tipopruebaSessionBean==null) {
			this.tipopruebaSessionBean=new TipoPruebaSessionBean();
		}
		
		if(this.tipopruebaSessionBean.getsUltimaBusquedaTipoPrueba()!=null&&!this.tipopruebaSessionBean.getsUltimaBusquedaTipoPrueba().equals("")) {
			this.setsAccionBusqueda(tipopruebaSessionBean.getsUltimaBusquedaTipoPrueba());
			this.setiNumeroPaginacion(tipopruebaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipopruebaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipopruebaSessionBean.setsUltimaBusquedaTipoPrueba("");
		this.tipopruebaSessionBean.setiNumeroPaginacion(TipoPruebaConstantesFunciones.INUMEROPAGINACION);
		this.tipopruebaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoPrueba(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoPrueba() {
		this.updateBorderResaltarBusquedasFormularioTipoPrueba();
		this.updateVisibilidadBusquedasFormularioTipoPrueba();
		this.updateHabilitarBusquedasFormularioTipoPrueba();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoPrueba() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoPrueba() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoPrueba() {
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
	
	public void updateControlesFormularioTipoPrueba() throws Exception {

		if(this.jInternalFrameDetalleFormTipoPrueba==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoPrueba();
		this.updateVisibilidadResaltarControlesFormularioTipoPrueba();
		this.updateHabilitarResaltarControlesFormularioTipoPrueba();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoPrueba() throws Exception {
		if(this.jInternalFrameDetalleFormTipoPrueba==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipopruebaConstantesFunciones.resaltaridTipoPrueba!=null && this.jInternalFrameDetalleFormTipoPrueba!=null) {this.jInternalFrameDetalleFormTipoPrueba.jTextFieldidTipoPrueba.setBorder(this.tipopruebaConstantesFunciones.resaltaridTipoPrueba);}
		if(this.tipopruebaConstantesFunciones.resaltarcodigoTipoPrueba!=null && this.jInternalFrameDetalleFormTipoPrueba!=null) {this.jInternalFrameDetalleFormTipoPrueba.jTextFieldcodigoTipoPrueba.setBorder(this.tipopruebaConstantesFunciones.resaltarcodigoTipoPrueba);}
		if(this.tipopruebaConstantesFunciones.resaltarnombreTipoPrueba!=null && this.jInternalFrameDetalleFormTipoPrueba!=null) {this.jInternalFrameDetalleFormTipoPrueba.jTextAreanombreTipoPrueba.setBorder(this.tipopruebaConstantesFunciones.resaltarnombreTipoPrueba);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoPrueba() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoPrueba==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) {
	
		//this.jInternalFrameDetalleFormTipoPrueba.jTextFieldidTipoPrueba.setVisible(this.tipopruebaConstantesFunciones.mostraridTipoPrueba);
		this.jInternalFrameDetalleFormTipoPrueba.jPanelidTipoPrueba.setVisible(this.tipopruebaConstantesFunciones.mostraridTipoPrueba);
		//this.jInternalFrameDetalleFormTipoPrueba.jTextFieldcodigoTipoPrueba.setVisible(this.tipopruebaConstantesFunciones.mostrarcodigoTipoPrueba);
		this.jInternalFrameDetalleFormTipoPrueba.jPanelcodigoTipoPrueba.setVisible(this.tipopruebaConstantesFunciones.mostrarcodigoTipoPrueba);
		//this.jInternalFrameDetalleFormTipoPrueba.jTextAreanombreTipoPrueba.setVisible(this.tipopruebaConstantesFunciones.mostrarnombreTipoPrueba);
		this.jInternalFrameDetalleFormTipoPrueba.jPanelnombreTipoPrueba.setVisible(this.tipopruebaConstantesFunciones.mostrarnombreTipoPrueba);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoPrueba() throws Exception {
		if(this.jInternalFrameDetalleFormTipoPrueba==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoPrueba!=null) {
	
		this.jInternalFrameDetalleFormTipoPrueba.jTextFieldidTipoPrueba.setEnabled(this.tipopruebaConstantesFunciones.activaridTipoPrueba);
		this.jInternalFrameDetalleFormTipoPrueba.jTextFieldcodigoTipoPrueba.setEnabled(this.tipopruebaConstantesFunciones.activarcodigoTipoPrueba);
		this.jInternalFrameDetalleFormTipoPrueba.jTextAreanombreTipoPrueba.setEnabled(this.tipopruebaConstantesFunciones.activarnombreTipoPrueba);
		}
	}
	
		
}