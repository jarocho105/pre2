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

import com.bydan.erp.nomina.util.TipoBancoDiscoConstantesFunciones;
import com.bydan.erp.nomina.util.TipoBancoDiscoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoBancoDiscoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoBancoDiscoBean;
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
public class TipoBancoDiscoBeanSwingJInternalFrame extends TipoBancoDiscoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoBancoDiscoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoBancoDisco> tipobancodiscoValidator = new ClassValidator<TipoBancoDisco>(TipoBancoDisco.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoBancoDisco tipobancodisco;	
	public TipoBancoDisco tipobancodiscoAux;
	public TipoBancoDisco tipobancodiscoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoBancoDisco tipobancodiscoTotales;
	public Long idTipoBancoDiscoActual;
	public Long iIdNuevoTipoBancoDisco=0L;
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
	
	public Boolean isPermisoTodoTipoBancoDisco;
	public Boolean isPermisoNuevoTipoBancoDisco;
	public Boolean isPermisoActualizarTipoBancoDisco;
	public Boolean isPermisoActualizarOriginalTipoBancoDisco;
	public Boolean isPermisoEliminarTipoBancoDisco;
	public Boolean isPermisoGuardarCambiosTipoBancoDisco;
	public Boolean isPermisoConsultaTipoBancoDisco;
	public Boolean isPermisoBusquedaTipoBancoDisco;
	public Boolean isPermisoReporteTipoBancoDisco;
	public Boolean isPermisoPaginacionMedioTipoBancoDisco;
	public Boolean isPermisoPaginacionAltoTipoBancoDisco;
	public Boolean isPermisoPaginacionTodoTipoBancoDisco;
	public Boolean isPermisoCopiarTipoBancoDisco;
	public Boolean isPermisoVerFormTipoBancoDisco;
	public Boolean isPermisoDuplicarTipoBancoDisco;
	public Boolean isPermisoOrdenTipoBancoDisco;
	
	
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
	
	public TipoBancoDiscoParameterReturnGeneral tipobancodiscoReturnGeneral;
	public TipoBancoDiscoParameterReturnGeneral tipobancodiscoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoBancoDisco=false;
	public Boolean esParaAccionDesdeFormularioTipoBancoDisco=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoBancoDiscoLogic tipobancodiscoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoBancoDisco tipobancodiscoBean;
	public TipoBancoDiscoConstantesFunciones tipobancodiscoConstantesFunciones;
	//public TipoBancoDiscoParameterReturnGeneral tipobancodiscoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoBancoDisco> tipobancodiscos;	
	//public List<TipoBancoDisco> tipobancodiscosEliminados;
	//public List<TipoBancoDisco> tipobancodiscosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoBancoDisco=false;
	public Boolean isVisibilidadCeldaDuplicarTipoBancoDisco=true;
	public Boolean isVisibilidadCeldaCopiarTipoBancoDisco=true;
	public Boolean isVisibilidadCeldaVerFormTipoBancoDisco=true;
	public Boolean isVisibilidadCeldaOrdenTipoBancoDisco=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoBancoDisco=false;
	public Boolean isVisibilidadCeldaModificarTipoBancoDisco=false;
	public Boolean isVisibilidadCeldaActualizarTipoBancoDisco=false;
	public Boolean isVisibilidadCeldaEliminarTipoBancoDisco=false;
	public Boolean isVisibilidadCeldaCancelarTipoBancoDisco=false;
	public Boolean isVisibilidadCeldaGuardarTipoBancoDisco=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoBancoDisco=false;	
	
	
	
	public Long getiIdNuevoTipoBancoDisco() {
		return this.iIdNuevoTipoBancoDisco;
	}

	public void setiIdNuevoTipoBancoDisco(Long iIdNuevoTipoBancoDisco) {
		this.iIdNuevoTipoBancoDisco = iIdNuevoTipoBancoDisco;
	}
	
	public Long getidTipoBancoDiscoActual() {
		return this.idTipoBancoDiscoActual;
	}

	public void setidTipoBancoDiscoActual(Long idTipoBancoDiscoActual) {
		this.idTipoBancoDiscoActual = idTipoBancoDiscoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoBancoDisco gettipobancodisco() {
		return this.tipobancodisco;
	}

	public void settipobancodisco(TipoBancoDisco tipobancodisco) {
		this.tipobancodisco = tipobancodisco;
	}
	
	public TipoBancoDisco gettipobancodiscoAux() {
		return this.tipobancodiscoAux;
	}

	public void settipobancodiscoAux(TipoBancoDisco tipobancodiscoAux) {
		this.tipobancodiscoAux = tipobancodiscoAux;
	}				
	
	public TipoBancoDisco gettipobancodiscoAnterior() {
		return this.tipobancodiscoAnterior;
	}

	public void settipobancodiscoAnterior(TipoBancoDisco tipobancodiscoAnterior) {
		this.tipobancodiscoAnterior = tipobancodiscoAnterior;
	}	
	
	public TipoBancoDisco gettipobancodiscoTotales() {
		return this.tipobancodiscoTotales;
	}

	public void settipobancodiscoTotales(TipoBancoDisco tipobancodiscoTotales) {
		this.tipobancodiscoTotales = tipobancodiscoTotales;
	}	
	
	public TipoBancoDisco gettipobancodiscoBean() {
		return this.tipobancodiscoBean;
	}

	public void settipobancodiscoBean(TipoBancoDisco tipobancodiscoBean) {
		this.tipobancodiscoBean = tipobancodiscoBean;
	}	
	
	public TipoBancoDiscoParameterReturnGeneral gettipobancodiscoReturnGeneral() {
		return this.tipobancodiscoReturnGeneral;
	}

	public void settipobancodiscoReturnGeneral(TipoBancoDiscoParameterReturnGeneral tipobancodiscoReturnGeneral) {
		this.tipobancodiscoReturnGeneral = tipobancodiscoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoBancoDiscoLogic getTipoBancoDiscoLogic()	{		
		return tipobancodiscoLogic;
	}

	public void setTipoBancoDiscoLogic(TipoBancoDiscoLogic tipobancodiscoLogic) {
		this.tipobancodiscoLogic = tipobancodiscoLogic;
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
	
	public Boolean getIsEsNuevoTipoBancoDisco() {
		return isEsNuevoTipoBancoDisco;
	}

	public void setIsEsNuevoTipoBancoDisco(Boolean isEsNuevoTipoBancoDisco) {
		this.isEsNuevoTipoBancoDisco = isEsNuevoTipoBancoDisco;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoBancoDisco() {
		return esParaAccionDesdeFormularioTipoBancoDisco;
	}
	
	public void setEsParaAccionDesdeFormularioTipoBancoDisco(Boolean esParaAccionDesdeFormularioTipoBancoDisco) {
		this.esParaAccionDesdeFormularioTipoBancoDisco = esParaAccionDesdeFormularioTipoBancoDisco;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoBancoDisco() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoBancoDiscoConstantesFunciones.refrescarForeignKeysDescripcionesTipoBancoDisco(this.tipobancodiscoLogic.getTipoBancoDiscos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoBancoDiscoConstantesFunciones.refrescarForeignKeysDescripcionesTipoBancoDisco(this.tipobancodiscos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipobancodiscoLogic.setTipoBancoDiscos(this.tipobancodiscos);
			tipobancodiscoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoBancoDiscoParameterReturnGeneral getTipoBancoDiscoParameterGeneral() {
		return this.tipobancodiscoParameterGeneral;
	}
	
	public void setTipoBancoDiscoParameterGeneral(TipoBancoDiscoParameterReturnGeneral tipobancodiscoParameterGeneral) {
		this.tipobancodiscoParameterGeneral = tipobancodiscoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoBancoDisco() {
		return isPermisoTodoTipoBancoDisco;
	}

	public void setIsPermisoTodoTipoBancoDisco(Boolean isPermisoTodoTipoBancoDisco) {
		this.isPermisoTodoTipoBancoDisco = isPermisoTodoTipoBancoDisco;
	}

	public Boolean getIsPermisoNuevoTipoBancoDisco() {
		return isPermisoNuevoTipoBancoDisco;
	}

	public void setIsPermisoNuevoTipoBancoDisco(Boolean isPermisoNuevoTipoBancoDisco) {
		this.isPermisoNuevoTipoBancoDisco = isPermisoNuevoTipoBancoDisco;
	}

	public Boolean getIsPermisoActualizarTipoBancoDisco() {
		return isPermisoActualizarTipoBancoDisco;
	}

	public void setIsPermisoActualizarTipoBancoDisco(Boolean isPermisoActualizarTipoBancoDisco) {
		this.isPermisoActualizarTipoBancoDisco = isPermisoActualizarTipoBancoDisco;
	}

	public Boolean getIsPermisoEliminarTipoBancoDisco() {
		return isPermisoEliminarTipoBancoDisco;
	}

	public void setIsPermisoEliminarTipoBancoDisco(Boolean isPermisoEliminarTipoBancoDisco) {
		this.isPermisoEliminarTipoBancoDisco = isPermisoEliminarTipoBancoDisco;
	}

	public Boolean getIsPermisoGuardarCambiosTipoBancoDisco() {
		return isPermisoGuardarCambiosTipoBancoDisco;
	}

	public void setIsPermisoGuardarCambiosTipoBancoDisco(Boolean isPermisoGuardarCambiosTipoBancoDisco) {
		this.isPermisoGuardarCambiosTipoBancoDisco = isPermisoGuardarCambiosTipoBancoDisco;
	}
	
	public Boolean getIsPermisoConsultaTipoBancoDisco() {
		return isPermisoConsultaTipoBancoDisco;
	}

	public void setIsPermisoConsultaTipoBancoDisco(Boolean isPermisoConsultaTipoBancoDisco) {
		this.isPermisoConsultaTipoBancoDisco = isPermisoConsultaTipoBancoDisco;
	}

	public Boolean getIsPermisoBusquedaTipoBancoDisco() {
		return isPermisoBusquedaTipoBancoDisco;
	}

	public void setIsPermisoBusquedaTipoBancoDisco(Boolean isPermisoBusquedaTipoBancoDisco) {
		this.isPermisoBusquedaTipoBancoDisco = isPermisoBusquedaTipoBancoDisco;
	}

	public Boolean getIsPermisoReporteTipoBancoDisco() {
		return isPermisoReporteTipoBancoDisco;
	}

	public void setIsPermisoReporteTipoBancoDisco(Boolean isPermisoReporteTipoBancoDisco) {
		this.isPermisoReporteTipoBancoDisco = isPermisoReporteTipoBancoDisco;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoBancoDisco() {
		return isPermisoPaginacionMedioTipoBancoDisco;
	}

	public void setIsPermisoPaginacionMedioTipoBancoDisco(Boolean isPermisoPaginacionMedioTipoBancoDisco) {
		this.isPermisoPaginacionMedioTipoBancoDisco = isPermisoPaginacionMedioTipoBancoDisco;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoBancoDisco() {
		return isPermisoPaginacionTodoTipoBancoDisco;
	}

	public void setIsPermisoPaginacionTodoTipoBancoDisco(Boolean isPermisoPaginacionTodoTipoBancoDisco) {
		this.isPermisoPaginacionTodoTipoBancoDisco = isPermisoPaginacionTodoTipoBancoDisco;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoBancoDisco() {
		return isPermisoPaginacionAltoTipoBancoDisco;
	}

	public void setIsPermisoPaginacionAltoTipoBancoDisco(Boolean isPermisoPaginacionAltoTipoBancoDisco) {
		this.isPermisoPaginacionAltoTipoBancoDisco = isPermisoPaginacionAltoTipoBancoDisco;
	}
	
	public Boolean getIsPermisoCopiarTipoBancoDisco() {
		return isPermisoCopiarTipoBancoDisco;
	}

	public void setIsPermisoCopiarTipoBancoDisco(Boolean isPermisoCopiarTipoBancoDisco) {
		this.isPermisoCopiarTipoBancoDisco = isPermisoCopiarTipoBancoDisco;
	}
	
	public Boolean getIsPermisoVerFormTipoBancoDisco() {
		return isPermisoVerFormTipoBancoDisco;
	}

	public void setIsPermisoVerFormTipoBancoDisco(Boolean isPermisoVerFormTipoBancoDisco) {
		this.isPermisoVerFormTipoBancoDisco = isPermisoVerFormTipoBancoDisco;
	}
	
	public Boolean getIsPermisoDuplicarTipoBancoDisco() {
		return isPermisoDuplicarTipoBancoDisco;
	}

	public void setIsPermisoDuplicarTipoBancoDisco(Boolean isPermisoDuplicarTipoBancoDisco) {
		this.isPermisoDuplicarTipoBancoDisco = isPermisoDuplicarTipoBancoDisco;
	}
	
	public Boolean getIsPermisoOrdenTipoBancoDisco() {
		return isPermisoOrdenTipoBancoDisco;
	}

	public void setIsPermisoOrdenTipoBancoDisco(Boolean isPermisoOrdenTipoBancoDisco) {
		this.isPermisoOrdenTipoBancoDisco = isPermisoOrdenTipoBancoDisco;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoBancoDisco() {
		return isVisibilidadCeldaNuevoTipoBancoDisco;
	}

	public void setIsVisibilidadCeldaNuevoTipoBancoDisco(Boolean isVisibilidadCeldaNuevoTipoBancoDisco) {
		this.isVisibilidadCeldaNuevoTipoBancoDisco = isVisibilidadCeldaNuevoTipoBancoDisco;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoBancoDisco() {
		return isVisibilidadCeldaDuplicarTipoBancoDisco;
	}

	public void setIsVisibilidadCeldaDuplicarTipoBancoDisco(Boolean isVisibilidadCeldaDuplicarTipoBancoDisco) {
		this.isVisibilidadCeldaDuplicarTipoBancoDisco = isVisibilidadCeldaDuplicarTipoBancoDisco;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoBancoDisco() {
		return isVisibilidadCeldaCopiarTipoBancoDisco;
	}

	public void setIsVisibilidadCeldaCopiarTipoBancoDisco(Boolean isVisibilidadCeldaCopiarTipoBancoDisco) {
		this.isVisibilidadCeldaCopiarTipoBancoDisco = isVisibilidadCeldaCopiarTipoBancoDisco;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoBancoDisco() {
		return isVisibilidadCeldaVerFormTipoBancoDisco;
	}

	public void setIsVisibilidadCeldaVerFormTipoBancoDisco(Boolean isVisibilidadCeldaVerFormTipoBancoDisco) {
		this.isVisibilidadCeldaVerFormTipoBancoDisco = isVisibilidadCeldaVerFormTipoBancoDisco;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoBancoDisco() {
		return isVisibilidadCeldaOrdenTipoBancoDisco;
	}

	public void setIsVisibilidadCeldaOrdenTipoBancoDisco(Boolean isVisibilidadCeldaOrdenTipoBancoDisco) {
		this.isVisibilidadCeldaOrdenTipoBancoDisco = isVisibilidadCeldaOrdenTipoBancoDisco;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoBancoDisco() {
		return isVisibilidadCeldaNuevoRelacionesTipoBancoDisco;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoBancoDisco(Boolean isVisibilidadCeldaNuevoRelacionesTipoBancoDisco) {
		this.isVisibilidadCeldaNuevoRelacionesTipoBancoDisco = isVisibilidadCeldaNuevoRelacionesTipoBancoDisco;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoBancoDisco() {
		return isVisibilidadCeldaModificarTipoBancoDisco;
	}

	public void setIsVisibilidadCeldaModificarTipoBancoDisco(Boolean isVisibilidadCeldaModificarTipoBancoDisco) {
		this.isVisibilidadCeldaModificarTipoBancoDisco = isVisibilidadCeldaModificarTipoBancoDisco;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoBancoDisco() {
		return isVisibilidadCeldaActualizarTipoBancoDisco;
	}

	public void setIsVisibilidadCeldaActualizarTipoBancoDisco(Boolean isVisibilidadCeldaActualizarTipoBancoDisco) {
		this.isVisibilidadCeldaActualizarTipoBancoDisco = isVisibilidadCeldaActualizarTipoBancoDisco;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoBancoDisco() {
		return isVisibilidadCeldaEliminarTipoBancoDisco;
	}

	public void setIsVisibilidadCeldaEliminarTipoBancoDisco(Boolean isVisibilidadCeldaEliminarTipoBancoDisco) {
		this.isVisibilidadCeldaEliminarTipoBancoDisco = isVisibilidadCeldaEliminarTipoBancoDisco;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoBancoDisco() {
		return isVisibilidadCeldaCancelarTipoBancoDisco;
	}

	public void setIsVisibilidadCeldaCancelarTipoBancoDisco(Boolean isVisibilidadCeldaCancelarTipoBancoDisco) {
		this.isVisibilidadCeldaCancelarTipoBancoDisco = isVisibilidadCeldaCancelarTipoBancoDisco;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoBancoDisco() {
		return isVisibilidadCeldaGuardarTipoBancoDisco;
	}

	public void setIsVisibilidadCeldaGuardarTipoBancoDisco(Boolean isVisibilidadCeldaGuardarTipoBancoDisco) {
		this.isVisibilidadCeldaGuardarTipoBancoDisco = isVisibilidadCeldaGuardarTipoBancoDisco;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoBancoDisco() {
		return isVisibilidadCeldaGuardarCambiosTipoBancoDisco;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoBancoDisco(Boolean isVisibilidadCeldaGuardarCambiosTipoBancoDisco) {
		this.isVisibilidadCeldaGuardarCambiosTipoBancoDisco = isVisibilidadCeldaGuardarCambiosTipoBancoDisco;
	}
		
	public TipoBancoDiscoSessionBean gettipobancodiscoSessionBean() {
		return this.tipobancodiscoSessionBean;
	}
	
	public void settipobancodiscoSessionBean(TipoBancoDiscoSessionBean tipobancodiscoSessionBean) {
		this.tipobancodiscoSessionBean=tipobancodiscoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoBancoDisco(TipoBancoDisco tipobancodisco)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoBancoDisco tipobancodisco,TipoBancoDisco tipobancodiscoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoBancoDisco(tipobancodisco);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipobancodiscoAux.setId(tipobancodisco.getId());
		tipobancodiscoAux.setVersionRow(tipobancodisco.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoBancoDisco();
		
			int intSelectedRow = this.jTableDatosTipoBancoDisco.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscoLogic.getTipoBancoDiscos().toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscos.toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoBancoDiscoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoBancoDisco(this.tipobancodisco,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoDisco(this.tipobancodisco);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipobancodiscoValidator.getInvalidValues(this.tipobancodisco);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipobancodiscoLogic.setDatosCliente(datosCliente);
			tipobancodiscoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipobancodiscoAux=new  TipoBancoDisco();
				
				tipobancodiscoAux.setIsNew(true);
				tipobancodiscoAux.setIsChanged(true);
				
				tipobancodiscoAux.setTipoBancoDiscoOriginal(this.tipobancodisco);
				
				tipobancodiscoAux.setId(this.tipobancodisco.getId());	
				tipobancodiscoAux.setVersionRow(this.tipobancodisco.getVersionRow());	
				tipobancodiscoAux.setcodigo(this.tipobancodisco.getcodigo());	
				tipobancodiscoAux.setnombre(this.tipobancodisco.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipobancodiscoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipobancodiscoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipobancodiscoAux,tipobancodiscoLogic.getTipoBancoDiscos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipobancodiscoAux,tipobancodiscos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipobancodiscoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipobancodiscoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancodiscoLogic.saveTipoBancoDiscos();//WithConnection
						//tipobancodiscoLogic.getSetVersionRowTipoBancoDiscos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipobancodisco,tipobancodiscoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipobancodiscoAux=new  TipoBancoDisco();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipobancodiscoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipobancodiscoSessionBean.getEsGuardarRelacionado() && this.tipobancodisco.getId()>=0)) {
						
					tipobancodiscoAux.setIsNew(false);
				}
				
				tipobancodiscoAux.setIsDeleted(false);
			
				tipobancodiscoAux.setId(this.tipobancodisco.getId());	
				tipobancodiscoAux.setVersionRow(this.tipobancodisco.getVersionRow());	
				tipobancodiscoAux.setcodigo(this.tipobancodisco.getcodigo());	
				tipobancodiscoAux.setnombre(this.tipobancodisco.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipobancodiscoAux,tipobancodiscoLogic.getTipoBancoDiscos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipobancodiscoAux,tipobancodiscos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipobancodiscoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipobancodiscoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancodiscoLogic.saveTipoBancoDiscos();//WithConnection
						//tipobancodiscoLogic.getSetVersionRowTipoBancoDiscos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipobancodisco,tipobancodiscoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipobancodiscoAux=new  TipoBancoDisco();
				
				tipobancodiscoAux.setIsNew(false);
				tipobancodiscoAux.setIsChanged(false);
				
				tipobancodiscoAux.setIsDeleted(true);
				
				tipobancodiscoAux.setId(this.tipobancodisco.getId());	
				tipobancodiscoAux.setVersionRow(this.tipobancodisco.getVersionRow());	
				tipobancodiscoAux.setcodigo(this.tipobancodisco.getcodigo());	
				tipobancodiscoAux.setnombre(this.tipobancodisco.getnombre());	
				
				if(this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipobancodiscoAux.getId()>=0) {	
						this.tipobancodiscosEliminados.add(tipobancodiscoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipobancodiscoAux,tipobancodiscoLogic.getTipoBancoDiscos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipobancodiscoAux,tipobancodiscos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipobancodiscoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipobancodiscoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancodiscoLogic.saveTipoBancoDiscos();//WithConnection
						//tipobancodiscoLogic.getSetVersionRowTipoBancoDiscos();//WithConnection
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
					this.tipobancodiscoLogic.getTipoBancoDiscos().addAll(this.tipobancodiscosEliminados);
					
					tipobancodiscoLogic.saveTipoBancoDiscos();//WithConnection
					//tipobancodiscoLogic.getSetVersionRowTipoBancoDiscos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipobancodiscosEliminados= new ArrayList<TipoBancoDisco>();		
			}
			
			if(this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Banco Disco GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Banco Disco",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipobancodisco=tipobancodiscoAux;
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
      		//this.finishProcessTipoBancoDisco();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoBancoDisco tipobancodiscoLocal) throws Exception {
		
		if(this.tipobancodiscoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoBancoDisco tipobancodiscoLocal) throws Exception {	
		if(this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoBancoDiscoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoBancoDisco.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscoLogic.getTipoBancoDiscos().toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscos.toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipobancodiscoValidator.getInvalidValues(this.tipobancodisco);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoBancoDisco tipobancodisco,List<TipoBancoDisco> tipobancodiscos) throws Exception {
		try	{		
			TipoBancoDiscoConstantesFunciones.actualizarLista(tipobancodisco,tipobancodiscos,this.tipobancodiscoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoBancoDisco tipobancodisco,List<TipoBancoDisco> tipobancodiscos) throws Exception {
		try	{			
			TipoBancoDiscoConstantesFunciones.actualizarSelectedLista(tipobancodisco,tipobancodiscos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoBancoDisco> tipobancodiscosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipobancodiscosLocal=this.tipobancodiscoLogic.getTipoBancoDiscos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipobancodiscosLocal=this.tipobancodiscos;
			}
			//ARCHITECTURE
		
			for(TipoBancoDisco tipobancodiscoLocal:tipobancodiscosLocal) {
				if(this.permiteMantenimiento(tipobancodiscoLocal) && tipobancodiscoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoBancoDiscoConstantesFunciones.getTipoBancoDiscoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoBancoDiscoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBancoDisco.jLabelcodigoTipoBancoDisco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoBancoDiscoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBancoDisco.jLabelnombreTipoBancoDisco,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoBancoDisco.jLabelcodigoTipoBancoDisco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoBancoDisco.jLabelnombreTipoBancoDisco,"");
		
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
		this.iIdNuevoTipoBancoDisco--;	
		
		
		this.tipobancodiscoAux=new TipoBancoDisco();
		
		this.tipobancodiscoAux.setId(this.iIdNuevoTipoBancoDisco);
		this.tipobancodiscoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipobancodiscoLogic.getTipoBancoDiscos().add(this.tipobancodiscoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipobancodiscos.add(this.tipobancodiscoAux);
		}
		//ARCHITECTURE
		
		this.tipobancodisco=this.tipobancodiscoAux;
		
		if(TipoBancoDiscoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoBancoDisco(this.tipobancodisco);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoBancoDisco(this.tipobancodisco);
		}
				
		//this.setDefaultControlesTipoBancoDisco();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoBancoDisco();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoBancoDisco();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoBancoDisco();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoBancoDisco(this.tipobancodiscoBean,this.tipobancodisco,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoDisco(this.tipobancodisco);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipobancodiscoSessionBean.getConGuardarRelaciones()) {
			classes=TipoBancoDiscoConstantesFunciones.getClassesRelationshipsOfTipoBancoDisco(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipobancodiscoReturnGeneral=tipobancodiscoLogic.procesarEventosTipoBancoDiscosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipobancodiscoLogic.getTipoBancoDiscos(),this.tipobancodisco,this.tipobancodiscoParameterGeneral,this.isEsNuevoTipoBancoDisco,classes);//this.tipobancodiscoLogic.getTipoBancoDisco()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoBancoDisco(this.tipobancodiscoReturnGeneral,this.tipobancodiscoBean,false);
		
		if(this.tipobancodiscoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoBancoDisco(this.tipobancodiscoReturnGeneral.getTipoBancoDisco());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoBancoDisco(this.tipobancodiscoReturnGeneral.getTipoBancoDisco());
		}
		
		if(this.tipobancodiscoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoBancoDisco(this.tipobancodiscoReturnGeneral.getTipoBancoDisco(),classes);//this.tipobancodiscoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoBancoDisco(this.tipobancodisco,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoBancoDisco();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoBancoDisco();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoBancoDisco(false);
						
			if(tipobancodiscoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoBancoDiscoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoBancoDisco();
			}
			
			this.actualizarVisualTableDatosTipoBancoDisco();
			
			this.jTableDatosTipoBancoDisco.setRowSelectionInterval(this.getIndiceNuevoTipoBancoDisco(), this.getIndiceNuevoTipoBancoDisco());
			
			this.seleccionarFilaTablaTipoBancoDiscoActual();
						
			this.actualizarEstadoCeldasBotonesTipoBancoDisco("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoBancoDisco(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoBancoDisco.jTextFieldcodigoTipoBancoDisco.setEnabled(isHabilitar && this.tipobancodiscoConstantesFunciones.activarcodigoTipoBancoDisco);
		this.jInternalFrameDetalleFormTipoBancoDisco.jTextAreanombreTipoBancoDisco.setEnabled(isHabilitar && this.tipobancodiscoConstantesFunciones.activarnombreTipoBancoDisco);	
		
	};
	
	public void setDefaultControlesTipoBancoDisco() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoBancoDisco(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipobancodiscoSessionBean.setConGuardarRelaciones(true);			
			this.tipobancodiscoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoBancoDisco.jTabbedPaneRelacionesTipoBancoDisco.setVisible(true);
			
					
		} else {
			//this.tipobancodiscoSessionBean.setConGuardarRelaciones(false);			
			this.tipobancodiscoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoBancoDisco.jTabbedPaneRelacionesTipoBancoDisco.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoBancoDisco() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBancoDisco tipobancodiscoAux:this.tipobancodiscoLogic.getTipoBancoDiscos()) {
				if(tipobancodiscoAux.getId().equals(this.iIdNuevoTipoBancoDisco)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBancoDisco tipobancodiscoAux:this.tipobancodiscos) {
				if(tipobancodiscoAux.getId().equals(this.iIdNuevoTipoBancoDisco)) {
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
	
	public int getIndiceActualTipoBancoDisco(TipoBancoDisco tipobancodisco,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBancoDisco tipobancodiscoAux:this.tipobancodiscoLogic.getTipoBancoDiscos()) {
				if(tipobancodiscoAux.getId().equals(tipobancodisco.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBancoDisco tipobancodiscoAux:this.tipobancodiscos) {
				if(tipobancodiscoAux.getId().equals(tipobancodisco.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoBancoDisco(TipoBancoDisco tipobancodiscoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBancoDisco tipobancodiscoAux:this.tipobancodiscoLogic.getTipoBancoDiscos()) {
				if(tipobancodiscoAux.getTipoBancoDiscoOriginal().getId().equals(tipobancodiscoOriginal.getId())) {
					existe=true;
					tipobancodiscoOriginal.setId(tipobancodiscoAux.getId());
					tipobancodiscoOriginal.setVersionRow(tipobancodiscoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBancoDisco tipobancodiscoAux:this.tipobancodiscos) {
				if(tipobancodiscoAux.getTipoBancoDiscoOriginal().getId().equals(tipobancodiscoOriginal.getId())) {
					existe=true;
					tipobancodiscoOriginal.setId(tipobancodiscoAux.getId());
					tipobancodiscoOriginal.setVersionRow(tipobancodiscoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoBancoDisco(Boolean esParaCancelar) throws Exception {
		tipobancodiscosAux=new ArrayList<TipoBancoDisco>();
		tipobancodiscoAux=new TipoBancoDisco();
		
		if(!this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoBancoDisco tipobancodiscoAux:this.tipobancodiscoLogic.getTipoBancoDiscos()) {
					if(tipobancodiscoAux.getId()<0) {
						tipobancodiscosAux.add(tipobancodiscoAux);
					}		
				}
				this.iIdNuevoTipoBancoDisco=0L;
				this.tipobancodiscoLogic.getTipoBancoDiscos().removeAll(tipobancodiscosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoBancoDisco tipobancodiscoAux:this.tipobancodiscos) {
					if(tipobancodiscoAux.getId()<0) {
						tipobancodiscosAux.add(tipobancodiscoAux);
					}		
				}
				this.iIdNuevoTipoBancoDisco=0L;
				this.tipobancodiscos.removeAll(tipobancodiscosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoBancoDisco 
					&& this.tipobancodiscoLogic.getTipoBancoDiscos().size()>0
					) {
					tipobancodiscoAux=this.tipobancodiscoLogic.getTipoBancoDiscos().get(this.tipobancodiscoLogic.getTipoBancoDiscos().size() - 1);
				
					if(tipobancodiscoAux.getId()<0) {
						this.tipobancodiscoLogic.getTipoBancoDiscos().remove(tipobancodiscoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoBancoDisco && this.tipobancodiscos.size()>0) {
					tipobancodiscoAux=this.tipobancodiscos.get(this.tipobancodiscos.size() - 1);
				
					if(tipobancodiscoAux.getId()<0) {
						this.tipobancodiscos.remove(tipobancodiscoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoBancoDisco(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipobancodisco.getId()<0) {
				this.tipobancodiscoLogic.getTipoBancoDiscos().remove(this.tipobancodisco);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipobancodisco.getId()<0) {
				this.tipobancodiscos.remove(this.tipobancodisco);
			}
		}			
	}
	
	public void setEstadosInicialesTipoBancoDisco(List<TipoBancoDisco> tipobancodiscosAux) throws Exception {
		TipoBancoDiscoConstantesFunciones.setEstadosInicialesTipoBancoDisco(tipobancodiscosAux);
	}
	
	public void setEstadosInicialesTipoBancoDisco(TipoBancoDisco tipobancodiscoAux) throws Exception {
		TipoBancoDiscoConstantesFunciones.setEstadosInicialesTipoBancoDisco(tipobancodiscoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoBancoDiscoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoBancoDisco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoBancoDiscoActual()) {
				if(!this.isEsNuevoTipoBancoDisco) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoBancoDisco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoBancoDisco=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoBancoDiscoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Banco Disco ?", "MANTENIMIENTO DE Tipo Banco Disco", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoBancoDisco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoBancoDisco tipobancodisco) throws Exception {
		TipoBancoDiscoConstantesFunciones.seleccionarAsignar(this.tipobancodisco,tipobancodisco);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoBancoDisco=this.isPermisoActualizarOriginalTipoBancoDisco;
			
			
			this.seleccionarAsignar(tipobancodisco);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoBancoDiscoConstantesFunciones.quitarEspaciosTipoBancoDisco(this.tipobancodisco,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoBancoDisco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipobancodiscoSessionBean.setsFuncionBusquedaRapida(this.tipobancodiscoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoBancoDisco) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoBancoDisco(esParaCancelar);				
				this.cancelarNuevoTipoBancoDisco(esParaCancelar);								
			}
			
			this.tipobancodisco=new TipoBancoDisco();
			
			this.inicializarTipoBancoDisco();
			
			this.actualizarEstadoCeldasBotonesTipoBancoDisco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoBancoDisco() throws Exception {
		try {
			TipoBancoDiscoConstantesFunciones.inicializarTipoBancoDisco(this.tipobancodisco);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipobancodiscoLogic.getTipoBancoDiscos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoBancoDiscos(String sAccionBusqueda,List<TipoBancoDisco> tipobancodiscosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoBancoDisco"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoBancoDiscoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoBancoDiscoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoBancoDisco"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Banco Discos");		
		parameters.put("busquedapor", TipoBancoDiscoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoBancoDisco=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoBancoDiscoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoBancoDiscoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoBancoDisco=new JRBeanArrayDataSource(TipoBancoDiscoJInternalFrame.TraerTipoBancoDiscoBeans(tipobancodiscosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoBancoDisco);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoBancoDiscoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoBancoDiscoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoBancoDiscoBean.TraerTipoBancoDiscoBeans(tipobancodiscosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoBancoDiscos(sAccionBusqueda,sTipoArchivoReporte,tipobancodiscosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoBancoDiscos(sAccionBusqueda,sTipoArchivoReporte,tipobancodiscosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoBancoDiscoActionPerformed(null);
					//this.generarExcelReporteTipoBancoDiscos(sAccionBusqueda,sTipoArchivoReporte,tipobancodiscosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoBancoDiscos(sAccionBusqueda,sTipoArchivoReporte,tipobancodiscosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoBancoDiscos(sAccionBusqueda,sTipoArchivoReporte,tipobancodiscosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoBancoDiscos(sAccionBusqueda,sTipoArchivoReporte,tipobancodiscosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoBancoDiscos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoBancoDisco> tipobancodiscosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobancodisco";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoBancoDiscos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoBancoDisco("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoBancoDisco tipobancodisco : tipobancodiscosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoBancoDiscoConstantesFunciones.generarExcelReporteDataTipoBancoDisco("NORMAL",row,workbook,tipobancodisco,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco Disco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoBancoDisco(String sTipo,Row row,Workbook workbook) {
		
		TipoBancoDiscoConstantesFunciones.generarExcelReporteHeaderTipoBancoDisco(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoBancoDiscos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoBancoDisco> tipobancodiscosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobancodisco_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoBancoDiscos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoBancoDisco tipobancodisco : tipobancodiscosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoBancoDiscoConstantesFunciones.getTipoBancoDiscoDescripcion(tipobancodisco));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoBancoDiscoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoBancoDiscoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipobancodisco.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoBancoDiscoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoBancoDiscoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipobancodisco.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco Disco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoBancoDiscos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoBancoDisco> tipobancodiscosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoBancoDisco> tipobancodiscosRespaldo=null;
		
		classes=TipoBancoDiscoConstantesFunciones.getClassesRelationshipsOfTipoBancoDisco(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipobancodiscoLogic.setDatosCliente(this.datosCliente);
		this.tipobancodiscoLogic.setDatosDeep(this.datosDeep);
		this.tipobancodiscoLogic.setIsConDeep(true);
		
		tipobancodiscosRespaldo=this.tipobancodiscoLogic.getTipoBancoDiscos();
		
		this.tipobancodiscoLogic.setTipoBancoDiscos(tipobancodiscosParaReportes);	
		this.tipobancodiscoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipobancodiscosParaReportes=this.tipobancodiscoLogic.getTipoBancoDiscos();
		this.tipobancodiscoLogic.setTipoBancoDiscos(tipobancodiscosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobancodisco_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoBancoDiscos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoBancoDisco("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoBancoDisco tipobancodisco : tipobancodiscosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoBancoDisco("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoBancoDiscoConstantesFunciones.generarExcelReporteDataTipoBancoDisco("NORMAL",row,workbook,tipobancodisco,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoBancoDiscoConstantesFunciones.getTipoBancoDiscoDescripcion(tipobancodisco));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco Disco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoBancoDisco.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBancoDisco.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoBancoDisco.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBancoDisco.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoBancoDisco() throws Exception {		
		this.startProcessTipoBancoDisco(true);
	}
	
	public void startProcessTipoBancoDisco(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoBancoDisco, this.jScrollPanelDatosTipoBancoDisco,this.jPanelPaginacionTipoBancoDisco, this.jScrollPanelDatosEdicionTipoBancoDisco, this.jPanelAccionesTipoBancoDisco,this.jPanelAccionesFormularioTipoBancoDisco,this.jmenuBarTipoBancoDisco,this.jmenuBarDetalleTipoBancoDisco,this.jTtoolBarTipoBancoDisco,this.jTtoolBarDetalleTipoBancoDisco);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoBancoDisco=null; 
		
		final JPanel jPanelParametrosReportesTipoBancoDisco=this.jPanelParametrosReportesTipoBancoDisco;
		//final JScrollPane jScrollPanelDatosTipoBancoDisco=this.jScrollPanelDatosTipoBancoDisco;
		final JTable jTableDatosTipoBancoDisco=this.jTableDatosTipoBancoDisco;		
		final JPanel jPanelPaginacionTipoBancoDisco=this.jPanelPaginacionTipoBancoDisco;
		//final JScrollPane jScrollPanelDatosEdicionTipoBancoDisco=this.jScrollPanelDatosEdicionTipoBancoDisco;
		final JPanel jPanelAccionesTipoBancoDisco=this.jPanelAccionesTipoBancoDisco;
		
		JPanel jPanelCamposAuxiliarTipoBancoDisco=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoBancoDisco=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) {
			jPanelCamposAuxiliarTipoBancoDisco=this.jInternalFrameDetalleFormTipoBancoDisco.jPanelCamposTipoBancoDisco;
			jPanelAccionesFormularioAuxiliarTipoBancoDisco=this.jInternalFrameDetalleFormTipoBancoDisco.jPanelAccionesFormularioTipoBancoDisco;
		}
		
		final JPanel jPanelCamposTipoBancoDisco=jPanelCamposAuxiliarTipoBancoDisco;
		final JPanel jPanelAccionesFormularioTipoBancoDisco=jPanelAccionesFormularioAuxiliarTipoBancoDisco;
		
		
		final JMenuBar jmenuBarTipoBancoDisco=this.jmenuBarTipoBancoDisco;
		final JToolBar jTtoolBarTipoBancoDisco=this.jTtoolBarTipoBancoDisco;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoBancoDisco=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoBancoDisco=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) {
			jmenuBarDetalleAuxiliarTipoBancoDisco=this.jInternalFrameDetalleFormTipoBancoDisco.jmenuBarDetalleTipoBancoDisco;
			jTtoolBarDetalleAuxiliarTipoBancoDisco=this.jInternalFrameDetalleFormTipoBancoDisco.jTtoolBarDetalleTipoBancoDisco;
		}
		
		final JMenuBar jmenuBarDetalleTipoBancoDisco=jmenuBarDetalleAuxiliarTipoBancoDisco;
		final JToolBar jTtoolBarDetalleTipoBancoDisco=jTtoolBarDetalleAuxiliarTipoBancoDisco;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoBancoDisco;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoBancoDisco;
			processRunnable.jTableDatos=jTableDatosTipoBancoDisco;
			processRunnable.jPanelCampos=jPanelCamposTipoBancoDisco;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoBancoDisco;
			processRunnable.jPanelAcciones=jPanelAccionesTipoBancoDisco;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoBancoDisco;
			
			
			processRunnable.jmenuBar=jmenuBarTipoBancoDisco;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoBancoDisco;
			processRunnable.jTtoolBar=jTtoolBarTipoBancoDisco;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoBancoDisco;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoBancoDisco ,jPanelParametrosReportesTipoBancoDisco,jTableDatosTipoBancoDisco, /*jScrollPanelDatosTipoBancoDisco,*/jPanelCamposTipoBancoDisco,jPanelPaginacionTipoBancoDisco, /*jScrollPanelDatosEdicionTipoBancoDisco,*/ jPanelAccionesTipoBancoDisco,jPanelAccionesFormularioTipoBancoDisco,jmenuBarTipoBancoDisco,jmenuBarDetalleTipoBancoDisco,jTtoolBarTipoBancoDisco,jTtoolBarDetalleTipoBancoDisco);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoBancoDisco, jScrollPanelDatosTipoBancoDisco,jPanelPaginacionTipoBancoDisco, jScrollPanelDatosEdicionTipoBancoDisco, jPanelAccionesTipoBancoDisco,jPanelAccionesFormularioTipoBancoDisco,jmenuBarTipoBancoDisco,jmenuBarDetalleTipoBancoDisco,jTtoolBarTipoBancoDisco,jTtoolBarDetalleTipoBancoDisco);
						
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
	
	public void finishProcessTipoBancoDisco() {// throws Exception 
		this.finishProcessTipoBancoDisco(true);
	}
	
	public void finishProcessTipoBancoDisco(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoBancoDisco, this.jScrollPanelDatosTipoBancoDisco,this.jPanelPaginacionTipoBancoDisco, this.jScrollPanelDatosEdicionTipoBancoDisco, this.jPanelAccionesTipoBancoDisco,this.jPanelAccionesFormularioTipoBancoDisco,this.jmenuBarTipoBancoDisco,this.jmenuBarDetalleTipoBancoDisco,this.jTtoolBarTipoBancoDisco,this.jTtoolBarDetalleTipoBancoDisco);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoBancoDisco=null; 
		
		final JPanel jPanelParametrosReportesTipoBancoDisco=this.jPanelParametrosReportesTipoBancoDisco;
		//final JScrollPane jScrollPanelDatosTipoBancoDisco=this.jScrollPanelDatosTipoBancoDisco;
		final JTable jTableDatosTipoBancoDisco=this.jTableDatosTipoBancoDisco;		
		final JPanel jPanelPaginacionTipoBancoDisco=this.jPanelPaginacionTipoBancoDisco;
		//final JScrollPane jScrollPanelDatosEdicionTipoBancoDisco=this.jScrollPanelDatosEdicionTipoBancoDisco;
		final JPanel jPanelAccionesTipoBancoDisco=this.jPanelAccionesTipoBancoDisco;
		
		JPanel jPanelCamposAuxiliarTipoBancoDisco=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoBancoDisco=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) {
			jPanelCamposAuxiliarTipoBancoDisco=this.jInternalFrameDetalleFormTipoBancoDisco.jPanelCamposTipoBancoDisco;
			jPanelAccionesFormularioAuxiliarTipoBancoDisco=this.jInternalFrameDetalleFormTipoBancoDisco.jPanelAccionesFormularioTipoBancoDisco;
		}
		
		final JPanel jPanelCamposTipoBancoDisco=jPanelCamposAuxiliarTipoBancoDisco;
		final JPanel jPanelAccionesFormularioTipoBancoDisco=jPanelAccionesFormularioAuxiliarTipoBancoDisco;
		
		
		final JMenuBar jmenuBarTipoBancoDisco=this.jmenuBarTipoBancoDisco;		
		final JToolBar jTtoolBarTipoBancoDisco=this.jTtoolBarTipoBancoDisco;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoBancoDisco=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoBancoDisco=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) {
			jmenuBarDetalleAuxiliarTipoBancoDisco=this.jInternalFrameDetalleFormTipoBancoDisco.jmenuBarDetalleTipoBancoDisco;
			jTtoolBarDetalleAuxiliarTipoBancoDisco=this.jInternalFrameDetalleFormTipoBancoDisco.jTtoolBarDetalleTipoBancoDisco;		
		}
		
		final JMenuBar jmenuBarDetalleTipoBancoDisco=jmenuBarDetalleAuxiliarTipoBancoDisco;
		final JToolBar jTtoolBarDetalleTipoBancoDisco=jTtoolBarDetalleAuxiliarTipoBancoDisco;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoBancoDisco;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoBancoDisco;
			processRunnable.jTableDatos=jTableDatosTipoBancoDisco;
			processRunnable.jPanelCampos=jPanelCamposTipoBancoDisco;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoBancoDisco;
			processRunnable.jPanelAcciones=jPanelAccionesTipoBancoDisco;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoBancoDisco;
			
			
			processRunnable.jmenuBar=jmenuBarTipoBancoDisco;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoBancoDisco;
			processRunnable.jTtoolBar=jTtoolBarTipoBancoDisco;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoBancoDisco;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoBancoDisco ,jPanelParametrosReportesTipoBancoDisco, jTableDatosTipoBancoDisco,/*jScrollPanelDatosTipoBancoDisco,*/jPanelCamposTipoBancoDisco,jPanelPaginacionTipoBancoDisco, /*jScrollPanelDatosEdicionTipoBancoDisco,*/ jPanelAccionesTipoBancoDisco,jPanelAccionesFormularioTipoBancoDisco,jmenuBarTipoBancoDisco,jmenuBarDetalleTipoBancoDisco,jTtoolBarTipoBancoDisco,jTtoolBarDetalleTipoBancoDisco));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoBancoDisco(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoBancoDisco(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoBancoDisco(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoBancoDisco(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoBancoDisco,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoBancoDisco,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoBancoDisco(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoBancoDisco,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoBancoDisco,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipobancodiscoConstantesFunciones.getsFinalQueryTipoBancoDisco();
		String  finalQueryPaginacionTodos=this.tipobancodiscoConstantesFunciones.getsFinalQueryTipoBancoDisco();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoBancoDiscoConstantesFunciones.getArrayColumnasGlobalesNoTipoBancoDisco(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoBancoDiscoConstantesFunciones.getArrayColumnasGlobalesTipoBancoDisco(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoBancoDiscoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipobancodiscosEliminados= new ArrayList<TipoBancoDisco>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoBancoDisco();
		
				///*TipoBancoDiscoSessionBean*/this.tipobancodiscoSessionBean=new TipoBancoDiscoSessionBean();
			
			if(this.tipobancodiscoSessionBean==null) {
				this.tipobancodiscoSessionBean=new TipoBancoDiscoSessionBean();
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
					this.iNumeroPaginacion=TipoBancoDiscoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoBancoDiscoConstantesFunciones.getClassesForeignKeysOfTipoBancoDisco(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipobancodisco."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipobancodiscosAux= new ArrayList<TipoBancoDisco>();
			
				
			tipobancodiscoLogic.setDatosCliente(this.datosCliente);
			tipobancodiscoLogic.setDatosDeep(this.datosDeep);
			tipobancodiscoLogic.setIsConDeep(true);
			
			
			tipobancodiscoLogic.getTipoBancoDiscoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipobancodiscoLogic.getTodosTipoBancoDiscos(finalQueryGlobal,pagination);
					
					//tipobancodiscoLogic.getTodosTipoBancoDiscosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipobancodiscoLogic.getTipoBancoDiscos()==null|| tipobancodiscoLogic.getTipoBancoDiscos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipobancodiscosAux= new ArrayList<TipoBancoDisco>();
							tipobancodiscosAux.addAll(tipobancodiscoLogic.getTipoBancoDiscos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobancodiscosAux= new ArrayList<TipoBancoDisco>();
							tipobancodiscosAux.addAll(tipobancodiscos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipobancodiscoLogic.getTodosTipoBancoDiscos(finalQueryGlobal+"",this.pagination);												
							
							//tipobancodiscoLogic.getTodosTipoBancoDiscosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoBancoDiscos("Todos",tipobancodiscoLogic.getTipoBancoDiscos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipobancodiscoLogic.setTipoBancoDiscos(new ArrayList<TipoBancoDisco>());					
							tipobancodiscoLogic.getTipoBancoDiscos().addAll(tipobancodiscosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobancodiscos=new ArrayList<TipoBancoDisco>();
							tipobancodiscos.addAll(tipobancodiscosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoBancoDisco=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoBancoDisco=this.idActual;
				
				} else if(this.idTipoBancoDiscoActual!=null && this.idTipoBancoDiscoActual!=0L) {
					idTipoBancoDisco=idTipoBancoDiscoActual;
				}
				
					
				this.sDetalleReporte=TipoBancoDiscoConstantesFunciones.getDetalleIndicePorId(idTipoBancoDisco);
				
				this.tipobancodiscos=new ArrayList<TipoBancoDisco>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipobancodiscoLogic.getEntity(idTipoBancoDisco);
					
					//tipobancodiscoLogic.getEntityWithConnection(idTipoBancoDisco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipobancodiscoLogic.setTipoBancoDiscos(new ArrayList<TipoBancoDisco>());
					tipobancodiscoLogic.getTipoBancoDiscos().add(tipobancodiscoLogic.getTipoBancoDisco());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipobancodiscos=new ArrayList<TipoBancoDisco>();
					this.tipobancodiscos.add(tipobancodisco);
				}
				
				if(tipobancodiscoLogic.getTipoBancoDisco()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoBancoDisco();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoBancoDisco();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipobancodiscoLogic.getTipoBancoDiscos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipobancodiscos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipobancodiscoLogic.getTipoBancoDiscos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipobancodiscos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoBancoDisco tipobancodisco) {
		Boolean permite=true;
		
		if(this.tipobancodisco.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoBancoDiscoConstantesFunciones.getOrderByListaTipoBancoDisco();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoBancoDiscoConstantesFunciones.getOrderByListaTipoBancoDisco();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBancoDisco tipobancodisco:tipobancodiscoLogic.getTipoBancoDiscos()) {
				if(tipobancodisco.getsType().equals(Constantes2.S_TOTALES)) {
					tipobancodiscoTotales=tipobancodisco;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBancoDisco tipobancodisco:this.tipobancodiscos) {
				if(tipobancodisco.getsType().equals(Constantes2.S_TOTALES)) {
					tipobancodiscoTotales=tipobancodisco;
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
			this.tipobancodiscoAux=new TipoBancoDisco();
			this.tipobancodiscoAux.setsType(Constantes2.S_TOTALES);
			this.tipobancodiscoAux.setIsNew(false);
			this.tipobancodiscoAux.setIsChanged(false);
			this.tipobancodiscoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoBancoDiscoConstantesFunciones.TotalizarValoresFilaTipoBancoDisco(this.tipobancodiscoLogic.getTipoBancoDiscos(),this.tipobancodiscoAux);
				
				this.tipobancodiscoLogic.getTipoBancoDiscos().add(this.tipobancodiscoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoBancoDiscoConstantesFunciones.TotalizarValoresFilaTipoBancoDisco(this.tipobancodiscos,this.tipobancodiscoAux);
				
				this.tipobancodiscos.add(this.tipobancodiscoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipobancodiscoTotales=new TipoBancoDisco();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipobancodiscoLogic.getTipoBancoDiscos().remove(tipobancodiscoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipobancodiscos.remove(tipobancodiscoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipobancodiscoTotales=new TipoBancoDisco();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBancoDisco tipobancodisco:tipobancodiscoLogic.getTipoBancoDiscos()) {
				if(tipobancodisco.getsType().equals(Constantes2.S_TOTALES)) {
					tipobancodiscoTotales=tipobancodisco;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoBancoDiscoConstantesFunciones.TotalizarValoresFilaTipoBancoDisco(this.tipobancodiscoLogic.getTipoBancoDiscos(),tipobancodiscoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBancoDisco tipobancodisco:this.tipobancodiscos) {
				if(tipobancodisco.getsType().equals(Constantes2.S_TOTALES)) {
					tipobancodiscoTotales=tipobancodisco;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoBancoDiscoConstantesFunciones.TotalizarValoresFilaTipoBancoDisco(this.tipobancodiscos,tipobancodiscoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoBancoDisco() {
		this.isPermisoTodoTipoBancoDisco=false;
		this.isPermisoNuevoTipoBancoDisco=false;
		this.isPermisoActualizarTipoBancoDisco=false;
		this.isPermisoActualizarOriginalTipoBancoDisco=false;
		this.isPermisoEliminarTipoBancoDisco=false;
		this.isPermisoGuardarCambiosTipoBancoDisco=false;
		this.isPermisoConsultaTipoBancoDisco=false;
		this.isPermisoBusquedaTipoBancoDisco=false;
		this.isPermisoReporteTipoBancoDisco=false;		
		this.isPermisoOrdenTipoBancoDisco=false;		
		this.isPermisoPaginacionMedioTipoBancoDisco=false;		
		this.isPermisoPaginacionAltoTipoBancoDisco=false;
		this.isPermisoPaginacionTodoTipoBancoDisco=false;
		this.isPermisoCopiarTipoBancoDisco=false;		
		this.isPermisoVerFormTipoBancoDisco=false;		
		this.isPermisoDuplicarTipoBancoDisco=false;		
		this.isPermisoOrdenTipoBancoDisco=false;		
	}
	
	public void setPermisosUsuarioTipoBancoDisco(Boolean isPermiso) {
		this.isPermisoTodoTipoBancoDisco=isPermiso;
		this.isPermisoNuevoTipoBancoDisco=isPermiso;
		this.isPermisoActualizarTipoBancoDisco=isPermiso;
		this.isPermisoActualizarOriginalTipoBancoDisco=isPermiso;
		this.isPermisoEliminarTipoBancoDisco=isPermiso;
		this.isPermisoGuardarCambiosTipoBancoDisco=isPermiso;
		this.isPermisoConsultaTipoBancoDisco=isPermiso;
		this.isPermisoBusquedaTipoBancoDisco=isPermiso;
		this.isPermisoReporteTipoBancoDisco=isPermiso;
		this.isPermisoOrdenTipoBancoDisco=isPermiso;		
		this.isPermisoPaginacionMedioTipoBancoDisco=isPermiso;		
		this.isPermisoPaginacionAltoTipoBancoDisco=isPermiso;		
		this.isPermisoPaginacionTodoTipoBancoDisco=isPermiso;		
		this.isPermisoCopiarTipoBancoDisco=isPermiso;		
		this.isPermisoVerFormTipoBancoDisco=isPermiso;		
		this.isPermisoDuplicarTipoBancoDisco=isPermiso;
		this.isPermisoOrdenTipoBancoDisco=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoBancoDisco(Boolean isPermiso) {
		//this.isPermisoTodoTipoBancoDisco=isPermiso;
		this.isPermisoNuevoTipoBancoDisco=isPermiso;
		this.isPermisoActualizarTipoBancoDisco=isPermiso;
		this.isPermisoActualizarOriginalTipoBancoDisco=isPermiso;
		this.isPermisoEliminarTipoBancoDisco=isPermiso;
		this.isPermisoGuardarCambiosTipoBancoDisco=isPermiso;
		//this.isPermisoConsultaTipoBancoDisco=isPermiso;
		//this.isPermisoBusquedaTipoBancoDisco=isPermiso;
		//this.isPermisoReporteTipoBancoDisco=isPermiso;
		//this.isPermisoOrdenTipoBancoDisco=isPermiso;		
		//this.isPermisoPaginacionMedioTipoBancoDisco=isPermiso;		
		//this.isPermisoPaginacionAltoTipoBancoDisco=isPermiso;		
		//this.isPermisoPaginacionTodoTipoBancoDisco=isPermiso;		
		//this.isPermisoCopiarTipoBancoDisco=isPermiso;		
		//this.isPermisoDuplicarTipoBancoDisco=isPermiso;
		//this.isPermisoOrdenTipoBancoDisco=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoBancoDiscoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoBancoDiscoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoBancoDisco(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoBancoDiscoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoBancoDiscoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoBancoDiscoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoBancoDiscoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoBancoDisco() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoBancoDiscoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoBancoDiscoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoBancoDisco=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoBancoDisco=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoBancoDisco=this.isPermisoActualizarTipoBancoDisco;
			this.isPermisoEliminarTipoBancoDisco=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoBancoDisco=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoBancoDisco=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoBancoDisco=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoBancoDisco=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoBancoDisco=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoBancoDisco=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoBancoDisco=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoBancoDisco=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoBancoDisco=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoBancoDisco=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoBancoDisco=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoBancoDisco=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoBancoDisco=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoBancoDisco.setToolTipText(this.jTableDatosTipoBancoDisco.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoBancoDisco(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoBancoDisco(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoBancoDiscoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoBancoDiscoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoBancoDisco() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoBancoDiscoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoBancoDiscoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoBancoDiscoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoBancoDiscoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoBancoDiscoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoBancoDisco()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoBancoDisco()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoBancoDisco(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoBancoDisco()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoBancoDisco();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoBancoDisco(TipoBancoDisco tipobancodisco)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoBancoDisco(TipoBancoDisco tipobancodisco,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoBancoDisco()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoBancoDisco()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoBancoDisco()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoBancoDisco()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoBancoDisco()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoBancoDisco()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoBancoDisco(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoBancoDisco()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoBancoDiscoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoBancoDiscoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoBancoDiscoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipobancodiscoSessionBean=new TipoBancoDiscoSessionBean(); 
		this.tipobancodiscoConstantesFunciones=new TipoBancoDiscoConstantesFunciones(); 
		this.tipobancodiscoBean=new TipoBancoDisco();//(this.tipobancodiscoConstantesFunciones); 		
		this.tipobancodiscoReturnGeneral=new TipoBancoDiscoParameterReturnGeneral(); 
		
		this.tipobancodiscoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipobancodiscoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoBancoDiscoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoBancoDiscoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoBancoDiscoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoBancoDisco(true);
			
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
			
			this.tipobancodiscoConstantesFunciones=new TipoBancoDiscoConstantesFunciones(); 
			this.tipobancodiscoBean=new TipoBancoDisco();//this.tipobancodiscoConstantesFunciones); 			
			this.tipobancodiscoReturnGeneral=new TipoBancoDiscoParameterReturnGeneral(); 
		
			TipoBancoDiscoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Banco Disco Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipobancodisco=new TipoBancoDisco();
			this.tipobancodiscos = new ArrayList<TipoBancoDisco>();
			this.tipobancodiscosAux = new ArrayList<TipoBancoDisco>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic=new TipoBancoDiscoLogic();
				this.tipobancodiscoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipobancodiscoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipobancodiscoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoBancoDisco);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoBancoDisco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoBancoDisco);	
					}
					
					if(this.jInternalFrameImportacionTipoBancoDisco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoBancoDisco);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoBancoDisco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoBancoDisco);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoBancoDisco);
				this.jInternalFrameDetalleFormTipoBancoDisco.setVisible(false);
				this.jInternalFrameDetalleFormTipoBancoDisco.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoBancoDisco!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoBancoDisco);
					this.jInternalFrameReporteDinamicoTipoBancoDisco.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoBancoDisco.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoBancoDisco!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoBancoDisco);
					this.jInternalFrameImportacionTipoBancoDisco.setVisible(false);
					this.jInternalFrameImportacionTipoBancoDisco.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoBancoDisco!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoBancoDisco);
					this.jInternalFrameOrderByTipoBancoDisco.setVisible(false);
					this.jInternalFrameOrderByTipoBancoDisco.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoBancoDiscoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoBancoDiscoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipobancodiscoReturnGeneral=new TipoBancoDiscoParameterReturnGeneral();
			
			this.tipobancodiscoParameterGeneral=new TipoBancoDiscoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipobancodiscoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoBancoDiscoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoBancoDiscoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipobancodiscoSessionBean.getEsGuardarRelacionado(),this.tipobancodiscoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoBancoDiscoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipobancodiscoSessionBean.getEsGuardarRelacionado(),this.tipobancodiscoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoBancoDisco=false;
			this.isVisibilidadCeldaDuplicarTipoBancoDisco=true;
			this.isVisibilidadCeldaCopiarTipoBancoDisco=true;
			this.isVisibilidadCeldaVerFormTipoBancoDisco=true;
			this.isVisibilidadCeldaOrdenTipoBancoDisco=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoDisco=false;
			this.isVisibilidadCeldaModificarTipoBancoDisco=false;
			this.isVisibilidadCeldaActualizarTipoBancoDisco=false;
			this.isVisibilidadCeldaEliminarTipoBancoDisco=false;
			this.isVisibilidadCeldaCancelarTipoBancoDisco=false;
			this.isVisibilidadCeldaGuardarTipoBancoDisco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoDisco=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoBancoDisco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoBancoDisco();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoBancoDisco(false);
			
			this.setPermisosUsuarioTipoBancoDisco();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipobancodiscoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipobancodiscoSessionBean.getEsGuardarRelacionado() && this.tipobancodiscoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoBancoDiscoClasesRelacionadas();
			}
			
			if(this.tipobancodiscoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoBancoDiscoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoBancoDiscoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoBancoDisco();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoBancoDisco();
			}
			
			if(!this.isPermisoBusquedaTipoBancoDisco) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoBancoDisco,this.isPermisoPaginacionMedioTipoBancoDisco,this.isPermisoPaginacionTodoTipoBancoDisco);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoBancoDiscoConstantesFunciones.getTiposSeleccionarTipoBancoDisco());
				
				this.tiposColumnasSelect=TipoBancoDiscoConstantesFunciones.getTiposSeleccionarTipoBancoDisco(true);
				
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
			//if(!this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoBancoDisco();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoBancoDisco(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoBancoDisco(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoBancoDisco() ;
			
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
				tipobancodiscoImplementable= (TipoBancoDiscoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoBancoDiscoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipobancodiscoImplementableHome= (TipoBancoDiscoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoBancoDiscoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipobancodiscos= new ArrayList<TipoBancoDisco>();
			this.tipobancodiscosEliminados= new ArrayList<TipoBancoDisco>();
						
			this.isEsNuevoTipoBancoDisco=false;
			this.esParaAccionDesdeFormularioTipoBancoDisco=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoBancoDisco(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoBancoDisco();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoBancoDiscoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoBancoDisco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoBancoDisco(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoBancoDisco();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoBancoDisco();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoBancoDisco(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoBancoDisco: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoBancoDisco() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoBancoDisco")) {
				iIndex=this.jInternalFrameDetalleFormTipoBancoDisco.jTabbedPaneRelacionesTipoBancoDisco.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoBancoDisco.jTabbedPaneRelacionesTipoBancoDisco.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoBancoDisco.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoBancoDisco();	
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
	
	public void cargarCombosForeignKeyTipoBancoDisco(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoBancoDisco(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoBancoDisco(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoBancoDiscoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoBancoDisco();
		
		this.cargarCombosFrameForeignKeyTipoBancoDisco();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoBancoDisco();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoBancoDisco();
		}
	}
	
	
	
	public void jButtonNuevoTipoBancoDiscoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipobancodiscoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoBancoDisco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
			
			
			if(jTableDatosTipoBancoDisco.getRowCount()>=1) {
				jTableDatosTipoBancoDisco.removeRowSelectionInterval(0, jTableDatosTipoBancoDisco.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoBancoDisco=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoBancoDisco(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoBancoDisco(true);			
			//this.tipobancodisco=new TipoBancoDisco();
			//this.tipobancodisco.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoBancoDisco(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoBancoDisco() ;
			
			if(TipoBancoDiscoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoBancoDisco(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipobancodisco);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipobancodisco);				
			
			TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
			
			if(this.tipobancodiscoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoBancoDisco: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoBancoDiscoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoBancoDisco> tipobancodiscosSeleccionados=new ArrayList<TipoBancoDisco>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoBancoDisco.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoBancoDisco.getSelectedRows().length;			
			}
			
			tipobancodiscosSeleccionados=this.getTipoBancoDiscosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoBancoDisco--;			
				//TipoBancoDisco tipobancodiscoAux= new TipoBancoDisco();			
				//tipobancodiscoAux.setId(this.iIdNuevoTipoBancoDisco);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoBancoDisco tipobancodiscoOrigen=new TipoBancoDisco();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoBancoDisco tipobancodiscoOrigen : tipobancodiscosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoBancoDisco.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipobancodiscoOrigen =(TipoBancoDisco) this.tipobancodiscoLogic.getTipoBancoDiscos().toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobancodiscoOrigen =(TipoBancoDisco) this.tipobancodiscos.toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoBancoDisco();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipobancodisco.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoBancoDisco(tipobancodiscoOrigen,this.tipobancodisco,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoDisco(this.tipobancodisco);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipobancodiscoLogic.getTipoBancoDiscos().add(this.tipobancodiscoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipobancodiscos.add(this.tipobancodiscoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoBancoDisco(false);
				
				this.jTableDatosTipoBancoDisco.setRowSelectionInterval(this.getIndiceNuevoTipoBancoDisco(), this.getIndiceNuevoTipoBancoDisco());
				
				int iLastRow =  this.jTableDatosTipoBancoDisco.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoBancoDisco.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoBancoDisco.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoBancoDisco(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoBancoDiscoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoBancoDisco> tipobancodiscosSeleccionados=new ArrayList<TipoBancoDisco>();									
		
			TipoBancoDisco tipobancodiscoOrigen=new TipoBancoDisco();
			TipoBancoDisco tipobancodiscoDestino=new TipoBancoDisco();
				
			tipobancodiscosSeleccionados=this.getTipoBancoDiscosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoBancoDisco.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipobancodiscosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoBancoDisco.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancodiscoOrigen =(TipoBancoDisco) this.tipobancodiscoLogic.getTipoBancoDiscos().toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipobancodiscoOrigen =(TipoBancoDisco) this.tipobancodiscos.toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancodiscoDestino =(TipoBancoDisco) this.tipobancodiscoLogic.getTipoBancoDiscos().toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipobancodiscoDestino =(TipoBancoDisco) this.tipobancodiscos.toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipobancodiscoOrigen =tipobancodiscosSeleccionados.get(0);
				tipobancodiscoDestino =tipobancodiscosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoBancoDisco(tipobancodiscoOrigen,tipobancodiscoDestino,true,false);
				
				tipobancodiscoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipobancodiscoDestino,tipobancodiscoLogic.getTipoBancoDiscos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipobancodiscoDestino,tipobancodiscos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoBancoDisco(false);
				
				//this.jTableDatosTipoBancoDisco.setRowSelectionInterval(this.getIndiceNuevoTipoBancoDisco(), this.getIndiceNuevoTipoBancoDisco());
				
				int iLastRow =  this.jTableDatosTipoBancoDisco.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoBancoDisco.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoBancoDisco.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoBancoDisco(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoBancoDiscoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoBancoDisco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoBancoDisco.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoBancoDiscoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoBancoDisco.isVisible();
			
			
			this.jPanelParametrosReportesTipoBancoDisco.setVisible(!isVisible);
			this.jPanelPaginacionTipoBancoDisco.setVisible(!isVisible);
			this.jPanelAccionesTipoBancoDisco.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoBancoDiscoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoBancoDisco();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoBancoDiscoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoBancoDisco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoBancoDiscoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoBancoDisco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoBancoDiscoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoBancoDisco();
			
			this.abrirFrameOrderByTipoBancoDisco();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoBancoDiscoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoBancoDisco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoBancoDisco(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoBancoDisco);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoBancoDisco.isMaximum()) {
					this.jInternalFrameDetalleFormTipoBancoDisco.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoBancoDisco.setSize(this.jInternalFrameDetalleFormTipoBancoDisco.iWidthFormulario,this.jInternalFrameDetalleFormTipoBancoDisco.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoBancoDisco.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoBancoDisco.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoBancoDisco.isMaximum()) {
						this.jInternalFrameDetalleFormTipoBancoDisco.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoBancoDisco.jContentPaneDetalleTipoBancoDisco.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoBancoDisco.jTabbedPaneRelacionesTipoBancoDisco.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoBancoDisco.jContentPaneDetalleTipoBancoDisco.getWidth(),TipoBancoDiscoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoBancoDisco.jTabbedPaneRelacionesTipoBancoDisco.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoBancoDisco.jContentPaneDetalleTipoBancoDisco.getWidth(),TipoBancoDiscoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoBancoDisco.jTabbedPaneRelacionesTipoBancoDisco.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoBancoDisco.jContentPaneDetalleTipoBancoDisco.getWidth(),TipoBancoDiscoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoBancoDisco.setVisible(true);
	        this.jInternalFrameDetalleFormTipoBancoDisco.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoBancoDisco() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoBancoDisco==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoBancoDisco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoBancoDisco,false,this);
				} else {
					this.jInternalFrameOrderByTipoBancoDisco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoBancoDisco,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoBancoDisco);
				this.jInternalFrameOrderByTipoBancoDisco.setVisible(false);
				this.jInternalFrameOrderByTipoBancoDisco.setSelected(false);
				
				this.jInternalFrameOrderByTipoBancoDisco.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoBancoDisco"));
				
				this.inicializarActualizarBindingTablaOrderByTipoBancoDisco();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoBancoDisco() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoBancoDisco==null) {
				
				this.jInternalFrameImportacionTipoBancoDisco=new ImportacionJInternalFrame(TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoBancoDisco);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoBancoDisco);
				this.jInternalFrameImportacionTipoBancoDisco.setVisible(false);
				this.jInternalFrameImportacionTipoBancoDisco.setSelected(false);


				this.jInternalFrameImportacionTipoBancoDisco.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoBancoDisco"));
				this.jInternalFrameImportacionTipoBancoDisco.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoBancoDisco"));
				this.jInternalFrameImportacionTipoBancoDisco.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoBancoDisco"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoBancoDisco() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoBancoDisco==null) {
				this.jInternalFrameReporteDinamicoTipoBancoDisco=new ReporteDinamicoJInternalFrame(TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoBancoDisco);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoBancoDisco);
				this.jInternalFrameReporteDinamicoTipoBancoDisco.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoBancoDisco.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoBancoDisco.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoBancoDisco"));
				this.jInternalFrameReporteDinamicoTipoBancoDisco.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoBancoDisco"));
				this.jInternalFrameReporteDinamicoTipoBancoDisco.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoBancoDisco"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoBancoDisco();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoBancoDisco() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoBancoDisco);
			
	       	this.jInternalFrameDetalleFormTipoBancoDisco.setVisible(false);
	        this.jInternalFrameDetalleFormTipoBancoDisco.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoBancoDisco.dispose();
			//this.jInternalFrameDetalleFormTipoBancoDisco=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoBancoDisco() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoBancoDisco.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoBancoDisco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoBancoDisco() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoBancoDisco.setVisible(true);
	        this.jInternalFrameImportacionTipoBancoDisco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoBancoDisco() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoBancoDisco.setVisible(true);
	        this.jInternalFrameOrderByTipoBancoDisco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoBancoDisco() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoBancoDisco.setVisible(false);
	        this.jInternalFrameOrderByTipoBancoDisco.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoBancoDisco() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoBancoDisco.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoBancoDisco.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoBancoDisco() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoBancoDisco.setVisible(false);
	        this.jInternalFrameImportacionTipoBancoDisco.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoBancoDiscoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoBancoDisco(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoBancoDisco(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoBancoDisco.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoBancoDisco(true);
			//this.isEsNuevoTipoBancoDisco=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscoLogic.getTipoBancoDiscos().toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscos.toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoBancoDisco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoBancoDisco(false) ;
			
			if(tipobancodiscoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoBancoDiscoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoBancoDisco(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoBancoDisco(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoBancoDiscoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoBancoDisco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscoLogic.getTipoBancoDiscos().toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscos.toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoBancoDisco(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoBancoDisco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoBancoDisco.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoBancoDisco(true);
			//this.isEsNuevoTipoBancoDisco=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscoLogic.getTipoBancoDiscos().toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscos.toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipobancodisco.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoBancoDisco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoBancoDisco(false) ;
			
			if(TipoBancoDiscoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoBancoDisco(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoBancoDisco(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoBancoDiscoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoBancoDisco(false);
			
			//if(!this.isEsNuevoTipoBancoDisco) {								
				int intSelectedRow = this.jTableDatosTipoBancoDisco.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscoLogic.getTipoBancoDiscos().toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscos.toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoBancoDiscoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoBancoDisco(this.tipobancodisco,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoDisco(this.tipobancodisco);
				
			}
			
			if(this.permiteMantenimiento(this.tipobancodisco)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoBancoDisco=true;
					this.inicializarActualizarBindingTablaTipoBancoDisco(false);
					this.isEsNuevoTipoBancoDisco=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoBancoDisco=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoBancoDisco=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoBancoDisco(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoBancoDisco(false);
				
				this.habilitarDeshabilitarControlesTipoBancoDisco(false);
			
												
				
				if(TipoBancoDiscoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoBancoDisco();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoBancoDiscoActionPerformed(evt,tipobancodiscoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoBancoDisco(this.tipobancodisco,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoBancoDisco.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipobancodiscoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipobancodisco.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoBancoDisco.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoDisco.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoBancoDiscoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoBancoDisco.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscoLogic.getTipoBancoDiscos().toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
				this.tipobancodisco.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscos.toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
				this.tipobancodisco.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipobancodisco)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoBancoDiscoModel) this.jTableDatosTipoBancoDisco.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoBancoDisco=true;
				this.inicializarActualizarBindingTablaTipoBancoDisco(false);
				this.isEsNuevoTipoBancoDisco=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoBancoDisco(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoBancoDisco(false);
				
				this.habilitarDeshabilitarControlesTipoBancoDisco(false);
				
				
				
				if(TipoBancoDiscoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoBancoDisco();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoBancoDiscoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoBancoDisco.getRowCount()>=1) {
				jTableDatosTipoBancoDisco.removeRowSelectionInterval(0, jTableDatosTipoBancoDisco.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoBancoDisco(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoBancoDisco(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoBancoDisco(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoBancoDisco(false) ;
			
			this.isEsNuevoTipoBancoDisco=false;
			
			if(TipoBancoDiscoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoBancoDisco();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoBancoDiscoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoBancoDisco(false);
				
				//SI ES MANUAL
				if(TipoBancoDiscoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoBancoDisco();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoBancoDiscoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoBancoDisco--;			
			//TipoBancoDisco tipobancodiscoAux= new TipoBancoDisco();			
			//tipobancodiscoAux.setId(this.iIdNuevoTipoBancoDisco);
			
			if(this.jInternalFrameDetalleFormTipoBancoDisco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoBancoDisco();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoDisco(this.tipobancodisco);
			
			this.tipobancodisco.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipobancodiscoLogic.getTipoBancoDiscos().add(this.tipobancodiscoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipobancodiscos.add(this.tipobancodiscoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoBancoDisco(false);
			
			this.jTableDatosTipoBancoDisco.setRowSelectionInterval(this.getIndiceNuevoTipoBancoDisco(), this.getIndiceNuevoTipoBancoDisco());
			
			int iLastRow =  this.jTableDatosTipoBancoDisco.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoBancoDisco.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoBancoDisco.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoBancoDisco(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoBancoDiscoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoBancoDisco(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoBancoDisco(false);
			
			//SI ES MANUAL
			if(TipoBancoDiscoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoBancoDisco();
			}
			
			//this.abrirFrameTreeTipoBancoDisco();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoBancoDiscoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Banco DiscoS ?", "MANTENIMIENTO DE Tipo Banco Disco", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoBancoDisco.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoBancoDisco();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipobancodiscoReturnGeneral=tipobancodiscoLogic.procesarImportacionTipoBancoDiscosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipobancodiscoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoBancoDiscoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoBancoDiscoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoBancoDisco.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoBancoDisco.setFileImportacion(this.jInternalFrameImportacionTipoBancoDisco.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoBancoDisco.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoBancoDisco.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoBancoDisco.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoBancoDisco.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoBancoDiscoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoBancoDisco> tipobancodiscosSeleccionados=new ArrayList<TipoBancoDisco>();		

		tipobancodiscosSeleccionados=this.getTipoBancoDiscosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoBancoDisco.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoBancoDisco.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoBancoDiscoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoBancoDiscoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoBancoDiscos("Todos",tipobancodiscosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco Disco",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoBancoDisco.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBancoDisco.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoBancoDiscoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoBancoDiscoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoBancoDisco.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoBancoDisco.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoBancoDisco.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoBancoDiscoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoBancoDiscoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoBancoDisco.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoBancoDiscoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoBancoDiscoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoBancoDisco.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBancoDisco.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoBancoDiscoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoBancoDiscoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoBancoDiscoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoBancoDisco> tipobancodiscosSeleccionados=new ArrayList<TipoBancoDisco>();		
		
		tipobancodiscosSeleccionados=this.getTipoBancoDiscosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobancodisco";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoBancoDiscos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoBancoDisco.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBancoDisco.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoBancoDiscoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoBancoDiscoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoBancoDisco tipobancodisco:tipobancodiscosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipobancodisco.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoBancoDiscoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoBancoDiscoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoBancoDisco tipobancodisco:tipobancodiscosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipobancodisco.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoBancoDisco(row);				
			//	iRow++;
			//}				
			
			//for(TipoBancoDisco tipobancodiscoAux:tipobancodiscosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoBancoDisco(tipobancodiscoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco Disco",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipobancodiscoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoBancoDisco(false);
			
			//SI ES MANUAL
			if(TipoBancoDiscoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoBancoDisco();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoBancoDiscoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoBancoDisco(false);
			
			//SI ES MANUAL
			if(TipoBancoDiscoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoBancoDisco();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoBancoDiscoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoBancoDisco(false);
			
			//SI ES MANUAL
			if(TipoBancoDiscoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoBancoDisco();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancodiscoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoBancoDisco() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoBancoDisco.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoBancoDisco.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoBancoDisco.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoBancoDisco.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoBancoDisco.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoBancoDisco.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoBancoDisco.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoBancoDisco(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoBancoDisco(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoBancoDisco(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoBancoDisco(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoBancoDisco(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoBancoDisco(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoBancoDisco(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoBancoDisco(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoBancoDiscoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoBancoDiscoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoBancoDisco() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoBancoDisco();
		
		this.inicializarActualizarBindingBotonesManualTipoBancoDisco(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoBancoDisco();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoBancoDisco() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoBancoDisco(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoBancoDisco(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoBancoDisco.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoBancoDisco.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoBancoDisco.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoBancoDisco.jCheckBoxPostAccionNuevoTipoBancoDisco.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoBancoDisco.jCheckBoxPostAccionSinCerrarTipoBancoDisco.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoBancoDisco.jCheckBoxPostAccionSinMensajeTipoBancoDisco.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoBancoDisco.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoBancoDisco.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoBancoDisco.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) {
				this.jInternalFrameDetalleFormTipoBancoDisco.jCheckBoxPostAccionNuevoTipoBancoDisco.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoBancoDisco.jCheckBoxPostAccionSinCerrarTipoBancoDisco.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoBancoDisco.jCheckBoxPostAccionSinMensajeTipoBancoDisco.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoBancoDisco.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoBancoDisco.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoBancoDisco.jComboBoxTiposAccionesFormularioTipoBancoDisco.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoBancoDisco.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoBancoDisco!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoBancoDisco.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoBancoDisco.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoBancoDisco.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoBancoDisco.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoBancoDisco.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoBancoDisco!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoBancoDisco.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoBancoDisco.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoBancoDisco.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoBancoDisco(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoBancoDiscoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoBancoDisco(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoBancoDisco() throws Exception {
		try	{
			if(TipoBancoDiscoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoBancoDisco();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoBancoDisco() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoBancoDisco.jComboBoxTiposAccionesFormularioTipoBancoDisco.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoBancoDisco.jComboBoxTiposAccionesFormularioTipoBancoDisco.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoBancoDisco() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoBancoDisco.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoBancoDisco.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoBancoDisco.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoBancoDisco.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoBancoDisco.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoBancoDisco.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoBancoDisco.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoBancoDisco.addItem(reporte);
			}
			
			
			if(!this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoBancoDisco.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoBancoDisco.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoBancoDisco.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoBancoDisco.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoBancoDisco.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoBancoDisco.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoBancoDisco.jComboBoxTiposAccionesFormularioTipoBancoDisco.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoBancoDisco.jComboBoxTiposAccionesFormularioTipoBancoDisco.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoBancoDisco.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoBancoDisco.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoBancoDisco.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoBancoDisco();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoBancoDisco() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoBancoDisco!=null) {
				this.jInternalFrameReporteDinamicoTipoBancoDisco.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoBancoDisco.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoBancoDisco!=null) {
				this.jInternalFrameReporteDinamicoTipoBancoDisco.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoBancoDisco.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoBancoDisco!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoBancoDisco.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoBancoDisco.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoBancoDisco.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoBancoDisco.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoBancoDisco.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoBancoDisco.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoBancoDisco()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoBancoDisco(Boolean esInicializar) throws Exception {				
		if(TipoBancoDiscoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoBancoDisco();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoBancoDisco() throws Exception {
		this.inicializarActualizarBindingTablaTipoBancoDisco(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoBancoDisco() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoBancoDisco.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoBancoDisco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoBancoDisco.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoBancoDiscoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoBancoDisco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoBancoDisco.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoBancoDiscoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoBancoDiscoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBancoDiscoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoBancoDiscoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoBancoDisco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoBancoDisco.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoBancoDiscoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoBancoDisco.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoBancoDisco(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipobancodiscoLogic.getTipoBancoDiscos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipobancodiscos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoBancoDiscoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoBancoDisco.setModel(new TipoBancoDiscoModel(this.tipobancodiscoLogic.getTipoBancoDiscos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoBancoDisco.setModel(new TipoBancoDiscoModel(this.tipobancodiscos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoBancoDisco!=null && this.jInternalFrameOrderByTipoBancoDisco.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoBancoDisco();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoBancoDisco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBancoDisco,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoBancoDiscoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO,tipobancodiscoConstantesFunciones.resaltarSeleccionarTipoBancoDisco,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO,tipobancodiscoConstantesFunciones.resaltarSeleccionarTipoBancoDisco,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoBancoDisco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBancoDisco,TipoBancoDiscoConstantesFunciones.LABEL_ID));

		if(this.tipobancodiscoConstantesFunciones.mostraridTipoBancoDisco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoBancoDiscoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipobancodiscoConstantesFunciones.resaltaridTipoBancoDisco,this.tipobancodiscoConstantesFunciones.activaridTipoBancoDisco,this,true,"idTipoBancoDisco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipobancodiscoConstantesFunciones.resaltaridTipoBancoDisco,this.tipobancodiscoConstantesFunciones.activaridTipoBancoDisco,this,true,"idTipoBancoDisco","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoBancoDisco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBancoDisco,TipoBancoDiscoConstantesFunciones.LABEL_CODIGO));

		if(this.tipobancodiscoConstantesFunciones.mostrarcodigoTipoBancoDisco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoBancoDiscoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipobancodiscoConstantesFunciones.resaltarcodigoTipoBancoDisco,this.tipobancodiscoConstantesFunciones.activarcodigoTipoBancoDisco,this,true,"codigoTipoBancoDisco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipobancodiscoConstantesFunciones.resaltarcodigoTipoBancoDisco,this.tipobancodiscoConstantesFunciones.activarcodigoTipoBancoDisco,this,true,"codigoTipoBancoDisco","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoBancoDiscoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoBancoDisco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBancoDisco,TipoBancoDiscoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipobancodiscoConstantesFunciones.mostrarnombreTipoBancoDisco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoBancoDiscoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipobancodiscoConstantesFunciones.resaltarnombreTipoBancoDisco,this.tipobancodiscoConstantesFunciones.activarnombreTipoBancoDisco,this,true,"nombreTipoBancoDisco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipobancodiscoConstantesFunciones.resaltarnombreTipoBancoDisco,this.tipobancodiscoConstantesFunciones.activarnombreTipoBancoDisco,this,true,"nombreTipoBancoDisco","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoBancoDiscoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipobancodiscoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipobancodiscoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipobancodiscoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoBancoDisco.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipobancodiscoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipobancodiscoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoBancoDisco.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoBancoDisco && this.isPermisoGuardarCambiosTipoBancoDisco) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipobancodiscoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipobancodiscoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoBancoDisco.addColumn(tableColumn);
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
			
			this.jTableDatosTipoBancoDisco.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoBancoDisco && this.isPermisoGuardarCambiosTipoBancoDisco) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoBancoDisco && this.isPermisoGuardarCambiosTipoBancoDisco) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoBancoDisco.moveColumn(this.jTableDatosTipoBancoDisco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoBancoDisco.moveColumn(this.jTableDatosTipoBancoDisco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoBancoDisco.moveColumn(this.jTableDatosTipoBancoDisco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoBancoDisco.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoBancoDisco.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoBancoDisco,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoBancoDiscoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoBancoDisco.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoBancoDisco.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoBancoDiscoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoBancoDiscoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoBancoDisco.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoBancoDisco.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoBancoDisco.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipobancodiscoLogic.getTipoBancoDiscos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipobancodiscos.size()-1;
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
		//this.jTableDatosTipoBancoDisco.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoBancoDisco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoBancoDisco();
			
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
				
				//this.isEsNuevoTipoBancoDisco=false;
					
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
			
				if(this.tipobancodiscoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoBancoDisco==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoBancoDisco.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoBancoDisco.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscoLogic.getTipoBancoDiscos().toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscos.toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipobancodisco.getsType().equals("DUPLICADO")
				   || this.tipobancodisco.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoBancoDisco=true;
				
				} else {
					this.isEsNuevoTipoBancoDisco=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipobancodisco.getId()>=0 && !this.tipobancodisco.getIsNew()) {						
						this.isEsNuevoTipoBancoDisco=false;
						
					} else {
						this.isEsNuevoTipoBancoDisco=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoBancoDisco(esRelaciones);						
				
				this.seleccionarTipoBancoDisco(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipobancodisco.getId()<0) {
					this.isEsNuevoTipoBancoDisco=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoBancoDisco(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoBancoDisco(evt,rowIndex);
				}	
				
				if(this.tipobancodiscoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoBancoDisco: " + this.dDif); 
					}
				}								
				
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoBancoDisco(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipobancodisco)) {
					if(this.tipobancodisco.getId()>0) {
						this.tipobancodisco.setIsDeleted(true);
						
						this.tipobancodiscosEliminados.add(this.tipobancodisco);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipobancodiscoLogic.getTipoBancoDiscos().remove(this.tipobancodisco);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipobancodiscos.remove(this.tipobancodisco);				
					}
					
					
					((TipoBancoDiscoModel) this.jTableDatosTipoBancoDisco.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoBancoDisco(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoBancoDisco(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoBancoDisco) {
			
			if(this.jInternalFrameDetalleFormTipoBancoDisco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoBancoDisco.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoBancoDisco.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscoLogic.getTipoBancoDiscos().toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscos.toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoBancoDiscoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoBancoDisco(this.tipobancodisco);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoBancoDisco("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoBancoDisco(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoBancoDisco() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoBancoDisco(TipoBancoDisco tipobancodisco) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoBancoDisco(tipobancodisco,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoBancoDisco(TipoBancoDisco tipobancodisco,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoBancoDisco(tipobancodisco);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoBancoDisco(tipobancodisco,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoBancoDisco(tipobancodisco);
	}
	
	public void setVariablesObjetoActualToFormularioTipoBancoDisco(TipoBancoDisco tipobancodisco) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoBancoDisco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoBancoDisco.jTextFieldidTipoBancoDisco.setText(tipobancodisco.getId().toString());
			this.jInternalFrameDetalleFormTipoBancoDisco.jTextFieldcodigoTipoBancoDisco.setText(tipobancodisco.getcodigo());
			this.jInternalFrameDetalleFormTipoBancoDisco.jTextAreanombreTipoBancoDisco.setText(tipobancodisco.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoBancoDisco tipobancodiscoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipobancodiscoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoBancoDisco tipobancodiscoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipobancodiscoLocal=this.tipobancodisco;
			} else {
				tipobancodiscoLocal=this.tipobancodiscoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipobancodiscoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoBancoDisco(tipobancodiscoLocal,true);
					
					if(tipobancodiscoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipobancodiscoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipobancodiscoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoBancoDisco(TipoBancoDisco tipobancodisco,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoBancoDisco(tipobancodisco,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoDisco(tipobancodisco);
	}
	
	public void setVariablesFormularioToObjetoActualTipoBancoDisco(TipoBancoDisco tipobancodisco,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoBancoDisco(tipobancodisco,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoBancoDisco(TipoBancoDisco tipobancodisco,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoBancoDisco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoBancoDisco.jTextFieldidTipoBancoDisco.getText()==null || this.jInternalFrameDetalleFormTipoBancoDisco.jTextFieldidTipoBancoDisco.getText()=="" || this.jInternalFrameDetalleFormTipoBancoDisco.jTextFieldidTipoBancoDisco.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoBancoDisco.jTextFieldidTipoBancoDisco.setText("0");
			}

			if(conColumnasBase) {tipobancodisco.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoBancoDisco.jTextFieldidTipoBancoDisco.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoBancoDiscoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBancoDisco.jLabelIdTipoBancoDisco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipobancodisco.setcodigo(this.jInternalFrameDetalleFormTipoBancoDisco.jTextFieldcodigoTipoBancoDisco.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoBancoDiscoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBancoDisco.jLabelcodigoTipoBancoDisco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipobancodisco.setnombre(this.jInternalFrameDetalleFormTipoBancoDisco.jTextAreanombreTipoBancoDisco.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoBancoDiscoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBancoDisco.jLabelnombreTipoBancoDisco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoBancoDisco(TipoBancoDisco tipobancodiscoBean,TipoBancoDisco tipobancodisco,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoBancoDisco(TipoBancoDisco tipobancodiscoOrigen,TipoBancoDisco tipobancodisco,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipobancodiscoOrigen.getId()!=null && !tipobancodiscoOrigen.getId().equals(0L))) {tipobancodisco.setId(tipobancodiscoOrigen.getId());}}
			if(conDefault || (!conDefault && tipobancodiscoOrigen.getcodigo()!=null && !tipobancodiscoOrigen.getcodigo().equals(""))) {tipobancodisco.setcodigo(tipobancodiscoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipobancodiscoOrigen.getnombre()!=null && !tipobancodiscoOrigen.getnombre().equals(""))) {tipobancodisco.setnombre(tipobancodiscoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoBancoDisco(TipoBancoDisco tipobancodisco) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoBancoDisco.jTextFieldidTipoBancoDisco.setText(tipobancodisco.getId().toString());
			this.jInternalFrameDetalleFormTipoBancoDisco.jTextFieldcodigoTipoBancoDisco.setText(tipobancodisco.getcodigo());
			this.jInternalFrameDetalleFormTipoBancoDisco.jTextAreanombreTipoBancoDisco.setText(tipobancodisco.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoBancoDisco(TipoBancoDiscoBean tipobancodiscoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoBancoDisco.jTextFieldidTipoBancoDisco.setText(tipobancodiscoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoBancoDisco.jTextFieldcodigoTipoBancoDisco.setText(tipobancodiscoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoBancoDisco.jTextAreanombreTipoBancoDisco.setText(tipobancodiscoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoBancoDisco(TipoBancoDiscoParameterReturnGeneral tipobancodiscoReturnGeneral,TipoBancoDiscoBean tipobancodiscoBean,Boolean conDefault) throws Exception { 
		try {
			TipoBancoDisco tipobancodiscoLocal=new TipoBancoDisco();
			
			tipobancodiscoLocal=tipobancodiscoReturnGeneral.getTipoBancoDisco();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipobancodiscoLocal.getId()!=null && !tipobancodiscoLocal.getId().equals(0L))) {tipobancodiscoBean.setId(tipobancodiscoLocal.getId());}}
			if(conDefault || (!conDefault && tipobancodiscoLocal.getcodigo()!=null && !tipobancodiscoLocal.getcodigo().equals(""))) {tipobancodiscoBean.setcodigo(tipobancodiscoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipobancodiscoLocal.getnombre()!=null && !tipobancodiscoLocal.getnombre().equals(""))) {tipobancodiscoBean.setnombre(tipobancodiscoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoBancoDiscoGenerico(Long idTipoBancoDiscoSeleccionado,JComboBox jComboBoxTipoBancoDisco,List<TipoBancoDisco> tipobancodiscosLocal)throws Exception {
		try {
			TipoBancoDisco  tipobancodiscoTemp=null;

			for(TipoBancoDisco tipobancodiscoAux:tipobancodiscosLocal) {
				if(tipobancodiscoAux.getId()!=null && tipobancodiscoAux.getId().equals(idTipoBancoDiscoSeleccionado)) {
					tipobancodiscoTemp=tipobancodiscoAux;
					break;
				}
			}

			jComboBoxTipoBancoDisco.setSelectedItem(tipobancodiscoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoBancoDiscoGenerico(JComboBox jComboBoxTipoBancoDisco,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoBancoDisco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoBancoDisco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoBancoDisco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoBancoDisco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoBancoDisco.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoBancoDisco.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoBancoDisco.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoBancoDisco.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoBancoDisco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoBancoDisco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipobancodisco=(TipoBancoDisco) tipobancodiscoLogic.getTipoBancoDiscos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipobancodisco =(TipoBancoDisco) tipobancodiscos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoBancoDisco tipobancodiscoRow=new TipoBancoDisco();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipobancodiscoRow=(TipoBancoDisco) tipobancodiscoLogic.getTipoBancoDiscos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipobancodiscoRow=(TipoBancoDisco) tipobancodiscos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoBancoDisco(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoBancoDisco.setVisible((this.isVisibilidadCeldaNuevoTipoBancoDisco && this.isPermisoNuevoTipoBancoDisco));			
			this.jButtonDuplicarTipoBancoDisco.setVisible((this.isVisibilidadCeldaDuplicarTipoBancoDisco && this.isPermisoDuplicarTipoBancoDisco));			
			this.jButtonCopiarTipoBancoDisco.setVisible((this.isVisibilidadCeldaCopiarTipoBancoDisco && this.isPermisoCopiarTipoBancoDisco));
			this.jButtonVerFormTipoBancoDisco.setVisible((this.isVisibilidadCeldaVerFormTipoBancoDisco && this.isPermisoVerFormTipoBancoDisco));
			
			this.jButtonAbrirOrderByTipoBancoDisco.setVisible((this.isVisibilidadCeldaOrdenTipoBancoDisco && this.isPermisoOrdenTipoBancoDisco));			
			
			this.jButtonNuevoRelacionesTipoBancoDisco.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoBancoDisco && this.isPermisoNuevoTipoBancoDisco));			
			this.jButtonNuevoGuardarCambiosTipoBancoDisco.setVisible((this.isVisibilidadCeldaNuevoTipoBancoDisco && this.isPermisoNuevoTipoBancoDisco && this.isPermisoGuardarCambiosTipoBancoDisco));
			
			if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) {
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonModificarTipoBancoDisco.setVisible((this.isVisibilidadCeldaModificarTipoBancoDisco && this.isPermisoActualizarTipoBancoDisco));	
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonActualizarTipoBancoDisco.setVisible((this.isVisibilidadCeldaActualizarTipoBancoDisco && this.isPermisoActualizarTipoBancoDisco));	
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonEliminarTipoBancoDisco.setVisible((this.isVisibilidadCeldaEliminarTipoBancoDisco && this.isPermisoEliminarTipoBancoDisco));
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonCancelarTipoBancoDisco.setVisible(this.isVisibilidadCeldaCancelarTipoBancoDisco);							
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonGuardarCambiosTipoBancoDisco.setVisible((this.isVisibilidadCeldaGuardarTipoBancoDisco && this.isPermisoGuardarCambiosTipoBancoDisco));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoBancoDisco.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoBancoDisco && this.isPermisoGuardarCambiosTipoBancoDisco));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoBancoDisco.setVisible((this.isVisibilidadCeldaNuevoTipoBancoDisco && this.isPermisoNuevoTipoBancoDisco));						
			this.jButtonDuplicarToolBarTipoBancoDisco.setVisible((this.isVisibilidadCeldaDuplicarTipoBancoDisco && this.isPermisoDuplicarTipoBancoDisco));						
			this.jButtonCopiarToolBarTipoBancoDisco.setVisible((this.isVisibilidadCeldaCopiarTipoBancoDisco && this.isPermisoCopiarTipoBancoDisco));			
			this.jButtonVerFormToolBarTipoBancoDisco.setVisible((this.isVisibilidadCeldaVerFormTipoBancoDisco && this.isPermisoVerFormTipoBancoDisco));			
			this.jButtonAbrirOrderByToolBarTipoBancoDisco.setVisible((this.isVisibilidadCeldaOrdenTipoBancoDisco && this.isPermisoOrdenTipoBancoDisco));
			this.jButtonNuevoRelacionesToolBarTipoBancoDisco.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoBancoDisco && this.isPermisoNuevoTipoBancoDisco));			
			this.jButtonNuevoGuardarCambiosToolBarTipoBancoDisco.setVisible((this.isVisibilidadCeldaNuevoTipoBancoDisco && this.isPermisoNuevoTipoBancoDisco && this.isPermisoGuardarCambiosTipoBancoDisco));			
			
			if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) {
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonModificarToolBarTipoBancoDisco.setVisible((this.isVisibilidadCeldaModificarTipoBancoDisco && this.isPermisoActualizarTipoBancoDisco));	
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonActualizarToolBarTipoBancoDisco.setVisible((this.isVisibilidadCeldaActualizarTipoBancoDisco  && this.isPermisoActualizarTipoBancoDisco));	
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonEliminarToolBarTipoBancoDisco.setVisible((this.isVisibilidadCeldaEliminarTipoBancoDisco && this.isPermisoEliminarTipoBancoDisco));
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonCancelarToolBarTipoBancoDisco.setVisible(this.isVisibilidadCeldaCancelarTipoBancoDisco);				
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonGuardarCambiosToolBarTipoBancoDisco.setVisible((this.isVisibilidadCeldaGuardarTipoBancoDisco && this.isPermisoGuardarCambiosTipoBancoDisco));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoBancoDisco.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoBancoDisco && this.isPermisoGuardarCambiosTipoBancoDisco));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoBancoDisco.setVisible((this.isVisibilidadCeldaNuevoTipoBancoDisco && this.isPermisoNuevoTipoBancoDisco));			
			this.jMenuItemDuplicarTipoBancoDisco.setVisible((this.isVisibilidadCeldaDuplicarTipoBancoDisco && this.isPermisoDuplicarTipoBancoDisco));			
			this.jMenuItemCopiarTipoBancoDisco.setVisible((this.isVisibilidadCeldaCopiarTipoBancoDisco && this.isPermisoCopiarTipoBancoDisco));			
			this.jMenuItemVerFormTipoBancoDisco.setVisible((this.isVisibilidadCeldaVerFormTipoBancoDisco && this.isPermisoVerFormTipoBancoDisco));			
			this.jMenuItemAbrirOrderByTipoBancoDisco.setVisible((this.isVisibilidadCeldaOrdenTipoBancoDisco && this.isPermisoOrdenTipoBancoDisco));			
			//this.jMenuItemMostrarOcultarTipoBancoDisco.setVisible((this.isVisibilidadCeldaOrdenTipoBancoDisco && this.isPermisoOrdenTipoBancoDisco));
			this.jMenuItemDetalleAbrirOrderByTipoBancoDisco.setVisible((this.isVisibilidadCeldaOrdenTipoBancoDisco && this.isPermisoOrdenTipoBancoDisco));			
			//this.jMenuItemDetalleMostrarOcultarTipoBancoDisco.setVisible((this.isVisibilidadCeldaOrdenTipoBancoDisco && this.isPermisoOrdenTipoBancoDisco));			
			this.jMenuItemNuevoRelacionesTipoBancoDisco.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoBancoDisco && this.isPermisoNuevoTipoBancoDisco));			
			this.jMenuItemNuevoGuardarCambiosTipoBancoDisco.setVisible((this.isVisibilidadCeldaNuevoTipoBancoDisco && this.isPermisoNuevoTipoBancoDisco && this.isPermisoGuardarCambiosTipoBancoDisco));									
			
			if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) {
			this.jInternalFrameDetalleFormTipoBancoDisco.jMenuItemModificarTipoBancoDisco.setVisible((this.isVisibilidadCeldaModificarTipoBancoDisco && this.isPermisoActualizarTipoBancoDisco));	
			this.jInternalFrameDetalleFormTipoBancoDisco.jMenuItemActualizarTipoBancoDisco.setVisible((this.isVisibilidadCeldaActualizarTipoBancoDisco && this.isPermisoActualizarTipoBancoDisco));	
			this.jInternalFrameDetalleFormTipoBancoDisco.jMenuItemEliminarTipoBancoDisco.setVisible((this.isVisibilidadCeldaEliminarTipoBancoDisco && this.isPermisoEliminarTipoBancoDisco));
			this.jInternalFrameDetalleFormTipoBancoDisco.jMenuItemCancelarTipoBancoDisco.setVisible(this.isVisibilidadCeldaCancelarTipoBancoDisco);				
			}
			
			this.jMenuItemGuardarCambiosTipoBancoDisco.setVisible((this.isVisibilidadCeldaGuardarTipoBancoDisco && this.isPermisoGuardarCambiosTipoBancoDisco));						
			this.jMenuItemGuardarCambiosTablaTipoBancoDisco.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoBancoDisco && this.isPermisoGuardarCambiosTipoBancoDisco));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoBancoDisco=this.jButtonNuevoTipoBancoDisco.isVisible();
			this.isVisibilidadCeldaDuplicarTipoBancoDisco=this.jButtonDuplicarTipoBancoDisco.isVisible();
			this.isVisibilidadCeldaCopiarTipoBancoDisco=this.jButtonCopiarTipoBancoDisco.isVisible();
			this.isVisibilidadCeldaVerFormTipoBancoDisco=this.jButtonVerFormTipoBancoDisco.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoBancoDisco=this.jButtonAbrirOrderByTipoBancoDisco.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoDisco=this.jButtonNuevoRelacionesTipoBancoDisco.isVisible();
			this.isVisibilidadCeldaModificarTipoBancoDisco=this.jButtonModificarTipoBancoDisco.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) {
			this.isVisibilidadCeldaActualizarTipoBancoDisco=this.jInternalFrameDetalleFormTipoBancoDisco.jButtonActualizarTipoBancoDisco.isVisible();
			this.isVisibilidadCeldaEliminarTipoBancoDisco=this.jInternalFrameDetalleFormTipoBancoDisco.jButtonEliminarTipoBancoDisco.isVisible();
			this.isVisibilidadCeldaCancelarTipoBancoDisco=this.jInternalFrameDetalleFormTipoBancoDisco.jButtonCancelarTipoBancoDisco.isVisible();
			this.isVisibilidadCeldaGuardarTipoBancoDisco=this.jInternalFrameDetalleFormTipoBancoDisco.jButtonGuardarCambiosTipoBancoDisco.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoBancoDisco=this.jButtonGuardarCambiosTablaTipoBancoDisco.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoBancoDisco=this.jButtonNuevoToolBarTipoBancoDisco.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoDisco=this.jButtonNuevoRelacionesToolBarTipoBancoDisco.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) {
			this.isVisibilidadCeldaModificarTipoBancoDisco=this.jInternalFrameDetalleFormTipoBancoDisco.jButtonModificarToolBarTipoBancoDisco.isVisible();
			this.isVisibilidadCeldaActualizarTipoBancoDisco=this.jInternalFrameDetalleFormTipoBancoDisco.jButtonActualizarToolBarTipoBancoDisco.isVisible();
			this.isVisibilidadCeldaEliminarTipoBancoDisco=this.jInternalFrameDetalleFormTipoBancoDisco.jButtonEliminarToolBarTipoBancoDisco.isVisible();
			this.isVisibilidadCeldaCancelarTipoBancoDisco=this.jInternalFrameDetalleFormTipoBancoDisco.jButtonCancelarToolBarTipoBancoDisco.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoBancoDisco=this.jButtonGuardarCambiosToolBarTipoBancoDisco.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoBancoDisco=this.jButtonGuardarCambiosTablaToolBarTipoBancoDisco.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoBancoDisco=this.jMenuItemNuevoTipoBancoDisco.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoDisco=this.jMenuItemNuevoRelacionesTipoBancoDisco.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) {
			this.isVisibilidadCeldaModificarTipoBancoDisco=this.jInternalFrameDetalleFormTipoBancoDisco.jMenuItemModificarTipoBancoDisco.isVisible();
			this.isVisibilidadCeldaActualizarTipoBancoDisco=this.jInternalFrameDetalleFormTipoBancoDisco.jMenuItemActualizarTipoBancoDisco.isVisible();
			this.isVisibilidadCeldaEliminarTipoBancoDisco=this.jInternalFrameDetalleFormTipoBancoDisco.jMenuItemEliminarTipoBancoDisco.isVisible();
			this.isVisibilidadCeldaCancelarTipoBancoDisco=this.jInternalFrameDetalleFormTipoBancoDisco.jMenuItemCancelarTipoBancoDisco.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoBancoDisco=this.jMenuItemGuardarCambiosTipoBancoDisco.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoBancoDisco=this.jMenuItemGuardarCambiosTablaTipoBancoDisco.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoBancoDisco(Boolean esInicializar) {
		if(TipoBancoDiscoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipobancodiscoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoBancoDisco();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoBancoDisco(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoBancoDisco() {
		this.jButtonNuevoTipoBancoDisco.setVisible(this.isPermisoNuevoTipoBancoDisco);			
		this.jButtonDuplicarTipoBancoDisco.setVisible(this.isPermisoDuplicarTipoBancoDisco);			
		this.jButtonCopiarTipoBancoDisco.setVisible(this.isPermisoCopiarTipoBancoDisco);			
		this.jButtonVerFormTipoBancoDisco.setVisible(this.isPermisoVerFormTipoBancoDisco);			
		
		this.jButtonAbrirOrderByTipoBancoDisco.setVisible(this.isPermisoOrdenTipoBancoDisco);					
		
		this.jButtonNuevoRelacionesTipoBancoDisco.setVisible(this.isPermisoNuevoTipoBancoDisco);			
		
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonModificarTipoBancoDisco.setVisible(this.isPermisoActualizarTipoBancoDisco);	
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonActualizarTipoBancoDisco.setVisible(this.isPermisoActualizarTipoBancoDisco);	
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonEliminarTipoBancoDisco.setVisible(this.isPermisoEliminarTipoBancoDisco);
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonCancelarTipoBancoDisco.setVisible(this.isVisibilidadCeldaCancelarTipoBancoDisco);						
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonGuardarCambiosTipoBancoDisco.setVisible(this.isPermisoGuardarCambiosTipoBancoDisco);							
		}
		
		this.jButtonGuardarCambiosTablaTipoBancoDisco.setVisible(this.isPermisoActualizarTipoBancoDisco);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoBancoDisco() {
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtonModificarTipoBancoDisco.setVisible(this.isPermisoActualizarTipoBancoDisco);	
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtonActualizarTipoBancoDisco.setVisible(this.isPermisoActualizarTipoBancoDisco);	
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtonEliminarTipoBancoDisco.setVisible(this.isPermisoEliminarTipoBancoDisco);
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtonCancelarTipoBancoDisco.setVisible(this.isVisibilidadCeldaCancelarTipoBancoDisco);							
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtonGuardarCambiosTipoBancoDisco.setVisible((this.isVisibilidadCeldaGuardarTipoBancoDisco && this.isPermisoGuardarCambiosTipoBancoDisco));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoBancoDisco() {
		if(TipoBancoDiscoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoBancoDisco();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoBancoDisco() {
	}
	
	public void jTableDatosTipoBancoDiscoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoBancoDisco(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoBancoDiscoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancodiscoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoBancoDisco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoBancoDisco(this.gettipobancodisco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoDisco(this.tipobancodisco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscoLogic.getTipoBancoDiscos().toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscos.toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipobancodisco==null) {
						this.tipobancodisco = new TipoBancoDisco();
					}

					this.setVariablesFormularioToObjetoActualTipoBancoDisco(this.tipobancodisco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoDisco(this.tipobancodisco);
				}

				if(this.tipobancodisco.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipobancodisco.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoBancoDisco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancodiscoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancodiscoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancodiscoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoBancoDiscoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancodiscoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoBancoDisco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoBancoDisco(this.gettipobancodisco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoDisco(this.tipobancodisco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscoLogic.getTipoBancoDiscos().toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscos.toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipobancodisco==null) {
						this.tipobancodisco = new TipoBancoDisco();
					}

					this.setVariablesFormularioToObjetoActualTipoBancoDisco(this.tipobancodisco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoDisco(this.tipobancodisco);
				}

				if(this.tipobancodisco.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipobancodisco.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoBancoDisco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancodiscoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancodiscoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancodiscoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoBancoDiscoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancodiscoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoBancoDisco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoBancoDisco(this.gettipobancodisco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoDisco(this.tipobancodisco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscoLogic.getTipoBancoDiscos().toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscos.toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipobancodisco==null) {
						this.tipobancodisco = new TipoBancoDisco();
					}

					this.setVariablesFormularioToObjetoActualTipoBancoDisco(this.tipobancodisco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoDisco(this.tipobancodisco);
				}

				if(this.tipobancodisco.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipobancodisco.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoBancoDisco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancodiscoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancodiscoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancodiscoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoBancoDisco() {
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) {
			this.jInternalFrameDetalleFormTipoBancoDisco.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoBancoDisco.dispose();
			this.jInternalFrameDetalleFormTipoBancoDisco=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoBancoDisco!=null) {
			this.jInternalFrameReporteDinamicoTipoBancoDisco.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoBancoDisco.dispose();
			this.jInternalFrameReporteDinamicoTipoBancoDisco=null;
		}
		
		if(this.jInternalFrameImportacionTipoBancoDisco!=null) {
			this.jInternalFrameImportacionTipoBancoDisco.setVisible(false);	    			
			this.jInternalFrameImportacionTipoBancoDisco.dispose();
			this.jInternalFrameImportacionTipoBancoDisco=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoBancoDisco();
			
			TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoBancoDisco")) {
				jButtonNuevoTipoBancoDiscoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoBancoDisco")) {
				jButtonDuplicarTipoBancoDiscoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoBancoDisco")) {
				jButtonCopiarTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoBancoDisco")) {
				jButtonVerFormTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoBancoDisco")) {
				jButtonNuevoTipoBancoDiscoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoBancoDisco")) {
				jButtonDuplicarTipoBancoDiscoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoBancoDisco")) {
				jButtonNuevoTipoBancoDiscoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoBancoDisco")) {
				jButtonDuplicarTipoBancoDiscoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoBancoDisco")) {
				jButtonNuevoTipoBancoDiscoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoBancoDisco")) {
				jButtonNuevoTipoBancoDiscoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoBancoDisco")) {
				jButtonNuevoTipoBancoDiscoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoBancoDisco")) {
				jButtonModificarTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoBancoDisco")) {
				jButtonModificarTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoBancoDisco")) {
				jButtonModificarTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoBancoDisco")) {
				jButtonActualizarTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoBancoDisco")) {
				jButtonActualizarTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoBancoDisco")) {
				jButtonActualizarTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoBancoDisco")) {
				jButtonEliminarTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoBancoDisco")) {
				jButtonEliminarTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoBancoDisco")) {
				jButtonEliminarTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoBancoDisco")) {
				jButtonCancelarTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoBancoDisco")) {
				jButtonCancelarTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoBancoDisco")) {
				jButtonCancelarTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoBancoDisco")) {
				jButtonCerrarTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoBancoDisco")) {
				jButtonCerrarTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoBancoDisco")) {
				jButtonCerrarTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoBancoDisco")) {
				jButtonMostrarOcultarTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoBancoDisco")) {
				jButtonCancelarTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoBancoDisco")) {
				jButtonGuardarCambiosTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoBancoDisco")) {
				jButtonGuardarCambiosTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoBancoDisco")) {
				jButtonCopiarTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoBancoDisco")) {
				jButtonVerFormTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoBancoDisco")) {
				jButtonGuardarCambiosTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoBancoDisco")) {
				jButtonCopiarTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoBancoDisco")) {
				jButtonVerFormTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoBancoDisco")) {
				jButtonGuardarCambiosTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoBancoDisco")) {
				jButtonGuardarCambiosTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoBancoDisco")) {
				jButtonGuardarCambiosTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoBancoDisco")) {
				jButtonRecargarInformacionTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoBancoDisco")) {
				jButtonRecargarInformacionTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoBancoDisco")) {
				jButtonRecargarInformacionTipoBancoDiscoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoBancoDisco")) {
				jButtonAnterioresTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoBancoDisco")) {
				jButtonAnterioresTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoBancoDisco")) {
				jButtonAnterioresTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoBancoDisco")) {
				jButtonSiguientesTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoBancoDisco")) {
				jButtonSiguientesTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoBancoDisco")) {
				jButtonSiguientesTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoBancoDisco") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoBancoDisco")) {
				jButtonAbrirOrderByTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoBancoDisco") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoBancoDisco")) {
				jButtonMostrarOcultarTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoBancoDisco")) {
				jButtonNuevoGuardarCambiosTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoBancoDisco")) {
				jButtonNuevoGuardarCambiosTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoBancoDisco")) {
				jButtonNuevoGuardarCambiosTipoBancoDiscoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoBancoDisco")) {
				jButtonCerrarReporteDinamicoTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoBancoDisco")) {
				jButtonGenerarReporteDinamicoTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoBancoDisco")) {
				
				jButtonGenerarExcelReporteDinamicoTipoBancoDiscoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoBancoDisco")) {
				jButtonCerrarImportacionTipoBancoDiscoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoBancoDisco")) {
				
				jButtonGenerarImportacionTipoBancoDiscoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoBancoDisco")) {
				
				jButtonAbrirImportacionTipoBancoDiscoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoBancoDisco")) {
				jComboBoxTiposAccionesTipoBancoDiscoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoBancoDisco")) {
				jComboBoxTiposRelacionesTipoBancoDiscoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoBancoDisco")) {
				jComboBoxTiposAccionesTipoBancoDiscoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoBancoDisco")) {
				
				jComboBoxTiposSeleccionarTipoBancoDiscoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoBancoDisco")) {
				jTextFieldValorCampoGeneralTipoBancoDiscoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoBancoDisco")) {
				jButtonAbrirOrderByTipoBancoDiscoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoBancoDisco")) {
				jButtonAbrirOrderByTipoBancoDiscoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoBancoDisco")) {
				jButtonCerrarOrderByTipoBancoDiscoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoBancoDiscoBusqueda")) {
				this.jButtonidTipoBancoDiscoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoBancoDiscoBusqueda")) {
				this.jButtoncodigoTipoBancoDiscoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoBancoDiscoBusqueda")) {
				this.jButtonnombreTipoBancoDiscoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoBancoDisco();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoDiscoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancodisco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancodisco);
				
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
				
				


				
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoDisco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoDisco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoBancoDisco tipobancodiscoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipobancodiscoLocal=this.tipobancodisco;
			} else {
				tipobancodiscoLocal=this.tipobancodiscoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancodisco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancodisco);
				
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
							
				
				


				
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoDisco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoDisco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoDiscoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBancoDisco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancodiscoAnterior =(TipoBancoDisco) this.tipobancodiscoLogic.getTipoBancoDiscos().toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancodiscoAnterior =(TipoBancoDisco) this.tipobancodiscos.toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
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
			
			TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
			
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
			
			


			
			TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoDiscoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancodisco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancodisco);
				
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
								
						
				


				
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoDisco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoDisco.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancodisco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancodisco);
				
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
								
				
				


				
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoDisco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoDisco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoDiscoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBancoDisco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancodiscoAnterior =(TipoBancoDisco) this.tipobancodiscoLogic.getTipoBancoDiscos().toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancodiscoAnterior =(TipoBancoDisco) this.tipobancodiscos.toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancodisco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancodisco);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoDiscoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBancoDisco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancodiscoAnterior =(TipoBancoDisco) this.tipobancodiscoLogic.getTipoBancoDiscos().toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancodiscoAnterior =(TipoBancoDisco) this.tipobancodiscos.toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoDiscoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancodisco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipobancodisco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancodisco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancodisco);
				
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
							
				
				


				
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoDisco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoDisco.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoDiscoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoBancoDisco.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobancodiscoAnterior =(TipoBancoDisco) this.tipobancodiscoLogic.getTipoBancoDiscos().toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipobancodiscoAnterior =(TipoBancoDisco) this.tipobancodiscos.toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
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
			
			TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
			
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
			
			


			
			TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoDiscoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancodisco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipobancodisco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancodisco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancodisco);
				
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
								
				
				


				
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoDisco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoDisco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoDiscoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBancoDisco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancodiscoAnterior =(TipoBancoDisco) this.tipobancodiscoLogic.getTipoBancoDiscos().toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancodiscoAnterior =(TipoBancoDisco) this.tipobancodiscos.toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoDiscoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancodisco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipobancodisco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoDiscoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancodisco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancodisco);
				
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoBancoDisco")) {
					jCheckBoxSeleccionarTodosTipoBancoDiscoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoBancoDisco")) {
					jCheckBoxSeleccionadosTipoBancoDiscoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoBancoDisco")) {
					
				}
				
				


				
				
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoDisco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoDisco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancodisco);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipobancodisco);
				
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
												
				
				


				
				
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoDisco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoDisco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoDiscoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoBancoDisco.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobancodiscoAnterior =(TipoBancoDisco) this.tipobancodiscoLogic.getTipoBancoDiscos().toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipobancodiscoAnterior =(TipoBancoDisco) this.tipobancodiscos.toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoDiscoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancodisco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancodisco);
				
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
				
				
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
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
			
			TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
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
			
			


			
			TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoDiscoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancodisco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancodisco);
				
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoDisco.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoDisco.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancodisco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancodisco);
				
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
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
				
				


				
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoDisco.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoDisco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoDiscoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBancoDisco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancodiscoAnterior =(TipoBancoDisco) this.tipobancodiscoLogic.getTipoBancoDiscos().toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancodiscoAnterior =(TipoBancoDisco) this.tipobancodiscos.toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoBancoDisco")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoBancoDiscoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoBancoDisco.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscoLogic.getTipoBancoDiscos().toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipobancodisco =(TipoBancoDisco) this.tipobancodiscos.toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipobancodisco);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoBancoDisco")) {
				
				}
				
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoBancoDisco")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoBancoDisco.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoBancoDisco")) {
			
			}
			
			TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoBancoDisco();
			
			TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoBancoDisco")) {
				jButtonNuevoTipoBancoDiscoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoBancoDisco")) {
				jButtonDuplicarTipoBancoDiscoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoBancoDisco")) {
				jButtonCopiarTipoBancoDiscoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoBancoDisco")) {
				jButtonVerFormTipoBancoDiscoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoBancoDisco")) {
				jButtonNuevoTipoBancoDiscoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoBancoDisco")) {
				jButtonModificarTipoBancoDiscoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoBancoDisco")) {
				jButtonActualizarTipoBancoDiscoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoBancoDisco")) {
				jButtonEliminarTipoBancoDiscoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoBancoDisco")) {
				jButtonGuardarCambiosTipoBancoDiscoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoBancoDisco")) {
				jButtonCancelarTipoBancoDiscoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoBancoDisco")) {
				jButtonCerrarTipoBancoDiscoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoBancoDisco")) {
				jButtonGuardarCambiosTipoBancoDiscoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoBancoDisco")) {
				jButtonNuevoGuardarCambiosTipoBancoDiscoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoBancoDisco")) {
				jButtonAbrirOrderByTipoBancoDiscoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoBancoDisco")) {
				jButtonRecargarInformacionTipoBancoDiscoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoBancoDisco")) {
				jButtonAnterioresTipoBancoDiscoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoBancoDisco")) {
				jButtonSiguientesTipoBancoDiscoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoBancoDiscoBusqueda")) {
				this.jButtonidTipoBancoDiscoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoBancoDiscoBusqueda")) {
				this.jButtoncodigoTipoBancoDiscoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoBancoDiscoBusqueda")) {
				this.jButtonnombreTipoBancoDiscoBusquedaActionPerformed(evt);
			}
			
			TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoBancoDisco();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoBancoDisco")) {
				closingInternalFrameTipoBancoDisco();
				
			} else if(sTipo.equals("jButtonCancelarTipoBancoDisco")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoBancoDisco = (JInternalFrameBase)evt.getSource();
	            	
	            TipoBancoDiscoBeanSwingJInternalFrame jInternalFrameParent=(TipoBancoDiscoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoBancoDisco.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoBancoDiscoActionPerformed(null);
			}
			
			TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipobancodisco,new Object(),this.tipobancodiscoParameterGeneral,this.tipobancodiscoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoBancoDisco(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoBancoDisco(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoBancoDisco(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipobancodisco)) {
			if(!esControlTabla) {
				if(TipoBancoDiscoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoBancoDisco(this.tipobancodisco,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoDisco(this.tipobancodisco);			
				}
				
				if(this.tipobancodiscoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoBancoDisco(this.tipobancodisco,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipobancodiscoReturnGeneral=tipobancodiscoLogic.procesarEventosTipoBancoDiscosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipobancodiscoLogic.getTipoBancoDiscos(),this.tipobancodisco,this.tipobancodiscoParameterGeneral,this.isEsNuevoTipoBancoDisco,classes);//this.tipobancodiscoLogic.getTipoBancoDisco()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoBancoDisco(this.tipobancodiscoReturnGeneral,this.tipobancodiscoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipobancodiscoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoBancoDisco(classes,this.tipobancodiscoReturnGeneral,this.tipobancodiscoBean,false);
					}
						
					if(this.tipobancodiscoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoBancoDisco(this.tipobancodiscoReturnGeneral.getTipoBancoDisco());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoBancoDisco(this.tipobancodiscoReturnGeneral.getTipoBancoDisco());	
					}
						
					if(this.tipobancodiscoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoBancoDisco(this.tipobancodiscoReturnGeneral.getTipoBancoDisco(),classes);//this.tipobancodiscoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoBancoDisco(this.tipobancodisco,classes);//this.tipobancodiscoBean);									
				}
			
				if(TipoBancoDiscoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoBancoDisco(this.tipobancodisco,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoDisco(this.tipobancodisco);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipobancodiscoAnterior!=null) {
						this.tipobancodisco=this.tipobancodiscoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipobancodiscoReturnGeneral=tipobancodiscoLogic.procesarEventosTipoBancoDiscosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipobancodiscoLogic.getTipoBancoDiscos(),this.tipobancodisco,this.tipobancodiscoParameterGeneral,this.isEsNuevoTipoBancoDisco,classes);//this.tipobancodiscoLogic.getTipoBancoDisco()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipobancodiscoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipobancodiscoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipobancodiscoReturnGeneral.getTipoBancoDisco(),tipobancodiscoLogic.getTipoBancoDiscos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipobancodiscoReturnGeneral.getTipoBancoDisco(),this.tipobancodiscos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoBancoDisco.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoBancoDisco.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoBancoDisco();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoBancoDisco() throws Exception {
		
		TipoBancoDiscoModel tipobancodiscoModel=(TipoBancoDiscoModel)this.jTableDatosTipoBancoDisco.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipobancodiscoModel.tipobancodiscos=this.tipobancodiscoLogic.getTipoBancoDiscos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipobancodiscoModel.tipobancodiscos=this.tipobancodiscos;
		}
		
		
		((TipoBancoDiscoModel) this.jTableDatosTipoBancoDisco.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoBancoDisco() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipobancodiscoAnterior(),this.tipobancodiscoLogic.getTipoBancoDiscos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipobancodiscoAnterior(),this.tipobancodiscos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoBancoDisco();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoBancoDisco(TipoBancoDisco tipobancodisco,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
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
										
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipobancodisco,new Object(),generalEntityParameterGeneral,this.tipobancodiscoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipobancodiscoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoBancoDiscoConstantesFunciones.getClassesRelationshipsOfTipoBancoDisco(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoBancoDiscoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoBancoDisco(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoBancoDisco(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoBancoDiscoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipobancodisco,new Object(),generalEntityParameterGeneral,this.tipobancodiscoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoBancoDisco(TipoBancoDiscoBean tipobancodiscoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoBancoDisco(ArrayList<Classe> classes,TipoBancoDiscoReturnGeneral tipobancodiscoReturnGeneral,TipoBancoDiscoBean tipobancodiscoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoBancoDisco(TipoBancoDisco tipobancodisco,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipobancodisco)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoBancoDisco = new TipoBancoDiscoDetalleFormJInternalFrame(jDesktopPane,this.tipobancodiscoSessionBean.getConGuardarRelaciones(),this.tipobancodiscoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoBancoDisco);
		this.jInternalFrameDetalleFormTipoBancoDisco.setVisible(false);
		this.jInternalFrameDetalleFormTipoBancoDisco.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoBancoDisco.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoBancoDisco.tipobancodiscoLogic=this.tipobancodiscoLogic;
		
		this.cargarCombosFrameForeignKeyTipoBancoDisco("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoBancoDisco();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoBancoDisco();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoBancoDisco("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoBancoDisco();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoBancoDisco.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoBancoDisco"));
		
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtonModificarTipoBancoDisco.addActionListener(new ButtonActionListener(this,"ModificarTipoBancoDisco"));

		
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtonModificarToolBarTipoBancoDisco.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoBancoDisco"));
					
		this.jInternalFrameDetalleFormTipoBancoDisco.jMenuItemModificarTipoBancoDisco.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoBancoDisco"));		
		
		
		
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtonActualizarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"ActualizarTipoBancoDisco"));
		
		
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtonActualizarToolBarTipoBancoDisco.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoBancoDisco"));
						
		this.jInternalFrameDetalleFormTipoBancoDisco.jMenuItemActualizarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoBancoDisco"));		
		
		
		
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtonEliminarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"EliminarTipoBancoDisco"));
		
		
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtonEliminarToolBarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoBancoDisco"));
								
		this.jInternalFrameDetalleFormTipoBancoDisco.jMenuItemEliminarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoBancoDisco"));		
		
		
		
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtonCancelarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"CancelarTipoBancoDisco"));
		
		
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtonCancelarToolBarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoBancoDisco"));
					
		this.jInternalFrameDetalleFormTipoBancoDisco.jMenuItemCancelarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoBancoDisco"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoBancoDisco.jMenuItemDetalleCerrarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoBancoDisco"));		
		
		
		
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtonGuardarCambiosToolBarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoBancoDisco"));
		
		
		
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtonGuardarCambiosToolBarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoBancoDisco"));
		
		
		
		this.jInternalFrameDetalleFormTipoBancoDisco.jComboBoxTiposAccionesFormularioTipoBancoDisco.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoBancoDisco"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtonidTipoBancoDiscoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoBancoDiscoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtoncodigoTipoBancoDiscoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoBancoDiscoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtonnombreTipoBancoDiscoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoBancoDiscoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoBancoDisco.jTabbedPaneRelacionesTipoBancoDisco.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoBancoDisco"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoBancoDisco"));
		
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoDisco.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoBancoDisco"));
		}
		
		this.jTableDatosTipoBancoDisco.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoBancoDisco"));
		
		this.jTableDatosTipoBancoDisco.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoBancoDisco"));
		
		this.jButtonNuevoTipoBancoDisco.addActionListener(new ButtonActionListener(this,"NuevoTipoBancoDisco"));
		
		this.jButtonDuplicarTipoBancoDisco.addActionListener(new ButtonActionListener(this,"DuplicarTipoBancoDisco"));
		
		this.jButtonCopiarTipoBancoDisco.addActionListener(new ButtonActionListener(this,"CopiarTipoBancoDisco"));
		
		this.jButtonVerFormTipoBancoDisco.addActionListener(new ButtonActionListener(this,"VerFormTipoBancoDisco"));
		
		
		this.jButtonNuevoToolBarTipoBancoDisco.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoBancoDisco"));
			
		this.jButtonDuplicarToolBarTipoBancoDisco.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoBancoDisco"));
			
		this.jMenuItemNuevoTipoBancoDisco.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoBancoDisco"));
			
		this.jMenuItemDuplicarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoBancoDisco"));		
		
		
		this.jButtonNuevoRelacionesTipoBancoDisco.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoBancoDisco"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoBancoDisco.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoBancoDisco"));
			
		this.jMenuItemNuevoRelacionesTipoBancoDisco.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoBancoDisco"));		
		
		
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonModificarTipoBancoDisco.addActionListener(new ButtonActionListener(this,"ModificarTipoBancoDisco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonModificarToolBarTipoBancoDisco.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoBancoDisco"));
			
			this.jInternalFrameDetalleFormTipoBancoDisco.jMenuItemModificarTipoBancoDisco.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoBancoDisco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonActualizarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"ActualizarTipoBancoDisco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonActualizarToolBarTipoBancoDisco.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoBancoDisco"));
				
			this.jInternalFrameDetalleFormTipoBancoDisco.jMenuItemActualizarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoBancoDisco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonEliminarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"EliminarTipoBancoDisco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonEliminarToolBarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoBancoDisco"));
						
			this.jInternalFrameDetalleFormTipoBancoDisco.jMenuItemEliminarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoBancoDisco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonCancelarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"CancelarTipoBancoDisco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonCancelarToolBarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoBancoDisco"));
			
			this.jInternalFrameDetalleFormTipoBancoDisco.jMenuItemCancelarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoBancoDisco"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoBancoDisco"));		
		
		
		this.jButtonCerrarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"CerrarTipoBancoDisco"));
		
		
		this.jButtonCerrarToolBarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoBancoDisco"));
			
		this.jMenuItemCerrarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoBancoDisco"));
			
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoDisco.jMenuItemDetalleCerrarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoBancoDisco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonGuardarCambiosTipoBancoDisco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoBancoDisco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoDisco.jButtonGuardarCambiosToolBarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoBancoDisco"));
		}
		
		this.jButtonCopiarToolBarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoBancoDisco"));
			
		this.jButtonVerFormToolBarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoBancoDisco"));
		
		this.jMenuItemGuardarCambiosTipoBancoDisco.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoBancoDisco"));
			
		this.jMenuItemCopiarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoBancoDisco"));		
		
		this.jMenuItemVerFormTipoBancoDisco.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoBancoDisco"));		
		
		
		this.jButtonGuardarCambiosTablaTipoBancoDisco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoBancoDisco"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoBancoDisco"));
			
		this.jMenuItemGuardarCambiosTablaTipoBancoDisco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoBancoDisco"));		
		
		
		
		this.jButtonRecargarInformacionTipoBancoDisco.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoBancoDisco"));
					
		this.jButtonRecargarInformacionToolBarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoBancoDisco"));
		
		this.jMenuItemRecargarInformacionTipoBancoDisco.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoBancoDisco"));		
		
		
		
		this.jButtonAnterioresTipoBancoDisco.addActionListener (new ButtonActionListener(this,"AnterioresTipoBancoDisco"));
		
		
		this.jButtonAnterioresToolBarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoBancoDisco"));
		
		this.jMenuItemAnterioresTipoBancoDisco.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoBancoDisco"));		
		
		
		this.jButtonSiguientesTipoBancoDisco.addActionListener (new ButtonActionListener(this,"SiguientesTipoBancoDisco"));
		
		
		this.jButtonSiguientesToolBarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoBancoDisco"));
			
		this.jMenuItemSiguientesTipoBancoDisco.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoBancoDisco"));
			
		this.jMenuItemAbrirOrderByTipoBancoDisco.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoBancoDisco"));
			
		this.jMenuItemMostrarOcultarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoBancoDisco"));
			
		this.jMenuItemDetalleAbrirOrderByTipoBancoDisco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoBancoDisco"));
			
		this.jMenuItemDetalleMostarOcultarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoBancoDisco"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoBancoDisco.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoBancoDisco"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoBancoDisco"));
			
		this.jMenuItemNuevoGuardarCambiosTipoBancoDisco.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoBancoDisco"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoBancoDisco.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoBancoDisco"));

		this.jCheckBoxSeleccionadosTipoBancoDisco.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoBancoDisco"));
		
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoDisco.jComboBoxTiposAccionesFormularioTipoBancoDisco.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoBancoDisco"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoBancoDisco.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoBancoDisco"));
			
		this.jComboBoxTiposAccionesTipoBancoDisco.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoBancoDisco"));
					
		this.jComboBoxTiposSeleccionarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoBancoDisco"));
			
		this.jTextFieldValorCampoGeneralTipoBancoDisco.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoBancoDisco"));		
		
		
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtonidTipoBancoDiscoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoBancoDiscoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtoncodigoTipoBancoDiscoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoBancoDiscoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtonnombreTipoBancoDiscoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoBancoDiscoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoBancoDisco!=null) {
				this.jInternalFrameReporteDinamicoTipoBancoDisco.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoBancoDisco"));
				this.jInternalFrameReporteDinamicoTipoBancoDisco.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoBancoDisco"));
				this.jInternalFrameReporteDinamicoTipoBancoDisco.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoBancoDisco"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoBancoDisco.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoBancoDisco"));				
			//this.jButtonGenerarReporteDinamicoTipoBancoDisco.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoBancoDisco"));
			//this.jButtonGenerarExcelReporteDinamicoTipoBancoDisco.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoBancoDisco"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoBancoDisco!=null) {
				this.jInternalFrameImportacionTipoBancoDisco.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoBancoDisco"));
				this.jInternalFrameImportacionTipoBancoDisco.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoBancoDisco"));
				this.jInternalFrameImportacionTipoBancoDisco.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoBancoDisco"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoBancoDisco.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoBancoDisco"));
			
			this.jButtonAbrirOrderByToolBarTipoBancoDisco.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoBancoDisco"));			
			
			if(this.jInternalFrameOrderByTipoBancoDisco!=null) {
				this.jInternalFrameOrderByTipoBancoDisco.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoBancoDisco"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoDisco.jTabbedPaneRelacionesTipoBancoDisco.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoBancoDisco"));
		
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
            		closingInternalFrameTipoBancoDisco();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoBancoDisco.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoBancoDisco = (JInternalFrameBase)event.getSource();
	            	
	            TipoBancoDiscoBeanSwingJInternalFrame jInternalFrameParent=(TipoBancoDiscoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoBancoDisco.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoBancoDiscoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoBancoDisco.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoBancoDiscoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoBancoDisco.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoBancoDisco.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBancoDiscoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBancoDiscoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBancoDiscoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoBancoDisco";
		inputMap = this.jButtonNuevoTipoBancoDisco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoBancoDisco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoBancoDiscoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBancoDiscoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBancoDiscoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBancoDiscoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoBancoDisco";
		inputMap = this.jButtonNuevoRelacionesTipoBancoDisco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoBancoDisco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoBancoDiscoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoBancoDisco";
		inputMap = this.jButtonModificarTipoBancoDisco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoBancoDisco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoBancoDiscoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoBancoDisco";
		inputMap = this.jButtonActualizarTipoBancoDisco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoBancoDisco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoBancoDiscoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoBancoDisco";
		inputMap = this.jButtonEliminarTipoBancoDisco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoBancoDisco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoBancoDiscoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoBancoDisco";
		inputMap = this.jButtonCancelarTipoBancoDisco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoBancoDisco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoBancoDiscoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoBancoDisco";
		inputMap = this.jButtonCerrarTipoBancoDisco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoBancoDisco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoBancoDiscoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtonGuardarCambiosTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoBancoDisco";
		inputMap = this.jInternalFrameDetalleFormTipoBancoDisco.jButtonGuardarCambiosTipoBancoDisco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtonGuardarCambiosTipoBancoDisco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoBancoDiscoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoBancoDisco.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoBancoDiscoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoBancoDisco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoBancoDiscoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoBancoDisco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoBancoDiscoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoBancoDisco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoBancoDiscoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtonidTipoBancoDiscoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoBancoDiscoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtoncodigoTipoBancoDiscoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoBancoDiscoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoDisco.jButtonnombreTipoBancoDiscoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoBancoDiscoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoBancoDisco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoBancoDiscoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoBancoDiscoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoBancoDisco.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoBancoDisco(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoBancoDisco tipobancodiscoAux:this.tipobancodiscoLogic.getTipoBancoDiscos()) {
					tipobancodiscoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoBancoDisco tipobancodiscoAux:tipobancodiscos) {
					tipobancodiscoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoBancoDiscoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoBancoDisco(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoBancoDisco tipobancodiscoAux:this.tipobancodiscoLogic.getTipoBancoDiscos()) {
						tipobancodiscoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoBancoDisco tipobancodiscoAux:tipobancodiscos) {
						tipobancodiscoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoBancoDisco tipobancodiscoAux:this.tipobancodiscoLogic.getTipoBancoDiscos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoBancoDisco tipobancodiscoAux:tipobancodiscos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoBancoDisco(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoBancoDisco.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoBancoDisco.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoBancoDisco,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoBancoDiscoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoBancoDisco(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoBancoDisco.getSelectedRows();
			
			TipoBancoDisco tipobancodiscoLocal=new TipoBancoDisco();
			
			//this.seleccionarTodosTipoBancoDisco(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipobancodiscoLocal =(TipoBancoDisco) this.tipobancodiscoLogic.getTipoBancoDiscos().toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipobancodiscoLocal =(TipoBancoDisco) this.tipobancodiscos.toArray()[this.jTableDatosTipoBancoDisco.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipobancodiscoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoBancoDisco tipobancodiscoAux:this.tipobancodiscoLogic.getTipoBancoDiscos()) {
						tipobancodiscoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoBancoDisco tipobancodiscoAux:tipobancodiscos) {
						tipobancodiscoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoBancoDisco(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoBancoDisco.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoBancoDisco.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoBancoDisco,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoBancoDiscoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoBancoDiscoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoBancoDiscoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoBancoDisco(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoBancoDisco.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoBancoDisco tipobancodiscoAux:this.tipobancodiscoLogic.getTipoBancoDiscos()) {
				
						if(sTipoSeleccionar.equals(TipoBancoDiscoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipobancodiscoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoBancoDiscoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipobancodiscoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoBancoDisco tipobancodiscoAux:tipobancodiscos) {
					
						if(sTipoSeleccionar.equals(TipoBancoDiscoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipobancodiscoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoBancoDiscoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipobancodiscoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoBancoDisco(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoBancoDiscoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoBancoDisco(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoBancoDisco=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoBancoDisco.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoBancoDisco.jComboBoxTiposAccionesFormularioTipoBancoDisco.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoBancoDisco) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoBancoDisco(conSplash);
				
					this.generarReporteTipoBancoDiscosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoBancoDisco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoBancoDisco.jComboBoxTiposAccionesFormularioTipoBancoDisco.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoBancoDiscosSeleccionados();
				//this.jComboBoxTiposAccionesTipoBancoDisco.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoBancoDiscosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoBancoDisco.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoBancoDiscosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoBancoDisco.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoBancoDisco();
				
				this.exportarTipoBancoDiscosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoBancoDisco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoBancoDisco.jComboBoxTiposAccionesFormularioTipoBancoDisco.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoBancoDiscos();
				//this.importarTipoBancoDiscos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoBancoDisco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoBancoDisco.jComboBoxTiposAccionesFormularioTipoBancoDisco.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoBancoDisco();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoBancoDiscosSeleccionados();
				//this.jComboBoxTiposAccionesTipoBancoDisco.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Banco Disco", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoBancoDisco();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoBancoDisco)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoBancoDisco(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Banco Disco",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoBancoDisco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoBancoDisco.jComboBoxTiposAccionesFormularioTipoBancoDisco.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoBancoDisco();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoBancoDisco(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoBancoDiscoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoBancoDisco();
			
			if(this.jInternalFrameDetalleFormTipoBancoDisco==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoBancoDisco> tipobancodiscosSeleccionados=new ArrayList<TipoBancoDisco>();		
			TipoBancoDisco tipobancodisco=new TipoBancoDisco();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoBancoDisco(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoBancoDisco.getSelectedItem();
			
			
			
			
			tipobancodiscosSeleccionados=this.getTipoBancoDiscosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipobancodiscosSeleccionados.size()==1) {
				for(TipoBancoDisco tipobancodiscoAux:tipobancodiscosSeleccionados) {
					tipobancodisco=tipobancodiscoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoBancoDisco();
			
      		//this.finishProcessTipoBancoDisco(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoBancoDiscoReturnGeneral() throws Exception {
		if(this.tipobancodiscoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipobancodiscoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipobancodiscoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipobancodiscoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipobancodiscoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipobancodiscoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoBancoDisco(false);
		}
		
		if(this.tipobancodiscoReturnGeneral.getConRetornoLista() || this.tipobancodiscoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipobancodiscoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipobancodiscoLogic.setTipoBancoDiscos(this.tipobancodiscoReturnGeneral.getTipoBancoDiscos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipobancodiscoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipobancodiscoLogic.setTipoBancoDisco(this.tipobancodiscoReturnGeneral.getTipoBancoDisco());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoBancoDisco(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoBancoDisco() throws Exception {
		
		
	}
	
	public ArrayList<TipoBancoDisco> getTipoBancoDiscosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoBancoDisco> tipobancodiscosSeleccionados=new ArrayList<TipoBancoDisco>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoBancoDisco) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoBancoDisco tipobancodiscoAux:tipobancodiscoLogic.getTipoBancoDiscos()) {
					if(tipobancodiscoAux.getIsSelected()) {
						tipobancodiscosSeleccionados.add(tipobancodiscoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoBancoDisco tipobancodiscoAux:this.tipobancodiscos) {
					if(tipobancodiscoAux.getIsSelected()) {
						tipobancodiscosSeleccionados.add(tipobancodiscoAux);				
					}
				}
			}
			
			if(tipobancodiscosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipobancodiscosSeleccionados.addAll(this.tipobancodiscoLogic.getTipoBancoDiscos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipobancodiscosSeleccionados.addAll(this.tipobancodiscos);				
					}
				}
			}
		} else {
			tipobancodiscosSeleccionados.add(this.tipobancodisco);
		}
		
		return tipobancodiscosSeleccionados;
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
	
	public void generarReporteTipoBancoDiscosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoBancoDiscosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoBancoDiscosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoBancoDiscosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoBancoDiscosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Banco Disco",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoBancoDiscosSeleccionados() throws Exception {
		ArrayList<TipoBancoDisco> tipobancodiscosSeleccionados=new ArrayList<TipoBancoDisco>();		
		
		tipobancodiscosSeleccionados=this.getTipoBancoDiscosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoBancoDiscos("Todos",tipobancodiscosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoBancoDiscosSeleccionados() throws Exception {
		ArrayList<TipoBancoDisco> tipobancodiscosSeleccionados=new ArrayList<TipoBancoDisco>();		
		
		tipobancodiscosSeleccionados=this.getTipoBancoDiscosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoBancoDiscos("Todos",tipobancodiscosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoBancoDiscosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoBancoDisco> tipobancodiscosSeleccionados=new ArrayList<TipoBancoDisco>();
		
		tipobancodiscosSeleccionados=this.getTipoBancoDiscosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoBancoDiscos("Todos",tipobancodiscosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoBancoDiscosSeleccionados() throws Exception {
		ArrayList<TipoBancoDisco> tipobancodiscosSeleccionados=new ArrayList<TipoBancoDisco>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoBancoDisco();
		
		
		tipobancodiscosSeleccionados=this.getTipoBancoDiscosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoBancoDisco();
		
		
		//this.generarReporteTipoBancoDiscos("Todos",tipobancodiscosSeleccionados ,tipobancodiscoImplementable,tipobancodiscoImplementableHome);
	}
	
	public void mostrarImportacionTipoBancoDiscos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoBancoDisco();
		
		this.abrirFrameImportacionTipoBancoDisco();		
		
			
		//this.generarReporteTipoBancoDiscos("Todos",tipobancodiscosSeleccionados ,tipobancodiscoImplementable,tipobancodiscoImplementableHome);
	}
	
	public void importarTipoBancoDiscos() throws Exception {		
	
	}
	
	public void exportarTipoBancoDiscosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoBancoDiscosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoBancoDiscosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoBancoDiscosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Banco Disco",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoBancoDiscosSeleccionados() throws Exception {
		ArrayList<TipoBancoDisco> tipobancodiscosSeleccionados=new ArrayList<TipoBancoDisco>();		
		
		tipobancodiscosSeleccionados=this.getTipoBancoDiscosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobancodisco."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoBancoDisco(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoBancoDisco tipobancodiscoAux:tipobancodiscosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoBancoDisco(tipobancodiscoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipobancodiscoAux.setsDetalleGeneralEntityReporte(tipobancodiscoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco Disco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoBancoDisco(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoBancoDiscoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoBancoDiscoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoBancoDiscoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoBancoDiscoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoBancoDisco(TipoBancoDisco tipobancodisco,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipobancodisco.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipobancodisco.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipobancodisco.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipobancodisco.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoBancoDiscosSeleccionados() throws Exception {
		ArrayList<TipoBancoDisco> tipobancodiscosSeleccionados=new ArrayList<TipoBancoDisco>();		
		
		tipobancodiscosSeleccionados=this.getTipoBancoDiscosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobancodisco.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoBancoDiscos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoBancoDisco(row);				
				iRow++;
			}				
			
			for(TipoBancoDisco tipobancodiscoAux:tipobancodiscosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoBancoDisco(tipobancodiscoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco Disco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoBancoDiscosSeleccionados() throws Exception {
		ArrayList<TipoBancoDisco> tipobancodiscosSeleccionados=new ArrayList<TipoBancoDisco>();		
		
		tipobancodiscosSeleccionados=this.getTipoBancoDiscosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobancodisco.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipobancodiscos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipobancodisco");
			//elementRoot.appendChild(element);
		
			for(TipoBancoDisco tipobancodiscoAux:tipobancodiscosSeleccionados) {
				element = document.createElement("tipobancodisco");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoBancoDisco(tipobancodiscoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco Disco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoBancoDisco(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoBancoDiscoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoBancoDiscoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoBancoDiscoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoBancoDiscoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoBancoDisco(TipoBancoDisco tipobancodisco,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipobancodisco.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipobancodisco.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipobancodisco.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoBancoDisco(TipoBancoDisco tipobancodisco,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoBancoDiscoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipobancodisco.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoBancoDiscoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipobancodisco.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoBancoDiscoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipobancodisco.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoBancoDiscoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipobancodisco.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoBancoDiscosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoBancoDisco> tipobancodiscosSeleccionados=new ArrayList<TipoBancoDisco>();
		
		tipobancodiscosSeleccionados=this.getTipoBancoDiscosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoBancoDisco(tipobancodiscosSeleccionados);
		
		this.generarReporteTipoBancoDiscos("Todos",tipobancodiscosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoBancoDisco(ArrayList<TipoBancoDisco> tipobancodiscosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoBancoDisco tipobancodiscoAux:tipobancodiscosSeleccionados) {
				tipobancodiscoAux.setsDetalleGeneralEntityReporte(tipobancodiscoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoBancoDiscoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipobancodiscoAux.setsDescripcionGeneralEntityReporte1(tipobancodiscoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoBancoDiscoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipobancodiscoAux.setsDescripcionGeneralEntityReporte1(tipobancodiscoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoDiscoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoBancoDisco(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoBancoDisco=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoBancoDisco=true;
				this.isVisibilidadCeldaGuardarCambiosTipoBancoDisco=true;
			}
			
			this.isVisibilidadCeldaModificarTipoBancoDisco=false;
			this.isVisibilidadCeldaActualizarTipoBancoDisco=false;
			this.isVisibilidadCeldaEliminarTipoBancoDisco=false;
			this.isVisibilidadCeldaCancelarTipoBancoDisco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBancoDisco=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoBancoDisco=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoBancoDisco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoDisco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoDisco=false;
			this.isVisibilidadCeldaModificarTipoBancoDisco=false;
			this.isVisibilidadCeldaActualizarTipoBancoDisco=true;
			this.isVisibilidadCeldaEliminarTipoBancoDisco=false;
			this.isVisibilidadCeldaCancelarTipoBancoDisco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBancoDisco=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoBancoDisco=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoBancoDisco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoDisco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoDisco=false;
			this.isVisibilidadCeldaModificarTipoBancoDisco=false;
			this.isVisibilidadCeldaActualizarTipoBancoDisco=true;
			this.isVisibilidadCeldaEliminarTipoBancoDisco=true;
			this.isVisibilidadCeldaCancelarTipoBancoDisco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBancoDisco=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoBancoDisco=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoBancoDisco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoDisco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoDisco=false;
			this.isVisibilidadCeldaModificarTipoBancoDisco=false;
			this.isVisibilidadCeldaActualizarTipoBancoDisco=true;
			this.isVisibilidadCeldaEliminarTipoBancoDisco=false;
			this.isVisibilidadCeldaCancelarTipoBancoDisco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBancoDisco=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoBancoDisco=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoBancoDisco=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoDisco=true;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoDisco=true;
			this.isVisibilidadCeldaModificarTipoBancoDisco=false;
			this.isVisibilidadCeldaActualizarTipoBancoDisco=false;
			this.isVisibilidadCeldaEliminarTipoBancoDisco=false;
			this.isVisibilidadCeldaCancelarTipoBancoDisco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBancoDisco=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoBancoDisco=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoBancoDisco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoDisco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoDisco=false;
			this.isVisibilidadCeldaActualizarTipoBancoDisco=false;
			this.isVisibilidadCeldaEliminarTipoBancoDisco=false;
			this.isVisibilidadCeldaCancelarTipoBancoDisco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBancoDisco=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoBancoDisco=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoBancoDisco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoDisco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoDisco=false;
			this.isVisibilidadCeldaModificarTipoBancoDisco=true;
			this.isVisibilidadCeldaActualizarTipoBancoDisco=false;
			this.isVisibilidadCeldaEliminarTipoBancoDisco=false;
			this.isVisibilidadCeldaCancelarTipoBancoDisco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBancoDisco=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoBancoDisco=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoBancoDiscoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoBancoDisco=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoDisco=true;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoDisco=true;
		} else {
			this.actualizarEstadoPanelsTipoBancoDisco(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoBancoDisco=false;
			//this.isVisibilidadCeldaVerFormTipoBancoDisco=false;
			this.isVisibilidadCeldaDuplicarTipoBancoDisco=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipobancodiscoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoDisco=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoBancoDisco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoDisco=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
			if(!tipobancodiscoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoBancoDisco=false;												
			}
			
			this.jButtonCerrarTipoBancoDisco.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoDisco=false;
		}
		
		if(!this.permiteMantenimiento(this.tipobancodisco)) {
			this.isVisibilidadCeldaActualizarTipoBancoDisco=false;
			this.isVisibilidadCeldaEliminarTipoBancoDisco=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoBancoDisco() {
	}
	
	public void actualizarEstadoPanelsTipoBancoDisco(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoBancoDisco!=null) {
				this.jScrollPanelDatosEdicionTipoBancoDisco.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoBancoDisco!=null) {
				this.jScrollPanelDatosTipoBancoDisco.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoBancoDisco!=null) {
				this.jPanelPaginacionTipoBancoDisco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoBancoDisco!=null) {
				this.jPanelParametrosReportesTipoBancoDisco.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoBancoDisco!=null) {
				this.jScrollPanelDatosEdicionTipoBancoDisco.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoBancoDisco!=null) {
				this.jScrollPanelDatosTipoBancoDisco.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoBancoDisco!=null) {
				this.jPanelPaginacionTipoBancoDisco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoBancoDisco!=null) {
				this.jPanelParametrosReportesTipoBancoDisco.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoBancoDisco!=null) {
				this.jScrollPanelDatosEdicionTipoBancoDisco.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoBancoDisco!=null) {
				this.jScrollPanelDatosTipoBancoDisco.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoBancoDisco!=null) {
				this.jPanelPaginacionTipoBancoDisco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoBancoDisco!=null) {
				this.jPanelParametrosReportesTipoBancoDisco.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoBancoDisco!=null) {
				this.jScrollPanelDatosEdicionTipoBancoDisco.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoBancoDisco!=null) {
				this.jScrollPanelDatosTipoBancoDisco.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoBancoDisco!=null) {
				this.jPanelPaginacionTipoBancoDisco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoBancoDisco!=null) {
				this.jPanelParametrosReportesTipoBancoDisco.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoBancoDisco!=null) {
				this.jScrollPanelDatosEdicionTipoBancoDisco.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoBancoDisco!=null) {
				this.jScrollPanelDatosTipoBancoDisco.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoBancoDisco!=null) {
				this.jPanelPaginacionTipoBancoDisco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoBancoDisco!=null) {
				this.jPanelParametrosReportesTipoBancoDisco.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoBancoDisco!=null) {
				this.jScrollPanelDatosEdicionTipoBancoDisco.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoBancoDisco!=null) {
				this.jScrollPanelDatosTipoBancoDisco.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoBancoDisco!=null) {
				this.jPanelPaginacionTipoBancoDisco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoBancoDisco!=null) {
				this.jPanelParametrosReportesTipoBancoDisco.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoBancoDisco!=null) {
				this.jScrollPanelDatosEdicionTipoBancoDisco.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoBancoDisco!=null) {
				this.jScrollPanelDatosTipoBancoDisco.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoBancoDisco!=null) {
				this.jPanelPaginacionTipoBancoDisco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoBancoDisco!=null) {
				this.jPanelParametrosReportesTipoBancoDisco.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoBancoDiscoSessionBean tipobancodiscoSessionBean=new TipoBancoDiscoSessionBean();
		
		if(this.tipobancodiscoSessionBean==null) {
			this.tipobancodiscoSessionBean=new TipoBancoDiscoSessionBean();
		}
		
		this.tipobancodiscoSessionBean.setsUltimaBusquedaTipoBancoDisco(this.getsAccionBusqueda());
		this.tipobancodiscoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipobancodiscoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoBancoDiscoSessionBean tipobancodiscoSessionBean=new TipoBancoDiscoSessionBean();
		
		if(this.tipobancodiscoSessionBean==null) {
			this.tipobancodiscoSessionBean=new TipoBancoDiscoSessionBean();
		}
		
		if(this.tipobancodiscoSessionBean.getsUltimaBusquedaTipoBancoDisco()!=null&&!this.tipobancodiscoSessionBean.getsUltimaBusquedaTipoBancoDisco().equals("")) {
			this.setsAccionBusqueda(tipobancodiscoSessionBean.getsUltimaBusquedaTipoBancoDisco());
			this.setiNumeroPaginacion(tipobancodiscoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipobancodiscoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipobancodiscoSessionBean.setsUltimaBusquedaTipoBancoDisco("");
		this.tipobancodiscoSessionBean.setiNumeroPaginacion(TipoBancoDiscoConstantesFunciones.INUMEROPAGINACION);
		this.tipobancodiscoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoBancoDisco(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoBancoDisco() {
		this.updateBorderResaltarBusquedasFormularioTipoBancoDisco();
		this.updateVisibilidadBusquedasFormularioTipoBancoDisco();
		this.updateHabilitarBusquedasFormularioTipoBancoDisco();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoBancoDisco() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoBancoDisco() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoBancoDisco() {
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
	
	public void updateControlesFormularioTipoBancoDisco() throws Exception {

		if(this.jInternalFrameDetalleFormTipoBancoDisco==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoBancoDisco();
		this.updateVisibilidadResaltarControlesFormularioTipoBancoDisco();
		this.updateHabilitarResaltarControlesFormularioTipoBancoDisco();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoBancoDisco() throws Exception {
		if(this.jInternalFrameDetalleFormTipoBancoDisco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipobancodiscoConstantesFunciones.resaltaridTipoBancoDisco!=null && this.jInternalFrameDetalleFormTipoBancoDisco!=null) {this.jInternalFrameDetalleFormTipoBancoDisco.jTextFieldidTipoBancoDisco.setBorder(this.tipobancodiscoConstantesFunciones.resaltaridTipoBancoDisco);}
		if(this.tipobancodiscoConstantesFunciones.resaltarcodigoTipoBancoDisco!=null && this.jInternalFrameDetalleFormTipoBancoDisco!=null) {this.jInternalFrameDetalleFormTipoBancoDisco.jTextFieldcodigoTipoBancoDisco.setBorder(this.tipobancodiscoConstantesFunciones.resaltarcodigoTipoBancoDisco);}
		if(this.tipobancodiscoConstantesFunciones.resaltarnombreTipoBancoDisco!=null && this.jInternalFrameDetalleFormTipoBancoDisco!=null) {this.jInternalFrameDetalleFormTipoBancoDisco.jTextAreanombreTipoBancoDisco.setBorder(this.tipobancodiscoConstantesFunciones.resaltarnombreTipoBancoDisco);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoBancoDisco() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoBancoDisco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) {
	
		//this.jInternalFrameDetalleFormTipoBancoDisco.jTextFieldidTipoBancoDisco.setVisible(this.tipobancodiscoConstantesFunciones.mostraridTipoBancoDisco);
		this.jInternalFrameDetalleFormTipoBancoDisco.jPanelidTipoBancoDisco.setVisible(this.tipobancodiscoConstantesFunciones.mostraridTipoBancoDisco);
		//this.jInternalFrameDetalleFormTipoBancoDisco.jTextFieldcodigoTipoBancoDisco.setVisible(this.tipobancodiscoConstantesFunciones.mostrarcodigoTipoBancoDisco);
		this.jInternalFrameDetalleFormTipoBancoDisco.jPanelcodigoTipoBancoDisco.setVisible(this.tipobancodiscoConstantesFunciones.mostrarcodigoTipoBancoDisco);
		//this.jInternalFrameDetalleFormTipoBancoDisco.jTextAreanombreTipoBancoDisco.setVisible(this.tipobancodiscoConstantesFunciones.mostrarnombreTipoBancoDisco);
		this.jInternalFrameDetalleFormTipoBancoDisco.jPanelnombreTipoBancoDisco.setVisible(this.tipobancodiscoConstantesFunciones.mostrarnombreTipoBancoDisco);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoBancoDisco() throws Exception {
		if(this.jInternalFrameDetalleFormTipoBancoDisco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoBancoDisco!=null) {
	
		this.jInternalFrameDetalleFormTipoBancoDisco.jTextFieldidTipoBancoDisco.setEnabled(this.tipobancodiscoConstantesFunciones.activaridTipoBancoDisco);
		this.jInternalFrameDetalleFormTipoBancoDisco.jTextFieldcodigoTipoBancoDisco.setEnabled(this.tipobancodiscoConstantesFunciones.activarcodigoTipoBancoDisco);
		this.jInternalFrameDetalleFormTipoBancoDisco.jTextAreanombreTipoBancoDisco.setEnabled(this.tipobancodiscoConstantesFunciones.activarnombreTipoBancoDisco);
		}
	}
	
		
}