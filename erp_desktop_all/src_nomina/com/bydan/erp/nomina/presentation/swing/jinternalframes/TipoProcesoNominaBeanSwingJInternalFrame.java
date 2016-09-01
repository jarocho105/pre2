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

import com.bydan.erp.nomina.util.TipoProcesoNominaConstantesFunciones;
import com.bydan.erp.nomina.util.TipoProcesoNominaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoProcesoNominaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoProcesoNominaBean;
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
public class TipoProcesoNominaBeanSwingJInternalFrame extends TipoProcesoNominaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoProcesoNominaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoProcesoNomina> tipoprocesonominaValidator = new ClassValidator<TipoProcesoNomina>(TipoProcesoNomina.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoProcesoNomina tipoprocesonomina;	
	public TipoProcesoNomina tipoprocesonominaAux;
	public TipoProcesoNomina tipoprocesonominaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoProcesoNomina tipoprocesonominaTotales;
	public Long idTipoProcesoNominaActual;
	public Long iIdNuevoTipoProcesoNomina=0L;
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
	
	public Boolean isPermisoTodoTipoProcesoNomina;
	public Boolean isPermisoNuevoTipoProcesoNomina;
	public Boolean isPermisoActualizarTipoProcesoNomina;
	public Boolean isPermisoActualizarOriginalTipoProcesoNomina;
	public Boolean isPermisoEliminarTipoProcesoNomina;
	public Boolean isPermisoGuardarCambiosTipoProcesoNomina;
	public Boolean isPermisoConsultaTipoProcesoNomina;
	public Boolean isPermisoBusquedaTipoProcesoNomina;
	public Boolean isPermisoReporteTipoProcesoNomina;
	public Boolean isPermisoPaginacionMedioTipoProcesoNomina;
	public Boolean isPermisoPaginacionAltoTipoProcesoNomina;
	public Boolean isPermisoPaginacionTodoTipoProcesoNomina;
	public Boolean isPermisoCopiarTipoProcesoNomina;
	public Boolean isPermisoVerFormTipoProcesoNomina;
	public Boolean isPermisoDuplicarTipoProcesoNomina;
	public Boolean isPermisoOrdenTipoProcesoNomina;
	
	
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
	
	public TipoProcesoNominaParameterReturnGeneral tipoprocesonominaReturnGeneral;
	public TipoProcesoNominaParameterReturnGeneral tipoprocesonominaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoProcesoNomina=false;
	public Boolean esParaAccionDesdeFormularioTipoProcesoNomina=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoProcesoNominaLogic tipoprocesonominaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoProcesoNomina tipoprocesonominaBean;
	public TipoProcesoNominaConstantesFunciones tipoprocesonominaConstantesFunciones;
	//public TipoProcesoNominaParameterReturnGeneral tipoprocesonominaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoProcesoNomina> tipoprocesonominas;	
	//public List<TipoProcesoNomina> tipoprocesonominasEliminados;
	//public List<TipoProcesoNomina> tipoprocesonominasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoProcesoNomina=false;
	public Boolean isVisibilidadCeldaDuplicarTipoProcesoNomina=true;
	public Boolean isVisibilidadCeldaCopiarTipoProcesoNomina=true;
	public Boolean isVisibilidadCeldaVerFormTipoProcesoNomina=true;
	public Boolean isVisibilidadCeldaOrdenTipoProcesoNomina=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoProcesoNomina=false;
	public Boolean isVisibilidadCeldaModificarTipoProcesoNomina=false;
	public Boolean isVisibilidadCeldaActualizarTipoProcesoNomina=false;
	public Boolean isVisibilidadCeldaEliminarTipoProcesoNomina=false;
	public Boolean isVisibilidadCeldaCancelarTipoProcesoNomina=false;
	public Boolean isVisibilidadCeldaGuardarTipoProcesoNomina=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoProcesoNomina=false;	
	
	
	
	public Long getiIdNuevoTipoProcesoNomina() {
		return this.iIdNuevoTipoProcesoNomina;
	}

	public void setiIdNuevoTipoProcesoNomina(Long iIdNuevoTipoProcesoNomina) {
		this.iIdNuevoTipoProcesoNomina = iIdNuevoTipoProcesoNomina;
	}
	
	public Long getidTipoProcesoNominaActual() {
		return this.idTipoProcesoNominaActual;
	}

	public void setidTipoProcesoNominaActual(Long idTipoProcesoNominaActual) {
		this.idTipoProcesoNominaActual = idTipoProcesoNominaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoProcesoNomina gettipoprocesonomina() {
		return this.tipoprocesonomina;
	}

	public void settipoprocesonomina(TipoProcesoNomina tipoprocesonomina) {
		this.tipoprocesonomina = tipoprocesonomina;
	}
	
	public TipoProcesoNomina gettipoprocesonominaAux() {
		return this.tipoprocesonominaAux;
	}

	public void settipoprocesonominaAux(TipoProcesoNomina tipoprocesonominaAux) {
		this.tipoprocesonominaAux = tipoprocesonominaAux;
	}				
	
	public TipoProcesoNomina gettipoprocesonominaAnterior() {
		return this.tipoprocesonominaAnterior;
	}

	public void settipoprocesonominaAnterior(TipoProcesoNomina tipoprocesonominaAnterior) {
		this.tipoprocesonominaAnterior = tipoprocesonominaAnterior;
	}	
	
	public TipoProcesoNomina gettipoprocesonominaTotales() {
		return this.tipoprocesonominaTotales;
	}

	public void settipoprocesonominaTotales(TipoProcesoNomina tipoprocesonominaTotales) {
		this.tipoprocesonominaTotales = tipoprocesonominaTotales;
	}	
	
	public TipoProcesoNomina gettipoprocesonominaBean() {
		return this.tipoprocesonominaBean;
	}

	public void settipoprocesonominaBean(TipoProcesoNomina tipoprocesonominaBean) {
		this.tipoprocesonominaBean = tipoprocesonominaBean;
	}	
	
	public TipoProcesoNominaParameterReturnGeneral gettipoprocesonominaReturnGeneral() {
		return this.tipoprocesonominaReturnGeneral;
	}

	public void settipoprocesonominaReturnGeneral(TipoProcesoNominaParameterReturnGeneral tipoprocesonominaReturnGeneral) {
		this.tipoprocesonominaReturnGeneral = tipoprocesonominaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoProcesoNominaLogic getTipoProcesoNominaLogic()	{		
		return tipoprocesonominaLogic;
	}

	public void setTipoProcesoNominaLogic(TipoProcesoNominaLogic tipoprocesonominaLogic) {
		this.tipoprocesonominaLogic = tipoprocesonominaLogic;
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
	
	public Boolean getIsEsNuevoTipoProcesoNomina() {
		return isEsNuevoTipoProcesoNomina;
	}

	public void setIsEsNuevoTipoProcesoNomina(Boolean isEsNuevoTipoProcesoNomina) {
		this.isEsNuevoTipoProcesoNomina = isEsNuevoTipoProcesoNomina;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoProcesoNomina() {
		return esParaAccionDesdeFormularioTipoProcesoNomina;
	}
	
	public void setEsParaAccionDesdeFormularioTipoProcesoNomina(Boolean esParaAccionDesdeFormularioTipoProcesoNomina) {
		this.esParaAccionDesdeFormularioTipoProcesoNomina = esParaAccionDesdeFormularioTipoProcesoNomina;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoProcesoNomina() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoProcesoNominaConstantesFunciones.refrescarForeignKeysDescripcionesTipoProcesoNomina(this.tipoprocesonominaLogic.getTipoProcesoNominas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoProcesoNominaConstantesFunciones.refrescarForeignKeysDescripcionesTipoProcesoNomina(this.tipoprocesonominas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoprocesonominaLogic.setTipoProcesoNominas(this.tipoprocesonominas);
			tipoprocesonominaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoProcesoNominaParameterReturnGeneral getTipoProcesoNominaParameterGeneral() {
		return this.tipoprocesonominaParameterGeneral;
	}
	
	public void setTipoProcesoNominaParameterGeneral(TipoProcesoNominaParameterReturnGeneral tipoprocesonominaParameterGeneral) {
		this.tipoprocesonominaParameterGeneral = tipoprocesonominaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoProcesoNomina() {
		return isPermisoTodoTipoProcesoNomina;
	}

	public void setIsPermisoTodoTipoProcesoNomina(Boolean isPermisoTodoTipoProcesoNomina) {
		this.isPermisoTodoTipoProcesoNomina = isPermisoTodoTipoProcesoNomina;
	}

	public Boolean getIsPermisoNuevoTipoProcesoNomina() {
		return isPermisoNuevoTipoProcesoNomina;
	}

	public void setIsPermisoNuevoTipoProcesoNomina(Boolean isPermisoNuevoTipoProcesoNomina) {
		this.isPermisoNuevoTipoProcesoNomina = isPermisoNuevoTipoProcesoNomina;
	}

	public Boolean getIsPermisoActualizarTipoProcesoNomina() {
		return isPermisoActualizarTipoProcesoNomina;
	}

	public void setIsPermisoActualizarTipoProcesoNomina(Boolean isPermisoActualizarTipoProcesoNomina) {
		this.isPermisoActualizarTipoProcesoNomina = isPermisoActualizarTipoProcesoNomina;
	}

	public Boolean getIsPermisoEliminarTipoProcesoNomina() {
		return isPermisoEliminarTipoProcesoNomina;
	}

	public void setIsPermisoEliminarTipoProcesoNomina(Boolean isPermisoEliminarTipoProcesoNomina) {
		this.isPermisoEliminarTipoProcesoNomina = isPermisoEliminarTipoProcesoNomina;
	}

	public Boolean getIsPermisoGuardarCambiosTipoProcesoNomina() {
		return isPermisoGuardarCambiosTipoProcesoNomina;
	}

	public void setIsPermisoGuardarCambiosTipoProcesoNomina(Boolean isPermisoGuardarCambiosTipoProcesoNomina) {
		this.isPermisoGuardarCambiosTipoProcesoNomina = isPermisoGuardarCambiosTipoProcesoNomina;
	}
	
	public Boolean getIsPermisoConsultaTipoProcesoNomina() {
		return isPermisoConsultaTipoProcesoNomina;
	}

	public void setIsPermisoConsultaTipoProcesoNomina(Boolean isPermisoConsultaTipoProcesoNomina) {
		this.isPermisoConsultaTipoProcesoNomina = isPermisoConsultaTipoProcesoNomina;
	}

	public Boolean getIsPermisoBusquedaTipoProcesoNomina() {
		return isPermisoBusquedaTipoProcesoNomina;
	}

	public void setIsPermisoBusquedaTipoProcesoNomina(Boolean isPermisoBusquedaTipoProcesoNomina) {
		this.isPermisoBusquedaTipoProcesoNomina = isPermisoBusquedaTipoProcesoNomina;
	}

	public Boolean getIsPermisoReporteTipoProcesoNomina() {
		return isPermisoReporteTipoProcesoNomina;
	}

	public void setIsPermisoReporteTipoProcesoNomina(Boolean isPermisoReporteTipoProcesoNomina) {
		this.isPermisoReporteTipoProcesoNomina = isPermisoReporteTipoProcesoNomina;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoProcesoNomina() {
		return isPermisoPaginacionMedioTipoProcesoNomina;
	}

	public void setIsPermisoPaginacionMedioTipoProcesoNomina(Boolean isPermisoPaginacionMedioTipoProcesoNomina) {
		this.isPermisoPaginacionMedioTipoProcesoNomina = isPermisoPaginacionMedioTipoProcesoNomina;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoProcesoNomina() {
		return isPermisoPaginacionTodoTipoProcesoNomina;
	}

	public void setIsPermisoPaginacionTodoTipoProcesoNomina(Boolean isPermisoPaginacionTodoTipoProcesoNomina) {
		this.isPermisoPaginacionTodoTipoProcesoNomina = isPermisoPaginacionTodoTipoProcesoNomina;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoProcesoNomina() {
		return isPermisoPaginacionAltoTipoProcesoNomina;
	}

	public void setIsPermisoPaginacionAltoTipoProcesoNomina(Boolean isPermisoPaginacionAltoTipoProcesoNomina) {
		this.isPermisoPaginacionAltoTipoProcesoNomina = isPermisoPaginacionAltoTipoProcesoNomina;
	}
	
	public Boolean getIsPermisoCopiarTipoProcesoNomina() {
		return isPermisoCopiarTipoProcesoNomina;
	}

	public void setIsPermisoCopiarTipoProcesoNomina(Boolean isPermisoCopiarTipoProcesoNomina) {
		this.isPermisoCopiarTipoProcesoNomina = isPermisoCopiarTipoProcesoNomina;
	}
	
	public Boolean getIsPermisoVerFormTipoProcesoNomina() {
		return isPermisoVerFormTipoProcesoNomina;
	}

	public void setIsPermisoVerFormTipoProcesoNomina(Boolean isPermisoVerFormTipoProcesoNomina) {
		this.isPermisoVerFormTipoProcesoNomina = isPermisoVerFormTipoProcesoNomina;
	}
	
	public Boolean getIsPermisoDuplicarTipoProcesoNomina() {
		return isPermisoDuplicarTipoProcesoNomina;
	}

	public void setIsPermisoDuplicarTipoProcesoNomina(Boolean isPermisoDuplicarTipoProcesoNomina) {
		this.isPermisoDuplicarTipoProcesoNomina = isPermisoDuplicarTipoProcesoNomina;
	}
	
	public Boolean getIsPermisoOrdenTipoProcesoNomina() {
		return isPermisoOrdenTipoProcesoNomina;
	}

	public void setIsPermisoOrdenTipoProcesoNomina(Boolean isPermisoOrdenTipoProcesoNomina) {
		this.isPermisoOrdenTipoProcesoNomina = isPermisoOrdenTipoProcesoNomina;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoProcesoNomina() {
		return isVisibilidadCeldaNuevoTipoProcesoNomina;
	}

	public void setIsVisibilidadCeldaNuevoTipoProcesoNomina(Boolean isVisibilidadCeldaNuevoTipoProcesoNomina) {
		this.isVisibilidadCeldaNuevoTipoProcesoNomina = isVisibilidadCeldaNuevoTipoProcesoNomina;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoProcesoNomina() {
		return isVisibilidadCeldaDuplicarTipoProcesoNomina;
	}

	public void setIsVisibilidadCeldaDuplicarTipoProcesoNomina(Boolean isVisibilidadCeldaDuplicarTipoProcesoNomina) {
		this.isVisibilidadCeldaDuplicarTipoProcesoNomina = isVisibilidadCeldaDuplicarTipoProcesoNomina;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoProcesoNomina() {
		return isVisibilidadCeldaCopiarTipoProcesoNomina;
	}

	public void setIsVisibilidadCeldaCopiarTipoProcesoNomina(Boolean isVisibilidadCeldaCopiarTipoProcesoNomina) {
		this.isVisibilidadCeldaCopiarTipoProcesoNomina = isVisibilidadCeldaCopiarTipoProcesoNomina;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoProcesoNomina() {
		return isVisibilidadCeldaVerFormTipoProcesoNomina;
	}

	public void setIsVisibilidadCeldaVerFormTipoProcesoNomina(Boolean isVisibilidadCeldaVerFormTipoProcesoNomina) {
		this.isVisibilidadCeldaVerFormTipoProcesoNomina = isVisibilidadCeldaVerFormTipoProcesoNomina;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoProcesoNomina() {
		return isVisibilidadCeldaOrdenTipoProcesoNomina;
	}

	public void setIsVisibilidadCeldaOrdenTipoProcesoNomina(Boolean isVisibilidadCeldaOrdenTipoProcesoNomina) {
		this.isVisibilidadCeldaOrdenTipoProcesoNomina = isVisibilidadCeldaOrdenTipoProcesoNomina;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoProcesoNomina() {
		return isVisibilidadCeldaNuevoRelacionesTipoProcesoNomina;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoProcesoNomina(Boolean isVisibilidadCeldaNuevoRelacionesTipoProcesoNomina) {
		this.isVisibilidadCeldaNuevoRelacionesTipoProcesoNomina = isVisibilidadCeldaNuevoRelacionesTipoProcesoNomina;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoProcesoNomina() {
		return isVisibilidadCeldaModificarTipoProcesoNomina;
	}

	public void setIsVisibilidadCeldaModificarTipoProcesoNomina(Boolean isVisibilidadCeldaModificarTipoProcesoNomina) {
		this.isVisibilidadCeldaModificarTipoProcesoNomina = isVisibilidadCeldaModificarTipoProcesoNomina;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoProcesoNomina() {
		return isVisibilidadCeldaActualizarTipoProcesoNomina;
	}

	public void setIsVisibilidadCeldaActualizarTipoProcesoNomina(Boolean isVisibilidadCeldaActualizarTipoProcesoNomina) {
		this.isVisibilidadCeldaActualizarTipoProcesoNomina = isVisibilidadCeldaActualizarTipoProcesoNomina;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoProcesoNomina() {
		return isVisibilidadCeldaEliminarTipoProcesoNomina;
	}

	public void setIsVisibilidadCeldaEliminarTipoProcesoNomina(Boolean isVisibilidadCeldaEliminarTipoProcesoNomina) {
		this.isVisibilidadCeldaEliminarTipoProcesoNomina = isVisibilidadCeldaEliminarTipoProcesoNomina;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoProcesoNomina() {
		return isVisibilidadCeldaCancelarTipoProcesoNomina;
	}

	public void setIsVisibilidadCeldaCancelarTipoProcesoNomina(Boolean isVisibilidadCeldaCancelarTipoProcesoNomina) {
		this.isVisibilidadCeldaCancelarTipoProcesoNomina = isVisibilidadCeldaCancelarTipoProcesoNomina;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoProcesoNomina() {
		return isVisibilidadCeldaGuardarTipoProcesoNomina;
	}

	public void setIsVisibilidadCeldaGuardarTipoProcesoNomina(Boolean isVisibilidadCeldaGuardarTipoProcesoNomina) {
		this.isVisibilidadCeldaGuardarTipoProcesoNomina = isVisibilidadCeldaGuardarTipoProcesoNomina;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoProcesoNomina() {
		return isVisibilidadCeldaGuardarCambiosTipoProcesoNomina;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoProcesoNomina(Boolean isVisibilidadCeldaGuardarCambiosTipoProcesoNomina) {
		this.isVisibilidadCeldaGuardarCambiosTipoProcesoNomina = isVisibilidadCeldaGuardarCambiosTipoProcesoNomina;
	}
		
	public TipoProcesoNominaSessionBean gettipoprocesonominaSessionBean() {
		return this.tipoprocesonominaSessionBean;
	}
	
	public void settipoprocesonominaSessionBean(TipoProcesoNominaSessionBean tipoprocesonominaSessionBean) {
		this.tipoprocesonominaSessionBean=tipoprocesonominaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoProcesoNomina(TipoProcesoNomina tipoprocesonomina)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoProcesoNomina tipoprocesonomina,TipoProcesoNomina tipoprocesonominaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoProcesoNomina(tipoprocesonomina);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoprocesonominaAux.setId(tipoprocesonomina.getId());
		tipoprocesonominaAux.setVersionRow(tipoprocesonomina.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoProcesoNomina();
		
			int intSelectedRow = this.jTableDatosTipoProcesoNomina.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominas.toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoProcesoNominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoProcesoNomina(this.tipoprocesonomina,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoNomina(this.tipoprocesonomina);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoprocesonominaValidator.getInvalidValues(this.tipoprocesonomina);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoprocesonominaLogic.setDatosCliente(datosCliente);
			tipoprocesonominaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoprocesonominaAux=new  TipoProcesoNomina();
				
				tipoprocesonominaAux.setIsNew(true);
				tipoprocesonominaAux.setIsChanged(true);
				
				tipoprocesonominaAux.setTipoProcesoNominaOriginal(this.tipoprocesonomina);
				
				tipoprocesonominaAux.setId(this.tipoprocesonomina.getId());	
				tipoprocesonominaAux.setVersionRow(this.tipoprocesonomina.getVersionRow());	
				tipoprocesonominaAux.setcodigo(this.tipoprocesonomina.getcodigo());	
				tipoprocesonominaAux.setnombre(this.tipoprocesonomina.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoprocesonominaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoprocesonominaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoprocesonominaAux,tipoprocesonominaLogic.getTipoProcesoNominas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprocesonominaAux,tipoprocesonominas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoprocesonominaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprocesonominaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprocesonominaLogic.saveTipoProcesoNominas();//WithConnection
						//tipoprocesonominaLogic.getSetVersionRowTipoProcesoNominas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoprocesonomina,tipoprocesonominaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoprocesonominaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoprocesonominaAux=new  TipoProcesoNomina();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoprocesonominaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoprocesonominaSessionBean.getEsGuardarRelacionado() && this.tipoprocesonomina.getId()>=0)) {
						
					tipoprocesonominaAux.setIsNew(false);
				}
				
				tipoprocesonominaAux.setIsDeleted(false);
			
				tipoprocesonominaAux.setId(this.tipoprocesonomina.getId());	
				tipoprocesonominaAux.setVersionRow(this.tipoprocesonomina.getVersionRow());	
				tipoprocesonominaAux.setcodigo(this.tipoprocesonomina.getcodigo());	
				tipoprocesonominaAux.setnombre(this.tipoprocesonomina.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoprocesonominaAux,tipoprocesonominaLogic.getTipoProcesoNominas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprocesonominaAux,tipoprocesonominas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoprocesonominaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprocesonominaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprocesonominaLogic.saveTipoProcesoNominas();//WithConnection
						//tipoprocesonominaLogic.getSetVersionRowTipoProcesoNominas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoprocesonomina,tipoprocesonominaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoprocesonominaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoprocesonominaAux=new  TipoProcesoNomina();
				
				tipoprocesonominaAux.setIsNew(false);
				tipoprocesonominaAux.setIsChanged(false);
				
				tipoprocesonominaAux.setIsDeleted(true);
				
				tipoprocesonominaAux.setId(this.tipoprocesonomina.getId());	
				tipoprocesonominaAux.setVersionRow(this.tipoprocesonomina.getVersionRow());	
				tipoprocesonominaAux.setcodigo(this.tipoprocesonomina.getcodigo());	
				tipoprocesonominaAux.setnombre(this.tipoprocesonomina.getnombre());	
				
				if(this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoprocesonominaAux.getId()>=0) {	
						this.tipoprocesonominasEliminados.add(tipoprocesonominaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoprocesonominaAux,tipoprocesonominaLogic.getTipoProcesoNominas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprocesonominaAux,tipoprocesonominas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoprocesonominaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprocesonominaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprocesonominaLogic.saveTipoProcesoNominas();//WithConnection
						//tipoprocesonominaLogic.getSetVersionRowTipoProcesoNominas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoprocesonominaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoprocesonominaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoprocesonominaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoprocesonominaAux,tipoprocesonominaLogic.getTipoProcesoNominas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoprocesonominaAux,tipoprocesonominas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesonominaLogic.getTipoProcesoNominas().addAll(this.tipoprocesonominasEliminados);
					
					tipoprocesonominaLogic.saveTipoProcesoNominas();//WithConnection
					//tipoprocesonominaLogic.getSetVersionRowTipoProcesoNominas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoprocesonominasEliminados= new ArrayList<TipoProcesoNomina>();		
			}
			
			if(this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Proceso Nomina GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Proceso Nomina",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoprocesonomina=tipoprocesonominaAux;
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
      		//this.finishProcessTipoProcesoNomina();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoProcesoNomina tipoprocesonominaLocal) throws Exception {
		
		if(this.tipoprocesonominaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoProcesoNomina tipoprocesonominaLocal) throws Exception {	
		if(this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoProcesoNominaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoProcesoNomina.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominas.toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoprocesonominaValidator.getInvalidValues(this.tipoprocesonomina);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoProcesoNomina tipoprocesonomina,List<TipoProcesoNomina> tipoprocesonominas) throws Exception {
		try	{		
			TipoProcesoNominaConstantesFunciones.actualizarLista(tipoprocesonomina,tipoprocesonominas,this.tipoprocesonominaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoProcesoNomina tipoprocesonomina,List<TipoProcesoNomina> tipoprocesonominas) throws Exception {
		try	{			
			TipoProcesoNominaConstantesFunciones.actualizarSelectedLista(tipoprocesonomina,tipoprocesonominas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoProcesoNomina> tipoprocesonominasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoprocesonominasLocal=this.tipoprocesonominaLogic.getTipoProcesoNominas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoprocesonominasLocal=this.tipoprocesonominas;
			}
			//ARCHITECTURE
		
			for(TipoProcesoNomina tipoprocesonominaLocal:tipoprocesonominasLocal) {
				if(this.permiteMantenimiento(tipoprocesonominaLocal) && tipoprocesonominaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoProcesoNominaConstantesFunciones.getTipoProcesoNominaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoProcesoNominaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProcesoNomina.jLabelcodigoTipoProcesoNomina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoProcesoNominaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProcesoNomina.jLabelnombreTipoProcesoNomina,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoProcesoNomina.jLabelcodigoTipoProcesoNomina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoProcesoNomina.jLabelnombreTipoProcesoNomina,"");
		
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
		this.iIdNuevoTipoProcesoNomina--;	
		
		
		this.tipoprocesonominaAux=new TipoProcesoNomina();
		
		this.tipoprocesonominaAux.setId(this.iIdNuevoTipoProcesoNomina);
		this.tipoprocesonominaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoprocesonominaLogic.getTipoProcesoNominas().add(this.tipoprocesonominaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoprocesonominas.add(this.tipoprocesonominaAux);
		}
		//ARCHITECTURE
		
		this.tipoprocesonomina=this.tipoprocesonominaAux;
		
		if(TipoProcesoNominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoProcesoNomina(this.tipoprocesonomina);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoProcesoNomina(this.tipoprocesonomina);
		}
				
		//this.setDefaultControlesTipoProcesoNomina();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoProcesoNomina();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoProcesoNomina();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProcesoNomina();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoProcesoNomina(this.tipoprocesonominaBean,this.tipoprocesonomina,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoNomina(this.tipoprocesonomina);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoprocesonominaSessionBean.getConGuardarRelaciones()) {
			classes=TipoProcesoNominaConstantesFunciones.getClassesRelationshipsOfTipoProcesoNomina(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoprocesonominaReturnGeneral=tipoprocesonominaLogic.procesarEventosTipoProcesoNominasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprocesonominaLogic.getTipoProcesoNominas(),this.tipoprocesonomina,this.tipoprocesonominaParameterGeneral,this.isEsNuevoTipoProcesoNomina,classes);//this.tipoprocesonominaLogic.getTipoProcesoNomina()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoProcesoNomina(this.tipoprocesonominaReturnGeneral,this.tipoprocesonominaBean,false);
		
		if(this.tipoprocesonominaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoProcesoNomina(this.tipoprocesonominaReturnGeneral.getTipoProcesoNomina());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoProcesoNomina(this.tipoprocesonominaReturnGeneral.getTipoProcesoNomina());
		}
		
		if(this.tipoprocesonominaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoProcesoNomina(this.tipoprocesonominaReturnGeneral.getTipoProcesoNomina(),classes);//this.tipoprocesonominaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoProcesoNomina(this.tipoprocesonomina,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoProcesoNomina();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoProcesoNomina();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoProcesoNomina(false);
						
			if(tipoprocesonominaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoProcesoNominaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProcesoNomina();
			}
			
			this.actualizarVisualTableDatosTipoProcesoNomina();
			
			this.jTableDatosTipoProcesoNomina.setRowSelectionInterval(this.getIndiceNuevoTipoProcesoNomina(), this.getIndiceNuevoTipoProcesoNomina());
			
			this.seleccionarFilaTablaTipoProcesoNominaActual();
						
			this.actualizarEstadoCeldasBotonesTipoProcesoNomina("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoProcesoNomina(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoProcesoNomina.jTextFieldcodigoTipoProcesoNomina.setEnabled(isHabilitar && this.tipoprocesonominaConstantesFunciones.activarcodigoTipoProcesoNomina);
		this.jInternalFrameDetalleFormTipoProcesoNomina.jTextAreanombreTipoProcesoNomina.setEnabled(isHabilitar && this.tipoprocesonominaConstantesFunciones.activarnombreTipoProcesoNomina);	
		
	};
	
	public void setDefaultControlesTipoProcesoNomina() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoProcesoNomina(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoprocesonominaSessionBean.setConGuardarRelaciones(true);			
			this.tipoprocesonominaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoProcesoNomina.jTabbedPaneRelacionesTipoProcesoNomina.setVisible(true);
			
					
		} else {
			//this.tipoprocesonominaSessionBean.setConGuardarRelaciones(false);			
			this.tipoprocesonominaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoProcesoNomina.jTabbedPaneRelacionesTipoProcesoNomina.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoProcesoNomina() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProcesoNomina tipoprocesonominaAux:this.tipoprocesonominaLogic.getTipoProcesoNominas()) {
				if(tipoprocesonominaAux.getId().equals(this.iIdNuevoTipoProcesoNomina)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProcesoNomina tipoprocesonominaAux:this.tipoprocesonominas) {
				if(tipoprocesonominaAux.getId().equals(this.iIdNuevoTipoProcesoNomina)) {
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
	
	public int getIndiceActualTipoProcesoNomina(TipoProcesoNomina tipoprocesonomina,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProcesoNomina tipoprocesonominaAux:this.tipoprocesonominaLogic.getTipoProcesoNominas()) {
				if(tipoprocesonominaAux.getId().equals(tipoprocesonomina.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProcesoNomina tipoprocesonominaAux:this.tipoprocesonominas) {
				if(tipoprocesonominaAux.getId().equals(tipoprocesonomina.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoProcesoNomina(TipoProcesoNomina tipoprocesonominaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProcesoNomina tipoprocesonominaAux:this.tipoprocesonominaLogic.getTipoProcesoNominas()) {
				if(tipoprocesonominaAux.getTipoProcesoNominaOriginal().getId().equals(tipoprocesonominaOriginal.getId())) {
					existe=true;
					tipoprocesonominaOriginal.setId(tipoprocesonominaAux.getId());
					tipoprocesonominaOriginal.setVersionRow(tipoprocesonominaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProcesoNomina tipoprocesonominaAux:this.tipoprocesonominas) {
				if(tipoprocesonominaAux.getTipoProcesoNominaOriginal().getId().equals(tipoprocesonominaOriginal.getId())) {
					existe=true;
					tipoprocesonominaOriginal.setId(tipoprocesonominaAux.getId());
					tipoprocesonominaOriginal.setVersionRow(tipoprocesonominaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoProcesoNomina(Boolean esParaCancelar) throws Exception {
		tipoprocesonominasAux=new ArrayList<TipoProcesoNomina>();
		tipoprocesonominaAux=new TipoProcesoNomina();
		
		if(!this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoProcesoNomina tipoprocesonominaAux:this.tipoprocesonominaLogic.getTipoProcesoNominas()) {
					if(tipoprocesonominaAux.getId()<0) {
						tipoprocesonominasAux.add(tipoprocesonominaAux);
					}		
				}
				this.iIdNuevoTipoProcesoNomina=0L;
				this.tipoprocesonominaLogic.getTipoProcesoNominas().removeAll(tipoprocesonominasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProcesoNomina tipoprocesonominaAux:this.tipoprocesonominas) {
					if(tipoprocesonominaAux.getId()<0) {
						tipoprocesonominasAux.add(tipoprocesonominaAux);
					}		
				}
				this.iIdNuevoTipoProcesoNomina=0L;
				this.tipoprocesonominas.removeAll(tipoprocesonominasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoProcesoNomina 
					&& this.tipoprocesonominaLogic.getTipoProcesoNominas().size()>0
					) {
					tipoprocesonominaAux=this.tipoprocesonominaLogic.getTipoProcesoNominas().get(this.tipoprocesonominaLogic.getTipoProcesoNominas().size() - 1);
				
					if(tipoprocesonominaAux.getId()<0) {
						this.tipoprocesonominaLogic.getTipoProcesoNominas().remove(tipoprocesonominaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoProcesoNomina && this.tipoprocesonominas.size()>0) {
					tipoprocesonominaAux=this.tipoprocesonominas.get(this.tipoprocesonominas.size() - 1);
				
					if(tipoprocesonominaAux.getId()<0) {
						this.tipoprocesonominas.remove(tipoprocesonominaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoProcesoNomina(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoprocesonomina.getId()<0) {
				this.tipoprocesonominaLogic.getTipoProcesoNominas().remove(this.tipoprocesonomina);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoprocesonomina.getId()<0) {
				this.tipoprocesonominas.remove(this.tipoprocesonomina);
			}
		}			
	}
	
	public void setEstadosInicialesTipoProcesoNomina(List<TipoProcesoNomina> tipoprocesonominasAux) throws Exception {
		TipoProcesoNominaConstantesFunciones.setEstadosInicialesTipoProcesoNomina(tipoprocesonominasAux);
	}
	
	public void setEstadosInicialesTipoProcesoNomina(TipoProcesoNomina tipoprocesonominaAux) throws Exception {
		TipoProcesoNominaConstantesFunciones.setEstadosInicialesTipoProcesoNomina(tipoprocesonominaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoProcesoNominaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoProcesoNomina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoProcesoNominaActual()) {
				if(!this.isEsNuevoTipoProcesoNomina) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoProcesoNomina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoProcesoNomina=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoProcesoNominaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Proceso Nomina ?", "MANTENIMIENTO DE Tipo Proceso Nomina", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoProcesoNomina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoProcesoNomina tipoprocesonomina) throws Exception {
		TipoProcesoNominaConstantesFunciones.seleccionarAsignar(this.tipoprocesonomina,tipoprocesonomina);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoProcesoNomina=this.isPermisoActualizarOriginalTipoProcesoNomina;
			
			
			this.seleccionarAsignar(tipoprocesonomina);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoProcesoNominaConstantesFunciones.quitarEspaciosTipoProcesoNomina(this.tipoprocesonomina,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoProcesoNomina("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoprocesonominaSessionBean.setsFuncionBusquedaRapida(this.tipoprocesonominaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoProcesoNomina) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoProcesoNomina(esParaCancelar);				
				this.cancelarNuevoTipoProcesoNomina(esParaCancelar);								
			}
			
			this.tipoprocesonomina=new TipoProcesoNomina();
			
			this.inicializarTipoProcesoNomina();
			
			this.actualizarEstadoCeldasBotonesTipoProcesoNomina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoProcesoNomina() throws Exception {
		try {
			TipoProcesoNominaConstantesFunciones.inicializarTipoProcesoNomina(this.tipoprocesonomina);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoprocesonominaLogic.getTipoProcesoNominas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoProcesoNominas(String sAccionBusqueda,List<TipoProcesoNomina> tipoprocesonominasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoProcesoNomina"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoProcesoNominaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoProcesoNominaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoProcesoNomina"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Proceso Nominaes");		
		parameters.put("busquedapor", TipoProcesoNominaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoProcesoNomina=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoProcesoNominaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoProcesoNominaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoProcesoNomina=new JRBeanArrayDataSource(TipoProcesoNominaJInternalFrame.TraerTipoProcesoNominaBeans(tipoprocesonominasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoProcesoNomina);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoProcesoNominaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoProcesoNominaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoProcesoNominaBean.TraerTipoProcesoNominaBeans(tipoprocesonominasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoProcesoNominas(sAccionBusqueda,sTipoArchivoReporte,tipoprocesonominasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoProcesoNominas(sAccionBusqueda,sTipoArchivoReporte,tipoprocesonominasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoProcesoNominaActionPerformed(null);
					//this.generarExcelReporteTipoProcesoNominas(sAccionBusqueda,sTipoArchivoReporte,tipoprocesonominasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoProcesoNominas(sAccionBusqueda,sTipoArchivoReporte,tipoprocesonominasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoProcesoNominas(sAccionBusqueda,sTipoArchivoReporte,tipoprocesonominasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoProcesoNominas(sAccionBusqueda,sTipoArchivoReporte,tipoprocesonominasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoProcesoNominas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProcesoNomina> tipoprocesonominasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprocesonomina";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProcesoNominas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoProcesoNomina("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoProcesoNomina tipoprocesonomina : tipoprocesonominasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoProcesoNominaConstantesFunciones.generarExcelReporteDataTipoProcesoNomina("NORMAL",row,workbook,tipoprocesonomina,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proceso Nomina",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoProcesoNomina(String sTipo,Row row,Workbook workbook) {
		
		TipoProcesoNominaConstantesFunciones.generarExcelReporteHeaderTipoProcesoNomina(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoProcesoNominas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProcesoNomina> tipoprocesonominasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprocesonomina_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProcesoNominas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoProcesoNomina tipoprocesonomina : tipoprocesonominasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoProcesoNominaConstantesFunciones.getTipoProcesoNominaDescripcion(tipoprocesonomina));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoProcesoNominaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoProcesoNominaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprocesonomina.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoProcesoNominaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoProcesoNominaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprocesonomina.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proceso Nomina",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoProcesoNominas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProcesoNomina> tipoprocesonominasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoProcesoNomina> tipoprocesonominasRespaldo=null;
		
		classes=TipoProcesoNominaConstantesFunciones.getClassesRelationshipsOfTipoProcesoNomina(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoprocesonominaLogic.setDatosCliente(this.datosCliente);
		this.tipoprocesonominaLogic.setDatosDeep(this.datosDeep);
		this.tipoprocesonominaLogic.setIsConDeep(true);
		
		tipoprocesonominasRespaldo=this.tipoprocesonominaLogic.getTipoProcesoNominas();
		
		this.tipoprocesonominaLogic.setTipoProcesoNominas(tipoprocesonominasParaReportes);	
		this.tipoprocesonominaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoprocesonominasParaReportes=this.tipoprocesonominaLogic.getTipoProcesoNominas();
		this.tipoprocesonominaLogic.setTipoProcesoNominas(tipoprocesonominasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprocesonomina_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProcesoNominas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoProcesoNomina("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoProcesoNomina tipoprocesonomina : tipoprocesonominasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoProcesoNomina("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoProcesoNominaConstantesFunciones.generarExcelReporteDataTipoProcesoNomina("NORMAL",row,workbook,tipoprocesonomina,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoProcesoNominaConstantesFunciones.getTipoProcesoNominaDescripcion(tipoprocesonomina));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proceso Nomina",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoProcesoNomina() throws Exception {		
		this.startProcessTipoProcesoNomina(true);
	}
	
	public void startProcessTipoProcesoNomina(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoProcesoNomina, this.jScrollPanelDatosTipoProcesoNomina,this.jPanelPaginacionTipoProcesoNomina, this.jScrollPanelDatosEdicionTipoProcesoNomina, this.jPanelAccionesTipoProcesoNomina,this.jPanelAccionesFormularioTipoProcesoNomina,this.jmenuBarTipoProcesoNomina,this.jmenuBarDetalleTipoProcesoNomina,this.jTtoolBarTipoProcesoNomina,this.jTtoolBarDetalleTipoProcesoNomina);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoProcesoNomina=null; 
		
		final JPanel jPanelParametrosReportesTipoProcesoNomina=this.jPanelParametrosReportesTipoProcesoNomina;
		//final JScrollPane jScrollPanelDatosTipoProcesoNomina=this.jScrollPanelDatosTipoProcesoNomina;
		final JTable jTableDatosTipoProcesoNomina=this.jTableDatosTipoProcesoNomina;		
		final JPanel jPanelPaginacionTipoProcesoNomina=this.jPanelPaginacionTipoProcesoNomina;
		//final JScrollPane jScrollPanelDatosEdicionTipoProcesoNomina=this.jScrollPanelDatosEdicionTipoProcesoNomina;
		final JPanel jPanelAccionesTipoProcesoNomina=this.jPanelAccionesTipoProcesoNomina;
		
		JPanel jPanelCamposAuxiliarTipoProcesoNomina=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoProcesoNomina=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) {
			jPanelCamposAuxiliarTipoProcesoNomina=this.jInternalFrameDetalleFormTipoProcesoNomina.jPanelCamposTipoProcesoNomina;
			jPanelAccionesFormularioAuxiliarTipoProcesoNomina=this.jInternalFrameDetalleFormTipoProcesoNomina.jPanelAccionesFormularioTipoProcesoNomina;
		}
		
		final JPanel jPanelCamposTipoProcesoNomina=jPanelCamposAuxiliarTipoProcesoNomina;
		final JPanel jPanelAccionesFormularioTipoProcesoNomina=jPanelAccionesFormularioAuxiliarTipoProcesoNomina;
		
		
		final JMenuBar jmenuBarTipoProcesoNomina=this.jmenuBarTipoProcesoNomina;
		final JToolBar jTtoolBarTipoProcesoNomina=this.jTtoolBarTipoProcesoNomina;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoProcesoNomina=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoProcesoNomina=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) {
			jmenuBarDetalleAuxiliarTipoProcesoNomina=this.jInternalFrameDetalleFormTipoProcesoNomina.jmenuBarDetalleTipoProcesoNomina;
			jTtoolBarDetalleAuxiliarTipoProcesoNomina=this.jInternalFrameDetalleFormTipoProcesoNomina.jTtoolBarDetalleTipoProcesoNomina;
		}
		
		final JMenuBar jmenuBarDetalleTipoProcesoNomina=jmenuBarDetalleAuxiliarTipoProcesoNomina;
		final JToolBar jTtoolBarDetalleTipoProcesoNomina=jTtoolBarDetalleAuxiliarTipoProcesoNomina;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoProcesoNomina;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoProcesoNomina;
			processRunnable.jTableDatos=jTableDatosTipoProcesoNomina;
			processRunnable.jPanelCampos=jPanelCamposTipoProcesoNomina;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoProcesoNomina;
			processRunnable.jPanelAcciones=jPanelAccionesTipoProcesoNomina;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoProcesoNomina;
			
			
			processRunnable.jmenuBar=jmenuBarTipoProcesoNomina;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoProcesoNomina;
			processRunnable.jTtoolBar=jTtoolBarTipoProcesoNomina;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoProcesoNomina;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoProcesoNomina ,jPanelParametrosReportesTipoProcesoNomina,jTableDatosTipoProcesoNomina, /*jScrollPanelDatosTipoProcesoNomina,*/jPanelCamposTipoProcesoNomina,jPanelPaginacionTipoProcesoNomina, /*jScrollPanelDatosEdicionTipoProcesoNomina,*/ jPanelAccionesTipoProcesoNomina,jPanelAccionesFormularioTipoProcesoNomina,jmenuBarTipoProcesoNomina,jmenuBarDetalleTipoProcesoNomina,jTtoolBarTipoProcesoNomina,jTtoolBarDetalleTipoProcesoNomina);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoProcesoNomina, jScrollPanelDatosTipoProcesoNomina,jPanelPaginacionTipoProcesoNomina, jScrollPanelDatosEdicionTipoProcesoNomina, jPanelAccionesTipoProcesoNomina,jPanelAccionesFormularioTipoProcesoNomina,jmenuBarTipoProcesoNomina,jmenuBarDetalleTipoProcesoNomina,jTtoolBarTipoProcesoNomina,jTtoolBarDetalleTipoProcesoNomina);
						
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
	
	public void finishProcessTipoProcesoNomina() {// throws Exception 
		this.finishProcessTipoProcesoNomina(true);
	}
	
	public void finishProcessTipoProcesoNomina(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoProcesoNomina, this.jScrollPanelDatosTipoProcesoNomina,this.jPanelPaginacionTipoProcesoNomina, this.jScrollPanelDatosEdicionTipoProcesoNomina, this.jPanelAccionesTipoProcesoNomina,this.jPanelAccionesFormularioTipoProcesoNomina,this.jmenuBarTipoProcesoNomina,this.jmenuBarDetalleTipoProcesoNomina,this.jTtoolBarTipoProcesoNomina,this.jTtoolBarDetalleTipoProcesoNomina);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoProcesoNomina=null; 
		
		final JPanel jPanelParametrosReportesTipoProcesoNomina=this.jPanelParametrosReportesTipoProcesoNomina;
		//final JScrollPane jScrollPanelDatosTipoProcesoNomina=this.jScrollPanelDatosTipoProcesoNomina;
		final JTable jTableDatosTipoProcesoNomina=this.jTableDatosTipoProcesoNomina;		
		final JPanel jPanelPaginacionTipoProcesoNomina=this.jPanelPaginacionTipoProcesoNomina;
		//final JScrollPane jScrollPanelDatosEdicionTipoProcesoNomina=this.jScrollPanelDatosEdicionTipoProcesoNomina;
		final JPanel jPanelAccionesTipoProcesoNomina=this.jPanelAccionesTipoProcesoNomina;
		
		JPanel jPanelCamposAuxiliarTipoProcesoNomina=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoProcesoNomina=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) {
			jPanelCamposAuxiliarTipoProcesoNomina=this.jInternalFrameDetalleFormTipoProcesoNomina.jPanelCamposTipoProcesoNomina;
			jPanelAccionesFormularioAuxiliarTipoProcesoNomina=this.jInternalFrameDetalleFormTipoProcesoNomina.jPanelAccionesFormularioTipoProcesoNomina;
		}
		
		final JPanel jPanelCamposTipoProcesoNomina=jPanelCamposAuxiliarTipoProcesoNomina;
		final JPanel jPanelAccionesFormularioTipoProcesoNomina=jPanelAccionesFormularioAuxiliarTipoProcesoNomina;
		
		
		final JMenuBar jmenuBarTipoProcesoNomina=this.jmenuBarTipoProcesoNomina;		
		final JToolBar jTtoolBarTipoProcesoNomina=this.jTtoolBarTipoProcesoNomina;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoProcesoNomina=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoProcesoNomina=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) {
			jmenuBarDetalleAuxiliarTipoProcesoNomina=this.jInternalFrameDetalleFormTipoProcesoNomina.jmenuBarDetalleTipoProcesoNomina;
			jTtoolBarDetalleAuxiliarTipoProcesoNomina=this.jInternalFrameDetalleFormTipoProcesoNomina.jTtoolBarDetalleTipoProcesoNomina;		
		}
		
		final JMenuBar jmenuBarDetalleTipoProcesoNomina=jmenuBarDetalleAuxiliarTipoProcesoNomina;
		final JToolBar jTtoolBarDetalleTipoProcesoNomina=jTtoolBarDetalleAuxiliarTipoProcesoNomina;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoProcesoNomina;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoProcesoNomina;
			processRunnable.jTableDatos=jTableDatosTipoProcesoNomina;
			processRunnable.jPanelCampos=jPanelCamposTipoProcesoNomina;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoProcesoNomina;
			processRunnable.jPanelAcciones=jPanelAccionesTipoProcesoNomina;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoProcesoNomina;
			
			
			processRunnable.jmenuBar=jmenuBarTipoProcesoNomina;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoProcesoNomina;
			processRunnable.jTtoolBar=jTtoolBarTipoProcesoNomina;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoProcesoNomina;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoProcesoNomina ,jPanelParametrosReportesTipoProcesoNomina, jTableDatosTipoProcesoNomina,/*jScrollPanelDatosTipoProcesoNomina,*/jPanelCamposTipoProcesoNomina,jPanelPaginacionTipoProcesoNomina, /*jScrollPanelDatosEdicionTipoProcesoNomina,*/ jPanelAccionesTipoProcesoNomina,jPanelAccionesFormularioTipoProcesoNomina,jmenuBarTipoProcesoNomina,jmenuBarDetalleTipoProcesoNomina,jTtoolBarTipoProcesoNomina,jTtoolBarDetalleTipoProcesoNomina));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoProcesoNomina(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoProcesoNomina(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoProcesoNomina(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoProcesoNomina(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoProcesoNomina,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoProcesoNomina,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoProcesoNomina(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoProcesoNomina,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoProcesoNomina,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoprocesonominaConstantesFunciones.getsFinalQueryTipoProcesoNomina();
		String  finalQueryPaginacionTodos=this.tipoprocesonominaConstantesFunciones.getsFinalQueryTipoProcesoNomina();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoProcesoNominaConstantesFunciones.getArrayColumnasGlobalesNoTipoProcesoNomina(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoProcesoNominaConstantesFunciones.getArrayColumnasGlobalesTipoProcesoNomina(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoProcesoNominaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoprocesonominasEliminados= new ArrayList<TipoProcesoNomina>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoProcesoNomina();
		
				///*TipoProcesoNominaSessionBean*/this.tipoprocesonominaSessionBean=new TipoProcesoNominaSessionBean();
			
			if(this.tipoprocesonominaSessionBean==null) {
				this.tipoprocesonominaSessionBean=new TipoProcesoNominaSessionBean();
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
					this.iNumeroPaginacion=TipoProcesoNominaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoProcesoNominaConstantesFunciones.getClassesForeignKeysOfTipoProcesoNomina(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoprocesonomina."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoprocesonominasAux= new ArrayList<TipoProcesoNomina>();
			
				
			tipoprocesonominaLogic.setDatosCliente(this.datosCliente);
			tipoprocesonominaLogic.setDatosDeep(this.datosDeep);
			tipoprocesonominaLogic.setIsConDeep(true);
			
			
			tipoprocesonominaLogic.getTipoProcesoNominaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoprocesonominaLogic.getTodosTipoProcesoNominas(finalQueryGlobal,pagination);
					
					//tipoprocesonominaLogic.getTodosTipoProcesoNominasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoprocesonominaLogic.getTipoProcesoNominas()==null|| tipoprocesonominaLogic.getTipoProcesoNominas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprocesonominasAux= new ArrayList<TipoProcesoNomina>();
							tipoprocesonominasAux.addAll(tipoprocesonominaLogic.getTipoProcesoNominas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprocesonominasAux= new ArrayList<TipoProcesoNomina>();
							tipoprocesonominasAux.addAll(tipoprocesonominas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprocesonominaLogic.getTodosTipoProcesoNominas(finalQueryGlobal+"",this.pagination);												
							
							//tipoprocesonominaLogic.getTodosTipoProcesoNominasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoProcesoNominas("Todos",tipoprocesonominaLogic.getTipoProcesoNominas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprocesonominaLogic.setTipoProcesoNominas(new ArrayList<TipoProcesoNomina>());					
							tipoprocesonominaLogic.getTipoProcesoNominas().addAll(tipoprocesonominasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprocesonominas=new ArrayList<TipoProcesoNomina>();
							tipoprocesonominas.addAll(tipoprocesonominasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoProcesoNomina=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoProcesoNomina=this.idActual;
				
				} else if(this.idTipoProcesoNominaActual!=null && this.idTipoProcesoNominaActual!=0L) {
					idTipoProcesoNomina=idTipoProcesoNominaActual;
				}
				
					
				this.sDetalleReporte=TipoProcesoNominaConstantesFunciones.getDetalleIndicePorId(idTipoProcesoNomina);
				
				this.tipoprocesonominas=new ArrayList<TipoProcesoNomina>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoprocesonominaLogic.getEntity(idTipoProcesoNomina);
					
					//tipoprocesonominaLogic.getEntityWithConnection(idTipoProcesoNomina);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprocesonominaLogic.setTipoProcesoNominas(new ArrayList<TipoProcesoNomina>());
					tipoprocesonominaLogic.getTipoProcesoNominas().add(tipoprocesonominaLogic.getTipoProcesoNomina());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprocesonominas=new ArrayList<TipoProcesoNomina>();
					this.tipoprocesonominas.add(tipoprocesonomina);
				}
				
				if(tipoprocesonominaLogic.getTipoProcesoNomina()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoProcesoNomina();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoProcesoNomina();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoprocesonominaLogic.getTipoProcesoNominas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprocesonominas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoprocesonominaLogic.getTipoProcesoNominas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprocesonominas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoProcesoNomina tipoprocesonomina) {
		Boolean permite=true;
		
		if(this.tipoprocesonomina.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoProcesoNominaConstantesFunciones.getOrderByListaTipoProcesoNomina();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoProcesoNominaConstantesFunciones.getOrderByListaTipoProcesoNomina();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProcesoNomina tipoprocesonomina:tipoprocesonominaLogic.getTipoProcesoNominas()) {
				if(tipoprocesonomina.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprocesonominaTotales=tipoprocesonomina;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProcesoNomina tipoprocesonomina:this.tipoprocesonominas) {
				if(tipoprocesonomina.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprocesonominaTotales=tipoprocesonomina;
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
			this.tipoprocesonominaAux=new TipoProcesoNomina();
			this.tipoprocesonominaAux.setsType(Constantes2.S_TOTALES);
			this.tipoprocesonominaAux.setIsNew(false);
			this.tipoprocesonominaAux.setIsChanged(false);
			this.tipoprocesonominaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoProcesoNominaConstantesFunciones.TotalizarValoresFilaTipoProcesoNomina(this.tipoprocesonominaLogic.getTipoProcesoNominas(),this.tipoprocesonominaAux);
				
				this.tipoprocesonominaLogic.getTipoProcesoNominas().add(this.tipoprocesonominaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoProcesoNominaConstantesFunciones.TotalizarValoresFilaTipoProcesoNomina(this.tipoprocesonominas,this.tipoprocesonominaAux);
				
				this.tipoprocesonominas.add(this.tipoprocesonominaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoprocesonominaTotales=new TipoProcesoNomina();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoprocesonominaLogic.getTipoProcesoNominas().remove(tipoprocesonominaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoprocesonominas.remove(tipoprocesonominaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoprocesonominaTotales=new TipoProcesoNomina();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProcesoNomina tipoprocesonomina:tipoprocesonominaLogic.getTipoProcesoNominas()) {
				if(tipoprocesonomina.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprocesonominaTotales=tipoprocesonomina;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoProcesoNominaConstantesFunciones.TotalizarValoresFilaTipoProcesoNomina(this.tipoprocesonominaLogic.getTipoProcesoNominas(),tipoprocesonominaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProcesoNomina tipoprocesonomina:this.tipoprocesonominas) {
				if(tipoprocesonomina.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprocesonominaTotales=tipoprocesonomina;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoProcesoNominaConstantesFunciones.TotalizarValoresFilaTipoProcesoNomina(this.tipoprocesonominas,tipoprocesonominaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoProcesoNomina() {
		this.isPermisoTodoTipoProcesoNomina=false;
		this.isPermisoNuevoTipoProcesoNomina=false;
		this.isPermisoActualizarTipoProcesoNomina=false;
		this.isPermisoActualizarOriginalTipoProcesoNomina=false;
		this.isPermisoEliminarTipoProcesoNomina=false;
		this.isPermisoGuardarCambiosTipoProcesoNomina=false;
		this.isPermisoConsultaTipoProcesoNomina=false;
		this.isPermisoBusquedaTipoProcesoNomina=false;
		this.isPermisoReporteTipoProcesoNomina=false;		
		this.isPermisoOrdenTipoProcesoNomina=false;		
		this.isPermisoPaginacionMedioTipoProcesoNomina=false;		
		this.isPermisoPaginacionAltoTipoProcesoNomina=false;
		this.isPermisoPaginacionTodoTipoProcesoNomina=false;
		this.isPermisoCopiarTipoProcesoNomina=false;		
		this.isPermisoVerFormTipoProcesoNomina=false;		
		this.isPermisoDuplicarTipoProcesoNomina=false;		
		this.isPermisoOrdenTipoProcesoNomina=false;		
	}
	
	public void setPermisosUsuarioTipoProcesoNomina(Boolean isPermiso) {
		this.isPermisoTodoTipoProcesoNomina=isPermiso;
		this.isPermisoNuevoTipoProcesoNomina=isPermiso;
		this.isPermisoActualizarTipoProcesoNomina=isPermiso;
		this.isPermisoActualizarOriginalTipoProcesoNomina=isPermiso;
		this.isPermisoEliminarTipoProcesoNomina=isPermiso;
		this.isPermisoGuardarCambiosTipoProcesoNomina=isPermiso;
		this.isPermisoConsultaTipoProcesoNomina=isPermiso;
		this.isPermisoBusquedaTipoProcesoNomina=isPermiso;
		this.isPermisoReporteTipoProcesoNomina=isPermiso;
		this.isPermisoOrdenTipoProcesoNomina=isPermiso;		
		this.isPermisoPaginacionMedioTipoProcesoNomina=isPermiso;		
		this.isPermisoPaginacionAltoTipoProcesoNomina=isPermiso;		
		this.isPermisoPaginacionTodoTipoProcesoNomina=isPermiso;		
		this.isPermisoCopiarTipoProcesoNomina=isPermiso;		
		this.isPermisoVerFormTipoProcesoNomina=isPermiso;		
		this.isPermisoDuplicarTipoProcesoNomina=isPermiso;
		this.isPermisoOrdenTipoProcesoNomina=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoProcesoNomina(Boolean isPermiso) {
		//this.isPermisoTodoTipoProcesoNomina=isPermiso;
		this.isPermisoNuevoTipoProcesoNomina=isPermiso;
		this.isPermisoActualizarTipoProcesoNomina=isPermiso;
		this.isPermisoActualizarOriginalTipoProcesoNomina=isPermiso;
		this.isPermisoEliminarTipoProcesoNomina=isPermiso;
		this.isPermisoGuardarCambiosTipoProcesoNomina=isPermiso;
		//this.isPermisoConsultaTipoProcesoNomina=isPermiso;
		//this.isPermisoBusquedaTipoProcesoNomina=isPermiso;
		//this.isPermisoReporteTipoProcesoNomina=isPermiso;
		//this.isPermisoOrdenTipoProcesoNomina=isPermiso;		
		//this.isPermisoPaginacionMedioTipoProcesoNomina=isPermiso;		
		//this.isPermisoPaginacionAltoTipoProcesoNomina=isPermiso;		
		//this.isPermisoPaginacionTodoTipoProcesoNomina=isPermiso;		
		//this.isPermisoCopiarTipoProcesoNomina=isPermiso;		
		//this.isPermisoDuplicarTipoProcesoNomina=isPermiso;
		//this.isPermisoOrdenTipoProcesoNomina=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoProcesoNominaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoProcesoNominaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoProcesoNomina(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoProcesoNominaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoProcesoNominaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoProcesoNominaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoProcesoNominaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoProcesoNomina() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoProcesoNominaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoProcesoNominaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoProcesoNomina=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoProcesoNomina=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoProcesoNomina=this.isPermisoActualizarTipoProcesoNomina;
			this.isPermisoEliminarTipoProcesoNomina=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoProcesoNomina=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoProcesoNomina=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoProcesoNomina=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoProcesoNomina=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoProcesoNomina=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoProcesoNomina=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoProcesoNomina=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoProcesoNomina=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoProcesoNomina=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoProcesoNomina=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoProcesoNomina=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoProcesoNomina=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoProcesoNomina=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoProcesoNomina.setToolTipText(this.jTableDatosTipoProcesoNomina.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoProcesoNomina(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoProcesoNomina(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoProcesoNominaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoProcesoNominaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoProcesoNomina() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoProcesoNominaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoProcesoNominaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoProcesoNominaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoProcesoNominaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoProcesoNominaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoProcesoNomina()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoProcesoNomina()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoProcesoNomina(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoProcesoNomina()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProcesoNomina();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoProcesoNomina(TipoProcesoNomina tipoprocesonomina)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoProcesoNomina(TipoProcesoNomina tipoprocesonomina,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoProcesoNomina()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProcesoNomina()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoProcesoNomina()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoProcesoNomina()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoProcesoNomina()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoProcesoNomina()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoProcesoNomina(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoProcesoNomina()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoProcesoNominaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoProcesoNominaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoProcesoNominaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoprocesonominaSessionBean=new TipoProcesoNominaSessionBean(); 
		this.tipoprocesonominaConstantesFunciones=new TipoProcesoNominaConstantesFunciones(); 
		this.tipoprocesonominaBean=new TipoProcesoNomina();//(this.tipoprocesonominaConstantesFunciones); 		
		this.tipoprocesonominaReturnGeneral=new TipoProcesoNominaParameterReturnGeneral(); 
		
		this.tipoprocesonominaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprocesonominaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoProcesoNominaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoProcesoNominaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoProcesoNominaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoProcesoNomina(true);
			
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
			
			this.tipoprocesonominaConstantesFunciones=new TipoProcesoNominaConstantesFunciones(); 
			this.tipoprocesonominaBean=new TipoProcesoNomina();//this.tipoprocesonominaConstantesFunciones); 			
			this.tipoprocesonominaReturnGeneral=new TipoProcesoNominaParameterReturnGeneral(); 
		
			TipoProcesoNominaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Proceso Nomina Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoprocesonomina=new TipoProcesoNomina();
			this.tipoprocesonominas = new ArrayList<TipoProcesoNomina>();
			this.tipoprocesonominasAux = new ArrayList<TipoProcesoNomina>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic=new TipoProcesoNominaLogic();
				this.tipoprocesonominaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoprocesonominaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoprocesonominaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoProcesoNomina);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoProcesoNomina!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoProcesoNomina);	
					}
					
					if(this.jInternalFrameImportacionTipoProcesoNomina!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoProcesoNomina);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoProcesoNomina!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoProcesoNomina);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoProcesoNomina);
				this.jInternalFrameDetalleFormTipoProcesoNomina.setVisible(false);
				this.jInternalFrameDetalleFormTipoProcesoNomina.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoProcesoNomina!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoProcesoNomina);
					this.jInternalFrameReporteDinamicoTipoProcesoNomina.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoProcesoNomina.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoProcesoNomina!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoProcesoNomina);
					this.jInternalFrameImportacionTipoProcesoNomina.setVisible(false);
					this.jInternalFrameImportacionTipoProcesoNomina.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoProcesoNomina!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoProcesoNomina);
					this.jInternalFrameOrderByTipoProcesoNomina.setVisible(false);
					this.jInternalFrameOrderByTipoProcesoNomina.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoProcesoNominaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoProcesoNominaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoprocesonominaReturnGeneral=new TipoProcesoNominaParameterReturnGeneral();
			
			this.tipoprocesonominaParameterGeneral=new TipoProcesoNominaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoprocesonominaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoProcesoNominaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoProcesoNominaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoprocesonominaSessionBean.getEsGuardarRelacionado(),this.tipoprocesonominaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoProcesoNominaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoprocesonominaSessionBean.getEsGuardarRelacionado(),this.tipoprocesonominaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoProcesoNomina=false;
			this.isVisibilidadCeldaDuplicarTipoProcesoNomina=true;
			this.isVisibilidadCeldaCopiarTipoProcesoNomina=true;
			this.isVisibilidadCeldaVerFormTipoProcesoNomina=true;
			this.isVisibilidadCeldaOrdenTipoProcesoNomina=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoNomina=false;
			this.isVisibilidadCeldaModificarTipoProcesoNomina=false;
			this.isVisibilidadCeldaActualizarTipoProcesoNomina=false;
			this.isVisibilidadCeldaEliminarTipoProcesoNomina=false;
			this.isVisibilidadCeldaCancelarTipoProcesoNomina=false;
			this.isVisibilidadCeldaGuardarTipoProcesoNomina=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoNomina=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoProcesoNomina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoProcesoNomina();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoProcesoNomina(false);
			
			this.setPermisosUsuarioTipoProcesoNomina();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprocesonominaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoprocesonominaSessionBean.getEsGuardarRelacionado() && this.tipoprocesonominaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoProcesoNominaClasesRelacionadas();
			}
			
			if(this.tipoprocesonominaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoProcesoNominaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoProcesoNominaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoProcesoNomina();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoProcesoNomina();
			}
			
			if(!this.isPermisoBusquedaTipoProcesoNomina) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoProcesoNomina,this.isPermisoPaginacionMedioTipoProcesoNomina,this.isPermisoPaginacionTodoTipoProcesoNomina);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoProcesoNominaConstantesFunciones.getTiposSeleccionarTipoProcesoNomina());
				
				this.tiposColumnasSelect=TipoProcesoNominaConstantesFunciones.getTiposSeleccionarTipoProcesoNomina(true);
				
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
			//if(!this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoProcesoNomina();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoProcesoNomina(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoProcesoNomina(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProcesoNomina() ;
			
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
				tipoprocesonominaImplementable= (TipoProcesoNominaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoProcesoNominaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoprocesonominaImplementableHome= (TipoProcesoNominaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoProcesoNominaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoprocesonominas= new ArrayList<TipoProcesoNomina>();
			this.tipoprocesonominasEliminados= new ArrayList<TipoProcesoNomina>();
						
			this.isEsNuevoTipoProcesoNomina=false;
			this.esParaAccionDesdeFormularioTipoProcesoNomina=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoProcesoNomina(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoProcesoNomina();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoProcesoNominaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoProcesoNomina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoProcesoNomina(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoProcesoNomina();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoProcesoNomina();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoProcesoNomina(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoProcesoNomina: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoProcesoNomina() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoProcesoNomina")) {
				iIndex=this.jInternalFrameDetalleFormTipoProcesoNomina.jTabbedPaneRelacionesTipoProcesoNomina.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoProcesoNomina.jTabbedPaneRelacionesTipoProcesoNomina.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoProcesoNomina.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoProcesoNomina();	
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
	
	public void cargarCombosForeignKeyTipoProcesoNomina(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoProcesoNomina(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoProcesoNomina(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoProcesoNominaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoProcesoNomina();
		
		this.cargarCombosFrameForeignKeyTipoProcesoNomina();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoProcesoNomina();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoProcesoNomina();
		}
	}
	
	
	
	public void jButtonNuevoTipoProcesoNominaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoprocesonominaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoProcesoNomina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
			
			
			if(jTableDatosTipoProcesoNomina.getRowCount()>=1) {
				jTableDatosTipoProcesoNomina.removeRowSelectionInterval(0, jTableDatosTipoProcesoNomina.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoProcesoNomina=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoProcesoNomina(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoProcesoNomina(true);			
			//this.tipoprocesonomina=new TipoProcesoNomina();
			//this.tipoprocesonomina.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProcesoNomina(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProcesoNomina() ;
			
			if(TipoProcesoNominaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProcesoNomina(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoprocesonomina);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesonomina);				
			
			TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
			
			if(this.tipoprocesonominaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoProcesoNomina: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoProcesoNominaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoProcesoNomina> tipoprocesonominasSeleccionados=new ArrayList<TipoProcesoNomina>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoProcesoNomina.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoProcesoNomina.getSelectedRows().length;			
			}
			
			tipoprocesonominasSeleccionados=this.getTipoProcesoNominasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoProcesoNomina--;			
				//TipoProcesoNomina tipoprocesonominaAux= new TipoProcesoNomina();			
				//tipoprocesonominaAux.setId(this.iIdNuevoTipoProcesoNomina);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoProcesoNomina tipoprocesonominaOrigen=new TipoProcesoNomina();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoProcesoNomina tipoprocesonominaOrigen : tipoprocesonominasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoProcesoNomina.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoprocesonominaOrigen =(TipoProcesoNomina) this.tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprocesonominaOrigen =(TipoProcesoNomina) this.tipoprocesonominas.toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoProcesoNomina();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoprocesonomina.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoProcesoNomina(tipoprocesonominaOrigen,this.tipoprocesonomina,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoNomina(this.tipoprocesonomina);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoprocesonominaLogic.getTipoProcesoNominas().add(this.tipoprocesonominaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoprocesonominas.add(this.tipoprocesonominaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoProcesoNomina(false);
				
				this.jTableDatosTipoProcesoNomina.setRowSelectionInterval(this.getIndiceNuevoTipoProcesoNomina(), this.getIndiceNuevoTipoProcesoNomina());
				
				int iLastRow =  this.jTableDatosTipoProcesoNomina.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoProcesoNomina.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoProcesoNomina.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProcesoNomina(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoProcesoNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoProcesoNomina> tipoprocesonominasSeleccionados=new ArrayList<TipoProcesoNomina>();									
		
			TipoProcesoNomina tipoprocesonominaOrigen=new TipoProcesoNomina();
			TipoProcesoNomina tipoprocesonominaDestino=new TipoProcesoNomina();
				
			tipoprocesonominasSeleccionados=this.getTipoProcesoNominasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoProcesoNomina.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoprocesonominasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoProcesoNomina.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprocesonominaOrigen =(TipoProcesoNomina) this.tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoprocesonominaOrigen =(TipoProcesoNomina) this.tipoprocesonominas.toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprocesonominaDestino =(TipoProcesoNomina) this.tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoprocesonominaDestino =(TipoProcesoNomina) this.tipoprocesonominas.toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoprocesonominaOrigen =tipoprocesonominasSeleccionados.get(0);
				tipoprocesonominaDestino =tipoprocesonominasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoProcesoNomina(tipoprocesonominaOrigen,tipoprocesonominaDestino,true,false);
				
				tipoprocesonominaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoprocesonominaDestino,tipoprocesonominaLogic.getTipoProcesoNominas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprocesonominaDestino,tipoprocesonominas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoProcesoNomina(false);
				
				//this.jTableDatosTipoProcesoNomina.setRowSelectionInterval(this.getIndiceNuevoTipoProcesoNomina(), this.getIndiceNuevoTipoProcesoNomina());
				
				int iLastRow =  this.jTableDatosTipoProcesoNomina.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoProcesoNomina.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoProcesoNomina.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProcesoNomina(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoProcesoNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoProcesoNomina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoProcesoNomina.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoProcesoNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoProcesoNomina.isVisible();
			
			
			this.jPanelParametrosReportesTipoProcesoNomina.setVisible(!isVisible);
			this.jPanelPaginacionTipoProcesoNomina.setVisible(!isVisible);
			this.jPanelAccionesTipoProcesoNomina.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoProcesoNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoProcesoNomina();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoProcesoNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoProcesoNomina();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoProcesoNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoProcesoNomina();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoProcesoNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoProcesoNomina();
			
			this.abrirFrameOrderByTipoProcesoNomina();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoProcesoNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoProcesoNomina();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoProcesoNomina(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoProcesoNomina);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoProcesoNomina.isMaximum()) {
					this.jInternalFrameDetalleFormTipoProcesoNomina.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoProcesoNomina.setSize(this.jInternalFrameDetalleFormTipoProcesoNomina.iWidthFormulario,this.jInternalFrameDetalleFormTipoProcesoNomina.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoProcesoNomina.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoProcesoNomina.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoProcesoNomina.isMaximum()) {
						this.jInternalFrameDetalleFormTipoProcesoNomina.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoProcesoNomina.jContentPaneDetalleTipoProcesoNomina.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoProcesoNomina.jTabbedPaneRelacionesTipoProcesoNomina.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoProcesoNomina.jContentPaneDetalleTipoProcesoNomina.getWidth(),TipoProcesoNominaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoProcesoNomina.jTabbedPaneRelacionesTipoProcesoNomina.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoProcesoNomina.jContentPaneDetalleTipoProcesoNomina.getWidth(),TipoProcesoNominaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoProcesoNomina.jTabbedPaneRelacionesTipoProcesoNomina.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoProcesoNomina.jContentPaneDetalleTipoProcesoNomina.getWidth(),TipoProcesoNominaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoProcesoNomina.setVisible(true);
	        this.jInternalFrameDetalleFormTipoProcesoNomina.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoProcesoNomina() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoProcesoNomina==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoProcesoNomina=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProcesoNomina,false,this);
				} else {
					this.jInternalFrameOrderByTipoProcesoNomina=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProcesoNomina,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoProcesoNomina);
				this.jInternalFrameOrderByTipoProcesoNomina.setVisible(false);
				this.jInternalFrameOrderByTipoProcesoNomina.setSelected(false);
				
				this.jInternalFrameOrderByTipoProcesoNomina.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoProcesoNomina"));
				
				this.inicializarActualizarBindingTablaOrderByTipoProcesoNomina();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoProcesoNomina() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoProcesoNomina==null) {
				
				this.jInternalFrameImportacionTipoProcesoNomina=new ImportacionJInternalFrame(TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoProcesoNomina);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoProcesoNomina);
				this.jInternalFrameImportacionTipoProcesoNomina.setVisible(false);
				this.jInternalFrameImportacionTipoProcesoNomina.setSelected(false);


				this.jInternalFrameImportacionTipoProcesoNomina.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoProcesoNomina"));
				this.jInternalFrameImportacionTipoProcesoNomina.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoProcesoNomina"));
				this.jInternalFrameImportacionTipoProcesoNomina.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoProcesoNomina"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoProcesoNomina() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoProcesoNomina==null) {
				this.jInternalFrameReporteDinamicoTipoProcesoNomina=new ReporteDinamicoJInternalFrame(TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoProcesoNomina);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoProcesoNomina);
				this.jInternalFrameReporteDinamicoTipoProcesoNomina.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoProcesoNomina.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProcesoNomina"));
				this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProcesoNomina"));
				this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProcesoNomina"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProcesoNomina();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoProcesoNomina() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoProcesoNomina);
			
	       	this.jInternalFrameDetalleFormTipoProcesoNomina.setVisible(false);
	        this.jInternalFrameDetalleFormTipoProcesoNomina.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoProcesoNomina.dispose();
			//this.jInternalFrameDetalleFormTipoProcesoNomina=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoProcesoNomina() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoProcesoNomina.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoProcesoNomina.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoProcesoNomina() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoProcesoNomina.setVisible(true);
	        this.jInternalFrameImportacionTipoProcesoNomina.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoProcesoNomina() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoProcesoNomina.setVisible(true);
	        this.jInternalFrameOrderByTipoProcesoNomina.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoProcesoNomina() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoProcesoNomina.setVisible(false);
	        this.jInternalFrameOrderByTipoProcesoNomina.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoProcesoNomina() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoProcesoNomina.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoProcesoNomina.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoProcesoNomina() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoProcesoNomina.setVisible(false);
	        this.jInternalFrameImportacionTipoProcesoNomina.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoProcesoNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoProcesoNomina(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoProcesoNomina(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoProcesoNomina.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoProcesoNomina(true);
			//this.isEsNuevoTipoProcesoNomina=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominas.toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoProcesoNomina("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProcesoNomina(false) ;
			
			if(tipoprocesonominaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoProcesoNominaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProcesoNomina(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProcesoNomina(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoProcesoNominaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoProcesoNomina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominas.toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoProcesoNomina(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoProcesoNomina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoProcesoNomina.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoProcesoNomina(true);
			//this.isEsNuevoTipoProcesoNomina=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominas.toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoprocesonomina.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoProcesoNomina("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoProcesoNomina(false) ;
			
			if(TipoProcesoNominaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProcesoNomina(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProcesoNomina(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoProcesoNominaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoProcesoNomina(false);
			
			//if(!this.isEsNuevoTipoProcesoNomina) {								
				int intSelectedRow = this.jTableDatosTipoProcesoNomina.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominas.toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoProcesoNominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoProcesoNomina(this.tipoprocesonomina,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoNomina(this.tipoprocesonomina);
				
			}
			
			if(this.permiteMantenimiento(this.tipoprocesonomina)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoProcesoNomina=true;
					this.inicializarActualizarBindingTablaTipoProcesoNomina(false);
					this.isEsNuevoTipoProcesoNomina=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoProcesoNomina=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoProcesoNomina=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoProcesoNomina(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProcesoNomina(false);
				
				this.habilitarDeshabilitarControlesTipoProcesoNomina(false);
			
												
				
				if(TipoProcesoNominaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoProcesoNomina();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoProcesoNominaActionPerformed(evt,tipoprocesonominaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoProcesoNomina(this.tipoprocesonomina,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoProcesoNomina.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoprocesonominaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoprocesonomina.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoProcesoNomina.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoNomina.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoProcesoNominaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoProcesoNomina.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
				this.tipoprocesonomina.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominas.toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
				this.tipoprocesonomina.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoprocesonomina)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoProcesoNominaModel) this.jTableDatosTipoProcesoNomina.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoProcesoNomina=true;
				this.inicializarActualizarBindingTablaTipoProcesoNomina(false);
				this.isEsNuevoTipoProcesoNomina=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoProcesoNomina(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProcesoNomina(false);
				
				this.habilitarDeshabilitarControlesTipoProcesoNomina(false);
				
				
				
				if(TipoProcesoNominaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoProcesoNomina();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoProcesoNominaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoProcesoNomina.getRowCount()>=1) {
				jTableDatosTipoProcesoNomina.removeRowSelectionInterval(0, jTableDatosTipoProcesoNomina.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoProcesoNomina(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoProcesoNomina(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProcesoNomina(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProcesoNomina(false) ;
			
			this.isEsNuevoTipoProcesoNomina=false;
			
			if(TipoProcesoNominaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoProcesoNomina();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoProcesoNominaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoProcesoNomina(false);
				
				//SI ES MANUAL
				if(TipoProcesoNominaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoProcesoNomina();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoProcesoNominaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoProcesoNomina--;			
			//TipoProcesoNomina tipoprocesonominaAux= new TipoProcesoNomina();			
			//tipoprocesonominaAux.setId(this.iIdNuevoTipoProcesoNomina);
			
			if(this.jInternalFrameDetalleFormTipoProcesoNomina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoProcesoNomina();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoNomina(this.tipoprocesonomina);
			
			this.tipoprocesonomina.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoprocesonominaLogic.getTipoProcesoNominas().add(this.tipoprocesonominaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoprocesonominas.add(this.tipoprocesonominaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoProcesoNomina(false);
			
			this.jTableDatosTipoProcesoNomina.setRowSelectionInterval(this.getIndiceNuevoTipoProcesoNomina(), this.getIndiceNuevoTipoProcesoNomina());
			
			int iLastRow =  this.jTableDatosTipoProcesoNomina.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoProcesoNomina.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoProcesoNomina.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoProcesoNomina(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoProcesoNominaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoProcesoNomina(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProcesoNomina(false);
			
			//SI ES MANUAL
			if(TipoProcesoNominaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProcesoNomina();
			}
			
			//this.abrirFrameTreeTipoProcesoNomina();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoProcesoNominaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Proceso NominaES ?", "MANTENIMIENTO DE Tipo Proceso Nomina", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoProcesoNomina.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoProcesoNomina();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoprocesonominaReturnGeneral=tipoprocesonominaLogic.procesarImportacionTipoProcesoNominasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoprocesonominaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoProcesoNominaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoProcesoNominaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoProcesoNomina.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoProcesoNomina.setFileImportacion(this.jInternalFrameImportacionTipoProcesoNomina.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoProcesoNomina.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoProcesoNomina.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoProcesoNomina.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoProcesoNomina.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoProcesoNominaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoProcesoNomina> tipoprocesonominasSeleccionados=new ArrayList<TipoProcesoNomina>();		

		tipoprocesonominasSeleccionados=this.getTipoProcesoNominasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoProcesoNominaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoProcesoNominaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoProcesoNominas("Todos",tipoprocesonominasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proceso Nomina",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoProcesoNominaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoProcesoNominaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoProcesoNominaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoProcesoNominaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoProcesoNominaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoProcesoNominaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoProcesoNominaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoProcesoNominaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoProcesoNominaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoProcesoNomina> tipoprocesonominasSeleccionados=new ArrayList<TipoProcesoNomina>();		
		
		tipoprocesonominasSeleccionados=this.getTipoProcesoNominasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprocesonomina";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoProcesoNominas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoProcesoNominaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoProcesoNominaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoProcesoNomina tipoprocesonomina:tipoprocesonominasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprocesonomina.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoProcesoNominaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoProcesoNominaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoProcesoNomina tipoprocesonomina:tipoprocesonominasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprocesonomina.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoProcesoNomina(row);				
			//	iRow++;
			//}				
			
			//for(TipoProcesoNomina tipoprocesonominaAux:tipoprocesonominasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoProcesoNomina(tipoprocesonominaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proceso Nomina",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoprocesonominaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProcesoNomina(false);
			
			//SI ES MANUAL
			if(TipoProcesoNominaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProcesoNomina();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoProcesoNominaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProcesoNomina(false);
			
			//SI ES MANUAL
			if(TipoProcesoNominaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoProcesoNomina();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoProcesoNominaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProcesoNomina(false);
			
			//SI ES MANUAL
			if(TipoProcesoNominaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoProcesoNomina();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesonominaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoProcesoNomina() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoProcesoNomina.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoProcesoNomina.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoProcesoNomina.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoProcesoNomina.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoProcesoNomina.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoProcesoNomina.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoProcesoNomina.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoProcesoNomina(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoProcesoNomina(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoProcesoNomina(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoProcesoNomina(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoProcesoNomina(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoProcesoNomina(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProcesoNomina(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoProcesoNomina(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoProcesoNominaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoProcesoNominaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoProcesoNomina() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoProcesoNomina();
		
		this.inicializarActualizarBindingBotonesManualTipoProcesoNomina(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoProcesoNomina();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProcesoNomina() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProcesoNomina(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProcesoNomina(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoProcesoNomina.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoProcesoNomina.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoProcesoNomina.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoProcesoNomina.jCheckBoxPostAccionNuevoTipoProcesoNomina.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoProcesoNomina.jCheckBoxPostAccionSinCerrarTipoProcesoNomina.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoProcesoNomina.jCheckBoxPostAccionSinMensajeTipoProcesoNomina.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoProcesoNomina.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoProcesoNomina.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoProcesoNomina.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) {
				this.jInternalFrameDetalleFormTipoProcesoNomina.jCheckBoxPostAccionNuevoTipoProcesoNomina.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoProcesoNomina.jCheckBoxPostAccionSinCerrarTipoProcesoNomina.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoProcesoNomina.jCheckBoxPostAccionSinMensajeTipoProcesoNomina.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoProcesoNomina.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoProcesoNomina.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoProcesoNomina.jComboBoxTiposAccionesFormularioTipoProcesoNomina.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoProcesoNomina.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoProcesoNomina!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoProcesoNomina.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoProcesoNomina.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoProcesoNomina.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoProcesoNomina.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoProcesoNomina!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoProcesoNomina.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoProcesoNomina.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoProcesoNomina(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoProcesoNominaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProcesoNomina(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoProcesoNomina() throws Exception {
		try	{
			if(TipoProcesoNominaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoProcesoNomina();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoProcesoNomina() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoProcesoNomina.jComboBoxTiposAccionesFormularioTipoProcesoNomina.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoProcesoNomina.jComboBoxTiposAccionesFormularioTipoProcesoNomina.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoProcesoNomina() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoProcesoNomina.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoProcesoNomina.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoProcesoNomina.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoProcesoNomina.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoProcesoNomina.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoProcesoNomina.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoProcesoNomina.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoProcesoNomina.addItem(reporte);
			}
			
			
			if(!this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoProcesoNomina.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoProcesoNomina.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoProcesoNomina.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoProcesoNomina.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoProcesoNomina.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoProcesoNomina.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoProcesoNomina.jComboBoxTiposAccionesFormularioTipoProcesoNomina.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoProcesoNomina.jComboBoxTiposAccionesFormularioTipoProcesoNomina.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoProcesoNomina.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoProcesoNomina.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoProcesoNomina.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProcesoNomina();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProcesoNomina() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoProcesoNomina!=null) {
				this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoProcesoNomina!=null) {
				this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoProcesoNomina!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoProcesoNomina()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoProcesoNomina(Boolean esInicializar) throws Exception {				
		if(TipoProcesoNominaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoProcesoNomina();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoProcesoNomina() throws Exception {
		this.inicializarActualizarBindingTablaTipoProcesoNomina(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoProcesoNomina() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoProcesoNomina.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoProcesoNomina.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProcesoNomina.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoProcesoNominaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoProcesoNomina.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProcesoNomina.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoProcesoNominaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoProcesoNominaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProcesoNominaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoProcesoNominaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoProcesoNomina.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProcesoNomina.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoProcesoNominaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoProcesoNomina.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoProcesoNomina(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoprocesonominaLogic.getTipoProcesoNominas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoprocesonominas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoProcesoNominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoProcesoNomina.setModel(new TipoProcesoNominaModel(this.tipoprocesonominaLogic.getTipoProcesoNominas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoProcesoNomina.setModel(new TipoProcesoNominaModel(this.tipoprocesonominas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoProcesoNomina!=null && this.jInternalFrameOrderByTipoProcesoNomina.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoProcesoNomina();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoProcesoNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProcesoNomina,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoProcesoNominaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO,tipoprocesonominaConstantesFunciones.resaltarSeleccionarTipoProcesoNomina,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO,tipoprocesonominaConstantesFunciones.resaltarSeleccionarTipoProcesoNomina,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoProcesoNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProcesoNomina,TipoProcesoNominaConstantesFunciones.LABEL_ID));

		if(this.tipoprocesonominaConstantesFunciones.mostraridTipoProcesoNomina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProcesoNominaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoprocesonominaConstantesFunciones.resaltaridTipoProcesoNomina,this.tipoprocesonominaConstantesFunciones.activaridTipoProcesoNomina,this,true,"idTipoProcesoNomina","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprocesonominaConstantesFunciones.resaltaridTipoProcesoNomina,this.tipoprocesonominaConstantesFunciones.activaridTipoProcesoNomina,this,true,"idTipoProcesoNomina","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoProcesoNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProcesoNomina,TipoProcesoNominaConstantesFunciones.LABEL_CODIGO));

		if(this.tipoprocesonominaConstantesFunciones.mostrarcodigoTipoProcesoNomina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProcesoNominaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoprocesonominaConstantesFunciones.resaltarcodigoTipoProcesoNomina,this.tipoprocesonominaConstantesFunciones.activarcodigoTipoProcesoNomina,this,true,"codigoTipoProcesoNomina","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprocesonominaConstantesFunciones.resaltarcodigoTipoProcesoNomina,this.tipoprocesonominaConstantesFunciones.activarcodigoTipoProcesoNomina,this,true,"codigoTipoProcesoNomina","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoProcesoNominaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoProcesoNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProcesoNomina,TipoProcesoNominaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoprocesonominaConstantesFunciones.mostrarnombreTipoProcesoNomina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProcesoNominaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoprocesonominaConstantesFunciones.resaltarnombreTipoProcesoNomina,this.tipoprocesonominaConstantesFunciones.activarnombreTipoProcesoNomina,this,true,"nombreTipoProcesoNomina","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprocesonominaConstantesFunciones.resaltarnombreTipoProcesoNomina,this.tipoprocesonominaConstantesFunciones.activarnombreTipoProcesoNomina,this,true,"nombreTipoProcesoNomina","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoProcesoNominaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoProcesoNomina.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoProcesoNomina.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoProcesoNomina && this.isPermisoGuardarCambiosTipoProcesoNomina) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoProcesoNomina.addColumn(tableColumn);
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
			
			this.jTableDatosTipoProcesoNomina.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoProcesoNomina && this.isPermisoGuardarCambiosTipoProcesoNomina) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoProcesoNomina && this.isPermisoGuardarCambiosTipoProcesoNomina) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoProcesoNomina.moveColumn(this.jTableDatosTipoProcesoNomina.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoProcesoNomina.moveColumn(this.jTableDatosTipoProcesoNomina.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoProcesoNomina.moveColumn(this.jTableDatosTipoProcesoNomina.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoProcesoNomina.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoProcesoNomina.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoProcesoNomina,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoProcesoNominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoProcesoNomina.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoProcesoNomina.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoProcesoNominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoProcesoNominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoProcesoNomina.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoProcesoNomina.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoProcesoNomina.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoprocesonominaLogic.getTipoProcesoNominas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoprocesonominas.size()-1;
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
		//this.jTableDatosTipoProcesoNomina.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoProcesoNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoProcesoNomina();
			
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
				
				//this.isEsNuevoTipoProcesoNomina=false;
					
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
			
				if(this.tipoprocesonominaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoProcesoNomina==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoProcesoNomina.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoProcesoNomina.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominas.toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoprocesonomina.getsType().equals("DUPLICADO")
				   || this.tipoprocesonomina.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoProcesoNomina=true;
				
				} else {
					this.isEsNuevoTipoProcesoNomina=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoprocesonomina.getId()>=0 && !this.tipoprocesonomina.getIsNew()) {						
						this.isEsNuevoTipoProcesoNomina=false;
						
					} else {
						this.isEsNuevoTipoProcesoNomina=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoProcesoNomina(esRelaciones);						
				
				this.seleccionarTipoProcesoNomina(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoprocesonomina.getId()<0) {
					this.isEsNuevoTipoProcesoNomina=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoProcesoNomina(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoProcesoNomina(evt,rowIndex);
				}	
				
				if(this.tipoprocesonominaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoProcesoNomina: " + this.dDif); 
					}
				}								
				
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoProcesoNomina(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoprocesonomina)) {
					if(this.tipoprocesonomina.getId()>0) {
						this.tipoprocesonomina.setIsDeleted(true);
						
						this.tipoprocesonominasEliminados.add(this.tipoprocesonomina);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoprocesonominaLogic.getTipoProcesoNominas().remove(this.tipoprocesonomina);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoprocesonominas.remove(this.tipoprocesonomina);				
					}
					
					
					((TipoProcesoNominaModel) this.jTableDatosTipoProcesoNomina.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProcesoNomina(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoProcesoNomina(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoProcesoNomina) {
			
			if(this.jInternalFrameDetalleFormTipoProcesoNomina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoProcesoNomina.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoProcesoNomina.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominas.toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoProcesoNominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoProcesoNomina(this.tipoprocesonomina);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoProcesoNomina("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoProcesoNomina(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProcesoNomina() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoProcesoNomina(TipoProcesoNomina tipoprocesonomina) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoProcesoNomina(tipoprocesonomina,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoProcesoNomina(TipoProcesoNomina tipoprocesonomina,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoProcesoNomina(tipoprocesonomina);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoProcesoNomina(tipoprocesonomina,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoProcesoNomina(tipoprocesonomina);
	}
	
	public void setVariablesObjetoActualToFormularioTipoProcesoNomina(TipoProcesoNomina tipoprocesonomina) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoProcesoNomina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoProcesoNomina.jTextFieldidTipoProcesoNomina.setText(tipoprocesonomina.getId().toString());
			this.jInternalFrameDetalleFormTipoProcesoNomina.jTextFieldcodigoTipoProcesoNomina.setText(tipoprocesonomina.getcodigo());
			this.jInternalFrameDetalleFormTipoProcesoNomina.jTextAreanombreTipoProcesoNomina.setText(tipoprocesonomina.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoProcesoNomina tipoprocesonominaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoprocesonominaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoProcesoNomina tipoprocesonominaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoprocesonominaLocal=this.tipoprocesonomina;
			} else {
				tipoprocesonominaLocal=this.tipoprocesonominaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoprocesonominaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoProcesoNomina(tipoprocesonominaLocal,true);
					
					if(tipoprocesonominaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoprocesonominaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoprocesonominaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoProcesoNomina(TipoProcesoNomina tipoprocesonomina,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoProcesoNomina(tipoprocesonomina,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoNomina(tipoprocesonomina);
	}
	
	public void setVariablesFormularioToObjetoActualTipoProcesoNomina(TipoProcesoNomina tipoprocesonomina,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoProcesoNomina(tipoprocesonomina,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoProcesoNomina(TipoProcesoNomina tipoprocesonomina,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoProcesoNomina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoProcesoNomina.jTextFieldidTipoProcesoNomina.getText()==null || this.jInternalFrameDetalleFormTipoProcesoNomina.jTextFieldidTipoProcesoNomina.getText()=="" || this.jInternalFrameDetalleFormTipoProcesoNomina.jTextFieldidTipoProcesoNomina.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoProcesoNomina.jTextFieldidTipoProcesoNomina.setText("0");
			}

			if(conColumnasBase) {tipoprocesonomina.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoProcesoNomina.jTextFieldidTipoProcesoNomina.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProcesoNominaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProcesoNomina.jLabelIdTipoProcesoNomina,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoprocesonomina.setcodigo(this.jInternalFrameDetalleFormTipoProcesoNomina.jTextFieldcodigoTipoProcesoNomina.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProcesoNominaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProcesoNomina.jLabelcodigoTipoProcesoNomina,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoprocesonomina.setnombre(this.jInternalFrameDetalleFormTipoProcesoNomina.jTextAreanombreTipoProcesoNomina.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProcesoNominaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProcesoNomina.jLabelnombreTipoProcesoNomina,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoProcesoNomina(TipoProcesoNomina tipoprocesonominaBean,TipoProcesoNomina tipoprocesonomina,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoProcesoNomina(TipoProcesoNomina tipoprocesonominaOrigen,TipoProcesoNomina tipoprocesonomina,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoprocesonominaOrigen.getId()!=null && !tipoprocesonominaOrigen.getId().equals(0L))) {tipoprocesonomina.setId(tipoprocesonominaOrigen.getId());}}
			if(conDefault || (!conDefault && tipoprocesonominaOrigen.getcodigo()!=null && !tipoprocesonominaOrigen.getcodigo().equals(""))) {tipoprocesonomina.setcodigo(tipoprocesonominaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoprocesonominaOrigen.getnombre()!=null && !tipoprocesonominaOrigen.getnombre().equals(""))) {tipoprocesonomina.setnombre(tipoprocesonominaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoProcesoNomina(TipoProcesoNomina tipoprocesonomina) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoProcesoNomina.jTextFieldidTipoProcesoNomina.setText(tipoprocesonomina.getId().toString());
			this.jInternalFrameDetalleFormTipoProcesoNomina.jTextFieldcodigoTipoProcesoNomina.setText(tipoprocesonomina.getcodigo());
			this.jInternalFrameDetalleFormTipoProcesoNomina.jTextAreanombreTipoProcesoNomina.setText(tipoprocesonomina.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoProcesoNomina(TipoProcesoNominaBean tipoprocesonominaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoProcesoNomina.jTextFieldidTipoProcesoNomina.setText(tipoprocesonominaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoProcesoNomina.jTextFieldcodigoTipoProcesoNomina.setText(tipoprocesonominaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoProcesoNomina.jTextAreanombreTipoProcesoNomina.setText(tipoprocesonominaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoProcesoNomina(TipoProcesoNominaParameterReturnGeneral tipoprocesonominaReturnGeneral,TipoProcesoNominaBean tipoprocesonominaBean,Boolean conDefault) throws Exception { 
		try {
			TipoProcesoNomina tipoprocesonominaLocal=new TipoProcesoNomina();
			
			tipoprocesonominaLocal=tipoprocesonominaReturnGeneral.getTipoProcesoNomina();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoprocesonominaLocal.getId()!=null && !tipoprocesonominaLocal.getId().equals(0L))) {tipoprocesonominaBean.setId(tipoprocesonominaLocal.getId());}}
			if(conDefault || (!conDefault && tipoprocesonominaLocal.getcodigo()!=null && !tipoprocesonominaLocal.getcodigo().equals(""))) {tipoprocesonominaBean.setcodigo(tipoprocesonominaLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoprocesonominaLocal.getnombre()!=null && !tipoprocesonominaLocal.getnombre().equals(""))) {tipoprocesonominaBean.setnombre(tipoprocesonominaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoProcesoNominaGenerico(Long idTipoProcesoNominaSeleccionado,JComboBox jComboBoxTipoProcesoNomina,List<TipoProcesoNomina> tipoprocesonominasLocal)throws Exception {
		try {
			TipoProcesoNomina  tipoprocesonominaTemp=null;

			for(TipoProcesoNomina tipoprocesonominaAux:tipoprocesonominasLocal) {
				if(tipoprocesonominaAux.getId()!=null && tipoprocesonominaAux.getId().equals(idTipoProcesoNominaSeleccionado)) {
					tipoprocesonominaTemp=tipoprocesonominaAux;
					break;
				}
			}

			jComboBoxTipoProcesoNomina.setSelectedItem(tipoprocesonominaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoProcesoNominaGenerico(JComboBox jComboBoxTipoProcesoNomina,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoProcesoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoProcesoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoProcesoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoProcesoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoProcesoNomina.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoProcesoNomina.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoProcesoNomina.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoProcesoNomina.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoProcesoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoProcesoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprocesonomina=(TipoProcesoNomina) tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoprocesonomina =(TipoProcesoNomina) tipoprocesonominas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoProcesoNomina tipoprocesonominaRow=new TipoProcesoNomina();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprocesonominaRow=(TipoProcesoNomina) tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoprocesonominaRow=(TipoProcesoNomina) tipoprocesonominas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoProcesoNomina(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoProcesoNomina.setVisible((this.isVisibilidadCeldaNuevoTipoProcesoNomina && this.isPermisoNuevoTipoProcesoNomina));			
			this.jButtonDuplicarTipoProcesoNomina.setVisible((this.isVisibilidadCeldaDuplicarTipoProcesoNomina && this.isPermisoDuplicarTipoProcesoNomina));			
			this.jButtonCopiarTipoProcesoNomina.setVisible((this.isVisibilidadCeldaCopiarTipoProcesoNomina && this.isPermisoCopiarTipoProcesoNomina));
			this.jButtonVerFormTipoProcesoNomina.setVisible((this.isVisibilidadCeldaVerFormTipoProcesoNomina && this.isPermisoVerFormTipoProcesoNomina));
			
			this.jButtonAbrirOrderByTipoProcesoNomina.setVisible((this.isVisibilidadCeldaOrdenTipoProcesoNomina && this.isPermisoOrdenTipoProcesoNomina));			
			
			this.jButtonNuevoRelacionesTipoProcesoNomina.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProcesoNomina && this.isPermisoNuevoTipoProcesoNomina));			
			this.jButtonNuevoGuardarCambiosTipoProcesoNomina.setVisible((this.isVisibilidadCeldaNuevoTipoProcesoNomina && this.isPermisoNuevoTipoProcesoNomina && this.isPermisoGuardarCambiosTipoProcesoNomina));
			
			if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) {
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonModificarTipoProcesoNomina.setVisible((this.isVisibilidadCeldaModificarTipoProcesoNomina && this.isPermisoActualizarTipoProcesoNomina));	
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonActualizarTipoProcesoNomina.setVisible((this.isVisibilidadCeldaActualizarTipoProcesoNomina && this.isPermisoActualizarTipoProcesoNomina));	
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonEliminarTipoProcesoNomina.setVisible((this.isVisibilidadCeldaEliminarTipoProcesoNomina && this.isPermisoEliminarTipoProcesoNomina));
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonCancelarTipoProcesoNomina.setVisible(this.isVisibilidadCeldaCancelarTipoProcesoNomina);							
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonGuardarCambiosTipoProcesoNomina.setVisible((this.isVisibilidadCeldaGuardarTipoProcesoNomina && this.isPermisoGuardarCambiosTipoProcesoNomina));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoProcesoNomina.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProcesoNomina && this.isPermisoGuardarCambiosTipoProcesoNomina));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoProcesoNomina.setVisible((this.isVisibilidadCeldaNuevoTipoProcesoNomina && this.isPermisoNuevoTipoProcesoNomina));						
			this.jButtonDuplicarToolBarTipoProcesoNomina.setVisible((this.isVisibilidadCeldaDuplicarTipoProcesoNomina && this.isPermisoDuplicarTipoProcesoNomina));						
			this.jButtonCopiarToolBarTipoProcesoNomina.setVisible((this.isVisibilidadCeldaCopiarTipoProcesoNomina && this.isPermisoCopiarTipoProcesoNomina));			
			this.jButtonVerFormToolBarTipoProcesoNomina.setVisible((this.isVisibilidadCeldaVerFormTipoProcesoNomina && this.isPermisoVerFormTipoProcesoNomina));			
			this.jButtonAbrirOrderByToolBarTipoProcesoNomina.setVisible((this.isVisibilidadCeldaOrdenTipoProcesoNomina && this.isPermisoOrdenTipoProcesoNomina));
			this.jButtonNuevoRelacionesToolBarTipoProcesoNomina.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProcesoNomina && this.isPermisoNuevoTipoProcesoNomina));			
			this.jButtonNuevoGuardarCambiosToolBarTipoProcesoNomina.setVisible((this.isVisibilidadCeldaNuevoTipoProcesoNomina && this.isPermisoNuevoTipoProcesoNomina && this.isPermisoGuardarCambiosTipoProcesoNomina));			
			
			if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) {
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonModificarToolBarTipoProcesoNomina.setVisible((this.isVisibilidadCeldaModificarTipoProcesoNomina && this.isPermisoActualizarTipoProcesoNomina));	
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonActualizarToolBarTipoProcesoNomina.setVisible((this.isVisibilidadCeldaActualizarTipoProcesoNomina  && this.isPermisoActualizarTipoProcesoNomina));	
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonEliminarToolBarTipoProcesoNomina.setVisible((this.isVisibilidadCeldaEliminarTipoProcesoNomina && this.isPermisoEliminarTipoProcesoNomina));
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonCancelarToolBarTipoProcesoNomina.setVisible(this.isVisibilidadCeldaCancelarTipoProcesoNomina);				
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonGuardarCambiosToolBarTipoProcesoNomina.setVisible((this.isVisibilidadCeldaGuardarTipoProcesoNomina && this.isPermisoGuardarCambiosTipoProcesoNomina));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoProcesoNomina.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProcesoNomina && this.isPermisoGuardarCambiosTipoProcesoNomina));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoProcesoNomina.setVisible((this.isVisibilidadCeldaNuevoTipoProcesoNomina && this.isPermisoNuevoTipoProcesoNomina));			
			this.jMenuItemDuplicarTipoProcesoNomina.setVisible((this.isVisibilidadCeldaDuplicarTipoProcesoNomina && this.isPermisoDuplicarTipoProcesoNomina));			
			this.jMenuItemCopiarTipoProcesoNomina.setVisible((this.isVisibilidadCeldaCopiarTipoProcesoNomina && this.isPermisoCopiarTipoProcesoNomina));			
			this.jMenuItemVerFormTipoProcesoNomina.setVisible((this.isVisibilidadCeldaVerFormTipoProcesoNomina && this.isPermisoVerFormTipoProcesoNomina));			
			this.jMenuItemAbrirOrderByTipoProcesoNomina.setVisible((this.isVisibilidadCeldaOrdenTipoProcesoNomina && this.isPermisoOrdenTipoProcesoNomina));			
			//this.jMenuItemMostrarOcultarTipoProcesoNomina.setVisible((this.isVisibilidadCeldaOrdenTipoProcesoNomina && this.isPermisoOrdenTipoProcesoNomina));
			this.jMenuItemDetalleAbrirOrderByTipoProcesoNomina.setVisible((this.isVisibilidadCeldaOrdenTipoProcesoNomina && this.isPermisoOrdenTipoProcesoNomina));			
			//this.jMenuItemDetalleMostrarOcultarTipoProcesoNomina.setVisible((this.isVisibilidadCeldaOrdenTipoProcesoNomina && this.isPermisoOrdenTipoProcesoNomina));			
			this.jMenuItemNuevoRelacionesTipoProcesoNomina.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProcesoNomina && this.isPermisoNuevoTipoProcesoNomina));			
			this.jMenuItemNuevoGuardarCambiosTipoProcesoNomina.setVisible((this.isVisibilidadCeldaNuevoTipoProcesoNomina && this.isPermisoNuevoTipoProcesoNomina && this.isPermisoGuardarCambiosTipoProcesoNomina));									
			
			if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) {
			this.jInternalFrameDetalleFormTipoProcesoNomina.jMenuItemModificarTipoProcesoNomina.setVisible((this.isVisibilidadCeldaModificarTipoProcesoNomina && this.isPermisoActualizarTipoProcesoNomina));	
			this.jInternalFrameDetalleFormTipoProcesoNomina.jMenuItemActualizarTipoProcesoNomina.setVisible((this.isVisibilidadCeldaActualizarTipoProcesoNomina && this.isPermisoActualizarTipoProcesoNomina));	
			this.jInternalFrameDetalleFormTipoProcesoNomina.jMenuItemEliminarTipoProcesoNomina.setVisible((this.isVisibilidadCeldaEliminarTipoProcesoNomina && this.isPermisoEliminarTipoProcesoNomina));
			this.jInternalFrameDetalleFormTipoProcesoNomina.jMenuItemCancelarTipoProcesoNomina.setVisible(this.isVisibilidadCeldaCancelarTipoProcesoNomina);				
			}
			
			this.jMenuItemGuardarCambiosTipoProcesoNomina.setVisible((this.isVisibilidadCeldaGuardarTipoProcesoNomina && this.isPermisoGuardarCambiosTipoProcesoNomina));						
			this.jMenuItemGuardarCambiosTablaTipoProcesoNomina.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProcesoNomina && this.isPermisoGuardarCambiosTipoProcesoNomina));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoProcesoNomina=this.jButtonNuevoTipoProcesoNomina.isVisible();
			this.isVisibilidadCeldaDuplicarTipoProcesoNomina=this.jButtonDuplicarTipoProcesoNomina.isVisible();
			this.isVisibilidadCeldaCopiarTipoProcesoNomina=this.jButtonCopiarTipoProcesoNomina.isVisible();
			this.isVisibilidadCeldaVerFormTipoProcesoNomina=this.jButtonVerFormTipoProcesoNomina.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoProcesoNomina=this.jButtonAbrirOrderByTipoProcesoNomina.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoNomina=this.jButtonNuevoRelacionesTipoProcesoNomina.isVisible();
			this.isVisibilidadCeldaModificarTipoProcesoNomina=this.jButtonModificarTipoProcesoNomina.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) {
			this.isVisibilidadCeldaActualizarTipoProcesoNomina=this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonActualizarTipoProcesoNomina.isVisible();
			this.isVisibilidadCeldaEliminarTipoProcesoNomina=this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonEliminarTipoProcesoNomina.isVisible();
			this.isVisibilidadCeldaCancelarTipoProcesoNomina=this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonCancelarTipoProcesoNomina.isVisible();
			this.isVisibilidadCeldaGuardarTipoProcesoNomina=this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonGuardarCambiosTipoProcesoNomina.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoNomina=this.jButtonGuardarCambiosTablaTipoProcesoNomina.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoProcesoNomina=this.jButtonNuevoToolBarTipoProcesoNomina.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoNomina=this.jButtonNuevoRelacionesToolBarTipoProcesoNomina.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) {
			this.isVisibilidadCeldaModificarTipoProcesoNomina=this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonModificarToolBarTipoProcesoNomina.isVisible();
			this.isVisibilidadCeldaActualizarTipoProcesoNomina=this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonActualizarToolBarTipoProcesoNomina.isVisible();
			this.isVisibilidadCeldaEliminarTipoProcesoNomina=this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonEliminarToolBarTipoProcesoNomina.isVisible();
			this.isVisibilidadCeldaCancelarTipoProcesoNomina=this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonCancelarToolBarTipoProcesoNomina.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoProcesoNomina=this.jButtonGuardarCambiosToolBarTipoProcesoNomina.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoNomina=this.jButtonGuardarCambiosTablaToolBarTipoProcesoNomina.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoProcesoNomina=this.jMenuItemNuevoTipoProcesoNomina.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoNomina=this.jMenuItemNuevoRelacionesTipoProcesoNomina.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) {
			this.isVisibilidadCeldaModificarTipoProcesoNomina=this.jInternalFrameDetalleFormTipoProcesoNomina.jMenuItemModificarTipoProcesoNomina.isVisible();
			this.isVisibilidadCeldaActualizarTipoProcesoNomina=this.jInternalFrameDetalleFormTipoProcesoNomina.jMenuItemActualizarTipoProcesoNomina.isVisible();
			this.isVisibilidadCeldaEliminarTipoProcesoNomina=this.jInternalFrameDetalleFormTipoProcesoNomina.jMenuItemEliminarTipoProcesoNomina.isVisible();
			this.isVisibilidadCeldaCancelarTipoProcesoNomina=this.jInternalFrameDetalleFormTipoProcesoNomina.jMenuItemCancelarTipoProcesoNomina.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoProcesoNomina=this.jMenuItemGuardarCambiosTipoProcesoNomina.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoNomina=this.jMenuItemGuardarCambiosTablaTipoProcesoNomina.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoProcesoNomina(Boolean esInicializar) {
		if(TipoProcesoNominaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoprocesonominaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoProcesoNomina();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoProcesoNomina(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoProcesoNomina() {
		this.jButtonNuevoTipoProcesoNomina.setVisible(this.isPermisoNuevoTipoProcesoNomina);			
		this.jButtonDuplicarTipoProcesoNomina.setVisible(this.isPermisoDuplicarTipoProcesoNomina);			
		this.jButtonCopiarTipoProcesoNomina.setVisible(this.isPermisoCopiarTipoProcesoNomina);			
		this.jButtonVerFormTipoProcesoNomina.setVisible(this.isPermisoVerFormTipoProcesoNomina);			
		
		this.jButtonAbrirOrderByTipoProcesoNomina.setVisible(this.isPermisoOrdenTipoProcesoNomina);					
		
		this.jButtonNuevoRelacionesTipoProcesoNomina.setVisible(this.isPermisoNuevoTipoProcesoNomina);			
		
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonModificarTipoProcesoNomina.setVisible(this.isPermisoActualizarTipoProcesoNomina);	
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonActualizarTipoProcesoNomina.setVisible(this.isPermisoActualizarTipoProcesoNomina);	
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonEliminarTipoProcesoNomina.setVisible(this.isPermisoEliminarTipoProcesoNomina);
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonCancelarTipoProcesoNomina.setVisible(this.isVisibilidadCeldaCancelarTipoProcesoNomina);						
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonGuardarCambiosTipoProcesoNomina.setVisible(this.isPermisoGuardarCambiosTipoProcesoNomina);							
		}
		
		this.jButtonGuardarCambiosTablaTipoProcesoNomina.setVisible(this.isPermisoActualizarTipoProcesoNomina);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoProcesoNomina() {
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonModificarTipoProcesoNomina.setVisible(this.isPermisoActualizarTipoProcesoNomina);	
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonActualizarTipoProcesoNomina.setVisible(this.isPermisoActualizarTipoProcesoNomina);	
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonEliminarTipoProcesoNomina.setVisible(this.isPermisoEliminarTipoProcesoNomina);
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonCancelarTipoProcesoNomina.setVisible(this.isVisibilidadCeldaCancelarTipoProcesoNomina);							
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonGuardarCambiosTipoProcesoNomina.setVisible((this.isVisibilidadCeldaGuardarTipoProcesoNomina && this.isPermisoGuardarCambiosTipoProcesoNomina));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoProcesoNomina() {
		if(TipoProcesoNominaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoProcesoNomina();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoProcesoNomina() {
	}
	
	public void jTableDatosTipoProcesoNominaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoProcesoNomina(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoProcesoNominaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesonominaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProcesoNomina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProcesoNomina(this.gettipoprocesonomina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoNomina(this.tipoprocesonomina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominas.toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprocesonomina==null) {
						this.tipoprocesonomina = new TipoProcesoNomina();
					}

					this.setVariablesFormularioToObjetoActualTipoProcesoNomina(this.tipoprocesonomina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoNomina(this.tipoprocesonomina);
				}

				if(this.tipoprocesonomina.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoprocesonomina.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProcesoNomina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesonominaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesonominaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesonominaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoProcesoNominaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesonominaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProcesoNomina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProcesoNomina(this.gettipoprocesonomina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoNomina(this.tipoprocesonomina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominas.toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprocesonomina==null) {
						this.tipoprocesonomina = new TipoProcesoNomina();
					}

					this.setVariablesFormularioToObjetoActualTipoProcesoNomina(this.tipoprocesonomina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoNomina(this.tipoprocesonomina);
				}

				if(this.tipoprocesonomina.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoprocesonomina.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProcesoNomina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesonominaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesonominaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesonominaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoProcesoNominaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesonominaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProcesoNomina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProcesoNomina(this.gettipoprocesonomina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoNomina(this.tipoprocesonomina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominas.toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprocesonomina==null) {
						this.tipoprocesonomina = new TipoProcesoNomina();
					}

					this.setVariablesFormularioToObjetoActualTipoProcesoNomina(this.tipoprocesonomina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoNomina(this.tipoprocesonomina);
				}

				if(this.tipoprocesonomina.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoprocesonomina.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProcesoNomina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesonominaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesonominaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesonominaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoProcesoNomina() {
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) {
			this.jInternalFrameDetalleFormTipoProcesoNomina.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoProcesoNomina.dispose();
			this.jInternalFrameDetalleFormTipoProcesoNomina=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoProcesoNomina!=null) {
			this.jInternalFrameReporteDinamicoTipoProcesoNomina.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoProcesoNomina.dispose();
			this.jInternalFrameReporteDinamicoTipoProcesoNomina=null;
		}
		
		if(this.jInternalFrameImportacionTipoProcesoNomina!=null) {
			this.jInternalFrameImportacionTipoProcesoNomina.setVisible(false);	    			
			this.jInternalFrameImportacionTipoProcesoNomina.dispose();
			this.jInternalFrameImportacionTipoProcesoNomina=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoProcesoNomina();
			
			TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoProcesoNomina")) {
				jButtonNuevoTipoProcesoNominaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoProcesoNomina")) {
				jButtonDuplicarTipoProcesoNominaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoProcesoNomina")) {
				jButtonCopiarTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoProcesoNomina")) {
				jButtonVerFormTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoProcesoNomina")) {
				jButtonNuevoTipoProcesoNominaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoProcesoNomina")) {
				jButtonDuplicarTipoProcesoNominaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoProcesoNomina")) {
				jButtonNuevoTipoProcesoNominaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoProcesoNomina")) {
				jButtonDuplicarTipoProcesoNominaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoProcesoNomina")) {
				jButtonNuevoTipoProcesoNominaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoProcesoNomina")) {
				jButtonNuevoTipoProcesoNominaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoProcesoNomina")) {
				jButtonNuevoTipoProcesoNominaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoProcesoNomina")) {
				jButtonModificarTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoProcesoNomina")) {
				jButtonModificarTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoProcesoNomina")) {
				jButtonModificarTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoProcesoNomina")) {
				jButtonActualizarTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoProcesoNomina")) {
				jButtonActualizarTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoProcesoNomina")) {
				jButtonActualizarTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoProcesoNomina")) {
				jButtonEliminarTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoProcesoNomina")) {
				jButtonEliminarTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoProcesoNomina")) {
				jButtonEliminarTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoProcesoNomina")) {
				jButtonCancelarTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoProcesoNomina")) {
				jButtonCancelarTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoProcesoNomina")) {
				jButtonCancelarTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoProcesoNomina")) {
				jButtonCerrarTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoProcesoNomina")) {
				jButtonCerrarTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoProcesoNomina")) {
				jButtonCerrarTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoProcesoNomina")) {
				jButtonMostrarOcultarTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoProcesoNomina")) {
				jButtonCancelarTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoProcesoNomina")) {
				jButtonGuardarCambiosTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoProcesoNomina")) {
				jButtonGuardarCambiosTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoProcesoNomina")) {
				jButtonCopiarTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoProcesoNomina")) {
				jButtonVerFormTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoProcesoNomina")) {
				jButtonGuardarCambiosTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoProcesoNomina")) {
				jButtonCopiarTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoProcesoNomina")) {
				jButtonVerFormTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoProcesoNomina")) {
				jButtonGuardarCambiosTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoProcesoNomina")) {
				jButtonGuardarCambiosTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoProcesoNomina")) {
				jButtonGuardarCambiosTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoProcesoNomina")) {
				jButtonRecargarInformacionTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoProcesoNomina")) {
				jButtonRecargarInformacionTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoProcesoNomina")) {
				jButtonRecargarInformacionTipoProcesoNominaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoProcesoNomina")) {
				jButtonAnterioresTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoProcesoNomina")) {
				jButtonAnterioresTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoProcesoNomina")) {
				jButtonAnterioresTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoProcesoNomina")) {
				jButtonSiguientesTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoProcesoNomina")) {
				jButtonSiguientesTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoProcesoNomina")) {
				jButtonSiguientesTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoProcesoNomina") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoProcesoNomina")) {
				jButtonAbrirOrderByTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoProcesoNomina") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoProcesoNomina")) {
				jButtonMostrarOcultarTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoProcesoNomina")) {
				jButtonNuevoGuardarCambiosTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoProcesoNomina")) {
				jButtonNuevoGuardarCambiosTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoProcesoNomina")) {
				jButtonNuevoGuardarCambiosTipoProcesoNominaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoProcesoNomina")) {
				jButtonCerrarReporteDinamicoTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoProcesoNomina")) {
				jButtonGenerarReporteDinamicoTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoProcesoNomina")) {
				
				jButtonGenerarExcelReporteDinamicoTipoProcesoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoProcesoNomina")) {
				jButtonCerrarImportacionTipoProcesoNominaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoProcesoNomina")) {
				
				jButtonGenerarImportacionTipoProcesoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoProcesoNomina")) {
				
				jButtonAbrirImportacionTipoProcesoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoProcesoNomina")) {
				jComboBoxTiposAccionesTipoProcesoNominaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoProcesoNomina")) {
				jComboBoxTiposRelacionesTipoProcesoNominaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoProcesoNomina")) {
				jComboBoxTiposAccionesTipoProcesoNominaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoProcesoNomina")) {
				
				jComboBoxTiposSeleccionarTipoProcesoNominaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoProcesoNomina")) {
				jTextFieldValorCampoGeneralTipoProcesoNominaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoProcesoNomina")) {
				jButtonAbrirOrderByTipoProcesoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoProcesoNomina")) {
				jButtonAbrirOrderByTipoProcesoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoProcesoNomina")) {
				jButtonCerrarOrderByTipoProcesoNominaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoProcesoNominaBusqueda")) {
				this.jButtonidTipoProcesoNominaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoProcesoNominaBusqueda")) {
				this.jButtoncodigoTipoProcesoNominaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoProcesoNominaBusqueda")) {
				this.jButtonnombreTipoProcesoNominaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoProcesoNomina();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProcesoNominaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesonomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesonomina);
				
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
				
				


				
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoNomina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoNomina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoProcesoNomina tipoprocesonominaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoprocesonominaLocal=this.tipoprocesonomina;
			} else {
				tipoprocesonominaLocal=this.tipoprocesonominaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesonomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesonomina);
				
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
							
				
				


				
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoNomina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoNomina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProcesoNominaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProcesoNomina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesonominaAnterior =(TipoProcesoNomina) this.tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprocesonominaAnterior =(TipoProcesoNomina) this.tipoprocesonominas.toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
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
			
			TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
			
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
			
			


			
			TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProcesoNominaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesonomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesonomina);
				
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
								
						
				


				
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoNomina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoNomina.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesonomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesonomina);
				
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
								
				
				


				
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoNomina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoNomina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProcesoNominaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProcesoNomina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesonominaAnterior =(TipoProcesoNomina) this.tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprocesonominaAnterior =(TipoProcesoNomina) this.tipoprocesonominas.toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesonomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesonomina);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProcesoNominaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProcesoNomina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesonominaAnterior =(TipoProcesoNomina) this.tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprocesonominaAnterior =(TipoProcesoNomina) this.tipoprocesonominas.toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProcesoNominaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesonomina);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesonomina);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesonomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesonomina);
				
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
							
				
				


				
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoNomina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoNomina.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProcesoNominaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoProcesoNomina.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprocesonominaAnterior =(TipoProcesoNomina) this.tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoprocesonominaAnterior =(TipoProcesoNomina) this.tipoprocesonominas.toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
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
			
			TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
			
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
			
			


			
			TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProcesoNominaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesonomina);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesonomina);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesonomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesonomina);
				
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
								
				
				


				
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoNomina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoNomina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProcesoNominaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProcesoNomina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesonominaAnterior =(TipoProcesoNomina) this.tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprocesonominaAnterior =(TipoProcesoNomina) this.tipoprocesonominas.toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProcesoNominaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesonomina);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesonomina);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProcesoNominaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesonomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesonomina);
				
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoProcesoNomina")) {
					jCheckBoxSeleccionarTodosTipoProcesoNominaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoProcesoNomina")) {
					jCheckBoxSeleccionadosTipoProcesoNominaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoProcesoNomina")) {
					
				}
				
				


				
				
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoNomina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoNomina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesonomina);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesonomina);
				
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
												
				
				


				
				
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoNomina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoNomina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProcesoNominaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoProcesoNomina.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprocesonominaAnterior =(TipoProcesoNomina) this.tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoprocesonominaAnterior =(TipoProcesoNomina) this.tipoprocesonominas.toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProcesoNominaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesonomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesonomina);
				
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
				
				
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
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
			
			TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
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
			
			


			
			TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProcesoNominaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesonomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesonomina);
				
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoNomina.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoNomina.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesonomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesonomina);
				
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
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
				
				


				
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoNomina.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoNomina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProcesoNominaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProcesoNomina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesonominaAnterior =(TipoProcesoNomina) this.tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprocesonominaAnterior =(TipoProcesoNomina) this.tipoprocesonominas.toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoProcesoNomina")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoProcesoNominaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoProcesoNomina.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoprocesonomina =(TipoProcesoNomina) this.tipoprocesonominas.toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoprocesonomina);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoProcesoNomina")) {
				
				}
				
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoProcesoNomina")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoProcesoNomina.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoProcesoNomina")) {
			
			}
			
			TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoProcesoNomina();
			
			TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoProcesoNomina")) {
				jButtonNuevoTipoProcesoNominaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoProcesoNomina")) {
				jButtonDuplicarTipoProcesoNominaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoProcesoNomina")) {
				jButtonCopiarTipoProcesoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoProcesoNomina")) {
				jButtonVerFormTipoProcesoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoProcesoNomina")) {
				jButtonNuevoTipoProcesoNominaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoProcesoNomina")) {
				jButtonModificarTipoProcesoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoProcesoNomina")) {
				jButtonActualizarTipoProcesoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoProcesoNomina")) {
				jButtonEliminarTipoProcesoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoProcesoNomina")) {
				jButtonGuardarCambiosTipoProcesoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoProcesoNomina")) {
				jButtonCancelarTipoProcesoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoProcesoNomina")) {
				jButtonCerrarTipoProcesoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoProcesoNomina")) {
				jButtonGuardarCambiosTipoProcesoNominaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoProcesoNomina")) {
				jButtonNuevoGuardarCambiosTipoProcesoNominaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoProcesoNomina")) {
				jButtonAbrirOrderByTipoProcesoNominaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoProcesoNomina")) {
				jButtonRecargarInformacionTipoProcesoNominaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoProcesoNomina")) {
				jButtonAnterioresTipoProcesoNominaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoProcesoNomina")) {
				jButtonSiguientesTipoProcesoNominaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoProcesoNominaBusqueda")) {
				this.jButtonidTipoProcesoNominaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoProcesoNominaBusqueda")) {
				this.jButtoncodigoTipoProcesoNominaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoProcesoNominaBusqueda")) {
				this.jButtonnombreTipoProcesoNominaBusquedaActionPerformed(evt);
			}
			
			TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoProcesoNomina();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoProcesoNomina")) {
				closingInternalFrameTipoProcesoNomina();
				
			} else if(sTipo.equals("jButtonCancelarTipoProcesoNomina")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoProcesoNomina = (JInternalFrameBase)evt.getSource();
	            	
	            TipoProcesoNominaBeanSwingJInternalFrame jInternalFrameParent=(TipoProcesoNominaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoProcesoNomina.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoProcesoNominaActionPerformed(null);
			}
			
			TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoprocesonomina,new Object(),this.tipoprocesonominaParameterGeneral,this.tipoprocesonominaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoProcesoNomina(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoProcesoNomina(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoProcesoNomina(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoprocesonomina)) {
			if(!esControlTabla) {
				if(TipoProcesoNominaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoProcesoNomina(this.tipoprocesonomina,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoNomina(this.tipoprocesonomina);			
				}
				
				if(this.tipoprocesonominaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoProcesoNomina(this.tipoprocesonomina,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoprocesonominaReturnGeneral=tipoprocesonominaLogic.procesarEventosTipoProcesoNominasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprocesonominaLogic.getTipoProcesoNominas(),this.tipoprocesonomina,this.tipoprocesonominaParameterGeneral,this.isEsNuevoTipoProcesoNomina,classes);//this.tipoprocesonominaLogic.getTipoProcesoNomina()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoProcesoNomina(this.tipoprocesonominaReturnGeneral,this.tipoprocesonominaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoprocesonominaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoProcesoNomina(classes,this.tipoprocesonominaReturnGeneral,this.tipoprocesonominaBean,false);
					}
						
					if(this.tipoprocesonominaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoProcesoNomina(this.tipoprocesonominaReturnGeneral.getTipoProcesoNomina());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoProcesoNomina(this.tipoprocesonominaReturnGeneral.getTipoProcesoNomina());	
					}
						
					if(this.tipoprocesonominaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoProcesoNomina(this.tipoprocesonominaReturnGeneral.getTipoProcesoNomina(),classes);//this.tipoprocesonominaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoProcesoNomina(this.tipoprocesonomina,classes);//this.tipoprocesonominaBean);									
				}
			
				if(TipoProcesoNominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoProcesoNomina(this.tipoprocesonomina,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoNomina(this.tipoprocesonomina);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoprocesonominaAnterior!=null) {
						this.tipoprocesonomina=this.tipoprocesonominaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoprocesonominaReturnGeneral=tipoprocesonominaLogic.procesarEventosTipoProcesoNominasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprocesonominaLogic.getTipoProcesoNominas(),this.tipoprocesonomina,this.tipoprocesonominaParameterGeneral,this.isEsNuevoTipoProcesoNomina,classes);//this.tipoprocesonominaLogic.getTipoProcesoNomina()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoprocesonominaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoprocesonominaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoprocesonominaReturnGeneral.getTipoProcesoNomina(),tipoprocesonominaLogic.getTipoProcesoNominas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoprocesonominaReturnGeneral.getTipoProcesoNomina(),this.tipoprocesonominas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoProcesoNomina.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoProcesoNomina.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoProcesoNomina();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoProcesoNomina() throws Exception {
		
		TipoProcesoNominaModel tipoprocesonominaModel=(TipoProcesoNominaModel)this.jTableDatosTipoProcesoNomina.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprocesonominaModel.tipoprocesonominas=this.tipoprocesonominaLogic.getTipoProcesoNominas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoprocesonominaModel.tipoprocesonominas=this.tipoprocesonominas;
		}
		
		
		((TipoProcesoNominaModel) this.jTableDatosTipoProcesoNomina.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoProcesoNomina() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoprocesonominaAnterior(),this.tipoprocesonominaLogic.getTipoProcesoNominas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoprocesonominaAnterior(),this.tipoprocesonominas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoProcesoNomina();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoProcesoNomina(TipoProcesoNomina tipoprocesonomina,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
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
										
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprocesonomina,new Object(),generalEntityParameterGeneral,this.tipoprocesonominaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoprocesonominaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoProcesoNominaConstantesFunciones.getClassesRelationshipsOfTipoProcesoNomina(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoProcesoNominaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoProcesoNomina(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoProcesoNomina(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoProcesoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprocesonomina,new Object(),generalEntityParameterGeneral,this.tipoprocesonominaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoProcesoNomina(TipoProcesoNominaBean tipoprocesonominaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoProcesoNomina(ArrayList<Classe> classes,TipoProcesoNominaReturnGeneral tipoprocesonominaReturnGeneral,TipoProcesoNominaBean tipoprocesonominaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoProcesoNomina(TipoProcesoNomina tipoprocesonomina,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoprocesonomina)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoProcesoNomina = new TipoProcesoNominaDetalleFormJInternalFrame(jDesktopPane,this.tipoprocesonominaSessionBean.getConGuardarRelaciones(),this.tipoprocesonominaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoProcesoNomina);
		this.jInternalFrameDetalleFormTipoProcesoNomina.setVisible(false);
		this.jInternalFrameDetalleFormTipoProcesoNomina.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoProcesoNomina.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoProcesoNomina.tipoprocesonominaLogic=this.tipoprocesonominaLogic;
		
		this.cargarCombosFrameForeignKeyTipoProcesoNomina("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoProcesoNomina();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoProcesoNomina();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoProcesoNomina("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoProcesoNomina();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoProcesoNomina.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoProcesoNomina"));
		
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonModificarTipoProcesoNomina.addActionListener(new ButtonActionListener(this,"ModificarTipoProcesoNomina"));

		
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonModificarToolBarTipoProcesoNomina.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoProcesoNomina"));
					
		this.jInternalFrameDetalleFormTipoProcesoNomina.jMenuItemModificarTipoProcesoNomina.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoProcesoNomina"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonActualizarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"ActualizarTipoProcesoNomina"));
		
		
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonActualizarToolBarTipoProcesoNomina.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoProcesoNomina"));
						
		this.jInternalFrameDetalleFormTipoProcesoNomina.jMenuItemActualizarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoProcesoNomina"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonEliminarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"EliminarTipoProcesoNomina"));
		
		
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonEliminarToolBarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoProcesoNomina"));
								
		this.jInternalFrameDetalleFormTipoProcesoNomina.jMenuItemEliminarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoProcesoNomina"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonCancelarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"CancelarTipoProcesoNomina"));
		
		
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonCancelarToolBarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoProcesoNomina"));
					
		this.jInternalFrameDetalleFormTipoProcesoNomina.jMenuItemCancelarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoProcesoNomina"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoProcesoNomina.jMenuItemDetalleCerrarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoProcesoNomina"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonGuardarCambiosToolBarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProcesoNomina"));
		
		
		
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonGuardarCambiosToolBarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProcesoNomina"));
		
		
		
		this.jInternalFrameDetalleFormTipoProcesoNomina.jComboBoxTiposAccionesFormularioTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoProcesoNomina"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonidTipoProcesoNominaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProcesoNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtoncodigoTipoProcesoNominaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoProcesoNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonnombreTipoProcesoNominaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProcesoNominaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoProcesoNomina.jTabbedPaneRelacionesTipoProcesoNomina.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoProcesoNomina"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoProcesoNomina"));
		
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoNomina.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoProcesoNomina"));
		}
		
		this.jTableDatosTipoProcesoNomina.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoProcesoNomina"));
		
		this.jTableDatosTipoProcesoNomina.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoProcesoNomina"));
		
		this.jButtonNuevoTipoProcesoNomina.addActionListener(new ButtonActionListener(this,"NuevoTipoProcesoNomina"));
		
		this.jButtonDuplicarTipoProcesoNomina.addActionListener(new ButtonActionListener(this,"DuplicarTipoProcesoNomina"));
		
		this.jButtonCopiarTipoProcesoNomina.addActionListener(new ButtonActionListener(this,"CopiarTipoProcesoNomina"));
		
		this.jButtonVerFormTipoProcesoNomina.addActionListener(new ButtonActionListener(this,"VerFormTipoProcesoNomina"));
		
		
		this.jButtonNuevoToolBarTipoProcesoNomina.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoProcesoNomina"));
			
		this.jButtonDuplicarToolBarTipoProcesoNomina.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoProcesoNomina"));
			
		this.jMenuItemNuevoTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoProcesoNomina"));
			
		this.jMenuItemDuplicarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoProcesoNomina"));		
		
		
		this.jButtonNuevoRelacionesTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoProcesoNomina"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoProcesoNomina.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoProcesoNomina"));
			
		this.jMenuItemNuevoRelacionesTipoProcesoNomina.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoProcesoNomina"));		
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonModificarTipoProcesoNomina.addActionListener(new ButtonActionListener(this,"ModificarTipoProcesoNomina"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonModificarToolBarTipoProcesoNomina.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoProcesoNomina"));
			
			this.jInternalFrameDetalleFormTipoProcesoNomina.jMenuItemModificarTipoProcesoNomina.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoProcesoNomina"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonActualizarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"ActualizarTipoProcesoNomina"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonActualizarToolBarTipoProcesoNomina.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoProcesoNomina"));
				
			this.jInternalFrameDetalleFormTipoProcesoNomina.jMenuItemActualizarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoProcesoNomina"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonEliminarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"EliminarTipoProcesoNomina"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonEliminarToolBarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoProcesoNomina"));
						
			this.jInternalFrameDetalleFormTipoProcesoNomina.jMenuItemEliminarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoProcesoNomina"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonCancelarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"CancelarTipoProcesoNomina"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonCancelarToolBarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoProcesoNomina"));
			
			this.jInternalFrameDetalleFormTipoProcesoNomina.jMenuItemCancelarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoProcesoNomina"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoProcesoNomina"));		
		
		
		this.jButtonCerrarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"CerrarTipoProcesoNomina"));
		
		
		this.jButtonCerrarToolBarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoProcesoNomina"));
			
		this.jMenuItemCerrarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoProcesoNomina"));
			
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoNomina.jMenuItemDetalleCerrarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoProcesoNomina"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonGuardarCambiosTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoProcesoNomina"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonGuardarCambiosToolBarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProcesoNomina"));
		}
		
		this.jButtonCopiarToolBarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoProcesoNomina"));
			
		this.jButtonVerFormToolBarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoProcesoNomina"));
		
		this.jMenuItemGuardarCambiosTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoProcesoNomina"));
			
		this.jMenuItemCopiarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoProcesoNomina"));		
		
		this.jMenuItemVerFormTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoProcesoNomina"));		
		
		
		this.jButtonGuardarCambiosTablaTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoProcesoNomina"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoProcesoNomina"));
			
		this.jMenuItemGuardarCambiosTablaTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoProcesoNomina"));		
		
		
		
		this.jButtonRecargarInformacionTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoProcesoNomina"));
					
		this.jButtonRecargarInformacionToolBarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoProcesoNomina"));
		
		this.jMenuItemRecargarInformacionTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoProcesoNomina"));		
		
		
		
		this.jButtonAnterioresTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"AnterioresTipoProcesoNomina"));
		
		
		this.jButtonAnterioresToolBarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoProcesoNomina"));
		
		this.jMenuItemAnterioresTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoProcesoNomina"));		
		
		
		this.jButtonSiguientesTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"SiguientesTipoProcesoNomina"));
		
		
		this.jButtonSiguientesToolBarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoProcesoNomina"));
			
		this.jMenuItemSiguientesTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoProcesoNomina"));
			
		this.jMenuItemAbrirOrderByTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoProcesoNomina"));
			
		this.jMenuItemMostrarOcultarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoProcesoNomina"));
			
		this.jMenuItemDetalleAbrirOrderByTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoProcesoNomina"));
			
		this.jMenuItemDetalleMostarOcultarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoProcesoNomina"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoProcesoNomina"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoProcesoNomina"));
			
		this.jMenuItemNuevoGuardarCambiosTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoProcesoNomina"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoProcesoNomina.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoProcesoNomina"));

		this.jCheckBoxSeleccionadosTipoProcesoNomina.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoProcesoNomina"));
		
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoNomina.jComboBoxTiposAccionesFormularioTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoProcesoNomina"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoProcesoNomina"));
			
		this.jComboBoxTiposAccionesTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoProcesoNomina"));
					
		this.jComboBoxTiposSeleccionarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoProcesoNomina"));
			
		this.jTextFieldValorCampoGeneralTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoProcesoNomina"));		
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonidTipoProcesoNominaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProcesoNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtoncodigoTipoProcesoNominaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoProcesoNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonnombreTipoProcesoNominaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProcesoNominaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoProcesoNomina!=null) {
				this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProcesoNomina"));
				this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProcesoNomina"));
				this.jInternalFrameReporteDinamicoTipoProcesoNomina.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProcesoNomina"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProcesoNomina"));				
			//this.jButtonGenerarReporteDinamicoTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProcesoNomina"));
			//this.jButtonGenerarExcelReporteDinamicoTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProcesoNomina"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoProcesoNomina!=null) {
				this.jInternalFrameImportacionTipoProcesoNomina.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoProcesoNomina"));
				this.jInternalFrameImportacionTipoProcesoNomina.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoProcesoNomina"));
				this.jInternalFrameImportacionTipoProcesoNomina.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoProcesoNomina"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoProcesoNomina"));
			
			this.jButtonAbrirOrderByToolBarTipoProcesoNomina.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoProcesoNomina"));			
			
			if(this.jInternalFrameOrderByTipoProcesoNomina!=null) {
				this.jInternalFrameOrderByTipoProcesoNomina.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoProcesoNomina"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoNomina.jTabbedPaneRelacionesTipoProcesoNomina.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoProcesoNomina"));
		
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
            		closingInternalFrameTipoProcesoNomina();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoProcesoNomina.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoProcesoNomina = (JInternalFrameBase)event.getSource();
	            	
	            TipoProcesoNominaBeanSwingJInternalFrame jInternalFrameParent=(TipoProcesoNominaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoProcesoNomina.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoProcesoNominaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoProcesoNomina.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoProcesoNominaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoProcesoNomina.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoProcesoNomina.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProcesoNominaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProcesoNominaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProcesoNominaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoProcesoNomina";
		inputMap = this.jButtonNuevoTipoProcesoNomina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoProcesoNomina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoProcesoNominaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProcesoNominaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProcesoNominaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProcesoNominaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoProcesoNomina";
		inputMap = this.jButtonNuevoRelacionesTipoProcesoNomina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoProcesoNomina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoProcesoNominaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoProcesoNomina";
		inputMap = this.jButtonModificarTipoProcesoNomina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoProcesoNomina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoProcesoNominaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoProcesoNomina";
		inputMap = this.jButtonActualizarTipoProcesoNomina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoProcesoNomina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoProcesoNominaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoProcesoNomina";
		inputMap = this.jButtonEliminarTipoProcesoNomina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoProcesoNomina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoProcesoNominaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoProcesoNomina";
		inputMap = this.jButtonCancelarTipoProcesoNomina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoProcesoNomina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoProcesoNominaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoProcesoNomina";
		inputMap = this.jButtonCerrarTipoProcesoNomina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoProcesoNomina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoProcesoNominaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonGuardarCambiosTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoProcesoNomina";
		inputMap = this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonGuardarCambiosTipoProcesoNomina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonGuardarCambiosTipoProcesoNomina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoProcesoNominaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoProcesoNomina.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoProcesoNominaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoProcesoNomina.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoProcesoNominaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoProcesoNomina.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoProcesoNominaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoProcesoNomina.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoProcesoNominaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonidTipoProcesoNominaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProcesoNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtoncodigoTipoProcesoNominaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoProcesoNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoNomina.jButtonnombreTipoProcesoNominaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProcesoNominaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoProcesoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoProcesoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoProcesoNominaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoProcesoNomina.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoProcesoNomina(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoProcesoNomina tipoprocesonominaAux:this.tipoprocesonominaLogic.getTipoProcesoNominas()) {
					tipoprocesonominaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProcesoNomina tipoprocesonominaAux:tipoprocesonominas) {
					tipoprocesonominaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoProcesoNominaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoProcesoNomina(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoProcesoNomina tipoprocesonominaAux:this.tipoprocesonominaLogic.getTipoProcesoNominas()) {
						tipoprocesonominaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProcesoNomina tipoprocesonominaAux:tipoprocesonominas) {
						tipoprocesonominaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoProcesoNomina tipoprocesonominaAux:this.tipoprocesonominaLogic.getTipoProcesoNominas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProcesoNomina tipoprocesonominaAux:tipoprocesonominas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoProcesoNomina(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoProcesoNomina.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoProcesoNomina.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoProcesoNomina,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoProcesoNominaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoProcesoNomina(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoProcesoNomina.getSelectedRows();
			
			TipoProcesoNomina tipoprocesonominaLocal=new TipoProcesoNomina();
			
			//this.seleccionarTodosTipoProcesoNomina(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprocesonominaLocal =(TipoProcesoNomina) this.tipoprocesonominaLogic.getTipoProcesoNominas().toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoprocesonominaLocal =(TipoProcesoNomina) this.tipoprocesonominas.toArray()[this.jTableDatosTipoProcesoNomina.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoprocesonominaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoProcesoNomina tipoprocesonominaAux:this.tipoprocesonominaLogic.getTipoProcesoNominas()) {
						tipoprocesonominaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProcesoNomina tipoprocesonominaAux:tipoprocesonominas) {
						tipoprocesonominaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoProcesoNomina(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoProcesoNomina.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoProcesoNomina.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoProcesoNomina,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoProcesoNominaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoProcesoNominaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoProcesoNominaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoProcesoNomina(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoProcesoNomina.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoProcesoNomina tipoprocesonominaAux:this.tipoprocesonominaLogic.getTipoProcesoNominas()) {
				
						if(sTipoSeleccionar.equals(TipoProcesoNominaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoprocesonominaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoProcesoNominaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoprocesonominaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProcesoNomina tipoprocesonominaAux:tipoprocesonominas) {
					
						if(sTipoSeleccionar.equals(TipoProcesoNominaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoprocesonominaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoProcesoNominaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoprocesonominaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoProcesoNomina(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoProcesoNominaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoProcesoNomina(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoProcesoNomina=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoProcesoNomina.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoProcesoNomina.jComboBoxTiposAccionesFormularioTipoProcesoNomina.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoProcesoNomina) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoProcesoNomina(conSplash);
				
					this.generarReporteTipoProcesoNominasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProcesoNomina.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProcesoNomina.jComboBoxTiposAccionesFormularioTipoProcesoNomina.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoProcesoNominasSeleccionados();
				//this.jComboBoxTiposAccionesTipoProcesoNomina.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoProcesoNominasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoProcesoNomina.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoProcesoNominasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoProcesoNomina.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoProcesoNomina();
				
				this.exportarTipoProcesoNominasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProcesoNomina.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProcesoNomina.jComboBoxTiposAccionesFormularioTipoProcesoNomina.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoProcesoNominas();
				//this.importarTipoProcesoNominas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProcesoNomina.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProcesoNomina.jComboBoxTiposAccionesFormularioTipoProcesoNomina.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoProcesoNomina();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoProcesoNominasSeleccionados();
				//this.jComboBoxTiposAccionesTipoProcesoNomina.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Proceso Nomina", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoProcesoNomina();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoProcesoNomina)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoProcesoNomina(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Proceso Nomina",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProcesoNomina.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProcesoNomina.jComboBoxTiposAccionesFormularioTipoProcesoNomina.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoProcesoNomina();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoProcesoNomina(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoProcesoNominaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoProcesoNomina();
			
			if(this.jInternalFrameDetalleFormTipoProcesoNomina==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoProcesoNomina> tipoprocesonominasSeleccionados=new ArrayList<TipoProcesoNomina>();		
			TipoProcesoNomina tipoprocesonomina=new TipoProcesoNomina();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoProcesoNomina(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoProcesoNomina.getSelectedItem();
			
			
			
			
			tipoprocesonominasSeleccionados=this.getTipoProcesoNominasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoprocesonominasSeleccionados.size()==1) {
				for(TipoProcesoNomina tipoprocesonominaAux:tipoprocesonominasSeleccionados) {
					tipoprocesonomina=tipoprocesonominaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoProcesoNomina();
			
      		//this.finishProcessTipoProcesoNomina(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoProcesoNominaReturnGeneral() throws Exception {
		if(this.tipoprocesonominaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoprocesonominaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoprocesonominaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoprocesonominaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoprocesonominaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoprocesonominaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoProcesoNomina(false);
		}
		
		if(this.tipoprocesonominaReturnGeneral.getConRetornoLista() || this.tipoprocesonominaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoprocesonominaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoprocesonominaLogic.setTipoProcesoNominas(this.tipoprocesonominaReturnGeneral.getTipoProcesoNominas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoprocesonominaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoprocesonominaLogic.setTipoProcesoNomina(this.tipoprocesonominaReturnGeneral.getTipoProcesoNomina());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoProcesoNomina(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoProcesoNomina() throws Exception {
		
		
	}
	
	public ArrayList<TipoProcesoNomina> getTipoProcesoNominasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoProcesoNomina> tipoprocesonominasSeleccionados=new ArrayList<TipoProcesoNomina>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoProcesoNomina) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoProcesoNomina tipoprocesonominaAux:tipoprocesonominaLogic.getTipoProcesoNominas()) {
					if(tipoprocesonominaAux.getIsSelected()) {
						tipoprocesonominasSeleccionados.add(tipoprocesonominaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProcesoNomina tipoprocesonominaAux:this.tipoprocesonominas) {
					if(tipoprocesonominaAux.getIsSelected()) {
						tipoprocesonominasSeleccionados.add(tipoprocesonominaAux);				
					}
				}
			}
			
			if(tipoprocesonominasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoprocesonominasSeleccionados.addAll(this.tipoprocesonominaLogic.getTipoProcesoNominas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoprocesonominasSeleccionados.addAll(this.tipoprocesonominas);				
					}
				}
			}
		} else {
			tipoprocesonominasSeleccionados.add(this.tipoprocesonomina);
		}
		
		return tipoprocesonominasSeleccionados;
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
	
	public void generarReporteTipoProcesoNominasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoProcesoNominasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoProcesoNominasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoProcesoNominasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoProcesoNominasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Proceso Nomina",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoProcesoNominasSeleccionados() throws Exception {
		ArrayList<TipoProcesoNomina> tipoprocesonominasSeleccionados=new ArrayList<TipoProcesoNomina>();		
		
		tipoprocesonominasSeleccionados=this.getTipoProcesoNominasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoProcesoNominas("Todos",tipoprocesonominasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoProcesoNominasSeleccionados() throws Exception {
		ArrayList<TipoProcesoNomina> tipoprocesonominasSeleccionados=new ArrayList<TipoProcesoNomina>();		
		
		tipoprocesonominasSeleccionados=this.getTipoProcesoNominasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoProcesoNominas("Todos",tipoprocesonominasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoProcesoNominasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoProcesoNomina> tipoprocesonominasSeleccionados=new ArrayList<TipoProcesoNomina>();
		
		tipoprocesonominasSeleccionados=this.getTipoProcesoNominasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoProcesoNominas("Todos",tipoprocesonominasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoProcesoNominasSeleccionados() throws Exception {
		ArrayList<TipoProcesoNomina> tipoprocesonominasSeleccionados=new ArrayList<TipoProcesoNomina>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoProcesoNomina();
		
		
		tipoprocesonominasSeleccionados=this.getTipoProcesoNominasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoProcesoNomina();
		
		
		//this.generarReporteTipoProcesoNominas("Todos",tipoprocesonominasSeleccionados ,tipoprocesonominaImplementable,tipoprocesonominaImplementableHome);
	}
	
	public void mostrarImportacionTipoProcesoNominas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoProcesoNomina();
		
		this.abrirFrameImportacionTipoProcesoNomina();		
		
			
		//this.generarReporteTipoProcesoNominas("Todos",tipoprocesonominasSeleccionados ,tipoprocesonominaImplementable,tipoprocesonominaImplementableHome);
	}
	
	public void importarTipoProcesoNominas() throws Exception {		
	
	}
	
	public void exportarTipoProcesoNominasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoProcesoNominasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoProcesoNominasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoProcesoNominasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Proceso Nomina",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoProcesoNominasSeleccionados() throws Exception {
		ArrayList<TipoProcesoNomina> tipoprocesonominasSeleccionados=new ArrayList<TipoProcesoNomina>();		
		
		tipoprocesonominasSeleccionados=this.getTipoProcesoNominasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprocesonomina."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoProcesoNomina(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoProcesoNomina tipoprocesonominaAux:tipoprocesonominasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoProcesoNomina(tipoprocesonominaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoprocesonominaAux.setsDetalleGeneralEntityReporte(tipoprocesonominaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proceso Nomina",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoProcesoNomina(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoProcesoNominaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProcesoNominaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProcesoNominaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProcesoNominaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoProcesoNomina(TipoProcesoNomina tipoprocesonomina,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoprocesonomina.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprocesonomina.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprocesonomina.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprocesonomina.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoProcesoNominasSeleccionados() throws Exception {
		ArrayList<TipoProcesoNomina> tipoprocesonominasSeleccionados=new ArrayList<TipoProcesoNomina>();		
		
		tipoprocesonominasSeleccionados=this.getTipoProcesoNominasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprocesonomina.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoProcesoNominas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoProcesoNomina(row);				
				iRow++;
			}				
			
			for(TipoProcesoNomina tipoprocesonominaAux:tipoprocesonominasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoProcesoNomina(tipoprocesonominaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proceso Nomina",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoProcesoNominasSeleccionados() throws Exception {
		ArrayList<TipoProcesoNomina> tipoprocesonominasSeleccionados=new ArrayList<TipoProcesoNomina>();		
		
		tipoprocesonominasSeleccionados=this.getTipoProcesoNominasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprocesonomina.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoprocesonominas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoprocesonomina");
			//elementRoot.appendChild(element);
		
			for(TipoProcesoNomina tipoprocesonominaAux:tipoprocesonominasSeleccionados) {
				element = document.createElement("tipoprocesonomina");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoProcesoNomina(tipoprocesonominaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proceso Nomina",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoProcesoNomina(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProcesoNominaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProcesoNominaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoProcesoNominaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProcesoNominaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoProcesoNomina(TipoProcesoNomina tipoprocesonomina,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprocesonomina.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprocesonomina.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprocesonomina.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoProcesoNomina(TipoProcesoNomina tipoprocesonomina,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoProcesoNominaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoprocesonomina.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoProcesoNominaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoprocesonomina.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoProcesoNominaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoprocesonomina.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoProcesoNominaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoprocesonomina.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoProcesoNominasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoProcesoNomina> tipoprocesonominasSeleccionados=new ArrayList<TipoProcesoNomina>();
		
		tipoprocesonominasSeleccionados=this.getTipoProcesoNominasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoProcesoNomina(tipoprocesonominasSeleccionados);
		
		this.generarReporteTipoProcesoNominas("Todos",tipoprocesonominasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoProcesoNomina(ArrayList<TipoProcesoNomina> tipoprocesonominasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoProcesoNomina tipoprocesonominaAux:tipoprocesonominasSeleccionados) {
				tipoprocesonominaAux.setsDetalleGeneralEntityReporte(tipoprocesonominaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoProcesoNominaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoprocesonominaAux.setsDescripcionGeneralEntityReporte1(tipoprocesonominaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoProcesoNominaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoprocesonominaAux.setsDescripcionGeneralEntityReporte1(tipoprocesonominaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoProcesoNomina(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoProcesoNomina=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoProcesoNomina=true;
				this.isVisibilidadCeldaGuardarCambiosTipoProcesoNomina=true;
			}
			
			this.isVisibilidadCeldaModificarTipoProcesoNomina=false;
			this.isVisibilidadCeldaActualizarTipoProcesoNomina=false;
			this.isVisibilidadCeldaEliminarTipoProcesoNomina=false;
			this.isVisibilidadCeldaCancelarTipoProcesoNomina=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProcesoNomina=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProcesoNomina=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoProcesoNomina=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoNomina=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoNomina=false;
			this.isVisibilidadCeldaModificarTipoProcesoNomina=false;
			this.isVisibilidadCeldaActualizarTipoProcesoNomina=true;
			this.isVisibilidadCeldaEliminarTipoProcesoNomina=false;
			this.isVisibilidadCeldaCancelarTipoProcesoNomina=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProcesoNomina=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProcesoNomina=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoProcesoNomina=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoNomina=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoNomina=false;
			this.isVisibilidadCeldaModificarTipoProcesoNomina=false;
			this.isVisibilidadCeldaActualizarTipoProcesoNomina=true;
			this.isVisibilidadCeldaEliminarTipoProcesoNomina=true;
			this.isVisibilidadCeldaCancelarTipoProcesoNomina=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProcesoNomina=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProcesoNomina=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoProcesoNomina=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoNomina=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoNomina=false;
			this.isVisibilidadCeldaModificarTipoProcesoNomina=false;
			this.isVisibilidadCeldaActualizarTipoProcesoNomina=true;
			this.isVisibilidadCeldaEliminarTipoProcesoNomina=false;
			this.isVisibilidadCeldaCancelarTipoProcesoNomina=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProcesoNomina=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProcesoNomina=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoProcesoNomina=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoNomina=true;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoNomina=true;
			this.isVisibilidadCeldaModificarTipoProcesoNomina=false;
			this.isVisibilidadCeldaActualizarTipoProcesoNomina=false;
			this.isVisibilidadCeldaEliminarTipoProcesoNomina=false;
			this.isVisibilidadCeldaCancelarTipoProcesoNomina=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProcesoNomina=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProcesoNomina=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoProcesoNomina=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoNomina=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoNomina=false;
			this.isVisibilidadCeldaActualizarTipoProcesoNomina=false;
			this.isVisibilidadCeldaEliminarTipoProcesoNomina=false;
			this.isVisibilidadCeldaCancelarTipoProcesoNomina=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProcesoNomina=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProcesoNomina=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoProcesoNomina=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoNomina=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoNomina=false;
			this.isVisibilidadCeldaModificarTipoProcesoNomina=true;
			this.isVisibilidadCeldaActualizarTipoProcesoNomina=false;
			this.isVisibilidadCeldaEliminarTipoProcesoNomina=false;
			this.isVisibilidadCeldaCancelarTipoProcesoNomina=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProcesoNomina=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProcesoNomina=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoProcesoNominaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoProcesoNomina=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoNomina=true;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoNomina=true;
		} else {
			this.actualizarEstadoPanelsTipoProcesoNomina(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoProcesoNomina=false;
			//this.isVisibilidadCeldaVerFormTipoProcesoNomina=false;
			this.isVisibilidadCeldaDuplicarTipoProcesoNomina=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoprocesonominaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoNomina=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoProcesoNomina=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoNomina=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
			if(!tipoprocesonominaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoProcesoNomina=false;												
			}
			
			this.jButtonCerrarTipoProcesoNomina.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoNomina=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoprocesonomina)) {
			this.isVisibilidadCeldaActualizarTipoProcesoNomina=false;
			this.isVisibilidadCeldaEliminarTipoProcesoNomina=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoProcesoNomina() {
	}
	
	public void actualizarEstadoPanelsTipoProcesoNomina(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoProcesoNomina!=null) {
				this.jScrollPanelDatosEdicionTipoProcesoNomina.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoProcesoNomina!=null) {
				this.jScrollPanelDatosTipoProcesoNomina.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProcesoNomina!=null) {
				this.jPanelPaginacionTipoProcesoNomina.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProcesoNomina!=null) {
				this.jPanelParametrosReportesTipoProcesoNomina.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoProcesoNomina!=null) {
				this.jScrollPanelDatosEdicionTipoProcesoNomina.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoProcesoNomina!=null) {
				this.jScrollPanelDatosTipoProcesoNomina.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProcesoNomina!=null) {
				this.jPanelPaginacionTipoProcesoNomina.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProcesoNomina!=null) {
				this.jPanelParametrosReportesTipoProcesoNomina.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoProcesoNomina!=null) {
				this.jScrollPanelDatosEdicionTipoProcesoNomina.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoProcesoNomina!=null) {
				this.jScrollPanelDatosTipoProcesoNomina.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProcesoNomina!=null) {
				this.jPanelPaginacionTipoProcesoNomina.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProcesoNomina!=null) {
				this.jPanelParametrosReportesTipoProcesoNomina.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoProcesoNomina!=null) {
				this.jScrollPanelDatosEdicionTipoProcesoNomina.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProcesoNomina!=null) {
				this.jScrollPanelDatosTipoProcesoNomina.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProcesoNomina!=null) {
				this.jPanelPaginacionTipoProcesoNomina.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProcesoNomina!=null) {
				this.jPanelParametrosReportesTipoProcesoNomina.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoProcesoNomina!=null) {
				this.jScrollPanelDatosEdicionTipoProcesoNomina.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoProcesoNomina!=null) {
				this.jScrollPanelDatosTipoProcesoNomina.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProcesoNomina!=null) {
				this.jPanelPaginacionTipoProcesoNomina.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProcesoNomina!=null) {
				this.jPanelParametrosReportesTipoProcesoNomina.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoProcesoNomina!=null) {
				this.jScrollPanelDatosEdicionTipoProcesoNomina.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoProcesoNomina!=null) {
				this.jScrollPanelDatosTipoProcesoNomina.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProcesoNomina!=null) {
				this.jPanelPaginacionTipoProcesoNomina.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProcesoNomina!=null) {
				this.jPanelParametrosReportesTipoProcesoNomina.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoProcesoNomina!=null) {
				this.jScrollPanelDatosEdicionTipoProcesoNomina.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoProcesoNomina!=null) {
				this.jScrollPanelDatosTipoProcesoNomina.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProcesoNomina!=null) {
				this.jPanelPaginacionTipoProcesoNomina.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProcesoNomina!=null) {
				this.jPanelParametrosReportesTipoProcesoNomina.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoProcesoNominaSessionBean tipoprocesonominaSessionBean=new TipoProcesoNominaSessionBean();
		
		if(this.tipoprocesonominaSessionBean==null) {
			this.tipoprocesonominaSessionBean=new TipoProcesoNominaSessionBean();
		}
		
		this.tipoprocesonominaSessionBean.setsUltimaBusquedaTipoProcesoNomina(this.getsAccionBusqueda());
		this.tipoprocesonominaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoprocesonominaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoProcesoNominaSessionBean tipoprocesonominaSessionBean=new TipoProcesoNominaSessionBean();
		
		if(this.tipoprocesonominaSessionBean==null) {
			this.tipoprocesonominaSessionBean=new TipoProcesoNominaSessionBean();
		}
		
		if(this.tipoprocesonominaSessionBean.getsUltimaBusquedaTipoProcesoNomina()!=null&&!this.tipoprocesonominaSessionBean.getsUltimaBusquedaTipoProcesoNomina().equals("")) {
			this.setsAccionBusqueda(tipoprocesonominaSessionBean.getsUltimaBusquedaTipoProcesoNomina());
			this.setiNumeroPaginacion(tipoprocesonominaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoprocesonominaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipoprocesonominaSessionBean.setsUltimaBusquedaTipoProcesoNomina("");
		this.tipoprocesonominaSessionBean.setiNumeroPaginacion(TipoProcesoNominaConstantesFunciones.INUMEROPAGINACION);
		this.tipoprocesonominaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoProcesoNomina(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoProcesoNomina() {
		this.updateBorderResaltarBusquedasFormularioTipoProcesoNomina();
		this.updateVisibilidadBusquedasFormularioTipoProcesoNomina();
		this.updateHabilitarBusquedasFormularioTipoProcesoNomina();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoProcesoNomina() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoProcesoNomina() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoProcesoNomina() {
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
	
	public void updateControlesFormularioTipoProcesoNomina() throws Exception {

		if(this.jInternalFrameDetalleFormTipoProcesoNomina==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoProcesoNomina();
		this.updateVisibilidadResaltarControlesFormularioTipoProcesoNomina();
		this.updateHabilitarResaltarControlesFormularioTipoProcesoNomina();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoProcesoNomina() throws Exception {
		if(this.jInternalFrameDetalleFormTipoProcesoNomina==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoprocesonominaConstantesFunciones.resaltaridTipoProcesoNomina!=null && this.jInternalFrameDetalleFormTipoProcesoNomina!=null) {this.jInternalFrameDetalleFormTipoProcesoNomina.jTextFieldidTipoProcesoNomina.setBorder(this.tipoprocesonominaConstantesFunciones.resaltaridTipoProcesoNomina);}
		if(this.tipoprocesonominaConstantesFunciones.resaltarcodigoTipoProcesoNomina!=null && this.jInternalFrameDetalleFormTipoProcesoNomina!=null) {this.jInternalFrameDetalleFormTipoProcesoNomina.jTextFieldcodigoTipoProcesoNomina.setBorder(this.tipoprocesonominaConstantesFunciones.resaltarcodigoTipoProcesoNomina);}
		if(this.tipoprocesonominaConstantesFunciones.resaltarnombreTipoProcesoNomina!=null && this.jInternalFrameDetalleFormTipoProcesoNomina!=null) {this.jInternalFrameDetalleFormTipoProcesoNomina.jTextAreanombreTipoProcesoNomina.setBorder(this.tipoprocesonominaConstantesFunciones.resaltarnombreTipoProcesoNomina);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoProcesoNomina() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoProcesoNomina==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) {
	
		//this.jInternalFrameDetalleFormTipoProcesoNomina.jTextFieldidTipoProcesoNomina.setVisible(this.tipoprocesonominaConstantesFunciones.mostraridTipoProcesoNomina);
		this.jInternalFrameDetalleFormTipoProcesoNomina.jPanelidTipoProcesoNomina.setVisible(this.tipoprocesonominaConstantesFunciones.mostraridTipoProcesoNomina);
		//this.jInternalFrameDetalleFormTipoProcesoNomina.jTextFieldcodigoTipoProcesoNomina.setVisible(this.tipoprocesonominaConstantesFunciones.mostrarcodigoTipoProcesoNomina);
		this.jInternalFrameDetalleFormTipoProcesoNomina.jPanelcodigoTipoProcesoNomina.setVisible(this.tipoprocesonominaConstantesFunciones.mostrarcodigoTipoProcesoNomina);
		//this.jInternalFrameDetalleFormTipoProcesoNomina.jTextAreanombreTipoProcesoNomina.setVisible(this.tipoprocesonominaConstantesFunciones.mostrarnombreTipoProcesoNomina);
		this.jInternalFrameDetalleFormTipoProcesoNomina.jPanelnombreTipoProcesoNomina.setVisible(this.tipoprocesonominaConstantesFunciones.mostrarnombreTipoProcesoNomina);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoProcesoNomina() throws Exception {
		if(this.jInternalFrameDetalleFormTipoProcesoNomina==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoProcesoNomina!=null) {
	
		this.jInternalFrameDetalleFormTipoProcesoNomina.jTextFieldidTipoProcesoNomina.setEnabled(this.tipoprocesonominaConstantesFunciones.activaridTipoProcesoNomina);
		this.jInternalFrameDetalleFormTipoProcesoNomina.jTextFieldcodigoTipoProcesoNomina.setEnabled(this.tipoprocesonominaConstantesFunciones.activarcodigoTipoProcesoNomina);
		this.jInternalFrameDetalleFormTipoProcesoNomina.jTextAreanombreTipoProcesoNomina.setEnabled(this.tipoprocesonominaConstantesFunciones.activarnombreTipoProcesoNomina);
		}
	}
	
		
}