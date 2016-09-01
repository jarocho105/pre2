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

import com.bydan.erp.seguridad.util.LunaSistemaSolarConstantesFunciones;
import com.bydan.erp.seguridad.util.LunaSistemaSolarParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.LunaSistemaSolarParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.LunaSistemaSolarBean;
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
public class LunaSistemaSolarBeanSwingJInternalFrame extends LunaSistemaSolarJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(LunaSistemaSolarBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<LunaSistemaSolar> lunasistemasolarValidator = new ClassValidator<LunaSistemaSolar>(LunaSistemaSolar.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public LunaSistemaSolar lunasistemasolar;	
	public LunaSistemaSolar lunasistemasolarAux;
	public LunaSistemaSolar lunasistemasolarAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public LunaSistemaSolar lunasistemasolarTotales;
	public Long idLunaSistemaSolarActual;
	public Long iIdNuevoLunaSistemaSolar=0L;
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
	
	public Boolean isPermisoTodoLunaSistemaSolar;
	public Boolean isPermisoNuevoLunaSistemaSolar;
	public Boolean isPermisoActualizarLunaSistemaSolar;
	public Boolean isPermisoActualizarOriginalLunaSistemaSolar;
	public Boolean isPermisoEliminarLunaSistemaSolar;
	public Boolean isPermisoGuardarCambiosLunaSistemaSolar;
	public Boolean isPermisoConsultaLunaSistemaSolar;
	public Boolean isPermisoBusquedaLunaSistemaSolar;
	public Boolean isPermisoReporteLunaSistemaSolar;
	public Boolean isPermisoPaginacionMedioLunaSistemaSolar;
	public Boolean isPermisoPaginacionAltoLunaSistemaSolar;
	public Boolean isPermisoPaginacionTodoLunaSistemaSolar;
	public Boolean isPermisoCopiarLunaSistemaSolar;
	public Boolean isPermisoVerFormLunaSistemaSolar;
	public Boolean isPermisoDuplicarLunaSistemaSolar;
	public Boolean isPermisoOrdenLunaSistemaSolar;
	
	
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
	
	public LunaSistemaSolarParameterReturnGeneral lunasistemasolarReturnGeneral;
	public LunaSistemaSolarParameterReturnGeneral lunasistemasolarParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoLunaSistemaSolar=false;
	public Boolean esParaAccionDesdeFormularioLunaSistemaSolar=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected LunaSistemaSolarSessionBeanAdditional lunasistemasolarSessionBeanAdditional=null;
	
	public LunaSistemaSolarSessionBeanAdditional getLunaSistemaSolarSessionBeanAdditional() {
		return this.lunasistemasolarSessionBeanAdditional;
	}
	
	public void setLunaSistemaSolarSessionBeanAdditional(LunaSistemaSolarSessionBeanAdditional lunasistemasolarSessionBeanAdditional) {
		try {
			this.lunasistemasolarSessionBeanAdditional=lunasistemasolarSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected LunaSistemaSolarBeanSwingJInternalFrameAdditional lunasistemasolarBeanSwingJInternalFrameAdditional=null;
	//public class LunaSistemaSolarBeanSwingJInternalFrame
	
	public LunaSistemaSolarBeanSwingJInternalFrameAdditional getLunaSistemaSolarBeanSwingJInternalFrameAdditional() {
		return this.lunasistemasolarBeanSwingJInternalFrameAdditional;
	}
	
	public void setLunaSistemaSolarBeanSwingJInternalFrameAdditional(LunaSistemaSolarBeanSwingJInternalFrameAdditional lunasistemasolarBeanSwingJInternalFrameAdditional) {
		try {
			this.lunasistemasolarBeanSwingJInternalFrameAdditional=lunasistemasolarBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public LunaSistemaSolarLogic lunasistemasolarLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public LunaSistemaSolar lunasistemasolarBean;
	public LunaSistemaSolarConstantesFunciones lunasistemasolarConstantesFunciones;
	//public LunaSistemaSolarParameterReturnGeneral lunasistemasolarReturnGeneral;
	
	//FK
	
	public TipoValoracionLogic tipovaloracionLogic;
	
	//PARAMETROS
	
	
	//public List<LunaSistemaSolar> lunasistemasolars;	
	//public List<LunaSistemaSolar> lunasistemasolarsEliminados;
	//public List<LunaSistemaSolar> lunasistemasolarsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoLunaSistemaSolar=false;
	public Boolean isVisibilidadCeldaDuplicarLunaSistemaSolar=true;
	public Boolean isVisibilidadCeldaCopiarLunaSistemaSolar=true;
	public Boolean isVisibilidadCeldaVerFormLunaSistemaSolar=true;
	public Boolean isVisibilidadCeldaOrdenLunaSistemaSolar=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesLunaSistemaSolar=false;
	public Boolean isVisibilidadCeldaModificarLunaSistemaSolar=false;
	public Boolean isVisibilidadCeldaActualizarLunaSistemaSolar=false;
	public Boolean isVisibilidadCeldaEliminarLunaSistemaSolar=false;
	public Boolean isVisibilidadCeldaCancelarLunaSistemaSolar=false;
	public Boolean isVisibilidadCeldaGuardarLunaSistemaSolar=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosLunaSistemaSolar=false;	
	
	
	public Boolean isVisibilidadFK_IdTipoValoracion=false;
	
	public Long getiIdNuevoLunaSistemaSolar() {
		return this.iIdNuevoLunaSistemaSolar;
	}

	public void setiIdNuevoLunaSistemaSolar(Long iIdNuevoLunaSistemaSolar) {
		this.iIdNuevoLunaSistemaSolar = iIdNuevoLunaSistemaSolar;
	}
	
	public Long getidLunaSistemaSolarActual() {
		return this.idLunaSistemaSolarActual;
	}

	public void setidLunaSistemaSolarActual(Long idLunaSistemaSolarActual) {
		this.idLunaSistemaSolarActual = idLunaSistemaSolarActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public LunaSistemaSolar getlunasistemasolar() {
		return this.lunasistemasolar;
	}

	public void setlunasistemasolar(LunaSistemaSolar lunasistemasolar) {
		this.lunasistemasolar = lunasistemasolar;
	}
	
	public LunaSistemaSolar getlunasistemasolarAux() {
		return this.lunasistemasolarAux;
	}

	public void setlunasistemasolarAux(LunaSistemaSolar lunasistemasolarAux) {
		this.lunasistemasolarAux = lunasistemasolarAux;
	}				
	
	public LunaSistemaSolar getlunasistemasolarAnterior() {
		return this.lunasistemasolarAnterior;
	}

	public void setlunasistemasolarAnterior(LunaSistemaSolar lunasistemasolarAnterior) {
		this.lunasistemasolarAnterior = lunasistemasolarAnterior;
	}	
	
	public LunaSistemaSolar getlunasistemasolarTotales() {
		return this.lunasistemasolarTotales;
	}

	public void setlunasistemasolarTotales(LunaSistemaSolar lunasistemasolarTotales) {
		this.lunasistemasolarTotales = lunasistemasolarTotales;
	}	
	
	public LunaSistemaSolar getlunasistemasolarBean() {
		return this.lunasistemasolarBean;
	}

	public void setlunasistemasolarBean(LunaSistemaSolar lunasistemasolarBean) {
		this.lunasistemasolarBean = lunasistemasolarBean;
	}	
	
	public LunaSistemaSolarParameterReturnGeneral getlunasistemasolarReturnGeneral() {
		return this.lunasistemasolarReturnGeneral;
	}

	public void setlunasistemasolarReturnGeneral(LunaSistemaSolarParameterReturnGeneral lunasistemasolarReturnGeneral) {
		this.lunasistemasolarReturnGeneral = lunasistemasolarReturnGeneral;
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
	
	
	public LunaSistemaSolarLogic getLunaSistemaSolarLogic()	{		
		return lunasistemasolarLogic;
	}

	public void setLunaSistemaSolarLogic(LunaSistemaSolarLogic lunasistemasolarLogic) {
		this.lunasistemasolarLogic = lunasistemasolarLogic;
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
	
	public Boolean getIsEsNuevoLunaSistemaSolar() {
		return isEsNuevoLunaSistemaSolar;
	}

	public void setIsEsNuevoLunaSistemaSolar(Boolean isEsNuevoLunaSistemaSolar) {
		this.isEsNuevoLunaSistemaSolar = isEsNuevoLunaSistemaSolar;
	}

	public Boolean getEsParaAccionDesdeFormularioLunaSistemaSolar() {
		return esParaAccionDesdeFormularioLunaSistemaSolar;
	}
	
	public void setEsParaAccionDesdeFormularioLunaSistemaSolar(Boolean esParaAccionDesdeFormularioLunaSistemaSolar) {
		this.esParaAccionDesdeFormularioLunaSistemaSolar = esParaAccionDesdeFormularioLunaSistemaSolar;
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

			if(this.lunasistemasolarSessionBean==null) {
				this.lunasistemasolarSessionBean=new LunaSistemaSolarSessionBean();
			}

			if(!this.lunasistemasolarSessionBean.getisBusquedaDesdeForeignKeySesionTipoValoracion()) {
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
					tipovaloracionLogic.getEntityWithConnection(lunasistemasolarSessionBean.getlidTipoValoracionActual());
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

					if(this.lunasistemasolar!=null) {
						this.lunasistemasolar.setTipoValoracion(tipovaloracionTemp);
					}

					if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {
						this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxid_tipo_valoracionLunaSistemaSolar.setSelectedItem(tipovaloracionTemp);
					}
				} else {
					//jComboBoxid_tipo_valoracionLunaSistemaSolar.setSelectedItem(tipovaloracionTemp);
					if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {
						if(this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxid_tipo_valoracionLunaSistemaSolar.getItemCount()>0) {
							this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxid_tipo_valoracionLunaSistemaSolar.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoValoracion") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipovaloracionTemp!=null && jComboBoxid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar!=null) {
						jComboBoxid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar.setSelectedItem(tipovaloracionTemp);
					} else {
						if(jComboBoxid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar!=null) {
							//jComboBoxid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar.setSelectedItem(tipovaloracionTemp);
							if(jComboBoxid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar.getItemCount()>0) {
								jComboBoxid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar.setSelectedIndex(0);
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
	public void setActualTipoValoracionForeignKeyGenerico(Long idTipoValoracionSeleccionado,JComboBox jComboBoxid_tipo_valoracionLunaSistemaSolarGenerico)throws Exception
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
				jComboBoxid_tipo_valoracionLunaSistemaSolarGenerico.setSelectedItem(tipovaloracionTemp);
			} else {
				if(jComboBoxid_tipo_valoracionLunaSistemaSolarGenerico!=null && jComboBoxid_tipo_valoracionLunaSistemaSolarGenerico.getItemCount()>0) {
					jComboBoxid_tipo_valoracionLunaSistemaSolarGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoValoracionForeignKey(LunaSistemaSolar lunasistemasolar,JComboBox jComboBoxid_tipo_valoracionLunaSistemaSolarGenerico)throws Exception
	{
		try
		{
			TipoValoracion  tipovaloracionAux=new TipoValoracion();

			if(jComboBoxid_tipo_valoracionLunaSistemaSolarGenerico==null) {
				tipovaloracionAux=(TipoValoracion)this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxid_tipo_valoracionLunaSistemaSolar.getSelectedItem();
			} else {
				tipovaloracionAux=(TipoValoracion)jComboBoxid_tipo_valoracionLunaSistemaSolarGenerico.getSelectedItem();
			}

			if(tipovaloracionAux!=null && tipovaloracionAux.getId()!=null) {
				lunasistemasolar.setid_tipo_valoracion(tipovaloracionAux.getId());
				lunasistemasolar.settipovaloracion_descripcion(LunaSistemaSolarConstantesFunciones.getTipoValoracionDescripcion(tipovaloracionAux));
				lunasistemasolar.setTipoValoracion(tipovaloracionAux);			}
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

					if(!LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) { 
							this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxid_tipo_valoracionLunaSistemaSolar.removeAllItems();

							for(TipoValoracion tipovaloracion:this.tipovaloracionsForeignKey) {
								this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxid_tipo_valoracionLunaSistemaSolar.addItem(tipovaloracion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) { 
					}

					if(!LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoValoracion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar.removeAllItems();

							for(TipoValoracion tipovaloracion:this.tipovaloracionsForeignKey) {
								this.jComboBoxid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar.addItem(tipovaloracion);
							}
						}

						if(!LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {
							this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxid_tipo_valoracionLunaSistemaSolar.setSelectedItem(tipovaloracion);
						}
					} else {
						if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {
							this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxid_tipo_valoracionLunaSistemaSolar.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar.setSelectedItem(tipovaloracion);
						} else {
							this.jComboBoxid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesLunaSistemaSolar() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			LunaSistemaSolarConstantesFunciones.refrescarForeignKeysDescripcionesLunaSistemaSolar(this.lunasistemasolarLogic.getLunaSistemaSolars());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			LunaSistemaSolarConstantesFunciones.refrescarForeignKeysDescripcionesLunaSistemaSolar(this.lunasistemasolars);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(TipoValoracion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//lunasistemasolarLogic.setLunaSistemaSolars(this.lunasistemasolars);
			lunasistemasolarLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public LunaSistemaSolarParameterReturnGeneral getLunaSistemaSolarParameterGeneral() {
		return this.lunasistemasolarParameterGeneral;
	}
	
	public void setLunaSistemaSolarParameterGeneral(LunaSistemaSolarParameterReturnGeneral lunasistemasolarParameterGeneral) {
		this.lunasistemasolarParameterGeneral = lunasistemasolarParameterGeneral;
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
	
	public Boolean getIsPermisoTodoLunaSistemaSolar() {
		return isPermisoTodoLunaSistemaSolar;
	}

	public void setIsPermisoTodoLunaSistemaSolar(Boolean isPermisoTodoLunaSistemaSolar) {
		this.isPermisoTodoLunaSistemaSolar = isPermisoTodoLunaSistemaSolar;
	}

	public Boolean getIsPermisoNuevoLunaSistemaSolar() {
		return isPermisoNuevoLunaSistemaSolar;
	}

	public void setIsPermisoNuevoLunaSistemaSolar(Boolean isPermisoNuevoLunaSistemaSolar) {
		this.isPermisoNuevoLunaSistemaSolar = isPermisoNuevoLunaSistemaSolar;
	}

	public Boolean getIsPermisoActualizarLunaSistemaSolar() {
		return isPermisoActualizarLunaSistemaSolar;
	}

	public void setIsPermisoActualizarLunaSistemaSolar(Boolean isPermisoActualizarLunaSistemaSolar) {
		this.isPermisoActualizarLunaSistemaSolar = isPermisoActualizarLunaSistemaSolar;
	}

	public Boolean getIsPermisoEliminarLunaSistemaSolar() {
		return isPermisoEliminarLunaSistemaSolar;
	}

	public void setIsPermisoEliminarLunaSistemaSolar(Boolean isPermisoEliminarLunaSistemaSolar) {
		this.isPermisoEliminarLunaSistemaSolar = isPermisoEliminarLunaSistemaSolar;
	}

	public Boolean getIsPermisoGuardarCambiosLunaSistemaSolar() {
		return isPermisoGuardarCambiosLunaSistemaSolar;
	}

	public void setIsPermisoGuardarCambiosLunaSistemaSolar(Boolean isPermisoGuardarCambiosLunaSistemaSolar) {
		this.isPermisoGuardarCambiosLunaSistemaSolar = isPermisoGuardarCambiosLunaSistemaSolar;
	}
	
	public Boolean getIsPermisoConsultaLunaSistemaSolar() {
		return isPermisoConsultaLunaSistemaSolar;
	}

	public void setIsPermisoConsultaLunaSistemaSolar(Boolean isPermisoConsultaLunaSistemaSolar) {
		this.isPermisoConsultaLunaSistemaSolar = isPermisoConsultaLunaSistemaSolar;
	}

	public Boolean getIsPermisoBusquedaLunaSistemaSolar() {
		return isPermisoBusquedaLunaSistemaSolar;
	}

	public void setIsPermisoBusquedaLunaSistemaSolar(Boolean isPermisoBusquedaLunaSistemaSolar) {
		this.isPermisoBusquedaLunaSistemaSolar = isPermisoBusquedaLunaSistemaSolar;
	}

	public Boolean getIsPermisoReporteLunaSistemaSolar() {
		return isPermisoReporteLunaSistemaSolar;
	}

	public void setIsPermisoReporteLunaSistemaSolar(Boolean isPermisoReporteLunaSistemaSolar) {
		this.isPermisoReporteLunaSistemaSolar = isPermisoReporteLunaSistemaSolar;
	}
	
	public Boolean getIsPermisoPaginacionMedioLunaSistemaSolar() {
		return isPermisoPaginacionMedioLunaSistemaSolar;
	}

	public void setIsPermisoPaginacionMedioLunaSistemaSolar(Boolean isPermisoPaginacionMedioLunaSistemaSolar) {
		this.isPermisoPaginacionMedioLunaSistemaSolar = isPermisoPaginacionMedioLunaSistemaSolar;
	}
	
	public Boolean getIsPermisoPaginacionTodoLunaSistemaSolar() {
		return isPermisoPaginacionTodoLunaSistemaSolar;
	}

	public void setIsPermisoPaginacionTodoLunaSistemaSolar(Boolean isPermisoPaginacionTodoLunaSistemaSolar) {
		this.isPermisoPaginacionTodoLunaSistemaSolar = isPermisoPaginacionTodoLunaSistemaSolar;
	}
	
	public Boolean getIsPermisoPaginacionAltoLunaSistemaSolar() {
		return isPermisoPaginacionAltoLunaSistemaSolar;
	}

	public void setIsPermisoPaginacionAltoLunaSistemaSolar(Boolean isPermisoPaginacionAltoLunaSistemaSolar) {
		this.isPermisoPaginacionAltoLunaSistemaSolar = isPermisoPaginacionAltoLunaSistemaSolar;
	}
	
	public Boolean getIsPermisoCopiarLunaSistemaSolar() {
		return isPermisoCopiarLunaSistemaSolar;
	}

	public void setIsPermisoCopiarLunaSistemaSolar(Boolean isPermisoCopiarLunaSistemaSolar) {
		this.isPermisoCopiarLunaSistemaSolar = isPermisoCopiarLunaSistemaSolar;
	}
	
	public Boolean getIsPermisoVerFormLunaSistemaSolar() {
		return isPermisoVerFormLunaSistemaSolar;
	}

	public void setIsPermisoVerFormLunaSistemaSolar(Boolean isPermisoVerFormLunaSistemaSolar) {
		this.isPermisoVerFormLunaSistemaSolar = isPermisoVerFormLunaSistemaSolar;
	}
	
	public Boolean getIsPermisoDuplicarLunaSistemaSolar() {
		return isPermisoDuplicarLunaSistemaSolar;
	}

	public void setIsPermisoDuplicarLunaSistemaSolar(Boolean isPermisoDuplicarLunaSistemaSolar) {
		this.isPermisoDuplicarLunaSistemaSolar = isPermisoDuplicarLunaSistemaSolar;
	}
	
	public Boolean getIsPermisoOrdenLunaSistemaSolar() {
		return isPermisoOrdenLunaSistemaSolar;
	}

	public void setIsPermisoOrdenLunaSistemaSolar(Boolean isPermisoOrdenLunaSistemaSolar) {
		this.isPermisoOrdenLunaSistemaSolar = isPermisoOrdenLunaSistemaSolar;
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
	
	public Boolean getIsVisibilidadCeldaNuevoLunaSistemaSolar() {
		return isVisibilidadCeldaNuevoLunaSistemaSolar;
	}

	public void setIsVisibilidadCeldaNuevoLunaSistemaSolar(Boolean isVisibilidadCeldaNuevoLunaSistemaSolar) {
		this.isVisibilidadCeldaNuevoLunaSistemaSolar = isVisibilidadCeldaNuevoLunaSistemaSolar;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarLunaSistemaSolar() {
		return isVisibilidadCeldaDuplicarLunaSistemaSolar;
	}

	public void setIsVisibilidadCeldaDuplicarLunaSistemaSolar(Boolean isVisibilidadCeldaDuplicarLunaSistemaSolar) {
		this.isVisibilidadCeldaDuplicarLunaSistemaSolar = isVisibilidadCeldaDuplicarLunaSistemaSolar;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarLunaSistemaSolar() {
		return isVisibilidadCeldaCopiarLunaSistemaSolar;
	}

	public void setIsVisibilidadCeldaCopiarLunaSistemaSolar(Boolean isVisibilidadCeldaCopiarLunaSistemaSolar) {
		this.isVisibilidadCeldaCopiarLunaSistemaSolar = isVisibilidadCeldaCopiarLunaSistemaSolar;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormLunaSistemaSolar() {
		return isVisibilidadCeldaVerFormLunaSistemaSolar;
	}

	public void setIsVisibilidadCeldaVerFormLunaSistemaSolar(Boolean isVisibilidadCeldaVerFormLunaSistemaSolar) {
		this.isVisibilidadCeldaVerFormLunaSistemaSolar = isVisibilidadCeldaVerFormLunaSistemaSolar;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenLunaSistemaSolar() {
		return isVisibilidadCeldaOrdenLunaSistemaSolar;
	}

	public void setIsVisibilidadCeldaOrdenLunaSistemaSolar(Boolean isVisibilidadCeldaOrdenLunaSistemaSolar) {
		this.isVisibilidadCeldaOrdenLunaSistemaSolar = isVisibilidadCeldaOrdenLunaSistemaSolar;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesLunaSistemaSolar() {
		return isVisibilidadCeldaNuevoRelacionesLunaSistemaSolar;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesLunaSistemaSolar(Boolean isVisibilidadCeldaNuevoRelacionesLunaSistemaSolar) {
		this.isVisibilidadCeldaNuevoRelacionesLunaSistemaSolar = isVisibilidadCeldaNuevoRelacionesLunaSistemaSolar;
	}
	
	public Boolean getIsVisibilidadCeldaModificarLunaSistemaSolar() {
		return isVisibilidadCeldaModificarLunaSistemaSolar;
	}

	public void setIsVisibilidadCeldaModificarLunaSistemaSolar(Boolean isVisibilidadCeldaModificarLunaSistemaSolar) {
		this.isVisibilidadCeldaModificarLunaSistemaSolar = isVisibilidadCeldaModificarLunaSistemaSolar;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarLunaSistemaSolar() {
		return isVisibilidadCeldaActualizarLunaSistemaSolar;
	}

	public void setIsVisibilidadCeldaActualizarLunaSistemaSolar(Boolean isVisibilidadCeldaActualizarLunaSistemaSolar) {
		this.isVisibilidadCeldaActualizarLunaSistemaSolar = isVisibilidadCeldaActualizarLunaSistemaSolar;
	}

	public Boolean getIsVisibilidadCeldaEliminarLunaSistemaSolar() {
		return isVisibilidadCeldaEliminarLunaSistemaSolar;
	}

	public void setIsVisibilidadCeldaEliminarLunaSistemaSolar(Boolean isVisibilidadCeldaEliminarLunaSistemaSolar) {
		this.isVisibilidadCeldaEliminarLunaSistemaSolar = isVisibilidadCeldaEliminarLunaSistemaSolar;
	}

	public Boolean getIsVisibilidadCeldaCancelarLunaSistemaSolar() {
		return isVisibilidadCeldaCancelarLunaSistemaSolar;
	}

	public void setIsVisibilidadCeldaCancelarLunaSistemaSolar(Boolean isVisibilidadCeldaCancelarLunaSistemaSolar) {
		this.isVisibilidadCeldaCancelarLunaSistemaSolar = isVisibilidadCeldaCancelarLunaSistemaSolar;
	}

	public Boolean getIsVisibilidadCeldaGuardarLunaSistemaSolar() {
		return isVisibilidadCeldaGuardarLunaSistemaSolar;
	}

	public void setIsVisibilidadCeldaGuardarLunaSistemaSolar(Boolean isVisibilidadCeldaGuardarLunaSistemaSolar) {
		this.isVisibilidadCeldaGuardarLunaSistemaSolar = isVisibilidadCeldaGuardarLunaSistemaSolar;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosLunaSistemaSolar() {
		return isVisibilidadCeldaGuardarCambiosLunaSistemaSolar;
	}

	public void setIsVisibilidadCeldaGuardarCambiosLunaSistemaSolar(Boolean isVisibilidadCeldaGuardarCambiosLunaSistemaSolar) {
		this.isVisibilidadCeldaGuardarCambiosLunaSistemaSolar = isVisibilidadCeldaGuardarCambiosLunaSistemaSolar;
	}
		
	public LunaSistemaSolarSessionBean getlunasistemasolarSessionBean() {
		return this.lunasistemasolarSessionBean;
	}
	
	public void setlunasistemasolarSessionBean(LunaSistemaSolarSessionBean lunasistemasolarSessionBean) {
		this.lunasistemasolarSessionBean=lunasistemasolarSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdTipoValoracion() {
		return this.isVisibilidadFK_IdTipoValoracion;
	}

	public void setisVisibilidadFK_IdTipoValoracion(Boolean isVisibilidadFK_IdTipoValoracion) {
		this.isVisibilidadFK_IdTipoValoracion=isVisibilidadFK_IdTipoValoracion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysLunaSistemaSolar(LunaSistemaSolar lunasistemasolar)throws Exception {
		try {
			
				this.setActualParaGuardarTipoValoracionForeignKey(lunasistemasolar,null);
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
	
	public void bugActualizarReferenciaActual(LunaSistemaSolar lunasistemasolar,LunaSistemaSolar lunasistemasolarAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalLunaSistemaSolar(lunasistemasolar);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		lunasistemasolarAux.setId(lunasistemasolar.getId());
		lunasistemasolarAux.setVersionRow(lunasistemasolar.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessLunaSistemaSolar();
		
			int intSelectedRow = this.jTableDatosLunaSistemaSolar.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualLunaSistemaSolar(this.lunasistemasolar,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysLunaSistemaSolar(this.lunasistemasolar);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = lunasistemasolarValidator.getInvalidValues(this.lunasistemasolar);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			lunasistemasolarLogic.setDatosCliente(datosCliente);
			lunasistemasolarLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				lunasistemasolarAux=new  LunaSistemaSolar();
				
				lunasistemasolarAux.setIsNew(true);
				lunasistemasolarAux.setIsChanged(true);
				
				lunasistemasolarAux.setLunaSistemaSolarOriginal(this.lunasistemasolar);
				
				lunasistemasolarAux.setId(this.lunasistemasolar.getId());	
				lunasistemasolarAux.setVersionRow(this.lunasistemasolar.getVersionRow());	
				lunasistemasolarAux.setid_tipo_valoracion(this.lunasistemasolar.getid_tipo_valoracion());	
				lunasistemasolarAux.setcodigo(this.lunasistemasolar.getcodigo());	
				lunasistemasolarAux.setnombre(this.lunasistemasolar.getnombre());	
				lunasistemasolarAux.setdescripcion(this.lunasistemasolar.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.lunasistemasolarSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.lunasistemasolarSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(lunasistemasolarAux,lunasistemasolarLogic.getLunaSistemaSolars());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(lunasistemasolarAux,lunasistemasolars);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.lunasistemasolarSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.lunasistemasolarSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lunasistemasolarLogic.saveLunaSistemaSolars();//WithConnection
						//lunasistemasolarLogic.getSetVersionRowLunaSistemaSolars();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.lunasistemasolar,lunasistemasolarAux);
					
					this.refrescarForeignKeysDescripcionesLunaSistemaSolar();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.lunasistemasolarSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				lunasistemasolarAux=new  LunaSistemaSolar();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.lunasistemasolarSessionBean.getEsGuardarRelacionado() 
					|| (this.lunasistemasolarSessionBean.getEsGuardarRelacionado() && this.lunasistemasolar.getId()>=0)) {
						
					lunasistemasolarAux.setIsNew(false);
				}
				
				lunasistemasolarAux.setIsDeleted(false);
			
				lunasistemasolarAux.setId(this.lunasistemasolar.getId());	
				lunasistemasolarAux.setVersionRow(this.lunasistemasolar.getVersionRow());	
				lunasistemasolarAux.setid_tipo_valoracion(this.lunasistemasolar.getid_tipo_valoracion());	
				lunasistemasolarAux.setcodigo(this.lunasistemasolar.getcodigo());	
				lunasistemasolarAux.setnombre(this.lunasistemasolar.getnombre());	
				lunasistemasolarAux.setdescripcion(this.lunasistemasolar.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(lunasistemasolarAux,lunasistemasolarLogic.getLunaSistemaSolars());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(lunasistemasolarAux,lunasistemasolars);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.lunasistemasolarSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.lunasistemasolarSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lunasistemasolarLogic.saveLunaSistemaSolars();//WithConnection
						//lunasistemasolarLogic.getSetVersionRowLunaSistemaSolars();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.lunasistemasolar,lunasistemasolarAux);
					
					this.refrescarForeignKeysDescripcionesLunaSistemaSolar();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.lunasistemasolarSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				lunasistemasolarAux=new  LunaSistemaSolar();
				
				lunasistemasolarAux.setIsNew(false);
				lunasistemasolarAux.setIsChanged(false);
				
				lunasistemasolarAux.setIsDeleted(true);
				
				lunasistemasolarAux.setId(this.lunasistemasolar.getId());	
				lunasistemasolarAux.setVersionRow(this.lunasistemasolar.getVersionRow());	
				lunasistemasolarAux.setid_tipo_valoracion(this.lunasistemasolar.getid_tipo_valoracion());	
				lunasistemasolarAux.setcodigo(this.lunasistemasolar.getcodigo());	
				lunasistemasolarAux.setnombre(this.lunasistemasolar.getnombre());	
				lunasistemasolarAux.setdescripcion(this.lunasistemasolar.getdescripcion());	
				
				if(this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.lunasistemasolarAux.getId()>=0) {	
						this.lunasistemasolarsEliminados.add(lunasistemasolarAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(lunasistemasolarAux,lunasistemasolarLogic.getLunaSistemaSolars());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(lunasistemasolarAux,lunasistemasolars);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.lunasistemasolarSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.lunasistemasolarSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lunasistemasolarLogic.saveLunaSistemaSolars();//WithConnection
						//lunasistemasolarLogic.getSetVersionRowLunaSistemaSolars();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.lunasistemasolarSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.lunasistemasolarSessionBean.getEstaModoGuardarRelaciones() 
								|| this.lunasistemasolarSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(lunasistemasolarAux,lunasistemasolarLogic.getLunaSistemaSolars());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(lunasistemasolarAux,lunasistemasolars);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarLogic.getLunaSistemaSolars().addAll(this.lunasistemasolarsEliminados);
					
					lunasistemasolarLogic.saveLunaSistemaSolars();//WithConnection
					//lunasistemasolarLogic.getSetVersionRowLunaSistemaSolars();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesLunaSistemaSolar();
				
				this.lunasistemasolarsEliminados= new ArrayList<LunaSistemaSolar>();		
			}
			
			if(this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Luna Sistema Solar GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Luna Sistema Solar",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.lunasistemasolar=lunasistemasolarAux;
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
      		//this.finishProcessLunaSistemaSolar();
      	}
		
	}	
	
	public void actualizarRelaciones(LunaSistemaSolar lunasistemasolarLocal) throws Exception {
		
		if(this.lunasistemasolarSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(LunaSistemaSolar lunasistemasolarLocal) throws Exception {	
		if(this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(TipoValoracionDetalleFormJInternalFrame.class)) {
				TipoValoracionBeanSwingJInternalFrame tipovaloracionBeanSwingJInternalFrameLocal=(TipoValoracionBeanSwingJInternalFrame) ((TipoValoracionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipovaloracionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoValoracion(tipovaloracionBeanSwingJInternalFrameLocal.gettipovaloracion(),true);
				tipovaloracionBeanSwingJInternalFrameLocal.actualizarLista(tipovaloracionBeanSwingJInternalFrameLocal.tipovaloracion,this.tipovaloracionsForeignKey);

				tipovaloracionBeanSwingJInternalFrameLocal.actualizarRelaciones(tipovaloracionBeanSwingJInternalFrameLocal.tipovaloracion);

				lunasistemasolarLocal.setTipoValoracion(tipovaloracionBeanSwingJInternalFrameLocal.tipovaloracion);

				this.addItemDefectoCombosForeignKeyTipoValoracion();
				this.cargarCombosFrameTipoValoracionsForeignKey("Formulario");
				this.setActualTipoValoracionForeignKey(tipovaloracionBeanSwingJInternalFrameLocal.tipovaloracion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarLunaSistemaSolarActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosLunaSistemaSolar.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = lunasistemasolarValidator.getInvalidValues(this.lunasistemasolar);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(LunaSistemaSolar lunasistemasolar,List<LunaSistemaSolar> lunasistemasolars) throws Exception {
		try	{		
			LunaSistemaSolarConstantesFunciones.actualizarLista(lunasistemasolar,lunasistemasolars,this.lunasistemasolarSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(LunaSistemaSolar lunasistemasolar,List<LunaSistemaSolar> lunasistemasolars) throws Exception {
		try	{			
			LunaSistemaSolarConstantesFunciones.actualizarSelectedLista(lunasistemasolar,lunasistemasolars);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<LunaSistemaSolar> lunasistemasolarsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				lunasistemasolarsLocal=this.lunasistemasolarLogic.getLunaSistemaSolars();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				lunasistemasolarsLocal=this.lunasistemasolars;
			}
			//ARCHITECTURE
		
			for(LunaSistemaSolar lunasistemasolarLocal:lunasistemasolarsLocal) {
				if(this.permiteMantenimiento(lunasistemasolarLocal) && lunasistemasolarLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+LunaSistemaSolarConstantesFunciones.getLunaSistemaSolarLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(LunaSistemaSolarConstantesFunciones.IDTIPOVALORACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLunaSistemaSolar.jLabelid_tipo_valoracionLunaSistemaSolar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LunaSistemaSolarConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLunaSistemaSolar.jLabelcodigoLunaSistemaSolar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LunaSistemaSolarConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLunaSistemaSolar.jLabelnombreLunaSistemaSolar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LunaSistemaSolarConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLunaSistemaSolar.jLabeldescripcionLunaSistemaSolar,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLunaSistemaSolar.jLabelid_tipo_valoracionLunaSistemaSolar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLunaSistemaSolar.jLabelcodigoLunaSistemaSolar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLunaSistemaSolar.jLabelnombreLunaSistemaSolar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLunaSistemaSolar.jLabeldescripcionLunaSistemaSolar,"");
		
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
		this.iIdNuevoLunaSistemaSolar--;	
		
		
		this.lunasistemasolarAux=new LunaSistemaSolar();
		
		this.lunasistemasolarAux.setId(this.iIdNuevoLunaSistemaSolar);
		this.lunasistemasolarAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.lunasistemasolarLogic.getLunaSistemaSolars().add(this.lunasistemasolarAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.lunasistemasolars.add(this.lunasistemasolarAux);
		}
		//ARCHITECTURE
		
		this.lunasistemasolar=this.lunasistemasolarAux;
		
		if(LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioLunaSistemaSolar(this.lunasistemasolar);
			this.setVariablesObjetoActualToFormularioForeignKeyLunaSistemaSolar(this.lunasistemasolar);
		}
				
		//this.setDefaultControlesLunaSistemaSolar();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyLunaSistemaSolar();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyLunaSistemaSolar();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyLunaSistemaSolar();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualLunaSistemaSolar(this.lunasistemasolarBean,this.lunasistemasolar,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysLunaSistemaSolar(this.lunasistemasolar);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.lunasistemasolarSessionBean.getConGuardarRelaciones()) {
			classes=LunaSistemaSolarConstantesFunciones.getClassesRelationshipsOfLunaSistemaSolar(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.lunasistemasolarReturnGeneral=lunasistemasolarLogic.procesarEventosLunaSistemaSolarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.lunasistemasolarLogic.getLunaSistemaSolars(),this.lunasistemasolar,this.lunasistemasolarParameterGeneral,this.isEsNuevoLunaSistemaSolar,classes);//this.lunasistemasolarLogic.getLunaSistemaSolar()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanLunaSistemaSolar(this.lunasistemasolarReturnGeneral,this.lunasistemasolarBean,false);
		
		if(this.lunasistemasolarReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyLunaSistemaSolar(this.lunasistemasolarReturnGeneral.getLunaSistemaSolar());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioLunaSistemaSolar(this.lunasistemasolarReturnGeneral.getLunaSistemaSolar());
		}
		
		if(this.lunasistemasolarReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioLunaSistemaSolar(this.lunasistemasolarReturnGeneral.getLunaSistemaSolar(),classes);//this.lunasistemasolarBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualLunaSistemaSolar(this.lunasistemasolar,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyLunaSistemaSolar();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyLunaSistemaSolar();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			LunaSistemaSolarBeanSwingJInternalFrameAdditional.RecargarFormLunaSistemaSolar(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingLunaSistemaSolar(false);
						
			if(lunasistemasolarSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualLunaSistemaSolar();
			}
			
			this.actualizarVisualTableDatosLunaSistemaSolar();
			
			this.jTableDatosLunaSistemaSolar.setRowSelectionInterval(this.getIndiceNuevoLunaSistemaSolar(), this.getIndiceNuevoLunaSistemaSolar());
			
			this.seleccionarFilaTablaLunaSistemaSolarActual();
						
			this.actualizarEstadoCeldasBotonesLunaSistemaSolar("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesLunaSistemaSolar(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormLunaSistemaSolar.jTextFieldcodigoLunaSistemaSolar.setEnabled(isHabilitar && this.lunasistemasolarConstantesFunciones.activarcodigoLunaSistemaSolar);
		this.jInternalFrameDetalleFormLunaSistemaSolar.jTextAreanombreLunaSistemaSolar.setEnabled(isHabilitar && this.lunasistemasolarConstantesFunciones.activarnombreLunaSistemaSolar);
		this.jInternalFrameDetalleFormLunaSistemaSolar.jTextAreadescripcionLunaSistemaSolar.setEnabled(isHabilitar && this.lunasistemasolarConstantesFunciones.activardescripcionLunaSistemaSolar);	
		
		this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxid_tipo_valoracionLunaSistemaSolar.setEnabled(isHabilitar && this.lunasistemasolarConstantesFunciones.activarid_tipo_valoracionLunaSistemaSolar);
	};
	
	public void setDefaultControlesLunaSistemaSolar() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoLunaSistemaSolar(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.lunasistemasolarSessionBean.setConGuardarRelaciones(true);			
			this.lunasistemasolarSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormLunaSistemaSolar.jTabbedPaneRelacionesLunaSistemaSolar.setVisible(true);
			
					
		} else {
			//this.lunasistemasolarSessionBean.setConGuardarRelaciones(false);			
			this.lunasistemasolarSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormLunaSistemaSolar.jTabbedPaneRelacionesLunaSistemaSolar.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoLunaSistemaSolar() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LunaSistemaSolar lunasistemasolarAux:this.lunasistemasolarLogic.getLunaSistemaSolars()) {
				if(lunasistemasolarAux.getId().equals(this.iIdNuevoLunaSistemaSolar)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LunaSistemaSolar lunasistemasolarAux:this.lunasistemasolars) {
				if(lunasistemasolarAux.getId().equals(this.iIdNuevoLunaSistemaSolar)) {
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
	
	public int getIndiceActualLunaSistemaSolar(LunaSistemaSolar lunasistemasolar,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LunaSistemaSolar lunasistemasolarAux:this.lunasistemasolarLogic.getLunaSistemaSolars()) {
				if(lunasistemasolarAux.getId().equals(lunasistemasolar.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LunaSistemaSolar lunasistemasolarAux:this.lunasistemasolars) {
				if(lunasistemasolarAux.getId().equals(lunasistemasolar.getId())) {
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
	
	public void setCamposBaseDesdeOriginalLunaSistemaSolar(LunaSistemaSolar lunasistemasolarOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LunaSistemaSolar lunasistemasolarAux:this.lunasistemasolarLogic.getLunaSistemaSolars()) {
				if(lunasistemasolarAux.getLunaSistemaSolarOriginal().getId().equals(lunasistemasolarOriginal.getId())) {
					existe=true;
					lunasistemasolarOriginal.setId(lunasistemasolarAux.getId());
					lunasistemasolarOriginal.setVersionRow(lunasistemasolarAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LunaSistemaSolar lunasistemasolarAux:this.lunasistemasolars) {
				if(lunasistemasolarAux.getLunaSistemaSolarOriginal().getId().equals(lunasistemasolarOriginal.getId())) {
					existe=true;
					lunasistemasolarOriginal.setId(lunasistemasolarAux.getId());
					lunasistemasolarOriginal.setVersionRow(lunasistemasolarAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosLunaSistemaSolar(Boolean esParaCancelar) throws Exception {
		lunasistemasolarsAux=new ArrayList<LunaSistemaSolar>();
		lunasistemasolarAux=new LunaSistemaSolar();
		
		if(!this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(LunaSistemaSolar lunasistemasolarAux:this.lunasistemasolarLogic.getLunaSistemaSolars()) {
					if(lunasistemasolarAux.getId()<0) {
						lunasistemasolarsAux.add(lunasistemasolarAux);
					}		
				}
				this.iIdNuevoLunaSistemaSolar=0L;
				this.lunasistemasolarLogic.getLunaSistemaSolars().removeAll(lunasistemasolarsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LunaSistemaSolar lunasistemasolarAux:this.lunasistemasolars) {
					if(lunasistemasolarAux.getId()<0) {
						lunasistemasolarsAux.add(lunasistemasolarAux);
					}		
				}
				this.iIdNuevoLunaSistemaSolar=0L;
				this.lunasistemasolars.removeAll(lunasistemasolarsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoLunaSistemaSolar 
					&& this.lunasistemasolarLogic.getLunaSistemaSolars().size()>0
					) {
					lunasistemasolarAux=this.lunasistemasolarLogic.getLunaSistemaSolars().get(this.lunasistemasolarLogic.getLunaSistemaSolars().size() - 1);
				
					if(lunasistemasolarAux.getId()<0) {
						this.lunasistemasolarLogic.getLunaSistemaSolars().remove(lunasistemasolarAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoLunaSistemaSolar && this.lunasistemasolars.size()>0) {
					lunasistemasolarAux=this.lunasistemasolars.get(this.lunasistemasolars.size() - 1);
				
					if(lunasistemasolarAux.getId()<0) {
						this.lunasistemasolars.remove(lunasistemasolarAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoLunaSistemaSolar(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(lunasistemasolar.getId()<0) {
				this.lunasistemasolarLogic.getLunaSistemaSolars().remove(this.lunasistemasolar);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(lunasistemasolar.getId()<0) {
				this.lunasistemasolars.remove(this.lunasistemasolar);
			}
		}			
	}
	
	public void setEstadosInicialesLunaSistemaSolar(List<LunaSistemaSolar> lunasistemasolarsAux) throws Exception {
		LunaSistemaSolarConstantesFunciones.setEstadosInicialesLunaSistemaSolar(lunasistemasolarsAux);
	}
	
	public void setEstadosInicialesLunaSistemaSolar(LunaSistemaSolar lunasistemasolarAux) throws Exception {
		LunaSistemaSolarConstantesFunciones.setEstadosInicialesLunaSistemaSolar(lunasistemasolarAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarLunaSistemaSolarActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesLunaSistemaSolar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarLunaSistemaSolarActual()) {
				if(!this.isEsNuevoLunaSistemaSolar) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesLunaSistemaSolar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoLunaSistemaSolar=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarLunaSistemaSolarActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Luna Sistema Solar ?", "MANTENIMIENTO DE Luna Sistema Solar", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesLunaSistemaSolar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(LunaSistemaSolar lunasistemasolar) throws Exception {
		LunaSistemaSolarConstantesFunciones.seleccionarAsignar(this.lunasistemasolar,lunasistemasolar);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarLunaSistemaSolar=this.isPermisoActualizarOriginalLunaSistemaSolar;
			
			
			this.seleccionarAsignar(lunasistemasolar);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			LunaSistemaSolarConstantesFunciones.quitarEspaciosLunaSistemaSolar(this.lunasistemasolar,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesLunaSistemaSolar("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.lunasistemasolarSessionBean.setsFuncionBusquedaRapida(this.lunasistemasolarSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoLunaSistemaSolar) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosLunaSistemaSolar(esParaCancelar);				
				this.cancelarNuevoLunaSistemaSolar(esParaCancelar);								
			}
			
			this.lunasistemasolar=new LunaSistemaSolar();
			
			this.inicializarLunaSistemaSolar();
			
			this.actualizarEstadoCeldasBotonesLunaSistemaSolar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarLunaSistemaSolar() throws Exception {
		try {
			LunaSistemaSolarConstantesFunciones.inicializarLunaSistemaSolar(this.lunasistemasolar);
			
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
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.lunasistemasolarLogic.getLunaSistemaSolars().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteLunaSistemaSolars(String sAccionBusqueda,List<LunaSistemaSolar> lunasistemasolarsParaReportes) throws Exception {
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
					sPathReporteFinal="LunaSistemaSolar"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="LunaSistemaSolarMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("LunaSistemaSolarMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="LunaSistemaSolar"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Luna Sistema Solares");		
		parameters.put("busquedapor", LunaSistemaSolarConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceLunaSistemaSolar=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			LunaSistemaSolarConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			LunaSistemaSolarConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceLunaSistemaSolar=new JRBeanArrayDataSource(LunaSistemaSolarJInternalFrame.TraerLunaSistemaSolarBeans(lunasistemasolarsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceLunaSistemaSolar);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+LunaSistemaSolarConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+LunaSistemaSolarConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(LunaSistemaSolarBean.TraerLunaSistemaSolarBeans(lunasistemasolarsParaReportes).toArray()));
							
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
				this.generarExcelReporteLunaSistemaSolars(sAccionBusqueda,sTipoArchivoReporte,lunasistemasolarsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalLunaSistemaSolars(sAccionBusqueda,sTipoArchivoReporte,lunasistemasolarsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoLunaSistemaSolarActionPerformed(null);
					//this.generarExcelReporteLunaSistemaSolars(sAccionBusqueda,sTipoArchivoReporte,lunasistemasolarsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalLunaSistemaSolars(sAccionBusqueda,sTipoArchivoReporte,lunasistemasolarsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesLunaSistemaSolars(sAccionBusqueda,sTipoArchivoReporte,lunasistemasolarsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesLunaSistemaSolars(sAccionBusqueda,sTipoArchivoReporte,lunasistemasolarsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteLunaSistemaSolars(String sAccionBusqueda,String sTipoArchivoReporte,List<LunaSistemaSolar> lunasistemasolarsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lunasistemasolar";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("LunaSistemaSolars");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderLunaSistemaSolar("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(LunaSistemaSolar lunasistemasolar : lunasistemasolarsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			LunaSistemaSolarConstantesFunciones.generarExcelReporteDataLunaSistemaSolar("NORMAL",row,workbook,lunasistemasolar,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Luna Sistema Solar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderLunaSistemaSolar(String sTipo,Row row,Workbook workbook) {
		
		LunaSistemaSolarConstantesFunciones.generarExcelReporteHeaderLunaSistemaSolar(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalLunaSistemaSolars(String sAccionBusqueda,String sTipoArchivoReporte,List<LunaSistemaSolar> lunasistemasolarsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lunasistemasolar_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("LunaSistemaSolars");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(LunaSistemaSolar lunasistemasolar : lunasistemasolarsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(LunaSistemaSolarConstantesFunciones.getLunaSistemaSolarDescripcion(lunasistemasolar));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LunaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LunaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(lunasistemasolar.gettipovaloracion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LunaSistemaSolarConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LunaSistemaSolarConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(lunasistemasolar.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LunaSistemaSolarConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LunaSistemaSolarConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(lunasistemasolar.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LunaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LunaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(lunasistemasolar.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Luna Sistema Solar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesLunaSistemaSolars(String sAccionBusqueda,String sTipoArchivoReporte,List<LunaSistemaSolar> lunasistemasolarsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<LunaSistemaSolar> lunasistemasolarsRespaldo=null;
		
		classes=LunaSistemaSolarConstantesFunciones.getClassesRelationshipsOfLunaSistemaSolar(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.lunasistemasolarLogic.setDatosCliente(this.datosCliente);
		this.lunasistemasolarLogic.setDatosDeep(this.datosDeep);
		this.lunasistemasolarLogic.setIsConDeep(true);
		
		lunasistemasolarsRespaldo=this.lunasistemasolarLogic.getLunaSistemaSolars();
		
		this.lunasistemasolarLogic.setLunaSistemaSolars(lunasistemasolarsParaReportes);	
		this.lunasistemasolarLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		lunasistemasolarsParaReportes=this.lunasistemasolarLogic.getLunaSistemaSolars();
		this.lunasistemasolarLogic.setLunaSistemaSolars(lunasistemasolarsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lunasistemasolar_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("LunaSistemaSolars");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderLunaSistemaSolar("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(LunaSistemaSolar lunasistemasolar : lunasistemasolarsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderLunaSistemaSolar("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			LunaSistemaSolarConstantesFunciones.generarExcelReporteDataLunaSistemaSolar("NORMAL",row,workbook,lunasistemasolar,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(LunaSistemaSolarConstantesFunciones.getLunaSistemaSolarDescripcion(lunasistemasolar));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Luna Sistema Solar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessLunaSistemaSolar() throws Exception {		
		this.startProcessLunaSistemaSolar(true);
	}
	
	public void startProcessLunaSistemaSolar(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasLunaSistemaSolar ,this.jPanelParametrosReportesLunaSistemaSolar, this.jScrollPanelDatosLunaSistemaSolar,this.jPanelPaginacionLunaSistemaSolar, this.jScrollPanelDatosEdicionLunaSistemaSolar, this.jPanelAccionesLunaSistemaSolar,this.jPanelAccionesFormularioLunaSistemaSolar,this.jmenuBarLunaSistemaSolar,this.jmenuBarDetalleLunaSistemaSolar,this.jTtoolBarLunaSistemaSolar,this.jTtoolBarDetalleLunaSistemaSolar);		
		
		final JTabbedPane jTabbedPaneBusquedasLunaSistemaSolar=this.jTabbedPaneBusquedasLunaSistemaSolar; 
		
		final JPanel jPanelParametrosReportesLunaSistemaSolar=this.jPanelParametrosReportesLunaSistemaSolar;
		//final JScrollPane jScrollPanelDatosLunaSistemaSolar=this.jScrollPanelDatosLunaSistemaSolar;
		final JTable jTableDatosLunaSistemaSolar=this.jTableDatosLunaSistemaSolar;		
		final JPanel jPanelPaginacionLunaSistemaSolar=this.jPanelPaginacionLunaSistemaSolar;
		//final JScrollPane jScrollPanelDatosEdicionLunaSistemaSolar=this.jScrollPanelDatosEdicionLunaSistemaSolar;
		final JPanel jPanelAccionesLunaSistemaSolar=this.jPanelAccionesLunaSistemaSolar;
		
		JPanel jPanelCamposAuxiliarLunaSistemaSolar=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarLunaSistemaSolar=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {
			jPanelCamposAuxiliarLunaSistemaSolar=this.jInternalFrameDetalleFormLunaSistemaSolar.jPanelCamposLunaSistemaSolar;
			jPanelAccionesFormularioAuxiliarLunaSistemaSolar=this.jInternalFrameDetalleFormLunaSistemaSolar.jPanelAccionesFormularioLunaSistemaSolar;
		}
		
		final JPanel jPanelCamposLunaSistemaSolar=jPanelCamposAuxiliarLunaSistemaSolar;
		final JPanel jPanelAccionesFormularioLunaSistemaSolar=jPanelAccionesFormularioAuxiliarLunaSistemaSolar;
		
		
		final JMenuBar jmenuBarLunaSistemaSolar=this.jmenuBarLunaSistemaSolar;
		final JToolBar jTtoolBarLunaSistemaSolar=this.jTtoolBarLunaSistemaSolar;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarLunaSistemaSolar=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarLunaSistemaSolar=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {
			jmenuBarDetalleAuxiliarLunaSistemaSolar=this.jInternalFrameDetalleFormLunaSistemaSolar.jmenuBarDetalleLunaSistemaSolar;
			jTtoolBarDetalleAuxiliarLunaSistemaSolar=this.jInternalFrameDetalleFormLunaSistemaSolar.jTtoolBarDetalleLunaSistemaSolar;
		}
		
		final JMenuBar jmenuBarDetalleLunaSistemaSolar=jmenuBarDetalleAuxiliarLunaSistemaSolar;
		final JToolBar jTtoolBarDetalleLunaSistemaSolar=jTtoolBarDetalleAuxiliarLunaSistemaSolar;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasLunaSistemaSolar;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesLunaSistemaSolar;
			processRunnable.jTableDatos=jTableDatosLunaSistemaSolar;
			processRunnable.jPanelCampos=jPanelCamposLunaSistemaSolar;
			processRunnable.jPanelPaginacion=jPanelPaginacionLunaSistemaSolar;
			processRunnable.jPanelAcciones=jPanelAccionesLunaSistemaSolar;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioLunaSistemaSolar;
			
			
			processRunnable.jmenuBar=jmenuBarLunaSistemaSolar;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleLunaSistemaSolar;
			processRunnable.jTtoolBar=jTtoolBarLunaSistemaSolar;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleLunaSistemaSolar;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasLunaSistemaSolar ,jPanelParametrosReportesLunaSistemaSolar,jTableDatosLunaSistemaSolar, /*jScrollPanelDatosLunaSistemaSolar,*/jPanelCamposLunaSistemaSolar,jPanelPaginacionLunaSistemaSolar, /*jScrollPanelDatosEdicionLunaSistemaSolar,*/ jPanelAccionesLunaSistemaSolar,jPanelAccionesFormularioLunaSistemaSolar,jmenuBarLunaSistemaSolar,jmenuBarDetalleLunaSistemaSolar,jTtoolBarLunaSistemaSolar,jTtoolBarDetalleLunaSistemaSolar);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasLunaSistemaSolar ,jPanelParametrosReportesLunaSistemaSolar, jScrollPanelDatosLunaSistemaSolar,jPanelPaginacionLunaSistemaSolar, jScrollPanelDatosEdicionLunaSistemaSolar, jPanelAccionesLunaSistemaSolar,jPanelAccionesFormularioLunaSistemaSolar,jmenuBarLunaSistemaSolar,jmenuBarDetalleLunaSistemaSolar,jTtoolBarLunaSistemaSolar,jTtoolBarDetalleLunaSistemaSolar);
						
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
	
	public void finishProcessLunaSistemaSolar() {// throws Exception 
		this.finishProcessLunaSistemaSolar(true);
	}
	
	public void finishProcessLunaSistemaSolar(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasLunaSistemaSolar ,this.jPanelParametrosReportesLunaSistemaSolar, this.jScrollPanelDatosLunaSistemaSolar,this.jPanelPaginacionLunaSistemaSolar, this.jScrollPanelDatosEdicionLunaSistemaSolar, this.jPanelAccionesLunaSistemaSolar,this.jPanelAccionesFormularioLunaSistemaSolar,this.jmenuBarLunaSistemaSolar,this.jmenuBarDetalleLunaSistemaSolar,this.jTtoolBarLunaSistemaSolar,this.jTtoolBarDetalleLunaSistemaSolar);		
		
		final JTabbedPane jTabbedPaneBusquedasLunaSistemaSolar=this.jTabbedPaneBusquedasLunaSistemaSolar; 
		
		final JPanel jPanelParametrosReportesLunaSistemaSolar=this.jPanelParametrosReportesLunaSistemaSolar;
		//final JScrollPane jScrollPanelDatosLunaSistemaSolar=this.jScrollPanelDatosLunaSistemaSolar;
		final JTable jTableDatosLunaSistemaSolar=this.jTableDatosLunaSistemaSolar;		
		final JPanel jPanelPaginacionLunaSistemaSolar=this.jPanelPaginacionLunaSistemaSolar;
		//final JScrollPane jScrollPanelDatosEdicionLunaSistemaSolar=this.jScrollPanelDatosEdicionLunaSistemaSolar;
		final JPanel jPanelAccionesLunaSistemaSolar=this.jPanelAccionesLunaSistemaSolar;
		
		JPanel jPanelCamposAuxiliarLunaSistemaSolar=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarLunaSistemaSolar=new JPanel();
		
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {
			jPanelCamposAuxiliarLunaSistemaSolar=this.jInternalFrameDetalleFormLunaSistemaSolar.jPanelCamposLunaSistemaSolar;
			jPanelAccionesFormularioAuxiliarLunaSistemaSolar=this.jInternalFrameDetalleFormLunaSistemaSolar.jPanelAccionesFormularioLunaSistemaSolar;
		}
		
		final JPanel jPanelCamposLunaSistemaSolar=jPanelCamposAuxiliarLunaSistemaSolar;
		final JPanel jPanelAccionesFormularioLunaSistemaSolar=jPanelAccionesFormularioAuxiliarLunaSistemaSolar;
		
		
		final JMenuBar jmenuBarLunaSistemaSolar=this.jmenuBarLunaSistemaSolar;		
		final JToolBar jTtoolBarLunaSistemaSolar=this.jTtoolBarLunaSistemaSolar;
				
		JMenuBar jmenuBarDetalleAuxiliarLunaSistemaSolar=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarLunaSistemaSolar=new JToolBar();
		
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {
			jmenuBarDetalleAuxiliarLunaSistemaSolar=this.jInternalFrameDetalleFormLunaSistemaSolar.jmenuBarDetalleLunaSistemaSolar;
			jTtoolBarDetalleAuxiliarLunaSistemaSolar=this.jInternalFrameDetalleFormLunaSistemaSolar.jTtoolBarDetalleLunaSistemaSolar;		
		}
		
		final JMenuBar jmenuBarDetalleLunaSistemaSolar=jmenuBarDetalleAuxiliarLunaSistemaSolar;
		final JToolBar jTtoolBarDetalleLunaSistemaSolar=jTtoolBarDetalleAuxiliarLunaSistemaSolar;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasLunaSistemaSolar;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesLunaSistemaSolar;
			processRunnable.jTableDatos=jTableDatosLunaSistemaSolar;
			processRunnable.jPanelCampos=jPanelCamposLunaSistemaSolar;
			processRunnable.jPanelPaginacion=jPanelPaginacionLunaSistemaSolar;
			processRunnable.jPanelAcciones=jPanelAccionesLunaSistemaSolar;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioLunaSistemaSolar;
			
			
			processRunnable.jmenuBar=jmenuBarLunaSistemaSolar;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleLunaSistemaSolar;
			processRunnable.jTtoolBar=jTtoolBarLunaSistemaSolar;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleLunaSistemaSolar;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasLunaSistemaSolar ,jPanelParametrosReportesLunaSistemaSolar, jTableDatosLunaSistemaSolar,/*jScrollPanelDatosLunaSistemaSolar,*/jPanelCamposLunaSistemaSolar,jPanelPaginacionLunaSistemaSolar, /*jScrollPanelDatosEdicionLunaSistemaSolar,*/ jPanelAccionesLunaSistemaSolar,jPanelAccionesFormularioLunaSistemaSolar,jmenuBarLunaSistemaSolar,jmenuBarDetalleLunaSistemaSolar,jTtoolBarLunaSistemaSolar,jTtoolBarDetalleLunaSistemaSolar));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesLunaSistemaSolar(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarLunaSistemaSolar(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuLunaSistemaSolar(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarLunaSistemaSolar(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarLunaSistemaSolar,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleLunaSistemaSolar,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuLunaSistemaSolar(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarLunaSistemaSolar,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleLunaSistemaSolar,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.lunasistemasolarConstantesFunciones.getsFinalQueryLunaSistemaSolar();
		String  finalQueryPaginacionTodos=this.lunasistemasolarConstantesFunciones.getsFinalQueryLunaSistemaSolar();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=LunaSistemaSolarConstantesFunciones.getArrayColumnasGlobalesNoLunaSistemaSolar(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=LunaSistemaSolarConstantesFunciones.getArrayColumnasGlobalesLunaSistemaSolar(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,LunaSistemaSolarConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.lunasistemasolarsEliminados= new ArrayList<LunaSistemaSolar>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessLunaSistemaSolar();
		
				///*LunaSistemaSolarSessionBean*/this.lunasistemasolarSessionBean=new LunaSistemaSolarSessionBean();
			
			if(this.lunasistemasolarSessionBean==null) {
				this.lunasistemasolarSessionBean=new LunaSistemaSolarSessionBean();
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
					this.iNumeroPaginacion=LunaSistemaSolarConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=LunaSistemaSolarConstantesFunciones.getClassesForeignKeysOfLunaSistemaSolar(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/lunasistemasolar."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			lunasistemasolarsAux= new ArrayList<LunaSistemaSolar>();
			
				
			lunasistemasolarLogic.setDatosCliente(this.datosCliente);
			lunasistemasolarLogic.setDatosDeep(this.datosDeep);
			lunasistemasolarLogic.setIsConDeep(true);
			
			
			lunasistemasolarLogic.getLunaSistemaSolarDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					lunasistemasolarLogic.getTodosLunaSistemaSolars(finalQueryGlobal,pagination);
					
					//lunasistemasolarLogic.getTodosLunaSistemaSolarsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(lunasistemasolarLogic.getLunaSistemaSolars()==null|| lunasistemasolarLogic.getLunaSistemaSolars().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							lunasistemasolarsAux= new ArrayList<LunaSistemaSolar>();
							lunasistemasolarsAux.addAll(lunasistemasolarLogic.getLunaSistemaSolars());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lunasistemasolarsAux= new ArrayList<LunaSistemaSolar>();
							lunasistemasolarsAux.addAll(lunasistemasolars);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							lunasistemasolarLogic.getTodosLunaSistemaSolars(finalQueryGlobal+"",this.pagination);												
							
							//lunasistemasolarLogic.getTodosLunaSistemaSolarsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteLunaSistemaSolars("Todos",lunasistemasolarLogic.getLunaSistemaSolars() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							lunasistemasolarLogic.setLunaSistemaSolars(new ArrayList<LunaSistemaSolar>());					
							lunasistemasolarLogic.getLunaSistemaSolars().addAll(lunasistemasolarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lunasistemasolars=new ArrayList<LunaSistemaSolar>();
							lunasistemasolars.addAll(lunasistemasolarsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idLunaSistemaSolar=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idLunaSistemaSolar=this.idActual;
				
				} else if(this.idLunaSistemaSolarActual!=null && this.idLunaSistemaSolarActual!=0L) {
					idLunaSistemaSolar=idLunaSistemaSolarActual;
				}
				
					
				this.sDetalleReporte=LunaSistemaSolarConstantesFunciones.getDetalleIndicePorId(idLunaSistemaSolar);
				
				this.lunasistemasolars=new ArrayList<LunaSistemaSolar>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					lunasistemasolarLogic.getEntity(idLunaSistemaSolar);
					
					//lunasistemasolarLogic.getEntityWithConnection(idLunaSistemaSolar);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lunasistemasolarLogic.setLunaSistemaSolars(new ArrayList<LunaSistemaSolar>());
					lunasistemasolarLogic.getLunaSistemaSolars().add(lunasistemasolarLogic.getLunaSistemaSolar());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.lunasistemasolars=new ArrayList<LunaSistemaSolar>();
					this.lunasistemasolars.add(lunasistemasolar);
				}
				
				if(lunasistemasolarLogic.getLunaSistemaSolar()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdTipoValoracion")) {
				this.sDetalleReporte=LunaSistemaSolarConstantesFunciones.getDetalleIndiceFK_IdTipoValoracion(id_tipo_valoracionFK_IdTipoValoracion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					lunasistemasolarLogic.getLunaSistemaSolarsFK_IdTipoValoracion(finalQueryGlobal,pagination,id_tipo_valoracionFK_IdTipoValoracion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LunaSistemaSolarConstantesFunciones.getDetalleIndiceFK_IdTipoValoracion(id_tipo_valoracionFK_IdTipoValoracion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LunaSistemaSolarConstantesFunciones.getDetalleIndiceFK_IdTipoValoracion(id_tipo_valoracionFK_IdTipoValoracion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=lunasistemasolarLogic.getLunaSistemaSolars()==null||lunasistemasolarLogic.getLunaSistemaSolars().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=lunasistemasolars==null|| lunasistemasolars.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						lunasistemasolarsAux=new ArrayList<LunaSistemaSolar>();
						lunasistemasolarsAux.addAll(lunasistemasolarLogic.getLunaSistemaSolars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lunasistemasolarsAux=new ArrayList<LunaSistemaSolar>();
							lunasistemasolarsAux.addAll(lunasistemasolars);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							lunasistemasolarLogic.getLunaSistemaSolarsFK_IdTipoValoracion(finalQueryGlobal,pagination,id_tipo_valoracionFK_IdTipoValoracion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LunaSistemaSolarConstantesFunciones.getDetalleIndiceFK_IdTipoValoracion(id_tipo_valoracionFK_IdTipoValoracion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LunaSistemaSolarConstantesFunciones.getDetalleIndiceFK_IdTipoValoracion(id_tipo_valoracionFK_IdTipoValoracion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLunaSistemaSolars("FK_IdTipoValoracion",lunasistemasolarLogic.getLunaSistemaSolars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLunaSistemaSolars("FK_IdTipoValoracion",lunasistemasolars);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						lunasistemasolarLogic.setLunaSistemaSolars(new ArrayList<LunaSistemaSolar>());
						lunasistemasolarLogic.getLunaSistemaSolars().addAll(lunasistemasolarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lunasistemasolars=new ArrayList<LunaSistemaSolar>();
							lunasistemasolars.addAll(lunasistemasolarsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesLunaSistemaSolar();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessLunaSistemaSolar();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=lunasistemasolarLogic.getLunaSistemaSolars().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=lunasistemasolars.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=lunasistemasolarLogic.getLunaSistemaSolars().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=lunasistemasolars.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(LunaSistemaSolar lunasistemasolar) {
		Boolean permite=true;
		
		if(this.lunasistemasolar.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=LunaSistemaSolarConstantesFunciones.getOrderByListaLunaSistemaSolar();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=LunaSistemaSolarConstantesFunciones.getOrderByListaLunaSistemaSolar();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LunaSistemaSolar lunasistemasolar:lunasistemasolarLogic.getLunaSistemaSolars()) {
				if(lunasistemasolar.getsType().equals(Constantes2.S_TOTALES)) {
					lunasistemasolarTotales=lunasistemasolar;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LunaSistemaSolar lunasistemasolar:this.lunasistemasolars) {
				if(lunasistemasolar.getsType().equals(Constantes2.S_TOTALES)) {
					lunasistemasolarTotales=lunasistemasolar;
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
			this.lunasistemasolarAux=new LunaSistemaSolar();
			this.lunasistemasolarAux.setsType(Constantes2.S_TOTALES);
			this.lunasistemasolarAux.setIsNew(false);
			this.lunasistemasolarAux.setIsChanged(false);
			this.lunasistemasolarAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				LunaSistemaSolarConstantesFunciones.TotalizarValoresFilaLunaSistemaSolar(this.lunasistemasolarLogic.getLunaSistemaSolars(),this.lunasistemasolarAux);
				
				this.lunasistemasolarLogic.getLunaSistemaSolars().add(this.lunasistemasolarAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				LunaSistemaSolarConstantesFunciones.TotalizarValoresFilaLunaSistemaSolar(this.lunasistemasolars,this.lunasistemasolarAux);
				
				this.lunasistemasolars.add(this.lunasistemasolarAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		lunasistemasolarTotales=new LunaSistemaSolar();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.lunasistemasolarLogic.getLunaSistemaSolars().remove(lunasistemasolarTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.lunasistemasolars.remove(lunasistemasolarTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		lunasistemasolarTotales=new LunaSistemaSolar();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LunaSistemaSolar lunasistemasolar:lunasistemasolarLogic.getLunaSistemaSolars()) {
				if(lunasistemasolar.getsType().equals(Constantes2.S_TOTALES)) {
					lunasistemasolarTotales=lunasistemasolar;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				LunaSistemaSolarConstantesFunciones.TotalizarValoresFilaLunaSistemaSolar(this.lunasistemasolarLogic.getLunaSistemaSolars(),lunasistemasolarTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LunaSistemaSolar lunasistemasolar:this.lunasistemasolars) {
				if(lunasistemasolar.getsType().equals(Constantes2.S_TOTALES)) {
					lunasistemasolarTotales=lunasistemasolar;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				LunaSistemaSolarConstantesFunciones.TotalizarValoresFilaLunaSistemaSolar(this.lunasistemasolars,lunasistemasolarTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getLunaSistemaSolarsFK_IdTipoValoracion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoValoracion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getLunaSistemaSolarsFK_IdTipoValoracion(String sFinalQuery,Long id_tipo_valoracion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lunasistemasolarLogic.getLunaSistemaSolarsFK_IdTipoValoracion(sFinalQuery,this.pagination,id_tipo_valoracion);
				
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
	
	public void inicializarPermisosLunaSistemaSolar() {
		this.isPermisoTodoLunaSistemaSolar=false;
		this.isPermisoNuevoLunaSistemaSolar=false;
		this.isPermisoActualizarLunaSistemaSolar=false;
		this.isPermisoActualizarOriginalLunaSistemaSolar=false;
		this.isPermisoEliminarLunaSistemaSolar=false;
		this.isPermisoGuardarCambiosLunaSistemaSolar=false;
		this.isPermisoConsultaLunaSistemaSolar=false;
		this.isPermisoBusquedaLunaSistemaSolar=false;
		this.isPermisoReporteLunaSistemaSolar=false;		
		this.isPermisoOrdenLunaSistemaSolar=false;		
		this.isPermisoPaginacionMedioLunaSistemaSolar=false;		
		this.isPermisoPaginacionAltoLunaSistemaSolar=false;
		this.isPermisoPaginacionTodoLunaSistemaSolar=false;
		this.isPermisoCopiarLunaSistemaSolar=false;		
		this.isPermisoVerFormLunaSistemaSolar=false;		
		this.isPermisoDuplicarLunaSistemaSolar=false;		
		this.isPermisoOrdenLunaSistemaSolar=false;		
	}
	
	public void setPermisosUsuarioLunaSistemaSolar(Boolean isPermiso) {
		this.isPermisoTodoLunaSistemaSolar=isPermiso;
		this.isPermisoNuevoLunaSistemaSolar=isPermiso;
		this.isPermisoActualizarLunaSistemaSolar=isPermiso;
		this.isPermisoActualizarOriginalLunaSistemaSolar=isPermiso;
		this.isPermisoEliminarLunaSistemaSolar=isPermiso;
		this.isPermisoGuardarCambiosLunaSistemaSolar=isPermiso;
		this.isPermisoConsultaLunaSistemaSolar=isPermiso;
		this.isPermisoBusquedaLunaSistemaSolar=isPermiso;
		this.isPermisoReporteLunaSistemaSolar=isPermiso;
		this.isPermisoOrdenLunaSistemaSolar=isPermiso;		
		this.isPermisoPaginacionMedioLunaSistemaSolar=isPermiso;		
		this.isPermisoPaginacionAltoLunaSistemaSolar=isPermiso;		
		this.isPermisoPaginacionTodoLunaSistemaSolar=isPermiso;		
		this.isPermisoCopiarLunaSistemaSolar=isPermiso;		
		this.isPermisoVerFormLunaSistemaSolar=isPermiso;		
		this.isPermisoDuplicarLunaSistemaSolar=isPermiso;
		this.isPermisoOrdenLunaSistemaSolar=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioLunaSistemaSolar(Boolean isPermiso) {
		//this.isPermisoTodoLunaSistemaSolar=isPermiso;
		this.isPermisoNuevoLunaSistemaSolar=isPermiso;
		this.isPermisoActualizarLunaSistemaSolar=isPermiso;
		this.isPermisoActualizarOriginalLunaSistemaSolar=isPermiso;
		this.isPermisoEliminarLunaSistemaSolar=isPermiso;
		this.isPermisoGuardarCambiosLunaSistemaSolar=isPermiso;
		//this.isPermisoConsultaLunaSistemaSolar=isPermiso;
		//this.isPermisoBusquedaLunaSistemaSolar=isPermiso;
		//this.isPermisoReporteLunaSistemaSolar=isPermiso;
		//this.isPermisoOrdenLunaSistemaSolar=isPermiso;		
		//this.isPermisoPaginacionMedioLunaSistemaSolar=isPermiso;		
		//this.isPermisoPaginacionAltoLunaSistemaSolar=isPermiso;		
		//this.isPermisoPaginacionTodoLunaSistemaSolar=isPermiso;		
		//this.isPermisoCopiarLunaSistemaSolar=isPermiso;		
		//this.isPermisoDuplicarLunaSistemaSolar=isPermiso;
		//this.isPermisoOrdenLunaSistemaSolar=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioLunaSistemaSolarClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(LunaSistemaSolarJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebLunaSistemaSolar(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioLunaSistemaSolarClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioLunaSistemaSolarClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionLunaSistemaSolarClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioLunaSistemaSolarClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioLunaSistemaSolar() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(LunaSistemaSolarJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, LunaSistemaSolarConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoLunaSistemaSolar=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarLunaSistemaSolar=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalLunaSistemaSolar=this.isPermisoActualizarLunaSistemaSolar;
			this.isPermisoEliminarLunaSistemaSolar=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosLunaSistemaSolar=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaLunaSistemaSolar=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaLunaSistemaSolar=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoLunaSistemaSolar=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteLunaSistemaSolar=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenLunaSistemaSolar=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioLunaSistemaSolar=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoLunaSistemaSolar=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoLunaSistemaSolar=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarLunaSistemaSolar=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormLunaSistemaSolar=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarLunaSistemaSolar=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenLunaSistemaSolar=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosLunaSistemaSolar.setToolTipText(this.jTableDatosLunaSistemaSolar.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioLunaSistemaSolar(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioLunaSistemaSolar(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(LunaSistemaSolarJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(LunaSistemaSolarJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioLunaSistemaSolar() throws Exception {
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
	public void inicializarCombosForeignKeyLunaSistemaSolarListas()throws Exception {
		try	{						
			
				this.tipovaloracionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyLunaSistemaSolarListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(LunaSistemaSolarJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyLunaSistemaSolarListas(false);
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
	
	public void cargarCombosLoteForeignKeyLunaSistemaSolarListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			LunaSistemaSolarParameterReturnGeneral lunasistemasolarReturnGeneral=new LunaSistemaSolarParameterReturnGeneral();
						
			


				String finalQueryGlobalTipoValoracion="";

				if(((this.tipovaloracionsForeignKey==null||this.tipovaloracionsForeignKey.size()<=0) && this.lunasistemasolarConstantesFunciones.cargarid_tipo_valoracionLunaSistemaSolar)
					 || (this.esRecargarFks && this.lunasistemasolarConstantesFunciones.cargarid_tipo_valoracionLunaSistemaSolar)) {

					if(!this.lunasistemasolarSessionBean.getisBusquedaDesdeForeignKeySesionTipoValoracion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoValoracionConstantesFunciones.getArrayColumnasGlobalesTipoValoracion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoValoracion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoValoracionConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoValoracion=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoValoracion, "");
						finalQueryGlobalTipoValoracion+=TipoValoracionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoValoracionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoValoracion=" WHERE " + ConstantesSql.ID + "="+lunasistemasolarSessionBean.getlidTipoValoracionActual();
					}
				} else {
					finalQueryGlobalTipoValoracion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				lunasistemasolarReturnGeneral=lunasistemasolarLogic.cargarCombosLoteForeignKeyLunaSistemaSolar(finalQueryGlobalTipoValoracion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalTipoValoracion.equals("NONE")) {
				this.tipovaloracionsForeignKey=lunasistemasolarReturnGeneral.gettipovaloracionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyLunaSistemaSolar()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyTipoValoracion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyTipoValoracion()throws Exception {
		try {
			if(this.lunasistemasolarSessionBean==null) {
				this.lunasistemasolarSessionBean=new LunaSistemaSolarSessionBean();
			}

			if(!this.lunasistemasolarSessionBean.getisBusquedaDesdeForeignKeySesionTipoValoracion()) {
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
	
	public void initActionsCombosTodosForeignKeyLunaSistemaSolar()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyLunaSistemaSolar(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyLunaSistemaSolar()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyLunaSistemaSolar();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyLunaSistemaSolar(LunaSistemaSolar lunasistemasolar)throws Exception {	
		try {
			
			this.setActualTipoValoracionForeignKey(lunasistemasolar.getid_tipo_valoracion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyLunaSistemaSolar(LunaSistemaSolar lunasistemasolar,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyLunaSistemaSolar()throws Exception {	
		try {
			
			this.setActualTipoValoracionForeignKey(this.lunasistemasolarConstantesFunciones.getid_tipo_valoracion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyLunaSistemaSolar()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyLunaSistemaSolar()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyLunaSistemaSolar()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroLunaSistemaSolar()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyLunaSistemaSolar()throws Exception {
		try {
			

			this.cargarCombosFrameTipoValoracionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyLunaSistemaSolar(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameTipoValoracionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyLunaSistemaSolar()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxid_tipo_valoracionLunaSistemaSolar!=null && this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxid_tipo_valoracionLunaSistemaSolar.getItemCount()>0) {
				this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxid_tipo_valoracionLunaSistemaSolar.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public LunaSistemaSolarBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public LunaSistemaSolarBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public LunaSistemaSolarBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.lunasistemasolarSessionBean=new LunaSistemaSolarSessionBean(); 
		this.lunasistemasolarConstantesFunciones=new LunaSistemaSolarConstantesFunciones(); 
		this.lunasistemasolarBean=new LunaSistemaSolar();//(this.lunasistemasolarConstantesFunciones); 		
		this.lunasistemasolarReturnGeneral=new LunaSistemaSolarParameterReturnGeneral(); 
		
		this.lunasistemasolarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.lunasistemasolarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public LunaSistemaSolarBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public LunaSistemaSolarBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public LunaSistemaSolarBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessLunaSistemaSolar(true);
			
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
			
			this.lunasistemasolarConstantesFunciones=new LunaSistemaSolarConstantesFunciones(); 
			this.lunasistemasolarBean=new LunaSistemaSolar();//this.lunasistemasolarConstantesFunciones); 			
			this.lunasistemasolarReturnGeneral=new LunaSistemaSolarParameterReturnGeneral(); 
		
			LunaSistemaSolarBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Luna Sistema Solar Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.lunasistemasolar=new LunaSistemaSolar();
			this.lunasistemasolars = new ArrayList<LunaSistemaSolar>();
			this.lunasistemasolarsAux = new ArrayList<LunaSistemaSolar>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic=new LunaSistemaSolarLogic();
				this.lunasistemasolarLogic.getNewConnexionToDeep("");
			}
			
			//this.lunasistemasolarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.lunasistemasolarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormLunaSistemaSolar);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoLunaSistemaSolar!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoLunaSistemaSolar);	
					}
					
					if(this.jInternalFrameImportacionLunaSistemaSolar!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionLunaSistemaSolar);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByLunaSistemaSolar!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByLunaSistemaSolar);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormLunaSistemaSolar);
				this.jInternalFrameDetalleFormLunaSistemaSolar.setVisible(false);
				this.jInternalFrameDetalleFormLunaSistemaSolar.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoLunaSistemaSolar!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoLunaSistemaSolar);
					this.jInternalFrameReporteDinamicoLunaSistemaSolar.setVisible(false);
					this.jInternalFrameReporteDinamicoLunaSistemaSolar.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionLunaSistemaSolar!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionLunaSistemaSolar);
					this.jInternalFrameImportacionLunaSistemaSolar.setVisible(false);
					this.jInternalFrameImportacionLunaSistemaSolar.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByLunaSistemaSolar!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByLunaSistemaSolar);
					this.jInternalFrameOrderByLunaSistemaSolar.setVisible(false);
					this.jInternalFrameOrderByLunaSistemaSolar.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idLunaSistemaSolarActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=LunaSistemaSolarConstantesFunciones.INUMEROPAGINACION;
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
			
			this.lunasistemasolarReturnGeneral=new LunaSistemaSolarParameterReturnGeneral();
			
			this.lunasistemasolarParameterGeneral=new LunaSistemaSolarParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.lunasistemasolarLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
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
			
			if(LunaSistemaSolarJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,LunaSistemaSolarConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.lunasistemasolarSessionBean.getEsGuardarRelacionado(),this.lunasistemasolarSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,LunaSistemaSolarConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.lunasistemasolarSessionBean.getEsGuardarRelacionado(),this.lunasistemasolarSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoLunaSistemaSolar=false;
			this.isVisibilidadCeldaDuplicarLunaSistemaSolar=true;
			this.isVisibilidadCeldaCopiarLunaSistemaSolar=true;
			this.isVisibilidadCeldaVerFormLunaSistemaSolar=true;
			this.isVisibilidadCeldaOrdenLunaSistemaSolar=true;
			this.isVisibilidadCeldaNuevoRelacionesLunaSistemaSolar=false;
			this.isVisibilidadCeldaModificarLunaSistemaSolar=false;
			this.isVisibilidadCeldaActualizarLunaSistemaSolar=false;
			this.isVisibilidadCeldaEliminarLunaSistemaSolar=false;
			this.isVisibilidadCeldaCancelarLunaSistemaSolar=false;
			this.isVisibilidadCeldaGuardarLunaSistemaSolar=false;
			this.isVisibilidadCeldaGuardarCambiosLunaSistemaSolar=false;
			
			
			this.isVisibilidadFK_IdTipoValoracion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesLunaSistemaSolar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosLunaSistemaSolar();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioLunaSistemaSolar(false);
			
			this.setPermisosUsuarioLunaSistemaSolar();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.lunasistemasolarSessionBean.getEsGuardarRelacionado() 
				|| (this.lunasistemasolarSessionBean.getEsGuardarRelacionado() && this.lunasistemasolarSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioLunaSistemaSolarClasesRelacionadas();
			}
			
			if(this.lunasistemasolarSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioLunaSistemaSolarClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosLunaSistemaSolar();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualLunaSistemaSolar();
			}
			
			if(!this.isPermisoBusquedaLunaSistemaSolar) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasLunaSistemaSolar.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioLunaSistemaSolar,this.isPermisoPaginacionMedioLunaSistemaSolar,this.isPermisoPaginacionTodoLunaSistemaSolar);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(LunaSistemaSolarConstantesFunciones.getTiposSeleccionarLunaSistemaSolar());
				
				this.tiposColumnasSelect=LunaSistemaSolarConstantesFunciones.getTiposSeleccionarLunaSistemaSolar(true);
				
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
			//if(!this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioLunaSistemaSolar();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioLunaSistemaSolar(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioLunaSistemaSolar(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesLunaSistemaSolar() ;
			
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
				lunasistemasolarImplementable= (LunaSistemaSolarImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+LunaSistemaSolarConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				lunasistemasolarImplementableHome= (LunaSistemaSolarImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+LunaSistemaSolarConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.lunasistemasolars= new ArrayList<LunaSistemaSolar>();
			this.lunasistemasolarsEliminados= new ArrayList<LunaSistemaSolar>();
						
			this.isEsNuevoLunaSistemaSolar=false;
			this.esParaAccionDesdeFormularioLunaSistemaSolar=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.tipovaloracionsForeignKey=new ArrayList<TipoValoracion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyLunaSistemaSolar(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroLunaSistemaSolar();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			LunaSistemaSolarBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=LunaSistemaSolarConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesLunaSistemaSolar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingLunaSistemaSolar(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioLunaSistemaSolar();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioLunaSistemaSolar();
			}
			
			LunaSistemaSolarBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasLunaSistemaSolar.getTabCount(); i++) {
					this.jTabbedPaneBusquedasLunaSistemaSolar.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasLunaSistemaSolar.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessLunaSistemaSolar(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga LunaSistemaSolar: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectLunaSistemaSolar() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesLunaSistemaSolar")) {
				iIndex=this.jInternalFrameDetalleFormLunaSistemaSolar.jTabbedPaneRelacionesLunaSistemaSolar.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormLunaSistemaSolar.jTabbedPaneRelacionesLunaSistemaSolar.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosLunaSistemaSolar.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessLunaSistemaSolar();	
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
	
	public void cargarCombosForeignKeyLunaSistemaSolar(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyLunaSistemaSolar(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyLunaSistemaSolar(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyLunaSistemaSolarListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyLunaSistemaSolar();
		
		this.cargarCombosFrameForeignKeyLunaSistemaSolar();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyLunaSistemaSolar();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyLunaSistemaSolar();
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
	
	public void jButtonNuevoLunaSistemaSolarActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.lunasistemasolarSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormLunaSistemaSolar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
			
			
			if(jTableDatosLunaSistemaSolar.getRowCount()>=1) {
				jTableDatosLunaSistemaSolar.removeRowSelectionInterval(0, jTableDatosLunaSistemaSolar.getRowCount()-1);						
			}
			
			this.isEsNuevoLunaSistemaSolar=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoLunaSistemaSolar(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesLunaSistemaSolar(true);			
			//this.lunasistemasolar=new LunaSistemaSolar();
			//this.lunasistemasolar.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesLunaSistemaSolar(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLunaSistemaSolar() ;
			
			if(LunaSistemaSolarJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleLunaSistemaSolar(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.lunasistemasolar);	
			this.actualizarInformacion("INFO_PADRE",false,this.lunasistemasolar);				
			
			LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
			
			if(this.lunasistemasolarSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar LunaSistemaSolar: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarLunaSistemaSolarActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<LunaSistemaSolar> lunasistemasolarsSeleccionados=new ArrayList<LunaSistemaSolar>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosLunaSistemaSolar.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosLunaSistemaSolar.getSelectedRows().length;			
			}
			
			lunasistemasolarsSeleccionados=this.getLunaSistemaSolarsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoLunaSistemaSolar--;			
				//LunaSistemaSolar lunasistemasolarAux= new LunaSistemaSolar();			
				//lunasistemasolarAux.setId(this.iIdNuevoLunaSistemaSolar);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//LunaSistemaSolar lunasistemasolarOrigen=new LunaSistemaSolar();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(LunaSistemaSolar lunasistemasolarOrigen : lunasistemasolarsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosLunaSistemaSolar.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							lunasistemasolarOrigen =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lunasistemasolarOrigen =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaLunaSistemaSolar();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.lunasistemasolar.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosLunaSistemaSolar(lunasistemasolarOrigen,this.lunasistemasolar,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysLunaSistemaSolar(this.lunasistemasolar);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.lunasistemasolarLogic.getLunaSistemaSolars().add(this.lunasistemasolarAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.lunasistemasolars.add(this.lunasistemasolarAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaLunaSistemaSolar(false);
				
				this.jTableDatosLunaSistemaSolar.setRowSelectionInterval(this.getIndiceNuevoLunaSistemaSolar(), this.getIndiceNuevoLunaSistemaSolar());
				
				int iLastRow =  this.jTableDatosLunaSistemaSolar.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosLunaSistemaSolar.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosLunaSistemaSolar.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaLunaSistemaSolar(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarLunaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<LunaSistemaSolar> lunasistemasolarsSeleccionados=new ArrayList<LunaSistemaSolar>();									
		
			LunaSistemaSolar lunasistemasolarOrigen=new LunaSistemaSolar();
			LunaSistemaSolar lunasistemasolarDestino=new LunaSistemaSolar();
				
			lunasistemasolarsSeleccionados=this.getLunaSistemaSolarsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosLunaSistemaSolar.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || lunasistemasolarsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosLunaSistemaSolar.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lunasistemasolarOrigen =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						lunasistemasolarOrigen =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lunasistemasolarDestino =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						lunasistemasolarDestino =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				lunasistemasolarOrigen =lunasistemasolarsSeleccionados.get(0);
				lunasistemasolarDestino =lunasistemasolarsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosLunaSistemaSolar(lunasistemasolarOrigen,lunasistemasolarDestino,true,false);
				
				lunasistemasolarDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(lunasistemasolarDestino,lunasistemasolarLogic.getLunaSistemaSolars());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(lunasistemasolarDestino,lunasistemasolars);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaLunaSistemaSolar(false);
				
				//this.jTableDatosLunaSistemaSolar.setRowSelectionInterval(this.getIndiceNuevoLunaSistemaSolar(), this.getIndiceNuevoLunaSistemaSolar());
				
				int iLastRow =  this.jTableDatosLunaSistemaSolar.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosLunaSistemaSolar.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosLunaSistemaSolar.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaLunaSistemaSolar(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormLunaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormLunaSistemaSolar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormLunaSistemaSolar.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarLunaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesLunaSistemaSolar.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasLunaSistemaSolar.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesLunaSistemaSolar.setVisible(!isVisible);
			this.jPanelPaginacionLunaSistemaSolar.setVisible(!isVisible);
			this.jPanelAccionesLunaSistemaSolar.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarLunaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameLunaSistemaSolar();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoLunaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoLunaSistemaSolar();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionLunaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionLunaSistemaSolar();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByLunaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByLunaSistemaSolar();
			
			this.abrirFrameOrderByLunaSistemaSolar();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByLunaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByLunaSistemaSolar();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleLunaSistemaSolar(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormLunaSistemaSolar);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormLunaSistemaSolar.isMaximum()) {
					this.jInternalFrameDetalleFormLunaSistemaSolar.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormLunaSistemaSolar.setSize(this.jInternalFrameDetalleFormLunaSistemaSolar.iWidthFormulario,this.jInternalFrameDetalleFormLunaSistemaSolar.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormLunaSistemaSolar.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormLunaSistemaSolar.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormLunaSistemaSolar.isMaximum()) {
						this.jInternalFrameDetalleFormLunaSistemaSolar.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormLunaSistemaSolar.jContentPaneDetalleLunaSistemaSolar.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormLunaSistemaSolar.jTabbedPaneRelacionesLunaSistemaSolar.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormLunaSistemaSolar.jContentPaneDetalleLunaSistemaSolar.getWidth(),LunaSistemaSolarConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormLunaSistemaSolar.jTabbedPaneRelacionesLunaSistemaSolar.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormLunaSistemaSolar.jContentPaneDetalleLunaSistemaSolar.getWidth(),LunaSistemaSolarConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormLunaSistemaSolar.jTabbedPaneRelacionesLunaSistemaSolar.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormLunaSistemaSolar.jContentPaneDetalleLunaSistemaSolar.getWidth(),LunaSistemaSolarConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormLunaSistemaSolar.setVisible(true);
	        this.jInternalFrameDetalleFormLunaSistemaSolar.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByLunaSistemaSolar() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByLunaSistemaSolar==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByLunaSistemaSolar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLunaSistemaSolar,false,this);
				} else {
					this.jInternalFrameOrderByLunaSistemaSolar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLunaSistemaSolar,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByLunaSistemaSolar);
				this.jInternalFrameOrderByLunaSistemaSolar.setVisible(false);
				this.jInternalFrameOrderByLunaSistemaSolar.setSelected(false);
				
				this.jInternalFrameOrderByLunaSistemaSolar.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByLunaSistemaSolar"));
				
				this.inicializarActualizarBindingTablaOrderByLunaSistemaSolar();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionLunaSistemaSolar() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionLunaSistemaSolar==null) {
				
				this.jInternalFrameImportacionLunaSistemaSolar=new ImportacionJInternalFrame(LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionLunaSistemaSolar);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionLunaSistemaSolar);
				this.jInternalFrameImportacionLunaSistemaSolar.setVisible(false);
				this.jInternalFrameImportacionLunaSistemaSolar.setSelected(false);


				this.jInternalFrameImportacionLunaSistemaSolar.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionLunaSistemaSolar"));
				this.jInternalFrameImportacionLunaSistemaSolar.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionLunaSistemaSolar"));
				this.jInternalFrameImportacionLunaSistemaSolar.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionLunaSistemaSolar"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoLunaSistemaSolar() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoLunaSistemaSolar==null) {
				this.jInternalFrameReporteDinamicoLunaSistemaSolar=new ReporteDinamicoJInternalFrame(LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoLunaSistemaSolar);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoLunaSistemaSolar);
				this.jInternalFrameReporteDinamicoLunaSistemaSolar.setVisible(false);
				this.jInternalFrameReporteDinamicoLunaSistemaSolar.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoLunaSistemaSolar"));
				this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoLunaSistemaSolar"));
				this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoLunaSistemaSolar"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualLunaSistemaSolar();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleLunaSistemaSolar() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormLunaSistemaSolar);
			
	       	this.jInternalFrameDetalleFormLunaSistemaSolar.setVisible(false);
	        this.jInternalFrameDetalleFormLunaSistemaSolar.setSelected(false);
			
			//this.jInternalFrameDetalleFormLunaSistemaSolar.dispose();
			//this.jInternalFrameDetalleFormLunaSistemaSolar=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoLunaSistemaSolar() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoLunaSistemaSolar.setVisible(true);
	        this.jInternalFrameReporteDinamicoLunaSistemaSolar.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionLunaSistemaSolar() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionLunaSistemaSolar.setVisible(true);
	        this.jInternalFrameImportacionLunaSistemaSolar.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByLunaSistemaSolar() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByLunaSistemaSolar.setVisible(true);
	        this.jInternalFrameOrderByLunaSistemaSolar.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByLunaSistemaSolar() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByLunaSistemaSolar.setVisible(false);
	        this.jInternalFrameOrderByLunaSistemaSolar.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoLunaSistemaSolar() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoLunaSistemaSolar.setVisible(false);
	        this.jInternalFrameReporteDinamicoLunaSistemaSolar.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionLunaSistemaSolar() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionLunaSistemaSolar.setVisible(false);
	        this.jInternalFrameImportacionLunaSistemaSolar.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarLunaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarLunaSistemaSolar(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarLunaSistemaSolar(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosLunaSistemaSolar.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesLunaSistemaSolar(true);
			//this.isEsNuevoLunaSistemaSolar=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesLunaSistemaSolar("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesLunaSistemaSolar(false) ;
			
			if(lunasistemasolarSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(LunaSistemaSolarJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleLunaSistemaSolar(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLunaSistemaSolar(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaLunaSistemaSolarActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosLunaSistemaSolar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarLunaSistemaSolar(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormLunaSistemaSolar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosLunaSistemaSolar.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesLunaSistemaSolar(true);
			//this.isEsNuevoLunaSistemaSolar=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.lunasistemasolar.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesLunaSistemaSolar("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesLunaSistemaSolar(false) ;
			
			if(LunaSistemaSolarJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleLunaSistemaSolar(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLunaSistemaSolar(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaTipoValoracion(List<TipoValoracion> tipovaloracionsForeignKey)throws Exception{
		TableColumn tableColumnTipoValoracion=this.jTableDatosLunaSistemaSolar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLunaSistemaSolar,LunaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION));
		TableCellEditor tableCellEditorTipoValoracion =tableColumnTipoValoracion.getCellEditor();

		TipoValoracionTableCell tipovaloracionTableCellFk=(TipoValoracionTableCell)tableCellEditorTipoValoracion;

		if(tipovaloracionTableCellFk!=null) {
			tipovaloracionTableCellFk.settipovaloracionsForeignKey(tipovaloracionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosLunaSistemaSolar.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipovaloracionTableCellFk.setRowActual(intSelectedRow);
			//tipovaloracionTableCellFk.settipovaloracionsForeignKeyActual(tipovaloracionsForeignKey);
		//}


		if(tipovaloracionTableCellFk!=null) {
			tipovaloracionTableCellFk.RecargarTipoValoracionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarLunaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesLunaSistemaSolar(false);
			
			//if(!this.isEsNuevoLunaSistemaSolar) {								
				int intSelectedRow = this.jTableDatosLunaSistemaSolar.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualLunaSistemaSolar(this.lunasistemasolar,true);
				this.setVariablesFormularioToObjetoActualForeignKeysLunaSistemaSolar(this.lunasistemasolar);
				
			}
			
			if(this.permiteMantenimiento(this.lunasistemasolar)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoLunaSistemaSolar=true;
					this.inicializarActualizarBindingTablaLunaSistemaSolar(false);
					this.isEsNuevoLunaSistemaSolar=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoLunaSistemaSolar=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoLunaSistemaSolar=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesLunaSistemaSolar(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualLunaSistemaSolar(false);
				
				this.habilitarDeshabilitarControlesLunaSistemaSolar(false);
			
												
				
				if(LunaSistemaSolarJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleLunaSistemaSolar();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoLunaSistemaSolarActionPerformed(evt,lunasistemasolarSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualLunaSistemaSolar(this.lunasistemasolar,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosLunaSistemaSolar.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,lunasistemasolarSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.lunasistemasolar.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(LunaSistemaSolar.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LunaSistemaSolar.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarLunaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosLunaSistemaSolar.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				this.lunasistemasolar.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				this.lunasistemasolar.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.lunasistemasolar)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((LunaSistemaSolarModel) this.jTableDatosLunaSistemaSolar.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoLunaSistemaSolar=true;
				this.inicializarActualizarBindingTablaLunaSistemaSolar(false);
				this.isEsNuevoLunaSistemaSolar=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesLunaSistemaSolar(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualLunaSistemaSolar(false);
				
				this.habilitarDeshabilitarControlesLunaSistemaSolar(false);
				
				
				
				if(LunaSistemaSolarJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleLunaSistemaSolar();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarLunaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosLunaSistemaSolar.getRowCount()>=1) {
				jTableDatosLunaSistemaSolar.removeRowSelectionInterval(0, jTableDatosLunaSistemaSolar.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesLunaSistemaSolar(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaLunaSistemaSolar(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesLunaSistemaSolar(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLunaSistemaSolar(false) ;
			
			this.isEsNuevoLunaSistemaSolar=false;
			
			if(LunaSistemaSolarJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleLunaSistemaSolar();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosLunaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingLunaSistemaSolar(false);
				
				//SI ES MANUAL
				if(LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualLunaSistemaSolar();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosLunaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoLunaSistemaSolar--;			
			//LunaSistemaSolar lunasistemasolarAux= new LunaSistemaSolar();			
			//lunasistemasolarAux.setId(this.iIdNuevoLunaSistemaSolar);
			
			if(this.jInternalFrameDetalleFormLunaSistemaSolar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaLunaSistemaSolar();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysLunaSistemaSolar(this.lunasistemasolar);
			
			this.lunasistemasolar.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.lunasistemasolarLogic.getLunaSistemaSolars().add(this.lunasistemasolarAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.lunasistemasolars.add(this.lunasistemasolarAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaLunaSistemaSolar(false);
			
			this.jTableDatosLunaSistemaSolar.setRowSelectionInterval(this.getIndiceNuevoLunaSistemaSolar(), this.getIndiceNuevoLunaSistemaSolar());
			
			int iLastRow =  this.jTableDatosLunaSistemaSolar.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosLunaSistemaSolar.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosLunaSistemaSolar.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaLunaSistemaSolar(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionLunaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingLunaSistemaSolar(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLunaSistemaSolar(false);
			
			//SI ES MANUAL
			if(LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualLunaSistemaSolar();
			}
			
			//this.abrirFrameTreeLunaSistemaSolar();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionLunaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Luna Sistema SolarES ?", "MANTENIMIENTO DE Luna Sistema Solar", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionLunaSistemaSolar.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralLunaSistemaSolar();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.lunasistemasolarReturnGeneral=lunasistemasolarLogic.procesarImportacionLunaSistemaSolarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.lunasistemasolarParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarLunaSistemaSolarReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionLunaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionLunaSistemaSolar.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionLunaSistemaSolar.setFileImportacion(this.jInternalFrameImportacionLunaSistemaSolar.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionLunaSistemaSolar.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionLunaSistemaSolar.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionLunaSistemaSolar.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionLunaSistemaSolar.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoLunaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<LunaSistemaSolar> lunasistemasolarsSeleccionados=new ArrayList<LunaSistemaSolar>();		

		lunasistemasolarsSeleccionados=this.getLunaSistemaSolarsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("LunaSistemaSolarBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"LunaSistemaSolarBaseDesign.jrxml";
			
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
			
			this.generarReporteLunaSistemaSolars("Todos",lunasistemasolarsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Luna Sistema Solar",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case LunaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoValoracion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoValoracion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoValoracion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoValoracion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LunaSistemaSolarConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LunaSistemaSolarConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LunaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case LunaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION:
					sNombreCampoCategoria="id_tipo_valoracion";
					break;

				case LunaSistemaSolarConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case LunaSistemaSolarConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case LunaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case LunaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION:
					sNombreCampoCategoriaValor="id_tipo_valoracion";
					break;

				case LunaSistemaSolarConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case LunaSistemaSolarConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case LunaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case LunaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Idtipo Valoracion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_valoracion");
					break;

				case LunaSistemaSolarConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case LunaSistemaSolarConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case LunaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoLunaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<LunaSistemaSolar> lunasistemasolarsSeleccionados=new ArrayList<LunaSistemaSolar>();		
		
		lunasistemasolarsSeleccionados=this.getLunaSistemaSolarsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lunasistemasolar";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("LunaSistemaSolars");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case LunaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LunaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION);
					iRow++;

					for(LunaSistemaSolar lunasistemasolar:lunasistemasolarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(lunasistemasolar.gettipovaloracion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LunaSistemaSolarConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LunaSistemaSolarConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(LunaSistemaSolar lunasistemasolar:lunasistemasolarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(lunasistemasolar.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LunaSistemaSolarConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LunaSistemaSolarConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(LunaSistemaSolar lunasistemasolar:lunasistemasolarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(lunasistemasolar.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LunaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LunaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(LunaSistemaSolar lunasistemasolar:lunasistemasolarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(lunasistemasolar.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelLunaSistemaSolar(row);				
			//	iRow++;
			//}				
			
			//for(LunaSistemaSolar lunasistemasolarAux:lunasistemasolarsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelLunaSistemaSolar(lunasistemasolarAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Luna Sistema Solar",JOptionPane.INFORMATION_MESSAGE);
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
				this.lunasistemasolarLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLunaSistemaSolar(false);
			
			//SI ES MANUAL
			if(LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualLunaSistemaSolar();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresLunaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLunaSistemaSolar(false);
			
			//SI ES MANUAL
			if(LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualLunaSistemaSolar();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesLunaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLunaSistemaSolar(false);
			
			//SI ES MANUAL
			if(LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualLunaSistemaSolar();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaLunaSistemaSolar() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosLunaSistemaSolar.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosLunaSistemaSolar.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosLunaSistemaSolar.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosLunaSistemaSolar.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosLunaSistemaSolar.setMinimumSize(dimensionMinimum);
		this.jTableDatosLunaSistemaSolar.setMaximumSize(dimensionMaximum);
		this.jTableDatosLunaSistemaSolar.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingLunaSistemaSolar(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingLunaSistemaSolar(esInicializar,true);
	}
	
	public void inicializarActualizarBindingLunaSistemaSolar(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaLunaSistemaSolar(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesLunaSistemaSolar(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasLunaSistemaSolar(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesLunaSistemaSolar(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesLunaSistemaSolar(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualLunaSistemaSolar() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaLunaSistemaSolar();
		
		this.inicializarActualizarBindingBotonesManualLunaSistemaSolar(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualLunaSistemaSolar();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesLunaSistemaSolar() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualLunaSistemaSolar(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualLunaSistemaSolar(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosLunaSistemaSolar.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosLunaSistemaSolar.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteLunaSistemaSolar.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormLunaSistemaSolar.jCheckBoxPostAccionNuevoLunaSistemaSolar.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormLunaSistemaSolar.jCheckBoxPostAccionSinCerrarLunaSistemaSolar.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormLunaSistemaSolar.jCheckBoxPostAccionSinMensajeLunaSistemaSolar.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosLunaSistemaSolar.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosLunaSistemaSolar.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteLunaSistemaSolar.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {
				this.jInternalFrameDetalleFormLunaSistemaSolar.jCheckBoxPostAccionNuevoLunaSistemaSolar.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormLunaSistemaSolar.jCheckBoxPostAccionSinCerrarLunaSistemaSolar.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormLunaSistemaSolar.jCheckBoxPostAccionSinMensajeLunaSistemaSolar.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionLunaSistemaSolar.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionLunaSistemaSolar.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxTiposAccionesFormularioLunaSistemaSolar.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesLunaSistemaSolar.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoLunaSistemaSolar!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesLunaSistemaSolar.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesLunaSistemaSolar.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarLunaSistemaSolar.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesLunaSistemaSolar.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoLunaSistemaSolar!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesLunaSistemaSolar.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralLunaSistemaSolar.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesLunaSistemaSolar(Boolean esInicializar) throws Exception {
		try	{	
			if(LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualLunaSistemaSolar(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesLunaSistemaSolar() throws Exception {
		try	{
			if(LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualLunaSistemaSolar();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleLunaSistemaSolar() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxTiposAccionesFormularioLunaSistemaSolar.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxTiposAccionesFormularioLunaSistemaSolar.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualLunaSistemaSolar() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesLunaSistemaSolar.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesLunaSistemaSolar.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesLunaSistemaSolar.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesLunaSistemaSolar.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesLunaSistemaSolar.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesLunaSistemaSolar.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionLunaSistemaSolar.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionLunaSistemaSolar.addItem(reporte);
			}
			
			
			if(!this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionLunaSistemaSolar.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionLunaSistemaSolar.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesLunaSistemaSolar.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesLunaSistemaSolar.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesLunaSistemaSolar.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesLunaSistemaSolar.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxTiposAccionesFormularioLunaSistemaSolar.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxTiposAccionesFormularioLunaSistemaSolar.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarLunaSistemaSolar.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarLunaSistemaSolar.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarLunaSistemaSolar.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualLunaSistemaSolar();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualLunaSistemaSolar() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoLunaSistemaSolar!=null) {
				this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoLunaSistemaSolar!=null) {
				this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoLunaSistemaSolar!=null) {
				
				if(this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualLunaSistemaSolar()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar.getSelectedItem()!=null){this.id_tipo_valoracionFK_IdTipoValoracion=((TipoValoracion)this.jComboBoxid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasLunaSistemaSolar(Boolean esInicializar) throws Exception {				
		if(LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualLunaSistemaSolar();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaLunaSistemaSolar() throws Exception {
		this.inicializarActualizarBindingTablaLunaSistemaSolar(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByLunaSistemaSolar() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByLunaSistemaSolar.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByLunaSistemaSolar.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByLunaSistemaSolar.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new LunaSistemaSolarPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByLunaSistemaSolar.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByLunaSistemaSolar.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new LunaSistemaSolarPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosLunaSistemaSolarOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLunaSistemaSolarOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new LunaSistemaSolarPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByLunaSistemaSolar.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByLunaSistemaSolar.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new LunaSistemaSolarPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByLunaSistemaSolar.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaLunaSistemaSolar(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=lunasistemasolarLogic.getLunaSistemaSolars().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=lunasistemasolars.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosLunaSistemaSolar.setModel(new LunaSistemaSolarModel(this.lunasistemasolarLogic.getLunaSistemaSolars(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosLunaSistemaSolar.setModel(new LunaSistemaSolarModel(this.lunasistemasolars,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByLunaSistemaSolar!=null && this.jInternalFrameOrderByLunaSistemaSolar.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByLunaSistemaSolar();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosLunaSistemaSolar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLunaSistemaSolar,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new LunaSistemaSolarPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO,lunasistemasolarConstantesFunciones.resaltarSeleccionarLunaSistemaSolar,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO,lunasistemasolarConstantesFunciones.resaltarSeleccionarLunaSistemaSolar,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosLunaSistemaSolar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLunaSistemaSolar,LunaSistemaSolarConstantesFunciones.LABEL_ID));

		if(this.lunasistemasolarConstantesFunciones.mostraridLunaSistemaSolar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LunaSistemaSolarConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.lunasistemasolarConstantesFunciones.resaltaridLunaSistemaSolar,this.lunasistemasolarConstantesFunciones.activaridLunaSistemaSolar,this,true,"idLunaSistemaSolar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.lunasistemasolarConstantesFunciones.resaltaridLunaSistemaSolar,this.lunasistemasolarConstantesFunciones.activaridLunaSistemaSolar,this,true,"idLunaSistemaSolar","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLunaSistemaSolar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLunaSistemaSolar,LunaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION));

		if(this.lunasistemasolarConstantesFunciones.mostrarid_tipo_valoracionLunaSistemaSolar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LunaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoValoracionTableCell(this.tipovaloracionsForeignKey,this.lunasistemasolarConstantesFunciones.resaltarid_tipo_valoracionLunaSistemaSolar,this,this.lunasistemasolarConstantesFunciones.activarid_tipo_valoracionLunaSistemaSolar));
			tableColumn.setCellEditor(new TipoValoracionTableCell(this.tipovaloracionsForeignKey,this.lunasistemasolarConstantesFunciones.resaltarid_tipo_valoracionLunaSistemaSolar,this,this.lunasistemasolarConstantesFunciones.activarid_tipo_valoracionLunaSistemaSolar,true,"id_tipo_valoracionLunaSistemaSolar","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LunaSistemaSolarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLunaSistemaSolar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLunaSistemaSolar,LunaSistemaSolarConstantesFunciones.LABEL_CODIGO));

		if(this.lunasistemasolarConstantesFunciones.mostrarcodigoLunaSistemaSolar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LunaSistemaSolarConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.lunasistemasolarConstantesFunciones.resaltarcodigoLunaSistemaSolar,this.lunasistemasolarConstantesFunciones.activarcodigoLunaSistemaSolar,this,true,"codigoLunaSistemaSolar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.lunasistemasolarConstantesFunciones.resaltarcodigoLunaSistemaSolar,this.lunasistemasolarConstantesFunciones.activarcodigoLunaSistemaSolar,this,true,"codigoLunaSistemaSolar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LunaSistemaSolarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLunaSistemaSolar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLunaSistemaSolar,LunaSistemaSolarConstantesFunciones.LABEL_NOMBRE));

		if(this.lunasistemasolarConstantesFunciones.mostrarnombreLunaSistemaSolar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LunaSistemaSolarConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.lunasistemasolarConstantesFunciones.resaltarnombreLunaSistemaSolar,this.lunasistemasolarConstantesFunciones.activarnombreLunaSistemaSolar,this,true,"nombreLunaSistemaSolar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.lunasistemasolarConstantesFunciones.resaltarnombreLunaSistemaSolar,this.lunasistemasolarConstantesFunciones.activarnombreLunaSistemaSolar,this,true,"nombreLunaSistemaSolar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LunaSistemaSolarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLunaSistemaSolar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLunaSistemaSolar,LunaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION));

		if(this.lunasistemasolarConstantesFunciones.mostrardescripcionLunaSistemaSolar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LunaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.lunasistemasolarConstantesFunciones.resaltardescripcionLunaSistemaSolar,this.lunasistemasolarConstantesFunciones.activardescripcionLunaSistemaSolar,this,true,"descripcionLunaSistemaSolar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.lunasistemasolarConstantesFunciones.resaltardescripcionLunaSistemaSolar,this.lunasistemasolarConstantesFunciones.activardescripcionLunaSistemaSolar,this,true,"descripcionLunaSistemaSolar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LunaSistemaSolarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.lunasistemasolarSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.lunasistemasolarSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.lunasistemasolarSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosLunaSistemaSolar.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.lunasistemasolarSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.lunasistemasolarSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosLunaSistemaSolar.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarLunaSistemaSolar && this.isPermisoGuardarCambiosLunaSistemaSolar) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.lunasistemasolarSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.lunasistemasolarSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosLunaSistemaSolar.addColumn(tableColumn);
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
			
			this.jTableDatosLunaSistemaSolar.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarLunaSistemaSolar && this.isPermisoGuardarCambiosLunaSistemaSolar) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarLunaSistemaSolar && this.isPermisoGuardarCambiosLunaSistemaSolar) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosLunaSistemaSolar.moveColumn(this.jTableDatosLunaSistemaSolar.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosLunaSistemaSolar.moveColumn(this.jTableDatosLunaSistemaSolar.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosLunaSistemaSolar.moveColumn(this.jTableDatosLunaSistemaSolar.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosLunaSistemaSolar.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosLunaSistemaSolar.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosLunaSistemaSolar,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosLunaSistemaSolar.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosLunaSistemaSolar.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosLunaSistemaSolar.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosLunaSistemaSolar.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosLunaSistemaSolar.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=lunasistemasolarLogic.getLunaSistemaSolars().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=lunasistemasolars.size()-1;
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
		//this.jTableDatosLunaSistemaSolar.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosLunaSistemaSolar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosLunaSistemaSolar();
			
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
				
				//this.isEsNuevoLunaSistemaSolar=false;
					
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
			
				if(this.lunasistemasolarSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormLunaSistemaSolar==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosLunaSistemaSolar.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosLunaSistemaSolar.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.lunasistemasolar.getsType().equals("DUPLICADO")
				   || this.lunasistemasolar.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoLunaSistemaSolar=true;
				
				} else {
					this.isEsNuevoLunaSistemaSolar=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
					if(this.lunasistemasolar.getId()>=0 && !this.lunasistemasolar.getIsNew()) {						
						this.isEsNuevoLunaSistemaSolar=false;
						
					} else {
						this.isEsNuevoLunaSistemaSolar=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoLunaSistemaSolar(esRelaciones);						
				
				this.seleccionarLunaSistemaSolar(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.lunasistemasolar.getId()<0) {
					this.isEsNuevoLunaSistemaSolar=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarLunaSistemaSolar(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarLunaSistemaSolar(evt,rowIndex);
				}	
				
				if(this.lunasistemasolarSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion LunaSistemaSolar: " + this.dDif); 
					}
				}								
				
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarLunaSistemaSolar(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.lunasistemasolar)) {
					if(this.lunasistemasolar.getId()>0) {
						this.lunasistemasolar.setIsDeleted(true);
						
						this.lunasistemasolarsEliminados.add(this.lunasistemasolar);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.lunasistemasolarLogic.getLunaSistemaSolars().remove(this.lunasistemasolar);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.lunasistemasolars.remove(this.lunasistemasolar);				
					}
					
					
					((LunaSistemaSolarModel) this.jTableDatosLunaSistemaSolar.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaLunaSistemaSolar(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarLunaSistemaSolar(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoLunaSistemaSolar) {
			
			if(this.jInternalFrameDetalleFormLunaSistemaSolar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosLunaSistemaSolar.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosLunaSistemaSolar.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioLunaSistemaSolar(this.lunasistemasolar);
				}
				
				//ARCHITECTURE
				try {
					

					//TipoValoracion
					if(!this.lunasistemasolarConstantesFunciones.cargarid_tipo_valoracionLunaSistemaSolar || this.lunasistemasolarConstantesFunciones.event_dependid_tipo_valoracionLunaSistemaSolar) {
						//this.cargarCombosTipoValoracionsForeignKeyLista(" where id="+this.lunasistemasolar.getid_tipo_valoracion());
									//this.inicializarActualizarBindingLunaSistemaSolar(false,false);
						this.tipovaloracionsForeignKey=new ArrayList<TipoValoracion>();

						if(lunasistemasolar.getTipoValoracion()!=null) {
							this.tipovaloracionsForeignKey.add(lunasistemasolar.getTipoValoracion());
						}

						this.addItemDefectoCombosForeignKeyTipoValoracion();
						this.cargarCombosFrameTipoValoracionsForeignKey("Todos");
					}
					this.setActualTipoValoracionForeignKey(this.lunasistemasolar.getid_tipo_valoracion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesLunaSistemaSolar("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesLunaSistemaSolar(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualLunaSistemaSolar() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoLunaSistemaSolar(LunaSistemaSolar lunasistemasolar) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoLunaSistemaSolar(lunasistemasolar,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoLunaSistemaSolar(LunaSistemaSolar lunasistemasolar,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioLunaSistemaSolar(lunasistemasolar);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyLunaSistemaSolar(lunasistemasolar,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyLunaSistemaSolar(lunasistemasolar);
	}
	
	public void setVariablesObjetoActualToFormularioLunaSistemaSolar(LunaSistemaSolar lunasistemasolar) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormLunaSistemaSolar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormLunaSistemaSolar.jTextFieldidLunaSistemaSolar.setText(lunasistemasolar.getId().toString());
			this.jInternalFrameDetalleFormLunaSistemaSolar.jTextFieldcodigoLunaSistemaSolar.setText(lunasistemasolar.getcodigo());
			this.jInternalFrameDetalleFormLunaSistemaSolar.jTextAreanombreLunaSistemaSolar.setText(lunasistemasolar.getnombre());
			this.jInternalFrameDetalleFormLunaSistemaSolar.jTextAreadescripcionLunaSistemaSolar.setText(lunasistemasolar.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,LunaSistemaSolar lunasistemasolarLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,lunasistemasolarLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,LunaSistemaSolar lunasistemasolarLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				lunasistemasolarLocal=this.lunasistemasolar;
			} else {
				lunasistemasolarLocal=this.lunasistemasolarAnterior;
			}
		}
		
		if(this.permiteMantenimiento(lunasistemasolarLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoLunaSistemaSolar(lunasistemasolarLocal,true);
					
					if(lunasistemasolarSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(lunasistemasolarLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(lunasistemasolarLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoLunaSistemaSolar(LunaSistemaSolar lunasistemasolar,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualLunaSistemaSolar(lunasistemasolar,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysLunaSistemaSolar(lunasistemasolar);
	}
	
	public void setVariablesFormularioToObjetoActualLunaSistemaSolar(LunaSistemaSolar lunasistemasolar,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualLunaSistemaSolar(lunasistemasolar,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualLunaSistemaSolar(LunaSistemaSolar lunasistemasolar,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormLunaSistemaSolar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormLunaSistemaSolar.jTextFieldidLunaSistemaSolar.getText()==null || this.jInternalFrameDetalleFormLunaSistemaSolar.jTextFieldidLunaSistemaSolar.getText()=="" || this.jInternalFrameDetalleFormLunaSistemaSolar.jTextFieldidLunaSistemaSolar.getText()=="Id") {
				this.jInternalFrameDetalleFormLunaSistemaSolar.jTextFieldidLunaSistemaSolar.setText("0");
			}

			if(conColumnasBase) {lunasistemasolar.setId(Long.parseLong(this.jInternalFrameDetalleFormLunaSistemaSolar.jTextFieldidLunaSistemaSolar.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LunaSistemaSolarConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLunaSistemaSolar.jLabelIdLunaSistemaSolar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			lunasistemasolar.setcodigo(this.jInternalFrameDetalleFormLunaSistemaSolar.jTextFieldcodigoLunaSistemaSolar.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LunaSistemaSolarConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLunaSistemaSolar.jLabelcodigoLunaSistemaSolar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			lunasistemasolar.setnombre(this.jInternalFrameDetalleFormLunaSistemaSolar.jTextAreanombreLunaSistemaSolar.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LunaSistemaSolarConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLunaSistemaSolar.jLabelnombreLunaSistemaSolar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			lunasistemasolar.setdescripcion(this.jInternalFrameDetalleFormLunaSistemaSolar.jTextAreadescripcionLunaSistemaSolar.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LunaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLunaSistemaSolar.jLabeldescripcionLunaSistemaSolar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualLunaSistemaSolar(LunaSistemaSolar lunasistemasolarBean,LunaSistemaSolar lunasistemasolar,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && lunasistemasolarBean.getid_tipo_valoracion()!=null && !lunasistemasolarBean.getid_tipo_valoracion().equals(-1L))) {lunasistemasolar.setid_tipo_valoracion(lunasistemasolarBean.getid_tipo_valoracion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosLunaSistemaSolar(LunaSistemaSolar lunasistemasolarOrigen,LunaSistemaSolar lunasistemasolar,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && lunasistemasolarOrigen.getId()!=null && !lunasistemasolarOrigen.getId().equals(0L))) {lunasistemasolar.setId(lunasistemasolarOrigen.getId());}}
			if(conDefault || (!conDefault && lunasistemasolarOrigen.getid_tipo_valoracion()!=null && !lunasistemasolarOrigen.getid_tipo_valoracion().equals(-1L))) {lunasistemasolar.setid_tipo_valoracion(lunasistemasolarOrigen.getid_tipo_valoracion());}
			if(conDefault || (!conDefault && lunasistemasolarOrigen.getcodigo()!=null && !lunasistemasolarOrigen.getcodigo().equals(""))) {lunasistemasolar.setcodigo(lunasistemasolarOrigen.getcodigo());}
			if(conDefault || (!conDefault && lunasistemasolarOrigen.getnombre()!=null && !lunasistemasolarOrigen.getnombre().equals(""))) {lunasistemasolar.setnombre(lunasistemasolarOrigen.getnombre());}
			if(conDefault || (!conDefault && lunasistemasolarOrigen.getdescripcion()!=null && !lunasistemasolarOrigen.getdescripcion().equals(""))) {lunasistemasolar.setdescripcion(lunasistemasolarOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioLunaSistemaSolar(LunaSistemaSolar lunasistemasolar) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormLunaSistemaSolar.jTextFieldidLunaSistemaSolar.setText(lunasistemasolar.getId().toString());
			this.jInternalFrameDetalleFormLunaSistemaSolar.jTextFieldcodigoLunaSistemaSolar.setText(lunasistemasolar.getcodigo());
			this.jInternalFrameDetalleFormLunaSistemaSolar.jTextAreanombreLunaSistemaSolar.setText(lunasistemasolar.getnombre());
			this.jInternalFrameDetalleFormLunaSistemaSolar.jTextAreadescripcionLunaSistemaSolar.setText(lunasistemasolar.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioLunaSistemaSolar(LunaSistemaSolarBean lunasistemasolarBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormLunaSistemaSolar.jTextFieldidLunaSistemaSolar.setText(lunasistemasolarBean.getId().toString());
			this.jInternalFrameDetalleFormLunaSistemaSolar.jTextFieldcodigoLunaSistemaSolar.setText(lunasistemasolarBean.getcodigo());
			this.jInternalFrameDetalleFormLunaSistemaSolar.jTextAreanombreLunaSistemaSolar.setText(lunasistemasolarBean.getnombre());
			this.jInternalFrameDetalleFormLunaSistemaSolar.jTextAreadescripcionLunaSistemaSolar.setText(lunasistemasolarBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanLunaSistemaSolar(LunaSistemaSolarParameterReturnGeneral lunasistemasolarReturnGeneral,LunaSistemaSolarBean lunasistemasolarBean,Boolean conDefault) throws Exception { 
		try {
			LunaSistemaSolar lunasistemasolarLocal=new LunaSistemaSolar();
			
			lunasistemasolarLocal=lunasistemasolarReturnGeneral.getLunaSistemaSolar();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && lunasistemasolarLocal.getId()!=null && !lunasistemasolarLocal.getId().equals(0L))) {lunasistemasolarBean.setId(lunasistemasolarLocal.getId());}}
			if(conDefault || (!conDefault && lunasistemasolarLocal.getid_tipo_valoracion()!=null && !lunasistemasolarLocal.getid_tipo_valoracion().equals(-1L))) {lunasistemasolarBean.setid_tipo_valoracion(lunasistemasolarLocal.getid_tipo_valoracion());}
			if(conDefault || (!conDefault && lunasistemasolarLocal.getcodigo()!=null && !lunasistemasolarLocal.getcodigo().equals(""))) {lunasistemasolarBean.setcodigo(lunasistemasolarLocal.getcodigo());}
			if(conDefault || (!conDefault && lunasistemasolarLocal.getnombre()!=null && !lunasistemasolarLocal.getnombre().equals(""))) {lunasistemasolarBean.setnombre(lunasistemasolarLocal.getnombre());}
			if(conDefault || (!conDefault && lunasistemasolarLocal.getdescripcion()!=null && !lunasistemasolarLocal.getdescripcion().equals(""))) {lunasistemasolarBean.setdescripcion(lunasistemasolarLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxLunaSistemaSolarGenerico(Long idLunaSistemaSolarSeleccionado,JComboBox jComboBoxLunaSistemaSolar,List<LunaSistemaSolar> lunasistemasolarsLocal)throws Exception {
		try {
			LunaSistemaSolar  lunasistemasolarTemp=null;

			for(LunaSistemaSolar lunasistemasolarAux:lunasistemasolarsLocal) {
				if(lunasistemasolarAux.getId()!=null && lunasistemasolarAux.getId().equals(idLunaSistemaSolarSeleccionado)) {
					lunasistemasolarTemp=lunasistemasolarAux;
					break;
				}
			}

			jComboBoxLunaSistemaSolar.setSelectedItem(lunasistemasolarTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxLunaSistemaSolarGenerico(JComboBox jComboBoxLunaSistemaSolar,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxLunaSistemaSolar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxLunaSistemaSolar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxLunaSistemaSolar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxLunaSistemaSolar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxLunaSistemaSolar.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxLunaSistemaSolar.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxLunaSistemaSolar.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxLunaSistemaSolar.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxLunaSistemaSolar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxLunaSistemaSolar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			lunasistemasolar=(LunaSistemaSolar) lunasistemasolarLogic.getLunaSistemaSolars().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			lunasistemasolar =(LunaSistemaSolar) lunasistemasolars.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("TipoValoracion")) {
			//sDescripcion=this.getActualTipoValoracionForeignKeyDescripcion((Long)value);
			if(!lunasistemasolar.getIsNew() && !lunasistemasolar.getIsChanged() && !lunasistemasolar.getIsDeleted()) {
				sDescripcion=lunasistemasolar.gettipovaloracion_descripcion();
			} else {
				//sDescripcion=this.getActualTipoValoracionForeignKeyDescripcion((Long)value);
				sDescripcion=lunasistemasolar.gettipovaloracion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		LunaSistemaSolar lunasistemasolarRow=new LunaSistemaSolar();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			lunasistemasolarRow=(LunaSistemaSolar) lunasistemasolarLogic.getLunaSistemaSolars().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			lunasistemasolarRow=(LunaSistemaSolar) lunasistemasolars.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualLunaSistemaSolar(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoLunaSistemaSolar.setVisible((this.isVisibilidadCeldaNuevoLunaSistemaSolar && this.isPermisoNuevoLunaSistemaSolar));			
			this.jButtonDuplicarLunaSistemaSolar.setVisible((this.isVisibilidadCeldaDuplicarLunaSistemaSolar && this.isPermisoDuplicarLunaSistemaSolar));			
			this.jButtonCopiarLunaSistemaSolar.setVisible((this.isVisibilidadCeldaCopiarLunaSistemaSolar && this.isPermisoCopiarLunaSistemaSolar));
			this.jButtonVerFormLunaSistemaSolar.setVisible((this.isVisibilidadCeldaVerFormLunaSistemaSolar && this.isPermisoVerFormLunaSistemaSolar));
			
			this.jButtonAbrirOrderByLunaSistemaSolar.setVisible((this.isVisibilidadCeldaOrdenLunaSistemaSolar && this.isPermisoOrdenLunaSistemaSolar));			
			
			this.jButtonNuevoRelacionesLunaSistemaSolar.setVisible((this.isVisibilidadCeldaNuevoRelacionesLunaSistemaSolar && this.isPermisoNuevoLunaSistemaSolar));			
			this.jButtonNuevoGuardarCambiosLunaSistemaSolar.setVisible((this.isVisibilidadCeldaNuevoLunaSistemaSolar && this.isPermisoNuevoLunaSistemaSolar && this.isPermisoGuardarCambiosLunaSistemaSolar));
			
			if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonModificarLunaSistemaSolar.setVisible((this.isVisibilidadCeldaModificarLunaSistemaSolar && this.isPermisoActualizarLunaSistemaSolar));	
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonActualizarLunaSistemaSolar.setVisible((this.isVisibilidadCeldaActualizarLunaSistemaSolar && this.isPermisoActualizarLunaSistemaSolar));	
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonEliminarLunaSistemaSolar.setVisible((this.isVisibilidadCeldaEliminarLunaSistemaSolar && this.isPermisoEliminarLunaSistemaSolar));
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonCancelarLunaSistemaSolar.setVisible(this.isVisibilidadCeldaCancelarLunaSistemaSolar);							
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonGuardarCambiosLunaSistemaSolar.setVisible((this.isVisibilidadCeldaGuardarLunaSistemaSolar && this.isPermisoGuardarCambiosLunaSistemaSolar));			
			
			}
						
			this.jButtonGuardarCambiosTablaLunaSistemaSolar.setVisible((this.isVisibilidadCeldaGuardarCambiosLunaSistemaSolar && this.isPermisoGuardarCambiosLunaSistemaSolar));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarLunaSistemaSolar.setVisible((this.isVisibilidadCeldaNuevoLunaSistemaSolar && this.isPermisoNuevoLunaSistemaSolar));						
			this.jButtonDuplicarToolBarLunaSistemaSolar.setVisible((this.isVisibilidadCeldaDuplicarLunaSistemaSolar && this.isPermisoDuplicarLunaSistemaSolar));						
			this.jButtonCopiarToolBarLunaSistemaSolar.setVisible((this.isVisibilidadCeldaCopiarLunaSistemaSolar && this.isPermisoCopiarLunaSistemaSolar));			
			this.jButtonVerFormToolBarLunaSistemaSolar.setVisible((this.isVisibilidadCeldaVerFormLunaSistemaSolar && this.isPermisoVerFormLunaSistemaSolar));			
			this.jButtonAbrirOrderByToolBarLunaSistemaSolar.setVisible((this.isVisibilidadCeldaOrdenLunaSistemaSolar && this.isPermisoOrdenLunaSistemaSolar));
			this.jButtonNuevoRelacionesToolBarLunaSistemaSolar.setVisible((this.isVisibilidadCeldaNuevoRelacionesLunaSistemaSolar && this.isPermisoNuevoLunaSistemaSolar));			
			this.jButtonNuevoGuardarCambiosToolBarLunaSistemaSolar.setVisible((this.isVisibilidadCeldaNuevoLunaSistemaSolar && this.isPermisoNuevoLunaSistemaSolar && this.isPermisoGuardarCambiosLunaSistemaSolar));			
			
			if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonModificarToolBarLunaSistemaSolar.setVisible((this.isVisibilidadCeldaModificarLunaSistemaSolar && this.isPermisoActualizarLunaSistemaSolar));	
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonActualizarToolBarLunaSistemaSolar.setVisible((this.isVisibilidadCeldaActualizarLunaSistemaSolar  && this.isPermisoActualizarLunaSistemaSolar));	
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonEliminarToolBarLunaSistemaSolar.setVisible((this.isVisibilidadCeldaEliminarLunaSistemaSolar && this.isPermisoEliminarLunaSistemaSolar));
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonCancelarToolBarLunaSistemaSolar.setVisible(this.isVisibilidadCeldaCancelarLunaSistemaSolar);				
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonGuardarCambiosToolBarLunaSistemaSolar.setVisible((this.isVisibilidadCeldaGuardarLunaSistemaSolar && this.isPermisoGuardarCambiosLunaSistemaSolar));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarLunaSistemaSolar.setVisible((this.isVisibilidadCeldaGuardarCambiosLunaSistemaSolar && this.isPermisoGuardarCambiosLunaSistemaSolar));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoLunaSistemaSolar.setVisible((this.isVisibilidadCeldaNuevoLunaSistemaSolar && this.isPermisoNuevoLunaSistemaSolar));			
			this.jMenuItemDuplicarLunaSistemaSolar.setVisible((this.isVisibilidadCeldaDuplicarLunaSistemaSolar && this.isPermisoDuplicarLunaSistemaSolar));			
			this.jMenuItemCopiarLunaSistemaSolar.setVisible((this.isVisibilidadCeldaCopiarLunaSistemaSolar && this.isPermisoCopiarLunaSistemaSolar));			
			this.jMenuItemVerFormLunaSistemaSolar.setVisible((this.isVisibilidadCeldaVerFormLunaSistemaSolar && this.isPermisoVerFormLunaSistemaSolar));			
			this.jMenuItemAbrirOrderByLunaSistemaSolar.setVisible((this.isVisibilidadCeldaOrdenLunaSistemaSolar && this.isPermisoOrdenLunaSistemaSolar));			
			//this.jMenuItemMostrarOcultarLunaSistemaSolar.setVisible((this.isVisibilidadCeldaOrdenLunaSistemaSolar && this.isPermisoOrdenLunaSistemaSolar));
			this.jMenuItemDetalleAbrirOrderByLunaSistemaSolar.setVisible((this.isVisibilidadCeldaOrdenLunaSistemaSolar && this.isPermisoOrdenLunaSistemaSolar));			
			//this.jMenuItemDetalleMostrarOcultarLunaSistemaSolar.setVisible((this.isVisibilidadCeldaOrdenLunaSistemaSolar && this.isPermisoOrdenLunaSistemaSolar));			
			this.jMenuItemNuevoRelacionesLunaSistemaSolar.setVisible((this.isVisibilidadCeldaNuevoRelacionesLunaSistemaSolar && this.isPermisoNuevoLunaSistemaSolar));			
			this.jMenuItemNuevoGuardarCambiosLunaSistemaSolar.setVisible((this.isVisibilidadCeldaNuevoLunaSistemaSolar && this.isPermisoNuevoLunaSistemaSolar && this.isPermisoGuardarCambiosLunaSistemaSolar));									
			
			if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {
			this.jInternalFrameDetalleFormLunaSistemaSolar.jMenuItemModificarLunaSistemaSolar.setVisible((this.isVisibilidadCeldaModificarLunaSistemaSolar && this.isPermisoActualizarLunaSistemaSolar));	
			this.jInternalFrameDetalleFormLunaSistemaSolar.jMenuItemActualizarLunaSistemaSolar.setVisible((this.isVisibilidadCeldaActualizarLunaSistemaSolar && this.isPermisoActualizarLunaSistemaSolar));	
			this.jInternalFrameDetalleFormLunaSistemaSolar.jMenuItemEliminarLunaSistemaSolar.setVisible((this.isVisibilidadCeldaEliminarLunaSistemaSolar && this.isPermisoEliminarLunaSistemaSolar));
			this.jInternalFrameDetalleFormLunaSistemaSolar.jMenuItemCancelarLunaSistemaSolar.setVisible(this.isVisibilidadCeldaCancelarLunaSistemaSolar);				
			}
			
			this.jMenuItemGuardarCambiosLunaSistemaSolar.setVisible((this.isVisibilidadCeldaGuardarLunaSistemaSolar && this.isPermisoGuardarCambiosLunaSistemaSolar));						
			this.jMenuItemGuardarCambiosTablaLunaSistemaSolar.setVisible((this.isVisibilidadCeldaGuardarCambiosLunaSistemaSolar && this.isPermisoGuardarCambiosLunaSistemaSolar));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoLunaSistemaSolar=this.jButtonNuevoLunaSistemaSolar.isVisible();
			this.isVisibilidadCeldaDuplicarLunaSistemaSolar=this.jButtonDuplicarLunaSistemaSolar.isVisible();
			this.isVisibilidadCeldaCopiarLunaSistemaSolar=this.jButtonCopiarLunaSistemaSolar.isVisible();
			this.isVisibilidadCeldaVerFormLunaSistemaSolar=this.jButtonVerFormLunaSistemaSolar.isVisible();
			
			this.isVisibilidadCeldaOrdenLunaSistemaSolar=this.jButtonAbrirOrderByLunaSistemaSolar.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesLunaSistemaSolar=this.jButtonNuevoRelacionesLunaSistemaSolar.isVisible();
			this.isVisibilidadCeldaModificarLunaSistemaSolar=this.jButtonModificarLunaSistemaSolar.isVisible();
			
			if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {
			this.isVisibilidadCeldaActualizarLunaSistemaSolar=this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonActualizarLunaSistemaSolar.isVisible();
			this.isVisibilidadCeldaEliminarLunaSistemaSolar=this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonEliminarLunaSistemaSolar.isVisible();
			this.isVisibilidadCeldaCancelarLunaSistemaSolar=this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonCancelarLunaSistemaSolar.isVisible();
			this.isVisibilidadCeldaGuardarLunaSistemaSolar=this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonGuardarCambiosLunaSistemaSolar.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosLunaSistemaSolar=this.jButtonGuardarCambiosTablaLunaSistemaSolar.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoLunaSistemaSolar=this.jButtonNuevoToolBarLunaSistemaSolar.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesLunaSistemaSolar=this.jButtonNuevoRelacionesToolBarLunaSistemaSolar.isVisible();
			
			if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {
			this.isVisibilidadCeldaModificarLunaSistemaSolar=this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonModificarToolBarLunaSistemaSolar.isVisible();
			this.isVisibilidadCeldaActualizarLunaSistemaSolar=this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonActualizarToolBarLunaSistemaSolar.isVisible();
			this.isVisibilidadCeldaEliminarLunaSistemaSolar=this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonEliminarToolBarLunaSistemaSolar.isVisible();
			this.isVisibilidadCeldaCancelarLunaSistemaSolar=this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonCancelarToolBarLunaSistemaSolar.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarLunaSistemaSolar=this.jButtonGuardarCambiosToolBarLunaSistemaSolar.isVisible();
			this.isVisibilidadCeldaGuardarCambiosLunaSistemaSolar=this.jButtonGuardarCambiosTablaToolBarLunaSistemaSolar.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoLunaSistemaSolar=this.jMenuItemNuevoLunaSistemaSolar.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesLunaSistemaSolar=this.jMenuItemNuevoRelacionesLunaSistemaSolar.isVisible();
			
			if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {
			this.isVisibilidadCeldaModificarLunaSistemaSolar=this.jInternalFrameDetalleFormLunaSistemaSolar.jMenuItemModificarLunaSistemaSolar.isVisible();
			this.isVisibilidadCeldaActualizarLunaSistemaSolar=this.jInternalFrameDetalleFormLunaSistemaSolar.jMenuItemActualizarLunaSistemaSolar.isVisible();
			this.isVisibilidadCeldaEliminarLunaSistemaSolar=this.jInternalFrameDetalleFormLunaSistemaSolar.jMenuItemEliminarLunaSistemaSolar.isVisible();
			this.isVisibilidadCeldaCancelarLunaSistemaSolar=this.jInternalFrameDetalleFormLunaSistemaSolar.jMenuItemCancelarLunaSistemaSolar.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarLunaSistemaSolar=this.jMenuItemGuardarCambiosLunaSistemaSolar.isVisible();
			this.isVisibilidadCeldaGuardarCambiosLunaSistemaSolar=this.jMenuItemGuardarCambiosTablaLunaSistemaSolar.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesLunaSistemaSolar(Boolean esInicializar) {
		if(LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {			
			if(this.lunasistemasolarSessionBean.getConGuardarRelaciones()) {
				//if(this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesLunaSistemaSolar();
			}
			
			this.inicializarActualizarBindingBotonesManualLunaSistemaSolar(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualLunaSistemaSolar() {
		this.jButtonNuevoLunaSistemaSolar.setVisible(this.isPermisoNuevoLunaSistemaSolar);			
		this.jButtonDuplicarLunaSistemaSolar.setVisible(this.isPermisoDuplicarLunaSistemaSolar);			
		this.jButtonCopiarLunaSistemaSolar.setVisible(this.isPermisoCopiarLunaSistemaSolar);			
		this.jButtonVerFormLunaSistemaSolar.setVisible(this.isPermisoVerFormLunaSistemaSolar);			
		
		this.jButtonAbrirOrderByLunaSistemaSolar.setVisible(this.isPermisoOrdenLunaSistemaSolar);					
		
		this.jButtonNuevoRelacionesLunaSistemaSolar.setVisible(this.isPermisoNuevoLunaSistemaSolar);			
		
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonModificarLunaSistemaSolar.setVisible(this.isPermisoActualizarLunaSistemaSolar);	
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonActualizarLunaSistemaSolar.setVisible(this.isPermisoActualizarLunaSistemaSolar);	
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonEliminarLunaSistemaSolar.setVisible(this.isPermisoEliminarLunaSistemaSolar);
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonCancelarLunaSistemaSolar.setVisible(this.isVisibilidadCeldaCancelarLunaSistemaSolar);						
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonGuardarCambiosLunaSistemaSolar.setVisible(this.isPermisoGuardarCambiosLunaSistemaSolar);							
		}
		
		this.jButtonGuardarCambiosTablaLunaSistemaSolar.setVisible(this.isPermisoActualizarLunaSistemaSolar);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleLunaSistemaSolar() {
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonModificarLunaSistemaSolar.setVisible(this.isPermisoActualizarLunaSistemaSolar);	
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonActualizarLunaSistemaSolar.setVisible(this.isPermisoActualizarLunaSistemaSolar);	
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonEliminarLunaSistemaSolar.setVisible(this.isPermisoEliminarLunaSistemaSolar);
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonCancelarLunaSistemaSolar.setVisible(this.isVisibilidadCeldaCancelarLunaSistemaSolar);							
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonGuardarCambiosLunaSistemaSolar.setVisible((this.isVisibilidadCeldaGuardarLunaSistemaSolar && this.isPermisoGuardarCambiosLunaSistemaSolar));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosLunaSistemaSolar() {
		if(LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualLunaSistemaSolar();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesLunaSistemaSolar() {
	}
	
	public void jTableDatosLunaSistemaSolarListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarLunaSistemaSolar(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidLunaSistemaSolarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLunaSistemaSolar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLunaSistemaSolar(this.getlunasistemasolar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLunaSistemaSolar(this.lunasistemasolar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lunasistemasolar==null) {
						this.lunasistemasolar = new LunaSistemaSolar();
					}

					this.setVariablesFormularioToObjetoActualLunaSistemaSolar(this.lunasistemasolar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLunaSistemaSolar(this.lunasistemasolar);
				}

				if(this.lunasistemasolar.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.lunasistemasolar.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLunaSistemaSolar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_valoracionLunaSistemaSolarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipovaloracion=true;

			idTienePermisotipovaloracion=this.tienePermisosUsuarioEnPaginaWebLunaSistemaSolar(TipoValoracionConstantesFunciones.CLASSNAME);

			if(idTienePermisotipovaloracion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLunaSistemaSolar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLunaSistemaSolar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLunaSistemaSolar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLunaSistemaSolar(this.getlunasistemasolar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLunaSistemaSolar(this.lunasistemasolar);

				this.tipovaloracionBeanSwingJInternalFrame=new TipoValoracionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipovaloracionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipovaloracionBeanSwingJInternalFrame.getTipoValoracionLogic().setConnexion(this.lunasistemasolarLogic.getConnexion());

				if(this.lunasistemasolar.getid_tipo_valoracion()!=null) {
					this.tipovaloracionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipovaloracionBeanSwingJInternalFrame.setIdActual(this.lunasistemasolar.getid_tipo_valoracion());
					this.tipovaloracionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipovaloracionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipovaloracionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoValoracion();
				}

				JInternalFrameBase jinternalFrame =this.tipovaloracionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLunaSistemaSolar=(TitledBorder)this.jScrollPanelDatosLunaSistemaSolar.getBorder();
				TitledBorder titledBordertipovaloracion=(TitledBorder)this.tipovaloracionBeanSwingJInternalFrame.jScrollPanelDatosTipoValoracion.getBorder();

				titledBordertipovaloracion.setTitle(titledBorderLunaSistemaSolar.getTitle() + " -> Tipo Valoracion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_valoracionLunaSistemaSolarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLunaSistemaSolar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLunaSistemaSolar(this.getlunasistemasolar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLunaSistemaSolar(this.lunasistemasolar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lunasistemasolar==null) {
						this.lunasistemasolar = new LunaSistemaSolar();
					}

					this.setVariablesFormularioToObjetoActualLunaSistemaSolar(this.lunasistemasolar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLunaSistemaSolar(this.lunasistemasolar);
				}

				if(this.lunasistemasolar.getid_tipo_valoracion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_valoracion = "+this.lunasistemasolar.getid_tipo_valoracion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLunaSistemaSolar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoLunaSistemaSolarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLunaSistemaSolar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLunaSistemaSolar(this.getlunasistemasolar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLunaSistemaSolar(this.lunasistemasolar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lunasistemasolar==null) {
						this.lunasistemasolar = new LunaSistemaSolar();
					}

					this.setVariablesFormularioToObjetoActualLunaSistemaSolar(this.lunasistemasolar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLunaSistemaSolar(this.lunasistemasolar);
				}

				if(this.lunasistemasolar.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.lunasistemasolar.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLunaSistemaSolar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreLunaSistemaSolarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLunaSistemaSolar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLunaSistemaSolar(this.getlunasistemasolar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLunaSistemaSolar(this.lunasistemasolar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lunasistemasolar==null) {
						this.lunasistemasolar = new LunaSistemaSolar();
					}

					this.setVariablesFormularioToObjetoActualLunaSistemaSolar(this.lunasistemasolar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLunaSistemaSolar(this.lunasistemasolar);
				}

				if(this.lunasistemasolar.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.lunasistemasolar.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLunaSistemaSolar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionLunaSistemaSolarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLunaSistemaSolar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLunaSistemaSolar(this.getlunasistemasolar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLunaSistemaSolar(this.lunasistemasolar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lunasistemasolar==null) {
						this.lunasistemasolar = new LunaSistemaSolar();
					}

					this.setVariablesFormularioToObjetoActualLunaSistemaSolar(this.lunasistemasolar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLunaSistemaSolar(this.lunasistemasolar);
				}

				if(this.lunasistemasolar.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.lunasistemasolar.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLunaSistemaSolar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdTipoValoracionLunaSistemaSolarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLunaSistemaSolar(false,false);

			this.getLunaSistemaSolarsFK_IdTipoValoracion();

			this.inicializarActualizarBindingLunaSistemaSolar(false);

			//if(LunaSistemaSolarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLunaSistemaSolar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lunasistemasolarLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameLunaSistemaSolar() {
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {
			this.jInternalFrameDetalleFormLunaSistemaSolar.setVisible(false);	    			
			this.jInternalFrameDetalleFormLunaSistemaSolar.dispose();
			this.jInternalFrameDetalleFormLunaSistemaSolar=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoLunaSistemaSolar!=null) {
			this.jInternalFrameReporteDinamicoLunaSistemaSolar.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoLunaSistemaSolar.dispose();
			this.jInternalFrameReporteDinamicoLunaSistemaSolar=null;
		}
		
		if(this.jInternalFrameImportacionLunaSistemaSolar!=null) {
			this.jInternalFrameImportacionLunaSistemaSolar.setVisible(false);	    			
			this.jInternalFrameImportacionLunaSistemaSolar.dispose();
			this.jInternalFrameImportacionLunaSistemaSolar=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessLunaSistemaSolar();
			
			LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
			
			
			if(sTipo.equals("NuevoLunaSistemaSolar")) {
				jButtonNuevoLunaSistemaSolarActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarLunaSistemaSolar")) {
				jButtonDuplicarLunaSistemaSolarActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarLunaSistemaSolar")) {
				jButtonCopiarLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("VerFormLunaSistemaSolar")) {
				jButtonVerFormLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarLunaSistemaSolar")) {
				jButtonNuevoLunaSistemaSolarActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarLunaSistemaSolar")) {
				jButtonDuplicarLunaSistemaSolarActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoLunaSistemaSolar")) {
				jButtonNuevoLunaSistemaSolarActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarLunaSistemaSolar")) {
				jButtonDuplicarLunaSistemaSolarActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesLunaSistemaSolar")) {
				jButtonNuevoLunaSistemaSolarActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarLunaSistemaSolar")) {
				jButtonNuevoLunaSistemaSolarActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesLunaSistemaSolar")) {
				jButtonNuevoLunaSistemaSolarActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarLunaSistemaSolar")) {
				jButtonModificarLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarLunaSistemaSolar")) {
				jButtonModificarLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarLunaSistemaSolar")) {
				jButtonModificarLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("ActualizarLunaSistemaSolar")) {
				jButtonActualizarLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarLunaSistemaSolar")) {
				jButtonActualizarLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarLunaSistemaSolar")) {
				jButtonActualizarLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("EliminarLunaSistemaSolar")) {
				jButtonEliminarLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarLunaSistemaSolar")) {
				jButtonEliminarLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarLunaSistemaSolar")) {
				jButtonEliminarLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("CancelarLunaSistemaSolar")) {
				jButtonCancelarLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarLunaSistemaSolar")) {
				jButtonCancelarLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarLunaSistemaSolar")) {
				jButtonCancelarLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("CerrarLunaSistemaSolar")) {
				jButtonCerrarLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarLunaSistemaSolar")) {
				jButtonCerrarLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarLunaSistemaSolar")) {
				jButtonCerrarLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarLunaSistemaSolar")) {
				jButtonMostrarOcultarLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarLunaSistemaSolar")) {
				jButtonCancelarLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosLunaSistemaSolar")) {
				jButtonGuardarCambiosLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarLunaSistemaSolar")) {
				jButtonGuardarCambiosLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarLunaSistemaSolar")) {
				jButtonCopiarLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarLunaSistemaSolar")) {
				jButtonVerFormLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosLunaSistemaSolar")) {
				jButtonGuardarCambiosLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarLunaSistemaSolar")) {
				jButtonCopiarLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormLunaSistemaSolar")) {
				jButtonVerFormLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaLunaSistemaSolar")) {
				jButtonGuardarCambiosLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarLunaSistemaSolar")) {
				jButtonGuardarCambiosLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaLunaSistemaSolar")) {
				jButtonGuardarCambiosLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionLunaSistemaSolar")) {
				jButtonRecargarInformacionLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarLunaSistemaSolar")) {
				jButtonRecargarInformacionLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionLunaSistemaSolar")) {
				jButtonRecargarInformacionLunaSistemaSolarActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresLunaSistemaSolar")) {
				jButtonAnterioresLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarLunaSistemaSolar")) {
				jButtonAnterioresLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreLunaSistemaSolar")) {
				jButtonAnterioresLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("SiguientesLunaSistemaSolar")) {
				jButtonSiguientesLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarLunaSistemaSolar")) {
				jButtonSiguientesLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesLunaSistemaSolar")) {
				jButtonSiguientesLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByLunaSistemaSolar") || sTipo.equals("MenuItemDetalleAbrirOrderByLunaSistemaSolar")) {
				jButtonAbrirOrderByLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarLunaSistemaSolar") || sTipo.equals("MenuItemDetalleMostrarOcultarLunaSistemaSolar")) {
				jButtonMostrarOcultarLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosLunaSistemaSolar")) {
				jButtonNuevoGuardarCambiosLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarLunaSistemaSolar")) {
				jButtonNuevoGuardarCambiosLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosLunaSistemaSolar")) {
				jButtonNuevoGuardarCambiosLunaSistemaSolarActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoLunaSistemaSolar")) {
				jButtonCerrarReporteDinamicoLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoLunaSistemaSolar")) {
				jButtonGenerarReporteDinamicoLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoLunaSistemaSolar")) {
				
				jButtonGenerarExcelReporteDinamicoLunaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionLunaSistemaSolar")) {
				jButtonCerrarImportacionLunaSistemaSolarActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionLunaSistemaSolar")) {
				
				jButtonGenerarImportacionLunaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionLunaSistemaSolar")) {
				
				jButtonAbrirImportacionLunaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesLunaSistemaSolar")) {
				jComboBoxTiposAccionesLunaSistemaSolarActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesLunaSistemaSolar")) {
				jComboBoxTiposRelacionesLunaSistemaSolarActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioLunaSistemaSolar")) {
				jComboBoxTiposAccionesLunaSistemaSolarActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarLunaSistemaSolar")) {
				
				jComboBoxTiposSeleccionarLunaSistemaSolarActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralLunaSistemaSolar")) {
				jTextFieldValorCampoGeneralLunaSistemaSolarActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByLunaSistemaSolar")) {
				jButtonAbrirOrderByLunaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarLunaSistemaSolar")) {
				jButtonAbrirOrderByLunaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByLunaSistemaSolar")) {
				jButtonCerrarOrderByLunaSistemaSolarActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idLunaSistemaSolarBusqueda")) {
				this.jButtonidLunaSistemaSolarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_valoracionLunaSistemaSolarUpdate")) {
				this.jButtonid_tipo_valoracionLunaSistemaSolarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_valoracionLunaSistemaSolarBusqueda")) {
				this.jButtonid_tipo_valoracionLunaSistemaSolarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoLunaSistemaSolarBusqueda")) {
				this.jButtoncodigoLunaSistemaSolarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreLunaSistemaSolarBusqueda")) {
				this.jButtonnombreLunaSistemaSolarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionLunaSistemaSolarBusqueda")) {
				this.jButtondescripcionLunaSistemaSolarBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdTipoValoracionLunaSistemaSolar")) {
				this.jButtonFK_IdTipoValoracionLunaSistemaSolarActionPerformed(evt);
			}
			
			;
			
			
			LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessLunaSistemaSolar();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLunaSistemaSolarActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lunasistemasolar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lunasistemasolar);
				
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
				
				


				
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LunaSistemaSolar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LunaSistemaSolar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			LunaSistemaSolar lunasistemasolarLocal=null;
			
			if(!this.getEsControlTabla()) {
				lunasistemasolarLocal=this.lunasistemasolar;
			} else {
				lunasistemasolarLocal=this.lunasistemasolarAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lunasistemasolar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lunasistemasolar);
				
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
							
				
				


				
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LunaSistemaSolar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LunaSistemaSolar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLunaSistemaSolarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLunaSistemaSolar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarAnterior =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lunasistemasolarAnterior =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
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
			
			LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
			
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
			
			


			
			LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLunaSistemaSolarActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lunasistemasolar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lunasistemasolar);
				
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
								
						
				


				
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LunaSistemaSolar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LunaSistemaSolar.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lunasistemasolar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lunasistemasolar);
				
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
								
				
				


				
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LunaSistemaSolar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LunaSistemaSolar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLunaSistemaSolarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLunaSistemaSolar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarAnterior =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lunasistemasolarAnterior =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lunasistemasolar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lunasistemasolar);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLunaSistemaSolarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLunaSistemaSolar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarAnterior =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lunasistemasolarAnterior =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLunaSistemaSolarActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.lunasistemasolar);
			
			this.actualizarInformacion("INFO_PADRE",false,this.lunasistemasolar);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lunasistemasolar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lunasistemasolar);
				
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
							
				
				


				
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LunaSistemaSolar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LunaSistemaSolar.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLunaSistemaSolarActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosLunaSistemaSolar.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lunasistemasolarAnterior =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.lunasistemasolarAnterior =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
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
			
			LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
			
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
			
			


			
			LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLunaSistemaSolarActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.lunasistemasolar);
			
			this.actualizarInformacion("INFO_PADRE",false,this.lunasistemasolar);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lunasistemasolar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lunasistemasolar);
				
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
								
				
				


				
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LunaSistemaSolar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LunaSistemaSolar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLunaSistemaSolarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLunaSistemaSolar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarAnterior =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lunasistemasolarAnterior =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLunaSistemaSolarActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.lunasistemasolar);
			
			this.actualizarInformacion("INFO_PADRE",false,this.lunasistemasolar);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLunaSistemaSolarActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lunasistemasolar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lunasistemasolar);
				
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosLunaSistemaSolar")) {
					jCheckBoxSeleccionarTodosLunaSistemaSolarItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosLunaSistemaSolar")) {
					jCheckBoxSeleccionadosLunaSistemaSolarItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarLunaSistemaSolar")) {
					
				}
				
				


				
				
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LunaSistemaSolar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LunaSistemaSolar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.lunasistemasolar);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.lunasistemasolar);
				
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
												
				
				


				
				
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LunaSistemaSolar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LunaSistemaSolar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLunaSistemaSolarActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosLunaSistemaSolar.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lunasistemasolarAnterior =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.lunasistemasolarAnterior =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLunaSistemaSolarActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lunasistemasolar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lunasistemasolar);
				
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
				
				
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
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
			
			LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
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
			
			


			
			LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLunaSistemaSolarActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lunasistemasolar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lunasistemasolar);
				
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LunaSistemaSolar.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LunaSistemaSolar.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lunasistemasolar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lunasistemasolar);
				
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
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
				
				


				
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LunaSistemaSolar.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LunaSistemaSolar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLunaSistemaSolarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLunaSistemaSolar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lunasistemasolarAnterior =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lunasistemasolarAnterior =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarLunaSistemaSolar")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosLunaSistemaSolarListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosLunaSistemaSolar.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.lunasistemasolar =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.lunasistemasolar);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarLunaSistemaSolar")) {
				
				}
				
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarLunaSistemaSolar")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosLunaSistemaSolar.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarLunaSistemaSolar")) {
			
			}
			
			LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessLunaSistemaSolar();
			
			LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
			
			if(sTipo.equals("NuevoLunaSistemaSolar")) {
				jButtonNuevoLunaSistemaSolarActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarLunaSistemaSolar")) {
				jButtonDuplicarLunaSistemaSolarActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarLunaSistemaSolar")) {
				jButtonCopiarLunaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormLunaSistemaSolar")) {
				jButtonVerFormLunaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesLunaSistemaSolar")) {
				jButtonNuevoLunaSistemaSolarActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarLunaSistemaSolar")) {
				jButtonModificarLunaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarLunaSistemaSolar")) {
				jButtonActualizarLunaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarLunaSistemaSolar")) {
				jButtonEliminarLunaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaLunaSistemaSolar")) {
				jButtonGuardarCambiosLunaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarLunaSistemaSolar")) {
				jButtonCancelarLunaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarLunaSistemaSolar")) {
				jButtonCerrarLunaSistemaSolarActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosLunaSistemaSolar")) {
				jButtonGuardarCambiosLunaSistemaSolarActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosLunaSistemaSolar")) {
				jButtonNuevoGuardarCambiosLunaSistemaSolarActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByLunaSistemaSolar")) {
				jButtonAbrirOrderByLunaSistemaSolarActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionLunaSistemaSolar")) {
				jButtonRecargarInformacionLunaSistemaSolarActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresLunaSistemaSolar")) {
				jButtonAnterioresLunaSistemaSolarActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesLunaSistemaSolar")) {
				jButtonSiguientesLunaSistemaSolarActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idLunaSistemaSolarBusqueda")) {
				this.jButtonidLunaSistemaSolarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_valoracionLunaSistemaSolarUpdate")) {
				this.jButtonid_tipo_valoracionLunaSistemaSolarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_valoracionLunaSistemaSolarBusqueda")) {
				this.jButtonid_tipo_valoracionLunaSistemaSolarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoLunaSistemaSolarBusqueda")) {
				this.jButtoncodigoLunaSistemaSolarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreLunaSistemaSolarBusqueda")) {
				this.jButtonnombreLunaSistemaSolarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionLunaSistemaSolarBusqueda")) {
				this.jButtondescripcionLunaSistemaSolarBusquedaActionPerformed(evt);
			}
			
			LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessLunaSistemaSolar();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameLunaSistemaSolar")) {
				closingInternalFrameLunaSistemaSolar();
				
			} else if(sTipo.equals("jButtonCancelarLunaSistemaSolar")) {
				JInternalFrameBase jInternalFrameDetalleFormLunaSistemaSolar = (JInternalFrameBase)evt.getSource();
	            	
	            LunaSistemaSolarBeanSwingJInternalFrame jInternalFrameParent=(LunaSistemaSolarBeanSwingJInternalFrame)jInternalFrameDetalleFormLunaSistemaSolar.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarLunaSistemaSolarActionPerformed(null);
			}
			
			LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.lunasistemasolar,new Object(),this.lunasistemasolarParameterGeneral,this.lunasistemasolarReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormLunaSistemaSolar(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormLunaSistemaSolar(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormLunaSistemaSolar(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.lunasistemasolar)) {
			if(!esControlTabla) {
				if(LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualLunaSistemaSolar(this.lunasistemasolar,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysLunaSistemaSolar(this.lunasistemasolar);			
				}
				
				if(this.lunasistemasolarSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualLunaSistemaSolar(this.lunasistemasolar,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.lunasistemasolarReturnGeneral=lunasistemasolarLogic.procesarEventosLunaSistemaSolarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.lunasistemasolarLogic.getLunaSistemaSolars(),this.lunasistemasolar,this.lunasistemasolarParameterGeneral,this.isEsNuevoLunaSistemaSolar,classes);//this.lunasistemasolarLogic.getLunaSistemaSolar()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanLunaSistemaSolar(this.lunasistemasolarReturnGeneral,this.lunasistemasolarBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.lunasistemasolarSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanLunaSistemaSolar(classes,this.lunasistemasolarReturnGeneral,this.lunasistemasolarBean,false);
					}
						
					if(this.lunasistemasolarReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyLunaSistemaSolar(this.lunasistemasolarReturnGeneral.getLunaSistemaSolar());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioLunaSistemaSolar(this.lunasistemasolarReturnGeneral.getLunaSistemaSolar());	
					}
						
					if(this.lunasistemasolarReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioLunaSistemaSolar(this.lunasistemasolarReturnGeneral.getLunaSistemaSolar(),classes);//this.lunasistemasolarBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioLunaSistemaSolar(this.lunasistemasolar,classes);//this.lunasistemasolarBean);									
				}
			
				if(LunaSistemaSolarJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualLunaSistemaSolar(this.lunasistemasolar,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysLunaSistemaSolar(this.lunasistemasolar);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.lunasistemasolarAnterior!=null) {
						this.lunasistemasolar=this.lunasistemasolarAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.lunasistemasolarReturnGeneral=lunasistemasolarLogic.procesarEventosLunaSistemaSolarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.lunasistemasolarLogic.getLunaSistemaSolars(),this.lunasistemasolar,this.lunasistemasolarParameterGeneral,this.isEsNuevoLunaSistemaSolar,classes);//this.lunasistemasolarLogic.getLunaSistemaSolar()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.lunasistemasolarSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.lunasistemasolarSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.lunasistemasolarReturnGeneral.getLunaSistemaSolar(),lunasistemasolarLogic.getLunaSistemaSolars());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.lunasistemasolarReturnGeneral.getLunaSistemaSolar(),this.lunasistemasolars);
				}
				//ARCHITECTURE
				
				//this.jTableDatosLunaSistemaSolar.repaint();
				
				//((AbstractTableModel) this.jTableDatosLunaSistemaSolar.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosLunaSistemaSolar();
			}
		}
	}
	
	public void actualizarVisualTableDatosLunaSistemaSolar() throws Exception {
		
		LunaSistemaSolarModel lunasistemasolarModel=(LunaSistemaSolarModel)this.jTableDatosLunaSistemaSolar.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			lunasistemasolarModel.lunasistemasolars=this.lunasistemasolarLogic.getLunaSistemaSolars();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			lunasistemasolarModel.lunasistemasolars=this.lunasistemasolars;
		}
		
		
		((LunaSistemaSolarModel) this.jTableDatosLunaSistemaSolar.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaLunaSistemaSolar() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getlunasistemasolarAnterior(),this.lunasistemasolarLogic.getLunaSistemaSolars());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getlunasistemasolarAnterior(),this.lunasistemasolars);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosLunaSistemaSolar();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioLunaSistemaSolar(LunaSistemaSolar lunasistemasolar,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
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
										
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.lunasistemasolar,new Object(),generalEntityParameterGeneral,this.lunasistemasolarReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.lunasistemasolarSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=LunaSistemaSolarConstantesFunciones.getClassesRelationshipsOfLunaSistemaSolar(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=LunaSistemaSolarConstantesFunciones.getClassesRelationshipsFromStringsOfLunaSistemaSolar(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormLunaSistemaSolar(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				LunaSistemaSolarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.lunasistemasolar,new Object(),generalEntityParameterGeneral,this.lunasistemasolarReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioLunaSistemaSolar(LunaSistemaSolarBean lunasistemasolarBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanLunaSistemaSolar(ArrayList<Classe> classes,LunaSistemaSolarReturnGeneral lunasistemasolarReturnGeneral,LunaSistemaSolarBean lunasistemasolarBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualLunaSistemaSolar(LunaSistemaSolar lunasistemasolar,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.lunasistemasolar)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormLunaSistemaSolar = new LunaSistemaSolarDetalleFormJInternalFrame(jDesktopPane,this.lunasistemasolarSessionBean.getConGuardarRelaciones(),this.lunasistemasolarSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormLunaSistemaSolar);
		this.jInternalFrameDetalleFormLunaSistemaSolar.setVisible(false);
		this.jInternalFrameDetalleFormLunaSistemaSolar.setSelected(false);						
		
		this.jInternalFrameDetalleFormLunaSistemaSolar.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormLunaSistemaSolar.lunasistemasolarLogic=this.lunasistemasolarLogic;
		
		this.cargarCombosFrameForeignKeyLunaSistemaSolar("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleLunaSistemaSolar();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleLunaSistemaSolar();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyLunaSistemaSolar("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyLunaSistemaSolar();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormLunaSistemaSolar.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarLunaSistemaSolar"));
		
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonModificarLunaSistemaSolar.addActionListener(new ButtonActionListener(this,"ModificarLunaSistemaSolar"));

		
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonModificarToolBarLunaSistemaSolar.addActionListener(new ButtonActionListener(this,"ModificarToolBarLunaSistemaSolar"));
					
		this.jInternalFrameDetalleFormLunaSistemaSolar.jMenuItemModificarLunaSistemaSolar.addActionListener(new ButtonActionListener(this,"MenuItemModificarLunaSistemaSolar"));		
		
		
		
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonActualizarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"ActualizarLunaSistemaSolar"));
		
		
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonActualizarToolBarLunaSistemaSolar.addActionListener(new ButtonActionListener(this,"ActualizarToolBarLunaSistemaSolar"));
						
		this.jInternalFrameDetalleFormLunaSistemaSolar.jMenuItemActualizarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemActualizarLunaSistemaSolar"));		
		
		
		
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonEliminarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"EliminarLunaSistemaSolar"));
		
		
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonEliminarToolBarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"EliminarToolBarLunaSistemaSolar"));
								
		this.jInternalFrameDetalleFormLunaSistemaSolar.jMenuItemEliminarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemEliminarLunaSistemaSolar"));		
		
		
		
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonCancelarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"CancelarLunaSistemaSolar"));
		
		
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonCancelarToolBarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"CancelarToolBarLunaSistemaSolar"));
					
		this.jInternalFrameDetalleFormLunaSistemaSolar.jMenuItemCancelarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemCancelarLunaSistemaSolar"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormLunaSistemaSolar.jMenuItemDetalleCerrarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarLunaSistemaSolar"));		
		
		
		
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonGuardarCambiosToolBarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarLunaSistemaSolar"));
		
		
		
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonGuardarCambiosToolBarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarLunaSistemaSolar"));
		
		
		
		this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxTiposAccionesFormularioLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioLunaSistemaSolar"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonidLunaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"idLunaSistemaSolarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonid_tipo_valoracionLunaSistemaSolarUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_valoracionLunaSistemaSolarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonid_tipo_valoracionLunaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_valoracionLunaSistemaSolarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtoncodigoLunaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"codigoLunaSistemaSolarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonnombreLunaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"nombreLunaSistemaSolarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtondescripcionLunaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"descripcionLunaSistemaSolarBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormLunaSistemaSolar.jTabbedPaneRelacionesLunaSistemaSolar.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesLunaSistemaSolar"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameLunaSistemaSolar"));
		
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLunaSistemaSolar.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarLunaSistemaSolar"));
		}
		
		this.jTableDatosLunaSistemaSolar.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarLunaSistemaSolar"));
		
		this.jTableDatosLunaSistemaSolar.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarLunaSistemaSolar"));
		
		this.jButtonNuevoLunaSistemaSolar.addActionListener(new ButtonActionListener(this,"NuevoLunaSistemaSolar"));
		
		this.jButtonDuplicarLunaSistemaSolar.addActionListener(new ButtonActionListener(this,"DuplicarLunaSistemaSolar"));
		
		this.jButtonCopiarLunaSistemaSolar.addActionListener(new ButtonActionListener(this,"CopiarLunaSistemaSolar"));
		
		this.jButtonVerFormLunaSistemaSolar.addActionListener(new ButtonActionListener(this,"VerFormLunaSistemaSolar"));
		
		
		this.jButtonNuevoToolBarLunaSistemaSolar.addActionListener(new ButtonActionListener(this,"NuevoToolBarLunaSistemaSolar"));
			
		this.jButtonDuplicarToolBarLunaSistemaSolar.addActionListener(new ButtonActionListener(this,"DuplicarToolBarLunaSistemaSolar"));
			
		this.jMenuItemNuevoLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemNuevoLunaSistemaSolar"));
			
		this.jMenuItemDuplicarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarLunaSistemaSolar"));		
		
		
		this.jButtonNuevoRelacionesLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"NuevoRelacionesLunaSistemaSolar"));
		
		
		this.jButtonNuevoRelacionesToolBarLunaSistemaSolar.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarLunaSistemaSolar"));
			
		this.jMenuItemNuevoRelacionesLunaSistemaSolar.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesLunaSistemaSolar"));		
		
		
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonModificarLunaSistemaSolar.addActionListener(new ButtonActionListener(this,"ModificarLunaSistemaSolar"));
		}
		
		
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonModificarToolBarLunaSistemaSolar.addActionListener(new ButtonActionListener(this,"ModificarToolBarLunaSistemaSolar"));
			
			this.jInternalFrameDetalleFormLunaSistemaSolar.jMenuItemModificarLunaSistemaSolar.addActionListener(new ButtonActionListener(this,"MenuItemModificarLunaSistemaSolar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonActualizarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"ActualizarLunaSistemaSolar"));
		}
		
		
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonActualizarToolBarLunaSistemaSolar.addActionListener(new ButtonActionListener(this,"ActualizarToolBarLunaSistemaSolar"));
				
			this.jInternalFrameDetalleFormLunaSistemaSolar.jMenuItemActualizarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemActualizarLunaSistemaSolar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonEliminarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"EliminarLunaSistemaSolar"));
		}
		
		
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonEliminarToolBarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"EliminarToolBarLunaSistemaSolar"));
						
			this.jInternalFrameDetalleFormLunaSistemaSolar.jMenuItemEliminarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemEliminarLunaSistemaSolar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonCancelarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"CancelarLunaSistemaSolar"));
		}
		
		
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonCancelarToolBarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"CancelarToolBarLunaSistemaSolar"));
			
			this.jInternalFrameDetalleFormLunaSistemaSolar.jMenuItemCancelarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemCancelarLunaSistemaSolar"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarLunaSistemaSolar"));		
		
		
		this.jButtonCerrarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"CerrarLunaSistemaSolar"));
		
		
		this.jButtonCerrarToolBarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"CerrarToolBarLunaSistemaSolar"));
			
		this.jMenuItemCerrarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemCerrarLunaSistemaSolar"));
			
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLunaSistemaSolar.jMenuItemDetalleCerrarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarLunaSistemaSolar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonGuardarCambiosLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"GuardarCambiosLunaSistemaSolar"));
		}
		
		
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonGuardarCambiosToolBarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarLunaSistemaSolar"));
		}
		
		this.jButtonCopiarToolBarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"CopiarToolBarLunaSistemaSolar"));
			
		this.jButtonVerFormToolBarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"VerFormToolBarLunaSistemaSolar"));
		
		this.jMenuItemGuardarCambiosLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosLunaSistemaSolar"));
			
		this.jMenuItemCopiarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemCopiarLunaSistemaSolar"));		
		
		this.jMenuItemVerFormLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemVerFormLunaSistemaSolar"));		
		
		
		this.jButtonGuardarCambiosTablaLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaLunaSistemaSolar"));
		
		
		this.jButtonGuardarCambiosTablaToolBarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarLunaSistemaSolar"));
			
		this.jMenuItemGuardarCambiosTablaLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaLunaSistemaSolar"));		
		
		
		
		this.jButtonRecargarInformacionLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"RecargarInformacionLunaSistemaSolar"));
					
		this.jButtonRecargarInformacionToolBarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarLunaSistemaSolar"));
		
		this.jMenuItemRecargarInformacionLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionLunaSistemaSolar"));		
		
		
		
		this.jButtonAnterioresLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"AnterioresLunaSistemaSolar"));
		
		
		this.jButtonAnterioresToolBarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"AnterioresToolBarLunaSistemaSolar"));
		
		this.jMenuItemAnterioresLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresLunaSistemaSolar"));		
		
		
		this.jButtonSiguientesLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"SiguientesLunaSistemaSolar"));
		
		
		this.jButtonSiguientesToolBarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"SiguientesToolBarLunaSistemaSolar"));
			
		this.jMenuItemSiguientesLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesLunaSistemaSolar"));
			
		this.jMenuItemAbrirOrderByLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByLunaSistemaSolar"));
			
		this.jMenuItemMostrarOcultarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarLunaSistemaSolar"));
			
		this.jMenuItemDetalleAbrirOrderByLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByLunaSistemaSolar"));
			
		this.jMenuItemDetalleMostarOcultarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarLunaSistemaSolar"));		
		
		
		this.jButtonNuevoGuardarCambiosLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosLunaSistemaSolar"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarLunaSistemaSolar"));
			
		this.jMenuItemNuevoGuardarCambiosLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosLunaSistemaSolar"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosLunaSistemaSolar.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosLunaSistemaSolar"));

		this.jCheckBoxSeleccionadosLunaSistemaSolar.addItemListener(new CheckBoxItemListener(this,"SeleccionadosLunaSistemaSolar"));
		
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxTiposAccionesFormularioLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioLunaSistemaSolar"));
		}
		
		
		this.jComboBoxTiposRelacionesLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"TiposRelacionesLunaSistemaSolar"));
			
		this.jComboBoxTiposAccionesLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"TiposAccionesLunaSistemaSolar"));
					
		this.jComboBoxTiposSeleccionarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"TiposSeleccionarLunaSistemaSolar"));
			
		this.jTextFieldValorCampoGeneralLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralLunaSistemaSolar"));		
		
		
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonidLunaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"idLunaSistemaSolarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonid_tipo_valoracionLunaSistemaSolarUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_valoracionLunaSistemaSolarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonid_tipo_valoracionLunaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_valoracionLunaSistemaSolarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtoncodigoLunaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"codigoLunaSistemaSolarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonnombreLunaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"nombreLunaSistemaSolarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtondescripcionLunaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"descripcionLunaSistemaSolarBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdTipoValoracionLunaSistemaSolar.addActionListener(new ButtonActionListener(this,"FK_IdTipoValoracionLunaSistemaSolar"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoLunaSistemaSolar!=null) {
				this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoLunaSistemaSolar"));
				this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoLunaSistemaSolar"));
				this.jInternalFrameReporteDinamicoLunaSistemaSolar.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoLunaSistemaSolar"));
			}
			
			//this.jButtonCerrarReporteDinamicoLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoLunaSistemaSolar"));				
			//this.jButtonGenerarReporteDinamicoLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoLunaSistemaSolar"));
			//this.jButtonGenerarExcelReporteDinamicoLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoLunaSistemaSolar"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionLunaSistemaSolar!=null) {
				this.jInternalFrameImportacionLunaSistemaSolar.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionLunaSistemaSolar"));
				this.jInternalFrameImportacionLunaSistemaSolar.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionLunaSistemaSolar"));
				this.jInternalFrameImportacionLunaSistemaSolar.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionLunaSistemaSolar"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"AbrirOrderByLunaSistemaSolar"));
			
			this.jButtonAbrirOrderByToolBarLunaSistemaSolar.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarLunaSistemaSolar"));			
			
			if(this.jInternalFrameOrderByLunaSistemaSolar!=null) {
				this.jInternalFrameOrderByLunaSistemaSolar.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByLunaSistemaSolar"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLunaSistemaSolar.jTabbedPaneRelacionesLunaSistemaSolar.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesLunaSistemaSolar"));
		
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
            		closingInternalFrameLunaSistemaSolar();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormLunaSistemaSolar.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormLunaSistemaSolar = (JInternalFrameBase)event.getSource();
	            	
	            LunaSistemaSolarBeanSwingJInternalFrame jInternalFrameParent=(LunaSistemaSolarBeanSwingJInternalFrame)jInternalFrameDetalleFormLunaSistemaSolar.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarLunaSistemaSolarActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosLunaSistemaSolar.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosLunaSistemaSolarListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosLunaSistemaSolar.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosLunaSistemaSolar.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLunaSistemaSolarActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLunaSistemaSolarActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLunaSistemaSolarActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoLunaSistemaSolar";
		inputMap = this.jButtonNuevoLunaSistemaSolar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoLunaSistemaSolar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoLunaSistemaSolarActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLunaSistemaSolarActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLunaSistemaSolarActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLunaSistemaSolarActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesLunaSistemaSolar";
		inputMap = this.jButtonNuevoRelacionesLunaSistemaSolar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesLunaSistemaSolar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoLunaSistemaSolarActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarLunaSistemaSolar";
		inputMap = this.jButtonModificarLunaSistemaSolar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarLunaSistemaSolar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarLunaSistemaSolarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarLunaSistemaSolar";
		inputMap = this.jButtonActualizarLunaSistemaSolar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarLunaSistemaSolar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarLunaSistemaSolarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarLunaSistemaSolar";
		inputMap = this.jButtonEliminarLunaSistemaSolar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarLunaSistemaSolar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarLunaSistemaSolarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarLunaSistemaSolar";
		inputMap = this.jButtonCancelarLunaSistemaSolar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarLunaSistemaSolar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarLunaSistemaSolarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarLunaSistemaSolar";
		inputMap = this.jButtonCerrarLunaSistemaSolar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarLunaSistemaSolar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarLunaSistemaSolarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonGuardarCambiosLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosLunaSistemaSolar";
		inputMap = this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonGuardarCambiosLunaSistemaSolar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonGuardarCambiosLunaSistemaSolar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosLunaSistemaSolarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosLunaSistemaSolar.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosLunaSistemaSolarItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesLunaSistemaSolar.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesLunaSistemaSolarActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarLunaSistemaSolar.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarLunaSistemaSolarActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralLunaSistemaSolar.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralLunaSistemaSolarActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonidLunaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"idLunaSistemaSolarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonid_tipo_valoracionLunaSistemaSolarUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_valoracionLunaSistemaSolarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonid_tipo_valoracionLunaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_valoracionLunaSistemaSolarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtoncodigoLunaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"codigoLunaSistemaSolarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtonnombreLunaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"nombreLunaSistemaSolarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLunaSistemaSolar.jButtondescripcionLunaSistemaSolarBusqueda.addActionListener(new ButtonActionListener(this,"descripcionLunaSistemaSolarBusqueda"));
		
		
		this.jButtonFK_IdTipoValoracionLunaSistemaSolar.addActionListener(new ButtonActionListener(this,"FK_IdTipoValoracionLunaSistemaSolar"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionLunaSistemaSolar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionLunaSistemaSolarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarLunaSistemaSolarActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarLunaSistemaSolar.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosLunaSistemaSolar(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(LunaSistemaSolar lunasistemasolarAux:this.lunasistemasolarLogic.getLunaSistemaSolars()) {
					lunasistemasolarAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LunaSistemaSolar lunasistemasolarAux:lunasistemasolars) {
					lunasistemasolarAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosLunaSistemaSolarItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingLunaSistemaSolar(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(LunaSistemaSolar lunasistemasolarAux:this.lunasistemasolarLogic.getLunaSistemaSolars()) {
						lunasistemasolarAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(LunaSistemaSolar lunasistemasolarAux:lunasistemasolars) {
						lunasistemasolarAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(LunaSistemaSolar lunasistemasolarAux:this.lunasistemasolarLogic.getLunaSistemaSolars()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(LunaSistemaSolar lunasistemasolarAux:lunasistemasolars) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaLunaSistemaSolar(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosLunaSistemaSolar.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosLunaSistemaSolar.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosLunaSistemaSolar,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosLunaSistemaSolarItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingLunaSistemaSolar(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosLunaSistemaSolar.getSelectedRows();
			
			LunaSistemaSolar lunasistemasolarLocal=new LunaSistemaSolar();
			
			//this.seleccionarTodosLunaSistemaSolar(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lunasistemasolarLocal =(LunaSistemaSolar) this.lunasistemasolarLogic.getLunaSistemaSolars().toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					lunasistemasolarLocal =(LunaSistemaSolar) this.lunasistemasolars.toArray()[this.jTableDatosLunaSistemaSolar.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				lunasistemasolarLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(LunaSistemaSolar lunasistemasolarAux:this.lunasistemasolarLogic.getLunaSistemaSolars()) {
						lunasistemasolarAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(LunaSistemaSolar lunasistemasolarAux:lunasistemasolars) {
						lunasistemasolarAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaLunaSistemaSolar(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosLunaSistemaSolar.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosLunaSistemaSolar.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosLunaSistemaSolar,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualLunaSistemaSolarItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarLunaSistemaSolarParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralLunaSistemaSolarActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingLunaSistemaSolar(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralLunaSistemaSolar.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(LunaSistemaSolar lunasistemasolarAux:this.lunasistemasolarLogic.getLunaSistemaSolars()) {
				
						if(sTipoSeleccionar.equals(LunaSistemaSolarConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							lunasistemasolarAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(LunaSistemaSolarConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							lunasistemasolarAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(LunaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							lunasistemasolarAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LunaSistemaSolar lunasistemasolarAux:lunasistemasolars) {
					
						if(sTipoSeleccionar.equals(LunaSistemaSolarConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							lunasistemasolarAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(LunaSistemaSolarConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							lunasistemasolarAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(LunaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							lunasistemasolarAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaLunaSistemaSolar(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesLunaSistemaSolarActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingLunaSistemaSolar(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioLunaSistemaSolar=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesLunaSistemaSolar.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxTiposAccionesFormularioLunaSistemaSolar.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteLunaSistemaSolar) {				
					conSplash=true;//false;										
					
					//this.startProcessLunaSistemaSolar(conSplash);
				
					this.generarReporteLunaSistemaSolarsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLunaSistemaSolar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxTiposAccionesFormularioLunaSistemaSolar.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoLunaSistemaSolarsSeleccionados();
				//this.jComboBoxTiposAccionesLunaSistemaSolar.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoLunaSistemaSolarsSeleccionados(false);
				//this.jComboBoxTiposAccionesLunaSistemaSolar.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoLunaSistemaSolarsSeleccionados(true);
				//this.jComboBoxTiposAccionesLunaSistemaSolar.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessLunaSistemaSolar();
				
				this.exportarLunaSistemaSolarsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLunaSistemaSolar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxTiposAccionesFormularioLunaSistemaSolar.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionLunaSistemaSolars();
				//this.importarLunaSistemaSolars();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLunaSistemaSolar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxTiposAccionesFormularioLunaSistemaSolar.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessLunaSistemaSolar();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelLunaSistemaSolarsSeleccionados();
				//this.jComboBoxTiposAccionesLunaSistemaSolar.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Luna Sistema Solar", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessLunaSistemaSolar();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoLunaSistemaSolar)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyLunaSistemaSolar(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Luna Sistema Solar",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLunaSistemaSolar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxTiposAccionesFormularioLunaSistemaSolar.setSelectedIndex(0);					
				}	
			} 			
			else if(LunaSistemaSolarBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteLunaSistemaSolar) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessLunaSistemaSolar(conSplash);
					
						//this.actualizarParametrosGeneralLunaSistemaSolar();
						
						this.generarReporteProcesoAccionLunaSistemaSolarsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesLunaSistemaSolar.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxTiposAccionesFormularioLunaSistemaSolar.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(LunaSistemaSolarBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Luna Sistema SolarES SELECCIONADOS?", "MANTENIMIENTO DE Luna Sistema Solar", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessLunaSistemaSolar();
				
						this.actualizarParametrosGeneralLunaSistemaSolar();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.lunasistemasolarReturnGeneral=lunasistemasolarLogic.procesarAccionLunaSistemaSolarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.lunasistemasolarLogic.getLunaSistemaSolars(),this.lunasistemasolarParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarLunaSistemaSolarReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesLunaSistemaSolar.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxTiposAccionesFormularioLunaSistemaSolar.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralLunaSistemaSolar();
					
					LunaSistemaSolarBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarLunaSistemaSolarReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesLunaSistemaSolar.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxTiposAccionesFormularioLunaSistemaSolar.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessLunaSistemaSolar(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesLunaSistemaSolarActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessLunaSistemaSolar();
			
			if(this.jInternalFrameDetalleFormLunaSistemaSolar==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<LunaSistemaSolar> lunasistemasolarsSeleccionados=new ArrayList<LunaSistemaSolar>();		
			LunaSistemaSolar lunasistemasolar=new LunaSistemaSolar();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingLunaSistemaSolar(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesLunaSistemaSolar.getSelectedItem();
			
			
			
			
			lunasistemasolarsSeleccionados=this.getLunaSistemaSolarsSeleccionados(true);
			//this.sTipoAccion;
			
			if(lunasistemasolarsSeleccionados.size()==1) {
				for(LunaSistemaSolar lunasistemasolarAux:lunasistemasolarsSeleccionados) {
					lunasistemasolar=lunasistemasolarAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessLunaSistemaSolar();
			
      		//this.finishProcessLunaSistemaSolar(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarLunaSistemaSolarReturnGeneral() throws Exception {
		if(this.lunasistemasolarReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.lunasistemasolarReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.lunasistemasolarReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.lunasistemasolarReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.lunasistemasolarReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.lunasistemasolarReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingLunaSistemaSolar(false);
		}
		
		if(this.lunasistemasolarReturnGeneral.getConRetornoLista() || this.lunasistemasolarReturnGeneral.getConRetornoObjeto()) {
			if(this.lunasistemasolarReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.lunasistemasolarLogic.setLunaSistemaSolars(this.lunasistemasolarReturnGeneral.getLunaSistemaSolars());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.lunasistemasolarReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.lunasistemasolarLogic.setLunaSistemaSolar(this.lunasistemasolarReturnGeneral.getLunaSistemaSolar());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingLunaSistemaSolar(false);
		}
	}
	
	public void actualizarParametrosGeneralLunaSistemaSolar() throws Exception {
		
		
	}
	
	public ArrayList<LunaSistemaSolar> getLunaSistemaSolarsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<LunaSistemaSolar> lunasistemasolarsSeleccionados=new ArrayList<LunaSistemaSolar>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioLunaSistemaSolar) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(LunaSistemaSolar lunasistemasolarAux:lunasistemasolarLogic.getLunaSistemaSolars()) {
					if(lunasistemasolarAux.getIsSelected()) {
						lunasistemasolarsSeleccionados.add(lunasistemasolarAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LunaSistemaSolar lunasistemasolarAux:this.lunasistemasolars) {
					if(lunasistemasolarAux.getIsSelected()) {
						lunasistemasolarsSeleccionados.add(lunasistemasolarAux);				
					}
				}
			}
			
			if(lunasistemasolarsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						lunasistemasolarsSeleccionados.addAll(this.lunasistemasolarLogic.getLunaSistemaSolars());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						lunasistemasolarsSeleccionados.addAll(this.lunasistemasolars);				
					}
				}
			}
		} else {
			lunasistemasolarsSeleccionados.add(this.lunasistemasolar);
		}
		
		return lunasistemasolarsSeleccionados;
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
	
	public void generarReporteLunaSistemaSolarsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalLunaSistemaSolarsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoLunaSistemaSolarsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoLunaSistemaSolarsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoLunaSistemaSolarsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Luna Sistema Solar",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesLunaSistemaSolarsSeleccionados() throws Exception {
		ArrayList<LunaSistemaSolar> lunasistemasolarsSeleccionados=new ArrayList<LunaSistemaSolar>();		
		
		lunasistemasolarsSeleccionados=this.getLunaSistemaSolarsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteLunaSistemaSolars("Todos",lunasistemasolarsSeleccionados);
		
	}	
	
	public void generarReporteNormalLunaSistemaSolarsSeleccionados() throws Exception {
		ArrayList<LunaSistemaSolar> lunasistemasolarsSeleccionados=new ArrayList<LunaSistemaSolar>();		
		
		lunasistemasolarsSeleccionados=this.getLunaSistemaSolarsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteLunaSistemaSolars("Todos",lunasistemasolarsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionLunaSistemaSolarsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<LunaSistemaSolar> lunasistemasolarsSeleccionados=new ArrayList<LunaSistemaSolar>();
		
		lunasistemasolarsSeleccionados=this.getLunaSistemaSolarsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteLunaSistemaSolars("Todos",lunasistemasolarsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoLunaSistemaSolarsSeleccionados() throws Exception {
		ArrayList<LunaSistemaSolar> lunasistemasolarsSeleccionados=new ArrayList<LunaSistemaSolar>();		
		
		
		this.abrirInicializarFrameReporteDinamicoLunaSistemaSolar();
		
		
		lunasistemasolarsSeleccionados=this.getLunaSistemaSolarsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoLunaSistemaSolar();
		
		
		//this.generarReporteLunaSistemaSolars("Todos",lunasistemasolarsSeleccionados ,lunasistemasolarImplementable,lunasistemasolarImplementableHome);
	}
	
	public void mostrarImportacionLunaSistemaSolars() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionLunaSistemaSolar();
		
		this.abrirFrameImportacionLunaSistemaSolar();		
		
			
		//this.generarReporteLunaSistemaSolars("Todos",lunasistemasolarsSeleccionados ,lunasistemasolarImplementable,lunasistemasolarImplementableHome);
	}
	
	public void importarLunaSistemaSolars() throws Exception {		
	
	}
	
	public void exportarLunaSistemaSolarsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelLunaSistemaSolarsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoLunaSistemaSolarsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlLunaSistemaSolarsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Luna Sistema Solar",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoLunaSistemaSolarsSeleccionados() throws Exception {
		ArrayList<LunaSistemaSolar> lunasistemasolarsSeleccionados=new ArrayList<LunaSistemaSolar>();		
		
		lunasistemasolarsSeleccionados=this.getLunaSistemaSolarsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lunasistemasolar."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarLunaSistemaSolar(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(LunaSistemaSolar lunasistemasolarAux:lunasistemasolarsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarLunaSistemaSolar(lunasistemasolarAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//lunasistemasolarAux.setsDetalleGeneralEntityReporte(lunasistemasolarAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Luna Sistema Solar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarLunaSistemaSolar(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=LunaSistemaSolarConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LunaSistemaSolarConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LunaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LunaSistemaSolarConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LunaSistemaSolarConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LunaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarLunaSistemaSolar(LunaSistemaSolar lunasistemasolar,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=lunasistemasolar.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=lunasistemasolar.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=lunasistemasolar.gettipovaloracion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=lunasistemasolar.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=lunasistemasolar.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=lunasistemasolar.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelLunaSistemaSolarsSeleccionados() throws Exception {
		ArrayList<LunaSistemaSolar> lunasistemasolarsSeleccionados=new ArrayList<LunaSistemaSolar>();		
		
		lunasistemasolarsSeleccionados=this.getLunaSistemaSolarsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lunasistemasolar.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("LunaSistemaSolars");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelLunaSistemaSolar(row);				
				iRow++;
			}				
			
			for(LunaSistemaSolar lunasistemasolarAux:lunasistemasolarsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelLunaSistemaSolar(lunasistemasolarAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Luna Sistema Solar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlLunaSistemaSolarsSeleccionados() throws Exception {
		ArrayList<LunaSistemaSolar> lunasistemasolarsSeleccionados=new ArrayList<LunaSistemaSolar>();		
		
		lunasistemasolarsSeleccionados=this.getLunaSistemaSolarsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lunasistemasolar.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("lunasistemasolars");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("lunasistemasolar");
			//elementRoot.appendChild(element);
		
			for(LunaSistemaSolar lunasistemasolarAux:lunasistemasolarsSeleccionados) {
				element = document.createElement("lunasistemasolar");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlLunaSistemaSolar(lunasistemasolarAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Luna Sistema Solar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelLunaSistemaSolar(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(LunaSistemaSolarConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(LunaSistemaSolarConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(LunaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION);
		cell = row.createCell(iColumn++);cell.setCellValue(LunaSistemaSolarConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(LunaSistemaSolarConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(LunaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelLunaSistemaSolar(LunaSistemaSolar lunasistemasolar,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(lunasistemasolar.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(lunasistemasolar.gettipovaloracion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(lunasistemasolar.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(lunasistemasolar.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(lunasistemasolar.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlLunaSistemaSolar(LunaSistemaSolar lunasistemasolar,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(LunaSistemaSolarConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(lunasistemasolar.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(LunaSistemaSolarConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(lunasistemasolar.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementtipovaloracion_descripcion = document.createElement(LunaSistemaSolarConstantesFunciones.IDTIPOVALORACION);
		elementtipovaloracion_descripcion.appendChild(document.createTextNode(lunasistemasolar.gettipovaloracion_descripcion()));
		element.appendChild(elementtipovaloracion_descripcion);

		Element elementcodigo = document.createElement(LunaSistemaSolarConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(lunasistemasolar.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(LunaSistemaSolarConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(lunasistemasolar.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(LunaSistemaSolarConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(lunasistemasolar.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoLunaSistemaSolarsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<LunaSistemaSolar> lunasistemasolarsSeleccionados=new ArrayList<LunaSistemaSolar>();
		
		lunasistemasolarsSeleccionados=this.getLunaSistemaSolarsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoLunaSistemaSolar(lunasistemasolarsSeleccionados);
		
		this.generarReporteLunaSistemaSolars("Todos",lunasistemasolarsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoLunaSistemaSolar(ArrayList<LunaSistemaSolar> lunasistemasolarsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(LunaSistemaSolar lunasistemasolarAux:lunasistemasolarsSeleccionados) {
				lunasistemasolarAux.setsDetalleGeneralEntityReporte(lunasistemasolarAux.toString());
			
				if(sTipoSeleccionar.equals(LunaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION)) {
					existe=true;
					lunasistemasolarAux.setsDescripcionGeneralEntityReporte1(lunasistemasolarAux.gettipovaloracion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LunaSistemaSolarConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					lunasistemasolarAux.setsDescripcionGeneralEntityReporte1(lunasistemasolarAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(LunaSistemaSolarConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					lunasistemasolarAux.setsDescripcionGeneralEntityReporte1(lunasistemasolarAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(LunaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					lunasistemasolarAux.setsDescripcionGeneralEntityReporte1(lunasistemasolarAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LunaSistemaSolarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesLunaSistemaSolar(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoLunaSistemaSolar=true;
				this.isVisibilidadCeldaNuevoRelacionesLunaSistemaSolar=true;
				this.isVisibilidadCeldaGuardarCambiosLunaSistemaSolar=true;
			}
			
			this.isVisibilidadCeldaModificarLunaSistemaSolar=false;
			this.isVisibilidadCeldaActualizarLunaSistemaSolar=false;
			this.isVisibilidadCeldaEliminarLunaSistemaSolar=false;
			this.isVisibilidadCeldaCancelarLunaSistemaSolar=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLunaSistemaSolar=true;
				} else {
					this.isVisibilidadCeldaGuardarLunaSistemaSolar=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoLunaSistemaSolar=false;
			this.isVisibilidadCeldaNuevoRelacionesLunaSistemaSolar=false;
			this.isVisibilidadCeldaGuardarCambiosLunaSistemaSolar=false;
			this.isVisibilidadCeldaModificarLunaSistemaSolar=false;
			this.isVisibilidadCeldaActualizarLunaSistemaSolar=true;
			this.isVisibilidadCeldaEliminarLunaSistemaSolar=false;
			this.isVisibilidadCeldaCancelarLunaSistemaSolar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLunaSistemaSolar=true;
				} else {
					this.isVisibilidadCeldaGuardarLunaSistemaSolar=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoLunaSistemaSolar=false;
			this.isVisibilidadCeldaNuevoRelacionesLunaSistemaSolar=false;
			this.isVisibilidadCeldaGuardarCambiosLunaSistemaSolar=false;
			this.isVisibilidadCeldaModificarLunaSistemaSolar=false;
			this.isVisibilidadCeldaActualizarLunaSistemaSolar=true;
			this.isVisibilidadCeldaEliminarLunaSistemaSolar=true;
			this.isVisibilidadCeldaCancelarLunaSistemaSolar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLunaSistemaSolar=true;
				} else {
					this.isVisibilidadCeldaGuardarLunaSistemaSolar=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoLunaSistemaSolar=false;
			this.isVisibilidadCeldaNuevoRelacionesLunaSistemaSolar=false;
			this.isVisibilidadCeldaGuardarCambiosLunaSistemaSolar=false;
			this.isVisibilidadCeldaModificarLunaSistemaSolar=false;
			this.isVisibilidadCeldaActualizarLunaSistemaSolar=true;
			this.isVisibilidadCeldaEliminarLunaSistemaSolar=false;
			this.isVisibilidadCeldaCancelarLunaSistemaSolar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLunaSistemaSolar=false;
				} else {
					this.isVisibilidadCeldaGuardarLunaSistemaSolar=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoLunaSistemaSolar=true;
			this.isVisibilidadCeldaNuevoRelacionesLunaSistemaSolar=true;
			this.isVisibilidadCeldaGuardarCambiosLunaSistemaSolar=true;
			this.isVisibilidadCeldaModificarLunaSistemaSolar=false;
			this.isVisibilidadCeldaActualizarLunaSistemaSolar=false;
			this.isVisibilidadCeldaEliminarLunaSistemaSolar=false;
			this.isVisibilidadCeldaCancelarLunaSistemaSolar=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLunaSistemaSolar=true;
				} else {
					this.isVisibilidadCeldaGuardarLunaSistemaSolar=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoLunaSistemaSolar=false;
			this.isVisibilidadCeldaNuevoRelacionesLunaSistemaSolar=false;
			this.isVisibilidadCeldaGuardarCambiosLunaSistemaSolar=false;
			this.isVisibilidadCeldaActualizarLunaSistemaSolar=false;
			this.isVisibilidadCeldaEliminarLunaSistemaSolar=false;
			this.isVisibilidadCeldaCancelarLunaSistemaSolar=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLunaSistemaSolar=false;
				} else {
					this.isVisibilidadCeldaGuardarLunaSistemaSolar=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoLunaSistemaSolar=false;
			this.isVisibilidadCeldaNuevoRelacionesLunaSistemaSolar=false;
			this.isVisibilidadCeldaGuardarCambiosLunaSistemaSolar=false;
			this.isVisibilidadCeldaModificarLunaSistemaSolar=true;
			this.isVisibilidadCeldaActualizarLunaSistemaSolar=false;
			this.isVisibilidadCeldaEliminarLunaSistemaSolar=false;
			this.isVisibilidadCeldaCancelarLunaSistemaSolar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLunaSistemaSolar=false;
				} else {
					this.isVisibilidadCeldaGuardarLunaSistemaSolar=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(LunaSistemaSolarJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoLunaSistemaSolar=true;
			this.isVisibilidadCeldaNuevoRelacionesLunaSistemaSolar=true;
			this.isVisibilidadCeldaGuardarCambiosLunaSistemaSolar=true;
		} else {
			this.actualizarEstadoPanelsLunaSistemaSolar(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarLunaSistemaSolar=false;
			//this.isVisibilidadCeldaVerFormLunaSistemaSolar=false;
			this.isVisibilidadCeldaDuplicarLunaSistemaSolar=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!lunasistemasolarSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesLunaSistemaSolar=false;
		} else {
			this.isVisibilidadCeldaNuevoLunaSistemaSolar=false;
			this.isVisibilidadCeldaGuardarCambiosLunaSistemaSolar=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
			if(!lunasistemasolarSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesLunaSistemaSolar=false;												
			}
			
			this.jButtonCerrarLunaSistemaSolar.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesLunaSistemaSolar=false;
		}
		
		if(!this.permiteMantenimiento(this.lunasistemasolar)) {
			this.isVisibilidadCeldaActualizarLunaSistemaSolar=false;
			this.isVisibilidadCeldaEliminarLunaSistemaSolar=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesLunaSistemaSolar() {
	}
	
	public void actualizarEstadoPanelsLunaSistemaSolar(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionLunaSistemaSolar!=null) {
				this.jScrollPanelDatosEdicionLunaSistemaSolar.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLunaSistemaSolar!=null) {
				this.jTabbedPaneBusquedasLunaSistemaSolar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLunaSistemaSolar!=null) {
				this.jScrollPanelDatosLunaSistemaSolar.setVisible(true);
			}
			
			if(this.jPanelPaginacionLunaSistemaSolar!=null) {
				this.jPanelPaginacionLunaSistemaSolar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLunaSistemaSolar!=null) {
				this.jPanelParametrosReportesLunaSistemaSolar.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionLunaSistemaSolar!=null) {
				this.jScrollPanelDatosEdicionLunaSistemaSolar.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLunaSistemaSolar!=null) {
				this.jTabbedPaneBusquedasLunaSistemaSolar.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosLunaSistemaSolar!=null) {
				this.jScrollPanelDatosLunaSistemaSolar.setVisible(false);
			}
			
			if(this.jPanelPaginacionLunaSistemaSolar!=null) {
				this.jPanelPaginacionLunaSistemaSolar.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesLunaSistemaSolar!=null) {
				this.jPanelParametrosReportesLunaSistemaSolar.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionLunaSistemaSolar!=null) {
				this.jScrollPanelDatosEdicionLunaSistemaSolar.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLunaSistemaSolar!=null) {
				this.jTabbedPaneBusquedasLunaSistemaSolar.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosLunaSistemaSolar!=null) {
				this.jScrollPanelDatosLunaSistemaSolar.setVisible(false);
			}
			
			if(this.jPanelPaginacionLunaSistemaSolar!=null) {
				this.jPanelPaginacionLunaSistemaSolar.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesLunaSistemaSolar!=null) {
				this.jPanelParametrosReportesLunaSistemaSolar.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionLunaSistemaSolar!=null) {
				this.jScrollPanelDatosEdicionLunaSistemaSolar.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLunaSistemaSolar!=null) {
				this.jTabbedPaneBusquedasLunaSistemaSolar.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosLunaSistemaSolar!=null) {
				this.jScrollPanelDatosLunaSistemaSolar.setVisible(false);
			}
			
			if(this.jPanelPaginacionLunaSistemaSolar!=null) {
				this.jPanelPaginacionLunaSistemaSolar.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesLunaSistemaSolar!=null) {
				this.jPanelParametrosReportesLunaSistemaSolar.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionLunaSistemaSolar!=null) {
				this.jScrollPanelDatosEdicionLunaSistemaSolar.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLunaSistemaSolar!=null) {
				this.jTabbedPaneBusquedasLunaSistemaSolar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLunaSistemaSolar!=null) {
				this.jScrollPanelDatosLunaSistemaSolar.setVisible(true);
			}
			
			if(this.jPanelPaginacionLunaSistemaSolar!=null) {
				this.jPanelPaginacionLunaSistemaSolar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLunaSistemaSolar!=null) {
				this.jPanelParametrosReportesLunaSistemaSolar.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionLunaSistemaSolar!=null) {
				this.jScrollPanelDatosEdicionLunaSistemaSolar.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLunaSistemaSolar!=null) {
				this.jTabbedPaneBusquedasLunaSistemaSolar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLunaSistemaSolar!=null) {
				this.jScrollPanelDatosLunaSistemaSolar.setVisible(true);
			}
			
			if(this.jPanelPaginacionLunaSistemaSolar!=null) {
				this.jPanelPaginacionLunaSistemaSolar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLunaSistemaSolar!=null) {
				this.jPanelParametrosReportesLunaSistemaSolar.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionLunaSistemaSolar!=null) {
				this.jScrollPanelDatosEdicionLunaSistemaSolar.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLunaSistemaSolar!=null) {
				this.jTabbedPaneBusquedasLunaSistemaSolar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLunaSistemaSolar!=null) {
				this.jScrollPanelDatosLunaSistemaSolar.setVisible(true);
			}
			
			if(this.jPanelPaginacionLunaSistemaSolar!=null) {
				this.jPanelPaginacionLunaSistemaSolar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLunaSistemaSolar!=null) {
				this.jPanelParametrosReportesLunaSistemaSolar.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasLunaSistemaSolar!=null) {
					this.jTabbedPaneBusquedasLunaSistemaSolar.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesLunaSistemaSolar!=null) {
				this.jPanelParametrosReportesLunaSistemaSolar.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLunaSistemaSolar!=null) {
				this.jTabbedPaneBusquedasLunaSistemaSolar.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesLunaSistemaSolar!=null) {
				this.jPanelParametrosReportesLunaSistemaSolar.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaTipoValoracion(Boolean isParaTipoValoracion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoValoracionNegation=!isParaTipoValoracion;

			this.isVisibilidadFK_IdTipoValoracion=isParaTipoValoracion;
			if(!this.isVisibilidadFK_IdTipoValoracion) {this.jTabbedPaneBusquedasLunaSistemaSolar.remove(jPanelFK_IdTipoValoracionLunaSistemaSolar);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//LunaSistemaSolarSessionBean lunasistemasolarSessionBean=new LunaSistemaSolarSessionBean();
		
		if(this.lunasistemasolarSessionBean==null) {
			this.lunasistemasolarSessionBean=new LunaSistemaSolarSessionBean();
		}
		
		this.lunasistemasolarSessionBean.setsUltimaBusquedaLunaSistemaSolar(this.getsAccionBusqueda());
		this.lunasistemasolarSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.lunasistemasolarSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdTipoValoracion")) {
			lunasistemasolarSessionBean.setid_tipo_valoracion(this.getid_tipo_valoracionFK_IdTipoValoracion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//LunaSistemaSolarSessionBean lunasistemasolarSessionBean=new LunaSistemaSolarSessionBean();
		
		if(this.lunasistemasolarSessionBean==null) {
			this.lunasistemasolarSessionBean=new LunaSistemaSolarSessionBean();
		}
		
		if(this.lunasistemasolarSessionBean.getsUltimaBusquedaLunaSistemaSolar()!=null&&!this.lunasistemasolarSessionBean.getsUltimaBusquedaLunaSistemaSolar().equals("")) {
			this.setsAccionBusqueda(lunasistemasolarSessionBean.getsUltimaBusquedaLunaSistemaSolar());
			this.setiNumeroPaginacion(lunasistemasolarSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(lunasistemasolarSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdTipoValoracion")) {
				this.setid_tipo_valoracionFK_IdTipoValoracion(lunasistemasolarSessionBean.getid_tipo_valoracion());
				lunasistemasolarSessionBean.setid_tipo_valoracion(-1L);
			}
		}
		
		this.lunasistemasolarSessionBean.setsUltimaBusquedaLunaSistemaSolar("");
		this.lunasistemasolarSessionBean.setiNumeroPaginacion(LunaSistemaSolarConstantesFunciones.INUMEROPAGINACION);
		this.lunasistemasolarSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaLunaSistemaSolar(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioLunaSistemaSolar() {
		this.updateBorderResaltarBusquedasFormularioLunaSistemaSolar();
		this.updateVisibilidadBusquedasFormularioLunaSistemaSolar();
		this.updateHabilitarBusquedasFormularioLunaSistemaSolar();
	}
	
	public void updateBorderResaltarBusquedasFormularioLunaSistemaSolar() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasLunaSistemaSolar.getComponents().length>0) {
	

		if(this.lunasistemasolarConstantesFunciones.resaltarFK_IdTipoValoracionLunaSistemaSolar!=null) {
			index= this.jTabbedPaneBusquedasLunaSistemaSolar.indexOfComponent(this.jPanelFK_IdTipoValoracionLunaSistemaSolar);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLunaSistemaSolar.getComponent(index);
				jPanel.setBorder(this.lunasistemasolarConstantesFunciones.resaltarFK_IdTipoValoracionLunaSistemaSolar);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioLunaSistemaSolar() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasLunaSistemaSolar.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasLunaSistemaSolar.indexOfComponent(this.jPanelFK_IdTipoValoracionLunaSistemaSolar);
			jPanel=(JPanel)this.jTabbedPaneBusquedasLunaSistemaSolar.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.lunasistemasolarConstantesFunciones.mostrarFK_IdTipoValoracionLunaSistemaSolar);
			if(!this.lunasistemasolarConstantesFunciones.mostrarFK_IdTipoValoracionLunaSistemaSolar && index>-1) {
				this.jTabbedPaneBusquedasLunaSistemaSolar.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioLunaSistemaSolar() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasLunaSistemaSolar.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasLunaSistemaSolar.indexOfComponent(this.jPanelFK_IdTipoValoracionLunaSistemaSolar);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasLunaSistemaSolar.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.lunasistemasolarConstantesFunciones.activarFK_IdTipoValoracionLunaSistemaSolar);
				this.jTabbedPaneBusquedasLunaSistemaSolar.setEnabledAt(index,this.lunasistemasolarConstantesFunciones.activarFK_IdTipoValoracionLunaSistemaSolar);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaLunaSistemaSolar(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTipoValoracion")) {
			index= this.jTabbedPaneBusquedasLunaSistemaSolar.indexOfComponent(this.jPanelFK_IdTipoValoracionLunaSistemaSolar);

			this.jTabbedPaneBusquedasLunaSistemaSolar.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLunaSistemaSolar.getComponent(index);

			this.lunasistemasolarConstantesFunciones.setResaltarFK_IdTipoValoracionLunaSistemaSolar(resaltar);

			jPanel.setBorder(this.lunasistemasolarConstantesFunciones.resaltarFK_IdTipoValoracionLunaSistemaSolar);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarLunaSistemaSolar.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioLunaSistemaSolar() throws Exception {

		if(this.jInternalFrameDetalleFormLunaSistemaSolar==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioLunaSistemaSolar();
		this.updateVisibilidadResaltarControlesFormularioLunaSistemaSolar();
		this.updateHabilitarResaltarControlesFormularioLunaSistemaSolar();
		
	}
	
	public void updateBorderResaltarControlesFormularioLunaSistemaSolar() throws Exception {
		if(this.jInternalFrameDetalleFormLunaSistemaSolar==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.lunasistemasolarConstantesFunciones.resaltaridLunaSistemaSolar!=null && this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {this.jInternalFrameDetalleFormLunaSistemaSolar.jTextFieldidLunaSistemaSolar.setBorder(this.lunasistemasolarConstantesFunciones.resaltaridLunaSistemaSolar);}
		if(this.lunasistemasolarConstantesFunciones.resaltarid_tipo_valoracionLunaSistemaSolar!=null && this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxid_tipo_valoracionLunaSistemaSolar.setBorder(this.lunasistemasolarConstantesFunciones.resaltarid_tipo_valoracionLunaSistemaSolar);}
		if(this.lunasistemasolarConstantesFunciones.resaltarcodigoLunaSistemaSolar!=null && this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {this.jInternalFrameDetalleFormLunaSistemaSolar.jTextFieldcodigoLunaSistemaSolar.setBorder(this.lunasistemasolarConstantesFunciones.resaltarcodigoLunaSistemaSolar);}
		if(this.lunasistemasolarConstantesFunciones.resaltarnombreLunaSistemaSolar!=null && this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {this.jInternalFrameDetalleFormLunaSistemaSolar.jTextAreanombreLunaSistemaSolar.setBorder(this.lunasistemasolarConstantesFunciones.resaltarnombreLunaSistemaSolar);}
		if(this.lunasistemasolarConstantesFunciones.resaltardescripcionLunaSistemaSolar!=null && this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {this.jInternalFrameDetalleFormLunaSistemaSolar.jTextAreadescripcionLunaSistemaSolar.setBorder(this.lunasistemasolarConstantesFunciones.resaltardescripcionLunaSistemaSolar);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioLunaSistemaSolar() throws Exception {		
		if(this.jInternalFrameDetalleFormLunaSistemaSolar==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {
	
		//this.jInternalFrameDetalleFormLunaSistemaSolar.jTextFieldidLunaSistemaSolar.setVisible(this.lunasistemasolarConstantesFunciones.mostraridLunaSistemaSolar);
		this.jInternalFrameDetalleFormLunaSistemaSolar.jPanelidLunaSistemaSolar.setVisible(this.lunasistemasolarConstantesFunciones.mostraridLunaSistemaSolar);
		//this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxid_tipo_valoracionLunaSistemaSolar.setVisible(this.lunasistemasolarConstantesFunciones.mostrarid_tipo_valoracionLunaSistemaSolar);
		this.jInternalFrameDetalleFormLunaSistemaSolar.jPanelid_tipo_valoracionLunaSistemaSolar.setVisible(this.lunasistemasolarConstantesFunciones.mostrarid_tipo_valoracionLunaSistemaSolar);
		//this.jInternalFrameDetalleFormLunaSistemaSolar.jTextFieldcodigoLunaSistemaSolar.setVisible(this.lunasistemasolarConstantesFunciones.mostrarcodigoLunaSistemaSolar);
		this.jInternalFrameDetalleFormLunaSistemaSolar.jPanelcodigoLunaSistemaSolar.setVisible(this.lunasistemasolarConstantesFunciones.mostrarcodigoLunaSistemaSolar);
		//this.jInternalFrameDetalleFormLunaSistemaSolar.jTextAreanombreLunaSistemaSolar.setVisible(this.lunasistemasolarConstantesFunciones.mostrarnombreLunaSistemaSolar);
		this.jInternalFrameDetalleFormLunaSistemaSolar.jPanelnombreLunaSistemaSolar.setVisible(this.lunasistemasolarConstantesFunciones.mostrarnombreLunaSistemaSolar);
		//this.jInternalFrameDetalleFormLunaSistemaSolar.jTextAreadescripcionLunaSistemaSolar.setVisible(this.lunasistemasolarConstantesFunciones.mostrardescripcionLunaSistemaSolar);
		this.jInternalFrameDetalleFormLunaSistemaSolar.jPaneldescripcionLunaSistemaSolar.setVisible(this.lunasistemasolarConstantesFunciones.mostrardescripcionLunaSistemaSolar);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioLunaSistemaSolar() throws Exception {
		if(this.jInternalFrameDetalleFormLunaSistemaSolar==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormLunaSistemaSolar!=null) {
	
		this.jInternalFrameDetalleFormLunaSistemaSolar.jTextFieldidLunaSistemaSolar.setEnabled(this.lunasistemasolarConstantesFunciones.activaridLunaSistemaSolar);
		this.jInternalFrameDetalleFormLunaSistemaSolar.jComboBoxid_tipo_valoracionLunaSistemaSolar.setEnabled(this.lunasistemasolarConstantesFunciones.activarid_tipo_valoracionLunaSistemaSolar);
		this.jInternalFrameDetalleFormLunaSistemaSolar.jTextFieldcodigoLunaSistemaSolar.setEnabled(this.lunasistemasolarConstantesFunciones.activarcodigoLunaSistemaSolar);
		this.jInternalFrameDetalleFormLunaSistemaSolar.jTextAreanombreLunaSistemaSolar.setEnabled(this.lunasistemasolarConstantesFunciones.activarnombreLunaSistemaSolar);
		this.jInternalFrameDetalleFormLunaSistemaSolar.jTextAreadescripcionLunaSistemaSolar.setEnabled(this.lunasistemasolarConstantesFunciones.activardescripcionLunaSistemaSolar);
		}
	}
	
		
}