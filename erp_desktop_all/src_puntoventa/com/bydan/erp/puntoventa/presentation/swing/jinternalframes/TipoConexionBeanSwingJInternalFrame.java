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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;




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

import com.bydan.erp.puntoventa.util.TipoConexionConstantesFunciones;
import com.bydan.erp.puntoventa.util.TipoConexionParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.TipoConexionParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.TipoConexionBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.puntoventa.resources.reportes.AuxiliarReportes;


import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

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
public class TipoConexionBeanSwingJInternalFrame extends TipoConexionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoConexionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoConexion> tipoconexionValidator = new ClassValidator<TipoConexion>(TipoConexion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoConexion tipoconexion;	
	public TipoConexion tipoconexionAux;
	public TipoConexion tipoconexionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoConexion tipoconexionTotales;
	public Long idTipoConexionActual;
	public Long iIdNuevoTipoConexion=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosConexion=false;

	public Boolean getIsTienePermisosConexion() {
		return isTienePermisosConexion;
	}

	public void setIsTienePermisosConexion(Boolean isTienePermisosConexion) {
		this.isTienePermisosConexion= isTienePermisosConexion;
	}

	
	
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
	
	public Boolean isPermisoTodoTipoConexion;
	public Boolean isPermisoNuevoTipoConexion;
	public Boolean isPermisoActualizarTipoConexion;
	public Boolean isPermisoActualizarOriginalTipoConexion;
	public Boolean isPermisoEliminarTipoConexion;
	public Boolean isPermisoGuardarCambiosTipoConexion;
	public Boolean isPermisoConsultaTipoConexion;
	public Boolean isPermisoBusquedaTipoConexion;
	public Boolean isPermisoReporteTipoConexion;
	public Boolean isPermisoPaginacionMedioTipoConexion;
	public Boolean isPermisoPaginacionAltoTipoConexion;
	public Boolean isPermisoPaginacionTodoTipoConexion;
	public Boolean isPermisoCopiarTipoConexion;
	public Boolean isPermisoVerFormTipoConexion;
	public Boolean isPermisoDuplicarTipoConexion;
	public Boolean isPermisoOrdenTipoConexion;
	
	
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
	
	public TipoConexionParameterReturnGeneral tipoconexionReturnGeneral;
	public TipoConexionParameterReturnGeneral tipoconexionParameterGeneral;
	
	

	public ConexionLogic conexionLogic=null;

	public ConexionLogic getConexionLogic() {
		return conexionLogic;
	}

	public void setConexionLogic(ConexionLogic conexionLogic) {
		this.conexionLogic = conexionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoConexion=false;
	public Boolean esParaAccionDesdeFormularioTipoConexion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoConexionLogic tipoconexionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoConexion tipoconexionBean;
	public TipoConexionConstantesFunciones tipoconexionConstantesFunciones;
	//public TipoConexionParameterReturnGeneral tipoconexionReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoConexion> tipoconexions;	
	//public List<TipoConexion> tipoconexionsEliminados;
	//public List<TipoConexion> tipoconexionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoConexion=false;
	public Boolean isVisibilidadCeldaDuplicarTipoConexion=true;
	public Boolean isVisibilidadCeldaCopiarTipoConexion=true;
	public Boolean isVisibilidadCeldaVerFormTipoConexion=true;
	public Boolean isVisibilidadCeldaOrdenTipoConexion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoConexion=false;
	public Boolean isVisibilidadCeldaModificarTipoConexion=false;
	public Boolean isVisibilidadCeldaActualizarTipoConexion=false;
	public Boolean isVisibilidadCeldaEliminarTipoConexion=false;
	public Boolean isVisibilidadCeldaCancelarTipoConexion=false;
	public Boolean isVisibilidadCeldaGuardarTipoConexion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoConexion=false;	
	
	
	
	public Long getiIdNuevoTipoConexion() {
		return this.iIdNuevoTipoConexion;
	}

	public void setiIdNuevoTipoConexion(Long iIdNuevoTipoConexion) {
		this.iIdNuevoTipoConexion = iIdNuevoTipoConexion;
	}
	
	public Long getidTipoConexionActual() {
		return this.idTipoConexionActual;
	}

	public void setidTipoConexionActual(Long idTipoConexionActual) {
		this.idTipoConexionActual = idTipoConexionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoConexion gettipoconexion() {
		return this.tipoconexion;
	}

	public void settipoconexion(TipoConexion tipoconexion) {
		this.tipoconexion = tipoconexion;
	}
	
	public TipoConexion gettipoconexionAux() {
		return this.tipoconexionAux;
	}

	public void settipoconexionAux(TipoConexion tipoconexionAux) {
		this.tipoconexionAux = tipoconexionAux;
	}				
	
	public TipoConexion gettipoconexionAnterior() {
		return this.tipoconexionAnterior;
	}

	public void settipoconexionAnterior(TipoConexion tipoconexionAnterior) {
		this.tipoconexionAnterior = tipoconexionAnterior;
	}	
	
	public TipoConexion gettipoconexionTotales() {
		return this.tipoconexionTotales;
	}

	public void settipoconexionTotales(TipoConexion tipoconexionTotales) {
		this.tipoconexionTotales = tipoconexionTotales;
	}	
	
	public TipoConexion gettipoconexionBean() {
		return this.tipoconexionBean;
	}

	public void settipoconexionBean(TipoConexion tipoconexionBean) {
		this.tipoconexionBean = tipoconexionBean;
	}	
	
	public TipoConexionParameterReturnGeneral gettipoconexionReturnGeneral() {
		return this.tipoconexionReturnGeneral;
	}

	public void settipoconexionReturnGeneral(TipoConexionParameterReturnGeneral tipoconexionReturnGeneral) {
		this.tipoconexionReturnGeneral = tipoconexionReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoConexionLogic getTipoConexionLogic()	{		
		return tipoconexionLogic;
	}

	public void setTipoConexionLogic(TipoConexionLogic tipoconexionLogic) {
		this.tipoconexionLogic = tipoconexionLogic;
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
	
	public Boolean getIsEsNuevoTipoConexion() {
		return isEsNuevoTipoConexion;
	}

	public void setIsEsNuevoTipoConexion(Boolean isEsNuevoTipoConexion) {
		this.isEsNuevoTipoConexion = isEsNuevoTipoConexion;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoConexion() {
		return esParaAccionDesdeFormularioTipoConexion;
	}
	
	public void setEsParaAccionDesdeFormularioTipoConexion(Boolean esParaAccionDesdeFormularioTipoConexion) {
		this.esParaAccionDesdeFormularioTipoConexion = esParaAccionDesdeFormularioTipoConexion;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoConexion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoConexionConstantesFunciones.refrescarForeignKeysDescripcionesTipoConexion(this.tipoconexionLogic.getTipoConexions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoConexionConstantesFunciones.refrescarForeignKeysDescripcionesTipoConexion(this.tipoconexions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoconexionLogic.setTipoConexions(this.tipoconexions);
			tipoconexionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoConexionParameterReturnGeneral getTipoConexionParameterGeneral() {
		return this.tipoconexionParameterGeneral;
	}
	
	public void setTipoConexionParameterGeneral(TipoConexionParameterReturnGeneral tipoconexionParameterGeneral) {
		this.tipoconexionParameterGeneral = tipoconexionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoConexion() {
		return isPermisoTodoTipoConexion;
	}

	public void setIsPermisoTodoTipoConexion(Boolean isPermisoTodoTipoConexion) {
		this.isPermisoTodoTipoConexion = isPermisoTodoTipoConexion;
	}

	public Boolean getIsPermisoNuevoTipoConexion() {
		return isPermisoNuevoTipoConexion;
	}

	public void setIsPermisoNuevoTipoConexion(Boolean isPermisoNuevoTipoConexion) {
		this.isPermisoNuevoTipoConexion = isPermisoNuevoTipoConexion;
	}

	public Boolean getIsPermisoActualizarTipoConexion() {
		return isPermisoActualizarTipoConexion;
	}

	public void setIsPermisoActualizarTipoConexion(Boolean isPermisoActualizarTipoConexion) {
		this.isPermisoActualizarTipoConexion = isPermisoActualizarTipoConexion;
	}

	public Boolean getIsPermisoEliminarTipoConexion() {
		return isPermisoEliminarTipoConexion;
	}

	public void setIsPermisoEliminarTipoConexion(Boolean isPermisoEliminarTipoConexion) {
		this.isPermisoEliminarTipoConexion = isPermisoEliminarTipoConexion;
	}

	public Boolean getIsPermisoGuardarCambiosTipoConexion() {
		return isPermisoGuardarCambiosTipoConexion;
	}

	public void setIsPermisoGuardarCambiosTipoConexion(Boolean isPermisoGuardarCambiosTipoConexion) {
		this.isPermisoGuardarCambiosTipoConexion = isPermisoGuardarCambiosTipoConexion;
	}
	
	public Boolean getIsPermisoConsultaTipoConexion() {
		return isPermisoConsultaTipoConexion;
	}

	public void setIsPermisoConsultaTipoConexion(Boolean isPermisoConsultaTipoConexion) {
		this.isPermisoConsultaTipoConexion = isPermisoConsultaTipoConexion;
	}

	public Boolean getIsPermisoBusquedaTipoConexion() {
		return isPermisoBusquedaTipoConexion;
	}

	public void setIsPermisoBusquedaTipoConexion(Boolean isPermisoBusquedaTipoConexion) {
		this.isPermisoBusquedaTipoConexion = isPermisoBusquedaTipoConexion;
	}

	public Boolean getIsPermisoReporteTipoConexion() {
		return isPermisoReporteTipoConexion;
	}

	public void setIsPermisoReporteTipoConexion(Boolean isPermisoReporteTipoConexion) {
		this.isPermisoReporteTipoConexion = isPermisoReporteTipoConexion;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoConexion() {
		return isPermisoPaginacionMedioTipoConexion;
	}

	public void setIsPermisoPaginacionMedioTipoConexion(Boolean isPermisoPaginacionMedioTipoConexion) {
		this.isPermisoPaginacionMedioTipoConexion = isPermisoPaginacionMedioTipoConexion;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoConexion() {
		return isPermisoPaginacionTodoTipoConexion;
	}

	public void setIsPermisoPaginacionTodoTipoConexion(Boolean isPermisoPaginacionTodoTipoConexion) {
		this.isPermisoPaginacionTodoTipoConexion = isPermisoPaginacionTodoTipoConexion;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoConexion() {
		return isPermisoPaginacionAltoTipoConexion;
	}

	public void setIsPermisoPaginacionAltoTipoConexion(Boolean isPermisoPaginacionAltoTipoConexion) {
		this.isPermisoPaginacionAltoTipoConexion = isPermisoPaginacionAltoTipoConexion;
	}
	
	public Boolean getIsPermisoCopiarTipoConexion() {
		return isPermisoCopiarTipoConexion;
	}

	public void setIsPermisoCopiarTipoConexion(Boolean isPermisoCopiarTipoConexion) {
		this.isPermisoCopiarTipoConexion = isPermisoCopiarTipoConexion;
	}
	
	public Boolean getIsPermisoVerFormTipoConexion() {
		return isPermisoVerFormTipoConexion;
	}

	public void setIsPermisoVerFormTipoConexion(Boolean isPermisoVerFormTipoConexion) {
		this.isPermisoVerFormTipoConexion = isPermisoVerFormTipoConexion;
	}
	
	public Boolean getIsPermisoDuplicarTipoConexion() {
		return isPermisoDuplicarTipoConexion;
	}

	public void setIsPermisoDuplicarTipoConexion(Boolean isPermisoDuplicarTipoConexion) {
		this.isPermisoDuplicarTipoConexion = isPermisoDuplicarTipoConexion;
	}
	
	public Boolean getIsPermisoOrdenTipoConexion() {
		return isPermisoOrdenTipoConexion;
	}

	public void setIsPermisoOrdenTipoConexion(Boolean isPermisoOrdenTipoConexion) {
		this.isPermisoOrdenTipoConexion = isPermisoOrdenTipoConexion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoConexion() {
		return isVisibilidadCeldaNuevoTipoConexion;
	}

	public void setIsVisibilidadCeldaNuevoTipoConexion(Boolean isVisibilidadCeldaNuevoTipoConexion) {
		this.isVisibilidadCeldaNuevoTipoConexion = isVisibilidadCeldaNuevoTipoConexion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoConexion() {
		return isVisibilidadCeldaDuplicarTipoConexion;
	}

	public void setIsVisibilidadCeldaDuplicarTipoConexion(Boolean isVisibilidadCeldaDuplicarTipoConexion) {
		this.isVisibilidadCeldaDuplicarTipoConexion = isVisibilidadCeldaDuplicarTipoConexion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoConexion() {
		return isVisibilidadCeldaCopiarTipoConexion;
	}

	public void setIsVisibilidadCeldaCopiarTipoConexion(Boolean isVisibilidadCeldaCopiarTipoConexion) {
		this.isVisibilidadCeldaCopiarTipoConexion = isVisibilidadCeldaCopiarTipoConexion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoConexion() {
		return isVisibilidadCeldaVerFormTipoConexion;
	}

	public void setIsVisibilidadCeldaVerFormTipoConexion(Boolean isVisibilidadCeldaVerFormTipoConexion) {
		this.isVisibilidadCeldaVerFormTipoConexion = isVisibilidadCeldaVerFormTipoConexion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoConexion() {
		return isVisibilidadCeldaOrdenTipoConexion;
	}

	public void setIsVisibilidadCeldaOrdenTipoConexion(Boolean isVisibilidadCeldaOrdenTipoConexion) {
		this.isVisibilidadCeldaOrdenTipoConexion = isVisibilidadCeldaOrdenTipoConexion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoConexion() {
		return isVisibilidadCeldaNuevoRelacionesTipoConexion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoConexion(Boolean isVisibilidadCeldaNuevoRelacionesTipoConexion) {
		this.isVisibilidadCeldaNuevoRelacionesTipoConexion = isVisibilidadCeldaNuevoRelacionesTipoConexion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoConexion() {
		return isVisibilidadCeldaModificarTipoConexion;
	}

	public void setIsVisibilidadCeldaModificarTipoConexion(Boolean isVisibilidadCeldaModificarTipoConexion) {
		this.isVisibilidadCeldaModificarTipoConexion = isVisibilidadCeldaModificarTipoConexion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoConexion() {
		return isVisibilidadCeldaActualizarTipoConexion;
	}

	public void setIsVisibilidadCeldaActualizarTipoConexion(Boolean isVisibilidadCeldaActualizarTipoConexion) {
		this.isVisibilidadCeldaActualizarTipoConexion = isVisibilidadCeldaActualizarTipoConexion;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoConexion() {
		return isVisibilidadCeldaEliminarTipoConexion;
	}

	public void setIsVisibilidadCeldaEliminarTipoConexion(Boolean isVisibilidadCeldaEliminarTipoConexion) {
		this.isVisibilidadCeldaEliminarTipoConexion = isVisibilidadCeldaEliminarTipoConexion;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoConexion() {
		return isVisibilidadCeldaCancelarTipoConexion;
	}

	public void setIsVisibilidadCeldaCancelarTipoConexion(Boolean isVisibilidadCeldaCancelarTipoConexion) {
		this.isVisibilidadCeldaCancelarTipoConexion = isVisibilidadCeldaCancelarTipoConexion;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoConexion() {
		return isVisibilidadCeldaGuardarTipoConexion;
	}

	public void setIsVisibilidadCeldaGuardarTipoConexion(Boolean isVisibilidadCeldaGuardarTipoConexion) {
		this.isVisibilidadCeldaGuardarTipoConexion = isVisibilidadCeldaGuardarTipoConexion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoConexion() {
		return isVisibilidadCeldaGuardarCambiosTipoConexion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoConexion(Boolean isVisibilidadCeldaGuardarCambiosTipoConexion) {
		this.isVisibilidadCeldaGuardarCambiosTipoConexion = isVisibilidadCeldaGuardarCambiosTipoConexion;
	}
		
	public TipoConexionSessionBean gettipoconexionSessionBean() {
		return this.tipoconexionSessionBean;
	}
	
	public void settipoconexionSessionBean(TipoConexionSessionBean tipoconexionSessionBean) {
		this.tipoconexionSessionBean=tipoconexionSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoConexion(TipoConexion tipoconexion)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoConexion tipoconexion,TipoConexion tipoconexionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoConexion(tipoconexion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoconexionAux.setId(tipoconexion.getId());
		tipoconexionAux.setVersionRow(tipoconexion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoConexion();
		
			int intSelectedRow = this.jTableDatosTipoConexion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexion =(TipoConexion) this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoconexion =(TipoConexion) this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoConexion(this.tipoconexion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoConexion(this.tipoconexion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoconexionValidator.getInvalidValues(this.tipoconexion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoconexionLogic.setDatosCliente(datosCliente);
			tipoconexionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoconexionAux=new  TipoConexion();
				
				tipoconexionAux.setIsNew(true);
				tipoconexionAux.setIsChanged(true);
				
				tipoconexionAux.setTipoConexionOriginal(this.tipoconexion);
				
				tipoconexionAux.setId(this.tipoconexion.getId());	
				tipoconexionAux.setVersionRow(this.tipoconexion.getVersionRow());	
				tipoconexionAux.setnombre(this.tipoconexion.getnombre());	
				tipoconexionAux.setdescripcion(this.tipoconexion.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoconexionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoconexionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoconexionAux,tipoconexionLogic.getTipoConexions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoconexionAux,tipoconexions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoconexionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoconexionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconexionLogic.saveTipoConexions();//WithConnection
						//tipoconexionLogic.getSetVersionRowTipoConexions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoconexion,tipoconexionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoconexionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoconexionAux=new  TipoConexion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoconexionSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoconexionSessionBean.getEsGuardarRelacionado() && this.tipoconexion.getId()>=0)) {
						
					tipoconexionAux.setIsNew(false);
				}
				
				tipoconexionAux.setIsDeleted(false);
			
				tipoconexionAux.setId(this.tipoconexion.getId());	
				tipoconexionAux.setVersionRow(this.tipoconexion.getVersionRow());	
				tipoconexionAux.setnombre(this.tipoconexion.getnombre());	
				tipoconexionAux.setdescripcion(this.tipoconexion.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoconexionAux,tipoconexionLogic.getTipoConexions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoconexionAux,tipoconexions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoconexionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoconexionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconexionLogic.saveTipoConexions();//WithConnection
						//tipoconexionLogic.getSetVersionRowTipoConexions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoconexion,tipoconexionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoconexionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoconexionAux=new  TipoConexion();
				
				tipoconexionAux.setIsNew(false);
				tipoconexionAux.setIsChanged(false);
				
				tipoconexionAux.setIsDeleted(true);
				
				tipoconexionAux.setId(this.tipoconexion.getId());	
				tipoconexionAux.setVersionRow(this.tipoconexion.getVersionRow());	
				tipoconexionAux.setnombre(this.tipoconexion.getnombre());	
				tipoconexionAux.setdescripcion(this.tipoconexion.getdescripcion());	
				
				if(this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoconexionAux.getId()>=0) {	
						this.tipoconexionsEliminados.add(tipoconexionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoconexionAux,tipoconexionLogic.getTipoConexions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoconexionAux,tipoconexions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoconexionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoconexionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconexionLogic.saveTipoConexions();//WithConnection
						//tipoconexionLogic.getSetVersionRowTipoConexions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoconexionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoconexionAux.setConexions(this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame.conexionLogic.getConexions());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoconexionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoconexionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoconexionAux,tipoconexionLogic.getTipoConexions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoconexionAux,tipoconexions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexionLogic.getTipoConexions().addAll(this.tipoconexionsEliminados);
					
					tipoconexionLogic.saveTipoConexions();//WithConnection
					//tipoconexionLogic.getSetVersionRowTipoConexions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoconexionsEliminados= new ArrayList<TipoConexion>();		
			}
			
			if(this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Conexion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Conexion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoconexion=tipoconexionAux;
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
      		//this.finishProcessTipoConexion();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoConexion tipoconexionLocal) throws Exception {
		
		if(this.tipoconexionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoconexionLocal.setConexions(this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame.conexionLogic.getConexions());
			
			} else {
			
				tipoconexionLocal.setConexions(this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame.conexions);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoConexion tipoconexionLocal) throws Exception {	
		if(this.tipoconexionSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoConexionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoConexion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoconexion =(TipoConexion) this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoconexion =(TipoConexion) this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoconexionValidator.getInvalidValues(this.tipoconexion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoConexion tipoconexion,List<TipoConexion> tipoconexions) throws Exception {
		try	{		
			TipoConexionConstantesFunciones.actualizarLista(tipoconexion,tipoconexions,this.tipoconexionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoConexion tipoconexion,List<TipoConexion> tipoconexions) throws Exception {
		try	{			
			TipoConexionConstantesFunciones.actualizarSelectedLista(tipoconexion,tipoconexions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoConexion> tipoconexionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoconexionsLocal=this.tipoconexionLogic.getTipoConexions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoconexionsLocal=this.tipoconexions;
			}
			//ARCHITECTURE
		
			for(TipoConexion tipoconexionLocal:tipoconexionsLocal) {
				if(this.permiteMantenimiento(tipoconexionLocal) && tipoconexionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoConexionConstantesFunciones.getTipoConexionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoConexionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoConexion.jLabelnombreTipoConexion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoConexionConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoConexion.jLabeldescripcionTipoConexion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoConexion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoConexion.jLabelnombreTipoConexion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoConexion.jLabeldescripcionTipoConexion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Conexion")) {
			if(this.tipoconexion==null) {
				this.tipoconexion= new TipoConexion();
			}

			if(this.tipoconexionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoConexion
				this.setVariablesFormularioToObjetoActualTipoConexion(this.tipoconexion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoConexion(this.tipoconexion);

				this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame.getconexion().setTipoConexion(this.tipoconexion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoConexion--;	
		
		
		this.tipoconexionAux=new TipoConexion();
		
		this.tipoconexionAux.setId(this.iIdNuevoTipoConexion);
		this.tipoconexionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoconexionLogic.getTipoConexions().add(this.tipoconexionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoconexions.add(this.tipoconexionAux);
		}
		//ARCHITECTURE
		
		this.tipoconexion=this.tipoconexionAux;
		
		if(TipoConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoConexion(this.tipoconexion);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoConexion(this.tipoconexion);
		}
				
		//this.setDefaultControlesTipoConexion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoConexion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoConexion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoConexion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoConexion(this.tipoconexionBean,this.tipoconexion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoConexion(this.tipoconexion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoConexionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoconexionSessionBean.getConGuardarRelaciones()) {
			classes=TipoConexionConstantesFunciones.getClassesRelationshipsOfTipoConexion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoconexionReturnGeneral=tipoconexionLogic.procesarEventosTipoConexionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoconexionLogic.getTipoConexions(),this.tipoconexion,this.tipoconexionParameterGeneral,this.isEsNuevoTipoConexion,classes);//this.tipoconexionLogic.getTipoConexion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoConexion(this.tipoconexionReturnGeneral,this.tipoconexionBean,false);
		
		if(this.tipoconexionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoConexion(this.tipoconexionReturnGeneral.getTipoConexion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoConexion(this.tipoconexionReturnGeneral.getTipoConexion());
		}
		
		if(this.tipoconexionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoConexion(this.tipoconexionReturnGeneral.getTipoConexion(),classes);//this.tipoconexionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoConexion(this.tipoconexion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoConexion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoConexion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoConexion(false);
						
			if(tipoconexionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame.conexionSessionBean.getEsGuardarRelacionado() && ConexionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonConexionActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoConexionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoConexion();
			}
			
			this.actualizarVisualTableDatosTipoConexion();
			
			this.jTableDatosTipoConexion.setRowSelectionInterval(this.getIndiceNuevoTipoConexion(), this.getIndiceNuevoTipoConexion());
			
			this.seleccionarFilaTablaTipoConexionActual();
						
			this.actualizarEstadoCeldasBotonesTipoConexion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoConexion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoConexion.jTextAreanombreTipoConexion.setEnabled(isHabilitar && this.tipoconexionConstantesFunciones.activarnombreTipoConexion);
		this.jInternalFrameDetalleFormTipoConexion.jTextAreadescripcionTipoConexion.setEnabled(isHabilitar && this.tipoconexionConstantesFunciones.activardescripcionTipoConexion);	
		
	};
	
	public void setDefaultControlesTipoConexion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoConexion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoconexionSessionBean.setConGuardarRelaciones(true);			
			this.tipoconexionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoConexion.jTabbedPaneRelacionesTipoConexion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame.conexionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoconexionSessionBean.setConGuardarRelaciones(false);			
			this.tipoconexionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoConexion.jTabbedPaneRelacionesTipoConexion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame.conexionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoConexion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoConexion tipoconexionAux:this.tipoconexionLogic.getTipoConexions()) {
				if(tipoconexionAux.getId().equals(this.iIdNuevoTipoConexion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoConexion tipoconexionAux:this.tipoconexions) {
				if(tipoconexionAux.getId().equals(this.iIdNuevoTipoConexion)) {
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
	
	public int getIndiceActualTipoConexion(TipoConexion tipoconexion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoConexion tipoconexionAux:this.tipoconexionLogic.getTipoConexions()) {
				if(tipoconexionAux.getId().equals(tipoconexion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoConexion tipoconexionAux:this.tipoconexions) {
				if(tipoconexionAux.getId().equals(tipoconexion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoConexion(TipoConexion tipoconexionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoConexion tipoconexionAux:this.tipoconexionLogic.getTipoConexions()) {
				if(tipoconexionAux.getTipoConexionOriginal().getId().equals(tipoconexionOriginal.getId())) {
					existe=true;
					tipoconexionOriginal.setId(tipoconexionAux.getId());
					tipoconexionOriginal.setVersionRow(tipoconexionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoConexion tipoconexionAux:this.tipoconexions) {
				if(tipoconexionAux.getTipoConexionOriginal().getId().equals(tipoconexionOriginal.getId())) {
					existe=true;
					tipoconexionOriginal.setId(tipoconexionAux.getId());
					tipoconexionOriginal.setVersionRow(tipoconexionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoConexion(Boolean esParaCancelar) throws Exception {
		tipoconexionsAux=new ArrayList<TipoConexion>();
		tipoconexionAux=new TipoConexion();
		
		if(!this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoConexion tipoconexionAux:this.tipoconexionLogic.getTipoConexions()) {
					if(tipoconexionAux.getId()<0) {
						tipoconexionsAux.add(tipoconexionAux);
					}		
				}
				this.iIdNuevoTipoConexion=0L;
				this.tipoconexionLogic.getTipoConexions().removeAll(tipoconexionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoConexion tipoconexionAux:this.tipoconexions) {
					if(tipoconexionAux.getId()<0) {
						tipoconexionsAux.add(tipoconexionAux);
					}		
				}
				this.iIdNuevoTipoConexion=0L;
				this.tipoconexions.removeAll(tipoconexionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoConexion 
					&& this.tipoconexionLogic.getTipoConexions().size()>0
					) {
					tipoconexionAux=this.tipoconexionLogic.getTipoConexions().get(this.tipoconexionLogic.getTipoConexions().size() - 1);
				
					if(tipoconexionAux.getId()<0) {
						this.tipoconexionLogic.getTipoConexions().remove(tipoconexionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoConexion && this.tipoconexions.size()>0) {
					tipoconexionAux=this.tipoconexions.get(this.tipoconexions.size() - 1);
				
					if(tipoconexionAux.getId()<0) {
						this.tipoconexions.remove(tipoconexionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoConexion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoconexion.getId()<0) {
				this.tipoconexionLogic.getTipoConexions().remove(this.tipoconexion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoconexion.getId()<0) {
				this.tipoconexions.remove(this.tipoconexion);
			}
		}			
	}
	
	public void setEstadosInicialesTipoConexion(List<TipoConexion> tipoconexionsAux) throws Exception {
		TipoConexionConstantesFunciones.setEstadosInicialesTipoConexion(tipoconexionsAux);
	}
	
	public void setEstadosInicialesTipoConexion(TipoConexion tipoconexionAux) throws Exception {
		TipoConexionConstantesFunciones.setEstadosInicialesTipoConexion(tipoconexionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoConexionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoConexion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoConexionActual()) {
				if(!this.isEsNuevoTipoConexion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoConexion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoConexion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoConexionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Conexion ?", "MANTENIMIENTO DE Tipo Conexion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoConexion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoConexion tipoconexion) throws Exception {
		TipoConexionConstantesFunciones.seleccionarAsignar(this.tipoconexion,tipoconexion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoConexion=this.isPermisoActualizarOriginalTipoConexion;
			
			
			this.seleccionarAsignar(tipoconexion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoConexionConstantesFunciones.quitarEspaciosTipoConexion(this.tipoconexion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoConexion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoconexionSessionBean.setsFuncionBusquedaRapida(this.tipoconexionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoConexion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoConexion(esParaCancelar);				
				this.cancelarNuevoTipoConexion(esParaCancelar);								
			}
			
			this.tipoconexion=new TipoConexion();
			
			this.inicializarTipoConexion();
			
			this.actualizarEstadoCeldasBotonesTipoConexion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoConexion() throws Exception {
		try {
			TipoConexionConstantesFunciones.inicializarTipoConexion(this.tipoconexion);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoconexionLogic.getTipoConexions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoConexions(String sAccionBusqueda,List<TipoConexion> tipoconexionsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoConexion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoConexionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoConexionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoConexion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Conexions");		
		parameters.put("busquedapor", TipoConexionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Conexion.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoConexionLogic tipoconexionLogicAuxiliar=new TipoConexionLogic();
					tipoconexionLogicAuxiliar.setDatosCliente(tipoconexionLogic.getDatosCliente());				
					tipoconexionLogicAuxiliar.setTipoConexions(tipoconexionsParaReportes);
					
					tipoconexionLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoConexionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoconexionsParaReportes=tipoconexionLogicAuxiliar.getTipoConexions();
					
					//tipoconexionLogic.getNewConnexionToDeep();
					
					//for (TipoConexion tipoconexion:tipoconexionsParaReportes) {
					//	tipoconexionLogic.deepLoad(tipoconexion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoconexionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoconexionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileConexion = AuxiliarReportes.class.getResourceAsStream("ConexionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_conexion", reportFileConexion);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoConexion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoConexionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoConexionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoConexion=new JRBeanArrayDataSource(TipoConexionJInternalFrame.TraerTipoConexionBeans(tipoconexionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoConexion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoConexionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoConexionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoConexionBean.TraerTipoConexionBeans(tipoconexionsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoConexions(sAccionBusqueda,sTipoArchivoReporte,tipoconexionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoConexions(sAccionBusqueda,sTipoArchivoReporte,tipoconexionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoConexionActionPerformed(null);
					//this.generarExcelReporteTipoConexions(sAccionBusqueda,sTipoArchivoReporte,tipoconexionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoConexions(sAccionBusqueda,sTipoArchivoReporte,tipoconexionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoConexions(sAccionBusqueda,sTipoArchivoReporte,tipoconexionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoConexions(sAccionBusqueda,sTipoArchivoReporte,tipoconexionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoConexions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoConexion> tipoconexionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconexion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoConexions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoConexion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoConexion tipoconexion : tipoconexionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoConexionConstantesFunciones.generarExcelReporteDataTipoConexion("NORMAL",row,workbook,tipoconexion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Conexion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoConexion(String sTipo,Row row,Workbook workbook) {
		
		TipoConexionConstantesFunciones.generarExcelReporteHeaderTipoConexion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoConexions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoConexion> tipoconexionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconexion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoConexions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoConexion tipoconexion : tipoconexionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoConexionConstantesFunciones.getTipoConexionDescripcion(tipoconexion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoConexionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoConexionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoconexion.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoConexionConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoConexionConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoconexion.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Conexion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoConexions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoConexion> tipoconexionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoConexion> tipoconexionsRespaldo=null;
		
		classes=TipoConexionConstantesFunciones.getClassesRelationshipsOfTipoConexion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoconexionLogic.setDatosCliente(this.datosCliente);
		this.tipoconexionLogic.setDatosDeep(this.datosDeep);
		this.tipoconexionLogic.setIsConDeep(true);
		
		tipoconexionsRespaldo=this.tipoconexionLogic.getTipoConexions();
		
		this.tipoconexionLogic.setTipoConexions(tipoconexionsParaReportes);	
		this.tipoconexionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoconexionsParaReportes=this.tipoconexionLogic.getTipoConexions();
		this.tipoconexionLogic.setTipoConexions(tipoconexionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconexion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoConexions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoConexion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoConexion tipoconexion : tipoconexionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoConexion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoConexionConstantesFunciones.generarExcelReporteDataTipoConexion("NORMAL",row,workbook,tipoconexion,cellStyleDataAux);
		
			
			


				//Conexion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ConexionConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoconexion.getConexions()!=null && tipoconexion.getConexions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ConexionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ConexionConstantesFunciones.generarExcelReporteHeaderConexion("RELACIONADO",row,workbook);
				}

				if(tipoconexion.getConexions()!=null) {
					i2=0;
					for(Conexion conexion : tipoconexion.getConexions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ConexionConstantesFunciones.generarExcelReporteDataConexion("RELACIONADO",row,workbook,conexion,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoConexionConstantesFunciones.getTipoConexionDescripcion(tipoconexion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Conexion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoConexion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoConexion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoConexion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoConexion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoConexion() throws Exception {		
		this.startProcessTipoConexion(true);
	}
	
	public void startProcessTipoConexion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoConexion, this.jScrollPanelDatosTipoConexion,this.jPanelPaginacionTipoConexion, this.jScrollPanelDatosEdicionTipoConexion, this.jPanelAccionesTipoConexion,this.jPanelAccionesFormularioTipoConexion,this.jmenuBarTipoConexion,this.jmenuBarDetalleTipoConexion,this.jTtoolBarTipoConexion,this.jTtoolBarDetalleTipoConexion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoConexion=null; 
		
		final JPanel jPanelParametrosReportesTipoConexion=this.jPanelParametrosReportesTipoConexion;
		//final JScrollPane jScrollPanelDatosTipoConexion=this.jScrollPanelDatosTipoConexion;
		final JTable jTableDatosTipoConexion=this.jTableDatosTipoConexion;		
		final JPanel jPanelPaginacionTipoConexion=this.jPanelPaginacionTipoConexion;
		//final JScrollPane jScrollPanelDatosEdicionTipoConexion=this.jScrollPanelDatosEdicionTipoConexion;
		final JPanel jPanelAccionesTipoConexion=this.jPanelAccionesTipoConexion;
		
		JPanel jPanelCamposAuxiliarTipoConexion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoConexion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoConexion!=null) {
			jPanelCamposAuxiliarTipoConexion=this.jInternalFrameDetalleFormTipoConexion.jPanelCamposTipoConexion;
			jPanelAccionesFormularioAuxiliarTipoConexion=this.jInternalFrameDetalleFormTipoConexion.jPanelAccionesFormularioTipoConexion;
		}
		
		final JPanel jPanelCamposTipoConexion=jPanelCamposAuxiliarTipoConexion;
		final JPanel jPanelAccionesFormularioTipoConexion=jPanelAccionesFormularioAuxiliarTipoConexion;
		
		
		final JMenuBar jmenuBarTipoConexion=this.jmenuBarTipoConexion;
		final JToolBar jTtoolBarTipoConexion=this.jTtoolBarTipoConexion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoConexion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoConexion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoConexion!=null) {
			jmenuBarDetalleAuxiliarTipoConexion=this.jInternalFrameDetalleFormTipoConexion.jmenuBarDetalleTipoConexion;
			jTtoolBarDetalleAuxiliarTipoConexion=this.jInternalFrameDetalleFormTipoConexion.jTtoolBarDetalleTipoConexion;
		}
		
		final JMenuBar jmenuBarDetalleTipoConexion=jmenuBarDetalleAuxiliarTipoConexion;
		final JToolBar jTtoolBarDetalleTipoConexion=jTtoolBarDetalleAuxiliarTipoConexion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoConexion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoConexion;
			processRunnable.jTableDatos=jTableDatosTipoConexion;
			processRunnable.jPanelCampos=jPanelCamposTipoConexion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoConexion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoConexion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoConexion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoConexion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoConexion;
			processRunnable.jTtoolBar=jTtoolBarTipoConexion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoConexion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoConexion ,jPanelParametrosReportesTipoConexion,jTableDatosTipoConexion, /*jScrollPanelDatosTipoConexion,*/jPanelCamposTipoConexion,jPanelPaginacionTipoConexion, /*jScrollPanelDatosEdicionTipoConexion,*/ jPanelAccionesTipoConexion,jPanelAccionesFormularioTipoConexion,jmenuBarTipoConexion,jmenuBarDetalleTipoConexion,jTtoolBarTipoConexion,jTtoolBarDetalleTipoConexion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoConexion, jScrollPanelDatosTipoConexion,jPanelPaginacionTipoConexion, jScrollPanelDatosEdicionTipoConexion, jPanelAccionesTipoConexion,jPanelAccionesFormularioTipoConexion,jmenuBarTipoConexion,jmenuBarDetalleTipoConexion,jTtoolBarTipoConexion,jTtoolBarDetalleTipoConexion);
						
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
	
	public void finishProcessTipoConexion() {// throws Exception 
		this.finishProcessTipoConexion(true);
	}
	
	public void finishProcessTipoConexion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoConexion, this.jScrollPanelDatosTipoConexion,this.jPanelPaginacionTipoConexion, this.jScrollPanelDatosEdicionTipoConexion, this.jPanelAccionesTipoConexion,this.jPanelAccionesFormularioTipoConexion,this.jmenuBarTipoConexion,this.jmenuBarDetalleTipoConexion,this.jTtoolBarTipoConexion,this.jTtoolBarDetalleTipoConexion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoConexion=null; 
		
		final JPanel jPanelParametrosReportesTipoConexion=this.jPanelParametrosReportesTipoConexion;
		//final JScrollPane jScrollPanelDatosTipoConexion=this.jScrollPanelDatosTipoConexion;
		final JTable jTableDatosTipoConexion=this.jTableDatosTipoConexion;		
		final JPanel jPanelPaginacionTipoConexion=this.jPanelPaginacionTipoConexion;
		//final JScrollPane jScrollPanelDatosEdicionTipoConexion=this.jScrollPanelDatosEdicionTipoConexion;
		final JPanel jPanelAccionesTipoConexion=this.jPanelAccionesTipoConexion;
		
		JPanel jPanelCamposAuxiliarTipoConexion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoConexion=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoConexion!=null) {
			jPanelCamposAuxiliarTipoConexion=this.jInternalFrameDetalleFormTipoConexion.jPanelCamposTipoConexion;
			jPanelAccionesFormularioAuxiliarTipoConexion=this.jInternalFrameDetalleFormTipoConexion.jPanelAccionesFormularioTipoConexion;
		}
		
		final JPanel jPanelCamposTipoConexion=jPanelCamposAuxiliarTipoConexion;
		final JPanel jPanelAccionesFormularioTipoConexion=jPanelAccionesFormularioAuxiliarTipoConexion;
		
		
		final JMenuBar jmenuBarTipoConexion=this.jmenuBarTipoConexion;		
		final JToolBar jTtoolBarTipoConexion=this.jTtoolBarTipoConexion;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoConexion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoConexion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoConexion!=null) {
			jmenuBarDetalleAuxiliarTipoConexion=this.jInternalFrameDetalleFormTipoConexion.jmenuBarDetalleTipoConexion;
			jTtoolBarDetalleAuxiliarTipoConexion=this.jInternalFrameDetalleFormTipoConexion.jTtoolBarDetalleTipoConexion;		
		}
		
		final JMenuBar jmenuBarDetalleTipoConexion=jmenuBarDetalleAuxiliarTipoConexion;
		final JToolBar jTtoolBarDetalleTipoConexion=jTtoolBarDetalleAuxiliarTipoConexion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoConexion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoConexion;
			processRunnable.jTableDatos=jTableDatosTipoConexion;
			processRunnable.jPanelCampos=jPanelCamposTipoConexion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoConexion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoConexion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoConexion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoConexion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoConexion;
			processRunnable.jTtoolBar=jTtoolBarTipoConexion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoConexion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoConexion ,jPanelParametrosReportesTipoConexion, jTableDatosTipoConexion,/*jScrollPanelDatosTipoConexion,*/jPanelCamposTipoConexion,jPanelPaginacionTipoConexion, /*jScrollPanelDatosEdicionTipoConexion,*/ jPanelAccionesTipoConexion,jPanelAccionesFormularioTipoConexion,jmenuBarTipoConexion,jmenuBarDetalleTipoConexion,jTtoolBarTipoConexion,jTtoolBarDetalleTipoConexion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoConexion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoConexion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoConexion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoConexion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoConexion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoConexion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoConexion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoConexion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoConexion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoconexionConstantesFunciones.getsFinalQueryTipoConexion();
		String  finalQueryPaginacionTodos=this.tipoconexionConstantesFunciones.getsFinalQueryTipoConexion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoConexionConstantesFunciones.getArrayColumnasGlobalesNoTipoConexion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoConexionConstantesFunciones.getArrayColumnasGlobalesTipoConexion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoConexionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoconexionsEliminados= new ArrayList<TipoConexion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoConexion();
		
				///*TipoConexionSessionBean*/this.tipoconexionSessionBean=new TipoConexionSessionBean();
			
			if(this.tipoconexionSessionBean==null) {
				this.tipoconexionSessionBean=new TipoConexionSessionBean();
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
					this.iNumeroPaginacion=TipoConexionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoConexionConstantesFunciones.getClassesForeignKeysOfTipoConexion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoconexion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoconexionsAux= new ArrayList<TipoConexion>();
			
				
			tipoconexionLogic.setDatosCliente(this.datosCliente);
			tipoconexionLogic.setDatosDeep(this.datosDeep);
			tipoconexionLogic.setIsConDeep(true);
			
			
			tipoconexionLogic.getTipoConexionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoconexionLogic.getTodosTipoConexions(finalQueryGlobal,pagination);
					
					//tipoconexionLogic.getTodosTipoConexionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoconexionLogic.getTipoConexions()==null|| tipoconexionLogic.getTipoConexions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoconexionsAux= new ArrayList<TipoConexion>();
							tipoconexionsAux.addAll(tipoconexionLogic.getTipoConexions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconexionsAux= new ArrayList<TipoConexion>();
							tipoconexionsAux.addAll(tipoconexions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoconexionLogic.getTodosTipoConexions(finalQueryGlobal+"",this.pagination);												
							
							//tipoconexionLogic.getTodosTipoConexionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoConexions("Todos",tipoconexionLogic.getTipoConexions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoconexionLogic.setTipoConexions(new ArrayList<TipoConexion>());					
							tipoconexionLogic.getTipoConexions().addAll(tipoconexionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconexions=new ArrayList<TipoConexion>();
							tipoconexions.addAll(tipoconexionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoConexion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoConexion=this.idActual;
				
				} else if(this.idTipoConexionActual!=null && this.idTipoConexionActual!=0L) {
					idTipoConexion=idTipoConexionActual;
				}
				
					
				this.sDetalleReporte=TipoConexionConstantesFunciones.getDetalleIndicePorId(idTipoConexion);
				
				this.tipoconexions=new ArrayList<TipoConexion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoconexionLogic.getEntity(idTipoConexion);
					
					//tipoconexionLogic.getEntityWithConnection(idTipoConexion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoconexionLogic.setTipoConexions(new ArrayList<TipoConexion>());
					tipoconexionLogic.getTipoConexions().add(tipoconexionLogic.getTipoConexion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoconexions=new ArrayList<TipoConexion>();
					this.tipoconexions.add(tipoconexion);
				}
				
				if(tipoconexionLogic.getTipoConexion()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoConexion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoConexion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoconexionLogic.getTipoConexions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoconexions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoconexionLogic.getTipoConexions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoconexions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoConexion tipoconexion) {
		Boolean permite=true;
		
		if(this.tipoconexion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoConexionConstantesFunciones.getOrderByListaTipoConexion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoConexionConstantesFunciones.getOrderByListaTipoConexion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoConexion tipoconexion:tipoconexionLogic.getTipoConexions()) {
				if(tipoconexion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoconexionTotales=tipoconexion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoConexion tipoconexion:this.tipoconexions) {
				if(tipoconexion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoconexionTotales=tipoconexion;
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
			this.tipoconexionAux=new TipoConexion();
			this.tipoconexionAux.setsType(Constantes2.S_TOTALES);
			this.tipoconexionAux.setIsNew(false);
			this.tipoconexionAux.setIsChanged(false);
			this.tipoconexionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoConexionConstantesFunciones.TotalizarValoresFilaTipoConexion(this.tipoconexionLogic.getTipoConexions(),this.tipoconexionAux);
				
				this.tipoconexionLogic.getTipoConexions().add(this.tipoconexionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoConexionConstantesFunciones.TotalizarValoresFilaTipoConexion(this.tipoconexions,this.tipoconexionAux);
				
				this.tipoconexions.add(this.tipoconexionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoconexionTotales=new TipoConexion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoconexionLogic.getTipoConexions().remove(tipoconexionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoconexions.remove(tipoconexionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoconexionTotales=new TipoConexion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoConexion tipoconexion:tipoconexionLogic.getTipoConexions()) {
				if(tipoconexion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoconexionTotales=tipoconexion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoConexionConstantesFunciones.TotalizarValoresFilaTipoConexion(this.tipoconexionLogic.getTipoConexions(),tipoconexionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoConexion tipoconexion:this.tipoconexions) {
				if(tipoconexion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoconexionTotales=tipoconexion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoConexionConstantesFunciones.TotalizarValoresFilaTipoConexion(this.tipoconexions,tipoconexionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoConexion() {
		this.isPermisoTodoTipoConexion=false;
		this.isPermisoNuevoTipoConexion=false;
		this.isPermisoActualizarTipoConexion=false;
		this.isPermisoActualizarOriginalTipoConexion=false;
		this.isPermisoEliminarTipoConexion=false;
		this.isPermisoGuardarCambiosTipoConexion=false;
		this.isPermisoConsultaTipoConexion=false;
		this.isPermisoBusquedaTipoConexion=false;
		this.isPermisoReporteTipoConexion=false;		
		this.isPermisoOrdenTipoConexion=false;		
		this.isPermisoPaginacionMedioTipoConexion=false;		
		this.isPermisoPaginacionAltoTipoConexion=false;
		this.isPermisoPaginacionTodoTipoConexion=false;
		this.isPermisoCopiarTipoConexion=false;		
		this.isPermisoVerFormTipoConexion=false;		
		this.isPermisoDuplicarTipoConexion=false;		
		this.isPermisoOrdenTipoConexion=false;		
	}
	
	public void setPermisosUsuarioTipoConexion(Boolean isPermiso) {
		this.isPermisoTodoTipoConexion=isPermiso;
		this.isPermisoNuevoTipoConexion=isPermiso;
		this.isPermisoActualizarTipoConexion=isPermiso;
		this.isPermisoActualizarOriginalTipoConexion=isPermiso;
		this.isPermisoEliminarTipoConexion=isPermiso;
		this.isPermisoGuardarCambiosTipoConexion=isPermiso;
		this.isPermisoConsultaTipoConexion=isPermiso;
		this.isPermisoBusquedaTipoConexion=isPermiso;
		this.isPermisoReporteTipoConexion=isPermiso;
		this.isPermisoOrdenTipoConexion=isPermiso;		
		this.isPermisoPaginacionMedioTipoConexion=isPermiso;		
		this.isPermisoPaginacionAltoTipoConexion=isPermiso;		
		this.isPermisoPaginacionTodoTipoConexion=isPermiso;		
		this.isPermisoCopiarTipoConexion=isPermiso;		
		this.isPermisoVerFormTipoConexion=isPermiso;		
		this.isPermisoDuplicarTipoConexion=isPermiso;
		this.isPermisoOrdenTipoConexion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoConexion(Boolean isPermiso) {
		//this.isPermisoTodoTipoConexion=isPermiso;
		this.isPermisoNuevoTipoConexion=isPermiso;
		this.isPermisoActualizarTipoConexion=isPermiso;
		this.isPermisoActualizarOriginalTipoConexion=isPermiso;
		this.isPermisoEliminarTipoConexion=isPermiso;
		this.isPermisoGuardarCambiosTipoConexion=isPermiso;
		//this.isPermisoConsultaTipoConexion=isPermiso;
		//this.isPermisoBusquedaTipoConexion=isPermiso;
		//this.isPermisoReporteTipoConexion=isPermiso;
		//this.isPermisoOrdenTipoConexion=isPermiso;		
		//this.isPermisoPaginacionMedioTipoConexion=isPermiso;		
		//this.isPermisoPaginacionAltoTipoConexion=isPermiso;		
		//this.isPermisoPaginacionTodoTipoConexion=isPermiso;		
		//this.isPermisoCopiarTipoConexion=isPermiso;		
		//this.isPermisoDuplicarTipoConexion=isPermiso;
		//this.isPermisoOrdenTipoConexion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoConexionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ConexionConstantesFunciones.SNOMBREOPCION);
		
		if(TipoConexionJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosConexion=false;
		this.isTienePermisosConexion=this.verificarGetPermisosUsuarioOpcionTipoConexionClaseRelacionada(this.opcionsRelacionadas,ConexionConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoConexion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoConexionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosConexion=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoConexionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoConexionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoConexionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosConexion && this.jInternalFrameDetalleFormTipoConexion!=null && this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoConexion.jTabbedPaneRelacionesTipoConexion.remove(this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoConexion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoConexionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoConexionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoConexion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoConexion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoConexion=this.isPermisoActualizarTipoConexion;
			this.isPermisoEliminarTipoConexion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoConexion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoConexion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoConexion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoConexion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoConexion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoConexion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoConexion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoConexion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoConexion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoConexion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoConexion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoConexion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoConexion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoConexion.setToolTipText(this.jTableDatosTipoConexion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoConexion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoConexion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoConexionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoConexionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoConexion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosConexion && this.tipoconexionConstantesFunciones.mostrarConexionTipoConexion && !TipoConexionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Conexion");
			reporte.setsDescripcion("Conexion");
			this.tiposRelaciones.add(reporte);
		}
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	public void inicializarCombosForeignKeyTipoConexionListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoConexionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoConexionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoConexionListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoConexionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoConexion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoConexion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoConexion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoConexion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoConexion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoConexion(TipoConexion tipoconexion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoConexion(TipoConexion tipoconexion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoConexion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoConexion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoConexion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoConexion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoConexion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoConexion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoConexion(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoConexion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoConexionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoConexionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoConexionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoconexionSessionBean=new TipoConexionSessionBean(); 
		this.tipoconexionConstantesFunciones=new TipoConexionConstantesFunciones(); 
		this.tipoconexionBean=new TipoConexion();//(this.tipoconexionConstantesFunciones); 		
		this.tipoconexionReturnGeneral=new TipoConexionParameterReturnGeneral(); 
		
		this.tipoconexionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoconexionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoConexionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoConexionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoConexionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoConexion(true);
			
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
			
			this.tipoconexionConstantesFunciones=new TipoConexionConstantesFunciones(); 
			this.tipoconexionBean=new TipoConexion();//this.tipoconexionConstantesFunciones); 			
			this.tipoconexionReturnGeneral=new TipoConexionParameterReturnGeneral(); 
		
			TipoConexionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Conexion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoconexion=new TipoConexion();
			this.tipoconexions = new ArrayList<TipoConexion>();
			this.tipoconexionsAux = new ArrayList<TipoConexion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic=new TipoConexionLogic();
				this.tipoconexionLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoconexionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoconexionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoConexion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoConexion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoConexion);	
					}
					
					if(this.jInternalFrameImportacionTipoConexion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoConexion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoConexion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoConexion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoConexion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoConexion);
				this.jInternalFrameDetalleFormTipoConexion.setVisible(false);
				this.jInternalFrameDetalleFormTipoConexion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoConexion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoConexion);
					this.jInternalFrameReporteDinamicoTipoConexion.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoConexion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoConexion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoConexion);
					this.jInternalFrameImportacionTipoConexion.setVisible(false);
					this.jInternalFrameImportacionTipoConexion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoConexion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoConexion);
					this.jInternalFrameOrderByTipoConexion.setVisible(false);
					this.jInternalFrameOrderByTipoConexion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoConexionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoConexionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoconexionReturnGeneral=new TipoConexionParameterReturnGeneral();
			
			this.tipoconexionParameterGeneral=new TipoConexionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoconexionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoConexionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ConexionConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoConexionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoconexionSessionBean.getEsGuardarRelacionado(),this.tipoconexionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoConexionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoconexionSessionBean.getEsGuardarRelacionado(),this.tipoconexionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoConexion=false;
			this.isVisibilidadCeldaDuplicarTipoConexion=true;
			this.isVisibilidadCeldaCopiarTipoConexion=true;
			this.isVisibilidadCeldaVerFormTipoConexion=true;
			this.isVisibilidadCeldaOrdenTipoConexion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoConexion=false;
			this.isVisibilidadCeldaModificarTipoConexion=false;
			this.isVisibilidadCeldaActualizarTipoConexion=false;
			this.isVisibilidadCeldaEliminarTipoConexion=false;
			this.isVisibilidadCeldaCancelarTipoConexion=false;
			this.isVisibilidadCeldaGuardarTipoConexion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConexion=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoConexion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoConexion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoConexion(false);
			
			this.setPermisosUsuarioTipoConexion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoconexionSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoconexionSessionBean.getEsGuardarRelacionado() && this.tipoconexionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoConexionClasesRelacionadas();
			}
			
			if(this.tipoconexionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoConexionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoConexionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoConexion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoConexion();
			}
			
			if(!this.isPermisoBusquedaTipoConexion) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoconexionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoConexion,this.isPermisoPaginacionMedioTipoConexion,this.isPermisoPaginacionTodoTipoConexion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoConexionConstantesFunciones.getTiposSeleccionarTipoConexion());
				
				this.tiposColumnasSelect=TipoConexionConstantesFunciones.getTiposSeleccionarTipoConexion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoConexion();				
				//this.tiposRelacionesSelect=TipoConexionConstantesFunciones.getTiposRelacionesTipoConexion(true);
				
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
			//if(!this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoConexion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoConexion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoConexion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoConexion() ;
			
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
			
			
			this.conexionLogic=new ConexionLogic(); 
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
				tipoconexionImplementable= (TipoConexionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoConexionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoconexionImplementableHome= (TipoConexionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoConexionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoconexions= new ArrayList<TipoConexion>();
			this.tipoconexionsEliminados= new ArrayList<TipoConexion>();
						
			this.isEsNuevoTipoConexion=false;
			this.esParaAccionDesdeFormularioTipoConexion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoConexion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoConexion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoConexionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoConexion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoConexion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoConexion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoConexion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoConexion();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoConexion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoConexion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoConexion() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ConexionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ConexionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoConexion")) {
				iIndex=this.jInternalFrameDetalleFormTipoConexion.jTabbedPaneRelacionesTipoConexion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoConexion.jTabbedPaneRelacionesTipoConexion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoConexion.getSelectedRow();	
				
				

				if(sTitle.equals("Conexiones")) {
					if(!ConexionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoConexion();

						this.cargarParteTabPanelRelacionadaConexion(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoConexion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaConexion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoConexion.cargarSessionConBeanSwingJInternalFrameConexion(false,true,iIndex);
		this.jButtonConexionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaConexion();

		//this.jTabbedPaneRelacionesTipoConexion.updateUI();
		//this.jTabbedPaneRelacionesTipoConexion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoConexion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Conexion")) {
				int row=this.jTableDatosTipoConexion.getSelectedRow();
				jButtonConexionActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Conexion")) {

					if(this.isTienePermisosConexion && this.tipoconexionConstantesFunciones.mostrarConexionTipoConexion && !TipoConexionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Conexiones"+"("+ConexionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Conexiones");

						if(tipoconexionConstantesFunciones.resaltarConexionTipoConexion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoconexionConstantesFunciones.resaltarConexionTipoConexion);
						}

						jmenuItem.setEnabled(this.tipoconexionConstantesFunciones.activarConexionTipoConexion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Conexion"));

						

						this.jInternalFrameDetalleFormTipoConexion.jmenuDetalleTipoConexion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoConexion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoConexion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoConexion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoConexionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoConexion();
		
		this.cargarCombosFrameForeignKeyTipoConexion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoConexion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoConexion();
		}
	}
	
	
	
	public void jButtonNuevoTipoConexionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoconexionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoConexion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
			
			
			if(jTableDatosTipoConexion.getRowCount()>=1) {
				jTableDatosTipoConexion.removeRowSelectionInterval(0, jTableDatosTipoConexion.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoConexion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoConexion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoConexion(true);			
			//this.tipoconexion=new TipoConexion();
			//this.tipoconexion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoConexion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoConexion() ;
			
			if(TipoConexionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoConexion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoconexion);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoconexion);				
			
			TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
			
			if(this.tipoconexionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoConexion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoConexionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoConexion> tipoconexionsSeleccionados=new ArrayList<TipoConexion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoConexion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoConexion.getSelectedRows().length;			
			}
			
			tipoconexionsSeleccionados=this.getTipoConexionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoConexion--;			
				//TipoConexion tipoconexionAux= new TipoConexion();			
				//tipoconexionAux.setId(this.iIdNuevoTipoConexion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoConexion tipoconexionOrigen=new TipoConexion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoConexion tipoconexionOrigen : tipoconexionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoConexion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoconexionOrigen =(TipoConexion) this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconexionOrigen =(TipoConexion) this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoConexion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoconexion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoConexion(tipoconexionOrigen,this.tipoconexion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConexion(this.tipoconexion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoconexionLogic.getTipoConexions().add(this.tipoconexionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoconexions.add(this.tipoconexionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoConexion(false);
				
				this.jTableDatosTipoConexion.setRowSelectionInterval(this.getIndiceNuevoTipoConexion(), this.getIndiceNuevoTipoConexion());
				
				int iLastRow =  this.jTableDatosTipoConexion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoConexion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoConexion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoConexion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoConexion> tipoconexionsSeleccionados=new ArrayList<TipoConexion>();									
		
			TipoConexion tipoconexionOrigen=new TipoConexion();
			TipoConexion tipoconexionDestino=new TipoConexion();
				
			tipoconexionsSeleccionados=this.getTipoConexionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoConexion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoconexionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoConexion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconexionOrigen =(TipoConexion) this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoconexionOrigen =(TipoConexion) this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconexionDestino =(TipoConexion) this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoconexionDestino =(TipoConexion) this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoconexionOrigen =tipoconexionsSeleccionados.get(0);
				tipoconexionDestino =tipoconexionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoConexion(tipoconexionOrigen,tipoconexionDestino,true,false);
				
				tipoconexionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoconexionDestino,tipoconexionLogic.getTipoConexions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoconexionDestino,tipoconexions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoConexion(false);
				
				//this.jTableDatosTipoConexion.setRowSelectionInterval(this.getIndiceNuevoTipoConexion(), this.getIndiceNuevoTipoConexion());
				
				int iLastRow =  this.jTableDatosTipoConexion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoConexion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoConexion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoConexion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoConexion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoConexion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoConexion.isVisible();
			
			
			this.jPanelParametrosReportesTipoConexion.setVisible(!isVisible);
			this.jPanelPaginacionTipoConexion.setVisible(!isVisible);
			this.jPanelAccionesTipoConexion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoConexion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoConexion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoConexion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoConexion();
			
			this.abrirFrameOrderByTipoConexion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoConexion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoConexion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoConexion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoConexion.isMaximum()) {
					this.jInternalFrameDetalleFormTipoConexion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoConexion.setSize(this.jInternalFrameDetalleFormTipoConexion.iWidthFormulario,this.jInternalFrameDetalleFormTipoConexion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoConexion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoConexion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoConexion.isMaximum()) {
						this.jInternalFrameDetalleFormTipoConexion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoConexion.jContentPaneDetalleTipoConexion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoConexion.jTabbedPaneRelacionesTipoConexion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoConexion.jContentPaneDetalleTipoConexion.getWidth(),TipoConexionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoConexion.jTabbedPaneRelacionesTipoConexion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoConexion.jContentPaneDetalleTipoConexion.getWidth(),TipoConexionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoConexion.jTabbedPaneRelacionesTipoConexion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoConexion.jContentPaneDetalleTipoConexion.getWidth(),TipoConexionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ConexionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaConexion();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoConexion.setVisible(true);
	        this.jInternalFrameDetalleFormTipoConexion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoConexion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoConexion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoConexion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoConexion,false,this);
				} else {
					this.jInternalFrameOrderByTipoConexion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoConexion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoConexion);
				this.jInternalFrameOrderByTipoConexion.setVisible(false);
				this.jInternalFrameOrderByTipoConexion.setSelected(false);
				
				this.jInternalFrameOrderByTipoConexion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoConexion"));
				
				this.inicializarActualizarBindingTablaOrderByTipoConexion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoConexion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoConexion==null) {
				
				this.jInternalFrameImportacionTipoConexion=new ImportacionJInternalFrame(TipoConexionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoConexion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoConexion);
				this.jInternalFrameImportacionTipoConexion.setVisible(false);
				this.jInternalFrameImportacionTipoConexion.setSelected(false);


				this.jInternalFrameImportacionTipoConexion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoConexion"));
				this.jInternalFrameImportacionTipoConexion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoConexion"));
				this.jInternalFrameImportacionTipoConexion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoConexion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoConexion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoConexion==null) {
				this.jInternalFrameReporteDinamicoTipoConexion=new ReporteDinamicoJInternalFrame(TipoConexionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoConexion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoConexion);
				this.jInternalFrameReporteDinamicoTipoConexion.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoConexion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoConexion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoConexion"));
				this.jInternalFrameReporteDinamicoTipoConexion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoConexion"));
				this.jInternalFrameReporteDinamicoTipoConexion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoConexion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoConexion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaConexion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame.jScrollPanelDatosConexion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoConexion.jContentPaneDetalleTipoConexion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame.jScrollPanelDatosConexion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame.jScrollPanelDatosConexion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame.jScrollPanelDatosConexion.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoConexion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoConexion);
			
	       	this.jInternalFrameDetalleFormTipoConexion.setVisible(false);
	        this.jInternalFrameDetalleFormTipoConexion.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoConexion.dispose();
			//this.jInternalFrameDetalleFormTipoConexion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoConexion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoConexion.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoConexion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoConexion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoConexion.setVisible(true);
	        this.jInternalFrameImportacionTipoConexion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoConexion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoConexion.setVisible(true);
	        this.jInternalFrameOrderByTipoConexion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoConexion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoConexion.setVisible(false);
	        this.jInternalFrameOrderByTipoConexion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoConexion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoConexion.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoConexion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoConexion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoConexion.setVisible(false);
	        this.jInternalFrameImportacionTipoConexion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoConexion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoConexion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoConexion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoConexion(true);
			//this.isEsNuevoTipoConexion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexion =(TipoConexion) this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoconexion =(TipoConexion) this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoConexion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoConexion(false) ;
			
			if(tipoconexionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame.conexionSessionBean.getEsGuardarRelacionado() && ConexionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonConexionActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoConexionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoConexion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoConexion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoConexionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoConexion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexion =(TipoConexion) this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconexion =(TipoConexion) this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoConexion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoConexion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoConexion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoConexion(true);
			//this.isEsNuevoTipoConexion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexion =(TipoConexion) this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoconexion =(TipoConexion) this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoconexion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoConexion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoConexion(false) ;
			
			if(TipoConexionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoConexion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoConexion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoConexionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoConexion(false);
			
			//if(!this.isEsNuevoTipoConexion) {								
				int intSelectedRow = this.jTableDatosTipoConexion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexion =(TipoConexion) this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoconexion =(TipoConexion) this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoConexion(this.tipoconexion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoConexion(this.tipoconexion);
				
			}
			
			if(this.permiteMantenimiento(this.tipoconexion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoConexion=true;
					this.inicializarActualizarBindingTablaTipoConexion(false);
					this.isEsNuevoTipoConexion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoConexion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoConexion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoConexion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoConexion(false);
				
				this.habilitarDeshabilitarControlesTipoConexion(false);
			
												
				
				if(TipoConexionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoConexion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoConexionActionPerformed(evt,tipoconexionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoConexion(this.tipoconexion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoConexion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoconexionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoconexion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoConexion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConexion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoConexionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoConexion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexion =(TipoConexion) this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
				this.tipoconexion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoconexion =(TipoConexion) this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
				this.tipoconexion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoconexion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoConexionModel) this.jTableDatosTipoConexion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoConexion=true;
				this.inicializarActualizarBindingTablaTipoConexion(false);
				this.isEsNuevoTipoConexion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoConexion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoConexion(false);
				
				this.habilitarDeshabilitarControlesTipoConexion(false);
				
				
				
				if(TipoConexionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoConexion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoConexionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoConexion.getRowCount()>=1) {
				jTableDatosTipoConexion.removeRowSelectionInterval(0, jTableDatosTipoConexion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoConexion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoConexion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoConexion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoConexion(false) ;
			
			this.isEsNuevoTipoConexion=false;
			
			if(TipoConexionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoConexion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoConexionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoConexion(false);
				
				//SI ES MANUAL
				if(TipoConexionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoConexion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoConexionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoConexion--;			
			//TipoConexion tipoconexionAux= new TipoConexion();			
			//tipoconexionAux.setId(this.iIdNuevoTipoConexion);
			
			if(this.jInternalFrameDetalleFormTipoConexion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoConexion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoConexion(this.tipoconexion);
			
			this.tipoconexion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoconexionLogic.getTipoConexions().add(this.tipoconexionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoconexions.add(this.tipoconexionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoConexion(false);
			
			this.jTableDatosTipoConexion.setRowSelectionInterval(this.getIndiceNuevoTipoConexion(), this.getIndiceNuevoTipoConexion());
			
			int iLastRow =  this.jTableDatosTipoConexion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoConexion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoConexion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoConexion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoConexionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoConexion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoConexion(false);
			
			//SI ES MANUAL
			if(TipoConexionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoConexion();
			}
			
			//this.abrirFrameTreeTipoConexion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoConexionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo ConexionS ?", "MANTENIMIENTO DE Tipo Conexion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoConexion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoConexion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoconexionReturnGeneral=tipoconexionLogic.procesarImportacionTipoConexionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoconexionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoConexionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoConexionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoConexion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoConexion.setFileImportacion(this.jInternalFrameImportacionTipoConexion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoConexion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoConexion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoConexion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoConexion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoConexionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoConexion> tipoconexionsSeleccionados=new ArrayList<TipoConexion>();		

		tipoconexionsSeleccionados=this.getTipoConexionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoConexion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoConexion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoConexionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoConexionBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoConexions("Todos",tipoconexionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Conexion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoConexion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoConexion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoConexionConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoConexionConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoTipoConexion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoConexion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoConexion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoConexionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoConexionConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoConexion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoConexionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoConexionConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoConexion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoConexion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoConexionConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoConexionConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoConexionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoConexion> tipoconexionsSeleccionados=new ArrayList<TipoConexion>();		
		
		tipoconexionsSeleccionados=this.getTipoConexionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconexion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoConexions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoConexion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoConexion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoConexionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoConexionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoConexion tipoconexion:tipoconexionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoconexion.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoConexionConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoConexionConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(TipoConexion tipoconexion:tipoconexionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoconexion.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelTipoConexion(row);				
			//	iRow++;
			//}				
			
			//for(TipoConexion tipoconexionAux:tipoconexionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoConexion(tipoconexionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Conexion",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoconexionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoConexion(false);
			
			//SI ES MANUAL
			if(TipoConexionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoConexion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoConexionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoConexion(false);
			
			//SI ES MANUAL
			if(TipoConexionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoConexion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoConexionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoConexion(false);
			
			//SI ES MANUAL
			if(TipoConexionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoConexion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconexionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoConexion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoConexion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoConexion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoConexion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoConexion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoConexion.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoConexion.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoConexion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoConexion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoConexion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoConexion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoConexion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoConexion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoConexion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoConexion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoConexion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoConexionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoConexionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoConexion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoConexion();
		
		this.inicializarActualizarBindingBotonesManualTipoConexion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoConexion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoConexion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoConexion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoConexion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoConexion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoConexion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoConexion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoConexion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoConexion.jCheckBoxPostAccionNuevoTipoConexion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoConexion.jCheckBoxPostAccionSinCerrarTipoConexion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoConexion.jCheckBoxPostAccionSinMensajeTipoConexion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoConexion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoConexion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoConexion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoConexion!=null) {
				this.jInternalFrameDetalleFormTipoConexion.jCheckBoxPostAccionNuevoTipoConexion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoConexion.jCheckBoxPostAccionSinCerrarTipoConexion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoConexion.jCheckBoxPostAccionSinMensajeTipoConexion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoConexion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoConexion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoConexion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoConexion.jComboBoxTiposAccionesFormularioTipoConexion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoConexion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoConexion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoConexion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoConexion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoConexion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoConexion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoConexion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoConexion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoConexion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoConexion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoConexion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoConexion(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoConexionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoConexion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoConexion() throws Exception {
		try	{
			if(TipoConexionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoConexion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoConexion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoConexion.jComboBoxTiposAccionesFormularioTipoConexion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoConexion.jComboBoxTiposAccionesFormularioTipoConexion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoConexion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoConexion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoConexion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoConexion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoConexion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoConexion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoConexion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoConexion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoConexion.addItem(reporte);
			}
			
			
			if(!this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoConexion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoConexion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoConexion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoConexion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoConexion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoConexion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoConexion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoConexion.jComboBoxTiposAccionesFormularioTipoConexion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoConexion.jComboBoxTiposAccionesFormularioTipoConexion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoConexion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoConexion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoConexion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoConexion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoConexion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoConexion!=null) {
				this.jInternalFrameReporteDinamicoTipoConexion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoConexion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoConexion!=null) {
				this.jInternalFrameReporteDinamicoTipoConexion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoConexion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoConexion!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoConexion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoConexion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoConexion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoConexion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoConexion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoConexion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoConexion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoConexion(Boolean esInicializar) throws Exception {				
		if(TipoConexionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoConexion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoConexion() throws Exception {
		this.inicializarActualizarBindingTablaTipoConexion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoConexion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoConexion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoConexion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoConexion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoConexionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoConexion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoConexion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoConexionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoConexionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoConexionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoConexionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoConexion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoConexion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoConexionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoConexion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoConexion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoconexionLogic.getTipoConexions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoconexions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoConexion.setModel(new TipoConexionModel(this.tipoconexionLogic.getTipoConexions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoConexion.setModel(new TipoConexionModel(this.tipoconexions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoConexion!=null && this.jInternalFrameOrderByTipoConexion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoConexion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoConexion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoConexion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoConexionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoConexionConstantesFunciones.SCLASSWEBTITULO,tipoconexionConstantesFunciones.resaltarSeleccionarTipoConexion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoConexionConstantesFunciones.SCLASSWEBTITULO,tipoconexionConstantesFunciones.resaltarSeleccionarTipoConexion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoConexion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoConexion,TipoConexionConstantesFunciones.LABEL_ID));

		if(this.tipoconexionConstantesFunciones.mostraridTipoConexion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoConexionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoconexionConstantesFunciones.resaltaridTipoConexion,this.tipoconexionConstantesFunciones.activaridTipoConexion,this,true,"idTipoConexion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoconexionConstantesFunciones.resaltaridTipoConexion,this.tipoconexionConstantesFunciones.activaridTipoConexion,this,true,"idTipoConexion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoConexion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoConexion,TipoConexionConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoconexionConstantesFunciones.mostrarnombreTipoConexion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoConexionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoconexionConstantesFunciones.resaltarnombreTipoConexion,this.tipoconexionConstantesFunciones.activarnombreTipoConexion,this,true,"nombreTipoConexion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoconexionConstantesFunciones.resaltarnombreTipoConexion,this.tipoconexionConstantesFunciones.activarnombreTipoConexion,this,true,"nombreTipoConexion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoConexionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoConexion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoConexion,TipoConexionConstantesFunciones.LABEL_DESCRIPCION));

		if(this.tipoconexionConstantesFunciones.mostrardescripcionTipoConexion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoConexionConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoconexionConstantesFunciones.resaltardescripcionTipoConexion,this.tipoconexionConstantesFunciones.activardescripcionTipoConexion,this,true,"descripcionTipoConexion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoconexionConstantesFunciones.resaltardescripcionTipoConexion,this.tipoconexionConstantesFunciones.activardescripcionTipoConexion,this,true,"descripcionTipoConexion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoConexionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoconexionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosConexion && this.tipoconexionConstantesFunciones.mostrarConexionTipoConexion && !TipoConexionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Conexiones");
				tableColumn.setHeaderValue("Conexiones");
				tableColumn.setCellRenderer(new ConexionTableCell(tipoconexionConstantesFunciones.resaltarConexionTipoConexion,this,this.tipoconexionConstantesFunciones.activarConexionTipoConexion));
				tableColumn.setCellEditor(new ConexionTableCell(tipoconexionConstantesFunciones.resaltarConexionTipoConexion,this,this.tipoconexionConstantesFunciones.activarConexionTipoConexion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoConexion.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoconexionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoconexionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoConexion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoconexionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoconexionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoConexion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoConexion && this.isPermisoGuardarCambiosTipoConexion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoconexionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoconexionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoConexion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoconexionSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosTipoConexion.addColumn(tableColumn);
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
			
			this.jTableDatosTipoConexion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoConexion && this.isPermisoGuardarCambiosTipoConexion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoconexionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoConexion && this.isPermisoGuardarCambiosTipoConexion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoConexion.moveColumn(this.jTableDatosTipoConexion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoConexion.moveColumn(this.jTableDatosTipoConexion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoconexionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoConexion.moveColumn(this.jTableDatosTipoConexion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoConexion.moveColumn(this.jTableDatosTipoConexion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoConexion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoConexion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoConexion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoConexion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoConexion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoConexion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoConexion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoConexion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoconexionLogic.getTipoConexions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoconexions.size()-1;
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
		//this.jTableDatosTipoConexion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoConexion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoConexion();
			
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
				
				//this.isEsNuevoTipoConexion=false;
					
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
			
				if(this.tipoconexionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoConexion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoConexion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoConexion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexion =(TipoConexion) this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconexion =(TipoConexion) this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoconexion.getsType().equals("DUPLICADO")
				   || this.tipoconexion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoConexion=true;
				
				} else {
					this.isEsNuevoTipoConexion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoconexion.getId()>=0 && !this.tipoconexion.getIsNew()) {						
						this.isEsNuevoTipoConexion=false;
						
					} else {
						this.isEsNuevoTipoConexion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoConexion(esRelaciones);						
				
				this.seleccionarTipoConexion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoconexion.getId()<0) {
					this.isEsNuevoTipoConexion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoConexion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoConexion(evt,rowIndex);
				}	
				
				if(this.tipoconexionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoConexion: " + this.dDif); 
					}
				}								
				
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoConexion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoconexion)) {
					if(this.tipoconexion.getId()>0) {
						this.tipoconexion.setIsDeleted(true);
						
						this.tipoconexionsEliminados.add(this.tipoconexion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoconexionLogic.getTipoConexions().remove(this.tipoconexion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoconexions.remove(this.tipoconexion);				
					}
					
					
					((TipoConexionModel) this.jTableDatosTipoConexion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoConexion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoConexion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoConexion) {
			
			if(this.jInternalFrameDetalleFormTipoConexion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoConexion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoConexion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexion =(TipoConexion) this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconexion =(TipoConexion) this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoConexion(this.tipoconexion);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoConexion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoConexion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoConexion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoConexion(TipoConexion tipoconexion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoConexion(tipoconexion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoConexion(TipoConexion tipoconexion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoConexion(tipoconexion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoConexion(tipoconexion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoConexion(tipoconexion);
	}
	
	public void setVariablesObjetoActualToFormularioTipoConexion(TipoConexion tipoconexion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoConexion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoConexion.jTextFieldidTipoConexion.setText(tipoconexion.getId().toString());
			this.jInternalFrameDetalleFormTipoConexion.jTextAreanombreTipoConexion.setText(tipoconexion.getnombre());
			this.jInternalFrameDetalleFormTipoConexion.jTextAreadescripcionTipoConexion.setText(tipoconexion.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoConexion tipoconexionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoconexionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoConexion tipoconexionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoconexionLocal=this.tipoconexion;
			} else {
				tipoconexionLocal=this.tipoconexionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoconexionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoConexion(tipoconexionLocal,true);
					
					if(tipoconexionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoconexionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoconexionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoConexion(TipoConexion tipoconexion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoConexion(tipoconexion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoConexion(tipoconexion);
	}
	
	public void setVariablesFormularioToObjetoActualTipoConexion(TipoConexion tipoconexion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoConexion(tipoconexion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoConexion(TipoConexion tipoconexion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoConexion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoConexion.jTextFieldidTipoConexion.getText()==null || this.jInternalFrameDetalleFormTipoConexion.jTextFieldidTipoConexion.getText()=="" || this.jInternalFrameDetalleFormTipoConexion.jTextFieldidTipoConexion.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoConexion.jTextFieldidTipoConexion.setText("0");
			}

			if(conColumnasBase) {tipoconexion.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoConexion.jTextFieldidTipoConexion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoConexionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoConexion.jLabelIdTipoConexion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoconexion.setnombre(this.jInternalFrameDetalleFormTipoConexion.jTextAreanombreTipoConexion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoConexionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoConexion.jLabelnombreTipoConexion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoconexion.setdescripcion(this.jInternalFrameDetalleFormTipoConexion.jTextAreadescripcionTipoConexion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoConexionConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoConexion.jLabeldescripcionTipoConexion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoConexion(TipoConexion tipoconexionBean,TipoConexion tipoconexion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoConexion(TipoConexion tipoconexionOrigen,TipoConexion tipoconexion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoconexionOrigen.getId()!=null && !tipoconexionOrigen.getId().equals(0L))) {tipoconexion.setId(tipoconexionOrigen.getId());}}
			if(conDefault || (!conDefault && tipoconexionOrigen.getnombre()!=null && !tipoconexionOrigen.getnombre().equals(""))) {tipoconexion.setnombre(tipoconexionOrigen.getnombre());}
			if(conDefault || (!conDefault && tipoconexionOrigen.getdescripcion()!=null && !tipoconexionOrigen.getdescripcion().equals(""))) {tipoconexion.setdescripcion(tipoconexionOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoConexion(TipoConexion tipoconexion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoConexion.jTextFieldidTipoConexion.setText(tipoconexion.getId().toString());
			this.jInternalFrameDetalleFormTipoConexion.jTextAreanombreTipoConexion.setText(tipoconexion.getnombre());
			this.jInternalFrameDetalleFormTipoConexion.jTextAreadescripcionTipoConexion.setText(tipoconexion.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoConexion(TipoConexionBean tipoconexionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoConexion.jTextFieldidTipoConexion.setText(tipoconexionBean.getId().toString());
			this.jInternalFrameDetalleFormTipoConexion.jTextAreanombreTipoConexion.setText(tipoconexionBean.getnombre());
			this.jInternalFrameDetalleFormTipoConexion.jTextAreadescripcionTipoConexion.setText(tipoconexionBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoConexion(TipoConexionParameterReturnGeneral tipoconexionReturnGeneral,TipoConexionBean tipoconexionBean,Boolean conDefault) throws Exception { 
		try {
			TipoConexion tipoconexionLocal=new TipoConexion();
			
			tipoconexionLocal=tipoconexionReturnGeneral.getTipoConexion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoconexionLocal.getId()!=null && !tipoconexionLocal.getId().equals(0L))) {tipoconexionBean.setId(tipoconexionLocal.getId());}}
			if(conDefault || (!conDefault && tipoconexionLocal.getnombre()!=null && !tipoconexionLocal.getnombre().equals(""))) {tipoconexionBean.setnombre(tipoconexionLocal.getnombre());}
			if(conDefault || (!conDefault && tipoconexionLocal.getdescripcion()!=null && !tipoconexionLocal.getdescripcion().equals(""))) {tipoconexionBean.setdescripcion(tipoconexionLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoConexionGenerico(Long idTipoConexionSeleccionado,JComboBox jComboBoxTipoConexion,List<TipoConexion> tipoconexionsLocal)throws Exception {
		try {
			TipoConexion  tipoconexionTemp=null;

			for(TipoConexion tipoconexionAux:tipoconexionsLocal) {
				if(tipoconexionAux.getId()!=null && tipoconexionAux.getId().equals(idTipoConexionSeleccionado)) {
					tipoconexionTemp=tipoconexionAux;
					break;
				}
			}

			jComboBoxTipoConexion.setSelectedItem(tipoconexionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoConexionGenerico(JComboBox jComboBoxTipoConexion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoConexion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoConexion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoConexion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoConexion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Conexion")) {
			jButtonConexionActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoconexion=(TipoConexion) tipoconexionLogic.getTipoConexions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoconexion =(TipoConexion) tipoconexions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoConexion tipoconexionRow=new TipoConexion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoconexionRow=(TipoConexion) tipoconexionLogic.getTipoConexions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoconexionRow=(TipoConexion) tipoconexions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonConexionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoConexion tipoconexion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoConexion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconexion = (TipoConexion)this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoconexion = (TipoConexion)this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoconexion!=null) {
						this.tipoconexion = tipoconexion;
					} else {
						this.tipoconexion = new TipoConexion();
					}
				}

				if(this.isTienePermisosConexion && this.permiteMantenimiento(this.tipoconexion)) {
					ConexionBeanSwingJInternalFrame conexionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFramePopup=new ConexionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						conexionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFramePopup;
					} else {
						conexionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame;
					}

					List<TipoConexion> tipoconexions=new ArrayList<TipoConexion>();
					tipoconexions.add(this.tipoconexion);
					if(!esRelacionado) {
						//conexionBeanSwingJInternalFrame.conexionSessionBean.setConGuardarRelaciones(false);
						//conexionBeanSwingJInternalFrame.conexionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					conexionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoConexion.cargarConexionBeanSwingJInternalFrame(tipoconexions,this.tipoconexion,conexionBeanSwingJInternalFrame,/*conInicializar,*/conexionBeanSwingJInternalFrame.conexionSessionBean.getConGuardarRelaciones(),conexionBeanSwingJInternalFrame.conexionSessionBean.getEsGuardarRelacionado());
					conexionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						conexionBeanSwingJInternalFrame.actualizarEstadoPanelsConexion("no_relacionado");

						conexionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ConexionConstantesFunciones.ITAMANIOFILATABLA + (ConexionConstantesFunciones.ITAMANIOFILATABLA/2));

						conexionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoConexion=(TitledBorder)this.jScrollPanelDatosTipoConexion.getBorder();
						TitledBorder titledBorderConexion=(TitledBorder)conexionBeanSwingJInternalFrame.jScrollPanelDatosConexion.getBorder();

						titledBorderConexion.setTitle(titledBorderTipoConexion.getTitle() + " -> Conexion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,conexionBeanSwingJInternalFrame);
						}

						conexionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(conexionBeanSwingJInternalFrame);

						conexionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoconexionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Conexion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoConexion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoConexion.setVisible((this.isVisibilidadCeldaNuevoTipoConexion && this.isPermisoNuevoTipoConexion));			
			this.jButtonDuplicarTipoConexion.setVisible((this.isVisibilidadCeldaDuplicarTipoConexion && this.isPermisoDuplicarTipoConexion));			
			this.jButtonCopiarTipoConexion.setVisible((this.isVisibilidadCeldaCopiarTipoConexion && this.isPermisoCopiarTipoConexion));
			this.jButtonVerFormTipoConexion.setVisible((this.isVisibilidadCeldaVerFormTipoConexion && this.isPermisoVerFormTipoConexion));
			
			this.jButtonAbrirOrderByTipoConexion.setVisible((this.isVisibilidadCeldaOrdenTipoConexion && this.isPermisoOrdenTipoConexion));			
			
			this.jButtonNuevoRelacionesTipoConexion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoConexion && this.isPermisoNuevoTipoConexion));			
			this.jButtonNuevoGuardarCambiosTipoConexion.setVisible((this.isVisibilidadCeldaNuevoTipoConexion && this.isPermisoNuevoTipoConexion && this.isPermisoGuardarCambiosTipoConexion));
			
			if(this.jInternalFrameDetalleFormTipoConexion!=null) {
			this.jInternalFrameDetalleFormTipoConexion.jButtonModificarTipoConexion.setVisible((this.isVisibilidadCeldaModificarTipoConexion && this.isPermisoActualizarTipoConexion));	
			this.jInternalFrameDetalleFormTipoConexion.jButtonActualizarTipoConexion.setVisible((this.isVisibilidadCeldaActualizarTipoConexion && this.isPermisoActualizarTipoConexion));	
			this.jInternalFrameDetalleFormTipoConexion.jButtonEliminarTipoConexion.setVisible((this.isVisibilidadCeldaEliminarTipoConexion && this.isPermisoEliminarTipoConexion));
			this.jInternalFrameDetalleFormTipoConexion.jButtonCancelarTipoConexion.setVisible(this.isVisibilidadCeldaCancelarTipoConexion);							
			this.jInternalFrameDetalleFormTipoConexion.jButtonGuardarCambiosTipoConexion.setVisible((this.isVisibilidadCeldaGuardarTipoConexion && this.isPermisoGuardarCambiosTipoConexion));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoConexion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoConexion && this.isPermisoGuardarCambiosTipoConexion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoConexion.setVisible((this.isVisibilidadCeldaNuevoTipoConexion && this.isPermisoNuevoTipoConexion));						
			this.jButtonDuplicarToolBarTipoConexion.setVisible((this.isVisibilidadCeldaDuplicarTipoConexion && this.isPermisoDuplicarTipoConexion));						
			this.jButtonCopiarToolBarTipoConexion.setVisible((this.isVisibilidadCeldaCopiarTipoConexion && this.isPermisoCopiarTipoConexion));			
			this.jButtonVerFormToolBarTipoConexion.setVisible((this.isVisibilidadCeldaVerFormTipoConexion && this.isPermisoVerFormTipoConexion));			
			this.jButtonAbrirOrderByToolBarTipoConexion.setVisible((this.isVisibilidadCeldaOrdenTipoConexion && this.isPermisoOrdenTipoConexion));
			this.jButtonNuevoRelacionesToolBarTipoConexion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoConexion && this.isPermisoNuevoTipoConexion));			
			this.jButtonNuevoGuardarCambiosToolBarTipoConexion.setVisible((this.isVisibilidadCeldaNuevoTipoConexion && this.isPermisoNuevoTipoConexion && this.isPermisoGuardarCambiosTipoConexion));			
			
			if(this.jInternalFrameDetalleFormTipoConexion!=null) {
			this.jInternalFrameDetalleFormTipoConexion.jButtonModificarToolBarTipoConexion.setVisible((this.isVisibilidadCeldaModificarTipoConexion && this.isPermisoActualizarTipoConexion));	
			this.jInternalFrameDetalleFormTipoConexion.jButtonActualizarToolBarTipoConexion.setVisible((this.isVisibilidadCeldaActualizarTipoConexion  && this.isPermisoActualizarTipoConexion));	
			this.jInternalFrameDetalleFormTipoConexion.jButtonEliminarToolBarTipoConexion.setVisible((this.isVisibilidadCeldaEliminarTipoConexion && this.isPermisoEliminarTipoConexion));
			this.jInternalFrameDetalleFormTipoConexion.jButtonCancelarToolBarTipoConexion.setVisible(this.isVisibilidadCeldaCancelarTipoConexion);				
			this.jInternalFrameDetalleFormTipoConexion.jButtonGuardarCambiosToolBarTipoConexion.setVisible((this.isVisibilidadCeldaGuardarTipoConexion && this.isPermisoGuardarCambiosTipoConexion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoConexion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoConexion && this.isPermisoGuardarCambiosTipoConexion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoConexion.setVisible((this.isVisibilidadCeldaNuevoTipoConexion && this.isPermisoNuevoTipoConexion));			
			this.jMenuItemDuplicarTipoConexion.setVisible((this.isVisibilidadCeldaDuplicarTipoConexion && this.isPermisoDuplicarTipoConexion));			
			this.jMenuItemCopiarTipoConexion.setVisible((this.isVisibilidadCeldaCopiarTipoConexion && this.isPermisoCopiarTipoConexion));			
			this.jMenuItemVerFormTipoConexion.setVisible((this.isVisibilidadCeldaVerFormTipoConexion && this.isPermisoVerFormTipoConexion));			
			this.jMenuItemAbrirOrderByTipoConexion.setVisible((this.isVisibilidadCeldaOrdenTipoConexion && this.isPermisoOrdenTipoConexion));			
			//this.jMenuItemMostrarOcultarTipoConexion.setVisible((this.isVisibilidadCeldaOrdenTipoConexion && this.isPermisoOrdenTipoConexion));
			this.jMenuItemDetalleAbrirOrderByTipoConexion.setVisible((this.isVisibilidadCeldaOrdenTipoConexion && this.isPermisoOrdenTipoConexion));			
			//this.jMenuItemDetalleMostrarOcultarTipoConexion.setVisible((this.isVisibilidadCeldaOrdenTipoConexion && this.isPermisoOrdenTipoConexion));			
			this.jMenuItemNuevoRelacionesTipoConexion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoConexion && this.isPermisoNuevoTipoConexion));			
			this.jMenuItemNuevoGuardarCambiosTipoConexion.setVisible((this.isVisibilidadCeldaNuevoTipoConexion && this.isPermisoNuevoTipoConexion && this.isPermisoGuardarCambiosTipoConexion));									
			
			if(this.jInternalFrameDetalleFormTipoConexion!=null) {
			this.jInternalFrameDetalleFormTipoConexion.jMenuItemModificarTipoConexion.setVisible((this.isVisibilidadCeldaModificarTipoConexion && this.isPermisoActualizarTipoConexion));	
			this.jInternalFrameDetalleFormTipoConexion.jMenuItemActualizarTipoConexion.setVisible((this.isVisibilidadCeldaActualizarTipoConexion && this.isPermisoActualizarTipoConexion));	
			this.jInternalFrameDetalleFormTipoConexion.jMenuItemEliminarTipoConexion.setVisible((this.isVisibilidadCeldaEliminarTipoConexion && this.isPermisoEliminarTipoConexion));
			this.jInternalFrameDetalleFormTipoConexion.jMenuItemCancelarTipoConexion.setVisible(this.isVisibilidadCeldaCancelarTipoConexion);				
			}
			
			this.jMenuItemGuardarCambiosTipoConexion.setVisible((this.isVisibilidadCeldaGuardarTipoConexion && this.isPermisoGuardarCambiosTipoConexion));						
			this.jMenuItemGuardarCambiosTablaTipoConexion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoConexion && this.isPermisoGuardarCambiosTipoConexion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoConexion=this.jButtonNuevoTipoConexion.isVisible();
			this.isVisibilidadCeldaDuplicarTipoConexion=this.jButtonDuplicarTipoConexion.isVisible();
			this.isVisibilidadCeldaCopiarTipoConexion=this.jButtonCopiarTipoConexion.isVisible();
			this.isVisibilidadCeldaVerFormTipoConexion=this.jButtonVerFormTipoConexion.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoConexion=this.jButtonAbrirOrderByTipoConexion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoConexion=this.jButtonNuevoRelacionesTipoConexion.isVisible();
			this.isVisibilidadCeldaModificarTipoConexion=this.jButtonModificarTipoConexion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoConexion!=null) {
			this.isVisibilidadCeldaActualizarTipoConexion=this.jInternalFrameDetalleFormTipoConexion.jButtonActualizarTipoConexion.isVisible();
			this.isVisibilidadCeldaEliminarTipoConexion=this.jInternalFrameDetalleFormTipoConexion.jButtonEliminarTipoConexion.isVisible();
			this.isVisibilidadCeldaCancelarTipoConexion=this.jInternalFrameDetalleFormTipoConexion.jButtonCancelarTipoConexion.isVisible();
			this.isVisibilidadCeldaGuardarTipoConexion=this.jInternalFrameDetalleFormTipoConexion.jButtonGuardarCambiosTipoConexion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoConexion=this.jButtonGuardarCambiosTablaTipoConexion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoConexion=this.jButtonNuevoToolBarTipoConexion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoConexion=this.jButtonNuevoRelacionesToolBarTipoConexion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoConexion!=null) {
			this.isVisibilidadCeldaModificarTipoConexion=this.jInternalFrameDetalleFormTipoConexion.jButtonModificarToolBarTipoConexion.isVisible();
			this.isVisibilidadCeldaActualizarTipoConexion=this.jInternalFrameDetalleFormTipoConexion.jButtonActualizarToolBarTipoConexion.isVisible();
			this.isVisibilidadCeldaEliminarTipoConexion=this.jInternalFrameDetalleFormTipoConexion.jButtonEliminarToolBarTipoConexion.isVisible();
			this.isVisibilidadCeldaCancelarTipoConexion=this.jInternalFrameDetalleFormTipoConexion.jButtonCancelarToolBarTipoConexion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoConexion=this.jButtonGuardarCambiosToolBarTipoConexion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoConexion=this.jButtonGuardarCambiosTablaToolBarTipoConexion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoConexion=this.jMenuItemNuevoTipoConexion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoConexion=this.jMenuItemNuevoRelacionesTipoConexion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoConexion!=null) {
			this.isVisibilidadCeldaModificarTipoConexion=this.jInternalFrameDetalleFormTipoConexion.jMenuItemModificarTipoConexion.isVisible();
			this.isVisibilidadCeldaActualizarTipoConexion=this.jInternalFrameDetalleFormTipoConexion.jMenuItemActualizarTipoConexion.isVisible();
			this.isVisibilidadCeldaEliminarTipoConexion=this.jInternalFrameDetalleFormTipoConexion.jMenuItemEliminarTipoConexion.isVisible();
			this.isVisibilidadCeldaCancelarTipoConexion=this.jInternalFrameDetalleFormTipoConexion.jMenuItemCancelarTipoConexion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoConexion=this.jMenuItemGuardarCambiosTipoConexion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoConexion=this.jMenuItemGuardarCambiosTablaTipoConexion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoConexion(Boolean esInicializar) {
		if(TipoConexionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoconexionSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoConexion();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoConexion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoConexion() {
		this.jButtonNuevoTipoConexion.setVisible(this.isPermisoNuevoTipoConexion);			
		this.jButtonDuplicarTipoConexion.setVisible(this.isPermisoDuplicarTipoConexion);			
		this.jButtonCopiarTipoConexion.setVisible(this.isPermisoCopiarTipoConexion);			
		this.jButtonVerFormTipoConexion.setVisible(this.isPermisoVerFormTipoConexion);			
		
		this.jButtonAbrirOrderByTipoConexion.setVisible(this.isPermisoOrdenTipoConexion);					
		
		this.jButtonNuevoRelacionesTipoConexion.setVisible(this.isPermisoNuevoTipoConexion);			
		
		if(this.jInternalFrameDetalleFormTipoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConexion.jButtonModificarTipoConexion.setVisible(this.isPermisoActualizarTipoConexion);	
			this.jInternalFrameDetalleFormTipoConexion.jButtonActualizarTipoConexion.setVisible(this.isPermisoActualizarTipoConexion);	
			this.jInternalFrameDetalleFormTipoConexion.jButtonEliminarTipoConexion.setVisible(this.isPermisoEliminarTipoConexion);
			this.jInternalFrameDetalleFormTipoConexion.jButtonCancelarTipoConexion.setVisible(this.isVisibilidadCeldaCancelarTipoConexion);						
			this.jInternalFrameDetalleFormTipoConexion.jButtonGuardarCambiosTipoConexion.setVisible(this.isPermisoGuardarCambiosTipoConexion);							
		}
		
		this.jButtonGuardarCambiosTablaTipoConexion.setVisible(this.isPermisoActualizarTipoConexion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoConexion() {
		this.jInternalFrameDetalleFormTipoConexion.jButtonModificarTipoConexion.setVisible(this.isPermisoActualizarTipoConexion);	
		this.jInternalFrameDetalleFormTipoConexion.jButtonActualizarTipoConexion.setVisible(this.isPermisoActualizarTipoConexion);	
		this.jInternalFrameDetalleFormTipoConexion.jButtonEliminarTipoConexion.setVisible(this.isPermisoEliminarTipoConexion);
		this.jInternalFrameDetalleFormTipoConexion.jButtonCancelarTipoConexion.setVisible(this.isVisibilidadCeldaCancelarTipoConexion);							
		this.jInternalFrameDetalleFormTipoConexion.jButtonGuardarCambiosTipoConexion.setVisible((this.isVisibilidadCeldaGuardarTipoConexion && this.isPermisoGuardarCambiosTipoConexion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoConexion() {
		if(TipoConexionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoConexion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoConexion() {
	}
	
	public void jTableDatosTipoConexionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoConexion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoConexionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoConexion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoConexion(this.gettipoconexion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConexion(this.tipoconexion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconexion =(TipoConexion) this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoconexion =(TipoConexion) this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoconexion==null) {
						this.tipoconexion = new TipoConexion();
					}

					this.setVariablesFormularioToObjetoActualTipoConexion(this.tipoconexion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConexion(this.tipoconexion);
				}

				if(this.tipoconexion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoconexion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoConexion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoConexionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoConexion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoConexion(this.gettipoconexion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConexion(this.tipoconexion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconexion =(TipoConexion) this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoconexion =(TipoConexion) this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoconexion==null) {
						this.tipoconexion = new TipoConexion();
					}

					this.setVariablesFormularioToObjetoActualTipoConexion(this.tipoconexion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConexion(this.tipoconexion);
				}

				if(this.tipoconexion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoconexion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoConexion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTipoConexionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoConexion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoConexion(this.gettipoconexion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConexion(this.tipoconexion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconexion =(TipoConexion) this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoconexion =(TipoConexion) this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoconexion==null) {
						this.tipoconexion = new TipoConexion();
					}

					this.setVariablesFormularioToObjetoActualTipoConexion(this.tipoconexion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConexion(this.tipoconexion);
				}

				if(this.tipoconexion.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.tipoconexion.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoConexion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoConexion() {
		if(this.jInternalFrameDetalleFormTipoConexion!=null) {
		

		if(this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoConexion!=null) {
			this.jInternalFrameDetalleFormTipoConexion.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoConexion.dispose();
			this.jInternalFrameDetalleFormTipoConexion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoConexion!=null) {
			this.jInternalFrameReporteDinamicoTipoConexion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoConexion.dispose();
			this.jInternalFrameReporteDinamicoTipoConexion=null;
		}
		
		if(this.jInternalFrameImportacionTipoConexion!=null) {
			this.jInternalFrameImportacionTipoConexion.setVisible(false);	    			
			this.jInternalFrameImportacionTipoConexion.dispose();
			this.jInternalFrameImportacionTipoConexion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoConexion();
			
			TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoConexion")) {
				jButtonNuevoTipoConexionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoConexion")) {
				jButtonDuplicarTipoConexionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoConexion")) {
				jButtonCopiarTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoConexion")) {
				jButtonVerFormTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoConexion")) {
				jButtonNuevoTipoConexionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoConexion")) {
				jButtonDuplicarTipoConexionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoConexion")) {
				jButtonNuevoTipoConexionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoConexion")) {
				jButtonDuplicarTipoConexionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoConexion")) {
				jButtonNuevoTipoConexionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoConexion")) {
				jButtonNuevoTipoConexionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoConexion")) {
				jButtonNuevoTipoConexionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoConexion")) {
				jButtonModificarTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoConexion")) {
				jButtonModificarTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoConexion")) {
				jButtonModificarTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoConexion")) {
				jButtonActualizarTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoConexion")) {
				jButtonActualizarTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoConexion")) {
				jButtonActualizarTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoConexion")) {
				jButtonEliminarTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoConexion")) {
				jButtonEliminarTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoConexion")) {
				jButtonEliminarTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoConexion")) {
				jButtonCancelarTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoConexion")) {
				jButtonCancelarTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoConexion")) {
				jButtonCancelarTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoConexion")) {
				jButtonCerrarTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoConexion")) {
				jButtonCerrarTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoConexion")) {
				jButtonCerrarTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoConexion")) {
				jButtonMostrarOcultarTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoConexion")) {
				jButtonCancelarTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoConexion")) {
				jButtonGuardarCambiosTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoConexion")) {
				jButtonGuardarCambiosTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoConexion")) {
				jButtonCopiarTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoConexion")) {
				jButtonVerFormTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoConexion")) {
				jButtonGuardarCambiosTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoConexion")) {
				jButtonCopiarTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoConexion")) {
				jButtonVerFormTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoConexion")) {
				jButtonGuardarCambiosTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoConexion")) {
				jButtonGuardarCambiosTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoConexion")) {
				jButtonGuardarCambiosTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoConexion")) {
				jButtonRecargarInformacionTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoConexion")) {
				jButtonRecargarInformacionTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoConexion")) {
				jButtonRecargarInformacionTipoConexionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoConexion")) {
				jButtonAnterioresTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoConexion")) {
				jButtonAnterioresTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoConexion")) {
				jButtonAnterioresTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoConexion")) {
				jButtonSiguientesTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoConexion")) {
				jButtonSiguientesTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoConexion")) {
				jButtonSiguientesTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoConexion") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoConexion")) {
				jButtonAbrirOrderByTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoConexion") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoConexion")) {
				jButtonMostrarOcultarTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoConexion")) {
				jButtonNuevoGuardarCambiosTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoConexion")) {
				jButtonNuevoGuardarCambiosTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoConexion")) {
				jButtonNuevoGuardarCambiosTipoConexionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoConexion")) {
				jButtonCerrarReporteDinamicoTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoConexion")) {
				jButtonGenerarReporteDinamicoTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoConexion")) {
				
				jButtonGenerarExcelReporteDinamicoTipoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoConexion")) {
				jButtonCerrarImportacionTipoConexionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoConexion")) {
				
				jButtonGenerarImportacionTipoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoConexion")) {
				
				jButtonAbrirImportacionTipoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoConexion")) {
				jComboBoxTiposAccionesTipoConexionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoConexion")) {
				jComboBoxTiposRelacionesTipoConexionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoConexion")) {
				jComboBoxTiposAccionesTipoConexionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoConexion")) {
				
				jComboBoxTiposSeleccionarTipoConexionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoConexion")) {
				jTextFieldValorCampoGeneralTipoConexionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoConexion")) {
				jButtonAbrirOrderByTipoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoConexion")) {
				jButtonAbrirOrderByTipoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoConexion")) {
				jButtonCerrarOrderByTipoConexionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoConexionBusqueda")) {
				this.jButtonidTipoConexionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoConexionBusqueda")) {
				this.jButtonnombreTipoConexionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoConexionBusqueda")) {
				this.jButtondescripcionTipoConexionBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoConexion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConexionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconexion);
				
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
				
				


				
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConexion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConexion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoConexion tipoconexionLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoconexionLocal=this.tipoconexion;
			} else {
				tipoconexionLocal=this.tipoconexionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconexion);
				
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
							
				
				


				
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConexion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConexion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConexionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoConexion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexionAnterior =(TipoConexion) this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconexionAnterior =(TipoConexion) this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
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
			
			TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
			
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
			
			


			
			TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConexionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconexion);
				
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
								
						
				


				
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConexion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConexion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconexion);
				
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
								
				
				


				
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConexion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConexion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConexionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoConexion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexionAnterior =(TipoConexion) this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconexionAnterior =(TipoConexion) this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconexion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConexionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoConexion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexionAnterior =(TipoConexion) this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconexionAnterior =(TipoConexion) this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConexionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconexion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoconexion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconexion);
				
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
							
				
				


				
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConexion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConexion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConexionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoConexion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconexionAnterior =(TipoConexion) this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoconexionAnterior =(TipoConexion) this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
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
			
			TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
			
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
			
			


			
			TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConexionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconexion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoconexion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconexion);
				
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
								
				
				


				
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConexion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConexion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConexionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoConexion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexionAnterior =(TipoConexion) this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconexionAnterior =(TipoConexion) this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConexionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconexion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoconexion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConexionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconexion);
				
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoConexion")) {
					jCheckBoxSeleccionarTodosTipoConexionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoConexion")) {
					jCheckBoxSeleccionadosTipoConexionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoConexion")) {
					
				}
				
				


				
				
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConexion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConexion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconexion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoconexion);
				
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
												
				
				


				
				
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConexion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConexion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConexionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoConexion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconexionAnterior =(TipoConexion) this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoconexionAnterior =(TipoConexion) this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConexionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconexion);
				
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
				
				
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
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
			
			TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
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
			
			


			
			TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConexionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconexion);
				
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConexion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConexion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconexion);
				
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
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
				
				


				
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConexion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConexion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConexionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoConexion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconexionAnterior =(TipoConexion) this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconexionAnterior =(TipoConexion) this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoConexion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoConexionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoConexion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoconexion =(TipoConexion) this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoconexion =(TipoConexion) this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoconexion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoConexion")) {
				
				}
				
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoConexion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoConexion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoConexion")) {
			
			}
			
			TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoConexion();
			
			TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
			
			if(sTipo.equals("NuevoTipoConexion")) {
				jButtonNuevoTipoConexionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoConexion")) {
				jButtonDuplicarTipoConexionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoConexion")) {
				jButtonCopiarTipoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoConexion")) {
				jButtonVerFormTipoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoConexion")) {
				jButtonNuevoTipoConexionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoConexion")) {
				jButtonModificarTipoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoConexion")) {
				jButtonActualizarTipoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoConexion")) {
				jButtonEliminarTipoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoConexion")) {
				jButtonGuardarCambiosTipoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoConexion")) {
				jButtonCancelarTipoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoConexion")) {
				jButtonCerrarTipoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoConexion")) {
				jButtonGuardarCambiosTipoConexionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoConexion")) {
				jButtonNuevoGuardarCambiosTipoConexionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoConexion")) {
				jButtonAbrirOrderByTipoConexionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoConexion")) {
				jButtonRecargarInformacionTipoConexionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoConexion")) {
				jButtonAnterioresTipoConexionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoConexion")) {
				jButtonSiguientesTipoConexionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoConexionBusqueda")) {
				this.jButtonidTipoConexionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoConexionBusqueda")) {
				this.jButtonnombreTipoConexionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoConexionBusqueda")) {
				this.jButtondescripcionTipoConexionBusquedaActionPerformed(evt);
			}
			
			TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoConexion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoConexion")) {
				closingInternalFrameTipoConexion();
				
			} else if(sTipo.equals("jButtonCancelarTipoConexion")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoConexion = (JInternalFrameBase)evt.getSource();
	            	
	            TipoConexionBeanSwingJInternalFrame jInternalFrameParent=(TipoConexionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoConexion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoConexionActionPerformed(null);
			}
			
			TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoconexion,new Object(),this.tipoconexionParameterGeneral,this.tipoconexionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoConexion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoConexion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoConexion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoconexion)) {
			if(!esControlTabla) {
				if(TipoConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoConexion(this.tipoconexion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConexion(this.tipoconexion);			
				}
				
				if(this.tipoconexionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoConexion(this.tipoconexion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoconexionReturnGeneral=tipoconexionLogic.procesarEventosTipoConexionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoconexionLogic.getTipoConexions(),this.tipoconexion,this.tipoconexionParameterGeneral,this.isEsNuevoTipoConexion,classes);//this.tipoconexionLogic.getTipoConexion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoConexion(this.tipoconexionReturnGeneral,this.tipoconexionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoconexionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoConexion(classes,this.tipoconexionReturnGeneral,this.tipoconexionBean,false);
					}
						
					if(this.tipoconexionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoConexion(this.tipoconexionReturnGeneral.getTipoConexion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoConexion(this.tipoconexionReturnGeneral.getTipoConexion());	
					}
						
					if(this.tipoconexionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoConexion(this.tipoconexionReturnGeneral.getTipoConexion(),classes);//this.tipoconexionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoConexion(this.tipoconexion,classes);//this.tipoconexionBean);									
				}
			
				if(TipoConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoConexion(this.tipoconexion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConexion(this.tipoconexion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoconexionAnterior!=null) {
						this.tipoconexion=this.tipoconexionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoconexionReturnGeneral=tipoconexionLogic.procesarEventosTipoConexionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoconexionLogic.getTipoConexions(),this.tipoconexion,this.tipoconexionParameterGeneral,this.isEsNuevoTipoConexion,classes);//this.tipoconexionLogic.getTipoConexion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoconexionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoconexionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoconexionReturnGeneral.getTipoConexion(),tipoconexionLogic.getTipoConexions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoconexionReturnGeneral.getTipoConexion(),this.tipoconexions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoConexion.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoConexion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoConexion();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoConexion() throws Exception {
		
		TipoConexionModel tipoconexionModel=(TipoConexionModel)this.jTableDatosTipoConexion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoconexionModel.tipoconexions=this.tipoconexionLogic.getTipoConexions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoconexionModel.tipoconexions=this.tipoconexions;
		}
		
		
		((TipoConexionModel) this.jTableDatosTipoConexion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoConexion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoconexionAnterior(),this.tipoconexionLogic.getTipoConexions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoconexionAnterior(),this.tipoconexions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoConexion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoConexion(TipoConexion tipoconexion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Conexion.class)) {
					this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame.conexionLogic.setConexions(tipoconexion.getConexions());
					this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame.inicializarActualizarBindingTablaConexion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
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
										
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoconexion,new Object(),generalEntityParameterGeneral,this.tipoconexionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoconexionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoConexionConstantesFunciones.getClassesRelationshipsOfTipoConexion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoConexionConstantesFunciones.getClassesRelationshipsFromStringsOfTipoConexion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoConexion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoconexion,new Object(),generalEntityParameterGeneral,this.tipoconexionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoConexion(TipoConexionBean tipoconexionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Conexion.class)) {
					this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame.conexionLogic.setConexions(tipoconexion.getConexions());
					this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame.inicializarActualizarBindingTablaConexion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoConexion(ArrayList<Classe> classes,TipoConexionReturnGeneral tipoconexionReturnGeneral,TipoConexionBean tipoconexionBean,Boolean conDefault) throws Exception {
		
			this.tipoconexionBean.setConexions(tipoconexionReturnGeneral.getTipoConexion().getConexions());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoConexion(TipoConexion tipoconexion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Conexion.class)) {
					tipoconexion.setConexions(this.jInternalFrameDetalleFormTipoConexion.conexionBeanSwingJInternalFrame.conexionLogic.getConexions());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoconexion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoConexion = new TipoConexionDetalleFormJInternalFrame(jDesktopPane,this.tipoconexionSessionBean.getConGuardarRelaciones(),this.tipoconexionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoConexion);
		this.jInternalFrameDetalleFormTipoConexion.setVisible(false);
		this.jInternalFrameDetalleFormTipoConexion.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoConexion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoConexion.tipoconexionLogic=this.tipoconexionLogic;
		
		this.cargarCombosFrameForeignKeyTipoConexion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoConexion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoConexion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoConexion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoConexion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoConexion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoConexion"));
		
		this.jInternalFrameDetalleFormTipoConexion.jButtonModificarTipoConexion.addActionListener(new ButtonActionListener(this,"ModificarTipoConexion"));

		
		this.jInternalFrameDetalleFormTipoConexion.jButtonModificarToolBarTipoConexion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoConexion"));
					
		this.jInternalFrameDetalleFormTipoConexion.jMenuItemModificarTipoConexion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoConexion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoConexion.jButtonActualizarTipoConexion.addActionListener (new ButtonActionListener(this,"ActualizarTipoConexion"));
		
		
		this.jInternalFrameDetalleFormTipoConexion.jButtonActualizarToolBarTipoConexion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoConexion"));
						
		this.jInternalFrameDetalleFormTipoConexion.jMenuItemActualizarTipoConexion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoConexion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoConexion.jButtonEliminarTipoConexion.addActionListener (new ButtonActionListener(this,"EliminarTipoConexion"));
		
		
		this.jInternalFrameDetalleFormTipoConexion.jButtonEliminarToolBarTipoConexion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoConexion"));
								
		this.jInternalFrameDetalleFormTipoConexion.jMenuItemEliminarTipoConexion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoConexion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoConexion.jButtonCancelarTipoConexion.addActionListener (new ButtonActionListener(this,"CancelarTipoConexion"));
		
		
		this.jInternalFrameDetalleFormTipoConexion.jButtonCancelarToolBarTipoConexion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoConexion"));
					
		this.jInternalFrameDetalleFormTipoConexion.jMenuItemCancelarTipoConexion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoConexion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoConexion.jMenuItemDetalleCerrarTipoConexion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoConexion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoConexion.jButtonGuardarCambiosToolBarTipoConexion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoConexion"));
		
		
		
		this.jInternalFrameDetalleFormTipoConexion.jButtonGuardarCambiosToolBarTipoConexion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoConexion"));
		
		
		
		this.jInternalFrameDetalleFormTipoConexion.jComboBoxTiposAccionesFormularioTipoConexion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoConexion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConexion.jButtonidTipoConexionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoConexionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConexion.jButtonnombreTipoConexionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoConexionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConexion.jButtondescripcionTipoConexionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoConexionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoConexion.jTabbedPaneRelacionesTipoConexion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoConexion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoConexion"));
		
		if(this.jInternalFrameDetalleFormTipoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConexion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoConexion"));
		}
		
		this.jTableDatosTipoConexion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoConexion"));
		
		this.jTableDatosTipoConexion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoConexion"));
		
		this.jButtonNuevoTipoConexion.addActionListener(new ButtonActionListener(this,"NuevoTipoConexion"));
		
		this.jButtonDuplicarTipoConexion.addActionListener(new ButtonActionListener(this,"DuplicarTipoConexion"));
		
		this.jButtonCopiarTipoConexion.addActionListener(new ButtonActionListener(this,"CopiarTipoConexion"));
		
		this.jButtonVerFormTipoConexion.addActionListener(new ButtonActionListener(this,"VerFormTipoConexion"));
		
		
		this.jButtonNuevoToolBarTipoConexion.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoConexion"));
			
		this.jButtonDuplicarToolBarTipoConexion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoConexion"));
			
		this.jMenuItemNuevoTipoConexion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoConexion"));
			
		this.jMenuItemDuplicarTipoConexion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoConexion"));		
		
		
		this.jButtonNuevoRelacionesTipoConexion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoConexion"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoConexion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoConexion"));
			
		this.jMenuItemNuevoRelacionesTipoConexion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoConexion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConexion.jButtonModificarTipoConexion.addActionListener(new ButtonActionListener(this,"ModificarTipoConexion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConexion.jButtonModificarToolBarTipoConexion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoConexion"));
			
			this.jInternalFrameDetalleFormTipoConexion.jMenuItemModificarTipoConexion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoConexion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConexion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoConexion.jButtonActualizarTipoConexion.addActionListener (new ButtonActionListener(this,"ActualizarTipoConexion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConexion.jButtonActualizarToolBarTipoConexion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoConexion"));
				
			this.jInternalFrameDetalleFormTipoConexion.jMenuItemActualizarTipoConexion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoConexion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConexion.jButtonEliminarTipoConexion.addActionListener (new ButtonActionListener(this,"EliminarTipoConexion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConexion.jButtonEliminarToolBarTipoConexion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoConexion"));
						
			this.jInternalFrameDetalleFormTipoConexion.jMenuItemEliminarTipoConexion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoConexion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConexion.jButtonCancelarTipoConexion.addActionListener (new ButtonActionListener(this,"CancelarTipoConexion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConexion.jButtonCancelarToolBarTipoConexion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoConexion"));
			
			this.jInternalFrameDetalleFormTipoConexion.jMenuItemCancelarTipoConexion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoConexion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoConexion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoConexion"));		
		
		
		this.jButtonCerrarTipoConexion.addActionListener (new ButtonActionListener(this,"CerrarTipoConexion"));
		
		
		this.jButtonCerrarToolBarTipoConexion.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoConexion"));
			
		this.jMenuItemCerrarTipoConexion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoConexion"));
			
		if(this.jInternalFrameDetalleFormTipoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConexion.jMenuItemDetalleCerrarTipoConexion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoConexion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConexion.jButtonGuardarCambiosTipoConexion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoConexion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConexion.jButtonGuardarCambiosToolBarTipoConexion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoConexion"));
		}
		
		this.jButtonCopiarToolBarTipoConexion.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoConexion"));
			
		this.jButtonVerFormToolBarTipoConexion.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoConexion"));
		
		this.jMenuItemGuardarCambiosTipoConexion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoConexion"));
			
		this.jMenuItemCopiarTipoConexion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoConexion"));		
		
		this.jMenuItemVerFormTipoConexion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoConexion"));		
		
		
		this.jButtonGuardarCambiosTablaTipoConexion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoConexion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoConexion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoConexion"));
			
		this.jMenuItemGuardarCambiosTablaTipoConexion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoConexion"));		
		
		
		
		this.jButtonRecargarInformacionTipoConexion.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoConexion"));
					
		this.jButtonRecargarInformacionToolBarTipoConexion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoConexion"));
		
		this.jMenuItemRecargarInformacionTipoConexion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoConexion"));		
		
		
		
		this.jButtonAnterioresTipoConexion.addActionListener (new ButtonActionListener(this,"AnterioresTipoConexion"));
		
		
		this.jButtonAnterioresToolBarTipoConexion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoConexion"));
		
		this.jMenuItemAnterioresTipoConexion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoConexion"));		
		
		
		this.jButtonSiguientesTipoConexion.addActionListener (new ButtonActionListener(this,"SiguientesTipoConexion"));
		
		
		this.jButtonSiguientesToolBarTipoConexion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoConexion"));
			
		this.jMenuItemSiguientesTipoConexion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoConexion"));
			
		this.jMenuItemAbrirOrderByTipoConexion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoConexion"));
			
		this.jMenuItemMostrarOcultarTipoConexion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoConexion"));
			
		this.jMenuItemDetalleAbrirOrderByTipoConexion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoConexion"));
			
		this.jMenuItemDetalleMostarOcultarTipoConexion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoConexion"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoConexion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoConexion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoConexion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoConexion"));
			
		this.jMenuItemNuevoGuardarCambiosTipoConexion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoConexion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoConexion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoConexion"));

		this.jCheckBoxSeleccionadosTipoConexion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoConexion"));
		
		if(this.jInternalFrameDetalleFormTipoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConexion.jComboBoxTiposAccionesFormularioTipoConexion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoConexion"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoConexion.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoConexion"));
			
		this.jComboBoxTiposAccionesTipoConexion.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoConexion"));
					
		this.jComboBoxTiposSeleccionarTipoConexion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoConexion"));
			
		this.jTextFieldValorCampoGeneralTipoConexion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoConexion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoConexion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConexion.jButtonidTipoConexionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoConexionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConexion.jButtonnombreTipoConexionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoConexionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConexion.jButtondescripcionTipoConexionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoConexionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoConexion!=null) {
				this.jInternalFrameReporteDinamicoTipoConexion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoConexion"));
				this.jInternalFrameReporteDinamicoTipoConexion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoConexion"));
				this.jInternalFrameReporteDinamicoTipoConexion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoConexion"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoConexion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoConexion"));				
			//this.jButtonGenerarReporteDinamicoTipoConexion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoConexion"));
			//this.jButtonGenerarExcelReporteDinamicoTipoConexion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoConexion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoConexion!=null) {
				this.jInternalFrameImportacionTipoConexion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoConexion"));
				this.jInternalFrameImportacionTipoConexion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoConexion"));
				this.jInternalFrameImportacionTipoConexion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoConexion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoConexion.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoConexion"));
			
			this.jButtonAbrirOrderByToolBarTipoConexion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoConexion"));			
			
			if(this.jInternalFrameOrderByTipoConexion!=null) {
				this.jInternalFrameOrderByTipoConexion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoConexion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoConexion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConexion.jTabbedPaneRelacionesTipoConexion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoConexion"));
		
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
            		closingInternalFrameTipoConexion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoConexion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoConexion = (JInternalFrameBase)event.getSource();
	            	
	            TipoConexionBeanSwingJInternalFrame jInternalFrameParent=(TipoConexionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoConexion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoConexionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoConexion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoConexionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoConexion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoConexion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoConexionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoConexionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoConexionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoConexion";
		inputMap = this.jButtonNuevoTipoConexion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoConexion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoConexionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoConexionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoConexionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoConexionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoConexion";
		inputMap = this.jButtonNuevoRelacionesTipoConexion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoConexion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoConexionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoConexion";
		inputMap = this.jButtonModificarTipoConexion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoConexion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoConexionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoConexion";
		inputMap = this.jButtonActualizarTipoConexion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoConexion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoConexionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoConexion";
		inputMap = this.jButtonEliminarTipoConexion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoConexion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoConexionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoConexion";
		inputMap = this.jButtonCancelarTipoConexion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoConexion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoConexionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoConexion";
		inputMap = this.jButtonCerrarTipoConexion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoConexion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoConexionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoConexion.jButtonGuardarCambiosTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoConexion";
		inputMap = this.jInternalFrameDetalleFormTipoConexion.jButtonGuardarCambiosTipoConexion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoConexion.jButtonGuardarCambiosTipoConexion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoConexionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoConexion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoConexionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoConexion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoConexionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoConexion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoConexionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoConexion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoConexionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConexion.jButtonidTipoConexionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoConexionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConexion.jButtonnombreTipoConexionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoConexionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConexion.jButtondescripcionTipoConexionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoConexionBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoConexionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoConexion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoConexion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoConexion tipoconexionAux:this.tipoconexionLogic.getTipoConexions()) {
					tipoconexionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoConexion tipoconexionAux:tipoconexions) {
					tipoconexionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoConexionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoConexion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoConexion tipoconexionAux:this.tipoconexionLogic.getTipoConexions()) {
						tipoconexionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoConexion tipoconexionAux:tipoconexions) {
						tipoconexionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoConexion tipoconexionAux:this.tipoconexionLogic.getTipoConexions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoConexion tipoconexionAux:tipoconexions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoConexion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoConexion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoConexion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoConexion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoConexionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoConexion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoConexion.getSelectedRows();
			
			TipoConexion tipoconexionLocal=new TipoConexion();
			
			//this.seleccionarTodosTipoConexion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoconexionLocal =(TipoConexion) this.tipoconexionLogic.getTipoConexions().toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoconexionLocal =(TipoConexion) this.tipoconexions.toArray()[this.jTableDatosTipoConexion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoconexionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoConexion tipoconexionAux:this.tipoconexionLogic.getTipoConexions()) {
						tipoconexionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoConexion tipoconexionAux:tipoconexions) {
						tipoconexionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoConexion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoConexion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoConexion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoConexion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoConexionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoConexionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoConexionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoConexion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoConexion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoConexion tipoconexionAux:this.tipoconexionLogic.getTipoConexions()) {
				
						if(sTipoSeleccionar.equals(TipoConexionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoconexionAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoConexionConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipoconexionAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoConexion tipoconexionAux:tipoconexions) {
					
						if(sTipoSeleccionar.equals(TipoConexionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoconexionAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoConexionConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipoconexionAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoConexion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoConexionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoConexion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoConexion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoConexion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoConexion.jComboBoxTiposAccionesFormularioTipoConexion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoConexion) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoConexion(conSplash);
				
					this.generarReporteTipoConexionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoConexion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoConexion.jComboBoxTiposAccionesFormularioTipoConexion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoConexionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoConexion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoConexionsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoConexion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoConexionsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoConexion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoConexion();
				
				this.exportarTipoConexionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoConexion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoConexion.jComboBoxTiposAccionesFormularioTipoConexion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoConexions();
				//this.importarTipoConexions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoConexion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoConexion.jComboBoxTiposAccionesFormularioTipoConexion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoConexion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoConexionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoConexion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Conexion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoConexion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoConexion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoConexion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Conexion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoConexion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoConexion.jComboBoxTiposAccionesFormularioTipoConexion.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoConexion();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoConexion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoConexionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoConexion();
			
			if(this.jInternalFrameDetalleFormTipoConexion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoConexion> tipoconexionsSeleccionados=new ArrayList<TipoConexion>();		
			TipoConexion tipoconexion=new TipoConexion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoConexion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoConexion.getSelectedItem();
			
			
			
			
			tipoconexionsSeleccionados=this.getTipoConexionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoconexionsSeleccionados.size()==1) {
				for(TipoConexion tipoconexionAux:tipoconexionsSeleccionados) {
					tipoconexion=tipoconexionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Conexion")) {
					jButtonConexionActionPerformed(null,rowIndex,true,false,tipoconexion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoConexion();
			
      		//this.finishProcessTipoConexion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoConexionReturnGeneral() throws Exception {
		if(this.tipoconexionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoconexionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoconexionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoconexionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoconexionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoconexionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoConexion(false);
		}
		
		if(this.tipoconexionReturnGeneral.getConRetornoLista() || this.tipoconexionReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoconexionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoconexionLogic.setTipoConexions(this.tipoconexionReturnGeneral.getTipoConexions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoconexionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoconexionLogic.setTipoConexion(this.tipoconexionReturnGeneral.getTipoConexion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoConexion(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoConexion() throws Exception {
		
		
	}
	
	public ArrayList<TipoConexion> getTipoConexionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoConexion> tipoconexionsSeleccionados=new ArrayList<TipoConexion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoConexion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoConexion tipoconexionAux:tipoconexionLogic.getTipoConexions()) {
					if(tipoconexionAux.getIsSelected()) {
						tipoconexionsSeleccionados.add(tipoconexionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoConexion tipoconexionAux:this.tipoconexions) {
					if(tipoconexionAux.getIsSelected()) {
						tipoconexionsSeleccionados.add(tipoconexionAux);				
					}
				}
			}
			
			if(tipoconexionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoconexionsSeleccionados.addAll(this.tipoconexionLogic.getTipoConexions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoconexionsSeleccionados.addAll(this.tipoconexions);				
					}
				}
			}
		} else {
			tipoconexionsSeleccionados.add(this.tipoconexion);
		}
		
		return tipoconexionsSeleccionados;
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
	
	public void generarReporteTipoConexionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoConexionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoConexionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoConexionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoConexionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoConexionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Conexion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoConexionsSeleccionados() throws Exception {
		ArrayList<TipoConexion> tipoconexionsSeleccionados=new ArrayList<TipoConexion>();		
		
		tipoconexionsSeleccionados=this.getTipoConexionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoConexions("Todos",tipoconexionsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoConexionsSeleccionados() throws Exception {
		ArrayList<TipoConexion> tipoconexionsSeleccionados=new ArrayList<TipoConexion>();		
		
		tipoconexionsSeleccionados=this.getTipoConexionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoConexions("Todos",tipoconexionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoConexionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoConexion> tipoconexionsSeleccionados=new ArrayList<TipoConexion>();
		
		tipoconexionsSeleccionados=this.getTipoConexionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoConexions("Todos",tipoconexionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoConexionsSeleccionados() throws Exception {
		ArrayList<TipoConexion> tipoconexionsSeleccionados=new ArrayList<TipoConexion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoConexion();
		
		
		tipoconexionsSeleccionados=this.getTipoConexionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoConexion();
		
		
		//this.generarReporteTipoConexions("Todos",tipoconexionsSeleccionados ,tipoconexionImplementable,tipoconexionImplementableHome);
	}
	
	public void mostrarImportacionTipoConexions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoConexion();
		
		this.abrirFrameImportacionTipoConexion();		
		
			
		//this.generarReporteTipoConexions("Todos",tipoconexionsSeleccionados ,tipoconexionImplementable,tipoconexionImplementableHome);
	}
	
	public void importarTipoConexions() throws Exception {		
	
	}
	
	public void exportarTipoConexionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoConexionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoConexionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoConexionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Conexion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoConexionsSeleccionados() throws Exception {
		ArrayList<TipoConexion> tipoconexionsSeleccionados=new ArrayList<TipoConexion>();		
		
		tipoconexionsSeleccionados=this.getTipoConexionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconexion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoConexion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoConexion tipoconexionAux:tipoconexionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoConexion(tipoconexionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoconexionAux.setsDetalleGeneralEntityReporte(tipoconexionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Conexion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoConexion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoConexionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoConexionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoConexionConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoConexionConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoConexion(TipoConexion tipoconexion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoconexion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoconexion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoconexion.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoconexion.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoConexionsSeleccionados() throws Exception {
		ArrayList<TipoConexion> tipoconexionsSeleccionados=new ArrayList<TipoConexion>();		
		
		tipoconexionsSeleccionados=this.getTipoConexionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconexion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoConexions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoConexion(row);				
				iRow++;
			}				
			
			for(TipoConexion tipoconexionAux:tipoconexionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoConexion(tipoconexionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Conexion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoConexionsSeleccionados() throws Exception {
		ArrayList<TipoConexion> tipoconexionsSeleccionados=new ArrayList<TipoConexion>();		
		
		tipoconexionsSeleccionados=this.getTipoConexionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconexion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoconexions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoconexion");
			//elementRoot.appendChild(element);
		
			for(TipoConexion tipoconexionAux:tipoconexionsSeleccionados) {
				element = document.createElement("tipoconexion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoConexion(tipoconexionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Conexion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoConexion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoConexionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoConexionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoConexionConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoConexionConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoConexion(TipoConexion tipoconexion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoconexion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoconexion.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoconexion.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlTipoConexion(TipoConexion tipoconexion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoConexionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoconexion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoConexionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoconexion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoConexionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoconexion.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(TipoConexionConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(tipoconexion.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoTipoConexionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoConexion> tipoconexionsSeleccionados=new ArrayList<TipoConexion>();
		
		tipoconexionsSeleccionados=this.getTipoConexionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoConexion(tipoconexionsSeleccionados);
		
		this.generarReporteTipoConexions("Todos",tipoconexionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoConexion(ArrayList<TipoConexion> tipoconexionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoConexion tipoconexionAux:tipoconexionsSeleccionados) {
				tipoconexionAux.setsDetalleGeneralEntityReporte(tipoconexionAux.toString());
			
				if(sTipoSeleccionar.equals(TipoConexionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoconexionAux.setsDescripcionGeneralEntityReporte1(tipoconexionAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoConexionConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					tipoconexionAux.setsDescripcionGeneralEntityReporte1(tipoconexionAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoConexion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoConexion=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoConexion=true;
				this.isVisibilidadCeldaGuardarCambiosTipoConexion=true;
			}
			
			this.isVisibilidadCeldaModificarTipoConexion=false;
			this.isVisibilidadCeldaActualizarTipoConexion=false;
			this.isVisibilidadCeldaEliminarTipoConexion=false;
			this.isVisibilidadCeldaCancelarTipoConexion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConexion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoConexion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoConexion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoConexion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConexion=false;
			this.isVisibilidadCeldaModificarTipoConexion=false;
			this.isVisibilidadCeldaActualizarTipoConexion=true;
			this.isVisibilidadCeldaEliminarTipoConexion=false;
			this.isVisibilidadCeldaCancelarTipoConexion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConexion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoConexion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoConexion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoConexion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConexion=false;
			this.isVisibilidadCeldaModificarTipoConexion=false;
			this.isVisibilidadCeldaActualizarTipoConexion=true;
			this.isVisibilidadCeldaEliminarTipoConexion=true;
			this.isVisibilidadCeldaCancelarTipoConexion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConexion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoConexion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoConexion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoConexion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConexion=false;
			this.isVisibilidadCeldaModificarTipoConexion=false;
			this.isVisibilidadCeldaActualizarTipoConexion=true;
			this.isVisibilidadCeldaEliminarTipoConexion=false;
			this.isVisibilidadCeldaCancelarTipoConexion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConexion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoConexion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoConexion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoConexion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoConexion=true;
			this.isVisibilidadCeldaModificarTipoConexion=false;
			this.isVisibilidadCeldaActualizarTipoConexion=false;
			this.isVisibilidadCeldaEliminarTipoConexion=false;
			this.isVisibilidadCeldaCancelarTipoConexion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConexion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoConexion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoConexion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoConexion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConexion=false;
			this.isVisibilidadCeldaActualizarTipoConexion=false;
			this.isVisibilidadCeldaEliminarTipoConexion=false;
			this.isVisibilidadCeldaCancelarTipoConexion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConexion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoConexion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoConexion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoConexion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConexion=false;
			this.isVisibilidadCeldaModificarTipoConexion=true;
			this.isVisibilidadCeldaActualizarTipoConexion=false;
			this.isVisibilidadCeldaEliminarTipoConexion=false;
			this.isVisibilidadCeldaCancelarTipoConexion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConexion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoConexion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoConexionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoConexion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoConexion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoConexion=true;
		} else {
			this.actualizarEstadoPanelsTipoConexion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoConexion=false;
			//this.isVisibilidadCeldaVerFormTipoConexion=false;
			this.isVisibilidadCeldaDuplicarTipoConexion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoconexionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoConexion=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoConexion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConexion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoconexionSessionBean.getEsGuardarRelacionado()) {
			if(!tipoconexionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoConexion=false;												
			}
			
			this.jButtonCerrarTipoConexion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoConexion=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoconexion)) {
			this.isVisibilidadCeldaActualizarTipoConexion=false;
			this.isVisibilidadCeldaEliminarTipoConexion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoConexion() {
		this.isVisibilidadCeldaNuevoTipoConexion=false;
		this.isVisibilidadCeldaGuardarCambiosTipoConexion=false;
	}
	
	public void actualizarEstadoPanelsTipoConexion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoConexion!=null) {
				this.jScrollPanelDatosEdicionTipoConexion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoConexion!=null) {
				this.jScrollPanelDatosTipoConexion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoConexion!=null) {
				this.jPanelPaginacionTipoConexion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoConexion!=null) {
				this.jPanelParametrosReportesTipoConexion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoConexion!=null) {
				this.jScrollPanelDatosEdicionTipoConexion.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoConexion!=null) {
				this.jScrollPanelDatosTipoConexion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoConexion!=null) {
				this.jPanelPaginacionTipoConexion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoConexion!=null) {
				this.jPanelParametrosReportesTipoConexion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoConexion!=null) {
				this.jScrollPanelDatosEdicionTipoConexion.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoConexion!=null) {
				this.jScrollPanelDatosTipoConexion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoConexion!=null) {
				this.jPanelPaginacionTipoConexion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoConexion!=null) {
				this.jPanelParametrosReportesTipoConexion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoConexion!=null) {
				this.jScrollPanelDatosEdicionTipoConexion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoConexion!=null) {
				this.jScrollPanelDatosTipoConexion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoConexion!=null) {
				this.jPanelPaginacionTipoConexion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoConexion!=null) {
				this.jPanelParametrosReportesTipoConexion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoConexion!=null) {
				this.jScrollPanelDatosEdicionTipoConexion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoConexion!=null) {
				this.jScrollPanelDatosTipoConexion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoConexion!=null) {
				this.jPanelPaginacionTipoConexion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoConexion!=null) {
				this.jPanelParametrosReportesTipoConexion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoConexion!=null) {
				this.jScrollPanelDatosEdicionTipoConexion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoConexion!=null) {
				this.jScrollPanelDatosTipoConexion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoConexion!=null) {
				this.jPanelPaginacionTipoConexion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoConexion!=null) {
				this.jPanelParametrosReportesTipoConexion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoConexion!=null) {
				this.jScrollPanelDatosEdicionTipoConexion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoConexion!=null) {
				this.jScrollPanelDatosTipoConexion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoConexion!=null) {
				this.jPanelPaginacionTipoConexion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoConexion!=null) {
				this.jPanelParametrosReportesTipoConexion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoConexionParaConexiones() throws Exception {
		Boolean isPaginaPopupConexion=false;

		try {

			if(this.tipoconexionSessionBean==null) {
				this.tipoconexionSessionBean=new TipoConexionSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoConexion.conexionSessionBean==null) {
				this.jInternalFrameDetalleFormTipoConexion.conexionSessionBean=new ConexionSessionBean();
			}

			this.jInternalFrameDetalleFormTipoConexion.conexionSessionBean.setsPathNavegacionActual(tipoconexionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ConexionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoConexion.conexionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupConexion=this.jInternalFrameDetalleFormTipoConexion.conexionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoConexion.conexionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeConexion(true);
			this.jInternalFrameDetalleFormTipoConexion.conexionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeConexion(TipoConexionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoConexion.conexionSessionBean.setisBusquedaDesdeForeignKeySesionTipoConexion(true);
			this.jInternalFrameDetalleFormTipoConexion.conexionSessionBean.setlidTipoConexionActual(this.idTipoConexionActual);

			tipoconexionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoConexion(true);
			tipoconexionSessionBean.setlIdTipoConexionActualForeignKey(this.idTipoConexionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoConexionSessionBean tipoconexionSessionBean=new TipoConexionSessionBean();
		
		if(this.tipoconexionSessionBean==null) {
			this.tipoconexionSessionBean=new TipoConexionSessionBean();
		}
		
		this.tipoconexionSessionBean.setsUltimaBusquedaTipoConexion(this.getsAccionBusqueda());
		this.tipoconexionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoconexionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoConexionSessionBean tipoconexionSessionBean=new TipoConexionSessionBean();
		
		if(this.tipoconexionSessionBean==null) {
			this.tipoconexionSessionBean=new TipoConexionSessionBean();
		}
		
		if(this.tipoconexionSessionBean.getsUltimaBusquedaTipoConexion()!=null&&!this.tipoconexionSessionBean.getsUltimaBusquedaTipoConexion().equals("")) {
			this.setsAccionBusqueda(tipoconexionSessionBean.getsUltimaBusquedaTipoConexion());
			this.setiNumeroPaginacion(tipoconexionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoconexionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipoconexionSessionBean.setsUltimaBusquedaTipoConexion("");
		this.tipoconexionSessionBean.setiNumeroPaginacion(TipoConexionConstantesFunciones.INUMEROPAGINACION);
		this.tipoconexionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoConexion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoConexion() {
		this.updateBorderResaltarBusquedasFormularioTipoConexion();
		this.updateVisibilidadBusquedasFormularioTipoConexion();
		this.updateHabilitarBusquedasFormularioTipoConexion();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoConexion() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoConexion() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoConexion() {
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
	
	public void updateControlesFormularioTipoConexion() throws Exception {

		if(this.jInternalFrameDetalleFormTipoConexion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoConexion();
		this.updateVisibilidadResaltarControlesFormularioTipoConexion();
		this.updateHabilitarResaltarControlesFormularioTipoConexion();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoConexion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoConexion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoconexionConstantesFunciones.resaltaridTipoConexion!=null && this.jInternalFrameDetalleFormTipoConexion!=null) {this.jInternalFrameDetalleFormTipoConexion.jTextFieldidTipoConexion.setBorder(this.tipoconexionConstantesFunciones.resaltaridTipoConexion);}
		if(this.tipoconexionConstantesFunciones.resaltarnombreTipoConexion!=null && this.jInternalFrameDetalleFormTipoConexion!=null) {this.jInternalFrameDetalleFormTipoConexion.jTextAreanombreTipoConexion.setBorder(this.tipoconexionConstantesFunciones.resaltarnombreTipoConexion);}
		if(this.tipoconexionConstantesFunciones.resaltardescripcionTipoConexion!=null && this.jInternalFrameDetalleFormTipoConexion!=null) {this.jInternalFrameDetalleFormTipoConexion.jTextAreadescripcionTipoConexion.setBorder(this.tipoconexionConstantesFunciones.resaltardescripcionTipoConexion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoConexion() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoConexion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoConexion!=null) {
	
		//this.jInternalFrameDetalleFormTipoConexion.jTextFieldidTipoConexion.setVisible(this.tipoconexionConstantesFunciones.mostraridTipoConexion);
		this.jInternalFrameDetalleFormTipoConexion.jPanelidTipoConexion.setVisible(this.tipoconexionConstantesFunciones.mostraridTipoConexion);
		//this.jInternalFrameDetalleFormTipoConexion.jTextAreanombreTipoConexion.setVisible(this.tipoconexionConstantesFunciones.mostrarnombreTipoConexion);
		this.jInternalFrameDetalleFormTipoConexion.jPanelnombreTipoConexion.setVisible(this.tipoconexionConstantesFunciones.mostrarnombreTipoConexion);
		//this.jInternalFrameDetalleFormTipoConexion.jTextAreadescripcionTipoConexion.setVisible(this.tipoconexionConstantesFunciones.mostrardescripcionTipoConexion);
		this.jInternalFrameDetalleFormTipoConexion.jPaneldescripcionTipoConexion.setVisible(this.tipoconexionConstantesFunciones.mostrardescripcionTipoConexion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoConexion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoConexion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoConexion!=null) {
	
		this.jInternalFrameDetalleFormTipoConexion.jTextFieldidTipoConexion.setEnabled(this.tipoconexionConstantesFunciones.activaridTipoConexion);
		this.jInternalFrameDetalleFormTipoConexion.jTextAreanombreTipoConexion.setEnabled(this.tipoconexionConstantesFunciones.activarnombreTipoConexion);
		this.jInternalFrameDetalleFormTipoConexion.jTextAreadescripcionTipoConexion.setEnabled(this.tipoconexionConstantesFunciones.activardescripcionTipoConexion);
		}
	}
	
		
}