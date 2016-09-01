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

import com.bydan.erp.seguridad.util.TipoValoracionConstantesFunciones;
import com.bydan.erp.seguridad.util.TipoValoracionParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.TipoValoracionParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.TipoValoracionBean;
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
public class TipoValoracionBeanSwingJInternalFrame extends TipoValoracionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoValoracionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoValoracion> tipovaloracionValidator = new ClassValidator<TipoValoracion>(TipoValoracion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoValoracion tipovaloracion;	
	public TipoValoracion tipovaloracionAux;
	public TipoValoracion tipovaloracionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoValoracion tipovaloracionTotales;
	public Long idTipoValoracionActual;
	public Long iIdNuevoTipoValoracion=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosReferenciaBancaria=false;

	public Boolean getIsTienePermisosReferenciaBancaria() {
		return isTienePermisosReferenciaBancaria;
	}

	public void setIsTienePermisosReferenciaBancaria(Boolean isTienePermisosReferenciaBancaria) {
		this.isTienePermisosReferenciaBancaria= isTienePermisosReferenciaBancaria;
	}


	public Boolean isTienePermisosLunaSistemaSolar=false;

	public Boolean getIsTienePermisosLunaSistemaSolar() {
		return isTienePermisosLunaSistemaSolar;
	}

	public void setIsTienePermisosLunaSistemaSolar(Boolean isTienePermisosLunaSistemaSolar) {
		this.isTienePermisosLunaSistemaSolar= isTienePermisosLunaSistemaSolar;
	}


	public Boolean isTienePermisosPlanetaSistemaSolar=false;

	public Boolean getIsTienePermisosPlanetaSistemaSolar() {
		return isTienePermisosPlanetaSistemaSolar;
	}

	public void setIsTienePermisosPlanetaSistemaSolar(Boolean isTienePermisosPlanetaSistemaSolar) {
		this.isTienePermisosPlanetaSistemaSolar= isTienePermisosPlanetaSistemaSolar;
	}


	public Boolean isTienePermisosReferenciaComercial=false;

	public Boolean getIsTienePermisosReferenciaComercial() {
		return isTienePermisosReferenciaComercial;
	}

	public void setIsTienePermisosReferenciaComercial(Boolean isTienePermisosReferenciaComercial) {
		this.isTienePermisosReferenciaComercial= isTienePermisosReferenciaComercial;
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
	
	public Boolean isPermisoTodoTipoValoracion;
	public Boolean isPermisoNuevoTipoValoracion;
	public Boolean isPermisoActualizarTipoValoracion;
	public Boolean isPermisoActualizarOriginalTipoValoracion;
	public Boolean isPermisoEliminarTipoValoracion;
	public Boolean isPermisoGuardarCambiosTipoValoracion;
	public Boolean isPermisoConsultaTipoValoracion;
	public Boolean isPermisoBusquedaTipoValoracion;
	public Boolean isPermisoReporteTipoValoracion;
	public Boolean isPermisoPaginacionMedioTipoValoracion;
	public Boolean isPermisoPaginacionAltoTipoValoracion;
	public Boolean isPermisoPaginacionTodoTipoValoracion;
	public Boolean isPermisoCopiarTipoValoracion;
	public Boolean isPermisoVerFormTipoValoracion;
	public Boolean isPermisoDuplicarTipoValoracion;
	public Boolean isPermisoOrdenTipoValoracion;
	
	
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
	
	public TipoValoracionParameterReturnGeneral tipovaloracionReturnGeneral;
	public TipoValoracionParameterReturnGeneral tipovaloracionParameterGeneral;
	
	

	public ReferenciaBancariaLogic referenciabancariaLogic=null;

	public ReferenciaBancariaLogic getReferenciaBancariaLogic() {
		return referenciabancariaLogic;
	}

	public void setReferenciaBancariaLogic(ReferenciaBancariaLogic referenciabancariaLogic) {
		this.referenciabancariaLogic = referenciabancariaLogic;
	}


	public LunaSistemaSolarLogic lunasistemasolarLogic=null;

	public LunaSistemaSolarLogic getLunaSistemaSolarLogic() {
		return lunasistemasolarLogic;
	}

	public void setLunaSistemaSolarLogic(LunaSistemaSolarLogic lunasistemasolarLogic) {
		this.lunasistemasolarLogic = lunasistemasolarLogic;
	}


	public PlanetaSistemaSolarLogic planetasistemasolarLogic=null;

	public PlanetaSistemaSolarLogic getPlanetaSistemaSolarLogic() {
		return planetasistemasolarLogic;
	}

	public void setPlanetaSistemaSolarLogic(PlanetaSistemaSolarLogic planetasistemasolarLogic) {
		this.planetasistemasolarLogic = planetasistemasolarLogic;
	}


	public ReferenciaComercialLogic referenciacomercialLogic=null;

	public ReferenciaComercialLogic getReferenciaComercialLogic() {
		return referenciacomercialLogic;
	}

	public void setReferenciaComercialLogic(ReferenciaComercialLogic referenciacomercialLogic) {
		this.referenciacomercialLogic = referenciacomercialLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoValoracion=false;
	public Boolean esParaAccionDesdeFormularioTipoValoracion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoValoracionLogic tipovaloracionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoValoracion tipovaloracionBean;
	public TipoValoracionConstantesFunciones tipovaloracionConstantesFunciones;
	//public TipoValoracionParameterReturnGeneral tipovaloracionReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoValoracion> tipovaloracions;	
	//public List<TipoValoracion> tipovaloracionsEliminados;
	//public List<TipoValoracion> tipovaloracionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoValoracion=false;
	public Boolean isVisibilidadCeldaDuplicarTipoValoracion=true;
	public Boolean isVisibilidadCeldaCopiarTipoValoracion=true;
	public Boolean isVisibilidadCeldaVerFormTipoValoracion=true;
	public Boolean isVisibilidadCeldaOrdenTipoValoracion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoValoracion=false;
	public Boolean isVisibilidadCeldaModificarTipoValoracion=false;
	public Boolean isVisibilidadCeldaActualizarTipoValoracion=false;
	public Boolean isVisibilidadCeldaEliminarTipoValoracion=false;
	public Boolean isVisibilidadCeldaCancelarTipoValoracion=false;
	public Boolean isVisibilidadCeldaGuardarTipoValoracion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoValoracion=false;	
	
	
	
	public Long getiIdNuevoTipoValoracion() {
		return this.iIdNuevoTipoValoracion;
	}

	public void setiIdNuevoTipoValoracion(Long iIdNuevoTipoValoracion) {
		this.iIdNuevoTipoValoracion = iIdNuevoTipoValoracion;
	}
	
	public Long getidTipoValoracionActual() {
		return this.idTipoValoracionActual;
	}

	public void setidTipoValoracionActual(Long idTipoValoracionActual) {
		this.idTipoValoracionActual = idTipoValoracionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoValoracion gettipovaloracion() {
		return this.tipovaloracion;
	}

	public void settipovaloracion(TipoValoracion tipovaloracion) {
		this.tipovaloracion = tipovaloracion;
	}
	
	public TipoValoracion gettipovaloracionAux() {
		return this.tipovaloracionAux;
	}

	public void settipovaloracionAux(TipoValoracion tipovaloracionAux) {
		this.tipovaloracionAux = tipovaloracionAux;
	}				
	
	public TipoValoracion gettipovaloracionAnterior() {
		return this.tipovaloracionAnterior;
	}

	public void settipovaloracionAnterior(TipoValoracion tipovaloracionAnterior) {
		this.tipovaloracionAnterior = tipovaloracionAnterior;
	}	
	
	public TipoValoracion gettipovaloracionTotales() {
		return this.tipovaloracionTotales;
	}

	public void settipovaloracionTotales(TipoValoracion tipovaloracionTotales) {
		this.tipovaloracionTotales = tipovaloracionTotales;
	}	
	
	public TipoValoracion gettipovaloracionBean() {
		return this.tipovaloracionBean;
	}

	public void settipovaloracionBean(TipoValoracion tipovaloracionBean) {
		this.tipovaloracionBean = tipovaloracionBean;
	}	
	
	public TipoValoracionParameterReturnGeneral gettipovaloracionReturnGeneral() {
		return this.tipovaloracionReturnGeneral;
	}

	public void settipovaloracionReturnGeneral(TipoValoracionParameterReturnGeneral tipovaloracionReturnGeneral) {
		this.tipovaloracionReturnGeneral = tipovaloracionReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoValoracionLogic getTipoValoracionLogic()	{		
		return tipovaloracionLogic;
	}

	public void setTipoValoracionLogic(TipoValoracionLogic tipovaloracionLogic) {
		this.tipovaloracionLogic = tipovaloracionLogic;
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
	
	public Boolean getIsEsNuevoTipoValoracion() {
		return isEsNuevoTipoValoracion;
	}

	public void setIsEsNuevoTipoValoracion(Boolean isEsNuevoTipoValoracion) {
		this.isEsNuevoTipoValoracion = isEsNuevoTipoValoracion;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoValoracion() {
		return esParaAccionDesdeFormularioTipoValoracion;
	}
	
	public void setEsParaAccionDesdeFormularioTipoValoracion(Boolean esParaAccionDesdeFormularioTipoValoracion) {
		this.esParaAccionDesdeFormularioTipoValoracion = esParaAccionDesdeFormularioTipoValoracion;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoValoracion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoValoracionConstantesFunciones.refrescarForeignKeysDescripcionesTipoValoracion(this.tipovaloracionLogic.getTipoValoracions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoValoracionConstantesFunciones.refrescarForeignKeysDescripcionesTipoValoracion(this.tipovaloracions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipovaloracionLogic.setTipoValoracions(this.tipovaloracions);
			tipovaloracionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoValoracionParameterReturnGeneral getTipoValoracionParameterGeneral() {
		return this.tipovaloracionParameterGeneral;
	}
	
	public void setTipoValoracionParameterGeneral(TipoValoracionParameterReturnGeneral tipovaloracionParameterGeneral) {
		this.tipovaloracionParameterGeneral = tipovaloracionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoValoracion() {
		return isPermisoTodoTipoValoracion;
	}

	public void setIsPermisoTodoTipoValoracion(Boolean isPermisoTodoTipoValoracion) {
		this.isPermisoTodoTipoValoracion = isPermisoTodoTipoValoracion;
	}

	public Boolean getIsPermisoNuevoTipoValoracion() {
		return isPermisoNuevoTipoValoracion;
	}

	public void setIsPermisoNuevoTipoValoracion(Boolean isPermisoNuevoTipoValoracion) {
		this.isPermisoNuevoTipoValoracion = isPermisoNuevoTipoValoracion;
	}

	public Boolean getIsPermisoActualizarTipoValoracion() {
		return isPermisoActualizarTipoValoracion;
	}

	public void setIsPermisoActualizarTipoValoracion(Boolean isPermisoActualizarTipoValoracion) {
		this.isPermisoActualizarTipoValoracion = isPermisoActualizarTipoValoracion;
	}

	public Boolean getIsPermisoEliminarTipoValoracion() {
		return isPermisoEliminarTipoValoracion;
	}

	public void setIsPermisoEliminarTipoValoracion(Boolean isPermisoEliminarTipoValoracion) {
		this.isPermisoEliminarTipoValoracion = isPermisoEliminarTipoValoracion;
	}

	public Boolean getIsPermisoGuardarCambiosTipoValoracion() {
		return isPermisoGuardarCambiosTipoValoracion;
	}

	public void setIsPermisoGuardarCambiosTipoValoracion(Boolean isPermisoGuardarCambiosTipoValoracion) {
		this.isPermisoGuardarCambiosTipoValoracion = isPermisoGuardarCambiosTipoValoracion;
	}
	
	public Boolean getIsPermisoConsultaTipoValoracion() {
		return isPermisoConsultaTipoValoracion;
	}

	public void setIsPermisoConsultaTipoValoracion(Boolean isPermisoConsultaTipoValoracion) {
		this.isPermisoConsultaTipoValoracion = isPermisoConsultaTipoValoracion;
	}

	public Boolean getIsPermisoBusquedaTipoValoracion() {
		return isPermisoBusquedaTipoValoracion;
	}

	public void setIsPermisoBusquedaTipoValoracion(Boolean isPermisoBusquedaTipoValoracion) {
		this.isPermisoBusquedaTipoValoracion = isPermisoBusquedaTipoValoracion;
	}

	public Boolean getIsPermisoReporteTipoValoracion() {
		return isPermisoReporteTipoValoracion;
	}

	public void setIsPermisoReporteTipoValoracion(Boolean isPermisoReporteTipoValoracion) {
		this.isPermisoReporteTipoValoracion = isPermisoReporteTipoValoracion;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoValoracion() {
		return isPermisoPaginacionMedioTipoValoracion;
	}

	public void setIsPermisoPaginacionMedioTipoValoracion(Boolean isPermisoPaginacionMedioTipoValoracion) {
		this.isPermisoPaginacionMedioTipoValoracion = isPermisoPaginacionMedioTipoValoracion;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoValoracion() {
		return isPermisoPaginacionTodoTipoValoracion;
	}

	public void setIsPermisoPaginacionTodoTipoValoracion(Boolean isPermisoPaginacionTodoTipoValoracion) {
		this.isPermisoPaginacionTodoTipoValoracion = isPermisoPaginacionTodoTipoValoracion;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoValoracion() {
		return isPermisoPaginacionAltoTipoValoracion;
	}

	public void setIsPermisoPaginacionAltoTipoValoracion(Boolean isPermisoPaginacionAltoTipoValoracion) {
		this.isPermisoPaginacionAltoTipoValoracion = isPermisoPaginacionAltoTipoValoracion;
	}
	
	public Boolean getIsPermisoCopiarTipoValoracion() {
		return isPermisoCopiarTipoValoracion;
	}

	public void setIsPermisoCopiarTipoValoracion(Boolean isPermisoCopiarTipoValoracion) {
		this.isPermisoCopiarTipoValoracion = isPermisoCopiarTipoValoracion;
	}
	
	public Boolean getIsPermisoVerFormTipoValoracion() {
		return isPermisoVerFormTipoValoracion;
	}

	public void setIsPermisoVerFormTipoValoracion(Boolean isPermisoVerFormTipoValoracion) {
		this.isPermisoVerFormTipoValoracion = isPermisoVerFormTipoValoracion;
	}
	
	public Boolean getIsPermisoDuplicarTipoValoracion() {
		return isPermisoDuplicarTipoValoracion;
	}

	public void setIsPermisoDuplicarTipoValoracion(Boolean isPermisoDuplicarTipoValoracion) {
		this.isPermisoDuplicarTipoValoracion = isPermisoDuplicarTipoValoracion;
	}
	
	public Boolean getIsPermisoOrdenTipoValoracion() {
		return isPermisoOrdenTipoValoracion;
	}

	public void setIsPermisoOrdenTipoValoracion(Boolean isPermisoOrdenTipoValoracion) {
		this.isPermisoOrdenTipoValoracion = isPermisoOrdenTipoValoracion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoValoracion() {
		return isVisibilidadCeldaNuevoTipoValoracion;
	}

	public void setIsVisibilidadCeldaNuevoTipoValoracion(Boolean isVisibilidadCeldaNuevoTipoValoracion) {
		this.isVisibilidadCeldaNuevoTipoValoracion = isVisibilidadCeldaNuevoTipoValoracion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoValoracion() {
		return isVisibilidadCeldaDuplicarTipoValoracion;
	}

	public void setIsVisibilidadCeldaDuplicarTipoValoracion(Boolean isVisibilidadCeldaDuplicarTipoValoracion) {
		this.isVisibilidadCeldaDuplicarTipoValoracion = isVisibilidadCeldaDuplicarTipoValoracion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoValoracion() {
		return isVisibilidadCeldaCopiarTipoValoracion;
	}

	public void setIsVisibilidadCeldaCopiarTipoValoracion(Boolean isVisibilidadCeldaCopiarTipoValoracion) {
		this.isVisibilidadCeldaCopiarTipoValoracion = isVisibilidadCeldaCopiarTipoValoracion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoValoracion() {
		return isVisibilidadCeldaVerFormTipoValoracion;
	}

	public void setIsVisibilidadCeldaVerFormTipoValoracion(Boolean isVisibilidadCeldaVerFormTipoValoracion) {
		this.isVisibilidadCeldaVerFormTipoValoracion = isVisibilidadCeldaVerFormTipoValoracion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoValoracion() {
		return isVisibilidadCeldaOrdenTipoValoracion;
	}

	public void setIsVisibilidadCeldaOrdenTipoValoracion(Boolean isVisibilidadCeldaOrdenTipoValoracion) {
		this.isVisibilidadCeldaOrdenTipoValoracion = isVisibilidadCeldaOrdenTipoValoracion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoValoracion() {
		return isVisibilidadCeldaNuevoRelacionesTipoValoracion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoValoracion(Boolean isVisibilidadCeldaNuevoRelacionesTipoValoracion) {
		this.isVisibilidadCeldaNuevoRelacionesTipoValoracion = isVisibilidadCeldaNuevoRelacionesTipoValoracion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoValoracion() {
		return isVisibilidadCeldaModificarTipoValoracion;
	}

	public void setIsVisibilidadCeldaModificarTipoValoracion(Boolean isVisibilidadCeldaModificarTipoValoracion) {
		this.isVisibilidadCeldaModificarTipoValoracion = isVisibilidadCeldaModificarTipoValoracion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoValoracion() {
		return isVisibilidadCeldaActualizarTipoValoracion;
	}

	public void setIsVisibilidadCeldaActualizarTipoValoracion(Boolean isVisibilidadCeldaActualizarTipoValoracion) {
		this.isVisibilidadCeldaActualizarTipoValoracion = isVisibilidadCeldaActualizarTipoValoracion;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoValoracion() {
		return isVisibilidadCeldaEliminarTipoValoracion;
	}

	public void setIsVisibilidadCeldaEliminarTipoValoracion(Boolean isVisibilidadCeldaEliminarTipoValoracion) {
		this.isVisibilidadCeldaEliminarTipoValoracion = isVisibilidadCeldaEliminarTipoValoracion;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoValoracion() {
		return isVisibilidadCeldaCancelarTipoValoracion;
	}

	public void setIsVisibilidadCeldaCancelarTipoValoracion(Boolean isVisibilidadCeldaCancelarTipoValoracion) {
		this.isVisibilidadCeldaCancelarTipoValoracion = isVisibilidadCeldaCancelarTipoValoracion;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoValoracion() {
		return isVisibilidadCeldaGuardarTipoValoracion;
	}

	public void setIsVisibilidadCeldaGuardarTipoValoracion(Boolean isVisibilidadCeldaGuardarTipoValoracion) {
		this.isVisibilidadCeldaGuardarTipoValoracion = isVisibilidadCeldaGuardarTipoValoracion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoValoracion() {
		return isVisibilidadCeldaGuardarCambiosTipoValoracion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoValoracion(Boolean isVisibilidadCeldaGuardarCambiosTipoValoracion) {
		this.isVisibilidadCeldaGuardarCambiosTipoValoracion = isVisibilidadCeldaGuardarCambiosTipoValoracion;
	}
		
	public TipoValoracionSessionBean gettipovaloracionSessionBean() {
		return this.tipovaloracionSessionBean;
	}
	
	public void settipovaloracionSessionBean(TipoValoracionSessionBean tipovaloracionSessionBean) {
		this.tipovaloracionSessionBean=tipovaloracionSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoValoracion(TipoValoracion tipovaloracion)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoValoracion tipovaloracion,TipoValoracion tipovaloracionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoValoracion(tipovaloracion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipovaloracionAux.setId(tipovaloracion.getId());
		tipovaloracionAux.setVersionRow(tipovaloracion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoValoracion();
		
			int intSelectedRow = this.jTableDatosTipoValoracion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracion =(TipoValoracion) this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipovaloracion =(TipoValoracion) this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoValoracionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoValoracion(this.tipovaloracion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoValoracion(this.tipovaloracion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipovaloracionValidator.getInvalidValues(this.tipovaloracion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipovaloracionLogic.setDatosCliente(datosCliente);
			tipovaloracionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipovaloracionAux=new  TipoValoracion();
				
				tipovaloracionAux.setIsNew(true);
				tipovaloracionAux.setIsChanged(true);
				
				tipovaloracionAux.setTipoValoracionOriginal(this.tipovaloracion);
				
				tipovaloracionAux.setId(this.tipovaloracion.getId());	
				tipovaloracionAux.setVersionRow(this.tipovaloracion.getVersionRow());	
				tipovaloracionAux.setcodigo(this.tipovaloracion.getcodigo());	
				tipovaloracionAux.setnombre(this.tipovaloracion.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipovaloracionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipovaloracionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipovaloracionAux,tipovaloracionLogic.getTipoValoracions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipovaloracionAux,tipovaloracions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipovaloracionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipovaloracionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovaloracionLogic.saveTipoValoracions();//WithConnection
						//tipovaloracionLogic.getSetVersionRowTipoValoracions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipovaloracion,tipovaloracionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipovaloracionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipovaloracionAux=new  TipoValoracion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipovaloracionSessionBean.getEsGuardarRelacionado() 
					|| (this.tipovaloracionSessionBean.getEsGuardarRelacionado() && this.tipovaloracion.getId()>=0)) {
						
					tipovaloracionAux.setIsNew(false);
				}
				
				tipovaloracionAux.setIsDeleted(false);
			
				tipovaloracionAux.setId(this.tipovaloracion.getId());	
				tipovaloracionAux.setVersionRow(this.tipovaloracion.getVersionRow());	
				tipovaloracionAux.setcodigo(this.tipovaloracion.getcodigo());	
				tipovaloracionAux.setnombre(this.tipovaloracion.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipovaloracionAux,tipovaloracionLogic.getTipoValoracions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipovaloracionAux,tipovaloracions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipovaloracionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipovaloracionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovaloracionLogic.saveTipoValoracions();//WithConnection
						//tipovaloracionLogic.getSetVersionRowTipoValoracions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipovaloracion,tipovaloracionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipovaloracionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipovaloracionAux=new  TipoValoracion();
				
				tipovaloracionAux.setIsNew(false);
				tipovaloracionAux.setIsChanged(false);
				
				tipovaloracionAux.setIsDeleted(true);
				
				tipovaloracionAux.setId(this.tipovaloracion.getId());	
				tipovaloracionAux.setVersionRow(this.tipovaloracion.getVersionRow());	
				tipovaloracionAux.setcodigo(this.tipovaloracion.getcodigo());	
				tipovaloracionAux.setnombre(this.tipovaloracion.getnombre());	
				
				if(this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipovaloracionAux.getId()>=0) {	
						this.tipovaloracionsEliminados.add(tipovaloracionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipovaloracionAux,tipovaloracionLogic.getTipoValoracions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipovaloracionAux,tipovaloracions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipovaloracionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipovaloracionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovaloracionLogic.saveTipoValoracions();//WithConnection
						//tipovaloracionLogic.getSetVersionRowTipoValoracions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipovaloracionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipovaloracionAux.setReferenciaBancarias(this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias());

							if(this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame.quitarFilaTotales();}
							tipovaloracionAux.setLunaSistemaSolars(this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame.lunasistemasolarLogic.getLunaSistemaSolars());

							if(this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame.quitarFilaTotales();}
							tipovaloracionAux.setPlanetaSistemaSolars(this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame.planetasistemasolarLogic.getPlanetaSistemaSolars());

							if(this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame.quitarFilaTotales();}
							tipovaloracionAux.setReferenciaComercials(this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame.referenciacomercialLogic.getReferenciaComercials());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipovaloracionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipovaloracionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipovaloracionAux,tipovaloracionLogic.getTipoValoracions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipovaloracionAux,tipovaloracions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.getTipoValoracions().addAll(this.tipovaloracionsEliminados);
					
					tipovaloracionLogic.saveTipoValoracions();//WithConnection
					//tipovaloracionLogic.getSetVersionRowTipoValoracions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipovaloracionsEliminados= new ArrayList<TipoValoracion>();		
			}
			
			if(this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Valoracion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Valoracion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipovaloracion=tipovaloracionAux;
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
      		//this.finishProcessTipoValoracion();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoValoracion tipovaloracionLocal) throws Exception {
		
		if(this.tipovaloracionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipovaloracionLocal.setReferenciaBancarias(this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias());
				tipovaloracionLocal.setLunaSistemaSolars(this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame.lunasistemasolarLogic.getLunaSistemaSolars());
				tipovaloracionLocal.setPlanetaSistemaSolars(this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame.planetasistemasolarLogic.getPlanetaSistemaSolars());
				tipovaloracionLocal.setReferenciaComercials(this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame.referenciacomercialLogic.getReferenciaComercials());
			
			} else {
			
				tipovaloracionLocal.setReferenciaBancarias(this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame.referenciabancarias);
				tipovaloracionLocal.setLunaSistemaSolars(this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame.lunasistemasolars);
				tipovaloracionLocal.setPlanetaSistemaSolars(this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame.planetasistemasolars);
				tipovaloracionLocal.setReferenciaComercials(this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame.referenciacomercials);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoValoracion tipovaloracionLocal) throws Exception {	
		if(this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoValoracionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoValoracion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipovaloracion =(TipoValoracion) this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipovaloracion =(TipoValoracion) this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipovaloracionValidator.getInvalidValues(this.tipovaloracion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoValoracion tipovaloracion,List<TipoValoracion> tipovaloracions) throws Exception {
		try	{		
			TipoValoracionConstantesFunciones.actualizarLista(tipovaloracion,tipovaloracions,this.tipovaloracionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoValoracion tipovaloracion,List<TipoValoracion> tipovaloracions) throws Exception {
		try	{			
			TipoValoracionConstantesFunciones.actualizarSelectedLista(tipovaloracion,tipovaloracions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoValoracion> tipovaloracionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipovaloracionsLocal=this.tipovaloracionLogic.getTipoValoracions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipovaloracionsLocal=this.tipovaloracions;
			}
			//ARCHITECTURE
		
			for(TipoValoracion tipovaloracionLocal:tipovaloracionsLocal) {
				if(this.permiteMantenimiento(tipovaloracionLocal) && tipovaloracionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoValoracionConstantesFunciones.getTipoValoracionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoValoracionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoValoracion.jLabelcodigoTipoValoracion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoValoracionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoValoracion.jLabelnombreTipoValoracion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoValoracion.jLabelcodigoTipoValoracion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoValoracion.jLabelnombreTipoValoracion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ReferenciaBancaria")) {
			if(this.tipovaloracion==null) {
				this.tipovaloracion= new TipoValoracion();
			}

			if(this.tipovaloracionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoValoracion
				this.setVariablesFormularioToObjetoActualTipoValoracion(this.tipovaloracion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoValoracion(this.tipovaloracion);

				this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame.getreferenciabancaria().setTipoValoracion(this.tipovaloracion);
			}

			return;
		}
		 else  if(sTipo.equals("LunaSistemaSolar")) {
			if(this.tipovaloracion==null) {
				this.tipovaloracion= new TipoValoracion();
			}

			if(this.tipovaloracionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoValoracion
				this.setVariablesFormularioToObjetoActualTipoValoracion(this.tipovaloracion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoValoracion(this.tipovaloracion);

				this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame.getlunasistemasolar().setTipoValoracion(this.tipovaloracion);
			}

			return;
		}
		 else  if(sTipo.equals("PlanetaSistemaSolar")) {
			if(this.tipovaloracion==null) {
				this.tipovaloracion= new TipoValoracion();
			}

			if(this.tipovaloracionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoValoracion
				this.setVariablesFormularioToObjetoActualTipoValoracion(this.tipovaloracion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoValoracion(this.tipovaloracion);

				this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame.getplanetasistemasolar().setTipoValoracion(this.tipovaloracion);
			}

			return;
		}
		 else  if(sTipo.equals("ReferenciaComercial")) {
			if(this.tipovaloracion==null) {
				this.tipovaloracion= new TipoValoracion();
			}

			if(this.tipovaloracionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoValoracion
				this.setVariablesFormularioToObjetoActualTipoValoracion(this.tipovaloracion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoValoracion(this.tipovaloracion);

				this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame.getreferenciacomercial().setTipoValoracion(this.tipovaloracion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoValoracion--;	
		
		
		this.tipovaloracionAux=new TipoValoracion();
		
		this.tipovaloracionAux.setId(this.iIdNuevoTipoValoracion);
		this.tipovaloracionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipovaloracionLogic.getTipoValoracions().add(this.tipovaloracionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipovaloracions.add(this.tipovaloracionAux);
		}
		//ARCHITECTURE
		
		this.tipovaloracion=this.tipovaloracionAux;
		
		if(TipoValoracionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoValoracion(this.tipovaloracion);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoValoracion(this.tipovaloracion);
		}
				
		//this.setDefaultControlesTipoValoracion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoValoracion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoValoracion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoValoracion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoValoracion(this.tipovaloracionBean,this.tipovaloracion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoValoracion(this.tipovaloracion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoValoracionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipovaloracionSessionBean.getConGuardarRelaciones()) {
			classes=TipoValoracionConstantesFunciones.getClassesRelationshipsOfTipoValoracion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipovaloracionReturnGeneral=tipovaloracionLogic.procesarEventosTipoValoracionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipovaloracionLogic.getTipoValoracions(),this.tipovaloracion,this.tipovaloracionParameterGeneral,this.isEsNuevoTipoValoracion,classes);//this.tipovaloracionLogic.getTipoValoracion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoValoracion(this.tipovaloracionReturnGeneral,this.tipovaloracionBean,false);
		
		if(this.tipovaloracionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoValoracion(this.tipovaloracionReturnGeneral.getTipoValoracion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoValoracion(this.tipovaloracionReturnGeneral.getTipoValoracion());
		}
		
		if(this.tipovaloracionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoValoracion(this.tipovaloracionReturnGeneral.getTipoValoracion(),classes);//this.tipovaloracionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoValoracion(this.tipovaloracion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoValoracion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoValoracion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoValoracion(false);
						
			if(tipovaloracionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.getEsGuardarRelacionado() && ReferenciaBancariaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonReferenciaBancariaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame.lunasistemasolarSessionBean.getEsGuardarRelacionado() && LunaSistemaSolarJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonLunaSistemaSolarActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame.planetasistemasolarSessionBean.getEsGuardarRelacionado() && PlanetaSistemaSolarJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPlanetaSistemaSolarActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame.referenciacomercialSessionBean.getEsGuardarRelacionado() && ReferenciaComercialJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonReferenciaComercialActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoValoracionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoValoracion();
			}
			
			this.actualizarVisualTableDatosTipoValoracion();
			
			this.jTableDatosTipoValoracion.setRowSelectionInterval(this.getIndiceNuevoTipoValoracion(), this.getIndiceNuevoTipoValoracion());
			
			this.seleccionarFilaTablaTipoValoracionActual();
						
			this.actualizarEstadoCeldasBotonesTipoValoracion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoValoracion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoValoracion.jTextFieldcodigoTipoValoracion.setEnabled(isHabilitar && this.tipovaloracionConstantesFunciones.activarcodigoTipoValoracion);
		this.jInternalFrameDetalleFormTipoValoracion.jTextAreanombreTipoValoracion.setEnabled(isHabilitar && this.tipovaloracionConstantesFunciones.activarnombreTipoValoracion);	
		
	};
	
	public void setDefaultControlesTipoValoracion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoValoracion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipovaloracionSessionBean.setConGuardarRelaciones(true);			
			this.tipovaloracionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoValoracion.jTabbedPaneRelacionesTipoValoracion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame.lunasistemasolarSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame.planetasistemasolarSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame.referenciacomercialSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipovaloracionSessionBean.setConGuardarRelaciones(false);			
			this.tipovaloracionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoValoracion.jTabbedPaneRelacionesTipoValoracion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame.lunasistemasolarSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame.planetasistemasolarSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame.referenciacomercialSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoValoracion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoValoracion tipovaloracionAux:this.tipovaloracionLogic.getTipoValoracions()) {
				if(tipovaloracionAux.getId().equals(this.iIdNuevoTipoValoracion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoValoracion tipovaloracionAux:this.tipovaloracions) {
				if(tipovaloracionAux.getId().equals(this.iIdNuevoTipoValoracion)) {
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
	
	public int getIndiceActualTipoValoracion(TipoValoracion tipovaloracion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoValoracion tipovaloracionAux:this.tipovaloracionLogic.getTipoValoracions()) {
				if(tipovaloracionAux.getId().equals(tipovaloracion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoValoracion tipovaloracionAux:this.tipovaloracions) {
				if(tipovaloracionAux.getId().equals(tipovaloracion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoValoracion(TipoValoracion tipovaloracionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoValoracion tipovaloracionAux:this.tipovaloracionLogic.getTipoValoracions()) {
				if(tipovaloracionAux.getTipoValoracionOriginal().getId().equals(tipovaloracionOriginal.getId())) {
					existe=true;
					tipovaloracionOriginal.setId(tipovaloracionAux.getId());
					tipovaloracionOriginal.setVersionRow(tipovaloracionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoValoracion tipovaloracionAux:this.tipovaloracions) {
				if(tipovaloracionAux.getTipoValoracionOriginal().getId().equals(tipovaloracionOriginal.getId())) {
					existe=true;
					tipovaloracionOriginal.setId(tipovaloracionAux.getId());
					tipovaloracionOriginal.setVersionRow(tipovaloracionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoValoracion(Boolean esParaCancelar) throws Exception {
		tipovaloracionsAux=new ArrayList<TipoValoracion>();
		tipovaloracionAux=new TipoValoracion();
		
		if(!this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoValoracion tipovaloracionAux:this.tipovaloracionLogic.getTipoValoracions()) {
					if(tipovaloracionAux.getId()<0) {
						tipovaloracionsAux.add(tipovaloracionAux);
					}		
				}
				this.iIdNuevoTipoValoracion=0L;
				this.tipovaloracionLogic.getTipoValoracions().removeAll(tipovaloracionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoValoracion tipovaloracionAux:this.tipovaloracions) {
					if(tipovaloracionAux.getId()<0) {
						tipovaloracionsAux.add(tipovaloracionAux);
					}		
				}
				this.iIdNuevoTipoValoracion=0L;
				this.tipovaloracions.removeAll(tipovaloracionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoValoracion 
					&& this.tipovaloracionLogic.getTipoValoracions().size()>0
					) {
					tipovaloracionAux=this.tipovaloracionLogic.getTipoValoracions().get(this.tipovaloracionLogic.getTipoValoracions().size() - 1);
				
					if(tipovaloracionAux.getId()<0) {
						this.tipovaloracionLogic.getTipoValoracions().remove(tipovaloracionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoValoracion && this.tipovaloracions.size()>0) {
					tipovaloracionAux=this.tipovaloracions.get(this.tipovaloracions.size() - 1);
				
					if(tipovaloracionAux.getId()<0) {
						this.tipovaloracions.remove(tipovaloracionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoValoracion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipovaloracion.getId()<0) {
				this.tipovaloracionLogic.getTipoValoracions().remove(this.tipovaloracion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipovaloracion.getId()<0) {
				this.tipovaloracions.remove(this.tipovaloracion);
			}
		}			
	}
	
	public void setEstadosInicialesTipoValoracion(List<TipoValoracion> tipovaloracionsAux) throws Exception {
		TipoValoracionConstantesFunciones.setEstadosInicialesTipoValoracion(tipovaloracionsAux);
	}
	
	public void setEstadosInicialesTipoValoracion(TipoValoracion tipovaloracionAux) throws Exception {
		TipoValoracionConstantesFunciones.setEstadosInicialesTipoValoracion(tipovaloracionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoValoracionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoValoracion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoValoracionActual()) {
				if(!this.isEsNuevoTipoValoracion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoValoracion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoValoracion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoValoracionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Valoracion ?", "MANTENIMIENTO DE Tipo Valoracion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoValoracion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoValoracion tipovaloracion) throws Exception {
		TipoValoracionConstantesFunciones.seleccionarAsignar(this.tipovaloracion,tipovaloracion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoValoracion=this.isPermisoActualizarOriginalTipoValoracion;
			
			
			this.seleccionarAsignar(tipovaloracion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoValoracionConstantesFunciones.quitarEspaciosTipoValoracion(this.tipovaloracion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoValoracion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipovaloracionSessionBean.setsFuncionBusquedaRapida(this.tipovaloracionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoValoracion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoValoracion(esParaCancelar);				
				this.cancelarNuevoTipoValoracion(esParaCancelar);								
			}
			
			this.tipovaloracion=new TipoValoracion();
			
			this.inicializarTipoValoracion();
			
			this.actualizarEstadoCeldasBotonesTipoValoracion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoValoracion() throws Exception {
		try {
			TipoValoracionConstantesFunciones.inicializarTipoValoracion(this.tipovaloracion);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipovaloracionLogic.getTipoValoracions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoValoracions(String sAccionBusqueda,List<TipoValoracion> tipovaloracionsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoValoracion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoValoracionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoValoracionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoValoracion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Valoracions");		
		parameters.put("busquedapor", TipoValoracionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ReferenciaBancaria.class));
			classes.add(new Classe(LunaSistemaSolar.class));
			classes.add(new Classe(PlanetaSistemaSolar.class));
			classes.add(new Classe(ReferenciaComercial.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoValoracionLogic tipovaloracionLogicAuxiliar=new TipoValoracionLogic();
					tipovaloracionLogicAuxiliar.setDatosCliente(tipovaloracionLogic.getDatosCliente());				
					tipovaloracionLogicAuxiliar.setTipoValoracions(tipovaloracionsParaReportes);
					
					tipovaloracionLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoValoracionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipovaloracionsParaReportes=tipovaloracionLogicAuxiliar.getTipoValoracions();
					
					//tipovaloracionLogic.getNewConnexionToDeep();
					
					//for (TipoValoracion tipovaloracion:tipovaloracionsParaReportes) {
					//	tipovaloracionLogic.deepLoad(tipovaloracion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipovaloracionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipovaloracionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileReferenciaBancaria = AuxiliarReportes.class.getResourceAsStream("ReferenciaBancariaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_referenciabancaria", reportFileReferenciaBancaria);

			InputStream reportFileLunaSistemaSolar = AuxiliarReportes.class.getResourceAsStream("LunaSistemaSolarDetalleRelacionesDesign.jasper");
			parameters.put("subreport_lunasistemasolar", reportFileLunaSistemaSolar);

			InputStream reportFilePlanetaSistemaSolar = AuxiliarReportes.class.getResourceAsStream("PlanetaSistemaSolarDetalleRelacionesDesign.jasper");
			parameters.put("subreport_planetasistemasolar", reportFilePlanetaSistemaSolar);

			InputStream reportFileReferenciaComercial = AuxiliarReportes.class.getResourceAsStream("ReferenciaComercialDetalleRelacionesDesign.jasper");
			parameters.put("subreport_referenciacomercial", reportFileReferenciaComercial);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoValoracion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoValoracionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoValoracionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoValoracion=new JRBeanArrayDataSource(TipoValoracionJInternalFrame.TraerTipoValoracionBeans(tipovaloracionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoValoracion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoValoracionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoValoracionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoValoracionBean.TraerTipoValoracionBeans(tipovaloracionsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoValoracions(sAccionBusqueda,sTipoArchivoReporte,tipovaloracionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoValoracions(sAccionBusqueda,sTipoArchivoReporte,tipovaloracionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoValoracionActionPerformed(null);
					//this.generarExcelReporteTipoValoracions(sAccionBusqueda,sTipoArchivoReporte,tipovaloracionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoValoracions(sAccionBusqueda,sTipoArchivoReporte,tipovaloracionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoValoracions(sAccionBusqueda,sTipoArchivoReporte,tipovaloracionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoValoracions(sAccionBusqueda,sTipoArchivoReporte,tipovaloracionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoValoracions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoValoracion> tipovaloracionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovaloracion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoValoracions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoValoracion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoValoracion tipovaloracion : tipovaloracionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoValoracionConstantesFunciones.generarExcelReporteDataTipoValoracion("NORMAL",row,workbook,tipovaloracion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Valoracion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoValoracion(String sTipo,Row row,Workbook workbook) {
		
		TipoValoracionConstantesFunciones.generarExcelReporteHeaderTipoValoracion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoValoracions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoValoracion> tipovaloracionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovaloracion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoValoracions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoValoracion tipovaloracion : tipovaloracionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoValoracionConstantesFunciones.getTipoValoracionDescripcion(tipovaloracion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoValoracionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoValoracionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipovaloracion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoValoracionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoValoracionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipovaloracion.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Valoracion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoValoracions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoValoracion> tipovaloracionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoValoracion> tipovaloracionsRespaldo=null;
		
		classes=TipoValoracionConstantesFunciones.getClassesRelationshipsOfTipoValoracion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipovaloracionLogic.setDatosCliente(this.datosCliente);
		this.tipovaloracionLogic.setDatosDeep(this.datosDeep);
		this.tipovaloracionLogic.setIsConDeep(true);
		
		tipovaloracionsRespaldo=this.tipovaloracionLogic.getTipoValoracions();
		
		this.tipovaloracionLogic.setTipoValoracions(tipovaloracionsParaReportes);	
		this.tipovaloracionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipovaloracionsParaReportes=this.tipovaloracionLogic.getTipoValoracions();
		this.tipovaloracionLogic.setTipoValoracions(tipovaloracionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovaloracion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoValoracions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoValoracion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoValoracion tipovaloracion : tipovaloracionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoValoracion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoValoracionConstantesFunciones.generarExcelReporteDataTipoValoracion("NORMAL",row,workbook,tipovaloracion,cellStyleDataAux);
		
			
			


				//ReferenciaBancaria
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipovaloracion.getReferenciaBancarias()!=null && tipovaloracion.getReferenciaBancarias().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ReferenciaBancariaConstantesFunciones.generarExcelReporteHeaderReferenciaBancaria("RELACIONADO",row,workbook);
				}

				if(tipovaloracion.getReferenciaBancarias()!=null) {
					i2=0;
					for(ReferenciaBancaria referenciabancaria : tipovaloracion.getReferenciaBancarias()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ReferenciaBancariaConstantesFunciones.generarExcelReporteDataReferenciaBancaria("RELACIONADO",row,workbook,referenciabancaria,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//LunaSistemaSolar
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipovaloracion.getLunaSistemaSolars()!=null && tipovaloracion.getLunaSistemaSolars().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					LunaSistemaSolarConstantesFunciones.generarExcelReporteHeaderLunaSistemaSolar("RELACIONADO",row,workbook);
				}

				if(tipovaloracion.getLunaSistemaSolars()!=null) {
					i2=0;
					for(LunaSistemaSolar lunasistemasolar : tipovaloracion.getLunaSistemaSolars()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						LunaSistemaSolarConstantesFunciones.generarExcelReporteDataLunaSistemaSolar("RELACIONADO",row,workbook,lunasistemasolar,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//PlanetaSistemaSolar
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipovaloracion.getPlanetaSistemaSolars()!=null && tipovaloracion.getPlanetaSistemaSolars().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PlanetaSistemaSolarConstantesFunciones.generarExcelReporteHeaderPlanetaSistemaSolar("RELACIONADO",row,workbook);
				}

				if(tipovaloracion.getPlanetaSistemaSolars()!=null) {
					i2=0;
					for(PlanetaSistemaSolar planetasistemasolar : tipovaloracion.getPlanetaSistemaSolars()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PlanetaSistemaSolarConstantesFunciones.generarExcelReporteDataPlanetaSistemaSolar("RELACIONADO",row,workbook,planetasistemasolar,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ReferenciaComercial
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipovaloracion.getReferenciaComercials()!=null && tipovaloracion.getReferenciaComercials().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ReferenciaComercialConstantesFunciones.generarExcelReporteHeaderReferenciaComercial("RELACIONADO",row,workbook);
				}

				if(tipovaloracion.getReferenciaComercials()!=null) {
					i2=0;
					for(ReferenciaComercial referenciacomercial : tipovaloracion.getReferenciaComercials()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ReferenciaComercialConstantesFunciones.generarExcelReporteDataReferenciaComercial("RELACIONADO",row,workbook,referenciacomercial,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoValoracionConstantesFunciones.getTipoValoracionDescripcion(tipovaloracion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Valoracion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoValoracion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoValoracion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoValoracion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoValoracion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoValoracion() throws Exception {		
		this.startProcessTipoValoracion(true);
	}
	
	public void startProcessTipoValoracion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoValoracion, this.jScrollPanelDatosTipoValoracion,this.jPanelPaginacionTipoValoracion, this.jScrollPanelDatosEdicionTipoValoracion, this.jPanelAccionesTipoValoracion,this.jPanelAccionesFormularioTipoValoracion,this.jmenuBarTipoValoracion,this.jmenuBarDetalleTipoValoracion,this.jTtoolBarTipoValoracion,this.jTtoolBarDetalleTipoValoracion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoValoracion=null; 
		
		final JPanel jPanelParametrosReportesTipoValoracion=this.jPanelParametrosReportesTipoValoracion;
		//final JScrollPane jScrollPanelDatosTipoValoracion=this.jScrollPanelDatosTipoValoracion;
		final JTable jTableDatosTipoValoracion=this.jTableDatosTipoValoracion;		
		final JPanel jPanelPaginacionTipoValoracion=this.jPanelPaginacionTipoValoracion;
		//final JScrollPane jScrollPanelDatosEdicionTipoValoracion=this.jScrollPanelDatosEdicionTipoValoracion;
		final JPanel jPanelAccionesTipoValoracion=this.jPanelAccionesTipoValoracion;
		
		JPanel jPanelCamposAuxiliarTipoValoracion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoValoracion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) {
			jPanelCamposAuxiliarTipoValoracion=this.jInternalFrameDetalleFormTipoValoracion.jPanelCamposTipoValoracion;
			jPanelAccionesFormularioAuxiliarTipoValoracion=this.jInternalFrameDetalleFormTipoValoracion.jPanelAccionesFormularioTipoValoracion;
		}
		
		final JPanel jPanelCamposTipoValoracion=jPanelCamposAuxiliarTipoValoracion;
		final JPanel jPanelAccionesFormularioTipoValoracion=jPanelAccionesFormularioAuxiliarTipoValoracion;
		
		
		final JMenuBar jmenuBarTipoValoracion=this.jmenuBarTipoValoracion;
		final JToolBar jTtoolBarTipoValoracion=this.jTtoolBarTipoValoracion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoValoracion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoValoracion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) {
			jmenuBarDetalleAuxiliarTipoValoracion=this.jInternalFrameDetalleFormTipoValoracion.jmenuBarDetalleTipoValoracion;
			jTtoolBarDetalleAuxiliarTipoValoracion=this.jInternalFrameDetalleFormTipoValoracion.jTtoolBarDetalleTipoValoracion;
		}
		
		final JMenuBar jmenuBarDetalleTipoValoracion=jmenuBarDetalleAuxiliarTipoValoracion;
		final JToolBar jTtoolBarDetalleTipoValoracion=jTtoolBarDetalleAuxiliarTipoValoracion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoValoracion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoValoracion;
			processRunnable.jTableDatos=jTableDatosTipoValoracion;
			processRunnable.jPanelCampos=jPanelCamposTipoValoracion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoValoracion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoValoracion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoValoracion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoValoracion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoValoracion;
			processRunnable.jTtoolBar=jTtoolBarTipoValoracion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoValoracion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoValoracion ,jPanelParametrosReportesTipoValoracion,jTableDatosTipoValoracion, /*jScrollPanelDatosTipoValoracion,*/jPanelCamposTipoValoracion,jPanelPaginacionTipoValoracion, /*jScrollPanelDatosEdicionTipoValoracion,*/ jPanelAccionesTipoValoracion,jPanelAccionesFormularioTipoValoracion,jmenuBarTipoValoracion,jmenuBarDetalleTipoValoracion,jTtoolBarTipoValoracion,jTtoolBarDetalleTipoValoracion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoValoracion, jScrollPanelDatosTipoValoracion,jPanelPaginacionTipoValoracion, jScrollPanelDatosEdicionTipoValoracion, jPanelAccionesTipoValoracion,jPanelAccionesFormularioTipoValoracion,jmenuBarTipoValoracion,jmenuBarDetalleTipoValoracion,jTtoolBarTipoValoracion,jTtoolBarDetalleTipoValoracion);
						
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
	
	public void finishProcessTipoValoracion() {// throws Exception 
		this.finishProcessTipoValoracion(true);
	}
	
	public void finishProcessTipoValoracion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoValoracion, this.jScrollPanelDatosTipoValoracion,this.jPanelPaginacionTipoValoracion, this.jScrollPanelDatosEdicionTipoValoracion, this.jPanelAccionesTipoValoracion,this.jPanelAccionesFormularioTipoValoracion,this.jmenuBarTipoValoracion,this.jmenuBarDetalleTipoValoracion,this.jTtoolBarTipoValoracion,this.jTtoolBarDetalleTipoValoracion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoValoracion=null; 
		
		final JPanel jPanelParametrosReportesTipoValoracion=this.jPanelParametrosReportesTipoValoracion;
		//final JScrollPane jScrollPanelDatosTipoValoracion=this.jScrollPanelDatosTipoValoracion;
		final JTable jTableDatosTipoValoracion=this.jTableDatosTipoValoracion;		
		final JPanel jPanelPaginacionTipoValoracion=this.jPanelPaginacionTipoValoracion;
		//final JScrollPane jScrollPanelDatosEdicionTipoValoracion=this.jScrollPanelDatosEdicionTipoValoracion;
		final JPanel jPanelAccionesTipoValoracion=this.jPanelAccionesTipoValoracion;
		
		JPanel jPanelCamposAuxiliarTipoValoracion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoValoracion=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) {
			jPanelCamposAuxiliarTipoValoracion=this.jInternalFrameDetalleFormTipoValoracion.jPanelCamposTipoValoracion;
			jPanelAccionesFormularioAuxiliarTipoValoracion=this.jInternalFrameDetalleFormTipoValoracion.jPanelAccionesFormularioTipoValoracion;
		}
		
		final JPanel jPanelCamposTipoValoracion=jPanelCamposAuxiliarTipoValoracion;
		final JPanel jPanelAccionesFormularioTipoValoracion=jPanelAccionesFormularioAuxiliarTipoValoracion;
		
		
		final JMenuBar jmenuBarTipoValoracion=this.jmenuBarTipoValoracion;		
		final JToolBar jTtoolBarTipoValoracion=this.jTtoolBarTipoValoracion;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoValoracion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoValoracion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) {
			jmenuBarDetalleAuxiliarTipoValoracion=this.jInternalFrameDetalleFormTipoValoracion.jmenuBarDetalleTipoValoracion;
			jTtoolBarDetalleAuxiliarTipoValoracion=this.jInternalFrameDetalleFormTipoValoracion.jTtoolBarDetalleTipoValoracion;		
		}
		
		final JMenuBar jmenuBarDetalleTipoValoracion=jmenuBarDetalleAuxiliarTipoValoracion;
		final JToolBar jTtoolBarDetalleTipoValoracion=jTtoolBarDetalleAuxiliarTipoValoracion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoValoracion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoValoracion;
			processRunnable.jTableDatos=jTableDatosTipoValoracion;
			processRunnable.jPanelCampos=jPanelCamposTipoValoracion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoValoracion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoValoracion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoValoracion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoValoracion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoValoracion;
			processRunnable.jTtoolBar=jTtoolBarTipoValoracion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoValoracion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoValoracion ,jPanelParametrosReportesTipoValoracion, jTableDatosTipoValoracion,/*jScrollPanelDatosTipoValoracion,*/jPanelCamposTipoValoracion,jPanelPaginacionTipoValoracion, /*jScrollPanelDatosEdicionTipoValoracion,*/ jPanelAccionesTipoValoracion,jPanelAccionesFormularioTipoValoracion,jmenuBarTipoValoracion,jmenuBarDetalleTipoValoracion,jTtoolBarTipoValoracion,jTtoolBarDetalleTipoValoracion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoValoracion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoValoracion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoValoracion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoValoracion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoValoracion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoValoracion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoValoracion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoValoracion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoValoracion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipovaloracionConstantesFunciones.getsFinalQueryTipoValoracion();
		String  finalQueryPaginacionTodos=this.tipovaloracionConstantesFunciones.getsFinalQueryTipoValoracion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoValoracionConstantesFunciones.getArrayColumnasGlobalesNoTipoValoracion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoValoracionConstantesFunciones.getArrayColumnasGlobalesTipoValoracion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoValoracionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipovaloracionsEliminados= new ArrayList<TipoValoracion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoValoracion();
		
				///*TipoValoracionSessionBean*/this.tipovaloracionSessionBean=new TipoValoracionSessionBean();
			
			if(this.tipovaloracionSessionBean==null) {
				this.tipovaloracionSessionBean=new TipoValoracionSessionBean();
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
					this.iNumeroPaginacion=TipoValoracionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoValoracionConstantesFunciones.getClassesForeignKeysOfTipoValoracion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipovaloracion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipovaloracionsAux= new ArrayList<TipoValoracion>();
			
				
			tipovaloracionLogic.setDatosCliente(this.datosCliente);
			tipovaloracionLogic.setDatosDeep(this.datosDeep);
			tipovaloracionLogic.setIsConDeep(true);
			
			
			tipovaloracionLogic.getTipoValoracionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipovaloracionLogic.getTodosTipoValoracions(finalQueryGlobal,pagination);
					
					//tipovaloracionLogic.getTodosTipoValoracionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipovaloracionLogic.getTipoValoracions()==null|| tipovaloracionLogic.getTipoValoracions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipovaloracionsAux= new ArrayList<TipoValoracion>();
							tipovaloracionsAux.addAll(tipovaloracionLogic.getTipoValoracions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipovaloracionsAux= new ArrayList<TipoValoracion>();
							tipovaloracionsAux.addAll(tipovaloracions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipovaloracionLogic.getTodosTipoValoracions(finalQueryGlobal+"",this.pagination);												
							
							//tipovaloracionLogic.getTodosTipoValoracionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoValoracions("Todos",tipovaloracionLogic.getTipoValoracions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipovaloracionLogic.setTipoValoracions(new ArrayList<TipoValoracion>());					
							tipovaloracionLogic.getTipoValoracions().addAll(tipovaloracionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipovaloracions=new ArrayList<TipoValoracion>();
							tipovaloracions.addAll(tipovaloracionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoValoracion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoValoracion=this.idActual;
				
				} else if(this.idTipoValoracionActual!=null && this.idTipoValoracionActual!=0L) {
					idTipoValoracion=idTipoValoracionActual;
				}
				
					
				this.sDetalleReporte=TipoValoracionConstantesFunciones.getDetalleIndicePorId(idTipoValoracion);
				
				this.tipovaloracions=new ArrayList<TipoValoracion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipovaloracionLogic.getEntity(idTipoValoracion);
					
					//tipovaloracionLogic.getEntityWithConnection(idTipoValoracion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipovaloracionLogic.setTipoValoracions(new ArrayList<TipoValoracion>());
					tipovaloracionLogic.getTipoValoracions().add(tipovaloracionLogic.getTipoValoracion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipovaloracions=new ArrayList<TipoValoracion>();
					this.tipovaloracions.add(tipovaloracion);
				}
				
				if(tipovaloracionLogic.getTipoValoracion()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoValoracion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoValoracion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipovaloracionLogic.getTipoValoracions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipovaloracions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipovaloracionLogic.getTipoValoracions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipovaloracions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoValoracion tipovaloracion) {
		Boolean permite=true;
		
		if(this.tipovaloracion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoValoracionConstantesFunciones.getOrderByListaTipoValoracion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoValoracionConstantesFunciones.getOrderByListaTipoValoracion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoValoracion tipovaloracion:tipovaloracionLogic.getTipoValoracions()) {
				if(tipovaloracion.getsType().equals(Constantes2.S_TOTALES)) {
					tipovaloracionTotales=tipovaloracion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoValoracion tipovaloracion:this.tipovaloracions) {
				if(tipovaloracion.getsType().equals(Constantes2.S_TOTALES)) {
					tipovaloracionTotales=tipovaloracion;
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
			this.tipovaloracionAux=new TipoValoracion();
			this.tipovaloracionAux.setsType(Constantes2.S_TOTALES);
			this.tipovaloracionAux.setIsNew(false);
			this.tipovaloracionAux.setIsChanged(false);
			this.tipovaloracionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoValoracionConstantesFunciones.TotalizarValoresFilaTipoValoracion(this.tipovaloracionLogic.getTipoValoracions(),this.tipovaloracionAux);
				
				this.tipovaloracionLogic.getTipoValoracions().add(this.tipovaloracionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoValoracionConstantesFunciones.TotalizarValoresFilaTipoValoracion(this.tipovaloracions,this.tipovaloracionAux);
				
				this.tipovaloracions.add(this.tipovaloracionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipovaloracionTotales=new TipoValoracion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipovaloracionLogic.getTipoValoracions().remove(tipovaloracionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipovaloracions.remove(tipovaloracionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipovaloracionTotales=new TipoValoracion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoValoracion tipovaloracion:tipovaloracionLogic.getTipoValoracions()) {
				if(tipovaloracion.getsType().equals(Constantes2.S_TOTALES)) {
					tipovaloracionTotales=tipovaloracion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoValoracionConstantesFunciones.TotalizarValoresFilaTipoValoracion(this.tipovaloracionLogic.getTipoValoracions(),tipovaloracionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoValoracion tipovaloracion:this.tipovaloracions) {
				if(tipovaloracion.getsType().equals(Constantes2.S_TOTALES)) {
					tipovaloracionTotales=tipovaloracion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoValoracionConstantesFunciones.TotalizarValoresFilaTipoValoracion(this.tipovaloracions,tipovaloracionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoValoracion() {
		this.isPermisoTodoTipoValoracion=false;
		this.isPermisoNuevoTipoValoracion=false;
		this.isPermisoActualizarTipoValoracion=false;
		this.isPermisoActualizarOriginalTipoValoracion=false;
		this.isPermisoEliminarTipoValoracion=false;
		this.isPermisoGuardarCambiosTipoValoracion=false;
		this.isPermisoConsultaTipoValoracion=false;
		this.isPermisoBusquedaTipoValoracion=false;
		this.isPermisoReporteTipoValoracion=false;		
		this.isPermisoOrdenTipoValoracion=false;		
		this.isPermisoPaginacionMedioTipoValoracion=false;		
		this.isPermisoPaginacionAltoTipoValoracion=false;
		this.isPermisoPaginacionTodoTipoValoracion=false;
		this.isPermisoCopiarTipoValoracion=false;		
		this.isPermisoVerFormTipoValoracion=false;		
		this.isPermisoDuplicarTipoValoracion=false;		
		this.isPermisoOrdenTipoValoracion=false;		
	}
	
	public void setPermisosUsuarioTipoValoracion(Boolean isPermiso) {
		this.isPermisoTodoTipoValoracion=isPermiso;
		this.isPermisoNuevoTipoValoracion=isPermiso;
		this.isPermisoActualizarTipoValoracion=isPermiso;
		this.isPermisoActualizarOriginalTipoValoracion=isPermiso;
		this.isPermisoEliminarTipoValoracion=isPermiso;
		this.isPermisoGuardarCambiosTipoValoracion=isPermiso;
		this.isPermisoConsultaTipoValoracion=isPermiso;
		this.isPermisoBusquedaTipoValoracion=isPermiso;
		this.isPermisoReporteTipoValoracion=isPermiso;
		this.isPermisoOrdenTipoValoracion=isPermiso;		
		this.isPermisoPaginacionMedioTipoValoracion=isPermiso;		
		this.isPermisoPaginacionAltoTipoValoracion=isPermiso;		
		this.isPermisoPaginacionTodoTipoValoracion=isPermiso;		
		this.isPermisoCopiarTipoValoracion=isPermiso;		
		this.isPermisoVerFormTipoValoracion=isPermiso;		
		this.isPermisoDuplicarTipoValoracion=isPermiso;
		this.isPermisoOrdenTipoValoracion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoValoracion(Boolean isPermiso) {
		//this.isPermisoTodoTipoValoracion=isPermiso;
		this.isPermisoNuevoTipoValoracion=isPermiso;
		this.isPermisoActualizarTipoValoracion=isPermiso;
		this.isPermisoActualizarOriginalTipoValoracion=isPermiso;
		this.isPermisoEliminarTipoValoracion=isPermiso;
		this.isPermisoGuardarCambiosTipoValoracion=isPermiso;
		//this.isPermisoConsultaTipoValoracion=isPermiso;
		//this.isPermisoBusquedaTipoValoracion=isPermiso;
		//this.isPermisoReporteTipoValoracion=isPermiso;
		//this.isPermisoOrdenTipoValoracion=isPermiso;		
		//this.isPermisoPaginacionMedioTipoValoracion=isPermiso;		
		//this.isPermisoPaginacionAltoTipoValoracion=isPermiso;		
		//this.isPermisoPaginacionTodoTipoValoracion=isPermiso;		
		//this.isPermisoCopiarTipoValoracion=isPermiso;		
		//this.isPermisoDuplicarTipoValoracion=isPermiso;
		//this.isPermisoOrdenTipoValoracion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoValoracionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ReferenciaBancariaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(LunaSistemaSolarConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(PlanetaSistemaSolarConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ReferenciaComercialConstantesFunciones.SNOMBREOPCION);
		
		if(TipoValoracionJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosReferenciaBancaria=false;
		this.isTienePermisosReferenciaBancaria=this.verificarGetPermisosUsuarioOpcionTipoValoracionClaseRelacionada(this.opcionsRelacionadas,ReferenciaBancariaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosLunaSistemaSolar=false;
		this.isTienePermisosLunaSistemaSolar=this.verificarGetPermisosUsuarioOpcionTipoValoracionClaseRelacionada(this.opcionsRelacionadas,LunaSistemaSolarConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosPlanetaSistemaSolar=false;
		this.isTienePermisosPlanetaSistemaSolar=this.verificarGetPermisosUsuarioOpcionTipoValoracionClaseRelacionada(this.opcionsRelacionadas,PlanetaSistemaSolarConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosReferenciaComercial=false;
		this.isTienePermisosReferenciaComercial=this.verificarGetPermisosUsuarioOpcionTipoValoracionClaseRelacionada(this.opcionsRelacionadas,ReferenciaComercialConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoValoracion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoValoracionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosReferenciaBancaria=conPermiso;
		this.isTienePermisosLunaSistemaSolar=conPermiso;
		this.isTienePermisosPlanetaSistemaSolar=conPermiso;
		this.isTienePermisosReferenciaComercial=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoValoracionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoValoracionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoValoracionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosReferenciaBancaria && this.jInternalFrameDetalleFormTipoValoracion!=null && this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoValoracion.jTabbedPaneRelacionesTipoValoracion.remove(this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosLunaSistemaSolar && this.jInternalFrameDetalleFormTipoValoracion!=null && this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoValoracion.jTabbedPaneRelacionesTipoValoracion.remove(this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosPlanetaSistemaSolar && this.jInternalFrameDetalleFormTipoValoracion!=null && this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoValoracion.jTabbedPaneRelacionesTipoValoracion.remove(this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosReferenciaComercial && this.jInternalFrameDetalleFormTipoValoracion!=null && this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoValoracion.jTabbedPaneRelacionesTipoValoracion.remove(this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoValoracion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoValoracionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoValoracionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoValoracion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoValoracion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoValoracion=this.isPermisoActualizarTipoValoracion;
			this.isPermisoEliminarTipoValoracion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoValoracion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoValoracion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoValoracion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoValoracion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoValoracion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoValoracion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoValoracion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoValoracion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoValoracion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoValoracion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoValoracion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoValoracion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoValoracion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoValoracion.setToolTipText(this.jTableDatosTipoValoracion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoValoracion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoValoracion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoValoracionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoValoracionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoValoracion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosReferenciaBancaria && this.tipovaloracionConstantesFunciones.mostrarReferenciaBancariaTipoValoracion && !TipoValoracionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Referencia Bancaria");
			reporte.setsDescripcion("Referencia Bancaria");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosLunaSistemaSolar && this.tipovaloracionConstantesFunciones.mostrarLunaSistemaSolarTipoValoracion && !TipoValoracionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Luna Sistema Solar");
			reporte.setsDescripcion("Luna Sistema Solar");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosPlanetaSistemaSolar && this.tipovaloracionConstantesFunciones.mostrarPlanetaSistemaSolarTipoValoracion && !TipoValoracionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Planeta Sistema Solar");
			reporte.setsDescripcion("Planeta Sistema Solar");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosReferenciaComercial && this.tipovaloracionConstantesFunciones.mostrarReferenciaComercialTipoValoracion && !TipoValoracionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Referencia Comercial");
			reporte.setsDescripcion("Referencia Comercial");
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
	
		
	public void inicializarCombosForeignKeyTipoValoracionListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoValoracionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoValoracionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoValoracionListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoValoracionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoValoracion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoValoracion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoValoracion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoValoracion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoValoracion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoValoracion(TipoValoracion tipovaloracion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoValoracion(TipoValoracion tipovaloracion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoValoracion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoValoracion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoValoracion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoValoracion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoValoracion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoValoracion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoValoracion(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoValoracion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoValoracionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoValoracionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoValoracionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipovaloracionSessionBean=new TipoValoracionSessionBean(); 
		this.tipovaloracionConstantesFunciones=new TipoValoracionConstantesFunciones(); 
		this.tipovaloracionBean=new TipoValoracion();//(this.tipovaloracionConstantesFunciones); 		
		this.tipovaloracionReturnGeneral=new TipoValoracionParameterReturnGeneral(); 
		
		this.tipovaloracionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipovaloracionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoValoracionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoValoracionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoValoracionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoValoracion(true);
			
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
			
			this.tipovaloracionConstantesFunciones=new TipoValoracionConstantesFunciones(); 
			this.tipovaloracionBean=new TipoValoracion();//this.tipovaloracionConstantesFunciones); 			
			this.tipovaloracionReturnGeneral=new TipoValoracionParameterReturnGeneral(); 
		
			TipoValoracionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Valoracion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipovaloracion=new TipoValoracion();
			this.tipovaloracions = new ArrayList<TipoValoracion>();
			this.tipovaloracionsAux = new ArrayList<TipoValoracion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic=new TipoValoracionLogic();
				this.tipovaloracionLogic.getNewConnexionToDeep("");
			}
			
			//this.tipovaloracionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipovaloracionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoValoracion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoValoracion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoValoracion);	
					}
					
					if(this.jInternalFrameImportacionTipoValoracion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoValoracion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoValoracion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoValoracion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoValoracion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoValoracion);
				this.jInternalFrameDetalleFormTipoValoracion.setVisible(false);
				this.jInternalFrameDetalleFormTipoValoracion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoValoracion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoValoracion);
					this.jInternalFrameReporteDinamicoTipoValoracion.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoValoracion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoValoracion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoValoracion);
					this.jInternalFrameImportacionTipoValoracion.setVisible(false);
					this.jInternalFrameImportacionTipoValoracion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoValoracion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoValoracion);
					this.jInternalFrameOrderByTipoValoracion.setVisible(false);
					this.jInternalFrameOrderByTipoValoracion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoValoracionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoValoracionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipovaloracionReturnGeneral=new TipoValoracionParameterReturnGeneral();
			
			this.tipovaloracionParameterGeneral=new TipoValoracionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipovaloracionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoValoracionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ReferenciaBancariaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(LunaSistemaSolarConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(PlanetaSistemaSolarConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ReferenciaComercialConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoValoracionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipovaloracionSessionBean.getEsGuardarRelacionado(),this.tipovaloracionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoValoracionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipovaloracionSessionBean.getEsGuardarRelacionado(),this.tipovaloracionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoValoracion=false;
			this.isVisibilidadCeldaDuplicarTipoValoracion=true;
			this.isVisibilidadCeldaCopiarTipoValoracion=true;
			this.isVisibilidadCeldaVerFormTipoValoracion=true;
			this.isVisibilidadCeldaOrdenTipoValoracion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoValoracion=false;
			this.isVisibilidadCeldaModificarTipoValoracion=false;
			this.isVisibilidadCeldaActualizarTipoValoracion=false;
			this.isVisibilidadCeldaEliminarTipoValoracion=false;
			this.isVisibilidadCeldaCancelarTipoValoracion=false;
			this.isVisibilidadCeldaGuardarTipoValoracion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoValoracion=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoValoracion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoValoracion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoValoracion(false);
			
			this.setPermisosUsuarioTipoValoracion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipovaloracionSessionBean.getEsGuardarRelacionado() 
				|| (this.tipovaloracionSessionBean.getEsGuardarRelacionado() && this.tipovaloracionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoValoracionClasesRelacionadas();
			}
			
			if(this.tipovaloracionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoValoracionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoValoracionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoValoracion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoValoracion();
			}
			
			if(!this.isPermisoBusquedaTipoValoracion) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoValoracion,this.isPermisoPaginacionMedioTipoValoracion,this.isPermisoPaginacionTodoTipoValoracion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoValoracionConstantesFunciones.getTiposSeleccionarTipoValoracion());
				
				this.tiposColumnasSelect=TipoValoracionConstantesFunciones.getTiposSeleccionarTipoValoracion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoValoracion();				
				//this.tiposRelacionesSelect=TipoValoracionConstantesFunciones.getTiposRelacionesTipoValoracion(true);
				
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
			//if(!this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoValoracion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoValoracion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoValoracion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoValoracion() ;
			
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
			
			
			this.referenciabancariaLogic=new ReferenciaBancariaLogic();
			this.lunasistemasolarLogic=new LunaSistemaSolarLogic();
			this.planetasistemasolarLogic=new PlanetaSistemaSolarLogic();
			this.referenciacomercialLogic=new ReferenciaComercialLogic(); 
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
				tipovaloracionImplementable= (TipoValoracionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoValoracionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipovaloracionImplementableHome= (TipoValoracionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoValoracionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipovaloracions= new ArrayList<TipoValoracion>();
			this.tipovaloracionsEliminados= new ArrayList<TipoValoracion>();
						
			this.isEsNuevoTipoValoracion=false;
			this.esParaAccionDesdeFormularioTipoValoracion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoValoracion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoValoracion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoValoracionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoValoracion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoValoracion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoValoracion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoValoracion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoValoracion();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoValoracion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoValoracion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoValoracion() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoValoracion")) {
				iIndex=this.jInternalFrameDetalleFormTipoValoracion.jTabbedPaneRelacionesTipoValoracion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoValoracion.jTabbedPaneRelacionesTipoValoracion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoValoracion.getSelectedRow();	
				
				

				if(sTitle.equals("Luna Sistema Solares")) {
					if(!LunaSistemaSolarJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoValoracion();

						this.cargarParteTabPanelRelacionadaLunaSistemaSolar(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Planeta Sistema Solares")) {
					if(!PlanetaSistemaSolarJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoValoracion();

						this.cargarParteTabPanelRelacionadaPlanetaSistemaSolar(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Referencia Bancarias")) {
					if(!ReferenciaBancariaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoValoracion();

						this.cargarParteTabPanelRelacionadaReferenciaBancaria(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Referencia Comerciales")) {
					if(!ReferenciaComercialJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoValoracion();

						this.cargarParteTabPanelRelacionadaReferenciaComercial(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoValoracion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaLunaSistemaSolar(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoValoracion.cargarSessionConBeanSwingJInternalFrameLunaSistemaSolar(false,true,iIndex);
		this.jButtonLunaSistemaSolarActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaLunaSistemaSolar();

		//this.jTabbedPaneRelacionesTipoValoracion.updateUI();
		//this.jTabbedPaneRelacionesTipoValoracion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoValoracion.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPlanetaSistemaSolar(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoValoracion.cargarSessionConBeanSwingJInternalFramePlanetaSistemaSolar(false,true,iIndex);
		this.jButtonPlanetaSistemaSolarActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPlanetaSistemaSolar();

		//this.jTabbedPaneRelacionesTipoValoracion.updateUI();
		//this.jTabbedPaneRelacionesTipoValoracion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoValoracion.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaReferenciaBancaria(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoValoracion.cargarSessionConBeanSwingJInternalFrameReferenciaBancaria(false,true,iIndex);
		this.jButtonReferenciaBancariaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaReferenciaBancaria();

		//this.jTabbedPaneRelacionesTipoValoracion.updateUI();
		//this.jTabbedPaneRelacionesTipoValoracion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoValoracion.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaReferenciaComercial(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoValoracion.cargarSessionConBeanSwingJInternalFrameReferenciaComercial(false,true,iIndex);
		this.jButtonReferenciaComercialActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaReferenciaComercial();

		//this.jTabbedPaneRelacionesTipoValoracion.updateUI();
		//this.jTabbedPaneRelacionesTipoValoracion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoValoracion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ReferenciaBancaria")) {
				int row=this.jTableDatosTipoValoracion.getSelectedRow();
				jButtonReferenciaBancariaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("LunaSistemaSolar")) {
				int row=this.jTableDatosTipoValoracion.getSelectedRow();
				jButtonLunaSistemaSolarActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("PlanetaSistemaSolar")) {
				int row=this.jTableDatosTipoValoracion.getSelectedRow();
				jButtonPlanetaSistemaSolarActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ReferenciaComercial")) {
				int row=this.jTableDatosTipoValoracion.getSelectedRow();
				jButtonReferenciaComercialActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Referencia Bancaria")) {

					if(this.isTienePermisosReferenciaBancaria && this.tipovaloracionConstantesFunciones.mostrarReferenciaBancariaTipoValoracion && !TipoValoracionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Referencia Bancarias"+"("+ReferenciaBancariaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Referencia Bancarias");

						if(tipovaloracionConstantesFunciones.resaltarReferenciaBancariaTipoValoracion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipovaloracionConstantesFunciones.resaltarReferenciaBancariaTipoValoracion);
						}

						jmenuItem.setEnabled(this.tipovaloracionConstantesFunciones.activarReferenciaBancariaTipoValoracion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ReferenciaBancaria"));

						

						this.jInternalFrameDetalleFormTipoValoracion.jmenuDetalleTipoValoracion.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Luna Sistema Solar")) {

					if(this.isTienePermisosLunaSistemaSolar && this.tipovaloracionConstantesFunciones.mostrarLunaSistemaSolarTipoValoracion && !TipoValoracionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Luna Sistema Solares"+"("+LunaSistemaSolarConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Luna Sistema Solares");

						if(tipovaloracionConstantesFunciones.resaltarLunaSistemaSolarTipoValoracion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipovaloracionConstantesFunciones.resaltarLunaSistemaSolarTipoValoracion);
						}

						jmenuItem.setEnabled(this.tipovaloracionConstantesFunciones.activarLunaSistemaSolarTipoValoracion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"LunaSistemaSolar"));

						

						this.jInternalFrameDetalleFormTipoValoracion.jmenuDetalleTipoValoracion.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Planeta Sistema Solar")) {

					if(this.isTienePermisosPlanetaSistemaSolar && this.tipovaloracionConstantesFunciones.mostrarPlanetaSistemaSolarTipoValoracion && !TipoValoracionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Planeta Sistema Solares"+"("+PlanetaSistemaSolarConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Planeta Sistema Solares");

						if(tipovaloracionConstantesFunciones.resaltarPlanetaSistemaSolarTipoValoracion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipovaloracionConstantesFunciones.resaltarPlanetaSistemaSolarTipoValoracion);
						}

						jmenuItem.setEnabled(this.tipovaloracionConstantesFunciones.activarPlanetaSistemaSolarTipoValoracion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PlanetaSistemaSolar"));

						

						this.jInternalFrameDetalleFormTipoValoracion.jmenuDetalleTipoValoracion.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Referencia Comercial")) {

					if(this.isTienePermisosReferenciaComercial && this.tipovaloracionConstantesFunciones.mostrarReferenciaComercialTipoValoracion && !TipoValoracionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Referencia Comerciales"+"("+ReferenciaComercialConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Referencia Comerciales");

						if(tipovaloracionConstantesFunciones.resaltarReferenciaComercialTipoValoracion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipovaloracionConstantesFunciones.resaltarReferenciaComercialTipoValoracion);
						}

						jmenuItem.setEnabled(this.tipovaloracionConstantesFunciones.activarReferenciaComercialTipoValoracion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ReferenciaComercial"));

						

						this.jInternalFrameDetalleFormTipoValoracion.jmenuDetalleTipoValoracion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoValoracion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoValoracion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoValoracion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoValoracionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoValoracion();
		
		this.cargarCombosFrameForeignKeyTipoValoracion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoValoracion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoValoracion();
		}
	}
	
	
	
	public void jButtonNuevoTipoValoracionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipovaloracionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoValoracion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
			
			
			if(jTableDatosTipoValoracion.getRowCount()>=1) {
				jTableDatosTipoValoracion.removeRowSelectionInterval(0, jTableDatosTipoValoracion.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoValoracion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoValoracion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoValoracion(true);			
			//this.tipovaloracion=new TipoValoracion();
			//this.tipovaloracion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoValoracion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoValoracion() ;
			
			if(TipoValoracionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoValoracion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipovaloracion);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipovaloracion);				
			
			TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
			
			if(this.tipovaloracionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoValoracion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoValoracionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoValoracion> tipovaloracionsSeleccionados=new ArrayList<TipoValoracion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoValoracion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoValoracion.getSelectedRows().length;			
			}
			
			tipovaloracionsSeleccionados=this.getTipoValoracionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoValoracion--;			
				//TipoValoracion tipovaloracionAux= new TipoValoracion();			
				//tipovaloracionAux.setId(this.iIdNuevoTipoValoracion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoValoracion tipovaloracionOrigen=new TipoValoracion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoValoracion tipovaloracionOrigen : tipovaloracionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoValoracion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipovaloracionOrigen =(TipoValoracion) this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipovaloracionOrigen =(TipoValoracion) this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoValoracion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipovaloracion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoValoracion(tipovaloracionOrigen,this.tipovaloracion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoValoracion(this.tipovaloracion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipovaloracionLogic.getTipoValoracions().add(this.tipovaloracionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipovaloracions.add(this.tipovaloracionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoValoracion(false);
				
				this.jTableDatosTipoValoracion.setRowSelectionInterval(this.getIndiceNuevoTipoValoracion(), this.getIndiceNuevoTipoValoracion());
				
				int iLastRow =  this.jTableDatosTipoValoracion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoValoracion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoValoracion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoValoracion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoValoracionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoValoracion> tipovaloracionsSeleccionados=new ArrayList<TipoValoracion>();									
		
			TipoValoracion tipovaloracionOrigen=new TipoValoracion();
			TipoValoracion tipovaloracionDestino=new TipoValoracion();
				
			tipovaloracionsSeleccionados=this.getTipoValoracionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoValoracion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipovaloracionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoValoracion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovaloracionOrigen =(TipoValoracion) this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipovaloracionOrigen =(TipoValoracion) this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovaloracionDestino =(TipoValoracion) this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipovaloracionDestino =(TipoValoracion) this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipovaloracionOrigen =tipovaloracionsSeleccionados.get(0);
				tipovaloracionDestino =tipovaloracionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoValoracion(tipovaloracionOrigen,tipovaloracionDestino,true,false);
				
				tipovaloracionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipovaloracionDestino,tipovaloracionLogic.getTipoValoracions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipovaloracionDestino,tipovaloracions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoValoracion(false);
				
				//this.jTableDatosTipoValoracion.setRowSelectionInterval(this.getIndiceNuevoTipoValoracion(), this.getIndiceNuevoTipoValoracion());
				
				int iLastRow =  this.jTableDatosTipoValoracion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoValoracion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoValoracion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoValoracion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoValoracionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoValoracion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoValoracion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoValoracionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoValoracion.isVisible();
			
			
			this.jPanelParametrosReportesTipoValoracion.setVisible(!isVisible);
			this.jPanelPaginacionTipoValoracion.setVisible(!isVisible);
			this.jPanelAccionesTipoValoracion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoValoracionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoValoracion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoValoracionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoValoracion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoValoracionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoValoracion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoValoracionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoValoracion();
			
			this.abrirFrameOrderByTipoValoracion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoValoracionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoValoracion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoValoracion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoValoracion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoValoracion.isMaximum()) {
					this.jInternalFrameDetalleFormTipoValoracion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoValoracion.setSize(this.jInternalFrameDetalleFormTipoValoracion.iWidthFormulario,this.jInternalFrameDetalleFormTipoValoracion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoValoracion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoValoracion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoValoracion.isMaximum()) {
						this.jInternalFrameDetalleFormTipoValoracion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoValoracion.jContentPaneDetalleTipoValoracion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoValoracion.jTabbedPaneRelacionesTipoValoracion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoValoracion.jContentPaneDetalleTipoValoracion.getWidth(),TipoValoracionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoValoracion.jTabbedPaneRelacionesTipoValoracion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoValoracion.jContentPaneDetalleTipoValoracion.getWidth(),TipoValoracionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoValoracion.jTabbedPaneRelacionesTipoValoracion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoValoracion.jContentPaneDetalleTipoValoracion.getWidth(),TipoValoracionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(LunaSistemaSolarJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaLunaSistemaSolar();
					}

					if(PlanetaSistemaSolarJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPlanetaSistemaSolar();
					}

					if(ReferenciaBancariaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaReferenciaBancaria();
					}

					if(ReferenciaComercialJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaReferenciaComercial();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoValoracion.setVisible(true);
	        this.jInternalFrameDetalleFormTipoValoracion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoValoracion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoValoracion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoValoracion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoValoracion,false,this);
				} else {
					this.jInternalFrameOrderByTipoValoracion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoValoracion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoValoracion);
				this.jInternalFrameOrderByTipoValoracion.setVisible(false);
				this.jInternalFrameOrderByTipoValoracion.setSelected(false);
				
				this.jInternalFrameOrderByTipoValoracion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoValoracion"));
				
				this.inicializarActualizarBindingTablaOrderByTipoValoracion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoValoracion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoValoracion==null) {
				
				this.jInternalFrameImportacionTipoValoracion=new ImportacionJInternalFrame(TipoValoracionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoValoracion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoValoracion);
				this.jInternalFrameImportacionTipoValoracion.setVisible(false);
				this.jInternalFrameImportacionTipoValoracion.setSelected(false);


				this.jInternalFrameImportacionTipoValoracion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoValoracion"));
				this.jInternalFrameImportacionTipoValoracion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoValoracion"));
				this.jInternalFrameImportacionTipoValoracion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoValoracion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoValoracion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoValoracion==null) {
				this.jInternalFrameReporteDinamicoTipoValoracion=new ReporteDinamicoJInternalFrame(TipoValoracionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoValoracion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoValoracion);
				this.jInternalFrameReporteDinamicoTipoValoracion.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoValoracion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoValoracion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoValoracion"));
				this.jInternalFrameReporteDinamicoTipoValoracion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoValoracion"));
				this.jInternalFrameReporteDinamicoTipoValoracion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoValoracion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoValoracion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaLunaSistemaSolar() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame.jScrollPanelDatosLunaSistemaSolar.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoValoracion.jContentPaneDetalleTipoValoracion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame.jScrollPanelDatosLunaSistemaSolar.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame.jScrollPanelDatosLunaSistemaSolar.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame.jScrollPanelDatosLunaSistemaSolar.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPlanetaSistemaSolar() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame.jScrollPanelDatosPlanetaSistemaSolar.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoValoracion.jContentPaneDetalleTipoValoracion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame.jScrollPanelDatosPlanetaSistemaSolar.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame.jScrollPanelDatosPlanetaSistemaSolar.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame.jScrollPanelDatosPlanetaSistemaSolar.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaReferenciaBancaria() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame.jScrollPanelDatosReferenciaBancaria.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoValoracion.jContentPaneDetalleTipoValoracion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame.jScrollPanelDatosReferenciaBancaria.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame.jScrollPanelDatosReferenciaBancaria.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame.jScrollPanelDatosReferenciaBancaria.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaReferenciaComercial() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame.jScrollPanelDatosReferenciaComercial.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoValoracion.jContentPaneDetalleTipoValoracion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame.jScrollPanelDatosReferenciaComercial.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame.jScrollPanelDatosReferenciaComercial.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame.jScrollPanelDatosReferenciaComercial.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoValoracion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoValoracion);
			
	       	this.jInternalFrameDetalleFormTipoValoracion.setVisible(false);
	        this.jInternalFrameDetalleFormTipoValoracion.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoValoracion.dispose();
			//this.jInternalFrameDetalleFormTipoValoracion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoValoracion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoValoracion.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoValoracion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoValoracion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoValoracion.setVisible(true);
	        this.jInternalFrameImportacionTipoValoracion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoValoracion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoValoracion.setVisible(true);
	        this.jInternalFrameOrderByTipoValoracion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoValoracion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoValoracion.setVisible(false);
	        this.jInternalFrameOrderByTipoValoracion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoValoracion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoValoracion.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoValoracion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoValoracion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoValoracion.setVisible(false);
	        this.jInternalFrameImportacionTipoValoracion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoValoracionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoValoracion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoValoracion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoValoracion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoValoracion(true);
			//this.isEsNuevoTipoValoracion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracion =(TipoValoracion) this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipovaloracion =(TipoValoracion) this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoValoracion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoValoracion(false) ;
			
			if(tipovaloracionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.getEsGuardarRelacionado() && ReferenciaBancariaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonReferenciaBancariaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame.lunasistemasolarSessionBean.getEsGuardarRelacionado() && LunaSistemaSolarJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonLunaSistemaSolarActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame.planetasistemasolarSessionBean.getEsGuardarRelacionado() && PlanetaSistemaSolarJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPlanetaSistemaSolarActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame.referenciacomercialSessionBean.getEsGuardarRelacionado() && ReferenciaComercialJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonReferenciaComercialActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoValoracionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoValoracion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoValoracion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoValoracionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoValoracion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracion =(TipoValoracion) this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovaloracion =(TipoValoracion) this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoValoracion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoValoracion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoValoracion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoValoracion(true);
			//this.isEsNuevoTipoValoracion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracion =(TipoValoracion) this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipovaloracion =(TipoValoracion) this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipovaloracion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoValoracion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoValoracion(false) ;
			
			if(TipoValoracionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoValoracion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoValoracion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoValoracionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoValoracion(false);
			
			//if(!this.isEsNuevoTipoValoracion) {								
				int intSelectedRow = this.jTableDatosTipoValoracion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracion =(TipoValoracion) this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipovaloracion =(TipoValoracion) this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoValoracionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoValoracion(this.tipovaloracion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoValoracion(this.tipovaloracion);
				
			}
			
			if(this.permiteMantenimiento(this.tipovaloracion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoValoracion=true;
					this.inicializarActualizarBindingTablaTipoValoracion(false);
					this.isEsNuevoTipoValoracion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoValoracion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoValoracion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoValoracion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoValoracion(false);
				
				this.habilitarDeshabilitarControlesTipoValoracion(false);
			
												
				
				if(TipoValoracionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoValoracion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoValoracionActionPerformed(evt,tipovaloracionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoValoracion(this.tipovaloracion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoValoracion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipovaloracionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipovaloracion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoValoracion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoValoracion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoValoracionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoValoracion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracion =(TipoValoracion) this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
				this.tipovaloracion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipovaloracion =(TipoValoracion) this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
				this.tipovaloracion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipovaloracion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoValoracionModel) this.jTableDatosTipoValoracion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoValoracion=true;
				this.inicializarActualizarBindingTablaTipoValoracion(false);
				this.isEsNuevoTipoValoracion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoValoracion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoValoracion(false);
				
				this.habilitarDeshabilitarControlesTipoValoracion(false);
				
				
				
				if(TipoValoracionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoValoracion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoValoracionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoValoracion.getRowCount()>=1) {
				jTableDatosTipoValoracion.removeRowSelectionInterval(0, jTableDatosTipoValoracion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoValoracion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoValoracion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoValoracion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoValoracion(false) ;
			
			this.isEsNuevoTipoValoracion=false;
			
			if(TipoValoracionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoValoracion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoValoracionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoValoracion(false);
				
				//SI ES MANUAL
				if(TipoValoracionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoValoracion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoValoracionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoValoracion--;			
			//TipoValoracion tipovaloracionAux= new TipoValoracion();			
			//tipovaloracionAux.setId(this.iIdNuevoTipoValoracion);
			
			if(this.jInternalFrameDetalleFormTipoValoracion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoValoracion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoValoracion(this.tipovaloracion);
			
			this.tipovaloracion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipovaloracionLogic.getTipoValoracions().add(this.tipovaloracionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipovaloracions.add(this.tipovaloracionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoValoracion(false);
			
			this.jTableDatosTipoValoracion.setRowSelectionInterval(this.getIndiceNuevoTipoValoracion(), this.getIndiceNuevoTipoValoracion());
			
			int iLastRow =  this.jTableDatosTipoValoracion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoValoracion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoValoracion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoValoracion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoValoracionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoValoracion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoValoracion(false);
			
			//SI ES MANUAL
			if(TipoValoracionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoValoracion();
			}
			
			//this.abrirFrameTreeTipoValoracion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoValoracionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo ValoracionS ?", "MANTENIMIENTO DE Tipo Valoracion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoValoracion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoValoracion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipovaloracionReturnGeneral=tipovaloracionLogic.procesarImportacionTipoValoracionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipovaloracionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoValoracionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoValoracionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoValoracion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoValoracion.setFileImportacion(this.jInternalFrameImportacionTipoValoracion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoValoracion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoValoracion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoValoracion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoValoracion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoValoracionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoValoracion> tipovaloracionsSeleccionados=new ArrayList<TipoValoracion>();		

		tipovaloracionsSeleccionados=this.getTipoValoracionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoValoracion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoValoracion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoValoracionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoValoracionBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoValoracions("Todos",tipovaloracionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Valoracion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoValoracion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoValoracion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoValoracionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoValoracionConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoValoracion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoValoracion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoValoracion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoValoracionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoValoracionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoValoracion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoValoracionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoValoracionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoValoracion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoValoracion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoValoracionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoValoracionConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoValoracionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoValoracion> tipovaloracionsSeleccionados=new ArrayList<TipoValoracion>();		
		
		tipovaloracionsSeleccionados=this.getTipoValoracionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovaloracion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoValoracions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoValoracion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoValoracion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoValoracionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoValoracionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoValoracion tipovaloracion:tipovaloracionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipovaloracion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoValoracionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoValoracionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoValoracion tipovaloracion:tipovaloracionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipovaloracion.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoValoracion(row);				
			//	iRow++;
			//}				
			
			//for(TipoValoracion tipovaloracionAux:tipovaloracionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoValoracion(tipovaloracionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Valoracion",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipovaloracionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoValoracion(false);
			
			//SI ES MANUAL
			if(TipoValoracionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoValoracion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoValoracionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoValoracion(false);
			
			//SI ES MANUAL
			if(TipoValoracionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoValoracion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoValoracionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoValoracion(false);
			
			//SI ES MANUAL
			if(TipoValoracionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoValoracion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovaloracionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoValoracion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoValoracion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoValoracion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoValoracion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoValoracion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoValoracion.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoValoracion.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoValoracion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoValoracion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoValoracion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoValoracion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoValoracion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoValoracion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoValoracion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoValoracion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoValoracion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoValoracionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoValoracionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoValoracion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoValoracion();
		
		this.inicializarActualizarBindingBotonesManualTipoValoracion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoValoracion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoValoracion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoValoracion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoValoracion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoValoracion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoValoracion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoValoracion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoValoracion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoValoracion.jCheckBoxPostAccionNuevoTipoValoracion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoValoracion.jCheckBoxPostAccionSinCerrarTipoValoracion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoValoracion.jCheckBoxPostAccionSinMensajeTipoValoracion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoValoracion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoValoracion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoValoracion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoValoracion!=null) {
				this.jInternalFrameDetalleFormTipoValoracion.jCheckBoxPostAccionNuevoTipoValoracion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoValoracion.jCheckBoxPostAccionSinCerrarTipoValoracion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoValoracion.jCheckBoxPostAccionSinMensajeTipoValoracion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoValoracion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoValoracion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoValoracion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoValoracion.jComboBoxTiposAccionesFormularioTipoValoracion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoValoracion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoValoracion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoValoracion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoValoracion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoValoracion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoValoracion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoValoracion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoValoracion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoValoracion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoValoracion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoValoracion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoValoracion(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoValoracionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoValoracion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoValoracion() throws Exception {
		try	{
			if(TipoValoracionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoValoracion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoValoracion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoValoracion.jComboBoxTiposAccionesFormularioTipoValoracion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoValoracion.jComboBoxTiposAccionesFormularioTipoValoracion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoValoracion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoValoracion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoValoracion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoValoracion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoValoracion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoValoracion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoValoracion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoValoracion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoValoracion.addItem(reporte);
			}
			
			
			if(!this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoValoracion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoValoracion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoValoracion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoValoracion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoValoracion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoValoracion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoValoracion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoValoracion.jComboBoxTiposAccionesFormularioTipoValoracion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoValoracion.jComboBoxTiposAccionesFormularioTipoValoracion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoValoracion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoValoracion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoValoracion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoValoracion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoValoracion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoValoracion!=null) {
				this.jInternalFrameReporteDinamicoTipoValoracion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoValoracion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoValoracion!=null) {
				this.jInternalFrameReporteDinamicoTipoValoracion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoValoracion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoValoracion!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoValoracion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoValoracion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoValoracion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoValoracion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoValoracion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoValoracion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoValoracion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoValoracion(Boolean esInicializar) throws Exception {				
		if(TipoValoracionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoValoracion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoValoracion() throws Exception {
		this.inicializarActualizarBindingTablaTipoValoracion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoValoracion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoValoracion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoValoracion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoValoracion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoValoracionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoValoracion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoValoracion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoValoracionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoValoracionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoValoracionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoValoracionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoValoracion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoValoracion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoValoracionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoValoracion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoValoracion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipovaloracionLogic.getTipoValoracions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipovaloracions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoValoracionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoValoracion.setModel(new TipoValoracionModel(this.tipovaloracionLogic.getTipoValoracions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoValoracion.setModel(new TipoValoracionModel(this.tipovaloracions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoValoracion!=null && this.jInternalFrameOrderByTipoValoracion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoValoracion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoValoracion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoValoracion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoValoracionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO,tipovaloracionConstantesFunciones.resaltarSeleccionarTipoValoracion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO,tipovaloracionConstantesFunciones.resaltarSeleccionarTipoValoracion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoValoracion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoValoracion,TipoValoracionConstantesFunciones.LABEL_ID));

		if(this.tipovaloracionConstantesFunciones.mostraridTipoValoracion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoValoracionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipovaloracionConstantesFunciones.resaltaridTipoValoracion,this.tipovaloracionConstantesFunciones.activaridTipoValoracion,this,true,"idTipoValoracion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipovaloracionConstantesFunciones.resaltaridTipoValoracion,this.tipovaloracionConstantesFunciones.activaridTipoValoracion,this,true,"idTipoValoracion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoValoracion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoValoracion,TipoValoracionConstantesFunciones.LABEL_CODIGO));

		if(this.tipovaloracionConstantesFunciones.mostrarcodigoTipoValoracion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoValoracionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipovaloracionConstantesFunciones.resaltarcodigoTipoValoracion,this.tipovaloracionConstantesFunciones.activarcodigoTipoValoracion,this,true,"codigoTipoValoracion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipovaloracionConstantesFunciones.resaltarcodigoTipoValoracion,this.tipovaloracionConstantesFunciones.activarcodigoTipoValoracion,this,true,"codigoTipoValoracion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoValoracionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoValoracion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoValoracion,TipoValoracionConstantesFunciones.LABEL_NOMBRE));

		if(this.tipovaloracionConstantesFunciones.mostrarnombreTipoValoracion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoValoracionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipovaloracionConstantesFunciones.resaltarnombreTipoValoracion,this.tipovaloracionConstantesFunciones.activarnombreTipoValoracion,this,true,"nombreTipoValoracion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipovaloracionConstantesFunciones.resaltarnombreTipoValoracion,this.tipovaloracionConstantesFunciones.activarnombreTipoValoracion,this,true,"nombreTipoValoracion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoValoracionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipovaloracionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosReferenciaBancaria && this.tipovaloracionConstantesFunciones.mostrarReferenciaBancariaTipoValoracion && !TipoValoracionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Referencia Bancarias");
				tableColumn.setHeaderValue("Referencia Bancarias");
				tableColumn.setCellRenderer(new ReferenciaBancariaTableCell(tipovaloracionConstantesFunciones.resaltarReferenciaBancariaTipoValoracion,this,this.tipovaloracionConstantesFunciones.activarReferenciaBancariaTipoValoracion));
				tableColumn.setCellEditor(new ReferenciaBancariaTableCell(tipovaloracionConstantesFunciones.resaltarReferenciaBancariaTipoValoracion,this,this.tipovaloracionConstantesFunciones.activarReferenciaBancariaTipoValoracion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoValoracion.addColumn(tableColumn);
			}

			if(this.isTienePermisosLunaSistemaSolar && this.tipovaloracionConstantesFunciones.mostrarLunaSistemaSolarTipoValoracion && !TipoValoracionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Luna Sistema Solares");
				tableColumn.setHeaderValue("Luna Sistema Solares");
				tableColumn.setCellRenderer(new LunaSistemaSolarTableCell(tipovaloracionConstantesFunciones.resaltarLunaSistemaSolarTipoValoracion,this,this.tipovaloracionConstantesFunciones.activarLunaSistemaSolarTipoValoracion));
				tableColumn.setCellEditor(new LunaSistemaSolarTableCell(tipovaloracionConstantesFunciones.resaltarLunaSistemaSolarTipoValoracion,this,this.tipovaloracionConstantesFunciones.activarLunaSistemaSolarTipoValoracion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoValoracion.addColumn(tableColumn);
			}

			if(this.isTienePermisosPlanetaSistemaSolar && this.tipovaloracionConstantesFunciones.mostrarPlanetaSistemaSolarTipoValoracion && !TipoValoracionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Planeta Sistema Solares");
				tableColumn.setHeaderValue("Planeta Sistema Solares");
				tableColumn.setCellRenderer(new PlanetaSistemaSolarTableCell(tipovaloracionConstantesFunciones.resaltarPlanetaSistemaSolarTipoValoracion,this,this.tipovaloracionConstantesFunciones.activarPlanetaSistemaSolarTipoValoracion));
				tableColumn.setCellEditor(new PlanetaSistemaSolarTableCell(tipovaloracionConstantesFunciones.resaltarPlanetaSistemaSolarTipoValoracion,this,this.tipovaloracionConstantesFunciones.activarPlanetaSistemaSolarTipoValoracion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoValoracion.addColumn(tableColumn);
			}

			if(this.isTienePermisosReferenciaComercial && this.tipovaloracionConstantesFunciones.mostrarReferenciaComercialTipoValoracion && !TipoValoracionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Referencia Comerciales");
				tableColumn.setHeaderValue("Referencia Comerciales");
				tableColumn.setCellRenderer(new ReferenciaComercialTableCell(tipovaloracionConstantesFunciones.resaltarReferenciaComercialTipoValoracion,this,this.tipovaloracionConstantesFunciones.activarReferenciaComercialTipoValoracion));
				tableColumn.setCellEditor(new ReferenciaComercialTableCell(tipovaloracionConstantesFunciones.resaltarReferenciaComercialTipoValoracion,this,this.tipovaloracionConstantesFunciones.activarReferenciaComercialTipoValoracion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoValoracion.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipovaloracionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipovaloracionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoValoracion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipovaloracionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipovaloracionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoValoracion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoValoracion && this.isPermisoGuardarCambiosTipoValoracion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipovaloracionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipovaloracionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoValoracion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipovaloracionSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoValoracion.addColumn(tableColumn);
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
			
			this.jTableDatosTipoValoracion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoValoracion && this.isPermisoGuardarCambiosTipoValoracion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipovaloracionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoValoracion && this.isPermisoGuardarCambiosTipoValoracion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoValoracion.moveColumn(this.jTableDatosTipoValoracion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoValoracion.moveColumn(this.jTableDatosTipoValoracion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipovaloracionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoValoracion.moveColumn(this.jTableDatosTipoValoracion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoValoracion.moveColumn(this.jTableDatosTipoValoracion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoValoracion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoValoracion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoValoracion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoValoracionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoValoracion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoValoracion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoValoracionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoValoracionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoValoracion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoValoracion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoValoracion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipovaloracionLogic.getTipoValoracions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipovaloracions.size()-1;
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
		//this.jTableDatosTipoValoracion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoValoracion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoValoracion();
			
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
				
				//this.isEsNuevoTipoValoracion=false;
					
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
			
				if(this.tipovaloracionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoValoracion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoValoracion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoValoracion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracion =(TipoValoracion) this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovaloracion =(TipoValoracion) this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipovaloracion.getsType().equals("DUPLICADO")
				   || this.tipovaloracion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoValoracion=true;
				
				} else {
					this.isEsNuevoTipoValoracion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
					if(this.tipovaloracion.getId()>=0 && !this.tipovaloracion.getIsNew()) {						
						this.isEsNuevoTipoValoracion=false;
						
					} else {
						this.isEsNuevoTipoValoracion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoValoracion(esRelaciones);						
				
				this.seleccionarTipoValoracion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipovaloracion.getId()<0) {
					this.isEsNuevoTipoValoracion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoValoracion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoValoracion(evt,rowIndex);
				}	
				
				if(this.tipovaloracionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoValoracion: " + this.dDif); 
					}
				}								
				
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoValoracion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipovaloracion)) {
					if(this.tipovaloracion.getId()>0) {
						this.tipovaloracion.setIsDeleted(true);
						
						this.tipovaloracionsEliminados.add(this.tipovaloracion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipovaloracionLogic.getTipoValoracions().remove(this.tipovaloracion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipovaloracions.remove(this.tipovaloracion);				
					}
					
					
					((TipoValoracionModel) this.jTableDatosTipoValoracion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoValoracion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoValoracion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoValoracion) {
			
			if(this.jInternalFrameDetalleFormTipoValoracion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoValoracion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoValoracion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracion =(TipoValoracion) this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovaloracion =(TipoValoracion) this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoValoracionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoValoracion(this.tipovaloracion);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoValoracion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoValoracion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoValoracion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoValoracion(TipoValoracion tipovaloracion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoValoracion(tipovaloracion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoValoracion(TipoValoracion tipovaloracion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoValoracion(tipovaloracion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoValoracion(tipovaloracion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoValoracion(tipovaloracion);
	}
	
	public void setVariablesObjetoActualToFormularioTipoValoracion(TipoValoracion tipovaloracion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoValoracion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoValoracion.jTextFieldidTipoValoracion.setText(tipovaloracion.getId().toString());
			this.jInternalFrameDetalleFormTipoValoracion.jTextFieldcodigoTipoValoracion.setText(tipovaloracion.getcodigo());
			this.jInternalFrameDetalleFormTipoValoracion.jTextAreanombreTipoValoracion.setText(tipovaloracion.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoValoracion tipovaloracionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipovaloracionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoValoracion tipovaloracionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipovaloracionLocal=this.tipovaloracion;
			} else {
				tipovaloracionLocal=this.tipovaloracionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipovaloracionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoValoracion(tipovaloracionLocal,true);
					
					if(tipovaloracionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipovaloracionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipovaloracionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoValoracion(TipoValoracion tipovaloracion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoValoracion(tipovaloracion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoValoracion(tipovaloracion);
	}
	
	public void setVariablesFormularioToObjetoActualTipoValoracion(TipoValoracion tipovaloracion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoValoracion(tipovaloracion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoValoracion(TipoValoracion tipovaloracion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoValoracion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoValoracion.jTextFieldidTipoValoracion.getText()==null || this.jInternalFrameDetalleFormTipoValoracion.jTextFieldidTipoValoracion.getText()=="" || this.jInternalFrameDetalleFormTipoValoracion.jTextFieldidTipoValoracion.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoValoracion.jTextFieldidTipoValoracion.setText("0");
			}

			if(conColumnasBase) {tipovaloracion.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoValoracion.jTextFieldidTipoValoracion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoValoracionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoValoracion.jLabelIdTipoValoracion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipovaloracion.setcodigo(this.jInternalFrameDetalleFormTipoValoracion.jTextFieldcodigoTipoValoracion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoValoracionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoValoracion.jLabelcodigoTipoValoracion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipovaloracion.setnombre(this.jInternalFrameDetalleFormTipoValoracion.jTextAreanombreTipoValoracion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoValoracionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoValoracion.jLabelnombreTipoValoracion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoValoracion(TipoValoracion tipovaloracionBean,TipoValoracion tipovaloracion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoValoracion(TipoValoracion tipovaloracionOrigen,TipoValoracion tipovaloracion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipovaloracionOrigen.getId()!=null && !tipovaloracionOrigen.getId().equals(0L))) {tipovaloracion.setId(tipovaloracionOrigen.getId());}}
			if(conDefault || (!conDefault && tipovaloracionOrigen.getcodigo()!=null && !tipovaloracionOrigen.getcodigo().equals(""))) {tipovaloracion.setcodigo(tipovaloracionOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipovaloracionOrigen.getnombre()!=null && !tipovaloracionOrigen.getnombre().equals(""))) {tipovaloracion.setnombre(tipovaloracionOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoValoracion(TipoValoracion tipovaloracion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoValoracion.jTextFieldidTipoValoracion.setText(tipovaloracion.getId().toString());
			this.jInternalFrameDetalleFormTipoValoracion.jTextFieldcodigoTipoValoracion.setText(tipovaloracion.getcodigo());
			this.jInternalFrameDetalleFormTipoValoracion.jTextAreanombreTipoValoracion.setText(tipovaloracion.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoValoracion(TipoValoracionBean tipovaloracionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoValoracion.jTextFieldidTipoValoracion.setText(tipovaloracionBean.getId().toString());
			this.jInternalFrameDetalleFormTipoValoracion.jTextFieldcodigoTipoValoracion.setText(tipovaloracionBean.getcodigo());
			this.jInternalFrameDetalleFormTipoValoracion.jTextAreanombreTipoValoracion.setText(tipovaloracionBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoValoracion(TipoValoracionParameterReturnGeneral tipovaloracionReturnGeneral,TipoValoracionBean tipovaloracionBean,Boolean conDefault) throws Exception { 
		try {
			TipoValoracion tipovaloracionLocal=new TipoValoracion();
			
			tipovaloracionLocal=tipovaloracionReturnGeneral.getTipoValoracion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipovaloracionLocal.getId()!=null && !tipovaloracionLocal.getId().equals(0L))) {tipovaloracionBean.setId(tipovaloracionLocal.getId());}}
			if(conDefault || (!conDefault && tipovaloracionLocal.getcodigo()!=null && !tipovaloracionLocal.getcodigo().equals(""))) {tipovaloracionBean.setcodigo(tipovaloracionLocal.getcodigo());}
			if(conDefault || (!conDefault && tipovaloracionLocal.getnombre()!=null && !tipovaloracionLocal.getnombre().equals(""))) {tipovaloracionBean.setnombre(tipovaloracionLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoValoracionGenerico(Long idTipoValoracionSeleccionado,JComboBox jComboBoxTipoValoracion,List<TipoValoracion> tipovaloracionsLocal)throws Exception {
		try {
			TipoValoracion  tipovaloracionTemp=null;

			for(TipoValoracion tipovaloracionAux:tipovaloracionsLocal) {
				if(tipovaloracionAux.getId()!=null && tipovaloracionAux.getId().equals(idTipoValoracionSeleccionado)) {
					tipovaloracionTemp=tipovaloracionAux;
					break;
				}
			}

			jComboBoxTipoValoracion.setSelectedItem(tipovaloracionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoValoracionGenerico(JComboBox jComboBoxTipoValoracion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoValoracion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoValoracion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoValoracion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoValoracion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoValoracion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoValoracion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoValoracion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoValoracion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoValoracion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoValoracion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ReferenciaBancaria")) {
			jButtonReferenciaBancariaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("LunaSistemaSolar")) {
			jButtonLunaSistemaSolarActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("PlanetaSistemaSolar")) {
			jButtonPlanetaSistemaSolarActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ReferenciaComercial")) {
			jButtonReferenciaComercialActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipovaloracion=(TipoValoracion) tipovaloracionLogic.getTipoValoracions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipovaloracion =(TipoValoracion) tipovaloracions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoValoracion tipovaloracionRow=new TipoValoracion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipovaloracionRow=(TipoValoracion) tipovaloracionLogic.getTipoValoracions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipovaloracionRow=(TipoValoracion) tipovaloracions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonReferenciaBancariaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoValoracion tipovaloracion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoValoracion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovaloracion = (TipoValoracion)this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipovaloracion = (TipoValoracion)this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipovaloracion!=null) {
						this.tipovaloracion = tipovaloracion;
					} else {
						this.tipovaloracion = new TipoValoracion();
					}
				}

				if(this.isTienePermisosReferenciaBancaria && this.permiteMantenimiento(this.tipovaloracion)) {
					ReferenciaBancariaBeanSwingJInternalFrame referenciabancariaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFramePopup=new ReferenciaBancariaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						referenciabancariaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFramePopup;
					} else {
						referenciabancariaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame;
					}

					List<TipoValoracion> tipovaloracions=new ArrayList<TipoValoracion>();
					tipovaloracions.add(this.tipovaloracion);
					if(!esRelacionado) {
						//referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.setConGuardarRelaciones(false);
						//referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					referenciabancariaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoValoracion.cargarReferenciaBancariaBeanSwingJInternalFrame(tipovaloracions,this.tipovaloracion,referenciabancariaBeanSwingJInternalFrame,/*conInicializar,*/referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.getConGuardarRelaciones(),referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.getEsGuardarRelacionado());
					referenciabancariaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						referenciabancariaBeanSwingJInternalFrame.actualizarEstadoPanelsReferenciaBancaria("no_relacionado");

						referenciabancariaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ReferenciaBancariaConstantesFunciones.ITAMANIOFILATABLA + (ReferenciaBancariaConstantesFunciones.ITAMANIOFILATABLA/2));

						referenciabancariaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoValoracion=(TitledBorder)this.jScrollPanelDatosTipoValoracion.getBorder();
						TitledBorder titledBorderReferenciaBancaria=(TitledBorder)referenciabancariaBeanSwingJInternalFrame.jScrollPanelDatosReferenciaBancaria.getBorder();

						titledBorderReferenciaBancaria.setTitle(titledBorderTipoValoracion.getTitle() + " -> Referencia Bancaria");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,referenciabancariaBeanSwingJInternalFrame);
						}

						referenciabancariaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(referenciabancariaBeanSwingJInternalFrame);

						referenciabancariaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipovaloracionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Referencia Bancaria",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonLunaSistemaSolarActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoValoracion tipovaloracion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoValoracion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovaloracion = (TipoValoracion)this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipovaloracion = (TipoValoracion)this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipovaloracion!=null) {
						this.tipovaloracion = tipovaloracion;
					} else {
						this.tipovaloracion = new TipoValoracion();
					}
				}

				if(this.isTienePermisosLunaSistemaSolar && this.permiteMantenimiento(this.tipovaloracion)) {
					LunaSistemaSolarBeanSwingJInternalFrame lunasistemasolarBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFramePopup=new LunaSistemaSolarBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						lunasistemasolarBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFramePopup;
					} else {
						lunasistemasolarBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame;
					}

					List<TipoValoracion> tipovaloracions=new ArrayList<TipoValoracion>();
					tipovaloracions.add(this.tipovaloracion);
					if(!esRelacionado) {
						//lunasistemasolarBeanSwingJInternalFrame.lunasistemasolarSessionBean.setConGuardarRelaciones(false);
						//lunasistemasolarBeanSwingJInternalFrame.lunasistemasolarSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					lunasistemasolarBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoValoracion.cargarLunaSistemaSolarBeanSwingJInternalFrame(tipovaloracions,this.tipovaloracion,lunasistemasolarBeanSwingJInternalFrame,/*conInicializar,*/lunasistemasolarBeanSwingJInternalFrame.lunasistemasolarSessionBean.getConGuardarRelaciones(),lunasistemasolarBeanSwingJInternalFrame.lunasistemasolarSessionBean.getEsGuardarRelacionado());
					lunasistemasolarBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						lunasistemasolarBeanSwingJInternalFrame.actualizarEstadoPanelsLunaSistemaSolar("no_relacionado");

						lunasistemasolarBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(LunaSistemaSolarConstantesFunciones.ITAMANIOFILATABLA + (LunaSistemaSolarConstantesFunciones.ITAMANIOFILATABLA/2));

						lunasistemasolarBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoValoracion=(TitledBorder)this.jScrollPanelDatosTipoValoracion.getBorder();
						TitledBorder titledBorderLunaSistemaSolar=(TitledBorder)lunasistemasolarBeanSwingJInternalFrame.jScrollPanelDatosLunaSistemaSolar.getBorder();

						titledBorderLunaSistemaSolar.setTitle(titledBorderTipoValoracion.getTitle() + " -> Luna Sistema Solar");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,lunasistemasolarBeanSwingJInternalFrame);
						}

						lunasistemasolarBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(lunasistemasolarBeanSwingJInternalFrame);

						lunasistemasolarBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipovaloracionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Luna Sistema Solar",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonPlanetaSistemaSolarActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoValoracion tipovaloracion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoValoracion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovaloracion = (TipoValoracion)this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipovaloracion = (TipoValoracion)this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipovaloracion!=null) {
						this.tipovaloracion = tipovaloracion;
					} else {
						this.tipovaloracion = new TipoValoracion();
					}
				}

				if(this.isTienePermisosPlanetaSistemaSolar && this.permiteMantenimiento(this.tipovaloracion)) {
					PlanetaSistemaSolarBeanSwingJInternalFrame planetasistemasolarBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFramePopup=new PlanetaSistemaSolarBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						planetasistemasolarBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFramePopup;
					} else {
						planetasistemasolarBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame;
					}

					List<TipoValoracion> tipovaloracions=new ArrayList<TipoValoracion>();
					tipovaloracions.add(this.tipovaloracion);
					if(!esRelacionado) {
						//planetasistemasolarBeanSwingJInternalFrame.planetasistemasolarSessionBean.setConGuardarRelaciones(false);
						//planetasistemasolarBeanSwingJInternalFrame.planetasistemasolarSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					planetasistemasolarBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoValoracion.cargarPlanetaSistemaSolarBeanSwingJInternalFrame(tipovaloracions,this.tipovaloracion,planetasistemasolarBeanSwingJInternalFrame,/*conInicializar,*/planetasistemasolarBeanSwingJInternalFrame.planetasistemasolarSessionBean.getConGuardarRelaciones(),planetasistemasolarBeanSwingJInternalFrame.planetasistemasolarSessionBean.getEsGuardarRelacionado());
					planetasistemasolarBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						planetasistemasolarBeanSwingJInternalFrame.actualizarEstadoPanelsPlanetaSistemaSolar("no_relacionado");

						planetasistemasolarBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PlanetaSistemaSolarConstantesFunciones.ITAMANIOFILATABLA + (PlanetaSistemaSolarConstantesFunciones.ITAMANIOFILATABLA/2));

						planetasistemasolarBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoValoracion=(TitledBorder)this.jScrollPanelDatosTipoValoracion.getBorder();
						TitledBorder titledBorderPlanetaSistemaSolar=(TitledBorder)planetasistemasolarBeanSwingJInternalFrame.jScrollPanelDatosPlanetaSistemaSolar.getBorder();

						titledBorderPlanetaSistemaSolar.setTitle(titledBorderTipoValoracion.getTitle() + " -> Planeta Sistema Solar");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,planetasistemasolarBeanSwingJInternalFrame);
						}

						planetasistemasolarBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(planetasistemasolarBeanSwingJInternalFrame);

						planetasistemasolarBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipovaloracionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Planeta Sistema Solar",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonReferenciaComercialActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoValoracion tipovaloracion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoValoracion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovaloracion = (TipoValoracion)this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipovaloracion = (TipoValoracion)this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipovaloracion!=null) {
						this.tipovaloracion = tipovaloracion;
					} else {
						this.tipovaloracion = new TipoValoracion();
					}
				}

				if(this.isTienePermisosReferenciaComercial && this.permiteMantenimiento(this.tipovaloracion)) {
					ReferenciaComercialBeanSwingJInternalFrame referenciacomercialBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFramePopup=new ReferenciaComercialBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						referenciacomercialBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFramePopup;
					} else {
						referenciacomercialBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame;
					}

					List<TipoValoracion> tipovaloracions=new ArrayList<TipoValoracion>();
					tipovaloracions.add(this.tipovaloracion);
					if(!esRelacionado) {
						//referenciacomercialBeanSwingJInternalFrame.referenciacomercialSessionBean.setConGuardarRelaciones(false);
						//referenciacomercialBeanSwingJInternalFrame.referenciacomercialSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					referenciacomercialBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoValoracion.cargarReferenciaComercialBeanSwingJInternalFrame(tipovaloracions,this.tipovaloracion,referenciacomercialBeanSwingJInternalFrame,/*conInicializar,*/referenciacomercialBeanSwingJInternalFrame.referenciacomercialSessionBean.getConGuardarRelaciones(),referenciacomercialBeanSwingJInternalFrame.referenciacomercialSessionBean.getEsGuardarRelacionado());
					referenciacomercialBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						referenciacomercialBeanSwingJInternalFrame.actualizarEstadoPanelsReferenciaComercial("no_relacionado");

						referenciacomercialBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ReferenciaComercialConstantesFunciones.ITAMANIOFILATABLA + (ReferenciaComercialConstantesFunciones.ITAMANIOFILATABLA/2));

						referenciacomercialBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoValoracion=(TitledBorder)this.jScrollPanelDatosTipoValoracion.getBorder();
						TitledBorder titledBorderReferenciaComercial=(TitledBorder)referenciacomercialBeanSwingJInternalFrame.jScrollPanelDatosReferenciaComercial.getBorder();

						titledBorderReferenciaComercial.setTitle(titledBorderTipoValoracion.getTitle() + " -> Referencia Comercial");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,referenciacomercialBeanSwingJInternalFrame);
						}

						referenciacomercialBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(referenciacomercialBeanSwingJInternalFrame);

						referenciacomercialBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipovaloracionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Referencia Comercial",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoValoracion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoValoracion.setVisible((this.isVisibilidadCeldaNuevoTipoValoracion && this.isPermisoNuevoTipoValoracion));			
			this.jButtonDuplicarTipoValoracion.setVisible((this.isVisibilidadCeldaDuplicarTipoValoracion && this.isPermisoDuplicarTipoValoracion));			
			this.jButtonCopiarTipoValoracion.setVisible((this.isVisibilidadCeldaCopiarTipoValoracion && this.isPermisoCopiarTipoValoracion));
			this.jButtonVerFormTipoValoracion.setVisible((this.isVisibilidadCeldaVerFormTipoValoracion && this.isPermisoVerFormTipoValoracion));
			
			this.jButtonAbrirOrderByTipoValoracion.setVisible((this.isVisibilidadCeldaOrdenTipoValoracion && this.isPermisoOrdenTipoValoracion));			
			
			this.jButtonNuevoRelacionesTipoValoracion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoValoracion && this.isPermisoNuevoTipoValoracion));			
			this.jButtonNuevoGuardarCambiosTipoValoracion.setVisible((this.isVisibilidadCeldaNuevoTipoValoracion && this.isPermisoNuevoTipoValoracion && this.isPermisoGuardarCambiosTipoValoracion));
			
			if(this.jInternalFrameDetalleFormTipoValoracion!=null) {
			this.jInternalFrameDetalleFormTipoValoracion.jButtonModificarTipoValoracion.setVisible((this.isVisibilidadCeldaModificarTipoValoracion && this.isPermisoActualizarTipoValoracion));	
			this.jInternalFrameDetalleFormTipoValoracion.jButtonActualizarTipoValoracion.setVisible((this.isVisibilidadCeldaActualizarTipoValoracion && this.isPermisoActualizarTipoValoracion));	
			this.jInternalFrameDetalleFormTipoValoracion.jButtonEliminarTipoValoracion.setVisible((this.isVisibilidadCeldaEliminarTipoValoracion && this.isPermisoEliminarTipoValoracion));
			this.jInternalFrameDetalleFormTipoValoracion.jButtonCancelarTipoValoracion.setVisible(this.isVisibilidadCeldaCancelarTipoValoracion);							
			this.jInternalFrameDetalleFormTipoValoracion.jButtonGuardarCambiosTipoValoracion.setVisible((this.isVisibilidadCeldaGuardarTipoValoracion && this.isPermisoGuardarCambiosTipoValoracion));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoValoracion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoValoracion && this.isPermisoGuardarCambiosTipoValoracion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoValoracion.setVisible((this.isVisibilidadCeldaNuevoTipoValoracion && this.isPermisoNuevoTipoValoracion));						
			this.jButtonDuplicarToolBarTipoValoracion.setVisible((this.isVisibilidadCeldaDuplicarTipoValoracion && this.isPermisoDuplicarTipoValoracion));						
			this.jButtonCopiarToolBarTipoValoracion.setVisible((this.isVisibilidadCeldaCopiarTipoValoracion && this.isPermisoCopiarTipoValoracion));			
			this.jButtonVerFormToolBarTipoValoracion.setVisible((this.isVisibilidadCeldaVerFormTipoValoracion && this.isPermisoVerFormTipoValoracion));			
			this.jButtonAbrirOrderByToolBarTipoValoracion.setVisible((this.isVisibilidadCeldaOrdenTipoValoracion && this.isPermisoOrdenTipoValoracion));
			this.jButtonNuevoRelacionesToolBarTipoValoracion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoValoracion && this.isPermisoNuevoTipoValoracion));			
			this.jButtonNuevoGuardarCambiosToolBarTipoValoracion.setVisible((this.isVisibilidadCeldaNuevoTipoValoracion && this.isPermisoNuevoTipoValoracion && this.isPermisoGuardarCambiosTipoValoracion));			
			
			if(this.jInternalFrameDetalleFormTipoValoracion!=null) {
			this.jInternalFrameDetalleFormTipoValoracion.jButtonModificarToolBarTipoValoracion.setVisible((this.isVisibilidadCeldaModificarTipoValoracion && this.isPermisoActualizarTipoValoracion));	
			this.jInternalFrameDetalleFormTipoValoracion.jButtonActualizarToolBarTipoValoracion.setVisible((this.isVisibilidadCeldaActualizarTipoValoracion  && this.isPermisoActualizarTipoValoracion));	
			this.jInternalFrameDetalleFormTipoValoracion.jButtonEliminarToolBarTipoValoracion.setVisible((this.isVisibilidadCeldaEliminarTipoValoracion && this.isPermisoEliminarTipoValoracion));
			this.jInternalFrameDetalleFormTipoValoracion.jButtonCancelarToolBarTipoValoracion.setVisible(this.isVisibilidadCeldaCancelarTipoValoracion);				
			this.jInternalFrameDetalleFormTipoValoracion.jButtonGuardarCambiosToolBarTipoValoracion.setVisible((this.isVisibilidadCeldaGuardarTipoValoracion && this.isPermisoGuardarCambiosTipoValoracion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoValoracion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoValoracion && this.isPermisoGuardarCambiosTipoValoracion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoValoracion.setVisible((this.isVisibilidadCeldaNuevoTipoValoracion && this.isPermisoNuevoTipoValoracion));			
			this.jMenuItemDuplicarTipoValoracion.setVisible((this.isVisibilidadCeldaDuplicarTipoValoracion && this.isPermisoDuplicarTipoValoracion));			
			this.jMenuItemCopiarTipoValoracion.setVisible((this.isVisibilidadCeldaCopiarTipoValoracion && this.isPermisoCopiarTipoValoracion));			
			this.jMenuItemVerFormTipoValoracion.setVisible((this.isVisibilidadCeldaVerFormTipoValoracion && this.isPermisoVerFormTipoValoracion));			
			this.jMenuItemAbrirOrderByTipoValoracion.setVisible((this.isVisibilidadCeldaOrdenTipoValoracion && this.isPermisoOrdenTipoValoracion));			
			//this.jMenuItemMostrarOcultarTipoValoracion.setVisible((this.isVisibilidadCeldaOrdenTipoValoracion && this.isPermisoOrdenTipoValoracion));
			this.jMenuItemDetalleAbrirOrderByTipoValoracion.setVisible((this.isVisibilidadCeldaOrdenTipoValoracion && this.isPermisoOrdenTipoValoracion));			
			//this.jMenuItemDetalleMostrarOcultarTipoValoracion.setVisible((this.isVisibilidadCeldaOrdenTipoValoracion && this.isPermisoOrdenTipoValoracion));			
			this.jMenuItemNuevoRelacionesTipoValoracion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoValoracion && this.isPermisoNuevoTipoValoracion));			
			this.jMenuItemNuevoGuardarCambiosTipoValoracion.setVisible((this.isVisibilidadCeldaNuevoTipoValoracion && this.isPermisoNuevoTipoValoracion && this.isPermisoGuardarCambiosTipoValoracion));									
			
			if(this.jInternalFrameDetalleFormTipoValoracion!=null) {
			this.jInternalFrameDetalleFormTipoValoracion.jMenuItemModificarTipoValoracion.setVisible((this.isVisibilidadCeldaModificarTipoValoracion && this.isPermisoActualizarTipoValoracion));	
			this.jInternalFrameDetalleFormTipoValoracion.jMenuItemActualizarTipoValoracion.setVisible((this.isVisibilidadCeldaActualizarTipoValoracion && this.isPermisoActualizarTipoValoracion));	
			this.jInternalFrameDetalleFormTipoValoracion.jMenuItemEliminarTipoValoracion.setVisible((this.isVisibilidadCeldaEliminarTipoValoracion && this.isPermisoEliminarTipoValoracion));
			this.jInternalFrameDetalleFormTipoValoracion.jMenuItemCancelarTipoValoracion.setVisible(this.isVisibilidadCeldaCancelarTipoValoracion);				
			}
			
			this.jMenuItemGuardarCambiosTipoValoracion.setVisible((this.isVisibilidadCeldaGuardarTipoValoracion && this.isPermisoGuardarCambiosTipoValoracion));						
			this.jMenuItemGuardarCambiosTablaTipoValoracion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoValoracion && this.isPermisoGuardarCambiosTipoValoracion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoValoracion=this.jButtonNuevoTipoValoracion.isVisible();
			this.isVisibilidadCeldaDuplicarTipoValoracion=this.jButtonDuplicarTipoValoracion.isVisible();
			this.isVisibilidadCeldaCopiarTipoValoracion=this.jButtonCopiarTipoValoracion.isVisible();
			this.isVisibilidadCeldaVerFormTipoValoracion=this.jButtonVerFormTipoValoracion.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoValoracion=this.jButtonAbrirOrderByTipoValoracion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoValoracion=this.jButtonNuevoRelacionesTipoValoracion.isVisible();
			this.isVisibilidadCeldaModificarTipoValoracion=this.jButtonModificarTipoValoracion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoValoracion!=null) {
			this.isVisibilidadCeldaActualizarTipoValoracion=this.jInternalFrameDetalleFormTipoValoracion.jButtonActualizarTipoValoracion.isVisible();
			this.isVisibilidadCeldaEliminarTipoValoracion=this.jInternalFrameDetalleFormTipoValoracion.jButtonEliminarTipoValoracion.isVisible();
			this.isVisibilidadCeldaCancelarTipoValoracion=this.jInternalFrameDetalleFormTipoValoracion.jButtonCancelarTipoValoracion.isVisible();
			this.isVisibilidadCeldaGuardarTipoValoracion=this.jInternalFrameDetalleFormTipoValoracion.jButtonGuardarCambiosTipoValoracion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoValoracion=this.jButtonGuardarCambiosTablaTipoValoracion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoValoracion=this.jButtonNuevoToolBarTipoValoracion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoValoracion=this.jButtonNuevoRelacionesToolBarTipoValoracion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoValoracion!=null) {
			this.isVisibilidadCeldaModificarTipoValoracion=this.jInternalFrameDetalleFormTipoValoracion.jButtonModificarToolBarTipoValoracion.isVisible();
			this.isVisibilidadCeldaActualizarTipoValoracion=this.jInternalFrameDetalleFormTipoValoracion.jButtonActualizarToolBarTipoValoracion.isVisible();
			this.isVisibilidadCeldaEliminarTipoValoracion=this.jInternalFrameDetalleFormTipoValoracion.jButtonEliminarToolBarTipoValoracion.isVisible();
			this.isVisibilidadCeldaCancelarTipoValoracion=this.jInternalFrameDetalleFormTipoValoracion.jButtonCancelarToolBarTipoValoracion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoValoracion=this.jButtonGuardarCambiosToolBarTipoValoracion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoValoracion=this.jButtonGuardarCambiosTablaToolBarTipoValoracion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoValoracion=this.jMenuItemNuevoTipoValoracion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoValoracion=this.jMenuItemNuevoRelacionesTipoValoracion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoValoracion!=null) {
			this.isVisibilidadCeldaModificarTipoValoracion=this.jInternalFrameDetalleFormTipoValoracion.jMenuItemModificarTipoValoracion.isVisible();
			this.isVisibilidadCeldaActualizarTipoValoracion=this.jInternalFrameDetalleFormTipoValoracion.jMenuItemActualizarTipoValoracion.isVisible();
			this.isVisibilidadCeldaEliminarTipoValoracion=this.jInternalFrameDetalleFormTipoValoracion.jMenuItemEliminarTipoValoracion.isVisible();
			this.isVisibilidadCeldaCancelarTipoValoracion=this.jInternalFrameDetalleFormTipoValoracion.jMenuItemCancelarTipoValoracion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoValoracion=this.jMenuItemGuardarCambiosTipoValoracion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoValoracion=this.jMenuItemGuardarCambiosTablaTipoValoracion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoValoracion(Boolean esInicializar) {
		if(TipoValoracionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipovaloracionSessionBean.getConGuardarRelaciones()) {
				//if(this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoValoracion();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoValoracion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoValoracion() {
		this.jButtonNuevoTipoValoracion.setVisible(this.isPermisoNuevoTipoValoracion);			
		this.jButtonDuplicarTipoValoracion.setVisible(this.isPermisoDuplicarTipoValoracion);			
		this.jButtonCopiarTipoValoracion.setVisible(this.isPermisoCopiarTipoValoracion);			
		this.jButtonVerFormTipoValoracion.setVisible(this.isPermisoVerFormTipoValoracion);			
		
		this.jButtonAbrirOrderByTipoValoracion.setVisible(this.isPermisoOrdenTipoValoracion);					
		
		this.jButtonNuevoRelacionesTipoValoracion.setVisible(this.isPermisoNuevoTipoValoracion);			
		
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValoracion.jButtonModificarTipoValoracion.setVisible(this.isPermisoActualizarTipoValoracion);	
			this.jInternalFrameDetalleFormTipoValoracion.jButtonActualizarTipoValoracion.setVisible(this.isPermisoActualizarTipoValoracion);	
			this.jInternalFrameDetalleFormTipoValoracion.jButtonEliminarTipoValoracion.setVisible(this.isPermisoEliminarTipoValoracion);
			this.jInternalFrameDetalleFormTipoValoracion.jButtonCancelarTipoValoracion.setVisible(this.isVisibilidadCeldaCancelarTipoValoracion);						
			this.jInternalFrameDetalleFormTipoValoracion.jButtonGuardarCambiosTipoValoracion.setVisible(this.isPermisoGuardarCambiosTipoValoracion);							
		}
		
		this.jButtonGuardarCambiosTablaTipoValoracion.setVisible(this.isPermisoActualizarTipoValoracion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoValoracion() {
		this.jInternalFrameDetalleFormTipoValoracion.jButtonModificarTipoValoracion.setVisible(this.isPermisoActualizarTipoValoracion);	
		this.jInternalFrameDetalleFormTipoValoracion.jButtonActualizarTipoValoracion.setVisible(this.isPermisoActualizarTipoValoracion);	
		this.jInternalFrameDetalleFormTipoValoracion.jButtonEliminarTipoValoracion.setVisible(this.isPermisoEliminarTipoValoracion);
		this.jInternalFrameDetalleFormTipoValoracion.jButtonCancelarTipoValoracion.setVisible(this.isVisibilidadCeldaCancelarTipoValoracion);							
		this.jInternalFrameDetalleFormTipoValoracion.jButtonGuardarCambiosTipoValoracion.setVisible((this.isVisibilidadCeldaGuardarTipoValoracion && this.isPermisoGuardarCambiosTipoValoracion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoValoracion() {
		if(TipoValoracionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoValoracion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoValoracion() {
	}
	
	public void jTableDatosTipoValoracionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoValoracion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoValoracionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoValoracion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoValoracion(this.gettipovaloracion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoValoracion(this.tipovaloracion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovaloracion =(TipoValoracion) this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipovaloracion =(TipoValoracion) this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipovaloracion==null) {
						this.tipovaloracion = new TipoValoracion();
					}

					this.setVariablesFormularioToObjetoActualTipoValoracion(this.tipovaloracion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoValoracion(this.tipovaloracion);
				}

				if(this.tipovaloracion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipovaloracion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoValoracion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoValoracionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoValoracion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoValoracion(this.gettipovaloracion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoValoracion(this.tipovaloracion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovaloracion =(TipoValoracion) this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipovaloracion =(TipoValoracion) this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipovaloracion==null) {
						this.tipovaloracion = new TipoValoracion();
					}

					this.setVariablesFormularioToObjetoActualTipoValoracion(this.tipovaloracion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoValoracion(this.tipovaloracion);
				}

				if(this.tipovaloracion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipovaloracion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoValoracion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoValoracionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoValoracion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoValoracion(this.gettipovaloracion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoValoracion(this.tipovaloracion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovaloracion =(TipoValoracion) this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipovaloracion =(TipoValoracion) this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipovaloracion==null) {
						this.tipovaloracion = new TipoValoracion();
					}

					this.setVariablesFormularioToObjetoActualTipoValoracion(this.tipovaloracion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoValoracion(this.tipovaloracion);
				}

				if(this.tipovaloracion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipovaloracion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoValoracion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoValoracion() {
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) {
		

		if(this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) {
			this.jInternalFrameDetalleFormTipoValoracion.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoValoracion.dispose();
			this.jInternalFrameDetalleFormTipoValoracion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoValoracion!=null) {
			this.jInternalFrameReporteDinamicoTipoValoracion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoValoracion.dispose();
			this.jInternalFrameReporteDinamicoTipoValoracion=null;
		}
		
		if(this.jInternalFrameImportacionTipoValoracion!=null) {
			this.jInternalFrameImportacionTipoValoracion.setVisible(false);	    			
			this.jInternalFrameImportacionTipoValoracion.dispose();
			this.jInternalFrameImportacionTipoValoracion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoValoracion();
			
			TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoValoracion")) {
				jButtonNuevoTipoValoracionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoValoracion")) {
				jButtonDuplicarTipoValoracionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoValoracion")) {
				jButtonCopiarTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoValoracion")) {
				jButtonVerFormTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoValoracion")) {
				jButtonNuevoTipoValoracionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoValoracion")) {
				jButtonDuplicarTipoValoracionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoValoracion")) {
				jButtonNuevoTipoValoracionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoValoracion")) {
				jButtonDuplicarTipoValoracionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoValoracion")) {
				jButtonNuevoTipoValoracionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoValoracion")) {
				jButtonNuevoTipoValoracionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoValoracion")) {
				jButtonNuevoTipoValoracionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoValoracion")) {
				jButtonModificarTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoValoracion")) {
				jButtonModificarTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoValoracion")) {
				jButtonModificarTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoValoracion")) {
				jButtonActualizarTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoValoracion")) {
				jButtonActualizarTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoValoracion")) {
				jButtonActualizarTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoValoracion")) {
				jButtonEliminarTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoValoracion")) {
				jButtonEliminarTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoValoracion")) {
				jButtonEliminarTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoValoracion")) {
				jButtonCancelarTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoValoracion")) {
				jButtonCancelarTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoValoracion")) {
				jButtonCancelarTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoValoracion")) {
				jButtonCerrarTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoValoracion")) {
				jButtonCerrarTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoValoracion")) {
				jButtonCerrarTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoValoracion")) {
				jButtonMostrarOcultarTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoValoracion")) {
				jButtonCancelarTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoValoracion")) {
				jButtonGuardarCambiosTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoValoracion")) {
				jButtonGuardarCambiosTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoValoracion")) {
				jButtonCopiarTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoValoracion")) {
				jButtonVerFormTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoValoracion")) {
				jButtonGuardarCambiosTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoValoracion")) {
				jButtonCopiarTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoValoracion")) {
				jButtonVerFormTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoValoracion")) {
				jButtonGuardarCambiosTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoValoracion")) {
				jButtonGuardarCambiosTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoValoracion")) {
				jButtonGuardarCambiosTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoValoracion")) {
				jButtonRecargarInformacionTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoValoracion")) {
				jButtonRecargarInformacionTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoValoracion")) {
				jButtonRecargarInformacionTipoValoracionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoValoracion")) {
				jButtonAnterioresTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoValoracion")) {
				jButtonAnterioresTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoValoracion")) {
				jButtonAnterioresTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoValoracion")) {
				jButtonSiguientesTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoValoracion")) {
				jButtonSiguientesTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoValoracion")) {
				jButtonSiguientesTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoValoracion") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoValoracion")) {
				jButtonAbrirOrderByTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoValoracion") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoValoracion")) {
				jButtonMostrarOcultarTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoValoracion")) {
				jButtonNuevoGuardarCambiosTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoValoracion")) {
				jButtonNuevoGuardarCambiosTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoValoracion")) {
				jButtonNuevoGuardarCambiosTipoValoracionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoValoracion")) {
				jButtonCerrarReporteDinamicoTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoValoracion")) {
				jButtonGenerarReporteDinamicoTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoValoracion")) {
				
				jButtonGenerarExcelReporteDinamicoTipoValoracionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoValoracion")) {
				jButtonCerrarImportacionTipoValoracionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoValoracion")) {
				
				jButtonGenerarImportacionTipoValoracionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoValoracion")) {
				
				jButtonAbrirImportacionTipoValoracionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoValoracion")) {
				jComboBoxTiposAccionesTipoValoracionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoValoracion")) {
				jComboBoxTiposRelacionesTipoValoracionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoValoracion")) {
				jComboBoxTiposAccionesTipoValoracionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoValoracion")) {
				
				jComboBoxTiposSeleccionarTipoValoracionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoValoracion")) {
				jTextFieldValorCampoGeneralTipoValoracionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoValoracion")) {
				jButtonAbrirOrderByTipoValoracionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoValoracion")) {
				jButtonAbrirOrderByTipoValoracionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoValoracion")) {
				jButtonCerrarOrderByTipoValoracionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoValoracionBusqueda")) {
				this.jButtonidTipoValoracionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoValoracionBusqueda")) {
				this.jButtoncodigoTipoValoracionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoValoracionBusqueda")) {
				this.jButtonnombreTipoValoracionBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoValoracion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoValoracionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovaloracion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovaloracion);
				
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
				
				


				
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoValoracion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoValoracion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoValoracion tipovaloracionLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipovaloracionLocal=this.tipovaloracion;
			} else {
				tipovaloracionLocal=this.tipovaloracionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovaloracion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovaloracion);
				
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
							
				
				


				
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoValoracion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoValoracion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoValoracionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoValoracion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionAnterior =(TipoValoracion) this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovaloracionAnterior =(TipoValoracion) this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
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
			
			TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
			
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
			
			


			
			TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoValoracionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovaloracion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovaloracion);
				
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
								
						
				


				
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoValoracion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoValoracion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovaloracion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovaloracion);
				
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
								
				
				


				
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoValoracion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoValoracion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoValoracionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoValoracion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionAnterior =(TipoValoracion) this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovaloracionAnterior =(TipoValoracion) this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovaloracion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovaloracion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoValoracionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoValoracion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionAnterior =(TipoValoracion) this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovaloracionAnterior =(TipoValoracion) this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoValoracionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovaloracion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipovaloracion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovaloracion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovaloracion);
				
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
							
				
				


				
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoValoracion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoValoracion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoValoracionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoValoracion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovaloracionAnterior =(TipoValoracion) this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipovaloracionAnterior =(TipoValoracion) this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
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
			
			TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
			
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
			
			


			
			TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoValoracionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovaloracion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipovaloracion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovaloracion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovaloracion);
				
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
								
				
				


				
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoValoracion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoValoracion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoValoracionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoValoracion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionAnterior =(TipoValoracion) this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovaloracionAnterior =(TipoValoracion) this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoValoracionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovaloracion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipovaloracion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoValoracionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovaloracion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovaloracion);
				
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoValoracion")) {
					jCheckBoxSeleccionarTodosTipoValoracionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoValoracion")) {
					jCheckBoxSeleccionadosTipoValoracionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoValoracion")) {
					
				}
				
				


				
				
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoValoracion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoValoracion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovaloracion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipovaloracion);
				
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
												
				
				


				
				
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoValoracion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoValoracion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoValoracionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoValoracion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovaloracionAnterior =(TipoValoracion) this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipovaloracionAnterior =(TipoValoracion) this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoValoracionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovaloracion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovaloracion);
				
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
				
				
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
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
			
			TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
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
			
			


			
			TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoValoracionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovaloracion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovaloracion);
				
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoValoracion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoValoracion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovaloracion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovaloracion);
				
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
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
				
				


				
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoValoracion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoValoracion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoValoracionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoValoracion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovaloracionAnterior =(TipoValoracion) this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovaloracionAnterior =(TipoValoracion) this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoValoracion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoValoracionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoValoracion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipovaloracion =(TipoValoracion) this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipovaloracion =(TipoValoracion) this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipovaloracion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoValoracion")) {
				
				}
				
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoValoracion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoValoracion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoValoracion")) {
			
			}
			
			TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoValoracion();
			
			TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
			
			if(sTipo.equals("NuevoTipoValoracion")) {
				jButtonNuevoTipoValoracionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoValoracion")) {
				jButtonDuplicarTipoValoracionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoValoracion")) {
				jButtonCopiarTipoValoracionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoValoracion")) {
				jButtonVerFormTipoValoracionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoValoracion")) {
				jButtonNuevoTipoValoracionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoValoracion")) {
				jButtonModificarTipoValoracionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoValoracion")) {
				jButtonActualizarTipoValoracionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoValoracion")) {
				jButtonEliminarTipoValoracionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoValoracion")) {
				jButtonGuardarCambiosTipoValoracionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoValoracion")) {
				jButtonCancelarTipoValoracionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoValoracion")) {
				jButtonCerrarTipoValoracionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoValoracion")) {
				jButtonGuardarCambiosTipoValoracionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoValoracion")) {
				jButtonNuevoGuardarCambiosTipoValoracionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoValoracion")) {
				jButtonAbrirOrderByTipoValoracionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoValoracion")) {
				jButtonRecargarInformacionTipoValoracionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoValoracion")) {
				jButtonAnterioresTipoValoracionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoValoracion")) {
				jButtonSiguientesTipoValoracionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoValoracionBusqueda")) {
				this.jButtonidTipoValoracionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoValoracionBusqueda")) {
				this.jButtoncodigoTipoValoracionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoValoracionBusqueda")) {
				this.jButtonnombreTipoValoracionBusquedaActionPerformed(evt);
			}
			
			TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoValoracion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoValoracion")) {
				closingInternalFrameTipoValoracion();
				
			} else if(sTipo.equals("jButtonCancelarTipoValoracion")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoValoracion = (JInternalFrameBase)evt.getSource();
	            	
	            TipoValoracionBeanSwingJInternalFrame jInternalFrameParent=(TipoValoracionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoValoracion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoValoracionActionPerformed(null);
			}
			
			TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipovaloracion,new Object(),this.tipovaloracionParameterGeneral,this.tipovaloracionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoValoracion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoValoracion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoValoracion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipovaloracion)) {
			if(!esControlTabla) {
				if(TipoValoracionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoValoracion(this.tipovaloracion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoValoracion(this.tipovaloracion);			
				}
				
				if(this.tipovaloracionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoValoracion(this.tipovaloracion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipovaloracionReturnGeneral=tipovaloracionLogic.procesarEventosTipoValoracionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipovaloracionLogic.getTipoValoracions(),this.tipovaloracion,this.tipovaloracionParameterGeneral,this.isEsNuevoTipoValoracion,classes);//this.tipovaloracionLogic.getTipoValoracion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoValoracion(this.tipovaloracionReturnGeneral,this.tipovaloracionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipovaloracionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoValoracion(classes,this.tipovaloracionReturnGeneral,this.tipovaloracionBean,false);
					}
						
					if(this.tipovaloracionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoValoracion(this.tipovaloracionReturnGeneral.getTipoValoracion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoValoracion(this.tipovaloracionReturnGeneral.getTipoValoracion());	
					}
						
					if(this.tipovaloracionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoValoracion(this.tipovaloracionReturnGeneral.getTipoValoracion(),classes);//this.tipovaloracionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoValoracion(this.tipovaloracion,classes);//this.tipovaloracionBean);									
				}
			
				if(TipoValoracionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoValoracion(this.tipovaloracion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoValoracion(this.tipovaloracion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipovaloracionAnterior!=null) {
						this.tipovaloracion=this.tipovaloracionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipovaloracionReturnGeneral=tipovaloracionLogic.procesarEventosTipoValoracionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipovaloracionLogic.getTipoValoracions(),this.tipovaloracion,this.tipovaloracionParameterGeneral,this.isEsNuevoTipoValoracion,classes);//this.tipovaloracionLogic.getTipoValoracion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipovaloracionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipovaloracionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipovaloracionReturnGeneral.getTipoValoracion(),tipovaloracionLogic.getTipoValoracions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipovaloracionReturnGeneral.getTipoValoracion(),this.tipovaloracions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoValoracion.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoValoracion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoValoracion();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoValoracion() throws Exception {
		
		TipoValoracionModel tipovaloracionModel=(TipoValoracionModel)this.jTableDatosTipoValoracion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipovaloracionModel.tipovaloracions=this.tipovaloracionLogic.getTipoValoracions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipovaloracionModel.tipovaloracions=this.tipovaloracions;
		}
		
		
		((TipoValoracionModel) this.jTableDatosTipoValoracion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoValoracion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipovaloracionAnterior(),this.tipovaloracionLogic.getTipoValoracions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipovaloracionAnterior(),this.tipovaloracions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoValoracion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoValoracion(TipoValoracion tipovaloracion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ReferenciaBancaria.class)) {
					this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.setReferenciaBancarias(tipovaloracion.getReferenciaBancarias());
					this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferenciaBancaria(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(LunaSistemaSolar.class)) {
					this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame.lunasistemasolarLogic.setLunaSistemaSolars(tipovaloracion.getLunaSistemaSolars());
					this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame.inicializarActualizarBindingTablaLunaSistemaSolar(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PlanetaSistemaSolar.class)) {
					this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame.planetasistemasolarLogic.setPlanetaSistemaSolars(tipovaloracion.getPlanetaSistemaSolars());
					this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame.inicializarActualizarBindingTablaPlanetaSistemaSolar(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ReferenciaComercial.class)) {
					this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame.referenciacomercialLogic.setReferenciaComercials(tipovaloracion.getReferenciaComercials());
					this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferenciaComercial(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
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
										
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipovaloracion,new Object(),generalEntityParameterGeneral,this.tipovaloracionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipovaloracionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoValoracionConstantesFunciones.getClassesRelationshipsOfTipoValoracion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoValoracionConstantesFunciones.getClassesRelationshipsFromStringsOfTipoValoracion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoValoracion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoValoracionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipovaloracion,new Object(),generalEntityParameterGeneral,this.tipovaloracionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoValoracion(TipoValoracionBean tipovaloracionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ReferenciaBancaria.class)) {
					this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.setReferenciaBancarias(tipovaloracion.getReferenciaBancarias());
					this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferenciaBancaria(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(LunaSistemaSolar.class)) {
					this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame.lunasistemasolarLogic.setLunaSistemaSolars(tipovaloracion.getLunaSistemaSolars());
					this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame.inicializarActualizarBindingTablaLunaSistemaSolar(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PlanetaSistemaSolar.class)) {
					this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame.planetasistemasolarLogic.setPlanetaSistemaSolars(tipovaloracion.getPlanetaSistemaSolars());
					this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame.inicializarActualizarBindingTablaPlanetaSistemaSolar(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ReferenciaComercial.class)) {
					this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame.referenciacomercialLogic.setReferenciaComercials(tipovaloracion.getReferenciaComercials());
					this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferenciaComercial(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoValoracion(ArrayList<Classe> classes,TipoValoracionReturnGeneral tipovaloracionReturnGeneral,TipoValoracionBean tipovaloracionBean,Boolean conDefault) throws Exception {
		
			this.tipovaloracionBean.setReferenciaBancarias(tipovaloracionReturnGeneral.getTipoValoracion().getReferenciaBancarias());
			this.tipovaloracionBean.setLunaSistemaSolars(tipovaloracionReturnGeneral.getTipoValoracion().getLunaSistemaSolars());
			this.tipovaloracionBean.setPlanetaSistemaSolars(tipovaloracionReturnGeneral.getTipoValoracion().getPlanetaSistemaSolars());
			this.tipovaloracionBean.setReferenciaComercials(tipovaloracionReturnGeneral.getTipoValoracion().getReferenciaComercials());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoValoracion(TipoValoracion tipovaloracion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ReferenciaBancaria.class)) {
					tipovaloracion.setReferenciaBancarias(this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(LunaSistemaSolar.class)) {
					tipovaloracion.setLunaSistemaSolars(this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarBeanSwingJInternalFrame.lunasistemasolarLogic.getLunaSistemaSolars());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PlanetaSistemaSolar.class)) {
					tipovaloracion.setPlanetaSistemaSolars(this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarBeanSwingJInternalFrame.planetasistemasolarLogic.getPlanetaSistemaSolars());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ReferenciaComercial.class)) {
					tipovaloracion.setReferenciaComercials(this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialBeanSwingJInternalFrame.referenciacomercialLogic.getReferenciaComercials());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipovaloracion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoValoracion = new TipoValoracionDetalleFormJInternalFrame(jDesktopPane,this.tipovaloracionSessionBean.getConGuardarRelaciones(),this.tipovaloracionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoValoracion);
		this.jInternalFrameDetalleFormTipoValoracion.setVisible(false);
		this.jInternalFrameDetalleFormTipoValoracion.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoValoracion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoValoracion.tipovaloracionLogic=this.tipovaloracionLogic;
		
		this.cargarCombosFrameForeignKeyTipoValoracion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoValoracion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoValoracion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoValoracion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoValoracion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoValoracion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoValoracion"));
		
		this.jInternalFrameDetalleFormTipoValoracion.jButtonModificarTipoValoracion.addActionListener(new ButtonActionListener(this,"ModificarTipoValoracion"));

		
		this.jInternalFrameDetalleFormTipoValoracion.jButtonModificarToolBarTipoValoracion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoValoracion"));
					
		this.jInternalFrameDetalleFormTipoValoracion.jMenuItemModificarTipoValoracion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoValoracion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoValoracion.jButtonActualizarTipoValoracion.addActionListener (new ButtonActionListener(this,"ActualizarTipoValoracion"));
		
		
		this.jInternalFrameDetalleFormTipoValoracion.jButtonActualizarToolBarTipoValoracion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoValoracion"));
						
		this.jInternalFrameDetalleFormTipoValoracion.jMenuItemActualizarTipoValoracion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoValoracion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoValoracion.jButtonEliminarTipoValoracion.addActionListener (new ButtonActionListener(this,"EliminarTipoValoracion"));
		
		
		this.jInternalFrameDetalleFormTipoValoracion.jButtonEliminarToolBarTipoValoracion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoValoracion"));
								
		this.jInternalFrameDetalleFormTipoValoracion.jMenuItemEliminarTipoValoracion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoValoracion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoValoracion.jButtonCancelarTipoValoracion.addActionListener (new ButtonActionListener(this,"CancelarTipoValoracion"));
		
		
		this.jInternalFrameDetalleFormTipoValoracion.jButtonCancelarToolBarTipoValoracion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoValoracion"));
					
		this.jInternalFrameDetalleFormTipoValoracion.jMenuItemCancelarTipoValoracion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoValoracion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoValoracion.jMenuItemDetalleCerrarTipoValoracion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoValoracion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoValoracion.jButtonGuardarCambiosToolBarTipoValoracion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoValoracion"));
		
		
		
		this.jInternalFrameDetalleFormTipoValoracion.jButtonGuardarCambiosToolBarTipoValoracion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoValoracion"));
		
		
		
		this.jInternalFrameDetalleFormTipoValoracion.jComboBoxTiposAccionesFormularioTipoValoracion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoValoracion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoValoracion.jButtonidTipoValoracionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoValoracionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoValoracion.jButtoncodigoTipoValoracionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoValoracionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoValoracion.jButtonnombreTipoValoracionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoValoracionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoValoracion.jTabbedPaneRelacionesTipoValoracion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoValoracion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoValoracion"));
		
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValoracion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoValoracion"));
		}
		
		this.jTableDatosTipoValoracion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoValoracion"));
		
		this.jTableDatosTipoValoracion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoValoracion"));
		
		this.jButtonNuevoTipoValoracion.addActionListener(new ButtonActionListener(this,"NuevoTipoValoracion"));
		
		this.jButtonDuplicarTipoValoracion.addActionListener(new ButtonActionListener(this,"DuplicarTipoValoracion"));
		
		this.jButtonCopiarTipoValoracion.addActionListener(new ButtonActionListener(this,"CopiarTipoValoracion"));
		
		this.jButtonVerFormTipoValoracion.addActionListener(new ButtonActionListener(this,"VerFormTipoValoracion"));
		
		
		this.jButtonNuevoToolBarTipoValoracion.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoValoracion"));
			
		this.jButtonDuplicarToolBarTipoValoracion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoValoracion"));
			
		this.jMenuItemNuevoTipoValoracion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoValoracion"));
			
		this.jMenuItemDuplicarTipoValoracion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoValoracion"));		
		
		
		this.jButtonNuevoRelacionesTipoValoracion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoValoracion"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoValoracion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoValoracion"));
			
		this.jMenuItemNuevoRelacionesTipoValoracion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoValoracion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValoracion.jButtonModificarTipoValoracion.addActionListener(new ButtonActionListener(this,"ModificarTipoValoracion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValoracion.jButtonModificarToolBarTipoValoracion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoValoracion"));
			
			this.jInternalFrameDetalleFormTipoValoracion.jMenuItemModificarTipoValoracion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoValoracion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoValoracion.jButtonActualizarTipoValoracion.addActionListener (new ButtonActionListener(this,"ActualizarTipoValoracion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValoracion.jButtonActualizarToolBarTipoValoracion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoValoracion"));
				
			this.jInternalFrameDetalleFormTipoValoracion.jMenuItemActualizarTipoValoracion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoValoracion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValoracion.jButtonEliminarTipoValoracion.addActionListener (new ButtonActionListener(this,"EliminarTipoValoracion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValoracion.jButtonEliminarToolBarTipoValoracion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoValoracion"));
						
			this.jInternalFrameDetalleFormTipoValoracion.jMenuItemEliminarTipoValoracion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoValoracion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValoracion.jButtonCancelarTipoValoracion.addActionListener (new ButtonActionListener(this,"CancelarTipoValoracion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValoracion.jButtonCancelarToolBarTipoValoracion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoValoracion"));
			
			this.jInternalFrameDetalleFormTipoValoracion.jMenuItemCancelarTipoValoracion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoValoracion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoValoracion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoValoracion"));		
		
		
		this.jButtonCerrarTipoValoracion.addActionListener (new ButtonActionListener(this,"CerrarTipoValoracion"));
		
		
		this.jButtonCerrarToolBarTipoValoracion.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoValoracion"));
			
		this.jMenuItemCerrarTipoValoracion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoValoracion"));
			
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValoracion.jMenuItemDetalleCerrarTipoValoracion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoValoracion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValoracion.jButtonGuardarCambiosTipoValoracion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoValoracion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValoracion.jButtonGuardarCambiosToolBarTipoValoracion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoValoracion"));
		}
		
		this.jButtonCopiarToolBarTipoValoracion.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoValoracion"));
			
		this.jButtonVerFormToolBarTipoValoracion.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoValoracion"));
		
		this.jMenuItemGuardarCambiosTipoValoracion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoValoracion"));
			
		this.jMenuItemCopiarTipoValoracion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoValoracion"));		
		
		this.jMenuItemVerFormTipoValoracion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoValoracion"));		
		
		
		this.jButtonGuardarCambiosTablaTipoValoracion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoValoracion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoValoracion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoValoracion"));
			
		this.jMenuItemGuardarCambiosTablaTipoValoracion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoValoracion"));		
		
		
		
		this.jButtonRecargarInformacionTipoValoracion.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoValoracion"));
					
		this.jButtonRecargarInformacionToolBarTipoValoracion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoValoracion"));
		
		this.jMenuItemRecargarInformacionTipoValoracion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoValoracion"));		
		
		
		
		this.jButtonAnterioresTipoValoracion.addActionListener (new ButtonActionListener(this,"AnterioresTipoValoracion"));
		
		
		this.jButtonAnterioresToolBarTipoValoracion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoValoracion"));
		
		this.jMenuItemAnterioresTipoValoracion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoValoracion"));		
		
		
		this.jButtonSiguientesTipoValoracion.addActionListener (new ButtonActionListener(this,"SiguientesTipoValoracion"));
		
		
		this.jButtonSiguientesToolBarTipoValoracion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoValoracion"));
			
		this.jMenuItemSiguientesTipoValoracion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoValoracion"));
			
		this.jMenuItemAbrirOrderByTipoValoracion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoValoracion"));
			
		this.jMenuItemMostrarOcultarTipoValoracion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoValoracion"));
			
		this.jMenuItemDetalleAbrirOrderByTipoValoracion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoValoracion"));
			
		this.jMenuItemDetalleMostarOcultarTipoValoracion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoValoracion"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoValoracion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoValoracion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoValoracion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoValoracion"));
			
		this.jMenuItemNuevoGuardarCambiosTipoValoracion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoValoracion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoValoracion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoValoracion"));

		this.jCheckBoxSeleccionadosTipoValoracion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoValoracion"));
		
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValoracion.jComboBoxTiposAccionesFormularioTipoValoracion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoValoracion"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoValoracion.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoValoracion"));
			
		this.jComboBoxTiposAccionesTipoValoracion.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoValoracion"));
					
		this.jComboBoxTiposSeleccionarTipoValoracion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoValoracion"));
			
		this.jTextFieldValorCampoGeneralTipoValoracion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoValoracion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoValoracion.jButtonidTipoValoracionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoValoracionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoValoracion.jButtoncodigoTipoValoracionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoValoracionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoValoracion.jButtonnombreTipoValoracionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoValoracionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoValoracion!=null) {
				this.jInternalFrameReporteDinamicoTipoValoracion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoValoracion"));
				this.jInternalFrameReporteDinamicoTipoValoracion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoValoracion"));
				this.jInternalFrameReporteDinamicoTipoValoracion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoValoracion"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoValoracion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoValoracion"));				
			//this.jButtonGenerarReporteDinamicoTipoValoracion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoValoracion"));
			//this.jButtonGenerarExcelReporteDinamicoTipoValoracion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoValoracion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoValoracion!=null) {
				this.jInternalFrameImportacionTipoValoracion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoValoracion"));
				this.jInternalFrameImportacionTipoValoracion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoValoracion"));
				this.jInternalFrameImportacionTipoValoracion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoValoracion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoValoracion.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoValoracion"));
			
			this.jButtonAbrirOrderByToolBarTipoValoracion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoValoracion"));			
			
			if(this.jInternalFrameOrderByTipoValoracion!=null) {
				this.jInternalFrameOrderByTipoValoracion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoValoracion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoValoracion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValoracion.jTabbedPaneRelacionesTipoValoracion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoValoracion"));
		
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
            		closingInternalFrameTipoValoracion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoValoracion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoValoracion = (JInternalFrameBase)event.getSource();
	            	
	            TipoValoracionBeanSwingJInternalFrame jInternalFrameParent=(TipoValoracionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoValoracion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoValoracionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoValoracion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoValoracionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoValoracion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoValoracion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoValoracionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoValoracionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoValoracionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoValoracion";
		inputMap = this.jButtonNuevoTipoValoracion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoValoracion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoValoracionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoValoracionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoValoracionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoValoracionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoValoracion";
		inputMap = this.jButtonNuevoRelacionesTipoValoracion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoValoracion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoValoracionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoValoracion";
		inputMap = this.jButtonModificarTipoValoracion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoValoracion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoValoracionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoValoracion";
		inputMap = this.jButtonActualizarTipoValoracion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoValoracion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoValoracionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoValoracion";
		inputMap = this.jButtonEliminarTipoValoracion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoValoracion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoValoracionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoValoracion";
		inputMap = this.jButtonCancelarTipoValoracion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoValoracion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoValoracionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoValoracion";
		inputMap = this.jButtonCerrarTipoValoracion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoValoracion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoValoracionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoValoracion.jButtonGuardarCambiosTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoValoracion";
		inputMap = this.jInternalFrameDetalleFormTipoValoracion.jButtonGuardarCambiosTipoValoracion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoValoracion.jButtonGuardarCambiosTipoValoracion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoValoracionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoValoracion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoValoracionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoValoracion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoValoracionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoValoracion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoValoracionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoValoracion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoValoracionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoValoracion.jButtonidTipoValoracionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoValoracionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoValoracion.jButtoncodigoTipoValoracionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoValoracionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoValoracion.jButtonnombreTipoValoracionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoValoracionBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoValoracion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoValoracionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoValoracionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoValoracion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoValoracion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoValoracion tipovaloracionAux:this.tipovaloracionLogic.getTipoValoracions()) {
					tipovaloracionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoValoracion tipovaloracionAux:tipovaloracions) {
					tipovaloracionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoValoracionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoValoracion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoValoracion tipovaloracionAux:this.tipovaloracionLogic.getTipoValoracions()) {
						tipovaloracionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoValoracion tipovaloracionAux:tipovaloracions) {
						tipovaloracionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoValoracion tipovaloracionAux:this.tipovaloracionLogic.getTipoValoracions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoValoracion tipovaloracionAux:tipovaloracions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoValoracion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoValoracion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoValoracion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoValoracion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoValoracionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoValoracion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoValoracion.getSelectedRows();
			
			TipoValoracion tipovaloracionLocal=new TipoValoracion();
			
			//this.seleccionarTodosTipoValoracion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipovaloracionLocal =(TipoValoracion) this.tipovaloracionLogic.getTipoValoracions().toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipovaloracionLocal =(TipoValoracion) this.tipovaloracions.toArray()[this.jTableDatosTipoValoracion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipovaloracionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoValoracion tipovaloracionAux:this.tipovaloracionLogic.getTipoValoracions()) {
						tipovaloracionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoValoracion tipovaloracionAux:tipovaloracions) {
						tipovaloracionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoValoracion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoValoracion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoValoracion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoValoracion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoValoracionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoValoracionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoValoracionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoValoracion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoValoracion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoValoracion tipovaloracionAux:this.tipovaloracionLogic.getTipoValoracions()) {
				
						if(sTipoSeleccionar.equals(TipoValoracionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipovaloracionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoValoracionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipovaloracionAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoValoracion tipovaloracionAux:tipovaloracions) {
					
						if(sTipoSeleccionar.equals(TipoValoracionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipovaloracionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoValoracionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipovaloracionAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoValoracion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoValoracionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoValoracion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoValoracion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoValoracion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoValoracion.jComboBoxTiposAccionesFormularioTipoValoracion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoValoracion) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoValoracion(conSplash);
				
					this.generarReporteTipoValoracionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoValoracion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoValoracion.jComboBoxTiposAccionesFormularioTipoValoracion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoValoracionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoValoracion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoValoracionsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoValoracion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoValoracionsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoValoracion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoValoracion();
				
				this.exportarTipoValoracionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoValoracion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoValoracion.jComboBoxTiposAccionesFormularioTipoValoracion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoValoracions();
				//this.importarTipoValoracions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoValoracion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoValoracion.jComboBoxTiposAccionesFormularioTipoValoracion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoValoracion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoValoracionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoValoracion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Valoracion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoValoracion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoValoracion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoValoracion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Valoracion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoValoracion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoValoracion.jComboBoxTiposAccionesFormularioTipoValoracion.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoValoracion();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoValoracion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoValoracionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoValoracion();
			
			if(this.jInternalFrameDetalleFormTipoValoracion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoValoracion> tipovaloracionsSeleccionados=new ArrayList<TipoValoracion>();		
			TipoValoracion tipovaloracion=new TipoValoracion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoValoracion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoValoracion.getSelectedItem();
			
			
			
			
			tipovaloracionsSeleccionados=this.getTipoValoracionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipovaloracionsSeleccionados.size()==1) {
				for(TipoValoracion tipovaloracionAux:tipovaloracionsSeleccionados) {
					tipovaloracion=tipovaloracionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Referencia Bancaria")) {
					jButtonReferenciaBancariaActionPerformed(null,rowIndex,true,false,tipovaloracion);
				}
				else if(this.sTipoRelacion.equals("Luna Sistema Solar")) {
					jButtonLunaSistemaSolarActionPerformed(null,rowIndex,true,false,tipovaloracion);
				}
				else if(this.sTipoRelacion.equals("Planeta Sistema Solar")) {
					jButtonPlanetaSistemaSolarActionPerformed(null,rowIndex,true,false,tipovaloracion);
				}
				else if(this.sTipoRelacion.equals("Referencia Comercial")) {
					jButtonReferenciaComercialActionPerformed(null,rowIndex,true,false,tipovaloracion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoValoracion();
			
      		//this.finishProcessTipoValoracion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoValoracionReturnGeneral() throws Exception {
		if(this.tipovaloracionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipovaloracionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipovaloracionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipovaloracionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipovaloracionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipovaloracionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoValoracion(false);
		}
		
		if(this.tipovaloracionReturnGeneral.getConRetornoLista() || this.tipovaloracionReturnGeneral.getConRetornoObjeto()) {
			if(this.tipovaloracionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipovaloracionLogic.setTipoValoracions(this.tipovaloracionReturnGeneral.getTipoValoracions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipovaloracionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipovaloracionLogic.setTipoValoracion(this.tipovaloracionReturnGeneral.getTipoValoracion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoValoracion(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoValoracion() throws Exception {
		
		
	}
	
	public ArrayList<TipoValoracion> getTipoValoracionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoValoracion> tipovaloracionsSeleccionados=new ArrayList<TipoValoracion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoValoracion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoValoracion tipovaloracionAux:tipovaloracionLogic.getTipoValoracions()) {
					if(tipovaloracionAux.getIsSelected()) {
						tipovaloracionsSeleccionados.add(tipovaloracionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoValoracion tipovaloracionAux:this.tipovaloracions) {
					if(tipovaloracionAux.getIsSelected()) {
						tipovaloracionsSeleccionados.add(tipovaloracionAux);				
					}
				}
			}
			
			if(tipovaloracionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipovaloracionsSeleccionados.addAll(this.tipovaloracionLogic.getTipoValoracions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipovaloracionsSeleccionados.addAll(this.tipovaloracions);				
					}
				}
			}
		} else {
			tipovaloracionsSeleccionados.add(this.tipovaloracion);
		}
		
		return tipovaloracionsSeleccionados;
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
	
	public void generarReporteTipoValoracionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoValoracionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoValoracionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoValoracionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoValoracionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoValoracionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Valoracion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoValoracionsSeleccionados() throws Exception {
		ArrayList<TipoValoracion> tipovaloracionsSeleccionados=new ArrayList<TipoValoracion>();		
		
		tipovaloracionsSeleccionados=this.getTipoValoracionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoValoracions("Todos",tipovaloracionsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoValoracionsSeleccionados() throws Exception {
		ArrayList<TipoValoracion> tipovaloracionsSeleccionados=new ArrayList<TipoValoracion>();		
		
		tipovaloracionsSeleccionados=this.getTipoValoracionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoValoracions("Todos",tipovaloracionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoValoracionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoValoracion> tipovaloracionsSeleccionados=new ArrayList<TipoValoracion>();
		
		tipovaloracionsSeleccionados=this.getTipoValoracionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoValoracions("Todos",tipovaloracionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoValoracionsSeleccionados() throws Exception {
		ArrayList<TipoValoracion> tipovaloracionsSeleccionados=new ArrayList<TipoValoracion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoValoracion();
		
		
		tipovaloracionsSeleccionados=this.getTipoValoracionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoValoracion();
		
		
		//this.generarReporteTipoValoracions("Todos",tipovaloracionsSeleccionados ,tipovaloracionImplementable,tipovaloracionImplementableHome);
	}
	
	public void mostrarImportacionTipoValoracions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoValoracion();
		
		this.abrirFrameImportacionTipoValoracion();		
		
			
		//this.generarReporteTipoValoracions("Todos",tipovaloracionsSeleccionados ,tipovaloracionImplementable,tipovaloracionImplementableHome);
	}
	
	public void importarTipoValoracions() throws Exception {		
	
	}
	
	public void exportarTipoValoracionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoValoracionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoValoracionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoValoracionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Valoracion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoValoracionsSeleccionados() throws Exception {
		ArrayList<TipoValoracion> tipovaloracionsSeleccionados=new ArrayList<TipoValoracion>();		
		
		tipovaloracionsSeleccionados=this.getTipoValoracionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovaloracion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoValoracion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoValoracion tipovaloracionAux:tipovaloracionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoValoracion(tipovaloracionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipovaloracionAux.setsDetalleGeneralEntityReporte(tipovaloracionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Valoracion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoValoracion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoValoracionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoValoracionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoValoracionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoValoracionConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoValoracion(TipoValoracion tipovaloracion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipovaloracion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipovaloracion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipovaloracion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipovaloracion.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoValoracionsSeleccionados() throws Exception {
		ArrayList<TipoValoracion> tipovaloracionsSeleccionados=new ArrayList<TipoValoracion>();		
		
		tipovaloracionsSeleccionados=this.getTipoValoracionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovaloracion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoValoracions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoValoracion(row);				
				iRow++;
			}				
			
			for(TipoValoracion tipovaloracionAux:tipovaloracionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoValoracion(tipovaloracionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Valoracion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoValoracionsSeleccionados() throws Exception {
		ArrayList<TipoValoracion> tipovaloracionsSeleccionados=new ArrayList<TipoValoracion>();		
		
		tipovaloracionsSeleccionados=this.getTipoValoracionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovaloracion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipovaloracions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipovaloracion");
			//elementRoot.appendChild(element);
		
			for(TipoValoracion tipovaloracionAux:tipovaloracionsSeleccionados) {
				element = document.createElement("tipovaloracion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoValoracion(tipovaloracionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Valoracion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoValoracion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoValoracionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoValoracionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoValoracionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoValoracionConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoValoracion(TipoValoracion tipovaloracion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipovaloracion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipovaloracion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipovaloracion.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoValoracion(TipoValoracion tipovaloracion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoValoracionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipovaloracion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoValoracionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipovaloracion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoValoracionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipovaloracion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoValoracionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipovaloracion.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoValoracionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoValoracion> tipovaloracionsSeleccionados=new ArrayList<TipoValoracion>();
		
		tipovaloracionsSeleccionados=this.getTipoValoracionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoValoracion(tipovaloracionsSeleccionados);
		
		this.generarReporteTipoValoracions("Todos",tipovaloracionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoValoracion(ArrayList<TipoValoracion> tipovaloracionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoValoracion tipovaloracionAux:tipovaloracionsSeleccionados) {
				tipovaloracionAux.setsDetalleGeneralEntityReporte(tipovaloracionAux.toString());
			
				if(sTipoSeleccionar.equals(TipoValoracionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipovaloracionAux.setsDescripcionGeneralEntityReporte1(tipovaloracionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoValoracionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipovaloracionAux.setsDescripcionGeneralEntityReporte1(tipovaloracionAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValoracionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoValoracion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoValoracion=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoValoracion=true;
				this.isVisibilidadCeldaGuardarCambiosTipoValoracion=true;
			}
			
			this.isVisibilidadCeldaModificarTipoValoracion=false;
			this.isVisibilidadCeldaActualizarTipoValoracion=false;
			this.isVisibilidadCeldaEliminarTipoValoracion=false;
			this.isVisibilidadCeldaCancelarTipoValoracion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoValoracion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoValoracion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoValoracion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoValoracion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoValoracion=false;
			this.isVisibilidadCeldaModificarTipoValoracion=false;
			this.isVisibilidadCeldaActualizarTipoValoracion=true;
			this.isVisibilidadCeldaEliminarTipoValoracion=false;
			this.isVisibilidadCeldaCancelarTipoValoracion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoValoracion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoValoracion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoValoracion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoValoracion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoValoracion=false;
			this.isVisibilidadCeldaModificarTipoValoracion=false;
			this.isVisibilidadCeldaActualizarTipoValoracion=true;
			this.isVisibilidadCeldaEliminarTipoValoracion=true;
			this.isVisibilidadCeldaCancelarTipoValoracion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoValoracion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoValoracion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoValoracion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoValoracion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoValoracion=false;
			this.isVisibilidadCeldaModificarTipoValoracion=false;
			this.isVisibilidadCeldaActualizarTipoValoracion=true;
			this.isVisibilidadCeldaEliminarTipoValoracion=false;
			this.isVisibilidadCeldaCancelarTipoValoracion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoValoracion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoValoracion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoValoracion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoValoracion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoValoracion=true;
			this.isVisibilidadCeldaModificarTipoValoracion=false;
			this.isVisibilidadCeldaActualizarTipoValoracion=false;
			this.isVisibilidadCeldaEliminarTipoValoracion=false;
			this.isVisibilidadCeldaCancelarTipoValoracion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoValoracion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoValoracion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoValoracion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoValoracion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoValoracion=false;
			this.isVisibilidadCeldaActualizarTipoValoracion=false;
			this.isVisibilidadCeldaEliminarTipoValoracion=false;
			this.isVisibilidadCeldaCancelarTipoValoracion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoValoracion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoValoracion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoValoracion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoValoracion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoValoracion=false;
			this.isVisibilidadCeldaModificarTipoValoracion=true;
			this.isVisibilidadCeldaActualizarTipoValoracion=false;
			this.isVisibilidadCeldaEliminarTipoValoracion=false;
			this.isVisibilidadCeldaCancelarTipoValoracion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoValoracion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoValoracion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoValoracionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoValoracion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoValoracion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoValoracion=true;
		} else {
			this.actualizarEstadoPanelsTipoValoracion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoValoracion=false;
			//this.isVisibilidadCeldaVerFormTipoValoracion=false;
			this.isVisibilidadCeldaDuplicarTipoValoracion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipovaloracionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoValoracion=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoValoracion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoValoracion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipovaloracionSessionBean.getEsGuardarRelacionado()) {
			if(!tipovaloracionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoValoracion=false;												
			}
			
			this.jButtonCerrarTipoValoracion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoValoracion=false;
		}
		
		if(!this.permiteMantenimiento(this.tipovaloracion)) {
			this.isVisibilidadCeldaActualizarTipoValoracion=false;
			this.isVisibilidadCeldaEliminarTipoValoracion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoValoracion() {
		this.isVisibilidadCeldaNuevoTipoValoracion=false;
		this.isVisibilidadCeldaGuardarCambiosTipoValoracion=false;
	}
	
	public void actualizarEstadoPanelsTipoValoracion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoValoracion!=null) {
				this.jScrollPanelDatosEdicionTipoValoracion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoValoracion!=null) {
				this.jScrollPanelDatosTipoValoracion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoValoracion!=null) {
				this.jPanelPaginacionTipoValoracion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoValoracion!=null) {
				this.jPanelParametrosReportesTipoValoracion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoValoracion!=null) {
				this.jScrollPanelDatosEdicionTipoValoracion.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoValoracion!=null) {
				this.jScrollPanelDatosTipoValoracion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoValoracion!=null) {
				this.jPanelPaginacionTipoValoracion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoValoracion!=null) {
				this.jPanelParametrosReportesTipoValoracion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoValoracion!=null) {
				this.jScrollPanelDatosEdicionTipoValoracion.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoValoracion!=null) {
				this.jScrollPanelDatosTipoValoracion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoValoracion!=null) {
				this.jPanelPaginacionTipoValoracion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoValoracion!=null) {
				this.jPanelParametrosReportesTipoValoracion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoValoracion!=null) {
				this.jScrollPanelDatosEdicionTipoValoracion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoValoracion!=null) {
				this.jScrollPanelDatosTipoValoracion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoValoracion!=null) {
				this.jPanelPaginacionTipoValoracion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoValoracion!=null) {
				this.jPanelParametrosReportesTipoValoracion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoValoracion!=null) {
				this.jScrollPanelDatosEdicionTipoValoracion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoValoracion!=null) {
				this.jScrollPanelDatosTipoValoracion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoValoracion!=null) {
				this.jPanelPaginacionTipoValoracion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoValoracion!=null) {
				this.jPanelParametrosReportesTipoValoracion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoValoracion!=null) {
				this.jScrollPanelDatosEdicionTipoValoracion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoValoracion!=null) {
				this.jScrollPanelDatosTipoValoracion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoValoracion!=null) {
				this.jPanelPaginacionTipoValoracion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoValoracion!=null) {
				this.jPanelParametrosReportesTipoValoracion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoValoracion!=null) {
				this.jScrollPanelDatosEdicionTipoValoracion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoValoracion!=null) {
				this.jScrollPanelDatosTipoValoracion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoValoracion!=null) {
				this.jPanelPaginacionTipoValoracion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoValoracion!=null) {
				this.jPanelParametrosReportesTipoValoracion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoValoracionParaReferenciaBancarias() throws Exception {
		Boolean isPaginaPopupReferenciaBancaria=false;

		try {

			if(this.tipovaloracionSessionBean==null) {
				this.tipovaloracionSessionBean=new TipoValoracionSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaSessionBean.setsPathNavegacionActual(tipovaloracionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupReferenciaBancaria=this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeReferenciaBancaria(false);
			this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeReferenciaBancaria(TipoValoracionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaSessionBean.setisBusquedaDesdeForeignKeySesionTipoValoracion(true);
			this.jInternalFrameDetalleFormTipoValoracion.referenciabancariaSessionBean.setlidTipoValoracionActual(this.idTipoValoracionActual);

			tipovaloracionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoValoracion(true);
			tipovaloracionSessionBean.setlIdTipoValoracionActualForeignKey(this.idTipoValoracionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoValoracionParaLunaSistemaSolares() throws Exception {
		Boolean isPaginaPopupLunaSistemaSolar=false;

		try {

			if(this.tipovaloracionSessionBean==null) {
				this.tipovaloracionSessionBean=new TipoValoracionSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarSessionBean==null) {
				this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarSessionBean=new LunaSistemaSolarSessionBean();
			}

			this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarSessionBean.setsPathNavegacionActual(tipovaloracionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupLunaSistemaSolar=this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeLunaSistemaSolar(true);
			this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeLunaSistemaSolar(TipoValoracionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarSessionBean.setisBusquedaDesdeForeignKeySesionTipoValoracion(true);
			this.jInternalFrameDetalleFormTipoValoracion.lunasistemasolarSessionBean.setlidTipoValoracionActual(this.idTipoValoracionActual);

			tipovaloracionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoValoracion(true);
			tipovaloracionSessionBean.setlIdTipoValoracionActualForeignKey(this.idTipoValoracionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoValoracionParaPlanetaSistemaSolares() throws Exception {
		Boolean isPaginaPopupPlanetaSistemaSolar=false;

		try {

			if(this.tipovaloracionSessionBean==null) {
				this.tipovaloracionSessionBean=new TipoValoracionSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarSessionBean==null) {
				this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarSessionBean=new PlanetaSistemaSolarSessionBean();
			}

			this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarSessionBean.setsPathNavegacionActual(tipovaloracionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPlanetaSistemaSolar=this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePlanetaSistemaSolar(true);
			this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePlanetaSistemaSolar(TipoValoracionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarSessionBean.setisBusquedaDesdeForeignKeySesionTipoValoracion(true);
			this.jInternalFrameDetalleFormTipoValoracion.planetasistemasolarSessionBean.setlidTipoValoracionActual(this.idTipoValoracionActual);

			tipovaloracionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoValoracion(true);
			tipovaloracionSessionBean.setlIdTipoValoracionActualForeignKey(this.idTipoValoracionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoValoracionParaReferenciaComerciales() throws Exception {
		Boolean isPaginaPopupReferenciaComercial=false;

		try {

			if(this.tipovaloracionSessionBean==null) {
				this.tipovaloracionSessionBean=new TipoValoracionSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialSessionBean==null) {
				this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialSessionBean=new ReferenciaComercialSessionBean();
			}

			this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialSessionBean.setsPathNavegacionActual(tipovaloracionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupReferenciaComercial=this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeReferenciaComercial(false);
			this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeReferenciaComercial(TipoValoracionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialSessionBean.setisBusquedaDesdeForeignKeySesionTipoValoracion(true);
			this.jInternalFrameDetalleFormTipoValoracion.referenciacomercialSessionBean.setlidTipoValoracionActual(this.idTipoValoracionActual);

			tipovaloracionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoValoracion(true);
			tipovaloracionSessionBean.setlIdTipoValoracionActualForeignKey(this.idTipoValoracionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoValoracionSessionBean tipovaloracionSessionBean=new TipoValoracionSessionBean();
		
		if(this.tipovaloracionSessionBean==null) {
			this.tipovaloracionSessionBean=new TipoValoracionSessionBean();
		}
		
		this.tipovaloracionSessionBean.setsUltimaBusquedaTipoValoracion(this.getsAccionBusqueda());
		this.tipovaloracionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipovaloracionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoValoracionSessionBean tipovaloracionSessionBean=new TipoValoracionSessionBean();
		
		if(this.tipovaloracionSessionBean==null) {
			this.tipovaloracionSessionBean=new TipoValoracionSessionBean();
		}
		
		if(this.tipovaloracionSessionBean.getsUltimaBusquedaTipoValoracion()!=null&&!this.tipovaloracionSessionBean.getsUltimaBusquedaTipoValoracion().equals("")) {
			this.setsAccionBusqueda(tipovaloracionSessionBean.getsUltimaBusquedaTipoValoracion());
			this.setiNumeroPaginacion(tipovaloracionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipovaloracionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipovaloracionSessionBean.setsUltimaBusquedaTipoValoracion("");
		this.tipovaloracionSessionBean.setiNumeroPaginacion(TipoValoracionConstantesFunciones.INUMEROPAGINACION);
		this.tipovaloracionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoValoracion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoValoracion() {
		this.updateBorderResaltarBusquedasFormularioTipoValoracion();
		this.updateVisibilidadBusquedasFormularioTipoValoracion();
		this.updateHabilitarBusquedasFormularioTipoValoracion();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoValoracion() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoValoracion() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoValoracion() {
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
	
	public void updateControlesFormularioTipoValoracion() throws Exception {

		if(this.jInternalFrameDetalleFormTipoValoracion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoValoracion();
		this.updateVisibilidadResaltarControlesFormularioTipoValoracion();
		this.updateHabilitarResaltarControlesFormularioTipoValoracion();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoValoracion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoValoracion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipovaloracionConstantesFunciones.resaltaridTipoValoracion!=null && this.jInternalFrameDetalleFormTipoValoracion!=null) {this.jInternalFrameDetalleFormTipoValoracion.jTextFieldidTipoValoracion.setBorder(this.tipovaloracionConstantesFunciones.resaltaridTipoValoracion);}
		if(this.tipovaloracionConstantesFunciones.resaltarcodigoTipoValoracion!=null && this.jInternalFrameDetalleFormTipoValoracion!=null) {this.jInternalFrameDetalleFormTipoValoracion.jTextFieldcodigoTipoValoracion.setBorder(this.tipovaloracionConstantesFunciones.resaltarcodigoTipoValoracion);}
		if(this.tipovaloracionConstantesFunciones.resaltarnombreTipoValoracion!=null && this.jInternalFrameDetalleFormTipoValoracion!=null) {this.jInternalFrameDetalleFormTipoValoracion.jTextAreanombreTipoValoracion.setBorder(this.tipovaloracionConstantesFunciones.resaltarnombreTipoValoracion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoValoracion() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoValoracion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) {
	
		//this.jInternalFrameDetalleFormTipoValoracion.jTextFieldidTipoValoracion.setVisible(this.tipovaloracionConstantesFunciones.mostraridTipoValoracion);
		this.jInternalFrameDetalleFormTipoValoracion.jPanelidTipoValoracion.setVisible(this.tipovaloracionConstantesFunciones.mostraridTipoValoracion);
		//this.jInternalFrameDetalleFormTipoValoracion.jTextFieldcodigoTipoValoracion.setVisible(this.tipovaloracionConstantesFunciones.mostrarcodigoTipoValoracion);
		this.jInternalFrameDetalleFormTipoValoracion.jPanelcodigoTipoValoracion.setVisible(this.tipovaloracionConstantesFunciones.mostrarcodigoTipoValoracion);
		//this.jInternalFrameDetalleFormTipoValoracion.jTextAreanombreTipoValoracion.setVisible(this.tipovaloracionConstantesFunciones.mostrarnombreTipoValoracion);
		this.jInternalFrameDetalleFormTipoValoracion.jPanelnombreTipoValoracion.setVisible(this.tipovaloracionConstantesFunciones.mostrarnombreTipoValoracion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoValoracion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoValoracion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoValoracion!=null) {
	
		this.jInternalFrameDetalleFormTipoValoracion.jTextFieldidTipoValoracion.setEnabled(this.tipovaloracionConstantesFunciones.activaridTipoValoracion);
		this.jInternalFrameDetalleFormTipoValoracion.jTextFieldcodigoTipoValoracion.setEnabled(this.tipovaloracionConstantesFunciones.activarcodigoTipoValoracion);
		this.jInternalFrameDetalleFormTipoValoracion.jTextAreanombreTipoValoracion.setEnabled(this.tipovaloracionConstantesFunciones.activarnombreTipoValoracion);
		}
	}
	
		
}