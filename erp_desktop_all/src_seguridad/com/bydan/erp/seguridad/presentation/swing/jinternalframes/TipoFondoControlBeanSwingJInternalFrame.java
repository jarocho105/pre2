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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;




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

import com.bydan.erp.seguridad.util.TipoFondoControlConstantesFunciones;
import com.bydan.erp.seguridad.util.TipoFondoControlParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.TipoFondoControlParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.TipoFondoControlBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.seguridad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
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


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
public class TipoFondoControlBeanSwingJInternalFrame extends TipoFondoControlJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoFondoControlBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoFondoControl> tipofondocontrolValidator = new ClassValidator<TipoFondoControl>(TipoFondoControl.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoFondoControl tipofondocontrol;	
	public TipoFondoControl tipofondocontrolAux;
	public TipoFondoControl tipofondocontrolAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoFondoControl tipofondocontrolTotales;
	public Long idTipoFondoControlActual;
	public Long iIdNuevoTipoFondoControl=0L;
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
	
	public Boolean isPermisoTodoTipoFondoControl;
	public Boolean isPermisoNuevoTipoFondoControl;
	public Boolean isPermisoActualizarTipoFondoControl;
	public Boolean isPermisoActualizarOriginalTipoFondoControl;
	public Boolean isPermisoEliminarTipoFondoControl;
	public Boolean isPermisoGuardarCambiosTipoFondoControl;
	public Boolean isPermisoConsultaTipoFondoControl;
	public Boolean isPermisoBusquedaTipoFondoControl;
	public Boolean isPermisoReporteTipoFondoControl;
	public Boolean isPermisoPaginacionMedioTipoFondoControl;
	public Boolean isPermisoPaginacionAltoTipoFondoControl;
	public Boolean isPermisoPaginacionTodoTipoFondoControl;
	public Boolean isPermisoCopiarTipoFondoControl;
	public Boolean isPermisoVerFormTipoFondoControl;
	public Boolean isPermisoDuplicarTipoFondoControl;
	public Boolean isPermisoOrdenTipoFondoControl;
	
	
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
	
	public TipoFondoControlParameterReturnGeneral tipofondocontrolReturnGeneral;
	public TipoFondoControlParameterReturnGeneral tipofondocontrolParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoFondoControl=false;
	public Boolean esParaAccionDesdeFormularioTipoFondoControl=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoFondoControlLogic tipofondocontrolLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoFondoControl tipofondocontrolBean;
	public TipoFondoControlConstantesFunciones tipofondocontrolConstantesFunciones;
	//public TipoFondoControlParameterReturnGeneral tipofondocontrolReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoFondoControl> tipofondocontrols;	
	//public List<TipoFondoControl> tipofondocontrolsEliminados;
	//public List<TipoFondoControl> tipofondocontrolsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoFondoControl=false;
	public Boolean isVisibilidadCeldaDuplicarTipoFondoControl=true;
	public Boolean isVisibilidadCeldaCopiarTipoFondoControl=true;
	public Boolean isVisibilidadCeldaVerFormTipoFondoControl=true;
	public Boolean isVisibilidadCeldaOrdenTipoFondoControl=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoFondoControl=false;
	public Boolean isVisibilidadCeldaModificarTipoFondoControl=false;
	public Boolean isVisibilidadCeldaActualizarTipoFondoControl=false;
	public Boolean isVisibilidadCeldaEliminarTipoFondoControl=false;
	public Boolean isVisibilidadCeldaCancelarTipoFondoControl=false;
	public Boolean isVisibilidadCeldaGuardarTipoFondoControl=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoFondoControl=false;	
	
	
	
	public Long getiIdNuevoTipoFondoControl() {
		return this.iIdNuevoTipoFondoControl;
	}

	public void setiIdNuevoTipoFondoControl(Long iIdNuevoTipoFondoControl) {
		this.iIdNuevoTipoFondoControl = iIdNuevoTipoFondoControl;
	}
	
	public Long getidTipoFondoControlActual() {
		return this.idTipoFondoControlActual;
	}

	public void setidTipoFondoControlActual(Long idTipoFondoControlActual) {
		this.idTipoFondoControlActual = idTipoFondoControlActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoFondoControl gettipofondocontrol() {
		return this.tipofondocontrol;
	}

	public void settipofondocontrol(TipoFondoControl tipofondocontrol) {
		this.tipofondocontrol = tipofondocontrol;
	}
	
	public TipoFondoControl gettipofondocontrolAux() {
		return this.tipofondocontrolAux;
	}

	public void settipofondocontrolAux(TipoFondoControl tipofondocontrolAux) {
		this.tipofondocontrolAux = tipofondocontrolAux;
	}				
	
	public TipoFondoControl gettipofondocontrolAnterior() {
		return this.tipofondocontrolAnterior;
	}

	public void settipofondocontrolAnterior(TipoFondoControl tipofondocontrolAnterior) {
		this.tipofondocontrolAnterior = tipofondocontrolAnterior;
	}	
	
	public TipoFondoControl gettipofondocontrolTotales() {
		return this.tipofondocontrolTotales;
	}

	public void settipofondocontrolTotales(TipoFondoControl tipofondocontrolTotales) {
		this.tipofondocontrolTotales = tipofondocontrolTotales;
	}	
	
	public TipoFondoControl gettipofondocontrolBean() {
		return this.tipofondocontrolBean;
	}

	public void settipofondocontrolBean(TipoFondoControl tipofondocontrolBean) {
		this.tipofondocontrolBean = tipofondocontrolBean;
	}	
	
	public TipoFondoControlParameterReturnGeneral gettipofondocontrolReturnGeneral() {
		return this.tipofondocontrolReturnGeneral;
	}

	public void settipofondocontrolReturnGeneral(TipoFondoControlParameterReturnGeneral tipofondocontrolReturnGeneral) {
		this.tipofondocontrolReturnGeneral = tipofondocontrolReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoFondoControlLogic getTipoFondoControlLogic()	{		
		return tipofondocontrolLogic;
	}

	public void setTipoFondoControlLogic(TipoFondoControlLogic tipofondocontrolLogic) {
		this.tipofondocontrolLogic = tipofondocontrolLogic;
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
	
	public Boolean getIsEsNuevoTipoFondoControl() {
		return isEsNuevoTipoFondoControl;
	}

	public void setIsEsNuevoTipoFondoControl(Boolean isEsNuevoTipoFondoControl) {
		this.isEsNuevoTipoFondoControl = isEsNuevoTipoFondoControl;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoFondoControl() {
		return esParaAccionDesdeFormularioTipoFondoControl;
	}
	
	public void setEsParaAccionDesdeFormularioTipoFondoControl(Boolean esParaAccionDesdeFormularioTipoFondoControl) {
		this.esParaAccionDesdeFormularioTipoFondoControl = esParaAccionDesdeFormularioTipoFondoControl;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoFondoControl() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoFondoControlConstantesFunciones.refrescarForeignKeysDescripcionesTipoFondoControl(this.tipofondocontrolLogic.getTipoFondoControls());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoFondoControlConstantesFunciones.refrescarForeignKeysDescripcionesTipoFondoControl(this.tipofondocontrols);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipofondocontrolLogic.setTipoFondoControls(this.tipofondocontrols);
			tipofondocontrolLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoFondoControlParameterReturnGeneral getTipoFondoControlParameterGeneral() {
		return this.tipofondocontrolParameterGeneral;
	}
	
	public void setTipoFondoControlParameterGeneral(TipoFondoControlParameterReturnGeneral tipofondocontrolParameterGeneral) {
		this.tipofondocontrolParameterGeneral = tipofondocontrolParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoFondoControl() {
		return isPermisoTodoTipoFondoControl;
	}

	public void setIsPermisoTodoTipoFondoControl(Boolean isPermisoTodoTipoFondoControl) {
		this.isPermisoTodoTipoFondoControl = isPermisoTodoTipoFondoControl;
	}

	public Boolean getIsPermisoNuevoTipoFondoControl() {
		return isPermisoNuevoTipoFondoControl;
	}

	public void setIsPermisoNuevoTipoFondoControl(Boolean isPermisoNuevoTipoFondoControl) {
		this.isPermisoNuevoTipoFondoControl = isPermisoNuevoTipoFondoControl;
	}

	public Boolean getIsPermisoActualizarTipoFondoControl() {
		return isPermisoActualizarTipoFondoControl;
	}

	public void setIsPermisoActualizarTipoFondoControl(Boolean isPermisoActualizarTipoFondoControl) {
		this.isPermisoActualizarTipoFondoControl = isPermisoActualizarTipoFondoControl;
	}

	public Boolean getIsPermisoEliminarTipoFondoControl() {
		return isPermisoEliminarTipoFondoControl;
	}

	public void setIsPermisoEliminarTipoFondoControl(Boolean isPermisoEliminarTipoFondoControl) {
		this.isPermisoEliminarTipoFondoControl = isPermisoEliminarTipoFondoControl;
	}

	public Boolean getIsPermisoGuardarCambiosTipoFondoControl() {
		return isPermisoGuardarCambiosTipoFondoControl;
	}

	public void setIsPermisoGuardarCambiosTipoFondoControl(Boolean isPermisoGuardarCambiosTipoFondoControl) {
		this.isPermisoGuardarCambiosTipoFondoControl = isPermisoGuardarCambiosTipoFondoControl;
	}
	
	public Boolean getIsPermisoConsultaTipoFondoControl() {
		return isPermisoConsultaTipoFondoControl;
	}

	public void setIsPermisoConsultaTipoFondoControl(Boolean isPermisoConsultaTipoFondoControl) {
		this.isPermisoConsultaTipoFondoControl = isPermisoConsultaTipoFondoControl;
	}

	public Boolean getIsPermisoBusquedaTipoFondoControl() {
		return isPermisoBusquedaTipoFondoControl;
	}

	public void setIsPermisoBusquedaTipoFondoControl(Boolean isPermisoBusquedaTipoFondoControl) {
		this.isPermisoBusquedaTipoFondoControl = isPermisoBusquedaTipoFondoControl;
	}

	public Boolean getIsPermisoReporteTipoFondoControl() {
		return isPermisoReporteTipoFondoControl;
	}

	public void setIsPermisoReporteTipoFondoControl(Boolean isPermisoReporteTipoFondoControl) {
		this.isPermisoReporteTipoFondoControl = isPermisoReporteTipoFondoControl;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoFondoControl() {
		return isPermisoPaginacionMedioTipoFondoControl;
	}

	public void setIsPermisoPaginacionMedioTipoFondoControl(Boolean isPermisoPaginacionMedioTipoFondoControl) {
		this.isPermisoPaginacionMedioTipoFondoControl = isPermisoPaginacionMedioTipoFondoControl;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoFondoControl() {
		return isPermisoPaginacionTodoTipoFondoControl;
	}

	public void setIsPermisoPaginacionTodoTipoFondoControl(Boolean isPermisoPaginacionTodoTipoFondoControl) {
		this.isPermisoPaginacionTodoTipoFondoControl = isPermisoPaginacionTodoTipoFondoControl;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoFondoControl() {
		return isPermisoPaginacionAltoTipoFondoControl;
	}

	public void setIsPermisoPaginacionAltoTipoFondoControl(Boolean isPermisoPaginacionAltoTipoFondoControl) {
		this.isPermisoPaginacionAltoTipoFondoControl = isPermisoPaginacionAltoTipoFondoControl;
	}
	
	public Boolean getIsPermisoCopiarTipoFondoControl() {
		return isPermisoCopiarTipoFondoControl;
	}

	public void setIsPermisoCopiarTipoFondoControl(Boolean isPermisoCopiarTipoFondoControl) {
		this.isPermisoCopiarTipoFondoControl = isPermisoCopiarTipoFondoControl;
	}
	
	public Boolean getIsPermisoVerFormTipoFondoControl() {
		return isPermisoVerFormTipoFondoControl;
	}

	public void setIsPermisoVerFormTipoFondoControl(Boolean isPermisoVerFormTipoFondoControl) {
		this.isPermisoVerFormTipoFondoControl = isPermisoVerFormTipoFondoControl;
	}
	
	public Boolean getIsPermisoDuplicarTipoFondoControl() {
		return isPermisoDuplicarTipoFondoControl;
	}

	public void setIsPermisoDuplicarTipoFondoControl(Boolean isPermisoDuplicarTipoFondoControl) {
		this.isPermisoDuplicarTipoFondoControl = isPermisoDuplicarTipoFondoControl;
	}
	
	public Boolean getIsPermisoOrdenTipoFondoControl() {
		return isPermisoOrdenTipoFondoControl;
	}

	public void setIsPermisoOrdenTipoFondoControl(Boolean isPermisoOrdenTipoFondoControl) {
		this.isPermisoOrdenTipoFondoControl = isPermisoOrdenTipoFondoControl;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoFondoControl() {
		return isVisibilidadCeldaNuevoTipoFondoControl;
	}

	public void setIsVisibilidadCeldaNuevoTipoFondoControl(Boolean isVisibilidadCeldaNuevoTipoFondoControl) {
		this.isVisibilidadCeldaNuevoTipoFondoControl = isVisibilidadCeldaNuevoTipoFondoControl;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoFondoControl() {
		return isVisibilidadCeldaDuplicarTipoFondoControl;
	}

	public void setIsVisibilidadCeldaDuplicarTipoFondoControl(Boolean isVisibilidadCeldaDuplicarTipoFondoControl) {
		this.isVisibilidadCeldaDuplicarTipoFondoControl = isVisibilidadCeldaDuplicarTipoFondoControl;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoFondoControl() {
		return isVisibilidadCeldaCopiarTipoFondoControl;
	}

	public void setIsVisibilidadCeldaCopiarTipoFondoControl(Boolean isVisibilidadCeldaCopiarTipoFondoControl) {
		this.isVisibilidadCeldaCopiarTipoFondoControl = isVisibilidadCeldaCopiarTipoFondoControl;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoFondoControl() {
		return isVisibilidadCeldaVerFormTipoFondoControl;
	}

	public void setIsVisibilidadCeldaVerFormTipoFondoControl(Boolean isVisibilidadCeldaVerFormTipoFondoControl) {
		this.isVisibilidadCeldaVerFormTipoFondoControl = isVisibilidadCeldaVerFormTipoFondoControl;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoFondoControl() {
		return isVisibilidadCeldaOrdenTipoFondoControl;
	}

	public void setIsVisibilidadCeldaOrdenTipoFondoControl(Boolean isVisibilidadCeldaOrdenTipoFondoControl) {
		this.isVisibilidadCeldaOrdenTipoFondoControl = isVisibilidadCeldaOrdenTipoFondoControl;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoFondoControl() {
		return isVisibilidadCeldaNuevoRelacionesTipoFondoControl;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoFondoControl(Boolean isVisibilidadCeldaNuevoRelacionesTipoFondoControl) {
		this.isVisibilidadCeldaNuevoRelacionesTipoFondoControl = isVisibilidadCeldaNuevoRelacionesTipoFondoControl;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoFondoControl() {
		return isVisibilidadCeldaModificarTipoFondoControl;
	}

	public void setIsVisibilidadCeldaModificarTipoFondoControl(Boolean isVisibilidadCeldaModificarTipoFondoControl) {
		this.isVisibilidadCeldaModificarTipoFondoControl = isVisibilidadCeldaModificarTipoFondoControl;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoFondoControl() {
		return isVisibilidadCeldaActualizarTipoFondoControl;
	}

	public void setIsVisibilidadCeldaActualizarTipoFondoControl(Boolean isVisibilidadCeldaActualizarTipoFondoControl) {
		this.isVisibilidadCeldaActualizarTipoFondoControl = isVisibilidadCeldaActualizarTipoFondoControl;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoFondoControl() {
		return isVisibilidadCeldaEliminarTipoFondoControl;
	}

	public void setIsVisibilidadCeldaEliminarTipoFondoControl(Boolean isVisibilidadCeldaEliminarTipoFondoControl) {
		this.isVisibilidadCeldaEliminarTipoFondoControl = isVisibilidadCeldaEliminarTipoFondoControl;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoFondoControl() {
		return isVisibilidadCeldaCancelarTipoFondoControl;
	}

	public void setIsVisibilidadCeldaCancelarTipoFondoControl(Boolean isVisibilidadCeldaCancelarTipoFondoControl) {
		this.isVisibilidadCeldaCancelarTipoFondoControl = isVisibilidadCeldaCancelarTipoFondoControl;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoFondoControl() {
		return isVisibilidadCeldaGuardarTipoFondoControl;
	}

	public void setIsVisibilidadCeldaGuardarTipoFondoControl(Boolean isVisibilidadCeldaGuardarTipoFondoControl) {
		this.isVisibilidadCeldaGuardarTipoFondoControl = isVisibilidadCeldaGuardarTipoFondoControl;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoFondoControl() {
		return isVisibilidadCeldaGuardarCambiosTipoFondoControl;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoFondoControl(Boolean isVisibilidadCeldaGuardarCambiosTipoFondoControl) {
		this.isVisibilidadCeldaGuardarCambiosTipoFondoControl = isVisibilidadCeldaGuardarCambiosTipoFondoControl;
	}
		
	public TipoFondoControlSessionBean gettipofondocontrolSessionBean() {
		return this.tipofondocontrolSessionBean;
	}
	
	public void settipofondocontrolSessionBean(TipoFondoControlSessionBean tipofondocontrolSessionBean) {
		this.tipofondocontrolSessionBean=tipofondocontrolSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoFondoControl(TipoFondoControl tipofondocontrol)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoFondoControl tipofondocontrol,TipoFondoControl tipofondocontrolAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoFondoControl(tipofondocontrol);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipofondocontrolAux.setId(tipofondocontrol.getId());
		tipofondocontrolAux.setVersionRow(tipofondocontrol.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoFondoControl();
		
			int intSelectedRow = this.jTableDatosTipoFondoControl.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrolLogic.getTipoFondoControls().toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrols.toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoFondoControlJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoFondoControl(this.tipofondocontrol,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFondoControl(this.tipofondocontrol);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipofondocontrolValidator.getInvalidValues(this.tipofondocontrol);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipofondocontrolLogic.setDatosCliente(datosCliente);
			tipofondocontrolLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipofondocontrolAux=new  TipoFondoControl();
				
				tipofondocontrolAux.setIsNew(true);
				tipofondocontrolAux.setIsChanged(true);
				
				tipofondocontrolAux.setTipoFondoControlOriginal(this.tipofondocontrol);
				
				tipofondocontrolAux.setId(this.tipofondocontrol.getId());	
				tipofondocontrolAux.setVersionRow(this.tipofondocontrol.getVersionRow());	
				tipofondocontrolAux.setcodigo(this.tipofondocontrol.getcodigo());	
				tipofondocontrolAux.setnombre(this.tipofondocontrol.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipofondocontrolSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipofondocontrolSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipofondocontrolAux,tipofondocontrolLogic.getTipoFondoControls());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipofondocontrolAux,tipofondocontrols);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipofondocontrolSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipofondocontrolSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofondocontrolLogic.saveTipoFondoControls();//WithConnection
						//tipofondocontrolLogic.getSetVersionRowTipoFondoControls();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipofondocontrol,tipofondocontrolAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipofondocontrolAux=new  TipoFondoControl();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipofondocontrolSessionBean.getEsGuardarRelacionado() 
					|| (this.tipofondocontrolSessionBean.getEsGuardarRelacionado() && this.tipofondocontrol.getId()>=0)) {
						
					tipofondocontrolAux.setIsNew(false);
				}
				
				tipofondocontrolAux.setIsDeleted(false);
			
				tipofondocontrolAux.setId(this.tipofondocontrol.getId());	
				tipofondocontrolAux.setVersionRow(this.tipofondocontrol.getVersionRow());	
				tipofondocontrolAux.setcodigo(this.tipofondocontrol.getcodigo());	
				tipofondocontrolAux.setnombre(this.tipofondocontrol.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipofondocontrolAux,tipofondocontrolLogic.getTipoFondoControls());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipofondocontrolAux,tipofondocontrols);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipofondocontrolSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipofondocontrolSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofondocontrolLogic.saveTipoFondoControls();//WithConnection
						//tipofondocontrolLogic.getSetVersionRowTipoFondoControls();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipofondocontrol,tipofondocontrolAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipofondocontrolAux=new  TipoFondoControl();
				
				tipofondocontrolAux.setIsNew(false);
				tipofondocontrolAux.setIsChanged(false);
				
				tipofondocontrolAux.setIsDeleted(true);
				
				tipofondocontrolAux.setId(this.tipofondocontrol.getId());	
				tipofondocontrolAux.setVersionRow(this.tipofondocontrol.getVersionRow());	
				tipofondocontrolAux.setcodigo(this.tipofondocontrol.getcodigo());	
				tipofondocontrolAux.setnombre(this.tipofondocontrol.getnombre());	
				
				if(this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipofondocontrolAux.getId()>=0) {	
						this.tipofondocontrolsEliminados.add(tipofondocontrolAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipofondocontrolAux,tipofondocontrolLogic.getTipoFondoControls());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipofondocontrolAux,tipofondocontrols);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipofondocontrolSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipofondocontrolSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofondocontrolLogic.saveTipoFondoControls();//WithConnection
						//tipofondocontrolLogic.getSetVersionRowTipoFondoControls();//WithConnection
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
					this.tipofondocontrolLogic.getTipoFondoControls().addAll(this.tipofondocontrolsEliminados);
					
					tipofondocontrolLogic.saveTipoFondoControls();//WithConnection
					//tipofondocontrolLogic.getSetVersionRowTipoFondoControls();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipofondocontrolsEliminados= new ArrayList<TipoFondoControl>();		
			}
			
			if(this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Fondo Control GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Fondo Control",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipofondocontrol=tipofondocontrolAux;
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
      		//this.finishProcessTipoFondoControl();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoFondoControl tipofondocontrolLocal) throws Exception {
		
		if(this.tipofondocontrolSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoFondoControl tipofondocontrolLocal) throws Exception {	
		if(this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoFondoControlActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoFondoControl.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrolLogic.getTipoFondoControls().toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrols.toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipofondocontrolValidator.getInvalidValues(this.tipofondocontrol);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoFondoControl tipofondocontrol,List<TipoFondoControl> tipofondocontrols) throws Exception {
		try	{		
			TipoFondoControlConstantesFunciones.actualizarLista(tipofondocontrol,tipofondocontrols,this.tipofondocontrolSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoFondoControl tipofondocontrol,List<TipoFondoControl> tipofondocontrols) throws Exception {
		try	{			
			TipoFondoControlConstantesFunciones.actualizarSelectedLista(tipofondocontrol,tipofondocontrols);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoFondoControl> tipofondocontrolsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipofondocontrolsLocal=this.tipofondocontrolLogic.getTipoFondoControls();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipofondocontrolsLocal=this.tipofondocontrols;
			}
			//ARCHITECTURE
		
			for(TipoFondoControl tipofondocontrolLocal:tipofondocontrolsLocal) {
				if(this.permiteMantenimiento(tipofondocontrolLocal) && tipofondocontrolLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoFondoControlConstantesFunciones.getTipoFondoControlLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoFondoControlConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFondoControl.jLabelcodigoTipoFondoControl,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoFondoControlConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFondoControl.jLabelnombreTipoFondoControl,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoFondoControl.jLabelcodigoTipoFondoControl,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoFondoControl.jLabelnombreTipoFondoControl,"");
		
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
		this.iIdNuevoTipoFondoControl--;	
		
		
		this.tipofondocontrolAux=new TipoFondoControl();
		
		this.tipofondocontrolAux.setId(this.iIdNuevoTipoFondoControl);
		this.tipofondocontrolAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipofondocontrolLogic.getTipoFondoControls().add(this.tipofondocontrolAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipofondocontrols.add(this.tipofondocontrolAux);
		}
		//ARCHITECTURE
		
		this.tipofondocontrol=this.tipofondocontrolAux;
		
		if(TipoFondoControlJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoFondoControl(this.tipofondocontrol);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoFondoControl(this.tipofondocontrol);
		}
				
		//this.setDefaultControlesTipoFondoControl();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoFondoControl();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoFondoControl();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFondoControl();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoFondoControl(this.tipofondocontrolBean,this.tipofondocontrol,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoFondoControl(this.tipofondocontrol);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoFondoControlConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipofondocontrolSessionBean.getConGuardarRelaciones()) {
			classes=TipoFondoControlConstantesFunciones.getClassesRelationshipsOfTipoFondoControl(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipofondocontrolReturnGeneral=tipofondocontrolLogic.procesarEventosTipoFondoControlsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipofondocontrolLogic.getTipoFondoControls(),this.tipofondocontrol,this.tipofondocontrolParameterGeneral,this.isEsNuevoTipoFondoControl,classes);//this.tipofondocontrolLogic.getTipoFondoControl()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoFondoControl(this.tipofondocontrolReturnGeneral,this.tipofondocontrolBean,false);
		
		if(this.tipofondocontrolReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoFondoControl(this.tipofondocontrolReturnGeneral.getTipoFondoControl());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoFondoControl(this.tipofondocontrolReturnGeneral.getTipoFondoControl());
		}
		
		if(this.tipofondocontrolReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoFondoControl(this.tipofondocontrolReturnGeneral.getTipoFondoControl(),classes);//this.tipofondocontrolBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoFondoControl(this.tipofondocontrol,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoFondoControl();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoFondoControl();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoFondoControl(false);
						
			if(tipofondocontrolSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoFondoControlJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFondoControl();
			}
			
			this.actualizarVisualTableDatosTipoFondoControl();
			
			this.jTableDatosTipoFondoControl.setRowSelectionInterval(this.getIndiceNuevoTipoFondoControl(), this.getIndiceNuevoTipoFondoControl());
			
			this.seleccionarFilaTablaTipoFondoControlActual();
						
			this.actualizarEstadoCeldasBotonesTipoFondoControl("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoFondoControl(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoFondoControl.jTextFieldcodigoTipoFondoControl.setEnabled(isHabilitar && this.tipofondocontrolConstantesFunciones.activarcodigoTipoFondoControl);
		this.jInternalFrameDetalleFormTipoFondoControl.jTextAreanombreTipoFondoControl.setEnabled(isHabilitar && this.tipofondocontrolConstantesFunciones.activarnombreTipoFondoControl);	
		
	};
	
	public void setDefaultControlesTipoFondoControl() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoFondoControl(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipofondocontrolSessionBean.setConGuardarRelaciones(true);			
			this.tipofondocontrolSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoFondoControl.jTabbedPaneRelacionesTipoFondoControl.setVisible(true);
			
					
		} else {
			//this.tipofondocontrolSessionBean.setConGuardarRelaciones(false);			
			this.tipofondocontrolSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoFondoControl.jTabbedPaneRelacionesTipoFondoControl.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoFondoControl() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFondoControl tipofondocontrolAux:this.tipofondocontrolLogic.getTipoFondoControls()) {
				if(tipofondocontrolAux.getId().equals(this.iIdNuevoTipoFondoControl)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFondoControl tipofondocontrolAux:this.tipofondocontrols) {
				if(tipofondocontrolAux.getId().equals(this.iIdNuevoTipoFondoControl)) {
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
	
	public int getIndiceActualTipoFondoControl(TipoFondoControl tipofondocontrol,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFondoControl tipofondocontrolAux:this.tipofondocontrolLogic.getTipoFondoControls()) {
				if(tipofondocontrolAux.getId().equals(tipofondocontrol.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFondoControl tipofondocontrolAux:this.tipofondocontrols) {
				if(tipofondocontrolAux.getId().equals(tipofondocontrol.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoFondoControl(TipoFondoControl tipofondocontrolOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFondoControl tipofondocontrolAux:this.tipofondocontrolLogic.getTipoFondoControls()) {
				if(tipofondocontrolAux.getTipoFondoControlOriginal().getId().equals(tipofondocontrolOriginal.getId())) {
					existe=true;
					tipofondocontrolOriginal.setId(tipofondocontrolAux.getId());
					tipofondocontrolOriginal.setVersionRow(tipofondocontrolAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFondoControl tipofondocontrolAux:this.tipofondocontrols) {
				if(tipofondocontrolAux.getTipoFondoControlOriginal().getId().equals(tipofondocontrolOriginal.getId())) {
					existe=true;
					tipofondocontrolOriginal.setId(tipofondocontrolAux.getId());
					tipofondocontrolOriginal.setVersionRow(tipofondocontrolAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoFondoControl(Boolean esParaCancelar) throws Exception {
		tipofondocontrolsAux=new ArrayList<TipoFondoControl>();
		tipofondocontrolAux=new TipoFondoControl();
		
		if(!this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoFondoControl tipofondocontrolAux:this.tipofondocontrolLogic.getTipoFondoControls()) {
					if(tipofondocontrolAux.getId()<0) {
						tipofondocontrolsAux.add(tipofondocontrolAux);
					}		
				}
				this.iIdNuevoTipoFondoControl=0L;
				this.tipofondocontrolLogic.getTipoFondoControls().removeAll(tipofondocontrolsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFondoControl tipofondocontrolAux:this.tipofondocontrols) {
					if(tipofondocontrolAux.getId()<0) {
						tipofondocontrolsAux.add(tipofondocontrolAux);
					}		
				}
				this.iIdNuevoTipoFondoControl=0L;
				this.tipofondocontrols.removeAll(tipofondocontrolsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoFondoControl 
					&& this.tipofondocontrolLogic.getTipoFondoControls().size()>0
					) {
					tipofondocontrolAux=this.tipofondocontrolLogic.getTipoFondoControls().get(this.tipofondocontrolLogic.getTipoFondoControls().size() - 1);
				
					if(tipofondocontrolAux.getId()<0) {
						this.tipofondocontrolLogic.getTipoFondoControls().remove(tipofondocontrolAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoFondoControl && this.tipofondocontrols.size()>0) {
					tipofondocontrolAux=this.tipofondocontrols.get(this.tipofondocontrols.size() - 1);
				
					if(tipofondocontrolAux.getId()<0) {
						this.tipofondocontrols.remove(tipofondocontrolAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoFondoControl(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipofondocontrol.getId()<0) {
				this.tipofondocontrolLogic.getTipoFondoControls().remove(this.tipofondocontrol);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipofondocontrol.getId()<0) {
				this.tipofondocontrols.remove(this.tipofondocontrol);
			}
		}			
	}
	
	public void setEstadosInicialesTipoFondoControl(List<TipoFondoControl> tipofondocontrolsAux) throws Exception {
		TipoFondoControlConstantesFunciones.setEstadosInicialesTipoFondoControl(tipofondocontrolsAux);
	}
	
	public void setEstadosInicialesTipoFondoControl(TipoFondoControl tipofondocontrolAux) throws Exception {
		TipoFondoControlConstantesFunciones.setEstadosInicialesTipoFondoControl(tipofondocontrolAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoFondoControlActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoFondoControl("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoFondoControlActual()) {
				if(!this.isEsNuevoTipoFondoControl) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoFondoControl("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoFondoControl=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoFondoControlActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Fondo Control ?", "MANTENIMIENTO DE Tipo Fondo Control", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoFondoControl("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoFondoControl tipofondocontrol) throws Exception {
		TipoFondoControlConstantesFunciones.seleccionarAsignar(this.tipofondocontrol,tipofondocontrol);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoFondoControl=this.isPermisoActualizarOriginalTipoFondoControl;
			
			
			this.seleccionarAsignar(tipofondocontrol);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoFondoControlConstantesFunciones.quitarEspaciosTipoFondoControl(this.tipofondocontrol,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoFondoControl("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipofondocontrolSessionBean.setsFuncionBusquedaRapida(this.tipofondocontrolSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoFondoControl) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoFondoControl(esParaCancelar);				
				this.cancelarNuevoTipoFondoControl(esParaCancelar);								
			}
			
			this.tipofondocontrol=new TipoFondoControl();
			
			this.inicializarTipoFondoControl();
			
			this.actualizarEstadoCeldasBotonesTipoFondoControl("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoFondoControl() throws Exception {
		try {
			TipoFondoControlConstantesFunciones.inicializarTipoFondoControl(this.tipofondocontrol);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipofondocontrolLogic.getTipoFondoControls().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoFondoControls(String sAccionBusqueda,List<TipoFondoControl> tipofondocontrolsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoFondoControl"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoFondoControlMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoFondoControlMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoFondoControl"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Fondo Controls");		
		parameters.put("busquedapor", TipoFondoControlConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoFondoControl=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoFondoControlConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoFondoControlConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoFondoControl=new JRBeanArrayDataSource(TipoFondoControlJInternalFrame.TraerTipoFondoControlBeans(tipofondocontrolsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoFondoControl);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoFondoControlConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoFondoControlConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoFondoControlBean.TraerTipoFondoControlBeans(tipofondocontrolsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoFondoControls(sAccionBusqueda,sTipoArchivoReporte,tipofondocontrolsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoFondoControls(sAccionBusqueda,sTipoArchivoReporte,tipofondocontrolsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoFondoControlActionPerformed(null);
					//this.generarExcelReporteTipoFondoControls(sAccionBusqueda,sTipoArchivoReporte,tipofondocontrolsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoFondoControls(sAccionBusqueda,sTipoArchivoReporte,tipofondocontrolsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoFondoControls(sAccionBusqueda,sTipoArchivoReporte,tipofondocontrolsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoFondoControls(sAccionBusqueda,sTipoArchivoReporte,tipofondocontrolsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoFondoControls(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFondoControl> tipofondocontrolsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofondocontrol";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFondoControls");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoFondoControl("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoFondoControl tipofondocontrol : tipofondocontrolsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoFondoControlConstantesFunciones.generarExcelReporteDataTipoFondoControl("NORMAL",row,workbook,tipofondocontrol,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Fondo Control",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoFondoControl(String sTipo,Row row,Workbook workbook) {
		
		TipoFondoControlConstantesFunciones.generarExcelReporteHeaderTipoFondoControl(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoFondoControls(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFondoControl> tipofondocontrolsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofondocontrol_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFondoControls");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoFondoControl tipofondocontrol : tipofondocontrolsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoFondoControlConstantesFunciones.getTipoFondoControlDescripcion(tipofondocontrol));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoFondoControlConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoFondoControlConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipofondocontrol.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoFondoControlConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoFondoControlConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipofondocontrol.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Fondo Control",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoFondoControls(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFondoControl> tipofondocontrolsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoFondoControl> tipofondocontrolsRespaldo=null;
		
		classes=TipoFondoControlConstantesFunciones.getClassesRelationshipsOfTipoFondoControl(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipofondocontrolLogic.setDatosCliente(this.datosCliente);
		this.tipofondocontrolLogic.setDatosDeep(this.datosDeep);
		this.tipofondocontrolLogic.setIsConDeep(true);
		
		tipofondocontrolsRespaldo=this.tipofondocontrolLogic.getTipoFondoControls();
		
		this.tipofondocontrolLogic.setTipoFondoControls(tipofondocontrolsParaReportes);	
		this.tipofondocontrolLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipofondocontrolsParaReportes=this.tipofondocontrolLogic.getTipoFondoControls();
		this.tipofondocontrolLogic.setTipoFondoControls(tipofondocontrolsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofondocontrol_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFondoControls");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoFondoControl("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoFondoControl tipofondocontrol : tipofondocontrolsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoFondoControl("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoFondoControlConstantesFunciones.generarExcelReporteDataTipoFondoControl("NORMAL",row,workbook,tipofondocontrol,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoFondoControlConstantesFunciones.getTipoFondoControlDescripcion(tipofondocontrol));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Fondo Control",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFondoControl.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFondoControl.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFondoControl.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFondoControl.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoFondoControl() throws Exception {		
		this.startProcessTipoFondoControl(true);
	}
	
	public void startProcessTipoFondoControl(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoFondoControl, this.jScrollPanelDatosTipoFondoControl,this.jPanelPaginacionTipoFondoControl, this.jScrollPanelDatosEdicionTipoFondoControl, this.jPanelAccionesTipoFondoControl,this.jPanelAccionesFormularioTipoFondoControl,this.jmenuBarTipoFondoControl,this.jmenuBarDetalleTipoFondoControl,this.jTtoolBarTipoFondoControl,this.jTtoolBarDetalleTipoFondoControl);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoFondoControl=null; 
		
		final JPanel jPanelParametrosReportesTipoFondoControl=this.jPanelParametrosReportesTipoFondoControl;
		//final JScrollPane jScrollPanelDatosTipoFondoControl=this.jScrollPanelDatosTipoFondoControl;
		final JTable jTableDatosTipoFondoControl=this.jTableDatosTipoFondoControl;		
		final JPanel jPanelPaginacionTipoFondoControl=this.jPanelPaginacionTipoFondoControl;
		//final JScrollPane jScrollPanelDatosEdicionTipoFondoControl=this.jScrollPanelDatosEdicionTipoFondoControl;
		final JPanel jPanelAccionesTipoFondoControl=this.jPanelAccionesTipoFondoControl;
		
		JPanel jPanelCamposAuxiliarTipoFondoControl=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoFondoControl=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) {
			jPanelCamposAuxiliarTipoFondoControl=this.jInternalFrameDetalleFormTipoFondoControl.jPanelCamposTipoFondoControl;
			jPanelAccionesFormularioAuxiliarTipoFondoControl=this.jInternalFrameDetalleFormTipoFondoControl.jPanelAccionesFormularioTipoFondoControl;
		}
		
		final JPanel jPanelCamposTipoFondoControl=jPanelCamposAuxiliarTipoFondoControl;
		final JPanel jPanelAccionesFormularioTipoFondoControl=jPanelAccionesFormularioAuxiliarTipoFondoControl;
		
		
		final JMenuBar jmenuBarTipoFondoControl=this.jmenuBarTipoFondoControl;
		final JToolBar jTtoolBarTipoFondoControl=this.jTtoolBarTipoFondoControl;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoFondoControl=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoFondoControl=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) {
			jmenuBarDetalleAuxiliarTipoFondoControl=this.jInternalFrameDetalleFormTipoFondoControl.jmenuBarDetalleTipoFondoControl;
			jTtoolBarDetalleAuxiliarTipoFondoControl=this.jInternalFrameDetalleFormTipoFondoControl.jTtoolBarDetalleTipoFondoControl;
		}
		
		final JMenuBar jmenuBarDetalleTipoFondoControl=jmenuBarDetalleAuxiliarTipoFondoControl;
		final JToolBar jTtoolBarDetalleTipoFondoControl=jTtoolBarDetalleAuxiliarTipoFondoControl;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoFondoControl;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoFondoControl;
			processRunnable.jTableDatos=jTableDatosTipoFondoControl;
			processRunnable.jPanelCampos=jPanelCamposTipoFondoControl;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoFondoControl;
			processRunnable.jPanelAcciones=jPanelAccionesTipoFondoControl;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoFondoControl;
			
			
			processRunnable.jmenuBar=jmenuBarTipoFondoControl;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoFondoControl;
			processRunnable.jTtoolBar=jTtoolBarTipoFondoControl;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoFondoControl;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoFondoControl ,jPanelParametrosReportesTipoFondoControl,jTableDatosTipoFondoControl, /*jScrollPanelDatosTipoFondoControl,*/jPanelCamposTipoFondoControl,jPanelPaginacionTipoFondoControl, /*jScrollPanelDatosEdicionTipoFondoControl,*/ jPanelAccionesTipoFondoControl,jPanelAccionesFormularioTipoFondoControl,jmenuBarTipoFondoControl,jmenuBarDetalleTipoFondoControl,jTtoolBarTipoFondoControl,jTtoolBarDetalleTipoFondoControl);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoFondoControl, jScrollPanelDatosTipoFondoControl,jPanelPaginacionTipoFondoControl, jScrollPanelDatosEdicionTipoFondoControl, jPanelAccionesTipoFondoControl,jPanelAccionesFormularioTipoFondoControl,jmenuBarTipoFondoControl,jmenuBarDetalleTipoFondoControl,jTtoolBarTipoFondoControl,jTtoolBarDetalleTipoFondoControl);
						
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
	
	public void finishProcessTipoFondoControl() {// throws Exception 
		this.finishProcessTipoFondoControl(true);
	}
	
	public void finishProcessTipoFondoControl(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoFondoControl, this.jScrollPanelDatosTipoFondoControl,this.jPanelPaginacionTipoFondoControl, this.jScrollPanelDatosEdicionTipoFondoControl, this.jPanelAccionesTipoFondoControl,this.jPanelAccionesFormularioTipoFondoControl,this.jmenuBarTipoFondoControl,this.jmenuBarDetalleTipoFondoControl,this.jTtoolBarTipoFondoControl,this.jTtoolBarDetalleTipoFondoControl);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoFondoControl=null; 
		
		final JPanel jPanelParametrosReportesTipoFondoControl=this.jPanelParametrosReportesTipoFondoControl;
		//final JScrollPane jScrollPanelDatosTipoFondoControl=this.jScrollPanelDatosTipoFondoControl;
		final JTable jTableDatosTipoFondoControl=this.jTableDatosTipoFondoControl;		
		final JPanel jPanelPaginacionTipoFondoControl=this.jPanelPaginacionTipoFondoControl;
		//final JScrollPane jScrollPanelDatosEdicionTipoFondoControl=this.jScrollPanelDatosEdicionTipoFondoControl;
		final JPanel jPanelAccionesTipoFondoControl=this.jPanelAccionesTipoFondoControl;
		
		JPanel jPanelCamposAuxiliarTipoFondoControl=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoFondoControl=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) {
			jPanelCamposAuxiliarTipoFondoControl=this.jInternalFrameDetalleFormTipoFondoControl.jPanelCamposTipoFondoControl;
			jPanelAccionesFormularioAuxiliarTipoFondoControl=this.jInternalFrameDetalleFormTipoFondoControl.jPanelAccionesFormularioTipoFondoControl;
		}
		
		final JPanel jPanelCamposTipoFondoControl=jPanelCamposAuxiliarTipoFondoControl;
		final JPanel jPanelAccionesFormularioTipoFondoControl=jPanelAccionesFormularioAuxiliarTipoFondoControl;
		
		
		final JMenuBar jmenuBarTipoFondoControl=this.jmenuBarTipoFondoControl;		
		final JToolBar jTtoolBarTipoFondoControl=this.jTtoolBarTipoFondoControl;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoFondoControl=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoFondoControl=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) {
			jmenuBarDetalleAuxiliarTipoFondoControl=this.jInternalFrameDetalleFormTipoFondoControl.jmenuBarDetalleTipoFondoControl;
			jTtoolBarDetalleAuxiliarTipoFondoControl=this.jInternalFrameDetalleFormTipoFondoControl.jTtoolBarDetalleTipoFondoControl;		
		}
		
		final JMenuBar jmenuBarDetalleTipoFondoControl=jmenuBarDetalleAuxiliarTipoFondoControl;
		final JToolBar jTtoolBarDetalleTipoFondoControl=jTtoolBarDetalleAuxiliarTipoFondoControl;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoFondoControl;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoFondoControl;
			processRunnable.jTableDatos=jTableDatosTipoFondoControl;
			processRunnable.jPanelCampos=jPanelCamposTipoFondoControl;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoFondoControl;
			processRunnable.jPanelAcciones=jPanelAccionesTipoFondoControl;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoFondoControl;
			
			
			processRunnable.jmenuBar=jmenuBarTipoFondoControl;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoFondoControl;
			processRunnable.jTtoolBar=jTtoolBarTipoFondoControl;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoFondoControl;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoFondoControl ,jPanelParametrosReportesTipoFondoControl, jTableDatosTipoFondoControl,/*jScrollPanelDatosTipoFondoControl,*/jPanelCamposTipoFondoControl,jPanelPaginacionTipoFondoControl, /*jScrollPanelDatosEdicionTipoFondoControl,*/ jPanelAccionesTipoFondoControl,jPanelAccionesFormularioTipoFondoControl,jmenuBarTipoFondoControl,jmenuBarDetalleTipoFondoControl,jTtoolBarTipoFondoControl,jTtoolBarDetalleTipoFondoControl));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoFondoControl(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoFondoControl(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoFondoControl(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoFondoControl(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoFondoControl,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoFondoControl,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoFondoControl(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoFondoControl,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoFondoControl,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipofondocontrolConstantesFunciones.getsFinalQueryTipoFondoControl();
		String  finalQueryPaginacionTodos=this.tipofondocontrolConstantesFunciones.getsFinalQueryTipoFondoControl();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoFondoControlConstantesFunciones.getArrayColumnasGlobalesNoTipoFondoControl(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoFondoControlConstantesFunciones.getArrayColumnasGlobalesTipoFondoControl(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoFondoControlConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipofondocontrolsEliminados= new ArrayList<TipoFondoControl>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoFondoControl();
		
				///*TipoFondoControlSessionBean*/this.tipofondocontrolSessionBean=new TipoFondoControlSessionBean();
			
			if(this.tipofondocontrolSessionBean==null) {
				this.tipofondocontrolSessionBean=new TipoFondoControlSessionBean();
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
					this.iNumeroPaginacion=TipoFondoControlConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoFondoControlConstantesFunciones.getClassesForeignKeysOfTipoFondoControl(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipofondocontrol."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipofondocontrolsAux= new ArrayList<TipoFondoControl>();
			
				
			tipofondocontrolLogic.setDatosCliente(this.datosCliente);
			tipofondocontrolLogic.setDatosDeep(this.datosDeep);
			tipofondocontrolLogic.setIsConDeep(true);
			
			
			tipofondocontrolLogic.getTipoFondoControlDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipofondocontrolLogic.getTodosTipoFondoControls(finalQueryGlobal,pagination);
					
					//tipofondocontrolLogic.getTodosTipoFondoControlsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipofondocontrolLogic.getTipoFondoControls()==null|| tipofondocontrolLogic.getTipoFondoControls().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipofondocontrolsAux= new ArrayList<TipoFondoControl>();
							tipofondocontrolsAux.addAll(tipofondocontrolLogic.getTipoFondoControls());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipofondocontrolsAux= new ArrayList<TipoFondoControl>();
							tipofondocontrolsAux.addAll(tipofondocontrols);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipofondocontrolLogic.getTodosTipoFondoControls(finalQueryGlobal+"",this.pagination);												
							
							//tipofondocontrolLogic.getTodosTipoFondoControlsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoFondoControls("Todos",tipofondocontrolLogic.getTipoFondoControls() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipofondocontrolLogic.setTipoFondoControls(new ArrayList<TipoFondoControl>());					
							tipofondocontrolLogic.getTipoFondoControls().addAll(tipofondocontrolsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipofondocontrols=new ArrayList<TipoFondoControl>();
							tipofondocontrols.addAll(tipofondocontrolsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoFondoControl=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoFondoControl=this.idActual;
				
				} else if(this.idTipoFondoControlActual!=null && this.idTipoFondoControlActual!=0L) {
					idTipoFondoControl=idTipoFondoControlActual;
				}
				
					
				this.sDetalleReporte=TipoFondoControlConstantesFunciones.getDetalleIndicePorId(idTipoFondoControl);
				
				this.tipofondocontrols=new ArrayList<TipoFondoControl>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipofondocontrolLogic.getEntity(idTipoFondoControl);
					
					//tipofondocontrolLogic.getEntityWithConnection(idTipoFondoControl);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipofondocontrolLogic.setTipoFondoControls(new ArrayList<TipoFondoControl>());
					tipofondocontrolLogic.getTipoFondoControls().add(tipofondocontrolLogic.getTipoFondoControl());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipofondocontrols=new ArrayList<TipoFondoControl>();
					this.tipofondocontrols.add(tipofondocontrol);
				}
				
				if(tipofondocontrolLogic.getTipoFondoControl()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoFondoControl();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoFondoControl();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipofondocontrolLogic.getTipoFondoControls().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipofondocontrols.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipofondocontrolLogic.getTipoFondoControls().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipofondocontrols.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoFondoControl tipofondocontrol) {
		Boolean permite=true;
		
		if(this.tipofondocontrol.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoFondoControlConstantesFunciones.getOrderByListaTipoFondoControl();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoFondoControlConstantesFunciones.getOrderByListaTipoFondoControl();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFondoControl tipofondocontrol:tipofondocontrolLogic.getTipoFondoControls()) {
				if(tipofondocontrol.getsType().equals(Constantes2.S_TOTALES)) {
					tipofondocontrolTotales=tipofondocontrol;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFondoControl tipofondocontrol:this.tipofondocontrols) {
				if(tipofondocontrol.getsType().equals(Constantes2.S_TOTALES)) {
					tipofondocontrolTotales=tipofondocontrol;
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
			this.tipofondocontrolAux=new TipoFondoControl();
			this.tipofondocontrolAux.setsType(Constantes2.S_TOTALES);
			this.tipofondocontrolAux.setIsNew(false);
			this.tipofondocontrolAux.setIsChanged(false);
			this.tipofondocontrolAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoFondoControlConstantesFunciones.TotalizarValoresFilaTipoFondoControl(this.tipofondocontrolLogic.getTipoFondoControls(),this.tipofondocontrolAux);
				
				this.tipofondocontrolLogic.getTipoFondoControls().add(this.tipofondocontrolAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoFondoControlConstantesFunciones.TotalizarValoresFilaTipoFondoControl(this.tipofondocontrols,this.tipofondocontrolAux);
				
				this.tipofondocontrols.add(this.tipofondocontrolAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipofondocontrolTotales=new TipoFondoControl();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipofondocontrolLogic.getTipoFondoControls().remove(tipofondocontrolTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipofondocontrols.remove(tipofondocontrolTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipofondocontrolTotales=new TipoFondoControl();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFondoControl tipofondocontrol:tipofondocontrolLogic.getTipoFondoControls()) {
				if(tipofondocontrol.getsType().equals(Constantes2.S_TOTALES)) {
					tipofondocontrolTotales=tipofondocontrol;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoFondoControlConstantesFunciones.TotalizarValoresFilaTipoFondoControl(this.tipofondocontrolLogic.getTipoFondoControls(),tipofondocontrolTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFondoControl tipofondocontrol:this.tipofondocontrols) {
				if(tipofondocontrol.getsType().equals(Constantes2.S_TOTALES)) {
					tipofondocontrolTotales=tipofondocontrol;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoFondoControlConstantesFunciones.TotalizarValoresFilaTipoFondoControl(this.tipofondocontrols,tipofondocontrolTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoFondoControl() {
		this.isPermisoTodoTipoFondoControl=false;
		this.isPermisoNuevoTipoFondoControl=false;
		this.isPermisoActualizarTipoFondoControl=false;
		this.isPermisoActualizarOriginalTipoFondoControl=false;
		this.isPermisoEliminarTipoFondoControl=false;
		this.isPermisoGuardarCambiosTipoFondoControl=false;
		this.isPermisoConsultaTipoFondoControl=false;
		this.isPermisoBusquedaTipoFondoControl=false;
		this.isPermisoReporteTipoFondoControl=false;		
		this.isPermisoOrdenTipoFondoControl=false;		
		this.isPermisoPaginacionMedioTipoFondoControl=false;		
		this.isPermisoPaginacionAltoTipoFondoControl=false;
		this.isPermisoPaginacionTodoTipoFondoControl=false;
		this.isPermisoCopiarTipoFondoControl=false;		
		this.isPermisoVerFormTipoFondoControl=false;		
		this.isPermisoDuplicarTipoFondoControl=false;		
		this.isPermisoOrdenTipoFondoControl=false;		
	}
	
	public void setPermisosUsuarioTipoFondoControl(Boolean isPermiso) {
		this.isPermisoTodoTipoFondoControl=isPermiso;
		this.isPermisoNuevoTipoFondoControl=isPermiso;
		this.isPermisoActualizarTipoFondoControl=isPermiso;
		this.isPermisoActualizarOriginalTipoFondoControl=isPermiso;
		this.isPermisoEliminarTipoFondoControl=isPermiso;
		this.isPermisoGuardarCambiosTipoFondoControl=isPermiso;
		this.isPermisoConsultaTipoFondoControl=isPermiso;
		this.isPermisoBusquedaTipoFondoControl=isPermiso;
		this.isPermisoReporteTipoFondoControl=isPermiso;
		this.isPermisoOrdenTipoFondoControl=isPermiso;		
		this.isPermisoPaginacionMedioTipoFondoControl=isPermiso;		
		this.isPermisoPaginacionAltoTipoFondoControl=isPermiso;		
		this.isPermisoPaginacionTodoTipoFondoControl=isPermiso;		
		this.isPermisoCopiarTipoFondoControl=isPermiso;		
		this.isPermisoVerFormTipoFondoControl=isPermiso;		
		this.isPermisoDuplicarTipoFondoControl=isPermiso;
		this.isPermisoOrdenTipoFondoControl=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoFondoControl(Boolean isPermiso) {
		//this.isPermisoTodoTipoFondoControl=isPermiso;
		this.isPermisoNuevoTipoFondoControl=isPermiso;
		this.isPermisoActualizarTipoFondoControl=isPermiso;
		this.isPermisoActualizarOriginalTipoFondoControl=isPermiso;
		this.isPermisoEliminarTipoFondoControl=isPermiso;
		this.isPermisoGuardarCambiosTipoFondoControl=isPermiso;
		//this.isPermisoConsultaTipoFondoControl=isPermiso;
		//this.isPermisoBusquedaTipoFondoControl=isPermiso;
		//this.isPermisoReporteTipoFondoControl=isPermiso;
		//this.isPermisoOrdenTipoFondoControl=isPermiso;		
		//this.isPermisoPaginacionMedioTipoFondoControl=isPermiso;		
		//this.isPermisoPaginacionAltoTipoFondoControl=isPermiso;		
		//this.isPermisoPaginacionTodoTipoFondoControl=isPermiso;		
		//this.isPermisoCopiarTipoFondoControl=isPermiso;		
		//this.isPermisoDuplicarTipoFondoControl=isPermiso;
		//this.isPermisoOrdenTipoFondoControl=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoFondoControlClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoFondoControlJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoFondoControl(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoFondoControlClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoFondoControlClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoFondoControlClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoFondoControlClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoFondoControl() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoFondoControlJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoFondoControlConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoFondoControl=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoFondoControl=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoFondoControl=this.isPermisoActualizarTipoFondoControl;
			this.isPermisoEliminarTipoFondoControl=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoFondoControl=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoFondoControl=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoFondoControl=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoFondoControl=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoFondoControl=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoFondoControl=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoFondoControl=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoFondoControl=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoFondoControl=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoFondoControl=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoFondoControl=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoFondoControl=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoFondoControl=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoFondoControl.setToolTipText(this.jTableDatosTipoFondoControl.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoFondoControl(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoFondoControl(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoFondoControlJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoFondoControlJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoFondoControl() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoFondoControlListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoFondoControlListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoFondoControlJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoFondoControlListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoFondoControlListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoFondoControl()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoFondoControl()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoFondoControl(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoFondoControl()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFondoControl();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoFondoControl(TipoFondoControl tipofondocontrol)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoFondoControl(TipoFondoControl tipofondocontrol,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoFondoControl()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFondoControl()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoFondoControl()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoFondoControl()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoFondoControl()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoFondoControl()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoFondoControl(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoFondoControl()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoFondoControlBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoFondoControlBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoFondoControlBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipofondocontrolSessionBean=new TipoFondoControlSessionBean(); 
		this.tipofondocontrolConstantesFunciones=new TipoFondoControlConstantesFunciones(); 
		this.tipofondocontrolBean=new TipoFondoControl();//(this.tipofondocontrolConstantesFunciones); 		
		this.tipofondocontrolReturnGeneral=new TipoFondoControlParameterReturnGeneral(); 
		
		this.tipofondocontrolSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipofondocontrolSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoFondoControlBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoFondoControlBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoFondoControlBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoFondoControl(true);
			
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
			
			this.tipofondocontrolConstantesFunciones=new TipoFondoControlConstantesFunciones(); 
			this.tipofondocontrolBean=new TipoFondoControl();//this.tipofondocontrolConstantesFunciones); 			
			this.tipofondocontrolReturnGeneral=new TipoFondoControlParameterReturnGeneral(); 
		
			TipoFondoControlBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Fondo Control Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipofondocontrol=new TipoFondoControl();
			this.tipofondocontrols = new ArrayList<TipoFondoControl>();
			this.tipofondocontrolsAux = new ArrayList<TipoFondoControl>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic=new TipoFondoControlLogic();
				this.tipofondocontrolLogic.getNewConnexionToDeep("");
			}
			
			//this.tipofondocontrolSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipofondocontrolSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoFondoControl);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoFondoControl!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoFondoControl);	
					}
					
					if(this.jInternalFrameImportacionTipoFondoControl!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoFondoControl);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoFondoControl!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoFondoControl);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoFondoControl!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoFondoControl);
				this.jInternalFrameDetalleFormTipoFondoControl.setVisible(false);
				this.jInternalFrameDetalleFormTipoFondoControl.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoFondoControl!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoFondoControl);
					this.jInternalFrameReporteDinamicoTipoFondoControl.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoFondoControl.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoFondoControl!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoFondoControl);
					this.jInternalFrameImportacionTipoFondoControl.setVisible(false);
					this.jInternalFrameImportacionTipoFondoControl.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoFondoControl!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoFondoControl);
					this.jInternalFrameOrderByTipoFondoControl.setVisible(false);
					this.jInternalFrameOrderByTipoFondoControl.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoFondoControlActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoFondoControlConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipofondocontrolReturnGeneral=new TipoFondoControlParameterReturnGeneral();
			
			this.tipofondocontrolParameterGeneral=new TipoFondoControlParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipofondocontrolLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoFondoControlJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoFondoControlConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipofondocontrolSessionBean.getEsGuardarRelacionado(),this.tipofondocontrolSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoFondoControlConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipofondocontrolSessionBean.getEsGuardarRelacionado(),this.tipofondocontrolSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoFondoControl=false;
			this.isVisibilidadCeldaDuplicarTipoFondoControl=true;
			this.isVisibilidadCeldaCopiarTipoFondoControl=true;
			this.isVisibilidadCeldaVerFormTipoFondoControl=true;
			this.isVisibilidadCeldaOrdenTipoFondoControl=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFondoControl=false;
			this.isVisibilidadCeldaModificarTipoFondoControl=false;
			this.isVisibilidadCeldaActualizarTipoFondoControl=false;
			this.isVisibilidadCeldaEliminarTipoFondoControl=false;
			this.isVisibilidadCeldaCancelarTipoFondoControl=false;
			this.isVisibilidadCeldaGuardarTipoFondoControl=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFondoControl=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoFondoControl("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoFondoControl();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoFondoControl(false);
			
			this.setPermisosUsuarioTipoFondoControl();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipofondocontrolSessionBean.getEsGuardarRelacionado() 
				|| (this.tipofondocontrolSessionBean.getEsGuardarRelacionado() && this.tipofondocontrolSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoFondoControlClasesRelacionadas();
			}
			
			if(this.tipofondocontrolSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoFondoControlClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoFondoControlJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoFondoControl();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoFondoControl();
			}
			
			if(!this.isPermisoBusquedaTipoFondoControl) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoFondoControl,this.isPermisoPaginacionMedioTipoFondoControl,this.isPermisoPaginacionTodoTipoFondoControl);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoFondoControlConstantesFunciones.getTiposSeleccionarTipoFondoControl());
				
				this.tiposColumnasSelect=TipoFondoControlConstantesFunciones.getTiposSeleccionarTipoFondoControl(true);
				
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
			//if(!this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoFondoControl();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoFondoControl(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoFondoControl(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFondoControl() ;
			
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
				tipofondocontrolImplementable= (TipoFondoControlImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoFondoControlConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipofondocontrolImplementableHome= (TipoFondoControlImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoFondoControlConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipofondocontrols= new ArrayList<TipoFondoControl>();
			this.tipofondocontrolsEliminados= new ArrayList<TipoFondoControl>();
						
			this.isEsNuevoTipoFondoControl=false;
			this.esParaAccionDesdeFormularioTipoFondoControl=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoFondoControl(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoFondoControl();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoFondoControlConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoFondoControl("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoFondoControl(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoFondoControl!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoFondoControl();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoFondoControl();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoFondoControl(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoFondoControl: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoFondoControl() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoFondoControl")) {
				iIndex=this.jInternalFrameDetalleFormTipoFondoControl.jTabbedPaneRelacionesTipoFondoControl.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoFondoControl.jTabbedPaneRelacionesTipoFondoControl.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoFondoControl.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoFondoControl();	
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
	
	public void cargarCombosForeignKeyTipoFondoControl(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoFondoControl(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoFondoControl(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoFondoControlListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoFondoControl();
		
		this.cargarCombosFrameForeignKeyTipoFondoControl();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoFondoControl();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoFondoControl();
		}
	}
	
	
	
	public void jButtonNuevoTipoFondoControlActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipofondocontrolSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoFondoControl==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
			
			
			if(jTableDatosTipoFondoControl.getRowCount()>=1) {
				jTableDatosTipoFondoControl.removeRowSelectionInterval(0, jTableDatosTipoFondoControl.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoFondoControl=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoFondoControl(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoFondoControl(true);			
			//this.tipofondocontrol=new TipoFondoControl();
			//this.tipofondocontrol.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFondoControl(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFondoControl() ;
			
			if(TipoFondoControlJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFondoControl(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipofondocontrol);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipofondocontrol);				
			
			TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
			
			if(this.tipofondocontrolSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoFondoControl: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoFondoControlActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoFondoControl> tipofondocontrolsSeleccionados=new ArrayList<TipoFondoControl>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoFondoControl.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoFondoControl.getSelectedRows().length;			
			}
			
			tipofondocontrolsSeleccionados=this.getTipoFondoControlsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoFondoControl--;			
				//TipoFondoControl tipofondocontrolAux= new TipoFondoControl();			
				//tipofondocontrolAux.setId(this.iIdNuevoTipoFondoControl);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoFondoControl tipofondocontrolOrigen=new TipoFondoControl();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoFondoControl tipofondocontrolOrigen : tipofondocontrolsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoFondoControl.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipofondocontrolOrigen =(TipoFondoControl) this.tipofondocontrolLogic.getTipoFondoControls().toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipofondocontrolOrigen =(TipoFondoControl) this.tipofondocontrols.toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoFondoControl();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipofondocontrol.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoFondoControl(tipofondocontrolOrigen,this.tipofondocontrol,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFondoControl(this.tipofondocontrol);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipofondocontrolLogic.getTipoFondoControls().add(this.tipofondocontrolAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipofondocontrols.add(this.tipofondocontrolAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoFondoControl(false);
				
				this.jTableDatosTipoFondoControl.setRowSelectionInterval(this.getIndiceNuevoTipoFondoControl(), this.getIndiceNuevoTipoFondoControl());
				
				int iLastRow =  this.jTableDatosTipoFondoControl.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoFondoControl.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoFondoControl.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFondoControl(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoFondoControlActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoFondoControl> tipofondocontrolsSeleccionados=new ArrayList<TipoFondoControl>();									
		
			TipoFondoControl tipofondocontrolOrigen=new TipoFondoControl();
			TipoFondoControl tipofondocontrolDestino=new TipoFondoControl();
				
			tipofondocontrolsSeleccionados=this.getTipoFondoControlsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoFondoControl.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipofondocontrolsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoFondoControl.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofondocontrolOrigen =(TipoFondoControl) this.tipofondocontrolLogic.getTipoFondoControls().toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipofondocontrolOrigen =(TipoFondoControl) this.tipofondocontrols.toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofondocontrolDestino =(TipoFondoControl) this.tipofondocontrolLogic.getTipoFondoControls().toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipofondocontrolDestino =(TipoFondoControl) this.tipofondocontrols.toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipofondocontrolOrigen =tipofondocontrolsSeleccionados.get(0);
				tipofondocontrolDestino =tipofondocontrolsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoFondoControl(tipofondocontrolOrigen,tipofondocontrolDestino,true,false);
				
				tipofondocontrolDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipofondocontrolDestino,tipofondocontrolLogic.getTipoFondoControls());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipofondocontrolDestino,tipofondocontrols);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoFondoControl(false);
				
				//this.jTableDatosTipoFondoControl.setRowSelectionInterval(this.getIndiceNuevoTipoFondoControl(), this.getIndiceNuevoTipoFondoControl());
				
				int iLastRow =  this.jTableDatosTipoFondoControl.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoFondoControl.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoFondoControl.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFondoControl(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoFondoControlActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoFondoControl==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoFondoControl.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoFondoControlActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoFondoControl.isVisible();
			
			
			this.jPanelParametrosReportesTipoFondoControl.setVisible(!isVisible);
			this.jPanelPaginacionTipoFondoControl.setVisible(!isVisible);
			this.jPanelAccionesTipoFondoControl.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoFondoControlActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoFondoControl();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoFondoControlActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoFondoControl();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoFondoControlActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoFondoControl();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoFondoControlActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoFondoControl();
			
			this.abrirFrameOrderByTipoFondoControl();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoFondoControlActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoFondoControl();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoFondoControl(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoFondoControl);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoFondoControl.isMaximum()) {
					this.jInternalFrameDetalleFormTipoFondoControl.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoFondoControl.setSize(this.jInternalFrameDetalleFormTipoFondoControl.iWidthFormulario,this.jInternalFrameDetalleFormTipoFondoControl.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoFondoControl.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoFondoControl.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoFondoControl.isMaximum()) {
						this.jInternalFrameDetalleFormTipoFondoControl.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoFondoControl.jContentPaneDetalleTipoFondoControl.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoFondoControl.jTabbedPaneRelacionesTipoFondoControl.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoFondoControl.jContentPaneDetalleTipoFondoControl.getWidth(),TipoFondoControlConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoFondoControl.jTabbedPaneRelacionesTipoFondoControl.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoFondoControl.jContentPaneDetalleTipoFondoControl.getWidth(),TipoFondoControlConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoFondoControl.jTabbedPaneRelacionesTipoFondoControl.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoFondoControl.jContentPaneDetalleTipoFondoControl.getWidth(),TipoFondoControlConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoFondoControl.setVisible(true);
	        this.jInternalFrameDetalleFormTipoFondoControl.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoFondoControl() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoFondoControl==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoFondoControl=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFondoControl,false,this);
				} else {
					this.jInternalFrameOrderByTipoFondoControl=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFondoControl,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoFondoControl);
				this.jInternalFrameOrderByTipoFondoControl.setVisible(false);
				this.jInternalFrameOrderByTipoFondoControl.setSelected(false);
				
				this.jInternalFrameOrderByTipoFondoControl.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoFondoControl"));
				
				this.inicializarActualizarBindingTablaOrderByTipoFondoControl();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoFondoControl() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoFondoControl==null) {
				
				this.jInternalFrameImportacionTipoFondoControl=new ImportacionJInternalFrame(TipoFondoControlConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoFondoControl);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoFondoControl);
				this.jInternalFrameImportacionTipoFondoControl.setVisible(false);
				this.jInternalFrameImportacionTipoFondoControl.setSelected(false);


				this.jInternalFrameImportacionTipoFondoControl.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoFondoControl"));
				this.jInternalFrameImportacionTipoFondoControl.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoFondoControl"));
				this.jInternalFrameImportacionTipoFondoControl.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoFondoControl"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoFondoControl() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoFondoControl==null) {
				this.jInternalFrameReporteDinamicoTipoFondoControl=new ReporteDinamicoJInternalFrame(TipoFondoControlConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoFondoControl);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoFondoControl);
				this.jInternalFrameReporteDinamicoTipoFondoControl.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoFondoControl.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoFondoControl.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFondoControl"));
				this.jInternalFrameReporteDinamicoTipoFondoControl.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFondoControl"));
				this.jInternalFrameReporteDinamicoTipoFondoControl.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFondoControl"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFondoControl();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoFondoControl() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoFondoControl);
			
	       	this.jInternalFrameDetalleFormTipoFondoControl.setVisible(false);
	        this.jInternalFrameDetalleFormTipoFondoControl.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoFondoControl.dispose();
			//this.jInternalFrameDetalleFormTipoFondoControl=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoFondoControl() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoFondoControl.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoFondoControl.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoFondoControl() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoFondoControl.setVisible(true);
	        this.jInternalFrameImportacionTipoFondoControl.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoFondoControl() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoFondoControl.setVisible(true);
	        this.jInternalFrameOrderByTipoFondoControl.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoFondoControl() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoFondoControl.setVisible(false);
	        this.jInternalFrameOrderByTipoFondoControl.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoFondoControl() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoFondoControl.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoFondoControl.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoFondoControl() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoFondoControl.setVisible(false);
	        this.jInternalFrameImportacionTipoFondoControl.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoFondoControlActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoFondoControl(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoFondoControl(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoFondoControl.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoFondoControl(true);
			//this.isEsNuevoTipoFondoControl=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrolLogic.getTipoFondoControls().toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrols.toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoFondoControl("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFondoControl(false) ;
			
			if(tipofondocontrolSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoFondoControlJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFondoControl(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFondoControl(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoFondoControlActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoFondoControl.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrolLogic.getTipoFondoControls().toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrols.toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoFondoControl(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoFondoControl==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoFondoControl.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoFondoControl(true);
			//this.isEsNuevoTipoFondoControl=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrolLogic.getTipoFondoControls().toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrols.toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipofondocontrol.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoFondoControl("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoFondoControl(false) ;
			
			if(TipoFondoControlJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFondoControl(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFondoControl(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoFondoControlActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoFondoControl(false);
			
			//if(!this.isEsNuevoTipoFondoControl) {								
				int intSelectedRow = this.jTableDatosTipoFondoControl.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrolLogic.getTipoFondoControls().toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrols.toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoFondoControlJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoFondoControl(this.tipofondocontrol,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFondoControl(this.tipofondocontrol);
				
			}
			
			if(this.permiteMantenimiento(this.tipofondocontrol)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoFondoControl=true;
					this.inicializarActualizarBindingTablaTipoFondoControl(false);
					this.isEsNuevoTipoFondoControl=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoFondoControl=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoFondoControl=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoFondoControl(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFondoControl(false);
				
				this.habilitarDeshabilitarControlesTipoFondoControl(false);
			
												
				
				if(TipoFondoControlJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoFondoControl();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoFondoControlActionPerformed(evt,tipofondocontrolSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoFondoControl(this.tipofondocontrol,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoFondoControl.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipofondocontrolSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipofondocontrol.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoFondoControl.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFondoControl.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoFondoControlActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoFondoControl.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrolLogic.getTipoFondoControls().toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
				this.tipofondocontrol.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrols.toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
				this.tipofondocontrol.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipofondocontrol)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoFondoControlModel) this.jTableDatosTipoFondoControl.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoFondoControl=true;
				this.inicializarActualizarBindingTablaTipoFondoControl(false);
				this.isEsNuevoTipoFondoControl=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoFondoControl(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFondoControl(false);
				
				this.habilitarDeshabilitarControlesTipoFondoControl(false);
				
				
				
				if(TipoFondoControlJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoFondoControl();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoFondoControlActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoFondoControl.getRowCount()>=1) {
				jTableDatosTipoFondoControl.removeRowSelectionInterval(0, jTableDatosTipoFondoControl.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoFondoControl(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoFondoControl(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFondoControl(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFondoControl(false) ;
			
			this.isEsNuevoTipoFondoControl=false;
			
			if(TipoFondoControlJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoFondoControl();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoFondoControlActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoFondoControl(false);
				
				//SI ES MANUAL
				if(TipoFondoControlJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoFondoControl();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoFondoControlActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoFondoControl--;			
			//TipoFondoControl tipofondocontrolAux= new TipoFondoControl();			
			//tipofondocontrolAux.setId(this.iIdNuevoTipoFondoControl);
			
			if(this.jInternalFrameDetalleFormTipoFondoControl==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoFondoControl();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoFondoControl(this.tipofondocontrol);
			
			this.tipofondocontrol.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipofondocontrolLogic.getTipoFondoControls().add(this.tipofondocontrolAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipofondocontrols.add(this.tipofondocontrolAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoFondoControl(false);
			
			this.jTableDatosTipoFondoControl.setRowSelectionInterval(this.getIndiceNuevoTipoFondoControl(), this.getIndiceNuevoTipoFondoControl());
			
			int iLastRow =  this.jTableDatosTipoFondoControl.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoFondoControl.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoFondoControl.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoFondoControl(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoFondoControlActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoFondoControl(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFondoControl(false);
			
			//SI ES MANUAL
			if(TipoFondoControlJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFondoControl();
			}
			
			//this.abrirFrameTreeTipoFondoControl();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoFondoControlActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Fondo ControlS ?", "MANTENIMIENTO DE Tipo Fondo Control", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoFondoControl.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoFondoControl();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipofondocontrolReturnGeneral=tipofondocontrolLogic.procesarImportacionTipoFondoControlsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipofondocontrolParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoFondoControlReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoFondoControlActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoFondoControl.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoFondoControl.setFileImportacion(this.jInternalFrameImportacionTipoFondoControl.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoFondoControl.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoFondoControl.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoFondoControl.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoFondoControl.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoFondoControlActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoFondoControl> tipofondocontrolsSeleccionados=new ArrayList<TipoFondoControl>();		

		tipofondocontrolsSeleccionados=this.getTipoFondoControlsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFondoControl.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFondoControl.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoFondoControlBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoFondoControlBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoFondoControls("Todos",tipofondocontrolsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Fondo Control",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFondoControl.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFondoControl.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoFondoControlConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoFondoControlConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoFondoControl.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoFondoControl.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoFondoControl.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoFondoControlConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoFondoControlConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoFondoControl.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoFondoControlConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoFondoControlConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoFondoControl.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFondoControl.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoFondoControlConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoFondoControlConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoFondoControlActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoFondoControl> tipofondocontrolsSeleccionados=new ArrayList<TipoFondoControl>();		
		
		tipofondocontrolsSeleccionados=this.getTipoFondoControlsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofondocontrol";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoFondoControls");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoFondoControl.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFondoControl.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoFondoControlConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoFondoControlConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoFondoControl tipofondocontrol:tipofondocontrolsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipofondocontrol.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoFondoControlConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoFondoControlConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoFondoControl tipofondocontrol:tipofondocontrolsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipofondocontrol.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoFondoControl(row);				
			//	iRow++;
			//}				
			
			//for(TipoFondoControl tipofondocontrolAux:tipofondocontrolsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoFondoControl(tipofondocontrolAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Fondo Control",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipofondocontrolLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFondoControl(false);
			
			//SI ES MANUAL
			if(TipoFondoControlJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFondoControl();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoFondoControlActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFondoControl(false);
			
			//SI ES MANUAL
			if(TipoFondoControlJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoFondoControl();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoFondoControlActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFondoControl(false);
			
			//SI ES MANUAL
			if(TipoFondoControlJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoFondoControl();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondocontrolLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoFondoControl() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoFondoControl.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoFondoControl.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoFondoControl.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoFondoControl.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoFondoControl.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoFondoControl.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoFondoControl.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoFondoControl(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoFondoControl(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoFondoControl(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoFondoControl(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoFondoControl(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoFondoControl(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFondoControl(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoFondoControl(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoFondoControlJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoFondoControlJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoFondoControl() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoFondoControl();
		
		this.inicializarActualizarBindingBotonesManualTipoFondoControl(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoFondoControl();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFondoControl() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFondoControl(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFondoControl(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoFondoControl.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoFondoControl.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoFondoControl.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoFondoControl!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoFondoControl.jCheckBoxPostAccionNuevoTipoFondoControl.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoFondoControl.jCheckBoxPostAccionSinCerrarTipoFondoControl.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoFondoControl.jCheckBoxPostAccionSinMensajeTipoFondoControl.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoFondoControl.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoFondoControl.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoFondoControl.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoFondoControl!=null) {
				this.jInternalFrameDetalleFormTipoFondoControl.jCheckBoxPostAccionNuevoTipoFondoControl.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoFondoControl.jCheckBoxPostAccionSinCerrarTipoFondoControl.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoFondoControl.jCheckBoxPostAccionSinMensajeTipoFondoControl.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoFondoControl.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoFondoControl.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoFondoControl!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoFondoControl.jComboBoxTiposAccionesFormularioTipoFondoControl.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoFondoControl.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoFondoControl!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFondoControl.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoFondoControl.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoFondoControl.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoFondoControl.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoFondoControl.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoFondoControl!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFondoControl.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoFondoControl.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoFondoControl.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoFondoControl(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoFondoControlJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFondoControl(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoFondoControl() throws Exception {
		try	{
			if(TipoFondoControlJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoFondoControl();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoFondoControl() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoFondoControl.jComboBoxTiposAccionesFormularioTipoFondoControl.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoFondoControl.jComboBoxTiposAccionesFormularioTipoFondoControl.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoFondoControl() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoFondoControl.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoFondoControl.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoFondoControl.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoFondoControl.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoFondoControl.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoFondoControl.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoFondoControl.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoFondoControl.addItem(reporte);
			}
			
			
			if(!this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoFondoControl.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoFondoControl.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoFondoControl.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoFondoControl.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoFondoControl.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoFondoControl.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoFondoControl!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoFondoControl.jComboBoxTiposAccionesFormularioTipoFondoControl.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoFondoControl.jComboBoxTiposAccionesFormularioTipoFondoControl.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoFondoControl.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoFondoControl.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoFondoControl.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFondoControl();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFondoControl() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoFondoControl!=null) {
				this.jInternalFrameReporteDinamicoTipoFondoControl.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoFondoControl.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoFondoControl!=null) {
				this.jInternalFrameReporteDinamicoTipoFondoControl.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoFondoControl.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoFondoControl!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoFondoControl.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoFondoControl.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoFondoControl.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoFondoControl.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoFondoControl.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoFondoControl.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoFondoControl()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoFondoControl(Boolean esInicializar) throws Exception {				
		if(TipoFondoControlJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoFondoControl();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoFondoControl() throws Exception {
		this.inicializarActualizarBindingTablaTipoFondoControl(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoFondoControl() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoFondoControl.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoFondoControl.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFondoControl.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoFondoControlPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoFondoControl.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFondoControl.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoFondoControlPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoFondoControlOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFondoControlOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoFondoControlPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoFondoControl.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFondoControl.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoFondoControlPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoFondoControl.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoFondoControl(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipofondocontrolLogic.getTipoFondoControls().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipofondocontrols.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoFondoControlJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoFondoControl.setModel(new TipoFondoControlModel(this.tipofondocontrolLogic.getTipoFondoControls(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoFondoControl.setModel(new TipoFondoControlModel(this.tipofondocontrols,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoFondoControl!=null && this.jInternalFrameOrderByTipoFondoControl.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoFondoControl();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoFondoControl.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFondoControl,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoFondoControlPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO,tipofondocontrolConstantesFunciones.resaltarSeleccionarTipoFondoControl,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO,tipofondocontrolConstantesFunciones.resaltarSeleccionarTipoFondoControl,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoFondoControl.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFondoControl,TipoFondoControlConstantesFunciones.LABEL_ID));

		if(this.tipofondocontrolConstantesFunciones.mostraridTipoFondoControl && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFondoControlConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipofondocontrolConstantesFunciones.resaltaridTipoFondoControl,this.tipofondocontrolConstantesFunciones.activaridTipoFondoControl,this,true,"idTipoFondoControl","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipofondocontrolConstantesFunciones.resaltaridTipoFondoControl,this.tipofondocontrolConstantesFunciones.activaridTipoFondoControl,this,true,"idTipoFondoControl","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoFondoControl.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFondoControl,TipoFondoControlConstantesFunciones.LABEL_CODIGO));

		if(this.tipofondocontrolConstantesFunciones.mostrarcodigoTipoFondoControl && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFondoControlConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipofondocontrolConstantesFunciones.resaltarcodigoTipoFondoControl,this.tipofondocontrolConstantesFunciones.activarcodigoTipoFondoControl,this,true,"codigoTipoFondoControl","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipofondocontrolConstantesFunciones.resaltarcodigoTipoFondoControl,this.tipofondocontrolConstantesFunciones.activarcodigoTipoFondoControl,this,true,"codigoTipoFondoControl","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoFondoControlPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoFondoControl.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFondoControl,TipoFondoControlConstantesFunciones.LABEL_NOMBRE));

		if(this.tipofondocontrolConstantesFunciones.mostrarnombreTipoFondoControl && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFondoControlConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipofondocontrolConstantesFunciones.resaltarnombreTipoFondoControl,this.tipofondocontrolConstantesFunciones.activarnombreTipoFondoControl,this,true,"nombreTipoFondoControl","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipofondocontrolConstantesFunciones.resaltarnombreTipoFondoControl,this.tipofondocontrolConstantesFunciones.activarnombreTipoFondoControl,this,true,"nombreTipoFondoControl","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoFondoControlPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipofondocontrolSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipofondocontrolSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipofondocontrolSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoFondoControl.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipofondocontrolSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipofondocontrolSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoFondoControl.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoFondoControl && this.isPermisoGuardarCambiosTipoFondoControl) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipofondocontrolSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipofondocontrolSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoFondoControl.addColumn(tableColumn);
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
			
			this.jTableDatosTipoFondoControl.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoFondoControl && this.isPermisoGuardarCambiosTipoFondoControl) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoFondoControl && this.isPermisoGuardarCambiosTipoFondoControl) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoFondoControl.moveColumn(this.jTableDatosTipoFondoControl.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoFondoControl.moveColumn(this.jTableDatosTipoFondoControl.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoFondoControl.moveColumn(this.jTableDatosTipoFondoControl.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoFondoControl.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoFondoControl.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoFondoControl,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoFondoControlJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoFondoControl.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoFondoControl.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoFondoControlJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoFondoControlJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoFondoControl.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoFondoControl.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoFondoControl.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipofondocontrolLogic.getTipoFondoControls().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipofondocontrols.size()-1;
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
		//this.jTableDatosTipoFondoControl.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoFondoControl.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoFondoControl();
			
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
				
				//this.isEsNuevoTipoFondoControl=false;
					
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
			
				if(this.tipofondocontrolSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoFondoControl==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoFondoControl.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoFondoControl.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrolLogic.getTipoFondoControls().toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrols.toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipofondocontrol.getsType().equals("DUPLICADO")
				   || this.tipofondocontrol.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoFondoControl=true;
				
				} else {
					this.isEsNuevoTipoFondoControl=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
					if(this.tipofondocontrol.getId()>=0 && !this.tipofondocontrol.getIsNew()) {						
						this.isEsNuevoTipoFondoControl=false;
						
					} else {
						this.isEsNuevoTipoFondoControl=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoFondoControl(esRelaciones);						
				
				this.seleccionarTipoFondoControl(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipofondocontrol.getId()<0) {
					this.isEsNuevoTipoFondoControl=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoFondoControl(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoFondoControl(evt,rowIndex);
				}	
				
				if(this.tipofondocontrolSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoFondoControl: " + this.dDif); 
					}
				}								
				
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoFondoControl(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipofondocontrol)) {
					if(this.tipofondocontrol.getId()>0) {
						this.tipofondocontrol.setIsDeleted(true);
						
						this.tipofondocontrolsEliminados.add(this.tipofondocontrol);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipofondocontrolLogic.getTipoFondoControls().remove(this.tipofondocontrol);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipofondocontrols.remove(this.tipofondocontrol);				
					}
					
					
					((TipoFondoControlModel) this.jTableDatosTipoFondoControl.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFondoControl(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoFondoControl(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoFondoControl) {
			
			if(this.jInternalFrameDetalleFormTipoFondoControl==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoFondoControl.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoFondoControl.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrolLogic.getTipoFondoControls().toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrols.toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoFondoControlJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoFondoControl(this.tipofondocontrol);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoFondoControl("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoFondoControl(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFondoControl() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoFondoControl(TipoFondoControl tipofondocontrol) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoFondoControl(tipofondocontrol,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoFondoControl(TipoFondoControl tipofondocontrol,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoFondoControl(tipofondocontrol);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoFondoControl(tipofondocontrol,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoFondoControl(tipofondocontrol);
	}
	
	public void setVariablesObjetoActualToFormularioTipoFondoControl(TipoFondoControl tipofondocontrol) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoFondoControl==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoFondoControl.jTextFieldidTipoFondoControl.setText(tipofondocontrol.getId().toString());
			this.jInternalFrameDetalleFormTipoFondoControl.jTextFieldcodigoTipoFondoControl.setText(tipofondocontrol.getcodigo());
			this.jInternalFrameDetalleFormTipoFondoControl.jTextAreanombreTipoFondoControl.setText(tipofondocontrol.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoFondoControl tipofondocontrolLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipofondocontrolLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoFondoControl tipofondocontrolLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipofondocontrolLocal=this.tipofondocontrol;
			} else {
				tipofondocontrolLocal=this.tipofondocontrolAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipofondocontrolLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoFondoControl(tipofondocontrolLocal,true);
					
					if(tipofondocontrolSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipofondocontrolLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipofondocontrolLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoFondoControl(TipoFondoControl tipofondocontrol,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoFondoControl(tipofondocontrol,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoFondoControl(tipofondocontrol);
	}
	
	public void setVariablesFormularioToObjetoActualTipoFondoControl(TipoFondoControl tipofondocontrol,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoFondoControl(tipofondocontrol,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoFondoControl(TipoFondoControl tipofondocontrol,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoFondoControl==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoFondoControl.jTextFieldidTipoFondoControl.getText()==null || this.jInternalFrameDetalleFormTipoFondoControl.jTextFieldidTipoFondoControl.getText()=="" || this.jInternalFrameDetalleFormTipoFondoControl.jTextFieldidTipoFondoControl.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoFondoControl.jTextFieldidTipoFondoControl.setText("0");
			}

			if(conColumnasBase) {tipofondocontrol.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoFondoControl.jTextFieldidTipoFondoControl.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFondoControlConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFondoControl.jLabelIdTipoFondoControl,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipofondocontrol.setcodigo(this.jInternalFrameDetalleFormTipoFondoControl.jTextFieldcodigoTipoFondoControl.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFondoControlConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFondoControl.jLabelcodigoTipoFondoControl,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipofondocontrol.setnombre(this.jInternalFrameDetalleFormTipoFondoControl.jTextAreanombreTipoFondoControl.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFondoControlConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFondoControl.jLabelnombreTipoFondoControl,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoFondoControl(TipoFondoControl tipofondocontrolBean,TipoFondoControl tipofondocontrol,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoFondoControl(TipoFondoControl tipofondocontrolOrigen,TipoFondoControl tipofondocontrol,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipofondocontrolOrigen.getId()!=null && !tipofondocontrolOrigen.getId().equals(0L))) {tipofondocontrol.setId(tipofondocontrolOrigen.getId());}}
			if(conDefault || (!conDefault && tipofondocontrolOrigen.getcodigo()!=null && !tipofondocontrolOrigen.getcodigo().equals(""))) {tipofondocontrol.setcodigo(tipofondocontrolOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipofondocontrolOrigen.getnombre()!=null && !tipofondocontrolOrigen.getnombre().equals(""))) {tipofondocontrol.setnombre(tipofondocontrolOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoFondoControl(TipoFondoControl tipofondocontrol) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoFondoControl.jTextFieldidTipoFondoControl.setText(tipofondocontrol.getId().toString());
			this.jInternalFrameDetalleFormTipoFondoControl.jTextFieldcodigoTipoFondoControl.setText(tipofondocontrol.getcodigo());
			this.jInternalFrameDetalleFormTipoFondoControl.jTextAreanombreTipoFondoControl.setText(tipofondocontrol.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoFondoControl(TipoFondoControlBean tipofondocontrolBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoFondoControl.jTextFieldidTipoFondoControl.setText(tipofondocontrolBean.getId().toString());
			this.jInternalFrameDetalleFormTipoFondoControl.jTextFieldcodigoTipoFondoControl.setText(tipofondocontrolBean.getcodigo());
			this.jInternalFrameDetalleFormTipoFondoControl.jTextAreanombreTipoFondoControl.setText(tipofondocontrolBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoFondoControl(TipoFondoControlParameterReturnGeneral tipofondocontrolReturnGeneral,TipoFondoControlBean tipofondocontrolBean,Boolean conDefault) throws Exception { 
		try {
			TipoFondoControl tipofondocontrolLocal=new TipoFondoControl();
			
			tipofondocontrolLocal=tipofondocontrolReturnGeneral.getTipoFondoControl();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipofondocontrolLocal.getId()!=null && !tipofondocontrolLocal.getId().equals(0L))) {tipofondocontrolBean.setId(tipofondocontrolLocal.getId());}}
			if(conDefault || (!conDefault && tipofondocontrolLocal.getcodigo()!=null && !tipofondocontrolLocal.getcodigo().equals(""))) {tipofondocontrolBean.setcodigo(tipofondocontrolLocal.getcodigo());}
			if(conDefault || (!conDefault && tipofondocontrolLocal.getnombre()!=null && !tipofondocontrolLocal.getnombre().equals(""))) {tipofondocontrolBean.setnombre(tipofondocontrolLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoFondoControlGenerico(Long idTipoFondoControlSeleccionado,JComboBox jComboBoxTipoFondoControl,List<TipoFondoControl> tipofondocontrolsLocal)throws Exception {
		try {
			TipoFondoControl  tipofondocontrolTemp=null;

			for(TipoFondoControl tipofondocontrolAux:tipofondocontrolsLocal) {
				if(tipofondocontrolAux.getId()!=null && tipofondocontrolAux.getId().equals(idTipoFondoControlSeleccionado)) {
					tipofondocontrolTemp=tipofondocontrolAux;
					break;
				}
			}

			jComboBoxTipoFondoControl.setSelectedItem(tipofondocontrolTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoFondoControlGenerico(JComboBox jComboBoxTipoFondoControl,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoFondoControl.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoFondoControl.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoFondoControl.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoFondoControl.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoFondoControl.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoFondoControl.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoFondoControl.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoFondoControl.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoFondoControl.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoFondoControl.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipofondocontrol=(TipoFondoControl) tipofondocontrolLogic.getTipoFondoControls().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipofondocontrol =(TipoFondoControl) tipofondocontrols.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoFondoControl tipofondocontrolRow=new TipoFondoControl();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipofondocontrolRow=(TipoFondoControl) tipofondocontrolLogic.getTipoFondoControls().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipofondocontrolRow=(TipoFondoControl) tipofondocontrols.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoFondoControl(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoFondoControl.setVisible((this.isVisibilidadCeldaNuevoTipoFondoControl && this.isPermisoNuevoTipoFondoControl));			
			this.jButtonDuplicarTipoFondoControl.setVisible((this.isVisibilidadCeldaDuplicarTipoFondoControl && this.isPermisoDuplicarTipoFondoControl));			
			this.jButtonCopiarTipoFondoControl.setVisible((this.isVisibilidadCeldaCopiarTipoFondoControl && this.isPermisoCopiarTipoFondoControl));
			this.jButtonVerFormTipoFondoControl.setVisible((this.isVisibilidadCeldaVerFormTipoFondoControl && this.isPermisoVerFormTipoFondoControl));
			
			this.jButtonAbrirOrderByTipoFondoControl.setVisible((this.isVisibilidadCeldaOrdenTipoFondoControl && this.isPermisoOrdenTipoFondoControl));			
			
			this.jButtonNuevoRelacionesTipoFondoControl.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFondoControl && this.isPermisoNuevoTipoFondoControl));			
			this.jButtonNuevoGuardarCambiosTipoFondoControl.setVisible((this.isVisibilidadCeldaNuevoTipoFondoControl && this.isPermisoNuevoTipoFondoControl && this.isPermisoGuardarCambiosTipoFondoControl));
			
			if(this.jInternalFrameDetalleFormTipoFondoControl!=null) {
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonModificarTipoFondoControl.setVisible((this.isVisibilidadCeldaModificarTipoFondoControl && this.isPermisoActualizarTipoFondoControl));	
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonActualizarTipoFondoControl.setVisible((this.isVisibilidadCeldaActualizarTipoFondoControl && this.isPermisoActualizarTipoFondoControl));	
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonEliminarTipoFondoControl.setVisible((this.isVisibilidadCeldaEliminarTipoFondoControl && this.isPermisoEliminarTipoFondoControl));
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonCancelarTipoFondoControl.setVisible(this.isVisibilidadCeldaCancelarTipoFondoControl);							
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonGuardarCambiosTipoFondoControl.setVisible((this.isVisibilidadCeldaGuardarTipoFondoControl && this.isPermisoGuardarCambiosTipoFondoControl));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoFondoControl.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFondoControl && this.isPermisoGuardarCambiosTipoFondoControl));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoFondoControl.setVisible((this.isVisibilidadCeldaNuevoTipoFondoControl && this.isPermisoNuevoTipoFondoControl));						
			this.jButtonDuplicarToolBarTipoFondoControl.setVisible((this.isVisibilidadCeldaDuplicarTipoFondoControl && this.isPermisoDuplicarTipoFondoControl));						
			this.jButtonCopiarToolBarTipoFondoControl.setVisible((this.isVisibilidadCeldaCopiarTipoFondoControl && this.isPermisoCopiarTipoFondoControl));			
			this.jButtonVerFormToolBarTipoFondoControl.setVisible((this.isVisibilidadCeldaVerFormTipoFondoControl && this.isPermisoVerFormTipoFondoControl));			
			this.jButtonAbrirOrderByToolBarTipoFondoControl.setVisible((this.isVisibilidadCeldaOrdenTipoFondoControl && this.isPermisoOrdenTipoFondoControl));
			this.jButtonNuevoRelacionesToolBarTipoFondoControl.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFondoControl && this.isPermisoNuevoTipoFondoControl));			
			this.jButtonNuevoGuardarCambiosToolBarTipoFondoControl.setVisible((this.isVisibilidadCeldaNuevoTipoFondoControl && this.isPermisoNuevoTipoFondoControl && this.isPermisoGuardarCambiosTipoFondoControl));			
			
			if(this.jInternalFrameDetalleFormTipoFondoControl!=null) {
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonModificarToolBarTipoFondoControl.setVisible((this.isVisibilidadCeldaModificarTipoFondoControl && this.isPermisoActualizarTipoFondoControl));	
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonActualizarToolBarTipoFondoControl.setVisible((this.isVisibilidadCeldaActualizarTipoFondoControl  && this.isPermisoActualizarTipoFondoControl));	
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonEliminarToolBarTipoFondoControl.setVisible((this.isVisibilidadCeldaEliminarTipoFondoControl && this.isPermisoEliminarTipoFondoControl));
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonCancelarToolBarTipoFondoControl.setVisible(this.isVisibilidadCeldaCancelarTipoFondoControl);				
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonGuardarCambiosToolBarTipoFondoControl.setVisible((this.isVisibilidadCeldaGuardarTipoFondoControl && this.isPermisoGuardarCambiosTipoFondoControl));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoFondoControl.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFondoControl && this.isPermisoGuardarCambiosTipoFondoControl));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoFondoControl.setVisible((this.isVisibilidadCeldaNuevoTipoFondoControl && this.isPermisoNuevoTipoFondoControl));			
			this.jMenuItemDuplicarTipoFondoControl.setVisible((this.isVisibilidadCeldaDuplicarTipoFondoControl && this.isPermisoDuplicarTipoFondoControl));			
			this.jMenuItemCopiarTipoFondoControl.setVisible((this.isVisibilidadCeldaCopiarTipoFondoControl && this.isPermisoCopiarTipoFondoControl));			
			this.jMenuItemVerFormTipoFondoControl.setVisible((this.isVisibilidadCeldaVerFormTipoFondoControl && this.isPermisoVerFormTipoFondoControl));			
			this.jMenuItemAbrirOrderByTipoFondoControl.setVisible((this.isVisibilidadCeldaOrdenTipoFondoControl && this.isPermisoOrdenTipoFondoControl));			
			//this.jMenuItemMostrarOcultarTipoFondoControl.setVisible((this.isVisibilidadCeldaOrdenTipoFondoControl && this.isPermisoOrdenTipoFondoControl));
			this.jMenuItemDetalleAbrirOrderByTipoFondoControl.setVisible((this.isVisibilidadCeldaOrdenTipoFondoControl && this.isPermisoOrdenTipoFondoControl));			
			//this.jMenuItemDetalleMostrarOcultarTipoFondoControl.setVisible((this.isVisibilidadCeldaOrdenTipoFondoControl && this.isPermisoOrdenTipoFondoControl));			
			this.jMenuItemNuevoRelacionesTipoFondoControl.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFondoControl && this.isPermisoNuevoTipoFondoControl));			
			this.jMenuItemNuevoGuardarCambiosTipoFondoControl.setVisible((this.isVisibilidadCeldaNuevoTipoFondoControl && this.isPermisoNuevoTipoFondoControl && this.isPermisoGuardarCambiosTipoFondoControl));									
			
			if(this.jInternalFrameDetalleFormTipoFondoControl!=null) {
			this.jInternalFrameDetalleFormTipoFondoControl.jMenuItemModificarTipoFondoControl.setVisible((this.isVisibilidadCeldaModificarTipoFondoControl && this.isPermisoActualizarTipoFondoControl));	
			this.jInternalFrameDetalleFormTipoFondoControl.jMenuItemActualizarTipoFondoControl.setVisible((this.isVisibilidadCeldaActualizarTipoFondoControl && this.isPermisoActualizarTipoFondoControl));	
			this.jInternalFrameDetalleFormTipoFondoControl.jMenuItemEliminarTipoFondoControl.setVisible((this.isVisibilidadCeldaEliminarTipoFondoControl && this.isPermisoEliminarTipoFondoControl));
			this.jInternalFrameDetalleFormTipoFondoControl.jMenuItemCancelarTipoFondoControl.setVisible(this.isVisibilidadCeldaCancelarTipoFondoControl);				
			}
			
			this.jMenuItemGuardarCambiosTipoFondoControl.setVisible((this.isVisibilidadCeldaGuardarTipoFondoControl && this.isPermisoGuardarCambiosTipoFondoControl));						
			this.jMenuItemGuardarCambiosTablaTipoFondoControl.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFondoControl && this.isPermisoGuardarCambiosTipoFondoControl));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoFondoControl=this.jButtonNuevoTipoFondoControl.isVisible();
			this.isVisibilidadCeldaDuplicarTipoFondoControl=this.jButtonDuplicarTipoFondoControl.isVisible();
			this.isVisibilidadCeldaCopiarTipoFondoControl=this.jButtonCopiarTipoFondoControl.isVisible();
			this.isVisibilidadCeldaVerFormTipoFondoControl=this.jButtonVerFormTipoFondoControl.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoFondoControl=this.jButtonAbrirOrderByTipoFondoControl.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoFondoControl=this.jButtonNuevoRelacionesTipoFondoControl.isVisible();
			this.isVisibilidadCeldaModificarTipoFondoControl=this.jButtonModificarTipoFondoControl.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFondoControl!=null) {
			this.isVisibilidadCeldaActualizarTipoFondoControl=this.jInternalFrameDetalleFormTipoFondoControl.jButtonActualizarTipoFondoControl.isVisible();
			this.isVisibilidadCeldaEliminarTipoFondoControl=this.jInternalFrameDetalleFormTipoFondoControl.jButtonEliminarTipoFondoControl.isVisible();
			this.isVisibilidadCeldaCancelarTipoFondoControl=this.jInternalFrameDetalleFormTipoFondoControl.jButtonCancelarTipoFondoControl.isVisible();
			this.isVisibilidadCeldaGuardarTipoFondoControl=this.jInternalFrameDetalleFormTipoFondoControl.jButtonGuardarCambiosTipoFondoControl.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoFondoControl=this.jButtonGuardarCambiosTablaTipoFondoControl.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoFondoControl=this.jButtonNuevoToolBarTipoFondoControl.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoFondoControl=this.jButtonNuevoRelacionesToolBarTipoFondoControl.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFondoControl!=null) {
			this.isVisibilidadCeldaModificarTipoFondoControl=this.jInternalFrameDetalleFormTipoFondoControl.jButtonModificarToolBarTipoFondoControl.isVisible();
			this.isVisibilidadCeldaActualizarTipoFondoControl=this.jInternalFrameDetalleFormTipoFondoControl.jButtonActualizarToolBarTipoFondoControl.isVisible();
			this.isVisibilidadCeldaEliminarTipoFondoControl=this.jInternalFrameDetalleFormTipoFondoControl.jButtonEliminarToolBarTipoFondoControl.isVisible();
			this.isVisibilidadCeldaCancelarTipoFondoControl=this.jInternalFrameDetalleFormTipoFondoControl.jButtonCancelarToolBarTipoFondoControl.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoFondoControl=this.jButtonGuardarCambiosToolBarTipoFondoControl.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoFondoControl=this.jButtonGuardarCambiosTablaToolBarTipoFondoControl.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoFondoControl=this.jMenuItemNuevoTipoFondoControl.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoFondoControl=this.jMenuItemNuevoRelacionesTipoFondoControl.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFondoControl!=null) {
			this.isVisibilidadCeldaModificarTipoFondoControl=this.jInternalFrameDetalleFormTipoFondoControl.jMenuItemModificarTipoFondoControl.isVisible();
			this.isVisibilidadCeldaActualizarTipoFondoControl=this.jInternalFrameDetalleFormTipoFondoControl.jMenuItemActualizarTipoFondoControl.isVisible();
			this.isVisibilidadCeldaEliminarTipoFondoControl=this.jInternalFrameDetalleFormTipoFondoControl.jMenuItemEliminarTipoFondoControl.isVisible();
			this.isVisibilidadCeldaCancelarTipoFondoControl=this.jInternalFrameDetalleFormTipoFondoControl.jMenuItemCancelarTipoFondoControl.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoFondoControl=this.jMenuItemGuardarCambiosTipoFondoControl.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoFondoControl=this.jMenuItemGuardarCambiosTablaTipoFondoControl.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoFondoControl(Boolean esInicializar) {
		if(TipoFondoControlJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipofondocontrolSessionBean.getConGuardarRelaciones()) {
				//if(this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoFondoControl();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoFondoControl(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoFondoControl() {
		this.jButtonNuevoTipoFondoControl.setVisible(this.isPermisoNuevoTipoFondoControl);			
		this.jButtonDuplicarTipoFondoControl.setVisible(this.isPermisoDuplicarTipoFondoControl);			
		this.jButtonCopiarTipoFondoControl.setVisible(this.isPermisoCopiarTipoFondoControl);			
		this.jButtonVerFormTipoFondoControl.setVisible(this.isPermisoVerFormTipoFondoControl);			
		
		this.jButtonAbrirOrderByTipoFondoControl.setVisible(this.isPermisoOrdenTipoFondoControl);					
		
		this.jButtonNuevoRelacionesTipoFondoControl.setVisible(this.isPermisoNuevoTipoFondoControl);			
		
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonModificarTipoFondoControl.setVisible(this.isPermisoActualizarTipoFondoControl);	
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonActualizarTipoFondoControl.setVisible(this.isPermisoActualizarTipoFondoControl);	
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonEliminarTipoFondoControl.setVisible(this.isPermisoEliminarTipoFondoControl);
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonCancelarTipoFondoControl.setVisible(this.isVisibilidadCeldaCancelarTipoFondoControl);						
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonGuardarCambiosTipoFondoControl.setVisible(this.isPermisoGuardarCambiosTipoFondoControl);							
		}
		
		this.jButtonGuardarCambiosTablaTipoFondoControl.setVisible(this.isPermisoActualizarTipoFondoControl);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoFondoControl() {
		this.jInternalFrameDetalleFormTipoFondoControl.jButtonModificarTipoFondoControl.setVisible(this.isPermisoActualizarTipoFondoControl);	
		this.jInternalFrameDetalleFormTipoFondoControl.jButtonActualizarTipoFondoControl.setVisible(this.isPermisoActualizarTipoFondoControl);	
		this.jInternalFrameDetalleFormTipoFondoControl.jButtonEliminarTipoFondoControl.setVisible(this.isPermisoEliminarTipoFondoControl);
		this.jInternalFrameDetalleFormTipoFondoControl.jButtonCancelarTipoFondoControl.setVisible(this.isVisibilidadCeldaCancelarTipoFondoControl);							
		this.jInternalFrameDetalleFormTipoFondoControl.jButtonGuardarCambiosTipoFondoControl.setVisible((this.isVisibilidadCeldaGuardarTipoFondoControl && this.isPermisoGuardarCambiosTipoFondoControl));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoFondoControl() {
		if(TipoFondoControlJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoFondoControl();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoFondoControl() {
	}
	
	public void jTableDatosTipoFondoControlListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoFondoControl(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoFondoControlBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondocontrolLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFondoControl.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFondoControl(this.gettipofondocontrol(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFondoControl(this.tipofondocontrol);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrolLogic.getTipoFondoControls().toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrols.toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipofondocontrol==null) {
						this.tipofondocontrol = new TipoFondoControl();
					}

					this.setVariablesFormularioToObjetoActualTipoFondoControl(this.tipofondocontrol,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFondoControl(this.tipofondocontrol);
				}

				if(this.tipofondocontrol.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipofondocontrol.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFondoControl(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondocontrolLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondocontrolLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondocontrolLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoFondoControlBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondocontrolLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFondoControl.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFondoControl(this.gettipofondocontrol(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFondoControl(this.tipofondocontrol);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrolLogic.getTipoFondoControls().toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrols.toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipofondocontrol==null) {
						this.tipofondocontrol = new TipoFondoControl();
					}

					this.setVariablesFormularioToObjetoActualTipoFondoControl(this.tipofondocontrol,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFondoControl(this.tipofondocontrol);
				}

				if(this.tipofondocontrol.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipofondocontrol.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFondoControl(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondocontrolLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondocontrolLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondocontrolLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoFondoControlBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondocontrolLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFondoControl.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFondoControl(this.gettipofondocontrol(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFondoControl(this.tipofondocontrol);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrolLogic.getTipoFondoControls().toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrols.toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipofondocontrol==null) {
						this.tipofondocontrol = new TipoFondoControl();
					}

					this.setVariablesFormularioToObjetoActualTipoFondoControl(this.tipofondocontrol,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFondoControl(this.tipofondocontrol);
				}

				if(this.tipofondocontrol.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipofondocontrol.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFondoControl(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondocontrolLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondocontrolLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondocontrolLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoFondoControl() {
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) {
			this.jInternalFrameDetalleFormTipoFondoControl.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoFondoControl.dispose();
			this.jInternalFrameDetalleFormTipoFondoControl=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoFondoControl!=null) {
			this.jInternalFrameReporteDinamicoTipoFondoControl.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoFondoControl.dispose();
			this.jInternalFrameReporteDinamicoTipoFondoControl=null;
		}
		
		if(this.jInternalFrameImportacionTipoFondoControl!=null) {
			this.jInternalFrameImportacionTipoFondoControl.setVisible(false);	    			
			this.jInternalFrameImportacionTipoFondoControl.dispose();
			this.jInternalFrameImportacionTipoFondoControl=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoFondoControl();
			
			TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoFondoControl")) {
				jButtonNuevoTipoFondoControlActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoFondoControl")) {
				jButtonDuplicarTipoFondoControlActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoFondoControl")) {
				jButtonCopiarTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoFondoControl")) {
				jButtonVerFormTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoFondoControl")) {
				jButtonNuevoTipoFondoControlActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoFondoControl")) {
				jButtonDuplicarTipoFondoControlActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoFondoControl")) {
				jButtonNuevoTipoFondoControlActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoFondoControl")) {
				jButtonDuplicarTipoFondoControlActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoFondoControl")) {
				jButtonNuevoTipoFondoControlActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoFondoControl")) {
				jButtonNuevoTipoFondoControlActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoFondoControl")) {
				jButtonNuevoTipoFondoControlActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoFondoControl")) {
				jButtonModificarTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoFondoControl")) {
				jButtonModificarTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoFondoControl")) {
				jButtonModificarTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoFondoControl")) {
				jButtonActualizarTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoFondoControl")) {
				jButtonActualizarTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoFondoControl")) {
				jButtonActualizarTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoFondoControl")) {
				jButtonEliminarTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoFondoControl")) {
				jButtonEliminarTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoFondoControl")) {
				jButtonEliminarTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoFondoControl")) {
				jButtonCancelarTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoFondoControl")) {
				jButtonCancelarTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoFondoControl")) {
				jButtonCancelarTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoFondoControl")) {
				jButtonCerrarTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoFondoControl")) {
				jButtonCerrarTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoFondoControl")) {
				jButtonCerrarTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoFondoControl")) {
				jButtonMostrarOcultarTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoFondoControl")) {
				jButtonCancelarTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoFondoControl")) {
				jButtonGuardarCambiosTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoFondoControl")) {
				jButtonGuardarCambiosTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoFondoControl")) {
				jButtonCopiarTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoFondoControl")) {
				jButtonVerFormTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoFondoControl")) {
				jButtonGuardarCambiosTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoFondoControl")) {
				jButtonCopiarTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoFondoControl")) {
				jButtonVerFormTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoFondoControl")) {
				jButtonGuardarCambiosTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoFondoControl")) {
				jButtonGuardarCambiosTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoFondoControl")) {
				jButtonGuardarCambiosTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoFondoControl")) {
				jButtonRecargarInformacionTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoFondoControl")) {
				jButtonRecargarInformacionTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoFondoControl")) {
				jButtonRecargarInformacionTipoFondoControlActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoFondoControl")) {
				jButtonAnterioresTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoFondoControl")) {
				jButtonAnterioresTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoFondoControl")) {
				jButtonAnterioresTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoFondoControl")) {
				jButtonSiguientesTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoFondoControl")) {
				jButtonSiguientesTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoFondoControl")) {
				jButtonSiguientesTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoFondoControl") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoFondoControl")) {
				jButtonAbrirOrderByTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoFondoControl") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoFondoControl")) {
				jButtonMostrarOcultarTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoFondoControl")) {
				jButtonNuevoGuardarCambiosTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoFondoControl")) {
				jButtonNuevoGuardarCambiosTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoFondoControl")) {
				jButtonNuevoGuardarCambiosTipoFondoControlActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoFondoControl")) {
				jButtonCerrarReporteDinamicoTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoFondoControl")) {
				jButtonGenerarReporteDinamicoTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoFondoControl")) {
				
				jButtonGenerarExcelReporteDinamicoTipoFondoControlActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoFondoControl")) {
				jButtonCerrarImportacionTipoFondoControlActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoFondoControl")) {
				
				jButtonGenerarImportacionTipoFondoControlActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoFondoControl")) {
				
				jButtonAbrirImportacionTipoFondoControlActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoFondoControl")) {
				jComboBoxTiposAccionesTipoFondoControlActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoFondoControl")) {
				jComboBoxTiposRelacionesTipoFondoControlActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoFondoControl")) {
				jComboBoxTiposAccionesTipoFondoControlActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoFondoControl")) {
				
				jComboBoxTiposSeleccionarTipoFondoControlActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoFondoControl")) {
				jTextFieldValorCampoGeneralTipoFondoControlActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoFondoControl")) {
				jButtonAbrirOrderByTipoFondoControlActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoFondoControl")) {
				jButtonAbrirOrderByTipoFondoControlActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoFondoControl")) {
				jButtonCerrarOrderByTipoFondoControlActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoFondoControlBusqueda")) {
				this.jButtonidTipoFondoControlBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoFondoControlBusqueda")) {
				this.jButtoncodigoTipoFondoControlBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoFondoControlBusqueda")) {
				this.jButtonnombreTipoFondoControlBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoFondoControl();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFondoControlActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondocontrol);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofondocontrol);
				
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
				
				


				
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFondoControl.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFondoControl.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoFondoControl tipofondocontrolLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipofondocontrolLocal=this.tipofondocontrol;
			} else {
				tipofondocontrolLocal=this.tipofondocontrolAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondocontrol);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofondocontrol);
				
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
							
				
				


				
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFondoControl.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFondoControl.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFondoControlActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFondoControl.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondocontrolAnterior =(TipoFondoControl) this.tipofondocontrolLogic.getTipoFondoControls().toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofondocontrolAnterior =(TipoFondoControl) this.tipofondocontrols.toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
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
			
			TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
			
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
			
			


			
			TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFondoControlActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondocontrol);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofondocontrol);
				
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
								
						
				


				
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFondoControl.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFondoControl.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondocontrol);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofondocontrol);
				
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
								
				
				


				
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFondoControl.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFondoControl.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFondoControlActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFondoControl.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondocontrolAnterior =(TipoFondoControl) this.tipofondocontrolLogic.getTipoFondoControls().toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofondocontrolAnterior =(TipoFondoControl) this.tipofondocontrols.toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondocontrol);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofondocontrol);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFondoControlActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFondoControl.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondocontrolAnterior =(TipoFondoControl) this.tipofondocontrolLogic.getTipoFondoControls().toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofondocontrolAnterior =(TipoFondoControl) this.tipofondocontrols.toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFondoControlActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondocontrol);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipofondocontrol);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondocontrol);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofondocontrol);
				
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
							
				
				


				
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFondoControl.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFondoControl.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFondoControlActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoFondoControl.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofondocontrolAnterior =(TipoFondoControl) this.tipofondocontrolLogic.getTipoFondoControls().toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipofondocontrolAnterior =(TipoFondoControl) this.tipofondocontrols.toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
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
			
			TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
			
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
			
			


			
			TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFondoControlActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondocontrol);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipofondocontrol);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondocontrol);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofondocontrol);
				
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
								
				
				


				
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFondoControl.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFondoControl.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFondoControlActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFondoControl.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondocontrolAnterior =(TipoFondoControl) this.tipofondocontrolLogic.getTipoFondoControls().toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofondocontrolAnterior =(TipoFondoControl) this.tipofondocontrols.toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFondoControlActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondocontrol);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipofondocontrol);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFondoControlActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondocontrol);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofondocontrol);
				
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoFondoControl")) {
					jCheckBoxSeleccionarTodosTipoFondoControlItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoFondoControl")) {
					jCheckBoxSeleccionadosTipoFondoControlItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoFondoControl")) {
					
				}
				
				


				
				
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFondoControl.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFondoControl.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondocontrol);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipofondocontrol);
				
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
												
				
				


				
				
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFondoControl.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFondoControl.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFondoControlActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoFondoControl.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofondocontrolAnterior =(TipoFondoControl) this.tipofondocontrolLogic.getTipoFondoControls().toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipofondocontrolAnterior =(TipoFondoControl) this.tipofondocontrols.toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFondoControlActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondocontrol);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofondocontrol);
				
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
				
				
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
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
			
			TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
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
			
			


			
			TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFondoControlActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondocontrol);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofondocontrol);
				
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFondoControl.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFondoControl.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondocontrol);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofondocontrol);
				
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
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
				
				


				
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFondoControl.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFondoControl.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFondoControlActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFondoControl.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondocontrolAnterior =(TipoFondoControl) this.tipofondocontrolLogic.getTipoFondoControls().toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofondocontrolAnterior =(TipoFondoControl) this.tipofondocontrols.toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoFondoControl")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoFondoControlListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoFondoControl.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrolLogic.getTipoFondoControls().toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipofondocontrol =(TipoFondoControl) this.tipofondocontrols.toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipofondocontrol);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoFondoControl")) {
				
				}
				
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoFondoControl")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoFondoControl.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoFondoControl")) {
			
			}
			
			TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoFondoControl();
			
			TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
			
			if(sTipo.equals("NuevoTipoFondoControl")) {
				jButtonNuevoTipoFondoControlActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoFondoControl")) {
				jButtonDuplicarTipoFondoControlActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoFondoControl")) {
				jButtonCopiarTipoFondoControlActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoFondoControl")) {
				jButtonVerFormTipoFondoControlActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoFondoControl")) {
				jButtonNuevoTipoFondoControlActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoFondoControl")) {
				jButtonModificarTipoFondoControlActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoFondoControl")) {
				jButtonActualizarTipoFondoControlActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoFondoControl")) {
				jButtonEliminarTipoFondoControlActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoFondoControl")) {
				jButtonGuardarCambiosTipoFondoControlActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoFondoControl")) {
				jButtonCancelarTipoFondoControlActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoFondoControl")) {
				jButtonCerrarTipoFondoControlActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoFondoControl")) {
				jButtonGuardarCambiosTipoFondoControlActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoFondoControl")) {
				jButtonNuevoGuardarCambiosTipoFondoControlActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoFondoControl")) {
				jButtonAbrirOrderByTipoFondoControlActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoFondoControl")) {
				jButtonRecargarInformacionTipoFondoControlActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoFondoControl")) {
				jButtonAnterioresTipoFondoControlActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoFondoControl")) {
				jButtonSiguientesTipoFondoControlActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoFondoControlBusqueda")) {
				this.jButtonidTipoFondoControlBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoFondoControlBusqueda")) {
				this.jButtoncodigoTipoFondoControlBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoFondoControlBusqueda")) {
				this.jButtonnombreTipoFondoControlBusquedaActionPerformed(evt);
			}
			
			TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoFondoControl();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoFondoControl")) {
				closingInternalFrameTipoFondoControl();
				
			} else if(sTipo.equals("jButtonCancelarTipoFondoControl")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoFondoControl = (JInternalFrameBase)evt.getSource();
	            	
	            TipoFondoControlBeanSwingJInternalFrame jInternalFrameParent=(TipoFondoControlBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoFondoControl.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoFondoControlActionPerformed(null);
			}
			
			TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipofondocontrol,new Object(),this.tipofondocontrolParameterGeneral,this.tipofondocontrolReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoFondoControl(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoFondoControl(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoFondoControl(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipofondocontrol)) {
			if(!esControlTabla) {
				if(TipoFondoControlJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoFondoControl(this.tipofondocontrol,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFondoControl(this.tipofondocontrol);			
				}
				
				if(this.tipofondocontrolSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoFondoControl(this.tipofondocontrol,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipofondocontrolReturnGeneral=tipofondocontrolLogic.procesarEventosTipoFondoControlsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipofondocontrolLogic.getTipoFondoControls(),this.tipofondocontrol,this.tipofondocontrolParameterGeneral,this.isEsNuevoTipoFondoControl,classes);//this.tipofondocontrolLogic.getTipoFondoControl()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoFondoControl(this.tipofondocontrolReturnGeneral,this.tipofondocontrolBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipofondocontrolSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoFondoControl(classes,this.tipofondocontrolReturnGeneral,this.tipofondocontrolBean,false);
					}
						
					if(this.tipofondocontrolReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoFondoControl(this.tipofondocontrolReturnGeneral.getTipoFondoControl());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoFondoControl(this.tipofondocontrolReturnGeneral.getTipoFondoControl());	
					}
						
					if(this.tipofondocontrolReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoFondoControl(this.tipofondocontrolReturnGeneral.getTipoFondoControl(),classes);//this.tipofondocontrolBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoFondoControl(this.tipofondocontrol,classes);//this.tipofondocontrolBean);									
				}
			
				if(TipoFondoControlJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoFondoControl(this.tipofondocontrol,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFondoControl(this.tipofondocontrol);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipofondocontrolAnterior!=null) {
						this.tipofondocontrol=this.tipofondocontrolAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipofondocontrolReturnGeneral=tipofondocontrolLogic.procesarEventosTipoFondoControlsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipofondocontrolLogic.getTipoFondoControls(),this.tipofondocontrol,this.tipofondocontrolParameterGeneral,this.isEsNuevoTipoFondoControl,classes);//this.tipofondocontrolLogic.getTipoFondoControl()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipofondocontrolSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipofondocontrolSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipofondocontrolReturnGeneral.getTipoFondoControl(),tipofondocontrolLogic.getTipoFondoControls());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipofondocontrolReturnGeneral.getTipoFondoControl(),this.tipofondocontrols);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoFondoControl.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoFondoControl.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoFondoControl();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoFondoControl() throws Exception {
		
		TipoFondoControlModel tipofondocontrolModel=(TipoFondoControlModel)this.jTableDatosTipoFondoControl.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipofondocontrolModel.tipofondocontrols=this.tipofondocontrolLogic.getTipoFondoControls();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipofondocontrolModel.tipofondocontrols=this.tipofondocontrols;
		}
		
		
		((TipoFondoControlModel) this.jTableDatosTipoFondoControl.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoFondoControl() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipofondocontrolAnterior(),this.tipofondocontrolLogic.getTipoFondoControls());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipofondocontrolAnterior(),this.tipofondocontrols);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoFondoControl();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoFondoControl(TipoFondoControl tipofondocontrol,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
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
										
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipofondocontrol,new Object(),generalEntityParameterGeneral,this.tipofondocontrolReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipofondocontrolSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoFondoControlConstantesFunciones.getClassesRelationshipsOfTipoFondoControl(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoFondoControlConstantesFunciones.getClassesRelationshipsFromStringsOfTipoFondoControl(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoFondoControl(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoFondoControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipofondocontrol,new Object(),generalEntityParameterGeneral,this.tipofondocontrolReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoFondoControl(TipoFondoControlBean tipofondocontrolBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoFondoControl(ArrayList<Classe> classes,TipoFondoControlReturnGeneral tipofondocontrolReturnGeneral,TipoFondoControlBean tipofondocontrolBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoFondoControl(TipoFondoControl tipofondocontrol,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipofondocontrol)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoFondoControl = new TipoFondoControlDetalleFormJInternalFrame(jDesktopPane,this.tipofondocontrolSessionBean.getConGuardarRelaciones(),this.tipofondocontrolSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoFondoControl);
		this.jInternalFrameDetalleFormTipoFondoControl.setVisible(false);
		this.jInternalFrameDetalleFormTipoFondoControl.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoFondoControl.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoFondoControl.tipofondocontrolLogic=this.tipofondocontrolLogic;
		
		this.cargarCombosFrameForeignKeyTipoFondoControl("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoFondoControl();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoFondoControl();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoFondoControl("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoFondoControl();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoFondoControl.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoFondoControl"));
		
		this.jInternalFrameDetalleFormTipoFondoControl.jButtonModificarTipoFondoControl.addActionListener(new ButtonActionListener(this,"ModificarTipoFondoControl"));

		
		this.jInternalFrameDetalleFormTipoFondoControl.jButtonModificarToolBarTipoFondoControl.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoFondoControl"));
					
		this.jInternalFrameDetalleFormTipoFondoControl.jMenuItemModificarTipoFondoControl.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoFondoControl"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFondoControl.jButtonActualizarTipoFondoControl.addActionListener (new ButtonActionListener(this,"ActualizarTipoFondoControl"));
		
		
		this.jInternalFrameDetalleFormTipoFondoControl.jButtonActualizarToolBarTipoFondoControl.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoFondoControl"));
						
		this.jInternalFrameDetalleFormTipoFondoControl.jMenuItemActualizarTipoFondoControl.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoFondoControl"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFondoControl.jButtonEliminarTipoFondoControl.addActionListener (new ButtonActionListener(this,"EliminarTipoFondoControl"));
		
		
		this.jInternalFrameDetalleFormTipoFondoControl.jButtonEliminarToolBarTipoFondoControl.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoFondoControl"));
								
		this.jInternalFrameDetalleFormTipoFondoControl.jMenuItemEliminarTipoFondoControl.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoFondoControl"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFondoControl.jButtonCancelarTipoFondoControl.addActionListener (new ButtonActionListener(this,"CancelarTipoFondoControl"));
		
		
		this.jInternalFrameDetalleFormTipoFondoControl.jButtonCancelarToolBarTipoFondoControl.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoFondoControl"));
					
		this.jInternalFrameDetalleFormTipoFondoControl.jMenuItemCancelarTipoFondoControl.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoFondoControl"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoFondoControl.jMenuItemDetalleCerrarTipoFondoControl.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoFondoControl"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFondoControl.jButtonGuardarCambiosToolBarTipoFondoControl.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFondoControl"));
		
		
		
		this.jInternalFrameDetalleFormTipoFondoControl.jButtonGuardarCambiosToolBarTipoFondoControl.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFondoControl"));
		
		
		
		this.jInternalFrameDetalleFormTipoFondoControl.jComboBoxTiposAccionesFormularioTipoFondoControl.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoFondoControl"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFondoControl.jButtonidTipoFondoControlBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFondoControlBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFondoControl.jButtoncodigoTipoFondoControlBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoFondoControlBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFondoControl.jButtonnombreTipoFondoControlBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFondoControlBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoFondoControl.jTabbedPaneRelacionesTipoFondoControl.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoFondoControl"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoFondoControl"));
		
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondoControl.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoFondoControl"));
		}
		
		this.jTableDatosTipoFondoControl.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoFondoControl"));
		
		this.jTableDatosTipoFondoControl.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoFondoControl"));
		
		this.jButtonNuevoTipoFondoControl.addActionListener(new ButtonActionListener(this,"NuevoTipoFondoControl"));
		
		this.jButtonDuplicarTipoFondoControl.addActionListener(new ButtonActionListener(this,"DuplicarTipoFondoControl"));
		
		this.jButtonCopiarTipoFondoControl.addActionListener(new ButtonActionListener(this,"CopiarTipoFondoControl"));
		
		this.jButtonVerFormTipoFondoControl.addActionListener(new ButtonActionListener(this,"VerFormTipoFondoControl"));
		
		
		this.jButtonNuevoToolBarTipoFondoControl.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoFondoControl"));
			
		this.jButtonDuplicarToolBarTipoFondoControl.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoFondoControl"));
			
		this.jMenuItemNuevoTipoFondoControl.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoFondoControl"));
			
		this.jMenuItemDuplicarTipoFondoControl.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoFondoControl"));		
		
		
		this.jButtonNuevoRelacionesTipoFondoControl.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoFondoControl"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoFondoControl.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoFondoControl"));
			
		this.jMenuItemNuevoRelacionesTipoFondoControl.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoFondoControl"));		
		
		
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonModificarTipoFondoControl.addActionListener(new ButtonActionListener(this,"ModificarTipoFondoControl"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonModificarToolBarTipoFondoControl.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoFondoControl"));
			
			this.jInternalFrameDetalleFormTipoFondoControl.jMenuItemModificarTipoFondoControl.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoFondoControl"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonActualizarTipoFondoControl.addActionListener (new ButtonActionListener(this,"ActualizarTipoFondoControl"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonActualizarToolBarTipoFondoControl.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoFondoControl"));
				
			this.jInternalFrameDetalleFormTipoFondoControl.jMenuItemActualizarTipoFondoControl.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoFondoControl"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonEliminarTipoFondoControl.addActionListener (new ButtonActionListener(this,"EliminarTipoFondoControl"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonEliminarToolBarTipoFondoControl.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoFondoControl"));
						
			this.jInternalFrameDetalleFormTipoFondoControl.jMenuItemEliminarTipoFondoControl.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoFondoControl"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonCancelarTipoFondoControl.addActionListener (new ButtonActionListener(this,"CancelarTipoFondoControl"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonCancelarToolBarTipoFondoControl.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoFondoControl"));
			
			this.jInternalFrameDetalleFormTipoFondoControl.jMenuItemCancelarTipoFondoControl.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoFondoControl"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoFondoControl.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoFondoControl"));		
		
		
		this.jButtonCerrarTipoFondoControl.addActionListener (new ButtonActionListener(this,"CerrarTipoFondoControl"));
		
		
		this.jButtonCerrarToolBarTipoFondoControl.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoFondoControl"));
			
		this.jMenuItemCerrarTipoFondoControl.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoFondoControl"));
			
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondoControl.jMenuItemDetalleCerrarTipoFondoControl.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoFondoControl"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonGuardarCambiosTipoFondoControl.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoFondoControl"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondoControl.jButtonGuardarCambiosToolBarTipoFondoControl.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFondoControl"));
		}
		
		this.jButtonCopiarToolBarTipoFondoControl.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoFondoControl"));
			
		this.jButtonVerFormToolBarTipoFondoControl.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoFondoControl"));
		
		this.jMenuItemGuardarCambiosTipoFondoControl.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoFondoControl"));
			
		this.jMenuItemCopiarTipoFondoControl.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoFondoControl"));		
		
		this.jMenuItemVerFormTipoFondoControl.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoFondoControl"));		
		
		
		this.jButtonGuardarCambiosTablaTipoFondoControl.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoFondoControl"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoFondoControl.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoFondoControl"));
			
		this.jMenuItemGuardarCambiosTablaTipoFondoControl.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoFondoControl"));		
		
		
		
		this.jButtonRecargarInformacionTipoFondoControl.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoFondoControl"));
					
		this.jButtonRecargarInformacionToolBarTipoFondoControl.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoFondoControl"));
		
		this.jMenuItemRecargarInformacionTipoFondoControl.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoFondoControl"));		
		
		
		
		this.jButtonAnterioresTipoFondoControl.addActionListener (new ButtonActionListener(this,"AnterioresTipoFondoControl"));
		
		
		this.jButtonAnterioresToolBarTipoFondoControl.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoFondoControl"));
		
		this.jMenuItemAnterioresTipoFondoControl.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoFondoControl"));		
		
		
		this.jButtonSiguientesTipoFondoControl.addActionListener (new ButtonActionListener(this,"SiguientesTipoFondoControl"));
		
		
		this.jButtonSiguientesToolBarTipoFondoControl.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoFondoControl"));
			
		this.jMenuItemSiguientesTipoFondoControl.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoFondoControl"));
			
		this.jMenuItemAbrirOrderByTipoFondoControl.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoFondoControl"));
			
		this.jMenuItemMostrarOcultarTipoFondoControl.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoFondoControl"));
			
		this.jMenuItemDetalleAbrirOrderByTipoFondoControl.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoFondoControl"));
			
		this.jMenuItemDetalleMostarOcultarTipoFondoControl.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoFondoControl"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoFondoControl.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoFondoControl"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFondoControl.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoFondoControl"));
			
		this.jMenuItemNuevoGuardarCambiosTipoFondoControl.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoFondoControl"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoFondoControl.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoFondoControl"));

		this.jCheckBoxSeleccionadosTipoFondoControl.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoFondoControl"));
		
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondoControl.jComboBoxTiposAccionesFormularioTipoFondoControl.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoFondoControl"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoFondoControl.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoFondoControl"));
			
		this.jComboBoxTiposAccionesTipoFondoControl.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoFondoControl"));
					
		this.jComboBoxTiposSeleccionarTipoFondoControl.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoFondoControl"));
			
		this.jTextFieldValorCampoGeneralTipoFondoControl.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoFondoControl"));		
		
		
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFondoControl.jButtonidTipoFondoControlBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFondoControlBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFondoControl.jButtoncodigoTipoFondoControlBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoFondoControlBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFondoControl.jButtonnombreTipoFondoControlBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFondoControlBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoFondoControl!=null) {
				this.jInternalFrameReporteDinamicoTipoFondoControl.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFondoControl"));
				this.jInternalFrameReporteDinamicoTipoFondoControl.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFondoControl"));
				this.jInternalFrameReporteDinamicoTipoFondoControl.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFondoControl"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoFondoControl.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFondoControl"));				
			//this.jButtonGenerarReporteDinamicoTipoFondoControl.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFondoControl"));
			//this.jButtonGenerarExcelReporteDinamicoTipoFondoControl.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFondoControl"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoFondoControl!=null) {
				this.jInternalFrameImportacionTipoFondoControl.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoFondoControl"));
				this.jInternalFrameImportacionTipoFondoControl.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoFondoControl"));
				this.jInternalFrameImportacionTipoFondoControl.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoFondoControl"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoFondoControl.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoFondoControl"));
			
			this.jButtonAbrirOrderByToolBarTipoFondoControl.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoFondoControl"));			
			
			if(this.jInternalFrameOrderByTipoFondoControl!=null) {
				this.jInternalFrameOrderByTipoFondoControl.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoFondoControl"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoFondoControl!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondoControl.jTabbedPaneRelacionesTipoFondoControl.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoFondoControl"));
		
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
            		closingInternalFrameTipoFondoControl();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoFondoControl.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoFondoControl = (JInternalFrameBase)event.getSource();
	            	
	            TipoFondoControlBeanSwingJInternalFrame jInternalFrameParent=(TipoFondoControlBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoFondoControl.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoFondoControlActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoFondoControl.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoFondoControlListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoFondoControl.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoFondoControl.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFondoControlActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFondoControlActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFondoControlActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoFondoControl";
		inputMap = this.jButtonNuevoTipoFondoControl.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoFondoControl.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoFondoControlActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFondoControlActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFondoControlActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFondoControlActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoFondoControl";
		inputMap = this.jButtonNuevoRelacionesTipoFondoControl.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoFondoControl.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoFondoControlActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoFondoControl";
		inputMap = this.jButtonModificarTipoFondoControl.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoFondoControl.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoFondoControlActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoFondoControl";
		inputMap = this.jButtonActualizarTipoFondoControl.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoFondoControl.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoFondoControlActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoFondoControl";
		inputMap = this.jButtonEliminarTipoFondoControl.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoFondoControl.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoFondoControlActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoFondoControl";
		inputMap = this.jButtonCancelarTipoFondoControl.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoFondoControl.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoFondoControlActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoFondoControl";
		inputMap = this.jButtonCerrarTipoFondoControl.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoFondoControl.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoFondoControlActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoFondoControl.jButtonGuardarCambiosTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoFondoControl";
		inputMap = this.jInternalFrameDetalleFormTipoFondoControl.jButtonGuardarCambiosTipoFondoControl.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoFondoControl.jButtonGuardarCambiosTipoFondoControl.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoFondoControlActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoFondoControl.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoFondoControlItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoFondoControl.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoFondoControlActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoFondoControl.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoFondoControlActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoFondoControl.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoFondoControlActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFondoControl.jButtonidTipoFondoControlBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFondoControlBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFondoControl.jButtoncodigoTipoFondoControlBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoFondoControlBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFondoControl.jButtonnombreTipoFondoControlBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFondoControlBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoFondoControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoFondoControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoFondoControlActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoFondoControl.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoFondoControl(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoFondoControl tipofondocontrolAux:this.tipofondocontrolLogic.getTipoFondoControls()) {
					tipofondocontrolAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFondoControl tipofondocontrolAux:tipofondocontrols) {
					tipofondocontrolAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoFondoControlItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoFondoControl(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoFondoControl tipofondocontrolAux:this.tipofondocontrolLogic.getTipoFondoControls()) {
						tipofondocontrolAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFondoControl tipofondocontrolAux:tipofondocontrols) {
						tipofondocontrolAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoFondoControl tipofondocontrolAux:this.tipofondocontrolLogic.getTipoFondoControls()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFondoControl tipofondocontrolAux:tipofondocontrols) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoFondoControl(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoFondoControl.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoFondoControl.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoFondoControl,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoFondoControlItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoFondoControl(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoFondoControl.getSelectedRows();
			
			TipoFondoControl tipofondocontrolLocal=new TipoFondoControl();
			
			//this.seleccionarTodosTipoFondoControl(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipofondocontrolLocal =(TipoFondoControl) this.tipofondocontrolLogic.getTipoFondoControls().toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipofondocontrolLocal =(TipoFondoControl) this.tipofondocontrols.toArray()[this.jTableDatosTipoFondoControl.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipofondocontrolLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoFondoControl tipofondocontrolAux:this.tipofondocontrolLogic.getTipoFondoControls()) {
						tipofondocontrolAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFondoControl tipofondocontrolAux:tipofondocontrols) {
						tipofondocontrolAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoFondoControl(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoFondoControl.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoFondoControl.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoFondoControl,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoFondoControlItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoFondoControlParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoFondoControlActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoFondoControl(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoFondoControl.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoFondoControl tipofondocontrolAux:this.tipofondocontrolLogic.getTipoFondoControls()) {
				
						if(sTipoSeleccionar.equals(TipoFondoControlConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipofondocontrolAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoFondoControlConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipofondocontrolAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFondoControl tipofondocontrolAux:tipofondocontrols) {
					
						if(sTipoSeleccionar.equals(TipoFondoControlConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipofondocontrolAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoFondoControlConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipofondocontrolAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoFondoControl(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoFondoControlActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoFondoControl(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoFondoControl=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoFondoControl.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoFondoControl.jComboBoxTiposAccionesFormularioTipoFondoControl.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoFondoControl) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoFondoControl(conSplash);
				
					this.generarReporteTipoFondoControlsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFondoControl.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFondoControl.jComboBoxTiposAccionesFormularioTipoFondoControl.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoFondoControlsSeleccionados();
				//this.jComboBoxTiposAccionesTipoFondoControl.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoFondoControlsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoFondoControl.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoFondoControlsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoFondoControl.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoFondoControl();
				
				this.exportarTipoFondoControlsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFondoControl.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFondoControl.jComboBoxTiposAccionesFormularioTipoFondoControl.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoFondoControls();
				//this.importarTipoFondoControls();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFondoControl.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFondoControl.jComboBoxTiposAccionesFormularioTipoFondoControl.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoFondoControl();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoFondoControlsSeleccionados();
				//this.jComboBoxTiposAccionesTipoFondoControl.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Fondo Control", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoFondoControl();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoFondoControl)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoFondoControl(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Fondo Control",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFondoControl.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFondoControl.jComboBoxTiposAccionesFormularioTipoFondoControl.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoFondoControl();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoFondoControl(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoFondoControlActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoFondoControl();
			
			if(this.jInternalFrameDetalleFormTipoFondoControl==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoFondoControl> tipofondocontrolsSeleccionados=new ArrayList<TipoFondoControl>();		
			TipoFondoControl tipofondocontrol=new TipoFondoControl();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoFondoControl(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoFondoControl.getSelectedItem();
			
			
			
			
			tipofondocontrolsSeleccionados=this.getTipoFondoControlsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipofondocontrolsSeleccionados.size()==1) {
				for(TipoFondoControl tipofondocontrolAux:tipofondocontrolsSeleccionados) {
					tipofondocontrol=tipofondocontrolAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoFondoControl();
			
      		//this.finishProcessTipoFondoControl(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoFondoControlReturnGeneral() throws Exception {
		if(this.tipofondocontrolReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipofondocontrolReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipofondocontrolReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipofondocontrolReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipofondocontrolReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipofondocontrolReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoFondoControl(false);
		}
		
		if(this.tipofondocontrolReturnGeneral.getConRetornoLista() || this.tipofondocontrolReturnGeneral.getConRetornoObjeto()) {
			if(this.tipofondocontrolReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipofondocontrolLogic.setTipoFondoControls(this.tipofondocontrolReturnGeneral.getTipoFondoControls());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipofondocontrolReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipofondocontrolLogic.setTipoFondoControl(this.tipofondocontrolReturnGeneral.getTipoFondoControl());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoFondoControl(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoFondoControl() throws Exception {
		
		
	}
	
	public ArrayList<TipoFondoControl> getTipoFondoControlsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoFondoControl> tipofondocontrolsSeleccionados=new ArrayList<TipoFondoControl>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoFondoControl) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoFondoControl tipofondocontrolAux:tipofondocontrolLogic.getTipoFondoControls()) {
					if(tipofondocontrolAux.getIsSelected()) {
						tipofondocontrolsSeleccionados.add(tipofondocontrolAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFondoControl tipofondocontrolAux:this.tipofondocontrols) {
					if(tipofondocontrolAux.getIsSelected()) {
						tipofondocontrolsSeleccionados.add(tipofondocontrolAux);				
					}
				}
			}
			
			if(tipofondocontrolsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipofondocontrolsSeleccionados.addAll(this.tipofondocontrolLogic.getTipoFondoControls());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipofondocontrolsSeleccionados.addAll(this.tipofondocontrols);				
					}
				}
			}
		} else {
			tipofondocontrolsSeleccionados.add(this.tipofondocontrol);
		}
		
		return tipofondocontrolsSeleccionados;
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
	
	public void generarReporteTipoFondoControlsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoFondoControlsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoFondoControlsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoFondoControlsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoFondoControlsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Fondo Control",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoFondoControlsSeleccionados() throws Exception {
		ArrayList<TipoFondoControl> tipofondocontrolsSeleccionados=new ArrayList<TipoFondoControl>();		
		
		tipofondocontrolsSeleccionados=this.getTipoFondoControlsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoFondoControls("Todos",tipofondocontrolsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoFondoControlsSeleccionados() throws Exception {
		ArrayList<TipoFondoControl> tipofondocontrolsSeleccionados=new ArrayList<TipoFondoControl>();		
		
		tipofondocontrolsSeleccionados=this.getTipoFondoControlsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoFondoControls("Todos",tipofondocontrolsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoFondoControlsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoFondoControl> tipofondocontrolsSeleccionados=new ArrayList<TipoFondoControl>();
		
		tipofondocontrolsSeleccionados=this.getTipoFondoControlsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoFondoControls("Todos",tipofondocontrolsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoFondoControlsSeleccionados() throws Exception {
		ArrayList<TipoFondoControl> tipofondocontrolsSeleccionados=new ArrayList<TipoFondoControl>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoFondoControl();
		
		
		tipofondocontrolsSeleccionados=this.getTipoFondoControlsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoFondoControl();
		
		
		//this.generarReporteTipoFondoControls("Todos",tipofondocontrolsSeleccionados ,tipofondocontrolImplementable,tipofondocontrolImplementableHome);
	}
	
	public void mostrarImportacionTipoFondoControls() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoFondoControl();
		
		this.abrirFrameImportacionTipoFondoControl();		
		
			
		//this.generarReporteTipoFondoControls("Todos",tipofondocontrolsSeleccionados ,tipofondocontrolImplementable,tipofondocontrolImplementableHome);
	}
	
	public void importarTipoFondoControls() throws Exception {		
	
	}
	
	public void exportarTipoFondoControlsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoFondoControlsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoFondoControlsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoFondoControlsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Fondo Control",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoFondoControlsSeleccionados() throws Exception {
		ArrayList<TipoFondoControl> tipofondocontrolsSeleccionados=new ArrayList<TipoFondoControl>();		
		
		tipofondocontrolsSeleccionados=this.getTipoFondoControlsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofondocontrol."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoFondoControl(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoFondoControl tipofondocontrolAux:tipofondocontrolsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoFondoControl(tipofondocontrolAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipofondocontrolAux.setsDetalleGeneralEntityReporte(tipofondocontrolAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Fondo Control",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoFondoControl(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoFondoControlConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFondoControlConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFondoControlConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFondoControlConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoFondoControl(TipoFondoControl tipofondocontrol,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipofondocontrol.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipofondocontrol.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipofondocontrol.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipofondocontrol.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoFondoControlsSeleccionados() throws Exception {
		ArrayList<TipoFondoControl> tipofondocontrolsSeleccionados=new ArrayList<TipoFondoControl>();		
		
		tipofondocontrolsSeleccionados=this.getTipoFondoControlsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofondocontrol.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoFondoControls");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoFondoControl(row);				
				iRow++;
			}				
			
			for(TipoFondoControl tipofondocontrolAux:tipofondocontrolsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoFondoControl(tipofondocontrolAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Fondo Control",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoFondoControlsSeleccionados() throws Exception {
		ArrayList<TipoFondoControl> tipofondocontrolsSeleccionados=new ArrayList<TipoFondoControl>();		
		
		tipofondocontrolsSeleccionados=this.getTipoFondoControlsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofondocontrol.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipofondocontrols");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipofondocontrol");
			//elementRoot.appendChild(element);
		
			for(TipoFondoControl tipofondocontrolAux:tipofondocontrolsSeleccionados) {
				element = document.createElement("tipofondocontrol");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoFondoControl(tipofondocontrolAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Fondo Control",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoFondoControl(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFondoControlConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFondoControlConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoFondoControlConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFondoControlConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoFondoControl(TipoFondoControl tipofondocontrol,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipofondocontrol.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipofondocontrol.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipofondocontrol.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoFondoControl(TipoFondoControl tipofondocontrol,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoFondoControlConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipofondocontrol.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoFondoControlConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipofondocontrol.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoFondoControlConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipofondocontrol.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoFondoControlConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipofondocontrol.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoFondoControlsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoFondoControl> tipofondocontrolsSeleccionados=new ArrayList<TipoFondoControl>();
		
		tipofondocontrolsSeleccionados=this.getTipoFondoControlsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoFondoControl(tipofondocontrolsSeleccionados);
		
		this.generarReporteTipoFondoControls("Todos",tipofondocontrolsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoFondoControl(ArrayList<TipoFondoControl> tipofondocontrolsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoFondoControl tipofondocontrolAux:tipofondocontrolsSeleccionados) {
				tipofondocontrolAux.setsDetalleGeneralEntityReporte(tipofondocontrolAux.toString());
			
				if(sTipoSeleccionar.equals(TipoFondoControlConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipofondocontrolAux.setsDescripcionGeneralEntityReporte1(tipofondocontrolAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoFondoControlConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipofondocontrolAux.setsDescripcionGeneralEntityReporte1(tipofondocontrolAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoControlConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoFondoControl(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoFondoControl=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoFondoControl=true;
				this.isVisibilidadCeldaGuardarCambiosTipoFondoControl=true;
			}
			
			this.isVisibilidadCeldaModificarTipoFondoControl=false;
			this.isVisibilidadCeldaActualizarTipoFondoControl=false;
			this.isVisibilidadCeldaEliminarTipoFondoControl=false;
			this.isVisibilidadCeldaCancelarTipoFondoControl=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFondoControl=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFondoControl=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoFondoControl=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFondoControl=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFondoControl=false;
			this.isVisibilidadCeldaModificarTipoFondoControl=false;
			this.isVisibilidadCeldaActualizarTipoFondoControl=true;
			this.isVisibilidadCeldaEliminarTipoFondoControl=false;
			this.isVisibilidadCeldaCancelarTipoFondoControl=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFondoControl=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFondoControl=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoFondoControl=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFondoControl=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFondoControl=false;
			this.isVisibilidadCeldaModificarTipoFondoControl=false;
			this.isVisibilidadCeldaActualizarTipoFondoControl=true;
			this.isVisibilidadCeldaEliminarTipoFondoControl=true;
			this.isVisibilidadCeldaCancelarTipoFondoControl=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFondoControl=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFondoControl=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoFondoControl=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFondoControl=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFondoControl=false;
			this.isVisibilidadCeldaModificarTipoFondoControl=false;
			this.isVisibilidadCeldaActualizarTipoFondoControl=true;
			this.isVisibilidadCeldaEliminarTipoFondoControl=false;
			this.isVisibilidadCeldaCancelarTipoFondoControl=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFondoControl=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFondoControl=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoFondoControl=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFondoControl=true;
			this.isVisibilidadCeldaGuardarCambiosTipoFondoControl=true;
			this.isVisibilidadCeldaModificarTipoFondoControl=false;
			this.isVisibilidadCeldaActualizarTipoFondoControl=false;
			this.isVisibilidadCeldaEliminarTipoFondoControl=false;
			this.isVisibilidadCeldaCancelarTipoFondoControl=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFondoControl=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFondoControl=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoFondoControl=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFondoControl=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFondoControl=false;
			this.isVisibilidadCeldaActualizarTipoFondoControl=false;
			this.isVisibilidadCeldaEliminarTipoFondoControl=false;
			this.isVisibilidadCeldaCancelarTipoFondoControl=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFondoControl=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFondoControl=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoFondoControl=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFondoControl=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFondoControl=false;
			this.isVisibilidadCeldaModificarTipoFondoControl=true;
			this.isVisibilidadCeldaActualizarTipoFondoControl=false;
			this.isVisibilidadCeldaEliminarTipoFondoControl=false;
			this.isVisibilidadCeldaCancelarTipoFondoControl=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFondoControl=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFondoControl=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoFondoControlJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoFondoControl=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFondoControl=true;
			this.isVisibilidadCeldaGuardarCambiosTipoFondoControl=true;
		} else {
			this.actualizarEstadoPanelsTipoFondoControl(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoFondoControl=false;
			//this.isVisibilidadCeldaVerFormTipoFondoControl=false;
			this.isVisibilidadCeldaDuplicarTipoFondoControl=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipofondocontrolSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoFondoControl=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoFondoControl=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFondoControl=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
			if(!tipofondocontrolSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoFondoControl=false;												
			}
			
			this.jButtonCerrarTipoFondoControl.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoFondoControl=false;
		}
		
		if(!this.permiteMantenimiento(this.tipofondocontrol)) {
			this.isVisibilidadCeldaActualizarTipoFondoControl=false;
			this.isVisibilidadCeldaEliminarTipoFondoControl=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoFondoControl() {
	}
	
	public void actualizarEstadoPanelsTipoFondoControl(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoFondoControl!=null) {
				this.jScrollPanelDatosEdicionTipoFondoControl.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoFondoControl!=null) {
				this.jScrollPanelDatosTipoFondoControl.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFondoControl!=null) {
				this.jPanelPaginacionTipoFondoControl.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFondoControl!=null) {
				this.jPanelParametrosReportesTipoFondoControl.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoFondoControl!=null) {
				this.jScrollPanelDatosEdicionTipoFondoControl.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoFondoControl!=null) {
				this.jScrollPanelDatosTipoFondoControl.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFondoControl!=null) {
				this.jPanelPaginacionTipoFondoControl.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFondoControl!=null) {
				this.jPanelParametrosReportesTipoFondoControl.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoFondoControl!=null) {
				this.jScrollPanelDatosEdicionTipoFondoControl.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoFondoControl!=null) {
				this.jScrollPanelDatosTipoFondoControl.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFondoControl!=null) {
				this.jPanelPaginacionTipoFondoControl.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFondoControl!=null) {
				this.jPanelParametrosReportesTipoFondoControl.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoFondoControl!=null) {
				this.jScrollPanelDatosEdicionTipoFondoControl.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoFondoControl!=null) {
				this.jScrollPanelDatosTipoFondoControl.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFondoControl!=null) {
				this.jPanelPaginacionTipoFondoControl.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFondoControl!=null) {
				this.jPanelParametrosReportesTipoFondoControl.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoFondoControl!=null) {
				this.jScrollPanelDatosEdicionTipoFondoControl.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoFondoControl!=null) {
				this.jScrollPanelDatosTipoFondoControl.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFondoControl!=null) {
				this.jPanelPaginacionTipoFondoControl.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFondoControl!=null) {
				this.jPanelParametrosReportesTipoFondoControl.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoFondoControl!=null) {
				this.jScrollPanelDatosEdicionTipoFondoControl.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoFondoControl!=null) {
				this.jScrollPanelDatosTipoFondoControl.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFondoControl!=null) {
				this.jPanelPaginacionTipoFondoControl.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFondoControl!=null) {
				this.jPanelParametrosReportesTipoFondoControl.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoFondoControl!=null) {
				this.jScrollPanelDatosEdicionTipoFondoControl.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoFondoControl!=null) {
				this.jScrollPanelDatosTipoFondoControl.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFondoControl!=null) {
				this.jPanelPaginacionTipoFondoControl.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFondoControl!=null) {
				this.jPanelParametrosReportesTipoFondoControl.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoFondoControlSessionBean tipofondocontrolSessionBean=new TipoFondoControlSessionBean();
		
		if(this.tipofondocontrolSessionBean==null) {
			this.tipofondocontrolSessionBean=new TipoFondoControlSessionBean();
		}
		
		this.tipofondocontrolSessionBean.setsUltimaBusquedaTipoFondoControl(this.getsAccionBusqueda());
		this.tipofondocontrolSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipofondocontrolSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoFondoControlSessionBean tipofondocontrolSessionBean=new TipoFondoControlSessionBean();
		
		if(this.tipofondocontrolSessionBean==null) {
			this.tipofondocontrolSessionBean=new TipoFondoControlSessionBean();
		}
		
		if(this.tipofondocontrolSessionBean.getsUltimaBusquedaTipoFondoControl()!=null&&!this.tipofondocontrolSessionBean.getsUltimaBusquedaTipoFondoControl().equals("")) {
			this.setsAccionBusqueda(tipofondocontrolSessionBean.getsUltimaBusquedaTipoFondoControl());
			this.setiNumeroPaginacion(tipofondocontrolSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipofondocontrolSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipofondocontrolSessionBean.setsUltimaBusquedaTipoFondoControl("");
		this.tipofondocontrolSessionBean.setiNumeroPaginacion(TipoFondoControlConstantesFunciones.INUMEROPAGINACION);
		this.tipofondocontrolSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoFondoControl(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoFondoControl() {
		this.updateBorderResaltarBusquedasFormularioTipoFondoControl();
		this.updateVisibilidadBusquedasFormularioTipoFondoControl();
		this.updateHabilitarBusquedasFormularioTipoFondoControl();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoFondoControl() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoFondoControl() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoFondoControl() {
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
	
	public void updateControlesFormularioTipoFondoControl() throws Exception {

		if(this.jInternalFrameDetalleFormTipoFondoControl==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoFondoControl();
		this.updateVisibilidadResaltarControlesFormularioTipoFondoControl();
		this.updateHabilitarResaltarControlesFormularioTipoFondoControl();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoFondoControl() throws Exception {
		if(this.jInternalFrameDetalleFormTipoFondoControl==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipofondocontrolConstantesFunciones.resaltaridTipoFondoControl!=null && this.jInternalFrameDetalleFormTipoFondoControl!=null) {this.jInternalFrameDetalleFormTipoFondoControl.jTextFieldidTipoFondoControl.setBorder(this.tipofondocontrolConstantesFunciones.resaltaridTipoFondoControl);}
		if(this.tipofondocontrolConstantesFunciones.resaltarcodigoTipoFondoControl!=null && this.jInternalFrameDetalleFormTipoFondoControl!=null) {this.jInternalFrameDetalleFormTipoFondoControl.jTextFieldcodigoTipoFondoControl.setBorder(this.tipofondocontrolConstantesFunciones.resaltarcodigoTipoFondoControl);}
		if(this.tipofondocontrolConstantesFunciones.resaltarnombreTipoFondoControl!=null && this.jInternalFrameDetalleFormTipoFondoControl!=null) {this.jInternalFrameDetalleFormTipoFondoControl.jTextAreanombreTipoFondoControl.setBorder(this.tipofondocontrolConstantesFunciones.resaltarnombreTipoFondoControl);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoFondoControl() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoFondoControl==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) {
	
		//this.jInternalFrameDetalleFormTipoFondoControl.jTextFieldidTipoFondoControl.setVisible(this.tipofondocontrolConstantesFunciones.mostraridTipoFondoControl);
		this.jInternalFrameDetalleFormTipoFondoControl.jPanelidTipoFondoControl.setVisible(this.tipofondocontrolConstantesFunciones.mostraridTipoFondoControl);
		//this.jInternalFrameDetalleFormTipoFondoControl.jTextFieldcodigoTipoFondoControl.setVisible(this.tipofondocontrolConstantesFunciones.mostrarcodigoTipoFondoControl);
		this.jInternalFrameDetalleFormTipoFondoControl.jPanelcodigoTipoFondoControl.setVisible(this.tipofondocontrolConstantesFunciones.mostrarcodigoTipoFondoControl);
		//this.jInternalFrameDetalleFormTipoFondoControl.jTextAreanombreTipoFondoControl.setVisible(this.tipofondocontrolConstantesFunciones.mostrarnombreTipoFondoControl);
		this.jInternalFrameDetalleFormTipoFondoControl.jPanelnombreTipoFondoControl.setVisible(this.tipofondocontrolConstantesFunciones.mostrarnombreTipoFondoControl);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoFondoControl() throws Exception {
		if(this.jInternalFrameDetalleFormTipoFondoControl==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoFondoControl!=null) {
	
		this.jInternalFrameDetalleFormTipoFondoControl.jTextFieldidTipoFondoControl.setEnabled(this.tipofondocontrolConstantesFunciones.activaridTipoFondoControl);
		this.jInternalFrameDetalleFormTipoFondoControl.jTextFieldcodigoTipoFondoControl.setEnabled(this.tipofondocontrolConstantesFunciones.activarcodigoTipoFondoControl);
		this.jInternalFrameDetalleFormTipoFondoControl.jTextAreanombreTipoFondoControl.setEnabled(this.tipofondocontrolConstantesFunciones.activarnombreTipoFondoControl);
		}
	}
	
		
}