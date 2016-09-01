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

import com.bydan.erp.seguridad.util.PlanetaSistemaSolarConstantesFunciones;
import com.bydan.erp.seguridad.util.PlanetaSistemaSolarParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.PlanetaSistemaSolarParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.PlanetaSistemaSolarBean;
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
public class PlanetaSistemaSolarBeanSwingJInternalFrame extends PlanetaSistemaSolarJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PlanetaSistemaSolarBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PlanetaSistemaSolar> planetasistemasolarValidator = new ClassValidator<PlanetaSistemaSolar>(PlanetaSistemaSolar.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PlanetaSistemaSolar planetasistemasolar;	
	public PlanetaSistemaSolar planetasistemasolarAux;
	public PlanetaSistemaSolar planetasistemasolarAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PlanetaSistemaSolar planetasistemasolarTotales;
	public Long idPlanetaSistemaSolarActual;
	public Long iIdNuevoPlanetaSistemaSolar=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboTipoValoracion="";

	public List<TipoValoracion> tipovaloracionsForeignKey;

	public List<TipoValoracion> gettipovaloracionsForeignKey() {
		return tipovaloracionsForeignKey;
	}

	public void settipovaloracionsForeignKey(List<TipoValoracion> tipovaloracionsForeignKey) {
		this.tipovaloracionsForeignKey = tipovaloracionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoValoracion tipovaloracionForeignKey;

	public TipoValoracion gettipovaloracionForeignKey() {
		return tipovaloracionForeignKey;
	}

	public void settipovaloracionForeignKey(TipoValoracion tipovaloracionForeignKey) {
		this.tipovaloracionForeignKey = tipovaloracionForeignKey;
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
	
	public Boolean isPermisoTodoPlanetaSistemaSolar;
	public Boolean isPermisoNuevoPlanetaSistemaSolar;
	public Boolean isPermisoActualizarPlanetaSistemaSolar;
	public Boolean isPermisoActualizarOriginalPlanetaSistemaSolar;
	public Boolean isPermisoEliminarPlanetaSistemaSolar;
	public Boolean isPermisoGuardarCambiosPlanetaSistemaSolar;
	public Boolean isPermisoConsultaPlanetaSistemaSolar;
	public Boolean isPermisoBusquedaPlanetaSistemaSolar;
	public Boolean isPermisoReportePlanetaSistemaSolar;
	public Boolean isPermisoPaginacionMedioPlanetaSistemaSolar;
	public Boolean isPermisoPaginacionAltoPlanetaSistemaSolar;
	public Boolean isPermisoPaginacionTodoPlanetaSistemaSolar;
	public Boolean isPermisoCopiarPlanetaSistemaSolar;
	public Boolean isPermisoVerFormPlanetaSistemaSolar;
	public Boolean isPermisoDuplicarPlanetaSistemaSolar;
	public Boolean isPermisoOrdenPlanetaSistemaSolar;
	
	
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
	
	public PlanetaSistemaSolarParameterReturnGeneral planetasistemasolarReturnGeneral;
	public PlanetaSistemaSolarParameterReturnGeneral planetasistemasolarParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPlanetaSistemaSolar=false;
	public Boolean esParaAccionDesdeFormularioPlanetaSistemaSolar=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PlanetaSistemaSolarSessionBeanAdditional planetasistemasolarSessionBeanAdditional=null;
	
	public PlanetaSistemaSolarSessionBeanAdditional getPlanetaSistemaSolarSessionBeanAdditional() {
		return this.planetasistemasolarSessionBeanAdditional;
	}
	
	public void setPlanetaSistemaSolarSessionBeanAdditional(PlanetaSistemaSolarSessionBeanAdditional planetasistemasolarSessionBeanAdditional) {
		try {
			this.planetasistemasolarSessionBeanAdditional=planetasistemasolarSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PlanetaSistemaSolarBeanSwingJInternalFrameAdditional planetasistemasolarBeanSwingJInternalFrameAdditional=null;
	//public class PlanetaSistemaSolarBeanSwingJInternalFrame
	
	public PlanetaSistemaSolarBeanSwingJInternalFrameAdditional getPlanetaSistemaSolarBeanSwingJInternalFrameAdditional() {
		return this.planetasistemasolarBeanSwingJInternalFrameAdditional;
	}
	
	public void setPlanetaSistemaSolarBeanSwingJInternalFrameAdditional(PlanetaSistemaSolarBeanSwingJInternalFrameAdditional planetasistemasolarBeanSwingJInternalFrameAdditional) {
		try {
			this.planetasistemasolarBeanSwingJInternalFrameAdditional=planetasistemasolarBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PlanetaSistemaSolarLogic planetasistemasolarLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PlanetaSistemaSolar planetasistemasolarBean;
	public PlanetaSistemaSolarConstantesFunciones planetasistemasolarConstantesFunciones;
	//public PlanetaSistemaSolarParameterReturnGeneral planetasistemasolarReturnGeneral;
	
	//FK
	
	public TipoValoracionLogic tipovaloracionLogic;
	
	//PARAMETROS
	
	
	//public List<PlanetaSistemaSolar> planetasistemasolars;	
	//public List<PlanetaSistemaSolar> planetasistemasolarsEliminados;
	//public List<PlanetaSistemaSolar> planetasistemasolarsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPlanetaSistemaSolar=false;
	public Boolean isVisibilidadCeldaDuplicarPlanetaSistemaSolar=true;
	public Boolean isVisibilidadCeldaCopiarPlanetaSistemaSolar=true;
	public Boolean isVisibilidadCeldaVerFormPlanetaSistemaSolar=true;
	public Boolean isVisibilidadCeldaOrdenPlanetaSistemaSolar=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar=false;
	public Boolean isVisibilidadCeldaModificarPlanetaSistemaSolar=false;
	public Boolean isVisibilidadCeldaActualizarPlanetaSistemaSolar=false;
	public Boolean isVisibilidadCeldaEliminarPlanetaSistemaSolar=false;
	public Boolean isVisibilidadCeldaCancelarPlanetaSistemaSolar=false;
	public Boolean isVisibilidadCeldaGuardarPlanetaSistemaSolar=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPlanetaSistemaSolar=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadFK_IdTipoValoracion=false;
	
	public Long getiIdNuevoPlanetaSistemaSolar() {
		return this.iIdNuevoPlanetaSistemaSolar;
	}

	public void setiIdNuevoPlanetaSistemaSolar(Long iIdNuevoPlanetaSistemaSolar) {
		this.iIdNuevoPlanetaSistemaSolar = iIdNuevoPlanetaSistemaSolar;
	}
	
	public Long getidPlanetaSistemaSolarActual() {
		return this.idPlanetaSistemaSolarActual;
	}

	public void setidPlanetaSistemaSolarActual(Long idPlanetaSistemaSolarActual) {
		this.idPlanetaSistemaSolarActual = idPlanetaSistemaSolarActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PlanetaSistemaSolar getplanetasistemasolar() {
		return this.planetasistemasolar;
	}

	public void setplanetasistemasolar(PlanetaSistemaSolar planetasistemasolar) {
		this.planetasistemasolar = planetasistemasolar;
	}
	
	public PlanetaSistemaSolar getplanetasistemasolarAux() {
		return this.planetasistemasolarAux;
	}

	public void setplanetasistemasolarAux(PlanetaSistemaSolar planetasistemasolarAux) {
		this.planetasistemasolarAux = planetasistemasolarAux;
	}				
	
	public PlanetaSistemaSolar getplanetasistemasolarAnterior() {
		return this.planetasistemasolarAnterior;
	}

	public void setplanetasistemasolarAnterior(PlanetaSistemaSolar planetasistemasolarAnterior) {
		this.planetasistemasolarAnterior = planetasistemasolarAnterior;
	}	
	
	public PlanetaSistemaSolar getplanetasistemasolarTotales() {
		return this.planetasistemasolarTotales;
	}

	public void setplanetasistemasolarTotales(PlanetaSistemaSolar planetasistemasolarTotales) {
		this.planetasistemasolarTotales = planetasistemasolarTotales;
	}	
	
	public PlanetaSistemaSolar getplanetasistemasolarBean() {
		return this.planetasistemasolarBean;
	}

	public void setplanetasistemasolarBean(PlanetaSistemaSolar planetasistemasolarBean) {
		this.planetasistemasolarBean = planetasistemasolarBean;
	}	
	
	public PlanetaSistemaSolarParameterReturnGeneral getplanetasistemasolarReturnGeneral() {
		return this.planetasistemasolarReturnGeneral;
	}

	public void setplanetasistemasolarReturnGeneral(PlanetaSistemaSolarParameterReturnGeneral planetasistemasolarReturnGeneral) {
		this.planetasistemasolarReturnGeneral = planetasistemasolarReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public Long id_tipo_valoracionFK_IdTipoValoracion=-1L;

	public Long getid_tipo_valoracionFK_IdTipoValoracion() {
		return this.id_tipo_valoracionFK_IdTipoValoracion;
	}

	public void setid_tipo_valoracionFK_IdTipoValoracion(Long id_tipo_valoracionFK_IdTipoValoracion) {
		this.id_tipo_valoracionFK_IdTipoValoracion = id_tipo_valoracionFK_IdTipoValoracion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PlanetaSistemaSolarLogic getPlanetaSistemaSolarLogic()	{		
		return planetasistemasolarLogic;
	}

	public void setPlanetaSistemaSolarLogic(PlanetaSistemaSolarLogic planetasistemasolarLogic) {
		this.planetasistemasolarLogic = planetasistemasolarLogic;
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
	
	public Boolean getIsEsNuevoPlanetaSistemaSolar() {
		return isEsNuevoPlanetaSistemaSolar;
	}

	public void setIsEsNuevoPlanetaSistemaSolar(Boolean isEsNuevoPlanetaSistemaSolar) {
		this.isEsNuevoPlanetaSistemaSolar = isEsNuevoPlanetaSistemaSolar;
	}

	public Boolean getEsParaAccionDesdeFormularioPlanetaSistemaSolar() {
		return esParaAccionDesdeFormularioPlanetaSistemaSolar;
	}
	
	public void setEsParaAccionDesdeFormularioPlanetaSistemaSolar(Boolean esParaAccionDesdeFormularioPlanetaSistemaSolar) {
		this.esParaAccionDesdeFormularioPlanetaSistemaSolar = esParaAccionDesdeFormularioPlanetaSistemaSolar;
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
	
	
	public void cargarCombosTipoValoracionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipovaloracionsForeignKey=new ArrayList<TipoValoracion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoValoracionLogic tipovaloracionLogic=new TipoValoracionLogic();

			tipovaloracionLogic.getTipoValoracionDataAccess().setIsForForeingKeyData(true);

			if(this.planetasistemasolarSessionBean==null) {
				this.planetasistemasolarSessionBean=new PlanetaSistemaSolarSessionBean();
			}

			if(!this.planetasistemasolarSessionBean.getisBusquedaDesdeForeignKeySesionTipoValoracion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipovaloracionLogic.getTipoValoracionDataAccess().setIsForForeingKeyData(true);

					tipovaloracionLogic.getTodosTipoValoracionsWithConnection(sFinalQuery,new Pagination());

					this.tipovaloracionsForeignKey=tipovaloracionLogic.getTipoValoracions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoValoracion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipovaloracionLogic.getEntityWithConnection(planetasistemasolarSessionBean.getlidTipoValoracionActual());
					this.tipovaloracionsForeignKey.add(tipovaloracionLogic.getTipoValoracion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualTipoValoracionForeignKey(Long idTipoValoracionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoValoracion  tipovaloracionTemp=null;

			for(TipoValoracion tipovaloracionAux:tipovaloracionsForeignKey) {
				if(tipovaloracionAux.getId()!=null && tipovaloracionAux.getId().equals(idTipoValoracionSeleccionado)) {
					tipovaloracionTemp=tipovaloracionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipovaloracionTemp!=null) {

					if(this.planetasistemasolar!=null) {
						this.planetasistemasolar.setTipoValoracion(tipovaloracionTemp);
					}

					if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {
						this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxid_tipo_valoracionPlanetaSistemaSolar.setSelectedItem(tipovaloracionTemp);
					}
				} else {
					//jComboBoxid_tipo_valoracionPlanetaSistemaSolar.setSelectedItem(tipovaloracionTemp);
					if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {
						if(this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxid_tipo_valoracionPlanetaSistemaSolar.getItemCount()>0) {
							this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxid_tipo_valoracionPlanetaSistemaSolar.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoValoracion") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipovaloracionTemp!=null && jComboBoxid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar!=null) {
						jComboBoxid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar.setSelectedItem(tipovaloracionTemp);
					} else {
						if(jComboBoxid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar!=null) {
							//jComboBoxid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar.setSelectedItem(tipovaloracionTemp);
							if(jComboBoxid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar.getItemCount()>0) {
								jComboBoxid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTipoValoracionForeignKeyDescripcion(Long idTipoValoracionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoValoracion  tipovaloracionTemp=null;

			for(TipoValoracion tipovaloracionAux:tipovaloracionsForeignKey) {
				if(tipovaloracionAux.getId()!=null && tipovaloracionAux.getId().equals(idTipoValoracionSeleccionado)) {
					tipovaloracionTemp=tipovaloracionAux;
					break;
				}
			}


			sDescripcion=TipoValoracionConstantesFunciones.getTipoValoracionDescripcion(tipovaloracionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoValoracionForeignKeyGenerico(Long idTipoValoracionSeleccionado,JComboBox jComboBoxid_tipo_valoracionPlanetaSistemaSolarGenerico)throws Exception
	{
		try
		{
			TipoValoracion  tipovaloracionTemp=null;

			for(TipoValoracion tipovaloracionAux:tipovaloracionsForeignKey) {
				if(tipovaloracionAux.getId()!=null && tipovaloracionAux.getId().equals(idTipoValoracionSeleccionado)) {
					tipovaloracionTemp=tipovaloracionAux;
					break;
				}
			}

			if(tipovaloracionTemp!=null) {
				jComboBoxid_tipo_valoracionPlanetaSistemaSolarGenerico.setSelectedItem(tipovaloracionTemp);
			} else {
				if(jComboBoxid_tipo_valoracionPlanetaSistemaSolarGenerico!=null && jComboBoxid_tipo_valoracionPlanetaSistemaSolarGenerico.getItemCount()>0) {
					jComboBoxid_tipo_valoracionPlanetaSistemaSolarGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoValoracionForeignKey(PlanetaSistemaSolar planetasistemasolar,JComboBox jComboBoxid_tipo_valoracionPlanetaSistemaSolarGenerico)throws Exception
	{
		try
		{
			TipoValoracion  tipovaloracionAux=new TipoValoracion();

			if(jComboBoxid_tipo_valoracionPlanetaSistemaSolarGenerico==null) {
				tipovaloracionAux=(TipoValoracion)this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxid_tipo_valoracionPlanetaSistemaSolar.getSelectedItem();
			} else {
				tipovaloracionAux=(TipoValoracion)jComboBoxid_tipo_valoracionPlanetaSistemaSolarGenerico.getSelectedItem();
			}

			if(tipovaloracionAux!=null && tipovaloracionAux.getId()!=null) {
				planetasistemasolar.setid_tipo_valoracion(tipovaloracionAux.getId());
				planetasistemasolar.settipovaloracion_descripcion(PlanetaSistemaSolarConstantesFunciones.getTipoValoracionDescripcion(tipovaloracionAux));
				planetasistemasolar.setTipoValoracion(tipovaloracionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoValoracionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoValoracion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) { 
							this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxid_tipo_valoracionPlanetaSistemaSolar.removeAllItems();

							for(TipoValoracion tipovaloracion:this.tipovaloracionsForeignKey) {
								this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxid_tipo_valoracionPlanetaSistemaSolar.addItem(tipovaloracion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) { 
					}

					if(!PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoValoracion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar.removeAllItems();

							for(TipoValoracion tipovaloracion:this.tipovaloracionsForeignKey) {
								this.jComboBoxid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar.addItem(tipovaloracion);
							}
						}

						if(!PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameTipoValoracionForeignKey(TipoValoracion tipovaloracion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {
							this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxid_tipo_valoracionPlanetaSistemaSolar.setSelectedItem(tipovaloracion);
						}
					} else {
						if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {
							this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxid_tipo_valoracionPlanetaSistemaSolar.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar.setSelectedItem(tipovaloracion);
						} else {
							this.jComboBoxid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPlanetaSistemaSolar() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PlanetaSistemaSolarConstantesFunciones.refrescarForeignKeysDescripcionesPlanetaSistemaSolar(this.planetasistemasolarLogic.getPlanetaSistemaSolars());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PlanetaSistemaSolarConstantesFunciones.refrescarForeignKeysDescripcionesPlanetaSistemaSolar(this.planetasistemasolars);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(TipoValoracion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//planetasistemasolarLogic.setPlanetaSistemaSolars(this.planetasistemasolars);
			planetasistemasolarLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PlanetaSistemaSolarParameterReturnGeneral getPlanetaSistemaSolarParameterGeneral() {
		return this.planetasistemasolarParameterGeneral;
	}
	
	public void setPlanetaSistemaSolarParameterGeneral(PlanetaSistemaSolarParameterReturnGeneral planetasistemasolarParameterGeneral) {
		this.planetasistemasolarParameterGeneral = planetasistemasolarParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPlanetaSistemaSolar() {
		return isPermisoTodoPlanetaSistemaSolar;
	}

	public void setIsPermisoTodoPlanetaSistemaSolar(Boolean isPermisoTodoPlanetaSistemaSolar) {
		this.isPermisoTodoPlanetaSistemaSolar = isPermisoTodoPlanetaSistemaSolar;
	}

	public Boolean getIsPermisoNuevoPlanetaSistemaSolar() {
		return isPermisoNuevoPlanetaSistemaSolar;
	}

	public void setIsPermisoNuevoPlanetaSistemaSolar(Boolean isPermisoNuevoPlanetaSistemaSolar) {
		this.isPermisoNuevoPlanetaSistemaSolar = isPermisoNuevoPlanetaSistemaSolar;
	}

	public Boolean getIsPermisoActualizarPlanetaSistemaSolar() {
		return isPermisoActualizarPlanetaSistemaSolar;
	}

	public void setIsPermisoActualizarPlanetaSistemaSolar(Boolean isPermisoActualizarPlanetaSistemaSolar) {
		this.isPermisoActualizarPlanetaSistemaSolar = isPermisoActualizarPlanetaSistemaSolar;
	}

	public Boolean getIsPermisoEliminarPlanetaSistemaSolar() {
		return isPermisoEliminarPlanetaSistemaSolar;
	}

	public void setIsPermisoEliminarPlanetaSistemaSolar(Boolean isPermisoEliminarPlanetaSistemaSolar) {
		this.isPermisoEliminarPlanetaSistemaSolar = isPermisoEliminarPlanetaSistemaSolar;
	}

	public Boolean getIsPermisoGuardarCambiosPlanetaSistemaSolar() {
		return isPermisoGuardarCambiosPlanetaSistemaSolar;
	}

	public void setIsPermisoGuardarCambiosPlanetaSistemaSolar(Boolean isPermisoGuardarCambiosPlanetaSistemaSolar) {
		this.isPermisoGuardarCambiosPlanetaSistemaSolar = isPermisoGuardarCambiosPlanetaSistemaSolar;
	}
	
	public Boolean getIsPermisoConsultaPlanetaSistemaSolar() {
		return isPermisoConsultaPlanetaSistemaSolar;
	}

	public void setIsPermisoConsultaPlanetaSistemaSolar(Boolean isPermisoConsultaPlanetaSistemaSolar) {
		this.isPermisoConsultaPlanetaSistemaSolar = isPermisoConsultaPlanetaSistemaSolar;
	}

	public Boolean getIsPermisoBusquedaPlanetaSistemaSolar() {
		return isPermisoBusquedaPlanetaSistemaSolar;
	}

	public void setIsPermisoBusquedaPlanetaSistemaSolar(Boolean isPermisoBusquedaPlanetaSistemaSolar) {
		this.isPermisoBusquedaPlanetaSistemaSolar = isPermisoBusquedaPlanetaSistemaSolar;
	}

	public Boolean getIsPermisoReportePlanetaSistemaSolar() {
		return isPermisoReportePlanetaSistemaSolar;
	}

	public void setIsPermisoReportePlanetaSistemaSolar(Boolean isPermisoReportePlanetaSistemaSolar) {
		this.isPermisoReportePlanetaSistemaSolar = isPermisoReportePlanetaSistemaSolar;
	}
	
	public Boolean getIsPermisoPaginacionMedioPlanetaSistemaSolar() {
		return isPermisoPaginacionMedioPlanetaSistemaSolar;
	}

	public void setIsPermisoPaginacionMedioPlanetaSistemaSolar(Boolean isPermisoPaginacionMedioPlanetaSistemaSolar) {
		this.isPermisoPaginacionMedioPlanetaSistemaSolar = isPermisoPaginacionMedioPlanetaSistemaSolar;
	}
	
	public Boolean getIsPermisoPaginacionTodoPlanetaSistemaSolar() {
		return isPermisoPaginacionTodoPlanetaSistemaSolar;
	}

	public void setIsPermisoPaginacionTodoPlanetaSistemaSolar(Boolean isPermisoPaginacionTodoPlanetaSistemaSolar) {
		this.isPermisoPaginacionTodoPlanetaSistemaSolar = isPermisoPaginacionTodoPlanetaSistemaSolar;
	}
	
	public Boolean getIsPermisoPaginacionAltoPlanetaSistemaSolar() {
		return isPermisoPaginacionAltoPlanetaSistemaSolar;
	}

	public void setIsPermisoPaginacionAltoPlanetaSistemaSolar(Boolean isPermisoPaginacionAltoPlanetaSistemaSolar) {
		this.isPermisoPaginacionAltoPlanetaSistemaSolar = isPermisoPaginacionAltoPlanetaSistemaSolar;
	}
	
	public Boolean getIsPermisoCopiarPlanetaSistemaSolar() {
		return isPermisoCopiarPlanetaSistemaSolar;
	}

	public void setIsPermisoCopiarPlanetaSistemaSolar(Boolean isPermisoCopiarPlanetaSistemaSolar) {
		this.isPermisoCopiarPlanetaSistemaSolar = isPermisoCopiarPlanetaSistemaSolar;
	}
	
	public Boolean getIsPermisoVerFormPlanetaSistemaSolar() {
		return isPermisoVerFormPlanetaSistemaSolar;
	}

	public void setIsPermisoVerFormPlanetaSistemaSolar(Boolean isPermisoVerFormPlanetaSistemaSolar) {
		this.isPermisoVerFormPlanetaSistemaSolar = isPermisoVerFormPlanetaSistemaSolar;
	}
	
	public Boolean getIsPermisoDuplicarPlanetaSistemaSolar() {
		return isPermisoDuplicarPlanetaSistemaSolar;
	}

	public void setIsPermisoDuplicarPlanetaSistemaSolar(Boolean isPermisoDuplicarPlanetaSistemaSolar) {
		this.isPermisoDuplicarPlanetaSistemaSolar = isPermisoDuplicarPlanetaSistemaSolar;
	}
	
	public Boolean getIsPermisoOrdenPlanetaSistemaSolar() {
		return isPermisoOrdenPlanetaSistemaSolar;
	}

	public void setIsPermisoOrdenPlanetaSistemaSolar(Boolean isPermisoOrdenPlanetaSistemaSolar) {
		this.isPermisoOrdenPlanetaSistemaSolar = isPermisoOrdenPlanetaSistemaSolar;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPlanetaSistemaSolar() {
		return isVisibilidadCeldaNuevoPlanetaSistemaSolar;
	}

	public void setIsVisibilidadCeldaNuevoPlanetaSistemaSolar(Boolean isVisibilidadCeldaNuevoPlanetaSistemaSolar) {
		this.isVisibilidadCeldaNuevoPlanetaSistemaSolar = isVisibilidadCeldaNuevoPlanetaSistemaSolar;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPlanetaSistemaSolar() {
		return isVisibilidadCeldaDuplicarPlanetaSistemaSolar;
	}

	public void setIsVisibilidadCeldaDuplicarPlanetaSistemaSolar(Boolean isVisibilidadCeldaDuplicarPlanetaSistemaSolar) {
		this.isVisibilidadCeldaDuplicarPlanetaSistemaSolar = isVisibilidadCeldaDuplicarPlanetaSistemaSolar;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPlanetaSistemaSolar() {
		return isVisibilidadCeldaCopiarPlanetaSistemaSolar;
	}

	public void setIsVisibilidadCeldaCopiarPlanetaSistemaSolar(Boolean isVisibilidadCeldaCopiarPlanetaSistemaSolar) {
		this.isVisibilidadCeldaCopiarPlanetaSistemaSolar = isVisibilidadCeldaCopiarPlanetaSistemaSolar;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPlanetaSistemaSolar() {
		return isVisibilidadCeldaVerFormPlanetaSistemaSolar;
	}

	public void setIsVisibilidadCeldaVerFormPlanetaSistemaSolar(Boolean isVisibilidadCeldaVerFormPlanetaSistemaSolar) {
		this.isVisibilidadCeldaVerFormPlanetaSistemaSolar = isVisibilidadCeldaVerFormPlanetaSistemaSolar;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPlanetaSistemaSolar() {
		return isVisibilidadCeldaOrdenPlanetaSistemaSolar;
	}

	public void setIsVisibilidadCeldaOrdenPlanetaSistemaSolar(Boolean isVisibilidadCeldaOrdenPlanetaSistemaSolar) {
		this.isVisibilidadCeldaOrdenPlanetaSistemaSolar = isVisibilidadCeldaOrdenPlanetaSistemaSolar;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar() {
		return isVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar(Boolean isVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar) {
		this.isVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar = isVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPlanetaSistemaSolar() {
		return isVisibilidadCeldaModificarPlanetaSistemaSolar;
	}

	public void setIsVisibilidadCeldaModificarPlanetaSistemaSolar(Boolean isVisibilidadCeldaModificarPlanetaSistemaSolar) {
		this.isVisibilidadCeldaModificarPlanetaSistemaSolar = isVisibilidadCeldaModificarPlanetaSistemaSolar;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPlanetaSistemaSolar() {
		return isVisibilidadCeldaActualizarPlanetaSistemaSolar;
	}

	public void setIsVisibilidadCeldaActualizarPlanetaSistemaSolar(Boolean isVisibilidadCeldaActualizarPlanetaSistemaSolar) {
		this.isVisibilidadCeldaActualizarPlanetaSistemaSolar = isVisibilidadCeldaActualizarPlanetaSistemaSolar;
	}

	public Boolean getIsVisibilidadCeldaEliminarPlanetaSistemaSolar() {
		return isVisibilidadCeldaEliminarPlanetaSistemaSolar;
	}

	public void setIsVisibilidadCeldaEliminarPlanetaSistemaSolar(Boolean isVisibilidadCeldaEliminarPlanetaSistemaSolar) {
		this.isVisibilidadCeldaEliminarPlanetaSistemaSolar = isVisibilidadCeldaEliminarPlanetaSistemaSolar;
	}

	public Boolean getIsVisibilidadCeldaCancelarPlanetaSistemaSolar() {
		return isVisibilidadCeldaCancelarPlanetaSistemaSolar;
	}

	public void setIsVisibilidadCeldaCancelarPlanetaSistemaSolar(Boolean isVisibilidadCeldaCancelarPlanetaSistemaSolar) {
		this.isVisibilidadCeldaCancelarPlanetaSistemaSolar = isVisibilidadCeldaCancelarPlanetaSistemaSolar;
	}

	public Boolean getIsVisibilidadCeldaGuardarPlanetaSistemaSolar() {
		return isVisibilidadCeldaGuardarPlanetaSistemaSolar;
	}

	public void setIsVisibilidadCeldaGuardarPlanetaSistemaSolar(Boolean isVisibilidadCeldaGuardarPlanetaSistemaSolar) {
		this.isVisibilidadCeldaGuardarPlanetaSistemaSolar = isVisibilidadCeldaGuardarPlanetaSistemaSolar;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPlanetaSistemaSolar() {
		return isVisibilidadCeldaGuardarCambiosPlanetaSistemaSolar;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPlanetaSistemaSolar(Boolean isVisibilidadCeldaGuardarCambiosPlanetaSistemaSolar) {
		this.isVisibilidadCeldaGuardarCambiosPlanetaSistemaSolar = isVisibilidadCeldaGuardarCambiosPlanetaSistemaSolar;
	}
		
	public PlanetaSistemaSolarSessionBean getplanetasistemasolarSessionBean() {
		return this.planetasistemasolarSessionBean;
	}
	
	public void setplanetasistemasolarSessionBean(PlanetaSistemaSolarSessionBean planetasistemasolarSessionBean) {
		this.planetasistemasolarSessionBean=planetasistemasolarSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadFK_IdTipoValoracion() {
		return this.isVisibilidadFK_IdTipoValoracion;
	}

	public void setisVisibilidadFK_IdTipoValoracion(Boolean isVisibilidadFK_IdTipoValoracion) {
		this.isVisibilidadFK_IdTipoValoracion=isVisibilidadFK_IdTipoValoracion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPlanetaSistemaSolar(PlanetaSistemaSolar planetasistemasolar)throws Exception {
		try {
			
				this.setActualParaGuardarTipoValoracionForeignKey(planetasistemasolar,null);
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
	
	public void bugActualizarReferenciaActual(PlanetaSistemaSolar planetasistemasolar,PlanetaSistemaSolar planetasistemasolarAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPlanetaSistemaSolar(planetasistemasolar);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		planetasistemasolarAux.setId(planetasistemasolar.getId());
		planetasistemasolarAux.setVersionRow(planetasistemasolar.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPlanetaSistemaSolar();
		
			int intSelectedRow = this.jTableDatosPlanetaSistemaSolar.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPlanetaSistemaSolar(this.planetasistemasolar,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPlanetaSistemaSolar(this.planetasistemasolar);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = planetasistemasolarValidator.getInvalidValues(this.planetasistemasolar);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			planetasistemasolarLogic.setDatosCliente(datosCliente);
			planetasistemasolarLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				planetasistemasolarAux=new  PlanetaSistemaSolar();
				
				planetasistemasolarAux.setIsNew(true);
				planetasistemasolarAux.setIsChanged(true);
				
				planetasistemasolarAux.setPlanetaSistemaSolarOriginal(this.planetasistemasolar);
				
				planetasistemasolarAux.setId(this.planetasistemasolar.getId());	
				planetasistemasolarAux.setVersionRow(this.planetasistemasolar.getVersionRow());	
				planetasistemasolarAux.setid_tipo_valoracion(this.planetasistemasolar.getid_tipo_valoracion());	
				planetasistemasolarAux.setcodigo(this.planetasistemasolar.getcodigo());	
				planetasistemasolarAux.setnombre(this.planetasistemasolar.getnombre());	
				planetasistemasolarAux.setdescripcion(this.planetasistemasolar.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.planetasistemasolarSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.planetasistemasolarSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(planetasistemasolarAux,planetasistemasolarLogic.getPlanetaSistemaSolars());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(planetasistemasolarAux,planetasistemasolars);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.planetasistemasolarSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.planetasistemasolarSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						planetasistemasolarLogic.savePlanetaSistemaSolars();//WithConnection
						//planetasistemasolarLogic.getSetVersionRowPlanetaSistemaSolars();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.planetasistemasolar,planetasistemasolarAux);
					
					this.refrescarForeignKeysDescripcionesPlanetaSistemaSolar();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.planetasistemasolarSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				planetasistemasolarAux=new  PlanetaSistemaSolar();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.planetasistemasolarSessionBean.getEsGuardarRelacionado() 
					|| (this.planetasistemasolarSessionBean.getEsGuardarRelacionado() && this.planetasistemasolar.getId()>=0)) {
						
					planetasistemasolarAux.setIsNew(false);
				}
				
				planetasistemasolarAux.setIsDeleted(false);
			
				planetasistemasolarAux.setId(this.planetasistemasolar.getId());	
				planetasistemasolarAux.setVersionRow(this.planetasistemasolar.getVersionRow());	
				planetasistemasolarAux.setid_tipo_valoracion(this.planetasistemasolar.getid_tipo_valoracion());	
				planetasistemasolarAux.setcodigo(this.planetasistemasolar.getcodigo());	
				planetasistemasolarAux.setnombre(this.planetasistemasolar.getnombre());	
				planetasistemasolarAux.setdescripcion(this.planetasistemasolar.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(planetasistemasolarAux,planetasistemasolarLogic.getPlanetaSistemaSolars());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(planetasistemasolarAux,planetasistemasolars);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.planetasistemasolarSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.planetasistemasolarSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						planetasistemasolarLogic.savePlanetaSistemaSolars();//WithConnection
						//planetasistemasolarLogic.getSetVersionRowPlanetaSistemaSolars();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.planetasistemasolar,planetasistemasolarAux);
					
					this.refrescarForeignKeysDescripcionesPlanetaSistemaSolar();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.planetasistemasolarSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				planetasistemasolarAux=new  PlanetaSistemaSolar();
				
				planetasistemasolarAux.setIsNew(false);
				planetasistemasolarAux.setIsChanged(false);
				
				planetasistemasolarAux.setIsDeleted(true);
				
				planetasistemasolarAux.setId(this.planetasistemasolar.getId());	
				planetasistemasolarAux.setVersionRow(this.planetasistemasolar.getVersionRow());	
				planetasistemasolarAux.setid_tipo_valoracion(this.planetasistemasolar.getid_tipo_valoracion());	
				planetasistemasolarAux.setcodigo(this.planetasistemasolar.getcodigo());	
				planetasistemasolarAux.setnombre(this.planetasistemasolar.getnombre());	
				planetasistemasolarAux.setdescripcion(this.planetasistemasolar.getdescripcion());	
				
				if(this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.planetasistemasolarAux.getId()>=0) {	
						this.planetasistemasolarsEliminados.add(planetasistemasolarAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(planetasistemasolarAux,planetasistemasolarLogic.getPlanetaSistemaSolars());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(planetasistemasolarAux,planetasistemasolars);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.planetasistemasolarSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.planetasistemasolarSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						planetasistemasolarLogic.savePlanetaSistemaSolars();//WithConnection
						//planetasistemasolarLogic.getSetVersionRowPlanetaSistemaSolars();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.planetasistemasolarSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.planetasistemasolarSessionBean.getEstaModoGuardarRelaciones() 
								|| this.planetasistemasolarSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(planetasistemasolarAux,planetasistemasolarLogic.getPlanetaSistemaSolars());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(planetasistemasolarAux,planetasistemasolars);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarLogic.getPlanetaSistemaSolars().addAll(this.planetasistemasolarsEliminados);
					
					planetasistemasolarLogic.savePlanetaSistemaSolars();//WithConnection
					//planetasistemasolarLogic.getSetVersionRowPlanetaSistemaSolars();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPlanetaSistemaSolar();
				
				this.planetasistemasolarsEliminados= new ArrayList<PlanetaSistemaSolar>();		
			}
			
			if(this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Planeta Sistema Solar GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Planeta Sistema Solar",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.planetasistemasolar=planetasistemasolarAux;
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
      		//this.finishProcessPlanetaSistemaSolar();
      	}
		
	}	
	
	public void actualizarRelaciones(PlanetaSistemaSolar planetasistemasolarLocal) throws Exception {
		
		if(this.planetasistemasolarSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PlanetaSistemaSolar planetasistemasolarLocal) throws Exception {	
		if(this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(TipoValoracionDetalleFormJInternalFrame.class)) {
				TipoValoracionBeanSwingJInternalFrame tipovaloracionBeanSwingJInternalFrameLocal=(TipoValoracionBeanSwingJInternalFrame) ((TipoValoracionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipovaloracionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoValoracion(tipovaloracionBeanSwingJInternalFrameLocal.gettipovaloracion(),true);
				tipovaloracionBeanSwingJInternalFrameLocal.actualizarLista(tipovaloracionBeanSwingJInternalFrameLocal.tipovaloracion,this.tipovaloracionsForeignKey);

				tipovaloracionBeanSwingJInternalFrameLocal.actualizarRelaciones(tipovaloracionBeanSwingJInternalFrameLocal.tipovaloracion);

				planetasistemasolarLocal.setTipoValoracion(tipovaloracionBeanSwingJInternalFrameLocal.tipovaloracion);

				this.addItemDefectoCombosForeignKeyTipoValoracion();
				this.cargarCombosFrameTipoValoracionsForeignKey("Formulario");
				this.setActualTipoValoracionForeignKey(tipovaloracionBeanSwingJInternalFrameLocal.tipovaloracion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPlanetaSistemaSolarActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPlanetaSistemaSolar.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = planetasistemasolarValidator.getInvalidValues(this.planetasistemasolar);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PlanetaSistemaSolar planetasistemasolar,List<PlanetaSistemaSolar> planetasistemasolars) throws Exception {
		try	{		
			PlanetaSistemaSolarConstantesFunciones.actualizarLista(planetasistemasolar,planetasistemasolars,this.planetasistemasolarSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PlanetaSistemaSolar planetasistemasolar,List<PlanetaSistemaSolar> planetasistemasolars) throws Exception {
		try	{			
			PlanetaSistemaSolarConstantesFunciones.actualizarSelectedLista(planetasistemasolar,planetasistemasolars);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PlanetaSistemaSolar> planetasistemasolarsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				planetasistemasolarsLocal=this.planetasistemasolarLogic.getPlanetaSistemaSolars();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				planetasistemasolarsLocal=this.planetasistemasolars;
			}
			//ARCHITECTURE
		
			for(PlanetaSistemaSolar planetasistemasolarLocal:planetasistemasolarsLocal) {
				if(this.permiteMantenimiento(planetasistemasolarLocal) && planetasistemasolarLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PlanetaSistemaSolarConstantesFunciones.getPlanetaSistemaSolarLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PlanetaSistemaSolarConstantesFunciones.IDTIPOVALORACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlanetaSistemaSolar.jLabelid_tipo_valoracionPlanetaSistemaSolar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlanetaSistemaSolarConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlanetaSistemaSolar.jLabelcodigoPlanetaSistemaSolar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlanetaSistemaSolarConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlanetaSistemaSolar.jLabelnombrePlanetaSistemaSolar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlanetaSistemaSolarConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlanetaSistemaSolar.jLabeldescripcionPlanetaSistemaSolar,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlanetaSistemaSolar.jLabelid_tipo_valoracionPlanetaSistemaSolar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlanetaSistemaSolar.jLabelcodigoPlanetaSistemaSolar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlanetaSistemaSolar.jLabelnombrePlanetaSistemaSolar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlanetaSistemaSolar.jLabeldescripcionPlanetaSistemaSolar,"");
		
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
		this.iIdNuevoPlanetaSistemaSolar--;	
		
		
		this.planetasistemasolarAux=new PlanetaSistemaSolar();
		
		this.planetasistemasolarAux.setId(this.iIdNuevoPlanetaSistemaSolar);
		this.planetasistemasolarAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.planetasistemasolarLogic.getPlanetaSistemaSolars().add(this.planetasistemasolarAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.planetasistemasolars.add(this.planetasistemasolarAux);
		}
		//ARCHITECTURE
		
		this.planetasistemasolar=this.planetasistemasolarAux;
		
		if(PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPlanetaSistemaSolar(this.planetasistemasolar);
			this.setVariablesObjetoActualToFormularioForeignKeyPlanetaSistemaSolar(this.planetasistemasolar);
		}
				
		//this.setDefaultControlesPlanetaSistemaSolar();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPlanetaSistemaSolar();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPlanetaSistemaSolar();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPlanetaSistemaSolar();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPlanetaSistemaSolar(this.planetasistemasolarBean,this.planetasistemasolar,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPlanetaSistemaSolar(this.planetasistemasolar);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.planetasistemasolarSessionBean.getConGuardarRelaciones()) {
			classes=PlanetaSistemaSolarConstantesFunciones.getClassesRelationshipsOfPlanetaSistemaSolar(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.planetasistemasolarReturnGeneral=planetasistemasolarLogic.procesarEventosPlanetaSistemaSolarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.planetasistemasolarLogic.getPlanetaSistemaSolars(),this.planetasistemasolar,this.planetasistemasolarParameterGeneral,this.isEsNuevoPlanetaSistemaSolar,classes);//this.planetasistemasolarLogic.getPlanetaSistemaSolar()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPlanetaSistemaSolar(this.planetasistemasolarReturnGeneral,this.planetasistemasolarBean,false);
		
		if(this.planetasistemasolarReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPlanetaSistemaSolar(this.planetasistemasolarReturnGeneral.getPlanetaSistemaSolar());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPlanetaSistemaSolar(this.planetasistemasolarReturnGeneral.getPlanetaSistemaSolar());
		}
		
		if(this.planetasistemasolarReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPlanetaSistemaSolar(this.planetasistemasolarReturnGeneral.getPlanetaSistemaSolar(),classes);//this.planetasistemasolarBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPlanetaSistemaSolar(this.planetasistemasolar,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPlanetaSistemaSolar();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPlanetaSistemaSolar();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.RecargarFormPlanetaSistemaSolar(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPlanetaSistemaSolar(false);
						
			if(planetasistemasolarSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPlanetaSistemaSolar();
			}
			
			this.actualizarVisualTableDatosPlanetaSistemaSolar();
			
			this.jTableDatosPlanetaSistemaSolar.setRowSelectionInterval(this.getIndiceNuevoPlanetaSistemaSolar(), this.getIndiceNuevoPlanetaSistemaSolar());
			
			this.seleccionarFilaTablaPlanetaSistemaSolarActual();
						
			this.actualizarEstadoCeldasBotonesPlanetaSistemaSolar("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPlanetaSistemaSolar(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextFieldcodigoPlanetaSistemaSolar.setEnabled(isHabilitar && this.planetasistemasolarConstantesFunciones.activarcodigoPlanetaSistemaSolar);
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextAreanombrePlanetaSistemaSolar.setEnabled(isHabilitar && this.planetasistemasolarConstantesFunciones.activarnombrePlanetaSistemaSolar);
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextAreadescripcionPlanetaSistemaSolar.setEnabled(isHabilitar && this.planetasistemasolarConstantesFunciones.activardescripcionPlanetaSistemaSolar);	
		
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxid_tipo_valoracionPlanetaSistemaSolar.setEnabled(isHabilitar && this.planetasistemasolarConstantesFunciones.activarid_tipo_valoracionPlanetaSistemaSolar);
	};
	
	public void setDefaultControlesPlanetaSistemaSolar() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPlanetaSistemaSolar(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.planetasistemasolarSessionBean.setConGuardarRelaciones(true);			
			this.planetasistemasolarSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTabbedPaneRelacionesPlanetaSistemaSolar.setVisible(true);
			
					
		} else {
			//this.planetasistemasolarSessionBean.setConGuardarRelaciones(false);			
			this.planetasistemasolarSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTabbedPaneRelacionesPlanetaSistemaSolar.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPlanetaSistemaSolar() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PlanetaSistemaSolar planetasistemasolarAux:this.planetasistemasolarLogic.getPlanetaSistemaSolars()) {
				if(planetasistemasolarAux.getId().equals(this.iIdNuevoPlanetaSistemaSolar)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PlanetaSistemaSolar planetasistemasolarAux:this.planetasistemasolars) {
				if(planetasistemasolarAux.getId().equals(this.iIdNuevoPlanetaSistemaSolar)) {
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
	
	public int getIndiceActualPlanetaSistemaSolar(PlanetaSistemaSolar planetasistemasolar,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PlanetaSistemaSolar planetasistemasolarAux:this.planetasistemasolarLogic.getPlanetaSistemaSolars()) {
				if(planetasistemasolarAux.getId().equals(planetasistemasolar.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PlanetaSistemaSolar planetasistemasolarAux:this.planetasistemasolars) {
				if(planetasistemasolarAux.getId().equals(planetasistemasolar.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPlanetaSistemaSolar(PlanetaSistemaSolar planetasistemasolarOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PlanetaSistemaSolar planetasistemasolarAux:this.planetasistemasolarLogic.getPlanetaSistemaSolars()) {
				if(planetasistemasolarAux.getPlanetaSistemaSolarOriginal().getId().equals(planetasistemasolarOriginal.getId())) {
					existe=true;
					planetasistemasolarOriginal.setId(planetasistemasolarAux.getId());
					planetasistemasolarOriginal.setVersionRow(planetasistemasolarAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PlanetaSistemaSolar planetasistemasolarAux:this.planetasistemasolars) {
				if(planetasistemasolarAux.getPlanetaSistemaSolarOriginal().getId().equals(planetasistemasolarOriginal.getId())) {
					existe=true;
					planetasistemasolarOriginal.setId(planetasistemasolarAux.getId());
					planetasistemasolarOriginal.setVersionRow(planetasistemasolarAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPlanetaSistemaSolar(Boolean esParaCancelar) throws Exception {
		planetasistemasolarsAux=new ArrayList<PlanetaSistemaSolar>();
		planetasistemasolarAux=new PlanetaSistemaSolar();
		
		if(!this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PlanetaSistemaSolar planetasistemasolarAux:this.planetasistemasolarLogic.getPlanetaSistemaSolars()) {
					if(planetasistemasolarAux.getId()<0) {
						planetasistemasolarsAux.add(planetasistemasolarAux);
					}		
				}
				this.iIdNuevoPlanetaSistemaSolar=0L;
				this.planetasistemasolarLogic.getPlanetaSistemaSolars().removeAll(planetasistemasolarsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PlanetaSistemaSolar planetasistemasolarAux:this.planetasistemasolars) {
					if(planetasistemasolarAux.getId()<0) {
						planetasistemasolarsAux.add(planetasistemasolarAux);
					}		
				}
				this.iIdNuevoPlanetaSistemaSolar=0L;
				this.planetasistemasolars.removeAll(planetasistemasolarsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPlanetaSistemaSolar 
					&& this.planetasistemasolarLogic.getPlanetaSistemaSolars().size()>0
					) {
					planetasistemasolarAux=this.planetasistemasolarLogic.getPlanetaSistemaSolars().get(this.planetasistemasolarLogic.getPlanetaSistemaSolars().size() - 1);
				
					if(planetasistemasolarAux.getId()<0) {
						this.planetasistemasolarLogic.getPlanetaSistemaSolars().remove(planetasistemasolarAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPlanetaSistemaSolar && this.planetasistemasolars.size()>0) {
					planetasistemasolarAux=this.planetasistemasolars.get(this.planetasistemasolars.size() - 1);
				
					if(planetasistemasolarAux.getId()<0) {
						this.planetasistemasolars.remove(planetasistemasolarAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPlanetaSistemaSolar(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(planetasistemasolar.getId()<0) {
				this.planetasistemasolarLogic.getPlanetaSistemaSolars().remove(this.planetasistemasolar);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(planetasistemasolar.getId()<0) {
				this.planetasistemasolars.remove(this.planetasistemasolar);
			}
		}			
	}
	
	public void setEstadosInicialesPlanetaSistemaSolar(List<PlanetaSistemaSolar> planetasistemasolarsAux) throws Exception {
		PlanetaSistemaSolarConstantesFunciones.setEstadosInicialesPlanetaSistemaSolar(planetasistemasolarsAux);
	}
	
	public void setEstadosInicialesPlanetaSistemaSolar(PlanetaSistemaSolar planetasistemasolarAux) throws Exception {
		PlanetaSistemaSolarConstantesFunciones.setEstadosInicialesPlanetaSistemaSolar(planetasistemasolarAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPlanetaSistemaSolarActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPlanetaSistemaSolar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPlanetaSistemaSolarActual()) {
				if(!this.isEsNuevoPlanetaSistemaSolar) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPlanetaSistemaSolar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPlanetaSistemaSolar=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPlanetaSistemaSolarActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Planeta Sistema Solar ?", "MANTENIMIENTO DE Planeta Sistema Solar", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPlanetaSistemaSolar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PlanetaSistemaSolar planetasistemasolar) throws Exception {
		PlanetaSistemaSolarConstantesFunciones.seleccionarAsignar(this.planetasistemasolar,planetasistemasolar);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPlanetaSistemaSolar=this.isPermisoActualizarOriginalPlanetaSistemaSolar;
			
			
			this.seleccionarAsignar(planetasistemasolar);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PlanetaSistemaSolarConstantesFunciones.quitarEspaciosPlanetaSistemaSolar(this.planetasistemasolar,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPlanetaSistemaSolar("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.planetasistemasolarSessionBean.setsFuncionBusquedaRapida(this.planetasistemasolarSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPlanetaSistemaSolar) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPlanetaSistemaSolar(esParaCancelar);				
				this.cancelarNuevoPlanetaSistemaSolar(esParaCancelar);								
			}
			
			this.planetasistemasolar=new PlanetaSistemaSolar();
			
			this.inicializarPlanetaSistemaSolar();
			
			this.actualizarEstadoCeldasBotonesPlanetaSistemaSolar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPlanetaSistemaSolar() throws Exception {
		try {
			PlanetaSistemaSolarConstantesFunciones.inicializarPlanetaSistemaSolar(this.planetasistemasolar);
			
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
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.planetasistemasolarLogic.getPlanetaSistemaSolars().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePlanetaSistemaSolars(String sAccionBusqueda,List<PlanetaSistemaSolar> planetasistemasolarsParaReportes) throws Exception {
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
					sPathReporteFinal="PlanetaSistemaSolar"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PlanetaSistemaSolarMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PlanetaSistemaSolarMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PlanetaSistemaSolar"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Planeta Sistema Solares");		
		parameters.put("busquedapor", PlanetaSistemaSolarConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePlanetaSistemaSolar=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PlanetaSistemaSolarConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PlanetaSistemaSolarConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePlanetaSistemaSolar=new JRBeanArrayDataSource(PlanetaSistemaSolarJInternalFrame.TraerPlanetaSistemaSolarBeans(planetasistemasolarsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePlanetaSistemaSolar);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PlanetaSistemaSolarConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PlanetaSistemaSolarConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PlanetaSistemaSolarBean.TraerPlanetaSistemaSolarBeans(planetasistemasolarsParaReportes).toArray()));
							
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
				this.generarExcelReportePlanetaSistemaSolars(sAccionBusqueda,sTipoArchivoReporte,planetasistemasolarsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPlanetaSistemaSolars(sAccionBusqueda,sTipoArchivoReporte,planetasistemasolarsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPlanetaSistemaSolarActionPerformed(null);
					//this.generarExcelReportePlanetaSistemaSolars(sAccionBusqueda,sTipoArchivoReporte,planetasistemasolarsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPlanetaSistemaSolars(sAccionBusqueda,sTipoArchivoReporte,planetasistemasolarsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPlanetaSistemaSolars(sAccionBusqueda,sTipoArchivoReporte,planetasistemasolarsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPlanetaSistemaSolars(sAccionBusqueda,sTipoArchivoReporte,planetasistemasolarsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePlanetaSistemaSolars(String sAccionBusqueda,String sTipoArchivoReporte,List<PlanetaSistemaSolar> planetasistemasolarsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planetasistemasolar";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PlanetaSistemaSolars");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPlanetaSistemaSolar("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PlanetaSistemaSolar planetasistemasolar : planetasistemasolarsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PlanetaSistemaSolarConstantesFunciones.generarExcelReporteDataPlanetaSistemaSolar("NORMAL",row,workbook,planetasistemasolar,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Planeta Sistema Solar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPlanetaSistemaSolar(String sTipo,Row row,Workbook workbook) {
		
		PlanetaSistemaSolarConstantesFunciones.generarExcelReporteHeaderPlanetaSistemaSolar(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPlanetaSistemaSolars(String sAccionBusqueda,String sTipoArchivoReporte,List<PlanetaSistemaSolar> planetasistemasolarsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planetasistemasolar_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PlanetaSistemaSolars");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PlanetaSistemaSolar planetasistemasolar : planetasistemasolarsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PlanetaSistemaSolarConstantesFunciones.getPlanetaSistemaSolarDescripcion(planetasistemasolar));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlanetaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlanetaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planetasistemasolar.gettipovaloracion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlanetaSistemaSolarConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlanetaSistemaSolarConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planetasistemasolar.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlanetaSistemaSolarConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlanetaSistemaSolarConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planetasistemasolar.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlanetaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlanetaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planetasistemasolar.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Planeta Sistema Solar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPlanetaSistemaSolars(String sAccionBusqueda,String sTipoArchivoReporte,List<PlanetaSistemaSolar> planetasistemasolarsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PlanetaSistemaSolar> planetasistemasolarsRespaldo=null;
		
		classes=PlanetaSistemaSolarConstantesFunciones.getClassesRelationshipsOfPlanetaSistemaSolar(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.planetasistemasolarLogic.setDatosCliente(this.datosCliente);
		this.planetasistemasolarLogic.setDatosDeep(this.datosDeep);
		this.planetasistemasolarLogic.setIsConDeep(true);
		
		planetasistemasolarsRespaldo=this.planetasistemasolarLogic.getPlanetaSistemaSolars();
		
		this.planetasistemasolarLogic.setPlanetaSistemaSolars(planetasistemasolarsParaReportes);	
		this.planetasistemasolarLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		planetasistemasolarsParaReportes=this.planetasistemasolarLogic.getPlanetaSistemaSolars();
		this.planetasistemasolarLogic.setPlanetaSistemaSolars(planetasistemasolarsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planetasistemasolar_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PlanetaSistemaSolars");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPlanetaSistemaSolar("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PlanetaSistemaSolar planetasistemasolar : planetasistemasolarsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPlanetaSistemaSolar("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PlanetaSistemaSolarConstantesFunciones.generarExcelReporteDataPlanetaSistemaSolar("NORMAL",row,workbook,planetasistemasolar,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PlanetaSistemaSolarConstantesFunciones.getPlanetaSistemaSolarDescripcion(planetasistemasolar));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Planeta Sistema Solar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPlanetaSistemaSolar() throws Exception {		
		this.startProcessPlanetaSistemaSolar(true);
	}
	
	public void startProcessPlanetaSistemaSolar(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPlanetaSistemaSolar ,this.jPanelParametrosReportesPlanetaSistemaSolar, this.jScrollPanelDatosPlanetaSistemaSolar,this.jPanelPaginacionPlanetaSistemaSolar, this.jScrollPanelDatosEdicionPlanetaSistemaSolar, this.jPanelAccionesPlanetaSistemaSolar,this.jPanelAccionesFormularioPlanetaSistemaSolar,this.jmenuBarPlanetaSistemaSolar,this.jmenuBarDetallePlanetaSistemaSolar,this.jTtoolBarPlanetaSistemaSolar,this.jTtoolBarDetallePlanetaSistemaSolar);		
		
		final JTabbedPane jTabbedPaneBusquedasPlanetaSistemaSolar=this.jTabbedPaneBusquedasPlanetaSistemaSolar; 
		
		final JPanel jPanelParametrosReportesPlanetaSistemaSolar=this.jPanelParametrosReportesPlanetaSistemaSolar;
		//final JScrollPane jScrollPanelDatosPlanetaSistemaSolar=this.jScrollPanelDatosPlanetaSistemaSolar;
		final JTable jTableDatosPlanetaSistemaSolar=this.jTableDatosPlanetaSistemaSolar;		
		final JPanel jPanelPaginacionPlanetaSistemaSolar=this.jPanelPaginacionPlanetaSistemaSolar;
		//final JScrollPane jScrollPanelDatosEdicionPlanetaSistemaSolar=this.jScrollPanelDatosEdicionPlanetaSistemaSolar;
		final JPanel jPanelAccionesPlanetaSistemaSolar=this.jPanelAccionesPlanetaSistemaSolar;
		
		JPanel jPanelCamposAuxiliarPlanetaSistemaSolar=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPlanetaSistemaSolar=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {
			jPanelCamposAuxiliarPlanetaSistemaSolar=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jPanelCamposPlanetaSistemaSolar;
			jPanelAccionesFormularioAuxiliarPlanetaSistemaSolar=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jPanelAccionesFormularioPlanetaSistemaSolar;
		}
		
		final JPanel jPanelCamposPlanetaSistemaSolar=jPanelCamposAuxiliarPlanetaSistemaSolar;
		final JPanel jPanelAccionesFormularioPlanetaSistemaSolar=jPanelAccionesFormularioAuxiliarPlanetaSistemaSolar;
		
		
		final JMenuBar jmenuBarPlanetaSistemaSolar=this.jmenuBarPlanetaSistemaSolar;
		final JToolBar jTtoolBarPlanetaSistemaSolar=this.jTtoolBarPlanetaSistemaSolar;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPlanetaSistemaSolar=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPlanetaSistemaSolar=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {
			jmenuBarDetalleAuxiliarPlanetaSistemaSolar=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jmenuBarDetallePlanetaSistemaSolar;
			jTtoolBarDetalleAuxiliarPlanetaSistemaSolar=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTtoolBarDetallePlanetaSistemaSolar;
		}
		
		final JMenuBar jmenuBarDetallePlanetaSistemaSolar=jmenuBarDetalleAuxiliarPlanetaSistemaSolar;
		final JToolBar jTtoolBarDetallePlanetaSistemaSolar=jTtoolBarDetalleAuxiliarPlanetaSistemaSolar;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPlanetaSistemaSolar;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPlanetaSistemaSolar;
			processRunnable.jTableDatos=jTableDatosPlanetaSistemaSolar;
			processRunnable.jPanelCampos=jPanelCamposPlanetaSistemaSolar;
			processRunnable.jPanelPaginacion=jPanelPaginacionPlanetaSistemaSolar;
			processRunnable.jPanelAcciones=jPanelAccionesPlanetaSistemaSolar;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPlanetaSistemaSolar;
			
			
			processRunnable.jmenuBar=jmenuBarPlanetaSistemaSolar;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePlanetaSistemaSolar;
			processRunnable.jTtoolBar=jTtoolBarPlanetaSistemaSolar;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePlanetaSistemaSolar;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPlanetaSistemaSolar ,jPanelParametrosReportesPlanetaSistemaSolar,jTableDatosPlanetaSistemaSolar, /*jScrollPanelDatosPlanetaSistemaSolar,*/jPanelCamposPlanetaSistemaSolar,jPanelPaginacionPlanetaSistemaSolar, /*jScrollPanelDatosEdicionPlanetaSistemaSolar,*/ jPanelAccionesPlanetaSistemaSolar,jPanelAccionesFormularioPlanetaSistemaSolar,jmenuBarPlanetaSistemaSolar,jmenuBarDetallePlanetaSistemaSolar,jTtoolBarPlanetaSistemaSolar,jTtoolBarDetallePlanetaSistemaSolar);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPlanetaSistemaSolar ,jPanelParametrosReportesPlanetaSistemaSolar, jScrollPanelDatosPlanetaSistemaSolar,jPanelPaginacionPlanetaSistemaSolar, jScrollPanelDatosEdicionPlanetaSistemaSolar, jPanelAccionesPlanetaSistemaSolar,jPanelAccionesFormularioPlanetaSistemaSolar,jmenuBarPlanetaSistemaSolar,jmenuBarDetallePlanetaSistemaSolar,jTtoolBarPlanetaSistemaSolar,jTtoolBarDetallePlanetaSistemaSolar);
						
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
	
	public void finishProcessPlanetaSistemaSolar() {// throws Exception 
		this.finishProcessPlanetaSistemaSolar(true);
	}
	
	public void finishProcessPlanetaSistemaSolar(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPlanetaSistemaSolar ,this.jPanelParametrosReportesPlanetaSistemaSolar, this.jScrollPanelDatosPlanetaSistemaSolar,this.jPanelPaginacionPlanetaSistemaSolar, this.jScrollPanelDatosEdicionPlanetaSistemaSolar, this.jPanelAccionesPlanetaSistemaSolar,this.jPanelAccionesFormularioPlanetaSistemaSolar,this.jmenuBarPlanetaSistemaSolar,this.jmenuBarDetallePlanetaSistemaSolar,this.jTtoolBarPlanetaSistemaSolar,this.jTtoolBarDetallePlanetaSistemaSolar);		
		
		final JTabbedPane jTabbedPaneBusquedasPlanetaSistemaSolar=this.jTabbedPaneBusquedasPlanetaSistemaSolar; 
		
		final JPanel jPanelParametrosReportesPlanetaSistemaSolar=this.jPanelParametrosReportesPlanetaSistemaSolar;
		//final JScrollPane jScrollPanelDatosPlanetaSistemaSolar=this.jScrollPanelDatosPlanetaSistemaSolar;
		final JTable jTableDatosPlanetaSistemaSolar=this.jTableDatosPlanetaSistemaSolar;		
		final JPanel jPanelPaginacionPlanetaSistemaSolar=this.jPanelPaginacionPlanetaSistemaSolar;
		//final JScrollPane jScrollPanelDatosEdicionPlanetaSistemaSolar=this.jScrollPanelDatosEdicionPlanetaSistemaSolar;
		final JPanel jPanelAccionesPlanetaSistemaSolar=this.jPanelAccionesPlanetaSistemaSolar;
		
		JPanel jPanelCamposAuxiliarPlanetaSistemaSolar=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPlanetaSistemaSolar=new JPanel();
		
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {
			jPanelCamposAuxiliarPlanetaSistemaSolar=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jPanelCamposPlanetaSistemaSolar;
			jPanelAccionesFormularioAuxiliarPlanetaSistemaSolar=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jPanelAccionesFormularioPlanetaSistemaSolar;
		}
		
		final JPanel jPanelCamposPlanetaSistemaSolar=jPanelCamposAuxiliarPlanetaSistemaSolar;
		final JPanel jPanelAccionesFormularioPlanetaSistemaSolar=jPanelAccionesFormularioAuxiliarPlanetaSistemaSolar;
		
		
		final JMenuBar jmenuBarPlanetaSistemaSolar=this.jmenuBarPlanetaSistemaSolar;		
		final JToolBar jTtoolBarPlanetaSistemaSolar=this.jTtoolBarPlanetaSistemaSolar;
				
		JMenuBar jmenuBarDetalleAuxiliarPlanetaSistemaSolar=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPlanetaSistemaSolar=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {
			jmenuBarDetalleAuxiliarPlanetaSistemaSolar=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jmenuBarDetallePlanetaSistemaSolar;
			jTtoolBarDetalleAuxiliarPlanetaSistemaSolar=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTtoolBarDetallePlanetaSistemaSolar;		
		}
		
		final JMenuBar jmenuBarDetallePlanetaSistemaSolar=jmenuBarDetalleAuxiliarPlanetaSistemaSolar;
		final JToolBar jTtoolBarDetallePlanetaSistemaSolar=jTtoolBarDetalleAuxiliarPlanetaSistemaSolar;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPlanetaSistemaSolar;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPlanetaSistemaSolar;
			processRunnable.jTableDatos=jTableDatosPlanetaSistemaSolar;
			processRunnable.jPanelCampos=jPanelCamposPlanetaSistemaSolar;
			processRunnable.jPanelPaginacion=jPanelPaginacionPlanetaSistemaSolar;
			processRunnable.jPanelAcciones=jPanelAccionesPlanetaSistemaSolar;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPlanetaSistemaSolar;
			
			
			processRunnable.jmenuBar=jmenuBarPlanetaSistemaSolar;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePlanetaSistemaSolar;
			processRunnable.jTtoolBar=jTtoolBarPlanetaSistemaSolar;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePlanetaSistemaSolar;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPlanetaSistemaSolar ,jPanelParametrosReportesPlanetaSistemaSolar, jTableDatosPlanetaSistemaSolar,/*jScrollPanelDatosPlanetaSistemaSolar,*/jPanelCamposPlanetaSistemaSolar,jPanelPaginacionPlanetaSistemaSolar, /*jScrollPanelDatosEdicionPlanetaSistemaSolar,*/ jPanelAccionesPlanetaSistemaSolar,jPanelAccionesFormularioPlanetaSistemaSolar,jmenuBarPlanetaSistemaSolar,jmenuBarDetallePlanetaSistemaSolar,jTtoolBarPlanetaSistemaSolar,jTtoolBarDetallePlanetaSistemaSolar));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPlanetaSistemaSolar(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPlanetaSistemaSolar(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPlanetaSistemaSolar(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPlanetaSistemaSolar(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPlanetaSistemaSolar,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePlanetaSistemaSolar,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPlanetaSistemaSolar(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPlanetaSistemaSolar,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePlanetaSistemaSolar,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.planetasistemasolarConstantesFunciones.getsFinalQueryPlanetaSistemaSolar();
		String  finalQueryPaginacionTodos=this.planetasistemasolarConstantesFunciones.getsFinalQueryPlanetaSistemaSolar();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PlanetaSistemaSolarConstantesFunciones.getArrayColumnasGlobalesNoPlanetaSistemaSolar(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PlanetaSistemaSolarConstantesFunciones.getArrayColumnasGlobalesPlanetaSistemaSolar(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PlanetaSistemaSolarConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.planetasistemasolarsEliminados= new ArrayList<PlanetaSistemaSolar>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPlanetaSistemaSolar();
		
				///*PlanetaSistemaSolarSessionBean*/this.planetasistemasolarSessionBean=new PlanetaSistemaSolarSessionBean();
			
			if(this.planetasistemasolarSessionBean==null) {
				this.planetasistemasolarSessionBean=new PlanetaSistemaSolarSessionBean();
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
					this.iNumeroPaginacion=PlanetaSistemaSolarConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PlanetaSistemaSolarConstantesFunciones.getClassesForeignKeysOfPlanetaSistemaSolar(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/planetasistemasolar."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			planetasistemasolarsAux= new ArrayList<PlanetaSistemaSolar>();
			
				
			planetasistemasolarLogic.setDatosCliente(this.datosCliente);
			planetasistemasolarLogic.setDatosDeep(this.datosDeep);
			planetasistemasolarLogic.setIsConDeep(true);
			
			
			planetasistemasolarLogic.getPlanetaSistemaSolarDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					planetasistemasolarLogic.getTodosPlanetaSistemaSolars(finalQueryGlobal,pagination);
					
					//planetasistemasolarLogic.getTodosPlanetaSistemaSolarsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(planetasistemasolarLogic.getPlanetaSistemaSolars()==null|| planetasistemasolarLogic.getPlanetaSistemaSolars().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							planetasistemasolarsAux= new ArrayList<PlanetaSistemaSolar>();
							planetasistemasolarsAux.addAll(planetasistemasolarLogic.getPlanetaSistemaSolars());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planetasistemasolarsAux= new ArrayList<PlanetaSistemaSolar>();
							planetasistemasolarsAux.addAll(planetasistemasolars);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							planetasistemasolarLogic.getTodosPlanetaSistemaSolars(finalQueryGlobal+"",this.pagination);												
							
							//planetasistemasolarLogic.getTodosPlanetaSistemaSolarsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePlanetaSistemaSolars("Todos",planetasistemasolarLogic.getPlanetaSistemaSolars() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							planetasistemasolarLogic.setPlanetaSistemaSolars(new ArrayList<PlanetaSistemaSolar>());					
							planetasistemasolarLogic.getPlanetaSistemaSolars().addAll(planetasistemasolarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planetasistemasolars=new ArrayList<PlanetaSistemaSolar>();
							planetasistemasolars.addAll(planetasistemasolarsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPlanetaSistemaSolar=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPlanetaSistemaSolar=this.idActual;
				
				} else if(this.idPlanetaSistemaSolarActual!=null && this.idPlanetaSistemaSolarActual!=0L) {
					idPlanetaSistemaSolar=idPlanetaSistemaSolarActual;
				}
				
					
				this.sDetalleReporte=PlanetaSistemaSolarConstantesFunciones.getDetalleIndicePorId(idPlanetaSistemaSolar);
				
				this.planetasistemasolars=new ArrayList<PlanetaSistemaSolar>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					planetasistemasolarLogic.getEntity(idPlanetaSistemaSolar);
					
					//planetasistemasolarLogic.getEntityWithConnection(idPlanetaSistemaSolar);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planetasistemasolarLogic.setPlanetaSistemaSolars(new ArrayList<PlanetaSistemaSolar>());
					planetasistemasolarLogic.getPlanetaSistemaSolars().add(planetasistemasolarLogic.getPlanetaSistemaSolar());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planetasistemasolars=new ArrayList<PlanetaSistemaSolar>();
					this.planetasistemasolars.add(planetasistemasolar);
				}
				
				if(planetasistemasolarLogic.getPlanetaSistemaSolar()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=PlanetaSistemaSolarConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					planetasistemasolarLogic.getPlanetaSistemaSolarsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlanetaSistemaSolarConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlanetaSistemaSolarConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=planetasistemasolarLogic.getPlanetaSistemaSolars()==null||planetasistemasolarLogic.getPlanetaSistemaSolars().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=planetasistemasolars==null|| planetasistemasolars.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						planetasistemasolarsAux=new ArrayList<PlanetaSistemaSolar>();
						planetasistemasolarsAux.addAll(planetasistemasolarLogic.getPlanetaSistemaSolars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planetasistemasolarsAux=new ArrayList<PlanetaSistemaSolar>();
							planetasistemasolarsAux.addAll(planetasistemasolars);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							planetasistemasolarLogic.getPlanetaSistemaSolarsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlanetaSistemaSolarConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlanetaSistemaSolarConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePlanetaSistemaSolars("BusquedaPorCodigo",planetasistemasolarLogic.getPlanetaSistemaSolars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePlanetaSistemaSolars("BusquedaPorCodigo",planetasistemasolars);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						planetasistemasolarLogic.setPlanetaSistemaSolars(new ArrayList<PlanetaSistemaSolar>());
						planetasistemasolarLogic.getPlanetaSistemaSolars().addAll(planetasistemasolarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planetasistemasolars=new ArrayList<PlanetaSistemaSolar>();
							planetasistemasolars.addAll(planetasistemasolarsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoValoracion")) {
				this.sDetalleReporte=PlanetaSistemaSolarConstantesFunciones.getDetalleIndiceFK_IdTipoValoracion(id_tipo_valoracionFK_IdTipoValoracion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					planetasistemasolarLogic.getPlanetaSistemaSolarsFK_IdTipoValoracion(finalQueryGlobal,pagination,id_tipo_valoracionFK_IdTipoValoracion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlanetaSistemaSolarConstantesFunciones.getDetalleIndiceFK_IdTipoValoracion(id_tipo_valoracionFK_IdTipoValoracion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlanetaSistemaSolarConstantesFunciones.getDetalleIndiceFK_IdTipoValoracion(id_tipo_valoracionFK_IdTipoValoracion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=planetasistemasolarLogic.getPlanetaSistemaSolars()==null||planetasistemasolarLogic.getPlanetaSistemaSolars().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=planetasistemasolars==null|| planetasistemasolars.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						planetasistemasolarsAux=new ArrayList<PlanetaSistemaSolar>();
						planetasistemasolarsAux.addAll(planetasistemasolarLogic.getPlanetaSistemaSolars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planetasistemasolarsAux=new ArrayList<PlanetaSistemaSolar>();
							planetasistemasolarsAux.addAll(planetasistemasolars);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							planetasistemasolarLogic.getPlanetaSistemaSolarsFK_IdTipoValoracion(finalQueryGlobal,pagination,id_tipo_valoracionFK_IdTipoValoracion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlanetaSistemaSolarConstantesFunciones.getDetalleIndiceFK_IdTipoValoracion(id_tipo_valoracionFK_IdTipoValoracion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlanetaSistemaSolarConstantesFunciones.getDetalleIndiceFK_IdTipoValoracion(id_tipo_valoracionFK_IdTipoValoracion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePlanetaSistemaSolars("FK_IdTipoValoracion",planetasistemasolarLogic.getPlanetaSistemaSolars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePlanetaSistemaSolars("FK_IdTipoValoracion",planetasistemasolars);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						planetasistemasolarLogic.setPlanetaSistemaSolars(new ArrayList<PlanetaSistemaSolar>());
						planetasistemasolarLogic.getPlanetaSistemaSolars().addAll(planetasistemasolarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planetasistemasolars=new ArrayList<PlanetaSistemaSolar>();
							planetasistemasolars.addAll(planetasistemasolarsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPlanetaSistemaSolar();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPlanetaSistemaSolar();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=planetasistemasolarLogic.getPlanetaSistemaSolars().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=planetasistemasolars.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=planetasistemasolarLogic.getPlanetaSistemaSolars().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=planetasistemasolars.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PlanetaSistemaSolar planetasistemasolar) {
		Boolean permite=true;
		
		if(this.planetasistemasolar.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PlanetaSistemaSolarConstantesFunciones.getOrderByListaPlanetaSistemaSolar();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PlanetaSistemaSolarConstantesFunciones.getOrderByListaPlanetaSistemaSolar();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PlanetaSistemaSolar planetasistemasolar:planetasistemasolarLogic.getPlanetaSistemaSolars()) {
				if(planetasistemasolar.getsType().equals(Constantes2.S_TOTALES)) {
					planetasistemasolarTotales=planetasistemasolar;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PlanetaSistemaSolar planetasistemasolar:this.planetasistemasolars) {
				if(planetasistemasolar.getsType().equals(Constantes2.S_TOTALES)) {
					planetasistemasolarTotales=planetasistemasolar;
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
			this.planetasistemasolarAux=new PlanetaSistemaSolar();
			this.planetasistemasolarAux.setsType(Constantes2.S_TOTALES);
			this.planetasistemasolarAux.setIsNew(false);
			this.planetasistemasolarAux.setIsChanged(false);
			this.planetasistemasolarAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PlanetaSistemaSolarConstantesFunciones.TotalizarValoresFilaPlanetaSistemaSolar(this.planetasistemasolarLogic.getPlanetaSistemaSolars(),this.planetasistemasolarAux);
				
				this.planetasistemasolarLogic.getPlanetaSistemaSolars().add(this.planetasistemasolarAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PlanetaSistemaSolarConstantesFunciones.TotalizarValoresFilaPlanetaSistemaSolar(this.planetasistemasolars,this.planetasistemasolarAux);
				
				this.planetasistemasolars.add(this.planetasistemasolarAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		planetasistemasolarTotales=new PlanetaSistemaSolar();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.planetasistemasolarLogic.getPlanetaSistemaSolars().remove(planetasistemasolarTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.planetasistemasolars.remove(planetasistemasolarTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		planetasistemasolarTotales=new PlanetaSistemaSolar();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PlanetaSistemaSolar planetasistemasolar:planetasistemasolarLogic.getPlanetaSistemaSolars()) {
				if(planetasistemasolar.getsType().equals(Constantes2.S_TOTALES)) {
					planetasistemasolarTotales=planetasistemasolar;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PlanetaSistemaSolarConstantesFunciones.TotalizarValoresFilaPlanetaSistemaSolar(this.planetasistemasolarLogic.getPlanetaSistemaSolars(),planetasistemasolarTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PlanetaSistemaSolar planetasistemasolar:this.planetasistemasolars) {
				if(planetasistemasolar.getsType().equals(Constantes2.S_TOTALES)) {
					planetasistemasolarTotales=planetasistemasolar;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PlanetaSistemaSolarConstantesFunciones.TotalizarValoresFilaPlanetaSistemaSolar(this.planetasistemasolars,planetasistemasolarTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPlanetaSistemaSolarsBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPlanetaSistemaSolarsFK_IdTipoValoracion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoValoracion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPlanetaSistemaSolarsBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planetasistemasolarLogic.getPlanetaSistemaSolarsBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPlanetaSistemaSolarsFK_IdTipoValoracion(String sFinalQuery,Long id_tipo_valoracion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planetasistemasolarLogic.getPlanetaSistemaSolarsFK_IdTipoValoracion(sFinalQuery,this.pagination,id_tipo_valoracion);
				
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
	
	public void inicializarPermisosPlanetaSistemaSolar() {
		this.isPermisoTodoPlanetaSistemaSolar=false;
		this.isPermisoNuevoPlanetaSistemaSolar=false;
		this.isPermisoActualizarPlanetaSistemaSolar=false;
		this.isPermisoActualizarOriginalPlanetaSistemaSolar=false;
		this.isPermisoEliminarPlanetaSistemaSolar=false;
		this.isPermisoGuardarCambiosPlanetaSistemaSolar=false;
		this.isPermisoConsultaPlanetaSistemaSolar=false;
		this.isPermisoBusquedaPlanetaSistemaSolar=false;
		this.isPermisoReportePlanetaSistemaSolar=false;		
		this.isPermisoOrdenPlanetaSistemaSolar=false;		
		this.isPermisoPaginacionMedioPlanetaSistemaSolar=false;		
		this.isPermisoPaginacionAltoPlanetaSistemaSolar=false;
		this.isPermisoPaginacionTodoPlanetaSistemaSolar=false;
		this.isPermisoCopiarPlanetaSistemaSolar=false;		
		this.isPermisoVerFormPlanetaSistemaSolar=false;		
		this.isPermisoDuplicarPlanetaSistemaSolar=false;		
		this.isPermisoOrdenPlanetaSistemaSolar=false;		
	}
	
	public void setPermisosUsuarioPlanetaSistemaSolar(Boolean isPermiso) {
		this.isPermisoTodoPlanetaSistemaSolar=isPermiso;
		this.isPermisoNuevoPlanetaSistemaSolar=isPermiso;
		this.isPermisoActualizarPlanetaSistemaSolar=isPermiso;
		this.isPermisoActualizarOriginalPlanetaSistemaSolar=isPermiso;
		this.isPermisoEliminarPlanetaSistemaSolar=isPermiso;
		this.isPermisoGuardarCambiosPlanetaSistemaSolar=isPermiso;
		this.isPermisoConsultaPlanetaSistemaSolar=isPermiso;
		this.isPermisoBusquedaPlanetaSistemaSolar=isPermiso;
		this.isPermisoReportePlanetaSistemaSolar=isPermiso;
		this.isPermisoOrdenPlanetaSistemaSolar=isPermiso;		
		this.isPermisoPaginacionMedioPlanetaSistemaSolar=isPermiso;		
		this.isPermisoPaginacionAltoPlanetaSistemaSolar=isPermiso;		
		this.isPermisoPaginacionTodoPlanetaSistemaSolar=isPermiso;		
		this.isPermisoCopiarPlanetaSistemaSolar=isPermiso;		
		this.isPermisoVerFormPlanetaSistemaSolar=isPermiso;		
		this.isPermisoDuplicarPlanetaSistemaSolar=isPermiso;
		this.isPermisoOrdenPlanetaSistemaSolar=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPlanetaSistemaSolar(Boolean isPermiso) {
		//this.isPermisoTodoPlanetaSistemaSolar=isPermiso;
		this.isPermisoNuevoPlanetaSistemaSolar=isPermiso;
		this.isPermisoActualizarPlanetaSistemaSolar=isPermiso;
		this.isPermisoActualizarOriginalPlanetaSistemaSolar=isPermiso;
		this.isPermisoEliminarPlanetaSistemaSolar=isPermiso;
		this.isPermisoGuardarCambiosPlanetaSistemaSolar=isPermiso;
		//this.isPermisoConsultaPlanetaSistemaSolar=isPermiso;
		//this.isPermisoBusquedaPlanetaSistemaSolar=isPermiso;
		//this.isPermisoReportePlanetaSistemaSolar=isPermiso;
		//this.isPermisoOrdenPlanetaSistemaSolar=isPermiso;		
		//this.isPermisoPaginacionMedioPlanetaSistemaSolar=isPermiso;		
		//this.isPermisoPaginacionAltoPlanetaSistemaSolar=isPermiso;		
		//this.isPermisoPaginacionTodoPlanetaSistemaSolar=isPermiso;		
		//this.isPermisoCopiarPlanetaSistemaSolar=isPermiso;		
		//this.isPermisoDuplicarPlanetaSistemaSolar=isPermiso;
		//this.isPermisoOrdenPlanetaSistemaSolar=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPlanetaSistemaSolarClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PlanetaSistemaSolarJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPlanetaSistemaSolar(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPlanetaSistemaSolarClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPlanetaSistemaSolarClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPlanetaSistemaSolarClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPlanetaSistemaSolarClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPlanetaSistemaSolar() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PlanetaSistemaSolarJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PlanetaSistemaSolarConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPlanetaSistemaSolar=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPlanetaSistemaSolar=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPlanetaSistemaSolar=this.isPermisoActualizarPlanetaSistemaSolar;
			this.isPermisoEliminarPlanetaSistemaSolar=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPlanetaSistemaSolar=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPlanetaSistemaSolar=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPlanetaSistemaSolar=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPlanetaSistemaSolar=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePlanetaSistemaSolar=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPlanetaSistemaSolar=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPlanetaSistemaSolar=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPlanetaSistemaSolar=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPlanetaSistemaSolar=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPlanetaSistemaSolar=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPlanetaSistemaSolar=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPlanetaSistemaSolar=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPlanetaSistemaSolar=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPlanetaSistemaSolar.setToolTipText(this.jTableDatosPlanetaSistemaSolar.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPlanetaSistemaSolar(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPlanetaSistemaSolar(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PlanetaSistemaSolarJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PlanetaSistemaSolarJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPlanetaSistemaSolar() throws Exception {
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
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyPlanetaSistemaSolarListas()throws Exception {
		try	{						
			
				this.tipovaloracionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPlanetaSistemaSolarListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PlanetaSistemaSolarJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPlanetaSistemaSolarListas(false);
			} else {
			
				this.cargarCombosForeignKeyTipoValoracionListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyTipoValoracionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipovaloracionsForeignKey==null||this.tipovaloracionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoValoracionConstantesFunciones.getArrayColumnasGlobalesTipoValoracion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoValoracionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoValoracionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoValoracionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyPlanetaSistemaSolarListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PlanetaSistemaSolarParameterReturnGeneral planetasistemasolarReturnGeneral=new PlanetaSistemaSolarParameterReturnGeneral();
						
			


				String finalQueryGlobalTipoValoracion="";

				if(((this.tipovaloracionsForeignKey==null||this.tipovaloracionsForeignKey.size()<=0) && this.planetasistemasolarConstantesFunciones.cargarid_tipo_valoracionPlanetaSistemaSolar)
					 || (this.esRecargarFks && this.planetasistemasolarConstantesFunciones.cargarid_tipo_valoracionPlanetaSistemaSolar)) {

					if(!this.planetasistemasolarSessionBean.getisBusquedaDesdeForeignKeySesionTipoValoracion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoValoracionConstantesFunciones.getArrayColumnasGlobalesTipoValoracion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoValoracion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoValoracionConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoValoracion=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoValoracion, "");
						finalQueryGlobalTipoValoracion+=TipoValoracionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoValoracionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoValoracion=" WHERE " + ConstantesSql.ID + "="+planetasistemasolarSessionBean.getlidTipoValoracionActual();
					}
				} else {
					finalQueryGlobalTipoValoracion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				planetasistemasolarReturnGeneral=planetasistemasolarLogic.cargarCombosLoteForeignKeyPlanetaSistemaSolar(finalQueryGlobalTipoValoracion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalTipoValoracion.equals("NONE")) {
				this.tipovaloracionsForeignKey=planetasistemasolarReturnGeneral.gettipovaloracionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPlanetaSistemaSolar()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyTipoValoracion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyTipoValoracion()throws Exception {
		try {
			if(this.planetasistemasolarSessionBean==null) {
				this.planetasistemasolarSessionBean=new PlanetaSistemaSolarSessionBean();
			}

			if(!this.planetasistemasolarSessionBean.getisBusquedaDesdeForeignKeySesionTipoValoracion()) {
				TipoValoracion tipovaloracion=new TipoValoracion();
				TipoValoracionConstantesFunciones.setTipoValoracionDescripcion(tipovaloracion,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipovaloracion.setId(null);

				if(!TipoValoracionConstantesFunciones.ExisteEnLista(this.tipovaloracionsForeignKey,tipovaloracion,true)) {

					this.tipovaloracionsForeignKey.add(0,tipovaloracion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyPlanetaSistemaSolar()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPlanetaSistemaSolar(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPlanetaSistemaSolar()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPlanetaSistemaSolar();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPlanetaSistemaSolar(PlanetaSistemaSolar planetasistemasolar)throws Exception {	
		try {
			
			this.setActualTipoValoracionForeignKey(planetasistemasolar.getid_tipo_valoracion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPlanetaSistemaSolar(PlanetaSistemaSolar planetasistemasolar,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPlanetaSistemaSolar()throws Exception {	
		try {
			
			this.setActualTipoValoracionForeignKey(this.planetasistemasolarConstantesFunciones.getid_tipo_valoracion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPlanetaSistemaSolar()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPlanetaSistemaSolar()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPlanetaSistemaSolar()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPlanetaSistemaSolar()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPlanetaSistemaSolar()throws Exception {
		try {
			

			this.cargarCombosFrameTipoValoracionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPlanetaSistemaSolar(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameTipoValoracionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPlanetaSistemaSolar()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxid_tipo_valoracionPlanetaSistemaSolar!=null && this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxid_tipo_valoracionPlanetaSistemaSolar.getItemCount()>0) {
				this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxid_tipo_valoracionPlanetaSistemaSolar.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public PlanetaSistemaSolarBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PlanetaSistemaSolarBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PlanetaSistemaSolarBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.planetasistemasolarSessionBean=new PlanetaSistemaSolarSessionBean(); 
		this.planetasistemasolarConstantesFunciones=new PlanetaSistemaSolarConstantesFunciones(); 
		this.planetasistemasolarBean=new PlanetaSistemaSolar();//(this.planetasistemasolarConstantesFunciones); 		
		this.planetasistemasolarReturnGeneral=new PlanetaSistemaSolarParameterReturnGeneral(); 
		
		this.planetasistemasolarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.planetasistemasolarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PlanetaSistemaSolarBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PlanetaSistemaSolarBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PlanetaSistemaSolarBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPlanetaSistemaSolar(true);
			
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
			
			this.planetasistemasolarConstantesFunciones=new PlanetaSistemaSolarConstantesFunciones(); 
			this.planetasistemasolarBean=new PlanetaSistemaSolar();//this.planetasistemasolarConstantesFunciones); 			
			this.planetasistemasolarReturnGeneral=new PlanetaSistemaSolarParameterReturnGeneral(); 
		
			PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Planeta Sistema Solar Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.planetasistemasolar=new PlanetaSistemaSolar();
			this.planetasistemasolars = new ArrayList<PlanetaSistemaSolar>();
			this.planetasistemasolarsAux = new ArrayList<PlanetaSistemaSolar>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic=new PlanetaSistemaSolarLogic();
				this.planetasistemasolarLogic.getNewConnexionToDeep("");
			}
			
			//this.planetasistemasolarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.planetasistemasolarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPlanetaSistemaSolar);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPlanetaSistemaSolar!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPlanetaSistemaSolar);	
					}
					
					if(this.jInternalFrameImportacionPlanetaSistemaSolar!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPlanetaSistemaSolar);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPlanetaSistemaSolar!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPlanetaSistemaSolar);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPlanetaSistemaSolar);
				this.jInternalFrameDetalleFormPlanetaSistemaSolar.setVisible(false);
				this.jInternalFrameDetalleFormPlanetaSistemaSolar.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPlanetaSistemaSolar!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPlanetaSistemaSolar);
					this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.setVisible(false);
					this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPlanetaSistemaSolar!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPlanetaSistemaSolar);
					this.jInternalFrameImportacionPlanetaSistemaSolar.setVisible(false);
					this.jInternalFrameImportacionPlanetaSistemaSolar.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPlanetaSistemaSolar!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPlanetaSistemaSolar);
					this.jInternalFrameOrderByPlanetaSistemaSolar.setVisible(false);
					this.jInternalFrameOrderByPlanetaSistemaSolar.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPlanetaSistemaSolarActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PlanetaSistemaSolarConstantesFunciones.INUMEROPAGINACION;
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
			
			this.planetasistemasolarReturnGeneral=new PlanetaSistemaSolarParameterReturnGeneral();
			
			this.planetasistemasolarParameterGeneral=new PlanetaSistemaSolarParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.planetasistemasolarLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PlanetaSistemaSolarJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PlanetaSistemaSolarConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.planetasistemasolarSessionBean.getEsGuardarRelacionado(),this.planetasistemasolarSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PlanetaSistemaSolarConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.planetasistemasolarSessionBean.getEsGuardarRelacionado(),this.planetasistemasolarSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaDuplicarPlanetaSistemaSolar=true;
			this.isVisibilidadCeldaCopiarPlanetaSistemaSolar=true;
			this.isVisibilidadCeldaVerFormPlanetaSistemaSolar=true;
			this.isVisibilidadCeldaOrdenPlanetaSistemaSolar=true;
			this.isVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaModificarPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaActualizarPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaEliminarPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaCancelarPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaGuardarPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaGuardarCambiosPlanetaSistemaSolar=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadFK_IdTipoValoracion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPlanetaSistemaSolar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPlanetaSistemaSolar();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPlanetaSistemaSolar(false);
			
			this.setPermisosUsuarioPlanetaSistemaSolar();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.planetasistemasolarSessionBean.getEsGuardarRelacionado() 
				|| (this.planetasistemasolarSessionBean.getEsGuardarRelacionado() && this.planetasistemasolarSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPlanetaSistemaSolarClasesRelacionadas();
			}
			
			if(this.planetasistemasolarSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPlanetaSistemaSolarClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPlanetaSistemaSolar();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPlanetaSistemaSolar();
			}
			
			if(!this.isPermisoBusquedaPlanetaSistemaSolar) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPlanetaSistemaSolar.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPlanetaSistemaSolar,this.isPermisoPaginacionMedioPlanetaSistemaSolar,this.isPermisoPaginacionTodoPlanetaSistemaSolar);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PlanetaSistemaSolarConstantesFunciones.getTiposSeleccionarPlanetaSistemaSolar());
				
				this.tiposColumnasSelect=PlanetaSistemaSolarConstantesFunciones.getTiposSeleccionarPlanetaSistemaSolar(true);
				
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
			//if(!this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPlanetaSistemaSolar();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioPlanetaSistemaSolar(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioPlanetaSistemaSolar(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPlanetaSistemaSolar() ;
			
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
			
			this.tipovaloracionLogic=new TipoValoracionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				planetasistemasolarImplementable= (PlanetaSistemaSolarImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PlanetaSistemaSolarConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				planetasistemasolarImplementableHome= (PlanetaSistemaSolarImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PlanetaSistemaSolarConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.planetasistemasolars= new ArrayList<PlanetaSistemaSolar>();
			this.planetasistemasolarsEliminados= new ArrayList<PlanetaSistemaSolar>();
						
			this.isEsNuevoPlanetaSistemaSolar=false;
			this.esParaAccionDesdeFormularioPlanetaSistemaSolar=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.tipovaloracionsForeignKey=new ArrayList<TipoValoracion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPlanetaSistemaSolar(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPlanetaSistemaSolar();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PlanetaSistemaSolarConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPlanetaSistemaSolar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPlanetaSistemaSolar(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPlanetaSistemaSolar();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPlanetaSistemaSolar();
			}
			
			PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPlanetaSistemaSolar.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPlanetaSistemaSolar.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPlanetaSistemaSolar.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPlanetaSistemaSolar(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PlanetaSistemaSolar: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPlanetaSistemaSolar() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPlanetaSistemaSolar")) {
				iIndex=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTabbedPaneRelacionesPlanetaSistemaSolar.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTabbedPaneRelacionesPlanetaSistemaSolar.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPlanetaSistemaSolar.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPlanetaSistemaSolar();	
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
	
	public void cargarCombosForeignKeyPlanetaSistemaSolar(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPlanetaSistemaSolar(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPlanetaSistemaSolar(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPlanetaSistemaSolarListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPlanetaSistemaSolar();
		
		this.cargarCombosFrameForeignKeyPlanetaSistemaSolar();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPlanetaSistemaSolar();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPlanetaSistemaSolar();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoValoracion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoValoracionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoValoracion();
				this.cargarCombosFrameTipoValoracionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoValoracion(this.tipovaloracionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPlanetaSistemaSolarActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.planetasistemasolarSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPlanetaSistemaSolar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
			
			
			if(jTableDatosPlanetaSistemaSolar.getRowCount()>=1) {
				jTableDatosPlanetaSistemaSolar.removeRowSelectionInterval(0, jTableDatosPlanetaSistemaSolar.getRowCount()-1);						
			}
			
			this.isEsNuevoPlanetaSistemaSolar=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPlanetaSistemaSolar(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPlanetaSistemaSolar(true);			
			//this.planetasistemasolar=new PlanetaSistemaSolar();
			//this.planetasistemasolar.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPlanetaSistemaSolar(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPlanetaSistemaSolar() ;
			
			if(PlanetaSistemaSolarJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePlanetaSistemaSolar(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.planetasistemasolar);	
			this.actualizarInformacion("INFO_PADRE",false,this.planetasistemasolar);				
			
			PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
			
			if(this.planetasistemasolarSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PlanetaSistemaSolar: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPlanetaSistemaSolarActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PlanetaSistemaSolar> planetasistemasolarsSeleccionados=new ArrayList<PlanetaSistemaSolar>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPlanetaSistemaSolar.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPlanetaSistemaSolar.getSelectedRows().length;			
			}
			
			planetasistemasolarsSeleccionados=this.getPlanetaSistemaSolarsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPlanetaSistemaSolar--;			
				//PlanetaSistemaSolar planetasistemasolarAux= new PlanetaSistemaSolar();			
				//planetasistemasolarAux.setId(this.iIdNuevoPlanetaSistemaSolar);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PlanetaSistemaSolar planetasistemasolarOrigen=new PlanetaSistemaSolar();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PlanetaSistemaSolar planetasistemasolarOrigen : planetasistemasolarsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPlanetaSistemaSolar.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							planetasistemasolarOrigen =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planetasistemasolarOrigen =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPlanetaSistemaSolar();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.planetasistemasolar.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPlanetaSistemaSolar(planetasistemasolarOrigen,this.planetasistemasolar,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPlanetaSistemaSolar(this.planetasistemasolar);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.planetasistemasolarLogic.getPlanetaSistemaSolars().add(this.planetasistemasolarAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.planetasistemasolars.add(this.planetasistemasolarAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPlanetaSistemaSolar(false);
				
				this.jTableDatosPlanetaSistemaSolar.setRowSelectionInterval(this.getIndiceNuevoPlanetaSistemaSolar(), this.getIndiceNuevoPlanetaSistemaSolar());
				
				int iLastRow =  this.jTableDatosPlanetaSistemaSolar.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPlanetaSistemaSolar.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPlanetaSistemaSolar.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPlanetaSistemaSolar(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPlanetaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PlanetaSistemaSolar> planetasistemasolarsSeleccionados=new ArrayList<PlanetaSistemaSolar>();									
		
			PlanetaSistemaSolar planetasistemasolarOrigen=new PlanetaSistemaSolar();
			PlanetaSistemaSolar planetasistemasolarDestino=new PlanetaSistemaSolar();
				
			planetasistemasolarsSeleccionados=this.getPlanetaSistemaSolarsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPlanetaSistemaSolar.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || planetasistemasolarsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPlanetaSistemaSolar.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						planetasistemasolarOrigen =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						planetasistemasolarOrigen =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						planetasistemasolarDestino =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						planetasistemasolarDestino =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				planetasistemasolarOrigen =planetasistemasolarsSeleccionados.get(0);
				planetasistemasolarDestino =planetasistemasolarsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPlanetaSistemaSolar(planetasistemasolarOrigen,planetasistemasolarDestino,true,false);
				
				planetasistemasolarDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(planetasistemasolarDestino,planetasistemasolarLogic.getPlanetaSistemaSolars());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(planetasistemasolarDestino,planetasistemasolars);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPlanetaSistemaSolar(false);
				
				//this.jTableDatosPlanetaSistemaSolar.setRowSelectionInterval(this.getIndiceNuevoPlanetaSistemaSolar(), this.getIndiceNuevoPlanetaSistemaSolar());
				
				int iLastRow =  this.jTableDatosPlanetaSistemaSolar.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPlanetaSistemaSolar.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPlanetaSistemaSolar.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPlanetaSistemaSolar(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPlanetaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPlanetaSistemaSolar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPlanetaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPlanetaSistemaSolar.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPlanetaSistemaSolar.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPlanetaSistemaSolar.setVisible(!isVisible);
			this.jPanelPaginacionPlanetaSistemaSolar.setVisible(!isVisible);
			this.jPanelAccionesPlanetaSistemaSolar.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPlanetaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePlanetaSistemaSolar();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPlanetaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPlanetaSistemaSolar();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPlanetaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPlanetaSistemaSolar();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPlanetaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPlanetaSistemaSolar();
			
			this.abrirFrameOrderByPlanetaSistemaSolar();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPlanetaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPlanetaSistemaSolar();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePlanetaSistemaSolar(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPlanetaSistemaSolar);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPlanetaSistemaSolar.isMaximum()) {
					this.jInternalFrameDetalleFormPlanetaSistemaSolar.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPlanetaSistemaSolar.setSize(this.jInternalFrameDetalleFormPlanetaSistemaSolar.iWidthFormulario,this.jInternalFrameDetalleFormPlanetaSistemaSolar.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPlanetaSistemaSolar.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPlanetaSistemaSolar.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPlanetaSistemaSolar.isMaximum()) {
						this.jInternalFrameDetalleFormPlanetaSistemaSolar.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPlanetaSistemaSolar.jContentPaneDetallePlanetaSistemaSolar.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTabbedPaneRelacionesPlanetaSistemaSolar.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPlanetaSistemaSolar.jContentPaneDetallePlanetaSistemaSolar.getWidth(),PlanetaSistemaSolarConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTabbedPaneRelacionesPlanetaSistemaSolar.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPlanetaSistemaSolar.jContentPaneDetallePlanetaSistemaSolar.getWidth(),PlanetaSistemaSolarConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTabbedPaneRelacionesPlanetaSistemaSolar.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPlanetaSistemaSolar.jContentPaneDetallePlanetaSistemaSolar.getWidth(),PlanetaSistemaSolarConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPlanetaSistemaSolar.setVisible(true);
	        this.jInternalFrameDetalleFormPlanetaSistemaSolar.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPlanetaSistemaSolar() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPlanetaSistemaSolar==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPlanetaSistemaSolar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPlanetaSistemaSolar,false,this);
				} else {
					this.jInternalFrameOrderByPlanetaSistemaSolar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPlanetaSistemaSolar,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPlanetaSistemaSolar);
				this.jInternalFrameOrderByPlanetaSistemaSolar.setVisible(false);
				this.jInternalFrameOrderByPlanetaSistemaSolar.setSelected(false);
				
				this.jInternalFrameOrderByPlanetaSistemaSolar.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPlanetaSistemaSolar"));
				
				this.inicializarActualizarBindingTablaOrderByPlanetaSistemaSolar();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPlanetaSistemaSolar() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPlanetaSistemaSolar==null) {
				
				this.jInternalFrameImportacionPlanetaSistemaSolar=new ImportacionJInternalFrame(PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPlanetaSistemaSolar);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPlanetaSistemaSolar);
				this.jInternalFrameImportacionPlanetaSistemaSolar.setVisible(false);
				this.jInternalFrameImportacionPlanetaSistemaSolar.setSelected(false);


				this.jInternalFrameImportacionPlanetaSistemaSolar.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPlanetaSistemaSolar"));
				this.jInternalFrameImportacionPlanetaSistemaSolar.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPlanetaSistemaSolar"));
				this.jInternalFrameImportacionPlanetaSistemaSolar.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPlanetaSistemaSolar"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPlanetaSistemaSolar() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPlanetaSistemaSolar==null) {
				this.jInternalFrameReporteDinamicoPlanetaSistemaSolar=new ReporteDinamicoJInternalFrame(PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPlanetaSistemaSolar);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPlanetaSistemaSolar);
				this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.setVisible(false);
				this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPlanetaSistemaSolar"));
				this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPlanetaSistemaSolar"));
				this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPlanetaSistemaSolar"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPlanetaSistemaSolar();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePlanetaSistemaSolar() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPlanetaSistemaSolar);
			
	       	this.jInternalFrameDetalleFormPlanetaSistemaSolar.setVisible(false);
	        this.jInternalFrameDetalleFormPlanetaSistemaSolar.setSelected(false);
			
			//this.jInternalFrameDetalleFormPlanetaSistemaSolar.dispose();
			//this.jInternalFrameDetalleFormPlanetaSistemaSolar=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPlanetaSistemaSolar() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.setVisible(true);
	        this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPlanetaSistemaSolar() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPlanetaSistemaSolar.setVisible(true);
	        this.jInternalFrameImportacionPlanetaSistemaSolar.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPlanetaSistemaSolar() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPlanetaSistemaSolar.setVisible(true);
	        this.jInternalFrameOrderByPlanetaSistemaSolar.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPlanetaSistemaSolar() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPlanetaSistemaSolar.setVisible(false);
	        this.jInternalFrameOrderByPlanetaSistemaSolar.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPlanetaSistemaSolar() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.setVisible(false);
	        this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPlanetaSistemaSolar() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPlanetaSistemaSolar.setVisible(false);
	        this.jInternalFrameImportacionPlanetaSistemaSolar.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPlanetaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPlanetaSistemaSolar(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPlanetaSistemaSolar(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPlanetaSistemaSolar.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPlanetaSistemaSolar(true);
			//this.isEsNuevoPlanetaSistemaSolar=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPlanetaSistemaSolar("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPlanetaSistemaSolar(false) ;
			
			if(planetasistemasolarSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PlanetaSistemaSolarJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePlanetaSistemaSolar(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPlanetaSistemaSolar(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPlanetaSistemaSolarActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPlanetaSistemaSolar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPlanetaSistemaSolar(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPlanetaSistemaSolar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPlanetaSistemaSolar.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPlanetaSistemaSolar(true);
			//this.isEsNuevoPlanetaSistemaSolar=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.planetasistemasolar.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPlanetaSistemaSolar("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPlanetaSistemaSolar(false) ;
			
			if(PlanetaSistemaSolarJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePlanetaSistemaSolar(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPlanetaSistemaSolar(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaTipoValoracion(List<TipoValoracion> tipovaloracionsForeignKey)throws Exception{
		TableColumn tableColumnTipoValoracion=this.jTableDatosPlanetaSistemaSolar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlanetaSistemaSolar,PlanetaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION));
		TableCellEditor tableCellEditorTipoValoracion =tableColumnTipoValoracion.getCellEditor();

		TipoValoracionTableCell tipovaloracionTableCellFk=(TipoValoracionTableCell)tableCellEditorTipoValoracion;

		if(tipovaloracionTableCellFk!=null) {
			tipovaloracionTableCellFk.settipovaloracionsForeignKey(tipovaloracionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPlanetaSistemaSolar.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipovaloracionTableCellFk.setRowActual(intSelectedRow);
			//tipovaloracionTableCellFk.settipovaloracionsForeignKeyActual(tipovaloracionsForeignKey);
		//}


		if(tipovaloracionTableCellFk!=null) {
			tipovaloracionTableCellFk.RecargarTipoValoracionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarPlanetaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPlanetaSistemaSolar(false);
			
			//if(!this.isEsNuevoPlanetaSistemaSolar) {								
				int intSelectedRow = this.jTableDatosPlanetaSistemaSolar.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPlanetaSistemaSolar(this.planetasistemasolar,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlanetaSistemaSolar(this.planetasistemasolar);
				
			}
			
			if(this.permiteMantenimiento(this.planetasistemasolar)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPlanetaSistemaSolar=true;
					this.inicializarActualizarBindingTablaPlanetaSistemaSolar(false);
					this.isEsNuevoPlanetaSistemaSolar=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPlanetaSistemaSolar=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPlanetaSistemaSolar=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPlanetaSistemaSolar(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPlanetaSistemaSolar(false);
				
				this.habilitarDeshabilitarControlesPlanetaSistemaSolar(false);
			
												
				
				if(PlanetaSistemaSolarJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePlanetaSistemaSolar();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPlanetaSistemaSolarActionPerformed(evt,planetasistemasolarSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPlanetaSistemaSolar(this.planetasistemasolar,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPlanetaSistemaSolar.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,planetasistemasolarSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.planetasistemasolar.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PlanetaSistemaSolar.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlanetaSistemaSolar.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPlanetaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPlanetaSistemaSolar.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				this.planetasistemasolar.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				this.planetasistemasolar.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.planetasistemasolar)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PlanetaSistemaSolarModel) this.jTableDatosPlanetaSistemaSolar.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPlanetaSistemaSolar=true;
				this.inicializarActualizarBindingTablaPlanetaSistemaSolar(false);
				this.isEsNuevoPlanetaSistemaSolar=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPlanetaSistemaSolar(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPlanetaSistemaSolar(false);
				
				this.habilitarDeshabilitarControlesPlanetaSistemaSolar(false);
				
				
				
				if(PlanetaSistemaSolarJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePlanetaSistemaSolar();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPlanetaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPlanetaSistemaSolar.getRowCount()>=1) {
				jTableDatosPlanetaSistemaSolar.removeRowSelectionInterval(0, jTableDatosPlanetaSistemaSolar.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPlanetaSistemaSolar(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPlanetaSistemaSolar(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPlanetaSistemaSolar(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPlanetaSistemaSolar(false) ;
			
			this.isEsNuevoPlanetaSistemaSolar=false;
			
			if(PlanetaSistemaSolarJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePlanetaSistemaSolar();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPlanetaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPlanetaSistemaSolar(false);
				
				//SI ES MANUAL
				if(PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPlanetaSistemaSolar();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPlanetaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPlanetaSistemaSolar--;			
			//PlanetaSistemaSolar planetasistemasolarAux= new PlanetaSistemaSolar();			
			//planetasistemasolarAux.setId(this.iIdNuevoPlanetaSistemaSolar);
			
			if(this.jInternalFrameDetalleFormPlanetaSistemaSolar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPlanetaSistemaSolar();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPlanetaSistemaSolar(this.planetasistemasolar);
			
			this.planetasistemasolar.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.planetasistemasolarLogic.getPlanetaSistemaSolars().add(this.planetasistemasolarAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.planetasistemasolars.add(this.planetasistemasolarAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPlanetaSistemaSolar(false);
			
			this.jTableDatosPlanetaSistemaSolar.setRowSelectionInterval(this.getIndiceNuevoPlanetaSistemaSolar(), this.getIndiceNuevoPlanetaSistemaSolar());
			
			int iLastRow =  this.jTableDatosPlanetaSistemaSolar.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPlanetaSistemaSolar.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPlanetaSistemaSolar.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPlanetaSistemaSolar(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPlanetaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPlanetaSistemaSolar(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPlanetaSistemaSolar(false);
			
			//SI ES MANUAL
			if(PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPlanetaSistemaSolar();
			}
			
			//this.abrirFrameTreePlanetaSistemaSolar();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPlanetaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Planeta Sistema SolarES ?", "MANTENIMIENTO DE Planeta Sistema Solar", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPlanetaSistemaSolar.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPlanetaSistemaSolar();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.planetasistemasolarReturnGeneral=planetasistemasolarLogic.procesarImportacionPlanetaSistemaSolarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.planetasistemasolarParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPlanetaSistemaSolarReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPlanetaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPlanetaSistemaSolar.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPlanetaSistemaSolar.setFileImportacion(this.jInternalFrameImportacionPlanetaSistemaSolar.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPlanetaSistemaSolar.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPlanetaSistemaSolar.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPlanetaSistemaSolar.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPlanetaSistemaSolar.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPlanetaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PlanetaSistemaSolar> planetasistemasolarsSeleccionados=new ArrayList<PlanetaSistemaSolar>();		

		planetasistemasolarsSeleccionados=this.getPlanetaSistemaSolarsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PlanetaSistemaSolarBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PlanetaSistemaSolarBaseDesign.jrxml";
			
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
			
			this.generarReportePlanetaSistemaSolars("Todos",planetasistemasolarsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Planeta Sistema Solar",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PlanetaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoValoracion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoValoracion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoValoracion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoValoracion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlanetaSistemaSolarConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlanetaSistemaSolarConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlanetaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PlanetaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION:
					sNombreCampoCategoria="id_tipo_valoracion";
					break;

				case PlanetaSistemaSolarConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case PlanetaSistemaSolarConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case PlanetaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PlanetaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION:
					sNombreCampoCategoriaValor="id_tipo_valoracion";
					break;

				case PlanetaSistemaSolarConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case PlanetaSistemaSolarConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case PlanetaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PlanetaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Valoracion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_valoracion");
					break;

				case PlanetaSistemaSolarConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case PlanetaSistemaSolarConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case PlanetaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoPlanetaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PlanetaSistemaSolar> planetasistemasolarsSeleccionados=new ArrayList<PlanetaSistemaSolar>();		
		
		planetasistemasolarsSeleccionados=this.getPlanetaSistemaSolarsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planetasistemasolar";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PlanetaSistemaSolars");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PlanetaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlanetaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION);
					iRow++;

					for(PlanetaSistemaSolar planetasistemasolar:planetasistemasolarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planetasistemasolar.gettipovaloracion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlanetaSistemaSolarConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlanetaSistemaSolarConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(PlanetaSistemaSolar planetasistemasolar:planetasistemasolarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planetasistemasolar.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlanetaSistemaSolarConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlanetaSistemaSolarConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(PlanetaSistemaSolar planetasistemasolar:planetasistemasolarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planetasistemasolar.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlanetaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlanetaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(PlanetaSistemaSolar planetasistemasolar:planetasistemasolarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planetasistemasolar.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelPlanetaSistemaSolar(row);				
			//	iRow++;
			//}				
			
			//for(PlanetaSistemaSolar planetasistemasolarAux:planetasistemasolarsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPlanetaSistemaSolar(planetasistemasolarAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Planeta Sistema Solar",JOptionPane.INFORMATION_MESSAGE);
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
				this.planetasistemasolarLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPlanetaSistemaSolar(false);
			
			//SI ES MANUAL
			if(PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPlanetaSistemaSolar();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPlanetaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPlanetaSistemaSolar(false);
			
			//SI ES MANUAL
			if(PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPlanetaSistemaSolar();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPlanetaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPlanetaSistemaSolar(false);
			
			//SI ES MANUAL
			if(PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPlanetaSistemaSolar();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPlanetaSistemaSolar() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPlanetaSistemaSolar.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPlanetaSistemaSolar.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPlanetaSistemaSolar.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPlanetaSistemaSolar.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPlanetaSistemaSolar.setMinimumSize(dimensionMinimum);
		this.jTableDatosPlanetaSistemaSolar.setMaximumSize(dimensionMaximum);
		this.jTableDatosPlanetaSistemaSolar.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPlanetaSistemaSolar(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPlanetaSistemaSolar(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPlanetaSistemaSolar(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPlanetaSistemaSolar(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPlanetaSistemaSolar(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPlanetaSistemaSolar(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPlanetaSistemaSolar(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPlanetaSistemaSolar(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPlanetaSistemaSolar() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPlanetaSistemaSolar();
		
		this.inicializarActualizarBindingBotonesManualPlanetaSistemaSolar(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPlanetaSistemaSolar();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPlanetaSistemaSolar() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPlanetaSistemaSolar(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPlanetaSistemaSolar(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPlanetaSistemaSolar.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPlanetaSistemaSolar.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePlanetaSistemaSolar.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jCheckBoxPostAccionNuevoPlanetaSistemaSolar.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jCheckBoxPostAccionSinCerrarPlanetaSistemaSolar.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jCheckBoxPostAccionSinMensajePlanetaSistemaSolar.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPlanetaSistemaSolar.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPlanetaSistemaSolar.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePlanetaSistemaSolar.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {
				this.jInternalFrameDetalleFormPlanetaSistemaSolar.jCheckBoxPostAccionNuevoPlanetaSistemaSolar.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPlanetaSistemaSolar.jCheckBoxPostAccionSinCerrarPlanetaSistemaSolar.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPlanetaSistemaSolar.jCheckBoxPostAccionSinMensajePlanetaSistemaSolar.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPlanetaSistemaSolar.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPlanetaSistemaSolar.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPlanetaSistemaSolar.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPlanetaSistemaSolar!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPlanetaSistemaSolar.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPlanetaSistemaSolar.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPlanetaSistemaSolar.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPlanetaSistemaSolar.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPlanetaSistemaSolar!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPlanetaSistemaSolar.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPlanetaSistemaSolar.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPlanetaSistemaSolar(Boolean esInicializar) throws Exception {
		try	{	
			if(PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPlanetaSistemaSolar(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPlanetaSistemaSolar() throws Exception {
		try	{
			if(PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPlanetaSistemaSolar();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePlanetaSistemaSolar() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPlanetaSistemaSolar() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPlanetaSistemaSolar.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPlanetaSistemaSolar.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPlanetaSistemaSolar.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPlanetaSistemaSolar.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPlanetaSistemaSolar.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPlanetaSistemaSolar.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPlanetaSistemaSolar.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPlanetaSistemaSolar.addItem(reporte);
			}
			
			
			if(!this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPlanetaSistemaSolar.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPlanetaSistemaSolar.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPlanetaSistemaSolar.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPlanetaSistemaSolar.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPlanetaSistemaSolar.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPlanetaSistemaSolar.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPlanetaSistemaSolar.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPlanetaSistemaSolar.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPlanetaSistemaSolar.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPlanetaSistemaSolar();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPlanetaSistemaSolar() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPlanetaSistemaSolar!=null) {
				this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPlanetaSistemaSolar!=null) {
				this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPlanetaSistemaSolar!=null) {
				
				if(this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPlanetaSistemaSolar()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoPlanetaSistemaSolar.getText();
		if(this.jComboBoxid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar.getSelectedItem()!=null){this.id_tipo_valoracionFK_IdTipoValoracion=((TipoValoracion)this.jComboBoxid_tipo_valoracionFK_IdTipoValoracionPlanetaSistemaSolar.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPlanetaSistemaSolar(Boolean esInicializar) throws Exception {				
		if(PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPlanetaSistemaSolar();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPlanetaSistemaSolar() throws Exception {
		this.inicializarActualizarBindingTablaPlanetaSistemaSolar(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPlanetaSistemaSolar() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPlanetaSistemaSolar.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPlanetaSistemaSolar.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPlanetaSistemaSolar.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PlanetaSistemaSolarPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPlanetaSistemaSolar.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPlanetaSistemaSolar.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PlanetaSistemaSolarPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPlanetaSistemaSolarOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlanetaSistemaSolarOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PlanetaSistemaSolarPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPlanetaSistemaSolar.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPlanetaSistemaSolar.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PlanetaSistemaSolarPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPlanetaSistemaSolar.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPlanetaSistemaSolar(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=planetasistemasolarLogic.getPlanetaSistemaSolars().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=planetasistemasolars.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPlanetaSistemaSolar.setModel(new PlanetaSistemaSolarModel(this.planetasistemasolarLogic.getPlanetaSistemaSolars(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPlanetaSistemaSolar.setModel(new PlanetaSistemaSolarModel(this.planetasistemasolars,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPlanetaSistemaSolar!=null && this.jInternalFrameOrderByPlanetaSistemaSolar.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPlanetaSistemaSolar();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPlanetaSistemaSolar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlanetaSistemaSolar,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PlanetaSistemaSolarPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO,planetasistemasolarConstantesFunciones.resaltarSeleccionarPlanetaSistemaSolar,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO,planetasistemasolarConstantesFunciones.resaltarSeleccionarPlanetaSistemaSolar,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPlanetaSistemaSolar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlanetaSistemaSolar,PlanetaSistemaSolarConstantesFunciones.LABEL_ID));

		if(this.planetasistemasolarConstantesFunciones.mostraridPlanetaSistemaSolar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlanetaSistemaSolarConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.planetasistemasolarConstantesFunciones.resaltaridPlanetaSistemaSolar,this.planetasistemasolarConstantesFunciones.activaridPlanetaSistemaSolar,this,true,"idPlanetaSistemaSolar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.planetasistemasolarConstantesFunciones.resaltaridPlanetaSistemaSolar,this.planetasistemasolarConstantesFunciones.activaridPlanetaSistemaSolar,this,true,"idPlanetaSistemaSolar","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlanetaSistemaSolar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlanetaSistemaSolar,PlanetaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION));

		if(this.planetasistemasolarConstantesFunciones.mostrarid_tipo_valoracionPlanetaSistemaSolar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlanetaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoValoracionTableCell(this.tipovaloracionsForeignKey,this.planetasistemasolarConstantesFunciones.resaltarid_tipo_valoracionPlanetaSistemaSolar,this,this.planetasistemasolarConstantesFunciones.activarid_tipo_valoracionPlanetaSistemaSolar));
			tableColumn.setCellEditor(new TipoValoracionTableCell(this.tipovaloracionsForeignKey,this.planetasistemasolarConstantesFunciones.resaltarid_tipo_valoracionPlanetaSistemaSolar,this,this.planetasistemasolarConstantesFunciones.activarid_tipo_valoracionPlanetaSistemaSolar,true,"id_tipo_valoracionPlanetaSistemaSolar","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlanetaSistemaSolarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlanetaSistemaSolar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlanetaSistemaSolar,PlanetaSistemaSolarConstantesFunciones.LABEL_CODIGO));

		if(this.planetasistemasolarConstantesFunciones.mostrarcodigoPlanetaSistemaSolar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlanetaSistemaSolarConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.planetasistemasolarConstantesFunciones.resaltarcodigoPlanetaSistemaSolar,this.planetasistemasolarConstantesFunciones.activarcodigoPlanetaSistemaSolar,this,true,"codigoPlanetaSistemaSolar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.planetasistemasolarConstantesFunciones.resaltarcodigoPlanetaSistemaSolar,this.planetasistemasolarConstantesFunciones.activarcodigoPlanetaSistemaSolar,this,true,"codigoPlanetaSistemaSolar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlanetaSistemaSolarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlanetaSistemaSolar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlanetaSistemaSolar,PlanetaSistemaSolarConstantesFunciones.LABEL_NOMBRE));

		if(this.planetasistemasolarConstantesFunciones.mostrarnombrePlanetaSistemaSolar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlanetaSistemaSolarConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.planetasistemasolarConstantesFunciones.resaltarnombrePlanetaSistemaSolar,this.planetasistemasolarConstantesFunciones.activarnombrePlanetaSistemaSolar,this,true,"nombrePlanetaSistemaSolar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.planetasistemasolarConstantesFunciones.resaltarnombrePlanetaSistemaSolar,this.planetasistemasolarConstantesFunciones.activarnombrePlanetaSistemaSolar,this,true,"nombrePlanetaSistemaSolar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlanetaSistemaSolarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlanetaSistemaSolar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlanetaSistemaSolar,PlanetaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION));

		if(this.planetasistemasolarConstantesFunciones.mostrardescripcionPlanetaSistemaSolar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlanetaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.planetasistemasolarConstantesFunciones.resaltardescripcionPlanetaSistemaSolar,this.planetasistemasolarConstantesFunciones.activardescripcionPlanetaSistemaSolar,this,true,"descripcionPlanetaSistemaSolar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.planetasistemasolarConstantesFunciones.resaltardescripcionPlanetaSistemaSolar,this.planetasistemasolarConstantesFunciones.activardescripcionPlanetaSistemaSolar,this,true,"descripcionPlanetaSistemaSolar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlanetaSistemaSolarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.planetasistemasolarSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.planetasistemasolarSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.planetasistemasolarSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPlanetaSistemaSolar.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.planetasistemasolarSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.planetasistemasolarSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPlanetaSistemaSolar.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPlanetaSistemaSolar && this.isPermisoGuardarCambiosPlanetaSistemaSolar) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.planetasistemasolarSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.planetasistemasolarSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPlanetaSistemaSolar.addColumn(tableColumn);
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
			
			this.jTableDatosPlanetaSistemaSolar.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPlanetaSistemaSolar && this.isPermisoGuardarCambiosPlanetaSistemaSolar) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPlanetaSistemaSolar && this.isPermisoGuardarCambiosPlanetaSistemaSolar) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPlanetaSistemaSolar.moveColumn(this.jTableDatosPlanetaSistemaSolar.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPlanetaSistemaSolar.moveColumn(this.jTableDatosPlanetaSistemaSolar.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPlanetaSistemaSolar.moveColumn(this.jTableDatosPlanetaSistemaSolar.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPlanetaSistemaSolar.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPlanetaSistemaSolar.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPlanetaSistemaSolar,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPlanetaSistemaSolar.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPlanetaSistemaSolar.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPlanetaSistemaSolar.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPlanetaSistemaSolar.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPlanetaSistemaSolar.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=planetasistemasolarLogic.getPlanetaSistemaSolars().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=planetasistemasolars.size()-1;
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
		//this.jTableDatosPlanetaSistemaSolar.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPlanetaSistemaSolar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPlanetaSistemaSolar();
			
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
				
				//this.isEsNuevoPlanetaSistemaSolar=false;
					
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
			
				if(this.planetasistemasolarSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPlanetaSistemaSolar==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPlanetaSistemaSolar.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPlanetaSistemaSolar.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.planetasistemasolar.getsType().equals("DUPLICADO")
				   || this.planetasistemasolar.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPlanetaSistemaSolar=true;
				
				} else {
					this.isEsNuevoPlanetaSistemaSolar=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
					if(this.planetasistemasolar.getId()>=0 && !this.planetasistemasolar.getIsNew()) {						
						this.isEsNuevoPlanetaSistemaSolar=false;
						
					} else {
						this.isEsNuevoPlanetaSistemaSolar=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPlanetaSistemaSolar(esRelaciones);						
				
				this.seleccionarPlanetaSistemaSolar(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.planetasistemasolar.getId()<0) {
					this.isEsNuevoPlanetaSistemaSolar=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPlanetaSistemaSolar(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPlanetaSistemaSolar(evt,rowIndex);
				}	
				
				if(this.planetasistemasolarSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PlanetaSistemaSolar: " + this.dDif); 
					}
				}								
				
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPlanetaSistemaSolar(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.planetasistemasolar)) {
					if(this.planetasistemasolar.getId()>0) {
						this.planetasistemasolar.setIsDeleted(true);
						
						this.planetasistemasolarsEliminados.add(this.planetasistemasolar);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.planetasistemasolarLogic.getPlanetaSistemaSolars().remove(this.planetasistemasolar);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.planetasistemasolars.remove(this.planetasistemasolar);				
					}
					
					
					((PlanetaSistemaSolarModel) this.jTableDatosPlanetaSistemaSolar.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPlanetaSistemaSolar(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPlanetaSistemaSolar(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPlanetaSistemaSolar) {
			
			if(this.jInternalFrameDetalleFormPlanetaSistemaSolar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPlanetaSistemaSolar.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPlanetaSistemaSolar.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPlanetaSistemaSolar(this.planetasistemasolar);
				}
				
				//ARCHITECTURE
				try {
					

					//TipoValoracion
					if(!this.planetasistemasolarConstantesFunciones.cargarid_tipo_valoracionPlanetaSistemaSolar || this.planetasistemasolarConstantesFunciones.event_dependid_tipo_valoracionPlanetaSistemaSolar) {
						//this.cargarCombosTipoValoracionsForeignKeyLista(" where id="+this.planetasistemasolar.getid_tipo_valoracion());
									//this.inicializarActualizarBindingPlanetaSistemaSolar(false,false);
						this.tipovaloracionsForeignKey=new ArrayList<TipoValoracion>();

						if(planetasistemasolar.getTipoValoracion()!=null) {
							this.tipovaloracionsForeignKey.add(planetasistemasolar.getTipoValoracion());
						}

						this.addItemDefectoCombosForeignKeyTipoValoracion();
						this.cargarCombosFrameTipoValoracionsForeignKey("Todos");
					}
					this.setActualTipoValoracionForeignKey(this.planetasistemasolar.getid_tipo_valoracion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPlanetaSistemaSolar("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPlanetaSistemaSolar(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPlanetaSistemaSolar() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPlanetaSistemaSolar(PlanetaSistemaSolar planetasistemasolar) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPlanetaSistemaSolar(planetasistemasolar,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPlanetaSistemaSolar(PlanetaSistemaSolar planetasistemasolar,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPlanetaSistemaSolar(planetasistemasolar);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPlanetaSistemaSolar(planetasistemasolar,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPlanetaSistemaSolar(planetasistemasolar);
	}
	
	public void setVariablesObjetoActualToFormularioPlanetaSistemaSolar(PlanetaSistemaSolar planetasistemasolar) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPlanetaSistemaSolar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextFieldidPlanetaSistemaSolar.setText(planetasistemasolar.getId().toString());
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextFieldcodigoPlanetaSistemaSolar.setText(planetasistemasolar.getcodigo());
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextAreanombrePlanetaSistemaSolar.setText(planetasistemasolar.getnombre());
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextAreadescripcionPlanetaSistemaSolar.setText(planetasistemasolar.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PlanetaSistemaSolar planetasistemasolarLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,planetasistemasolarLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PlanetaSistemaSolar planetasistemasolarLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				planetasistemasolarLocal=this.planetasistemasolar;
			} else {
				planetasistemasolarLocal=this.planetasistemasolarAnterior;
			}
		}
		
		if(this.permiteMantenimiento(planetasistemasolarLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPlanetaSistemaSolar(planetasistemasolarLocal,true);
					
					if(planetasistemasolarSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(planetasistemasolarLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(planetasistemasolarLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPlanetaSistemaSolar(PlanetaSistemaSolar planetasistemasolar,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPlanetaSistemaSolar(planetasistemasolar,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPlanetaSistemaSolar(planetasistemasolar);
	}
	
	public void setVariablesFormularioToObjetoActualPlanetaSistemaSolar(PlanetaSistemaSolar planetasistemasolar,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPlanetaSistemaSolar(planetasistemasolar,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPlanetaSistemaSolar(PlanetaSistemaSolar planetasistemasolar,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPlanetaSistemaSolar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextFieldidPlanetaSistemaSolar.getText()==null || this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextFieldidPlanetaSistemaSolar.getText()=="" || this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextFieldidPlanetaSistemaSolar.getText()=="Id") {
				this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextFieldidPlanetaSistemaSolar.setText("0");
			}

			if(conColumnasBase) {planetasistemasolar.setId(Long.parseLong(this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextFieldidPlanetaSistemaSolar.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlanetaSistemaSolarConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlanetaSistemaSolar.jLabelIdPlanetaSistemaSolar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planetasistemasolar.setcodigo(this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextFieldcodigoPlanetaSistemaSolar.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlanetaSistemaSolarConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlanetaSistemaSolar.jLabelcodigoPlanetaSistemaSolar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planetasistemasolar.setnombre(this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextAreanombrePlanetaSistemaSolar.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlanetaSistemaSolarConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlanetaSistemaSolar.jLabelnombrePlanetaSistemaSolar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planetasistemasolar.setdescripcion(this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextAreadescripcionPlanetaSistemaSolar.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlanetaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlanetaSistemaSolar.jLabeldescripcionPlanetaSistemaSolar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPlanetaSistemaSolar(PlanetaSistemaSolar planetasistemasolarBean,PlanetaSistemaSolar planetasistemasolar,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && planetasistemasolarBean.getid_tipo_valoracion()!=null && !planetasistemasolarBean.getid_tipo_valoracion().equals(-1L))) {planetasistemasolar.setid_tipo_valoracion(planetasistemasolarBean.getid_tipo_valoracion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPlanetaSistemaSolar(PlanetaSistemaSolar planetasistemasolarOrigen,PlanetaSistemaSolar planetasistemasolar,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && planetasistemasolarOrigen.getId()!=null && !planetasistemasolarOrigen.getId().equals(0L))) {planetasistemasolar.setId(planetasistemasolarOrigen.getId());}}
			if(conDefault || (!conDefault && planetasistemasolarOrigen.getid_tipo_valoracion()!=null && !planetasistemasolarOrigen.getid_tipo_valoracion().equals(-1L))) {planetasistemasolar.setid_tipo_valoracion(planetasistemasolarOrigen.getid_tipo_valoracion());}
			if(conDefault || (!conDefault && planetasistemasolarOrigen.getcodigo()!=null && !planetasistemasolarOrigen.getcodigo().equals(""))) {planetasistemasolar.setcodigo(planetasistemasolarOrigen.getcodigo());}
			if(conDefault || (!conDefault && planetasistemasolarOrigen.getnombre()!=null && !planetasistemasolarOrigen.getnombre().equals(""))) {planetasistemasolar.setnombre(planetasistemasolarOrigen.getnombre());}
			if(conDefault || (!conDefault && planetasistemasolarOrigen.getdescripcion()!=null && !planetasistemasolarOrigen.getdescripcion().equals(""))) {planetasistemasolar.setdescripcion(planetasistemasolarOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPlanetaSistemaSolar(PlanetaSistemaSolar planetasistemasolar) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextFieldidPlanetaSistemaSolar.setText(planetasistemasolar.getId().toString());
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextFieldcodigoPlanetaSistemaSolar.setText(planetasistemasolar.getcodigo());
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextAreanombrePlanetaSistemaSolar.setText(planetasistemasolar.getnombre());
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextAreadescripcionPlanetaSistemaSolar.setText(planetasistemasolar.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPlanetaSistemaSolar(PlanetaSistemaSolarBean planetasistemasolarBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextFieldidPlanetaSistemaSolar.setText(planetasistemasolarBean.getId().toString());
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextFieldcodigoPlanetaSistemaSolar.setText(planetasistemasolarBean.getcodigo());
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextAreanombrePlanetaSistemaSolar.setText(planetasistemasolarBean.getnombre());
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextAreadescripcionPlanetaSistemaSolar.setText(planetasistemasolarBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPlanetaSistemaSolar(PlanetaSistemaSolarParameterReturnGeneral planetasistemasolarReturnGeneral,PlanetaSistemaSolarBean planetasistemasolarBean,Boolean conDefault) throws Exception { 
		try {
			PlanetaSistemaSolar planetasistemasolarLocal=new PlanetaSistemaSolar();
			
			planetasistemasolarLocal=planetasistemasolarReturnGeneral.getPlanetaSistemaSolar();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && planetasistemasolarLocal.getId()!=null && !planetasistemasolarLocal.getId().equals(0L))) {planetasistemasolarBean.setId(planetasistemasolarLocal.getId());}}
			if(conDefault || (!conDefault && planetasistemasolarLocal.getid_tipo_valoracion()!=null && !planetasistemasolarLocal.getid_tipo_valoracion().equals(-1L))) {planetasistemasolarBean.setid_tipo_valoracion(planetasistemasolarLocal.getid_tipo_valoracion());}
			if(conDefault || (!conDefault && planetasistemasolarLocal.getcodigo()!=null && !planetasistemasolarLocal.getcodigo().equals(""))) {planetasistemasolarBean.setcodigo(planetasistemasolarLocal.getcodigo());}
			if(conDefault || (!conDefault && planetasistemasolarLocal.getnombre()!=null && !planetasistemasolarLocal.getnombre().equals(""))) {planetasistemasolarBean.setnombre(planetasistemasolarLocal.getnombre());}
			if(conDefault || (!conDefault && planetasistemasolarLocal.getdescripcion()!=null && !planetasistemasolarLocal.getdescripcion().equals(""))) {planetasistemasolarBean.setdescripcion(planetasistemasolarLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPlanetaSistemaSolarGenerico(Long idPlanetaSistemaSolarSeleccionado,JComboBox jComboBoxPlanetaSistemaSolar,List<PlanetaSistemaSolar> planetasistemasolarsLocal)throws Exception {
		try {
			PlanetaSistemaSolar  planetasistemasolarTemp=null;

			for(PlanetaSistemaSolar planetasistemasolarAux:planetasistemasolarsLocal) {
				if(planetasistemasolarAux.getId()!=null && planetasistemasolarAux.getId().equals(idPlanetaSistemaSolarSeleccionado)) {
					planetasistemasolarTemp=planetasistemasolarAux;
					break;
				}
			}

			jComboBoxPlanetaSistemaSolar.setSelectedItem(planetasistemasolarTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPlanetaSistemaSolarGenerico(JComboBox jComboBoxPlanetaSistemaSolar,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPlanetaSistemaSolar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPlanetaSistemaSolar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPlanetaSistemaSolar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPlanetaSistemaSolar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPlanetaSistemaSolar.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPlanetaSistemaSolar.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPlanetaSistemaSolar.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPlanetaSistemaSolar.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPlanetaSistemaSolar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPlanetaSistemaSolar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			planetasistemasolar=(PlanetaSistemaSolar) planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			planetasistemasolar =(PlanetaSistemaSolar) planetasistemasolars.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("TipoValoracion")) {
			//sDescripcion=this.getActualTipoValoracionForeignKeyDescripcion((Long)value);
			if(!planetasistemasolar.getIsNew() && !planetasistemasolar.getIsChanged() && !planetasistemasolar.getIsDeleted()) {
				sDescripcion=planetasistemasolar.gettipovaloracion_descripcion();
			} else {
				//sDescripcion=this.getActualTipoValoracionForeignKeyDescripcion((Long)value);
				sDescripcion=planetasistemasolar.gettipovaloracion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PlanetaSistemaSolar planetasistemasolarRow=new PlanetaSistemaSolar();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			planetasistemasolarRow=(PlanetaSistemaSolar) planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			planetasistemasolarRow=(PlanetaSistemaSolar) planetasistemasolars.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPlanetaSistemaSolar(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaNuevoPlanetaSistemaSolar && this.isPermisoNuevoPlanetaSistemaSolar));			
			this.jButtonDuplicarPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaDuplicarPlanetaSistemaSolar && this.isPermisoDuplicarPlanetaSistemaSolar));			
			this.jButtonCopiarPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaCopiarPlanetaSistemaSolar && this.isPermisoCopiarPlanetaSistemaSolar));
			this.jButtonVerFormPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaVerFormPlanetaSistemaSolar && this.isPermisoVerFormPlanetaSistemaSolar));
			
			this.jButtonAbrirOrderByPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaOrdenPlanetaSistemaSolar && this.isPermisoOrdenPlanetaSistemaSolar));			
			
			this.jButtonNuevoRelacionesPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar && this.isPermisoNuevoPlanetaSistemaSolar));			
			this.jButtonNuevoGuardarCambiosPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaNuevoPlanetaSistemaSolar && this.isPermisoNuevoPlanetaSistemaSolar && this.isPermisoGuardarCambiosPlanetaSistemaSolar));
			
			if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonModificarPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaModificarPlanetaSistemaSolar && this.isPermisoActualizarPlanetaSistemaSolar));	
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonActualizarPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaActualizarPlanetaSistemaSolar && this.isPermisoActualizarPlanetaSistemaSolar));	
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonEliminarPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaEliminarPlanetaSistemaSolar && this.isPermisoEliminarPlanetaSistemaSolar));
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonCancelarPlanetaSistemaSolar.setVisible(this.isVisibilidadCeldaCancelarPlanetaSistemaSolar);							
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonGuardarCambiosPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaGuardarPlanetaSistemaSolar && this.isPermisoGuardarCambiosPlanetaSistemaSolar));			
			
			}
						
			this.jButtonGuardarCambiosTablaPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaGuardarCambiosPlanetaSistemaSolar && this.isPermisoGuardarCambiosPlanetaSistemaSolar));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaNuevoPlanetaSistemaSolar && this.isPermisoNuevoPlanetaSistemaSolar));						
			this.jButtonDuplicarToolBarPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaDuplicarPlanetaSistemaSolar && this.isPermisoDuplicarPlanetaSistemaSolar));						
			this.jButtonCopiarToolBarPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaCopiarPlanetaSistemaSolar && this.isPermisoCopiarPlanetaSistemaSolar));			
			this.jButtonVerFormToolBarPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaVerFormPlanetaSistemaSolar && this.isPermisoVerFormPlanetaSistemaSolar));			
			this.jButtonAbrirOrderByToolBarPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaOrdenPlanetaSistemaSolar && this.isPermisoOrdenPlanetaSistemaSolar));
			this.jButtonNuevoRelacionesToolBarPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar && this.isPermisoNuevoPlanetaSistemaSolar));			
			this.jButtonNuevoGuardarCambiosToolBarPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaNuevoPlanetaSistemaSolar && this.isPermisoNuevoPlanetaSistemaSolar && this.isPermisoGuardarCambiosPlanetaSistemaSolar));			
			
			if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonModificarToolBarPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaModificarPlanetaSistemaSolar && this.isPermisoActualizarPlanetaSistemaSolar));	
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonActualizarToolBarPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaActualizarPlanetaSistemaSolar  && this.isPermisoActualizarPlanetaSistemaSolar));	
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonEliminarToolBarPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaEliminarPlanetaSistemaSolar && this.isPermisoEliminarPlanetaSistemaSolar));
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonCancelarToolBarPlanetaSistemaSolar.setVisible(this.isVisibilidadCeldaCancelarPlanetaSistemaSolar);				
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonGuardarCambiosToolBarPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaGuardarPlanetaSistemaSolar && this.isPermisoGuardarCambiosPlanetaSistemaSolar));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaGuardarCambiosPlanetaSistemaSolar && this.isPermisoGuardarCambiosPlanetaSistemaSolar));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaNuevoPlanetaSistemaSolar && this.isPermisoNuevoPlanetaSistemaSolar));			
			this.jMenuItemDuplicarPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaDuplicarPlanetaSistemaSolar && this.isPermisoDuplicarPlanetaSistemaSolar));			
			this.jMenuItemCopiarPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaCopiarPlanetaSistemaSolar && this.isPermisoCopiarPlanetaSistemaSolar));			
			this.jMenuItemVerFormPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaVerFormPlanetaSistemaSolar && this.isPermisoVerFormPlanetaSistemaSolar));			
			this.jMenuItemAbrirOrderByPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaOrdenPlanetaSistemaSolar && this.isPermisoOrdenPlanetaSistemaSolar));			
			//this.jMenuItemMostrarOcultarPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaOrdenPlanetaSistemaSolar && this.isPermisoOrdenPlanetaSistemaSolar));
			this.jMenuItemDetalleAbrirOrderByPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaOrdenPlanetaSistemaSolar && this.isPermisoOrdenPlanetaSistemaSolar));			
			//this.jMenuItemDetalleMostrarOcultarPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaOrdenPlanetaSistemaSolar && this.isPermisoOrdenPlanetaSistemaSolar));			
			this.jMenuItemNuevoRelacionesPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar && this.isPermisoNuevoPlanetaSistemaSolar));			
			this.jMenuItemNuevoGuardarCambiosPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaNuevoPlanetaSistemaSolar && this.isPermisoNuevoPlanetaSistemaSolar && this.isPermisoGuardarCambiosPlanetaSistemaSolar));									
			
			if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jMenuItemModificarPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaModificarPlanetaSistemaSolar && this.isPermisoActualizarPlanetaSistemaSolar));	
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jMenuItemActualizarPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaActualizarPlanetaSistemaSolar && this.isPermisoActualizarPlanetaSistemaSolar));	
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jMenuItemEliminarPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaEliminarPlanetaSistemaSolar && this.isPermisoEliminarPlanetaSistemaSolar));
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jMenuItemCancelarPlanetaSistemaSolar.setVisible(this.isVisibilidadCeldaCancelarPlanetaSistemaSolar);				
			}
			
			this.jMenuItemGuardarCambiosPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaGuardarPlanetaSistemaSolar && this.isPermisoGuardarCambiosPlanetaSistemaSolar));						
			this.jMenuItemGuardarCambiosTablaPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaGuardarCambiosPlanetaSistemaSolar && this.isPermisoGuardarCambiosPlanetaSistemaSolar));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPlanetaSistemaSolar=this.jButtonNuevoPlanetaSistemaSolar.isVisible();
			this.isVisibilidadCeldaDuplicarPlanetaSistemaSolar=this.jButtonDuplicarPlanetaSistemaSolar.isVisible();
			this.isVisibilidadCeldaCopiarPlanetaSistemaSolar=this.jButtonCopiarPlanetaSistemaSolar.isVisible();
			this.isVisibilidadCeldaVerFormPlanetaSistemaSolar=this.jButtonVerFormPlanetaSistemaSolar.isVisible();
			
			this.isVisibilidadCeldaOrdenPlanetaSistemaSolar=this.jButtonAbrirOrderByPlanetaSistemaSolar.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar=this.jButtonNuevoRelacionesPlanetaSistemaSolar.isVisible();
			this.isVisibilidadCeldaModificarPlanetaSistemaSolar=this.jButtonModificarPlanetaSistemaSolar.isVisible();
			
			if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {
			this.isVisibilidadCeldaActualizarPlanetaSistemaSolar=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonActualizarPlanetaSistemaSolar.isVisible();
			this.isVisibilidadCeldaEliminarPlanetaSistemaSolar=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonEliminarPlanetaSistemaSolar.isVisible();
			this.isVisibilidadCeldaCancelarPlanetaSistemaSolar=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonCancelarPlanetaSistemaSolar.isVisible();
			this.isVisibilidadCeldaGuardarPlanetaSistemaSolar=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonGuardarCambiosPlanetaSistemaSolar.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPlanetaSistemaSolar=this.jButtonGuardarCambiosTablaPlanetaSistemaSolar.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPlanetaSistemaSolar=this.jButtonNuevoToolBarPlanetaSistemaSolar.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar=this.jButtonNuevoRelacionesToolBarPlanetaSistemaSolar.isVisible();
			
			if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {
			this.isVisibilidadCeldaModificarPlanetaSistemaSolar=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonModificarToolBarPlanetaSistemaSolar.isVisible();
			this.isVisibilidadCeldaActualizarPlanetaSistemaSolar=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonActualizarToolBarPlanetaSistemaSolar.isVisible();
			this.isVisibilidadCeldaEliminarPlanetaSistemaSolar=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonEliminarToolBarPlanetaSistemaSolar.isVisible();
			this.isVisibilidadCeldaCancelarPlanetaSistemaSolar=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonCancelarToolBarPlanetaSistemaSolar.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPlanetaSistemaSolar=this.jButtonGuardarCambiosToolBarPlanetaSistemaSolar.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPlanetaSistemaSolar=this.jButtonGuardarCambiosTablaToolBarPlanetaSistemaSolar.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPlanetaSistemaSolar=this.jMenuItemNuevoPlanetaSistemaSolar.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar=this.jMenuItemNuevoRelacionesPlanetaSistemaSolar.isVisible();
			
			if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {
			this.isVisibilidadCeldaModificarPlanetaSistemaSolar=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jMenuItemModificarPlanetaSistemaSolar.isVisible();
			this.isVisibilidadCeldaActualizarPlanetaSistemaSolar=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jMenuItemActualizarPlanetaSistemaSolar.isVisible();
			this.isVisibilidadCeldaEliminarPlanetaSistemaSolar=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jMenuItemEliminarPlanetaSistemaSolar.isVisible();
			this.isVisibilidadCeldaCancelarPlanetaSistemaSolar=this.jInternalFrameDetalleFormPlanetaSistemaSolar.jMenuItemCancelarPlanetaSistemaSolar.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPlanetaSistemaSolar=this.jMenuItemGuardarCambiosPlanetaSistemaSolar.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPlanetaSistemaSolar=this.jMenuItemGuardarCambiosTablaPlanetaSistemaSolar.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPlanetaSistemaSolar(Boolean esInicializar) {
		if(PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {			
			if(this.planetasistemasolarSessionBean.getConGuardarRelaciones()) {
				//if(this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPlanetaSistemaSolar();
			}
			
			this.inicializarActualizarBindingBotonesManualPlanetaSistemaSolar(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPlanetaSistemaSolar() {
		this.jButtonNuevoPlanetaSistemaSolar.setVisible(this.isPermisoNuevoPlanetaSistemaSolar);			
		this.jButtonDuplicarPlanetaSistemaSolar.setVisible(this.isPermisoDuplicarPlanetaSistemaSolar);			
		this.jButtonCopiarPlanetaSistemaSolar.setVisible(this.isPermisoCopiarPlanetaSistemaSolar);			
		this.jButtonVerFormPlanetaSistemaSolar.setVisible(this.isPermisoVerFormPlanetaSistemaSolar);			
		
		this.jButtonAbrirOrderByPlanetaSistemaSolar.setVisible(this.isPermisoOrdenPlanetaSistemaSolar);					
		
		this.jButtonNuevoRelacionesPlanetaSistemaSolar.setVisible(this.isPermisoNuevoPlanetaSistemaSolar);			
		
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonModificarPlanetaSistemaSolar.setVisible(this.isPermisoActualizarPlanetaSistemaSolar);	
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonActualizarPlanetaSistemaSolar.setVisible(this.isPermisoActualizarPlanetaSistemaSolar);	
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonEliminarPlanetaSistemaSolar.setVisible(this.isPermisoEliminarPlanetaSistemaSolar);
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonCancelarPlanetaSistemaSolar.setVisible(this.isVisibilidadCeldaCancelarPlanetaSistemaSolar);						
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonGuardarCambiosPlanetaSistemaSolar.setVisible(this.isPermisoGuardarCambiosPlanetaSistemaSolar);							
		}
		
		this.jButtonGuardarCambiosTablaPlanetaSistemaSolar.setVisible(this.isPermisoActualizarPlanetaSistemaSolar);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePlanetaSistemaSolar() {
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonModificarPlanetaSistemaSolar.setVisible(this.isPermisoActualizarPlanetaSistemaSolar);	
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonActualizarPlanetaSistemaSolar.setVisible(this.isPermisoActualizarPlanetaSistemaSolar);	
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonEliminarPlanetaSistemaSolar.setVisible(this.isPermisoEliminarPlanetaSistemaSolar);
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonCancelarPlanetaSistemaSolar.setVisible(this.isVisibilidadCeldaCancelarPlanetaSistemaSolar);							
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonGuardarCambiosPlanetaSistemaSolar.setVisible((this.isVisibilidadCeldaGuardarPlanetaSistemaSolar && this.isPermisoGuardarCambiosPlanetaSistemaSolar));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPlanetaSistemaSolar() {
		if(PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPlanetaSistemaSolar();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPlanetaSistemaSolar() {
	}
	
	public void jTableDatosPlanetaSistemaSolarListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPlanetaSistemaSolar(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPlanetaSistemaSolarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlanetaSistemaSolar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlanetaSistemaSolar(this.getplanetasistemasolar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlanetaSistemaSolar(this.planetasistemasolar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planetasistemasolar==null) {
						this.planetasistemasolar = new PlanetaSistemaSolar();
					}

					this.setVariablesFormularioToObjetoActualPlanetaSistemaSolar(this.planetasistemasolar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlanetaSistemaSolar(this.planetasistemasolar);
				}

				if(this.planetasistemasolar.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.planetasistemasolar.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlanetaSistemaSolar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_valoracionPlanetaSistemaSolarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipovaloracion=true;

			idTienePermisotipovaloracion=this.tienePermisosUsuarioEnPaginaWebPlanetaSistemaSolar(TipoValoracionConstantesFunciones.CLASSNAME);

			if(idTienePermisotipovaloracion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlanetaSistemaSolar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPlanetaSistemaSolar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPlanetaSistemaSolar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPlanetaSistemaSolar(this.getplanetasistemasolar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlanetaSistemaSolar(this.planetasistemasolar);

				this.tipovaloracionBeanSwingJInternalFrame=new TipoValoracionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipovaloracionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipovaloracionBeanSwingJInternalFrame.getTipoValoracionLogic().setConnexion(this.planetasistemasolarLogic.getConnexion());

				if(this.planetasistemasolar.getid_tipo_valoracion()!=null) {
					this.tipovaloracionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipovaloracionBeanSwingJInternalFrame.setIdActual(this.planetasistemasolar.getid_tipo_valoracion());
					this.tipovaloracionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipovaloracionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipovaloracionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoValoracion();
				}

				JInternalFrameBase jinternalFrame =this.tipovaloracionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPlanetaSistemaSolar=(TitledBorder)this.jScrollPanelDatosPlanetaSistemaSolar.getBorder();
				TitledBorder titledBordertipovaloracion=(TitledBorder)this.tipovaloracionBeanSwingJInternalFrame.jScrollPanelDatosTipoValoracion.getBorder();

				titledBordertipovaloracion.setTitle(titledBorderPlanetaSistemaSolar.getTitle() + " -> Tipo Valoracion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_valoracionPlanetaSistemaSolarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlanetaSistemaSolar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlanetaSistemaSolar(this.getplanetasistemasolar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlanetaSistemaSolar(this.planetasistemasolar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planetasistemasolar==null) {
						this.planetasistemasolar = new PlanetaSistemaSolar();
					}

					this.setVariablesFormularioToObjetoActualPlanetaSistemaSolar(this.planetasistemasolar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlanetaSistemaSolar(this.planetasistemasolar);
				}

				if(this.planetasistemasolar.getid_tipo_valoracion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_valoracion = "+this.planetasistemasolar.getid_tipo_valoracion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlanetaSistemaSolar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoPlanetaSistemaSolarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlanetaSistemaSolar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlanetaSistemaSolar(this.getplanetasistemasolar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlanetaSistemaSolar(this.planetasistemasolar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planetasistemasolar==null) {
						this.planetasistemasolar = new PlanetaSistemaSolar();
					}

					this.setVariablesFormularioToObjetoActualPlanetaSistemaSolar(this.planetasistemasolar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlanetaSistemaSolar(this.planetasistemasolar);
				}

				if(this.planetasistemasolar.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.planetasistemasolar.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlanetaSistemaSolar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombrePlanetaSistemaSolarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlanetaSistemaSolar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlanetaSistemaSolar(this.getplanetasistemasolar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlanetaSistemaSolar(this.planetasistemasolar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planetasistemasolar==null) {
						this.planetasistemasolar = new PlanetaSistemaSolar();
					}

					this.setVariablesFormularioToObjetoActualPlanetaSistemaSolar(this.planetasistemasolar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlanetaSistemaSolar(this.planetasistemasolar);
				}

				if(this.planetasistemasolar.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.planetasistemasolar.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlanetaSistemaSolar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionPlanetaSistemaSolarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlanetaSistemaSolar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlanetaSistemaSolar(this.getplanetasistemasolar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlanetaSistemaSolar(this.planetasistemasolar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planetasistemasolar==null) {
						this.planetasistemasolar = new PlanetaSistemaSolar();
					}

					this.setVariablesFormularioToObjetoActualPlanetaSistemaSolar(this.planetasistemasolar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlanetaSistemaSolar(this.planetasistemasolar);
				}

				if(this.planetasistemasolar.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.planetasistemasolar.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlanetaSistemaSolar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoPlanetaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPlanetaSistemaSolar(false,false);

			this.getPlanetaSistemaSolarsBusquedaPorCodigo();

			this.inicializarActualizarBindingPlanetaSistemaSolar(false);

			//if(PlanetaSistemaSolarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPlanetaSistemaSolar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoValoracionPlanetaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPlanetaSistemaSolar(false,false);

			this.getPlanetaSistemaSolarsFK_IdTipoValoracion();

			this.inicializarActualizarBindingPlanetaSistemaSolar(false);

			//if(PlanetaSistemaSolarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPlanetaSistemaSolar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planetasistemasolarLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePlanetaSistemaSolar() {
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.setVisible(false);	    			
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.dispose();
			this.jInternalFrameDetalleFormPlanetaSistemaSolar=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPlanetaSistemaSolar!=null) {
			this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.dispose();
			this.jInternalFrameReporteDinamicoPlanetaSistemaSolar=null;
		}
		
		if(this.jInternalFrameImportacionPlanetaSistemaSolar!=null) {
			this.jInternalFrameImportacionPlanetaSistemaSolar.setVisible(false);	    			
			this.jInternalFrameImportacionPlanetaSistemaSolar.dispose();
			this.jInternalFrameImportacionPlanetaSistemaSolar=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPlanetaSistemaSolar();
			
			PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
			
			
			if(sTipo.equals("NuevoPlanetaSistemaSolar")) {
				jButtonNuevoPlanetaSistemaSolarActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPlanetaSistemaSolar")) {
				jButtonDuplicarPlanetaSistemaSolarActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPlanetaSistemaSolar")) {
				jButtonCopiarPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("VerFormPlanetaSistemaSolar")) {
				jButtonVerFormPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPlanetaSistemaSolar")) {
				jButtonNuevoPlanetaSistemaSolarActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPlanetaSistemaSolar")) {
				jButtonDuplicarPlanetaSistemaSolarActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPlanetaSistemaSolar")) {
				jButtonNuevoPlanetaSistemaSolarActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPlanetaSistemaSolar")) {
				jButtonDuplicarPlanetaSistemaSolarActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPlanetaSistemaSolar")) {
				jButtonNuevoPlanetaSistemaSolarActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPlanetaSistemaSolar")) {
				jButtonNuevoPlanetaSistemaSolarActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPlanetaSistemaSolar")) {
				jButtonNuevoPlanetaSistemaSolarActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPlanetaSistemaSolar")) {
				jButtonModificarPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPlanetaSistemaSolar")) {
				jButtonModificarPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPlanetaSistemaSolar")) {
				jButtonModificarPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPlanetaSistemaSolar")) {
				jButtonActualizarPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPlanetaSistemaSolar")) {
				jButtonActualizarPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPlanetaSistemaSolar")) {
				jButtonActualizarPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("EliminarPlanetaSistemaSolar")) {
				jButtonEliminarPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPlanetaSistemaSolar")) {
				jButtonEliminarPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPlanetaSistemaSolar")) {
				jButtonEliminarPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("CancelarPlanetaSistemaSolar")) {
				jButtonCancelarPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPlanetaSistemaSolar")) {
				jButtonCancelarPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPlanetaSistemaSolar")) {
				jButtonCancelarPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("CerrarPlanetaSistemaSolar")) {
				jButtonCerrarPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPlanetaSistemaSolar")) {
				jButtonCerrarPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPlanetaSistemaSolar")) {
				jButtonCerrarPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPlanetaSistemaSolar")) {
				jButtonMostrarOcultarPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPlanetaSistemaSolar")) {
				jButtonCancelarPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPlanetaSistemaSolar")) {
				jButtonGuardarCambiosPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPlanetaSistemaSolar")) {
				jButtonGuardarCambiosPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPlanetaSistemaSolar")) {
				jButtonCopiarPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPlanetaSistemaSolar")) {
				jButtonVerFormPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPlanetaSistemaSolar")) {
				jButtonGuardarCambiosPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPlanetaSistemaSolar")) {
				jButtonCopiarPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPlanetaSistemaSolar")) {
				jButtonVerFormPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPlanetaSistemaSolar")) {
				jButtonGuardarCambiosPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPlanetaSistemaSolar")) {
				jButtonGuardarCambiosPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPlanetaSistemaSolar")) {
				jButtonGuardarCambiosPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPlanetaSistemaSolar")) {
				jButtonRecargarInformacionPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPlanetaSistemaSolar")) {
				jButtonRecargarInformacionPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPlanetaSistemaSolar")) {
				jButtonRecargarInformacionPlanetaSistemaSolarActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPlanetaSistemaSolar")) {
				jButtonAnterioresPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPlanetaSistemaSolar")) {
				jButtonAnterioresPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePlanetaSistemaSolar")) {
				jButtonAnterioresPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPlanetaSistemaSolar")) {
				jButtonSiguientesPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPlanetaSistemaSolar")) {
				jButtonSiguientesPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPlanetaSistemaSolar")) {
				jButtonSiguientesPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPlanetaSistemaSolar") || sTipo.equals("MenuItemDetalleAbrirOrderByPlanetaSistemaSolar")) {
				jButtonAbrirOrderByPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPlanetaSistemaSolar") || sTipo.equals("MenuItemDetalleMostrarOcultarPlanetaSistemaSolar")) {
				jButtonMostrarOcultarPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPlanetaSistemaSolar")) {
				jButtonNuevoGuardarCambiosPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPlanetaSistemaSolar")) {
				jButtonNuevoGuardarCambiosPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPlanetaSistemaSolar")) {
				jButtonNuevoGuardarCambiosPlanetaSistemaSolarActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPlanetaSistemaSolar")) {
				jButtonCerrarReporteDinamicoPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPlanetaSistemaSolar")) {
				jButtonGenerarReporteDinamicoPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPlanetaSistemaSolar")) {
				
				jButtonGenerarExcelReporteDinamicoPlanetaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPlanetaSistemaSolar")) {
				jButtonCerrarImportacionPlanetaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPlanetaSistemaSolar")) {
				
				jButtonGenerarImportacionPlanetaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPlanetaSistemaSolar")) {
				
				jButtonAbrirImportacionPlanetaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPlanetaSistemaSolar")) {
				jComboBoxTiposAccionesPlanetaSistemaSolarActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPlanetaSistemaSolar")) {
				jComboBoxTiposRelacionesPlanetaSistemaSolarActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPlanetaSistemaSolar")) {
				jComboBoxTiposAccionesPlanetaSistemaSolarActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPlanetaSistemaSolar")) {
				
				jComboBoxTiposSeleccionarPlanetaSistemaSolarActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPlanetaSistemaSolar")) {
				jTextFieldValorCampoGeneralPlanetaSistemaSolarActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPlanetaSistemaSolar")) {
				jButtonAbrirOrderByPlanetaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPlanetaSistemaSolar")) {
				jButtonAbrirOrderByPlanetaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPlanetaSistemaSolar")) {
				jButtonCerrarOrderByPlanetaSistemaSolarActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPlanetaSistemaSolarBusqueda")) {
				this.jButtonidPlanetaSistemaSolarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_valoracionPlanetaSistemaSolarUpdate")) {
				this.jButtonid_tipo_valoracionPlanetaSistemaSolarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_valoracionPlanetaSistemaSolarBusqueda")) {
				this.jButtonid_tipo_valoracionPlanetaSistemaSolarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPlanetaSistemaSolarBusqueda")) {
				this.jButtoncodigoPlanetaSistemaSolarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePlanetaSistemaSolarBusqueda")) {
				this.jButtonnombrePlanetaSistemaSolarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPlanetaSistemaSolarBusqueda")) {
				this.jButtondescripcionPlanetaSistemaSolarBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoPlanetaSistemaSolar")) {
				this.jButtonBusquedaPorCodigoPlanetaSistemaSolarActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoValoracionPlanetaSistemaSolar")) {
				this.jButtonFK_IdTipoValoracionPlanetaSistemaSolarActionPerformed(evt);
			}
			
			;
			
			
			PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPlanetaSistemaSolar();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlanetaSistemaSolarActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planetasistemasolar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planetasistemasolar);
				
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
				
				


				
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlanetaSistemaSolar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlanetaSistemaSolar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PlanetaSistemaSolar planetasistemasolarLocal=null;
			
			if(!this.getEsControlTabla()) {
				planetasistemasolarLocal=this.planetasistemasolar;
			} else {
				planetasistemasolarLocal=this.planetasistemasolarAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planetasistemasolar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planetasistemasolar);
				
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
							
				
				


				
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlanetaSistemaSolar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlanetaSistemaSolar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlanetaSistemaSolarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPlanetaSistemaSolar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarAnterior =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planetasistemasolarAnterior =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
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
			
			PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
			
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
			
			


			
			PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlanetaSistemaSolarActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planetasistemasolar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planetasistemasolar);
				
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
								
						
				


				
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlanetaSistemaSolar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlanetaSistemaSolar.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planetasistemasolar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planetasistemasolar);
				
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
								
				
				


				
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlanetaSistemaSolar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlanetaSistemaSolar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlanetaSistemaSolarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPlanetaSistemaSolar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarAnterior =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planetasistemasolarAnterior =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planetasistemasolar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planetasistemasolar);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlanetaSistemaSolarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPlanetaSistemaSolar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarAnterior =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planetasistemasolarAnterior =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlanetaSistemaSolarActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.planetasistemasolar);
			
			this.actualizarInformacion("INFO_PADRE",false,this.planetasistemasolar);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planetasistemasolar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planetasistemasolar);
				
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
							
				
				


				
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlanetaSistemaSolar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlanetaSistemaSolar.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlanetaSistemaSolarActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPlanetaSistemaSolar.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planetasistemasolarAnterior =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.planetasistemasolarAnterior =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
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
			
			PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
			
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
			
			


			
			PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlanetaSistemaSolarActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.planetasistemasolar);
			
			this.actualizarInformacion("INFO_PADRE",false,this.planetasistemasolar);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planetasistemasolar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planetasistemasolar);
				
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
								
				
				


				
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlanetaSistemaSolar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlanetaSistemaSolar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlanetaSistemaSolarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPlanetaSistemaSolar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarAnterior =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planetasistemasolarAnterior =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlanetaSistemaSolarActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.planetasistemasolar);
			
			this.actualizarInformacion("INFO_PADRE",false,this.planetasistemasolar);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlanetaSistemaSolarActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planetasistemasolar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planetasistemasolar);
				
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPlanetaSistemaSolar")) {
					jCheckBoxSeleccionarTodosPlanetaSistemaSolarItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPlanetaSistemaSolar")) {
					jCheckBoxSeleccionadosPlanetaSistemaSolarItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPlanetaSistemaSolar")) {
					
				}
				
				


				
				
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlanetaSistemaSolar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlanetaSistemaSolar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.planetasistemasolar);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.planetasistemasolar);
				
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
												
				
				


				
				
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlanetaSistemaSolar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlanetaSistemaSolar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlanetaSistemaSolarActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPlanetaSistemaSolar.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planetasistemasolarAnterior =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.planetasistemasolarAnterior =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlanetaSistemaSolarActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planetasistemasolar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planetasistemasolar);
				
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
				
				
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
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
			
			PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
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
			
			


			
			PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlanetaSistemaSolarActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planetasistemasolar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planetasistemasolar);
				
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlanetaSistemaSolar.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlanetaSistemaSolar.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planetasistemasolar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planetasistemasolar);
				
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
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
				
				


				
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlanetaSistemaSolar.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlanetaSistemaSolar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlanetaSistemaSolarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPlanetaSistemaSolar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planetasistemasolarAnterior =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planetasistemasolarAnterior =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPlanetaSistemaSolar")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPlanetaSistemaSolarListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPlanetaSistemaSolar.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.planetasistemasolar =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.planetasistemasolar);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPlanetaSistemaSolar")) {
				
				}
				
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPlanetaSistemaSolar")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPlanetaSistemaSolar.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPlanetaSistemaSolar")) {
			
			}
			
			PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPlanetaSistemaSolar();
			
			PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
			
			if(sTipo.equals("NuevoPlanetaSistemaSolar")) {
				jButtonNuevoPlanetaSistemaSolarActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPlanetaSistemaSolar")) {
				jButtonDuplicarPlanetaSistemaSolarActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPlanetaSistemaSolar")) {
				jButtonCopiarPlanetaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPlanetaSistemaSolar")) {
				jButtonVerFormPlanetaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPlanetaSistemaSolar")) {
				jButtonNuevoPlanetaSistemaSolarActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPlanetaSistemaSolar")) {
				jButtonModificarPlanetaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPlanetaSistemaSolar")) {
				jButtonActualizarPlanetaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPlanetaSistemaSolar")) {
				jButtonEliminarPlanetaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPlanetaSistemaSolar")) {
				jButtonGuardarCambiosPlanetaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPlanetaSistemaSolar")) {
				jButtonCancelarPlanetaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPlanetaSistemaSolar")) {
				jButtonCerrarPlanetaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPlanetaSistemaSolar")) {
				jButtonGuardarCambiosPlanetaSistemaSolarActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPlanetaSistemaSolar")) {
				jButtonNuevoGuardarCambiosPlanetaSistemaSolarActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPlanetaSistemaSolar")) {
				jButtonAbrirOrderByPlanetaSistemaSolarActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPlanetaSistemaSolar")) {
				jButtonRecargarInformacionPlanetaSistemaSolarActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPlanetaSistemaSolar")) {
				jButtonAnterioresPlanetaSistemaSolarActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPlanetaSistemaSolar")) {
				jButtonSiguientesPlanetaSistemaSolarActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPlanetaSistemaSolarBusqueda")) {
				this.jButtonidPlanetaSistemaSolarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_valoracionPlanetaSistemaSolarUpdate")) {
				this.jButtonid_tipo_valoracionPlanetaSistemaSolarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_valoracionPlanetaSistemaSolarBusqueda")) {
				this.jButtonid_tipo_valoracionPlanetaSistemaSolarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPlanetaSistemaSolarBusqueda")) {
				this.jButtoncodigoPlanetaSistemaSolarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePlanetaSistemaSolarBusqueda")) {
				this.jButtonnombrePlanetaSistemaSolarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPlanetaSistemaSolarBusqueda")) {
				this.jButtondescripcionPlanetaSistemaSolarBusquedaActionPerformed(evt);
			}
			
			PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPlanetaSistemaSolar();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePlanetaSistemaSolar")) {
				closingInternalFramePlanetaSistemaSolar();
				
			} else if(sTipo.equals("jButtonCancelarPlanetaSistemaSolar")) {
				JInternalFrameBase jInternalFrameDetalleFormPlanetaSistemaSolar = (JInternalFrameBase)evt.getSource();
	            	
	            PlanetaSistemaSolarBeanSwingJInternalFrame jInternalFrameParent=(PlanetaSistemaSolarBeanSwingJInternalFrame)jInternalFrameDetalleFormPlanetaSistemaSolar.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPlanetaSistemaSolarActionPerformed(null);
			}
			
			PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.planetasistemasolar,new Object(),this.planetasistemasolarParameterGeneral,this.planetasistemasolarReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPlanetaSistemaSolar(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPlanetaSistemaSolar(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPlanetaSistemaSolar(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.planetasistemasolar)) {
			if(!esControlTabla) {
				if(PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPlanetaSistemaSolar(this.planetasistemasolar,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPlanetaSistemaSolar(this.planetasistemasolar);			
				}
				
				if(this.planetasistemasolarSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPlanetaSistemaSolar(this.planetasistemasolar,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.planetasistemasolarReturnGeneral=planetasistemasolarLogic.procesarEventosPlanetaSistemaSolarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.planetasistemasolarLogic.getPlanetaSistemaSolars(),this.planetasistemasolar,this.planetasistemasolarParameterGeneral,this.isEsNuevoPlanetaSistemaSolar,classes);//this.planetasistemasolarLogic.getPlanetaSistemaSolar()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPlanetaSistemaSolar(this.planetasistemasolarReturnGeneral,this.planetasistemasolarBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.planetasistemasolarSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPlanetaSistemaSolar(classes,this.planetasistemasolarReturnGeneral,this.planetasistemasolarBean,false);
					}
						
					if(this.planetasistemasolarReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPlanetaSistemaSolar(this.planetasistemasolarReturnGeneral.getPlanetaSistemaSolar());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPlanetaSistemaSolar(this.planetasistemasolarReturnGeneral.getPlanetaSistemaSolar());	
					}
						
					if(this.planetasistemasolarReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPlanetaSistemaSolar(this.planetasistemasolarReturnGeneral.getPlanetaSistemaSolar(),classes);//this.planetasistemasolarBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPlanetaSistemaSolar(this.planetasistemasolar,classes);//this.planetasistemasolarBean);									
				}
			
				if(PlanetaSistemaSolarJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPlanetaSistemaSolar(this.planetasistemasolar,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPlanetaSistemaSolar(this.planetasistemasolar);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.planetasistemasolarAnterior!=null) {
						this.planetasistemasolar=this.planetasistemasolarAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.planetasistemasolarReturnGeneral=planetasistemasolarLogic.procesarEventosPlanetaSistemaSolarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.planetasistemasolarLogic.getPlanetaSistemaSolars(),this.planetasistemasolar,this.planetasistemasolarParameterGeneral,this.isEsNuevoPlanetaSistemaSolar,classes);//this.planetasistemasolarLogic.getPlanetaSistemaSolar()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.planetasistemasolarSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.planetasistemasolarSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.planetasistemasolarReturnGeneral.getPlanetaSistemaSolar(),planetasistemasolarLogic.getPlanetaSistemaSolars());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.planetasistemasolarReturnGeneral.getPlanetaSistemaSolar(),this.planetasistemasolars);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPlanetaSistemaSolar.repaint();
				
				//((AbstractTableModel) this.jTableDatosPlanetaSistemaSolar.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPlanetaSistemaSolar();
			}
		}
	}
	
	public void actualizarVisualTableDatosPlanetaSistemaSolar() throws Exception {
		
		PlanetaSistemaSolarModel planetasistemasolarModel=(PlanetaSistemaSolarModel)this.jTableDatosPlanetaSistemaSolar.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			planetasistemasolarModel.planetasistemasolars=this.planetasistemasolarLogic.getPlanetaSistemaSolars();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			planetasistemasolarModel.planetasistemasolars=this.planetasistemasolars;
		}
		
		
		((PlanetaSistemaSolarModel) this.jTableDatosPlanetaSistemaSolar.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPlanetaSistemaSolar() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getplanetasistemasolarAnterior(),this.planetasistemasolarLogic.getPlanetaSistemaSolars());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getplanetasistemasolarAnterior(),this.planetasistemasolars);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPlanetaSistemaSolar();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPlanetaSistemaSolar(PlanetaSistemaSolar planetasistemasolar,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
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
										
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.planetasistemasolar,new Object(),generalEntityParameterGeneral,this.planetasistemasolarReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.planetasistemasolarSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PlanetaSistemaSolarConstantesFunciones.getClassesRelationshipsOfPlanetaSistemaSolar(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PlanetaSistemaSolarConstantesFunciones.getClassesRelationshipsFromStringsOfPlanetaSistemaSolar(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPlanetaSistemaSolar(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.planetasistemasolar,new Object(),generalEntityParameterGeneral,this.planetasistemasolarReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPlanetaSistemaSolar(PlanetaSistemaSolarBean planetasistemasolarBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPlanetaSistemaSolar(ArrayList<Classe> classes,PlanetaSistemaSolarReturnGeneral planetasistemasolarReturnGeneral,PlanetaSistemaSolarBean planetasistemasolarBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPlanetaSistemaSolar(PlanetaSistemaSolar planetasistemasolar,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.planetasistemasolar)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPlanetaSistemaSolar = new PlanetaSistemaSolarDetalleFormJInternalFrame(jDesktopPane,this.planetasistemasolarSessionBean.getConGuardarRelaciones(),this.planetasistemasolarSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPlanetaSistemaSolar);
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.setVisible(false);
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.setSelected(false);						
		
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.planetasistemasolarLogic=this.planetasistemasolarLogic;
		
		this.cargarCombosFrameForeignKeyPlanetaSistemaSolar("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePlanetaSistemaSolar();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePlanetaSistemaSolar();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPlanetaSistemaSolar("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPlanetaSistemaSolar();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPlanetaSistemaSolar"));
		
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonModificarPlanetaSistemaSolar.addActionListener(new ButtonActionListener(this,"ModificarPlanetaSistemaSolar"));

		
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonModificarToolBarPlanetaSistemaSolar.addActionListener(new ButtonActionListener(this,"ModificarToolBarPlanetaSistemaSolar"));
					
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jMenuItemModificarPlanetaSistemaSolar.addActionListener(new ButtonActionListener(this,"MenuItemModificarPlanetaSistemaSolar"));		
		
		
		
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonActualizarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"ActualizarPlanetaSistemaSolar"));
		
		
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonActualizarToolBarPlanetaSistemaSolar.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPlanetaSistemaSolar"));
						
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jMenuItemActualizarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPlanetaSistemaSolar"));		
		
		
		
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonEliminarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"EliminarPlanetaSistemaSolar"));
		
		
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonEliminarToolBarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"EliminarToolBarPlanetaSistemaSolar"));
								
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jMenuItemEliminarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPlanetaSistemaSolar"));		
		
		
		
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonCancelarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"CancelarPlanetaSistemaSolar"));
		
		
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonCancelarToolBarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"CancelarToolBarPlanetaSistemaSolar"));
					
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jMenuItemCancelarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPlanetaSistemaSolar"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jMenuItemDetalleCerrarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPlanetaSistemaSolar"));		
		
		
		
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonGuardarCambiosToolBarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPlanetaSistemaSolar"));
		
		
		
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonGuardarCambiosToolBarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPlanetaSistemaSolar"));
		
		
		
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPlanetaSistemaSolar"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonidPlanetaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"idPlanetaSistemaSolarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonid_tipo_valoracionPlanetaSistemaSolarUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_valoracionPlanetaSistemaSolarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonid_tipo_valoracionPlanetaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_valoracionPlanetaSistemaSolarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtoncodigoPlanetaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"codigoPlanetaSistemaSolarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonnombrePlanetaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"nombrePlanetaSistemaSolarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtondescripcionPlanetaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPlanetaSistemaSolarBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTabbedPaneRelacionesPlanetaSistemaSolar.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPlanetaSistemaSolar"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePlanetaSistemaSolar"));
		
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPlanetaSistemaSolar"));
		}
		
		this.jTableDatosPlanetaSistemaSolar.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPlanetaSistemaSolar"));
		
		this.jTableDatosPlanetaSistemaSolar.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPlanetaSistemaSolar"));
		
		this.jButtonNuevoPlanetaSistemaSolar.addActionListener(new ButtonActionListener(this,"NuevoPlanetaSistemaSolar"));
		
		this.jButtonDuplicarPlanetaSistemaSolar.addActionListener(new ButtonActionListener(this,"DuplicarPlanetaSistemaSolar"));
		
		this.jButtonCopiarPlanetaSistemaSolar.addActionListener(new ButtonActionListener(this,"CopiarPlanetaSistemaSolar"));
		
		this.jButtonVerFormPlanetaSistemaSolar.addActionListener(new ButtonActionListener(this,"VerFormPlanetaSistemaSolar"));
		
		
		this.jButtonNuevoToolBarPlanetaSistemaSolar.addActionListener(new ButtonActionListener(this,"NuevoToolBarPlanetaSistemaSolar"));
			
		this.jButtonDuplicarToolBarPlanetaSistemaSolar.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPlanetaSistemaSolar"));
			
		this.jMenuItemNuevoPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPlanetaSistemaSolar"));
			
		this.jMenuItemDuplicarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPlanetaSistemaSolar"));		
		
		
		this.jButtonNuevoRelacionesPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPlanetaSistemaSolar"));
		
		
		this.jButtonNuevoRelacionesToolBarPlanetaSistemaSolar.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPlanetaSistemaSolar"));
			
		this.jMenuItemNuevoRelacionesPlanetaSistemaSolar.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPlanetaSistemaSolar"));		
		
		
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonModificarPlanetaSistemaSolar.addActionListener(new ButtonActionListener(this,"ModificarPlanetaSistemaSolar"));
		}
		
		
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonModificarToolBarPlanetaSistemaSolar.addActionListener(new ButtonActionListener(this,"ModificarToolBarPlanetaSistemaSolar"));
			
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jMenuItemModificarPlanetaSistemaSolar.addActionListener(new ButtonActionListener(this,"MenuItemModificarPlanetaSistemaSolar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonActualizarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"ActualizarPlanetaSistemaSolar"));
		}
		
		
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonActualizarToolBarPlanetaSistemaSolar.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPlanetaSistemaSolar"));
				
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jMenuItemActualizarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPlanetaSistemaSolar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonEliminarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"EliminarPlanetaSistemaSolar"));
		}
		
		
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonEliminarToolBarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"EliminarToolBarPlanetaSistemaSolar"));
						
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jMenuItemEliminarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPlanetaSistemaSolar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonCancelarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"CancelarPlanetaSistemaSolar"));
		}
		
		
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonCancelarToolBarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"CancelarToolBarPlanetaSistemaSolar"));
			
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jMenuItemCancelarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPlanetaSistemaSolar"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPlanetaSistemaSolar"));		
		
		
		this.jButtonCerrarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"CerrarPlanetaSistemaSolar"));
		
		
		this.jButtonCerrarToolBarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"CerrarToolBarPlanetaSistemaSolar"));
			
		this.jMenuItemCerrarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPlanetaSistemaSolar"));
			
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jMenuItemDetalleCerrarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPlanetaSistemaSolar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonGuardarCambiosPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"GuardarCambiosPlanetaSistemaSolar"));
		}
		
		
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonGuardarCambiosToolBarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPlanetaSistemaSolar"));
		}
		
		this.jButtonCopiarToolBarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"CopiarToolBarPlanetaSistemaSolar"));
			
		this.jButtonVerFormToolBarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"VerFormToolBarPlanetaSistemaSolar"));
		
		this.jMenuItemGuardarCambiosPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPlanetaSistemaSolar"));
			
		this.jMenuItemCopiarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPlanetaSistemaSolar"));		
		
		this.jMenuItemVerFormPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPlanetaSistemaSolar"));		
		
		
		this.jButtonGuardarCambiosTablaPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPlanetaSistemaSolar"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPlanetaSistemaSolar"));
			
		this.jMenuItemGuardarCambiosTablaPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPlanetaSistemaSolar"));		
		
		
		
		this.jButtonRecargarInformacionPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"RecargarInformacionPlanetaSistemaSolar"));
					
		this.jButtonRecargarInformacionToolBarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPlanetaSistemaSolar"));
		
		this.jMenuItemRecargarInformacionPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPlanetaSistemaSolar"));		
		
		
		
		this.jButtonAnterioresPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"AnterioresPlanetaSistemaSolar"));
		
		
		this.jButtonAnterioresToolBarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPlanetaSistemaSolar"));
		
		this.jMenuItemAnterioresPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPlanetaSistemaSolar"));		
		
		
		this.jButtonSiguientesPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"SiguientesPlanetaSistemaSolar"));
		
		
		this.jButtonSiguientesToolBarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPlanetaSistemaSolar"));
			
		this.jMenuItemSiguientesPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPlanetaSistemaSolar"));
			
		this.jMenuItemAbrirOrderByPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPlanetaSistemaSolar"));
			
		this.jMenuItemMostrarOcultarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPlanetaSistemaSolar"));
			
		this.jMenuItemDetalleAbrirOrderByPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPlanetaSistemaSolar"));
			
		this.jMenuItemDetalleMostarOcultarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPlanetaSistemaSolar"));		
		
		
		this.jButtonNuevoGuardarCambiosPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPlanetaSistemaSolar"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPlanetaSistemaSolar"));
			
		this.jMenuItemNuevoGuardarCambiosPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPlanetaSistemaSolar"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPlanetaSistemaSolar.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPlanetaSistemaSolar"));

		this.jCheckBoxSeleccionadosPlanetaSistemaSolar.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPlanetaSistemaSolar"));
		
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPlanetaSistemaSolar"));
		}
		
		
		this.jComboBoxTiposRelacionesPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"TiposRelacionesPlanetaSistemaSolar"));
			
		this.jComboBoxTiposAccionesPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"TiposAccionesPlanetaSistemaSolar"));
					
		this.jComboBoxTiposSeleccionarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPlanetaSistemaSolar"));
			
		this.jTextFieldValorCampoGeneralPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPlanetaSistemaSolar"));		
		
		
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonidPlanetaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"idPlanetaSistemaSolarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonid_tipo_valoracionPlanetaSistemaSolarUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_valoracionPlanetaSistemaSolarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonid_tipo_valoracionPlanetaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_valoracionPlanetaSistemaSolarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtoncodigoPlanetaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"codigoPlanetaSistemaSolarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonnombrePlanetaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"nombrePlanetaSistemaSolarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtondescripcionPlanetaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPlanetaSistemaSolarBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoPlanetaSistemaSolar.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoPlanetaSistemaSolar"));

			this.jButtonFK_IdTipoValoracionPlanetaSistemaSolar.addActionListener(new ButtonActionListener(this,"FK_IdTipoValoracionPlanetaSistemaSolar"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPlanetaSistemaSolar!=null) {
				this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPlanetaSistemaSolar"));
				this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPlanetaSistemaSolar"));
				this.jInternalFrameReporteDinamicoPlanetaSistemaSolar.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPlanetaSistemaSolar"));
			}
			
			//this.jButtonCerrarReporteDinamicoPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPlanetaSistemaSolar"));				
			//this.jButtonGenerarReporteDinamicoPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPlanetaSistemaSolar"));
			//this.jButtonGenerarExcelReporteDinamicoPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPlanetaSistemaSolar"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPlanetaSistemaSolar!=null) {
				this.jInternalFrameImportacionPlanetaSistemaSolar.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPlanetaSistemaSolar"));
				this.jInternalFrameImportacionPlanetaSistemaSolar.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPlanetaSistemaSolar"));
				this.jInternalFrameImportacionPlanetaSistemaSolar.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPlanetaSistemaSolar"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"AbrirOrderByPlanetaSistemaSolar"));
			
			this.jButtonAbrirOrderByToolBarPlanetaSistemaSolar.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPlanetaSistemaSolar"));			
			
			if(this.jInternalFrameOrderByPlanetaSistemaSolar!=null) {
				this.jInternalFrameOrderByPlanetaSistemaSolar.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPlanetaSistemaSolar"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTabbedPaneRelacionesPlanetaSistemaSolar.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPlanetaSistemaSolar"));
		
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
            		closingInternalFramePlanetaSistemaSolar();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPlanetaSistemaSolar = (JInternalFrameBase)event.getSource();
	            	
	            PlanetaSistemaSolarBeanSwingJInternalFrame jInternalFrameParent=(PlanetaSistemaSolarBeanSwingJInternalFrame)jInternalFrameDetalleFormPlanetaSistemaSolar.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPlanetaSistemaSolarActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPlanetaSistemaSolar.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPlanetaSistemaSolarListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPlanetaSistemaSolar.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPlanetaSistemaSolar.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPlanetaSistemaSolarActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPlanetaSistemaSolarActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPlanetaSistemaSolarActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPlanetaSistemaSolar";
		inputMap = this.jButtonNuevoPlanetaSistemaSolar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPlanetaSistemaSolar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPlanetaSistemaSolarActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPlanetaSistemaSolarActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPlanetaSistemaSolarActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPlanetaSistemaSolarActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPlanetaSistemaSolar";
		inputMap = this.jButtonNuevoRelacionesPlanetaSistemaSolar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPlanetaSistemaSolar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPlanetaSistemaSolarActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPlanetaSistemaSolar";
		inputMap = this.jButtonModificarPlanetaSistemaSolar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPlanetaSistemaSolar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPlanetaSistemaSolarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPlanetaSistemaSolar";
		inputMap = this.jButtonActualizarPlanetaSistemaSolar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPlanetaSistemaSolar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPlanetaSistemaSolarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPlanetaSistemaSolar";
		inputMap = this.jButtonEliminarPlanetaSistemaSolar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPlanetaSistemaSolar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPlanetaSistemaSolarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPlanetaSistemaSolar";
		inputMap = this.jButtonCancelarPlanetaSistemaSolar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPlanetaSistemaSolar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPlanetaSistemaSolarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPlanetaSistemaSolar";
		inputMap = this.jButtonCerrarPlanetaSistemaSolar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPlanetaSistemaSolar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPlanetaSistemaSolarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonGuardarCambiosPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPlanetaSistemaSolar";
		inputMap = this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonGuardarCambiosPlanetaSistemaSolar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonGuardarCambiosPlanetaSistemaSolar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPlanetaSistemaSolarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPlanetaSistemaSolar.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPlanetaSistemaSolarItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPlanetaSistemaSolar.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPlanetaSistemaSolarActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPlanetaSistemaSolar.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPlanetaSistemaSolarActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPlanetaSistemaSolar.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPlanetaSistemaSolarActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonidPlanetaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"idPlanetaSistemaSolarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonid_tipo_valoracionPlanetaSistemaSolarUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_valoracionPlanetaSistemaSolarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonid_tipo_valoracionPlanetaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_valoracionPlanetaSistemaSolarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtoncodigoPlanetaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"codigoPlanetaSistemaSolarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtonnombrePlanetaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"nombrePlanetaSistemaSolarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jButtondescripcionPlanetaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPlanetaSistemaSolarBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoPlanetaSistemaSolar.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoPlanetaSistemaSolar"));

		this.jButtonFK_IdTipoValoracionPlanetaSistemaSolar.addActionListener(new ButtonActionListener(this,"FK_IdTipoValoracionPlanetaSistemaSolar"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPlanetaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPlanetaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPlanetaSistemaSolarActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPlanetaSistemaSolar.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPlanetaSistemaSolar(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PlanetaSistemaSolar planetasistemasolarAux:this.planetasistemasolarLogic.getPlanetaSistemaSolars()) {
					planetasistemasolarAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PlanetaSistemaSolar planetasistemasolarAux:planetasistemasolars) {
					planetasistemasolarAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPlanetaSistemaSolarItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPlanetaSistemaSolar(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PlanetaSistemaSolar planetasistemasolarAux:this.planetasistemasolarLogic.getPlanetaSistemaSolars()) {
						planetasistemasolarAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PlanetaSistemaSolar planetasistemasolarAux:planetasistemasolars) {
						planetasistemasolarAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PlanetaSistemaSolar planetasistemasolarAux:this.planetasistemasolarLogic.getPlanetaSistemaSolars()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PlanetaSistemaSolar planetasistemasolarAux:planetasistemasolars) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPlanetaSistemaSolar(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPlanetaSistemaSolar.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPlanetaSistemaSolar.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPlanetaSistemaSolar,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPlanetaSistemaSolarItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPlanetaSistemaSolar(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPlanetaSistemaSolar.getSelectedRows();
			
			PlanetaSistemaSolar planetasistemasolarLocal=new PlanetaSistemaSolar();
			
			//this.seleccionarTodosPlanetaSistemaSolar(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planetasistemasolarLocal =(PlanetaSistemaSolar) this.planetasistemasolarLogic.getPlanetaSistemaSolars().toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					planetasistemasolarLocal =(PlanetaSistemaSolar) this.planetasistemasolars.toArray()[this.jTableDatosPlanetaSistemaSolar.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				planetasistemasolarLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PlanetaSistemaSolar planetasistemasolarAux:this.planetasistemasolarLogic.getPlanetaSistemaSolars()) {
						planetasistemasolarAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PlanetaSistemaSolar planetasistemasolarAux:planetasistemasolars) {
						planetasistemasolarAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPlanetaSistemaSolar(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPlanetaSistemaSolar.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPlanetaSistemaSolar.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPlanetaSistemaSolar,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPlanetaSistemaSolarItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPlanetaSistemaSolarParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPlanetaSistemaSolarActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPlanetaSistemaSolar(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPlanetaSistemaSolar.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PlanetaSistemaSolar planetasistemasolarAux:this.planetasistemasolarLogic.getPlanetaSistemaSolars()) {
				
						if(sTipoSeleccionar.equals(PlanetaSistemaSolarConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							planetasistemasolarAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PlanetaSistemaSolarConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							planetasistemasolarAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PlanetaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							planetasistemasolarAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PlanetaSistemaSolar planetasistemasolarAux:planetasistemasolars) {
					
						if(sTipoSeleccionar.equals(PlanetaSistemaSolarConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							planetasistemasolarAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PlanetaSistemaSolarConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							planetasistemasolarAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PlanetaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							planetasistemasolarAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPlanetaSistemaSolar(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPlanetaSistemaSolarActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPlanetaSistemaSolar(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPlanetaSistemaSolar=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPlanetaSistemaSolar.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePlanetaSistemaSolar) {				
					conSplash=true;//false;										
					
					//this.startProcessPlanetaSistemaSolar(conSplash);
				
					this.generarReportePlanetaSistemaSolarsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPlanetaSistemaSolar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPlanetaSistemaSolarsSeleccionados();
				//this.jComboBoxTiposAccionesPlanetaSistemaSolar.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPlanetaSistemaSolarsSeleccionados(false);
				//this.jComboBoxTiposAccionesPlanetaSistemaSolar.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPlanetaSistemaSolarsSeleccionados(true);
				//this.jComboBoxTiposAccionesPlanetaSistemaSolar.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPlanetaSistemaSolar();
				
				this.exportarPlanetaSistemaSolarsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPlanetaSistemaSolar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPlanetaSistemaSolars();
				//this.importarPlanetaSistemaSolars();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPlanetaSistemaSolar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPlanetaSistemaSolar();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPlanetaSistemaSolarsSeleccionados();
				//this.jComboBoxTiposAccionesPlanetaSistemaSolar.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Planeta Sistema Solar", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPlanetaSistemaSolar();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPlanetaSistemaSolar)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPlanetaSistemaSolar(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Planeta Sistema Solar",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPlanetaSistemaSolar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar.setSelectedIndex(0);					
				}	
			} 			
			else if(PlanetaSistemaSolarBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePlanetaSistemaSolar) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPlanetaSistemaSolar(conSplash);
					
						//this.actualizarParametrosGeneralPlanetaSistemaSolar();
						
						this.generarReporteProcesoAccionPlanetaSistemaSolarsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPlanetaSistemaSolar.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Planeta Sistema SolarES SELECCIONADOS?", "MANTENIMIENTO DE Planeta Sistema Solar", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPlanetaSistemaSolar();
				
						this.actualizarParametrosGeneralPlanetaSistemaSolar();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.planetasistemasolarReturnGeneral=planetasistemasolarLogic.procesarAccionPlanetaSistemaSolarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.planetasistemasolarLogic.getPlanetaSistemaSolars(),this.planetasistemasolarParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPlanetaSistemaSolarReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPlanetaSistemaSolar.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPlanetaSistemaSolar();
					
					PlanetaSistemaSolarBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPlanetaSistemaSolarReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPlanetaSistemaSolar.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPlanetaSistemaSolar(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPlanetaSistemaSolarActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPlanetaSistemaSolar();
			
			if(this.jInternalFrameDetalleFormPlanetaSistemaSolar==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PlanetaSistemaSolar> planetasistemasolarsSeleccionados=new ArrayList<PlanetaSistemaSolar>();		
			PlanetaSistemaSolar planetasistemasolar=new PlanetaSistemaSolar();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPlanetaSistemaSolar(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPlanetaSistemaSolar.getSelectedItem();
			
			
			
			
			planetasistemasolarsSeleccionados=this.getPlanetaSistemaSolarsSeleccionados(true);
			//this.sTipoAccion;
			
			if(planetasistemasolarsSeleccionados.size()==1) {
				for(PlanetaSistemaSolar planetasistemasolarAux:planetasistemasolarsSeleccionados) {
					planetasistemasolar=planetasistemasolarAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPlanetaSistemaSolar();
			
      		//this.finishProcessPlanetaSistemaSolar(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPlanetaSistemaSolarReturnGeneral() throws Exception {
		if(this.planetasistemasolarReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.planetasistemasolarReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.planetasistemasolarReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.planetasistemasolarReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.planetasistemasolarReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.planetasistemasolarReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPlanetaSistemaSolar(false);
		}
		
		if(this.planetasistemasolarReturnGeneral.getConRetornoLista() || this.planetasistemasolarReturnGeneral.getConRetornoObjeto()) {
			if(this.planetasistemasolarReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.planetasistemasolarLogic.setPlanetaSistemaSolars(this.planetasistemasolarReturnGeneral.getPlanetaSistemaSolars());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.planetasistemasolarReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.planetasistemasolarLogic.setPlanetaSistemaSolar(this.planetasistemasolarReturnGeneral.getPlanetaSistemaSolar());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPlanetaSistemaSolar(false);
		}
	}
	
	public void actualizarParametrosGeneralPlanetaSistemaSolar() throws Exception {
		
		
	}
	
	public ArrayList<PlanetaSistemaSolar> getPlanetaSistemaSolarsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PlanetaSistemaSolar> planetasistemasolarsSeleccionados=new ArrayList<PlanetaSistemaSolar>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPlanetaSistemaSolar) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PlanetaSistemaSolar planetasistemasolarAux:planetasistemasolarLogic.getPlanetaSistemaSolars()) {
					if(planetasistemasolarAux.getIsSelected()) {
						planetasistemasolarsSeleccionados.add(planetasistemasolarAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PlanetaSistemaSolar planetasistemasolarAux:this.planetasistemasolars) {
					if(planetasistemasolarAux.getIsSelected()) {
						planetasistemasolarsSeleccionados.add(planetasistemasolarAux);				
					}
				}
			}
			
			if(planetasistemasolarsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						planetasistemasolarsSeleccionados.addAll(this.planetasistemasolarLogic.getPlanetaSistemaSolars());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						planetasistemasolarsSeleccionados.addAll(this.planetasistemasolars);				
					}
				}
			}
		} else {
			planetasistemasolarsSeleccionados.add(this.planetasistemasolar);
		}
		
		return planetasistemasolarsSeleccionados;
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
	
	public void generarReportePlanetaSistemaSolarsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPlanetaSistemaSolarsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPlanetaSistemaSolarsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPlanetaSistemaSolarsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPlanetaSistemaSolarsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Planeta Sistema Solar",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPlanetaSistemaSolarsSeleccionados() throws Exception {
		ArrayList<PlanetaSistemaSolar> planetasistemasolarsSeleccionados=new ArrayList<PlanetaSistemaSolar>();		
		
		planetasistemasolarsSeleccionados=this.getPlanetaSistemaSolarsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePlanetaSistemaSolars("Todos",planetasistemasolarsSeleccionados);
		
	}	
	
	public void generarReporteNormalPlanetaSistemaSolarsSeleccionados() throws Exception {
		ArrayList<PlanetaSistemaSolar> planetasistemasolarsSeleccionados=new ArrayList<PlanetaSistemaSolar>();		
		
		planetasistemasolarsSeleccionados=this.getPlanetaSistemaSolarsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePlanetaSistemaSolars("Todos",planetasistemasolarsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPlanetaSistemaSolarsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PlanetaSistemaSolar> planetasistemasolarsSeleccionados=new ArrayList<PlanetaSistemaSolar>();
		
		planetasistemasolarsSeleccionados=this.getPlanetaSistemaSolarsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePlanetaSistemaSolars("Todos",planetasistemasolarsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPlanetaSistemaSolarsSeleccionados() throws Exception {
		ArrayList<PlanetaSistemaSolar> planetasistemasolarsSeleccionados=new ArrayList<PlanetaSistemaSolar>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPlanetaSistemaSolar();
		
		
		planetasistemasolarsSeleccionados=this.getPlanetaSistemaSolarsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPlanetaSistemaSolar();
		
		
		//this.generarReportePlanetaSistemaSolars("Todos",planetasistemasolarsSeleccionados ,planetasistemasolarImplementable,planetasistemasolarImplementableHome);
	}
	
	public void mostrarImportacionPlanetaSistemaSolars() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPlanetaSistemaSolar();
		
		this.abrirFrameImportacionPlanetaSistemaSolar();		
		
			
		//this.generarReportePlanetaSistemaSolars("Todos",planetasistemasolarsSeleccionados ,planetasistemasolarImplementable,planetasistemasolarImplementableHome);
	}
	
	public void importarPlanetaSistemaSolars() throws Exception {		
	
	}
	
	public void exportarPlanetaSistemaSolarsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPlanetaSistemaSolarsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPlanetaSistemaSolarsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPlanetaSistemaSolarsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Planeta Sistema Solar",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPlanetaSistemaSolarsSeleccionados() throws Exception {
		ArrayList<PlanetaSistemaSolar> planetasistemasolarsSeleccionados=new ArrayList<PlanetaSistemaSolar>();		
		
		planetasistemasolarsSeleccionados=this.getPlanetaSistemaSolarsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planetasistemasolar."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPlanetaSistemaSolar(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PlanetaSistemaSolar planetasistemasolarAux:planetasistemasolarsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPlanetaSistemaSolar(planetasistemasolarAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//planetasistemasolarAux.setsDetalleGeneralEntityReporte(planetasistemasolarAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Planeta Sistema Solar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPlanetaSistemaSolar(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PlanetaSistemaSolarConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlanetaSistemaSolarConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlanetaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlanetaSistemaSolarConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlanetaSistemaSolarConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlanetaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPlanetaSistemaSolar(PlanetaSistemaSolar planetasistemasolar,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=planetasistemasolar.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=planetasistemasolar.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=planetasistemasolar.gettipovaloracion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planetasistemasolar.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planetasistemasolar.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planetasistemasolar.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPlanetaSistemaSolarsSeleccionados() throws Exception {
		ArrayList<PlanetaSistemaSolar> planetasistemasolarsSeleccionados=new ArrayList<PlanetaSistemaSolar>();		
		
		planetasistemasolarsSeleccionados=this.getPlanetaSistemaSolarsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planetasistemasolar.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PlanetaSistemaSolars");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPlanetaSistemaSolar(row);				
				iRow++;
			}				
			
			for(PlanetaSistemaSolar planetasistemasolarAux:planetasistemasolarsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPlanetaSistemaSolar(planetasistemasolarAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Planeta Sistema Solar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPlanetaSistemaSolarsSeleccionados() throws Exception {
		ArrayList<PlanetaSistemaSolar> planetasistemasolarsSeleccionados=new ArrayList<PlanetaSistemaSolar>();		
		
		planetasistemasolarsSeleccionados=this.getPlanetaSistemaSolarsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planetasistemasolar.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("planetasistemasolars");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("planetasistemasolar");
			//elementRoot.appendChild(element);
		
			for(PlanetaSistemaSolar planetasistemasolarAux:planetasistemasolarsSeleccionados) {
				element = document.createElement("planetasistemasolar");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPlanetaSistemaSolar(planetasistemasolarAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Planeta Sistema Solar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPlanetaSistemaSolar(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PlanetaSistemaSolarConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PlanetaSistemaSolarConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PlanetaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION);
		cell = row.createCell(iColumn++);cell.setCellValue(PlanetaSistemaSolarConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(PlanetaSistemaSolarConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(PlanetaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPlanetaSistemaSolar(PlanetaSistemaSolar planetasistemasolar,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(planetasistemasolar.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(planetasistemasolar.gettipovaloracion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(planetasistemasolar.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(planetasistemasolar.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(planetasistemasolar.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlPlanetaSistemaSolar(PlanetaSistemaSolar planetasistemasolar,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PlanetaSistemaSolarConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(planetasistemasolar.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PlanetaSistemaSolarConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(planetasistemasolar.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementtipovaloracion_descripcion = document.createElement(PlanetaSistemaSolarConstantesFunciones.IDTIPOVALORACION);
		elementtipovaloracion_descripcion.appendChild(document.createTextNode(planetasistemasolar.gettipovaloracion_descripcion()));
		element.appendChild(elementtipovaloracion_descripcion);

		Element elementcodigo = document.createElement(PlanetaSistemaSolarConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(planetasistemasolar.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(PlanetaSistemaSolarConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(planetasistemasolar.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(PlanetaSistemaSolarConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(planetasistemasolar.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoPlanetaSistemaSolarsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PlanetaSistemaSolar> planetasistemasolarsSeleccionados=new ArrayList<PlanetaSistemaSolar>();
		
		planetasistemasolarsSeleccionados=this.getPlanetaSistemaSolarsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPlanetaSistemaSolar(planetasistemasolarsSeleccionados);
		
		this.generarReportePlanetaSistemaSolars("Todos",planetasistemasolarsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPlanetaSistemaSolar(ArrayList<PlanetaSistemaSolar> planetasistemasolarsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PlanetaSistemaSolar planetasistemasolarAux:planetasistemasolarsSeleccionados) {
				planetasistemasolarAux.setsDetalleGeneralEntityReporte(planetasistemasolarAux.toString());
			
				if(sTipoSeleccionar.equals(PlanetaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION)) {
					existe=true;
					planetasistemasolarAux.setsDescripcionGeneralEntityReporte1(planetasistemasolarAux.gettipovaloracion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PlanetaSistemaSolarConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					planetasistemasolarAux.setsDescripcionGeneralEntityReporte1(planetasistemasolarAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(PlanetaSistemaSolarConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					planetasistemasolarAux.setsDescripcionGeneralEntityReporte1(planetasistemasolarAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(PlanetaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					planetasistemasolarAux.setsDescripcionGeneralEntityReporte1(planetasistemasolarAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlanetaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPlanetaSistemaSolar(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPlanetaSistemaSolar=true;
				this.isVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar=true;
				this.isVisibilidadCeldaGuardarCambiosPlanetaSistemaSolar=true;
			}
			
			this.isVisibilidadCeldaModificarPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaActualizarPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaEliminarPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaCancelarPlanetaSistemaSolar=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlanetaSistemaSolar=true;
				} else {
					this.isVisibilidadCeldaGuardarPlanetaSistemaSolar=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaGuardarCambiosPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaModificarPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaActualizarPlanetaSistemaSolar=true;
			this.isVisibilidadCeldaEliminarPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaCancelarPlanetaSistemaSolar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlanetaSistemaSolar=true;
				} else {
					this.isVisibilidadCeldaGuardarPlanetaSistemaSolar=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaGuardarCambiosPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaModificarPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaActualizarPlanetaSistemaSolar=true;
			this.isVisibilidadCeldaEliminarPlanetaSistemaSolar=true;
			this.isVisibilidadCeldaCancelarPlanetaSistemaSolar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlanetaSistemaSolar=true;
				} else {
					this.isVisibilidadCeldaGuardarPlanetaSistemaSolar=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaGuardarCambiosPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaModificarPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaActualizarPlanetaSistemaSolar=true;
			this.isVisibilidadCeldaEliminarPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaCancelarPlanetaSistemaSolar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlanetaSistemaSolar=false;
				} else {
					this.isVisibilidadCeldaGuardarPlanetaSistemaSolar=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPlanetaSistemaSolar=true;
			this.isVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar=true;
			this.isVisibilidadCeldaGuardarCambiosPlanetaSistemaSolar=true;
			this.isVisibilidadCeldaModificarPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaActualizarPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaEliminarPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaCancelarPlanetaSistemaSolar=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlanetaSistemaSolar=true;
				} else {
					this.isVisibilidadCeldaGuardarPlanetaSistemaSolar=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaGuardarCambiosPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaActualizarPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaEliminarPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaCancelarPlanetaSistemaSolar=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlanetaSistemaSolar=false;
				} else {
					this.isVisibilidadCeldaGuardarPlanetaSistemaSolar=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaGuardarCambiosPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaModificarPlanetaSistemaSolar=true;
			this.isVisibilidadCeldaActualizarPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaEliminarPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaCancelarPlanetaSistemaSolar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlanetaSistemaSolar=false;
				} else {
					this.isVisibilidadCeldaGuardarPlanetaSistemaSolar=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PlanetaSistemaSolarJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPlanetaSistemaSolar=true;
			this.isVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar=true;
			this.isVisibilidadCeldaGuardarCambiosPlanetaSistemaSolar=true;
		} else {
			this.actualizarEstadoPanelsPlanetaSistemaSolar(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPlanetaSistemaSolar=false;
			//this.isVisibilidadCeldaVerFormPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaDuplicarPlanetaSistemaSolar=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!planetasistemasolarSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar=false;
		} else {
			this.isVisibilidadCeldaNuevoPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaGuardarCambiosPlanetaSistemaSolar=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
			if(!planetasistemasolarSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar=false;												
			}
			
			this.jButtonCerrarPlanetaSistemaSolar.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPlanetaSistemaSolar=false;
		}
		
		if(!this.permiteMantenimiento(this.planetasistemasolar)) {
			this.isVisibilidadCeldaActualizarPlanetaSistemaSolar=false;
			this.isVisibilidadCeldaEliminarPlanetaSistemaSolar=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPlanetaSistemaSolar() {
	}
	
	public void actualizarEstadoPanelsPlanetaSistemaSolar(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPlanetaSistemaSolar!=null) {
				this.jScrollPanelDatosEdicionPlanetaSistemaSolar.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlanetaSistemaSolar!=null) {
				this.jTabbedPaneBusquedasPlanetaSistemaSolar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPlanetaSistemaSolar!=null) {
				this.jScrollPanelDatosPlanetaSistemaSolar.setVisible(true);
			}
			
			if(this.jPanelPaginacionPlanetaSistemaSolar!=null) {
				this.jPanelPaginacionPlanetaSistemaSolar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPlanetaSistemaSolar!=null) {
				this.jPanelParametrosReportesPlanetaSistemaSolar.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPlanetaSistemaSolar!=null) {
				this.jScrollPanelDatosEdicionPlanetaSistemaSolar.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlanetaSistemaSolar!=null) {
				this.jTabbedPaneBusquedasPlanetaSistemaSolar.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPlanetaSistemaSolar!=null) {
				this.jScrollPanelDatosPlanetaSistemaSolar.setVisible(false);
			}
			
			if(this.jPanelPaginacionPlanetaSistemaSolar!=null) {
				this.jPanelPaginacionPlanetaSistemaSolar.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPlanetaSistemaSolar!=null) {
				this.jPanelParametrosReportesPlanetaSistemaSolar.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPlanetaSistemaSolar!=null) {
				this.jScrollPanelDatosEdicionPlanetaSistemaSolar.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlanetaSistemaSolar!=null) {
				this.jTabbedPaneBusquedasPlanetaSistemaSolar.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPlanetaSistemaSolar!=null) {
				this.jScrollPanelDatosPlanetaSistemaSolar.setVisible(false);
			}
			
			if(this.jPanelPaginacionPlanetaSistemaSolar!=null) {
				this.jPanelPaginacionPlanetaSistemaSolar.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPlanetaSistemaSolar!=null) {
				this.jPanelParametrosReportesPlanetaSistemaSolar.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPlanetaSistemaSolar!=null) {
				this.jScrollPanelDatosEdicionPlanetaSistemaSolar.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlanetaSistemaSolar!=null) {
				this.jTabbedPaneBusquedasPlanetaSistemaSolar.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPlanetaSistemaSolar!=null) {
				this.jScrollPanelDatosPlanetaSistemaSolar.setVisible(false);
			}
			
			if(this.jPanelPaginacionPlanetaSistemaSolar!=null) {
				this.jPanelPaginacionPlanetaSistemaSolar.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPlanetaSistemaSolar!=null) {
				this.jPanelParametrosReportesPlanetaSistemaSolar.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPlanetaSistemaSolar!=null) {
				this.jScrollPanelDatosEdicionPlanetaSistemaSolar.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlanetaSistemaSolar!=null) {
				this.jTabbedPaneBusquedasPlanetaSistemaSolar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPlanetaSistemaSolar!=null) {
				this.jScrollPanelDatosPlanetaSistemaSolar.setVisible(true);
			}
			
			if(this.jPanelPaginacionPlanetaSistemaSolar!=null) {
				this.jPanelPaginacionPlanetaSistemaSolar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPlanetaSistemaSolar!=null) {
				this.jPanelParametrosReportesPlanetaSistemaSolar.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPlanetaSistemaSolar!=null) {
				this.jScrollPanelDatosEdicionPlanetaSistemaSolar.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlanetaSistemaSolar!=null) {
				this.jTabbedPaneBusquedasPlanetaSistemaSolar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPlanetaSistemaSolar!=null) {
				this.jScrollPanelDatosPlanetaSistemaSolar.setVisible(true);
			}
			
			if(this.jPanelPaginacionPlanetaSistemaSolar!=null) {
				this.jPanelPaginacionPlanetaSistemaSolar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPlanetaSistemaSolar!=null) {
				this.jPanelParametrosReportesPlanetaSistemaSolar.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPlanetaSistemaSolar!=null) {
				this.jScrollPanelDatosEdicionPlanetaSistemaSolar.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlanetaSistemaSolar!=null) {
				this.jTabbedPaneBusquedasPlanetaSistemaSolar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPlanetaSistemaSolar!=null) {
				this.jScrollPanelDatosPlanetaSistemaSolar.setVisible(true);
			}
			
			if(this.jPanelPaginacionPlanetaSistemaSolar!=null) {
				this.jPanelPaginacionPlanetaSistemaSolar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPlanetaSistemaSolar!=null) {
				this.jPanelParametrosReportesPlanetaSistemaSolar.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPlanetaSistemaSolar!=null) {
					this.jTabbedPaneBusquedasPlanetaSistemaSolar.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPlanetaSistemaSolar!=null) {
				this.jPanelParametrosReportesPlanetaSistemaSolar.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlanetaSistemaSolar!=null) {
				this.jTabbedPaneBusquedasPlanetaSistemaSolar.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPlanetaSistemaSolar!=null) {
				this.jPanelParametrosReportesPlanetaSistemaSolar.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaTipoValoracion(Boolean isParaTipoValoracion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoValoracionNegation=!isParaTipoValoracion;

			this.isVisibilidadBusquedaPorCodigo=isParaTipoValoracionNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasPlanetaSistemaSolar.remove(jPanelBusquedaPorCodigoPlanetaSistemaSolar);}

			this.isVisibilidadFK_IdTipoValoracion=isParaTipoValoracion;
			if(!this.isVisibilidadFK_IdTipoValoracion) {this.jTabbedPaneBusquedasPlanetaSistemaSolar.remove(jPanelFK_IdTipoValoracionPlanetaSistemaSolar);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PlanetaSistemaSolarSessionBean planetasistemasolarSessionBean=new PlanetaSistemaSolarSessionBean();
		
		if(this.planetasistemasolarSessionBean==null) {
			this.planetasistemasolarSessionBean=new PlanetaSistemaSolarSessionBean();
		}
		
		this.planetasistemasolarSessionBean.setsUltimaBusquedaPlanetaSistemaSolar(this.getsAccionBusqueda());
		this.planetasistemasolarSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.planetasistemasolarSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			planetasistemasolarSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoValoracion")) {
			planetasistemasolarSessionBean.setid_tipo_valoracion(this.getid_tipo_valoracionFK_IdTipoValoracion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PlanetaSistemaSolarSessionBean planetasistemasolarSessionBean=new PlanetaSistemaSolarSessionBean();
		
		if(this.planetasistemasolarSessionBean==null) {
			this.planetasistemasolarSessionBean=new PlanetaSistemaSolarSessionBean();
		}
		
		if(this.planetasistemasolarSessionBean.getsUltimaBusquedaPlanetaSistemaSolar()!=null&&!this.planetasistemasolarSessionBean.getsUltimaBusquedaPlanetaSistemaSolar().equals("")) {
			this.setsAccionBusqueda(planetasistemasolarSessionBean.getsUltimaBusquedaPlanetaSistemaSolar());
			this.setiNumeroPaginacion(planetasistemasolarSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(planetasistemasolarSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(planetasistemasolarSessionBean.getcodigo());
				planetasistemasolarSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoValoracion")) {
				this.setid_tipo_valoracionFK_IdTipoValoracion(planetasistemasolarSessionBean.getid_tipo_valoracion());
				planetasistemasolarSessionBean.setid_tipo_valoracion(-1L);
			}
		}
		
		this.planetasistemasolarSessionBean.setsUltimaBusquedaPlanetaSistemaSolar("");
		this.planetasistemasolarSessionBean.setiNumeroPaginacion(PlanetaSistemaSolarConstantesFunciones.INUMEROPAGINACION);
		this.planetasistemasolarSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPlanetaSistemaSolar(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPlanetaSistemaSolar() {
		this.updateBorderResaltarBusquedasFormularioPlanetaSistemaSolar();
		this.updateVisibilidadBusquedasFormularioPlanetaSistemaSolar();
		this.updateHabilitarBusquedasFormularioPlanetaSistemaSolar();
	}
	
	public void updateBorderResaltarBusquedasFormularioPlanetaSistemaSolar() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPlanetaSistemaSolar.getComponents().length>0) {
	

		if(this.planetasistemasolarConstantesFunciones.resaltarBusquedaPorCodigoPlanetaSistemaSolar!=null) {
			index= this.jTabbedPaneBusquedasPlanetaSistemaSolar.indexOfComponent(this.jPanelBusquedaPorCodigoPlanetaSistemaSolar);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPlanetaSistemaSolar.getComponent(index);
				jPanel.setBorder(this.planetasistemasolarConstantesFunciones.resaltarBusquedaPorCodigoPlanetaSistemaSolar);
			}
		}

		if(this.planetasistemasolarConstantesFunciones.resaltarFK_IdTipoValoracionPlanetaSistemaSolar!=null) {
			index= this.jTabbedPaneBusquedasPlanetaSistemaSolar.indexOfComponent(this.jPanelFK_IdTipoValoracionPlanetaSistemaSolar);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPlanetaSistemaSolar.getComponent(index);
				jPanel.setBorder(this.planetasistemasolarConstantesFunciones.resaltarFK_IdTipoValoracionPlanetaSistemaSolar);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPlanetaSistemaSolar() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPlanetaSistemaSolar.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPlanetaSistemaSolar.indexOfComponent(this.jPanelBusquedaPorCodigoPlanetaSistemaSolar);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPlanetaSistemaSolar.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.planetasistemasolarConstantesFunciones.mostrarBusquedaPorCodigoPlanetaSistemaSolar);
			if(!this.planetasistemasolarConstantesFunciones.mostrarBusquedaPorCodigoPlanetaSistemaSolar && index>-1) {
				this.jTabbedPaneBusquedasPlanetaSistemaSolar.remove(index);
			}

			index= this.jTabbedPaneBusquedasPlanetaSistemaSolar.indexOfComponent(this.jPanelFK_IdTipoValoracionPlanetaSistemaSolar);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPlanetaSistemaSolar.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.planetasistemasolarConstantesFunciones.mostrarFK_IdTipoValoracionPlanetaSistemaSolar);
			if(!this.planetasistemasolarConstantesFunciones.mostrarFK_IdTipoValoracionPlanetaSistemaSolar && index>-1) {
				this.jTabbedPaneBusquedasPlanetaSistemaSolar.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPlanetaSistemaSolar() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPlanetaSistemaSolar.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPlanetaSistemaSolar.indexOfComponent(this.jPanelBusquedaPorCodigoPlanetaSistemaSolar);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPlanetaSistemaSolar.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.planetasistemasolarConstantesFunciones.activarBusquedaPorCodigoPlanetaSistemaSolar);
				this.jTabbedPaneBusquedasPlanetaSistemaSolar.setEnabledAt(index,this.planetasistemasolarConstantesFunciones.activarBusquedaPorCodigoPlanetaSistemaSolar);
			}

			index= this.jTabbedPaneBusquedasPlanetaSistemaSolar.indexOfComponent(this.jPanelFK_IdTipoValoracionPlanetaSistemaSolar);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPlanetaSistemaSolar.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.planetasistemasolarConstantesFunciones.activarFK_IdTipoValoracionPlanetaSistemaSolar);
				this.jTabbedPaneBusquedasPlanetaSistemaSolar.setEnabledAt(index,this.planetasistemasolarConstantesFunciones.activarFK_IdTipoValoracionPlanetaSistemaSolar);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPlanetaSistemaSolar(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasPlanetaSistemaSolar.indexOfComponent(this.jPanelBusquedaPorCodigoPlanetaSistemaSolar);

			this.jTabbedPaneBusquedasPlanetaSistemaSolar.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPlanetaSistemaSolar.getComponent(index);

			this.planetasistemasolarConstantesFunciones.setResaltarBusquedaPorCodigoPlanetaSistemaSolar(resaltar);

			jPanel.setBorder(this.planetasistemasolarConstantesFunciones.resaltarBusquedaPorCodigoPlanetaSistemaSolar);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoValoracion")) {
			index= this.jTabbedPaneBusquedasPlanetaSistemaSolar.indexOfComponent(this.jPanelFK_IdTipoValoracionPlanetaSistemaSolar);

			this.jTabbedPaneBusquedasPlanetaSistemaSolar.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPlanetaSistemaSolar.getComponent(index);

			this.planetasistemasolarConstantesFunciones.setResaltarFK_IdTipoValoracionPlanetaSistemaSolar(resaltar);

			jPanel.setBorder(this.planetasistemasolarConstantesFunciones.resaltarFK_IdTipoValoracionPlanetaSistemaSolar);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPlanetaSistemaSolar.setBorder(resaltar);
			
		}
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
	
	public void updateControlesFormularioPlanetaSistemaSolar() throws Exception {

		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPlanetaSistemaSolar();
		this.updateVisibilidadResaltarControlesFormularioPlanetaSistemaSolar();
		this.updateHabilitarResaltarControlesFormularioPlanetaSistemaSolar();
		
	}
	
	public void updateBorderResaltarControlesFormularioPlanetaSistemaSolar() throws Exception {
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.planetasistemasolarConstantesFunciones.resaltaridPlanetaSistemaSolar!=null && this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextFieldidPlanetaSistemaSolar.setBorder(this.planetasistemasolarConstantesFunciones.resaltaridPlanetaSistemaSolar);}
		if(this.planetasistemasolarConstantesFunciones.resaltarid_tipo_valoracionPlanetaSistemaSolar!=null && this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxid_tipo_valoracionPlanetaSistemaSolar.setBorder(this.planetasistemasolarConstantesFunciones.resaltarid_tipo_valoracionPlanetaSistemaSolar);}
		if(this.planetasistemasolarConstantesFunciones.resaltarcodigoPlanetaSistemaSolar!=null && this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextFieldcodigoPlanetaSistemaSolar.setBorder(this.planetasistemasolarConstantesFunciones.resaltarcodigoPlanetaSistemaSolar);}
		if(this.planetasistemasolarConstantesFunciones.resaltarnombrePlanetaSistemaSolar!=null && this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextAreanombrePlanetaSistemaSolar.setBorder(this.planetasistemasolarConstantesFunciones.resaltarnombrePlanetaSistemaSolar);}
		if(this.planetasistemasolarConstantesFunciones.resaltardescripcionPlanetaSistemaSolar!=null && this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextAreadescripcionPlanetaSistemaSolar.setBorder(this.planetasistemasolarConstantesFunciones.resaltardescripcionPlanetaSistemaSolar);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPlanetaSistemaSolar() throws Exception {		
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {
	
		//this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextFieldidPlanetaSistemaSolar.setVisible(this.planetasistemasolarConstantesFunciones.mostraridPlanetaSistemaSolar);
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jPanelidPlanetaSistemaSolar.setVisible(this.planetasistemasolarConstantesFunciones.mostraridPlanetaSistemaSolar);
		//this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxid_tipo_valoracionPlanetaSistemaSolar.setVisible(this.planetasistemasolarConstantesFunciones.mostrarid_tipo_valoracionPlanetaSistemaSolar);
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jPanelid_tipo_valoracionPlanetaSistemaSolar.setVisible(this.planetasistemasolarConstantesFunciones.mostrarid_tipo_valoracionPlanetaSistemaSolar);
		//this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextFieldcodigoPlanetaSistemaSolar.setVisible(this.planetasistemasolarConstantesFunciones.mostrarcodigoPlanetaSistemaSolar);
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jPanelcodigoPlanetaSistemaSolar.setVisible(this.planetasistemasolarConstantesFunciones.mostrarcodigoPlanetaSistemaSolar);
		//this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextAreanombrePlanetaSistemaSolar.setVisible(this.planetasistemasolarConstantesFunciones.mostrarnombrePlanetaSistemaSolar);
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jPanelnombrePlanetaSistemaSolar.setVisible(this.planetasistemasolarConstantesFunciones.mostrarnombrePlanetaSistemaSolar);
		//this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextAreadescripcionPlanetaSistemaSolar.setVisible(this.planetasistemasolarConstantesFunciones.mostrardescripcionPlanetaSistemaSolar);
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jPaneldescripcionPlanetaSistemaSolar.setVisible(this.planetasistemasolarConstantesFunciones.mostrardescripcionPlanetaSistemaSolar);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPlanetaSistemaSolar() throws Exception {
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPlanetaSistemaSolar!=null) {
	
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextFieldidPlanetaSistemaSolar.setEnabled(this.planetasistemasolarConstantesFunciones.activaridPlanetaSistemaSolar);
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jComboBoxid_tipo_valoracionPlanetaSistemaSolar.setEnabled(this.planetasistemasolarConstantesFunciones.activarid_tipo_valoracionPlanetaSistemaSolar);
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextFieldcodigoPlanetaSistemaSolar.setEnabled(this.planetasistemasolarConstantesFunciones.activarcodigoPlanetaSistemaSolar);
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextAreanombrePlanetaSistemaSolar.setEnabled(this.planetasistemasolarConstantesFunciones.activarnombrePlanetaSistemaSolar);
		this.jInternalFrameDetalleFormPlanetaSistemaSolar.jTextAreadescripcionPlanetaSistemaSolar.setEnabled(this.planetasistemasolarConstantesFunciones.activardescripcionPlanetaSistemaSolar);
		}
	}
	
		
}