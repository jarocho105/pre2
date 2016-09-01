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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




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

import com.bydan.erp.inventario.util.TipoCostoConstantesFunciones;
import com.bydan.erp.inventario.util.TipoCostoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.TipoCostoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.TipoCostoBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
public class TipoCostoBeanSwingJInternalFrame extends TipoCostoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoCostoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoCosto> tipocostoValidator = new ClassValidator<TipoCosto>(TipoCosto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoCosto tipocosto;	
	public TipoCosto tipocostoAux;
	public TipoCosto tipocostoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoCosto tipocostoTotales;
	public Long idTipoCostoActual;
	public Long iIdNuevoTipoCosto=0L;
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
	
	public Boolean isPermisoTodoTipoCosto;
	public Boolean isPermisoNuevoTipoCosto;
	public Boolean isPermisoActualizarTipoCosto;
	public Boolean isPermisoActualizarOriginalTipoCosto;
	public Boolean isPermisoEliminarTipoCosto;
	public Boolean isPermisoGuardarCambiosTipoCosto;
	public Boolean isPermisoConsultaTipoCosto;
	public Boolean isPermisoBusquedaTipoCosto;
	public Boolean isPermisoReporteTipoCosto;
	public Boolean isPermisoPaginacionMedioTipoCosto;
	public Boolean isPermisoPaginacionAltoTipoCosto;
	public Boolean isPermisoPaginacionTodoTipoCosto;
	public Boolean isPermisoCopiarTipoCosto;
	public Boolean isPermisoVerFormTipoCosto;
	public Boolean isPermisoDuplicarTipoCosto;
	public Boolean isPermisoOrdenTipoCosto;
	
	
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
	
	public TipoCostoParameterReturnGeneral tipocostoReturnGeneral;
	public TipoCostoParameterReturnGeneral tipocostoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoCosto=false;
	public Boolean esParaAccionDesdeFormularioTipoCosto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoCostoLogic tipocostoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoCosto tipocostoBean;
	public TipoCostoConstantesFunciones tipocostoConstantesFunciones;
	//public TipoCostoParameterReturnGeneral tipocostoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoCosto> tipocostos;	
	//public List<TipoCosto> tipocostosEliminados;
	//public List<TipoCosto> tipocostosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoCosto=false;
	public Boolean isVisibilidadCeldaDuplicarTipoCosto=true;
	public Boolean isVisibilidadCeldaCopiarTipoCosto=true;
	public Boolean isVisibilidadCeldaVerFormTipoCosto=true;
	public Boolean isVisibilidadCeldaOrdenTipoCosto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoCosto=false;
	public Boolean isVisibilidadCeldaModificarTipoCosto=false;
	public Boolean isVisibilidadCeldaActualizarTipoCosto=false;
	public Boolean isVisibilidadCeldaEliminarTipoCosto=false;
	public Boolean isVisibilidadCeldaCancelarTipoCosto=false;
	public Boolean isVisibilidadCeldaGuardarTipoCosto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoCosto=false;	
	
	
	
	public Long getiIdNuevoTipoCosto() {
		return this.iIdNuevoTipoCosto;
	}

	public void setiIdNuevoTipoCosto(Long iIdNuevoTipoCosto) {
		this.iIdNuevoTipoCosto = iIdNuevoTipoCosto;
	}
	
	public Long getidTipoCostoActual() {
		return this.idTipoCostoActual;
	}

	public void setidTipoCostoActual(Long idTipoCostoActual) {
		this.idTipoCostoActual = idTipoCostoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoCosto gettipocosto() {
		return this.tipocosto;
	}

	public void settipocosto(TipoCosto tipocosto) {
		this.tipocosto = tipocosto;
	}
	
	public TipoCosto gettipocostoAux() {
		return this.tipocostoAux;
	}

	public void settipocostoAux(TipoCosto tipocostoAux) {
		this.tipocostoAux = tipocostoAux;
	}				
	
	public TipoCosto gettipocostoAnterior() {
		return this.tipocostoAnterior;
	}

	public void settipocostoAnterior(TipoCosto tipocostoAnterior) {
		this.tipocostoAnterior = tipocostoAnterior;
	}	
	
	public TipoCosto gettipocostoTotales() {
		return this.tipocostoTotales;
	}

	public void settipocostoTotales(TipoCosto tipocostoTotales) {
		this.tipocostoTotales = tipocostoTotales;
	}	
	
	public TipoCosto gettipocostoBean() {
		return this.tipocostoBean;
	}

	public void settipocostoBean(TipoCosto tipocostoBean) {
		this.tipocostoBean = tipocostoBean;
	}	
	
	public TipoCostoParameterReturnGeneral gettipocostoReturnGeneral() {
		return this.tipocostoReturnGeneral;
	}

	public void settipocostoReturnGeneral(TipoCostoParameterReturnGeneral tipocostoReturnGeneral) {
		this.tipocostoReturnGeneral = tipocostoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoCostoLogic getTipoCostoLogic()	{		
		return tipocostoLogic;
	}

	public void setTipoCostoLogic(TipoCostoLogic tipocostoLogic) {
		this.tipocostoLogic = tipocostoLogic;
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
	
	public Boolean getIsEsNuevoTipoCosto() {
		return isEsNuevoTipoCosto;
	}

	public void setIsEsNuevoTipoCosto(Boolean isEsNuevoTipoCosto) {
		this.isEsNuevoTipoCosto = isEsNuevoTipoCosto;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoCosto() {
		return esParaAccionDesdeFormularioTipoCosto;
	}
	
	public void setEsParaAccionDesdeFormularioTipoCosto(Boolean esParaAccionDesdeFormularioTipoCosto) {
		this.esParaAccionDesdeFormularioTipoCosto = esParaAccionDesdeFormularioTipoCosto;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoCosto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoCostoConstantesFunciones.refrescarForeignKeysDescripcionesTipoCosto(this.tipocostoLogic.getTipoCostos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoCostoConstantesFunciones.refrescarForeignKeysDescripcionesTipoCosto(this.tipocostos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocostoLogic.setTipoCostos(this.tipocostos);
			tipocostoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoCostoParameterReturnGeneral getTipoCostoParameterGeneral() {
		return this.tipocostoParameterGeneral;
	}
	
	public void setTipoCostoParameterGeneral(TipoCostoParameterReturnGeneral tipocostoParameterGeneral) {
		this.tipocostoParameterGeneral = tipocostoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoCosto() {
		return isPermisoTodoTipoCosto;
	}

	public void setIsPermisoTodoTipoCosto(Boolean isPermisoTodoTipoCosto) {
		this.isPermisoTodoTipoCosto = isPermisoTodoTipoCosto;
	}

	public Boolean getIsPermisoNuevoTipoCosto() {
		return isPermisoNuevoTipoCosto;
	}

	public void setIsPermisoNuevoTipoCosto(Boolean isPermisoNuevoTipoCosto) {
		this.isPermisoNuevoTipoCosto = isPermisoNuevoTipoCosto;
	}

	public Boolean getIsPermisoActualizarTipoCosto() {
		return isPermisoActualizarTipoCosto;
	}

	public void setIsPermisoActualizarTipoCosto(Boolean isPermisoActualizarTipoCosto) {
		this.isPermisoActualizarTipoCosto = isPermisoActualizarTipoCosto;
	}

	public Boolean getIsPermisoEliminarTipoCosto() {
		return isPermisoEliminarTipoCosto;
	}

	public void setIsPermisoEliminarTipoCosto(Boolean isPermisoEliminarTipoCosto) {
		this.isPermisoEliminarTipoCosto = isPermisoEliminarTipoCosto;
	}

	public Boolean getIsPermisoGuardarCambiosTipoCosto() {
		return isPermisoGuardarCambiosTipoCosto;
	}

	public void setIsPermisoGuardarCambiosTipoCosto(Boolean isPermisoGuardarCambiosTipoCosto) {
		this.isPermisoGuardarCambiosTipoCosto = isPermisoGuardarCambiosTipoCosto;
	}
	
	public Boolean getIsPermisoConsultaTipoCosto() {
		return isPermisoConsultaTipoCosto;
	}

	public void setIsPermisoConsultaTipoCosto(Boolean isPermisoConsultaTipoCosto) {
		this.isPermisoConsultaTipoCosto = isPermisoConsultaTipoCosto;
	}

	public Boolean getIsPermisoBusquedaTipoCosto() {
		return isPermisoBusquedaTipoCosto;
	}

	public void setIsPermisoBusquedaTipoCosto(Boolean isPermisoBusquedaTipoCosto) {
		this.isPermisoBusquedaTipoCosto = isPermisoBusquedaTipoCosto;
	}

	public Boolean getIsPermisoReporteTipoCosto() {
		return isPermisoReporteTipoCosto;
	}

	public void setIsPermisoReporteTipoCosto(Boolean isPermisoReporteTipoCosto) {
		this.isPermisoReporteTipoCosto = isPermisoReporteTipoCosto;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoCosto() {
		return isPermisoPaginacionMedioTipoCosto;
	}

	public void setIsPermisoPaginacionMedioTipoCosto(Boolean isPermisoPaginacionMedioTipoCosto) {
		this.isPermisoPaginacionMedioTipoCosto = isPermisoPaginacionMedioTipoCosto;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoCosto() {
		return isPermisoPaginacionTodoTipoCosto;
	}

	public void setIsPermisoPaginacionTodoTipoCosto(Boolean isPermisoPaginacionTodoTipoCosto) {
		this.isPermisoPaginacionTodoTipoCosto = isPermisoPaginacionTodoTipoCosto;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoCosto() {
		return isPermisoPaginacionAltoTipoCosto;
	}

	public void setIsPermisoPaginacionAltoTipoCosto(Boolean isPermisoPaginacionAltoTipoCosto) {
		this.isPermisoPaginacionAltoTipoCosto = isPermisoPaginacionAltoTipoCosto;
	}
	
	public Boolean getIsPermisoCopiarTipoCosto() {
		return isPermisoCopiarTipoCosto;
	}

	public void setIsPermisoCopiarTipoCosto(Boolean isPermisoCopiarTipoCosto) {
		this.isPermisoCopiarTipoCosto = isPermisoCopiarTipoCosto;
	}
	
	public Boolean getIsPermisoVerFormTipoCosto() {
		return isPermisoVerFormTipoCosto;
	}

	public void setIsPermisoVerFormTipoCosto(Boolean isPermisoVerFormTipoCosto) {
		this.isPermisoVerFormTipoCosto = isPermisoVerFormTipoCosto;
	}
	
	public Boolean getIsPermisoDuplicarTipoCosto() {
		return isPermisoDuplicarTipoCosto;
	}

	public void setIsPermisoDuplicarTipoCosto(Boolean isPermisoDuplicarTipoCosto) {
		this.isPermisoDuplicarTipoCosto = isPermisoDuplicarTipoCosto;
	}
	
	public Boolean getIsPermisoOrdenTipoCosto() {
		return isPermisoOrdenTipoCosto;
	}

	public void setIsPermisoOrdenTipoCosto(Boolean isPermisoOrdenTipoCosto) {
		this.isPermisoOrdenTipoCosto = isPermisoOrdenTipoCosto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoCosto() {
		return isVisibilidadCeldaNuevoTipoCosto;
	}

	public void setIsVisibilidadCeldaNuevoTipoCosto(Boolean isVisibilidadCeldaNuevoTipoCosto) {
		this.isVisibilidadCeldaNuevoTipoCosto = isVisibilidadCeldaNuevoTipoCosto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoCosto() {
		return isVisibilidadCeldaDuplicarTipoCosto;
	}

	public void setIsVisibilidadCeldaDuplicarTipoCosto(Boolean isVisibilidadCeldaDuplicarTipoCosto) {
		this.isVisibilidadCeldaDuplicarTipoCosto = isVisibilidadCeldaDuplicarTipoCosto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoCosto() {
		return isVisibilidadCeldaCopiarTipoCosto;
	}

	public void setIsVisibilidadCeldaCopiarTipoCosto(Boolean isVisibilidadCeldaCopiarTipoCosto) {
		this.isVisibilidadCeldaCopiarTipoCosto = isVisibilidadCeldaCopiarTipoCosto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoCosto() {
		return isVisibilidadCeldaVerFormTipoCosto;
	}

	public void setIsVisibilidadCeldaVerFormTipoCosto(Boolean isVisibilidadCeldaVerFormTipoCosto) {
		this.isVisibilidadCeldaVerFormTipoCosto = isVisibilidadCeldaVerFormTipoCosto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoCosto() {
		return isVisibilidadCeldaOrdenTipoCosto;
	}

	public void setIsVisibilidadCeldaOrdenTipoCosto(Boolean isVisibilidadCeldaOrdenTipoCosto) {
		this.isVisibilidadCeldaOrdenTipoCosto = isVisibilidadCeldaOrdenTipoCosto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoCosto() {
		return isVisibilidadCeldaNuevoRelacionesTipoCosto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoCosto(Boolean isVisibilidadCeldaNuevoRelacionesTipoCosto) {
		this.isVisibilidadCeldaNuevoRelacionesTipoCosto = isVisibilidadCeldaNuevoRelacionesTipoCosto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoCosto() {
		return isVisibilidadCeldaModificarTipoCosto;
	}

	public void setIsVisibilidadCeldaModificarTipoCosto(Boolean isVisibilidadCeldaModificarTipoCosto) {
		this.isVisibilidadCeldaModificarTipoCosto = isVisibilidadCeldaModificarTipoCosto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoCosto() {
		return isVisibilidadCeldaActualizarTipoCosto;
	}

	public void setIsVisibilidadCeldaActualizarTipoCosto(Boolean isVisibilidadCeldaActualizarTipoCosto) {
		this.isVisibilidadCeldaActualizarTipoCosto = isVisibilidadCeldaActualizarTipoCosto;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoCosto() {
		return isVisibilidadCeldaEliminarTipoCosto;
	}

	public void setIsVisibilidadCeldaEliminarTipoCosto(Boolean isVisibilidadCeldaEliminarTipoCosto) {
		this.isVisibilidadCeldaEliminarTipoCosto = isVisibilidadCeldaEliminarTipoCosto;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoCosto() {
		return isVisibilidadCeldaCancelarTipoCosto;
	}

	public void setIsVisibilidadCeldaCancelarTipoCosto(Boolean isVisibilidadCeldaCancelarTipoCosto) {
		this.isVisibilidadCeldaCancelarTipoCosto = isVisibilidadCeldaCancelarTipoCosto;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoCosto() {
		return isVisibilidadCeldaGuardarTipoCosto;
	}

	public void setIsVisibilidadCeldaGuardarTipoCosto(Boolean isVisibilidadCeldaGuardarTipoCosto) {
		this.isVisibilidadCeldaGuardarTipoCosto = isVisibilidadCeldaGuardarTipoCosto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoCosto() {
		return isVisibilidadCeldaGuardarCambiosTipoCosto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoCosto(Boolean isVisibilidadCeldaGuardarCambiosTipoCosto) {
		this.isVisibilidadCeldaGuardarCambiosTipoCosto = isVisibilidadCeldaGuardarCambiosTipoCosto;
	}
		
	public TipoCostoSessionBean gettipocostoSessionBean() {
		return this.tipocostoSessionBean;
	}
	
	public void settipocostoSessionBean(TipoCostoSessionBean tipocostoSessionBean) {
		this.tipocostoSessionBean=tipocostoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoCosto(TipoCosto tipocosto)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoCosto tipocosto,TipoCosto tipocostoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoCosto(tipocosto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocostoAux.setId(tipocosto.getId());
		tipocostoAux.setVersionRow(tipocosto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoCosto();
		
			int intSelectedRow = this.jTableDatosTipoCosto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosto =(TipoCosto) this.tipocostoLogic.getTipoCostos().toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocosto =(TipoCosto) this.tipocostos.toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoCosto(this.tipocosto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCosto(this.tipocosto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocostoValidator.getInvalidValues(this.tipocosto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocostoLogic.setDatosCliente(datosCliente);
			tipocostoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocostoAux=new  TipoCosto();
				
				tipocostoAux.setIsNew(true);
				tipocostoAux.setIsChanged(true);
				
				tipocostoAux.setTipoCostoOriginal(this.tipocosto);
				
				tipocostoAux.setId(this.tipocosto.getId());	
				tipocostoAux.setVersionRow(this.tipocosto.getVersionRow());	
				tipocostoAux.setcodigo(this.tipocosto.getcodigo());	
				tipocostoAux.setnombre(this.tipocosto.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocostoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocostoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocostoAux,tipocostoLogic.getTipoCostos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocostoAux,tipocostos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocostoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocostoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocostoLogic.saveTipoCostos();//WithConnection
						//tipocostoLogic.getSetVersionRowTipoCostos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocosto,tipocostoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocostoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocostoAux=new  TipoCosto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocostoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocostoSessionBean.getEsGuardarRelacionado() && this.tipocosto.getId()>=0)) {
						
					tipocostoAux.setIsNew(false);
				}
				
				tipocostoAux.setIsDeleted(false);
			
				tipocostoAux.setId(this.tipocosto.getId());	
				tipocostoAux.setVersionRow(this.tipocosto.getVersionRow());	
				tipocostoAux.setcodigo(this.tipocosto.getcodigo());	
				tipocostoAux.setnombre(this.tipocosto.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocostoAux,tipocostoLogic.getTipoCostos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocostoAux,tipocostos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocostoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocostoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocostoLogic.saveTipoCostos();//WithConnection
						//tipocostoLogic.getSetVersionRowTipoCostos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocosto,tipocostoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocostoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocostoAux=new  TipoCosto();
				
				tipocostoAux.setIsNew(false);
				tipocostoAux.setIsChanged(false);
				
				tipocostoAux.setIsDeleted(true);
				
				tipocostoAux.setId(this.tipocosto.getId());	
				tipocostoAux.setVersionRow(this.tipocosto.getVersionRow());	
				tipocostoAux.setcodigo(this.tipocosto.getcodigo());	
				tipocostoAux.setnombre(this.tipocosto.getnombre());	
				
				if(this.tipocostoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocostoAux.getId()>=0) {	
						this.tipocostosEliminados.add(tipocostoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocostoAux,tipocostoLogic.getTipoCostos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocostoAux,tipocostos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocostoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocostoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocostoLogic.saveTipoCostos();//WithConnection
						//tipocostoLogic.getSetVersionRowTipoCostos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocostoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipocostoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipocostoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipocostoAux,tipocostoLogic.getTipoCostos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipocostoAux,tipocostos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostoLogic.getTipoCostos().addAll(this.tipocostosEliminados);
					
					tipocostoLogic.saveTipoCostos();//WithConnection
					//tipocostoLogic.getSetVersionRowTipoCostos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipocostosEliminados= new ArrayList<TipoCosto>();		
			}
			
			if(this.tipocostoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Costo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Costo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocosto=tipocostoAux;
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
      		//this.finishProcessTipoCosto();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoCosto tipocostoLocal) throws Exception {
		
		if(this.tipocostoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoCosto tipocostoLocal) throws Exception {	
		if(this.tipocostoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoCostoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoCosto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocosto =(TipoCosto) this.tipocostoLogic.getTipoCostos().toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocosto =(TipoCosto) this.tipocostos.toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocostoValidator.getInvalidValues(this.tipocosto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoCosto tipocosto,List<TipoCosto> tipocostos) throws Exception {
		try	{		
			TipoCostoConstantesFunciones.actualizarLista(tipocosto,tipocostos,this.tipocostoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoCosto tipocosto,List<TipoCosto> tipocostos) throws Exception {
		try	{			
			TipoCostoConstantesFunciones.actualizarSelectedLista(tipocosto,tipocostos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoCosto> tipocostosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocostosLocal=this.tipocostoLogic.getTipoCostos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocostosLocal=this.tipocostos;
			}
			//ARCHITECTURE
		
			for(TipoCosto tipocostoLocal:tipocostosLocal) {
				if(this.permiteMantenimiento(tipocostoLocal) && tipocostoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoCostoConstantesFunciones.getTipoCostoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoCostoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCosto.jLabelcodigoTipoCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCostoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCosto.jLabelnombreTipoCosto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoCosto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCosto.jLabelcodigoTipoCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCosto.jLabelnombreTipoCosto,"");
		
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
		this.iIdNuevoTipoCosto--;	
		
		
		this.tipocostoAux=new TipoCosto();
		
		this.tipocostoAux.setId(this.iIdNuevoTipoCosto);
		this.tipocostoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocostoLogic.getTipoCostos().add(this.tipocostoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocostos.add(this.tipocostoAux);
		}
		//ARCHITECTURE
		
		this.tipocosto=this.tipocostoAux;
		
		if(TipoCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoCosto(this.tipocosto);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCosto(this.tipocosto);
		}
				
		//this.setDefaultControlesTipoCosto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoCosto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoCosto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCosto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCosto(this.tipocostoBean,this.tipocosto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCosto(this.tipocosto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoCostoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocostoSessionBean.getConGuardarRelaciones()) {
			classes=TipoCostoConstantesFunciones.getClassesRelationshipsOfTipoCosto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocostoReturnGeneral=tipocostoLogic.procesarEventosTipoCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocostoLogic.getTipoCostos(),this.tipocosto,this.tipocostoParameterGeneral,this.isEsNuevoTipoCosto,classes);//this.tipocostoLogic.getTipoCosto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoCosto(this.tipocostoReturnGeneral,this.tipocostoBean,false);
		
		if(this.tipocostoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCosto(this.tipocostoReturnGeneral.getTipoCosto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoCosto(this.tipocostoReturnGeneral.getTipoCosto());
		}
		
		if(this.tipocostoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoCosto(this.tipocostoReturnGeneral.getTipoCosto(),classes);//this.tipocostoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoCosto(this.tipocosto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoCosto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoCosto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoCosto(false);
						
			if(tipocostoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoCostoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCosto();
			}
			
			this.actualizarVisualTableDatosTipoCosto();
			
			this.jTableDatosTipoCosto.setRowSelectionInterval(this.getIndiceNuevoTipoCosto(), this.getIndiceNuevoTipoCosto());
			
			this.seleccionarFilaTablaTipoCostoActual();
						
			this.actualizarEstadoCeldasBotonesTipoCosto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoCosto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoCosto.jTextFieldcodigoTipoCosto.setEnabled(isHabilitar && this.tipocostoConstantesFunciones.activarcodigoTipoCosto);
		this.jInternalFrameDetalleFormTipoCosto.jTextFieldnombreTipoCosto.setEnabled(isHabilitar && this.tipocostoConstantesFunciones.activarnombreTipoCosto);	
		
	};
	
	public void setDefaultControlesTipoCosto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoCosto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocostoSessionBean.setConGuardarRelaciones(true);			
			this.tipocostoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoCosto.jTabbedPaneRelacionesTipoCosto.setVisible(true);
			
					
		} else {
			//this.tipocostoSessionBean.setConGuardarRelaciones(false);			
			this.tipocostoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoCosto.jTabbedPaneRelacionesTipoCosto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoCosto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCosto tipocostoAux:this.tipocostoLogic.getTipoCostos()) {
				if(tipocostoAux.getId().equals(this.iIdNuevoTipoCosto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCosto tipocostoAux:this.tipocostos) {
				if(tipocostoAux.getId().equals(this.iIdNuevoTipoCosto)) {
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
	
	public int getIndiceActualTipoCosto(TipoCosto tipocosto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCosto tipocostoAux:this.tipocostoLogic.getTipoCostos()) {
				if(tipocostoAux.getId().equals(tipocosto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCosto tipocostoAux:this.tipocostos) {
				if(tipocostoAux.getId().equals(tipocosto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoCosto(TipoCosto tipocostoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCosto tipocostoAux:this.tipocostoLogic.getTipoCostos()) {
				if(tipocostoAux.getTipoCostoOriginal().getId().equals(tipocostoOriginal.getId())) {
					existe=true;
					tipocostoOriginal.setId(tipocostoAux.getId());
					tipocostoOriginal.setVersionRow(tipocostoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCosto tipocostoAux:this.tipocostos) {
				if(tipocostoAux.getTipoCostoOriginal().getId().equals(tipocostoOriginal.getId())) {
					existe=true;
					tipocostoOriginal.setId(tipocostoAux.getId());
					tipocostoOriginal.setVersionRow(tipocostoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoCosto(Boolean esParaCancelar) throws Exception {
		tipocostosAux=new ArrayList<TipoCosto>();
		tipocostoAux=new TipoCosto();
		
		if(!this.tipocostoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCosto tipocostoAux:this.tipocostoLogic.getTipoCostos()) {
					if(tipocostoAux.getId()<0) {
						tipocostosAux.add(tipocostoAux);
					}		
				}
				this.iIdNuevoTipoCosto=0L;
				this.tipocostoLogic.getTipoCostos().removeAll(tipocostosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCosto tipocostoAux:this.tipocostos) {
					if(tipocostoAux.getId()<0) {
						tipocostosAux.add(tipocostoAux);
					}		
				}
				this.iIdNuevoTipoCosto=0L;
				this.tipocostos.removeAll(tipocostosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoCosto 
					&& this.tipocostoLogic.getTipoCostos().size()>0
					) {
					tipocostoAux=this.tipocostoLogic.getTipoCostos().get(this.tipocostoLogic.getTipoCostos().size() - 1);
				
					if(tipocostoAux.getId()<0) {
						this.tipocostoLogic.getTipoCostos().remove(tipocostoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoCosto && this.tipocostos.size()>0) {
					tipocostoAux=this.tipocostos.get(this.tipocostos.size() - 1);
				
					if(tipocostoAux.getId()<0) {
						this.tipocostos.remove(tipocostoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoCosto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocosto.getId()<0) {
				this.tipocostoLogic.getTipoCostos().remove(this.tipocosto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocosto.getId()<0) {
				this.tipocostos.remove(this.tipocosto);
			}
		}			
	}
	
	public void setEstadosInicialesTipoCosto(List<TipoCosto> tipocostosAux) throws Exception {
		TipoCostoConstantesFunciones.setEstadosInicialesTipoCosto(tipocostosAux);
	}
	
	public void setEstadosInicialesTipoCosto(TipoCosto tipocostoAux) throws Exception {
		TipoCostoConstantesFunciones.setEstadosInicialesTipoCosto(tipocostoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoCostoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoCostoActual()) {
				if(!this.isEsNuevoTipoCosto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoCosto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoCostoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Costo ?", "MANTENIMIENTO DE Tipo Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoCosto tipocosto) throws Exception {
		TipoCostoConstantesFunciones.seleccionarAsignar(this.tipocosto,tipocosto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoCosto=this.isPermisoActualizarOriginalTipoCosto;
			
			
			this.seleccionarAsignar(tipocosto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCostoConstantesFunciones.quitarEspaciosTipoCosto(this.tipocosto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoCosto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocostoSessionBean.setsFuncionBusquedaRapida(this.tipocostoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoCosto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoCosto(esParaCancelar);				
				this.cancelarNuevoTipoCosto(esParaCancelar);								
			}
			
			this.tipocosto=new TipoCosto();
			
			this.inicializarTipoCosto();
			
			this.actualizarEstadoCeldasBotonesTipoCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoCosto() throws Exception {
		try {
			TipoCostoConstantesFunciones.inicializarTipoCosto(this.tipocosto);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocostoLogic.getTipoCostos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoCostos(String sAccionBusqueda,List<TipoCosto> tipocostosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoCosto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoCostoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoCostoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoCosto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Costos");		
		parameters.put("busquedapor", TipoCostoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoCosto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoCostoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoCostoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoCosto=new JRBeanArrayDataSource(TipoCostoJInternalFrame.TraerTipoCostoBeans(tipocostosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoCosto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoCostoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoCostoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoCostoBean.TraerTipoCostoBeans(tipocostosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoCostos(sAccionBusqueda,sTipoArchivoReporte,tipocostosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoCostos(sAccionBusqueda,sTipoArchivoReporte,tipocostosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoCostoActionPerformed(null);
					//this.generarExcelReporteTipoCostos(sAccionBusqueda,sTipoArchivoReporte,tipocostosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoCostos(sAccionBusqueda,sTipoArchivoReporte,tipocostosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoCostos(sAccionBusqueda,sTipoArchivoReporte,tipocostosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoCostos(sAccionBusqueda,sTipoArchivoReporte,tipocostosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoCostos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCosto> tipocostosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocosto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCostos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCosto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoCosto tipocosto : tipocostosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoCostoConstantesFunciones.generarExcelReporteDataTipoCosto("NORMAL",row,workbook,tipocosto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoCosto(String sTipo,Row row,Workbook workbook) {
		
		TipoCostoConstantesFunciones.generarExcelReporteHeaderTipoCosto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoCostos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCosto> tipocostosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocosto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCostos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoCosto tipocosto : tipocostosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoCostoConstantesFunciones.getTipoCostoDescripcion(tipocosto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCostoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCostoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocosto.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCostoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCostoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocosto.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoCostos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCosto> tipocostosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoCosto> tipocostosRespaldo=null;
		
		classes=TipoCostoConstantesFunciones.getClassesRelationshipsOfTipoCosto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocostoLogic.setDatosCliente(this.datosCliente);
		this.tipocostoLogic.setDatosDeep(this.datosDeep);
		this.tipocostoLogic.setIsConDeep(true);
		
		tipocostosRespaldo=this.tipocostoLogic.getTipoCostos();
		
		this.tipocostoLogic.setTipoCostos(tipocostosParaReportes);	
		this.tipocostoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocostosParaReportes=this.tipocostoLogic.getTipoCostos();
		this.tipocostoLogic.setTipoCostos(tipocostosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocosto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCostos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCosto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoCosto tipocosto : tipocostosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoCosto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoCostoConstantesFunciones.generarExcelReporteDataTipoCosto("NORMAL",row,workbook,tipocosto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoCostoConstantesFunciones.getTipoCostoDescripcion(tipocosto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCosto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCosto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCosto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCosto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoCosto() throws Exception {		
		this.startProcessTipoCosto(true);
	}
	
	public void startProcessTipoCosto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoCosto, this.jScrollPanelDatosTipoCosto,this.jPanelPaginacionTipoCosto, this.jScrollPanelDatosEdicionTipoCosto, this.jPanelAccionesTipoCosto,this.jPanelAccionesFormularioTipoCosto,this.jmenuBarTipoCosto,this.jmenuBarDetalleTipoCosto,this.jTtoolBarTipoCosto,this.jTtoolBarDetalleTipoCosto);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCosto=null; 
		
		final JPanel jPanelParametrosReportesTipoCosto=this.jPanelParametrosReportesTipoCosto;
		//final JScrollPane jScrollPanelDatosTipoCosto=this.jScrollPanelDatosTipoCosto;
		final JTable jTableDatosTipoCosto=this.jTableDatosTipoCosto;		
		final JPanel jPanelPaginacionTipoCosto=this.jPanelPaginacionTipoCosto;
		//final JScrollPane jScrollPanelDatosEdicionTipoCosto=this.jScrollPanelDatosEdicionTipoCosto;
		final JPanel jPanelAccionesTipoCosto=this.jPanelAccionesTipoCosto;
		
		JPanel jPanelCamposAuxiliarTipoCosto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoCosto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoCosto!=null) {
			jPanelCamposAuxiliarTipoCosto=this.jInternalFrameDetalleFormTipoCosto.jPanelCamposTipoCosto;
			jPanelAccionesFormularioAuxiliarTipoCosto=this.jInternalFrameDetalleFormTipoCosto.jPanelAccionesFormularioTipoCosto;
		}
		
		final JPanel jPanelCamposTipoCosto=jPanelCamposAuxiliarTipoCosto;
		final JPanel jPanelAccionesFormularioTipoCosto=jPanelAccionesFormularioAuxiliarTipoCosto;
		
		
		final JMenuBar jmenuBarTipoCosto=this.jmenuBarTipoCosto;
		final JToolBar jTtoolBarTipoCosto=this.jTtoolBarTipoCosto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoCosto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCosto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoCosto!=null) {
			jmenuBarDetalleAuxiliarTipoCosto=this.jInternalFrameDetalleFormTipoCosto.jmenuBarDetalleTipoCosto;
			jTtoolBarDetalleAuxiliarTipoCosto=this.jInternalFrameDetalleFormTipoCosto.jTtoolBarDetalleTipoCosto;
		}
		
		final JMenuBar jmenuBarDetalleTipoCosto=jmenuBarDetalleAuxiliarTipoCosto;
		final JToolBar jTtoolBarDetalleTipoCosto=jTtoolBarDetalleAuxiliarTipoCosto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCosto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCosto;
			processRunnable.jTableDatos=jTableDatosTipoCosto;
			processRunnable.jPanelCampos=jPanelCamposTipoCosto;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCosto;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCosto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCosto;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCosto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCosto;
			processRunnable.jTtoolBar=jTtoolBarTipoCosto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCosto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCosto ,jPanelParametrosReportesTipoCosto,jTableDatosTipoCosto, /*jScrollPanelDatosTipoCosto,*/jPanelCamposTipoCosto,jPanelPaginacionTipoCosto, /*jScrollPanelDatosEdicionTipoCosto,*/ jPanelAccionesTipoCosto,jPanelAccionesFormularioTipoCosto,jmenuBarTipoCosto,jmenuBarDetalleTipoCosto,jTtoolBarTipoCosto,jTtoolBarDetalleTipoCosto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoCosto, jScrollPanelDatosTipoCosto,jPanelPaginacionTipoCosto, jScrollPanelDatosEdicionTipoCosto, jPanelAccionesTipoCosto,jPanelAccionesFormularioTipoCosto,jmenuBarTipoCosto,jmenuBarDetalleTipoCosto,jTtoolBarTipoCosto,jTtoolBarDetalleTipoCosto);
						
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
	
	public void finishProcessTipoCosto() {// throws Exception 
		this.finishProcessTipoCosto(true);
	}
	
	public void finishProcessTipoCosto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoCosto, this.jScrollPanelDatosTipoCosto,this.jPanelPaginacionTipoCosto, this.jScrollPanelDatosEdicionTipoCosto, this.jPanelAccionesTipoCosto,this.jPanelAccionesFormularioTipoCosto,this.jmenuBarTipoCosto,this.jmenuBarDetalleTipoCosto,this.jTtoolBarTipoCosto,this.jTtoolBarDetalleTipoCosto);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCosto=null; 
		
		final JPanel jPanelParametrosReportesTipoCosto=this.jPanelParametrosReportesTipoCosto;
		//final JScrollPane jScrollPanelDatosTipoCosto=this.jScrollPanelDatosTipoCosto;
		final JTable jTableDatosTipoCosto=this.jTableDatosTipoCosto;		
		final JPanel jPanelPaginacionTipoCosto=this.jPanelPaginacionTipoCosto;
		//final JScrollPane jScrollPanelDatosEdicionTipoCosto=this.jScrollPanelDatosEdicionTipoCosto;
		final JPanel jPanelAccionesTipoCosto=this.jPanelAccionesTipoCosto;
		
		JPanel jPanelCamposAuxiliarTipoCosto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoCosto=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoCosto!=null) {
			jPanelCamposAuxiliarTipoCosto=this.jInternalFrameDetalleFormTipoCosto.jPanelCamposTipoCosto;
			jPanelAccionesFormularioAuxiliarTipoCosto=this.jInternalFrameDetalleFormTipoCosto.jPanelAccionesFormularioTipoCosto;
		}
		
		final JPanel jPanelCamposTipoCosto=jPanelCamposAuxiliarTipoCosto;
		final JPanel jPanelAccionesFormularioTipoCosto=jPanelAccionesFormularioAuxiliarTipoCosto;
		
		
		final JMenuBar jmenuBarTipoCosto=this.jmenuBarTipoCosto;		
		final JToolBar jTtoolBarTipoCosto=this.jTtoolBarTipoCosto;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoCosto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCosto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoCosto!=null) {
			jmenuBarDetalleAuxiliarTipoCosto=this.jInternalFrameDetalleFormTipoCosto.jmenuBarDetalleTipoCosto;
			jTtoolBarDetalleAuxiliarTipoCosto=this.jInternalFrameDetalleFormTipoCosto.jTtoolBarDetalleTipoCosto;		
		}
		
		final JMenuBar jmenuBarDetalleTipoCosto=jmenuBarDetalleAuxiliarTipoCosto;
		final JToolBar jTtoolBarDetalleTipoCosto=jTtoolBarDetalleAuxiliarTipoCosto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCosto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCosto;
			processRunnable.jTableDatos=jTableDatosTipoCosto;
			processRunnable.jPanelCampos=jPanelCamposTipoCosto;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCosto;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCosto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCosto;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCosto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCosto;
			processRunnable.jTtoolBar=jTtoolBarTipoCosto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCosto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoCosto ,jPanelParametrosReportesTipoCosto, jTableDatosTipoCosto,/*jScrollPanelDatosTipoCosto,*/jPanelCamposTipoCosto,jPanelPaginacionTipoCosto, /*jScrollPanelDatosEdicionTipoCosto,*/ jPanelAccionesTipoCosto,jPanelAccionesFormularioTipoCosto,jmenuBarTipoCosto,jmenuBarDetalleTipoCosto,jTtoolBarTipoCosto,jTtoolBarDetalleTipoCosto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoCosto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoCosto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoCosto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoCosto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoCosto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoCosto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoCosto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoCosto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoCosto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocostoConstantesFunciones.getsFinalQueryTipoCosto();
		String  finalQueryPaginacionTodos=this.tipocostoConstantesFunciones.getsFinalQueryTipoCosto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoCostoConstantesFunciones.getArrayColumnasGlobalesNoTipoCosto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoCostoConstantesFunciones.getArrayColumnasGlobalesTipoCosto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoCostoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocostosEliminados= new ArrayList<TipoCosto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoCosto();
		
				///*TipoCostoSessionBean*/this.tipocostoSessionBean=new TipoCostoSessionBean();
			
			if(this.tipocostoSessionBean==null) {
				this.tipocostoSessionBean=new TipoCostoSessionBean();
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
					this.iNumeroPaginacion=TipoCostoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoCostoConstantesFunciones.getClassesForeignKeysOfTipoCosto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocosto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocostosAux= new ArrayList<TipoCosto>();
			
				
			tipocostoLogic.setDatosCliente(this.datosCliente);
			tipocostoLogic.setDatosDeep(this.datosDeep);
			tipocostoLogic.setIsConDeep(true);
			
			
			tipocostoLogic.getTipoCostoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocostoLogic.getTodosTipoCostos(finalQueryGlobal,pagination);
					
					//tipocostoLogic.getTodosTipoCostosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocostoLogic.getTipoCostos()==null|| tipocostoLogic.getTipoCostos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocostosAux= new ArrayList<TipoCosto>();
							tipocostosAux.addAll(tipocostoLogic.getTipoCostos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocostosAux= new ArrayList<TipoCosto>();
							tipocostosAux.addAll(tipocostos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocostoLogic.getTodosTipoCostos(finalQueryGlobal+"",this.pagination);												
							
							//tipocostoLogic.getTodosTipoCostosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoCostos("Todos",tipocostoLogic.getTipoCostos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocostoLogic.setTipoCostos(new ArrayList<TipoCosto>());					
							tipocostoLogic.getTipoCostos().addAll(tipocostosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocostos=new ArrayList<TipoCosto>();
							tipocostos.addAll(tipocostosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoCosto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoCosto=this.idActual;
				
				} else if(this.idTipoCostoActual!=null && this.idTipoCostoActual!=0L) {
					idTipoCosto=idTipoCostoActual;
				}
				
					
				this.sDetalleReporte=TipoCostoConstantesFunciones.getDetalleIndicePorId(idTipoCosto);
				
				this.tipocostos=new ArrayList<TipoCosto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocostoLogic.getEntity(idTipoCosto);
					
					//tipocostoLogic.getEntityWithConnection(idTipoCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocostoLogic.setTipoCostos(new ArrayList<TipoCosto>());
					tipocostoLogic.getTipoCostos().add(tipocostoLogic.getTipoCosto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocostos=new ArrayList<TipoCosto>();
					this.tipocostos.add(tipocosto);
				}
				
				if(tipocostoLogic.getTipoCosto()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoCosto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoCosto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocostoLogic.getTipoCostos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocostos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocostoLogic.getTipoCostos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocostos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoCosto tipocosto) {
		Boolean permite=true;
		
		if(this.tipocosto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoCostoConstantesFunciones.getOrderByListaTipoCosto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoCostoConstantesFunciones.getOrderByListaTipoCosto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCosto tipocosto:tipocostoLogic.getTipoCostos()) {
				if(tipocosto.getsType().equals(Constantes2.S_TOTALES)) {
					tipocostoTotales=tipocosto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCosto tipocosto:this.tipocostos) {
				if(tipocosto.getsType().equals(Constantes2.S_TOTALES)) {
					tipocostoTotales=tipocosto;
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
			this.tipocostoAux=new TipoCosto();
			this.tipocostoAux.setsType(Constantes2.S_TOTALES);
			this.tipocostoAux.setIsNew(false);
			this.tipocostoAux.setIsChanged(false);
			this.tipocostoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoCostoConstantesFunciones.TotalizarValoresFilaTipoCosto(this.tipocostoLogic.getTipoCostos(),this.tipocostoAux);
				
				this.tipocostoLogic.getTipoCostos().add(this.tipocostoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoCostoConstantesFunciones.TotalizarValoresFilaTipoCosto(this.tipocostos,this.tipocostoAux);
				
				this.tipocostos.add(this.tipocostoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocostoTotales=new TipoCosto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocostoLogic.getTipoCostos().remove(tipocostoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocostos.remove(tipocostoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocostoTotales=new TipoCosto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCosto tipocosto:tipocostoLogic.getTipoCostos()) {
				if(tipocosto.getsType().equals(Constantes2.S_TOTALES)) {
					tipocostoTotales=tipocosto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCostoConstantesFunciones.TotalizarValoresFilaTipoCosto(this.tipocostoLogic.getTipoCostos(),tipocostoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCosto tipocosto:this.tipocostos) {
				if(tipocosto.getsType().equals(Constantes2.S_TOTALES)) {
					tipocostoTotales=tipocosto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCostoConstantesFunciones.TotalizarValoresFilaTipoCosto(this.tipocostos,tipocostoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoCosto() {
		this.isPermisoTodoTipoCosto=false;
		this.isPermisoNuevoTipoCosto=false;
		this.isPermisoActualizarTipoCosto=false;
		this.isPermisoActualizarOriginalTipoCosto=false;
		this.isPermisoEliminarTipoCosto=false;
		this.isPermisoGuardarCambiosTipoCosto=false;
		this.isPermisoConsultaTipoCosto=false;
		this.isPermisoBusquedaTipoCosto=false;
		this.isPermisoReporteTipoCosto=false;		
		this.isPermisoOrdenTipoCosto=false;		
		this.isPermisoPaginacionMedioTipoCosto=false;		
		this.isPermisoPaginacionAltoTipoCosto=false;
		this.isPermisoPaginacionTodoTipoCosto=false;
		this.isPermisoCopiarTipoCosto=false;		
		this.isPermisoVerFormTipoCosto=false;		
		this.isPermisoDuplicarTipoCosto=false;		
		this.isPermisoOrdenTipoCosto=false;		
	}
	
	public void setPermisosUsuarioTipoCosto(Boolean isPermiso) {
		this.isPermisoTodoTipoCosto=isPermiso;
		this.isPermisoNuevoTipoCosto=isPermiso;
		this.isPermisoActualizarTipoCosto=isPermiso;
		this.isPermisoActualizarOriginalTipoCosto=isPermiso;
		this.isPermisoEliminarTipoCosto=isPermiso;
		this.isPermisoGuardarCambiosTipoCosto=isPermiso;
		this.isPermisoConsultaTipoCosto=isPermiso;
		this.isPermisoBusquedaTipoCosto=isPermiso;
		this.isPermisoReporteTipoCosto=isPermiso;
		this.isPermisoOrdenTipoCosto=isPermiso;		
		this.isPermisoPaginacionMedioTipoCosto=isPermiso;		
		this.isPermisoPaginacionAltoTipoCosto=isPermiso;		
		this.isPermisoPaginacionTodoTipoCosto=isPermiso;		
		this.isPermisoCopiarTipoCosto=isPermiso;		
		this.isPermisoVerFormTipoCosto=isPermiso;		
		this.isPermisoDuplicarTipoCosto=isPermiso;
		this.isPermisoOrdenTipoCosto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoCosto(Boolean isPermiso) {
		//this.isPermisoTodoTipoCosto=isPermiso;
		this.isPermisoNuevoTipoCosto=isPermiso;
		this.isPermisoActualizarTipoCosto=isPermiso;
		this.isPermisoActualizarOriginalTipoCosto=isPermiso;
		this.isPermisoEliminarTipoCosto=isPermiso;
		this.isPermisoGuardarCambiosTipoCosto=isPermiso;
		//this.isPermisoConsultaTipoCosto=isPermiso;
		//this.isPermisoBusquedaTipoCosto=isPermiso;
		//this.isPermisoReporteTipoCosto=isPermiso;
		//this.isPermisoOrdenTipoCosto=isPermiso;		
		//this.isPermisoPaginacionMedioTipoCosto=isPermiso;		
		//this.isPermisoPaginacionAltoTipoCosto=isPermiso;		
		//this.isPermisoPaginacionTodoTipoCosto=isPermiso;		
		//this.isPermisoCopiarTipoCosto=isPermiso;		
		//this.isPermisoDuplicarTipoCosto=isPermiso;
		//this.isPermisoOrdenTipoCosto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoCostoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoCosto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoCostoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoCostoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoCostoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoCostoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoCosto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocostoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoCostoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoCosto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoCosto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoCosto=this.isPermisoActualizarTipoCosto;
			this.isPermisoEliminarTipoCosto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoCosto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoCosto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoCosto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoCosto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoCosto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCosto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoCosto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoCosto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoCosto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoCosto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoCosto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoCosto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCosto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocostoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoCosto.setToolTipText(this.jTableDatosTipoCosto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoCosto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoCosto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoCosto() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoCostoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoCostoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoCostoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoCostoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoCostoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoCosto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoCosto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoCosto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoCosto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCosto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoCosto(TipoCosto tipocosto)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoCosto(TipoCosto tipocosto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoCosto()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCosto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoCosto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoCosto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoCosto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoCosto()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoCosto(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoCosto()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoCostoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoCostoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoCostoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocostoSessionBean=new TipoCostoSessionBean(); 
		this.tipocostoConstantesFunciones=new TipoCostoConstantesFunciones(); 
		this.tipocostoBean=new TipoCosto();//(this.tipocostoConstantesFunciones); 		
		this.tipocostoReturnGeneral=new TipoCostoParameterReturnGeneral(); 
		
		this.tipocostoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocostoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoCostoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoCostoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoCostoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoCosto(true);
			
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
			
			this.tipocostoConstantesFunciones=new TipoCostoConstantesFunciones(); 
			this.tipocostoBean=new TipoCosto();//this.tipocostoConstantesFunciones); 			
			this.tipocostoReturnGeneral=new TipoCostoParameterReturnGeneral(); 
		
			TipoCostoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Costo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipocosto=new TipoCosto();
			this.tipocostos = new ArrayList<TipoCosto>();
			this.tipocostosAux = new ArrayList<TipoCosto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic=new TipoCostoLogic();
				this.tipocostoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocostoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocostoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoCosto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoCosto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCosto);	
					}
					
					if(this.jInternalFrameImportacionTipoCosto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCosto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoCosto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoCosto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoCosto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCosto);
				this.jInternalFrameDetalleFormTipoCosto.setVisible(false);
				this.jInternalFrameDetalleFormTipoCosto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoCosto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCosto);
					this.jInternalFrameReporteDinamicoTipoCosto.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoCosto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoCosto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoCosto);
					this.jInternalFrameImportacionTipoCosto.setVisible(false);
					this.jInternalFrameImportacionTipoCosto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoCosto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoCosto);
					this.jInternalFrameOrderByTipoCosto.setVisible(false);
					this.jInternalFrameOrderByTipoCosto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoCostoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoCostoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocostoReturnGeneral=new TipoCostoParameterReturnGeneral();
			
			this.tipocostoParameterGeneral=new TipoCostoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocostoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocostoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocostoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCostoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocostoSessionBean.getEsGuardarRelacionado(),this.tipocostoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCostoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocostoSessionBean.getEsGuardarRelacionado(),this.tipocostoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoCosto=false;
			this.isVisibilidadCeldaDuplicarTipoCosto=true;
			this.isVisibilidadCeldaCopiarTipoCosto=true;
			this.isVisibilidadCeldaVerFormTipoCosto=true;
			this.isVisibilidadCeldaOrdenTipoCosto=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCosto=false;
			this.isVisibilidadCeldaModificarTipoCosto=false;
			this.isVisibilidadCeldaActualizarTipoCosto=false;
			this.isVisibilidadCeldaEliminarTipoCosto=false;
			this.isVisibilidadCeldaCancelarTipoCosto=false;
			this.isVisibilidadCeldaGuardarTipoCosto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCosto=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoCosto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoCosto(false);
			
			this.setPermisosUsuarioTipoCosto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocostoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocostoSessionBean.getEsGuardarRelacionado() && this.tipocostoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoCostoClasesRelacionadas();
			}
			
			if(this.tipocostoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoCostoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoCostoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoCosto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoCosto();
			}
			
			if(!this.isPermisoBusquedaTipoCosto) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocostoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoCosto,this.isPermisoPaginacionMedioTipoCosto,this.isPermisoPaginacionTodoTipoCosto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoCostoConstantesFunciones.getTiposSeleccionarTipoCosto());
				
				this.tiposColumnasSelect=TipoCostoConstantesFunciones.getTiposSeleccionarTipoCosto(true);
				
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
			//if(!this.tipocostoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoCosto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoCosto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoCosto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCosto() ;
			
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
				tipocostoImplementable= (TipoCostoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCostoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocostoImplementableHome= (TipoCostoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCostoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocostos= new ArrayList<TipoCosto>();
			this.tipocostosEliminados= new ArrayList<TipoCosto>();
						
			this.isEsNuevoTipoCosto=false;
			this.esParaAccionDesdeFormularioTipoCosto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoCosto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoCosto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocostoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoCostoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoCosto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoCosto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoCosto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoCosto();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoCosto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoCosto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoCosto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoCosto")) {
				iIndex=this.jInternalFrameDetalleFormTipoCosto.jTabbedPaneRelacionesTipoCosto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoCosto.jTabbedPaneRelacionesTipoCosto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoCosto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoCosto();	
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
	
	public void cargarCombosForeignKeyTipoCosto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoCosto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoCosto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoCostoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoCosto();
		
		this.cargarCombosFrameForeignKeyTipoCosto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoCosto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoCosto();
		}
	}
	
	
	
	public void jButtonNuevoTipoCostoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocostoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
			
			
			if(jTableDatosTipoCosto.getRowCount()>=1) {
				jTableDatosTipoCosto.removeRowSelectionInterval(0, jTableDatosTipoCosto.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoCosto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoCosto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoCosto(true);			
			//this.tipocosto=new TipoCosto();
			//this.tipocosto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCosto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCosto() ;
			
			if(TipoCostoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCosto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocosto);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocosto);				
			
			TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
			
			if(this.tipocostoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoCosto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoCostoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoCosto> tipocostosSeleccionados=new ArrayList<TipoCosto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoCosto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoCosto.getSelectedRows().length;			
			}
			
			tipocostosSeleccionados=this.getTipoCostosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoCosto--;			
				//TipoCosto tipocostoAux= new TipoCosto();			
				//tipocostoAux.setId(this.iIdNuevoTipoCosto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoCosto tipocostoOrigen=new TipoCosto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoCosto tipocostoOrigen : tipocostosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoCosto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocostoOrigen =(TipoCosto) this.tipocostoLogic.getTipoCostos().toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocostoOrigen =(TipoCosto) this.tipocostos.toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoCosto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocosto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoCosto(tipocostoOrigen,this.tipocosto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosto(this.tipocosto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocostoLogic.getTipoCostos().add(this.tipocostoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocostos.add(this.tipocostoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoCosto(false);
				
				this.jTableDatosTipoCosto.setRowSelectionInterval(this.getIndiceNuevoTipoCosto(), this.getIndiceNuevoTipoCosto());
				
				int iLastRow =  this.jTableDatosTipoCosto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCosto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCosto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCosto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoCosto> tipocostosSeleccionados=new ArrayList<TipoCosto>();									
		
			TipoCosto tipocostoOrigen=new TipoCosto();
			TipoCosto tipocostoDestino=new TipoCosto();
				
			tipocostosSeleccionados=this.getTipoCostosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoCosto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocostosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoCosto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocostoOrigen =(TipoCosto) this.tipocostoLogic.getTipoCostos().toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocostoOrigen =(TipoCosto) this.tipocostos.toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocostoDestino =(TipoCosto) this.tipocostoLogic.getTipoCostos().toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocostoDestino =(TipoCosto) this.tipocostos.toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocostoOrigen =tipocostosSeleccionados.get(0);
				tipocostoDestino =tipocostosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoCosto(tipocostoOrigen,tipocostoDestino,true,false);
				
				tipocostoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocostoDestino,tipocostoLogic.getTipoCostos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocostoDestino,tipocostos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoCosto(false);
				
				//this.jTableDatosTipoCosto.setRowSelectionInterval(this.getIndiceNuevoTipoCosto(), this.getIndiceNuevoTipoCosto());
				
				int iLastRow =  this.jTableDatosTipoCosto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCosto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCosto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCosto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoCosto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoCosto.isVisible();
			
			
			this.jPanelParametrosReportesTipoCosto.setVisible(!isVisible);
			this.jPanelPaginacionTipoCosto.setVisible(!isVisible);
			this.jPanelAccionesTipoCosto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoCosto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoCosto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoCosto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoCosto();
			
			this.abrirFrameOrderByTipoCosto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoCosto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoCosto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCosto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoCosto.isMaximum()) {
					this.jInternalFrameDetalleFormTipoCosto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoCosto.setSize(this.jInternalFrameDetalleFormTipoCosto.iWidthFormulario,this.jInternalFrameDetalleFormTipoCosto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoCosto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoCosto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoCosto.isMaximum()) {
						this.jInternalFrameDetalleFormTipoCosto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoCosto.jContentPaneDetalleTipoCosto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoCosto.jTabbedPaneRelacionesTipoCosto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoCosto.jContentPaneDetalleTipoCosto.getWidth(),TipoCostoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCosto.jTabbedPaneRelacionesTipoCosto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoCosto.jContentPaneDetalleTipoCosto.getWidth(),TipoCostoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCosto.jTabbedPaneRelacionesTipoCosto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoCosto.jContentPaneDetalleTipoCosto.getWidth(),TipoCostoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoCosto.setVisible(true);
	        this.jInternalFrameDetalleFormTipoCosto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoCosto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoCosto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoCosto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCosto,false,this);
				} else {
					this.jInternalFrameOrderByTipoCosto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCosto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoCosto);
				this.jInternalFrameOrderByTipoCosto.setVisible(false);
				this.jInternalFrameOrderByTipoCosto.setSelected(false);
				
				this.jInternalFrameOrderByTipoCosto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCosto"));
				
				this.inicializarActualizarBindingTablaOrderByTipoCosto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoCosto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoCosto==null) {
				
				this.jInternalFrameImportacionTipoCosto=new ImportacionJInternalFrame(TipoCostoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCosto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoCosto);
				this.jInternalFrameImportacionTipoCosto.setVisible(false);
				this.jInternalFrameImportacionTipoCosto.setSelected(false);


				this.jInternalFrameImportacionTipoCosto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCosto"));
				this.jInternalFrameImportacionTipoCosto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCosto"));
				this.jInternalFrameImportacionTipoCosto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCosto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoCosto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoCosto==null) {
				this.jInternalFrameReporteDinamicoTipoCosto=new ReporteDinamicoJInternalFrame(TipoCostoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCosto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCosto);
				this.jInternalFrameReporteDinamicoTipoCosto.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoCosto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoCosto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCosto"));
				this.jInternalFrameReporteDinamicoTipoCosto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCosto"));
				this.jInternalFrameReporteDinamicoTipoCosto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCosto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCosto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoCosto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCosto);
			
	       	this.jInternalFrameDetalleFormTipoCosto.setVisible(false);
	        this.jInternalFrameDetalleFormTipoCosto.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoCosto.dispose();
			//this.jInternalFrameDetalleFormTipoCosto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoCosto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoCosto.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoCosto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoCosto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoCosto.setVisible(true);
	        this.jInternalFrameImportacionTipoCosto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoCosto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoCosto.setVisible(true);
	        this.jInternalFrameOrderByTipoCosto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoCosto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoCosto.setVisible(false);
	        this.jInternalFrameOrderByTipoCosto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoCosto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoCosto.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoCosto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoCosto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoCosto.setVisible(false);
	        this.jInternalFrameImportacionTipoCosto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoCosto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoCosto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCosto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoCosto(true);
			//this.isEsNuevoTipoCosto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosto =(TipoCosto) this.tipocostoLogic.getTipoCostos().toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocosto =(TipoCosto) this.tipocostos.toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoCosto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCosto(false) ;
			
			if(tipocostoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoCostoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCosto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCosto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoCostoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosto =(TipoCosto) this.tipocostoLogic.getTipoCostos().toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocosto =(TipoCosto) this.tipocostos.toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoCosto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCosto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoCosto(true);
			//this.isEsNuevoTipoCosto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosto =(TipoCosto) this.tipocostoLogic.getTipoCostos().toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocosto =(TipoCosto) this.tipocostos.toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocosto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoCosto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoCosto(false) ;
			
			if(TipoCostoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCosto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCosto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoCostoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoCosto(false);
			
			//if(!this.isEsNuevoTipoCosto) {								
				int intSelectedRow = this.jTableDatosTipoCosto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosto =(TipoCosto) this.tipocostoLogic.getTipoCostos().toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocosto =(TipoCosto) this.tipocostos.toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoCosto(this.tipocosto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCosto(this.tipocosto);
				
			}
			
			if(this.permiteMantenimiento(this.tipocosto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocostoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoCosto=true;
					this.inicializarActualizarBindingTablaTipoCosto(false);
					this.isEsNuevoTipoCosto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoCosto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoCosto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCosto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCosto(false);
				
				this.habilitarDeshabilitarControlesTipoCosto(false);
			
												
				
				if(TipoCostoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoCosto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoCostoActionPerformed(evt,tipocostoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoCosto(this.tipocosto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoCosto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocostoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocosto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoCosto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoCostoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoCosto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosto =(TipoCosto) this.tipocostoLogic.getTipoCostos().toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
				this.tipocosto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocosto =(TipoCosto) this.tipocostos.toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
				this.tipocosto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocosto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocostoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoCostoModel) this.jTableDatosTipoCosto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoCosto=true;
				this.inicializarActualizarBindingTablaTipoCosto(false);
				this.isEsNuevoTipoCosto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCosto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCosto(false);
				
				this.habilitarDeshabilitarControlesTipoCosto(false);
				
				
				
				if(TipoCostoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoCosto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoCostoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoCosto.getRowCount()>=1) {
				jTableDatosTipoCosto.removeRowSelectionInterval(0, jTableDatosTipoCosto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoCosto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoCosto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCosto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCosto(false) ;
			
			this.isEsNuevoTipoCosto=false;
			
			if(TipoCostoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoCosto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoCosto(false);
				
				//SI ES MANUAL
				if(TipoCostoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoCosto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoCosto--;			
			//TipoCosto tipocostoAux= new TipoCosto();			
			//tipocostoAux.setId(this.iIdNuevoTipoCosto);
			
			if(this.jInternalFrameDetalleFormTipoCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoCosto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoCosto(this.tipocosto);
			
			this.tipocosto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocostoLogic.getTipoCostos().add(this.tipocostoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocostos.add(this.tipocostoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoCosto(false);
			
			this.jTableDatosTipoCosto.setRowSelectionInterval(this.getIndiceNuevoTipoCosto(), this.getIndiceNuevoTipoCosto());
			
			int iLastRow =  this.jTableDatosTipoCosto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoCosto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoCosto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoCosto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoCosto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCosto(false);
			
			//SI ES MANUAL
			if(TipoCostoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCosto();
			}
			
			//this.abrirFrameTreeTipoCosto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoCostoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo CostoS ?", "MANTENIMIENTO DE Tipo Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoCosto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoCosto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocostoReturnGeneral=tipocostoLogic.procesarImportacionTipoCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocostoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoCostoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoCostoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoCosto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoCosto.setFileImportacion(this.jInternalFrameImportacionTipoCosto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoCosto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoCosto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoCosto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoCosto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoCostoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoCosto> tipocostosSeleccionados=new ArrayList<TipoCosto>();		

		tipocostosSeleccionados=this.getTipoCostosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCosto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCosto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoCostoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoCostoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoCostos("Todos",tipocostosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCosto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCosto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCostoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCostoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoCosto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCosto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCosto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoCostoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoCostoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoCosto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoCostoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoCostoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoCosto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCosto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCostoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoCostoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoCostoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoCosto> tipocostosSeleccionados=new ArrayList<TipoCosto>();		
		
		tipocostosSeleccionados=this.getTipoCostosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocosto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoCostos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoCosto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCosto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoCostoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCostoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoCosto tipocosto:tipocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocosto.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCostoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCostoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoCosto tipocosto:tipocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocosto.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoCosto(row);				
			//	iRow++;
			//}				
			
			//for(TipoCosto tipocostoAux:tipocostosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoCosto(tipocostoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocostoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCosto(false);
			
			//SI ES MANUAL
			if(TipoCostoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCosto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCosto(false);
			
			//SI ES MANUAL
			if(TipoCostoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCosto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCosto(false);
			
			//SI ES MANUAL
			if(TipoCostoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCosto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoCosto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoCosto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoCosto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoCosto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoCosto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoCosto.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoCosto.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoCosto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoCosto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoCosto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoCosto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoCosto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoCosto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocostoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoCosto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCosto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoCosto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoCostoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoCostoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoCosto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoCosto();
		
		this.inicializarActualizarBindingBotonesManualTipoCosto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocostoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCosto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCosto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCosto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCosto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoCosto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoCosto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoCosto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoCosto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoCosto.jCheckBoxPostAccionNuevoTipoCosto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoCosto.jCheckBoxPostAccionSinCerrarTipoCosto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoCosto.jCheckBoxPostAccionSinMensajeTipoCosto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoCosto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoCosto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoCosto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoCosto!=null) {
				this.jInternalFrameDetalleFormTipoCosto.jCheckBoxPostAccionNuevoTipoCosto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoCosto.jCheckBoxPostAccionSinCerrarTipoCosto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoCosto.jCheckBoxPostAccionSinMensajeTipoCosto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoCosto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoCosto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoCosto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoCosto.jComboBoxTiposAccionesFormularioTipoCosto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoCosto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoCosto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCosto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoCosto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoCosto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoCosto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoCosto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoCosto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCosto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoCosto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoCosto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoCosto(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoCostoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCosto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoCosto() throws Exception {
		try	{
			if(TipoCostoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCosto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCosto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoCosto.jComboBoxTiposAccionesFormularioTipoCosto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoCosto.jComboBoxTiposAccionesFormularioTipoCosto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCosto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoCosto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoCosto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoCosto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoCosto.addItem(reporte);
			}
			
			
			if(!this.tipocostoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoCosto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoCosto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoCosto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoCosto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoCosto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoCosto.jComboBoxTiposAccionesFormularioTipoCosto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoCosto.jComboBoxTiposAccionesFormularioTipoCosto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoCosto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoCosto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCosto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCosto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCosto!=null) {
				this.jInternalFrameReporteDinamicoTipoCosto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCosto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCosto!=null) {
				this.jInternalFrameReporteDinamicoTipoCosto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCosto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoCosto!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoCosto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCosto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCosto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoCosto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCosto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCosto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoCosto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoCosto(Boolean esInicializar) throws Exception {				
		if(TipoCostoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCosto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoCosto() throws Exception {
		this.inicializarActualizarBindingTablaTipoCosto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoCosto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoCosto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoCosto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCosto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoCostoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoCosto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCosto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoCostoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoCostoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCostoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoCostoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoCosto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCosto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoCostoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoCosto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoCosto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocostoLogic.getTipoCostos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocostos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoCosto.setModel(new TipoCostoModel(this.tipocostoLogic.getTipoCostos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoCosto.setModel(new TipoCostoModel(this.tipocostos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoCosto!=null && this.jInternalFrameOrderByTipoCosto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoCosto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCosto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoCostoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoCostoConstantesFunciones.SCLASSWEBTITULO,tipocostoConstantesFunciones.resaltarSeleccionarTipoCosto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoCostoConstantesFunciones.SCLASSWEBTITULO,tipocostoConstantesFunciones.resaltarSeleccionarTipoCosto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCosto,TipoCostoConstantesFunciones.LABEL_ID));

		if(this.tipocostoConstantesFunciones.mostraridTipoCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCostoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocostoConstantesFunciones.resaltaridTipoCosto,this.tipocostoConstantesFunciones.activaridTipoCosto,this,true,"idTipoCosto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocostoConstantesFunciones.resaltaridTipoCosto,this.tipocostoConstantesFunciones.activaridTipoCosto,this,true,"idTipoCosto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCosto,TipoCostoConstantesFunciones.LABEL_CODIGO));

		if(this.tipocostoConstantesFunciones.mostrarcodigoTipoCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCostoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocostoConstantesFunciones.resaltarcodigoTipoCosto,this.tipocostoConstantesFunciones.activarcodigoTipoCosto,this,true,"codigoTipoCosto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocostoConstantesFunciones.resaltarcodigoTipoCosto,this.tipocostoConstantesFunciones.activarcodigoTipoCosto,this,true,"codigoTipoCosto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCosto,TipoCostoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipocostoConstantesFunciones.mostrarnombreTipoCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCostoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocostoConstantesFunciones.resaltarnombreTipoCosto,this.tipocostoConstantesFunciones.activarnombreTipoCosto,this,true,"nombreTipoCosto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocostoConstantesFunciones.resaltarnombreTipoCosto,this.tipocostoConstantesFunciones.activarnombreTipoCosto,this,true,"nombreTipoCosto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocostoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocostoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocostoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCosto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocostoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocostoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCosto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoCosto && this.isPermisoGuardarCambiosTipoCosto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocostoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocostoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoCosto.addColumn(tableColumn);
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
			
			this.jTableDatosTipoCosto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCosto && this.isPermisoGuardarCambiosTipoCosto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCosto && this.isPermisoGuardarCambiosTipoCosto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoCosto.moveColumn(this.jTableDatosTipoCosto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoCosto.moveColumn(this.jTableDatosTipoCosto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoCosto.moveColumn(this.jTableDatosTipoCosto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoCosto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoCosto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoCosto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoCosto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoCosto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoCosto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoCosto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoCosto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocostoLogic.getTipoCostos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocostos.size()-1;
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
		//this.jTableDatosTipoCosto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoCosto();
			
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
				
				//this.isEsNuevoTipoCosto=false;
					
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
			
				if(this.tipocostoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoCosto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCosto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCosto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosto =(TipoCosto) this.tipocostoLogic.getTipoCostos().toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocosto =(TipoCosto) this.tipocostos.toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocosto.getsType().equals("DUPLICADO")
				   || this.tipocosto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoCosto=true;
				
				} else {
					this.isEsNuevoTipoCosto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocostoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocosto.getId()>=0 && !this.tipocosto.getIsNew()) {						
						this.isEsNuevoTipoCosto=false;
						
					} else {
						this.isEsNuevoTipoCosto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoCosto(esRelaciones);						
				
				this.seleccionarTipoCosto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocosto.getId()<0) {
					this.isEsNuevoTipoCosto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoCosto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoCosto(evt,rowIndex);
				}	
				
				if(this.tipocostoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoCosto: " + this.dDif); 
					}
				}								
				
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoCosto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocosto)) {
					if(this.tipocosto.getId()>0) {
						this.tipocosto.setIsDeleted(true);
						
						this.tipocostosEliminados.add(this.tipocosto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocostoLogic.getTipoCostos().remove(this.tipocosto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocostos.remove(this.tipocosto);				
					}
					
					
					((TipoCostoModel) this.jTableDatosTipoCosto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCosto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoCosto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoCosto) {
			
			if(this.jInternalFrameDetalleFormTipoCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCosto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCosto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosto =(TipoCosto) this.tipocostoLogic.getTipoCostos().toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocosto =(TipoCosto) this.tipocostos.toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoCosto(this.tipocosto);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoCosto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoCosto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCosto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCosto(TipoCosto tipocosto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoCosto(tipocosto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCosto(TipoCosto tipocosto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoCosto(tipocosto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoCosto(tipocosto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoCosto(tipocosto);
	}
	
	public void setVariablesObjetoActualToFormularioTipoCosto(TipoCosto tipocosto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoCosto.jTextFieldidTipoCosto.setText(tipocosto.getId().toString());
			this.jInternalFrameDetalleFormTipoCosto.jTextFieldcodigoTipoCosto.setText(tipocosto.getcodigo());
			this.jInternalFrameDetalleFormTipoCosto.jTextFieldnombreTipoCosto.setText(tipocosto.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoCosto tipocostoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocostoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoCosto tipocostoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocostoLocal=this.tipocosto;
			} else {
				tipocostoLocal=this.tipocostoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocostoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoCosto(tipocostoLocal,true);
					
					if(tipocostoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocostoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocostoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocostoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoCosto(TipoCosto tipocosto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCosto(tipocosto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCosto(tipocosto);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCosto(TipoCosto tipocosto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCosto(tipocosto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCosto(TipoCosto tipocosto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoCosto.jTextFieldidTipoCosto.getText()==null || this.jInternalFrameDetalleFormTipoCosto.jTextFieldidTipoCosto.getText()=="" || this.jInternalFrameDetalleFormTipoCosto.jTextFieldidTipoCosto.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoCosto.jTextFieldidTipoCosto.setText("0");
			}

			if(conColumnasBase) {tipocosto.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoCosto.jTextFieldidTipoCosto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCostoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCosto.jLabelIdTipoCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocosto.setcodigo(this.jInternalFrameDetalleFormTipoCosto.jTextFieldcodigoTipoCosto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCostoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCosto.jLabelcodigoTipoCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocosto.setnombre(this.jInternalFrameDetalleFormTipoCosto.jTextFieldnombreTipoCosto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCostoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCosto.jLabelnombreTipoCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCosto(TipoCosto tipocostoBean,TipoCosto tipocosto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoCosto(TipoCosto tipocostoOrigen,TipoCosto tipocosto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocostoOrigen.getId()!=null && !tipocostoOrigen.getId().equals(0L))) {tipocosto.setId(tipocostoOrigen.getId());}}
			if(conDefault || (!conDefault && tipocostoOrigen.getcodigo()!=null && !tipocostoOrigen.getcodigo().equals(""))) {tipocosto.setcodigo(tipocostoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipocostoOrigen.getnombre()!=null && !tipocostoOrigen.getnombre().equals(""))) {tipocosto.setnombre(tipocostoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCosto(TipoCosto tipocosto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCosto.jTextFieldidTipoCosto.setText(tipocosto.getId().toString());
			this.jInternalFrameDetalleFormTipoCosto.jTextFieldcodigoTipoCosto.setText(tipocosto.getcodigo());
			this.jInternalFrameDetalleFormTipoCosto.jTextFieldnombreTipoCosto.setText(tipocosto.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCosto(TipoCostoBean tipocostoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCosto.jTextFieldidTipoCosto.setText(tipocostoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoCosto.jTextFieldcodigoTipoCosto.setText(tipocostoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoCosto.jTextFieldnombreTipoCosto.setText(tipocostoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoCosto(TipoCostoParameterReturnGeneral tipocostoReturnGeneral,TipoCostoBean tipocostoBean,Boolean conDefault) throws Exception { 
		try {
			TipoCosto tipocostoLocal=new TipoCosto();
			
			tipocostoLocal=tipocostoReturnGeneral.getTipoCosto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocostoLocal.getId()!=null && !tipocostoLocal.getId().equals(0L))) {tipocostoBean.setId(tipocostoLocal.getId());}}
			if(conDefault || (!conDefault && tipocostoLocal.getcodigo()!=null && !tipocostoLocal.getcodigo().equals(""))) {tipocostoBean.setcodigo(tipocostoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipocostoLocal.getnombre()!=null && !tipocostoLocal.getnombre().equals(""))) {tipocostoBean.setnombre(tipocostoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoCostoGenerico(Long idTipoCostoSeleccionado,JComboBox jComboBoxTipoCosto,List<TipoCosto> tipocostosLocal)throws Exception {
		try {
			TipoCosto  tipocostoTemp=null;

			for(TipoCosto tipocostoAux:tipocostosLocal) {
				if(tipocostoAux.getId()!=null && tipocostoAux.getId().equals(idTipoCostoSeleccionado)) {
					tipocostoTemp=tipocostoAux;
					break;
				}
			}

			jComboBoxTipoCosto.setSelectedItem(tipocostoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoCostoGenerico(JComboBox jComboBoxTipoCosto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCosto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoCosto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCosto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoCosto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocosto=(TipoCosto) tipocostoLogic.getTipoCostos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocosto =(TipoCosto) tipocostos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoCosto tipocostoRow=new TipoCosto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocostoRow=(TipoCosto) tipocostoLogic.getTipoCostos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocostoRow=(TipoCosto) tipocostos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoCosto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoCosto.setVisible((this.isVisibilidadCeldaNuevoTipoCosto && this.isPermisoNuevoTipoCosto));			
			this.jButtonDuplicarTipoCosto.setVisible((this.isVisibilidadCeldaDuplicarTipoCosto && this.isPermisoDuplicarTipoCosto));			
			this.jButtonCopiarTipoCosto.setVisible((this.isVisibilidadCeldaCopiarTipoCosto && this.isPermisoCopiarTipoCosto));
			this.jButtonVerFormTipoCosto.setVisible((this.isVisibilidadCeldaVerFormTipoCosto && this.isPermisoVerFormTipoCosto));
			
			this.jButtonAbrirOrderByTipoCosto.setVisible((this.isVisibilidadCeldaOrdenTipoCosto && this.isPermisoOrdenTipoCosto));			
			
			this.jButtonNuevoRelacionesTipoCosto.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCosto && this.isPermisoNuevoTipoCosto));			
			this.jButtonNuevoGuardarCambiosTipoCosto.setVisible((this.isVisibilidadCeldaNuevoTipoCosto && this.isPermisoNuevoTipoCosto && this.isPermisoGuardarCambiosTipoCosto));
			
			if(this.jInternalFrameDetalleFormTipoCosto!=null) {
			this.jInternalFrameDetalleFormTipoCosto.jButtonModificarTipoCosto.setVisible((this.isVisibilidadCeldaModificarTipoCosto && this.isPermisoActualizarTipoCosto));	
			this.jInternalFrameDetalleFormTipoCosto.jButtonActualizarTipoCosto.setVisible((this.isVisibilidadCeldaActualizarTipoCosto && this.isPermisoActualizarTipoCosto));	
			this.jInternalFrameDetalleFormTipoCosto.jButtonEliminarTipoCosto.setVisible((this.isVisibilidadCeldaEliminarTipoCosto && this.isPermisoEliminarTipoCosto));
			this.jInternalFrameDetalleFormTipoCosto.jButtonCancelarTipoCosto.setVisible(this.isVisibilidadCeldaCancelarTipoCosto);							
			this.jInternalFrameDetalleFormTipoCosto.jButtonGuardarCambiosTipoCosto.setVisible((this.isVisibilidadCeldaGuardarTipoCosto && this.isPermisoGuardarCambiosTipoCosto));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoCosto.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCosto && this.isPermisoGuardarCambiosTipoCosto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoCosto.setVisible((this.isVisibilidadCeldaNuevoTipoCosto && this.isPermisoNuevoTipoCosto));						
			this.jButtonDuplicarToolBarTipoCosto.setVisible((this.isVisibilidadCeldaDuplicarTipoCosto && this.isPermisoDuplicarTipoCosto));						
			this.jButtonCopiarToolBarTipoCosto.setVisible((this.isVisibilidadCeldaCopiarTipoCosto && this.isPermisoCopiarTipoCosto));			
			this.jButtonVerFormToolBarTipoCosto.setVisible((this.isVisibilidadCeldaVerFormTipoCosto && this.isPermisoVerFormTipoCosto));			
			this.jButtonAbrirOrderByToolBarTipoCosto.setVisible((this.isVisibilidadCeldaOrdenTipoCosto && this.isPermisoOrdenTipoCosto));
			this.jButtonNuevoRelacionesToolBarTipoCosto.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCosto && this.isPermisoNuevoTipoCosto));			
			this.jButtonNuevoGuardarCambiosToolBarTipoCosto.setVisible((this.isVisibilidadCeldaNuevoTipoCosto && this.isPermisoNuevoTipoCosto && this.isPermisoGuardarCambiosTipoCosto));			
			
			if(this.jInternalFrameDetalleFormTipoCosto!=null) {
			this.jInternalFrameDetalleFormTipoCosto.jButtonModificarToolBarTipoCosto.setVisible((this.isVisibilidadCeldaModificarTipoCosto && this.isPermisoActualizarTipoCosto));	
			this.jInternalFrameDetalleFormTipoCosto.jButtonActualizarToolBarTipoCosto.setVisible((this.isVisibilidadCeldaActualizarTipoCosto  && this.isPermisoActualizarTipoCosto));	
			this.jInternalFrameDetalleFormTipoCosto.jButtonEliminarToolBarTipoCosto.setVisible((this.isVisibilidadCeldaEliminarTipoCosto && this.isPermisoEliminarTipoCosto));
			this.jInternalFrameDetalleFormTipoCosto.jButtonCancelarToolBarTipoCosto.setVisible(this.isVisibilidadCeldaCancelarTipoCosto);				
			this.jInternalFrameDetalleFormTipoCosto.jButtonGuardarCambiosToolBarTipoCosto.setVisible((this.isVisibilidadCeldaGuardarTipoCosto && this.isPermisoGuardarCambiosTipoCosto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoCosto.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCosto && this.isPermisoGuardarCambiosTipoCosto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoCosto.setVisible((this.isVisibilidadCeldaNuevoTipoCosto && this.isPermisoNuevoTipoCosto));			
			this.jMenuItemDuplicarTipoCosto.setVisible((this.isVisibilidadCeldaDuplicarTipoCosto && this.isPermisoDuplicarTipoCosto));			
			this.jMenuItemCopiarTipoCosto.setVisible((this.isVisibilidadCeldaCopiarTipoCosto && this.isPermisoCopiarTipoCosto));			
			this.jMenuItemVerFormTipoCosto.setVisible((this.isVisibilidadCeldaVerFormTipoCosto && this.isPermisoVerFormTipoCosto));			
			this.jMenuItemAbrirOrderByTipoCosto.setVisible((this.isVisibilidadCeldaOrdenTipoCosto && this.isPermisoOrdenTipoCosto));			
			//this.jMenuItemMostrarOcultarTipoCosto.setVisible((this.isVisibilidadCeldaOrdenTipoCosto && this.isPermisoOrdenTipoCosto));
			this.jMenuItemDetalleAbrirOrderByTipoCosto.setVisible((this.isVisibilidadCeldaOrdenTipoCosto && this.isPermisoOrdenTipoCosto));			
			//this.jMenuItemDetalleMostrarOcultarTipoCosto.setVisible((this.isVisibilidadCeldaOrdenTipoCosto && this.isPermisoOrdenTipoCosto));			
			this.jMenuItemNuevoRelacionesTipoCosto.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCosto && this.isPermisoNuevoTipoCosto));			
			this.jMenuItemNuevoGuardarCambiosTipoCosto.setVisible((this.isVisibilidadCeldaNuevoTipoCosto && this.isPermisoNuevoTipoCosto && this.isPermisoGuardarCambiosTipoCosto));									
			
			if(this.jInternalFrameDetalleFormTipoCosto!=null) {
			this.jInternalFrameDetalleFormTipoCosto.jMenuItemModificarTipoCosto.setVisible((this.isVisibilidadCeldaModificarTipoCosto && this.isPermisoActualizarTipoCosto));	
			this.jInternalFrameDetalleFormTipoCosto.jMenuItemActualizarTipoCosto.setVisible((this.isVisibilidadCeldaActualizarTipoCosto && this.isPermisoActualizarTipoCosto));	
			this.jInternalFrameDetalleFormTipoCosto.jMenuItemEliminarTipoCosto.setVisible((this.isVisibilidadCeldaEliminarTipoCosto && this.isPermisoEliminarTipoCosto));
			this.jInternalFrameDetalleFormTipoCosto.jMenuItemCancelarTipoCosto.setVisible(this.isVisibilidadCeldaCancelarTipoCosto);				
			}
			
			this.jMenuItemGuardarCambiosTipoCosto.setVisible((this.isVisibilidadCeldaGuardarTipoCosto && this.isPermisoGuardarCambiosTipoCosto));						
			this.jMenuItemGuardarCambiosTablaTipoCosto.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCosto && this.isPermisoGuardarCambiosTipoCosto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoCosto=this.jButtonNuevoTipoCosto.isVisible();
			this.isVisibilidadCeldaDuplicarTipoCosto=this.jButtonDuplicarTipoCosto.isVisible();
			this.isVisibilidadCeldaCopiarTipoCosto=this.jButtonCopiarTipoCosto.isVisible();
			this.isVisibilidadCeldaVerFormTipoCosto=this.jButtonVerFormTipoCosto.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoCosto=this.jButtonAbrirOrderByTipoCosto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoCosto=this.jButtonNuevoRelacionesTipoCosto.isVisible();
			this.isVisibilidadCeldaModificarTipoCosto=this.jButtonModificarTipoCosto.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCosto!=null) {
			this.isVisibilidadCeldaActualizarTipoCosto=this.jInternalFrameDetalleFormTipoCosto.jButtonActualizarTipoCosto.isVisible();
			this.isVisibilidadCeldaEliminarTipoCosto=this.jInternalFrameDetalleFormTipoCosto.jButtonEliminarTipoCosto.isVisible();
			this.isVisibilidadCeldaCancelarTipoCosto=this.jInternalFrameDetalleFormTipoCosto.jButtonCancelarTipoCosto.isVisible();
			this.isVisibilidadCeldaGuardarTipoCosto=this.jInternalFrameDetalleFormTipoCosto.jButtonGuardarCambiosTipoCosto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoCosto=this.jButtonGuardarCambiosTablaTipoCosto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoCosto=this.jButtonNuevoToolBarTipoCosto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCosto=this.jButtonNuevoRelacionesToolBarTipoCosto.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCosto!=null) {
			this.isVisibilidadCeldaModificarTipoCosto=this.jInternalFrameDetalleFormTipoCosto.jButtonModificarToolBarTipoCosto.isVisible();
			this.isVisibilidadCeldaActualizarTipoCosto=this.jInternalFrameDetalleFormTipoCosto.jButtonActualizarToolBarTipoCosto.isVisible();
			this.isVisibilidadCeldaEliminarTipoCosto=this.jInternalFrameDetalleFormTipoCosto.jButtonEliminarToolBarTipoCosto.isVisible();
			this.isVisibilidadCeldaCancelarTipoCosto=this.jInternalFrameDetalleFormTipoCosto.jButtonCancelarToolBarTipoCosto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCosto=this.jButtonGuardarCambiosToolBarTipoCosto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCosto=this.jButtonGuardarCambiosTablaToolBarTipoCosto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoCosto=this.jMenuItemNuevoTipoCosto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCosto=this.jMenuItemNuevoRelacionesTipoCosto.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCosto!=null) {
			this.isVisibilidadCeldaModificarTipoCosto=this.jInternalFrameDetalleFormTipoCosto.jMenuItemModificarTipoCosto.isVisible();
			this.isVisibilidadCeldaActualizarTipoCosto=this.jInternalFrameDetalleFormTipoCosto.jMenuItemActualizarTipoCosto.isVisible();
			this.isVisibilidadCeldaEliminarTipoCosto=this.jInternalFrameDetalleFormTipoCosto.jMenuItemEliminarTipoCosto.isVisible();
			this.isVisibilidadCeldaCancelarTipoCosto=this.jInternalFrameDetalleFormTipoCosto.jMenuItemCancelarTipoCosto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCosto=this.jMenuItemGuardarCambiosTipoCosto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCosto=this.jMenuItemGuardarCambiosTablaTipoCosto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoCosto(Boolean esInicializar) {
		if(TipoCostoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocostoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocostoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCosto();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoCosto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoCosto() {
		this.jButtonNuevoTipoCosto.setVisible(this.isPermisoNuevoTipoCosto);			
		this.jButtonDuplicarTipoCosto.setVisible(this.isPermisoDuplicarTipoCosto);			
		this.jButtonCopiarTipoCosto.setVisible(this.isPermisoCopiarTipoCosto);			
		this.jButtonVerFormTipoCosto.setVisible(this.isPermisoVerFormTipoCosto);			
		
		this.jButtonAbrirOrderByTipoCosto.setVisible(this.isPermisoOrdenTipoCosto);					
		
		this.jButtonNuevoRelacionesTipoCosto.setVisible(this.isPermisoNuevoTipoCosto);			
		
		if(this.jInternalFrameDetalleFormTipoCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosto.jButtonModificarTipoCosto.setVisible(this.isPermisoActualizarTipoCosto);	
			this.jInternalFrameDetalleFormTipoCosto.jButtonActualizarTipoCosto.setVisible(this.isPermisoActualizarTipoCosto);	
			this.jInternalFrameDetalleFormTipoCosto.jButtonEliminarTipoCosto.setVisible(this.isPermisoEliminarTipoCosto);
			this.jInternalFrameDetalleFormTipoCosto.jButtonCancelarTipoCosto.setVisible(this.isVisibilidadCeldaCancelarTipoCosto);						
			this.jInternalFrameDetalleFormTipoCosto.jButtonGuardarCambiosTipoCosto.setVisible(this.isPermisoGuardarCambiosTipoCosto);							
		}
		
		this.jButtonGuardarCambiosTablaTipoCosto.setVisible(this.isPermisoActualizarTipoCosto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCosto() {
		this.jInternalFrameDetalleFormTipoCosto.jButtonModificarTipoCosto.setVisible(this.isPermisoActualizarTipoCosto);	
		this.jInternalFrameDetalleFormTipoCosto.jButtonActualizarTipoCosto.setVisible(this.isPermisoActualizarTipoCosto);	
		this.jInternalFrameDetalleFormTipoCosto.jButtonEliminarTipoCosto.setVisible(this.isPermisoEliminarTipoCosto);
		this.jInternalFrameDetalleFormTipoCosto.jButtonCancelarTipoCosto.setVisible(this.isVisibilidadCeldaCancelarTipoCosto);							
		this.jInternalFrameDetalleFormTipoCosto.jButtonGuardarCambiosTipoCosto.setVisible((this.isVisibilidadCeldaGuardarTipoCosto && this.isPermisoGuardarCambiosTipoCosto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoCosto() {
		if(TipoCostoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoCosto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoCosto() {
	}
	
	public void jTableDatosTipoCostoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoCosto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCosto(this.gettipocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosto(this.tipocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocosto =(TipoCosto) this.tipocostoLogic.getTipoCostos().toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocosto =(TipoCosto) this.tipocostos.toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocosto==null) {
						this.tipocosto = new TipoCosto();
					}

					this.setVariablesFormularioToObjetoActualTipoCosto(this.tipocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosto(this.tipocosto);
				}

				if(this.tipocosto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocosto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCosto(this.gettipocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosto(this.tipocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocosto =(TipoCosto) this.tipocostoLogic.getTipoCostos().toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocosto =(TipoCosto) this.tipocostos.toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocosto==null) {
						this.tipocosto = new TipoCosto();
					}

					this.setVariablesFormularioToObjetoActualTipoCosto(this.tipocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosto(this.tipocosto);
				}

				if(this.tipocosto.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipocosto.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCosto(this.gettipocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosto(this.tipocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocosto =(TipoCosto) this.tipocostoLogic.getTipoCostos().toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocosto =(TipoCosto) this.tipocostos.toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocosto==null) {
						this.tipocosto = new TipoCosto();
					}

					this.setVariablesFormularioToObjetoActualTipoCosto(this.tipocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosto(this.tipocosto);
				}

				if(this.tipocosto.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipocosto.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoCosto() {
		if(this.jInternalFrameDetalleFormTipoCosto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoCosto!=null) {
			this.jInternalFrameDetalleFormTipoCosto.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoCosto.dispose();
			this.jInternalFrameDetalleFormTipoCosto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoCosto!=null) {
			this.jInternalFrameReporteDinamicoTipoCosto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoCosto.dispose();
			this.jInternalFrameReporteDinamicoTipoCosto=null;
		}
		
		if(this.jInternalFrameImportacionTipoCosto!=null) {
			this.jInternalFrameImportacionTipoCosto.setVisible(false);	    			
			this.jInternalFrameImportacionTipoCosto.dispose();
			this.jInternalFrameImportacionTipoCosto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoCosto();
			
			TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoCosto")) {
				jButtonNuevoTipoCostoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoCosto")) {
				jButtonDuplicarTipoCostoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoCosto")) {
				jButtonCopiarTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoCosto")) {
				jButtonVerFormTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoCosto")) {
				jButtonNuevoTipoCostoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoCosto")) {
				jButtonDuplicarTipoCostoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoCosto")) {
				jButtonNuevoTipoCostoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoCosto")) {
				jButtonDuplicarTipoCostoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoCosto")) {
				jButtonNuevoTipoCostoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoCosto")) {
				jButtonNuevoTipoCostoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoCosto")) {
				jButtonNuevoTipoCostoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoCosto")) {
				jButtonModificarTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoCosto")) {
				jButtonModificarTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoCosto")) {
				jButtonModificarTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoCosto")) {
				jButtonActualizarTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoCosto")) {
				jButtonActualizarTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoCosto")) {
				jButtonActualizarTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoCosto")) {
				jButtonEliminarTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoCosto")) {
				jButtonEliminarTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoCosto")) {
				jButtonEliminarTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoCosto")) {
				jButtonCancelarTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoCosto")) {
				jButtonCancelarTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoCosto")) {
				jButtonCancelarTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoCosto")) {
				jButtonCerrarTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoCosto")) {
				jButtonCerrarTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoCosto")) {
				jButtonCerrarTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoCosto")) {
				jButtonMostrarOcultarTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoCosto")) {
				jButtonCancelarTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoCosto")) {
				jButtonGuardarCambiosTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoCosto")) {
				jButtonGuardarCambiosTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoCosto")) {
				jButtonCopiarTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoCosto")) {
				jButtonVerFormTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoCosto")) {
				jButtonGuardarCambiosTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoCosto")) {
				jButtonCopiarTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoCosto")) {
				jButtonVerFormTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoCosto")) {
				jButtonGuardarCambiosTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoCosto")) {
				jButtonGuardarCambiosTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoCosto")) {
				jButtonGuardarCambiosTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoCosto")) {
				jButtonRecargarInformacionTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoCosto")) {
				jButtonRecargarInformacionTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoCosto")) {
				jButtonRecargarInformacionTipoCostoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoCosto")) {
				jButtonAnterioresTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoCosto")) {
				jButtonAnterioresTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoCosto")) {
				jButtonAnterioresTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoCosto")) {
				jButtonSiguientesTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoCosto")) {
				jButtonSiguientesTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoCosto")) {
				jButtonSiguientesTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoCosto") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoCosto")) {
				jButtonAbrirOrderByTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoCosto") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoCosto")) {
				jButtonMostrarOcultarTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCosto")) {
				jButtonNuevoGuardarCambiosTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoCosto")) {
				jButtonNuevoGuardarCambiosTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoCosto")) {
				jButtonNuevoGuardarCambiosTipoCostoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoCosto")) {
				jButtonCerrarReporteDinamicoTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoCosto")) {
				jButtonGenerarReporteDinamicoTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoCosto")) {
				
				jButtonGenerarExcelReporteDinamicoTipoCostoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoCosto")) {
				jButtonCerrarImportacionTipoCostoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoCosto")) {
				
				jButtonGenerarImportacionTipoCostoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoCosto")) {
				
				jButtonAbrirImportacionTipoCostoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoCosto")) {
				jComboBoxTiposAccionesTipoCostoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoCosto")) {
				jComboBoxTiposRelacionesTipoCostoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoCosto")) {
				jComboBoxTiposAccionesTipoCostoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoCosto")) {
				
				jComboBoxTiposSeleccionarTipoCostoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoCosto")) {
				jTextFieldValorCampoGeneralTipoCostoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoCosto")) {
				jButtonAbrirOrderByTipoCostoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoCosto")) {
				jButtonAbrirOrderByTipoCostoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoCosto")) {
				jButtonCerrarOrderByTipoCostoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCostoBusqueda")) {
				this.jButtonidTipoCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCostoBusqueda")) {
				this.jButtoncodigoTipoCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCostoBusqueda")) {
				this.jButtonnombreTipoCostoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoCosto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCostoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosto);
				
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
				
				


				
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoCosto tipocostoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocostoLocal=this.tipocosto;
			} else {
				tipocostoLocal=this.tipocostoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosto);
				
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
							
				
				


				
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostoAnterior =(TipoCosto) this.tipocostoLogic.getTipoCostos().toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocostoAnterior =(TipoCosto) this.tipocostos.toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
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
			
			TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
			
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
			
			


			
			TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCostoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosto);
				
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
								
						
				


				
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosto);
				
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
								
				
				


				
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostoAnterior =(TipoCosto) this.tipocostoLogic.getTipoCostos().toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocostoAnterior =(TipoCosto) this.tipocostos.toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostoAnterior =(TipoCosto) this.tipocostoLogic.getTipoCostos().toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocostoAnterior =(TipoCosto) this.tipocostos.toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCostoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocosto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosto);
				
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
							
				
				


				
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCostoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCosto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocostoAnterior =(TipoCosto) this.tipocostoLogic.getTipoCostos().toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocostoAnterior =(TipoCosto) this.tipocostos.toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
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
			
			TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
			
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
			
			


			
			TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCostoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocosto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosto);
				
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
								
				
				


				
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostoAnterior =(TipoCosto) this.tipocostoLogic.getTipoCostos().toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocostoAnterior =(TipoCosto) this.tipocostos.toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCostoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocosto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCostoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosto);
				
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoCosto")) {
					jCheckBoxSeleccionarTodosTipoCostoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoCosto")) {
					jCheckBoxSeleccionadosTipoCostoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoCosto")) {
					
				}
				
				


				
				
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocosto);
				
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
												
				
				


				
				
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCostoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCosto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocostoAnterior =(TipoCosto) this.tipocostoLogic.getTipoCostos().toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocostoAnterior =(TipoCosto) this.tipocostos.toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCostoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosto);
				
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
				
				
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
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
			
			TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
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
			
			


			
			TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCostoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosto);
				
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosto);
				
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
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
				
				


				
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostoAnterior =(TipoCosto) this.tipocostoLogic.getTipoCostos().toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocostoAnterior =(TipoCosto) this.tipocostos.toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoCosto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoCostoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoCosto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocosto =(TipoCosto) this.tipocostoLogic.getTipoCostos().toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocosto =(TipoCosto) this.tipocostos.toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocosto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoCosto")) {
				
				}
				
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoCosto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoCosto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoCosto")) {
			
			}
			
			TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoCosto();
			
			TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoCosto")) {
				jButtonNuevoTipoCostoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoCosto")) {
				jButtonDuplicarTipoCostoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoCosto")) {
				jButtonCopiarTipoCostoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoCosto")) {
				jButtonVerFormTipoCostoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoCosto")) {
				jButtonNuevoTipoCostoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoCosto")) {
				jButtonModificarTipoCostoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoCosto")) {
				jButtonActualizarTipoCostoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoCosto")) {
				jButtonEliminarTipoCostoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoCosto")) {
				jButtonGuardarCambiosTipoCostoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoCosto")) {
				jButtonCancelarTipoCostoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoCosto")) {
				jButtonCerrarTipoCostoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoCosto")) {
				jButtonGuardarCambiosTipoCostoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCosto")) {
				jButtonNuevoGuardarCambiosTipoCostoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoCosto")) {
				jButtonAbrirOrderByTipoCostoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoCosto")) {
				jButtonRecargarInformacionTipoCostoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoCosto")) {
				jButtonAnterioresTipoCostoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoCosto")) {
				jButtonSiguientesTipoCostoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCostoBusqueda")) {
				this.jButtonidTipoCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCostoBusqueda")) {
				this.jButtoncodigoTipoCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCostoBusqueda")) {
				this.jButtonnombreTipoCostoBusquedaActionPerformed(evt);
			}
			
			TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoCosto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoCosto")) {
				closingInternalFrameTipoCosto();
				
			} else if(sTipo.equals("jButtonCancelarTipoCosto")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoCosto = (JInternalFrameBase)evt.getSource();
	            	
	            TipoCostoBeanSwingJInternalFrame jInternalFrameParent=(TipoCostoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCosto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoCostoActionPerformed(null);
			}
			
			TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocosto,new Object(),this.tipocostoParameterGeneral,this.tipocostoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoCosto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoCosto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoCosto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocosto)) {
			if(!esControlTabla) {
				if(TipoCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoCosto(this.tipocosto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosto(this.tipocosto);			
				}
				
				if(this.tipocostoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoCosto(this.tipocosto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocostoReturnGeneral=tipocostoLogic.procesarEventosTipoCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocostoLogic.getTipoCostos(),this.tipocosto,this.tipocostoParameterGeneral,this.isEsNuevoTipoCosto,classes);//this.tipocostoLogic.getTipoCosto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoCosto(this.tipocostoReturnGeneral,this.tipocostoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocostoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoCosto(classes,this.tipocostoReturnGeneral,this.tipocostoBean,false);
					}
						
					if(this.tipocostoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoCosto(this.tipocostoReturnGeneral.getTipoCosto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoCosto(this.tipocostoReturnGeneral.getTipoCosto());	
					}
						
					if(this.tipocostoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoCosto(this.tipocostoReturnGeneral.getTipoCosto(),classes);//this.tipocostoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoCosto(this.tipocosto,classes);//this.tipocostoBean);									
				}
			
				if(TipoCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoCosto(this.tipocosto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosto(this.tipocosto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocostoAnterior!=null) {
						this.tipocosto=this.tipocostoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocostoReturnGeneral=tipocostoLogic.procesarEventosTipoCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocostoLogic.getTipoCostos(),this.tipocosto,this.tipocostoParameterGeneral,this.isEsNuevoTipoCosto,classes);//this.tipocostoLogic.getTipoCosto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocostoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocostoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocostoReturnGeneral.getTipoCosto(),tipocostoLogic.getTipoCostos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocostoReturnGeneral.getTipoCosto(),this.tipocostos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoCosto.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoCosto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoCosto();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoCosto() throws Exception {
		
		TipoCostoModel tipocostoModel=(TipoCostoModel)this.jTableDatosTipoCosto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocostoModel.tipocostos=this.tipocostoLogic.getTipoCostos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocostoModel.tipocostos=this.tipocostos;
		}
		
		
		((TipoCostoModel) this.jTableDatosTipoCosto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoCosto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocostoAnterior(),this.tipocostoLogic.getTipoCostos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocostoAnterior(),this.tipocostos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoCosto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoCosto(TipoCosto tipocosto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
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
										
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocosto,new Object(),generalEntityParameterGeneral,this.tipocostoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocostoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoCostoConstantesFunciones.getClassesRelationshipsOfTipoCosto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoCostoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoCosto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoCosto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocosto,new Object(),generalEntityParameterGeneral,this.tipocostoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoCosto(TipoCostoBean tipocostoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoCosto(ArrayList<Classe> classes,TipoCostoReturnGeneral tipocostoReturnGeneral,TipoCostoBean tipocostoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoCosto(TipoCosto tipocosto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipocosto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoCosto = new TipoCostoDetalleFormJInternalFrame(jDesktopPane,this.tipocostoSessionBean.getConGuardarRelaciones(),this.tipocostoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCosto);
		this.jInternalFrameDetalleFormTipoCosto.setVisible(false);
		this.jInternalFrameDetalleFormTipoCosto.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoCosto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoCosto.tipocostoLogic=this.tipocostoLogic;
		
		this.cargarCombosFrameForeignKeyTipoCosto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCosto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCosto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoCosto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoCosto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoCosto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCosto"));
		
		this.jInternalFrameDetalleFormTipoCosto.jButtonModificarTipoCosto.addActionListener(new ButtonActionListener(this,"ModificarTipoCosto"));

		
		this.jInternalFrameDetalleFormTipoCosto.jButtonModificarToolBarTipoCosto.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCosto"));
					
		this.jInternalFrameDetalleFormTipoCosto.jMenuItemModificarTipoCosto.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCosto"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCosto.jButtonActualizarTipoCosto.addActionListener (new ButtonActionListener(this,"ActualizarTipoCosto"));
		
		
		this.jInternalFrameDetalleFormTipoCosto.jButtonActualizarToolBarTipoCosto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCosto"));
						
		this.jInternalFrameDetalleFormTipoCosto.jMenuItemActualizarTipoCosto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCosto"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCosto.jButtonEliminarTipoCosto.addActionListener (new ButtonActionListener(this,"EliminarTipoCosto"));
		
		
		this.jInternalFrameDetalleFormTipoCosto.jButtonEliminarToolBarTipoCosto.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCosto"));
								
		this.jInternalFrameDetalleFormTipoCosto.jMenuItemEliminarTipoCosto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCosto"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCosto.jButtonCancelarTipoCosto.addActionListener (new ButtonActionListener(this,"CancelarTipoCosto"));
		
		
		this.jInternalFrameDetalleFormTipoCosto.jButtonCancelarToolBarTipoCosto.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCosto"));
					
		this.jInternalFrameDetalleFormTipoCosto.jMenuItemCancelarTipoCosto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCosto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoCosto.jMenuItemDetalleCerrarTipoCosto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCosto"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCosto.jButtonGuardarCambiosToolBarTipoCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCosto"));
		
		
		
		this.jInternalFrameDetalleFormTipoCosto.jButtonGuardarCambiosToolBarTipoCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCosto"));
		
		
		
		this.jInternalFrameDetalleFormTipoCosto.jComboBoxTiposAccionesFormularioTipoCosto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCosto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCosto.jButtonidTipoCostoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCosto.jButtoncodigoTipoCostoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCosto.jButtonnombreTipoCostoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCostoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoCosto.jTabbedPaneRelacionesTipoCosto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCosto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoCosto"));
		
		if(this.jInternalFrameDetalleFormTipoCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCosto"));
		}
		
		this.jTableDatosTipoCosto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoCosto"));
		
		this.jTableDatosTipoCosto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoCosto"));
		
		this.jButtonNuevoTipoCosto.addActionListener(new ButtonActionListener(this,"NuevoTipoCosto"));
		
		this.jButtonDuplicarTipoCosto.addActionListener(new ButtonActionListener(this,"DuplicarTipoCosto"));
		
		this.jButtonCopiarTipoCosto.addActionListener(new ButtonActionListener(this,"CopiarTipoCosto"));
		
		this.jButtonVerFormTipoCosto.addActionListener(new ButtonActionListener(this,"VerFormTipoCosto"));
		
		
		this.jButtonNuevoToolBarTipoCosto.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoCosto"));
			
		this.jButtonDuplicarToolBarTipoCosto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoCosto"));
			
		this.jMenuItemNuevoTipoCosto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoCosto"));
			
		this.jMenuItemDuplicarTipoCosto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoCosto"));		
		
		
		this.jButtonNuevoRelacionesTipoCosto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoCosto"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoCosto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoCosto"));
			
		this.jMenuItemNuevoRelacionesTipoCosto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoCosto"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosto.jButtonModificarTipoCosto.addActionListener(new ButtonActionListener(this,"ModificarTipoCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosto.jButtonModificarToolBarTipoCosto.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCosto"));
			
			this.jInternalFrameDetalleFormTipoCosto.jMenuItemModificarTipoCosto.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCosto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoCosto.jButtonActualizarTipoCosto.addActionListener (new ButtonActionListener(this,"ActualizarTipoCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosto.jButtonActualizarToolBarTipoCosto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCosto"));
				
			this.jInternalFrameDetalleFormTipoCosto.jMenuItemActualizarTipoCosto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCosto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosto.jButtonEliminarTipoCosto.addActionListener (new ButtonActionListener(this,"EliminarTipoCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosto.jButtonEliminarToolBarTipoCosto.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCosto"));
						
			this.jInternalFrameDetalleFormTipoCosto.jMenuItemEliminarTipoCosto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCosto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosto.jButtonCancelarTipoCosto.addActionListener (new ButtonActionListener(this,"CancelarTipoCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosto.jButtonCancelarToolBarTipoCosto.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCosto"));
			
			this.jInternalFrameDetalleFormTipoCosto.jMenuItemCancelarTipoCosto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCosto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoCosto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoCosto"));		
		
		
		this.jButtonCerrarTipoCosto.addActionListener (new ButtonActionListener(this,"CerrarTipoCosto"));
		
		
		this.jButtonCerrarToolBarTipoCosto.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoCosto"));
			
		this.jMenuItemCerrarTipoCosto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoCosto"));
			
		if(this.jInternalFrameDetalleFormTipoCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosto.jMenuItemDetalleCerrarTipoCosto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCosto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosto.jButtonGuardarCambiosTipoCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosto.jButtonGuardarCambiosToolBarTipoCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCosto"));
		}
		
		this.jButtonCopiarToolBarTipoCosto.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoCosto"));
			
		this.jButtonVerFormToolBarTipoCosto.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoCosto"));
		
		this.jMenuItemGuardarCambiosTipoCosto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoCosto"));
			
		this.jMenuItemCopiarTipoCosto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoCosto"));		
		
		this.jMenuItemVerFormTipoCosto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoCosto"));		
		
		
		this.jButtonGuardarCambiosTablaTipoCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCosto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoCosto"));
			
		this.jMenuItemGuardarCambiosTablaTipoCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCosto"));		
		
		
		
		this.jButtonRecargarInformacionTipoCosto.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoCosto"));
					
		this.jButtonRecargarInformacionToolBarTipoCosto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoCosto"));
		
		this.jMenuItemRecargarInformacionTipoCosto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoCosto"));		
		
		
		
		this.jButtonAnterioresTipoCosto.addActionListener (new ButtonActionListener(this,"AnterioresTipoCosto"));
		
		
		this.jButtonAnterioresToolBarTipoCosto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoCosto"));
		
		this.jMenuItemAnterioresTipoCosto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoCosto"));		
		
		
		this.jButtonSiguientesTipoCosto.addActionListener (new ButtonActionListener(this,"SiguientesTipoCosto"));
		
		
		this.jButtonSiguientesToolBarTipoCosto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoCosto"));
			
		this.jMenuItemSiguientesTipoCosto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoCosto"));
			
		this.jMenuItemAbrirOrderByTipoCosto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoCosto"));
			
		this.jMenuItemMostrarOcultarTipoCosto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoCosto"));
			
		this.jMenuItemDetalleAbrirOrderByTipoCosto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoCosto"));
			
		this.jMenuItemDetalleMostarOcultarTipoCosto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoCosto"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoCosto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoCosto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCosto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoCosto"));
			
		this.jMenuItemNuevoGuardarCambiosTipoCosto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoCosto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoCosto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoCosto"));

		this.jCheckBoxSeleccionadosTipoCosto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoCosto"));
		
		if(this.jInternalFrameDetalleFormTipoCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosto.jComboBoxTiposAccionesFormularioTipoCosto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCosto"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoCosto.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoCosto"));
			
		this.jComboBoxTiposAccionesTipoCosto.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoCosto"));
					
		this.jComboBoxTiposSeleccionarTipoCosto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoCosto"));
			
		this.jTextFieldValorCampoGeneralTipoCosto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoCosto"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCosto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCosto.jButtonidTipoCostoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCosto.jButtoncodigoTipoCostoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCosto.jButtonnombreTipoCostoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCostoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoCosto!=null) {
				this.jInternalFrameReporteDinamicoTipoCosto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCosto"));
				this.jInternalFrameReporteDinamicoTipoCosto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCosto"));
				this.jInternalFrameReporteDinamicoTipoCosto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCosto"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoCosto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCosto"));				
			//this.jButtonGenerarReporteDinamicoTipoCosto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCosto"));
			//this.jButtonGenerarExcelReporteDinamicoTipoCosto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCosto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoCosto!=null) {
				this.jInternalFrameImportacionTipoCosto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCosto"));
				this.jInternalFrameImportacionTipoCosto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCosto"));
				this.jInternalFrameImportacionTipoCosto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCosto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoCosto.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoCosto"));
			
			this.jButtonAbrirOrderByToolBarTipoCosto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoCosto"));			
			
			if(this.jInternalFrameOrderByTipoCosto!=null) {
				this.jInternalFrameOrderByTipoCosto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCosto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoCosto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosto.jTabbedPaneRelacionesTipoCosto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCosto"));
		
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
            		closingInternalFrameTipoCosto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoCosto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoCosto = (JInternalFrameBase)event.getSource();
	            	
	            TipoCostoBeanSwingJInternalFrame jInternalFrameParent=(TipoCostoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCosto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoCostoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoCosto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoCostoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoCosto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoCosto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCostoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCostoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCostoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoCosto";
		inputMap = this.jButtonNuevoTipoCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCostoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCostoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCostoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCostoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoCosto";
		inputMap = this.jButtonNuevoRelacionesTipoCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCostoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoCosto";
		inputMap = this.jButtonModificarTipoCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoCosto";
		inputMap = this.jButtonActualizarTipoCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoCosto";
		inputMap = this.jButtonEliminarTipoCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoCosto";
		inputMap = this.jButtonCancelarTipoCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoCosto";
		inputMap = this.jButtonCerrarTipoCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoCosto.jButtonGuardarCambiosTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoCosto";
		inputMap = this.jInternalFrameDetalleFormTipoCosto.jButtonGuardarCambiosTipoCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoCosto.jButtonGuardarCambiosTipoCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoCosto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoCostoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoCosto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoCostoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoCosto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoCostoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoCosto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoCostoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCosto.jButtonidTipoCostoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCosto.jButtoncodigoTipoCostoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCosto.jButtonnombreTipoCostoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCostoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoCostoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoCosto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoCosto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoCosto tipocostoAux:this.tipocostoLogic.getTipoCostos()) {
					tipocostoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCosto tipocostoAux:tipocostos) {
					tipocostoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoCostoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCosto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCosto tipocostoAux:this.tipocostoLogic.getTipoCostos()) {
						tipocostoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCosto tipocostoAux:tipocostos) {
						tipocostoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoCosto tipocostoAux:this.tipocostoLogic.getTipoCostos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCosto tipocostoAux:tipocostos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCosto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCosto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCosto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCosto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoCostoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCosto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoCosto.getSelectedRows();
			
			TipoCosto tipocostoLocal=new TipoCosto();
			
			//this.seleccionarTodosTipoCosto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocostoLocal =(TipoCosto) this.tipocostoLogic.getTipoCostos().toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocostoLocal =(TipoCosto) this.tipocostos.toArray()[this.jTableDatosTipoCosto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocostoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCosto tipocostoAux:this.tipocostoLogic.getTipoCostos()) {
						tipocostoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCosto tipocostoAux:tipocostos) {
						tipocostoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoCosto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCosto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCosto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCosto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoCostoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoCostoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoCostoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoCosto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoCosto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCosto tipocostoAux:this.tipocostoLogic.getTipoCostos()) {
				
						if(sTipoSeleccionar.equals(TipoCostoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocostoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCostoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocostoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCosto tipocostoAux:tipocostos) {
					
						if(sTipoSeleccionar.equals(TipoCostoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocostoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCostoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocostoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCosto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoCostoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoCosto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoCosto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoCosto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoCosto.jComboBoxTiposAccionesFormularioTipoCosto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoCosto) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoCosto(conSplash);
				
					this.generarReporteTipoCostosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCosto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCosto.jComboBoxTiposAccionesFormularioTipoCosto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoCostosSeleccionados();
				//this.jComboBoxTiposAccionesTipoCosto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCostosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoCosto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCostosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoCosto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCosto();
				
				this.exportarTipoCostosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCosto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCosto.jComboBoxTiposAccionesFormularioTipoCosto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoCostos();
				//this.importarTipoCostos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCosto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCosto.jComboBoxTiposAccionesFormularioTipoCosto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCosto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoCostosSeleccionados();
				//this.jComboBoxTiposAccionesTipoCosto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoCosto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoCosto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoCosto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Costo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCosto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCosto.jComboBoxTiposAccionesFormularioTipoCosto.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoCosto();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoCosto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoCostoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoCosto();
			
			if(this.jInternalFrameDetalleFormTipoCosto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoCosto> tipocostosSeleccionados=new ArrayList<TipoCosto>();		
			TipoCosto tipocosto=new TipoCosto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoCosto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoCosto.getSelectedItem();
			
			
			
			
			tipocostosSeleccionados=this.getTipoCostosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocostosSeleccionados.size()==1) {
				for(TipoCosto tipocostoAux:tipocostosSeleccionados) {
					tipocosto=tipocostoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoCosto();
			
      		//this.finishProcessTipoCosto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoCostoReturnGeneral() throws Exception {
		if(this.tipocostoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocostoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocostoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocostoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocostoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocostoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoCosto(false);
		}
		
		if(this.tipocostoReturnGeneral.getConRetornoLista() || this.tipocostoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocostoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocostoLogic.setTipoCostos(this.tipocostoReturnGeneral.getTipoCostos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocostoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocostoLogic.setTipoCosto(this.tipocostoReturnGeneral.getTipoCosto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoCosto(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoCosto() throws Exception {
		
		
	}
	
	public ArrayList<TipoCosto> getTipoCostosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoCosto> tipocostosSeleccionados=new ArrayList<TipoCosto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoCosto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoCosto tipocostoAux:tipocostoLogic.getTipoCostos()) {
					if(tipocostoAux.getIsSelected()) {
						tipocostosSeleccionados.add(tipocostoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCosto tipocostoAux:this.tipocostos) {
					if(tipocostoAux.getIsSelected()) {
						tipocostosSeleccionados.add(tipocostoAux);				
					}
				}
			}
			
			if(tipocostosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocostosSeleccionados.addAll(this.tipocostoLogic.getTipoCostos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocostosSeleccionados.addAll(this.tipocostos);				
					}
				}
			}
		} else {
			tipocostosSeleccionados.add(this.tipocosto);
		}
		
		return tipocostosSeleccionados;
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
	
	public void generarReporteTipoCostosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoCostosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoCostosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCostosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCostosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Costo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoCostosSeleccionados() throws Exception {
		ArrayList<TipoCosto> tipocostosSeleccionados=new ArrayList<TipoCosto>();		
		
		tipocostosSeleccionados=this.getTipoCostosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoCostos("Todos",tipocostosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoCostosSeleccionados() throws Exception {
		ArrayList<TipoCosto> tipocostosSeleccionados=new ArrayList<TipoCosto>();		
		
		tipocostosSeleccionados=this.getTipoCostosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoCostos("Todos",tipocostosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoCostosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoCosto> tipocostosSeleccionados=new ArrayList<TipoCosto>();
		
		tipocostosSeleccionados=this.getTipoCostosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoCostos("Todos",tipocostosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoCostosSeleccionados() throws Exception {
		ArrayList<TipoCosto> tipocostosSeleccionados=new ArrayList<TipoCosto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoCosto();
		
		
		tipocostosSeleccionados=this.getTipoCostosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoCosto();
		
		
		//this.generarReporteTipoCostos("Todos",tipocostosSeleccionados ,tipocostoImplementable,tipocostoImplementableHome);
	}
	
	public void mostrarImportacionTipoCostos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoCosto();
		
		this.abrirFrameImportacionTipoCosto();		
		
			
		//this.generarReporteTipoCostos("Todos",tipocostosSeleccionados ,tipocostoImplementable,tipocostoImplementableHome);
	}
	
	public void importarTipoCostos() throws Exception {		
	
	}
	
	public void exportarTipoCostosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoCostosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoCostosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoCostosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Costo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoCostosSeleccionados() throws Exception {
		ArrayList<TipoCosto> tipocostosSeleccionados=new ArrayList<TipoCosto>();		
		
		tipocostosSeleccionados=this.getTipoCostosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocosto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoCosto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoCosto tipocostoAux:tipocostosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoCosto(tipocostoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocostoAux.setsDetalleGeneralEntityReporte(tipocostoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoCosto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoCostoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCostoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCostoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCostoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoCosto(TipoCosto tipocosto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocosto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocosto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocosto.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocosto.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoCostosSeleccionados() throws Exception {
		ArrayList<TipoCosto> tipocostosSeleccionados=new ArrayList<TipoCosto>();		
		
		tipocostosSeleccionados=this.getTipoCostosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocosto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoCostos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoCosto(row);				
				iRow++;
			}				
			
			for(TipoCosto tipocostoAux:tipocostosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoCosto(tipocostoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoCostosSeleccionados() throws Exception {
		ArrayList<TipoCosto> tipocostosSeleccionados=new ArrayList<TipoCosto>();		
		
		tipocostosSeleccionados=this.getTipoCostosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocosto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocostos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocosto");
			//elementRoot.appendChild(element);
		
			for(TipoCosto tipocostoAux:tipocostosSeleccionados) {
				element = document.createElement("tipocosto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoCosto(tipocostoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoCosto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCostoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCostoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoCostoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCostoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoCosto(TipoCosto tipocosto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocosto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocosto.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocosto.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoCosto(TipoCosto tipocosto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoCostoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocosto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoCostoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocosto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoCostoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipocosto.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoCostoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipocosto.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoCostosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoCosto> tipocostosSeleccionados=new ArrayList<TipoCosto>();
		
		tipocostosSeleccionados=this.getTipoCostosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoCosto(tipocostosSeleccionados);
		
		this.generarReporteTipoCostos("Todos",tipocostosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoCosto(ArrayList<TipoCosto> tipocostosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoCosto tipocostoAux:tipocostosSeleccionados) {
				tipocostoAux.setsDetalleGeneralEntityReporte(tipocostoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoCostoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipocostoAux.setsDescripcionGeneralEntityReporte1(tipocostoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoCostoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipocostoAux.setsDescripcionGeneralEntityReporte1(tipocostoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoCosto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoCosto=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoCosto=true;
				this.isVisibilidadCeldaGuardarCambiosTipoCosto=true;
			}
			
			this.isVisibilidadCeldaModificarTipoCosto=false;
			this.isVisibilidadCeldaActualizarTipoCosto=false;
			this.isVisibilidadCeldaEliminarTipoCosto=false;
			this.isVisibilidadCeldaCancelarTipoCosto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCosto=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCosto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCosto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCosto=false;
			this.isVisibilidadCeldaModificarTipoCosto=false;
			this.isVisibilidadCeldaActualizarTipoCosto=true;
			this.isVisibilidadCeldaEliminarTipoCosto=false;
			this.isVisibilidadCeldaCancelarTipoCosto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCosto=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCosto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCosto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCosto=false;
			this.isVisibilidadCeldaModificarTipoCosto=false;
			this.isVisibilidadCeldaActualizarTipoCosto=true;
			this.isVisibilidadCeldaEliminarTipoCosto=true;
			this.isVisibilidadCeldaCancelarTipoCosto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCosto=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCosto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCosto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCosto=false;
			this.isVisibilidadCeldaModificarTipoCosto=false;
			this.isVisibilidadCeldaActualizarTipoCosto=true;
			this.isVisibilidadCeldaEliminarTipoCosto=false;
			this.isVisibilidadCeldaCancelarTipoCosto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCosto=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCosto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoCosto=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCosto=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCosto=true;
			this.isVisibilidadCeldaModificarTipoCosto=false;
			this.isVisibilidadCeldaActualizarTipoCosto=false;
			this.isVisibilidadCeldaEliminarTipoCosto=false;
			this.isVisibilidadCeldaCancelarTipoCosto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCosto=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCosto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCosto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCosto=false;
			this.isVisibilidadCeldaActualizarTipoCosto=false;
			this.isVisibilidadCeldaEliminarTipoCosto=false;
			this.isVisibilidadCeldaCancelarTipoCosto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCosto=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCosto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCosto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCosto=false;
			this.isVisibilidadCeldaModificarTipoCosto=true;
			this.isVisibilidadCeldaActualizarTipoCosto=false;
			this.isVisibilidadCeldaEliminarTipoCosto=false;
			this.isVisibilidadCeldaCancelarTipoCosto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCosto=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCosto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoCostoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoCosto=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCosto=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCosto=true;
		} else {
			this.actualizarEstadoPanelsTipoCosto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoCosto=false;
			//this.isVisibilidadCeldaVerFormTipoCosto=false;
			this.isVisibilidadCeldaDuplicarTipoCosto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocostoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCosto=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoCosto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCosto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocostoSessionBean.getEsGuardarRelacionado()) {
			if(!tipocostoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoCosto=false;												
			}
			
			this.jButtonCerrarTipoCosto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCosto=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocosto)) {
			this.isVisibilidadCeldaActualizarTipoCosto=false;
			this.isVisibilidadCeldaEliminarTipoCosto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCosto() {
	}
	
	public void actualizarEstadoPanelsTipoCosto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoCosto!=null) {
				this.jScrollPanelDatosEdicionTipoCosto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCosto!=null) {
				this.jScrollPanelDatosTipoCosto.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCosto!=null) {
				this.jPanelPaginacionTipoCosto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCosto!=null) {
				this.jPanelParametrosReportesTipoCosto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoCosto!=null) {
				this.jScrollPanelDatosEdicionTipoCosto.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoCosto!=null) {
				this.jScrollPanelDatosTipoCosto.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCosto!=null) {
				this.jPanelPaginacionTipoCosto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCosto!=null) {
				this.jPanelParametrosReportesTipoCosto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoCosto!=null) {
				this.jScrollPanelDatosEdicionTipoCosto.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoCosto!=null) {
				this.jScrollPanelDatosTipoCosto.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCosto!=null) {
				this.jPanelPaginacionTipoCosto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCosto!=null) {
				this.jPanelParametrosReportesTipoCosto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoCosto!=null) {
				this.jScrollPanelDatosEdicionTipoCosto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCosto!=null) {
				this.jScrollPanelDatosTipoCosto.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCosto!=null) {
				this.jPanelPaginacionTipoCosto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCosto!=null) {
				this.jPanelParametrosReportesTipoCosto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoCosto!=null) {
				this.jScrollPanelDatosEdicionTipoCosto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCosto!=null) {
				this.jScrollPanelDatosTipoCosto.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCosto!=null) {
				this.jPanelPaginacionTipoCosto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCosto!=null) {
				this.jPanelParametrosReportesTipoCosto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoCosto!=null) {
				this.jScrollPanelDatosEdicionTipoCosto.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoCosto!=null) {
				this.jScrollPanelDatosTipoCosto.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCosto!=null) {
				this.jPanelPaginacionTipoCosto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCosto!=null) {
				this.jPanelParametrosReportesTipoCosto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoCosto!=null) {
				this.jScrollPanelDatosEdicionTipoCosto.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoCosto!=null) {
				this.jScrollPanelDatosTipoCosto.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCosto!=null) {
				this.jPanelPaginacionTipoCosto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCosto!=null) {
				this.jPanelParametrosReportesTipoCosto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocostoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocostoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoCostoSessionBean tipocostoSessionBean=new TipoCostoSessionBean();
		
		if(this.tipocostoSessionBean==null) {
			this.tipocostoSessionBean=new TipoCostoSessionBean();
		}
		
		this.tipocostoSessionBean.setsUltimaBusquedaTipoCosto(this.getsAccionBusqueda());
		this.tipocostoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocostoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoCostoSessionBean tipocostoSessionBean=new TipoCostoSessionBean();
		
		if(this.tipocostoSessionBean==null) {
			this.tipocostoSessionBean=new TipoCostoSessionBean();
		}
		
		if(this.tipocostoSessionBean.getsUltimaBusquedaTipoCosto()!=null&&!this.tipocostoSessionBean.getsUltimaBusquedaTipoCosto().equals("")) {
			this.setsAccionBusqueda(tipocostoSessionBean.getsUltimaBusquedaTipoCosto());
			this.setiNumeroPaginacion(tipocostoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocostoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipocostoSessionBean.setsUltimaBusquedaTipoCosto("");
		this.tipocostoSessionBean.setiNumeroPaginacion(TipoCostoConstantesFunciones.INUMEROPAGINACION);
		this.tipocostoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoCosto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoCosto() {
		this.updateBorderResaltarBusquedasFormularioTipoCosto();
		this.updateVisibilidadBusquedasFormularioTipoCosto();
		this.updateHabilitarBusquedasFormularioTipoCosto();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoCosto() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoCosto() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoCosto() {
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
	
	public void updateControlesFormularioTipoCosto() throws Exception {

		if(this.jInternalFrameDetalleFormTipoCosto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoCosto();
		this.updateVisibilidadResaltarControlesFormularioTipoCosto();
		this.updateHabilitarResaltarControlesFormularioTipoCosto();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoCosto() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCosto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocostoConstantesFunciones.resaltaridTipoCosto!=null && this.jInternalFrameDetalleFormTipoCosto!=null) {this.jInternalFrameDetalleFormTipoCosto.jTextFieldidTipoCosto.setBorder(this.tipocostoConstantesFunciones.resaltaridTipoCosto);}
		if(this.tipocostoConstantesFunciones.resaltarcodigoTipoCosto!=null && this.jInternalFrameDetalleFormTipoCosto!=null) {this.jInternalFrameDetalleFormTipoCosto.jTextFieldcodigoTipoCosto.setBorder(this.tipocostoConstantesFunciones.resaltarcodigoTipoCosto);}
		if(this.tipocostoConstantesFunciones.resaltarnombreTipoCosto!=null && this.jInternalFrameDetalleFormTipoCosto!=null) {this.jInternalFrameDetalleFormTipoCosto.jTextFieldnombreTipoCosto.setBorder(this.tipocostoConstantesFunciones.resaltarnombreTipoCosto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoCosto() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoCosto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCosto!=null) {
	
		//this.jInternalFrameDetalleFormTipoCosto.jTextFieldidTipoCosto.setVisible(this.tipocostoConstantesFunciones.mostraridTipoCosto);
		this.jInternalFrameDetalleFormTipoCosto.jPanelidTipoCosto.setVisible(this.tipocostoConstantesFunciones.mostraridTipoCosto);
		//this.jInternalFrameDetalleFormTipoCosto.jTextFieldcodigoTipoCosto.setVisible(this.tipocostoConstantesFunciones.mostrarcodigoTipoCosto);
		this.jInternalFrameDetalleFormTipoCosto.jPanelcodigoTipoCosto.setVisible(this.tipocostoConstantesFunciones.mostrarcodigoTipoCosto);
		//this.jInternalFrameDetalleFormTipoCosto.jTextFieldnombreTipoCosto.setVisible(this.tipocostoConstantesFunciones.mostrarnombreTipoCosto);
		this.jInternalFrameDetalleFormTipoCosto.jPanelnombreTipoCosto.setVisible(this.tipocostoConstantesFunciones.mostrarnombreTipoCosto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoCosto() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCosto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCosto!=null) {
	
		this.jInternalFrameDetalleFormTipoCosto.jTextFieldidTipoCosto.setEnabled(this.tipocostoConstantesFunciones.activaridTipoCosto);
		this.jInternalFrameDetalleFormTipoCosto.jTextFieldcodigoTipoCosto.setEnabled(this.tipocostoConstantesFunciones.activarcodigoTipoCosto);
		this.jInternalFrameDetalleFormTipoCosto.jTextFieldnombreTipoCosto.setEnabled(this.tipocostoConstantesFunciones.activarnombreTipoCosto);
		}
	}
	
		
}