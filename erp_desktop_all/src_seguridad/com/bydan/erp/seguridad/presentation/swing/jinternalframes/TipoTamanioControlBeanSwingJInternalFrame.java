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

import com.bydan.erp.seguridad.util.TipoTamanioControlConstantesFunciones;
import com.bydan.erp.seguridad.util.TipoTamanioControlParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.TipoTamanioControlParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.TipoTamanioControlBean;
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
public class TipoTamanioControlBeanSwingJInternalFrame extends TipoTamanioControlJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoTamanioControlBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoTamanioControl> tipotamaniocontrolValidator = new ClassValidator<TipoTamanioControl>(TipoTamanioControl.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoTamanioControl tipotamaniocontrol;	
	public TipoTamanioControl tipotamaniocontrolAux;
	public TipoTamanioControl tipotamaniocontrolAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoTamanioControl tipotamaniocontrolTotales;
	public Long idTipoTamanioControlActual;
	public Long iIdNuevoTipoTamanioControl=0L;
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
	
	public Boolean isPermisoTodoTipoTamanioControl;
	public Boolean isPermisoNuevoTipoTamanioControl;
	public Boolean isPermisoActualizarTipoTamanioControl;
	public Boolean isPermisoActualizarOriginalTipoTamanioControl;
	public Boolean isPermisoEliminarTipoTamanioControl;
	public Boolean isPermisoGuardarCambiosTipoTamanioControl;
	public Boolean isPermisoConsultaTipoTamanioControl;
	public Boolean isPermisoBusquedaTipoTamanioControl;
	public Boolean isPermisoReporteTipoTamanioControl;
	public Boolean isPermisoPaginacionMedioTipoTamanioControl;
	public Boolean isPermisoPaginacionAltoTipoTamanioControl;
	public Boolean isPermisoPaginacionTodoTipoTamanioControl;
	public Boolean isPermisoCopiarTipoTamanioControl;
	public Boolean isPermisoVerFormTipoTamanioControl;
	public Boolean isPermisoDuplicarTipoTamanioControl;
	public Boolean isPermisoOrdenTipoTamanioControl;
	
	
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
	
	public TipoTamanioControlParameterReturnGeneral tipotamaniocontrolReturnGeneral;
	public TipoTamanioControlParameterReturnGeneral tipotamaniocontrolParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoTamanioControl=false;
	public Boolean esParaAccionDesdeFormularioTipoTamanioControl=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoTamanioControlLogic tipotamaniocontrolLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoTamanioControl tipotamaniocontrolBean;
	public TipoTamanioControlConstantesFunciones tipotamaniocontrolConstantesFunciones;
	//public TipoTamanioControlParameterReturnGeneral tipotamaniocontrolReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoTamanioControl> tipotamaniocontrols;	
	//public List<TipoTamanioControl> tipotamaniocontrolsEliminados;
	//public List<TipoTamanioControl> tipotamaniocontrolsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoTamanioControl=false;
	public Boolean isVisibilidadCeldaDuplicarTipoTamanioControl=true;
	public Boolean isVisibilidadCeldaCopiarTipoTamanioControl=true;
	public Boolean isVisibilidadCeldaVerFormTipoTamanioControl=true;
	public Boolean isVisibilidadCeldaOrdenTipoTamanioControl=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoTamanioControl=false;
	public Boolean isVisibilidadCeldaModificarTipoTamanioControl=false;
	public Boolean isVisibilidadCeldaActualizarTipoTamanioControl=false;
	public Boolean isVisibilidadCeldaEliminarTipoTamanioControl=false;
	public Boolean isVisibilidadCeldaCancelarTipoTamanioControl=false;
	public Boolean isVisibilidadCeldaGuardarTipoTamanioControl=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoTamanioControl=false;	
	
	
	
	public Long getiIdNuevoTipoTamanioControl() {
		return this.iIdNuevoTipoTamanioControl;
	}

	public void setiIdNuevoTipoTamanioControl(Long iIdNuevoTipoTamanioControl) {
		this.iIdNuevoTipoTamanioControl = iIdNuevoTipoTamanioControl;
	}
	
	public Long getidTipoTamanioControlActual() {
		return this.idTipoTamanioControlActual;
	}

	public void setidTipoTamanioControlActual(Long idTipoTamanioControlActual) {
		this.idTipoTamanioControlActual = idTipoTamanioControlActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoTamanioControl gettipotamaniocontrol() {
		return this.tipotamaniocontrol;
	}

	public void settipotamaniocontrol(TipoTamanioControl tipotamaniocontrol) {
		this.tipotamaniocontrol = tipotamaniocontrol;
	}
	
	public TipoTamanioControl gettipotamaniocontrolAux() {
		return this.tipotamaniocontrolAux;
	}

	public void settipotamaniocontrolAux(TipoTamanioControl tipotamaniocontrolAux) {
		this.tipotamaniocontrolAux = tipotamaniocontrolAux;
	}				
	
	public TipoTamanioControl gettipotamaniocontrolAnterior() {
		return this.tipotamaniocontrolAnterior;
	}

	public void settipotamaniocontrolAnterior(TipoTamanioControl tipotamaniocontrolAnterior) {
		this.tipotamaniocontrolAnterior = tipotamaniocontrolAnterior;
	}	
	
	public TipoTamanioControl gettipotamaniocontrolTotales() {
		return this.tipotamaniocontrolTotales;
	}

	public void settipotamaniocontrolTotales(TipoTamanioControl tipotamaniocontrolTotales) {
		this.tipotamaniocontrolTotales = tipotamaniocontrolTotales;
	}	
	
	public TipoTamanioControl gettipotamaniocontrolBean() {
		return this.tipotamaniocontrolBean;
	}

	public void settipotamaniocontrolBean(TipoTamanioControl tipotamaniocontrolBean) {
		this.tipotamaniocontrolBean = tipotamaniocontrolBean;
	}	
	
	public TipoTamanioControlParameterReturnGeneral gettipotamaniocontrolReturnGeneral() {
		return this.tipotamaniocontrolReturnGeneral;
	}

	public void settipotamaniocontrolReturnGeneral(TipoTamanioControlParameterReturnGeneral tipotamaniocontrolReturnGeneral) {
		this.tipotamaniocontrolReturnGeneral = tipotamaniocontrolReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoTamanioControlLogic getTipoTamanioControlLogic()	{		
		return tipotamaniocontrolLogic;
	}

	public void setTipoTamanioControlLogic(TipoTamanioControlLogic tipotamaniocontrolLogic) {
		this.tipotamaniocontrolLogic = tipotamaniocontrolLogic;
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
	
	public Boolean getIsEsNuevoTipoTamanioControl() {
		return isEsNuevoTipoTamanioControl;
	}

	public void setIsEsNuevoTipoTamanioControl(Boolean isEsNuevoTipoTamanioControl) {
		this.isEsNuevoTipoTamanioControl = isEsNuevoTipoTamanioControl;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoTamanioControl() {
		return esParaAccionDesdeFormularioTipoTamanioControl;
	}
	
	public void setEsParaAccionDesdeFormularioTipoTamanioControl(Boolean esParaAccionDesdeFormularioTipoTamanioControl) {
		this.esParaAccionDesdeFormularioTipoTamanioControl = esParaAccionDesdeFormularioTipoTamanioControl;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoTamanioControl() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoTamanioControlConstantesFunciones.refrescarForeignKeysDescripcionesTipoTamanioControl(this.tipotamaniocontrolLogic.getTipoTamanioControls());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoTamanioControlConstantesFunciones.refrescarForeignKeysDescripcionesTipoTamanioControl(this.tipotamaniocontrols);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipotamaniocontrolLogic.setTipoTamanioControls(this.tipotamaniocontrols);
			tipotamaniocontrolLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoTamanioControlParameterReturnGeneral getTipoTamanioControlParameterGeneral() {
		return this.tipotamaniocontrolParameterGeneral;
	}
	
	public void setTipoTamanioControlParameterGeneral(TipoTamanioControlParameterReturnGeneral tipotamaniocontrolParameterGeneral) {
		this.tipotamaniocontrolParameterGeneral = tipotamaniocontrolParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoTamanioControl() {
		return isPermisoTodoTipoTamanioControl;
	}

	public void setIsPermisoTodoTipoTamanioControl(Boolean isPermisoTodoTipoTamanioControl) {
		this.isPermisoTodoTipoTamanioControl = isPermisoTodoTipoTamanioControl;
	}

	public Boolean getIsPermisoNuevoTipoTamanioControl() {
		return isPermisoNuevoTipoTamanioControl;
	}

	public void setIsPermisoNuevoTipoTamanioControl(Boolean isPermisoNuevoTipoTamanioControl) {
		this.isPermisoNuevoTipoTamanioControl = isPermisoNuevoTipoTamanioControl;
	}

	public Boolean getIsPermisoActualizarTipoTamanioControl() {
		return isPermisoActualizarTipoTamanioControl;
	}

	public void setIsPermisoActualizarTipoTamanioControl(Boolean isPermisoActualizarTipoTamanioControl) {
		this.isPermisoActualizarTipoTamanioControl = isPermisoActualizarTipoTamanioControl;
	}

	public Boolean getIsPermisoEliminarTipoTamanioControl() {
		return isPermisoEliminarTipoTamanioControl;
	}

	public void setIsPermisoEliminarTipoTamanioControl(Boolean isPermisoEliminarTipoTamanioControl) {
		this.isPermisoEliminarTipoTamanioControl = isPermisoEliminarTipoTamanioControl;
	}

	public Boolean getIsPermisoGuardarCambiosTipoTamanioControl() {
		return isPermisoGuardarCambiosTipoTamanioControl;
	}

	public void setIsPermisoGuardarCambiosTipoTamanioControl(Boolean isPermisoGuardarCambiosTipoTamanioControl) {
		this.isPermisoGuardarCambiosTipoTamanioControl = isPermisoGuardarCambiosTipoTamanioControl;
	}
	
	public Boolean getIsPermisoConsultaTipoTamanioControl() {
		return isPermisoConsultaTipoTamanioControl;
	}

	public void setIsPermisoConsultaTipoTamanioControl(Boolean isPermisoConsultaTipoTamanioControl) {
		this.isPermisoConsultaTipoTamanioControl = isPermisoConsultaTipoTamanioControl;
	}

	public Boolean getIsPermisoBusquedaTipoTamanioControl() {
		return isPermisoBusquedaTipoTamanioControl;
	}

	public void setIsPermisoBusquedaTipoTamanioControl(Boolean isPermisoBusquedaTipoTamanioControl) {
		this.isPermisoBusquedaTipoTamanioControl = isPermisoBusquedaTipoTamanioControl;
	}

	public Boolean getIsPermisoReporteTipoTamanioControl() {
		return isPermisoReporteTipoTamanioControl;
	}

	public void setIsPermisoReporteTipoTamanioControl(Boolean isPermisoReporteTipoTamanioControl) {
		this.isPermisoReporteTipoTamanioControl = isPermisoReporteTipoTamanioControl;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoTamanioControl() {
		return isPermisoPaginacionMedioTipoTamanioControl;
	}

	public void setIsPermisoPaginacionMedioTipoTamanioControl(Boolean isPermisoPaginacionMedioTipoTamanioControl) {
		this.isPermisoPaginacionMedioTipoTamanioControl = isPermisoPaginacionMedioTipoTamanioControl;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoTamanioControl() {
		return isPermisoPaginacionTodoTipoTamanioControl;
	}

	public void setIsPermisoPaginacionTodoTipoTamanioControl(Boolean isPermisoPaginacionTodoTipoTamanioControl) {
		this.isPermisoPaginacionTodoTipoTamanioControl = isPermisoPaginacionTodoTipoTamanioControl;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoTamanioControl() {
		return isPermisoPaginacionAltoTipoTamanioControl;
	}

	public void setIsPermisoPaginacionAltoTipoTamanioControl(Boolean isPermisoPaginacionAltoTipoTamanioControl) {
		this.isPermisoPaginacionAltoTipoTamanioControl = isPermisoPaginacionAltoTipoTamanioControl;
	}
	
	public Boolean getIsPermisoCopiarTipoTamanioControl() {
		return isPermisoCopiarTipoTamanioControl;
	}

	public void setIsPermisoCopiarTipoTamanioControl(Boolean isPermisoCopiarTipoTamanioControl) {
		this.isPermisoCopiarTipoTamanioControl = isPermisoCopiarTipoTamanioControl;
	}
	
	public Boolean getIsPermisoVerFormTipoTamanioControl() {
		return isPermisoVerFormTipoTamanioControl;
	}

	public void setIsPermisoVerFormTipoTamanioControl(Boolean isPermisoVerFormTipoTamanioControl) {
		this.isPermisoVerFormTipoTamanioControl = isPermisoVerFormTipoTamanioControl;
	}
	
	public Boolean getIsPermisoDuplicarTipoTamanioControl() {
		return isPermisoDuplicarTipoTamanioControl;
	}

	public void setIsPermisoDuplicarTipoTamanioControl(Boolean isPermisoDuplicarTipoTamanioControl) {
		this.isPermisoDuplicarTipoTamanioControl = isPermisoDuplicarTipoTamanioControl;
	}
	
	public Boolean getIsPermisoOrdenTipoTamanioControl() {
		return isPermisoOrdenTipoTamanioControl;
	}

	public void setIsPermisoOrdenTipoTamanioControl(Boolean isPermisoOrdenTipoTamanioControl) {
		this.isPermisoOrdenTipoTamanioControl = isPermisoOrdenTipoTamanioControl;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoTamanioControl() {
		return isVisibilidadCeldaNuevoTipoTamanioControl;
	}

	public void setIsVisibilidadCeldaNuevoTipoTamanioControl(Boolean isVisibilidadCeldaNuevoTipoTamanioControl) {
		this.isVisibilidadCeldaNuevoTipoTamanioControl = isVisibilidadCeldaNuevoTipoTamanioControl;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoTamanioControl() {
		return isVisibilidadCeldaDuplicarTipoTamanioControl;
	}

	public void setIsVisibilidadCeldaDuplicarTipoTamanioControl(Boolean isVisibilidadCeldaDuplicarTipoTamanioControl) {
		this.isVisibilidadCeldaDuplicarTipoTamanioControl = isVisibilidadCeldaDuplicarTipoTamanioControl;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoTamanioControl() {
		return isVisibilidadCeldaCopiarTipoTamanioControl;
	}

	public void setIsVisibilidadCeldaCopiarTipoTamanioControl(Boolean isVisibilidadCeldaCopiarTipoTamanioControl) {
		this.isVisibilidadCeldaCopiarTipoTamanioControl = isVisibilidadCeldaCopiarTipoTamanioControl;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoTamanioControl() {
		return isVisibilidadCeldaVerFormTipoTamanioControl;
	}

	public void setIsVisibilidadCeldaVerFormTipoTamanioControl(Boolean isVisibilidadCeldaVerFormTipoTamanioControl) {
		this.isVisibilidadCeldaVerFormTipoTamanioControl = isVisibilidadCeldaVerFormTipoTamanioControl;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoTamanioControl() {
		return isVisibilidadCeldaOrdenTipoTamanioControl;
	}

	public void setIsVisibilidadCeldaOrdenTipoTamanioControl(Boolean isVisibilidadCeldaOrdenTipoTamanioControl) {
		this.isVisibilidadCeldaOrdenTipoTamanioControl = isVisibilidadCeldaOrdenTipoTamanioControl;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoTamanioControl() {
		return isVisibilidadCeldaNuevoRelacionesTipoTamanioControl;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoTamanioControl(Boolean isVisibilidadCeldaNuevoRelacionesTipoTamanioControl) {
		this.isVisibilidadCeldaNuevoRelacionesTipoTamanioControl = isVisibilidadCeldaNuevoRelacionesTipoTamanioControl;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoTamanioControl() {
		return isVisibilidadCeldaModificarTipoTamanioControl;
	}

	public void setIsVisibilidadCeldaModificarTipoTamanioControl(Boolean isVisibilidadCeldaModificarTipoTamanioControl) {
		this.isVisibilidadCeldaModificarTipoTamanioControl = isVisibilidadCeldaModificarTipoTamanioControl;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoTamanioControl() {
		return isVisibilidadCeldaActualizarTipoTamanioControl;
	}

	public void setIsVisibilidadCeldaActualizarTipoTamanioControl(Boolean isVisibilidadCeldaActualizarTipoTamanioControl) {
		this.isVisibilidadCeldaActualizarTipoTamanioControl = isVisibilidadCeldaActualizarTipoTamanioControl;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoTamanioControl() {
		return isVisibilidadCeldaEliminarTipoTamanioControl;
	}

	public void setIsVisibilidadCeldaEliminarTipoTamanioControl(Boolean isVisibilidadCeldaEliminarTipoTamanioControl) {
		this.isVisibilidadCeldaEliminarTipoTamanioControl = isVisibilidadCeldaEliminarTipoTamanioControl;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoTamanioControl() {
		return isVisibilidadCeldaCancelarTipoTamanioControl;
	}

	public void setIsVisibilidadCeldaCancelarTipoTamanioControl(Boolean isVisibilidadCeldaCancelarTipoTamanioControl) {
		this.isVisibilidadCeldaCancelarTipoTamanioControl = isVisibilidadCeldaCancelarTipoTamanioControl;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoTamanioControl() {
		return isVisibilidadCeldaGuardarTipoTamanioControl;
	}

	public void setIsVisibilidadCeldaGuardarTipoTamanioControl(Boolean isVisibilidadCeldaGuardarTipoTamanioControl) {
		this.isVisibilidadCeldaGuardarTipoTamanioControl = isVisibilidadCeldaGuardarTipoTamanioControl;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoTamanioControl() {
		return isVisibilidadCeldaGuardarCambiosTipoTamanioControl;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoTamanioControl(Boolean isVisibilidadCeldaGuardarCambiosTipoTamanioControl) {
		this.isVisibilidadCeldaGuardarCambiosTipoTamanioControl = isVisibilidadCeldaGuardarCambiosTipoTamanioControl;
	}
		
	public TipoTamanioControlSessionBean gettipotamaniocontrolSessionBean() {
		return this.tipotamaniocontrolSessionBean;
	}
	
	public void settipotamaniocontrolSessionBean(TipoTamanioControlSessionBean tipotamaniocontrolSessionBean) {
		this.tipotamaniocontrolSessionBean=tipotamaniocontrolSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoTamanioControl(TipoTamanioControl tipotamaniocontrol)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoTamanioControl tipotamaniocontrol,TipoTamanioControl tipotamaniocontrolAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoTamanioControl(tipotamaniocontrol);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipotamaniocontrolAux.setId(tipotamaniocontrol.getId());
		tipotamaniocontrolAux.setVersionRow(tipotamaniocontrol.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoTamanioControl();
		
			int intSelectedRow = this.jTableDatosTipoTamanioControl.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoTamanioControlJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoTamanioControl(this.tipotamaniocontrol,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTamanioControl(this.tipotamaniocontrol);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipotamaniocontrolValidator.getInvalidValues(this.tipotamaniocontrol);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipotamaniocontrolLogic.setDatosCliente(datosCliente);
			tipotamaniocontrolLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipotamaniocontrolAux=new  TipoTamanioControl();
				
				tipotamaniocontrolAux.setIsNew(true);
				tipotamaniocontrolAux.setIsChanged(true);
				
				tipotamaniocontrolAux.setTipoTamanioControlOriginal(this.tipotamaniocontrol);
				
				tipotamaniocontrolAux.setId(this.tipotamaniocontrol.getId());	
				tipotamaniocontrolAux.setVersionRow(this.tipotamaniocontrol.getVersionRow());	
				tipotamaniocontrolAux.setcodigo(this.tipotamaniocontrol.getcodigo());	
				tipotamaniocontrolAux.setnombre(this.tipotamaniocontrol.getnombre());	
				tipotamaniocontrolAux.setdescripcion(this.tipotamaniocontrol.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipotamaniocontrolSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipotamaniocontrolAux,tipotamaniocontrolLogic.getTipoTamanioControls());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipotamaniocontrolAux,tipotamaniocontrols);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipotamaniocontrolSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotamaniocontrolLogic.saveTipoTamanioControls();//WithConnection
						//tipotamaniocontrolLogic.getSetVersionRowTipoTamanioControls();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipotamaniocontrol,tipotamaniocontrolAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipotamaniocontrolAux=new  TipoTamanioControl();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado() 
					|| (this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado() && this.tipotamaniocontrol.getId()>=0)) {
						
					tipotamaniocontrolAux.setIsNew(false);
				}
				
				tipotamaniocontrolAux.setIsDeleted(false);
			
				tipotamaniocontrolAux.setId(this.tipotamaniocontrol.getId());	
				tipotamaniocontrolAux.setVersionRow(this.tipotamaniocontrol.getVersionRow());	
				tipotamaniocontrolAux.setcodigo(this.tipotamaniocontrol.getcodigo());	
				tipotamaniocontrolAux.setnombre(this.tipotamaniocontrol.getnombre());	
				tipotamaniocontrolAux.setdescripcion(this.tipotamaniocontrol.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipotamaniocontrolAux,tipotamaniocontrolLogic.getTipoTamanioControls());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipotamaniocontrolAux,tipotamaniocontrols);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipotamaniocontrolSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotamaniocontrolLogic.saveTipoTamanioControls();//WithConnection
						//tipotamaniocontrolLogic.getSetVersionRowTipoTamanioControls();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipotamaniocontrol,tipotamaniocontrolAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipotamaniocontrolAux=new  TipoTamanioControl();
				
				tipotamaniocontrolAux.setIsNew(false);
				tipotamaniocontrolAux.setIsChanged(false);
				
				tipotamaniocontrolAux.setIsDeleted(true);
				
				tipotamaniocontrolAux.setId(this.tipotamaniocontrol.getId());	
				tipotamaniocontrolAux.setVersionRow(this.tipotamaniocontrol.getVersionRow());	
				tipotamaniocontrolAux.setcodigo(this.tipotamaniocontrol.getcodigo());	
				tipotamaniocontrolAux.setnombre(this.tipotamaniocontrol.getnombre());	
				tipotamaniocontrolAux.setdescripcion(this.tipotamaniocontrol.getdescripcion());	
				
				if(this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipotamaniocontrolAux.getId()>=0) {	
						this.tipotamaniocontrolsEliminados.add(tipotamaniocontrolAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipotamaniocontrolAux,tipotamaniocontrolLogic.getTipoTamanioControls());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipotamaniocontrolAux,tipotamaniocontrols);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipotamaniocontrolSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotamaniocontrolLogic.saveTipoTamanioControls();//WithConnection
						//tipotamaniocontrolLogic.getSetVersionRowTipoTamanioControls();//WithConnection
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
					this.tipotamaniocontrolLogic.getTipoTamanioControls().addAll(this.tipotamaniocontrolsEliminados);
					
					tipotamaniocontrolLogic.saveTipoTamanioControls();//WithConnection
					//tipotamaniocontrolLogic.getSetVersionRowTipoTamanioControls();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipotamaniocontrolsEliminados= new ArrayList<TipoTamanioControl>();		
			}
			
			if(this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Tamanio Control GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Tamanio Control",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipotamaniocontrol=tipotamaniocontrolAux;
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
      		//this.finishProcessTipoTamanioControl();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoTamanioControl tipotamaniocontrolLocal) throws Exception {
		
		if(this.tipotamaniocontrolSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoTamanioControl tipotamaniocontrolLocal) throws Exception {	
		if(this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoTamanioControlActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoTamanioControl.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipotamaniocontrolValidator.getInvalidValues(this.tipotamaniocontrol);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoTamanioControl tipotamaniocontrol,List<TipoTamanioControl> tipotamaniocontrols) throws Exception {
		try	{		
			TipoTamanioControlConstantesFunciones.actualizarLista(tipotamaniocontrol,tipotamaniocontrols,this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoTamanioControl tipotamaniocontrol,List<TipoTamanioControl> tipotamaniocontrols) throws Exception {
		try	{			
			TipoTamanioControlConstantesFunciones.actualizarSelectedLista(tipotamaniocontrol,tipotamaniocontrols);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoTamanioControl> tipotamaniocontrolsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipotamaniocontrolsLocal=this.tipotamaniocontrolLogic.getTipoTamanioControls();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipotamaniocontrolsLocal=this.tipotamaniocontrols;
			}
			//ARCHITECTURE
		
			for(TipoTamanioControl tipotamaniocontrolLocal:tipotamaniocontrolsLocal) {
				if(this.permiteMantenimiento(tipotamaniocontrolLocal) && tipotamaniocontrolLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoTamanioControlConstantesFunciones.getTipoTamanioControlLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoTamanioControlConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTamanioControl.jLabelcodigoTipoTamanioControl,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoTamanioControlConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTamanioControl.jLabelnombreTipoTamanioControl,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoTamanioControlConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTamanioControl.jLabeldescripcionTipoTamanioControl,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoTamanioControl.jLabelcodigoTipoTamanioControl,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoTamanioControl.jLabelnombreTipoTamanioControl,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoTamanioControl.jLabeldescripcionTipoTamanioControl,"");
		
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
		this.iIdNuevoTipoTamanioControl--;	
		
		
		this.tipotamaniocontrolAux=new TipoTamanioControl();
		
		this.tipotamaniocontrolAux.setId(this.iIdNuevoTipoTamanioControl);
		this.tipotamaniocontrolAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipotamaniocontrolLogic.getTipoTamanioControls().add(this.tipotamaniocontrolAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipotamaniocontrols.add(this.tipotamaniocontrolAux);
		}
		//ARCHITECTURE
		
		this.tipotamaniocontrol=this.tipotamaniocontrolAux;
		
		if(TipoTamanioControlJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoTamanioControl(this.tipotamaniocontrol);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoTamanioControl(this.tipotamaniocontrol);
		}
				
		//this.setDefaultControlesTipoTamanioControl();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoTamanioControl();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoTamanioControl();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoTamanioControl();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoTamanioControl(this.tipotamaniocontrolBean,this.tipotamaniocontrol,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoTamanioControl(this.tipotamaniocontrol);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoTamanioControlConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipotamaniocontrolSessionBean.getConGuardarRelaciones()) {
			classes=TipoTamanioControlConstantesFunciones.getClassesRelationshipsOfTipoTamanioControl(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipotamaniocontrolReturnGeneral=tipotamaniocontrolLogic.procesarEventosTipoTamanioControlsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipotamaniocontrolLogic.getTipoTamanioControls(),this.tipotamaniocontrol,this.tipotamaniocontrolParameterGeneral,this.isEsNuevoTipoTamanioControl,classes);//this.tipotamaniocontrolLogic.getTipoTamanioControl()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoTamanioControl(this.tipotamaniocontrolReturnGeneral,this.tipotamaniocontrolBean,false);
		
		if(this.tipotamaniocontrolReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoTamanioControl(this.tipotamaniocontrolReturnGeneral.getTipoTamanioControl());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoTamanioControl(this.tipotamaniocontrolReturnGeneral.getTipoTamanioControl());
		}
		
		if(this.tipotamaniocontrolReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoTamanioControl(this.tipotamaniocontrolReturnGeneral.getTipoTamanioControl(),classes);//this.tipotamaniocontrolBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoTamanioControl(this.tipotamaniocontrol,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoTamanioControl();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoTamanioControl();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoTamanioControl(false);
						
			if(tipotamaniocontrolSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoTamanioControlJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoTamanioControl();
			}
			
			this.actualizarVisualTableDatosTipoTamanioControl();
			
			this.jTableDatosTipoTamanioControl.setRowSelectionInterval(this.getIndiceNuevoTipoTamanioControl(), this.getIndiceNuevoTipoTamanioControl());
			
			this.seleccionarFilaTablaTipoTamanioControlActual();
						
			this.actualizarEstadoCeldasBotonesTipoTamanioControl("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoTamanioControl(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoTamanioControl.jTextFieldcodigoTipoTamanioControl.setEnabled(isHabilitar && this.tipotamaniocontrolConstantesFunciones.activarcodigoTipoTamanioControl);
		this.jInternalFrameDetalleFormTipoTamanioControl.jTextAreanombreTipoTamanioControl.setEnabled(isHabilitar && this.tipotamaniocontrolConstantesFunciones.activarnombreTipoTamanioControl);
		this.jInternalFrameDetalleFormTipoTamanioControl.jTextAreadescripcionTipoTamanioControl.setEnabled(isHabilitar && this.tipotamaniocontrolConstantesFunciones.activardescripcionTipoTamanioControl);	
		
	};
	
	public void setDefaultControlesTipoTamanioControl() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoTamanioControl(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipotamaniocontrolSessionBean.setConGuardarRelaciones(true);			
			this.tipotamaniocontrolSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoTamanioControl.jTabbedPaneRelacionesTipoTamanioControl.setVisible(true);
			
					
		} else {
			//this.tipotamaniocontrolSessionBean.setConGuardarRelaciones(false);			
			this.tipotamaniocontrolSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoTamanioControl.jTabbedPaneRelacionesTipoTamanioControl.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoTamanioControl() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTamanioControl tipotamaniocontrolAux:this.tipotamaniocontrolLogic.getTipoTamanioControls()) {
				if(tipotamaniocontrolAux.getId().equals(this.iIdNuevoTipoTamanioControl)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTamanioControl tipotamaniocontrolAux:this.tipotamaniocontrols) {
				if(tipotamaniocontrolAux.getId().equals(this.iIdNuevoTipoTamanioControl)) {
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
	
	public int getIndiceActualTipoTamanioControl(TipoTamanioControl tipotamaniocontrol,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTamanioControl tipotamaniocontrolAux:this.tipotamaniocontrolLogic.getTipoTamanioControls()) {
				if(tipotamaniocontrolAux.getId().equals(tipotamaniocontrol.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTamanioControl tipotamaniocontrolAux:this.tipotamaniocontrols) {
				if(tipotamaniocontrolAux.getId().equals(tipotamaniocontrol.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoTamanioControl(TipoTamanioControl tipotamaniocontrolOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTamanioControl tipotamaniocontrolAux:this.tipotamaniocontrolLogic.getTipoTamanioControls()) {
				if(tipotamaniocontrolAux.getTipoTamanioControlOriginal().getId().equals(tipotamaniocontrolOriginal.getId())) {
					existe=true;
					tipotamaniocontrolOriginal.setId(tipotamaniocontrolAux.getId());
					tipotamaniocontrolOriginal.setVersionRow(tipotamaniocontrolAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTamanioControl tipotamaniocontrolAux:this.tipotamaniocontrols) {
				if(tipotamaniocontrolAux.getTipoTamanioControlOriginal().getId().equals(tipotamaniocontrolOriginal.getId())) {
					existe=true;
					tipotamaniocontrolOriginal.setId(tipotamaniocontrolAux.getId());
					tipotamaniocontrolOriginal.setVersionRow(tipotamaniocontrolAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoTamanioControl(Boolean esParaCancelar) throws Exception {
		tipotamaniocontrolsAux=new ArrayList<TipoTamanioControl>();
		tipotamaniocontrolAux=new TipoTamanioControl();
		
		if(!this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoTamanioControl tipotamaniocontrolAux:this.tipotamaniocontrolLogic.getTipoTamanioControls()) {
					if(tipotamaniocontrolAux.getId()<0) {
						tipotamaniocontrolsAux.add(tipotamaniocontrolAux);
					}		
				}
				this.iIdNuevoTipoTamanioControl=0L;
				this.tipotamaniocontrolLogic.getTipoTamanioControls().removeAll(tipotamaniocontrolsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTamanioControl tipotamaniocontrolAux:this.tipotamaniocontrols) {
					if(tipotamaniocontrolAux.getId()<0) {
						tipotamaniocontrolsAux.add(tipotamaniocontrolAux);
					}		
				}
				this.iIdNuevoTipoTamanioControl=0L;
				this.tipotamaniocontrols.removeAll(tipotamaniocontrolsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoTamanioControl 
					&& this.tipotamaniocontrolLogic.getTipoTamanioControls().size()>0
					) {
					tipotamaniocontrolAux=this.tipotamaniocontrolLogic.getTipoTamanioControls().get(this.tipotamaniocontrolLogic.getTipoTamanioControls().size() - 1);
				
					if(tipotamaniocontrolAux.getId()<0) {
						this.tipotamaniocontrolLogic.getTipoTamanioControls().remove(tipotamaniocontrolAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoTamanioControl && this.tipotamaniocontrols.size()>0) {
					tipotamaniocontrolAux=this.tipotamaniocontrols.get(this.tipotamaniocontrols.size() - 1);
				
					if(tipotamaniocontrolAux.getId()<0) {
						this.tipotamaniocontrols.remove(tipotamaniocontrolAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoTamanioControl(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipotamaniocontrol.getId()<0) {
				this.tipotamaniocontrolLogic.getTipoTamanioControls().remove(this.tipotamaniocontrol);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipotamaniocontrol.getId()<0) {
				this.tipotamaniocontrols.remove(this.tipotamaniocontrol);
			}
		}			
	}
	
	public void setEstadosInicialesTipoTamanioControl(List<TipoTamanioControl> tipotamaniocontrolsAux) throws Exception {
		TipoTamanioControlConstantesFunciones.setEstadosInicialesTipoTamanioControl(tipotamaniocontrolsAux);
	}
	
	public void setEstadosInicialesTipoTamanioControl(TipoTamanioControl tipotamaniocontrolAux) throws Exception {
		TipoTamanioControlConstantesFunciones.setEstadosInicialesTipoTamanioControl(tipotamaniocontrolAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoTamanioControlActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoTamanioControl("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoTamanioControlActual()) {
				if(!this.isEsNuevoTipoTamanioControl) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoTamanioControl("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoTamanioControl=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoTamanioControlActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Tamanio Control ?", "MANTENIMIENTO DE Tipo Tamanio Control", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoTamanioControl("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoTamanioControl tipotamaniocontrol) throws Exception {
		TipoTamanioControlConstantesFunciones.seleccionarAsignar(this.tipotamaniocontrol,tipotamaniocontrol);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoTamanioControl=this.isPermisoActualizarOriginalTipoTamanioControl;
			
			
			this.seleccionarAsignar(tipotamaniocontrol);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoTamanioControlConstantesFunciones.quitarEspaciosTipoTamanioControl(this.tipotamaniocontrol,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoTamanioControl("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipotamaniocontrolSessionBean.setsFuncionBusquedaRapida(this.tipotamaniocontrolSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoTamanioControl) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoTamanioControl(esParaCancelar);				
				this.cancelarNuevoTipoTamanioControl(esParaCancelar);								
			}
			
			this.tipotamaniocontrol=new TipoTamanioControl();
			
			this.inicializarTipoTamanioControl();
			
			this.actualizarEstadoCeldasBotonesTipoTamanioControl("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoTamanioControl() throws Exception {
		try {
			TipoTamanioControlConstantesFunciones.inicializarTipoTamanioControl(this.tipotamaniocontrol);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipotamaniocontrolLogic.getTipoTamanioControls().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoTamanioControls(String sAccionBusqueda,List<TipoTamanioControl> tipotamaniocontrolsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoTamanioControl"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoTamanioControlMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoTamanioControlMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoTamanioControl"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Tamanio Controls");		
		parameters.put("busquedapor", TipoTamanioControlConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoTamanioControl=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoTamanioControlConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoTamanioControlConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoTamanioControl=new JRBeanArrayDataSource(TipoTamanioControlJInternalFrame.TraerTipoTamanioControlBeans(tipotamaniocontrolsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoTamanioControl);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoTamanioControlConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoTamanioControlConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoTamanioControlBean.TraerTipoTamanioControlBeans(tipotamaniocontrolsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoTamanioControls(sAccionBusqueda,sTipoArchivoReporte,tipotamaniocontrolsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoTamanioControls(sAccionBusqueda,sTipoArchivoReporte,tipotamaniocontrolsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoTamanioControlActionPerformed(null);
					//this.generarExcelReporteTipoTamanioControls(sAccionBusqueda,sTipoArchivoReporte,tipotamaniocontrolsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoTamanioControls(sAccionBusqueda,sTipoArchivoReporte,tipotamaniocontrolsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoTamanioControls(sAccionBusqueda,sTipoArchivoReporte,tipotamaniocontrolsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoTamanioControls(sAccionBusqueda,sTipoArchivoReporte,tipotamaniocontrolsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoTamanioControls(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoTamanioControl> tipotamaniocontrolsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotamaniocontrol";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoTamanioControls");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoTamanioControl("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoTamanioControl tipotamaniocontrol : tipotamaniocontrolsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoTamanioControlConstantesFunciones.generarExcelReporteDataTipoTamanioControl("NORMAL",row,workbook,tipotamaniocontrol,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Tamanio Control",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoTamanioControl(String sTipo,Row row,Workbook workbook) {
		
		TipoTamanioControlConstantesFunciones.generarExcelReporteHeaderTipoTamanioControl(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoTamanioControls(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoTamanioControl> tipotamaniocontrolsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotamaniocontrol_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoTamanioControls");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoTamanioControl tipotamaniocontrol : tipotamaniocontrolsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoTamanioControlConstantesFunciones.getTipoTamanioControlDescripcion(tipotamaniocontrol));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoTamanioControlConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoTamanioControlConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipotamaniocontrol.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoTamanioControlConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoTamanioControlConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipotamaniocontrol.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoTamanioControlConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoTamanioControlConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipotamaniocontrol.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Tamanio Control",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoTamanioControls(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoTamanioControl> tipotamaniocontrolsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoTamanioControl> tipotamaniocontrolsRespaldo=null;
		
		classes=TipoTamanioControlConstantesFunciones.getClassesRelationshipsOfTipoTamanioControl(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipotamaniocontrolLogic.setDatosCliente(this.datosCliente);
		this.tipotamaniocontrolLogic.setDatosDeep(this.datosDeep);
		this.tipotamaniocontrolLogic.setIsConDeep(true);
		
		tipotamaniocontrolsRespaldo=this.tipotamaniocontrolLogic.getTipoTamanioControls();
		
		this.tipotamaniocontrolLogic.setTipoTamanioControls(tipotamaniocontrolsParaReportes);	
		this.tipotamaniocontrolLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipotamaniocontrolsParaReportes=this.tipotamaniocontrolLogic.getTipoTamanioControls();
		this.tipotamaniocontrolLogic.setTipoTamanioControls(tipotamaniocontrolsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotamaniocontrol_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoTamanioControls");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoTamanioControl("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoTamanioControl tipotamaniocontrol : tipotamaniocontrolsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoTamanioControl("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoTamanioControlConstantesFunciones.generarExcelReporteDataTipoTamanioControl("NORMAL",row,workbook,tipotamaniocontrol,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoTamanioControlConstantesFunciones.getTipoTamanioControlDescripcion(tipotamaniocontrol));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Tamanio Control",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoTamanioControl.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTamanioControl.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoTamanioControl.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTamanioControl.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoTamanioControl() throws Exception {		
		this.startProcessTipoTamanioControl(true);
	}
	
	public void startProcessTipoTamanioControl(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoTamanioControl, this.jScrollPanelDatosTipoTamanioControl,this.jPanelPaginacionTipoTamanioControl, this.jScrollPanelDatosEdicionTipoTamanioControl, this.jPanelAccionesTipoTamanioControl,this.jPanelAccionesFormularioTipoTamanioControl,this.jmenuBarTipoTamanioControl,this.jmenuBarDetalleTipoTamanioControl,this.jTtoolBarTipoTamanioControl,this.jTtoolBarDetalleTipoTamanioControl);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoTamanioControl=null; 
		
		final JPanel jPanelParametrosReportesTipoTamanioControl=this.jPanelParametrosReportesTipoTamanioControl;
		//final JScrollPane jScrollPanelDatosTipoTamanioControl=this.jScrollPanelDatosTipoTamanioControl;
		final JTable jTableDatosTipoTamanioControl=this.jTableDatosTipoTamanioControl;		
		final JPanel jPanelPaginacionTipoTamanioControl=this.jPanelPaginacionTipoTamanioControl;
		//final JScrollPane jScrollPanelDatosEdicionTipoTamanioControl=this.jScrollPanelDatosEdicionTipoTamanioControl;
		final JPanel jPanelAccionesTipoTamanioControl=this.jPanelAccionesTipoTamanioControl;
		
		JPanel jPanelCamposAuxiliarTipoTamanioControl=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoTamanioControl=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) {
			jPanelCamposAuxiliarTipoTamanioControl=this.jInternalFrameDetalleFormTipoTamanioControl.jPanelCamposTipoTamanioControl;
			jPanelAccionesFormularioAuxiliarTipoTamanioControl=this.jInternalFrameDetalleFormTipoTamanioControl.jPanelAccionesFormularioTipoTamanioControl;
		}
		
		final JPanel jPanelCamposTipoTamanioControl=jPanelCamposAuxiliarTipoTamanioControl;
		final JPanel jPanelAccionesFormularioTipoTamanioControl=jPanelAccionesFormularioAuxiliarTipoTamanioControl;
		
		
		final JMenuBar jmenuBarTipoTamanioControl=this.jmenuBarTipoTamanioControl;
		final JToolBar jTtoolBarTipoTamanioControl=this.jTtoolBarTipoTamanioControl;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoTamanioControl=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoTamanioControl=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) {
			jmenuBarDetalleAuxiliarTipoTamanioControl=this.jInternalFrameDetalleFormTipoTamanioControl.jmenuBarDetalleTipoTamanioControl;
			jTtoolBarDetalleAuxiliarTipoTamanioControl=this.jInternalFrameDetalleFormTipoTamanioControl.jTtoolBarDetalleTipoTamanioControl;
		}
		
		final JMenuBar jmenuBarDetalleTipoTamanioControl=jmenuBarDetalleAuxiliarTipoTamanioControl;
		final JToolBar jTtoolBarDetalleTipoTamanioControl=jTtoolBarDetalleAuxiliarTipoTamanioControl;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoTamanioControl;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoTamanioControl;
			processRunnable.jTableDatos=jTableDatosTipoTamanioControl;
			processRunnable.jPanelCampos=jPanelCamposTipoTamanioControl;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoTamanioControl;
			processRunnable.jPanelAcciones=jPanelAccionesTipoTamanioControl;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoTamanioControl;
			
			
			processRunnable.jmenuBar=jmenuBarTipoTamanioControl;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoTamanioControl;
			processRunnable.jTtoolBar=jTtoolBarTipoTamanioControl;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoTamanioControl;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoTamanioControl ,jPanelParametrosReportesTipoTamanioControl,jTableDatosTipoTamanioControl, /*jScrollPanelDatosTipoTamanioControl,*/jPanelCamposTipoTamanioControl,jPanelPaginacionTipoTamanioControl, /*jScrollPanelDatosEdicionTipoTamanioControl,*/ jPanelAccionesTipoTamanioControl,jPanelAccionesFormularioTipoTamanioControl,jmenuBarTipoTamanioControl,jmenuBarDetalleTipoTamanioControl,jTtoolBarTipoTamanioControl,jTtoolBarDetalleTipoTamanioControl);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoTamanioControl, jScrollPanelDatosTipoTamanioControl,jPanelPaginacionTipoTamanioControl, jScrollPanelDatosEdicionTipoTamanioControl, jPanelAccionesTipoTamanioControl,jPanelAccionesFormularioTipoTamanioControl,jmenuBarTipoTamanioControl,jmenuBarDetalleTipoTamanioControl,jTtoolBarTipoTamanioControl,jTtoolBarDetalleTipoTamanioControl);
						
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
	
	public void finishProcessTipoTamanioControl() {// throws Exception 
		this.finishProcessTipoTamanioControl(true);
	}
	
	public void finishProcessTipoTamanioControl(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoTamanioControl, this.jScrollPanelDatosTipoTamanioControl,this.jPanelPaginacionTipoTamanioControl, this.jScrollPanelDatosEdicionTipoTamanioControl, this.jPanelAccionesTipoTamanioControl,this.jPanelAccionesFormularioTipoTamanioControl,this.jmenuBarTipoTamanioControl,this.jmenuBarDetalleTipoTamanioControl,this.jTtoolBarTipoTamanioControl,this.jTtoolBarDetalleTipoTamanioControl);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoTamanioControl=null; 
		
		final JPanel jPanelParametrosReportesTipoTamanioControl=this.jPanelParametrosReportesTipoTamanioControl;
		//final JScrollPane jScrollPanelDatosTipoTamanioControl=this.jScrollPanelDatosTipoTamanioControl;
		final JTable jTableDatosTipoTamanioControl=this.jTableDatosTipoTamanioControl;		
		final JPanel jPanelPaginacionTipoTamanioControl=this.jPanelPaginacionTipoTamanioControl;
		//final JScrollPane jScrollPanelDatosEdicionTipoTamanioControl=this.jScrollPanelDatosEdicionTipoTamanioControl;
		final JPanel jPanelAccionesTipoTamanioControl=this.jPanelAccionesTipoTamanioControl;
		
		JPanel jPanelCamposAuxiliarTipoTamanioControl=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoTamanioControl=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) {
			jPanelCamposAuxiliarTipoTamanioControl=this.jInternalFrameDetalleFormTipoTamanioControl.jPanelCamposTipoTamanioControl;
			jPanelAccionesFormularioAuxiliarTipoTamanioControl=this.jInternalFrameDetalleFormTipoTamanioControl.jPanelAccionesFormularioTipoTamanioControl;
		}
		
		final JPanel jPanelCamposTipoTamanioControl=jPanelCamposAuxiliarTipoTamanioControl;
		final JPanel jPanelAccionesFormularioTipoTamanioControl=jPanelAccionesFormularioAuxiliarTipoTamanioControl;
		
		
		final JMenuBar jmenuBarTipoTamanioControl=this.jmenuBarTipoTamanioControl;		
		final JToolBar jTtoolBarTipoTamanioControl=this.jTtoolBarTipoTamanioControl;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoTamanioControl=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoTamanioControl=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) {
			jmenuBarDetalleAuxiliarTipoTamanioControl=this.jInternalFrameDetalleFormTipoTamanioControl.jmenuBarDetalleTipoTamanioControl;
			jTtoolBarDetalleAuxiliarTipoTamanioControl=this.jInternalFrameDetalleFormTipoTamanioControl.jTtoolBarDetalleTipoTamanioControl;		
		}
		
		final JMenuBar jmenuBarDetalleTipoTamanioControl=jmenuBarDetalleAuxiliarTipoTamanioControl;
		final JToolBar jTtoolBarDetalleTipoTamanioControl=jTtoolBarDetalleAuxiliarTipoTamanioControl;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoTamanioControl;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoTamanioControl;
			processRunnable.jTableDatos=jTableDatosTipoTamanioControl;
			processRunnable.jPanelCampos=jPanelCamposTipoTamanioControl;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoTamanioControl;
			processRunnable.jPanelAcciones=jPanelAccionesTipoTamanioControl;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoTamanioControl;
			
			
			processRunnable.jmenuBar=jmenuBarTipoTamanioControl;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoTamanioControl;
			processRunnable.jTtoolBar=jTtoolBarTipoTamanioControl;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoTamanioControl;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoTamanioControl ,jPanelParametrosReportesTipoTamanioControl, jTableDatosTipoTamanioControl,/*jScrollPanelDatosTipoTamanioControl,*/jPanelCamposTipoTamanioControl,jPanelPaginacionTipoTamanioControl, /*jScrollPanelDatosEdicionTipoTamanioControl,*/ jPanelAccionesTipoTamanioControl,jPanelAccionesFormularioTipoTamanioControl,jmenuBarTipoTamanioControl,jmenuBarDetalleTipoTamanioControl,jTtoolBarTipoTamanioControl,jTtoolBarDetalleTipoTamanioControl));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoTamanioControl(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoTamanioControl(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoTamanioControl(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoTamanioControl(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoTamanioControl,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoTamanioControl,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoTamanioControl(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoTamanioControl,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoTamanioControl,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipotamaniocontrolConstantesFunciones.getsFinalQueryTipoTamanioControl();
		String  finalQueryPaginacionTodos=this.tipotamaniocontrolConstantesFunciones.getsFinalQueryTipoTamanioControl();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoTamanioControlConstantesFunciones.getArrayColumnasGlobalesNoTipoTamanioControl(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoTamanioControlConstantesFunciones.getArrayColumnasGlobalesTipoTamanioControl(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoTamanioControlConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipotamaniocontrolsEliminados= new ArrayList<TipoTamanioControl>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoTamanioControl();
		
				///*TipoTamanioControlSessionBean*/this.tipotamaniocontrolSessionBean=new TipoTamanioControlSessionBean();
			
			if(this.tipotamaniocontrolSessionBean==null) {
				this.tipotamaniocontrolSessionBean=new TipoTamanioControlSessionBean();
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
					this.iNumeroPaginacion=TipoTamanioControlConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoTamanioControlConstantesFunciones.getClassesForeignKeysOfTipoTamanioControl(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipotamaniocontrol."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipotamaniocontrolsAux= new ArrayList<TipoTamanioControl>();
			
				
			tipotamaniocontrolLogic.setDatosCliente(this.datosCliente);
			tipotamaniocontrolLogic.setDatosDeep(this.datosDeep);
			tipotamaniocontrolLogic.setIsConDeep(true);
			
			
			tipotamaniocontrolLogic.getTipoTamanioControlDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipotamaniocontrolLogic.getTodosTipoTamanioControls(finalQueryGlobal,pagination);
					
					//tipotamaniocontrolLogic.getTodosTipoTamanioControlsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipotamaniocontrolLogic.getTipoTamanioControls()==null|| tipotamaniocontrolLogic.getTipoTamanioControls().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipotamaniocontrolsAux= new ArrayList<TipoTamanioControl>();
							tipotamaniocontrolsAux.addAll(tipotamaniocontrolLogic.getTipoTamanioControls());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotamaniocontrolsAux= new ArrayList<TipoTamanioControl>();
							tipotamaniocontrolsAux.addAll(tipotamaniocontrols);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipotamaniocontrolLogic.getTodosTipoTamanioControls(finalQueryGlobal+"",this.pagination);												
							
							//tipotamaniocontrolLogic.getTodosTipoTamanioControlsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoTamanioControls("Todos",tipotamaniocontrolLogic.getTipoTamanioControls() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipotamaniocontrolLogic.setTipoTamanioControls(new ArrayList<TipoTamanioControl>());					
							tipotamaniocontrolLogic.getTipoTamanioControls().addAll(tipotamaniocontrolsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotamaniocontrols=new ArrayList<TipoTamanioControl>();
							tipotamaniocontrols.addAll(tipotamaniocontrolsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoTamanioControl=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoTamanioControl=this.idActual;
				
				} else if(this.idTipoTamanioControlActual!=null && this.idTipoTamanioControlActual!=0L) {
					idTipoTamanioControl=idTipoTamanioControlActual;
				}
				
					
				this.sDetalleReporte=TipoTamanioControlConstantesFunciones.getDetalleIndicePorId(idTipoTamanioControl);
				
				this.tipotamaniocontrols=new ArrayList<TipoTamanioControl>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipotamaniocontrolLogic.getEntity(idTipoTamanioControl);
					
					//tipotamaniocontrolLogic.getEntityWithConnection(idTipoTamanioControl);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotamaniocontrolLogic.setTipoTamanioControls(new ArrayList<TipoTamanioControl>());
					tipotamaniocontrolLogic.getTipoTamanioControls().add(tipotamaniocontrolLogic.getTipoTamanioControl());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipotamaniocontrols=new ArrayList<TipoTamanioControl>();
					this.tipotamaniocontrols.add(tipotamaniocontrol);
				}
				
				if(tipotamaniocontrolLogic.getTipoTamanioControl()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoTamanioControl();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoTamanioControl();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipotamaniocontrolLogic.getTipoTamanioControls().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipotamaniocontrols.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipotamaniocontrolLogic.getTipoTamanioControls().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipotamaniocontrols.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoTamanioControl tipotamaniocontrol) {
		Boolean permite=true;
		
		if(this.tipotamaniocontrol.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoTamanioControlConstantesFunciones.getOrderByListaTipoTamanioControl();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoTamanioControlConstantesFunciones.getOrderByListaTipoTamanioControl();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTamanioControl tipotamaniocontrol:tipotamaniocontrolLogic.getTipoTamanioControls()) {
				if(tipotamaniocontrol.getsType().equals(Constantes2.S_TOTALES)) {
					tipotamaniocontrolTotales=tipotamaniocontrol;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTamanioControl tipotamaniocontrol:this.tipotamaniocontrols) {
				if(tipotamaniocontrol.getsType().equals(Constantes2.S_TOTALES)) {
					tipotamaniocontrolTotales=tipotamaniocontrol;
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
			this.tipotamaniocontrolAux=new TipoTamanioControl();
			this.tipotamaniocontrolAux.setsType(Constantes2.S_TOTALES);
			this.tipotamaniocontrolAux.setIsNew(false);
			this.tipotamaniocontrolAux.setIsChanged(false);
			this.tipotamaniocontrolAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoTamanioControlConstantesFunciones.TotalizarValoresFilaTipoTamanioControl(this.tipotamaniocontrolLogic.getTipoTamanioControls(),this.tipotamaniocontrolAux);
				
				this.tipotamaniocontrolLogic.getTipoTamanioControls().add(this.tipotamaniocontrolAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoTamanioControlConstantesFunciones.TotalizarValoresFilaTipoTamanioControl(this.tipotamaniocontrols,this.tipotamaniocontrolAux);
				
				this.tipotamaniocontrols.add(this.tipotamaniocontrolAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipotamaniocontrolTotales=new TipoTamanioControl();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipotamaniocontrolLogic.getTipoTamanioControls().remove(tipotamaniocontrolTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipotamaniocontrols.remove(tipotamaniocontrolTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipotamaniocontrolTotales=new TipoTamanioControl();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTamanioControl tipotamaniocontrol:tipotamaniocontrolLogic.getTipoTamanioControls()) {
				if(tipotamaniocontrol.getsType().equals(Constantes2.S_TOTALES)) {
					tipotamaniocontrolTotales=tipotamaniocontrol;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoTamanioControlConstantesFunciones.TotalizarValoresFilaTipoTamanioControl(this.tipotamaniocontrolLogic.getTipoTamanioControls(),tipotamaniocontrolTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTamanioControl tipotamaniocontrol:this.tipotamaniocontrols) {
				if(tipotamaniocontrol.getsType().equals(Constantes2.S_TOTALES)) {
					tipotamaniocontrolTotales=tipotamaniocontrol;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoTamanioControlConstantesFunciones.TotalizarValoresFilaTipoTamanioControl(this.tipotamaniocontrols,tipotamaniocontrolTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoTamanioControl() {
		this.isPermisoTodoTipoTamanioControl=false;
		this.isPermisoNuevoTipoTamanioControl=false;
		this.isPermisoActualizarTipoTamanioControl=false;
		this.isPermisoActualizarOriginalTipoTamanioControl=false;
		this.isPermisoEliminarTipoTamanioControl=false;
		this.isPermisoGuardarCambiosTipoTamanioControl=false;
		this.isPermisoConsultaTipoTamanioControl=false;
		this.isPermisoBusquedaTipoTamanioControl=false;
		this.isPermisoReporteTipoTamanioControl=false;		
		this.isPermisoOrdenTipoTamanioControl=false;		
		this.isPermisoPaginacionMedioTipoTamanioControl=false;		
		this.isPermisoPaginacionAltoTipoTamanioControl=false;
		this.isPermisoPaginacionTodoTipoTamanioControl=false;
		this.isPermisoCopiarTipoTamanioControl=false;		
		this.isPermisoVerFormTipoTamanioControl=false;		
		this.isPermisoDuplicarTipoTamanioControl=false;		
		this.isPermisoOrdenTipoTamanioControl=false;		
	}
	
	public void setPermisosUsuarioTipoTamanioControl(Boolean isPermiso) {
		this.isPermisoTodoTipoTamanioControl=isPermiso;
		this.isPermisoNuevoTipoTamanioControl=isPermiso;
		this.isPermisoActualizarTipoTamanioControl=isPermiso;
		this.isPermisoActualizarOriginalTipoTamanioControl=isPermiso;
		this.isPermisoEliminarTipoTamanioControl=isPermiso;
		this.isPermisoGuardarCambiosTipoTamanioControl=isPermiso;
		this.isPermisoConsultaTipoTamanioControl=isPermiso;
		this.isPermisoBusquedaTipoTamanioControl=isPermiso;
		this.isPermisoReporteTipoTamanioControl=isPermiso;
		this.isPermisoOrdenTipoTamanioControl=isPermiso;		
		this.isPermisoPaginacionMedioTipoTamanioControl=isPermiso;		
		this.isPermisoPaginacionAltoTipoTamanioControl=isPermiso;		
		this.isPermisoPaginacionTodoTipoTamanioControl=isPermiso;		
		this.isPermisoCopiarTipoTamanioControl=isPermiso;		
		this.isPermisoVerFormTipoTamanioControl=isPermiso;		
		this.isPermisoDuplicarTipoTamanioControl=isPermiso;
		this.isPermisoOrdenTipoTamanioControl=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoTamanioControl(Boolean isPermiso) {
		//this.isPermisoTodoTipoTamanioControl=isPermiso;
		this.isPermisoNuevoTipoTamanioControl=isPermiso;
		this.isPermisoActualizarTipoTamanioControl=isPermiso;
		this.isPermisoActualizarOriginalTipoTamanioControl=isPermiso;
		this.isPermisoEliminarTipoTamanioControl=isPermiso;
		this.isPermisoGuardarCambiosTipoTamanioControl=isPermiso;
		//this.isPermisoConsultaTipoTamanioControl=isPermiso;
		//this.isPermisoBusquedaTipoTamanioControl=isPermiso;
		//this.isPermisoReporteTipoTamanioControl=isPermiso;
		//this.isPermisoOrdenTipoTamanioControl=isPermiso;		
		//this.isPermisoPaginacionMedioTipoTamanioControl=isPermiso;		
		//this.isPermisoPaginacionAltoTipoTamanioControl=isPermiso;		
		//this.isPermisoPaginacionTodoTipoTamanioControl=isPermiso;		
		//this.isPermisoCopiarTipoTamanioControl=isPermiso;		
		//this.isPermisoDuplicarTipoTamanioControl=isPermiso;
		//this.isPermisoOrdenTipoTamanioControl=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoTamanioControlClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoTamanioControlJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoTamanioControl(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoTamanioControlClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoTamanioControlClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoTamanioControlClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoTamanioControlClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoTamanioControl() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoTamanioControlJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoTamanioControlConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoTamanioControl=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoTamanioControl=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoTamanioControl=this.isPermisoActualizarTipoTamanioControl;
			this.isPermisoEliminarTipoTamanioControl=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoTamanioControl=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoTamanioControl=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoTamanioControl=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoTamanioControl=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoTamanioControl=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoTamanioControl=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoTamanioControl=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoTamanioControl=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoTamanioControl=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoTamanioControl=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoTamanioControl=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoTamanioControl=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoTamanioControl=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoTamanioControl.setToolTipText(this.jTableDatosTipoTamanioControl.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoTamanioControl(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoTamanioControl(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoTamanioControlJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoTamanioControlJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoTamanioControl() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoTamanioControlListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoTamanioControlListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoTamanioControlJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoTamanioControlListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoTamanioControlListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoTamanioControl()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoTamanioControl()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoTamanioControl(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoTamanioControl()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoTamanioControl();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoTamanioControl(TipoTamanioControl tipotamaniocontrol)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoTamanioControl(TipoTamanioControl tipotamaniocontrol,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoTamanioControl()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoTamanioControl()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoTamanioControl()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoTamanioControl()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoTamanioControl()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoTamanioControl()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoTamanioControl(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoTamanioControl()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoTamanioControlBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoTamanioControlBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoTamanioControlBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipotamaniocontrolSessionBean=new TipoTamanioControlSessionBean(); 
		this.tipotamaniocontrolConstantesFunciones=new TipoTamanioControlConstantesFunciones(); 
		this.tipotamaniocontrolBean=new TipoTamanioControl();//(this.tipotamaniocontrolConstantesFunciones); 		
		this.tipotamaniocontrolReturnGeneral=new TipoTamanioControlParameterReturnGeneral(); 
		
		this.tipotamaniocontrolSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipotamaniocontrolSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoTamanioControlBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoTamanioControlBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoTamanioControlBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoTamanioControl(true);
			
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
			
			this.tipotamaniocontrolConstantesFunciones=new TipoTamanioControlConstantesFunciones(); 
			this.tipotamaniocontrolBean=new TipoTamanioControl();//this.tipotamaniocontrolConstantesFunciones); 			
			this.tipotamaniocontrolReturnGeneral=new TipoTamanioControlParameterReturnGeneral(); 
		
			TipoTamanioControlBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Tamanio Control Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipotamaniocontrol=new TipoTamanioControl();
			this.tipotamaniocontrols = new ArrayList<TipoTamanioControl>();
			this.tipotamaniocontrolsAux = new ArrayList<TipoTamanioControl>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic=new TipoTamanioControlLogic();
				this.tipotamaniocontrolLogic.getNewConnexionToDeep("");
			}
			
			//this.tipotamaniocontrolSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipotamaniocontrolSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoTamanioControl);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoTamanioControl!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoTamanioControl);	
					}
					
					if(this.jInternalFrameImportacionTipoTamanioControl!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoTamanioControl);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoTamanioControl!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoTamanioControl);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoTamanioControl);
				this.jInternalFrameDetalleFormTipoTamanioControl.setVisible(false);
				this.jInternalFrameDetalleFormTipoTamanioControl.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoTamanioControl!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoTamanioControl);
					this.jInternalFrameReporteDinamicoTipoTamanioControl.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoTamanioControl.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoTamanioControl!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoTamanioControl);
					this.jInternalFrameImportacionTipoTamanioControl.setVisible(false);
					this.jInternalFrameImportacionTipoTamanioControl.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoTamanioControl!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoTamanioControl);
					this.jInternalFrameOrderByTipoTamanioControl.setVisible(false);
					this.jInternalFrameOrderByTipoTamanioControl.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoTamanioControlActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoTamanioControlConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipotamaniocontrolReturnGeneral=new TipoTamanioControlParameterReturnGeneral();
			
			this.tipotamaniocontrolParameterGeneral=new TipoTamanioControlParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipotamaniocontrolLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoTamanioControlJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoTamanioControlConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado(),this.tipotamaniocontrolSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoTamanioControlConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado(),this.tipotamaniocontrolSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoTamanioControl=false;
			this.isVisibilidadCeldaDuplicarTipoTamanioControl=true;
			this.isVisibilidadCeldaCopiarTipoTamanioControl=true;
			this.isVisibilidadCeldaVerFormTipoTamanioControl=true;
			this.isVisibilidadCeldaOrdenTipoTamanioControl=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoTamanioControl=false;
			this.isVisibilidadCeldaModificarTipoTamanioControl=false;
			this.isVisibilidadCeldaActualizarTipoTamanioControl=false;
			this.isVisibilidadCeldaEliminarTipoTamanioControl=false;
			this.isVisibilidadCeldaCancelarTipoTamanioControl=false;
			this.isVisibilidadCeldaGuardarTipoTamanioControl=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTamanioControl=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoTamanioControl("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoTamanioControl();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoTamanioControl(false);
			
			this.setPermisosUsuarioTipoTamanioControl();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado() 
				|| (this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado() && this.tipotamaniocontrolSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoTamanioControlClasesRelacionadas();
			}
			
			if(this.tipotamaniocontrolSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoTamanioControlClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoTamanioControlJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoTamanioControl();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoTamanioControl();
			}
			
			if(!this.isPermisoBusquedaTipoTamanioControl) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoTamanioControl,this.isPermisoPaginacionMedioTipoTamanioControl,this.isPermisoPaginacionTodoTipoTamanioControl);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoTamanioControlConstantesFunciones.getTiposSeleccionarTipoTamanioControl());
				
				this.tiposColumnasSelect=TipoTamanioControlConstantesFunciones.getTiposSeleccionarTipoTamanioControl(true);
				
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
			//if(!this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoTamanioControl();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoTamanioControl(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoTamanioControl(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoTamanioControl() ;
			
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
				tipotamaniocontrolImplementable= (TipoTamanioControlImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoTamanioControlConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipotamaniocontrolImplementableHome= (TipoTamanioControlImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoTamanioControlConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipotamaniocontrols= new ArrayList<TipoTamanioControl>();
			this.tipotamaniocontrolsEliminados= new ArrayList<TipoTamanioControl>();
						
			this.isEsNuevoTipoTamanioControl=false;
			this.esParaAccionDesdeFormularioTipoTamanioControl=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoTamanioControl(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoTamanioControl();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoTamanioControlConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoTamanioControl("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoTamanioControl(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoTamanioControl();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoTamanioControl();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoTamanioControl(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoTamanioControl: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoTamanioControl() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoTamanioControl")) {
				iIndex=this.jInternalFrameDetalleFormTipoTamanioControl.jTabbedPaneRelacionesTipoTamanioControl.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoTamanioControl.jTabbedPaneRelacionesTipoTamanioControl.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoTamanioControl.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoTamanioControl();	
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
	
	public void cargarCombosForeignKeyTipoTamanioControl(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoTamanioControl(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoTamanioControl(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoTamanioControlListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoTamanioControl();
		
		this.cargarCombosFrameForeignKeyTipoTamanioControl();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoTamanioControl();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoTamanioControl();
		}
	}
	
	
	
	public void jButtonNuevoTipoTamanioControlActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipotamaniocontrolSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoTamanioControl==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
			
			
			if(jTableDatosTipoTamanioControl.getRowCount()>=1) {
				jTableDatosTipoTamanioControl.removeRowSelectionInterval(0, jTableDatosTipoTamanioControl.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoTamanioControl=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoTamanioControl(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoTamanioControl(true);			
			//this.tipotamaniocontrol=new TipoTamanioControl();
			//this.tipotamaniocontrol.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoTamanioControl(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTamanioControl() ;
			
			if(TipoTamanioControlJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoTamanioControl(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipotamaniocontrol);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipotamaniocontrol);				
			
			TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
			
			if(this.tipotamaniocontrolSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoTamanioControl: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoTamanioControlActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoTamanioControl> tipotamaniocontrolsSeleccionados=new ArrayList<TipoTamanioControl>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoTamanioControl.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoTamanioControl.getSelectedRows().length;			
			}
			
			tipotamaniocontrolsSeleccionados=this.getTipoTamanioControlsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoTamanioControl--;			
				//TipoTamanioControl tipotamaniocontrolAux= new TipoTamanioControl();			
				//tipotamaniocontrolAux.setId(this.iIdNuevoTipoTamanioControl);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoTamanioControl tipotamaniocontrolOrigen=new TipoTamanioControl();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoTamanioControl tipotamaniocontrolOrigen : tipotamaniocontrolsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoTamanioControl.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipotamaniocontrolOrigen =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotamaniocontrolOrigen =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoTamanioControl();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipotamaniocontrol.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoTamanioControl(tipotamaniocontrolOrigen,this.tipotamaniocontrol,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTamanioControl(this.tipotamaniocontrol);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipotamaniocontrolLogic.getTipoTamanioControls().add(this.tipotamaniocontrolAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipotamaniocontrols.add(this.tipotamaniocontrolAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoTamanioControl(false);
				
				this.jTableDatosTipoTamanioControl.setRowSelectionInterval(this.getIndiceNuevoTipoTamanioControl(), this.getIndiceNuevoTipoTamanioControl());
				
				int iLastRow =  this.jTableDatosTipoTamanioControl.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoTamanioControl.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoTamanioControl.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoTamanioControl(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoTamanioControlActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoTamanioControl> tipotamaniocontrolsSeleccionados=new ArrayList<TipoTamanioControl>();									
		
			TipoTamanioControl tipotamaniocontrolOrigen=new TipoTamanioControl();
			TipoTamanioControl tipotamaniocontrolDestino=new TipoTamanioControl();
				
			tipotamaniocontrolsSeleccionados=this.getTipoTamanioControlsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoTamanioControl.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipotamaniocontrolsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoTamanioControl.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotamaniocontrolOrigen =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipotamaniocontrolOrigen =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotamaniocontrolDestino =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipotamaniocontrolDestino =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipotamaniocontrolOrigen =tipotamaniocontrolsSeleccionados.get(0);
				tipotamaniocontrolDestino =tipotamaniocontrolsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoTamanioControl(tipotamaniocontrolOrigen,tipotamaniocontrolDestino,true,false);
				
				tipotamaniocontrolDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipotamaniocontrolDestino,tipotamaniocontrolLogic.getTipoTamanioControls());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipotamaniocontrolDestino,tipotamaniocontrols);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoTamanioControl(false);
				
				//this.jTableDatosTipoTamanioControl.setRowSelectionInterval(this.getIndiceNuevoTipoTamanioControl(), this.getIndiceNuevoTipoTamanioControl());
				
				int iLastRow =  this.jTableDatosTipoTamanioControl.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoTamanioControl.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoTamanioControl.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoTamanioControl(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoTamanioControlActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoTamanioControl==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoTamanioControl.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoTamanioControlActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoTamanioControl.isVisible();
			
			
			this.jPanelParametrosReportesTipoTamanioControl.setVisible(!isVisible);
			this.jPanelPaginacionTipoTamanioControl.setVisible(!isVisible);
			this.jPanelAccionesTipoTamanioControl.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoTamanioControlActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoTamanioControl();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoTamanioControlActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoTamanioControl();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoTamanioControlActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoTamanioControl();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoTamanioControlActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoTamanioControl();
			
			this.abrirFrameOrderByTipoTamanioControl();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoTamanioControlActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoTamanioControl();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoTamanioControl(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoTamanioControl);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoTamanioControl.isMaximum()) {
					this.jInternalFrameDetalleFormTipoTamanioControl.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoTamanioControl.setSize(this.jInternalFrameDetalleFormTipoTamanioControl.iWidthFormulario,this.jInternalFrameDetalleFormTipoTamanioControl.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoTamanioControl.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoTamanioControl.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoTamanioControl.isMaximum()) {
						this.jInternalFrameDetalleFormTipoTamanioControl.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoTamanioControl.jContentPaneDetalleTipoTamanioControl.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoTamanioControl.jTabbedPaneRelacionesTipoTamanioControl.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoTamanioControl.jContentPaneDetalleTipoTamanioControl.getWidth(),TipoTamanioControlConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoTamanioControl.jTabbedPaneRelacionesTipoTamanioControl.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoTamanioControl.jContentPaneDetalleTipoTamanioControl.getWidth(),TipoTamanioControlConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoTamanioControl.jTabbedPaneRelacionesTipoTamanioControl.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoTamanioControl.jContentPaneDetalleTipoTamanioControl.getWidth(),TipoTamanioControlConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoTamanioControl.setVisible(true);
	        this.jInternalFrameDetalleFormTipoTamanioControl.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoTamanioControl() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoTamanioControl==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoTamanioControl=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTamanioControl,false,this);
				} else {
					this.jInternalFrameOrderByTipoTamanioControl=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTamanioControl,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoTamanioControl);
				this.jInternalFrameOrderByTipoTamanioControl.setVisible(false);
				this.jInternalFrameOrderByTipoTamanioControl.setSelected(false);
				
				this.jInternalFrameOrderByTipoTamanioControl.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoTamanioControl"));
				
				this.inicializarActualizarBindingTablaOrderByTipoTamanioControl();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoTamanioControl() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoTamanioControl==null) {
				
				this.jInternalFrameImportacionTipoTamanioControl=new ImportacionJInternalFrame(TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoTamanioControl);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoTamanioControl);
				this.jInternalFrameImportacionTipoTamanioControl.setVisible(false);
				this.jInternalFrameImportacionTipoTamanioControl.setSelected(false);


				this.jInternalFrameImportacionTipoTamanioControl.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoTamanioControl"));
				this.jInternalFrameImportacionTipoTamanioControl.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoTamanioControl"));
				this.jInternalFrameImportacionTipoTamanioControl.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoTamanioControl"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoTamanioControl() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoTamanioControl==null) {
				this.jInternalFrameReporteDinamicoTipoTamanioControl=new ReporteDinamicoJInternalFrame(TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoTamanioControl);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoTamanioControl);
				this.jInternalFrameReporteDinamicoTipoTamanioControl.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoTamanioControl.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoTamanioControl.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoTamanioControl"));
				this.jInternalFrameReporteDinamicoTipoTamanioControl.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoTamanioControl"));
				this.jInternalFrameReporteDinamicoTipoTamanioControl.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoTamanioControl"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoTamanioControl();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoTamanioControl() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoTamanioControl);
			
	       	this.jInternalFrameDetalleFormTipoTamanioControl.setVisible(false);
	        this.jInternalFrameDetalleFormTipoTamanioControl.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoTamanioControl.dispose();
			//this.jInternalFrameDetalleFormTipoTamanioControl=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoTamanioControl() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoTamanioControl.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoTamanioControl.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoTamanioControl() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoTamanioControl.setVisible(true);
	        this.jInternalFrameImportacionTipoTamanioControl.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoTamanioControl() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoTamanioControl.setVisible(true);
	        this.jInternalFrameOrderByTipoTamanioControl.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoTamanioControl() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoTamanioControl.setVisible(false);
	        this.jInternalFrameOrderByTipoTamanioControl.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoTamanioControl() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoTamanioControl.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoTamanioControl.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoTamanioControl() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoTamanioControl.setVisible(false);
	        this.jInternalFrameImportacionTipoTamanioControl.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoTamanioControlActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoTamanioControl(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoTamanioControl(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoTamanioControl.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoTamanioControl(true);
			//this.isEsNuevoTipoTamanioControl=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoTamanioControl("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoTamanioControl(false) ;
			
			if(tipotamaniocontrolSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoTamanioControlJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoTamanioControl(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTamanioControl(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoTamanioControlActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoTamanioControl.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoTamanioControl(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoTamanioControl==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoTamanioControl.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoTamanioControl(true);
			//this.isEsNuevoTipoTamanioControl=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipotamaniocontrol.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoTamanioControl("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoTamanioControl(false) ;
			
			if(TipoTamanioControlJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoTamanioControl(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTamanioControl(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoTamanioControlActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoTamanioControl(false);
			
			//if(!this.isEsNuevoTipoTamanioControl) {								
				int intSelectedRow = this.jTableDatosTipoTamanioControl.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoTamanioControlJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoTamanioControl(this.tipotamaniocontrol,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTamanioControl(this.tipotamaniocontrol);
				
			}
			
			if(this.permiteMantenimiento(this.tipotamaniocontrol)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoTamanioControl=true;
					this.inicializarActualizarBindingTablaTipoTamanioControl(false);
					this.isEsNuevoTipoTamanioControl=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoTamanioControl=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoTamanioControl=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoTamanioControl(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoTamanioControl(false);
				
				this.habilitarDeshabilitarControlesTipoTamanioControl(false);
			
												
				
				if(TipoTamanioControlJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoTamanioControl();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoTamanioControlActionPerformed(evt,tipotamaniocontrolSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoTamanioControl(this.tipotamaniocontrol,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoTamanioControl.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipotamaniocontrolSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipotamaniocontrol.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoTamanioControl.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTamanioControl.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoTamanioControlActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoTamanioControl.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
				this.tipotamaniocontrol.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
				this.tipotamaniocontrol.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipotamaniocontrol)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoTamanioControlModel) this.jTableDatosTipoTamanioControl.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoTamanioControl=true;
				this.inicializarActualizarBindingTablaTipoTamanioControl(false);
				this.isEsNuevoTipoTamanioControl=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoTamanioControl(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoTamanioControl(false);
				
				this.habilitarDeshabilitarControlesTipoTamanioControl(false);
				
				
				
				if(TipoTamanioControlJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoTamanioControl();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoTamanioControlActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoTamanioControl.getRowCount()>=1) {
				jTableDatosTipoTamanioControl.removeRowSelectionInterval(0, jTableDatosTipoTamanioControl.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoTamanioControl(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoTamanioControl(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoTamanioControl(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTamanioControl(false) ;
			
			this.isEsNuevoTipoTamanioControl=false;
			
			if(TipoTamanioControlJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoTamanioControl();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoTamanioControlActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoTamanioControl(false);
				
				//SI ES MANUAL
				if(TipoTamanioControlJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoTamanioControl();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoTamanioControlActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoTamanioControl--;			
			//TipoTamanioControl tipotamaniocontrolAux= new TipoTamanioControl();			
			//tipotamaniocontrolAux.setId(this.iIdNuevoTipoTamanioControl);
			
			if(this.jInternalFrameDetalleFormTipoTamanioControl==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoTamanioControl();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoTamanioControl(this.tipotamaniocontrol);
			
			this.tipotamaniocontrol.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipotamaniocontrolLogic.getTipoTamanioControls().add(this.tipotamaniocontrolAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipotamaniocontrols.add(this.tipotamaniocontrolAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoTamanioControl(false);
			
			this.jTableDatosTipoTamanioControl.setRowSelectionInterval(this.getIndiceNuevoTipoTamanioControl(), this.getIndiceNuevoTipoTamanioControl());
			
			int iLastRow =  this.jTableDatosTipoTamanioControl.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoTamanioControl.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoTamanioControl.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoTamanioControl(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoTamanioControlActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoTamanioControl(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTamanioControl(false);
			
			//SI ES MANUAL
			if(TipoTamanioControlJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoTamanioControl();
			}
			
			//this.abrirFrameTreeTipoTamanioControl();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoTamanioControlActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Tamanio ControlS ?", "MANTENIMIENTO DE Tipo Tamanio Control", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoTamanioControl.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoTamanioControl();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipotamaniocontrolReturnGeneral=tipotamaniocontrolLogic.procesarImportacionTipoTamanioControlsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipotamaniocontrolParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoTamanioControlReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoTamanioControlActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoTamanioControl.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoTamanioControl.setFileImportacion(this.jInternalFrameImportacionTipoTamanioControl.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoTamanioControl.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoTamanioControl.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoTamanioControl.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoTamanioControl.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoTamanioControlActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoTamanioControl> tipotamaniocontrolsSeleccionados=new ArrayList<TipoTamanioControl>();		

		tipotamaniocontrolsSeleccionados=this.getTipoTamanioControlsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTamanioControl.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTamanioControl.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoTamanioControlBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoTamanioControlBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoTamanioControls("Todos",tipotamaniocontrolsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Tamanio Control",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoTamanioControl.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTamanioControl.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoTamanioControlConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoTamanioControlConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoTamanioControlConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoTamanioControl.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoTamanioControl.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoTamanioControl.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoTamanioControlConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoTamanioControlConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoTamanioControlConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoTamanioControl.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoTamanioControlConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoTamanioControlConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoTamanioControlConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoTamanioControl.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTamanioControl.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoTamanioControlConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoTamanioControlConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoTamanioControlConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoTamanioControlActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoTamanioControl> tipotamaniocontrolsSeleccionados=new ArrayList<TipoTamanioControl>();		
		
		tipotamaniocontrolsSeleccionados=this.getTipoTamanioControlsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotamaniocontrol";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoTamanioControls");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoTamanioControl.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTamanioControl.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoTamanioControlConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoTamanioControlConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoTamanioControl tipotamaniocontrol:tipotamaniocontrolsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipotamaniocontrol.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoTamanioControlConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoTamanioControlConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoTamanioControl tipotamaniocontrol:tipotamaniocontrolsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipotamaniocontrol.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoTamanioControlConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoTamanioControlConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(TipoTamanioControl tipotamaniocontrol:tipotamaniocontrolsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipotamaniocontrol.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelTipoTamanioControl(row);				
			//	iRow++;
			//}				
			
			//for(TipoTamanioControl tipotamaniocontrolAux:tipotamaniocontrolsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoTamanioControl(tipotamaniocontrolAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Tamanio Control",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipotamaniocontrolLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTamanioControl(false);
			
			//SI ES MANUAL
			if(TipoTamanioControlJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoTamanioControl();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoTamanioControlActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTamanioControl(false);
			
			//SI ES MANUAL
			if(TipoTamanioControlJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoTamanioControl();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoTamanioControlActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTamanioControl(false);
			
			//SI ES MANUAL
			if(TipoTamanioControlJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoTamanioControl();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotamaniocontrolLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoTamanioControl() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoTamanioControl.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoTamanioControl.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoTamanioControl.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoTamanioControl.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoTamanioControl.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoTamanioControl.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoTamanioControl.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoTamanioControl(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoTamanioControl(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoTamanioControl(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoTamanioControl(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoTamanioControl(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoTamanioControl(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoTamanioControl(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoTamanioControl(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoTamanioControlJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoTamanioControlJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoTamanioControl() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoTamanioControl();
		
		this.inicializarActualizarBindingBotonesManualTipoTamanioControl(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoTamanioControl();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoTamanioControl() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoTamanioControl(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoTamanioControl(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoTamanioControl.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoTamanioControl.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoTamanioControl.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoTamanioControl.jCheckBoxPostAccionNuevoTipoTamanioControl.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoTamanioControl.jCheckBoxPostAccionSinCerrarTipoTamanioControl.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoTamanioControl.jCheckBoxPostAccionSinMensajeTipoTamanioControl.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoTamanioControl.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoTamanioControl.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoTamanioControl.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) {
				this.jInternalFrameDetalleFormTipoTamanioControl.jCheckBoxPostAccionNuevoTipoTamanioControl.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoTamanioControl.jCheckBoxPostAccionSinCerrarTipoTamanioControl.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoTamanioControl.jCheckBoxPostAccionSinMensajeTipoTamanioControl.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoTamanioControl.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoTamanioControl.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoTamanioControl.jComboBoxTiposAccionesFormularioTipoTamanioControl.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoTamanioControl.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoTamanioControl!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTamanioControl.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoTamanioControl.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoTamanioControl.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoTamanioControl.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoTamanioControl.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoTamanioControl!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTamanioControl.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoTamanioControl.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoTamanioControl.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoTamanioControl(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoTamanioControlJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoTamanioControl(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoTamanioControl() throws Exception {
		try	{
			if(TipoTamanioControlJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoTamanioControl();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoTamanioControl() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoTamanioControl.jComboBoxTiposAccionesFormularioTipoTamanioControl.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoTamanioControl.jComboBoxTiposAccionesFormularioTipoTamanioControl.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoTamanioControl() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoTamanioControl.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoTamanioControl.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoTamanioControl.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoTamanioControl.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoTamanioControl.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoTamanioControl.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoTamanioControl.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoTamanioControl.addItem(reporte);
			}
			
			
			if(!this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoTamanioControl.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoTamanioControl.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoTamanioControl.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoTamanioControl.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoTamanioControl.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoTamanioControl.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoTamanioControl.jComboBoxTiposAccionesFormularioTipoTamanioControl.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoTamanioControl.jComboBoxTiposAccionesFormularioTipoTamanioControl.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoTamanioControl.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoTamanioControl.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoTamanioControl.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoTamanioControl();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoTamanioControl() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoTamanioControl!=null) {
				this.jInternalFrameReporteDinamicoTipoTamanioControl.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoTamanioControl.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoTamanioControl!=null) {
				this.jInternalFrameReporteDinamicoTipoTamanioControl.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoTamanioControl.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoTamanioControl!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoTamanioControl.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoTamanioControl.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoTamanioControl.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoTamanioControl.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoTamanioControl.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoTamanioControl.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoTamanioControl()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoTamanioControl(Boolean esInicializar) throws Exception {				
		if(TipoTamanioControlJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoTamanioControl();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoTamanioControl() throws Exception {
		this.inicializarActualizarBindingTablaTipoTamanioControl(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoTamanioControl() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoTamanioControl.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoTamanioControl.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoTamanioControl.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoTamanioControlPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoTamanioControl.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoTamanioControl.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoTamanioControlPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoTamanioControlOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTamanioControlOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoTamanioControlPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoTamanioControl.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoTamanioControl.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoTamanioControlPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoTamanioControl.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoTamanioControl(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipotamaniocontrolLogic.getTipoTamanioControls().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipotamaniocontrols.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoTamanioControlJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoTamanioControl.setModel(new TipoTamanioControlModel(this.tipotamaniocontrolLogic.getTipoTamanioControls(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoTamanioControl.setModel(new TipoTamanioControlModel(this.tipotamaniocontrols,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoTamanioControl!=null && this.jInternalFrameOrderByTipoTamanioControl.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoTamanioControl();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoTamanioControl.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTamanioControl,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoTamanioControlPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO,tipotamaniocontrolConstantesFunciones.resaltarSeleccionarTipoTamanioControl,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO,tipotamaniocontrolConstantesFunciones.resaltarSeleccionarTipoTamanioControl,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoTamanioControl.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTamanioControl,TipoTamanioControlConstantesFunciones.LABEL_ID));

		if(this.tipotamaniocontrolConstantesFunciones.mostraridTipoTamanioControl && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTamanioControlConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipotamaniocontrolConstantesFunciones.resaltaridTipoTamanioControl,this.tipotamaniocontrolConstantesFunciones.activaridTipoTamanioControl,this,true,"idTipoTamanioControl","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipotamaniocontrolConstantesFunciones.resaltaridTipoTamanioControl,this.tipotamaniocontrolConstantesFunciones.activaridTipoTamanioControl,this,true,"idTipoTamanioControl","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoTamanioControl.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTamanioControl,TipoTamanioControlConstantesFunciones.LABEL_CODIGO));

		if(this.tipotamaniocontrolConstantesFunciones.mostrarcodigoTipoTamanioControl && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTamanioControlConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipotamaniocontrolConstantesFunciones.resaltarcodigoTipoTamanioControl,this.tipotamaniocontrolConstantesFunciones.activarcodigoTipoTamanioControl,this,true,"codigoTipoTamanioControl","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipotamaniocontrolConstantesFunciones.resaltarcodigoTipoTamanioControl,this.tipotamaniocontrolConstantesFunciones.activarcodigoTipoTamanioControl,this,true,"codigoTipoTamanioControl","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoTamanioControlPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoTamanioControl.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTamanioControl,TipoTamanioControlConstantesFunciones.LABEL_NOMBRE));

		if(this.tipotamaniocontrolConstantesFunciones.mostrarnombreTipoTamanioControl && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTamanioControlConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipotamaniocontrolConstantesFunciones.resaltarnombreTipoTamanioControl,this.tipotamaniocontrolConstantesFunciones.activarnombreTipoTamanioControl,this,true,"nombreTipoTamanioControl","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipotamaniocontrolConstantesFunciones.resaltarnombreTipoTamanioControl,this.tipotamaniocontrolConstantesFunciones.activarnombreTipoTamanioControl,this,true,"nombreTipoTamanioControl","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoTamanioControlPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoTamanioControl.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTamanioControl,TipoTamanioControlConstantesFunciones.LABEL_DESCRIPCION));

		if(this.tipotamaniocontrolConstantesFunciones.mostrardescripcionTipoTamanioControl && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTamanioControlConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipotamaniocontrolConstantesFunciones.resaltardescripcionTipoTamanioControl,this.tipotamaniocontrolConstantesFunciones.activardescripcionTipoTamanioControl,this,true,"descripcionTipoTamanioControl","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipotamaniocontrolConstantesFunciones.resaltardescripcionTipoTamanioControl,this.tipotamaniocontrolConstantesFunciones.activardescripcionTipoTamanioControl,this,true,"descripcionTipoTamanioControl","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoTamanioControlPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoTamanioControl.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoTamanioControl.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoTamanioControl && this.isPermisoGuardarCambiosTipoTamanioControl) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoTamanioControl.addColumn(tableColumn);
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
			
			this.jTableDatosTipoTamanioControl.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoTamanioControl && this.isPermisoGuardarCambiosTipoTamanioControl) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoTamanioControl && this.isPermisoGuardarCambiosTipoTamanioControl) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoTamanioControl.moveColumn(this.jTableDatosTipoTamanioControl.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoTamanioControl.moveColumn(this.jTableDatosTipoTamanioControl.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoTamanioControl.moveColumn(this.jTableDatosTipoTamanioControl.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoTamanioControl.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoTamanioControl.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoTamanioControl,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoTamanioControlJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoTamanioControl.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoTamanioControl.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoTamanioControlJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoTamanioControlJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoTamanioControl.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoTamanioControl.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoTamanioControl.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipotamaniocontrolLogic.getTipoTamanioControls().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipotamaniocontrols.size()-1;
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
		//this.jTableDatosTipoTamanioControl.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoTamanioControl.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoTamanioControl();
			
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
				
				//this.isEsNuevoTipoTamanioControl=false;
					
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
			
				if(this.tipotamaniocontrolSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoTamanioControl==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoTamanioControl.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoTamanioControl.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipotamaniocontrol.getsType().equals("DUPLICADO")
				   || this.tipotamaniocontrol.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoTamanioControl=true;
				
				} else {
					this.isEsNuevoTipoTamanioControl=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
					if(this.tipotamaniocontrol.getId()>=0 && !this.tipotamaniocontrol.getIsNew()) {						
						this.isEsNuevoTipoTamanioControl=false;
						
					} else {
						this.isEsNuevoTipoTamanioControl=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoTamanioControl(esRelaciones);						
				
				this.seleccionarTipoTamanioControl(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipotamaniocontrol.getId()<0) {
					this.isEsNuevoTipoTamanioControl=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoTamanioControl(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoTamanioControl(evt,rowIndex);
				}	
				
				if(this.tipotamaniocontrolSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoTamanioControl: " + this.dDif); 
					}
				}								
				
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoTamanioControl(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipotamaniocontrol)) {
					if(this.tipotamaniocontrol.getId()>0) {
						this.tipotamaniocontrol.setIsDeleted(true);
						
						this.tipotamaniocontrolsEliminados.add(this.tipotamaniocontrol);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipotamaniocontrolLogic.getTipoTamanioControls().remove(this.tipotamaniocontrol);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipotamaniocontrols.remove(this.tipotamaniocontrol);				
					}
					
					
					((TipoTamanioControlModel) this.jTableDatosTipoTamanioControl.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoTamanioControl(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoTamanioControl(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoTamanioControl) {
			
			if(this.jInternalFrameDetalleFormTipoTamanioControl==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoTamanioControl.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoTamanioControl.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoTamanioControlJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoTamanioControl(this.tipotamaniocontrol);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoTamanioControl("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoTamanioControl(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoTamanioControl() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoTamanioControl(TipoTamanioControl tipotamaniocontrol) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoTamanioControl(tipotamaniocontrol,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoTamanioControl(TipoTamanioControl tipotamaniocontrol,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoTamanioControl(tipotamaniocontrol);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoTamanioControl(tipotamaniocontrol,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoTamanioControl(tipotamaniocontrol);
	}
	
	public void setVariablesObjetoActualToFormularioTipoTamanioControl(TipoTamanioControl tipotamaniocontrol) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoTamanioControl==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoTamanioControl.jTextFieldidTipoTamanioControl.setText(tipotamaniocontrol.getId().toString());
			this.jInternalFrameDetalleFormTipoTamanioControl.jTextFieldcodigoTipoTamanioControl.setText(tipotamaniocontrol.getcodigo());
			this.jInternalFrameDetalleFormTipoTamanioControl.jTextAreanombreTipoTamanioControl.setText(tipotamaniocontrol.getnombre());
			this.jInternalFrameDetalleFormTipoTamanioControl.jTextAreadescripcionTipoTamanioControl.setText(tipotamaniocontrol.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoTamanioControl tipotamaniocontrolLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipotamaniocontrolLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoTamanioControl tipotamaniocontrolLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipotamaniocontrolLocal=this.tipotamaniocontrol;
			} else {
				tipotamaniocontrolLocal=this.tipotamaniocontrolAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipotamaniocontrolLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoTamanioControl(tipotamaniocontrolLocal,true);
					
					if(tipotamaniocontrolSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipotamaniocontrolLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipotamaniocontrolLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoTamanioControl(TipoTamanioControl tipotamaniocontrol,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoTamanioControl(tipotamaniocontrol,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoTamanioControl(tipotamaniocontrol);
	}
	
	public void setVariablesFormularioToObjetoActualTipoTamanioControl(TipoTamanioControl tipotamaniocontrol,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoTamanioControl(tipotamaniocontrol,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoTamanioControl(TipoTamanioControl tipotamaniocontrol,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoTamanioControl==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoTamanioControl.jTextFieldidTipoTamanioControl.getText()==null || this.jInternalFrameDetalleFormTipoTamanioControl.jTextFieldidTipoTamanioControl.getText()=="" || this.jInternalFrameDetalleFormTipoTamanioControl.jTextFieldidTipoTamanioControl.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoTamanioControl.jTextFieldidTipoTamanioControl.setText("0");
			}

			if(conColumnasBase) {tipotamaniocontrol.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoTamanioControl.jTextFieldidTipoTamanioControl.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoTamanioControlConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTamanioControl.jLabelIdTipoTamanioControl,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipotamaniocontrol.setcodigo(this.jInternalFrameDetalleFormTipoTamanioControl.jTextFieldcodigoTipoTamanioControl.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoTamanioControlConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTamanioControl.jLabelcodigoTipoTamanioControl,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipotamaniocontrol.setnombre(this.jInternalFrameDetalleFormTipoTamanioControl.jTextAreanombreTipoTamanioControl.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoTamanioControlConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTamanioControl.jLabelnombreTipoTamanioControl,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipotamaniocontrol.setdescripcion(this.jInternalFrameDetalleFormTipoTamanioControl.jTextAreadescripcionTipoTamanioControl.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoTamanioControlConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTamanioControl.jLabeldescripcionTipoTamanioControl,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoTamanioControl(TipoTamanioControl tipotamaniocontrolBean,TipoTamanioControl tipotamaniocontrol,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoTamanioControl(TipoTamanioControl tipotamaniocontrolOrigen,TipoTamanioControl tipotamaniocontrol,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipotamaniocontrolOrigen.getId()!=null && !tipotamaniocontrolOrigen.getId().equals(0L))) {tipotamaniocontrol.setId(tipotamaniocontrolOrigen.getId());}}
			if(conDefault || (!conDefault && tipotamaniocontrolOrigen.getcodigo()!=null && !tipotamaniocontrolOrigen.getcodigo().equals(""))) {tipotamaniocontrol.setcodigo(tipotamaniocontrolOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipotamaniocontrolOrigen.getnombre()!=null && !tipotamaniocontrolOrigen.getnombre().equals(""))) {tipotamaniocontrol.setnombre(tipotamaniocontrolOrigen.getnombre());}
			if(conDefault || (!conDefault && tipotamaniocontrolOrigen.getdescripcion()!=null && !tipotamaniocontrolOrigen.getdescripcion().equals(""))) {tipotamaniocontrol.setdescripcion(tipotamaniocontrolOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoTamanioControl(TipoTamanioControl tipotamaniocontrol) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoTamanioControl.jTextFieldidTipoTamanioControl.setText(tipotamaniocontrol.getId().toString());
			this.jInternalFrameDetalleFormTipoTamanioControl.jTextFieldcodigoTipoTamanioControl.setText(tipotamaniocontrol.getcodigo());
			this.jInternalFrameDetalleFormTipoTamanioControl.jTextAreanombreTipoTamanioControl.setText(tipotamaniocontrol.getnombre());
			this.jInternalFrameDetalleFormTipoTamanioControl.jTextAreadescripcionTipoTamanioControl.setText(tipotamaniocontrol.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoTamanioControl(TipoTamanioControlBean tipotamaniocontrolBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoTamanioControl.jTextFieldidTipoTamanioControl.setText(tipotamaniocontrolBean.getId().toString());
			this.jInternalFrameDetalleFormTipoTamanioControl.jTextFieldcodigoTipoTamanioControl.setText(tipotamaniocontrolBean.getcodigo());
			this.jInternalFrameDetalleFormTipoTamanioControl.jTextAreanombreTipoTamanioControl.setText(tipotamaniocontrolBean.getnombre());
			this.jInternalFrameDetalleFormTipoTamanioControl.jTextAreadescripcionTipoTamanioControl.setText(tipotamaniocontrolBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoTamanioControl(TipoTamanioControlParameterReturnGeneral tipotamaniocontrolReturnGeneral,TipoTamanioControlBean tipotamaniocontrolBean,Boolean conDefault) throws Exception { 
		try {
			TipoTamanioControl tipotamaniocontrolLocal=new TipoTamanioControl();
			
			tipotamaniocontrolLocal=tipotamaniocontrolReturnGeneral.getTipoTamanioControl();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipotamaniocontrolLocal.getId()!=null && !tipotamaniocontrolLocal.getId().equals(0L))) {tipotamaniocontrolBean.setId(tipotamaniocontrolLocal.getId());}}
			if(conDefault || (!conDefault && tipotamaniocontrolLocal.getcodigo()!=null && !tipotamaniocontrolLocal.getcodigo().equals(""))) {tipotamaniocontrolBean.setcodigo(tipotamaniocontrolLocal.getcodigo());}
			if(conDefault || (!conDefault && tipotamaniocontrolLocal.getnombre()!=null && !tipotamaniocontrolLocal.getnombre().equals(""))) {tipotamaniocontrolBean.setnombre(tipotamaniocontrolLocal.getnombre());}
			if(conDefault || (!conDefault && tipotamaniocontrolLocal.getdescripcion()!=null && !tipotamaniocontrolLocal.getdescripcion().equals(""))) {tipotamaniocontrolBean.setdescripcion(tipotamaniocontrolLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoTamanioControlGenerico(Long idTipoTamanioControlSeleccionado,JComboBox jComboBoxTipoTamanioControl,List<TipoTamanioControl> tipotamaniocontrolsLocal)throws Exception {
		try {
			TipoTamanioControl  tipotamaniocontrolTemp=null;

			for(TipoTamanioControl tipotamaniocontrolAux:tipotamaniocontrolsLocal) {
				if(tipotamaniocontrolAux.getId()!=null && tipotamaniocontrolAux.getId().equals(idTipoTamanioControlSeleccionado)) {
					tipotamaniocontrolTemp=tipotamaniocontrolAux;
					break;
				}
			}

			jComboBoxTipoTamanioControl.setSelectedItem(tipotamaniocontrolTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoTamanioControlGenerico(JComboBox jComboBoxTipoTamanioControl,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoTamanioControl.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoTamanioControl.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoTamanioControl.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoTamanioControl.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoTamanioControl.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoTamanioControl.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoTamanioControl.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoTamanioControl.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoTamanioControl.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoTamanioControl.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipotamaniocontrol=(TipoTamanioControl) tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipotamaniocontrol =(TipoTamanioControl) tipotamaniocontrols.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoTamanioControl tipotamaniocontrolRow=new TipoTamanioControl();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipotamaniocontrolRow=(TipoTamanioControl) tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipotamaniocontrolRow=(TipoTamanioControl) tipotamaniocontrols.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoTamanioControl(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoTamanioControl.setVisible((this.isVisibilidadCeldaNuevoTipoTamanioControl && this.isPermisoNuevoTipoTamanioControl));			
			this.jButtonDuplicarTipoTamanioControl.setVisible((this.isVisibilidadCeldaDuplicarTipoTamanioControl && this.isPermisoDuplicarTipoTamanioControl));			
			this.jButtonCopiarTipoTamanioControl.setVisible((this.isVisibilidadCeldaCopiarTipoTamanioControl && this.isPermisoCopiarTipoTamanioControl));
			this.jButtonVerFormTipoTamanioControl.setVisible((this.isVisibilidadCeldaVerFormTipoTamanioControl && this.isPermisoVerFormTipoTamanioControl));
			
			this.jButtonAbrirOrderByTipoTamanioControl.setVisible((this.isVisibilidadCeldaOrdenTipoTamanioControl && this.isPermisoOrdenTipoTamanioControl));			
			
			this.jButtonNuevoRelacionesTipoTamanioControl.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoTamanioControl && this.isPermisoNuevoTipoTamanioControl));			
			this.jButtonNuevoGuardarCambiosTipoTamanioControl.setVisible((this.isVisibilidadCeldaNuevoTipoTamanioControl && this.isPermisoNuevoTipoTamanioControl && this.isPermisoGuardarCambiosTipoTamanioControl));
			
			if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) {
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonModificarTipoTamanioControl.setVisible((this.isVisibilidadCeldaModificarTipoTamanioControl && this.isPermisoActualizarTipoTamanioControl));	
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonActualizarTipoTamanioControl.setVisible((this.isVisibilidadCeldaActualizarTipoTamanioControl && this.isPermisoActualizarTipoTamanioControl));	
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonEliminarTipoTamanioControl.setVisible((this.isVisibilidadCeldaEliminarTipoTamanioControl && this.isPermisoEliminarTipoTamanioControl));
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonCancelarTipoTamanioControl.setVisible(this.isVisibilidadCeldaCancelarTipoTamanioControl);							
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonGuardarCambiosTipoTamanioControl.setVisible((this.isVisibilidadCeldaGuardarTipoTamanioControl && this.isPermisoGuardarCambiosTipoTamanioControl));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoTamanioControl.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoTamanioControl && this.isPermisoGuardarCambiosTipoTamanioControl));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoTamanioControl.setVisible((this.isVisibilidadCeldaNuevoTipoTamanioControl && this.isPermisoNuevoTipoTamanioControl));						
			this.jButtonDuplicarToolBarTipoTamanioControl.setVisible((this.isVisibilidadCeldaDuplicarTipoTamanioControl && this.isPermisoDuplicarTipoTamanioControl));						
			this.jButtonCopiarToolBarTipoTamanioControl.setVisible((this.isVisibilidadCeldaCopiarTipoTamanioControl && this.isPermisoCopiarTipoTamanioControl));			
			this.jButtonVerFormToolBarTipoTamanioControl.setVisible((this.isVisibilidadCeldaVerFormTipoTamanioControl && this.isPermisoVerFormTipoTamanioControl));			
			this.jButtonAbrirOrderByToolBarTipoTamanioControl.setVisible((this.isVisibilidadCeldaOrdenTipoTamanioControl && this.isPermisoOrdenTipoTamanioControl));
			this.jButtonNuevoRelacionesToolBarTipoTamanioControl.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoTamanioControl && this.isPermisoNuevoTipoTamanioControl));			
			this.jButtonNuevoGuardarCambiosToolBarTipoTamanioControl.setVisible((this.isVisibilidadCeldaNuevoTipoTamanioControl && this.isPermisoNuevoTipoTamanioControl && this.isPermisoGuardarCambiosTipoTamanioControl));			
			
			if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) {
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonModificarToolBarTipoTamanioControl.setVisible((this.isVisibilidadCeldaModificarTipoTamanioControl && this.isPermisoActualizarTipoTamanioControl));	
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonActualizarToolBarTipoTamanioControl.setVisible((this.isVisibilidadCeldaActualizarTipoTamanioControl  && this.isPermisoActualizarTipoTamanioControl));	
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonEliminarToolBarTipoTamanioControl.setVisible((this.isVisibilidadCeldaEliminarTipoTamanioControl && this.isPermisoEliminarTipoTamanioControl));
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonCancelarToolBarTipoTamanioControl.setVisible(this.isVisibilidadCeldaCancelarTipoTamanioControl);				
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonGuardarCambiosToolBarTipoTamanioControl.setVisible((this.isVisibilidadCeldaGuardarTipoTamanioControl && this.isPermisoGuardarCambiosTipoTamanioControl));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoTamanioControl.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoTamanioControl && this.isPermisoGuardarCambiosTipoTamanioControl));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoTamanioControl.setVisible((this.isVisibilidadCeldaNuevoTipoTamanioControl && this.isPermisoNuevoTipoTamanioControl));			
			this.jMenuItemDuplicarTipoTamanioControl.setVisible((this.isVisibilidadCeldaDuplicarTipoTamanioControl && this.isPermisoDuplicarTipoTamanioControl));			
			this.jMenuItemCopiarTipoTamanioControl.setVisible((this.isVisibilidadCeldaCopiarTipoTamanioControl && this.isPermisoCopiarTipoTamanioControl));			
			this.jMenuItemVerFormTipoTamanioControl.setVisible((this.isVisibilidadCeldaVerFormTipoTamanioControl && this.isPermisoVerFormTipoTamanioControl));			
			this.jMenuItemAbrirOrderByTipoTamanioControl.setVisible((this.isVisibilidadCeldaOrdenTipoTamanioControl && this.isPermisoOrdenTipoTamanioControl));			
			//this.jMenuItemMostrarOcultarTipoTamanioControl.setVisible((this.isVisibilidadCeldaOrdenTipoTamanioControl && this.isPermisoOrdenTipoTamanioControl));
			this.jMenuItemDetalleAbrirOrderByTipoTamanioControl.setVisible((this.isVisibilidadCeldaOrdenTipoTamanioControl && this.isPermisoOrdenTipoTamanioControl));			
			//this.jMenuItemDetalleMostrarOcultarTipoTamanioControl.setVisible((this.isVisibilidadCeldaOrdenTipoTamanioControl && this.isPermisoOrdenTipoTamanioControl));			
			this.jMenuItemNuevoRelacionesTipoTamanioControl.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoTamanioControl && this.isPermisoNuevoTipoTamanioControl));			
			this.jMenuItemNuevoGuardarCambiosTipoTamanioControl.setVisible((this.isVisibilidadCeldaNuevoTipoTamanioControl && this.isPermisoNuevoTipoTamanioControl && this.isPermisoGuardarCambiosTipoTamanioControl));									
			
			if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) {
			this.jInternalFrameDetalleFormTipoTamanioControl.jMenuItemModificarTipoTamanioControl.setVisible((this.isVisibilidadCeldaModificarTipoTamanioControl && this.isPermisoActualizarTipoTamanioControl));	
			this.jInternalFrameDetalleFormTipoTamanioControl.jMenuItemActualizarTipoTamanioControl.setVisible((this.isVisibilidadCeldaActualizarTipoTamanioControl && this.isPermisoActualizarTipoTamanioControl));	
			this.jInternalFrameDetalleFormTipoTamanioControl.jMenuItemEliminarTipoTamanioControl.setVisible((this.isVisibilidadCeldaEliminarTipoTamanioControl && this.isPermisoEliminarTipoTamanioControl));
			this.jInternalFrameDetalleFormTipoTamanioControl.jMenuItemCancelarTipoTamanioControl.setVisible(this.isVisibilidadCeldaCancelarTipoTamanioControl);				
			}
			
			this.jMenuItemGuardarCambiosTipoTamanioControl.setVisible((this.isVisibilidadCeldaGuardarTipoTamanioControl && this.isPermisoGuardarCambiosTipoTamanioControl));						
			this.jMenuItemGuardarCambiosTablaTipoTamanioControl.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoTamanioControl && this.isPermisoGuardarCambiosTipoTamanioControl));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoTamanioControl=this.jButtonNuevoTipoTamanioControl.isVisible();
			this.isVisibilidadCeldaDuplicarTipoTamanioControl=this.jButtonDuplicarTipoTamanioControl.isVisible();
			this.isVisibilidadCeldaCopiarTipoTamanioControl=this.jButtonCopiarTipoTamanioControl.isVisible();
			this.isVisibilidadCeldaVerFormTipoTamanioControl=this.jButtonVerFormTipoTamanioControl.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoTamanioControl=this.jButtonAbrirOrderByTipoTamanioControl.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoTamanioControl=this.jButtonNuevoRelacionesTipoTamanioControl.isVisible();
			this.isVisibilidadCeldaModificarTipoTamanioControl=this.jButtonModificarTipoTamanioControl.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) {
			this.isVisibilidadCeldaActualizarTipoTamanioControl=this.jInternalFrameDetalleFormTipoTamanioControl.jButtonActualizarTipoTamanioControl.isVisible();
			this.isVisibilidadCeldaEliminarTipoTamanioControl=this.jInternalFrameDetalleFormTipoTamanioControl.jButtonEliminarTipoTamanioControl.isVisible();
			this.isVisibilidadCeldaCancelarTipoTamanioControl=this.jInternalFrameDetalleFormTipoTamanioControl.jButtonCancelarTipoTamanioControl.isVisible();
			this.isVisibilidadCeldaGuardarTipoTamanioControl=this.jInternalFrameDetalleFormTipoTamanioControl.jButtonGuardarCambiosTipoTamanioControl.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoTamanioControl=this.jButtonGuardarCambiosTablaTipoTamanioControl.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoTamanioControl=this.jButtonNuevoToolBarTipoTamanioControl.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoTamanioControl=this.jButtonNuevoRelacionesToolBarTipoTamanioControl.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) {
			this.isVisibilidadCeldaModificarTipoTamanioControl=this.jInternalFrameDetalleFormTipoTamanioControl.jButtonModificarToolBarTipoTamanioControl.isVisible();
			this.isVisibilidadCeldaActualizarTipoTamanioControl=this.jInternalFrameDetalleFormTipoTamanioControl.jButtonActualizarToolBarTipoTamanioControl.isVisible();
			this.isVisibilidadCeldaEliminarTipoTamanioControl=this.jInternalFrameDetalleFormTipoTamanioControl.jButtonEliminarToolBarTipoTamanioControl.isVisible();
			this.isVisibilidadCeldaCancelarTipoTamanioControl=this.jInternalFrameDetalleFormTipoTamanioControl.jButtonCancelarToolBarTipoTamanioControl.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoTamanioControl=this.jButtonGuardarCambiosToolBarTipoTamanioControl.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoTamanioControl=this.jButtonGuardarCambiosTablaToolBarTipoTamanioControl.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoTamanioControl=this.jMenuItemNuevoTipoTamanioControl.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoTamanioControl=this.jMenuItemNuevoRelacionesTipoTamanioControl.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) {
			this.isVisibilidadCeldaModificarTipoTamanioControl=this.jInternalFrameDetalleFormTipoTamanioControl.jMenuItemModificarTipoTamanioControl.isVisible();
			this.isVisibilidadCeldaActualizarTipoTamanioControl=this.jInternalFrameDetalleFormTipoTamanioControl.jMenuItemActualizarTipoTamanioControl.isVisible();
			this.isVisibilidadCeldaEliminarTipoTamanioControl=this.jInternalFrameDetalleFormTipoTamanioControl.jMenuItemEliminarTipoTamanioControl.isVisible();
			this.isVisibilidadCeldaCancelarTipoTamanioControl=this.jInternalFrameDetalleFormTipoTamanioControl.jMenuItemCancelarTipoTamanioControl.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoTamanioControl=this.jMenuItemGuardarCambiosTipoTamanioControl.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoTamanioControl=this.jMenuItemGuardarCambiosTablaTipoTamanioControl.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoTamanioControl(Boolean esInicializar) {
		if(TipoTamanioControlJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipotamaniocontrolSessionBean.getConGuardarRelaciones()) {
				//if(this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoTamanioControl();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoTamanioControl(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoTamanioControl() {
		this.jButtonNuevoTipoTamanioControl.setVisible(this.isPermisoNuevoTipoTamanioControl);			
		this.jButtonDuplicarTipoTamanioControl.setVisible(this.isPermisoDuplicarTipoTamanioControl);			
		this.jButtonCopiarTipoTamanioControl.setVisible(this.isPermisoCopiarTipoTamanioControl);			
		this.jButtonVerFormTipoTamanioControl.setVisible(this.isPermisoVerFormTipoTamanioControl);			
		
		this.jButtonAbrirOrderByTipoTamanioControl.setVisible(this.isPermisoOrdenTipoTamanioControl);					
		
		this.jButtonNuevoRelacionesTipoTamanioControl.setVisible(this.isPermisoNuevoTipoTamanioControl);			
		
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonModificarTipoTamanioControl.setVisible(this.isPermisoActualizarTipoTamanioControl);	
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonActualizarTipoTamanioControl.setVisible(this.isPermisoActualizarTipoTamanioControl);	
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonEliminarTipoTamanioControl.setVisible(this.isPermisoEliminarTipoTamanioControl);
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonCancelarTipoTamanioControl.setVisible(this.isVisibilidadCeldaCancelarTipoTamanioControl);						
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonGuardarCambiosTipoTamanioControl.setVisible(this.isPermisoGuardarCambiosTipoTamanioControl);							
		}
		
		this.jButtonGuardarCambiosTablaTipoTamanioControl.setVisible(this.isPermisoActualizarTipoTamanioControl);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoTamanioControl() {
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtonModificarTipoTamanioControl.setVisible(this.isPermisoActualizarTipoTamanioControl);	
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtonActualizarTipoTamanioControl.setVisible(this.isPermisoActualizarTipoTamanioControl);	
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtonEliminarTipoTamanioControl.setVisible(this.isPermisoEliminarTipoTamanioControl);
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtonCancelarTipoTamanioControl.setVisible(this.isVisibilidadCeldaCancelarTipoTamanioControl);							
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtonGuardarCambiosTipoTamanioControl.setVisible((this.isVisibilidadCeldaGuardarTipoTamanioControl && this.isPermisoGuardarCambiosTipoTamanioControl));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoTamanioControl() {
		if(TipoTamanioControlJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoTamanioControl();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoTamanioControl() {
	}
	
	public void jTableDatosTipoTamanioControlListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoTamanioControl(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoTamanioControlBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrolLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTamanioControl.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTamanioControl(this.gettipotamaniocontrol(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTamanioControl(this.tipotamaniocontrol);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipotamaniocontrol==null) {
						this.tipotamaniocontrol = new TipoTamanioControl();
					}

					this.setVariablesFormularioToObjetoActualTipoTamanioControl(this.tipotamaniocontrol,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTamanioControl(this.tipotamaniocontrol);
				}

				if(this.tipotamaniocontrol.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipotamaniocontrol.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTamanioControl(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrolLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrolLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrolLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoTamanioControlBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrolLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTamanioControl.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTamanioControl(this.gettipotamaniocontrol(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTamanioControl(this.tipotamaniocontrol);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipotamaniocontrol==null) {
						this.tipotamaniocontrol = new TipoTamanioControl();
					}

					this.setVariablesFormularioToObjetoActualTipoTamanioControl(this.tipotamaniocontrol,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTamanioControl(this.tipotamaniocontrol);
				}

				if(this.tipotamaniocontrol.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipotamaniocontrol.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTamanioControl(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrolLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrolLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrolLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoTamanioControlBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrolLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTamanioControl.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTamanioControl(this.gettipotamaniocontrol(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTamanioControl(this.tipotamaniocontrol);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipotamaniocontrol==null) {
						this.tipotamaniocontrol = new TipoTamanioControl();
					}

					this.setVariablesFormularioToObjetoActualTipoTamanioControl(this.tipotamaniocontrol,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTamanioControl(this.tipotamaniocontrol);
				}

				if(this.tipotamaniocontrol.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipotamaniocontrol.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTamanioControl(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrolLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrolLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrolLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTipoTamanioControlBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrolLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTamanioControl.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTamanioControl(this.gettipotamaniocontrol(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTamanioControl(this.tipotamaniocontrol);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipotamaniocontrol==null) {
						this.tipotamaniocontrol = new TipoTamanioControl();
					}

					this.setVariablesFormularioToObjetoActualTipoTamanioControl(this.tipotamaniocontrol,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTamanioControl(this.tipotamaniocontrol);
				}

				if(this.tipotamaniocontrol.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.tipotamaniocontrol.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTamanioControl(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrolLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrolLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrolLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoTamanioControl() {
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) {
			this.jInternalFrameDetalleFormTipoTamanioControl.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoTamanioControl.dispose();
			this.jInternalFrameDetalleFormTipoTamanioControl=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoTamanioControl!=null) {
			this.jInternalFrameReporteDinamicoTipoTamanioControl.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoTamanioControl.dispose();
			this.jInternalFrameReporteDinamicoTipoTamanioControl=null;
		}
		
		if(this.jInternalFrameImportacionTipoTamanioControl!=null) {
			this.jInternalFrameImportacionTipoTamanioControl.setVisible(false);	    			
			this.jInternalFrameImportacionTipoTamanioControl.dispose();
			this.jInternalFrameImportacionTipoTamanioControl=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoTamanioControl();
			
			TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoTamanioControl")) {
				jButtonNuevoTipoTamanioControlActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoTamanioControl")) {
				jButtonDuplicarTipoTamanioControlActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoTamanioControl")) {
				jButtonCopiarTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoTamanioControl")) {
				jButtonVerFormTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoTamanioControl")) {
				jButtonNuevoTipoTamanioControlActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoTamanioControl")) {
				jButtonDuplicarTipoTamanioControlActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoTamanioControl")) {
				jButtonNuevoTipoTamanioControlActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoTamanioControl")) {
				jButtonDuplicarTipoTamanioControlActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoTamanioControl")) {
				jButtonNuevoTipoTamanioControlActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoTamanioControl")) {
				jButtonNuevoTipoTamanioControlActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoTamanioControl")) {
				jButtonNuevoTipoTamanioControlActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoTamanioControl")) {
				jButtonModificarTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoTamanioControl")) {
				jButtonModificarTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoTamanioControl")) {
				jButtonModificarTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoTamanioControl")) {
				jButtonActualizarTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoTamanioControl")) {
				jButtonActualizarTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoTamanioControl")) {
				jButtonActualizarTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoTamanioControl")) {
				jButtonEliminarTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoTamanioControl")) {
				jButtonEliminarTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoTamanioControl")) {
				jButtonEliminarTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoTamanioControl")) {
				jButtonCancelarTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoTamanioControl")) {
				jButtonCancelarTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoTamanioControl")) {
				jButtonCancelarTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoTamanioControl")) {
				jButtonCerrarTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoTamanioControl")) {
				jButtonCerrarTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoTamanioControl")) {
				jButtonCerrarTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoTamanioControl")) {
				jButtonMostrarOcultarTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoTamanioControl")) {
				jButtonCancelarTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoTamanioControl")) {
				jButtonGuardarCambiosTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoTamanioControl")) {
				jButtonGuardarCambiosTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoTamanioControl")) {
				jButtonCopiarTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoTamanioControl")) {
				jButtonVerFormTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoTamanioControl")) {
				jButtonGuardarCambiosTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoTamanioControl")) {
				jButtonCopiarTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoTamanioControl")) {
				jButtonVerFormTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoTamanioControl")) {
				jButtonGuardarCambiosTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoTamanioControl")) {
				jButtonGuardarCambiosTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoTamanioControl")) {
				jButtonGuardarCambiosTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoTamanioControl")) {
				jButtonRecargarInformacionTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoTamanioControl")) {
				jButtonRecargarInformacionTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoTamanioControl")) {
				jButtonRecargarInformacionTipoTamanioControlActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoTamanioControl")) {
				jButtonAnterioresTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoTamanioControl")) {
				jButtonAnterioresTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoTamanioControl")) {
				jButtonAnterioresTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoTamanioControl")) {
				jButtonSiguientesTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoTamanioControl")) {
				jButtonSiguientesTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoTamanioControl")) {
				jButtonSiguientesTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoTamanioControl") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoTamanioControl")) {
				jButtonAbrirOrderByTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoTamanioControl") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoTamanioControl")) {
				jButtonMostrarOcultarTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoTamanioControl")) {
				jButtonNuevoGuardarCambiosTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoTamanioControl")) {
				jButtonNuevoGuardarCambiosTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoTamanioControl")) {
				jButtonNuevoGuardarCambiosTipoTamanioControlActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoTamanioControl")) {
				jButtonCerrarReporteDinamicoTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoTamanioControl")) {
				jButtonGenerarReporteDinamicoTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoTamanioControl")) {
				
				jButtonGenerarExcelReporteDinamicoTipoTamanioControlActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoTamanioControl")) {
				jButtonCerrarImportacionTipoTamanioControlActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoTamanioControl")) {
				
				jButtonGenerarImportacionTipoTamanioControlActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoTamanioControl")) {
				
				jButtonAbrirImportacionTipoTamanioControlActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoTamanioControl")) {
				jComboBoxTiposAccionesTipoTamanioControlActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoTamanioControl")) {
				jComboBoxTiposRelacionesTipoTamanioControlActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoTamanioControl")) {
				jComboBoxTiposAccionesTipoTamanioControlActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoTamanioControl")) {
				
				jComboBoxTiposSeleccionarTipoTamanioControlActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoTamanioControl")) {
				jTextFieldValorCampoGeneralTipoTamanioControlActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoTamanioControl")) {
				jButtonAbrirOrderByTipoTamanioControlActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoTamanioControl")) {
				jButtonAbrirOrderByTipoTamanioControlActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoTamanioControl")) {
				jButtonCerrarOrderByTipoTamanioControlActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoTamanioControlBusqueda")) {
				this.jButtonidTipoTamanioControlBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoTamanioControlBusqueda")) {
				this.jButtoncodigoTipoTamanioControlBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoTamanioControlBusqueda")) {
				this.jButtonnombreTipoTamanioControlBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoTamanioControlBusqueda")) {
				this.jButtondescripcionTipoTamanioControlBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoTamanioControl();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTamanioControlActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotamaniocontrol);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotamaniocontrol);
				
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
				
				


				
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTamanioControl.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTamanioControl.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoTamanioControl tipotamaniocontrolLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipotamaniocontrolLocal=this.tipotamaniocontrol;
			} else {
				tipotamaniocontrolLocal=this.tipotamaniocontrolAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotamaniocontrol);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotamaniocontrol);
				
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
							
				
				


				
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTamanioControl.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTamanioControl.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTamanioControlActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTamanioControl.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrolAnterior =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotamaniocontrolAnterior =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
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
			
			TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
			
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
			
			


			
			TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTamanioControlActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotamaniocontrol);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotamaniocontrol);
				
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
								
						
				


				
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTamanioControl.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTamanioControl.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotamaniocontrol);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotamaniocontrol);
				
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
								
				
				


				
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTamanioControl.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTamanioControl.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTamanioControlActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTamanioControl.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrolAnterior =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotamaniocontrolAnterior =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotamaniocontrol);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotamaniocontrol);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTamanioControlActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTamanioControl.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrolAnterior =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotamaniocontrolAnterior =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTamanioControlActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotamaniocontrol);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipotamaniocontrol);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotamaniocontrol);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotamaniocontrol);
				
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
							
				
				


				
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTamanioControl.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTamanioControl.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTamanioControlActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoTamanioControl.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotamaniocontrolAnterior =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipotamaniocontrolAnterior =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
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
			
			TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
			
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
			
			


			
			TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTamanioControlActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotamaniocontrol);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipotamaniocontrol);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotamaniocontrol);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotamaniocontrol);
				
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
								
				
				


				
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTamanioControl.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTamanioControl.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTamanioControlActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTamanioControl.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrolAnterior =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotamaniocontrolAnterior =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTamanioControlActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotamaniocontrol);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipotamaniocontrol);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTamanioControlActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotamaniocontrol);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotamaniocontrol);
				
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoTamanioControl")) {
					jCheckBoxSeleccionarTodosTipoTamanioControlItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoTamanioControl")) {
					jCheckBoxSeleccionadosTipoTamanioControlItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoTamanioControl")) {
					
				}
				
				


				
				
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTamanioControl.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTamanioControl.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotamaniocontrol);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipotamaniocontrol);
				
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
												
				
				


				
				
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTamanioControl.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTamanioControl.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTamanioControlActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoTamanioControl.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotamaniocontrolAnterior =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipotamaniocontrolAnterior =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTamanioControlActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotamaniocontrol);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotamaniocontrol);
				
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
				
				
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
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
			
			TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
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
			
			


			
			TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTamanioControlActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotamaniocontrol);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotamaniocontrol);
				
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTamanioControl.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTamanioControl.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotamaniocontrol);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotamaniocontrol);
				
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
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
				
				


				
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTamanioControl.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTamanioControl.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTamanioControlActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTamanioControl.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotamaniocontrolAnterior =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotamaniocontrolAnterior =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoTamanioControl")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoTamanioControlListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoTamanioControl.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipotamaniocontrol =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipotamaniocontrol);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoTamanioControl")) {
				
				}
				
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoTamanioControl")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoTamanioControl.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoTamanioControl")) {
			
			}
			
			TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoTamanioControl();
			
			TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
			
			if(sTipo.equals("NuevoTipoTamanioControl")) {
				jButtonNuevoTipoTamanioControlActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoTamanioControl")) {
				jButtonDuplicarTipoTamanioControlActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoTamanioControl")) {
				jButtonCopiarTipoTamanioControlActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoTamanioControl")) {
				jButtonVerFormTipoTamanioControlActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoTamanioControl")) {
				jButtonNuevoTipoTamanioControlActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoTamanioControl")) {
				jButtonModificarTipoTamanioControlActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoTamanioControl")) {
				jButtonActualizarTipoTamanioControlActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoTamanioControl")) {
				jButtonEliminarTipoTamanioControlActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoTamanioControl")) {
				jButtonGuardarCambiosTipoTamanioControlActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoTamanioControl")) {
				jButtonCancelarTipoTamanioControlActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoTamanioControl")) {
				jButtonCerrarTipoTamanioControlActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoTamanioControl")) {
				jButtonGuardarCambiosTipoTamanioControlActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoTamanioControl")) {
				jButtonNuevoGuardarCambiosTipoTamanioControlActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoTamanioControl")) {
				jButtonAbrirOrderByTipoTamanioControlActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoTamanioControl")) {
				jButtonRecargarInformacionTipoTamanioControlActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoTamanioControl")) {
				jButtonAnterioresTipoTamanioControlActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoTamanioControl")) {
				jButtonSiguientesTipoTamanioControlActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoTamanioControlBusqueda")) {
				this.jButtonidTipoTamanioControlBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoTamanioControlBusqueda")) {
				this.jButtoncodigoTipoTamanioControlBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoTamanioControlBusqueda")) {
				this.jButtonnombreTipoTamanioControlBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoTamanioControlBusqueda")) {
				this.jButtondescripcionTipoTamanioControlBusquedaActionPerformed(evt);
			}
			
			TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoTamanioControl();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoTamanioControl")) {
				closingInternalFrameTipoTamanioControl();
				
			} else if(sTipo.equals("jButtonCancelarTipoTamanioControl")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoTamanioControl = (JInternalFrameBase)evt.getSource();
	            	
	            TipoTamanioControlBeanSwingJInternalFrame jInternalFrameParent=(TipoTamanioControlBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoTamanioControl.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoTamanioControlActionPerformed(null);
			}
			
			TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipotamaniocontrol,new Object(),this.tipotamaniocontrolParameterGeneral,this.tipotamaniocontrolReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoTamanioControl(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoTamanioControl(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoTamanioControl(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipotamaniocontrol)) {
			if(!esControlTabla) {
				if(TipoTamanioControlJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoTamanioControl(this.tipotamaniocontrol,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTamanioControl(this.tipotamaniocontrol);			
				}
				
				if(this.tipotamaniocontrolSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoTamanioControl(this.tipotamaniocontrol,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipotamaniocontrolReturnGeneral=tipotamaniocontrolLogic.procesarEventosTipoTamanioControlsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipotamaniocontrolLogic.getTipoTamanioControls(),this.tipotamaniocontrol,this.tipotamaniocontrolParameterGeneral,this.isEsNuevoTipoTamanioControl,classes);//this.tipotamaniocontrolLogic.getTipoTamanioControl()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoTamanioControl(this.tipotamaniocontrolReturnGeneral,this.tipotamaniocontrolBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipotamaniocontrolSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoTamanioControl(classes,this.tipotamaniocontrolReturnGeneral,this.tipotamaniocontrolBean,false);
					}
						
					if(this.tipotamaniocontrolReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoTamanioControl(this.tipotamaniocontrolReturnGeneral.getTipoTamanioControl());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoTamanioControl(this.tipotamaniocontrolReturnGeneral.getTipoTamanioControl());	
					}
						
					if(this.tipotamaniocontrolReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoTamanioControl(this.tipotamaniocontrolReturnGeneral.getTipoTamanioControl(),classes);//this.tipotamaniocontrolBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoTamanioControl(this.tipotamaniocontrol,classes);//this.tipotamaniocontrolBean);									
				}
			
				if(TipoTamanioControlJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoTamanioControl(this.tipotamaniocontrol,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTamanioControl(this.tipotamaniocontrol);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipotamaniocontrolAnterior!=null) {
						this.tipotamaniocontrol=this.tipotamaniocontrolAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipotamaniocontrolReturnGeneral=tipotamaniocontrolLogic.procesarEventosTipoTamanioControlsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipotamaniocontrolLogic.getTipoTamanioControls(),this.tipotamaniocontrol,this.tipotamaniocontrolParameterGeneral,this.isEsNuevoTipoTamanioControl,classes);//this.tipotamaniocontrolLogic.getTipoTamanioControl()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipotamaniocontrolSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipotamaniocontrolReturnGeneral.getTipoTamanioControl(),tipotamaniocontrolLogic.getTipoTamanioControls());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipotamaniocontrolReturnGeneral.getTipoTamanioControl(),this.tipotamaniocontrols);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoTamanioControl.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoTamanioControl.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoTamanioControl();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoTamanioControl() throws Exception {
		
		TipoTamanioControlModel tipotamaniocontrolModel=(TipoTamanioControlModel)this.jTableDatosTipoTamanioControl.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipotamaniocontrolModel.tipotamaniocontrols=this.tipotamaniocontrolLogic.getTipoTamanioControls();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipotamaniocontrolModel.tipotamaniocontrols=this.tipotamaniocontrols;
		}
		
		
		((TipoTamanioControlModel) this.jTableDatosTipoTamanioControl.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoTamanioControl() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipotamaniocontrolAnterior(),this.tipotamaniocontrolLogic.getTipoTamanioControls());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipotamaniocontrolAnterior(),this.tipotamaniocontrols);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoTamanioControl();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoTamanioControl(TipoTamanioControl tipotamaniocontrol,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
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
										
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipotamaniocontrol,new Object(),generalEntityParameterGeneral,this.tipotamaniocontrolReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipotamaniocontrolSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoTamanioControlConstantesFunciones.getClassesRelationshipsOfTipoTamanioControl(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoTamanioControlConstantesFunciones.getClassesRelationshipsFromStringsOfTipoTamanioControl(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoTamanioControl(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoTamanioControlBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipotamaniocontrol,new Object(),generalEntityParameterGeneral,this.tipotamaniocontrolReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoTamanioControl(TipoTamanioControlBean tipotamaniocontrolBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoTamanioControl(ArrayList<Classe> classes,TipoTamanioControlReturnGeneral tipotamaniocontrolReturnGeneral,TipoTamanioControlBean tipotamaniocontrolBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoTamanioControl(TipoTamanioControl tipotamaniocontrol,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipotamaniocontrol)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoTamanioControl = new TipoTamanioControlDetalleFormJInternalFrame(jDesktopPane,this.tipotamaniocontrolSessionBean.getConGuardarRelaciones(),this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoTamanioControl);
		this.jInternalFrameDetalleFormTipoTamanioControl.setVisible(false);
		this.jInternalFrameDetalleFormTipoTamanioControl.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoTamanioControl.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoTamanioControl.tipotamaniocontrolLogic=this.tipotamaniocontrolLogic;
		
		this.cargarCombosFrameForeignKeyTipoTamanioControl("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoTamanioControl();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoTamanioControl();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoTamanioControl("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoTamanioControl();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoTamanioControl.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoTamanioControl"));
		
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtonModificarTipoTamanioControl.addActionListener(new ButtonActionListener(this,"ModificarTipoTamanioControl"));

		
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtonModificarToolBarTipoTamanioControl.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoTamanioControl"));
					
		this.jInternalFrameDetalleFormTipoTamanioControl.jMenuItemModificarTipoTamanioControl.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoTamanioControl"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtonActualizarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"ActualizarTipoTamanioControl"));
		
		
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtonActualizarToolBarTipoTamanioControl.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoTamanioControl"));
						
		this.jInternalFrameDetalleFormTipoTamanioControl.jMenuItemActualizarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoTamanioControl"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtonEliminarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"EliminarTipoTamanioControl"));
		
		
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtonEliminarToolBarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoTamanioControl"));
								
		this.jInternalFrameDetalleFormTipoTamanioControl.jMenuItemEliminarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoTamanioControl"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtonCancelarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"CancelarTipoTamanioControl"));
		
		
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtonCancelarToolBarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoTamanioControl"));
					
		this.jInternalFrameDetalleFormTipoTamanioControl.jMenuItemCancelarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoTamanioControl"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoTamanioControl.jMenuItemDetalleCerrarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoTamanioControl"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtonGuardarCambiosToolBarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoTamanioControl"));
		
		
		
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtonGuardarCambiosToolBarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoTamanioControl"));
		
		
		
		this.jInternalFrameDetalleFormTipoTamanioControl.jComboBoxTiposAccionesFormularioTipoTamanioControl.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoTamanioControl"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtonidTipoTamanioControlBusqueda.addActionListener(new ButtonActionListener(this,"idTipoTamanioControlBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtoncodigoTipoTamanioControlBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoTamanioControlBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtonnombreTipoTamanioControlBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoTamanioControlBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtondescripcionTipoTamanioControlBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoTamanioControlBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoTamanioControl.jTabbedPaneRelacionesTipoTamanioControl.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoTamanioControl"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoTamanioControl"));
		
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTamanioControl.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoTamanioControl"));
		}
		
		this.jTableDatosTipoTamanioControl.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoTamanioControl"));
		
		this.jTableDatosTipoTamanioControl.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoTamanioControl"));
		
		this.jButtonNuevoTipoTamanioControl.addActionListener(new ButtonActionListener(this,"NuevoTipoTamanioControl"));
		
		this.jButtonDuplicarTipoTamanioControl.addActionListener(new ButtonActionListener(this,"DuplicarTipoTamanioControl"));
		
		this.jButtonCopiarTipoTamanioControl.addActionListener(new ButtonActionListener(this,"CopiarTipoTamanioControl"));
		
		this.jButtonVerFormTipoTamanioControl.addActionListener(new ButtonActionListener(this,"VerFormTipoTamanioControl"));
		
		
		this.jButtonNuevoToolBarTipoTamanioControl.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoTamanioControl"));
			
		this.jButtonDuplicarToolBarTipoTamanioControl.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoTamanioControl"));
			
		this.jMenuItemNuevoTipoTamanioControl.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoTamanioControl"));
			
		this.jMenuItemDuplicarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoTamanioControl"));		
		
		
		this.jButtonNuevoRelacionesTipoTamanioControl.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoTamanioControl"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoTamanioControl.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoTamanioControl"));
			
		this.jMenuItemNuevoRelacionesTipoTamanioControl.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoTamanioControl"));		
		
		
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonModificarTipoTamanioControl.addActionListener(new ButtonActionListener(this,"ModificarTipoTamanioControl"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonModificarToolBarTipoTamanioControl.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoTamanioControl"));
			
			this.jInternalFrameDetalleFormTipoTamanioControl.jMenuItemModificarTipoTamanioControl.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoTamanioControl"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonActualizarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"ActualizarTipoTamanioControl"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonActualizarToolBarTipoTamanioControl.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoTamanioControl"));
				
			this.jInternalFrameDetalleFormTipoTamanioControl.jMenuItemActualizarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoTamanioControl"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonEliminarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"EliminarTipoTamanioControl"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonEliminarToolBarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoTamanioControl"));
						
			this.jInternalFrameDetalleFormTipoTamanioControl.jMenuItemEliminarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoTamanioControl"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonCancelarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"CancelarTipoTamanioControl"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonCancelarToolBarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoTamanioControl"));
			
			this.jInternalFrameDetalleFormTipoTamanioControl.jMenuItemCancelarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoTamanioControl"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoTamanioControl"));		
		
		
		this.jButtonCerrarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"CerrarTipoTamanioControl"));
		
		
		this.jButtonCerrarToolBarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoTamanioControl"));
			
		this.jMenuItemCerrarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoTamanioControl"));
			
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTamanioControl.jMenuItemDetalleCerrarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoTamanioControl"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonGuardarCambiosTipoTamanioControl.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoTamanioControl"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTamanioControl.jButtonGuardarCambiosToolBarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoTamanioControl"));
		}
		
		this.jButtonCopiarToolBarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoTamanioControl"));
			
		this.jButtonVerFormToolBarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoTamanioControl"));
		
		this.jMenuItemGuardarCambiosTipoTamanioControl.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoTamanioControl"));
			
		this.jMenuItemCopiarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoTamanioControl"));		
		
		this.jMenuItemVerFormTipoTamanioControl.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoTamanioControl"));		
		
		
		this.jButtonGuardarCambiosTablaTipoTamanioControl.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoTamanioControl"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoTamanioControl"));
			
		this.jMenuItemGuardarCambiosTablaTipoTamanioControl.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoTamanioControl"));		
		
		
		
		this.jButtonRecargarInformacionTipoTamanioControl.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoTamanioControl"));
					
		this.jButtonRecargarInformacionToolBarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoTamanioControl"));
		
		this.jMenuItemRecargarInformacionTipoTamanioControl.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoTamanioControl"));		
		
		
		
		this.jButtonAnterioresTipoTamanioControl.addActionListener (new ButtonActionListener(this,"AnterioresTipoTamanioControl"));
		
		
		this.jButtonAnterioresToolBarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoTamanioControl"));
		
		this.jMenuItemAnterioresTipoTamanioControl.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoTamanioControl"));		
		
		
		this.jButtonSiguientesTipoTamanioControl.addActionListener (new ButtonActionListener(this,"SiguientesTipoTamanioControl"));
		
		
		this.jButtonSiguientesToolBarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoTamanioControl"));
			
		this.jMenuItemSiguientesTipoTamanioControl.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoTamanioControl"));
			
		this.jMenuItemAbrirOrderByTipoTamanioControl.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoTamanioControl"));
			
		this.jMenuItemMostrarOcultarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoTamanioControl"));
			
		this.jMenuItemDetalleAbrirOrderByTipoTamanioControl.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoTamanioControl"));
			
		this.jMenuItemDetalleMostarOcultarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoTamanioControl"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoTamanioControl.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoTamanioControl"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoTamanioControl"));
			
		this.jMenuItemNuevoGuardarCambiosTipoTamanioControl.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoTamanioControl"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoTamanioControl.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoTamanioControl"));

		this.jCheckBoxSeleccionadosTipoTamanioControl.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoTamanioControl"));
		
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTamanioControl.jComboBoxTiposAccionesFormularioTipoTamanioControl.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoTamanioControl"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoTamanioControl.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoTamanioControl"));
			
		this.jComboBoxTiposAccionesTipoTamanioControl.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoTamanioControl"));
					
		this.jComboBoxTiposSeleccionarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoTamanioControl"));
			
		this.jTextFieldValorCampoGeneralTipoTamanioControl.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoTamanioControl"));		
		
		
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtonidTipoTamanioControlBusqueda.addActionListener(new ButtonActionListener(this,"idTipoTamanioControlBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtoncodigoTipoTamanioControlBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoTamanioControlBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtonnombreTipoTamanioControlBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoTamanioControlBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtondescripcionTipoTamanioControlBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoTamanioControlBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoTamanioControl!=null) {
				this.jInternalFrameReporteDinamicoTipoTamanioControl.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoTamanioControl"));
				this.jInternalFrameReporteDinamicoTipoTamanioControl.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoTamanioControl"));
				this.jInternalFrameReporteDinamicoTipoTamanioControl.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoTamanioControl"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoTamanioControl.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoTamanioControl"));				
			//this.jButtonGenerarReporteDinamicoTipoTamanioControl.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoTamanioControl"));
			//this.jButtonGenerarExcelReporteDinamicoTipoTamanioControl.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoTamanioControl"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoTamanioControl!=null) {
				this.jInternalFrameImportacionTipoTamanioControl.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoTamanioControl"));
				this.jInternalFrameImportacionTipoTamanioControl.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoTamanioControl"));
				this.jInternalFrameImportacionTipoTamanioControl.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoTamanioControl"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoTamanioControl.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoTamanioControl"));
			
			this.jButtonAbrirOrderByToolBarTipoTamanioControl.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoTamanioControl"));			
			
			if(this.jInternalFrameOrderByTipoTamanioControl!=null) {
				this.jInternalFrameOrderByTipoTamanioControl.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoTamanioControl"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTamanioControl.jTabbedPaneRelacionesTipoTamanioControl.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoTamanioControl"));
		
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
            		closingInternalFrameTipoTamanioControl();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoTamanioControl.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoTamanioControl = (JInternalFrameBase)event.getSource();
	            	
	            TipoTamanioControlBeanSwingJInternalFrame jInternalFrameParent=(TipoTamanioControlBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoTamanioControl.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoTamanioControlActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoTamanioControl.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoTamanioControlListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoTamanioControl.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoTamanioControl.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTamanioControlActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTamanioControlActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTamanioControlActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoTamanioControl";
		inputMap = this.jButtonNuevoTipoTamanioControl.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoTamanioControl.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoTamanioControlActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTamanioControlActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTamanioControlActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTamanioControlActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoTamanioControl";
		inputMap = this.jButtonNuevoRelacionesTipoTamanioControl.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoTamanioControl.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoTamanioControlActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoTamanioControl";
		inputMap = this.jButtonModificarTipoTamanioControl.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoTamanioControl.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoTamanioControlActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoTamanioControl";
		inputMap = this.jButtonActualizarTipoTamanioControl.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoTamanioControl.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoTamanioControlActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoTamanioControl";
		inputMap = this.jButtonEliminarTipoTamanioControl.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoTamanioControl.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoTamanioControlActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoTamanioControl";
		inputMap = this.jButtonCancelarTipoTamanioControl.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoTamanioControl.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoTamanioControlActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoTamanioControl";
		inputMap = this.jButtonCerrarTipoTamanioControl.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoTamanioControl.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoTamanioControlActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtonGuardarCambiosTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoTamanioControl";
		inputMap = this.jInternalFrameDetalleFormTipoTamanioControl.jButtonGuardarCambiosTipoTamanioControl.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtonGuardarCambiosTipoTamanioControl.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoTamanioControlActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoTamanioControl.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoTamanioControlItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoTamanioControl.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoTamanioControlActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoTamanioControl.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoTamanioControlActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoTamanioControl.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoTamanioControlActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtonidTipoTamanioControlBusqueda.addActionListener(new ButtonActionListener(this,"idTipoTamanioControlBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtoncodigoTipoTamanioControlBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoTamanioControlBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtonnombreTipoTamanioControlBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoTamanioControlBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTamanioControl.jButtondescripcionTipoTamanioControlBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoTamanioControlBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoTamanioControl.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoTamanioControlActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoTamanioControlActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoTamanioControl.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoTamanioControl(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoTamanioControl tipotamaniocontrolAux:this.tipotamaniocontrolLogic.getTipoTamanioControls()) {
					tipotamaniocontrolAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTamanioControl tipotamaniocontrolAux:tipotamaniocontrols) {
					tipotamaniocontrolAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoTamanioControlItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoTamanioControl(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoTamanioControl tipotamaniocontrolAux:this.tipotamaniocontrolLogic.getTipoTamanioControls()) {
						tipotamaniocontrolAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoTamanioControl tipotamaniocontrolAux:tipotamaniocontrols) {
						tipotamaniocontrolAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoTamanioControl tipotamaniocontrolAux:this.tipotamaniocontrolLogic.getTipoTamanioControls()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoTamanioControl tipotamaniocontrolAux:tipotamaniocontrols) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoTamanioControl(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoTamanioControl.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoTamanioControl.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoTamanioControl,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoTamanioControlItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoTamanioControl(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoTamanioControl.getSelectedRows();
			
			TipoTamanioControl tipotamaniocontrolLocal=new TipoTamanioControl();
			
			//this.seleccionarTodosTipoTamanioControl(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotamaniocontrolLocal =(TipoTamanioControl) this.tipotamaniocontrolLogic.getTipoTamanioControls().toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipotamaniocontrolLocal =(TipoTamanioControl) this.tipotamaniocontrols.toArray()[this.jTableDatosTipoTamanioControl.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipotamaniocontrolLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoTamanioControl tipotamaniocontrolAux:this.tipotamaniocontrolLogic.getTipoTamanioControls()) {
						tipotamaniocontrolAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoTamanioControl tipotamaniocontrolAux:tipotamaniocontrols) {
						tipotamaniocontrolAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoTamanioControl(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoTamanioControl.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoTamanioControl.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoTamanioControl,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoTamanioControlItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoTamanioControlParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoTamanioControlActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoTamanioControl(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoTamanioControl.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoTamanioControl tipotamaniocontrolAux:this.tipotamaniocontrolLogic.getTipoTamanioControls()) {
				
						if(sTipoSeleccionar.equals(TipoTamanioControlConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipotamaniocontrolAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoTamanioControlConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipotamaniocontrolAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoTamanioControlConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipotamaniocontrolAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTamanioControl tipotamaniocontrolAux:tipotamaniocontrols) {
					
						if(sTipoSeleccionar.equals(TipoTamanioControlConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipotamaniocontrolAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoTamanioControlConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipotamaniocontrolAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoTamanioControlConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipotamaniocontrolAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoTamanioControl(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoTamanioControlActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoTamanioControl(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoTamanioControl=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoTamanioControl.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoTamanioControl.jComboBoxTiposAccionesFormularioTipoTamanioControl.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoTamanioControl) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoTamanioControl(conSplash);
				
					this.generarReporteTipoTamanioControlsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTamanioControl.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTamanioControl.jComboBoxTiposAccionesFormularioTipoTamanioControl.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoTamanioControlsSeleccionados();
				//this.jComboBoxTiposAccionesTipoTamanioControl.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoTamanioControlsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoTamanioControl.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoTamanioControlsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoTamanioControl.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoTamanioControl();
				
				this.exportarTipoTamanioControlsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTamanioControl.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTamanioControl.jComboBoxTiposAccionesFormularioTipoTamanioControl.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoTamanioControls();
				//this.importarTipoTamanioControls();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTamanioControl.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTamanioControl.jComboBoxTiposAccionesFormularioTipoTamanioControl.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoTamanioControl();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoTamanioControlsSeleccionados();
				//this.jComboBoxTiposAccionesTipoTamanioControl.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Tamanio Control", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoTamanioControl();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoTamanioControl)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoTamanioControl(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Tamanio Control",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTamanioControl.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTamanioControl.jComboBoxTiposAccionesFormularioTipoTamanioControl.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoTamanioControl();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoTamanioControl(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoTamanioControlActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoTamanioControl();
			
			if(this.jInternalFrameDetalleFormTipoTamanioControl==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoTamanioControl> tipotamaniocontrolsSeleccionados=new ArrayList<TipoTamanioControl>();		
			TipoTamanioControl tipotamaniocontrol=new TipoTamanioControl();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoTamanioControl(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoTamanioControl.getSelectedItem();
			
			
			
			
			tipotamaniocontrolsSeleccionados=this.getTipoTamanioControlsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipotamaniocontrolsSeleccionados.size()==1) {
				for(TipoTamanioControl tipotamaniocontrolAux:tipotamaniocontrolsSeleccionados) {
					tipotamaniocontrol=tipotamaniocontrolAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoTamanioControl();
			
      		//this.finishProcessTipoTamanioControl(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoTamanioControlReturnGeneral() throws Exception {
		if(this.tipotamaniocontrolReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipotamaniocontrolReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipotamaniocontrolReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipotamaniocontrolReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipotamaniocontrolReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipotamaniocontrolReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoTamanioControl(false);
		}
		
		if(this.tipotamaniocontrolReturnGeneral.getConRetornoLista() || this.tipotamaniocontrolReturnGeneral.getConRetornoObjeto()) {
			if(this.tipotamaniocontrolReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipotamaniocontrolLogic.setTipoTamanioControls(this.tipotamaniocontrolReturnGeneral.getTipoTamanioControls());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipotamaniocontrolReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipotamaniocontrolLogic.setTipoTamanioControl(this.tipotamaniocontrolReturnGeneral.getTipoTamanioControl());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoTamanioControl(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoTamanioControl() throws Exception {
		
		
	}
	
	public ArrayList<TipoTamanioControl> getTipoTamanioControlsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoTamanioControl> tipotamaniocontrolsSeleccionados=new ArrayList<TipoTamanioControl>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoTamanioControl) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoTamanioControl tipotamaniocontrolAux:tipotamaniocontrolLogic.getTipoTamanioControls()) {
					if(tipotamaniocontrolAux.getIsSelected()) {
						tipotamaniocontrolsSeleccionados.add(tipotamaniocontrolAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTamanioControl tipotamaniocontrolAux:this.tipotamaniocontrols) {
					if(tipotamaniocontrolAux.getIsSelected()) {
						tipotamaniocontrolsSeleccionados.add(tipotamaniocontrolAux);				
					}
				}
			}
			
			if(tipotamaniocontrolsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipotamaniocontrolsSeleccionados.addAll(this.tipotamaniocontrolLogic.getTipoTamanioControls());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipotamaniocontrolsSeleccionados.addAll(this.tipotamaniocontrols);				
					}
				}
			}
		} else {
			tipotamaniocontrolsSeleccionados.add(this.tipotamaniocontrol);
		}
		
		return tipotamaniocontrolsSeleccionados;
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
	
	public void generarReporteTipoTamanioControlsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoTamanioControlsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoTamanioControlsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoTamanioControlsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoTamanioControlsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Tamanio Control",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoTamanioControlsSeleccionados() throws Exception {
		ArrayList<TipoTamanioControl> tipotamaniocontrolsSeleccionados=new ArrayList<TipoTamanioControl>();		
		
		tipotamaniocontrolsSeleccionados=this.getTipoTamanioControlsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoTamanioControls("Todos",tipotamaniocontrolsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoTamanioControlsSeleccionados() throws Exception {
		ArrayList<TipoTamanioControl> tipotamaniocontrolsSeleccionados=new ArrayList<TipoTamanioControl>();		
		
		tipotamaniocontrolsSeleccionados=this.getTipoTamanioControlsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoTamanioControls("Todos",tipotamaniocontrolsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoTamanioControlsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoTamanioControl> tipotamaniocontrolsSeleccionados=new ArrayList<TipoTamanioControl>();
		
		tipotamaniocontrolsSeleccionados=this.getTipoTamanioControlsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoTamanioControls("Todos",tipotamaniocontrolsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoTamanioControlsSeleccionados() throws Exception {
		ArrayList<TipoTamanioControl> tipotamaniocontrolsSeleccionados=new ArrayList<TipoTamanioControl>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoTamanioControl();
		
		
		tipotamaniocontrolsSeleccionados=this.getTipoTamanioControlsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoTamanioControl();
		
		
		//this.generarReporteTipoTamanioControls("Todos",tipotamaniocontrolsSeleccionados ,tipotamaniocontrolImplementable,tipotamaniocontrolImplementableHome);
	}
	
	public void mostrarImportacionTipoTamanioControls() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoTamanioControl();
		
		this.abrirFrameImportacionTipoTamanioControl();		
		
			
		//this.generarReporteTipoTamanioControls("Todos",tipotamaniocontrolsSeleccionados ,tipotamaniocontrolImplementable,tipotamaniocontrolImplementableHome);
	}
	
	public void importarTipoTamanioControls() throws Exception {		
	
	}
	
	public void exportarTipoTamanioControlsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoTamanioControlsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoTamanioControlsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoTamanioControlsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Tamanio Control",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoTamanioControlsSeleccionados() throws Exception {
		ArrayList<TipoTamanioControl> tipotamaniocontrolsSeleccionados=new ArrayList<TipoTamanioControl>();		
		
		tipotamaniocontrolsSeleccionados=this.getTipoTamanioControlsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotamaniocontrol."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoTamanioControl(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoTamanioControl tipotamaniocontrolAux:tipotamaniocontrolsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoTamanioControl(tipotamaniocontrolAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipotamaniocontrolAux.setsDetalleGeneralEntityReporte(tipotamaniocontrolAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Tamanio Control",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoTamanioControl(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoTamanioControlConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTamanioControlConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTamanioControlConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTamanioControlConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTamanioControlConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoTamanioControl(TipoTamanioControl tipotamaniocontrol,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipotamaniocontrol.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipotamaniocontrol.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipotamaniocontrol.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipotamaniocontrol.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipotamaniocontrol.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoTamanioControlsSeleccionados() throws Exception {
		ArrayList<TipoTamanioControl> tipotamaniocontrolsSeleccionados=new ArrayList<TipoTamanioControl>();		
		
		tipotamaniocontrolsSeleccionados=this.getTipoTamanioControlsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotamaniocontrol.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoTamanioControls");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoTamanioControl(row);				
				iRow++;
			}				
			
			for(TipoTamanioControl tipotamaniocontrolAux:tipotamaniocontrolsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoTamanioControl(tipotamaniocontrolAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Tamanio Control",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoTamanioControlsSeleccionados() throws Exception {
		ArrayList<TipoTamanioControl> tipotamaniocontrolsSeleccionados=new ArrayList<TipoTamanioControl>();		
		
		tipotamaniocontrolsSeleccionados=this.getTipoTamanioControlsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotamaniocontrol.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipotamaniocontrols");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipotamaniocontrol");
			//elementRoot.appendChild(element);
		
			for(TipoTamanioControl tipotamaniocontrolAux:tipotamaniocontrolsSeleccionados) {
				element = document.createElement("tipotamaniocontrol");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoTamanioControl(tipotamaniocontrolAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Tamanio Control",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoTamanioControl(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTamanioControlConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTamanioControlConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoTamanioControlConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTamanioControlConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTamanioControlConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoTamanioControl(TipoTamanioControl tipotamaniocontrol,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipotamaniocontrol.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipotamaniocontrol.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipotamaniocontrol.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipotamaniocontrol.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlTipoTamanioControl(TipoTamanioControl tipotamaniocontrol,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoTamanioControlConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipotamaniocontrol.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoTamanioControlConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipotamaniocontrol.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoTamanioControlConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipotamaniocontrol.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoTamanioControlConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipotamaniocontrol.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(TipoTamanioControlConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(tipotamaniocontrol.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoTipoTamanioControlsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoTamanioControl> tipotamaniocontrolsSeleccionados=new ArrayList<TipoTamanioControl>();
		
		tipotamaniocontrolsSeleccionados=this.getTipoTamanioControlsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoTamanioControl(tipotamaniocontrolsSeleccionados);
		
		this.generarReporteTipoTamanioControls("Todos",tipotamaniocontrolsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoTamanioControl(ArrayList<TipoTamanioControl> tipotamaniocontrolsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoTamanioControl tipotamaniocontrolAux:tipotamaniocontrolsSeleccionados) {
				tipotamaniocontrolAux.setsDetalleGeneralEntityReporte(tipotamaniocontrolAux.toString());
			
				if(sTipoSeleccionar.equals(TipoTamanioControlConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipotamaniocontrolAux.setsDescripcionGeneralEntityReporte1(tipotamaniocontrolAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoTamanioControlConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipotamaniocontrolAux.setsDescripcionGeneralEntityReporte1(tipotamaniocontrolAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoTamanioControlConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					tipotamaniocontrolAux.setsDescripcionGeneralEntityReporte1(tipotamaniocontrolAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTamanioControlConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoTamanioControl(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoTamanioControl=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoTamanioControl=true;
				this.isVisibilidadCeldaGuardarCambiosTipoTamanioControl=true;
			}
			
			this.isVisibilidadCeldaModificarTipoTamanioControl=false;
			this.isVisibilidadCeldaActualizarTipoTamanioControl=false;
			this.isVisibilidadCeldaEliminarTipoTamanioControl=false;
			this.isVisibilidadCeldaCancelarTipoTamanioControl=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTamanioControl=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTamanioControl=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoTamanioControl=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTamanioControl=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTamanioControl=false;
			this.isVisibilidadCeldaModificarTipoTamanioControl=false;
			this.isVisibilidadCeldaActualizarTipoTamanioControl=true;
			this.isVisibilidadCeldaEliminarTipoTamanioControl=false;
			this.isVisibilidadCeldaCancelarTipoTamanioControl=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTamanioControl=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTamanioControl=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoTamanioControl=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTamanioControl=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTamanioControl=false;
			this.isVisibilidadCeldaModificarTipoTamanioControl=false;
			this.isVisibilidadCeldaActualizarTipoTamanioControl=true;
			this.isVisibilidadCeldaEliminarTipoTamanioControl=true;
			this.isVisibilidadCeldaCancelarTipoTamanioControl=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTamanioControl=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTamanioControl=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoTamanioControl=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTamanioControl=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTamanioControl=false;
			this.isVisibilidadCeldaModificarTipoTamanioControl=false;
			this.isVisibilidadCeldaActualizarTipoTamanioControl=true;
			this.isVisibilidadCeldaEliminarTipoTamanioControl=false;
			this.isVisibilidadCeldaCancelarTipoTamanioControl=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTamanioControl=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoTamanioControl=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoTamanioControl=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoTamanioControl=true;
			this.isVisibilidadCeldaGuardarCambiosTipoTamanioControl=true;
			this.isVisibilidadCeldaModificarTipoTamanioControl=false;
			this.isVisibilidadCeldaActualizarTipoTamanioControl=false;
			this.isVisibilidadCeldaEliminarTipoTamanioControl=false;
			this.isVisibilidadCeldaCancelarTipoTamanioControl=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTamanioControl=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTamanioControl=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoTamanioControl=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTamanioControl=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTamanioControl=false;
			this.isVisibilidadCeldaActualizarTipoTamanioControl=false;
			this.isVisibilidadCeldaEliminarTipoTamanioControl=false;
			this.isVisibilidadCeldaCancelarTipoTamanioControl=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTamanioControl=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoTamanioControl=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoTamanioControl=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTamanioControl=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTamanioControl=false;
			this.isVisibilidadCeldaModificarTipoTamanioControl=true;
			this.isVisibilidadCeldaActualizarTipoTamanioControl=false;
			this.isVisibilidadCeldaEliminarTipoTamanioControl=false;
			this.isVisibilidadCeldaCancelarTipoTamanioControl=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTamanioControl=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoTamanioControl=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoTamanioControlJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoTamanioControl=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoTamanioControl=true;
			this.isVisibilidadCeldaGuardarCambiosTipoTamanioControl=true;
		} else {
			this.actualizarEstadoPanelsTipoTamanioControl(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoTamanioControl=false;
			//this.isVisibilidadCeldaVerFormTipoTamanioControl=false;
			this.isVisibilidadCeldaDuplicarTipoTamanioControl=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipotamaniocontrolSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoTamanioControl=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoTamanioControl=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTamanioControl=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
			if(!tipotamaniocontrolSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoTamanioControl=false;												
			}
			
			this.jButtonCerrarTipoTamanioControl.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoTamanioControl=false;
		}
		
		if(!this.permiteMantenimiento(this.tipotamaniocontrol)) {
			this.isVisibilidadCeldaActualizarTipoTamanioControl=false;
			this.isVisibilidadCeldaEliminarTipoTamanioControl=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoTamanioControl() {
	}
	
	public void actualizarEstadoPanelsTipoTamanioControl(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoTamanioControl!=null) {
				this.jScrollPanelDatosEdicionTipoTamanioControl.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoTamanioControl!=null) {
				this.jScrollPanelDatosTipoTamanioControl.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTamanioControl!=null) {
				this.jPanelPaginacionTipoTamanioControl.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTamanioControl!=null) {
				this.jPanelParametrosReportesTipoTamanioControl.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoTamanioControl!=null) {
				this.jScrollPanelDatosEdicionTipoTamanioControl.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoTamanioControl!=null) {
				this.jScrollPanelDatosTipoTamanioControl.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoTamanioControl!=null) {
				this.jPanelPaginacionTipoTamanioControl.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoTamanioControl!=null) {
				this.jPanelParametrosReportesTipoTamanioControl.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoTamanioControl!=null) {
				this.jScrollPanelDatosEdicionTipoTamanioControl.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoTamanioControl!=null) {
				this.jScrollPanelDatosTipoTamanioControl.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoTamanioControl!=null) {
				this.jPanelPaginacionTipoTamanioControl.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoTamanioControl!=null) {
				this.jPanelParametrosReportesTipoTamanioControl.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoTamanioControl!=null) {
				this.jScrollPanelDatosEdicionTipoTamanioControl.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoTamanioControl!=null) {
				this.jScrollPanelDatosTipoTamanioControl.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoTamanioControl!=null) {
				this.jPanelPaginacionTipoTamanioControl.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoTamanioControl!=null) {
				this.jPanelParametrosReportesTipoTamanioControl.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoTamanioControl!=null) {
				this.jScrollPanelDatosEdicionTipoTamanioControl.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoTamanioControl!=null) {
				this.jScrollPanelDatosTipoTamanioControl.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTamanioControl!=null) {
				this.jPanelPaginacionTipoTamanioControl.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTamanioControl!=null) {
				this.jPanelParametrosReportesTipoTamanioControl.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoTamanioControl!=null) {
				this.jScrollPanelDatosEdicionTipoTamanioControl.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoTamanioControl!=null) {
				this.jScrollPanelDatosTipoTamanioControl.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTamanioControl!=null) {
				this.jPanelPaginacionTipoTamanioControl.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTamanioControl!=null) {
				this.jPanelParametrosReportesTipoTamanioControl.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoTamanioControl!=null) {
				this.jScrollPanelDatosEdicionTipoTamanioControl.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoTamanioControl!=null) {
				this.jScrollPanelDatosTipoTamanioControl.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTamanioControl!=null) {
				this.jPanelPaginacionTipoTamanioControl.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTamanioControl!=null) {
				this.jPanelParametrosReportesTipoTamanioControl.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoTamanioControlSessionBean tipotamaniocontrolSessionBean=new TipoTamanioControlSessionBean();
		
		if(this.tipotamaniocontrolSessionBean==null) {
			this.tipotamaniocontrolSessionBean=new TipoTamanioControlSessionBean();
		}
		
		this.tipotamaniocontrolSessionBean.setsUltimaBusquedaTipoTamanioControl(this.getsAccionBusqueda());
		this.tipotamaniocontrolSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipotamaniocontrolSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoTamanioControlSessionBean tipotamaniocontrolSessionBean=new TipoTamanioControlSessionBean();
		
		if(this.tipotamaniocontrolSessionBean==null) {
			this.tipotamaniocontrolSessionBean=new TipoTamanioControlSessionBean();
		}
		
		if(this.tipotamaniocontrolSessionBean.getsUltimaBusquedaTipoTamanioControl()!=null&&!this.tipotamaniocontrolSessionBean.getsUltimaBusquedaTipoTamanioControl().equals("")) {
			this.setsAccionBusqueda(tipotamaniocontrolSessionBean.getsUltimaBusquedaTipoTamanioControl());
			this.setiNumeroPaginacion(tipotamaniocontrolSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipotamaniocontrolSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipotamaniocontrolSessionBean.setsUltimaBusquedaTipoTamanioControl("");
		this.tipotamaniocontrolSessionBean.setiNumeroPaginacion(TipoTamanioControlConstantesFunciones.INUMEROPAGINACION);
		this.tipotamaniocontrolSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoTamanioControl(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoTamanioControl() {
		this.updateBorderResaltarBusquedasFormularioTipoTamanioControl();
		this.updateVisibilidadBusquedasFormularioTipoTamanioControl();
		this.updateHabilitarBusquedasFormularioTipoTamanioControl();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoTamanioControl() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoTamanioControl() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoTamanioControl() {
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
	
	public void updateControlesFormularioTipoTamanioControl() throws Exception {

		if(this.jInternalFrameDetalleFormTipoTamanioControl==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoTamanioControl();
		this.updateVisibilidadResaltarControlesFormularioTipoTamanioControl();
		this.updateHabilitarResaltarControlesFormularioTipoTamanioControl();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoTamanioControl() throws Exception {
		if(this.jInternalFrameDetalleFormTipoTamanioControl==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipotamaniocontrolConstantesFunciones.resaltaridTipoTamanioControl!=null && this.jInternalFrameDetalleFormTipoTamanioControl!=null) {this.jInternalFrameDetalleFormTipoTamanioControl.jTextFieldidTipoTamanioControl.setBorder(this.tipotamaniocontrolConstantesFunciones.resaltaridTipoTamanioControl);}
		if(this.tipotamaniocontrolConstantesFunciones.resaltarcodigoTipoTamanioControl!=null && this.jInternalFrameDetalleFormTipoTamanioControl!=null) {this.jInternalFrameDetalleFormTipoTamanioControl.jTextFieldcodigoTipoTamanioControl.setBorder(this.tipotamaniocontrolConstantesFunciones.resaltarcodigoTipoTamanioControl);}
		if(this.tipotamaniocontrolConstantesFunciones.resaltarnombreTipoTamanioControl!=null && this.jInternalFrameDetalleFormTipoTamanioControl!=null) {this.jInternalFrameDetalleFormTipoTamanioControl.jTextAreanombreTipoTamanioControl.setBorder(this.tipotamaniocontrolConstantesFunciones.resaltarnombreTipoTamanioControl);}
		if(this.tipotamaniocontrolConstantesFunciones.resaltardescripcionTipoTamanioControl!=null && this.jInternalFrameDetalleFormTipoTamanioControl!=null) {this.jInternalFrameDetalleFormTipoTamanioControl.jTextAreadescripcionTipoTamanioControl.setBorder(this.tipotamaniocontrolConstantesFunciones.resaltardescripcionTipoTamanioControl);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoTamanioControl() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoTamanioControl==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) {
	
		//this.jInternalFrameDetalleFormTipoTamanioControl.jTextFieldidTipoTamanioControl.setVisible(this.tipotamaniocontrolConstantesFunciones.mostraridTipoTamanioControl);
		this.jInternalFrameDetalleFormTipoTamanioControl.jPanelidTipoTamanioControl.setVisible(this.tipotamaniocontrolConstantesFunciones.mostraridTipoTamanioControl);
		//this.jInternalFrameDetalleFormTipoTamanioControl.jTextFieldcodigoTipoTamanioControl.setVisible(this.tipotamaniocontrolConstantesFunciones.mostrarcodigoTipoTamanioControl);
		this.jInternalFrameDetalleFormTipoTamanioControl.jPanelcodigoTipoTamanioControl.setVisible(this.tipotamaniocontrolConstantesFunciones.mostrarcodigoTipoTamanioControl);
		//this.jInternalFrameDetalleFormTipoTamanioControl.jTextAreanombreTipoTamanioControl.setVisible(this.tipotamaniocontrolConstantesFunciones.mostrarnombreTipoTamanioControl);
		this.jInternalFrameDetalleFormTipoTamanioControl.jPanelnombreTipoTamanioControl.setVisible(this.tipotamaniocontrolConstantesFunciones.mostrarnombreTipoTamanioControl);
		//this.jInternalFrameDetalleFormTipoTamanioControl.jTextAreadescripcionTipoTamanioControl.setVisible(this.tipotamaniocontrolConstantesFunciones.mostrardescripcionTipoTamanioControl);
		this.jInternalFrameDetalleFormTipoTamanioControl.jPaneldescripcionTipoTamanioControl.setVisible(this.tipotamaniocontrolConstantesFunciones.mostrardescripcionTipoTamanioControl);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoTamanioControl() throws Exception {
		if(this.jInternalFrameDetalleFormTipoTamanioControl==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoTamanioControl!=null) {
	
		this.jInternalFrameDetalleFormTipoTamanioControl.jTextFieldidTipoTamanioControl.setEnabled(this.tipotamaniocontrolConstantesFunciones.activaridTipoTamanioControl);
		this.jInternalFrameDetalleFormTipoTamanioControl.jTextFieldcodigoTipoTamanioControl.setEnabled(this.tipotamaniocontrolConstantesFunciones.activarcodigoTipoTamanioControl);
		this.jInternalFrameDetalleFormTipoTamanioControl.jTextAreanombreTipoTamanioControl.setEnabled(this.tipotamaniocontrolConstantesFunciones.activarnombreTipoTamanioControl);
		this.jInternalFrameDetalleFormTipoTamanioControl.jTextAreadescripcionTipoTamanioControl.setEnabled(this.tipotamaniocontrolConstantesFunciones.activardescripcionTipoTamanioControl);
		}
	}
	
		
}