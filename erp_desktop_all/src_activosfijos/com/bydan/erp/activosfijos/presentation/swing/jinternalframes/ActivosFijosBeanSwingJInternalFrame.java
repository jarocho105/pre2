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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;




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

import com.bydan.erp.activosfijos.util.ActivosFijosConstantesFunciones;
import com.bydan.erp.activosfijos.util.ActivosFijosParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.ActivosFijosParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.ActivosFijosBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.activosfijos.resources.reportes.AuxiliarReportes;


import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
public class ActivosFijosBeanSwingJInternalFrame extends ActivosFijosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ActivosFijosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ActivosFijos> activosfijosValidator = new ClassValidator<ActivosFijos>(ActivosFijos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ActivosFijos activosfijos;	
	public ActivosFijos activosfijosAux;
	public ActivosFijos activosfijosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ActivosFijos activosfijosTotales;
	public Long idActivosFijosActual;
	public Long iIdNuevoActivosFijos=0L;
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
	
	public Boolean isPermisoTodoActivosFijos;
	public Boolean isPermisoNuevoActivosFijos;
	public Boolean isPermisoActualizarActivosFijos;
	public Boolean isPermisoActualizarOriginalActivosFijos;
	public Boolean isPermisoEliminarActivosFijos;
	public Boolean isPermisoGuardarCambiosActivosFijos;
	public Boolean isPermisoConsultaActivosFijos;
	public Boolean isPermisoBusquedaActivosFijos;
	public Boolean isPermisoReporteActivosFijos;
	public Boolean isPermisoPaginacionMedioActivosFijos;
	public Boolean isPermisoPaginacionAltoActivosFijos;
	public Boolean isPermisoPaginacionTodoActivosFijos;
	public Boolean isPermisoCopiarActivosFijos;
	public Boolean isPermisoVerFormActivosFijos;
	public Boolean isPermisoDuplicarActivosFijos;
	public Boolean isPermisoOrdenActivosFijos;
	
	
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
	
	public ActivosFijosParameterReturnGeneral activosfijosReturnGeneral;
	public ActivosFijosParameterReturnGeneral activosfijosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoActivosFijos=false;
	public Boolean esParaAccionDesdeFormularioActivosFijos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ActivosFijosSessionBeanAdditional activosfijosSessionBeanAdditional=null;
	
	public ActivosFijosSessionBeanAdditional getActivosFijosSessionBeanAdditional() {
		return this.activosfijosSessionBeanAdditional;
	}
	
	public void setActivosFijosSessionBeanAdditional(ActivosFijosSessionBeanAdditional activosfijosSessionBeanAdditional) {
		try {
			this.activosfijosSessionBeanAdditional=activosfijosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ActivosFijosBeanSwingJInternalFrameAdditional activosfijosBeanSwingJInternalFrameAdditional=null;
	//public class ActivosFijosBeanSwingJInternalFrame
	
	public ActivosFijosBeanSwingJInternalFrameAdditional getActivosFijosBeanSwingJInternalFrameAdditional() {
		return this.activosfijosBeanSwingJInternalFrameAdditional;
	}
	
	public void setActivosFijosBeanSwingJInternalFrameAdditional(ActivosFijosBeanSwingJInternalFrameAdditional activosfijosBeanSwingJInternalFrameAdditional) {
		try {
			this.activosfijosBeanSwingJInternalFrameAdditional=activosfijosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ActivosFijosLogic activosfijosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ActivosFijos activosfijosBean;
	public ActivosFijosConstantesFunciones activosfijosConstantesFunciones;
	//public ActivosFijosParameterReturnGeneral activosfijosReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<ActivosFijos> activosfijoss;	
	//public List<ActivosFijos> activosfijossEliminados;
	//public List<ActivosFijos> activosfijossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoActivosFijos=false;
	public Boolean isVisibilidadCeldaDuplicarActivosFijos=true;
	public Boolean isVisibilidadCeldaCopiarActivosFijos=true;
	public Boolean isVisibilidadCeldaVerFormActivosFijos=true;
	public Boolean isVisibilidadCeldaOrdenActivosFijos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesActivosFijos=false;
	public Boolean isVisibilidadCeldaModificarActivosFijos=false;
	public Boolean isVisibilidadCeldaActualizarActivosFijos=false;
	public Boolean isVisibilidadCeldaEliminarActivosFijos=false;
	public Boolean isVisibilidadCeldaCancelarActivosFijos=false;
	public Boolean isVisibilidadCeldaGuardarActivosFijos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosActivosFijos=false;	
	
	
	
	public Long getiIdNuevoActivosFijos() {
		return this.iIdNuevoActivosFijos;
	}

	public void setiIdNuevoActivosFijos(Long iIdNuevoActivosFijos) {
		this.iIdNuevoActivosFijos = iIdNuevoActivosFijos;
	}
	
	public Long getidActivosFijosActual() {
		return this.idActivosFijosActual;
	}

	public void setidActivosFijosActual(Long idActivosFijosActual) {
		this.idActivosFijosActual = idActivosFijosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ActivosFijos getactivosfijos() {
		return this.activosfijos;
	}

	public void setactivosfijos(ActivosFijos activosfijos) {
		this.activosfijos = activosfijos;
	}
	
	public ActivosFijos getactivosfijosAux() {
		return this.activosfijosAux;
	}

	public void setactivosfijosAux(ActivosFijos activosfijosAux) {
		this.activosfijosAux = activosfijosAux;
	}				
	
	public ActivosFijos getactivosfijosAnterior() {
		return this.activosfijosAnterior;
	}

	public void setactivosfijosAnterior(ActivosFijos activosfijosAnterior) {
		this.activosfijosAnterior = activosfijosAnterior;
	}	
	
	public ActivosFijos getactivosfijosTotales() {
		return this.activosfijosTotales;
	}

	public void setactivosfijosTotales(ActivosFijos activosfijosTotales) {
		this.activosfijosTotales = activosfijosTotales;
	}	
	
	public ActivosFijos getactivosfijosBean() {
		return this.activosfijosBean;
	}

	public void setactivosfijosBean(ActivosFijos activosfijosBean) {
		this.activosfijosBean = activosfijosBean;
	}	
	
	public ActivosFijosParameterReturnGeneral getactivosfijosReturnGeneral() {
		return this.activosfijosReturnGeneral;
	}

	public void setactivosfijosReturnGeneral(ActivosFijosParameterReturnGeneral activosfijosReturnGeneral) {
		this.activosfijosReturnGeneral = activosfijosReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ActivosFijosLogic getActivosFijosLogic()	{		
		return activosfijosLogic;
	}

	public void setActivosFijosLogic(ActivosFijosLogic activosfijosLogic) {
		this.activosfijosLogic = activosfijosLogic;
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
	
	public Boolean getIsEsNuevoActivosFijos() {
		return isEsNuevoActivosFijos;
	}

	public void setIsEsNuevoActivosFijos(Boolean isEsNuevoActivosFijos) {
		this.isEsNuevoActivosFijos = isEsNuevoActivosFijos;
	}

	public Boolean getEsParaAccionDesdeFormularioActivosFijos() {
		return esParaAccionDesdeFormularioActivosFijos;
	}
	
	public void setEsParaAccionDesdeFormularioActivosFijos(Boolean esParaAccionDesdeFormularioActivosFijos) {
		this.esParaAccionDesdeFormularioActivosFijos = esParaAccionDesdeFormularioActivosFijos;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesActivosFijos() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ActivosFijosConstantesFunciones.refrescarForeignKeysDescripcionesActivosFijos(this.activosfijosLogic.getActivosFijoss());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ActivosFijosConstantesFunciones.refrescarForeignKeysDescripcionesActivosFijos(this.activosfijoss);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//activosfijosLogic.setActivosFijoss(this.activosfijoss);
			activosfijosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ActivosFijosParameterReturnGeneral getActivosFijosParameterGeneral() {
		return this.activosfijosParameterGeneral;
	}
	
	public void setActivosFijosParameterGeneral(ActivosFijosParameterReturnGeneral activosfijosParameterGeneral) {
		this.activosfijosParameterGeneral = activosfijosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoActivosFijos() {
		return isPermisoTodoActivosFijos;
	}

	public void setIsPermisoTodoActivosFijos(Boolean isPermisoTodoActivosFijos) {
		this.isPermisoTodoActivosFijos = isPermisoTodoActivosFijos;
	}

	public Boolean getIsPermisoNuevoActivosFijos() {
		return isPermisoNuevoActivosFijos;
	}

	public void setIsPermisoNuevoActivosFijos(Boolean isPermisoNuevoActivosFijos) {
		this.isPermisoNuevoActivosFijos = isPermisoNuevoActivosFijos;
	}

	public Boolean getIsPermisoActualizarActivosFijos() {
		return isPermisoActualizarActivosFijos;
	}

	public void setIsPermisoActualizarActivosFijos(Boolean isPermisoActualizarActivosFijos) {
		this.isPermisoActualizarActivosFijos = isPermisoActualizarActivosFijos;
	}

	public Boolean getIsPermisoEliminarActivosFijos() {
		return isPermisoEliminarActivosFijos;
	}

	public void setIsPermisoEliminarActivosFijos(Boolean isPermisoEliminarActivosFijos) {
		this.isPermisoEliminarActivosFijos = isPermisoEliminarActivosFijos;
	}

	public Boolean getIsPermisoGuardarCambiosActivosFijos() {
		return isPermisoGuardarCambiosActivosFijos;
	}

	public void setIsPermisoGuardarCambiosActivosFijos(Boolean isPermisoGuardarCambiosActivosFijos) {
		this.isPermisoGuardarCambiosActivosFijos = isPermisoGuardarCambiosActivosFijos;
	}
	
	public Boolean getIsPermisoConsultaActivosFijos() {
		return isPermisoConsultaActivosFijos;
	}

	public void setIsPermisoConsultaActivosFijos(Boolean isPermisoConsultaActivosFijos) {
		this.isPermisoConsultaActivosFijos = isPermisoConsultaActivosFijos;
	}

	public Boolean getIsPermisoBusquedaActivosFijos() {
		return isPermisoBusquedaActivosFijos;
	}

	public void setIsPermisoBusquedaActivosFijos(Boolean isPermisoBusquedaActivosFijos) {
		this.isPermisoBusquedaActivosFijos = isPermisoBusquedaActivosFijos;
	}

	public Boolean getIsPermisoReporteActivosFijos() {
		return isPermisoReporteActivosFijos;
	}

	public void setIsPermisoReporteActivosFijos(Boolean isPermisoReporteActivosFijos) {
		this.isPermisoReporteActivosFijos = isPermisoReporteActivosFijos;
	}
	
	public Boolean getIsPermisoPaginacionMedioActivosFijos() {
		return isPermisoPaginacionMedioActivosFijos;
	}

	public void setIsPermisoPaginacionMedioActivosFijos(Boolean isPermisoPaginacionMedioActivosFijos) {
		this.isPermisoPaginacionMedioActivosFijos = isPermisoPaginacionMedioActivosFijos;
	}
	
	public Boolean getIsPermisoPaginacionTodoActivosFijos() {
		return isPermisoPaginacionTodoActivosFijos;
	}

	public void setIsPermisoPaginacionTodoActivosFijos(Boolean isPermisoPaginacionTodoActivosFijos) {
		this.isPermisoPaginacionTodoActivosFijos = isPermisoPaginacionTodoActivosFijos;
	}
	
	public Boolean getIsPermisoPaginacionAltoActivosFijos() {
		return isPermisoPaginacionAltoActivosFijos;
	}

	public void setIsPermisoPaginacionAltoActivosFijos(Boolean isPermisoPaginacionAltoActivosFijos) {
		this.isPermisoPaginacionAltoActivosFijos = isPermisoPaginacionAltoActivosFijos;
	}
	
	public Boolean getIsPermisoCopiarActivosFijos() {
		return isPermisoCopiarActivosFijos;
	}

	public void setIsPermisoCopiarActivosFijos(Boolean isPermisoCopiarActivosFijos) {
		this.isPermisoCopiarActivosFijos = isPermisoCopiarActivosFijos;
	}
	
	public Boolean getIsPermisoVerFormActivosFijos() {
		return isPermisoVerFormActivosFijos;
	}

	public void setIsPermisoVerFormActivosFijos(Boolean isPermisoVerFormActivosFijos) {
		this.isPermisoVerFormActivosFijos = isPermisoVerFormActivosFijos;
	}
	
	public Boolean getIsPermisoDuplicarActivosFijos() {
		return isPermisoDuplicarActivosFijos;
	}

	public void setIsPermisoDuplicarActivosFijos(Boolean isPermisoDuplicarActivosFijos) {
		this.isPermisoDuplicarActivosFijos = isPermisoDuplicarActivosFijos;
	}
	
	public Boolean getIsPermisoOrdenActivosFijos() {
		return isPermisoOrdenActivosFijos;
	}

	public void setIsPermisoOrdenActivosFijos(Boolean isPermisoOrdenActivosFijos) {
		this.isPermisoOrdenActivosFijos = isPermisoOrdenActivosFijos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoActivosFijos() {
		return isVisibilidadCeldaNuevoActivosFijos;
	}

	public void setIsVisibilidadCeldaNuevoActivosFijos(Boolean isVisibilidadCeldaNuevoActivosFijos) {
		this.isVisibilidadCeldaNuevoActivosFijos = isVisibilidadCeldaNuevoActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarActivosFijos() {
		return isVisibilidadCeldaDuplicarActivosFijos;
	}

	public void setIsVisibilidadCeldaDuplicarActivosFijos(Boolean isVisibilidadCeldaDuplicarActivosFijos) {
		this.isVisibilidadCeldaDuplicarActivosFijos = isVisibilidadCeldaDuplicarActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarActivosFijos() {
		return isVisibilidadCeldaCopiarActivosFijos;
	}

	public void setIsVisibilidadCeldaCopiarActivosFijos(Boolean isVisibilidadCeldaCopiarActivosFijos) {
		this.isVisibilidadCeldaCopiarActivosFijos = isVisibilidadCeldaCopiarActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormActivosFijos() {
		return isVisibilidadCeldaVerFormActivosFijos;
	}

	public void setIsVisibilidadCeldaVerFormActivosFijos(Boolean isVisibilidadCeldaVerFormActivosFijos) {
		this.isVisibilidadCeldaVerFormActivosFijos = isVisibilidadCeldaVerFormActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenActivosFijos() {
		return isVisibilidadCeldaOrdenActivosFijos;
	}

	public void setIsVisibilidadCeldaOrdenActivosFijos(Boolean isVisibilidadCeldaOrdenActivosFijos) {
		this.isVisibilidadCeldaOrdenActivosFijos = isVisibilidadCeldaOrdenActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesActivosFijos() {
		return isVisibilidadCeldaNuevoRelacionesActivosFijos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesActivosFijos(Boolean isVisibilidadCeldaNuevoRelacionesActivosFijos) {
		this.isVisibilidadCeldaNuevoRelacionesActivosFijos = isVisibilidadCeldaNuevoRelacionesActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarActivosFijos() {
		return isVisibilidadCeldaModificarActivosFijos;
	}

	public void setIsVisibilidadCeldaModificarActivosFijos(Boolean isVisibilidadCeldaModificarActivosFijos) {
		this.isVisibilidadCeldaModificarActivosFijos = isVisibilidadCeldaModificarActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarActivosFijos() {
		return isVisibilidadCeldaActualizarActivosFijos;
	}

	public void setIsVisibilidadCeldaActualizarActivosFijos(Boolean isVisibilidadCeldaActualizarActivosFijos) {
		this.isVisibilidadCeldaActualizarActivosFijos = isVisibilidadCeldaActualizarActivosFijos;
	}

	public Boolean getIsVisibilidadCeldaEliminarActivosFijos() {
		return isVisibilidadCeldaEliminarActivosFijos;
	}

	public void setIsVisibilidadCeldaEliminarActivosFijos(Boolean isVisibilidadCeldaEliminarActivosFijos) {
		this.isVisibilidadCeldaEliminarActivosFijos = isVisibilidadCeldaEliminarActivosFijos;
	}

	public Boolean getIsVisibilidadCeldaCancelarActivosFijos() {
		return isVisibilidadCeldaCancelarActivosFijos;
	}

	public void setIsVisibilidadCeldaCancelarActivosFijos(Boolean isVisibilidadCeldaCancelarActivosFijos) {
		this.isVisibilidadCeldaCancelarActivosFijos = isVisibilidadCeldaCancelarActivosFijos;
	}

	public Boolean getIsVisibilidadCeldaGuardarActivosFijos() {
		return isVisibilidadCeldaGuardarActivosFijos;
	}

	public void setIsVisibilidadCeldaGuardarActivosFijos(Boolean isVisibilidadCeldaGuardarActivosFijos) {
		this.isVisibilidadCeldaGuardarActivosFijos = isVisibilidadCeldaGuardarActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosActivosFijos() {
		return isVisibilidadCeldaGuardarCambiosActivosFijos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosActivosFijos(Boolean isVisibilidadCeldaGuardarCambiosActivosFijos) {
		this.isVisibilidadCeldaGuardarCambiosActivosFijos = isVisibilidadCeldaGuardarCambiosActivosFijos;
	}
		
	public ActivosFijosSessionBean getactivosfijosSessionBean() {
		return this.activosfijosSessionBean;
	}
	
	public void setactivosfijosSessionBean(ActivosFijosSessionBean activosfijosSessionBean) {
		this.activosfijosSessionBean=activosfijosSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysActivosFijos(ActivosFijos activosfijos)throws Exception {
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
	
	public void bugActualizarReferenciaActual(ActivosFijos activosfijos,ActivosFijos activosfijosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalActivosFijos(activosfijos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		activosfijosAux.setId(activosfijos.getId());
		activosfijosAux.setVersionRow(activosfijos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessActivosFijos();
		
			int intSelectedRow = this.jTableDatosActivosFijos.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijos =(ActivosFijos) this.activosfijosLogic.getActivosFijoss().toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.activosfijos =(ActivosFijos) this.activosfijoss.toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualActivosFijos(this.activosfijos,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysActivosFijos(this.activosfijos);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = activosfijosValidator.getInvalidValues(this.activosfijos);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			activosfijosLogic.setDatosCliente(datosCliente);
			activosfijosLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				activosfijosAux=new  ActivosFijos();
				
				activosfijosAux.setIsNew(true);
				activosfijosAux.setIsChanged(true);
				
				activosfijosAux.setActivosFijosOriginal(this.activosfijos);
				
				activosfijosAux.setId(this.activosfijos.getId());	
				activosfijosAux.setVersionRow(this.activosfijos.getVersionRow());	
				activosfijosAux.setcodigo(this.activosfijos.getcodigo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.activosfijosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.activosfijosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(activosfijosAux,activosfijosLogic.getActivosFijoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(activosfijosAux,activosfijoss);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.activosfijosSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.activosfijosSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						activosfijosLogic.saveActivosFijoss();//WithConnection
						//activosfijosLogic.getSetVersionRowActivosFijoss();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.activosfijos,activosfijosAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.activosfijosSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.activosfijosSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								activosfijosLogic.saveActivosFijosRelaciones(activosfijosAux);//WithConnection
								//activosfijosLogic.getSetVersionRowActivosFijoss();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.activosfijos,activosfijosAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.activosfijosSessionBean.getEstaModoGuardarRelaciones() 
									|| this.activosfijosSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(activosfijosAux,activosfijosLogic.getActivosFijoss());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(activosfijosAux,activosfijoss);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.activosfijos,activosfijosAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				activosfijosAux=new  ActivosFijos();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.activosfijosSessionBean.getEsGuardarRelacionado() 
					|| (this.activosfijosSessionBean.getEsGuardarRelacionado() && this.activosfijos.getId()>=0)) {
						
					activosfijosAux.setIsNew(false);
				}
				
				activosfijosAux.setIsDeleted(false);
			
				activosfijosAux.setId(this.activosfijos.getId());	
				activosfijosAux.setVersionRow(this.activosfijos.getVersionRow());	
				activosfijosAux.setcodigo(this.activosfijos.getcodigo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(activosfijosAux,activosfijosLogic.getActivosFijoss());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(activosfijosAux,activosfijoss);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.activosfijosSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.activosfijosSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						activosfijosLogic.saveActivosFijoss();//WithConnection
						//activosfijosLogic.getSetVersionRowActivosFijoss();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.activosfijos,activosfijosAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.activosfijosSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.activosfijosSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								activosfijosLogic.saveActivosFijosRelaciones(activosfijosAux);//WithConnection
								//activosfijosLogic.getSetVersionRowActivosFijoss();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.activosfijos,activosfijosAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.activosfijosSessionBean.getEstaModoGuardarRelaciones() 
									|| this.activosfijosSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(activosfijosAux,activosfijosLogic.getActivosFijoss());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(activosfijosAux,activosfijoss);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.activosfijos,activosfijosAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				activosfijosAux=new  ActivosFijos();
				
				activosfijosAux.setIsNew(false);
				activosfijosAux.setIsChanged(false);
				
				activosfijosAux.setIsDeleted(true);
				
				activosfijosAux.setId(this.activosfijos.getId());	
				activosfijosAux.setVersionRow(this.activosfijos.getVersionRow());	
				activosfijosAux.setcodigo(this.activosfijos.getcodigo());	
				
				if(this.activosfijosSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.activosfijosAux.getId()>=0) {	
						this.activosfijossEliminados.add(activosfijosAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(activosfijosAux,activosfijosLogic.getActivosFijoss());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(activosfijosAux,activosfijoss);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.activosfijosSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.activosfijosSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						activosfijosLogic.saveActivosFijoss();//WithConnection
						//activosfijosLogic.getSetVersionRowActivosFijoss();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.activosfijosSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.activosfijosSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								activosfijosLogic.saveActivosFijosRelaciones(activosfijosAux);//WithConnection
								//activosfijosLogic.getSetVersionRowActivosFijoss();//WithConnection
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
							if(this.activosfijosSessionBean.getEstaModoGuardarRelaciones() 
								|| this.activosfijosSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(activosfijosAux,activosfijosLogic.getActivosFijoss());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(activosfijosAux,activosfijoss);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosLogic.getActivosFijoss().addAll(this.activosfijossEliminados);
					
					activosfijosLogic.saveActivosFijoss();//WithConnection
					//activosfijosLogic.getSetVersionRowActivosFijoss();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.activosfijossEliminados= new ArrayList<ActivosFijos>();		
			}
			
			if(this.activosfijosSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Activos Fijos GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.activosfijos=activosfijosAux;
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
      		//this.finishProcessActivosFijos();
      	}
		
	}	
	
	public void actualizarRelaciones(ActivosFijos activosfijosLocal) throws Exception {
		
		if(this.activosfijosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ActivosFijos activosfijosLocal) throws Exception {	
		if(this.activosfijosSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarActivosFijosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosActivosFijos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.activosfijos =(ActivosFijos) this.activosfijosLogic.getActivosFijoss().toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.activosfijos =(ActivosFijos) this.activosfijoss.toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = activosfijosValidator.getInvalidValues(this.activosfijos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ActivosFijos activosfijos,List<ActivosFijos> activosfijoss) throws Exception {
		try	{		
			ActivosFijosConstantesFunciones.actualizarLista(activosfijos,activosfijoss,this.activosfijosSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ActivosFijos activosfijos,List<ActivosFijos> activosfijoss) throws Exception {
		try	{			
			ActivosFijosConstantesFunciones.actualizarSelectedLista(activosfijos,activosfijoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ActivosFijos> activosfijossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				activosfijossLocal=this.activosfijosLogic.getActivosFijoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				activosfijossLocal=this.activosfijoss;
			}
			//ARCHITECTURE
		
			for(ActivosFijos activosfijosLocal:activosfijossLocal) {
				if(this.permiteMantenimiento(activosfijosLocal) && activosfijosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ActivosFijosConstantesFunciones.getActivosFijosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ActivosFijosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijos.jLabelcodigoActivosFijos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormActivosFijos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijos.jLabelcodigoActivosFijos,"");
		
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
		this.iIdNuevoActivosFijos--;	
		
		
		this.activosfijosAux=new ActivosFijos();
		
		this.activosfijosAux.setId(this.iIdNuevoActivosFijos);
		this.activosfijosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.activosfijosLogic.getActivosFijoss().add(this.activosfijosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.activosfijoss.add(this.activosfijosAux);
		}
		//ARCHITECTURE
		
		this.activosfijos=this.activosfijosAux;
		
		if(ActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioActivosFijos(this.activosfijos);
			this.setVariablesObjetoActualToFormularioForeignKeyActivosFijos(this.activosfijos);
		}
				
		//this.setDefaultControlesActivosFijos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyActivosFijos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyActivosFijos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyActivosFijos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualActivosFijos(this.activosfijosBean,this.activosfijos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysActivosFijos(this.activosfijos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanActivosFijos(this.activosfijosReturnGeneral,this.activosfijosBean,false);
		
		if(this.activosfijosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyActivosFijos(this.activosfijosReturnGeneral.getActivosFijos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioActivosFijos(this.activosfijosReturnGeneral.getActivosFijos());
		}
		
		if(this.activosfijosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioActivosFijos(this.activosfijosReturnGeneral.getActivosFijos(),classes);//this.activosfijosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualActivosFijos(this.activosfijos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyActivosFijos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyActivosFijos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ActivosFijosBeanSwingJInternalFrameAdditional.RecargarFormActivosFijos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingActivosFijos(false);
						
			if(activosfijosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ActivosFijosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualActivosFijos();
			}
			
			this.actualizarVisualTableDatosActivosFijos();
			
			this.jTableDatosActivosFijos.setRowSelectionInterval(this.getIndiceNuevoActivosFijos(), this.getIndiceNuevoActivosFijos());
			
			this.seleccionarFilaTablaActivosFijosActual();
						
			this.actualizarEstadoCeldasBotonesActivosFijos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesActivosFijos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormActivosFijos.jTextFieldcodigoActivosFijos.setEnabled(isHabilitar && this.activosfijosConstantesFunciones.activarcodigoActivosFijos);	
		
	};
	
	public void setDefaultControlesActivosFijos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoActivosFijos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.activosfijosSessionBean.setConGuardarRelaciones(true);			
			this.activosfijosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormActivosFijos.jTabbedPaneRelacionesActivosFijos.setVisible(true);
			
					
		} else {
			//this.activosfijosSessionBean.setConGuardarRelaciones(false);			
			this.activosfijosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormActivosFijos.jTabbedPaneRelacionesActivosFijos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoActivosFijos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ActivosFijos activosfijosAux:this.activosfijosLogic.getActivosFijoss()) {
				if(activosfijosAux.getId().equals(this.iIdNuevoActivosFijos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ActivosFijos activosfijosAux:this.activosfijoss) {
				if(activosfijosAux.getId().equals(this.iIdNuevoActivosFijos)) {
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
	
	public int getIndiceActualActivosFijos(ActivosFijos activosfijos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ActivosFijos activosfijosAux:this.activosfijosLogic.getActivosFijoss()) {
				if(activosfijosAux.getId().equals(activosfijos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ActivosFijos activosfijosAux:this.activosfijoss) {
				if(activosfijosAux.getId().equals(activosfijos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalActivosFijos(ActivosFijos activosfijosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ActivosFijos activosfijosAux:this.activosfijosLogic.getActivosFijoss()) {
				if(activosfijosAux.getActivosFijosOriginal().getId().equals(activosfijosOriginal.getId())) {
					existe=true;
					activosfijosOriginal.setId(activosfijosAux.getId());
					activosfijosOriginal.setVersionRow(activosfijosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ActivosFijos activosfijosAux:this.activosfijoss) {
				if(activosfijosAux.getActivosFijosOriginal().getId().equals(activosfijosOriginal.getId())) {
					existe=true;
					activosfijosOriginal.setId(activosfijosAux.getId());
					activosfijosOriginal.setVersionRow(activosfijosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosActivosFijos(Boolean esParaCancelar) throws Exception {
		activosfijossAux=new ArrayList<ActivosFijos>();
		activosfijosAux=new ActivosFijos();
		
		if(!this.activosfijosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ActivosFijos activosfijosAux:this.activosfijosLogic.getActivosFijoss()) {
					if(activosfijosAux.getId()<0) {
						activosfijossAux.add(activosfijosAux);
					}		
				}
				this.iIdNuevoActivosFijos=0L;
				this.activosfijosLogic.getActivosFijoss().removeAll(activosfijossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ActivosFijos activosfijosAux:this.activosfijoss) {
					if(activosfijosAux.getId()<0) {
						activosfijossAux.add(activosfijosAux);
					}		
				}
				this.iIdNuevoActivosFijos=0L;
				this.activosfijoss.removeAll(activosfijossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoActivosFijos 
					&& this.activosfijosLogic.getActivosFijoss().size()>0
					) {
					activosfijosAux=this.activosfijosLogic.getActivosFijoss().get(this.activosfijosLogic.getActivosFijoss().size() - 1);
				
					if(activosfijosAux.getId()<0) {
						this.activosfijosLogic.getActivosFijoss().remove(activosfijosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoActivosFijos && this.activosfijoss.size()>0) {
					activosfijosAux=this.activosfijoss.get(this.activosfijoss.size() - 1);
				
					if(activosfijosAux.getId()<0) {
						this.activosfijoss.remove(activosfijosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoActivosFijos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(activosfijos.getId()<0) {
				this.activosfijosLogic.getActivosFijoss().remove(this.activosfijos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(activosfijos.getId()<0) {
				this.activosfijoss.remove(this.activosfijos);
			}
		}			
	}
	
	public void setEstadosInicialesActivosFijos(List<ActivosFijos> activosfijossAux) throws Exception {
		ActivosFijosConstantesFunciones.setEstadosInicialesActivosFijos(activosfijossAux);
	}
	
	public void setEstadosInicialesActivosFijos(ActivosFijos activosfijosAux) throws Exception {
		ActivosFijosConstantesFunciones.setEstadosInicialesActivosFijos(activosfijosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarActivosFijosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesActivosFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarActivosFijosActual()) {
				if(!this.isEsNuevoActivosFijos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesActivosFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoActivosFijos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarActivosFijosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Activos Fijos ?", "MANTENIMIENTO DE Activos Fijos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesActivosFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ActivosFijos activosfijos) throws Exception {
		ActivosFijosConstantesFunciones.seleccionarAsignar(this.activosfijos,activosfijos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarActivosFijos=this.isPermisoActualizarOriginalActivosFijos;
			
			
			this.seleccionarAsignar(activosfijos);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ActivosFijosConstantesFunciones.quitarEspaciosActivosFijos(this.activosfijos,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesActivosFijos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.activosfijosSessionBean.setsFuncionBusquedaRapida(this.activosfijosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoActivosFijos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosActivosFijos(esParaCancelar);				
				this.cancelarNuevoActivosFijos(esParaCancelar);								
			}
			
			this.activosfijos=new ActivosFijos();
			
			this.inicializarActivosFijos();
			
			this.actualizarEstadoCeldasBotonesActivosFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarActivosFijos() throws Exception {
		try {
			ActivosFijosConstantesFunciones.inicializarActivosFijos(this.activosfijos);
			
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
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.activosfijosLogic.getActivosFijoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteActivosFijoss(String sAccionBusqueda,List<ActivosFijos> activosfijossParaReportes) throws Exception {
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
					sPathReporteFinal="ActivosFijos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ActivosFijosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ActivosFijosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ActivosFijos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Activos Fijoses");		
		parameters.put("busquedapor", ActivosFijosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceActivosFijos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ActivosFijosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ActivosFijosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceActivosFijos=new JRBeanArrayDataSource(ActivosFijosJInternalFrame.TraerActivosFijosBeans(activosfijossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceActivosFijos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ActivosFijosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ActivosFijosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ActivosFijosBean.TraerActivosFijosBeans(activosfijossParaReportes).toArray()));
							
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
				this.generarExcelReporteActivosFijoss(sAccionBusqueda,sTipoArchivoReporte,activosfijossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalActivosFijoss(sAccionBusqueda,sTipoArchivoReporte,activosfijossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoActivosFijosActionPerformed(null);
					//this.generarExcelReporteActivosFijoss(sAccionBusqueda,sTipoArchivoReporte,activosfijossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalActivosFijoss(sAccionBusqueda,sTipoArchivoReporte,activosfijossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesActivosFijoss(sAccionBusqueda,sTipoArchivoReporte,activosfijossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesActivosFijoss(sAccionBusqueda,sTipoArchivoReporte,activosfijossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteActivosFijoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ActivosFijos> activosfijossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"activosfijos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ActivosFijoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderActivosFijos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ActivosFijos activosfijos : activosfijossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ActivosFijosConstantesFunciones.generarExcelReporteDataActivosFijos("NORMAL",row,workbook,activosfijos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderActivosFijos(String sTipo,Row row,Workbook workbook) {
		
		ActivosFijosConstantesFunciones.generarExcelReporteHeaderActivosFijos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalActivosFijoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ActivosFijos> activosfijossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"activosfijos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ActivosFijoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ActivosFijos activosfijos : activosfijossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ActivosFijosConstantesFunciones.getActivosFijosDescripcion(activosfijos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijos.getcodigo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesActivosFijoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ActivosFijos> activosfijossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ActivosFijos> activosfijossRespaldo=null;
		
		classes=ActivosFijosConstantesFunciones.getClassesRelationshipsOfActivosFijos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.activosfijosLogic.setDatosCliente(this.datosCliente);
		this.activosfijosLogic.setDatosDeep(this.datosDeep);
		this.activosfijosLogic.setIsConDeep(true);
		
		activosfijossRespaldo=this.activosfijosLogic.getActivosFijoss();
		
		this.activosfijosLogic.setActivosFijoss(activosfijossParaReportes);	
		this.activosfijosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		activosfijossParaReportes=this.activosfijosLogic.getActivosFijoss();
		this.activosfijosLogic.setActivosFijoss(activosfijossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"activosfijos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ActivosFijoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderActivosFijos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ActivosFijos activosfijos : activosfijossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderActivosFijos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ActivosFijosConstantesFunciones.generarExcelReporteDataActivosFijos("NORMAL",row,workbook,activosfijos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ActivosFijosConstantesFunciones.getActivosFijosDescripcion(activosfijos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoActivosFijos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoActivosFijos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoActivosFijos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoActivosFijos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessActivosFijos() throws Exception {		
		this.startProcessActivosFijos(true);
	}
	
	public void startProcessActivosFijos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesActivosFijos, this.jScrollPanelDatosActivosFijos,this.jPanelPaginacionActivosFijos, this.jScrollPanelDatosEdicionActivosFijos, this.jPanelAccionesActivosFijos,this.jPanelAccionesFormularioActivosFijos,this.jmenuBarActivosFijos,this.jmenuBarDetalleActivosFijos,this.jTtoolBarActivosFijos,this.jTtoolBarDetalleActivosFijos);		
		
		final JTabbedPane jTabbedPaneBusquedasActivosFijos=null; 
		
		final JPanel jPanelParametrosReportesActivosFijos=this.jPanelParametrosReportesActivosFijos;
		//final JScrollPane jScrollPanelDatosActivosFijos=this.jScrollPanelDatosActivosFijos;
		final JTable jTableDatosActivosFijos=this.jTableDatosActivosFijos;		
		final JPanel jPanelPaginacionActivosFijos=this.jPanelPaginacionActivosFijos;
		//final JScrollPane jScrollPanelDatosEdicionActivosFijos=this.jScrollPanelDatosEdicionActivosFijos;
		final JPanel jPanelAccionesActivosFijos=this.jPanelAccionesActivosFijos;
		
		JPanel jPanelCamposAuxiliarActivosFijos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarActivosFijos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormActivosFijos!=null) {
			jPanelCamposAuxiliarActivosFijos=this.jInternalFrameDetalleFormActivosFijos.jPanelCamposActivosFijos;
			jPanelAccionesFormularioAuxiliarActivosFijos=this.jInternalFrameDetalleFormActivosFijos.jPanelAccionesFormularioActivosFijos;
		}
		
		final JPanel jPanelCamposActivosFijos=jPanelCamposAuxiliarActivosFijos;
		final JPanel jPanelAccionesFormularioActivosFijos=jPanelAccionesFormularioAuxiliarActivosFijos;
		
		
		final JMenuBar jmenuBarActivosFijos=this.jmenuBarActivosFijos;
		final JToolBar jTtoolBarActivosFijos=this.jTtoolBarActivosFijos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarActivosFijos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarActivosFijos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormActivosFijos!=null) {
			jmenuBarDetalleAuxiliarActivosFijos=this.jInternalFrameDetalleFormActivosFijos.jmenuBarDetalleActivosFijos;
			jTtoolBarDetalleAuxiliarActivosFijos=this.jInternalFrameDetalleFormActivosFijos.jTtoolBarDetalleActivosFijos;
		}
		
		final JMenuBar jmenuBarDetalleActivosFijos=jmenuBarDetalleAuxiliarActivosFijos;
		final JToolBar jTtoolBarDetalleActivosFijos=jTtoolBarDetalleAuxiliarActivosFijos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasActivosFijos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesActivosFijos;
			processRunnable.jTableDatos=jTableDatosActivosFijos;
			processRunnable.jPanelCampos=jPanelCamposActivosFijos;
			processRunnable.jPanelPaginacion=jPanelPaginacionActivosFijos;
			processRunnable.jPanelAcciones=jPanelAccionesActivosFijos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioActivosFijos;
			
			
			processRunnable.jmenuBar=jmenuBarActivosFijos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleActivosFijos;
			processRunnable.jTtoolBar=jTtoolBarActivosFijos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleActivosFijos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasActivosFijos ,jPanelParametrosReportesActivosFijos,jTableDatosActivosFijos, /*jScrollPanelDatosActivosFijos,*/jPanelCamposActivosFijos,jPanelPaginacionActivosFijos, /*jScrollPanelDatosEdicionActivosFijos,*/ jPanelAccionesActivosFijos,jPanelAccionesFormularioActivosFijos,jmenuBarActivosFijos,jmenuBarDetalleActivosFijos,jTtoolBarActivosFijos,jTtoolBarDetalleActivosFijos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesActivosFijos, jScrollPanelDatosActivosFijos,jPanelPaginacionActivosFijos, jScrollPanelDatosEdicionActivosFijos, jPanelAccionesActivosFijos,jPanelAccionesFormularioActivosFijos,jmenuBarActivosFijos,jmenuBarDetalleActivosFijos,jTtoolBarActivosFijos,jTtoolBarDetalleActivosFijos);
						
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
	
	public void finishProcessActivosFijos() {// throws Exception 
		this.finishProcessActivosFijos(true);
	}
	
	public void finishProcessActivosFijos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesActivosFijos, this.jScrollPanelDatosActivosFijos,this.jPanelPaginacionActivosFijos, this.jScrollPanelDatosEdicionActivosFijos, this.jPanelAccionesActivosFijos,this.jPanelAccionesFormularioActivosFijos,this.jmenuBarActivosFijos,this.jmenuBarDetalleActivosFijos,this.jTtoolBarActivosFijos,this.jTtoolBarDetalleActivosFijos);		
		
		final JTabbedPane jTabbedPaneBusquedasActivosFijos=null; 
		
		final JPanel jPanelParametrosReportesActivosFijos=this.jPanelParametrosReportesActivosFijos;
		//final JScrollPane jScrollPanelDatosActivosFijos=this.jScrollPanelDatosActivosFijos;
		final JTable jTableDatosActivosFijos=this.jTableDatosActivosFijos;		
		final JPanel jPanelPaginacionActivosFijos=this.jPanelPaginacionActivosFijos;
		//final JScrollPane jScrollPanelDatosEdicionActivosFijos=this.jScrollPanelDatosEdicionActivosFijos;
		final JPanel jPanelAccionesActivosFijos=this.jPanelAccionesActivosFijos;
		
		JPanel jPanelCamposAuxiliarActivosFijos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarActivosFijos=new JPanel();
		
		if(this.jInternalFrameDetalleFormActivosFijos!=null) {
			jPanelCamposAuxiliarActivosFijos=this.jInternalFrameDetalleFormActivosFijos.jPanelCamposActivosFijos;
			jPanelAccionesFormularioAuxiliarActivosFijos=this.jInternalFrameDetalleFormActivosFijos.jPanelAccionesFormularioActivosFijos;
		}
		
		final JPanel jPanelCamposActivosFijos=jPanelCamposAuxiliarActivosFijos;
		final JPanel jPanelAccionesFormularioActivosFijos=jPanelAccionesFormularioAuxiliarActivosFijos;
		
		
		final JMenuBar jmenuBarActivosFijos=this.jmenuBarActivosFijos;		
		final JToolBar jTtoolBarActivosFijos=this.jTtoolBarActivosFijos;
				
		JMenuBar jmenuBarDetalleAuxiliarActivosFijos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarActivosFijos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormActivosFijos!=null) {
			jmenuBarDetalleAuxiliarActivosFijos=this.jInternalFrameDetalleFormActivosFijos.jmenuBarDetalleActivosFijos;
			jTtoolBarDetalleAuxiliarActivosFijos=this.jInternalFrameDetalleFormActivosFijos.jTtoolBarDetalleActivosFijos;		
		}
		
		final JMenuBar jmenuBarDetalleActivosFijos=jmenuBarDetalleAuxiliarActivosFijos;
		final JToolBar jTtoolBarDetalleActivosFijos=jTtoolBarDetalleAuxiliarActivosFijos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasActivosFijos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesActivosFijos;
			processRunnable.jTableDatos=jTableDatosActivosFijos;
			processRunnable.jPanelCampos=jPanelCamposActivosFijos;
			processRunnable.jPanelPaginacion=jPanelPaginacionActivosFijos;
			processRunnable.jPanelAcciones=jPanelAccionesActivosFijos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioActivosFijos;
			
			
			processRunnable.jmenuBar=jmenuBarActivosFijos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleActivosFijos;
			processRunnable.jTtoolBar=jTtoolBarActivosFijos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleActivosFijos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasActivosFijos ,jPanelParametrosReportesActivosFijos, jTableDatosActivosFijos,/*jScrollPanelDatosActivosFijos,*/jPanelCamposActivosFijos,jPanelPaginacionActivosFijos, /*jScrollPanelDatosEdicionActivosFijos,*/ jPanelAccionesActivosFijos,jPanelAccionesFormularioActivosFijos,jmenuBarActivosFijos,jmenuBarDetalleActivosFijos,jTtoolBarActivosFijos,jTtoolBarDetalleActivosFijos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesActivosFijos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarActivosFijos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuActivosFijos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarActivosFijos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarActivosFijos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleActivosFijos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuActivosFijos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarActivosFijos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleActivosFijos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.activosfijosConstantesFunciones.getsFinalQueryActivosFijos();
		String  finalQueryPaginacionTodos=this.activosfijosConstantesFunciones.getsFinalQueryActivosFijos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ActivosFijosConstantesFunciones.getArrayColumnasGlobalesNoActivosFijos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ActivosFijosConstantesFunciones.getArrayColumnasGlobalesActivosFijos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ActivosFijosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.activosfijossEliminados= new ArrayList<ActivosFijos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessActivosFijos();
		
				///*ActivosFijosSessionBean*/this.activosfijosSessionBean=new ActivosFijosSessionBean();
			
			if(this.activosfijosSessionBean==null) {
				this.activosfijosSessionBean=new ActivosFijosSessionBean();
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
					this.iNumeroPaginacion=ActivosFijosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ActivosFijosConstantesFunciones.getClassesForeignKeysOfActivosFijos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/activosfijos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			activosfijossAux= new ArrayList<ActivosFijos>();
			
				
			activosfijosLogic.setDatosCliente(this.datosCliente);
			activosfijosLogic.setDatosDeep(this.datosDeep);
			activosfijosLogic.setIsConDeep(true);
			
			
			activosfijosLogic.getActivosFijosDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					activosfijosLogic.getTodosActivosFijoss(finalQueryGlobal,pagination);
					
					//activosfijosLogic.getTodosActivosFijossWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(activosfijosLogic.getActivosFijoss()==null|| activosfijosLogic.getActivosFijoss().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							activosfijossAux= new ArrayList<ActivosFijos>();
							activosfijossAux.addAll(activosfijosLogic.getActivosFijoss());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							activosfijossAux= new ArrayList<ActivosFijos>();
							activosfijossAux.addAll(activosfijoss);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							activosfijosLogic.getTodosActivosFijoss(finalQueryGlobal+"",this.pagination);												
							
							//activosfijosLogic.getTodosActivosFijossWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteActivosFijoss("Todos",activosfijosLogic.getActivosFijoss() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							activosfijosLogic.setActivosFijoss(new ArrayList<ActivosFijos>());					
							activosfijosLogic.getActivosFijoss().addAll(activosfijossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							activosfijoss=new ArrayList<ActivosFijos>();
							activosfijoss.addAll(activosfijossAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idActivosFijos=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idActivosFijos=this.idActual;
				
				} else if(this.idActivosFijosActual!=null && this.idActivosFijosActual!=0L) {
					idActivosFijos=idActivosFijosActual;
				}
				
					
				this.sDetalleReporte=ActivosFijosConstantesFunciones.getDetalleIndicePorId(idActivosFijos);
				
				this.activosfijoss=new ArrayList<ActivosFijos>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					activosfijosLogic.getEntity(idActivosFijos);
					
					//activosfijosLogic.getEntityWithConnection(idActivosFijos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					activosfijosLogic.setActivosFijoss(new ArrayList<ActivosFijos>());
					activosfijosLogic.getActivosFijoss().add(activosfijosLogic.getActivosFijos());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.activosfijoss=new ArrayList<ActivosFijos>();
					this.activosfijoss.add(activosfijos);
				}
				
				if(activosfijosLogic.getActivosFijos()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesActivosFijos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessActivosFijos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=activosfijosLogic.getActivosFijoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=activosfijoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=activosfijosLogic.getActivosFijoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=activosfijoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ActivosFijos activosfijos) {
		Boolean permite=true;
		
		if(this.activosfijos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ActivosFijosConstantesFunciones.getOrderByListaActivosFijos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ActivosFijosConstantesFunciones.getOrderByListaActivosFijos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ActivosFijos activosfijos:activosfijosLogic.getActivosFijoss()) {
				if(activosfijos.getsType().equals(Constantes2.S_TOTALES)) {
					activosfijosTotales=activosfijos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ActivosFijos activosfijos:this.activosfijoss) {
				if(activosfijos.getsType().equals(Constantes2.S_TOTALES)) {
					activosfijosTotales=activosfijos;
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
			this.activosfijosAux=new ActivosFijos();
			this.activosfijosAux.setsType(Constantes2.S_TOTALES);
			this.activosfijosAux.setIsNew(false);
			this.activosfijosAux.setIsChanged(false);
			this.activosfijosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ActivosFijosConstantesFunciones.TotalizarValoresFilaActivosFijos(this.activosfijosLogic.getActivosFijoss(),this.activosfijosAux);
				
				this.activosfijosLogic.getActivosFijoss().add(this.activosfijosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ActivosFijosConstantesFunciones.TotalizarValoresFilaActivosFijos(this.activosfijoss,this.activosfijosAux);
				
				this.activosfijoss.add(this.activosfijosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		activosfijosTotales=new ActivosFijos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.activosfijosLogic.getActivosFijoss().remove(activosfijosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.activosfijoss.remove(activosfijosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		activosfijosTotales=new ActivosFijos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ActivosFijos activosfijos:activosfijosLogic.getActivosFijoss()) {
				if(activosfijos.getsType().equals(Constantes2.S_TOTALES)) {
					activosfijosTotales=activosfijos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ActivosFijosConstantesFunciones.TotalizarValoresFilaActivosFijos(this.activosfijosLogic.getActivosFijoss(),activosfijosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ActivosFijos activosfijos:this.activosfijoss) {
				if(activosfijos.getsType().equals(Constantes2.S_TOTALES)) {
					activosfijosTotales=activosfijos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ActivosFijosConstantesFunciones.TotalizarValoresFilaActivosFijos(this.activosfijoss,activosfijosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosActivosFijos() {
		this.isPermisoTodoActivosFijos=false;
		this.isPermisoNuevoActivosFijos=false;
		this.isPermisoActualizarActivosFijos=false;
		this.isPermisoActualizarOriginalActivosFijos=false;
		this.isPermisoEliminarActivosFijos=false;
		this.isPermisoGuardarCambiosActivosFijos=false;
		this.isPermisoConsultaActivosFijos=false;
		this.isPermisoBusquedaActivosFijos=false;
		this.isPermisoReporteActivosFijos=false;		
		this.isPermisoOrdenActivosFijos=false;		
		this.isPermisoPaginacionMedioActivosFijos=false;		
		this.isPermisoPaginacionAltoActivosFijos=false;
		this.isPermisoPaginacionTodoActivosFijos=false;
		this.isPermisoCopiarActivosFijos=false;		
		this.isPermisoVerFormActivosFijos=false;		
		this.isPermisoDuplicarActivosFijos=false;		
		this.isPermisoOrdenActivosFijos=false;		
	}
	
	public void setPermisosUsuarioActivosFijos(Boolean isPermiso) {
		this.isPermisoTodoActivosFijos=isPermiso;
		this.isPermisoNuevoActivosFijos=isPermiso;
		this.isPermisoActualizarActivosFijos=isPermiso;
		this.isPermisoActualizarOriginalActivosFijos=isPermiso;
		this.isPermisoEliminarActivosFijos=isPermiso;
		this.isPermisoGuardarCambiosActivosFijos=isPermiso;
		this.isPermisoConsultaActivosFijos=isPermiso;
		this.isPermisoBusquedaActivosFijos=isPermiso;
		this.isPermisoReporteActivosFijos=isPermiso;
		this.isPermisoOrdenActivosFijos=isPermiso;		
		this.isPermisoPaginacionMedioActivosFijos=isPermiso;		
		this.isPermisoPaginacionAltoActivosFijos=isPermiso;		
		this.isPermisoPaginacionTodoActivosFijos=isPermiso;		
		this.isPermisoCopiarActivosFijos=isPermiso;		
		this.isPermisoVerFormActivosFijos=isPermiso;		
		this.isPermisoDuplicarActivosFijos=isPermiso;
		this.isPermisoOrdenActivosFijos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioActivosFijos(Boolean isPermiso) {
		//this.isPermisoTodoActivosFijos=isPermiso;
		this.isPermisoNuevoActivosFijos=isPermiso;
		this.isPermisoActualizarActivosFijos=isPermiso;
		this.isPermisoActualizarOriginalActivosFijos=isPermiso;
		this.isPermisoEliminarActivosFijos=isPermiso;
		this.isPermisoGuardarCambiosActivosFijos=isPermiso;
		//this.isPermisoConsultaActivosFijos=isPermiso;
		//this.isPermisoBusquedaActivosFijos=isPermiso;
		//this.isPermisoReporteActivosFijos=isPermiso;
		//this.isPermisoOrdenActivosFijos=isPermiso;		
		//this.isPermisoPaginacionMedioActivosFijos=isPermiso;		
		//this.isPermisoPaginacionAltoActivosFijos=isPermiso;		
		//this.isPermisoPaginacionTodoActivosFijos=isPermiso;		
		//this.isPermisoCopiarActivosFijos=isPermiso;		
		//this.isPermisoDuplicarActivosFijos=isPermiso;
		//this.isPermisoOrdenActivosFijos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioActivosFijosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ActivosFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebActivosFijos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioActivosFijosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioActivosFijosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionActivosFijosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioActivosFijosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioActivosFijos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ActivosFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.activosfijosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ActivosFijosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoActivosFijos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarActivosFijos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalActivosFijos=this.isPermisoActualizarActivosFijos;
			this.isPermisoEliminarActivosFijos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosActivosFijos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaActivosFijos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaActivosFijos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoActivosFijos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteActivosFijos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenActivosFijos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioActivosFijos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoActivosFijos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoActivosFijos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarActivosFijos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormActivosFijos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarActivosFijos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenActivosFijos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.activosfijosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosActivosFijos.setToolTipText(this.jTableDatosActivosFijos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioActivosFijos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioActivosFijos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ActivosFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ActivosFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioActivosFijos() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyActivosFijosListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyActivosFijosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ActivosFijosJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyActivosFijosListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyActivosFijosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyActivosFijos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyActivosFijos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyActivosFijos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyActivosFijos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyActivosFijos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyActivosFijos(ActivosFijos activosfijos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyActivosFijos(ActivosFijos activosfijos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyActivosFijos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyActivosFijos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyActivosFijos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyActivosFijos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroActivosFijos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyActivosFijos()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyActivosFijos(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyActivosFijos()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public ActivosFijosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ActivosFijosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ActivosFijosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.activosfijosSessionBean=new ActivosFijosSessionBean(); 
		this.activosfijosConstantesFunciones=new ActivosFijosConstantesFunciones(); 
		this.activosfijosBean=new ActivosFijos();//(this.activosfijosConstantesFunciones); 		
		this.activosfijosReturnGeneral=new ActivosFijosParameterReturnGeneral(); 
		
		this.activosfijosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.activosfijosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ActivosFijosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ActivosFijosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ActivosFijosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessActivosFijos(true);
			
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
			
			this.activosfijosConstantesFunciones=new ActivosFijosConstantesFunciones(); 
			this.activosfijosBean=new ActivosFijos();//this.activosfijosConstantesFunciones); 			
			this.activosfijosReturnGeneral=new ActivosFijosParameterReturnGeneral(); 
		
			ActivosFijosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Activos Fijos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.activosfijos=new ActivosFijos();
			this.activosfijoss = new ArrayList<ActivosFijos>();
			this.activosfijossAux = new ArrayList<ActivosFijos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic=new ActivosFijosLogic();
				this.activosfijosLogic.getNewConnexionToDeep("");
			}
			
			//this.activosfijosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.activosfijosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormActivosFijos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoActivosFijos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoActivosFijos);	
					}
					
					if(this.jInternalFrameImportacionActivosFijos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionActivosFijos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByActivosFijos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByActivosFijos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormActivosFijos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormActivosFijos);
				this.jInternalFrameDetalleFormActivosFijos.setVisible(false);
				this.jInternalFrameDetalleFormActivosFijos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoActivosFijos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoActivosFijos);
					this.jInternalFrameReporteDinamicoActivosFijos.setVisible(false);
					this.jInternalFrameReporteDinamicoActivosFijos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionActivosFijos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionActivosFijos);
					this.jInternalFrameImportacionActivosFijos.setVisible(false);
					this.jInternalFrameImportacionActivosFijos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByActivosFijos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByActivosFijos);
					this.jInternalFrameOrderByActivosFijos.setVisible(false);
					this.jInternalFrameOrderByActivosFijos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idActivosFijosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ActivosFijosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.activosfijosReturnGeneral=new ActivosFijosParameterReturnGeneral();
			
			this.activosfijosParameterGeneral=new ActivosFijosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.activosfijosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.activosfijosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ActivosFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.activosfijosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ActivosFijosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.activosfijosSessionBean.getEsGuardarRelacionado(),this.activosfijosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ActivosFijosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.activosfijosSessionBean.getEsGuardarRelacionado(),this.activosfijosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoActivosFijos=false;
			this.isVisibilidadCeldaDuplicarActivosFijos=true;
			this.isVisibilidadCeldaCopiarActivosFijos=true;
			this.isVisibilidadCeldaVerFormActivosFijos=true;
			this.isVisibilidadCeldaOrdenActivosFijos=true;
			this.isVisibilidadCeldaNuevoRelacionesActivosFijos=false;
			this.isVisibilidadCeldaModificarActivosFijos=false;
			this.isVisibilidadCeldaActualizarActivosFijos=false;
			this.isVisibilidadCeldaEliminarActivosFijos=false;
			this.isVisibilidadCeldaCancelarActivosFijos=false;
			this.isVisibilidadCeldaGuardarActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosActivosFijos=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesActivosFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosActivosFijos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioActivosFijos(false);
			
			this.setPermisosUsuarioActivosFijos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.activosfijosSessionBean.getEsGuardarRelacionado() 
				|| (this.activosfijosSessionBean.getEsGuardarRelacionado() && this.activosfijosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioActivosFijosClasesRelacionadas();
			}
			
			if(this.activosfijosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioActivosFijosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ActivosFijosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosActivosFijos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualActivosFijos();
			}
			
			if(!this.isPermisoBusquedaActivosFijos) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.activosfijosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioActivosFijos,this.isPermisoPaginacionMedioActivosFijos,this.isPermisoPaginacionTodoActivosFijos);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ActivosFijosConstantesFunciones.getTiposSeleccionarActivosFijos());
				
				this.tiposColumnasSelect=ActivosFijosConstantesFunciones.getTiposSeleccionarActivosFijos(true);
				
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
			//if(!this.activosfijosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioActivosFijos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioActivosFijos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioActivosFijos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesActivosFijos() ;
			
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
				activosfijosImplementable= (ActivosFijosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ActivosFijosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				activosfijosImplementableHome= (ActivosFijosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ActivosFijosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.activosfijoss= new ArrayList<ActivosFijos>();
			this.activosfijossEliminados= new ArrayList<ActivosFijos>();
						
			this.isEsNuevoActivosFijos=false;
			this.esParaAccionDesdeFormularioActivosFijos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyActivosFijos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroActivosFijos();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.activosfijosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ActivosFijosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ActivosFijosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesActivosFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingActivosFijos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormActivosFijos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioActivosFijos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioActivosFijos();
			}
			
			ActivosFijosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessActivosFijos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ActivosFijos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectActivosFijos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesActivosFijos")) {
				iIndex=this.jInternalFrameDetalleFormActivosFijos.jTabbedPaneRelacionesActivosFijos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormActivosFijos.jTabbedPaneRelacionesActivosFijos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosActivosFijos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessActivosFijos();	
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
	
	public void cargarCombosForeignKeyActivosFijos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyActivosFijos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyActivosFijos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyActivosFijosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyActivosFijos();
		
		this.cargarCombosFrameForeignKeyActivosFijos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyActivosFijos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyActivosFijos();
		}
	}
	
	
	
	public void jButtonNuevoActivosFijosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.activosfijosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
			
			
			if(jTableDatosActivosFijos.getRowCount()>=1) {
				jTableDatosActivosFijos.removeRowSelectionInterval(0, jTableDatosActivosFijos.getRowCount()-1);						
			}
			
			this.isEsNuevoActivosFijos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoActivosFijos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesActivosFijos(true);			
			//this.activosfijos=new ActivosFijos();
			//this.activosfijos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesActivosFijos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualActivosFijos() ;
			
			if(ActivosFijosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleActivosFijos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.activosfijos);	
			this.actualizarInformacion("INFO_PADRE",false,this.activosfijos);				
			
			ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
			
			if(this.activosfijosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ActivosFijos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarActivosFijosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ActivosFijos> activosfijossSeleccionados=new ArrayList<ActivosFijos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosActivosFijos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosActivosFijos.getSelectedRows().length;			
			}
			
			activosfijossSeleccionados=this.getActivosFijossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoActivosFijos--;			
				//ActivosFijos activosfijosAux= new ActivosFijos();			
				//activosfijosAux.setId(this.iIdNuevoActivosFijos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ActivosFijos activosfijosOrigen=new ActivosFijos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ActivosFijos activosfijosOrigen : activosfijossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosActivosFijos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							activosfijosOrigen =(ActivosFijos) this.activosfijosLogic.getActivosFijoss().toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							activosfijosOrigen =(ActivosFijos) this.activosfijoss.toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaActivosFijos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.activosfijos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosActivosFijos(activosfijosOrigen,this.activosfijos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijos(this.activosfijos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.activosfijosLogic.getActivosFijoss().add(this.activosfijosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.activosfijoss.add(this.activosfijosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaActivosFijos(false);
				
				this.jTableDatosActivosFijos.setRowSelectionInterval(this.getIndiceNuevoActivosFijos(), this.getIndiceNuevoActivosFijos());
				
				int iLastRow =  this.jTableDatosActivosFijos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosActivosFijos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosActivosFijos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaActivosFijos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ActivosFijos> activosfijossSeleccionados=new ArrayList<ActivosFijos>();									
		
			ActivosFijos activosfijosOrigen=new ActivosFijos();
			ActivosFijos activosfijosDestino=new ActivosFijos();
				
			activosfijossSeleccionados=this.getActivosFijossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosActivosFijos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || activosfijossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosActivosFijos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						activosfijosOrigen =(ActivosFijos) this.activosfijosLogic.getActivosFijoss().toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						activosfijosOrigen =(ActivosFijos) this.activosfijoss.toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						activosfijosDestino =(ActivosFijos) this.activosfijosLogic.getActivosFijoss().toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						activosfijosDestino =(ActivosFijos) this.activosfijoss.toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				activosfijosOrigen =activosfijossSeleccionados.get(0);
				activosfijosDestino =activosfijossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosActivosFijos(activosfijosOrigen,activosfijosDestino,true,false);
				
				activosfijosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(activosfijosDestino,activosfijosLogic.getActivosFijoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(activosfijosDestino,activosfijoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaActivosFijos(false);
				
				//this.jTableDatosActivosFijos.setRowSelectionInterval(this.getIndiceNuevoActivosFijos(), this.getIndiceNuevoActivosFijos());
				
				int iLastRow =  this.jTableDatosActivosFijos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosActivosFijos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosActivosFijos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaActivosFijos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormActivosFijos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesActivosFijos.isVisible();
			
			
			this.jPanelParametrosReportesActivosFijos.setVisible(!isVisible);
			this.jPanelPaginacionActivosFijos.setVisible(!isVisible);
			this.jPanelAccionesActivosFijos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameActivosFijos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoActivosFijos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionActivosFijos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByActivosFijos();
			
			this.abrirFrameOrderByActivosFijos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByActivosFijos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleActivosFijos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormActivosFijos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormActivosFijos.isMaximum()) {
					this.jInternalFrameDetalleFormActivosFijos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormActivosFijos.setSize(this.jInternalFrameDetalleFormActivosFijos.iWidthFormulario,this.jInternalFrameDetalleFormActivosFijos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormActivosFijos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormActivosFijos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormActivosFijos.isMaximum()) {
						this.jInternalFrameDetalleFormActivosFijos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormActivosFijos.jContentPaneDetalleActivosFijos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormActivosFijos.jTabbedPaneRelacionesActivosFijos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormActivosFijos.jContentPaneDetalleActivosFijos.getWidth(),ActivosFijosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormActivosFijos.jTabbedPaneRelacionesActivosFijos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormActivosFijos.jContentPaneDetalleActivosFijos.getWidth(),ActivosFijosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormActivosFijos.jTabbedPaneRelacionesActivosFijos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormActivosFijos.jContentPaneDetalleActivosFijos.getWidth(),ActivosFijosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormActivosFijos.setVisible(true);
	        this.jInternalFrameDetalleFormActivosFijos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByActivosFijos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByActivosFijos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByActivosFijos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByActivosFijos,false,this);
				} else {
					this.jInternalFrameOrderByActivosFijos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByActivosFijos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByActivosFijos);
				this.jInternalFrameOrderByActivosFijos.setVisible(false);
				this.jInternalFrameOrderByActivosFijos.setSelected(false);
				
				this.jInternalFrameOrderByActivosFijos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByActivosFijos"));
				
				this.inicializarActualizarBindingTablaOrderByActivosFijos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionActivosFijos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionActivosFijos==null) {
				
				this.jInternalFrameImportacionActivosFijos=new ImportacionJInternalFrame(ActivosFijosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionActivosFijos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionActivosFijos);
				this.jInternalFrameImportacionActivosFijos.setVisible(false);
				this.jInternalFrameImportacionActivosFijos.setSelected(false);


				this.jInternalFrameImportacionActivosFijos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionActivosFijos"));
				this.jInternalFrameImportacionActivosFijos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionActivosFijos"));
				this.jInternalFrameImportacionActivosFijos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionActivosFijos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoActivosFijos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoActivosFijos==null) {
				this.jInternalFrameReporteDinamicoActivosFijos=new ReporteDinamicoJInternalFrame(ActivosFijosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoActivosFijos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoActivosFijos);
				this.jInternalFrameReporteDinamicoActivosFijos.setVisible(false);
				this.jInternalFrameReporteDinamicoActivosFijos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoActivosFijos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoActivosFijos"));
				this.jInternalFrameReporteDinamicoActivosFijos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoActivosFijos"));
				this.jInternalFrameReporteDinamicoActivosFijos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoActivosFijos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualActivosFijos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleActivosFijos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormActivosFijos);
			
	       	this.jInternalFrameDetalleFormActivosFijos.setVisible(false);
	        this.jInternalFrameDetalleFormActivosFijos.setSelected(false);
			
			//this.jInternalFrameDetalleFormActivosFijos.dispose();
			//this.jInternalFrameDetalleFormActivosFijos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoActivosFijos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoActivosFijos.setVisible(true);
	        this.jInternalFrameReporteDinamicoActivosFijos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionActivosFijos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionActivosFijos.setVisible(true);
	        this.jInternalFrameImportacionActivosFijos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByActivosFijos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByActivosFijos.setVisible(true);
	        this.jInternalFrameOrderByActivosFijos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByActivosFijos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByActivosFijos.setVisible(false);
	        this.jInternalFrameOrderByActivosFijos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoActivosFijos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoActivosFijos.setVisible(false);
	        this.jInternalFrameReporteDinamicoActivosFijos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionActivosFijos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionActivosFijos.setVisible(false);
	        this.jInternalFrameImportacionActivosFijos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarActivosFijos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarActivosFijos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosActivosFijos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesActivosFijos(true);
			//this.isEsNuevoActivosFijos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijos =(ActivosFijos) this.activosfijosLogic.getActivosFijoss().toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.activosfijos =(ActivosFijos) this.activosfijoss.toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesActivosFijos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesActivosFijos(false) ;
			
			if(activosfijosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ActivosFijosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleActivosFijos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualActivosFijos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaActivosFijosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosActivosFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijos =(ActivosFijos) this.activosfijosLogic.getActivosFijoss().toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.activosfijos =(ActivosFijos) this.activosfijoss.toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarActivosFijos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosActivosFijos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesActivosFijos(true);
			//this.isEsNuevoActivosFijos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijos =(ActivosFijos) this.activosfijosLogic.getActivosFijoss().toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.activosfijos =(ActivosFijos) this.activosfijoss.toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.activosfijos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesActivosFijos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesActivosFijos(false) ;
			
			if(ActivosFijosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleActivosFijos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualActivosFijos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesActivosFijos(false);
			
			//if(!this.isEsNuevoActivosFijos) {								
				int intSelectedRow = this.jTableDatosActivosFijos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijos =(ActivosFijos) this.activosfijosLogic.getActivosFijoss().toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.activosfijos =(ActivosFijos) this.activosfijoss.toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualActivosFijos(this.activosfijos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysActivosFijos(this.activosfijos);
				
			}
			
			if(this.permiteMantenimiento(this.activosfijos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.activosfijosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoActivosFijos=true;
					this.inicializarActualizarBindingTablaActivosFijos(false);
					this.isEsNuevoActivosFijos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoActivosFijos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoActivosFijos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesActivosFijos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualActivosFijos(false);
				
				this.habilitarDeshabilitarControlesActivosFijos(false);
			
												
				
				if(ActivosFijosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleActivosFijos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoActivosFijosActionPerformed(evt,activosfijosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualActivosFijos(this.activosfijos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosActivosFijos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,activosfijosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.activosfijos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ActivosFijos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosActivosFijos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijos =(ActivosFijos) this.activosfijosLogic.getActivosFijoss().toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
				this.activosfijos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.activosfijos =(ActivosFijos) this.activosfijoss.toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
				this.activosfijos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.activosfijos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.activosfijosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ActivosFijosModel) this.jTableDatosActivosFijos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoActivosFijos=true;
				this.inicializarActualizarBindingTablaActivosFijos(false);
				this.isEsNuevoActivosFijos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesActivosFijos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualActivosFijos(false);
				
				this.habilitarDeshabilitarControlesActivosFijos(false);
				
				
				
				if(ActivosFijosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleActivosFijos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarActivosFijosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosActivosFijos.getRowCount()>=1) {
				jTableDatosActivosFijos.removeRowSelectionInterval(0, jTableDatosActivosFijos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesActivosFijos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaActivosFijos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesActivosFijos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualActivosFijos(false) ;
			
			this.isEsNuevoActivosFijos=false;
			
			if(ActivosFijosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleActivosFijos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosActivosFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingActivosFijos(false);
				
				//SI ES MANUAL
				if(ActivosFijosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualActivosFijos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosActivosFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoActivosFijos--;			
			//ActivosFijos activosfijosAux= new ActivosFijos();			
			//activosfijosAux.setId(this.iIdNuevoActivosFijos);
			
			if(this.jInternalFrameDetalleFormActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaActivosFijos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysActivosFijos(this.activosfijos);
			
			this.activosfijos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.activosfijosLogic.getActivosFijoss().add(this.activosfijosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.activosfijoss.add(this.activosfijosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaActivosFijos(false);
			
			this.jTableDatosActivosFijos.setRowSelectionInterval(this.getIndiceNuevoActivosFijos(), this.getIndiceNuevoActivosFijos());
			
			int iLastRow =  this.jTableDatosActivosFijos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosActivosFijos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosActivosFijos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaActivosFijos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionActivosFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingActivosFijos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingActivosFijos(false);
			
			//SI ES MANUAL
			if(ActivosFijosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualActivosFijos();
			}
			
			//this.abrirFrameTreeActivosFijos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionActivosFijosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Activos FijosES ?", "MANTENIMIENTO DE Activos Fijos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionActivosFijos.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralActivosFijos();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.activosfijosReturnGeneral=activosfijosLogic.procesarImportacionActivosFijossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.activosfijosParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarActivosFijosReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionActivosFijosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionActivosFijos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionActivosFijos.setFileImportacion(this.jInternalFrameImportacionActivosFijos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionActivosFijos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionActivosFijos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionActivosFijos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionActivosFijos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoActivosFijosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ActivosFijos> activosfijossSeleccionados=new ArrayList<ActivosFijos>();		

		activosfijossSeleccionados=this.getActivosFijossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoActivosFijos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoActivosFijos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ActivosFijosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ActivosFijosBaseDesign.jrxml";
			
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
			
			this.generarReporteActivosFijoss("Todos",activosfijossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoActivosFijos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoActivosFijos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ActivosFijosConstantesFunciones.LABEL_CODIGO:
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
		
		if(this.jInternalFrameReporteDinamicoActivosFijos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoActivosFijos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoActivosFijos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ActivosFijosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoActivosFijos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ActivosFijosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoActivosFijos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoActivosFijos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ActivosFijosConstantesFunciones.LABEL_CODIGO:
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
	
	public void jButtonGenerarExcelReporteDinamicoActivosFijosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ActivosFijos> activosfijossSeleccionados=new ArrayList<ActivosFijos>();		
		
		activosfijossSeleccionados=this.getActivosFijossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"activosfijos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ActivosFijoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoActivosFijos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoActivosFijos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ActivosFijosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ActivosFijos activosfijos:activosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijos.getcodigo());
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
			//	this.getFilaCabeceraExportarExcelActivosFijos(row);				
			//	iRow++;
			//}				
			
			//for(ActivosFijos activosfijosAux:activosfijossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelActivosFijos(activosfijosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
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
				this.activosfijosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingActivosFijos(false);
			
			//SI ES MANUAL
			if(ActivosFijosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualActivosFijos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresActivosFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingActivosFijos(false);
			
			//SI ES MANUAL
			if(ActivosFijosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualActivosFijos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesActivosFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingActivosFijos(false);
			
			//SI ES MANUAL
			if(ActivosFijosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualActivosFijos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaActivosFijos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosActivosFijos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosActivosFijos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosActivosFijos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosActivosFijos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosActivosFijos.setMinimumSize(dimensionMinimum);
		this.jTableDatosActivosFijos.setMaximumSize(dimensionMaximum);
		this.jTableDatosActivosFijos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingActivosFijos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingActivosFijos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingActivosFijos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaActivosFijos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesActivosFijos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.activosfijosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasActivosFijos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesActivosFijos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesActivosFijos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ActivosFijosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualActivosFijos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaActivosFijos();
		
		this.inicializarActualizarBindingBotonesManualActivosFijos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.activosfijosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualActivosFijos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesActivosFijos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualActivosFijos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualActivosFijos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosActivosFijos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosActivosFijos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteActivosFijos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormActivosFijos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormActivosFijos.jCheckBoxPostAccionNuevoActivosFijos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormActivosFijos.jCheckBoxPostAccionSinCerrarActivosFijos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormActivosFijos.jCheckBoxPostAccionSinMensajeActivosFijos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosActivosFijos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosActivosFijos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteActivosFijos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormActivosFijos!=null) {
				this.jInternalFrameDetalleFormActivosFijos.jCheckBoxPostAccionNuevoActivosFijos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormActivosFijos.jCheckBoxPostAccionSinCerrarActivosFijos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormActivosFijos.jCheckBoxPostAccionSinMensajeActivosFijos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionActivosFijos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionActivosFijos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormActivosFijos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormActivosFijos.jComboBoxTiposAccionesFormularioActivosFijos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesActivosFijos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoActivosFijos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoActivosFijos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesActivosFijos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesActivosFijos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarActivosFijos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesActivosFijos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoActivosFijos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoActivosFijos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesActivosFijos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralActivosFijos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesActivosFijos(Boolean esInicializar) throws Exception {
		try	{	
			if(ActivosFijosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualActivosFijos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesActivosFijos() throws Exception {
		try	{
			if(ActivosFijosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualActivosFijos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleActivosFijos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormActivosFijos.jComboBoxTiposAccionesFormularioActivosFijos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormActivosFijos.jComboBoxTiposAccionesFormularioActivosFijos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualActivosFijos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesActivosFijos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesActivosFijos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesActivosFijos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionActivosFijos.addItem(reporte);
			}
			
			
			if(!this.activosfijosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionActivosFijos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionActivosFijos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesActivosFijos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesActivosFijos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormActivosFijos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormActivosFijos.jComboBoxTiposAccionesFormularioActivosFijos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormActivosFijos.jComboBoxTiposAccionesFormularioActivosFijos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarActivosFijos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarActivosFijos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualActivosFijos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualActivosFijos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoActivosFijos!=null) {
				this.jInternalFrameReporteDinamicoActivosFijos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoActivosFijos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoActivosFijos!=null) {
				this.jInternalFrameReporteDinamicoActivosFijos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoActivosFijos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoActivosFijos!=null) {
				
				if(this.jInternalFrameReporteDinamicoActivosFijos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoActivosFijos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoActivosFijos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoActivosFijos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoActivosFijos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoActivosFijos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualActivosFijos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasActivosFijos(Boolean esInicializar) throws Exception {				
		if(ActivosFijosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualActivosFijos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaActivosFijos() throws Exception {
		this.inicializarActualizarBindingTablaActivosFijos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByActivosFijos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByActivosFijos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByActivosFijos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByActivosFijos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ActivosFijosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByActivosFijos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByActivosFijos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ActivosFijosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosActivosFijosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ActivosFijosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByActivosFijos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByActivosFijos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ActivosFijosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByActivosFijos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaActivosFijos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=activosfijosLogic.getActivosFijoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=activosfijoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosActivosFijos.setModel(new ActivosFijosModel(this.activosfijosLogic.getActivosFijoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosActivosFijos.setModel(new ActivosFijosModel(this.activosfijoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByActivosFijos!=null && this.jInternalFrameOrderByActivosFijos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByActivosFijos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ActivosFijosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO,activosfijosConstantesFunciones.resaltarSeleccionarActivosFijos,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO,activosfijosConstantesFunciones.resaltarSeleccionarActivosFijos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijos,ActivosFijosConstantesFunciones.LABEL_ID));

		if(this.activosfijosConstantesFunciones.mostraridActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.activosfijosConstantesFunciones.resaltaridActivosFijos,this.activosfijosConstantesFunciones.activaridActivosFijos,this,true,"idActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosConstantesFunciones.resaltaridActivosFijos,this.activosfijosConstantesFunciones.activaridActivosFijos,this,true,"idActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijos,ActivosFijosConstantesFunciones.LABEL_CODIGO));

		if(this.activosfijosConstantesFunciones.mostrarcodigoActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.activosfijosConstantesFunciones.resaltarcodigoActivosFijos,this.activosfijosConstantesFunciones.activarcodigoActivosFijos,this,true,"codigoActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosConstantesFunciones.resaltarcodigoActivosFijos,this.activosfijosConstantesFunciones.activarcodigoActivosFijos,this,true,"codigoActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.activosfijosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.activosfijosSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.activosfijosSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosActivosFijos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.activosfijosSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.activosfijosSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosActivosFijos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarActivosFijos && this.isPermisoGuardarCambiosActivosFijos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.activosfijosSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.activosfijosSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosActivosFijos.addColumn(tableColumn);
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
			
			this.jTableDatosActivosFijos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarActivosFijos && this.isPermisoGuardarCambiosActivosFijos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarActivosFijos && this.isPermisoGuardarCambiosActivosFijos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosActivosFijos.moveColumn(this.jTableDatosActivosFijos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosActivosFijos.moveColumn(this.jTableDatosActivosFijos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosActivosFijos.moveColumn(this.jTableDatosActivosFijos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosActivosFijos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosActivosFijos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosActivosFijos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosActivosFijos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosActivosFijos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosActivosFijos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosActivosFijos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosActivosFijos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=activosfijosLogic.getActivosFijoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=activosfijoss.size()-1;
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
		//this.jTableDatosActivosFijos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosActivosFijos();
			
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
				
				//this.isEsNuevoActivosFijos=false;
					
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
			
				if(this.activosfijosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormActivosFijos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosActivosFijos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosActivosFijos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijos =(ActivosFijos) this.activosfijosLogic.getActivosFijoss().toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.activosfijos =(ActivosFijos) this.activosfijoss.toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.activosfijos.getsType().equals("DUPLICADO")
				   || this.activosfijos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoActivosFijos=true;
				
				} else {
					this.isEsNuevoActivosFijos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.activosfijosSessionBean.getEsGuardarRelacionado()) {
					if(this.activosfijos.getId()>=0 && !this.activosfijos.getIsNew()) {						
						this.isEsNuevoActivosFijos=false;
						
					} else {
						this.isEsNuevoActivosFijos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoActivosFijos(esRelaciones);						
				
				this.seleccionarActivosFijos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.activosfijos.getId()<0) {
					this.isEsNuevoActivosFijos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarActivosFijos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarActivosFijos(evt,rowIndex);
				}	
				
				if(this.activosfijosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ActivosFijos: " + this.dDif); 
					}
				}								
				
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarActivosFijos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.activosfijos)) {
					if(this.activosfijos.getId()>0) {
						this.activosfijos.setIsDeleted(true);
						
						this.activosfijossEliminados.add(this.activosfijos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.activosfijosLogic.getActivosFijoss().remove(this.activosfijos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.activosfijoss.remove(this.activosfijos);				
					}
					
					
					((ActivosFijosModel) this.jTableDatosActivosFijos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaActivosFijos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarActivosFijos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoActivosFijos) {
			
			if(this.jInternalFrameDetalleFormActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosActivosFijos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosActivosFijos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijos =(ActivosFijos) this.activosfijosLogic.getActivosFijoss().toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.activosfijos =(ActivosFijos) this.activosfijoss.toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioActivosFijos(this.activosfijos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesActivosFijos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesActivosFijos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualActivosFijos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoActivosFijos(ActivosFijos activosfijos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoActivosFijos(activosfijos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoActivosFijos(ActivosFijos activosfijos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioActivosFijos(activosfijos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyActivosFijos(activosfijos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyActivosFijos(activosfijos);
	}
	
	public void setVariablesObjetoActualToFormularioActivosFijos(ActivosFijos activosfijos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormActivosFijos.jLabelidActivosFijos.setText(activosfijos.getId().toString());
			this.jInternalFrameDetalleFormActivosFijos.jTextFieldcodigoActivosFijos.setText(activosfijos.getcodigo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ActivosFijos activosfijosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,activosfijosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ActivosFijos activosfijosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				activosfijosLocal=this.activosfijos;
			} else {
				activosfijosLocal=this.activosfijosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(activosfijosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoActivosFijos(activosfijosLocal,true);
					
					if(activosfijosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(activosfijosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.activosfijosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(activosfijosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoActivosFijos(ActivosFijos activosfijos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualActivosFijos(activosfijos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysActivosFijos(activosfijos);
	}
	
	public void setVariablesFormularioToObjetoActualActivosFijos(ActivosFijos activosfijos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualActivosFijos(activosfijos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualActivosFijos(ActivosFijos activosfijos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormActivosFijos.jLabelidActivosFijos.getText()==null || this.jInternalFrameDetalleFormActivosFijos.jLabelidActivosFijos.getText()=="" || this.jInternalFrameDetalleFormActivosFijos.jLabelidActivosFijos.getText()=="Id") {
				this.jInternalFrameDetalleFormActivosFijos.jLabelidActivosFijos.setText("0");
			}

			if(conColumnasBase) {activosfijos.setId(Long.parseLong(this.jInternalFrameDetalleFormActivosFijos.jLabelidActivosFijos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijos.jLabelIdActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijos.setcodigo(this.jInternalFrameDetalleFormActivosFijos.jTextFieldcodigoActivosFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijos.jLabelcodigoActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualActivosFijos(ActivosFijos activosfijosBean,ActivosFijos activosfijos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosActivosFijos(ActivosFijos activosfijosOrigen,ActivosFijos activosfijos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && activosfijosOrigen.getId()!=null && !activosfijosOrigen.getId().equals(0L))) {activosfijos.setId(activosfijosOrigen.getId());}}
			if(conDefault || (!conDefault && activosfijosOrigen.getcodigo()!=null && !activosfijosOrigen.getcodigo().equals(""))) {activosfijos.setcodigo(activosfijosOrigen.getcodigo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioActivosFijos(ActivosFijos activosfijos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormActivosFijos.jLabelidActivosFijos.setText(activosfijos.getId().toString());
			this.jInternalFrameDetalleFormActivosFijos.jTextFieldcodigoActivosFijos.setText(activosfijos.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioActivosFijos(ActivosFijosBean activosfijosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormActivosFijos.jLabelidActivosFijos.setText(activosfijosBean.getId().toString());
			this.jInternalFrameDetalleFormActivosFijos.jTextFieldcodigoActivosFijos.setText(activosfijosBean.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanActivosFijos(ActivosFijosParameterReturnGeneral activosfijosReturnGeneral,ActivosFijosBean activosfijosBean,Boolean conDefault) throws Exception { 
		try {
			ActivosFijos activosfijosLocal=new ActivosFijos();
			
			activosfijosLocal=activosfijosReturnGeneral.getActivosFijos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && activosfijosLocal.getId()!=null && !activosfijosLocal.getId().equals(0L))) {activosfijosBean.setId(activosfijosLocal.getId());}}
			if(conDefault || (!conDefault && activosfijosLocal.getcodigo()!=null && !activosfijosLocal.getcodigo().equals(""))) {activosfijosBean.setcodigo(activosfijosLocal.getcodigo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxActivosFijosGenerico(Long idActivosFijosSeleccionado,JComboBox jComboBoxActivosFijos,List<ActivosFijos> activosfijossLocal)throws Exception {
		try {
			ActivosFijos  activosfijosTemp=null;

			for(ActivosFijos activosfijosAux:activosfijossLocal) {
				if(activosfijosAux.getId()!=null && activosfijosAux.getId().equals(idActivosFijosSeleccionado)) {
					activosfijosTemp=activosfijosAux;
					break;
				}
			}

			jComboBoxActivosFijos.setSelectedItem(activosfijosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxActivosFijosGenerico(JComboBox jComboBoxActivosFijos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxActivosFijos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxActivosFijos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxActivosFijos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxActivosFijos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			activosfijos=(ActivosFijos) activosfijosLogic.getActivosFijoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			activosfijos =(ActivosFijos) activosfijoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ActivosFijos activosfijosRow=new ActivosFijos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			activosfijosRow=(ActivosFijos) activosfijosLogic.getActivosFijoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			activosfijosRow=(ActivosFijos) activosfijoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualActivosFijos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoActivosFijos.setVisible((this.isVisibilidadCeldaNuevoActivosFijos && this.isPermisoNuevoActivosFijos));			
			this.jButtonDuplicarActivosFijos.setVisible((this.isVisibilidadCeldaDuplicarActivosFijos && this.isPermisoDuplicarActivosFijos));			
			this.jButtonCopiarActivosFijos.setVisible((this.isVisibilidadCeldaCopiarActivosFijos && this.isPermisoCopiarActivosFijos));
			this.jButtonVerFormActivosFijos.setVisible((this.isVisibilidadCeldaVerFormActivosFijos && this.isPermisoVerFormActivosFijos));
			
			this.jButtonAbrirOrderByActivosFijos.setVisible((this.isVisibilidadCeldaOrdenActivosFijos && this.isPermisoOrdenActivosFijos));			
			
			this.jButtonNuevoRelacionesActivosFijos.setVisible((this.isVisibilidadCeldaNuevoRelacionesActivosFijos && this.isPermisoNuevoActivosFijos));			
			this.jButtonNuevoGuardarCambiosActivosFijos.setVisible((this.isVisibilidadCeldaNuevoActivosFijos && this.isPermisoNuevoActivosFijos && this.isPermisoGuardarCambiosActivosFijos));
			
			if(this.jInternalFrameDetalleFormActivosFijos!=null) {
			this.jInternalFrameDetalleFormActivosFijos.jButtonModificarActivosFijos.setVisible((this.isVisibilidadCeldaModificarActivosFijos && this.isPermisoActualizarActivosFijos));	
			this.jInternalFrameDetalleFormActivosFijos.jButtonActualizarActivosFijos.setVisible((this.isVisibilidadCeldaActualizarActivosFijos && this.isPermisoActualizarActivosFijos));	
			this.jInternalFrameDetalleFormActivosFijos.jButtonEliminarActivosFijos.setVisible((this.isVisibilidadCeldaEliminarActivosFijos && this.isPermisoEliminarActivosFijos));
			this.jInternalFrameDetalleFormActivosFijos.jButtonCancelarActivosFijos.setVisible(this.isVisibilidadCeldaCancelarActivosFijos);							
			this.jInternalFrameDetalleFormActivosFijos.jButtonGuardarCambiosActivosFijos.setVisible((this.isVisibilidadCeldaGuardarActivosFijos && this.isPermisoGuardarCambiosActivosFijos));			
			
			}
						
			this.jButtonGuardarCambiosTablaActivosFijos.setVisible((this.isVisibilidadCeldaGuardarCambiosActivosFijos && this.isPermisoGuardarCambiosActivosFijos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarActivosFijos.setVisible((this.isVisibilidadCeldaNuevoActivosFijos && this.isPermisoNuevoActivosFijos));						
			this.jButtonDuplicarToolBarActivosFijos.setVisible((this.isVisibilidadCeldaDuplicarActivosFijos && this.isPermisoDuplicarActivosFijos));						
			this.jButtonCopiarToolBarActivosFijos.setVisible((this.isVisibilidadCeldaCopiarActivosFijos && this.isPermisoCopiarActivosFijos));			
			this.jButtonVerFormToolBarActivosFijos.setVisible((this.isVisibilidadCeldaVerFormActivosFijos && this.isPermisoVerFormActivosFijos));			
			this.jButtonAbrirOrderByToolBarActivosFijos.setVisible((this.isVisibilidadCeldaOrdenActivosFijos && this.isPermisoOrdenActivosFijos));
			this.jButtonNuevoRelacionesToolBarActivosFijos.setVisible((this.isVisibilidadCeldaNuevoRelacionesActivosFijos && this.isPermisoNuevoActivosFijos));			
			this.jButtonNuevoGuardarCambiosToolBarActivosFijos.setVisible((this.isVisibilidadCeldaNuevoActivosFijos && this.isPermisoNuevoActivosFijos && this.isPermisoGuardarCambiosActivosFijos));			
			
			if(this.jInternalFrameDetalleFormActivosFijos!=null) {
			this.jInternalFrameDetalleFormActivosFijos.jButtonModificarToolBarActivosFijos.setVisible((this.isVisibilidadCeldaModificarActivosFijos && this.isPermisoActualizarActivosFijos));	
			this.jInternalFrameDetalleFormActivosFijos.jButtonActualizarToolBarActivosFijos.setVisible((this.isVisibilidadCeldaActualizarActivosFijos  && this.isPermisoActualizarActivosFijos));	
			this.jInternalFrameDetalleFormActivosFijos.jButtonEliminarToolBarActivosFijos.setVisible((this.isVisibilidadCeldaEliminarActivosFijos && this.isPermisoEliminarActivosFijos));
			this.jInternalFrameDetalleFormActivosFijos.jButtonCancelarToolBarActivosFijos.setVisible(this.isVisibilidadCeldaCancelarActivosFijos);				
			this.jInternalFrameDetalleFormActivosFijos.jButtonGuardarCambiosToolBarActivosFijos.setVisible((this.isVisibilidadCeldaGuardarActivosFijos && this.isPermisoGuardarCambiosActivosFijos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarActivosFijos.setVisible((this.isVisibilidadCeldaGuardarCambiosActivosFijos && this.isPermisoGuardarCambiosActivosFijos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoActivosFijos.setVisible((this.isVisibilidadCeldaNuevoActivosFijos && this.isPermisoNuevoActivosFijos));			
			this.jMenuItemDuplicarActivosFijos.setVisible((this.isVisibilidadCeldaDuplicarActivosFijos && this.isPermisoDuplicarActivosFijos));			
			this.jMenuItemCopiarActivosFijos.setVisible((this.isVisibilidadCeldaCopiarActivosFijos && this.isPermisoCopiarActivosFijos));			
			this.jMenuItemVerFormActivosFijos.setVisible((this.isVisibilidadCeldaVerFormActivosFijos && this.isPermisoVerFormActivosFijos));			
			this.jMenuItemAbrirOrderByActivosFijos.setVisible((this.isVisibilidadCeldaOrdenActivosFijos && this.isPermisoOrdenActivosFijos));			
			//this.jMenuItemMostrarOcultarActivosFijos.setVisible((this.isVisibilidadCeldaOrdenActivosFijos && this.isPermisoOrdenActivosFijos));
			this.jMenuItemDetalleAbrirOrderByActivosFijos.setVisible((this.isVisibilidadCeldaOrdenActivosFijos && this.isPermisoOrdenActivosFijos));			
			//this.jMenuItemDetalleMostrarOcultarActivosFijos.setVisible((this.isVisibilidadCeldaOrdenActivosFijos && this.isPermisoOrdenActivosFijos));			
			this.jMenuItemNuevoRelacionesActivosFijos.setVisible((this.isVisibilidadCeldaNuevoRelacionesActivosFijos && this.isPermisoNuevoActivosFijos));			
			this.jMenuItemNuevoGuardarCambiosActivosFijos.setVisible((this.isVisibilidadCeldaNuevoActivosFijos && this.isPermisoNuevoActivosFijos && this.isPermisoGuardarCambiosActivosFijos));									
			
			if(this.jInternalFrameDetalleFormActivosFijos!=null) {
			this.jInternalFrameDetalleFormActivosFijos.jMenuItemModificarActivosFijos.setVisible((this.isVisibilidadCeldaModificarActivosFijos && this.isPermisoActualizarActivosFijos));	
			this.jInternalFrameDetalleFormActivosFijos.jMenuItemActualizarActivosFijos.setVisible((this.isVisibilidadCeldaActualizarActivosFijos && this.isPermisoActualizarActivosFijos));	
			this.jInternalFrameDetalleFormActivosFijos.jMenuItemEliminarActivosFijos.setVisible((this.isVisibilidadCeldaEliminarActivosFijos && this.isPermisoEliminarActivosFijos));
			this.jInternalFrameDetalleFormActivosFijos.jMenuItemCancelarActivosFijos.setVisible(this.isVisibilidadCeldaCancelarActivosFijos);				
			}
			
			this.jMenuItemGuardarCambiosActivosFijos.setVisible((this.isVisibilidadCeldaGuardarActivosFijos && this.isPermisoGuardarCambiosActivosFijos));						
			this.jMenuItemGuardarCambiosTablaActivosFijos.setVisible((this.isVisibilidadCeldaGuardarCambiosActivosFijos && this.isPermisoGuardarCambiosActivosFijos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoActivosFijos=this.jButtonNuevoActivosFijos.isVisible();
			this.isVisibilidadCeldaDuplicarActivosFijos=this.jButtonDuplicarActivosFijos.isVisible();
			this.isVisibilidadCeldaCopiarActivosFijos=this.jButtonCopiarActivosFijos.isVisible();
			this.isVisibilidadCeldaVerFormActivosFijos=this.jButtonVerFormActivosFijos.isVisible();
			
			this.isVisibilidadCeldaOrdenActivosFijos=this.jButtonAbrirOrderByActivosFijos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesActivosFijos=this.jButtonNuevoRelacionesActivosFijos.isVisible();
			this.isVisibilidadCeldaModificarActivosFijos=this.jButtonModificarActivosFijos.isVisible();
			
			if(this.jInternalFrameDetalleFormActivosFijos!=null) {
			this.isVisibilidadCeldaActualizarActivosFijos=this.jInternalFrameDetalleFormActivosFijos.jButtonActualizarActivosFijos.isVisible();
			this.isVisibilidadCeldaEliminarActivosFijos=this.jInternalFrameDetalleFormActivosFijos.jButtonEliminarActivosFijos.isVisible();
			this.isVisibilidadCeldaCancelarActivosFijos=this.jInternalFrameDetalleFormActivosFijos.jButtonCancelarActivosFijos.isVisible();
			this.isVisibilidadCeldaGuardarActivosFijos=this.jInternalFrameDetalleFormActivosFijos.jButtonGuardarCambiosActivosFijos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosActivosFijos=this.jButtonGuardarCambiosTablaActivosFijos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoActivosFijos=this.jButtonNuevoToolBarActivosFijos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesActivosFijos=this.jButtonNuevoRelacionesToolBarActivosFijos.isVisible();
			
			if(this.jInternalFrameDetalleFormActivosFijos!=null) {
			this.isVisibilidadCeldaModificarActivosFijos=this.jInternalFrameDetalleFormActivosFijos.jButtonModificarToolBarActivosFijos.isVisible();
			this.isVisibilidadCeldaActualizarActivosFijos=this.jInternalFrameDetalleFormActivosFijos.jButtonActualizarToolBarActivosFijos.isVisible();
			this.isVisibilidadCeldaEliminarActivosFijos=this.jInternalFrameDetalleFormActivosFijos.jButtonEliminarToolBarActivosFijos.isVisible();
			this.isVisibilidadCeldaCancelarActivosFijos=this.jInternalFrameDetalleFormActivosFijos.jButtonCancelarToolBarActivosFijos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarActivosFijos=this.jButtonGuardarCambiosToolBarActivosFijos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosActivosFijos=this.jButtonGuardarCambiosTablaToolBarActivosFijos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoActivosFijos=this.jMenuItemNuevoActivosFijos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesActivosFijos=this.jMenuItemNuevoRelacionesActivosFijos.isVisible();
			
			if(this.jInternalFrameDetalleFormActivosFijos!=null) {
			this.isVisibilidadCeldaModificarActivosFijos=this.jInternalFrameDetalleFormActivosFijos.jMenuItemModificarActivosFijos.isVisible();
			this.isVisibilidadCeldaActualizarActivosFijos=this.jInternalFrameDetalleFormActivosFijos.jMenuItemActualizarActivosFijos.isVisible();
			this.isVisibilidadCeldaEliminarActivosFijos=this.jInternalFrameDetalleFormActivosFijos.jMenuItemEliminarActivosFijos.isVisible();
			this.isVisibilidadCeldaCancelarActivosFijos=this.jInternalFrameDetalleFormActivosFijos.jMenuItemCancelarActivosFijos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarActivosFijos=this.jMenuItemGuardarCambiosActivosFijos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosActivosFijos=this.jMenuItemGuardarCambiosTablaActivosFijos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesActivosFijos(Boolean esInicializar) {
		if(ActivosFijosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.activosfijosSessionBean.getConGuardarRelaciones()) {
				//if(this.activosfijosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesActivosFijos();
			}
			
			this.inicializarActualizarBindingBotonesManualActivosFijos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualActivosFijos() {
		this.jButtonNuevoActivosFijos.setVisible(this.isPermisoNuevoActivosFijos);			
		this.jButtonDuplicarActivosFijos.setVisible(this.isPermisoDuplicarActivosFijos);			
		this.jButtonCopiarActivosFijos.setVisible(this.isPermisoCopiarActivosFijos);			
		this.jButtonVerFormActivosFijos.setVisible(this.isPermisoVerFormActivosFijos);			
		
		this.jButtonAbrirOrderByActivosFijos.setVisible(this.isPermisoOrdenActivosFijos);					
		
		this.jButtonNuevoRelacionesActivosFijos.setVisible(this.isPermisoNuevoActivosFijos);			
		
		if(this.jInternalFrameDetalleFormActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijos.jButtonModificarActivosFijos.setVisible(this.isPermisoActualizarActivosFijos);	
			this.jInternalFrameDetalleFormActivosFijos.jButtonActualizarActivosFijos.setVisible(this.isPermisoActualizarActivosFijos);	
			this.jInternalFrameDetalleFormActivosFijos.jButtonEliminarActivosFijos.setVisible(this.isPermisoEliminarActivosFijos);
			this.jInternalFrameDetalleFormActivosFijos.jButtonCancelarActivosFijos.setVisible(this.isVisibilidadCeldaCancelarActivosFijos);						
			this.jInternalFrameDetalleFormActivosFijos.jButtonGuardarCambiosActivosFijos.setVisible(this.isPermisoGuardarCambiosActivosFijos);							
		}
		
		this.jButtonGuardarCambiosTablaActivosFijos.setVisible(this.isPermisoActualizarActivosFijos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleActivosFijos() {
		this.jInternalFrameDetalleFormActivosFijos.jButtonModificarActivosFijos.setVisible(this.isPermisoActualizarActivosFijos);	
		this.jInternalFrameDetalleFormActivosFijos.jButtonActualizarActivosFijos.setVisible(this.isPermisoActualizarActivosFijos);	
		this.jInternalFrameDetalleFormActivosFijos.jButtonEliminarActivosFijos.setVisible(this.isPermisoEliminarActivosFijos);
		this.jInternalFrameDetalleFormActivosFijos.jButtonCancelarActivosFijos.setVisible(this.isVisibilidadCeldaCancelarActivosFijos);							
		this.jInternalFrameDetalleFormActivosFijos.jButtonGuardarCambiosActivosFijos.setVisible((this.isVisibilidadCeldaGuardarActivosFijos && this.isPermisoGuardarCambiosActivosFijos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosActivosFijos() {
		if(ActivosFijosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualActivosFijos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesActivosFijos() {
	}
	
	public void jTableDatosActivosFijosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarActivosFijos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijos(this.getactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijos(this.activosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijos =(ActivosFijos) this.activosfijosLogic.getActivosFijoss().toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijos =(ActivosFijos) this.activosfijoss.toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijos==null) {
						this.activosfijos = new ActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijos(this.activosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijos(this.activosfijos);
				}

				if(this.activosfijos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.activosfijos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijos(this.getactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijos(this.activosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijos =(ActivosFijos) this.activosfijosLogic.getActivosFijoss().toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijos =(ActivosFijos) this.activosfijoss.toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijos==null) {
						this.activosfijos = new ActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijos(this.activosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijos(this.activosfijos);
				}

				if(this.activosfijos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.activosfijos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameActivosFijos() {
		if(this.jInternalFrameDetalleFormActivosFijos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormActivosFijos!=null) {
			this.jInternalFrameDetalleFormActivosFijos.setVisible(false);	    			
			this.jInternalFrameDetalleFormActivosFijos.dispose();
			this.jInternalFrameDetalleFormActivosFijos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoActivosFijos!=null) {
			this.jInternalFrameReporteDinamicoActivosFijos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoActivosFijos.dispose();
			this.jInternalFrameReporteDinamicoActivosFijos=null;
		}
		
		if(this.jInternalFrameImportacionActivosFijos!=null) {
			this.jInternalFrameImportacionActivosFijos.setVisible(false);	    			
			this.jInternalFrameImportacionActivosFijos.dispose();
			this.jInternalFrameImportacionActivosFijos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessActivosFijos();
			
			ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
			
			
			if(sTipo.equals("NuevoActivosFijos")) {
				jButtonNuevoActivosFijosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarActivosFijos")) {
				jButtonDuplicarActivosFijosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarActivosFijos")) {
				jButtonCopiarActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("VerFormActivosFijos")) {
				jButtonVerFormActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarActivosFijos")) {
				jButtonNuevoActivosFijosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarActivosFijos")) {
				jButtonDuplicarActivosFijosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoActivosFijos")) {
				jButtonNuevoActivosFijosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarActivosFijos")) {
				jButtonDuplicarActivosFijosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesActivosFijos")) {
				jButtonNuevoActivosFijosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarActivosFijos")) {
				jButtonNuevoActivosFijosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesActivosFijos")) {
				jButtonNuevoActivosFijosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarActivosFijos")) {
				jButtonModificarActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarActivosFijos")) {
				jButtonModificarActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarActivosFijos")) {
				jButtonModificarActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarActivosFijos")) {
				jButtonActualizarActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarActivosFijos")) {
				jButtonActualizarActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarActivosFijos")) {
				jButtonActualizarActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("EliminarActivosFijos")) {
				jButtonEliminarActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarActivosFijos")) {
				jButtonEliminarActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarActivosFijos")) {
				jButtonEliminarActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("CancelarActivosFijos")) {
				jButtonCancelarActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarActivosFijos")) {
				jButtonCancelarActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarActivosFijos")) {
				jButtonCancelarActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("CerrarActivosFijos")) {
				jButtonCerrarActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarActivosFijos")) {
				jButtonCerrarActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarActivosFijos")) {
				jButtonCerrarActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarActivosFijos")) {
				jButtonMostrarOcultarActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarActivosFijos")) {
				jButtonCancelarActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosActivosFijos")) {
				jButtonGuardarCambiosActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarActivosFijos")) {
				jButtonGuardarCambiosActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarActivosFijos")) {
				jButtonCopiarActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarActivosFijos")) {
				jButtonVerFormActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosActivosFijos")) {
				jButtonGuardarCambiosActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarActivosFijos")) {
				jButtonCopiarActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormActivosFijos")) {
				jButtonVerFormActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaActivosFijos")) {
				jButtonGuardarCambiosActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarActivosFijos")) {
				jButtonGuardarCambiosActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaActivosFijos")) {
				jButtonGuardarCambiosActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionActivosFijos")) {
				jButtonRecargarInformacionActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarActivosFijos")) {
				jButtonRecargarInformacionActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionActivosFijos")) {
				jButtonRecargarInformacionActivosFijosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresActivosFijos")) {
				jButtonAnterioresActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarActivosFijos")) {
				jButtonAnterioresActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreActivosFijos")) {
				jButtonAnterioresActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesActivosFijos")) {
				jButtonSiguientesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarActivosFijos")) {
				jButtonSiguientesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesActivosFijos")) {
				jButtonSiguientesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByActivosFijos") || sTipo.equals("MenuItemDetalleAbrirOrderByActivosFijos")) {
				jButtonAbrirOrderByActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarActivosFijos") || sTipo.equals("MenuItemDetalleMostrarOcultarActivosFijos")) {
				jButtonMostrarOcultarActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosActivosFijos")) {
				jButtonNuevoGuardarCambiosActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarActivosFijos")) {
				jButtonNuevoGuardarCambiosActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosActivosFijos")) {
				jButtonNuevoGuardarCambiosActivosFijosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoActivosFijos")) {
				jButtonCerrarReporteDinamicoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoActivosFijos")) {
				jButtonGenerarReporteDinamicoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoActivosFijos")) {
				
				jButtonGenerarExcelReporteDinamicoActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionActivosFijos")) {
				jButtonCerrarImportacionActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionActivosFijos")) {
				
				jButtonGenerarImportacionActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionActivosFijos")) {
				
				jButtonAbrirImportacionActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesActivosFijos")) {
				jComboBoxTiposAccionesActivosFijosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesActivosFijos")) {
				jComboBoxTiposRelacionesActivosFijosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioActivosFijos")) {
				jComboBoxTiposAccionesActivosFijosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarActivosFijos")) {
				
				jComboBoxTiposSeleccionarActivosFijosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralActivosFijos")) {
				jTextFieldValorCampoGeneralActivosFijosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByActivosFijos")) {
				jButtonAbrirOrderByActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarActivosFijos")) {
				jButtonAbrirOrderByActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByActivosFijos")) {
				jButtonCerrarOrderByActivosFijosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idActivosFijosBusqueda")) {
				this.jButtonidActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoActivosFijosBusqueda")) {
				this.jButtoncodigoActivosFijosBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessActivosFijos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActivosFijosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijos);
				
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
				
				


				
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ActivosFijos activosfijosLocal=null;
			
			if(!this.getEsControlTabla()) {
				activosfijosLocal=this.activosfijos;
			} else {
				activosfijosLocal=this.activosfijosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijos);
				
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
							
				
				


				
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActivosFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosActivosFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosAnterior =(ActivosFijos) this.activosfijosLogic.getActivosFijoss().toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.activosfijosAnterior =(ActivosFijos) this.activosfijoss.toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
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
			
			ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
			
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
			
			


			
			ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActivosFijosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijos);
				
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
								
						
				


				
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijos);
				
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
								
				
				


				
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActivosFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosActivosFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosAnterior =(ActivosFijos) this.activosfijosLogic.getActivosFijoss().toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.activosfijosAnterior =(ActivosFijos) this.activosfijoss.toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActivosFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosActivosFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosAnterior =(ActivosFijos) this.activosfijosLogic.getActivosFijoss().toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.activosfijosAnterior =(ActivosFijos) this.activosfijoss.toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActivosFijosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.activosfijos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijos);
				
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
							
				
				


				
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActivosFijosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosActivosFijos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosAnterior =(ActivosFijos) this.activosfijosLogic.getActivosFijoss().toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.activosfijosAnterior =(ActivosFijos) this.activosfijoss.toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
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
			
			ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
			
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
			
			


			
			ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActivosFijosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.activosfijos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijos);
				
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
								
				
				


				
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActivosFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosActivosFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosAnterior =(ActivosFijos) this.activosfijosLogic.getActivosFijoss().toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.activosfijosAnterior =(ActivosFijos) this.activosfijoss.toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActivosFijosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.activosfijos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActivosFijosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijos);
				
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosActivosFijos")) {
					jCheckBoxSeleccionarTodosActivosFijosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosActivosFijos")) {
					jCheckBoxSeleccionadosActivosFijosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarActivosFijos")) {
					
				}
				
				


				
				
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.activosfijos);
				
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
												
				
				


				
				
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActivosFijosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosActivosFijos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosAnterior =(ActivosFijos) this.activosfijosLogic.getActivosFijoss().toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.activosfijosAnterior =(ActivosFijos) this.activosfijoss.toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActivosFijosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijos);
				
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
				
				
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
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
			
			ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
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
			
			


			
			ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActivosFijosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijos);
				
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijos);
				
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
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
				
				


				
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActivosFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosActivosFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosAnterior =(ActivosFijos) this.activosfijosLogic.getActivosFijoss().toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.activosfijosAnterior =(ActivosFijos) this.activosfijoss.toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarActivosFijos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosActivosFijosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosActivosFijos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.activosfijos =(ActivosFijos) this.activosfijosLogic.getActivosFijoss().toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.activosfijos =(ActivosFijos) this.activosfijoss.toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.activosfijos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarActivosFijos")) {
				
				}
				
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarActivosFijos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosActivosFijos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarActivosFijos")) {
			
			}
			
			ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessActivosFijos();
			
			ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
			
			if(sTipo.equals("NuevoActivosFijos")) {
				jButtonNuevoActivosFijosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarActivosFijos")) {
				jButtonDuplicarActivosFijosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarActivosFijos")) {
				jButtonCopiarActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormActivosFijos")) {
				jButtonVerFormActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesActivosFijos")) {
				jButtonNuevoActivosFijosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarActivosFijos")) {
				jButtonModificarActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarActivosFijos")) {
				jButtonActualizarActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarActivosFijos")) {
				jButtonEliminarActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaActivosFijos")) {
				jButtonGuardarCambiosActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarActivosFijos")) {
				jButtonCancelarActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarActivosFijos")) {
				jButtonCerrarActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosActivosFijos")) {
				jButtonGuardarCambiosActivosFijosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosActivosFijos")) {
				jButtonNuevoGuardarCambiosActivosFijosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByActivosFijos")) {
				jButtonAbrirOrderByActivosFijosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionActivosFijos")) {
				jButtonRecargarInformacionActivosFijosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresActivosFijos")) {
				jButtonAnterioresActivosFijosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesActivosFijos")) {
				jButtonSiguientesActivosFijosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idActivosFijosBusqueda")) {
				this.jButtonidActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoActivosFijosBusqueda")) {
				this.jButtoncodigoActivosFijosBusquedaActionPerformed(evt);
			}
			
			ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessActivosFijos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameActivosFijos")) {
				closingInternalFrameActivosFijos();
				
			} else if(sTipo.equals("jButtonCancelarActivosFijos")) {
				JInternalFrameBase jInternalFrameDetalleFormActivosFijos = (JInternalFrameBase)evt.getSource();
	            	
	            ActivosFijosBeanSwingJInternalFrame jInternalFrameParent=(ActivosFijosBeanSwingJInternalFrame)jInternalFrameDetalleFormActivosFijos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarActivosFijosActionPerformed(null);
			}
			
			ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.activosfijos,new Object(),this.activosfijosParameterGeneral,this.activosfijosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormActivosFijos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormActivosFijos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormActivosFijos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.activosfijos)) {
			if(!esControlTabla) {
				if(ActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualActivosFijos(this.activosfijos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijos(this.activosfijos);			
				}
				
				if(this.activosfijosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualActivosFijos(this.activosfijos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanActivosFijos(this.activosfijosReturnGeneral,this.activosfijosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.activosfijosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanActivosFijos(classes,this.activosfijosReturnGeneral,this.activosfijosBean,false);
					}
						
					if(this.activosfijosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyActivosFijos(this.activosfijosReturnGeneral.getActivosFijos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioActivosFijos(this.activosfijosReturnGeneral.getActivosFijos());	
					}
						
					if(this.activosfijosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioActivosFijos(this.activosfijosReturnGeneral.getActivosFijos(),classes);//this.activosfijosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioActivosFijos(this.activosfijos,classes);//this.activosfijosBean);									
				}
			
				if(ActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualActivosFijos(this.activosfijos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijos(this.activosfijos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.activosfijosAnterior!=null) {
						this.activosfijos=this.activosfijosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.activosfijosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.activosfijosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.activosfijosReturnGeneral.getActivosFijos(),activosfijosLogic.getActivosFijoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.activosfijosReturnGeneral.getActivosFijos(),this.activosfijoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosActivosFijos.repaint();
				
				//((AbstractTableModel) this.jTableDatosActivosFijos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosActivosFijos();
			}
		}
	}
	
	public void actualizarVisualTableDatosActivosFijos() throws Exception {
		
		ActivosFijosModel activosfijosModel=(ActivosFijosModel)this.jTableDatosActivosFijos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			activosfijosModel.activosfijoss=this.activosfijosLogic.getActivosFijoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			activosfijosModel.activosfijoss=this.activosfijoss;
		}
		
		
		((ActivosFijosModel) this.jTableDatosActivosFijos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaActivosFijos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getactivosfijosAnterior(),this.activosfijosLogic.getActivosFijoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getactivosfijosAnterior(),this.activosfijoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosActivosFijos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioActivosFijos(ActivosFijos activosfijos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
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
										
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.activosfijos,new Object(),generalEntityParameterGeneral,this.activosfijosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.activosfijosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ActivosFijosConstantesFunciones.getClassesRelationshipsOfActivosFijos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ActivosFijosConstantesFunciones.getClassesRelationshipsFromStringsOfActivosFijos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormActivosFijos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.activosfijos,new Object(),generalEntityParameterGeneral,this.activosfijosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioActivosFijos(ActivosFijosBean activosfijosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanActivosFijos(ArrayList<Classe> classes,ActivosFijosReturnGeneral activosfijosReturnGeneral,ActivosFijosBean activosfijosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualActivosFijos(ActivosFijos activosfijos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.activosfijos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormActivosFijos = new ActivosFijosDetalleFormJInternalFrame(jDesktopPane,this.activosfijosSessionBean.getConGuardarRelaciones(),this.activosfijosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormActivosFijos);
		this.jInternalFrameDetalleFormActivosFijos.setVisible(false);
		this.jInternalFrameDetalleFormActivosFijos.setSelected(false);						
		
		this.jInternalFrameDetalleFormActivosFijos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormActivosFijos.activosfijosLogic=this.activosfijosLogic;
		
		this.cargarCombosFrameForeignKeyActivosFijos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleActivosFijos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleActivosFijos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyActivosFijos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyActivosFijos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormActivosFijos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarActivosFijos"));
		
		this.jInternalFrameDetalleFormActivosFijos.jButtonModificarActivosFijos.addActionListener(new ButtonActionListener(this,"ModificarActivosFijos"));

		
		this.jInternalFrameDetalleFormActivosFijos.jButtonModificarToolBarActivosFijos.addActionListener(new ButtonActionListener(this,"ModificarToolBarActivosFijos"));
					
		this.jInternalFrameDetalleFormActivosFijos.jMenuItemModificarActivosFijos.addActionListener(new ButtonActionListener(this,"MenuItemModificarActivosFijos"));		
		
		
		
		this.jInternalFrameDetalleFormActivosFijos.jButtonActualizarActivosFijos.addActionListener (new ButtonActionListener(this,"ActualizarActivosFijos"));
		
		
		this.jInternalFrameDetalleFormActivosFijos.jButtonActualizarToolBarActivosFijos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarActivosFijos"));
						
		this.jInternalFrameDetalleFormActivosFijos.jMenuItemActualizarActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarActivosFijos"));		
		
		
		
		this.jInternalFrameDetalleFormActivosFijos.jButtonEliminarActivosFijos.addActionListener (new ButtonActionListener(this,"EliminarActivosFijos"));
		
		
		this.jInternalFrameDetalleFormActivosFijos.jButtonEliminarToolBarActivosFijos.addActionListener (new ButtonActionListener(this,"EliminarToolBarActivosFijos"));
								
		this.jInternalFrameDetalleFormActivosFijos.jMenuItemEliminarActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarActivosFijos"));		
		
		
		
		this.jInternalFrameDetalleFormActivosFijos.jButtonCancelarActivosFijos.addActionListener (new ButtonActionListener(this,"CancelarActivosFijos"));
		
		
		this.jInternalFrameDetalleFormActivosFijos.jButtonCancelarToolBarActivosFijos.addActionListener (new ButtonActionListener(this,"CancelarToolBarActivosFijos"));
					
		this.jInternalFrameDetalleFormActivosFijos.jMenuItemCancelarActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarActivosFijos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormActivosFijos.jMenuItemDetalleCerrarActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarActivosFijos"));		
		
		
		
		this.jInternalFrameDetalleFormActivosFijos.jButtonGuardarCambiosToolBarActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarActivosFijos"));
		
		
		
		this.jInternalFrameDetalleFormActivosFijos.jButtonGuardarCambiosToolBarActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarActivosFijos"));
		
		
		
		this.jInternalFrameDetalleFormActivosFijos.jComboBoxTiposAccionesFormularioActivosFijos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioActivosFijos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijos.jButtonidActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"idActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijos.jButtoncodigoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"codigoActivosFijosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormActivosFijos.jTabbedPaneRelacionesActivosFijos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesActivosFijos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameActivosFijos"));
		
		if(this.jInternalFrameDetalleFormActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarActivosFijos"));
		}
		
		this.jTableDatosActivosFijos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarActivosFijos"));
		
		this.jTableDatosActivosFijos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarActivosFijos"));
		
		this.jButtonNuevoActivosFijos.addActionListener(new ButtonActionListener(this,"NuevoActivosFijos"));
		
		this.jButtonDuplicarActivosFijos.addActionListener(new ButtonActionListener(this,"DuplicarActivosFijos"));
		
		this.jButtonCopiarActivosFijos.addActionListener(new ButtonActionListener(this,"CopiarActivosFijos"));
		
		this.jButtonVerFormActivosFijos.addActionListener(new ButtonActionListener(this,"VerFormActivosFijos"));
		
		
		this.jButtonNuevoToolBarActivosFijos.addActionListener(new ButtonActionListener(this,"NuevoToolBarActivosFijos"));
			
		this.jButtonDuplicarToolBarActivosFijos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarActivosFijos"));
			
		this.jMenuItemNuevoActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoActivosFijos"));
			
		this.jMenuItemDuplicarActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarActivosFijos"));		
		
		
		this.jButtonNuevoRelacionesActivosFijos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesActivosFijos"));
		
		
		this.jButtonNuevoRelacionesToolBarActivosFijos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarActivosFijos"));
			
		this.jMenuItemNuevoRelacionesActivosFijos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesActivosFijos"));		
		
		
		if(this.jInternalFrameDetalleFormActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijos.jButtonModificarActivosFijos.addActionListener(new ButtonActionListener(this,"ModificarActivosFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijos.jButtonModificarToolBarActivosFijos.addActionListener(new ButtonActionListener(this,"ModificarToolBarActivosFijos"));
			
			this.jInternalFrameDetalleFormActivosFijos.jMenuItemModificarActivosFijos.addActionListener(new ButtonActionListener(this,"MenuItemModificarActivosFijos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormActivosFijos.jButtonActualizarActivosFijos.addActionListener (new ButtonActionListener(this,"ActualizarActivosFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijos.jButtonActualizarToolBarActivosFijos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarActivosFijos"));
				
			this.jInternalFrameDetalleFormActivosFijos.jMenuItemActualizarActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarActivosFijos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijos.jButtonEliminarActivosFijos.addActionListener (new ButtonActionListener(this,"EliminarActivosFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijos.jButtonEliminarToolBarActivosFijos.addActionListener (new ButtonActionListener(this,"EliminarToolBarActivosFijos"));
						
			this.jInternalFrameDetalleFormActivosFijos.jMenuItemEliminarActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarActivosFijos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijos.jButtonCancelarActivosFijos.addActionListener (new ButtonActionListener(this,"CancelarActivosFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijos.jButtonCancelarToolBarActivosFijos.addActionListener (new ButtonActionListener(this,"CancelarToolBarActivosFijos"));
			
			this.jInternalFrameDetalleFormActivosFijos.jMenuItemCancelarActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarActivosFijos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarActivosFijos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarActivosFijos"));		
		
		
		this.jButtonCerrarActivosFijos.addActionListener (new ButtonActionListener(this,"CerrarActivosFijos"));
		
		
		this.jButtonCerrarToolBarActivosFijos.addActionListener (new ButtonActionListener(this,"CerrarToolBarActivosFijos"));
			
		this.jMenuItemCerrarActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarActivosFijos"));
			
		if(this.jInternalFrameDetalleFormActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijos.jMenuItemDetalleCerrarActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarActivosFijos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijos.jButtonGuardarCambiosActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosActivosFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijos.jButtonGuardarCambiosToolBarActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarActivosFijos"));
		}
		
		this.jButtonCopiarToolBarActivosFijos.addActionListener (new ButtonActionListener(this,"CopiarToolBarActivosFijos"));
			
		this.jButtonVerFormToolBarActivosFijos.addActionListener (new ButtonActionListener(this,"VerFormToolBarActivosFijos"));
		
		this.jMenuItemGuardarCambiosActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosActivosFijos"));
			
		this.jMenuItemCopiarActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarActivosFijos"));		
		
		this.jMenuItemVerFormActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormActivosFijos"));		
		
		
		this.jButtonGuardarCambiosTablaActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaActivosFijos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarActivosFijos"));
			
		this.jMenuItemGuardarCambiosTablaActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaActivosFijos"));		
		
		
		
		this.jButtonRecargarInformacionActivosFijos.addActionListener (new ButtonActionListener(this,"RecargarInformacionActivosFijos"));
					
		this.jButtonRecargarInformacionToolBarActivosFijos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarActivosFijos"));
		
		this.jMenuItemRecargarInformacionActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionActivosFijos"));		
		
		
		
		this.jButtonAnterioresActivosFijos.addActionListener (new ButtonActionListener(this,"AnterioresActivosFijos"));
		
		
		this.jButtonAnterioresToolBarActivosFijos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarActivosFijos"));
		
		this.jMenuItemAnterioresActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresActivosFijos"));		
		
		
		this.jButtonSiguientesActivosFijos.addActionListener (new ButtonActionListener(this,"SiguientesActivosFijos"));
		
		
		this.jButtonSiguientesToolBarActivosFijos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarActivosFijos"));
			
		this.jMenuItemSiguientesActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesActivosFijos"));
			
		this.jMenuItemAbrirOrderByActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByActivosFijos"));
			
		this.jMenuItemMostrarOcultarActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarActivosFijos"));
			
		this.jMenuItemDetalleAbrirOrderByActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByActivosFijos"));
			
		this.jMenuItemDetalleMostarOcultarActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarActivosFijos"));		
		
		
		this.jButtonNuevoGuardarCambiosActivosFijos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosActivosFijos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarActivosFijos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarActivosFijos"));
			
		this.jMenuItemNuevoGuardarCambiosActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosActivosFijos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosActivosFijos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosActivosFijos"));

		this.jCheckBoxSeleccionadosActivosFijos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosActivosFijos"));
		
		if(this.jInternalFrameDetalleFormActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijos.jComboBoxTiposAccionesFormularioActivosFijos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioActivosFijos"));
		}
		
		
		this.jComboBoxTiposRelacionesActivosFijos.addActionListener (new ButtonActionListener(this,"TiposRelacionesActivosFijos"));
			
		this.jComboBoxTiposAccionesActivosFijos.addActionListener (new ButtonActionListener(this,"TiposAccionesActivosFijos"));
					
		this.jComboBoxTiposSeleccionarActivosFijos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarActivosFijos"));
			
		this.jTextFieldValorCampoGeneralActivosFijos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralActivosFijos"));		
		
		
		if(this.jInternalFrameDetalleFormActivosFijos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijos.jButtonidActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"idActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijos.jButtoncodigoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"codigoActivosFijosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoActivosFijos!=null) {
				this.jInternalFrameReporteDinamicoActivosFijos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoActivosFijos"));
				this.jInternalFrameReporteDinamicoActivosFijos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoActivosFijos"));
				this.jInternalFrameReporteDinamicoActivosFijos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoActivosFijos"));
			}
			
			//this.jButtonCerrarReporteDinamicoActivosFijos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoActivosFijos"));				
			//this.jButtonGenerarReporteDinamicoActivosFijos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoActivosFijos"));
			//this.jButtonGenerarExcelReporteDinamicoActivosFijos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoActivosFijos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionActivosFijos!=null) {
				this.jInternalFrameImportacionActivosFijos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionActivosFijos"));
				this.jInternalFrameImportacionActivosFijos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionActivosFijos"));
				this.jInternalFrameImportacionActivosFijos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionActivosFijos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByActivosFijos.addActionListener (new ButtonActionListener(this,"AbrirOrderByActivosFijos"));
			
			this.jButtonAbrirOrderByToolBarActivosFijos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarActivosFijos"));			
			
			if(this.jInternalFrameOrderByActivosFijos!=null) {
				this.jInternalFrameOrderByActivosFijos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByActivosFijos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijos.jTabbedPaneRelacionesActivosFijos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesActivosFijos"));
		
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
            		closingInternalFrameActivosFijos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormActivosFijos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormActivosFijos = (JInternalFrameBase)event.getSource();
	            	
	            ActivosFijosBeanSwingJInternalFrame jInternalFrameParent=(ActivosFijosBeanSwingJInternalFrame)jInternalFrameDetalleFormActivosFijos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarActivosFijosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosActivosFijos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosActivosFijosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosActivosFijos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosActivosFijos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoActivosFijosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoActivosFijosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoActivosFijosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoActivosFijos";
		inputMap = this.jButtonNuevoActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoActivosFijosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoActivosFijosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoActivosFijosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoActivosFijosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesActivosFijos";
		inputMap = this.jButtonNuevoRelacionesActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoActivosFijosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarActivosFijos";
		inputMap = this.jButtonModificarActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarActivosFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarActivosFijos";
		inputMap = this.jButtonActualizarActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarActivosFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarActivosFijos";
		inputMap = this.jButtonEliminarActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarActivosFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarActivosFijos";
		inputMap = this.jButtonCancelarActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarActivosFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarActivosFijos";
		inputMap = this.jButtonCerrarActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarActivosFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormActivosFijos.jButtonGuardarCambiosActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosActivosFijos";
		inputMap = this.jInternalFrameDetalleFormActivosFijos.jButtonGuardarCambiosActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormActivosFijos.jButtonGuardarCambiosActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosActivosFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosActivosFijos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosActivosFijosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesActivosFijos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesActivosFijosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarActivosFijos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarActivosFijosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralActivosFijos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralActivosFijosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijos.jButtonidActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"idActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijos.jButtoncodigoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"codigoActivosFijosBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarActivosFijosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarActivosFijos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosActivosFijos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ActivosFijos activosfijosAux:this.activosfijosLogic.getActivosFijoss()) {
					activosfijosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ActivosFijos activosfijosAux:activosfijoss) {
					activosfijosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosActivosFijosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingActivosFijos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ActivosFijos activosfijosAux:this.activosfijosLogic.getActivosFijoss()) {
						activosfijosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ActivosFijos activosfijosAux:activosfijoss) {
						activosfijosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ActivosFijos activosfijosAux:this.activosfijosLogic.getActivosFijoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ActivosFijos activosfijosAux:activosfijoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaActivosFijos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosActivosFijos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosActivosFijos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosActivosFijos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosActivosFijosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingActivosFijos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosActivosFijos.getSelectedRows();
			
			ActivosFijos activosfijosLocal=new ActivosFijos();
			
			//this.seleccionarTodosActivosFijos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					activosfijosLocal =(ActivosFijos) this.activosfijosLogic.getActivosFijoss().toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					activosfijosLocal =(ActivosFijos) this.activosfijoss.toArray()[this.jTableDatosActivosFijos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				activosfijosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ActivosFijos activosfijosAux:this.activosfijosLogic.getActivosFijoss()) {
						activosfijosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ActivosFijos activosfijosAux:activosfijoss) {
						activosfijosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaActivosFijos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosActivosFijos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosActivosFijos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosActivosFijos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualActivosFijosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarActivosFijosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralActivosFijosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingActivosFijos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralActivosFijos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ActivosFijos activosfijosAux:this.activosfijosLogic.getActivosFijoss()) {
				
						if(sTipoSeleccionar.equals(ActivosFijosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							activosfijosAux.setcodigo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ActivosFijos activosfijosAux:activosfijoss) {
					
						if(sTipoSeleccionar.equals(ActivosFijosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							activosfijosAux.setcodigo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaActivosFijos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesActivosFijosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingActivosFijos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioActivosFijos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesActivosFijos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormActivosFijos.jComboBoxTiposAccionesFormularioActivosFijos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteActivosFijos) {				
					conSplash=true;//false;										
					
					//this.startProcessActivosFijos(conSplash);
				
					this.generarReporteActivosFijossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesActivosFijos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormActivosFijos.jComboBoxTiposAccionesFormularioActivosFijos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoActivosFijossSeleccionados();
				//this.jComboBoxTiposAccionesActivosFijos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoActivosFijossSeleccionados(false);
				//this.jComboBoxTiposAccionesActivosFijos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoActivosFijossSeleccionados(true);
				//this.jComboBoxTiposAccionesActivosFijos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessActivosFijos();
				
				this.exportarActivosFijossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesActivosFijos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormActivosFijos.jComboBoxTiposAccionesFormularioActivosFijos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionActivosFijoss();
				//this.importarActivosFijoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesActivosFijos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormActivosFijos.jComboBoxTiposAccionesFormularioActivosFijos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessActivosFijos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelActivosFijossSeleccionados();
				//this.jComboBoxTiposAccionesActivosFijos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Activos Fijos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessActivosFijos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoActivosFijos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyActivosFijos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesActivosFijos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormActivosFijos.jComboBoxTiposAccionesFormularioActivosFijos.setSelectedIndex(0);					
				}	
			} 			
			else if(ActivosFijosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteActivosFijos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessActivosFijos(conSplash);
					
						//this.actualizarParametrosGeneralActivosFijos();
						
						this.generarReporteProcesoAccionActivosFijossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesActivosFijos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormActivosFijos.jComboBoxTiposAccionesFormularioActivosFijos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ActivosFijosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Activos FijosES SELECCIONADOS?", "MANTENIMIENTO DE Activos Fijos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessActivosFijos();
				
						this.actualizarParametrosGeneralActivosFijos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.activosfijosReturnGeneral=activosfijosLogic.procesarAccionActivosFijossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.activosfijosLogic.getActivosFijoss(),this.activosfijosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarActivosFijosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesActivosFijos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormActivosFijos.jComboBoxTiposAccionesFormularioActivosFijos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralActivosFijos();
					
					ActivosFijosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarActivosFijosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesActivosFijos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormActivosFijos.jComboBoxTiposAccionesFormularioActivosFijos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessActivosFijos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesActivosFijosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessActivosFijos();
			
			if(this.jInternalFrameDetalleFormActivosFijos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ActivosFijos> activosfijossSeleccionados=new ArrayList<ActivosFijos>();		
			ActivosFijos activosfijos=new ActivosFijos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingActivosFijos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesActivosFijos.getSelectedItem();
			
			
			
			
			activosfijossSeleccionados=this.getActivosFijossSeleccionados(true);
			//this.sTipoAccion;
			
			if(activosfijossSeleccionados.size()==1) {
				for(ActivosFijos activosfijosAux:activosfijossSeleccionados) {
					activosfijos=activosfijosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessActivosFijos();
			
      		//this.finishProcessActivosFijos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarActivosFijosReturnGeneral() throws Exception {
		if(this.activosfijosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.activosfijosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.activosfijosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.activosfijosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.activosfijosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.activosfijosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingActivosFijos(false);
		}
		
		if(this.activosfijosReturnGeneral.getConRetornoLista() || this.activosfijosReturnGeneral.getConRetornoObjeto()) {
			if(this.activosfijosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.activosfijosLogic.setActivosFijoss(this.activosfijosReturnGeneral.getActivosFijoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.activosfijosReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.activosfijosLogic.setActivosFijos(this.activosfijosReturnGeneral.getActivosFijos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingActivosFijos(false);
		}
	}
	
	public void actualizarParametrosGeneralActivosFijos() throws Exception {
		
		
	}
	
	public ArrayList<ActivosFijos> getActivosFijossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ActivosFijos> activosfijossSeleccionados=new ArrayList<ActivosFijos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioActivosFijos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ActivosFijos activosfijosAux:activosfijosLogic.getActivosFijoss()) {
					if(activosfijosAux.getIsSelected()) {
						activosfijossSeleccionados.add(activosfijosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ActivosFijos activosfijosAux:this.activosfijoss) {
					if(activosfijosAux.getIsSelected()) {
						activosfijossSeleccionados.add(activosfijosAux);				
					}
				}
			}
			
			if(activosfijossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						activosfijossSeleccionados.addAll(this.activosfijosLogic.getActivosFijoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						activosfijossSeleccionados.addAll(this.activosfijoss);				
					}
				}
			}
		} else {
			activosfijossSeleccionados.add(this.activosfijos);
		}
		
		return activosfijossSeleccionados;
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
	
	public void generarReporteActivosFijossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalActivosFijossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoActivosFijossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoActivosFijossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoActivosFijossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Activos Fijos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesActivosFijossSeleccionados() throws Exception {
		ArrayList<ActivosFijos> activosfijossSeleccionados=new ArrayList<ActivosFijos>();		
		
		activosfijossSeleccionados=this.getActivosFijossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteActivosFijoss("Todos",activosfijossSeleccionados);
		
	}	
	
	public void generarReporteNormalActivosFijossSeleccionados() throws Exception {
		ArrayList<ActivosFijos> activosfijossSeleccionados=new ArrayList<ActivosFijos>();		
		
		activosfijossSeleccionados=this.getActivosFijossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteActivosFijoss("Todos",activosfijossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionActivosFijossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ActivosFijos> activosfijossSeleccionados=new ArrayList<ActivosFijos>();
		
		activosfijossSeleccionados=this.getActivosFijossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteActivosFijoss("Todos",activosfijossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoActivosFijossSeleccionados() throws Exception {
		ArrayList<ActivosFijos> activosfijossSeleccionados=new ArrayList<ActivosFijos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoActivosFijos();
		
		
		activosfijossSeleccionados=this.getActivosFijossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoActivosFijos();
		
		
		//this.generarReporteActivosFijoss("Todos",activosfijossSeleccionados ,activosfijosImplementable,activosfijosImplementableHome);
	}
	
	public void mostrarImportacionActivosFijoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionActivosFijos();
		
		this.abrirFrameImportacionActivosFijos();		
		
			
		//this.generarReporteActivosFijoss("Todos",activosfijossSeleccionados ,activosfijosImplementable,activosfijosImplementableHome);
	}
	
	public void importarActivosFijoss() throws Exception {		
	
	}
	
	public void exportarActivosFijossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelActivosFijossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoActivosFijossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlActivosFijossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Activos Fijos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoActivosFijossSeleccionados() throws Exception {
		ArrayList<ActivosFijos> activosfijossSeleccionados=new ArrayList<ActivosFijos>();		
		
		activosfijossSeleccionados=this.getActivosFijossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"activosfijos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarActivosFijos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ActivosFijos activosfijosAux:activosfijossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarActivosFijos(activosfijosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//activosfijosAux.setsDetalleGeneralEntityReporte(activosfijosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarActivosFijos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ActivosFijosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosConstantesFunciones.LABEL_CODIGO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarActivosFijos(ActivosFijos activosfijos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=activosfijos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijos.getcodigo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelActivosFijossSeleccionados() throws Exception {
		ArrayList<ActivosFijos> activosfijossSeleccionados=new ArrayList<ActivosFijos>();		
		
		activosfijossSeleccionados=this.getActivosFijossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"activosfijos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ActivosFijoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelActivosFijos(row);				
				iRow++;
			}				
			
			for(ActivosFijos activosfijosAux:activosfijossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelActivosFijos(activosfijosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlActivosFijossSeleccionados() throws Exception {
		ArrayList<ActivosFijos> activosfijossSeleccionados=new ArrayList<ActivosFijos>();		
		
		activosfijossSeleccionados=this.getActivosFijossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"activosfijos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("activosfijoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("activosfijos");
			//elementRoot.appendChild(element);
		
			for(ActivosFijos activosfijosAux:activosfijossSeleccionados) {
				element = document.createElement("activosfijos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlActivosFijos(activosfijosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelActivosFijos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosConstantesFunciones.LABEL_CODIGO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelActivosFijos(ActivosFijos activosfijos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijos.getcodigo());				
	}
	
	public void setFilaDatosExportarXmlActivosFijos(ActivosFijos activosfijos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ActivosFijosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(activosfijos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ActivosFijosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(activosfijos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(ActivosFijosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(activosfijos.getcodigo().trim()));
		element.appendChild(elementcodigo);
	}
	
	public void generarReporteGroupGenericoActivosFijossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ActivosFijos> activosfijossSeleccionados=new ArrayList<ActivosFijos>();
		
		activosfijossSeleccionados=this.getActivosFijossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoActivosFijos(activosfijossSeleccionados);
		
		this.generarReporteActivosFijoss("Todos",activosfijossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoActivosFijos(ArrayList<ActivosFijos> activosfijossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ActivosFijos activosfijosAux:activosfijossSeleccionados) {
				activosfijosAux.setsDetalleGeneralEntityReporte(activosfijosAux.toString());
			
				if(sTipoSeleccionar.equals(ActivosFijosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					activosfijosAux.setsDescripcionGeneralEntityReporte1(activosfijosAux.getcodigo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesActivosFijos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoActivosFijos=true;
				this.isVisibilidadCeldaNuevoRelacionesActivosFijos=true;
				this.isVisibilidadCeldaGuardarCambiosActivosFijos=true;
			}
			
			this.isVisibilidadCeldaModificarActivosFijos=false;
			this.isVisibilidadCeldaActualizarActivosFijos=false;
			this.isVisibilidadCeldaEliminarActivosFijos=false;
			this.isVisibilidadCeldaCancelarActivosFijos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActivosFijos=true;
				} else {
					this.isVisibilidadCeldaGuardarActivosFijos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoActivosFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosActivosFijos=false;
			this.isVisibilidadCeldaModificarActivosFijos=false;
			this.isVisibilidadCeldaActualizarActivosFijos=true;
			this.isVisibilidadCeldaEliminarActivosFijos=false;
			this.isVisibilidadCeldaCancelarActivosFijos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActivosFijos=true;
				} else {
					this.isVisibilidadCeldaGuardarActivosFijos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoActivosFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosActivosFijos=false;
			this.isVisibilidadCeldaModificarActivosFijos=false;
			this.isVisibilidadCeldaActualizarActivosFijos=true;
			this.isVisibilidadCeldaEliminarActivosFijos=true;
			this.isVisibilidadCeldaCancelarActivosFijos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActivosFijos=true;
				} else {
					this.isVisibilidadCeldaGuardarActivosFijos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoActivosFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosActivosFijos=false;
			this.isVisibilidadCeldaModificarActivosFijos=false;
			this.isVisibilidadCeldaActualizarActivosFijos=true;
			this.isVisibilidadCeldaEliminarActivosFijos=false;
			this.isVisibilidadCeldaCancelarActivosFijos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActivosFijos=false;
				} else {
					this.isVisibilidadCeldaGuardarActivosFijos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoActivosFijos=true;
			this.isVisibilidadCeldaNuevoRelacionesActivosFijos=true;
			this.isVisibilidadCeldaGuardarCambiosActivosFijos=true;
			this.isVisibilidadCeldaModificarActivosFijos=false;
			this.isVisibilidadCeldaActualizarActivosFijos=false;
			this.isVisibilidadCeldaEliminarActivosFijos=false;
			this.isVisibilidadCeldaCancelarActivosFijos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActivosFijos=true;
				} else {
					this.isVisibilidadCeldaGuardarActivosFijos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoActivosFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosActivosFijos=false;
			this.isVisibilidadCeldaActualizarActivosFijos=false;
			this.isVisibilidadCeldaEliminarActivosFijos=false;
			this.isVisibilidadCeldaCancelarActivosFijos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActivosFijos=false;
				} else {
					this.isVisibilidadCeldaGuardarActivosFijos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoActivosFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosActivosFijos=false;
			this.isVisibilidadCeldaModificarActivosFijos=true;
			this.isVisibilidadCeldaActualizarActivosFijos=false;
			this.isVisibilidadCeldaEliminarActivosFijos=false;
			this.isVisibilidadCeldaCancelarActivosFijos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActivosFijos=false;
				} else {
					this.isVisibilidadCeldaGuardarActivosFijos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ActivosFijosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoActivosFijos=true;
			this.isVisibilidadCeldaNuevoRelacionesActivosFijos=true;
			this.isVisibilidadCeldaGuardarCambiosActivosFijos=true;
		} else {
			this.actualizarEstadoPanelsActivosFijos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarActivosFijos=false;
			//this.isVisibilidadCeldaVerFormActivosFijos=false;
			this.isVisibilidadCeldaDuplicarActivosFijos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!activosfijosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesActivosFijos=false;
		} else {
			this.isVisibilidadCeldaNuevoActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosActivosFijos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(activosfijosSessionBean.getEsGuardarRelacionado()) {
			if(!activosfijosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesActivosFijos=false;												
			}
			
			this.jButtonCerrarActivosFijos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesActivosFijos=false;
		}
		
		if(!this.permiteMantenimiento(this.activosfijos)) {
			this.isVisibilidadCeldaActualizarActivosFijos=false;
			this.isVisibilidadCeldaEliminarActivosFijos=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesActivosFijos() {
	}
	
	public void actualizarEstadoPanelsActivosFijos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionActivosFijos!=null) {
				this.jScrollPanelDatosEdicionActivosFijos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosActivosFijos!=null) {
				this.jScrollPanelDatosActivosFijos.setVisible(true);
			}
			
			if(this.jPanelPaginacionActivosFijos!=null) {
				this.jPanelPaginacionActivosFijos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesActivosFijos!=null) {
				this.jPanelParametrosReportesActivosFijos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionActivosFijos!=null) {
				this.jScrollPanelDatosEdicionActivosFijos.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosActivosFijos!=null) {
				this.jScrollPanelDatosActivosFijos.setVisible(false);
			}
			
			if(this.jPanelPaginacionActivosFijos!=null) {
				this.jPanelPaginacionActivosFijos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesActivosFijos!=null) {
				this.jPanelParametrosReportesActivosFijos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionActivosFijos!=null) {
				this.jScrollPanelDatosEdicionActivosFijos.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosActivosFijos!=null) {
				this.jScrollPanelDatosActivosFijos.setVisible(false);
			}
			
			if(this.jPanelPaginacionActivosFijos!=null) {
				this.jPanelPaginacionActivosFijos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesActivosFijos!=null) {
				this.jPanelParametrosReportesActivosFijos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionActivosFijos!=null) {
				this.jScrollPanelDatosEdicionActivosFijos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosActivosFijos!=null) {
				this.jScrollPanelDatosActivosFijos.setVisible(false);
			}
			
			if(this.jPanelPaginacionActivosFijos!=null) {
				this.jPanelPaginacionActivosFijos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesActivosFijos!=null) {
				this.jPanelParametrosReportesActivosFijos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionActivosFijos!=null) {
				this.jScrollPanelDatosEdicionActivosFijos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosActivosFijos!=null) {
				this.jScrollPanelDatosActivosFijos.setVisible(true);
			}
			
			if(this.jPanelPaginacionActivosFijos!=null) {
				this.jPanelPaginacionActivosFijos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesActivosFijos!=null) {
				this.jPanelParametrosReportesActivosFijos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionActivosFijos!=null) {
				this.jScrollPanelDatosEdicionActivosFijos.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosActivosFijos!=null) {
				this.jScrollPanelDatosActivosFijos.setVisible(true);
			}
			
			if(this.jPanelPaginacionActivosFijos!=null) {
				this.jPanelPaginacionActivosFijos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesActivosFijos!=null) {
				this.jPanelParametrosReportesActivosFijos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionActivosFijos!=null) {
				this.jScrollPanelDatosEdicionActivosFijos.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosActivosFijos!=null) {
				this.jScrollPanelDatosActivosFijos.setVisible(true);
			}
			
			if(this.jPanelPaginacionActivosFijos!=null) {
				this.jPanelPaginacionActivosFijos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesActivosFijos!=null) {
				this.jPanelParametrosReportesActivosFijos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.activosfijosSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.activosfijosSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ActivosFijosSessionBean activosfijosSessionBean=new ActivosFijosSessionBean();
		
		if(this.activosfijosSessionBean==null) {
			this.activosfijosSessionBean=new ActivosFijosSessionBean();
		}
		
		this.activosfijosSessionBean.setsUltimaBusquedaActivosFijos(this.getsAccionBusqueda());
		this.activosfijosSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.activosfijosSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ActivosFijosSessionBean activosfijosSessionBean=new ActivosFijosSessionBean();
		
		if(this.activosfijosSessionBean==null) {
			this.activosfijosSessionBean=new ActivosFijosSessionBean();
		}
		
		if(this.activosfijosSessionBean.getsUltimaBusquedaActivosFijos()!=null&&!this.activosfijosSessionBean.getsUltimaBusquedaActivosFijos().equals("")) {
			this.setsAccionBusqueda(activosfijosSessionBean.getsUltimaBusquedaActivosFijos());
			this.setiNumeroPaginacion(activosfijosSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(activosfijosSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.activosfijosSessionBean.setsUltimaBusquedaActivosFijos("");
		this.activosfijosSessionBean.setiNumeroPaginacion(ActivosFijosConstantesFunciones.INUMEROPAGINACION);
		this.activosfijosSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaActivosFijos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioActivosFijos() {
		this.updateBorderResaltarBusquedasFormularioActivosFijos();
		this.updateVisibilidadBusquedasFormularioActivosFijos();
		this.updateHabilitarBusquedasFormularioActivosFijos();
	}
	
	public void updateBorderResaltarBusquedasFormularioActivosFijos() {					
	}
	
	public void updateVisibilidadBusquedasFormularioActivosFijos() {
	}
	
	public void updateHabilitarBusquedasFormularioActivosFijos() {
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
	
	public void updateControlesFormularioActivosFijos() throws Exception {

		if(this.jInternalFrameDetalleFormActivosFijos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioActivosFijos();
		this.updateVisibilidadResaltarControlesFormularioActivosFijos();
		this.updateHabilitarResaltarControlesFormularioActivosFijos();
		
	}
	
	public void updateBorderResaltarControlesFormularioActivosFijos() throws Exception {
		if(this.jInternalFrameDetalleFormActivosFijos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.activosfijosConstantesFunciones.resaltaridActivosFijos!=null && this.jInternalFrameDetalleFormActivosFijos!=null) {this.jInternalFrameDetalleFormActivosFijos.jLabelidActivosFijos.setBorder(this.activosfijosConstantesFunciones.resaltaridActivosFijos);}
		if(this.activosfijosConstantesFunciones.resaltarcodigoActivosFijos!=null && this.jInternalFrameDetalleFormActivosFijos!=null) {this.jInternalFrameDetalleFormActivosFijos.jTextFieldcodigoActivosFijos.setBorder(this.activosfijosConstantesFunciones.resaltarcodigoActivosFijos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioActivosFijos() throws Exception {		
		if(this.jInternalFrameDetalleFormActivosFijos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormActivosFijos!=null) {
	
		//this.jInternalFrameDetalleFormActivosFijos.jLabelidActivosFijos.setVisible(this.activosfijosConstantesFunciones.mostraridActivosFijos);
		this.jInternalFrameDetalleFormActivosFijos.jPanelidActivosFijos.setVisible(this.activosfijosConstantesFunciones.mostraridActivosFijos);
		//this.jInternalFrameDetalleFormActivosFijos.jTextFieldcodigoActivosFijos.setVisible(this.activosfijosConstantesFunciones.mostrarcodigoActivosFijos);
		this.jInternalFrameDetalleFormActivosFijos.jPanelcodigoActivosFijos.setVisible(this.activosfijosConstantesFunciones.mostrarcodigoActivosFijos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioActivosFijos() throws Exception {
		if(this.jInternalFrameDetalleFormActivosFijos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormActivosFijos!=null) {
	
		this.jInternalFrameDetalleFormActivosFijos.jLabelidActivosFijos.setEnabled(this.activosfijosConstantesFunciones.activaridActivosFijos);
		this.jInternalFrameDetalleFormActivosFijos.jTextFieldcodigoActivosFijos.setEnabled(this.activosfijosConstantesFunciones.activarcodigoActivosFijos);
		}
	}
	
		
}