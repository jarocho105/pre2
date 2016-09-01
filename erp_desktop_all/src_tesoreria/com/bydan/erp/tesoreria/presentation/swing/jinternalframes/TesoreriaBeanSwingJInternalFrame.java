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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;




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

import com.bydan.erp.tesoreria.util.TesoreriaConstantesFunciones;
import com.bydan.erp.tesoreria.util.TesoreriaParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.TesoreriaParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.TesoreriaBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.tesoreria.resources.reportes.AuxiliarReportes;


import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
public class TesoreriaBeanSwingJInternalFrame extends TesoreriaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TesoreriaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Tesoreria> tesoreriaValidator = new ClassValidator<Tesoreria>(Tesoreria.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Tesoreria tesoreria;	
	public Tesoreria tesoreriaAux;
	public Tesoreria tesoreriaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Tesoreria tesoreriaTotales;
	public Long idTesoreriaActual;
	public Long iIdNuevoTesoreria=0L;
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
	
	public Boolean isPermisoTodoTesoreria;
	public Boolean isPermisoNuevoTesoreria;
	public Boolean isPermisoActualizarTesoreria;
	public Boolean isPermisoActualizarOriginalTesoreria;
	public Boolean isPermisoEliminarTesoreria;
	public Boolean isPermisoGuardarCambiosTesoreria;
	public Boolean isPermisoConsultaTesoreria;
	public Boolean isPermisoBusquedaTesoreria;
	public Boolean isPermisoReporteTesoreria;
	public Boolean isPermisoPaginacionMedioTesoreria;
	public Boolean isPermisoPaginacionAltoTesoreria;
	public Boolean isPermisoPaginacionTodoTesoreria;
	public Boolean isPermisoCopiarTesoreria;
	public Boolean isPermisoVerFormTesoreria;
	public Boolean isPermisoDuplicarTesoreria;
	public Boolean isPermisoOrdenTesoreria;
	
	
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
	
	public TesoreriaParameterReturnGeneral tesoreriaReturnGeneral;
	public TesoreriaParameterReturnGeneral tesoreriaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTesoreria=false;
	public Boolean esParaAccionDesdeFormularioTesoreria=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TesoreriaSessionBeanAdditional tesoreriaSessionBeanAdditional=null;
	
	public TesoreriaSessionBeanAdditional getTesoreriaSessionBeanAdditional() {
		return this.tesoreriaSessionBeanAdditional;
	}
	
	public void setTesoreriaSessionBeanAdditional(TesoreriaSessionBeanAdditional tesoreriaSessionBeanAdditional) {
		try {
			this.tesoreriaSessionBeanAdditional=tesoreriaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TesoreriaBeanSwingJInternalFrameAdditional tesoreriaBeanSwingJInternalFrameAdditional=null;
	//public class TesoreriaBeanSwingJInternalFrame
	
	public TesoreriaBeanSwingJInternalFrameAdditional getTesoreriaBeanSwingJInternalFrameAdditional() {
		return this.tesoreriaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTesoreriaBeanSwingJInternalFrameAdditional(TesoreriaBeanSwingJInternalFrameAdditional tesoreriaBeanSwingJInternalFrameAdditional) {
		try {
			this.tesoreriaBeanSwingJInternalFrameAdditional=tesoreriaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TesoreriaLogic tesoreriaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Tesoreria tesoreriaBean;
	public TesoreriaConstantesFunciones tesoreriaConstantesFunciones;
	//public TesoreriaParameterReturnGeneral tesoreriaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<Tesoreria> tesorerias;	
	//public List<Tesoreria> tesoreriasEliminados;
	//public List<Tesoreria> tesoreriasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTesoreria=false;
	public Boolean isVisibilidadCeldaDuplicarTesoreria=true;
	public Boolean isVisibilidadCeldaCopiarTesoreria=true;
	public Boolean isVisibilidadCeldaVerFormTesoreria=true;
	public Boolean isVisibilidadCeldaOrdenTesoreria=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTesoreria=false;
	public Boolean isVisibilidadCeldaModificarTesoreria=false;
	public Boolean isVisibilidadCeldaActualizarTesoreria=false;
	public Boolean isVisibilidadCeldaEliminarTesoreria=false;
	public Boolean isVisibilidadCeldaCancelarTesoreria=false;
	public Boolean isVisibilidadCeldaGuardarTesoreria=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTesoreria=false;	
	
	
	
	public Long getiIdNuevoTesoreria() {
		return this.iIdNuevoTesoreria;
	}

	public void setiIdNuevoTesoreria(Long iIdNuevoTesoreria) {
		this.iIdNuevoTesoreria = iIdNuevoTesoreria;
	}
	
	public Long getidTesoreriaActual() {
		return this.idTesoreriaActual;
	}

	public void setidTesoreriaActual(Long idTesoreriaActual) {
		this.idTesoreriaActual = idTesoreriaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Tesoreria gettesoreria() {
		return this.tesoreria;
	}

	public void settesoreria(Tesoreria tesoreria) {
		this.tesoreria = tesoreria;
	}
	
	public Tesoreria gettesoreriaAux() {
		return this.tesoreriaAux;
	}

	public void settesoreriaAux(Tesoreria tesoreriaAux) {
		this.tesoreriaAux = tesoreriaAux;
	}				
	
	public Tesoreria gettesoreriaAnterior() {
		return this.tesoreriaAnterior;
	}

	public void settesoreriaAnterior(Tesoreria tesoreriaAnterior) {
		this.tesoreriaAnterior = tesoreriaAnterior;
	}	
	
	public Tesoreria gettesoreriaTotales() {
		return this.tesoreriaTotales;
	}

	public void settesoreriaTotales(Tesoreria tesoreriaTotales) {
		this.tesoreriaTotales = tesoreriaTotales;
	}	
	
	public Tesoreria gettesoreriaBean() {
		return this.tesoreriaBean;
	}

	public void settesoreriaBean(Tesoreria tesoreriaBean) {
		this.tesoreriaBean = tesoreriaBean;
	}	
	
	public TesoreriaParameterReturnGeneral gettesoreriaReturnGeneral() {
		return this.tesoreriaReturnGeneral;
	}

	public void settesoreriaReturnGeneral(TesoreriaParameterReturnGeneral tesoreriaReturnGeneral) {
		this.tesoreriaReturnGeneral = tesoreriaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TesoreriaLogic getTesoreriaLogic()	{		
		return tesoreriaLogic;
	}

	public void setTesoreriaLogic(TesoreriaLogic tesoreriaLogic) {
		this.tesoreriaLogic = tesoreriaLogic;
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
	
	public Boolean getIsEsNuevoTesoreria() {
		return isEsNuevoTesoreria;
	}

	public void setIsEsNuevoTesoreria(Boolean isEsNuevoTesoreria) {
		this.isEsNuevoTesoreria = isEsNuevoTesoreria;
	}

	public Boolean getEsParaAccionDesdeFormularioTesoreria() {
		return esParaAccionDesdeFormularioTesoreria;
	}
	
	public void setEsParaAccionDesdeFormularioTesoreria(Boolean esParaAccionDesdeFormularioTesoreria) {
		this.esParaAccionDesdeFormularioTesoreria = esParaAccionDesdeFormularioTesoreria;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTesoreria() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TesoreriaConstantesFunciones.refrescarForeignKeysDescripcionesTesoreria(this.tesoreriaLogic.getTesorerias());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TesoreriaConstantesFunciones.refrescarForeignKeysDescripcionesTesoreria(this.tesorerias);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tesoreriaLogic.setTesorerias(this.tesorerias);
			tesoreriaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TesoreriaParameterReturnGeneral getTesoreriaParameterGeneral() {
		return this.tesoreriaParameterGeneral;
	}
	
	public void setTesoreriaParameterGeneral(TesoreriaParameterReturnGeneral tesoreriaParameterGeneral) {
		this.tesoreriaParameterGeneral = tesoreriaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTesoreria() {
		return isPermisoTodoTesoreria;
	}

	public void setIsPermisoTodoTesoreria(Boolean isPermisoTodoTesoreria) {
		this.isPermisoTodoTesoreria = isPermisoTodoTesoreria;
	}

	public Boolean getIsPermisoNuevoTesoreria() {
		return isPermisoNuevoTesoreria;
	}

	public void setIsPermisoNuevoTesoreria(Boolean isPermisoNuevoTesoreria) {
		this.isPermisoNuevoTesoreria = isPermisoNuevoTesoreria;
	}

	public Boolean getIsPermisoActualizarTesoreria() {
		return isPermisoActualizarTesoreria;
	}

	public void setIsPermisoActualizarTesoreria(Boolean isPermisoActualizarTesoreria) {
		this.isPermisoActualizarTesoreria = isPermisoActualizarTesoreria;
	}

	public Boolean getIsPermisoEliminarTesoreria() {
		return isPermisoEliminarTesoreria;
	}

	public void setIsPermisoEliminarTesoreria(Boolean isPermisoEliminarTesoreria) {
		this.isPermisoEliminarTesoreria = isPermisoEliminarTesoreria;
	}

	public Boolean getIsPermisoGuardarCambiosTesoreria() {
		return isPermisoGuardarCambiosTesoreria;
	}

	public void setIsPermisoGuardarCambiosTesoreria(Boolean isPermisoGuardarCambiosTesoreria) {
		this.isPermisoGuardarCambiosTesoreria = isPermisoGuardarCambiosTesoreria;
	}
	
	public Boolean getIsPermisoConsultaTesoreria() {
		return isPermisoConsultaTesoreria;
	}

	public void setIsPermisoConsultaTesoreria(Boolean isPermisoConsultaTesoreria) {
		this.isPermisoConsultaTesoreria = isPermisoConsultaTesoreria;
	}

	public Boolean getIsPermisoBusquedaTesoreria() {
		return isPermisoBusquedaTesoreria;
	}

	public void setIsPermisoBusquedaTesoreria(Boolean isPermisoBusquedaTesoreria) {
		this.isPermisoBusquedaTesoreria = isPermisoBusquedaTesoreria;
	}

	public Boolean getIsPermisoReporteTesoreria() {
		return isPermisoReporteTesoreria;
	}

	public void setIsPermisoReporteTesoreria(Boolean isPermisoReporteTesoreria) {
		this.isPermisoReporteTesoreria = isPermisoReporteTesoreria;
	}
	
	public Boolean getIsPermisoPaginacionMedioTesoreria() {
		return isPermisoPaginacionMedioTesoreria;
	}

	public void setIsPermisoPaginacionMedioTesoreria(Boolean isPermisoPaginacionMedioTesoreria) {
		this.isPermisoPaginacionMedioTesoreria = isPermisoPaginacionMedioTesoreria;
	}
	
	public Boolean getIsPermisoPaginacionTodoTesoreria() {
		return isPermisoPaginacionTodoTesoreria;
	}

	public void setIsPermisoPaginacionTodoTesoreria(Boolean isPermisoPaginacionTodoTesoreria) {
		this.isPermisoPaginacionTodoTesoreria = isPermisoPaginacionTodoTesoreria;
	}
	
	public Boolean getIsPermisoPaginacionAltoTesoreria() {
		return isPermisoPaginacionAltoTesoreria;
	}

	public void setIsPermisoPaginacionAltoTesoreria(Boolean isPermisoPaginacionAltoTesoreria) {
		this.isPermisoPaginacionAltoTesoreria = isPermisoPaginacionAltoTesoreria;
	}
	
	public Boolean getIsPermisoCopiarTesoreria() {
		return isPermisoCopiarTesoreria;
	}

	public void setIsPermisoCopiarTesoreria(Boolean isPermisoCopiarTesoreria) {
		this.isPermisoCopiarTesoreria = isPermisoCopiarTesoreria;
	}
	
	public Boolean getIsPermisoVerFormTesoreria() {
		return isPermisoVerFormTesoreria;
	}

	public void setIsPermisoVerFormTesoreria(Boolean isPermisoVerFormTesoreria) {
		this.isPermisoVerFormTesoreria = isPermisoVerFormTesoreria;
	}
	
	public Boolean getIsPermisoDuplicarTesoreria() {
		return isPermisoDuplicarTesoreria;
	}

	public void setIsPermisoDuplicarTesoreria(Boolean isPermisoDuplicarTesoreria) {
		this.isPermisoDuplicarTesoreria = isPermisoDuplicarTesoreria;
	}
	
	public Boolean getIsPermisoOrdenTesoreria() {
		return isPermisoOrdenTesoreria;
	}

	public void setIsPermisoOrdenTesoreria(Boolean isPermisoOrdenTesoreria) {
		this.isPermisoOrdenTesoreria = isPermisoOrdenTesoreria;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTesoreria() {
		return isVisibilidadCeldaNuevoTesoreria;
	}

	public void setIsVisibilidadCeldaNuevoTesoreria(Boolean isVisibilidadCeldaNuevoTesoreria) {
		this.isVisibilidadCeldaNuevoTesoreria = isVisibilidadCeldaNuevoTesoreria;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTesoreria() {
		return isVisibilidadCeldaDuplicarTesoreria;
	}

	public void setIsVisibilidadCeldaDuplicarTesoreria(Boolean isVisibilidadCeldaDuplicarTesoreria) {
		this.isVisibilidadCeldaDuplicarTesoreria = isVisibilidadCeldaDuplicarTesoreria;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTesoreria() {
		return isVisibilidadCeldaCopiarTesoreria;
	}

	public void setIsVisibilidadCeldaCopiarTesoreria(Boolean isVisibilidadCeldaCopiarTesoreria) {
		this.isVisibilidadCeldaCopiarTesoreria = isVisibilidadCeldaCopiarTesoreria;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTesoreria() {
		return isVisibilidadCeldaVerFormTesoreria;
	}

	public void setIsVisibilidadCeldaVerFormTesoreria(Boolean isVisibilidadCeldaVerFormTesoreria) {
		this.isVisibilidadCeldaVerFormTesoreria = isVisibilidadCeldaVerFormTesoreria;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTesoreria() {
		return isVisibilidadCeldaOrdenTesoreria;
	}

	public void setIsVisibilidadCeldaOrdenTesoreria(Boolean isVisibilidadCeldaOrdenTesoreria) {
		this.isVisibilidadCeldaOrdenTesoreria = isVisibilidadCeldaOrdenTesoreria;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTesoreria() {
		return isVisibilidadCeldaNuevoRelacionesTesoreria;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTesoreria(Boolean isVisibilidadCeldaNuevoRelacionesTesoreria) {
		this.isVisibilidadCeldaNuevoRelacionesTesoreria = isVisibilidadCeldaNuevoRelacionesTesoreria;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTesoreria() {
		return isVisibilidadCeldaModificarTesoreria;
	}

	public void setIsVisibilidadCeldaModificarTesoreria(Boolean isVisibilidadCeldaModificarTesoreria) {
		this.isVisibilidadCeldaModificarTesoreria = isVisibilidadCeldaModificarTesoreria;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTesoreria() {
		return isVisibilidadCeldaActualizarTesoreria;
	}

	public void setIsVisibilidadCeldaActualizarTesoreria(Boolean isVisibilidadCeldaActualizarTesoreria) {
		this.isVisibilidadCeldaActualizarTesoreria = isVisibilidadCeldaActualizarTesoreria;
	}

	public Boolean getIsVisibilidadCeldaEliminarTesoreria() {
		return isVisibilidadCeldaEliminarTesoreria;
	}

	public void setIsVisibilidadCeldaEliminarTesoreria(Boolean isVisibilidadCeldaEliminarTesoreria) {
		this.isVisibilidadCeldaEliminarTesoreria = isVisibilidadCeldaEliminarTesoreria;
	}

	public Boolean getIsVisibilidadCeldaCancelarTesoreria() {
		return isVisibilidadCeldaCancelarTesoreria;
	}

	public void setIsVisibilidadCeldaCancelarTesoreria(Boolean isVisibilidadCeldaCancelarTesoreria) {
		this.isVisibilidadCeldaCancelarTesoreria = isVisibilidadCeldaCancelarTesoreria;
	}

	public Boolean getIsVisibilidadCeldaGuardarTesoreria() {
		return isVisibilidadCeldaGuardarTesoreria;
	}

	public void setIsVisibilidadCeldaGuardarTesoreria(Boolean isVisibilidadCeldaGuardarTesoreria) {
		this.isVisibilidadCeldaGuardarTesoreria = isVisibilidadCeldaGuardarTesoreria;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTesoreria() {
		return isVisibilidadCeldaGuardarCambiosTesoreria;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTesoreria(Boolean isVisibilidadCeldaGuardarCambiosTesoreria) {
		this.isVisibilidadCeldaGuardarCambiosTesoreria = isVisibilidadCeldaGuardarCambiosTesoreria;
	}
		
	public TesoreriaSessionBean gettesoreriaSessionBean() {
		return this.tesoreriaSessionBean;
	}
	
	public void settesoreriaSessionBean(TesoreriaSessionBean tesoreriaSessionBean) {
		this.tesoreriaSessionBean=tesoreriaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTesoreria(Tesoreria tesoreria)throws Exception {
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
	
	public void bugActualizarReferenciaActual(Tesoreria tesoreria,Tesoreria tesoreriaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTesoreria(tesoreria);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tesoreriaAux.setId(tesoreria.getId());
		tesoreriaAux.setVersionRow(tesoreria.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTesoreria();
		
			int intSelectedRow = this.jTableDatosTesoreria.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tesoreria =(Tesoreria) this.tesoreriaLogic.getTesorerias().toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tesoreria =(Tesoreria) this.tesorerias.toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TesoreriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTesoreria(this.tesoreria,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTesoreria(this.tesoreria);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tesoreriaValidator.getInvalidValues(this.tesoreria);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tesoreriaLogic.setDatosCliente(datosCliente);
			tesoreriaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tesoreriaAux=new  Tesoreria();
				
				tesoreriaAux.setIsNew(true);
				tesoreriaAux.setIsChanged(true);
				
				tesoreriaAux.setTesoreriaOriginal(this.tesoreria);
				
				tesoreriaAux.setId(this.tesoreria.getId());	
				tesoreriaAux.setVersionRow(this.tesoreria.getVersionRow());	
				tesoreriaAux.setcodigo(this.tesoreria.getcodigo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tesoreriaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tesoreriaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tesoreriaAux,tesoreriaLogic.getTesorerias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tesoreriaAux,tesorerias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tesoreriaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tesoreriaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tesoreriaLogic.saveTesorerias();//WithConnection
						//tesoreriaLogic.getSetVersionRowTesorerias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tesoreria,tesoreriaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tesoreriaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tesoreriaLogic.saveTesoreriaRelaciones(tesoreriaAux);//WithConnection
								//tesoreriaLogic.getSetVersionRowTesorerias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tesoreria,tesoreriaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tesoreriaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tesoreriaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tesoreriaAux,tesoreriaLogic.getTesorerias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tesoreriaAux,tesorerias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tesoreria,tesoreriaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tesoreriaAux=new  Tesoreria();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tesoreriaSessionBean.getEsGuardarRelacionado() 
					|| (this.tesoreriaSessionBean.getEsGuardarRelacionado() && this.tesoreria.getId()>=0)) {
						
					tesoreriaAux.setIsNew(false);
				}
				
				tesoreriaAux.setIsDeleted(false);
			
				tesoreriaAux.setId(this.tesoreria.getId());	
				tesoreriaAux.setVersionRow(this.tesoreria.getVersionRow());	
				tesoreriaAux.setcodigo(this.tesoreria.getcodigo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tesoreriaAux,tesoreriaLogic.getTesorerias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tesoreriaAux,tesorerias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tesoreriaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tesoreriaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tesoreriaLogic.saveTesorerias();//WithConnection
						//tesoreriaLogic.getSetVersionRowTesorerias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tesoreria,tesoreriaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tesoreriaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tesoreriaLogic.saveTesoreriaRelaciones(tesoreriaAux);//WithConnection
								//tesoreriaLogic.getSetVersionRowTesorerias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tesoreria,tesoreriaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tesoreriaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tesoreriaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tesoreriaAux,tesoreriaLogic.getTesorerias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tesoreriaAux,tesorerias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tesoreria,tesoreriaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tesoreriaAux=new  Tesoreria();
				
				tesoreriaAux.setIsNew(false);
				tesoreriaAux.setIsChanged(false);
				
				tesoreriaAux.setIsDeleted(true);
				
				tesoreriaAux.setId(this.tesoreria.getId());	
				tesoreriaAux.setVersionRow(this.tesoreria.getVersionRow());	
				tesoreriaAux.setcodigo(this.tesoreria.getcodigo());	
				
				if(this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tesoreriaAux.getId()>=0) {	
						this.tesoreriasEliminados.add(tesoreriaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tesoreriaAux,tesoreriaLogic.getTesorerias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tesoreriaAux,tesorerias);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tesoreriaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tesoreriaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tesoreriaLogic.saveTesorerias();//WithConnection
						//tesoreriaLogic.getSetVersionRowTesorerias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tesoreriaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tesoreriaLogic.saveTesoreriaRelaciones(tesoreriaAux);//WithConnection
								//tesoreriaLogic.getSetVersionRowTesorerias();//WithConnection
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
							if(this.tesoreriaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tesoreriaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tesoreriaAux,tesoreriaLogic.getTesorerias());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tesoreriaAux,tesorerias);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tesoreriaLogic.getTesorerias().addAll(this.tesoreriasEliminados);
					
					tesoreriaLogic.saveTesorerias();//WithConnection
					//tesoreriaLogic.getSetVersionRowTesorerias();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tesoreriasEliminados= new ArrayList<Tesoreria>();		
			}
			
			if(this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tesoreriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tesoreria GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tesoreria",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tesoreria=tesoreriaAux;
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
      		//this.finishProcessTesoreria();
      	}
		
	}	
	
	public void actualizarRelaciones(Tesoreria tesoreriaLocal) throws Exception {
		
		if(this.tesoreriaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Tesoreria tesoreriaLocal) throws Exception {	
		if(this.tesoreriaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTesoreriaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTesoreria.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tesoreria =(Tesoreria) this.tesoreriaLogic.getTesorerias().toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tesoreria =(Tesoreria) this.tesorerias.toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tesoreriaValidator.getInvalidValues(this.tesoreria);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Tesoreria tesoreria,List<Tesoreria> tesorerias) throws Exception {
		try	{		
			TesoreriaConstantesFunciones.actualizarLista(tesoreria,tesorerias,this.tesoreriaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Tesoreria tesoreria,List<Tesoreria> tesorerias) throws Exception {
		try	{			
			TesoreriaConstantesFunciones.actualizarSelectedLista(tesoreria,tesorerias);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Tesoreria> tesoreriasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tesoreriasLocal=this.tesoreriaLogic.getTesorerias();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tesoreriasLocal=this.tesorerias;
			}
			//ARCHITECTURE
		
			for(Tesoreria tesoreriaLocal:tesoreriasLocal) {
				if(this.permiteMantenimiento(tesoreriaLocal) && tesoreriaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TesoreriaConstantesFunciones.getTesoreriaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TesoreriaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTesoreria.jLabelcodigoTesoreria,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTesoreria!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTesoreria.jLabelcodigoTesoreria,"");
		
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
		this.iIdNuevoTesoreria--;	
		
		
		this.tesoreriaAux=new Tesoreria();
		
		this.tesoreriaAux.setId(this.iIdNuevoTesoreria);
		this.tesoreriaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tesoreriaLogic.getTesorerias().add(this.tesoreriaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tesorerias.add(this.tesoreriaAux);
		}
		//ARCHITECTURE
		
		this.tesoreria=this.tesoreriaAux;
		
		if(TesoreriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTesoreria(this.tesoreria);
			this.setVariablesObjetoActualToFormularioForeignKeyTesoreria(this.tesoreria);
		}
				
		//this.setDefaultControlesTesoreria();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTesoreria();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTesoreria();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTesoreria();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTesoreria(this.tesoreriaBean,this.tesoreria,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTesoreria(this.tesoreria);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTesoreria(this.tesoreriaReturnGeneral,this.tesoreriaBean,false);
		
		if(this.tesoreriaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTesoreria(this.tesoreriaReturnGeneral.getTesoreria());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTesoreria(this.tesoreriaReturnGeneral.getTesoreria());
		}
		
		if(this.tesoreriaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTesoreria(this.tesoreriaReturnGeneral.getTesoreria(),classes);//this.tesoreriaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTesoreria(this.tesoreria,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTesoreria();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTesoreria();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TesoreriaBeanSwingJInternalFrameAdditional.RecargarFormTesoreria(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTesoreria(false);
						
			if(tesoreriaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TesoreriaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTesoreria();
			}
			
			this.actualizarVisualTableDatosTesoreria();
			
			this.jTableDatosTesoreria.setRowSelectionInterval(this.getIndiceNuevoTesoreria(), this.getIndiceNuevoTesoreria());
			
			this.seleccionarFilaTablaTesoreriaActual();
						
			this.actualizarEstadoCeldasBotonesTesoreria("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTesoreria(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTesoreria.jTextFieldcodigoTesoreria.setEnabled(isHabilitar && this.tesoreriaConstantesFunciones.activarcodigoTesoreria);	
		
	};
	
	public void setDefaultControlesTesoreria() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTesoreria(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tesoreriaSessionBean.setConGuardarRelaciones(true);			
			this.tesoreriaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTesoreria.jTabbedPaneRelacionesTesoreria.setVisible(true);
			
					
		} else {
			//this.tesoreriaSessionBean.setConGuardarRelaciones(false);			
			this.tesoreriaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTesoreria.jTabbedPaneRelacionesTesoreria.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTesoreria() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Tesoreria tesoreriaAux:this.tesoreriaLogic.getTesorerias()) {
				if(tesoreriaAux.getId().equals(this.iIdNuevoTesoreria)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Tesoreria tesoreriaAux:this.tesorerias) {
				if(tesoreriaAux.getId().equals(this.iIdNuevoTesoreria)) {
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
	
	public int getIndiceActualTesoreria(Tesoreria tesoreria,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Tesoreria tesoreriaAux:this.tesoreriaLogic.getTesorerias()) {
				if(tesoreriaAux.getId().equals(tesoreria.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Tesoreria tesoreriaAux:this.tesorerias) {
				if(tesoreriaAux.getId().equals(tesoreria.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTesoreria(Tesoreria tesoreriaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Tesoreria tesoreriaAux:this.tesoreriaLogic.getTesorerias()) {
				if(tesoreriaAux.getTesoreriaOriginal().getId().equals(tesoreriaOriginal.getId())) {
					existe=true;
					tesoreriaOriginal.setId(tesoreriaAux.getId());
					tesoreriaOriginal.setVersionRow(tesoreriaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Tesoreria tesoreriaAux:this.tesorerias) {
				if(tesoreriaAux.getTesoreriaOriginal().getId().equals(tesoreriaOriginal.getId())) {
					existe=true;
					tesoreriaOriginal.setId(tesoreriaAux.getId());
					tesoreriaOriginal.setVersionRow(tesoreriaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTesoreria(Boolean esParaCancelar) throws Exception {
		tesoreriasAux=new ArrayList<Tesoreria>();
		tesoreriaAux=new Tesoreria();
		
		if(!this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Tesoreria tesoreriaAux:this.tesoreriaLogic.getTesorerias()) {
					if(tesoreriaAux.getId()<0) {
						tesoreriasAux.add(tesoreriaAux);
					}		
				}
				this.iIdNuevoTesoreria=0L;
				this.tesoreriaLogic.getTesorerias().removeAll(tesoreriasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Tesoreria tesoreriaAux:this.tesorerias) {
					if(tesoreriaAux.getId()<0) {
						tesoreriasAux.add(tesoreriaAux);
					}		
				}
				this.iIdNuevoTesoreria=0L;
				this.tesorerias.removeAll(tesoreriasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTesoreria 
					&& this.tesoreriaLogic.getTesorerias().size()>0
					) {
					tesoreriaAux=this.tesoreriaLogic.getTesorerias().get(this.tesoreriaLogic.getTesorerias().size() - 1);
				
					if(tesoreriaAux.getId()<0) {
						this.tesoreriaLogic.getTesorerias().remove(tesoreriaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTesoreria && this.tesorerias.size()>0) {
					tesoreriaAux=this.tesorerias.get(this.tesorerias.size() - 1);
				
					if(tesoreriaAux.getId()<0) {
						this.tesorerias.remove(tesoreriaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTesoreria(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tesoreria.getId()<0) {
				this.tesoreriaLogic.getTesorerias().remove(this.tesoreria);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tesoreria.getId()<0) {
				this.tesorerias.remove(this.tesoreria);
			}
		}			
	}
	
	public void setEstadosInicialesTesoreria(List<Tesoreria> tesoreriasAux) throws Exception {
		TesoreriaConstantesFunciones.setEstadosInicialesTesoreria(tesoreriasAux);
	}
	
	public void setEstadosInicialesTesoreria(Tesoreria tesoreriaAux) throws Exception {
		TesoreriaConstantesFunciones.setEstadosInicialesTesoreria(tesoreriaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTesoreriaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTesoreria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTesoreriaActual()) {
				if(!this.isEsNuevoTesoreria) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTesoreria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTesoreria=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTesoreriaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tesoreria ?", "MANTENIMIENTO DE Tesoreria", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTesoreria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Tesoreria tesoreria) throws Exception {
		TesoreriaConstantesFunciones.seleccionarAsignar(this.tesoreria,tesoreria);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTesoreria=this.isPermisoActualizarOriginalTesoreria;
			
			
			this.seleccionarAsignar(tesoreria);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TesoreriaConstantesFunciones.quitarEspaciosTesoreria(this.tesoreria,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTesoreria("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tesoreriaSessionBean.setsFuncionBusquedaRapida(this.tesoreriaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTesoreria) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTesoreria(esParaCancelar);				
				this.cancelarNuevoTesoreria(esParaCancelar);								
			}
			
			this.tesoreria=new Tesoreria();
			
			this.inicializarTesoreria();
			
			this.actualizarEstadoCeldasBotonesTesoreria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTesoreria() throws Exception {
		try {
			TesoreriaConstantesFunciones.inicializarTesoreria(this.tesoreria);
			
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
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tesoreriaLogic.getTesorerias().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTesorerias(String sAccionBusqueda,List<Tesoreria> tesoreriasParaReportes) throws Exception {
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
					sPathReporteFinal="Tesoreria"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TesoreriaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TesoreriaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Tesoreria"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tesorerias");		
		parameters.put("busquedapor", TesoreriaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTesoreria=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TesoreriaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TesoreriaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTesoreria=new JRBeanArrayDataSource(TesoreriaJInternalFrame.TraerTesoreriaBeans(tesoreriasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTesoreria);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TesoreriaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TesoreriaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TesoreriaBean.TraerTesoreriaBeans(tesoreriasParaReportes).toArray()));
							
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
				this.generarExcelReporteTesorerias(sAccionBusqueda,sTipoArchivoReporte,tesoreriasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTesorerias(sAccionBusqueda,sTipoArchivoReporte,tesoreriasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTesoreriaActionPerformed(null);
					//this.generarExcelReporteTesorerias(sAccionBusqueda,sTipoArchivoReporte,tesoreriasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTesorerias(sAccionBusqueda,sTipoArchivoReporte,tesoreriasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTesorerias(sAccionBusqueda,sTipoArchivoReporte,tesoreriasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTesorerias(sAccionBusqueda,sTipoArchivoReporte,tesoreriasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTesorerias(String sAccionBusqueda,String sTipoArchivoReporte,List<Tesoreria> tesoreriasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tesoreria";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Tesorerias");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTesoreria("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Tesoreria tesoreria : tesoreriasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TesoreriaConstantesFunciones.generarExcelReporteDataTesoreria("NORMAL",row,workbook,tesoreria,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tesoreriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tesoreria",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTesoreria(String sTipo,Row row,Workbook workbook) {
		
		TesoreriaConstantesFunciones.generarExcelReporteHeaderTesoreria(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTesorerias(String sAccionBusqueda,String sTipoArchivoReporte,List<Tesoreria> tesoreriasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tesoreria_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Tesorerias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Tesoreria tesoreria : tesoreriasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TesoreriaConstantesFunciones.getTesoreriaDescripcion(tesoreria));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TesoreriaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TesoreriaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tesoreria.getcodigo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tesoreriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tesoreria",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTesorerias(String sAccionBusqueda,String sTipoArchivoReporte,List<Tesoreria> tesoreriasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Tesoreria> tesoreriasRespaldo=null;
		
		classes=TesoreriaConstantesFunciones.getClassesRelationshipsOfTesoreria(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tesoreriaLogic.setDatosCliente(this.datosCliente);
		this.tesoreriaLogic.setDatosDeep(this.datosDeep);
		this.tesoreriaLogic.setIsConDeep(true);
		
		tesoreriasRespaldo=this.tesoreriaLogic.getTesorerias();
		
		this.tesoreriaLogic.setTesorerias(tesoreriasParaReportes);	
		this.tesoreriaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tesoreriasParaReportes=this.tesoreriaLogic.getTesorerias();
		this.tesoreriaLogic.setTesorerias(tesoreriasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tesoreria_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Tesorerias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTesoreria("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Tesoreria tesoreria : tesoreriasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTesoreria("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TesoreriaConstantesFunciones.generarExcelReporteDataTesoreria("NORMAL",row,workbook,tesoreria,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TesoreriaConstantesFunciones.getTesoreriaDescripcion(tesoreria));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tesoreriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tesoreria",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTesoreria.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTesoreria.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTesoreria.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTesoreria.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTesoreria() throws Exception {		
		this.startProcessTesoreria(true);
	}
	
	public void startProcessTesoreria(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTesoreria, this.jScrollPanelDatosTesoreria,this.jPanelPaginacionTesoreria, this.jScrollPanelDatosEdicionTesoreria, this.jPanelAccionesTesoreria,this.jPanelAccionesFormularioTesoreria,this.jmenuBarTesoreria,this.jmenuBarDetalleTesoreria,this.jTtoolBarTesoreria,this.jTtoolBarDetalleTesoreria);		
		
		final JTabbedPane jTabbedPaneBusquedasTesoreria=null; 
		
		final JPanel jPanelParametrosReportesTesoreria=this.jPanelParametrosReportesTesoreria;
		//final JScrollPane jScrollPanelDatosTesoreria=this.jScrollPanelDatosTesoreria;
		final JTable jTableDatosTesoreria=this.jTableDatosTesoreria;		
		final JPanel jPanelPaginacionTesoreria=this.jPanelPaginacionTesoreria;
		//final JScrollPane jScrollPanelDatosEdicionTesoreria=this.jScrollPanelDatosEdicionTesoreria;
		final JPanel jPanelAccionesTesoreria=this.jPanelAccionesTesoreria;
		
		JPanel jPanelCamposAuxiliarTesoreria=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTesoreria=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTesoreria!=null) {
			jPanelCamposAuxiliarTesoreria=this.jInternalFrameDetalleFormTesoreria.jPanelCamposTesoreria;
			jPanelAccionesFormularioAuxiliarTesoreria=this.jInternalFrameDetalleFormTesoreria.jPanelAccionesFormularioTesoreria;
		}
		
		final JPanel jPanelCamposTesoreria=jPanelCamposAuxiliarTesoreria;
		final JPanel jPanelAccionesFormularioTesoreria=jPanelAccionesFormularioAuxiliarTesoreria;
		
		
		final JMenuBar jmenuBarTesoreria=this.jmenuBarTesoreria;
		final JToolBar jTtoolBarTesoreria=this.jTtoolBarTesoreria;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTesoreria=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTesoreria=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTesoreria!=null) {
			jmenuBarDetalleAuxiliarTesoreria=this.jInternalFrameDetalleFormTesoreria.jmenuBarDetalleTesoreria;
			jTtoolBarDetalleAuxiliarTesoreria=this.jInternalFrameDetalleFormTesoreria.jTtoolBarDetalleTesoreria;
		}
		
		final JMenuBar jmenuBarDetalleTesoreria=jmenuBarDetalleAuxiliarTesoreria;
		final JToolBar jTtoolBarDetalleTesoreria=jTtoolBarDetalleAuxiliarTesoreria;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTesoreria;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTesoreria;
			processRunnable.jTableDatos=jTableDatosTesoreria;
			processRunnable.jPanelCampos=jPanelCamposTesoreria;
			processRunnable.jPanelPaginacion=jPanelPaginacionTesoreria;
			processRunnable.jPanelAcciones=jPanelAccionesTesoreria;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTesoreria;
			
			
			processRunnable.jmenuBar=jmenuBarTesoreria;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTesoreria;
			processRunnable.jTtoolBar=jTtoolBarTesoreria;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTesoreria;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTesoreria ,jPanelParametrosReportesTesoreria,jTableDatosTesoreria, /*jScrollPanelDatosTesoreria,*/jPanelCamposTesoreria,jPanelPaginacionTesoreria, /*jScrollPanelDatosEdicionTesoreria,*/ jPanelAccionesTesoreria,jPanelAccionesFormularioTesoreria,jmenuBarTesoreria,jmenuBarDetalleTesoreria,jTtoolBarTesoreria,jTtoolBarDetalleTesoreria);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTesoreria, jScrollPanelDatosTesoreria,jPanelPaginacionTesoreria, jScrollPanelDatosEdicionTesoreria, jPanelAccionesTesoreria,jPanelAccionesFormularioTesoreria,jmenuBarTesoreria,jmenuBarDetalleTesoreria,jTtoolBarTesoreria,jTtoolBarDetalleTesoreria);
						
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
	
	public void finishProcessTesoreria() {// throws Exception 
		this.finishProcessTesoreria(true);
	}
	
	public void finishProcessTesoreria(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTesoreria, this.jScrollPanelDatosTesoreria,this.jPanelPaginacionTesoreria, this.jScrollPanelDatosEdicionTesoreria, this.jPanelAccionesTesoreria,this.jPanelAccionesFormularioTesoreria,this.jmenuBarTesoreria,this.jmenuBarDetalleTesoreria,this.jTtoolBarTesoreria,this.jTtoolBarDetalleTesoreria);		
		
		final JTabbedPane jTabbedPaneBusquedasTesoreria=null; 
		
		final JPanel jPanelParametrosReportesTesoreria=this.jPanelParametrosReportesTesoreria;
		//final JScrollPane jScrollPanelDatosTesoreria=this.jScrollPanelDatosTesoreria;
		final JTable jTableDatosTesoreria=this.jTableDatosTesoreria;		
		final JPanel jPanelPaginacionTesoreria=this.jPanelPaginacionTesoreria;
		//final JScrollPane jScrollPanelDatosEdicionTesoreria=this.jScrollPanelDatosEdicionTesoreria;
		final JPanel jPanelAccionesTesoreria=this.jPanelAccionesTesoreria;
		
		JPanel jPanelCamposAuxiliarTesoreria=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTesoreria=new JPanel();
		
		if(this.jInternalFrameDetalleFormTesoreria!=null) {
			jPanelCamposAuxiliarTesoreria=this.jInternalFrameDetalleFormTesoreria.jPanelCamposTesoreria;
			jPanelAccionesFormularioAuxiliarTesoreria=this.jInternalFrameDetalleFormTesoreria.jPanelAccionesFormularioTesoreria;
		}
		
		final JPanel jPanelCamposTesoreria=jPanelCamposAuxiliarTesoreria;
		final JPanel jPanelAccionesFormularioTesoreria=jPanelAccionesFormularioAuxiliarTesoreria;
		
		
		final JMenuBar jmenuBarTesoreria=this.jmenuBarTesoreria;		
		final JToolBar jTtoolBarTesoreria=this.jTtoolBarTesoreria;
				
		JMenuBar jmenuBarDetalleAuxiliarTesoreria=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTesoreria=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTesoreria!=null) {
			jmenuBarDetalleAuxiliarTesoreria=this.jInternalFrameDetalleFormTesoreria.jmenuBarDetalleTesoreria;
			jTtoolBarDetalleAuxiliarTesoreria=this.jInternalFrameDetalleFormTesoreria.jTtoolBarDetalleTesoreria;		
		}
		
		final JMenuBar jmenuBarDetalleTesoreria=jmenuBarDetalleAuxiliarTesoreria;
		final JToolBar jTtoolBarDetalleTesoreria=jTtoolBarDetalleAuxiliarTesoreria;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTesoreria;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTesoreria;
			processRunnable.jTableDatos=jTableDatosTesoreria;
			processRunnable.jPanelCampos=jPanelCamposTesoreria;
			processRunnable.jPanelPaginacion=jPanelPaginacionTesoreria;
			processRunnable.jPanelAcciones=jPanelAccionesTesoreria;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTesoreria;
			
			
			processRunnable.jmenuBar=jmenuBarTesoreria;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTesoreria;
			processRunnable.jTtoolBar=jTtoolBarTesoreria;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTesoreria;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTesoreria ,jPanelParametrosReportesTesoreria, jTableDatosTesoreria,/*jScrollPanelDatosTesoreria,*/jPanelCamposTesoreria,jPanelPaginacionTesoreria, /*jScrollPanelDatosEdicionTesoreria,*/ jPanelAccionesTesoreria,jPanelAccionesFormularioTesoreria,jmenuBarTesoreria,jmenuBarDetalleTesoreria,jTtoolBarTesoreria,jTtoolBarDetalleTesoreria));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTesoreria(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTesoreria(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTesoreria(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTesoreria(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTesoreria,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTesoreria,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTesoreria(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTesoreria,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTesoreria,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tesoreriaConstantesFunciones.getsFinalQueryTesoreria();
		String  finalQueryPaginacionTodos=this.tesoreriaConstantesFunciones.getsFinalQueryTesoreria();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TesoreriaConstantesFunciones.getArrayColumnasGlobalesNoTesoreria(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TesoreriaConstantesFunciones.getArrayColumnasGlobalesTesoreria(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TesoreriaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tesoreriasEliminados= new ArrayList<Tesoreria>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTesoreria();
		
				///*TesoreriaSessionBean*/this.tesoreriaSessionBean=new TesoreriaSessionBean();
			
			if(this.tesoreriaSessionBean==null) {
				this.tesoreriaSessionBean=new TesoreriaSessionBean();
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
					this.iNumeroPaginacion=TesoreriaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TesoreriaConstantesFunciones.getClassesForeignKeysOfTesoreria(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tesoreria."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tesoreriasAux= new ArrayList<Tesoreria>();
			
				
			tesoreriaLogic.setDatosCliente(this.datosCliente);
			tesoreriaLogic.setDatosDeep(this.datosDeep);
			tesoreriaLogic.setIsConDeep(true);
			
			
			tesoreriaLogic.getTesoreriaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tesoreriaLogic.getTodosTesorerias(finalQueryGlobal,pagination);
					
					//tesoreriaLogic.getTodosTesoreriasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tesoreriaLogic.getTesorerias()==null|| tesoreriaLogic.getTesorerias().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tesoreriasAux= new ArrayList<Tesoreria>();
							tesoreriasAux.addAll(tesoreriaLogic.getTesorerias());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tesoreriasAux= new ArrayList<Tesoreria>();
							tesoreriasAux.addAll(tesorerias);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tesoreriaLogic.getTodosTesorerias(finalQueryGlobal+"",this.pagination);												
							
							//tesoreriaLogic.getTodosTesoreriasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTesorerias("Todos",tesoreriaLogic.getTesorerias() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tesoreriaLogic.setTesorerias(new ArrayList<Tesoreria>());					
							tesoreriaLogic.getTesorerias().addAll(tesoreriasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tesorerias=new ArrayList<Tesoreria>();
							tesorerias.addAll(tesoreriasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTesoreria=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTesoreria=this.idActual;
				
				} else if(this.idTesoreriaActual!=null && this.idTesoreriaActual!=0L) {
					idTesoreria=idTesoreriaActual;
				}
				
					
				this.sDetalleReporte=TesoreriaConstantesFunciones.getDetalleIndicePorId(idTesoreria);
				
				this.tesorerias=new ArrayList<Tesoreria>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tesoreriaLogic.getEntity(idTesoreria);
					
					//tesoreriaLogic.getEntityWithConnection(idTesoreria);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tesoreriaLogic.setTesorerias(new ArrayList<Tesoreria>());
					tesoreriaLogic.getTesorerias().add(tesoreriaLogic.getTesoreria());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tesorerias=new ArrayList<Tesoreria>();
					this.tesorerias.add(tesoreria);
				}
				
				if(tesoreriaLogic.getTesoreria()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTesoreria();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTesoreria();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tesoreriaLogic.getTesorerias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tesorerias.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tesoreriaLogic.getTesorerias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tesorerias.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Tesoreria tesoreria) {
		Boolean permite=true;
		
		if(this.tesoreria.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TesoreriaConstantesFunciones.getOrderByListaTesoreria();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TesoreriaConstantesFunciones.getOrderByListaTesoreria();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Tesoreria tesoreria:tesoreriaLogic.getTesorerias()) {
				if(tesoreria.getsType().equals(Constantes2.S_TOTALES)) {
					tesoreriaTotales=tesoreria;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Tesoreria tesoreria:this.tesorerias) {
				if(tesoreria.getsType().equals(Constantes2.S_TOTALES)) {
					tesoreriaTotales=tesoreria;
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
			this.tesoreriaAux=new Tesoreria();
			this.tesoreriaAux.setsType(Constantes2.S_TOTALES);
			this.tesoreriaAux.setIsNew(false);
			this.tesoreriaAux.setIsChanged(false);
			this.tesoreriaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TesoreriaConstantesFunciones.TotalizarValoresFilaTesoreria(this.tesoreriaLogic.getTesorerias(),this.tesoreriaAux);
				
				this.tesoreriaLogic.getTesorerias().add(this.tesoreriaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TesoreriaConstantesFunciones.TotalizarValoresFilaTesoreria(this.tesorerias,this.tesoreriaAux);
				
				this.tesorerias.add(this.tesoreriaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tesoreriaTotales=new Tesoreria();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tesoreriaLogic.getTesorerias().remove(tesoreriaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tesorerias.remove(tesoreriaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tesoreriaTotales=new Tesoreria();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Tesoreria tesoreria:tesoreriaLogic.getTesorerias()) {
				if(tesoreria.getsType().equals(Constantes2.S_TOTALES)) {
					tesoreriaTotales=tesoreria;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TesoreriaConstantesFunciones.TotalizarValoresFilaTesoreria(this.tesoreriaLogic.getTesorerias(),tesoreriaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Tesoreria tesoreria:this.tesorerias) {
				if(tesoreria.getsType().equals(Constantes2.S_TOTALES)) {
					tesoreriaTotales=tesoreria;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TesoreriaConstantesFunciones.TotalizarValoresFilaTesoreria(this.tesorerias,tesoreriaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTesoreria() {
		this.isPermisoTodoTesoreria=false;
		this.isPermisoNuevoTesoreria=false;
		this.isPermisoActualizarTesoreria=false;
		this.isPermisoActualizarOriginalTesoreria=false;
		this.isPermisoEliminarTesoreria=false;
		this.isPermisoGuardarCambiosTesoreria=false;
		this.isPermisoConsultaTesoreria=false;
		this.isPermisoBusquedaTesoreria=false;
		this.isPermisoReporteTesoreria=false;		
		this.isPermisoOrdenTesoreria=false;		
		this.isPermisoPaginacionMedioTesoreria=false;		
		this.isPermisoPaginacionAltoTesoreria=false;
		this.isPermisoPaginacionTodoTesoreria=false;
		this.isPermisoCopiarTesoreria=false;		
		this.isPermisoVerFormTesoreria=false;		
		this.isPermisoDuplicarTesoreria=false;		
		this.isPermisoOrdenTesoreria=false;		
	}
	
	public void setPermisosUsuarioTesoreria(Boolean isPermiso) {
		this.isPermisoTodoTesoreria=isPermiso;
		this.isPermisoNuevoTesoreria=isPermiso;
		this.isPermisoActualizarTesoreria=isPermiso;
		this.isPermisoActualizarOriginalTesoreria=isPermiso;
		this.isPermisoEliminarTesoreria=isPermiso;
		this.isPermisoGuardarCambiosTesoreria=isPermiso;
		this.isPermisoConsultaTesoreria=isPermiso;
		this.isPermisoBusquedaTesoreria=isPermiso;
		this.isPermisoReporteTesoreria=isPermiso;
		this.isPermisoOrdenTesoreria=isPermiso;		
		this.isPermisoPaginacionMedioTesoreria=isPermiso;		
		this.isPermisoPaginacionAltoTesoreria=isPermiso;		
		this.isPermisoPaginacionTodoTesoreria=isPermiso;		
		this.isPermisoCopiarTesoreria=isPermiso;		
		this.isPermisoVerFormTesoreria=isPermiso;		
		this.isPermisoDuplicarTesoreria=isPermiso;
		this.isPermisoOrdenTesoreria=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTesoreria(Boolean isPermiso) {
		//this.isPermisoTodoTesoreria=isPermiso;
		this.isPermisoNuevoTesoreria=isPermiso;
		this.isPermisoActualizarTesoreria=isPermiso;
		this.isPermisoActualizarOriginalTesoreria=isPermiso;
		this.isPermisoEliminarTesoreria=isPermiso;
		this.isPermisoGuardarCambiosTesoreria=isPermiso;
		//this.isPermisoConsultaTesoreria=isPermiso;
		//this.isPermisoBusquedaTesoreria=isPermiso;
		//this.isPermisoReporteTesoreria=isPermiso;
		//this.isPermisoOrdenTesoreria=isPermiso;		
		//this.isPermisoPaginacionMedioTesoreria=isPermiso;		
		//this.isPermisoPaginacionAltoTesoreria=isPermiso;		
		//this.isPermisoPaginacionTodoTesoreria=isPermiso;		
		//this.isPermisoCopiarTesoreria=isPermiso;		
		//this.isPermisoDuplicarTesoreria=isPermiso;
		//this.isPermisoOrdenTesoreria=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTesoreriaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TesoreriaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTesoreria(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTesoreriaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTesoreriaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTesoreriaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTesoreriaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTesoreria() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TesoreriaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TesoreriaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTesoreria=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTesoreria=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTesoreria=this.isPermisoActualizarTesoreria;
			this.isPermisoEliminarTesoreria=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTesoreria=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTesoreria=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTesoreria=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTesoreria=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTesoreria=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTesoreria=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTesoreria=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTesoreria=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTesoreria=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTesoreria=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTesoreria=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTesoreria=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTesoreria=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTesoreria.setToolTipText(this.jTableDatosTesoreria.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTesoreria(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTesoreria(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TesoreriaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TesoreriaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTesoreria() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTesoreriaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTesoreriaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TesoreriaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTesoreriaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTesoreriaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTesoreria()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTesoreria()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTesoreria(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTesoreria()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTesoreria();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTesoreria(Tesoreria tesoreria)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTesoreria(Tesoreria tesoreria,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTesoreria()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTesoreria()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTesoreria()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTesoreria()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTesoreria()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTesoreria()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTesoreria(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTesoreria()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TesoreriaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TesoreriaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TesoreriaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tesoreriaSessionBean=new TesoreriaSessionBean(); 
		this.tesoreriaConstantesFunciones=new TesoreriaConstantesFunciones(); 
		this.tesoreriaBean=new Tesoreria();//(this.tesoreriaConstantesFunciones); 		
		this.tesoreriaReturnGeneral=new TesoreriaParameterReturnGeneral(); 
		
		this.tesoreriaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tesoreriaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TesoreriaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TesoreriaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TesoreriaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTesoreria(true);
			
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
			
			this.tesoreriaConstantesFunciones=new TesoreriaConstantesFunciones(); 
			this.tesoreriaBean=new Tesoreria();//this.tesoreriaConstantesFunciones); 			
			this.tesoreriaReturnGeneral=new TesoreriaParameterReturnGeneral(); 
		
			TesoreriaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tesoreria Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tesoreria=new Tesoreria();
			this.tesorerias = new ArrayList<Tesoreria>();
			this.tesoreriasAux = new ArrayList<Tesoreria>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic=new TesoreriaLogic();
				this.tesoreriaLogic.getNewConnexionToDeep("");
			}
			
			//this.tesoreriaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tesoreriaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTesoreria);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTesoreria!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTesoreria);	
					}
					
					if(this.jInternalFrameImportacionTesoreria!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTesoreria);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTesoreria!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTesoreria);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTesoreria!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTesoreria);
				this.jInternalFrameDetalleFormTesoreria.setVisible(false);
				this.jInternalFrameDetalleFormTesoreria.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTesoreria!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTesoreria);
					this.jInternalFrameReporteDinamicoTesoreria.setVisible(false);
					this.jInternalFrameReporteDinamicoTesoreria.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTesoreria!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTesoreria);
					this.jInternalFrameImportacionTesoreria.setVisible(false);
					this.jInternalFrameImportacionTesoreria.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTesoreria!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTesoreria);
					this.jInternalFrameOrderByTesoreria.setVisible(false);
					this.jInternalFrameOrderByTesoreria.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTesoreriaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TesoreriaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tesoreriaReturnGeneral=new TesoreriaParameterReturnGeneral();
			
			this.tesoreriaParameterGeneral=new TesoreriaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tesoreriaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TesoreriaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TesoreriaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tesoreriaSessionBean.getEsGuardarRelacionado(),this.tesoreriaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TesoreriaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tesoreriaSessionBean.getEsGuardarRelacionado(),this.tesoreriaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTesoreria=false;
			this.isVisibilidadCeldaDuplicarTesoreria=true;
			this.isVisibilidadCeldaCopiarTesoreria=true;
			this.isVisibilidadCeldaVerFormTesoreria=true;
			this.isVisibilidadCeldaOrdenTesoreria=true;
			this.isVisibilidadCeldaNuevoRelacionesTesoreria=false;
			this.isVisibilidadCeldaModificarTesoreria=false;
			this.isVisibilidadCeldaActualizarTesoreria=false;
			this.isVisibilidadCeldaEliminarTesoreria=false;
			this.isVisibilidadCeldaCancelarTesoreria=false;
			this.isVisibilidadCeldaGuardarTesoreria=false;
			this.isVisibilidadCeldaGuardarCambiosTesoreria=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTesoreria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTesoreria();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTesoreria(false);
			
			this.setPermisosUsuarioTesoreria();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tesoreriaSessionBean.getEsGuardarRelacionado() 
				|| (this.tesoreriaSessionBean.getEsGuardarRelacionado() && this.tesoreriaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTesoreriaClasesRelacionadas();
			}
			
			if(this.tesoreriaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTesoreriaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TesoreriaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTesoreria();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTesoreria();
			}
			
			if(!this.isPermisoBusquedaTesoreria) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tesoreriaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTesoreria,this.isPermisoPaginacionMedioTesoreria,this.isPermisoPaginacionTodoTesoreria);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TesoreriaConstantesFunciones.getTiposSeleccionarTesoreria());
				
				this.tiposColumnasSelect=TesoreriaConstantesFunciones.getTiposSeleccionarTesoreria(true);
				
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
			//if(!this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTesoreria();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTesoreria(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTesoreria(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTesoreria() ;
			
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
				tesoreriaImplementable= (TesoreriaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TesoreriaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tesoreriaImplementableHome= (TesoreriaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TesoreriaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tesorerias= new ArrayList<Tesoreria>();
			this.tesoreriasEliminados= new ArrayList<Tesoreria>();
						
			this.isEsNuevoTesoreria=false;
			this.esParaAccionDesdeFormularioTesoreria=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTesoreria(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTesoreria();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TesoreriaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TesoreriaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTesoreria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTesoreria(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTesoreria!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTesoreria();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTesoreria();
			}
			
			TesoreriaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTesoreria(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Tesoreria: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTesoreria() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTesoreria")) {
				iIndex=this.jInternalFrameDetalleFormTesoreria.jTabbedPaneRelacionesTesoreria.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTesoreria.jTabbedPaneRelacionesTesoreria.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTesoreria.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTesoreria();	
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
	
	public void cargarCombosForeignKeyTesoreria(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTesoreria(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTesoreria(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTesoreriaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTesoreria();
		
		this.cargarCombosFrameForeignKeyTesoreria();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTesoreria();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTesoreria();
		}
	}
	
	
	
	public void jButtonNuevoTesoreriaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tesoreriaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTesoreria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
			
			
			if(jTableDatosTesoreria.getRowCount()>=1) {
				jTableDatosTesoreria.removeRowSelectionInterval(0, jTableDatosTesoreria.getRowCount()-1);						
			}
			
			this.isEsNuevoTesoreria=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTesoreria(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTesoreria(true);			
			//this.tesoreria=new Tesoreria();
			//this.tesoreria.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTesoreria(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTesoreria() ;
			
			if(TesoreriaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTesoreria(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tesoreria);	
			this.actualizarInformacion("INFO_PADRE",false,this.tesoreria);				
			
			TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
			
			if(this.tesoreriaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Tesoreria: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTesoreriaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Tesoreria> tesoreriasSeleccionados=new ArrayList<Tesoreria>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTesoreria.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTesoreria.getSelectedRows().length;			
			}
			
			tesoreriasSeleccionados=this.getTesoreriasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTesoreria--;			
				//Tesoreria tesoreriaAux= new Tesoreria();			
				//tesoreriaAux.setId(this.iIdNuevoTesoreria);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Tesoreria tesoreriaOrigen=new Tesoreria();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Tesoreria tesoreriaOrigen : tesoreriasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTesoreria.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tesoreriaOrigen =(Tesoreria) this.tesoreriaLogic.getTesorerias().toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tesoreriaOrigen =(Tesoreria) this.tesorerias.toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTesoreria();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tesoreria.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTesoreria(tesoreriaOrigen,this.tesoreria,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTesoreria(this.tesoreria);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tesoreriaLogic.getTesorerias().add(this.tesoreriaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tesorerias.add(this.tesoreriaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTesoreria(false);
				
				this.jTableDatosTesoreria.setRowSelectionInterval(this.getIndiceNuevoTesoreria(), this.getIndiceNuevoTesoreria());
				
				int iLastRow =  this.jTableDatosTesoreria.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTesoreria.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTesoreria.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTesoreria(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTesoreriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Tesoreria> tesoreriasSeleccionados=new ArrayList<Tesoreria>();									
		
			Tesoreria tesoreriaOrigen=new Tesoreria();
			Tesoreria tesoreriaDestino=new Tesoreria();
				
			tesoreriasSeleccionados=this.getTesoreriasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTesoreria.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tesoreriasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTesoreria.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tesoreriaOrigen =(Tesoreria) this.tesoreriaLogic.getTesorerias().toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tesoreriaOrigen =(Tesoreria) this.tesorerias.toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tesoreriaDestino =(Tesoreria) this.tesoreriaLogic.getTesorerias().toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tesoreriaDestino =(Tesoreria) this.tesorerias.toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tesoreriaOrigen =tesoreriasSeleccionados.get(0);
				tesoreriaDestino =tesoreriasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTesoreria(tesoreriaOrigen,tesoreriaDestino,true,false);
				
				tesoreriaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tesoreriaDestino,tesoreriaLogic.getTesorerias());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tesoreriaDestino,tesorerias);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTesoreria(false);
				
				//this.jTableDatosTesoreria.setRowSelectionInterval(this.getIndiceNuevoTesoreria(), this.getIndiceNuevoTesoreria());
				
				int iLastRow =  this.jTableDatosTesoreria.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTesoreria.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTesoreria.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTesoreria(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTesoreriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTesoreria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTesoreria.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTesoreriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTesoreria.isVisible();
			
			
			this.jPanelParametrosReportesTesoreria.setVisible(!isVisible);
			this.jPanelPaginacionTesoreria.setVisible(!isVisible);
			this.jPanelAccionesTesoreria.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTesoreriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTesoreria();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTesoreriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTesoreria();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTesoreriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTesoreria();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTesoreriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTesoreria();
			
			this.abrirFrameOrderByTesoreria();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTesoreriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTesoreria();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTesoreria(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTesoreria);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTesoreria.isMaximum()) {
					this.jInternalFrameDetalleFormTesoreria.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTesoreria.setSize(this.jInternalFrameDetalleFormTesoreria.iWidthFormulario,this.jInternalFrameDetalleFormTesoreria.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTesoreria.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTesoreria.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTesoreria.isMaximum()) {
						this.jInternalFrameDetalleFormTesoreria.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTesoreria.jContentPaneDetalleTesoreria.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTesoreria.jTabbedPaneRelacionesTesoreria.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTesoreria.jContentPaneDetalleTesoreria.getWidth(),TesoreriaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTesoreria.jTabbedPaneRelacionesTesoreria.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTesoreria.jContentPaneDetalleTesoreria.getWidth(),TesoreriaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTesoreria.jTabbedPaneRelacionesTesoreria.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTesoreria.jContentPaneDetalleTesoreria.getWidth(),TesoreriaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTesoreria.setVisible(true);
	        this.jInternalFrameDetalleFormTesoreria.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTesoreria() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTesoreria==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTesoreria=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTesoreria,false,this);
				} else {
					this.jInternalFrameOrderByTesoreria=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTesoreria,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTesoreria);
				this.jInternalFrameOrderByTesoreria.setVisible(false);
				this.jInternalFrameOrderByTesoreria.setSelected(false);
				
				this.jInternalFrameOrderByTesoreria.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTesoreria"));
				
				this.inicializarActualizarBindingTablaOrderByTesoreria();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTesoreria() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTesoreria==null) {
				
				this.jInternalFrameImportacionTesoreria=new ImportacionJInternalFrame(TesoreriaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTesoreria);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTesoreria);
				this.jInternalFrameImportacionTesoreria.setVisible(false);
				this.jInternalFrameImportacionTesoreria.setSelected(false);


				this.jInternalFrameImportacionTesoreria.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTesoreria"));
				this.jInternalFrameImportacionTesoreria.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTesoreria"));
				this.jInternalFrameImportacionTesoreria.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTesoreria"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTesoreria() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTesoreria==null) {
				this.jInternalFrameReporteDinamicoTesoreria=new ReporteDinamicoJInternalFrame(TesoreriaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTesoreria);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTesoreria);
				this.jInternalFrameReporteDinamicoTesoreria.setVisible(false);
				this.jInternalFrameReporteDinamicoTesoreria.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTesoreria.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTesoreria"));
				this.jInternalFrameReporteDinamicoTesoreria.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTesoreria"));
				this.jInternalFrameReporteDinamicoTesoreria.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTesoreria"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTesoreria();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTesoreria() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTesoreria);
			
	       	this.jInternalFrameDetalleFormTesoreria.setVisible(false);
	        this.jInternalFrameDetalleFormTesoreria.setSelected(false);
			
			//this.jInternalFrameDetalleFormTesoreria.dispose();
			//this.jInternalFrameDetalleFormTesoreria=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTesoreria() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTesoreria.setVisible(true);
	        this.jInternalFrameReporteDinamicoTesoreria.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTesoreria() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTesoreria.setVisible(true);
	        this.jInternalFrameImportacionTesoreria.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTesoreria() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTesoreria.setVisible(true);
	        this.jInternalFrameOrderByTesoreria.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTesoreria() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTesoreria.setVisible(false);
	        this.jInternalFrameOrderByTesoreria.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTesoreria() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTesoreria.setVisible(false);
	        this.jInternalFrameReporteDinamicoTesoreria.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTesoreria() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTesoreria.setVisible(false);
	        this.jInternalFrameImportacionTesoreria.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTesoreriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTesoreria(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTesoreria(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTesoreria.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTesoreria(true);
			//this.isEsNuevoTesoreria=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreria =(Tesoreria) this.tesoreriaLogic.getTesorerias().toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tesoreria =(Tesoreria) this.tesorerias.toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTesoreria("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTesoreria(false) ;
			
			if(tesoreriaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TesoreriaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTesoreria(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTesoreria(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTesoreriaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTesoreria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tesoreria =(Tesoreria) this.tesoreriaLogic.getTesorerias().toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tesoreria =(Tesoreria) this.tesorerias.toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTesoreria(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTesoreria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTesoreria.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTesoreria(true);
			//this.isEsNuevoTesoreria=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreria =(Tesoreria) this.tesoreriaLogic.getTesorerias().toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tesoreria =(Tesoreria) this.tesorerias.toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tesoreria.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTesoreria("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTesoreria(false) ;
			
			if(TesoreriaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTesoreria(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTesoreria(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTesoreriaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTesoreria(false);
			
			//if(!this.isEsNuevoTesoreria) {								
				int intSelectedRow = this.jTableDatosTesoreria.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tesoreria =(Tesoreria) this.tesoreriaLogic.getTesorerias().toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tesoreria =(Tesoreria) this.tesorerias.toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TesoreriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTesoreria(this.tesoreria,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTesoreria(this.tesoreria);
				
			}
			
			if(this.permiteMantenimiento(this.tesoreria)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTesoreria=true;
					this.inicializarActualizarBindingTablaTesoreria(false);
					this.isEsNuevoTesoreria=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTesoreria=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTesoreria=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTesoreria(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTesoreria(false);
				
				this.habilitarDeshabilitarControlesTesoreria(false);
			
												
				
				if(TesoreriaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTesoreria();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTesoreriaActionPerformed(evt,tesoreriaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTesoreria(this.tesoreria,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTesoreria.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tesoreriaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tesoreria.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Tesoreria.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Tesoreria.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTesoreriaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTesoreria.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreria =(Tesoreria) this.tesoreriaLogic.getTesorerias().toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
				this.tesoreria.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tesoreria =(Tesoreria) this.tesorerias.toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
				this.tesoreria.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tesoreria)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TesoreriaModel) this.jTableDatosTesoreria.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTesoreria=true;
				this.inicializarActualizarBindingTablaTesoreria(false);
				this.isEsNuevoTesoreria=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTesoreria(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTesoreria(false);
				
				this.habilitarDeshabilitarControlesTesoreria(false);
				
				
				
				if(TesoreriaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTesoreria();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTesoreriaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTesoreria.getRowCount()>=1) {
				jTableDatosTesoreria.removeRowSelectionInterval(0, jTableDatosTesoreria.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTesoreria(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTesoreria(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTesoreria(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTesoreria(false) ;
			
			this.isEsNuevoTesoreria=false;
			
			if(TesoreriaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTesoreria();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTesoreriaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTesoreria(false);
				
				//SI ES MANUAL
				if(TesoreriaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTesoreria();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTesoreriaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTesoreria--;			
			//Tesoreria tesoreriaAux= new Tesoreria();			
			//tesoreriaAux.setId(this.iIdNuevoTesoreria);
			
			if(this.jInternalFrameDetalleFormTesoreria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTesoreria();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTesoreria(this.tesoreria);
			
			this.tesoreria.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tesoreriaLogic.getTesorerias().add(this.tesoreriaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tesorerias.add(this.tesoreriaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTesoreria(false);
			
			this.jTableDatosTesoreria.setRowSelectionInterval(this.getIndiceNuevoTesoreria(), this.getIndiceNuevoTesoreria());
			
			int iLastRow =  this.jTableDatosTesoreria.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTesoreria.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTesoreria.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTesoreria(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTesoreriaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTesoreria(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTesoreria(false);
			
			//SI ES MANUAL
			if(TesoreriaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTesoreria();
			}
			
			//this.abrirFrameTreeTesoreria();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTesoreriaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE TesoreriaS ?", "MANTENIMIENTO DE Tesoreria", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTesoreria.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTesoreria();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tesoreriaReturnGeneral=tesoreriaLogic.procesarImportacionTesoreriasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tesoreriaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTesoreriaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTesoreriaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTesoreria.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTesoreria.setFileImportacion(this.jInternalFrameImportacionTesoreria.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTesoreria.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTesoreria.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTesoreria.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTesoreria.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTesoreriaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Tesoreria> tesoreriasSeleccionados=new ArrayList<Tesoreria>();		

		tesoreriasSeleccionados=this.getTesoreriasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTesoreria.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTesoreria.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TesoreriaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TesoreriaBaseDesign.jrxml";
			
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
			
			this.generarReporteTesorerias("Todos",tesoreriasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tesoreriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tesoreria",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTesoreria.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTesoreria.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TesoreriaConstantesFunciones.LABEL_CODIGO:
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
		
		if(this.jInternalFrameReporteDinamicoTesoreria.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTesoreria.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTesoreria.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TesoreriaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTesoreria.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TesoreriaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTesoreria.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTesoreria.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TesoreriaConstantesFunciones.LABEL_CODIGO:
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
	
	public void jButtonGenerarExcelReporteDinamicoTesoreriaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Tesoreria> tesoreriasSeleccionados=new ArrayList<Tesoreria>();		
		
		tesoreriasSeleccionados=this.getTesoreriasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tesoreria";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Tesorerias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTesoreria.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTesoreria.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TesoreriaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TesoreriaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Tesoreria tesoreria:tesoreriasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tesoreria.getcodigo());
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
			//	this.getFilaCabeceraExportarExcelTesoreria(row);				
			//	iRow++;
			//}				
			
			//for(Tesoreria tesoreriaAux:tesoreriasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTesoreria(tesoreriaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tesoreriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tesoreria",JOptionPane.INFORMATION_MESSAGE);
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
				this.tesoreriaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTesoreria(false);
			
			//SI ES MANUAL
			if(TesoreriaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTesoreria();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTesoreriaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTesoreria(false);
			
			//SI ES MANUAL
			if(TesoreriaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTesoreria();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTesoreriaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTesoreria(false);
			
			//SI ES MANUAL
			if(TesoreriaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTesoreria();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tesoreriaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTesoreria() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTesoreria.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTesoreria.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTesoreria.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTesoreria.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTesoreria.setMinimumSize(dimensionMinimum);
		this.jTableDatosTesoreria.setMaximumSize(dimensionMaximum);
		this.jTableDatosTesoreria.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTesoreria(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTesoreria(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTesoreria(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTesoreria(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTesoreria(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTesoreria(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTesoreria(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTesoreria(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TesoreriaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TesoreriaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTesoreria() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTesoreria();
		
		this.inicializarActualizarBindingBotonesManualTesoreria(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTesoreria();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTesoreria() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTesoreria(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTesoreria(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTesoreria.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTesoreria.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTesoreria.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTesoreria!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTesoreria.jCheckBoxPostAccionNuevoTesoreria.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTesoreria.jCheckBoxPostAccionSinCerrarTesoreria.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTesoreria.jCheckBoxPostAccionSinMensajeTesoreria.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTesoreria.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTesoreria.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTesoreria.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTesoreria!=null) {
				this.jInternalFrameDetalleFormTesoreria.jCheckBoxPostAccionNuevoTesoreria.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTesoreria.jCheckBoxPostAccionSinCerrarTesoreria.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTesoreria.jCheckBoxPostAccionSinMensajeTesoreria.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTesoreria.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTesoreria.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTesoreria!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTesoreria.jComboBoxTiposAccionesFormularioTesoreria.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTesoreria.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTesoreria!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTesoreria.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTesoreria.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTesoreria.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTesoreria.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTesoreria.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTesoreria!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTesoreria.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTesoreria.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTesoreria.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTesoreria(Boolean esInicializar) throws Exception {
		try	{	
			if(TesoreriaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTesoreria(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTesoreria() throws Exception {
		try	{
			if(TesoreriaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTesoreria();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTesoreria() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTesoreria.jComboBoxTiposAccionesFormularioTesoreria.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTesoreria.jComboBoxTiposAccionesFormularioTesoreria.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTesoreria() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTesoreria.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTesoreria.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTesoreria.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTesoreria.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTesoreria.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTesoreria.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTesoreria.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTesoreria.addItem(reporte);
			}
			
			
			if(!this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTesoreria.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTesoreria.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTesoreria.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTesoreria.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTesoreria.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTesoreria.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTesoreria!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTesoreria.jComboBoxTiposAccionesFormularioTesoreria.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTesoreria.jComboBoxTiposAccionesFormularioTesoreria.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTesoreria.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTesoreria.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTesoreria.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTesoreria();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTesoreria() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTesoreria!=null) {
				this.jInternalFrameReporteDinamicoTesoreria.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTesoreria.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTesoreria!=null) {
				this.jInternalFrameReporteDinamicoTesoreria.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTesoreria.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTesoreria!=null) {
				
				if(this.jInternalFrameReporteDinamicoTesoreria.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTesoreria.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTesoreria.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTesoreria.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTesoreria.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTesoreria.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTesoreria()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTesoreria(Boolean esInicializar) throws Exception {				
		if(TesoreriaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTesoreria();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTesoreria() throws Exception {
		this.inicializarActualizarBindingTablaTesoreria(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTesoreria() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTesoreria.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTesoreria.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTesoreria.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TesoreriaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTesoreria.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTesoreria.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TesoreriaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTesoreriaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTesoreriaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TesoreriaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTesoreria.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTesoreria.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TesoreriaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTesoreria.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTesoreria(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tesoreriaLogic.getTesorerias().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tesorerias.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TesoreriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTesoreria.setModel(new TesoreriaModel(this.tesoreriaLogic.getTesorerias(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTesoreria.setModel(new TesoreriaModel(this.tesorerias,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTesoreria!=null && this.jInternalFrameOrderByTesoreria.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTesoreria();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTesoreria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTesoreria,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TesoreriaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TesoreriaConstantesFunciones.SCLASSWEBTITULO,tesoreriaConstantesFunciones.resaltarSeleccionarTesoreria,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TesoreriaConstantesFunciones.SCLASSWEBTITULO,tesoreriaConstantesFunciones.resaltarSeleccionarTesoreria,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTesoreria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTesoreria,TesoreriaConstantesFunciones.LABEL_ID));

		if(this.tesoreriaConstantesFunciones.mostraridTesoreria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TesoreriaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tesoreriaConstantesFunciones.resaltaridTesoreria,this.tesoreriaConstantesFunciones.activaridTesoreria,this,true,"idTesoreria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tesoreriaConstantesFunciones.resaltaridTesoreria,this.tesoreriaConstantesFunciones.activaridTesoreria,this,true,"idTesoreria","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTesoreria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTesoreria,TesoreriaConstantesFunciones.LABEL_CODIGO));

		if(this.tesoreriaConstantesFunciones.mostrarcodigoTesoreria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TesoreriaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tesoreriaConstantesFunciones.resaltarcodigoTesoreria,this.tesoreriaConstantesFunciones.activarcodigoTesoreria,this,true,"codigoTesoreria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tesoreriaConstantesFunciones.resaltarcodigoTesoreria,this.tesoreriaConstantesFunciones.activarcodigoTesoreria,this,true,"codigoTesoreria","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TesoreriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tesoreriaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tesoreriaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tesoreriaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTesoreria.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tesoreriaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tesoreriaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTesoreria.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTesoreria && this.isPermisoGuardarCambiosTesoreria) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tesoreriaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tesoreriaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTesoreria.addColumn(tableColumn);
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
			
			this.jTableDatosTesoreria.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTesoreria && this.isPermisoGuardarCambiosTesoreria) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTesoreria && this.isPermisoGuardarCambiosTesoreria) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTesoreria.moveColumn(this.jTableDatosTesoreria.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTesoreria.moveColumn(this.jTableDatosTesoreria.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTesoreria.moveColumn(this.jTableDatosTesoreria.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTesoreria.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTesoreria.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTesoreria,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TesoreriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTesoreria.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTesoreria.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TesoreriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TesoreriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTesoreria.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTesoreria.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTesoreria.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tesoreriaLogic.getTesorerias().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tesorerias.size()-1;
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
		//this.jTableDatosTesoreria.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTesoreria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTesoreria();
			
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
				
				//this.isEsNuevoTesoreria=false;
					
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
			
				if(this.tesoreriaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTesoreria==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTesoreria.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTesoreria.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tesoreria =(Tesoreria) this.tesoreriaLogic.getTesorerias().toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tesoreria =(Tesoreria) this.tesorerias.toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tesoreria.getsType().equals("DUPLICADO")
				   || this.tesoreria.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTesoreria=true;
				
				} else {
					this.isEsNuevoTesoreria=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
					if(this.tesoreria.getId()>=0 && !this.tesoreria.getIsNew()) {						
						this.isEsNuevoTesoreria=false;
						
					} else {
						this.isEsNuevoTesoreria=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTesoreria(esRelaciones);						
				
				this.seleccionarTesoreria(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tesoreria.getId()<0) {
					this.isEsNuevoTesoreria=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTesoreria(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTesoreria(evt,rowIndex);
				}	
				
				if(this.tesoreriaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Tesoreria: " + this.dDif); 
					}
				}								
				
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTesoreria(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tesoreria)) {
					if(this.tesoreria.getId()>0) {
						this.tesoreria.setIsDeleted(true);
						
						this.tesoreriasEliminados.add(this.tesoreria);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tesoreriaLogic.getTesorerias().remove(this.tesoreria);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tesorerias.remove(this.tesoreria);				
					}
					
					
					((TesoreriaModel) this.jTableDatosTesoreria.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTesoreria(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTesoreria(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTesoreria) {
			
			if(this.jInternalFrameDetalleFormTesoreria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTesoreria.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTesoreria.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tesoreria =(Tesoreria) this.tesoreriaLogic.getTesorerias().toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tesoreria =(Tesoreria) this.tesorerias.toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TesoreriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTesoreria(this.tesoreria);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTesoreria("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTesoreria(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTesoreria() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTesoreria(Tesoreria tesoreria) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTesoreria(tesoreria,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTesoreria(Tesoreria tesoreria,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTesoreria(tesoreria);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTesoreria(tesoreria,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTesoreria(tesoreria);
	}
	
	public void setVariablesObjetoActualToFormularioTesoreria(Tesoreria tesoreria) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTesoreria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTesoreria.jLabelidTesoreria.setText(tesoreria.getId().toString());
			this.jInternalFrameDetalleFormTesoreria.jTextFieldcodigoTesoreria.setText(tesoreria.getcodigo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Tesoreria tesoreriaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tesoreriaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Tesoreria tesoreriaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tesoreriaLocal=this.tesoreria;
			} else {
				tesoreriaLocal=this.tesoreriaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tesoreriaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTesoreria(tesoreriaLocal,true);
					
					if(tesoreriaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tesoreriaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tesoreriaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTesoreria(Tesoreria tesoreria,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTesoreria(tesoreria,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTesoreria(tesoreria);
	}
	
	public void setVariablesFormularioToObjetoActualTesoreria(Tesoreria tesoreria,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTesoreria(tesoreria,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTesoreria(Tesoreria tesoreria,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTesoreria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTesoreria.jLabelidTesoreria.getText()==null || this.jInternalFrameDetalleFormTesoreria.jLabelidTesoreria.getText()=="" || this.jInternalFrameDetalleFormTesoreria.jLabelidTesoreria.getText()=="Id") {
				this.jInternalFrameDetalleFormTesoreria.jLabelidTesoreria.setText("0");
			}

			if(conColumnasBase) {tesoreria.setId(Long.parseLong(this.jInternalFrameDetalleFormTesoreria.jLabelidTesoreria.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TesoreriaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTesoreria.jLabelIdTesoreria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tesoreria.setcodigo(this.jInternalFrameDetalleFormTesoreria.jTextFieldcodigoTesoreria.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TesoreriaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTesoreria.jLabelcodigoTesoreria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTesoreria(Tesoreria tesoreriaBean,Tesoreria tesoreria,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTesoreria(Tesoreria tesoreriaOrigen,Tesoreria tesoreria,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tesoreriaOrigen.getId()!=null && !tesoreriaOrigen.getId().equals(0L))) {tesoreria.setId(tesoreriaOrigen.getId());}}
			if(conDefault || (!conDefault && tesoreriaOrigen.getcodigo()!=null && !tesoreriaOrigen.getcodigo().equals(""))) {tesoreria.setcodigo(tesoreriaOrigen.getcodigo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTesoreria(Tesoreria tesoreria) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTesoreria.jLabelidTesoreria.setText(tesoreria.getId().toString());
			this.jInternalFrameDetalleFormTesoreria.jTextFieldcodigoTesoreria.setText(tesoreria.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTesoreria(TesoreriaBean tesoreriaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTesoreria.jLabelidTesoreria.setText(tesoreriaBean.getId().toString());
			this.jInternalFrameDetalleFormTesoreria.jTextFieldcodigoTesoreria.setText(tesoreriaBean.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTesoreria(TesoreriaParameterReturnGeneral tesoreriaReturnGeneral,TesoreriaBean tesoreriaBean,Boolean conDefault) throws Exception { 
		try {
			Tesoreria tesoreriaLocal=new Tesoreria();
			
			tesoreriaLocal=tesoreriaReturnGeneral.getTesoreria();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tesoreriaLocal.getId()!=null && !tesoreriaLocal.getId().equals(0L))) {tesoreriaBean.setId(tesoreriaLocal.getId());}}
			if(conDefault || (!conDefault && tesoreriaLocal.getcodigo()!=null && !tesoreriaLocal.getcodigo().equals(""))) {tesoreriaBean.setcodigo(tesoreriaLocal.getcodigo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTesoreriaGenerico(Long idTesoreriaSeleccionado,JComboBox jComboBoxTesoreria,List<Tesoreria> tesoreriasLocal)throws Exception {
		try {
			Tesoreria  tesoreriaTemp=null;

			for(Tesoreria tesoreriaAux:tesoreriasLocal) {
				if(tesoreriaAux.getId()!=null && tesoreriaAux.getId().equals(idTesoreriaSeleccionado)) {
					tesoreriaTemp=tesoreriaAux;
					break;
				}
			}

			jComboBoxTesoreria.setSelectedItem(tesoreriaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTesoreriaGenerico(JComboBox jComboBoxTesoreria,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTesoreria.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTesoreria.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTesoreria.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTesoreria.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tesoreria=(Tesoreria) tesoreriaLogic.getTesorerias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tesoreria =(Tesoreria) tesorerias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Tesoreria tesoreriaRow=new Tesoreria();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tesoreriaRow=(Tesoreria) tesoreriaLogic.getTesorerias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tesoreriaRow=(Tesoreria) tesorerias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTesoreria(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTesoreria.setVisible((this.isVisibilidadCeldaNuevoTesoreria && this.isPermisoNuevoTesoreria));			
			this.jButtonDuplicarTesoreria.setVisible((this.isVisibilidadCeldaDuplicarTesoreria && this.isPermisoDuplicarTesoreria));			
			this.jButtonCopiarTesoreria.setVisible((this.isVisibilidadCeldaCopiarTesoreria && this.isPermisoCopiarTesoreria));
			this.jButtonVerFormTesoreria.setVisible((this.isVisibilidadCeldaVerFormTesoreria && this.isPermisoVerFormTesoreria));
			
			this.jButtonAbrirOrderByTesoreria.setVisible((this.isVisibilidadCeldaOrdenTesoreria && this.isPermisoOrdenTesoreria));			
			
			this.jButtonNuevoRelacionesTesoreria.setVisible((this.isVisibilidadCeldaNuevoRelacionesTesoreria && this.isPermisoNuevoTesoreria));			
			this.jButtonNuevoGuardarCambiosTesoreria.setVisible((this.isVisibilidadCeldaNuevoTesoreria && this.isPermisoNuevoTesoreria && this.isPermisoGuardarCambiosTesoreria));
			
			if(this.jInternalFrameDetalleFormTesoreria!=null) {
			this.jInternalFrameDetalleFormTesoreria.jButtonModificarTesoreria.setVisible((this.isVisibilidadCeldaModificarTesoreria && this.isPermisoActualizarTesoreria));	
			this.jInternalFrameDetalleFormTesoreria.jButtonActualizarTesoreria.setVisible((this.isVisibilidadCeldaActualizarTesoreria && this.isPermisoActualizarTesoreria));	
			this.jInternalFrameDetalleFormTesoreria.jButtonEliminarTesoreria.setVisible((this.isVisibilidadCeldaEliminarTesoreria && this.isPermisoEliminarTesoreria));
			this.jInternalFrameDetalleFormTesoreria.jButtonCancelarTesoreria.setVisible(this.isVisibilidadCeldaCancelarTesoreria);							
			this.jInternalFrameDetalleFormTesoreria.jButtonGuardarCambiosTesoreria.setVisible((this.isVisibilidadCeldaGuardarTesoreria && this.isPermisoGuardarCambiosTesoreria));			
			
			}
						
			this.jButtonGuardarCambiosTablaTesoreria.setVisible((this.isVisibilidadCeldaGuardarCambiosTesoreria && this.isPermisoGuardarCambiosTesoreria));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTesoreria.setVisible((this.isVisibilidadCeldaNuevoTesoreria && this.isPermisoNuevoTesoreria));						
			this.jButtonDuplicarToolBarTesoreria.setVisible((this.isVisibilidadCeldaDuplicarTesoreria && this.isPermisoDuplicarTesoreria));						
			this.jButtonCopiarToolBarTesoreria.setVisible((this.isVisibilidadCeldaCopiarTesoreria && this.isPermisoCopiarTesoreria));			
			this.jButtonVerFormToolBarTesoreria.setVisible((this.isVisibilidadCeldaVerFormTesoreria && this.isPermisoVerFormTesoreria));			
			this.jButtonAbrirOrderByToolBarTesoreria.setVisible((this.isVisibilidadCeldaOrdenTesoreria && this.isPermisoOrdenTesoreria));
			this.jButtonNuevoRelacionesToolBarTesoreria.setVisible((this.isVisibilidadCeldaNuevoRelacionesTesoreria && this.isPermisoNuevoTesoreria));			
			this.jButtonNuevoGuardarCambiosToolBarTesoreria.setVisible((this.isVisibilidadCeldaNuevoTesoreria && this.isPermisoNuevoTesoreria && this.isPermisoGuardarCambiosTesoreria));			
			
			if(this.jInternalFrameDetalleFormTesoreria!=null) {
			this.jInternalFrameDetalleFormTesoreria.jButtonModificarToolBarTesoreria.setVisible((this.isVisibilidadCeldaModificarTesoreria && this.isPermisoActualizarTesoreria));	
			this.jInternalFrameDetalleFormTesoreria.jButtonActualizarToolBarTesoreria.setVisible((this.isVisibilidadCeldaActualizarTesoreria  && this.isPermisoActualizarTesoreria));	
			this.jInternalFrameDetalleFormTesoreria.jButtonEliminarToolBarTesoreria.setVisible((this.isVisibilidadCeldaEliminarTesoreria && this.isPermisoEliminarTesoreria));
			this.jInternalFrameDetalleFormTesoreria.jButtonCancelarToolBarTesoreria.setVisible(this.isVisibilidadCeldaCancelarTesoreria);				
			this.jInternalFrameDetalleFormTesoreria.jButtonGuardarCambiosToolBarTesoreria.setVisible((this.isVisibilidadCeldaGuardarTesoreria && this.isPermisoGuardarCambiosTesoreria));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTesoreria.setVisible((this.isVisibilidadCeldaGuardarCambiosTesoreria && this.isPermisoGuardarCambiosTesoreria));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTesoreria.setVisible((this.isVisibilidadCeldaNuevoTesoreria && this.isPermisoNuevoTesoreria));			
			this.jMenuItemDuplicarTesoreria.setVisible((this.isVisibilidadCeldaDuplicarTesoreria && this.isPermisoDuplicarTesoreria));			
			this.jMenuItemCopiarTesoreria.setVisible((this.isVisibilidadCeldaCopiarTesoreria && this.isPermisoCopiarTesoreria));			
			this.jMenuItemVerFormTesoreria.setVisible((this.isVisibilidadCeldaVerFormTesoreria && this.isPermisoVerFormTesoreria));			
			this.jMenuItemAbrirOrderByTesoreria.setVisible((this.isVisibilidadCeldaOrdenTesoreria && this.isPermisoOrdenTesoreria));			
			//this.jMenuItemMostrarOcultarTesoreria.setVisible((this.isVisibilidadCeldaOrdenTesoreria && this.isPermisoOrdenTesoreria));
			this.jMenuItemDetalleAbrirOrderByTesoreria.setVisible((this.isVisibilidadCeldaOrdenTesoreria && this.isPermisoOrdenTesoreria));			
			//this.jMenuItemDetalleMostrarOcultarTesoreria.setVisible((this.isVisibilidadCeldaOrdenTesoreria && this.isPermisoOrdenTesoreria));			
			this.jMenuItemNuevoRelacionesTesoreria.setVisible((this.isVisibilidadCeldaNuevoRelacionesTesoreria && this.isPermisoNuevoTesoreria));			
			this.jMenuItemNuevoGuardarCambiosTesoreria.setVisible((this.isVisibilidadCeldaNuevoTesoreria && this.isPermisoNuevoTesoreria && this.isPermisoGuardarCambiosTesoreria));									
			
			if(this.jInternalFrameDetalleFormTesoreria!=null) {
			this.jInternalFrameDetalleFormTesoreria.jMenuItemModificarTesoreria.setVisible((this.isVisibilidadCeldaModificarTesoreria && this.isPermisoActualizarTesoreria));	
			this.jInternalFrameDetalleFormTesoreria.jMenuItemActualizarTesoreria.setVisible((this.isVisibilidadCeldaActualizarTesoreria && this.isPermisoActualizarTesoreria));	
			this.jInternalFrameDetalleFormTesoreria.jMenuItemEliminarTesoreria.setVisible((this.isVisibilidadCeldaEliminarTesoreria && this.isPermisoEliminarTesoreria));
			this.jInternalFrameDetalleFormTesoreria.jMenuItemCancelarTesoreria.setVisible(this.isVisibilidadCeldaCancelarTesoreria);				
			}
			
			this.jMenuItemGuardarCambiosTesoreria.setVisible((this.isVisibilidadCeldaGuardarTesoreria && this.isPermisoGuardarCambiosTesoreria));						
			this.jMenuItemGuardarCambiosTablaTesoreria.setVisible((this.isVisibilidadCeldaGuardarCambiosTesoreria && this.isPermisoGuardarCambiosTesoreria));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTesoreria=this.jButtonNuevoTesoreria.isVisible();
			this.isVisibilidadCeldaDuplicarTesoreria=this.jButtonDuplicarTesoreria.isVisible();
			this.isVisibilidadCeldaCopiarTesoreria=this.jButtonCopiarTesoreria.isVisible();
			this.isVisibilidadCeldaVerFormTesoreria=this.jButtonVerFormTesoreria.isVisible();
			
			this.isVisibilidadCeldaOrdenTesoreria=this.jButtonAbrirOrderByTesoreria.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTesoreria=this.jButtonNuevoRelacionesTesoreria.isVisible();
			this.isVisibilidadCeldaModificarTesoreria=this.jButtonModificarTesoreria.isVisible();
			
			if(this.jInternalFrameDetalleFormTesoreria!=null) {
			this.isVisibilidadCeldaActualizarTesoreria=this.jInternalFrameDetalleFormTesoreria.jButtonActualizarTesoreria.isVisible();
			this.isVisibilidadCeldaEliminarTesoreria=this.jInternalFrameDetalleFormTesoreria.jButtonEliminarTesoreria.isVisible();
			this.isVisibilidadCeldaCancelarTesoreria=this.jInternalFrameDetalleFormTesoreria.jButtonCancelarTesoreria.isVisible();
			this.isVisibilidadCeldaGuardarTesoreria=this.jInternalFrameDetalleFormTesoreria.jButtonGuardarCambiosTesoreria.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTesoreria=this.jButtonGuardarCambiosTablaTesoreria.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTesoreria=this.jButtonNuevoToolBarTesoreria.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTesoreria=this.jButtonNuevoRelacionesToolBarTesoreria.isVisible();
			
			if(this.jInternalFrameDetalleFormTesoreria!=null) {
			this.isVisibilidadCeldaModificarTesoreria=this.jInternalFrameDetalleFormTesoreria.jButtonModificarToolBarTesoreria.isVisible();
			this.isVisibilidadCeldaActualizarTesoreria=this.jInternalFrameDetalleFormTesoreria.jButtonActualizarToolBarTesoreria.isVisible();
			this.isVisibilidadCeldaEliminarTesoreria=this.jInternalFrameDetalleFormTesoreria.jButtonEliminarToolBarTesoreria.isVisible();
			this.isVisibilidadCeldaCancelarTesoreria=this.jInternalFrameDetalleFormTesoreria.jButtonCancelarToolBarTesoreria.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTesoreria=this.jButtonGuardarCambiosToolBarTesoreria.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTesoreria=this.jButtonGuardarCambiosTablaToolBarTesoreria.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTesoreria=this.jMenuItemNuevoTesoreria.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTesoreria=this.jMenuItemNuevoRelacionesTesoreria.isVisible();
			
			if(this.jInternalFrameDetalleFormTesoreria!=null) {
			this.isVisibilidadCeldaModificarTesoreria=this.jInternalFrameDetalleFormTesoreria.jMenuItemModificarTesoreria.isVisible();
			this.isVisibilidadCeldaActualizarTesoreria=this.jInternalFrameDetalleFormTesoreria.jMenuItemActualizarTesoreria.isVisible();
			this.isVisibilidadCeldaEliminarTesoreria=this.jInternalFrameDetalleFormTesoreria.jMenuItemEliminarTesoreria.isVisible();
			this.isVisibilidadCeldaCancelarTesoreria=this.jInternalFrameDetalleFormTesoreria.jMenuItemCancelarTesoreria.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTesoreria=this.jMenuItemGuardarCambiosTesoreria.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTesoreria=this.jMenuItemGuardarCambiosTablaTesoreria.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTesoreria(Boolean esInicializar) {
		if(TesoreriaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tesoreriaSessionBean.getConGuardarRelaciones()) {
				//if(this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTesoreria();
			}
			
			this.inicializarActualizarBindingBotonesManualTesoreria(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTesoreria() {
		this.jButtonNuevoTesoreria.setVisible(this.isPermisoNuevoTesoreria);			
		this.jButtonDuplicarTesoreria.setVisible(this.isPermisoDuplicarTesoreria);			
		this.jButtonCopiarTesoreria.setVisible(this.isPermisoCopiarTesoreria);			
		this.jButtonVerFormTesoreria.setVisible(this.isPermisoVerFormTesoreria);			
		
		this.jButtonAbrirOrderByTesoreria.setVisible(this.isPermisoOrdenTesoreria);					
		
		this.jButtonNuevoRelacionesTesoreria.setVisible(this.isPermisoNuevoTesoreria);			
		
		if(this.jInternalFrameDetalleFormTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTesoreria.jButtonModificarTesoreria.setVisible(this.isPermisoActualizarTesoreria);	
			this.jInternalFrameDetalleFormTesoreria.jButtonActualizarTesoreria.setVisible(this.isPermisoActualizarTesoreria);	
			this.jInternalFrameDetalleFormTesoreria.jButtonEliminarTesoreria.setVisible(this.isPermisoEliminarTesoreria);
			this.jInternalFrameDetalleFormTesoreria.jButtonCancelarTesoreria.setVisible(this.isVisibilidadCeldaCancelarTesoreria);						
			this.jInternalFrameDetalleFormTesoreria.jButtonGuardarCambiosTesoreria.setVisible(this.isPermisoGuardarCambiosTesoreria);							
		}
		
		this.jButtonGuardarCambiosTablaTesoreria.setVisible(this.isPermisoActualizarTesoreria);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTesoreria() {
		this.jInternalFrameDetalleFormTesoreria.jButtonModificarTesoreria.setVisible(this.isPermisoActualizarTesoreria);	
		this.jInternalFrameDetalleFormTesoreria.jButtonActualizarTesoreria.setVisible(this.isPermisoActualizarTesoreria);	
		this.jInternalFrameDetalleFormTesoreria.jButtonEliminarTesoreria.setVisible(this.isPermisoEliminarTesoreria);
		this.jInternalFrameDetalleFormTesoreria.jButtonCancelarTesoreria.setVisible(this.isVisibilidadCeldaCancelarTesoreria);							
		this.jInternalFrameDetalleFormTesoreria.jButtonGuardarCambiosTesoreria.setVisible((this.isVisibilidadCeldaGuardarTesoreria && this.isPermisoGuardarCambiosTesoreria));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTesoreria() {
		if(TesoreriaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTesoreria();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTesoreria() {
	}
	
	public void jTableDatosTesoreriaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTesoreria(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTesoreriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tesoreriaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTesoreria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTesoreria(this.gettesoreria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTesoreria(this.tesoreria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tesoreria =(Tesoreria) this.tesoreriaLogic.getTesorerias().toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tesoreria =(Tesoreria) this.tesorerias.toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tesoreria==null) {
						this.tesoreria = new Tesoreria();
					}

					this.setVariablesFormularioToObjetoActualTesoreria(this.tesoreria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTesoreria(this.tesoreria);
				}

				if(this.tesoreria.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tesoreria.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTesoreria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tesoreriaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tesoreriaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tesoreriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTesoreriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tesoreriaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTesoreria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTesoreria(this.gettesoreria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTesoreria(this.tesoreria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tesoreria =(Tesoreria) this.tesoreriaLogic.getTesorerias().toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tesoreria =(Tesoreria) this.tesorerias.toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tesoreria==null) {
						this.tesoreria = new Tesoreria();
					}

					this.setVariablesFormularioToObjetoActualTesoreria(this.tesoreria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTesoreria(this.tesoreria);
				}

				if(this.tesoreria.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tesoreria.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTesoreria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tesoreriaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tesoreriaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tesoreriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTesoreria() {
		if(this.jInternalFrameDetalleFormTesoreria!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTesoreria!=null) {
			this.jInternalFrameDetalleFormTesoreria.setVisible(false);	    			
			this.jInternalFrameDetalleFormTesoreria.dispose();
			this.jInternalFrameDetalleFormTesoreria=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTesoreria!=null) {
			this.jInternalFrameReporteDinamicoTesoreria.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTesoreria.dispose();
			this.jInternalFrameReporteDinamicoTesoreria=null;
		}
		
		if(this.jInternalFrameImportacionTesoreria!=null) {
			this.jInternalFrameImportacionTesoreria.setVisible(false);	    			
			this.jInternalFrameImportacionTesoreria.dispose();
			this.jInternalFrameImportacionTesoreria=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTesoreria();
			
			TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTesoreria")) {
				jButtonNuevoTesoreriaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTesoreria")) {
				jButtonDuplicarTesoreriaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTesoreria")) {
				jButtonCopiarTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTesoreria")) {
				jButtonVerFormTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTesoreria")) {
				jButtonNuevoTesoreriaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTesoreria")) {
				jButtonDuplicarTesoreriaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTesoreria")) {
				jButtonNuevoTesoreriaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTesoreria")) {
				jButtonDuplicarTesoreriaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTesoreria")) {
				jButtonNuevoTesoreriaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTesoreria")) {
				jButtonNuevoTesoreriaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTesoreria")) {
				jButtonNuevoTesoreriaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTesoreria")) {
				jButtonModificarTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTesoreria")) {
				jButtonModificarTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTesoreria")) {
				jButtonModificarTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTesoreria")) {
				jButtonActualizarTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTesoreria")) {
				jButtonActualizarTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTesoreria")) {
				jButtonActualizarTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTesoreria")) {
				jButtonEliminarTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTesoreria")) {
				jButtonEliminarTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTesoreria")) {
				jButtonEliminarTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTesoreria")) {
				jButtonCancelarTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTesoreria")) {
				jButtonCancelarTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTesoreria")) {
				jButtonCancelarTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTesoreria")) {
				jButtonCerrarTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTesoreria")) {
				jButtonCerrarTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTesoreria")) {
				jButtonCerrarTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTesoreria")) {
				jButtonMostrarOcultarTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTesoreria")) {
				jButtonCancelarTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTesoreria")) {
				jButtonGuardarCambiosTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTesoreria")) {
				jButtonGuardarCambiosTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTesoreria")) {
				jButtonCopiarTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTesoreria")) {
				jButtonVerFormTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTesoreria")) {
				jButtonGuardarCambiosTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTesoreria")) {
				jButtonCopiarTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTesoreria")) {
				jButtonVerFormTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTesoreria")) {
				jButtonGuardarCambiosTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTesoreria")) {
				jButtonGuardarCambiosTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTesoreria")) {
				jButtonGuardarCambiosTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTesoreria")) {
				jButtonRecargarInformacionTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTesoreria")) {
				jButtonRecargarInformacionTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTesoreria")) {
				jButtonRecargarInformacionTesoreriaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTesoreria")) {
				jButtonAnterioresTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTesoreria")) {
				jButtonAnterioresTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTesoreria")) {
				jButtonAnterioresTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTesoreria")) {
				jButtonSiguientesTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTesoreria")) {
				jButtonSiguientesTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTesoreria")) {
				jButtonSiguientesTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTesoreria") || sTipo.equals("MenuItemDetalleAbrirOrderByTesoreria")) {
				jButtonAbrirOrderByTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTesoreria") || sTipo.equals("MenuItemDetalleMostrarOcultarTesoreria")) {
				jButtonMostrarOcultarTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTesoreria")) {
				jButtonNuevoGuardarCambiosTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTesoreria")) {
				jButtonNuevoGuardarCambiosTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTesoreria")) {
				jButtonNuevoGuardarCambiosTesoreriaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTesoreria")) {
				jButtonCerrarReporteDinamicoTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTesoreria")) {
				jButtonGenerarReporteDinamicoTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTesoreria")) {
				
				jButtonGenerarExcelReporteDinamicoTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTesoreria")) {
				jButtonCerrarImportacionTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTesoreria")) {
				
				jButtonGenerarImportacionTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTesoreria")) {
				
				jButtonAbrirImportacionTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTesoreria")) {
				jComboBoxTiposAccionesTesoreriaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTesoreria")) {
				jComboBoxTiposRelacionesTesoreriaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTesoreria")) {
				jComboBoxTiposAccionesTesoreriaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTesoreria")) {
				
				jComboBoxTiposSeleccionarTesoreriaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTesoreria")) {
				jTextFieldValorCampoGeneralTesoreriaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTesoreria")) {
				jButtonAbrirOrderByTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTesoreria")) {
				jButtonAbrirOrderByTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTesoreria")) {
				jButtonCerrarOrderByTesoreriaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTesoreriaBusqueda")) {
				this.jButtonidTesoreriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTesoreriaBusqueda")) {
				this.jButtoncodigoTesoreriaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTesoreria();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTesoreriaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tesoreria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tesoreria);
				
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
				
				


				
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Tesoreria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Tesoreria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Tesoreria tesoreriaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tesoreriaLocal=this.tesoreria;
			} else {
				tesoreriaLocal=this.tesoreriaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tesoreria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tesoreria);
				
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
							
				
				


				
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Tesoreria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Tesoreria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTesoreriaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTesoreria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tesoreriaAnterior =(Tesoreria) this.tesoreriaLogic.getTesorerias().toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tesoreriaAnterior =(Tesoreria) this.tesorerias.toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
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
			
			TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
			
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
			
			


			
			TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTesoreriaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tesoreria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tesoreria);
				
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
								
						
				


				
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Tesoreria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Tesoreria.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tesoreria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tesoreria);
				
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
								
				
				


				
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Tesoreria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Tesoreria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTesoreriaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTesoreria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tesoreriaAnterior =(Tesoreria) this.tesoreriaLogic.getTesorerias().toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tesoreriaAnterior =(Tesoreria) this.tesorerias.toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tesoreria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tesoreria);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTesoreriaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTesoreria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tesoreriaAnterior =(Tesoreria) this.tesoreriaLogic.getTesorerias().toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tesoreriaAnterior =(Tesoreria) this.tesorerias.toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTesoreriaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tesoreria);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tesoreria);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tesoreria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tesoreria);
				
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
							
				
				


				
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Tesoreria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Tesoreria.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTesoreriaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTesoreria.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tesoreriaAnterior =(Tesoreria) this.tesoreriaLogic.getTesorerias().toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tesoreriaAnterior =(Tesoreria) this.tesorerias.toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
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
			
			TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
			
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
			
			


			
			TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTesoreriaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tesoreria);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tesoreria);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tesoreria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tesoreria);
				
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
								
				
				


				
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Tesoreria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Tesoreria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTesoreriaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTesoreria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tesoreriaAnterior =(Tesoreria) this.tesoreriaLogic.getTesorerias().toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tesoreriaAnterior =(Tesoreria) this.tesorerias.toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTesoreriaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tesoreria);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tesoreria);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTesoreriaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tesoreria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tesoreria);
				
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTesoreria")) {
					jCheckBoxSeleccionarTodosTesoreriaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTesoreria")) {
					jCheckBoxSeleccionadosTesoreriaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTesoreria")) {
					
				}
				
				


				
				
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Tesoreria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Tesoreria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tesoreria);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tesoreria);
				
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
												
				
				


				
				
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Tesoreria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Tesoreria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTesoreriaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTesoreria.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tesoreriaAnterior =(Tesoreria) this.tesoreriaLogic.getTesorerias().toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tesoreriaAnterior =(Tesoreria) this.tesorerias.toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTesoreriaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tesoreria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tesoreria);
				
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
				
				
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
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
			
			TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
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
			
			


			
			TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTesoreriaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tesoreria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tesoreria);
				
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Tesoreria.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Tesoreria.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tesoreria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tesoreria);
				
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
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
				
				


				
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Tesoreria.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Tesoreria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTesoreriaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTesoreria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tesoreriaAnterior =(Tesoreria) this.tesoreriaLogic.getTesorerias().toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tesoreriaAnterior =(Tesoreria) this.tesorerias.toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTesoreria")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTesoreriaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTesoreria.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tesoreria =(Tesoreria) this.tesoreriaLogic.getTesorerias().toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tesoreria =(Tesoreria) this.tesorerias.toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tesoreria);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTesoreria")) {
				
				}
				
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTesoreria")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTesoreria.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTesoreria")) {
			
			}
			
			TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTesoreria();
			
			TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
			
			if(sTipo.equals("NuevoTesoreria")) {
				jButtonNuevoTesoreriaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTesoreria")) {
				jButtonDuplicarTesoreriaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTesoreria")) {
				jButtonCopiarTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTesoreria")) {
				jButtonVerFormTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTesoreria")) {
				jButtonNuevoTesoreriaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTesoreria")) {
				jButtonModificarTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTesoreria")) {
				jButtonActualizarTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTesoreria")) {
				jButtonEliminarTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTesoreria")) {
				jButtonGuardarCambiosTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTesoreria")) {
				jButtonCancelarTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTesoreria")) {
				jButtonCerrarTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTesoreria")) {
				jButtonGuardarCambiosTesoreriaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTesoreria")) {
				jButtonNuevoGuardarCambiosTesoreriaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTesoreria")) {
				jButtonAbrirOrderByTesoreriaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTesoreria")) {
				jButtonRecargarInformacionTesoreriaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTesoreria")) {
				jButtonAnterioresTesoreriaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTesoreria")) {
				jButtonSiguientesTesoreriaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTesoreriaBusqueda")) {
				this.jButtonidTesoreriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTesoreriaBusqueda")) {
				this.jButtoncodigoTesoreriaBusquedaActionPerformed(evt);
			}
			
			TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTesoreria();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTesoreria")) {
				closingInternalFrameTesoreria();
				
			} else if(sTipo.equals("jButtonCancelarTesoreria")) {
				JInternalFrameBase jInternalFrameDetalleFormTesoreria = (JInternalFrameBase)evt.getSource();
	            	
	            TesoreriaBeanSwingJInternalFrame jInternalFrameParent=(TesoreriaBeanSwingJInternalFrame)jInternalFrameDetalleFormTesoreria.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTesoreriaActionPerformed(null);
			}
			
			TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tesoreria,new Object(),this.tesoreriaParameterGeneral,this.tesoreriaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTesoreria(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTesoreria(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTesoreria(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tesoreria)) {
			if(!esControlTabla) {
				if(TesoreriaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTesoreria(this.tesoreria,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTesoreria(this.tesoreria);			
				}
				
				if(this.tesoreriaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTesoreria(this.tesoreria,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTesoreria(this.tesoreriaReturnGeneral,this.tesoreriaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tesoreriaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTesoreria(classes,this.tesoreriaReturnGeneral,this.tesoreriaBean,false);
					}
						
					if(this.tesoreriaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTesoreria(this.tesoreriaReturnGeneral.getTesoreria());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTesoreria(this.tesoreriaReturnGeneral.getTesoreria());	
					}
						
					if(this.tesoreriaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTesoreria(this.tesoreriaReturnGeneral.getTesoreria(),classes);//this.tesoreriaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTesoreria(this.tesoreria,classes);//this.tesoreriaBean);									
				}
			
				if(TesoreriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTesoreria(this.tesoreria,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTesoreria(this.tesoreria);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tesoreriaAnterior!=null) {
						this.tesoreria=this.tesoreriaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tesoreriaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tesoreriaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tesoreriaReturnGeneral.getTesoreria(),tesoreriaLogic.getTesorerias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tesoreriaReturnGeneral.getTesoreria(),this.tesorerias);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTesoreria.repaint();
				
				//((AbstractTableModel) this.jTableDatosTesoreria.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTesoreria();
			}
		}
	}
	
	public void actualizarVisualTableDatosTesoreria() throws Exception {
		
		TesoreriaModel tesoreriaModel=(TesoreriaModel)this.jTableDatosTesoreria.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tesoreriaModel.tesorerias=this.tesoreriaLogic.getTesorerias();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tesoreriaModel.tesorerias=this.tesorerias;
		}
		
		
		((TesoreriaModel) this.jTableDatosTesoreria.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTesoreria() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettesoreriaAnterior(),this.tesoreriaLogic.getTesorerias());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettesoreriaAnterior(),this.tesorerias);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTesoreria();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTesoreria(Tesoreria tesoreria,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
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
										
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tesoreria,new Object(),generalEntityParameterGeneral,this.tesoreriaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tesoreriaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TesoreriaConstantesFunciones.getClassesRelationshipsOfTesoreria(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TesoreriaConstantesFunciones.getClassesRelationshipsFromStringsOfTesoreria(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTesoreria(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tesoreria,new Object(),generalEntityParameterGeneral,this.tesoreriaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTesoreria(TesoreriaBean tesoreriaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTesoreria(ArrayList<Classe> classes,TesoreriaReturnGeneral tesoreriaReturnGeneral,TesoreriaBean tesoreriaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTesoreria(Tesoreria tesoreria,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tesoreria)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTesoreria = new TesoreriaDetalleFormJInternalFrame(jDesktopPane,this.tesoreriaSessionBean.getConGuardarRelaciones(),this.tesoreriaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTesoreria);
		this.jInternalFrameDetalleFormTesoreria.setVisible(false);
		this.jInternalFrameDetalleFormTesoreria.setSelected(false);						
		
		this.jInternalFrameDetalleFormTesoreria.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTesoreria.tesoreriaLogic=this.tesoreriaLogic;
		
		this.cargarCombosFrameForeignKeyTesoreria("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTesoreria();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTesoreria();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTesoreria("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTesoreria();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTesoreria.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTesoreria"));
		
		this.jInternalFrameDetalleFormTesoreria.jButtonModificarTesoreria.addActionListener(new ButtonActionListener(this,"ModificarTesoreria"));

		
		this.jInternalFrameDetalleFormTesoreria.jButtonModificarToolBarTesoreria.addActionListener(new ButtonActionListener(this,"ModificarToolBarTesoreria"));
					
		this.jInternalFrameDetalleFormTesoreria.jMenuItemModificarTesoreria.addActionListener(new ButtonActionListener(this,"MenuItemModificarTesoreria"));		
		
		
		
		this.jInternalFrameDetalleFormTesoreria.jButtonActualizarTesoreria.addActionListener (new ButtonActionListener(this,"ActualizarTesoreria"));
		
		
		this.jInternalFrameDetalleFormTesoreria.jButtonActualizarToolBarTesoreria.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTesoreria"));
						
		this.jInternalFrameDetalleFormTesoreria.jMenuItemActualizarTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTesoreria"));		
		
		
		
		this.jInternalFrameDetalleFormTesoreria.jButtonEliminarTesoreria.addActionListener (new ButtonActionListener(this,"EliminarTesoreria"));
		
		
		this.jInternalFrameDetalleFormTesoreria.jButtonEliminarToolBarTesoreria.addActionListener (new ButtonActionListener(this,"EliminarToolBarTesoreria"));
								
		this.jInternalFrameDetalleFormTesoreria.jMenuItemEliminarTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTesoreria"));		
		
		
		
		this.jInternalFrameDetalleFormTesoreria.jButtonCancelarTesoreria.addActionListener (new ButtonActionListener(this,"CancelarTesoreria"));
		
		
		this.jInternalFrameDetalleFormTesoreria.jButtonCancelarToolBarTesoreria.addActionListener (new ButtonActionListener(this,"CancelarToolBarTesoreria"));
					
		this.jInternalFrameDetalleFormTesoreria.jMenuItemCancelarTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTesoreria"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTesoreria.jMenuItemDetalleCerrarTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTesoreria"));		
		
		
		
		this.jInternalFrameDetalleFormTesoreria.jButtonGuardarCambiosToolBarTesoreria.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTesoreria"));
		
		
		
		this.jInternalFrameDetalleFormTesoreria.jButtonGuardarCambiosToolBarTesoreria.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTesoreria"));
		
		
		
		this.jInternalFrameDetalleFormTesoreria.jComboBoxTiposAccionesFormularioTesoreria.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTesoreria"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTesoreria.jButtonidTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"idTesoreriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTesoreria.jButtoncodigoTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTesoreriaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTesoreria.jTabbedPaneRelacionesTesoreria.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTesoreria"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTesoreria"));
		
		if(this.jInternalFrameDetalleFormTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTesoreria.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTesoreria"));
		}
		
		this.jTableDatosTesoreria.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTesoreria"));
		
		this.jTableDatosTesoreria.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTesoreria"));
		
		this.jButtonNuevoTesoreria.addActionListener(new ButtonActionListener(this,"NuevoTesoreria"));
		
		this.jButtonDuplicarTesoreria.addActionListener(new ButtonActionListener(this,"DuplicarTesoreria"));
		
		this.jButtonCopiarTesoreria.addActionListener(new ButtonActionListener(this,"CopiarTesoreria"));
		
		this.jButtonVerFormTesoreria.addActionListener(new ButtonActionListener(this,"VerFormTesoreria"));
		
		
		this.jButtonNuevoToolBarTesoreria.addActionListener(new ButtonActionListener(this,"NuevoToolBarTesoreria"));
			
		this.jButtonDuplicarToolBarTesoreria.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTesoreria"));
			
		this.jMenuItemNuevoTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTesoreria"));
			
		this.jMenuItemDuplicarTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTesoreria"));		
		
		
		this.jButtonNuevoRelacionesTesoreria.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTesoreria"));
		
		
		this.jButtonNuevoRelacionesToolBarTesoreria.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTesoreria"));
			
		this.jMenuItemNuevoRelacionesTesoreria.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTesoreria"));		
		
		
		if(this.jInternalFrameDetalleFormTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTesoreria.jButtonModificarTesoreria.addActionListener(new ButtonActionListener(this,"ModificarTesoreria"));
		}
		
		
		if(this.jInternalFrameDetalleFormTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTesoreria.jButtonModificarToolBarTesoreria.addActionListener(new ButtonActionListener(this,"ModificarToolBarTesoreria"));
			
			this.jInternalFrameDetalleFormTesoreria.jMenuItemModificarTesoreria.addActionListener(new ButtonActionListener(this,"MenuItemModificarTesoreria"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTesoreria!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTesoreria.jButtonActualizarTesoreria.addActionListener (new ButtonActionListener(this,"ActualizarTesoreria"));
		}
		
		
		if(this.jInternalFrameDetalleFormTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTesoreria.jButtonActualizarToolBarTesoreria.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTesoreria"));
				
			this.jInternalFrameDetalleFormTesoreria.jMenuItemActualizarTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTesoreria"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTesoreria.jButtonEliminarTesoreria.addActionListener (new ButtonActionListener(this,"EliminarTesoreria"));
		}
		
		
		if(this.jInternalFrameDetalleFormTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTesoreria.jButtonEliminarToolBarTesoreria.addActionListener (new ButtonActionListener(this,"EliminarToolBarTesoreria"));
						
			this.jInternalFrameDetalleFormTesoreria.jMenuItemEliminarTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTesoreria"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTesoreria.jButtonCancelarTesoreria.addActionListener (new ButtonActionListener(this,"CancelarTesoreria"));
		}
		
		
		if(this.jInternalFrameDetalleFormTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTesoreria.jButtonCancelarToolBarTesoreria.addActionListener (new ButtonActionListener(this,"CancelarToolBarTesoreria"));
			
			this.jInternalFrameDetalleFormTesoreria.jMenuItemCancelarTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTesoreria"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTesoreria.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTesoreria"));		
		
		
		this.jButtonCerrarTesoreria.addActionListener (new ButtonActionListener(this,"CerrarTesoreria"));
		
		
		this.jButtonCerrarToolBarTesoreria.addActionListener (new ButtonActionListener(this,"CerrarToolBarTesoreria"));
			
		this.jMenuItemCerrarTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTesoreria"));
			
		if(this.jInternalFrameDetalleFormTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTesoreria.jMenuItemDetalleCerrarTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTesoreria"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTesoreria.jButtonGuardarCambiosTesoreria.addActionListener (new ButtonActionListener(this,"GuardarCambiosTesoreria"));
		}
		
		
		if(this.jInternalFrameDetalleFormTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTesoreria.jButtonGuardarCambiosToolBarTesoreria.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTesoreria"));
		}
		
		this.jButtonCopiarToolBarTesoreria.addActionListener (new ButtonActionListener(this,"CopiarToolBarTesoreria"));
			
		this.jButtonVerFormToolBarTesoreria.addActionListener (new ButtonActionListener(this,"VerFormToolBarTesoreria"));
		
		this.jMenuItemGuardarCambiosTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTesoreria"));
			
		this.jMenuItemCopiarTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTesoreria"));		
		
		this.jMenuItemVerFormTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTesoreria"));		
		
		
		this.jButtonGuardarCambiosTablaTesoreria.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTesoreria"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTesoreria.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTesoreria"));
			
		this.jMenuItemGuardarCambiosTablaTesoreria.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTesoreria"));		
		
		
		
		this.jButtonRecargarInformacionTesoreria.addActionListener (new ButtonActionListener(this,"RecargarInformacionTesoreria"));
					
		this.jButtonRecargarInformacionToolBarTesoreria.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTesoreria"));
		
		this.jMenuItemRecargarInformacionTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTesoreria"));		
		
		
		
		this.jButtonAnterioresTesoreria.addActionListener (new ButtonActionListener(this,"AnterioresTesoreria"));
		
		
		this.jButtonAnterioresToolBarTesoreria.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTesoreria"));
		
		this.jMenuItemAnterioresTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTesoreria"));		
		
		
		this.jButtonSiguientesTesoreria.addActionListener (new ButtonActionListener(this,"SiguientesTesoreria"));
		
		
		this.jButtonSiguientesToolBarTesoreria.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTesoreria"));
			
		this.jMenuItemSiguientesTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTesoreria"));
			
		this.jMenuItemAbrirOrderByTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTesoreria"));
			
		this.jMenuItemMostrarOcultarTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTesoreria"));
			
		this.jMenuItemDetalleAbrirOrderByTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTesoreria"));
			
		this.jMenuItemDetalleMostarOcultarTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTesoreria"));		
		
		
		this.jButtonNuevoGuardarCambiosTesoreria.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTesoreria"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTesoreria.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTesoreria"));
			
		this.jMenuItemNuevoGuardarCambiosTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTesoreria"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTesoreria.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTesoreria"));

		this.jCheckBoxSeleccionadosTesoreria.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTesoreria"));
		
		if(this.jInternalFrameDetalleFormTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTesoreria.jComboBoxTiposAccionesFormularioTesoreria.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTesoreria"));
		}
		
		
		this.jComboBoxTiposRelacionesTesoreria.addActionListener (new ButtonActionListener(this,"TiposRelacionesTesoreria"));
			
		this.jComboBoxTiposAccionesTesoreria.addActionListener (new ButtonActionListener(this,"TiposAccionesTesoreria"));
					
		this.jComboBoxTiposSeleccionarTesoreria.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTesoreria"));
			
		this.jTextFieldValorCampoGeneralTesoreria.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTesoreria"));		
		
		
		if(this.jInternalFrameDetalleFormTesoreria!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTesoreria.jButtonidTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"idTesoreriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTesoreria.jButtoncodigoTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTesoreriaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTesoreria!=null) {
				this.jInternalFrameReporteDinamicoTesoreria.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTesoreria"));
				this.jInternalFrameReporteDinamicoTesoreria.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTesoreria"));
				this.jInternalFrameReporteDinamicoTesoreria.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTesoreria"));
			}
			
			//this.jButtonCerrarReporteDinamicoTesoreria.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTesoreria"));				
			//this.jButtonGenerarReporteDinamicoTesoreria.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTesoreria"));
			//this.jButtonGenerarExcelReporteDinamicoTesoreria.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTesoreria"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTesoreria!=null) {
				this.jInternalFrameImportacionTesoreria.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTesoreria"));
				this.jInternalFrameImportacionTesoreria.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTesoreria"));
				this.jInternalFrameImportacionTesoreria.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTesoreria"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTesoreria.addActionListener (new ButtonActionListener(this,"AbrirOrderByTesoreria"));
			
			this.jButtonAbrirOrderByToolBarTesoreria.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTesoreria"));			
			
			if(this.jInternalFrameOrderByTesoreria!=null) {
				this.jInternalFrameOrderByTesoreria.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTesoreria"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTesoreria!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTesoreria.jTabbedPaneRelacionesTesoreria.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTesoreria"));
		
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
            		closingInternalFrameTesoreria();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTesoreria.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTesoreria = (JInternalFrameBase)event.getSource();
	            	
	            TesoreriaBeanSwingJInternalFrame jInternalFrameParent=(TesoreriaBeanSwingJInternalFrame)jInternalFrameDetalleFormTesoreria.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTesoreriaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTesoreria.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTesoreriaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTesoreria.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTesoreria.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTesoreriaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTesoreriaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTesoreriaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTesoreria";
		inputMap = this.jButtonNuevoTesoreria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTesoreria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTesoreriaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTesoreriaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTesoreriaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTesoreriaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTesoreria";
		inputMap = this.jButtonNuevoRelacionesTesoreria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTesoreria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTesoreriaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTesoreria";
		inputMap = this.jButtonModificarTesoreria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTesoreria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTesoreriaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTesoreria";
		inputMap = this.jButtonActualizarTesoreria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTesoreria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTesoreriaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTesoreria";
		inputMap = this.jButtonEliminarTesoreria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTesoreria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTesoreriaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTesoreria";
		inputMap = this.jButtonCancelarTesoreria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTesoreria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTesoreriaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTesoreria";
		inputMap = this.jButtonCerrarTesoreria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTesoreria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTesoreriaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTesoreria.jButtonGuardarCambiosTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTesoreria";
		inputMap = this.jInternalFrameDetalleFormTesoreria.jButtonGuardarCambiosTesoreria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTesoreria.jButtonGuardarCambiosTesoreria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTesoreriaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTesoreria.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTesoreriaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTesoreria.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTesoreriaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTesoreria.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTesoreriaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTesoreria.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTesoreriaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTesoreria.jButtonidTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"idTesoreriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTesoreria.jButtoncodigoTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTesoreriaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTesoreriaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTesoreria.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTesoreria(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Tesoreria tesoreriaAux:this.tesoreriaLogic.getTesorerias()) {
					tesoreriaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Tesoreria tesoreriaAux:tesorerias) {
					tesoreriaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTesoreriaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTesoreria(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Tesoreria tesoreriaAux:this.tesoreriaLogic.getTesorerias()) {
						tesoreriaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Tesoreria tesoreriaAux:tesorerias) {
						tesoreriaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Tesoreria tesoreriaAux:this.tesoreriaLogic.getTesorerias()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Tesoreria tesoreriaAux:tesorerias) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTesoreria(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTesoreria.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTesoreria.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTesoreria,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTesoreriaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTesoreria(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTesoreria.getSelectedRows();
			
			Tesoreria tesoreriaLocal=new Tesoreria();
			
			//this.seleccionarTodosTesoreria(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tesoreriaLocal =(Tesoreria) this.tesoreriaLogic.getTesorerias().toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tesoreriaLocal =(Tesoreria) this.tesorerias.toArray()[this.jTableDatosTesoreria.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tesoreriaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Tesoreria tesoreriaAux:this.tesoreriaLogic.getTesorerias()) {
						tesoreriaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Tesoreria tesoreriaAux:tesorerias) {
						tesoreriaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTesoreria(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTesoreria.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTesoreria.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTesoreria,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTesoreriaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTesoreriaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTesoreriaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTesoreria(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTesoreria.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Tesoreria tesoreriaAux:this.tesoreriaLogic.getTesorerias()) {
				
						if(sTipoSeleccionar.equals(TesoreriaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tesoreriaAux.setcodigo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Tesoreria tesoreriaAux:tesorerias) {
					
						if(sTipoSeleccionar.equals(TesoreriaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tesoreriaAux.setcodigo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTesoreria(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTesoreriaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTesoreria(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTesoreria=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTesoreria.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTesoreria.jComboBoxTiposAccionesFormularioTesoreria.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTesoreria) {				
					conSplash=true;//false;										
					
					//this.startProcessTesoreria(conSplash);
				
					this.generarReporteTesoreriasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTesoreria.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTesoreria.jComboBoxTiposAccionesFormularioTesoreria.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTesoreriasSeleccionados();
				//this.jComboBoxTiposAccionesTesoreria.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTesoreriasSeleccionados(false);
				//this.jComboBoxTiposAccionesTesoreria.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTesoreriasSeleccionados(true);
				//this.jComboBoxTiposAccionesTesoreria.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTesoreria();
				
				this.exportarTesoreriasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTesoreria.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTesoreria.jComboBoxTiposAccionesFormularioTesoreria.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTesorerias();
				//this.importarTesorerias();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTesoreria.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTesoreria.jComboBoxTiposAccionesFormularioTesoreria.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTesoreria();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTesoreriasSeleccionados();
				//this.jComboBoxTiposAccionesTesoreria.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tesoreria", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTesoreria();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTesoreria)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTesoreria(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tesoreria",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTesoreria.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTesoreria.jComboBoxTiposAccionesFormularioTesoreria.setSelectedIndex(0);					
				}	
			} 			
			else if(TesoreriaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTesoreria) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTesoreria(conSplash);
					
						//this.actualizarParametrosGeneralTesoreria();
						
						this.generarReporteProcesoAccionTesoreriasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTesoreria.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTesoreria.jComboBoxTiposAccionesFormularioTesoreria.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TesoreriaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO TesoreriaS SELECCIONADOS?", "MANTENIMIENTO DE Tesoreria", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTesoreria();
				
						this.actualizarParametrosGeneralTesoreria();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tesoreriaReturnGeneral=tesoreriaLogic.procesarAccionTesoreriasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tesoreriaLogic.getTesorerias(),this.tesoreriaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTesoreriaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTesoreria.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTesoreria.jComboBoxTiposAccionesFormularioTesoreria.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTesoreria();
					
					TesoreriaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTesoreriaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTesoreria.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTesoreria.jComboBoxTiposAccionesFormularioTesoreria.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTesoreria(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTesoreriaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTesoreria();
			
			if(this.jInternalFrameDetalleFormTesoreria==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Tesoreria> tesoreriasSeleccionados=new ArrayList<Tesoreria>();		
			Tesoreria tesoreria=new Tesoreria();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTesoreria(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTesoreria.getSelectedItem();
			
			
			
			
			tesoreriasSeleccionados=this.getTesoreriasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tesoreriasSeleccionados.size()==1) {
				for(Tesoreria tesoreriaAux:tesoreriasSeleccionados) {
					tesoreria=tesoreriaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTesoreria();
			
      		//this.finishProcessTesoreria(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTesoreriaReturnGeneral() throws Exception {
		if(this.tesoreriaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tesoreriaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tesoreriaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tesoreriaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tesoreriaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tesoreriaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTesoreria(false);
		}
		
		if(this.tesoreriaReturnGeneral.getConRetornoLista() || this.tesoreriaReturnGeneral.getConRetornoObjeto()) {
			if(this.tesoreriaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tesoreriaLogic.setTesorerias(this.tesoreriaReturnGeneral.getTesorerias());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tesoreriaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tesoreriaLogic.setTesoreria(this.tesoreriaReturnGeneral.getTesoreria());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTesoreria(false);
		}
	}
	
	public void actualizarParametrosGeneralTesoreria() throws Exception {
		
		
	}
	
	public ArrayList<Tesoreria> getTesoreriasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Tesoreria> tesoreriasSeleccionados=new ArrayList<Tesoreria>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTesoreria) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Tesoreria tesoreriaAux:tesoreriaLogic.getTesorerias()) {
					if(tesoreriaAux.getIsSelected()) {
						tesoreriasSeleccionados.add(tesoreriaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Tesoreria tesoreriaAux:this.tesorerias) {
					if(tesoreriaAux.getIsSelected()) {
						tesoreriasSeleccionados.add(tesoreriaAux);				
					}
				}
			}
			
			if(tesoreriasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tesoreriasSeleccionados.addAll(this.tesoreriaLogic.getTesorerias());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tesoreriasSeleccionados.addAll(this.tesorerias);				
					}
				}
			}
		} else {
			tesoreriasSeleccionados.add(this.tesoreria);
		}
		
		return tesoreriasSeleccionados;
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
	
	public void generarReporteTesoreriasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTesoreriasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTesoreriasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTesoreriasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTesoreriasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tesoreria",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTesoreriasSeleccionados() throws Exception {
		ArrayList<Tesoreria> tesoreriasSeleccionados=new ArrayList<Tesoreria>();		
		
		tesoreriasSeleccionados=this.getTesoreriasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTesorerias("Todos",tesoreriasSeleccionados);
		
	}	
	
	public void generarReporteNormalTesoreriasSeleccionados() throws Exception {
		ArrayList<Tesoreria> tesoreriasSeleccionados=new ArrayList<Tesoreria>();		
		
		tesoreriasSeleccionados=this.getTesoreriasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTesorerias("Todos",tesoreriasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTesoreriasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Tesoreria> tesoreriasSeleccionados=new ArrayList<Tesoreria>();
		
		tesoreriasSeleccionados=this.getTesoreriasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTesorerias("Todos",tesoreriasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTesoreriasSeleccionados() throws Exception {
		ArrayList<Tesoreria> tesoreriasSeleccionados=new ArrayList<Tesoreria>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTesoreria();
		
		
		tesoreriasSeleccionados=this.getTesoreriasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTesoreria();
		
		
		//this.generarReporteTesorerias("Todos",tesoreriasSeleccionados ,tesoreriaImplementable,tesoreriaImplementableHome);
	}
	
	public void mostrarImportacionTesorerias() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTesoreria();
		
		this.abrirFrameImportacionTesoreria();		
		
			
		//this.generarReporteTesorerias("Todos",tesoreriasSeleccionados ,tesoreriaImplementable,tesoreriaImplementableHome);
	}
	
	public void importarTesorerias() throws Exception {		
	
	}
	
	public void exportarTesoreriasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTesoreriasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTesoreriasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTesoreriasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tesoreria",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTesoreriasSeleccionados() throws Exception {
		ArrayList<Tesoreria> tesoreriasSeleccionados=new ArrayList<Tesoreria>();		
		
		tesoreriasSeleccionados=this.getTesoreriasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tesoreria."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTesoreria(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Tesoreria tesoreriaAux:tesoreriasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTesoreria(tesoreriaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tesoreriaAux.setsDetalleGeneralEntityReporte(tesoreriaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tesoreriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tesoreria",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTesoreria(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TesoreriaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TesoreriaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TesoreriaConstantesFunciones.LABEL_CODIGO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTesoreria(Tesoreria tesoreria,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tesoreria.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tesoreria.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tesoreria.getcodigo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTesoreriasSeleccionados() throws Exception {
		ArrayList<Tesoreria> tesoreriasSeleccionados=new ArrayList<Tesoreria>();		
		
		tesoreriasSeleccionados=this.getTesoreriasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tesoreria.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Tesorerias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTesoreria(row);				
				iRow++;
			}				
			
			for(Tesoreria tesoreriaAux:tesoreriasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTesoreria(tesoreriaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tesoreriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tesoreria",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTesoreriasSeleccionados() throws Exception {
		ArrayList<Tesoreria> tesoreriasSeleccionados=new ArrayList<Tesoreria>();		
		
		tesoreriasSeleccionados=this.getTesoreriasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tesoreria.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tesorerias");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tesoreria");
			//elementRoot.appendChild(element);
		
			for(Tesoreria tesoreriaAux:tesoreriasSeleccionados) {
				element = document.createElement("tesoreria");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTesoreria(tesoreriaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tesoreriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tesoreria",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTesoreria(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TesoreriaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TesoreriaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TesoreriaConstantesFunciones.LABEL_CODIGO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTesoreria(Tesoreria tesoreria,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tesoreria.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tesoreria.getcodigo());				
	}
	
	public void setFilaDatosExportarXmlTesoreria(Tesoreria tesoreria,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TesoreriaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tesoreria.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TesoreriaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tesoreria.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TesoreriaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tesoreria.getcodigo().trim()));
		element.appendChild(elementcodigo);
	}
	
	public void generarReporteGroupGenericoTesoreriasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Tesoreria> tesoreriasSeleccionados=new ArrayList<Tesoreria>();
		
		tesoreriasSeleccionados=this.getTesoreriasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTesoreria(tesoreriasSeleccionados);
		
		this.generarReporteTesorerias("Todos",tesoreriasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTesoreria(ArrayList<Tesoreria> tesoreriasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Tesoreria tesoreriaAux:tesoreriasSeleccionados) {
				tesoreriaAux.setsDetalleGeneralEntityReporte(tesoreriaAux.toString());
			
				if(sTipoSeleccionar.equals(TesoreriaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tesoreriaAux.setsDescripcionGeneralEntityReporte1(tesoreriaAux.getcodigo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTesoreria(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTesoreria=true;
				this.isVisibilidadCeldaNuevoRelacionesTesoreria=true;
				this.isVisibilidadCeldaGuardarCambiosTesoreria=true;
			}
			
			this.isVisibilidadCeldaModificarTesoreria=false;
			this.isVisibilidadCeldaActualizarTesoreria=false;
			this.isVisibilidadCeldaEliminarTesoreria=false;
			this.isVisibilidadCeldaCancelarTesoreria=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTesoreria=true;
				} else {
					this.isVisibilidadCeldaGuardarTesoreria=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTesoreria=false;
			this.isVisibilidadCeldaNuevoRelacionesTesoreria=false;
			this.isVisibilidadCeldaGuardarCambiosTesoreria=false;
			this.isVisibilidadCeldaModificarTesoreria=false;
			this.isVisibilidadCeldaActualizarTesoreria=true;
			this.isVisibilidadCeldaEliminarTesoreria=false;
			this.isVisibilidadCeldaCancelarTesoreria=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTesoreria=true;
				} else {
					this.isVisibilidadCeldaGuardarTesoreria=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTesoreria=false;
			this.isVisibilidadCeldaNuevoRelacionesTesoreria=false;
			this.isVisibilidadCeldaGuardarCambiosTesoreria=false;
			this.isVisibilidadCeldaModificarTesoreria=false;
			this.isVisibilidadCeldaActualizarTesoreria=true;
			this.isVisibilidadCeldaEliminarTesoreria=true;
			this.isVisibilidadCeldaCancelarTesoreria=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTesoreria=true;
				} else {
					this.isVisibilidadCeldaGuardarTesoreria=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTesoreria=false;
			this.isVisibilidadCeldaNuevoRelacionesTesoreria=false;
			this.isVisibilidadCeldaGuardarCambiosTesoreria=false;
			this.isVisibilidadCeldaModificarTesoreria=false;
			this.isVisibilidadCeldaActualizarTesoreria=true;
			this.isVisibilidadCeldaEliminarTesoreria=false;
			this.isVisibilidadCeldaCancelarTesoreria=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTesoreria=false;
				} else {
					this.isVisibilidadCeldaGuardarTesoreria=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTesoreria=true;
			this.isVisibilidadCeldaNuevoRelacionesTesoreria=true;
			this.isVisibilidadCeldaGuardarCambiosTesoreria=true;
			this.isVisibilidadCeldaModificarTesoreria=false;
			this.isVisibilidadCeldaActualizarTesoreria=false;
			this.isVisibilidadCeldaEliminarTesoreria=false;
			this.isVisibilidadCeldaCancelarTesoreria=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTesoreria=true;
				} else {
					this.isVisibilidadCeldaGuardarTesoreria=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTesoreria=false;
			this.isVisibilidadCeldaNuevoRelacionesTesoreria=false;
			this.isVisibilidadCeldaGuardarCambiosTesoreria=false;
			this.isVisibilidadCeldaActualizarTesoreria=false;
			this.isVisibilidadCeldaEliminarTesoreria=false;
			this.isVisibilidadCeldaCancelarTesoreria=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTesoreria=false;
				} else {
					this.isVisibilidadCeldaGuardarTesoreria=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTesoreria=false;
			this.isVisibilidadCeldaNuevoRelacionesTesoreria=false;
			this.isVisibilidadCeldaGuardarCambiosTesoreria=false;
			this.isVisibilidadCeldaModificarTesoreria=true;
			this.isVisibilidadCeldaActualizarTesoreria=false;
			this.isVisibilidadCeldaEliminarTesoreria=false;
			this.isVisibilidadCeldaCancelarTesoreria=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTesoreria=false;
				} else {
					this.isVisibilidadCeldaGuardarTesoreria=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TesoreriaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTesoreria=true;
			this.isVisibilidadCeldaNuevoRelacionesTesoreria=true;
			this.isVisibilidadCeldaGuardarCambiosTesoreria=true;
		} else {
			this.actualizarEstadoPanelsTesoreria(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTesoreria=false;
			//this.isVisibilidadCeldaVerFormTesoreria=false;
			this.isVisibilidadCeldaDuplicarTesoreria=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tesoreriaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTesoreria=false;
		} else {
			this.isVisibilidadCeldaNuevoTesoreria=false;
			this.isVisibilidadCeldaGuardarCambiosTesoreria=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tesoreriaSessionBean.getEsGuardarRelacionado()) {
			if(!tesoreriaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTesoreria=false;												
			}
			
			this.jButtonCerrarTesoreria.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTesoreria=false;
		}
		
		if(!this.permiteMantenimiento(this.tesoreria)) {
			this.isVisibilidadCeldaActualizarTesoreria=false;
			this.isVisibilidadCeldaEliminarTesoreria=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTesoreria() {
	}
	
	public void actualizarEstadoPanelsTesoreria(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTesoreria!=null) {
				this.jScrollPanelDatosEdicionTesoreria.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTesoreria!=null) {
				this.jScrollPanelDatosTesoreria.setVisible(true);
			}
			
			if(this.jPanelPaginacionTesoreria!=null) {
				this.jPanelPaginacionTesoreria.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTesoreria!=null) {
				this.jPanelParametrosReportesTesoreria.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTesoreria!=null) {
				this.jScrollPanelDatosEdicionTesoreria.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTesoreria!=null) {
				this.jScrollPanelDatosTesoreria.setVisible(false);
			}
			
			if(this.jPanelPaginacionTesoreria!=null) {
				this.jPanelPaginacionTesoreria.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTesoreria!=null) {
				this.jPanelParametrosReportesTesoreria.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTesoreria!=null) {
				this.jScrollPanelDatosEdicionTesoreria.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTesoreria!=null) {
				this.jScrollPanelDatosTesoreria.setVisible(false);
			}
			
			if(this.jPanelPaginacionTesoreria!=null) {
				this.jPanelPaginacionTesoreria.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTesoreria!=null) {
				this.jPanelParametrosReportesTesoreria.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTesoreria!=null) {
				this.jScrollPanelDatosEdicionTesoreria.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTesoreria!=null) {
				this.jScrollPanelDatosTesoreria.setVisible(false);
			}
			
			if(this.jPanelPaginacionTesoreria!=null) {
				this.jPanelPaginacionTesoreria.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTesoreria!=null) {
				this.jPanelParametrosReportesTesoreria.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTesoreria!=null) {
				this.jScrollPanelDatosEdicionTesoreria.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTesoreria!=null) {
				this.jScrollPanelDatosTesoreria.setVisible(true);
			}
			
			if(this.jPanelPaginacionTesoreria!=null) {
				this.jPanelPaginacionTesoreria.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTesoreria!=null) {
				this.jPanelParametrosReportesTesoreria.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTesoreria!=null) {
				this.jScrollPanelDatosEdicionTesoreria.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTesoreria!=null) {
				this.jScrollPanelDatosTesoreria.setVisible(true);
			}
			
			if(this.jPanelPaginacionTesoreria!=null) {
				this.jPanelPaginacionTesoreria.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTesoreria!=null) {
				this.jPanelParametrosReportesTesoreria.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTesoreria!=null) {
				this.jScrollPanelDatosEdicionTesoreria.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTesoreria!=null) {
				this.jScrollPanelDatosTesoreria.setVisible(true);
			}
			
			if(this.jPanelPaginacionTesoreria!=null) {
				this.jPanelPaginacionTesoreria.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTesoreria!=null) {
				this.jPanelParametrosReportesTesoreria.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TesoreriaSessionBean tesoreriaSessionBean=new TesoreriaSessionBean();
		
		if(this.tesoreriaSessionBean==null) {
			this.tesoreriaSessionBean=new TesoreriaSessionBean();
		}
		
		this.tesoreriaSessionBean.setsUltimaBusquedaTesoreria(this.getsAccionBusqueda());
		this.tesoreriaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tesoreriaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TesoreriaSessionBean tesoreriaSessionBean=new TesoreriaSessionBean();
		
		if(this.tesoreriaSessionBean==null) {
			this.tesoreriaSessionBean=new TesoreriaSessionBean();
		}
		
		if(this.tesoreriaSessionBean.getsUltimaBusquedaTesoreria()!=null&&!this.tesoreriaSessionBean.getsUltimaBusquedaTesoreria().equals("")) {
			this.setsAccionBusqueda(tesoreriaSessionBean.getsUltimaBusquedaTesoreria());
			this.setiNumeroPaginacion(tesoreriaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tesoreriaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tesoreriaSessionBean.setsUltimaBusquedaTesoreria("");
		this.tesoreriaSessionBean.setiNumeroPaginacion(TesoreriaConstantesFunciones.INUMEROPAGINACION);
		this.tesoreriaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTesoreria(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTesoreria() {
		this.updateBorderResaltarBusquedasFormularioTesoreria();
		this.updateVisibilidadBusquedasFormularioTesoreria();
		this.updateHabilitarBusquedasFormularioTesoreria();
	}
	
	public void updateBorderResaltarBusquedasFormularioTesoreria() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTesoreria() {
	}
	
	public void updateHabilitarBusquedasFormularioTesoreria() {
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
	
	public void updateControlesFormularioTesoreria() throws Exception {

		if(this.jInternalFrameDetalleFormTesoreria==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTesoreria();
		this.updateVisibilidadResaltarControlesFormularioTesoreria();
		this.updateHabilitarResaltarControlesFormularioTesoreria();
		
	}
	
	public void updateBorderResaltarControlesFormularioTesoreria() throws Exception {
		if(this.jInternalFrameDetalleFormTesoreria==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tesoreriaConstantesFunciones.resaltaridTesoreria!=null && this.jInternalFrameDetalleFormTesoreria!=null) {this.jInternalFrameDetalleFormTesoreria.jLabelidTesoreria.setBorder(this.tesoreriaConstantesFunciones.resaltaridTesoreria);}
		if(this.tesoreriaConstantesFunciones.resaltarcodigoTesoreria!=null && this.jInternalFrameDetalleFormTesoreria!=null) {this.jInternalFrameDetalleFormTesoreria.jTextFieldcodigoTesoreria.setBorder(this.tesoreriaConstantesFunciones.resaltarcodigoTesoreria);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTesoreria() throws Exception {		
		if(this.jInternalFrameDetalleFormTesoreria==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTesoreria!=null) {
	
		//this.jInternalFrameDetalleFormTesoreria.jLabelidTesoreria.setVisible(this.tesoreriaConstantesFunciones.mostraridTesoreria);
		this.jInternalFrameDetalleFormTesoreria.jPanelidTesoreria.setVisible(this.tesoreriaConstantesFunciones.mostraridTesoreria);
		//this.jInternalFrameDetalleFormTesoreria.jTextFieldcodigoTesoreria.setVisible(this.tesoreriaConstantesFunciones.mostrarcodigoTesoreria);
		this.jInternalFrameDetalleFormTesoreria.jPanelcodigoTesoreria.setVisible(this.tesoreriaConstantesFunciones.mostrarcodigoTesoreria);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTesoreria() throws Exception {
		if(this.jInternalFrameDetalleFormTesoreria==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTesoreria!=null) {
	
		this.jInternalFrameDetalleFormTesoreria.jLabelidTesoreria.setEnabled(this.tesoreriaConstantesFunciones.activaridTesoreria);
		this.jInternalFrameDetalleFormTesoreria.jTextFieldcodigoTesoreria.setEnabled(this.tesoreriaConstantesFunciones.activarcodigoTesoreria);
		}
	}
	
		
}