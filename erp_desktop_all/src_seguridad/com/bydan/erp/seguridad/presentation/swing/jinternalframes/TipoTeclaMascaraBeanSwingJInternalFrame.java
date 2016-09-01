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

import com.bydan.erp.seguridad.util.TipoTeclaMascaraConstantesFunciones;
import com.bydan.erp.seguridad.util.TipoTeclaMascaraParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.TipoTeclaMascaraParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.TipoTeclaMascaraBean;
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
public class TipoTeclaMascaraBeanSwingJInternalFrame extends TipoTeclaMascaraJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoTeclaMascaraBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoTeclaMascara> tipoteclamascaraValidator = new ClassValidator<TipoTeclaMascara>(TipoTeclaMascara.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoTeclaMascara tipoteclamascara;	
	public TipoTeclaMascara tipoteclamascaraAux;
	public TipoTeclaMascara tipoteclamascaraAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoTeclaMascara tipoteclamascaraTotales;
	public Long idTipoTeclaMascaraActual;
	public Long iIdNuevoTipoTeclaMascara=0L;
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
	
	public Boolean isPermisoTodoTipoTeclaMascara;
	public Boolean isPermisoNuevoTipoTeclaMascara;
	public Boolean isPermisoActualizarTipoTeclaMascara;
	public Boolean isPermisoActualizarOriginalTipoTeclaMascara;
	public Boolean isPermisoEliminarTipoTeclaMascara;
	public Boolean isPermisoGuardarCambiosTipoTeclaMascara;
	public Boolean isPermisoConsultaTipoTeclaMascara;
	public Boolean isPermisoBusquedaTipoTeclaMascara;
	public Boolean isPermisoReporteTipoTeclaMascara;
	public Boolean isPermisoPaginacionMedioTipoTeclaMascara;
	public Boolean isPermisoPaginacionAltoTipoTeclaMascara;
	public Boolean isPermisoPaginacionTodoTipoTeclaMascara;
	public Boolean isPermisoCopiarTipoTeclaMascara;
	public Boolean isPermisoVerFormTipoTeclaMascara;
	public Boolean isPermisoDuplicarTipoTeclaMascara;
	public Boolean isPermisoOrdenTipoTeclaMascara;
	
	
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
	
	public TipoTeclaMascaraParameterReturnGeneral tipoteclamascaraReturnGeneral;
	public TipoTeclaMascaraParameterReturnGeneral tipoteclamascaraParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoTeclaMascara=false;
	public Boolean esParaAccionDesdeFormularioTipoTeclaMascara=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoTeclaMascaraLogic tipoteclamascaraLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoTeclaMascara tipoteclamascaraBean;
	public TipoTeclaMascaraConstantesFunciones tipoteclamascaraConstantesFunciones;
	//public TipoTeclaMascaraParameterReturnGeneral tipoteclamascaraReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoTeclaMascara> tipoteclamascaras;	
	//public List<TipoTeclaMascara> tipoteclamascarasEliminados;
	//public List<TipoTeclaMascara> tipoteclamascarasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoTeclaMascara=false;
	public Boolean isVisibilidadCeldaDuplicarTipoTeclaMascara=true;
	public Boolean isVisibilidadCeldaCopiarTipoTeclaMascara=true;
	public Boolean isVisibilidadCeldaVerFormTipoTeclaMascara=true;
	public Boolean isVisibilidadCeldaOrdenTipoTeclaMascara=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoTeclaMascara=false;
	public Boolean isVisibilidadCeldaModificarTipoTeclaMascara=false;
	public Boolean isVisibilidadCeldaActualizarTipoTeclaMascara=false;
	public Boolean isVisibilidadCeldaEliminarTipoTeclaMascara=false;
	public Boolean isVisibilidadCeldaCancelarTipoTeclaMascara=false;
	public Boolean isVisibilidadCeldaGuardarTipoTeclaMascara=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoTeclaMascara=false;	
	
	
	
	public Long getiIdNuevoTipoTeclaMascara() {
		return this.iIdNuevoTipoTeclaMascara;
	}

	public void setiIdNuevoTipoTeclaMascara(Long iIdNuevoTipoTeclaMascara) {
		this.iIdNuevoTipoTeclaMascara = iIdNuevoTipoTeclaMascara;
	}
	
	public Long getidTipoTeclaMascaraActual() {
		return this.idTipoTeclaMascaraActual;
	}

	public void setidTipoTeclaMascaraActual(Long idTipoTeclaMascaraActual) {
		this.idTipoTeclaMascaraActual = idTipoTeclaMascaraActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoTeclaMascara gettipoteclamascara() {
		return this.tipoteclamascara;
	}

	public void settipoteclamascara(TipoTeclaMascara tipoteclamascara) {
		this.tipoteclamascara = tipoteclamascara;
	}
	
	public TipoTeclaMascara gettipoteclamascaraAux() {
		return this.tipoteclamascaraAux;
	}

	public void settipoteclamascaraAux(TipoTeclaMascara tipoteclamascaraAux) {
		this.tipoteclamascaraAux = tipoteclamascaraAux;
	}				
	
	public TipoTeclaMascara gettipoteclamascaraAnterior() {
		return this.tipoteclamascaraAnterior;
	}

	public void settipoteclamascaraAnterior(TipoTeclaMascara tipoteclamascaraAnterior) {
		this.tipoteclamascaraAnterior = tipoteclamascaraAnterior;
	}	
	
	public TipoTeclaMascara gettipoteclamascaraTotales() {
		return this.tipoteclamascaraTotales;
	}

	public void settipoteclamascaraTotales(TipoTeclaMascara tipoteclamascaraTotales) {
		this.tipoteclamascaraTotales = tipoteclamascaraTotales;
	}	
	
	public TipoTeclaMascara gettipoteclamascaraBean() {
		return this.tipoteclamascaraBean;
	}

	public void settipoteclamascaraBean(TipoTeclaMascara tipoteclamascaraBean) {
		this.tipoteclamascaraBean = tipoteclamascaraBean;
	}	
	
	public TipoTeclaMascaraParameterReturnGeneral gettipoteclamascaraReturnGeneral() {
		return this.tipoteclamascaraReturnGeneral;
	}

	public void settipoteclamascaraReturnGeneral(TipoTeclaMascaraParameterReturnGeneral tipoteclamascaraReturnGeneral) {
		this.tipoteclamascaraReturnGeneral = tipoteclamascaraReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoTeclaMascaraLogic getTipoTeclaMascaraLogic()	{		
		return tipoteclamascaraLogic;
	}

	public void setTipoTeclaMascaraLogic(TipoTeclaMascaraLogic tipoteclamascaraLogic) {
		this.tipoteclamascaraLogic = tipoteclamascaraLogic;
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
	
	public Boolean getIsEsNuevoTipoTeclaMascara() {
		return isEsNuevoTipoTeclaMascara;
	}

	public void setIsEsNuevoTipoTeclaMascara(Boolean isEsNuevoTipoTeclaMascara) {
		this.isEsNuevoTipoTeclaMascara = isEsNuevoTipoTeclaMascara;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoTeclaMascara() {
		return esParaAccionDesdeFormularioTipoTeclaMascara;
	}
	
	public void setEsParaAccionDesdeFormularioTipoTeclaMascara(Boolean esParaAccionDesdeFormularioTipoTeclaMascara) {
		this.esParaAccionDesdeFormularioTipoTeclaMascara = esParaAccionDesdeFormularioTipoTeclaMascara;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoTeclaMascara() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoTeclaMascaraConstantesFunciones.refrescarForeignKeysDescripcionesTipoTeclaMascara(this.tipoteclamascaraLogic.getTipoTeclaMascaras());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoTeclaMascaraConstantesFunciones.refrescarForeignKeysDescripcionesTipoTeclaMascara(this.tipoteclamascaras);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoteclamascaraLogic.setTipoTeclaMascaras(this.tipoteclamascaras);
			tipoteclamascaraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoTeclaMascaraParameterReturnGeneral getTipoTeclaMascaraParameterGeneral() {
		return this.tipoteclamascaraParameterGeneral;
	}
	
	public void setTipoTeclaMascaraParameterGeneral(TipoTeclaMascaraParameterReturnGeneral tipoteclamascaraParameterGeneral) {
		this.tipoteclamascaraParameterGeneral = tipoteclamascaraParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoTeclaMascara() {
		return isPermisoTodoTipoTeclaMascara;
	}

	public void setIsPermisoTodoTipoTeclaMascara(Boolean isPermisoTodoTipoTeclaMascara) {
		this.isPermisoTodoTipoTeclaMascara = isPermisoTodoTipoTeclaMascara;
	}

	public Boolean getIsPermisoNuevoTipoTeclaMascara() {
		return isPermisoNuevoTipoTeclaMascara;
	}

	public void setIsPermisoNuevoTipoTeclaMascara(Boolean isPermisoNuevoTipoTeclaMascara) {
		this.isPermisoNuevoTipoTeclaMascara = isPermisoNuevoTipoTeclaMascara;
	}

	public Boolean getIsPermisoActualizarTipoTeclaMascara() {
		return isPermisoActualizarTipoTeclaMascara;
	}

	public void setIsPermisoActualizarTipoTeclaMascara(Boolean isPermisoActualizarTipoTeclaMascara) {
		this.isPermisoActualizarTipoTeclaMascara = isPermisoActualizarTipoTeclaMascara;
	}

	public Boolean getIsPermisoEliminarTipoTeclaMascara() {
		return isPermisoEliminarTipoTeclaMascara;
	}

	public void setIsPermisoEliminarTipoTeclaMascara(Boolean isPermisoEliminarTipoTeclaMascara) {
		this.isPermisoEliminarTipoTeclaMascara = isPermisoEliminarTipoTeclaMascara;
	}

	public Boolean getIsPermisoGuardarCambiosTipoTeclaMascara() {
		return isPermisoGuardarCambiosTipoTeclaMascara;
	}

	public void setIsPermisoGuardarCambiosTipoTeclaMascara(Boolean isPermisoGuardarCambiosTipoTeclaMascara) {
		this.isPermisoGuardarCambiosTipoTeclaMascara = isPermisoGuardarCambiosTipoTeclaMascara;
	}
	
	public Boolean getIsPermisoConsultaTipoTeclaMascara() {
		return isPermisoConsultaTipoTeclaMascara;
	}

	public void setIsPermisoConsultaTipoTeclaMascara(Boolean isPermisoConsultaTipoTeclaMascara) {
		this.isPermisoConsultaTipoTeclaMascara = isPermisoConsultaTipoTeclaMascara;
	}

	public Boolean getIsPermisoBusquedaTipoTeclaMascara() {
		return isPermisoBusquedaTipoTeclaMascara;
	}

	public void setIsPermisoBusquedaTipoTeclaMascara(Boolean isPermisoBusquedaTipoTeclaMascara) {
		this.isPermisoBusquedaTipoTeclaMascara = isPermisoBusquedaTipoTeclaMascara;
	}

	public Boolean getIsPermisoReporteTipoTeclaMascara() {
		return isPermisoReporteTipoTeclaMascara;
	}

	public void setIsPermisoReporteTipoTeclaMascara(Boolean isPermisoReporteTipoTeclaMascara) {
		this.isPermisoReporteTipoTeclaMascara = isPermisoReporteTipoTeclaMascara;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoTeclaMascara() {
		return isPermisoPaginacionMedioTipoTeclaMascara;
	}

	public void setIsPermisoPaginacionMedioTipoTeclaMascara(Boolean isPermisoPaginacionMedioTipoTeclaMascara) {
		this.isPermisoPaginacionMedioTipoTeclaMascara = isPermisoPaginacionMedioTipoTeclaMascara;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoTeclaMascara() {
		return isPermisoPaginacionTodoTipoTeclaMascara;
	}

	public void setIsPermisoPaginacionTodoTipoTeclaMascara(Boolean isPermisoPaginacionTodoTipoTeclaMascara) {
		this.isPermisoPaginacionTodoTipoTeclaMascara = isPermisoPaginacionTodoTipoTeclaMascara;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoTeclaMascara() {
		return isPermisoPaginacionAltoTipoTeclaMascara;
	}

	public void setIsPermisoPaginacionAltoTipoTeclaMascara(Boolean isPermisoPaginacionAltoTipoTeclaMascara) {
		this.isPermisoPaginacionAltoTipoTeclaMascara = isPermisoPaginacionAltoTipoTeclaMascara;
	}
	
	public Boolean getIsPermisoCopiarTipoTeclaMascara() {
		return isPermisoCopiarTipoTeclaMascara;
	}

	public void setIsPermisoCopiarTipoTeclaMascara(Boolean isPermisoCopiarTipoTeclaMascara) {
		this.isPermisoCopiarTipoTeclaMascara = isPermisoCopiarTipoTeclaMascara;
	}
	
	public Boolean getIsPermisoVerFormTipoTeclaMascara() {
		return isPermisoVerFormTipoTeclaMascara;
	}

	public void setIsPermisoVerFormTipoTeclaMascara(Boolean isPermisoVerFormTipoTeclaMascara) {
		this.isPermisoVerFormTipoTeclaMascara = isPermisoVerFormTipoTeclaMascara;
	}
	
	public Boolean getIsPermisoDuplicarTipoTeclaMascara() {
		return isPermisoDuplicarTipoTeclaMascara;
	}

	public void setIsPermisoDuplicarTipoTeclaMascara(Boolean isPermisoDuplicarTipoTeclaMascara) {
		this.isPermisoDuplicarTipoTeclaMascara = isPermisoDuplicarTipoTeclaMascara;
	}
	
	public Boolean getIsPermisoOrdenTipoTeclaMascara() {
		return isPermisoOrdenTipoTeclaMascara;
	}

	public void setIsPermisoOrdenTipoTeclaMascara(Boolean isPermisoOrdenTipoTeclaMascara) {
		this.isPermisoOrdenTipoTeclaMascara = isPermisoOrdenTipoTeclaMascara;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoTeclaMascara() {
		return isVisibilidadCeldaNuevoTipoTeclaMascara;
	}

	public void setIsVisibilidadCeldaNuevoTipoTeclaMascara(Boolean isVisibilidadCeldaNuevoTipoTeclaMascara) {
		this.isVisibilidadCeldaNuevoTipoTeclaMascara = isVisibilidadCeldaNuevoTipoTeclaMascara;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoTeclaMascara() {
		return isVisibilidadCeldaDuplicarTipoTeclaMascara;
	}

	public void setIsVisibilidadCeldaDuplicarTipoTeclaMascara(Boolean isVisibilidadCeldaDuplicarTipoTeclaMascara) {
		this.isVisibilidadCeldaDuplicarTipoTeclaMascara = isVisibilidadCeldaDuplicarTipoTeclaMascara;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoTeclaMascara() {
		return isVisibilidadCeldaCopiarTipoTeclaMascara;
	}

	public void setIsVisibilidadCeldaCopiarTipoTeclaMascara(Boolean isVisibilidadCeldaCopiarTipoTeclaMascara) {
		this.isVisibilidadCeldaCopiarTipoTeclaMascara = isVisibilidadCeldaCopiarTipoTeclaMascara;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoTeclaMascara() {
		return isVisibilidadCeldaVerFormTipoTeclaMascara;
	}

	public void setIsVisibilidadCeldaVerFormTipoTeclaMascara(Boolean isVisibilidadCeldaVerFormTipoTeclaMascara) {
		this.isVisibilidadCeldaVerFormTipoTeclaMascara = isVisibilidadCeldaVerFormTipoTeclaMascara;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoTeclaMascara() {
		return isVisibilidadCeldaOrdenTipoTeclaMascara;
	}

	public void setIsVisibilidadCeldaOrdenTipoTeclaMascara(Boolean isVisibilidadCeldaOrdenTipoTeclaMascara) {
		this.isVisibilidadCeldaOrdenTipoTeclaMascara = isVisibilidadCeldaOrdenTipoTeclaMascara;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoTeclaMascara() {
		return isVisibilidadCeldaNuevoRelacionesTipoTeclaMascara;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoTeclaMascara(Boolean isVisibilidadCeldaNuevoRelacionesTipoTeclaMascara) {
		this.isVisibilidadCeldaNuevoRelacionesTipoTeclaMascara = isVisibilidadCeldaNuevoRelacionesTipoTeclaMascara;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoTeclaMascara() {
		return isVisibilidadCeldaModificarTipoTeclaMascara;
	}

	public void setIsVisibilidadCeldaModificarTipoTeclaMascara(Boolean isVisibilidadCeldaModificarTipoTeclaMascara) {
		this.isVisibilidadCeldaModificarTipoTeclaMascara = isVisibilidadCeldaModificarTipoTeclaMascara;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoTeclaMascara() {
		return isVisibilidadCeldaActualizarTipoTeclaMascara;
	}

	public void setIsVisibilidadCeldaActualizarTipoTeclaMascara(Boolean isVisibilidadCeldaActualizarTipoTeclaMascara) {
		this.isVisibilidadCeldaActualizarTipoTeclaMascara = isVisibilidadCeldaActualizarTipoTeclaMascara;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoTeclaMascara() {
		return isVisibilidadCeldaEliminarTipoTeclaMascara;
	}

	public void setIsVisibilidadCeldaEliminarTipoTeclaMascara(Boolean isVisibilidadCeldaEliminarTipoTeclaMascara) {
		this.isVisibilidadCeldaEliminarTipoTeclaMascara = isVisibilidadCeldaEliminarTipoTeclaMascara;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoTeclaMascara() {
		return isVisibilidadCeldaCancelarTipoTeclaMascara;
	}

	public void setIsVisibilidadCeldaCancelarTipoTeclaMascara(Boolean isVisibilidadCeldaCancelarTipoTeclaMascara) {
		this.isVisibilidadCeldaCancelarTipoTeclaMascara = isVisibilidadCeldaCancelarTipoTeclaMascara;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoTeclaMascara() {
		return isVisibilidadCeldaGuardarTipoTeclaMascara;
	}

	public void setIsVisibilidadCeldaGuardarTipoTeclaMascara(Boolean isVisibilidadCeldaGuardarTipoTeclaMascara) {
		this.isVisibilidadCeldaGuardarTipoTeclaMascara = isVisibilidadCeldaGuardarTipoTeclaMascara;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoTeclaMascara() {
		return isVisibilidadCeldaGuardarCambiosTipoTeclaMascara;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoTeclaMascara(Boolean isVisibilidadCeldaGuardarCambiosTipoTeclaMascara) {
		this.isVisibilidadCeldaGuardarCambiosTipoTeclaMascara = isVisibilidadCeldaGuardarCambiosTipoTeclaMascara;
	}
		
	public TipoTeclaMascaraSessionBean gettipoteclamascaraSessionBean() {
		return this.tipoteclamascaraSessionBean;
	}
	
	public void settipoteclamascaraSessionBean(TipoTeclaMascaraSessionBean tipoteclamascaraSessionBean) {
		this.tipoteclamascaraSessionBean=tipoteclamascaraSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoTeclaMascara(TipoTeclaMascara tipoteclamascara)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoTeclaMascara tipoteclamascara,TipoTeclaMascara tipoteclamascaraAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoTeclaMascara(tipoteclamascara);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoteclamascaraAux.setId(tipoteclamascara.getId());
		tipoteclamascaraAux.setVersionRow(tipoteclamascara.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoTeclaMascara();
		
			int intSelectedRow = this.jTableDatosTipoTeclaMascara.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaras.toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoTeclaMascaraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoTeclaMascara(this.tipoteclamascara,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTeclaMascara(this.tipoteclamascara);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoteclamascaraValidator.getInvalidValues(this.tipoteclamascara);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoteclamascaraLogic.setDatosCliente(datosCliente);
			tipoteclamascaraLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoteclamascaraAux=new  TipoTeclaMascara();
				
				tipoteclamascaraAux.setIsNew(true);
				tipoteclamascaraAux.setIsChanged(true);
				
				tipoteclamascaraAux.setTipoTeclaMascaraOriginal(this.tipoteclamascara);
				
				tipoteclamascaraAux.setId(this.tipoteclamascara.getId());	
				tipoteclamascaraAux.setVersionRow(this.tipoteclamascara.getVersionRow());	
				tipoteclamascaraAux.setcodigo(this.tipoteclamascara.getcodigo());	
				tipoteclamascaraAux.setnombre(this.tipoteclamascara.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoteclamascaraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoteclamascaraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoteclamascaraAux,tipoteclamascaraLogic.getTipoTeclaMascaras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoteclamascaraAux,tipoteclamascaras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoteclamascaraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoteclamascaraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoteclamascaraLogic.saveTipoTeclaMascaras();//WithConnection
						//tipoteclamascaraLogic.getSetVersionRowTipoTeclaMascaras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoteclamascara,tipoteclamascaraAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoteclamascaraAux=new  TipoTeclaMascara();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoteclamascaraSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoteclamascaraSessionBean.getEsGuardarRelacionado() && this.tipoteclamascara.getId()>=0)) {
						
					tipoteclamascaraAux.setIsNew(false);
				}
				
				tipoteclamascaraAux.setIsDeleted(false);
			
				tipoteclamascaraAux.setId(this.tipoteclamascara.getId());	
				tipoteclamascaraAux.setVersionRow(this.tipoteclamascara.getVersionRow());	
				tipoteclamascaraAux.setcodigo(this.tipoteclamascara.getcodigo());	
				tipoteclamascaraAux.setnombre(this.tipoteclamascara.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoteclamascaraAux,tipoteclamascaraLogic.getTipoTeclaMascaras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoteclamascaraAux,tipoteclamascaras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoteclamascaraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoteclamascaraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoteclamascaraLogic.saveTipoTeclaMascaras();//WithConnection
						//tipoteclamascaraLogic.getSetVersionRowTipoTeclaMascaras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoteclamascara,tipoteclamascaraAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoteclamascaraAux=new  TipoTeclaMascara();
				
				tipoteclamascaraAux.setIsNew(false);
				tipoteclamascaraAux.setIsChanged(false);
				
				tipoteclamascaraAux.setIsDeleted(true);
				
				tipoteclamascaraAux.setId(this.tipoteclamascara.getId());	
				tipoteclamascaraAux.setVersionRow(this.tipoteclamascara.getVersionRow());	
				tipoteclamascaraAux.setcodigo(this.tipoteclamascara.getcodigo());	
				tipoteclamascaraAux.setnombre(this.tipoteclamascara.getnombre());	
				
				if(this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoteclamascaraAux.getId()>=0) {	
						this.tipoteclamascarasEliminados.add(tipoteclamascaraAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoteclamascaraAux,tipoteclamascaraLogic.getTipoTeclaMascaras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoteclamascaraAux,tipoteclamascaras);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoteclamascaraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoteclamascaraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoteclamascaraLogic.saveTipoTeclaMascaras();//WithConnection
						//tipoteclamascaraLogic.getSetVersionRowTipoTeclaMascaras();//WithConnection
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
					this.tipoteclamascaraLogic.getTipoTeclaMascaras().addAll(this.tipoteclamascarasEliminados);
					
					tipoteclamascaraLogic.saveTipoTeclaMascaras();//WithConnection
					//tipoteclamascaraLogic.getSetVersionRowTipoTeclaMascaras();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoteclamascarasEliminados= new ArrayList<TipoTeclaMascara>();		
			}
			
			if(this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Tecla Mascara GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Tecla Mascara",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoteclamascara=tipoteclamascaraAux;
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
      		//this.finishProcessTipoTeclaMascara();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoTeclaMascara tipoteclamascaraLocal) throws Exception {
		
		if(this.tipoteclamascaraSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoTeclaMascara tipoteclamascaraLocal) throws Exception {	
		if(this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoTeclaMascaraActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoTeclaMascara.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaras.toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoteclamascaraValidator.getInvalidValues(this.tipoteclamascara);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoTeclaMascara tipoteclamascara,List<TipoTeclaMascara> tipoteclamascaras) throws Exception {
		try	{		
			TipoTeclaMascaraConstantesFunciones.actualizarLista(tipoteclamascara,tipoteclamascaras,this.tipoteclamascaraSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoTeclaMascara tipoteclamascara,List<TipoTeclaMascara> tipoteclamascaras) throws Exception {
		try	{			
			TipoTeclaMascaraConstantesFunciones.actualizarSelectedLista(tipoteclamascara,tipoteclamascaras);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoTeclaMascara> tipoteclamascarasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoteclamascarasLocal=this.tipoteclamascaraLogic.getTipoTeclaMascaras();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoteclamascarasLocal=this.tipoteclamascaras;
			}
			//ARCHITECTURE
		
			for(TipoTeclaMascara tipoteclamascaraLocal:tipoteclamascarasLocal) {
				if(this.permiteMantenimiento(tipoteclamascaraLocal) && tipoteclamascaraLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoTeclaMascaraConstantesFunciones.getTipoTeclaMascaraLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoTeclaMascaraConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTeclaMascara.jLabelcodigoTipoTeclaMascara,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoTeclaMascaraConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTeclaMascara.jLabelnombreTipoTeclaMascara,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoTeclaMascara.jLabelcodigoTipoTeclaMascara,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoTeclaMascara.jLabelnombreTipoTeclaMascara,"");
		
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
		this.iIdNuevoTipoTeclaMascara--;	
		
		
		this.tipoteclamascaraAux=new TipoTeclaMascara();
		
		this.tipoteclamascaraAux.setId(this.iIdNuevoTipoTeclaMascara);
		this.tipoteclamascaraAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoteclamascaraLogic.getTipoTeclaMascaras().add(this.tipoteclamascaraAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoteclamascaras.add(this.tipoteclamascaraAux);
		}
		//ARCHITECTURE
		
		this.tipoteclamascara=this.tipoteclamascaraAux;
		
		if(TipoTeclaMascaraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoTeclaMascara(this.tipoteclamascara);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoTeclaMascara(this.tipoteclamascara);
		}
				
		//this.setDefaultControlesTipoTeclaMascara();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoTeclaMascara();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoTeclaMascara();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoTeclaMascara();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoTeclaMascara(this.tipoteclamascaraBean,this.tipoteclamascara,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoTeclaMascara(this.tipoteclamascara);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoteclamascaraSessionBean.getConGuardarRelaciones()) {
			classes=TipoTeclaMascaraConstantesFunciones.getClassesRelationshipsOfTipoTeclaMascara(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoteclamascaraReturnGeneral=tipoteclamascaraLogic.procesarEventosTipoTeclaMascarasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoteclamascaraLogic.getTipoTeclaMascaras(),this.tipoteclamascara,this.tipoteclamascaraParameterGeneral,this.isEsNuevoTipoTeclaMascara,classes);//this.tipoteclamascaraLogic.getTipoTeclaMascara()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoTeclaMascara(this.tipoteclamascaraReturnGeneral,this.tipoteclamascaraBean,false);
		
		if(this.tipoteclamascaraReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoTeclaMascara(this.tipoteclamascaraReturnGeneral.getTipoTeclaMascara());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoTeclaMascara(this.tipoteclamascaraReturnGeneral.getTipoTeclaMascara());
		}
		
		if(this.tipoteclamascaraReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoTeclaMascara(this.tipoteclamascaraReturnGeneral.getTipoTeclaMascara(),classes);//this.tipoteclamascaraBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoTeclaMascara(this.tipoteclamascara,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoTeclaMascara();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoTeclaMascara();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoTeclaMascara(false);
						
			if(tipoteclamascaraSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoTeclaMascaraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoTeclaMascara();
			}
			
			this.actualizarVisualTableDatosTipoTeclaMascara();
			
			this.jTableDatosTipoTeclaMascara.setRowSelectionInterval(this.getIndiceNuevoTipoTeclaMascara(), this.getIndiceNuevoTipoTeclaMascara());
			
			this.seleccionarFilaTablaTipoTeclaMascaraActual();
						
			this.actualizarEstadoCeldasBotonesTipoTeclaMascara("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoTeclaMascara(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoTeclaMascara.jTextFieldcodigoTipoTeclaMascara.setEnabled(isHabilitar && this.tipoteclamascaraConstantesFunciones.activarcodigoTipoTeclaMascara);
		this.jInternalFrameDetalleFormTipoTeclaMascara.jTextAreanombreTipoTeclaMascara.setEnabled(isHabilitar && this.tipoteclamascaraConstantesFunciones.activarnombreTipoTeclaMascara);	
		
	};
	
	public void setDefaultControlesTipoTeclaMascara() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoTeclaMascara(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoteclamascaraSessionBean.setConGuardarRelaciones(true);			
			this.tipoteclamascaraSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoTeclaMascara.jTabbedPaneRelacionesTipoTeclaMascara.setVisible(true);
			
					
		} else {
			//this.tipoteclamascaraSessionBean.setConGuardarRelaciones(false);			
			this.tipoteclamascaraSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoTeclaMascara.jTabbedPaneRelacionesTipoTeclaMascara.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoTeclaMascara() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTeclaMascara tipoteclamascaraAux:this.tipoteclamascaraLogic.getTipoTeclaMascaras()) {
				if(tipoteclamascaraAux.getId().equals(this.iIdNuevoTipoTeclaMascara)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTeclaMascara tipoteclamascaraAux:this.tipoteclamascaras) {
				if(tipoteclamascaraAux.getId().equals(this.iIdNuevoTipoTeclaMascara)) {
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
	
	public int getIndiceActualTipoTeclaMascara(TipoTeclaMascara tipoteclamascara,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTeclaMascara tipoteclamascaraAux:this.tipoteclamascaraLogic.getTipoTeclaMascaras()) {
				if(tipoteclamascaraAux.getId().equals(tipoteclamascara.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTeclaMascara tipoteclamascaraAux:this.tipoteclamascaras) {
				if(tipoteclamascaraAux.getId().equals(tipoteclamascara.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoTeclaMascara(TipoTeclaMascara tipoteclamascaraOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTeclaMascara tipoteclamascaraAux:this.tipoteclamascaraLogic.getTipoTeclaMascaras()) {
				if(tipoteclamascaraAux.getTipoTeclaMascaraOriginal().getId().equals(tipoteclamascaraOriginal.getId())) {
					existe=true;
					tipoteclamascaraOriginal.setId(tipoteclamascaraAux.getId());
					tipoteclamascaraOriginal.setVersionRow(tipoteclamascaraAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTeclaMascara tipoteclamascaraAux:this.tipoteclamascaras) {
				if(tipoteclamascaraAux.getTipoTeclaMascaraOriginal().getId().equals(tipoteclamascaraOriginal.getId())) {
					existe=true;
					tipoteclamascaraOriginal.setId(tipoteclamascaraAux.getId());
					tipoteclamascaraOriginal.setVersionRow(tipoteclamascaraAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoTeclaMascara(Boolean esParaCancelar) throws Exception {
		tipoteclamascarasAux=new ArrayList<TipoTeclaMascara>();
		tipoteclamascaraAux=new TipoTeclaMascara();
		
		if(!this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoTeclaMascara tipoteclamascaraAux:this.tipoteclamascaraLogic.getTipoTeclaMascaras()) {
					if(tipoteclamascaraAux.getId()<0) {
						tipoteclamascarasAux.add(tipoteclamascaraAux);
					}		
				}
				this.iIdNuevoTipoTeclaMascara=0L;
				this.tipoteclamascaraLogic.getTipoTeclaMascaras().removeAll(tipoteclamascarasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTeclaMascara tipoteclamascaraAux:this.tipoteclamascaras) {
					if(tipoteclamascaraAux.getId()<0) {
						tipoteclamascarasAux.add(tipoteclamascaraAux);
					}		
				}
				this.iIdNuevoTipoTeclaMascara=0L;
				this.tipoteclamascaras.removeAll(tipoteclamascarasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoTeclaMascara 
					&& this.tipoteclamascaraLogic.getTipoTeclaMascaras().size()>0
					) {
					tipoteclamascaraAux=this.tipoteclamascaraLogic.getTipoTeclaMascaras().get(this.tipoteclamascaraLogic.getTipoTeclaMascaras().size() - 1);
				
					if(tipoteclamascaraAux.getId()<0) {
						this.tipoteclamascaraLogic.getTipoTeclaMascaras().remove(tipoteclamascaraAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoTeclaMascara && this.tipoteclamascaras.size()>0) {
					tipoteclamascaraAux=this.tipoteclamascaras.get(this.tipoteclamascaras.size() - 1);
				
					if(tipoteclamascaraAux.getId()<0) {
						this.tipoteclamascaras.remove(tipoteclamascaraAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoTeclaMascara(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoteclamascara.getId()<0) {
				this.tipoteclamascaraLogic.getTipoTeclaMascaras().remove(this.tipoteclamascara);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoteclamascara.getId()<0) {
				this.tipoteclamascaras.remove(this.tipoteclamascara);
			}
		}			
	}
	
	public void setEstadosInicialesTipoTeclaMascara(List<TipoTeclaMascara> tipoteclamascarasAux) throws Exception {
		TipoTeclaMascaraConstantesFunciones.setEstadosInicialesTipoTeclaMascara(tipoteclamascarasAux);
	}
	
	public void setEstadosInicialesTipoTeclaMascara(TipoTeclaMascara tipoteclamascaraAux) throws Exception {
		TipoTeclaMascaraConstantesFunciones.setEstadosInicialesTipoTeclaMascara(tipoteclamascaraAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoTeclaMascaraActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoTeclaMascara("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoTeclaMascaraActual()) {
				if(!this.isEsNuevoTipoTeclaMascara) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoTeclaMascara("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoTeclaMascara=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoTeclaMascaraActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Tecla Mascara ?", "MANTENIMIENTO DE Tipo Tecla Mascara", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoTeclaMascara("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoTeclaMascara tipoteclamascara) throws Exception {
		TipoTeclaMascaraConstantesFunciones.seleccionarAsignar(this.tipoteclamascara,tipoteclamascara);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoTeclaMascara=this.isPermisoActualizarOriginalTipoTeclaMascara;
			
			
			this.seleccionarAsignar(tipoteclamascara);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoTeclaMascaraConstantesFunciones.quitarEspaciosTipoTeclaMascara(this.tipoteclamascara,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoTeclaMascara("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoteclamascaraSessionBean.setsFuncionBusquedaRapida(this.tipoteclamascaraSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoTeclaMascara) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoTeclaMascara(esParaCancelar);				
				this.cancelarNuevoTipoTeclaMascara(esParaCancelar);								
			}
			
			this.tipoteclamascara=new TipoTeclaMascara();
			
			this.inicializarTipoTeclaMascara();
			
			this.actualizarEstadoCeldasBotonesTipoTeclaMascara("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoTeclaMascara() throws Exception {
		try {
			TipoTeclaMascaraConstantesFunciones.inicializarTipoTeclaMascara(this.tipoteclamascara);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoteclamascaraLogic.getTipoTeclaMascaras().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoTeclaMascaras(String sAccionBusqueda,List<TipoTeclaMascara> tipoteclamascarasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoTeclaMascara"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoTeclaMascaraMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoTeclaMascaraMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoTeclaMascara"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Tecla Mascaras");		
		parameters.put("busquedapor", TipoTeclaMascaraConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoTeclaMascara=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoTeclaMascaraConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoTeclaMascaraConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoTeclaMascara=new JRBeanArrayDataSource(TipoTeclaMascaraJInternalFrame.TraerTipoTeclaMascaraBeans(tipoteclamascarasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoTeclaMascara);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoTeclaMascaraConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoTeclaMascaraConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoTeclaMascaraBean.TraerTipoTeclaMascaraBeans(tipoteclamascarasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoTeclaMascaras(sAccionBusqueda,sTipoArchivoReporte,tipoteclamascarasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoTeclaMascaras(sAccionBusqueda,sTipoArchivoReporte,tipoteclamascarasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoTeclaMascaraActionPerformed(null);
					//this.generarExcelReporteTipoTeclaMascaras(sAccionBusqueda,sTipoArchivoReporte,tipoteclamascarasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoTeclaMascaras(sAccionBusqueda,sTipoArchivoReporte,tipoteclamascarasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoTeclaMascaras(sAccionBusqueda,sTipoArchivoReporte,tipoteclamascarasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoTeclaMascaras(sAccionBusqueda,sTipoArchivoReporte,tipoteclamascarasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoTeclaMascaras(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoTeclaMascara> tipoteclamascarasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoteclamascara";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoTeclaMascaras");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoTeclaMascara("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoTeclaMascara tipoteclamascara : tipoteclamascarasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoTeclaMascaraConstantesFunciones.generarExcelReporteDataTipoTeclaMascara("NORMAL",row,workbook,tipoteclamascara,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Tecla Mascara",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoTeclaMascara(String sTipo,Row row,Workbook workbook) {
		
		TipoTeclaMascaraConstantesFunciones.generarExcelReporteHeaderTipoTeclaMascara(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoTeclaMascaras(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoTeclaMascara> tipoteclamascarasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoteclamascara_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoTeclaMascaras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoTeclaMascara tipoteclamascara : tipoteclamascarasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoTeclaMascaraConstantesFunciones.getTipoTeclaMascaraDescripcion(tipoteclamascara));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoTeclaMascaraConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoTeclaMascaraConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoteclamascara.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoTeclaMascaraConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoTeclaMascaraConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoteclamascara.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Tecla Mascara",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoTeclaMascaras(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoTeclaMascara> tipoteclamascarasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoTeclaMascara> tipoteclamascarasRespaldo=null;
		
		classes=TipoTeclaMascaraConstantesFunciones.getClassesRelationshipsOfTipoTeclaMascara(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoteclamascaraLogic.setDatosCliente(this.datosCliente);
		this.tipoteclamascaraLogic.setDatosDeep(this.datosDeep);
		this.tipoteclamascaraLogic.setIsConDeep(true);
		
		tipoteclamascarasRespaldo=this.tipoteclamascaraLogic.getTipoTeclaMascaras();
		
		this.tipoteclamascaraLogic.setTipoTeclaMascaras(tipoteclamascarasParaReportes);	
		this.tipoteclamascaraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoteclamascarasParaReportes=this.tipoteclamascaraLogic.getTipoTeclaMascaras();
		this.tipoteclamascaraLogic.setTipoTeclaMascaras(tipoteclamascarasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoteclamascara_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoTeclaMascaras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoTeclaMascara("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoTeclaMascara tipoteclamascara : tipoteclamascarasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoTeclaMascara("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoTeclaMascaraConstantesFunciones.generarExcelReporteDataTipoTeclaMascara("NORMAL",row,workbook,tipoteclamascara,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoTeclaMascaraConstantesFunciones.getTipoTeclaMascaraDescripcion(tipoteclamascara));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Tecla Mascara",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoTeclaMascara() throws Exception {		
		this.startProcessTipoTeclaMascara(true);
	}
	
	public void startProcessTipoTeclaMascara(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoTeclaMascara, this.jScrollPanelDatosTipoTeclaMascara,this.jPanelPaginacionTipoTeclaMascara, this.jScrollPanelDatosEdicionTipoTeclaMascara, this.jPanelAccionesTipoTeclaMascara,this.jPanelAccionesFormularioTipoTeclaMascara,this.jmenuBarTipoTeclaMascara,this.jmenuBarDetalleTipoTeclaMascara,this.jTtoolBarTipoTeclaMascara,this.jTtoolBarDetalleTipoTeclaMascara);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoTeclaMascara=null; 
		
		final JPanel jPanelParametrosReportesTipoTeclaMascara=this.jPanelParametrosReportesTipoTeclaMascara;
		//final JScrollPane jScrollPanelDatosTipoTeclaMascara=this.jScrollPanelDatosTipoTeclaMascara;
		final JTable jTableDatosTipoTeclaMascara=this.jTableDatosTipoTeclaMascara;		
		final JPanel jPanelPaginacionTipoTeclaMascara=this.jPanelPaginacionTipoTeclaMascara;
		//final JScrollPane jScrollPanelDatosEdicionTipoTeclaMascara=this.jScrollPanelDatosEdicionTipoTeclaMascara;
		final JPanel jPanelAccionesTipoTeclaMascara=this.jPanelAccionesTipoTeclaMascara;
		
		JPanel jPanelCamposAuxiliarTipoTeclaMascara=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoTeclaMascara=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) {
			jPanelCamposAuxiliarTipoTeclaMascara=this.jInternalFrameDetalleFormTipoTeclaMascara.jPanelCamposTipoTeclaMascara;
			jPanelAccionesFormularioAuxiliarTipoTeclaMascara=this.jInternalFrameDetalleFormTipoTeclaMascara.jPanelAccionesFormularioTipoTeclaMascara;
		}
		
		final JPanel jPanelCamposTipoTeclaMascara=jPanelCamposAuxiliarTipoTeclaMascara;
		final JPanel jPanelAccionesFormularioTipoTeclaMascara=jPanelAccionesFormularioAuxiliarTipoTeclaMascara;
		
		
		final JMenuBar jmenuBarTipoTeclaMascara=this.jmenuBarTipoTeclaMascara;
		final JToolBar jTtoolBarTipoTeclaMascara=this.jTtoolBarTipoTeclaMascara;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoTeclaMascara=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoTeclaMascara=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) {
			jmenuBarDetalleAuxiliarTipoTeclaMascara=this.jInternalFrameDetalleFormTipoTeclaMascara.jmenuBarDetalleTipoTeclaMascara;
			jTtoolBarDetalleAuxiliarTipoTeclaMascara=this.jInternalFrameDetalleFormTipoTeclaMascara.jTtoolBarDetalleTipoTeclaMascara;
		}
		
		final JMenuBar jmenuBarDetalleTipoTeclaMascara=jmenuBarDetalleAuxiliarTipoTeclaMascara;
		final JToolBar jTtoolBarDetalleTipoTeclaMascara=jTtoolBarDetalleAuxiliarTipoTeclaMascara;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoTeclaMascara;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoTeclaMascara;
			processRunnable.jTableDatos=jTableDatosTipoTeclaMascara;
			processRunnable.jPanelCampos=jPanelCamposTipoTeclaMascara;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoTeclaMascara;
			processRunnable.jPanelAcciones=jPanelAccionesTipoTeclaMascara;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoTeclaMascara;
			
			
			processRunnable.jmenuBar=jmenuBarTipoTeclaMascara;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoTeclaMascara;
			processRunnable.jTtoolBar=jTtoolBarTipoTeclaMascara;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoTeclaMascara;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoTeclaMascara ,jPanelParametrosReportesTipoTeclaMascara,jTableDatosTipoTeclaMascara, /*jScrollPanelDatosTipoTeclaMascara,*/jPanelCamposTipoTeclaMascara,jPanelPaginacionTipoTeclaMascara, /*jScrollPanelDatosEdicionTipoTeclaMascara,*/ jPanelAccionesTipoTeclaMascara,jPanelAccionesFormularioTipoTeclaMascara,jmenuBarTipoTeclaMascara,jmenuBarDetalleTipoTeclaMascara,jTtoolBarTipoTeclaMascara,jTtoolBarDetalleTipoTeclaMascara);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoTeclaMascara, jScrollPanelDatosTipoTeclaMascara,jPanelPaginacionTipoTeclaMascara, jScrollPanelDatosEdicionTipoTeclaMascara, jPanelAccionesTipoTeclaMascara,jPanelAccionesFormularioTipoTeclaMascara,jmenuBarTipoTeclaMascara,jmenuBarDetalleTipoTeclaMascara,jTtoolBarTipoTeclaMascara,jTtoolBarDetalleTipoTeclaMascara);
						
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
	
	public void finishProcessTipoTeclaMascara() {// throws Exception 
		this.finishProcessTipoTeclaMascara(true);
	}
	
	public void finishProcessTipoTeclaMascara(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoTeclaMascara, this.jScrollPanelDatosTipoTeclaMascara,this.jPanelPaginacionTipoTeclaMascara, this.jScrollPanelDatosEdicionTipoTeclaMascara, this.jPanelAccionesTipoTeclaMascara,this.jPanelAccionesFormularioTipoTeclaMascara,this.jmenuBarTipoTeclaMascara,this.jmenuBarDetalleTipoTeclaMascara,this.jTtoolBarTipoTeclaMascara,this.jTtoolBarDetalleTipoTeclaMascara);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoTeclaMascara=null; 
		
		final JPanel jPanelParametrosReportesTipoTeclaMascara=this.jPanelParametrosReportesTipoTeclaMascara;
		//final JScrollPane jScrollPanelDatosTipoTeclaMascara=this.jScrollPanelDatosTipoTeclaMascara;
		final JTable jTableDatosTipoTeclaMascara=this.jTableDatosTipoTeclaMascara;		
		final JPanel jPanelPaginacionTipoTeclaMascara=this.jPanelPaginacionTipoTeclaMascara;
		//final JScrollPane jScrollPanelDatosEdicionTipoTeclaMascara=this.jScrollPanelDatosEdicionTipoTeclaMascara;
		final JPanel jPanelAccionesTipoTeclaMascara=this.jPanelAccionesTipoTeclaMascara;
		
		JPanel jPanelCamposAuxiliarTipoTeclaMascara=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoTeclaMascara=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) {
			jPanelCamposAuxiliarTipoTeclaMascara=this.jInternalFrameDetalleFormTipoTeclaMascara.jPanelCamposTipoTeclaMascara;
			jPanelAccionesFormularioAuxiliarTipoTeclaMascara=this.jInternalFrameDetalleFormTipoTeclaMascara.jPanelAccionesFormularioTipoTeclaMascara;
		}
		
		final JPanel jPanelCamposTipoTeclaMascara=jPanelCamposAuxiliarTipoTeclaMascara;
		final JPanel jPanelAccionesFormularioTipoTeclaMascara=jPanelAccionesFormularioAuxiliarTipoTeclaMascara;
		
		
		final JMenuBar jmenuBarTipoTeclaMascara=this.jmenuBarTipoTeclaMascara;		
		final JToolBar jTtoolBarTipoTeclaMascara=this.jTtoolBarTipoTeclaMascara;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoTeclaMascara=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoTeclaMascara=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) {
			jmenuBarDetalleAuxiliarTipoTeclaMascara=this.jInternalFrameDetalleFormTipoTeclaMascara.jmenuBarDetalleTipoTeclaMascara;
			jTtoolBarDetalleAuxiliarTipoTeclaMascara=this.jInternalFrameDetalleFormTipoTeclaMascara.jTtoolBarDetalleTipoTeclaMascara;		
		}
		
		final JMenuBar jmenuBarDetalleTipoTeclaMascara=jmenuBarDetalleAuxiliarTipoTeclaMascara;
		final JToolBar jTtoolBarDetalleTipoTeclaMascara=jTtoolBarDetalleAuxiliarTipoTeclaMascara;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoTeclaMascara;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoTeclaMascara;
			processRunnable.jTableDatos=jTableDatosTipoTeclaMascara;
			processRunnable.jPanelCampos=jPanelCamposTipoTeclaMascara;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoTeclaMascara;
			processRunnable.jPanelAcciones=jPanelAccionesTipoTeclaMascara;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoTeclaMascara;
			
			
			processRunnable.jmenuBar=jmenuBarTipoTeclaMascara;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoTeclaMascara;
			processRunnable.jTtoolBar=jTtoolBarTipoTeclaMascara;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoTeclaMascara;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoTeclaMascara ,jPanelParametrosReportesTipoTeclaMascara, jTableDatosTipoTeclaMascara,/*jScrollPanelDatosTipoTeclaMascara,*/jPanelCamposTipoTeclaMascara,jPanelPaginacionTipoTeclaMascara, /*jScrollPanelDatosEdicionTipoTeclaMascara,*/ jPanelAccionesTipoTeclaMascara,jPanelAccionesFormularioTipoTeclaMascara,jmenuBarTipoTeclaMascara,jmenuBarDetalleTipoTeclaMascara,jTtoolBarTipoTeclaMascara,jTtoolBarDetalleTipoTeclaMascara));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoTeclaMascara(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoTeclaMascara(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoTeclaMascara(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoTeclaMascara(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoTeclaMascara,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoTeclaMascara,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoTeclaMascara(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoTeclaMascara,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoTeclaMascara,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoteclamascaraConstantesFunciones.getsFinalQueryTipoTeclaMascara();
		String  finalQueryPaginacionTodos=this.tipoteclamascaraConstantesFunciones.getsFinalQueryTipoTeclaMascara();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoTeclaMascaraConstantesFunciones.getArrayColumnasGlobalesNoTipoTeclaMascara(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoTeclaMascaraConstantesFunciones.getArrayColumnasGlobalesTipoTeclaMascara(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoTeclaMascaraConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoteclamascarasEliminados= new ArrayList<TipoTeclaMascara>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoTeclaMascara();
		
				///*TipoTeclaMascaraSessionBean*/this.tipoteclamascaraSessionBean=new TipoTeclaMascaraSessionBean();
			
			if(this.tipoteclamascaraSessionBean==null) {
				this.tipoteclamascaraSessionBean=new TipoTeclaMascaraSessionBean();
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
					this.iNumeroPaginacion=TipoTeclaMascaraConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoTeclaMascaraConstantesFunciones.getClassesForeignKeysOfTipoTeclaMascara(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoteclamascara."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoteclamascarasAux= new ArrayList<TipoTeclaMascara>();
			
				
			tipoteclamascaraLogic.setDatosCliente(this.datosCliente);
			tipoteclamascaraLogic.setDatosDeep(this.datosDeep);
			tipoteclamascaraLogic.setIsConDeep(true);
			
			
			tipoteclamascaraLogic.getTipoTeclaMascaraDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoteclamascaraLogic.getTodosTipoTeclaMascaras(finalQueryGlobal,pagination);
					
					//tipoteclamascaraLogic.getTodosTipoTeclaMascarasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoteclamascaraLogic.getTipoTeclaMascaras()==null|| tipoteclamascaraLogic.getTipoTeclaMascaras().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoteclamascarasAux= new ArrayList<TipoTeclaMascara>();
							tipoteclamascarasAux.addAll(tipoteclamascaraLogic.getTipoTeclaMascaras());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoteclamascarasAux= new ArrayList<TipoTeclaMascara>();
							tipoteclamascarasAux.addAll(tipoteclamascaras);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoteclamascaraLogic.getTodosTipoTeclaMascaras(finalQueryGlobal+"",this.pagination);												
							
							//tipoteclamascaraLogic.getTodosTipoTeclaMascarasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoTeclaMascaras("Todos",tipoteclamascaraLogic.getTipoTeclaMascaras() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoteclamascaraLogic.setTipoTeclaMascaras(new ArrayList<TipoTeclaMascara>());					
							tipoteclamascaraLogic.getTipoTeclaMascaras().addAll(tipoteclamascarasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoteclamascaras=new ArrayList<TipoTeclaMascara>();
							tipoteclamascaras.addAll(tipoteclamascarasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoTeclaMascara=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoTeclaMascara=this.idActual;
				
				} else if(this.idTipoTeclaMascaraActual!=null && this.idTipoTeclaMascaraActual!=0L) {
					idTipoTeclaMascara=idTipoTeclaMascaraActual;
				}
				
					
				this.sDetalleReporte=TipoTeclaMascaraConstantesFunciones.getDetalleIndicePorId(idTipoTeclaMascara);
				
				this.tipoteclamascaras=new ArrayList<TipoTeclaMascara>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoteclamascaraLogic.getEntity(idTipoTeclaMascara);
					
					//tipoteclamascaraLogic.getEntityWithConnection(idTipoTeclaMascara);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoteclamascaraLogic.setTipoTeclaMascaras(new ArrayList<TipoTeclaMascara>());
					tipoteclamascaraLogic.getTipoTeclaMascaras().add(tipoteclamascaraLogic.getTipoTeclaMascara());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoteclamascaras=new ArrayList<TipoTeclaMascara>();
					this.tipoteclamascaras.add(tipoteclamascara);
				}
				
				if(tipoteclamascaraLogic.getTipoTeclaMascara()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoTeclaMascara();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoTeclaMascara();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoteclamascaraLogic.getTipoTeclaMascaras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoteclamascaras.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoteclamascaraLogic.getTipoTeclaMascaras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoteclamascaras.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoTeclaMascara tipoteclamascara) {
		Boolean permite=true;
		
		if(this.tipoteclamascara.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoTeclaMascaraConstantesFunciones.getOrderByListaTipoTeclaMascara();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoTeclaMascaraConstantesFunciones.getOrderByListaTipoTeclaMascara();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTeclaMascara tipoteclamascara:tipoteclamascaraLogic.getTipoTeclaMascaras()) {
				if(tipoteclamascara.getsType().equals(Constantes2.S_TOTALES)) {
					tipoteclamascaraTotales=tipoteclamascara;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTeclaMascara tipoteclamascara:this.tipoteclamascaras) {
				if(tipoteclamascara.getsType().equals(Constantes2.S_TOTALES)) {
					tipoteclamascaraTotales=tipoteclamascara;
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
			this.tipoteclamascaraAux=new TipoTeclaMascara();
			this.tipoteclamascaraAux.setsType(Constantes2.S_TOTALES);
			this.tipoteclamascaraAux.setIsNew(false);
			this.tipoteclamascaraAux.setIsChanged(false);
			this.tipoteclamascaraAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoTeclaMascaraConstantesFunciones.TotalizarValoresFilaTipoTeclaMascara(this.tipoteclamascaraLogic.getTipoTeclaMascaras(),this.tipoteclamascaraAux);
				
				this.tipoteclamascaraLogic.getTipoTeclaMascaras().add(this.tipoteclamascaraAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoTeclaMascaraConstantesFunciones.TotalizarValoresFilaTipoTeclaMascara(this.tipoteclamascaras,this.tipoteclamascaraAux);
				
				this.tipoteclamascaras.add(this.tipoteclamascaraAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoteclamascaraTotales=new TipoTeclaMascara();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoteclamascaraLogic.getTipoTeclaMascaras().remove(tipoteclamascaraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoteclamascaras.remove(tipoteclamascaraTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoteclamascaraTotales=new TipoTeclaMascara();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTeclaMascara tipoteclamascara:tipoteclamascaraLogic.getTipoTeclaMascaras()) {
				if(tipoteclamascara.getsType().equals(Constantes2.S_TOTALES)) {
					tipoteclamascaraTotales=tipoteclamascara;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoTeclaMascaraConstantesFunciones.TotalizarValoresFilaTipoTeclaMascara(this.tipoteclamascaraLogic.getTipoTeclaMascaras(),tipoteclamascaraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTeclaMascara tipoteclamascara:this.tipoteclamascaras) {
				if(tipoteclamascara.getsType().equals(Constantes2.S_TOTALES)) {
					tipoteclamascaraTotales=tipoteclamascara;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoTeclaMascaraConstantesFunciones.TotalizarValoresFilaTipoTeclaMascara(this.tipoteclamascaras,tipoteclamascaraTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoTeclaMascara() {
		this.isPermisoTodoTipoTeclaMascara=false;
		this.isPermisoNuevoTipoTeclaMascara=false;
		this.isPermisoActualizarTipoTeclaMascara=false;
		this.isPermisoActualizarOriginalTipoTeclaMascara=false;
		this.isPermisoEliminarTipoTeclaMascara=false;
		this.isPermisoGuardarCambiosTipoTeclaMascara=false;
		this.isPermisoConsultaTipoTeclaMascara=false;
		this.isPermisoBusquedaTipoTeclaMascara=false;
		this.isPermisoReporteTipoTeclaMascara=false;		
		this.isPermisoOrdenTipoTeclaMascara=false;		
		this.isPermisoPaginacionMedioTipoTeclaMascara=false;		
		this.isPermisoPaginacionAltoTipoTeclaMascara=false;
		this.isPermisoPaginacionTodoTipoTeclaMascara=false;
		this.isPermisoCopiarTipoTeclaMascara=false;		
		this.isPermisoVerFormTipoTeclaMascara=false;		
		this.isPermisoDuplicarTipoTeclaMascara=false;		
		this.isPermisoOrdenTipoTeclaMascara=false;		
	}
	
	public void setPermisosUsuarioTipoTeclaMascara(Boolean isPermiso) {
		this.isPermisoTodoTipoTeclaMascara=isPermiso;
		this.isPermisoNuevoTipoTeclaMascara=isPermiso;
		this.isPermisoActualizarTipoTeclaMascara=isPermiso;
		this.isPermisoActualizarOriginalTipoTeclaMascara=isPermiso;
		this.isPermisoEliminarTipoTeclaMascara=isPermiso;
		this.isPermisoGuardarCambiosTipoTeclaMascara=isPermiso;
		this.isPermisoConsultaTipoTeclaMascara=isPermiso;
		this.isPermisoBusquedaTipoTeclaMascara=isPermiso;
		this.isPermisoReporteTipoTeclaMascara=isPermiso;
		this.isPermisoOrdenTipoTeclaMascara=isPermiso;		
		this.isPermisoPaginacionMedioTipoTeclaMascara=isPermiso;		
		this.isPermisoPaginacionAltoTipoTeclaMascara=isPermiso;		
		this.isPermisoPaginacionTodoTipoTeclaMascara=isPermiso;		
		this.isPermisoCopiarTipoTeclaMascara=isPermiso;		
		this.isPermisoVerFormTipoTeclaMascara=isPermiso;		
		this.isPermisoDuplicarTipoTeclaMascara=isPermiso;
		this.isPermisoOrdenTipoTeclaMascara=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoTeclaMascara(Boolean isPermiso) {
		//this.isPermisoTodoTipoTeclaMascara=isPermiso;
		this.isPermisoNuevoTipoTeclaMascara=isPermiso;
		this.isPermisoActualizarTipoTeclaMascara=isPermiso;
		this.isPermisoActualizarOriginalTipoTeclaMascara=isPermiso;
		this.isPermisoEliminarTipoTeclaMascara=isPermiso;
		this.isPermisoGuardarCambiosTipoTeclaMascara=isPermiso;
		//this.isPermisoConsultaTipoTeclaMascara=isPermiso;
		//this.isPermisoBusquedaTipoTeclaMascara=isPermiso;
		//this.isPermisoReporteTipoTeclaMascara=isPermiso;
		//this.isPermisoOrdenTipoTeclaMascara=isPermiso;		
		//this.isPermisoPaginacionMedioTipoTeclaMascara=isPermiso;		
		//this.isPermisoPaginacionAltoTipoTeclaMascara=isPermiso;		
		//this.isPermisoPaginacionTodoTipoTeclaMascara=isPermiso;		
		//this.isPermisoCopiarTipoTeclaMascara=isPermiso;		
		//this.isPermisoDuplicarTipoTeclaMascara=isPermiso;
		//this.isPermisoOrdenTipoTeclaMascara=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoTeclaMascaraClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoTeclaMascaraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoTeclaMascara(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoTeclaMascaraClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoTeclaMascaraClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoTeclaMascaraClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoTeclaMascaraClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoTeclaMascara() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoTeclaMascaraJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoTeclaMascaraConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoTeclaMascara=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoTeclaMascara=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoTeclaMascara=this.isPermisoActualizarTipoTeclaMascara;
			this.isPermisoEliminarTipoTeclaMascara=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoTeclaMascara=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoTeclaMascara=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoTeclaMascara=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoTeclaMascara=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoTeclaMascara=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoTeclaMascara=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoTeclaMascara=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoTeclaMascara=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoTeclaMascara=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoTeclaMascara=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoTeclaMascara=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoTeclaMascara=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoTeclaMascara=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoTeclaMascara.setToolTipText(this.jTableDatosTipoTeclaMascara.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoTeclaMascara(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoTeclaMascara(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoTeclaMascaraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoTeclaMascaraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoTeclaMascara() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoTeclaMascaraListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoTeclaMascaraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoTeclaMascaraJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoTeclaMascaraListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoTeclaMascaraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoTeclaMascara()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoTeclaMascara()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoTeclaMascara(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoTeclaMascara()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoTeclaMascara();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoTeclaMascara(TipoTeclaMascara tipoteclamascara)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoTeclaMascara(TipoTeclaMascara tipoteclamascara,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoTeclaMascara()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoTeclaMascara()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoTeclaMascara()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoTeclaMascara()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoTeclaMascara()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoTeclaMascara()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoTeclaMascara(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoTeclaMascara()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoTeclaMascaraBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoTeclaMascaraBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoTeclaMascaraBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoteclamascaraSessionBean=new TipoTeclaMascaraSessionBean(); 
		this.tipoteclamascaraConstantesFunciones=new TipoTeclaMascaraConstantesFunciones(); 
		this.tipoteclamascaraBean=new TipoTeclaMascara();//(this.tipoteclamascaraConstantesFunciones); 		
		this.tipoteclamascaraReturnGeneral=new TipoTeclaMascaraParameterReturnGeneral(); 
		
		this.tipoteclamascaraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoteclamascaraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoTeclaMascaraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoTeclaMascaraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoTeclaMascaraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoTeclaMascara(true);
			
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
			
			this.tipoteclamascaraConstantesFunciones=new TipoTeclaMascaraConstantesFunciones(); 
			this.tipoteclamascaraBean=new TipoTeclaMascara();//this.tipoteclamascaraConstantesFunciones); 			
			this.tipoteclamascaraReturnGeneral=new TipoTeclaMascaraParameterReturnGeneral(); 
		
			TipoTeclaMascaraBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Tecla Mascara Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoteclamascara=new TipoTeclaMascara();
			this.tipoteclamascaras = new ArrayList<TipoTeclaMascara>();
			this.tipoteclamascarasAux = new ArrayList<TipoTeclaMascara>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic=new TipoTeclaMascaraLogic();
				this.tipoteclamascaraLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoteclamascaraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoteclamascaraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoTeclaMascara);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoTeclaMascara!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoTeclaMascara);	
					}
					
					if(this.jInternalFrameImportacionTipoTeclaMascara!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoTeclaMascara);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoTeclaMascara!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoTeclaMascara);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoTeclaMascara);
				this.jInternalFrameDetalleFormTipoTeclaMascara.setVisible(false);
				this.jInternalFrameDetalleFormTipoTeclaMascara.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoTeclaMascara!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoTeclaMascara);
					this.jInternalFrameReporteDinamicoTipoTeclaMascara.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoTeclaMascara.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoTeclaMascara!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoTeclaMascara);
					this.jInternalFrameImportacionTipoTeclaMascara.setVisible(false);
					this.jInternalFrameImportacionTipoTeclaMascara.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoTeclaMascara!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoTeclaMascara);
					this.jInternalFrameOrderByTipoTeclaMascara.setVisible(false);
					this.jInternalFrameOrderByTipoTeclaMascara.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoTeclaMascaraActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoTeclaMascaraConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoteclamascaraReturnGeneral=new TipoTeclaMascaraParameterReturnGeneral();
			
			this.tipoteclamascaraParameterGeneral=new TipoTeclaMascaraParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoteclamascaraLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoTeclaMascaraJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoTeclaMascaraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoteclamascaraSessionBean.getEsGuardarRelacionado(),this.tipoteclamascaraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoTeclaMascaraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoteclamascaraSessionBean.getEsGuardarRelacionado(),this.tipoteclamascaraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoTeclaMascara=false;
			this.isVisibilidadCeldaDuplicarTipoTeclaMascara=true;
			this.isVisibilidadCeldaCopiarTipoTeclaMascara=true;
			this.isVisibilidadCeldaVerFormTipoTeclaMascara=true;
			this.isVisibilidadCeldaOrdenTipoTeclaMascara=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoTeclaMascara=false;
			this.isVisibilidadCeldaModificarTipoTeclaMascara=false;
			this.isVisibilidadCeldaActualizarTipoTeclaMascara=false;
			this.isVisibilidadCeldaEliminarTipoTeclaMascara=false;
			this.isVisibilidadCeldaCancelarTipoTeclaMascara=false;
			this.isVisibilidadCeldaGuardarTipoTeclaMascara=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTeclaMascara=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoTeclaMascara("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoTeclaMascara();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoTeclaMascara(false);
			
			this.setPermisosUsuarioTipoTeclaMascara();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoteclamascaraSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoteclamascaraSessionBean.getEsGuardarRelacionado() && this.tipoteclamascaraSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoTeclaMascaraClasesRelacionadas();
			}
			
			if(this.tipoteclamascaraSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoTeclaMascaraClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoTeclaMascaraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoTeclaMascara();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoTeclaMascara();
			}
			
			if(!this.isPermisoBusquedaTipoTeclaMascara) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoTeclaMascara,this.isPermisoPaginacionMedioTipoTeclaMascara,this.isPermisoPaginacionTodoTipoTeclaMascara);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoTeclaMascaraConstantesFunciones.getTiposSeleccionarTipoTeclaMascara());
				
				this.tiposColumnasSelect=TipoTeclaMascaraConstantesFunciones.getTiposSeleccionarTipoTeclaMascara(true);
				
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
			//if(!this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoTeclaMascara();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoTeclaMascara(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoTeclaMascara(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoTeclaMascara() ;
			
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
				tipoteclamascaraImplementable= (TipoTeclaMascaraImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoTeclaMascaraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoteclamascaraImplementableHome= (TipoTeclaMascaraImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoTeclaMascaraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoteclamascaras= new ArrayList<TipoTeclaMascara>();
			this.tipoteclamascarasEliminados= new ArrayList<TipoTeclaMascara>();
						
			this.isEsNuevoTipoTeclaMascara=false;
			this.esParaAccionDesdeFormularioTipoTeclaMascara=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoTeclaMascara(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoTeclaMascara();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoTeclaMascaraConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoTeclaMascara("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoTeclaMascara(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoTeclaMascara();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoTeclaMascara();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoTeclaMascara(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoTeclaMascara: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoTeclaMascara() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoTeclaMascara")) {
				iIndex=this.jInternalFrameDetalleFormTipoTeclaMascara.jTabbedPaneRelacionesTipoTeclaMascara.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoTeclaMascara.jTabbedPaneRelacionesTipoTeclaMascara.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoTeclaMascara.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoTeclaMascara();	
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
	
	public void cargarCombosForeignKeyTipoTeclaMascara(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoTeclaMascara(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoTeclaMascara(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoTeclaMascaraListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoTeclaMascara();
		
		this.cargarCombosFrameForeignKeyTipoTeclaMascara();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoTeclaMascara();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoTeclaMascara();
		}
	}
	
	
	
	public void jButtonNuevoTipoTeclaMascaraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoteclamascaraSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoTeclaMascara==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
			
			
			if(jTableDatosTipoTeclaMascara.getRowCount()>=1) {
				jTableDatosTipoTeclaMascara.removeRowSelectionInterval(0, jTableDatosTipoTeclaMascara.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoTeclaMascara=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoTeclaMascara(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoTeclaMascara(true);			
			//this.tipoteclamascara=new TipoTeclaMascara();
			//this.tipoteclamascara.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoTeclaMascara(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTeclaMascara() ;
			
			if(TipoTeclaMascaraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoTeclaMascara(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoteclamascara);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoteclamascara);				
			
			TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
			
			if(this.tipoteclamascaraSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoTeclaMascara: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoTeclaMascaraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoTeclaMascara> tipoteclamascarasSeleccionados=new ArrayList<TipoTeclaMascara>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoTeclaMascara.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoTeclaMascara.getSelectedRows().length;			
			}
			
			tipoteclamascarasSeleccionados=this.getTipoTeclaMascarasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoTeclaMascara--;			
				//TipoTeclaMascara tipoteclamascaraAux= new TipoTeclaMascara();			
				//tipoteclamascaraAux.setId(this.iIdNuevoTipoTeclaMascara);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoTeclaMascara tipoteclamascaraOrigen=new TipoTeclaMascara();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoTeclaMascara tipoteclamascaraOrigen : tipoteclamascarasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoTeclaMascara.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoteclamascaraOrigen =(TipoTeclaMascara) this.tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoteclamascaraOrigen =(TipoTeclaMascara) this.tipoteclamascaras.toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoTeclaMascara();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoteclamascara.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoTeclaMascara(tipoteclamascaraOrigen,this.tipoteclamascara,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTeclaMascara(this.tipoteclamascara);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoteclamascaraLogic.getTipoTeclaMascaras().add(this.tipoteclamascaraAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoteclamascaras.add(this.tipoteclamascaraAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoTeclaMascara(false);
				
				this.jTableDatosTipoTeclaMascara.setRowSelectionInterval(this.getIndiceNuevoTipoTeclaMascara(), this.getIndiceNuevoTipoTeclaMascara());
				
				int iLastRow =  this.jTableDatosTipoTeclaMascara.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoTeclaMascara.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoTeclaMascara.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoTeclaMascara(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoTeclaMascaraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoTeclaMascara> tipoteclamascarasSeleccionados=new ArrayList<TipoTeclaMascara>();									
		
			TipoTeclaMascara tipoteclamascaraOrigen=new TipoTeclaMascara();
			TipoTeclaMascara tipoteclamascaraDestino=new TipoTeclaMascara();
				
			tipoteclamascarasSeleccionados=this.getTipoTeclaMascarasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoTeclaMascara.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoteclamascarasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoTeclaMascara.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoteclamascaraOrigen =(TipoTeclaMascara) this.tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoteclamascaraOrigen =(TipoTeclaMascara) this.tipoteclamascaras.toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoteclamascaraDestino =(TipoTeclaMascara) this.tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoteclamascaraDestino =(TipoTeclaMascara) this.tipoteclamascaras.toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoteclamascaraOrigen =tipoteclamascarasSeleccionados.get(0);
				tipoteclamascaraDestino =tipoteclamascarasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoTeclaMascara(tipoteclamascaraOrigen,tipoteclamascaraDestino,true,false);
				
				tipoteclamascaraDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoteclamascaraDestino,tipoteclamascaraLogic.getTipoTeclaMascaras());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoteclamascaraDestino,tipoteclamascaras);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoTeclaMascara(false);
				
				//this.jTableDatosTipoTeclaMascara.setRowSelectionInterval(this.getIndiceNuevoTipoTeclaMascara(), this.getIndiceNuevoTipoTeclaMascara());
				
				int iLastRow =  this.jTableDatosTipoTeclaMascara.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoTeclaMascara.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoTeclaMascara.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoTeclaMascara(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoTeclaMascaraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoTeclaMascara==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoTeclaMascara.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoTeclaMascaraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoTeclaMascara.isVisible();
			
			
			this.jPanelParametrosReportesTipoTeclaMascara.setVisible(!isVisible);
			this.jPanelPaginacionTipoTeclaMascara.setVisible(!isVisible);
			this.jPanelAccionesTipoTeclaMascara.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoTeclaMascaraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoTeclaMascara();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoTeclaMascaraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoTeclaMascara();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoTeclaMascaraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoTeclaMascara();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoTeclaMascaraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoTeclaMascara();
			
			this.abrirFrameOrderByTipoTeclaMascara();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoTeclaMascaraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoTeclaMascara();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoTeclaMascara(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoTeclaMascara);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoTeclaMascara.isMaximum()) {
					this.jInternalFrameDetalleFormTipoTeclaMascara.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoTeclaMascara.setSize(this.jInternalFrameDetalleFormTipoTeclaMascara.iWidthFormulario,this.jInternalFrameDetalleFormTipoTeclaMascara.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoTeclaMascara.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoTeclaMascara.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoTeclaMascara.isMaximum()) {
						this.jInternalFrameDetalleFormTipoTeclaMascara.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoTeclaMascara.jContentPaneDetalleTipoTeclaMascara.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoTeclaMascara.jTabbedPaneRelacionesTipoTeclaMascara.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoTeclaMascara.jContentPaneDetalleTipoTeclaMascara.getWidth(),TipoTeclaMascaraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoTeclaMascara.jTabbedPaneRelacionesTipoTeclaMascara.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoTeclaMascara.jContentPaneDetalleTipoTeclaMascara.getWidth(),TipoTeclaMascaraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoTeclaMascara.jTabbedPaneRelacionesTipoTeclaMascara.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoTeclaMascara.jContentPaneDetalleTipoTeclaMascara.getWidth(),TipoTeclaMascaraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoTeclaMascara.setVisible(true);
	        this.jInternalFrameDetalleFormTipoTeclaMascara.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoTeclaMascara() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoTeclaMascara==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoTeclaMascara=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTeclaMascara,false,this);
				} else {
					this.jInternalFrameOrderByTipoTeclaMascara=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTeclaMascara,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoTeclaMascara);
				this.jInternalFrameOrderByTipoTeclaMascara.setVisible(false);
				this.jInternalFrameOrderByTipoTeclaMascara.setSelected(false);
				
				this.jInternalFrameOrderByTipoTeclaMascara.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoTeclaMascara"));
				
				this.inicializarActualizarBindingTablaOrderByTipoTeclaMascara();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoTeclaMascara() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoTeclaMascara==null) {
				
				this.jInternalFrameImportacionTipoTeclaMascara=new ImportacionJInternalFrame(TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoTeclaMascara);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoTeclaMascara);
				this.jInternalFrameImportacionTipoTeclaMascara.setVisible(false);
				this.jInternalFrameImportacionTipoTeclaMascara.setSelected(false);


				this.jInternalFrameImportacionTipoTeclaMascara.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoTeclaMascara"));
				this.jInternalFrameImportacionTipoTeclaMascara.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoTeclaMascara"));
				this.jInternalFrameImportacionTipoTeclaMascara.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoTeclaMascara"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoTeclaMascara() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoTeclaMascara==null) {
				this.jInternalFrameReporteDinamicoTipoTeclaMascara=new ReporteDinamicoJInternalFrame(TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoTeclaMascara);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoTeclaMascara);
				this.jInternalFrameReporteDinamicoTipoTeclaMascara.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoTeclaMascara.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoTeclaMascara"));
				this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoTeclaMascara"));
				this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoTeclaMascara"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoTeclaMascara();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoTeclaMascara() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoTeclaMascara);
			
	       	this.jInternalFrameDetalleFormTipoTeclaMascara.setVisible(false);
	        this.jInternalFrameDetalleFormTipoTeclaMascara.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoTeclaMascara.dispose();
			//this.jInternalFrameDetalleFormTipoTeclaMascara=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoTeclaMascara() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoTeclaMascara.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoTeclaMascara.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoTeclaMascara() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoTeclaMascara.setVisible(true);
	        this.jInternalFrameImportacionTipoTeclaMascara.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoTeclaMascara() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoTeclaMascara.setVisible(true);
	        this.jInternalFrameOrderByTipoTeclaMascara.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoTeclaMascara() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoTeclaMascara.setVisible(false);
	        this.jInternalFrameOrderByTipoTeclaMascara.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoTeclaMascara() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoTeclaMascara.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoTeclaMascara.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoTeclaMascara() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoTeclaMascara.setVisible(false);
	        this.jInternalFrameImportacionTipoTeclaMascara.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoTeclaMascaraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoTeclaMascara(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoTeclaMascara(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoTeclaMascara.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoTeclaMascara(true);
			//this.isEsNuevoTipoTeclaMascara=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaras.toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoTeclaMascara("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoTeclaMascara(false) ;
			
			if(tipoteclamascaraSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoTeclaMascaraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoTeclaMascara(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTeclaMascara(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoTeclaMascaraActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoTeclaMascara.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaras.toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoTeclaMascara(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoTeclaMascara==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoTeclaMascara.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoTeclaMascara(true);
			//this.isEsNuevoTipoTeclaMascara=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaras.toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoteclamascara.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoTeclaMascara("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoTeclaMascara(false) ;
			
			if(TipoTeclaMascaraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoTeclaMascara(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTeclaMascara(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoTeclaMascaraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoTeclaMascara(false);
			
			//if(!this.isEsNuevoTipoTeclaMascara) {								
				int intSelectedRow = this.jTableDatosTipoTeclaMascara.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaras.toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoTeclaMascaraJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoTeclaMascara(this.tipoteclamascara,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTeclaMascara(this.tipoteclamascara);
				
			}
			
			if(this.permiteMantenimiento(this.tipoteclamascara)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoTeclaMascara=true;
					this.inicializarActualizarBindingTablaTipoTeclaMascara(false);
					this.isEsNuevoTipoTeclaMascara=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoTeclaMascara=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoTeclaMascara=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoTeclaMascara(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoTeclaMascara(false);
				
				this.habilitarDeshabilitarControlesTipoTeclaMascara(false);
			
												
				
				if(TipoTeclaMascaraJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoTeclaMascara();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoTeclaMascaraActionPerformed(evt,tipoteclamascaraSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoTeclaMascara(this.tipoteclamascara,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoTeclaMascara.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoteclamascaraSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoteclamascara.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoTeclaMascara.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTeclaMascara.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoTeclaMascaraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoTeclaMascara.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
				this.tipoteclamascara.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaras.toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
				this.tipoteclamascara.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoteclamascara)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoTeclaMascaraModel) this.jTableDatosTipoTeclaMascara.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoTeclaMascara=true;
				this.inicializarActualizarBindingTablaTipoTeclaMascara(false);
				this.isEsNuevoTipoTeclaMascara=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoTeclaMascara(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoTeclaMascara(false);
				
				this.habilitarDeshabilitarControlesTipoTeclaMascara(false);
				
				
				
				if(TipoTeclaMascaraJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoTeclaMascara();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoTeclaMascaraActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoTeclaMascara.getRowCount()>=1) {
				jTableDatosTipoTeclaMascara.removeRowSelectionInterval(0, jTableDatosTipoTeclaMascara.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoTeclaMascara(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoTeclaMascara(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoTeclaMascara(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTeclaMascara(false) ;
			
			this.isEsNuevoTipoTeclaMascara=false;
			
			if(TipoTeclaMascaraJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoTeclaMascara();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoTeclaMascaraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoTeclaMascara(false);
				
				//SI ES MANUAL
				if(TipoTeclaMascaraJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoTeclaMascara();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoTeclaMascaraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoTeclaMascara--;			
			//TipoTeclaMascara tipoteclamascaraAux= new TipoTeclaMascara();			
			//tipoteclamascaraAux.setId(this.iIdNuevoTipoTeclaMascara);
			
			if(this.jInternalFrameDetalleFormTipoTeclaMascara==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoTeclaMascara();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoTeclaMascara(this.tipoteclamascara);
			
			this.tipoteclamascara.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoteclamascaraLogic.getTipoTeclaMascaras().add(this.tipoteclamascaraAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoteclamascaras.add(this.tipoteclamascaraAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoTeclaMascara(false);
			
			this.jTableDatosTipoTeclaMascara.setRowSelectionInterval(this.getIndiceNuevoTipoTeclaMascara(), this.getIndiceNuevoTipoTeclaMascara());
			
			int iLastRow =  this.jTableDatosTipoTeclaMascara.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoTeclaMascara.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoTeclaMascara.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoTeclaMascara(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoTeclaMascaraActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoTeclaMascara(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTeclaMascara(false);
			
			//SI ES MANUAL
			if(TipoTeclaMascaraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoTeclaMascara();
			}
			
			//this.abrirFrameTreeTipoTeclaMascara();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoTeclaMascaraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Tecla MascaraS ?", "MANTENIMIENTO DE Tipo Tecla Mascara", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoTeclaMascara.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoTeclaMascara();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoteclamascaraReturnGeneral=tipoteclamascaraLogic.procesarImportacionTipoTeclaMascarasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoteclamascaraParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoTeclaMascaraReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoTeclaMascaraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoTeclaMascara.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoTeclaMascara.setFileImportacion(this.jInternalFrameImportacionTipoTeclaMascara.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoTeclaMascara.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoTeclaMascara.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoTeclaMascara.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoTeclaMascara.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoTeclaMascaraActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoTeclaMascara> tipoteclamascarasSeleccionados=new ArrayList<TipoTeclaMascara>();		

		tipoteclamascarasSeleccionados=this.getTipoTeclaMascarasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoTeclaMascaraBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoTeclaMascaraBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoTeclaMascaras("Todos",tipoteclamascarasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Tecla Mascara",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoTeclaMascaraConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoTeclaMascaraConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoTeclaMascaraConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoTeclaMascaraConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoTeclaMascaraConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoTeclaMascaraConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoTeclaMascaraConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoTeclaMascaraConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoTeclaMascaraActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoTeclaMascara> tipoteclamascarasSeleccionados=new ArrayList<TipoTeclaMascara>();		
		
		tipoteclamascarasSeleccionados=this.getTipoTeclaMascarasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoteclamascara";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoTeclaMascaras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoTeclaMascaraConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoTeclaMascaraConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoTeclaMascara tipoteclamascara:tipoteclamascarasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoteclamascara.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoTeclaMascaraConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoTeclaMascaraConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoTeclaMascara tipoteclamascara:tipoteclamascarasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoteclamascara.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoTeclaMascara(row);				
			//	iRow++;
			//}				
			
			//for(TipoTeclaMascara tipoteclamascaraAux:tipoteclamascarasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoTeclaMascara(tipoteclamascaraAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Tecla Mascara",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoteclamascaraLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTeclaMascara(false);
			
			//SI ES MANUAL
			if(TipoTeclaMascaraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoTeclaMascara();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoTeclaMascaraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTeclaMascara(false);
			
			//SI ES MANUAL
			if(TipoTeclaMascaraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoTeclaMascara();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoTeclaMascaraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTeclaMascara(false);
			
			//SI ES MANUAL
			if(TipoTeclaMascaraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoTeclaMascara();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoteclamascaraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoTeclaMascara() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoTeclaMascara.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoTeclaMascara.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoTeclaMascara.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoTeclaMascara.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoTeclaMascara.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoTeclaMascara.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoTeclaMascara.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoTeclaMascara(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoTeclaMascara(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoTeclaMascara(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoTeclaMascara(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoTeclaMascara(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoTeclaMascara(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoTeclaMascara(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoTeclaMascara(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoTeclaMascaraJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoTeclaMascaraJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoTeclaMascara() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoTeclaMascara();
		
		this.inicializarActualizarBindingBotonesManualTipoTeclaMascara(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoTeclaMascara();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoTeclaMascara() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoTeclaMascara(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoTeclaMascara(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoTeclaMascara.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoTeclaMascara.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoTeclaMascara.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoTeclaMascara.jCheckBoxPostAccionNuevoTipoTeclaMascara.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoTeclaMascara.jCheckBoxPostAccionSinCerrarTipoTeclaMascara.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoTeclaMascara.jCheckBoxPostAccionSinMensajeTipoTeclaMascara.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoTeclaMascara.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoTeclaMascara.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoTeclaMascara.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) {
				this.jInternalFrameDetalleFormTipoTeclaMascara.jCheckBoxPostAccionNuevoTipoTeclaMascara.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoTeclaMascara.jCheckBoxPostAccionSinCerrarTipoTeclaMascara.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoTeclaMascara.jCheckBoxPostAccionSinMensajeTipoTeclaMascara.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoTeclaMascara.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoTeclaMascara.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoTeclaMascara.jComboBoxTiposAccionesFormularioTipoTeclaMascara.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoTeclaMascara.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoTeclaMascara!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoTeclaMascara.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoTeclaMascara.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoTeclaMascara.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoTeclaMascara.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoTeclaMascara!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoTeclaMascara.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoTeclaMascara.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoTeclaMascara(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoTeclaMascaraJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoTeclaMascara(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoTeclaMascara() throws Exception {
		try	{
			if(TipoTeclaMascaraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoTeclaMascara();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoTeclaMascara() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoTeclaMascara.jComboBoxTiposAccionesFormularioTipoTeclaMascara.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoTeclaMascara.jComboBoxTiposAccionesFormularioTipoTeclaMascara.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoTeclaMascara() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoTeclaMascara.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoTeclaMascara.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoTeclaMascara.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoTeclaMascara.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoTeclaMascara.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoTeclaMascara.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoTeclaMascara.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoTeclaMascara.addItem(reporte);
			}
			
			
			if(!this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoTeclaMascara.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoTeclaMascara.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoTeclaMascara.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoTeclaMascara.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoTeclaMascara.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoTeclaMascara.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoTeclaMascara.jComboBoxTiposAccionesFormularioTipoTeclaMascara.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoTeclaMascara.jComboBoxTiposAccionesFormularioTipoTeclaMascara.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoTeclaMascara.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoTeclaMascara.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoTeclaMascara.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoTeclaMascara();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoTeclaMascara() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoTeclaMascara!=null) {
				this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoTeclaMascara!=null) {
				this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoTeclaMascara!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoTeclaMascara()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoTeclaMascara(Boolean esInicializar) throws Exception {				
		if(TipoTeclaMascaraJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoTeclaMascara();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoTeclaMascara() throws Exception {
		this.inicializarActualizarBindingTablaTipoTeclaMascara(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoTeclaMascara() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoTeclaMascara.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoTeclaMascara.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoTeclaMascara.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoTeclaMascaraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoTeclaMascara.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoTeclaMascara.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoTeclaMascaraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoTeclaMascaraOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTeclaMascaraOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoTeclaMascaraPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoTeclaMascara.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoTeclaMascara.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoTeclaMascaraPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoTeclaMascara.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoTeclaMascara(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoteclamascaraLogic.getTipoTeclaMascaras().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoteclamascaras.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoTeclaMascaraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoTeclaMascara.setModel(new TipoTeclaMascaraModel(this.tipoteclamascaraLogic.getTipoTeclaMascaras(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoTeclaMascara.setModel(new TipoTeclaMascaraModel(this.tipoteclamascaras,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoTeclaMascara!=null && this.jInternalFrameOrderByTipoTeclaMascara.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoTeclaMascara();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoTeclaMascara.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTeclaMascara,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoTeclaMascaraPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO,tipoteclamascaraConstantesFunciones.resaltarSeleccionarTipoTeclaMascara,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO,tipoteclamascaraConstantesFunciones.resaltarSeleccionarTipoTeclaMascara,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoTeclaMascara.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTeclaMascara,TipoTeclaMascaraConstantesFunciones.LABEL_ID));

		if(this.tipoteclamascaraConstantesFunciones.mostraridTipoTeclaMascara && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTeclaMascaraConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoteclamascaraConstantesFunciones.resaltaridTipoTeclaMascara,this.tipoteclamascaraConstantesFunciones.activaridTipoTeclaMascara,this,true,"idTipoTeclaMascara","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoteclamascaraConstantesFunciones.resaltaridTipoTeclaMascara,this.tipoteclamascaraConstantesFunciones.activaridTipoTeclaMascara,this,true,"idTipoTeclaMascara","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoTeclaMascara.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTeclaMascara,TipoTeclaMascaraConstantesFunciones.LABEL_CODIGO));

		if(this.tipoteclamascaraConstantesFunciones.mostrarcodigoTipoTeclaMascara && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTeclaMascaraConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoteclamascaraConstantesFunciones.resaltarcodigoTipoTeclaMascara,this.tipoteclamascaraConstantesFunciones.activarcodigoTipoTeclaMascara,this,true,"codigoTipoTeclaMascara","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoteclamascaraConstantesFunciones.resaltarcodigoTipoTeclaMascara,this.tipoteclamascaraConstantesFunciones.activarcodigoTipoTeclaMascara,this,true,"codigoTipoTeclaMascara","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoTeclaMascaraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoTeclaMascara.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTeclaMascara,TipoTeclaMascaraConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoteclamascaraConstantesFunciones.mostrarnombreTipoTeclaMascara && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTeclaMascaraConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoteclamascaraConstantesFunciones.resaltarnombreTipoTeclaMascara,this.tipoteclamascaraConstantesFunciones.activarnombreTipoTeclaMascara,this,true,"nombreTipoTeclaMascara","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoteclamascaraConstantesFunciones.resaltarnombreTipoTeclaMascara,this.tipoteclamascaraConstantesFunciones.activarnombreTipoTeclaMascara,this,true,"nombreTipoTeclaMascara","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoTeclaMascaraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoTeclaMascara.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoTeclaMascara.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoTeclaMascara && this.isPermisoGuardarCambiosTipoTeclaMascara) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoTeclaMascara.addColumn(tableColumn);
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
			
			this.jTableDatosTipoTeclaMascara.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoTeclaMascara && this.isPermisoGuardarCambiosTipoTeclaMascara) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoTeclaMascara && this.isPermisoGuardarCambiosTipoTeclaMascara) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoTeclaMascara.moveColumn(this.jTableDatosTipoTeclaMascara.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoTeclaMascara.moveColumn(this.jTableDatosTipoTeclaMascara.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoTeclaMascara.moveColumn(this.jTableDatosTipoTeclaMascara.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoTeclaMascara.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoTeclaMascara.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoTeclaMascara,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoTeclaMascaraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoTeclaMascara.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoTeclaMascara.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoTeclaMascaraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoTeclaMascaraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoTeclaMascara.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoTeclaMascara.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoTeclaMascara.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoteclamascaraLogic.getTipoTeclaMascaras().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoteclamascaras.size()-1;
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
		//this.jTableDatosTipoTeclaMascara.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoTeclaMascara.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoTeclaMascara();
			
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
				
				//this.isEsNuevoTipoTeclaMascara=false;
					
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
			
				if(this.tipoteclamascaraSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoTeclaMascara==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoTeclaMascara.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoTeclaMascara.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaras.toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoteclamascara.getsType().equals("DUPLICADO")
				   || this.tipoteclamascara.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoTeclaMascara=true;
				
				} else {
					this.isEsNuevoTipoTeclaMascara=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoteclamascara.getId()>=0 && !this.tipoteclamascara.getIsNew()) {						
						this.isEsNuevoTipoTeclaMascara=false;
						
					} else {
						this.isEsNuevoTipoTeclaMascara=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoTeclaMascara(esRelaciones);						
				
				this.seleccionarTipoTeclaMascara(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoteclamascara.getId()<0) {
					this.isEsNuevoTipoTeclaMascara=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoTeclaMascara(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoTeclaMascara(evt,rowIndex);
				}	
				
				if(this.tipoteclamascaraSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoTeclaMascara: " + this.dDif); 
					}
				}								
				
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoTeclaMascara(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoteclamascara)) {
					if(this.tipoteclamascara.getId()>0) {
						this.tipoteclamascara.setIsDeleted(true);
						
						this.tipoteclamascarasEliminados.add(this.tipoteclamascara);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoteclamascaraLogic.getTipoTeclaMascaras().remove(this.tipoteclamascara);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoteclamascaras.remove(this.tipoteclamascara);				
					}
					
					
					((TipoTeclaMascaraModel) this.jTableDatosTipoTeclaMascara.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoTeclaMascara(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoTeclaMascara(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoTeclaMascara) {
			
			if(this.jInternalFrameDetalleFormTipoTeclaMascara==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoTeclaMascara.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoTeclaMascara.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaras.toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoTeclaMascaraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoTeclaMascara(this.tipoteclamascara);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoTeclaMascara("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoTeclaMascara(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoTeclaMascara() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoTeclaMascara(TipoTeclaMascara tipoteclamascara) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoTeclaMascara(tipoteclamascara,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoTeclaMascara(TipoTeclaMascara tipoteclamascara,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoTeclaMascara(tipoteclamascara);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoTeclaMascara(tipoteclamascara,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoTeclaMascara(tipoteclamascara);
	}
	
	public void setVariablesObjetoActualToFormularioTipoTeclaMascara(TipoTeclaMascara tipoteclamascara) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoTeclaMascara==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoTeclaMascara.jTextFieldidTipoTeclaMascara.setText(tipoteclamascara.getId().toString());
			this.jInternalFrameDetalleFormTipoTeclaMascara.jTextFieldcodigoTipoTeclaMascara.setText(tipoteclamascara.getcodigo());
			this.jInternalFrameDetalleFormTipoTeclaMascara.jTextAreanombreTipoTeclaMascara.setText(tipoteclamascara.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoTeclaMascara tipoteclamascaraLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoteclamascaraLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoTeclaMascara tipoteclamascaraLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoteclamascaraLocal=this.tipoteclamascara;
			} else {
				tipoteclamascaraLocal=this.tipoteclamascaraAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoteclamascaraLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoTeclaMascara(tipoteclamascaraLocal,true);
					
					if(tipoteclamascaraSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoteclamascaraLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoteclamascaraLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoTeclaMascara(TipoTeclaMascara tipoteclamascara,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoTeclaMascara(tipoteclamascara,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoTeclaMascara(tipoteclamascara);
	}
	
	public void setVariablesFormularioToObjetoActualTipoTeclaMascara(TipoTeclaMascara tipoteclamascara,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoTeclaMascara(tipoteclamascara,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoTeclaMascara(TipoTeclaMascara tipoteclamascara,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoTeclaMascara==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoTeclaMascara.jTextFieldidTipoTeclaMascara.getText()==null || this.jInternalFrameDetalleFormTipoTeclaMascara.jTextFieldidTipoTeclaMascara.getText()=="" || this.jInternalFrameDetalleFormTipoTeclaMascara.jTextFieldidTipoTeclaMascara.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoTeclaMascara.jTextFieldidTipoTeclaMascara.setText("0");
			}

			if(conColumnasBase) {tipoteclamascara.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoTeclaMascara.jTextFieldidTipoTeclaMascara.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoTeclaMascaraConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTeclaMascara.jLabelIdTipoTeclaMascara,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoteclamascara.setcodigo(this.jInternalFrameDetalleFormTipoTeclaMascara.jTextFieldcodigoTipoTeclaMascara.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoTeclaMascaraConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTeclaMascara.jLabelcodigoTipoTeclaMascara,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoteclamascara.setnombre(this.jInternalFrameDetalleFormTipoTeclaMascara.jTextAreanombreTipoTeclaMascara.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoTeclaMascaraConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTeclaMascara.jLabelnombreTipoTeclaMascara,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoTeclaMascara(TipoTeclaMascara tipoteclamascaraBean,TipoTeclaMascara tipoteclamascara,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoTeclaMascara(TipoTeclaMascara tipoteclamascaraOrigen,TipoTeclaMascara tipoteclamascara,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoteclamascaraOrigen.getId()!=null && !tipoteclamascaraOrigen.getId().equals(0L))) {tipoteclamascara.setId(tipoteclamascaraOrigen.getId());}}
			if(conDefault || (!conDefault && tipoteclamascaraOrigen.getcodigo()!=null && !tipoteclamascaraOrigen.getcodigo().equals(""))) {tipoteclamascara.setcodigo(tipoteclamascaraOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoteclamascaraOrigen.getnombre()!=null && !tipoteclamascaraOrigen.getnombre().equals(""))) {tipoteclamascara.setnombre(tipoteclamascaraOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoTeclaMascara(TipoTeclaMascara tipoteclamascara) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoTeclaMascara.jTextFieldidTipoTeclaMascara.setText(tipoteclamascara.getId().toString());
			this.jInternalFrameDetalleFormTipoTeclaMascara.jTextFieldcodigoTipoTeclaMascara.setText(tipoteclamascara.getcodigo());
			this.jInternalFrameDetalleFormTipoTeclaMascara.jTextAreanombreTipoTeclaMascara.setText(tipoteclamascara.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoTeclaMascara(TipoTeclaMascaraBean tipoteclamascaraBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoTeclaMascara.jTextFieldidTipoTeclaMascara.setText(tipoteclamascaraBean.getId().toString());
			this.jInternalFrameDetalleFormTipoTeclaMascara.jTextFieldcodigoTipoTeclaMascara.setText(tipoteclamascaraBean.getcodigo());
			this.jInternalFrameDetalleFormTipoTeclaMascara.jTextAreanombreTipoTeclaMascara.setText(tipoteclamascaraBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoTeclaMascara(TipoTeclaMascaraParameterReturnGeneral tipoteclamascaraReturnGeneral,TipoTeclaMascaraBean tipoteclamascaraBean,Boolean conDefault) throws Exception { 
		try {
			TipoTeclaMascara tipoteclamascaraLocal=new TipoTeclaMascara();
			
			tipoteclamascaraLocal=tipoteclamascaraReturnGeneral.getTipoTeclaMascara();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoteclamascaraLocal.getId()!=null && !tipoteclamascaraLocal.getId().equals(0L))) {tipoteclamascaraBean.setId(tipoteclamascaraLocal.getId());}}
			if(conDefault || (!conDefault && tipoteclamascaraLocal.getcodigo()!=null && !tipoteclamascaraLocal.getcodigo().equals(""))) {tipoteclamascaraBean.setcodigo(tipoteclamascaraLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoteclamascaraLocal.getnombre()!=null && !tipoteclamascaraLocal.getnombre().equals(""))) {tipoteclamascaraBean.setnombre(tipoteclamascaraLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoTeclaMascaraGenerico(Long idTipoTeclaMascaraSeleccionado,JComboBox jComboBoxTipoTeclaMascara,List<TipoTeclaMascara> tipoteclamascarasLocal)throws Exception {
		try {
			TipoTeclaMascara  tipoteclamascaraTemp=null;

			for(TipoTeclaMascara tipoteclamascaraAux:tipoteclamascarasLocal) {
				if(tipoteclamascaraAux.getId()!=null && tipoteclamascaraAux.getId().equals(idTipoTeclaMascaraSeleccionado)) {
					tipoteclamascaraTemp=tipoteclamascaraAux;
					break;
				}
			}

			jComboBoxTipoTeclaMascara.setSelectedItem(tipoteclamascaraTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoTeclaMascaraGenerico(JComboBox jComboBoxTipoTeclaMascara,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoTeclaMascara.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoTeclaMascara.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoTeclaMascara.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoTeclaMascara.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoTeclaMascara.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoTeclaMascara.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoTeclaMascara.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoTeclaMascara.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoTeclaMascara.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoTeclaMascara.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoteclamascara=(TipoTeclaMascara) tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoteclamascara =(TipoTeclaMascara) tipoteclamascaras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoTeclaMascara tipoteclamascaraRow=new TipoTeclaMascara();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoteclamascaraRow=(TipoTeclaMascara) tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoteclamascaraRow=(TipoTeclaMascara) tipoteclamascaras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoTeclaMascara(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoTeclaMascara.setVisible((this.isVisibilidadCeldaNuevoTipoTeclaMascara && this.isPermisoNuevoTipoTeclaMascara));			
			this.jButtonDuplicarTipoTeclaMascara.setVisible((this.isVisibilidadCeldaDuplicarTipoTeclaMascara && this.isPermisoDuplicarTipoTeclaMascara));			
			this.jButtonCopiarTipoTeclaMascara.setVisible((this.isVisibilidadCeldaCopiarTipoTeclaMascara && this.isPermisoCopiarTipoTeclaMascara));
			this.jButtonVerFormTipoTeclaMascara.setVisible((this.isVisibilidadCeldaVerFormTipoTeclaMascara && this.isPermisoVerFormTipoTeclaMascara));
			
			this.jButtonAbrirOrderByTipoTeclaMascara.setVisible((this.isVisibilidadCeldaOrdenTipoTeclaMascara && this.isPermisoOrdenTipoTeclaMascara));			
			
			this.jButtonNuevoRelacionesTipoTeclaMascara.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoTeclaMascara && this.isPermisoNuevoTipoTeclaMascara));			
			this.jButtonNuevoGuardarCambiosTipoTeclaMascara.setVisible((this.isVisibilidadCeldaNuevoTipoTeclaMascara && this.isPermisoNuevoTipoTeclaMascara && this.isPermisoGuardarCambiosTipoTeclaMascara));
			
			if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) {
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonModificarTipoTeclaMascara.setVisible((this.isVisibilidadCeldaModificarTipoTeclaMascara && this.isPermisoActualizarTipoTeclaMascara));	
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonActualizarTipoTeclaMascara.setVisible((this.isVisibilidadCeldaActualizarTipoTeclaMascara && this.isPermisoActualizarTipoTeclaMascara));	
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonEliminarTipoTeclaMascara.setVisible((this.isVisibilidadCeldaEliminarTipoTeclaMascara && this.isPermisoEliminarTipoTeclaMascara));
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonCancelarTipoTeclaMascara.setVisible(this.isVisibilidadCeldaCancelarTipoTeclaMascara);							
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonGuardarCambiosTipoTeclaMascara.setVisible((this.isVisibilidadCeldaGuardarTipoTeclaMascara && this.isPermisoGuardarCambiosTipoTeclaMascara));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoTeclaMascara.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoTeclaMascara && this.isPermisoGuardarCambiosTipoTeclaMascara));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoTeclaMascara.setVisible((this.isVisibilidadCeldaNuevoTipoTeclaMascara && this.isPermisoNuevoTipoTeclaMascara));						
			this.jButtonDuplicarToolBarTipoTeclaMascara.setVisible((this.isVisibilidadCeldaDuplicarTipoTeclaMascara && this.isPermisoDuplicarTipoTeclaMascara));						
			this.jButtonCopiarToolBarTipoTeclaMascara.setVisible((this.isVisibilidadCeldaCopiarTipoTeclaMascara && this.isPermisoCopiarTipoTeclaMascara));			
			this.jButtonVerFormToolBarTipoTeclaMascara.setVisible((this.isVisibilidadCeldaVerFormTipoTeclaMascara && this.isPermisoVerFormTipoTeclaMascara));			
			this.jButtonAbrirOrderByToolBarTipoTeclaMascara.setVisible((this.isVisibilidadCeldaOrdenTipoTeclaMascara && this.isPermisoOrdenTipoTeclaMascara));
			this.jButtonNuevoRelacionesToolBarTipoTeclaMascara.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoTeclaMascara && this.isPermisoNuevoTipoTeclaMascara));			
			this.jButtonNuevoGuardarCambiosToolBarTipoTeclaMascara.setVisible((this.isVisibilidadCeldaNuevoTipoTeclaMascara && this.isPermisoNuevoTipoTeclaMascara && this.isPermisoGuardarCambiosTipoTeclaMascara));			
			
			if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) {
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonModificarToolBarTipoTeclaMascara.setVisible((this.isVisibilidadCeldaModificarTipoTeclaMascara && this.isPermisoActualizarTipoTeclaMascara));	
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonActualizarToolBarTipoTeclaMascara.setVisible((this.isVisibilidadCeldaActualizarTipoTeclaMascara  && this.isPermisoActualizarTipoTeclaMascara));	
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonEliminarToolBarTipoTeclaMascara.setVisible((this.isVisibilidadCeldaEliminarTipoTeclaMascara && this.isPermisoEliminarTipoTeclaMascara));
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonCancelarToolBarTipoTeclaMascara.setVisible(this.isVisibilidadCeldaCancelarTipoTeclaMascara);				
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonGuardarCambiosToolBarTipoTeclaMascara.setVisible((this.isVisibilidadCeldaGuardarTipoTeclaMascara && this.isPermisoGuardarCambiosTipoTeclaMascara));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoTeclaMascara.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoTeclaMascara && this.isPermisoGuardarCambiosTipoTeclaMascara));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoTeclaMascara.setVisible((this.isVisibilidadCeldaNuevoTipoTeclaMascara && this.isPermisoNuevoTipoTeclaMascara));			
			this.jMenuItemDuplicarTipoTeclaMascara.setVisible((this.isVisibilidadCeldaDuplicarTipoTeclaMascara && this.isPermisoDuplicarTipoTeclaMascara));			
			this.jMenuItemCopiarTipoTeclaMascara.setVisible((this.isVisibilidadCeldaCopiarTipoTeclaMascara && this.isPermisoCopiarTipoTeclaMascara));			
			this.jMenuItemVerFormTipoTeclaMascara.setVisible((this.isVisibilidadCeldaVerFormTipoTeclaMascara && this.isPermisoVerFormTipoTeclaMascara));			
			this.jMenuItemAbrirOrderByTipoTeclaMascara.setVisible((this.isVisibilidadCeldaOrdenTipoTeclaMascara && this.isPermisoOrdenTipoTeclaMascara));			
			//this.jMenuItemMostrarOcultarTipoTeclaMascara.setVisible((this.isVisibilidadCeldaOrdenTipoTeclaMascara && this.isPermisoOrdenTipoTeclaMascara));
			this.jMenuItemDetalleAbrirOrderByTipoTeclaMascara.setVisible((this.isVisibilidadCeldaOrdenTipoTeclaMascara && this.isPermisoOrdenTipoTeclaMascara));			
			//this.jMenuItemDetalleMostrarOcultarTipoTeclaMascara.setVisible((this.isVisibilidadCeldaOrdenTipoTeclaMascara && this.isPermisoOrdenTipoTeclaMascara));			
			this.jMenuItemNuevoRelacionesTipoTeclaMascara.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoTeclaMascara && this.isPermisoNuevoTipoTeclaMascara));			
			this.jMenuItemNuevoGuardarCambiosTipoTeclaMascara.setVisible((this.isVisibilidadCeldaNuevoTipoTeclaMascara && this.isPermisoNuevoTipoTeclaMascara && this.isPermisoGuardarCambiosTipoTeclaMascara));									
			
			if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) {
			this.jInternalFrameDetalleFormTipoTeclaMascara.jMenuItemModificarTipoTeclaMascara.setVisible((this.isVisibilidadCeldaModificarTipoTeclaMascara && this.isPermisoActualizarTipoTeclaMascara));	
			this.jInternalFrameDetalleFormTipoTeclaMascara.jMenuItemActualizarTipoTeclaMascara.setVisible((this.isVisibilidadCeldaActualizarTipoTeclaMascara && this.isPermisoActualizarTipoTeclaMascara));	
			this.jInternalFrameDetalleFormTipoTeclaMascara.jMenuItemEliminarTipoTeclaMascara.setVisible((this.isVisibilidadCeldaEliminarTipoTeclaMascara && this.isPermisoEliminarTipoTeclaMascara));
			this.jInternalFrameDetalleFormTipoTeclaMascara.jMenuItemCancelarTipoTeclaMascara.setVisible(this.isVisibilidadCeldaCancelarTipoTeclaMascara);				
			}
			
			this.jMenuItemGuardarCambiosTipoTeclaMascara.setVisible((this.isVisibilidadCeldaGuardarTipoTeclaMascara && this.isPermisoGuardarCambiosTipoTeclaMascara));						
			this.jMenuItemGuardarCambiosTablaTipoTeclaMascara.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoTeclaMascara && this.isPermisoGuardarCambiosTipoTeclaMascara));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoTeclaMascara=this.jButtonNuevoTipoTeclaMascara.isVisible();
			this.isVisibilidadCeldaDuplicarTipoTeclaMascara=this.jButtonDuplicarTipoTeclaMascara.isVisible();
			this.isVisibilidadCeldaCopiarTipoTeclaMascara=this.jButtonCopiarTipoTeclaMascara.isVisible();
			this.isVisibilidadCeldaVerFormTipoTeclaMascara=this.jButtonVerFormTipoTeclaMascara.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoTeclaMascara=this.jButtonAbrirOrderByTipoTeclaMascara.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoTeclaMascara=this.jButtonNuevoRelacionesTipoTeclaMascara.isVisible();
			this.isVisibilidadCeldaModificarTipoTeclaMascara=this.jButtonModificarTipoTeclaMascara.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) {
			this.isVisibilidadCeldaActualizarTipoTeclaMascara=this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonActualizarTipoTeclaMascara.isVisible();
			this.isVisibilidadCeldaEliminarTipoTeclaMascara=this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonEliminarTipoTeclaMascara.isVisible();
			this.isVisibilidadCeldaCancelarTipoTeclaMascara=this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonCancelarTipoTeclaMascara.isVisible();
			this.isVisibilidadCeldaGuardarTipoTeclaMascara=this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonGuardarCambiosTipoTeclaMascara.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoTeclaMascara=this.jButtonGuardarCambiosTablaTipoTeclaMascara.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoTeclaMascara=this.jButtonNuevoToolBarTipoTeclaMascara.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoTeclaMascara=this.jButtonNuevoRelacionesToolBarTipoTeclaMascara.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) {
			this.isVisibilidadCeldaModificarTipoTeclaMascara=this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonModificarToolBarTipoTeclaMascara.isVisible();
			this.isVisibilidadCeldaActualizarTipoTeclaMascara=this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonActualizarToolBarTipoTeclaMascara.isVisible();
			this.isVisibilidadCeldaEliminarTipoTeclaMascara=this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonEliminarToolBarTipoTeclaMascara.isVisible();
			this.isVisibilidadCeldaCancelarTipoTeclaMascara=this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonCancelarToolBarTipoTeclaMascara.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoTeclaMascara=this.jButtonGuardarCambiosToolBarTipoTeclaMascara.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoTeclaMascara=this.jButtonGuardarCambiosTablaToolBarTipoTeclaMascara.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoTeclaMascara=this.jMenuItemNuevoTipoTeclaMascara.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoTeclaMascara=this.jMenuItemNuevoRelacionesTipoTeclaMascara.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) {
			this.isVisibilidadCeldaModificarTipoTeclaMascara=this.jInternalFrameDetalleFormTipoTeclaMascara.jMenuItemModificarTipoTeclaMascara.isVisible();
			this.isVisibilidadCeldaActualizarTipoTeclaMascara=this.jInternalFrameDetalleFormTipoTeclaMascara.jMenuItemActualizarTipoTeclaMascara.isVisible();
			this.isVisibilidadCeldaEliminarTipoTeclaMascara=this.jInternalFrameDetalleFormTipoTeclaMascara.jMenuItemEliminarTipoTeclaMascara.isVisible();
			this.isVisibilidadCeldaCancelarTipoTeclaMascara=this.jInternalFrameDetalleFormTipoTeclaMascara.jMenuItemCancelarTipoTeclaMascara.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoTeclaMascara=this.jMenuItemGuardarCambiosTipoTeclaMascara.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoTeclaMascara=this.jMenuItemGuardarCambiosTablaTipoTeclaMascara.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoTeclaMascara(Boolean esInicializar) {
		if(TipoTeclaMascaraJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoteclamascaraSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoTeclaMascara();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoTeclaMascara(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoTeclaMascara() {
		this.jButtonNuevoTipoTeclaMascara.setVisible(this.isPermisoNuevoTipoTeclaMascara);			
		this.jButtonDuplicarTipoTeclaMascara.setVisible(this.isPermisoDuplicarTipoTeclaMascara);			
		this.jButtonCopiarTipoTeclaMascara.setVisible(this.isPermisoCopiarTipoTeclaMascara);			
		this.jButtonVerFormTipoTeclaMascara.setVisible(this.isPermisoVerFormTipoTeclaMascara);			
		
		this.jButtonAbrirOrderByTipoTeclaMascara.setVisible(this.isPermisoOrdenTipoTeclaMascara);					
		
		this.jButtonNuevoRelacionesTipoTeclaMascara.setVisible(this.isPermisoNuevoTipoTeclaMascara);			
		
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonModificarTipoTeclaMascara.setVisible(this.isPermisoActualizarTipoTeclaMascara);	
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonActualizarTipoTeclaMascara.setVisible(this.isPermisoActualizarTipoTeclaMascara);	
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonEliminarTipoTeclaMascara.setVisible(this.isPermisoEliminarTipoTeclaMascara);
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonCancelarTipoTeclaMascara.setVisible(this.isVisibilidadCeldaCancelarTipoTeclaMascara);						
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonGuardarCambiosTipoTeclaMascara.setVisible(this.isPermisoGuardarCambiosTipoTeclaMascara);							
		}
		
		this.jButtonGuardarCambiosTablaTipoTeclaMascara.setVisible(this.isPermisoActualizarTipoTeclaMascara);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoTeclaMascara() {
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonModificarTipoTeclaMascara.setVisible(this.isPermisoActualizarTipoTeclaMascara);	
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonActualizarTipoTeclaMascara.setVisible(this.isPermisoActualizarTipoTeclaMascara);	
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonEliminarTipoTeclaMascara.setVisible(this.isPermisoEliminarTipoTeclaMascara);
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonCancelarTipoTeclaMascara.setVisible(this.isVisibilidadCeldaCancelarTipoTeclaMascara);							
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonGuardarCambiosTipoTeclaMascara.setVisible((this.isVisibilidadCeldaGuardarTipoTeclaMascara && this.isPermisoGuardarCambiosTipoTeclaMascara));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoTeclaMascara() {
		if(TipoTeclaMascaraJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoTeclaMascara();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoTeclaMascara() {
	}
	
	public void jTableDatosTipoTeclaMascaraListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoTeclaMascara(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoTeclaMascaraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoteclamascaraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTeclaMascara.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTeclaMascara(this.gettipoteclamascara(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTeclaMascara(this.tipoteclamascara);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaras.toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoteclamascara==null) {
						this.tipoteclamascara = new TipoTeclaMascara();
					}

					this.setVariablesFormularioToObjetoActualTipoTeclaMascara(this.tipoteclamascara,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTeclaMascara(this.tipoteclamascara);
				}

				if(this.tipoteclamascara.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoteclamascara.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTeclaMascara(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoteclamascaraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoteclamascaraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoteclamascaraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoTeclaMascaraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoteclamascaraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTeclaMascara.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTeclaMascara(this.gettipoteclamascara(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTeclaMascara(this.tipoteclamascara);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaras.toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoteclamascara==null) {
						this.tipoteclamascara = new TipoTeclaMascara();
					}

					this.setVariablesFormularioToObjetoActualTipoTeclaMascara(this.tipoteclamascara,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTeclaMascara(this.tipoteclamascara);
				}

				if(this.tipoteclamascara.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoteclamascara.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTeclaMascara(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoteclamascaraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoteclamascaraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoteclamascaraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoTeclaMascaraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoteclamascaraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTeclaMascara.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTeclaMascara(this.gettipoteclamascara(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTeclaMascara(this.tipoteclamascara);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaras.toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoteclamascara==null) {
						this.tipoteclamascara = new TipoTeclaMascara();
					}

					this.setVariablesFormularioToObjetoActualTipoTeclaMascara(this.tipoteclamascara,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTeclaMascara(this.tipoteclamascara);
				}

				if(this.tipoteclamascara.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoteclamascara.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTeclaMascara(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoteclamascaraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoteclamascaraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoteclamascaraLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoTeclaMascara() {
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) {
			this.jInternalFrameDetalleFormTipoTeclaMascara.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoTeclaMascara.dispose();
			this.jInternalFrameDetalleFormTipoTeclaMascara=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoTeclaMascara!=null) {
			this.jInternalFrameReporteDinamicoTipoTeclaMascara.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoTeclaMascara.dispose();
			this.jInternalFrameReporteDinamicoTipoTeclaMascara=null;
		}
		
		if(this.jInternalFrameImportacionTipoTeclaMascara!=null) {
			this.jInternalFrameImportacionTipoTeclaMascara.setVisible(false);	    			
			this.jInternalFrameImportacionTipoTeclaMascara.dispose();
			this.jInternalFrameImportacionTipoTeclaMascara=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoTeclaMascara();
			
			TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoTeclaMascara")) {
				jButtonNuevoTipoTeclaMascaraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoTeclaMascara")) {
				jButtonDuplicarTipoTeclaMascaraActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoTeclaMascara")) {
				jButtonCopiarTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoTeclaMascara")) {
				jButtonVerFormTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoTeclaMascara")) {
				jButtonNuevoTipoTeclaMascaraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoTeclaMascara")) {
				jButtonDuplicarTipoTeclaMascaraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoTeclaMascara")) {
				jButtonNuevoTipoTeclaMascaraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoTeclaMascara")) {
				jButtonDuplicarTipoTeclaMascaraActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoTeclaMascara")) {
				jButtonNuevoTipoTeclaMascaraActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoTeclaMascara")) {
				jButtonNuevoTipoTeclaMascaraActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoTeclaMascara")) {
				jButtonNuevoTipoTeclaMascaraActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoTeclaMascara")) {
				jButtonModificarTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoTeclaMascara")) {
				jButtonModificarTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoTeclaMascara")) {
				jButtonModificarTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoTeclaMascara")) {
				jButtonActualizarTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoTeclaMascara")) {
				jButtonActualizarTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoTeclaMascara")) {
				jButtonActualizarTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoTeclaMascara")) {
				jButtonEliminarTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoTeclaMascara")) {
				jButtonEliminarTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoTeclaMascara")) {
				jButtonEliminarTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoTeclaMascara")) {
				jButtonCancelarTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoTeclaMascara")) {
				jButtonCancelarTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoTeclaMascara")) {
				jButtonCancelarTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoTeclaMascara")) {
				jButtonCerrarTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoTeclaMascara")) {
				jButtonCerrarTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoTeclaMascara")) {
				jButtonCerrarTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoTeclaMascara")) {
				jButtonMostrarOcultarTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoTeclaMascara")) {
				jButtonCancelarTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoTeclaMascara")) {
				jButtonGuardarCambiosTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoTeclaMascara")) {
				jButtonGuardarCambiosTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoTeclaMascara")) {
				jButtonCopiarTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoTeclaMascara")) {
				jButtonVerFormTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoTeclaMascara")) {
				jButtonGuardarCambiosTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoTeclaMascara")) {
				jButtonCopiarTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoTeclaMascara")) {
				jButtonVerFormTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoTeclaMascara")) {
				jButtonGuardarCambiosTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoTeclaMascara")) {
				jButtonGuardarCambiosTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoTeclaMascara")) {
				jButtonGuardarCambiosTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoTeclaMascara")) {
				jButtonRecargarInformacionTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoTeclaMascara")) {
				jButtonRecargarInformacionTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoTeclaMascara")) {
				jButtonRecargarInformacionTipoTeclaMascaraActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoTeclaMascara")) {
				jButtonAnterioresTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoTeclaMascara")) {
				jButtonAnterioresTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoTeclaMascara")) {
				jButtonAnterioresTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoTeclaMascara")) {
				jButtonSiguientesTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoTeclaMascara")) {
				jButtonSiguientesTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoTeclaMascara")) {
				jButtonSiguientesTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoTeclaMascara") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoTeclaMascara")) {
				jButtonAbrirOrderByTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoTeclaMascara") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoTeclaMascara")) {
				jButtonMostrarOcultarTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoTeclaMascara")) {
				jButtonNuevoGuardarCambiosTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoTeclaMascara")) {
				jButtonNuevoGuardarCambiosTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoTeclaMascara")) {
				jButtonNuevoGuardarCambiosTipoTeclaMascaraActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoTeclaMascara")) {
				jButtonCerrarReporteDinamicoTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoTeclaMascara")) {
				jButtonGenerarReporteDinamicoTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoTeclaMascara")) {
				
				jButtonGenerarExcelReporteDinamicoTipoTeclaMascaraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoTeclaMascara")) {
				jButtonCerrarImportacionTipoTeclaMascaraActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoTeclaMascara")) {
				
				jButtonGenerarImportacionTipoTeclaMascaraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoTeclaMascara")) {
				
				jButtonAbrirImportacionTipoTeclaMascaraActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoTeclaMascara")) {
				jComboBoxTiposAccionesTipoTeclaMascaraActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoTeclaMascara")) {
				jComboBoxTiposRelacionesTipoTeclaMascaraActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoTeclaMascara")) {
				jComboBoxTiposAccionesTipoTeclaMascaraActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoTeclaMascara")) {
				
				jComboBoxTiposSeleccionarTipoTeclaMascaraActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoTeclaMascara")) {
				jTextFieldValorCampoGeneralTipoTeclaMascaraActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoTeclaMascara")) {
				jButtonAbrirOrderByTipoTeclaMascaraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoTeclaMascara")) {
				jButtonAbrirOrderByTipoTeclaMascaraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoTeclaMascara")) {
				jButtonCerrarOrderByTipoTeclaMascaraActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoTeclaMascaraBusqueda")) {
				this.jButtonidTipoTeclaMascaraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoTeclaMascaraBusqueda")) {
				this.jButtoncodigoTipoTeclaMascaraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoTeclaMascaraBusqueda")) {
				this.jButtonnombreTipoTeclaMascaraBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoTeclaMascara();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTeclaMascaraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoteclamascara);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoteclamascara);
				
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
				
				


				
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTeclaMascara.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTeclaMascara.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoTeclaMascara tipoteclamascaraLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoteclamascaraLocal=this.tipoteclamascara;
			} else {
				tipoteclamascaraLocal=this.tipoteclamascaraAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoteclamascara);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoteclamascara);
				
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
							
				
				


				
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTeclaMascara.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTeclaMascara.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTeclaMascaraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTeclaMascara.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoteclamascaraAnterior =(TipoTeclaMascara) this.tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoteclamascaraAnterior =(TipoTeclaMascara) this.tipoteclamascaras.toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
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
			
			TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
			
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
			
			


			
			TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTeclaMascaraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoteclamascara);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoteclamascara);
				
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
								
						
				


				
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTeclaMascara.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTeclaMascara.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoteclamascara);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoteclamascara);
				
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
								
				
				


				
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTeclaMascara.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTeclaMascara.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTeclaMascaraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTeclaMascara.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoteclamascaraAnterior =(TipoTeclaMascara) this.tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoteclamascaraAnterior =(TipoTeclaMascara) this.tipoteclamascaras.toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoteclamascara);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoteclamascara);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTeclaMascaraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTeclaMascara.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoteclamascaraAnterior =(TipoTeclaMascara) this.tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoteclamascaraAnterior =(TipoTeclaMascara) this.tipoteclamascaras.toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTeclaMascaraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoteclamascara);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoteclamascara);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoteclamascara);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoteclamascara);
				
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
							
				
				


				
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTeclaMascara.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTeclaMascara.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTeclaMascaraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoTeclaMascara.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoteclamascaraAnterior =(TipoTeclaMascara) this.tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoteclamascaraAnterior =(TipoTeclaMascara) this.tipoteclamascaras.toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
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
			
			TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
			
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
			
			


			
			TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTeclaMascaraActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoteclamascara);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoteclamascara);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoteclamascara);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoteclamascara);
				
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
								
				
				


				
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTeclaMascara.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTeclaMascara.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTeclaMascaraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTeclaMascara.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoteclamascaraAnterior =(TipoTeclaMascara) this.tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoteclamascaraAnterior =(TipoTeclaMascara) this.tipoteclamascaras.toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTeclaMascaraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoteclamascara);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoteclamascara);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTeclaMascaraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoteclamascara);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoteclamascara);
				
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoTeclaMascara")) {
					jCheckBoxSeleccionarTodosTipoTeclaMascaraItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoTeclaMascara")) {
					jCheckBoxSeleccionadosTipoTeclaMascaraItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoTeclaMascara")) {
					
				}
				
				


				
				
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTeclaMascara.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTeclaMascara.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoteclamascara);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoteclamascara);
				
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
												
				
				


				
				
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTeclaMascara.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTeclaMascara.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTeclaMascaraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoTeclaMascara.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoteclamascaraAnterior =(TipoTeclaMascara) this.tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoteclamascaraAnterior =(TipoTeclaMascara) this.tipoteclamascaras.toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTeclaMascaraActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoteclamascara);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoteclamascara);
				
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
				
				
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
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
			
			TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
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
			
			


			
			TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTeclaMascaraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoteclamascara);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoteclamascara);
				
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTeclaMascara.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTeclaMascara.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoteclamascara);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoteclamascara);
				
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
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
				
				


				
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTeclaMascara.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTeclaMascara.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTeclaMascaraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTeclaMascara.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoteclamascaraAnterior =(TipoTeclaMascara) this.tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoteclamascaraAnterior =(TipoTeclaMascara) this.tipoteclamascaras.toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoTeclaMascara")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoTeclaMascaraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoTeclaMascara.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoteclamascara =(TipoTeclaMascara) this.tipoteclamascaras.toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoteclamascara);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoTeclaMascara")) {
				
				}
				
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoTeclaMascara")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoTeclaMascara.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoTeclaMascara")) {
			
			}
			
			TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoTeclaMascara();
			
			TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
			
			if(sTipo.equals("NuevoTipoTeclaMascara")) {
				jButtonNuevoTipoTeclaMascaraActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoTeclaMascara")) {
				jButtonDuplicarTipoTeclaMascaraActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoTeclaMascara")) {
				jButtonCopiarTipoTeclaMascaraActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoTeclaMascara")) {
				jButtonVerFormTipoTeclaMascaraActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoTeclaMascara")) {
				jButtonNuevoTipoTeclaMascaraActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoTeclaMascara")) {
				jButtonModificarTipoTeclaMascaraActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoTeclaMascara")) {
				jButtonActualizarTipoTeclaMascaraActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoTeclaMascara")) {
				jButtonEliminarTipoTeclaMascaraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoTeclaMascara")) {
				jButtonGuardarCambiosTipoTeclaMascaraActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoTeclaMascara")) {
				jButtonCancelarTipoTeclaMascaraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoTeclaMascara")) {
				jButtonCerrarTipoTeclaMascaraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoTeclaMascara")) {
				jButtonGuardarCambiosTipoTeclaMascaraActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoTeclaMascara")) {
				jButtonNuevoGuardarCambiosTipoTeclaMascaraActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoTeclaMascara")) {
				jButtonAbrirOrderByTipoTeclaMascaraActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoTeclaMascara")) {
				jButtonRecargarInformacionTipoTeclaMascaraActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoTeclaMascara")) {
				jButtonAnterioresTipoTeclaMascaraActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoTeclaMascara")) {
				jButtonSiguientesTipoTeclaMascaraActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoTeclaMascaraBusqueda")) {
				this.jButtonidTipoTeclaMascaraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoTeclaMascaraBusqueda")) {
				this.jButtoncodigoTipoTeclaMascaraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoTeclaMascaraBusqueda")) {
				this.jButtonnombreTipoTeclaMascaraBusquedaActionPerformed(evt);
			}
			
			TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoTeclaMascara();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoTeclaMascara")) {
				closingInternalFrameTipoTeclaMascara();
				
			} else if(sTipo.equals("jButtonCancelarTipoTeclaMascara")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoTeclaMascara = (JInternalFrameBase)evt.getSource();
	            	
	            TipoTeclaMascaraBeanSwingJInternalFrame jInternalFrameParent=(TipoTeclaMascaraBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoTeclaMascara.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoTeclaMascaraActionPerformed(null);
			}
			
			TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoteclamascara,new Object(),this.tipoteclamascaraParameterGeneral,this.tipoteclamascaraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoTeclaMascara(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoTeclaMascara(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoTeclaMascara(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoteclamascara)) {
			if(!esControlTabla) {
				if(TipoTeclaMascaraJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoTeclaMascara(this.tipoteclamascara,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTeclaMascara(this.tipoteclamascara);			
				}
				
				if(this.tipoteclamascaraSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoTeclaMascara(this.tipoteclamascara,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoteclamascaraReturnGeneral=tipoteclamascaraLogic.procesarEventosTipoTeclaMascarasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoteclamascaraLogic.getTipoTeclaMascaras(),this.tipoteclamascara,this.tipoteclamascaraParameterGeneral,this.isEsNuevoTipoTeclaMascara,classes);//this.tipoteclamascaraLogic.getTipoTeclaMascara()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoTeclaMascara(this.tipoteclamascaraReturnGeneral,this.tipoteclamascaraBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoteclamascaraSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoTeclaMascara(classes,this.tipoteclamascaraReturnGeneral,this.tipoteclamascaraBean,false);
					}
						
					if(this.tipoteclamascaraReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoTeclaMascara(this.tipoteclamascaraReturnGeneral.getTipoTeclaMascara());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoTeclaMascara(this.tipoteclamascaraReturnGeneral.getTipoTeclaMascara());	
					}
						
					if(this.tipoteclamascaraReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoTeclaMascara(this.tipoteclamascaraReturnGeneral.getTipoTeclaMascara(),classes);//this.tipoteclamascaraBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoTeclaMascara(this.tipoteclamascara,classes);//this.tipoteclamascaraBean);									
				}
			
				if(TipoTeclaMascaraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoTeclaMascara(this.tipoteclamascara,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTeclaMascara(this.tipoteclamascara);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoteclamascaraAnterior!=null) {
						this.tipoteclamascara=this.tipoteclamascaraAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoteclamascaraReturnGeneral=tipoteclamascaraLogic.procesarEventosTipoTeclaMascarasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoteclamascaraLogic.getTipoTeclaMascaras(),this.tipoteclamascara,this.tipoteclamascaraParameterGeneral,this.isEsNuevoTipoTeclaMascara,classes);//this.tipoteclamascaraLogic.getTipoTeclaMascara()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoteclamascaraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoteclamascaraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoteclamascaraReturnGeneral.getTipoTeclaMascara(),tipoteclamascaraLogic.getTipoTeclaMascaras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoteclamascaraReturnGeneral.getTipoTeclaMascara(),this.tipoteclamascaras);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoTeclaMascara.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoTeclaMascara.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoTeclaMascara();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoTeclaMascara() throws Exception {
		
		TipoTeclaMascaraModel tipoteclamascaraModel=(TipoTeclaMascaraModel)this.jTableDatosTipoTeclaMascara.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoteclamascaraModel.tipoteclamascaras=this.tipoteclamascaraLogic.getTipoTeclaMascaras();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoteclamascaraModel.tipoteclamascaras=this.tipoteclamascaras;
		}
		
		
		((TipoTeclaMascaraModel) this.jTableDatosTipoTeclaMascara.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoTeclaMascara() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoteclamascaraAnterior(),this.tipoteclamascaraLogic.getTipoTeclaMascaras());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoteclamascaraAnterior(),this.tipoteclamascaras);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoTeclaMascara();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoTeclaMascara(TipoTeclaMascara tipoteclamascara,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
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
										
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoteclamascara,new Object(),generalEntityParameterGeneral,this.tipoteclamascaraReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoteclamascaraSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoTeclaMascaraConstantesFunciones.getClassesRelationshipsOfTipoTeclaMascara(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoTeclaMascaraConstantesFunciones.getClassesRelationshipsFromStringsOfTipoTeclaMascara(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoTeclaMascara(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoTeclaMascaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoteclamascara,new Object(),generalEntityParameterGeneral,this.tipoteclamascaraReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoTeclaMascara(TipoTeclaMascaraBean tipoteclamascaraBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoTeclaMascara(ArrayList<Classe> classes,TipoTeclaMascaraReturnGeneral tipoteclamascaraReturnGeneral,TipoTeclaMascaraBean tipoteclamascaraBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoTeclaMascara(TipoTeclaMascara tipoteclamascara,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoteclamascara)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoTeclaMascara = new TipoTeclaMascaraDetalleFormJInternalFrame(jDesktopPane,this.tipoteclamascaraSessionBean.getConGuardarRelaciones(),this.tipoteclamascaraSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoTeclaMascara);
		this.jInternalFrameDetalleFormTipoTeclaMascara.setVisible(false);
		this.jInternalFrameDetalleFormTipoTeclaMascara.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoTeclaMascara.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoTeclaMascara.tipoteclamascaraLogic=this.tipoteclamascaraLogic;
		
		this.cargarCombosFrameForeignKeyTipoTeclaMascara("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoTeclaMascara();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoTeclaMascara();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoTeclaMascara("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoTeclaMascara();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoTeclaMascara.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoTeclaMascara"));
		
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonModificarTipoTeclaMascara.addActionListener(new ButtonActionListener(this,"ModificarTipoTeclaMascara"));

		
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonModificarToolBarTipoTeclaMascara.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoTeclaMascara"));
					
		this.jInternalFrameDetalleFormTipoTeclaMascara.jMenuItemModificarTipoTeclaMascara.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoTeclaMascara"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonActualizarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"ActualizarTipoTeclaMascara"));
		
		
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonActualizarToolBarTipoTeclaMascara.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoTeclaMascara"));
						
		this.jInternalFrameDetalleFormTipoTeclaMascara.jMenuItemActualizarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoTeclaMascara"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonEliminarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"EliminarTipoTeclaMascara"));
		
		
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonEliminarToolBarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoTeclaMascara"));
								
		this.jInternalFrameDetalleFormTipoTeclaMascara.jMenuItemEliminarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoTeclaMascara"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonCancelarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"CancelarTipoTeclaMascara"));
		
		
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonCancelarToolBarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoTeclaMascara"));
					
		this.jInternalFrameDetalleFormTipoTeclaMascara.jMenuItemCancelarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoTeclaMascara"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoTeclaMascara.jMenuItemDetalleCerrarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoTeclaMascara"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonGuardarCambiosToolBarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoTeclaMascara"));
		
		
		
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonGuardarCambiosToolBarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoTeclaMascara"));
		
		
		
		this.jInternalFrameDetalleFormTipoTeclaMascara.jComboBoxTiposAccionesFormularioTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoTeclaMascara"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonidTipoTeclaMascaraBusqueda.addActionListener(new ButtonActionListener(this,"idTipoTeclaMascaraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtoncodigoTipoTeclaMascaraBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoTeclaMascaraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonnombreTipoTeclaMascaraBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoTeclaMascaraBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoTeclaMascara.jTabbedPaneRelacionesTipoTeclaMascara.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoTeclaMascara"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoTeclaMascara"));
		
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTeclaMascara.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoTeclaMascara"));
		}
		
		this.jTableDatosTipoTeclaMascara.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoTeclaMascara"));
		
		this.jTableDatosTipoTeclaMascara.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoTeclaMascara"));
		
		this.jButtonNuevoTipoTeclaMascara.addActionListener(new ButtonActionListener(this,"NuevoTipoTeclaMascara"));
		
		this.jButtonDuplicarTipoTeclaMascara.addActionListener(new ButtonActionListener(this,"DuplicarTipoTeclaMascara"));
		
		this.jButtonCopiarTipoTeclaMascara.addActionListener(new ButtonActionListener(this,"CopiarTipoTeclaMascara"));
		
		this.jButtonVerFormTipoTeclaMascara.addActionListener(new ButtonActionListener(this,"VerFormTipoTeclaMascara"));
		
		
		this.jButtonNuevoToolBarTipoTeclaMascara.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoTeclaMascara"));
			
		this.jButtonDuplicarToolBarTipoTeclaMascara.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoTeclaMascara"));
			
		this.jMenuItemNuevoTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoTeclaMascara"));
			
		this.jMenuItemDuplicarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoTeclaMascara"));		
		
		
		this.jButtonNuevoRelacionesTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoTeclaMascara"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoTeclaMascara.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoTeclaMascara"));
			
		this.jMenuItemNuevoRelacionesTipoTeclaMascara.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoTeclaMascara"));		
		
		
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonModificarTipoTeclaMascara.addActionListener(new ButtonActionListener(this,"ModificarTipoTeclaMascara"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonModificarToolBarTipoTeclaMascara.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoTeclaMascara"));
			
			this.jInternalFrameDetalleFormTipoTeclaMascara.jMenuItemModificarTipoTeclaMascara.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoTeclaMascara"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonActualizarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"ActualizarTipoTeclaMascara"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonActualizarToolBarTipoTeclaMascara.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoTeclaMascara"));
				
			this.jInternalFrameDetalleFormTipoTeclaMascara.jMenuItemActualizarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoTeclaMascara"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonEliminarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"EliminarTipoTeclaMascara"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonEliminarToolBarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoTeclaMascara"));
						
			this.jInternalFrameDetalleFormTipoTeclaMascara.jMenuItemEliminarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoTeclaMascara"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonCancelarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"CancelarTipoTeclaMascara"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonCancelarToolBarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoTeclaMascara"));
			
			this.jInternalFrameDetalleFormTipoTeclaMascara.jMenuItemCancelarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoTeclaMascara"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoTeclaMascara"));		
		
		
		this.jButtonCerrarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"CerrarTipoTeclaMascara"));
		
		
		this.jButtonCerrarToolBarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoTeclaMascara"));
			
		this.jMenuItemCerrarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoTeclaMascara"));
			
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTeclaMascara.jMenuItemDetalleCerrarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoTeclaMascara"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonGuardarCambiosTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoTeclaMascara"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonGuardarCambiosToolBarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoTeclaMascara"));
		}
		
		this.jButtonCopiarToolBarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoTeclaMascara"));
			
		this.jButtonVerFormToolBarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoTeclaMascara"));
		
		this.jMenuItemGuardarCambiosTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoTeclaMascara"));
			
		this.jMenuItemCopiarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoTeclaMascara"));		
		
		this.jMenuItemVerFormTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoTeclaMascara"));		
		
		
		this.jButtonGuardarCambiosTablaTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoTeclaMascara"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoTeclaMascara"));
			
		this.jMenuItemGuardarCambiosTablaTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoTeclaMascara"));		
		
		
		
		this.jButtonRecargarInformacionTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoTeclaMascara"));
					
		this.jButtonRecargarInformacionToolBarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoTeclaMascara"));
		
		this.jMenuItemRecargarInformacionTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoTeclaMascara"));		
		
		
		
		this.jButtonAnterioresTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"AnterioresTipoTeclaMascara"));
		
		
		this.jButtonAnterioresToolBarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoTeclaMascara"));
		
		this.jMenuItemAnterioresTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoTeclaMascara"));		
		
		
		this.jButtonSiguientesTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"SiguientesTipoTeclaMascara"));
		
		
		this.jButtonSiguientesToolBarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoTeclaMascara"));
			
		this.jMenuItemSiguientesTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoTeclaMascara"));
			
		this.jMenuItemAbrirOrderByTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoTeclaMascara"));
			
		this.jMenuItemMostrarOcultarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoTeclaMascara"));
			
		this.jMenuItemDetalleAbrirOrderByTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoTeclaMascara"));
			
		this.jMenuItemDetalleMostarOcultarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoTeclaMascara"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoTeclaMascara"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoTeclaMascara"));
			
		this.jMenuItemNuevoGuardarCambiosTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoTeclaMascara"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoTeclaMascara.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoTeclaMascara"));

		this.jCheckBoxSeleccionadosTipoTeclaMascara.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoTeclaMascara"));
		
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTeclaMascara.jComboBoxTiposAccionesFormularioTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoTeclaMascara"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoTeclaMascara"));
			
		this.jComboBoxTiposAccionesTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoTeclaMascara"));
					
		this.jComboBoxTiposSeleccionarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoTeclaMascara"));
			
		this.jTextFieldValorCampoGeneralTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoTeclaMascara"));		
		
		
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonidTipoTeclaMascaraBusqueda.addActionListener(new ButtonActionListener(this,"idTipoTeclaMascaraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtoncodigoTipoTeclaMascaraBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoTeclaMascaraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonnombreTipoTeclaMascaraBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoTeclaMascaraBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoTeclaMascara!=null) {
				this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoTeclaMascara"));
				this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoTeclaMascara"));
				this.jInternalFrameReporteDinamicoTipoTeclaMascara.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoTeclaMascara"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoTeclaMascara"));				
			//this.jButtonGenerarReporteDinamicoTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoTeclaMascara"));
			//this.jButtonGenerarExcelReporteDinamicoTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoTeclaMascara"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoTeclaMascara!=null) {
				this.jInternalFrameImportacionTipoTeclaMascara.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoTeclaMascara"));
				this.jInternalFrameImportacionTipoTeclaMascara.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoTeclaMascara"));
				this.jInternalFrameImportacionTipoTeclaMascara.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoTeclaMascara"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoTeclaMascara"));
			
			this.jButtonAbrirOrderByToolBarTipoTeclaMascara.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoTeclaMascara"));			
			
			if(this.jInternalFrameOrderByTipoTeclaMascara!=null) {
				this.jInternalFrameOrderByTipoTeclaMascara.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoTeclaMascara"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTeclaMascara.jTabbedPaneRelacionesTipoTeclaMascara.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoTeclaMascara"));
		
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
            		closingInternalFrameTipoTeclaMascara();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoTeclaMascara.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoTeclaMascara = (JInternalFrameBase)event.getSource();
	            	
	            TipoTeclaMascaraBeanSwingJInternalFrame jInternalFrameParent=(TipoTeclaMascaraBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoTeclaMascara.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoTeclaMascaraActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoTeclaMascara.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoTeclaMascaraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoTeclaMascara.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoTeclaMascara.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTeclaMascaraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTeclaMascaraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTeclaMascaraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoTeclaMascara";
		inputMap = this.jButtonNuevoTipoTeclaMascara.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoTeclaMascara.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoTeclaMascaraActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTeclaMascaraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTeclaMascaraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTeclaMascaraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoTeclaMascara";
		inputMap = this.jButtonNuevoRelacionesTipoTeclaMascara.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoTeclaMascara.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoTeclaMascaraActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoTeclaMascara";
		inputMap = this.jButtonModificarTipoTeclaMascara.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoTeclaMascara.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoTeclaMascaraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoTeclaMascara";
		inputMap = this.jButtonActualizarTipoTeclaMascara.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoTeclaMascara.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoTeclaMascaraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoTeclaMascara";
		inputMap = this.jButtonEliminarTipoTeclaMascara.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoTeclaMascara.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoTeclaMascaraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoTeclaMascara";
		inputMap = this.jButtonCancelarTipoTeclaMascara.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoTeclaMascara.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoTeclaMascaraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoTeclaMascara";
		inputMap = this.jButtonCerrarTipoTeclaMascara.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoTeclaMascara.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoTeclaMascaraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonGuardarCambiosTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoTeclaMascara";
		inputMap = this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonGuardarCambiosTipoTeclaMascara.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonGuardarCambiosTipoTeclaMascara.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoTeclaMascaraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoTeclaMascara.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoTeclaMascaraItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoTeclaMascara.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoTeclaMascaraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoTeclaMascara.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoTeclaMascaraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoTeclaMascara.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoTeclaMascaraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonidTipoTeclaMascaraBusqueda.addActionListener(new ButtonActionListener(this,"idTipoTeclaMascaraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtoncodigoTipoTeclaMascaraBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoTeclaMascaraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTeclaMascara.jButtonnombreTipoTeclaMascaraBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoTeclaMascaraBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoTeclaMascara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoTeclaMascaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoTeclaMascaraActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoTeclaMascara.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoTeclaMascara(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoTeclaMascara tipoteclamascaraAux:this.tipoteclamascaraLogic.getTipoTeclaMascaras()) {
					tipoteclamascaraAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTeclaMascara tipoteclamascaraAux:tipoteclamascaras) {
					tipoteclamascaraAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoTeclaMascaraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoTeclaMascara(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoTeclaMascara tipoteclamascaraAux:this.tipoteclamascaraLogic.getTipoTeclaMascaras()) {
						tipoteclamascaraAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoTeclaMascara tipoteclamascaraAux:tipoteclamascaras) {
						tipoteclamascaraAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoTeclaMascara tipoteclamascaraAux:this.tipoteclamascaraLogic.getTipoTeclaMascaras()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoTeclaMascara tipoteclamascaraAux:tipoteclamascaras) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoTeclaMascara(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoTeclaMascara.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoTeclaMascara.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoTeclaMascara,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoTeclaMascaraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoTeclaMascara(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoTeclaMascara.getSelectedRows();
			
			TipoTeclaMascara tipoteclamascaraLocal=new TipoTeclaMascara();
			
			//this.seleccionarTodosTipoTeclaMascara(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoteclamascaraLocal =(TipoTeclaMascara) this.tipoteclamascaraLogic.getTipoTeclaMascaras().toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoteclamascaraLocal =(TipoTeclaMascara) this.tipoteclamascaras.toArray()[this.jTableDatosTipoTeclaMascara.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoteclamascaraLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoTeclaMascara tipoteclamascaraAux:this.tipoteclamascaraLogic.getTipoTeclaMascaras()) {
						tipoteclamascaraAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoTeclaMascara tipoteclamascaraAux:tipoteclamascaras) {
						tipoteclamascaraAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoTeclaMascara(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoTeclaMascara.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoTeclaMascara.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoTeclaMascara,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoTeclaMascaraItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoTeclaMascaraParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoTeclaMascaraActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoTeclaMascara(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoTeclaMascara.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoTeclaMascara tipoteclamascaraAux:this.tipoteclamascaraLogic.getTipoTeclaMascaras()) {
				
						if(sTipoSeleccionar.equals(TipoTeclaMascaraConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoteclamascaraAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoTeclaMascaraConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoteclamascaraAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTeclaMascara tipoteclamascaraAux:tipoteclamascaras) {
					
						if(sTipoSeleccionar.equals(TipoTeclaMascaraConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoteclamascaraAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoTeclaMascaraConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoteclamascaraAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoTeclaMascara(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoTeclaMascaraActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoTeclaMascara(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoTeclaMascara=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoTeclaMascara.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoTeclaMascara.jComboBoxTiposAccionesFormularioTipoTeclaMascara.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoTeclaMascara) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoTeclaMascara(conSplash);
				
					this.generarReporteTipoTeclaMascarasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTeclaMascara.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTeclaMascara.jComboBoxTiposAccionesFormularioTipoTeclaMascara.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoTeclaMascarasSeleccionados();
				//this.jComboBoxTiposAccionesTipoTeclaMascara.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoTeclaMascarasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoTeclaMascara.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoTeclaMascarasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoTeclaMascara.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoTeclaMascara();
				
				this.exportarTipoTeclaMascarasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTeclaMascara.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTeclaMascara.jComboBoxTiposAccionesFormularioTipoTeclaMascara.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoTeclaMascaras();
				//this.importarTipoTeclaMascaras();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTeclaMascara.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTeclaMascara.jComboBoxTiposAccionesFormularioTipoTeclaMascara.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoTeclaMascara();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoTeclaMascarasSeleccionados();
				//this.jComboBoxTiposAccionesTipoTeclaMascara.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Tecla Mascara", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoTeclaMascara();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoTeclaMascara)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoTeclaMascara(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Tecla Mascara",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTeclaMascara.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTeclaMascara.jComboBoxTiposAccionesFormularioTipoTeclaMascara.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoTeclaMascara();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoTeclaMascara(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoTeclaMascaraActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoTeclaMascara();
			
			if(this.jInternalFrameDetalleFormTipoTeclaMascara==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoTeclaMascara> tipoteclamascarasSeleccionados=new ArrayList<TipoTeclaMascara>();		
			TipoTeclaMascara tipoteclamascara=new TipoTeclaMascara();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoTeclaMascara(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoTeclaMascara.getSelectedItem();
			
			
			
			
			tipoteclamascarasSeleccionados=this.getTipoTeclaMascarasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoteclamascarasSeleccionados.size()==1) {
				for(TipoTeclaMascara tipoteclamascaraAux:tipoteclamascarasSeleccionados) {
					tipoteclamascara=tipoteclamascaraAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoTeclaMascara();
			
      		//this.finishProcessTipoTeclaMascara(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoTeclaMascaraReturnGeneral() throws Exception {
		if(this.tipoteclamascaraReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoteclamascaraReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoteclamascaraReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoteclamascaraReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoteclamascaraReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoteclamascaraReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoTeclaMascara(false);
		}
		
		if(this.tipoteclamascaraReturnGeneral.getConRetornoLista() || this.tipoteclamascaraReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoteclamascaraReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoteclamascaraLogic.setTipoTeclaMascaras(this.tipoteclamascaraReturnGeneral.getTipoTeclaMascaras());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoteclamascaraReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoteclamascaraLogic.setTipoTeclaMascara(this.tipoteclamascaraReturnGeneral.getTipoTeclaMascara());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoTeclaMascara(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoTeclaMascara() throws Exception {
		
		
	}
	
	public ArrayList<TipoTeclaMascara> getTipoTeclaMascarasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoTeclaMascara> tipoteclamascarasSeleccionados=new ArrayList<TipoTeclaMascara>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoTeclaMascara) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoTeclaMascara tipoteclamascaraAux:tipoteclamascaraLogic.getTipoTeclaMascaras()) {
					if(tipoteclamascaraAux.getIsSelected()) {
						tipoteclamascarasSeleccionados.add(tipoteclamascaraAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTeclaMascara tipoteclamascaraAux:this.tipoteclamascaras) {
					if(tipoteclamascaraAux.getIsSelected()) {
						tipoteclamascarasSeleccionados.add(tipoteclamascaraAux);				
					}
				}
			}
			
			if(tipoteclamascarasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoteclamascarasSeleccionados.addAll(this.tipoteclamascaraLogic.getTipoTeclaMascaras());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoteclamascarasSeleccionados.addAll(this.tipoteclamascaras);				
					}
				}
			}
		} else {
			tipoteclamascarasSeleccionados.add(this.tipoteclamascara);
		}
		
		return tipoteclamascarasSeleccionados;
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
	
	public void generarReporteTipoTeclaMascarasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoTeclaMascarasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoTeclaMascarasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoTeclaMascarasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoTeclaMascarasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Tecla Mascara",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoTeclaMascarasSeleccionados() throws Exception {
		ArrayList<TipoTeclaMascara> tipoteclamascarasSeleccionados=new ArrayList<TipoTeclaMascara>();		
		
		tipoteclamascarasSeleccionados=this.getTipoTeclaMascarasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoTeclaMascaras("Todos",tipoteclamascarasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoTeclaMascarasSeleccionados() throws Exception {
		ArrayList<TipoTeclaMascara> tipoteclamascarasSeleccionados=new ArrayList<TipoTeclaMascara>();		
		
		tipoteclamascarasSeleccionados=this.getTipoTeclaMascarasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoTeclaMascaras("Todos",tipoteclamascarasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoTeclaMascarasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoTeclaMascara> tipoteclamascarasSeleccionados=new ArrayList<TipoTeclaMascara>();
		
		tipoteclamascarasSeleccionados=this.getTipoTeclaMascarasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoTeclaMascaras("Todos",tipoteclamascarasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoTeclaMascarasSeleccionados() throws Exception {
		ArrayList<TipoTeclaMascara> tipoteclamascarasSeleccionados=new ArrayList<TipoTeclaMascara>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoTeclaMascara();
		
		
		tipoteclamascarasSeleccionados=this.getTipoTeclaMascarasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoTeclaMascara();
		
		
		//this.generarReporteTipoTeclaMascaras("Todos",tipoteclamascarasSeleccionados ,tipoteclamascaraImplementable,tipoteclamascaraImplementableHome);
	}
	
	public void mostrarImportacionTipoTeclaMascaras() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoTeclaMascara();
		
		this.abrirFrameImportacionTipoTeclaMascara();		
		
			
		//this.generarReporteTipoTeclaMascaras("Todos",tipoteclamascarasSeleccionados ,tipoteclamascaraImplementable,tipoteclamascaraImplementableHome);
	}
	
	public void importarTipoTeclaMascaras() throws Exception {		
	
	}
	
	public void exportarTipoTeclaMascarasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoTeclaMascarasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoTeclaMascarasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoTeclaMascarasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Tecla Mascara",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoTeclaMascarasSeleccionados() throws Exception {
		ArrayList<TipoTeclaMascara> tipoteclamascarasSeleccionados=new ArrayList<TipoTeclaMascara>();		
		
		tipoteclamascarasSeleccionados=this.getTipoTeclaMascarasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoteclamascara."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoTeclaMascara(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoTeclaMascara tipoteclamascaraAux:tipoteclamascarasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoTeclaMascara(tipoteclamascaraAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoteclamascaraAux.setsDetalleGeneralEntityReporte(tipoteclamascaraAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Tecla Mascara",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoTeclaMascara(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoTeclaMascaraConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTeclaMascaraConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTeclaMascaraConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTeclaMascaraConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoTeclaMascara(TipoTeclaMascara tipoteclamascara,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoteclamascara.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoteclamascara.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoteclamascara.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoteclamascara.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoTeclaMascarasSeleccionados() throws Exception {
		ArrayList<TipoTeclaMascara> tipoteclamascarasSeleccionados=new ArrayList<TipoTeclaMascara>();		
		
		tipoteclamascarasSeleccionados=this.getTipoTeclaMascarasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoteclamascara.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoTeclaMascaras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoTeclaMascara(row);				
				iRow++;
			}				
			
			for(TipoTeclaMascara tipoteclamascaraAux:tipoteclamascarasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoTeclaMascara(tipoteclamascaraAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Tecla Mascara",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoTeclaMascarasSeleccionados() throws Exception {
		ArrayList<TipoTeclaMascara> tipoteclamascarasSeleccionados=new ArrayList<TipoTeclaMascara>();		
		
		tipoteclamascarasSeleccionados=this.getTipoTeclaMascarasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoteclamascara.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoteclamascaras");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoteclamascara");
			//elementRoot.appendChild(element);
		
			for(TipoTeclaMascara tipoteclamascaraAux:tipoteclamascarasSeleccionados) {
				element = document.createElement("tipoteclamascara");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoTeclaMascara(tipoteclamascaraAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Tecla Mascara",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoTeclaMascara(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTeclaMascaraConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTeclaMascaraConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoTeclaMascaraConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTeclaMascaraConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoTeclaMascara(TipoTeclaMascara tipoteclamascara,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoteclamascara.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoteclamascara.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoteclamascara.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoTeclaMascara(TipoTeclaMascara tipoteclamascara,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoTeclaMascaraConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoteclamascara.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoTeclaMascaraConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoteclamascara.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoTeclaMascaraConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoteclamascara.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoTeclaMascaraConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoteclamascara.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoTeclaMascarasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoTeclaMascara> tipoteclamascarasSeleccionados=new ArrayList<TipoTeclaMascara>();
		
		tipoteclamascarasSeleccionados=this.getTipoTeclaMascarasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoTeclaMascara(tipoteclamascarasSeleccionados);
		
		this.generarReporteTipoTeclaMascaras("Todos",tipoteclamascarasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoTeclaMascara(ArrayList<TipoTeclaMascara> tipoteclamascarasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoTeclaMascara tipoteclamascaraAux:tipoteclamascarasSeleccionados) {
				tipoteclamascaraAux.setsDetalleGeneralEntityReporte(tipoteclamascaraAux.toString());
			
				if(sTipoSeleccionar.equals(TipoTeclaMascaraConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoteclamascaraAux.setsDescripcionGeneralEntityReporte1(tipoteclamascaraAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoTeclaMascaraConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoteclamascaraAux.setsDescripcionGeneralEntityReporte1(tipoteclamascaraAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTeclaMascaraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoTeclaMascara(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoTeclaMascara=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoTeclaMascara=true;
				this.isVisibilidadCeldaGuardarCambiosTipoTeclaMascara=true;
			}
			
			this.isVisibilidadCeldaModificarTipoTeclaMascara=false;
			this.isVisibilidadCeldaActualizarTipoTeclaMascara=false;
			this.isVisibilidadCeldaEliminarTipoTeclaMascara=false;
			this.isVisibilidadCeldaCancelarTipoTeclaMascara=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTeclaMascara=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTeclaMascara=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoTeclaMascara=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTeclaMascara=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTeclaMascara=false;
			this.isVisibilidadCeldaModificarTipoTeclaMascara=false;
			this.isVisibilidadCeldaActualizarTipoTeclaMascara=true;
			this.isVisibilidadCeldaEliminarTipoTeclaMascara=false;
			this.isVisibilidadCeldaCancelarTipoTeclaMascara=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTeclaMascara=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTeclaMascara=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoTeclaMascara=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTeclaMascara=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTeclaMascara=false;
			this.isVisibilidadCeldaModificarTipoTeclaMascara=false;
			this.isVisibilidadCeldaActualizarTipoTeclaMascara=true;
			this.isVisibilidadCeldaEliminarTipoTeclaMascara=true;
			this.isVisibilidadCeldaCancelarTipoTeclaMascara=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTeclaMascara=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTeclaMascara=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoTeclaMascara=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTeclaMascara=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTeclaMascara=false;
			this.isVisibilidadCeldaModificarTipoTeclaMascara=false;
			this.isVisibilidadCeldaActualizarTipoTeclaMascara=true;
			this.isVisibilidadCeldaEliminarTipoTeclaMascara=false;
			this.isVisibilidadCeldaCancelarTipoTeclaMascara=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTeclaMascara=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoTeclaMascara=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoTeclaMascara=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoTeclaMascara=true;
			this.isVisibilidadCeldaGuardarCambiosTipoTeclaMascara=true;
			this.isVisibilidadCeldaModificarTipoTeclaMascara=false;
			this.isVisibilidadCeldaActualizarTipoTeclaMascara=false;
			this.isVisibilidadCeldaEliminarTipoTeclaMascara=false;
			this.isVisibilidadCeldaCancelarTipoTeclaMascara=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTeclaMascara=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTeclaMascara=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoTeclaMascara=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTeclaMascara=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTeclaMascara=false;
			this.isVisibilidadCeldaActualizarTipoTeclaMascara=false;
			this.isVisibilidadCeldaEliminarTipoTeclaMascara=false;
			this.isVisibilidadCeldaCancelarTipoTeclaMascara=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTeclaMascara=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoTeclaMascara=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoTeclaMascara=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTeclaMascara=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTeclaMascara=false;
			this.isVisibilidadCeldaModificarTipoTeclaMascara=true;
			this.isVisibilidadCeldaActualizarTipoTeclaMascara=false;
			this.isVisibilidadCeldaEliminarTipoTeclaMascara=false;
			this.isVisibilidadCeldaCancelarTipoTeclaMascara=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTeclaMascara=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoTeclaMascara=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoTeclaMascaraJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoTeclaMascara=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoTeclaMascara=true;
			this.isVisibilidadCeldaGuardarCambiosTipoTeclaMascara=true;
		} else {
			this.actualizarEstadoPanelsTipoTeclaMascara(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoTeclaMascara=false;
			//this.isVisibilidadCeldaVerFormTipoTeclaMascara=false;
			this.isVisibilidadCeldaDuplicarTipoTeclaMascara=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoteclamascaraSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoTeclaMascara=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoTeclaMascara=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTeclaMascara=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
			if(!tipoteclamascaraSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoTeclaMascara=false;												
			}
			
			this.jButtonCerrarTipoTeclaMascara.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoTeclaMascara=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoteclamascara)) {
			this.isVisibilidadCeldaActualizarTipoTeclaMascara=false;
			this.isVisibilidadCeldaEliminarTipoTeclaMascara=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoTeclaMascara() {
	}
	
	public void actualizarEstadoPanelsTipoTeclaMascara(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoTeclaMascara!=null) {
				this.jScrollPanelDatosEdicionTipoTeclaMascara.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoTeclaMascara!=null) {
				this.jScrollPanelDatosTipoTeclaMascara.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTeclaMascara!=null) {
				this.jPanelPaginacionTipoTeclaMascara.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTeclaMascara!=null) {
				this.jPanelParametrosReportesTipoTeclaMascara.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoTeclaMascara!=null) {
				this.jScrollPanelDatosEdicionTipoTeclaMascara.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoTeclaMascara!=null) {
				this.jScrollPanelDatosTipoTeclaMascara.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoTeclaMascara!=null) {
				this.jPanelPaginacionTipoTeclaMascara.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoTeclaMascara!=null) {
				this.jPanelParametrosReportesTipoTeclaMascara.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoTeclaMascara!=null) {
				this.jScrollPanelDatosEdicionTipoTeclaMascara.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoTeclaMascara!=null) {
				this.jScrollPanelDatosTipoTeclaMascara.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoTeclaMascara!=null) {
				this.jPanelPaginacionTipoTeclaMascara.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoTeclaMascara!=null) {
				this.jPanelParametrosReportesTipoTeclaMascara.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoTeclaMascara!=null) {
				this.jScrollPanelDatosEdicionTipoTeclaMascara.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoTeclaMascara!=null) {
				this.jScrollPanelDatosTipoTeclaMascara.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoTeclaMascara!=null) {
				this.jPanelPaginacionTipoTeclaMascara.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoTeclaMascara!=null) {
				this.jPanelParametrosReportesTipoTeclaMascara.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoTeclaMascara!=null) {
				this.jScrollPanelDatosEdicionTipoTeclaMascara.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoTeclaMascara!=null) {
				this.jScrollPanelDatosTipoTeclaMascara.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTeclaMascara!=null) {
				this.jPanelPaginacionTipoTeclaMascara.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTeclaMascara!=null) {
				this.jPanelParametrosReportesTipoTeclaMascara.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoTeclaMascara!=null) {
				this.jScrollPanelDatosEdicionTipoTeclaMascara.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoTeclaMascara!=null) {
				this.jScrollPanelDatosTipoTeclaMascara.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTeclaMascara!=null) {
				this.jPanelPaginacionTipoTeclaMascara.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTeclaMascara!=null) {
				this.jPanelParametrosReportesTipoTeclaMascara.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoTeclaMascara!=null) {
				this.jScrollPanelDatosEdicionTipoTeclaMascara.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoTeclaMascara!=null) {
				this.jScrollPanelDatosTipoTeclaMascara.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTeclaMascara!=null) {
				this.jPanelPaginacionTipoTeclaMascara.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTeclaMascara!=null) {
				this.jPanelParametrosReportesTipoTeclaMascara.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoTeclaMascaraSessionBean tipoteclamascaraSessionBean=new TipoTeclaMascaraSessionBean();
		
		if(this.tipoteclamascaraSessionBean==null) {
			this.tipoteclamascaraSessionBean=new TipoTeclaMascaraSessionBean();
		}
		
		this.tipoteclamascaraSessionBean.setsUltimaBusquedaTipoTeclaMascara(this.getsAccionBusqueda());
		this.tipoteclamascaraSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoteclamascaraSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoTeclaMascaraSessionBean tipoteclamascaraSessionBean=new TipoTeclaMascaraSessionBean();
		
		if(this.tipoteclamascaraSessionBean==null) {
			this.tipoteclamascaraSessionBean=new TipoTeclaMascaraSessionBean();
		}
		
		if(this.tipoteclamascaraSessionBean.getsUltimaBusquedaTipoTeclaMascara()!=null&&!this.tipoteclamascaraSessionBean.getsUltimaBusquedaTipoTeclaMascara().equals("")) {
			this.setsAccionBusqueda(tipoteclamascaraSessionBean.getsUltimaBusquedaTipoTeclaMascara());
			this.setiNumeroPaginacion(tipoteclamascaraSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoteclamascaraSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipoteclamascaraSessionBean.setsUltimaBusquedaTipoTeclaMascara("");
		this.tipoteclamascaraSessionBean.setiNumeroPaginacion(TipoTeclaMascaraConstantesFunciones.INUMEROPAGINACION);
		this.tipoteclamascaraSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoTeclaMascara(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoTeclaMascara() {
		this.updateBorderResaltarBusquedasFormularioTipoTeclaMascara();
		this.updateVisibilidadBusquedasFormularioTipoTeclaMascara();
		this.updateHabilitarBusquedasFormularioTipoTeclaMascara();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoTeclaMascara() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoTeclaMascara() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoTeclaMascara() {
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
	
	public void updateControlesFormularioTipoTeclaMascara() throws Exception {

		if(this.jInternalFrameDetalleFormTipoTeclaMascara==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoTeclaMascara();
		this.updateVisibilidadResaltarControlesFormularioTipoTeclaMascara();
		this.updateHabilitarResaltarControlesFormularioTipoTeclaMascara();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoTeclaMascara() throws Exception {
		if(this.jInternalFrameDetalleFormTipoTeclaMascara==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoteclamascaraConstantesFunciones.resaltaridTipoTeclaMascara!=null && this.jInternalFrameDetalleFormTipoTeclaMascara!=null) {this.jInternalFrameDetalleFormTipoTeclaMascara.jTextFieldidTipoTeclaMascara.setBorder(this.tipoteclamascaraConstantesFunciones.resaltaridTipoTeclaMascara);}
		if(this.tipoteclamascaraConstantesFunciones.resaltarcodigoTipoTeclaMascara!=null && this.jInternalFrameDetalleFormTipoTeclaMascara!=null) {this.jInternalFrameDetalleFormTipoTeclaMascara.jTextFieldcodigoTipoTeclaMascara.setBorder(this.tipoteclamascaraConstantesFunciones.resaltarcodigoTipoTeclaMascara);}
		if(this.tipoteclamascaraConstantesFunciones.resaltarnombreTipoTeclaMascara!=null && this.jInternalFrameDetalleFormTipoTeclaMascara!=null) {this.jInternalFrameDetalleFormTipoTeclaMascara.jTextAreanombreTipoTeclaMascara.setBorder(this.tipoteclamascaraConstantesFunciones.resaltarnombreTipoTeclaMascara);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoTeclaMascara() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoTeclaMascara==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) {
	
		//this.jInternalFrameDetalleFormTipoTeclaMascara.jTextFieldidTipoTeclaMascara.setVisible(this.tipoteclamascaraConstantesFunciones.mostraridTipoTeclaMascara);
		this.jInternalFrameDetalleFormTipoTeclaMascara.jPanelidTipoTeclaMascara.setVisible(this.tipoteclamascaraConstantesFunciones.mostraridTipoTeclaMascara);
		//this.jInternalFrameDetalleFormTipoTeclaMascara.jTextFieldcodigoTipoTeclaMascara.setVisible(this.tipoteclamascaraConstantesFunciones.mostrarcodigoTipoTeclaMascara);
		this.jInternalFrameDetalleFormTipoTeclaMascara.jPanelcodigoTipoTeclaMascara.setVisible(this.tipoteclamascaraConstantesFunciones.mostrarcodigoTipoTeclaMascara);
		//this.jInternalFrameDetalleFormTipoTeclaMascara.jTextAreanombreTipoTeclaMascara.setVisible(this.tipoteclamascaraConstantesFunciones.mostrarnombreTipoTeclaMascara);
		this.jInternalFrameDetalleFormTipoTeclaMascara.jPanelnombreTipoTeclaMascara.setVisible(this.tipoteclamascaraConstantesFunciones.mostrarnombreTipoTeclaMascara);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoTeclaMascara() throws Exception {
		if(this.jInternalFrameDetalleFormTipoTeclaMascara==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoTeclaMascara!=null) {
	
		this.jInternalFrameDetalleFormTipoTeclaMascara.jTextFieldidTipoTeclaMascara.setEnabled(this.tipoteclamascaraConstantesFunciones.activaridTipoTeclaMascara);
		this.jInternalFrameDetalleFormTipoTeclaMascara.jTextFieldcodigoTipoTeclaMascara.setEnabled(this.tipoteclamascaraConstantesFunciones.activarcodigoTipoTeclaMascara);
		this.jInternalFrameDetalleFormTipoTeclaMascara.jTextAreanombreTipoTeclaMascara.setEnabled(this.tipoteclamascaraConstantesFunciones.activarnombreTipoTeclaMascara);
		}
	}
	
		
}