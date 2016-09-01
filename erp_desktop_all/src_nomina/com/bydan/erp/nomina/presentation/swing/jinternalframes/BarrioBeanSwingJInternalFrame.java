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

import com.bydan.erp.nomina.util.BarrioConstantesFunciones;
import com.bydan.erp.nomina.util.BarrioParameterReturnGeneral;
//import com.bydan.erp.nomina.util.BarrioParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.BarrioBean;
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

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class BarrioBeanSwingJInternalFrame extends BarrioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(BarrioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Barrio> barrioValidator = new ClassValidator<Barrio>(Barrio.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Barrio barrio;	
	public Barrio barrioAux;
	public Barrio barrioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Barrio barrioTotales;
	public Long idBarrioActual;
	public Long iIdNuevoBarrio=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboProvincia="";

	public List<Provincia> provinciasForeignKey;

	public List<Provincia> getprovinciasForeignKey() {
		return provinciasForeignKey;
	}

	public void setprovinciasForeignKey(List<Provincia> provinciasForeignKey) {
		this.provinciasForeignKey = provinciasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Provincia provinciaForeignKey;

	public Provincia getprovinciaForeignKey() {
		return provinciaForeignKey;
	}

	public void setprovinciaForeignKey(Provincia provinciaForeignKey) {
		this.provinciaForeignKey = provinciaForeignKey;
	}

	public String sFinalQueryComboCanton="";

	public List<Canton> cantonsForeignKey;

	public List<Canton> getcantonsForeignKey() {
		return cantonsForeignKey;
	}

	public void setcantonsForeignKey(List<Canton> cantonsForeignKey) {
		this.cantonsForeignKey = cantonsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Canton cantonForeignKey;

	public Canton getcantonForeignKey() {
		return cantonForeignKey;
	}

	public void setcantonForeignKey(Canton cantonForeignKey) {
		this.cantonForeignKey = cantonForeignKey;
	}

	public String sFinalQueryComboParroquia="";

	public List<Parroquia> parroquiasForeignKey;

	public List<Parroquia> getparroquiasForeignKey() {
		return parroquiasForeignKey;
	}

	public void setparroquiasForeignKey(List<Parroquia> parroquiasForeignKey) {
		this.parroquiasForeignKey = parroquiasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Parroquia parroquiaForeignKey;

	public Parroquia getparroquiaForeignKey() {
		return parroquiaForeignKey;
	}

	public void setparroquiaForeignKey(Parroquia parroquiaForeignKey) {
		this.parroquiaForeignKey = parroquiaForeignKey;
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
	
	public Boolean isPermisoTodoBarrio;
	public Boolean isPermisoNuevoBarrio;
	public Boolean isPermisoActualizarBarrio;
	public Boolean isPermisoActualizarOriginalBarrio;
	public Boolean isPermisoEliminarBarrio;
	public Boolean isPermisoGuardarCambiosBarrio;
	public Boolean isPermisoConsultaBarrio;
	public Boolean isPermisoBusquedaBarrio;
	public Boolean isPermisoReporteBarrio;
	public Boolean isPermisoPaginacionMedioBarrio;
	public Boolean isPermisoPaginacionAltoBarrio;
	public Boolean isPermisoPaginacionTodoBarrio;
	public Boolean isPermisoCopiarBarrio;
	public Boolean isPermisoVerFormBarrio;
	public Boolean isPermisoDuplicarBarrio;
	public Boolean isPermisoOrdenBarrio;
	
	
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
	
	public BarrioParameterReturnGeneral barrioReturnGeneral;
	public BarrioParameterReturnGeneral barrioParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoBarrio=false;
	public Boolean esParaAccionDesdeFormularioBarrio=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected BarrioSessionBeanAdditional barrioSessionBeanAdditional=null;
	
	public BarrioSessionBeanAdditional getBarrioSessionBeanAdditional() {
		return this.barrioSessionBeanAdditional;
	}
	
	public void setBarrioSessionBeanAdditional(BarrioSessionBeanAdditional barrioSessionBeanAdditional) {
		try {
			this.barrioSessionBeanAdditional=barrioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected BarrioBeanSwingJInternalFrameAdditional barrioBeanSwingJInternalFrameAdditional=null;
	//public class BarrioBeanSwingJInternalFrame
	
	public BarrioBeanSwingJInternalFrameAdditional getBarrioBeanSwingJInternalFrameAdditional() {
		return this.barrioBeanSwingJInternalFrameAdditional;
	}
	
	public void setBarrioBeanSwingJInternalFrameAdditional(BarrioBeanSwingJInternalFrameAdditional barrioBeanSwingJInternalFrameAdditional) {
		try {
			this.barrioBeanSwingJInternalFrameAdditional=barrioBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public BarrioLogic barrioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Barrio barrioBean;
	public BarrioConstantesFunciones barrioConstantesFunciones;
	//public BarrioParameterReturnGeneral barrioReturnGeneral;
	
	//FK
	
	public ProvinciaLogic provinciaLogic;
	public CantonLogic cantonLogic;
	public ParroquiaLogic parroquiaLogic;
	
	//PARAMETROS
	
	
	//public List<Barrio> barrios;	
	//public List<Barrio> barriosEliminados;
	//public List<Barrio> barriosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoBarrio=false;
	public Boolean isVisibilidadCeldaDuplicarBarrio=true;
	public Boolean isVisibilidadCeldaCopiarBarrio=true;
	public Boolean isVisibilidadCeldaVerFormBarrio=true;
	public Boolean isVisibilidadCeldaOrdenBarrio=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesBarrio=false;
	public Boolean isVisibilidadCeldaModificarBarrio=false;
	public Boolean isVisibilidadCeldaActualizarBarrio=false;
	public Boolean isVisibilidadCeldaEliminarBarrio=false;
	public Boolean isVisibilidadCeldaCancelarBarrio=false;
	public Boolean isVisibilidadCeldaGuardarBarrio=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosBarrio=false;	
	
	
	public Boolean isVisibilidadFK_IdCanton=false;
	public Boolean isVisibilidadFK_IdParroquia=false;
	public Boolean isVisibilidadFK_IdProvincia=false;
	
	public Long getiIdNuevoBarrio() {
		return this.iIdNuevoBarrio;
	}

	public void setiIdNuevoBarrio(Long iIdNuevoBarrio) {
		this.iIdNuevoBarrio = iIdNuevoBarrio;
	}
	
	public Long getidBarrioActual() {
		return this.idBarrioActual;
	}

	public void setidBarrioActual(Long idBarrioActual) {
		this.idBarrioActual = idBarrioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Barrio getbarrio() {
		return this.barrio;
	}

	public void setbarrio(Barrio barrio) {
		this.barrio = barrio;
	}
	
	public Barrio getbarrioAux() {
		return this.barrioAux;
	}

	public void setbarrioAux(Barrio barrioAux) {
		this.barrioAux = barrioAux;
	}				
	
	public Barrio getbarrioAnterior() {
		return this.barrioAnterior;
	}

	public void setbarrioAnterior(Barrio barrioAnterior) {
		this.barrioAnterior = barrioAnterior;
	}	
	
	public Barrio getbarrioTotales() {
		return this.barrioTotales;
	}

	public void setbarrioTotales(Barrio barrioTotales) {
		this.barrioTotales = barrioTotales;
	}	
	
	public Barrio getbarrioBean() {
		return this.barrioBean;
	}

	public void setbarrioBean(Barrio barrioBean) {
		this.barrioBean = barrioBean;
	}	
	
	public BarrioParameterReturnGeneral getbarrioReturnGeneral() {
		return this.barrioReturnGeneral;
	}

	public void setbarrioReturnGeneral(BarrioParameterReturnGeneral barrioReturnGeneral) {
		this.barrioReturnGeneral = barrioReturnGeneral;
	}	
	
	
	public Long id_cantonFK_IdCanton=-1L;

	public Long getid_cantonFK_IdCanton() {
		return this.id_cantonFK_IdCanton;
	}

	public void setid_cantonFK_IdCanton(Long id_cantonFK_IdCanton) {
		this.id_cantonFK_IdCanton = id_cantonFK_IdCanton;
	}

	public Long id_parroquiaFK_IdParroquia=-1L;

	public Long getid_parroquiaFK_IdParroquia() {
		return this.id_parroquiaFK_IdParroquia;
	}

	public void setid_parroquiaFK_IdParroquia(Long id_parroquiaFK_IdParroquia) {
		this.id_parroquiaFK_IdParroquia = id_parroquiaFK_IdParroquia;
	}

	public Long id_provinciaFK_IdProvincia=-1L;

	public Long getid_provinciaFK_IdProvincia() {
		return this.id_provinciaFK_IdProvincia;
	}

	public void setid_provinciaFK_IdProvincia(Long id_provinciaFK_IdProvincia) {
		this.id_provinciaFK_IdProvincia = id_provinciaFK_IdProvincia;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public BarrioLogic getBarrioLogic()	{		
		return barrioLogic;
	}

	public void setBarrioLogic(BarrioLogic barrioLogic) {
		this.barrioLogic = barrioLogic;
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
	
	public Boolean getIsEsNuevoBarrio() {
		return isEsNuevoBarrio;
	}

	public void setIsEsNuevoBarrio(Boolean isEsNuevoBarrio) {
		this.isEsNuevoBarrio = isEsNuevoBarrio;
	}

	public Boolean getEsParaAccionDesdeFormularioBarrio() {
		return esParaAccionDesdeFormularioBarrio;
	}
	
	public void setEsParaAccionDesdeFormularioBarrio(Boolean esParaAccionDesdeFormularioBarrio) {
		this.esParaAccionDesdeFormularioBarrio = esParaAccionDesdeFormularioBarrio;
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
	
	
	public void cargarCombosProvinciasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.provinciasForeignKey=new ArrayList<Provincia>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ProvinciaLogic provinciaLogic=new ProvinciaLogic();

			provinciaLogic.getProvinciaDataAccess().setIsForForeingKeyData(true);

			if(this.barrioSessionBean==null) {
				this.barrioSessionBean=new BarrioSessionBean();
			}

			if(!this.barrioSessionBean.getisBusquedaDesdeForeignKeySesionProvincia()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					provinciaLogic.getProvinciaDataAccess().setIsForForeingKeyData(true);

					provinciaLogic.getTodosProvinciasWithConnection(sFinalQuery,new Pagination());

					this.provinciasForeignKey=provinciaLogic.getProvincias();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaProvincia(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					provinciaLogic.getEntityWithConnection(barrioSessionBean.getlidProvinciaActual());
					this.provinciasForeignKey.add(provinciaLogic.getProvincia());
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

	public void cargarCombosCantonsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cantonsForeignKey=new ArrayList<Canton>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CantonLogic cantonLogic=new CantonLogic();

			cantonLogic.getCantonDataAccess().setIsForForeingKeyData(true);

			if(this.barrioSessionBean==null) {
				this.barrioSessionBean=new BarrioSessionBean();
			}

			if(!this.barrioSessionBean.getisBusquedaDesdeForeignKeySesionCanton()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cantonLogic.getCantonDataAccess().setIsForForeingKeyData(true);

					cantonLogic.getTodosCantonsWithConnection(sFinalQuery,new Pagination());

					this.cantonsForeignKey=cantonLogic.getCantons();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCanton(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cantonLogic.getEntityWithConnection(barrioSessionBean.getlidCantonActual());
					this.cantonsForeignKey.add(cantonLogic.getCanton());
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

	public void cargarCombosParroquiasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.parroquiasForeignKey=new ArrayList<Parroquia>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ParroquiaLogic parroquiaLogic=new ParroquiaLogic();

			parroquiaLogic.getParroquiaDataAccess().setIsForForeingKeyData(true);

			if(this.barrioSessionBean==null) {
				this.barrioSessionBean=new BarrioSessionBean();
			}

			if(!this.barrioSessionBean.getisBusquedaDesdeForeignKeySesionParroquia()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parroquiaLogic.getParroquiaDataAccess().setIsForForeingKeyData(true);

					parroquiaLogic.getTodosParroquiasWithConnection(sFinalQuery,new Pagination());

					this.parroquiasForeignKey=parroquiaLogic.getParroquias();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaParroquia(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					parroquiaLogic.getEntityWithConnection(barrioSessionBean.getlidParroquiaActual());
					this.parroquiasForeignKey.add(parroquiaLogic.getParroquia());
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

	
	
	public void setActualProvinciaForeignKey(Long idProvinciaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Provincia  provinciaTemp=null;

			for(Provincia provinciaAux:provinciasForeignKey) {
				if(provinciaAux.getId()!=null && provinciaAux.getId().equals(idProvinciaSeleccionado)) {
					provinciaTemp=provinciaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(provinciaTemp!=null) {

					if(this.barrio!=null) {
						this.barrio.setProvincia(provinciaTemp);
					}

					if(this.jInternalFrameDetalleFormBarrio!=null) {
						this.jInternalFrameDetalleFormBarrio.jComboBoxid_provinciaBarrio.setSelectedItem(provinciaTemp);
					}
				} else {
					//jComboBoxid_provinciaBarrio.setSelectedItem(provinciaTemp);
					if(this.jInternalFrameDetalleFormBarrio!=null) {
						if(this.jInternalFrameDetalleFormBarrio.jComboBoxid_provinciaBarrio.getItemCount()>0) {
							this.jInternalFrameDetalleFormBarrio.jComboBoxid_provinciaBarrio.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProvincia") || sFormularioTipoBusqueda.equals("Todos")){
					if(provinciaTemp!=null && jComboBoxid_provinciaFK_IdProvinciaBarrio!=null) {
						jComboBoxid_provinciaFK_IdProvinciaBarrio.setSelectedItem(provinciaTemp);
					} else {
						if(jComboBoxid_provinciaFK_IdProvinciaBarrio!=null) {
							//jComboBoxid_provinciaFK_IdProvinciaBarrio.setSelectedItem(provinciaTemp);
							if(jComboBoxid_provinciaFK_IdProvinciaBarrio.getItemCount()>0) {
								jComboBoxid_provinciaFK_IdProvinciaBarrio.setSelectedIndex(0);
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

	public String getActualProvinciaForeignKeyDescripcion(Long idProvinciaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Provincia  provinciaTemp=null;

			for(Provincia provinciaAux:provinciasForeignKey) {
				if(provinciaAux.getId()!=null && provinciaAux.getId().equals(idProvinciaSeleccionado)) {
					provinciaTemp=provinciaAux;
					break;
				}
			}


			sDescripcion=ProvinciaConstantesFunciones.getProvinciaDescripcion(provinciaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualProvinciaForeignKeyGenerico(Long idProvinciaSeleccionado,JComboBox jComboBoxid_provinciaBarrioGenerico)throws Exception
	{
		try
		{
			Provincia  provinciaTemp=null;

			for(Provincia provinciaAux:provinciasForeignKey) {
				if(provinciaAux.getId()!=null && provinciaAux.getId().equals(idProvinciaSeleccionado)) {
					provinciaTemp=provinciaAux;
					break;
				}
			}

			if(provinciaTemp!=null) {
				jComboBoxid_provinciaBarrioGenerico.setSelectedItem(provinciaTemp);
			} else {
				if(jComboBoxid_provinciaBarrioGenerico!=null && jComboBoxid_provinciaBarrioGenerico.getItemCount()>0) {
					jComboBoxid_provinciaBarrioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCantonForeignKey(Long idCantonSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Canton  cantonTemp=null;

			for(Canton cantonAux:cantonsForeignKey) {
				if(cantonAux.getId()!=null && cantonAux.getId().equals(idCantonSeleccionado)) {
					cantonTemp=cantonAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cantonTemp!=null) {

					if(this.barrio!=null) {
						this.barrio.setCanton(cantonTemp);
					}

					if(this.jInternalFrameDetalleFormBarrio!=null) {
						this.jInternalFrameDetalleFormBarrio.jComboBoxid_cantonBarrio.setSelectedItem(cantonTemp);
					}
				} else {
					//jComboBoxid_cantonBarrio.setSelectedItem(cantonTemp);
					if(this.jInternalFrameDetalleFormBarrio!=null) {
						if(this.jInternalFrameDetalleFormBarrio.jComboBoxid_cantonBarrio.getItemCount()>0) {
							this.jInternalFrameDetalleFormBarrio.jComboBoxid_cantonBarrio.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCanton") || sFormularioTipoBusqueda.equals("Todos")){
					if(cantonTemp!=null && jComboBoxid_cantonFK_IdCantonBarrio!=null) {
						jComboBoxid_cantonFK_IdCantonBarrio.setSelectedItem(cantonTemp);
					} else {
						if(jComboBoxid_cantonFK_IdCantonBarrio!=null) {
							//jComboBoxid_cantonFK_IdCantonBarrio.setSelectedItem(cantonTemp);
							if(jComboBoxid_cantonFK_IdCantonBarrio.getItemCount()>0) {
								jComboBoxid_cantonFK_IdCantonBarrio.setSelectedIndex(0);
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

	public String getActualCantonForeignKeyDescripcion(Long idCantonSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Canton  cantonTemp=null;

			for(Canton cantonAux:cantonsForeignKey) {
				if(cantonAux.getId()!=null && cantonAux.getId().equals(idCantonSeleccionado)) {
					cantonTemp=cantonAux;
					break;
				}
			}


			sDescripcion=CantonConstantesFunciones.getCantonDescripcion(cantonTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCantonForeignKeyGenerico(Long idCantonSeleccionado,JComboBox jComboBoxid_cantonBarrioGenerico)throws Exception
	{
		try
		{
			Canton  cantonTemp=null;

			for(Canton cantonAux:cantonsForeignKey) {
				if(cantonAux.getId()!=null && cantonAux.getId().equals(idCantonSeleccionado)) {
					cantonTemp=cantonAux;
					break;
				}
			}

			if(cantonTemp!=null) {
				jComboBoxid_cantonBarrioGenerico.setSelectedItem(cantonTemp);
			} else {
				if(jComboBoxid_cantonBarrioGenerico!=null && jComboBoxid_cantonBarrioGenerico.getItemCount()>0) {
					jComboBoxid_cantonBarrioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualParroquiaForeignKey(Long idParroquiaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Parroquia  parroquiaTemp=null;

			for(Parroquia parroquiaAux:parroquiasForeignKey) {
				if(parroquiaAux.getId()!=null && parroquiaAux.getId().equals(idParroquiaSeleccionado)) {
					parroquiaTemp=parroquiaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(parroquiaTemp!=null) {

					if(this.barrio!=null) {
						this.barrio.setParroquia(parroquiaTemp);
					}

					if(this.jInternalFrameDetalleFormBarrio!=null) {
						this.jInternalFrameDetalleFormBarrio.jComboBoxid_parroquiaBarrio.setSelectedItem(parroquiaTemp);
					}
				} else {
					//jComboBoxid_parroquiaBarrio.setSelectedItem(parroquiaTemp);
					if(this.jInternalFrameDetalleFormBarrio!=null) {
						if(this.jInternalFrameDetalleFormBarrio.jComboBoxid_parroquiaBarrio.getItemCount()>0) {
							this.jInternalFrameDetalleFormBarrio.jComboBoxid_parroquiaBarrio.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdParroquia") || sFormularioTipoBusqueda.equals("Todos")){
					if(parroquiaTemp!=null && jComboBoxid_parroquiaFK_IdParroquiaBarrio!=null) {
						jComboBoxid_parroquiaFK_IdParroquiaBarrio.setSelectedItem(parroquiaTemp);
					} else {
						if(jComboBoxid_parroquiaFK_IdParroquiaBarrio!=null) {
							//jComboBoxid_parroquiaFK_IdParroquiaBarrio.setSelectedItem(parroquiaTemp);
							if(jComboBoxid_parroquiaFK_IdParroquiaBarrio.getItemCount()>0) {
								jComboBoxid_parroquiaFK_IdParroquiaBarrio.setSelectedIndex(0);
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

	public String getActualParroquiaForeignKeyDescripcion(Long idParroquiaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Parroquia  parroquiaTemp=null;

			for(Parroquia parroquiaAux:parroquiasForeignKey) {
				if(parroquiaAux.getId()!=null && parroquiaAux.getId().equals(idParroquiaSeleccionado)) {
					parroquiaTemp=parroquiaAux;
					break;
				}
			}


			sDescripcion=ParroquiaConstantesFunciones.getParroquiaDescripcion(parroquiaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualParroquiaForeignKeyGenerico(Long idParroquiaSeleccionado,JComboBox jComboBoxid_parroquiaBarrioGenerico)throws Exception
	{
		try
		{
			Parroquia  parroquiaTemp=null;

			for(Parroquia parroquiaAux:parroquiasForeignKey) {
				if(parroquiaAux.getId()!=null && parroquiaAux.getId().equals(idParroquiaSeleccionado)) {
					parroquiaTemp=parroquiaAux;
					break;
				}
			}

			if(parroquiaTemp!=null) {
				jComboBoxid_parroquiaBarrioGenerico.setSelectedItem(parroquiaTemp);
			} else {
				if(jComboBoxid_parroquiaBarrioGenerico!=null && jComboBoxid_parroquiaBarrioGenerico.getItemCount()>0) {
					jComboBoxid_parroquiaBarrioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProvinciaForeignKey(Barrio barrio,JComboBox jComboBoxid_provinciaBarrioGenerico)throws Exception
	{
		try
		{
			Provincia  provinciaAux=new Provincia();

			if(jComboBoxid_provinciaBarrioGenerico==null) {
				provinciaAux=(Provincia)this.jInternalFrameDetalleFormBarrio.jComboBoxid_provinciaBarrio.getSelectedItem();
			} else {
				provinciaAux=(Provincia)jComboBoxid_provinciaBarrioGenerico.getSelectedItem();
			}

			if(provinciaAux!=null && provinciaAux.getId()!=null) {
				barrio.setid_provincia(provinciaAux.getId());
				barrio.setprovincia_descripcion(BarrioConstantesFunciones.getProvinciaDescripcion(provinciaAux));
				barrio.setProvincia(provinciaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCantonForeignKey(Barrio barrio,JComboBox jComboBoxid_cantonBarrioGenerico)throws Exception
	{
		try
		{
			Canton  cantonAux=new Canton();

			if(jComboBoxid_cantonBarrioGenerico==null) {
				cantonAux=(Canton)this.jInternalFrameDetalleFormBarrio.jComboBoxid_cantonBarrio.getSelectedItem();
			} else {
				cantonAux=(Canton)jComboBoxid_cantonBarrioGenerico.getSelectedItem();
			}

			if(cantonAux!=null && cantonAux.getId()!=null) {
				barrio.setid_canton(cantonAux.getId());
				barrio.setcanton_descripcion(BarrioConstantesFunciones.getCantonDescripcion(cantonAux));
				barrio.setCanton(cantonAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarParroquiaForeignKey(Barrio barrio,JComboBox jComboBoxid_parroquiaBarrioGenerico)throws Exception
	{
		try
		{
			Parroquia  parroquiaAux=new Parroquia();

			if(jComboBoxid_parroquiaBarrioGenerico==null) {
				parroquiaAux=(Parroquia)this.jInternalFrameDetalleFormBarrio.jComboBoxid_parroquiaBarrio.getSelectedItem();
			} else {
				parroquiaAux=(Parroquia)jComboBoxid_parroquiaBarrioGenerico.getSelectedItem();
			}

			if(parroquiaAux!=null && parroquiaAux.getId()!=null) {
				barrio.setid_parroquia(parroquiaAux.getId());
				barrio.setparroquia_descripcion(BarrioConstantesFunciones.getParroquiaDescripcion(parroquiaAux));
				barrio.setParroquia(parroquiaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProvinciasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProvincia=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BarrioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBarrio!=null) { 
							this.jInternalFrameDetalleFormBarrio.jComboBoxid_provinciaBarrio.removeAllItems();

							for(Provincia provincia:this.provinciasForeignKey) {
								this.jInternalFrameDetalleFormBarrio.jComboBoxid_provinciaBarrio.addItem(provincia);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBarrio!=null) { 
					}

					if(!BarrioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProvincia") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!BarrioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_provinciaFK_IdProvinciaBarrio.removeAllItems();

							for(Provincia provincia:this.provinciasForeignKey) {
								this.jComboBoxid_provinciaFK_IdProvinciaBarrio.addItem(provincia);
							}
						}

						if(!BarrioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCantonsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCanton=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BarrioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBarrio!=null) { 
							this.jInternalFrameDetalleFormBarrio.jComboBoxid_cantonBarrio.removeAllItems();

							for(Canton canton:this.cantonsForeignKey) {
								this.jInternalFrameDetalleFormBarrio.jComboBoxid_cantonBarrio.addItem(canton);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBarrio!=null) { 
					}

					if(!BarrioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCanton") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!BarrioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cantonFK_IdCantonBarrio.removeAllItems();

							for(Canton canton:this.cantonsForeignKey) {
								this.jComboBoxid_cantonFK_IdCantonBarrio.addItem(canton);
							}
						}

						if(!BarrioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameParroquiasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingParroquia=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BarrioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBarrio!=null) { 
							this.jInternalFrameDetalleFormBarrio.jComboBoxid_parroquiaBarrio.removeAllItems();

							for(Parroquia parroquia:this.parroquiasForeignKey) {
								this.jInternalFrameDetalleFormBarrio.jComboBoxid_parroquiaBarrio.addItem(parroquia);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBarrio!=null) { 
					}

					if(!BarrioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdParroquia") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!BarrioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_parroquiaFK_IdParroquiaBarrio.removeAllItems();

							for(Parroquia parroquia:this.parroquiasForeignKey) {
								this.jComboBoxid_parroquiaFK_IdParroquiaBarrio.addItem(parroquia);
							}
						}

						if(!BarrioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameProvinciaForeignKey(Provincia provincia,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBarrio!=null) {
							this.jInternalFrameDetalleFormBarrio.jComboBoxid_provinciaBarrio.setSelectedItem(provincia);
						}
					} else {
						if(this.jInternalFrameDetalleFormBarrio!=null) {
							this.jInternalFrameDetalleFormBarrio.jComboBoxid_provinciaBarrio.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_provinciaFK_IdProvinciaBarrio.setSelectedItem(provincia);
						} else {
							this.jComboBoxid_provinciaFK_IdProvinciaBarrio.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCantonForeignKey(Canton canton,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBarrio!=null) {
							this.jInternalFrameDetalleFormBarrio.jComboBoxid_cantonBarrio.setSelectedItem(canton);
						}
					} else {
						if(this.jInternalFrameDetalleFormBarrio!=null) {
							this.jInternalFrameDetalleFormBarrio.jComboBoxid_cantonBarrio.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cantonFK_IdCantonBarrio.setSelectedItem(canton);
						} else {
							this.jComboBoxid_cantonFK_IdCantonBarrio.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameParroquiaForeignKey(Parroquia parroquia,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBarrio!=null) {
							this.jInternalFrameDetalleFormBarrio.jComboBoxid_parroquiaBarrio.setSelectedItem(parroquia);
						}
					} else {
						if(this.jInternalFrameDetalleFormBarrio!=null) {
							this.jInternalFrameDetalleFormBarrio.jComboBoxid_parroquiaBarrio.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_parroquiaFK_IdParroquiaBarrio.setSelectedItem(parroquia);
						} else {
							this.jComboBoxid_parroquiaFK_IdParroquiaBarrio.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesBarrio() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			BarrioConstantesFunciones.refrescarForeignKeysDescripcionesBarrio(this.barrioLogic.getBarrios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			BarrioConstantesFunciones.refrescarForeignKeysDescripcionesBarrio(this.barrios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Provincia.class));
		classes.add(new Classe(Canton.class));
		classes.add(new Classe(Parroquia.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//barrioLogic.setBarrios(this.barrios);
			barrioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public BarrioParameterReturnGeneral getBarrioParameterGeneral() {
		return this.barrioParameterGeneral;
	}
	
	public void setBarrioParameterGeneral(BarrioParameterReturnGeneral barrioParameterGeneral) {
		this.barrioParameterGeneral = barrioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoBarrio() {
		return isPermisoTodoBarrio;
	}

	public void setIsPermisoTodoBarrio(Boolean isPermisoTodoBarrio) {
		this.isPermisoTodoBarrio = isPermisoTodoBarrio;
	}

	public Boolean getIsPermisoNuevoBarrio() {
		return isPermisoNuevoBarrio;
	}

	public void setIsPermisoNuevoBarrio(Boolean isPermisoNuevoBarrio) {
		this.isPermisoNuevoBarrio = isPermisoNuevoBarrio;
	}

	public Boolean getIsPermisoActualizarBarrio() {
		return isPermisoActualizarBarrio;
	}

	public void setIsPermisoActualizarBarrio(Boolean isPermisoActualizarBarrio) {
		this.isPermisoActualizarBarrio = isPermisoActualizarBarrio;
	}

	public Boolean getIsPermisoEliminarBarrio() {
		return isPermisoEliminarBarrio;
	}

	public void setIsPermisoEliminarBarrio(Boolean isPermisoEliminarBarrio) {
		this.isPermisoEliminarBarrio = isPermisoEliminarBarrio;
	}

	public Boolean getIsPermisoGuardarCambiosBarrio() {
		return isPermisoGuardarCambiosBarrio;
	}

	public void setIsPermisoGuardarCambiosBarrio(Boolean isPermisoGuardarCambiosBarrio) {
		this.isPermisoGuardarCambiosBarrio = isPermisoGuardarCambiosBarrio;
	}
	
	public Boolean getIsPermisoConsultaBarrio() {
		return isPermisoConsultaBarrio;
	}

	public void setIsPermisoConsultaBarrio(Boolean isPermisoConsultaBarrio) {
		this.isPermisoConsultaBarrio = isPermisoConsultaBarrio;
	}

	public Boolean getIsPermisoBusquedaBarrio() {
		return isPermisoBusquedaBarrio;
	}

	public void setIsPermisoBusquedaBarrio(Boolean isPermisoBusquedaBarrio) {
		this.isPermisoBusquedaBarrio = isPermisoBusquedaBarrio;
	}

	public Boolean getIsPermisoReporteBarrio() {
		return isPermisoReporteBarrio;
	}

	public void setIsPermisoReporteBarrio(Boolean isPermisoReporteBarrio) {
		this.isPermisoReporteBarrio = isPermisoReporteBarrio;
	}
	
	public Boolean getIsPermisoPaginacionMedioBarrio() {
		return isPermisoPaginacionMedioBarrio;
	}

	public void setIsPermisoPaginacionMedioBarrio(Boolean isPermisoPaginacionMedioBarrio) {
		this.isPermisoPaginacionMedioBarrio = isPermisoPaginacionMedioBarrio;
	}
	
	public Boolean getIsPermisoPaginacionTodoBarrio() {
		return isPermisoPaginacionTodoBarrio;
	}

	public void setIsPermisoPaginacionTodoBarrio(Boolean isPermisoPaginacionTodoBarrio) {
		this.isPermisoPaginacionTodoBarrio = isPermisoPaginacionTodoBarrio;
	}
	
	public Boolean getIsPermisoPaginacionAltoBarrio() {
		return isPermisoPaginacionAltoBarrio;
	}

	public void setIsPermisoPaginacionAltoBarrio(Boolean isPermisoPaginacionAltoBarrio) {
		this.isPermisoPaginacionAltoBarrio = isPermisoPaginacionAltoBarrio;
	}
	
	public Boolean getIsPermisoCopiarBarrio() {
		return isPermisoCopiarBarrio;
	}

	public void setIsPermisoCopiarBarrio(Boolean isPermisoCopiarBarrio) {
		this.isPermisoCopiarBarrio = isPermisoCopiarBarrio;
	}
	
	public Boolean getIsPermisoVerFormBarrio() {
		return isPermisoVerFormBarrio;
	}

	public void setIsPermisoVerFormBarrio(Boolean isPermisoVerFormBarrio) {
		this.isPermisoVerFormBarrio = isPermisoVerFormBarrio;
	}
	
	public Boolean getIsPermisoDuplicarBarrio() {
		return isPermisoDuplicarBarrio;
	}

	public void setIsPermisoDuplicarBarrio(Boolean isPermisoDuplicarBarrio) {
		this.isPermisoDuplicarBarrio = isPermisoDuplicarBarrio;
	}
	
	public Boolean getIsPermisoOrdenBarrio() {
		return isPermisoOrdenBarrio;
	}

	public void setIsPermisoOrdenBarrio(Boolean isPermisoOrdenBarrio) {
		this.isPermisoOrdenBarrio = isPermisoOrdenBarrio;
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
	
	public Boolean getIsVisibilidadCeldaNuevoBarrio() {
		return isVisibilidadCeldaNuevoBarrio;
	}

	public void setIsVisibilidadCeldaNuevoBarrio(Boolean isVisibilidadCeldaNuevoBarrio) {
		this.isVisibilidadCeldaNuevoBarrio = isVisibilidadCeldaNuevoBarrio;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarBarrio() {
		return isVisibilidadCeldaDuplicarBarrio;
	}

	public void setIsVisibilidadCeldaDuplicarBarrio(Boolean isVisibilidadCeldaDuplicarBarrio) {
		this.isVisibilidadCeldaDuplicarBarrio = isVisibilidadCeldaDuplicarBarrio;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarBarrio() {
		return isVisibilidadCeldaCopiarBarrio;
	}

	public void setIsVisibilidadCeldaCopiarBarrio(Boolean isVisibilidadCeldaCopiarBarrio) {
		this.isVisibilidadCeldaCopiarBarrio = isVisibilidadCeldaCopiarBarrio;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormBarrio() {
		return isVisibilidadCeldaVerFormBarrio;
	}

	public void setIsVisibilidadCeldaVerFormBarrio(Boolean isVisibilidadCeldaVerFormBarrio) {
		this.isVisibilidadCeldaVerFormBarrio = isVisibilidadCeldaVerFormBarrio;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenBarrio() {
		return isVisibilidadCeldaOrdenBarrio;
	}

	public void setIsVisibilidadCeldaOrdenBarrio(Boolean isVisibilidadCeldaOrdenBarrio) {
		this.isVisibilidadCeldaOrdenBarrio = isVisibilidadCeldaOrdenBarrio;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesBarrio() {
		return isVisibilidadCeldaNuevoRelacionesBarrio;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesBarrio(Boolean isVisibilidadCeldaNuevoRelacionesBarrio) {
		this.isVisibilidadCeldaNuevoRelacionesBarrio = isVisibilidadCeldaNuevoRelacionesBarrio;
	}
	
	public Boolean getIsVisibilidadCeldaModificarBarrio() {
		return isVisibilidadCeldaModificarBarrio;
	}

	public void setIsVisibilidadCeldaModificarBarrio(Boolean isVisibilidadCeldaModificarBarrio) {
		this.isVisibilidadCeldaModificarBarrio = isVisibilidadCeldaModificarBarrio;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarBarrio() {
		return isVisibilidadCeldaActualizarBarrio;
	}

	public void setIsVisibilidadCeldaActualizarBarrio(Boolean isVisibilidadCeldaActualizarBarrio) {
		this.isVisibilidadCeldaActualizarBarrio = isVisibilidadCeldaActualizarBarrio;
	}

	public Boolean getIsVisibilidadCeldaEliminarBarrio() {
		return isVisibilidadCeldaEliminarBarrio;
	}

	public void setIsVisibilidadCeldaEliminarBarrio(Boolean isVisibilidadCeldaEliminarBarrio) {
		this.isVisibilidadCeldaEliminarBarrio = isVisibilidadCeldaEliminarBarrio;
	}

	public Boolean getIsVisibilidadCeldaCancelarBarrio() {
		return isVisibilidadCeldaCancelarBarrio;
	}

	public void setIsVisibilidadCeldaCancelarBarrio(Boolean isVisibilidadCeldaCancelarBarrio) {
		this.isVisibilidadCeldaCancelarBarrio = isVisibilidadCeldaCancelarBarrio;
	}

	public Boolean getIsVisibilidadCeldaGuardarBarrio() {
		return isVisibilidadCeldaGuardarBarrio;
	}

	public void setIsVisibilidadCeldaGuardarBarrio(Boolean isVisibilidadCeldaGuardarBarrio) {
		this.isVisibilidadCeldaGuardarBarrio = isVisibilidadCeldaGuardarBarrio;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosBarrio() {
		return isVisibilidadCeldaGuardarCambiosBarrio;
	}

	public void setIsVisibilidadCeldaGuardarCambiosBarrio(Boolean isVisibilidadCeldaGuardarCambiosBarrio) {
		this.isVisibilidadCeldaGuardarCambiosBarrio = isVisibilidadCeldaGuardarCambiosBarrio;
	}
		
	public BarrioSessionBean getbarrioSessionBean() {
		return this.barrioSessionBean;
	}
	
	public void setbarrioSessionBean(BarrioSessionBean barrioSessionBean) {
		this.barrioSessionBean=barrioSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCanton() {
		return this.isVisibilidadFK_IdCanton;
	}

	public void setisVisibilidadFK_IdCanton(Boolean isVisibilidadFK_IdCanton) {
		this.isVisibilidadFK_IdCanton=isVisibilidadFK_IdCanton;
	}

	public Boolean getisVisibilidadFK_IdParroquia() {
		return this.isVisibilidadFK_IdParroquia;
	}

	public void setisVisibilidadFK_IdParroquia(Boolean isVisibilidadFK_IdParroquia) {
		this.isVisibilidadFK_IdParroquia=isVisibilidadFK_IdParroquia;
	}

	public Boolean getisVisibilidadFK_IdProvincia() {
		return this.isVisibilidadFK_IdProvincia;
	}

	public void setisVisibilidadFK_IdProvincia(Boolean isVisibilidadFK_IdProvincia) {
		this.isVisibilidadFK_IdProvincia=isVisibilidadFK_IdProvincia;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysBarrio(Barrio barrio)throws Exception {
		try {
			
				this.setActualParaGuardarProvinciaForeignKey(barrio,null);
				this.setActualParaGuardarCantonForeignKey(barrio,null);
				this.setActualParaGuardarParroquiaForeignKey(barrio,null);
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
	
	public void bugActualizarReferenciaActual(Barrio barrio,Barrio barrioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalBarrio(barrio);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		barrioAux.setId(barrio.getId());
		barrioAux.setVersionRow(barrio.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessBarrio();
		
			int intSelectedRow = this.jTableDatosBarrio.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrio =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.barrio =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(BarrioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualBarrio(this.barrio,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysBarrio(this.barrio);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = barrioValidator.getInvalidValues(this.barrio);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			barrioLogic.setDatosCliente(datosCliente);
			barrioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				barrioAux=new  Barrio();
				
				barrioAux.setIsNew(true);
				barrioAux.setIsChanged(true);
				
				barrioAux.setBarrioOriginal(this.barrio);
				
				barrioAux.setId(this.barrio.getId());	
				barrioAux.setVersionRow(this.barrio.getVersionRow());	
				barrioAux.setid_provincia(this.barrio.getid_provincia());	
				barrioAux.setid_canton(this.barrio.getid_canton());	
				barrioAux.setid_parroquia(this.barrio.getid_parroquia());	
				barrioAux.setcodigo(this.barrio.getcodigo());	
				barrioAux.setnombre(this.barrio.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.barrioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.barrioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(barrioAux,barrioLogic.getBarrios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(barrioAux,barrios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.barrioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.barrioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						barrioLogic.saveBarrios();//WithConnection
						//barrioLogic.getSetVersionRowBarrios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.barrio,barrioAux);
					
					this.refrescarForeignKeysDescripcionesBarrio();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.barrioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.barrioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								barrioLogic.saveBarrioRelaciones(barrioAux);//WithConnection
								//barrioLogic.getSetVersionRowBarrios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.barrio,barrioAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.barrioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.barrioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(barrioAux,barrioLogic.getBarrios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(barrioAux,barrios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.barrio,barrioAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				barrioAux=new  Barrio();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.barrioSessionBean.getEsGuardarRelacionado() 
					|| (this.barrioSessionBean.getEsGuardarRelacionado() && this.barrio.getId()>=0)) {
						
					barrioAux.setIsNew(false);
				}
				
				barrioAux.setIsDeleted(false);
			
				barrioAux.setId(this.barrio.getId());	
				barrioAux.setVersionRow(this.barrio.getVersionRow());	
				barrioAux.setid_provincia(this.barrio.getid_provincia());	
				barrioAux.setid_canton(this.barrio.getid_canton());	
				barrioAux.setid_parroquia(this.barrio.getid_parroquia());	
				barrioAux.setcodigo(this.barrio.getcodigo());	
				barrioAux.setnombre(this.barrio.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(barrioAux,barrioLogic.getBarrios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(barrioAux,barrios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.barrioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.barrioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						barrioLogic.saveBarrios();//WithConnection
						//barrioLogic.getSetVersionRowBarrios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.barrio,barrioAux);
					
					this.refrescarForeignKeysDescripcionesBarrio();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.barrioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.barrioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								barrioLogic.saveBarrioRelaciones(barrioAux);//WithConnection
								//barrioLogic.getSetVersionRowBarrios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.barrio,barrioAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.barrioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.barrioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(barrioAux,barrioLogic.getBarrios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(barrioAux,barrios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.barrio,barrioAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				barrioAux=new  Barrio();
				
				barrioAux.setIsNew(false);
				barrioAux.setIsChanged(false);
				
				barrioAux.setIsDeleted(true);
				
				barrioAux.setId(this.barrio.getId());	
				barrioAux.setVersionRow(this.barrio.getVersionRow());	
				barrioAux.setid_provincia(this.barrio.getid_provincia());	
				barrioAux.setid_canton(this.barrio.getid_canton());	
				barrioAux.setid_parroquia(this.barrio.getid_parroquia());	
				barrioAux.setcodigo(this.barrio.getcodigo());	
				barrioAux.setnombre(this.barrio.getnombre());	
				
				if(this.barrioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.barrioAux.getId()>=0) {	
						this.barriosEliminados.add(barrioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(barrioAux,barrioLogic.getBarrios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(barrioAux,barrios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.barrioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.barrioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						barrioLogic.saveBarrios();//WithConnection
						//barrioLogic.getSetVersionRowBarrios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.barrioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.barrioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								barrioLogic.saveBarrioRelaciones(barrioAux);//WithConnection
								//barrioLogic.getSetVersionRowBarrios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.barrioSessionBean.getEstaModoGuardarRelaciones() 
								|| this.barrioSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(barrioAux,barrioLogic.getBarrios());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(barrioAux,barrios);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.getBarrios().addAll(this.barriosEliminados);
					
					barrioLogic.saveBarrios();//WithConnection
					//barrioLogic.getSetVersionRowBarrios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesBarrio();
				
				this.barriosEliminados= new ArrayList<Barrio>();		
			}
			
			if(this.barrioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.barrioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Barrio GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Barrio",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.barrio=barrioAux;
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
      		//this.finishProcessBarrio();
      	}
		
	}	
	
	public void actualizarRelaciones(Barrio barrioLocal) throws Exception {
		
		if(this.barrioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Barrio barrioLocal) throws Exception {	
		if(this.barrioSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ProvinciaDetalleFormJInternalFrame.class)) {
				ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrameLocal=(ProvinciaBeanSwingJInternalFrame) ((ProvinciaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				provinciaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProvincia(provinciaBeanSwingJInternalFrameLocal.getprovincia(),true);
				provinciaBeanSwingJInternalFrameLocal.actualizarLista(provinciaBeanSwingJInternalFrameLocal.provincia,this.provinciasForeignKey);

				provinciaBeanSwingJInternalFrameLocal.actualizarRelaciones(provinciaBeanSwingJInternalFrameLocal.provincia);

				barrioLocal.setProvincia(provinciaBeanSwingJInternalFrameLocal.provincia);

				this.addItemDefectoCombosForeignKeyProvincia();
				this.cargarCombosFrameProvinciasForeignKey("Formulario");
				this.setActualProvinciaForeignKey(provinciaBeanSwingJInternalFrameLocal.provincia.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CantonDetalleFormJInternalFrame.class)) {
				CantonBeanSwingJInternalFrame cantonBeanSwingJInternalFrameLocal=(CantonBeanSwingJInternalFrame) ((CantonDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cantonBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCanton(cantonBeanSwingJInternalFrameLocal.getcanton(),true);
				cantonBeanSwingJInternalFrameLocal.actualizarLista(cantonBeanSwingJInternalFrameLocal.canton,this.cantonsForeignKey);

				cantonBeanSwingJInternalFrameLocal.actualizarRelaciones(cantonBeanSwingJInternalFrameLocal.canton);

				barrioLocal.setCanton(cantonBeanSwingJInternalFrameLocal.canton);

				this.addItemDefectoCombosForeignKeyCanton();
				this.cargarCombosFrameCantonsForeignKey("Formulario");
				this.setActualCantonForeignKey(cantonBeanSwingJInternalFrameLocal.canton.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ParroquiaDetalleFormJInternalFrame.class)) {
				ParroquiaBeanSwingJInternalFrame parroquiaBeanSwingJInternalFrameLocal=(ParroquiaBeanSwingJInternalFrame) ((ParroquiaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				parroquiaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoParroquia(parroquiaBeanSwingJInternalFrameLocal.getparroquia(),true);
				parroquiaBeanSwingJInternalFrameLocal.actualizarLista(parroquiaBeanSwingJInternalFrameLocal.parroquia,this.parroquiasForeignKey);

				parroquiaBeanSwingJInternalFrameLocal.actualizarRelaciones(parroquiaBeanSwingJInternalFrameLocal.parroquia);

				barrioLocal.setParroquia(parroquiaBeanSwingJInternalFrameLocal.parroquia);

				this.addItemDefectoCombosForeignKeyParroquia();
				this.cargarCombosFrameParroquiasForeignKey("Formulario");
				this.setActualParroquiaForeignKey(parroquiaBeanSwingJInternalFrameLocal.parroquia.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarBarrioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosBarrio.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.barrio =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.barrio =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = barrioValidator.getInvalidValues(this.barrio);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Barrio barrio,List<Barrio> barrios) throws Exception {
		try	{		
			BarrioConstantesFunciones.actualizarLista(barrio,barrios,this.barrioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Barrio barrio,List<Barrio> barrios) throws Exception {
		try	{			
			BarrioConstantesFunciones.actualizarSelectedLista(barrio,barrios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Barrio> barriosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				barriosLocal=this.barrioLogic.getBarrios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				barriosLocal=this.barrios;
			}
			//ARCHITECTURE
		
			for(Barrio barrioLocal:barriosLocal) {
				if(this.permiteMantenimiento(barrioLocal) && barrioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+BarrioConstantesFunciones.getBarrioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(BarrioConstantesFunciones.IDPROVINCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBarrio.jLabelid_provinciaBarrio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BarrioConstantesFunciones.IDCANTON)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBarrio.jLabelid_cantonBarrio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BarrioConstantesFunciones.IDPARROQUIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBarrio.jLabelid_parroquiaBarrio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BarrioConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBarrio.jLabelcodigoBarrio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BarrioConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBarrio.jLabelnombreBarrio,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormBarrio!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBarrio.jLabelid_provinciaBarrio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBarrio.jLabelid_cantonBarrio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBarrio.jLabelid_parroquiaBarrio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBarrio.jLabelcodigoBarrio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBarrio.jLabelnombreBarrio,"");
		
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
		this.iIdNuevoBarrio--;	
		
		
		this.barrioAux=new Barrio();
		
		this.barrioAux.setId(this.iIdNuevoBarrio);
		this.barrioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.barrioLogic.getBarrios().add(this.barrioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.barrios.add(this.barrioAux);
		}
		//ARCHITECTURE
		
		this.barrio=this.barrioAux;
		
		if(BarrioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioBarrio(this.barrio);
			this.setVariablesObjetoActualToFormularioForeignKeyBarrio(this.barrio);
		}
				
		//this.setDefaultControlesBarrio();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyBarrio();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyBarrio();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyBarrio();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualBarrio(this.barrioBean,this.barrio,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysBarrio(this.barrio);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(BarrioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.barrioSessionBean.getConGuardarRelaciones()) {
			classes=BarrioConstantesFunciones.getClassesRelationshipsOfBarrio(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.barrioReturnGeneral=barrioLogic.procesarEventosBarriosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.barrioLogic.getBarrios(),this.barrio,this.barrioParameterGeneral,this.isEsNuevoBarrio,classes);//this.barrioLogic.getBarrio()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanBarrio(this.barrioReturnGeneral,this.barrioBean,false);
		
		if(this.barrioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyBarrio(this.barrioReturnGeneral.getBarrio());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioBarrio(this.barrioReturnGeneral.getBarrio());
		}
		
		if(this.barrioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioBarrio(this.barrioReturnGeneral.getBarrio(),classes);//this.barrioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualBarrio(this.barrio,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyBarrio();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyBarrio();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			BarrioBeanSwingJInternalFrameAdditional.RecargarFormBarrio(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingBarrio(false);
						
			if(barrioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(BarrioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBarrio();
			}
			
			this.actualizarVisualTableDatosBarrio();
			
			this.jTableDatosBarrio.setRowSelectionInterval(this.getIndiceNuevoBarrio(), this.getIndiceNuevoBarrio());
			
			this.seleccionarFilaTablaBarrioActual();
						
			this.actualizarEstadoCeldasBotonesBarrio("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesBarrio(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormBarrio.jTextFieldcodigoBarrio.setEnabled(isHabilitar && this.barrioConstantesFunciones.activarcodigoBarrio);
		this.jInternalFrameDetalleFormBarrio.jTextAreanombreBarrio.setEnabled(isHabilitar && this.barrioConstantesFunciones.activarnombreBarrio);	
		
		this.jInternalFrameDetalleFormBarrio.jComboBoxid_provinciaBarrio.setEnabled(isHabilitar && this.barrioConstantesFunciones.activarid_provinciaBarrio);
		this.jInternalFrameDetalleFormBarrio.jComboBoxid_cantonBarrio.setEnabled(isHabilitar && this.barrioConstantesFunciones.activarid_cantonBarrio);
		this.jInternalFrameDetalleFormBarrio.jComboBoxid_parroquiaBarrio.setEnabled(isHabilitar && this.barrioConstantesFunciones.activarid_parroquiaBarrio);
	};
	
	public void setDefaultControlesBarrio() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoBarrio(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.barrioSessionBean.setConGuardarRelaciones(true);			
			this.barrioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormBarrio.jTabbedPaneRelacionesBarrio.setVisible(true);
			
					
		} else {
			//this.barrioSessionBean.setConGuardarRelaciones(false);			
			this.barrioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormBarrio.jTabbedPaneRelacionesBarrio.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoBarrio() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Barrio barrioAux:this.barrioLogic.getBarrios()) {
				if(barrioAux.getId().equals(this.iIdNuevoBarrio)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Barrio barrioAux:this.barrios) {
				if(barrioAux.getId().equals(this.iIdNuevoBarrio)) {
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
	
	public int getIndiceActualBarrio(Barrio barrio,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Barrio barrioAux:this.barrioLogic.getBarrios()) {
				if(barrioAux.getId().equals(barrio.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Barrio barrioAux:this.barrios) {
				if(barrioAux.getId().equals(barrio.getId())) {
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
	
	public void setCamposBaseDesdeOriginalBarrio(Barrio barrioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Barrio barrioAux:this.barrioLogic.getBarrios()) {
				if(barrioAux.getBarrioOriginal().getId().equals(barrioOriginal.getId())) {
					existe=true;
					barrioOriginal.setId(barrioAux.getId());
					barrioOriginal.setVersionRow(barrioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Barrio barrioAux:this.barrios) {
				if(barrioAux.getBarrioOriginal().getId().equals(barrioOriginal.getId())) {
					existe=true;
					barrioOriginal.setId(barrioAux.getId());
					barrioOriginal.setVersionRow(barrioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosBarrio(Boolean esParaCancelar) throws Exception {
		barriosAux=new ArrayList<Barrio>();
		barrioAux=new Barrio();
		
		if(!this.barrioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Barrio barrioAux:this.barrioLogic.getBarrios()) {
					if(barrioAux.getId()<0) {
						barriosAux.add(barrioAux);
					}		
				}
				this.iIdNuevoBarrio=0L;
				this.barrioLogic.getBarrios().removeAll(barriosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Barrio barrioAux:this.barrios) {
					if(barrioAux.getId()<0) {
						barriosAux.add(barrioAux);
					}		
				}
				this.iIdNuevoBarrio=0L;
				this.barrios.removeAll(barriosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoBarrio 
					&& this.barrioLogic.getBarrios().size()>0
					) {
					barrioAux=this.barrioLogic.getBarrios().get(this.barrioLogic.getBarrios().size() - 1);
				
					if(barrioAux.getId()<0) {
						this.barrioLogic.getBarrios().remove(barrioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoBarrio && this.barrios.size()>0) {
					barrioAux=this.barrios.get(this.barrios.size() - 1);
				
					if(barrioAux.getId()<0) {
						this.barrios.remove(barrioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoBarrio(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(barrio.getId()<0) {
				this.barrioLogic.getBarrios().remove(this.barrio);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(barrio.getId()<0) {
				this.barrios.remove(this.barrio);
			}
		}			
	}
	
	public void setEstadosInicialesBarrio(List<Barrio> barriosAux) throws Exception {
		BarrioConstantesFunciones.setEstadosInicialesBarrio(barriosAux);
	}
	
	public void setEstadosInicialesBarrio(Barrio barrioAux) throws Exception {
		BarrioConstantesFunciones.setEstadosInicialesBarrio(barrioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarBarrioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesBarrio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarBarrioActual()) {
				if(!this.isEsNuevoBarrio) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesBarrio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoBarrio=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarBarrioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Barrio ?", "MANTENIMIENTO DE Barrio", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesBarrio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Barrio barrio) throws Exception {
		BarrioConstantesFunciones.seleccionarAsignar(this.barrio,barrio);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarBarrio=this.isPermisoActualizarOriginalBarrio;
			
			
			this.seleccionarAsignar(barrio);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			BarrioConstantesFunciones.quitarEspaciosBarrio(this.barrio,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesBarrio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.barrioSessionBean.setsFuncionBusquedaRapida(this.barrioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoBarrio) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosBarrio(esParaCancelar);				
				this.cancelarNuevoBarrio(esParaCancelar);								
			}
			
			this.barrio=new Barrio();
			
			this.inicializarBarrio();
			
			this.actualizarEstadoCeldasBotonesBarrio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarBarrio() throws Exception {
		try {
			BarrioConstantesFunciones.inicializarBarrio(this.barrio);
			
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
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.barrioLogic.getBarrios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteBarrios(String sAccionBusqueda,List<Barrio> barriosParaReportes) throws Exception {
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
					sPathReporteFinal="Barrio"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="BarrioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("BarrioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Barrio"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Barrios");		
		parameters.put("busquedapor", BarrioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceBarrio=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			BarrioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			BarrioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceBarrio=new JRBeanArrayDataSource(BarrioJInternalFrame.TraerBarrioBeans(barriosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceBarrio);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+BarrioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+BarrioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(BarrioBean.TraerBarrioBeans(barriosParaReportes).toArray()));
							
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
				this.generarExcelReporteBarrios(sAccionBusqueda,sTipoArchivoReporte,barriosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalBarrios(sAccionBusqueda,sTipoArchivoReporte,barriosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoBarrioActionPerformed(null);
					//this.generarExcelReporteBarrios(sAccionBusqueda,sTipoArchivoReporte,barriosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalBarrios(sAccionBusqueda,sTipoArchivoReporte,barriosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesBarrios(sAccionBusqueda,sTipoArchivoReporte,barriosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesBarrios(sAccionBusqueda,sTipoArchivoReporte,barriosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteBarrios(String sAccionBusqueda,String sTipoArchivoReporte,List<Barrio> barriosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"barrio";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Barrios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderBarrio("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Barrio barrio : barriosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			BarrioConstantesFunciones.generarExcelReporteDataBarrio("NORMAL",row,workbook,barrio,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.barrioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Barrio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderBarrio(String sTipo,Row row,Workbook workbook) {
		
		BarrioConstantesFunciones.generarExcelReporteHeaderBarrio(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalBarrios(String sAccionBusqueda,String sTipoArchivoReporte,List<Barrio> barriosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"barrio_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Barrios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Barrio barrio : barriosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(BarrioConstantesFunciones.getBarrioDescripcion(barrio));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BarrioConstantesFunciones.LABEL_IDPROVINCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BarrioConstantesFunciones.LABEL_IDPROVINCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(barrio.getprovincia_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BarrioConstantesFunciones.LABEL_IDCANTON))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BarrioConstantesFunciones.LABEL_IDCANTON);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(barrio.getcanton_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BarrioConstantesFunciones.LABEL_IDPARROQUIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BarrioConstantesFunciones.LABEL_IDPARROQUIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(barrio.getparroquia_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BarrioConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BarrioConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(barrio.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BarrioConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BarrioConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(barrio.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.barrioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Barrio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesBarrios(String sAccionBusqueda,String sTipoArchivoReporte,List<Barrio> barriosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Barrio> barriosRespaldo=null;
		
		classes=BarrioConstantesFunciones.getClassesRelationshipsOfBarrio(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.barrioLogic.setDatosCliente(this.datosCliente);
		this.barrioLogic.setDatosDeep(this.datosDeep);
		this.barrioLogic.setIsConDeep(true);
		
		barriosRespaldo=this.barrioLogic.getBarrios();
		
		this.barrioLogic.setBarrios(barriosParaReportes);	
		this.barrioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		barriosParaReportes=this.barrioLogic.getBarrios();
		this.barrioLogic.setBarrios(barriosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"barrio_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Barrios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderBarrio("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Barrio barrio : barriosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderBarrio("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			BarrioConstantesFunciones.generarExcelReporteDataBarrio("NORMAL",row,workbook,barrio,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(BarrioConstantesFunciones.getBarrioDescripcion(barrio));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.barrioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Barrio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoBarrio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBarrio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoBarrio.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBarrio.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessBarrio() throws Exception {		
		this.startProcessBarrio(true);
	}
	
	public void startProcessBarrio(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasBarrio ,this.jPanelParametrosReportesBarrio, this.jScrollPanelDatosBarrio,this.jPanelPaginacionBarrio, this.jScrollPanelDatosEdicionBarrio, this.jPanelAccionesBarrio,this.jPanelAccionesFormularioBarrio,this.jmenuBarBarrio,this.jmenuBarDetalleBarrio,this.jTtoolBarBarrio,this.jTtoolBarDetalleBarrio);		
		
		final JTabbedPane jTabbedPaneBusquedasBarrio=this.jTabbedPaneBusquedasBarrio; 
		
		final JPanel jPanelParametrosReportesBarrio=this.jPanelParametrosReportesBarrio;
		//final JScrollPane jScrollPanelDatosBarrio=this.jScrollPanelDatosBarrio;
		final JTable jTableDatosBarrio=this.jTableDatosBarrio;		
		final JPanel jPanelPaginacionBarrio=this.jPanelPaginacionBarrio;
		//final JScrollPane jScrollPanelDatosEdicionBarrio=this.jScrollPanelDatosEdicionBarrio;
		final JPanel jPanelAccionesBarrio=this.jPanelAccionesBarrio;
		
		JPanel jPanelCamposAuxiliarBarrio=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarBarrio=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormBarrio!=null) {
			jPanelCamposAuxiliarBarrio=this.jInternalFrameDetalleFormBarrio.jPanelCamposBarrio;
			jPanelAccionesFormularioAuxiliarBarrio=this.jInternalFrameDetalleFormBarrio.jPanelAccionesFormularioBarrio;
		}
		
		final JPanel jPanelCamposBarrio=jPanelCamposAuxiliarBarrio;
		final JPanel jPanelAccionesFormularioBarrio=jPanelAccionesFormularioAuxiliarBarrio;
		
		
		final JMenuBar jmenuBarBarrio=this.jmenuBarBarrio;
		final JToolBar jTtoolBarBarrio=this.jTtoolBarBarrio;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarBarrio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarBarrio=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormBarrio!=null) {
			jmenuBarDetalleAuxiliarBarrio=this.jInternalFrameDetalleFormBarrio.jmenuBarDetalleBarrio;
			jTtoolBarDetalleAuxiliarBarrio=this.jInternalFrameDetalleFormBarrio.jTtoolBarDetalleBarrio;
		}
		
		final JMenuBar jmenuBarDetalleBarrio=jmenuBarDetalleAuxiliarBarrio;
		final JToolBar jTtoolBarDetalleBarrio=jTtoolBarDetalleAuxiliarBarrio;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasBarrio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesBarrio;
			processRunnable.jTableDatos=jTableDatosBarrio;
			processRunnable.jPanelCampos=jPanelCamposBarrio;
			processRunnable.jPanelPaginacion=jPanelPaginacionBarrio;
			processRunnable.jPanelAcciones=jPanelAccionesBarrio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioBarrio;
			
			
			processRunnable.jmenuBar=jmenuBarBarrio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleBarrio;
			processRunnable.jTtoolBar=jTtoolBarBarrio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleBarrio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasBarrio ,jPanelParametrosReportesBarrio,jTableDatosBarrio, /*jScrollPanelDatosBarrio,*/jPanelCamposBarrio,jPanelPaginacionBarrio, /*jScrollPanelDatosEdicionBarrio,*/ jPanelAccionesBarrio,jPanelAccionesFormularioBarrio,jmenuBarBarrio,jmenuBarDetalleBarrio,jTtoolBarBarrio,jTtoolBarDetalleBarrio);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasBarrio ,jPanelParametrosReportesBarrio, jScrollPanelDatosBarrio,jPanelPaginacionBarrio, jScrollPanelDatosEdicionBarrio, jPanelAccionesBarrio,jPanelAccionesFormularioBarrio,jmenuBarBarrio,jmenuBarDetalleBarrio,jTtoolBarBarrio,jTtoolBarDetalleBarrio);
						
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
	
	public void finishProcessBarrio() {// throws Exception 
		this.finishProcessBarrio(true);
	}
	
	public void finishProcessBarrio(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasBarrio ,this.jPanelParametrosReportesBarrio, this.jScrollPanelDatosBarrio,this.jPanelPaginacionBarrio, this.jScrollPanelDatosEdicionBarrio, this.jPanelAccionesBarrio,this.jPanelAccionesFormularioBarrio,this.jmenuBarBarrio,this.jmenuBarDetalleBarrio,this.jTtoolBarBarrio,this.jTtoolBarDetalleBarrio);		
		
		final JTabbedPane jTabbedPaneBusquedasBarrio=this.jTabbedPaneBusquedasBarrio; 
		
		final JPanel jPanelParametrosReportesBarrio=this.jPanelParametrosReportesBarrio;
		//final JScrollPane jScrollPanelDatosBarrio=this.jScrollPanelDatosBarrio;
		final JTable jTableDatosBarrio=this.jTableDatosBarrio;		
		final JPanel jPanelPaginacionBarrio=this.jPanelPaginacionBarrio;
		//final JScrollPane jScrollPanelDatosEdicionBarrio=this.jScrollPanelDatosEdicionBarrio;
		final JPanel jPanelAccionesBarrio=this.jPanelAccionesBarrio;
		
		JPanel jPanelCamposAuxiliarBarrio=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarBarrio=new JPanel();
		
		if(this.jInternalFrameDetalleFormBarrio!=null) {
			jPanelCamposAuxiliarBarrio=this.jInternalFrameDetalleFormBarrio.jPanelCamposBarrio;
			jPanelAccionesFormularioAuxiliarBarrio=this.jInternalFrameDetalleFormBarrio.jPanelAccionesFormularioBarrio;
		}
		
		final JPanel jPanelCamposBarrio=jPanelCamposAuxiliarBarrio;
		final JPanel jPanelAccionesFormularioBarrio=jPanelAccionesFormularioAuxiliarBarrio;
		
		
		final JMenuBar jmenuBarBarrio=this.jmenuBarBarrio;		
		final JToolBar jTtoolBarBarrio=this.jTtoolBarBarrio;
				
		JMenuBar jmenuBarDetalleAuxiliarBarrio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarBarrio=new JToolBar();
		
		if(this.jInternalFrameDetalleFormBarrio!=null) {
			jmenuBarDetalleAuxiliarBarrio=this.jInternalFrameDetalleFormBarrio.jmenuBarDetalleBarrio;
			jTtoolBarDetalleAuxiliarBarrio=this.jInternalFrameDetalleFormBarrio.jTtoolBarDetalleBarrio;		
		}
		
		final JMenuBar jmenuBarDetalleBarrio=jmenuBarDetalleAuxiliarBarrio;
		final JToolBar jTtoolBarDetalleBarrio=jTtoolBarDetalleAuxiliarBarrio;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasBarrio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesBarrio;
			processRunnable.jTableDatos=jTableDatosBarrio;
			processRunnable.jPanelCampos=jPanelCamposBarrio;
			processRunnable.jPanelPaginacion=jPanelPaginacionBarrio;
			processRunnable.jPanelAcciones=jPanelAccionesBarrio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioBarrio;
			
			
			processRunnable.jmenuBar=jmenuBarBarrio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleBarrio;
			processRunnable.jTtoolBar=jTtoolBarBarrio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleBarrio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasBarrio ,jPanelParametrosReportesBarrio, jTableDatosBarrio,/*jScrollPanelDatosBarrio,*/jPanelCamposBarrio,jPanelPaginacionBarrio, /*jScrollPanelDatosEdicionBarrio,*/ jPanelAccionesBarrio,jPanelAccionesFormularioBarrio,jmenuBarBarrio,jmenuBarDetalleBarrio,jTtoolBarBarrio,jTtoolBarDetalleBarrio));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesBarrio(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarBarrio(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuBarrio(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarBarrio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarBarrio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleBarrio,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuBarrio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarBarrio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleBarrio,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.barrioConstantesFunciones.getsFinalQueryBarrio();
		String  finalQueryPaginacionTodos=this.barrioConstantesFunciones.getsFinalQueryBarrio();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=BarrioConstantesFunciones.getArrayColumnasGlobalesNoBarrio(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=BarrioConstantesFunciones.getArrayColumnasGlobalesBarrio(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,BarrioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.barriosEliminados= new ArrayList<Barrio>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessBarrio();
		
				///*BarrioSessionBean*/this.barrioSessionBean=new BarrioSessionBean();
			
			if(this.barrioSessionBean==null) {
				this.barrioSessionBean=new BarrioSessionBean();
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
					this.iNumeroPaginacion=BarrioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=BarrioConstantesFunciones.getClassesForeignKeysOfBarrio(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/barrio."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			barriosAux= new ArrayList<Barrio>();
			
				
			barrioLogic.setDatosCliente(this.datosCliente);
			barrioLogic.setDatosDeep(this.datosDeep);
			barrioLogic.setIsConDeep(true);
			
			
			barrioLogic.getBarrioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					barrioLogic.getTodosBarrios(finalQueryGlobal,pagination);
					
					//barrioLogic.getTodosBarriosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(barrioLogic.getBarrios()==null|| barrioLogic.getBarrios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							barriosAux= new ArrayList<Barrio>();
							barriosAux.addAll(barrioLogic.getBarrios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							barriosAux= new ArrayList<Barrio>();
							barriosAux.addAll(barrios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							barrioLogic.getTodosBarrios(finalQueryGlobal+"",this.pagination);												
							
							//barrioLogic.getTodosBarriosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteBarrios("Todos",barrioLogic.getBarrios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							barrioLogic.setBarrios(new ArrayList<Barrio>());					
							barrioLogic.getBarrios().addAll(barriosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							barrios=new ArrayList<Barrio>();
							barrios.addAll(barriosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idBarrio=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idBarrio=this.idActual;
				
				} else if(this.idBarrioActual!=null && this.idBarrioActual!=0L) {
					idBarrio=idBarrioActual;
				}
				
					
				this.sDetalleReporte=BarrioConstantesFunciones.getDetalleIndicePorId(idBarrio);
				
				this.barrios=new ArrayList<Barrio>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					barrioLogic.getEntity(idBarrio);
					
					//barrioLogic.getEntityWithConnection(idBarrio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					barrioLogic.setBarrios(new ArrayList<Barrio>());
					barrioLogic.getBarrios().add(barrioLogic.getBarrio());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.barrios=new ArrayList<Barrio>();
					this.barrios.add(barrio);
				}
				
				if(barrioLogic.getBarrio()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCanton")) {
				this.sDetalleReporte=BarrioConstantesFunciones.getDetalleIndiceFK_IdCanton(id_cantonFK_IdCanton);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					barrioLogic.getBarriosFK_IdCanton(finalQueryGlobal,pagination,id_cantonFK_IdCanton);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BarrioConstantesFunciones.getDetalleIndiceFK_IdCanton(id_cantonFK_IdCanton);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BarrioConstantesFunciones.getDetalleIndiceFK_IdCanton(id_cantonFK_IdCanton);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=barrioLogic.getBarrios()==null||barrioLogic.getBarrios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=barrios==null|| barrios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						barriosAux=new ArrayList<Barrio>();
						barriosAux.addAll(barrioLogic.getBarrios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							barriosAux=new ArrayList<Barrio>();
							barriosAux.addAll(barrios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							barrioLogic.getBarriosFK_IdCanton(finalQueryGlobal,pagination,id_cantonFK_IdCanton);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BarrioConstantesFunciones.getDetalleIndiceFK_IdCanton(id_cantonFK_IdCanton);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BarrioConstantesFunciones.getDetalleIndiceFK_IdCanton(id_cantonFK_IdCanton);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBarrios("FK_IdCanton",barrioLogic.getBarrios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBarrios("FK_IdCanton",barrios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						barrioLogic.setBarrios(new ArrayList<Barrio>());
						barrioLogic.getBarrios().addAll(barriosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							barrios=new ArrayList<Barrio>();
							barrios.addAll(barriosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdParroquia")) {
				this.sDetalleReporte=BarrioConstantesFunciones.getDetalleIndiceFK_IdParroquia(id_parroquiaFK_IdParroquia);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					barrioLogic.getBarriosFK_IdParroquia(finalQueryGlobal,pagination,id_parroquiaFK_IdParroquia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BarrioConstantesFunciones.getDetalleIndiceFK_IdParroquia(id_parroquiaFK_IdParroquia);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BarrioConstantesFunciones.getDetalleIndiceFK_IdParroquia(id_parroquiaFK_IdParroquia);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=barrioLogic.getBarrios()==null||barrioLogic.getBarrios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=barrios==null|| barrios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						barriosAux=new ArrayList<Barrio>();
						barriosAux.addAll(barrioLogic.getBarrios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							barriosAux=new ArrayList<Barrio>();
							barriosAux.addAll(barrios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							barrioLogic.getBarriosFK_IdParroquia(finalQueryGlobal,pagination,id_parroquiaFK_IdParroquia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BarrioConstantesFunciones.getDetalleIndiceFK_IdParroquia(id_parroquiaFK_IdParroquia);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BarrioConstantesFunciones.getDetalleIndiceFK_IdParroquia(id_parroquiaFK_IdParroquia);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBarrios("FK_IdParroquia",barrioLogic.getBarrios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBarrios("FK_IdParroquia",barrios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						barrioLogic.setBarrios(new ArrayList<Barrio>());
						barrioLogic.getBarrios().addAll(barriosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							barrios=new ArrayList<Barrio>();
							barrios.addAll(barriosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProvincia")) {
				this.sDetalleReporte=BarrioConstantesFunciones.getDetalleIndiceFK_IdProvincia(id_provinciaFK_IdProvincia);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					barrioLogic.getBarriosFK_IdProvincia(finalQueryGlobal,pagination,id_provinciaFK_IdProvincia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BarrioConstantesFunciones.getDetalleIndiceFK_IdProvincia(id_provinciaFK_IdProvincia);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BarrioConstantesFunciones.getDetalleIndiceFK_IdProvincia(id_provinciaFK_IdProvincia);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=barrioLogic.getBarrios()==null||barrioLogic.getBarrios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=barrios==null|| barrios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						barriosAux=new ArrayList<Barrio>();
						barriosAux.addAll(barrioLogic.getBarrios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							barriosAux=new ArrayList<Barrio>();
							barriosAux.addAll(barrios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							barrioLogic.getBarriosFK_IdProvincia(finalQueryGlobal,pagination,id_provinciaFK_IdProvincia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BarrioConstantesFunciones.getDetalleIndiceFK_IdProvincia(id_provinciaFK_IdProvincia);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BarrioConstantesFunciones.getDetalleIndiceFK_IdProvincia(id_provinciaFK_IdProvincia);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBarrios("FK_IdProvincia",barrioLogic.getBarrios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBarrios("FK_IdProvincia",barrios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						barrioLogic.setBarrios(new ArrayList<Barrio>());
						barrioLogic.getBarrios().addAll(barriosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							barrios=new ArrayList<Barrio>();
							barrios.addAll(barriosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesBarrio();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessBarrio();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=barrioLogic.getBarrios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=barrios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=barrioLogic.getBarrios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=barrios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Barrio barrio) {
		Boolean permite=true;
		
		if(this.barrio.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=BarrioConstantesFunciones.getOrderByListaBarrio();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=BarrioConstantesFunciones.getOrderByListaBarrio();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Barrio barrio:barrioLogic.getBarrios()) {
				if(barrio.getsType().equals(Constantes2.S_TOTALES)) {
					barrioTotales=barrio;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Barrio barrio:this.barrios) {
				if(barrio.getsType().equals(Constantes2.S_TOTALES)) {
					barrioTotales=barrio;
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
			this.barrioAux=new Barrio();
			this.barrioAux.setsType(Constantes2.S_TOTALES);
			this.barrioAux.setIsNew(false);
			this.barrioAux.setIsChanged(false);
			this.barrioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				BarrioConstantesFunciones.TotalizarValoresFilaBarrio(this.barrioLogic.getBarrios(),this.barrioAux);
				
				this.barrioLogic.getBarrios().add(this.barrioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				BarrioConstantesFunciones.TotalizarValoresFilaBarrio(this.barrios,this.barrioAux);
				
				this.barrios.add(this.barrioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		barrioTotales=new Barrio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.barrioLogic.getBarrios().remove(barrioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.barrios.remove(barrioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		barrioTotales=new Barrio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Barrio barrio:barrioLogic.getBarrios()) {
				if(barrio.getsType().equals(Constantes2.S_TOTALES)) {
					barrioTotales=barrio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				BarrioConstantesFunciones.TotalizarValoresFilaBarrio(this.barrioLogic.getBarrios(),barrioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Barrio barrio:this.barrios) {
				if(barrio.getsType().equals(Constantes2.S_TOTALES)) {
					barrioTotales=barrio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				BarrioConstantesFunciones.TotalizarValoresFilaBarrio(this.barrios,barrioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getBarriosFK_IdCanton()throws Exception {
		try {
			sAccionBusqueda="FK_IdCanton";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBarriosFK_IdParroquia()throws Exception {
		try {
			sAccionBusqueda="FK_IdParroquia";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBarriosFK_IdProvincia()throws Exception {
		try {
			sAccionBusqueda="FK_IdProvincia";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getBarriosFK_IdCanton(String sFinalQuery,Long id_canton)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					barrioLogic.getBarriosFK_IdCanton(sFinalQuery,this.pagination,id_canton);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBarriosFK_IdParroquia(String sFinalQuery,Long id_parroquia)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					barrioLogic.getBarriosFK_IdParroquia(sFinalQuery,this.pagination,id_parroquia);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBarriosFK_IdProvincia(String sFinalQuery,Long id_provincia)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					barrioLogic.getBarriosFK_IdProvincia(sFinalQuery,this.pagination,id_provincia);
				
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
	
	public void inicializarPermisosBarrio() {
		this.isPermisoTodoBarrio=false;
		this.isPermisoNuevoBarrio=false;
		this.isPermisoActualizarBarrio=false;
		this.isPermisoActualizarOriginalBarrio=false;
		this.isPermisoEliminarBarrio=false;
		this.isPermisoGuardarCambiosBarrio=false;
		this.isPermisoConsultaBarrio=false;
		this.isPermisoBusquedaBarrio=false;
		this.isPermisoReporteBarrio=false;		
		this.isPermisoOrdenBarrio=false;		
		this.isPermisoPaginacionMedioBarrio=false;		
		this.isPermisoPaginacionAltoBarrio=false;
		this.isPermisoPaginacionTodoBarrio=false;
		this.isPermisoCopiarBarrio=false;		
		this.isPermisoVerFormBarrio=false;		
		this.isPermisoDuplicarBarrio=false;		
		this.isPermisoOrdenBarrio=false;		
	}
	
	public void setPermisosUsuarioBarrio(Boolean isPermiso) {
		this.isPermisoTodoBarrio=isPermiso;
		this.isPermisoNuevoBarrio=isPermiso;
		this.isPermisoActualizarBarrio=isPermiso;
		this.isPermisoActualizarOriginalBarrio=isPermiso;
		this.isPermisoEliminarBarrio=isPermiso;
		this.isPermisoGuardarCambiosBarrio=isPermiso;
		this.isPermisoConsultaBarrio=isPermiso;
		this.isPermisoBusquedaBarrio=isPermiso;
		this.isPermisoReporteBarrio=isPermiso;
		this.isPermisoOrdenBarrio=isPermiso;		
		this.isPermisoPaginacionMedioBarrio=isPermiso;		
		this.isPermisoPaginacionAltoBarrio=isPermiso;		
		this.isPermisoPaginacionTodoBarrio=isPermiso;		
		this.isPermisoCopiarBarrio=isPermiso;		
		this.isPermisoVerFormBarrio=isPermiso;		
		this.isPermisoDuplicarBarrio=isPermiso;
		this.isPermisoOrdenBarrio=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioBarrio(Boolean isPermiso) {
		//this.isPermisoTodoBarrio=isPermiso;
		this.isPermisoNuevoBarrio=isPermiso;
		this.isPermisoActualizarBarrio=isPermiso;
		this.isPermisoActualizarOriginalBarrio=isPermiso;
		this.isPermisoEliminarBarrio=isPermiso;
		this.isPermisoGuardarCambiosBarrio=isPermiso;
		//this.isPermisoConsultaBarrio=isPermiso;
		//this.isPermisoBusquedaBarrio=isPermiso;
		//this.isPermisoReporteBarrio=isPermiso;
		//this.isPermisoOrdenBarrio=isPermiso;		
		//this.isPermisoPaginacionMedioBarrio=isPermiso;		
		//this.isPermisoPaginacionAltoBarrio=isPermiso;		
		//this.isPermisoPaginacionTodoBarrio=isPermiso;		
		//this.isPermisoCopiarBarrio=isPermiso;		
		//this.isPermisoDuplicarBarrio=isPermiso;
		//this.isPermisoOrdenBarrio=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioBarrioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(BarrioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebBarrio(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioBarrioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioBarrioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionBarrioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioBarrioClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioBarrio() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(BarrioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.barrioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, BarrioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoBarrio=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarBarrio=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalBarrio=this.isPermisoActualizarBarrio;
			this.isPermisoEliminarBarrio=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosBarrio=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaBarrio=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaBarrio=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoBarrio=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteBarrio=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenBarrio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioBarrio=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoBarrio=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoBarrio=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarBarrio=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormBarrio=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarBarrio=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenBarrio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.barrioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosBarrio.setToolTipText(this.jTableDatosBarrio.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioBarrio(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioBarrio(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(BarrioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(BarrioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioBarrio() throws Exception {
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
	public void inicializarCombosForeignKeyBarrioListas()throws Exception {
		try	{						
			
				this.provinciasForeignKey=new ArrayList();
				this.cantonsForeignKey=new ArrayList();
				this.parroquiasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyBarrioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(BarrioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyBarrioListas(false);
			} else {
			
				this.cargarCombosForeignKeyProvinciaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCantonListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyParroquiaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyProvinciaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.provinciasForeignKey==null||this.provinciasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ProvinciaConstantesFunciones.getArrayColumnasGlobalesProvincia(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProvinciaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ProvinciaConstantesFunciones.SFINALQUERY;

				this.cargarCombosProvinciasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCantonListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cantonsForeignKey==null||this.cantonsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CantonConstantesFunciones.getArrayColumnasGlobalesCanton(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CantonConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CantonConstantesFunciones.SFINALQUERY;

				this.cargarCombosCantonsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyParroquiaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.parroquiasForeignKey==null||this.parroquiasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ParroquiaConstantesFunciones.getArrayColumnasGlobalesParroquia(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ParroquiaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ParroquiaConstantesFunciones.SFINALQUERY;

				this.cargarCombosParroquiasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyBarrioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			BarrioParameterReturnGeneral barrioReturnGeneral=new BarrioParameterReturnGeneral();
						
			


				String finalQueryGlobalProvincia="";

				if(((this.provinciasForeignKey==null||this.provinciasForeignKey.size()<=0) && this.barrioConstantesFunciones.cargarid_provinciaBarrio)
					 || (this.esRecargarFks && this.barrioConstantesFunciones.cargarid_provinciaBarrio)) {

					if(!this.barrioSessionBean.getisBusquedaDesdeForeignKeySesionProvincia()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProvinciaConstantesFunciones.getArrayColumnasGlobalesProvincia(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProvincia=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProvinciaConstantesFunciones.TABLENAME);

						finalQueryGlobalProvincia=Funciones.GetFinalQueryAppend(finalQueryGlobalProvincia, "");
						finalQueryGlobalProvincia+=ProvinciaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProvinciasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProvincia=" WHERE " + ConstantesSql.ID + "="+barrioSessionBean.getlidProvinciaActual();
					}
				} else {
					finalQueryGlobalProvincia="NONE";
				}


				String finalQueryGlobalCanton="";

				if(((this.cantonsForeignKey==null||this.cantonsForeignKey.size()<=0) && this.barrioConstantesFunciones.cargarid_cantonBarrio)
					 || (this.esRecargarFks && this.barrioConstantesFunciones.cargarid_cantonBarrio)) {

					if(!this.barrioSessionBean.getisBusquedaDesdeForeignKeySesionCanton()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CantonConstantesFunciones.getArrayColumnasGlobalesCanton(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCanton=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CantonConstantesFunciones.TABLENAME);

						finalQueryGlobalCanton=Funciones.GetFinalQueryAppend(finalQueryGlobalCanton, "");
						finalQueryGlobalCanton+=CantonConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCantonsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCanton=" WHERE " + ConstantesSql.ID + "="+barrioSessionBean.getlidCantonActual();
					}
				} else {
					finalQueryGlobalCanton="NONE";
				}


				String finalQueryGlobalParroquia="";

				if(((this.parroquiasForeignKey==null||this.parroquiasForeignKey.size()<=0) && this.barrioConstantesFunciones.cargarid_parroquiaBarrio)
					 || (this.esRecargarFks && this.barrioConstantesFunciones.cargarid_parroquiaBarrio)) {

					if(!this.barrioSessionBean.getisBusquedaDesdeForeignKeySesionParroquia()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ParroquiaConstantesFunciones.getArrayColumnasGlobalesParroquia(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalParroquia=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ParroquiaConstantesFunciones.TABLENAME);

						finalQueryGlobalParroquia=Funciones.GetFinalQueryAppend(finalQueryGlobalParroquia, "");
						finalQueryGlobalParroquia+=ParroquiaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosParroquiasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalParroquia=" WHERE " + ConstantesSql.ID + "="+barrioSessionBean.getlidParroquiaActual();
					}
				} else {
					finalQueryGlobalParroquia="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				barrioReturnGeneral=barrioLogic.cargarCombosLoteForeignKeyBarrio(finalQueryGlobalProvincia,finalQueryGlobalCanton,finalQueryGlobalParroquia);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalProvincia.equals("NONE")) {
				this.provinciasForeignKey=barrioReturnGeneral.getprovinciasForeignKey();
			}

			if(!finalQueryGlobalCanton.equals("NONE")) {
				this.cantonsForeignKey=barrioReturnGeneral.getcantonsForeignKey();
			}

			if(!finalQueryGlobalParroquia.equals("NONE")) {
				this.parroquiasForeignKey=barrioReturnGeneral.getparroquiasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyBarrio()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyProvincia();
			this.addItemDefectoCombosForeignKeyCanton();
			this.addItemDefectoCombosForeignKeyParroquia();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyProvincia()throws Exception {
		try {
			if(this.barrioSessionBean==null) {
				this.barrioSessionBean=new BarrioSessionBean();
			}

			if(!this.barrioSessionBean.getisBusquedaDesdeForeignKeySesionProvincia()) {
				Provincia provincia=new Provincia();
				ProvinciaConstantesFunciones.setProvinciaDescripcion(provincia,Constantes.SMENSAJE_ESCOJA_OPCION);
				provincia.setId(null);

				if(!ProvinciaConstantesFunciones.ExisteEnLista(this.provinciasForeignKey,provincia,true)) {

					this.provinciasForeignKey.add(0,provincia);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCanton()throws Exception {
		try {

			if(!this.barrioSessionBean.getisBusquedaDesdeForeignKeySesionCanton()) {
				Canton canton=new Canton();
				CantonConstantesFunciones.setCantonDescripcion(canton,Constantes.SMENSAJE_ESCOJA_OPCION);
				canton.setId(null);

				if(!CantonConstantesFunciones.ExisteEnLista(this.cantonsForeignKey,canton,true)) {

					this.cantonsForeignKey.add(0,canton);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyParroquia()throws Exception {
		try {

			if(!this.barrioSessionBean.getisBusquedaDesdeForeignKeySesionParroquia()) {
				Parroquia parroquia=new Parroquia();
				ParroquiaConstantesFunciones.setParroquiaDescripcion(parroquia,Constantes.SMENSAJE_ESCOJA_OPCION);
				parroquia.setId(null);

				if(!ParroquiaConstantesFunciones.ExisteEnLista(this.parroquiasForeignKey,parroquia,true)) {

					this.parroquiasForeignKey.add(0,parroquia);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyBarrio()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyBarrio(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyBarrio()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyBarrio();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyBarrio(Barrio barrio)throws Exception {	
		try {
			
			this.setActualProvinciaForeignKey(barrio.getid_provincia(),false,"Formulario");
			this.setActualCantonForeignKey(barrio.getid_canton(),false,"Formulario");
			this.setActualParroquiaForeignKey(barrio.getid_parroquia(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyBarrio(Barrio barrio,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyBarrio()throws Exception {	
		try {
			
			this.setActualProvinciaForeignKey(this.barrioConstantesFunciones.getid_provincia(),false,"Formulario");
			this.setActualCantonForeignKey(this.barrioConstantesFunciones.getid_canton(),false,"Formulario");
			this.setActualParroquiaForeignKey(this.barrioConstantesFunciones.getid_parroquia(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyBarrio()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyBarrio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyBarrio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroBarrio()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyBarrio()throws Exception {
		try {
			

			this.cargarCombosFrameProvinciasForeignKey("Todos");
			this.cargarCombosFrameCantonsForeignKey("Todos");
			this.cargarCombosFrameParroquiasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyBarrio(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameProvinciasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCantonsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameParroquiasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyBarrio()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormBarrio.jComboBoxid_provinciaBarrio!=null && this.jInternalFrameDetalleFormBarrio.jComboBoxid_provinciaBarrio.getItemCount()>0) {
				this.jInternalFrameDetalleFormBarrio.jComboBoxid_provinciaBarrio.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBarrio.jComboBoxid_cantonBarrio!=null && this.jInternalFrameDetalleFormBarrio.jComboBoxid_cantonBarrio.getItemCount()>0) {
				this.jInternalFrameDetalleFormBarrio.jComboBoxid_cantonBarrio.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBarrio.jComboBoxid_parroquiaBarrio!=null && this.jInternalFrameDetalleFormBarrio.jComboBoxid_parroquiaBarrio.getItemCount()>0) {
				this.jInternalFrameDetalleFormBarrio.jComboBoxid_parroquiaBarrio.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public BarrioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public BarrioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public BarrioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.barrioSessionBean=new BarrioSessionBean(); 
		this.barrioConstantesFunciones=new BarrioConstantesFunciones(); 
		this.barrioBean=new Barrio();//(this.barrioConstantesFunciones); 		
		this.barrioReturnGeneral=new BarrioParameterReturnGeneral(); 
		
		this.barrioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.barrioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public BarrioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public BarrioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public BarrioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessBarrio(true);
			
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
			
			this.barrioConstantesFunciones=new BarrioConstantesFunciones(); 
			this.barrioBean=new Barrio();//this.barrioConstantesFunciones); 			
			this.barrioReturnGeneral=new BarrioParameterReturnGeneral(); 
		
			BarrioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Barrio Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.barrio=new Barrio();
			this.barrios = new ArrayList<Barrio>();
			this.barriosAux = new ArrayList<Barrio>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic=new BarrioLogic();
				this.barrioLogic.getNewConnexionToDeep("");
			}
			
			//this.barrioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.barrioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormBarrio);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoBarrio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoBarrio);	
					}
					
					if(this.jInternalFrameImportacionBarrio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionBarrio);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByBarrio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByBarrio);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormBarrio!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormBarrio);
				this.jInternalFrameDetalleFormBarrio.setVisible(false);
				this.jInternalFrameDetalleFormBarrio.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoBarrio!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoBarrio);
					this.jInternalFrameReporteDinamicoBarrio.setVisible(false);
					this.jInternalFrameReporteDinamicoBarrio.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionBarrio!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionBarrio);
					this.jInternalFrameImportacionBarrio.setVisible(false);
					this.jInternalFrameImportacionBarrio.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByBarrio!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByBarrio);
					this.jInternalFrameOrderByBarrio.setVisible(false);
					this.jInternalFrameOrderByBarrio.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idBarrioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=BarrioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.barrioReturnGeneral=new BarrioParameterReturnGeneral();
			
			this.barrioParameterGeneral=new BarrioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.barrioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.barrioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(BarrioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.barrioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,BarrioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.barrioSessionBean.getEsGuardarRelacionado(),this.barrioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,BarrioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.barrioSessionBean.getEsGuardarRelacionado(),this.barrioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoBarrio=false;
			this.isVisibilidadCeldaDuplicarBarrio=true;
			this.isVisibilidadCeldaCopiarBarrio=true;
			this.isVisibilidadCeldaVerFormBarrio=true;
			this.isVisibilidadCeldaOrdenBarrio=true;
			this.isVisibilidadCeldaNuevoRelacionesBarrio=false;
			this.isVisibilidadCeldaModificarBarrio=false;
			this.isVisibilidadCeldaActualizarBarrio=false;
			this.isVisibilidadCeldaEliminarBarrio=false;
			this.isVisibilidadCeldaCancelarBarrio=false;
			this.isVisibilidadCeldaGuardarBarrio=false;
			this.isVisibilidadCeldaGuardarCambiosBarrio=false;
			
			
			this.isVisibilidadFK_IdCanton=true;
			this.isVisibilidadFK_IdParroquia=true;
			this.isVisibilidadFK_IdProvincia=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesBarrio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosBarrio();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioBarrio(false);
			
			this.setPermisosUsuarioBarrio();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.barrioSessionBean.getEsGuardarRelacionado() 
				|| (this.barrioSessionBean.getEsGuardarRelacionado() && this.barrioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioBarrioClasesRelacionadas();
			}
			
			if(this.barrioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioBarrioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!BarrioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosBarrio();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualBarrio();
			}
			
			if(!this.isPermisoBusquedaBarrio) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasBarrio.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.barrioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioBarrio,this.isPermisoPaginacionMedioBarrio,this.isPermisoPaginacionTodoBarrio);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(BarrioConstantesFunciones.getTiposSeleccionarBarrio());
				
				this.tiposColumnasSelect=BarrioConstantesFunciones.getTiposSeleccionarBarrio(true);
				
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
			//if(!this.barrioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioBarrio();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioBarrio(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioBarrio(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesBarrio() ;
			
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
			
			this.provinciaLogic=new ProvinciaLogic();
			this.cantonLogic=new CantonLogic();
			this.parroquiaLogic=new ParroquiaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				barrioImplementable= (BarrioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+BarrioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				barrioImplementableHome= (BarrioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+BarrioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.barrios= new ArrayList<Barrio>();
			this.barriosEliminados= new ArrayList<Barrio>();
						
			this.isEsNuevoBarrio=false;
			this.esParaAccionDesdeFormularioBarrio=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.provinciasForeignKey=new ArrayList<Provincia>() ;
			this.cantonsForeignKey=new ArrayList<Canton>() ;
			this.parroquiasForeignKey=new ArrayList<Parroquia>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyBarrio(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroBarrio();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.barrioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			BarrioBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=BarrioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesBarrio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingBarrio(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormBarrio!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioBarrio();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioBarrio();
			}
			
			BarrioBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasBarrio.getTabCount(); i++) {
					this.jTabbedPaneBusquedasBarrio.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasBarrio.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessBarrio(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Barrio: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectBarrio() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesBarrio")) {
				iIndex=this.jInternalFrameDetalleFormBarrio.jTabbedPaneRelacionesBarrio.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormBarrio.jTabbedPaneRelacionesBarrio.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosBarrio.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessBarrio();	
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
	
	public void cargarCombosForeignKeyBarrio(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyBarrio(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyBarrio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyBarrioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyBarrio();
		
		this.cargarCombosFrameForeignKeyBarrio();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyBarrio();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyBarrio();
		}
	}
	
	

	public void cargarCombosForeignKeyProvincia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyProvinciaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyProvincia();
				this.cargarCombosFrameProvinciasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaProvincia(this.provinciasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCanton(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCantonListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCanton();
				this.cargarCombosFrameCantonsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCanton(this.cantonsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyParroquia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyParroquiaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyParroquia();
				this.cargarCombosFrameParroquiasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaParroquia(this.parroquiasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoBarrioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.barrioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormBarrio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
			
			
			if(jTableDatosBarrio.getRowCount()>=1) {
				jTableDatosBarrio.removeRowSelectionInterval(0, jTableDatosBarrio.getRowCount()-1);						
			}
			
			this.isEsNuevoBarrio=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoBarrio(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesBarrio(true);			
			//this.barrio=new Barrio();
			//this.barrio.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBarrio(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBarrio() ;
			
			if(BarrioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBarrio(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.barrio);	
			this.actualizarInformacion("INFO_PADRE",false,this.barrio);				
			
			BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
			
			if(this.barrioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Barrio: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarBarrioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Barrio> barriosSeleccionados=new ArrayList<Barrio>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosBarrio.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosBarrio.getSelectedRows().length;			
			}
			
			barriosSeleccionados=this.getBarriosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoBarrio--;			
				//Barrio barrioAux= new Barrio();			
				//barrioAux.setId(this.iIdNuevoBarrio);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Barrio barrioOrigen=new Barrio();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Barrio barrioOrigen : barriosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosBarrio.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							barrioOrigen =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							barrioOrigen =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaBarrio();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.barrio.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosBarrio(barrioOrigen,this.barrio,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysBarrio(this.barrio);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.barrioLogic.getBarrios().add(this.barrioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.barrios.add(this.barrioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaBarrio(false);
				
				this.jTableDatosBarrio.setRowSelectionInterval(this.getIndiceNuevoBarrio(), this.getIndiceNuevoBarrio());
				
				int iLastRow =  this.jTableDatosBarrio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosBarrio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosBarrio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaBarrio(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarBarrioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Barrio> barriosSeleccionados=new ArrayList<Barrio>();									
		
			Barrio barrioOrigen=new Barrio();
			Barrio barrioDestino=new Barrio();
				
			barriosSeleccionados=this.getBarriosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosBarrio.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || barriosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosBarrio.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						barrioOrigen =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						barrioOrigen =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						barrioDestino =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						barrioDestino =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				barrioOrigen =barriosSeleccionados.get(0);
				barrioDestino =barriosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosBarrio(barrioOrigen,barrioDestino,true,false);
				
				barrioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(barrioDestino,barrioLogic.getBarrios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(barrioDestino,barrios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaBarrio(false);
				
				//this.jTableDatosBarrio.setRowSelectionInterval(this.getIndiceNuevoBarrio(), this.getIndiceNuevoBarrio());
				
				int iLastRow =  this.jTableDatosBarrio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosBarrio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosBarrio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaBarrio(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormBarrioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormBarrio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormBarrio.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarBarrioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesBarrio.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasBarrio.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesBarrio.setVisible(!isVisible);
			this.jPanelPaginacionBarrio.setVisible(!isVisible);
			this.jPanelAccionesBarrio.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarBarrioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameBarrio();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoBarrioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoBarrio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionBarrioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionBarrio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByBarrioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByBarrio();
			
			this.abrirFrameOrderByBarrio();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByBarrioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByBarrio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleBarrio(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormBarrio);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormBarrio.isMaximum()) {
					this.jInternalFrameDetalleFormBarrio.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormBarrio.setSize(this.jInternalFrameDetalleFormBarrio.iWidthFormulario,this.jInternalFrameDetalleFormBarrio.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormBarrio.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormBarrio.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormBarrio.isMaximum()) {
						this.jInternalFrameDetalleFormBarrio.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormBarrio.jContentPaneDetalleBarrio.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormBarrio.jTabbedPaneRelacionesBarrio.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormBarrio.jContentPaneDetalleBarrio.getWidth(),BarrioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormBarrio.jTabbedPaneRelacionesBarrio.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormBarrio.jContentPaneDetalleBarrio.getWidth(),BarrioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormBarrio.jTabbedPaneRelacionesBarrio.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormBarrio.jContentPaneDetalleBarrio.getWidth(),BarrioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormBarrio.setVisible(true);
	        this.jInternalFrameDetalleFormBarrio.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByBarrio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByBarrio==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByBarrio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBarrio,false,this);
				} else {
					this.jInternalFrameOrderByBarrio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBarrio,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByBarrio);
				this.jInternalFrameOrderByBarrio.setVisible(false);
				this.jInternalFrameOrderByBarrio.setSelected(false);
				
				this.jInternalFrameOrderByBarrio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByBarrio"));
				
				this.inicializarActualizarBindingTablaOrderByBarrio();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionBarrio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionBarrio==null) {
				
				this.jInternalFrameImportacionBarrio=new ImportacionJInternalFrame(BarrioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionBarrio);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionBarrio);
				this.jInternalFrameImportacionBarrio.setVisible(false);
				this.jInternalFrameImportacionBarrio.setSelected(false);


				this.jInternalFrameImportacionBarrio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionBarrio"));
				this.jInternalFrameImportacionBarrio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionBarrio"));
				this.jInternalFrameImportacionBarrio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionBarrio"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoBarrio() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoBarrio==null) {
				this.jInternalFrameReporteDinamicoBarrio=new ReporteDinamicoJInternalFrame(BarrioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoBarrio);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoBarrio);
				this.jInternalFrameReporteDinamicoBarrio.setVisible(false);
				this.jInternalFrameReporteDinamicoBarrio.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoBarrio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBarrio"));
				this.jInternalFrameReporteDinamicoBarrio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBarrio"));
				this.jInternalFrameReporteDinamicoBarrio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBarrio"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBarrio();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleBarrio() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormBarrio);
			
	       	this.jInternalFrameDetalleFormBarrio.setVisible(false);
	        this.jInternalFrameDetalleFormBarrio.setSelected(false);
			
			//this.jInternalFrameDetalleFormBarrio.dispose();
			//this.jInternalFrameDetalleFormBarrio=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoBarrio() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoBarrio.setVisible(true);
	        this.jInternalFrameReporteDinamicoBarrio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionBarrio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionBarrio.setVisible(true);
	        this.jInternalFrameImportacionBarrio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByBarrio() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByBarrio.setVisible(true);
	        this.jInternalFrameOrderByBarrio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByBarrio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByBarrio.setVisible(false);
	        this.jInternalFrameOrderByBarrio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoBarrio() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoBarrio.setVisible(false);
	        this.jInternalFrameReporteDinamicoBarrio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionBarrio() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionBarrio.setVisible(false);
	        this.jInternalFrameImportacionBarrio.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarBarrioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarBarrio(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarBarrio(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosBarrio.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesBarrio(true);
			//this.isEsNuevoBarrio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrio =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.barrio =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesBarrio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBarrio(false) ;
			
			if(barrioSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(BarrioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBarrio(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBarrio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaBarrioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosBarrio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrio =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.barrio =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarBarrio(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormBarrio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosBarrio.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesBarrio(true);
			//this.isEsNuevoBarrio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrio =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.barrio =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.barrio.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesBarrio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesBarrio(false) ;
			
			if(BarrioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBarrio(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBarrio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaProvincia(List<Provincia> provinciasForeignKey)throws Exception{
		TableColumn tableColumnProvincia=this.jTableDatosBarrio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBarrio,BarrioConstantesFunciones.LABEL_IDPROVINCIA));
		TableCellEditor tableCellEditorProvincia =tableColumnProvincia.getCellEditor();

		ProvinciaTableCell provinciaTableCellFk=(ProvinciaTableCell)tableCellEditorProvincia;

		if(provinciaTableCellFk!=null) {
			provinciaTableCellFk.setprovinciasForeignKey(provinciasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosBarrio.getSelectedRow();

		//if(intSelectedRow<=0) {
			//provinciaTableCellFk.setRowActual(intSelectedRow);
			//provinciaTableCellFk.setprovinciasForeignKeyActual(provinciasForeignKey);
		//}


		if(provinciaTableCellFk!=null) {
			provinciaTableCellFk.RecargarProvinciasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCanton(List<Canton> cantonsForeignKey)throws Exception{
		TableColumn tableColumnCanton=this.jTableDatosBarrio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBarrio,BarrioConstantesFunciones.LABEL_IDCANTON));
		TableCellEditor tableCellEditorCanton =tableColumnCanton.getCellEditor();

		CantonTableCell cantonTableCellFk=(CantonTableCell)tableCellEditorCanton;

		if(cantonTableCellFk!=null) {
			cantonTableCellFk.setcantonsForeignKey(cantonsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosBarrio.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cantonTableCellFk.setRowActual(intSelectedRow);
			//cantonTableCellFk.setcantonsForeignKeyActual(cantonsForeignKey);
		//}


		if(cantonTableCellFk!=null) {
			cantonTableCellFk.RecargarCantonsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaParroquia(List<Parroquia> parroquiasForeignKey)throws Exception{
		TableColumn tableColumnParroquia=this.jTableDatosBarrio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBarrio,BarrioConstantesFunciones.LABEL_IDPARROQUIA));
		TableCellEditor tableCellEditorParroquia =tableColumnParroquia.getCellEditor();

		ParroquiaTableCell parroquiaTableCellFk=(ParroquiaTableCell)tableCellEditorParroquia;

		if(parroquiaTableCellFk!=null) {
			parroquiaTableCellFk.setparroquiasForeignKey(parroquiasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosBarrio.getSelectedRow();

		//if(intSelectedRow<=0) {
			//parroquiaTableCellFk.setRowActual(intSelectedRow);
			//parroquiaTableCellFk.setparroquiasForeignKeyActual(parroquiasForeignKey);
		//}


		if(parroquiaTableCellFk!=null) {
			parroquiaTableCellFk.RecargarParroquiasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarBarrioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesBarrio(false);
			
			//if(!this.isEsNuevoBarrio) {								
				int intSelectedRow = this.jTableDatosBarrio.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrio =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.barrio =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(BarrioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualBarrio(this.barrio,true);
				this.setVariablesFormularioToObjetoActualForeignKeysBarrio(this.barrio);
				
			}
			
			if(this.permiteMantenimiento(this.barrio)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.barrioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoBarrio=true;
					this.inicializarActualizarBindingTablaBarrio(false);
					this.isEsNuevoBarrio=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoBarrio=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoBarrio=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesBarrio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBarrio(false);
				
				this.habilitarDeshabilitarControlesBarrio(false);
			
												
				
				if(BarrioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleBarrio();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoBarrioActionPerformed(evt,barrioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualBarrio(this.barrio,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosBarrio.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,barrioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.barrio.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Barrio.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Barrio.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarBarrioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosBarrio.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrio =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				this.barrio.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.barrio =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				this.barrio.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.barrio)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.barrioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((BarrioModel) this.jTableDatosBarrio.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoBarrio=true;
				this.inicializarActualizarBindingTablaBarrio(false);
				this.isEsNuevoBarrio=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesBarrio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBarrio(false);
				
				this.habilitarDeshabilitarControlesBarrio(false);
				
				
				
				if(BarrioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleBarrio();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarBarrioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosBarrio.getRowCount()>=1) {
				jTableDatosBarrio.removeRowSelectionInterval(0, jTableDatosBarrio.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesBarrio(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaBarrio(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBarrio(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBarrio(false) ;
			
			this.isEsNuevoBarrio=false;
			
			if(BarrioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleBarrio();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosBarrioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBarrio(false);
				
				//SI ES MANUAL
				if(BarrioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualBarrio();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosBarrioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoBarrio--;			
			//Barrio barrioAux= new Barrio();			
			//barrioAux.setId(this.iIdNuevoBarrio);
			
			if(this.jInternalFrameDetalleFormBarrio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaBarrio();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysBarrio(this.barrio);
			
			this.barrio.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.barrioLogic.getBarrios().add(this.barrioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.barrios.add(this.barrioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaBarrio(false);
			
			this.jTableDatosBarrio.setRowSelectionInterval(this.getIndiceNuevoBarrio(), this.getIndiceNuevoBarrio());
			
			int iLastRow =  this.jTableDatosBarrio.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosBarrio.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosBarrio.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaBarrio(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionBarrioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingBarrio(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBarrio(false);
			
			//SI ES MANUAL
			if(BarrioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBarrio();
			}
			
			//this.abrirFrameTreeBarrio();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionBarrioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE BarrioS ?", "MANTENIMIENTO DE Barrio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionBarrio.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralBarrio();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.barrioReturnGeneral=barrioLogic.procesarImportacionBarriosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.barrioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarBarrioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionBarrioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionBarrio.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionBarrio.setFileImportacion(this.jInternalFrameImportacionBarrio.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionBarrio.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionBarrio.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionBarrio.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionBarrio.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoBarrioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Barrio> barriosSeleccionados=new ArrayList<Barrio>();		

		barriosSeleccionados=this.getBarriosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBarrio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBarrio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("BarrioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"BarrioBaseDesign.jrxml";
			
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
			
			this.generarReporteBarrios("Todos",barriosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.barrioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Barrio",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoBarrio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBarrio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case BarrioConstantesFunciones.LABEL_IDPROVINCIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Provincia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Provincia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Provincia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Provincia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BarrioConstantesFunciones.LABEL_IDCANTON:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Canton_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Canton_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Canton_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Canton_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BarrioConstantesFunciones.LABEL_IDPARROQUIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Parroquia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Parroquia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Parroquia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Parroquia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BarrioConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BarrioConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoBarrio.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoBarrio.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoBarrio.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case BarrioConstantesFunciones.LABEL_IDPROVINCIA:
					sNombreCampoCategoria="id_provincia";
					break;

				case BarrioConstantesFunciones.LABEL_IDCANTON:
					sNombreCampoCategoria="id_canton";
					break;

				case BarrioConstantesFunciones.LABEL_IDPARROQUIA:
					sNombreCampoCategoria="id_parroquia";
					break;

				case BarrioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case BarrioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoBarrio.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case BarrioConstantesFunciones.LABEL_IDPROVINCIA:
					sNombreCampoCategoriaValor="id_provincia";
					break;

				case BarrioConstantesFunciones.LABEL_IDCANTON:
					sNombreCampoCategoriaValor="id_canton";
					break;

				case BarrioConstantesFunciones.LABEL_IDPARROQUIA:
					sNombreCampoCategoriaValor="id_parroquia";
					break;

				case BarrioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case BarrioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoBarrio.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBarrio.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case BarrioConstantesFunciones.LABEL_IDPROVINCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Provincia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_provincia");
					break;

				case BarrioConstantesFunciones.LABEL_IDCANTON:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Canton",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_canton");
					break;

				case BarrioConstantesFunciones.LABEL_IDPARROQUIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Parroquia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_parroquia");
					break;

				case BarrioConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case BarrioConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoBarrioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Barrio> barriosSeleccionados=new ArrayList<Barrio>();		
		
		barriosSeleccionados=this.getBarriosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"barrio";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Barrios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoBarrio.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoBarrio.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case BarrioConstantesFunciones.LABEL_IDPROVINCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BarrioConstantesFunciones.LABEL_IDPROVINCIA);
					iRow++;

					for(Barrio barrio:barriosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(barrio.getprovincia_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BarrioConstantesFunciones.LABEL_IDCANTON:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BarrioConstantesFunciones.LABEL_IDCANTON);
					iRow++;

					for(Barrio barrio:barriosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(barrio.getcanton_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BarrioConstantesFunciones.LABEL_IDPARROQUIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BarrioConstantesFunciones.LABEL_IDPARROQUIA);
					iRow++;

					for(Barrio barrio:barriosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(barrio.getparroquia_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BarrioConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BarrioConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Barrio barrio:barriosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(barrio.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BarrioConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BarrioConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Barrio barrio:barriosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(barrio.getnombre());
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
			//	this.getFilaCabeceraExportarExcelBarrio(row);				
			//	iRow++;
			//}				
			
			//for(Barrio barrioAux:barriosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelBarrio(barrioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.barrioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Barrio",JOptionPane.INFORMATION_MESSAGE);
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
				this.barrioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBarrio(false);
			
			//SI ES MANUAL
			if(BarrioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBarrio();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresBarrioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBarrio(false);
			
			//SI ES MANUAL
			if(BarrioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualBarrio();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesBarrioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBarrio(false);
			
			//SI ES MANUAL
			if(BarrioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualBarrio();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaBarrio() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosBarrio.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosBarrio.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosBarrio.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosBarrio.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosBarrio.setMinimumSize(dimensionMinimum);
		this.jTableDatosBarrio.setMaximumSize(dimensionMaximum);
		this.jTableDatosBarrio.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingBarrio(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingBarrio(esInicializar,true);
	}
	
	public void inicializarActualizarBindingBarrio(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaBarrio(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesBarrio(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.barrioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasBarrio(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesBarrio(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesBarrio(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !BarrioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!BarrioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualBarrio() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaBarrio();
		
		this.inicializarActualizarBindingBotonesManualBarrio(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.barrioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualBarrio();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesBarrio() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualBarrio(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualBarrio(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosBarrio.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosBarrio.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteBarrio.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormBarrio!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormBarrio.jCheckBoxPostAccionNuevoBarrio.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormBarrio.jCheckBoxPostAccionSinCerrarBarrio.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormBarrio.jCheckBoxPostAccionSinMensajeBarrio.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosBarrio.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosBarrio.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteBarrio.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormBarrio!=null) {
				this.jInternalFrameDetalleFormBarrio.jCheckBoxPostAccionNuevoBarrio.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormBarrio.jCheckBoxPostAccionSinCerrarBarrio.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormBarrio.jCheckBoxPostAccionSinMensajeBarrio.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionBarrio.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionBarrio.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormBarrio!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormBarrio.jComboBoxTiposAccionesFormularioBarrio.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesBarrio.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoBarrio!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBarrio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesBarrio.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesBarrio.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarBarrio.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesBarrio.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoBarrio!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBarrio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesBarrio.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralBarrio.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesBarrio(Boolean esInicializar) throws Exception {
		try	{	
			if(BarrioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualBarrio(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesBarrio() throws Exception {
		try	{
			if(BarrioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualBarrio();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleBarrio() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormBarrio.jComboBoxTiposAccionesFormularioBarrio.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormBarrio.jComboBoxTiposAccionesFormularioBarrio.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualBarrio() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesBarrio.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesBarrio.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesBarrio.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesBarrio.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesBarrio.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesBarrio.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionBarrio.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionBarrio.addItem(reporte);
			}
			
			
			if(!this.barrioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionBarrio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionBarrio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesBarrio.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesBarrio.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesBarrio.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesBarrio.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormBarrio!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormBarrio.jComboBoxTiposAccionesFormularioBarrio.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormBarrio.jComboBoxTiposAccionesFormularioBarrio.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarBarrio.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarBarrio.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarBarrio.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBarrio();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBarrio() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoBarrio!=null) {
				this.jInternalFrameReporteDinamicoBarrio.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoBarrio.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoBarrio!=null) {
				this.jInternalFrameReporteDinamicoBarrio.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoBarrio.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoBarrio!=null) {
				
				if(this.jInternalFrameReporteDinamicoBarrio.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoBarrio.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBarrio.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoBarrio.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoBarrio.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBarrio.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualBarrio()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cantonFK_IdCantonBarrio.getSelectedItem()!=null){this.id_cantonFK_IdCanton=((Canton)this.jComboBoxid_cantonFK_IdCantonBarrio.getSelectedItem()).getId();}
		if(this.jComboBoxid_parroquiaFK_IdParroquiaBarrio.getSelectedItem()!=null){this.id_parroquiaFK_IdParroquia=((Parroquia)this.jComboBoxid_parroquiaFK_IdParroquiaBarrio.getSelectedItem()).getId();}
		if(this.jComboBoxid_provinciaFK_IdProvinciaBarrio.getSelectedItem()!=null){this.id_provinciaFK_IdProvincia=((Provincia)this.jComboBoxid_provinciaFK_IdProvinciaBarrio.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasBarrio(Boolean esInicializar) throws Exception {				
		if(BarrioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualBarrio();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaBarrio() throws Exception {
		this.inicializarActualizarBindingTablaBarrio(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByBarrio() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByBarrio.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByBarrio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBarrio.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new BarrioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByBarrio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBarrio.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new BarrioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosBarrioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBarrioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new BarrioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByBarrio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBarrio.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new BarrioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByBarrio.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaBarrio(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=barrioLogic.getBarrios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=barrios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(BarrioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosBarrio.setModel(new BarrioModel(this.barrioLogic.getBarrios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosBarrio.setModel(new BarrioModel(this.barrios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByBarrio!=null && this.jInternalFrameOrderByBarrio.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByBarrio();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosBarrio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBarrio,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new BarrioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+BarrioConstantesFunciones.SCLASSWEBTITULO,barrioConstantesFunciones.resaltarSeleccionarBarrio,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+BarrioConstantesFunciones.SCLASSWEBTITULO,barrioConstantesFunciones.resaltarSeleccionarBarrio,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosBarrio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBarrio,BarrioConstantesFunciones.LABEL_ID));

		if(this.barrioConstantesFunciones.mostraridBarrio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BarrioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.barrioConstantesFunciones.resaltaridBarrio,this.barrioConstantesFunciones.activaridBarrio,this,true,"idBarrio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.barrioConstantesFunciones.resaltaridBarrio,this.barrioConstantesFunciones.activaridBarrio,this,true,"idBarrio","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBarrio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBarrio,BarrioConstantesFunciones.LABEL_IDPROVINCIA));

		if(this.barrioConstantesFunciones.mostrarid_provinciaBarrio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BarrioConstantesFunciones.LABEL_IDPROVINCIA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProvinciaTableCell(this.provinciasForeignKey,this.barrioConstantesFunciones.resaltarid_provinciaBarrio,this,this.barrioConstantesFunciones.activarid_provinciaBarrio));
			tableColumn.setCellEditor(new ProvinciaTableCell(this.provinciasForeignKey,this.barrioConstantesFunciones.resaltarid_provinciaBarrio,this,this.barrioConstantesFunciones.activarid_provinciaBarrio,true,"id_provinciaBarrio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BarrioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBarrio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBarrio,BarrioConstantesFunciones.LABEL_IDCANTON));

		if(this.barrioConstantesFunciones.mostrarid_cantonBarrio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BarrioConstantesFunciones.LABEL_IDCANTON,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CantonTableCell(this.cantonsForeignKey,this.barrioConstantesFunciones.resaltarid_cantonBarrio,this,this.barrioConstantesFunciones.activarid_cantonBarrio));
			tableColumn.setCellEditor(new CantonTableCell(this.cantonsForeignKey,this.barrioConstantesFunciones.resaltarid_cantonBarrio,this,this.barrioConstantesFunciones.activarid_cantonBarrio,true,"id_cantonBarrio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BarrioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBarrio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBarrio,BarrioConstantesFunciones.LABEL_IDPARROQUIA));

		if(this.barrioConstantesFunciones.mostrarid_parroquiaBarrio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BarrioConstantesFunciones.LABEL_IDPARROQUIA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ParroquiaTableCell(this.parroquiasForeignKey,this.barrioConstantesFunciones.resaltarid_parroquiaBarrio,this,this.barrioConstantesFunciones.activarid_parroquiaBarrio));
			tableColumn.setCellEditor(new ParroquiaTableCell(this.parroquiasForeignKey,this.barrioConstantesFunciones.resaltarid_parroquiaBarrio,this,this.barrioConstantesFunciones.activarid_parroquiaBarrio,true,"id_parroquiaBarrio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BarrioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBarrio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBarrio,BarrioConstantesFunciones.LABEL_CODIGO));

		if(this.barrioConstantesFunciones.mostrarcodigoBarrio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BarrioConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.barrioConstantesFunciones.resaltarcodigoBarrio,this.barrioConstantesFunciones.activarcodigoBarrio,this,true,"codigoBarrio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.barrioConstantesFunciones.resaltarcodigoBarrio,this.barrioConstantesFunciones.activarcodigoBarrio,this,true,"codigoBarrio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BarrioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBarrio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBarrio,BarrioConstantesFunciones.LABEL_NOMBRE));

		if(this.barrioConstantesFunciones.mostrarnombreBarrio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BarrioConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.barrioConstantesFunciones.resaltarnombreBarrio,this.barrioConstantesFunciones.activarnombreBarrio,this,true,"nombreBarrio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.barrioConstantesFunciones.resaltarnombreBarrio,this.barrioConstantesFunciones.activarnombreBarrio,this,true,"nombreBarrio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BarrioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.barrioSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.barrioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.barrioSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosBarrio.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.barrioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.barrioSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosBarrio.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarBarrio && this.isPermisoGuardarCambiosBarrio) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.barrioSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.barrioSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosBarrio.addColumn(tableColumn);
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
			
			this.jTableDatosBarrio.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarBarrio && this.isPermisoGuardarCambiosBarrio) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarBarrio && this.isPermisoGuardarCambiosBarrio) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosBarrio.moveColumn(this.jTableDatosBarrio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosBarrio.moveColumn(this.jTableDatosBarrio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosBarrio.moveColumn(this.jTableDatosBarrio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosBarrio.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosBarrio.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosBarrio,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!BarrioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosBarrio.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosBarrio.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!BarrioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!BarrioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosBarrio.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosBarrio.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosBarrio.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=barrioLogic.getBarrios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=barrios.size()-1;
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
		//this.jTableDatosBarrio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosBarrio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosBarrio();
			
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
				
				//this.isEsNuevoBarrio=false;
					
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
			
				if(this.barrioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormBarrio==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosBarrio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosBarrio.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrio =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.barrio =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.barrio.getsType().equals("DUPLICADO")
				   || this.barrio.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoBarrio=true;
				
				} else {
					this.isEsNuevoBarrio=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.barrioSessionBean.getEsGuardarRelacionado()) {
					if(this.barrio.getId()>=0 && !this.barrio.getIsNew()) {						
						this.isEsNuevoBarrio=false;
						
					} else {
						this.isEsNuevoBarrio=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoBarrio(esRelaciones);						
				
				this.seleccionarBarrio(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.barrio.getId()<0) {
					this.isEsNuevoBarrio=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarBarrio(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarBarrio(evt,rowIndex);
				}	
				
				if(this.barrioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Barrio: " + this.dDif); 
					}
				}								
				
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarBarrio(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.barrio)) {
					if(this.barrio.getId()>0) {
						this.barrio.setIsDeleted(true);
						
						this.barriosEliminados.add(this.barrio);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.barrioLogic.getBarrios().remove(this.barrio);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.barrios.remove(this.barrio);				
					}
					
					
					((BarrioModel) this.jTableDatosBarrio.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaBarrio(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarBarrio(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoBarrio) {
			
			if(this.jInternalFrameDetalleFormBarrio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosBarrio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosBarrio.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrio =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.barrio =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(BarrioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioBarrio(this.barrio);
				}
				
				//ARCHITECTURE
				try {
					

					//Provincia
					if(!this.barrioConstantesFunciones.cargarid_provinciaBarrio || this.barrioConstantesFunciones.event_dependid_provinciaBarrio) {
						//this.cargarCombosProvinciasForeignKeyLista(" where id="+this.barrio.getid_provincia());
									//this.inicializarActualizarBindingBarrio(false,false);
						this.provinciasForeignKey=new ArrayList<Provincia>();

						if(barrio.getProvincia()!=null) {
							this.provinciasForeignKey.add(barrio.getProvincia());
						}

						this.addItemDefectoCombosForeignKeyProvincia();
						this.cargarCombosFrameProvinciasForeignKey("Todos");
					}
					this.setActualProvinciaForeignKey(this.barrio.getid_provincia(),false,"Formulario");

					//Canton
					if(!this.barrioConstantesFunciones.cargarid_cantonBarrio || this.barrioConstantesFunciones.event_dependid_cantonBarrio) {
						//this.cargarCombosCantonsForeignKeyLista(" where id="+this.barrio.getid_canton());
									//this.inicializarActualizarBindingBarrio(false,false);
						this.cantonsForeignKey=new ArrayList<Canton>();

						if(barrio.getCanton()!=null) {
							this.cantonsForeignKey.add(barrio.getCanton());
						}

						this.addItemDefectoCombosForeignKeyCanton();
						this.cargarCombosFrameCantonsForeignKey("Todos");
					}
					this.setActualCantonForeignKey(this.barrio.getid_canton(),false,"Formulario");

					//Parroquia
					if(!this.barrioConstantesFunciones.cargarid_parroquiaBarrio || this.barrioConstantesFunciones.event_dependid_parroquiaBarrio) {
						//this.cargarCombosParroquiasForeignKeyLista(" where id="+this.barrio.getid_parroquia());
									//this.inicializarActualizarBindingBarrio(false,false);
						this.parroquiasForeignKey=new ArrayList<Parroquia>();

						if(barrio.getParroquia()!=null) {
							this.parroquiasForeignKey.add(barrio.getParroquia());
						}

						this.addItemDefectoCombosForeignKeyParroquia();
						this.cargarCombosFrameParroquiasForeignKey("Todos");
					}
					this.setActualParroquiaForeignKey(this.barrio.getid_parroquia(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesBarrio("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesBarrio(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBarrio() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoBarrio(Barrio barrio) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoBarrio(barrio,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoBarrio(Barrio barrio,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioBarrio(barrio);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyBarrio(barrio,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyBarrio(barrio);
	}
	
	public void setVariablesObjetoActualToFormularioBarrio(Barrio barrio) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormBarrio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormBarrio.jLabelidBarrio.setText(barrio.getId().toString());
			this.jInternalFrameDetalleFormBarrio.jTextFieldcodigoBarrio.setText(barrio.getcodigo());
			this.jInternalFrameDetalleFormBarrio.jTextAreanombreBarrio.setText(barrio.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Barrio barrioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,barrioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Barrio barrioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				barrioLocal=this.barrio;
			} else {
				barrioLocal=this.barrioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(barrioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoBarrio(barrioLocal,true);
					
					if(barrioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(barrioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.barrioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(barrioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoBarrio(Barrio barrio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualBarrio(barrio,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysBarrio(barrio);
	}
	
	public void setVariablesFormularioToObjetoActualBarrio(Barrio barrio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualBarrio(barrio,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualBarrio(Barrio barrio,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormBarrio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormBarrio.jLabelidBarrio.getText()==null || this.jInternalFrameDetalleFormBarrio.jLabelidBarrio.getText()=="" || this.jInternalFrameDetalleFormBarrio.jLabelidBarrio.getText()=="Id") {
				this.jInternalFrameDetalleFormBarrio.jLabelidBarrio.setText("0");
			}

			if(conColumnasBase) {barrio.setId(Long.parseLong(this.jInternalFrameDetalleFormBarrio.jLabelidBarrio.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BarrioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBarrio.jLabelIdBarrio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			barrio.setcodigo(this.jInternalFrameDetalleFormBarrio.jTextFieldcodigoBarrio.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BarrioConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBarrio.jLabelcodigoBarrio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			barrio.setnombre(this.jInternalFrameDetalleFormBarrio.jTextAreanombreBarrio.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BarrioConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBarrio.jLabelnombreBarrio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualBarrio(Barrio barrioBean,Barrio barrio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && barrioBean.getid_provincia()!=null && !barrioBean.getid_provincia().equals(-1L))) {barrio.setid_provincia(barrioBean.getid_provincia());}
			if(conDefault || (!conDefault && barrioBean.getid_canton()!=null && !barrioBean.getid_canton().equals(-1L))) {barrio.setid_canton(barrioBean.getid_canton());}
			if(conDefault || (!conDefault && barrioBean.getid_parroquia()!=null && !barrioBean.getid_parroquia().equals(-1L))) {barrio.setid_parroquia(barrioBean.getid_parroquia());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosBarrio(Barrio barrioOrigen,Barrio barrio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && barrioOrigen.getId()!=null && !barrioOrigen.getId().equals(0L))) {barrio.setId(barrioOrigen.getId());}}
			if(conDefault || (!conDefault && barrioOrigen.getid_provincia()!=null && !barrioOrigen.getid_provincia().equals(-1L))) {barrio.setid_provincia(barrioOrigen.getid_provincia());}
			if(conDefault || (!conDefault && barrioOrigen.getid_canton()!=null && !barrioOrigen.getid_canton().equals(-1L))) {barrio.setid_canton(barrioOrigen.getid_canton());}
			if(conDefault || (!conDefault && barrioOrigen.getid_parroquia()!=null && !barrioOrigen.getid_parroquia().equals(-1L))) {barrio.setid_parroquia(barrioOrigen.getid_parroquia());}
			if(conDefault || (!conDefault && barrioOrigen.getcodigo()!=null && !barrioOrigen.getcodigo().equals(""))) {barrio.setcodigo(barrioOrigen.getcodigo());}
			if(conDefault || (!conDefault && barrioOrigen.getnombre()!=null && !barrioOrigen.getnombre().equals(""))) {barrio.setnombre(barrioOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioBarrio(Barrio barrio) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormBarrio.jLabelidBarrio.setText(barrio.getId().toString());
			this.jInternalFrameDetalleFormBarrio.jTextFieldcodigoBarrio.setText(barrio.getcodigo());
			this.jInternalFrameDetalleFormBarrio.jTextAreanombreBarrio.setText(barrio.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioBarrio(BarrioBean barrioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormBarrio.jLabelidBarrio.setText(barrioBean.getId().toString());
			this.jInternalFrameDetalleFormBarrio.jTextFieldcodigoBarrio.setText(barrioBean.getcodigo());
			this.jInternalFrameDetalleFormBarrio.jTextAreanombreBarrio.setText(barrioBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanBarrio(BarrioParameterReturnGeneral barrioReturnGeneral,BarrioBean barrioBean,Boolean conDefault) throws Exception { 
		try {
			Barrio barrioLocal=new Barrio();
			
			barrioLocal=barrioReturnGeneral.getBarrio();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && barrioLocal.getId()!=null && !barrioLocal.getId().equals(0L))) {barrioBean.setId(barrioLocal.getId());}}
			if(conDefault || (!conDefault && barrioLocal.getid_provincia()!=null && !barrioLocal.getid_provincia().equals(-1L))) {barrioBean.setid_provincia(barrioLocal.getid_provincia());}
			if(conDefault || (!conDefault && barrioLocal.getid_canton()!=null && !barrioLocal.getid_canton().equals(-1L))) {barrioBean.setid_canton(barrioLocal.getid_canton());}
			if(conDefault || (!conDefault && barrioLocal.getid_parroquia()!=null && !barrioLocal.getid_parroquia().equals(-1L))) {barrioBean.setid_parroquia(barrioLocal.getid_parroquia());}
			if(conDefault || (!conDefault && barrioLocal.getcodigo()!=null && !barrioLocal.getcodigo().equals(""))) {barrioBean.setcodigo(barrioLocal.getcodigo());}
			if(conDefault || (!conDefault && barrioLocal.getnombre()!=null && !barrioLocal.getnombre().equals(""))) {barrioBean.setnombre(barrioLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxBarrioGenerico(Long idBarrioSeleccionado,JComboBox jComboBoxBarrio,List<Barrio> barriosLocal)throws Exception {
		try {
			Barrio  barrioTemp=null;

			for(Barrio barrioAux:barriosLocal) {
				if(barrioAux.getId()!=null && barrioAux.getId().equals(idBarrioSeleccionado)) {
					barrioTemp=barrioAux;
					break;
				}
			}

			jComboBoxBarrio.setSelectedItem(barrioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxBarrioGenerico(JComboBox jComboBoxBarrio,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxBarrio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxBarrio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxBarrio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxBarrio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxBarrio.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxBarrio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxBarrio.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxBarrio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxBarrio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxBarrio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			barrio=(Barrio) barrioLogic.getBarrios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			barrio =(Barrio) barrios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Provincia")) {
			//sDescripcion=this.getActualProvinciaForeignKeyDescripcion((Long)value);
			if(!barrio.getIsNew() && !barrio.getIsChanged() && !barrio.getIsDeleted()) {
				sDescripcion=barrio.getprovincia_descripcion();
			} else {
				//sDescripcion=this.getActualProvinciaForeignKeyDescripcion((Long)value);
				sDescripcion=barrio.getprovincia_descripcion();
			}
		}

		if(sTipo.equals("Canton")) {
			//sDescripcion=this.getActualCantonForeignKeyDescripcion((Long)value);
			if(!barrio.getIsNew() && !barrio.getIsChanged() && !barrio.getIsDeleted()) {
				sDescripcion=barrio.getcanton_descripcion();
			} else {
				//sDescripcion=this.getActualCantonForeignKeyDescripcion((Long)value);
				sDescripcion=barrio.getcanton_descripcion();
			}
		}

		if(sTipo.equals("Parroquia")) {
			//sDescripcion=this.getActualParroquiaForeignKeyDescripcion((Long)value);
			if(!barrio.getIsNew() && !barrio.getIsChanged() && !barrio.getIsDeleted()) {
				sDescripcion=barrio.getparroquia_descripcion();
			} else {
				//sDescripcion=this.getActualParroquiaForeignKeyDescripcion((Long)value);
				sDescripcion=barrio.getparroquia_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Barrio barrioRow=new Barrio();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			barrioRow=(Barrio) barrioLogic.getBarrios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			barrioRow=(Barrio) barrios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualBarrio(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoBarrio.setVisible((this.isVisibilidadCeldaNuevoBarrio && this.isPermisoNuevoBarrio));			
			this.jButtonDuplicarBarrio.setVisible((this.isVisibilidadCeldaDuplicarBarrio && this.isPermisoDuplicarBarrio));			
			this.jButtonCopiarBarrio.setVisible((this.isVisibilidadCeldaCopiarBarrio && this.isPermisoCopiarBarrio));
			this.jButtonVerFormBarrio.setVisible((this.isVisibilidadCeldaVerFormBarrio && this.isPermisoVerFormBarrio));
			
			this.jButtonAbrirOrderByBarrio.setVisible((this.isVisibilidadCeldaOrdenBarrio && this.isPermisoOrdenBarrio));			
			
			this.jButtonNuevoRelacionesBarrio.setVisible((this.isVisibilidadCeldaNuevoRelacionesBarrio && this.isPermisoNuevoBarrio));			
			this.jButtonNuevoGuardarCambiosBarrio.setVisible((this.isVisibilidadCeldaNuevoBarrio && this.isPermisoNuevoBarrio && this.isPermisoGuardarCambiosBarrio));
			
			if(this.jInternalFrameDetalleFormBarrio!=null) {
			this.jInternalFrameDetalleFormBarrio.jButtonModificarBarrio.setVisible((this.isVisibilidadCeldaModificarBarrio && this.isPermisoActualizarBarrio));	
			this.jInternalFrameDetalleFormBarrio.jButtonActualizarBarrio.setVisible((this.isVisibilidadCeldaActualizarBarrio && this.isPermisoActualizarBarrio));	
			this.jInternalFrameDetalleFormBarrio.jButtonEliminarBarrio.setVisible((this.isVisibilidadCeldaEliminarBarrio && this.isPermisoEliminarBarrio));
			this.jInternalFrameDetalleFormBarrio.jButtonCancelarBarrio.setVisible(this.isVisibilidadCeldaCancelarBarrio);							
			this.jInternalFrameDetalleFormBarrio.jButtonGuardarCambiosBarrio.setVisible((this.isVisibilidadCeldaGuardarBarrio && this.isPermisoGuardarCambiosBarrio));			
			
			}
						
			this.jButtonGuardarCambiosTablaBarrio.setVisible((this.isVisibilidadCeldaGuardarCambiosBarrio && this.isPermisoGuardarCambiosBarrio));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarBarrio.setVisible((this.isVisibilidadCeldaNuevoBarrio && this.isPermisoNuevoBarrio));						
			this.jButtonDuplicarToolBarBarrio.setVisible((this.isVisibilidadCeldaDuplicarBarrio && this.isPermisoDuplicarBarrio));						
			this.jButtonCopiarToolBarBarrio.setVisible((this.isVisibilidadCeldaCopiarBarrio && this.isPermisoCopiarBarrio));			
			this.jButtonVerFormToolBarBarrio.setVisible((this.isVisibilidadCeldaVerFormBarrio && this.isPermisoVerFormBarrio));			
			this.jButtonAbrirOrderByToolBarBarrio.setVisible((this.isVisibilidadCeldaOrdenBarrio && this.isPermisoOrdenBarrio));
			this.jButtonNuevoRelacionesToolBarBarrio.setVisible((this.isVisibilidadCeldaNuevoRelacionesBarrio && this.isPermisoNuevoBarrio));			
			this.jButtonNuevoGuardarCambiosToolBarBarrio.setVisible((this.isVisibilidadCeldaNuevoBarrio && this.isPermisoNuevoBarrio && this.isPermisoGuardarCambiosBarrio));			
			
			if(this.jInternalFrameDetalleFormBarrio!=null) {
			this.jInternalFrameDetalleFormBarrio.jButtonModificarToolBarBarrio.setVisible((this.isVisibilidadCeldaModificarBarrio && this.isPermisoActualizarBarrio));	
			this.jInternalFrameDetalleFormBarrio.jButtonActualizarToolBarBarrio.setVisible((this.isVisibilidadCeldaActualizarBarrio  && this.isPermisoActualizarBarrio));	
			this.jInternalFrameDetalleFormBarrio.jButtonEliminarToolBarBarrio.setVisible((this.isVisibilidadCeldaEliminarBarrio && this.isPermisoEliminarBarrio));
			this.jInternalFrameDetalleFormBarrio.jButtonCancelarToolBarBarrio.setVisible(this.isVisibilidadCeldaCancelarBarrio);				
			this.jInternalFrameDetalleFormBarrio.jButtonGuardarCambiosToolBarBarrio.setVisible((this.isVisibilidadCeldaGuardarBarrio && this.isPermisoGuardarCambiosBarrio));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarBarrio.setVisible((this.isVisibilidadCeldaGuardarCambiosBarrio && this.isPermisoGuardarCambiosBarrio));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoBarrio.setVisible((this.isVisibilidadCeldaNuevoBarrio && this.isPermisoNuevoBarrio));			
			this.jMenuItemDuplicarBarrio.setVisible((this.isVisibilidadCeldaDuplicarBarrio && this.isPermisoDuplicarBarrio));			
			this.jMenuItemCopiarBarrio.setVisible((this.isVisibilidadCeldaCopiarBarrio && this.isPermisoCopiarBarrio));			
			this.jMenuItemVerFormBarrio.setVisible((this.isVisibilidadCeldaVerFormBarrio && this.isPermisoVerFormBarrio));			
			this.jMenuItemAbrirOrderByBarrio.setVisible((this.isVisibilidadCeldaOrdenBarrio && this.isPermisoOrdenBarrio));			
			//this.jMenuItemMostrarOcultarBarrio.setVisible((this.isVisibilidadCeldaOrdenBarrio && this.isPermisoOrdenBarrio));
			this.jMenuItemDetalleAbrirOrderByBarrio.setVisible((this.isVisibilidadCeldaOrdenBarrio && this.isPermisoOrdenBarrio));			
			//this.jMenuItemDetalleMostrarOcultarBarrio.setVisible((this.isVisibilidadCeldaOrdenBarrio && this.isPermisoOrdenBarrio));			
			this.jMenuItemNuevoRelacionesBarrio.setVisible((this.isVisibilidadCeldaNuevoRelacionesBarrio && this.isPermisoNuevoBarrio));			
			this.jMenuItemNuevoGuardarCambiosBarrio.setVisible((this.isVisibilidadCeldaNuevoBarrio && this.isPermisoNuevoBarrio && this.isPermisoGuardarCambiosBarrio));									
			
			if(this.jInternalFrameDetalleFormBarrio!=null) {
			this.jInternalFrameDetalleFormBarrio.jMenuItemModificarBarrio.setVisible((this.isVisibilidadCeldaModificarBarrio && this.isPermisoActualizarBarrio));	
			this.jInternalFrameDetalleFormBarrio.jMenuItemActualizarBarrio.setVisible((this.isVisibilidadCeldaActualizarBarrio && this.isPermisoActualizarBarrio));	
			this.jInternalFrameDetalleFormBarrio.jMenuItemEliminarBarrio.setVisible((this.isVisibilidadCeldaEliminarBarrio && this.isPermisoEliminarBarrio));
			this.jInternalFrameDetalleFormBarrio.jMenuItemCancelarBarrio.setVisible(this.isVisibilidadCeldaCancelarBarrio);				
			}
			
			this.jMenuItemGuardarCambiosBarrio.setVisible((this.isVisibilidadCeldaGuardarBarrio && this.isPermisoGuardarCambiosBarrio));						
			this.jMenuItemGuardarCambiosTablaBarrio.setVisible((this.isVisibilidadCeldaGuardarCambiosBarrio && this.isPermisoGuardarCambiosBarrio));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoBarrio=this.jButtonNuevoBarrio.isVisible();
			this.isVisibilidadCeldaDuplicarBarrio=this.jButtonDuplicarBarrio.isVisible();
			this.isVisibilidadCeldaCopiarBarrio=this.jButtonCopiarBarrio.isVisible();
			this.isVisibilidadCeldaVerFormBarrio=this.jButtonVerFormBarrio.isVisible();
			
			this.isVisibilidadCeldaOrdenBarrio=this.jButtonAbrirOrderByBarrio.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesBarrio=this.jButtonNuevoRelacionesBarrio.isVisible();
			this.isVisibilidadCeldaModificarBarrio=this.jButtonModificarBarrio.isVisible();
			
			if(this.jInternalFrameDetalleFormBarrio!=null) {
			this.isVisibilidadCeldaActualizarBarrio=this.jInternalFrameDetalleFormBarrio.jButtonActualizarBarrio.isVisible();
			this.isVisibilidadCeldaEliminarBarrio=this.jInternalFrameDetalleFormBarrio.jButtonEliminarBarrio.isVisible();
			this.isVisibilidadCeldaCancelarBarrio=this.jInternalFrameDetalleFormBarrio.jButtonCancelarBarrio.isVisible();
			this.isVisibilidadCeldaGuardarBarrio=this.jInternalFrameDetalleFormBarrio.jButtonGuardarCambiosBarrio.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosBarrio=this.jButtonGuardarCambiosTablaBarrio.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoBarrio=this.jButtonNuevoToolBarBarrio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesBarrio=this.jButtonNuevoRelacionesToolBarBarrio.isVisible();
			
			if(this.jInternalFrameDetalleFormBarrio!=null) {
			this.isVisibilidadCeldaModificarBarrio=this.jInternalFrameDetalleFormBarrio.jButtonModificarToolBarBarrio.isVisible();
			this.isVisibilidadCeldaActualizarBarrio=this.jInternalFrameDetalleFormBarrio.jButtonActualizarToolBarBarrio.isVisible();
			this.isVisibilidadCeldaEliminarBarrio=this.jInternalFrameDetalleFormBarrio.jButtonEliminarToolBarBarrio.isVisible();
			this.isVisibilidadCeldaCancelarBarrio=this.jInternalFrameDetalleFormBarrio.jButtonCancelarToolBarBarrio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarBarrio=this.jButtonGuardarCambiosToolBarBarrio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosBarrio=this.jButtonGuardarCambiosTablaToolBarBarrio.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoBarrio=this.jMenuItemNuevoBarrio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesBarrio=this.jMenuItemNuevoRelacionesBarrio.isVisible();
			
			if(this.jInternalFrameDetalleFormBarrio!=null) {
			this.isVisibilidadCeldaModificarBarrio=this.jInternalFrameDetalleFormBarrio.jMenuItemModificarBarrio.isVisible();
			this.isVisibilidadCeldaActualizarBarrio=this.jInternalFrameDetalleFormBarrio.jMenuItemActualizarBarrio.isVisible();
			this.isVisibilidadCeldaEliminarBarrio=this.jInternalFrameDetalleFormBarrio.jMenuItemEliminarBarrio.isVisible();
			this.isVisibilidadCeldaCancelarBarrio=this.jInternalFrameDetalleFormBarrio.jMenuItemCancelarBarrio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarBarrio=this.jMenuItemGuardarCambiosBarrio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosBarrio=this.jMenuItemGuardarCambiosTablaBarrio.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesBarrio(Boolean esInicializar) {
		if(BarrioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.barrioSessionBean.getConGuardarRelaciones()) {
				//if(this.barrioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesBarrio();
			}
			
			this.inicializarActualizarBindingBotonesManualBarrio(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualBarrio() {
		this.jButtonNuevoBarrio.setVisible(this.isPermisoNuevoBarrio);			
		this.jButtonDuplicarBarrio.setVisible(this.isPermisoDuplicarBarrio);			
		this.jButtonCopiarBarrio.setVisible(this.isPermisoCopiarBarrio);			
		this.jButtonVerFormBarrio.setVisible(this.isPermisoVerFormBarrio);			
		
		this.jButtonAbrirOrderByBarrio.setVisible(this.isPermisoOrdenBarrio);					
		
		this.jButtonNuevoRelacionesBarrio.setVisible(this.isPermisoNuevoBarrio);			
		
		if(this.jInternalFrameDetalleFormBarrio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBarrio.jButtonModificarBarrio.setVisible(this.isPermisoActualizarBarrio);	
			this.jInternalFrameDetalleFormBarrio.jButtonActualizarBarrio.setVisible(this.isPermisoActualizarBarrio);	
			this.jInternalFrameDetalleFormBarrio.jButtonEliminarBarrio.setVisible(this.isPermisoEliminarBarrio);
			this.jInternalFrameDetalleFormBarrio.jButtonCancelarBarrio.setVisible(this.isVisibilidadCeldaCancelarBarrio);						
			this.jInternalFrameDetalleFormBarrio.jButtonGuardarCambiosBarrio.setVisible(this.isPermisoGuardarCambiosBarrio);							
		}
		
		this.jButtonGuardarCambiosTablaBarrio.setVisible(this.isPermisoActualizarBarrio);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleBarrio() {
		this.jInternalFrameDetalleFormBarrio.jButtonModificarBarrio.setVisible(this.isPermisoActualizarBarrio);	
		this.jInternalFrameDetalleFormBarrio.jButtonActualizarBarrio.setVisible(this.isPermisoActualizarBarrio);	
		this.jInternalFrameDetalleFormBarrio.jButtonEliminarBarrio.setVisible(this.isPermisoEliminarBarrio);
		this.jInternalFrameDetalleFormBarrio.jButtonCancelarBarrio.setVisible(this.isVisibilidadCeldaCancelarBarrio);							
		this.jInternalFrameDetalleFormBarrio.jButtonGuardarCambiosBarrio.setVisible((this.isVisibilidadCeldaGuardarBarrio && this.isPermisoGuardarCambiosBarrio));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosBarrio() {
		if(BarrioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualBarrio();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesBarrio() {
	}
	
	public void jTableDatosBarrioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarBarrio(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidBarrioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBarrio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBarrio(this.getbarrio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBarrio(this.barrio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.barrio =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.barrio =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.barrio==null) {
						this.barrio = new Barrio();
					}

					this.setVariablesFormularioToObjetoActualBarrio(this.barrio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBarrio(this.barrio);
				}

				if(this.barrio.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.barrio.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBarrio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_provinciaBarrioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoprovincia=true;

			idTienePermisoprovincia=this.tienePermisosUsuarioEnPaginaWebBarrio(ProvinciaConstantesFunciones.CLASSNAME);

			if(idTienePermisoprovincia) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBarrio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBarrio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBarrio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrio =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.barrio =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBarrio(this.getbarrio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBarrio(this.barrio);

				this.provinciaBeanSwingJInternalFrame=new ProvinciaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.provinciaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.provinciaBeanSwingJInternalFrame.getProvinciaLogic().setConnexion(this.barrioLogic.getConnexion());

				if(this.barrio.getid_provincia()!=null) {
					this.provinciaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.provinciaBeanSwingJInternalFrame.setIdActual(this.barrio.getid_provincia());
					this.provinciaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.provinciaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.provinciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProvincia();
				}

				JInternalFrameBase jinternalFrame =this.provinciaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBarrio=(TitledBorder)this.jScrollPanelDatosBarrio.getBorder();
				TitledBorder titledBorderprovincia=(TitledBorder)this.provinciaBeanSwingJInternalFrame.jScrollPanelDatosProvincia.getBorder();

				titledBorderprovincia.setTitle(titledBorderBarrio.getTitle() + " -> Provincia");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_provinciaBarrioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBarrio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBarrio(this.getbarrio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBarrio(this.barrio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.barrio =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.barrio =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.barrio==null) {
						this.barrio = new Barrio();
					}

					this.setVariablesFormularioToObjetoActualBarrio(this.barrio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBarrio(this.barrio);
				}

				if(this.barrio.getid_provincia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_provincia = "+this.barrio.getid_provincia().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBarrio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cantonBarrioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocanton=true;

			idTienePermisocanton=this.tienePermisosUsuarioEnPaginaWebBarrio(CantonConstantesFunciones.CLASSNAME);

			if(idTienePermisocanton) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBarrio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBarrio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBarrio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrio =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.barrio =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBarrio(this.getbarrio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBarrio(this.barrio);

				this.cantonBeanSwingJInternalFrame=new CantonBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cantonBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cantonBeanSwingJInternalFrame.getCantonLogic().setConnexion(this.barrioLogic.getConnexion());

				if(this.barrio.getid_canton()!=null) {
					this.cantonBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cantonBeanSwingJInternalFrame.setIdActual(this.barrio.getid_canton());
					this.cantonBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cantonBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cantonBeanSwingJInternalFrame.inicializarActualizarBindingTablaCanton();
				}

				JInternalFrameBase jinternalFrame =this.cantonBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBarrio=(TitledBorder)this.jScrollPanelDatosBarrio.getBorder();
				TitledBorder titledBordercanton=(TitledBorder)this.cantonBeanSwingJInternalFrame.jScrollPanelDatosCanton.getBorder();

				titledBordercanton.setTitle(titledBorderBarrio.getTitle() + " -> Canton");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cantonBarrioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBarrio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBarrio(this.getbarrio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBarrio(this.barrio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.barrio =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.barrio =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.barrio==null) {
						this.barrio = new Barrio();
					}

					this.setVariablesFormularioToObjetoActualBarrio(this.barrio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBarrio(this.barrio);
				}

				if(this.barrio.getid_canton()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_canton = "+this.barrio.getid_canton().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBarrio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_parroquiaBarrioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoparroquia=true;

			idTienePermisoparroquia=this.tienePermisosUsuarioEnPaginaWebBarrio(ParroquiaConstantesFunciones.CLASSNAME);

			if(idTienePermisoparroquia) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBarrio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBarrio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBarrio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrio =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.barrio =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBarrio(this.getbarrio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBarrio(this.barrio);

				this.parroquiaBeanSwingJInternalFrame=new ParroquiaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.parroquiaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.parroquiaBeanSwingJInternalFrame.getParroquiaLogic().setConnexion(this.barrioLogic.getConnexion());

				if(this.barrio.getid_parroquia()!=null) {
					this.parroquiaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.parroquiaBeanSwingJInternalFrame.setIdActual(this.barrio.getid_parroquia());
					this.parroquiaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.parroquiaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.parroquiaBeanSwingJInternalFrame.inicializarActualizarBindingTablaParroquia();
				}

				JInternalFrameBase jinternalFrame =this.parroquiaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBarrio=(TitledBorder)this.jScrollPanelDatosBarrio.getBorder();
				TitledBorder titledBorderparroquia=(TitledBorder)this.parroquiaBeanSwingJInternalFrame.jScrollPanelDatosParroquia.getBorder();

				titledBorderparroquia.setTitle(titledBorderBarrio.getTitle() + " -> Parroquia");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_parroquiaBarrioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBarrio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBarrio(this.getbarrio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBarrio(this.barrio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.barrio =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.barrio =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.barrio==null) {
						this.barrio = new Barrio();
					}

					this.setVariablesFormularioToObjetoActualBarrio(this.barrio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBarrio(this.barrio);
				}

				if(this.barrio.getid_parroquia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_parroquia = "+this.barrio.getid_parroquia().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBarrio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoBarrioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBarrio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBarrio(this.getbarrio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBarrio(this.barrio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.barrio =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.barrio =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.barrio==null) {
						this.barrio = new Barrio();
					}

					this.setVariablesFormularioToObjetoActualBarrio(this.barrio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBarrio(this.barrio);
				}

				if(this.barrio.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.barrio.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBarrio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreBarrioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBarrio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBarrio(this.getbarrio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBarrio(this.barrio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.barrio =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.barrio =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.barrio==null) {
						this.barrio = new Barrio();
					}

					this.setVariablesFormularioToObjetoActualBarrio(this.barrio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBarrio(this.barrio);
				}

				if(this.barrio.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.barrio.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBarrio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCantonBarrioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBarrio(false,false);

			this.getBarriosFK_IdCanton();

			this.inicializarActualizarBindingBarrio(false);

			//if(BarrioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBarrio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdParroquiaBarrioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBarrio(false,false);

			this.getBarriosFK_IdParroquia();

			this.inicializarActualizarBindingBarrio(false);

			//if(BarrioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBarrio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProvinciaBarrioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBarrio(false,false);

			this.getBarriosFK_IdProvincia();

			this.inicializarActualizarBindingBarrio(false);

			//if(BarrioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBarrio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.barrioLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameBarrio() {
		if(this.jInternalFrameDetalleFormBarrio!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormBarrio!=null) {
			this.jInternalFrameDetalleFormBarrio.setVisible(false);	    			
			this.jInternalFrameDetalleFormBarrio.dispose();
			this.jInternalFrameDetalleFormBarrio=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoBarrio!=null) {
			this.jInternalFrameReporteDinamicoBarrio.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoBarrio.dispose();
			this.jInternalFrameReporteDinamicoBarrio=null;
		}
		
		if(this.jInternalFrameImportacionBarrio!=null) {
			this.jInternalFrameImportacionBarrio.setVisible(false);	    			
			this.jInternalFrameImportacionBarrio.dispose();
			this.jInternalFrameImportacionBarrio=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessBarrio();
			
			BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
			
			
			if(sTipo.equals("NuevoBarrio")) {
				jButtonNuevoBarrioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarBarrio")) {
				jButtonDuplicarBarrioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarBarrio")) {
				jButtonCopiarBarrioActionPerformed(evt);
			} else if(sTipo.equals("VerFormBarrio")) {
				jButtonVerFormBarrioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarBarrio")) {
				jButtonNuevoBarrioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarBarrio")) {
				jButtonDuplicarBarrioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoBarrio")) {
				jButtonNuevoBarrioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarBarrio")) {
				jButtonDuplicarBarrioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesBarrio")) {
				jButtonNuevoBarrioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarBarrio")) {
				jButtonNuevoBarrioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesBarrio")) {
				jButtonNuevoBarrioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarBarrio")) {
				jButtonModificarBarrioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarBarrio")) {
				jButtonModificarBarrioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarBarrio")) {
				jButtonModificarBarrioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarBarrio")) {
				jButtonActualizarBarrioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarBarrio")) {
				jButtonActualizarBarrioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarBarrio")) {
				jButtonActualizarBarrioActionPerformed(evt);
			} else if(sTipo.equals("EliminarBarrio")) {
				jButtonEliminarBarrioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarBarrio")) {
				jButtonEliminarBarrioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarBarrio")) {
				jButtonEliminarBarrioActionPerformed(evt);
			} else if(sTipo.equals("CancelarBarrio")) {
				jButtonCancelarBarrioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarBarrio")) {
				jButtonCancelarBarrioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarBarrio")) {
				jButtonCancelarBarrioActionPerformed(evt);
			} else if(sTipo.equals("CerrarBarrio")) {
				jButtonCerrarBarrioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarBarrio")) {
				jButtonCerrarBarrioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarBarrio")) {
				jButtonCerrarBarrioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarBarrio")) {
				jButtonMostrarOcultarBarrioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarBarrio")) {
				jButtonCancelarBarrioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosBarrio")) {
				jButtonGuardarCambiosBarrioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarBarrio")) {
				jButtonGuardarCambiosBarrioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarBarrio")) {
				jButtonCopiarBarrioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarBarrio")) {
				jButtonVerFormBarrioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosBarrio")) {
				jButtonGuardarCambiosBarrioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarBarrio")) {
				jButtonCopiarBarrioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormBarrio")) {
				jButtonVerFormBarrioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaBarrio")) {
				jButtonGuardarCambiosBarrioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarBarrio")) {
				jButtonGuardarCambiosBarrioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaBarrio")) {
				jButtonGuardarCambiosBarrioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionBarrio")) {
				jButtonRecargarInformacionBarrioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarBarrio")) {
				jButtonRecargarInformacionBarrioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionBarrio")) {
				jButtonRecargarInformacionBarrioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresBarrio")) {
				jButtonAnterioresBarrioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarBarrio")) {
				jButtonAnterioresBarrioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreBarrio")) {
				jButtonAnterioresBarrioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesBarrio")) {
				jButtonSiguientesBarrioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarBarrio")) {
				jButtonSiguientesBarrioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesBarrio")) {
				jButtonSiguientesBarrioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByBarrio") || sTipo.equals("MenuItemDetalleAbrirOrderByBarrio")) {
				jButtonAbrirOrderByBarrioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarBarrio") || sTipo.equals("MenuItemDetalleMostrarOcultarBarrio")) {
				jButtonMostrarOcultarBarrioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosBarrio")) {
				jButtonNuevoGuardarCambiosBarrioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarBarrio")) {
				jButtonNuevoGuardarCambiosBarrioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosBarrio")) {
				jButtonNuevoGuardarCambiosBarrioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoBarrio")) {
				jButtonCerrarReporteDinamicoBarrioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoBarrio")) {
				jButtonGenerarReporteDinamicoBarrioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoBarrio")) {
				
				jButtonGenerarExcelReporteDinamicoBarrioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionBarrio")) {
				jButtonCerrarImportacionBarrioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionBarrio")) {
				
				jButtonGenerarImportacionBarrioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionBarrio")) {
				
				jButtonAbrirImportacionBarrioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesBarrio")) {
				jComboBoxTiposAccionesBarrioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesBarrio")) {
				jComboBoxTiposRelacionesBarrioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioBarrio")) {
				jComboBoxTiposAccionesBarrioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarBarrio")) {
				
				jComboBoxTiposSeleccionarBarrioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralBarrio")) {
				jTextFieldValorCampoGeneralBarrioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByBarrio")) {
				jButtonAbrirOrderByBarrioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarBarrio")) {
				jButtonAbrirOrderByBarrioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByBarrio")) {
				jButtonCerrarOrderByBarrioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idBarrioBusqueda")) {
				this.jButtonidBarrioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_provinciaBarrioUpdate")) {
				this.jButtonid_provinciaBarrioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_provinciaBarrioBusqueda")) {
				this.jButtonid_provinciaBarrioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cantonBarrioUpdate")) {
				this.jButtonid_cantonBarrioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cantonBarrioBusqueda")) {
				this.jButtonid_cantonBarrioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_parroquiaBarrioUpdate")) {
				this.jButtonid_parroquiaBarrioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_parroquiaBarrioBusqueda")) {
				this.jButtonid_parroquiaBarrioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoBarrioBusqueda")) {
				this.jButtoncodigoBarrioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreBarrioBusqueda")) {
				this.jButtonnombreBarrioBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdCantonBarrio")) {
				this.jButtonFK_IdCantonBarrioActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdParroquiaBarrio")) {
				this.jButtonFK_IdParroquiaBarrioActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProvinciaBarrio")) {
				this.jButtonFK_IdProvinciaBarrioActionPerformed(evt);
			}
			
			;
			
			
			BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessBarrio();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBarrioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.barrio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.barrio);
				
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
				
				


				
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Barrio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Barrio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Barrio barrioLocal=null;
			
			if(!this.getEsControlTabla()) {
				barrioLocal=this.barrio;
			} else {
				barrioLocal=this.barrioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.barrio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.barrio);
				
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
							
				
				


				
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Barrio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Barrio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBarrioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBarrio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioAnterior =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.barrioAnterior =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
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
			
			BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
			
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
			
			


			
			BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBarrioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.barrio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.barrio);
				
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
								
						
				


				
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Barrio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Barrio.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.barrio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.barrio);
				
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
								
				
				


				
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Barrio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Barrio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBarrioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBarrio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioAnterior =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.barrioAnterior =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.barrio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.barrio);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBarrioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBarrio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioAnterior =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.barrioAnterior =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBarrioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.barrio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.barrio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.barrio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.barrio);
				
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
							
				
				


				
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Barrio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Barrio.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBarrioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosBarrio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.barrioAnterior =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.barrioAnterior =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
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
			
			BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
			
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
			
			


			
			BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBarrioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.barrio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.barrio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.barrio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.barrio);
				
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
								
				
				


				
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Barrio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Barrio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBarrioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBarrio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioAnterior =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.barrioAnterior =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBarrioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.barrio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.barrio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBarrioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.barrio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.barrio);
				
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosBarrio")) {
					jCheckBoxSeleccionarTodosBarrioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosBarrio")) {
					jCheckBoxSeleccionadosBarrioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarBarrio")) {
					
				}
				
				


				
				
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Barrio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Barrio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.barrio);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.barrio);
				
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
												
				
				


				
				
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Barrio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Barrio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBarrioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosBarrio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.barrioAnterior =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.barrioAnterior =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBarrioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.barrio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.barrio);
				
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
				
				
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
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
			
			BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
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
			
			


			
			BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBarrioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.barrio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.barrio);
				
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Barrio.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Barrio.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.barrio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.barrio);
				
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
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
				
				


				
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Barrio.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Barrio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBarrioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBarrio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.barrioAnterior =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.barrioAnterior =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarBarrio")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosBarrioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosBarrio.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.barrio =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.barrio =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.barrio);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarBarrio")) {
				
				}
				
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarBarrio")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosBarrio.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarBarrio")) {
			
			}
			
			BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessBarrio();
			
			BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
			
			if(sTipo.equals("NuevoBarrio")) {
				jButtonNuevoBarrioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarBarrio")) {
				jButtonDuplicarBarrioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarBarrio")) {
				jButtonCopiarBarrioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormBarrio")) {
				jButtonVerFormBarrioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesBarrio")) {
				jButtonNuevoBarrioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarBarrio")) {
				jButtonModificarBarrioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarBarrio")) {
				jButtonActualizarBarrioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarBarrio")) {
				jButtonEliminarBarrioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaBarrio")) {
				jButtonGuardarCambiosBarrioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarBarrio")) {
				jButtonCancelarBarrioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarBarrio")) {
				jButtonCerrarBarrioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosBarrio")) {
				jButtonGuardarCambiosBarrioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosBarrio")) {
				jButtonNuevoGuardarCambiosBarrioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByBarrio")) {
				jButtonAbrirOrderByBarrioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionBarrio")) {
				jButtonRecargarInformacionBarrioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresBarrio")) {
				jButtonAnterioresBarrioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesBarrio")) {
				jButtonSiguientesBarrioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idBarrioBusqueda")) {
				this.jButtonidBarrioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_provinciaBarrioUpdate")) {
				this.jButtonid_provinciaBarrioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_provinciaBarrioBusqueda")) {
				this.jButtonid_provinciaBarrioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cantonBarrioUpdate")) {
				this.jButtonid_cantonBarrioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cantonBarrioBusqueda")) {
				this.jButtonid_cantonBarrioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_parroquiaBarrioUpdate")) {
				this.jButtonid_parroquiaBarrioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_parroquiaBarrioBusqueda")) {
				this.jButtonid_parroquiaBarrioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoBarrioBusqueda")) {
				this.jButtoncodigoBarrioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreBarrioBusqueda")) {
				this.jButtonnombreBarrioBusquedaActionPerformed(evt);
			}
			
			BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessBarrio();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameBarrio")) {
				closingInternalFrameBarrio();
				
			} else if(sTipo.equals("jButtonCancelarBarrio")) {
				JInternalFrameBase jInternalFrameDetalleFormBarrio = (JInternalFrameBase)evt.getSource();
	            	
	            BarrioBeanSwingJInternalFrame jInternalFrameParent=(BarrioBeanSwingJInternalFrame)jInternalFrameDetalleFormBarrio.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarBarrioActionPerformed(null);
			}
			
			BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.barrio,new Object(),this.barrioParameterGeneral,this.barrioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormBarrio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormBarrio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormBarrio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.barrio)) {
			if(!esControlTabla) {
				if(BarrioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualBarrio(this.barrio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysBarrio(this.barrio);			
				}
				
				if(this.barrioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualBarrio(this.barrio,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.barrioReturnGeneral=barrioLogic.procesarEventosBarriosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.barrioLogic.getBarrios(),this.barrio,this.barrioParameterGeneral,this.isEsNuevoBarrio,classes);//this.barrioLogic.getBarrio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanBarrio(this.barrioReturnGeneral,this.barrioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.barrioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanBarrio(classes,this.barrioReturnGeneral,this.barrioBean,false);
					}
						
					if(this.barrioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyBarrio(this.barrioReturnGeneral.getBarrio());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioBarrio(this.barrioReturnGeneral.getBarrio());	
					}
						
					if(this.barrioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioBarrio(this.barrioReturnGeneral.getBarrio(),classes);//this.barrioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioBarrio(this.barrio,classes);//this.barrioBean);									
				}
			
				if(BarrioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualBarrio(this.barrio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysBarrio(this.barrio);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.barrioAnterior!=null) {
						this.barrio=this.barrioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.barrioReturnGeneral=barrioLogic.procesarEventosBarriosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.barrioLogic.getBarrios(),this.barrio,this.barrioParameterGeneral,this.isEsNuevoBarrio,classes);//this.barrioLogic.getBarrio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.barrioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.barrioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.barrioReturnGeneral.getBarrio(),barrioLogic.getBarrios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.barrioReturnGeneral.getBarrio(),this.barrios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosBarrio.repaint();
				
				//((AbstractTableModel) this.jTableDatosBarrio.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosBarrio();
			}
		}
	}
	
	public void actualizarVisualTableDatosBarrio() throws Exception {
		
		BarrioModel barrioModel=(BarrioModel)this.jTableDatosBarrio.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			barrioModel.barrios=this.barrioLogic.getBarrios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			barrioModel.barrios=this.barrios;
		}
		
		
		((BarrioModel) this.jTableDatosBarrio.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaBarrio() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getbarrioAnterior(),this.barrioLogic.getBarrios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getbarrioAnterior(),this.barrios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosBarrio();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioBarrio(Barrio barrio,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
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
										
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.barrio,new Object(),generalEntityParameterGeneral,this.barrioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.barrioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=BarrioConstantesFunciones.getClassesRelationshipsOfBarrio(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=BarrioConstantesFunciones.getClassesRelationshipsFromStringsOfBarrio(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormBarrio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				BarrioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.barrio,new Object(),generalEntityParameterGeneral,this.barrioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioBarrio(BarrioBean barrioBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanBarrio(ArrayList<Classe> classes,BarrioReturnGeneral barrioReturnGeneral,BarrioBean barrioBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualBarrio(Barrio barrio,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.barrio)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormBarrio = new BarrioDetalleFormJInternalFrame(jDesktopPane,this.barrioSessionBean.getConGuardarRelaciones(),this.barrioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormBarrio);
		this.jInternalFrameDetalleFormBarrio.setVisible(false);
		this.jInternalFrameDetalleFormBarrio.setSelected(false);						
		
		this.jInternalFrameDetalleFormBarrio.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormBarrio.barrioLogic=this.barrioLogic;
		
		this.cargarCombosFrameForeignKeyBarrio("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleBarrio();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleBarrio();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyBarrio("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyBarrio();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormBarrio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarBarrio"));
		
		this.jInternalFrameDetalleFormBarrio.jButtonModificarBarrio.addActionListener(new ButtonActionListener(this,"ModificarBarrio"));

		
		this.jInternalFrameDetalleFormBarrio.jButtonModificarToolBarBarrio.addActionListener(new ButtonActionListener(this,"ModificarToolBarBarrio"));
					
		this.jInternalFrameDetalleFormBarrio.jMenuItemModificarBarrio.addActionListener(new ButtonActionListener(this,"MenuItemModificarBarrio"));		
		
		
		
		this.jInternalFrameDetalleFormBarrio.jButtonActualizarBarrio.addActionListener (new ButtonActionListener(this,"ActualizarBarrio"));
		
		
		this.jInternalFrameDetalleFormBarrio.jButtonActualizarToolBarBarrio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarBarrio"));
						
		this.jInternalFrameDetalleFormBarrio.jMenuItemActualizarBarrio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarBarrio"));		
		
		
		
		this.jInternalFrameDetalleFormBarrio.jButtonEliminarBarrio.addActionListener (new ButtonActionListener(this,"EliminarBarrio"));
		
		
		this.jInternalFrameDetalleFormBarrio.jButtonEliminarToolBarBarrio.addActionListener (new ButtonActionListener(this,"EliminarToolBarBarrio"));
								
		this.jInternalFrameDetalleFormBarrio.jMenuItemEliminarBarrio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarBarrio"));		
		
		
		
		this.jInternalFrameDetalleFormBarrio.jButtonCancelarBarrio.addActionListener (new ButtonActionListener(this,"CancelarBarrio"));
		
		
		this.jInternalFrameDetalleFormBarrio.jButtonCancelarToolBarBarrio.addActionListener (new ButtonActionListener(this,"CancelarToolBarBarrio"));
					
		this.jInternalFrameDetalleFormBarrio.jMenuItemCancelarBarrio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarBarrio"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormBarrio.jMenuItemDetalleCerrarBarrio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarBarrio"));		
		
		
		
		this.jInternalFrameDetalleFormBarrio.jButtonGuardarCambiosToolBarBarrio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBarrio"));
		
		
		
		this.jInternalFrameDetalleFormBarrio.jButtonGuardarCambiosToolBarBarrio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBarrio"));
		
		
		
		this.jInternalFrameDetalleFormBarrio.jComboBoxTiposAccionesFormularioBarrio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioBarrio"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBarrio.jButtonidBarrioBusqueda.addActionListener(new ButtonActionListener(this,"idBarrioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBarrio.jButtonid_provinciaBarrioUpdate.addActionListener(new ButtonActionListener(this,"id_provinciaBarrioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBarrio.jButtonid_provinciaBarrioBusqueda.addActionListener(new ButtonActionListener(this,"id_provinciaBarrioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBarrio.jButtonid_cantonBarrioUpdate.addActionListener(new ButtonActionListener(this,"id_cantonBarrioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBarrio.jButtonid_cantonBarrioBusqueda.addActionListener(new ButtonActionListener(this,"id_cantonBarrioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBarrio.jButtonid_parroquiaBarrioUpdate.addActionListener(new ButtonActionListener(this,"id_parroquiaBarrioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBarrio.jButtonid_parroquiaBarrioBusqueda.addActionListener(new ButtonActionListener(this,"id_parroquiaBarrioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBarrio.jButtoncodigoBarrioBusqueda.addActionListener(new ButtonActionListener(this,"codigoBarrioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBarrio.jButtonnombreBarrioBusqueda.addActionListener(new ButtonActionListener(this,"nombreBarrioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormBarrio.jTabbedPaneRelacionesBarrio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesBarrio"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameBarrio"));
		
		if(this.jInternalFrameDetalleFormBarrio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBarrio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarBarrio"));
		}
		
		this.jTableDatosBarrio.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarBarrio"));
		
		this.jTableDatosBarrio.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarBarrio"));
		
		this.jButtonNuevoBarrio.addActionListener(new ButtonActionListener(this,"NuevoBarrio"));
		
		this.jButtonDuplicarBarrio.addActionListener(new ButtonActionListener(this,"DuplicarBarrio"));
		
		this.jButtonCopiarBarrio.addActionListener(new ButtonActionListener(this,"CopiarBarrio"));
		
		this.jButtonVerFormBarrio.addActionListener(new ButtonActionListener(this,"VerFormBarrio"));
		
		
		this.jButtonNuevoToolBarBarrio.addActionListener(new ButtonActionListener(this,"NuevoToolBarBarrio"));
			
		this.jButtonDuplicarToolBarBarrio.addActionListener(new ButtonActionListener(this,"DuplicarToolBarBarrio"));
			
		this.jMenuItemNuevoBarrio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoBarrio"));
			
		this.jMenuItemDuplicarBarrio.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarBarrio"));		
		
		
		this.jButtonNuevoRelacionesBarrio.addActionListener (new ButtonActionListener(this,"NuevoRelacionesBarrio"));
		
		
		this.jButtonNuevoRelacionesToolBarBarrio.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarBarrio"));
			
		this.jMenuItemNuevoRelacionesBarrio.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesBarrio"));		
		
		
		if(this.jInternalFrameDetalleFormBarrio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBarrio.jButtonModificarBarrio.addActionListener(new ButtonActionListener(this,"ModificarBarrio"));
		}
		
		
		if(this.jInternalFrameDetalleFormBarrio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBarrio.jButtonModificarToolBarBarrio.addActionListener(new ButtonActionListener(this,"ModificarToolBarBarrio"));
			
			this.jInternalFrameDetalleFormBarrio.jMenuItemModificarBarrio.addActionListener(new ButtonActionListener(this,"MenuItemModificarBarrio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBarrio!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormBarrio.jButtonActualizarBarrio.addActionListener (new ButtonActionListener(this,"ActualizarBarrio"));
		}
		
		
		if(this.jInternalFrameDetalleFormBarrio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBarrio.jButtonActualizarToolBarBarrio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarBarrio"));
				
			this.jInternalFrameDetalleFormBarrio.jMenuItemActualizarBarrio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarBarrio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBarrio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBarrio.jButtonEliminarBarrio.addActionListener (new ButtonActionListener(this,"EliminarBarrio"));
		}
		
		
		if(this.jInternalFrameDetalleFormBarrio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBarrio.jButtonEliminarToolBarBarrio.addActionListener (new ButtonActionListener(this,"EliminarToolBarBarrio"));
						
			this.jInternalFrameDetalleFormBarrio.jMenuItemEliminarBarrio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarBarrio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBarrio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBarrio.jButtonCancelarBarrio.addActionListener (new ButtonActionListener(this,"CancelarBarrio"));
		}
		
		
		if(this.jInternalFrameDetalleFormBarrio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBarrio.jButtonCancelarToolBarBarrio.addActionListener (new ButtonActionListener(this,"CancelarToolBarBarrio"));
			
			this.jInternalFrameDetalleFormBarrio.jMenuItemCancelarBarrio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarBarrio"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarBarrio.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarBarrio"));		
		
		
		this.jButtonCerrarBarrio.addActionListener (new ButtonActionListener(this,"CerrarBarrio"));
		
		
		this.jButtonCerrarToolBarBarrio.addActionListener (new ButtonActionListener(this,"CerrarToolBarBarrio"));
			
		this.jMenuItemCerrarBarrio.addActionListener (new ButtonActionListener(this,"MenuItemCerrarBarrio"));
			
		if(this.jInternalFrameDetalleFormBarrio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBarrio.jMenuItemDetalleCerrarBarrio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarBarrio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBarrio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBarrio.jButtonGuardarCambiosBarrio.addActionListener (new ButtonActionListener(this,"GuardarCambiosBarrio"));
		}
		
		
		if(this.jInternalFrameDetalleFormBarrio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBarrio.jButtonGuardarCambiosToolBarBarrio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBarrio"));
		}
		
		this.jButtonCopiarToolBarBarrio.addActionListener (new ButtonActionListener(this,"CopiarToolBarBarrio"));
			
		this.jButtonVerFormToolBarBarrio.addActionListener (new ButtonActionListener(this,"VerFormToolBarBarrio"));
		
		this.jMenuItemGuardarCambiosBarrio.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosBarrio"));
			
		this.jMenuItemCopiarBarrio.addActionListener (new ButtonActionListener(this,"MenuItemCopiarBarrio"));		
		
		this.jMenuItemVerFormBarrio.addActionListener (new ButtonActionListener(this,"MenuItemVerFormBarrio"));		
		
		
		this.jButtonGuardarCambiosTablaBarrio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaBarrio"));
		
		
		this.jButtonGuardarCambiosTablaToolBarBarrio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarBarrio"));
			
		this.jMenuItemGuardarCambiosTablaBarrio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaBarrio"));		
		
		
		
		this.jButtonRecargarInformacionBarrio.addActionListener (new ButtonActionListener(this,"RecargarInformacionBarrio"));
					
		this.jButtonRecargarInformacionToolBarBarrio.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarBarrio"));
		
		this.jMenuItemRecargarInformacionBarrio.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionBarrio"));		
		
		
		
		this.jButtonAnterioresBarrio.addActionListener (new ButtonActionListener(this,"AnterioresBarrio"));
		
		
		this.jButtonAnterioresToolBarBarrio.addActionListener (new ButtonActionListener(this,"AnterioresToolBarBarrio"));
		
		this.jMenuItemAnterioresBarrio.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresBarrio"));		
		
		
		this.jButtonSiguientesBarrio.addActionListener (new ButtonActionListener(this,"SiguientesBarrio"));
		
		
		this.jButtonSiguientesToolBarBarrio.addActionListener (new ButtonActionListener(this,"SiguientesToolBarBarrio"));
			
		this.jMenuItemSiguientesBarrio.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesBarrio"));
			
		this.jMenuItemAbrirOrderByBarrio.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByBarrio"));
			
		this.jMenuItemMostrarOcultarBarrio.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarBarrio"));
			
		this.jMenuItemDetalleAbrirOrderByBarrio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByBarrio"));
			
		this.jMenuItemDetalleMostarOcultarBarrio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarBarrio"));		
		
		
		this.jButtonNuevoGuardarCambiosBarrio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosBarrio"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarBarrio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarBarrio"));
			
		this.jMenuItemNuevoGuardarCambiosBarrio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosBarrio"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosBarrio.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosBarrio"));

		this.jCheckBoxSeleccionadosBarrio.addItemListener(new CheckBoxItemListener(this,"SeleccionadosBarrio"));
		
		if(this.jInternalFrameDetalleFormBarrio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBarrio.jComboBoxTiposAccionesFormularioBarrio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioBarrio"));
		}
		
		
		this.jComboBoxTiposRelacionesBarrio.addActionListener (new ButtonActionListener(this,"TiposRelacionesBarrio"));
			
		this.jComboBoxTiposAccionesBarrio.addActionListener (new ButtonActionListener(this,"TiposAccionesBarrio"));
					
		this.jComboBoxTiposSeleccionarBarrio.addActionListener (new ButtonActionListener(this,"TiposSeleccionarBarrio"));
			
		this.jTextFieldValorCampoGeneralBarrio.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralBarrio"));		
		
		
		if(this.jInternalFrameDetalleFormBarrio!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBarrio.jButtonidBarrioBusqueda.addActionListener(new ButtonActionListener(this,"idBarrioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBarrio.jButtonid_provinciaBarrioUpdate.addActionListener(new ButtonActionListener(this,"id_provinciaBarrioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBarrio.jButtonid_provinciaBarrioBusqueda.addActionListener(new ButtonActionListener(this,"id_provinciaBarrioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBarrio.jButtonid_cantonBarrioUpdate.addActionListener(new ButtonActionListener(this,"id_cantonBarrioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBarrio.jButtonid_cantonBarrioBusqueda.addActionListener(new ButtonActionListener(this,"id_cantonBarrioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBarrio.jButtonid_parroquiaBarrioUpdate.addActionListener(new ButtonActionListener(this,"id_parroquiaBarrioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBarrio.jButtonid_parroquiaBarrioBusqueda.addActionListener(new ButtonActionListener(this,"id_parroquiaBarrioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBarrio.jButtoncodigoBarrioBusqueda.addActionListener(new ButtonActionListener(this,"codigoBarrioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBarrio.jButtonnombreBarrioBusqueda.addActionListener(new ButtonActionListener(this,"nombreBarrioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCantonBarrio.addActionListener(new ButtonActionListener(this,"FK_IdCantonBarrio"));

			this.jButtonFK_IdParroquiaBarrio.addActionListener(new ButtonActionListener(this,"FK_IdParroquiaBarrio"));

			this.jButtonFK_IdProvinciaBarrio.addActionListener(new ButtonActionListener(this,"FK_IdProvinciaBarrio"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoBarrio!=null) {
				this.jInternalFrameReporteDinamicoBarrio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBarrio"));
				this.jInternalFrameReporteDinamicoBarrio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBarrio"));
				this.jInternalFrameReporteDinamicoBarrio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBarrio"));
			}
			
			//this.jButtonCerrarReporteDinamicoBarrio.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBarrio"));				
			//this.jButtonGenerarReporteDinamicoBarrio.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBarrio"));
			//this.jButtonGenerarExcelReporteDinamicoBarrio.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBarrio"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionBarrio!=null) {
				this.jInternalFrameImportacionBarrio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionBarrio"));
				this.jInternalFrameImportacionBarrio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionBarrio"));
				this.jInternalFrameImportacionBarrio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionBarrio"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByBarrio.addActionListener (new ButtonActionListener(this,"AbrirOrderByBarrio"));
			
			this.jButtonAbrirOrderByToolBarBarrio.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarBarrio"));			
			
			if(this.jInternalFrameOrderByBarrio!=null) {
				this.jInternalFrameOrderByBarrio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByBarrio"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormBarrio!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormBarrio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBarrio.jTabbedPaneRelacionesBarrio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesBarrio"));
		
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
            		closingInternalFrameBarrio();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormBarrio.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormBarrio = (JInternalFrameBase)event.getSource();
	            	
	            BarrioBeanSwingJInternalFrame jInternalFrameParent=(BarrioBeanSwingJInternalFrame)jInternalFrameDetalleFormBarrio.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarBarrioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosBarrio.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosBarrioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosBarrio.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosBarrio.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBarrioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBarrioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBarrioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoBarrio";
		inputMap = this.jButtonNuevoBarrio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoBarrio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoBarrioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBarrioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBarrioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBarrioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesBarrio";
		inputMap = this.jButtonNuevoRelacionesBarrio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesBarrio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoBarrioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarBarrio";
		inputMap = this.jButtonModificarBarrio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarBarrio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarBarrioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarBarrio";
		inputMap = this.jButtonActualizarBarrio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarBarrio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarBarrioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarBarrio";
		inputMap = this.jButtonEliminarBarrio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarBarrio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarBarrioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarBarrio";
		inputMap = this.jButtonCancelarBarrio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarBarrio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarBarrioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarBarrio";
		inputMap = this.jButtonCerrarBarrio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarBarrio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarBarrioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormBarrio.jButtonGuardarCambiosBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosBarrio";
		inputMap = this.jInternalFrameDetalleFormBarrio.jButtonGuardarCambiosBarrio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormBarrio.jButtonGuardarCambiosBarrio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosBarrioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosBarrio.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosBarrioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesBarrio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesBarrioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarBarrio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarBarrioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralBarrio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralBarrioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBarrio.jButtonidBarrioBusqueda.addActionListener(new ButtonActionListener(this,"idBarrioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBarrio.jButtonid_provinciaBarrioUpdate.addActionListener(new ButtonActionListener(this,"id_provinciaBarrioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBarrio.jButtonid_provinciaBarrioBusqueda.addActionListener(new ButtonActionListener(this,"id_provinciaBarrioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBarrio.jButtonid_cantonBarrioUpdate.addActionListener(new ButtonActionListener(this,"id_cantonBarrioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBarrio.jButtonid_cantonBarrioBusqueda.addActionListener(new ButtonActionListener(this,"id_cantonBarrioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBarrio.jButtonid_parroquiaBarrioUpdate.addActionListener(new ButtonActionListener(this,"id_parroquiaBarrioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBarrio.jButtonid_parroquiaBarrioBusqueda.addActionListener(new ButtonActionListener(this,"id_parroquiaBarrioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBarrio.jButtoncodigoBarrioBusqueda.addActionListener(new ButtonActionListener(this,"codigoBarrioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBarrio.jButtonnombreBarrioBusqueda.addActionListener(new ButtonActionListener(this,"nombreBarrioBusqueda"));
		
		
		this.jButtonFK_IdCantonBarrio.addActionListener(new ButtonActionListener(this,"FK_IdCantonBarrio"));

		this.jButtonFK_IdParroquiaBarrio.addActionListener(new ButtonActionListener(this,"FK_IdParroquiaBarrio"));

		this.jButtonFK_IdProvinciaBarrio.addActionListener(new ButtonActionListener(this,"FK_IdProvinciaBarrio"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionBarrio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionBarrioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarBarrioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarBarrio.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosBarrio(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Barrio barrioAux:this.barrioLogic.getBarrios()) {
					barrioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Barrio barrioAux:barrios) {
					barrioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosBarrioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingBarrio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Barrio barrioAux:this.barrioLogic.getBarrios()) {
						barrioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Barrio barrioAux:barrios) {
						barrioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Barrio barrioAux:this.barrioLogic.getBarrios()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Barrio barrioAux:barrios) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaBarrio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosBarrio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosBarrio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosBarrio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosBarrioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingBarrio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosBarrio.getSelectedRows();
			
			Barrio barrioLocal=new Barrio();
			
			//this.seleccionarTodosBarrio(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					barrioLocal =(Barrio) this.barrioLogic.getBarrios().toArray()[this.jTableDatosBarrio.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					barrioLocal =(Barrio) this.barrios.toArray()[this.jTableDatosBarrio.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				barrioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Barrio barrioAux:this.barrioLogic.getBarrios()) {
						barrioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Barrio barrioAux:barrios) {
						barrioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaBarrio(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosBarrio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosBarrio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosBarrio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualBarrioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarBarrioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralBarrioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingBarrio(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralBarrio.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Barrio barrioAux:this.barrioLogic.getBarrios()) {
				
						if(sTipoSeleccionar.equals(BarrioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							barrioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BarrioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							barrioAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Barrio barrioAux:barrios) {
					
						if(sTipoSeleccionar.equals(BarrioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							barrioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BarrioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							barrioAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaBarrio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesBarrioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingBarrio(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioBarrio=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesBarrio.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormBarrio.jComboBoxTiposAccionesFormularioBarrio.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteBarrio) {				
					conSplash=true;//false;										
					
					//this.startProcessBarrio(conSplash);
				
					this.generarReporteBarriosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBarrio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBarrio.jComboBoxTiposAccionesFormularioBarrio.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoBarriosSeleccionados();
				//this.jComboBoxTiposAccionesBarrio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoBarriosSeleccionados(false);
				//this.jComboBoxTiposAccionesBarrio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoBarriosSeleccionados(true);
				//this.jComboBoxTiposAccionesBarrio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessBarrio();
				
				this.exportarBarriosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBarrio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBarrio.jComboBoxTiposAccionesFormularioBarrio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionBarrios();
				//this.importarBarrios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBarrio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBarrio.jComboBoxTiposAccionesFormularioBarrio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessBarrio();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelBarriosSeleccionados();
				//this.jComboBoxTiposAccionesBarrio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Barrio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessBarrio();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoBarrio)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyBarrio(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Barrio",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBarrio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBarrio.jComboBoxTiposAccionesFormularioBarrio.setSelectedIndex(0);					
				}	
			} 			
			else if(BarrioBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteBarrio) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessBarrio(conSplash);
					
						//this.actualizarParametrosGeneralBarrio();
						
						this.generarReporteProcesoAccionBarriosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesBarrio.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormBarrio.jComboBoxTiposAccionesFormularioBarrio.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(BarrioBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO BarrioS SELECCIONADOS?", "MANTENIMIENTO DE Barrio", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessBarrio();
				
						this.actualizarParametrosGeneralBarrio();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.barrioReturnGeneral=barrioLogic.procesarAccionBarriosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.barrioLogic.getBarrios(),this.barrioParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarBarrioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesBarrio.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormBarrio.jComboBoxTiposAccionesFormularioBarrio.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralBarrio();
					
					BarrioBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarBarrioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesBarrio.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormBarrio.jComboBoxTiposAccionesFormularioBarrio.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessBarrio(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesBarrioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessBarrio();
			
			if(this.jInternalFrameDetalleFormBarrio==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Barrio> barriosSeleccionados=new ArrayList<Barrio>();		
			Barrio barrio=new Barrio();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingBarrio(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesBarrio.getSelectedItem();
			
			
			
			
			barriosSeleccionados=this.getBarriosSeleccionados(true);
			//this.sTipoAccion;
			
			if(barriosSeleccionados.size()==1) {
				for(Barrio barrioAux:barriosSeleccionados) {
					barrio=barrioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessBarrio();
			
      		//this.finishProcessBarrio(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarBarrioReturnGeneral() throws Exception {
		if(this.barrioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.barrioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.barrioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.barrioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.barrioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.barrioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingBarrio(false);
		}
		
		if(this.barrioReturnGeneral.getConRetornoLista() || this.barrioReturnGeneral.getConRetornoObjeto()) {
			if(this.barrioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.barrioLogic.setBarrios(this.barrioReturnGeneral.getBarrios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.barrioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.barrioLogic.setBarrio(this.barrioReturnGeneral.getBarrio());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingBarrio(false);
		}
	}
	
	public void actualizarParametrosGeneralBarrio() throws Exception {
		
		
	}
	
	public ArrayList<Barrio> getBarriosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Barrio> barriosSeleccionados=new ArrayList<Barrio>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioBarrio) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Barrio barrioAux:barrioLogic.getBarrios()) {
					if(barrioAux.getIsSelected()) {
						barriosSeleccionados.add(barrioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Barrio barrioAux:this.barrios) {
					if(barrioAux.getIsSelected()) {
						barriosSeleccionados.add(barrioAux);				
					}
				}
			}
			
			if(barriosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						barriosSeleccionados.addAll(this.barrioLogic.getBarrios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						barriosSeleccionados.addAll(this.barrios);				
					}
				}
			}
		} else {
			barriosSeleccionados.add(this.barrio);
		}
		
		return barriosSeleccionados;
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
	
	public void generarReporteBarriosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalBarriosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoBarriosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoBarriosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoBarriosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Barrio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesBarriosSeleccionados() throws Exception {
		ArrayList<Barrio> barriosSeleccionados=new ArrayList<Barrio>();		
		
		barriosSeleccionados=this.getBarriosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteBarrios("Todos",barriosSeleccionados);
		
	}	
	
	public void generarReporteNormalBarriosSeleccionados() throws Exception {
		ArrayList<Barrio> barriosSeleccionados=new ArrayList<Barrio>();		
		
		barriosSeleccionados=this.getBarriosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteBarrios("Todos",barriosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionBarriosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Barrio> barriosSeleccionados=new ArrayList<Barrio>();
		
		barriosSeleccionados=this.getBarriosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteBarrios("Todos",barriosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoBarriosSeleccionados() throws Exception {
		ArrayList<Barrio> barriosSeleccionados=new ArrayList<Barrio>();		
		
		
		this.abrirInicializarFrameReporteDinamicoBarrio();
		
		
		barriosSeleccionados=this.getBarriosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoBarrio();
		
		
		//this.generarReporteBarrios("Todos",barriosSeleccionados ,barrioImplementable,barrioImplementableHome);
	}
	
	public void mostrarImportacionBarrios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionBarrio();
		
		this.abrirFrameImportacionBarrio();		
		
			
		//this.generarReporteBarrios("Todos",barriosSeleccionados ,barrioImplementable,barrioImplementableHome);
	}
	
	public void importarBarrios() throws Exception {		
	
	}
	
	public void exportarBarriosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelBarriosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoBarriosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlBarriosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Barrio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoBarriosSeleccionados() throws Exception {
		ArrayList<Barrio> barriosSeleccionados=new ArrayList<Barrio>();		
		
		barriosSeleccionados=this.getBarriosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"barrio."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarBarrio(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Barrio barrioAux:barriosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarBarrio(barrioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//barrioAux.setsDetalleGeneralEntityReporte(barrioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.barrioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Barrio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarBarrio(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=BarrioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BarrioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BarrioConstantesFunciones.LABEL_IDPROVINCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BarrioConstantesFunciones.LABEL_IDCANTON;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BarrioConstantesFunciones.LABEL_IDPARROQUIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BarrioConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BarrioConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarBarrio(Barrio barrio,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=barrio.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=barrio.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=barrio.getprovincia_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=barrio.getcanton_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=barrio.getparroquia_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=barrio.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=barrio.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelBarriosSeleccionados() throws Exception {
		ArrayList<Barrio> barriosSeleccionados=new ArrayList<Barrio>();		
		
		barriosSeleccionados=this.getBarriosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"barrio.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Barrios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelBarrio(row);				
				iRow++;
			}				
			
			for(Barrio barrioAux:barriosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelBarrio(barrioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.barrioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Barrio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlBarriosSeleccionados() throws Exception {
		ArrayList<Barrio> barriosSeleccionados=new ArrayList<Barrio>();		
		
		barriosSeleccionados=this.getBarriosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"barrio.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("barrios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("barrio");
			//elementRoot.appendChild(element);
		
			for(Barrio barrioAux:barriosSeleccionados) {
				element = document.createElement("barrio");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlBarrio(barrioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.barrioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Barrio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelBarrio(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(BarrioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(BarrioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(BarrioConstantesFunciones.LABEL_IDPROVINCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(BarrioConstantesFunciones.LABEL_IDCANTON);
		cell = row.createCell(iColumn++);cell.setCellValue(BarrioConstantesFunciones.LABEL_IDPARROQUIA);
		cell = row.createCell(iColumn++);cell.setCellValue(BarrioConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(BarrioConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelBarrio(Barrio barrio,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(barrio.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(barrio.getprovincia_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(barrio.getcanton_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(barrio.getparroquia_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(barrio.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(barrio.getnombre());				
	}
	
	public void setFilaDatosExportarXmlBarrio(Barrio barrio,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(BarrioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(barrio.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(BarrioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(barrio.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementprovincia_descripcion = document.createElement(BarrioConstantesFunciones.IDPROVINCIA);
		elementprovincia_descripcion.appendChild(document.createTextNode(barrio.getprovincia_descripcion()));
		element.appendChild(elementprovincia_descripcion);

		Element elementcanton_descripcion = document.createElement(BarrioConstantesFunciones.IDCANTON);
		elementcanton_descripcion.appendChild(document.createTextNode(barrio.getcanton_descripcion()));
		element.appendChild(elementcanton_descripcion);

		Element elementparroquia_descripcion = document.createElement(BarrioConstantesFunciones.IDPARROQUIA);
		elementparroquia_descripcion.appendChild(document.createTextNode(barrio.getparroquia_descripcion()));
		element.appendChild(elementparroquia_descripcion);

		Element elementcodigo = document.createElement(BarrioConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(barrio.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(BarrioConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(barrio.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoBarriosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Barrio> barriosSeleccionados=new ArrayList<Barrio>();
		
		barriosSeleccionados=this.getBarriosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoBarrio(barriosSeleccionados);
		
		this.generarReporteBarrios("Todos",barriosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoBarrio(ArrayList<Barrio> barriosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Barrio barrioAux:barriosSeleccionados) {
				barrioAux.setsDetalleGeneralEntityReporte(barrioAux.toString());
			
				if(sTipoSeleccionar.equals(BarrioConstantesFunciones.LABEL_IDPROVINCIA)) {
					existe=true;
					barrioAux.setsDescripcionGeneralEntityReporte1(barrioAux.getprovincia_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BarrioConstantesFunciones.LABEL_IDCANTON)) {
					existe=true;
					barrioAux.setsDescripcionGeneralEntityReporte1(barrioAux.getcanton_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BarrioConstantesFunciones.LABEL_IDPARROQUIA)) {
					existe=true;
					barrioAux.setsDescripcionGeneralEntityReporte1(barrioAux.getparroquia_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BarrioConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					barrioAux.setsDescripcionGeneralEntityReporte1(barrioAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(BarrioConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					barrioAux.setsDescripcionGeneralEntityReporte1(barrioAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BarrioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesBarrio(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoBarrio=true;
				this.isVisibilidadCeldaNuevoRelacionesBarrio=true;
				this.isVisibilidadCeldaGuardarCambiosBarrio=true;
			}
			
			this.isVisibilidadCeldaModificarBarrio=false;
			this.isVisibilidadCeldaActualizarBarrio=false;
			this.isVisibilidadCeldaEliminarBarrio=false;
			this.isVisibilidadCeldaCancelarBarrio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBarrio=true;
				} else {
					this.isVisibilidadCeldaGuardarBarrio=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoBarrio=false;
			this.isVisibilidadCeldaNuevoRelacionesBarrio=false;
			this.isVisibilidadCeldaGuardarCambiosBarrio=false;
			this.isVisibilidadCeldaModificarBarrio=false;
			this.isVisibilidadCeldaActualizarBarrio=true;
			this.isVisibilidadCeldaEliminarBarrio=false;
			this.isVisibilidadCeldaCancelarBarrio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBarrio=true;
				} else {
					this.isVisibilidadCeldaGuardarBarrio=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoBarrio=false;
			this.isVisibilidadCeldaNuevoRelacionesBarrio=false;
			this.isVisibilidadCeldaGuardarCambiosBarrio=false;
			this.isVisibilidadCeldaModificarBarrio=false;
			this.isVisibilidadCeldaActualizarBarrio=true;
			this.isVisibilidadCeldaEliminarBarrio=true;
			this.isVisibilidadCeldaCancelarBarrio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBarrio=true;
				} else {
					this.isVisibilidadCeldaGuardarBarrio=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoBarrio=false;
			this.isVisibilidadCeldaNuevoRelacionesBarrio=false;
			this.isVisibilidadCeldaGuardarCambiosBarrio=false;
			this.isVisibilidadCeldaModificarBarrio=false;
			this.isVisibilidadCeldaActualizarBarrio=true;
			this.isVisibilidadCeldaEliminarBarrio=false;
			this.isVisibilidadCeldaCancelarBarrio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBarrio=false;
				} else {
					this.isVisibilidadCeldaGuardarBarrio=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoBarrio=true;
			this.isVisibilidadCeldaNuevoRelacionesBarrio=true;
			this.isVisibilidadCeldaGuardarCambiosBarrio=true;
			this.isVisibilidadCeldaModificarBarrio=false;
			this.isVisibilidadCeldaActualizarBarrio=false;
			this.isVisibilidadCeldaEliminarBarrio=false;
			this.isVisibilidadCeldaCancelarBarrio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBarrio=true;
				} else {
					this.isVisibilidadCeldaGuardarBarrio=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoBarrio=false;
			this.isVisibilidadCeldaNuevoRelacionesBarrio=false;
			this.isVisibilidadCeldaGuardarCambiosBarrio=false;
			this.isVisibilidadCeldaActualizarBarrio=false;
			this.isVisibilidadCeldaEliminarBarrio=false;
			this.isVisibilidadCeldaCancelarBarrio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBarrio=false;
				} else {
					this.isVisibilidadCeldaGuardarBarrio=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoBarrio=false;
			this.isVisibilidadCeldaNuevoRelacionesBarrio=false;
			this.isVisibilidadCeldaGuardarCambiosBarrio=false;
			this.isVisibilidadCeldaModificarBarrio=true;
			this.isVisibilidadCeldaActualizarBarrio=false;
			this.isVisibilidadCeldaEliminarBarrio=false;
			this.isVisibilidadCeldaCancelarBarrio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBarrio=false;
				} else {
					this.isVisibilidadCeldaGuardarBarrio=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(BarrioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoBarrio=true;
			this.isVisibilidadCeldaNuevoRelacionesBarrio=true;
			this.isVisibilidadCeldaGuardarCambiosBarrio=true;
		} else {
			this.actualizarEstadoPanelsBarrio(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarBarrio=false;
			//this.isVisibilidadCeldaVerFormBarrio=false;
			this.isVisibilidadCeldaDuplicarBarrio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!barrioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesBarrio=false;
		} else {
			this.isVisibilidadCeldaNuevoBarrio=false;
			this.isVisibilidadCeldaGuardarCambiosBarrio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(barrioSessionBean.getEsGuardarRelacionado()) {
			if(!barrioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesBarrio=false;												
			}
			
			this.jButtonCerrarBarrio.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesBarrio=false;
		}
		
		if(!this.permiteMantenimiento(this.barrio)) {
			this.isVisibilidadCeldaActualizarBarrio=false;
			this.isVisibilidadCeldaEliminarBarrio=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesBarrio() {
	}
	
	public void actualizarEstadoPanelsBarrio(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionBarrio!=null) {
				this.jScrollPanelDatosEdicionBarrio.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBarrio!=null) {
				this.jTabbedPaneBusquedasBarrio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBarrio!=null) {
				this.jScrollPanelDatosBarrio.setVisible(true);
			}
			
			if(this.jPanelPaginacionBarrio!=null) {
				this.jPanelPaginacionBarrio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBarrio!=null) {
				this.jPanelParametrosReportesBarrio.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionBarrio!=null) {
				this.jScrollPanelDatosEdicionBarrio.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBarrio!=null) {
				this.jTabbedPaneBusquedasBarrio.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosBarrio!=null) {
				this.jScrollPanelDatosBarrio.setVisible(false);
			}
			
			if(this.jPanelPaginacionBarrio!=null) {
				this.jPanelPaginacionBarrio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBarrio!=null) {
				this.jPanelParametrosReportesBarrio.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionBarrio!=null) {
				this.jScrollPanelDatosEdicionBarrio.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBarrio!=null) {
				this.jTabbedPaneBusquedasBarrio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosBarrio!=null) {
				this.jScrollPanelDatosBarrio.setVisible(false);
			}
			
			if(this.jPanelPaginacionBarrio!=null) {
				this.jPanelPaginacionBarrio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBarrio!=null) {
				this.jPanelParametrosReportesBarrio.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionBarrio!=null) {
				this.jScrollPanelDatosEdicionBarrio.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBarrio!=null) {
				this.jTabbedPaneBusquedasBarrio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosBarrio!=null) {
				this.jScrollPanelDatosBarrio.setVisible(false);
			}
			
			if(this.jPanelPaginacionBarrio!=null) {
				this.jPanelPaginacionBarrio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBarrio!=null) {
				this.jPanelParametrosReportesBarrio.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionBarrio!=null) {
				this.jScrollPanelDatosEdicionBarrio.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBarrio!=null) {
				this.jTabbedPaneBusquedasBarrio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBarrio!=null) {
				this.jScrollPanelDatosBarrio.setVisible(true);
			}
			
			if(this.jPanelPaginacionBarrio!=null) {
				this.jPanelPaginacionBarrio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBarrio!=null) {
				this.jPanelParametrosReportesBarrio.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionBarrio!=null) {
				this.jScrollPanelDatosEdicionBarrio.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBarrio!=null) {
				this.jTabbedPaneBusquedasBarrio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBarrio!=null) {
				this.jScrollPanelDatosBarrio.setVisible(true);
			}
			
			if(this.jPanelPaginacionBarrio!=null) {
				this.jPanelPaginacionBarrio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBarrio!=null) {
				this.jPanelParametrosReportesBarrio.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionBarrio!=null) {
				this.jScrollPanelDatosEdicionBarrio.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBarrio!=null) {
				this.jTabbedPaneBusquedasBarrio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBarrio!=null) {
				this.jScrollPanelDatosBarrio.setVisible(true);
			}
			
			if(this.jPanelPaginacionBarrio!=null) {
				this.jPanelPaginacionBarrio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBarrio!=null) {
				this.jPanelParametrosReportesBarrio.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.barrioSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasBarrio!=null) {
					this.jTabbedPaneBusquedasBarrio.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesBarrio!=null) {
				this.jPanelParametrosReportesBarrio.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.barrioSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBarrio!=null) {
				this.jTabbedPaneBusquedasBarrio.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesBarrio!=null) {
				this.jPanelParametrosReportesBarrio.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaProvincia(Boolean isParaProvincia){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProvinciaNegation=!isParaProvincia;

			this.isVisibilidadFK_IdCanton=isParaProvinciaNegation;
			if(!this.isVisibilidadFK_IdCanton) {this.jTabbedPaneBusquedasBarrio.remove(jPanelFK_IdCantonBarrio);}

			this.isVisibilidadFK_IdParroquia=isParaProvinciaNegation;
			if(!this.isVisibilidadFK_IdParroquia) {this.jTabbedPaneBusquedasBarrio.remove(jPanelFK_IdParroquiaBarrio);}

			this.isVisibilidadFK_IdProvincia=isParaProvincia;
			if(!this.isVisibilidadFK_IdProvincia) {this.jTabbedPaneBusquedasBarrio.remove(jPanelFK_IdProvinciaBarrio);}
		}
		
	}

	public void setVisibilidadBusquedasParaCanton(Boolean isParaCanton){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCantonNegation=!isParaCanton;

			this.isVisibilidadFK_IdCanton=isParaCanton;
			if(!this.isVisibilidadFK_IdCanton) {this.jTabbedPaneBusquedasBarrio.remove(jPanelFK_IdCantonBarrio);}

			this.isVisibilidadFK_IdParroquia=isParaCantonNegation;
			if(!this.isVisibilidadFK_IdParroquia) {this.jTabbedPaneBusquedasBarrio.remove(jPanelFK_IdParroquiaBarrio);}

			this.isVisibilidadFK_IdProvincia=isParaCantonNegation;
			if(!this.isVisibilidadFK_IdProvincia) {this.jTabbedPaneBusquedasBarrio.remove(jPanelFK_IdProvinciaBarrio);}
		}
		
	}

	public void setVisibilidadBusquedasParaParroquia(Boolean isParaParroquia){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaParroquiaNegation=!isParaParroquia;

			this.isVisibilidadFK_IdCanton=isParaParroquiaNegation;
			if(!this.isVisibilidadFK_IdCanton) {this.jTabbedPaneBusquedasBarrio.remove(jPanelFK_IdCantonBarrio);}

			this.isVisibilidadFK_IdParroquia=isParaParroquia;
			if(!this.isVisibilidadFK_IdParroquia) {this.jTabbedPaneBusquedasBarrio.remove(jPanelFK_IdParroquiaBarrio);}

			this.isVisibilidadFK_IdProvincia=isParaParroquiaNegation;
			if(!this.isVisibilidadFK_IdProvincia) {this.jTabbedPaneBusquedasBarrio.remove(jPanelFK_IdProvinciaBarrio);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//BarrioSessionBean barrioSessionBean=new BarrioSessionBean();
		
		if(this.barrioSessionBean==null) {
			this.barrioSessionBean=new BarrioSessionBean();
		}
		
		this.barrioSessionBean.setsUltimaBusquedaBarrio(this.getsAccionBusqueda());
		this.barrioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.barrioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCanton")) {
			barrioSessionBean.setid_canton(this.getid_cantonFK_IdCanton());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdParroquia")) {
			barrioSessionBean.setid_parroquia(this.getid_parroquiaFK_IdParroquia());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProvincia")) {
			barrioSessionBean.setid_provincia(this.getid_provinciaFK_IdProvincia());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//BarrioSessionBean barrioSessionBean=new BarrioSessionBean();
		
		if(this.barrioSessionBean==null) {
			this.barrioSessionBean=new BarrioSessionBean();
		}
		
		if(this.barrioSessionBean.getsUltimaBusquedaBarrio()!=null&&!this.barrioSessionBean.getsUltimaBusquedaBarrio().equals("")) {
			this.setsAccionBusqueda(barrioSessionBean.getsUltimaBusquedaBarrio());
			this.setiNumeroPaginacion(barrioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(barrioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCanton")) {
				this.setid_cantonFK_IdCanton(barrioSessionBean.getid_canton());
				barrioSessionBean.setid_canton(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdParroquia")) {
				this.setid_parroquiaFK_IdParroquia(barrioSessionBean.getid_parroquia());
				barrioSessionBean.setid_parroquia(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProvincia")) {
				this.setid_provinciaFK_IdProvincia(barrioSessionBean.getid_provincia());
				barrioSessionBean.setid_provincia(-1L);
			}
		}
		
		this.barrioSessionBean.setsUltimaBusquedaBarrio("");
		this.barrioSessionBean.setiNumeroPaginacion(BarrioConstantesFunciones.INUMEROPAGINACION);
		this.barrioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaBarrio(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioBarrio() {
		this.updateBorderResaltarBusquedasFormularioBarrio();
		this.updateVisibilidadBusquedasFormularioBarrio();
		this.updateHabilitarBusquedasFormularioBarrio();
	}
	
	public void updateBorderResaltarBusquedasFormularioBarrio() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasBarrio.getComponents().length>0) {
	

		if(this.barrioConstantesFunciones.resaltarFK_IdCantonBarrio!=null) {
			index= this.jTabbedPaneBusquedasBarrio.indexOfComponent(this.jPanelFK_IdCantonBarrio);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBarrio.getComponent(index);
				jPanel.setBorder(this.barrioConstantesFunciones.resaltarFK_IdCantonBarrio);
			}
		}

		if(this.barrioConstantesFunciones.resaltarFK_IdParroquiaBarrio!=null) {
			index= this.jTabbedPaneBusquedasBarrio.indexOfComponent(this.jPanelFK_IdParroquiaBarrio);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBarrio.getComponent(index);
				jPanel.setBorder(this.barrioConstantesFunciones.resaltarFK_IdParroquiaBarrio);
			}
		}

		if(this.barrioConstantesFunciones.resaltarFK_IdProvinciaBarrio!=null) {
			index= this.jTabbedPaneBusquedasBarrio.indexOfComponent(this.jPanelFK_IdProvinciaBarrio);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBarrio.getComponent(index);
				jPanel.setBorder(this.barrioConstantesFunciones.resaltarFK_IdProvinciaBarrio);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioBarrio() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasBarrio.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasBarrio.indexOfComponent(this.jPanelFK_IdCantonBarrio);
			jPanel=(JPanel)this.jTabbedPaneBusquedasBarrio.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.barrioConstantesFunciones.mostrarFK_IdCantonBarrio);
			if(!this.barrioConstantesFunciones.mostrarFK_IdCantonBarrio && index>-1) {
				this.jTabbedPaneBusquedasBarrio.remove(index);
			}

			index= this.jTabbedPaneBusquedasBarrio.indexOfComponent(this.jPanelFK_IdParroquiaBarrio);
			jPanel=(JPanel)this.jTabbedPaneBusquedasBarrio.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.barrioConstantesFunciones.mostrarFK_IdParroquiaBarrio);
			if(!this.barrioConstantesFunciones.mostrarFK_IdParroquiaBarrio && index>-1) {
				this.jTabbedPaneBusquedasBarrio.remove(index);
			}

			index= this.jTabbedPaneBusquedasBarrio.indexOfComponent(this.jPanelFK_IdProvinciaBarrio);
			jPanel=(JPanel)this.jTabbedPaneBusquedasBarrio.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.barrioConstantesFunciones.mostrarFK_IdProvinciaBarrio);
			if(!this.barrioConstantesFunciones.mostrarFK_IdProvinciaBarrio && index>-1) {
				this.jTabbedPaneBusquedasBarrio.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioBarrio() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasBarrio.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasBarrio.indexOfComponent(this.jPanelFK_IdCantonBarrio);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasBarrio.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.barrioConstantesFunciones.activarFK_IdCantonBarrio);
				this.jTabbedPaneBusquedasBarrio.setEnabledAt(index,this.barrioConstantesFunciones.activarFK_IdCantonBarrio);
			}

			index= this.jTabbedPaneBusquedasBarrio.indexOfComponent(this.jPanelFK_IdParroquiaBarrio);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasBarrio.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.barrioConstantesFunciones.activarFK_IdParroquiaBarrio);
				this.jTabbedPaneBusquedasBarrio.setEnabledAt(index,this.barrioConstantesFunciones.activarFK_IdParroquiaBarrio);
			}

			index= this.jTabbedPaneBusquedasBarrio.indexOfComponent(this.jPanelFK_IdProvinciaBarrio);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasBarrio.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.barrioConstantesFunciones.activarFK_IdProvinciaBarrio);
				this.jTabbedPaneBusquedasBarrio.setEnabledAt(index,this.barrioConstantesFunciones.activarFK_IdProvinciaBarrio);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaBarrio(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCanton")) {
			index= this.jTabbedPaneBusquedasBarrio.indexOfComponent(this.jPanelFK_IdCantonBarrio);

			this.jTabbedPaneBusquedasBarrio.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBarrio.getComponent(index);

			this.barrioConstantesFunciones.setResaltarFK_IdCantonBarrio(resaltar);

			jPanel.setBorder(this.barrioConstantesFunciones.resaltarFK_IdCantonBarrio);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdParroquia")) {
			index= this.jTabbedPaneBusquedasBarrio.indexOfComponent(this.jPanelFK_IdParroquiaBarrio);

			this.jTabbedPaneBusquedasBarrio.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBarrio.getComponent(index);

			this.barrioConstantesFunciones.setResaltarFK_IdParroquiaBarrio(resaltar);

			jPanel.setBorder(this.barrioConstantesFunciones.resaltarFK_IdParroquiaBarrio);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProvincia")) {
			index= this.jTabbedPaneBusquedasBarrio.indexOfComponent(this.jPanelFK_IdProvinciaBarrio);

			this.jTabbedPaneBusquedasBarrio.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBarrio.getComponent(index);

			this.barrioConstantesFunciones.setResaltarFK_IdProvinciaBarrio(resaltar);

			jPanel.setBorder(this.barrioConstantesFunciones.resaltarFK_IdProvinciaBarrio);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarBarrio.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioBarrio() throws Exception {

		if(this.jInternalFrameDetalleFormBarrio==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioBarrio();
		this.updateVisibilidadResaltarControlesFormularioBarrio();
		this.updateHabilitarResaltarControlesFormularioBarrio();
		
	}
	
	public void updateBorderResaltarControlesFormularioBarrio() throws Exception {
		if(this.jInternalFrameDetalleFormBarrio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.barrioConstantesFunciones.resaltaridBarrio!=null && this.jInternalFrameDetalleFormBarrio!=null) {this.jInternalFrameDetalleFormBarrio.jLabelidBarrio.setBorder(this.barrioConstantesFunciones.resaltaridBarrio);}
		if(this.barrioConstantesFunciones.resaltarid_provinciaBarrio!=null && this.jInternalFrameDetalleFormBarrio!=null) {this.jInternalFrameDetalleFormBarrio.jComboBoxid_provinciaBarrio.setBorder(this.barrioConstantesFunciones.resaltarid_provinciaBarrio);}
		if(this.barrioConstantesFunciones.resaltarid_cantonBarrio!=null && this.jInternalFrameDetalleFormBarrio!=null) {this.jInternalFrameDetalleFormBarrio.jComboBoxid_cantonBarrio.setBorder(this.barrioConstantesFunciones.resaltarid_cantonBarrio);}
		if(this.barrioConstantesFunciones.resaltarid_parroquiaBarrio!=null && this.jInternalFrameDetalleFormBarrio!=null) {this.jInternalFrameDetalleFormBarrio.jComboBoxid_parroquiaBarrio.setBorder(this.barrioConstantesFunciones.resaltarid_parroquiaBarrio);}
		if(this.barrioConstantesFunciones.resaltarcodigoBarrio!=null && this.jInternalFrameDetalleFormBarrio!=null) {this.jInternalFrameDetalleFormBarrio.jTextFieldcodigoBarrio.setBorder(this.barrioConstantesFunciones.resaltarcodigoBarrio);}
		if(this.barrioConstantesFunciones.resaltarnombreBarrio!=null && this.jInternalFrameDetalleFormBarrio!=null) {this.jInternalFrameDetalleFormBarrio.jTextAreanombreBarrio.setBorder(this.barrioConstantesFunciones.resaltarnombreBarrio);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioBarrio() throws Exception {		
		if(this.jInternalFrameDetalleFormBarrio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormBarrio!=null) {
	
		//this.jInternalFrameDetalleFormBarrio.jLabelidBarrio.setVisible(this.barrioConstantesFunciones.mostraridBarrio);
		this.jInternalFrameDetalleFormBarrio.jPanelidBarrio.setVisible(this.barrioConstantesFunciones.mostraridBarrio);
		//this.jInternalFrameDetalleFormBarrio.jComboBoxid_provinciaBarrio.setVisible(this.barrioConstantesFunciones.mostrarid_provinciaBarrio);
		this.jInternalFrameDetalleFormBarrio.jPanelid_provinciaBarrio.setVisible(this.barrioConstantesFunciones.mostrarid_provinciaBarrio);
		//this.jInternalFrameDetalleFormBarrio.jComboBoxid_cantonBarrio.setVisible(this.barrioConstantesFunciones.mostrarid_cantonBarrio);
		this.jInternalFrameDetalleFormBarrio.jPanelid_cantonBarrio.setVisible(this.barrioConstantesFunciones.mostrarid_cantonBarrio);
		//this.jInternalFrameDetalleFormBarrio.jComboBoxid_parroquiaBarrio.setVisible(this.barrioConstantesFunciones.mostrarid_parroquiaBarrio);
		this.jInternalFrameDetalleFormBarrio.jPanelid_parroquiaBarrio.setVisible(this.barrioConstantesFunciones.mostrarid_parroquiaBarrio);
		//this.jInternalFrameDetalleFormBarrio.jTextFieldcodigoBarrio.setVisible(this.barrioConstantesFunciones.mostrarcodigoBarrio);
		this.jInternalFrameDetalleFormBarrio.jPanelcodigoBarrio.setVisible(this.barrioConstantesFunciones.mostrarcodigoBarrio);
		//this.jInternalFrameDetalleFormBarrio.jTextAreanombreBarrio.setVisible(this.barrioConstantesFunciones.mostrarnombreBarrio);
		this.jInternalFrameDetalleFormBarrio.jPanelnombreBarrio.setVisible(this.barrioConstantesFunciones.mostrarnombreBarrio);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioBarrio() throws Exception {
		if(this.jInternalFrameDetalleFormBarrio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormBarrio!=null) {
	
		this.jInternalFrameDetalleFormBarrio.jLabelidBarrio.setEnabled(this.barrioConstantesFunciones.activaridBarrio);
		this.jInternalFrameDetalleFormBarrio.jComboBoxid_provinciaBarrio.setEnabled(this.barrioConstantesFunciones.activarid_provinciaBarrio);
		this.jInternalFrameDetalleFormBarrio.jComboBoxid_cantonBarrio.setEnabled(this.barrioConstantesFunciones.activarid_cantonBarrio);
		this.jInternalFrameDetalleFormBarrio.jComboBoxid_parroquiaBarrio.setEnabled(this.barrioConstantesFunciones.activarid_parroquiaBarrio);
		this.jInternalFrameDetalleFormBarrio.jTextFieldcodigoBarrio.setEnabled(this.barrioConstantesFunciones.activarcodigoBarrio);
		this.jInternalFrameDetalleFormBarrio.jTextAreanombreBarrio.setEnabled(this.barrioConstantesFunciones.activarnombreBarrio);
		}
	}
	
		
}