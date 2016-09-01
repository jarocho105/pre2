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

import com.bydan.erp.seguridad.util.TipoEmpresaConstantesFunciones;
import com.bydan.erp.seguridad.util.TipoEmpresaParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.TipoEmpresaParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.TipoEmpresaBean;
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

import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoEmpresaBeanSwingJInternalFrame extends TipoEmpresaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoEmpresaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoEmpresa> tipoempresaValidator = new ClassValidator<TipoEmpresa>(TipoEmpresa.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoEmpresa tipoempresa;	
	public TipoEmpresa tipoempresaAux;
	public TipoEmpresa tipoempresaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoEmpresa tipoempresaTotales;
	public Long idTipoEmpresaActual;
	public Long iIdNuevoTipoEmpresa=0L;
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
	
	public Boolean isPermisoTodoTipoEmpresa;
	public Boolean isPermisoNuevoTipoEmpresa;
	public Boolean isPermisoActualizarTipoEmpresa;
	public Boolean isPermisoActualizarOriginalTipoEmpresa;
	public Boolean isPermisoEliminarTipoEmpresa;
	public Boolean isPermisoGuardarCambiosTipoEmpresa;
	public Boolean isPermisoConsultaTipoEmpresa;
	public Boolean isPermisoBusquedaTipoEmpresa;
	public Boolean isPermisoReporteTipoEmpresa;
	public Boolean isPermisoPaginacionMedioTipoEmpresa;
	public Boolean isPermisoPaginacionAltoTipoEmpresa;
	public Boolean isPermisoPaginacionTodoTipoEmpresa;
	public Boolean isPermisoCopiarTipoEmpresa;
	public Boolean isPermisoVerFormTipoEmpresa;
	public Boolean isPermisoDuplicarTipoEmpresa;
	public Boolean isPermisoOrdenTipoEmpresa;
	
	
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
	
	public TipoEmpresaParameterReturnGeneral tipoempresaReturnGeneral;
	public TipoEmpresaParameterReturnGeneral tipoempresaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoEmpresa=false;
	public Boolean esParaAccionDesdeFormularioTipoEmpresa=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoEmpresaLogic tipoempresaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoEmpresa tipoempresaBean;
	public TipoEmpresaConstantesFunciones tipoempresaConstantesFunciones;
	//public TipoEmpresaParameterReturnGeneral tipoempresaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoEmpresa> tipoempresas;	
	//public List<TipoEmpresa> tipoempresasEliminados;
	//public List<TipoEmpresa> tipoempresasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoEmpresa=false;
	public Boolean isVisibilidadCeldaDuplicarTipoEmpresa=true;
	public Boolean isVisibilidadCeldaCopiarTipoEmpresa=true;
	public Boolean isVisibilidadCeldaVerFormTipoEmpresa=true;
	public Boolean isVisibilidadCeldaOrdenTipoEmpresa=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoEmpresa=false;
	public Boolean isVisibilidadCeldaModificarTipoEmpresa=false;
	public Boolean isVisibilidadCeldaActualizarTipoEmpresa=false;
	public Boolean isVisibilidadCeldaEliminarTipoEmpresa=false;
	public Boolean isVisibilidadCeldaCancelarTipoEmpresa=false;
	public Boolean isVisibilidadCeldaGuardarTipoEmpresa=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoEmpresa=false;	
	
	
	
	public Long getiIdNuevoTipoEmpresa() {
		return this.iIdNuevoTipoEmpresa;
	}

	public void setiIdNuevoTipoEmpresa(Long iIdNuevoTipoEmpresa) {
		this.iIdNuevoTipoEmpresa = iIdNuevoTipoEmpresa;
	}
	
	public Long getidTipoEmpresaActual() {
		return this.idTipoEmpresaActual;
	}

	public void setidTipoEmpresaActual(Long idTipoEmpresaActual) {
		this.idTipoEmpresaActual = idTipoEmpresaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoEmpresa gettipoempresa() {
		return this.tipoempresa;
	}

	public void settipoempresa(TipoEmpresa tipoempresa) {
		this.tipoempresa = tipoempresa;
	}
	
	public TipoEmpresa gettipoempresaAux() {
		return this.tipoempresaAux;
	}

	public void settipoempresaAux(TipoEmpresa tipoempresaAux) {
		this.tipoempresaAux = tipoempresaAux;
	}				
	
	public TipoEmpresa gettipoempresaAnterior() {
		return this.tipoempresaAnterior;
	}

	public void settipoempresaAnterior(TipoEmpresa tipoempresaAnterior) {
		this.tipoempresaAnterior = tipoempresaAnterior;
	}	
	
	public TipoEmpresa gettipoempresaTotales() {
		return this.tipoempresaTotales;
	}

	public void settipoempresaTotales(TipoEmpresa tipoempresaTotales) {
		this.tipoempresaTotales = tipoempresaTotales;
	}	
	
	public TipoEmpresa gettipoempresaBean() {
		return this.tipoempresaBean;
	}

	public void settipoempresaBean(TipoEmpresa tipoempresaBean) {
		this.tipoempresaBean = tipoempresaBean;
	}	
	
	public TipoEmpresaParameterReturnGeneral gettipoempresaReturnGeneral() {
		return this.tipoempresaReturnGeneral;
	}

	public void settipoempresaReturnGeneral(TipoEmpresaParameterReturnGeneral tipoempresaReturnGeneral) {
		this.tipoempresaReturnGeneral = tipoempresaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoEmpresaLogic getTipoEmpresaLogic()	{		
		return tipoempresaLogic;
	}

	public void setTipoEmpresaLogic(TipoEmpresaLogic tipoempresaLogic) {
		this.tipoempresaLogic = tipoempresaLogic;
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
	
	public Boolean getIsEsNuevoTipoEmpresa() {
		return isEsNuevoTipoEmpresa;
	}

	public void setIsEsNuevoTipoEmpresa(Boolean isEsNuevoTipoEmpresa) {
		this.isEsNuevoTipoEmpresa = isEsNuevoTipoEmpresa;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoEmpresa() {
		return esParaAccionDesdeFormularioTipoEmpresa;
	}
	
	public void setEsParaAccionDesdeFormularioTipoEmpresa(Boolean esParaAccionDesdeFormularioTipoEmpresa) {
		this.esParaAccionDesdeFormularioTipoEmpresa = esParaAccionDesdeFormularioTipoEmpresa;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoEmpresa() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoEmpresaConstantesFunciones.refrescarForeignKeysDescripcionesTipoEmpresa(this.tipoempresaLogic.getTipoEmpresas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoEmpresaConstantesFunciones.refrescarForeignKeysDescripcionesTipoEmpresa(this.tipoempresas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoempresaLogic.setTipoEmpresas(this.tipoempresas);
			tipoempresaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoEmpresaParameterReturnGeneral getTipoEmpresaParameterGeneral() {
		return this.tipoempresaParameterGeneral;
	}
	
	public void setTipoEmpresaParameterGeneral(TipoEmpresaParameterReturnGeneral tipoempresaParameterGeneral) {
		this.tipoempresaParameterGeneral = tipoempresaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoEmpresa() {
		return isPermisoTodoTipoEmpresa;
	}

	public void setIsPermisoTodoTipoEmpresa(Boolean isPermisoTodoTipoEmpresa) {
		this.isPermisoTodoTipoEmpresa = isPermisoTodoTipoEmpresa;
	}

	public Boolean getIsPermisoNuevoTipoEmpresa() {
		return isPermisoNuevoTipoEmpresa;
	}

	public void setIsPermisoNuevoTipoEmpresa(Boolean isPermisoNuevoTipoEmpresa) {
		this.isPermisoNuevoTipoEmpresa = isPermisoNuevoTipoEmpresa;
	}

	public Boolean getIsPermisoActualizarTipoEmpresa() {
		return isPermisoActualizarTipoEmpresa;
	}

	public void setIsPermisoActualizarTipoEmpresa(Boolean isPermisoActualizarTipoEmpresa) {
		this.isPermisoActualizarTipoEmpresa = isPermisoActualizarTipoEmpresa;
	}

	public Boolean getIsPermisoEliminarTipoEmpresa() {
		return isPermisoEliminarTipoEmpresa;
	}

	public void setIsPermisoEliminarTipoEmpresa(Boolean isPermisoEliminarTipoEmpresa) {
		this.isPermisoEliminarTipoEmpresa = isPermisoEliminarTipoEmpresa;
	}

	public Boolean getIsPermisoGuardarCambiosTipoEmpresa() {
		return isPermisoGuardarCambiosTipoEmpresa;
	}

	public void setIsPermisoGuardarCambiosTipoEmpresa(Boolean isPermisoGuardarCambiosTipoEmpresa) {
		this.isPermisoGuardarCambiosTipoEmpresa = isPermisoGuardarCambiosTipoEmpresa;
	}
	
	public Boolean getIsPermisoConsultaTipoEmpresa() {
		return isPermisoConsultaTipoEmpresa;
	}

	public void setIsPermisoConsultaTipoEmpresa(Boolean isPermisoConsultaTipoEmpresa) {
		this.isPermisoConsultaTipoEmpresa = isPermisoConsultaTipoEmpresa;
	}

	public Boolean getIsPermisoBusquedaTipoEmpresa() {
		return isPermisoBusquedaTipoEmpresa;
	}

	public void setIsPermisoBusquedaTipoEmpresa(Boolean isPermisoBusquedaTipoEmpresa) {
		this.isPermisoBusquedaTipoEmpresa = isPermisoBusquedaTipoEmpresa;
	}

	public Boolean getIsPermisoReporteTipoEmpresa() {
		return isPermisoReporteTipoEmpresa;
	}

	public void setIsPermisoReporteTipoEmpresa(Boolean isPermisoReporteTipoEmpresa) {
		this.isPermisoReporteTipoEmpresa = isPermisoReporteTipoEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoEmpresa() {
		return isPermisoPaginacionMedioTipoEmpresa;
	}

	public void setIsPermisoPaginacionMedioTipoEmpresa(Boolean isPermisoPaginacionMedioTipoEmpresa) {
		this.isPermisoPaginacionMedioTipoEmpresa = isPermisoPaginacionMedioTipoEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoEmpresa() {
		return isPermisoPaginacionTodoTipoEmpresa;
	}

	public void setIsPermisoPaginacionTodoTipoEmpresa(Boolean isPermisoPaginacionTodoTipoEmpresa) {
		this.isPermisoPaginacionTodoTipoEmpresa = isPermisoPaginacionTodoTipoEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoEmpresa() {
		return isPermisoPaginacionAltoTipoEmpresa;
	}

	public void setIsPermisoPaginacionAltoTipoEmpresa(Boolean isPermisoPaginacionAltoTipoEmpresa) {
		this.isPermisoPaginacionAltoTipoEmpresa = isPermisoPaginacionAltoTipoEmpresa;
	}
	
	public Boolean getIsPermisoCopiarTipoEmpresa() {
		return isPermisoCopiarTipoEmpresa;
	}

	public void setIsPermisoCopiarTipoEmpresa(Boolean isPermisoCopiarTipoEmpresa) {
		this.isPermisoCopiarTipoEmpresa = isPermisoCopiarTipoEmpresa;
	}
	
	public Boolean getIsPermisoVerFormTipoEmpresa() {
		return isPermisoVerFormTipoEmpresa;
	}

	public void setIsPermisoVerFormTipoEmpresa(Boolean isPermisoVerFormTipoEmpresa) {
		this.isPermisoVerFormTipoEmpresa = isPermisoVerFormTipoEmpresa;
	}
	
	public Boolean getIsPermisoDuplicarTipoEmpresa() {
		return isPermisoDuplicarTipoEmpresa;
	}

	public void setIsPermisoDuplicarTipoEmpresa(Boolean isPermisoDuplicarTipoEmpresa) {
		this.isPermisoDuplicarTipoEmpresa = isPermisoDuplicarTipoEmpresa;
	}
	
	public Boolean getIsPermisoOrdenTipoEmpresa() {
		return isPermisoOrdenTipoEmpresa;
	}

	public void setIsPermisoOrdenTipoEmpresa(Boolean isPermisoOrdenTipoEmpresa) {
		this.isPermisoOrdenTipoEmpresa = isPermisoOrdenTipoEmpresa;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoEmpresa() {
		return isVisibilidadCeldaNuevoTipoEmpresa;
	}

	public void setIsVisibilidadCeldaNuevoTipoEmpresa(Boolean isVisibilidadCeldaNuevoTipoEmpresa) {
		this.isVisibilidadCeldaNuevoTipoEmpresa = isVisibilidadCeldaNuevoTipoEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoEmpresa() {
		return isVisibilidadCeldaDuplicarTipoEmpresa;
	}

	public void setIsVisibilidadCeldaDuplicarTipoEmpresa(Boolean isVisibilidadCeldaDuplicarTipoEmpresa) {
		this.isVisibilidadCeldaDuplicarTipoEmpresa = isVisibilidadCeldaDuplicarTipoEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoEmpresa() {
		return isVisibilidadCeldaCopiarTipoEmpresa;
	}

	public void setIsVisibilidadCeldaCopiarTipoEmpresa(Boolean isVisibilidadCeldaCopiarTipoEmpresa) {
		this.isVisibilidadCeldaCopiarTipoEmpresa = isVisibilidadCeldaCopiarTipoEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoEmpresa() {
		return isVisibilidadCeldaVerFormTipoEmpresa;
	}

	public void setIsVisibilidadCeldaVerFormTipoEmpresa(Boolean isVisibilidadCeldaVerFormTipoEmpresa) {
		this.isVisibilidadCeldaVerFormTipoEmpresa = isVisibilidadCeldaVerFormTipoEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoEmpresa() {
		return isVisibilidadCeldaOrdenTipoEmpresa;
	}

	public void setIsVisibilidadCeldaOrdenTipoEmpresa(Boolean isVisibilidadCeldaOrdenTipoEmpresa) {
		this.isVisibilidadCeldaOrdenTipoEmpresa = isVisibilidadCeldaOrdenTipoEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoEmpresa() {
		return isVisibilidadCeldaNuevoRelacionesTipoEmpresa;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoEmpresa(Boolean isVisibilidadCeldaNuevoRelacionesTipoEmpresa) {
		this.isVisibilidadCeldaNuevoRelacionesTipoEmpresa = isVisibilidadCeldaNuevoRelacionesTipoEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoEmpresa() {
		return isVisibilidadCeldaModificarTipoEmpresa;
	}

	public void setIsVisibilidadCeldaModificarTipoEmpresa(Boolean isVisibilidadCeldaModificarTipoEmpresa) {
		this.isVisibilidadCeldaModificarTipoEmpresa = isVisibilidadCeldaModificarTipoEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoEmpresa() {
		return isVisibilidadCeldaActualizarTipoEmpresa;
	}

	public void setIsVisibilidadCeldaActualizarTipoEmpresa(Boolean isVisibilidadCeldaActualizarTipoEmpresa) {
		this.isVisibilidadCeldaActualizarTipoEmpresa = isVisibilidadCeldaActualizarTipoEmpresa;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoEmpresa() {
		return isVisibilidadCeldaEliminarTipoEmpresa;
	}

	public void setIsVisibilidadCeldaEliminarTipoEmpresa(Boolean isVisibilidadCeldaEliminarTipoEmpresa) {
		this.isVisibilidadCeldaEliminarTipoEmpresa = isVisibilidadCeldaEliminarTipoEmpresa;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoEmpresa() {
		return isVisibilidadCeldaCancelarTipoEmpresa;
	}

	public void setIsVisibilidadCeldaCancelarTipoEmpresa(Boolean isVisibilidadCeldaCancelarTipoEmpresa) {
		this.isVisibilidadCeldaCancelarTipoEmpresa = isVisibilidadCeldaCancelarTipoEmpresa;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoEmpresa() {
		return isVisibilidadCeldaGuardarTipoEmpresa;
	}

	public void setIsVisibilidadCeldaGuardarTipoEmpresa(Boolean isVisibilidadCeldaGuardarTipoEmpresa) {
		this.isVisibilidadCeldaGuardarTipoEmpresa = isVisibilidadCeldaGuardarTipoEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoEmpresa() {
		return isVisibilidadCeldaGuardarCambiosTipoEmpresa;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoEmpresa(Boolean isVisibilidadCeldaGuardarCambiosTipoEmpresa) {
		this.isVisibilidadCeldaGuardarCambiosTipoEmpresa = isVisibilidadCeldaGuardarCambiosTipoEmpresa;
	}
		
	public TipoEmpresaSessionBean gettipoempresaSessionBean() {
		return this.tipoempresaSessionBean;
	}
	
	public void settipoempresaSessionBean(TipoEmpresaSessionBean tipoempresaSessionBean) {
		this.tipoempresaSessionBean=tipoempresaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoEmpresa(TipoEmpresa tipoempresa)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoEmpresa tipoempresa,TipoEmpresa tipoempresaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoEmpresa(tipoempresa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoempresaAux.setId(tipoempresa.getId());
		tipoempresaAux.setVersionRow(tipoempresa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoEmpresa();
		
			int intSelectedRow = this.jTableDatosTipoEmpresa.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempresa =(TipoEmpresa) this.tipoempresaLogic.getTipoEmpresas().toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoempresa =(TipoEmpresa) this.tipoempresas.toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoEmpresa(this.tipoempresa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpresa(this.tipoempresa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoempresaValidator.getInvalidValues(this.tipoempresa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoempresaLogic.setDatosCliente(datosCliente);
			tipoempresaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoempresaAux=new  TipoEmpresa();
				
				tipoempresaAux.setIsNew(true);
				tipoempresaAux.setIsChanged(true);
				
				tipoempresaAux.setTipoEmpresaOriginal(this.tipoempresa);
				
				tipoempresaAux.setId(this.tipoempresa.getId());	
				tipoempresaAux.setVersionRow(this.tipoempresa.getVersionRow());	
				tipoempresaAux.setcodigo(this.tipoempresa.getcodigo());	
				tipoempresaAux.setnombre(this.tipoempresa.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoempresaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoempresaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoempresaAux,tipoempresaLogic.getTipoEmpresas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoempresaAux,tipoempresas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoempresaLogic.saveTipoEmpresas();//WithConnection
						//tipoempresaLogic.getSetVersionRowTipoEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoempresa,tipoempresaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoempresaAux=new  TipoEmpresa();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoempresaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoempresaSessionBean.getEsGuardarRelacionado() && this.tipoempresa.getId()>=0)) {
						
					tipoempresaAux.setIsNew(false);
				}
				
				tipoempresaAux.setIsDeleted(false);
			
				tipoempresaAux.setId(this.tipoempresa.getId());	
				tipoempresaAux.setVersionRow(this.tipoempresa.getVersionRow());	
				tipoempresaAux.setcodigo(this.tipoempresa.getcodigo());	
				tipoempresaAux.setnombre(this.tipoempresa.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoempresaAux,tipoempresaLogic.getTipoEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoempresaAux,tipoempresas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoempresaLogic.saveTipoEmpresas();//WithConnection
						//tipoempresaLogic.getSetVersionRowTipoEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoempresa,tipoempresaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoempresaAux=new  TipoEmpresa();
				
				tipoempresaAux.setIsNew(false);
				tipoempresaAux.setIsChanged(false);
				
				tipoempresaAux.setIsDeleted(true);
				
				tipoempresaAux.setId(this.tipoempresa.getId());	
				tipoempresaAux.setVersionRow(this.tipoempresa.getVersionRow());	
				tipoempresaAux.setcodigo(this.tipoempresa.getcodigo());	
				tipoempresaAux.setnombre(this.tipoempresa.getnombre());	
				
				if(this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoempresaAux.getId()>=0) {	
						this.tipoempresasEliminados.add(tipoempresaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoempresaAux,tipoempresaLogic.getTipoEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoempresaAux,tipoempresas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoempresaLogic.saveTipoEmpresas();//WithConnection
						//tipoempresaLogic.getSetVersionRowTipoEmpresas();//WithConnection
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
					this.tipoempresaLogic.getTipoEmpresas().addAll(this.tipoempresasEliminados);
					
					tipoempresaLogic.saveTipoEmpresas();//WithConnection
					//tipoempresaLogic.getSetVersionRowTipoEmpresas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoempresasEliminados= new ArrayList<TipoEmpresa>();		
			}
			
			if(this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Empresa GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Empresa",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoempresa=tipoempresaAux;
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
      		//this.finishProcessTipoEmpresa();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoEmpresa tipoempresaLocal) throws Exception {
		
		if(this.tipoempresaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoEmpresa tipoempresaLocal) throws Exception {	
		if(this.tipoempresaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoEmpresaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoEmpresa.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoempresa =(TipoEmpresa) this.tipoempresaLogic.getTipoEmpresas().toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoempresa =(TipoEmpresa) this.tipoempresas.toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoempresaValidator.getInvalidValues(this.tipoempresa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoEmpresa tipoempresa,List<TipoEmpresa> tipoempresas) throws Exception {
		try	{		
			TipoEmpresaConstantesFunciones.actualizarLista(tipoempresa,tipoempresas,this.tipoempresaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoEmpresa tipoempresa,List<TipoEmpresa> tipoempresas) throws Exception {
		try	{			
			TipoEmpresaConstantesFunciones.actualizarSelectedLista(tipoempresa,tipoempresas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoEmpresa> tipoempresasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoempresasLocal=this.tipoempresaLogic.getTipoEmpresas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoempresasLocal=this.tipoempresas;
			}
			//ARCHITECTURE
		
			for(TipoEmpresa tipoempresaLocal:tipoempresasLocal) {
				if(this.permiteMantenimiento(tipoempresaLocal) && tipoempresaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoEmpresaConstantesFunciones.getTipoEmpresaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoEmpresaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEmpresa.jLabelcodigoTipoEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoEmpresaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEmpresa.jLabelnombreTipoEmpresa,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoEmpresa.jLabelcodigoTipoEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoEmpresa.jLabelnombreTipoEmpresa,"");
		
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
		this.iIdNuevoTipoEmpresa--;	
		
		
		this.tipoempresaAux=new TipoEmpresa();
		
		this.tipoempresaAux.setId(this.iIdNuevoTipoEmpresa);
		this.tipoempresaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoempresaLogic.getTipoEmpresas().add(this.tipoempresaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoempresas.add(this.tipoempresaAux);
		}
		//ARCHITECTURE
		
		this.tipoempresa=this.tipoempresaAux;
		
		if(TipoEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoEmpresa(this.tipoempresa);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoEmpresa(this.tipoempresa);
		}
				
		//this.setDefaultControlesTipoEmpresa();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoEmpresa();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoEmpresa();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoEmpresa();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoEmpresa(this.tipoempresaBean,this.tipoempresa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpresa(this.tipoempresa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoEmpresaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoempresaSessionBean.getConGuardarRelaciones()) {
			classes=TipoEmpresaConstantesFunciones.getClassesRelationshipsOfTipoEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoempresaReturnGeneral=tipoempresaLogic.procesarEventosTipoEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoempresaLogic.getTipoEmpresas(),this.tipoempresa,this.tipoempresaParameterGeneral,this.isEsNuevoTipoEmpresa,classes);//this.tipoempresaLogic.getTipoEmpresa()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoEmpresa(this.tipoempresaReturnGeneral,this.tipoempresaBean,false);
		
		if(this.tipoempresaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoEmpresa(this.tipoempresaReturnGeneral.getTipoEmpresa());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoEmpresa(this.tipoempresaReturnGeneral.getTipoEmpresa());
		}
		
		if(this.tipoempresaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoEmpresa(this.tipoempresaReturnGeneral.getTipoEmpresa(),classes);//this.tipoempresaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoEmpresa(this.tipoempresa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoEmpresa();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoEmpresa();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoEmpresa(false);
						
			if(tipoempresaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoEmpresa();
			}
			
			this.actualizarVisualTableDatosTipoEmpresa();
			
			this.jTableDatosTipoEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoEmpresa(), this.getIndiceNuevoTipoEmpresa());
			
			this.seleccionarFilaTablaTipoEmpresaActual();
						
			this.actualizarEstadoCeldasBotonesTipoEmpresa("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoEmpresa(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoEmpresa.jTextFieldcodigoTipoEmpresa.setEnabled(isHabilitar && this.tipoempresaConstantesFunciones.activarcodigoTipoEmpresa);
		this.jInternalFrameDetalleFormTipoEmpresa.jTextAreanombreTipoEmpresa.setEnabled(isHabilitar && this.tipoempresaConstantesFunciones.activarnombreTipoEmpresa);	
		
	};
	
	public void setDefaultControlesTipoEmpresa() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoEmpresa(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoempresaSessionBean.setConGuardarRelaciones(true);			
			this.tipoempresaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoEmpresa.jTabbedPaneRelacionesTipoEmpresa.setVisible(true);
			
					
		} else {
			//this.tipoempresaSessionBean.setConGuardarRelaciones(false);			
			this.tipoempresaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoEmpresa.jTabbedPaneRelacionesTipoEmpresa.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoEmpresa() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEmpresa tipoempresaAux:this.tipoempresaLogic.getTipoEmpresas()) {
				if(tipoempresaAux.getId().equals(this.iIdNuevoTipoEmpresa)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEmpresa tipoempresaAux:this.tipoempresas) {
				if(tipoempresaAux.getId().equals(this.iIdNuevoTipoEmpresa)) {
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
	
	public int getIndiceActualTipoEmpresa(TipoEmpresa tipoempresa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEmpresa tipoempresaAux:this.tipoempresaLogic.getTipoEmpresas()) {
				if(tipoempresaAux.getId().equals(tipoempresa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEmpresa tipoempresaAux:this.tipoempresas) {
				if(tipoempresaAux.getId().equals(tipoempresa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoEmpresa(TipoEmpresa tipoempresaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEmpresa tipoempresaAux:this.tipoempresaLogic.getTipoEmpresas()) {
				if(tipoempresaAux.getTipoEmpresaOriginal().getId().equals(tipoempresaOriginal.getId())) {
					existe=true;
					tipoempresaOriginal.setId(tipoempresaAux.getId());
					tipoempresaOriginal.setVersionRow(tipoempresaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEmpresa tipoempresaAux:this.tipoempresas) {
				if(tipoempresaAux.getTipoEmpresaOriginal().getId().equals(tipoempresaOriginal.getId())) {
					existe=true;
					tipoempresaOriginal.setId(tipoempresaAux.getId());
					tipoempresaOriginal.setVersionRow(tipoempresaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoEmpresa(Boolean esParaCancelar) throws Exception {
		tipoempresasAux=new ArrayList<TipoEmpresa>();
		tipoempresaAux=new TipoEmpresa();
		
		if(!this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoEmpresa tipoempresaAux:this.tipoempresaLogic.getTipoEmpresas()) {
					if(tipoempresaAux.getId()<0) {
						tipoempresasAux.add(tipoempresaAux);
					}		
				}
				this.iIdNuevoTipoEmpresa=0L;
				this.tipoempresaLogic.getTipoEmpresas().removeAll(tipoempresasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEmpresa tipoempresaAux:this.tipoempresas) {
					if(tipoempresaAux.getId()<0) {
						tipoempresasAux.add(tipoempresaAux);
					}		
				}
				this.iIdNuevoTipoEmpresa=0L;
				this.tipoempresas.removeAll(tipoempresasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoEmpresa 
					&& this.tipoempresaLogic.getTipoEmpresas().size()>0
					) {
					tipoempresaAux=this.tipoempresaLogic.getTipoEmpresas().get(this.tipoempresaLogic.getTipoEmpresas().size() - 1);
				
					if(tipoempresaAux.getId()<0) {
						this.tipoempresaLogic.getTipoEmpresas().remove(tipoempresaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoEmpresa && this.tipoempresas.size()>0) {
					tipoempresaAux=this.tipoempresas.get(this.tipoempresas.size() - 1);
				
					if(tipoempresaAux.getId()<0) {
						this.tipoempresas.remove(tipoempresaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoEmpresa(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoempresa.getId()<0) {
				this.tipoempresaLogic.getTipoEmpresas().remove(this.tipoempresa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoempresa.getId()<0) {
				this.tipoempresas.remove(this.tipoempresa);
			}
		}			
	}
	
	public void setEstadosInicialesTipoEmpresa(List<TipoEmpresa> tipoempresasAux) throws Exception {
		TipoEmpresaConstantesFunciones.setEstadosInicialesTipoEmpresa(tipoempresasAux);
	}
	
	public void setEstadosInicialesTipoEmpresa(TipoEmpresa tipoempresaAux) throws Exception {
		TipoEmpresaConstantesFunciones.setEstadosInicialesTipoEmpresa(tipoempresaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoEmpresaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoEmpresaActual()) {
				if(!this.isEsNuevoTipoEmpresa) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoEmpresa=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoEmpresaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Empresa ?", "MANTENIMIENTO DE Tipo Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoEmpresa tipoempresa) throws Exception {
		TipoEmpresaConstantesFunciones.seleccionarAsignar(this.tipoempresa,tipoempresa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoEmpresa=this.isPermisoActualizarOriginalTipoEmpresa;
			
			
			this.seleccionarAsignar(tipoempresa);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoEmpresaConstantesFunciones.quitarEspaciosTipoEmpresa(this.tipoempresa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoempresaSessionBean.setsFuncionBusquedaRapida(this.tipoempresaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoEmpresa) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoEmpresa(esParaCancelar);				
				this.cancelarNuevoTipoEmpresa(esParaCancelar);								
			}
			
			this.tipoempresa=new TipoEmpresa();
			
			this.inicializarTipoEmpresa();
			
			this.actualizarEstadoCeldasBotonesTipoEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoEmpresa() throws Exception {
		try {
			TipoEmpresaConstantesFunciones.inicializarTipoEmpresa(this.tipoempresa);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoempresaLogic.getTipoEmpresas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoEmpresas(String sAccionBusqueda,List<TipoEmpresa> tipoempresasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoEmpresa"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoEmpresaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoEmpresaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoEmpresa"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Empresas");		
		parameters.put("busquedapor", TipoEmpresaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoEmpresa=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoEmpresa=new JRBeanArrayDataSource(TipoEmpresaJInternalFrame.TraerTipoEmpresaBeans(tipoempresasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoEmpresa);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoEmpresaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoEmpresaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoEmpresaBean.TraerTipoEmpresaBeans(tipoempresasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipoempresasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipoempresasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoEmpresaActionPerformed(null);
					//this.generarExcelReporteTipoEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipoempresasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipoempresasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipoempresasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipoempresasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoEmpresa> tipoempresasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoempresa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoEmpresas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoEmpresa("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoEmpresa tipoempresa : tipoempresasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoEmpresaConstantesFunciones.generarExcelReporteDataTipoEmpresa("NORMAL",row,workbook,tipoempresa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoEmpresa(String sTipo,Row row,Workbook workbook) {
		
		TipoEmpresaConstantesFunciones.generarExcelReporteHeaderTipoEmpresa(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoEmpresa> tipoempresasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoempresa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoEmpresas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoEmpresa tipoempresa : tipoempresasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoEmpresaConstantesFunciones.getTipoEmpresaDescripcion(tipoempresa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoEmpresaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoEmpresaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoempresa.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoEmpresaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoEmpresaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoempresa.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoEmpresa> tipoempresasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoEmpresa> tipoempresasRespaldo=null;
		
		classes=TipoEmpresaConstantesFunciones.getClassesRelationshipsOfTipoEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoempresaLogic.setDatosCliente(this.datosCliente);
		this.tipoempresaLogic.setDatosDeep(this.datosDeep);
		this.tipoempresaLogic.setIsConDeep(true);
		
		tipoempresasRespaldo=this.tipoempresaLogic.getTipoEmpresas();
		
		this.tipoempresaLogic.setTipoEmpresas(tipoempresasParaReportes);	
		this.tipoempresaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoempresasParaReportes=this.tipoempresaLogic.getTipoEmpresas();
		this.tipoempresaLogic.setTipoEmpresas(tipoempresasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoempresa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoEmpresas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoEmpresa("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoEmpresa tipoempresa : tipoempresasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoEmpresa("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoEmpresaConstantesFunciones.generarExcelReporteDataTipoEmpresa("NORMAL",row,workbook,tipoempresa,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoEmpresaConstantesFunciones.getTipoEmpresaDescripcion(tipoempresa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoEmpresa.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEmpresa.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoEmpresa() throws Exception {		
		this.startProcessTipoEmpresa(true);
	}
	
	public void startProcessTipoEmpresa(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoEmpresa, this.jScrollPanelDatosTipoEmpresa,this.jPanelPaginacionTipoEmpresa, this.jScrollPanelDatosEdicionTipoEmpresa, this.jPanelAccionesTipoEmpresa,this.jPanelAccionesFormularioTipoEmpresa,this.jmenuBarTipoEmpresa,this.jmenuBarDetalleTipoEmpresa,this.jTtoolBarTipoEmpresa,this.jTtoolBarDetalleTipoEmpresa);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoEmpresa=null; 
		
		final JPanel jPanelParametrosReportesTipoEmpresa=this.jPanelParametrosReportesTipoEmpresa;
		//final JScrollPane jScrollPanelDatosTipoEmpresa=this.jScrollPanelDatosTipoEmpresa;
		final JTable jTableDatosTipoEmpresa=this.jTableDatosTipoEmpresa;		
		final JPanel jPanelPaginacionTipoEmpresa=this.jPanelPaginacionTipoEmpresa;
		//final JScrollPane jScrollPanelDatosEdicionTipoEmpresa=this.jScrollPanelDatosEdicionTipoEmpresa;
		final JPanel jPanelAccionesTipoEmpresa=this.jPanelAccionesTipoEmpresa;
		
		JPanel jPanelCamposAuxiliarTipoEmpresa=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoEmpresa=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) {
			jPanelCamposAuxiliarTipoEmpresa=this.jInternalFrameDetalleFormTipoEmpresa.jPanelCamposTipoEmpresa;
			jPanelAccionesFormularioAuxiliarTipoEmpresa=this.jInternalFrameDetalleFormTipoEmpresa.jPanelAccionesFormularioTipoEmpresa;
		}
		
		final JPanel jPanelCamposTipoEmpresa=jPanelCamposAuxiliarTipoEmpresa;
		final JPanel jPanelAccionesFormularioTipoEmpresa=jPanelAccionesFormularioAuxiliarTipoEmpresa;
		
		
		final JMenuBar jmenuBarTipoEmpresa=this.jmenuBarTipoEmpresa;
		final JToolBar jTtoolBarTipoEmpresa=this.jTtoolBarTipoEmpresa;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoEmpresa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoEmpresa=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) {
			jmenuBarDetalleAuxiliarTipoEmpresa=this.jInternalFrameDetalleFormTipoEmpresa.jmenuBarDetalleTipoEmpresa;
			jTtoolBarDetalleAuxiliarTipoEmpresa=this.jInternalFrameDetalleFormTipoEmpresa.jTtoolBarDetalleTipoEmpresa;
		}
		
		final JMenuBar jmenuBarDetalleTipoEmpresa=jmenuBarDetalleAuxiliarTipoEmpresa;
		final JToolBar jTtoolBarDetalleTipoEmpresa=jTtoolBarDetalleAuxiliarTipoEmpresa;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoEmpresa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoEmpresa;
			processRunnable.jTableDatos=jTableDatosTipoEmpresa;
			processRunnable.jPanelCampos=jPanelCamposTipoEmpresa;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoEmpresa;
			processRunnable.jPanelAcciones=jPanelAccionesTipoEmpresa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoEmpresa;
			
			
			processRunnable.jmenuBar=jmenuBarTipoEmpresa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoEmpresa;
			processRunnable.jTtoolBar=jTtoolBarTipoEmpresa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoEmpresa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoEmpresa ,jPanelParametrosReportesTipoEmpresa,jTableDatosTipoEmpresa, /*jScrollPanelDatosTipoEmpresa,*/jPanelCamposTipoEmpresa,jPanelPaginacionTipoEmpresa, /*jScrollPanelDatosEdicionTipoEmpresa,*/ jPanelAccionesTipoEmpresa,jPanelAccionesFormularioTipoEmpresa,jmenuBarTipoEmpresa,jmenuBarDetalleTipoEmpresa,jTtoolBarTipoEmpresa,jTtoolBarDetalleTipoEmpresa);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoEmpresa, jScrollPanelDatosTipoEmpresa,jPanelPaginacionTipoEmpresa, jScrollPanelDatosEdicionTipoEmpresa, jPanelAccionesTipoEmpresa,jPanelAccionesFormularioTipoEmpresa,jmenuBarTipoEmpresa,jmenuBarDetalleTipoEmpresa,jTtoolBarTipoEmpresa,jTtoolBarDetalleTipoEmpresa);
						
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
	
	public void finishProcessTipoEmpresa() {// throws Exception 
		this.finishProcessTipoEmpresa(true);
	}
	
	public void finishProcessTipoEmpresa(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoEmpresa, this.jScrollPanelDatosTipoEmpresa,this.jPanelPaginacionTipoEmpresa, this.jScrollPanelDatosEdicionTipoEmpresa, this.jPanelAccionesTipoEmpresa,this.jPanelAccionesFormularioTipoEmpresa,this.jmenuBarTipoEmpresa,this.jmenuBarDetalleTipoEmpresa,this.jTtoolBarTipoEmpresa,this.jTtoolBarDetalleTipoEmpresa);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoEmpresa=null; 
		
		final JPanel jPanelParametrosReportesTipoEmpresa=this.jPanelParametrosReportesTipoEmpresa;
		//final JScrollPane jScrollPanelDatosTipoEmpresa=this.jScrollPanelDatosTipoEmpresa;
		final JTable jTableDatosTipoEmpresa=this.jTableDatosTipoEmpresa;		
		final JPanel jPanelPaginacionTipoEmpresa=this.jPanelPaginacionTipoEmpresa;
		//final JScrollPane jScrollPanelDatosEdicionTipoEmpresa=this.jScrollPanelDatosEdicionTipoEmpresa;
		final JPanel jPanelAccionesTipoEmpresa=this.jPanelAccionesTipoEmpresa;
		
		JPanel jPanelCamposAuxiliarTipoEmpresa=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoEmpresa=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) {
			jPanelCamposAuxiliarTipoEmpresa=this.jInternalFrameDetalleFormTipoEmpresa.jPanelCamposTipoEmpresa;
			jPanelAccionesFormularioAuxiliarTipoEmpresa=this.jInternalFrameDetalleFormTipoEmpresa.jPanelAccionesFormularioTipoEmpresa;
		}
		
		final JPanel jPanelCamposTipoEmpresa=jPanelCamposAuxiliarTipoEmpresa;
		final JPanel jPanelAccionesFormularioTipoEmpresa=jPanelAccionesFormularioAuxiliarTipoEmpresa;
		
		
		final JMenuBar jmenuBarTipoEmpresa=this.jmenuBarTipoEmpresa;		
		final JToolBar jTtoolBarTipoEmpresa=this.jTtoolBarTipoEmpresa;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoEmpresa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoEmpresa=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) {
			jmenuBarDetalleAuxiliarTipoEmpresa=this.jInternalFrameDetalleFormTipoEmpresa.jmenuBarDetalleTipoEmpresa;
			jTtoolBarDetalleAuxiliarTipoEmpresa=this.jInternalFrameDetalleFormTipoEmpresa.jTtoolBarDetalleTipoEmpresa;		
		}
		
		final JMenuBar jmenuBarDetalleTipoEmpresa=jmenuBarDetalleAuxiliarTipoEmpresa;
		final JToolBar jTtoolBarDetalleTipoEmpresa=jTtoolBarDetalleAuxiliarTipoEmpresa;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoEmpresa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoEmpresa;
			processRunnable.jTableDatos=jTableDatosTipoEmpresa;
			processRunnable.jPanelCampos=jPanelCamposTipoEmpresa;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoEmpresa;
			processRunnable.jPanelAcciones=jPanelAccionesTipoEmpresa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoEmpresa;
			
			
			processRunnable.jmenuBar=jmenuBarTipoEmpresa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoEmpresa;
			processRunnable.jTtoolBar=jTtoolBarTipoEmpresa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoEmpresa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoEmpresa ,jPanelParametrosReportesTipoEmpresa, jTableDatosTipoEmpresa,/*jScrollPanelDatosTipoEmpresa,*/jPanelCamposTipoEmpresa,jPanelPaginacionTipoEmpresa, /*jScrollPanelDatosEdicionTipoEmpresa,*/ jPanelAccionesTipoEmpresa,jPanelAccionesFormularioTipoEmpresa,jmenuBarTipoEmpresa,jmenuBarDetalleTipoEmpresa,jTtoolBarTipoEmpresa,jTtoolBarDetalleTipoEmpresa));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoEmpresa(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoEmpresa(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoEmpresa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoEmpresa,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoEmpresa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoEmpresa,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoempresaConstantesFunciones.getsFinalQueryTipoEmpresa();
		String  finalQueryPaginacionTodos=this.tipoempresaConstantesFunciones.getsFinalQueryTipoEmpresa();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoEmpresaConstantesFunciones.getArrayColumnasGlobalesNoTipoEmpresa(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoEmpresa(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoEmpresaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoempresasEliminados= new ArrayList<TipoEmpresa>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoEmpresa();
		
				///*TipoEmpresaSessionBean*/this.tipoempresaSessionBean=new TipoEmpresaSessionBean();
			
			if(this.tipoempresaSessionBean==null) {
				this.tipoempresaSessionBean=new TipoEmpresaSessionBean();
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
					this.iNumeroPaginacion=TipoEmpresaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoEmpresaConstantesFunciones.getClassesForeignKeysOfTipoEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoempresa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoempresasAux= new ArrayList<TipoEmpresa>();
			
				
			tipoempresaLogic.setDatosCliente(this.datosCliente);
			tipoempresaLogic.setDatosDeep(this.datosDeep);
			tipoempresaLogic.setIsConDeep(true);
			
			
			tipoempresaLogic.getTipoEmpresaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoempresaLogic.getTodosTipoEmpresas(finalQueryGlobal,pagination);
					
					//tipoempresaLogic.getTodosTipoEmpresasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoempresaLogic.getTipoEmpresas()==null|| tipoempresaLogic.getTipoEmpresas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoempresasAux= new ArrayList<TipoEmpresa>();
							tipoempresasAux.addAll(tipoempresaLogic.getTipoEmpresas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoempresasAux= new ArrayList<TipoEmpresa>();
							tipoempresasAux.addAll(tipoempresas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoempresaLogic.getTodosTipoEmpresas(finalQueryGlobal+"",this.pagination);												
							
							//tipoempresaLogic.getTodosTipoEmpresasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoEmpresas("Todos",tipoempresaLogic.getTipoEmpresas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoempresaLogic.setTipoEmpresas(new ArrayList<TipoEmpresa>());					
							tipoempresaLogic.getTipoEmpresas().addAll(tipoempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoempresas=new ArrayList<TipoEmpresa>();
							tipoempresas.addAll(tipoempresasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoEmpresa=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoEmpresa=this.idActual;
				
				} else if(this.idTipoEmpresaActual!=null && this.idTipoEmpresaActual!=0L) {
					idTipoEmpresa=idTipoEmpresaActual;
				}
				
					
				this.sDetalleReporte=TipoEmpresaConstantesFunciones.getDetalleIndicePorId(idTipoEmpresa);
				
				this.tipoempresas=new ArrayList<TipoEmpresa>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoempresaLogic.getEntity(idTipoEmpresa);
					
					//tipoempresaLogic.getEntityWithConnection(idTipoEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoempresaLogic.setTipoEmpresas(new ArrayList<TipoEmpresa>());
					tipoempresaLogic.getTipoEmpresas().add(tipoempresaLogic.getTipoEmpresa());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoempresas=new ArrayList<TipoEmpresa>();
					this.tipoempresas.add(tipoempresa);
				}
				
				if(tipoempresaLogic.getTipoEmpresa()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoEmpresa();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoEmpresa();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoempresaLogic.getTipoEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoempresas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoempresaLogic.getTipoEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoempresas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoEmpresa tipoempresa) {
		Boolean permite=true;
		
		if(this.tipoempresa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoEmpresaConstantesFunciones.getOrderByListaTipoEmpresa();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoEmpresaConstantesFunciones.getOrderByListaTipoEmpresa();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEmpresa tipoempresa:tipoempresaLogic.getTipoEmpresas()) {
				if(tipoempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipoempresaTotales=tipoempresa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEmpresa tipoempresa:this.tipoempresas) {
				if(tipoempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipoempresaTotales=tipoempresa;
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
			this.tipoempresaAux=new TipoEmpresa();
			this.tipoempresaAux.setsType(Constantes2.S_TOTALES);
			this.tipoempresaAux.setIsNew(false);
			this.tipoempresaAux.setIsChanged(false);
			this.tipoempresaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoEmpresaConstantesFunciones.TotalizarValoresFilaTipoEmpresa(this.tipoempresaLogic.getTipoEmpresas(),this.tipoempresaAux);
				
				this.tipoempresaLogic.getTipoEmpresas().add(this.tipoempresaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoEmpresaConstantesFunciones.TotalizarValoresFilaTipoEmpresa(this.tipoempresas,this.tipoempresaAux);
				
				this.tipoempresas.add(this.tipoempresaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoempresaTotales=new TipoEmpresa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoempresaLogic.getTipoEmpresas().remove(tipoempresaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoempresas.remove(tipoempresaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoempresaTotales=new TipoEmpresa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEmpresa tipoempresa:tipoempresaLogic.getTipoEmpresas()) {
				if(tipoempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipoempresaTotales=tipoempresa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoEmpresaConstantesFunciones.TotalizarValoresFilaTipoEmpresa(this.tipoempresaLogic.getTipoEmpresas(),tipoempresaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEmpresa tipoempresa:this.tipoempresas) {
				if(tipoempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipoempresaTotales=tipoempresa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoEmpresaConstantesFunciones.TotalizarValoresFilaTipoEmpresa(this.tipoempresas,tipoempresaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoEmpresaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoEmpresaPorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoempresaLogic.getTipoEmpresaPorCodigo(codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
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
	
	public void inicializarPermisosTipoEmpresa() {
		this.isPermisoTodoTipoEmpresa=false;
		this.isPermisoNuevoTipoEmpresa=false;
		this.isPermisoActualizarTipoEmpresa=false;
		this.isPermisoActualizarOriginalTipoEmpresa=false;
		this.isPermisoEliminarTipoEmpresa=false;
		this.isPermisoGuardarCambiosTipoEmpresa=false;
		this.isPermisoConsultaTipoEmpresa=false;
		this.isPermisoBusquedaTipoEmpresa=false;
		this.isPermisoReporteTipoEmpresa=false;		
		this.isPermisoOrdenTipoEmpresa=false;		
		this.isPermisoPaginacionMedioTipoEmpresa=false;		
		this.isPermisoPaginacionAltoTipoEmpresa=false;
		this.isPermisoPaginacionTodoTipoEmpresa=false;
		this.isPermisoCopiarTipoEmpresa=false;		
		this.isPermisoVerFormTipoEmpresa=false;		
		this.isPermisoDuplicarTipoEmpresa=false;		
		this.isPermisoOrdenTipoEmpresa=false;		
	}
	
	public void setPermisosUsuarioTipoEmpresa(Boolean isPermiso) {
		this.isPermisoTodoTipoEmpresa=isPermiso;
		this.isPermisoNuevoTipoEmpresa=isPermiso;
		this.isPermisoActualizarTipoEmpresa=isPermiso;
		this.isPermisoActualizarOriginalTipoEmpresa=isPermiso;
		this.isPermisoEliminarTipoEmpresa=isPermiso;
		this.isPermisoGuardarCambiosTipoEmpresa=isPermiso;
		this.isPermisoConsultaTipoEmpresa=isPermiso;
		this.isPermisoBusquedaTipoEmpresa=isPermiso;
		this.isPermisoReporteTipoEmpresa=isPermiso;
		this.isPermisoOrdenTipoEmpresa=isPermiso;		
		this.isPermisoPaginacionMedioTipoEmpresa=isPermiso;		
		this.isPermisoPaginacionAltoTipoEmpresa=isPermiso;		
		this.isPermisoPaginacionTodoTipoEmpresa=isPermiso;		
		this.isPermisoCopiarTipoEmpresa=isPermiso;		
		this.isPermisoVerFormTipoEmpresa=isPermiso;		
		this.isPermisoDuplicarTipoEmpresa=isPermiso;
		this.isPermisoOrdenTipoEmpresa=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoEmpresa(Boolean isPermiso) {
		//this.isPermisoTodoTipoEmpresa=isPermiso;
		this.isPermisoNuevoTipoEmpresa=isPermiso;
		this.isPermisoActualizarTipoEmpresa=isPermiso;
		this.isPermisoActualizarOriginalTipoEmpresa=isPermiso;
		this.isPermisoEliminarTipoEmpresa=isPermiso;
		this.isPermisoGuardarCambiosTipoEmpresa=isPermiso;
		//this.isPermisoConsultaTipoEmpresa=isPermiso;
		//this.isPermisoBusquedaTipoEmpresa=isPermiso;
		//this.isPermisoReporteTipoEmpresa=isPermiso;
		//this.isPermisoOrdenTipoEmpresa=isPermiso;		
		//this.isPermisoPaginacionMedioTipoEmpresa=isPermiso;		
		//this.isPermisoPaginacionAltoTipoEmpresa=isPermiso;		
		//this.isPermisoPaginacionTodoTipoEmpresa=isPermiso;		
		//this.isPermisoCopiarTipoEmpresa=isPermiso;		
		//this.isPermisoDuplicarTipoEmpresa=isPermiso;
		//this.isPermisoOrdenTipoEmpresa=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoEmpresaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoEmpresa(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoEmpresaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoEmpresaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoEmpresaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoEmpresaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoEmpresa() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoEmpresaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoEmpresa=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoEmpresa=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoEmpresa=this.isPermisoActualizarTipoEmpresa;
			this.isPermisoEliminarTipoEmpresa=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoEmpresa=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoEmpresa=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoEmpresa=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoEmpresa=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoEmpresa=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoEmpresa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoEmpresa=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoEmpresa=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoEmpresa=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoEmpresa=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoEmpresa=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoEmpresa=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoEmpresa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoEmpresa.setToolTipText(this.jTableDatosTipoEmpresa.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoEmpresa(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoEmpresa(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoEmpresa() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoEmpresaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoEmpresaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoEmpresaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoEmpresaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoEmpresaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoEmpresa()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoEmpresa()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoEmpresa(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoEmpresa()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoEmpresa();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoEmpresa(TipoEmpresa tipoempresa)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoEmpresa(TipoEmpresa tipoempresa,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoEmpresa()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoEmpresa()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoEmpresa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoEmpresa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoEmpresa()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoEmpresa()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoEmpresa(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoEmpresa()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoEmpresaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoEmpresaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoEmpresaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoempresaSessionBean=new TipoEmpresaSessionBean(); 
		this.tipoempresaConstantesFunciones=new TipoEmpresaConstantesFunciones(); 
		this.tipoempresaBean=new TipoEmpresa();//(this.tipoempresaConstantesFunciones); 		
		this.tipoempresaReturnGeneral=new TipoEmpresaParameterReturnGeneral(); 
		
		this.tipoempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoEmpresa(true);
			
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
			
			this.tipoempresaConstantesFunciones=new TipoEmpresaConstantesFunciones(); 
			this.tipoempresaBean=new TipoEmpresa();//this.tipoempresaConstantesFunciones); 			
			this.tipoempresaReturnGeneral=new TipoEmpresaParameterReturnGeneral(); 
		
			TipoEmpresaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Empresa Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoempresa=new TipoEmpresa();
			this.tipoempresas = new ArrayList<TipoEmpresa>();
			this.tipoempresasAux = new ArrayList<TipoEmpresa>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic=new TipoEmpresaLogic();
				this.tipoempresaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoEmpresa);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoEmpresa);	
					}
					
					if(this.jInternalFrameImportacionTipoEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoEmpresa);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoEmpresa);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoEmpresa!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoEmpresa);
				this.jInternalFrameDetalleFormTipoEmpresa.setVisible(false);
				this.jInternalFrameDetalleFormTipoEmpresa.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoEmpresa);
					this.jInternalFrameReporteDinamicoTipoEmpresa.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoEmpresa.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoEmpresa);
					this.jInternalFrameImportacionTipoEmpresa.setVisible(false);
					this.jInternalFrameImportacionTipoEmpresa.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoEmpresa);
					this.jInternalFrameOrderByTipoEmpresa.setVisible(false);
					this.jInternalFrameOrderByTipoEmpresa.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoEmpresaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoEmpresaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoempresaReturnGeneral=new TipoEmpresaParameterReturnGeneral();
			
			this.tipoempresaParameterGeneral=new TipoEmpresaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoempresaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoEmpresaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoempresaSessionBean.getEsGuardarRelacionado(),this.tipoempresaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoEmpresaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoempresaSessionBean.getEsGuardarRelacionado(),this.tipoempresaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoEmpresa=false;
			this.isVisibilidadCeldaDuplicarTipoEmpresa=true;
			this.isVisibilidadCeldaCopiarTipoEmpresa=true;
			this.isVisibilidadCeldaVerFormTipoEmpresa=true;
			this.isVisibilidadCeldaOrdenTipoEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpresa=false;
			this.isVisibilidadCeldaModificarTipoEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoEmpresa=false;
			this.isVisibilidadCeldaGuardarTipoEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEmpresa=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoEmpresa();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoEmpresa(false);
			
			this.setPermisosUsuarioTipoEmpresa();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoempresaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoempresaSessionBean.getEsGuardarRelacionado() && this.tipoempresaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoEmpresaClasesRelacionadas();
			}
			
			if(this.tipoempresaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoEmpresaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoEmpresa();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoEmpresa();
			}
			
			if(!this.isPermisoBusquedaTipoEmpresa) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoempresaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoEmpresa,this.isPermisoPaginacionMedioTipoEmpresa,this.isPermisoPaginacionTodoTipoEmpresa);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoEmpresaConstantesFunciones.getTiposSeleccionarTipoEmpresa());
				
				this.tiposColumnasSelect=TipoEmpresaConstantesFunciones.getTiposSeleccionarTipoEmpresa(true);
				
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
			//if(!this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoEmpresa();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoEmpresa(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoEmpresa(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoEmpresa() ;
			
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
				tipoempresaImplementable= (TipoEmpresaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoEmpresaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoempresaImplementableHome= (TipoEmpresaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoEmpresaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoempresas= new ArrayList<TipoEmpresa>();
			this.tipoempresasEliminados= new ArrayList<TipoEmpresa>();
						
			this.isEsNuevoTipoEmpresa=false;
			this.esParaAccionDesdeFormularioTipoEmpresa=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoEmpresa(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoEmpresa();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoEmpresaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoEmpresa(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoEmpresa!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoEmpresa();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoEmpresa();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoEmpresa(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoEmpresa: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoEmpresa() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoEmpresa")) {
				iIndex=this.jInternalFrameDetalleFormTipoEmpresa.jTabbedPaneRelacionesTipoEmpresa.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoEmpresa.jTabbedPaneRelacionesTipoEmpresa.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoEmpresa.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoEmpresa();	
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
	
	public void cargarCombosForeignKeyTipoEmpresa(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoEmpresa(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoEmpresa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoEmpresaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoEmpresa();
		
		this.cargarCombosFrameForeignKeyTipoEmpresa();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoEmpresa();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoEmpresa();
		}
	}
	
	
	
	public void jButtonNuevoTipoEmpresaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoempresaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
			
			
			if(jTableDatosTipoEmpresa.getRowCount()>=1) {
				jTableDatosTipoEmpresa.removeRowSelectionInterval(0, jTableDatosTipoEmpresa.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoEmpresa=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoEmpresa(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoEmpresa(true);			
			//this.tipoempresa=new TipoEmpresa();
			//this.tipoempresa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoEmpresa(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEmpresa() ;
			
			if(TipoEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoEmpresa(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoempresa);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoempresa);				
			
			TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
			
			if(this.tipoempresaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoEmpresa: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoEmpresaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoEmpresa> tipoempresasSeleccionados=new ArrayList<TipoEmpresa>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoEmpresa.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoEmpresa.getSelectedRows().length;			
			}
			
			tipoempresasSeleccionados=this.getTipoEmpresasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoEmpresa--;			
				//TipoEmpresa tipoempresaAux= new TipoEmpresa();			
				//tipoempresaAux.setId(this.iIdNuevoTipoEmpresa);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoEmpresa tipoempresaOrigen=new TipoEmpresa();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoEmpresa tipoempresaOrigen : tipoempresasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoEmpresa.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoempresaOrigen =(TipoEmpresa) this.tipoempresaLogic.getTipoEmpresas().toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoempresaOrigen =(TipoEmpresa) this.tipoempresas.toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoEmpresa();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoempresa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoEmpresa(tipoempresaOrigen,this.tipoempresa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpresa(this.tipoempresa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoempresaLogic.getTipoEmpresas().add(this.tipoempresaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoempresas.add(this.tipoempresaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoEmpresa(false);
				
				this.jTableDatosTipoEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoEmpresa(), this.getIndiceNuevoTipoEmpresa());
				
				int iLastRow =  this.jTableDatosTipoEmpresa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoEmpresa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoEmpresa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoEmpresa(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoEmpresa> tipoempresasSeleccionados=new ArrayList<TipoEmpresa>();									
		
			TipoEmpresa tipoempresaOrigen=new TipoEmpresa();
			TipoEmpresa tipoempresaDestino=new TipoEmpresa();
				
			tipoempresasSeleccionados=this.getTipoEmpresasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoEmpresa.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoempresasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoEmpresa.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoempresaOrigen =(TipoEmpresa) this.tipoempresaLogic.getTipoEmpresas().toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoempresaOrigen =(TipoEmpresa) this.tipoempresas.toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoempresaDestino =(TipoEmpresa) this.tipoempresaLogic.getTipoEmpresas().toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoempresaDestino =(TipoEmpresa) this.tipoempresas.toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoempresaOrigen =tipoempresasSeleccionados.get(0);
				tipoempresaDestino =tipoempresasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoEmpresa(tipoempresaOrigen,tipoempresaDestino,true,false);
				
				tipoempresaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoempresaDestino,tipoempresaLogic.getTipoEmpresas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoempresaDestino,tipoempresas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoEmpresa(false);
				
				//this.jTableDatosTipoEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoEmpresa(), this.getIndiceNuevoTipoEmpresa());
				
				int iLastRow =  this.jTableDatosTipoEmpresa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoEmpresa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoEmpresa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoEmpresa(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoEmpresa.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoEmpresa.isVisible();
			
			
			this.jPanelParametrosReportesTipoEmpresa.setVisible(!isVisible);
			this.jPanelPaginacionTipoEmpresa.setVisible(!isVisible);
			this.jPanelAccionesTipoEmpresa.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoEmpresa();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoEmpresa();
			
			this.abrirFrameOrderByTipoEmpresa();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoEmpresa(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoEmpresa);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoEmpresa.isMaximum()) {
					this.jInternalFrameDetalleFormTipoEmpresa.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoEmpresa.setSize(this.jInternalFrameDetalleFormTipoEmpresa.iWidthFormulario,this.jInternalFrameDetalleFormTipoEmpresa.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoEmpresa.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoEmpresa.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoEmpresa.isMaximum()) {
						this.jInternalFrameDetalleFormTipoEmpresa.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoEmpresa.jContentPaneDetalleTipoEmpresa.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoEmpresa.jTabbedPaneRelacionesTipoEmpresa.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoEmpresa.jContentPaneDetalleTipoEmpresa.getWidth(),TipoEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoEmpresa.jTabbedPaneRelacionesTipoEmpresa.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoEmpresa.jContentPaneDetalleTipoEmpresa.getWidth(),TipoEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoEmpresa.jTabbedPaneRelacionesTipoEmpresa.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoEmpresa.jContentPaneDetalleTipoEmpresa.getWidth(),TipoEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoEmpresa.setVisible(true);
	        this.jInternalFrameDetalleFormTipoEmpresa.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoEmpresa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoEmpresa==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEmpresa,false,this);
				} else {
					this.jInternalFrameOrderByTipoEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEmpresa,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoEmpresa);
				this.jInternalFrameOrderByTipoEmpresa.setVisible(false);
				this.jInternalFrameOrderByTipoEmpresa.setSelected(false);
				
				this.jInternalFrameOrderByTipoEmpresa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoEmpresa"));
				
				this.inicializarActualizarBindingTablaOrderByTipoEmpresa();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoEmpresa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoEmpresa==null) {
				
				this.jInternalFrameImportacionTipoEmpresa=new ImportacionJInternalFrame(TipoEmpresaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoEmpresa);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoEmpresa);
				this.jInternalFrameImportacionTipoEmpresa.setVisible(false);
				this.jInternalFrameImportacionTipoEmpresa.setSelected(false);


				this.jInternalFrameImportacionTipoEmpresa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoEmpresa"));
				this.jInternalFrameImportacionTipoEmpresa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoEmpresa"));
				this.jInternalFrameImportacionTipoEmpresa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoEmpresa"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoEmpresa() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoEmpresa==null) {
				this.jInternalFrameReporteDinamicoTipoEmpresa=new ReporteDinamicoJInternalFrame(TipoEmpresaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoEmpresa);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoEmpresa);
				this.jInternalFrameReporteDinamicoTipoEmpresa.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoEmpresa.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoEmpresa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoEmpresa"));
				this.jInternalFrameReporteDinamicoTipoEmpresa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoEmpresa"));
				this.jInternalFrameReporteDinamicoTipoEmpresa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoEmpresa"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoEmpresa();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoEmpresa() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoEmpresa);
			
	       	this.jInternalFrameDetalleFormTipoEmpresa.setVisible(false);
	        this.jInternalFrameDetalleFormTipoEmpresa.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoEmpresa.dispose();
			//this.jInternalFrameDetalleFormTipoEmpresa=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoEmpresa() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoEmpresa.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoEmpresa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoEmpresa.setVisible(true);
	        this.jInternalFrameImportacionTipoEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoEmpresa() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoEmpresa.setVisible(true);
	        this.jInternalFrameOrderByTipoEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoEmpresa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoEmpresa.setVisible(false);
	        this.jInternalFrameOrderByTipoEmpresa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoEmpresa() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoEmpresa.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoEmpresa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoEmpresa() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoEmpresa.setVisible(false);
	        this.jInternalFrameImportacionTipoEmpresa.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoEmpresa(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoEmpresa(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoEmpresa.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoEmpresa(true);
			//this.isEsNuevoTipoEmpresa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresa =(TipoEmpresa) this.tipoempresaLogic.getTipoEmpresas().toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoempresa =(TipoEmpresa) this.tipoempresas.toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoEmpresa(false) ;
			
			if(tipoempresaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoEmpresa(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEmpresa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoEmpresaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempresa =(TipoEmpresa) this.tipoempresaLogic.getTipoEmpresas().toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoempresa =(TipoEmpresa) this.tipoempresas.toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoEmpresa(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoEmpresa.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoEmpresa(true);
			//this.isEsNuevoTipoEmpresa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresa =(TipoEmpresa) this.tipoempresaLogic.getTipoEmpresas().toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoempresa =(TipoEmpresa) this.tipoempresas.toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoempresa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoEmpresa(false) ;
			
			if(TipoEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoEmpresa(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEmpresa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoEmpresa(false);
			
			//if(!this.isEsNuevoTipoEmpresa) {								
				int intSelectedRow = this.jTableDatosTipoEmpresa.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempresa =(TipoEmpresa) this.tipoempresaLogic.getTipoEmpresas().toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoempresa =(TipoEmpresa) this.tipoempresas.toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoEmpresa(this.tipoempresa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpresa(this.tipoempresa);
				
			}
			
			if(this.permiteMantenimiento(this.tipoempresa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoEmpresa=true;
					this.inicializarActualizarBindingTablaTipoEmpresa(false);
					this.isEsNuevoTipoEmpresa=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoEmpresa=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoEmpresa=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoEmpresa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoEmpresa(false);
				
				this.habilitarDeshabilitarControlesTipoEmpresa(false);
			
												
				
				if(TipoEmpresaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoEmpresa();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoEmpresaActionPerformed(evt,tipoempresaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoEmpresa(this.tipoempresa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoEmpresa.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoempresaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoempresa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoEmpresa.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEmpresa.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoEmpresa.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresa =(TipoEmpresa) this.tipoempresaLogic.getTipoEmpresas().toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
				this.tipoempresa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoempresa =(TipoEmpresa) this.tipoempresas.toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
				this.tipoempresa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoempresa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoEmpresaModel) this.jTableDatosTipoEmpresa.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoEmpresa=true;
				this.inicializarActualizarBindingTablaTipoEmpresa(false);
				this.isEsNuevoTipoEmpresa=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoEmpresa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoEmpresa(false);
				
				this.habilitarDeshabilitarControlesTipoEmpresa(false);
				
				
				
				if(TipoEmpresaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoEmpresa();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoEmpresaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoEmpresa.getRowCount()>=1) {
				jTableDatosTipoEmpresa.removeRowSelectionInterval(0, jTableDatosTipoEmpresa.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoEmpresa(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoEmpresa(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoEmpresa(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEmpresa(false) ;
			
			this.isEsNuevoTipoEmpresa=false;
			
			if(TipoEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoEmpresa();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoEmpresa(false);
				
				//SI ES MANUAL
				if(TipoEmpresaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoEmpresa();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoEmpresa--;			
			//TipoEmpresa tipoempresaAux= new TipoEmpresa();			
			//tipoempresaAux.setId(this.iIdNuevoTipoEmpresa);
			
			if(this.jInternalFrameDetalleFormTipoEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoEmpresa();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpresa(this.tipoempresa);
			
			this.tipoempresa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoempresaLogic.getTipoEmpresas().add(this.tipoempresaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoempresas.add(this.tipoempresaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoEmpresa(false);
			
			this.jTableDatosTipoEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoEmpresa(), this.getIndiceNuevoTipoEmpresa());
			
			int iLastRow =  this.jTableDatosTipoEmpresa.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoEmpresa.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoEmpresa.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoEmpresa(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoEmpresa(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEmpresa(false);
			
			//SI ES MANUAL
			if(TipoEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoEmpresa();
			}
			
			//this.abrirFrameTreeTipoEmpresa();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoEmpresaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo EmpresaS ?", "MANTENIMIENTO DE Tipo Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoEmpresa.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoEmpresa();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoempresaReturnGeneral=tipoempresaLogic.procesarImportacionTipoEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoempresaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoEmpresaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoEmpresaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoEmpresa.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoEmpresa.setFileImportacion(this.jInternalFrameImportacionTipoEmpresa.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoEmpresa.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoEmpresa.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoEmpresa.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoEmpresa.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoEmpresa> tipoempresasSeleccionados=new ArrayList<TipoEmpresa>();		

		tipoempresasSeleccionados=this.getTipoEmpresasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEmpresa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEmpresa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoEmpresaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoEmpresaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoEmpresas("Todos",tipoempresasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoEmpresaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoEmpresaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoEmpresa.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoEmpresa.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoEmpresa.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoEmpresaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoEmpresaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoEmpresa.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoEmpresaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoEmpresaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoEmpresa.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEmpresa.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoEmpresaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoEmpresaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoEmpresaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoEmpresa> tipoempresasSeleccionados=new ArrayList<TipoEmpresa>();		
		
		tipoempresasSeleccionados=this.getTipoEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoempresa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoEmpresas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoEmpresaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoEmpresaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoEmpresa tipoempresa:tipoempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoempresa.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoEmpresaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoEmpresaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoEmpresa tipoempresa:tipoempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoempresa.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoEmpresa(row);				
			//	iRow++;
			//}				
			
			//for(TipoEmpresa tipoempresaAux:tipoempresasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoEmpresa(tipoempresaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Empresa",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoempresaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEmpresa(false);
			
			//SI ES MANUAL
			if(TipoEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoEmpresa();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEmpresa(false);
			
			//SI ES MANUAL
			if(TipoEmpresaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoEmpresa();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEmpresa(false);
			
			//SI ES MANUAL
			if(TipoEmpresaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoEmpresa();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoEmpresa() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoEmpresa.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoEmpresa.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoEmpresa.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoEmpresa.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoEmpresa.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoEmpresa.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoEmpresa.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoEmpresa(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoEmpresa(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoEmpresa(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoEmpresa(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoEmpresa(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoEmpresa(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoEmpresa(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoEmpresa(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoEmpresaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoEmpresa() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoEmpresa();
		
		this.inicializarActualizarBindingBotonesManualTipoEmpresa(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoEmpresa();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoEmpresa() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoEmpresa(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoEmpresa(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoEmpresa.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoEmpresa.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoEmpresa.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoEmpresa!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoEmpresa.jCheckBoxPostAccionNuevoTipoEmpresa.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoEmpresa.jCheckBoxPostAccionSinCerrarTipoEmpresa.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoEmpresa.jCheckBoxPostAccionSinMensajeTipoEmpresa.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoEmpresa.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoEmpresa.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoEmpresa.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoEmpresa!=null) {
				this.jInternalFrameDetalleFormTipoEmpresa.jCheckBoxPostAccionNuevoTipoEmpresa.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoEmpresa.jCheckBoxPostAccionSinCerrarTipoEmpresa.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoEmpresa.jCheckBoxPostAccionSinMensajeTipoEmpresa.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoEmpresa.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoEmpresa.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoEmpresa!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoEmpresa.jComboBoxTiposAccionesFormularioTipoEmpresa.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoEmpresa.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoEmpresa!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEmpresa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoEmpresa.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoEmpresa.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoEmpresa.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoEmpresa.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoEmpresa!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEmpresa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoEmpresa.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoEmpresa.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoEmpresa(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoEmpresa(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoEmpresa() throws Exception {
		try	{
			if(TipoEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoEmpresa();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoEmpresa() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoEmpresa.jComboBoxTiposAccionesFormularioTipoEmpresa.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoEmpresa.jComboBoxTiposAccionesFormularioTipoEmpresa.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoEmpresa() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoEmpresa.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoEmpresa.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoEmpresa.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoEmpresa.addItem(reporte);
			}
			
			
			if(!this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoEmpresa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoEmpresa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoEmpresa.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoEmpresa.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoEmpresa!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoEmpresa.jComboBoxTiposAccionesFormularioTipoEmpresa.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoEmpresa.jComboBoxTiposAccionesFormularioTipoEmpresa.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoEmpresa.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoEmpresa.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoEmpresa();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoEmpresa() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoEmpresa.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoEmpresa.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoEmpresa.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoEmpresa.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoEmpresa!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoEmpresa.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoEmpresa.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoEmpresa.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoEmpresa.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoEmpresa.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoEmpresa.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoEmpresa()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoEmpresa(Boolean esInicializar) throws Exception {				
		if(TipoEmpresaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoEmpresa();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoEmpresa() throws Exception {
		this.inicializarActualizarBindingTablaTipoEmpresa(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoEmpresa() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoEmpresa.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoEmpresa.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoEmpresaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoEmpresa.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoEmpresaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoEmpresaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEmpresaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoEmpresaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoEmpresa.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoEmpresaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoEmpresa.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoEmpresa(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoempresaLogic.getTipoEmpresas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoempresas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoEmpresa.setModel(new TipoEmpresaModel(this.tipoempresaLogic.getTipoEmpresas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoEmpresa.setModel(new TipoEmpresaModel(this.tipoempresas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoEmpresa!=null && this.jInternalFrameOrderByTipoEmpresa.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoEmpresa();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEmpresa,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoEmpresaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO,tipoempresaConstantesFunciones.resaltarSeleccionarTipoEmpresa,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO,tipoempresaConstantesFunciones.resaltarSeleccionarTipoEmpresa,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEmpresa,TipoEmpresaConstantesFunciones.LABEL_ID));

		if(this.tipoempresaConstantesFunciones.mostraridTipoEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoEmpresaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoempresaConstantesFunciones.resaltaridTipoEmpresa,this.tipoempresaConstantesFunciones.activaridTipoEmpresa,this,true,"idTipoEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoempresaConstantesFunciones.resaltaridTipoEmpresa,this.tipoempresaConstantesFunciones.activaridTipoEmpresa,this,true,"idTipoEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEmpresa,TipoEmpresaConstantesFunciones.LABEL_CODIGO));

		if(this.tipoempresaConstantesFunciones.mostrarcodigoTipoEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoEmpresaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoempresaConstantesFunciones.resaltarcodigoTipoEmpresa,this.tipoempresaConstantesFunciones.activarcodigoTipoEmpresa,this,true,"codigoTipoEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoempresaConstantesFunciones.resaltarcodigoTipoEmpresa,this.tipoempresaConstantesFunciones.activarcodigoTipoEmpresa,this,true,"codigoTipoEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEmpresa,TipoEmpresaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoempresaConstantesFunciones.mostrarnombreTipoEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoEmpresaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoempresaConstantesFunciones.resaltarnombreTipoEmpresa,this.tipoempresaConstantesFunciones.activarnombreTipoEmpresa,this,true,"nombreTipoEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoempresaConstantesFunciones.resaltarnombreTipoEmpresa,this.tipoempresaConstantesFunciones.activarnombreTipoEmpresa,this,true,"nombreTipoEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoempresaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoempresaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoempresaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoEmpresa.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoempresaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoempresaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoEmpresa.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoEmpresa && this.isPermisoGuardarCambiosTipoEmpresa) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoempresaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoempresaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoEmpresa.addColumn(tableColumn);
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
			
			this.jTableDatosTipoEmpresa.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoEmpresa && this.isPermisoGuardarCambiosTipoEmpresa) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoEmpresa && this.isPermisoGuardarCambiosTipoEmpresa) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoEmpresa.moveColumn(this.jTableDatosTipoEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoEmpresa.moveColumn(this.jTableDatosTipoEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoEmpresa.moveColumn(this.jTableDatosTipoEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoEmpresa.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoEmpresa.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoEmpresa,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoEmpresa.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoEmpresa.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoEmpresa.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoEmpresa.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoEmpresa.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoempresaLogic.getTipoEmpresas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoempresas.size()-1;
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
		//this.jTableDatosTipoEmpresa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoEmpresa();
			
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
				
				//this.isEsNuevoTipoEmpresa=false;
					
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
			
				if(this.tipoempresaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoEmpresa==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoEmpresa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoEmpresa.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempresa =(TipoEmpresa) this.tipoempresaLogic.getTipoEmpresas().toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoempresa =(TipoEmpresa) this.tipoempresas.toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoempresa.getsType().equals("DUPLICADO")
				   || this.tipoempresa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoEmpresa=true;
				
				} else {
					this.isEsNuevoTipoEmpresa=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoempresa.getId()>=0 && !this.tipoempresa.getIsNew()) {						
						this.isEsNuevoTipoEmpresa=false;
						
					} else {
						this.isEsNuevoTipoEmpresa=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoEmpresa(esRelaciones);						
				
				this.seleccionarTipoEmpresa(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoempresa.getId()<0) {
					this.isEsNuevoTipoEmpresa=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoEmpresa(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoEmpresa(evt,rowIndex);
				}	
				
				if(this.tipoempresaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoEmpresa: " + this.dDif); 
					}
				}								
				
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoEmpresa(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoempresa)) {
					if(this.tipoempresa.getId()>0) {
						this.tipoempresa.setIsDeleted(true);
						
						this.tipoempresasEliminados.add(this.tipoempresa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoempresaLogic.getTipoEmpresas().remove(this.tipoempresa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoempresas.remove(this.tipoempresa);				
					}
					
					
					((TipoEmpresaModel) this.jTableDatosTipoEmpresa.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoEmpresa(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoEmpresa(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoEmpresa) {
			
			if(this.jInternalFrameDetalleFormTipoEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoEmpresa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoEmpresa.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempresa =(TipoEmpresa) this.tipoempresaLogic.getTipoEmpresas().toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoempresa =(TipoEmpresa) this.tipoempresas.toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoEmpresa(this.tipoempresa);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoEmpresa("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoEmpresa(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoEmpresa() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoEmpresa(TipoEmpresa tipoempresa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoEmpresa(tipoempresa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoEmpresa(TipoEmpresa tipoempresa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoEmpresa(tipoempresa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoEmpresa(tipoempresa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoEmpresa(tipoempresa);
	}
	
	public void setVariablesObjetoActualToFormularioTipoEmpresa(TipoEmpresa tipoempresa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoEmpresa.jLabelidTipoEmpresa.setText(tipoempresa.getId().toString());
			this.jInternalFrameDetalleFormTipoEmpresa.jTextFieldcodigoTipoEmpresa.setText(tipoempresa.getcodigo());
			this.jInternalFrameDetalleFormTipoEmpresa.jTextAreanombreTipoEmpresa.setText(tipoempresa.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoEmpresa tipoempresaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoempresaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoEmpresa tipoempresaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoempresaLocal=this.tipoempresa;
			} else {
				tipoempresaLocal=this.tipoempresaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoempresaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoEmpresa(tipoempresaLocal,true);
					
					if(tipoempresaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoempresaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoempresaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoEmpresa(TipoEmpresa tipoempresa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoEmpresa(tipoempresa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpresa(tipoempresa);
	}
	
	public void setVariablesFormularioToObjetoActualTipoEmpresa(TipoEmpresa tipoempresa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoEmpresa(tipoempresa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoEmpresa(TipoEmpresa tipoempresa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoEmpresa.jLabelidTipoEmpresa.getText()==null || this.jInternalFrameDetalleFormTipoEmpresa.jLabelidTipoEmpresa.getText()=="" || this.jInternalFrameDetalleFormTipoEmpresa.jLabelidTipoEmpresa.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoEmpresa.jLabelidTipoEmpresa.setText("0");
			}

			if(conColumnasBase) {tipoempresa.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoEmpresa.jLabelidTipoEmpresa.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoEmpresaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEmpresa.jLabelIdTipoEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoempresa.setcodigo(this.jInternalFrameDetalleFormTipoEmpresa.jTextFieldcodigoTipoEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoEmpresaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEmpresa.jLabelcodigoTipoEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoempresa.setnombre(this.jInternalFrameDetalleFormTipoEmpresa.jTextAreanombreTipoEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoEmpresaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEmpresa.jLabelnombreTipoEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoEmpresa(TipoEmpresa tipoempresaBean,TipoEmpresa tipoempresa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoEmpresa(TipoEmpresa tipoempresaOrigen,TipoEmpresa tipoempresa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoempresaOrigen.getId()!=null && !tipoempresaOrigen.getId().equals(0L))) {tipoempresa.setId(tipoempresaOrigen.getId());}}
			if(conDefault || (!conDefault && tipoempresaOrigen.getcodigo()!=null && !tipoempresaOrigen.getcodigo().equals(""))) {tipoempresa.setcodigo(tipoempresaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoempresaOrigen.getnombre()!=null && !tipoempresaOrigen.getnombre().equals(""))) {tipoempresa.setnombre(tipoempresaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoEmpresa(TipoEmpresa tipoempresa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoEmpresa.jLabelidTipoEmpresa.setText(tipoempresa.getId().toString());
			this.jInternalFrameDetalleFormTipoEmpresa.jTextFieldcodigoTipoEmpresa.setText(tipoempresa.getcodigo());
			this.jInternalFrameDetalleFormTipoEmpresa.jTextAreanombreTipoEmpresa.setText(tipoempresa.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoEmpresa(TipoEmpresaBean tipoempresaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoEmpresa.jLabelidTipoEmpresa.setText(tipoempresaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoEmpresa.jTextFieldcodigoTipoEmpresa.setText(tipoempresaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoEmpresa.jTextAreanombreTipoEmpresa.setText(tipoempresaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoEmpresa(TipoEmpresaParameterReturnGeneral tipoempresaReturnGeneral,TipoEmpresaBean tipoempresaBean,Boolean conDefault) throws Exception { 
		try {
			TipoEmpresa tipoempresaLocal=new TipoEmpresa();
			
			tipoempresaLocal=tipoempresaReturnGeneral.getTipoEmpresa();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoempresaLocal.getId()!=null && !tipoempresaLocal.getId().equals(0L))) {tipoempresaBean.setId(tipoempresaLocal.getId());}}
			if(conDefault || (!conDefault && tipoempresaLocal.getcodigo()!=null && !tipoempresaLocal.getcodigo().equals(""))) {tipoempresaBean.setcodigo(tipoempresaLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoempresaLocal.getnombre()!=null && !tipoempresaLocal.getnombre().equals(""))) {tipoempresaBean.setnombre(tipoempresaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoEmpresaGenerico(Long idTipoEmpresaSeleccionado,JComboBox jComboBoxTipoEmpresa,List<TipoEmpresa> tipoempresasLocal)throws Exception {
		try {
			TipoEmpresa  tipoempresaTemp=null;

			for(TipoEmpresa tipoempresaAux:tipoempresasLocal) {
				if(tipoempresaAux.getId()!=null && tipoempresaAux.getId().equals(idTipoEmpresaSeleccionado)) {
					tipoempresaTemp=tipoempresaAux;
					break;
				}
			}

			jComboBoxTipoEmpresa.setSelectedItem(tipoempresaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoEmpresaGenerico(JComboBox jComboBoxTipoEmpresa,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoEmpresa.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoEmpresa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoEmpresa.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoEmpresa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoempresa=(TipoEmpresa) tipoempresaLogic.getTipoEmpresas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoempresa =(TipoEmpresa) tipoempresas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoEmpresa tipoempresaRow=new TipoEmpresa();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoempresaRow=(TipoEmpresa) tipoempresaLogic.getTipoEmpresas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoempresaRow=(TipoEmpresa) tipoempresas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoEmpresa(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoEmpresa && this.isPermisoNuevoTipoEmpresa));			
			this.jButtonDuplicarTipoEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoEmpresa && this.isPermisoDuplicarTipoEmpresa));			
			this.jButtonCopiarTipoEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoEmpresa && this.isPermisoCopiarTipoEmpresa));
			this.jButtonVerFormTipoEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoEmpresa && this.isPermisoVerFormTipoEmpresa));
			
			this.jButtonAbrirOrderByTipoEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoEmpresa && this.isPermisoOrdenTipoEmpresa));			
			
			this.jButtonNuevoRelacionesTipoEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoEmpresa && this.isPermisoNuevoTipoEmpresa));			
			this.jButtonNuevoGuardarCambiosTipoEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoEmpresa && this.isPermisoNuevoTipoEmpresa && this.isPermisoGuardarCambiosTipoEmpresa));
			
			if(this.jInternalFrameDetalleFormTipoEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonModificarTipoEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoEmpresa && this.isPermisoActualizarTipoEmpresa));	
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonActualizarTipoEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoEmpresa && this.isPermisoActualizarTipoEmpresa));	
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonEliminarTipoEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoEmpresa && this.isPermisoEliminarTipoEmpresa));
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonCancelarTipoEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoEmpresa);							
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonGuardarCambiosTipoEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoEmpresa && this.isPermisoGuardarCambiosTipoEmpresa));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoEmpresa && this.isPermisoGuardarCambiosTipoEmpresa));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoEmpresa && this.isPermisoNuevoTipoEmpresa));						
			this.jButtonDuplicarToolBarTipoEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoEmpresa && this.isPermisoDuplicarTipoEmpresa));						
			this.jButtonCopiarToolBarTipoEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoEmpresa && this.isPermisoCopiarTipoEmpresa));			
			this.jButtonVerFormToolBarTipoEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoEmpresa && this.isPermisoVerFormTipoEmpresa));			
			this.jButtonAbrirOrderByToolBarTipoEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoEmpresa && this.isPermisoOrdenTipoEmpresa));
			this.jButtonNuevoRelacionesToolBarTipoEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoEmpresa && this.isPermisoNuevoTipoEmpresa));			
			this.jButtonNuevoGuardarCambiosToolBarTipoEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoEmpresa && this.isPermisoNuevoTipoEmpresa && this.isPermisoGuardarCambiosTipoEmpresa));			
			
			if(this.jInternalFrameDetalleFormTipoEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonModificarToolBarTipoEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoEmpresa && this.isPermisoActualizarTipoEmpresa));	
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonActualizarToolBarTipoEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoEmpresa  && this.isPermisoActualizarTipoEmpresa));	
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonEliminarToolBarTipoEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoEmpresa && this.isPermisoEliminarTipoEmpresa));
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonCancelarToolBarTipoEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoEmpresa);				
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonGuardarCambiosToolBarTipoEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoEmpresa && this.isPermisoGuardarCambiosTipoEmpresa));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoEmpresa && this.isPermisoGuardarCambiosTipoEmpresa));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoEmpresa && this.isPermisoNuevoTipoEmpresa));			
			this.jMenuItemDuplicarTipoEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoEmpresa && this.isPermisoDuplicarTipoEmpresa));			
			this.jMenuItemCopiarTipoEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoEmpresa && this.isPermisoCopiarTipoEmpresa));			
			this.jMenuItemVerFormTipoEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoEmpresa && this.isPermisoVerFormTipoEmpresa));			
			this.jMenuItemAbrirOrderByTipoEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoEmpresa && this.isPermisoOrdenTipoEmpresa));			
			//this.jMenuItemMostrarOcultarTipoEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoEmpresa && this.isPermisoOrdenTipoEmpresa));
			this.jMenuItemDetalleAbrirOrderByTipoEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoEmpresa && this.isPermisoOrdenTipoEmpresa));			
			//this.jMenuItemDetalleMostrarOcultarTipoEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoEmpresa && this.isPermisoOrdenTipoEmpresa));			
			this.jMenuItemNuevoRelacionesTipoEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoEmpresa && this.isPermisoNuevoTipoEmpresa));			
			this.jMenuItemNuevoGuardarCambiosTipoEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoEmpresa && this.isPermisoNuevoTipoEmpresa && this.isPermisoGuardarCambiosTipoEmpresa));									
			
			if(this.jInternalFrameDetalleFormTipoEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoEmpresa.jMenuItemModificarTipoEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoEmpresa && this.isPermisoActualizarTipoEmpresa));	
			this.jInternalFrameDetalleFormTipoEmpresa.jMenuItemActualizarTipoEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoEmpresa && this.isPermisoActualizarTipoEmpresa));	
			this.jInternalFrameDetalleFormTipoEmpresa.jMenuItemEliminarTipoEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoEmpresa && this.isPermisoEliminarTipoEmpresa));
			this.jInternalFrameDetalleFormTipoEmpresa.jMenuItemCancelarTipoEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoEmpresa);				
			}
			
			this.jMenuItemGuardarCambiosTipoEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoEmpresa && this.isPermisoGuardarCambiosTipoEmpresa));						
			this.jMenuItemGuardarCambiosTablaTipoEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoEmpresa && this.isPermisoGuardarCambiosTipoEmpresa));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoEmpresa=this.jButtonNuevoTipoEmpresa.isVisible();
			this.isVisibilidadCeldaDuplicarTipoEmpresa=this.jButtonDuplicarTipoEmpresa.isVisible();
			this.isVisibilidadCeldaCopiarTipoEmpresa=this.jButtonCopiarTipoEmpresa.isVisible();
			this.isVisibilidadCeldaVerFormTipoEmpresa=this.jButtonVerFormTipoEmpresa.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoEmpresa=this.jButtonAbrirOrderByTipoEmpresa.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpresa=this.jButtonNuevoRelacionesTipoEmpresa.isVisible();
			this.isVisibilidadCeldaModificarTipoEmpresa=this.jButtonModificarTipoEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoEmpresa!=null) {
			this.isVisibilidadCeldaActualizarTipoEmpresa=this.jInternalFrameDetalleFormTipoEmpresa.jButtonActualizarTipoEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoEmpresa=this.jInternalFrameDetalleFormTipoEmpresa.jButtonEliminarTipoEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoEmpresa=this.jInternalFrameDetalleFormTipoEmpresa.jButtonCancelarTipoEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarTipoEmpresa=this.jInternalFrameDetalleFormTipoEmpresa.jButtonGuardarCambiosTipoEmpresa.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoEmpresa=this.jButtonGuardarCambiosTablaTipoEmpresa.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoEmpresa=this.jButtonNuevoToolBarTipoEmpresa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpresa=this.jButtonNuevoRelacionesToolBarTipoEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoEmpresa!=null) {
			this.isVisibilidadCeldaModificarTipoEmpresa=this.jInternalFrameDetalleFormTipoEmpresa.jButtonModificarToolBarTipoEmpresa.isVisible();
			this.isVisibilidadCeldaActualizarTipoEmpresa=this.jInternalFrameDetalleFormTipoEmpresa.jButtonActualizarToolBarTipoEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoEmpresa=this.jInternalFrameDetalleFormTipoEmpresa.jButtonEliminarToolBarTipoEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoEmpresa=this.jInternalFrameDetalleFormTipoEmpresa.jButtonCancelarToolBarTipoEmpresa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoEmpresa=this.jButtonGuardarCambiosToolBarTipoEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoEmpresa=this.jButtonGuardarCambiosTablaToolBarTipoEmpresa.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoEmpresa=this.jMenuItemNuevoTipoEmpresa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpresa=this.jMenuItemNuevoRelacionesTipoEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoEmpresa!=null) {
			this.isVisibilidadCeldaModificarTipoEmpresa=this.jInternalFrameDetalleFormTipoEmpresa.jMenuItemModificarTipoEmpresa.isVisible();
			this.isVisibilidadCeldaActualizarTipoEmpresa=this.jInternalFrameDetalleFormTipoEmpresa.jMenuItemActualizarTipoEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoEmpresa=this.jInternalFrameDetalleFormTipoEmpresa.jMenuItemEliminarTipoEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoEmpresa=this.jInternalFrameDetalleFormTipoEmpresa.jMenuItemCancelarTipoEmpresa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoEmpresa=this.jMenuItemGuardarCambiosTipoEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoEmpresa=this.jMenuItemGuardarCambiosTablaTipoEmpresa.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoEmpresa(Boolean esInicializar) {
		if(TipoEmpresaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoempresaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoEmpresa();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoEmpresa(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoEmpresa() {
		this.jButtonNuevoTipoEmpresa.setVisible(this.isPermisoNuevoTipoEmpresa);			
		this.jButtonDuplicarTipoEmpresa.setVisible(this.isPermisoDuplicarTipoEmpresa);			
		this.jButtonCopiarTipoEmpresa.setVisible(this.isPermisoCopiarTipoEmpresa);			
		this.jButtonVerFormTipoEmpresa.setVisible(this.isPermisoVerFormTipoEmpresa);			
		
		this.jButtonAbrirOrderByTipoEmpresa.setVisible(this.isPermisoOrdenTipoEmpresa);					
		
		this.jButtonNuevoRelacionesTipoEmpresa.setVisible(this.isPermisoNuevoTipoEmpresa);			
		
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonModificarTipoEmpresa.setVisible(this.isPermisoActualizarTipoEmpresa);	
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonActualizarTipoEmpresa.setVisible(this.isPermisoActualizarTipoEmpresa);	
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonEliminarTipoEmpresa.setVisible(this.isPermisoEliminarTipoEmpresa);
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonCancelarTipoEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoEmpresa);						
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonGuardarCambiosTipoEmpresa.setVisible(this.isPermisoGuardarCambiosTipoEmpresa);							
		}
		
		this.jButtonGuardarCambiosTablaTipoEmpresa.setVisible(this.isPermisoActualizarTipoEmpresa);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoEmpresa() {
		this.jInternalFrameDetalleFormTipoEmpresa.jButtonModificarTipoEmpresa.setVisible(this.isPermisoActualizarTipoEmpresa);	
		this.jInternalFrameDetalleFormTipoEmpresa.jButtonActualizarTipoEmpresa.setVisible(this.isPermisoActualizarTipoEmpresa);	
		this.jInternalFrameDetalleFormTipoEmpresa.jButtonEliminarTipoEmpresa.setVisible(this.isPermisoEliminarTipoEmpresa);
		this.jInternalFrameDetalleFormTipoEmpresa.jButtonCancelarTipoEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoEmpresa);							
		this.jInternalFrameDetalleFormTipoEmpresa.jButtonGuardarCambiosTipoEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoEmpresa && this.isPermisoGuardarCambiosTipoEmpresa));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoEmpresa() {
		if(TipoEmpresaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoEmpresa();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoEmpresa() {
	}
	
	public void jTableDatosTipoEmpresaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoEmpresa(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoEmpresa(this.gettipoempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpresa(this.tipoempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoempresa =(TipoEmpresa) this.tipoempresaLogic.getTipoEmpresas().toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoempresa =(TipoEmpresa) this.tipoempresas.toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoempresa==null) {
						this.tipoempresa = new TipoEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoEmpresa(this.tipoempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpresa(this.tipoempresa);
				}

				if(this.tipoempresa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoempresa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoEmpresa(this.gettipoempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpresa(this.tipoempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoempresa =(TipoEmpresa) this.tipoempresaLogic.getTipoEmpresas().toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoempresa =(TipoEmpresa) this.tipoempresas.toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoempresa==null) {
						this.tipoempresa = new TipoEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoEmpresa(this.tipoempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpresa(this.tipoempresa);
				}

				if(this.tipoempresa.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoempresa.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoEmpresa(this.gettipoempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpresa(this.tipoempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoempresa =(TipoEmpresa) this.tipoempresaLogic.getTipoEmpresas().toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoempresa =(TipoEmpresa) this.tipoempresas.toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoempresa==null) {
						this.tipoempresa = new TipoEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoEmpresa(this.tipoempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpresa(this.tipoempresa);
				}

				if(this.tipoempresa.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoempresa.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoEmpresa() {
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoEmpresa.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoEmpresa.dispose();
			this.jInternalFrameDetalleFormTipoEmpresa=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoEmpresa!=null) {
			this.jInternalFrameReporteDinamicoTipoEmpresa.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoEmpresa.dispose();
			this.jInternalFrameReporteDinamicoTipoEmpresa=null;
		}
		
		if(this.jInternalFrameImportacionTipoEmpresa!=null) {
			this.jInternalFrameImportacionTipoEmpresa.setVisible(false);	    			
			this.jInternalFrameImportacionTipoEmpresa.dispose();
			this.jInternalFrameImportacionTipoEmpresa=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoEmpresa();
			
			TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoEmpresa")) {
				jButtonNuevoTipoEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoEmpresa")) {
				jButtonDuplicarTipoEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoEmpresa")) {
				jButtonCopiarTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoEmpresa")) {
				jButtonVerFormTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoEmpresa")) {
				jButtonNuevoTipoEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoEmpresa")) {
				jButtonDuplicarTipoEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoEmpresa")) {
				jButtonNuevoTipoEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoEmpresa")) {
				jButtonDuplicarTipoEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoEmpresa")) {
				jButtonNuevoTipoEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoEmpresa")) {
				jButtonNuevoTipoEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoEmpresa")) {
				jButtonNuevoTipoEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoEmpresa")) {
				jButtonModificarTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoEmpresa")) {
				jButtonModificarTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoEmpresa")) {
				jButtonModificarTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoEmpresa")) {
				jButtonActualizarTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoEmpresa")) {
				jButtonActualizarTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoEmpresa")) {
				jButtonActualizarTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoEmpresa")) {
				jButtonEliminarTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoEmpresa")) {
				jButtonEliminarTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoEmpresa")) {
				jButtonEliminarTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoEmpresa")) {
				jButtonCancelarTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoEmpresa")) {
				jButtonCancelarTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoEmpresa")) {
				jButtonCancelarTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoEmpresa")) {
				jButtonCerrarTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoEmpresa")) {
				jButtonCerrarTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoEmpresa")) {
				jButtonCerrarTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoEmpresa")) {
				jButtonMostrarOcultarTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoEmpresa")) {
				jButtonCancelarTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoEmpresa")) {
				jButtonGuardarCambiosTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoEmpresa")) {
				jButtonGuardarCambiosTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoEmpresa")) {
				jButtonCopiarTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoEmpresa")) {
				jButtonVerFormTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoEmpresa")) {
				jButtonGuardarCambiosTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoEmpresa")) {
				jButtonCopiarTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoEmpresa")) {
				jButtonVerFormTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoEmpresa")) {
				jButtonGuardarCambiosTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoEmpresa")) {
				jButtonGuardarCambiosTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoEmpresa")) {
				jButtonGuardarCambiosTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoEmpresa")) {
				jButtonRecargarInformacionTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoEmpresa")) {
				jButtonRecargarInformacionTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoEmpresa")) {
				jButtonRecargarInformacionTipoEmpresaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoEmpresa")) {
				jButtonAnterioresTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoEmpresa")) {
				jButtonAnterioresTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoEmpresa")) {
				jButtonAnterioresTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoEmpresa")) {
				jButtonSiguientesTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoEmpresa")) {
				jButtonSiguientesTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoEmpresa")) {
				jButtonSiguientesTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoEmpresa") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoEmpresa")) {
				jButtonAbrirOrderByTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoEmpresa") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoEmpresa")) {
				jButtonMostrarOcultarTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoEmpresa")) {
				jButtonNuevoGuardarCambiosTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoEmpresa")) {
				jButtonNuevoGuardarCambiosTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoEmpresa")) {
				jButtonNuevoGuardarCambiosTipoEmpresaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoEmpresa")) {
				jButtonCerrarReporteDinamicoTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoEmpresa")) {
				jButtonGenerarReporteDinamicoTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoEmpresa")) {
				
				jButtonGenerarExcelReporteDinamicoTipoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoEmpresa")) {
				jButtonCerrarImportacionTipoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoEmpresa")) {
				
				jButtonGenerarImportacionTipoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoEmpresa")) {
				
				jButtonAbrirImportacionTipoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoEmpresa")) {
				jComboBoxTiposAccionesTipoEmpresaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoEmpresa")) {
				jComboBoxTiposRelacionesTipoEmpresaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoEmpresa")) {
				jComboBoxTiposAccionesTipoEmpresaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoEmpresa")) {
				
				jComboBoxTiposSeleccionarTipoEmpresaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoEmpresa")) {
				jTextFieldValorCampoGeneralTipoEmpresaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoEmpresa")) {
				jButtonAbrirOrderByTipoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoEmpresa")) {
				jButtonAbrirOrderByTipoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoEmpresa")) {
				jButtonCerrarOrderByTipoEmpresaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoEmpresaBusqueda")) {
				this.jButtonidTipoEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoEmpresaBusqueda")) {
				this.jButtoncodigoTipoEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoEmpresaBusqueda")) {
				this.jButtonnombreTipoEmpresaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoEmpresa();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEmpresaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoempresa);
				
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
				
				


				
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoEmpresa tipoempresaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoempresaLocal=this.tipoempresa;
			} else {
				tipoempresaLocal=this.tipoempresaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoempresa);
				
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
							
				
				


				
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempresaAnterior =(TipoEmpresa) this.tipoempresaLogic.getTipoEmpresas().toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoempresaAnterior =(TipoEmpresa) this.tipoempresas.toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
			
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
			
			


			
			TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEmpresaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoempresa);
				
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
								
						
				


				
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEmpresa.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoempresa);
				
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
								
				
				


				
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempresaAnterior =(TipoEmpresa) this.tipoempresaLogic.getTipoEmpresas().toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoempresaAnterior =(TipoEmpresa) this.tipoempresas.toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoempresa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempresaAnterior =(TipoEmpresa) this.tipoempresaLogic.getTipoEmpresas().toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoempresaAnterior =(TipoEmpresa) this.tipoempresas.toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEmpresaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoempresa);
				
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
							
				
				


				
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEmpresa.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEmpresaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoEmpresa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoempresaAnterior =(TipoEmpresa) this.tipoempresaLogic.getTipoEmpresas().toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoempresaAnterior =(TipoEmpresa) this.tipoempresas.toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
			
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
			
			


			
			TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEmpresaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoempresa);
				
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
								
				
				


				
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempresaAnterior =(TipoEmpresa) this.tipoempresaLogic.getTipoEmpresas().toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoempresaAnterior =(TipoEmpresa) this.tipoempresas.toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEmpresaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEmpresaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoempresa);
				
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoEmpresa")) {
					jCheckBoxSeleccionarTodosTipoEmpresaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoEmpresa")) {
					jCheckBoxSeleccionadosTipoEmpresaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoEmpresa")) {
					
				}
				
				


				
				
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempresa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoempresa);
				
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
												
				
				


				
				
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEmpresaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoEmpresa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoempresaAnterior =(TipoEmpresa) this.tipoempresaLogic.getTipoEmpresas().toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoempresaAnterior =(TipoEmpresa) this.tipoempresas.toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEmpresaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoempresa);
				
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
				
				
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
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
			
			


			
			TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEmpresaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoempresa);
				
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEmpresa.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEmpresa.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoempresa);
				
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
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
				
				


				
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEmpresa.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempresaAnterior =(TipoEmpresa) this.tipoempresaLogic.getTipoEmpresas().toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoempresaAnterior =(TipoEmpresa) this.tipoempresas.toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoEmpresa")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoEmpresaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoEmpresa.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoempresa =(TipoEmpresa) this.tipoempresaLogic.getTipoEmpresas().toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoempresa =(TipoEmpresa) this.tipoempresas.toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoempresa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoEmpresa")) {
				
				}
				
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoEmpresa")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoEmpresa.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoEmpresa")) {
			
			}
			
			TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoEmpresa();
			
			TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoEmpresa")) {
				jButtonNuevoTipoEmpresaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoEmpresa")) {
				jButtonDuplicarTipoEmpresaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoEmpresa")) {
				jButtonCopiarTipoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoEmpresa")) {
				jButtonVerFormTipoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoEmpresa")) {
				jButtonNuevoTipoEmpresaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoEmpresa")) {
				jButtonModificarTipoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoEmpresa")) {
				jButtonActualizarTipoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoEmpresa")) {
				jButtonEliminarTipoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoEmpresa")) {
				jButtonGuardarCambiosTipoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoEmpresa")) {
				jButtonCancelarTipoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoEmpresa")) {
				jButtonCerrarTipoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoEmpresa")) {
				jButtonGuardarCambiosTipoEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoEmpresa")) {
				jButtonNuevoGuardarCambiosTipoEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoEmpresa")) {
				jButtonAbrirOrderByTipoEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoEmpresa")) {
				jButtonRecargarInformacionTipoEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoEmpresa")) {
				jButtonAnterioresTipoEmpresaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoEmpresa")) {
				jButtonSiguientesTipoEmpresaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoEmpresaBusqueda")) {
				this.jButtonidTipoEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoEmpresaBusqueda")) {
				this.jButtoncodigoTipoEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoEmpresaBusqueda")) {
				this.jButtonnombreTipoEmpresaBusquedaActionPerformed(evt);
			}
			
			TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoEmpresa();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoEmpresa")) {
				closingInternalFrameTipoEmpresa();
				
			} else if(sTipo.equals("jButtonCancelarTipoEmpresa")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoEmpresa = (JInternalFrameBase)evt.getSource();
	            	
	            TipoEmpresaBeanSwingJInternalFrame jInternalFrameParent=(TipoEmpresaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoEmpresa.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoEmpresaActionPerformed(null);
			}
			
			TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoempresa,new Object(),this.tipoempresaParameterGeneral,this.tipoempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoEmpresa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoEmpresa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoEmpresa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoempresa)) {
			if(!esControlTabla) {
				if(TipoEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoEmpresa(this.tipoempresa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpresa(this.tipoempresa);			
				}
				
				if(this.tipoempresaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoEmpresa(this.tipoempresa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoempresaReturnGeneral=tipoempresaLogic.procesarEventosTipoEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoempresaLogic.getTipoEmpresas(),this.tipoempresa,this.tipoempresaParameterGeneral,this.isEsNuevoTipoEmpresa,classes);//this.tipoempresaLogic.getTipoEmpresa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoEmpresa(this.tipoempresaReturnGeneral,this.tipoempresaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoEmpresa(classes,this.tipoempresaReturnGeneral,this.tipoempresaBean,false);
					}
						
					if(this.tipoempresaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoEmpresa(this.tipoempresaReturnGeneral.getTipoEmpresa());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoEmpresa(this.tipoempresaReturnGeneral.getTipoEmpresa());	
					}
						
					if(this.tipoempresaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoEmpresa(this.tipoempresaReturnGeneral.getTipoEmpresa(),classes);//this.tipoempresaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoEmpresa(this.tipoempresa,classes);//this.tipoempresaBean);									
				}
			
				if(TipoEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoEmpresa(this.tipoempresa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpresa(this.tipoempresa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoempresaAnterior!=null) {
						this.tipoempresa=this.tipoempresaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoempresaReturnGeneral=tipoempresaLogic.procesarEventosTipoEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoempresaLogic.getTipoEmpresas(),this.tipoempresa,this.tipoempresaParameterGeneral,this.isEsNuevoTipoEmpresa,classes);//this.tipoempresaLogic.getTipoEmpresa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoempresaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoempresaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoempresaReturnGeneral.getTipoEmpresa(),tipoempresaLogic.getTipoEmpresas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoempresaReturnGeneral.getTipoEmpresa(),this.tipoempresas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoEmpresa.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoEmpresa.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoEmpresa();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoEmpresa() throws Exception {
		
		TipoEmpresaModel tipoempresaModel=(TipoEmpresaModel)this.jTableDatosTipoEmpresa.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoempresaModel.tipoempresas=this.tipoempresaLogic.getTipoEmpresas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoempresaModel.tipoempresas=this.tipoempresas;
		}
		
		
		((TipoEmpresaModel) this.jTableDatosTipoEmpresa.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoEmpresa() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoempresaAnterior(),this.tipoempresaLogic.getTipoEmpresas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoempresaAnterior(),this.tipoempresas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoEmpresa();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoEmpresa(TipoEmpresa tipoempresa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
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
										
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoempresa,new Object(),generalEntityParameterGeneral,this.tipoempresaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoempresaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoEmpresaConstantesFunciones.getClassesRelationshipsOfTipoEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoEmpresaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoEmpresa(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoEmpresa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoempresa,new Object(),generalEntityParameterGeneral,this.tipoempresaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoEmpresa(TipoEmpresaBean tipoempresaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoEmpresa(ArrayList<Classe> classes,TipoEmpresaReturnGeneral tipoempresaReturnGeneral,TipoEmpresaBean tipoempresaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoEmpresa(TipoEmpresa tipoempresa,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoempresa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoEmpresa = new TipoEmpresaDetalleFormJInternalFrame(jDesktopPane,this.tipoempresaSessionBean.getConGuardarRelaciones(),this.tipoempresaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoEmpresa);
		this.jInternalFrameDetalleFormTipoEmpresa.setVisible(false);
		this.jInternalFrameDetalleFormTipoEmpresa.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoEmpresa.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoEmpresa.tipoempresaLogic=this.tipoempresaLogic;
		
		this.cargarCombosFrameForeignKeyTipoEmpresa("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoEmpresa();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoEmpresa();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoEmpresa("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoEmpresa();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoEmpresa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoEmpresa"));
		
		this.jInternalFrameDetalleFormTipoEmpresa.jButtonModificarTipoEmpresa.addActionListener(new ButtonActionListener(this,"ModificarTipoEmpresa"));

		
		this.jInternalFrameDetalleFormTipoEmpresa.jButtonModificarToolBarTipoEmpresa.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoEmpresa"));
					
		this.jInternalFrameDetalleFormTipoEmpresa.jMenuItemModificarTipoEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEmpresa.jButtonActualizarTipoEmpresa.addActionListener (new ButtonActionListener(this,"ActualizarTipoEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoEmpresa.jButtonActualizarToolBarTipoEmpresa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoEmpresa"));
						
		this.jInternalFrameDetalleFormTipoEmpresa.jMenuItemActualizarTipoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEmpresa.jButtonEliminarTipoEmpresa.addActionListener (new ButtonActionListener(this,"EliminarTipoEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoEmpresa.jButtonEliminarToolBarTipoEmpresa.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoEmpresa"));
								
		this.jInternalFrameDetalleFormTipoEmpresa.jMenuItemEliminarTipoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEmpresa.jButtonCancelarTipoEmpresa.addActionListener (new ButtonActionListener(this,"CancelarTipoEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoEmpresa.jButtonCancelarToolBarTipoEmpresa.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoEmpresa"));
					
		this.jInternalFrameDetalleFormTipoEmpresa.jMenuItemCancelarTipoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoEmpresa"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoEmpresa.jMenuItemDetalleCerrarTipoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEmpresa.jButtonGuardarCambiosToolBarTipoEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoEmpresa"));
		
		
		
		this.jInternalFrameDetalleFormTipoEmpresa.jButtonGuardarCambiosToolBarTipoEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoEmpresa"));
		
		
		
		this.jInternalFrameDetalleFormTipoEmpresa.jComboBoxTiposAccionesFormularioTipoEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoEmpresa"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEmpresa.jButtonidTipoEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEmpresa.jButtoncodigoTipoEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEmpresa.jButtonnombreTipoEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoEmpresaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoEmpresa.jTabbedPaneRelacionesTipoEmpresa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoEmpresa"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoEmpresa"));
		
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpresa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoEmpresa"));
		}
		
		this.jTableDatosTipoEmpresa.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoEmpresa"));
		
		this.jTableDatosTipoEmpresa.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoEmpresa"));
		
		this.jButtonNuevoTipoEmpresa.addActionListener(new ButtonActionListener(this,"NuevoTipoEmpresa"));
		
		this.jButtonDuplicarTipoEmpresa.addActionListener(new ButtonActionListener(this,"DuplicarTipoEmpresa"));
		
		this.jButtonCopiarTipoEmpresa.addActionListener(new ButtonActionListener(this,"CopiarTipoEmpresa"));
		
		this.jButtonVerFormTipoEmpresa.addActionListener(new ButtonActionListener(this,"VerFormTipoEmpresa"));
		
		
		this.jButtonNuevoToolBarTipoEmpresa.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoEmpresa"));
			
		this.jButtonDuplicarToolBarTipoEmpresa.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoEmpresa"));
			
		this.jMenuItemNuevoTipoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoEmpresa"));
			
		this.jMenuItemDuplicarTipoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoEmpresa"));		
		
		
		this.jButtonNuevoRelacionesTipoEmpresa.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoEmpresa"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoEmpresa.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoEmpresa"));
			
		this.jMenuItemNuevoRelacionesTipoEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoEmpresa"));		
		
		
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonModificarTipoEmpresa.addActionListener(new ButtonActionListener(this,"ModificarTipoEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonModificarToolBarTipoEmpresa.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoEmpresa"));
			
			this.jInternalFrameDetalleFormTipoEmpresa.jMenuItemModificarTipoEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonActualizarTipoEmpresa.addActionListener (new ButtonActionListener(this,"ActualizarTipoEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonActualizarToolBarTipoEmpresa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoEmpresa"));
				
			this.jInternalFrameDetalleFormTipoEmpresa.jMenuItemActualizarTipoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonEliminarTipoEmpresa.addActionListener (new ButtonActionListener(this,"EliminarTipoEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonEliminarToolBarTipoEmpresa.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoEmpresa"));
						
			this.jInternalFrameDetalleFormTipoEmpresa.jMenuItemEliminarTipoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonCancelarTipoEmpresa.addActionListener (new ButtonActionListener(this,"CancelarTipoEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonCancelarToolBarTipoEmpresa.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoEmpresa"));
			
			this.jInternalFrameDetalleFormTipoEmpresa.jMenuItemCancelarTipoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoEmpresa"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoEmpresa.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoEmpresa"));		
		
		
		this.jButtonCerrarTipoEmpresa.addActionListener (new ButtonActionListener(this,"CerrarTipoEmpresa"));
		
		
		this.jButtonCerrarToolBarTipoEmpresa.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoEmpresa"));
			
		this.jMenuItemCerrarTipoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoEmpresa"));
			
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpresa.jMenuItemDetalleCerrarTipoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonGuardarCambiosTipoEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpresa.jButtonGuardarCambiosToolBarTipoEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoEmpresa"));
		}
		
		this.jButtonCopiarToolBarTipoEmpresa.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoEmpresa"));
			
		this.jButtonVerFormToolBarTipoEmpresa.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoEmpresa"));
		
		this.jMenuItemGuardarCambiosTipoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoEmpresa"));
			
		this.jMenuItemCopiarTipoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoEmpresa"));		
		
		this.jMenuItemVerFormTipoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoEmpresa"));		
		
		
		this.jButtonGuardarCambiosTablaTipoEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoEmpresa"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoEmpresa"));
			
		this.jMenuItemGuardarCambiosTablaTipoEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoEmpresa"));		
		
		
		
		this.jButtonRecargarInformacionTipoEmpresa.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoEmpresa"));
					
		this.jButtonRecargarInformacionToolBarTipoEmpresa.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoEmpresa"));
		
		this.jMenuItemRecargarInformacionTipoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoEmpresa"));		
		
		
		
		this.jButtonAnterioresTipoEmpresa.addActionListener (new ButtonActionListener(this,"AnterioresTipoEmpresa"));
		
		
		this.jButtonAnterioresToolBarTipoEmpresa.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoEmpresa"));
		
		this.jMenuItemAnterioresTipoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoEmpresa"));		
		
		
		this.jButtonSiguientesTipoEmpresa.addActionListener (new ButtonActionListener(this,"SiguientesTipoEmpresa"));
		
		
		this.jButtonSiguientesToolBarTipoEmpresa.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoEmpresa"));
			
		this.jMenuItemSiguientesTipoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoEmpresa"));
			
		this.jMenuItemAbrirOrderByTipoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoEmpresa"));
			
		this.jMenuItemMostrarOcultarTipoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoEmpresa"));
			
		this.jMenuItemDetalleAbrirOrderByTipoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoEmpresa"));
			
		this.jMenuItemDetalleMostarOcultarTipoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoEmpresa"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoEmpresa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoEmpresa"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoEmpresa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoEmpresa"));
			
		this.jMenuItemNuevoGuardarCambiosTipoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoEmpresa"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoEmpresa.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoEmpresa"));

		this.jCheckBoxSeleccionadosTipoEmpresa.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoEmpresa"));
		
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpresa.jComboBoxTiposAccionesFormularioTipoEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoEmpresa"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoEmpresa.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoEmpresa"));
			
		this.jComboBoxTiposAccionesTipoEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoEmpresa"));
					
		this.jComboBoxTiposSeleccionarTipoEmpresa.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoEmpresa"));
			
		this.jTextFieldValorCampoGeneralTipoEmpresa.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoEmpresa"));		
		
		
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEmpresa.jButtonidTipoEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEmpresa.jButtoncodigoTipoEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEmpresa.jButtonnombreTipoEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoEmpresaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoEmpresa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoEmpresa"));
				this.jInternalFrameReporteDinamicoTipoEmpresa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoEmpresa"));
				this.jInternalFrameReporteDinamicoTipoEmpresa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoEmpresa"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoEmpresa.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoEmpresa"));				
			//this.jButtonGenerarReporteDinamicoTipoEmpresa.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoEmpresa"));
			//this.jButtonGenerarExcelReporteDinamicoTipoEmpresa.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoEmpresa"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoEmpresa!=null) {
				this.jInternalFrameImportacionTipoEmpresa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoEmpresa"));
				this.jInternalFrameImportacionTipoEmpresa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoEmpresa"));
				this.jInternalFrameImportacionTipoEmpresa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoEmpresa"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoEmpresa.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoEmpresa"));
			
			this.jButtonAbrirOrderByToolBarTipoEmpresa.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoEmpresa"));			
			
			if(this.jInternalFrameOrderByTipoEmpresa!=null) {
				this.jInternalFrameOrderByTipoEmpresa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoEmpresa"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpresa.jTabbedPaneRelacionesTipoEmpresa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoEmpresa"));
		
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
            		closingInternalFrameTipoEmpresa();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoEmpresa.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoEmpresa = (JInternalFrameBase)event.getSource();
	            	
	            TipoEmpresaBeanSwingJInternalFrame jInternalFrameParent=(TipoEmpresaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoEmpresa.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoEmpresaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoEmpresa.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoEmpresaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoEmpresa.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoEmpresa.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoEmpresa";
		inputMap = this.jButtonNuevoTipoEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoEmpresaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoEmpresa";
		inputMap = this.jButtonNuevoRelacionesTipoEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoEmpresaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoEmpresa";
		inputMap = this.jButtonModificarTipoEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoEmpresa";
		inputMap = this.jButtonActualizarTipoEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoEmpresa";
		inputMap = this.jButtonEliminarTipoEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoEmpresa";
		inputMap = this.jButtonCancelarTipoEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoEmpresa";
		inputMap = this.jButtonCerrarTipoEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoEmpresa.jButtonGuardarCambiosTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoEmpresa";
		inputMap = this.jInternalFrameDetalleFormTipoEmpresa.jButtonGuardarCambiosTipoEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoEmpresa.jButtonGuardarCambiosTipoEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoEmpresa.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoEmpresaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEmpresa.jButtonidTipoEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEmpresa.jButtoncodigoTipoEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEmpresa.jButtonnombreTipoEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoEmpresaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoEmpresaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoEmpresa.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoEmpresa(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoEmpresa tipoempresaAux:this.tipoempresaLogic.getTipoEmpresas()) {
					tipoempresaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEmpresa tipoempresaAux:tipoempresas) {
					tipoempresaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoEmpresaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoEmpresa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoEmpresa tipoempresaAux:this.tipoempresaLogic.getTipoEmpresas()) {
						tipoempresaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoEmpresa tipoempresaAux:tipoempresas) {
						tipoempresaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoEmpresa tipoempresaAux:this.tipoempresaLogic.getTipoEmpresas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoEmpresa tipoempresaAux:tipoempresas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoEmpresa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoEmpresa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoEmpresa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoEmpresa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoEmpresaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoEmpresa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoEmpresa.getSelectedRows();
			
			TipoEmpresa tipoempresaLocal=new TipoEmpresa();
			
			//this.seleccionarTodosTipoEmpresa(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoempresaLocal =(TipoEmpresa) this.tipoempresaLogic.getTipoEmpresas().toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoempresaLocal =(TipoEmpresa) this.tipoempresas.toArray()[this.jTableDatosTipoEmpresa.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoempresaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoEmpresa tipoempresaAux:this.tipoempresaLogic.getTipoEmpresas()) {
						tipoempresaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoEmpresa tipoempresaAux:tipoempresas) {
						tipoempresaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoEmpresa(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoEmpresa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoEmpresa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoEmpresa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoEmpresaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoEmpresaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoEmpresaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoEmpresa(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoEmpresa.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoEmpresa tipoempresaAux:this.tipoempresaLogic.getTipoEmpresas()) {
				
						if(sTipoSeleccionar.equals(TipoEmpresaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoempresaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoEmpresaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoempresaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEmpresa tipoempresaAux:tipoempresas) {
					
						if(sTipoSeleccionar.equals(TipoEmpresaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoempresaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoEmpresaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoempresaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoEmpresa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoEmpresaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoEmpresa(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoEmpresa=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoEmpresa.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoEmpresa.jComboBoxTiposAccionesFormularioTipoEmpresa.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoEmpresa) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoEmpresa(conSplash);
				
					this.generarReporteTipoEmpresasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEmpresa.jComboBoxTiposAccionesFormularioTipoEmpresa.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoEmpresasSeleccionados();
				//this.jComboBoxTiposAccionesTipoEmpresa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoEmpresasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoEmpresa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoEmpresasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoEmpresa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoEmpresa();
				
				this.exportarTipoEmpresasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEmpresa.jComboBoxTiposAccionesFormularioTipoEmpresa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoEmpresas();
				//this.importarTipoEmpresas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEmpresa.jComboBoxTiposAccionesFormularioTipoEmpresa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoEmpresa();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoEmpresasSeleccionados();
				//this.jComboBoxTiposAccionesTipoEmpresa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoEmpresa();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoEmpresa)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoEmpresa(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Empresa",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEmpresa.jComboBoxTiposAccionesFormularioTipoEmpresa.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoEmpresa();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoEmpresa(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoEmpresaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoEmpresa();
			
			if(this.jInternalFrameDetalleFormTipoEmpresa==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoEmpresa> tipoempresasSeleccionados=new ArrayList<TipoEmpresa>();		
			TipoEmpresa tipoempresa=new TipoEmpresa();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoEmpresa(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoEmpresa.getSelectedItem();
			
			
			
			
			tipoempresasSeleccionados=this.getTipoEmpresasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoempresasSeleccionados.size()==1) {
				for(TipoEmpresa tipoempresaAux:tipoempresasSeleccionados) {
					tipoempresa=tipoempresaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoEmpresa();
			
      		//this.finishProcessTipoEmpresa(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoEmpresaReturnGeneral() throws Exception {
		if(this.tipoempresaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoempresaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoempresaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoempresaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoempresaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoempresaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoEmpresa(false);
		}
		
		if(this.tipoempresaReturnGeneral.getConRetornoLista() || this.tipoempresaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoempresaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoempresaLogic.setTipoEmpresas(this.tipoempresaReturnGeneral.getTipoEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoempresaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoempresaLogic.setTipoEmpresa(this.tipoempresaReturnGeneral.getTipoEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoEmpresa(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoEmpresa() throws Exception {
		
		
	}
	
	public ArrayList<TipoEmpresa> getTipoEmpresasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoEmpresa> tipoempresasSeleccionados=new ArrayList<TipoEmpresa>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoEmpresa) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoEmpresa tipoempresaAux:tipoempresaLogic.getTipoEmpresas()) {
					if(tipoempresaAux.getIsSelected()) {
						tipoempresasSeleccionados.add(tipoempresaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEmpresa tipoempresaAux:this.tipoempresas) {
					if(tipoempresaAux.getIsSelected()) {
						tipoempresasSeleccionados.add(tipoempresaAux);				
					}
				}
			}
			
			if(tipoempresasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoempresasSeleccionados.addAll(this.tipoempresaLogic.getTipoEmpresas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoempresasSeleccionados.addAll(this.tipoempresas);				
					}
				}
			}
		} else {
			tipoempresasSeleccionados.add(this.tipoempresa);
		}
		
		return tipoempresasSeleccionados;
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
	
	public void generarReporteTipoEmpresasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoEmpresasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoEmpresasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoEmpresasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoEmpresasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoEmpresasSeleccionados() throws Exception {
		ArrayList<TipoEmpresa> tipoempresasSeleccionados=new ArrayList<TipoEmpresa>();		
		
		tipoempresasSeleccionados=this.getTipoEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoEmpresas("Todos",tipoempresasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoEmpresasSeleccionados() throws Exception {
		ArrayList<TipoEmpresa> tipoempresasSeleccionados=new ArrayList<TipoEmpresa>();		
		
		tipoempresasSeleccionados=this.getTipoEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoEmpresas("Todos",tipoempresasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoEmpresasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoEmpresa> tipoempresasSeleccionados=new ArrayList<TipoEmpresa>();
		
		tipoempresasSeleccionados=this.getTipoEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoEmpresas("Todos",tipoempresasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoEmpresasSeleccionados() throws Exception {
		ArrayList<TipoEmpresa> tipoempresasSeleccionados=new ArrayList<TipoEmpresa>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoEmpresa();
		
		
		tipoempresasSeleccionados=this.getTipoEmpresasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoEmpresa();
		
		
		//this.generarReporteTipoEmpresas("Todos",tipoempresasSeleccionados ,tipoempresaImplementable,tipoempresaImplementableHome);
	}
	
	public void mostrarImportacionTipoEmpresas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoEmpresa();
		
		this.abrirFrameImportacionTipoEmpresa();		
		
			
		//this.generarReporteTipoEmpresas("Todos",tipoempresasSeleccionados ,tipoempresaImplementable,tipoempresaImplementableHome);
	}
	
	public void importarTipoEmpresas() throws Exception {		
	
	}
	
	public void exportarTipoEmpresasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoEmpresasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoEmpresasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoEmpresasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoEmpresasSeleccionados() throws Exception {
		ArrayList<TipoEmpresa> tipoempresasSeleccionados=new ArrayList<TipoEmpresa>();		
		
		tipoempresasSeleccionados=this.getTipoEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoempresa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoEmpresa(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoEmpresa tipoempresaAux:tipoempresasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoEmpresa(tipoempresaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoempresaAux.setsDetalleGeneralEntityReporte(tipoempresaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoEmpresa(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoEmpresaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoEmpresaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoEmpresaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoEmpresaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoEmpresa(TipoEmpresa tipoempresa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoempresa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoempresa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoempresa.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoempresa.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoEmpresasSeleccionados() throws Exception {
		ArrayList<TipoEmpresa> tipoempresasSeleccionados=new ArrayList<TipoEmpresa>();		
		
		tipoempresasSeleccionados=this.getTipoEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoempresa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoEmpresas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoEmpresa(row);				
				iRow++;
			}				
			
			for(TipoEmpresa tipoempresaAux:tipoempresasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoEmpresa(tipoempresaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoEmpresasSeleccionados() throws Exception {
		ArrayList<TipoEmpresa> tipoempresasSeleccionados=new ArrayList<TipoEmpresa>();		
		
		tipoempresasSeleccionados=this.getTipoEmpresasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoempresa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoempresas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoempresa");
			//elementRoot.appendChild(element);
		
			for(TipoEmpresa tipoempresaAux:tipoempresasSeleccionados) {
				element = document.createElement("tipoempresa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoEmpresa(tipoempresaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoEmpresa(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoEmpresaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoEmpresaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoEmpresaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoEmpresaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoEmpresa(TipoEmpresa tipoempresa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoempresa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoempresa.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoempresa.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoEmpresa(TipoEmpresa tipoempresa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoEmpresaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoempresa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoEmpresaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoempresa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoEmpresaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoempresa.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoEmpresaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoempresa.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoEmpresasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoEmpresa> tipoempresasSeleccionados=new ArrayList<TipoEmpresa>();
		
		tipoempresasSeleccionados=this.getTipoEmpresasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoEmpresa(tipoempresasSeleccionados);
		
		this.generarReporteTipoEmpresas("Todos",tipoempresasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoEmpresa(ArrayList<TipoEmpresa> tipoempresasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoEmpresa tipoempresaAux:tipoempresasSeleccionados) {
				tipoempresaAux.setsDetalleGeneralEntityReporte(tipoempresaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoEmpresaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoempresaAux.setsDescripcionGeneralEntityReporte1(tipoempresaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoEmpresaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoempresaAux.setsDescripcionGeneralEntityReporte1(tipoempresaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoEmpresa(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoEmpresa=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoEmpresa=true;
				this.isVisibilidadCeldaGuardarCambiosTipoEmpresa=true;
			}
			
			this.isVisibilidadCeldaModificarTipoEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEmpresa=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEmpresa=false;
			this.isVisibilidadCeldaModificarTipoEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEmpresa=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEmpresa=false;
			this.isVisibilidadCeldaModificarTipoEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoEmpresa=true;
			this.isVisibilidadCeldaCancelarTipoEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEmpresa=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEmpresa=false;
			this.isVisibilidadCeldaModificarTipoEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoEmpresa=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpresa=true;
			this.isVisibilidadCeldaGuardarCambiosTipoEmpresa=true;
			this.isVisibilidadCeldaModificarTipoEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEmpresa=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoEmpresa=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEmpresa=false;
			this.isVisibilidadCeldaModificarTipoEmpresa=true;
			this.isVisibilidadCeldaActualizarTipoEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoEmpresa=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoEmpresaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpresa=true;
			this.isVisibilidadCeldaGuardarCambiosTipoEmpresa=true;
		} else {
			this.actualizarEstadoPanelsTipoEmpresa(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoEmpresa=false;
			//this.isVisibilidadCeldaVerFormTipoEmpresa=false;
			this.isVisibilidadCeldaDuplicarTipoEmpresa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoempresaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpresa=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEmpresa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoempresaSessionBean.getEsGuardarRelacionado()) {
			if(!tipoempresaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoEmpresa=false;												
			}
			
			this.jButtonCerrarTipoEmpresa.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpresa=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoempresa)) {
			this.isVisibilidadCeldaActualizarTipoEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoEmpresa=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoEmpresa() {
	}
	
	public void actualizarEstadoPanelsTipoEmpresa(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoEmpresa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoEmpresa!=null) {
				this.jScrollPanelDatosTipoEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEmpresa!=null) {
				this.jPanelPaginacionTipoEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEmpresa!=null) {
				this.jPanelParametrosReportesTipoEmpresa.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoEmpresa.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoEmpresa!=null) {
				this.jScrollPanelDatosTipoEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoEmpresa!=null) {
				this.jPanelPaginacionTipoEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoEmpresa!=null) {
				this.jPanelParametrosReportesTipoEmpresa.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoEmpresa.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoEmpresa!=null) {
				this.jScrollPanelDatosTipoEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoEmpresa!=null) {
				this.jPanelPaginacionTipoEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoEmpresa!=null) {
				this.jPanelParametrosReportesTipoEmpresa.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoEmpresa!=null) {
				this.jScrollPanelDatosTipoEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoEmpresa!=null) {
				this.jPanelPaginacionTipoEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoEmpresa!=null) {
				this.jPanelParametrosReportesTipoEmpresa.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoEmpresa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoEmpresa!=null) {
				this.jScrollPanelDatosTipoEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEmpresa!=null) {
				this.jPanelPaginacionTipoEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEmpresa!=null) {
				this.jPanelParametrosReportesTipoEmpresa.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoEmpresa.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoEmpresa!=null) {
				this.jScrollPanelDatosTipoEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEmpresa!=null) {
				this.jPanelPaginacionTipoEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEmpresa!=null) {
				this.jPanelParametrosReportesTipoEmpresa.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoEmpresa.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoEmpresa!=null) {
				this.jScrollPanelDatosTipoEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEmpresa!=null) {
				this.jPanelPaginacionTipoEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEmpresa!=null) {
				this.jPanelParametrosReportesTipoEmpresa.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoEmpresaSessionBean tipoempresaSessionBean=new TipoEmpresaSessionBean();
		
		if(this.tipoempresaSessionBean==null) {
			this.tipoempresaSessionBean=new TipoEmpresaSessionBean();
		}
		
		this.tipoempresaSessionBean.setsUltimaBusquedaTipoEmpresa(this.getsAccionBusqueda());
		this.tipoempresaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoempresaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoEmpresaSessionBean tipoempresaSessionBean=new TipoEmpresaSessionBean();
		
		if(this.tipoempresaSessionBean==null) {
			this.tipoempresaSessionBean=new TipoEmpresaSessionBean();
		}
		
		if(this.tipoempresaSessionBean.getsUltimaBusquedaTipoEmpresa()!=null&&!this.tipoempresaSessionBean.getsUltimaBusquedaTipoEmpresa().equals("")) {
			this.setsAccionBusqueda(tipoempresaSessionBean.getsUltimaBusquedaTipoEmpresa());
			this.setiNumeroPaginacion(tipoempresaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoempresaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipoempresaSessionBean.setsUltimaBusquedaTipoEmpresa("");
		this.tipoempresaSessionBean.setiNumeroPaginacion(TipoEmpresaConstantesFunciones.INUMEROPAGINACION);
		this.tipoempresaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoEmpresa(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoEmpresa() {
		this.updateBorderResaltarBusquedasFormularioTipoEmpresa();
		this.updateVisibilidadBusquedasFormularioTipoEmpresa();
		this.updateHabilitarBusquedasFormularioTipoEmpresa();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoEmpresa() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoEmpresa() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoEmpresa() {
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
	
	public void updateControlesFormularioTipoEmpresa() throws Exception {

		if(this.jInternalFrameDetalleFormTipoEmpresa==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoEmpresa();
		this.updateVisibilidadResaltarControlesFormularioTipoEmpresa();
		this.updateHabilitarResaltarControlesFormularioTipoEmpresa();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoEmpresa() throws Exception {
		if(this.jInternalFrameDetalleFormTipoEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoempresaConstantesFunciones.resaltaridTipoEmpresa!=null && this.jInternalFrameDetalleFormTipoEmpresa!=null) {this.jInternalFrameDetalleFormTipoEmpresa.jLabelidTipoEmpresa.setBorder(this.tipoempresaConstantesFunciones.resaltaridTipoEmpresa);}
		if(this.tipoempresaConstantesFunciones.resaltarcodigoTipoEmpresa!=null && this.jInternalFrameDetalleFormTipoEmpresa!=null) {this.jInternalFrameDetalleFormTipoEmpresa.jTextFieldcodigoTipoEmpresa.setBorder(this.tipoempresaConstantesFunciones.resaltarcodigoTipoEmpresa);}
		if(this.tipoempresaConstantesFunciones.resaltarnombreTipoEmpresa!=null && this.jInternalFrameDetalleFormTipoEmpresa!=null) {this.jInternalFrameDetalleFormTipoEmpresa.jTextAreanombreTipoEmpresa.setBorder(this.tipoempresaConstantesFunciones.resaltarnombreTipoEmpresa);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoEmpresa() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) {
	
		//this.jInternalFrameDetalleFormTipoEmpresa.jLabelidTipoEmpresa.setVisible(this.tipoempresaConstantesFunciones.mostraridTipoEmpresa);
		this.jInternalFrameDetalleFormTipoEmpresa.jPanelidTipoEmpresa.setVisible(this.tipoempresaConstantesFunciones.mostraridTipoEmpresa);
		//this.jInternalFrameDetalleFormTipoEmpresa.jTextFieldcodigoTipoEmpresa.setVisible(this.tipoempresaConstantesFunciones.mostrarcodigoTipoEmpresa);
		this.jInternalFrameDetalleFormTipoEmpresa.jPanelcodigoTipoEmpresa.setVisible(this.tipoempresaConstantesFunciones.mostrarcodigoTipoEmpresa);
		//this.jInternalFrameDetalleFormTipoEmpresa.jTextAreanombreTipoEmpresa.setVisible(this.tipoempresaConstantesFunciones.mostrarnombreTipoEmpresa);
		this.jInternalFrameDetalleFormTipoEmpresa.jPanelnombreTipoEmpresa.setVisible(this.tipoempresaConstantesFunciones.mostrarnombreTipoEmpresa);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoEmpresa() throws Exception {
		if(this.jInternalFrameDetalleFormTipoEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoEmpresa!=null) {
	
		this.jInternalFrameDetalleFormTipoEmpresa.jLabelidTipoEmpresa.setEnabled(this.tipoempresaConstantesFunciones.activaridTipoEmpresa);
		this.jInternalFrameDetalleFormTipoEmpresa.jTextFieldcodigoTipoEmpresa.setEnabled(this.tipoempresaConstantesFunciones.activarcodigoTipoEmpresa);
		this.jInternalFrameDetalleFormTipoEmpresa.jTextAreanombreTipoEmpresa.setEnabled(this.tipoempresaConstantesFunciones.activarnombreTipoEmpresa);
		}
	}
	
		
}