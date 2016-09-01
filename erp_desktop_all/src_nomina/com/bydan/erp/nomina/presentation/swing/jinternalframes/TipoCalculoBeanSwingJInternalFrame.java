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

import com.bydan.erp.nomina.util.TipoCalculoConstantesFunciones;
import com.bydan.erp.nomina.util.TipoCalculoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoCalculoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoCalculoBean;
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

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoCalculoBeanSwingJInternalFrame extends TipoCalculoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoCalculoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoCalculo> tipocalculoValidator = new ClassValidator<TipoCalculo>(TipoCalculo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoCalculo tipocalculo;	
	public TipoCalculo tipocalculoAux;
	public TipoCalculo tipocalculoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoCalculo tipocalculoTotales;
	public Long idTipoCalculoActual;
	public Long iIdNuevoTipoCalculo=0L;
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
	
	public Boolean isPermisoTodoTipoCalculo;
	public Boolean isPermisoNuevoTipoCalculo;
	public Boolean isPermisoActualizarTipoCalculo;
	public Boolean isPermisoActualizarOriginalTipoCalculo;
	public Boolean isPermisoEliminarTipoCalculo;
	public Boolean isPermisoGuardarCambiosTipoCalculo;
	public Boolean isPermisoConsultaTipoCalculo;
	public Boolean isPermisoBusquedaTipoCalculo;
	public Boolean isPermisoReporteTipoCalculo;
	public Boolean isPermisoPaginacionMedioTipoCalculo;
	public Boolean isPermisoPaginacionAltoTipoCalculo;
	public Boolean isPermisoPaginacionTodoTipoCalculo;
	public Boolean isPermisoCopiarTipoCalculo;
	public Boolean isPermisoVerFormTipoCalculo;
	public Boolean isPermisoDuplicarTipoCalculo;
	public Boolean isPermisoOrdenTipoCalculo;
	
	
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
	
	public TipoCalculoParameterReturnGeneral tipocalculoReturnGeneral;
	public TipoCalculoParameterReturnGeneral tipocalculoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoCalculo=false;
	public Boolean esParaAccionDesdeFormularioTipoCalculo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoCalculoLogic tipocalculoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoCalculo tipocalculoBean;
	public TipoCalculoConstantesFunciones tipocalculoConstantesFunciones;
	//public TipoCalculoParameterReturnGeneral tipocalculoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoCalculo> tipocalculos;	
	//public List<TipoCalculo> tipocalculosEliminados;
	//public List<TipoCalculo> tipocalculosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoCalculo=false;
	public Boolean isVisibilidadCeldaDuplicarTipoCalculo=true;
	public Boolean isVisibilidadCeldaCopiarTipoCalculo=true;
	public Boolean isVisibilidadCeldaVerFormTipoCalculo=true;
	public Boolean isVisibilidadCeldaOrdenTipoCalculo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoCalculo=false;
	public Boolean isVisibilidadCeldaModificarTipoCalculo=false;
	public Boolean isVisibilidadCeldaActualizarTipoCalculo=false;
	public Boolean isVisibilidadCeldaEliminarTipoCalculo=false;
	public Boolean isVisibilidadCeldaCancelarTipoCalculo=false;
	public Boolean isVisibilidadCeldaGuardarTipoCalculo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoCalculo=false;	
	
	
	
	public Long getiIdNuevoTipoCalculo() {
		return this.iIdNuevoTipoCalculo;
	}

	public void setiIdNuevoTipoCalculo(Long iIdNuevoTipoCalculo) {
		this.iIdNuevoTipoCalculo = iIdNuevoTipoCalculo;
	}
	
	public Long getidTipoCalculoActual() {
		return this.idTipoCalculoActual;
	}

	public void setidTipoCalculoActual(Long idTipoCalculoActual) {
		this.idTipoCalculoActual = idTipoCalculoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoCalculo gettipocalculo() {
		return this.tipocalculo;
	}

	public void settipocalculo(TipoCalculo tipocalculo) {
		this.tipocalculo = tipocalculo;
	}
	
	public TipoCalculo gettipocalculoAux() {
		return this.tipocalculoAux;
	}

	public void settipocalculoAux(TipoCalculo tipocalculoAux) {
		this.tipocalculoAux = tipocalculoAux;
	}				
	
	public TipoCalculo gettipocalculoAnterior() {
		return this.tipocalculoAnterior;
	}

	public void settipocalculoAnterior(TipoCalculo tipocalculoAnterior) {
		this.tipocalculoAnterior = tipocalculoAnterior;
	}	
	
	public TipoCalculo gettipocalculoTotales() {
		return this.tipocalculoTotales;
	}

	public void settipocalculoTotales(TipoCalculo tipocalculoTotales) {
		this.tipocalculoTotales = tipocalculoTotales;
	}	
	
	public TipoCalculo gettipocalculoBean() {
		return this.tipocalculoBean;
	}

	public void settipocalculoBean(TipoCalculo tipocalculoBean) {
		this.tipocalculoBean = tipocalculoBean;
	}	
	
	public TipoCalculoParameterReturnGeneral gettipocalculoReturnGeneral() {
		return this.tipocalculoReturnGeneral;
	}

	public void settipocalculoReturnGeneral(TipoCalculoParameterReturnGeneral tipocalculoReturnGeneral) {
		this.tipocalculoReturnGeneral = tipocalculoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoCalculoLogic getTipoCalculoLogic()	{		
		return tipocalculoLogic;
	}

	public void setTipoCalculoLogic(TipoCalculoLogic tipocalculoLogic) {
		this.tipocalculoLogic = tipocalculoLogic;
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
	
	public Boolean getIsEsNuevoTipoCalculo() {
		return isEsNuevoTipoCalculo;
	}

	public void setIsEsNuevoTipoCalculo(Boolean isEsNuevoTipoCalculo) {
		this.isEsNuevoTipoCalculo = isEsNuevoTipoCalculo;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoCalculo() {
		return esParaAccionDesdeFormularioTipoCalculo;
	}
	
	public void setEsParaAccionDesdeFormularioTipoCalculo(Boolean esParaAccionDesdeFormularioTipoCalculo) {
		this.esParaAccionDesdeFormularioTipoCalculo = esParaAccionDesdeFormularioTipoCalculo;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoCalculo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoCalculoConstantesFunciones.refrescarForeignKeysDescripcionesTipoCalculo(this.tipocalculoLogic.getTipoCalculos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoCalculoConstantesFunciones.refrescarForeignKeysDescripcionesTipoCalculo(this.tipocalculos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocalculoLogic.setTipoCalculos(this.tipocalculos);
			tipocalculoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoCalculoParameterReturnGeneral getTipoCalculoParameterGeneral() {
		return this.tipocalculoParameterGeneral;
	}
	
	public void setTipoCalculoParameterGeneral(TipoCalculoParameterReturnGeneral tipocalculoParameterGeneral) {
		this.tipocalculoParameterGeneral = tipocalculoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoCalculo() {
		return isPermisoTodoTipoCalculo;
	}

	public void setIsPermisoTodoTipoCalculo(Boolean isPermisoTodoTipoCalculo) {
		this.isPermisoTodoTipoCalculo = isPermisoTodoTipoCalculo;
	}

	public Boolean getIsPermisoNuevoTipoCalculo() {
		return isPermisoNuevoTipoCalculo;
	}

	public void setIsPermisoNuevoTipoCalculo(Boolean isPermisoNuevoTipoCalculo) {
		this.isPermisoNuevoTipoCalculo = isPermisoNuevoTipoCalculo;
	}

	public Boolean getIsPermisoActualizarTipoCalculo() {
		return isPermisoActualizarTipoCalculo;
	}

	public void setIsPermisoActualizarTipoCalculo(Boolean isPermisoActualizarTipoCalculo) {
		this.isPermisoActualizarTipoCalculo = isPermisoActualizarTipoCalculo;
	}

	public Boolean getIsPermisoEliminarTipoCalculo() {
		return isPermisoEliminarTipoCalculo;
	}

	public void setIsPermisoEliminarTipoCalculo(Boolean isPermisoEliminarTipoCalculo) {
		this.isPermisoEliminarTipoCalculo = isPermisoEliminarTipoCalculo;
	}

	public Boolean getIsPermisoGuardarCambiosTipoCalculo() {
		return isPermisoGuardarCambiosTipoCalculo;
	}

	public void setIsPermisoGuardarCambiosTipoCalculo(Boolean isPermisoGuardarCambiosTipoCalculo) {
		this.isPermisoGuardarCambiosTipoCalculo = isPermisoGuardarCambiosTipoCalculo;
	}
	
	public Boolean getIsPermisoConsultaTipoCalculo() {
		return isPermisoConsultaTipoCalculo;
	}

	public void setIsPermisoConsultaTipoCalculo(Boolean isPermisoConsultaTipoCalculo) {
		this.isPermisoConsultaTipoCalculo = isPermisoConsultaTipoCalculo;
	}

	public Boolean getIsPermisoBusquedaTipoCalculo() {
		return isPermisoBusquedaTipoCalculo;
	}

	public void setIsPermisoBusquedaTipoCalculo(Boolean isPermisoBusquedaTipoCalculo) {
		this.isPermisoBusquedaTipoCalculo = isPermisoBusquedaTipoCalculo;
	}

	public Boolean getIsPermisoReporteTipoCalculo() {
		return isPermisoReporteTipoCalculo;
	}

	public void setIsPermisoReporteTipoCalculo(Boolean isPermisoReporteTipoCalculo) {
		this.isPermisoReporteTipoCalculo = isPermisoReporteTipoCalculo;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoCalculo() {
		return isPermisoPaginacionMedioTipoCalculo;
	}

	public void setIsPermisoPaginacionMedioTipoCalculo(Boolean isPermisoPaginacionMedioTipoCalculo) {
		this.isPermisoPaginacionMedioTipoCalculo = isPermisoPaginacionMedioTipoCalculo;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoCalculo() {
		return isPermisoPaginacionTodoTipoCalculo;
	}

	public void setIsPermisoPaginacionTodoTipoCalculo(Boolean isPermisoPaginacionTodoTipoCalculo) {
		this.isPermisoPaginacionTodoTipoCalculo = isPermisoPaginacionTodoTipoCalculo;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoCalculo() {
		return isPermisoPaginacionAltoTipoCalculo;
	}

	public void setIsPermisoPaginacionAltoTipoCalculo(Boolean isPermisoPaginacionAltoTipoCalculo) {
		this.isPermisoPaginacionAltoTipoCalculo = isPermisoPaginacionAltoTipoCalculo;
	}
	
	public Boolean getIsPermisoCopiarTipoCalculo() {
		return isPermisoCopiarTipoCalculo;
	}

	public void setIsPermisoCopiarTipoCalculo(Boolean isPermisoCopiarTipoCalculo) {
		this.isPermisoCopiarTipoCalculo = isPermisoCopiarTipoCalculo;
	}
	
	public Boolean getIsPermisoVerFormTipoCalculo() {
		return isPermisoVerFormTipoCalculo;
	}

	public void setIsPermisoVerFormTipoCalculo(Boolean isPermisoVerFormTipoCalculo) {
		this.isPermisoVerFormTipoCalculo = isPermisoVerFormTipoCalculo;
	}
	
	public Boolean getIsPermisoDuplicarTipoCalculo() {
		return isPermisoDuplicarTipoCalculo;
	}

	public void setIsPermisoDuplicarTipoCalculo(Boolean isPermisoDuplicarTipoCalculo) {
		this.isPermisoDuplicarTipoCalculo = isPermisoDuplicarTipoCalculo;
	}
	
	public Boolean getIsPermisoOrdenTipoCalculo() {
		return isPermisoOrdenTipoCalculo;
	}

	public void setIsPermisoOrdenTipoCalculo(Boolean isPermisoOrdenTipoCalculo) {
		this.isPermisoOrdenTipoCalculo = isPermisoOrdenTipoCalculo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoCalculo() {
		return isVisibilidadCeldaNuevoTipoCalculo;
	}

	public void setIsVisibilidadCeldaNuevoTipoCalculo(Boolean isVisibilidadCeldaNuevoTipoCalculo) {
		this.isVisibilidadCeldaNuevoTipoCalculo = isVisibilidadCeldaNuevoTipoCalculo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoCalculo() {
		return isVisibilidadCeldaDuplicarTipoCalculo;
	}

	public void setIsVisibilidadCeldaDuplicarTipoCalculo(Boolean isVisibilidadCeldaDuplicarTipoCalculo) {
		this.isVisibilidadCeldaDuplicarTipoCalculo = isVisibilidadCeldaDuplicarTipoCalculo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoCalculo() {
		return isVisibilidadCeldaCopiarTipoCalculo;
	}

	public void setIsVisibilidadCeldaCopiarTipoCalculo(Boolean isVisibilidadCeldaCopiarTipoCalculo) {
		this.isVisibilidadCeldaCopiarTipoCalculo = isVisibilidadCeldaCopiarTipoCalculo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoCalculo() {
		return isVisibilidadCeldaVerFormTipoCalculo;
	}

	public void setIsVisibilidadCeldaVerFormTipoCalculo(Boolean isVisibilidadCeldaVerFormTipoCalculo) {
		this.isVisibilidadCeldaVerFormTipoCalculo = isVisibilidadCeldaVerFormTipoCalculo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoCalculo() {
		return isVisibilidadCeldaOrdenTipoCalculo;
	}

	public void setIsVisibilidadCeldaOrdenTipoCalculo(Boolean isVisibilidadCeldaOrdenTipoCalculo) {
		this.isVisibilidadCeldaOrdenTipoCalculo = isVisibilidadCeldaOrdenTipoCalculo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoCalculo() {
		return isVisibilidadCeldaNuevoRelacionesTipoCalculo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoCalculo(Boolean isVisibilidadCeldaNuevoRelacionesTipoCalculo) {
		this.isVisibilidadCeldaNuevoRelacionesTipoCalculo = isVisibilidadCeldaNuevoRelacionesTipoCalculo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoCalculo() {
		return isVisibilidadCeldaModificarTipoCalculo;
	}

	public void setIsVisibilidadCeldaModificarTipoCalculo(Boolean isVisibilidadCeldaModificarTipoCalculo) {
		this.isVisibilidadCeldaModificarTipoCalculo = isVisibilidadCeldaModificarTipoCalculo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoCalculo() {
		return isVisibilidadCeldaActualizarTipoCalculo;
	}

	public void setIsVisibilidadCeldaActualizarTipoCalculo(Boolean isVisibilidadCeldaActualizarTipoCalculo) {
		this.isVisibilidadCeldaActualizarTipoCalculo = isVisibilidadCeldaActualizarTipoCalculo;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoCalculo() {
		return isVisibilidadCeldaEliminarTipoCalculo;
	}

	public void setIsVisibilidadCeldaEliminarTipoCalculo(Boolean isVisibilidadCeldaEliminarTipoCalculo) {
		this.isVisibilidadCeldaEliminarTipoCalculo = isVisibilidadCeldaEliminarTipoCalculo;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoCalculo() {
		return isVisibilidadCeldaCancelarTipoCalculo;
	}

	public void setIsVisibilidadCeldaCancelarTipoCalculo(Boolean isVisibilidadCeldaCancelarTipoCalculo) {
		this.isVisibilidadCeldaCancelarTipoCalculo = isVisibilidadCeldaCancelarTipoCalculo;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoCalculo() {
		return isVisibilidadCeldaGuardarTipoCalculo;
	}

	public void setIsVisibilidadCeldaGuardarTipoCalculo(Boolean isVisibilidadCeldaGuardarTipoCalculo) {
		this.isVisibilidadCeldaGuardarTipoCalculo = isVisibilidadCeldaGuardarTipoCalculo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoCalculo() {
		return isVisibilidadCeldaGuardarCambiosTipoCalculo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoCalculo(Boolean isVisibilidadCeldaGuardarCambiosTipoCalculo) {
		this.isVisibilidadCeldaGuardarCambiosTipoCalculo = isVisibilidadCeldaGuardarCambiosTipoCalculo;
	}
		
	public TipoCalculoSessionBean gettipocalculoSessionBean() {
		return this.tipocalculoSessionBean;
	}
	
	public void settipocalculoSessionBean(TipoCalculoSessionBean tipocalculoSessionBean) {
		this.tipocalculoSessionBean=tipocalculoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoCalculo(TipoCalculo tipocalculo)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoCalculo tipocalculo,TipoCalculo tipocalculoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoCalculo(tipocalculo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocalculoAux.setId(tipocalculo.getId());
		tipocalculoAux.setVersionRow(tipocalculo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoCalculo();
		
			int intSelectedRow = this.jTableDatosTipoCalculo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculo =(TipoCalculo) this.tipocalculoLogic.getTipoCalculos().toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocalculo =(TipoCalculo) this.tipocalculos.toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoCalculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoCalculo(this.tipocalculo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculo(this.tipocalculo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocalculoValidator.getInvalidValues(this.tipocalculo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocalculoLogic.setDatosCliente(datosCliente);
			tipocalculoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocalculoAux=new  TipoCalculo();
				
				tipocalculoAux.setIsNew(true);
				tipocalculoAux.setIsChanged(true);
				
				tipocalculoAux.setTipoCalculoOriginal(this.tipocalculo);
				
				tipocalculoAux.setId(this.tipocalculo.getId());	
				tipocalculoAux.setVersionRow(this.tipocalculo.getVersionRow());	
				tipocalculoAux.setcodigo(this.tipocalculo.getcodigo());	
				tipocalculoAux.setnombre(this.tipocalculo.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocalculoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocalculoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocalculoAux,tipocalculoLogic.getTipoCalculos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocalculoAux,tipocalculos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocalculoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocalculoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocalculoLogic.saveTipoCalculos();//WithConnection
						//tipocalculoLogic.getSetVersionRowTipoCalculos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocalculo,tipocalculoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocalculoAux=new  TipoCalculo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocalculoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocalculoSessionBean.getEsGuardarRelacionado() && this.tipocalculo.getId()>=0)) {
						
					tipocalculoAux.setIsNew(false);
				}
				
				tipocalculoAux.setIsDeleted(false);
			
				tipocalculoAux.setId(this.tipocalculo.getId());	
				tipocalculoAux.setVersionRow(this.tipocalculo.getVersionRow());	
				tipocalculoAux.setcodigo(this.tipocalculo.getcodigo());	
				tipocalculoAux.setnombre(this.tipocalculo.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocalculoAux,tipocalculoLogic.getTipoCalculos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocalculoAux,tipocalculos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocalculoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocalculoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocalculoLogic.saveTipoCalculos();//WithConnection
						//tipocalculoLogic.getSetVersionRowTipoCalculos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocalculo,tipocalculoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocalculoAux=new  TipoCalculo();
				
				tipocalculoAux.setIsNew(false);
				tipocalculoAux.setIsChanged(false);
				
				tipocalculoAux.setIsDeleted(true);
				
				tipocalculoAux.setId(this.tipocalculo.getId());	
				tipocalculoAux.setVersionRow(this.tipocalculo.getVersionRow());	
				tipocalculoAux.setcodigo(this.tipocalculo.getcodigo());	
				tipocalculoAux.setnombre(this.tipocalculo.getnombre());	
				
				if(this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocalculoAux.getId()>=0) {	
						this.tipocalculosEliminados.add(tipocalculoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocalculoAux,tipocalculoLogic.getTipoCalculos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocalculoAux,tipocalculos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocalculoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocalculoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocalculoLogic.saveTipoCalculos();//WithConnection
						//tipocalculoLogic.getSetVersionRowTipoCalculos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculoLogic.getTipoCalculos().addAll(this.tipocalculosEliminados);
					
					tipocalculoLogic.saveTipoCalculos();//WithConnection
					//tipocalculoLogic.getSetVersionRowTipoCalculos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipocalculosEliminados= new ArrayList<TipoCalculo>();		
			}
			
			if(this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Calculo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Calculo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocalculo=tipocalculoAux;
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
      		//this.finishProcessTipoCalculo();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoCalculo tipocalculoLocal) throws Exception {
		
		if(this.tipocalculoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoCalculo tipocalculoLocal) throws Exception {	
		if(this.tipocalculoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoCalculoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoCalculo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocalculo =(TipoCalculo) this.tipocalculoLogic.getTipoCalculos().toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocalculo =(TipoCalculo) this.tipocalculos.toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocalculoValidator.getInvalidValues(this.tipocalculo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoCalculo tipocalculo,List<TipoCalculo> tipocalculos) throws Exception {
		try	{		
			TipoCalculoConstantesFunciones.actualizarLista(tipocalculo,tipocalculos,this.tipocalculoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoCalculo tipocalculo,List<TipoCalculo> tipocalculos) throws Exception {
		try	{			
			TipoCalculoConstantesFunciones.actualizarSelectedLista(tipocalculo,tipocalculos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoCalculo> tipocalculosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocalculosLocal=this.tipocalculoLogic.getTipoCalculos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocalculosLocal=this.tipocalculos;
			}
			//ARCHITECTURE
		
			for(TipoCalculo tipocalculoLocal:tipocalculosLocal) {
				if(this.permiteMantenimiento(tipocalculoLocal) && tipocalculoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoCalculoConstantesFunciones.getTipoCalculoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoCalculoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCalculo.jLabelcodigoTipoCalculo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCalculoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCalculo.jLabelnombreTipoCalculo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCalculo.jLabelcodigoTipoCalculo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCalculo.jLabelnombreTipoCalculo,"");
		
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
		this.iIdNuevoTipoCalculo--;	
		
		
		this.tipocalculoAux=new TipoCalculo();
		
		this.tipocalculoAux.setId(this.iIdNuevoTipoCalculo);
		this.tipocalculoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocalculoLogic.getTipoCalculos().add(this.tipocalculoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocalculos.add(this.tipocalculoAux);
		}
		//ARCHITECTURE
		
		this.tipocalculo=this.tipocalculoAux;
		
		if(TipoCalculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoCalculo(this.tipocalculo);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCalculo(this.tipocalculo);
		}
				
		//this.setDefaultControlesTipoCalculo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoCalculo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoCalculo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCalculo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCalculo(this.tipocalculoBean,this.tipocalculo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculo(this.tipocalculo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoCalculoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocalculoSessionBean.getConGuardarRelaciones()) {
			classes=TipoCalculoConstantesFunciones.getClassesRelationshipsOfTipoCalculo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocalculoReturnGeneral=tipocalculoLogic.procesarEventosTipoCalculosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocalculoLogic.getTipoCalculos(),this.tipocalculo,this.tipocalculoParameterGeneral,this.isEsNuevoTipoCalculo,classes);//this.tipocalculoLogic.getTipoCalculo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoCalculo(this.tipocalculoReturnGeneral,this.tipocalculoBean,false);
		
		if(this.tipocalculoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCalculo(this.tipocalculoReturnGeneral.getTipoCalculo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoCalculo(this.tipocalculoReturnGeneral.getTipoCalculo());
		}
		
		if(this.tipocalculoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoCalculo(this.tipocalculoReturnGeneral.getTipoCalculo(),classes);//this.tipocalculoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoCalculo(this.tipocalculo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoCalculo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoCalculo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoCalculo(false);
						
			if(tipocalculoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoCalculoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCalculo();
			}
			
			this.actualizarVisualTableDatosTipoCalculo();
			
			this.jTableDatosTipoCalculo.setRowSelectionInterval(this.getIndiceNuevoTipoCalculo(), this.getIndiceNuevoTipoCalculo());
			
			this.seleccionarFilaTablaTipoCalculoActual();
						
			this.actualizarEstadoCeldasBotonesTipoCalculo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoCalculo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoCalculo.jTextFieldcodigoTipoCalculo.setEnabled(isHabilitar && this.tipocalculoConstantesFunciones.activarcodigoTipoCalculo);
		this.jInternalFrameDetalleFormTipoCalculo.jTextAreanombreTipoCalculo.setEnabled(isHabilitar && this.tipocalculoConstantesFunciones.activarnombreTipoCalculo);	
		
	};
	
	public void setDefaultControlesTipoCalculo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoCalculo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocalculoSessionBean.setConGuardarRelaciones(true);			
			this.tipocalculoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoCalculo.jTabbedPaneRelacionesTipoCalculo.setVisible(true);
			
					
		} else {
			//this.tipocalculoSessionBean.setConGuardarRelaciones(false);			
			this.tipocalculoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoCalculo.jTabbedPaneRelacionesTipoCalculo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoCalculo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCalculo tipocalculoAux:this.tipocalculoLogic.getTipoCalculos()) {
				if(tipocalculoAux.getId().equals(this.iIdNuevoTipoCalculo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCalculo tipocalculoAux:this.tipocalculos) {
				if(tipocalculoAux.getId().equals(this.iIdNuevoTipoCalculo)) {
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
	
	public int getIndiceActualTipoCalculo(TipoCalculo tipocalculo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCalculo tipocalculoAux:this.tipocalculoLogic.getTipoCalculos()) {
				if(tipocalculoAux.getId().equals(tipocalculo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCalculo tipocalculoAux:this.tipocalculos) {
				if(tipocalculoAux.getId().equals(tipocalculo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoCalculo(TipoCalculo tipocalculoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCalculo tipocalculoAux:this.tipocalculoLogic.getTipoCalculos()) {
				if(tipocalculoAux.getTipoCalculoOriginal().getId().equals(tipocalculoOriginal.getId())) {
					existe=true;
					tipocalculoOriginal.setId(tipocalculoAux.getId());
					tipocalculoOriginal.setVersionRow(tipocalculoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCalculo tipocalculoAux:this.tipocalculos) {
				if(tipocalculoAux.getTipoCalculoOriginal().getId().equals(tipocalculoOriginal.getId())) {
					existe=true;
					tipocalculoOriginal.setId(tipocalculoAux.getId());
					tipocalculoOriginal.setVersionRow(tipocalculoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoCalculo(Boolean esParaCancelar) throws Exception {
		tipocalculosAux=new ArrayList<TipoCalculo>();
		tipocalculoAux=new TipoCalculo();
		
		if(!this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCalculo tipocalculoAux:this.tipocalculoLogic.getTipoCalculos()) {
					if(tipocalculoAux.getId()<0) {
						tipocalculosAux.add(tipocalculoAux);
					}		
				}
				this.iIdNuevoTipoCalculo=0L;
				this.tipocalculoLogic.getTipoCalculos().removeAll(tipocalculosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCalculo tipocalculoAux:this.tipocalculos) {
					if(tipocalculoAux.getId()<0) {
						tipocalculosAux.add(tipocalculoAux);
					}		
				}
				this.iIdNuevoTipoCalculo=0L;
				this.tipocalculos.removeAll(tipocalculosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoCalculo 
					&& this.tipocalculoLogic.getTipoCalculos().size()>0
					) {
					tipocalculoAux=this.tipocalculoLogic.getTipoCalculos().get(this.tipocalculoLogic.getTipoCalculos().size() - 1);
				
					if(tipocalculoAux.getId()<0) {
						this.tipocalculoLogic.getTipoCalculos().remove(tipocalculoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoCalculo && this.tipocalculos.size()>0) {
					tipocalculoAux=this.tipocalculos.get(this.tipocalculos.size() - 1);
				
					if(tipocalculoAux.getId()<0) {
						this.tipocalculos.remove(tipocalculoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoCalculo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocalculo.getId()<0) {
				this.tipocalculoLogic.getTipoCalculos().remove(this.tipocalculo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocalculo.getId()<0) {
				this.tipocalculos.remove(this.tipocalculo);
			}
		}			
	}
	
	public void setEstadosInicialesTipoCalculo(List<TipoCalculo> tipocalculosAux) throws Exception {
		TipoCalculoConstantesFunciones.setEstadosInicialesTipoCalculo(tipocalculosAux);
	}
	
	public void setEstadosInicialesTipoCalculo(TipoCalculo tipocalculoAux) throws Exception {
		TipoCalculoConstantesFunciones.setEstadosInicialesTipoCalculo(tipocalculoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoCalculoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoCalculo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoCalculoActual()) {
				if(!this.isEsNuevoTipoCalculo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoCalculo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoCalculo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoCalculoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Calculo ?", "MANTENIMIENTO DE Tipo Calculo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoCalculo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoCalculo tipocalculo) throws Exception {
		TipoCalculoConstantesFunciones.seleccionarAsignar(this.tipocalculo,tipocalculo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoCalculo=this.isPermisoActualizarOriginalTipoCalculo;
			
			
			this.seleccionarAsignar(tipocalculo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCalculoConstantesFunciones.quitarEspaciosTipoCalculo(this.tipocalculo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoCalculo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocalculoSessionBean.setsFuncionBusquedaRapida(this.tipocalculoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoCalculo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoCalculo(esParaCancelar);				
				this.cancelarNuevoTipoCalculo(esParaCancelar);								
			}
			
			this.tipocalculo=new TipoCalculo();
			
			this.inicializarTipoCalculo();
			
			this.actualizarEstadoCeldasBotonesTipoCalculo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoCalculo() throws Exception {
		try {
			TipoCalculoConstantesFunciones.inicializarTipoCalculo(this.tipocalculo);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocalculoLogic.getTipoCalculos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoCalculos(String sAccionBusqueda,List<TipoCalculo> tipocalculosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoCalculo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoCalculoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoCalculoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoCalculo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Calculos");		
		parameters.put("busquedapor", TipoCalculoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoCalculo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoCalculoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoCalculoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoCalculo=new JRBeanArrayDataSource(TipoCalculoJInternalFrame.TraerTipoCalculoBeans(tipocalculosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoCalculo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoCalculoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoCalculoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoCalculoBean.TraerTipoCalculoBeans(tipocalculosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoCalculos(sAccionBusqueda,sTipoArchivoReporte,tipocalculosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoCalculos(sAccionBusqueda,sTipoArchivoReporte,tipocalculosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoCalculoActionPerformed(null);
					//this.generarExcelReporteTipoCalculos(sAccionBusqueda,sTipoArchivoReporte,tipocalculosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoCalculos(sAccionBusqueda,sTipoArchivoReporte,tipocalculosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoCalculos(sAccionBusqueda,sTipoArchivoReporte,tipocalculosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoCalculos(sAccionBusqueda,sTipoArchivoReporte,tipocalculosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoCalculos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCalculo> tipocalculosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocalculo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCalculos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCalculo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoCalculo tipocalculo : tipocalculosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoCalculoConstantesFunciones.generarExcelReporteDataTipoCalculo("NORMAL",row,workbook,tipocalculo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Calculo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoCalculo(String sTipo,Row row,Workbook workbook) {
		
		TipoCalculoConstantesFunciones.generarExcelReporteHeaderTipoCalculo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoCalculos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCalculo> tipocalculosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocalculo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCalculos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoCalculo tipocalculo : tipocalculosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoCalculoConstantesFunciones.getTipoCalculoDescripcion(tipocalculo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCalculoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCalculoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocalculo.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCalculoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCalculoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocalculo.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Calculo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoCalculos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCalculo> tipocalculosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoCalculo> tipocalculosRespaldo=null;
		
		classes=TipoCalculoConstantesFunciones.getClassesRelationshipsOfTipoCalculo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocalculoLogic.setDatosCliente(this.datosCliente);
		this.tipocalculoLogic.setDatosDeep(this.datosDeep);
		this.tipocalculoLogic.setIsConDeep(true);
		
		tipocalculosRespaldo=this.tipocalculoLogic.getTipoCalculos();
		
		this.tipocalculoLogic.setTipoCalculos(tipocalculosParaReportes);	
		this.tipocalculoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocalculosParaReportes=this.tipocalculoLogic.getTipoCalculos();
		this.tipocalculoLogic.setTipoCalculos(tipocalculosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocalculo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCalculos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCalculo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoCalculo tipocalculo : tipocalculosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoCalculo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoCalculoConstantesFunciones.generarExcelReporteDataTipoCalculo("NORMAL",row,workbook,tipocalculo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoCalculoConstantesFunciones.getTipoCalculoDescripcion(tipocalculo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Calculo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCalculo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCalculo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCalculo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCalculo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoCalculo() throws Exception {		
		this.startProcessTipoCalculo(true);
	}
	
	public void startProcessTipoCalculo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoCalculo, this.jScrollPanelDatosTipoCalculo,this.jPanelPaginacionTipoCalculo, this.jScrollPanelDatosEdicionTipoCalculo, this.jPanelAccionesTipoCalculo,this.jPanelAccionesFormularioTipoCalculo,this.jmenuBarTipoCalculo,this.jmenuBarDetalleTipoCalculo,this.jTtoolBarTipoCalculo,this.jTtoolBarDetalleTipoCalculo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCalculo=null; 
		
		final JPanel jPanelParametrosReportesTipoCalculo=this.jPanelParametrosReportesTipoCalculo;
		//final JScrollPane jScrollPanelDatosTipoCalculo=this.jScrollPanelDatosTipoCalculo;
		final JTable jTableDatosTipoCalculo=this.jTableDatosTipoCalculo;		
		final JPanel jPanelPaginacionTipoCalculo=this.jPanelPaginacionTipoCalculo;
		//final JScrollPane jScrollPanelDatosEdicionTipoCalculo=this.jScrollPanelDatosEdicionTipoCalculo;
		final JPanel jPanelAccionesTipoCalculo=this.jPanelAccionesTipoCalculo;
		
		JPanel jPanelCamposAuxiliarTipoCalculo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoCalculo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) {
			jPanelCamposAuxiliarTipoCalculo=this.jInternalFrameDetalleFormTipoCalculo.jPanelCamposTipoCalculo;
			jPanelAccionesFormularioAuxiliarTipoCalculo=this.jInternalFrameDetalleFormTipoCalculo.jPanelAccionesFormularioTipoCalculo;
		}
		
		final JPanel jPanelCamposTipoCalculo=jPanelCamposAuxiliarTipoCalculo;
		final JPanel jPanelAccionesFormularioTipoCalculo=jPanelAccionesFormularioAuxiliarTipoCalculo;
		
		
		final JMenuBar jmenuBarTipoCalculo=this.jmenuBarTipoCalculo;
		final JToolBar jTtoolBarTipoCalculo=this.jTtoolBarTipoCalculo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoCalculo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCalculo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) {
			jmenuBarDetalleAuxiliarTipoCalculo=this.jInternalFrameDetalleFormTipoCalculo.jmenuBarDetalleTipoCalculo;
			jTtoolBarDetalleAuxiliarTipoCalculo=this.jInternalFrameDetalleFormTipoCalculo.jTtoolBarDetalleTipoCalculo;
		}
		
		final JMenuBar jmenuBarDetalleTipoCalculo=jmenuBarDetalleAuxiliarTipoCalculo;
		final JToolBar jTtoolBarDetalleTipoCalculo=jTtoolBarDetalleAuxiliarTipoCalculo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCalculo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCalculo;
			processRunnable.jTableDatos=jTableDatosTipoCalculo;
			processRunnable.jPanelCampos=jPanelCamposTipoCalculo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCalculo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCalculo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCalculo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCalculo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCalculo;
			processRunnable.jTtoolBar=jTtoolBarTipoCalculo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCalculo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCalculo ,jPanelParametrosReportesTipoCalculo,jTableDatosTipoCalculo, /*jScrollPanelDatosTipoCalculo,*/jPanelCamposTipoCalculo,jPanelPaginacionTipoCalculo, /*jScrollPanelDatosEdicionTipoCalculo,*/ jPanelAccionesTipoCalculo,jPanelAccionesFormularioTipoCalculo,jmenuBarTipoCalculo,jmenuBarDetalleTipoCalculo,jTtoolBarTipoCalculo,jTtoolBarDetalleTipoCalculo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoCalculo, jScrollPanelDatosTipoCalculo,jPanelPaginacionTipoCalculo, jScrollPanelDatosEdicionTipoCalculo, jPanelAccionesTipoCalculo,jPanelAccionesFormularioTipoCalculo,jmenuBarTipoCalculo,jmenuBarDetalleTipoCalculo,jTtoolBarTipoCalculo,jTtoolBarDetalleTipoCalculo);
						
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
	
	public void finishProcessTipoCalculo() {// throws Exception 
		this.finishProcessTipoCalculo(true);
	}
	
	public void finishProcessTipoCalculo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoCalculo, this.jScrollPanelDatosTipoCalculo,this.jPanelPaginacionTipoCalculo, this.jScrollPanelDatosEdicionTipoCalculo, this.jPanelAccionesTipoCalculo,this.jPanelAccionesFormularioTipoCalculo,this.jmenuBarTipoCalculo,this.jmenuBarDetalleTipoCalculo,this.jTtoolBarTipoCalculo,this.jTtoolBarDetalleTipoCalculo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCalculo=null; 
		
		final JPanel jPanelParametrosReportesTipoCalculo=this.jPanelParametrosReportesTipoCalculo;
		//final JScrollPane jScrollPanelDatosTipoCalculo=this.jScrollPanelDatosTipoCalculo;
		final JTable jTableDatosTipoCalculo=this.jTableDatosTipoCalculo;		
		final JPanel jPanelPaginacionTipoCalculo=this.jPanelPaginacionTipoCalculo;
		//final JScrollPane jScrollPanelDatosEdicionTipoCalculo=this.jScrollPanelDatosEdicionTipoCalculo;
		final JPanel jPanelAccionesTipoCalculo=this.jPanelAccionesTipoCalculo;
		
		JPanel jPanelCamposAuxiliarTipoCalculo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoCalculo=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) {
			jPanelCamposAuxiliarTipoCalculo=this.jInternalFrameDetalleFormTipoCalculo.jPanelCamposTipoCalculo;
			jPanelAccionesFormularioAuxiliarTipoCalculo=this.jInternalFrameDetalleFormTipoCalculo.jPanelAccionesFormularioTipoCalculo;
		}
		
		final JPanel jPanelCamposTipoCalculo=jPanelCamposAuxiliarTipoCalculo;
		final JPanel jPanelAccionesFormularioTipoCalculo=jPanelAccionesFormularioAuxiliarTipoCalculo;
		
		
		final JMenuBar jmenuBarTipoCalculo=this.jmenuBarTipoCalculo;		
		final JToolBar jTtoolBarTipoCalculo=this.jTtoolBarTipoCalculo;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoCalculo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCalculo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) {
			jmenuBarDetalleAuxiliarTipoCalculo=this.jInternalFrameDetalleFormTipoCalculo.jmenuBarDetalleTipoCalculo;
			jTtoolBarDetalleAuxiliarTipoCalculo=this.jInternalFrameDetalleFormTipoCalculo.jTtoolBarDetalleTipoCalculo;		
		}
		
		final JMenuBar jmenuBarDetalleTipoCalculo=jmenuBarDetalleAuxiliarTipoCalculo;
		final JToolBar jTtoolBarDetalleTipoCalculo=jTtoolBarDetalleAuxiliarTipoCalculo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCalculo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCalculo;
			processRunnable.jTableDatos=jTableDatosTipoCalculo;
			processRunnable.jPanelCampos=jPanelCamposTipoCalculo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCalculo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCalculo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCalculo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCalculo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCalculo;
			processRunnable.jTtoolBar=jTtoolBarTipoCalculo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCalculo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoCalculo ,jPanelParametrosReportesTipoCalculo, jTableDatosTipoCalculo,/*jScrollPanelDatosTipoCalculo,*/jPanelCamposTipoCalculo,jPanelPaginacionTipoCalculo, /*jScrollPanelDatosEdicionTipoCalculo,*/ jPanelAccionesTipoCalculo,jPanelAccionesFormularioTipoCalculo,jmenuBarTipoCalculo,jmenuBarDetalleTipoCalculo,jTtoolBarTipoCalculo,jTtoolBarDetalleTipoCalculo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoCalculo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoCalculo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoCalculo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoCalculo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoCalculo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoCalculo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoCalculo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoCalculo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoCalculo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocalculoConstantesFunciones.getsFinalQueryTipoCalculo();
		String  finalQueryPaginacionTodos=this.tipocalculoConstantesFunciones.getsFinalQueryTipoCalculo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoCalculoConstantesFunciones.getArrayColumnasGlobalesNoTipoCalculo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoCalculoConstantesFunciones.getArrayColumnasGlobalesTipoCalculo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoCalculoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocalculosEliminados= new ArrayList<TipoCalculo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoCalculo();
		
				///*TipoCalculoSessionBean*/this.tipocalculoSessionBean=new TipoCalculoSessionBean();
			
			if(this.tipocalculoSessionBean==null) {
				this.tipocalculoSessionBean=new TipoCalculoSessionBean();
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
					this.iNumeroPaginacion=TipoCalculoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoCalculoConstantesFunciones.getClassesForeignKeysOfTipoCalculo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocalculo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocalculosAux= new ArrayList<TipoCalculo>();
			
				
			tipocalculoLogic.setDatosCliente(this.datosCliente);
			tipocalculoLogic.setDatosDeep(this.datosDeep);
			tipocalculoLogic.setIsConDeep(true);
			
			
			tipocalculoLogic.getTipoCalculoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocalculoLogic.getTodosTipoCalculos(finalQueryGlobal,pagination);
					
					//tipocalculoLogic.getTodosTipoCalculosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocalculoLogic.getTipoCalculos()==null|| tipocalculoLogic.getTipoCalculos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocalculosAux= new ArrayList<TipoCalculo>();
							tipocalculosAux.addAll(tipocalculoLogic.getTipoCalculos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocalculosAux= new ArrayList<TipoCalculo>();
							tipocalculosAux.addAll(tipocalculos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocalculoLogic.getTodosTipoCalculos(finalQueryGlobal+"",this.pagination);												
							
							//tipocalculoLogic.getTodosTipoCalculosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoCalculos("Todos",tipocalculoLogic.getTipoCalculos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocalculoLogic.setTipoCalculos(new ArrayList<TipoCalculo>());					
							tipocalculoLogic.getTipoCalculos().addAll(tipocalculosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocalculos=new ArrayList<TipoCalculo>();
							tipocalculos.addAll(tipocalculosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoCalculo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoCalculo=this.idActual;
				
				} else if(this.idTipoCalculoActual!=null && this.idTipoCalculoActual!=0L) {
					idTipoCalculo=idTipoCalculoActual;
				}
				
					
				this.sDetalleReporte=TipoCalculoConstantesFunciones.getDetalleIndicePorId(idTipoCalculo);
				
				this.tipocalculos=new ArrayList<TipoCalculo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocalculoLogic.getEntity(idTipoCalculo);
					
					//tipocalculoLogic.getEntityWithConnection(idTipoCalculo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocalculoLogic.setTipoCalculos(new ArrayList<TipoCalculo>());
					tipocalculoLogic.getTipoCalculos().add(tipocalculoLogic.getTipoCalculo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocalculos=new ArrayList<TipoCalculo>();
					this.tipocalculos.add(tipocalculo);
				}
				
				if(tipocalculoLogic.getTipoCalculo()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoCalculo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoCalculo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocalculoLogic.getTipoCalculos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocalculos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocalculoLogic.getTipoCalculos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocalculos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoCalculo tipocalculo) {
		Boolean permite=true;
		
		if(this.tipocalculo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoCalculoConstantesFunciones.getOrderByListaTipoCalculo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoCalculoConstantesFunciones.getOrderByListaTipoCalculo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCalculo tipocalculo:tipocalculoLogic.getTipoCalculos()) {
				if(tipocalculo.getsType().equals(Constantes2.S_TOTALES)) {
					tipocalculoTotales=tipocalculo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCalculo tipocalculo:this.tipocalculos) {
				if(tipocalculo.getsType().equals(Constantes2.S_TOTALES)) {
					tipocalculoTotales=tipocalculo;
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
			this.tipocalculoAux=new TipoCalculo();
			this.tipocalculoAux.setsType(Constantes2.S_TOTALES);
			this.tipocalculoAux.setIsNew(false);
			this.tipocalculoAux.setIsChanged(false);
			this.tipocalculoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoCalculoConstantesFunciones.TotalizarValoresFilaTipoCalculo(this.tipocalculoLogic.getTipoCalculos(),this.tipocalculoAux);
				
				this.tipocalculoLogic.getTipoCalculos().add(this.tipocalculoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoCalculoConstantesFunciones.TotalizarValoresFilaTipoCalculo(this.tipocalculos,this.tipocalculoAux);
				
				this.tipocalculos.add(this.tipocalculoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocalculoTotales=new TipoCalculo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocalculoLogic.getTipoCalculos().remove(tipocalculoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocalculos.remove(tipocalculoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocalculoTotales=new TipoCalculo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCalculo tipocalculo:tipocalculoLogic.getTipoCalculos()) {
				if(tipocalculo.getsType().equals(Constantes2.S_TOTALES)) {
					tipocalculoTotales=tipocalculo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCalculoConstantesFunciones.TotalizarValoresFilaTipoCalculo(this.tipocalculoLogic.getTipoCalculos(),tipocalculoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCalculo tipocalculo:this.tipocalculos) {
				if(tipocalculo.getsType().equals(Constantes2.S_TOTALES)) {
					tipocalculoTotales=tipocalculo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCalculoConstantesFunciones.TotalizarValoresFilaTipoCalculo(this.tipocalculos,tipocalculoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoCalculo() {
		this.isPermisoTodoTipoCalculo=false;
		this.isPermisoNuevoTipoCalculo=false;
		this.isPermisoActualizarTipoCalculo=false;
		this.isPermisoActualizarOriginalTipoCalculo=false;
		this.isPermisoEliminarTipoCalculo=false;
		this.isPermisoGuardarCambiosTipoCalculo=false;
		this.isPermisoConsultaTipoCalculo=false;
		this.isPermisoBusquedaTipoCalculo=false;
		this.isPermisoReporteTipoCalculo=false;		
		this.isPermisoOrdenTipoCalculo=false;		
		this.isPermisoPaginacionMedioTipoCalculo=false;		
		this.isPermisoPaginacionAltoTipoCalculo=false;
		this.isPermisoPaginacionTodoTipoCalculo=false;
		this.isPermisoCopiarTipoCalculo=false;		
		this.isPermisoVerFormTipoCalculo=false;		
		this.isPermisoDuplicarTipoCalculo=false;		
		this.isPermisoOrdenTipoCalculo=false;		
	}
	
	public void setPermisosUsuarioTipoCalculo(Boolean isPermiso) {
		this.isPermisoTodoTipoCalculo=isPermiso;
		this.isPermisoNuevoTipoCalculo=isPermiso;
		this.isPermisoActualizarTipoCalculo=isPermiso;
		this.isPermisoActualizarOriginalTipoCalculo=isPermiso;
		this.isPermisoEliminarTipoCalculo=isPermiso;
		this.isPermisoGuardarCambiosTipoCalculo=isPermiso;
		this.isPermisoConsultaTipoCalculo=isPermiso;
		this.isPermisoBusquedaTipoCalculo=isPermiso;
		this.isPermisoReporteTipoCalculo=isPermiso;
		this.isPermisoOrdenTipoCalculo=isPermiso;		
		this.isPermisoPaginacionMedioTipoCalculo=isPermiso;		
		this.isPermisoPaginacionAltoTipoCalculo=isPermiso;		
		this.isPermisoPaginacionTodoTipoCalculo=isPermiso;		
		this.isPermisoCopiarTipoCalculo=isPermiso;		
		this.isPermisoVerFormTipoCalculo=isPermiso;		
		this.isPermisoDuplicarTipoCalculo=isPermiso;
		this.isPermisoOrdenTipoCalculo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoCalculo(Boolean isPermiso) {
		//this.isPermisoTodoTipoCalculo=isPermiso;
		this.isPermisoNuevoTipoCalculo=isPermiso;
		this.isPermisoActualizarTipoCalculo=isPermiso;
		this.isPermisoActualizarOriginalTipoCalculo=isPermiso;
		this.isPermisoEliminarTipoCalculo=isPermiso;
		this.isPermisoGuardarCambiosTipoCalculo=isPermiso;
		//this.isPermisoConsultaTipoCalculo=isPermiso;
		//this.isPermisoBusquedaTipoCalculo=isPermiso;
		//this.isPermisoReporteTipoCalculo=isPermiso;
		//this.isPermisoOrdenTipoCalculo=isPermiso;		
		//this.isPermisoPaginacionMedioTipoCalculo=isPermiso;		
		//this.isPermisoPaginacionAltoTipoCalculo=isPermiso;		
		//this.isPermisoPaginacionTodoTipoCalculo=isPermiso;		
		//this.isPermisoCopiarTipoCalculo=isPermiso;		
		//this.isPermisoDuplicarTipoCalculo=isPermiso;
		//this.isPermisoOrdenTipoCalculo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoCalculoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoCalculoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoCalculo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoCalculoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoCalculoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoCalculoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoCalculoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoCalculo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoCalculoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoCalculoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoCalculo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoCalculo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoCalculo=this.isPermisoActualizarTipoCalculo;
			this.isPermisoEliminarTipoCalculo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoCalculo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoCalculo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoCalculo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoCalculo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoCalculo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCalculo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoCalculo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoCalculo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoCalculo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoCalculo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoCalculo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoCalculo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCalculo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoCalculo.setToolTipText(this.jTableDatosTipoCalculo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoCalculo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoCalculo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoCalculoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoCalculoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoCalculo() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoCalculoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoCalculoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoCalculoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoCalculoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoCalculoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoCalculo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoCalculo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoCalculo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoCalculo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCalculo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoCalculo(TipoCalculo tipocalculo)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoCalculo(TipoCalculo tipocalculo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoCalculo()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCalculo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoCalculo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoCalculo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoCalculo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoCalculo()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoCalculo(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoCalculo()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoCalculoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoCalculoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoCalculoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocalculoSessionBean=new TipoCalculoSessionBean(); 
		this.tipocalculoConstantesFunciones=new TipoCalculoConstantesFunciones(); 
		this.tipocalculoBean=new TipoCalculo();//(this.tipocalculoConstantesFunciones); 		
		this.tipocalculoReturnGeneral=new TipoCalculoParameterReturnGeneral(); 
		
		this.tipocalculoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocalculoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoCalculoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoCalculoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoCalculoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoCalculo(true);
			
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
			
			this.tipocalculoConstantesFunciones=new TipoCalculoConstantesFunciones(); 
			this.tipocalculoBean=new TipoCalculo();//this.tipocalculoConstantesFunciones); 			
			this.tipocalculoReturnGeneral=new TipoCalculoParameterReturnGeneral(); 
		
			TipoCalculoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Calculo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipocalculo=new TipoCalculo();
			this.tipocalculos = new ArrayList<TipoCalculo>();
			this.tipocalculosAux = new ArrayList<TipoCalculo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic=new TipoCalculoLogic();
				this.tipocalculoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocalculoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocalculoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoCalculo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoCalculo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCalculo);	
					}
					
					if(this.jInternalFrameImportacionTipoCalculo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCalculo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoCalculo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoCalculo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoCalculo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCalculo);
				this.jInternalFrameDetalleFormTipoCalculo.setVisible(false);
				this.jInternalFrameDetalleFormTipoCalculo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoCalculo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCalculo);
					this.jInternalFrameReporteDinamicoTipoCalculo.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoCalculo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoCalculo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoCalculo);
					this.jInternalFrameImportacionTipoCalculo.setVisible(false);
					this.jInternalFrameImportacionTipoCalculo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoCalculo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoCalculo);
					this.jInternalFrameOrderByTipoCalculo.setVisible(false);
					this.jInternalFrameOrderByTipoCalculo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoCalculoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoCalculoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocalculoReturnGeneral=new TipoCalculoParameterReturnGeneral();
			
			this.tipocalculoParameterGeneral=new TipoCalculoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocalculoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoCalculoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCalculoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocalculoSessionBean.getEsGuardarRelacionado(),this.tipocalculoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCalculoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocalculoSessionBean.getEsGuardarRelacionado(),this.tipocalculoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoCalculo=false;
			this.isVisibilidadCeldaDuplicarTipoCalculo=true;
			this.isVisibilidadCeldaCopiarTipoCalculo=true;
			this.isVisibilidadCeldaVerFormTipoCalculo=true;
			this.isVisibilidadCeldaOrdenTipoCalculo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculo=false;
			this.isVisibilidadCeldaModificarTipoCalculo=false;
			this.isVisibilidadCeldaActualizarTipoCalculo=false;
			this.isVisibilidadCeldaEliminarTipoCalculo=false;
			this.isVisibilidadCeldaCancelarTipoCalculo=false;
			this.isVisibilidadCeldaGuardarTipoCalculo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCalculo=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoCalculo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoCalculo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoCalculo(false);
			
			this.setPermisosUsuarioTipoCalculo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocalculoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocalculoSessionBean.getEsGuardarRelacionado() && this.tipocalculoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoCalculoClasesRelacionadas();
			}
			
			if(this.tipocalculoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoCalculoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoCalculoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoCalculo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoCalculo();
			}
			
			if(!this.isPermisoBusquedaTipoCalculo) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocalculoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoCalculo,this.isPermisoPaginacionMedioTipoCalculo,this.isPermisoPaginacionTodoTipoCalculo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoCalculoConstantesFunciones.getTiposSeleccionarTipoCalculo());
				
				this.tiposColumnasSelect=TipoCalculoConstantesFunciones.getTiposSeleccionarTipoCalculo(true);
				
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
			//if(!this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoCalculo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoCalculo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoCalculo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCalculo() ;
			
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
				tipocalculoImplementable= (TipoCalculoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCalculoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocalculoImplementableHome= (TipoCalculoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCalculoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocalculos= new ArrayList<TipoCalculo>();
			this.tipocalculosEliminados= new ArrayList<TipoCalculo>();
						
			this.isEsNuevoTipoCalculo=false;
			this.esParaAccionDesdeFormularioTipoCalculo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoCalculo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoCalculo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoCalculoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoCalculo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoCalculo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoCalculo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoCalculo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoCalculo();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoCalculo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoCalculo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoCalculo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoCalculo")) {
				iIndex=this.jInternalFrameDetalleFormTipoCalculo.jTabbedPaneRelacionesTipoCalculo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoCalculo.jTabbedPaneRelacionesTipoCalculo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoCalculo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoCalculo();	
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
	
	public void cargarCombosForeignKeyTipoCalculo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoCalculo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoCalculo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoCalculoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoCalculo();
		
		this.cargarCombosFrameForeignKeyTipoCalculo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoCalculo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoCalculo();
		}
	}
	
	
	
	public void jButtonNuevoTipoCalculoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocalculoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoCalculo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
			
			
			if(jTableDatosTipoCalculo.getRowCount()>=1) {
				jTableDatosTipoCalculo.removeRowSelectionInterval(0, jTableDatosTipoCalculo.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoCalculo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoCalculo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoCalculo(true);			
			//this.tipocalculo=new TipoCalculo();
			//this.tipocalculo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCalculo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCalculo() ;
			
			if(TipoCalculoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCalculo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocalculo);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocalculo);				
			
			TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
			
			if(this.tipocalculoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoCalculo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoCalculoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoCalculo> tipocalculosSeleccionados=new ArrayList<TipoCalculo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoCalculo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoCalculo.getSelectedRows().length;			
			}
			
			tipocalculosSeleccionados=this.getTipoCalculosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoCalculo--;			
				//TipoCalculo tipocalculoAux= new TipoCalculo();			
				//tipocalculoAux.setId(this.iIdNuevoTipoCalculo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoCalculo tipocalculoOrigen=new TipoCalculo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoCalculo tipocalculoOrigen : tipocalculosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoCalculo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocalculoOrigen =(TipoCalculo) this.tipocalculoLogic.getTipoCalculos().toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocalculoOrigen =(TipoCalculo) this.tipocalculos.toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoCalculo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocalculo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoCalculo(tipocalculoOrigen,this.tipocalculo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculo(this.tipocalculo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocalculoLogic.getTipoCalculos().add(this.tipocalculoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocalculos.add(this.tipocalculoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoCalculo(false);
				
				this.jTableDatosTipoCalculo.setRowSelectionInterval(this.getIndiceNuevoTipoCalculo(), this.getIndiceNuevoTipoCalculo());
				
				int iLastRow =  this.jTableDatosTipoCalculo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCalculo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCalculo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCalculo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoCalculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoCalculo> tipocalculosSeleccionados=new ArrayList<TipoCalculo>();									
		
			TipoCalculo tipocalculoOrigen=new TipoCalculo();
			TipoCalculo tipocalculoDestino=new TipoCalculo();
				
			tipocalculosSeleccionados=this.getTipoCalculosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoCalculo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocalculosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoCalculo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocalculoOrigen =(TipoCalculo) this.tipocalculoLogic.getTipoCalculos().toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocalculoOrigen =(TipoCalculo) this.tipocalculos.toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocalculoDestino =(TipoCalculo) this.tipocalculoLogic.getTipoCalculos().toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocalculoDestino =(TipoCalculo) this.tipocalculos.toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocalculoOrigen =tipocalculosSeleccionados.get(0);
				tipocalculoDestino =tipocalculosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoCalculo(tipocalculoOrigen,tipocalculoDestino,true,false);
				
				tipocalculoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocalculoDestino,tipocalculoLogic.getTipoCalculos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocalculoDestino,tipocalculos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoCalculo(false);
				
				//this.jTableDatosTipoCalculo.setRowSelectionInterval(this.getIndiceNuevoTipoCalculo(), this.getIndiceNuevoTipoCalculo());
				
				int iLastRow =  this.jTableDatosTipoCalculo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCalculo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCalculo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCalculo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoCalculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCalculo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoCalculo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoCalculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoCalculo.isVisible();
			
			
			this.jPanelParametrosReportesTipoCalculo.setVisible(!isVisible);
			this.jPanelPaginacionTipoCalculo.setVisible(!isVisible);
			this.jPanelAccionesTipoCalculo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoCalculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoCalculo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoCalculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoCalculo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoCalculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoCalculo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoCalculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoCalculo();
			
			this.abrirFrameOrderByTipoCalculo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoCalculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoCalculo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoCalculo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCalculo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoCalculo.isMaximum()) {
					this.jInternalFrameDetalleFormTipoCalculo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoCalculo.setSize(this.jInternalFrameDetalleFormTipoCalculo.iWidthFormulario,this.jInternalFrameDetalleFormTipoCalculo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoCalculo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoCalculo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoCalculo.isMaximum()) {
						this.jInternalFrameDetalleFormTipoCalculo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoCalculo.jContentPaneDetalleTipoCalculo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoCalculo.jTabbedPaneRelacionesTipoCalculo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoCalculo.jContentPaneDetalleTipoCalculo.getWidth(),TipoCalculoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCalculo.jTabbedPaneRelacionesTipoCalculo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoCalculo.jContentPaneDetalleTipoCalculo.getWidth(),TipoCalculoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCalculo.jTabbedPaneRelacionesTipoCalculo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoCalculo.jContentPaneDetalleTipoCalculo.getWidth(),TipoCalculoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoCalculo.setVisible(true);
	        this.jInternalFrameDetalleFormTipoCalculo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoCalculo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoCalculo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoCalculo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCalculo,false,this);
				} else {
					this.jInternalFrameOrderByTipoCalculo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCalculo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoCalculo);
				this.jInternalFrameOrderByTipoCalculo.setVisible(false);
				this.jInternalFrameOrderByTipoCalculo.setSelected(false);
				
				this.jInternalFrameOrderByTipoCalculo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCalculo"));
				
				this.inicializarActualizarBindingTablaOrderByTipoCalculo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoCalculo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoCalculo==null) {
				
				this.jInternalFrameImportacionTipoCalculo=new ImportacionJInternalFrame(TipoCalculoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCalculo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoCalculo);
				this.jInternalFrameImportacionTipoCalculo.setVisible(false);
				this.jInternalFrameImportacionTipoCalculo.setSelected(false);


				this.jInternalFrameImportacionTipoCalculo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCalculo"));
				this.jInternalFrameImportacionTipoCalculo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCalculo"));
				this.jInternalFrameImportacionTipoCalculo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCalculo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoCalculo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoCalculo==null) {
				this.jInternalFrameReporteDinamicoTipoCalculo=new ReporteDinamicoJInternalFrame(TipoCalculoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCalculo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCalculo);
				this.jInternalFrameReporteDinamicoTipoCalculo.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoCalculo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoCalculo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCalculo"));
				this.jInternalFrameReporteDinamicoTipoCalculo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCalculo"));
				this.jInternalFrameReporteDinamicoTipoCalculo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCalculo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCalculo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoCalculo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCalculo);
			
	       	this.jInternalFrameDetalleFormTipoCalculo.setVisible(false);
	        this.jInternalFrameDetalleFormTipoCalculo.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoCalculo.dispose();
			//this.jInternalFrameDetalleFormTipoCalculo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoCalculo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoCalculo.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoCalculo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoCalculo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoCalculo.setVisible(true);
	        this.jInternalFrameImportacionTipoCalculo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoCalculo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoCalculo.setVisible(true);
	        this.jInternalFrameOrderByTipoCalculo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoCalculo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoCalculo.setVisible(false);
	        this.jInternalFrameOrderByTipoCalculo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoCalculo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoCalculo.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoCalculo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoCalculo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoCalculo.setVisible(false);
	        this.jInternalFrameImportacionTipoCalculo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoCalculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoCalculo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoCalculo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCalculo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoCalculo(true);
			//this.isEsNuevoTipoCalculo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculo =(TipoCalculo) this.tipocalculoLogic.getTipoCalculos().toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocalculo =(TipoCalculo) this.tipocalculos.toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoCalculo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCalculo(false) ;
			
			if(tipocalculoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoCalculoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCalculo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCalculo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoCalculoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoCalculo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculo =(TipoCalculo) this.tipocalculoLogic.getTipoCalculos().toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocalculo =(TipoCalculo) this.tipocalculos.toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoCalculo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCalculo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCalculo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoCalculo(true);
			//this.isEsNuevoTipoCalculo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculo =(TipoCalculo) this.tipocalculoLogic.getTipoCalculos().toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocalculo =(TipoCalculo) this.tipocalculos.toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocalculo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoCalculo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoCalculo(false) ;
			
			if(TipoCalculoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCalculo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCalculo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoCalculoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoCalculo(false);
			
			//if(!this.isEsNuevoTipoCalculo) {								
				int intSelectedRow = this.jTableDatosTipoCalculo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculo =(TipoCalculo) this.tipocalculoLogic.getTipoCalculos().toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocalculo =(TipoCalculo) this.tipocalculos.toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoCalculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoCalculo(this.tipocalculo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculo(this.tipocalculo);
				
			}
			
			if(this.permiteMantenimiento(this.tipocalculo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoCalculo=true;
					this.inicializarActualizarBindingTablaTipoCalculo(false);
					this.isEsNuevoTipoCalculo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoCalculo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoCalculo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCalculo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCalculo(false);
				
				this.habilitarDeshabilitarControlesTipoCalculo(false);
			
												
				
				if(TipoCalculoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoCalculo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoCalculoActionPerformed(evt,tipocalculoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoCalculo(this.tipocalculo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoCalculo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocalculoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocalculo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoCalculo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalculo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoCalculoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoCalculo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculo =(TipoCalculo) this.tipocalculoLogic.getTipoCalculos().toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
				this.tipocalculo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocalculo =(TipoCalculo) this.tipocalculos.toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
				this.tipocalculo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocalculo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoCalculoModel) this.jTableDatosTipoCalculo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoCalculo=true;
				this.inicializarActualizarBindingTablaTipoCalculo(false);
				this.isEsNuevoTipoCalculo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCalculo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCalculo(false);
				
				this.habilitarDeshabilitarControlesTipoCalculo(false);
				
				
				
				if(TipoCalculoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoCalculo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoCalculoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoCalculo.getRowCount()>=1) {
				jTableDatosTipoCalculo.removeRowSelectionInterval(0, jTableDatosTipoCalculo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoCalculo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoCalculo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCalculo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCalculo(false) ;
			
			this.isEsNuevoTipoCalculo=false;
			
			if(TipoCalculoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoCalculo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoCalculoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoCalculo(false);
				
				//SI ES MANUAL
				if(TipoCalculoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoCalculo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoCalculoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoCalculo--;			
			//TipoCalculo tipocalculoAux= new TipoCalculo();			
			//tipocalculoAux.setId(this.iIdNuevoTipoCalculo);
			
			if(this.jInternalFrameDetalleFormTipoCalculo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoCalculo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculo(this.tipocalculo);
			
			this.tipocalculo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocalculoLogic.getTipoCalculos().add(this.tipocalculoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocalculos.add(this.tipocalculoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoCalculo(false);
			
			this.jTableDatosTipoCalculo.setRowSelectionInterval(this.getIndiceNuevoTipoCalculo(), this.getIndiceNuevoTipoCalculo());
			
			int iLastRow =  this.jTableDatosTipoCalculo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoCalculo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoCalculo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoCalculo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoCalculoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoCalculo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCalculo(false);
			
			//SI ES MANUAL
			if(TipoCalculoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCalculo();
			}
			
			//this.abrirFrameTreeTipoCalculo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoCalculoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo CalculoS ?", "MANTENIMIENTO DE Tipo Calculo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoCalculo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoCalculo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocalculoReturnGeneral=tipocalculoLogic.procesarImportacionTipoCalculosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocalculoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoCalculoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoCalculoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoCalculo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoCalculo.setFileImportacion(this.jInternalFrameImportacionTipoCalculo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoCalculo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoCalculo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoCalculo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoCalculo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoCalculoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoCalculo> tipocalculosSeleccionados=new ArrayList<TipoCalculo>();		

		tipocalculosSeleccionados=this.getTipoCalculosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCalculo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCalculo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoCalculoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoCalculoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoCalculos("Todos",tipocalculosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Calculo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCalculo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCalculo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCalculoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCalculoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoCalculo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCalculo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCalculo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoCalculoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoCalculoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoCalculo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoCalculoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoCalculoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoCalculo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCalculo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCalculoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoCalculoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoCalculoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoCalculo> tipocalculosSeleccionados=new ArrayList<TipoCalculo>();		
		
		tipocalculosSeleccionados=this.getTipoCalculosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocalculo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoCalculos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoCalculo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCalculo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoCalculoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCalculoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoCalculo tipocalculo:tipocalculosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocalculo.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCalculoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCalculoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoCalculo tipocalculo:tipocalculosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocalculo.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoCalculo(row);				
			//	iRow++;
			//}				
			
			//for(TipoCalculo tipocalculoAux:tipocalculosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoCalculo(tipocalculoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Calculo",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocalculoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCalculo(false);
			
			//SI ES MANUAL
			if(TipoCalculoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCalculo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoCalculoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCalculo(false);
			
			//SI ES MANUAL
			if(TipoCalculoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCalculo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoCalculoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCalculo(false);
			
			//SI ES MANUAL
			if(TipoCalculoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCalculo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoCalculo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoCalculo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoCalculo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoCalculo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoCalculo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoCalculo.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoCalculo.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoCalculo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoCalculo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoCalculo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoCalculo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoCalculo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoCalculo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoCalculo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCalculo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoCalculo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoCalculoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoCalculoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoCalculo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoCalculo();
		
		this.inicializarActualizarBindingBotonesManualTipoCalculo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCalculo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCalculo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCalculo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCalculo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoCalculo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoCalculo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoCalculo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoCalculo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoCalculo.jCheckBoxPostAccionNuevoTipoCalculo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoCalculo.jCheckBoxPostAccionSinCerrarTipoCalculo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoCalculo.jCheckBoxPostAccionSinMensajeTipoCalculo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoCalculo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoCalculo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoCalculo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoCalculo!=null) {
				this.jInternalFrameDetalleFormTipoCalculo.jCheckBoxPostAccionNuevoTipoCalculo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoCalculo.jCheckBoxPostAccionSinCerrarTipoCalculo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoCalculo.jCheckBoxPostAccionSinMensajeTipoCalculo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoCalculo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoCalculo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoCalculo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoCalculo.jComboBoxTiposAccionesFormularioTipoCalculo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoCalculo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoCalculo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCalculo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoCalculo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoCalculo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoCalculo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoCalculo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoCalculo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCalculo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoCalculo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoCalculo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoCalculo(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoCalculoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCalculo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoCalculo() throws Exception {
		try	{
			if(TipoCalculoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCalculo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCalculo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoCalculo.jComboBoxTiposAccionesFormularioTipoCalculo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoCalculo.jComboBoxTiposAccionesFormularioTipoCalculo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCalculo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoCalculo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoCalculo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoCalculo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoCalculo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoCalculo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoCalculo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoCalculo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoCalculo.addItem(reporte);
			}
			
			
			if(!this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoCalculo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoCalculo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoCalculo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoCalculo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoCalculo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoCalculo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoCalculo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoCalculo.jComboBoxTiposAccionesFormularioTipoCalculo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoCalculo.jComboBoxTiposAccionesFormularioTipoCalculo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoCalculo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoCalculo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoCalculo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCalculo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCalculo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCalculo!=null) {
				this.jInternalFrameReporteDinamicoTipoCalculo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCalculo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCalculo!=null) {
				this.jInternalFrameReporteDinamicoTipoCalculo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCalculo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoCalculo!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoCalculo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCalculo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCalculo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoCalculo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCalculo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCalculo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoCalculo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoCalculo(Boolean esInicializar) throws Exception {				
		if(TipoCalculoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCalculo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoCalculo() throws Exception {
		this.inicializarActualizarBindingTablaTipoCalculo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoCalculo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoCalculo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoCalculo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCalculo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoCalculoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoCalculo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCalculo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoCalculoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoCalculoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCalculoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoCalculoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoCalculo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCalculo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoCalculoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoCalculo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoCalculo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocalculoLogic.getTipoCalculos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocalculos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoCalculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoCalculo.setModel(new TipoCalculoModel(this.tipocalculoLogic.getTipoCalculos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoCalculo.setModel(new TipoCalculoModel(this.tipocalculos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoCalculo!=null && this.jInternalFrameOrderByTipoCalculo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoCalculo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoCalculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCalculo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoCalculoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO,tipocalculoConstantesFunciones.resaltarSeleccionarTipoCalculo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO,tipocalculoConstantesFunciones.resaltarSeleccionarTipoCalculo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoCalculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCalculo,TipoCalculoConstantesFunciones.LABEL_ID));

		if(this.tipocalculoConstantesFunciones.mostraridTipoCalculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCalculoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocalculoConstantesFunciones.resaltaridTipoCalculo,this.tipocalculoConstantesFunciones.activaridTipoCalculo,this,true,"idTipoCalculo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocalculoConstantesFunciones.resaltaridTipoCalculo,this.tipocalculoConstantesFunciones.activaridTipoCalculo,this,true,"idTipoCalculo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCalculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCalculo,TipoCalculoConstantesFunciones.LABEL_CODIGO));

		if(this.tipocalculoConstantesFunciones.mostrarcodigoTipoCalculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCalculoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocalculoConstantesFunciones.resaltarcodigoTipoCalculo,this.tipocalculoConstantesFunciones.activarcodigoTipoCalculo,this,true,"codigoTipoCalculo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocalculoConstantesFunciones.resaltarcodigoTipoCalculo,this.tipocalculoConstantesFunciones.activarcodigoTipoCalculo,this,true,"codigoTipoCalculo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCalculoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCalculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCalculo,TipoCalculoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipocalculoConstantesFunciones.mostrarnombreTipoCalculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCalculoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocalculoConstantesFunciones.resaltarnombreTipoCalculo,this.tipocalculoConstantesFunciones.activarnombreTipoCalculo,this,true,"nombreTipoCalculo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocalculoConstantesFunciones.resaltarnombreTipoCalculo,this.tipocalculoConstantesFunciones.activarnombreTipoCalculo,this,true,"nombreTipoCalculo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCalculoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocalculoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocalculoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocalculoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCalculo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocalculoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocalculoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCalculo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoCalculo && this.isPermisoGuardarCambiosTipoCalculo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocalculoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocalculoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoCalculo.addColumn(tableColumn);
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
			
			this.jTableDatosTipoCalculo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCalculo && this.isPermisoGuardarCambiosTipoCalculo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCalculo && this.isPermisoGuardarCambiosTipoCalculo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoCalculo.moveColumn(this.jTableDatosTipoCalculo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoCalculo.moveColumn(this.jTableDatosTipoCalculo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoCalculo.moveColumn(this.jTableDatosTipoCalculo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoCalculo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoCalculo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoCalculo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoCalculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoCalculo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoCalculo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoCalculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoCalculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoCalculo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoCalculo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoCalculo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocalculoLogic.getTipoCalculos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocalculos.size()-1;
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
		//this.jTableDatosTipoCalculo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoCalculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoCalculo();
			
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
				
				//this.isEsNuevoTipoCalculo=false;
					
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
			
				if(this.tipocalculoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoCalculo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCalculo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCalculo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculo =(TipoCalculo) this.tipocalculoLogic.getTipoCalculos().toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocalculo =(TipoCalculo) this.tipocalculos.toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocalculo.getsType().equals("DUPLICADO")
				   || this.tipocalculo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoCalculo=true;
				
				} else {
					this.isEsNuevoTipoCalculo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocalculo.getId()>=0 && !this.tipocalculo.getIsNew()) {						
						this.isEsNuevoTipoCalculo=false;
						
					} else {
						this.isEsNuevoTipoCalculo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoCalculo(esRelaciones);						
				
				this.seleccionarTipoCalculo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocalculo.getId()<0) {
					this.isEsNuevoTipoCalculo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoCalculo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoCalculo(evt,rowIndex);
				}	
				
				if(this.tipocalculoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoCalculo: " + this.dDif); 
					}
				}								
				
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoCalculo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocalculo)) {
					if(this.tipocalculo.getId()>0) {
						this.tipocalculo.setIsDeleted(true);
						
						this.tipocalculosEliminados.add(this.tipocalculo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocalculoLogic.getTipoCalculos().remove(this.tipocalculo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocalculos.remove(this.tipocalculo);				
					}
					
					
					((TipoCalculoModel) this.jTableDatosTipoCalculo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCalculo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoCalculo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoCalculo) {
			
			if(this.jInternalFrameDetalleFormTipoCalculo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCalculo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCalculo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculo =(TipoCalculo) this.tipocalculoLogic.getTipoCalculos().toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocalculo =(TipoCalculo) this.tipocalculos.toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoCalculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoCalculo(this.tipocalculo);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoCalculo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoCalculo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCalculo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCalculo(TipoCalculo tipocalculo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoCalculo(tipocalculo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCalculo(TipoCalculo tipocalculo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoCalculo(tipocalculo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoCalculo(tipocalculo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoCalculo(tipocalculo);
	}
	
	public void setVariablesObjetoActualToFormularioTipoCalculo(TipoCalculo tipocalculo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoCalculo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoCalculo.jTextFieldidTipoCalculo.setText(tipocalculo.getId().toString());
			this.jInternalFrameDetalleFormTipoCalculo.jTextFieldcodigoTipoCalculo.setText(tipocalculo.getcodigo());
			this.jInternalFrameDetalleFormTipoCalculo.jTextAreanombreTipoCalculo.setText(tipocalculo.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoCalculo tipocalculoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocalculoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoCalculo tipocalculoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocalculoLocal=this.tipocalculo;
			} else {
				tipocalculoLocal=this.tipocalculoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocalculoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoCalculo(tipocalculoLocal,true);
					
					if(tipocalculoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocalculoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocalculoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoCalculo(TipoCalculo tipocalculo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCalculo(tipocalculo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculo(tipocalculo);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCalculo(TipoCalculo tipocalculo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCalculo(tipocalculo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCalculo(TipoCalculo tipocalculo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoCalculo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoCalculo.jTextFieldidTipoCalculo.getText()==null || this.jInternalFrameDetalleFormTipoCalculo.jTextFieldidTipoCalculo.getText()=="" || this.jInternalFrameDetalleFormTipoCalculo.jTextFieldidTipoCalculo.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoCalculo.jTextFieldidTipoCalculo.setText("0");
			}

			if(conColumnasBase) {tipocalculo.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoCalculo.jTextFieldidTipoCalculo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCalculoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCalculo.jLabelIdTipoCalculo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocalculo.setcodigo(this.jInternalFrameDetalleFormTipoCalculo.jTextFieldcodigoTipoCalculo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCalculoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCalculo.jLabelcodigoTipoCalculo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocalculo.setnombre(this.jInternalFrameDetalleFormTipoCalculo.jTextAreanombreTipoCalculo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCalculoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCalculo.jLabelnombreTipoCalculo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCalculo(TipoCalculo tipocalculoBean,TipoCalculo tipocalculo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoCalculo(TipoCalculo tipocalculoOrigen,TipoCalculo tipocalculo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocalculoOrigen.getId()!=null && !tipocalculoOrigen.getId().equals(0L))) {tipocalculo.setId(tipocalculoOrigen.getId());}}
			if(conDefault || (!conDefault && tipocalculoOrigen.getcodigo()!=null && !tipocalculoOrigen.getcodigo().equals(""))) {tipocalculo.setcodigo(tipocalculoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipocalculoOrigen.getnombre()!=null && !tipocalculoOrigen.getnombre().equals(""))) {tipocalculo.setnombre(tipocalculoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCalculo(TipoCalculo tipocalculo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCalculo.jTextFieldidTipoCalculo.setText(tipocalculo.getId().toString());
			this.jInternalFrameDetalleFormTipoCalculo.jTextFieldcodigoTipoCalculo.setText(tipocalculo.getcodigo());
			this.jInternalFrameDetalleFormTipoCalculo.jTextAreanombreTipoCalculo.setText(tipocalculo.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCalculo(TipoCalculoBean tipocalculoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCalculo.jTextFieldidTipoCalculo.setText(tipocalculoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoCalculo.jTextFieldcodigoTipoCalculo.setText(tipocalculoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoCalculo.jTextAreanombreTipoCalculo.setText(tipocalculoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoCalculo(TipoCalculoParameterReturnGeneral tipocalculoReturnGeneral,TipoCalculoBean tipocalculoBean,Boolean conDefault) throws Exception { 
		try {
			TipoCalculo tipocalculoLocal=new TipoCalculo();
			
			tipocalculoLocal=tipocalculoReturnGeneral.getTipoCalculo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocalculoLocal.getId()!=null && !tipocalculoLocal.getId().equals(0L))) {tipocalculoBean.setId(tipocalculoLocal.getId());}}
			if(conDefault || (!conDefault && tipocalculoLocal.getcodigo()!=null && !tipocalculoLocal.getcodigo().equals(""))) {tipocalculoBean.setcodigo(tipocalculoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipocalculoLocal.getnombre()!=null && !tipocalculoLocal.getnombre().equals(""))) {tipocalculoBean.setnombre(tipocalculoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoCalculoGenerico(Long idTipoCalculoSeleccionado,JComboBox jComboBoxTipoCalculo,List<TipoCalculo> tipocalculosLocal)throws Exception {
		try {
			TipoCalculo  tipocalculoTemp=null;

			for(TipoCalculo tipocalculoAux:tipocalculosLocal) {
				if(tipocalculoAux.getId()!=null && tipocalculoAux.getId().equals(idTipoCalculoSeleccionado)) {
					tipocalculoTemp=tipocalculoAux;
					break;
				}
			}

			jComboBoxTipoCalculo.setSelectedItem(tipocalculoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoCalculoGenerico(JComboBox jComboBoxTipoCalculo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoCalculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCalculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoCalculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCalculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCalculo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoCalculo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCalculo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoCalculo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoCalculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoCalculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocalculo=(TipoCalculo) tipocalculoLogic.getTipoCalculos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocalculo =(TipoCalculo) tipocalculos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoCalculo tipocalculoRow=new TipoCalculo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocalculoRow=(TipoCalculo) tipocalculoLogic.getTipoCalculos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocalculoRow=(TipoCalculo) tipocalculos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoCalculo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoCalculo.setVisible((this.isVisibilidadCeldaNuevoTipoCalculo && this.isPermisoNuevoTipoCalculo));			
			this.jButtonDuplicarTipoCalculo.setVisible((this.isVisibilidadCeldaDuplicarTipoCalculo && this.isPermisoDuplicarTipoCalculo));			
			this.jButtonCopiarTipoCalculo.setVisible((this.isVisibilidadCeldaCopiarTipoCalculo && this.isPermisoCopiarTipoCalculo));
			this.jButtonVerFormTipoCalculo.setVisible((this.isVisibilidadCeldaVerFormTipoCalculo && this.isPermisoVerFormTipoCalculo));
			
			this.jButtonAbrirOrderByTipoCalculo.setVisible((this.isVisibilidadCeldaOrdenTipoCalculo && this.isPermisoOrdenTipoCalculo));			
			
			this.jButtonNuevoRelacionesTipoCalculo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCalculo && this.isPermisoNuevoTipoCalculo));			
			this.jButtonNuevoGuardarCambiosTipoCalculo.setVisible((this.isVisibilidadCeldaNuevoTipoCalculo && this.isPermisoNuevoTipoCalculo && this.isPermisoGuardarCambiosTipoCalculo));
			
			if(this.jInternalFrameDetalleFormTipoCalculo!=null) {
			this.jInternalFrameDetalleFormTipoCalculo.jButtonModificarTipoCalculo.setVisible((this.isVisibilidadCeldaModificarTipoCalculo && this.isPermisoActualizarTipoCalculo));	
			this.jInternalFrameDetalleFormTipoCalculo.jButtonActualizarTipoCalculo.setVisible((this.isVisibilidadCeldaActualizarTipoCalculo && this.isPermisoActualizarTipoCalculo));	
			this.jInternalFrameDetalleFormTipoCalculo.jButtonEliminarTipoCalculo.setVisible((this.isVisibilidadCeldaEliminarTipoCalculo && this.isPermisoEliminarTipoCalculo));
			this.jInternalFrameDetalleFormTipoCalculo.jButtonCancelarTipoCalculo.setVisible(this.isVisibilidadCeldaCancelarTipoCalculo);							
			this.jInternalFrameDetalleFormTipoCalculo.jButtonGuardarCambiosTipoCalculo.setVisible((this.isVisibilidadCeldaGuardarTipoCalculo && this.isPermisoGuardarCambiosTipoCalculo));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoCalculo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCalculo && this.isPermisoGuardarCambiosTipoCalculo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoCalculo.setVisible((this.isVisibilidadCeldaNuevoTipoCalculo && this.isPermisoNuevoTipoCalculo));						
			this.jButtonDuplicarToolBarTipoCalculo.setVisible((this.isVisibilidadCeldaDuplicarTipoCalculo && this.isPermisoDuplicarTipoCalculo));						
			this.jButtonCopiarToolBarTipoCalculo.setVisible((this.isVisibilidadCeldaCopiarTipoCalculo && this.isPermisoCopiarTipoCalculo));			
			this.jButtonVerFormToolBarTipoCalculo.setVisible((this.isVisibilidadCeldaVerFormTipoCalculo && this.isPermisoVerFormTipoCalculo));			
			this.jButtonAbrirOrderByToolBarTipoCalculo.setVisible((this.isVisibilidadCeldaOrdenTipoCalculo && this.isPermisoOrdenTipoCalculo));
			this.jButtonNuevoRelacionesToolBarTipoCalculo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCalculo && this.isPermisoNuevoTipoCalculo));			
			this.jButtonNuevoGuardarCambiosToolBarTipoCalculo.setVisible((this.isVisibilidadCeldaNuevoTipoCalculo && this.isPermisoNuevoTipoCalculo && this.isPermisoGuardarCambiosTipoCalculo));			
			
			if(this.jInternalFrameDetalleFormTipoCalculo!=null) {
			this.jInternalFrameDetalleFormTipoCalculo.jButtonModificarToolBarTipoCalculo.setVisible((this.isVisibilidadCeldaModificarTipoCalculo && this.isPermisoActualizarTipoCalculo));	
			this.jInternalFrameDetalleFormTipoCalculo.jButtonActualizarToolBarTipoCalculo.setVisible((this.isVisibilidadCeldaActualizarTipoCalculo  && this.isPermisoActualizarTipoCalculo));	
			this.jInternalFrameDetalleFormTipoCalculo.jButtonEliminarToolBarTipoCalculo.setVisible((this.isVisibilidadCeldaEliminarTipoCalculo && this.isPermisoEliminarTipoCalculo));
			this.jInternalFrameDetalleFormTipoCalculo.jButtonCancelarToolBarTipoCalculo.setVisible(this.isVisibilidadCeldaCancelarTipoCalculo);				
			this.jInternalFrameDetalleFormTipoCalculo.jButtonGuardarCambiosToolBarTipoCalculo.setVisible((this.isVisibilidadCeldaGuardarTipoCalculo && this.isPermisoGuardarCambiosTipoCalculo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoCalculo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCalculo && this.isPermisoGuardarCambiosTipoCalculo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoCalculo.setVisible((this.isVisibilidadCeldaNuevoTipoCalculo && this.isPermisoNuevoTipoCalculo));			
			this.jMenuItemDuplicarTipoCalculo.setVisible((this.isVisibilidadCeldaDuplicarTipoCalculo && this.isPermisoDuplicarTipoCalculo));			
			this.jMenuItemCopiarTipoCalculo.setVisible((this.isVisibilidadCeldaCopiarTipoCalculo && this.isPermisoCopiarTipoCalculo));			
			this.jMenuItemVerFormTipoCalculo.setVisible((this.isVisibilidadCeldaVerFormTipoCalculo && this.isPermisoVerFormTipoCalculo));			
			this.jMenuItemAbrirOrderByTipoCalculo.setVisible((this.isVisibilidadCeldaOrdenTipoCalculo && this.isPermisoOrdenTipoCalculo));			
			//this.jMenuItemMostrarOcultarTipoCalculo.setVisible((this.isVisibilidadCeldaOrdenTipoCalculo && this.isPermisoOrdenTipoCalculo));
			this.jMenuItemDetalleAbrirOrderByTipoCalculo.setVisible((this.isVisibilidadCeldaOrdenTipoCalculo && this.isPermisoOrdenTipoCalculo));			
			//this.jMenuItemDetalleMostrarOcultarTipoCalculo.setVisible((this.isVisibilidadCeldaOrdenTipoCalculo && this.isPermisoOrdenTipoCalculo));			
			this.jMenuItemNuevoRelacionesTipoCalculo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCalculo && this.isPermisoNuevoTipoCalculo));			
			this.jMenuItemNuevoGuardarCambiosTipoCalculo.setVisible((this.isVisibilidadCeldaNuevoTipoCalculo && this.isPermisoNuevoTipoCalculo && this.isPermisoGuardarCambiosTipoCalculo));									
			
			if(this.jInternalFrameDetalleFormTipoCalculo!=null) {
			this.jInternalFrameDetalleFormTipoCalculo.jMenuItemModificarTipoCalculo.setVisible((this.isVisibilidadCeldaModificarTipoCalculo && this.isPermisoActualizarTipoCalculo));	
			this.jInternalFrameDetalleFormTipoCalculo.jMenuItemActualizarTipoCalculo.setVisible((this.isVisibilidadCeldaActualizarTipoCalculo && this.isPermisoActualizarTipoCalculo));	
			this.jInternalFrameDetalleFormTipoCalculo.jMenuItemEliminarTipoCalculo.setVisible((this.isVisibilidadCeldaEliminarTipoCalculo && this.isPermisoEliminarTipoCalculo));
			this.jInternalFrameDetalleFormTipoCalculo.jMenuItemCancelarTipoCalculo.setVisible(this.isVisibilidadCeldaCancelarTipoCalculo);				
			}
			
			this.jMenuItemGuardarCambiosTipoCalculo.setVisible((this.isVisibilidadCeldaGuardarTipoCalculo && this.isPermisoGuardarCambiosTipoCalculo));						
			this.jMenuItemGuardarCambiosTablaTipoCalculo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCalculo && this.isPermisoGuardarCambiosTipoCalculo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoCalculo=this.jButtonNuevoTipoCalculo.isVisible();
			this.isVisibilidadCeldaDuplicarTipoCalculo=this.jButtonDuplicarTipoCalculo.isVisible();
			this.isVisibilidadCeldaCopiarTipoCalculo=this.jButtonCopiarTipoCalculo.isVisible();
			this.isVisibilidadCeldaVerFormTipoCalculo=this.jButtonVerFormTipoCalculo.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoCalculo=this.jButtonAbrirOrderByTipoCalculo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculo=this.jButtonNuevoRelacionesTipoCalculo.isVisible();
			this.isVisibilidadCeldaModificarTipoCalculo=this.jButtonModificarTipoCalculo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCalculo!=null) {
			this.isVisibilidadCeldaActualizarTipoCalculo=this.jInternalFrameDetalleFormTipoCalculo.jButtonActualizarTipoCalculo.isVisible();
			this.isVisibilidadCeldaEliminarTipoCalculo=this.jInternalFrameDetalleFormTipoCalculo.jButtonEliminarTipoCalculo.isVisible();
			this.isVisibilidadCeldaCancelarTipoCalculo=this.jInternalFrameDetalleFormTipoCalculo.jButtonCancelarTipoCalculo.isVisible();
			this.isVisibilidadCeldaGuardarTipoCalculo=this.jInternalFrameDetalleFormTipoCalculo.jButtonGuardarCambiosTipoCalculo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoCalculo=this.jButtonGuardarCambiosTablaTipoCalculo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoCalculo=this.jButtonNuevoToolBarTipoCalculo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculo=this.jButtonNuevoRelacionesToolBarTipoCalculo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCalculo!=null) {
			this.isVisibilidadCeldaModificarTipoCalculo=this.jInternalFrameDetalleFormTipoCalculo.jButtonModificarToolBarTipoCalculo.isVisible();
			this.isVisibilidadCeldaActualizarTipoCalculo=this.jInternalFrameDetalleFormTipoCalculo.jButtonActualizarToolBarTipoCalculo.isVisible();
			this.isVisibilidadCeldaEliminarTipoCalculo=this.jInternalFrameDetalleFormTipoCalculo.jButtonEliminarToolBarTipoCalculo.isVisible();
			this.isVisibilidadCeldaCancelarTipoCalculo=this.jInternalFrameDetalleFormTipoCalculo.jButtonCancelarToolBarTipoCalculo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCalculo=this.jButtonGuardarCambiosToolBarTipoCalculo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCalculo=this.jButtonGuardarCambiosTablaToolBarTipoCalculo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoCalculo=this.jMenuItemNuevoTipoCalculo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculo=this.jMenuItemNuevoRelacionesTipoCalculo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCalculo!=null) {
			this.isVisibilidadCeldaModificarTipoCalculo=this.jInternalFrameDetalleFormTipoCalculo.jMenuItemModificarTipoCalculo.isVisible();
			this.isVisibilidadCeldaActualizarTipoCalculo=this.jInternalFrameDetalleFormTipoCalculo.jMenuItemActualizarTipoCalculo.isVisible();
			this.isVisibilidadCeldaEliminarTipoCalculo=this.jInternalFrameDetalleFormTipoCalculo.jMenuItemEliminarTipoCalculo.isVisible();
			this.isVisibilidadCeldaCancelarTipoCalculo=this.jInternalFrameDetalleFormTipoCalculo.jMenuItemCancelarTipoCalculo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCalculo=this.jMenuItemGuardarCambiosTipoCalculo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCalculo=this.jMenuItemGuardarCambiosTablaTipoCalculo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoCalculo(Boolean esInicializar) {
		if(TipoCalculoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocalculoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCalculo();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoCalculo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoCalculo() {
		this.jButtonNuevoTipoCalculo.setVisible(this.isPermisoNuevoTipoCalculo);			
		this.jButtonDuplicarTipoCalculo.setVisible(this.isPermisoDuplicarTipoCalculo);			
		this.jButtonCopiarTipoCalculo.setVisible(this.isPermisoCopiarTipoCalculo);			
		this.jButtonVerFormTipoCalculo.setVisible(this.isPermisoVerFormTipoCalculo);			
		
		this.jButtonAbrirOrderByTipoCalculo.setVisible(this.isPermisoOrdenTipoCalculo);					
		
		this.jButtonNuevoRelacionesTipoCalculo.setVisible(this.isPermisoNuevoTipoCalculo);			
		
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculo.jButtonModificarTipoCalculo.setVisible(this.isPermisoActualizarTipoCalculo);	
			this.jInternalFrameDetalleFormTipoCalculo.jButtonActualizarTipoCalculo.setVisible(this.isPermisoActualizarTipoCalculo);	
			this.jInternalFrameDetalleFormTipoCalculo.jButtonEliminarTipoCalculo.setVisible(this.isPermisoEliminarTipoCalculo);
			this.jInternalFrameDetalleFormTipoCalculo.jButtonCancelarTipoCalculo.setVisible(this.isVisibilidadCeldaCancelarTipoCalculo);						
			this.jInternalFrameDetalleFormTipoCalculo.jButtonGuardarCambiosTipoCalculo.setVisible(this.isPermisoGuardarCambiosTipoCalculo);							
		}
		
		this.jButtonGuardarCambiosTablaTipoCalculo.setVisible(this.isPermisoActualizarTipoCalculo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCalculo() {
		this.jInternalFrameDetalleFormTipoCalculo.jButtonModificarTipoCalculo.setVisible(this.isPermisoActualizarTipoCalculo);	
		this.jInternalFrameDetalleFormTipoCalculo.jButtonActualizarTipoCalculo.setVisible(this.isPermisoActualizarTipoCalculo);	
		this.jInternalFrameDetalleFormTipoCalculo.jButtonEliminarTipoCalculo.setVisible(this.isPermisoEliminarTipoCalculo);
		this.jInternalFrameDetalleFormTipoCalculo.jButtonCancelarTipoCalculo.setVisible(this.isVisibilidadCeldaCancelarTipoCalculo);							
		this.jInternalFrameDetalleFormTipoCalculo.jButtonGuardarCambiosTipoCalculo.setVisible((this.isVisibilidadCeldaGuardarTipoCalculo && this.isPermisoGuardarCambiosTipoCalculo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoCalculo() {
		if(TipoCalculoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoCalculo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoCalculo() {
	}
	
	public void jTableDatosTipoCalculoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoCalculo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoCalculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCalculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCalculo(this.gettipocalculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculo(this.tipocalculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocalculo =(TipoCalculo) this.tipocalculoLogic.getTipoCalculos().toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocalculo =(TipoCalculo) this.tipocalculos.toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocalculo==null) {
						this.tipocalculo = new TipoCalculo();
					}

					this.setVariablesFormularioToObjetoActualTipoCalculo(this.tipocalculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculo(this.tipocalculo);
				}

				if(this.tipocalculo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocalculo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCalculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoCalculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCalculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCalculo(this.gettipocalculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculo(this.tipocalculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocalculo =(TipoCalculo) this.tipocalculoLogic.getTipoCalculos().toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocalculo =(TipoCalculo) this.tipocalculos.toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocalculo==null) {
						this.tipocalculo = new TipoCalculo();
					}

					this.setVariablesFormularioToObjetoActualTipoCalculo(this.tipocalculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculo(this.tipocalculo);
				}

				if(this.tipocalculo.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipocalculo.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCalculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoCalculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCalculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCalculo(this.gettipocalculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculo(this.tipocalculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocalculo =(TipoCalculo) this.tipocalculoLogic.getTipoCalculos().toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocalculo =(TipoCalculo) this.tipocalculos.toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocalculo==null) {
						this.tipocalculo = new TipoCalculo();
					}

					this.setVariablesFormularioToObjetoActualTipoCalculo(this.tipocalculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculo(this.tipocalculo);
				}

				if(this.tipocalculo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipocalculo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCalculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoCalculo() {
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) {
			this.jInternalFrameDetalleFormTipoCalculo.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoCalculo.dispose();
			this.jInternalFrameDetalleFormTipoCalculo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoCalculo!=null) {
			this.jInternalFrameReporteDinamicoTipoCalculo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoCalculo.dispose();
			this.jInternalFrameReporteDinamicoTipoCalculo=null;
		}
		
		if(this.jInternalFrameImportacionTipoCalculo!=null) {
			this.jInternalFrameImportacionTipoCalculo.setVisible(false);	    			
			this.jInternalFrameImportacionTipoCalculo.dispose();
			this.jInternalFrameImportacionTipoCalculo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoCalculo();
			
			TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoCalculo")) {
				jButtonNuevoTipoCalculoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoCalculo")) {
				jButtonDuplicarTipoCalculoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoCalculo")) {
				jButtonCopiarTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoCalculo")) {
				jButtonVerFormTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoCalculo")) {
				jButtonNuevoTipoCalculoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoCalculo")) {
				jButtonDuplicarTipoCalculoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoCalculo")) {
				jButtonNuevoTipoCalculoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoCalculo")) {
				jButtonDuplicarTipoCalculoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoCalculo")) {
				jButtonNuevoTipoCalculoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoCalculo")) {
				jButtonNuevoTipoCalculoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoCalculo")) {
				jButtonNuevoTipoCalculoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoCalculo")) {
				jButtonModificarTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoCalculo")) {
				jButtonModificarTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoCalculo")) {
				jButtonModificarTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoCalculo")) {
				jButtonActualizarTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoCalculo")) {
				jButtonActualizarTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoCalculo")) {
				jButtonActualizarTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoCalculo")) {
				jButtonEliminarTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoCalculo")) {
				jButtonEliminarTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoCalculo")) {
				jButtonEliminarTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoCalculo")) {
				jButtonCancelarTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoCalculo")) {
				jButtonCancelarTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoCalculo")) {
				jButtonCancelarTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoCalculo")) {
				jButtonCerrarTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoCalculo")) {
				jButtonCerrarTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoCalculo")) {
				jButtonCerrarTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoCalculo")) {
				jButtonMostrarOcultarTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoCalculo")) {
				jButtonCancelarTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoCalculo")) {
				jButtonGuardarCambiosTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoCalculo")) {
				jButtonGuardarCambiosTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoCalculo")) {
				jButtonCopiarTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoCalculo")) {
				jButtonVerFormTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoCalculo")) {
				jButtonGuardarCambiosTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoCalculo")) {
				jButtonCopiarTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoCalculo")) {
				jButtonVerFormTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoCalculo")) {
				jButtonGuardarCambiosTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoCalculo")) {
				jButtonGuardarCambiosTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoCalculo")) {
				jButtonGuardarCambiosTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoCalculo")) {
				jButtonRecargarInformacionTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoCalculo")) {
				jButtonRecargarInformacionTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoCalculo")) {
				jButtonRecargarInformacionTipoCalculoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoCalculo")) {
				jButtonAnterioresTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoCalculo")) {
				jButtonAnterioresTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoCalculo")) {
				jButtonAnterioresTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoCalculo")) {
				jButtonSiguientesTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoCalculo")) {
				jButtonSiguientesTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoCalculo")) {
				jButtonSiguientesTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoCalculo") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoCalculo")) {
				jButtonAbrirOrderByTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoCalculo") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoCalculo")) {
				jButtonMostrarOcultarTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCalculo")) {
				jButtonNuevoGuardarCambiosTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoCalculo")) {
				jButtonNuevoGuardarCambiosTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoCalculo")) {
				jButtonNuevoGuardarCambiosTipoCalculoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoCalculo")) {
				jButtonCerrarReporteDinamicoTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoCalculo")) {
				jButtonGenerarReporteDinamicoTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoCalculo")) {
				
				jButtonGenerarExcelReporteDinamicoTipoCalculoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoCalculo")) {
				jButtonCerrarImportacionTipoCalculoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoCalculo")) {
				
				jButtonGenerarImportacionTipoCalculoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoCalculo")) {
				
				jButtonAbrirImportacionTipoCalculoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoCalculo")) {
				jComboBoxTiposAccionesTipoCalculoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoCalculo")) {
				jComboBoxTiposRelacionesTipoCalculoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoCalculo")) {
				jComboBoxTiposAccionesTipoCalculoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoCalculo")) {
				
				jComboBoxTiposSeleccionarTipoCalculoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoCalculo")) {
				jTextFieldValorCampoGeneralTipoCalculoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoCalculo")) {
				jButtonAbrirOrderByTipoCalculoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoCalculo")) {
				jButtonAbrirOrderByTipoCalculoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoCalculo")) {
				jButtonCerrarOrderByTipoCalculoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCalculoBusqueda")) {
				this.jButtonidTipoCalculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCalculoBusqueda")) {
				this.jButtoncodigoTipoCalculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCalculoBusqueda")) {
				this.jButtonnombreTipoCalculoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoCalculo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCalculoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalculo);
				
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
				
				


				
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalculo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalculo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoCalculo tipocalculoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocalculoLocal=this.tipocalculo;
			} else {
				tipocalculoLocal=this.tipocalculoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalculo);
				
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
							
				
				


				
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalculo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalculo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCalculoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCalculo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculoAnterior =(TipoCalculo) this.tipocalculoLogic.getTipoCalculos().toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocalculoAnterior =(TipoCalculo) this.tipocalculos.toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
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
			
			TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
			
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
			
			


			
			TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCalculoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalculo);
				
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
								
						
				


				
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalculo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalculo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalculo);
				
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
								
				
				


				
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalculo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalculo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCalculoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCalculo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculoAnterior =(TipoCalculo) this.tipocalculoLogic.getTipoCalculos().toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocalculoAnterior =(TipoCalculo) this.tipocalculos.toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalculo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCalculoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCalculo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculoAnterior =(TipoCalculo) this.tipocalculoLogic.getTipoCalculos().toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocalculoAnterior =(TipoCalculo) this.tipocalculos.toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCalculoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocalculo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalculo);
				
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
							
				
				


				
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalculo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalculo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCalculoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCalculo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocalculoAnterior =(TipoCalculo) this.tipocalculoLogic.getTipoCalculos().toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocalculoAnterior =(TipoCalculo) this.tipocalculos.toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
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
			
			TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
			
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
			
			


			
			TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCalculoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocalculo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalculo);
				
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
								
				
				


				
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalculo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalculo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCalculoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCalculo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculoAnterior =(TipoCalculo) this.tipocalculoLogic.getTipoCalculos().toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocalculoAnterior =(TipoCalculo) this.tipocalculos.toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCalculoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocalculo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCalculoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalculo);
				
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoCalculo")) {
					jCheckBoxSeleccionarTodosTipoCalculoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoCalculo")) {
					jCheckBoxSeleccionadosTipoCalculoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoCalculo")) {
					
				}
				
				


				
				
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalculo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalculo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocalculo);
				
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
												
				
				


				
				
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalculo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalculo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCalculoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCalculo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocalculoAnterior =(TipoCalculo) this.tipocalculoLogic.getTipoCalculos().toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocalculoAnterior =(TipoCalculo) this.tipocalculos.toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCalculoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalculo);
				
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
				
				
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
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
			
			TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
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
			
			


			
			TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCalculoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalculo);
				
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalculo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalculo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalculo);
				
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
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
				
				


				
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalculo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalculo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCalculoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCalculo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculoAnterior =(TipoCalculo) this.tipocalculoLogic.getTipoCalculos().toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocalculoAnterior =(TipoCalculo) this.tipocalculos.toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoCalculo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoCalculoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoCalculo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocalculo =(TipoCalculo) this.tipocalculoLogic.getTipoCalculos().toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocalculo =(TipoCalculo) this.tipocalculos.toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocalculo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoCalculo")) {
				
				}
				
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoCalculo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoCalculo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoCalculo")) {
			
			}
			
			TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoCalculo();
			
			TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoCalculo")) {
				jButtonNuevoTipoCalculoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoCalculo")) {
				jButtonDuplicarTipoCalculoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoCalculo")) {
				jButtonCopiarTipoCalculoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoCalculo")) {
				jButtonVerFormTipoCalculoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoCalculo")) {
				jButtonNuevoTipoCalculoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoCalculo")) {
				jButtonModificarTipoCalculoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoCalculo")) {
				jButtonActualizarTipoCalculoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoCalculo")) {
				jButtonEliminarTipoCalculoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoCalculo")) {
				jButtonGuardarCambiosTipoCalculoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoCalculo")) {
				jButtonCancelarTipoCalculoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoCalculo")) {
				jButtonCerrarTipoCalculoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoCalculo")) {
				jButtonGuardarCambiosTipoCalculoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCalculo")) {
				jButtonNuevoGuardarCambiosTipoCalculoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoCalculo")) {
				jButtonAbrirOrderByTipoCalculoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoCalculo")) {
				jButtonRecargarInformacionTipoCalculoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoCalculo")) {
				jButtonAnterioresTipoCalculoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoCalculo")) {
				jButtonSiguientesTipoCalculoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCalculoBusqueda")) {
				this.jButtonidTipoCalculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCalculoBusqueda")) {
				this.jButtoncodigoTipoCalculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCalculoBusqueda")) {
				this.jButtonnombreTipoCalculoBusquedaActionPerformed(evt);
			}
			
			TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoCalculo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoCalculo")) {
				closingInternalFrameTipoCalculo();
				
			} else if(sTipo.equals("jButtonCancelarTipoCalculo")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoCalculo = (JInternalFrameBase)evt.getSource();
	            	
	            TipoCalculoBeanSwingJInternalFrame jInternalFrameParent=(TipoCalculoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCalculo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoCalculoActionPerformed(null);
			}
			
			TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocalculo,new Object(),this.tipocalculoParameterGeneral,this.tipocalculoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoCalculo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoCalculo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoCalculo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocalculo)) {
			if(!esControlTabla) {
				if(TipoCalculoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoCalculo(this.tipocalculo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculo(this.tipocalculo);			
				}
				
				if(this.tipocalculoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoCalculo(this.tipocalculo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocalculoReturnGeneral=tipocalculoLogic.procesarEventosTipoCalculosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocalculoLogic.getTipoCalculos(),this.tipocalculo,this.tipocalculoParameterGeneral,this.isEsNuevoTipoCalculo,classes);//this.tipocalculoLogic.getTipoCalculo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoCalculo(this.tipocalculoReturnGeneral,this.tipocalculoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocalculoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoCalculo(classes,this.tipocalculoReturnGeneral,this.tipocalculoBean,false);
					}
						
					if(this.tipocalculoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoCalculo(this.tipocalculoReturnGeneral.getTipoCalculo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoCalculo(this.tipocalculoReturnGeneral.getTipoCalculo());	
					}
						
					if(this.tipocalculoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoCalculo(this.tipocalculoReturnGeneral.getTipoCalculo(),classes);//this.tipocalculoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoCalculo(this.tipocalculo,classes);//this.tipocalculoBean);									
				}
			
				if(TipoCalculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoCalculo(this.tipocalculo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculo(this.tipocalculo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocalculoAnterior!=null) {
						this.tipocalculo=this.tipocalculoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocalculoReturnGeneral=tipocalculoLogic.procesarEventosTipoCalculosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocalculoLogic.getTipoCalculos(),this.tipocalculo,this.tipocalculoParameterGeneral,this.isEsNuevoTipoCalculo,classes);//this.tipocalculoLogic.getTipoCalculo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocalculoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocalculoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocalculoReturnGeneral.getTipoCalculo(),tipocalculoLogic.getTipoCalculos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocalculoReturnGeneral.getTipoCalculo(),this.tipocalculos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoCalculo.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoCalculo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoCalculo();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoCalculo() throws Exception {
		
		TipoCalculoModel tipocalculoModel=(TipoCalculoModel)this.jTableDatosTipoCalculo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocalculoModel.tipocalculos=this.tipocalculoLogic.getTipoCalculos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocalculoModel.tipocalculos=this.tipocalculos;
		}
		
		
		((TipoCalculoModel) this.jTableDatosTipoCalculo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoCalculo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocalculoAnterior(),this.tipocalculoLogic.getTipoCalculos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocalculoAnterior(),this.tipocalculos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoCalculo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoCalculo(TipoCalculo tipocalculo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
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
										
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocalculo,new Object(),generalEntityParameterGeneral,this.tipocalculoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocalculoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoCalculoConstantesFunciones.getClassesRelationshipsOfTipoCalculo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoCalculoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoCalculo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoCalculo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoCalculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocalculo,new Object(),generalEntityParameterGeneral,this.tipocalculoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoCalculo(TipoCalculoBean tipocalculoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoCalculo(ArrayList<Classe> classes,TipoCalculoReturnGeneral tipocalculoReturnGeneral,TipoCalculoBean tipocalculoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoCalculo(TipoCalculo tipocalculo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipocalculo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoCalculo = new TipoCalculoDetalleFormJInternalFrame(jDesktopPane,this.tipocalculoSessionBean.getConGuardarRelaciones(),this.tipocalculoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCalculo);
		this.jInternalFrameDetalleFormTipoCalculo.setVisible(false);
		this.jInternalFrameDetalleFormTipoCalculo.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoCalculo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoCalculo.tipocalculoLogic=this.tipocalculoLogic;
		
		this.cargarCombosFrameForeignKeyTipoCalculo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCalculo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCalculo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoCalculo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoCalculo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoCalculo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCalculo"));
		
		this.jInternalFrameDetalleFormTipoCalculo.jButtonModificarTipoCalculo.addActionListener(new ButtonActionListener(this,"ModificarTipoCalculo"));

		
		this.jInternalFrameDetalleFormTipoCalculo.jButtonModificarToolBarTipoCalculo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCalculo"));
					
		this.jInternalFrameDetalleFormTipoCalculo.jMenuItemModificarTipoCalculo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCalculo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCalculo.jButtonActualizarTipoCalculo.addActionListener (new ButtonActionListener(this,"ActualizarTipoCalculo"));
		
		
		this.jInternalFrameDetalleFormTipoCalculo.jButtonActualizarToolBarTipoCalculo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCalculo"));
						
		this.jInternalFrameDetalleFormTipoCalculo.jMenuItemActualizarTipoCalculo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCalculo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCalculo.jButtonEliminarTipoCalculo.addActionListener (new ButtonActionListener(this,"EliminarTipoCalculo"));
		
		
		this.jInternalFrameDetalleFormTipoCalculo.jButtonEliminarToolBarTipoCalculo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCalculo"));
								
		this.jInternalFrameDetalleFormTipoCalculo.jMenuItemEliminarTipoCalculo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCalculo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCalculo.jButtonCancelarTipoCalculo.addActionListener (new ButtonActionListener(this,"CancelarTipoCalculo"));
		
		
		this.jInternalFrameDetalleFormTipoCalculo.jButtonCancelarToolBarTipoCalculo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCalculo"));
					
		this.jInternalFrameDetalleFormTipoCalculo.jMenuItemCancelarTipoCalculo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCalculo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoCalculo.jMenuItemDetalleCerrarTipoCalculo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCalculo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCalculo.jButtonGuardarCambiosToolBarTipoCalculo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCalculo"));
		
		
		
		this.jInternalFrameDetalleFormTipoCalculo.jButtonGuardarCambiosToolBarTipoCalculo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCalculo"));
		
		
		
		this.jInternalFrameDetalleFormTipoCalculo.jComboBoxTiposAccionesFormularioTipoCalculo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCalculo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalculo.jButtonidTipoCalculoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCalculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalculo.jButtoncodigoTipoCalculoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCalculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalculo.jButtonnombreTipoCalculoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCalculoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoCalculo.jTabbedPaneRelacionesTipoCalculo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCalculo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoCalculo"));
		
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCalculo"));
		}
		
		this.jTableDatosTipoCalculo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoCalculo"));
		
		this.jTableDatosTipoCalculo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoCalculo"));
		
		this.jButtonNuevoTipoCalculo.addActionListener(new ButtonActionListener(this,"NuevoTipoCalculo"));
		
		this.jButtonDuplicarTipoCalculo.addActionListener(new ButtonActionListener(this,"DuplicarTipoCalculo"));
		
		this.jButtonCopiarTipoCalculo.addActionListener(new ButtonActionListener(this,"CopiarTipoCalculo"));
		
		this.jButtonVerFormTipoCalculo.addActionListener(new ButtonActionListener(this,"VerFormTipoCalculo"));
		
		
		this.jButtonNuevoToolBarTipoCalculo.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoCalculo"));
			
		this.jButtonDuplicarToolBarTipoCalculo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoCalculo"));
			
		this.jMenuItemNuevoTipoCalculo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoCalculo"));
			
		this.jMenuItemDuplicarTipoCalculo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoCalculo"));		
		
		
		this.jButtonNuevoRelacionesTipoCalculo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoCalculo"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoCalculo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoCalculo"));
			
		this.jMenuItemNuevoRelacionesTipoCalculo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoCalculo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculo.jButtonModificarTipoCalculo.addActionListener(new ButtonActionListener(this,"ModificarTipoCalculo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculo.jButtonModificarToolBarTipoCalculo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCalculo"));
			
			this.jInternalFrameDetalleFormTipoCalculo.jMenuItemModificarTipoCalculo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCalculo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoCalculo.jButtonActualizarTipoCalculo.addActionListener (new ButtonActionListener(this,"ActualizarTipoCalculo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculo.jButtonActualizarToolBarTipoCalculo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCalculo"));
				
			this.jInternalFrameDetalleFormTipoCalculo.jMenuItemActualizarTipoCalculo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCalculo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculo.jButtonEliminarTipoCalculo.addActionListener (new ButtonActionListener(this,"EliminarTipoCalculo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculo.jButtonEliminarToolBarTipoCalculo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCalculo"));
						
			this.jInternalFrameDetalleFormTipoCalculo.jMenuItemEliminarTipoCalculo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCalculo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculo.jButtonCancelarTipoCalculo.addActionListener (new ButtonActionListener(this,"CancelarTipoCalculo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculo.jButtonCancelarToolBarTipoCalculo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCalculo"));
			
			this.jInternalFrameDetalleFormTipoCalculo.jMenuItemCancelarTipoCalculo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCalculo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoCalculo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoCalculo"));		
		
		
		this.jButtonCerrarTipoCalculo.addActionListener (new ButtonActionListener(this,"CerrarTipoCalculo"));
		
		
		this.jButtonCerrarToolBarTipoCalculo.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoCalculo"));
			
		this.jMenuItemCerrarTipoCalculo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoCalculo"));
			
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculo.jMenuItemDetalleCerrarTipoCalculo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCalculo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculo.jButtonGuardarCambiosTipoCalculo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoCalculo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculo.jButtonGuardarCambiosToolBarTipoCalculo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCalculo"));
		}
		
		this.jButtonCopiarToolBarTipoCalculo.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoCalculo"));
			
		this.jButtonVerFormToolBarTipoCalculo.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoCalculo"));
		
		this.jMenuItemGuardarCambiosTipoCalculo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoCalculo"));
			
		this.jMenuItemCopiarTipoCalculo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoCalculo"));		
		
		this.jMenuItemVerFormTipoCalculo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoCalculo"));		
		
		
		this.jButtonGuardarCambiosTablaTipoCalculo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCalculo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCalculo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoCalculo"));
			
		this.jMenuItemGuardarCambiosTablaTipoCalculo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCalculo"));		
		
		
		
		this.jButtonRecargarInformacionTipoCalculo.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoCalculo"));
					
		this.jButtonRecargarInformacionToolBarTipoCalculo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoCalculo"));
		
		this.jMenuItemRecargarInformacionTipoCalculo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoCalculo"));		
		
		
		
		this.jButtonAnterioresTipoCalculo.addActionListener (new ButtonActionListener(this,"AnterioresTipoCalculo"));
		
		
		this.jButtonAnterioresToolBarTipoCalculo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoCalculo"));
		
		this.jMenuItemAnterioresTipoCalculo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoCalculo"));		
		
		
		this.jButtonSiguientesTipoCalculo.addActionListener (new ButtonActionListener(this,"SiguientesTipoCalculo"));
		
		
		this.jButtonSiguientesToolBarTipoCalculo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoCalculo"));
			
		this.jMenuItemSiguientesTipoCalculo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoCalculo"));
			
		this.jMenuItemAbrirOrderByTipoCalculo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoCalculo"));
			
		this.jMenuItemMostrarOcultarTipoCalculo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoCalculo"));
			
		this.jMenuItemDetalleAbrirOrderByTipoCalculo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoCalculo"));
			
		this.jMenuItemDetalleMostarOcultarTipoCalculo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoCalculo"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoCalculo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoCalculo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCalculo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoCalculo"));
			
		this.jMenuItemNuevoGuardarCambiosTipoCalculo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoCalculo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoCalculo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoCalculo"));

		this.jCheckBoxSeleccionadosTipoCalculo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoCalculo"));
		
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculo.jComboBoxTiposAccionesFormularioTipoCalculo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCalculo"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoCalculo.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoCalculo"));
			
		this.jComboBoxTiposAccionesTipoCalculo.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoCalculo"));
					
		this.jComboBoxTiposSeleccionarTipoCalculo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoCalculo"));
			
		this.jTextFieldValorCampoGeneralTipoCalculo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoCalculo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalculo.jButtonidTipoCalculoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCalculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalculo.jButtoncodigoTipoCalculoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCalculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalculo.jButtonnombreTipoCalculoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCalculoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoCalculo!=null) {
				this.jInternalFrameReporteDinamicoTipoCalculo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCalculo"));
				this.jInternalFrameReporteDinamicoTipoCalculo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCalculo"));
				this.jInternalFrameReporteDinamicoTipoCalculo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCalculo"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoCalculo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCalculo"));				
			//this.jButtonGenerarReporteDinamicoTipoCalculo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCalculo"));
			//this.jButtonGenerarExcelReporteDinamicoTipoCalculo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCalculo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoCalculo!=null) {
				this.jInternalFrameImportacionTipoCalculo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCalculo"));
				this.jInternalFrameImportacionTipoCalculo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCalculo"));
				this.jInternalFrameImportacionTipoCalculo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCalculo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoCalculo.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoCalculo"));
			
			this.jButtonAbrirOrderByToolBarTipoCalculo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoCalculo"));			
			
			if(this.jInternalFrameOrderByTipoCalculo!=null) {
				this.jInternalFrameOrderByTipoCalculo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCalculo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoCalculo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculo.jTabbedPaneRelacionesTipoCalculo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCalculo"));
		
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
            		closingInternalFrameTipoCalculo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoCalculo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoCalculo = (JInternalFrameBase)event.getSource();
	            	
	            TipoCalculoBeanSwingJInternalFrame jInternalFrameParent=(TipoCalculoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCalculo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoCalculoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoCalculo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoCalculoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoCalculo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoCalculo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCalculoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCalculoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCalculoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoCalculo";
		inputMap = this.jButtonNuevoTipoCalculo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoCalculo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCalculoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCalculoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCalculoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCalculoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoCalculo";
		inputMap = this.jButtonNuevoRelacionesTipoCalculo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoCalculo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCalculoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoCalculo";
		inputMap = this.jButtonModificarTipoCalculo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoCalculo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoCalculoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoCalculo";
		inputMap = this.jButtonActualizarTipoCalculo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoCalculo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoCalculoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoCalculo";
		inputMap = this.jButtonEliminarTipoCalculo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoCalculo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoCalculoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoCalculo";
		inputMap = this.jButtonCancelarTipoCalculo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoCalculo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoCalculoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoCalculo";
		inputMap = this.jButtonCerrarTipoCalculo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoCalculo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoCalculoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoCalculo.jButtonGuardarCambiosTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoCalculo";
		inputMap = this.jInternalFrameDetalleFormTipoCalculo.jButtonGuardarCambiosTipoCalculo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoCalculo.jButtonGuardarCambiosTipoCalculo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoCalculoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoCalculo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoCalculoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoCalculo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoCalculoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoCalculo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoCalculoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoCalculo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoCalculoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalculo.jButtonidTipoCalculoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCalculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalculo.jButtoncodigoTipoCalculoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCalculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalculo.jButtonnombreTipoCalculoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCalculoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoCalculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoCalculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoCalculoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoCalculo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoCalculo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoCalculo tipocalculoAux:this.tipocalculoLogic.getTipoCalculos()) {
					tipocalculoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCalculo tipocalculoAux:tipocalculos) {
					tipocalculoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoCalculoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCalculo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCalculo tipocalculoAux:this.tipocalculoLogic.getTipoCalculos()) {
						tipocalculoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCalculo tipocalculoAux:tipocalculos) {
						tipocalculoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoCalculo tipocalculoAux:this.tipocalculoLogic.getTipoCalculos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCalculo tipocalculoAux:tipocalculos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCalculo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCalculo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCalculo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCalculo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoCalculoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCalculo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoCalculo.getSelectedRows();
			
			TipoCalculo tipocalculoLocal=new TipoCalculo();
			
			//this.seleccionarTodosTipoCalculo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocalculoLocal =(TipoCalculo) this.tipocalculoLogic.getTipoCalculos().toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocalculoLocal =(TipoCalculo) this.tipocalculos.toArray()[this.jTableDatosTipoCalculo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocalculoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCalculo tipocalculoAux:this.tipocalculoLogic.getTipoCalculos()) {
						tipocalculoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCalculo tipocalculoAux:tipocalculos) {
						tipocalculoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoCalculo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCalculo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCalculo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCalculo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoCalculoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoCalculoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoCalculoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoCalculo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoCalculo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCalculo tipocalculoAux:this.tipocalculoLogic.getTipoCalculos()) {
				
						if(sTipoSeleccionar.equals(TipoCalculoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocalculoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCalculoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocalculoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCalculo tipocalculoAux:tipocalculos) {
					
						if(sTipoSeleccionar.equals(TipoCalculoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocalculoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCalculoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocalculoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCalculo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoCalculoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoCalculo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoCalculo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoCalculo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoCalculo.jComboBoxTiposAccionesFormularioTipoCalculo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoCalculo) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoCalculo(conSplash);
				
					this.generarReporteTipoCalculosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCalculo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCalculo.jComboBoxTiposAccionesFormularioTipoCalculo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoCalculosSeleccionados();
				//this.jComboBoxTiposAccionesTipoCalculo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCalculosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoCalculo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCalculosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoCalculo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCalculo();
				
				this.exportarTipoCalculosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCalculo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCalculo.jComboBoxTiposAccionesFormularioTipoCalculo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoCalculos();
				//this.importarTipoCalculos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCalculo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCalculo.jComboBoxTiposAccionesFormularioTipoCalculo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCalculo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoCalculosSeleccionados();
				//this.jComboBoxTiposAccionesTipoCalculo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Calculo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoCalculo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoCalculo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoCalculo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Calculo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCalculo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCalculo.jComboBoxTiposAccionesFormularioTipoCalculo.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoCalculo();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoCalculo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoCalculoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoCalculo();
			
			if(this.jInternalFrameDetalleFormTipoCalculo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoCalculo> tipocalculosSeleccionados=new ArrayList<TipoCalculo>();		
			TipoCalculo tipocalculo=new TipoCalculo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoCalculo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoCalculo.getSelectedItem();
			
			
			
			
			tipocalculosSeleccionados=this.getTipoCalculosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocalculosSeleccionados.size()==1) {
				for(TipoCalculo tipocalculoAux:tipocalculosSeleccionados) {
					tipocalculo=tipocalculoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoCalculo();
			
      		//this.finishProcessTipoCalculo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoCalculoReturnGeneral() throws Exception {
		if(this.tipocalculoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocalculoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocalculoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocalculoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocalculoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocalculoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoCalculo(false);
		}
		
		if(this.tipocalculoReturnGeneral.getConRetornoLista() || this.tipocalculoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocalculoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocalculoLogic.setTipoCalculos(this.tipocalculoReturnGeneral.getTipoCalculos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocalculoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocalculoLogic.setTipoCalculo(this.tipocalculoReturnGeneral.getTipoCalculo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoCalculo(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoCalculo() throws Exception {
		
		
	}
	
	public ArrayList<TipoCalculo> getTipoCalculosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoCalculo> tipocalculosSeleccionados=new ArrayList<TipoCalculo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoCalculo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoCalculo tipocalculoAux:tipocalculoLogic.getTipoCalculos()) {
					if(tipocalculoAux.getIsSelected()) {
						tipocalculosSeleccionados.add(tipocalculoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCalculo tipocalculoAux:this.tipocalculos) {
					if(tipocalculoAux.getIsSelected()) {
						tipocalculosSeleccionados.add(tipocalculoAux);				
					}
				}
			}
			
			if(tipocalculosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocalculosSeleccionados.addAll(this.tipocalculoLogic.getTipoCalculos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocalculosSeleccionados.addAll(this.tipocalculos);				
					}
				}
			}
		} else {
			tipocalculosSeleccionados.add(this.tipocalculo);
		}
		
		return tipocalculosSeleccionados;
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
	
	public void generarReporteTipoCalculosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoCalculosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoCalculosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCalculosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCalculosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Calculo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoCalculosSeleccionados() throws Exception {
		ArrayList<TipoCalculo> tipocalculosSeleccionados=new ArrayList<TipoCalculo>();		
		
		tipocalculosSeleccionados=this.getTipoCalculosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoCalculos("Todos",tipocalculosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoCalculosSeleccionados() throws Exception {
		ArrayList<TipoCalculo> tipocalculosSeleccionados=new ArrayList<TipoCalculo>();		
		
		tipocalculosSeleccionados=this.getTipoCalculosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoCalculos("Todos",tipocalculosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoCalculosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoCalculo> tipocalculosSeleccionados=new ArrayList<TipoCalculo>();
		
		tipocalculosSeleccionados=this.getTipoCalculosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoCalculos("Todos",tipocalculosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoCalculosSeleccionados() throws Exception {
		ArrayList<TipoCalculo> tipocalculosSeleccionados=new ArrayList<TipoCalculo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoCalculo();
		
		
		tipocalculosSeleccionados=this.getTipoCalculosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoCalculo();
		
		
		//this.generarReporteTipoCalculos("Todos",tipocalculosSeleccionados ,tipocalculoImplementable,tipocalculoImplementableHome);
	}
	
	public void mostrarImportacionTipoCalculos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoCalculo();
		
		this.abrirFrameImportacionTipoCalculo();		
		
			
		//this.generarReporteTipoCalculos("Todos",tipocalculosSeleccionados ,tipocalculoImplementable,tipocalculoImplementableHome);
	}
	
	public void importarTipoCalculos() throws Exception {		
	
	}
	
	public void exportarTipoCalculosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoCalculosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoCalculosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoCalculosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Calculo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoCalculosSeleccionados() throws Exception {
		ArrayList<TipoCalculo> tipocalculosSeleccionados=new ArrayList<TipoCalculo>();		
		
		tipocalculosSeleccionados=this.getTipoCalculosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocalculo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoCalculo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoCalculo tipocalculoAux:tipocalculosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoCalculo(tipocalculoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocalculoAux.setsDetalleGeneralEntityReporte(tipocalculoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Calculo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoCalculo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoCalculoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCalculoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCalculoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCalculoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoCalculo(TipoCalculo tipocalculo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocalculo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocalculo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocalculo.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocalculo.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoCalculosSeleccionados() throws Exception {
		ArrayList<TipoCalculo> tipocalculosSeleccionados=new ArrayList<TipoCalculo>();		
		
		tipocalculosSeleccionados=this.getTipoCalculosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocalculo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoCalculos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoCalculo(row);				
				iRow++;
			}				
			
			for(TipoCalculo tipocalculoAux:tipocalculosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoCalculo(tipocalculoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Calculo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoCalculosSeleccionados() throws Exception {
		ArrayList<TipoCalculo> tipocalculosSeleccionados=new ArrayList<TipoCalculo>();		
		
		tipocalculosSeleccionados=this.getTipoCalculosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocalculo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocalculos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocalculo");
			//elementRoot.appendChild(element);
		
			for(TipoCalculo tipocalculoAux:tipocalculosSeleccionados) {
				element = document.createElement("tipocalculo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoCalculo(tipocalculoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Calculo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoCalculo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCalculoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCalculoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoCalculoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCalculoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoCalculo(TipoCalculo tipocalculo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocalculo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocalculo.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocalculo.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoCalculo(TipoCalculo tipocalculo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoCalculoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocalculo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoCalculoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocalculo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoCalculoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipocalculo.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoCalculoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipocalculo.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoCalculosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoCalculo> tipocalculosSeleccionados=new ArrayList<TipoCalculo>();
		
		tipocalculosSeleccionados=this.getTipoCalculosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoCalculo(tipocalculosSeleccionados);
		
		this.generarReporteTipoCalculos("Todos",tipocalculosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoCalculo(ArrayList<TipoCalculo> tipocalculosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoCalculo tipocalculoAux:tipocalculosSeleccionados) {
				tipocalculoAux.setsDetalleGeneralEntityReporte(tipocalculoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoCalculoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipocalculoAux.setsDescripcionGeneralEntityReporte1(tipocalculoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoCalculoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipocalculoAux.setsDescripcionGeneralEntityReporte1(tipocalculoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoCalculo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoCalculo=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoCalculo=true;
				this.isVisibilidadCeldaGuardarCambiosTipoCalculo=true;
			}
			
			this.isVisibilidadCeldaModificarTipoCalculo=false;
			this.isVisibilidadCeldaActualizarTipoCalculo=false;
			this.isVisibilidadCeldaEliminarTipoCalculo=false;
			this.isVisibilidadCeldaCancelarTipoCalculo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCalculo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCalculo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoCalculo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCalculo=false;
			this.isVisibilidadCeldaModificarTipoCalculo=false;
			this.isVisibilidadCeldaActualizarTipoCalculo=true;
			this.isVisibilidadCeldaEliminarTipoCalculo=false;
			this.isVisibilidadCeldaCancelarTipoCalculo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCalculo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCalculo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoCalculo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCalculo=false;
			this.isVisibilidadCeldaModificarTipoCalculo=false;
			this.isVisibilidadCeldaActualizarTipoCalculo=true;
			this.isVisibilidadCeldaEliminarTipoCalculo=true;
			this.isVisibilidadCeldaCancelarTipoCalculo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCalculo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCalculo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoCalculo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCalculo=false;
			this.isVisibilidadCeldaModificarTipoCalculo=false;
			this.isVisibilidadCeldaActualizarTipoCalculo=true;
			this.isVisibilidadCeldaEliminarTipoCalculo=false;
			this.isVisibilidadCeldaCancelarTipoCalculo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCalculo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCalculo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoCalculo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCalculo=true;
			this.isVisibilidadCeldaModificarTipoCalculo=false;
			this.isVisibilidadCeldaActualizarTipoCalculo=false;
			this.isVisibilidadCeldaEliminarTipoCalculo=false;
			this.isVisibilidadCeldaCancelarTipoCalculo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCalculo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCalculo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoCalculo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCalculo=false;
			this.isVisibilidadCeldaActualizarTipoCalculo=false;
			this.isVisibilidadCeldaEliminarTipoCalculo=false;
			this.isVisibilidadCeldaCancelarTipoCalculo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCalculo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCalculo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoCalculo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCalculo=false;
			this.isVisibilidadCeldaModificarTipoCalculo=true;
			this.isVisibilidadCeldaActualizarTipoCalculo=false;
			this.isVisibilidadCeldaEliminarTipoCalculo=false;
			this.isVisibilidadCeldaCancelarTipoCalculo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCalculo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCalculo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoCalculoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoCalculo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCalculo=true;
		} else {
			this.actualizarEstadoPanelsTipoCalculo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoCalculo=false;
			//this.isVisibilidadCeldaVerFormTipoCalculo=false;
			this.isVisibilidadCeldaDuplicarTipoCalculo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocalculoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculo=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoCalculo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCalculo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocalculoSessionBean.getEsGuardarRelacionado()) {
			if(!tipocalculoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoCalculo=false;												
			}
			
			this.jButtonCerrarTipoCalculo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculo=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocalculo)) {
			this.isVisibilidadCeldaActualizarTipoCalculo=false;
			this.isVisibilidadCeldaEliminarTipoCalculo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCalculo() {
	}
	
	public void actualizarEstadoPanelsTipoCalculo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoCalculo!=null) {
				this.jScrollPanelDatosEdicionTipoCalculo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCalculo!=null) {
				this.jScrollPanelDatosTipoCalculo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCalculo!=null) {
				this.jPanelPaginacionTipoCalculo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCalculo!=null) {
				this.jPanelParametrosReportesTipoCalculo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoCalculo!=null) {
				this.jScrollPanelDatosEdicionTipoCalculo.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoCalculo!=null) {
				this.jScrollPanelDatosTipoCalculo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCalculo!=null) {
				this.jPanelPaginacionTipoCalculo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCalculo!=null) {
				this.jPanelParametrosReportesTipoCalculo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoCalculo!=null) {
				this.jScrollPanelDatosEdicionTipoCalculo.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoCalculo!=null) {
				this.jScrollPanelDatosTipoCalculo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCalculo!=null) {
				this.jPanelPaginacionTipoCalculo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCalculo!=null) {
				this.jPanelParametrosReportesTipoCalculo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoCalculo!=null) {
				this.jScrollPanelDatosEdicionTipoCalculo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCalculo!=null) {
				this.jScrollPanelDatosTipoCalculo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCalculo!=null) {
				this.jPanelPaginacionTipoCalculo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCalculo!=null) {
				this.jPanelParametrosReportesTipoCalculo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoCalculo!=null) {
				this.jScrollPanelDatosEdicionTipoCalculo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCalculo!=null) {
				this.jScrollPanelDatosTipoCalculo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCalculo!=null) {
				this.jPanelPaginacionTipoCalculo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCalculo!=null) {
				this.jPanelParametrosReportesTipoCalculo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoCalculo!=null) {
				this.jScrollPanelDatosEdicionTipoCalculo.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoCalculo!=null) {
				this.jScrollPanelDatosTipoCalculo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCalculo!=null) {
				this.jPanelPaginacionTipoCalculo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCalculo!=null) {
				this.jPanelParametrosReportesTipoCalculo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoCalculo!=null) {
				this.jScrollPanelDatosEdicionTipoCalculo.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoCalculo!=null) {
				this.jScrollPanelDatosTipoCalculo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCalculo!=null) {
				this.jPanelPaginacionTipoCalculo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCalculo!=null) {
				this.jPanelParametrosReportesTipoCalculo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoCalculoSessionBean tipocalculoSessionBean=new TipoCalculoSessionBean();
		
		if(this.tipocalculoSessionBean==null) {
			this.tipocalculoSessionBean=new TipoCalculoSessionBean();
		}
		
		this.tipocalculoSessionBean.setsUltimaBusquedaTipoCalculo(this.getsAccionBusqueda());
		this.tipocalculoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocalculoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoCalculoSessionBean tipocalculoSessionBean=new TipoCalculoSessionBean();
		
		if(this.tipocalculoSessionBean==null) {
			this.tipocalculoSessionBean=new TipoCalculoSessionBean();
		}
		
		if(this.tipocalculoSessionBean.getsUltimaBusquedaTipoCalculo()!=null&&!this.tipocalculoSessionBean.getsUltimaBusquedaTipoCalculo().equals("")) {
			this.setsAccionBusqueda(tipocalculoSessionBean.getsUltimaBusquedaTipoCalculo());
			this.setiNumeroPaginacion(tipocalculoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocalculoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipocalculoSessionBean.setsUltimaBusquedaTipoCalculo("");
		this.tipocalculoSessionBean.setiNumeroPaginacion(TipoCalculoConstantesFunciones.INUMEROPAGINACION);
		this.tipocalculoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoCalculo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoCalculo() {
		this.updateBorderResaltarBusquedasFormularioTipoCalculo();
		this.updateVisibilidadBusquedasFormularioTipoCalculo();
		this.updateHabilitarBusquedasFormularioTipoCalculo();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoCalculo() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoCalculo() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoCalculo() {
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
	
	public void updateControlesFormularioTipoCalculo() throws Exception {

		if(this.jInternalFrameDetalleFormTipoCalculo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoCalculo();
		this.updateVisibilidadResaltarControlesFormularioTipoCalculo();
		this.updateHabilitarResaltarControlesFormularioTipoCalculo();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoCalculo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCalculo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocalculoConstantesFunciones.resaltaridTipoCalculo!=null && this.jInternalFrameDetalleFormTipoCalculo!=null) {this.jInternalFrameDetalleFormTipoCalculo.jTextFieldidTipoCalculo.setBorder(this.tipocalculoConstantesFunciones.resaltaridTipoCalculo);}
		if(this.tipocalculoConstantesFunciones.resaltarcodigoTipoCalculo!=null && this.jInternalFrameDetalleFormTipoCalculo!=null) {this.jInternalFrameDetalleFormTipoCalculo.jTextFieldcodigoTipoCalculo.setBorder(this.tipocalculoConstantesFunciones.resaltarcodigoTipoCalculo);}
		if(this.tipocalculoConstantesFunciones.resaltarnombreTipoCalculo!=null && this.jInternalFrameDetalleFormTipoCalculo!=null) {this.jInternalFrameDetalleFormTipoCalculo.jTextAreanombreTipoCalculo.setBorder(this.tipocalculoConstantesFunciones.resaltarnombreTipoCalculo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoCalculo() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoCalculo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) {
	
		//this.jInternalFrameDetalleFormTipoCalculo.jTextFieldidTipoCalculo.setVisible(this.tipocalculoConstantesFunciones.mostraridTipoCalculo);
		this.jInternalFrameDetalleFormTipoCalculo.jPanelidTipoCalculo.setVisible(this.tipocalculoConstantesFunciones.mostraridTipoCalculo);
		//this.jInternalFrameDetalleFormTipoCalculo.jTextFieldcodigoTipoCalculo.setVisible(this.tipocalculoConstantesFunciones.mostrarcodigoTipoCalculo);
		this.jInternalFrameDetalleFormTipoCalculo.jPanelcodigoTipoCalculo.setVisible(this.tipocalculoConstantesFunciones.mostrarcodigoTipoCalculo);
		//this.jInternalFrameDetalleFormTipoCalculo.jTextAreanombreTipoCalculo.setVisible(this.tipocalculoConstantesFunciones.mostrarnombreTipoCalculo);
		this.jInternalFrameDetalleFormTipoCalculo.jPanelnombreTipoCalculo.setVisible(this.tipocalculoConstantesFunciones.mostrarnombreTipoCalculo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoCalculo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCalculo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCalculo!=null) {
	
		this.jInternalFrameDetalleFormTipoCalculo.jTextFieldidTipoCalculo.setEnabled(this.tipocalculoConstantesFunciones.activaridTipoCalculo);
		this.jInternalFrameDetalleFormTipoCalculo.jTextFieldcodigoTipoCalculo.setEnabled(this.tipocalculoConstantesFunciones.activarcodigoTipoCalculo);
		this.jInternalFrameDetalleFormTipoCalculo.jTextAreanombreTipoCalculo.setEnabled(this.tipocalculoConstantesFunciones.activarnombreTipoCalculo);
		}
	}
	
		
}